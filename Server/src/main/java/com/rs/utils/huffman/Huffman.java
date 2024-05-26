package com.rs.utils.huffman;

import com.rs.cache.Cache;
import com.rs.io.InputStream;
import com.rs.io.OutputStream;
import com.rs.utils.StringUtilities;

public final class Huffman {

	// TODO sort this shit out

	private static int[] huffmanAlgorithm1;
	private static byte[] huffmanAlgorithm2;
	private static int[] huffmanAlgorithm3;

	public static final void init() {
		byte[] huffmanFile = Cache.STORE.getIndexes()[10].getFile(Cache.STORE.getIndexes()[10].getArchiveId("huffman"));
		int fileLength = huffmanFile.length;
		huffmanAlgorithm2 = huffmanFile;
		huffmanAlgorithm1 = new int[fileLength];
		huffmanAlgorithm3 = new int[8];
		int[] is = new int[33];
		int i_4_ = 0;
		for (int i_5_ = 0; (fileLength ^ 0xffffffff) < (i_5_ ^ 0xffffffff); i_5_++) {
			int i_6_ = huffmanFile[i_5_];
			if (i_6_ != 0) {
				int i_7_ = 1 << 32 - i_6_;
				int i_8_ = is[i_6_];
				huffmanAlgorithm1[i_5_] = i_8_;
				int i_9_;
				if ((i_8_ & i_7_) == 0) {
					for (int i_10_ = -1 + i_6_; i_10_ >= 1; i_10_--) {
						int i_11_ = is[i_10_];
						if (i_8_ != i_11_)
							break;
						int i_12_ = 1 << 32 + -i_10_;
						if ((i_12_ & i_11_ ^ 0xffffffff) != -1) {
							is[i_10_] = is[-1 + i_10_];
							break;
						}
						is[i_10_] = (i_11_ | i_12_);
					}
					i_9_ = i_7_ | i_8_;
				} else
					i_9_ = is[i_6_ + -1];
				is[i_6_] = i_9_;
				for (int i_13_ = 1 + i_6_; i_13_ <= 32; i_13_++) {
					if (i_8_ == is[i_13_])
						is[i_13_] = i_9_;
				}
				int i_14_ = 0;
				for (int i_15_ = 0; (i_6_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
					int i_16_ = -2147483648 >>> i_15_;
					if ((i_8_ & i_16_ ^ 0xffffffff) == -1)
						i_14_++;
					else {
						if (huffmanAlgorithm3[i_14_] == 0)
							huffmanAlgorithm3[i_14_] = i_4_;
						i_14_ = huffmanAlgorithm3[i_14_];
					}
					if ((huffmanAlgorithm3.length ^ 0xffffffff) >= (i_14_ ^ 0xffffffff)) {
						int[] is_17_ = new int[huffmanAlgorithm3.length * 2];
						for (int i_18_ = 0; i_18_ < huffmanAlgorithm3.length; i_18_++)
							is_17_[i_18_] = huffmanAlgorithm3[i_18_];
						huffmanAlgorithm3 = is_17_;
					}
					i_16_ >>>= 1;
				}
				huffmanAlgorithm3[i_14_] = i_5_ ^ 0xffffffff;
				if ((i_4_ ^ 0xffffffff) >= (i_14_ ^ 0xffffffff))
					i_4_ = 1 + i_14_;
			}
		}
	}

	public static int encodeString(OutputStream stream, String string) {
		try {
			int startpos = stream.getOffset();
			byte[] strdata = new byte[string.length()];
			StringUtilities.encodeString(strdata, 0, string, 0, string.length());
			stream.writeSmart(strdata.length);
			stream.expand(stream.getOffset() + strdata.length * 2);
			stream.skip(huffmanEncode(stream.getBuffer(), stream.getOffset(), strdata, 0, strdata.length));
			return stream.getOffset() - startpos;
		} catch (Throwable e) {
			return -1;
		}
	}

	public static final String decodeString(int maxlength, InputStream stream) {
		try {
			int strlen = stream.readUnsignedSmart();
			if (strlen > maxlength)
				strlen = maxlength;
			byte[] strbuff = new byte[strlen];
			stream.skip(huffmanDecode(stream.getBuffer(), stream.getOffset(), strbuff, 0, strlen));
			String message = StringUtilities.decodeString(strbuff, 0, strlen);
			return message;
		} catch (Throwable e) {
			return "";
		}
	}

	private static final int huffmanEncode(byte[] buff, int buffoffset, byte[] str, int stroffset, int strlength) {
		int i = 0;
		strlength += stroffset;
		int i_19_ = buffoffset << 309760323;
		for (/**/; stroffset < strlength; stroffset++) {
			int i_20_ = 0xff & str[stroffset];
			int i_21_ = huffmanAlgorithm1[i_20_];
			int i_22_ = huffmanAlgorithm2[i_20_];
			if (i_22_ == 0)
				throw new RuntimeException("No codeword for data value " + i_20_);
			int i_23_ = i_19_ >> -976077821;
			int i_24_ = 0x7 & i_19_;
			i &= -i_24_ >> -1041773793;
			int i_25_ = (-1 + i_24_ - -i_22_ >> -2003626461) + i_23_;
			i_19_ += i_22_;
			i_24_ += 24;
			buff[i_23_] = (byte) (i = (i | (i_21_ >>> i_24_)));
			if (i_25_ > i_23_) {
				i_24_ -= 8;
				i_23_++;
				buff[i_23_] = (byte) (i = i_21_ >>> i_24_);
				if ((i_23_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff)) {
					i_24_ -= 8;
					i_23_++;
					buff[i_23_] = (byte) (i = i_21_ >>> i_24_);
					if ((i_23_ ^ 0xffffffff) > (i_25_ ^ 0xffffffff)) {
						i_24_ -= 8;
						i_23_++;
						buff[i_23_] = (byte) (i = i_21_ >>> i_24_);
						if ((i_25_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff)) {
							i_23_++;
							i_24_ -= 8;
							buff[i_23_] = (byte) (i = i_21_ << -i_24_);
						}
					}
				}
			}
		}
		return -buffoffset + (7 + i_19_ >> 1737794179);
	}

	private static final int huffmanDecode(byte[] buff, int buffoffset, byte[] strbuff, int strbuffoffset, int strbufflength) {
		if ((strbufflength ^ 0xffffffff) == -1)
			return 0;
		int i = 0;
		strbufflength += strbuffoffset;
		int i_1_ = buffoffset;
		for (;;) {
			byte i_2_ = buff[i_1_];
			if ((i_2_ ^ 0xffffffff) <= -1)
				i++;
			else
				i = huffmanAlgorithm3[i];
			int i_3_;
			if ((i_3_ = huffmanAlgorithm3[i]) < 0) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if (strbufflength <= strbuffoffset)
					break;
				i = 0;
			}
			if ((i_2_ & 0x40 ^ 0xffffffff) == -1)
				i++;
			else
				i = huffmanAlgorithm3[i];
			if (((i_3_ = huffmanAlgorithm3[i]) ^ 0xffffffff) > -1) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if (strbufflength <= strbuffoffset)
					break;
				i = 0;
			}
			if ((0x20 & i_2_ ^ 0xffffffff) != -1)
				i = huffmanAlgorithm3[i];
			else
				i++;
			if ((i_3_ = huffmanAlgorithm3[i]) < 0) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if (strbufflength <= strbuffoffset)
					break;
				i = 0;
			}
			if ((0x10 & i_2_ ^ 0xffffffff) != -1)
				i = huffmanAlgorithm3[i];
			else
				i++;
			if ((i_3_ = huffmanAlgorithm3[i]) < 0) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if ((strbuffoffset ^ 0xffffffff) <= (strbufflength ^ 0xffffffff))
					break;
				i = 0;
			}
			if ((i_2_ & 0x8) == 0)
				i++;
			else
				i = huffmanAlgorithm3[i];
			if ((i_3_ = huffmanAlgorithm3[i]) < 0) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if (strbuffoffset >= strbufflength)
					break;
				i = 0;
			}
			if ((0x4 & i_2_ ^ 0xffffffff) != -1)
				i = huffmanAlgorithm3[i];
			else
				i++;
			if (((i_3_ = huffmanAlgorithm3[i]) ^ 0xffffffff) > -1) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if (strbuffoffset >= strbufflength)
					break;
				i = 0;
			}
			if ((0x2 & i_2_) != 0)
				i = huffmanAlgorithm3[i];
			else
				i++;
			if (((i_3_ = huffmanAlgorithm3[i]) ^ 0xffffffff) > -1) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if (strbufflength <= strbuffoffset)
					break;
				i = 0;
			}
			if ((0x1 & i_2_ ^ 0xffffffff) != -1)
				i = huffmanAlgorithm3[i];
			else
				i++;
			if ((i_3_ = huffmanAlgorithm3[i]) < 0) {
				strbuff[strbuffoffset++] = (byte) (i_3_ ^ 0xffffffff);
				if ((strbuffoffset ^ 0xffffffff) <= (strbufflength ^ 0xffffffff))
					break;
				i = 0;
			}
			i_1_++;
		}
		return -buffoffset + i_1_ - -1;
	}

}

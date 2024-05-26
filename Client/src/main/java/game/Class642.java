package game;

/* Class642 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public abstract class Class642 {
	String aString8296;
	int anInt8297;

	public abstract Socket method7605() throws IOException;

	public abstract Socket method7606(int i) throws IOException;

	Socket method7607(int i) throws IOException {
		return new Socket(((Class642) this).aString8296, -307100413 * ((Class642) this).anInt8297);
	}

	public abstract Socket method7608() throws IOException;

	Class642() {
		/* empty */
	}

	public static String method7609(byte[] is, int i, int i_0_, int i_1_) {
		char[] cs = new char[i_0_];
		int i_2_ = 0;
		int i_3_ = i;
		int i_4_ = i_0_ + i;
		while (i_3_ < i_4_) {
			int i_5_ = is[i_3_++] & 0xff;
			int i_6_;
			if (i_5_ < 128) {
				if (i_5_ == 0)
					i_6_ = 65533;
				else
					i_6_ = i_5_;
			} else if (i_5_ < 192)
				i_6_ = 65533;
			else if (i_5_ < 224) {
				if (i_3_ < i_4_ && 128 == (is[i_3_] & 0xc0)) {
					i_6_ = (i_5_ & 0x1f) << 6 | is[i_3_++] & 0x3f;
					if (i_6_ < 128)
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else if (i_5_ < 240) {
				if (i_3_ + 1 < i_4_ && (is[i_3_] & 0xc0) == 128 && (is[1 + i_3_] & 0xc0) == 128) {
					i_6_ = ((i_5_ & 0xf) << 12 | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
					if (i_6_ < 2048)
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else if (i_5_ < 248) {
				if (i_3_ + 2 < i_4_ && 128 == (is[i_3_] & 0xc0) && 128 == (is[i_3_ + 1] & 0xc0) && (is[i_3_ + 2] & 0xc0) == 128) {
					i_6_ = ((i_5_ & 0x7) << 18 | (is[i_3_++] & 0x3f) << 12 | (is[i_3_++] & 0x3f) << 6 | is[i_3_++] & 0x3f);
					if (i_6_ < 65536 || i_6_ > 1114111)
						i_6_ = 65533;
					else
						i_6_ = 65533;
				} else
					i_6_ = 65533;
			} else
				i_6_ = 65533;
			cs[i_2_++] = (char) i_6_;
		}
		return new String(cs, 0, i_2_);
	}

	static final void method7610(Cs2Executor class441, byte i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -10465);
		Class83 class83 = Class534.aClass83Array5975[i_7_ >> 16];
		Class167_Sub1.method10037(class73, class83, class441, -1718435171);
	}

	static final void method7611(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class408.aBool4780 ? 1 : 0;
	}
}

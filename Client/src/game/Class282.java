package game;

/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class282 {
	static Object anObject3222 = new Object();
	static Random aRandom3223;
	public static Class248 aClass248_3224;

	public static int method3801(int i, int i_0_) {
		int i_1_ = 0;
		for (/**/; i_0_ > 0; i_0_--) {
			i_1_ = i_1_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_1_;
	}

	public static int method3802(int i) {
		int i_2_ = i >>> 1;
		i_2_ |= i_2_ >>> 1;
		i_2_ |= i_2_ >>> 2;
		i_2_ |= i_2_ >>> 4;
		i_2_ |= i_2_ >>> 8;
		i_2_ |= i_2_ >>> 16;
		return i & (i_2_ ^ 0xffffffff);
	}

	static int method3803(int i, int i_3_) {
		int i_4_ = i >> 31 & i_3_ - 1;
		return (i + (i >>> 31)) % i_3_ + i_4_;
	}

	public static int method3804(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	public static int method3805(int i, int i_5_) {
		int i_6_ = 1;
		for (/**/; i_5_ > 1; i_5_ >>= 1) {
			if (0 != (i_5_ & 0x1))
				i_6_ *= i;
			i *= i;
		}
		if (i_5_ == 1)
			return i * i_6_;
		return i_6_;
	}

	public static int method3806(int i) {
		int i_7_ = i >>> 1;
		i_7_ |= i_7_ >>> 1;
		i_7_ |= i_7_ >>> 2;
		i_7_ |= i_7_ >>> 4;
		i_7_ |= i_7_ >>> 8;
		i_7_ |= i_7_ >>> 16;
		return i & (i_7_ ^ 0xffffffff);
	}

	public static int method3807(int i) {
		int i_8_ = i >>> 1;
		i_8_ |= i_8_ >>> 1;
		i_8_ |= i_8_ >>> 2;
		i_8_ |= i_8_ >>> 4;
		i_8_ |= i_8_ >>> 8;
		i_8_ |= i_8_ >>> 16;
		return i & (i_8_ ^ 0xffffffff);
	}

	public static boolean method3808(int i) {
		return (i & -i) == i;
	}

	public static int method3809(int i) {
		int i_9_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_9_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_9_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_9_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_9_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_9_++;
		}
		return i_9_ + i;
	}

	public static int method3810(int i) {
		int i_10_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_10_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_10_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_10_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_10_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_10_++;
		}
		return i_10_ + i;
	}

	public static int method3811(int i) {
		int i_11_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_11_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_11_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_11_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_11_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_11_++;
		}
		return i_11_ + i;
	}

	Class282() throws Throwable {
		throw new Error();
	}

	public static int method3812(int i, int i_12_) {
		int i_13_ = 0;
		for (/**/; i_12_ > 0; i_12_--) {
			i_13_ = i_13_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_13_;
	}

	static int method3813(int i, int i_14_) {
		int i_15_ = i >> 31 & i_14_ - 1;
		return (i + (i >>> 31)) % i_14_ + i_15_;
	}

	public static int method3814(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	static int method3815(int i, int i_16_) {
		int i_17_ = i >> 31 & i_16_ - 1;
		return (i + (i >>> 31)) % i_16_ + i_17_;
	}

	static int method3816(int i, int i_18_) {
		int i_19_ = i >> 31 & i_18_ - 1;
		return (i + (i >>> 31)) % i_18_ + i_19_;
	}

	static int method3817(int i, int i_20_) {
		int i_21_ = i >> 31 & i_20_ - 1;
		return (i + (i >>> 31)) % i_20_ + i_21_;
	}

	public static final int method3818(Class639_Sub16 class639_sub16, byte[] is, int i, int i_22_, int i_23_, int i_24_, Class463 class463, Class463 class463_25_, int i_26_) {
		int i_27_ = 0;
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		int i_28_ = -1;
		for (;;) {
			int i_29_ = class572_sub15.readSmart2(-1895863259);
			if (0 == i_29_)
				break;
			i_28_ += i_29_;
			int i_30_ = 0;
			boolean bool = false;
			for (;;) {
				if (bool) {
					int i_31_ = class572_sub15.readUnsignedSmart(-1455514695);
					if (0 == i_31_)
						break;
					class572_sub15.readUnsignedByte(-11109041);
				} else {
					int i_32_ = class572_sub15.readUnsignedSmart(-604222240);
					if (0 == i_32_)
						break;
					i_30_ += i_32_ - 1;
					int i_33_ = i_30_ & 0x3f;
					int i_34_ = i_30_ >> 6 & 0x3f;
					int i_35_ = class572_sub15.readUnsignedByte(891053303) >> 2;
					int i_36_ = i_35_ & 0x3;
					i_35_ >>= 2;
					int i_37_ = i_34_ + i;
					int i_38_ = i_22_ + i_33_;
					ObjectDefinitions class509 = ((ObjectDefinitions) class639_sub16.getDefinition(i_28_, -1445736680));
					int i_39_;
					int i_40_;
					if (0 == (i_36_ & 0x1)) {
						i_39_ = class509.sizeX * -876498849;
						i_40_ = class509.sizeY * 1922784011;
					} else {
						i_39_ = class509.sizeY * 1922784011;
						i_40_ = class509.sizeX * -876498849;
					}
					if (i_37_ < i_23_ && i_38_ < i_24_ && i_39_ + i_37_ >= 0 && i_38_ + i_40_ >= 0) {
						if ((Class516.aClass516_5741.anInt5742 * 1870735441 != i_35_) || Class213.aClass572_Sub24_2463.aClass665_Sub28_9218.method9109(-477232025) != 0 || -1262171129 * class509.anInt5627 != 0 || 1 == class509.anInt5626 * -665518601 || class509.aBool5658) {
							if (!class509.method6043(class463_25_, (byte) 0)) {
								class463.anInt5233 = 282426451 * i_28_;
								i_27_++;
							}
							bool = true;
						}
					}
				}
			}
		}
		return i_27_;
	}

	public static boolean method3819(char c, byte i) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}
}

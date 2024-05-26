package game;

/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class53 implements Interface31 {
	Class54 this$0;

	Class53(Class54 class54) {
		((Class53) this).this$0 = class54;
	}

	public float method152(byte i) {
		return ((float) Class213.aClass572_Sub24_2463.aClass665_Sub15_9244.method8970(660014728) / 255.0F);
	}

	public float method153() {
		return ((float) Class213.aClass572_Sub24_2463.aClass665_Sub15_9244.method8970(660014728) / 255.0F);
	}

	static void method911(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = OutgoingPacket.method4053(i_0_, i_1_, i_2_, 0 != i_3_, -1883981092);
	}

	static final void method912(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_5_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_6_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_7_ = (((Cs2Executor) class441).intStack[3 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		i_4_ += i_5_ << 14;
		i_4_ += i_6_ << 28;
		i_4_ += i_7_;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_4_;
	}

	static final void method913(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -915372029;
		int i_8_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_9_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_10_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_11_ = (((Cs2Executor) class441).intStack[3 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_12_ = (((Cs2Executor) class441).intStack[4 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (i_9_ - i_8_) * (i_12_ - i_10_) / (i_11_ - i_10_) + i_8_;
	}

	static final void method914(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 380087508;
		Class35.method782((short) 582);
		Class665_Sub18.method9023((byte) -48);
		Class133_Sub22.anInt10362 = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]) * 404894929;
		Class165.anInt2049 = (1710545017 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]));
		Class36.anInt386 = (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * 481335241;
		Class276.anInt2927 = (1962693385 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]));
		Class48.anInt472 = (((Cs2Executor) class441).intStack[4 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * 473938445;
		Class398.anInt4718 = (-1316370637 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 5]));
		Class346.anInt4385 = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 6]) * -634489797);
		Class307.anInt3549 = (1054533445 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 7]));
		Class121.anInt1480 = ((((Cs2Executor) class441).intStack[8 + ((Cs2Executor) class441).intStackPtr * 1369304407]) * 1047891063);
		Class390.anInt4657 = (((Cs2Executor) class441).intStack[9 + ((Cs2Executor) class441).intStackPtr * 1369304407]) * 557519753;
		Class484.anInt5419 = ((((Cs2Executor) class441).intStack[10 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * 1826770675);
		Class375.anInt4564 = (-324755773 * (((Cs2Executor) class441).intStack[11 + ((Cs2Executor) class441).intStackPtr * 1369304407]));
		Class582.aClass248_7725.method3383(Class48.anInt472 * -922999611, 9812115);
		Class582.aClass248_7725.method3383(Class398.anInt4718 * -230978565, -1590096823);
		Class582.aClass248_7725.method3383(Class346.anInt4385 * -459782925, 1106529093);
		Class582.aClass248_7725.method3383(893031309 * Class307.anInt3549, -992352239);
		Class582.aClass248_7725.method3383(-1176761017 * Class121.anInt1480, -100801102);
		Class582.aClass248_7725.method3383(Class375.anInt4564 * -1586069013, -181169779);
		Class88.aClass248_1226.method3383(Class375.anInt4564 * -1586069013, -166639875);
		Class486.aClass161_5448 = null;
		Class255_Sub1.aClass161_8947 = null;
		Class639_Sub14.aClass161_9555 = null;
		Class54.aClass161_523 = null;
		Class191.aClass161_2294 = null;
		Class195.aClass161_2346 = null;
		Class17.aClass161_137 = null;
		Class654.aClass161_8404 = null;
		Class25.aBool191 = true;
	}

	static final void method915(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]);
		String string_13_ = (String) (((Cs2Executor) class441).objectStack[1 + ((Cs2Executor) class441).objectStackPtr * 1628307581]);
		Class665.method7868(string, string_13_, -877221534);
	}

	static void method916(int i, int i_14_, int[] is, int[] is_15_, float[] fs, float[] fs_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_) {
		int i_24_ = i * i_18_ + i_17_;
		int i_25_ = i_19_ + i_14_ * i_20_;
		int i_26_ = i - i_21_;
		int i_27_ = i_14_ - i_21_;
		if (null == is) {
			for (int i_28_ = 0; i_28_ < i_22_; i_28_++) {
				int i_29_ = i_24_ + i_21_;
				while (i_24_ < i_29_)
					fs_16_[i_25_++] = fs[i_24_++];
				i_24_ += i_26_;
				i_25_ += i_27_;
			}
		} else if (fs == null) {
			for (int i_30_ = 0; i_30_ < i_22_; i_30_++) {
				int i_31_ = i_24_ + i_21_;
				while (i_24_ < i_31_)
					is_15_[i_25_++] = is[i_24_++];
				i_24_ += i_26_;
				i_25_ += i_27_;
			}
		} else {
			for (int i_32_ = 0; i_32_ < i_22_; i_32_++) {
				int i_33_ = i_24_ + i_21_;
				while (i_24_ < i_33_) {
					is_15_[i_25_] = is[i_24_];
					fs_16_[i_25_++] = fs[i_24_++];
				}
				i_24_ += i_26_;
				i_25_ += i_27_;
			}
		}
	}

	static Class572_Sub12_Sub5 decodeMap(RSByteBuffer class572_sub15, int i, int i_34_) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = new Class572_Sub12_Sub5(i, class572_sub15.readString(1295706626), class572_sub15.readString(1295706626), class572_sub15.readInt(629032666), class572_sub15.readInt(1917405109), (class572_sub15.readUnsignedByte(137368825) == 1), class572_sub15.readUnsignedByte(1921065850), class572_sub15.readUnsignedByte(508916645));
		int i_35_ = class572_sub15.readUnsignedByte(108454788);
		for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
			((Class572_Sub12_Sub5) class572_sub12_sub5).aClass675_11322.method7940(new Class572_Sub18(class572_sub15.readUnsignedByte(486686672), class572_sub15.readUnsignedShort(647518597), class572_sub15.readUnsignedShort(647518597), class572_sub15.readUnsignedShort(647518597), class572_sub15.readUnsignedShort(647518597), class572_sub15.readUnsignedShort(647518597), class572_sub15.readUnsignedShort(647518597), class572_sub15.readUnsignedShort(647518597), class572_sub15.readUnsignedShort(647518597)), -1802734914);
		class572_sub12_sub5.method10291((byte) -105);
		return class572_sub12_sub5;
	}
}

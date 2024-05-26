package game;

/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class218 {
	int anInt2507;
	Class248 aClass248_2508;
	Class227[] aClass227Array2509;
	static final int anInt2510 = 0;
	static long aLong2511;

	public boolean method3086() {
		return -1 != -1448026695 * ((Class218) this).anInt2507;
	}

	Class227 method3087(int i, int i_0_, int i_1_) {
		if (((Class218) this).anInt2507 * -1448026695 == -1)
			return new Class227(false, new Class210[0]);
		Class210 class210 = new Class210(-1448026695 * ((Class218) this).anInt2507, i, i_0_);
		return new Class227(false, new Class210[] { class210 });
	}

	public Class210[] method3088(int i, byte i_2_) {
		if (i < 0 || i >= ((Class218) this).aClass227Array2509.length)
			return (((Class227) method3087(0, 0, 1052979571)).aClass210Array2617);
		Class227 class227 = ((Class218) this).aClass227Array2509[i];
		if (!((Class227) class227).aBool2616 || ((Class227) class227).aClass210Array2617.length <= 1)
			return ((Class227) class227).aClass210Array2617;
		int i_3_ = -1 == -1448026695 * ((Class218) this).anInt2507 ? 0 : 1;
		Random random = new Random();
		Class210[] class210s = new Class210[((Class227) class227).aClass210Array2617.length];
		System.arraycopy(((Class227) class227).aClass210Array2617, 0, class210s, 0, class210s.length);
		for (int i_4_ = i_3_; i_4_ < class210s.length; i_4_++) {
			int i_5_ = (Class628.method7503(random, class210s.length - i_3_, 1093065111) + i_3_);
			Class210 class210 = ((Class227) class227).aClass210Array2617[i_4_];
			class210s[i_4_] = class210s[i_5_];
			class210s[i_5_] = class210;
		}
		return class210s;
	}

	public boolean method3089(int i) {
		return -1 != -1448026695 * ((Class218) this).anInt2507;
	}

	public Class213 method3090(int i, byte i_6_) {
		byte[] is = ((Class218) this).aClass248_2508.getFile(i, 0, 46680370);
		Class213 class213 = new Class213();
		class213.method3067(new RSByteBuffer(is), -60817615);
		return class213;
	}

	public Class218(Class437 class437, Class435 class435, Class248 class248) {
		((Class218) this).aClass248_2508 = class248;
		RSByteBuffer class572_sub15 = new RSByteBuffer(((Class218) this).aClass248_2508.getFile(0, 0, 268942263));
		int i = ((class572_sub15.b == null || class572_sub15.b.length < 1) ? -1 : class572_sub15.readUnsignedByte(1589143108));
		if (i < 4) {
			((Class218) this).aClass227Array2509 = new Class227[0];
			((Class218) this).anInt2507 = 1072686967;
		} else {
			int i_7_ = class572_sub15.readUnsignedByte(1009224706);
			Class310[] class310s = Class572_Sub19.method8594(-1256259902);
			boolean bool = true;
			if (i_7_ != class310s.length)
				bool = false;
			else {
				for (int i_8_ = 0; i_8_ < class310s.length; i_8_++) {
					int i_9_ = class572_sub15.readUnsignedByte(322589567);
					if (i_9_ != class310s[i_8_].anInt3662 * -1358969145) {
						bool = false;
						break;
					}
				}
			}
			if (bool) {
				int i_10_ = class572_sub15.readUnsignedByte(736773767);
				int i_11_ = class572_sub15.readUnsignedByte(248404174);
				int i_12_;
				int i_13_;
				if (i > 2) {
					((Class218) this).anInt2507 = class572_sub15.readShort(-710976385) * -1072686967;
					i_12_ = class572_sub15.read24BitInt(1140925462);
					i_13_ = class572_sub15.readUnsignedShort(647518597);
				} else {
					((Class218) this).anInt2507 = 1072686967;
					i_12_ = 0;
					i_13_ = 0;
				}
				((Class218) this).aClass227Array2509 = new Class227[i_11_ + 1];
				for (int i_14_ = 0; i_14_ < i_10_; i_14_++) {
					int i_15_ = class572_sub15.readUnsignedByte(2129261806);
					boolean bool_16_ = class572_sub15.readUnsignedByte(1691756182) == 1;
					int i_17_ = class572_sub15.readUnsignedShort(647518597);
					Class210[] class210s;
					if (-1448026695 * ((Class218) this).anInt2507 == -1) {
						class210s = new Class210[i_17_];
						for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
							int i_19_ = class572_sub15.readUnsignedShort(647518597);
							int i_20_ = class572_sub15.read24BitInt(1140925462);
							int i_21_ = class572_sub15.readUnsignedShort(647518597);
							class210s[i_18_] = new Class210(i_19_, i_20_, i_21_);
						}
						((Class218) this).aClass227Array2509[i_15_] = new Class227(bool_16_, class210s);
					} else {
						class210s = new Class210[1 + i_17_];
						class210s[0] = new Class210((-1448026695 * ((Class218) this).anInt2507), i_12_, i_13_);
						for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
							int i_23_ = class572_sub15.readUnsignedShort(647518597);
							int i_24_ = class572_sub15.read24BitInt(1140925462);
							int i_25_ = class572_sub15.readUnsignedShort(647518597);
							class210s[1 + i_22_] = new Class210(i_23_, i_24_, i_25_);
						}
					}
					((Class218) this).aClass227Array2509[i_15_] = new Class227(bool_16_, class210s);
				}
				for (int i_26_ = 0; i_26_ < i_11_ + 1; i_26_++) {
					if (((Class218) this).aClass227Array2509[i_26_] == null)
						((Class218) this).aClass227Array2509[i_26_] = method3087(i_12_, i_13_, 1052979571);
				}
			} else {
				((Class218) this).aClass227Array2509 = new Class227[0];
				((Class218) this).anInt2507 = 1072686967;
			}
		}
	}

	static final void method3091(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		int i_27_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (InterfaceDefinitions.anInt877 * 109115205 == i_27_ || i_27_ == InterfaceDefinitions.anInt838 * 779345893 || 2399311 * InterfaceDefinitions.anInt754 == i_27_ || 44897211 * InterfaceDefinitions.anInt726 == i_27_)
			class73.anInt723 = i_27_ * -102107729;
	}

	static final void method3092(Cs2Executor class441, int i) {
		int i_28_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class221.aClass49_2607.method854(i_28_, 1493492562).method2098((short) 15065);
	}
}

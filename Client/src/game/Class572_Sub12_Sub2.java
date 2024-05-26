package game;

/* Class572_Sub12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub2 extends Class572_Sub12 implements Interface17, Interface73 {
	static boolean[] aBoolArray11253;
	Class676 aClass676_11254;
	public static String aString11255;

	void method10224(RSByteBuffer class572_sub15, int i, short i_0_) {
		if (249 == i) {
			int i_1_ = class572_sub15.readUnsignedByte(1409491850);
			if (null == ((Class572_Sub12_Sub2) this).aClass676_11254) {
				int i_2_ = HashTable.nextPowerOfTwo(i_1_, 1161844974);
				((Class572_Sub12_Sub2) this).aClass676_11254 = new Class676(i_2_);
			}
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
				boolean bool = class572_sub15.readUnsignedByte(1017272339) == 1;
				int i_4_ = class572_sub15.read24BitInt(1140925462);
				Class572 class572;
				if (bool)
					class572 = new LinkableObject(class572_sub15.readString(1295706626));
				else
					class572 = new LinkableInt(class572_sub15.readInt(101393366));
				((Class572_Sub12_Sub2) this).aClass676_11254.put(class572, (long) i_4_);
			}
		}
	}

	public void method103() {
		/* empty */
	}

	public int method10225(int i, int i_5_) {
		if (((Class572_Sub12_Sub2) this).aClass676_11254 == null)
			return i_5_;
		LinkableInt class572_sub26 = (LinkableInt) ((Class572_Sub12_Sub2) this).aClass676_11254.get((long) i);
		if (class572_sub26 == null)
			return i_5_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public int method10226(int i, int i_6_, short i_7_) {
		if (((Class572_Sub12_Sub2) this).aClass676_11254 == null)
			return i_6_;
		LinkableInt class572_sub26 = (LinkableInt) ((Class572_Sub12_Sub2) this).aClass676_11254.get((long) i);
		if (class572_sub26 == null)
			return i_6_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public String method10227(int i, String string, int i_8_) {
		if (null == ((Class572_Sub12_Sub2) this).aClass676_11254)
			return string;
		LinkableObject class572_sub9 = (LinkableObject) ((Class572_Sub12_Sub2) this).aClass676_11254.get((long) i);
		if (class572_sub9 == null)
			return string;
		return (String) class572_sub9.anObject9081;
	}

	public void method468(int i, int i_9_) {
		/* empty */
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(851124230);
			if (i == 0)
				break;
			method10224(class572_sub15, i, (short) 841);
		}
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_10_ = class572_sub15.readUnsignedByte(876641098);
			if (i_10_ == 0)
				break;
			method10224(class572_sub15, i_10_, (short) 841);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(599200933);
			if (i == 0)
				break;
			method10224(class572_sub15, i, (short) 841);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1067536795);
			if (i == 0)
				break;
			method10224(class572_sub15, i, (short) 841);
		}
	}

	Class572_Sub12_Sub2() {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	public void method112() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	public void method469(int i) {
		/* empty */
	}

	public int method10228(int i, int i_11_) {
		if (((Class572_Sub12_Sub2) this).aClass676_11254 == null)
			return i_11_;
		LinkableInt class572_sub26 = (LinkableInt) ((Class572_Sub12_Sub2) this).aClass676_11254.get((long) i);
		if (class572_sub26 == null)
			return i_11_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	public int method10229(int i, int i_12_) {
		if (((Class572_Sub12_Sub2) this).aClass676_11254 == null)
			return i_12_;
		LinkableInt class572_sub26 = (LinkableInt) ((Class572_Sub12_Sub2) this).aClass676_11254.get((long) i);
		if (class572_sub26 == null)
			return i_12_;
		return -1945426987 * class572_sub26.anInt9258;
	}

	void method10230(RSByteBuffer class572_sub15, int i) {
		if (249 == i) {
			int i_13_ = class572_sub15.readUnsignedByte(585229258);
			if (null == ((Class572_Sub12_Sub2) this).aClass676_11254) {
				int i_14_ = HashTable.nextPowerOfTwo(i_13_, 1676925294);
				((Class572_Sub12_Sub2) this).aClass676_11254 = new Class676(i_14_);
			}
			for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
				boolean bool = class572_sub15.readUnsignedByte(437480752) == 1;
				int i_16_ = class572_sub15.read24BitInt(1140925462);
				Class572 class572;
				if (bool)
					class572 = new LinkableObject(class572_sub15.readString(1295706626));
				else
					class572 = new LinkableInt(class572_sub15.readInt(-418337148));
				((Class572_Sub12_Sub2) this).aClass676_11254.put(class572, (long) i_16_);
			}
		}
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2038997877);
			if (i == 0)
				break;
			method10224(class572_sub15, i, (short) 841);
		}
	}

	static void method10231(int i, String string, boolean bool, int i_17_) {
		Class202_Sub1.method9211((short) 10177);
		Class64.method1028(-81713216);
		Class490.method5849((byte) 25);
		Class498.method5943(i, string, bool, 1218989103);
		Class133_Sub20.aClass324_10261.method4134(-1301965861);
		Class133_Sub20.aClass324_10261.method4126(client.anInterface19_8776, (byte) -28);
		Class425.method5178(Class272_Sub2.aClass106_9517, (byte) 11);
		Class640.method7589(Class272_Sub2.aClass106_9517, Class582.aClass248_7725, 968609244);
		Class120.method2180(1879206078);
		Class272_Sub3.method8879(Class14.aClass161Array123, 1687378118);
		Class54.method987((byte) 109);
		Exception_Sub2.method10186(-1708929619);
		if (12 == 835742603 * client.anInt8580)
			Class463.method5478(9, -1848045854);
		else if (5 == client.anInt8580 * 835742603)
			Class463.method5478(7, 1099265537);
		else if (11 == 835742603 * client.anInt8580)
			Class463.method5478(3, 2099779078);
		else if (1 == client.anInt8580 * 835742603)
			Class463.method5478(18, 388103844);
		else if (client.anInt8580 * 835742603 == 17 || 835742603 * client.anInt8580 == 8)
			Class93.method1534(188913166);
		else if (6 == 835742603 * client.anInt8580)
			Class463.method5478(10, 989093800);
		else if (18 == client.anInt8580 * 835742603)
			Class272_Sub2.method8875(false, -1181848480);
	}

	static final void method10232(Cs2Executor class441, int i) {
		int i_18_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub29_9212.method7863(i_18_, 783989699);
	}

	static void method10233(Class572_Sub27 class572_sub27, int i, int i_19_, int i_20_, int i_21_, byte i_22_) {
		if (293216223 * ((Class572_Sub27) class572_sub27).anInt9284 != -1 || null != ((Class572_Sub27) class572_sub27).anIntArray9268) {
			int i_23_ = ((Class572_Sub27) class572_sub27).anInt9281 * -1790944615;
			if (0 == ((Class572_Sub27) class572_sub27).anInt9271 * 790463849 || Class213.aClass572_Sub24_2463.aClass665_Sub15_9244.method8970(660014728) == 0 || i != (((Class572_Sub27) class572_sub27).anInt9274 * -934594101)) {
				if (((Class572_Sub27) class572_sub27).aClass603_9285 != null) {
					((Class572_Sub27) class572_sub27).aClass603_9285.method7098(100, -1110366939);
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), 942005828);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
			} else {
				if (null != ((Class572_Sub27) class572_sub27).aClass603_9285 && (((Class572_Sub27) class572_sub27).aClass603_9285.method7129(-1197155054) == Class595.aClass595_7831 || (((Class572_Sub27) class572_sub27).aClass603_9285.method7129(1482675251) == Class595.aClass595_7830))) {
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -7267842);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
				if (((Class572_Sub27) class572_sub27).aClass603_9285 == null) {
					if (293216223 * ((Class572_Sub27) class572_sub27).anInt9284 >= 0) {
						int i_24_ = 256;
						int i_25_ = (int) ((float) (603635959 * ((Class572_Sub27) class572_sub27).anInt9264) + 0.5F * (float) ((431881733 * (((Class572_Sub27) class572_sub27).anInt9266)) - ((((Class572_Sub27) class572_sub27).anInt9264) * 603635959)));
						int i_26_ = (int) ((float) (-287796001 * ((Class572_Sub27) class572_sub27).anInt9265) + 0.5F * (float) (((((Class572_Sub27) class572_sub27).anInt9280) * 1046174887) - (-287796001 * (((Class572_Sub27) class572_sub27).anInt9265))));
						((Class572_Sub27) class572_sub27).aClass240_9273.aFloat2653 = (float) i_25_;
						((Class572_Sub27) class572_sub27).aClass240_9273.aFloat2657 = (float) i_26_;
						((Class572_Sub27) class572_sub27).aClass603_9285 = (Class344.audio.method935(Class124.aClass124_1496, class572_sub27, (((Class572_Sub27) class572_sub27).anInt9284 * 293216223), -1, 0, Class126.aClass126_1510.method2215(260741980), Class93.aClass93_1242, (float) ((((Class572_Sub27) class572_sub27).anInt9259) * 566071923), (float) ((((Class572_Sub27) class572_sub27).anInt9271) * 790463849), (((Class572_Sub27) class572_sub27).aClass240_9273), 0, i_24_, false, 290732355));
						if (null != (((Class572_Sub27) class572_sub27).aClass603_9285)) {
							float f = (float) i_23_ / 255.0F;
							((Class572_Sub27) class572_sub27).aClass603_9285.method7135(f, 150, -1414154185);
							((Class572_Sub27) class572_sub27).aClass603_9285.method7140(-83475615);
						}
					}
				} else {
					int i_27_ = (int) ((float) ((((Class572_Sub27) class572_sub27).anInt9264) * 603635959) + ((float) (431881733 * (((Class572_Sub27) class572_sub27).anInt9266) - 603635959 * (((Class572_Sub27) class572_sub27).anInt9264)) * 0.5F));
					int i_28_ = (int) ((float) ((((Class572_Sub27) class572_sub27).anInt9280) * 1046174887 - -287796001 * (((Class572_Sub27) class572_sub27).anInt9265)) * 0.5F + (float) ((((Class572_Sub27) class572_sub27).anInt9265) * -287796001));
					((Class572_Sub27) class572_sub27).aClass240_9273.aFloat2653 = (float) i_27_;
					((Class572_Sub27) class572_sub27).aClass240_9273.aFloat2657 = (float) i_28_;
				}
				if (((Class572_Sub27) class572_sub27).aClass603_9286 == null) {
					if ((null != ((Class572_Sub27) class572_sub27).anIntArray9268) && (((Class572_Sub27) class572_sub27).anInt9263 -= i_21_ * -1789772835) * -1173556107 <= 0) {
						int i_29_ = ((256 == -1639487049 * ((Class572_Sub27) class572_sub27).anInt9283 && (((Class572_Sub27) class572_sub27).anInt9282 * -566374039) == 256) ? 256 : ((int) (Math.random() * (double) ((-1639487049 * (((Class572_Sub27) class572_sub27).anInt9283)) - ((((Class572_Sub27) class572_sub27).anInt9282) * -566374039))) + -566374039 * ((Class572_Sub27) class572_sub27).anInt9282));
						int i_30_ = (int) (Math.random() * (double) (((Class572_Sub27) class572_sub27).anIntArray9268).length);
						int i_31_ = (int) ((float) (((Class572_Sub27) class572_sub27).anInt9264 * 603635959) + 0.5F * (float) ((((Class572_Sub27) class572_sub27).anInt9266) * 431881733 - ((((Class572_Sub27) class572_sub27).anInt9264) * 603635959)));
						int i_32_ = (int) (0.5F * (float) ((((Class572_Sub27) class572_sub27).anInt9280) * 1046174887 - (-287796001 * (((Class572_Sub27) class572_sub27).anInt9265))) + (float) (((Class572_Sub27) class572_sub27).anInt9265 * -287796001));
						((Class572_Sub27) class572_sub27).aClass240_9269.aFloat2653 = (float) i_31_;
						((Class572_Sub27) class572_sub27).aClass240_9269.aFloat2657 = (float) i_32_;
						((Class572_Sub27) class572_sub27).aClass603_9286 = (Class344.audio.method935(Class124.aClass124_1506, class572_sub27, (((Class572_Sub27) class572_sub27).anIntArray9268[i_30_]), 0, i_23_, Class126.aClass126_1517.method2215(-745359084), Class93.aClass93_1242, (float) ((((Class572_Sub27) class572_sub27).anInt9259) * 566071923), (float) ((((Class572_Sub27) class572_sub27).anInt9259) * 566071923 + (((Class572_Sub27) class572_sub27).anInt9271) * 790463849), (((Class572_Sub27) class572_sub27).aClass240_9269), 0, i_29_, false, 250310504));
						if (((Class572_Sub27) class572_sub27).aClass603_9286 != null)
							((Class572_Sub27) class572_sub27).aClass603_9286.method7140(-341900072);
						((Class572_Sub27) class572_sub27).anInt9263 = (((1045737381 * ((Class572_Sub27) class572_sub27).anInt9287) + (int) (Math.random() * (double) ((((Class572_Sub27) class572_sub27).anInt9288) * 111819989 - (1045737381 * (((Class572_Sub27) class572_sub27).anInt9287))))) * -1789772835);
					}
				} else {
					int i_33_ = (int) ((float) ((((Class572_Sub27) class572_sub27).anInt9264) * 603635959) + ((float) ((((Class572_Sub27) class572_sub27).anInt9266) * 431881733 - 603635959 * (((Class572_Sub27) class572_sub27).anInt9264)) * 0.5F));
					int i_34_ = (int) ((float) ((((Class572_Sub27) class572_sub27).anInt9265) * -287796001) + (0.5F * (float) (1046174887 * (((Class572_Sub27) class572_sub27).anInt9280) - (-287796001 * (((Class572_Sub27) class572_sub27).anInt9265)))));
					((Class572_Sub27) class572_sub27).aClass240_9269.aFloat2653 = (float) i_33_;
					((Class572_Sub27) class572_sub27).aClass240_9269.aFloat2657 = (float) i_34_;
					if (((Class572_Sub27) class572_sub27).aClass603_9286.method7129(-1051007103) == Class595.aClass595_7831 || (((Class572_Sub27) class572_sub27).aClass603_9286.method7129(-980521819) == Class595.aClass595_7830)) {
						Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9286), 933092126);
						((Class572_Sub27) class572_sub27).aClass603_9286 = null;
					}
				}
			}
		}
	}
}

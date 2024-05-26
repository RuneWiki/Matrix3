package game;

/* Class572_Sub12_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub15 extends Class572_Sub12 {
	int[] anIntArray11468;
	String[] aStringArray11469;
	public int[] anIntArray11470;
	int[][] anIntArrayArray11471;
	public boolean aBool11472 = true;
	Class244 aClass244_11473;

	public int method10419(byte i) {
		if (((Class572_Sub12_Sub15) this).anIntArray11468 == null)
			return 0;
		return ((Class572_Sub12_Sub15) this).anIntArray11468.length;
	}

	public String method10420(byte i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (null == ((Class572_Sub12_Sub15) this).aStringArray11469)
			return "";
		stringbuilder.append(((Class572_Sub12_Sub15) this).aStringArray11469[0]);
		for (int i_0_ = 1; i_0_ < ((Class572_Sub12_Sub15) this).aStringArray11469.length; i_0_++) {
			for (int i_1_ = 0; i_1_ < 3; i_1_++)
				stringbuilder.append('.');
			stringbuilder.append(((Class572_Sub12_Sub15) this).aStringArray11469[i_0_]);
		}
		return stringbuilder.toString();
	}

	void method10421(RSByteBuffer class572_sub15, int i, int i_2_) {
		if (1 == i)
			((Class572_Sub12_Sub15) this).aStringArray11469 = Class104_Sub2.method9935(class572_sub15.readString(1295706626), '<', 207597699);
		else if (2 == i) {
			int i_3_ = class572_sub15.readUnsignedByte(1720470114);
			anIntArray11470 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				anIntArray11470[i_4_] = class572_sub15.readUnsignedShort(647518597);
		} else if (3 == i) {
			int i_5_ = class572_sub15.readUnsignedByte(1056182110);
			((Class572_Sub12_Sub15) this).anIntArray11468 = new int[i_5_];
			((Class572_Sub12_Sub15) this).anIntArrayArray11471 = new int[i_5_][];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				int i_7_ = class572_sub15.readUnsignedShort(647518597);
				Class447 class447 = Class50.method900(i_7_, 557155073);
				if (class447 != null) {
					((Class572_Sub12_Sub15) this).anIntArray11468[i_6_] = i_7_;
					((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_6_] = new int[class447.anInt5148 * 1114433403];
					for (int i_8_ = 0; i_8_ < class447.anInt5148 * 1114433403; i_8_++)
						((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_6_][i_8_] = class572_sub15.readUnsignedShort(647518597);
				}
			}
		} else if (4 == i)
			aBool11472 = false;
	}

	void method10422(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_9_ = class572_sub15.readUnsignedByte(2059111461);
			if (i_9_ == 0)
				break;
			method10421(class572_sub15, i_9_, 829370804);
		}
	}

	void method10423(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			((Class572_Sub12_Sub15) this).aStringArray11469 = Class104_Sub2.method9935(class572_sub15.readString(1295706626), '<', 207597699);
		else if (2 == i) {
			int i_10_ = class572_sub15.readUnsignedByte(222211600);
			anIntArray11470 = new int[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				anIntArray11470[i_11_] = class572_sub15.readUnsignedShort(647518597);
		} else if (3 == i) {
			int i_12_ = class572_sub15.readUnsignedByte(38300919);
			((Class572_Sub12_Sub15) this).anIntArray11468 = new int[i_12_];
			((Class572_Sub12_Sub15) this).anIntArrayArray11471 = new int[i_12_][];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				int i_14_ = class572_sub15.readUnsignedShort(647518597);
				Class447 class447 = Class50.method900(i_14_, 1610407790);
				if (class447 != null) {
					((Class572_Sub12_Sub15) this).anIntArray11468[i_13_] = i_14_;
					((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_13_] = new int[class447.anInt5148 * 1114433403];
					for (int i_15_ = 0; i_15_ < class447.anInt5148 * 1114433403; i_15_++)
						((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_13_][i_15_] = class572_sub15.readUnsignedShort(647518597);
				}
			}
		} else if (4 == i)
			aBool11472 = false;
	}

	public void method10424(RSByteBuffer class572_sub15, int[] is, byte i) {
		if (null != ((Class572_Sub12_Sub15) this).anIntArray11468) {
			for (int i_16_ = 0; (i_16_ < ((Class572_Sub12_Sub15) this).anIntArray11468.length && i_16_ < is.length); i_16_++) {
				int i_17_ = method10425(i_16_, -373568733).anInt5155 * -637020803;
				if (i_17_ > 0)
					class572_sub15.method8473((long) is[i_16_], i_17_, (byte) 125);
			}
		}
	}

	public Class447 method10425(int i, int i_18_) {
		if (null == ((Class572_Sub12_Sub15) this).anIntArray11468 || i < 0 || i > ((Class572_Sub12_Sub15) this).anIntArray11468.length)
			return null;
		return Class50.method900((((Class572_Sub12_Sub15) this).anIntArray11468[i]), 2115448806);
	}

	public int method10426(int i, int i_19_, int i_20_) {
		if (null == ((Class572_Sub12_Sub15) this).anIntArray11468 || i < 0 || i > ((Class572_Sub12_Sub15) this).anIntArray11468.length)
			return -1;
		if (((Class572_Sub12_Sub15) this).anIntArrayArray11471[i] == null || i_19_ < 0 || i_19_ > (((Class572_Sub12_Sub15) this).anIntArrayArray11471[i]).length)
			return -1;
		return ((Class572_Sub12_Sub15) this).anIntArrayArray11471[i][i_19_];
	}

	void method10427(int i) {
		if (anIntArray11470 != null) {
			for (int i_21_ = 0; i_21_ < anIntArray11470.length; i_21_++)
				anIntArray11470[i_21_] |= 0x8000;
		}
	}

	void method10428(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1176107227);
			if (i == 0)
				break;
			method10421(class572_sub15, i, 829370804);
		}
	}

	void method10429(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2138497124);
			if (i == 0)
				break;
			method10421(class572_sub15, i, 829370804);
		}
	}

	public int method10430(int i, int i_22_) {
		if (null == ((Class572_Sub12_Sub15) this).anIntArray11468 || i < 0 || i > ((Class572_Sub12_Sub15) this).anIntArray11468.length)
			return -1;
		if (((Class572_Sub12_Sub15) this).anIntArrayArray11471[i] == null || i_22_ < 0 || i_22_ > (((Class572_Sub12_Sub15) this).anIntArrayArray11471[i]).length)
			return -1;
		return ((Class572_Sub12_Sub15) this).anIntArrayArray11471[i][i_22_];
	}

	void method10431(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			((Class572_Sub12_Sub15) this).aStringArray11469 = Class104_Sub2.method9935(class572_sub15.readString(1295706626), '<', 207597699);
		else if (2 == i) {
			int i_23_ = class572_sub15.readUnsignedByte(1689183926);
			anIntArray11470 = new int[i_23_];
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++)
				anIntArray11470[i_24_] = class572_sub15.readUnsignedShort(647518597);
		} else if (3 == i) {
			int i_25_ = class572_sub15.readUnsignedByte(1418121927);
			((Class572_Sub12_Sub15) this).anIntArray11468 = new int[i_25_];
			((Class572_Sub12_Sub15) this).anIntArrayArray11471 = new int[i_25_][];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				int i_27_ = class572_sub15.readUnsignedShort(647518597);
				Class447 class447 = Class50.method900(i_27_, 530183586);
				if (class447 != null) {
					((Class572_Sub12_Sub15) this).anIntArray11468[i_26_] = i_27_;
					((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_26_] = new int[class447.anInt5148 * 1114433403];
					for (int i_28_ = 0; i_28_ < class447.anInt5148 * 1114433403; i_28_++)
						((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_26_][i_28_] = class572_sub15.readUnsignedShort(647518597);
				}
			}
		} else if (4 == i)
			aBool11472 = false;
	}

	public int method10432() {
		if (((Class572_Sub12_Sub15) this).anIntArray11468 == null)
			return 0;
		return ((Class572_Sub12_Sub15) this).anIntArray11468.length;
	}

	void method10433() {
		if (anIntArray11470 != null) {
			for (int i = 0; i < anIntArray11470.length; i++)
				anIntArray11470[i] |= 0x8000;
		}
	}

	public String method10434(RSByteBuffer class572_sub15, int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (null != ((Class572_Sub12_Sub15) this).anIntArray11468) {
			for (int i_29_ = 0; i_29_ < ((Class572_Sub12_Sub15) this).anIntArray11468.length; i_29_++) {
				stringbuilder.append(((Class572_Sub12_Sub15) this).aStringArray11469[i_29_]);
				stringbuilder.append(((Class572_Sub12_Sub15) this).aClass244_11473.method3346(method10425(i_29_, -1960198132), (((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_29_]), class572_sub15.method8477((Class50.method900((((Class572_Sub12_Sub15) this).anIntArray11468[i_29_]), 1040196771).anInt5157) * -1796732669, 45329470)));
			}
		}
		stringbuilder.append(((Class572_Sub12_Sub15) this).aStringArray11469[(((Class572_Sub12_Sub15) this).aStringArray11469).length - 1]);
		return stringbuilder.toString();
	}

	void method10435(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			((Class572_Sub12_Sub15) this).aStringArray11469 = Class104_Sub2.method9935(class572_sub15.readString(1295706626), '<', 207597699);
		else if (2 == i) {
			int i_30_ = class572_sub15.readUnsignedByte(105122910);
			anIntArray11470 = new int[i_30_];
			for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
				anIntArray11470[i_31_] = class572_sub15.readUnsignedShort(647518597);
		} else if (3 == i) {
			int i_32_ = class572_sub15.readUnsignedByte(94355592);
			((Class572_Sub12_Sub15) this).anIntArray11468 = new int[i_32_];
			((Class572_Sub12_Sub15) this).anIntArrayArray11471 = new int[i_32_][];
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				int i_34_ = class572_sub15.readUnsignedShort(647518597);
				Class447 class447 = Class50.method900(i_34_, 990534885);
				if (class447 != null) {
					((Class572_Sub12_Sub15) this).anIntArray11468[i_33_] = i_34_;
					((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_33_] = new int[class447.anInt5148 * 1114433403];
					for (int i_35_ = 0; i_35_ < class447.anInt5148 * 1114433403; i_35_++)
						((Class572_Sub12_Sub15) this).anIntArrayArray11471[i_33_][i_35_] = class572_sub15.readUnsignedShort(647518597);
				}
			}
		} else if (4 == i)
			aBool11472 = false;
	}

	public int method10436(int i, int i_36_) {
		if (null == ((Class572_Sub12_Sub15) this).anIntArray11468 || i < 0 || i > ((Class572_Sub12_Sub15) this).anIntArray11468.length)
			return -1;
		if (((Class572_Sub12_Sub15) this).anIntArrayArray11471[i] == null || i_36_ < 0 || i_36_ > (((Class572_Sub12_Sub15) this).anIntArrayArray11471[i]).length)
			return -1;
		return ((Class572_Sub12_Sub15) this).anIntArrayArray11471[i][i_36_];
	}

	void method10437() {
		if (anIntArray11470 != null) {
			for (int i = 0; i < anIntArray11470.length; i++)
				anIntArray11470[i] |= 0x8000;
		}
	}

	void method10438() {
		if (anIntArray11470 != null) {
			for (int i = 0; i < anIntArray11470.length; i++)
				anIntArray11470[i] |= 0x8000;
		}
	}

	Class572_Sub12_Sub15() {
		/* empty */
	}

	void method10439() {
		if (anIntArray11470 != null) {
			for (int i = 0; i < anIntArray11470.length; i++)
				anIntArray11470[i] |= 0x8000;
		}
	}
}

package game;

/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class242 implements Interface17 {
	int[] anIntArray2661;
	public int anInt2662;
	Class251 aClass251_2663;
	public boolean aBool2664 = false;
	public int anInt2665;

	public void method103() {
		/* empty */
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(680194681);
			if (0 == i_0_)
				break;
			method3328(class572_sub15, i_0_, 208924160);
		}
	}

	void method3328(RSByteBuffer class572_sub15, int i, int i_1_) {
		if (1 == i)
			anInt2662 = class572_sub15.readBigSmart((byte) 124) * 853245169;
		else if (2 == i)
			anInt2665 = class572_sub15.read24BitInt(1140925462) * 717101399;
		else if (i == 3)
			aBool2664 = true;
		else if (i == 4)
			anInt2662 = -853245169;
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(766357970);
			if (0 == i)
				break;
			method3328(class572_sub15, i, 1110723522);
		}
	}

	public int[] method3329(Class106 class106, int i, boolean bool, short i_2_) {
		if (((Class242) this).anIntArray2661 != null)
			return ((Class242) this).anIntArray2661;
		long l = (long) (499643409 * anInt2662 | i << 16 | (bool ? 262144 : 0) | 1862175997 * class106.anInt1416 << 19);
		method3330(class106, i, bool, l);
		return ((Class242) this).anIntArray2661;
	}

	void method3330(Class106 class106, int i, boolean bool, long l) {
		if (((Class251) ((Class242) this).aClass251_2663).aClass248_2729.method3383(anInt2662 * 499643409, -2070946724)) {
			Class87 class87 = Class160.method2571((((Class251) ((Class242) this).aClass251_2663).aClass248_2729), 499643409 * anInt2662, 0);
			if (null != class87) {
				class87.method1290();
				if (bool)
					class87.method1281();
				for (int i_3_ = 0; i_3_ < i; i_3_++)
					class87.method1299();
				((Class242) this).anIntArray2661 = class87.method1285(false);
				if (anInt2665 * -1243356569 != 0) {
					int i_4_ = (-1243356569 * anInt2665 & 0xff0000) >> 16;
					int i_5_ = (anInt2665 * -1243356569 & 0xff00) >> 8;
					int i_6_ = -1243356569 * anInt2665 & 0xff;
					for (int i_7_ = 0; i_7_ < ((Class242) this).anIntArray2661.length; i_7_++) {
						int i_8_ = (((Class242) this).anIntArray2661[i_7_] >> 24 & 0xff);
						int i_9_ = 256 - i_8_;
						if (i_8_ != 0) {
							int i_10_ = (-16777216 * ((((Class242) this).anIntArray2661[i_7_] & 0xff0000) * i_4_));
							int i_11_ = (((Class242) this).anIntArray2661[i_7_] & 0xff00) * i_5_ * 16711680;
							int i_12_ = (i_6_ * (((Class242) this).anIntArray2661[i_7_] & 0xff) * 65280);
							int i_13_ = (i_10_ | i_11_ | i_12_) >>> 8;
							if (255 == i_8_)
								((Class242) this).anIntArray2661[i_7_] = i_13_;
							else {
								int i_14_ = ((Class242) this).anIntArray2661[i_7_];
								((Class242) this).anIntArray2661[i_7_] = (i_8_ << 24 | ((((i_14_ & 0xff00ff) * i_8_ + (i_13_ & 0xff00ff) * i_9_) & ~0xff00ff) + (((i_14_ & 0xff00) * i_8_ + (i_13_ & 0xff00) * i_9_) & 0xff0000)) >> 8);
							}
						}
					}
				}
			}
			Class161 class161 = class106.method1711(class87, true);
			if (null != class161)
				((Class251) ((Class242) this).aClass251_2663).aClass127_2730.method2229(class161, l);
		}
	}

	public boolean method3331(int i) {
		return ((Class251) ((Class242) this).aClass251_2663).aClass248_2729.method3383(499643409 * anInt2662, 195064324);
	}

	public void method104(byte i) {
		/* empty */
	}

	void method3332(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt2662 = class572_sub15.readBigSmart((byte) 53) * 853245169;
		else if (2 == i)
			anInt2665 = class572_sub15.read24BitInt(1140925462) * 717101399;
		else if (i == 3)
			aBool2664 = true;
		else if (i == 4)
			anInt2662 = -853245169;
	}

	public boolean method3333() {
		return ((Class251) ((Class242) this).aClass251_2663).aClass248_2729.method3383(499643409 * anInt2662, -736662600);
	}

	public boolean method3334() {
		return ((Class251) ((Class242) this).aClass251_2663).aClass248_2729.method3383(499643409 * anInt2662, 754574721);
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1668975900);
			if (0 == i)
				break;
			method3328(class572_sub15, i, -246354837);
		}
	}

	public Class161 method3335(Class106 class106, int i, boolean bool, byte i_15_) {
		long l = (long) (499643409 * anInt2662 | i << 16 | (bool ? 262144 : 0) | 1862175997 * class106.anInt1416 << 19);
		Class161 class161 = (Class161) ((Class251) ((Class242) this).aClass251_2663).aClass127_2730.method2246(l);
		if (null != class161)
			return class161;
		method3330(class106, i, bool, l);
		return (Class161) ((Class251) ((Class242) this).aClass251_2663).aClass127_2730.method2246(l);
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(464731256);
			if (0 == i)
				break;
			method3328(class572_sub15, i, 1470037443);
		}
	}

	public void method106() {
		/* empty */
	}

	void method3336(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt2662 = class572_sub15.readBigSmart((byte) 87) * 853245169;
		else if (2 == i)
			anInt2665 = class572_sub15.read24BitInt(1140925462) * 717101399;
		else if (i == 3)
			aBool2664 = true;
		else if (i == 4)
			anInt2662 = -853245169;
	}

	void method3337(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt2662 = class572_sub15.readBigSmart((byte) 47) * 853245169;
		else if (2 == i)
			anInt2665 = class572_sub15.read24BitInt(1140925462) * 717101399;
		else if (i == 3)
			aBool2664 = true;
		else if (i == 4)
			anInt2662 = -853245169;
	}

	public void method110() {
		/* empty */
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1359818325);
			if (0 == i)
				break;
			method3328(class572_sub15, i, 1020551731);
		}
	}

	public void method112() {
		/* empty */
	}

	public boolean method3338() {
		return ((Class251) ((Class242) this).aClass251_2663).aClass248_2729.method3383(499643409 * anInt2662, 1649577965);
	}

	public boolean method3339() {
		return ((Class251) ((Class242) this).aClass251_2663).aClass248_2729.method3383(499643409 * anInt2662, -1412221468);
	}

	Class242(int i, Class251 class251) {
		((Class242) this).aClass251_2663 = class251;
	}

	public static boolean method3340(int i, String string, byte i_16_) {
		Class633.aClass641_8197 = new RSSocket(false);
		Class633.aClass641_8197.id = -1002799573 * i;
		Class633.aClass641_8197.address = string;
		if (Class151.aClass434_1702 != Class434.aClass434_5044) {
			Class633.aClass641_8197.port = -1352120000 + -984285601 * Class633.aClass641_8197.id;
			Class633.aClass641_8197.securePort = Class633.aClass641_8197.id * -172050845 + 974886224;
		}
		return true;
	}

	static final void method3341(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub14_9215.method8241((byte) 6) == 1 ? 1 : 0;
	}

	static final void method3342(Cs2Executor class441, int i) {
		NPC class456_sub1_sub2_sub3_sub1 = ((NPC) ((Cs2Executor) class441).entity);
		String string = class456_sub1_sub2_sub3_sub1.aString11807;
		NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
		if (class410.anIntArray4795 != null) {
			class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -1168917376);
			if (class410 == null)
				string = "";
			else
				string = class410.aString4791;
		}
		if (string == null)
			string = "";
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}
}

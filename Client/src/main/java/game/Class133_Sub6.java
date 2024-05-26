package game;

/* Class133_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub6 extends Class133 {
	int anInt9840;
	int anInt9841;
	int anInt9842;
	int anInt9843;
	Class603 aClass603_9844;
	public static long aLong9845;

	Class133_Sub6(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub6) this).anInt9842 = class572_sub15.readUnsignedShort(647518597) * 1098093909;
		((Class133_Sub6) this).anInt9841 = class572_sub15.readUnsignedByte(1533249008) * 749712231;
		((Class133_Sub6) this).anInt9840 = class572_sub15.readUnsignedByte(283083698) * 1379338055;
		((Class133_Sub6) this).anInt9843 = class572_sub15.readUnsignedByte(1759914048) * 931394753;
		((Class133_Sub6) this).aClass603_9844 = (Class344.audio.method935(Class124.aClass124_1503, this, 49266685 * ((Class133_Sub6) this).anInt9842, ((Class133_Sub6) this).anInt9843 * -808543423, ((Class133_Sub6) this).anInt9841 * 1055438935, Class126.aClass126_1509.method2215(223321773), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, ((Class133_Sub6) this).anInt9840 * -1839041929, false, -1139262080));
		if (null != ((Class133_Sub6) this).aClass603_9844)
			((Class133_Sub6) this).aClass603_9844.method7126(-730329351);
	}

	public void method2303(int i) {
		if (((Class133_Sub6) this).aClass603_9844 != null)
			((Class133_Sub6) this).aClass603_9844.method7140(-906478604);
	}

	void method2304(int i) {
		if (((Class133_Sub6) this).aClass603_9844 != null) {
			((Class133_Sub6) this).aClass603_9844.method7098(50, -1110366939);
			Class344.audio.method958(((Class133_Sub6) this).aClass603_9844, 127700451);
			((Class133_Sub6) this).aClass603_9844 = null;
		}
	}

	public void method2309() {
		if (((Class133_Sub6) this).aClass603_9844 != null)
			((Class133_Sub6) this).aClass603_9844.method7140(792662521);
	}

	void method2302() {
		if (((Class133_Sub6) this).aClass603_9844 != null) {
			((Class133_Sub6) this).aClass603_9844.method7098(50, -1110366939);
			Class344.audio.method958(((Class133_Sub6) this).aClass603_9844, -1983640069);
			((Class133_Sub6) this).aClass603_9844 = null;
		}
	}

	static final void method9346(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 5110);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class116.method2144(class73, class83, class441, (byte) 14);
	}
}

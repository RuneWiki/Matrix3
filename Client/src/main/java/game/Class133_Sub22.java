package game;

/* Class133_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub22 extends Class133 {
	int anInt10357;
	int anInt10358;
	Class603 aClass603_10359;
	int anInt10360;
	int anInt10361;
	public static int anInt10362;

	Class133_Sub22(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub22) this).anInt10357 = class572_sub15.readUnsignedShort(647518597) * 1361070761;
		((Class133_Sub22) this).anInt10358 = class572_sub15.readUnsignedByte(1523773629) * -865206717;
		((Class133_Sub22) this).anInt10361 = class572_sub15.readUnsignedByte(653498957) * 2030565091;
		((Class133_Sub22) this).anInt10360 = class572_sub15.readUnsignedByte(794261701) * 1942641191;
		((Class133_Sub22) this).aClass603_10359 = (Class344.audio.method935(Class124.aClass124_1503, this, ((Class133_Sub22) this).anInt10357 * -1668417127, -274238057 * ((Class133_Sub22) this).anInt10360, ((Class133_Sub22) this).anInt10358 * 2027667051, Class126.aClass126_1509.method2215(-554007505), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, ((Class133_Sub22) this).anInt10361 * -1266745653, false, -1259062818));
		if (null != ((Class133_Sub22) this).aClass603_10359)
			((Class133_Sub22) this).aClass603_10359.method7126(-730329351);
	}

	public void method2303(int i) {
		if (((Class133_Sub22) this).aClass603_10359 != null)
			((Class133_Sub22) this).aClass603_10359.method7140(-49809050);
	}

	void method2302() {
		if (((Class133_Sub22) this).aClass603_10359 != null) {
			((Class133_Sub22) this).aClass603_10359.method7098(50, -1110366939);
			Class344.audio.method958((((Class133_Sub22) this).aClass603_10359), -759432660);
			((Class133_Sub22) this).aClass603_10359 = null;
		}
	}

	public void method2309() {
		if (((Class133_Sub22) this).aClass603_10359 != null)
			((Class133_Sub22) this).aClass603_10359.method7140(92138177);
	}

	void method2304(int i) {
		if (((Class133_Sub22) this).aClass603_10359 != null) {
			((Class133_Sub22) this).aClass603_10359.method7098(50, -1110366939);
			Class344.audio.method958((((Class133_Sub22) this).aClass603_10359), -1502093897);
			((Class133_Sub22) this).aClass603_10359 = null;
		}
	}

	static void method9568(int i, int i_0_) {
		Class19.anInt144 = -663926581 * i;
		synchronized (Class19.aClass127_145) {
			Class19.aClass127_145.method2231((byte) -52);
		}
	}
}

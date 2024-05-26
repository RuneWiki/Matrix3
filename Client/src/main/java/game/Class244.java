package game;

/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class244 {
	public int anInt2669;
	Class248 aClass248_2670;
	Interface56 anInterface56_2671;
	public int anInt2672 = 0;
	Class127 aClass127_2673;
	static final int anInt2674 = 1;
	static final int anInt2675 = 32768;
	Class248 aClass248_2676;

	public Class572_Sub12_Sub15 method3345(int i, int i_0_) {
		Class572_Sub12_Sub15 class572_sub12_sub15 = ((Class572_Sub12_Sub15) ((Class244) this).aClass127_2673.method2246((long) i));
		if (class572_sub12_sub15 != null)
			return class572_sub12_sub15;
		byte[] is;
		if (i >= 32768)
			is = ((Class244) this).aClass248_2670.getFile(1, i & 0x7fff, -1578397245);
		else
			is = ((Class244) this).aClass248_2676.getFile(1, i, 1008001379);
		class572_sub12_sub15 = new Class572_Sub12_Sub15();
		((Class572_Sub12_Sub15) class572_sub12_sub15).aClass244_11473 = this;
		if (null != is)
			class572_sub12_sub15.method10422(new RSByteBuffer(is), -1482870394);
		if (i >= 32768)
			class572_sub12_sub15.method10427(340478031);
		((Class244) this).aClass127_2673.method2229(class572_sub12_sub15, (long) i);
		return class572_sub12_sub15;
	}

	String method3346(Class447 class447, int[] is, long l) {
		if (((Class244) this).anInterface56_2671 != null) {
			String string = ((Class244) this).anInterface56_2671.method319(class447, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	public Class244(Class435 class435, Class248 class248, Class248 class248_1_, Interface56 interface56) {
		anInt2669 = 0;
		((Class244) this).aClass127_2673 = new Class127(64);
		((Class244) this).anInterface56_2671 = null;
		((Class244) this).aClass248_2676 = class248;
		((Class244) this).aClass248_2670 = class248_1_;
		((Class244) this).anInterface56_2671 = interface56;
		if (((Class244) this).aClass248_2676 != null)
			anInt2672 = (((Class244) this).aClass248_2676.method3376(1, -2015640973) * -935221443);
		if (null != ((Class244) this).aClass248_2670)
			anInt2669 = (((Class244) this).aClass248_2670.method3376(1, -1000320193) * -908375929);
	}

	static final void method3347(int i, int i_2_) {
		if (Class569.method6760(i, null, -1332982030))
			Class287.method3877((Class534.aClass83Array5975[i].aClass73Array1081), -1, -1482856541);
	}
}

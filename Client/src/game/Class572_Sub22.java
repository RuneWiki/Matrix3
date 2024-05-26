package game;

/* Class572_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class572_Sub22 extends Class572 implements Interface64 {
	char aChar9173;
	int anInt9174;
	static final int anInt9175 = -1;
	long aLong9176;
	int anInt9177;
	int anInt9178;

	public long method54() {
		return 6099772864217221953L * ((Class572_Sub22) this).aLong9176;
	}

	public int method136(int i) {
		return -403467651 * ((Class572_Sub22) this).anInt9174;
	}

	public long method384(int i) {
		return 6099772864217221953L * ((Class572_Sub22) this).aLong9176;
	}

	public int method383(int i) {
		return ((Class572_Sub22) this).anInt9177 * 1830239477;
	}

	public char method379() {
		return ((Class572_Sub22) this).aChar9173;
	}

	public int method378(int i) {
		return -581768549 * ((Class572_Sub22) this).anInt9178;
	}

	public int method236() {
		return -581768549 * ((Class572_Sub22) this).anInt9178;
	}

	public char method380() {
		return ((Class572_Sub22) this).aChar9173;
	}

	public int method44() {
		return ((Class572_Sub22) this).anInt9177 * 1830239477;
	}

	public int method377() {
		return -581768549 * ((Class572_Sub22) this).anInt9178;
	}

	public long method382() {
		return 6099772864217221953L * ((Class572_Sub22) this).aLong9176;
	}

	public int method55() {
		return ((Class572_Sub22) this).anInt9177 * 1830239477;
	}

	public char method381(byte i) {
		return ((Class572_Sub22) this).aChar9173;
	}

	Class572_Sub22() {
		/* empty */
	}

	public int method376() {
		return -403467651 * ((Class572_Sub22) this).anInt9174;
	}

	public int method385() {
		return -403467651 * ((Class572_Sub22) this).anInt9174;
	}

	public static int method8601(Class230 class230, int i) {
		Class240 class240 = Class240.method3316(0.0F, 0.0F, 1.0F);
		class240.method3288(class230);
		double d = Math.atan2((double) class240.aFloat2653, (double) class240.aFloat2657);
		class240.method3261();
		if (d < 0.0)
			d = 3.141592653589793 + (3.141592653589793 + d);
		return (int) (16384.0 * (d / 6.283185307179586)) & 0x3fff;
	}
}

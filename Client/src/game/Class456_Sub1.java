package game;

/* Class456_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class456_Sub1 extends Class456 {
	int anInt9005;
	Class456_Sub1 aClass456_Sub1_9006;
	public Class90[] aClass90Array9007;
	public byte aByte9008;
	public byte aByte9009;
	public Class523 aClass523_9010;

	int method8296() {
		return 0;
	}

	abstract boolean method8297(Class106 class106, int i, int i_0_, int i_1_);

	int method8298(int i) {
		return 0;
	}

	abstract boolean method8299(int i);

	abstract boolean method8300(int i);

	abstract boolean method8301(byte i);

	abstract void method8302(Class106 class106, Class456_Sub1 class456_sub1_2_, int i, int i_3_, int i_4_, boolean bool, int i_5_);

	abstract void method8303(int i);

	abstract void method8304();

	public abstract Class535 method8305(Class106 class106);

	public abstract Class535 method8306(Class106 class106, byte i);

	Class456_Sub1(Class523 class523) {
		aClass523_9010 = class523;
	}

	abstract boolean method8307(Class106 class106, int i);

	abstract boolean method8308(int i);

	public boolean method8309(byte i) {
		return true;
	}

	public abstract int method8310(byte i);

	int method8311(int i, int i_6_, Class572_Sub36[] class572_sub36s, short i_7_) {
		long l = (((Class523) aClass523_9010).aLongArrayArrayArray5835[aByte9009][i][i_6_]);
		long l_8_ = 0L;
		int i_9_ = 0;
		for (/**/; l_8_ <= 48L; l_8_ += 16L) {
			int i_10_ = (int) (l >> (int) l_8_ & 0xffffL);
			if (i_10_ <= 0)
				break;
			class572_sub36s[i_9_++] = (((Class523) aClass523_9010).aClass541Array5878[i_10_ - 1].aClass572_Sub36_6086);
		}
		for (int i_11_ = i_9_; i_11_ < 4; i_11_++)
			class572_sub36s[i_11_] = null;
		return i_9_;
	}

	public int method8312(int i) {
		return -method8310((byte) 4);
	}

	abstract void method8313(Class106 class106);

	abstract boolean method8314();

	abstract boolean method8315();

	public abstract int method8316();

	abstract boolean method8317();

	abstract boolean method8318();

	abstract boolean method8319();

	public abstract int method8320();

	abstract boolean method8321(Class106 class106, int i, int i_12_);

	public abstract int method8322();

	public abstract int method8323();

	public int method8324() {
		return -method8310((byte) -63);
	}

	public int method8325() {
		return -method8310((byte) -58);
	}

	abstract Class531 method8326(Class106 class106);

	abstract Class531 method8327(Class106 class106);

	abstract Class531 method8328(Class106 class106);

	abstract boolean method8329();

	abstract void method8330(Class106 class106);

	abstract boolean method8331();

	abstract boolean method8332();

	abstract boolean method8333();

	abstract boolean method8334();

	abstract boolean method8335(Class106 class106);

	abstract void method8336(Class106 class106, int i);

	abstract void method8337(Class106 class106, Class456_Sub1 class456_sub1_13_, int i, int i_14_, int i_15_, boolean bool);

	abstract void method8338();

	void method8339(int i, int i_16_) {
		aClass90Array9007 = new Class90[i];
		for (int i_17_ = 0; i_17_ < aClass90Array9007.length; i_17_++)
			aClass90Array9007[i_17_] = new Class90();
	}

	void method8340(int i) {
		aClass90Array9007 = new Class90[i];
		for (int i_18_ = 0; i_18_ < aClass90Array9007.length; i_18_++)
			aClass90Array9007[i_18_] = new Class90();
	}

	public abstract Class535 method8341(Class106 class106);

	abstract boolean method8342();

	abstract void method8343();

	public abstract Class535 method8344(Class106 class106);

	abstract boolean method8345(Class106 class106);

	abstract int method8346(Class572_Sub36[] class572_sub36s);

	abstract boolean method8347();

	public boolean method8348() {
		return true;
	}

	abstract boolean method8349();

	abstract Class531 method8350(Class106 class106, int i);

	void method8351(int i) {
		aClass90Array9007 = new Class90[i];
		for (int i_19_ = 0; i_19_ < aClass90Array9007.length; i_19_++)
			aClass90Array9007[i_19_] = new Class90();
	}

	abstract int method8352(Class572_Sub36[] class572_sub36s, byte i);

	static final void method8353(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class10.method546(string, (short) -14120);
	}
}

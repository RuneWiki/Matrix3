package game;

/* Class572_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class572_Sub8_Sub1 extends Class572_Sub8 {
	int anInt11300;
	Class63 aClass63_11301;
	String aString11302;
	String aString11303;
	Class63 aClass63_11304;

	public Class63 method10263(byte i) {
		return ((Class572_Sub8_Sub1) this).aClass63_11304;
	}

	public abstract boolean method10264(int i);

	public String toString() {
		String string = new StringBuilder().append(((Class572_Sub8_Sub1) this).aClass63_11301.toString()).append(" ").append(((Class572_Sub8_Sub1) this).aString11303).toString();
		if (((Class572_Sub8_Sub1) this).aString11302 != null && !"".equals(((Class572_Sub8_Sub1) this).aString11302))
			string = new StringBuilder().append(string).append(" : ").append(((Class572_Sub8_Sub1) this).aString11302).toString();
		return string;
	}

	public abstract boolean method10265(int i);

	public Class63 method10266(byte i) {
		return ((Class572_Sub8_Sub1) this).aClass63_11301;
	}

	public int method10267(byte i) {
		if (Class63.aClass63_549 != ((Class572_Sub8_Sub1) this).aClass63_11301)
			throw new IllegalArgumentException_Sub1(this, ((Class572_Sub8_Sub1) this).aClass63_11301.toString().toLowerCase());
		return ((Class572_Sub8_Sub1) this).anInt11300 * 231778459;
	}

	public String method10268() {
		String string = new StringBuilder().append(((Class572_Sub8_Sub1) this).aClass63_11301.toString()).append(" ").append(((Class572_Sub8_Sub1) this).aString11303).toString();
		if (((Class572_Sub8_Sub1) this).aString11302 != null && !"".equals(((Class572_Sub8_Sub1) this).aString11302))
			string = new StringBuilder().append(string).append(" : ").append(((Class572_Sub8_Sub1) this).aString11302).toString();
		return string;
	}

	public abstract int method10269(int i);

	public abstract boolean method10270(int i);

	public abstract boolean method10271(int i);

	public String method10272() {
		String string = new StringBuilder().append(((Class572_Sub8_Sub1) this).aClass63_11301.toString()).append(" ").append(((Class572_Sub8_Sub1) this).aString11303).toString();
		if (((Class572_Sub8_Sub1) this).aString11302 != null && !"".equals(((Class572_Sub8_Sub1) this).aString11302))
			string = new StringBuilder().append(string).append(" : ").append(((Class572_Sub8_Sub1) this).aString11302).toString();
		return string;
	}

	Class572_Sub8_Sub1(Class394 class394) {
		((Class572_Sub8_Sub1) this).aClass63_11301 = ((Class394) class394).aClass63_4678;
		((Class572_Sub8_Sub1) this).aString11303 = ((Class394) class394).aString4672;
		((Class572_Sub8_Sub1) this).aString11302 = ((Class394) class394).aString4676;
		((Class572_Sub8_Sub1) this).anInt11300 = -1009438313 * ((Class394) class394).anInt4674;
		((Class572_Sub8_Sub1) this).aClass63_11304 = ((Class394) class394).aClass63_4675;
	}

	String method10273() {
		return ((Class572_Sub8_Sub1) this).aString11303;
	}

	String method10274(int i) {
		return ((Class572_Sub8_Sub1) this).aString11303;
	}

	String method10275() {
		return ((Class572_Sub8_Sub1) this).aString11303;
	}

	public int method10276() {
		if (Class63.aClass63_549 != ((Class572_Sub8_Sub1) this).aClass63_11301)
			throw new IllegalArgumentException_Sub1(this, ((Class572_Sub8_Sub1) this).aClass63_11301.toString().toLowerCase());
		return ((Class572_Sub8_Sub1) this).anInt11300 * 231778459;
	}

	public int method10277() {
		if (Class63.aClass63_549 != ((Class572_Sub8_Sub1) this).aClass63_11301)
			throw new IllegalArgumentException_Sub1(this, ((Class572_Sub8_Sub1) this).aClass63_11301.toString().toLowerCase());
		return ((Class572_Sub8_Sub1) this).anInt11300 * 231778459;
	}

	public abstract int method10278(int i);

	public static void method10279(int i, int i_0_, int i_1_, boolean bool, int i_2_) {
		client.aLong8720 = 0L;
		int i_3_ = Class344_Sub2.method9253(1368847885);
		if (3 == i || 3 == i_3_)
			bool = true;
		if (!Class272_Sub2.aClass106_9517.method1673())
			bool = true;
		Class491.method5863(i_3_, i, i_0_, i_1_, bool, (short) 14202);
	}
}

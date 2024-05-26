package game;

/* Class540_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class540_Sub1 extends Class540 implements Interface72 {
	public Interface17 method464(int i, Interface18 interface18) {
		return new Class519(i, this, interface18);
	}

	public Interface17 method458(int i, Interface18 interface18, int i_0_) {
		return new Class519(i, this, interface18);
	}

	public Class method459(int i) {
		return Class519.class;
	}

	public Interface17 method460(int i, Interface18 interface18) {
		return new Class519(i, this, interface18);
	}

	public Interface17 method465(int i, Interface18 interface18) {
		return new Class519(i, this, interface18);
	}

	public Class method461() {
		return Class519.class;
	}

	public Interface17 method463(int i, Interface18 interface18) {
		return new Class519(i, this, interface18);
	}

	public Class method467() {
		return Class519.class;
	}

	public Interface17 method462(int i, Interface18 interface18) {
		return new Class519(i, this, interface18);
	}

	Class540_Sub1(Class248 class248) {
		super(class248);
	}

	public Class method466() {
		return Class519.class;
	}

	static final void method8248(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_3_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]);
		Class497 class497 = client.aClass613_8605.method7280((byte) -93);
		Class457.method5426(((i_1_ >> 14 & 0x3fff) - -2109597897 * class497.localX), (i_1_ & 0x3fff) - 417324155 * class497.localY, i_2_ << 2, i_3_, i_4_, -887034943);
	}

	static final void method8249(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aBool8659 ? 1 : 0;
	}
}

package game;

/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

class Class163 implements Comparator {
	Class289_Sub2 this$0;

	public int method2657(Object object, Object object_0_) {
		return method2658((Class605) object, (Class605) object_0_, -2045357168);
	}

	int method2658(Class605 class605, Class605 class605_1_, int i) {
		float f = class605.method7237((byte) 2);
		float f_2_ = class605_1_.method7237((byte) 94);
		if (f_2_ > f)
			return 1;
		if (f_2_ < f)
			return -1;
		return 0;
	}

	public boolean method2659(Object object) {
		return super.equals(object);
	}

	Class163(Class289_Sub2 class289_sub2) {
		((Class163) this).this$0 = class289_sub2;
	}

	public int method2660(Object object, Object object_3_) {
		return method2658((Class605) object, (Class605) object_3_, -2129269827);
	}

	public int method2661(Object object, Object object_4_) {
		return method2658((Class605) object, (Class605) object_4_, -2105053244);
	}

	public int method2662(Object object, Object object_5_) {
		return method2658((Class605) object, (Class605) object_5_, -2018433357);
	}

	public int method2663(Object object, Object object_6_) {
		return method2658((Class605) object, (Class605) object_6_, -1808345034);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public boolean method2664(Object object) {
		return super.equals(object);
	}

	public int compare(Object object, Object object_7_) {
		return method2658((Class605) object, (Class605) object_7_, -2070842716);
	}

	static final void method2665(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_8_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_9_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_8_ / i_9_;
	}

	public static void method2666(boolean bool, int i) {
		if (Class520.aBool5806 != bool) {
			Class204.method3015((byte) -63);
			Class520.aBool5806 = bool;
		}
	}

	static final void method2667(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		StringBuilder stringbuilder = new StringBuilder(string.length());
		boolean bool = false;
		for (int i_10_ = 0; i_10_ < string.length(); i_10_++) {
			char c = string.charAt(i_10_);
			if ('<' == c)
				bool = true;
			else if (c == '>')
				bool = false;
			else if (!bool)
				stringbuilder.append(c);
		}
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = stringbuilder.toString();
	}
}

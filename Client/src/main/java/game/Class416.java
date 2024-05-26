package game;

/* Class416 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class416 {
	static Class416 aClass416_4930;
	public static Class416 aClass416_4931 = new Class416(0, false);
	static Class416 aClass416_4932;
	public static Class416 aClass416_4933;
	boolean aBool4934;
	public static Class416 aClass416_4935 = new Class416(1, false);
	static Class416 aClass416_4936;
	public int anInt4937;
	static Class416 aClass416_4938;

	static {
		aClass416_4932 = new Class416(2, true);
		aClass416_4933 = new Class416(3, false);
		aClass416_4930 = new Class416(4, true);
		aClass416_4938 = new Class416(5, true);
		aClass416_4936 = new Class416(6, true);
	}

	public boolean method5099(byte i) {
		return ((Class416) this).aBool4934;
	}

	Class416(int i, boolean bool) {
		anInt4937 = i * -1634772127;
		((Class416) this).aBool4934 = bool;
	}

	public static int method5100(int i, int i_0_, int i_1_) {
		i_0_ = (i & 0x7f) * i_0_ >> 7;
		if (i_0_ < 2)
			i_0_ = 2;
		else if (i_0_ > 126)
			i_0_ = 126;
		return (i & 0xff80) + i_0_;
	}

	static final void method5101(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (string.startsWith(Class520.method6215(0, 2009472133)) || string.startsWith(Class520.method6215(1, 2009472133)))
			string = string.substring(7);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class645.method7645(string, (byte) 14);
	}

	static final void method5102(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_2_, -1849054829)).anInt1565) * 184299997;
	}

	static void method5103(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(8, (long) i);
		class572_sub12_sub11.method10338(2105708844);
		((GameTask) class572_sub12_sub11).p1 = 720886855 * i_3_;
		((GameTask) class572_sub12_sub11).p2 = i_4_ * 1921029481;
		((GameTask) class572_sub12_sub11).p3 = 449498681 * i_5_;
	}
}

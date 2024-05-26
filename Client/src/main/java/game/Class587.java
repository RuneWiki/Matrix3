package game;

/* Class587 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Hashtable;

public class Class587 {
	static boolean aBool7780 = false;
	static Hashtable aHashtable7781 = new Hashtable(16);
	static int anInt7782;
	public static Class236 aClass236_7783;

	Class587() throws Throwable {
		throw new Error();
	}

	static final void method6959(Cs2Executor class441, int i) {
		Class572_Sub12_Sub10 class572_sub12_sub10 = ScriptVarType.method3828(1764985841);
		if (Class572_Sub8.method8393(class572_sub12_sub10, -2036007022) == 4) {
			LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get(class572_sub12_sub10.method10330(-100374385))));
			if (class572_sub9 != null) {
				((Cs2Executor) class441).entity = (Entity) class572_sub9.anObject9081;
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = 1;
				return;
			}
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	static final void method6960(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (i_0_ == -1)
			throw new RuntimeException();
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_0_, -2007930914));
		if (ScriptVarType.aClass283_3261 != class645.aClass283_8314)
			throw new RuntimeException();
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class645.method7638(string, -240618259) ? 1 : 0;
	}

	static final void method6961(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9182((byte) -26) ? 1 : 0;
	}

	static void method6962(Interface61 interface61, byte i) {
		while (Class529.aLinkedList5904.size() > 10)
			Class529.aLinkedList5904.remove();
		Class529.aLinkedList5904.add(interface61);
	}

	static final void method6963(Cs2Executor class441, byte i) {
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) != 0);
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831 != null)
			Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831.method5601(bool, (short) 9474);
	}

	static void method6964(Class662 class662, int i) {
		Class16.aClass662_129 = class662;
	}

	public static void method6965(int i, int i_1_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(6, (long) i);
		class572_sub12_sub11.method10384(-1966910761);
	}

	static void method6966(int i, int i_2_, int i_3_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(14, 0L);
		class572_sub12_sub11.method10338(1488461873);
		((GameTask) class572_sub12_sub11).p1 = i * 720886855;
		((GameTask) class572_sub12_sub11).p2 = i_2_ * 1921029481;
	}
}

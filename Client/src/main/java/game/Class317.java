package game;

/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.LinkedList;

public class Class317 implements Interface56 {
	public static Class248 aClass248_3872;

	public String method318(Class447 class447, int[] is, long l) {
		if (class447 == Class447.aClass447_5153) {
			Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(is[0], -449135521));
			return class645.method7632((int) l, -756724828);
		}
		if (class447 == Class447.aClass447_5149 || class447 == Class447.aClass447_5145) {
			ItemDefinitions class631 = (ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition((int) l, 1148162173);
			return class631.aString8180;
		}
		if (class447 == Class447.aClass447_5140 || class447 == Class447.aClass447_5141 || Class447.aClass447_5144 == class447)
			return ((Class645) Class81.aClass639_Sub8_1078.getDefinition(is[0], -2122808494)).method7632((int) l, -756724828);
		return null;
	}

	public String method319(Class447 class447, int[] is, long l) {
		if (class447 == Class447.aClass447_5153) {
			Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(is[0], 1335372644));
			return class645.method7632((int) l, -756724828);
		}
		if (class447 == Class447.aClass447_5149 || class447 == Class447.aClass447_5145) {
			ItemDefinitions class631 = (ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition((int) l, 2086493520);
			return class631.aString8180;
		}
		if (class447 == Class447.aClass447_5140 || class447 == Class447.aClass447_5141 || Class447.aClass447_5144 == class447)
			return ((Class645) Class81.aClass639_Sub8_1078.getDefinition(is[0], -1545567266)).method7632((int) l, -756724828);
		return null;
	}

	public String method317(Class447 class447, int[] is, long l) {
		if (class447 == Class447.aClass447_5153) {
			Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(is[0], -1235110922));
			return class645.method7632((int) l, -756724828);
		}
		if (class447 == Class447.aClass447_5149 || class447 == Class447.aClass447_5145) {
			ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition((int) l, 217986179));
			return class631.aString8180;
		}
		if (class447 == Class447.aClass447_5140 || class447 == Class447.aClass447_5141 || Class447.aClass447_5144 == class447)
			return ((Class645) Class81.aClass639_Sub8_1078.getDefinition(is[0], 2122790712)).method7632((int) l, -756724828);
		return null;
	}

	public static void method4084(Class248 class248, Class248 class248_0_, Class248 class248_1_, Class248 class248_2_, int i) {
		Class306.aClass248_3544 = class248;
		Class297.aClass248_3475 = class248_0_;
		Class419.aClass248_4949 = class248_1_;
		Class534.aClass83Array5975 = new Class83[Class306.aClass248_3544.method3377(1056717355)];
		Class572_Sub12_Sub2.aBoolArray11253 = new boolean[Class306.aClass248_3544.method3377(729709335)];
	}

	static final void method4085(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.anInt787 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -310585063;
		Class555.method6575(class73, (short) 11511);
	}

	static final void method4086(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_3_ % i_4_;
	}

	static final void method4087(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aBool8602 ? 1 : 0;
	}

	static void method4088(int[] is, LinkedList linkedlist, int i, int i_5_, float f, byte i_6_) {
		if (!linkedlist.isEmpty()) {
			for (int i_7_ = 0; i_7_ < linkedlist.size(); i_7_++) {
				Class521 class521 = (Class521) linkedlist.get(i_7_);
				int i_8_ = i + (int) ((float) (-416284187 * ((Class521) class521).anInt5819) * f);
				int i_9_ = i_5_ + (int) ((float) (86708873 * ((Class521) class521).anInt5818) * f);
				int i_10_ = (int) ((float) (((Class521) class521).anInt5820 * 1375922641) * f);
				int i_11_ = (int) (f * (float) (((Class521) class521).anInt5821 * 1970425925));
				if (i_8_ < -178850837 * Class418.anInt4946 && i_9_ < 665552453 * Class67.anInt692) {
					if (i_8_ + i_10_ > -178850837 * Class418.anInt4946)
						i_10_ = Class418.anInt4946 * -178850837 - i_8_;
					if (i_11_ + i_9_ > Class67.anInt692 * 665552453)
						i_11_ = Class67.anInt692 * 665552453 - i_9_;
					for (int i_12_ = i_9_; i_12_ < i_9_ + i_11_; i_12_++) {
						int i_13_ = i_8_ + -178850837 * Class418.anInt4946 * i_12_;
						Arrays.fill(is, i_13_, i_10_ + i_13_, -16777216);
					}
				}
			}
		}
	}

	static final void method4089(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class594.method7026(class73, class83, class441, 1480453799);
	}
}

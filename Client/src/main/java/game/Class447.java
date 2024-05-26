package game;

/* Class447 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Desktop;
import java.net.URI;

public class Class447 {
	public static Class447 aClass447_5140;
	public static Class447 aClass447_5141;
	static Class447 aClass447_5142;
	static Class447 aClass447_5143;
	public static Class447 aClass447_5144;
	public static Class447 aClass447_5145;
	static Class447 aClass447_5146;
	static Class447 aClass447_5147;
	public int anInt5148;
	public static Class447 aClass447_5149;
	static Class447 aClass447_5150;
	static Class447 aClass447_5151;
	static Class447 aClass447_5152;
	public static Class447 aClass447_5153 = new Class447(0, 2, 2, 1);
	public int anInt5154;
	public int anInt5155;
	static Class447 aClass447_5156;
	public int anInt5157;

	static {
		aClass447_5149 = new Class447(1, 2, 2, 0);
		aClass447_5142 = new Class447(2, 4, 4, 0);
		aClass447_5143 = new Class447(4, 1, 1, 1);
		aClass447_5140 = new Class447(6, 0, 4, 2);
		aClass447_5141 = new Class447(7, 0, 1, 1);
		aClass447_5146 = new Class447(8, 0, 4, 1);
		aClass447_5147 = new Class447(9, 0, 4, 1);
		aClass447_5145 = new Class447(10, 2, 2, 0);
		aClass447_5144 = new Class447(11, 0, 1, 2);
		aClass447_5150 = new Class447(12, 0, 1, 0);
		aClass447_5151 = new Class447(13, 0, 1, 0);
		aClass447_5152 = new Class447(14, 0, 4, 1);
		aClass447_5156 = new Class447(15, 0, 1, 0);
	}

	Class447(int i, int i_0_, int i_1_, int i_2_) {
		anInt5154 = -583331567 * i;
		anInt5155 = i_0_ * -1145369643;
		anInt5157 = i_1_ * -1174034005;
		anInt5148 = i_2_ * 1069735859;
	}

	static final void method5342(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt796 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 995510709;
	}

	static final void method5343(Cs2Executor class441, int i) {
		Class255.method3524((String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]), 1421105533);
	}

	static final void method5344(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (null != client.aString8887 && i_3_ < Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class328.aClass196Array4209[i_3_].anInt2351 * 429736805;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method5345(Cs2Executor class441, byte i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class78 class78 = ((Class78) Class323.aClass639_Sub12_4081.getDefinition(i_4_, 218614458));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1430206655 * class78.anInt980;
	}

	static void method5346(int i) {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(476439547) == 1)
			Class204.aClass602_2411.method7076(new Class598((Class569.aClass569_6389), null), -1235355990);
		else {
			client.aClass613_8605.method7302(-64840423);
			Class556.method6584(-753758896);
		}
	}

	public static void method5347(String string, boolean bool, String string_5_, boolean bool_6_, int i) {
		if (bool) {
			do {
				if (!bool_6_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (Class590.aString7808.startsWith("win") && !bool_6_)
				Class162.method2652(string, 0, 1739995432);
			else if (Class590.aString7808.startsWith("mac"))
				Class177.method2762(string, 1, string_5_, 483269835);
			else
				Class162.method2652(string, 2, 1058617637);
		} else
			Class162.method2652(string, 3, 1064772696);
	}

	static ItemsContainer getContainer(int key, boolean split, int dummy) {
		long l = (long) (key | (split ? -2147483648 : 0));
		return (ItemsContainer) ItemsContainer.containers.get(l);
	}

	static final void method5349(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_8_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_9_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (i_8_ > 700 || i_9_ > 700)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 256;
		double d = ((Math.random() * (double) (i_9_ + i_8_) - (double) i_8_ + 800.0) / 100.0);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (Math.pow(2.0, d) + 0.5);
	}
}

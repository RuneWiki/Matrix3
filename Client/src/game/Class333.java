package game;

/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

public class Class333 implements Interface50 {
	Class292 aClass292_4256;

	public void method110() {
		/* empty */
	}

	public void method300(boolean bool, int i) {
		if (bool)
			Class272_Sub2.aClass106_9517.method1725(0, 0, 1960824389 * Class269.anInt2861, -530390519 * Class584.anInt7739, ((Class333) this).aClass292_4256.anInt3447 * -810115049, 0);
	}

	public void method299(short i) {
		/* empty */
	}

	Class333(Class292 class292) {
		((Class333) this).aClass292_4256 = class292;
	}

	public void method149() {
		/* empty */
	}

	public void method298() {
		/* empty */
	}

	public void method38() {
		/* empty */
	}

	public void method103() {
		/* empty */
	}

	public boolean method301() {
		return true;
	}

	public void method112() {
		/* empty */
	}

	public boolean method297(int i) {
		return true;
	}

	public void method302(boolean bool) {
		if (bool)
			Class272_Sub2.aClass106_9517.method1725(0, 0, 1960824389 * Class269.anInt2861, -530390519 * Class584.anInt7739, ((Class333) this).aClass292_4256.anInt3447 * -810115049, 0);
	}

	public void method303(boolean bool) {
		if (bool)
			Class272_Sub2.aClass106_9517.method1725(0, 0, 1960824389 * Class269.anInt2861, -530390519 * Class584.anInt7739, ((Class333) this).aClass292_4256.anInt3447 * -810115049, 0);
	}

	public static void method4180(Applet applet, String string, int i) {
		Class590.anApplet7809 = applet;
		Class590.aString7808 = string;
	}

	static void method4181(short i) {
		Class502.anIntArray5556 = Class289_Sub2.method8866(2048, 35, 8, 8, 4, 0.4F, true, -650553803);
	}

	static final void method4182(Cs2Executor class441, short i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 3709);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class288.method3880(class73, class83, class441, 2037671698);
	}

	static final void method4183(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -590989849) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray870 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method4184(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class574.method6808(1161105148) ? 1 : 0;
	}

	static final void method4185(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class288.method3882(class73, class83, class441, 1460827715);
	}
}

package game;

/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class76 implements Iterator {
	int anInt944;
	Class202_Sub1_Sub1 this$0;
	static Class651 aClass651_945;
	public static Class248 aClass248_946;

	Class76(Class202_Sub1_Sub1 class202_sub1_sub1) {
		((Class76) this).this$0 = class202_sub1_sub1;
	}

	public void method1143() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return (((Class76) this).anInt944 * 980857933 < ((Class76) this).this$0.method113((byte) 79));
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public Object next() {
		int i = (((Class76) this).anInt944 += 2107614341) * 980857933 - 1;
		Class179_Sub2 class179_sub2 = (Class179_Sub2) ((Class202_Sub1_Sub1) ((Class76) this).this$0).aClass127_11244.method2246((long) i);
		if (class179_sub2 != null)
			return class179_sub2;
		return ((Class76) this).this$0.method10197(i, (byte) -27);
	}

	public boolean method1144() {
		return (((Class76) this).anInt944 * 980857933 < ((Class76) this).this$0.method113((byte) 47));
	}

	public Object method1145() {
		int i = (((Class76) this).anInt944 += 2107614341) * 980857933 - 1;
		Class179_Sub2 class179_sub2 = (Class179_Sub2) ((Class202_Sub1_Sub1) ((Class76) this).this$0).aClass127_11244.method2246((long) i);
		if (class179_sub2 != null)
			return class179_sub2;
		return ((Class76) this).this$0.method10197(i, (byte) -41);
	}

	public boolean method1146() {
		return (((Class76) this).anInt944 * 980857933 < ((Class76) this).this$0.method113((byte) 73));
	}

	public Object method1147() {
		int i = (((Class76) this).anInt944 += 2107614341) * 980857933 - 1;
		Class179_Sub2 class179_sub2 = (Class179_Sub2) ((Class202_Sub1_Sub1) ((Class76) this).this$0).aClass127_11244.method2246((long) i);
		if (class179_sub2 != null)
			return class179_sub2;
		return ((Class76) this).this$0.method10197(i, (byte) 8);
	}

	public void method1148() {
		throw new UnsupportedOperationException();
	}

	public static void method1149(int i) {
		Class305.method4011(-463867172);
	}

	static final void method1150(Cs2Executor class441, int i) {
		String string;
		if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.displayName != null))
			string = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10697(true, 708647843);
		else
			string = "";
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}

	static final void method1151(Cs2Executor class441, int i) {
		if (Class637.aBool8266 && null != Class554.aFrame6320)
			Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(1562665826), -1, -1, false, 623786968);
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1);
		String string_0_ = new StringBuilder().append(Class102_Sub4.method9866(5011067)).append(string).toString();
		Class611.method7271(string_0_, bool, client.aBool8621, (byte) -7);
	}

	public static final InterfaceDefinitions method1152(Class83 class83, InterfaceDefinitions class73, short i) {
		if (-1604592419 * class73.anInt768 != -1)
			return class83.method1256(-1604592419 * class73.anInt768, -204463553);
		if (!class83.aBool1079) {
			int i_1_ = class73.selfId * -1718435171 >>> 16;
			Class629 class629 = new Class629(client.aClass676_8760);
			for (Class572_Sub29 class572_sub29 = (Class572_Sub29) class629.method7505(-38616757); class572_sub29 != null; class572_sub29 = (Class572_Sub29) class629.next()) {
				if (i_1_ == class572_sub29.anInt9301 * 493419501)
					return Class512.method6083((int) (class572_sub29.hash * 381237825124074065L), (short) -10134);
			}
		}
		return null;
	}

	static final void method1153(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aBool8559 ? 1 : 0;
	}
}

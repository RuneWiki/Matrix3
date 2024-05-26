package game;

/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

class Class473 implements Iterator {
	int anInt5311;
	Class202_Sub1_Sub2 this$0;
	static int anInt5312;

	public void remove() {
		throw new UnsupportedOperationException();
	}

	public boolean hasNext() {
		return (-1270282331 * ((Class473) this).anInt5311 < ((Class473) this).this$0.method113((byte) 59));
	}

	public boolean method5588() {
		return (-1270282331 * ((Class473) this).anInt5311 < ((Class473) this).this$0.method113((byte) 38));
	}

	public Object next() {
		int i = (((Class473) this).anInt5311 += -611153875) * -1270282331 - 1;
		Class179_Sub1 class179_sub1 = (Class179_Sub1) ((Class202_Sub1_Sub2) ((Class473) this).this$0).aClass127_11245.method2246((long) i);
		if (class179_sub1 != null)
			return class179_sub1;
		return ((Class473) this).this$0.method10209(i, 1030335819);
	}

	public boolean method5589() {
		return (-1270282331 * ((Class473) this).anInt5311 < ((Class473) this).this$0.method113((byte) 15));
	}

	Class473(Class202_Sub1_Sub2 class202_sub1_sub2) {
		((Class473) this).this$0 = class202_sub1_sub2;
	}

	public Object method5590() {
		int i = (((Class473) this).anInt5311 += -611153875) * -1270282331 - 1;
		Class179_Sub1 class179_sub1 = (Class179_Sub1) ((Class202_Sub1_Sub2) ((Class473) this).this$0).aClass127_11245.method2246((long) i);
		if (class179_sub1 != null)
			return class179_sub1;
		return ((Class473) this).this$0.method10209(i, 1219063356);
	}

	public Object method5591() {
		int i = (((Class473) this).anInt5311 += -611153875) * -1270282331 - 1;
		Class179_Sub1 class179_sub1 = (Class179_Sub1) ((Class202_Sub1_Sub2) ((Class473) this).this$0).aClass127_11245.method2246((long) i);
		if (class179_sub1 != null)
			return class179_sub1;
		return ((Class473) this).this$0.method10209(i, 2072658010);
	}

	public void method5592() {
		throw new UnsupportedOperationException();
	}

	public void method5593() {
		throw new UnsupportedOperationException();
	}

	static final void method5594(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -25474);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class519.method6169(class73, class83, class441, 599957025);
	}

	static void method5595(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, int i_14_, short i_15_) {
		if (i_1_ != 0 && i_3_ != -1) {
			Entity class456_sub1_sub2_sub3 = null;
			if (i_1_ < 0) {
				int i_16_ = -i_1_ - 1;
				if (i_16_ == -1921142451 * client.anInt8728)
					class456_sub1_sub2_sub3 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
				else
					class456_sub1_sub2_sub3 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_16_];
			} else {
				int i_17_ = i_1_ - 1;
				LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_17_));
				if (null != class572_sub9)
					class456_sub1_sub2_sub3 = (Entity) class572_sub9.anObject9081;
			}
			if (null != class456_sub1_sub2_sub3) {
				Class538 class538 = class456_sub1_sub2_sub3.method10554((byte) -37);
				if (null != class538.anIntArrayArray6025 && class538.anIntArrayArray6025[i_3_] != null)
					i_4_ -= class538.anIntArrayArray6025[i_3_][1];
				if (null != class538.anIntArrayArray6029 && null != class538.anIntArrayArray6029[i_3_])
					i_4_ -= class538.anIntArrayArray6029[i_3_][1];
			}
		}
		Class456_Sub1_Sub2_Sub5 class456_sub1_sub2_sub5 = new Class456_Sub1_Sub2_Sub5(client.aClass613_8605.method7285(1391677973), i, Class653.anInt8399 * 445399373, 445399373 * Class653.anInt8399, i_6_, i_7_, i_4_, client.cycles + i_10_, client.cycles + i_11_, i_12_, i_13_, i_1_, i_2_, i_5_, bool, i_3_, i_14_);
		class456_sub1_sub2_sub5.method10636(i_8_, i_9_, Class314.method4072(i_8_, i_9_, 445399373 * Class653.anInt8399, -2012686148) - i_5_, i_10_ + client.cycles, (byte) -88);
		client.aClass675_8774.method7940(new Class572_Sub12_Sub6(class456_sub1_sub2_sub5), -1798882980);
	}

	static void method5596(int i, int i_18_, int i_19_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(15, (long) i);
		class572_sub12_sub11.method10338(1643693564);
		((GameTask) class572_sub12_sub11).p1 = i_18_ * 720886855;
	}

	static final void method5597(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_20_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_21_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		Class284 class284 = Class549_Sub1.method8097(Class88.aClass248_1226, i_21_, 0, 707569257);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class284.method3841(string, i_20_, Class14.aClass161Array123, -655235768);
	}
}

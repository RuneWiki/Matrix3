package game;

/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class Class433 {
	Class433() throws Throwable {
		throw new Error();
	}

	static final void method5248(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 256);
		Class531.method6344(class73, class441, (byte) 4);
	}

	static final void method5249(int i) {
		Iterator iterator = client.aClass676_8747.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub9 class572_sub12_sub9 = (Class572_Sub12_Sub9) iterator.next();
			Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390);
			class456_sub1_sub2_sub4.method10596(1, -742411485);
			if (class456_sub1_sub2_sub4.method10613((byte) -33)) {
				class572_sub12_sub9.method6794((byte) -114);
				class456_sub1_sub2_sub4.method10601(-1880114430);
			}
		}
	}
}

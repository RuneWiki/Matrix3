package game;

/* Class521 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class521 {
	int anInt5818;
	int anInt5819;
	int anInt5820;
	int anInt5821;

	Class521(int i, int i_0_, int i_1_, int i_2_) {
		((Class521) this).anInt5819 = i * 1562203117;
		((Class521) this).anInt5818 = i_0_ * -1553464391;
		((Class521) this).anInt5820 = -1755443407 * i_1_;
		((Class521) this).anInt5821 = 1266172557 * i_2_;
	}

	public static void method6216(Interface36 interface36, Interface37 interface37, byte i) {
		Class491.anInt5478 = 0;
		Class491.anInt5474 = 0;
		Class491.aList5467 = new LinkedList();
		Class491.aClass591_Sub2_Sub1_Sub1Array5473 = new Class591_Sub2_Sub1_Sub1[1024];
		Class491.aClass485Array5470 = new Class485[1 + (Class100.anIntArray1291[-1664530185 * Class491.anInt5481])];
		Class491.anInt5479 = 0;
		Class491.anInt5472 = 0;
		Class491.anInterface37_5475 = interface37;
	}

	static final void method6217(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) -6080);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		Class665_Sub5.method8155(class73, class83, class441, ((Class251.aClass572_Sub10_2731 == (((Cs2Executor) class441).aClass572_Sub10_5104)) ? Class68.aClass68_701 : Class68.aClass68_698), -1038718982);
	}

	static final void method6218(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_4_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_5_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class315.getContainerCount(i_4_, i_5_, false, false, 1673613314);
	}

	public static boolean method6219(int i, byte i_6_) {
		return (i & -i) == i;
	}
}

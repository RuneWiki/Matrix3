package game;

/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class36 implements Interface59 {
	Class54 this$0;
	public static int anInt386;
	public static int anInt387;

	public void method370(Interface58 interface58) {
		if (null != interface58)
			((Class36) this).this$0.method981(1359613266).method2246((long) interface58.method335((byte) 12));
	}

	public void method371(Interface58 interface58, int i, int i_0_, boolean bool, byte i_1_) {
		((Class36) this).this$0.method918(-1086914451).add(interface58);
		if (bool)
			((Class36) this).this$0.method951(-936002491).method2229(interface58, (long) i_0_);
		else
			((Class36) this).this$0.method981(1417398106).method2230(interface58, (long) i_0_, interface58.method360((byte) -22), 684473005);
	}

	public void method367(Interface58 interface58, int i, int i_2_, boolean bool) {
		((Class36) this).this$0.method918(2086380431).add(interface58);
		if (bool)
			((Class36) this).this$0.method951(-1813966324).method2229(interface58, (long) i_2_);
		else
			((Class36) this).this$0.method981(84576672).method2230(interface58, (long) i_2_, interface58.method360((byte) -76), 170125701);
	}

	public void method368(Interface58 interface58, int i) {
		if (null != interface58)
			((Class36) this).this$0.method981(-388082335).method2246((long) interface58.method335((byte) 12));
	}

	Class36(Class54 class54) {
		((Class36) this).this$0 = class54;
	}

	public void method369(Interface58 interface58) {
		if (null != interface58)
			((Class36) this).this$0.method981(-601317235).method2246((long) interface58.method335((byte) 12));
	}

	static final void method785(Cs2Executor class441, int i) {
		InterfaceDefinitions class73 = Class512.method6083((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), (short) -4455);
		if (class73.aClass73Array916 == null)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else {
			int i_3_ = class73.aClass73Array916.length;
			for (int i_4_ = 0; i_4_ < class73.aClass73Array916.length; i_4_++) {
				if (class73.aClass73Array916[i_4_] == null) {
					i_3_ = i_4_;
					break;
				}
			}
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_3_;
		}
	}

	static void method786(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1]), 61701640))).method4669(Class133_Sub23.playerVarsProvider, -1204486986) ? 1 : 0);
	}
}

package game;

/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class162 implements Runnable {
	Class289_Sub2 this$0;

	Class162(Class289_Sub2 class289_sub2) {
		((Class162) this).this$0 = class289_sub2;
	}

	public void run() {
		try {
			while (!((Class289_Sub2) ((Class162) this).this$0).aBool9496) {
				HashMap hashmap = ((Class162) this).this$0.method8862(-924544693);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7216((byte) 20);
					}
				}
				Class198.method2977(50L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, 1307932328);
		}
	}

	public void method2651() {
		try {
			while (!((Class289_Sub2) ((Class162) this).this$0).aBool9496) {
				HashMap hashmap = ((Class162) this).this$0.method8862(1506005959);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7216((byte) 74);
					}
				}
				Class198.method2977(50L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, 738698137);
		}
	}

	static boolean method2652(String string, int i, int i_0_) {
		return Class177.method2762(string, i, "openjs", -1492843356);
	}

	static final void method2653(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607 == null ? 0 : 1;
	}

	static final void method2654(Cs2Executor class441, byte i) {
		long l = Class69.method1067(-2124083667);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (l / 86400000L) - 11745;
	}

	static final void method2655(Cs2Executor class441, byte i) {
		Class38.method791(2062209983);
	}

	static final void method2656(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class86.method1276(class73, class441, (byte) 0);
	}
}

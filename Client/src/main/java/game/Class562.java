package game;

/* Class562 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class562 implements Runnable {
	static int anInt6357;
	Class289_Sub1 this$0;

	Class562(Class289_Sub1 class289_sub1) {
		((Class562) this).this$0 = class289_sub1;
	}

	public void run() {
		try {
			while (!((Class289_Sub1) ((Class562) this).this$0).aBool9458) {
				Iterator iterator = ((Class289_Sub1) ((Class562) this).this$0).aList9451.iterator();
				while (iterator.hasNext()) {
					Class560 class560 = (Class560) iterator.next();
					class560.method6614((byte) -89);
				}
				HashMap hashmap = ((Class562) this).this$0.method8823(113667469);
				Iterator iterator_0_ = hashmap.keySet().iterator();
				while (iterator_0_.hasNext()) {
					Class612 class612 = (Class612) iterator_0_.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7216((byte) -29);
					}
				}
				iterator_0_ = ((Class289_Sub1) ((Class562) this).this$0).aList9451.iterator();
				while (iterator_0_.hasNext()) {
					Class560 class560 = (Class560) iterator_0_.next();
					class560.method6606(1076030252);
				}
				Class198.method2977(6L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, 162036293);
			exception.printStackTrace();
		}
	}

	public void method6633() {
		try {
			while (!((Class289_Sub1) ((Class562) this).this$0).aBool9458) {
				Iterator iterator = ((Class289_Sub1) ((Class562) this).this$0).aList9451.iterator();
				while (iterator.hasNext()) {
					Class560 class560 = (Class560) iterator.next();
					class560.method6614((byte) -29);
				}
				HashMap hashmap = ((Class562) this).this$0.method8823(1231894112);
				Iterator iterator_1_ = hashmap.keySet().iterator();
				while (iterator_1_.hasNext()) {
					Class612 class612 = (Class612) iterator_1_.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7216((byte) 46);
					}
				}
				iterator_1_ = ((Class289_Sub1) ((Class562) this).this$0).aList9451.iterator();
				while (iterator_1_.hasNext()) {
					Class560 class560 = (Class560) iterator_1_.next();
					class560.method6606(-1039432927);
				}
				Class198.method2977(6L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, -65210274);
			exception.printStackTrace();
		}
	}

	static final void method6634(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1346099025) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray886 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method6635(Cs2Executor class441, byte i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub29_9212, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1371079696);
		Class623.method7443(-1835632604);
		client.aBool8854 = false;
	}

	static int method6636(CharSequence charsequence, char c, int i) {
		int i_2_ = 0;
		int i_3_ = charsequence.length();
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			if (charsequence.charAt(i_4_) == c)
				i_2_++;
		}
		return i_2_;
	}

	public static final void method6637(int i) {
		if (!client.aBool8682) {
			client.aFloat8679 += (-24.0F - client.aFloat8679) / 2.0F;
			client.aBool8685 = true;
			client.aBool8682 = true;
		}
	}
}

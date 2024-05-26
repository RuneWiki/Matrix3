package game;

/* Class557 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

class Class557 implements Runnable {
	static Class118[] aClass118Array6331;
	Class289_Sub1 this$0;

	public void method6588() {
		try {
			while (!((Class289_Sub1) ((Class557) this).this$0).aBool9458) {
				HashMap hashmap = ((Class557) this).this$0.method8823(-2127112208);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7230(1493071683);
					}
				}
				Class198.method2977(10L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, 2018525650);
			exception.printStackTrace();
		}
	}

	public void run() {
		try {
			while (!((Class289_Sub1) ((Class557) this).this$0).aBool9458) {
				HashMap hashmap = ((Class557) this).this$0.method8823(-1980964774);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7230(-1114194334);
					}
				}
				Class198.method2977(10L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, 227720319);
			exception.printStackTrace();
		}
	}

	Class557(Class289_Sub1 class289_sub1) {
		((Class557) this).this$0 = class289_sub1;
	}

	public static void method6589(byte i) {
		synchronized (Class531.aStack5931) {
			Class531.aStack5931 = new Stack();
		}
	}

	static final void method6590(Cs2Executor class441, short i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr]);
		String string_1_ = (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr + 1]);
		if (string.length() <= 500 && string_1_.length() <= 500)
			Class210.method3052(i_0_, string, string_1_, (byte) 37);
	}

	public static boolean method6591(int i) {
		do {
			boolean bool;
			try {
				if (IcmpService_Sub1.available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (IcmpService_Sub1.anIcmpService_Sub1_8973 != null)
			throw new IllegalStateException("");
		IcmpService_Sub1.anIcmpService_Sub1_8973 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class476());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static int method6592(int i) {
		return (Class520.aTwitchWebcamDeviceArray5812 == null ? 0 : Class520.aTwitchWebcamDeviceArray5812.length);
	}

	public static void method6593(String[] strings, int[] is, int i) {
		Class7.method507(strings, is, 0, strings.length - 1, -1359086429);
	}
}

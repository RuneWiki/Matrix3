package game;

/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Class455 implements Runnable {
	Object anObject5184 = new Object();
	Thread aThread5185;
	Queue aQueue5186 = new LinkedList();
	static int anInt5187;

	public Class455() {
		((Class455) this).aThread5185 = new Thread(this);
		((Class455) this).aThread5185.setDaemon(true);
		((Class455) this).aThread5185.start();
	}

	public Class461 method5379(String string, int i) {
		if (null == ((Class455) this).aThread5185)
			throw new IllegalStateException("");
		if (string == null)
			throw new IllegalArgumentException("");
		Class461 class461 = new Class461(string);
		method5381(class461, (byte) 93);
		return class461;
	}

	void method5380(Object object) {
		synchronized (((Class455) this).aQueue5186) {
			((Class455) this).aQueue5186.add(object);
			((Class455) this).aQueue5186.notify();
		}
	}

	void method5381(Object object, byte i) {
		synchronized (((Class455) this).aQueue5186) {
			((Class455) this).aQueue5186.add(object);
			((Class455) this).aQueue5186.notify();
		}
	}

	public void method5382(int i) {
		if (((Class455) this).aThread5185 != null) {
			method5381(((Class455) this).anObject5184, (byte) 7);
			try {
				((Class455) this).aThread5185.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			((Class455) this).aThread5185 = null;
		}
	}

	public void method5383() {
		for (;;) {
			Class461 class461;
			synchronized (((Class455) this).aQueue5186) {
				Object object;
				for (object = ((Class455) this).aQueue5186.poll(); null == object; object = ((Class455) this).aQueue5186.poll()) {
					try {
						((Class455) this).aQueue5186.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == ((Class455) this).anObject5184)
					break;
				class461 = (Class461) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(((Class461) class461).aString5215).getAddress();
				i = Ping.method764(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class461.anInt5216 = i * 489783823;
		}
	}

	public void method5384() {
		if (((Class455) this).aThread5185 != null) {
			method5381(((Class455) this).anObject5184, (byte) 9);
			try {
				((Class455) this).aThread5185.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			((Class455) this).aThread5185 = null;
		}
	}

	public void run() {
		for (;;) {
			Class461 class461;
			synchronized (((Class455) this).aQueue5186) {
				Object object;
				for (object = ((Class455) this).aQueue5186.poll(); null == object; object = ((Class455) this).aQueue5186.poll()) {
					try {
						((Class455) this).aQueue5186.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == ((Class455) this).anObject5184)
					break;
				class461 = (Class461) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(((Class461) class461).aString5215).getAddress();
				i = Ping.method764(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class461.anInt5216 = i * 489783823;
		}
	}

	void method5385(Object object) {
		synchronized (((Class455) this).aQueue5186) {
			((Class455) this).aQueue5186.add(object);
			((Class455) this).aQueue5186.notify();
		}
	}

	public static Interface52 method5386(Class var_class, int i, int i_0_) {
		synchronized (Class442.aMap5130) {
			Map map = (Map) Class442.aMap5130.get(var_class);
			if (null == map) {
				map = new HashMap();
				Interface52[] interface52s = (Interface52[]) var_class.getEnumConstants();
				for (int i_1_ = 0; i_1_ < interface52s.length; i_1_++) {
					Interface52 interface52 = interface52s[i_1_];
					map.put(Integer.valueOf(interface52.getId(-705438404)), interface52);
				}
				Class442.aMap5130.put(var_class, map);
			}
			Interface52 interface52 = (Interface52) map.get(Integer.valueOf(i));
			return interface52;
		}
	}

	public static Interface52 method5387(Interface52[] interface52s, int i, int i_2_) {
		Interface52[] interface52s_3_ = interface52s;
		for (int i_4_ = 0; i_4_ < interface52s_3_.length; i_4_++) {
			Interface52 interface52 = interface52s_3_[i_4_];
			if (i == interface52.getId(-1746543396))
				return interface52;
		}
		return null;
	}

	static final void method5388(Cs2Executor class441, int i) {
		InterfaceDefinitions class73 = Class512.method6083((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), (short) -11816);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.nvmtheindexisotherone * 411192987;
	}

	public static void method5389(String[] strings, short[] is, byte i) {
		Class498.method5942(strings, is, 0, strings.length - 1, (byte) -35);
	}
}

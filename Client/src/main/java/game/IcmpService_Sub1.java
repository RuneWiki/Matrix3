package game;

/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.IcmpService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IcmpService_Sub1 extends IcmpService {
	List aList8972 = new ArrayList();
	static volatile IcmpService_Sub1 anIcmpService_Sub1_8973;

	public static boolean method8266() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_8973 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_8973 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class476());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	protected void notify(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8972.iterator();
		while (iterator.hasNext()) {
			Interface53 interface53 = (Interface53) iterator.next();
			interface53.method307(i == 0, 1860517677);
		}
	}

	protected void method7467(int i, int i_0_, int i_1_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8972.iterator();
		while (iterator.hasNext()) {
			Interface53 interface53 = (Interface53) iterator.next();
			interface53.method306(i, i_0_, i_1_, -1654654149);
		}
	}

	public static boolean method8267() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_8973 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_8973 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class476());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static boolean method8268() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_8973 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_8973 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class476());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static boolean method8269() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_8973 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_8973 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class476());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	protected void method7469(int i, int i_2_, int i_3_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8972.iterator();
		while (iterator.hasNext()) {
			Interface53 interface53 = (Interface53) iterator.next();
			interface53.method306(i, i_2_, i_3_, -2006878471);
		}
	}

	public static boolean method8270() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_8973 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_8973 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class476());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	IcmpService_Sub1() {
		/* empty */
	}

	public static void method8271() {
		if (anIcmpService_Sub1_8973 != null) {
			try {
				anIcmpService_Sub1_8973.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_8973 = null;
		}
	}

	protected void method7468(int i, int i_4_, int i_5_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8972.iterator();
		while (iterator.hasNext()) {
			Interface53 interface53 = (Interface53) iterator.next();
			interface53.method306(i, i_4_, i_5_, -1633751509);
		}
	}

	protected void method7465(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8972.iterator();
		while (iterator.hasNext()) {
			Interface53 interface53 = (Interface53) iterator.next();
			interface53.method307(i == 0, 1583246621);
		}
	}

	protected void method7466(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8972.iterator();
		while (iterator.hasNext()) {
			Interface53 interface53 = (Interface53) iterator.next();
			interface53.method307(i == 0, -909947748);
		}
	}

	public static boolean method8272() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_8973 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_8973 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class476());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	protected void notify(int i, int i_6_, int i_7_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList8972.iterator();
		while (iterator.hasNext()) {
			Interface53 interface53 = (Interface53) iterator.next();
			interface53.method306(i, i_6_, i_7_, -1905405699);
		}
	}

	public static void method8273() {
		if (anIcmpService_Sub1_8973 != null) {
			try {
				anIcmpService_Sub1_8973.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_8973 = null;
		}
	}

	static final void method8274(Cs2Executor class441, int i) {
		int i_8_ = Class203.method3004((byte) 0);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class200.anInt2390 = Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(2145833934) * 674431939) * -81165077;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_8_;
		Class301.method3994((byte) 95);
		client.aClass613_8605.method7302(363570464);
		Class623.method7443(-1004215214);
		client.aBool8854 = false;
	}
}

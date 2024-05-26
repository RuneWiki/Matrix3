package game;

/* Class276 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class276 {
	Comparator aComparator2920 = new Class618(this);
	Map aMap2921;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_2922;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_2923;
	long aLong2924;
	Class625 aClass625_2925;
	int anInt2926;
	public static int anInt2927;

	Class276(long l, int i, Class625 class625) {
		((Class276) this).aLong2924 = -6216440899769659283L * l;
		((Class276) this).anInt2926 = i * -2014869675;
		((Class276) this).aClass625_2925 = class625;
		if (((Class276) this).anInt2926 * -1859109379 == -1) {
			((Class276) this).aMap2921 = new HashMap(64);
			((Class276) this).anAbstractQueue_Sub1_2922 = new AbstractQueue_Sub1(64, ((Class276) this).aComparator2920);
			((Class276) this).anAbstractQueue_Sub1_2923 = null;
		} else {
			if (((Class276) this).aClass625_2925 == null)
				throw new IllegalArgumentException("");
			((Class276) this).aMap2921 = new HashMap(-1859109379 * ((Class276) this).anInt2926);
			((Class276) this).anAbstractQueue_Sub1_2922 = new AbstractQueue_Sub1((-1859109379 * ((Class276) this).anInt2926), ((Class276) this).aComparator2920);
			((Class276) this).anAbstractQueue_Sub1_2923 = new AbstractQueue_Sub1(((Class276) this).anInt2926 * -1859109379);
		}
	}

	boolean method3704(int i) {
		return -1859109379 * ((Class276) this).anInt2926 != -1;
	}

	public Object method3705(Object object, Object object_0_, int i) {
		synchronized (this) {
			if (-1L != 2308664042653317477L * ((Class276) this).aLong2924)
				method3711((byte) -5);
			Class285 class285 = (Class285) ((Class276) this).aMap2921.get(object);
			if (class285 != null) {
				Object object_1_ = ((Class285) class285).anObject3416;
				((Class285) class285).anObject3416 = object_0_;
				method3706(class285, false, -1794814275);
				Object object_2_ = object_1_;
				return object_2_;
			}
			if (method3704(-701367362) && (((Class276) this).aMap2921.size() == -1859109379 * ((Class276) this).anInt2926)) {
				Class285 class285_3_ = ((Class285) ((Class276) this).anAbstractQueue_Sub1_2923.remove());
				((Class276) this).aMap2921.remove(((Class285) class285_3_).anObject3417);
				((Class276) this).anAbstractQueue_Sub1_2922.remove(class285_3_);
			}
			Class285 class285_4_ = new Class285(object_0_, object);
			((Class276) this).aMap2921.put(object, class285_4_);
			method3706(class285_4_, true, -1689356113);
			Object object_5_ = null;
			return object_5_;
		}
	}

	void method3706(Class285 class285, boolean bool, int i) {
		if (!bool) {
			((Class276) this).anAbstractQueue_Sub1_2922.remove(class285);
			if (method3704(-1132592644) && !((Class276) this).anAbstractQueue_Sub1_2923.remove(class285))
				throw new IllegalStateException("");
		}
		((Class285) class285).aLong3418 = System.currentTimeMillis() * 5733812236646960389L;
		if (method3704(1983189648)) {
			switch (((Class625) ((Class276) this).aClass625_2925).anInt8081 * 1622662269) {
				case 1:
					((Class285) class285).aLong3415 = -2796098488275414689L * ((Class285) class285).aLong3418;
					break;
				case 0:
					((Class285) class285).aLong3415 += -4264868971227371045L;
					break;
			}
			((Class276) this).anAbstractQueue_Sub1_2923.add(class285);
		}
		((Class276) this).anAbstractQueue_Sub1_2922.add(class285);
	}

	public Object method3707(Object object, int i) {
		synchronized (this) {
			if (-1L != 2308664042653317477L * ((Class276) this).aLong2924)
				method3711((byte) -29);
			Class285 class285 = (Class285) ((Class276) this).aMap2921.get(object);
			if (class285 == null) {
				Object object_6_ = null;
				return object_6_;
			}
			method3706(class285, false, -1654294352);
			Object object_7_ = ((Class285) class285).anObject3416;
			return object_7_;
		}
	}

	boolean method3708() {
		return -1859109379 * ((Class276) this).anInt2926 != -1;
	}

	boolean method3709() {
		return -1859109379 * ((Class276) this).anInt2926 != -1;
	}

	boolean method3710() {
		return -1859109379 * ((Class276) this).anInt2926 != -1;
	}

	public Class276(int i, Class625 class625) {
		this(-1L, i, class625);
	}

	void method3711(byte i) {
		if (((Class276) this).aLong2924 * 2308664042653317477L == -1L)
			throw new IllegalStateException("");
		long l = (System.currentTimeMillis() - ((Class276) this).aLong2924 * 2308664042653317477L);
		while (!((Class276) this).anAbstractQueue_Sub1_2922.isEmpty()) {
			Class285 class285 = ((Class285) ((Class276) this).anAbstractQueue_Sub1_2922.peek());
			if (((Class285) class285).aLong3418 * 4489260702705940429L < l) {
				((Class276) this).aMap2921.remove(((Class285) class285).anObject3417);
				((Class276) this).anAbstractQueue_Sub1_2922.remove(class285);
				if (method3704(1490727561))
					((Class276) this).anAbstractQueue_Sub1_2923.remove(class285);
			} else
				break;
		}
	}

	void method3712() {
		if (((Class276) this).aLong2924 * 2308664042653317477L == -1L)
			throw new IllegalStateException("");
		long l = (System.currentTimeMillis() - ((Class276) this).aLong2924 * 2308664042653317477L);
		while (!((Class276) this).anAbstractQueue_Sub1_2922.isEmpty()) {
			Class285 class285 = ((Class285) ((Class276) this).anAbstractQueue_Sub1_2922.peek());
			if (((Class285) class285).aLong3418 * 4489260702705940429L < l) {
				((Class276) this).aMap2921.remove(((Class285) class285).anObject3417);
				((Class276) this).anAbstractQueue_Sub1_2922.remove(class285);
				if (method3704(-1294264753))
					((Class276) this).anAbstractQueue_Sub1_2923.remove(class285);
			} else
				break;
		}
	}

	static void method3713(int i) {
		Class13.aClass195_96.method2926((byte) -90);
		((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
		((Class195) Class13.aClass195_96).aClass321_2334 = null;
		((Class195) Class13.aClass195_96).aClass321_2342 = null;
		((Class195) Class13.aClass195_96).aClass321_2343 = null;
		((Class195) Class13.aClass195_96).anInt2335 = 0;
		client.anInt8604 = 0;
		Class439.method5277(-890147758);
		client.anInt8861 = 0;
		client.anInt8860 = 0;
		client.anInt8865 = 0;
		client.aString8887 = null;
		Class456_Sub1_Sub1_Sub1.anInt11558 = 0;
		Class328.aClass196Array4209 = null;
		Class210.aClass334_2440 = null;
		Class440.aClass334_5097 = null;
		Class671.method7884(-1189614347);
		for (int i_8_ = 0; i_8_ < (((Class197) Class133_Sub23.playerVarsProvider).aClass493Array2355).length; i_8_++) {
			Class493 class493 = new Class493(Class193.aClass487_2323.method5794(i_8_, 117919976), false);
			class493.method5876(0, (byte) 70);
			class493.method5880(0, 1976202559);
			((Class197) Class133_Sub23.playerVarsProvider).aClass493Array2355[i_8_] = class493;
		}
		Class133_Sub23.playerVarsProvider.domain.method6070((byte) 5);
		Class280.method3795((byte) 43);
		Class627.method7476(Class13.aClass195_96, (byte) -2);
	}

	static final void method3714(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static void method3715(int i, int i_9_) {
		if (176 == Class13.anInt64 * -298874073)
			Class13.anInt105 = i * 330342009;
		else if (210 == Class13.anInt64 * -298874073)
			Class13.anInt106 = 2080945329 * i;
	}

	static Class669[] method3716(int i) {
		return (new Class669[] { Class669.aClass669_8517, Class669.aClass669_8519, Class669.aClass669_8518 });
	}
}

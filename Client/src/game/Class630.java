package game;

/* Class630 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class630 implements Interface71 {
	Interface24 anInterface24_8112;
	Map aMap8113;
	public static Class248 aClass248_8114;

	public void method452(int i) {
		if (((Class630) this).aMap8113 != null)
			((Class630) this).aMap8113.remove(Integer.valueOf(i));
	}

	public Iterator iterator() {
		if (null == ((Class630) this).aMap8113)
			return Collections.emptyList().iterator();
		return ((Class630) this).aMap8113.values().iterator();
	}

	public void method437(int i, int i_0_, byte i_1_) {
		if (((Class630) this).aMap8113 == null) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Integer.valueOf(i_0_)));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Integer.valueOf(i_0_)));
			else
				class323.anObject4078 = Integer.valueOf(i_0_);
		}
	}

	public long method438(int i, short i_2_) {
		if (null != ((Class630) this).aMap8113) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return ((Long) class323.anObject4078).longValue();
		}
		return ((Long) ((Class630) this).anInterface24_8112.method134(i, (byte) -54)).longValue();
	}

	public void method439(int i, long l) {
		if (((Class630) this).aMap8113 == null) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Long.valueOf(l)));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Long.valueOf(l)));
			else
				class323.anObject4078 = Long.valueOf(l);
		}
	}

	public Object method134(int i, byte i_3_) {
		if (null != ((Class630) this).aMap8113) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return class323.anObject4078;
		}
		return ((Class630) this).anInterface24_8112.method134(i, (byte) -92);
	}

	public void method443(int i, Object object, int i_4_) {
		if (null == ((Class630) this).aMap8113) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
			else
				class323.anObject4078 = object;
		}
	}

	public void method22(byte i) {
		if (((Class630) this).aMap8113 != null)
			((Class630) this).aMap8113.clear();
	}

	public void method446(int i, byte i_5_) {
		if (((Class630) this).aMap8113 != null)
			((Class630) this).aMap8113.remove(Integer.valueOf(i));
	}

	public void method129() {
		if (((Class630) this).aMap8113 != null)
			((Class630) this).aMap8113.clear();
	}

	public Iterator method7517() {
		if (null == ((Class630) this).aMap8113)
			return Collections.emptyList().iterator();
		return ((Class630) this).aMap8113.values().iterator();
	}

	public void method442(int i, int i_6_) {
		if (((Class630) this).aMap8113 == null) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Integer.valueOf(i_6_)));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Integer.valueOf(i_6_)));
			else
				class323.anObject4078 = Integer.valueOf(i_6_);
		}
	}

	public int method455(int i) {
		if (((Class630) this).aMap8113 != null) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return ((Integer) class323.anObject4078).intValue();
		}
		return ((Integer) ((Class630) this).anInterface24_8112.method134(i, (byte) -85)).intValue();
	}

	public long method451(int i) {
		if (null != ((Class630) this).aMap8113) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return ((Long) class323.anObject4078).longValue();
		}
		return ((Long) ((Class630) this).anInterface24_8112.method134(i, (byte) -24)).longValue();
	}

	public void method436(int i, Object object) {
		if (null == ((Class630) this).aMap8113) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
			else
				class323.anObject4078 = object;
		}
	}

	public Object method441(int i) {
		if (null != ((Class630) this).aMap8113) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return class323.anObject4078;
		}
		return ((Class630) this).anInterface24_8112.method134(i, (byte) 38);
	}

	public void method447(int i, Object object) {
		if (null == ((Class630) this).aMap8113) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
			else
				class323.anObject4078 = object;
		}
	}

	public int method450(int i, int i_7_) {
		if (((Class630) this).aMap8113 != null) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return ((Integer) class323.anObject4078).intValue();
		}
		return ((Integer) ((Class630) this).anInterface24_8112.method134(i, (byte) -107)).intValue();
	}

	public long method444(int i) {
		if (null != ((Class630) this).aMap8113) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return ((Long) class323.anObject4078).longValue();
		}
		return ((Long) ((Class630) this).anInterface24_8112.method134(i, (byte) -2)).longValue();
	}

	public void method440(int i, Object object) {
		if (null == ((Class630) this).aMap8113) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
			else
				class323.anObject4078 = object;
		}
	}

	public void method445(int i, Object object) {
		if (null == ((Class630) this).aMap8113) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, object));
			else
				class323.anObject4078 = object;
		}
	}

	public void method449(int i) {
		if (((Class630) this).aMap8113 != null)
			((Class630) this).aMap8113.remove(Integer.valueOf(i));
	}

	public long method457(int i) {
		if (null != ((Class630) this).aMap8113) {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 != null)
				return ((Long) class323.anObject4078).longValue();
		}
		return ((Long) ((Class630) this).anInterface24_8112.method134(i, (byte) 61)).longValue();
	}

	public void method453(int i) {
		if (((Class630) this).aMap8113 != null)
			((Class630) this).aMap8113.remove(Integer.valueOf(i));
	}

	public void method454(int i) {
		if (((Class630) this).aMap8113 != null)
			((Class630) this).aMap8113.remove(Integer.valueOf(i));
	}

	public Class630(Interface24 interface24) {
		((Class630) this).anInterface24_8112 = interface24;
	}

	public void method456(int i, long l) {
		if (((Class630) this).aMap8113 == null) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Long.valueOf(l)));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Long.valueOf(l)));
			else
				class323.anObject4078 = Long.valueOf(l);
		}
	}

	public void method448(int i, long l) {
		if (((Class630) this).aMap8113 == null) {
			((Class630) this).aMap8113 = new HashMap();
			((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Long.valueOf(l)));
		} else {
			Class323 class323 = ((Class323) ((Class630) this).aMap8113.get(Integer.valueOf(i)));
			if (class323 == null)
				((Class630) this).aMap8113.put(Integer.valueOf(i), new Class323(i, Long.valueOf(l)));
			else
				class323.anObject4078 = Long.valueOf(l);
		}
	}

	static final void method7518(Cs2Executor class441, short i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class665_Sub5.method8155(class73, class83, class441, Class68.aClass68_699, -2032497891);
	}

	public static int method7519(int i, int i_8_, boolean bool, int i_9_) {
		int i_10_ = 0;
		ItemsContainer class572_sub31 = Class447.getContainer(i, bool, -1914810257);
		if (class572_sub31 == null)
			return 0;
		for (int i_11_ = 0; i_11_ < ((ItemsContainer) class572_sub31).itemIds.length; i_11_++) {
			if (((ItemsContainer) class572_sub31).itemIds[i_11_] >= 0 && (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition((((ItemsContainer) class572_sub31).itemIds[i_11_]), 700060954)).anInt8124) * 1087891295 == i_8_)
				i_10_ += Class202_Sub1_Sub1.getContainerAmount(i, i_11_, bool, (byte) 0);
		}
		return i_10_;
	}
}

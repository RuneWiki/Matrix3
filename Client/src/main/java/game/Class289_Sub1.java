package game;

/* Class289_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class289_Sub1 extends Class289 {
	List aList9451;
	Runnable aRunnable9452;
	Class294 aClass294_9453;
	HashMap aHashMap9454;
	Thread aThread9455;
	Thread aThread9456;
	static final float aFloat9457 = 2.0F;
	volatile boolean aBool9458 = false;
	Runnable aRunnable9459;

	public Object method3888(int i, int i_0_, Class297 class297, Class298 class298, int i_1_, float f, byte i_2_) {
		Class560 class560 = method8822(f * (float) i_0_, 751536177);
		Class556 class556 = new Class556(this, class560, i_1_, f * (float) i_0_, class297.anInt3472 * -1700527127, i < 2 ? 2 : i, (class297 == Class297.aClass297_3470 || Class297.aClass297_3469 == class297), Class298.aClass298_3479 == class298);
		synchronized (((Class556) class556).aClass560_6325) {
			((Class556) class556).aClass560_6325.method6608(class556, (short) 8192);
		}
		return class556;
	}

	public Class289_Sub1(Class469 class469) {
		((Class289_Sub1) this).aList9451 = new ArrayList();
		((Class289_Sub1) this).aRunnable9452 = new Class562(this);
		((Class289_Sub1) this).aRunnable9459 = new Class557(this);
		((Class289_Sub1) this).aClass294_9453 = new Class294(this);
		((Class289_Sub1) this).aHashMap9454 = new HashMap();
		Iterator iterator = class469.aHashMap5276.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			((Class289_Sub1) this).aHashMap9454.put(class612, (new Class605[((Integer) class469.aHashMap5276.get(class612)).intValue()]));
		}
		iterator = ((Class289_Sub1) this).aHashMap9454.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			for (int i = 0; i < class605s.length; i++) {
				Class79 class79 = new Class79(2.0F);
				class79.method187(0, Class297.aClass297_3470, Class298.aClass298_3478, 2);
				class605s[i] = new Class605(class612, 8192, 3, class79, this);
			}
		}
		Class560 class560 = new Class560(this, 44100.0F, 32768);
		Class560 class560_3_ = new Class560(this, 22050.0F, 16384);
		((Class289_Sub1) this).aList9451.add(class560);
		((Class289_Sub1) this).aList9451.add(class560_3_);
		((Class289_Sub1) this).aThread9455 = new Thread(((Class289_Sub1) this).aRunnable9459);
		((Class289_Sub1) this).aThread9456 = new Thread(((Class289_Sub1) this).aRunnable9452);
		((Class289_Sub1) this).aThread9455.setPriority(10);
		((Class289_Sub1) this).aThread9456.setPriority(10);
		((Class289_Sub1) this).aThread9455.start();
		((Class289_Sub1) this).aThread9456.start();
	}

	public void method3887(byte i) {
		if (((Class289_Sub1) this).aClass294_9453 != null)
			((Class289_Sub1) this).aClass294_9453.method3953((short) 3743);
		Iterator iterator = ((Class289_Sub1) this).aHashMap9454.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			if (!class612.aBool7981) {
				boolean bool = false;
				for (int i_4_ = 0; i_4_ < class605s.length; i_4_++) {
					class605s[i_4_].method7168(1716426081);
					bool |= class605s[i_4_].method7244((byte) 0);
				}
				if (bool)
					Arrays.sort(class605s, new Class563(this));
			}
			int i_5_ = 6;
			boolean bool = false;
			int i_6_ = class605s.length - 1;
			while (!bool) {
				float f = class605s[i_6_].method7237((byte) 18);
				Class597 class597 = class605s[i_6_].method7152(-987437988);
				if (f < 0.0F) {
					if (Class597.aClass597_7844 == class597 || Class597.aClass597_7842 == class597 || class597 == Class597.aClass597_7845)
						class605s[i_6_].method7193(413814375);
				} else
					bool = true;
				if (--i_6_ < 0)
					bool = true;
			}
			if (i_6_ >= class605s.length - i_5_) {
				for (/**/; i_6_ >= class605s.length - i_5_; i_6_--) {
					Class597 class597 = class605s[i_6_].method7152(-987437988);
					if (Class597.aClass597_7844 == class597)
						class605s[i_6_].method7193(413814375);
				}
			}
		}
	}

	Class560 method8822(float f, int i) {
		float f_7_ = -1.0F;
		float f_8_ = 3.4028235E38F;
		Class560 class560 = null;
		Iterator iterator = ((Class289_Sub1) this).aList9451.iterator();
		while (iterator.hasNext()) {
			Class560 class560_9_ = (Class560) iterator.next();
			float f_10_ = ((Class560) class560_9_).aFloat6346;
			float f_11_ = Math.abs(f_10_ - f);
			if (f_7_ < 0.0F || f_11_ < f_8_) {
				f_7_ = f_10_;
				f_8_ = f_11_;
				class560 = class560_9_;
			}
		}
		return class560;
	}

	public Object method3907(int i, int i_12_, Class297 class297, Class298 class298, int i_13_, float f) {
		Class560 class560 = method8822(f * (float) i_12_, -998181659);
		Class556 class556 = new Class556(this, class560, i_13_, f * (float) i_12_, class297.anInt3472 * -1700527127, i < 2 ? 2 : i, (class297 == Class297.aClass297_3470 || Class297.aClass297_3469 == class297), Class298.aClass298_3479 == class298);
		synchronized (((Class556) class556).aClass560_6325) {
			((Class556) class556).aClass560_6325.method6608(class556, (short) 8192);
		}
		return class556;
	}

	public void method3899(Object object, int i) {
		if (object != null && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				((Class556) class556).aClass560_6325.method6615(class556, (short) 16383);
			}
		}
	}

	public void method3890(Object object, byte[] is, int i, int i_14_, int i_15_) {
		if (null != object && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				class556.method6578(is, i, i_14_, 1810773891);
			}
		}
	}

	public Class605 method3892(Class612 class612, byte i) {
		synchronized (((Class289_Sub1) this).aHashMap9454) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i_16_ = 0; i_16_ < class605s.length; i_16_++) {
				Class605 class605 = class605s[i_16_];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(2083288817);
					Class605 class605_17_ = class605;
					return class605_17_;
				}
			}
		}
		return null;
	}

	public void method3906() {
		if (((Class289_Sub1) this).aClass294_9453 != null)
			((Class289_Sub1) this).aClass294_9453.method3953((short) -26634);
		Iterator iterator = ((Class289_Sub1) this).aHashMap9454.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			if (!class612.aBool7981) {
				boolean bool = false;
				for (int i = 0; i < class605s.length; i++) {
					class605s[i].method7168(1685888316);
					bool |= class605s[i].method7244((byte) 0);
				}
				if (bool)
					Arrays.sort(class605s, new Class563(this));
			}
			int i = 6;
			boolean bool = false;
			int i_18_ = class605s.length - 1;
			while (!bool) {
				float f = class605s[i_18_].method7237((byte) 55);
				Class597 class597 = class605s[i_18_].method7152(-987437988);
				if (f < 0.0F) {
					if (Class597.aClass597_7844 == class597 || Class597.aClass597_7842 == class597 || class597 == Class597.aClass597_7845)
						class605s[i_18_].method7193(413814375);
				} else
					bool = true;
				if (--i_18_ < 0)
					bool = true;
			}
			if (i_18_ >= class605s.length - i) {
				for (/**/; i_18_ >= class605s.length - i; i_18_--) {
					Class597 class597 = class605s[i_18_].method7152(-987437988);
					if (Class597.aClass597_7844 == class597)
						class605s[i_18_].method7193(413814375);
				}
			}
		}
	}

	public Class294 method3894(int i) {
		return ((Class289_Sub1) this).aClass294_9453;
	}

	public void method3895(byte i) {
		HashMap hashmap = method8823(-444727955);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class612 class612 = (Class612) iterator.next();
				Class605[] class605s = (Class605[]) hashmap.get(class612);
				for (int i_19_ = 0; i_19_ < class605s.length; i_19_++) {
					if (class605s[i_19_].method7152(-987437988) != Class597.aClass597_7840) {
						class605s[i_19_].method7193(413814375);
						class605s[i_19_].method7157((byte) 0);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					Class605[] class605s = (Class605[]) hashmap.get(class612);
					for (int i_20_ = 0; i_20_ < class605s.length; i_20_++) {
						if (class605s[i_20_].method7152(-987437988) != Class597.aClass597_7840) {
							class605s[i_20_].method7168(1649313274);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub1) this).aBool9458 = true;
		try {
			((Class289_Sub1) this).aThread9455.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub1) this).aThread9456.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method3915() {
		if (((Class289_Sub1) this).aClass294_9453 != null)
			((Class289_Sub1) this).aClass294_9453.method3953((short) 6013);
		Iterator iterator = ((Class289_Sub1) this).aHashMap9454.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			if (!class612.aBool7981) {
				boolean bool = false;
				for (int i = 0; i < class605s.length; i++) {
					class605s[i].method7168(1779040334);
					bool |= class605s[i].method7244((byte) 0);
				}
				if (bool)
					Arrays.sort(class605s, new Class563(this));
			}
			int i = 6;
			boolean bool = false;
			int i_21_ = class605s.length - 1;
			while (!bool) {
				float f = class605s[i_21_].method7237((byte) 103);
				Class597 class597 = class605s[i_21_].method7152(-987437988);
				if (f < 0.0F) {
					if (Class597.aClass597_7844 == class597 || Class597.aClass597_7842 == class597 || class597 == Class597.aClass597_7845)
						class605s[i_21_].method7193(413814375);
				} else
					bool = true;
				if (--i_21_ < 0)
					bool = true;
			}
			if (i_21_ >= class605s.length - i) {
				for (/**/; i_21_ >= class605s.length - i; i_21_--) {
					Class597 class597 = class605s[i_21_].method7152(-987437988);
					if (Class597.aClass597_7844 == class597)
						class605s[i_21_].method7193(413814375);
				}
			}
		}
	}

	public Object method3898(int i, int i_22_, Class297 class297, Class298 class298, int i_23_, float f) {
		Class560 class560 = method8822(f * (float) i_22_, -1059684017);
		Class556 class556 = new Class556(this, class560, i_23_, f * (float) i_22_, class297.anInt3472 * -1700527127, i < 2 ? 2 : i, (class297 == Class297.aClass297_3470 || Class297.aClass297_3469 == class297), Class298.aClass298_3479 == class298);
		synchronized (((Class556) class556).aClass560_6325) {
			((Class556) class556).aClass560_6325.method6608(class556, (short) 8192);
		}
		return class556;
	}

	public Object method3911(int i, int i_24_, Class297 class297, Class298 class298, int i_25_, float f) {
		Class560 class560 = method8822(f * (float) i_24_, -1994935524);
		Class556 class556 = new Class556(this, class560, i_25_, f * (float) i_24_, class297.anInt3472 * -1700527127, i < 2 ? 2 : i, (class297 == Class297.aClass297_3470 || Class297.aClass297_3469 == class297), Class298.aClass298_3479 == class298);
		synchronized (((Class556) class556).aClass560_6325) {
			((Class556) class556).aClass560_6325.method6608(class556, (short) 8192);
		}
		return class556;
	}

	public Object method3900(int i, int i_26_, Class297 class297, Class298 class298, int i_27_, float f) {
		Class560 class560 = method8822(f * (float) i_26_, -1210043580);
		Class556 class556 = new Class556(this, class560, i_27_, f * (float) i_26_, class297.anInt3472 * -1700527127, i < 2 ? 2 : i, (class297 == Class297.aClass297_3470 || Class297.aClass297_3469 == class297), Class298.aClass298_3479 == class298);
		synchronized (((Class556) class556).aClass560_6325) {
			((Class556) class556).aClass560_6325.method6608(class556, (short) 8192);
		}
		return class556;
	}

	public Object method3901(int i, int i_28_, Class297 class297, Class298 class298, int i_29_, float f) {
		Class560 class560 = method8822(f * (float) i_28_, -1249259957);
		Class556 class556 = new Class556(this, class560, i_29_, f * (float) i_28_, class297.anInt3472 * -1700527127, i < 2 ? 2 : i, (class297 == Class297.aClass297_3470 || Class297.aClass297_3469 == class297), Class298.aClass298_3479 == class298);
		synchronized (((Class556) class556).aClass560_6325) {
			((Class556) class556).aClass560_6325.method6608(class556, (short) 8192);
		}
		return class556;
	}

	public Object method3902(int i, int i_30_, Class297 class297, Class298 class298, int i_31_, float f) {
		Class560 class560 = method8822(f * (float) i_30_, 1228057002);
		Class556 class556 = new Class556(this, class560, i_31_, f * (float) i_30_, class297.anInt3472 * -1700527127, i < 2 ? 2 : i, (class297 == Class297.aClass297_3470 || Class297.aClass297_3469 == class297), Class298.aClass298_3479 == class298);
		synchronized (((Class556) class556).aClass560_6325) {
			((Class556) class556).aClass560_6325.method6608(class556, (short) 8192);
		}
		return class556;
	}

	public int method3886(Object object, int i) {
		if (null != object && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				int i_32_ = class556.method6577(968417018);
				return i_32_;
			}
		}
		return 0;
	}

	HashMap method8823(int i) {
		return ((Class289_Sub1) this).aHashMap9454;
	}

	public void method3904(Object object) {
		if (object != null && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				((Class556) class556).aClass560_6325.method6615(class556, (short) 16383);
			}
		}
	}

	public void method3905(Object object) {
		if (object != null && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				((Class556) class556).aClass560_6325.method6615(class556, (short) 16383);
			}
		}
	}

	public void method3919(Object object, byte[] is, int i, int i_33_) {
		if (null != object && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				class556.method6578(is, i, i_33_, 2044981777);
			}
		}
	}

	Object method3912(Class374 class374) {
		return null;
	}

	Object method3908(Class374 class374) {
		return null;
	}

	public Class294 method3909() {
		return ((Class289_Sub1) this).aClass294_9453;
	}

	HashMap method8824() {
		return ((Class289_Sub1) this).aHashMap9454;
	}

	public Class294 method3891() {
		return ((Class289_Sub1) this).aClass294_9453;
	}

	public void method3917() {
		HashMap hashmap = method8823(-2069762383);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class612 class612 = (Class612) iterator.next();
				Class605[] class605s = (Class605[]) hashmap.get(class612);
				for (int i = 0; i < class605s.length; i++) {
					if (class605s[i].method7152(-987437988) != Class597.aClass597_7840) {
						class605s[i].method7193(413814375);
						class605s[i].method7157((byte) 0);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					Class605[] class605s = (Class605[]) hashmap.get(class612);
					for (int i = 0; i < class605s.length; i++) {
						if (class605s[i].method7152(-987437988) != Class597.aClass597_7840) {
							class605s[i].method7168(1773078564);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub1) this).aBool9458 = true;
		try {
			((Class289_Sub1) this).aThread9455.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub1) this).aThread9456.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public int method3897(Object object) {
		if (null != object && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				int i = class556.method6577(968417018);
				return i;
			}
		}
		return 0;
	}

	public void method3914() {
		HashMap hashmap = method8823(2097339021);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class612 class612 = (Class612) iterator.next();
				Class605[] class605s = (Class605[]) hashmap.get(class612);
				for (int i = 0; i < class605s.length; i++) {
					if (class605s[i].method7152(-987437988) != Class597.aClass597_7840) {
						class605s[i].method7193(413814375);
						class605s[i].method7157((byte) 0);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					Class605[] class605s = (Class605[]) hashmap.get(class612);
					for (int i = 0; i < class605s.length; i++) {
						if (class605s[i].method7152(-987437988) != Class597.aClass597_7840) {
							class605s[i].method7168(1806663602);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub1) this).aBool9458 = true;
		try {
			((Class289_Sub1) this).aThread9455.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub1) this).aThread9456.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Class294 method3910() {
		return ((Class289_Sub1) this).aClass294_9453;
	}

	public void method3913() {
		HashMap hashmap = method8823(516027853);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class612 class612 = (Class612) iterator.next();
				Class605[] class605s = (Class605[]) hashmap.get(class612);
				for (int i = 0; i < class605s.length; i++) {
					if (class605s[i].method7152(-987437988) != Class597.aClass597_7840) {
						class605s[i].method7193(413814375);
						class605s[i].method7157((byte) 0);
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					Class605[] class605s = (Class605[]) hashmap.get(class612);
					for (int i = 0; i < class605s.length; i++) {
						if (class605s[i].method7152(-987437988) != Class597.aClass597_7840) {
							class605s[i].method7168(1728894740);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub1) this).aBool9458 = true;
		try {
			((Class289_Sub1) this).aThread9455.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub1) this).aThread9456.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Class605 method3916(Class612 class612) {
		synchronized (((Class289_Sub1) this).aHashMap9454) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i = 0; i < class605s.length; i++) {
				Class605 class605 = class605s[i];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(1935601366);
					Class605 class605_34_ = class605;
					return class605_34_;
				}
			}
		}
		return null;
	}

	public Class605 method3918(Class612 class612) {
		synchronized (((Class289_Sub1) this).aHashMap9454) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i = 0; i < class605s.length; i++) {
				Class605 class605 = class605s[i];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(2109822578);
					Class605 class605_35_ = class605;
					return class605_35_;
				}
			}
		}
		return null;
	}

	public Class605 method3889(Class612 class612) {
		synchronized (((Class289_Sub1) this).aHashMap9454) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub1) this).aHashMap9454.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i = 0; i < class605s.length; i++) {
				Class605 class605 = class605s[i];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(1919873015);
					Class605 class605_36_ = class605;
					return class605_36_;
				}
			}
		}
		return null;
	}

	HashMap method8825() {
		return ((Class289_Sub1) this).aHashMap9454;
	}

	Object method3893(Class374 class374, byte i) {
		return null;
	}

	public int method3896(Object object) {
		if (null != object && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				int i = class556.method6577(968417018);
				return i;
			}
		}
		return 0;
	}

	public void method3903(Object object) {
		if (object != null && object instanceof Class556) {
			Class556 class556 = (Class556) object;
			synchronized (((Class556) class556).aClass560_6325) {
				((Class556) class556).aClass560_6325.method6615(class556, (short) 16383);
			}
		}
	}
}

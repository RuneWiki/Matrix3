package game;

/* Class289_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class289_Sub2 extends Class289 {
	Runnable aRunnable9493;
	HashMap aHashMap9494;
	static final float aFloat9495 = 2.0F;
	volatile boolean aBool9496 = false;
	Thread aThread9497;
	Runnable aRunnable9498;
	long aLong9499 = Class69.method1067(-1828397500) * 2295217492288050545L;
	Thread aThread9500;
	Class294 aClass294_9501;

	public int method3896(Object object) {
		long l = Class69.method1067(-1926128844);
		int i = (int) (180000.0F / ((float) (l - (-4221551043307074671L * ((Class289_Sub2) this).aLong9499)) / 1000.0F));
		((Class289_Sub2) this).aLong9499 = l * 2295217492288050545L;
		return i;
	}

	public Class289_Sub2(Class469 class469) {
		((Class289_Sub2) this).aRunnable9493 = new Class162(this);
		((Class289_Sub2) this).aRunnable9498 = new Class169(this);
		((Class289_Sub2) this).aClass294_9501 = new Class294(this);
		((Class289_Sub2) this).aHashMap9494 = new HashMap();
		Iterator iterator = class469.aHashMap5276.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			((Class289_Sub2) this).aHashMap9494.put(class612, (new Class605[((Integer) class469.aHashMap5276.get(class612)).intValue()]));
		}
		iterator = ((Class289_Sub2) this).aHashMap9494.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			for (int i = 0; i < class605s.length; i++) {
				Class79 class79 = new Class79(2.0F);
				class79.method187(0, Class297.aClass297_3470, Class298.aClass298_3478, 2);
				class605s[i] = new Class605(class612, 32768, 3, class79, this);
			}
		}
		((Class289_Sub2) this).aThread9497 = new Thread(((Class289_Sub2) this).aRunnable9498);
		((Class289_Sub2) this).aThread9500 = new Thread(((Class289_Sub2) this).aRunnable9493);
		((Class289_Sub2) this).aThread9497.setPriority(1);
		((Class289_Sub2) this).aThread9500.setPriority(1);
		((Class289_Sub2) this).aThread9497.start();
		((Class289_Sub2) this).aThread9500.start();
	}

	public void method3887(byte i) {
		if (null != ((Class289_Sub2) this).aClass294_9501)
			((Class289_Sub2) this).aClass294_9501.method3953((short) 8074);
		Iterator iterator = ((Class289_Sub2) this).aHashMap9494.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			if (!class612.aBool7981) {
				boolean bool = false;
				for (int i_0_ = 0; i_0_ < class605s.length; i_0_++) {
					class605s[i_0_].method7168(1818890398);
					bool |= class605s[i_0_].method7244((byte) 0);
				}
				if (bool)
					Arrays.sort(class605s, new Class163(this));
			}
			int i_1_ = 3;
			boolean bool = false;
			int i_2_ = class605s.length - 1;
			while (!bool) {
				float f = class605s[i_2_].method7237((byte) 109);
				Class597 class597 = class605s[i_2_].method7152(-987437988);
				if (f < 0.0F) {
					if (Class597.aClass597_7844 == class597 || Class597.aClass597_7842 == class597 || class597 == Class597.aClass597_7845)
						class605s[i_2_].method7193(413814375);
				} else
					bool = true;
				if (--i_2_ < 0)
					bool = true;
			}
			if (i_2_ >= class605s.length - i_1_) {
				for (/**/; i_2_ >= class605s.length - i_1_; i_2_--) {
					Class597 class597 = class605s[i_2_].method7152(-987437988);
					if (Class597.aClass597_7844 == class597)
						class605s[i_2_].method7193(413814375);
				}
			}
		}
	}

	public int method3886(Object object, int i) {
		long l = Class69.method1067(-1669953713);
		int i_3_ = (int) (180000.0F / ((float) (l - (-4221551043307074671L * ((Class289_Sub2) this).aLong9499)) / 1000.0F));
		((Class289_Sub2) this).aLong9499 = l * 2295217492288050545L;
		return i_3_;
	}

	public Object method3888(int i, int i_4_, Class297 class297, Class298 class298, int i_5_, float f, byte i_6_) {
		return new Object();
	}

	public Class294 method3891() {
		return ((Class289_Sub2) this).aClass294_9501;
	}

	public void method3890(Object object, byte[] is, int i, int i_7_, int i_8_) {
		/* empty */
	}

	public Class605 method3892(Class612 class612, byte i) {
		synchronized (((Class289_Sub2) this).aHashMap9494) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i_9_ = 0; i_9_ < class605s.length; i_9_++) {
				Class605 class605 = class605s[i_9_];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(1372732524);
					Class605 class605_10_ = class605;
					return class605_10_;
				}
			}
		}
		return null;
	}

	public void method3904(Object object) {
		/* empty */
	}

	public Class294 method3894(int i) {
		return ((Class289_Sub2) this).aClass294_9501;
	}

	public void method3895(byte i) {
		HashMap hashmap = method8862(-1625279935);
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class612 class612 = (Class612) iterator.next();
				Class605[] class605s = (Class605[]) hashmap.get(class612);
				for (int i_11_ = 0; i_11_ < class605s.length; i_11_++) {
					if (class605s[i_11_].method7152(-987437988) != Class597.aClass597_7840) {
						class605s[i_11_].method7193(413814375);
						class605s[i_11_].method7157((byte) 0);
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
					for (int i_12_ = 0; i_12_ < class605s.length; i_12_++) {
						if (class605s[i_12_].method7152(-987437988) != Class597.aClass597_7840) {
							class605s[i_12_].method7168(1954884085);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub2) this).aBool9496 = true;
		try {
			((Class289_Sub2) this).aThread9497.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub2) this).aThread9500.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public Object method3902(int i, int i_13_, Class297 class297, Class298 class298, int i_14_, float f) {
		return new Object();
	}

	public void method3914() {
		HashMap hashmap = method8862(-1256679043);
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
							class605s[i].method7168(2140758101);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub2) this).aBool9496 = true;
		try {
			((Class289_Sub2) this).aThread9497.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub2) this).aThread9500.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	HashMap method8861() {
		return ((Class289_Sub2) this).aHashMap9494;
	}

	public Object method3901(int i, int i_15_, Class297 class297, Class298 class298, int i_16_, float f) {
		return new Object();
	}

	public int method3897(Object object) {
		long l = Class69.method1067(-1798288590);
		int i = (int) (180000.0F / ((float) (l - (-4221551043307074671L * ((Class289_Sub2) this).aLong9499)) / 1000.0F));
		((Class289_Sub2) this).aLong9499 = l * 2295217492288050545L;
		return i;
	}

	HashMap method8862(int i) {
		return ((Class289_Sub2) this).aHashMap9494;
	}

	public Object method3911(int i, int i_17_, Class297 class297, Class298 class298, int i_18_, float f) {
		return new Object();
	}

	public Class605 method3916(Class612 class612) {
		synchronized (((Class289_Sub2) this).aHashMap9494) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i = 0; i < class605s.length; i++) {
				Class605 class605 = class605s[i];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(1768532564);
					Class605 class605_19_ = class605;
					return class605_19_;
				}
			}
		}
		return null;
	}

	HashMap method8863() {
		return ((Class289_Sub2) this).aHashMap9494;
	}

	public void method3899(Object object, int i) {
		/* empty */
	}

	public Object method3907(int i, int i_20_, Class297 class297, Class298 class298, int i_21_, float f) {
		return new Object();
	}

	Object method3893(Class374 class374, byte i) {
		return null;
	}

	public void method3919(Object object, byte[] is, int i, int i_22_) {
		/* empty */
	}

	public Object method3900(int i, int i_23_, Class297 class297, Class298 class298, int i_24_, float f) {
		return new Object();
	}

	public Object method3898(int i, int i_25_, Class297 class297, Class298 class298, int i_26_, float f) {
		return new Object();
	}

	Object method3912(Class374 class374) {
		return null;
	}

	Object method3908(Class374 class374) {
		return null;
	}

	public Class294 method3909() {
		return ((Class289_Sub2) this).aClass294_9501;
	}

	public Class294 method3910() {
		return ((Class289_Sub2) this).aClass294_9501;
	}

	public Class605 method3889(Class612 class612) {
		synchronized (((Class289_Sub2) this).aHashMap9494) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i = 0; i < class605s.length; i++) {
				Class605 class605 = class605s[i];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(1937260755);
					Class605 class605_27_ = class605;
					return class605_27_;
				}
			}
		}
		return null;
	}

	public void method3917() {
		HashMap hashmap = method8862(-614565508);
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
							class605s[i].method7168(1943426490);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub2) this).aBool9496 = true;
		try {
			((Class289_Sub2) this).aThread9497.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub2) this).aThread9500.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method3913() {
		HashMap hashmap = method8862(594167858);
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
							class605s[i].method7168(1900763511);
							bool = false;
						}
					}
				}
			}
			Class198.method2977(10L);
		}
		((Class289_Sub2) this).aBool9496 = true;
		try {
			((Class289_Sub2) this).aThread9497.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			((Class289_Sub2) this).aThread9500.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	public void method3905(Object object) {
		/* empty */
	}

	public void method3915() {
		if (null != ((Class289_Sub2) this).aClass294_9501)
			((Class289_Sub2) this).aClass294_9501.method3953((short) 5830);
		Iterator iterator = ((Class289_Sub2) this).aHashMap9494.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			if (!class612.aBool7981) {
				boolean bool = false;
				for (int i = 0; i < class605s.length; i++) {
					class605s[i].method7168(1759266901);
					bool |= class605s[i].method7244((byte) 0);
				}
				if (bool)
					Arrays.sort(class605s, new Class163(this));
			}
			int i = 3;
			boolean bool = false;
			int i_28_ = class605s.length - 1;
			while (!bool) {
				float f = class605s[i_28_].method7237((byte) 108);
				Class597 class597 = class605s[i_28_].method7152(-987437988);
				if (f < 0.0F) {
					if (Class597.aClass597_7844 == class597 || Class597.aClass597_7842 == class597 || class597 == Class597.aClass597_7845)
						class605s[i_28_].method7193(413814375);
				} else
					bool = true;
				if (--i_28_ < 0)
					bool = true;
			}
			if (i_28_ >= class605s.length - i) {
				for (/**/; i_28_ >= class605s.length - i; i_28_--) {
					Class597 class597 = class605s[i_28_].method7152(-987437988);
					if (Class597.aClass597_7844 == class597)
						class605s[i_28_].method7193(413814375);
				}
			}
		}
	}

	public void method3903(Object object) {
		/* empty */
	}

	public Class605 method3918(Class612 class612) {
		synchronized (((Class289_Sub2) this).aHashMap9494) {
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			if (null == class605s) {
				Class605 class605 = null;
				return class605;
			}
			for (int i = 0; i < class605s.length; i++) {
				Class605 class605 = class605s[i];
				Class597 class597 = class605.method7152(-987437988);
				if (class597 == Class597.aClass597_7840) {
					class605.method7156(1936800692);
					Class605 class605_29_ = class605;
					return class605_29_;
				}
			}
		}
		return null;
	}

	public void method3906() {
		if (null != ((Class289_Sub2) this).aClass294_9501)
			((Class289_Sub2) this).aClass294_9501.method3953((short) -3861);
		Iterator iterator = ((Class289_Sub2) this).aHashMap9494.keySet().iterator();
		while (iterator.hasNext()) {
			Class612 class612 = (Class612) iterator.next();
			Class605[] class605s = ((Class605[]) ((Class289_Sub2) this).aHashMap9494.get(class612));
			if (!class612.aBool7981) {
				boolean bool = false;
				for (int i = 0; i < class605s.length; i++) {
					class605s[i].method7168(1515104415);
					bool |= class605s[i].method7244((byte) 0);
				}
				if (bool)
					Arrays.sort(class605s, new Class163(this));
			}
			int i = 3;
			boolean bool = false;
			int i_30_ = class605s.length - 1;
			while (!bool) {
				float f = class605s[i_30_].method7237((byte) 84);
				Class597 class597 = class605s[i_30_].method7152(-987437988);
				if (f < 0.0F) {
					if (Class597.aClass597_7844 == class597 || Class597.aClass597_7842 == class597 || class597 == Class597.aClass597_7845)
						class605s[i_30_].method7193(413814375);
				} else
					bool = true;
				if (--i_30_ < 0)
					bool = true;
			}
			if (i_30_ >= class605s.length - i) {
				for (/**/; i_30_ >= class605s.length - i; i_30_--) {
					Class597 class597 = class605s[i_30_].method7152(-987437988);
					if (Class597.aClass597_7844 == class597)
						class605s[i_30_].method7193(413814375);
				}
			}
		}
	}

	public static void method8864(int i, String string, byte i_31_) {
		int i_32_ = 1657484935 * Class184.anInt2163;
		int[] is = Class184.anIntArray2154;
		boolean bool = false;
		for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_33_]];
			if (class456_sub1_sub2_sub3_sub2 != null && (class456_sub1_sub2_sub3_sub2 != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976) && null != class456_sub1_sub2_sub3_sub2.username && class456_sub1_sub2_sub3_sub2.username.equalsIgnoreCase(string)) {
				OutgoingPacket class312 = null;
				if (1 == i)
					class312 = OutgoingPacket.aClass312_3673;
				else if (i == 2)
					class312 = OutgoingPacket.aClass312_3756;
				else if (3 == i)
					class312 = OutgoingPacket.aClass312_3772;
				else if (i == 4)
					class312 = OutgoingPacket.aClass312_3776;
				else if (5 == i)
					class312 = OutgoingPacket.aClass312_3725;
				else if (6 == i)
					class312 = OutgoingPacket.aClass312_3677;
				else if (i == 7)
					class312 = OutgoingPacket.aClass312_3767;
				else if (i == 8)
					class312 = OutgoingPacket.aClass312_3785;
				else if (i == 9)
					class312 = OutgoingPacket.aClass312_3694;
				else if (10 == i)
					class312 = OutgoingPacket.aClass312_3688;
				if (null != class312) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(class312, (client.aClass195_8589.aClass650_2340), 803836773);
					class572_sub25.aRsByteBuffer.writeByte128(0, 848491772);
					class572_sub25.aRsByteBuffer.writeShort128(is[i_33_], -16711936);
					client.aClass195_8589.method2929(class572_sub25, (byte) -30);
				}
				bool = true;
				break;
			}
		}
		if (!bool)
			Class670.method7882(4, new StringBuilder().append(Class279.aClass279_3037.method3758(Class594.aClass435_7823, 16711935)).append(string).toString(), -275471418);
	}

	static final void method8865(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, 789022366) != null)
			string = string.substring(0, string.length() - 1);
		Cs2CallPointer.method5626(string, class441, 915414813);
	}

	public static int[] method8866(int i, int i_34_, int i_35_, int i_36_, int i_37_, float f, boolean bool, int i_38_) {
		int[] is = new int[i];
		Class572_Sub1_Sub1 class572_sub1_sub1 = new Class572_Sub1_Sub1();
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11491 = 1906483449 * i_34_;
		((Class572_Sub1_Sub1) class572_sub1_sub1).aBool11496 = bool;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11492 = i_35_ * 1227768497;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11493 = -1562570597 * i_36_;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11483 = -1443931021 * i_37_;
		((Class572_Sub1_Sub1) class572_sub1_sub1).anInt11495 = (int) (f * 4096.0F) * -1697195083;
		class572_sub1_sub1.method10463(783407956);
		Class275.method3696(i, 1, 1931079693);
		class572_sub1_sub1.method10466(0, is, -246291457);
		return is;
	}
}

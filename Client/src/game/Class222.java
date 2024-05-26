package game;

/* Class222 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class Class222 {
	WeakReference_Sub1[] aWeakReference_Sub1Array2608;
	ReferenceQueue aReferenceQueue2609 = new ReferenceQueue();
	int anInt2610;

	public ArrayList method3115(byte i) {
		method3121(262092969);
		ArrayList arraylist = new ArrayList(((Class222) this).anInt2610 * 330321979);
		WeakReference_Sub1[] weakreference_sub1s = ((Class222) this).aWeakReference_Sub1Array2608;
		for (int i_0_ = 0; i_0_ < weakreference_sub1s.length; i_0_++) {
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s[i_0_]; null != weakreference_sub1; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522)) {
				Object object = weakreference_sub1.get();
				if (object != null)
					arraylist.add(object);
			}
		}
		return arraylist;
	}

	public void method3116(Object object, Object object_1_, byte i) {
		if (null == object)
			throw new NullPointerException();
		method3121(262092969);
		int i_2_ = System.identityHashCode(object);
		int i_3_ = i_2_ & ((Class222) this).aWeakReference_Sub1Array2608.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class222) this).aWeakReference_Sub1Array2608[i_3_];
		if (null == weakreference_sub1) {
			((Class222) this).aWeakReference_Sub1Array2608[i_3_] = new WeakReference_Sub1(object, ((Class222) this).aReferenceQueue2609, i_2_, object_1_);
			((Class222) this).anInt2610 += -951711501;
			if (((Class222) this).anInt2610 * 330321979 >= ((Class222) this).aWeakReference_Sub1Array2608.length)
				method3124(826494844);
		} else {
			for (/**/; weakreference_sub1.get() != object; weakreference_sub1 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522)) {
				if (null == (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522)) {
					((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522 = new WeakReference_Sub1(object, (((Class222) this).aReferenceQueue2609), i_2_, object_1_);
					((Class222) this).anInt2610 += -951711501;
					if (330321979 * ((Class222) this).anInt2610 >= (((Class222) this).aWeakReference_Sub1Array2608).length)
						method3124(1467034036);
					break;
				}
			}
		}
	}

	public void method3117(Object object, int i) {
		if (object == null)
			throw new NullPointerException();
		method3121(262092969);
		int i_4_ = System.identityHashCode(object);
		int i_5_ = i_4_ & ((Class222) this).aWeakReference_Sub1Array2608.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class222) this).aWeakReference_Sub1Array2608[i_5_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				((Class222) this).aWeakReference_Sub1Array2608[i_5_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				((Class222) this).anInt2610 -= -951711501;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_6_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
					if (weakreference_sub1_6_ == null)
						break;
					if (weakreference_sub1_6_.get() == object) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522 = (((WeakReference_Sub1) weakreference_sub1_6_).aWeakReference_Sub1_11522);
						((Class222) this).anInt2610 -= -951711501;
						break;
					}
					weakreference_sub1 = weakreference_sub1_6_;
				}
			}
		}
	}

	void method3118() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class222) this).aReferenceQueue2609.poll());
			if (null == weakreference_sub1)
				break;
			int i = ((1153131911 * ((WeakReference_Sub1) weakreference_sub1).anInt11523) & (((Class222) this).aWeakReference_Sub1Array2608.length - 1));
			WeakReference_Sub1 weakreference_sub1_7_ = ((Class222) this).aWeakReference_Sub1Array2608[i];
			if (weakreference_sub1 == weakreference_sub1_7_) {
				((Class222) this).aWeakReference_Sub1Array2608[i] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				((Class222) this).anInt2610 -= -951711501;
			} else {
				for (/**/; (weakreference_sub1_7_ != null && (weakreference_sub1 != (((WeakReference_Sub1) weakreference_sub1_7_).aWeakReference_Sub1_11522))); weakreference_sub1_7_ = (((WeakReference_Sub1) weakreference_sub1_7_).aWeakReference_Sub1_11522)) {
					/* empty */
				}
				if (null != weakreference_sub1_7_) {
					((WeakReference_Sub1) weakreference_sub1_7_).aWeakReference_Sub1_11522 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
					((Class222) this).anInt2610 -= -951711501;
				}
			}
		}
	}

	void method3119() {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class222) this).aReferenceQueue2609.poll());
			if (null == weakreference_sub1)
				break;
			int i = ((1153131911 * ((WeakReference_Sub1) weakreference_sub1).anInt11523) & (((Class222) this).aWeakReference_Sub1Array2608.length - 1));
			WeakReference_Sub1 weakreference_sub1_8_ = ((Class222) this).aWeakReference_Sub1Array2608[i];
			if (weakreference_sub1 == weakreference_sub1_8_) {
				((Class222) this).aWeakReference_Sub1Array2608[i] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				((Class222) this).anInt2610 -= -951711501;
			} else {
				for (/**/; (weakreference_sub1_8_ != null && (weakreference_sub1 != (((WeakReference_Sub1) weakreference_sub1_8_).aWeakReference_Sub1_11522))); weakreference_sub1_8_ = (((WeakReference_Sub1) weakreference_sub1_8_).aWeakReference_Sub1_11522)) {
					/* empty */
				}
				if (null != weakreference_sub1_8_) {
					((WeakReference_Sub1) weakreference_sub1_8_).aWeakReference_Sub1_11522 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
					((Class222) this).anInt2610 -= -951711501;
				}
			}
		}
	}

	public void method3120(Object object) {
		if (object == null)
			throw new NullPointerException();
		method3121(262092969);
		int i = System.identityHashCode(object);
		int i_9_ = i & ((Class222) this).aWeakReference_Sub1Array2608.length - 1;
		WeakReference_Sub1 weakreference_sub1 = ((Class222) this).aWeakReference_Sub1Array2608[i_9_];
		if (null != weakreference_sub1) {
			if (weakreference_sub1.get() == object) {
				((Class222) this).aWeakReference_Sub1Array2608[i_9_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				((Class222) this).anInt2610 -= -951711501;
			} else {
				for (;;) {
					WeakReference_Sub1 weakreference_sub1_10_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
					if (weakreference_sub1_10_ == null)
						break;
					if (weakreference_sub1_10_.get() == object) {
						((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522 = (((WeakReference_Sub1) weakreference_sub1_10_).aWeakReference_Sub1_11522);
						((Class222) this).anInt2610 -= -951711501;
						break;
					}
					weakreference_sub1 = weakreference_sub1_10_;
				}
			}
		}
	}

	void method3121(int i) {
		for (;;) {
			WeakReference_Sub1 weakreference_sub1 = ((WeakReference_Sub1) ((Class222) this).aReferenceQueue2609.poll());
			if (null == weakreference_sub1)
				break;
			int i_11_ = ((1153131911 * ((WeakReference_Sub1) weakreference_sub1).anInt11523) & (((Class222) this).aWeakReference_Sub1Array2608.length - 1));
			WeakReference_Sub1 weakreference_sub1_12_ = ((Class222) this).aWeakReference_Sub1Array2608[i_11_];
			if (weakreference_sub1 == weakreference_sub1_12_) {
				((Class222) this).aWeakReference_Sub1Array2608[i_11_] = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				((Class222) this).anInt2610 -= -951711501;
			} else {
				for (/**/; (weakreference_sub1_12_ != null && (weakreference_sub1 != (((WeakReference_Sub1) weakreference_sub1_12_).aWeakReference_Sub1_11522))); weakreference_sub1_12_ = (((WeakReference_Sub1) weakreference_sub1_12_).aWeakReference_Sub1_11522)) {
					/* empty */
				}
				if (null != weakreference_sub1_12_) {
					((WeakReference_Sub1) weakreference_sub1_12_).aWeakReference_Sub1_11522 = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
					((Class222) this).anInt2610 -= -951711501;
				}
			}
		}
	}

	void method3122() {
		WeakReference_Sub1[] weakreference_sub1s = ((Class222) this).aWeakReference_Sub1Array2608;
		((Class222) this).aWeakReference_Sub1Array2608 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_13_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_13_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_14_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_13_[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_14_) {
				weakreference_sub1_14_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				int i_15_ = ((((WeakReference_Sub1) weakreference_sub1).anInt11523 * 1153131911) & (((Class222) this).aWeakReference_Sub1Array2608.length - 1));
				((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522 = ((Class222) this).aWeakReference_Sub1Array2608[i_15_];
				((Class222) this).aWeakReference_Sub1Array2608[i_15_] = weakreference_sub1;
			}
		}
	}

	void method3123() {
		WeakReference_Sub1[] weakreference_sub1s = ((Class222) this).aWeakReference_Sub1Array2608;
		((Class222) this).aWeakReference_Sub1Array2608 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_16_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_16_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_17_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_16_[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_17_) {
				weakreference_sub1_17_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				int i_18_ = ((((WeakReference_Sub1) weakreference_sub1).anInt11523 * 1153131911) & (((Class222) this).aWeakReference_Sub1Array2608.length - 1));
				((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522 = ((Class222) this).aWeakReference_Sub1Array2608[i_18_];
				((Class222) this).aWeakReference_Sub1Array2608[i_18_] = weakreference_sub1;
			}
		}
	}

	void method3124(int i) {
		WeakReference_Sub1[] weakreference_sub1s = ((Class222) this).aWeakReference_Sub1Array2608;
		((Class222) this).aWeakReference_Sub1Array2608 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_19_ = weakreference_sub1s;
		for (int i_20_ = 0; i_20_ < weakreference_sub1s_19_.length; i_20_++) {
			WeakReference_Sub1 weakreference_sub1_21_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_19_[i_20_]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_21_) {
				weakreference_sub1_21_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				int i_22_ = ((((WeakReference_Sub1) weakreference_sub1).anInt11523 * 1153131911) & (((Class222) this).aWeakReference_Sub1Array2608.length - 1));
				((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522 = ((Class222) this).aWeakReference_Sub1Array2608[i_22_];
				((Class222) this).aWeakReference_Sub1Array2608[i_22_] = weakreference_sub1;
			}
		}
	}

	public Class222() {
		((Class222) this).aWeakReference_Sub1Array2608 = new WeakReference_Sub1[16];
	}

	void method3125() {
		WeakReference_Sub1[] weakreference_sub1s = ((Class222) this).aWeakReference_Sub1Array2608;
		((Class222) this).aWeakReference_Sub1Array2608 = new WeakReference_Sub1[2 * weakreference_sub1s.length];
		WeakReference_Sub1[] weakreference_sub1s_23_ = weakreference_sub1s;
		for (int i = 0; i < weakreference_sub1s_23_.length; i++) {
			WeakReference_Sub1 weakreference_sub1_24_;
			for (WeakReference_Sub1 weakreference_sub1 = weakreference_sub1s_23_[i]; null != weakreference_sub1; weakreference_sub1 = weakreference_sub1_24_) {
				weakreference_sub1_24_ = (((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522);
				int i_25_ = ((((WeakReference_Sub1) weakreference_sub1).anInt11523 * 1153131911) & (((Class222) this).aWeakReference_Sub1Array2608.length - 1));
				((WeakReference_Sub1) weakreference_sub1).aWeakReference_Sub1_11522 = ((Class222) this).aWeakReference_Sub1Array2608[i_25_];
				((Class222) this).aWeakReference_Sub1Array2608[i_25_] = weakreference_sub1;
			}
		}
	}

	static void method3126(int i, int i_26_, InterfaceDefinitions class73, int i_27_) {
		int i_28_ = i + class73.anInt764 * 669238293;
		int i_29_ = i_26_ + 15;
		if (client.aBool8874) {
			int i_30_ = -256;
			if (client.anInt7734 * -267830063 < 20)
				i_30_ = -65536;
			Class512.aClass102_5703.method1611(new StringBuilder().append("Fps:").append(-267830063 * client.anInt7734).append(" (").append(-238321553 * client.anInt7754).append(" ms)").toString(), i_28_, i_29_, i_30_, -1, 901240928);
			i_29_ += 15;
			Runtime runtime = Runtime.getRuntime();
			long l = runtime.totalMemory() / 1024L;
			long l_31_ = l - runtime.freeMemory() / 1024L;
			int i_32_ = -256;
			if (l_31_ > 262144L)
				i_32_ = -65536;
			Class512.aClass102_5703.method1611(new StringBuilder().append("Mem:").append(l_31_).append("/").append(l).append("k").toString(), i_28_, i_29_, i_32_, -1, 1612941120);
			i_29_ += 15;
			long l_33_ = ((Class195) client.aClass195_8589).aClass14_2336.method623((byte) -71);
			String string = "N/A";
			if (l_33_ != -1L) {
				string = new StringBuilder().append(l_33_).append("ms").toString();
				if (l_33_ > 500L)
					string = new StringBuilder().append(GraphicsDefinition.method7770(16711680, (byte) 11)).append(string).append(GraphicsDefinition.method7770(16776960, (byte) -38)).toString();
			}
			Class512.aClass102_5703.method1611(new StringBuilder().append("Game: In:").append(2022574385 * ((Class195) client.aClass195_8589).anInt2328).append("B/s ").append("Out:").append(((Class195) client.aClass195_8589).anInt2339 * 1977881319).append("B/s ").append("Ping:").append(string).toString(), i_28_, i_29_, -256, -1, 612428423);
			i_29_ += 15;
			long l_34_ = ((Class195) client.aClass195_8632).aClass14_2336.method623((byte) -78);
			String string_35_ = "N/A";
			if (l_34_ != -1L) {
				string_35_ = new StringBuilder().append(l_34_).append("ms").toString();
				if (l_34_ > 500L)
					string_35_ = new StringBuilder().append(GraphicsDefinition.method7770(16711680, (byte) -5)).append(string_35_).append(GraphicsDefinition.method7770(16776960, (byte) 61)).toString();
			}
			Class512.aClass102_5703.method1611(new StringBuilder().append("Lobby: In:").append(2022574385 * ((Class195) client.aClass195_8632).anInt2328).append("B/s ").append("Out:").append(((Class195) client.aClass195_8632).anInt2339 * 1977881319).append("B/s ").append("Ping:").append(string_35_).toString(), i_28_, i_29_, -256, -1, 392352567);
			i_29_ += 15;
			int i_36_ = Class272_Sub2.aClass106_9517.method1669() / 1024;
			Class512.aClass102_5703.method1611(new StringBuilder().append("Offheap:").append(i_36_).append("k").toString(), i_28_, i_29_, i_36_ > 65536 ? -65536 : -256, -1, -2037138845);
			i_29_ += 15;
			int i_37_ = 0;
			int i_38_ = 0;
			int i_39_ = 0;
			for (int i_40_ = 0; i_40_ < Class303.aClass224_Sub1Array3536.length; i_40_++) {
				if (null != Class303.aClass224_Sub1Array3536[i_40_] && Class303.aClass224_Sub1Array3536[i_40_].method8836(-1334749033)) {
					i_37_ += Class303.aClass224_Sub1Array3536[i_40_].method8834(-2006866464);
					i_38_ += Class303.aClass224_Sub1Array3536[i_40_].method8841((byte) 85);
					i_39_ += Class303.aClass224_Sub1Array3536[i_40_].method8835(1751453810);
				}
			}
			int i_41_ = i_37_ == 0 ? 0 : 100 * i_39_ / i_37_;
			int i_42_ = i_37_ == 0 ? 0 : i_38_ * 10000 / i_37_;
			String string_43_ = new StringBuilder().append("Cache:").append(Class124.method2204((long) i_42_, 2, true, Class435.aClass435_5054, -195219368)).append("% (").append(i_41_).append("%)").toString();
			Class298.aClass102_3481.method1611(string_43_, i_28_, i_29_, -256, -1, -1907303990);
			i_29_ += 12;
		}
	}
}

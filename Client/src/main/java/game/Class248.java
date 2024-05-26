package game;

/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class248 {
	static Class206 aClass206_2687 = new Class206();
	Object[] anObjectArray2688;
	Object[][] anObjectArrayArray2689;
	static final int anInt2690 = 0;
	int anInt2691;
	public static final int anInt2692 = 1;
	boolean aBool2693;
	static final int anInt2694 = 2;
	Class254 aClass254_2695 = null;
	Class224 aClass224_2696;
	static boolean aBool2697 = false;
	static int anInt2698 = 0;

	synchronized boolean method3363(int i) {
		if (aClass254_2695 == null) {
			aClass254_2695 = aClass224_2696.method3136(736607943);
			if (null == aClass254_2695)
				return false;
			anObjectArray2688 = (new Object[1312554635 * (((Class254) aClass254_2695).anInt2744)]);
			anObjectArrayArray2689 = new Object[(((Class254) aClass254_2695).anInt2744) * 1312554635][];
		}
		return true;
	}

	public int method3364(int i) {
		if (!method3363(-2107790015))
			throw new IllegalStateException("");
		return (((Class254) aClass254_2695).anInt2737 * -1060726785);
	}

	public synchronized boolean method3365(int i, int i_0_, int i_1_) {
		if (!method3363(-1361573160))
			return false;
		if (i < 0 || i_0_ < 0 || i >= (((Class254) aClass254_2695).anIntArray2752).length || i_0_ >= (((Class254) aClass254_2695).anIntArray2752[i])) {
			if (aBool2697)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_0_).toString());
			return false;
		}
		return true;
	}

	public int method3366() {
		if (!method3363(-1312941374))
			throw new IllegalStateException("");
		return (((Class254) aClass254_2695).anInt2737 * -1060726785);
	}

	public void method3367(int i, byte i_2_) {
		aClass224_2696.method3138(i, 2064858925);
	}

	public synchronized byte[] method3368(int i, int i_3_, int[] is, int i_4_) {
		if (!method3365(i, i_3_, -1220794389))
			return null;
		byte[] is_5_ = null;
		if (null == anObjectArrayArray2689[i] || null == anObjectArrayArray2689[i][i_3_]) {
			boolean bool = method3380(i, i_3_, is, (byte) 103);
			if (!bool) {
				method3408(i, -1826493227);
				bool = method3380(i, i_3_, is, (byte) 72);
				if (!bool)
					return null;
			}
		}
		if (anObjectArrayArray2689[i] == null)
			throw new RuntimeException("");
		if (null != anObjectArrayArray2689[i][i_3_]) {
			is_5_ = MusicVolume.method2201((anObjectArrayArray2689[i][i_3_]), false, -1539626034);
			if (null == is_5_)
				throw new RuntimeException("");
		}
		if (is_5_ != null) {
			if (-334066335 * anInt2691 == 1) {
				anObjectArrayArray2689[i][i_3_] = null;
				if (1 == (((Class254) aClass254_2695).anIntArray2752[i]))
					anObjectArrayArray2689[i] = null;
			} else if (-334066335 * anInt2691 == 2)
				anObjectArrayArray2689[i] = null;
		}
		return is_5_;
	}

	public synchronized boolean method3369(int i, int i_6_, byte i_7_) {
		if (!method3365(i, i_6_, -1921554693))
			return false;
		if (null != anObjectArrayArray2689[i] && anObjectArrayArray2689[i][i_6_] != null)
			return true;
		if (null != anObjectArray2688[i])
			return true;
		method3408(i, -1486320927);
		if (anObjectArray2688[i] != null)
			return true;
		return false;
	}

	public Class248(Class224 class224, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		aClass224_2696 = class224;
		aBool2693 = bool;
		anInt2691 = i * 1558369953;
	}

	public synchronized boolean method3370(int i, int i_8_) {
		if (!method3417(i, -105006709))
			return false;
		if (anObjectArray2688[i] != null)
			return true;
		method3408(i, -1970600490);
		if (null != anObjectArray2688[i])
			return true;
		return false;
	}

	public synchronized boolean method3371(int i) {
		if (!method3363(-1401595511))
			return false;
		boolean bool = true;
		for (int i_9_ = 0; i_9_ < (((Class254) aClass254_2695).anIntArray2741).length; i_9_++) {
			int i_10_ = (((Class254) aClass254_2695).anIntArray2741[i_9_]);
			if (null == anObjectArray2688[i_10_]) {
				method3408(i_10_, -1650578543);
				if (null == anObjectArray2688[i_10_])
					bool = false;
			}
		}
		return bool;
	}

	public synchronized int method3372(int i) {
		if (!method3363(-1403941685))
			return 0;
		int i_11_ = 0;
		int i_12_ = 0;
		for (int i_13_ = 0; i_13_ < anObjectArray2688.length; i_13_++) {
			if ((((Class254) aClass254_2695).anIntArray2742[i_13_]) > 0) {
				i_11_ += 100;
				i_12_ += method3414(i_13_, (byte) 6);
			}
		}
		if (0 == i_11_)
			return 100;
		int i_14_ = 100 * i_12_ / i_11_;
		return i_14_;
	}

	public synchronized byte[] method3373(int i, byte i_15_) {
		if (!method3363(-1414463479))
			return null;
		if (1 == (((Class254) aClass254_2695).anIntArray2752).length)
			return getFile(0, i, -1107677512);
		if (!method3417(i, 694423317))
			return null;
		if (((Class254) aClass254_2695).anIntArray2752[i] == 1)
			return getFile(i, 0, 1737238453);
		throw new RuntimeException();
	}

	public synchronized int[] method3374(int i, int i_16_) {
		if (!method3417(i, -5588685))
			return null;
		int[] is = (((Class254) aClass254_2695).anIntArrayArray2751[i]);
		if (null == is) {
			is = new int[(((Class254) aClass254_2695).anIntArray2742[i])];
			for (int i_17_ = 0; i_17_ < is.length; i_17_++)
				is[i_17_] = i_17_;
		}
		return is;
	}

	public boolean method3375(int i, byte i_18_) {
		if (!method3363(-1475632511))
			return false;
		if (1 == (((Class254) aClass254_2695).anIntArray2752).length)
			return method3365(0, i, -1092318350);
		if (!method3417(i, -1774300690))
			return false;
		if (((Class254) aClass254_2695).anIntArray2752[i] == 1)
			return method3365(i, 0, 537331851);
		throw new RuntimeException();
	}

	public int method3376(int i, int i_19_) {
		if (!method3417(i, 175669409))
			return 0;
		return ((Class254) aClass254_2695).anIntArray2752[i];
	}

	public int method3377(int i) {
		if (!method3363(-1067161260))
			return -1;
		return (((Class254) aClass254_2695).anIntArray2752).length;
	}

	public synchronized void method3378(int i, int i_20_) {
		if (method3417(i, 1497771920)) {
			if (anObjectArrayArray2689 != null)
				anObjectArrayArray2689[i] = null;
		}
	}

	public void method3379(boolean bool, boolean bool_21_, byte i) {
		if (method3363(-1745352096)) {
			if (bool) {
				((Class254) aClass254_2695).anIntArray2736 = null;
				((Class254) aClass254_2695).aClass392_2743 = null;
			}
			if (bool_21_) {
				((Class254) aClass254_2695).anIntArrayArray2746 = null;
				((Class254) aClass254_2695).aClass392Array2754 = null;
			}
		}
	}

	synchronized boolean method3380(int i, int i_22_, int[] is, byte i_23_) {
		if (!method3417(i, -1389498560))
			return false;
		if (anObjectArray2688[i] == null)
			return false;
		int i_24_ = ((Class254) aClass254_2695).anIntArray2742[i];
		int[] is_25_ = (((Class254) aClass254_2695).anIntArrayArray2751[i]);
		if (anObjectArrayArray2689[i] == null)
			anObjectArrayArray2689[i] = new Object[(((Class254) aClass254_2695).anIntArray2752[i])];
		Object[] objects = anObjectArrayArray2689[i];
		boolean bool = true;
		for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
			int i_27_;
			if (is_25_ == null)
				i_27_ = i_26_;
			else
				i_27_ = is_25_[i_26_];
			if (null == objects[i_27_]) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_28_;
		if (null != is && (is[0] != 0 || 0 != is[1] || is[2] != 0 || is[3] != 0)) {
			is_28_ = MusicVolume.method2201(anObjectArray2688[i], true, -1539626034);
			RSByteBuffer class572_sub15 = new RSByteBuffer(is_28_);
			int i_29_ = class572_sub15.readUnsignedByte(1372183196);
			int i_30_ = class572_sub15.readInt(-259581964);
			int i_31_ = ((i_29_ == Class281.aClass281_3219.getId(-1292685632) ? 5 : 9) + i_30_);
			class572_sub15.method8490(is, 5, i_31_, -1608833648);
		} else
			is_28_ = MusicVolume.method2201(anObjectArray2688[i], false, -1539626034);
		byte[] is_32_;
		try {
			is_32_ = Class284.method3846(is_28_, 1205021651);
		} catch (RuntimeException runtimeexception) {
			throw Class412.method5076(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_28_.length).append(" ").append(Class100.method1594(is_28_, is_28_.length, -1006399434)).append(" ").append(Class100.method1594(is_28_, is_28_.length - 2, -1693390284)).append(" ").append(((Class254) aClass254_2695).anIntArray2745[i]).append(" ").append(-1060726785 * (((Class254) aClass254_2695).anInt2737)).toString());
		}
		if (aBool2693)
			anObjectArray2688[i] = null;
		if (i_24_ > 1) {
			if (-334066335 * anInt2691 != 2) {
				int i_33_ = is_32_.length;
				int i_34_ = is_32_[--i_33_] & 0xff;
				i_33_ -= i_24_ * i_34_ * 4;
				RSByteBuffer class572_sub15 = new RSByteBuffer(is_32_);
				int[] is_35_ = new int[i_24_];
				class572_sub15.o = i_33_ * 310393755;
				for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
					int i_37_ = 0;
					for (int i_38_ = 0; i_38_ < i_24_; i_38_++) {
						i_37_ += class572_sub15.readInt(-64938386);
						is_35_[i_38_] += i_37_;
					}
				}
				byte[][] is_39_ = new byte[i_24_][];
				for (int i_40_ = 0; i_40_ < i_24_; i_40_++) {
					is_39_[i_40_] = new byte[is_35_[i_40_]];
					is_35_[i_40_] = 0;
				}
				class572_sub15.o = 310393755 * i_33_;
				int i_41_ = 0;
				for (int i_42_ = 0; i_42_ < i_34_; i_42_++) {
					int i_43_ = 0;
					for (int i_44_ = 0; i_44_ < i_24_; i_44_++) {
						i_43_ += class572_sub15.readInt(-683514375);
						System.arraycopy(is_32_, i_41_, is_39_[i_44_], is_35_[i_44_], i_43_);
						is_35_[i_44_] += i_43_;
						i_41_ += i_43_;
					}
				}
				for (int i_45_ = 0; i_45_ < i_24_; i_45_++) {
					int i_46_;
					if (null == is_25_)
						i_46_ = i_45_;
					else
						i_46_ = is_25_[i_45_];
					if (0 == anInt2691 * -334066335)
						objects[i_46_] = Class286.method3866(is_39_[i_45_], false, (short) -10256);
					else
						objects[i_46_] = is_39_[i_45_];
				}
			} else {
				int i_47_ = is_32_.length;
				int i_48_ = is_32_[--i_47_] & 0xff;
				i_47_ -= 4 * (i_24_ * i_48_);
				RSByteBuffer class572_sub15 = new RSByteBuffer(is_32_);
				int i_49_ = 0;
				int i_50_ = 0;
				class572_sub15.o = i_47_ * 310393755;
				for (int i_51_ = 0; i_51_ < i_48_; i_51_++) {
					int i_52_ = 0;
					for (int i_53_ = 0; i_53_ < i_24_; i_53_++) {
						i_52_ += class572_sub15.readInt(119306755);
						int i_54_;
						if (is_25_ == null)
							i_54_ = i_53_;
						else
							i_54_ = is_25_[i_53_];
						if (i_54_ == i_22_) {
							i_49_ += i_52_;
							i_50_ = i_54_;
						}
					}
				}
				if (i_49_ == 0)
					return true;
				byte[] is_55_ = new byte[i_49_];
				i_49_ = 0;
				class572_sub15.o = i_47_ * 310393755;
				int i_56_ = 0;
				for (int i_57_ = 0; i_57_ < i_48_; i_57_++) {
					int i_58_ = 0;
					for (int i_59_ = 0; i_59_ < i_24_; i_59_++) {
						i_58_ += class572_sub15.readInt(-1040450378);
						int i_60_;
						if (is_25_ == null)
							i_60_ = i_59_;
						else
							i_60_ = is_25_[i_59_];
						if (i_22_ == i_60_) {
							System.arraycopy(is_32_, i_56_, is_55_, i_49_, i_58_);
							i_49_ += i_58_;
						}
						i_56_ += i_58_;
					}
				}
				objects[i_50_] = is_55_;
			}
		} else {
			int i_61_;
			if (is_25_ == null)
				i_61_ = 0;
			else
				i_61_ = is_25_[0];
			if (anInt2691 * -334066335 == 0)
				objects[i_61_] = Class286.method3866(is_32_, false, (short) -23270);
			else
				objects[i_61_] = is_32_;
		}
		return true;
	}

	public boolean method3381(String string, int i) {
		if (!method3363(-1061117305))
			return false;
		string = string.toLowerCase();
		int i_62_ = (((Class254) aClass254_2695).aClass392_2743.method4729(Class67.method1057(string, (byte) 41), -587505551));
		if (i_62_ < 0)
			return false;
		return true;
	}

	public int method3382(int i, int i_63_) {
		if (!method3363(-1567973967))
			return -1;
		int i_64_ = ((Class254) aClass254_2695).aClass392_2743.method4729(i, -402852924);
		if (!method3417(i_64_, -225696429))
			return -1;
		return i_64_;
	}

	public synchronized boolean method3383(int i, int i_65_) {
		if (!method3363(-2100661376))
			return false;
		if (((Class254) aClass254_2695).anIntArray2752.length == 1)
			return method3369(0, i, (byte) 2);
		if (!method3417(i, 49298903))
			return false;
		if (1 == ((Class254) aClass254_2695).anIntArray2752[i])
			return method3369(i, 0, (byte) -36);
		throw new RuntimeException();
	}

	public synchronized byte[] method3384(String string, String string_66_, int i) {
		if (!method3363(-1975902975))
			return null;
		string = string.toLowerCase();
		string_66_ = string_66_.toLowerCase();
		int i_67_ = (((Class254) aClass254_2695).aClass392_2743.method4729(Class67.method1057(string, (byte) 49), -1157141607));
		if (!method3417(i_67_, -1440065582))
			return null;
		int i_68_ = (((Class254) aClass254_2695).aClass392Array2754[i_67_].method4729(Class67.method1057(string_66_, (byte) 6), -677491931));
		return getFile(i_67_, i_68_, -1124500600);
	}

	public void method3385(int i) {
		aClass224_2696.method3138(i, 2013513665);
	}

	public int method3386(String string, byte i) {
		if (!method3363(-1786595054))
			return 0;
		string = string.toLowerCase();
		int i_69_ = (((Class254) aClass254_2695).aClass392_2743.method4729(Class67.method1057(string, (byte) 110), -2060606277));
		return method3414(i_69_, (byte) -22);
	}

	public boolean method3387(String string, byte i) {
		if (!method3363(-2076725477))
			return false;
		string = string.toLowerCase();
		int i_70_ = (((Class254) aClass254_2695).aClass392_2743.method4729(Class67.method1057(string, (byte) 77), -1715934042));
		return method3370(i_70_, 1387865141);
	}

	synchronized boolean method3388() {
		if (aClass254_2695 == null) {
			aClass254_2695 = aClass224_2696.method3136(1497287319);
			if (null == aClass254_2695)
				return false;
			anObjectArray2688 = (new Object[1312554635 * (((Class254) aClass254_2695).anInt2744)]);
			anObjectArrayArray2689 = new Object[(((Class254) aClass254_2695).anInt2744) * 1312554635][];
		}
		return true;
	}

	synchronized boolean method3389() {
		if (aClass254_2695 == null) {
			aClass254_2695 = aClass224_2696.method3136(1558151285);
			if (null == aClass254_2695)
				return false;
			anObjectArray2688 = (new Object[1312554635 * (((Class254) aClass254_2695).anInt2744)]);
			anObjectArrayArray2689 = new Object[(((Class254) aClass254_2695).anInt2744) * 1312554635][];
		}
		return true;
	}

	public int method3390() {
		if (!method3363(-1778686271))
			throw new IllegalStateException("");
		return (((Class254) aClass254_2695).anInt2737 * -1060726785);
	}

	public int method3391() {
		if (!method3363(-1696419034))
			throw new IllegalStateException("");
		return (((Class254) aClass254_2695).anInt2737 * -1060726785);
	}

	public int method3392() {
		if (!method3363(-1164313516))
			throw new IllegalStateException("");
		return (((Class254) aClass254_2695).anInt2737 * -1060726785);
	}

	synchronized boolean method3393(int i) {
		if (!method3363(-1470087215))
			return false;
		if (i < 0 || i >= (((Class254) aClass254_2695).anIntArray2752).length || (((Class254) aClass254_2695).anIntArray2752[i] == 0)) {
			if (aBool2697)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	synchronized boolean method3394(int i) {
		if (!method3363(-2006339217))
			return false;
		if (i < 0 || i >= (((Class254) aClass254_2695).anIntArray2752).length || (((Class254) aClass254_2695).anIntArray2752[i] == 0)) {
			if (aBool2697)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	public boolean method3395(String string, String string_71_, byte i) {
		if (!method3363(-1317424166))
			return false;
		string = string.toLowerCase();
		string_71_ = string_71_.toLowerCase();
		int i_72_ = (((Class254) aClass254_2695).aClass392_2743.method4729(Class67.method1057(string, (byte) 10), -465139381));
		if (i_72_ < 0)
			return false;
		int i_73_ = (((Class254) aClass254_2695).aClass392Array2754[i_72_].method4729(Class67.method1057(string_71_, (byte) 51), -925311520));
		if (i_73_ < 0)
			return false;
		return true;
	}

	public synchronized boolean method3396(int i, int i_74_) {
		if (!method3363(-1331492207))
			return false;
		if (i < 0 || i_74_ < 0 || i >= (((Class254) aClass254_2695).anIntArray2752).length || i_74_ >= (((Class254) aClass254_2695).anIntArray2752[i])) {
			if (aBool2697)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_74_).toString());
			return false;
		}
		return true;
	}

	synchronized void method3397(int i) {
		if (aBool2693)
			anObjectArray2688[i] = aClass224_2696.method3137(i, (byte) 38);
		else
			anObjectArray2688[i] = Class286.method3866(aClass224_2696.method3137(i, (byte) 62), false, (short) -17836);
	}

	synchronized void method3398(int i) {
		if (aBool2693)
			anObjectArray2688[i] = aClass224_2696.method3137(i, (byte) 113);
		else
			anObjectArray2688[i] = Class286.method3866(aClass224_2696.method3137(i, (byte) 107), false, (short) -32751);
	}

	synchronized void method3399(int i) {
		if (aBool2693)
			anObjectArray2688[i] = aClass224_2696.method3137(i, (byte) 34);
		else
			anObjectArray2688[i] = Class286.method3866(aClass224_2696.method3137(i, (byte) 94), false, (short) -12571);
	}

	public synchronized void method3400(int i) {
		if (method3417(i, -507490649)) {
			if (anObjectArrayArray2689 != null)
				anObjectArrayArray2689[i] = null;
		}
	}

	public int method3401(int i) {
		if (!method3417(i, 1521779669))
			return 0;
		return ((Class254) aClass254_2695).anIntArray2752[i];
	}

	public synchronized boolean method3402(int i, int i_75_) {
		if (!method3365(i, i_75_, -1098179223))
			return false;
		if (null != anObjectArrayArray2689[i] && anObjectArrayArray2689[i][i_75_] != null)
			return true;
		if (null != anObjectArray2688[i])
			return true;
		method3408(i, -1660388050);
		if (anObjectArray2688[i] != null)
			return true;
		return false;
	}

	public byte[] getFile(int i, int i_76_, int i_77_) {
		return method3368(i, i_76_, null, -1456571709);
	}

	public synchronized boolean method3404(int i, int i_78_) {
		if (!method3365(i, i_78_, 341768516))
			return false;
		if (null != anObjectArrayArray2689[i] && anObjectArrayArray2689[i][i_78_] != null)
			return true;
		if (null != anObjectArray2688[i])
			return true;
		method3408(i, -1763641576);
		if (anObjectArray2688[i] != null)
			return true;
		return false;
	}

	public boolean method3405(String string, byte i) {
		int i_79_ = method3413("", -1670993015);
		if (i_79_ != -1)
			return method3418("", string, 1637439325);
		return method3418(string, "", 1352972919);
	}

	public void method3406(int i) {
		aClass224_2696.method3138(i, -1430098813);
	}

	public synchronized int method3407() {
		if (!method3363(-1225361947))
			return 0;
		int i = 0;
		int i_80_ = 0;
		for (int i_81_ = 0; i_81_ < anObjectArray2688.length; i_81_++) {
			if ((((Class254) aClass254_2695).anIntArray2742[i_81_]) > 0) {
				i += 100;
				i_80_ += method3414(i_81_, (byte) 18);
			}
		}
		if (0 == i)
			return 100;
		int i_82_ = 100 * i_80_ / i;
		return i_82_;
	}

	synchronized void method3408(int i, int i_83_) {
		if (aBool2693)
			anObjectArray2688[i] = aClass224_2696.method3137(i, (byte) 9);
		else
			anObjectArray2688[i] = Class286.method3866(aClass224_2696.method3137(i, (byte) 43), false, (short) -15925);
	}

	public int method3409(int i) {
		if (!method3417(i, 1160936922))
			return 0;
		return ((Class254) aClass254_2695).anIntArray2752[i];
	}

	public int method3410(int i) {
		if (!method3417(i, 190588365))
			return 0;
		return ((Class254) aClass254_2695).anIntArray2752[i];
	}

	public int method3411(int i) {
		if (!method3417(i, 2147480029))
			return 0;
		return ((Class254) aClass254_2695).anIntArray2752[i];
	}

	public int method3412() {
		if (!method3363(-1384892797))
			return -1;
		return (((Class254) aClass254_2695).anIntArray2752).length;
	}

	public int method3413(String string, int i) {
		if (!method3363(-1258299106))
			return -1;
		string = string.toLowerCase();
		int i_84_ = (((Class254) aClass254_2695).aClass392_2743.method4729(Class67.method1057(string, (byte) 95), -1083671409));
		if (!method3417(i_84_, -541070263))
			return -1;
		return i_84_;
	}

	public synchronized int method3414(int i, byte i_85_) {
		if (!method3417(i, 601870773))
			return 0;
		if (null != anObjectArray2688[i])
			return 100;
		return aClass224_2696.method3143(i, (short) 23556);
	}

	public void method3415(int i) {
		aClass224_2696.method3138(i, 585220053);
	}

	public synchronized int method3416() {
		if (!method3363(-1262069672))
			return 0;
		int i = 0;
		int i_86_ = 0;
		for (int i_87_ = 0; i_87_ < anObjectArray2688.length; i_87_++) {
			if ((((Class254) aClass254_2695).anIntArray2742[i_87_]) > 0) {
				i += 100;
				i_86_ += method3414(i_87_, (byte) -10);
			}
		}
		if (0 == i)
			return 100;
		int i_88_ = 100 * i_86_ / i;
		return i_88_;
	}

	synchronized boolean method3417(int i, int i_89_) {
		if (!method3363(-1057965553))
			return false;
		if (i < 0 || i >= (((Class254) aClass254_2695).anIntArray2752).length || (((Class254) aClass254_2695).anIntArray2752[i] == 0)) {
			if (aBool2697)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	boolean method3418(String string, String string_90_, int i) {
		if (!method3363(-1688884147))
			return false;
		string = string.toLowerCase();
		string_90_ = string_90_.toLowerCase();
		int i_91_ = (((Class254) aClass254_2695).aClass392_2743.method4729(Class67.method1057(string, (byte) 117), -2086136242));
		if (!method3417(i_91_, 757697323))
			return false;
		int i_92_ = (((Class254) aClass254_2695).aClass392Array2754[i_91_].method4729(Class67.method1057(string_90_, (byte) 67), -1920126586));
		return method3369(i_91_, i_92_, (byte) -119);
	}

	public synchronized boolean method3419(int i, int i_93_) {
		if (!method3365(i, i_93_, 1398231485))
			return false;
		if (null != anObjectArrayArray2689[i] && anObjectArrayArray2689[i][i_93_] != null)
			return true;
		if (null != anObjectArray2688[i])
			return true;
		method3408(i, -1591952158);
		if (anObjectArray2688[i] != null)
			return true;
		return false;
	}

	static Class591_Sub4 method3420(int i) {
		Class591_Sub4 class591_sub4 = ((Class591_Sub4) Class591_Sub4.aClass652_9349.method7696(-1986499651));
		if (null != class591_sub4) {
			Class591_Sub4.anInt9348 -= 1153306511;
			return class591_sub4;
		}
		return new Class591_Sub4();
	}

	static final void method3421(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		VarDefinition.method2776(class73, class441, -227035875);
	}
}

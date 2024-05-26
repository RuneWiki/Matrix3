package game;

/* Class530 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class530 implements Interface60 {
	public static Class530 aClass530_5905;
	public static Class530 aClass530_5906;
	public static Class530 aClass530_5907;
	public static Class530 aClass530_5908;
	public static Class530 aClass530_5909;
	public static Class530 aClass530_5910;
	public static Class530 aClass530_5911;
	public static Class530 aClass530_5912;
	static Class530 aClass530_5913;
	static Class530 aClass530_5914;
	public static Class530 aClass530_5915;
	public static Class530 aClass530_5916;
	public static Class530 aClass530_5917;
	public static Class530 aClass530_5918;
	public static Class530 aClass530_5919;
	public static Class530 aClass530_5920;
	public static Class530 aClass530_5921;
	public static Class530 aClass530_5922 = new Class530("", 10, new ScriptVarType[] { ScriptVarType.aClass283_3283 }, null);
	public static Class530 aClass530_5923;
	public static Class530 aClass530_5924;
	public static Class530 aClass530_5925;
	static Class530 aClass530_5926;
	public int anInt5927;

	Class530(String string, int i, ScriptVarType[] class283s, ScriptVarType[] class283s_0_) {
		this(string, i, class283s != null, class283s, null != class283s_0_, class283s_0_);
	}

	Class530(String string, int i, boolean bool, boolean bool_1_) {
		this(string, i, bool, null, bool_1_, null);
	}

	Class530(String string, int i) {
		this(string, i, false, null, false, null);
	}

	Class530(String string, int i, boolean bool, ScriptVarType[] class283s, boolean bool_2_, ScriptVarType[] class283s_3_) {
		anInt5927 = -2128967697 * i;
	}

	public int getId(int i) {
		return 2137884431 * anInt5927;
	}

	static {
		aClass530_5906 = new Class530("", 11, new ScriptVarType[] { ScriptVarType.aClass283_3283 }, null);
		aClass530_5908 = new Class530("", 12, new ScriptVarType[] { ScriptVarType.aClass283_3283 }, null);
		aClass530_5917 = new Class530("", 13, new ScriptVarType[] { ScriptVarType.aClass283_3283 }, null);
		aClass530_5909 = new Class530("", 14, new ScriptVarType[] { ScriptVarType.aClass283_3283 }, null);
		aClass530_5910 = new Class530("", 15, new ScriptVarType[] { ScriptVarType.aClass283_3283, ScriptVarType.aClass283_3282, ScriptVarType.aClass283_3282 }, null);
		aClass530_5907 = new Class530("", 16, new ScriptVarType[] { ScriptVarType.aClass283_3283, ScriptVarType.aClass283_3282, ScriptVarType.aClass283_3282 }, null);
		aClass530_5912 = new Class530("", 17, new ScriptVarType[] { ScriptVarType.aClass283_3283, ScriptVarType.aClass283_3282, ScriptVarType.aClass283_3282 }, null);
		aClass530_5913 = new Class530("", 18);
		aClass530_5925 = new Class530("", 19);
		aClass530_5915 = new Class530("", 20, new ScriptVarType[] { ScriptVarType.aClass283_3261, ScriptVarType.aClass283_3282 }, null);
		aClass530_5916 = new Class530("", 21);
		aClass530_5919 = new Class530("", 22);
		aClass530_5918 = new Class530("", 23, new ScriptVarType[] { ScriptVarType.aClass283_3231 }, null);
		aClass530_5921 = new Class530("", 24);
		aClass530_5920 = new Class530("", 25);
		aClass530_5905 = new Class530("", 26);
		aClass530_5911 = new Class530("", 27);
		aClass530_5923 = new Class530("", 28);
		aClass530_5924 = new Class530_Sub1("", 29, true, false);
		aClass530_5914 = new Class530("", 73, true, true);
		aClass530_5926 = new Class530("", 76, true, false);
	}

	public int method143() {
		return 2137884431 * anInt5927;
	}

	public int method45() {
		return 2137884431 * anInt5927;
	}

	public int method43() {
		return 2137884431 * anInt5927;
	}

	public int method61() {
		return 2137884431 * anInt5927;
	}

	public static void method6335(int[] is, int[] is_5_, int i, int i_6_, int i_7_) {
		if (i < i_6_) {
			int i_8_ = (i + i_6_) / 2;
			int i_9_ = i;
			int i_10_ = is[i_8_];
			is[i_8_] = is[i_6_];
			is[i_6_] = i_10_;
			int i_11_ = is_5_[i_8_];
			is_5_[i_8_] = is_5_[i_6_];
			is_5_[i_6_] = i_11_;
			int i_12_ = i_10_ == 2147483647 ? 0 : 1;
			for (int i_13_ = i; i_13_ < i_6_; i_13_++) {
				if (is[i_13_] < i_10_ + (i_13_ & i_12_)) {
					int i_14_ = is[i_13_];
					is[i_13_] = is[i_9_];
					is[i_9_] = i_14_;
					int i_15_ = is_5_[i_13_];
					is_5_[i_13_] = is_5_[i_9_];
					is_5_[i_9_++] = i_15_;
				}
			}
			is[i_6_] = is[i_9_];
			is[i_9_] = i_10_;
			is_5_[i_6_] = is_5_[i_9_];
			is_5_[i_9_] = i_11_;
			method6335(is, is_5_, i, i_9_ - 1, 1224792087);
			method6335(is, is_5_, i_9_ + 1, i_6_, -716277332);
		}
	}

	static final void method6336(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class227.method3159(class73, class83, class441, -893623992);
	}

	static Class653[] method6337(int i) {
		return (new Class653[] { Class653.aClass653_8396, Class653.aClass653_8394, Class653.aClass653_8393, Class653.aClass653_8392, Class653.aClass653_8395 });
	}

	public static InterfaceDefinitions method6338(int i, int i_16_, int i_17_) {
		InterfaceDefinitions class73 = Class512.method6083(i, (short) 3691);
		if (i_16_ == -1)
			return class73;
		if (class73 == null || class73.aClass73Array916 == null || i_16_ >= class73.aClass73Array916.length)
			return null;
		return class73.aClass73Array916[i_16_];
	}
}

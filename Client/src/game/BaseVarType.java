package game;

/* Class609 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class BaseVarType implements Interface52 {
	public Class aClass7956;
	public static BaseVarType LONG_T;
	public static BaseVarType INT_T = new BaseVarType(1, 0, java.lang.Integer.class, new Class607());
	static BaseVarType aClass609_7959;
	static BaseVarType aClass609_7960;
	public int anInt7961;
	public static BaseVarType STRING_T;
	public static Class412 aClass412_7963;
	int anInt7964;
	public static int anInt7965;

	public static BaseVarType[] method7258(byte i) {
		return new BaseVarType[] { STRING_T, INT_T, aClass609_7960, aClass609_7959, LONG_T };
	}

	BaseVarType(int i, int i_0_, Class var_class, Interface21 interface21) {
		anInt7961 = 1108923061 * i;
		((BaseVarType) this).anInt7964 = 645870683 * i_0_;
		aClass7956 = var_class;
	}

	static {
		LONG_T = new BaseVarType(2, 1, java.lang.Long.class, new Class622());
		STRING_T = new BaseVarType(3, 2, java.lang.String.class, new Class615());
		aClass609_7959 = new BaseVarType(0, 3, Class572_Sub17.class, new Class270());
		aClass609_7960 = new BaseVarType(4, 4, Class80.class, new Class287());
	}

	public int method143() {
		return ((BaseVarType) this).anInt7964 * -2139431981;
	}

	public int method45() {
		return ((BaseVarType) this).anInt7964 * -2139431981;
	}

	public int method43() {
		return ((BaseVarType) this).anInt7964 * -2139431981;
	}

	public int method61() {
		return ((BaseVarType) this).anInt7964 * -2139431981;
	}

	public static Class416 method7259(int i, byte i_1_) {
		if (Class416.aClass416_4931.anInt4937 * 248285345 == i)
			return Class416.aClass416_4931;
		if (i == 248285345 * Class416.aClass416_4935.anInt4937)
			return Class416.aClass416_4935;
		if (248285345 * Class416.aClass416_4932.anInt4937 == i)
			return Class416.aClass416_4932;
		if (248285345 * Class416.aClass416_4933.anInt4937 == i)
			return Class416.aClass416_4933;
		if (i == 248285345 * Class416.aClass416_4930.anInt4937)
			return Class416.aClass416_4930;
		if (248285345 * Class416.aClass416_4938.anInt4937 == i)
			return Class416.aClass416_4938;
		if (i == 248285345 * Class416.aClass416_4936.anInt4937)
			return Class416.aClass416_4936;
		return null;
	}

	public int getId(int i) {
		return ((BaseVarType) this).anInt7964 * -2139431981;
	}

	public static void method7260(int i, boolean bool, int i_2_) {
		Class572_Sub12_Sub2.method10231(i, Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935), bool, 665479112);
	}

	static final void method7261(InterfaceDefinitions class73, byte i) {
		if (-1300261943 * InterfaceDefinitions.anInt727 == -1792394419 * class73.anInt854) {
			if (null == Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username) {
				class73.anInt803 = 0;
				class73.anInt794 = 0;
			} else {
				class73.anInt798 = 2043214958;
				class73.anInt799 = ((int) (Math.sin((double) client.cycles / 40.0) * 256.0) & 0x7ff) * 1267443815;
				class73.anInt892 = -1772508733;
				class73.anInt803 = client.anInt8728 * 903518299;
				class73.anInt794 = Class39.method798((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username), 1740816517) * 2093728617;
				Class663_Sub2 class663_sub2 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass663_Sub2_11631);
				if (class663_sub2 != null) {
					if (null == class73.aClass663_915)
						class73.aClass663_915 = new Class663_Sub1();
					class73.anInt926 = class663_sub2.method7795(-1478180242) * 396355939;
					class73.aClass663_915.method7824(class663_sub2, -933076491);
				} else
					class73.aClass663_915 = null;
			}
		}
	}

	public static long method7262(CharSequence charsequence, int i) {
		int i_3_ = charsequence.length();
		long l = 0L;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
			l = (l << 5) - l + (long) charsequence.charAt(i_4_);
		return l;
	}
}

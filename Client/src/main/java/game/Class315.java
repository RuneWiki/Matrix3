package game;

/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class315 {
	public static Class315 aClass315_3815;
	public static Class315 aClass315_3816;
	public static Class315 aClass315_3817;
	public static Class315 aClass315_3818;
	static Class315 aClass315_3819;
	static Class315 aClass315_3820;
	static Class315 aClass315_3821;
	public static Class315 aClass315_3822;
	public static Class315 aClass315_3823;
	public static Class315 aClass315_3824 = new Class315(14, 0);
	public static Class315 aClass315_3825;
	static Class315 aClass315_3826;
	public int anInt3827;
	static Class315[] aClass315Array3828;

	static {
		aClass315_3816 = new Class315(15, -1);
		aClass315_3822 = new Class315(16, -2);
		aClass315_3818 = new Class315(19, -2);
		aClass315_3821 = new Class315(23, 4);
		aClass315_3820 = new Class315(24, -1);
		aClass315_3817 = new Class315(26, 0);
		aClass315_3819 = new Class315(27, 0);
		aClass315_3823 = new Class315(28, -2);
		aClass315_3815 = new Class315(29, -2);
		aClass315_3825 = new Class315(30, -2);
		aClass315_3826 = new Class315(31, 4);
		aClass315Array3828 = new Class315[32];
		Class315[] class315s = Class395.method4747((byte) 0);
		for (int i = 0; i < class315s.length; i++)
			aClass315Array3828[class315s[i].anInt3827 * -540596227] = class315s[i];
	}

	Class315(int i, int i_0_) {
		anInt3827 = i * 185429333;
	}

	static final void method4073(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -392029044) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray859 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method4074(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8146(-662481935) ? 1 : 0;
	}

	static final void method4075(Cs2Executor class441, short i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) -12090);
		Class83 class83 = Class534.aClass83Array5975[i_1_ >>> 16];
		InterfaceDefinitions class73_2_ = Class76.method1152(class83, class73, (short) 12348);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73_2_ == null ? -1 : -1718435171 * class73_2_.selfId;
	}

	public static Class667[] method4076(byte i) {
		return (new Class667[] { Class667.aClass667_8505, Class667.aClass667_8507, Class667.aClass667_8502, Class667.aClass667_8504, Class667.aClass667_8506, Class667.aClass667_8503 });
	}

	static final void method4077(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	public static int getContainerCount(int index, int i_3_, boolean bool, boolean split, int i_5_) {
		ItemsContainer class572_sub31 = Class447.getContainer(index, split, -759443313);
		if (class572_sub31 == null)
			return 0;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < ((ItemsContainer) class572_sub31).itemIds.length; i_7_++) {
			if (((ItemsContainer) class572_sub31).itemIds[i_7_] >= 0 && (((ItemsContainer) class572_sub31).itemIds[i_7_] < Class672.aClass639_Sub5_8533.anInt8284 * 1292974489)) {
				ItemDefinitions class631 = (ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition((((ItemsContainer) class572_sub31).itemIds[i_7_]), -1208600680));
				int i_8_ = class631.method7520(i_3_, (((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_3_, 1302093560)).anInt2832) * -1132777561, 439613649);
				if (bool)
					i_6_ += i_8_ * (((ItemsContainer) class572_sub31).itemAmounts[i_7_]);
				else
					i_6_ += i_8_;
			}
		}
		return i_6_;
	}

	public static void method4079(int i, byte i_9_) {
		if (i < 1)
			Class547_Sub1.anInt9000 = Class547_Sub1.anInt8979 * -1095477489;
		else
			Class547_Sub1.anInt9000 = i * 19211783;
	}

	public static void method4080(Class248 class248, MapSize mapSize, Interface5 interface5, byte i) {
		Class124.aClass248_1508 = class248;
		Class307.aClass94_3548 = mapSize;
		Class580.anInterface5_7693 = interface5;
	}
}

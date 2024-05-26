package game;

/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Class79 implements Interface32 {
	boolean[] aBoolArray1005;
	int anInt1006;
	int anInt1007;
	Class61 aClass61_1008;
	int anInt1009;
	Interface30 anInterface30_1010;
	List aList1011;
	Class37[] aClass37Array1012;
	Class60[] aClass60Array1013;
	Class298 aClass298_1014;
	int anInt1015;
	int anInt1016;
	List aList1017;
	float aFloat1018;
	int anInt1019;
	int[] anIntArray1020;
	Class77[] aClass77Array1021;
	Class42[] aClass42Array1022;
	int anInt1023;
	int anInt1024;
	boolean[] aBoolArray1025;
	int[] anIntArray1026;
	Class61[] aClass61Array1027;
	int anInt1028;
	int anInt1029;
	boolean[] aBoolArray1030;
	Class61[] aClass61Array1031;
	Class61 aClass61_1032;
	Class291 aClass291_1033;
	Class61 aClass61_1034;
	int anInt1035;
	Class61 aClass61_1036;
	Class61 aClass61_1037;
	boolean aBool1038;
	int[] anIntArray1039;
	int anInt1040;
	int anInt1041;
	RSByteBuffer aClass572_Sub15_1042;
	int anInt1043;
	int anInt1044;
	boolean aBool1045;
	boolean aBool1046;
	boolean aBool1047;
	boolean aBool1048;
	int anInt1049;
	int anInt1050;
	static Class127 aClass127_1051;
	int anInt1052;
	boolean aBool1053;
	List aList1054;
	int anInt1055;
	Class61 aClass61_1056;
	int anInt1057;
	Class297 aClass297_1058;
	int anInt1059;
	List aList1060;
	AtomicReference anAtomicReference1061;
	int anInt1062;
	int anInt1063;
	Class61[] aClass61Array1064;
	int anInt1065;
	int anInt1066;
	boolean[] aBoolArray1067;
	List aList1068 = new ArrayList();
	byte[] aByteArray1069;
	int anInt1070;
	int anInt1071;
	int anInt1072;
	boolean[] aBoolArray1073;
	static List aList1074 = new ArrayList();

	public int method148() {
		return method1207();
	}

	public void method151() {
		if (method155() != Class291.aClass291_3442) {
			method1235(false);
			method1179(Class291.aClass291_3446);
		} else {
			method1235(false);
			method1179(Class291.aClass291_3445);
		}
	}

	public void method165(boolean bool) {
		if (!bool)
			method151();
		else if (method155() == Class291.aClass291_3440) {
			method1235(true);
			method1179(Class291.aClass291_3441);
		}
	}

	void method1179(Class291 class291) {
		((Class79) this).aClass291_1033 = class291;
	}

	public Class291 method155() {
		return ((Class79) this).aClass291_1033;
	}

	boolean method1180(byte[] is, int i, int i_0_) {
		if (is[i] != i_0_)
			return false;
		if (is[i + 1] != 118 || is[i + 2] != 111 || is[i + 3] != 114 || is[i + 4] != 98 || is[i + 5] != 105 || is[i + 6] != 115)
			return false;
		return true;
	}

	public void method103() {
		if (method155() == Class291.aClass291_3445 || method155() == Class291.aClass291_3446 || method155() == Class291.aClass291_3441) {
			method1179(Class291.aClass291_3442);
			method1214();
		}
	}

	public RSByteBuffer method161(int i) {
		RSByteBuffer class572_sub15 = method1205(i);
		return class572_sub15;
	}

	public int method196(int i) {
		return i / (method198().anInt3472 * -1700527127 / 8);
	}

	public int method163(int i) {
		return i * (method198().anInt3472 * -1700527127 / 8);
	}

	int method1181(float f) {
		int i = (int) (f * 127.0F);
		if (i > 127)
			return 127;
		if (i < -128)
			return -128;
		return i;
	}

	public Class297 method198() {
		return ((Class79) this).aClass297_1058;
	}

	int method1182(float f) {
		int i = (int) (f * 32767.0F + 32768.0F);
		if (i > 65535)
			return 65535;
		if (i < 0)
			return 0;
		return i;
	}

	public void method187(int i, Class297 class297, Class298 class298, int i_1_) {
		((Class79) this).anInt1015 = i_1_;
		if (method1183(i, class297, class298)) {
			((Class79) this).aClass297_1058 = class297;
			((Class79) this).aClass298_1014 = class298;
		} else
			throw new RuntimeException("");
	}

	boolean method1183(int i, Class297 class297, Class298 class298) {
		if (class297 == Class297.aClass297_3470)
			return true;
		if (class297 == Class297.aClass297_3469)
			return true;
		if (class297 == Class297.aClass297_3471)
			return true;
		if (class297 == Class297.aClass297_3468)
			return true;
		return false;
	}

	int method1184() {
		if (((Class79) this).aBool1047)
			return ((Class79) this).anInt1006;
		throw new RuntimeException("");
	}

	public int method159() {
		if (((Class79) this).aBool1047)
			return (method1184() < ((Class79) this).anInt1015 ? ((Class79) this).anInt1015 : method1184());
		throw new RuntimeException("");
	}

	synchronized void method1185(boolean bool) {
		((Class79) this).aBool1048 = bool;
	}

	boolean method1186(byte[] is, int i, int i_2_, AtomicReference atomicreference) {
		if (is == null)
			throw new RuntimeException("");
		if (i + i_2_ > is.length)
			return false;
		method1195(is, i);
		int i_3_ = method1196();
		if (i_3_ != 0) {
			method1200(is, i);
			return false;
		}
		if (!method157())
			throw new RuntimeException();
		int i_4_ = method1197(method1201(((Class79) this).anIntArray1026.length - 1));
		boolean bool = ((Class79) this).aBoolArray1025[i_4_];
		int i_5_ = bool ? ((Class79) this).anInt1019 : ((Class79) this).anInt1072;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		if (bool) {
			bool_6_ = method1196() != 0;
			bool_7_ = method1196() != 0;
		}
		int i_8_ = i_5_ >> 1;
		int i_9_;
		int i_10_;
		int i_11_;
		if (bool && !bool_6_) {
			i_9_ = (i_5_ >> 2) - (((Class79) this).anInt1072 >> 2);
			i_10_ = (i_5_ >> 2) + (((Class79) this).anInt1072 >> 2);
			i_11_ = ((Class79) this).anInt1072 >> 1;
		} else {
			i_9_ = 0;
			i_10_ = i_8_;
			i_11_ = i_5_ >> 1;
		}
		int i_12_;
		int i_13_;
		int i_14_;
		if (bool && !bool_7_) {
			i_12_ = i_5_ - (i_5_ >> 2) - (((Class79) this).anInt1072 >> 2);
			i_13_ = i_5_ - (i_5_ >> 2) + (((Class79) this).anInt1072 >> 2);
			i_14_ = ((Class79) this).anInt1072 >> 1;
		} else {
			i_12_ = i_8_;
			i_13_ = i_5_;
			i_14_ = i_5_ >> 1;
		}
		Class37 class37 = (((Class79) this).aClass37Array1012[((Class79) this).anIntArray1026[i_4_]]);
		if (((Class79) this).aBoolArray1005 == null || (((Class79) this).aBoolArray1005.length != ((Class79) this).anInt1006)) {
			((Class79) this).aBoolArray1005 = new boolean[((Class79) this).anInt1006];
			((Class79) this).aBoolArray1073 = new boolean[((Class79) this).anInt1006];
		}
		for (int i_15_ = 0; i_15_ < ((Class79) this).anInt1006; i_15_++) {
			int i_16_ = (((Class37) class37).anIntArray390 != null ? ((Class37) class37).anIntArray390[i_15_] : 0);
			int i_17_ = i_16_;
			int i_18_ = ((Class37) class37).anIntArray391[i_17_];
			((Class79) this).aBoolArray1005[i_15_] = !((Class79) this).aClass42Array1022[i_18_].method811(i_15_);
			((Class79) this).aBoolArray1073[i_15_] = ((Class79) this).aBoolArray1005[i_15_];
		}
		for (int i_19_ = 0; i_19_ < ((Class37) class37).anInt389; i_19_++) {
			if (!(((Class79) this).aBoolArray1005[((Class37) class37).anIntArray388[i_19_]]) || !(((Class79) this).aBoolArray1005[((Class37) class37).anIntArray395[i_19_]])) {
				((Class79) this).aBoolArray1005[(((Class37) class37).anIntArray388[i_19_])] = false;
				((Class79) this).aBoolArray1005[(((Class37) class37).anIntArray395[i_19_])] = false;
			}
		}
		if (((Class79) this).aBoolArray1067 == null || (((Class79) this).aBoolArray1067.length != ((Class79) this).anInt1006))
			((Class79) this).aBoolArray1067 = new boolean[((Class79) this).anInt1006];
		for (int i_20_ = 0; i_20_ < ((Class37) class37).anInt394; i_20_++) {
			int i_21_ = 0;
			for (int i_22_ = 0; i_22_ < ((Class79) this).anInt1006; i_22_++) {
				int i_23_ = (((Class37) class37).anIntArray390 != null ? ((Class37) class37).anIntArray390[i_22_] : i_20_);
				if (i_23_ == i_20_)
					((Class79) this).aBoolArray1067[i_21_++] = ((Class79) this).aBoolArray1005[i_22_];
			}
			Class77 class77 = (((Class79) this).aClass77Array1021[((Class37) class37).anIntArray392[i_20_]]);
			Object object = null;
			Class61[] class61s;
			if (((Class77) class77).anInt948 == 2) {
				Class61[] class61s_24_ = method1234(1, ((Class79) this).anInt1006 * i_5_);
				for (int i_25_ = 0; i_25_ < i_5_; i_25_++) {
					for (int i_26_ = 0; i_26_ < ((Class79) this).anInt1006; i_26_++) {
						try {
							((Class61) class61s_24_[0]).aFloatArray541[i_25_ * ((Class79) this).anInt1006 + i_26_] = (((Class61) ((Class79) this).aClass61Array1031[i_26_]).aFloatArray541[i_25_]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				class61s_24_ = class77.method1155(class61s_24_, i_5_ >> 1, ((Class79) this).aBoolArray1067);
				class61s = ((Class79) this).aClass61Array1031;
				for (int i_27_ = 0; i_27_ < i_5_; i_27_++) {
					for (int i_28_ = 0; i_28_ < ((Class79) this).anInt1006; i_28_++) {
						try {
							((Class61) class61s[i_28_]).aFloatArray541[i_27_] = (((Class61) class61s_24_[0]).aFloatArray541[(((Class79) this).anInt1006 * i_27_ + i_28_)]);
						} catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception) {
							arrayindexoutofboundsexception.printStackTrace();
						}
					}
				}
				method1223(class61s_24_);
				Object object_29_ = null;
			} else
				class61s = class77.method1155(((Class79) this).aClass61Array1031, i_5_ >> 1, ((Class79) this).aBoolArray1067);
			if (((Class37) class37).anIntArray390 != null) {
				i_21_ = 0;
				for (int i_30_ = 0; i_30_ < ((Class79) this).anInt1006; i_30_++) {
					int i_31_ = ((Class37) class37).anIntArray390[i_30_];
					if (i_31_ == i_20_)
						((Class79) this).aClass61Array1031[i_30_] = class61s[i_21_++];
				}
			} else {
				if (((Class79) this).aClass61Array1031 != class61s)
					method1223(((Class79) this).aClass61Array1031);
				((Class79) this).aClass61Array1031 = class61s;
			}
		}
		for (int i_32_ = ((Class37) class37).anInt389 - 1; i_32_ >= 0; i_32_--) {
			Class61 class61 = (((Class79) this).aClass61Array1031[((Class37) class37).anIntArray388[i_32_]]);
			Class61 class61_33_ = (((Class79) this).aClass61Array1031[((Class37) class37).anIntArray395[i_32_]]);
			for (int i_34_ = 0; i_34_ < ((Class61) class61).anInt542; i_34_++) {
				float f = ((Class61) class61).aFloatArray541[i_34_];
				float f_35_ = ((Class61) class61_33_).aFloatArray541[i_34_];
				float f_36_ = f;
				float f_37_ = f_35_;
				if (f > 0.0F) {
					if (f_35_ > 0.0F) {
						f_36_ = f;
						f_37_ = f - f_35_;
					} else {
						f_37_ = f;
						f_36_ = f + f_35_;
					}
				} else if (f_35_ > 0.0F) {
					f_36_ = f;
					f_37_ = f + f_35_;
				} else {
					f_37_ = f;
					f_36_ = f - f_35_;
				}
				((Class61) class61).aFloatArray541[i_34_] = f_36_;
				((Class61) class61_33_).aFloatArray541[i_34_] = f_37_;
			}
		}
		for (int i_38_ = 0; i_38_ < ((Class79) this).aBoolArray1005.length; i_38_++)
			((Class79) this).aBoolArray1005[i_38_] = ((Class79) this).aBoolArray1073[i_38_];
		for (int i_39_ = 0; i_39_ < ((Class79) this).anInt1006; i_39_++) {
			if (!((Class79) this).aBoolArray1005[i_39_]) {
				int i_40_ = (((Class37) class37).anIntArray390 != null ? ((Class37) class37).anIntArray390[i_39_] : 0);
				int i_41_ = i_40_;
				int i_42_ = ((Class37) class37).anIntArray391[i_41_];
				((Class79) this).aClass42Array1022[i_42_].method810(i_39_);
				((Class79) this).aClass42Array1022[i_42_].method812(((Class79) this).aClass61Array1031[i_39_], i_5_ >> 1, i_39_);
			}
		}
		for (int i_43_ = 0; i_43_ < ((Class79) this).anInt1006; i_43_++) {
			if (((Class79) this).aBoolArray1005[i_43_]) {
				for (int i_44_ = i_5_ >> 1; i_44_ < i_5_; i_44_++)
					((Class61) ((Class79) this).aClass61Array1031[i_43_]).aFloatArray541[i_44_] = 0.0F;
			} else {
				int i_45_ = i_5_ >> 1;
				int i_46_ = i_5_ >> 2;
				int i_47_ = i_5_ >> 3;
				Class61 class61 = ((Class79) this).aClass61Array1031[i_43_];
				for (int i_48_ = 0; i_48_ < i_45_; i_48_++)
					((Class61) class61).aFloatArray541[i_48_] *= 0.5F;
				for (int i_49_ = i_45_; i_49_ < i_5_; i_49_++)
					((Class61) class61).aFloatArray541[i_49_] = -(((Class61) class61).aFloatArray541[i_5_ - i_49_ - 1]);
				Class61 class61_50_ = (bool ? ((Class79) this).aClass61_1036 : ((Class79) this).aClass61_1032);
				Class61 class61_51_ = (bool ? ((Class79) this).aClass61_1008 : ((Class79) this).aClass61_1056);
				Class61 class61_52_ = (bool ? ((Class79) this).aClass61_1037 : ((Class79) this).aClass61_1034);
				int[] is_53_ = (bool ? ((Class79) this).anIntArray1039 : ((Class79) this).anIntArray1020);
				for (int i_54_ = 0; i_54_ < i_46_; i_54_++) {
					float f = (((Class61) class61).aFloatArray541[4 * i_54_] - (((Class61) class61).aFloatArray541[i_5_ - 4 * i_54_ - 1]));
					float f_55_ = (((Class61) class61).aFloatArray541[4 * i_54_ + 2] - (((Class61) class61).aFloatArray541[i_5_ - 4 * i_54_ - 3]));
					float f_56_ = ((Class61) class61_50_).aFloatArray541[2 * i_54_];
					float f_57_ = (((Class61) class61_50_).aFloatArray541[2 * i_54_ + 1]);
					((Class61) class61).aFloatArray541[i_5_ - 4 * i_54_ - 1] = f * f_56_ - f_55_ * f_57_;
					((Class61) class61).aFloatArray541[i_5_ - 4 * i_54_ - 3] = f * f_57_ + f_55_ * f_56_;
				}
				for (int i_58_ = 0; i_58_ < i_47_; i_58_++) {
					float f = (((Class61) class61).aFloatArray541[i_45_ + 3 + 4 * i_58_]);
					float f_59_ = (((Class61) class61).aFloatArray541[i_45_ + 1 + 4 * i_58_]);
					float f_60_ = ((Class61) class61).aFloatArray541[4 * i_58_ + 3];
					float f_61_ = ((Class61) class61).aFloatArray541[4 * i_58_ + 1];
					((Class61) class61).aFloatArray541[i_45_ + 3 + 4 * i_58_] = f + f_60_;
					((Class61) class61).aFloatArray541[i_45_ + 1 + 4 * i_58_] = f_59_ + f_61_;
					float f_62_ = (((Class61) class61_50_).aFloatArray541[i_45_ - 4 - 4 * i_58_]);
					float f_63_ = (((Class61) class61_50_).aFloatArray541[i_45_ - 3 - 4 * i_58_]);
					((Class61) class61).aFloatArray541[4 * i_58_ + 3] = (f - f_60_) * f_62_ - (f_59_ - f_61_) * f_63_;
					((Class61) class61).aFloatArray541[4 * i_58_ + 1] = (f_59_ - f_61_) * f_62_ + (f - f_60_) * f_63_;
				}
				int i_64_ = Class522.method6220(i_5_ - 1, 630294971);
				for (int i_65_ = 0; i_65_ < i_64_ - 3; i_65_++) {
					int i_66_ = i_5_ >> i_65_ + 2;
					int i_67_ = 8 << i_65_;
					for (int i_68_ = 0; i_68_ < 2 << i_65_; i_68_++) {
						int i_69_ = i_5_ - i_66_ * 2 * i_68_;
						int i_70_ = i_5_ - i_66_ * (2 * i_68_ + 1);
						for (int i_71_ = 0; i_71_ < i_5_ >> i_65_ + 4; i_71_++) {
							int i_72_ = 4 * i_71_;
							float f = (((Class61) class61).aFloatArray541[i_69_ - 1 - i_72_]);
							float f_73_ = (((Class61) class61).aFloatArray541[i_69_ - 3 - i_72_]);
							float f_74_ = (((Class61) class61).aFloatArray541[i_70_ - 1 - i_72_]);
							float f_75_ = (((Class61) class61).aFloatArray541[i_70_ - 3 - i_72_]);
							((Class61) class61).aFloatArray541[(i_69_ - 1 - i_72_)] = f + f_74_;
							((Class61) class61).aFloatArray541[(i_69_ - 3 - i_72_)] = f_73_ + f_75_;
							float f_76_ = (((Class61) class61_50_).aFloatArray541[i_71_ * i_67_]);
							float f_77_ = (((Class61) class61_50_).aFloatArray541[i_71_ * i_67_ + 1]);
							((Class61) class61).aFloatArray541[(i_70_ - 1 - i_72_)] = ((f - f_74_) * f_76_ - (f_73_ - f_75_) * f_77_);
							((Class61) class61).aFloatArray541[(i_70_ - 3 - i_72_)] = ((f_73_ - f_75_) * f_76_ + (f - f_74_) * f_77_);
						}
					}
				}
				for (int i_78_ = 1; i_78_ < i_47_ - 1; i_78_++) {
					int i_79_ = is_53_[i_78_];
					if (i_78_ < i_79_) {
						int i_80_ = 8 * i_78_;
						int i_81_ = 8 * i_79_;
						float f = ((Class61) class61).aFloatArray541[i_80_ + 1];
						((Class61) class61).aFloatArray541[i_80_ + 1] = ((Class61) class61).aFloatArray541[i_81_ + 1];
						((Class61) class61).aFloatArray541[i_81_ + 1] = f;
						f = ((Class61) class61).aFloatArray541[i_80_ + 3];
						((Class61) class61).aFloatArray541[i_80_ + 3] = ((Class61) class61).aFloatArray541[i_81_ + 3];
						((Class61) class61).aFloatArray541[i_81_ + 3] = f;
						f = ((Class61) class61).aFloatArray541[i_80_ + 5];
						((Class61) class61).aFloatArray541[i_80_ + 5] = ((Class61) class61).aFloatArray541[i_81_ + 5];
						((Class61) class61).aFloatArray541[i_81_ + 5] = f;
						f = ((Class61) class61).aFloatArray541[i_80_ + 7];
						((Class61) class61).aFloatArray541[i_80_ + 7] = ((Class61) class61).aFloatArray541[i_81_ + 7];
						((Class61) class61).aFloatArray541[i_81_ + 7] = f;
					}
				}
				for (int i_82_ = 0; i_82_ < i_45_; i_82_++)
					((Class61) class61).aFloatArray541[i_82_] = ((Class61) class61).aFloatArray541[2 * i_82_ + 1];
				for (int i_83_ = 0; i_83_ < i_47_; i_83_++) {
					((Class61) class61).aFloatArray541[i_5_ - 1 - 2 * i_83_] = ((Class61) class61).aFloatArray541[4 * i_83_];
					((Class61) class61).aFloatArray541[i_5_ - 2 - 2 * i_83_] = ((Class61) class61).aFloatArray541[4 * i_83_ + 1];
					((Class61) class61).aFloatArray541[(i_5_ - i_46_ - 1 - 2 * i_83_)] = ((Class61) class61).aFloatArray541[4 * i_83_ + 2];
					((Class61) class61).aFloatArray541[(i_5_ - i_46_ - 2 - 2 * i_83_)] = ((Class61) class61).aFloatArray541[4 * i_83_ + 3];
				}
				for (int i_84_ = 0; i_84_ < i_47_; i_84_++) {
					float f = ((Class61) class61_52_).aFloatArray541[2 * i_84_];
					float f_85_ = (((Class61) class61_52_).aFloatArray541[2 * i_84_ + 1]);
					float f_86_ = (((Class61) class61).aFloatArray541[i_45_ + 2 * i_84_]);
					float f_87_ = (((Class61) class61).aFloatArray541[i_45_ + 2 * i_84_ + 1]);
					float f_88_ = (((Class61) class61).aFloatArray541[i_5_ - 2 - 2 * i_84_]);
					float f_89_ = (((Class61) class61).aFloatArray541[i_5_ - 1 - 2 * i_84_]);
					float f_90_ = f_85_ * (f_86_ - f_88_) + f * (f_87_ + f_89_);
					((Class61) class61).aFloatArray541[i_45_ + 2 * i_84_] = (f_86_ + f_88_ + f_90_) * 0.5F;
					((Class61) class61).aFloatArray541[i_5_ - 2 - 2 * i_84_] = (f_86_ + f_88_ - f_90_) * 0.5F;
					f_90_ = f_85_ * (f_87_ + f_89_) - f * (f_86_ - f_88_);
					((Class61) class61).aFloatArray541[i_45_ + 2 * i_84_ + 1] = (f_87_ - f_89_ + f_90_) * 0.5F;
					((Class61) class61).aFloatArray541[i_5_ - 1 - 2 * i_84_] = (-f_87_ + f_89_ + f_90_) * 0.5F;
				}
				for (int i_91_ = 0; i_91_ < i_46_; i_91_++) {
					((Class61) class61).aFloatArray541[i_91_] = (((((Class61) class61).aFloatArray541[2 * i_91_ + i_45_]) * (((Class61) class61_51_).aFloatArray541[2 * i_91_])) + ((((Class61) class61).aFloatArray541[2 * i_91_ + 1 + i_45_]) * (((Class61) class61_51_).aFloatArray541[2 * i_91_ + 1])));
					((Class61) class61).aFloatArray541[i_45_ - 1 - i_91_] = (((((Class61) class61).aFloatArray541[2 * i_91_ + i_45_]) * (((Class61) class61_51_).aFloatArray541[2 * i_91_ + 1])) - ((((Class61) class61).aFloatArray541[2 * i_91_ + 1 + i_45_]) * (((Class61) class61_51_).aFloatArray541[2 * i_91_])));
				}
				for (int i_92_ = 0; i_92_ < i_46_; i_92_++)
					((Class61) class61).aFloatArray541[i_5_ - i_46_ + i_92_] = -((Class61) class61).aFloatArray541[i_92_];
				for (int i_93_ = 0; i_93_ < i_46_; i_93_++)
					((Class61) class61).aFloatArray541[i_93_] = ((Class61) class61).aFloatArray541[i_46_ + i_93_];
				for (int i_94_ = 0; i_94_ < i_46_; i_94_++)
					((Class61) class61).aFloatArray541[i_46_ + i_94_] = -(((Class61) class61).aFloatArray541[i_46_ - i_94_ - 1]);
				for (int i_95_ = 0; i_95_ < i_46_; i_95_++)
					((Class61) class61).aFloatArray541[i_45_ + i_95_] = ((Class61) class61).aFloatArray541[i_5_ - i_95_ - 1];
				for (int i_96_ = i_9_; i_96_ < i_10_; i_96_++) {
					float f = (float) Math.sin(((double) (i_96_ - i_9_) + 0.5) / (double) i_11_ * 0.5 * 3.141592653589793);
					((Class61) ((Class79) this).aClass61Array1031[i_43_]).aFloatArray541[i_96_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
				for (int i_97_ = i_12_; i_97_ < i_13_; i_97_++) {
					float f = (float) Math.sin((((double) (i_97_ - i_12_) + 0.5) / (double) i_14_ * 0.5 * 3.141592653589793) + 1.5707963267948966);
					((Class61) ((Class79) this).aClass61Array1031[i_43_]).aFloatArray541[i_97_] *= (float) Math.sin(1.5707963267948966 * (double) f * (double) f);
				}
			}
		}
		Class61[] class61s = null;
		if (((Class79) this).anInt1028 > 0) {
			int i_98_ = ((Class79) this).anInt1028 + i_5_ >> 2;
			class61s = method1234(((Class79) this).anInt1006, i_98_);
			for (int i_99_ = 0; i_99_ < ((Class79) this).anInt1006; i_99_++) {
				if (!((Class79) this).aBoolArray1030[i_99_]) {
					for (int i_100_ = 0; i_100_ < ((Class79) this).anInt1029; i_100_++) {
						int i_101_ = (((Class79) this).anInt1028 >> 1) + i_100_;
						((Class61) class61s[i_99_]).aFloatArray541[i_100_] += ((Class61) (((Class79) this).aClass61Array1027[i_99_])).aFloatArray541[i_101_];
					}
				}
				if (!((Class79) this).aBoolArray1005[i_99_]) {
					for (int i_102_ = i_9_; i_102_ < i_5_ >> 1; i_102_++) {
						int i_103_ = (((Class61) class61s[i_99_]).anInt542 - (i_5_ >> 1) + i_102_);
						((Class61) class61s[i_99_]).aFloatArray541[i_103_] += ((Class61) (((Class79) this).aClass61Array1031[i_99_])).aFloatArray541[i_102_];
					}
				}
			}
		}
		Class61[] class61s_104_ = ((Class79) this).aClass61Array1027;
		((Class79) this).aClass61Array1027 = ((Class79) this).aClass61Array1031;
		((Class79) this).aClass61Array1031 = class61s_104_;
		((Class79) this).anInt1028 = i_5_;
		((Class79) this).anInt1029 = i_13_ - (i_5_ >> 1);
		((Class79) this).aBoolArray1030 = ((Class79) this).aBoolArray1005;
		atomicreference.set(class61s);
		return true;
	}

	Class61 method1187(int i) {
		synchronized (aClass127_1051) {
			Object object = null;
			Class61 class61 = (Class61) aClass127_1051.method2249(769962827);
			Class61 class61_105_ = null;
			int i_106_ = i;
			for (/**/; class61 != null; class61 = (Class61) aClass127_1051.method2238(-50734931)) {
				if (((Class61) class61).aFloatArray541.length > i && !((Class61) class61).aBool543 && (class61_105_ == null || (((Class61) class61).aFloatArray541.length < i_106_))) {
					class61_105_ = class61;
					i_106_ = ((Class61) class61_105_).aFloatArray541.length;
				}
				if (((Class61) class61).aFloatArray541.length == i && !((Class61) class61).aBool543)
					break;
			}
			if (class61 == null)
				class61 = class61_105_;
			if (class61 == null) {
				class61 = new Class61(this);
				int i_107_ = 0;
				boolean bool = false;
				while (!bool && i_107_ < 1000) {
					if (aClass127_1051.method2246((long) i_107_) != null)
						i_107_++;
					else
						bool = true;
				}
				((Class61) class61).anInt544 = i_107_;
				float[] fs = new float[i];
				((Class61) class61).aFloatArray541 = fs;
				((Class61) class61).aBool543 = true;
				((Class61) class61).anInt542 = i;
				if (aClass127_1051.method2233(1900183736) >= i * 4) {
					/* empty */
				}
				aClass127_1051.method2230(class61, (long) ((Class61) class61).anInt544, fs.length * 4, 1667086413);
			} else {
				for (int i_108_ = 0; i_108_ < ((Class61) class61).aFloatArray541.length; i_108_++)
					((Class61) class61).aFloatArray541[i_108_] = 0.0F;
				((Class61) class61).anInt542 = i;
			}
			((Class61) class61).aBool543 = true;
			Class61 class61_109_ = class61;
			return class61_109_;
		}
	}

	void method1188(Class61 class61) {
		if (class61 != null) {
			synchronized (aClass127_1051) {
				((Class61) class61).aBool543 = false;
			}
		}
	}

	boolean method1189() {
		return ((Class79) this).aBool1045;
	}

	public synchronized boolean method192() {
		return ((Class79) this).aBool1048;
	}

	void method1190(RSByteBuffer class572_sub15) {
		((Class79) this).aList1017.add(class572_sub15);
	}

	float method1191(int i) {
		int i_110_ = i & 0x1fffff;
		int i_111_ = i & ~0x7fffffff;
		int i_112_ = (i & 0x7fe00000) >> 21;
		if (i_111_ != 0)
			i_110_ = -i_110_;
		return (float) ((double) i_110_ * Math.pow(2.0, (double) (i_112_ - 788)));
	}

	boolean method1192(RSByteBuffer class572_sub15) {
		if (class572_sub15.readUnsignedByte(684363020) != 79 || class572_sub15.readUnsignedByte(200368415) != 103 || class572_sub15.readUnsignedByte(728228342) != 103 || class572_sub15.readUnsignedByte(241636893) != 83)
			return false;
		return true;
	}

	public int method183(int i) {
		return i / (method198().anInt3472 * -1700527127 / 8);
	}

	public synchronized boolean method157() {
		return ((Class79) this).aBool1048;
	}

	int method1193() {
		return ((Class79) this).anInt1070;
	}

	int method1194() {
		return ((Class79) this).anInt1071;
	}

	void method1195(byte[] is, int i) {
		((Class79) this).aByteArray1069 = is;
		((Class79) this).anInt1070 = i;
		((Class79) this).anInt1071 = 0;
	}

	int method1196() {
		int i = ((((Class79) this).aByteArray1069[((Class79) this).anInt1070] >> ((Class79) this).anInt1071) & 0x1);
		((Class79) this).anInt1071++;
		((Class79) this).anInt1070 += ((Class79) this).anInt1071 >> 3;
		((Class79) this).anInt1071 &= 0x7;
		return i;
	}

	int method1197(int i) {
		int i_113_ = 0;
		int i_114_ = 0;
		int i_115_;
		for (/**/; i >= 8 - ((Class79) this).anInt1071; i -= i_115_) {
			i_115_ = 8 - ((Class79) this).anInt1071;
			int i_116_ = (1 << i_115_) - 1;
			i_113_ += (((((Class79) this).aByteArray1069[((Class79) this).anInt1070]) >> ((Class79) this).anInt1071) & i_116_) << i_114_;
			((Class79) this).anInt1071 = 0;
			((Class79) this).anInt1070++;
			i_114_ += i_115_;
		}
		if (i > 0) {
			i_115_ = (1 << i) - 1;
			i_113_ += (((((Class79) this).aByteArray1069[((Class79) this).anInt1070]) >> ((Class79) this).anInt1071) & i_115_) << i_114_;
			((Class79) this).anInt1071 += i;
		}
		return i_113_;
	}

	void method1198() {
		((Class79) this).aByteArray1069 = null;
	}

	void method1199() {
		int i = method1197(8) + 1;
		Iterator iterator = aList1074.iterator();
		while (iterator.hasNext()) {
			Class74 class74 = (Class74) iterator.next();
			if (((Class74) class74).anInt933 == 0 && ((Class74) class74).anInt935 == 0) {
				if (((Class74) class74).aClass60Array932.length == i && (((Class74) class74).anInt937 == ((Class79) this).anInt1006) && (((Class74) class74).anInt934 == ((Class79) this).anInt1041) && (((Class74) class74).anInt936 == ((Class79) this).anInt1066)) {
					((Class79) this).aClass60Array1013 = ((Class74) class74).aClass60Array932;
					for (int i_117_ = 0; i_117_ < ((Class79) this).aClass60Array1013.length; i_117_++)
						((Class79) this).aClass60Array1013[i_117_].method1008(this);
					return;
				}
			}
		}
		((Class79) this).aClass60Array1013 = new Class60[i];
		for (int i_118_ = 0; i_118_ < i; i_118_++) {
			if (((Class79) this).aClass60Array1013[i_118_] == null)
				((Class79) this).aClass60Array1013[i_118_] = new Class60();
			((Class79) this).aClass60Array1013[i_118_].method1009(this);
		}
		Class74 class74 = new Class74(((Class79) this).anInt1006, ((Class79) this).anInt1041, ((Class79) this).anInt1007, ((Class79) this).anInt1009, ((Class79) this).anInt1066, ((Class79) this).aClass60Array1013);
		aList1074.add(class74);
	}

	void method1200(byte[] is, int i) {
		((Class79) this).anInt1062 = 0;
		if (!method157()) {
			if (is == null)
				throw new RuntimeException("");
			int i_119_ = 0;
			if (method1180(is, i, 1))
				i_119_ = 1;
			else if (method1180(is, i, 3))
				i_119_ = 3;
			else if (method1180(is, i, 5))
				i_119_ = 5;
			else
				throw new RuntimeException(new StringBuilder().append("").append(i_119_).toString());
			if (i_119_ == 1) {
				method1195(is, i + 7);
				int i_120_ = method1197(32);
				((Class79) this).anInt1006 = method1197(8);
				((Class79) this).anInt1041 = method1197(32);
				((Class79) this).anInt1007 = method1197(32);
				((Class79) this).anInt1066 = method1197(32);
				((Class79) this).anInt1009 = method1197(32);
				((Class79) this).anInt1072 = 1 << method1197(4);
				((Class79) this).anInt1019 = 1 << method1197(4);
				int i_121_ = 1 << method1197(1);
				if (i_120_ != 0 || i_121_ == 0)
					throw new RuntimeException("");
				((Class79) this).aBool1047 = true;
				((Class79) this).anInt1052++;
			} else if (i_119_ != 3 && i_119_ == 5) {
				if (!method1180(is, i, 5))
					throw new RuntimeException("");
				method1195(is, i + 7);
				if (((Class79) this).aClass61Array1031 != null) {
					method1223(((Class79) this).aClass61Array1031);
					((Class79) this).aClass61Array1031 = null;
				}
				((Class79) this).aClass61Array1031 = method1234(((Class79) this).anInt1006, ((Class79) this).anInt1019);
				for (int i_122_ = 0; i_122_ < 2; i_122_++) {
					int i_123_ = (i_122_ != 0 ? ((Class79) this).anInt1019 : ((Class79) this).anInt1072);
					int i_124_ = i_123_ >> 1;
					int i_125_ = i_123_ >> 2;
					int i_126_ = i_123_ >> 3;
					Class61 class61 = method1187(i_124_);
					for (int i_127_ = 0; i_127_ < i_125_; i_127_++) {
						((Class61) class61).aFloatArray541[2 * i_127_] = (float) Math.cos((double) (4 * i_127_) * 3.141592653589793 / (double) i_123_);
						((Class61) class61).aFloatArray541[2 * i_127_ + 1] = -(float) Math.sin((double) (4 * i_127_) * 3.141592653589793 / (double) i_123_);
					}
					Class61 class61_128_ = method1187(i_124_);
					for (int i_129_ = 0; i_129_ < i_125_; i_129_++) {
						((Class61) class61_128_).aFloatArray541[2 * i_129_] = (float) Math.cos((double) (2 * i_129_ + 1) * 3.141592653589793 / (double) (2 * i_123_));
						((Class61) class61_128_).aFloatArray541[2 * i_129_ + 1] = (float) Math.sin((double) (2 * i_129_ + 1) * 3.141592653589793 / (double) (2 * i_123_));
					}
					Class61 class61_130_ = method1187(i_125_);
					for (int i_131_ = 0; i_131_ < i_126_; i_131_++) {
						((Class61) class61_130_).aFloatArray541[2 * i_131_] = (float) Math.cos((double) (4 * i_131_ + 2) * 3.141592653589793 / (double) i_123_);
						((Class61) class61_130_).aFloatArray541[2 * i_131_ + 1] = -(float) Math.sin((double) (4 * i_131_ + 2) * 3.141592653589793 / (double) i_123_);
					}
					int[] is_132_ = new int[i_126_];
					int i_133_ = Class522.method6220(i_126_ - 1, -813511675);
					for (int i_134_ = 0; i_134_ < i_126_; i_134_++)
						is_132_[i_134_] = Class479.method5671(i_134_, i_133_, (byte) 9);
					if (i_122_ != 0) {
						((Class79) this).aClass61_1036 = class61;
						((Class79) this).aClass61_1008 = class61_128_;
						((Class79) this).aClass61_1037 = class61_130_;
						((Class79) this).anIntArray1039 = is_132_;
					} else {
						((Class79) this).aClass61_1032 = class61;
						((Class79) this).aClass61_1056 = class61_128_;
						((Class79) this).aClass61_1034 = class61_130_;
						((Class79) this).anIntArray1020 = is_132_;
					}
				}
				method1199();
				int i_135_ = method1197(6) + 1;
				for (int i_136_ = 0; i_136_ < i_135_; i_136_++)
					method1197(16);
				i_135_ = method1197(6) + 1;
				if (((Class79) this).aClass42Array1022 == null || ((Class79) this).aClass42Array1022.length != i_135_)
					((Class79) this).aClass42Array1022 = new Class42[i_135_];
				for (int i_137_ = 0; i_137_ < i_135_; i_137_++) {
					if (((Class79) this).aClass42Array1022[i_137_] == null)
						((Class79) this).aClass42Array1022[i_137_] = new Class42();
					((Class79) this).aClass42Array1022[i_137_].method805(this, ((Class79) this).anInt1006);
				}
				int i_138_ = method1197(6) + 1;
				if (((Class79) this).aClass77Array1021 == null || ((Class79) this).aClass77Array1021.length != i_138_)
					((Class79) this).aClass77Array1021 = new Class77[i_138_];
				for (int i_139_ = 0; i_139_ < i_138_; i_139_++) {
					if (((Class79) this).aClass77Array1021[i_139_] == null)
						((Class79) this).aClass77Array1021[i_139_] = new Class77();
					((Class79) this).aClass77Array1021[i_139_].method1157(this);
				}
				int i_140_ = method1197(6) + 1;
				if (((Class79) this).aClass37Array1012 == null || ((Class79) this).aClass37Array1012.length != i_140_)
					((Class79) this).aClass37Array1012 = new Class37[i_140_];
				for (int i_141_ = 0; i_141_ < i_140_; i_141_++) {
					if (((Class79) this).aClass37Array1012[i_141_] == null)
						((Class79) this).aClass37Array1012[i_141_] = new Class37();
					((Class79) this).aClass37Array1012[i_141_].method788(this);
				}
				int i_142_ = method1197(6) + 1;
				((Class79) this).aBoolArray1025 = new boolean[i_142_];
				((Class79) this).anIntArray1026 = new int[i_142_];
				for (int i_143_ = 0; i_143_ < i_142_; i_143_++) {
					((Class79) this).aBoolArray1025[i_143_] = method1196() != 0;
					method1197(16);
					method1197(16);
					((Class79) this).anIntArray1026[i_143_] = method1197(8);
				}
				method1185(true);
			}
		}
	}

	int method1201(int i) {
		int i_144_ = 0;
		for (/**/; i > 0; i >>= 1)
			i_144_++;
		return i_144_;
	}

	public RSByteBuffer method162(int i) {
		RSByteBuffer class572_sub15 = method1205(i);
		return class572_sub15;
	}

	public Class298 method158() {
		return ((Class79) this).aClass298_1014;
	}

	synchronized void method1202(RSByteBuffer class572_sub15) {
		((Class79) this).aList1068.add(class572_sub15);
		method1179(Class291.aClass291_3441);
	}

	boolean method1203() {
		return ((Class79) this).aBool1045;
	}

	static {
		aClass127_1051 = new Class127(524288, 1024);
	}

	int method1204(float f) {
		int i = (int) (f * 127.0F + 128.0F);
		if (i > 255)
			return 255;
		if (i < 0)
			return 0;
		return i;
	}

	RSByteBuffer method1205(int i) {
		RSByteBuffer class572_sub15 = method1206(method163(i));
		int i_145_ = i;
		synchronized (((Class79) this).aList1011) {
			while (!((Class79) this).aList1011.isEmpty()) {
				RSByteBuffer class572_sub15_146_ = (RSByteBuffer) ((Class79) this).aList1011.remove(0);
				((Class79) this).anInt1023 -= (method196(class572_sub15_146_.o * -1585139053) / method159());
				int i_147_ = method163(i_145_);
				int i_148_ = (class572_sub15_146_.o * -1585139053 < i_147_ ? class572_sub15_146_.o * -1585139053 : i_147_);
				class572_sub15.writeBytes(class572_sub15_146_.b, 0, i_148_, (byte) -47);
				i_145_ -= method196(i_148_);
				int i_149_ = class572_sub15_146_.o * -1585139053 - i_148_;
				if (i_149_ != 0) {
					System.arraycopy(class572_sub15_146_.b, i_148_, class572_sub15_146_.b, 0, i_149_);
					class572_sub15_146_.o = i_149_ * 310393755;
					((Class79) this).anInt1023 += method196(i_149_) / method159();
					((Class79) this).aList1011.add(0, class572_sub15_146_);
				} else
					class572_sub15_146_.method8449((byte) 110);
				if (i_145_ <= 0)
					break;
			}
			if (((Class79) this).aList1011.isEmpty() && method155() == Class291.aClass291_3444)
				method1179(Class291.aClass291_3440);
		}
		return class572_sub15;
	}

	RSByteBuffer method1206(int i) {
		return new RSByteBuffer(i, true);
	}

	int method1207() {
		return ((Class79) this).anInt1023;
	}

	int method1208() {
		if (method157())
			return ((Class79) this).anInt1041;
		throw new RuntimeException("");
	}

	int method1209(float f) {
		int i = (int) (f * 32767.0F);
		if (i > 32767)
			return 32767;
		if (i < -32768)
			return -32768;
		return i;
	}

	public void method164(boolean bool) {
		if (!bool)
			method151();
		else if (method155() == Class291.aClass291_3440) {
			method1235(true);
			method1179(Class291.aClass291_3441);
		}
	}

	public void method168(boolean bool) {
		if (!bool)
			method151();
		else if (method155() == Class291.aClass291_3440) {
			method1235(true);
			method1179(Class291.aClass291_3441);
		}
	}

	public void method169() {
		if (method155() != Class291.aClass291_3442) {
			method1235(false);
			method1179(Class291.aClass291_3446);
		} else {
			method1235(false);
			method1179(Class291.aClass291_3445);
		}
	}

	int method1210() {
		return ((Class79) this).anInt1023;
	}

	public void method171() {
		if (method155() != Class291.aClass291_3442) {
			method1235(false);
			method1179(Class291.aClass291_3446);
		} else {
			method1235(false);
			method1179(Class291.aClass291_3445);
		}
	}

	public void method179() {
		if (method155() != Class291.aClass291_3442) {
			method1235(false);
			method1179(Class291.aClass291_3446);
		} else {
			method1235(false);
			method1179(Class291.aClass291_3445);
		}
	}

	public Class291 method173() {
		return ((Class79) this).aClass291_1033;
	}

	public Class291 method193() {
		return ((Class79) this).aClass291_1033;
	}

	public void method166(boolean bool, int i, int i_150_, int i_151_) {
		((Class79) this).aBool1038 = bool;
		((Class79) this).anInt1057 = i;
		((Class79) this).anInt1016 = i_150_;
		((Class79) this).anInt1065 = i_151_;
	}

	public void method194(Interface30 interface30) {
		((Class79) this).anInterface30_1010 = interface30;
	}

	public void method176(RSByteBuffer class572_sub15) {
		if (method155() == Class291.aClass291_3444 || method155() == Class291.aClass291_3440) {
			if (class572_sub15 != null)
				class572_sub15.method8449((byte) 68);
		} else if (class572_sub15 == null) {
			boolean bool = (((Class79) this).aBool1038 && ((((Class79) this).anInt1057 > 0 && (((Class79) this).anInt1059 < ((Class79) this).anInt1057)) || ((Class79) this).anInt1057 < 0));
			if (((Class79) this).aList1011.isEmpty()) {
				if (!bool) {
					method1198();
					method1179(Class291.aClass291_3440);
				}
			} else if (!bool) {
				method1198();
				method1179(Class291.aClass291_3444);
			}
			if (bool)
				method1235(true);
		} else
			method1202(class572_sub15);
	}

	public void method178() {
		if (method155() == Class291.aClass291_3445 || method155() == Class291.aClass291_3446 || method155() == Class291.aClass291_3441) {
			method1179(Class291.aClass291_3442);
			method1214();
		}
	}

	public int method180() {
		return method1207();
	}

	public int method181() {
		return method1207();
	}

	public int method182(int i) {
		return i / (method198().anInt3472 * -1700527127 / 8);
	}

	void method1211() {
		if (method155() != Class291.aClass291_3445 && method155() != Class291.aClass291_3443 && (!((Class79) this).aBool1048 || !((float) (((Class79) this).anInt1023 / method1208()) > ((Class79) this).aFloat1018))) {
			if (!method1189()) {
				RSByteBuffer class572_sub15 = ((RSByteBuffer) ((((Class79) this).aList1068 != null && !((Class79) this).aList1068.isEmpty()) ? ((Class79) this).aList1068.get(0) : null));
				if (class572_sub15 == null) {
					if (!((Class79) this).aBool1046) {
						method1179(Class291.aClass291_3443);
						((Class79) this).anInterface30_1010.method150(157374962);
						((Class79) this).aBool1046 = true;
					}
					return;
				}
				((Class79) this).aBool1046 = false;
				((Class79) this).aBool1045 = true;
				((Class79) this).aList1068.remove(0);
				method1190(class572_sub15);
			}
			method1220();
		}
	}

	public int method174(int i) {
		return i * (method198().anInt3472 * -1700527127 / 8);
	}

	public int method172(int i) {
		return i * (method198().anInt3472 * -1700527127 / 8);
	}

	public int method186(int i) {
		return i * (method198().anInt3472 * -1700527127 / 8);
	}

	void method1212() {
		if (method155() != Class291.aClass291_3444) {
			method1228();
			if (method155() == Class291.aClass291_3442)
				method1179(Class291.aClass291_3441);
		}
	}

	int method1213() {
		return ((Class79) this).anInt1070;
	}

	public Class298 method188() {
		return ((Class79) this).aClass298_1014;
	}

	public void method160(int i, Class297 class297, Class298 class298, int i_152_) {
		((Class79) this).anInt1015 = i_152_;
		if (method1183(i, class297, class298)) {
			((Class79) this).aClass297_1058 = class297;
			((Class79) this).aClass298_1014 = class298;
		} else
			throw new RuntimeException("");
	}

	public void method189(int i, Class297 class297, Class298 class298, int i_153_) {
		((Class79) this).anInt1015 = i_153_;
		if (method1183(i, class297, class298)) {
			((Class79) this).aClass297_1058 = class297;
			((Class79) this).aClass298_1014 = class298;
		} else
			throw new RuntimeException("");
	}

	public synchronized boolean method167() {
		return ((Class79) this).aBool1048;
	}

	public void method156(Interface30 interface30) {
		((Class79) this).anInterface30_1010 = interface30;
	}

	public void method190(boolean bool, int i, int i_154_, int i_155_) {
		((Class79) this).aBool1038 = bool;
		((Class79) this).anInt1057 = i;
		((Class79) this).anInt1016 = i_154_;
		((Class79) this).anInt1065 = i_155_;
	}

	public Class79(float f) {
		((Class79) this).aClass291_1033 = Class291.aClass291_3446;
		((Class79) this).aList1017 = new ArrayList();
		((Class79) this).aClass572_Sub15_1042 = null;
		((Class79) this).anInt1043 = 0;
		((Class79) this).anInt1044 = 0;
		((Class79) this).aList1011 = new ArrayList();
		((Class79) this).aList1054 = new ArrayList();
		((Class79) this).aList1060 = new ArrayList();
		((Class79) this).anAtomicReference1061 = new AtomicReference(null);
		((Class79) this).anInt1063 = 0;
		((Class79) this).aBool1038 = false;
		((Class79) this).anInt1023 = 0;
		((Class79) this).aBoolArray1005 = null;
		((Class79) this).aBoolArray1073 = null;
		((Class79) this).aBoolArray1067 = null;
		((Class79) this).aFloat1018 = f;
		((Class79) this).aClass297_1058 = Class297.aClass297_3470;
		((Class79) this).aClass298_1014 = Class298.aClass298_3478;
		method1235(false);
	}

	void method1214() {
		if (method155() != Class291.aClass291_3444) {
			method1228();
			if (method155() == Class291.aClass291_3442)
				method1179(Class291.aClass291_3441);
		}
	}

	public void method170() {
		if (method155() != Class291.aClass291_3442) {
			method1235(false);
			method1179(Class291.aClass291_3446);
		} else {
			method1235(false);
			method1179(Class291.aClass291_3445);
		}
	}

	public int method55() {
		return method1207();
	}

	void method1215() {
		if (method155() != Class291.aClass291_3444) {
			method1228();
			if (method155() == Class291.aClass291_3442)
				method1179(Class291.aClass291_3441);
		}
	}

	void method1216() {
		if (method155() != Class291.aClass291_3444) {
			method1228();
			if (method155() == Class291.aClass291_3442)
				method1179(Class291.aClass291_3441);
		}
	}

	void method1217() {
		if (method155() != Class291.aClass291_3444) {
			method1228();
			if (method155() == Class291.aClass291_3442)
				method1179(Class291.aClass291_3441);
		}
	}

	void method1218() {
		if (method155() != Class291.aClass291_3444) {
			method1228();
			if (method155() == Class291.aClass291_3442)
				method1179(Class291.aClass291_3441);
		}
	}

	void method1219() {
		if (method155() != Class291.aClass291_3444) {
			method1228();
			if (method155() == Class291.aClass291_3442)
				method1179(Class291.aClass291_3441);
		}
	}

	public void method177() {
		if (method155() == Class291.aClass291_3445 || method155() == Class291.aClass291_3446 || method155() == Class291.aClass291_3441) {
			method1179(Class291.aClass291_3442);
			method1214();
		}
	}

	synchronized void method1220() {
		int i = (((Class79) this).aClass572_Sub15_1042 != null ? ((Class79) this).aClass572_Sub15_1042.o * -1585139053 : 0);
		int i_156_ = 0;
		Iterator iterator = ((Class79) this).aList1017.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class572_sub15 = (RSByteBuffer) iterator.next();
			i_156_ += class572_sub15.o * -1585139053;
		}
		if (((Class79) this).aClass572_Sub15_1042 != null) {
			if ((((Class79) this).aClass572_Sub15_1042.b.length - (((Class79) this).aClass572_Sub15_1042.o * -1585139053)) < i_156_) {
				RSByteBuffer class572_sub15 = method1206(i_156_ + ((Class79) this).anInt1043);
				class572_sub15.writeBytes(((Class79) this).aClass572_Sub15_1042.b, (((Class79) this).aClass572_Sub15_1042.o * -1585139053) - ((Class79) this).anInt1044, ((Class79) this).anInt1043, (byte) -8);
				((Class79) this).aClass572_Sub15_1042.method8449((byte) 86);
				((Class79) this).aClass572_Sub15_1042 = class572_sub15;
				i = ((Class79) this).anInt1044;
			}
		} else {
			((Class79) this).aClass572_Sub15_1042 = method1206(i_156_);
			((Class79) this).anInt1043 = 0;
			i = 0;
		}
		iterator = ((Class79) this).aList1017.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class572_sub15 = (RSByteBuffer) iterator.next();
			((Class79) this).aClass572_Sub15_1042.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) -1);
			((Class79) this).anInt1043 += class572_sub15.o * -1585139053;
			class572_sub15.method8449((byte) 66);
		}
		((Class79) this).aClass572_Sub15_1042.o = (i - ((Class79) this).anInt1044) * 310393755;
		((Class79) this).anInt1044 = 0;
		((Class79) this).aList1017.clear();
		while (((Class79) this).aBool1045 && ((((Class79) this).aClass572_Sub15_1042.o * -1585139053) < (((Class79) this).aClass572_Sub15_1042.b).length)) {
			if (((Class79) this).aBool1048 && ((float) (((Class79) this).anInt1023 / method1208()) > ((Class79) this).aFloat1018))
				break;
			if (((Class79) this).aClass572_Sub15_1042 == null || ((Class79) this).anInt1043 < 27) {
				if (((Class79) this).aClass572_Sub15_1042 != null) {
					((Class79) this).anInt1044 = ((Class79) this).anInt1043;
					((Class79) this).aClass572_Sub15_1042.o += ((Class79) this).anInt1043 * 310393755;
				}
				((Class79) this).aBool1045 = false;
				break;
			}
			int i_157_ = (((Class79) this).aClass572_Sub15_1042.o * -1585139053);
			int i_158_ = 0;
			int i_159_ = 0;
			if (!method1192(((Class79) this).aClass572_Sub15_1042))
				break;
			((Class79) this).anInt1024++;
			if (((Class79) this).anInt1055 < 0)
				((Class79) this).anInt1035++;
			((Class79) this).aList1054.clear();
			((Class79) this).aList1060.clear();
			((Class79) this).aClass572_Sub15_1042.readUnsignedByte(1997115402);
			int i_160_ = ((Class79) this).aClass572_Sub15_1042.readUnsignedByte(395281021);
			int i_161_ = ((((Class79) this).aClass572_Sub15_1042.readUnsignedByte(-92634716) & 0xff) | (((Class79) this).aClass572_Sub15_1042.readUnsignedByte(1777077101) & 0xff) << 8 | (((Class79) this).aClass572_Sub15_1042.readUnsignedByte(52181263) & 0xff) << 16 | ((Class79) this).aClass572_Sub15_1042.readUnsignedByte(406382980) << 24);
			i_158_ = i_161_ - i_158_;
			((Class79) this).aClass572_Sub15_1042.o += 671332784;
			int i_162_ = ((Class79) this).aClass572_Sub15_1042.readUnsignedByte(1996840925);
			int i_163_ = (((Class79) this).aClass572_Sub15_1042.o * -1585139053);
			int i_164_ = i_163_ + i_162_;
			if (i_164_ > i_157_ + ((Class79) this).anInt1043) {
				((Class79) this).aClass572_Sub15_1042.o = (i_157_ + ((Class79) this).anInt1043) * 310393755;
				((Class79) this).anInt1044 = (((Class79) this).aClass572_Sub15_1042.o * -1585139053) - i_157_;
				((Class79) this).aBool1045 = false;
			}
			int i_165_ = i_164_;
			int i_166_ = 0;
			if (((Class79) this).aBool1045) {
				for (int i_167_ = 0; i_167_ < i_162_; i_167_++) {
					int i_168_ = ((((Class79) this).aClass572_Sub15_1042.b[i_163_++]) & 0xff);
					i_164_ += i_168_;
					i_166_ += i_168_;
					if (i_164_ > i_157_ + ((Class79) this).anInt1043) {
						((Class79) this).aClass572_Sub15_1042.o = ((i_157_ + ((Class79) this).anInt1043) * 310393755);
						((Class79) this).anInt1044 = (((Class79) this).aClass572_Sub15_1042.o * -1585139053) - i_157_;
						((Class79) this).aBool1045 = false;
						break;
					}
					if (i_168_ < 255) {
						((Class79) this).aList1054.add(Integer.valueOf(i_165_));
						((Class79) this).aList1060.add(Integer.valueOf(i_166_));
						i_165_ = i_164_;
						i_166_ = 0;
					}
				}
			}
			if (((Class79) this).aBool1045) {
				int i_169_ = i_164_;
				int i_170_ = -1;
				Iterator iterator_171_ = ((Class79) this).aList1054.iterator();
				Iterator iterator_172_ = ((Class79) this).aList1060.iterator();
				boolean bool = false;
				((Class79) this).anInt1063 = 0;
				while (iterator_171_.hasNext()) {
					Integer integer = (Integer) iterator_171_.next();
					Integer integer_173_ = (Integer) iterator_172_.next();
					i_170_++;
					if (method157() && ((Class79) this).aBool1053 == true && (((Class79) this).anInt1024 < ((Class79) this).anInt1035) && i_170_ < ((Class79) this).anInt1055) {
						Class79 class79_174_ = this;
						((Class79) class79_174_).anInt1049 = ((Class79) class79_174_).anInt1049 + (bool ? 0 : i_158_);
						bool = true;
					} else {
						((Class79) this).anAtomicReference1061.set(null);
						boolean bool_175_ = method1186((((Class79) this).aClass572_Sub15_1042.b), integer.intValue(), integer_173_.intValue(), (((Class79) this).anAtomicReference1061));
						Class61[] class61s = ((Class61[]) ((Class79) this).anAtomicReference1061.get());
						if (bool_175_ && (((Class79) this).aBool1053 != true || (((Class79) this).anInt1024 >= ((Class79) this).anInt1035) || i_170_ >= ((Class79) this).anInt1055)) {
							if (class61s != null) {
								int i_176_ = ((Class61) class61s[0]).anInt542;
								((Class79) this).anInt1062 += i_176_;
								if (((Class79) this).anInt1062 > i_161_ && i_160_ == 4) {
									((Class79) this).anInt1063 = (((Class79) this).anInt1062 - i_161_ - ((Class79) this).anInt1063);
									i_176_ -= ((Class79) this).anInt1063;
									if (((Class79) this).anInt1063 > ((Class61) class61s[0]).anInt542)
										((Class79) this).anInt1063 = ((Class61) class61s[0]).anInt542;
									if (i_176_ < 0)
										i_176_ = 0;
								}
								int i_177_ = 0;
								int i_178_ = method163(i_176_) * class61s.length;
								if (((Class79) this).aBool1053 == true && (((Class79) this).anInt1049 < ((Class79) this).anInt1016)) {
									int i_179_ = i_178_;
									i_178_ -= method163(((Class79) this).anInt1016 - (((Class79) this).anInt1049));
									if (i_178_ <= 0) {
										((Class79) this).anInt1049 += method196(i_179_);
										method1223(class61s);
										Object object = null;
										continue;
									}
									i_177_ += (((Class79) this).anInt1016 - ((Class79) this).anInt1049);
								}
								if ((((Class79) this).anInt1049 + i_176_ > ((Class79) this).anInt1065) && ((((Class79) this).anInt1059 < ((Class79) this).anInt1057) || ((Class79) this).anInt1057 < 0) && ((Class79) this).aBool1038) {
									i_178_ -= method163(((Class79) this).anInt1049 + i_176_ - (((Class79) this).anInt1065) - 1);
									if (i_178_ <= 0) {
										method1223(class61s);
										Object object = null;
										continue;
									}
								}
								int i_180_ = method159();
								if (method1184() < method159()) {
									int i_181_ = method159() - method1184();
									i_178_ += i_178_ / method1184() * i_181_;
								}
								RSByteBuffer class572_sub15 = method1206(i_178_);
								for (int i_182_ = i_177_; i_182_ < i_176_; i_182_++) {
									boolean bool_183_ = ((Class79) this).aBool1053;
									if (((Class79) this).anInt1057 != 0) {
										if (((Class79) this).anInt1049 == ((Class79) this).anInt1016) {
											if (((Class79) this).anInt1050 < 0) {
												((Class79) this).anInt1050 = (((Class79) this).anInt1052);
												((Class79) this).anInt1055 = i_170_;
											}
											((Class79) this).aBool1053 = false;
										}
										if ((((Class79) this).anInt1049 == ((Class79) this).anInt1065) && ((Class79) this).anInt1040 < 0)
											((Class79) this).anInt1040 = ((Class79) this).anInt1052;
										if ((((Class79) this).anInt1049 > ((Class79) this).anInt1065) && ((((Class79) this).anInt1059 < ((Class79) this).anInt1057) || (((Class79) this).anInt1057 < 0)) && ((Class79) this).aBool1038)
											bool_183_ = true;
									}
									if (bool_183_ && ((((Class79) this).anInt1049 < ((Class79) this).anInt1016) || (((Class79) this).anInt1049 > (((Class79) this).anInt1065)))) {
										((Class79) this).anInt1049++;
										if (++i_159_ > i_158_)
											throw new RuntimeException();
									} else {
										for (int i_184_ = 0; i_184_ < i_180_; i_184_++) {
											float f;
											if (i_184_ < class61s.length)
												f = (((Class61) class61s[i_184_]).aFloatArray541[i_182_]);
											else
												f = (((Class61) (class61s[(i_184_ % method1184())])).aFloatArray541[i_182_]);
											if (((Class79) this).aClass297_1058 == Class297.aClass297_3470) {
												int i_185_ = method1209(f);
												if ((((Class79) this).aClass298_1014) == Class298.aClass298_3478)
													class572_sub15.method8453(i_185_, 1542882396);
												else
													class572_sub15.writeShort(i_185_, -1538197856);
											} else if ((((Class79) this).aClass297_1058) == (Class297.aClass297_3471)) {
												int i_186_ = method1182(f);
												if ((((Class79) this).aClass298_1014) == Class298.aClass298_3478)
													class572_sub15.method8453(i_186_, 1833396195);
												else
													class572_sub15.writeShort(i_186_, -1572878880);
											} else if ((((Class79) this).aClass297_1058) == (Class297.aClass297_3469)) {
												int i_187_ = method1181(f);
												class572_sub15.writeByte(i_187_, -1384395473);
											} else if ((((Class79) this).aClass297_1058) == (Class297.aClass297_3468)) {
												int i_188_ = method1204(f);
												class572_sub15.writeByte(i_188_, -1384395473);
											}
										}
										((Class79) this).anInt1049++;
										i_159_++;
									}
								}
								synchronized (((Class79) this).aList1011) {
									((Class79) this).anInt1023 += (method196(class572_sub15.o * -1585139053) / method159());
									((Class79) this).aList1011.add(class572_sub15);
								}
							}
						} else if (method157()) {
							((Class79) this).anInt1028 = 0;
							if (((Class79) this).aClass61Array1027 == null || (((Class79) this).aClass61Array1027 != null && (((((Class79) this).aClass61Array1027).length != ((Class79) this).anInt1006) || (((Class61) (((Class79) this).aClass61Array1027[0])).anInt542 != ((Class79) this).anInt1019)))) {
								if (((Class79) this).aClass61Array1027 != null)
									method1223(((Class79) this).aClass61Array1027);
								((Class79) this).aClass61Array1027 = method1234(((Class79) this).anInt1006, ((Class79) this).anInt1019);
							}
						}
						method1223(class61s);
						Object object = null;
					}
				}
				((Class79) this).aClass572_Sub15_1042.o = i_169_ * 310393755;
				((Class79) this).anInt1043 -= i_169_ - i_157_;
			}
		}
	}

	boolean method1221() {
		return ((Class79) this).aBool1045;
	}

	public void method108(RSByteBuffer class572_sub15) {
		if (method155() == Class291.aClass291_3444 || method155() == Class291.aClass291_3440) {
			if (class572_sub15 != null)
				class572_sub15.method8449((byte) 100);
		} else if (class572_sub15 == null) {
			boolean bool = (((Class79) this).aBool1038 && ((((Class79) this).anInt1057 > 0 && (((Class79) this).anInt1059 < ((Class79) this).anInt1057)) || ((Class79) this).anInt1057 < 0));
			if (((Class79) this).aList1011.isEmpty()) {
				if (!bool) {
					method1198();
					method1179(Class291.aClass291_3440);
				}
			} else if (!bool) {
				method1198();
				method1179(Class291.aClass291_3444);
			}
			if (bool)
				method1235(true);
		} else
			method1202(class572_sub15);
	}

	int method1222() {
		return ((Class79) this).anInt1023;
	}

	void method1223(Class61[] class61s) {
		if (class61s != null) {
			for (int i = 0; i < class61s.length; i++)
				method1188(class61s[i]);
		}
	}

	public int method197() {
		if (((Class79) this).aBool1047)
			return (method1184() < ((Class79) this).anInt1015 ? ((Class79) this).anInt1015 : method1184());
		throw new RuntimeException("");
	}

	int method1224() {
		return ((Class79) this).anInt1070;
	}

	int method1225() {
		return ((Class79) this).anInt1071;
	}

	int method1226() {
		return ((Class79) this).anInt1071;
	}

	int method1227() {
		int i = ((((Class79) this).aByteArray1069[((Class79) this).anInt1070] >> ((Class79) this).anInt1071) & 0x1);
		((Class79) this).anInt1071++;
		((Class79) this).anInt1070 += ((Class79) this).anInt1071 >> 3;
		((Class79) this).anInt1071 &= 0x7;
		return i;
	}

	void method1228() {
		if (method155() != Class291.aClass291_3445 && method155() != Class291.aClass291_3443 && (!((Class79) this).aBool1048 || !((float) (((Class79) this).anInt1023 / method1208()) > ((Class79) this).aFloat1018))) {
			if (!method1189()) {
				RSByteBuffer class572_sub15 = ((RSByteBuffer) ((((Class79) this).aList1068 != null && !((Class79) this).aList1068.isEmpty()) ? ((Class79) this).aList1068.get(0) : null));
				if (class572_sub15 == null) {
					if (!((Class79) this).aBool1046) {
						method1179(Class291.aClass291_3443);
						((Class79) this).anInterface30_1010.method150(157374962);
						((Class79) this).aBool1046 = true;
					}
					return;
				}
				((Class79) this).aBool1046 = false;
				((Class79) this).aBool1045 = true;
				((Class79) this).aList1068.remove(0);
				method1190(class572_sub15);
			}
			method1220();
		}
	}

	void method1229() {
		((Class79) this).aByteArray1069 = null;
	}

	void method1230() {
		int i = method1197(8) + 1;
		Iterator iterator = aList1074.iterator();
		while (iterator.hasNext()) {
			Class74 class74 = (Class74) iterator.next();
			if (((Class74) class74).anInt933 == 0 && ((Class74) class74).anInt935 == 0) {
				if (((Class74) class74).aClass60Array932.length == i && (((Class74) class74).anInt937 == ((Class79) this).anInt1006) && (((Class74) class74).anInt934 == ((Class79) this).anInt1041) && (((Class74) class74).anInt936 == ((Class79) this).anInt1066)) {
					((Class79) this).aClass60Array1013 = ((Class74) class74).aClass60Array932;
					for (int i_189_ = 0; i_189_ < ((Class79) this).aClass60Array1013.length; i_189_++)
						((Class79) this).aClass60Array1013[i_189_].method1008(this);
					return;
				}
			}
		}
		((Class79) this).aClass60Array1013 = new Class60[i];
		for (int i_190_ = 0; i_190_ < i; i_190_++) {
			if (((Class79) this).aClass60Array1013[i_190_] == null)
				((Class79) this).aClass60Array1013[i_190_] = new Class60();
			((Class79) this).aClass60Array1013[i_190_].method1009(this);
		}
		Class74 class74 = new Class74(((Class79) this).anInt1006, ((Class79) this).anInt1041, ((Class79) this).anInt1007, ((Class79) this).anInt1009, ((Class79) this).anInt1066, ((Class79) this).aClass60Array1013);
		aList1074.add(class74);
	}

	void method1231() {
		int i = method1197(8) + 1;
		Iterator iterator = aList1074.iterator();
		while (iterator.hasNext()) {
			Class74 class74 = (Class74) iterator.next();
			if (((Class74) class74).anInt933 == 0 && ((Class74) class74).anInt935 == 0) {
				if (((Class74) class74).aClass60Array932.length == i && (((Class74) class74).anInt937 == ((Class79) this).anInt1006) && (((Class74) class74).anInt934 == ((Class79) this).anInt1041) && (((Class74) class74).anInt936 == ((Class79) this).anInt1066)) {
					((Class79) this).aClass60Array1013 = ((Class74) class74).aClass60Array932;
					for (int i_191_ = 0; i_191_ < ((Class79) this).aClass60Array1013.length; i_191_++)
						((Class79) this).aClass60Array1013[i_191_].method1008(this);
					return;
				}
			}
		}
		((Class79) this).aClass60Array1013 = new Class60[i];
		for (int i_192_ = 0; i_192_ < i; i_192_++) {
			if (((Class79) this).aClass60Array1013[i_192_] == null)
				((Class79) this).aClass60Array1013[i_192_] = new Class60();
			((Class79) this).aClass60Array1013[i_192_].method1009(this);
		}
		Class74 class74 = new Class74(((Class79) this).anInt1006, ((Class79) this).anInt1041, ((Class79) this).anInt1007, ((Class79) this).anInt1009, ((Class79) this).anInt1066, ((Class79) this).aClass60Array1013);
		aList1074.add(class74);
	}

	void method1232() {
		if (method155() != Class291.aClass291_3445 && method155() != Class291.aClass291_3443 && (!((Class79) this).aBool1048 || !((float) (((Class79) this).anInt1023 / method1208()) > ((Class79) this).aFloat1018))) {
			if (!method1189()) {
				RSByteBuffer class572_sub15 = ((RSByteBuffer) ((((Class79) this).aList1068 != null && !((Class79) this).aList1068.isEmpty()) ? ((Class79) this).aList1068.get(0) : null));
				if (class572_sub15 == null) {
					if (!((Class79) this).aBool1046) {
						method1179(Class291.aClass291_3443);
						((Class79) this).anInterface30_1010.method150(157374962);
						((Class79) this).aBool1046 = true;
					}
					return;
				}
				((Class79) this).aBool1046 = false;
				((Class79) this).aBool1045 = true;
				((Class79) this).aList1068.remove(0);
				method1190(class572_sub15);
			}
			method1220();
		}
	}

	public RSByteBuffer method200(int i) {
		RSByteBuffer class572_sub15 = method1205(i);
		return class572_sub15;
	}

	synchronized void method1233() {
		int i = (((Class79) this).aClass572_Sub15_1042 != null ? ((Class79) this).aClass572_Sub15_1042.o * -1585139053 : 0);
		int i_193_ = 0;
		Iterator iterator = ((Class79) this).aList1017.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class572_sub15 = (RSByteBuffer) iterator.next();
			i_193_ += class572_sub15.o * -1585139053;
		}
		if (((Class79) this).aClass572_Sub15_1042 != null) {
			if ((((Class79) this).aClass572_Sub15_1042.b.length - (((Class79) this).aClass572_Sub15_1042.o * -1585139053)) < i_193_) {
				RSByteBuffer class572_sub15 = method1206(i_193_ + ((Class79) this).anInt1043);
				class572_sub15.writeBytes(((Class79) this).aClass572_Sub15_1042.b, (((Class79) this).aClass572_Sub15_1042.o * -1585139053) - ((Class79) this).anInt1044, ((Class79) this).anInt1043, (byte) -87);
				((Class79) this).aClass572_Sub15_1042.method8449((byte) 82);
				((Class79) this).aClass572_Sub15_1042 = class572_sub15;
				i = ((Class79) this).anInt1044;
			}
		} else {
			((Class79) this).aClass572_Sub15_1042 = method1206(i_193_);
			((Class79) this).anInt1043 = 0;
			i = 0;
		}
		iterator = ((Class79) this).aList1017.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class572_sub15 = (RSByteBuffer) iterator.next();
			((Class79) this).aClass572_Sub15_1042.writeBytes(class572_sub15.b, 0, class572_sub15.o * -1585139053, (byte) 97);
			((Class79) this).anInt1043 += class572_sub15.o * -1585139053;
			class572_sub15.method8449((byte) 52);
		}
		((Class79) this).aClass572_Sub15_1042.o = (i - ((Class79) this).anInt1044) * 310393755;
		((Class79) this).anInt1044 = 0;
		((Class79) this).aList1017.clear();
		while (((Class79) this).aBool1045 && ((((Class79) this).aClass572_Sub15_1042.o * -1585139053) < (((Class79) this).aClass572_Sub15_1042.b).length)) {
			if (((Class79) this).aBool1048 && ((float) (((Class79) this).anInt1023 / method1208()) > ((Class79) this).aFloat1018))
				break;
			if (((Class79) this).aClass572_Sub15_1042 == null || ((Class79) this).anInt1043 < 27) {
				if (((Class79) this).aClass572_Sub15_1042 != null) {
					((Class79) this).anInt1044 = ((Class79) this).anInt1043;
					((Class79) this).aClass572_Sub15_1042.o += ((Class79) this).anInt1043 * 310393755;
				}
				((Class79) this).aBool1045 = false;
				break;
			}
			int i_194_ = (((Class79) this).aClass572_Sub15_1042.o * -1585139053);
			int i_195_ = 0;
			int i_196_ = 0;
			if (!method1192(((Class79) this).aClass572_Sub15_1042))
				break;
			((Class79) this).anInt1024++;
			if (((Class79) this).anInt1055 < 0)
				((Class79) this).anInt1035++;
			((Class79) this).aList1054.clear();
			((Class79) this).aList1060.clear();
			((Class79) this).aClass572_Sub15_1042.readUnsignedByte(133798602);
			int i_197_ = ((Class79) this).aClass572_Sub15_1042.readUnsignedByte(1449155505);
			int i_198_ = ((((Class79) this).aClass572_Sub15_1042.readUnsignedByte(235360921) & 0xff) | (((Class79) this).aClass572_Sub15_1042.readUnsignedByte(598959998) & 0xff) << 8 | (((Class79) this).aClass572_Sub15_1042.readUnsignedByte(-37060876) & 0xff) << 16 | ((Class79) this).aClass572_Sub15_1042.readUnsignedByte(616269919) << 24);
			i_195_ = i_198_ - i_195_;
			((Class79) this).aClass572_Sub15_1042.o += 671332784;
			int i_199_ = ((Class79) this).aClass572_Sub15_1042.readUnsignedByte(794215778);
			int i_200_ = (((Class79) this).aClass572_Sub15_1042.o * -1585139053);
			int i_201_ = i_200_ + i_199_;
			if (i_201_ > i_194_ + ((Class79) this).anInt1043) {
				((Class79) this).aClass572_Sub15_1042.o = (i_194_ + ((Class79) this).anInt1043) * 310393755;
				((Class79) this).anInt1044 = (((Class79) this).aClass572_Sub15_1042.o * -1585139053) - i_194_;
				((Class79) this).aBool1045 = false;
			}
			int i_202_ = i_201_;
			int i_203_ = 0;
			if (((Class79) this).aBool1045) {
				for (int i_204_ = 0; i_204_ < i_199_; i_204_++) {
					int i_205_ = ((((Class79) this).aClass572_Sub15_1042.b[i_200_++]) & 0xff);
					i_201_ += i_205_;
					i_203_ += i_205_;
					if (i_201_ > i_194_ + ((Class79) this).anInt1043) {
						((Class79) this).aClass572_Sub15_1042.o = ((i_194_ + ((Class79) this).anInt1043) * 310393755);
						((Class79) this).anInt1044 = (((Class79) this).aClass572_Sub15_1042.o * -1585139053) - i_194_;
						((Class79) this).aBool1045 = false;
						break;
					}
					if (i_205_ < 255) {
						((Class79) this).aList1054.add(Integer.valueOf(i_202_));
						((Class79) this).aList1060.add(Integer.valueOf(i_203_));
						i_202_ = i_201_;
						i_203_ = 0;
					}
				}
			}
			if (((Class79) this).aBool1045) {
				int i_206_ = i_201_;
				int i_207_ = -1;
				Iterator iterator_208_ = ((Class79) this).aList1054.iterator();
				Iterator iterator_209_ = ((Class79) this).aList1060.iterator();
				boolean bool = false;
				((Class79) this).anInt1063 = 0;
				while (iterator_208_.hasNext()) {
					Integer integer = (Integer) iterator_208_.next();
					Integer integer_210_ = (Integer) iterator_209_.next();
					i_207_++;
					if (method157() && ((Class79) this).aBool1053 == true && (((Class79) this).anInt1024 < ((Class79) this).anInt1035) && i_207_ < ((Class79) this).anInt1055) {
						Class79 class79_211_ = this;
						((Class79) class79_211_).anInt1049 = ((Class79) class79_211_).anInt1049 + (bool ? 0 : i_195_);
						bool = true;
					} else {
						((Class79) this).anAtomicReference1061.set(null);
						boolean bool_212_ = method1186((((Class79) this).aClass572_Sub15_1042.b), integer.intValue(), integer_210_.intValue(), (((Class79) this).anAtomicReference1061));
						Class61[] class61s = ((Class61[]) ((Class79) this).anAtomicReference1061.get());
						if (bool_212_ && (((Class79) this).aBool1053 != true || (((Class79) this).anInt1024 >= ((Class79) this).anInt1035) || i_207_ >= ((Class79) this).anInt1055)) {
							if (class61s != null) {
								int i_213_ = ((Class61) class61s[0]).anInt542;
								((Class79) this).anInt1062 += i_213_;
								if (((Class79) this).anInt1062 > i_198_ && i_197_ == 4) {
									((Class79) this).anInt1063 = (((Class79) this).anInt1062 - i_198_ - ((Class79) this).anInt1063);
									i_213_ -= ((Class79) this).anInt1063;
									if (((Class79) this).anInt1063 > ((Class61) class61s[0]).anInt542)
										((Class79) this).anInt1063 = ((Class61) class61s[0]).anInt542;
									if (i_213_ < 0)
										i_213_ = 0;
								}
								int i_214_ = 0;
								int i_215_ = method163(i_213_) * class61s.length;
								if (((Class79) this).aBool1053 == true && (((Class79) this).anInt1049 < ((Class79) this).anInt1016)) {
									int i_216_ = i_215_;
									i_215_ -= method163(((Class79) this).anInt1016 - (((Class79) this).anInt1049));
									if (i_215_ <= 0) {
										((Class79) this).anInt1049 += method196(i_216_);
										method1223(class61s);
										Object object = null;
										continue;
									}
									i_214_ += (((Class79) this).anInt1016 - ((Class79) this).anInt1049);
								}
								if ((((Class79) this).anInt1049 + i_213_ > ((Class79) this).anInt1065) && ((((Class79) this).anInt1059 < ((Class79) this).anInt1057) || ((Class79) this).anInt1057 < 0) && ((Class79) this).aBool1038) {
									i_215_ -= method163(((Class79) this).anInt1049 + i_213_ - (((Class79) this).anInt1065) - 1);
									if (i_215_ <= 0) {
										method1223(class61s);
										Object object = null;
										continue;
									}
								}
								int i_217_ = method159();
								if (method1184() < method159()) {
									int i_218_ = method159() - method1184();
									i_215_ += i_215_ / method1184() * i_218_;
								}
								RSByteBuffer class572_sub15 = method1206(i_215_);
								for (int i_219_ = i_214_; i_219_ < i_213_; i_219_++) {
									boolean bool_220_ = ((Class79) this).aBool1053;
									if (((Class79) this).anInt1057 != 0) {
										if (((Class79) this).anInt1049 == ((Class79) this).anInt1016) {
											if (((Class79) this).anInt1050 < 0) {
												((Class79) this).anInt1050 = (((Class79) this).anInt1052);
												((Class79) this).anInt1055 = i_207_;
											}
											((Class79) this).aBool1053 = false;
										}
										if ((((Class79) this).anInt1049 == ((Class79) this).anInt1065) && ((Class79) this).anInt1040 < 0)
											((Class79) this).anInt1040 = ((Class79) this).anInt1052;
										if ((((Class79) this).anInt1049 > ((Class79) this).anInt1065) && ((((Class79) this).anInt1059 < ((Class79) this).anInt1057) || (((Class79) this).anInt1057 < 0)) && ((Class79) this).aBool1038)
											bool_220_ = true;
									}
									if (bool_220_ && ((((Class79) this).anInt1049 < ((Class79) this).anInt1016) || (((Class79) this).anInt1049 > (((Class79) this).anInt1065)))) {
										((Class79) this).anInt1049++;
										if (++i_196_ > i_195_)
											throw new RuntimeException();
									} else {
										for (int i_221_ = 0; i_221_ < i_217_; i_221_++) {
											float f;
											if (i_221_ < class61s.length)
												f = (((Class61) class61s[i_221_]).aFloatArray541[i_219_]);
											else
												f = (((Class61) (class61s[(i_221_ % method1184())])).aFloatArray541[i_219_]);
											if (((Class79) this).aClass297_1058 == Class297.aClass297_3470) {
												int i_222_ = method1209(f);
												if ((((Class79) this).aClass298_1014) == Class298.aClass298_3478)
													class572_sub15.method8453(i_222_, 1070695538);
												else
													class572_sub15.writeShort(i_222_, -1815872273);
											} else if ((((Class79) this).aClass297_1058) == (Class297.aClass297_3471)) {
												int i_223_ = method1182(f);
												if ((((Class79) this).aClass298_1014) == Class298.aClass298_3478)
													class572_sub15.method8453(i_223_, 1406634299);
												else
													class572_sub15.writeShort(i_223_, -1628376505);
											} else if ((((Class79) this).aClass297_1058) == (Class297.aClass297_3469)) {
												int i_224_ = method1181(f);
												class572_sub15.writeByte(i_224_, -1384395473);
											} else if ((((Class79) this).aClass297_1058) == (Class297.aClass297_3468)) {
												int i_225_ = method1204(f);
												class572_sub15.writeByte(i_225_, -1384395473);
											}
										}
										((Class79) this).anInt1049++;
										i_196_++;
									}
								}
								synchronized (((Class79) this).aList1011) {
									((Class79) this).anInt1023 += (method196(class572_sub15.o * -1585139053) / method159());
									((Class79) this).aList1011.add(class572_sub15);
								}
							}
						} else if (method157()) {
							((Class79) this).anInt1028 = 0;
							if (((Class79) this).aClass61Array1027 == null || (((Class79) this).aClass61Array1027 != null && (((((Class79) this).aClass61Array1027).length != ((Class79) this).anInt1006) || (((Class61) (((Class79) this).aClass61Array1027[0])).anInt542 != ((Class79) this).anInt1019)))) {
								if (((Class79) this).aClass61Array1027 != null)
									method1223(((Class79) this).aClass61Array1027);
								((Class79) this).aClass61Array1027 = method1234(((Class79) this).anInt1006, ((Class79) this).anInt1019);
							}
						}
						method1223(class61s);
						Object object = null;
					}
				}
				((Class79) this).aClass572_Sub15_1042.o = i_206_ * 310393755;
				((Class79) this).anInt1043 -= i_206_ - i_194_;
			}
		}
	}

	public Class297 method175() {
		return ((Class79) this).aClass297_1058;
	}

	public synchronized boolean method184() {
		return ((Class79) this).aBool1048;
	}

	Class61[] method1234(int i, int i_226_) {
		Class61[] class61s = new Class61[i];
		for (int i_227_ = 0; i_227_ < class61s.length; i_227_++)
			class61s[i_227_] = method1187(i_226_);
		return class61s;
	}

	public void method195(boolean bool, int i, int i_228_, int i_229_) {
		((Class79) this).aBool1038 = bool;
		((Class79) this).anInt1057 = i;
		((Class79) this).anInt1016 = i_228_;
		((Class79) this).anInt1065 = i_229_;
	}

	synchronized void method1235(boolean bool) {
		if (!bool) {
			((Class79) this).anInt1072 = 0;
			((Class79) this).anInt1019 = 0;
			((Class79) this).aBoolArray1025 = null;
			((Class79) this).anIntArray1026 = null;
			method1223(((Class79) this).aClass61Array1064);
			((Class79) this).aClass61Array1064 = null;
			method1223(((Class79) this).aClass61Array1027);
			((Class79) this).aClass61Array1027 = null;
			((Class79) this).anInt1028 = 0;
			((Class79) this).anInt1029 = 0;
			((Class79) this).aBoolArray1030 = null;
			method1223(((Class79) this).aClass61Array1031);
			((Class79) this).aClass61Array1031 = null;
			method1188(((Class79) this).aClass61_1032);
			method1188(((Class79) this).aClass61_1056);
			method1188(((Class79) this).aClass61_1034);
			method1188(((Class79) this).aClass61_1036);
			method1188(((Class79) this).aClass61_1008);
			method1188(((Class79) this).aClass61_1037);
			((Class79) this).aClass61_1032 = null;
			((Class79) this).aClass61_1056 = null;
			((Class79) this).aClass61_1034 = null;
			((Class79) this).aClass61_1036 = null;
			((Class79) this).aClass61_1008 = null;
			((Class79) this).aClass61_1037 = null;
			((Class79) this).anIntArray1020 = null;
			((Class79) this).anIntArray1039 = null;
		}
		((Class79) this).anInt1062 = 0;
		Iterator iterator = ((Class79) this).aList1017.iterator();
		while (iterator.hasNext()) {
			RSByteBuffer class572_sub15 = (RSByteBuffer) iterator.next();
			class572_sub15.method8449((byte) 112);
		}
		((Class79) this).aList1017.clear();
		((Class79) this).aBool1045 = false;
		if (((Class79) this).aClass572_Sub15_1042 != null) {
			synchronized (((Class79) this).aClass572_Sub15_1042) {
				((Class79) this).aClass572_Sub15_1042.method8449((byte) 122);
				((Class79) this).aClass572_Sub15_1042 = null;
			}
		}
		((Class79) this).anInt1043 = 0;
		((Class79) this).anInt1044 = 0;
		if (!bool) {
			synchronized (((Class79) this).aList1011) {
				Iterator iterator_230_ = ((Class79) this).aList1011.iterator();
				while (iterator_230_.hasNext()) {
					RSByteBuffer class572_sub15 = (RSByteBuffer) iterator_230_.next();
					class572_sub15.method8449((byte) 52);
				}
				((Class79) this).aList1011.clear();
			}
			((Class79) this).anInt1023 = 0;
		}
		synchronized (((Class79) this).aList1068) {
			Iterator iterator_231_ = ((Class79) this).aList1068.iterator();
			while (iterator_231_.hasNext()) {
				RSByteBuffer class572_sub15 = (RSByteBuffer) iterator_231_.next();
				class572_sub15.method8449((byte) 105);
			}
			((Class79) this).aList1068.clear();
		}
		((Class79) this).aBool1046 = false;
		((Class79) this).anInt1049 = 0;
		((Class79) this).anInt1052 = -1;
		((Class79) this).anInt1024 = -1;
		if (!bool) {
			method1185(false);
			((Class79) this).aBool1047 = false;
			((Class79) this).anInt1016 = -1;
			((Class79) this).anInt1065 = -1;
			((Class79) this).anInt1057 = 0;
			((Class79) this).anInt1059 = 0;
			((Class79) this).anInt1050 = -1;
			((Class79) this).anInt1040 = -1;
			((Class79) this).anInt1035 = -1;
			((Class79) this).anInt1055 = -1;
			((Class79) this).aBool1053 = false;
			((Class79) this).aBool1038 = false;
		} else {
			((Class79) this).anInt1059++;
			((Class79) this).aBool1053 = true;
		}
	}

	public void method154(boolean bool, int i, int i_232_, int i_233_) {
		((Class79) this).aBool1038 = bool;
		((Class79) this).anInt1057 = i;
		((Class79) this).anInt1016 = i_232_;
		((Class79) this).anInt1065 = i_233_;
	}

	public RSByteBuffer method185(int i) {
		RSByteBuffer class572_sub15 = method1205(i);
		return class572_sub15;
	}

	public RSByteBuffer method199(int i) {
		RSByteBuffer class572_sub15 = method1205(i);
		return class572_sub15;
	}

	public int method191(int i) {
		return i * (method198().anInt3472 * -1700527127 / 8);
	}
}

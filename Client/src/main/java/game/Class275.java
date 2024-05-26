package game;

/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.util.Random;

public class Class275 {
	static Class276 aClass276_2912 = new Class276(16, Class625.aClass625_8083);
	public static int anInt2913;
	static final int anInt2914 = 12;
	public static int[] anIntArray2915;
	public static int[] anIntArray2916;
	static int anInt2917;
	static File aFile2918;
	static int anInt2919;

	public static void method3695(int i, int i_0_) {
		if (i != 37782955 * anInt2913) {
			anIntArray2915 = new int[i];
			for (int i_1_ = 0; i_1_ < i; i_1_++)
				anIntArray2915[i_1_] = (i_1_ << 12) / i;
			anInt2913 = i * -1256305405;
		}
		if (i_0_ != anInt2917 * 1668117605) {
			if (i_0_ != 37782955 * anInt2913) {
				anIntArray2916 = new int[i_0_];
				for (int i_2_ = 0; i_2_ < i_0_; i_2_++)
					anIntArray2916[i_2_] = (i_2_ << 12) / i_0_;
			} else
				anIntArray2916 = anIntArray2915;
			anInt2917 = i_0_ * 687742317;
		}
	}

	public static void method3696(int i, int i_3_, int i_4_) {
		if (i != 37782955 * anInt2913) {
			anIntArray2915 = new int[i];
			for (int i_5_ = 0; i_5_ < i; i_5_++)
				anIntArray2915[i_5_] = (i_5_ << 12) / i;
			anInt2913 = i * -1256305405;
		}
		if (i_3_ != anInt2917 * 1668117605) {
			if (i_3_ != 37782955 * anInt2913) {
				anIntArray2916 = new int[i_3_];
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
					anIntArray2916[i_6_] = (i_6_ << 12) / i_3_;
			} else
				anIntArray2916 = anIntArray2915;
			anInt2917 = i_3_ * 687742317;
		}
	}

	public static byte[] method3697(int i, int i_7_) {
		byte[] is = (byte[]) aClass276_2912.method3707(Integer.valueOf(i), 1607787632);
		if (null == is) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_8_ = 0; i_8_ < 255; i_8_++)
				is[i_8_] = (byte) i_8_;
			for (int i_9_ = 0; i_9_ < 255; i_9_++) {
				int i_10_ = 255 - i_9_;
				int i_11_ = Class628.method7503(random, i_10_, 716586645);
				byte i_12_ = is[i_11_];
				is[i_11_] = is[i_10_];
				is[i_10_] = is[511 - i_9_] = i_12_;
			}
			aClass276_2912.method3705(Integer.valueOf(i), is, 1421284508);
		}
		return is;
	}

	public static void method3698(int i, int i_13_) {
		if (i != 37782955 * anInt2913) {
			anIntArray2915 = new int[i];
			for (int i_14_ = 0; i_14_ < i; i_14_++)
				anIntArray2915[i_14_] = (i_14_ << 12) / i;
			anInt2913 = i * -1256305405;
		}
		if (i_13_ != anInt2917 * 1668117605) {
			if (i_13_ != 37782955 * anInt2913) {
				anIntArray2916 = new int[i_13_];
				for (int i_15_ = 0; i_15_ < i_13_; i_15_++)
					anIntArray2916[i_15_] = (i_15_ << 12) / i_13_;
			} else
				anIntArray2916 = anIntArray2915;
			anInt2917 = i_13_ * 687742317;
		}
	}

	public static byte[] method3699(int i) {
		byte[] is = ((byte[]) aClass276_2912.method3707(Integer.valueOf(i), 173457155));
		if (null == is) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_16_ = 0; i_16_ < 255; i_16_++)
				is[i_16_] = (byte) i_16_;
			for (int i_17_ = 0; i_17_ < 255; i_17_++) {
				int i_18_ = 255 - i_17_;
				int i_19_ = Class628.method7503(random, i_18_, 1031910188);
				byte i_20_ = is[i_19_];
				is[i_19_] = is[i_18_];
				is[i_18_] = is[511 - i_17_] = i_20_;
			}
			aClass276_2912.method3705(Integer.valueOf(i), is, 878414871);
		}
		return is;
	}

	static final void method3700(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub11_9219, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1) ? 1 : 0, 1908110624);
		client.aClass613_8605.method7302(137705154);
		Class623.method7443(-1509155664);
		client.aBool8854 = false;
	}

	public static byte[] method3701(int i) {
		byte[] is = (byte[]) aClass276_2912.method3707(Integer.valueOf(i), 2022471960);
		if (null == is) {
			is = new byte[512];
			Random random = new Random((long) i);
			for (int i_21_ = 0; i_21_ < 255; i_21_++)
				is[i_21_] = (byte) i_21_;
			for (int i_22_ = 0; i_22_ < 255; i_22_++) {
				int i_23_ = 255 - i_22_;
				int i_24_ = Class628.method7503(random, i_23_, 193077398);
				byte i_25_ = is[i_24_];
				is[i_24_] = is[i_23_];
				is[i_23_] = is[511 - i_22_] = i_25_;
			}
			aClass276_2912.method3705(Integer.valueOf(i), is, 1793247158);
		}
		return is;
	}

	static void method3702(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1]), 309667070))).method4666(Class133_Sub23.playerVarsProvider, -1499644922) ? 1 : 0);
	}

	Class275() throws Throwable {
		throw new Error();
	}

	static final void method3703(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class213.method3072(class73, class83, class441, 133341203);
	}
}

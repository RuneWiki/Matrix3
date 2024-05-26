package game;

/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class186 {
	int anInt2173;
	float[] aFloatArray2174;
	static final float aFloat2175 = 255.0F;
	int[] anIntArray2176;
	float aFloat2177 = 0.85F;
	int[] anIntArray2178;
	float[] aFloatArray2179;
	float aFloat2180;
	float aFloat2181 = 1.0F - ((Class186) this).aFloat2177;
	int anInt2182;
	int anInt2183;
	boolean aBoolean207;
	Class250 aClass250_2185;
	Class261 aClass261_2186;
	Class143 aClass143_2187;
	Class106_Sub2 aClass106_Sub2_2188;
	Class250 aClass250_2189;
	Class250 aClass250_2190;
	int anInt2191 = 0;
	float[] aFloatArray2192;
	int[] anIntArray2193;
	float[] aFloatArray2194;
	int[] anIntArray2195;
	float aFloat2196;
	int[] anIntArray2197;
	int[] anIntArray2198;
	Runnable aRunnable2199;
	int[] anIntArray2200;
	boolean aBool2201;
	float aFloat2202;
	float[] aFloatArray2203;
	float aFloat2204;
	float aFloat2205;
	Class261 aClass261_2206;
	float aFloat2207;
	float aFloat2208;
	int anInt2209;
	float[] aFloatArray2210;
	Class89_Sub2[] aClass89_Sub2Array2211;
	Class89_Sub2[] aClass89_Sub2Array2212;
	float[] aFloatArray2213;
	float[] aFloatArray2214;
	float[] aFloatArray2215;
	float[] aFloatArray2216;
	float[] aFloatArray2217;
	boolean aBool2218;

	void method2845(int i) {
		((Class186) this).aClass143_2187 = new Class143(((Class186) this).aClass106_Sub2_2188, this);
	}

	void method2846() {
		((Class186) this).aClass143_2187 = new Class143(((Class186) this).aClass106_Sub2_2188, this);
	}

	void method2847() {
		((Class186) this).aClass143_2187 = new Class143(((Class186) this).aClass106_Sub2_2188, this);
	}

	void method2848(Runnable runnable, byte i) {
		((Class186) this).aRunnable2199 = runnable;
	}

	Class186(Class106_Sub2 class106_sub2) {
		((Class186) this).anInt2183 = 0;
		((Class186) this).aBool2201 = false;
		((Class186) this).anInt2182 = 0;
		((Class186) this).anInt2173 = 0;
		((Class186) this).aBoolean207 = true;
		((Class186) this).aClass250_2185 = new Class250();
		((Class186) this).aClass261_2186 = new Class261();
		((Class186) this).aClass261_2206 = new Class261();
		((Class186) this).aClass250_2189 = new Class250();
		((Class186) this).aClass250_2190 = new Class250();
		((Class186) this).anIntArray2178 = new int[Class89_Sub2.anInt10629];
		((Class186) this).aFloatArray2192 = new float[Class89_Sub2.anInt10629];
		((Class186) this).aFloatArray2179 = new float[Class89_Sub2.anInt10629];
		((Class186) this).aFloatArray2194 = new float[Class89_Sub2.anInt10629];
		((Class186) this).aFloatArray2203 = new float[Class89_Sub2.anInt10629];
		((Class186) this).anIntArray2195 = new int[8];
		((Class186) this).anIntArray2197 = new int[8];
		((Class186) this).anIntArray2198 = new int[8];
		((Class186) this).anIntArray2176 = new int[10000];
		((Class186) this).anIntArray2200 = new int[10000];
		((Class186) this).aFloat2180 = 1.0F;
		((Class186) this).aFloat2207 = 0.0F;
		((Class186) this).aFloat2208 = 1.0F;
		((Class186) this).aFloatArray2210 = new float[2];
		((Class186) this).aClass89_Sub2Array2211 = new Class89_Sub2[8];
		((Class186) this).aClass89_Sub2Array2212 = new Class89_Sub2[8];
		((Class186) this).aFloatArray2213 = new float[64];
		((Class186) this).aFloatArray2214 = new float[64];
		((Class186) this).aFloatArray2215 = new float[64];
		((Class186) this).aFloatArray2216 = new float[64];
		((Class186) this).aFloatArray2217 = new float[64];
		((Class186) this).aFloatArray2174 = new float[3];
		((Class186) this).aClass106_Sub2_2188 = class106_sub2;
		((Class186) this).aClass143_2187 = new Class143(class106_sub2, this);
		for (int i = 0; i < 8; i++) {
			((Class186) this).aClass89_Sub2Array2211[i] = new Class89_Sub2(((Class186) this).aClass106_Sub2_2188);
			((Class186) this).aClass89_Sub2Array2212[i] = new Class89_Sub2(((Class186) this).aClass106_Sub2_2188);
		}
		((Class186) this).anIntArray2193 = new int[Class89_Sub2.anInt10555];
		for (int i = 0; i < Class89_Sub2.anInt10555; i++)
			((Class186) this).anIntArray2193[i] = -1;
	}

	static final void method2849(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1665128073 * class73.activeComponent;
	}

	public static Class214 method2850(int i, byte i_0_) {
		Class214[] class214s = Class306.method4015((byte) 27);
		Class214[] class214s_1_ = class214s;
		for (int i_2_ = 0; i_2_ < class214s_1_.length; i_2_++) {
			Class214 class214 = class214s_1_[i_2_];
			if (i == ((Class214) class214).anInt2496 * -28420077)
				return class214;
		}
		return null;
	}
}

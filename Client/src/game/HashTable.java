package game;

/* Class466 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class HashTable {
	int anInt5237;
	int anInt5238;
	float aFloat5239;
	float aFloat5240;
	Class240 aClass240_5241;
	int anInt5242;
	int anInt5243;
	float aFloat5244;
	float aFloat5245;
	float aFloat5246;
	int anInt5247;
	float aFloat5248;
	int anInt5249;
	int anInt5250;
	int anInt5251;
	int anInt5252;
	int[] anIntArray5253 = new int[3];
	float[] aFloatArray5254 = new float[3];
	int anInt5255;
	public static Class248 aClass248_5256;

	void method5494(int i) {
		((HashTable) this).anInt5238 = -710576835;
		((HashTable) this).aFloat5240 = -1.0F;
		((HashTable) this).aFloat5246 = -1.0F;
		((HashTable) this).aFloat5248 = -1.0F;
		((HashTable) this).aClass240_5241 = null;
		((HashTable) this).anInt5242 = -1661042583;
		((HashTable) this).anInt5243 = -1982880643;
		((HashTable) this).aFloat5244 = -1.0F;
		((HashTable) this).aFloat5245 = -1.0F;
		((HashTable) this).aFloat5239 = -1.0F;
		((HashTable) this).anInt5247 = -1110961139;
		((HashTable) this).anInt5255 = -1856055661;
		((HashTable) this).anInt5249 = 1284819661;
		((HashTable) this).anInt5250 = -559714695;
		((HashTable) this).anInt5251 = -300045983;
		((HashTable) this).anInt5237 = 1452671925;
		for (int i_0_ = 0; i_0_ < ((HashTable) this).anIntArray5253.length; i_0_++) {
			((HashTable) this).anIntArray5253[i_0_] = -1;
			((HashTable) this).aFloatArray5254[i_0_] = 0.0F;
		}
		((HashTable) this).anInt5252 = 1787090376;
	}

	public boolean method5495(RSByteBuffer class572_sub15, int i) {
		int i_1_ = class572_sub15.readUnsignedShort(647518597);
		if (i_1_ == 0) {
			((HashTable) this).anInt5252 = class572_sub15.readUnsignedShort(647518597) * -1271811895;
			return false;
		}
		if (0 != (i_1_ & 204911777 * Class462.aClass462_5224.anInt5232))
			((HashTable) this).anInt5238 = class572_sub15.readInt(-154773282) * 710576835;
		if (0 != (i_1_ & Class462.aClass462_5218.anInt5232 * 204911777))
			((HashTable) this).aFloat5240 = class572_sub15.method8448((byte) 2);
		if ((i_1_ & 204911777 * Class462.aClass462_5225.anInt5232) != 0)
			((HashTable) this).aFloat5246 = class572_sub15.method8448((byte) 2);
		if ((i_1_ & Class462.aClass462_5231.anInt5232 * 204911777) != 0)
			((HashTable) this).aFloat5248 = class572_sub15.method8448((byte) 2);
		if (0 != (i_1_ & Class462.aClass462_5221.anInt5232 * 204911777))
			((HashTable) this).aClass240_5241 = Class240.method3264(class572_sub15);
		if (0 != (i_1_ & 204911777 * Class462.aClass462_5222.anInt5232))
			((HashTable) this).anInt5242 = class572_sub15.readInt(-394682843) * 1661042583;
		if (0 != (i_1_ & Class462.aClass462_5223.anInt5232 * 204911777))
			((HashTable) this).anInt5243 = class572_sub15.readUnsignedShort(647518597) * 1982880643;
		if (0 != (i_1_ & Class462.aClass462_5219.anInt5232 * 204911777))
			((HashTable) this).anInt5247 = class572_sub15.readUnsignedShort(647518597) * 1110961139;
		if (0 != (i_1_ & 204911777 * Class462.aClass462_5217.anInt5232))
			((HashTable) this).aFloat5244 = class572_sub15.method8448((byte) 2);
		if ((i_1_ & 204911777 * Class462.aClass462_5226.anInt5232) != 0)
			((HashTable) this).aFloat5245 = class572_sub15.method8448((byte) 2);
		if ((i_1_ & Class462.aClass462_5227.anInt5232 * 204911777) != 0)
			((HashTable) this).aFloat5239 = class572_sub15.method8448((byte) 2);
		if ((i_1_ & 204911777 * Class462.aClass462_5228.anInt5232) != 0) {
			((HashTable) this).anInt5255 = class572_sub15.readUnsignedShort(647518597) * 1856055661;
			((HashTable) this).anInt5249 = class572_sub15.readShort(-710976385) * -1284819661;
			((HashTable) this).anInt5250 = class572_sub15.readShort(-710976385) * 559714695;
			((HashTable) this).anInt5251 = class572_sub15.readShort(-710976385) * 300045983;
			((HashTable) this).anInt5237 = class572_sub15.readUnsignedShort(647518597) * -1452671925;
		}
		if ((i_1_ & 204911777 * Class462.aClass462_5229.anInt5232) != 0) {
			((HashTable) this).anIntArray5253[0] = class572_sub15.readUnsignedShort(647518597);
			((HashTable) this).aFloatArray5254[0] = class572_sub15.method8448((byte) 2);
		}
		if ((i_1_ & 204911777 * Class462.aClass462_5230.anInt5232) != 0) {
			((HashTable) this).anIntArray5253[1] = class572_sub15.readUnsignedShort(647518597);
			((HashTable) this).aFloatArray5254[1] = class572_sub15.method8448((byte) 2);
		}
		if ((i_1_ & Class462.aClass462_5220.anInt5232 * 204911777) != 0) {
			((HashTable) this).anIntArray5253[2] = class572_sub15.readUnsignedShort(647518597);
			((HashTable) this).aFloatArray5254[2] = class572_sub15.method8448((byte) 2);
		}
		((HashTable) this).anInt5252 = class572_sub15.readUnsignedShort(647518597) * -1271811895;
		return true;
	}

	public float method5496() {
		return ((HashTable) this).aFloat5245;
	}

	public float method5497(byte i) {
		return ((HashTable) this).aFloat5240;
	}

	public int method5498(byte i) {
		return ((HashTable) this).anInt5243 * 1772489515;
	}

	public float method5499(int i) {
		return ((HashTable) this).aFloat5248;
	}

	public Class240 method5500(int i) {
		return ((HashTable) this).aClass240_5241;
	}

	public float method5501() {
		return ((HashTable) this).aFloat5246;
	}

	public float method5502() {
		return ((HashTable) this).aFloat5244;
	}

	public float method5503(byte i) {
		return ((HashTable) this).aFloat5244;
	}

	public int method5504(int i) {
		return 2065231911 * ((HashTable) this).anInt5242;
	}

	public int method5505(int i) {
		return ((HashTable) this).anInt5247 * -720132805;
	}

	public HashTable() {
		method5494(-1914355449);
	}

	public int method5506() {
		return -1869361669 * ((HashTable) this).anInt5249;
	}

	public int method5507(byte i) {
		return -1867037345 * ((HashTable) this).anInt5251;
	}

	public int method5508(int i) {
		return -1391006365 * ((HashTable) this).anInt5237;
	}

	public int method5509(int i, byte i_2_) {
		return ((HashTable) this).anIntArray5253[i];
	}

	public float method5510(int i, int i_3_) {
		return ((HashTable) this).aFloatArray5254[i];
	}

	public int method5511(int i) {
		return -998676103 * ((HashTable) this).anInt5252;
	}

	void method5512() {
		((HashTable) this).anInt5238 = -710576835;
		((HashTable) this).aFloat5240 = -1.0F;
		((HashTable) this).aFloat5246 = -1.0F;
		((HashTable) this).aFloat5248 = -1.0F;
		((HashTable) this).aClass240_5241 = null;
		((HashTable) this).anInt5242 = -1661042583;
		((HashTable) this).anInt5243 = -1982880643;
		((HashTable) this).aFloat5244 = -1.0F;
		((HashTable) this).aFloat5245 = -1.0F;
		((HashTable) this).aFloat5239 = -1.0F;
		((HashTable) this).anInt5247 = -1110961139;
		((HashTable) this).anInt5255 = -1856055661;
		((HashTable) this).anInt5249 = 1284819661;
		((HashTable) this).anInt5250 = -559714695;
		((HashTable) this).anInt5251 = -300045983;
		((HashTable) this).anInt5237 = 1452671925;
		for (int i = 0; i < ((HashTable) this).anIntArray5253.length; i++) {
			((HashTable) this).anIntArray5253[i] = -1;
			((HashTable) this).aFloatArray5254[i] = 0.0F;
		}
		((HashTable) this).anInt5252 = 1787090376;
	}

	void method5513() {
		((HashTable) this).anInt5238 = -710576835;
		((HashTable) this).aFloat5240 = -1.0F;
		((HashTable) this).aFloat5246 = -1.0F;
		((HashTable) this).aFloat5248 = -1.0F;
		((HashTable) this).aClass240_5241 = null;
		((HashTable) this).anInt5242 = -1661042583;
		((HashTable) this).anInt5243 = -1982880643;
		((HashTable) this).aFloat5244 = -1.0F;
		((HashTable) this).aFloat5245 = -1.0F;
		((HashTable) this).aFloat5239 = -1.0F;
		((HashTable) this).anInt5247 = -1110961139;
		((HashTable) this).anInt5255 = -1856055661;
		((HashTable) this).anInt5249 = 1284819661;
		((HashTable) this).anInt5250 = -559714695;
		((HashTable) this).anInt5251 = -300045983;
		((HashTable) this).anInt5237 = 1452671925;
		for (int i = 0; i < ((HashTable) this).anIntArray5253.length; i++) {
			((HashTable) this).anIntArray5253[i] = -1;
			((HashTable) this).aFloatArray5254[i] = 0.0F;
		}
		((HashTable) this).anInt5252 = 1787090376;
	}

	public int method5514() {
		return ((HashTable) this).anInt5243 * 1772489515;
	}

	public float method5515(byte i) {
		return ((HashTable) this).aFloat5246;
	}

	public float method5516() {
		return ((HashTable) this).aFloat5246;
	}

	public int method5517(byte i) {
		return ((HashTable) this).anInt5250 * -1835244489;
	}

	public float method5518(int i) {
		return ((HashTable) this).aFloat5239;
	}

	public int method5519(int i) {
		return -883668891 * ((HashTable) this).anInt5255;
	}

	public int method5520() {
		return ((HashTable) this).anInt5238 * 1244853739;
	}

	public float method5521() {
		return ((HashTable) this).aFloat5245;
	}

	public int method5522(int i) {
		return -1869361669 * ((HashTable) this).anInt5249;
	}

	public float method5523() {
		return ((HashTable) this).aFloat5239;
	}

	public int method5524() {
		return -883668891 * ((HashTable) this).anInt5255;
	}

	public int method5525() {
		return -883668891 * ((HashTable) this).anInt5255;
	}

	public int method5526() {
		return -883668891 * ((HashTable) this).anInt5255;
	}

	public int method5527() {
		return -1869361669 * ((HashTable) this).anInt5249;
	}

	public int method5528() {
		return -1869361669 * ((HashTable) this).anInt5249;
	}

	public int method5529() {
		return ((HashTable) this).anInt5250 * -1835244489;
	}

	public int method5530() {
		return ((HashTable) this).anInt5250 * -1835244489;
	}

	public int method5531() {
		return -1867037345 * ((HashTable) this).anInt5251;
	}

	public int method5532() {
		return -1391006365 * ((HashTable) this).anInt5237;
	}

	public int method5533() {
		return -1391006365 * ((HashTable) this).anInt5237;
	}

	public int method5534() {
		return -1391006365 * ((HashTable) this).anInt5237;
	}

	public int method5535(int i) {
		return ((HashTable) this).anIntArray5253[i];
	}

	public int method5536(int i) {
		return ((HashTable) this).anInt5238 * 1244853739;
	}

	public float method5537(int i) {
		return ((HashTable) this).aFloat5245;
	}

	public int method5538() {
		return -998676103 * ((HashTable) this).anInt5252;
	}

	public static int nextPowerOfTwo(int i, int i_4_) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	static final void method5540(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class133_Sub1.aClass411_Sub1_9827.method4989(-558537207).anInt4781) * 1262034027;
	}

	static final void method5541(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.aBool779 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1;
		Class555.method6575(class73, (short) 6956);
	}
}

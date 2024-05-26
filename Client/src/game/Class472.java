package game;

/* Class472 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class472 {
	float aFloat5291;
	float aFloat5292;
	float aFloat5293;
	float aFloat5294;
	Class240 aClass240_5295;
	int anInt5296;
	float aFloat5297;
	Class103 aClass103_5298;
	float aFloat5299;
	float aFloat5300;
	float aFloat5301;
	int anInt5302;
	int[] anIntArray5303;
	float[] aFloatArray5304;
	int anInt5305;
	float aFloat5306;
	float aFloat5307;
	float aFloat5308 = 1.0F;
	Class580 aClass580_5309;
	public static Class202_Sub1_Sub1 aClass202_Sub1_Sub1_5310;

	public Class472(RSByteBuffer class572_sub15, Class501 class501) {
		((Class472) this).aFloat5297 = 0.0F;
		((Class472) this).aFloat5291 = 1.0F;
		((Class472) this).aFloat5306 = 0.0F;
		((Class472) this).aFloat5307 = 1.0F;
		((Class472) this).anIntArray5303 = new int[] { -1, -1, -1 };
		((Class472) this).aFloatArray5304 = new float[] { 0.0F, 0.0F, 0.0F };
		method5569(class572_sub15, class501, (short) 14620);
	}

	void method5566(int i) {
		((Class472) this).anInt5302 = 764573063;
		((Class472) this).aClass240_5295 = Class240.method3316(-50.0F, -60.0F, -50.0F);
		((Class472) this).aFloat5292 = 1.1523438F;
		((Class472) this).aFloat5293 = 0.69921875F;
		((Class472) this).aFloat5294 = 1.2F;
		((Class472) this).anInt5296 = -1609759976;
		((Class472) this).anInt5305 = 0;
		((Class472) this).aClass103_5298 = Class392.aClass103_4662;
		((Class472) this).aFloat5299 = 1.0F;
		((Class472) this).aFloat5300 = 0.25F;
		((Class472) this).aFloat5301 = 1.0F;
		((Class472) this).aClass580_5309 = Class501.aClass580_5526;
		((Class472) this).aFloat5308 = 1.0F;
		((Class472) this).aFloat5297 = 0.0F;
		((Class472) this).aFloat5291 = 1.0F;
		((Class472) this).aFloat5306 = 0.0F;
		((Class472) this).aFloat5307 = 1.0F;
		int[] is = ((Class472) this).anIntArray5303;
		int[] is_0_ = ((Class472) this).anIntArray5303;
		((Class472) this).anIntArray5303[2] = -1;
		is_0_[1] = -1;
		is[0] = -1;
		float[] fs = ((Class472) this).aFloatArray5304;
		float[] fs_1_ = ((Class472) this).aFloatArray5304;
		((Class472) this).aFloatArray5304[2] = 0.0F;
		fs_1_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public int method5567() {
		return 1800241959 * ((Class472) this).anInt5296;
	}

	public Class580 method5568(byte i) {
		return ((Class472) this).aClass580_5309;
	}

	public void method5569(RSByteBuffer class572_sub15, Class501 class501, short i) {
		int attributes = class572_sub15.readUnsignedByte(684724252);
		if (Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(282189656) == 1 && Class272_Sub2.aClass106_9517.method1849() > 0) {
			if (0 != (attributes & 204911777 * Class462.aClass462_5224.anInt5232))
				((Class472) this).anInt5302 = class572_sub15.readInt(1275544804) * 1265470073;
			else
				((Class472) this).anInt5302 = 764573063;
			if (0 != (attributes & Class462.aClass462_5218.anInt5232 * 204911777))
				((Class472) this).aFloat5292 = (float) class572_sub15.readUnsignedShort(647518597) / 256.0F;
			else
				((Class472) this).aFloat5292 = 1.1523438F;
			if ((attributes & 204911777 * Class462.aClass462_5225.anInt5232) != 0)
				((Class472) this).aFloat5293 = (float) class572_sub15.readUnsignedShort(647518597) / 256.0F;
			else
				((Class472) this).aFloat5293 = 0.69921875F;
			if (0 != (attributes & 204911777 * Class462.aClass462_5231.anInt5232))
				((Class472) this).aFloat5294 = (float) class572_sub15.readUnsignedShort(647518597) / 256.0F;
			else
				((Class472) this).aFloat5294 = 1.2F;
		} else {
			if (0 != (attributes & Class462.aClass462_5224.anInt5232 * 204911777))
				class572_sub15.readInt(1082196525);
			if ((attributes & 204911777 * Class462.aClass462_5218.anInt5232) != 0)
				class572_sub15.readUnsignedShort(647518597);
			if (0 != (attributes & Class462.aClass462_5225.anInt5232 * 204911777))
				class572_sub15.readUnsignedShort(647518597);
			if (0 != (attributes & 204911777 * Class462.aClass462_5231.anInt5232))
				class572_sub15.readUnsignedShort(647518597);
			((Class472) this).anInt5302 = 764573063;
			((Class472) this).aFloat5294 = 1.2F;
			((Class472) this).aFloat5293 = 0.69921875F;
			((Class472) this).aFloat5292 = 1.1523438F;
		}
		if ((attributes & Class462.aClass462_5221.anInt5232 * 204911777) != 0)
			((Class472) this).aClass240_5295 = Class240.method3316((float) class572_sub15.readShort(-710976385), (float) class572_sub15.readShort(-710976385), (float) class572_sub15.readShort(-710976385));
		else
			((Class472) this).aClass240_5295 = Class240.method3316(-50.0F, -60.0F, -50.0F);
		if ((attributes & Class462.aClass462_5222.anInt5232 * 204911777) != 0)
			((Class472) this).anInt5296 = class572_sub15.readInt(183262392) * -307118953;
		else
			((Class472) this).anInt5296 = -1609759976;
		if ((attributes & Class462.aClass462_5223.anInt5232 * 204911777) != 0)
			((Class472) this).anInt5305 = class572_sub15.readUnsignedShort(647518597) * 1340165539;
		else
			((Class472) this).anInt5305 = 0;
		if (0 != (attributes & Class462.aClass462_5219.anInt5232 * 204911777)) {
			int i_3_ = class572_sub15.readUnsignedShort(647518597);
			((Class472) this).aClass103_5298 = class501.method5960(i_3_, -1114892789);
		} else
			((Class472) this).aClass103_5298 = Class392.aClass103_4662;
	}

	public int method5570() {
		return 1800241959 * ((Class472) this).anInt5296;
	}

	void method5571(RSByteBuffer class572_sub15, int i, int i_4_) {
		((Class472) this).anIntArray5303[i] = class572_sub15.readUnsignedShort(647518597);
		((Class472) this).aFloatArray5304[i] = class572_sub15.method8448((byte) 2);
	}

	public void method5572(RSByteBuffer class572_sub15, Class501 class501, int i) {
		int i_5_ = class572_sub15.readUnsignedShort(647518597);
		int i_6_ = class572_sub15.readShort(-710976385);
		int i_7_ = class572_sub15.readShort(-710976385);
		int i_8_ = class572_sub15.readShort(-710976385);
		int i_9_ = class572_sub15.readUnsignedShort(647518597);
		Class190.anInt2246 = -1208726249 * i_9_;
		((Class472) this).aClass580_5309 = class501.method5961(i_5_, i_6_, i_7_, i_8_, 1219431545);
	}

	public int method5573(byte i) {
		return 1800241959 * ((Class472) this).anInt5296;
	}

	public void method5574(RSByteBuffer class572_sub15, int i) {
		method5571(class572_sub15, 0, 124039435);
	}

	void method5575(Class472 class472_10_, int i) {
		((Class472) this).anInt5302 = 1 * ((Class472) class472_10_).anInt5302;
		((Class472) this).aFloat5292 = ((Class472) class472_10_).aFloat5292;
		((Class472) this).aFloat5293 = ((Class472) class472_10_).aFloat5293;
		((Class472) this).aFloat5294 = ((Class472) class472_10_).aFloat5294;
		((Class472) this).aClass240_5295.method3269(((Class472) class472_10_).aClass240_5295);
		((Class472) this).anInt5296 = ((Class472) class472_10_).anInt5296 * 1;
		((Class472) this).anInt5305 = 1 * ((Class472) class472_10_).anInt5305;
		((Class472) this).aClass103_5298 = ((Class472) class472_10_).aClass103_5298;
		((Class472) this).aFloat5299 = ((Class472) class472_10_).aFloat5299;
		((Class472) this).aFloat5300 = ((Class472) class472_10_).aFloat5300;
		((Class472) this).aFloat5301 = ((Class472) class472_10_).aFloat5301;
		((Class472) this).aClass580_5309 = ((Class472) class472_10_).aClass580_5309;
		((Class472) this).aFloat5308 = ((Class472) class472_10_).aFloat5308;
		((Class472) this).aFloat5297 = ((Class472) class472_10_).aFloat5297;
		((Class472) this).aFloat5291 = ((Class472) class472_10_).aFloat5291;
		((Class472) this).aFloat5306 = ((Class472) class472_10_).aFloat5306;
		((Class472) this).aFloat5307 = ((Class472) class472_10_).aFloat5307;
		((Class472) this).anIntArray5303[0] = ((Class472) class472_10_).anIntArray5303[0];
		((Class472) this).anIntArray5303[1] = ((Class472) class472_10_).anIntArray5303[1];
		((Class472) this).anIntArray5303[2] = ((Class472) class472_10_).anIntArray5303[2];
		((Class472) this).aFloatArray5304[0] = ((Class472) class472_10_).aFloatArray5304[0];
		((Class472) this).aFloatArray5304[1] = ((Class472) class472_10_).aFloatArray5304[1];
		((Class472) this).aFloatArray5304[2] = ((Class472) class472_10_).aFloatArray5304[2];
	}

	void method5576(Class106 class106, Class472 class472_11_, Class472 class472_12_, float f, byte i) {
		((Class472) this).anInt5302 = Class57.method1001((-962674743 * ((Class472) class472_11_).anInt5302), (-962674743 * ((Class472) class472_12_).anInt5302), 255.0F * f, 219777660) * 1265470073;
		((Class472) this).aFloat5293 = (((Class472) class472_11_).aFloat5293 + f * (((Class472) class472_12_).aFloat5293 - ((Class472) class472_11_).aFloat5293));
		((Class472) this).aFloat5294 = (f * (((Class472) class472_12_).aFloat5294 - ((Class472) class472_11_).aFloat5294) + ((Class472) class472_11_).aFloat5294);
		((Class472) this).aFloat5292 = ((((Class472) class472_12_).aFloat5292 - ((Class472) class472_11_).aFloat5292) * f + ((Class472) class472_11_).aFloat5292);
		((Class472) this).aFloat5301 = (((Class472) class472_11_).aFloat5301 + (((Class472) class472_12_).aFloat5301 - ((Class472) class472_11_).aFloat5301) * f);
		((Class472) this).aFloat5299 = (f * (((Class472) class472_12_).aFloat5299 - ((Class472) class472_11_).aFloat5299) + ((Class472) class472_11_).aFloat5299);
		((Class472) this).aFloat5300 = (f * (((Class472) class472_12_).aFloat5300 - ((Class472) class472_11_).aFloat5300) + ((Class472) class472_11_).aFloat5300);
		((Class472) this).anInt5296 = Class57.method1001((((Class472) class472_11_).anInt5296 * 1800241959), (1800241959 * ((Class472) class472_12_).anInt5296), 255.0F * f, -1691050184) * -307118953;
		((Class472) this).anInt5305 = (1340165539 * (int) ((float) ((-330412533 * ((Class472) class472_12_).anInt5305) - (-330412533 * ((Class472) class472_11_).anInt5305)) * f + (float) (-330412533 * ((Class472) class472_11_).anInt5305)));
		if (((Class472) class472_11_).aClass103_5298 != ((Class472) class472_12_).aClass103_5298)
			((Class472) this).aClass103_5298 = class106.method1729(((Class472) class472_11_).aClass103_5298, ((Class472) class472_12_).aClass103_5298, f, ((Class472) this).aClass103_5298);
		if (((Class472) class472_12_).aClass580_5309 != ((Class472) class472_11_).aClass580_5309) {
			if (null == ((Class472) class472_11_).aClass580_5309) {
				((Class472) this).aClass580_5309 = ((Class472) class472_12_).aClass580_5309;
				if (null != ((Class472) this).aClass580_5309)
					((Class472) this).aClass580_5309.method6853((int) (f * 255.0F), 0, -1781127658);
			} else {
				((Class472) this).aClass580_5309 = ((Class472) class472_11_).aClass580_5309;
				if (null != ((Class472) this).aClass580_5309)
					((Class472) this).aClass580_5309.method6853((int) (f * 255.0F), 255, -1229857351);
			}
		}
		((Class472) this).aFloat5308 = ((((Class472) class472_12_).aFloat5308 - ((Class472) class472_11_).aFloat5308) * f + ((Class472) class472_11_).aFloat5308);
		((Class472) this).aFloat5297 = ((((Class472) class472_12_).aFloat5297 - ((Class472) class472_11_).aFloat5297) * f + ((Class472) class472_11_).aFloat5297);
		((Class472) this).aFloat5291 = ((((Class472) class472_12_).aFloat5291 - ((Class472) class472_11_).aFloat5291) * f + ((Class472) class472_11_).aFloat5291);
		((Class472) this).aFloat5306 = (((Class472) class472_11_).aFloat5306 + f * (((Class472) class472_12_).aFloat5306 - ((Class472) class472_11_).aFloat5306));
		((Class472) this).aFloat5307 = (((Class472) class472_11_).aFloat5307 + f * (((Class472) class472_12_).aFloat5307 - ((Class472) class472_11_).aFloat5307));
		float f_13_ = (((Class472) class472_11_).aFloatArray5304[2] + (((Class472) class472_11_).aFloatArray5304[1] + ((Class472) class472_11_).aFloatArray5304[0]));
		float f_14_ = (((Class472) class472_12_).aFloatArray5304[2] + (((Class472) class472_12_).aFloatArray5304[1] + ((Class472) class472_12_).aFloatArray5304[0]));
		float f_15_ = f * (f_14_ - f_13_) + f_13_;
		if (0.0F == f_15_) {
			int[] is = ((Class472) this).anIntArray5303;
			int[] is_16_ = ((Class472) this).anIntArray5303;
			((Class472) this).anIntArray5303[2] = -1;
			is_16_[1] = -1;
			is[0] = -1;
			float[] fs = ((Class472) this).aFloatArray5304;
			float[] fs_17_ = ((Class472) this).aFloatArray5304;
			((Class472) this).aFloatArray5304[2] = 0.0F;
			fs_17_[1] = 0.0F;
			fs[0] = 0.0F;
		} else if (((Class472) class472_11_).anIntArray5303[0] == -1 && ((Class472) class472_11_).anIntArray5303[1] == -1 && ((Class472) class472_11_).anIntArray5303[2] == -1) {
			for (int i_18_ = 0; i_18_ < 3; i_18_++) {
				((Class472) this).anIntArray5303[i_18_] = ((Class472) class472_12_).anIntArray5303[i_18_];
				if (((Class472) this).anIntArray5303[i_18_] == -1)
					((Class472) this).aFloatArray5304[i_18_] = 0.0F;
				else
					((Class472) this).aFloatArray5304[i_18_] = f * ((Class472) class472_12_).aFloatArray5304[i_18_];
			}
		} else if (-1 == ((Class472) class472_12_).anIntArray5303[0] && -1 == ((Class472) class472_12_).anIntArray5303[1] && -1 == ((Class472) class472_12_).anIntArray5303[2]) {
			for (int i_19_ = 0; i_19_ < 3; i_19_++) {
				((Class472) this).anIntArray5303[i_19_] = ((Class472) class472_11_).anIntArray5303[i_19_];
				if (-1 == ((Class472) this).anIntArray5303[i_19_])
					((Class472) this).aFloatArray5304[i_19_] = 0.0F;
				else
					((Class472) this).aFloatArray5304[i_19_] = (((Class472) class472_11_).aFloatArray5304[i_19_] * (1.0F - f));
			}
		} else {
			float f_20_ = 1.0F - f;
			int i_21_ = 0;
			int[] is = { -1, -1, -1, -1, -1, -1 };
			float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int i_22_ = 0; i_22_ < 3; i_22_++) {
				if (((Class472) class472_11_).anIntArray5303[i_22_] > -1) {
					is[i_21_] = ((Class472) class472_11_).anIntArray5303[i_22_];
					fs[i_21_++] = (((Class472) class472_11_).aFloatArray5304[i_22_] * f_20_);
				}
			}
			int i_23_ = i_21_;
			for (int i_24_ = 0; i_24_ < 3; i_24_++) {
				if (((Class472) class472_12_).anIntArray5303[i_24_] > -1) {
					float f_25_ = ((Class472) class472_12_).aFloatArray5304[i_24_] * f;
					for (int i_26_ = 0; i_26_ < i_23_; i_26_++) {
						if (((Class472) class472_12_).anIntArray5303[i_24_] == is[i_26_]) {
							fs[i_26_] += f_25_;
							break;
						}
						if (i_26_ == i_23_ - 1) {
							is[i_21_] = (((Class472) class472_12_).anIntArray5303[i_24_]);
							fs[i_21_++] = f_25_;
						}
					}
				}
			}
			if (i_21_ > 3) {
				float f_27_ = 0.0F;
				float f_28_ = 0.0F;
				for (int i_29_ = 0; i_29_ < i_21_; i_29_++)
					f_27_ += fs[i_29_];
				VarBitDefinition.method5226(fs, is, 0, i_21_ - 1, (short) 5825);
				for (int i_30_ = 0; i_30_ < 3; i_30_++)
					f_28_ += fs[i_30_];
				float f_31_ = f_27_ / f_28_;
				for (int i_32_ = 0; i_32_ < 3; i_32_++)
					fs[i_32_] *= f_31_;
			}
			for (int i_33_ = 0; i_33_ < 3; i_33_++) {
				((Class472) this).anIntArray5303[i_33_] = is[i_33_];
				((Class472) this).aFloatArray5304[i_33_] = fs[i_33_];
			}
		}
	}

	public void method5577(RSByteBuffer class572_sub15) {
		method5571(class572_sub15, 0, -318903243);
	}

	public void method5578(RSByteBuffer class572_sub15, int i) {
		((Class472) this).aFloat5299 = class572_sub15.method8448((byte) 2);
		((Class472) this).aFloat5300 = class572_sub15.method8448((byte) 2);
		((Class472) this).aFloat5301 = class572_sub15.method8448((byte) 2);
	}

	public Class472() {
		((Class472) this).aFloat5297 = 0.0F;
		((Class472) this).aFloat5291 = 1.0F;
		((Class472) this).aFloat5306 = 0.0F;
		((Class472) this).aFloat5307 = 1.0F;
		((Class472) this).anIntArray5303 = new int[] { -1, -1, -1 };
		((Class472) this).aFloatArray5304 = new float[] { 0.0F, 0.0F, 0.0F };
		method5566(1786277954);
	}

	void method5579(RSByteBuffer class572_sub15, int i) {
		((Class472) this).anIntArray5303[i] = class572_sub15.readUnsignedShort(647518597);
		((Class472) this).aFloatArray5304[i] = class572_sub15.method8448((byte) 2);
	}

	public int method5580() {
		return 1800241959 * ((Class472) this).anInt5296;
	}

	boolean method5581(Class472 class472_34_, int i) {
		return ((-962674743 * ((Class472) class472_34_).anInt5302 == -962674743 * ((Class472) this).anInt5302) && (((Class472) this).aFloat5292 == ((Class472) class472_34_).aFloat5292) && (((Class472) class472_34_).aFloat5293 == ((Class472) this).aFloat5293) && (((Class472) this).aFloat5294 == ((Class472) class472_34_).aFloat5294) && (((Class472) class472_34_).aFloat5300 == ((Class472) this).aFloat5300) && (((Class472) this).aFloat5299 == ((Class472) class472_34_).aFloat5299) && (((Class472) class472_34_).aFloat5301 == ((Class472) this).aFloat5301) && (((Class472) class472_34_).anInt5296 * 1800241959 == ((Class472) this).anInt5296 * 1800241959) && (((Class472) this).anInt5305 * -330412533 == ((Class472) class472_34_).anInt5305 * -330412533) && (((Class472) this).aClass103_5298 == ((Class472) class472_34_).aClass103_5298) && (((Class472) this).aClass580_5309 == ((Class472) class472_34_).aClass580_5309) && (((Class472) class472_34_).aFloat5308 == ((Class472) this).aFloat5308) && (((Class472) class472_34_).aFloat5297 == ((Class472) this).aFloat5297) && (((Class472) class472_34_).aFloat5291 == ((Class472) this).aFloat5291) && (((Class472) class472_34_).aFloat5306 == ((Class472) this).aFloat5306) && (((Class472) this).aFloat5307 == ((Class472) class472_34_).aFloat5307) && (((Class472) this).anIntArray5303[0] == ((Class472) class472_34_).anIntArray5303[0]) && (((Class472) class472_34_).anIntArray5303[1] == ((Class472) this).anIntArray5303[1]) && (((Class472) this).anIntArray5303[2] == ((Class472) class472_34_).anIntArray5303[2]) && (((Class472) this).aFloatArray5304[0] == ((Class472) class472_34_).aFloatArray5304[0]) && (((Class472) this).aFloatArray5304[1] == ((Class472) class472_34_).aFloatArray5304[1]) && (((Class472) this).aFloatArray5304[2] == ((Class472) class472_34_).aFloatArray5304[2]));
	}

	void method5582(Class501 class501, HashTable class466, byte i) {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(294524135) == 1 && Class272_Sub2.aClass106_9517.method1849() > 0) {
			if (class466.method5536(1765158876) != -1)
				((Class472) this).anInt5302 = class466.method5536(1753349220) * 1265470073;
			if (class466.method5497((byte) 103) != -1.0F)
				((Class472) this).aFloat5292 = class466.method5497((byte) 103);
			if (class466.method5515((byte) 1) != -1.0F)
				((Class472) this).aFloat5293 = class466.method5515((byte) 1);
			if (class466.method5499(-1451181812) != -1.0F)
				((Class472) this).aFloat5294 = class466.method5499(1553099452);
		}
		if (class466.method5500(-1759605735) != null)
			((Class472) this).aClass240_5295.method3269(class466.method5500(-1758320986));
		if (class466.method5504(337669865) != -1)
			((Class472) this).anInt5296 = class466.method5504(1045631820) * -307118953;
		if (class466.method5498((byte) -78) != -1)
			((Class472) this).anInt5305 = class466.method5498((byte) -68) * 1340165539;
		if (class466.method5503((byte) 0) != -1.0F)
			((Class472) this).aFloat5300 = class466.method5503((byte) 0);
		if (class466.method5537(31406875) != -1.0F)
			((Class472) this).aFloat5301 = class466.method5537(-1597077146);
		if (class466.method5518(827924179) != -1.0F)
			((Class472) this).aFloat5299 = class466.method5518(1232505340);
		if (class466.method5505(1479780901) != -1)
			((Class472) this).aClass103_5298 = class501.method5960(class466.method5505(259214291), -1114892789);
		if (class466.method5519(-1357734123) != -1) {
			int i_35_ = class466.method5519(-2066988689);
			int i_36_ = class466.method5522(1420023758);
			int i_37_ = class466.method5517((byte) 108);
			int i_38_ = class466.method5507((byte) -14);
			int i_39_ = class466.method5508(1995192727);
			Class190.anInt2246 = -1208726249 * i_39_;
			((Class472) this).aClass580_5309 = class501.method5961(i_35_, i_36_, i_37_, i_38_, 1219431545);
		}
		if (class466.method5509(0, (byte) 78) != -1) {
			((Class472) this).anIntArray5303[0] = class466.method5509(0, (byte) 71);
			((Class472) this).aFloatArray5304[0] = class466.method5510(0, 1321752869);
		}
		if (class466.method5509(1, (byte) 108) != -1) {
			((Class472) this).anIntArray5303[1] = class466.method5509(1, (byte) 38);
			((Class472) this).aFloatArray5304[1] = class466.method5510(1, 1273715302);
		}
		if (class466.method5509(2, (byte) -35) != -1) {
			((Class472) this).anIntArray5303[2] = class466.method5509(2, (byte) -24);
			((Class472) this).aFloatArray5304[2] = class466.method5510(2, -305486372);
		}
	}

	public static Class662[] method5583(int i) {
		return (new Class662[] { Class662.aClass662_8466, Class662.aClass662_8472, Class662.aClass662_8463, Class662.aClass662_8453, Class662.aClass662_8461, Class662.aClass662_8462,
			Class662.aClass662_8468, Class662.aClass662_8454, Class662.aClass662_8464, Class662.aClass662_8465, Class662.aClass662_8458, Class662.aClass662_8467, Class662.aClass662_8456,
			Class662.aClass662_8460, Class662.aClass662_8469, Class662.aClass662_8455, Class662.aClass662_8459, Class662.aClass662_8471, Class662.aClass662_8457 });
	}

	static final void method5584(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		int i_40_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class344.audio.method922(i_40_, (byte) 2);
	}

	public static void method5585(boolean bool, boolean bool_41_, byte i) {
		if (bool) {
			Class460.anInt5214 -= -1525232765;
			if (Class460.anInt5214 * 1416043307 == 0)
				Class460.anIntArray4096 = null;
		}
		if (bool_41_) {
			Class460.anInt5211 -= 1007582257;
			if (Class460.anInt5211 * -1736745775 == 0)
				Class460.anIntArray5213 = null;
		}
	}

	static void method5586(Class106 class106, int i, int i_42_, int i_43_, int i_44_, int i_45_) {
		class106.method1715(i, i_42_, i + i_43_, i_44_ + i_42_);
		if (Class547_Sub1.anInt8987 * 448209883 < 100) {
			int i_46_ = 20;
			int i_47_ = i + i_43_ / 2;
			int i_48_ = i_44_ / 2 + i_42_ - 18 - i_46_;
			class106.method1725(i, i_42_, i_43_, i_44_, -16777216, 0);
			class106.method1724(i_47_ - 152, i_48_, 304, 34, client.aColorArray8893[-826921689 * client.anInt8617].getRGB(), 0);
			class106.method1725(i_47_ - 150, i_48_ + 2, 1344629649 * Class547_Sub1.anInt8987, 30, client.aColorArray8611[client.anInt8617 * -826921689].getRGB(), 0);
			Class1.aClass102_16.method1612(Class279.aClass279_3071.method3758(Class594.aClass435_7823, 16711935), i_47_, i_48_ + i_46_, client.aColorArray8613[-826921689 * client.anInt8617].getRGB(), -1, (byte) 8);
		} else {
			int i_49_ = (Class185.anInt2172 * -586790413 - (int) ((float) i_43_ / Class547_Sub1.aFloat6139));
			int i_50_ = ((int) ((float) i_44_ / Class547_Sub1.aFloat6139) + 1172032773 * Class386.anInt4642);
			int i_51_ = (Class185.anInt2172 * -586790413 + (int) ((float) i_43_ / Class547_Sub1.aFloat6139));
			int i_52_ = (Class386.anInt4642 * 1172032773 - (int) ((float) i_44_ / Class547_Sub1.aFloat6139));
			Class512.anInt5704 = -80875543 * (Class185.anInt2172 * -586790413 - (int) ((float) i_43_ / Class547_Sub1.aFloat6139));
			Class96.anInt1254 = -807491357 * (1172032773 * Class386.anInt4642 - (int) ((float) i_44_ / Class547_Sub1.aFloat6139));
			Class516.anInt5744 = ((int) ((float) (i_43_ * 2) / Class547_Sub1.aFloat6139) * 1849579393);
			Class336.anInt4307 = ((int) ((float) (i_44_ * 2) / Class547_Sub1.aFloat6139) * 2088988879);
			Class547_Sub1.aClass127_6169 = Class547_Sub1.aClass127_6135;
			Class547_Sub1.method6506(i_49_ + Class547_Sub1.anInt6143, Class547_Sub1.anInt6165 + i_50_, i_51_ + Class547_Sub1.anInt6143, i_52_ + Class547_Sub1.anInt6165, i, i_42_, i + i_43_, 1 + (i_44_ + i_42_));
			Class547_Sub1.method6469(class106, !Class547_Sub1.aBool8994, !Class547_Sub1.aBool9003, client.aBool8731, false);
			Class675 class675 = Class547_Sub1.method6475(class106);
			Class216.method3079(class106, class675, 0, 0, 1024233506);
			if (client.aBool8874) {
				int i_53_ = i + i_43_ - 5;
				int i_54_ = i_42_ + i_44_ - 8;
				Class512.aClass102_5703.method1611(new StringBuilder().append("Fps: ").append(-267830063 * Class584.anInt7734).append(" (").append(-238321553 * Class584.anInt7754).append(" ms)").toString(), i_53_, i_54_, 16776960, -1, 1364911745);
				i_54_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_55_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_56_ = 16776960;
				if (i_55_ > 65536)
					i_56_ = 16711680;
				Class512.aClass102_5703.method1611(new StringBuilder().append("Mem:").append(i_55_).append("k").toString(), i_53_, i_54_, i_56_, -1, 2123930790);
				i_54_ -= 15;
			}
			Class547_Sub1.aClass127_6135.method2235(5, 1531508985);
		}
	}

	public static Class572_Sub12_Sub13 method5587(int i, int i_57_) {
		return ((Class572_Sub12_Sub13) Class390.aClass676_4654.get((long) i));
	}
}

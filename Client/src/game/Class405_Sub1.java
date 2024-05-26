package game;

/* Class405_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class405_Sub1 extends Class405 {
	byte[] aByteArray9810;
	byte[] aByteArray9811;
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_9812;
	long aLong9813;
	long aLong9814;
	static float[] aFloatArray9815 = new float[16];
	static final int anInt9816 = 0;
	boolean aBool9817 = false;
	float[][] aFloatArrayArray9818 = new float[2][];
	static final int anInt9819 = 1;
	Class406_Sub2 aClass406_Sub2_9820;
	boolean[] aBoolArray9821 = new boolean[2];

	void method9326() {
		if (((Class405_Sub1) this).aLong9813 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9813);
			((Class405_Sub1) this).aLong9813 = 0L;
		}
		if (((Class405_Sub1) this).aLong9814 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9814);
			((Class405_Sub1) this).aLong9814 = 0L;
		}
	}

	void method4826(int i, Class250 class250) {
		int i_0_ = i >> 16;
		int i_1_ = (i & 0xffff) * 4;
		System.arraycopy(class250.method3463(aFloatArray9815), 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_0_], i_1_, 12);
		((Class405_Sub1) this).aBoolArray9821[i_0_] = true;
	}

	void method9327() {
		if (((Class405_Sub1) this).aLong9813 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9813);
			((Class405_Sub1) this).aLong9813 = 0L;
		}
		if (((Class405_Sub1) this).aLong9814 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9814);
			((Class405_Sub1) this).aLong9814 = 0L;
		}
	}

	void method4804(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_2_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 59) != Class63.aClass63_571 && (class572_sub8_sub1.method10266((byte) 48) != Class63.aClass63_617))
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i] = f;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_2_ >= 0) {
			i_2_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_2_] = f;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4801(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_3_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_4_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 42) != Class63.aClass63_572)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_3_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_4_ >= 0) {
			i_4_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_4_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_4_ + 1] = f_3_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4806(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_5_, float f_6_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_7_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 83) != Class63.aClass63_573)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_5_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_6_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_7_ >= 0) {
			i_7_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_7_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_7_ + 1] = f_5_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_7_ + 2] = f_6_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4807(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_8_, float f_9_, float f_10_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_11_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 47) != Class63.aClass63_574)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_8_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_9_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 3] = f_10_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_11_ >= 0) {
			i_11_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_11_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_11_ + 1] = f_8_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_11_ + 2] = f_9_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_11_ + 3] = f_10_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4809(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_12_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 69) != Class63.aClass63_613)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3464(aFloatArray9815), 8);
		if (i_12_ >= 0)
			method9328(i_12_, class250.method3464(aFloatArray9815), 8);
	}

	void method4810(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_13_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 81) != Class63.aClass63_590)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3463(aFloatArray9815), 16);
		if (i_13_ >= 0)
			method9328(i_13_, class250.method3463(aFloatArray9815), 16);
	}

	void method4808(Class572_Sub8_Sub1 class572_sub8_sub1, float[] fs, int i) {
		int i_14_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_15_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 107) != Class63.aClass63_549)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i_14_ >= 0)
			method9331(i_14_, fs, i);
		if (i_15_ >= 0)
			method9328(i_15_, fs, i);
	}

	Class405_Sub1(Class106_Sub3_Sub1 class106_sub3_sub1, Class385 class385) {
		aString4753 = class385.aString4616;
		if (class385.aString4612 != null) {
			aString4754 = class385.aString4612;
			((Class405_Sub1) this).aByteArray9811 = class106_sub3_sub1.method10093(aString4754);
		}
		if (class385.aString4614 != null) {
			aString4755 = class385.aString4614;
			((Class405_Sub1) this).aByteArray9810 = class106_sub3_sub1.method10093(aString4755);
		}
		class106_sub3_sub1.method9803(this);
	}

	void method4843(int i, float f, float f_16_, float f_17_) {
		int i_18_ = i >> 16;
		int i_19_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_18_][i_19_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_18_][i_19_ + 1] = f_16_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_18_][i_19_ + 2] = f_17_;
		((Class405_Sub1) this).aBoolArray9821[i_18_] = true;
	}

	void method4813(int i, float f, float f_20_, float f_21_, float f_22_) {
		int i_23_ = i >> 16;
		int i_24_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_23_][i_24_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_23_][i_24_ + 1] = f_20_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_23_][i_24_ + 2] = f_21_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_23_][i_24_ + 3] = f_22_;
		((Class405_Sub1) this).aBoolArray9821[i_23_] = true;
	}

	void method4848(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_25_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_26_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 31) != Class63.aClass63_572)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_25_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_26_ >= 0) {
			i_26_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_26_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_26_ + 1] = f_25_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4816(int i, Class250 class250) {
		int i_27_ = i >> 16;
		int i_28_ = (i & 0xffff) * 4;
		System.arraycopy(class250.method3464(aFloatArray9815), 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_27_], i_28_, 8);
		((Class405_Sub1) this).aBoolArray9821[i_27_] = true;
	}

	void method4850(int i, Class250 class250) {
		int i_29_ = i >> 16;
		int i_30_ = (i & 0xffff) * 4;
		System.arraycopy(class250.method3463(aFloatArray9815), 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_29_], i_30_, 16);
		((Class405_Sub1) this).aBoolArray9821[i_29_] = true;
	}

	void method4802(int i, float[] fs, int i_31_) {
		int i_32_ = i >> 16;
		int i_33_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_32_], i_33_, i_31_);
		((Class405_Sub1) this).aBoolArray9821[i_32_] = true;
	}

	void method4841(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_34_, float f_35_, float f_36_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_37_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 40) != Class63.aClass63_574)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_34_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_35_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 3] = f_36_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_37_ >= 0) {
			i_37_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_37_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_37_ + 1] = f_34_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_37_ + 2] = f_35_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_37_ + 3] = f_36_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	final void method9328(int i, float[] fs, int i_38_) {
		Class432.method5245(fs, 0, ((Class405_Sub1) this).aFloatArrayArray9818[1], i * 4, i_38_);
		((Class405_Sub1) this).aBoolArray9821[1] = true;
	}

	void method4822(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_39_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 97) != Class63.aClass63_571 && (class572_sub8_sub1.method10266((byte) 50) != Class63.aClass63_617))
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i] = f;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_39_ >= 0) {
			i_39_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_39_] = f;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method9329() {
		if (((Class405_Sub1) this).aBoolArray9821[0]) {
			for (int i = 0; i < ((Class405_Sub1) this).aFloatArrayArray9818[0].length; i++)
				((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.anUnsafe10377.putFloat((((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444) + (long) (i * 4), ((Class405_Sub1) this).aFloatArrayArray9818[0][i]);
			IDirect3DDevice.SetVertexShaderConstantF(((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066, 0, ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444, ((Class405_Sub1) this).aFloatArrayArray9818[0].length / 4);
			((Class405_Sub1) this).aBoolArray9821[0] = false;
		}
		if (((Class405_Sub1) this).aBoolArray9821[1]) {
			for (int i = 0; i < ((Class405_Sub1) this).aFloatArrayArray9818[1].length; i++)
				((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.anUnsafe10377.putFloat((((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444) + (long) (i * 4), ((Class405_Sub1) this).aFloatArrayArray9818[1][i]);
			IDirect3DDevice.SetPixelShaderConstantF(((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066, 0, ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444, ((Class405_Sub1) this).aFloatArrayArray9818[1].length / 4);
			((Class405_Sub1) this).aBoolArray9821[1] = false;
		}
	}

	public void method39() {
		if (((Class405_Sub1) this).aLong9813 != 0L) {
			IUnknown.Release(((Class405_Sub1) this).aLong9813);
			((Class405_Sub1) this).aLong9813 = 0L;
		}
		if (((Class405_Sub1) this).aLong9814 != 0L) {
			IUnknown.Release(((Class405_Sub1) this).aLong9814);
			((Class405_Sub1) this).aLong9814 = 0L;
		}
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9573(this);
	}

	void method4829(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_40_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 108) != Class63.aClass63_590)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3463(aFloatArray9815), 16);
		if (i_40_ >= 0)
			method9328(i_40_, class250.method3463(aFloatArray9815), 16);
	}

	void method4827(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_41_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 124) != Class63.aClass63_613)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3464(aFloatArray9815), 8);
		if (i_41_ >= 0)
			method9328(i_41_, class250.method3464(aFloatArray9815), 8);
	}

	public void method38() {
		if (((Class405_Sub1) this).aLong9813 != 0L) {
			IUnknown.Release(((Class405_Sub1) this).aLong9813);
			((Class405_Sub1) this).aLong9813 = 0L;
		}
		if (((Class405_Sub1) this).aLong9814 != 0L) {
			IUnknown.Release(((Class405_Sub1) this).aLong9814);
			((Class405_Sub1) this).aLong9814 = 0L;
		}
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9573(this);
	}

	void method9330() {
		method9334();
	}

	public boolean method4819() {
		if (((Class405_Sub1) this).aBool9817)
			return true;
		((Class405_Sub1) this).aLong9813 = (((Class405_Sub1) this).aByteArray9811 == null ? 0L : (IDirect3DDevice.CreateVertexShader((((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066), ((Class405_Sub1) this).aByteArray9811)));
		((Class405_Sub1) this).aLong9814 = (((Class405_Sub1) this).aByteArray9810 == null ? 0L : (IDirect3DDevice.CreatePixelShader((((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066), ((Class405_Sub1) this).aByteArray9810)));
		if (((Class405_Sub1) this).aLong9813 == 0L && ((Class405_Sub1) this).aLong9814 == 0L)
			return false;
		int i = -1;
		for (int i_42_ = 0; i_42_ < ((Class405_Sub1) this).aClass406_Sub2_9820.method4909(82720839); i_42_++) {
			if (((Class405_Sub1) this).aClass406_Sub2_9820.method4865(i_42_, 1696835389) == this) {
				i = i_42_;
				break;
			}
		}
		int i_43_ = ((Class405_Sub1) this).aClass406_Sub2_9820.method4911(907390352);
		int i_44_ = ((Class405_Sub1) this).aClass406_Sub2_9820.method4917(142159717);
		for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub1) this).aClass406_Sub2_9820.method4889(i_45_, (byte) 0);
			class572_sub8_sub1.method10264(i);
		}
		for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub1) this).aClass406_Sub2_9820.method4887(i_46_, (byte) 65);
			class572_sub8_sub1.method10264(i);
		}
		int i_47_ = 0;
		int i_48_ = 0;
		int i_49_ = ((Class405_Sub1) this).aClass406_Sub2_9820.method4866(this, (byte) -40);
		for (int i_50_ = 0; i_50_ < i_43_ + i_44_; i_50_++) {
			Class572_Sub8_Sub1_Sub2 class572_sub8_sub1_sub2 = ((Class572_Sub8_Sub1_Sub2) (i_50_ < i_43_ ? ((Class405_Sub1) this).aClass406_Sub2_9820.method4889(i_50_, (byte) 0) : ((Class405_Sub1) this).aClass406_Sub2_9820.method4887(i_50_ - i_43_, (byte) 13)));
			Class63 class63 = class572_sub8_sub1_sub2.method10266((byte) 35);
			int i_51_ = 1;
			if (class63 == Class63.aClass63_549) {
				class63 = class572_sub8_sub1_sub2.method10263((byte) 118);
				i_51_ = class572_sub8_sub1_sub2.method10267((byte) -43);
			}
			switch (class63.anInt672 * 148445375) {
				case 8:
				case 22:
				case 29:
				case 83:
					i_51_ *= 4;
					break;
				default:
					i_51_ = 0;
					break;
				case 21:
				case 31:
				case 59:
				case 108:
				case 115:
					break;
				case 26:
				case 65:
				case 74:
				case 110:
					i_51_ *= 2;
					break;
				case 67:
				case 86:
				case 118:
				case 121:
					i_51_ *= 3;
			}
			if ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11795[i_49_]) >= 0) {
				int i_52_ = ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11795[i_49_]) + i_51_);
				if (i_47_ < i_52_)
					i_47_ = i_52_;
			}
			if ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11796[i_49_]) >= 0) {
				int i_53_ = ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11796[i_49_]) + i_51_);
				if (i_48_ < i_53_)
					i_48_ = i_53_;
			}
		}
		((Class405_Sub1) this).aFloatArrayArray9818[0] = new float[i_47_ * 4];
		((Class405_Sub1) this).aFloatArrayArray9818[1] = new float[i_48_ * 4];
		((Class405_Sub1) this).aBool9817 = true;
		return true;
	}

	void method4820(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_54_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 31) != Class63.aClass63_571 && (class572_sub8_sub1.method10266((byte) 11) != Class63.aClass63_617))
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i] = f;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_54_ >= 0) {
			i_54_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_54_] = f;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	Class405_Sub1(Class106_Sub3_Sub1 class106_sub3_sub1, Class406_Sub2 class406_sub2, Class385 class385) {
		this(class106_sub3_sub1, class385);
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812 = class106_sub3_sub1;
		((Class405_Sub1) this).aClass406_Sub2_9820 = class406_sub2;
	}

	void method4831(int i, Class250 class250) {
		int i_55_ = i >> 16;
		int i_56_ = (i & 0xffff) * 4;
		System.arraycopy(class250.method3463(aFloatArray9815), 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_55_], i_56_, 12);
		((Class405_Sub1) this).aBoolArray9821[i_55_] = true;
	}

	void method4814(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_57_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 119) != Class63.aClass63_571 && (class572_sub8_sub1.method10266((byte) 120) != Class63.aClass63_617))
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i] = f;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_57_ >= 0) {
			i_57_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_57_] = f;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4825(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_58_, float f_59_, float f_60_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_61_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 33) != Class63.aClass63_574)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_58_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_59_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 3] = f_60_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_61_ >= 0) {
			i_61_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_61_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_61_ + 1] = f_58_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_61_ + 2] = f_59_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_61_ + 3] = f_60_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4817(Class572_Sub8_Sub1 class572_sub8_sub1, float[] fs, int i) {
		int i_62_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_63_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 53) != Class63.aClass63_549)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i_62_ >= 0)
			method9331(i_62_, fs, i);
		if (i_63_ >= 0)
			method9328(i_63_, fs, i);
	}

	public boolean method4803() {
		if (((Class405_Sub1) this).aBool9817)
			return true;
		((Class405_Sub1) this).aLong9813 = (((Class405_Sub1) this).aByteArray9811 == null ? 0L : (IDirect3DDevice.CreateVertexShader((((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066), ((Class405_Sub1) this).aByteArray9811)));
		((Class405_Sub1) this).aLong9814 = (((Class405_Sub1) this).aByteArray9810 == null ? 0L : (IDirect3DDevice.CreatePixelShader((((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066), ((Class405_Sub1) this).aByteArray9810)));
		if (((Class405_Sub1) this).aLong9813 == 0L && ((Class405_Sub1) this).aLong9814 == 0L)
			return false;
		int i = -1;
		for (int i_64_ = 0; i_64_ < ((Class405_Sub1) this).aClass406_Sub2_9820.method4909(-85576973); i_64_++) {
			if (((Class405_Sub1) this).aClass406_Sub2_9820.method4865(i_64_, 1362461464) == this) {
				i = i_64_;
				break;
			}
		}
		int i_65_ = ((Class405_Sub1) this).aClass406_Sub2_9820.method4911(2025789924);
		int i_66_ = ((Class405_Sub1) this).aClass406_Sub2_9820.method4917(268215435);
		for (int i_67_ = 0; i_67_ < i_65_; i_67_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub1) this).aClass406_Sub2_9820.method4889(i_67_, (byte) 0);
			class572_sub8_sub1.method10264(i);
		}
		for (int i_68_ = 0; i_68_ < i_66_; i_68_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub1) this).aClass406_Sub2_9820.method4887(i_68_, (byte) 33);
			class572_sub8_sub1.method10264(i);
		}
		int i_69_ = 0;
		int i_70_ = 0;
		int i_71_ = ((Class405_Sub1) this).aClass406_Sub2_9820.method4866(this, (byte) -65);
		for (int i_72_ = 0; i_72_ < i_65_ + i_66_; i_72_++) {
			Class572_Sub8_Sub1_Sub2 class572_sub8_sub1_sub2 = ((Class572_Sub8_Sub1_Sub2) (i_72_ < i_65_ ? ((Class405_Sub1) this).aClass406_Sub2_9820.method4889(i_72_, (byte) 0) : ((Class405_Sub1) this).aClass406_Sub2_9820.method4887(i_72_ - i_65_, (byte) 68)));
			Class63 class63 = class572_sub8_sub1_sub2.method10266((byte) 73);
			int i_73_ = 1;
			if (class63 == Class63.aClass63_549) {
				class63 = class572_sub8_sub1_sub2.method10263((byte) 124);
				i_73_ = class572_sub8_sub1_sub2.method10267((byte) -15);
			}
			switch (class63.anInt672 * 148445375) {
				case 8:
				case 22:
				case 29:
				case 83:
					i_73_ *= 4;
					break;
				default:
					i_73_ = 0;
					break;
				case 21:
				case 31:
				case 59:
				case 108:
				case 115:
					break;
				case 26:
				case 65:
				case 74:
				case 110:
					i_73_ *= 2;
					break;
				case 67:
				case 86:
				case 118:
				case 121:
					i_73_ *= 3;
			}
			if ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11795[i_71_]) >= 0) {
				int i_74_ = ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11795[i_71_]) + i_73_);
				if (i_69_ < i_74_)
					i_69_ = i_74_;
			}
			if ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11796[i_71_]) >= 0) {
				int i_75_ = ((((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1_sub2).anIntArray11796[i_71_]) + i_73_);
				if (i_70_ < i_75_)
					i_70_ = i_75_;
			}
		}
		((Class405_Sub1) this).aFloatArrayArray9818[0] = new float[i_69_ * 4];
		((Class405_Sub1) this).aFloatArrayArray9818[1] = new float[i_70_ * 4];
		((Class405_Sub1) this).aBool9817 = true;
		return true;
	}

	void method4847(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_76_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 124) != Class63.aClass63_590)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3463(aFloatArray9815), 16);
		if (i_76_ >= 0)
			method9328(i_76_, class250.method3463(aFloatArray9815), 16);
	}

	void method4844(int i, Class250 class250) {
		int i_77_ = i >> 16;
		int i_78_ = (i & 0xffff) * 4;
		System.arraycopy(class250.method3463(aFloatArray9815), 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_77_], i_78_, 16);
		((Class405_Sub1) this).aBoolArray9821[i_77_] = true;
	}

	void method4830(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_79_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 75) != Class63.aClass63_590)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3463(aFloatArray9815), 16);
		if (i_79_ >= 0)
			method9328(i_79_, class250.method3463(aFloatArray9815), 16);
	}

	void method4805(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_80_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 104) != Class63.aClass63_590)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3463(aFloatArray9815), 16);
		if (i_80_ >= 0)
			method9328(i_80_, class250.method3463(aFloatArray9815), 16);
	}

	void method4832(Class572_Sub8_Sub1 class572_sub8_sub1, int i, Interface34 interface34) {
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9641(i);
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9659(interface34);
	}

	void method4833(int i, float f, float f_81_, float f_82_) {
		int i_83_ = i >> 16;
		int i_84_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_83_][i_84_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_83_][i_84_ + 1] = f_81_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_83_][i_84_ + 2] = f_82_;
		((Class405_Sub1) this).aBoolArray9821[i_83_] = true;
	}

	void method4834(int i, float f, float f_85_, float f_86_) {
		int i_87_ = i >> 16;
		int i_88_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_87_][i_88_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_87_][i_88_ + 1] = f_85_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_87_][i_88_ + 2] = f_86_;
		((Class405_Sub1) this).aBoolArray9821[i_87_] = true;
	}

	void method4835(int i, float f, float f_89_, float f_90_) {
		int i_91_ = i >> 16;
		int i_92_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_91_][i_92_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_91_][i_92_ + 1] = f_89_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_91_][i_92_ + 2] = f_90_;
		((Class405_Sub1) this).aBoolArray9821[i_91_] = true;
	}

	void method4846(int i, float f, float f_93_, float f_94_) {
		int i_95_ = i >> 16;
		int i_96_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_95_][i_96_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_95_][i_96_ + 1] = f_93_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_95_][i_96_ + 2] = f_94_;
		((Class405_Sub1) this).aBoolArray9821[i_95_] = true;
	}

	void method4837(int i, float f, float f_97_, float f_98_, float f_99_) {
		int i_100_ = i >> 16;
		int i_101_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_100_][i_101_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_100_][i_101_ + 1] = f_97_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_100_][i_101_ + 2] = f_98_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_100_][i_101_ + 3] = f_99_;
		((Class405_Sub1) this).aBoolArray9821[i_100_] = true;
	}

	void method4838(int i, float f, float f_102_, float f_103_, float f_104_) {
		int i_105_ = i >> 16;
		int i_106_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_105_][i_106_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_105_][i_106_ + 1] = f_102_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_105_][i_106_ + 2] = f_103_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_105_][i_106_ + 3] = f_104_;
		((Class405_Sub1) this).aBoolArray9821[i_105_] = true;
	}

	void method4839(int i, float f, float f_107_, float f_108_, float f_109_) {
		int i_110_ = i >> 16;
		int i_111_ = (i & 0xffff) * 4;
		((Class405_Sub1) this).aFloatArrayArray9818[i_110_][i_111_] = f;
		((Class405_Sub1) this).aFloatArrayArray9818[i_110_][i_111_ + 1] = f_107_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_110_][i_111_ + 2] = f_108_;
		((Class405_Sub1) this).aFloatArrayArray9818[i_110_][i_111_ + 3] = f_109_;
		((Class405_Sub1) this).aBoolArray9821[i_110_] = true;
	}

	void method4815(int i, float[] fs, int i_112_) {
		int i_113_ = i >> 16;
		int i_114_ = (i & 0xffff) * 4;
		System.arraycopy(fs, 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_113_], i_114_, i_112_);
		((Class405_Sub1) this).aBoolArray9821[i_113_] = true;
	}

	void method4828(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_115_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 64) != Class63.aClass63_590)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0)
			method9331(i, class250.method3463(aFloatArray9815), 16);
		if (i_115_ >= 0)
			method9328(i_115_, class250.method3463(aFloatArray9815), 16);
	}

	void method4842(int i, Class250 class250) {
		int i_116_ = i >> 16;
		int i_117_ = (i & 0xffff) * 4;
		System.arraycopy(class250.method3464(aFloatArray9815), 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_116_], i_117_, 8);
		((Class405_Sub1) this).aBoolArray9821[i_116_] = true;
	}

	public void finalize() {
		method9334();
	}

	void method4845(int i, int i_118_, Interface34 interface34) {
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9641(i_118_);
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9659(interface34);
	}

	void method4812(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_119_, float f_120_, float f_121_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_122_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 127) != Class63.aClass63_574)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_119_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_120_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 3] = f_121_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_122_ >= 0) {
			i_122_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_122_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_122_ + 1] = f_119_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_122_ + 2] = f_120_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_122_ + 3] = f_121_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4824(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_123_, float f_124_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_125_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 31) != Class63.aClass63_573)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_123_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_124_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_125_ >= 0) {
			i_125_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_125_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_125_ + 1] = f_123_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_125_ + 2] = f_124_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4823(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_126_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_127_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 18) != Class63.aClass63_572)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_126_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_127_ >= 0) {
			i_127_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_127_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_127_ + 1] = f_126_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4811(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_128_, float f_129_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_130_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 7) != Class63.aClass63_573)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_128_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_129_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_130_ >= 0) {
			i_130_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_130_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_130_ + 1] = f_128_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_130_ + 2] = f_129_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4849(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_131_, float f_132_) {
		int i = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10672();
		int i_133_ = ((Class572_Sub8_Sub1_Sub2) class572_sub8_sub1).method10673();
		if (class572_sub8_sub1.method10266((byte) 101) != Class63.aClass63_573)
			throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
		if (i >= 0) {
			i *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 1] = f_131_;
			((Class405_Sub1) this).aFloatArrayArray9818[0][i + 2] = f_132_;
			((Class405_Sub1) this).aBoolArray9821[0] = true;
		}
		if (i_133_ >= 0) {
			i_133_ *= 4;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_133_ + 0] = f;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_133_ + 1] = f_131_;
			((Class405_Sub1) this).aFloatArrayArray9818[1][i_133_ + 2] = f_132_;
			((Class405_Sub1) this).aBoolArray9821[1] = true;
		}
	}

	void method4836(int i, Class250 class250) {
		int i_134_ = i >> 16;
		int i_135_ = (i & 0xffff) * 4;
		System.arraycopy(class250.method3464(aFloatArray9815), 0, ((Class405_Sub1) this).aFloatArrayArray9818[i_134_], i_135_, 8);
		((Class405_Sub1) this).aBoolArray9821[i_134_] = true;
	}

	void method4840(Class572_Sub8_Sub1 class572_sub8_sub1, int i, Interface34 interface34) {
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9641(i);
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9659(interface34);
	}

	final void method9331(int i, float[] fs, int i_136_) {
		Class432.method5245(fs, 0, ((Class405_Sub1) this).aFloatArrayArray9818[0], i * 4, i_136_);
		((Class405_Sub1) this).aBoolArray9821[0] = true;
	}

	void method9332() {
		if (((Class405_Sub1) this).aBoolArray9821[0]) {
			for (int i = 0; i < ((Class405_Sub1) this).aFloatArrayArray9818[0].length; i++)
				((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.anUnsafe10377.putFloat((((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444) + (long) (i * 4), ((Class405_Sub1) this).aFloatArrayArray9818[0][i]);
			IDirect3DDevice.SetVertexShaderConstantF(((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066, 0, ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444, ((Class405_Sub1) this).aFloatArrayArray9818[0].length / 4);
			((Class405_Sub1) this).aBoolArray9821[0] = false;
		}
		if (((Class405_Sub1) this).aBoolArray9821[1]) {
			for (int i = 0; i < ((Class405_Sub1) this).aFloatArrayArray9818[1].length; i++)
				((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.anUnsafe10377.putFloat((((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444) + (long) (i * 4), ((Class405_Sub1) this).aFloatArrayArray9818[1][i]);
			IDirect3DDevice.SetPixelShaderConstantF(((Class106_Sub3_Sub1) ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812).aLong11066, 0, ((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.aLong10444, ((Class405_Sub1) this).aFloatArrayArray9818[1].length / 4);
			((Class405_Sub1) this).aBoolArray9821[1] = false;
		}
	}

	void method9333() {
		if (((Class405_Sub1) this).aLong9813 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9813);
			((Class405_Sub1) this).aLong9813 = 0L;
		}
		if (((Class405_Sub1) this).aLong9814 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9814);
			((Class405_Sub1) this).aLong9814 = 0L;
		}
	}

	void method9334() {
		if (((Class405_Sub1) this).aLong9813 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9813);
			((Class405_Sub1) this).aLong9813 = 0L;
		}
		if (((Class405_Sub1) this).aLong9814 != 0L) {
			((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method10097(((Class405_Sub1) this).aLong9814);
			((Class405_Sub1) this).aLong9814 = 0L;
		}
	}

	void method4818(int i, int i_137_, Interface34 interface34) {
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9641(i_137_);
		((Class405_Sub1) this).aClass106_Sub3_Sub1_9812.method9659(interface34);
	}
}

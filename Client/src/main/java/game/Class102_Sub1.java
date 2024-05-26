package game;

/* Class102_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class102_Sub1 extends Class102 {
	int anInt9985;
	Interface43 anInterface43_9986;
	byte[] aByteArray9987 = new byte[512];
	Interface44 anInterface44_9988;
	int anInt9989;
	Class106_Sub3 aClass106_Sub3_9990;

	void method1621(char c, int i, int i_0_, int i_1_, boolean bool, Class167 class167, int i_2_, int i_3_) {
		/* empty */
	}

	void method1609(char c, int i, int i_4_, int i_5_, boolean bool) {
		if (((Class102_Sub1) this).aClass106_Sub3_9990.method9621() != Class352.aClass352_4397) {
			i += ((Class102_Sub1) this).aByteArray9987[c * '\002'];
			i_4_ += ((Class102_Sub1) this).aByteArray9987[c * '\002' + '\001'];
			((Class106_Sub3) ((Class102_Sub1) this).aClass106_Sub3_9990).aClass290_10384.method3922((float) i, (float) i_4_, (float) (i + ((Class102_Sub1) this).anInt9985), (float) (i_4_ + ((Class102_Sub1) this).anInt9985), ((float) (c % '\020') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method235()), ((float) (c / '\020') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method257()), ((float) (c % '\020' + '\001') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method235()), ((float) (c / '\020' + '\001') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method257()), ((Class102_Sub1) this).anInterface43_9986, i_5_);
		} else {
			((Class102_Sub1) this).aClass106_Sub3_9990.method9612();
			((Class102_Sub1) this).aClass106_Sub3_9990.method9591(1);
			Class426 class426 = (((Class106_Sub3) ((Class102_Sub1) this).aClass106_Sub3_9990).aClass426_10376);
			class426.anInterface43_4996 = ((Class102_Sub1) this).anInterface43_9986;
			class426.method5179(0, i_5_);
			float f = (float) ((Class102_Sub1) this).aClass106_Sub3_9990.method1683(-887544381).method1648();
			float f_6_ = (float) ((Class102_Sub1) this).aClass106_Sub3_9990.method1683(805576563).method1646();
			class426.aClass250_4998.method3448(2.0F / f, 2.0F / f_6_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class102_Sub1) this).aClass106_Sub3_9990.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_4_ + ((Class102_Sub1) this).aClass106_Sub3_9990.method9590()) * 2.0F / f_6_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3444();
			class426.anInterface44_5001 = ((Class102_Sub1) this).anInterface44_9988;
			class426.anInt4995 = c * '\004';
			class426.aClass362_5003 = (((Class106_Sub3) ((Class102_Sub1) this).aClass106_Sub3_9990).aClass362_10534);
			class426.method5180();
		}
	}

	void method1623(char c, int i, int i_7_, int i_8_, boolean bool, Class167 class167, int i_9_, int i_10_) {
		/* empty */
	}

	void method1622(char c, int i, int i_11_, int i_12_, boolean bool) {
		if (((Class102_Sub1) this).aClass106_Sub3_9990.method9621() != Class352.aClass352_4397) {
			i += ((Class102_Sub1) this).aByteArray9987[c * '\002'];
			i_11_ += ((Class102_Sub1) this).aByteArray9987[c * '\002' + '\001'];
			((Class106_Sub3) ((Class102_Sub1) this).aClass106_Sub3_9990).aClass290_10384.method3922((float) i, (float) i_11_, (float) (i + ((Class102_Sub1) this).anInt9985), (float) (i_11_ + ((Class102_Sub1) this).anInt9985), ((float) (c % '\020') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method235()), ((float) (c / '\020') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method257()), ((float) (c % '\020' + '\001') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method235()), ((float) (c / '\020' + '\001') / 16.0F * ((Class102_Sub1) this).anInterface43_9986.method257()), ((Class102_Sub1) this).anInterface43_9986, i_12_);
		} else {
			((Class102_Sub1) this).aClass106_Sub3_9990.method9612();
			((Class102_Sub1) this).aClass106_Sub3_9990.method9591(1);
			Class426 class426 = (((Class106_Sub3) ((Class102_Sub1) this).aClass106_Sub3_9990).aClass426_10376);
			class426.anInterface43_4996 = ((Class102_Sub1) this).anInterface43_9986;
			class426.method5179(0, i_12_);
			float f = (float) ((Class102_Sub1) this).aClass106_Sub3_9990.method1683(1253674391).method1648();
			float f_13_ = (float) ((Class102_Sub1) this).aClass106_Sub3_9990.method1683(183035134).method1646();
			class426.aClass250_4998.method3448(2.0F / f, 2.0F / f_13_, 1.0F, 1.0F);
			class426.aClass250_4998.aFloatArray2728[12] = (((float) i + ((Class102_Sub1) this).aClass106_Sub3_9990.method9590()) * 2.0F / f) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[13] = (((float) i_11_ + ((Class102_Sub1) this).aClass106_Sub3_9990.method9590()) * 2.0F / f_13_) - 1.0F;
			class426.aClass250_4998.aFloatArray2728[14] = -1.0F;
			class426.aClass250_4997.method3444();
			class426.anInterface44_5001 = ((Class102_Sub1) this).anInterface44_9988;
			class426.anInt4995 = c * '\004';
			class426.aClass362_5003 = (((Class106_Sub3) ((Class102_Sub1) this).aClass106_Sub3_9990).aClass362_10534);
			class426.method5180();
		}
	}

	void method1625(char c, int i, int i_14_, int i_15_, boolean bool, Class167 class167, int i_16_, int i_17_) {
		/* empty */
	}

	void method1624(char c, int i, int i_18_, int i_19_, boolean bool, Class167 class167, int i_20_, int i_21_) {
		/* empty */
	}

	Class102_Sub1(Class106_Sub3 class106_sub3, Class284 class284, Class87[] class87s, boolean bool) {
		super(class106_sub3, class284);
		((Class102_Sub1) this).aClass106_Sub3_9990 = class106_sub3;
		((Class102_Sub1) this).anInt9985 = 0;
		for (int i = 0; i < 256; i++) {
			Class87 class87 = class87s[i];
			if (class87.method1330() > ((Class102_Sub1) this).anInt9985)
				((Class102_Sub1) this).anInt9985 = class87.method1330();
			if (class87.method1329() > ((Class102_Sub1) this).anInt9985)
				((Class102_Sub1) this).anInt9985 = class87.method1329();
		}
		((Class102_Sub1) this).anInt9989 = ((Class102_Sub1) this).anInt9985 * 16;
		if (bool) {
			byte[] is = new byte[(((Class102_Sub1) this).anInt9989 * ((Class102_Sub1) this).anInt9989)];
			for (int i = 0; i < 256; i++) {
				Class87 class87 = class87s[i];
				int i_22_ = class87.method1330();
				int i_23_ = class87.method1329();
				int i_24_ = i % 16 * ((Class102_Sub1) this).anInt9985;
				int i_25_ = i / 16 * ((Class102_Sub1) this).anInt9985;
				int i_26_ = i_25_ * ((Class102_Sub1) this).anInt9989 + i_24_;
				int i_27_ = 0;
				if (class87.method1282()) {
					Class87_Sub1 class87_sub1 = (Class87_Sub1) class87s[i];
					if (!class87_sub1.method1322()) {
						byte[] is_28_ = class87_sub1.aByteArray9969;
						for (int i_29_ = 0; i_29_ < i_22_; i_29_++) {
							for (int i_30_ = 0; i_30_ < i_23_; i_30_++)
								is[i_26_++] = (byte) (is_28_[i_27_++] == 0 ? 0 : -1);
							i_26_ += ((Class102_Sub1) this).anInt9989 - i_23_;
						}
					} else {
						byte[] is_31_ = class87_sub1.aByteArray9972;
						for (int i_32_ = 0; i_32_ < i_22_; i_32_++) {
							for (int i_33_ = 0; i_33_ < i_23_; i_33_++)
								is[i_26_++] = is_31_[i_27_++];
							i_26_ += ((Class102_Sub1) this).anInt9989 - i_23_;
						}
					}
				} else {
					Class87_Sub2 class87_sub2 = (Class87_Sub2) class87s[i];
					int[] is_34_ = class87_sub2.method1285(false);
					if (!class87_sub2.method1322()) {
						for (int i_35_ = 0; i_35_ < i_22_; i_35_++) {
							for (int i_36_ = 0; i_36_ < i_23_; i_36_++) {
								int i_37_ = is_34_[i_27_++];
								byte i_38_ = (byte) (((i_37_ >> 16 & 0xff) * 3 + (i_37_ >> 8 & 0xff) * 4 + (i_37_ & 0xff)) >> 3);
								is[i_26_++] = i_38_;
							}
							i_26_ += ((Class102_Sub1) this).anInt9989 - i_23_;
						}
					} else {
						for (int i_39_ = 0; i_39_ < i_22_; i_39_++) {
							for (int i_40_ = 0; i_40_ < i_23_; i_40_++)
								is[i_26_++] = (byte) (is_34_[i_27_++] >> 24 & 0xff);
							i_26_ += ((Class102_Sub1) this).anInt9989 - i_23_;
						}
					}
				}
			}
			int[] is_41_ = new int[is.length];
			for (int i = 0; i < is.length; i++)
				is_41_[i] = is[i] << 24 | 0xffffff;
			((Class102_Sub1) this).anInterface43_9986 = class106_sub3.method9711(((Class102_Sub1) this).anInt9989, ((Class102_Sub1) this).anInt9989, false, is_41_);
		} else {
			int[] is = new int[(((Class102_Sub1) this).anInt9989 * ((Class102_Sub1) this).anInt9989)];
			for (int i = 0; i < 256; i++) {
				Class87 class87 = class87s[i];
				int i_42_ = class87.method1330();
				int i_43_ = class87.method1329();
				int i_44_ = i % 16 * ((Class102_Sub1) this).anInt9985;
				int i_45_ = i / 16 * ((Class102_Sub1) this).anInt9985;
				int i_46_ = i_45_ * ((Class102_Sub1) this).anInt9989 + i_44_;
				int i_47_ = 0;
				if (class87.method1282()) {
					Class87_Sub1 class87_sub1 = (Class87_Sub1) class87s[i];
					int[] is_48_ = class87_sub1.anIntArray9967;
					byte[] is_49_ = class87_sub1.aByteArray9972;
					byte[] is_50_ = class87_sub1.aByteArray9969;
					if (is_49_ != null) {
						for (int i_51_ = 0; i_51_ < i_42_; i_51_++) {
							for (int i_52_ = 0; i_52_ < i_43_; i_52_++) {
								is[i_46_++] = (is_49_[i_47_] << 24 | is_48_[is_50_[i_47_] & 0xff]);
								i_47_++;
							}
							i_46_ += ((Class102_Sub1) this).anInt9989 - i_43_;
						}
					} else {
						for (int i_53_ = 0; i_53_ < i_42_; i_53_++) {
							for (int i_54_ = 0; i_54_ < i_43_; i_54_++) {
								int i_55_;
								if ((i_55_ = is_50_[i_47_++]) != 0)
									is[i_46_++] = ~0xffffff | is_48_[i_55_ & 0xff];
								else
									i_46_++;
							}
							i_46_ += ((Class102_Sub1) this).anInt9989 - i_43_;
						}
					}
				} else {
					Class87_Sub2 class87_sub2 = (Class87_Sub2) class87s[i];
					int[] is_56_ = class87_sub2.method1285(false);
					if (!class87_sub2.method1322()) {
						for (int i_57_ = 0; i_57_ < i_42_; i_57_++) {
							for (int i_58_ = 0; i_58_ < i_43_; i_58_++) {
								int i_59_ = is_56_[i_47_] & 0xffffff;
								is[i_46_++] = (i_59_ == 0 ? 0 : 255) << 24 | i_59_;
								i_47_++;
							}
							i_46_ += ((Class102_Sub1) this).anInt9989 - i_43_;
						}
					} else {
						for (int i_60_ = 0; i_60_ < i_42_; i_60_++) {
							for (int i_61_ = 0; i_61_ < i_43_; i_61_++)
								is[i_46_++] = is_56_[i_47_++];
							i_46_ += ((Class102_Sub1) this).anInt9989 - i_43_;
						}
					}
				}
			}
			((Class102_Sub1) this).anInterface43_9986 = class106_sub3.method9711(((Class102_Sub1) this).anInt9989, ((Class102_Sub1) this).anInt9989, false, is);
		}
		((Class102_Sub1) this).anInterface43_9986.method203(Class367.aClass367_4509);
		((Class102_Sub1) this).anInterface44_9988 = class106_sub3.method9723(false);
		((Class102_Sub1) this).anInterface44_9988.method259(20480, 20);
		ByteBuffer bytebuffer = ((Class102_Sub1) this).aClass106_Sub3_9990.aByteBuffer10378;
		bytebuffer.clear();
		float f = (((Class102_Sub1) this).anInterface43_9986.method226((float) ((Class102_Sub1) this).anInt9989) / (float) ((Class102_Sub1) this).anInt9989);
		float f_62_ = (((Class102_Sub1) this).anInterface43_9986.method224((float) ((Class102_Sub1) this).anInt9989) / (float) ((Class102_Sub1) this).anInt9989);
		for (int i = 0; i < 256; i++) {
			Class87 class87 = class87s[i];
			int i_63_ = class87.method1330();
			int i_64_ = class87.method1329();
			int i_65_ = class87.method1288();
			int i_66_ = class87.method1286();
			float f_67_ = (float) (i % 16 * ((Class102_Sub1) this).anInt9985);
			float f_68_ = (float) (i / 16 * ((Class102_Sub1) this).anInt9985);
			float f_69_ = f_67_ * f;
			float f_70_ = f_68_ * f_62_;
			float f_71_ = (f_67_ + (float) i_64_) * f;
			float f_72_ = (f_68_ + (float) i_63_) * f_62_;
			bytebuffer.putFloat((float) i_66_);
			bytebuffer.putFloat((float) i_65_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_69_);
			bytebuffer.putFloat(f_70_);
			bytebuffer.putFloat((float) i_66_);
			bytebuffer.putFloat((float) (i_65_ + i_63_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_69_);
			bytebuffer.putFloat(f_72_);
			bytebuffer.putFloat((float) (i_66_ + i_64_));
			bytebuffer.putFloat((float) (i_65_ + i_63_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_71_);
			bytebuffer.putFloat(f_72_);
			bytebuffer.putFloat((float) (i_66_ + i_64_));
			bytebuffer.putFloat((float) i_65_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_71_);
			bytebuffer.putFloat(f_70_);
		}
		((Class102_Sub1) this).anInterface44_9988.method223(0, bytebuffer.position(), ((Class102_Sub1) this).aClass106_Sub3_9990.aLong10444);
		for (int i = 0; i < 256; i++) {
			Class87 class87 = class87s[i];
			((Class102_Sub1) this).aByteArray9987[i * 2] = (byte) class87.method1286();
			((Class102_Sub1) this).aByteArray9987[i * 2 + 1] = (byte) class87.method1288();
		}
	}
}

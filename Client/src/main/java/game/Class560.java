package game;

/* Class560 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class560 {
	boolean aBool6337;
	Class289_Sub1 this$0;
	byte[] aByteArray6338;
	SourceDataLine aSourceDataLine6339;
	int anInt6340;
	int anInt6341;
	int anInt6342;
	List aList6343;
	int anInt6344;
	int anInt6345;
	float aFloat6346;
	byte[] aByteArray6347;
	public static Class639_Sub1 aClass639_Sub1_6348;

	void method6606(int i) {
		((Class560) this).anInt6341 = 0;
		method6607((byte) 55);
		int i_0_;
		for (/**/; -1328750669 * ((Class560) this).anInt6341 > 0; ((Class560) this).anInt6341 -= 645064571 * i_0_) {
			i_0_ = -1328750669 * ((Class560) this).anInt6341;
			if (i_0_ + -1931128179 * ((Class560) this).anInt6342 >= ((Class560) this).aByteArray6338.length)
				i_0_ = (((Class560) this).aByteArray6338.length - -1931128179 * ((Class560) this).anInt6342);
			((Class560) this).aSourceDataLine6339.write(((Class560) this).aByteArray6338, -1931128179 * ((Class560) this).anInt6342, i_0_);
			for (int i_1_ = 0; i_1_ < i_0_; i_1_++)
				((Class560) this).aByteArray6338[-1931128179 * ((Class560) this).anInt6342 + i_1_] = (byte) 0;
			((Class560) this).anInt6342 += i_0_ * 2065940549;
			((Class560) this).anInt6342 = 2065940549 * (((Class560) this).anInt6342 * -1931128179 % ((Class560) this).aByteArray6338.length);
		}
	}

	void method6607(byte i) {
		synchronized (this) {
			int i_2_ = 2147483647;
			double d = (double) (638665547 * ((Class560) this).anInt6345 * (724237427 * ((Class560) this).anInt6344 / 8));
			boolean bool = false;
			Iterator iterator = ((Class560) this).aList6343.iterator();
			while (iterator.hasNext()) {
				Class556 class556 = (Class556) iterator.next();
				int i_3_ = (((Class556) class556).aByteArray6322.length - ((Class556) class556).anInt6328 * 63780861);
				if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
					i_3_ *= (((Class560) this).aFloat6346 / ((Class556) class556).aFloat6326);
					i_3_ = (int) (d * Math.ceil((double) i_3_ / d));
				}
				((Class556) class556).anInt6327 = i_3_ * 1356232787;
				if (i_3_ > 0 && i_3_ < i_2_) {
					bool = true;
					i_2_ = i_3_;
				}
			}
			if (i_2_ > ((Class560) this).anInt6340 * -333035483)
				i_2_ = -333035483 * ((Class560) this).anInt6340;
			if (i_2_ == 0 || false == bool) {
				/* empty */
			} else {
				int i_4_ = ((Class560) this).anInt6344 * 724237427 / 8;
				Iterator iterator_5_ = ((Class560) this).aList6343.iterator();
				while (iterator_5_.hasNext()) {
					Class556 class556 = (Class556) iterator_5_.next();
					if (((Class556) class556).anInt6327 * -1211724837 >= i_2_) {
						int i_6_ = ((Class560) this).anInt6342 * -1931128179;
						int i_7_ = 0;
						int i_8_ = (-1816809977 * ((Class556) class556).anInt6329 / 8);
						double d_9_ = 0.0;
						int i_10_ = 0;
						double d_11_ = (double) ((Class560) this).aFloat6346;
						double d_12_ = (double) ((Class556) class556).aFloat6326;
						int i_13_ = ((Class556) class556).anInt6330 * 1309562285;
						for (/**/; (-1211724837 * ((Class556) class556).anInt6327 > 0 && i_7_ < i_2_); i_7_ += i_8_) {
							short i_14_ = 0;
							short i_15_ = 0;
							byte[] is = ((Class560) this).aByteArray6347;
							for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
								is[i_16_] = (((Class560) this).aByteArray6338[i_6_ + i_16_]);
								i_14_ |= (is[i_16_] & 0xff) << 8 * i_16_;
							}
							if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
								byte[] is_17_ = ((Class556) class556).aByteArray6323;
								float f = (float) (d_12_ * (d_9_ / d_11_));
								float f_18_ = (float) Math.floor((double) f);
								short i_19_ = 0;
								short i_20_ = 0;
								int i_21_ = (int) Math.floor((double) f);
								int i_22_ = (int) Math.ceil((double) f);
								i_21_ = (i_10_ * is_17_.length + i_21_ * (-1076273789 * (((Class556) class556).anInt6321) * is_17_.length));
								i_22_ = (is_17_.length * i_10_ + (is_17_.length * (((Class556) class556).anInt6321 * -1076273789) * i_22_));
								i_21_ += i_13_;
								i_22_ += i_13_;
								i_21_ %= (((Class556) class556).aByteArray6322).length;
								i_22_ %= (((Class556) class556).aByteArray6322).length;
								for (int i_23_ = 0; i_23_ < is_17_.length; i_23_++) {
									is_17_[i_23_] = (((Class556) class556).aByteArray6322[i_21_ + i_23_]);
									i_19_ |= (is_17_[i_23_] & 0xff) << 8 * i_23_;
								}
								for (int i_24_ = 0; i_24_ < is_17_.length; i_24_++) {
									is_17_[i_24_] = (((Class556) class556).aByteArray6322[i_22_ + i_24_]);
									i_20_ |= (is_17_[i_24_] & 0xff) << i_24_ * 8;
								}
								float f_25_ = f - f_18_;
								if (f_25_ < 0.0F || f_25_ > 1.0F)
									throw new RuntimeException("");
								float f_26_ = (float) (i_20_ - i_19_);
								i_15_ = (short) (int) (f_25_ * f_26_ + (float) i_19_);
								i_10_ = ++i_10_ % (-1076273789 * (((Class556) class556).anInt6321));
								if (i_10_ == 0)
									d_9_++;
							} else {
								byte[] is_27_ = ((Class556) class556).aByteArray6323;
								for (int i_28_ = 0; i_28_ < is_27_.length; i_28_++) {
									is_27_[i_28_] = (((Class556) class556).aByteArray6322[(i_28_ + (((Class556) class556).anInt6330 * 1309562285))]);
									i_15_ |= (is_27_[i_28_] & 0xff) << i_28_ * 8;
								}
								((Class556) class556).anInt6330 += i_8_ * 1097586213;
								Class556 class556_29_;
								((Class556) (class556_29_ = class556)).anInt6330 = (1097586213 * (((Class556) class556_29_).anInt6330 * 1309562285 % (((Class556) class556).aByteArray6322).length));
								((Class556) class556).anInt6328 += -2032935595 * i_8_;
							}
							i_15_ += i_14_;
							if (i_15_ > 32767)
								i_15_ = (short) 32767;
							if (i_15_ < -32768)
								i_15_ = (short) -32768;
							((Class560) this).aByteArray6338[i_6_] = (byte) i_15_;
							((Class560) this).aByteArray6338[i_6_ + 1] = (byte) (i_15_ >> 8);
							i_6_ += i_4_;
							i_6_ %= ((Class560) this).aByteArray6338.length;
						}
						if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
							double d_30_ = (double) i_2_ * (d_12_ / d_11_);
							int i_31_ = (int) (d * Math.ceil(d_30_ / d));
							((Class556) class556).anInt6330 += i_31_ * 1097586213;
							Class556 class556_32_;
							((Class556) (class556_32_ = class556)).anInt6330 = (((Class556) class556_32_).anInt6330 * 1309562285 % (((Class556) class556).aByteArray6322).length * 1097586213);
							((Class556) class556).anInt6328 += -2032935595 * i_31_;
						}
					}
				}
				((Class560) this).anInt6341 = i_2_ * 645064571;
			}
		}
	}

	void method6608(Class556 class556, short i) {
		((Class560) this).aList6343.add(class556);
	}

	void method6609() {
		if (((Class560) this).aBool6337) {
			if (null != ((Class560) this).aSourceDataLine6339)
				((Class560) this).anInt6340 = (((Class560) this).aSourceDataLine6339.available() * 732205997);
		}
	}

	void method6610() {
		if (((Class560) this).aBool6337) {
			if (null != ((Class560) this).aSourceDataLine6339)
				((Class560) this).anInt6340 = (((Class560) this).aSourceDataLine6339.available() * 732205997);
		}
	}

	Class560(Class289_Sub1 class289_sub1, float f, int i) {
		((Class560) this).this$0 = class289_sub1;
		((Class560) this).anInt6344 = -1625257040;
		((Class560) this).anInt6345 = -570073914;
		((Class560) this).aList6343 = new ArrayList();
		if (!((Class560) this).aBool6337) {
			((Class560) this).aFloat6346 = f;
			if (724237427 * ((Class560) this).anInt6344 > 16)
				throw new RuntimeException("");
			try {
				AudioFormat audioformat = new AudioFormat(((Class560) this).aFloat6346, 724237427 * ((Class560) this).anInt6344, ((Class560) this).anInt6345 * 638665547, true, false);
				try {
					DataLine.Info info = (new DataLine.Info(javax.sound.sampled.SourceDataLine.class, audioformat, i));
					((Class560) this).aSourceDataLine6339 = (SourceDataLine) AudioSystem.getLine(info);
				} catch (IllegalArgumentException illegalargumentexception) {
					return;
				}
				((Class560) this).aSourceDataLine6339.open(audioformat, i);
				((Class560) this).aSourceDataLine6339.start();
			} catch (LineUnavailableException lineunavailableexception) {
				return;
			}
			((Class560) this).aByteArray6338 = new byte[i];
			((Class560) this).aByteArray6347 = new byte[((Class560) this).anInt6344 * 724237427 / 8];
			((Class560) this).anInt6342 = 0;
			((Class560) this).aBool6337 = true;
		}
	}

	void method6611() {
		((Class560) this).anInt6341 = 0;
		method6607((byte) -5);
		int i;
		for (/**/; -1328750669 * ((Class560) this).anInt6341 > 0; ((Class560) this).anInt6341 -= 645064571 * i) {
			i = -1328750669 * ((Class560) this).anInt6341;
			if (i + -1931128179 * ((Class560) this).anInt6342 >= ((Class560) this).aByteArray6338.length)
				i = (((Class560) this).aByteArray6338.length - -1931128179 * ((Class560) this).anInt6342);
			((Class560) this).aSourceDataLine6339.write(((Class560) this).aByteArray6338, -1931128179 * ((Class560) this).anInt6342, i);
			for (int i_33_ = 0; i_33_ < i; i_33_++)
				((Class560) this).aByteArray6338[-1931128179 * ((Class560) this).anInt6342 + i_33_] = (byte) 0;
			((Class560) this).anInt6342 += i * 2065940549;
			((Class560) this).anInt6342 = 2065940549 * (((Class560) this).anInt6342 * -1931128179 % ((Class560) this).aByteArray6338.length);
		}
	}

	void method6612() {
		synchronized (this) {
			int i = 2147483647;
			double d = (double) (638665547 * ((Class560) this).anInt6345 * (724237427 * ((Class560) this).anInt6344 / 8));
			boolean bool = false;
			Iterator iterator = ((Class560) this).aList6343.iterator();
			while (iterator.hasNext()) {
				Class556 class556 = (Class556) iterator.next();
				int i_34_ = (((Class556) class556).aByteArray6322.length - ((Class556) class556).anInt6328 * 63780861);
				if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
					i_34_ *= (((Class560) this).aFloat6346 / ((Class556) class556).aFloat6326);
					i_34_ = (int) (d * Math.ceil((double) i_34_ / d));
				}
				((Class556) class556).anInt6327 = i_34_ * 1356232787;
				if (i_34_ > 0 && i_34_ < i) {
					bool = true;
					i = i_34_;
				}
			}
			if (i > ((Class560) this).anInt6340 * -333035483)
				i = -333035483 * ((Class560) this).anInt6340;
			if (i == 0 || false == bool) {
				/* empty */
			} else {
				int i_35_ = ((Class560) this).anInt6344 * 724237427 / 8;
				Iterator iterator_36_ = ((Class560) this).aList6343.iterator();
				while (iterator_36_.hasNext()) {
					Class556 class556 = (Class556) iterator_36_.next();
					if (((Class556) class556).anInt6327 * -1211724837 >= i) {
						int i_37_ = ((Class560) this).anInt6342 * -1931128179;
						int i_38_ = 0;
						int i_39_ = (-1816809977 * ((Class556) class556).anInt6329 / 8);
						double d_40_ = 0.0;
						int i_41_ = 0;
						double d_42_ = (double) ((Class560) this).aFloat6346;
						double d_43_ = (double) ((Class556) class556).aFloat6326;
						int i_44_ = ((Class556) class556).anInt6330 * 1309562285;
						for (/**/; (-1211724837 * ((Class556) class556).anInt6327 > 0 && i_38_ < i); i_38_ += i_39_) {
							short i_45_ = 0;
							short i_46_ = 0;
							byte[] is = ((Class560) this).aByteArray6347;
							for (int i_47_ = 0; i_47_ < is.length; i_47_++) {
								is[i_47_] = (((Class560) this).aByteArray6338[i_37_ + i_47_]);
								i_45_ |= (is[i_47_] & 0xff) << 8 * i_47_;
							}
							if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
								byte[] is_48_ = ((Class556) class556).aByteArray6323;
								float f = (float) (d_43_ * (d_40_ / d_42_));
								float f_49_ = (float) Math.floor((double) f);
								short i_50_ = 0;
								short i_51_ = 0;
								int i_52_ = (int) Math.floor((double) f);
								int i_53_ = (int) Math.ceil((double) f);
								i_52_ = (i_41_ * is_48_.length + i_52_ * (-1076273789 * (((Class556) class556).anInt6321) * is_48_.length));
								i_53_ = (is_48_.length * i_41_ + (is_48_.length * (((Class556) class556).anInt6321 * -1076273789) * i_53_));
								i_52_ += i_44_;
								i_53_ += i_44_;
								i_52_ %= (((Class556) class556).aByteArray6322).length;
								i_53_ %= (((Class556) class556).aByteArray6322).length;
								for (int i_54_ = 0; i_54_ < is_48_.length; i_54_++) {
									is_48_[i_54_] = (((Class556) class556).aByteArray6322[i_52_ + i_54_]);
									i_50_ |= (is_48_[i_54_] & 0xff) << 8 * i_54_;
								}
								for (int i_55_ = 0; i_55_ < is_48_.length; i_55_++) {
									is_48_[i_55_] = (((Class556) class556).aByteArray6322[i_53_ + i_55_]);
									i_51_ |= (is_48_[i_55_] & 0xff) << i_55_ * 8;
								}
								float f_56_ = f - f_49_;
								if (f_56_ < 0.0F || f_56_ > 1.0F)
									throw new RuntimeException("");
								float f_57_ = (float) (i_51_ - i_50_);
								i_46_ = (short) (int) (f_56_ * f_57_ + (float) i_50_);
								i_41_ = ++i_41_ % (-1076273789 * (((Class556) class556).anInt6321));
								if (i_41_ == 0)
									d_40_++;
							} else {
								byte[] is_58_ = ((Class556) class556).aByteArray6323;
								for (int i_59_ = 0; i_59_ < is_58_.length; i_59_++) {
									is_58_[i_59_] = (((Class556) class556).aByteArray6322[(i_59_ + (((Class556) class556).anInt6330 * 1309562285))]);
									i_46_ |= (is_58_[i_59_] & 0xff) << i_59_ * 8;
								}
								((Class556) class556).anInt6330 += i_39_ * 1097586213;
								Class556 class556_60_;
								((Class556) (class556_60_ = class556)).anInt6330 = (1097586213 * (((Class556) class556_60_).anInt6330 * 1309562285 % (((Class556) class556).aByteArray6322).length));
								((Class556) class556).anInt6328 += -2032935595 * i_39_;
							}
							i_46_ += i_45_;
							if (i_46_ > 32767)
								i_46_ = (short) 32767;
							if (i_46_ < -32768)
								i_46_ = (short) -32768;
							((Class560) this).aByteArray6338[i_37_] = (byte) i_46_;
							((Class560) this).aByteArray6338[i_37_ + 1] = (byte) (i_46_ >> 8);
							i_37_ += i_35_;
							i_37_ %= ((Class560) this).aByteArray6338.length;
						}
						if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
							double d_61_ = (double) i * (d_43_ / d_42_);
							int i_62_ = (int) (d * Math.ceil(d_61_ / d));
							((Class556) class556).anInt6330 += i_62_ * 1097586213;
							Class556 class556_63_;
							((Class556) (class556_63_ = class556)).anInt6330 = (((Class556) class556_63_).anInt6330 * 1309562285 % (((Class556) class556).aByteArray6322).length * 1097586213);
							((Class556) class556).anInt6328 += -2032935595 * i_62_;
						}
					}
				}
				((Class560) this).anInt6341 = i * 645064571;
			}
		}
	}

	void method6613() {
		synchronized (this) {
			int i = 2147483647;
			double d = (double) (638665547 * ((Class560) this).anInt6345 * (724237427 * ((Class560) this).anInt6344 / 8));
			boolean bool = false;
			Iterator iterator = ((Class560) this).aList6343.iterator();
			while (iterator.hasNext()) {
				Class556 class556 = (Class556) iterator.next();
				int i_64_ = (((Class556) class556).aByteArray6322.length - ((Class556) class556).anInt6328 * 63780861);
				if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
					i_64_ *= (((Class560) this).aFloat6346 / ((Class556) class556).aFloat6326);
					i_64_ = (int) (d * Math.ceil((double) i_64_ / d));
				}
				((Class556) class556).anInt6327 = i_64_ * 1356232787;
				if (i_64_ > 0 && i_64_ < i) {
					bool = true;
					i = i_64_;
				}
			}
			if (i > ((Class560) this).anInt6340 * -333035483)
				i = -333035483 * ((Class560) this).anInt6340;
			if (i == 0 || false == bool) {
				/* empty */
			} else {
				int i_65_ = ((Class560) this).anInt6344 * 724237427 / 8;
				Iterator iterator_66_ = ((Class560) this).aList6343.iterator();
				while (iterator_66_.hasNext()) {
					Class556 class556 = (Class556) iterator_66_.next();
					if (((Class556) class556).anInt6327 * -1211724837 >= i) {
						int i_67_ = ((Class560) this).anInt6342 * -1931128179;
						int i_68_ = 0;
						int i_69_ = (-1816809977 * ((Class556) class556).anInt6329 / 8);
						double d_70_ = 0.0;
						int i_71_ = 0;
						double d_72_ = (double) ((Class560) this).aFloat6346;
						double d_73_ = (double) ((Class556) class556).aFloat6326;
						int i_74_ = ((Class556) class556).anInt6330 * 1309562285;
						for (/**/; (-1211724837 * ((Class556) class556).anInt6327 > 0 && i_68_ < i); i_68_ += i_69_) {
							short i_75_ = 0;
							short i_76_ = 0;
							byte[] is = ((Class560) this).aByteArray6347;
							for (int i_77_ = 0; i_77_ < is.length; i_77_++) {
								is[i_77_] = (((Class560) this).aByteArray6338[i_67_ + i_77_]);
								i_75_ |= (is[i_77_] & 0xff) << 8 * i_77_;
							}
							if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
								byte[] is_78_ = ((Class556) class556).aByteArray6323;
								float f = (float) (d_73_ * (d_70_ / d_72_));
								float f_79_ = (float) Math.floor((double) f);
								short i_80_ = 0;
								short i_81_ = 0;
								int i_82_ = (int) Math.floor((double) f);
								int i_83_ = (int) Math.ceil((double) f);
								i_82_ = (i_71_ * is_78_.length + i_82_ * (-1076273789 * (((Class556) class556).anInt6321) * is_78_.length));
								i_83_ = (is_78_.length * i_71_ + (is_78_.length * (((Class556) class556).anInt6321 * -1076273789) * i_83_));
								i_82_ += i_74_;
								i_83_ += i_74_;
								i_82_ %= (((Class556) class556).aByteArray6322).length;
								i_83_ %= (((Class556) class556).aByteArray6322).length;
								for (int i_84_ = 0; i_84_ < is_78_.length; i_84_++) {
									is_78_[i_84_] = (((Class556) class556).aByteArray6322[i_82_ + i_84_]);
									i_80_ |= (is_78_[i_84_] & 0xff) << 8 * i_84_;
								}
								for (int i_85_ = 0; i_85_ < is_78_.length; i_85_++) {
									is_78_[i_85_] = (((Class556) class556).aByteArray6322[i_83_ + i_85_]);
									i_81_ |= (is_78_[i_85_] & 0xff) << i_85_ * 8;
								}
								float f_86_ = f - f_79_;
								if (f_86_ < 0.0F || f_86_ > 1.0F)
									throw new RuntimeException("");
								float f_87_ = (float) (i_81_ - i_80_);
								i_76_ = (short) (int) (f_86_ * f_87_ + (float) i_80_);
								i_71_ = ++i_71_ % (-1076273789 * (((Class556) class556).anInt6321));
								if (i_71_ == 0)
									d_70_++;
							} else {
								byte[] is_88_ = ((Class556) class556).aByteArray6323;
								for (int i_89_ = 0; i_89_ < is_88_.length; i_89_++) {
									is_88_[i_89_] = (((Class556) class556).aByteArray6322[(i_89_ + (((Class556) class556).anInt6330 * 1309562285))]);
									i_76_ |= (is_88_[i_89_] & 0xff) << i_89_ * 8;
								}
								((Class556) class556).anInt6330 += i_69_ * 1097586213;
								Class556 class556_90_;
								((Class556) (class556_90_ = class556)).anInt6330 = (1097586213 * (((Class556) class556_90_).anInt6330 * 1309562285 % (((Class556) class556).aByteArray6322).length));
								((Class556) class556).anInt6328 += -2032935595 * i_69_;
							}
							i_76_ += i_75_;
							if (i_76_ > 32767)
								i_76_ = (short) 32767;
							if (i_76_ < -32768)
								i_76_ = (short) -32768;
							((Class560) this).aByteArray6338[i_67_] = (byte) i_76_;
							((Class560) this).aByteArray6338[i_67_ + 1] = (byte) (i_76_ >> 8);
							i_67_ += i_65_;
							i_67_ %= ((Class560) this).aByteArray6338.length;
						}
						if (((Class556) class556).aFloat6326 != ((Class560) this).aFloat6346) {
							double d_91_ = (double) i * (d_73_ / d_72_);
							int i_92_ = (int) (d * Math.ceil(d_91_ / d));
							((Class556) class556).anInt6330 += i_92_ * 1097586213;
							Class556 class556_93_;
							((Class556) (class556_93_ = class556)).anInt6330 = (((Class556) class556_93_).anInt6330 * 1309562285 % (((Class556) class556).aByteArray6322).length * 1097586213);
							((Class556) class556).anInt6328 += -2032935595 * i_92_;
						}
					}
				}
				((Class560) this).anInt6341 = i * 645064571;
			}
		}
	}

	void method6614(byte i) {
		if (((Class560) this).aBool6337) {
			if (null != ((Class560) this).aSourceDataLine6339)
				((Class560) this).anInt6340 = (((Class560) this).aSourceDataLine6339.available() * 732205997);
		}
	}

	void method6615(Class556 class556, short i) {
		((Class560) this).aList6343.remove(class556);
	}

	static final void method6616(Cs2Executor class441, int i) {
		int i_94_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub14 class572_sub12_sub14 = Class100.aClass616_1298.method7372(i_94_, -1855276221);
		if (class572_sub12_sub14.anIntArray11466 == null)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub14.anIntArray11466.length;
	}

	static final void method6617(Cs2Executor class441, int i) {
		if ((Class133_Sub1.aClass411_Sub1_9827.method4994(1480498910) != Class413.aClass413_4915) || (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 20) != Class416.aClass416_4935))
			throw new RuntimeException();
		Class240 class240 = ((Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -91)).method9316(-1792641369);
		Class240 class240_95_ = ((Class658_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040)).method8978(-483618225);
		Class240 class240_96_ = Class240.method3276(class240);
		class240_96_.method3266(class240_95_);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) class240_96_.method3301();
	}

	static final void method6618(Class572_Sub15_Sub2 class572_sub15_sub2, int i, int i_97_) {
		Class184.anInt2164 = 0;
		Class412.method5073(class572_sub15_sub2, 1843967636);
		Class14.method639(class572_sub15_sub2, (byte) -116);
		if (-1585139053 * class572_sub15_sub2.o != i)
			throw new RuntimeException(new StringBuilder().append(-1585139053 * class572_sub15_sub2.o).append(" ").append(i).toString());
	}
}

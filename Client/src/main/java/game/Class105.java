package game;

/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class105 {
	public Class657 aClass657_1385 = new Class657();
	public static final int anInt1386 = 8191;

	static void method1655(int i) {
		if (Class460.anIntArray5213 == null) {
			Class460.anIntArray5213 = new int[65536];
			Class460.anIntArray5210 = new int[65536];
			double d = 0.7 + (Math.random() * 0.03 - 0.015);
			for (int i_0_ = 0; i_0_ < 65536; i_0_++) {
				double d_1_ = 0.0078125 + (double) (i_0_ >> 10 & 0x3f) / 64.0;
				double d_2_ = (double) (i_0_ >> 7 & 0x7) / 8.0 + 0.0625;
				double d_3_ = (double) (i_0_ & 0x7f) / 128.0;
				double d_4_ = d_3_;
				double d_5_ = d_3_;
				double d_6_ = d_3_;
				if (d_2_ != 0.0) {
					double d_7_;
					if (d_3_ < 0.5)
						d_7_ = (1.0 + d_2_) * d_3_;
					else
						d_7_ = d_3_ + d_2_ - d_3_ * d_2_;
					double d_8_ = 2.0 * d_3_ - d_7_;
					double d_9_ = 0.3333333333333333 + d_1_;
					if (d_9_ > 1.0)
						d_9_--;
					double d_10_ = d_1_;
					double d_11_ = d_1_ - 0.3333333333333333;
					if (d_11_ < 0.0)
						d_11_++;
					if (d_9_ * 6.0 < 1.0)
						d_4_ = d_8_ + d_9_ * (6.0 * (d_7_ - d_8_));
					else if (2.0 * d_9_ < 1.0)
						d_4_ = d_7_;
					else if (3.0 * d_9_ < 2.0)
						d_4_ = 6.0 * ((d_7_ - d_8_) * (0.6666666666666666 - d_9_)) + d_8_;
					else
						d_4_ = d_8_;
					if (6.0 * d_10_ < 1.0)
						d_5_ = d_10_ * ((d_7_ - d_8_) * 6.0) + d_8_;
					else if (d_10_ * 2.0 < 1.0)
						d_5_ = d_7_;
					else if (d_10_ * 3.0 < 2.0)
						d_5_ = d_8_ + ((0.6666666666666666 - d_10_) * (d_7_ - d_8_) * 6.0);
					else
						d_5_ = d_8_;
					if (6.0 * d_11_ < 1.0)
						d_6_ = 6.0 * (d_7_ - d_8_) * d_11_ + d_8_;
					else if (2.0 * d_11_ < 1.0)
						d_6_ = d_7_;
					else if (d_11_ * 3.0 < 2.0)
						d_6_ = 6.0 * ((d_7_ - d_8_) * (0.6666666666666666 - d_11_)) + d_8_;
					else
						d_6_ = d_8_;
				}
				d_4_ = Math.pow(d_4_, d);
				d_5_ = Math.pow(d_5_, d);
				d_6_ = Math.pow(d_6_, d);
				int i_12_ = (int) (d_4_ * 256.0);
				int i_13_ = (int) (256.0 * d_5_);
				int i_14_ = (int) (d_6_ * 256.0);
				int i_15_ = (i_13_ << 8) + (i_12_ << 16) + i_14_;
				Class460.anIntArray5213[i_0_] = i_15_ & 0xffffff;
				int i_16_ = i_12_ + ((i_13_ << 8) + (i_14_ << 16));
				Class460.anIntArray5210[i_0_] = i_16_;
			}
		}
	}

	static final void method1656(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class465.method5493(class73, class83, class441, (short) -25206);
	}

	static final void method1657(InterfaceDefinitions class73, Cs2Executor class441, byte i) {
		int i_17_ = 10;
		Class241.method3322(class73, i_17_, class441, (byte) -102);
	}

	static final void method1658(Cs2Executor class441, int i) {
		if (null != client.aString8887)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = Class457.method5424(client.aString8887, 178787611);
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}

	static final void method1659(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub6_9222.method8156((short) 4095);
	}
}

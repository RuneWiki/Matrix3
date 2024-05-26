package game;

/* Class540 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class540 {
	Class248 aClass248_6061;
	Class127 aClass127_6062 = new Class127(20);
	public static Class267 aClass267_6063;

	void method6403(int i) {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2231((byte) -123);
		}
	}

	void method6404() {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2231((byte) -83);
		}
	}

	void method6405(int i, int i_0_) {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2235(i, 1976252830);
		}
	}

	void method6406(byte i) {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2234((byte) 19);
		}
	}

	void method6407() {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2234((byte) 15);
		}
	}

	void method6408() {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2231((byte) -59);
		}
	}

	void method6409() {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2231((byte) -76);
		}
	}

	void method6410(int i) {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2235(i, 1312450311);
		}
	}

	Class540(Class248 class248) {
		((Class540) this).aClass248_6061 = class248;
	}

	void method6411() {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2234((byte) -77);
		}
	}

	void method6412() {
		synchronized (((Class540) this).aClass127_6062) {
			((Class540) this).aClass127_6062.method2234((byte) 27);
		}
	}

	public static void method6413(int[] is, Object[] objects, int i, int i_1_, byte i_2_) {
		if (i < i_1_) {
			int i_3_ = (i + i_1_) / 2;
			int i_4_ = i;
			int i_5_ = is[i_3_];
			is[i_3_] = is[i_1_];
			is[i_1_] = i_5_;
			Object object = objects[i_3_];
			objects[i_3_] = objects[i_1_];
			objects[i_1_] = object;
			int i_6_ = i_5_ == 2147483647 ? 0 : 1;
			for (int i_7_ = i; i_7_ < i_1_; i_7_++) {
				if (is[i_7_] < i_5_ + (i_7_ & i_6_)) {
					int i_8_ = is[i_7_];
					is[i_7_] = is[i_4_];
					is[i_4_] = i_8_;
					Object object_9_ = objects[i_7_];
					objects[i_7_] = objects[i_4_];
					objects[i_4_++] = object_9_;
				}
			}
			is[i_1_] = is[i_4_];
			is[i_4_] = i_5_;
			objects[i_1_] = objects[i_4_];
			objects[i_4_] = object;
			method6413(is, objects, i, i_4_ - 1, (byte) 6);
			method6413(is, objects, 1 + i_4_, i_1_, (byte) 62);
		}
	}

	static final void method6414(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		int i_10_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class575.method6827(i_10_, (short) -20204);
	}

	static final void method6415(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_11_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_12_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		Class664 class664 = Class547.method6493(i_11_ >> 14 & 0x3fff, i_11_ & 0x3fff);
		boolean bool = false;
		for (Class572_Sub12_Sub5 class572_sub12_sub5 = (Class572_Sub12_Sub5) class664.method7848(-1042067865); class572_sub12_sub5 != null; class572_sub12_sub5 = (Class572_Sub12_Sub5) class664.method7845(-988941232)) {
			if (-2130748737 * class572_sub12_sub5.anInt11325 == i_12_) {
				bool = true;
				break;
			}
		}
		if (bool)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method6416(Cs2Executor class441, byte i) {
		NPC class456_sub1_sub2_sub3_sub1 = ((NPC) ((Cs2Executor) class441).entity);
		NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
		if (null != class410.anIntArray4795)
			class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -447522412);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = null != class410 ? 1 : 0;
	}

	public static final void method6417(byte i) {
		if (client.anInt8690 * 996160277 != -1 && -1 != client.anInt8711 * -2091123823) {
			int i_13_ = ((((client.anInt8696 * -1394587525 - client.anInt8709 * -1411159733) * (366719231 * client.anInt8651)) >> 16) + client.anInt8709 * -1411159733);
			client.anInt8651 += i_13_ * -2000466177;
			if (366719231 * client.anInt8651 >= 65535) {
				client.anInt8651 = -969166591;
				if (!client.aBool8698)
					client.aBool8697 = true;
				else
					client.aBool8697 = false;
				client.aBool8698 = true;
			} else {
				client.aBool8697 = false;
				client.aBool8698 = false;
			}
			float f = (float) (366719231 * client.anInt8651) / 65535.0F;
			float[] fs = new float[3];
			int i_14_ = 1420329210 * client.anInt8692;
			for (int i_15_ = 0; i_15_ < 3; i_15_++) {
				int i_16_ = 3 * (client.anIntArrayArrayArray8689[client.anInt8690 * 996160277][i_14_][i_15_]);
				int i_17_ = 3 * (client.anIntArrayArrayArray8689[996160277 * client.anInt8690][i_14_ + 1][i_15_]);
				int i_18_ = (((client.anIntArrayArrayArray8689[996160277 * client.anInt8690][i_14_ + 2][i_15_]) - ((client.anIntArrayArrayArray8689[996160277 * client.anInt8690][i_14_ + 3][i_15_]) - (client.anIntArrayArrayArray8689[client.anInt8690 * 996160277][i_14_ + 2][i_15_]))) * 3);
				int i_19_ = (client.anIntArrayArrayArray8689[996160277 * client.anInt8690][i_14_][i_15_]);
				int i_20_ = i_17_ - i_16_;
				int i_21_ = i_16_ - i_17_ * 2 + i_18_;
				int i_22_ = ((client.anIntArrayArrayArray8689[996160277 * client.anInt8690][i_14_ + 2][i_15_]) - i_19_ + i_17_ - i_18_);
				fs[i_15_] = (float) i_19_ + f * ((float) i_20_ + f * (f * (float) i_22_ + (float) i_21_));
			}
			Class497 class497 = client.aClass613_8605.method7280((byte) -97);
			Class36.anInt387 = 70707251 * ((int) fs[0] - class497.localX * -2077331968);
			Class572_Sub13_Sub2.anInt11451 = (int) fs[1] * 371247041;
			Class49.anInt490 = (((int) fs[2] - class497.localY * -1078397440) * -114706035);
			float[] fs_23_ = new float[3];
			int i_24_ = client.anInt8824 * 999430618;
			for (int i_25_ = 0; i_25_ < 3; i_25_++) {
				int i_26_ = ((client.anIntArrayArrayArray8689[client.anInt8711 * -2091123823][i_24_][i_25_]) * 3);
				int i_27_ = ((client.anIntArrayArrayArray8689[-2091123823 * client.anInt8711][1 + i_24_][i_25_]) * 3);
				int i_28_ = 3 * ((client.anIntArrayArrayArray8689[client.anInt8711 * -2091123823][i_24_ + 2][i_25_]) - ((client.anIntArrayArrayArray8689[-2091123823 * client.anInt8711][i_24_ + 3][i_25_]) - (client.anIntArrayArrayArray8689[client.anInt8711 * -2091123823][2 + i_24_][i_25_])));
				int i_29_ = (client.anIntArrayArrayArray8689[-2091123823 * client.anInt8711][i_24_][i_25_]);
				int i_30_ = i_27_ - i_26_;
				int i_31_ = i_26_ - 2 * i_27_ + i_28_;
				int i_32_ = ((client.anIntArrayArrayArray8689[client.anInt8711 * -2091123823][2 + i_24_][i_25_]) - i_29_ + i_27_ - i_28_);
				fs_23_[i_25_] = (float) i_29_ + (f * ((float) i_32_ * f + (float) i_31_) + (float) i_30_) * f;
			}
			float f_33_ = fs_23_[0] - fs[0];
			float f_34_ = (fs_23_[1] - fs[1]) * -1.0F;
			float f_35_ = fs_23_[2] - fs[2];
			double d = Math.sqrt((double) (f_33_ * f_33_ + f_35_ * f_35_));
			Class455.anInt5187 = ((int) (Math.atan2((double) f_34_, d) * 2607.5945876176133) & 0x3fff) * 58615007;
			Class406.anInt4765 = ((int) (-Math.atan2((double) f_33_, (double) f_35_) * 2607.5945876176133) & 0x3fff) * 1259382101;
			Class88.anInt1225 = (-1263582291 * ((client.anIntArrayArrayArray8689[client.anInt8690 * 996160277][i_14_][3]) + ((366719231 * client.anInt8651 * ((client.anIntArrayArrayArray8689[client.anInt8690 * 996160277][2 + i_14_][3]) - (client.anIntArrayArrayArray8689[996160277 * client.anInt8690][i_14_][3]))) >> 16)));
		}
	}

	static final void method6418(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		Class527.method6313(((String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr])), (String) (((Cs2Executor) class441).objectStack[1 + (((Cs2Executor) class441).objectStackPtr * 1628307581)]), "", (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1, false, 1019967701);
	}

	static final void method6419(Cs2Executor class441, byte i) {
		Class335_Sub1.anInt9694 = 0;
	}
}

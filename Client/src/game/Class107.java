package game;

/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class107 {
	int anInt1421;
	public int anInt1422;
	public int anInt1423;
	public int anInt1424;

	Class107(int i, int i_0_, int i_1_, int i_2_) {
		anInt1422 = i * -936897757;
		anInt1423 = i_0_ * 445612357;
		((Class107) this).anInt1421 = -1210683659 * i_1_;
		anInt1424 = 1567458085 * i_2_;
	}

	Class107 method2057(int i, byte i_3_) {
		return new Class107(1294185611 * anInt1422, i, -1332589219 * ((Class107) this).anInt1421, anInt1424 * 736551085);
	}

	static void method2058(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 2] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 2]), 970984754))).anIntArray4627[(((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1])]);
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}

	static final void method2059(Cs2Executor class441, int i) {
		Class2.method477(297457797);
	}

	public static void method2060(int i) {
		if (Class554.aFrame6320 == null) {
			int i_4_ = 954583035 * client.anInt7748;
			int i_5_ = client.anInt7760 * 2077319943;
			int i_6_ = (-1987897329 * Class656.anInt8418 - 1960824389 * Class269.anInt2861 - i_4_);
			int i_7_ = (-257945127 * Class287.anInt3421 - client.anInt7739 * -530390519 - i_5_);
			if (i_4_ > 0 || i_6_ > 0 || i_5_ > 0 || i_7_ > 0) {
				try {
					Container container = Class591_Sub5.method8786((byte) 5);
					int i_8_ = 0;
					int i_9_ = 0;
					if (Class18.aFrame142 == container) {
						Insets insets = Class18.aFrame142.getInsets();
						i_8_ = insets.left;
						i_9_ = insets.top;
					}
					Graphics graphics = container.getGraphics();
					graphics.setColor(Color.black);
					if (i_4_ > 0)
						graphics.fillRect(i_8_, i_9_, i_4_, -257945127 * Class287.anInt3421);
					if (i_5_ > 0)
						graphics.fillRect(i_8_, i_9_, -1987897329 * Class656.anInt8418, i_5_);
					if (i_6_ > 0)
						graphics.fillRect((Class656.anInt8418 * -1987897329 + i_8_ - i_6_), i_9_, i_6_, Class287.anInt3421 * -257945127);
					if (i_7_ > 0)
						graphics.fillRect(i_8_, (Class287.anInt3421 * -257945127 + i_9_ - i_7_), Class656.anInt8418 * -1987897329, i_7_);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
	}

	static void method2061(InterfaceDefinitions class73, int i, int i_10_, int i_11_) {
		Class71 class71 = class73.method1099(Class272_Sub2.aClass106_9517, -682438025);
		if (class71 != null) {
			Class272_Sub2.aClass106_9517.method1715(i, i_10_, 669238293 * class73.anInt764 + i, i_10_ + 1360982075 * class73.anInt765);
			if (Class192.anInt2304 * -229939747 < 3) {
				int i_12_;
				if (625220759 * Class18.anInt143 == 1)
					i_12_ = (int) -((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133);
				else
					i_12_ = (int) -client.aFloat8678;
				i_12_ = -1555276706 * client.anInt8766 + i_12_ & 0x3fff;
				i_12_ <<= 2;
				Class121.aClass161_1478.method2605((float) i + (float) (class73.anInt764 * 669238293) / 2.0F, ((float) (class73.anInt765 * 1360982075) / 2.0F + (float) i_10_), 4290, i_12_, class71.aClass167_709, i, i_10_);
			} else
				Class272_Sub2.aClass106_9517.method2029(-16777216, class71.aClass167_709, i, i_10_);
		}
	}
}

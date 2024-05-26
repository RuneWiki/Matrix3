package game;

/* Class491 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.Iterator;
import java.util.List;

public class Class491 {
	static int anInt5466;
	static List aList5467;
	static Class676 aClass676_5468;
	static Class676 aClass676_5469;
	static Class485[] aClass485Array5470;
	static int anInt5471;
	static int anInt5472;
	static Class591_Sub2_Sub1_Sub1[] aClass591_Sub2_Sub1_Sub1Array5473;
	static int anInt5474;
	static Interface37 anInterface37_5475;
	static Class309[] aClass309Array5476;
	static int anInt5477;
	static int anInt5478 = 0;
	static int anInt5479;
	static int anInt5480;
	static int anInt5481;

	static {
		anInt5474 = 0;
		anInt5479 = 0;
		anInt5472 = 0;
		anInt5466 = 0;
		anInt5471 = 0;
		aClass309Array5476 = new Class309[16];
		anInt5477 = 0;
		aClass676_5469 = new Class676(16);
		aClass676_5468 = new Class676(8);
		anInt5480 = 0;
		anInt5481 = -2124418674;
	}

	static int method5853(int i) {
		LinkableInt class572_sub26 = (LinkableInt) aClass676_5469.get((long) i);
		if (null == class572_sub26) {
			Class309 class309 = anInterface37_5475.method212(i, -715437563);
			if (null == class309 || 2 != -1090340769 * class309.anInt3638)
				return -1;
			class572_sub26 = new LinkableInt(58165719 * anInt5477);
			aClass676_5469.put(class572_sub26, (long) i);
			aClass309Array5476[(anInt5477 += -781944345) * 58165719 - 1] = class309;
		}
		return class572_sub26.anInt9258 * -1945426987;
	}

	public static void method5854(int i) {
		if (i < 0 || i > 2)
			i = 0;
		anInt5481 = i * -1062209337;
		aClass485Array5470 = new Class485[1 + (Class100.anIntArray1291[anInt5481 * -1664530185])];
		anInt5479 = 0;
		anInt5472 = 0;
	}

	public static void method5855(int i) {
		if (i < 0 || i > 2)
			i = 0;
		anInt5481 = i * -1062209337;
		aClass485Array5470 = new Class485[1 + (Class100.anIntArray1291[anInt5481 * -1664530185])];
		anInt5479 = 0;
		anInt5472 = 0;
	}

	static int method5856(int i) {
		LinkableInt class572_sub26 = (LinkableInt) aClass676_5469.get((long) i);
		if (null == class572_sub26) {
			Class309 class309 = anInterface37_5475.method212(i, -92174652);
			if (null == class309 || 2 != -1090340769 * class309.anInt3638)
				return -1;
			class572_sub26 = new LinkableInt(58165719 * anInt5477);
			aClass676_5469.put(class572_sub26, (long) i);
			aClass309Array5476[(anInt5477 += -781944345) * 58165719 - 1] = class309;
		}
		return class572_sub26.anInt9258 * -1945426987;
	}

	public static void method5857() {
		aClass676_5468 = new Class676(8);
		anInt5480 = 0;
		Iterator iterator = aList5467.iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			class485.method5785();
		}
	}

	Class491() throws Throwable {
		throw new Error();
	}

	public static void method5858(int i) {
		if (i < 0 || i > 2)
			i = 0;
		anInt5481 = i * -1062209337;
		aClass485Array5470 = new Class485[1 + (Class100.anIntArray1291[anInt5481 * -1664530185])];
		anInt5479 = 0;
		anInt5472 = 0;
	}

	public static void method5859() {
		aClass676_5468 = new Class676(8);
		anInt5480 = 0;
		Iterator iterator = aList5467.iterator();
		while (iterator.hasNext()) {
			Class485 class485 = (Class485) iterator.next();
			class485.method5785();
		}
	}

	public static int method5860() {
		return -1664530185 * anInt5481;
	}

	static int method5861(String string, byte[] is, int i, int i_0_) {
		int i_1_ = i;
		int i_2_ = string.length();
		for (int i_3_ = 0; i_3_ < i_2_; i_3_ += 4) {
			int i_4_ = Class528.method6323(string.charAt(i_3_), -2119353288);
			int i_5_ = (1 + i_3_ < i_2_ ? Class528.method6323(string.charAt(i_3_ + 1), -1100341376) : -1);
			int i_6_ = (2 + i_3_ < i_2_ ? Class528.method6323(string.charAt(2 + i_3_), -2023507845) : -1);
			int i_7_ = (3 + i_3_ < i_2_ ? Class528.method6323(string.charAt(3 + i_3_), -1409538151) : -1);
			is[i++] = (byte) (i_4_ << 2 | i_5_ >>> 4);
			if (i_6_ == -1)
				break;
			is[i++] = (byte) ((i_5_ & 0xf) << 4 | i_6_ >>> 2);
			if (-1 == i_7_)
				break;
			is[i++] = (byte) ((i_6_ & 0x3) << 6 | i_7_);
		}
		return i - i_1_;
	}

	public static int method5862(int i, int i_8_, byte i_9_) {
		if (-839505981 * JS5ConfigGroup.aClass484_2593.anInt5400 == -1)
			return 1;
		if (i != Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1658703999)) {
			Class572_Sub12_Sub2.method10231(i, Class279.aClass279_3049.method3758(Class594.aClass435_7823, 16711935), true, -2124734398);
			if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1814520572) != i)
				return -1;
		}
		int i_10_;
		try {
			Dimension dimension = client.aCanvas7745.getSize();
			Class677.method7987(Class279.aClass279_3049.method3758(Class594.aClass435_7823, 16711935), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 790633022);
			Class159 class159 = Class159.method2569(Class489.aClass248_5463, (JS5ConfigGroup.aClass484_2593.anInt5400 * -839505981), 0);
			//System.out.println("DAFDAAS");
			long l = Class69.method1067(-2010411964);
			Class272_Sub2.aClass106_9517.method1714();
			client.aClass261_8582.method3588(0.0F, 256.0F, 0.0F);
			Class272_Sub2.aClass106_9517.method1761(client.aClass261_8582);
			Class250 class250 = Class272_Sub2.aClass106_9517.method1752();
			class250.method3452((float) (dimension.width / 2), (float) (dimension.height / 2), 512.0F, 512.0F, (float) client.aClass613_8605.method7284(2042990379), (float) client.aClass613_8605.method7313((byte) -89), (float) dimension.width, (float) dimension.height);
			Class272_Sub2.aClass106_9517.method1764(class250);
			Class272_Sub2.aClass106_9517.method1709(1.0F);
			Class272_Sub2.aClass106_9517.method1767(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			Model model = Class272_Sub2.aClass106_9517.method1755(class159, 2048, 64, 64, 768);
			int i_11_ = 0;
			while_37_: for (int i_12_ = 0; i_12_ < 500; i_12_++) {
				Class272_Sub2.aClass106_9517.method1719(3, 0);
				for (int i_13_ = 15; i_13_ >= 0; i_13_--) {
					for (int i_14_ = 0; i_14_ <= i_13_; i_14_++) {
						client.aClass261_8640.method3588((float) (int) (((float) i_14_ - (float) i_13_ / 2.0F) * 512.0F), 0.0F, (float) (512 * (1 + i_13_)));
						model.method1375(client.aClass261_8640, null, 0);
						i_11_++;
						if (Class69.method1067(-1878565169) - l >= (long) i_8_)
							break while_37_;
					}
				}
			}
			Class272_Sub2.aClass106_9517.method2017();
			long l_15_ = ((long) (1000 * i_11_) / (Class69.method1067(-1877062346) - l));
			Class272_Sub2.aClass106_9517.method1719(3, 0);
			i_10_ = (int) l_15_;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return -1;
		}
		return i_10_;
	}

	static void method5863(int i, int i_16_, int i_17_, int i_18_, boolean bool, short i_19_) {
		if (Class637.aBool8266 && Class554.aFrame6320 != null && (i_16_ != 3 || 1646956835 * client.anInt7740 != i_17_ || -1374841549 * Class15.anInt126 != i_18_)) {
			Class391.method4721(Class4.aClass672_30, Class554.aFrame6320, (byte) 1);
			Class554.aFrame6320 = null;
		}
		if (Class637.aBool8266 && 3 == i_16_ && Class554.aFrame6320 == null) {
			Class554.aFrame6320 = Class133_Sub3.method9338(Class4.aClass672_30, i_17_, i_18_, 0, 0, 958742109);
			if (Class554.aFrame6320 != null) {
				client.anInt7740 = i_17_ * -355981685;
				Class15.anInt126 = 1597533691 * i_18_;
				Class623.method7443(-2009137172);
			}
		}
		if (3 == i_16_ && (!Class637.aBool8266 || null == Class554.aFrame6320))
			method5863(i, Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(-1723743672), -1, -1, true, (short) -20446);
		else {
			Container container = Class591_Sub5.method8786((byte) -27);
			if (Class554.aFrame6320 != null) {
				Class656.anInt8418 = -276769041 * i_17_;
				Class287.anInt3421 = 1011048041 * i_18_;
			} else if (Class18.aFrame142 != null) {
				Insets insets = Class18.aFrame142.getInsets();
				Class656.anInt8418 = (Class18.aFrame142.getSize().width - (insets.right + insets.left)) * -276769041;
				Class287.anInt3421 = (Class18.aFrame142.getSize().height - (insets.bottom + insets.top)) * 1011048041;
			} else {
				Class656.anInt8418 = container.getSize().width * -276769041;
				Class287.anInt3421 = container.getSize().height * 1011048041;
			}
			if (Class656.anInt8418 * -1987897329 <= 0)
				Class656.anInt8418 = -276769041;
			if (-257945127 * Class287.anInt3421 <= 0)
				Class287.anInt3421 = 1011048041;
			if (i_16_ != 1)
				Class359.method4441(305605547);
			else {
				Class269.anInt2861 = 1590466979 * client.anInt8724;
				client.anInt7748 = (Class656.anInt8418 * -1987897329 - client.anInt8724 * -507276561) / 2 * -1186583757;
				client.anInt7739 = client.anInt8725 * 1464439409;
				client.anInt7760 = 0;
			}
			if (Class151.aClass434_1702 != Class434.aClass434_5044 && 1960824389 * Class269.anInt2861 < 1024 && client.anInt7739 * -530390519 >= 768) {
				/* empty */
			}
			if (!bool) {
				client.aCanvas7745.setSize(Class269.anInt2861 * 1960824389, -530390519 * client.anInt7739);
				Class272_Sub2.aClass106_9517.method1689(client.aCanvas7745, Class269.anInt2861 * 1960824389, -530390519 * client.anInt7739, -1388193634);
				if (Class18.aFrame142 == container) {
					Insets insets = Class18.aFrame142.getInsets();
					client.aCanvas7745.setLocation(insets.left + client.anInt7748 * 954583035, insets.top + 2077319943 * client.anInt7760);
				} else
					client.aCanvas7745.setLocation((954583035 * client.anInt7748), (2077319943 * client.anInt7760));
			} else
				Class133_Sub3.method9336(-12506425);
			if (i_16_ >= 2)
				client.aBool8721 = true;
			else
				client.aBool8721 = false;
			Class2.method476((byte) 50);
			if (client.anInt8790 * -507155049 != -1)
				Class288.method3884(true, (byte) 21);
			if (Class166.method2676((byte) 82).method2933(-2013354085) != null && (Class435.method5266(client.anInt8580 * 835742603, (byte) -76) || Class19.method692(835742603 * client.anInt8580, (byte) 4)))
				Class627.method7476(Class166.method2676((byte) 82), (byte) -75);
			for (int i_20_ = 0; i_20_ < 107; i_20_++)
				client.aBoolArray8784[i_20_] = true;
			client.aBool7746 = true;
		}
	}

	public static void method5864(float f, Class240 class240, Class230 class230, Class240 class240_21_, Class240 class240_22_, Class240 class240_23_, float f_24_, float f_25_, float f_26_, byte i) {
		if (!class240_21_.method3271(class240)) {
			Class240 class240_27_ = Class240.method3316(0.0F, 0.0F, 0.0F);
			Class240 class240_28_ = Class240.method3276(Class240.method3277(class240_21_, class240));
			class240_28_.method3288(class230);
			Class240 class240_29_ = Class240.method3277(class240_28_, class240_27_);
			float f_30_ = class240_29_.method3301();
			if (Float.POSITIVE_INFINITY == class240_23_.aFloat2653 || Float.isNaN(class240.aFloat2653) || f_30_ > f_25_ || f_30_ < f_26_) {
				class240.method3269(class240_21_);
				class240_22_.method3270();
			} else {
				class230.method3175();
				Class240 class240_31_ = Class240.method3316(1.0F, 0.0F, 0.0F);
				Class240 class240_32_ = Class240.method3316(0.0F, 1.0F, 0.0F);
				Class240 class240_33_ = Class240.method3316(0.0F, 0.0F, 1.0F);
				class240_31_.method3288(class230);
				class240_32_.method3288(class230);
				class240_33_.method3288(class230);
				Class240 class240_34_ = Class240.method3316(Class240.method3275(class240_31_, class240_22_), Class240.method3275(class240_32_, class240_22_), Class240.method3275(class240_33_, class240_22_));
				Class240 class240_35_ = Class240.method3276(class240_34_);
				Class240 class240_36_ = (Class240.method3316(class240_23_.aFloat2653 * class240_29_.aFloat2653, class240_23_.aFloat2656 * class240_29_.aFloat2656, class240_29_.aFloat2657 * class240_23_.aFloat2657));
				class240_35_.method3274(class240_36_, f);
				class240_35_.method3286(f_24_);
				Class240 class240_37_ = Class240.method3287(class240_31_, class240_35_.aFloat2653);
				class240_37_.method3274(class240_32_, class240_35_.aFloat2656);
				class240_37_.method3274(class240_33_, class240_35_.aFloat2657);
				class240_22_.method3269(class240_37_);
				class240.method3305(Class240.method3287(class240_22_, f));
			}
		}
	}
}

package game;

/* Class569 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

import java.util.Calendar;

public class Class569 {
	public static Class569 aClass569_6389;
	static Class569 aClass569_6390;
	public static Class569 aClass569_6391;
	public static Class569 aClass569_6392 = new Class569(false, false);
	static Class569 aClass569_6393;
	public static Class569 aClass569_6394 = new Class569(true, false);
	static Class569 aClass569_6395;
	public static Class569 aClass569_6396;
	boolean aBool6397;
	boolean aBool6398;

	public boolean method6751() {
		return ((Class569) this).aBool6398;
	}

	static {
		aClass569_6391 = new Class569(false, false);
		aClass569_6396 = new Class569(true, false);
		aClass569_6393 = new Class569(true, false);
		aClass569_6395 = new Class569(true, true);
		aClass569_6390 = new Class569(true, true);
		aClass569_6389 = new Class569(false, false);
	}

	public boolean method6752(int i) {
		return ((Class569) this).aBool6398;
	}

	Class569(boolean bool, boolean bool_0_) {
		((Class569) this).aBool6397 = bool;
		((Class569) this).aBool6398 = bool_0_;
	}

	boolean method6753() {
		return ((Class569) this).aBool6397;
	}

	public boolean method6754() {
		return ((Class569) this).aBool6398;
	}

	boolean method6755(int i) {
		return ((Class569) this).aBool6397;
	}

	public static void method6756(boolean bool, int i) {
		/* empty */
	}

	static final void method6757(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class13.method620(290183533).getId(-1659058286);
	}

	public static String method6758(long l, int i, boolean bool, int i_1_) {
		Calendar calendar;
		if (bool) {
			Class675.method7960(l);
			calendar = Class273.aCalendar2898;
		} else {
			Class388.method4694(l);
			calendar = Class273.aCalendar2899;
		}
		int i_2_ = calendar.get(5);
		int i_3_ = calendar.get(2);
		int i_4_ = calendar.get(1);
		int i_5_ = calendar.get(11);
		int i_6_ = calendar.get(12);
		if (i == 3)
			return Class600.method7065(l, i, bool, 2113913995);
		return new StringBuilder().append(Integer.toString(i_2_ / 10)).append(i_2_ % 10).append("-").append(Class273.aStringArrayArray2900[i][i_3_]).append("-").append(i_4_).append(" ").append(i_5_ / 10).append(i_5_ % 10).append(":").append(i_6_ / 10).append(i_6_ % 10).toString();
	}

	public static int method6759(int i) {
		if (Class241.anInt2658 * -343337671 == 0) {
			Class249.aClass249_2717.method3422(new Class223("jaclib"), 1013916115);
			if (Class249.aClass249_2717.method3425(1717795506).method136(2016198561) != 100)
				return 1;
			if (!((Class223) Class249.aClass249_2717.method3425(1098795764)).method3128(-676979017) && !Class111.method2075(1691048356)) {
				try {
					Class278_Sub1.aclient9503.method6939(-969112329);
					Class536.method6380(-1570916814);
					Ping.init();
				} catch (Exception_Sub7 exception_sub7) {
					Class280.method3793(Class268.aClass268_2849, exception_sub7.aString11241, exception_sub7.anInt11242 * 1566583079, exception_sub7.getCause(), -1844875612);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			Class241.anInt2658 = 321472777;
		}
		if (Class241.anInt2658 * -343337671 == 1) {
			Class241.aClass249Array2659 = Class249.method3434((byte) -12);
			Class249.aClass249_2722.method3422(new Class252(RSSocket.aClass248_8295), 1355435132);
			Class249.aClass249_2712.method3422(new Class223("jaggl"), 1100711600);
			Class223 class223 = new Class223("jagdx");
			if (!Class572_Sub12_Sub2.aString11255.startsWith("win"))
				class223.method3129((byte) -80);
			Class249.aClass249_2702.method3422(class223, 397461756);
			Class249.aClass249_2703.method3422(new Class223("sw3d"), 1306610315);
			Class249.aClass249_2704.method3422(new Class223("hw3d"), -1736501713);
			Class249.aClass249_2705.method3422(new Class252(Class423_Sub2.aClass248_9761), -1081383);
			Class249.aClass249_2701.method3422(new Class252(Class375_Sub3.aClass248_9520), 1450848687);
			Class249.aClass249_2707.method3422(new Class252(Class498.aClass248_5511), 552086733);
			Class249.aClass249_2708.method3422(new Class252(Class131.aClass248_1539), -1452095775);
			Class249.aClass249_2709.method3422(new Class252(Class63.idx17Reference), 1826726579);
			Class249.aClass249_2700.method3422(new Class252(Class413.aClass248_4917), 104537802);
			Class249.aClass249_2710.method3422(new Class252(GraphicsDefinition.aClass248_8442), 346290748);
			Class249.aClass249_2699.method3422(new Class252(Class281.aClass248_3220), 2050637019);
			Class249.aClass249_2716.method3422(new Class252(Class665_Sub26.aClass248_9612), 975176908);
			Class249.aClass249_2714.method3422(new Class252(Class449.aClass248_5169), 463599809);
			Class249.aClass249_2715.method3422(new Class252(Class282.aClass248_3224), 27394768);
			Class249.aClass249_2711.method3422(new Class252(Class317.aClass248_3872), -1336220361);
			Class249.aClass249_2724.method3422(new Class252(NPCDefintion.aClass248_4860), 228028165);
			Class249.aClass249_2718.method3422(new Class252(Class76.aClass248_946), -1441410090);
			Class249.aClass249_2719.method3422(new Class243((Class44.aClass248_444), "huffman"), 1055141583);
			Class249.aClass249_2720.method3422(new Class252(Class133_Sub14.aClass248_9948), -1155545631);
			Class249.aClass249_2706.method3422(new Class252(Class438.aClass248_5080), -1791461495);
			Class249.aClass249_2721.method3422(new Class252(Class88.aClass248_1226), 1922177564);
			Class249.aClass249_2723.method3422(new Class237((Class549.idx23), 0), -1902266160);
			for (int i_7_ = 0; i_7_ < Class241.aClass249Array2659.length; i_7_++) {
				if (Class241.aClass249Array2659[i_7_].method3425(1927311080) == null)
					throw new RuntimeException();
			}
			int i_8_ = 0;
			Class249[] class249s = Class241.aClass249Array2659;
			for (int i_9_ = 0; i_9_ < class249s.length; i_9_++) {
				Class249 class249 = class249s[i_9_];
				int i_10_ = class249.method3423((byte) 12);
				int i_11_ = class249.method3425(581130673).method136(1081457803);
				i_8_ += i_10_ * i_11_ / 100;
			}
			Class241.anInt2660 = i_8_ * 321979189;
			Class241.anInt2658 = 642945554;
		}
		if (Class241.aClass249Array2659 == null)
			return 100;
		int i_12_ = 0;
		int i_13_ = 0;
		boolean bool = true;
		Class249[] class249s = Class241.aClass249Array2659;
		for (int i_14_ = 0; i_14_ < class249s.length; i_14_++) {
			Class249 class249 = class249s[i_14_];
			int i_15_ = class249.method3423((byte) 40);
			int i_16_ = class249.method3425(2091540408).method136(1423327030);
			if (i_16_ < 100)
				bool = false;
			i_12_ += i_15_;
			i_13_ += i_16_ * i_15_ / 100;
		}
		if (bool)
			Class241.aClass249Array2659 = null;
		i_13_ -= Class241.anInt2660 * 549549853;
		i_12_ -= Class241.anInt2660 * 549549853;
		int i_17_ = i_12_ > 0 ? i_13_ * 100 / i_12_ : 100;
		if (!bool && i_17_ > 99)
			i_17_ = 99;
		return i_17_;
	}

	public static boolean method6760(int i, int[] is, int i_18_) {
		if (Class572_Sub12_Sub2.aBoolArray11253[i])
			return true;
		Class534.aClass83Array5975[i] = Class195.method2947(i, is, Class534.aClass83Array5975[i], false, -915792122);
		if (null == Class534.aClass83Array5975[i])
			return false;
		Class572_Sub12_Sub2.aBoolArray11253[i] = true;
		return true;
	}

	static final void method6761(int i) {
		Class479.method5672(-388556947);
		client.aClass613_8605.method7295((byte) -1);
		for (int i_19_ = 0; i_19_ < client.aClass193Array8593.length; i_19_++)
			client.aClass193Array8593[i_19_] = null;
		for (int i_20_ = 0; i_20_ < client.aClass575Array8594.length; i_20_++)
			client.aClass575Array8594[i_20_] = null;
		Class388.method4691(-212506844);
		for (int i_21_ = 0; i_21_ < 2048; i_21_++)
			client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_21_] = null;
		client.anInt8625 = 0;
		client.aClass676_8622.method7964((byte) 58);
		client.anInt8624 = 0;
		client.aClass676_8749.method7964((byte) 36);
		Class133_Sub4.method9340(Class111.method2081((byte) -3), (short) -21012);
		client.anInt8614 = 0;
		Class133_Sub23.playerVarsProvider.domain.method6070((byte) -97);
		Class210.aClass334_2440 = null;
		Class440.aClass334_5097 = null;
		Class55.aClass572_Sub10_526 = null;
		Class251.aClass572_Sub10_2731 = null;
		Class221.aClass49_2607 = null;
		Class273.aClass461_2902 = null;
		Class324.aLong4087 = 0L;
		Class35.method782((short) 582);
		Class345.method4317((byte) -114);
	}

	static void method6762(Player class456_sub1_sub2_sub3_sub2, boolean bool, byte i) {
		if (Class25.anInt172 * 357782167 < 406) {
			if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == class456_sub1_sub2_sub3_sub2) {
				if (client.aBool8754 && (Class8.anInt43 * -1613657659 & 0x10) != 0)
					Class592.method7012(client.aString8757, new StringBuilder().append(client.aString8732).append(" ").append(Class3.aString26).append(" ").append(GraphicsDefinition.method7770(16777215, (byte) -13)).append(Class279.aClass279_3096.method3758(Class594.aClass435_7823, 16711935)).toString(), Class510.anInt5693 * 1904277101, 16, -1, 0L, 0, 0, true, false, (long) (class456_sub1_sub2_sub3_sub2.anInt11633 * -821391465), false, 1447140101);
			} else {
				String string;
				if (0 == class456_sub1_sub2_sub3_sub2.anInt11826 * -32458193) {
					boolean bool_22_ = true;
					if ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11825 * 1078973437) != -1 && (1078973437 * class456_sub1_sub2_sub3_sub2.anInt11825) != -1) {
						int i_23_ = (((1078973437 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11825)) < (1078973437 * class456_sub1_sub2_sub3_sub2.anInt11825)) ? (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11825) * 1078973437 : (1078973437 * class456_sub1_sub2_sub3_sub2.anInt11825));
						int i_24_ = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11823) * -1611815663 - (-1611815663 * class456_sub1_sub2_sub3_sub2.anInt11823));
						if (i_24_ < 0)
							i_24_ = -i_24_;
						if (i_24_ > i_23_)
							bool_22_ = false;
					}
					String string_25_ = (client.aClass437_8705 == Class437.aClass437_5068 ? Class279.aClass279_3087.method3758(Class594.aClass435_7823, 16711935) : (Class279.aClass279_3107.method3758(Class594.aClass435_7823, 16711935)));
					if (-1611815663 * class456_sub1_sub2_sub3_sub2.anInt11823 >= (-1080967531 * class456_sub1_sub2_sub3_sub2.anInt11832))
						string = new StringBuilder().append(class456_sub1_sub2_sub3_sub2.method10697(true, -95464834)).append(bool_22_ ? (Class128.method2260((class456_sub1_sub2_sub3_sub2.anInt11823 * -1611815663), (-1611815663 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11823)), 2134846398)) : GraphicsDefinition.method7770(16777215, (byte) 21)).append(Class3.aString24).append(string_25_).append(class456_sub1_sub2_sub3_sub2.anInt11823 * -1611815663).append(Class3.aString28).toString();
					else
						string = new StringBuilder().append(class456_sub1_sub2_sub3_sub2.method10697(true, 783979894)).append(bool_22_ ? (Class128.method2260((class456_sub1_sub2_sub3_sub2.anInt11823 * -1611815663), (-1611815663 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11823)), 2104092827)) : GraphicsDefinition.method7770(16777215, (byte) 33)).append(Class3.aString24).append(string_25_).append(class456_sub1_sub2_sub3_sub2.anInt11823 * -1611815663).append("+").append((class456_sub1_sub2_sub3_sub2.anInt11832 * -1080967531) - (-1611815663 * (class456_sub1_sub2_sub3_sub2.anInt11823))).append(Class3.aString28).toString();
				} else if (-1 == (-32458193 * class456_sub1_sub2_sub3_sub2.anInt11826))
					string = class456_sub1_sub2_sub3_sub2.method10697(true, 122923050);
				else
					string = new StringBuilder().append(class456_sub1_sub2_sub3_sub2.method10697(true, 1978006214)).append(Class3.aString24).append(Class279.aClass279_3104.method3758(Class594.aClass435_7823, 16711935)).append(class456_sub1_sub2_sub3_sub2.anInt11826 * -32458193).append(Class3.aString28).toString();
				boolean bool_26_ = false;
				if (null != class456_sub1_sub2_sub3_sub2.aClass474_11831 && (class456_sub1_sub2_sub3_sub2.aClass474_11831.anInt5319 * -1560513359) != -1) {
					NPCDefintion class410 = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * (class456_sub1_sub2_sub3_sub2.aClass474_11831.anInt5319), 1468652052)));
					if (class410.aBool4859) {
						bool_26_ = true;
						string = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition((class456_sub1_sub2_sub3_sub2.aClass474_11831.anInt5319) * -1560513359, 569721925))).aString4791;
						if (-1340892491 * class410.anInt4812 != 0) {
							String string_27_ = ((Class437.aClass437_5068 == client.aClass437_8705) ? (Class279.aClass279_3087.method3758(Class594.aClass435_7823, 16711935)) : (Class279.aClass279_3107.method3758(Class594.aClass435_7823, 16711935)));
							string = new StringBuilder().append(string).append(Class128.method2260(-1340892491 * class410.anInt4812, (-1611815663 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11823)), 2137986018)).append(Class3.aString24).append(string_27_).append(-1340892491 * class410.anInt4812).append(Class3.aString28).toString();
						}
					}
				}
				if (client.aBool8754 && !bool && 0 != (Class8.anInt43 * -1613657659 & 0x8))
					Class592.method7012(client.aString8757, new StringBuilder().append(client.aString8732).append(" ").append(Class3.aString26).append(" ").append(GraphicsDefinition.method7770(16777215, (byte) 63)).append(string).toString(), 1904277101 * Class510.anInt5693, 15, -1, (long) (class456_sub1_sub2_sub3_sub2.anInt11633 * -821391465), 0, 0, true, false, (long) (-821391465 * class456_sub1_sub2_sub3_sub2.anInt11633), false, 1447140101);
				if (!bool) {
					for (int i_28_ = 7; i_28_ >= 0; i_28_--) {
						if (null != client.aStringArray8742[i_28_]) {
							short i_29_ = 0;
							if ((Class437.aClass437_5072 == client.aClass437_8705) && (client.aStringArray8742[i_28_].equalsIgnoreCase(Class279.aClass279_3080.method3758(Class594.aClass435_7823, 16711935)))) {
								if (client.aBool8657 && ((class456_sub1_sub2_sub3_sub2.anInt11823) * -1611815663 > (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11823) * -1611815663))
									i_29_ = (short) 2000;
								if ((0 != (1023599805 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11829))) && 0 != (class456_sub1_sub2_sub3_sub2.anInt11829) * 1023599805) {
									if ((1023599805 * (class456_sub1_sub2_sub3_sub2.anInt11829)) == (1023599805 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11829)))
										i_29_ = (short) 2000;
									else
										i_29_ = (short) 0;
								} else if (class456_sub1_sub2_sub3_sub2.isClanMember)
									i_29_ = (short) 2000;
							} else if (client.aBoolArray8667[i_28_])
								i_29_ = (short) 2000;
							short i_30_ = (short) (i_29_ + client.aShortArray8740[i_28_]);
							int i_31_ = (-1 != client.anIntArray8695[i_28_] ? client.anIntArray8695[i_28_] : client.anInt8752 * 1677589191);
							int i_32_ = bool_26_ ? 16776960 : 16777215;
							Class592.method7012(client.aStringArray8742[i_28_], new StringBuilder().append(GraphicsDefinition.method7770(i_32_, (byte) -58)).append(string).toString(), i_31_, i_30_, -1, (long) (-821391465 * (class456_sub1_sub2_sub3_sub2.anInt11633)), 0, 0, true, false, (long) ((class456_sub1_sub2_sub3_sub2.anInt11633) * -821391465), false, 1447140101);
						}
					}
				} else if (!bool_26_)
					Class592.method7012(new StringBuilder().append(GraphicsDefinition.method7770(13421772, (byte) 23)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-821391465 * (class456_sub1_sub2_sub3_sub2.anInt11633)), false, 1447140101);
				if (!bool && !bool_26_) {
					for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); class572_sub12_sub10 != null; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(337136290))) {
						if ((((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871 == 23) {
							((Class572_Sub12_Sub10) class572_sub12_sub10).aString11403 = new StringBuilder().append(GraphicsDefinition.method7770(16777215, (byte) -9)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}
}

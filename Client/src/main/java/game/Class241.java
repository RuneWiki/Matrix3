package game;

/* Class241 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

public class Class241 {
	static int anInt2658 = 0;
	static Class249[] aClass249Array2659;
	static int anInt2660 = 0;

	Class241() throws Throwable {
		throw new Error();
	}

	public static int method3318() {
		if (anInt2658 * -343337671 == 0) {
			Class249.aClass249_2717.method3422(new Class223("jaclib"), 205899668);
			if (Class249.aClass249_2717.method3425(1047605545).method136(1906886446) != 100)
				return 1;
			if (!((Class223) Class249.aClass249_2717.method3425(1865490623)).method3128(-676979017) && !Class111.method2075(835714551)) {
				try {
					Class278_Sub1.aclient9503.method6939(-969112329);
					Class536.method6380(-954438858);
					Ping.init();
				} catch (Exception_Sub7 exception_sub7) {
					Class280.method3793(Class268.aClass268_2849, exception_sub7.aString11241, exception_sub7.anInt11242 * 1566583079, exception_sub7.getCause(), 464300908);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt2658 = 321472777;
		}
		if (anInt2658 * -343337671 == 1) {
			aClass249Array2659 = Class249.method3434((byte) -42);
			Class249.aClass249_2722.method3422(new Class252(RSSocket.aClass248_8295), 1082514392);
			Class249.aClass249_2712.method3422(new Class223("jaggl"), 1317893493);
			Class223 class223 = new Class223("jagdx");
			if (!Class572_Sub12_Sub2.aString11255.startsWith("win"))
				class223.method3129((byte) -1);
			Class249.aClass249_2702.method3422(class223, -1139988550);
			Class249.aClass249_2703.method3422(new Class223("sw3d"), 438779865);
			Class249.aClass249_2704.method3422(new Class223("hw3d"), -1747707198);
			Class249.aClass249_2705.method3422(new Class252(Class423_Sub2.aClass248_9761), 890501523);
			Class249.aClass249_2701.method3422(new Class252(Class375_Sub3.aClass248_9520), 2027653314);
			Class249.aClass249_2707.method3422(new Class252(Class498.aClass248_5511), -1542538486);
			Class249.aClass249_2708.method3422(new Class252(Class131.aClass248_1539), 1042435682);
			Class249.aClass249_2709.method3422(new Class252(Class63.idx17Reference), 893160955);
			Class249.aClass249_2700.method3422(new Class252(Class413.aClass248_4917), 1835592047);
			Class249.aClass249_2710.method3422(new Class252(GraphicsDefinition.aClass248_8442), 509150803);
			Class249.aClass249_2699.method3422(new Class252(Class281.aClass248_3220), 1601455658);
			Class249.aClass249_2716.method3422(new Class252(Class665_Sub26.aClass248_9612), -31352836);
			Class249.aClass249_2714.method3422(new Class252(Class449.aClass248_5169), 1953370521);
			Class249.aClass249_2715.method3422(new Class252(Class282.aClass248_3224), 957249966);
			Class249.aClass249_2711.method3422(new Class252(Class317.aClass248_3872), -1567235881);
			Class249.aClass249_2724.method3422(new Class252(NPCDefintion.aClass248_4860), 1770316987);
			Class249.aClass249_2718.method3422(new Class252(Class76.aClass248_946), -1621394075);
			Class249.aClass249_2719.method3422(new Class243((Class44.aClass248_444), "huffman"), 547062246);
			Class249.aClass249_2720.method3422(new Class252(Class133_Sub14.aClass248_9948), -1439717768);
			Class249.aClass249_2706.method3422(new Class252(Class438.aClass248_5080), -79244502);
			Class249.aClass249_2721.method3422(new Class252(Class88.aClass248_1226), -438462646);
			Class249.aClass249_2723.method3422(new Class237((Class549.idx23), 0), 1699768980);
			for (int i = 0; i < aClass249Array2659.length; i++) {
				if (aClass249Array2659[i].method3425(709043397) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class249[] class249s = aClass249Array2659;
			for (int i_0_ = 0; i_0_ < class249s.length; i_0_++) {
				Class249 class249 = class249s[i_0_];
				int i_1_ = class249.method3423((byte) 102);
				int i_2_ = class249.method3425(843505627).method136(1482981176);
				i += i_1_ * i_2_ / 100;
			}
			anInt2660 = i * 321979189;
			anInt2658 = 642945554;
		}
		if (aClass249Array2659 == null)
			return 100;
		int i = 0;
		int i_3_ = 0;
		boolean bool = true;
		Class249[] class249s = aClass249Array2659;
		for (int i_4_ = 0; i_4_ < class249s.length; i_4_++) {
			Class249 class249 = class249s[i_4_];
			int i_5_ = class249.method3423((byte) -12);
			int i_6_ = class249.method3425(1594032219).method136(868707385);
			if (i_6_ < 100)
				bool = false;
			i += i_5_;
			i_3_ += i_6_ * i_5_ / 100;
		}
		if (bool)
			aClass249Array2659 = null;
		i_3_ -= anInt2660 * 549549853;
		i -= anInt2660 * 549549853;
		int i_7_ = i > 0 ? i_3_ * 100 / i : 100;
		if (!bool && i_7_ > 99)
			i_7_ = 99;
		return i_7_;
	}

	public static int method3319() {
		if (anInt2658 * -343337671 == 0) {
			Class249.aClass249_2717.method3422(new Class223("jaclib"), -971726231);
			if (Class249.aClass249_2717.method3425(1256053076).method136(895952674) != 100)
				return 1;
			if (!((Class223) Class249.aClass249_2717.method3425(938017756)).method3128(-676979017) && !Class111.method2075(647576493)) {
				try {
					Class278_Sub1.aclient9503.method6939(-969112329);
					Class536.method6380(-1624144177);
					Ping.init();
				} catch (Exception_Sub7 exception_sub7) {
					Class280.method3793(Class268.aClass268_2849, exception_sub7.aString11241, exception_sub7.anInt11242 * 1566583079, exception_sub7.getCause(), 1956277747);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt2658 = 321472777;
		}
		if (anInt2658 * -343337671 == 1) {
			aClass249Array2659 = Class249.method3434((byte) -43);
			Class249.aClass249_2722.method3422(new Class252(RSSocket.aClass248_8295), 1691926027);
			Class249.aClass249_2712.method3422(new Class223("jaggl"), 1206792717);
			Class223 class223 = new Class223("jagdx");
			if (!Class572_Sub12_Sub2.aString11255.startsWith("win"))
				class223.method3129((byte) -52);
			Class249.aClass249_2702.method3422(class223, 1666213924);
			Class249.aClass249_2703.method3422(new Class223("sw3d"), -1431208611);
			Class249.aClass249_2704.method3422(new Class223("hw3d"), -657283600);
			Class249.aClass249_2705.method3422(new Class252(Class423_Sub2.aClass248_9761), -1361362233);
			Class249.aClass249_2701.method3422(new Class252(Class375_Sub3.aClass248_9520), -1852317232);
			Class249.aClass249_2707.method3422(new Class252(Class498.aClass248_5511), -645605553);
			Class249.aClass249_2708.method3422(new Class252(Class131.aClass248_1539), 1473518398);
			Class249.aClass249_2709.method3422(new Class252(Class63.idx17Reference), -22357283);
			Class249.aClass249_2700.method3422(new Class252(Class413.aClass248_4917), 1271004066);
			Class249.aClass249_2710.method3422(new Class252(GraphicsDefinition.aClass248_8442), -628563570);
			Class249.aClass249_2699.method3422(new Class252(Class281.aClass248_3220), 483944484);
			Class249.aClass249_2716.method3422(new Class252(Class665_Sub26.aClass248_9612), -1908121082);
			Class249.aClass249_2714.method3422(new Class252(Class449.aClass248_5169), 1999986806);
			Class249.aClass249_2715.method3422(new Class252(Class282.aClass248_3224), 2071345338);
			Class249.aClass249_2711.method3422(new Class252(Class317.aClass248_3872), -333055322);
			Class249.aClass249_2724.method3422(new Class252(NPCDefintion.aClass248_4860), -1580789688);
			Class249.aClass249_2718.method3422(new Class252(Class76.aClass248_946), -782218252);
			Class249.aClass249_2719.method3422(new Class243((Class44.aClass248_444), "huffman"), -20447551);
			Class249.aClass249_2720.method3422(new Class252(Class133_Sub14.aClass248_9948), 1157697176);
			Class249.aClass249_2706.method3422(new Class252(Class438.aClass248_5080), -2022332422);
			Class249.aClass249_2721.method3422(new Class252(Class88.aClass248_1226), -1045703527);
			Class249.aClass249_2723.method3422(new Class237((Class549.idx23), 0), 2036937952);
			for (int i = 0; i < aClass249Array2659.length; i++) {
				if (aClass249Array2659[i].method3425(2008157046) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class249[] class249s = aClass249Array2659;
			for (int i_8_ = 0; i_8_ < class249s.length; i_8_++) {
				Class249 class249 = class249s[i_8_];
				int i_9_ = class249.method3423((byte) 57);
				int i_10_ = class249.method3425(1799568814).method136(1908798832);
				i += i_9_ * i_10_ / 100;
			}
			anInt2660 = i * 321979189;
			anInt2658 = 642945554;
		}
		if (aClass249Array2659 == null)
			return 100;
		int i = 0;
		int i_11_ = 0;
		boolean bool = true;
		Class249[] class249s = aClass249Array2659;
		for (int i_12_ = 0; i_12_ < class249s.length; i_12_++) {
			Class249 class249 = class249s[i_12_];
			int i_13_ = class249.method3423((byte) -92);
			int i_14_ = class249.method3425(475042810).method136(1568137208);
			if (i_14_ < 100)
				bool = false;
			i += i_13_;
			i_11_ += i_14_ * i_13_ / 100;
		}
		if (bool)
			aClass249Array2659 = null;
		i_11_ -= anInt2660 * 549549853;
		i -= anInt2660 * 549549853;
		int i_15_ = i > 0 ? i_11_ * 100 / i : 100;
		if (!bool && i_15_ > 99)
			i_15_ = 99;
		return i_15_;
	}

	public static void method3320() {
		anInt2658 = 0;
		anInt2660 = 0;
	}

	static final void method3321(Cs2Executor class441, int i) {
		int i_16_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_16_, (short) 23650);
		Class83 class83 = Class534.aClass83Array5975[i_16_ >> 16];
		Class527.method6314(class73, class83, class441, (short) 135);
	}

	static final void method3322(InterfaceDefinitions class73, int i, Cs2Executor class441, byte i_17_) {
		if (class73.aByteArrayArray791 == null)
			throw new RuntimeException();
		if (class73.anIntArray851 == null)
			class73.anIntArray851 = new int[class73.aByteArrayArray791.length];
		class73.anIntArray851[i] = 2147483647;
	}

	static final void method3323(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aShort8849;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.aShort8668;
	}

	static int method3324(Class248 class248, JS5ConfigGroup jS5ConfigGroup, int i) {
		if (class248 != null) {
			if (jS5ConfigGroup.method3106(-8711980) > 1) {
				int i_18_ = class248.method3377(-608403607) - 1;
				return (i_18_ * jS5ConfigGroup.method3106(-8711980) + class248.method3376(i_18_, -1828632438));
			}
			return class248.method3376(jS5ConfigGroup.anInt2591 * 1890065851, 928238757);
		}
		return 0;
	}

	static final void method3325(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_19_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_20_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_21_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 2]);
		Class344.audio.method953(i_19_, i_20_, i_21_, -1097604363);
	}

	static final void method3326(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		client.aShort8801 = (short) (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (client.aShort8801 <= 0)
			client.aShort8801 = (short) 256;
		client.aShort8823 = (short) (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (client.aShort8823 <= 0)
			client.aShort8823 = (short) 205;
	}

	public static void method3327(int i, int i_22_, String string, String string_23_, String string_24_, String string_25_, String string_26_, int i_27_, byte i_28_) {
		Class391 class391 = (Class391) Class390.aMap4653.get(Integer.valueOf(i));
		if (class391 == null) {
			class391 = new Class391();
			Class390.aMap4653.put(Integer.valueOf(i), class391);
		}
		Class572_Sub12_Sub13 class572_sub12_sub13 = class391.method4716(i, i_22_, string, string_23_, string_24_, string_25_, string_26_, i_27_, (byte) 39);
		Class390.aClass676_4654.put(class572_sub12_sub13, (long) ((class572_sub12_sub13.anInt11459) * 1509288629));
		Class390.aClass664_4656.method7842(class572_sub12_sub13, 2060627043);
		client.anInt8802 = -940844867 * client.anInt8839;
	}
}

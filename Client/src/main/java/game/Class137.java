package game;

/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class137 {
	static Object anObject1595;
	static final int anInt1596 = 128;
	static final int anInt1597 = 128;
	static final int anInt1598 = 16;
	Class155_Sub1 aClass155_Sub1_1599;
	static final int anInt1600 = 4000;
	Class155_Sub4[] aClass155_Sub4Array1601 = null;
	Class155_Sub4[] aClass155_Sub4Array1602;
	static Object anObject1603;
	Class155_Sub1 aClass155_Sub1_1604;
	boolean aBool1605;
	Class155_Sub1 aClass155_Sub1_1606;
	static Object anObject1607;

	static void method2344(Class106_Sub1 class106_sub1) {
		if (anObject1595 == null) {
			Class331_Sub1_Sub1 class331_sub1_sub1 = new Class331_Sub1_Sub1();
			byte[] is = class331_sub1_sub1.method10280(128, 128, 16);
			anObject1595 = Class286.method3866(is, false, (short) -31076);
		}
		if (anObject1603 == null) {
			Class331_Sub2_Sub1 class331_sub2_sub1 = new Class331_Sub2_Sub1();
			byte[] is = class331_sub2_sub1.method10130(128, 128, 16);
			anObject1603 = Class286.method3866(is, false, (short) -11974);
		}
		Class176 class176 = ((Class106_Sub1) class106_sub1).aClass176_10046;
		if (class176.method2758() && anObject1607 == null) {
			byte[] is = Class559.method6604(128, 128, 16, 8, new Class576_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject1607 = Class286.method3866(is, false, (short) -28693);
		}
	}

	Class137(Class106_Sub1 class106_sub1) {
		((Class137) this).aClass155_Sub1_1599 = null;
		((Class137) this).aClass155_Sub4Array1602 = null;
		((Class137) this).aClass155_Sub1_1606 = null;
		((Class137) this).aClass155_Sub1_1604 = null;
		((Class137) this).aBool1605 = ((Class106_Sub1) class106_sub1).aBool10166;
		method2344(class106_sub1);
		if (!((Class137) this).aBool1605) {
			((Class137) this).aClass155_Sub4Array1601 = new Class155_Sub4[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class413.method5082(anObject1595, i * 32768, 32768, 1179426777);
				((Class137) this).aClass155_Sub4Array1601[i] = new Class155_Sub4(class106_sub1, 3553, Class171.aClass171_2067, Class88.aClass88_1218, 128, 128, true, is, Class171.aClass171_2067, false);
			}
			((Class137) this).aClass155_Sub4Array1602 = new Class155_Sub4[16];
			for (int i = 0; i < 16; i++) {
				byte[] is = Class413.method5082(anObject1603, i * 32768, 32768, -643355720);
				((Class137) this).aClass155_Sub4Array1602[i] = new Class155_Sub4(class106_sub1, 3553, Class171.aClass171_2067, Class88.aClass88_1218, 128, 128, true, is, Class171.aClass171_2067, false);
			}
		} else {
			byte[] is = MusicVolume.method2201(anObject1595, false, -1539626034);
			((Class137) this).aClass155_Sub1_1599 = new Class155_Sub1(class106_sub1, Class171.aClass171_2067, Class88.aClass88_1218, 128, 128, 16, is, Class171.aClass171_2067);
			is = MusicVolume.method2201(anObject1603, false, -1539626034);
			((Class137) this).aClass155_Sub1_1606 = new Class155_Sub1(class106_sub1, Class171.aClass171_2067, Class88.aClass88_1218, 128, 128, 16, is, Class171.aClass171_2067);
			Class176 class176 = ((Class106_Sub1) class106_sub1).aClass176_10046;
			if (class176.method2758()) {
				is = MusicVolume.method2201(anObject1607, false, -1539626034);
				((Class137) this).aClass155_Sub1_1604 = new Class155_Sub1(class106_sub1, Class171.aClass171_2071, Class88.aClass88_1218, 128, 128, 16);
				Class155_Sub1 class155_sub1 = new Class155_Sub1(class106_sub1, Class171.aClass171_2064, Class88.aClass88_1218, 128, 128, 16, is, Class171.aClass171_2064);
				if (!class176.method2759(((Class137) this).aClass155_Sub1_1604, class155_sub1, 2.0F)) {
					((Class137) this).aClass155_Sub1_1604.method2522();
					((Class137) this).aClass155_Sub1_1604 = null;
				} else
					((Class137) this).aClass155_Sub1_1604.method2529();
				class155_sub1.method2522();
			}
		}
	}
}

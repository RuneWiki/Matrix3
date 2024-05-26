package game;

/* Class566 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class566 implements Interface17 {
	Class565 aClass565_6362;
	public int anInt6363;
	public int anInt6364 = -1217866925;
	public int anInt6365 = 511711453;
	public int anInt6366 = -776922959;
	public int anInt6367;
	public int anInt6368;
	public int anInt6369;
	public int anInt6370;
	public int anInt6371;
	static final int anInt6372 = 70;
	public int anInt6373;
	public int anInt6374;
	public static int anInt6375;

	void method6702(RSByteBuffer class572_sub15, int i) {
		if (i == 1)
			class572_sub15.readUnsignedShort(647518597);
		else if (i == 2)
			anInt6364 = class572_sub15.readUnsignedByte(1327243603) * -1183786579;
		else if (i == 3)
			anInt6365 = class572_sub15.readUnsignedByte(256227805) * 1804208675;
		else if (4 == i)
			anInt6366 = 0;
		else if (5 == i)
			anInt6368 = class572_sub15.readUnsignedShort(647518597) * 13027053;
		else if (6 == i)
			class572_sub15.readUnsignedByte(2144773068);
		else if (i == 7)
			anInt6367 = class572_sub15.readBigSmart((byte) 84) * 63581665;
		else if (8 == i)
			anInt6374 = class572_sub15.readBigSmart((byte) 72) * 2129130881;
		else if (9 == i)
			anInt6371 = class572_sub15.readBigSmart((byte) 54) * 1411626687;
		else if (10 == i)
			anInt6370 = class572_sub15.readBigSmart((byte) 88) * 543879819;
		else if (i == 11)
			anInt6366 = class572_sub15.readUnsignedShort(647518597) * 776922959;
		else if (12 == i)
			anInt6373 = class572_sub15.readBigSmart((byte) 127) * 1338566687;
		else if (i == 13)
			anInt6369 = class572_sub15.readBigSmart((byte) 115) * 1879325239;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(108306550);
			if (0 == i_0_)
				break;
			method6703(class572_sub15, i_0_, 1619132000);
		}
	}

	void method6703(RSByteBuffer class572_sub15, int i, int i_1_) {
		if (i == 1)
			class572_sub15.readUnsignedShort(647518597);
		else if (i == 2)
			anInt6364 = class572_sub15.readUnsignedByte(1721194382) * -1183786579;
		else if (i == 3)
			anInt6365 = class572_sub15.readUnsignedByte(2091962757) * 1804208675;
		else if (4 == i)
			anInt6366 = 0;
		else if (5 == i)
			anInt6368 = class572_sub15.readUnsignedShort(647518597) * 13027053;
		else if (6 == i)
			class572_sub15.readUnsignedByte(-49512813);
		else if (i == 7)
			anInt6367 = class572_sub15.readBigSmart((byte) 123) * 63581665;
		else if (8 == i)
			anInt6374 = class572_sub15.readBigSmart((byte) 99) * 2129130881;
		else if (9 == i)
			anInt6371 = class572_sub15.readBigSmart((byte) 109) * 1411626687;
		else if (10 == i)
			anInt6370 = class572_sub15.readBigSmart((byte) 60) * 543879819;
		else if (i == 11)
			anInt6366 = class572_sub15.readUnsignedShort(647518597) * 776922959;
		else if (12 == i)
			anInt6373 = class572_sub15.readBigSmart((byte) 88) * 1338566687;
		else if (i == 13)
			anInt6369 = class572_sub15.readBigSmart((byte) 45) * 1879325239;
	}

	public void method112() {
		/* empty */
	}

	public void method103() {
		/* empty */
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(620380211);
			if (0 == i)
				break;
			method6703(class572_sub15, i, 2087419138);
		}
	}

	public void method104(byte i) {
		/* empty */
	}

	Class566(int i, Class565 class565) {
		anInt6363 = 510621887;
		anInt6368 = 911893710;
		anInt6367 = -63581665;
		anInt6374 = -2129130881;
		anInt6371 = -1411626687;
		anInt6370 = -543879819;
		anInt6373 = -1338566687;
		anInt6369 = -1879325239;
		((Class566) this).aClass565_6362 = class565;
	}

	public void method106() {
		/* empty */
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(535733783);
			if (0 == i)
				break;
			method6703(class572_sub15, i, 1583716384);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(733757254);
			if (0 == i)
				break;
			method6703(class572_sub15, i, 1750654128);
		}
	}

	public Class161 method6704(Class106 class106, int i, byte i_2_) {
		if (i < 0)
			return null;
		Class161 class161 = (Class161) ((Class565) ((Class566) this).aClass565_6362).aClass127_6358.method2246((long) i);
		if (null == class161) {
			method6705(class106, 1370526349);
			class161 = (Class161) ((Class565) ((Class566) this).aClass565_6362).aClass127_6358.method2246((long) i);
		}
		return class161;
	}

	public void method110() {
		/* empty */
	}

	void method6705(Class106 class106, int i) {
		method6707(class106, -145304031 * anInt6367, -703121654);
		method6707(class106, anInt6374 * 254167681, -256492781);
		method6707(class106, anInt6371 * 56277311, -1628145482);
		method6707(class106, -2062523101 * anInt6370, -1815816483);
		method6707(class106, anInt6373 * -1764977697, -263175316);
		method6707(class106, anInt6369 * -89482361, -1163905811);
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1393465790);
			if (0 == i)
				break;
			method6703(class572_sub15, i, 1649371616);
		}
	}

	void method6706(RSByteBuffer class572_sub15, int i) {
		if (i == 1)
			class572_sub15.readUnsignedShort(647518597);
		else if (i == 2)
			anInt6364 = class572_sub15.readUnsignedByte(-9929521) * -1183786579;
		else if (i == 3)
			anInt6365 = class572_sub15.readUnsignedByte(92317471) * 1804208675;
		else if (4 == i)
			anInt6366 = 0;
		else if (5 == i)
			anInt6368 = class572_sub15.readUnsignedShort(647518597) * 13027053;
		else if (6 == i)
			class572_sub15.readUnsignedByte(2135560288);
		else if (i == 7)
			anInt6367 = class572_sub15.readBigSmart((byte) 43) * 63581665;
		else if (8 == i)
			anInt6374 = class572_sub15.readBigSmart((byte) 122) * 2129130881;
		else if (9 == i)
			anInt6371 = class572_sub15.readBigSmart((byte) 127) * 1411626687;
		else if (10 == i)
			anInt6370 = class572_sub15.readBigSmart((byte) 40) * 543879819;
		else if (i == 11)
			anInt6366 = class572_sub15.readUnsignedShort(647518597) * 776922959;
		else if (12 == i)
			anInt6373 = class572_sub15.readBigSmart((byte) 80) * 1338566687;
		else if (i == 13)
			anInt6369 = class572_sub15.readBigSmart((byte) 76) * 1879325239;
	}

	void method6707(Class106 class106, int i, int i_3_) {
		Class248 class248 = ((Class565) ((Class566) this).aClass565_6362).aClass248_6359;
		if (i >= 0 && ((Class565) ((Class566) this).aClass565_6362).aClass127_6358.method2246((long) i) == null && class248.method3383(i, 644273492)) {
			Class87 class87 = Class160.method2572(class248, i);
			((Class565) ((Class566) this).aClass565_6362).aClass127_6358.method2229(class106.method1711(class87, true), (long) i);
		}
	}

	public Class161 method6708(Class106 class106, int i) {
		if (i < 0)
			return null;
		Class161 class161 = (Class161) ((Class565) ((Class566) this).aClass565_6362).aClass127_6358.method2246((long) i);
		if (null == class161) {
			method6705(class106, -158910573);
			class161 = (Class161) ((Class565) ((Class566) this).aClass565_6362).aClass127_6358.method2246((long) i);
		}
		return class161;
	}

	void method6709(Class106 class106) {
		method6707(class106, -145304031 * anInt6367, -1790049828);
		method6707(class106, anInt6374 * 254167681, -613768890);
		method6707(class106, anInt6371 * 56277311, -1820283280);
		method6707(class106, -2062523101 * anInt6370, -494561780);
		method6707(class106, anInt6373 * -1764977697, -1174361484);
		method6707(class106, anInt6369 * -89482361, -1025871732);
	}

	static final void method6710(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_4_, (short) 1315);
		Class83 class83 = Class534.aClass83Array5975[i_4_ >> 16];
		Class602.method7092(class73, class83, class441, -767431539);
	}

	static final void method6711(Cs2Executor class441, byte i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_5_, (short) -4713);
		Class83 class83 = Class534.aClass83Array5975[i_5_ >> 16];
		Class100.method1592(class73, class83, class441, -1622903012);
	}

	static final void method6712(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class47.method842(string, false, -1042067865);
	}

	static final void method6713(Cs2Executor class441, int i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_6_ == 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class547_Sub1.aBool8999 ? 1 : 0;
		else if (i_6_ == 1)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class547_Sub1.aBool9002 ? 1 : 0;
		else if (2 == i_6_)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class547_Sub1.aBool9001 ? 1 : 0;
		else
			throw new RuntimeException();
	}

	static final void method6714(int i) {
		Iterator iterator = client.aClass676_8747.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub9 class572_sub12_sub9 = (Class572_Sub12_Sub9) iterator.next();
			Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390);
			if (client.aClass613_8605.method7285(1488924259) != null && class456_sub1_sub2_sub4.method10599(1291478488))
				client.aClass613_8605.method7285(1132235224).method6232(class456_sub1_sub2_sub4, true, -156591198);
		}
	}

	public static boolean method6715(int i, byte i_7_) {
		return 0 == i || i == 1 || 2 == i;
	}

	static void method6716(Class535 class535, int i, int i_8_, int i_9_, Model model, int i_10_) {
		if (null != model)
			class535.method6379(i, i_8_, i_9_, model.method1378(), model.method1380(), model.method1381(), model.method1382(), model.method1356(), model.method1384(), model.method1508());
	}

	static void method6717(Class667 class667, int i) {
		Class16.aClass667_132 = class667;
	}
}

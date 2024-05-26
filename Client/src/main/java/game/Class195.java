package game;

/* Class195 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class195 {
	RSByteBuffer aClass572_Sub15_2324;
	Class555 aClass555_2325;
	Class675 aClass675_2326 = new Class675();
	public int anInt2327 = 0;
	int anInt2328;
	boolean aBool2329;
	Class572_Sub15_Sub2 aClass572_Sub15_Sub2_2330;
	Class650 aClass650_2331;
	IncomingPacket currentPacket;
	int anInt2333;
	IncomingPacket aClass321_2334;
	int anInt2335;
	Class14 aClass14_2336;
	public int anInt2337;
	int anInt2338;
	int anInt2339;
	public Class650 aClass650_2340;
	int anInt2341;
	IncomingPacket aClass321_2342;
	IncomingPacket aClass321_2343;
	public boolean aBool2344;
	static final int anInt2345 = 15000;
	public static Class161 aClass161_2346;
	public static Class639_Sub14 aClass639_Sub14_2347;

	final void method2926(byte i) {
		((Class195) this).aClass675_2326.method7918(-30954300);
		anInt2327 = 0;
	}

	void method2927() {
		if (null != ((Class195) this).aClass555_2325) {
			((Class195) this).aClass555_2325.method6558(703719362);
			((Class195) this).aClass555_2325 = null;
		}
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	void method2928() {
		if (null != ((Class195) this).aClass555_2325) {
			((Class195) this).aClass555_2325.method6558(703719362);
			((Class195) this).aClass555_2325 = null;
		}
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	public final void method2929(Class572_Sub25 class572_sub25, byte i) {
		((Class195) this).aClass675_2326.method7940(class572_sub25, -1923528490);
		class572_sub25.anInt9254 = class572_sub25.aRsByteBuffer.o * -2123714935;
		class572_sub25.aRsByteBuffer.o = 0;
		anInt2327 += class572_sub25.anInt9254 * -1050417047;
	}

	void method2930(byte i) {
		if (client.cycles % 50 == 0) {
			((Class195) this).anInt2339 = ((Class195) this).anInt2341 * -11103691;
			((Class195) this).anInt2341 = 0;
			((Class195) this).anInt2328 = ((Class195) this).anInt2338 * 1352212509;
			((Class195) this).anInt2338 = 0;
		}
	}

	void method2931(Class555 class555, String string, int i) {
		((Class195) this).aClass555_2325 = class555;
		((Class195) this).aClass14_2336.method622(string, 1883445841);
	}

	Class195() {
		((Class195) this).aClass572_Sub15_2324 = new RSByteBuffer(1700);
		((Class195) this).aClass572_Sub15_Sub2_2330 = new Class572_Sub15_Sub2(15000);
		((Class195) this).currentPacket = null;
		((Class195) this).anInt2333 = 0;
		((Class195) this).aBool2329 = true;
		((Class195) this).anInt2335 = 0;
		anInt2337 = 0;
		aBool2344 = false;
		((Class195) this).aClass14_2336 = new Class14();
		Thread thread = new Thread(((Class195) this).aClass14_2336);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	final void method2932() {
		((Class195) this).aClass675_2326.method7918(-44914376);
		anInt2327 = 0;
	}

	public Class555 method2933(int i) {
		return ((Class195) this).aClass555_2325;
	}

	public final void method2934() throws IOException {
		if (null != ((Class195) this).aClass555_2325 && anInt2327 * -679741437 > 0) {
			((Class195) this).aClass572_Sub15_2324.o = 0;
			for (;;) {
				Class572_Sub25 class572_sub25 = ((Class572_Sub25) ((Class195) this).aClass675_2326.method7932((byte) 50));
				if (null == class572_sub25 || (-423333573 * class572_sub25.anInt9254 > ((((Class195) this).aClass572_Sub15_2324.b).length - (((Class195) this).aClass572_Sub15_2324.o * -1585139053))))
					break;
				((Class195) this).aClass572_Sub15_2324.writeBytes(class572_sub25.aRsByteBuffer.b, 0, class572_sub25.anInt9254 * -423333573, (byte) -23);
				anInt2327 -= -1050417047 * class572_sub25.anInt9254;
				class572_sub25.method6794((byte) 61);
				class572_sub25.aRsByteBuffer.method8449((byte) 105);
				class572_sub25.method8623(162001276);
			}
			((Class195) this).aClass555_2325.method6570(((Class195) this).aClass572_Sub15_2324.b, 0, (-1585139053 * ((Class195) this).aClass572_Sub15_2324.o), (byte) 100);
			((Class195) this).anInt2341 += (((Class195) this).aClass572_Sub15_2324.o * -1760374207);
			anInt2337 = 0;
		}
	}

	public final void method2935() throws IOException {
		if (null != ((Class195) this).aClass555_2325 && anInt2327 * -679741437 > 0) {
			((Class195) this).aClass572_Sub15_2324.o = 0;
			for (;;) {
				Class572_Sub25 class572_sub25 = ((Class572_Sub25) ((Class195) this).aClass675_2326.method7932((byte) 50));
				if (null == class572_sub25 || (-423333573 * class572_sub25.anInt9254 > ((((Class195) this).aClass572_Sub15_2324.b).length - (((Class195) this).aClass572_Sub15_2324.o * -1585139053))))
					break;
				((Class195) this).aClass572_Sub15_2324.writeBytes(class572_sub25.aRsByteBuffer.b, 0, class572_sub25.anInt9254 * -423333573, (byte) 76);
				anInt2327 -= -1050417047 * class572_sub25.anInt9254;
				class572_sub25.method6794((byte) 10);
				class572_sub25.aRsByteBuffer.method8449((byte) 118);
				class572_sub25.method8623(-384878082);
			}
			((Class195) this).aClass555_2325.method6570(((Class195) this).aClass572_Sub15_2324.b, 0, (-1585139053 * ((Class195) this).aClass572_Sub15_2324.o), (byte) 100);
			((Class195) this).anInt2341 += (((Class195) this).aClass572_Sub15_2324.o * -1760374207);
			anInt2337 = 0;
		}
	}

	public final void method2936(byte i) throws IOException {
		if (null != ((Class195) this).aClass555_2325 && anInt2327 * -679741437 > 0) {
			((Class195) this).aClass572_Sub15_2324.o = 0;
			for (;;) {
				Class572_Sub25 class572_sub25 = ((Class572_Sub25) ((Class195) this).aClass675_2326.method7932((byte) 50));
				if (null == class572_sub25 || (-423333573 * class572_sub25.anInt9254 > ((((Class195) this).aClass572_Sub15_2324.b).length - (((Class195) this).aClass572_Sub15_2324.o * -1585139053))))
					break;
				((Class195) this).aClass572_Sub15_2324.writeBytes(class572_sub25.aRsByteBuffer.b, 0, class572_sub25.anInt9254 * -423333573, (byte) 10);
				anInt2327 -= -1050417047 * class572_sub25.anInt9254;
				class572_sub25.method6794((byte) -47);
				class572_sub25.aRsByteBuffer.method8449((byte) 92);
				class572_sub25.method8623(1530931037);
			}
			((Class195) this).aClass555_2325.method6570(((Class195) this).aClass572_Sub15_2324.b, 0, (-1585139053 * ((Class195) this).aClass572_Sub15_2324.o), (byte) 100);
			((Class195) this).anInt2341 += (((Class195) this).aClass572_Sub15_2324.o * -1760374207);
			anInt2337 = 0;
		}
	}

	public final void method2937() throws IOException {
		if (null != ((Class195) this).aClass555_2325 && anInt2327 * -679741437 > 0) {
			((Class195) this).aClass572_Sub15_2324.o = 0;
			for (;;) {
				Class572_Sub25 class572_sub25 = ((Class572_Sub25) ((Class195) this).aClass675_2326.method7932((byte) 50));
				if (null == class572_sub25 || (-423333573 * class572_sub25.anInt9254 > ((((Class195) this).aClass572_Sub15_2324.b).length - (((Class195) this).aClass572_Sub15_2324.o * -1585139053))))
					break;
				((Class195) this).aClass572_Sub15_2324.writeBytes(class572_sub25.aRsByteBuffer.b, 0, class572_sub25.anInt9254 * -423333573, (byte) -93);
				anInt2327 -= -1050417047 * class572_sub25.anInt9254;
				class572_sub25.method6794((byte) 32);
				class572_sub25.aRsByteBuffer.method8449((byte) 25);
				class572_sub25.method8623(915717500);
			}
			((Class195) this).aClass555_2325.method6570(((Class195) this).aClass572_Sub15_2324.b, 0, (-1585139053 * ((Class195) this).aClass572_Sub15_2324.o), (byte) 100);
			((Class195) this).anInt2341 += (((Class195) this).aClass572_Sub15_2324.o * -1760374207);
			anInt2337 = 0;
		}
	}

	public final void method2938() throws IOException {
		if (null != ((Class195) this).aClass555_2325 && anInt2327 * -679741437 > 0) {
			((Class195) this).aClass572_Sub15_2324.o = 0;
			for (;;) {
				Class572_Sub25 class572_sub25 = ((Class572_Sub25) ((Class195) this).aClass675_2326.method7932((byte) 50));
				if (null == class572_sub25 || (-423333573 * class572_sub25.anInt9254 > ((((Class195) this).aClass572_Sub15_2324.b).length - (((Class195) this).aClass572_Sub15_2324.o * -1585139053))))
					break;
				((Class195) this).aClass572_Sub15_2324.writeBytes(class572_sub25.aRsByteBuffer.b, 0, class572_sub25.anInt9254 * -423333573, (byte) 41);
				anInt2327 -= -1050417047 * class572_sub25.anInt9254;
				class572_sub25.method6794((byte) 80);
				class572_sub25.aRsByteBuffer.method8449((byte) 113);
				class572_sub25.method8623(-244212641);
			}
			((Class195) this).aClass555_2325.method6570(((Class195) this).aClass572_Sub15_2324.b, 0, (-1585139053 * ((Class195) this).aClass572_Sub15_2324.o), (byte) 100);
			((Class195) this).anInt2341 += (((Class195) this).aClass572_Sub15_2324.o * -1760374207);
			anInt2337 = 0;
		}
	}

	void method2939() {
		if (client.cycles % 50 == 0) {
			((Class195) this).anInt2339 = ((Class195) this).anInt2341 * -11103691;
			((Class195) this).anInt2341 = 0;
			((Class195) this).anInt2328 = ((Class195) this).anInt2338 * 1352212509;
			((Class195) this).anInt2338 = 0;
		}
	}

	final void method2940() {
		((Class195) this).aClass675_2326.method7918(1688897056);
		anInt2327 = 0;
	}

	void method2941() {
		if (null != ((Class195) this).aClass555_2325) {
			((Class195) this).aClass555_2325.method6558(703719362);
			((Class195) this).aClass555_2325 = null;
		}
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	void method2942() {
		if (null != ((Class195) this).aClass555_2325) {
			((Class195) this).aClass555_2325.method6558(703719362);
			((Class195) this).aClass555_2325 = null;
		}
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	void method2943(int i) {
		if (null != ((Class195) this).aClass555_2325) {
			((Class195) this).aClass555_2325.method6558(703719362);
			((Class195) this).aClass555_2325 = null;
		}
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	void method2944() {
		((Class195) this).aClass555_2325 = null;
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	void method2945() {
		((Class195) this).aClass555_2325 = null;
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	void method2946(byte i) {
		((Class195) this).aClass555_2325 = null;
		((Class195) this).aClass14_2336.method622(null, 1883445841);
	}

	public static Class83 method2947(int i, int[] is, Class83 class83, boolean bool, int i_0_) {
		if (!Class306.aClass248_3544.method3370(i, 735196171))
			return null;
		int i_1_ = Class306.aClass248_3544.method3376(i, 646343459);
		InterfaceDefinitions[] class73s;
		if (0 == i_1_)
			class73s = new InterfaceDefinitions[0];
		else if (class83 == null)
			class73s = new InterfaceDefinitions[i_1_];
		else
			class73s = class83.aClass73Array1081;
		if (null == class83)
			class83 = new Class83(bool, class73s);
		else {
			class83.aClass73Array1081 = class73s;
			class83.aBool1079 = bool;
		}
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			if (class83.aClass73Array1081[i_2_] == null) {
				byte[] is_3_ = Class306.aClass248_3544.method3368(i, i_2_, is, -1207177924);
				if (null != is_3_) {
					InterfaceDefinitions class73 = class83.aClass73Array1081[i_2_] = new InterfaceDefinitions();
					class73.selfId = 697947061 * ((i << 16) + i_2_);
					class73.method1100(new RSByteBuffer(is_3_), 1914573037);
				}
			}
		}
		return class83;
	}

	static final void method2948(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_4_, (short) -31032);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1681379547 * class73.anInt842;
	}

	static final void method2949(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		int i_5_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class572_Sub12_Sub13 class572_sub12_sub13 = Class472.method5587(i_5_, -580255194);
		if (class572_sub12_sub13 != null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub13.anInt11455 * 155629973;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub13.anInt11454 * -406403405;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -531072985 * class572_sub12_sub13.anInt11453;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (class572_sub12_sub13.aString11457 != null ? class572_sub12_sub13.aString11457 : "");
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (class572_sub12_sub13.aString11458 != null ? class572_sub12_sub13.aString11458 : "");
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (class572_sub12_sub13.aString11460 != null ? class572_sub12_sub13.aString11460 : "");
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (null != class572_sub12_sub13.aString11461 ? class572_sub12_sub13.aString11461 : "");
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1338864731 * class572_sub12_sub13.anInt11456;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (class572_sub12_sub13.aString11462 != null ? class572_sub12_sub13.aString11462 : "");
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		}
	}

	static final void method2950(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_6_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_7_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_8_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class385.method4663(6, i_6_ << 16 | i_7_, i_8_, "", (byte) -73);
	}

	static final void method2951(Cs2Executor class441, int i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class133_Sub23.playerVarsProvider.method311(i_9_, 281592615);
	}

	public static void method2952(Interface67 interface67, int i) {
		if (null != Class585.anInterface67_7773)
			throw new IllegalStateException("");
		Class585.anInterface67_7773 = interface67;
	}
}

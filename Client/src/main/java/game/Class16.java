package game;

/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class16 {
	static int anInt127;
	static int anInt128 = 0;
	static Class662 aClass662_129;
	static Class17 aClass17_130;
	static final int anInt131 = 3;
	static Class667 aClass667_132;
	static Class655 aClass655_133;
	static String aString134;

	static {
		anInt127 = 0;
	}

	public static void method655() {
		if (client.anInt8580 * 835742603 == 6) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3709, client.aClass195_8632.aClass650_2340, -80652945);
			client.aClass195_8632.method2929(class572_sub25, (byte) -37);
			Class448.aClass668_5165 = Class668.aClass668_8512;
			aString134 = null;
		}
	}

	static void method656() {
		client.aClass195_8632.method2943(-1861493342);
		if (-1991348761 * anInt127 < 2) {
			Class633.aClass641_8208.method7596((byte) 61);
			anInt128 = 0;
			anInt127 += -1178839593;
			aClass17_130 = Class17.aClass17_136;
		} else {
			aClass17_130 = null;
			Class76.aClass651_945 = Class651.aClass651_8382;
			Class463.method5478(12, 1901981245);
		}
	}

	public static void method657() {
		if (client.anInt8580 * 835742603 == 6) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3709, client.aClass195_8632.aClass650_2340, 204008178);
			client.aClass195_8632.method2929(class572_sub25, (byte) -105);
			Class448.aClass668_5165 = Class668.aClass668_8512;
			aString134 = null;
		}
	}

	public static void method658() {
		if (client.anInt8580 * 835742603 == 6) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3709, client.aClass195_8632.aClass650_2340, 290842365);
			client.aClass195_8632.method2929(class572_sub25, (byte) -119);
			Class448.aClass668_5165 = Class668.aClass668_8512;
			aString134 = null;
		}
	}

	static boolean method659() {
		return aClass17_130 != null;
	}

	Class16() throws Throwable {
		throw new Error();
	}

	static void method660() {
		aClass17_130 = Class17.aClass17_136;
		Class76.aClass651_945 = Class651.aClass651_8387;
		aClass662_129 = Class662.aClass662_8467;
		aClass667_132 = Class667.aClass667_8503;
		Class448.aClass668_5165 = Class668.aClass668_8514;
		aClass655_133 = Class655.aClass655_8413;
		aString134 = null;
	}

	static void method661(String string) {
		Class448.aClass668_5165 = Class668.aClass668_8511;
		aString134 = string;
	}

	static void method662() {
		if (null != aClass17_130) {
			try {
				int i;
				if (anInt127 * -1991348761 == 0)
					i = 250;
				else
					i = 2000;
				anInt128 += 1774558363;
				if (anInt128 * -455415405 > i)
					Class384.method4657((byte) 33);
				if (aClass17_130 == Class17.aClass17_136) {
					client.aClass195_8632.method2931((Class402_Sub1.method9215(Class633.aClass641_8208.method7594((short) -20791), 15000, 1529178185)), Class633.aClass641_8208.address, -1657220979);
					client.aClass195_8632.method2926((byte) -66);
					Class572_Sub25 class572_sub25 = Class479.method5673((byte) 2);
					class572_sub25.aRsByteBuffer.writeByte(Class315.aClass315_3823.anInt3827 * -540596227, -1384395473);
					class572_sub25.aRsByteBuffer.writeShort(0, -2091550423);
					int i_0_ = -1585139053 * (class572_sub25.aRsByteBuffer.o);
					class572_sub25.aRsByteBuffer.writeShort(831, -1109976093);
					class572_sub25.aRsByteBuffer.writeShort(RS3Applet.MINOR_VERSION, -1607670635);
					Class246.anIntArray2684 = Class198.method2975(class572_sub25, -717078719);
					int i_1_ = -1585139053 * (class572_sub25.aRsByteBuffer.o);
					class572_sub25.aRsByteBuffer.writeString(client.aString8838, (byte) -8);
					class572_sub25.aRsByteBuffer.writeShort(client.anInt8808 * -1421244803, -1998875139);
					class572_sub25.aRsByteBuffer.writeInt(413351069 * client.anInt8567, -1743753997);
					class572_sub25.aRsByteBuffer.writeInt(2093536371 * client.anInt8566, -1743753997);
					class572_sub25.aRsByteBuffer.writeString(Class572_Sub25.aString9256, (byte) -124);
					class572_sub25.aRsByteBuffer.writeByte(Class594.aClass435_7823.getId(735254736), -1384395473);
					class572_sub25.aRsByteBuffer.writeByte(client.aClass437_8705.anInt5076 * 1002594281, -1384395473);
					Class324.method4145((class572_sub25.aRsByteBuffer), (byte) 1);
					String string = client.aString8570;
					class572_sub25.aRsByteBuffer.writeByte(null == string ? 0 : 1, -1384395473);
					if (null != string)
						class572_sub25.aRsByteBuffer.writeString(string, (byte) -36);
					Class272_Sub1.aClass572_Sub5_9450.method8376(class572_sub25.aRsByteBuffer, -248085495);
					class572_sub25.aRsByteBuffer.o += -2122211011;
					class572_sub25.aRsByteBuffer.method8489(Class246.anIntArray2684, i_1_, -1585139053 * (class572_sub25.aRsByteBuffer.o), 2061387612);
					class572_sub25.aRsByteBuffer.method8464((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i_0_), -1404479454);
					client.aClass195_8632.method2929(class572_sub25, (byte) -6);
					client.aClass195_8632.method2936((byte) -16);
					aClass17_130 = Class17.aClass17_135;
				}
				if (aClass17_130 == Class17.aClass17_135) {
					if (client.aClass195_8632.method2933(-1871568385) == null)
						Class384.method4657((byte) 50);
					else if (client.aClass195_8632.method2933(-1906812944).method6559(1, 1395909445)) {
						client.aClass195_8632.method2933(-1859321347).method6560((((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.b), 0, 1, 1324510325);
						Class76.aClass651_945 = ((Class651) Class455.method5387(Class395.method4745(2038567342), (((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.b[0]) & 0xff, -2087708978));
						if (Class76.aClass651_945 == Class651.aClass651_8383) {
							client.aClass195_8632.aClass650_2340 = new Class650(Class246.anIntArray2684);
							int[] is = new int[4];
							for (int i_2_ = 0; i_2_ < 4; i_2_++)
								is[i_2_] = Class246.anIntArray2684[i_2_] + 50;
							((Class195) client.aClass195_8632).aClass650_2331 = new Class650(is);
							new Class650(is);
							((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.method10388((((Class195) client.aClass195_8632).aClass650_2331), (byte) -45);
							Class463.method5478(6, 1455214716);
							client.aClass195_8632.method2926((byte) 5);
							((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.o = 0;
							((Class195) client.aClass195_8632).aClass321_2334 = null;
							((Class195) client.aClass195_8632).aClass321_2342 = null;
							((Class195) client.aClass195_8632).aClass321_2343 = null;
							((Class195) client.aClass195_8632).anInt2335 = 0;
							Class133_Sub23.playerVarsProvider.domain.method6070((byte) -105);
							Class280.method3795((byte) 9);
						} else
							client.aClass195_8632.method2943(-1644796980);
						((Class195) client.aClass195_8632).currentPacket = null;
						aClass17_130 = null;
					}
				}
			} catch (IOException ioexception) {
				Class384.method4657((byte) 59);
			}
		}
	}

	static void method663() {
		if (null != aClass17_130) {
			try {
				int i;
				if (anInt127 * -1991348761 == 0)
					i = 250;
				else
					i = 2000;
				anInt128 += 1774558363;
				if (anInt128 * -455415405 > i)
					Class384.method4657((byte) 9);
				if (aClass17_130 == Class17.aClass17_136) {
					client.aClass195_8632.method2931((Class402_Sub1.method9215(Class633.aClass641_8208.method7594((short) -14095), 15000, 2075472357)), Class633.aClass641_8208.address, -1657220979);
					client.aClass195_8632.method2926((byte) -51);
					Class572_Sub25 class572_sub25 = Class479.method5673((byte) 2);
					class572_sub25.aRsByteBuffer.writeByte(Class315.aClass315_3823.anInt3827 * -540596227, -1384395473);
					class572_sub25.aRsByteBuffer.writeShort(0, -1916496140);
					int i_3_ = -1585139053 * (class572_sub25.aRsByteBuffer.o);
					class572_sub25.aRsByteBuffer.writeShort(831, -1554267358);
					class572_sub25.aRsByteBuffer.writeShort(RS3Applet.MINOR_VERSION, -1899281783);
					Class246.anIntArray2684 = Class198.method2975(class572_sub25, -717078719);
					int i_4_ = -1585139053 * (class572_sub25.aRsByteBuffer.o);
					class572_sub25.aRsByteBuffer.writeString(client.aString8838, (byte) -87);
					class572_sub25.aRsByteBuffer.writeShort(client.anInt8808 * -1421244803, -870715265);
					class572_sub25.aRsByteBuffer.writeInt(413351069 * client.anInt8567, -1743753997);
					class572_sub25.aRsByteBuffer.writeInt(2093536371 * client.anInt8566, -1743753997);
					class572_sub25.aRsByteBuffer.writeString(Class572_Sub25.aString9256, (byte) -107);
					class572_sub25.aRsByteBuffer.writeByte(Class594.aClass435_7823.getId(1971584017), -1384395473);
					class572_sub25.aRsByteBuffer.writeByte(client.aClass437_8705.anInt5076 * 1002594281, -1384395473);
					Class324.method4145((class572_sub25.aRsByteBuffer), (byte) 1);
					String string = client.aString8570;
					class572_sub25.aRsByteBuffer.writeByte(null == string ? 0 : 1, -1384395473);
					if (null != string)
						class572_sub25.aRsByteBuffer.writeString(string, (byte) -93);
					Class272_Sub1.aClass572_Sub5_9450.method8376(class572_sub25.aRsByteBuffer, -248085495);
					class572_sub25.aRsByteBuffer.o += -2122211011;
					class572_sub25.aRsByteBuffer.method8489(Class246.anIntArray2684, i_4_, -1585139053 * (class572_sub25.aRsByteBuffer.o), 2017514006);
					class572_sub25.aRsByteBuffer.method8464((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i_3_), -1404479454);
					client.aClass195_8632.method2929(class572_sub25, (byte) -46);
					client.aClass195_8632.method2936((byte) 8);
					aClass17_130 = Class17.aClass17_135;
				}
				if (aClass17_130 == Class17.aClass17_135) {
					if (client.aClass195_8632.method2933(-1957811561) == null)
						Class384.method4657((byte) 117);
					else if (client.aClass195_8632.method2933(-1975207847).method6559(1, 1098633340)) {
						client.aClass195_8632.method2933(-2075884047).method6560((((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.b), 0, 1, 1371609588);
						Class76.aClass651_945 = ((Class651) Class455.method5387(Class395.method4745(2038567342), (((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.b[0]) & 0xff, -1999418477));
						if (Class76.aClass651_945 == Class651.aClass651_8383) {
							client.aClass195_8632.aClass650_2340 = new Class650(Class246.anIntArray2684);
							int[] is = new int[4];
							for (int i_5_ = 0; i_5_ < 4; i_5_++)
								is[i_5_] = Class246.anIntArray2684[i_5_] + 50;
							((Class195) client.aClass195_8632).aClass650_2331 = new Class650(is);
							new Class650(is);
							((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.method10388((((Class195) client.aClass195_8632).aClass650_2331), (byte) -44);
							Class463.method5478(6, 1537687069);
							client.aClass195_8632.method2926((byte) 32);
							((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.o = 0;
							((Class195) client.aClass195_8632).aClass321_2334 = null;
							((Class195) client.aClass195_8632).aClass321_2342 = null;
							((Class195) client.aClass195_8632).aClass321_2343 = null;
							((Class195) client.aClass195_8632).anInt2335 = 0;
							Class133_Sub23.playerVarsProvider.domain.method6070((byte) 0);
							Class280.method3795((byte) 65);
						} else
							client.aClass195_8632.method2943(-1763082034);
						((Class195) client.aClass195_8632).currentPacket = null;
						aClass17_130 = null;
					}
				}
			} catch (IOException ioexception) {
				Class384.method4657((byte) 97);
			}
		}
	}

	static void method664() {
		client.aClass195_8632.method2943(-1864844484);
		if (-1991348761 * anInt127 < 2) {
			Class633.aClass641_8208.method7596((byte) -17);
			anInt128 = 0;
			anInt127 += -1178839593;
			aClass17_130 = Class17.aClass17_136;
		} else {
			aClass17_130 = null;
			Class76.aClass651_945 = Class651.aClass651_8382;
			Class463.method5478(12, 1803982917);
		}
	}

	static void method665(String string) {
		Class448.aClass668_5165 = Class668.aClass668_8511;
		aString134 = string;
	}

	static void method666() {
		client.aClass195_8632.method2943(-2067280579);
		if (-1991348761 * anInt127 < 2) {
			Class633.aClass641_8208.method7596((byte) -49);
			anInt128 = 0;
			anInt127 += -1178839593;
			aClass17_130 = Class17.aClass17_136;
		} else {
			aClass17_130 = null;
			Class76.aClass651_945 = Class651.aClass651_8382;
			Class463.method5478(12, 898244195);
		}
	}

	static void method667() {
		client.aClass195_8632.method2943(-1797686499);
		if (-1991348761 * anInt127 < 2) {
			Class633.aClass641_8208.method7596((byte) 45);
			anInt128 = 0;
			anInt127 += -1178839593;
			aClass17_130 = Class17.aClass17_136;
		} else {
			aClass17_130 = null;
			Class76.aClass651_945 = Class651.aClass651_8382;
			Class463.method5478(12, 619894366);
		}
	}

	public static Class498[] method668(int i) {
		return (new Class498[] { Class498.aClass498_5506, Class498.aClass498_5507, Class498.aClass498_5508 });
	}

	static final void method669(Cs2Executor class441, byte i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_6_, (short) -6060);
		Class83 class83 = Class534.aClass83Array5975[i_6_ >> 16];
		Class554.method6556(class73, class83, class441, 131917601);
	}

	static final void method670(Cs2Executor class441, int i) {
		Class288.method3881(class441, Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976, -1413225113);
	}

	static Class506 method671(int i, byte i_7_) {
		Class506[] class506s = Class102.method1633(-1101556121);
		for (int i_8_ = 0; i_8_ < class506s.length; i_8_++) {
			Class506 class506 = class506s[i_8_];
			if (((Class506) class506).anInt5597 * 1772284977 == i)
				return class506;
		}
		return null;
	}
}

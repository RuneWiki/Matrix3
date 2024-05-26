package game;

/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class255 {
	protected int anInt2756;
	protected int anInt2757;
	protected int anInt2758;
	protected int anInt2759;
	protected int anInt2760;
	protected int anInt2761;
	protected boolean aBool2762;
	protected boolean aBool2763;
	protected int anInt2764;

	Class255(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_) {
		anInt2764 = -1437418705 * i;
		anInt2757 = -230431631 * i_0_;
		anInt2758 = (i_1_ > 65535 ? 65535 : i_1_) * 856802007;
		anInt2759 = i_2_ * -1405767831;
		anInt2760 = (i_3_ > 255 ? 255 : i_3_) * 2088045647;
		anInt2756 = 2109049301 * i_4_;
		aBool2762 = bool;
		aBool2763 = bool_5_;
		anInt2761 = i_6_ * -1384395473;
	}

	public static boolean method3522(int i, int i_7_) {
		if (-2026408359 * Class122.anInt1493 != i || null == Class120.aClass121_1474) {
			Class600.method7064(-1638141515);
			Class120.aClass121_1474 = Class121.aClass121_1476;
			Class122.anInt1493 = i * -1266126359;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1476) {
			byte[] is = Class392.aClass248_4664.method3373(i, (byte) -20);
			if (null == is)
				return false;
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			Class257.method3543(class572_sub15, (byte) -25);
			int i_8_ = class572_sub15.readUnsignedByte(967891013);
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				Class122.aClass675_1482.method7940(new Class572_Sub28(class572_sub15), -1510677318);
			int i_10_ = class572_sub15.readUnsignedSmart(-1545906885);
			Class122.aClass119Array1487 = new Class119[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
				Class122.aClass119Array1487[i_11_] = new Class119(class572_sub15);
			int i_12_ = class572_sub15.readUnsignedSmart(806741198);
			Class122.aClass130Array1483 = new Class130[i_12_];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
				Class122.aClass130Array1483[i_13_] = new Class130(class572_sub15, i_13_);
			int i_14_ = class572_sub15.readUnsignedSmart(51622302);
			Class442.aClass120Array5129 = new Class120[i_14_];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
				Class442.aClass120Array5129[i_15_] = new Class120(class572_sub15);
			int i_16_ = class572_sub15.readUnsignedSmart(1310873532);
			Class557.aClass118Array6331 = new Class118[i_16_];
			for (int i_17_ = 0; i_17_ < i_16_; i_17_++)
				Class557.aClass118Array6331[i_17_] = new Class118(class572_sub15);
			int i_18_ = class572_sub15.readUnsignedSmart(-2049039029);
			Class122.aClass133Array1481 = new Class133[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
				Class122.aClass133Array1481[i_19_] = Class9.method528(class572_sub15, 1837963785);
			Class120.aClass121_1474 = Class121.aClass121_1475;
		}
		if (Class120.aClass121_1474 == Class121.aClass121_1475) {
			boolean bool = true;
			Class130[] class130s = Class122.aClass130Array1483;
			for (int i_20_ = 0; i_20_ < class130s.length; i_20_++) {
				Class130 class130 = class130s[i_20_];
				if (!class130.method2264(1625677093))
					bool = false;
			}
			Class133[] class133s = Class122.aClass133Array1481;
			for (int i_21_ = 0; i_21_ < class133s.length; i_21_++) {
				Class133 class133 = class133s[i_21_];
				if (!class133.method2305(2000910233))
					bool = false;
			}
			Class120[] class120s = Class442.aClass120Array5129;
			for (int i_22_ = 0; i_22_ < class120s.length; i_22_++) {
				Class120 class120 = class120s[i_22_];
				if (!class120.method2174(1015742698))
					bool = false;
			}
			if (!bool)
				return false;
			Class120.aClass121_1474 = Class121.aClass121_1477;
		}
		return true;
	}

	static final void method3523(Cs2Executor class441, byte i) {
		int i_23_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method7863(i_23_, 1657537708);
	}

	public static void method3524(String string, int i) {
		if (client.aBool8754 && 0 != (-1613657659 * Class8.anInt43 & 0x18)) {
			boolean bool = false;
			int i_24_ = 1657484935 * Class184.anInt2163;
			int[] is = Class184.anIntArray2154;
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
				Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_25_]];
				if (null != class456_sub1_sub2_sub3_sub2.username && class456_sub1_sub2_sub3_sub2.username.equalsIgnoreCase(string) && (((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == class456_sub1_sub2_sub3_sub2) && 0 != (-1613657659 * Class8.anInt43 & 0x10)) || 0 != (-1613657659 * Class8.anInt43 & 0x8))) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3716, (client.aClass195_8589.aClass650_2340), -2141678425);
					class572_sub25.aRsByteBuffer.writeShortLE(654388253 * client.anInt8755, -971252436);
					class572_sub25.aRsByteBuffer.write128Byte(0, (byte) -13);
					class572_sub25.aRsByteBuffer.writeIntV1(-806385553 * Class167.interfaceHash, 65280);
					class572_sub25.aRsByteBuffer.writeShortLE128(client.anInt8756 * -1582286463, (byte) -87);
					class572_sub25.aRsByteBuffer.writeShortLE(is[i_25_], -971252436);
					client.aClass195_8589.method2929(class572_sub25, (byte) -9);
					Class616.method7377((class456_sub1_sub2_sub3_sub2.screenX[0]), (class456_sub1_sub2_sub3_sub2.screenY[0]), -1243880367);
					bool = true;
					break;
				}
			}
			if (!bool)
				Class670.method7882(4, new StringBuilder().append(Class279.aClass279_3037.method3758(Class594.aClass435_7823, 16711935)).append(string).toString(), -275471418);
			if (client.aBool8754)
				Class131.method2286(-1705608345);
		}
	}

	public static void method3525(String string, int i) {
		if (6 == client.anInt8580 * 835742603) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3692, client.aClass195_8632.aClass650_2340, 301891682);
			class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
			int i_26_ = (class572_sub25.aRsByteBuffer.o * -1585139053);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -18);
			class572_sub25.aRsByteBuffer.o += -2122211011;
			class572_sub25.aRsByteBuffer.method8489(Class246.anIntArray2684, i_26_, (-1585139053 * class572_sub25.aRsByteBuffer.o), 2098154057);
			class572_sub25.aRsByteBuffer.method8552((class572_sub25.aRsByteBuffer.o * -1585139053) - i_26_, 987025139);
			client.aClass195_8632.method2929(class572_sub25, (byte) -19);
			Class16.aClass655_133 = Class655.aClass655_8406;
		}
	}

	static final void method3526(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -701612380) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray887 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}
}

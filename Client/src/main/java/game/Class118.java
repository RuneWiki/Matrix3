package game;

/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Date;

public class Class118 {
	int[] anIntArray1456;
	static final int anInt1457 = 0;
	int[] anIntArray1458;
	static final int anInt1459 = 2;

	void method2153(Class130 class130, int i, int i_0_) {
		int i_1_ = ((Class118) this).anIntArray1456[0];
		class130.method2272(i, i_1_ >>> 16, i_1_ & 0xffff, -1638821762);
		Entity class456_sub1_sub2_sub3 = class130.method2268(-5954174);
		class456_sub1_sub2_sub3.stepsCount = 0;
		for (int i_2_ = ((Class118) this).anIntArray1458.length - 1; i_2_ >= 0; i_2_--) {
			int i_3_ = ((Class118) this).anIntArray1458[i_2_];
			int i_4_ = ((Class118) this).anIntArray1456[i_2_];
			class456_sub1_sub2_sub3.screenX[-2037536229 * class456_sub1_sub2_sub3.stepsCount] = i_4_ >> 16;
			class456_sub1_sub2_sub3.screenY[class456_sub1_sub2_sub3.stepsCount * -2037536229] = i_4_ & 0xffff;
			byte i_5_ = Class453.aClass453_5177.aByte5183;
			if (i_3_ == 0)
				i_5_ = Class453.aClass453_5182.aByte5183;
			else if (i_3_ == 2)
				i_5_ = Class453.aClass453_5179.aByte5183;
			class456_sub1_sub2_sub3.aByteArray11661[class456_sub1_sub2_sub3.stepsCount * -2037536229] = i_5_;
			class456_sub1_sub2_sub3.stepsCount += -298115053;
		}
	}

	Class118(RSByteBuffer class572_sub15) {
		int i = class572_sub15.readUnsignedSmart(-692155150);
		((Class118) this).anIntArray1458 = new int[i];
		((Class118) this).anIntArray1456 = new int[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			int i_7_ = class572_sub15.readUnsignedByte(1578997834);
			((Class118) this).anIntArray1458[i_6_] = i_7_;
			int i_8_ = class572_sub15.readUnsignedShort(647518597);
			int i_9_ = class572_sub15.readUnsignedShort(647518597);
			((Class118) this).anIntArray1456[i_6_] = (i_8_ << 16) + i_9_;
		}
	}

	public static void method2154(String string, int i) {
		if (LinkableInt.aStringArray9257 == null)
			Class501.method5994(-1166047028);
		client.aCalendar8872.setTime(new Date(Class69.method1067(-1939707224)));
		int i_10_ = client.aCalendar8872.get(11);
		int i_11_ = client.aCalendar8872.get(12);
		int i_12_ = client.aCalendar8872.get(13);
		String string_13_ = new StringBuilder().append(Integer.toString(i_10_ / 10)).append(i_10_ % 10).append(":").append(i_11_ / 10).append(i_11_ % 10).append(":").append(i_12_ / 10).append(i_12_ % 10).toString();
		String[] strings = Class104_Sub2.method9935(string, '\n', 207597699);
		for (int i_14_ = 0; i_14_ < strings.length; i_14_++) {
			for (int i_15_ = -1750491771 * Class190.anInt2232; i_15_ > 0; i_15_--)
				LinkableInt.aStringArray9257[i_15_] = LinkableInt.aStringArray9257[i_15_ - 1];
			LinkableInt.aStringArray9257[0] = new StringBuilder().append(string_13_).append(": ").append(strings[i_14_]).toString();
			if (null != Class5.aFileOutputStream31) {
				try {
					Class5.aFileOutputStream31.write(Class604.method7151(new StringBuilder().append(LinkableInt.aStringArray9257[0]).append("\n").toString(), (byte) 4));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (Class190.anInt2232 * -1750491771 < LinkableInt.aStringArray9257.length - 1) {
				Class190.anInt2232 += 29086541;
				if (2143380251 * Class190.anInt2233 > 0)
					Class190.anInt2233 += -639221997;
			}
		}
	}

	static final void method2155(Cs2Executor class441, int i) {
		int i_16_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_16_, (short) 11689);
		Class83 class83 = Class534.aClass83Array5975[i_16_ >> 16];
		Class539.method6402(class73, class83, false, 0, class441, (byte) -16);
	}

	static final void method2156(Cs2Executor class441, int i) {
		String string;
		if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 && (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.displayName))
			string = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10698(false, (byte) 21);
		else
			string = "";
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}

	public static char method2157(byte i, int i_17_) {
		int i_18_ = i & 0xff;
		if (i_18_ == 0)
			throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_18_, 16)).toString());
		if (i_18_ >= 128 && i_18_ < 160) {
			int i_19_ = Class436.aCharArray5066[i_18_ - 128];
			if (i_19_ == 0)
				i_19_ = 63;
			i_18_ = i_19_;
		}
		return (char) i_18_;
	}
}

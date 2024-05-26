package game;

/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class380 {
	int anInt4592;
	byte[] aByteArray4593;
	public static Class570 aClass570_4594;

	int method4634(byte i) {
		short i_0_ = 0;
		for (int i_1_ = 0; i_1_ < 2; i_1_++)
			i_0_ |= ((((Class380) this).aByteArray4593[((((Class380) this).anInt4592 += 1786231867) * 1300741363 - 1)]) & 0xff) << 8 * i_1_;
		return i_0_;
	}

	String method4635(byte i) {
		int i_2_ = method4634((byte) 125);
		if (-1 == i_2_)
			return null;
		if (i_2_ > 256)
			throw new RuntimeException_Sub2();
		String string = new String(((Class380) this).aByteArray4593, ((Class380) this).anInt4592 * 1300741363, i_2_);
		((Class380) this).anInt4592 += i_2_ * 1786231867;
		return string;
	}

	Class380(byte[] is) {
		((Class380) this).aByteArray4593 = is;
		((Class380) this).anInt4592 = 0;
	}

	int method4636() {
		short i = 0;
		for (int i_3_ = 0; i_3_ < 2; i_3_++)
			i |= ((((Class380) this).aByteArray4593[((((Class380) this).anInt4592 += 1786231867) * 1300741363 - 1)]) & 0xff) << 8 * i_3_;
		return i;
	}

	String method4637() {
		int i = method4634((byte) 16);
		if (-1 == i)
			return null;
		if (i > 256)
			throw new RuntimeException_Sub2();
		String string = new String(((Class380) this).aByteArray4593, ((Class380) this).anInt4592 * 1300741363, i);
		((Class380) this).anInt4592 += i * 1786231867;
		return string;
	}

	static final void method4638(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class112.anInt1436 * 1391452711;
	}

	static void method4639(int i) {
		Class190.aBool2238 = false;
		Class672.anIntArray8532 = null;
		Class8.anIntArray42 = null;
		Class190.anIntArray2234 = null;
		Class507.anIntArray5599 = null;
		Class54.method987((byte) 26);
	}

	static final void method4640(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class100.method1592(class73, class83, class441, -1562952180);
	}

	static void method4641(int i, int i_4_, InterfaceDefinitions class73, Class71 class71, int i_5_, int i_6_, byte i_7_) {
		Class193[] class193s = client.aClass193Array8593;
		for (int i_8_ = 0; i_8_ < class193s.length; i_8_++) {
			Class193 class193 = class193s[i_8_];
			if (class193 != null && class193.anInt2319 * -910441311 != 0 && client.cycles % 20 < 10) {
				if (1 == class193.anInt2319 * -910441311) {
					LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) (105420277 * class193.anInt2316))));
					if (class572_sub9 != null) {
						NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
						Class240 class240 = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
						int i_9_ = (int) class240.aFloat2653 / 128 - i / 128;
						int i_10_ = (int) class240.aFloat2657 / 128 - i_4_ / 128;
						Class125.method2213(class73, class71, i_5_, i_6_, i_9_, i_10_, (((Class193) class193).anInt2312 * -1800233957), 360000L);
					}
				}
				if (2 == -910441311 * class193.anInt2319) {
					int i_11_ = 230762203 * class193.anInt2315 / 128 - i / 128;
					int i_12_ = -810969519 * class193.anInt2321 / 128 - i_4_ / 128;
					long l = (long) (class193.anInt2311 * -1965971947 << 7);
					l *= l;
					Class125.method2213(class73, class71, i_5_, i_6_, i_11_, i_12_, (-1800233957 * ((Class193) class193).anInt2312), l);
				}
				if (class193.anInt2319 * -910441311 == 10 && class193.anInt2316 * 105420277 >= 0 && (class193.anInt2316 * 105420277 < (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727).length)) {
					Player class456_sub1_sub2_sub3_sub2 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[105420277 * class193.anInt2316]);
					if (null != class456_sub1_sub2_sub3_sub2) {
						Class240 class240 = (class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
						int i_13_ = (int) class240.aFloat2653 / 128 - i / 128;
						int i_14_ = (int) class240.aFloat2657 / 128 - i_4_ / 128;
						Class125.method2213(class73, class71, i_5_, i_6_, i_13_, i_14_, -1800233957 * ((Class193) class193).anInt2312, 360000L);
					}
				}
			}
		}
	}

	public static TwitchWebcamDevice method4642(int i, byte i_15_) {
		if (null == Class520.aTwitchWebcamDeviceArray5812)
			return null;
		for (int i_16_ = 0; i_16_ < Class520.aTwitchWebcamDeviceArray5812.length; i_16_++) {
			if ((Class520.aTwitchWebcamDeviceArray5812[i_16_].anInt2058 * -1183431001) == i)
				return Class520.aTwitchWebcamDeviceArray5812[i_16_];
		}
		return null;
	}

	static void method4643(File file, byte[] is, int i, int i_17_) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}
}

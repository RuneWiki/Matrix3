package game;

/* Class294 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Class294 {
	Class289 aClass289_3453;
	Map aMap3454 = new HashMap();
	static int anInt3455;
	static String aString3456;

	public void method3952() {
		Iterator iterator = ((Class294) this).aMap3454.values().iterator();
		while (iterator.hasNext()) {
			Class374 class374 = (Class374) iterator.next();
			class374.method4610((byte) 83);
		}
	}

	public void method3953(short i) {
		Iterator iterator = ((Class294) this).aMap3454.values().iterator();
		while (iterator.hasNext()) {
			Class374 class374 = (Class374) iterator.next();
			class374.method4610((byte) 117);
		}
	}

	public Class294(Class289 class289) {
		((Class294) this).aClass289_3453 = class289;
	}

	public Class374 method3954(int i, int i_0_, float f, Interface31 interface31, int i_1_) {
		if (method3955(i, 859185542) != null)
			return null;
		Class374 class374 = null;
		if (i_0_ != -1)
			class374 = method3955(i_0_, -212283353);
		Object object = ((Class294) this).aClass289_3453.method3893(class374, (byte) -50);
		Class374 class374_2_ = new Class374(i, f, object, this, interface31, class374);
		((Class294) this).aMap3454.put(Integer.valueOf(i), class374_2_);
		return class374_2_;
	}

	public Class374 method3955(int i, int i_3_) {
		return (Class374) ((Class294) this).aMap3454.get(Integer.valueOf(i));
	}

	public static int method3956(byte[] is, int i, CharSequence charsequence, int i_4_) {
		int i_5_ = charsequence.length();
		int i_6_ = i;
		for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
			int i_8_ = charsequence.charAt(i_7_);
			if (i_8_ <= 127)
				is[i_6_++] = (byte) i_8_;
			else if (i_8_ <= 2047) {
				is[i_6_++] = (byte) (0xc0 | i_8_ >> 6);
				is[i_6_++] = (byte) (0x80 | i_8_ & 0x3f);
			} else {
				is[i_6_++] = (byte) (0xe0 | i_8_ >> 12);
				is[i_6_++] = (byte) (0x80 | i_8_ >> 6 & 0x3f);
				is[i_6_++] = (byte) (0x80 | i_8_ & 0x3f);
			}
		}
		return i_6_ - i;
	}

	static void method3957(int i) {
		if (Class190.anInt2243 * 1535643091 < 102)
			Class190.anInt2243 += -937628126;
		if (-1 != 526591781 * Class190.anInt2240 && (Class570.aLong6399 * -5023858470721840995L < Class69.method1067(-2055387352))) {
			for (int i_9_ = Class190.anInt2240 * 526591781; i_9_ < Class190.aStringArray2242.length; i_9_++) {
				if (Class190.aStringArray2242[i_9_].startsWith("pause")) {
					int i_10_ = 5;
					try {
						i_10_ = Integer.parseInt(Class190.aStringArray2242[i_9_].substring(6));
					} catch (Exception exception) {
						/* empty */
					}
					Class118.method2154(new StringBuilder().append("Pausing for ").append(i_10_).append(" seconds...").toString(), -341664483);
					Class190.anInt2240 = -1907057491 * (i_9_ + 1);
					Class570.aLong6399 = (Class69.method1067(-1912229038) + (long) (1000 * i_10_)) * 6028278634427035061L;
					return;
				}
				Class190.aString2235 = Class190.aStringArray2242[i_9_];
				Class424.method5171(false, 1329419058);
			}
			Class190.anInt2240 = 1907057491;
		}
		if (0 != -1840536699 * client.anInt8787) {
			Class190.anInt2233 -= -1665378981 * client.anInt8787;
			if (2143380251 * Class190.anInt2233 >= -1750491771 * Class190.anInt2232)
				Class190.anInt2233 = Class190.anInt2232 * 1104702431 - -639221997;
			if (2143380251 * Class190.anInt2233 < 0)
				Class190.anInt2233 = 0;
			client.anInt8787 = 0;
		}
		for (int i_11_ = 0; i_11_ < -1971020205 * client.anInt8730; i_11_++) {
			Interface64 interface64 = client.anInterface64Array8607[i_11_];
			int i_12_ = interface64.method383(-1975717374);
			char c = interface64.method381((byte) 18);
			int i_13_ = interface64.method378(-825954123);
			if (84 == i_12_)
				Class424.method5171(false, 1834091173);
			if (i_12_ == 80)
				Class424.method5171(true, -886058302);
			else if (66 == i_12_ && (i_13_ & 0x4) != 0) {
				if (Class602.aClipboard7878 != null) {
					String string = "";
					for (int i_14_ = LinkableInt.aStringArray9257.length - 1; i_14_ >= 0; i_14_--) {
						if (LinkableInt.aStringArray9257[i_14_] != null && (LinkableInt.aStringArray9257[i_14_].length() > 0))
							string = new StringBuilder().append(string).append(LinkableInt.aStringArray9257[i_14_]).append('\n').toString();
					}
					Class602.aClipboard7878.setContents(new StringSelection(string), null);
				}
			} else if (i_12_ == 67 && 0 != (i_13_ & 0x4)) {
				if (null != Class602.aClipboard7878) {
					try {
						Transferable transferable = Class602.aClipboard7878.getContents(null);
						if (transferable != null) {
							String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
							if (string != null) {
								String[] strings = Class104_Sub2.method9935(string, '\n', 207597699);
								Class208.method3038(strings, (byte) 112);
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
			} else if (i_12_ == 85 && Class190.anInt2237 * -1460791607 > 0) {
				Class190.aString2235 = new StringBuilder().append(Class190.aString2235.substring(0, ((-1460791607 * (Class190.anInt2237)) - 1))).append(Class190.aString2235.substring(Class190.anInt2237 * -1460791607)).toString();
				Class190.anInt2237 -= -911481991;
			} else if (i_12_ == 101 && (Class190.anInt2237 * -1460791607 < Class190.aString2235.length()))
				Class190.aString2235 = new StringBuilder().append(Class190.aString2235.substring(0, -1460791607 * Class190.anInt2237)).append(Class190.aString2235.substring((-1460791607 * (Class190.anInt2237)) + 1)).toString();
			else if (96 == i_12_ && -1460791607 * Class190.anInt2237 > 0)
				Class190.anInt2237 -= -911481991;
			else if (i_12_ == 97 && (-1460791607 * Class190.anInt2237 < Class190.aString2235.length()))
				Class190.anInt2237 += -911481991;
			else if (i_12_ == 102)
				Class190.anInt2237 = 0;
			else if (i_12_ == 103)
				Class190.anInt2237 = Class190.aString2235.length() * -911481991;
			else if (104 == i_12_ && (-28144385 * Class190.anInt2236 < LinkableInt.aStringArray9257.length)) {
				Class190.anInt2236 += 1258582783;
				Class166.method2673((byte) 4);
				Class190.anInt2237 = Class190.aString2235.length() * -911481991;
			} else if (105 == i_12_ && Class190.anInt2236 * -28144385 > 0) {
				Class190.anInt2236 -= 1258582783;
				Class166.method2673((byte) 4);
				Class190.anInt2237 = Class190.aString2235.length() * -911481991;
			} else if (Class572.method6801(c, (byte) 8) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				Class190.aString2235 = new StringBuilder().append(Class190.aString2235.substring(0, -1460791607 * Class190.anInt2237)).append(client.anInterface64Array8607[i_11_].method381((byte) 99)).append(Class190.aString2235.substring(Class190.anInt2237 * -1460791607)).toString();
				Class190.anInt2237 += -911481991;
			}
		}
		client.anInt8730 = 0;
		client.anInt8609 = 0;
		if (Class269.anInt2861 * 1960824389 >> 1 != Class572_Sub12_Sub6.anIntArray11366.length)
			Class572_Sub12_Sub6.anIntArray11366 = new int[1960824389 * Class269.anInt2861 >> 1];
		for (int i_15_ = 0; i_15_ < 100; i_15_++) {
			Class8.anIntArray42[i_15_] += Class507.anIntArray5599[i_15_];
			if (Class8.anIntArray42[i_15_] >> 4 >= 350) {
				int i_16_ = Class672.anIntArray8532[i_15_] >> 4;
				int i_17_ = Class672.anIntArray8532[i_15_] & 0xf;
				i_16_ += ((Class325.anIntArray4103[64 * (350 + (i_16_ & 0x40)) + 1023 * i_17_ & 0x3fff]) >> 10);
				i_16_ >>= 1;
				for (int i_18_ = -3; i_18_ <= 3; i_18_++) {
					if (i_18_ + i_16_ >= 0 && (i_18_ + i_16_ < Class572_Sub12_Sub6.anIntArray11366.length))
						Class572_Sub12_Sub6.anIntArray11366[i_18_ + i_16_] += 4 - Math.abs(i_18_);
				}
				Class672.anIntArray8532[i_15_] = ((int) (Math.random() * (double) (Class269.anInt2861 * 1960824389)) << 4) + (int) (Math.random() * 15.0);
				Class8.anIntArray42[i_15_] = 0;
				Class190.anIntArray2234[i_15_] = (int) (Math.random() * 102.0) + 51;
				Class507.anIntArray5599[i_15_] = 8 + (int) (Math.random() * 48.0);
			}
		}
		Class54.method987((byte) 90);
	}

	static final void method3958(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class597.method7041(class73, class83, class441, (byte) 127);
	}

	static final void method3959(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) -34) == null ? -1 : (Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 32).anInt4937) * 248285345);
	}

	static void method3960(int i, String string, int i_19_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(3, (long) i);
		class572_sub12_sub11.method10338(1390564648);
		((GameTask) class572_sub12_sub11).aString11408 = string;
	}
}

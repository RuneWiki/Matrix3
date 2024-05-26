package game;

/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Class246 {
	Class617 this$0;
	static int[] anIntArray2684;
	byte[] aByteArray2685;

	byte[] method3354(byte i) {
		return ((Class246) this).aByteArray2685;
	}

	Class246(Class617 class617, InputStream inputstream, Class572_Sub12_Sub16_Sub1 class572_sub12_sub16_sub1, URL url) {
		((Class246) this).this$0 = class617;
		((Class246) this).aByteArray2685 = null;
		if (null != inputstream) {
			int i = 10240;
			RSByteBuffer class572_sub15 = new RSByteBuffer(i, true);
			int i_0_ = 0;
			byte[] is = Class448.method5351(1024, 2059665611);
			while (i_0_ >= 0) {
				try {
					i_0_ = inputstream.read(is);
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
					i_0_ = -1;
				}
				if (i_0_ > 0) {
					if (-1585139053 * class572_sub15.o + i_0_ >= class572_sub15.b.length) {
						int i_1_ = 10240 + class572_sub15.b.length;
						byte[] is_2_ = Class448.method5350(i_1_, true, 22451597);
						System.arraycopy(class572_sub15.b, 0, is_2_, 0, (class572_sub15.o * -1585139053));
						Class448.method5355(class572_sub15.b, (byte) 78);
						class572_sub15.b = is_2_;
					}
					class572_sub15.writeBytes(is, 0, i_0_, (byte) 8);
				}
			}
			for (int i_3_ = 0; i_3_ < -1977344173 * ((Class572_Sub12_Sub16_Sub1) class572_sub12_sub16_sub1).anInt11727; i_3_++)
				class572_sub15.writeByte(0, -1384395473);
			byte[] is_4_ = new byte[-1585139053 * class572_sub15.o];
			System.arraycopy(class572_sub15.b, 0, is_4_, 0, class572_sub15.o * -1585139053);
			class572_sub15.method8449((byte) 117);
			Object object = null;
			Class448.method5355(is, (byte) 83);
			Object object_5_ = null;
			((Class246) this).aByteArray2685 = is_4_;
			try {
				inputstream.close();
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
		}
		((Class572_Sub12_Sub16_Sub1) class572_sub12_sub16_sub1).aBool11476 = false;
		class617.method7381((byte) -35);
	}

	static final void method3355(Cs2Executor class441, byte i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_6_, (short) 15700);
		Class83 class83 = Class534.aClass83Array5975[i_6_ >> 16];
		Class64.method1029(class73, class83, class441, 2111201986);
	}

	static final void method3356(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class435.method5266(client.anInt8580 * 835742603, (byte) -107) ? 1 : 0);
	}

	static final void method3357(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_7_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_8_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_9_ = (((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class385.method4663(7, i_7_ << 16 | i_8_, i_9_, "", (byte) -67);
	}

	static void method3358(boolean bool, int i) {
		if (bool) {
			if (-1 != client.anInt8790 * -507155049)
				Class7.method506(-507155049 * client.anInt8790, 1835523273);
			for (Class572_Sub29 class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7968((byte) -59)); null != class572_sub29; class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7969(-282369636))) {
				if (!class572_sub29.method6793((short) 150)) {
					class572_sub29 = ((Class572_Sub29) client.aClass676_8760.method7968((byte) 46));
					if (null == class572_sub29)
						break;
				}
				Class96.method1554(class572_sub29, true, false, 1218525863);
			}
			client.anInt8790 = 254025177;
			client.aClass676_8760 = new Class676(8);
			Class103.method1642(-1102137154);
			client.anInt8790 = JS5ConfigGroup.aClass484_2593.anInt5403 * 107141637;
			if (-1 != -507155049 * client.anInt8790) {
				Class288.method3884(false, (byte) -4);
				Class54.method987((byte) 89);
				Class627.method7475(-507155049 * client.anInt8790, null, 37407838);
			}
		}
		Class13.aBool114 = true;
	}

	static final void method3359(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		int i_17_ = i_15_ - 334;
		if (i_17_ < 0)
			i_17_ = 0;
		else if (i_17_ > 100)
			i_17_ = 100;
		int i_18_ = (client.aShort8849 + (client.aShort8668 - client.aShort8849) * i_17_ / 100);
		i_14_ = i_14_ * i_18_ >> 8;
		int i_19_ = 16384 - i_12_ & 0x3fff;
		int i_20_ = 16384 - i_13_ & 0x3fff;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = i_14_;
		if (0 != i_19_) {
			i_22_ = -i_23_ * Class325.anIntArray4103[i_19_] >> 14;
			i_23_ = Class325.anIntArray4105[i_19_] * i_23_ >> 14;
		}
		if (0 != i_20_) {
			i_21_ = i_23_ * Class325.anIntArray4103[i_20_] >> 14;
			i_23_ = i_23_ * Class325.anIntArray4105[i_20_] >> 14;
		}
		Class36.anInt387 = (i - i_21_) * 70707251;
		Class572_Sub13_Sub2.anInt11451 = -371247041 * (i_10_ - i_22_);
		Class49.anInt490 = (i_11_ - i_23_) * -114706035;
		Class455.anInt5187 = 58615007 * i_12_;
		Class406.anInt4765 = 1259382101 * i_13_;
		Class88.anInt1225 = 0;
	}

	static void method3360(Class572_Sub25 class572_sub25, int i, int i_24_, int i_25_, int i_26_) {
		class572_sub25.aRsByteBuffer.writeIntLE(i, (byte) 31);
		class572_sub25.aRsByteBuffer.writeShort(i_25_, -1283778087);
		class572_sub25.aRsByteBuffer.writeShortLE128(i_24_, (byte) -117);
	}

	static final void method3361(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (client.rights * -1550439133 != 0 || (!client.aBool8734 || client.aBool8596) && !client.aBool8738) {
			String string_27_ = string.toLowerCase();
			int i_28_ = 0;
			if (string_27_.startsWith(Class279.aClass279_3041.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 0;
				string = string.substring(Class279.aClass279_3041.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3109.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 1;
				string = string.substring(Class279.aClass279_3109.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3110.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 2;
				string = string.substring(Class279.aClass279_3110.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3119.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 3;
				string = string.substring(Class279.aClass279_3119.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3112.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 4;
				string = string.substring(Class279.aClass279_3112.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3116.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 5;
				string = string.substring(Class279.aClass279_3116.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3114.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 6;
				string = string.substring(Class279.aClass279_3114.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3055.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 7;
				string = string.substring(Class279.aClass279_3055.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_2995.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 8;
				string = string.substring(Class279.aClass279_2995.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3098.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 9;
				string = string.substring(Class279.aClass279_3098.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3118.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 10;
				string = string.substring(Class279.aClass279_3118.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3091.method3758(Class435.aClass435_5054, 16711935))) {
				i_28_ = 11;
				string = string.substring(Class279.aClass279_3091.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (Class435.aClass435_5054 != Class594.aClass435_7823) {
				if (string_27_.startsWith(Class279.aClass279_3041.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 0;
					string = string.substring(Class279.aClass279_3041.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3109.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 1;
					string = string.substring(Class279.aClass279_3109.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3110.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 2;
					string = string.substring(Class279.aClass279_3110.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3119.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 3;
					string = string.substring(Class279.aClass279_3119.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3112.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 4;
					string = string.substring(Class279.aClass279_3112.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3116.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 5;
					string = string.substring(Class279.aClass279_3116.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3114.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 6;
					string = string.substring(Class279.aClass279_3114.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3055.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 7;
					string = string.substring(Class279.aClass279_3055.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_2995.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 8;
					string = string.substring(Class279.aClass279_2995.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3098.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 9;
					string = string.substring(Class279.aClass279_3098.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3118.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 10;
					string = string.substring(Class279.aClass279_3118.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3091.method3758(Class594.aClass435_7823, 16711935))) {
					i_28_ = 11;
					string = string.substring(Class279.aClass279_3091.method3758(Class594.aClass435_7823, 16711935).length());
				}
			}
			string_27_ = string.toLowerCase();
			int i_29_ = 0;
			if (string_27_.startsWith(Class279.aClass279_3120.method3758(Class435.aClass435_5054, 16711935))) {
				i_29_ = 1;
				string = string.substring(Class279.aClass279_3120.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3121.method3758(Class435.aClass435_5054, 16711935))) {
				i_29_ = 2;
				string = string.substring(Class279.aClass279_3121.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_3013.method3758(Class435.aClass435_5054, 16711935))) {
				i_29_ = 3;
				string = string.substring(Class279.aClass279_3013.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_2962.method3758(Class435.aClass435_5054, 16711935))) {
				i_29_ = 4;
				string = string.substring(Class279.aClass279_2962.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (string_27_.startsWith(Class279.aClass279_2982.method3758(Class435.aClass435_5054, 16711935))) {
				i_29_ = 5;
				string = string.substring(Class279.aClass279_2982.method3758(Class435.aClass435_5054, 16711935).length());
			} else if (Class435.aClass435_5054 != Class594.aClass435_7823) {
				if (string_27_.startsWith(Class279.aClass279_3120.method3758(Class594.aClass435_7823, 16711935))) {
					i_29_ = 1;
					string = string.substring(Class279.aClass279_3120.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3121.method3758(Class594.aClass435_7823, 16711935))) {
					i_29_ = 2;
					string = string.substring(Class279.aClass279_3121.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_3013.method3758(Class594.aClass435_7823, 16711935))) {
					i_29_ = 3;
					string = string.substring(Class279.aClass279_3013.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_2962.method3758(Class594.aClass435_7823, 16711935))) {
					i_29_ = 4;
					string = string.substring(Class279.aClass279_2962.method3758(Class594.aClass435_7823, 16711935).length());
				} else if (string_27_.startsWith(Class279.aClass279_2982.method3758(Class594.aClass435_7823, 16711935))) {
					i_29_ = 5;
					string = string.substring(Class279.aClass279_2982.method3758(Class594.aClass435_7823, 16711935).length());
				}
			}
			Class195 class195 = Class166.method2676((byte) 17);
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3689, class195.aClass650_2340, -1189354537);
			class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
			int i_30_ = (-1585139053 * class572_sub25.aRsByteBuffer.o);
			class572_sub25.aRsByteBuffer.writeByte(i_28_, -1384395473);
			class572_sub25.aRsByteBuffer.writeByte(i_29_, -1384395473);
			Class25.method752(class572_sub25.aRsByteBuffer, string, (byte) 36);
			class572_sub25.aRsByteBuffer.method8552((class572_sub25.aRsByteBuffer.o * -1585139053) - i_30_, -848680738);
			class195.method2929(class572_sub25, (byte) -96);
		}
	}
}

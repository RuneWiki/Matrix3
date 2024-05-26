package game;

/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Arrays;

public class PacketsDecoder implements Interface52 {
	int anInt2419;
	public static PacketsDecoder aClass207_2420 = new PacketsDecoder(2, 0, "", "");
	static PacketsDecoder aClass207_2421;
	public static PacketsDecoder aClass207_2422;
	static PacketsDecoder aClass207_2423;
	String aString2424;
	static PacketsDecoder aClass207_2425 = new PacketsDecoder(0, 1, "", "");
	public static PacketsDecoder aClass207_2426;
	public static PacketsDecoder aClass207_2427;
	int anInt2428;
	public static PacketsDecoder aClass207_2429;
	static int anInt2430;

	public int method45() {
		return ((PacketsDecoder) this).anInt2428 * -2139878395;
	}

	PacketsDecoder(int i, int i_0_, String string, String string_1_) {
		((PacketsDecoder) this).anInt2419 = 205912789 * i;
		((PacketsDecoder) this).anInt2428 = 1773592781 * i_0_;
		((PacketsDecoder) this).aString2424 = string_1_;
	}

	public int getId(int i) {
		return ((PacketsDecoder) this).anInt2428 * -2139878395;
	}

	public String toString() {
		return ((PacketsDecoder) this).aString2424;
	}

	static {
		aClass207_2421 = new PacketsDecoder(7, 2, "", "");
		aClass207_2422 = new PacketsDecoder(6, 3, "", "");
		aClass207_2423 = new PacketsDecoder(3, 4, "", "");
		aClass207_2429 = new PacketsDecoder(1, 5, "", "");
		aClass207_2427 = new PacketsDecoder(4, 6, "", "");
		aClass207_2426 = new PacketsDecoder(5, -1, "", "", true, new PacketsDecoder[] { aClass207_2420, aClass207_2425, aClass207_2421, aClass207_2423, aClass207_2422 });
	}

	PacketsDecoder(int i, int i_2_, String string, String string_3_, boolean bool, PacketsDecoder[] class207s) {
		((PacketsDecoder) this).anInt2419 = i * 205912789;
		((PacketsDecoder) this).anInt2428 = 1773592781 * i_2_;
		((PacketsDecoder) this).aString2424 = string_3_;
	}

	public int method143() {
		return ((PacketsDecoder) this).anInt2428 * -2139878395;
	}

	public String method3029() {
		return ((PacketsDecoder) this).aString2424;
	}

	public int method61() {
		return ((PacketsDecoder) this).anInt2428 * -2139878395;
	}

	public String method3030() {
		return ((PacketsDecoder) this).aString2424;
	}

	public int method43() {
		return ((PacketsDecoder) this).anInt2428 * -2139878395;
	}

	static final boolean method3031(Class195 class195, byte i) throws IOException {
		Class555 class555 = class195.method2933(-1963590090);
		Class572_Sub15_Sub2 buf = class195.aClass572_Sub15_Sub2_2330;
		if (class555 == null)
			return false;
		if (class195.currentPacket == null) {
			if (class195.aBool2329) {
				if (!class555.method6559(1, 1218998614))
					return false;
				class555.method6560((class195.aClass572_Sub15_Sub2_2330.b), 0, 1, 1867358225);
				class195.anInt2338 += -1156405179;
				class195.anInt2335 = 0;
				class195.aBool2329 = false;
			}
			buf.o = 0;
			if (buf.method10391(1831284443)) {
				if (!class555.method6559(1, 1909290069))
					return false;
				class555.method6560((class195.aClass572_Sub15_Sub2_2330.b), 1, 1, 1745207788);
				class195.anInt2338 += -1156405179;
				class195.anInt2335 = 0;
			}
			class195.aBool2329 = true;
			IncomingPacket[] class321s = Class121.method2181(2098538599);
			int i_4_ = buf.method10392((short) 21505);
			if (i_4_ < 0 || i_4_ >= class321s.length)
				throw new IOException(new StringBuilder().append(i_4_).append(" ").append(-1585139053 * buf.o).toString());
			class195.currentPacket = class321s[i_4_];
			class195.anInt2333 = class195.currentPacket.length * -2032795665;
		}
		if (-1 == -875297237 * class195.anInt2333) {
			if (!class555.method6559(1, 66760578))
				return false;
			class555.method6560(buf.b, 0, 1, 1359980675);
			class195.anInt2333 = -1699837821 * (buf.b[0] & 0xff);
			class195.anInt2338 += -1156405179;
			class195.anInt2335 = 0;
		}
		if (-2 == -875297237 * class195.anInt2333) {
			if (!class555.method6559(2, 521800571))
				return false;
			class555.method6560(buf.b, 0, 2, 2086773373);
			buf.o = 0;
			class195.anInt2333 = buf.readUnsignedShort(647518597) * -1699837821;
			class195.anInt2338 += 1982156938;
			class195.anInt2335 = 0;
		}
		if (class195.anInt2333 * -875297237 > 0) {
			if (!class555.method6559((-875297237 * class195.anInt2333), 1322063089))
				return false;
			buf.o = 0;
			class555.method6560(buf.b, 0, class195.anInt2333 * -875297237, 1891533215);
			class195.anInt2338 += class195.anInt2333 * -331882089;
			class195.anInt2335 = 0;
		}
		class195.aClass321_2343 = class195.aClass321_2342;
		class195.aClass321_2342 = class195.aClass321_2334;
		class195.aClass321_2334 = class195.currentPacket;
		// int id_0 = class195.currentPacket.id * 1839801621;
		// if (id_0 != 9 && id_0 != 102 && id_0 != 152 && id_0 != 132 && id_0 != 21 && id_0 != 85)
		// System.out.println(id_0);
		if (class195.currentPacket == IncomingPacket.aClass321_3969) {
			int i_5_ = buf.readUnsignedShort(647518597);
			int i_6_ = buf.readUnsignedShort(647518597);
			int i_7_ = buf.readUnsignedShort(647518597);
			Class344.audio.method953(i_5_, i_6_, i_7_, -1097604363);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4001) {
			Class565_Sub1.method8259(541581680);
			Class133_Sub4.method9340(Class111.method2081((byte) -52), (short) 27276);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.REMOVE_OBJECT) {
			Class65.method1035(Class301.REMOVE_OBJECT, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4052 == class195.currentPacket) {
			int i_8_ = buf.readIntV2(512198035);
			int i_9_ = buf.readUnsignedShort(647518597);
			int i_10_ = buf.readUnsignedShort128((byte) 80);
			int i_11_ = buf.readUnsignedShortLE((byte) 9);
			Class565_Sub1.method8259(-1105349753);
			Class102_Sub5.method9950(i_8_, 7, i_10_ << 16 | i_11_, i_9_, (byte) -15);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.GAME_MESSAGE == class195.currentPacket) {
			int i_12_ = buf.readUnsignedSmart(-727377891);
			int i_13_ = buf.readInt(530762617);
			int i_14_ = buf.readUnsignedByte(721841311);
			String string = "";
			String string_15_ = string;
			if (0 != (i_14_ & 0x1)) {
				string = buf.readString(1295706626);
				if (0 != (i_14_ & 0x2))
					string_15_ = buf.readString(1295706626);
				else
					string_15_ = string;
			}
			String string_16_ = buf.readString(1295706626);
			if (99 == i_12_)
				Class118.method2154(string_16_, 1791666081);
			else if (i_12_ == 98)
				RSByteBuffer.method8558(string_16_, (byte) 16);
			else {
				if (!string_15_.equals("") && Class616.method7378(string_15_, -2113178541)) {
					class195.currentPacket = null;
					return true;
				}
				Class375_Sub3.method8878(i_12_, i_13_, string, string_15_, string, string_16_, 1875123150);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.MUSIC_EFFECT_PACKET) {
			int i_17_ = buf.readUnsignedShortLE((byte) -36);
			if (65535 == i_17_)
				i_17_ = -1;
			int i_18_ = buf.readUnsigned128Byte((byte) 30);
			Class344.audio.sendMusicEffect(i_17_, i_18_);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.OBJECT_ANIMATION == class195.currentPacket) {
			int animationId = buf.readIntV1((byte) 0);
			int i_20_ = animationId >> 28 & 0x3;
			int i_21_ = animationId >> 14 & 0x3fff;
			int i_22_ = animationId & 0x3fff;
			int typeHash = buf.readUnsigned128Byte((byte) 126);
			int i_24_ = typeHash >> 2;
			int i_25_ = typeHash & 0x3;
			int i_26_ = client.anIntArray8713[i_24_];
			int i_27_ = buf.readUnsignedByteC(-1950755307);
			int i_28_ = buf.readInt(178405508);
			Class497 class497 = client.aClass613_8605.method7280((byte) -12);
			i_21_ -= class497.localX * -2109597897;
			i_22_ -= class497.localY * 417324155;
			Class665_Sub24.method9083(i_20_, i_21_, i_22_, i_26_, i_24_, i_25_, i_28_, i_27_, -124613373);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3994) {
			String string = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_29_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = ((Class319) Class455.method5387(Class428.method5212((byte) -16), buf.readUnsignedByte(1597365291), -1955311045));
			boolean bool = buf.readUnsignedByte(-103726918) == 1;
			int i_30_ = buf.readUnsignedShort(647518597);
			long l_31_ = l_29_ + (l << 32);
			boolean bool_32_ = false;
			while_20_: do {
				if (null == Class221.aClass49_2607)
					bool_32_ = true;
				else {
					for (int i_33_ = 0; i_33_ < 100; i_33_++) {
						if (client.aLongArray8834[i_33_] == l_31_) {
							bool_32_ = true;
							break while_20_;
						}
					}
					if (class319.aBool3878 && Class616.method7378(string, -69572383))
						bool_32_ = true;
				}
			} while (false);
			if (!bool_32_) {
				client.aLongArray8834[client.anInt8817 * -307333839] = l_31_;
				client.anInt8817 = (client.anInt8817 * -307333839 + 1) % 100 * -1968258095;
				String string_34_ = Class111.aClass244_1428.method3345(i_30_, -575303038).method10434(buf, -1242058187);
				int i_35_ = bool ? 23 : 25;
				if (-1 != -1848967575 * class319.anInt3877)
					Class241.method3327(i_35_, 0, new StringBuilder().append(Class520.method6215((class319.anInt3877 * -1848967575), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), string, string_34_, Class221.aClass49_2607.method855(-1368250860), i_30_, (byte) 51);
				else
					Class241.method3327(i_35_, 0, string, string, string, string_34_, Class221.aClass49_2607.method855(-169399810), i_30_, (byte) 127);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.FRIENDS_CHAT_PACKET == class195.currentPacket) {
			client.anInt8858 = 920622699 * client.anInt8839;
			if (0 == class195.anInt2333 * -875297237) {
				client.aString8887 = null;
				client.aString8837 = null;
				Class456_Sub1_Sub1_Sub1.anInt11558 = 0;
				Class328.aClass196Array4209 = null;
				class195.currentPacket = null;
				return true;
			}
			client.aString8837 = buf.readString(1295706626);
			boolean bool = buf.readUnsignedByte(628277376) == 1;
			if (bool)
				buf.readString(1295706626);
			client.aString8887 = buf.readString(1295706626);
			Class422.aByte4988 = buf.readByte(815581364);
			int i_36_ = buf.readUnsignedByte(1123248278);
			if (i_36_ == 255) {
				class195.currentPacket = null;
				return true;
			}
			Class456_Sub1_Sub1_Sub1.anInt11558 = -1526660351 * i_36_;
			Class196[] class196s = new Class196[100];
			for (int i_37_ = 0; i_37_ < Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641; i_37_++) {
				class196s[i_37_] = new Class196();
				class196s[i_37_].aString2350 = buf.readString(1295706626);
				bool = buf.readUnsignedByte(1191545379) == 1;
				if (bool)
					class196s[i_37_].aString2349 = buf.readString(1295706626);
				else
					class196s[i_37_].aString2349 = class196s[i_37_].aString2350;
				((Class196) class196s[i_37_]).aString2353 = Class251.method3503(class196s[i_37_].aString2349, Class414.aClass207_4922, -338112088);
				class196s[i_37_].anInt2351 = buf.readUnsignedShort(647518597) * -354994579;
				class196s[i_37_].aByte2348 = buf.readByte(1841509657);
				class196s[i_37_].aString2352 = buf.readString(1295706626);
				if (class196s[i_37_].aString2349.equals(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username))
					Class477.aByte5334 = class196s[i_37_].aByte2348;
			}
			boolean bool_38_ = false;
			int i_39_ = 1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558;
			do {
				if (i_39_ <= 0)
					break;
				bool_38_ = true;
				i_39_--;
				for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
					if ((((Class196) class196s[i_40_]).aString2353.compareTo(((Class196) class196s[i_40_ + 1]).aString2353)) > 0) {
						Class196 class196 = class196s[i_40_];
						class196s[i_40_] = class196s[i_40_ + 1];
						class196s[i_40_ + 1] = class196;
						bool_38_ = false;
					}
				}
			} while (!bool_38_);
			Class328.aClass196Array4209 = class196s;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.MINIMAP_FLAG == class195.currentPacket) {
			int y = buf.readUnsignedByteC(1060912918);
			int x = buf.readUnsignedByteC(721396280);
			if (x == 255) {
				x = -1;
				y = -1;
			}
			Class587.method6966(x, y, -989688788);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SET_MOUSE_PACKET == class195.currentPacket) {
			Class375_Sub3.aString9521 = (class195.anInt2333 * -875297237 > 2 ? buf.readString(1295706626) : Class279.aClass279_3015.method3758(Class594.aClass435_7823, 16711935));
			client.anInt8744 = ((-875297237 * class195.anInt2333 > 0 ? buf.readUnsignedShort(647518597) : -1) * -636981945);
			if (65535 == 348859511 * client.anInt8744)
				client.anInt8744 = 636981945;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4069 == class195.currentPacket) {
			client.anInt8563 = client.anInt8839 * -1594550185;
			if (class195.anInt2333 * -875297237 == 0)
				Class221.aClass49_2607 = null;
			else
				Class221.aClass49_2607 = new Class49(0L, buf, true, client.anInterface1_8558);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4014 == class195.currentPacket) {
			int i_43_ = buf.readUnsignedShortLE((byte) 56);
			int i_44_ = buf.readUnsignedByte128(1747638582);
			int i_45_ = buf.readUnsignedShortLE128((byte) 13);
			int i_46_ = buf.readIntV2(1940207761);
			int i_47_ = buf.readIntV1((byte) 0);
			Class497 class497 = new Class497(buf.readIntLE(2103167671));
			int i_48_ = buf.readIntLE(2130814020);
			int i_49_ = buf.readInt(1122598488);
			int i_50_ = buf.readIntLE(2142391613);
			Class565_Sub1.method8259(492134566);
			Class104_Sub1.method9918(i_47_, new Class572_Sub29_Sub4(i_43_, i_44_, new Class431(class497, i_45_)), new int[] { i_46_, i_49_, i_50_, i_48_ }, false, (byte) 0);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.OPEN_URL == class195.currentPacket) {
			if (Class637.aBool8266 && Class554.aFrame6320 != null)
				Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(-39132321), -1, -1, false, 623786968);
			byte[] is = new byte[-875297237 * class195.anInt2333 - 1];
			boolean bool = buf.readUnsignedByte(120159437) == 1;
			buf.method10393(is, 0, -875297237 * (class195.anInt2333) - 1, 1508954050);
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			String string = class572_sub15.readString(1295706626);
			if (bool) {
				String string_51_ = class572_sub15.readString(1295706626);
				if (string_51_.length() == 0)
					string_51_ = string;
				if (!client.aBool8559 || Class572_Sub12_Sub2.aString11255.startsWith("mac") || !Class177.method2762(string, 1, Class212.aClass212_2456.method3063(-1850453998), -1165363101))
					Class611.method7271(string_51_, true, client.aBool8621, (byte) -84);
			} else
				Class611.method7271(string, true, client.aBool8621, (byte) 20);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3968) {
			boolean bool = buf.readUnsignedByte(633651001) == 1;
			String string = buf.readString(1295706626);
			String string_52_ = string;
			if (bool)
				string_52_ = buf.readString(1295706626);
			String string_53_ = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_54_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = ((Class319) Class455.method5387(Class428.method5212((byte) -7), buf.readUnsignedByte(1558515778), -1862863521));
			int i_55_ = buf.readUnsignedShort(647518597);
			long l_56_ = (l << 32) + l_54_;
			boolean bool_57_ = false;
			while_21_: do {
				for (int i_58_ = 0; i_58_ < 100; i_58_++) {
					if (l_56_ == client.aLongArray8834[i_58_]) {
						bool_57_ = true;
						break while_21_;
					}
				}
				if (class319.aBool3878 && Class616.method7378(string_52_, 924612604))
					bool_57_ = true;
			} while (false);
			if (!bool_57_) {
				client.aLongArray8834[client.anInt8817 * -307333839] = l_56_;
				client.anInt8817 = -1968258095 * ((1 + client.anInt8817 * -307333839) % 100);
				String string_59_ = Class111.aClass244_1428.method3345(i_55_, -1035360690).method10434(buf, -1242058187);
				if (-1848967575 * class319.anInt3877 != -1)
					Class241.method3327(20, 0, new StringBuilder().append(Class520.method6215((class319.anInt3877 * -1848967575), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string_52_).toString(), string, string_59_, string_53_, i_55_, (byte) 119);
				else
					Class241.method3327(20, 0, string, string_52_, string, string_59_, string_53_, i_55_, (byte) 113);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CLAN_CHANNEL_PACKET) {
			client.anInt8805 = -1190757321 * client.anInt8839;
			boolean bool = buf.readUnsignedByte(1805440841) == 1;
			if (1 == -875297237 * class195.anInt2333) {
				if (bool)
					Class440.aClass334_5097 = null;
				else
					Class210.aClass334_2440 = null;
				class195.currentPacket = null;
				return true;
			}
			if (bool)
				Class440.aClass334_5097 = new Class334(buf);
			else
				Class210.aClass334_2440 = new Class334(buf);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.SOUND_EFFECT_PACKET) {//Music related, Max volume?
			int i_60_ = buf.readUnsignedShort(647518597);
			if (65535 == i_60_)
				i_60_ = -1;
			int i_61_ = buf.readUnsignedByte(1363507206);
			int i_62_ = buf.readUnsignedShort(647518597);
			int i_63_ = buf.readUnsignedByte(1203182433);
			Class344.audio.sendSoundEffect(Class124.aClass124_1504, i_60_, i_61_, i_63_, Class126.aClass126_1511.method2215(-458120353), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, 256, i_62_);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3915 == class195.currentPacket) {
			Class300.method3987(2065913572);
			class195.currentPacket = null;
			return false;
		}
		if (class195.currentPacket == IncomingPacket.PLAYER_WEIGHT) {
			client.anInt8765 = buf.readShort(-710976385) * 1919190063;
			client.anInt8729 = 653930141 * client.anInt8839;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3897 == class195.currentPacket) {
			Class65.method1035(Class301.aClass301_3491, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3965) {
			int i_64_ = buf.readUnsignedByte(1140112445);
			Class668 class668 = ((Class668) Class455.method5387(Class265.method3625(1143122670), i_64_, -2136843769));
			if (class668 == null)
				class668 = Class668.aClass668_8513;
			Class10.method545(class668, 1067820657);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CUTSCENE) {
			int i_65_ = buf.readUnsignedShort(647518597);
			client.anInt8648 = 1389120501;
			client.anInt8645 = -664497205 * i_65_;
			client.anInt8646 = -1143570614;
			Class392.aClass248_4664.method3383(client.anInt8645 * 1545763299, 179138293);
			Class35.method782((short) 582);
			Class345.method4317((byte) -83);
			int i_66_ = buf.readUnsignedShort(647518597);
			client.anInt8577 = 208681879 * i_66_;
			int i_67_ = buf.readUnsignedByte(572979568);
			Class481.aClass572_Sub15_5361 = new RSByteBuffer(i_67_);
			Class481.aClass572_Sub15_5361.writeBytes(buf.b, buf.o * -1585139053, i_67_, (byte) -48);
			buf.o += 310393755 * i_67_;
			class195.currentPacket = null;
			return false;
		}
		if (IncomingPacket.RESET_MUSIC == class195.currentPacket) {
			Class344.audio.method933(buf.readUnsignedShort(647518597), 2016971639);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PUBLIC_CHAT == class195.currentPacket) {
			int i_68_ = buf.readUnsignedShort(647518597);
			Player class456_sub1_sub2_sub3_sub2;
			if (-1921142451 * client.anInt8728 == i_68_)
				class456_sub1_sub2_sub3_sub2 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
			else
				class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_68_];
			if (class456_sub1_sub2_sub3_sub2 == null) {
				class195.currentPacket = null;
				return true;
			}
			int effects = buf.readUnsignedShort(647518597);
			Class319 class319 = ((Class319) Class455.method5387(Class428.method5212((byte) 17), buf.readUnsignedByte(154676373), -2006749711));
			boolean bool = (effects & 0x8000) != 0;
			if (null != class456_sub1_sub2_sub3_sub2.username && class456_sub1_sub2_sub3_sub2.aClass474_11831 != null) {
				boolean bool_70_ = false;
				if (class319.aBool3878) {
					if (!bool && (client.aBool8734 && !client.aBool8596 || client.aBool8738))
						bool_70_ = true;
					else if (Class616.method7378((class456_sub1_sub2_sub3_sub2.username), -1932067885))
						bool_70_ = true;
				}
				if (!bool_70_) {
					int i_71_ = -1;
					String string;
					if (bool) {
						effects &= 0x7fff;
						Class305 class305 = Class385.method4661(buf, 2137822984);
						i_71_ = -1986499651 * class305.anInt3541;
						string = (class305.aClass572_Sub12_Sub15_3540.method10434(buf, -1242058187));
					} else
						string = (Class133_Sub17.method9500(Class662.decodeHuffman(buf, -715084451), (byte) -36));
					class456_sub1_sub2_sub3_sub2.setNextOverhead(string.trim(), effects >> 8, effects & 0xff, 451483828);
					int i_72_;
					if (class319.aBool3887)
						i_72_ = bool ? 17 : 1;
					else
						i_72_ = bool ? 17 : 2;
					if (class319.anInt3877 * -1848967575 != -1)
						Class241.method3327(i_72_, 0, new StringBuilder().append(Class520.method6215((class319.anInt3877 * -1848967575), 2009472133)).append(class456_sub1_sub2_sub3_sub2.method10697(true, 1865009824)).toString(), new StringBuilder().append(Class520.method6215((class319.anInt3877 * -1848967575), 2009472133)).append(class456_sub1_sub2_sub3_sub2.method10698(false, (byte) 10)).toString(), class456_sub1_sub2_sub3_sub2.displayName, string, null, i_71_, (byte) 1);
					else
						Class241.method3327(i_72_, 0, class456_sub1_sub2_sub3_sub2.method10697(true, -255143163), class456_sub1_sub2_sub3_sub2.method10698(false, (byte) 116), class456_sub1_sub2_sub3_sub2.displayName, string, null, i_71_, (byte) 77);
				}
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.RESET_NIS_VARS == class195.currentPacket) {
			Class306.clientConfigsDomain.method9969(-2001991067);
			class195.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass321_3946 == class195.currentPacket) {
			int i_73_ = buf.readUnsignedShortLE128((byte) 14);
			int i_74_ = buf.readUnsignedShortLE128((byte) 107);
			Class565_Sub1.method8259(-1127425063);
			ScriptVarType.method3829(i_73_, i_74_, 0, -715665428);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3896 == class195.currentPacket) {
			Class565_Sub1.method8259(2095637952);
			Class245.method3351(-1733168235);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4072 == class195.currentPacket) {
			int i_75_ = buf.readUnsignedShort(647518597);
			Class344.audio.method924(i_75_, (byte) 0);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4004) {
			client.anInt8563 = -1594550185 * client.anInt8839;
			Class46 class46 = new Class46(buf, client.anInterface1_8558);
			class46.method830(Class221.aClass49_2607, (byte) -37);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3925) {
			int i_76_ = buf.readUnsignedShort(647518597);
			String string = buf.readString(1295706626);
			boolean bool = buf.readUnsignedByte(1508519172) == 1;
			Class633.aClass641_8195 = Class633.aClass641_8197;
			Class633.aBool8200 = bool;
			Class242.method3340(i_76_, string, (byte) -1);
			Object object = null;
			Class463.method5478(14, 866199466);
			class195.currentPacket = null;
			return false;
		}
		if (IncomingPacket.REMOVE_GROUND_ITEM == class195.currentPacket) {
			Class65.method1035(Class301.REVMOVE_GROUND_ITEM, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3941) {
			int i_77_ = buf.readUnsignedShortLE((byte) -8);
			int i_78_ = buf.readIntV1((byte) 0);
			Class133_Sub23.playerVarsProvider.domain.method6072((VarBitDefinition) Class40_Sub1.aClass639_Sub19_9950.getDefinition(i_77_, 2008531615), i_78_, 1972346742);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SEND_PRIVATE_MESSAGE == class195.currentPacket) {
			String string = buf.readString(1295706626);
			int i_79_ = buf.readUnsignedShort(647518597);
			String string_80_ = Class111.aClass244_1428.method3345(i_79_, -1480049452).method10434(buf, -1242058187);
			Class241.method3327(19, 0, string, string, string, string_80_, null, i_79_, (byte) 119);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3983 == class195.currentPacket) {
			int i_81_ = buf.readUnsignedShort(647518597);
			if (65535 == i_81_)
				i_81_ = -1;
			int i_82_ = buf.readUnsignedByte(170570575);
			int i_83_ = buf.readUnsignedShort(647518597);
			int i_84_ = buf.readUnsignedByte(1105017555);
			int i_85_ = buf.readUnsignedShort(647518597);
			Class344.audio.sendSoundEffect(Class124.aClass124_1504, i_81_, i_82_, i_84_, Class126.aClass126_1509.method2215(-1113163285), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_85_, i_83_);

			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ROOT_INTERFACE == class195.currentPacket) {
			buf.readUnsigned128Byte((byte) 112);
			int i_86_ = buf.readIntLE(2024776341);
			int i_87_ = buf.readIntV1((byte) 0);
			int i_88_ = buf.readInt(817480940);
			int i_89_ = buf.readUnsignedShort(647518597);
			int i_90_ = buf.readIntV1((byte) 0);
			Class565_Sub1.method8259(-34166929);
			int[] is = { i_86_, i_90_, i_88_, i_87_ };
			client.anInt8790 = i_89_ * -254025177;
			Class83.method1264(i_89_, is, -915254535);
			Class288.method3884(false, (byte) 81);
			Class627.method7475(-507155049 * client.anInt8790, is, 37407838);
			for (int i_91_ = 0; i_91_ < 107; i_91_++)
				client.aBoolArray8784[i_91_] = true;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3982) {
			int i_92_ = buf.readIntV1((byte) 0);
			if (1637554457 * Class419.anInt4956 != i_92_) {
				Class419.anInt4956 = 1771123497 * i_92_;
				Class567.method6723(Class530.aClass530_5925, -1, -1, (short) -5155);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4010) {
			int i_93_ = buf.readUnsignedShort(647518597);
			Class344.audio.method919(i_93_, 2125574377);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CS_VAR_BIG) {
			int i_94_ = buf.readInt(-29946737);
			int i_95_ = buf.readUnsignedShort(647518597);
			Class565_Sub1.method8259(925920188);
			Class263.method3612(i_95_, i_94_, 2093494524);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.PLAYER_APPEARANCE) {
			byte i_96_ = buf.readByte(1207009475);
			Class507.aClass456_Sub1_Sub2_Sub3_Sub2_5600.decodePlayerLook(buf, i_96_, -1448903270);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.PLAY_SOUND) {
			int i_97_ = buf.readUnsignedShort(647518597);
			if (i_97_ == 65535)
				i_97_ = -1;
			int i_98_ = buf.readUnsignedByte(2101351425);
			int i_99_ = buf.readUnsignedShort(647518597);
			int i_100_ = buf.readUnsignedByte(572847980);
			int i_101_ = buf.readUnsignedShort(647518597);
			Class344.audio.sendSoundEffect(Class124.aClass124_1504, i_97_, i_98_, i_100_, Class126.aClass126_1509.method2215(-2114391008), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_101_, i_99_);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4057) {
			Class65.method1035(Class301.aClass301_3497, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.PLAYER_OPTIONS) {
			String option = buf.readString(1295706626);
			int icon = buf.readUnsignedShort128((byte) 59);
			if (65535 == icon)
				icon = -1;
			int isTopFlag = buf.readUnsignedByte(815499992);
			int slot = buf.readUnsignedByteC(394215453);
			if (slot >= 1 && slot <= 8) {
				if (option.equalsIgnoreCase("null"))
					option = null;
				client.aStringArray8742[slot - 1] = option;
				client.anIntArray8695[slot - 1] = icon;
				client.aBoolArray8667[slot - 1] = isTopFlag == 0;
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3959 == class195.currentPacket) {
			Class65.method1035(Class301.aClass301_3502, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3984 == class195.currentPacket) {
			int i_105_ = buf.readUnsignedShort(647518597);
			int i_106_ = buf.readUnsignedShort(647518597);
			Class344.audio.method927(i_105_, i_106_, 1936780754);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.RUN_ENERGY == class195.currentPacket) {
			client.anInt8616 = buf.readUnsignedByte(375858392) * 664648975;
			client.anInt8729 = client.anInt8839 * 653930141;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3986) {
			Class65.method1035(Class301.aClass301_3492, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.MUSIC_PACKET) {
			int i_107_ = buf.readUnsignedShort(647518597);
			if (i_107_ == 65535)
				i_107_ = -1;
			int i_108_ = buf.readUnsignedByteC(-1832705841);
			Class344.audio.sendMusic(i_107_, i_108_);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4065 == class195.currentPacket) {
			Class2.aClass134_21 = new Class134(Class92.aClass202_Sub1_Sub2_1240);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_ON_ICOMPONENT == class195.currentPacket) {
			int i_109_ = buf.readIntLE(2132466162);
			Class565_Sub1.method8259(-379910981);
			Class102_Sub5.method9950(i_109_, 5, -2, 0, (byte) -51);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3988 == class195.currentPacket) {
			int i_110_ = buf.readIntLE(2142955168);
			Class565_Sub1.method8259(-147115006);
			Class102_Sub5.method9950(i_110_, 5, client.anInt8728 * -1921142451, 0, (byte) -39);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.GAME_LOGOUT) {
			Class439.method5276(false, (byte) 8);
			class195.currentPacket = null;
			return false;
		}
		if (class195.currentPacket == IncomingPacket.BLACK_SCREEN) {
			Class192.anInt2304 = buf.readUnsignedByte(1417152725) * 31070837;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4045) {
			int i_111_ = buf.readInt(1166541858);
			Class420.aClass20_4967 = new Class20(i_111_);
			Thread thread = new Thread(Class420.aClass20_4967);
			thread.setPriority(1);
			thread.start();
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SLOT_CONTAINER_UPDATE == class195.currentPacket) {
			int key = buf.readUnsignedShort(647518597);
			int i_113_ = buf.readUnsignedByte(724113408);
			boolean split = (i_113_ & 0x1) == 1;
			Class600.method7063(key, split, (byte) -33);
			int amt = buf.readUnsignedShort(647518597);
			for (int index = 0; index < amt; index++) {
				int id = buf.readUnsignedShortLE128((byte) 104);
				int amount = buf.readUnsignedByte(1789083128);
				if (255 == amount)
					amount = buf.readInt(585760468);
				Class303_Sub1.setContainerItem(key, index, id - 1, amount, split, -451678148);
			}
			client.anIntArray8722[(client.anInt8793 += -580965435) * 1042881293 - 1 & 0x3f] = key;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3934) {
			int i_118_ = buf.readIntV1((byte) 0);
			int i_119_ = buf.readUnsignedShortLE((byte) -39);
			Class565_Sub1.method8259(1296031041);
			Class55.method994(i_119_, i_118_, (byte) -22);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4044 == class195.currentPacket) {
			int i_120_ = buf.readIntV1((byte) 0);
			boolean bool = buf.readUnsignedByteC(-2098676189) == 1;
			Class565_Sub1.method8259(-885316620);
			Class639_Sub7.method8917(i_120_, bool, 1073975990);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SET_SPRITE == class195.currentPacket) {//TODO figure this out NIS vars maybe
			int parent = buf.readIntLE(2013857793);
			int spriteArchive = buf.readIntV2(1576489150);

			int interId = parent >> 16;
			int componentId = parent - (interId << 16);

			//System.out.println(interId+","+componentId+", "+spriteArchive);
			Class565_Sub1.method8259(-1930947163);
			InterfaceDefinitions class73 = Class512.method6083(parent, (short) 8595);
			class73.anInt913 = spriteArchive * 1154753303;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.RECIEVE_PM) {
			boolean bool = buf.readUnsignedByte(2016366011) == 1;
			String string = buf.readString(1295706626);
			String string_123_ = string;
			if (bool)
				string_123_ = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_124_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = (Class319) Class455.method5387(Class428.method5212((byte) 0), buf.readUnsignedByte(496874325), -2118619817);
			long l_125_ = (l << 32) + l_124_;
			boolean bool_126_ = false;
			while_22_: do {
				for (int i_127_ = 0; i_127_ < 100; i_127_++) {
					if (client.aLongArray8834[i_127_] == l_125_) {
						bool_126_ = true;
						break while_22_;
					}
				}
				if (class319.aBool3878) {
					if (client.aBool8734 && !client.aBool8596 || client.aBool8738)
						bool_126_ = true;
					else if (Class616.method7378(string_123_, 1071877614))
						bool_126_ = true;
				}
			} while (false);
			if (!bool_126_) {
				client.aLongArray8834[-307333839 * client.anInt8817] = l_125_;
				client.anInt8817 = (client.anInt8817 * -307333839 + 1) % 100 * -1968258095;
				String string_128_ = (Class133_Sub17.method9500(Class662.decodeHuffman(buf, 624385392), (byte) -31));
				int i_129_ = class319.aBool3887 ? 7 : 3;
				if (-1 != class319.anInt3877 * -1848967575)
					Class241.method3327(i_129_, 0, new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((class319.anInt3877 * -1848967575), 2009472133)).append(string_123_).toString(), string, string_128_, null, -1, (byte) 100);
				else
					Class241.method3327(i_129_, 0, string, string_123_, string, string_128_, null, -1, (byte) 43);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3906) {
			int i_130_ = buf.readUnsignedShort(647518597);
			int i_131_ = buf.readUnsigned128Byte((byte) 63);
			Class133_Sub23.playerVarsProvider.domain.method6072((VarBitDefinition) Class40_Sub1.aClass639_Sub19_9950.getDefinition(i_130_, 1832128788), i_131_, 1042178811);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CLAN_MSG) {
			boolean bool = buf.readUnsignedByte(184618425) == 1;
			String string = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_132_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = ((Class319) Class455.method5387(Class428.method5212((byte) -23), buf.readUnsignedByte(631759283), -2076488356));
			long l_133_ = l_132_ + (l << 32);
			boolean bool_134_ = false;
			Object object = null;
			Class572_Sub10 class572_sub10 = (bool ? Class251.aClass572_Sub10_2731 : Class55.aClass572_Sub10_526);
			while_23_: do {
				if (null == class572_sub10)
					bool_134_ = true;
				else {
					for (int i_135_ = 0; i_135_ < 100; i_135_++) {
						if (client.aLongArray8834[i_135_] == l_133_) {
							bool_134_ = true;
							break while_23_;
						}
					}
					if (class319.aBool3878) {
						if (client.aBool8734 && !client.aBool8596 || client.aBool8738)
							bool_134_ = true;
						else if (Class616.method7378(string, 886656416))
							bool_134_ = true;
					}
				}
			} while (false);
			if (!bool_134_) {
				client.aLongArray8834[client.anInt8817 * -307333839] = l_133_;
				client.anInt8817 = (-307333839 * client.anInt8817 + 1) % 100 * -1968258095;
				String string_136_ = (Class133_Sub17.method9500(Class662.decodeHuffman(buf, 256945449), (byte) -115));
				int i_137_ = bool ? 41 : 44;
				if (-1 != class319.anInt3877 * -1848967575)
					Class241.method3327(i_137_, 0, new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), string, string_136_, class572_sub10.aString9089, -1, (byte) 39);
				else
					Class241.method3327(i_137_, 0, string, string, string, string_136_, class572_sub10.aString9089, -1, (byte) 59);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3922) {
			int i_138_ = buf.readUnsignedShortLE((byte) -81);
			int i_139_ = buf.readUnsignedByte(1798685212);
			int i_140_ = buf.readUnsignedByte(156771983);
			int i_141_ = buf.readUnsignedByte128(-720278270);
			int i_142_ = buf.readUnsignedByteC(292227330);
			Class565_Sub1.method8259(525626238);
			client.aBoolArray8842[i_141_] = true;
			client.anIntArray8843[i_141_] = i_140_;
			client.anIntArray8848[i_141_] = i_139_;
			client.anIntArray8741[i_141_] = i_142_;
			client.anIntArray8597[i_141_] = i_138_;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3895 == class195.currentPacket) {
			int i_143_ = buf.readIntLE(2025564014);
			Class565_Sub1.method8259(1379958458);
			if (-1 == i_143_) {
				Class566.anInt6375 = 2114279121;
				Class419.anInt4958 = 1724865785;
			} else {
				Class497 class497 = client.aClass613_8605.method7280((byte) -114);
				int i_144_ = i_143_ >> 14 & 0x3fff;
				int i_145_ = i_143_ & 0x3fff;
				i_144_ -= class497.localX * -2109597897;
				if (i_144_ < 0)
					i_144_ = 0;
				else if (i_144_ >= client.aClass613_8605.method7347(1440732174))
					i_144_ = client.aClass613_8605.method7347(1925812377);
				i_145_ -= class497.localY * 417324155;
				if (i_145_ < 0)
					i_145_ = 0;
				else if (i_145_ >= client.aClass613_8605.method7278(277214477))
					i_145_ = client.aClass613_8605.method7278(277214477);
				Class566.anInt6375 = (256 + (i_144_ << 9)) * -2114279121;
				Class419.anInt4958 = -1724865785 * (256 + (i_145_ << 9));
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_SMALL == class195.currentPacket) {
			byte i_146_ = buf.readByteC(16711935);
			int i_147_ = buf.readUnsignedShortLE128((byte) 81);
			Class565_Sub1.method8259(83297441);
			Class263.method3612(i_147_, i_146_, 2098853126);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PING_PACKET == class195.currentPacket) {
			class195.currentPacket = null;
			return false;
		}
		if (class195.currentPacket == IncomingPacket.ADJUSTED_PROJECTILE) {
			Class65.method1035(Class301.ADJUSTED_PROJECTILE, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PROJECTILE == class195.currentPacket) {
			Class65.method1035(Class301.PROJECTILE, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3938 == class195.currentPacket) {
			boolean bool = buf.readUnsignedByte(844889678) == 1;
			long l = (long) buf.readUnsignedShort(647518597);
			long l_148_ = (long) buf.read24BitInt(1140925462);
			long l_149_ = l_148_ + (l << 32);
			boolean bool_150_ = false;
			Class572_Sub10 class572_sub10 = (bool ? Class251.aClass572_Sub10_2731 : Class55.aClass572_Sub10_526);
			if (null == class572_sub10)
				bool_150_ = true;
			else {
				for (int i_151_ = 0; i_151_ < 100; i_151_++) {
					if (client.aLongArray8834[i_151_] == l_149_) {
						bool_150_ = true;
						break;
					}
				}
			}
			if (!bool_150_) {
				client.aLongArray8834[-307333839 * client.anInt8817] = l_149_;
				client.anInt8817 = (-307333839 * client.anInt8817 + 1) % 100 * -1968258095;
				String string = Class662.decodeHuffman(buf, -820895610);
				int i_152_ = bool ? 43 : 46;
				Class241.method3327(i_152_, 0, "", "", "", string, class572_sub10.aString9089, -1, (byte) 2);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.MAP_SCENE == class195.currentPacket) {
			Class572_Sub15_Sub2 class572_sub15_sub2_153_ = new Class572_Sub15_Sub2(class195.anInt2333 * -875297237);
			System.arraycopy((class195.aClass572_Sub15_Sub2_2330.b), (class195.aClass572_Sub15_Sub2_2330.o) * -1585139053, class572_sub15_sub2_153_.b, 0, -875297237 * class195.anInt2333);
			Class479.method5672(-969972088);
			if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(-9625881) == 1)
				Class204.aClass602_2411.method7076(new Class598(Class569.aClass569_6391, class572_sub15_sub2_153_), -550597946);
			else
				client.aClass613_8605.method7348(new Class598(Class569.aClass569_6391, class572_sub15_sub2_153_), 1874970017);
			class195.currentPacket = null;
			return false;
		}
		if (class195.currentPacket == IncomingPacket.SET_NPC_INTERFACE) {
			int i_154_ = buf.readUnsignedShortLE128((byte) 81);
			int i_155_ = buf.readUnsigned128Byte((byte) 116);
			int i_156_ = buf.readInt(1239922387);
			int i_157_ = buf.readIntV1((byte) 0);
			int i_158_ = buf.readUnsignedShort(647518597);
			int i_159_ = buf.readIntV2(1871073750);
			int i_160_ = buf.readInt(-709618554);
			int i_161_ = buf.readIntLE(2062233774);
			Class565_Sub1.method8259(1720764312);
			Class104_Sub1.method9918(i_157_, new Class572_Sub29_Sub1(i_154_, i_155_, i_158_), new int[] { i_160_, i_156_, i_159_, i_161_ }, false, (byte) 0);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.PLAYER_UPDATE) {
			Class560.method6618(buf, -875297237 * class195.anInt2333, -1397965303);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.OTHER_GAMEBAR_UPDATE == class195.currentPacket) {
			client.anInt8831 = buf.readUnsigned128Byte((byte) 127) * 858183233;
			client.anInt8680 = buf.readUnsignedByte128(-1815524364) * 1948953255;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.NPC_ON_ICOMPONENT == class195.currentPacket) {
			int i_162_ = buf.readIntV2(1771791905);
			int i_163_ = buf.readInt(-924461690);
			Class565_Sub1.method8259(48667659);
			Class102_Sub5.method9950(i_163_, 2, i_162_, -1, (byte) -30);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.SELECTED_TARGET) {
			client.anInt8576 = buf.readShort128(-181467154) * -841049325;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3996 == class195.currentPacket) {
			Class133_Sub1.aClass411_Sub1_9827.method9570(buf, -875297237 * class195.anInt2333, -406580949);
			client.anInt8811 = client.anInt8839 * -1745494425;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3975 == class195.currentPacket) {
			int i_164_ = buf.readUnsignedShort(647518597);
			int i_165_ = buf.readUnsignedByte(1114077571);
			int i_166_ = buf.readIntV1((byte) 0);
			int i_167_ = buf.readUnsignedShortLE128((byte) 43);
			Class565_Sub1.method8259(-892370777);
			Class517.method6124(i_166_, i_165_, i_167_, i_164_, (byte) 97);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3989) {
			int i_168_ = buf.readIntLE(2128445898);
			int i_169_ = buf.readUnsignedShortLE128((byte) 27);
			int i_170_ = buf.readUnsignedShort128((byte) 108);
			client.aClass613_8605.method7285(1612225087).method6278(i_169_, i_168_, i_170_, 1091670787);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4008) {
			Class303.method4004(buf.readString(1295706626), 682484720);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3942) {
			int i_171_ = buf.readUnsignedShort128((byte) 77);
			if (65535 == i_171_)
				i_171_ = -1;
			Class344.audio.method937(i_171_, 255, 27381648);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3913) {
			int i_172_ = buf.readUnsignedShort128((byte) 32);
			int i_173_ = buf.readInt(276877050);
			Class565_Sub1.method8259(-1110543709);
			Class572_Sub3_Sub5.method10386(i_173_, i_172_, 1923077554);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.ANIMATION_ON_INTERFACE == class195.currentPacket) {
			int i_174_ = buf.readIntV1((byte) 0);
			int i_175_ = buf.readInt(370574253);
			Class565_Sub1.method8259(2031697836);
			Class564_Sub1.method8258(i_174_, i_175_, -1162649742);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SYSTEM_UPDATE == class195.currentPacket) {
			if (Class19.method692(835742603 * client.anInt8580, (byte) 4))
				client.anInt8604 = (int) ((float) buf.readUnsignedShort(647518597) * 2.5F) * -425706245;
			else
				client.anInt8604 = buf.readUnsignedShort(647518597) * 113714538;
			client.anInt8729 = 653930141 * client.anInt8839;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4070 == class195.currentPacket) {
			int[] is = new int[4];
			for (int i_176_ = 0; i_176_ < 4; i_176_++)
				is[i_176_] = buf.readInt(-490984021);
			int i_177_ = buf.readUnsignedByte(414767830);
			int i_178_ = buf.readUnsignedShortLE((byte) 32);
			LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_178_));
			if (null != class572_sub9)
				Class565.method6699(((Entity) class572_sub9.anObject9081), is, i_177_, true, (short) 2672);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.MESSAGE_STATUS_UPDATE) {
			Class386.aClass669_4641 = Class448.method5356(buf.readUnsignedByte(-74080238), -324762449);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4002 == class195.currentPacket) {
			client.anInt8598 = -716364213 * client.anInt8839;
			boolean bool = buf.readUnsignedByte(13352534) == 1;
			Class420 class420 = new Class420(buf);
			Class572_Sub10 class572_sub10;
			if (bool)
				class572_sub10 = Class251.aClass572_Sub10_2731;
			else
				class572_sub10 = Class55.aClass572_Sub10_526;
			class420.method5126(class572_sub10, 1523363687);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4017 == class195.currentPacket) {
			byte i_179_ = buf.readByte(107571008);
			int i_180_ = buf.readUnsignedShort128((byte) 61);
			Class565_Sub1.method8259(-1081620459);
			Class55.method994(i_180_, i_179_, (byte) -84);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4059) {
			Class65.method1035(Class301.aClass301_3490, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3923) {
			String string = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_181_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = ((Class319) Class455.method5387(Class428.method5212((byte) -35), buf.readUnsignedByte(1955705289), -2057231481));
			boolean bool = buf.readUnsignedByte(2003375221) == 1;
			long l_182_ = l_181_ + (l << 32);
			boolean bool_183_ = false;
			while_24_: do {
				if (null == Class221.aClass49_2607)
					bool_183_ = true;
				else {
					for (int i_184_ = 0; i_184_ < 100; i_184_++) {
						if (l_182_ == client.aLongArray8834[i_184_]) {
							bool_183_ = true;
							break while_24_;
						}
					}
					if (class319.aBool3878) {
						if (client.aBool8734 && !client.aBool8596 || client.aBool8738)
							bool_183_ = true;
						else if (Class616.method7378(string, -949294423))
							bool_183_ = true;
					}
				}
			} while (false);
			if (!bool_183_) {
				client.aLongArray8834[-307333839 * client.anInt8817] = l_182_;
				client.anInt8817 = -1968258095 * ((client.anInt8817 * -307333839 + 1) % 100);
				String string_185_ = (Class133_Sub17.method9500(Class662.decodeHuffman(buf, 1160970117), (byte) -22));
				int i_186_ = bool ? 22 : 24;
				if (-1848967575 * class319.anInt3877 != -1)
					Class241.method3327(i_186_, 0, new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((class319.anInt3877 * -1848967575), 2009472133)).append(string).toString(), string, string_185_, Class221.aClass49_2607.method855(-1795740205), -1, (byte) 109);
				else
					Class241.method3327(i_186_, 0, string, string, string, string_185_, Class221.aClass49_2607.method855(-1692263847), -1, (byte) 20);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.NPC_UPDATE) {
			Class620.method7433(false, 1598030993);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SEND_QC_PRIVATE_MESSAGE == class195.currentPacket) {
			String string = buf.readString(1295706626);
			String string_187_ = (Class133_Sub17.method9500(Class662.decodeHuffman(buf, -1831006504), (byte) -49));
			Class375_Sub3.method8878(6, 0, string, string, string, string_187_, 1971609536);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.OTHER_PLAYER_ON_ICOMPONENT) {
			int hash = buf.readIntV1((byte) 0);
			int inter = buf.readIntV1((byte) 0);//inter should be here, not hash
			int index = buf.readUnsignedShort128((byte) 5);
			Class565_Sub1.method8259(381416674);
			Class102_Sub5.method9950(inter, 5, index, hash, (byte) -88);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.SEND_OBJECT) {
			Class65.method1035(Class301.SEND_OBJECT, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.GRAPHICS == class195.currentPacket) {
			int hash = buf.readUnsignedByteC(-1429849660);
			int gfxHeight = buf.readUnsignedShortLE128((byte) 107);
			int graphicsId = buf.readUnsignedShort128((byte) 91);
			if (65535 == graphicsId)
				graphicsId = -1;
			int slotId = buf.readUnsignedByte(887209265);
			int tHash = buf.readIntV2(576415216);
			int delay = buf.readUnsignedShortLE((byte) 15);
			int i_197_ = hash & 0x7;
			int i_198_ = hash >> 3 & 0xf;
			if (15 == i_198_)
				i_198_ = -1;
			boolean bool = (hash >> 7 & 0x1) == 1;
			if (tHash >> 30 != 0) {
				Class497 class497 = client.aClass613_8605.method7280((byte) -20);
				int i_199_ = tHash >> 28 & 0x3;
				int i_200_ = ((tHash >> 14 & 0x3fff) - class497.localX * -2109597897);
				int i_201_ = (tHash & 0x3fff) - class497.localY * 417324155;
				if (i_200_ >= 0 && i_201_ >= 0 && i_200_ < client.aClass613_8605.method7347(-946578456) && i_201_ < client.aClass613_8605.method7278(277214477)) {
					if (-1 == graphicsId) {
						Class572_Sub12_Sub9 class572_sub12_sub9 = ((Class572_Sub12_Sub9) (client.aClass676_8747.get((long) (i_200_ << 16 | i_201_))));
						if (class572_sub12_sub9 != null) {
							((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390.method10601(-1427745283);
							class572_sub12_sub9.method6794((byte) -65);
						}
					} else {
						int i_202_ = i_200_ * 512 + 256;
						int i_203_ = i_201_ * 512 + 256;
						int i_204_ = i_199_;
						if (i_204_ < 3 && client.aClass613_8605.method7287((byte) -44).method3689(i_200_, i_201_, -2034030278))
							i_204_++;
						Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (new Class456_Sub1_Sub2_Sub4(client.aClass613_8605.method7285(1844976809), graphicsId, delay, i_199_, i_204_, i_202_, Class314.method4072(i_202_, i_203_, i_199_, -1948257280) - gfxHeight, i_203_, i_200_, i_200_, i_201_, i_201_, i_197_, bool, 0));
						client.aClass676_8747.put(new Class572_Sub12_Sub9(class456_sub1_sub2_sub4), (long) (i_200_ << 16 | i_201_));
					}
				}
			} else if (tHash >> 29 != 0) {
				int i_205_ = tHash & 0xffff;
				LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_205_));
				if (class572_sub9 != null) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					Class586 class586 = (class456_sub1_sub2_sub3_sub1.currentGraphics[slotId]);
					if (graphicsId == 65535)
						graphicsId = -1;
					boolean bool_206_ = true;
					int i_207_ = class586.id * -1701003211;
					if (-1 != graphicsId && -1 != i_207_) {
						if (i_207_ == graphicsId) {
							GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(graphicsId, 1244129962));
							if (class659.aBool8427 && -1 != 1281094747 * class659.anInt8433) {
								AnimationDefinition class132 = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(class659.anInt8433 * 1281094747, -1353025782)));
								int i_208_ = class132.anInt1558 * -730435523;
								if (0 == i_208_ || 2 == i_208_)
									bool_206_ = false;
								else if (1 == i_208_)
									bool_206_ = true;
							}
						} else {
							GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(graphicsId, 1349735662));
							GraphicsDefinition class659_209_ = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(i_207_, 1427609924));
							if (1281094747 * class659.anInt8433 != -1 && (-1 != 1281094747 * class659_209_.anInt8433)) {
								AnimationDefinition class132 = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(class659.anInt8433 * 1281094747, 271972095)));
								AnimationDefinition class132_210_ = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659_209_.anInt8433, 1975581212)));
								if (class132.priority * 1882694951 < class132_210_.priority * 1882694951)
									bool_206_ = false;
							}
						}
					}
					if (bool_206_) {
						class586.id = -803171811 * graphicsId;
						class586.height = gfxHeight * -231350429;
						class586.anInt7778 = 103886255 * i_198_;
						if (-1 != graphicsId) {
							GraphicsDefinition class659 = (GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(graphicsId, 30396832);
							int i_211_ = class659.aBool8427 ? 0 : 2;
							if (bool)
								i_211_ = 1;
							class586.aClass663_7776.method7792(1281094747 * class659.anInt8433, delay, i_211_, false, -211444547);
						} else
							class586.aClass663_7776.method7801(-1, 751680147);
					}
				}
			} else if (tHash >> 28 != 0) {
				int i_212_ = tHash & 0xffff;
				Player class456_sub1_sub2_sub3_sub2;
				if (-1921142451 * client.anInt8728 == i_212_)
					class456_sub1_sub2_sub3_sub2 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
				else
					class456_sub1_sub2_sub3_sub2 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_212_]);
				if (null != class456_sub1_sub2_sub3_sub2) {
					Class586 class586 = (class456_sub1_sub2_sub3_sub2.currentGraphics[slotId]);
					if (graphicsId == 65535)
						graphicsId = -1;
					boolean bool_213_ = true;
					int i_214_ = -1701003211 * class586.id;
					if (graphicsId != -1 && -1 != i_214_) {
						if (i_214_ == graphicsId) {
							GraphicsDefinition class659 = (GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(graphicsId, 165977349);
							if (class659.aBool8427 && -1 != class659.anInt8433 * 1281094747) {
								AnimationDefinition class132 = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(class659.anInt8433 * 1281094747, 809030361)));
								int i_215_ = -730435523 * class132.anInt1558;
								if (i_215_ == 0 || i_215_ == 2)
									bool_213_ = false;
								else if (1 == i_215_)
									bool_213_ = true;
							}
						} else {
							GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(graphicsId, -972726500));
							GraphicsDefinition class659_216_ = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(i_214_, -1044985599));
							if (class659.anInt8433 * 1281094747 != -1 && (-1 != class659_216_.anInt8433 * 1281094747)) {
								AnimationDefinition class132 = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(class659.anInt8433 * 1281094747, -1363523401)));
								AnimationDefinition class132_217_ = ((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659_216_.anInt8433, -941263153)));
								if (class132.priority * 1882694951 < 1882694951 * class132_217_.priority)
									bool_213_ = false;
							}
						}
					}
					if (bool_213_) {
						class586.id = -803171811 * graphicsId;
						class586.height = -231350429 * gfxHeight;
						class586.anInt7778 = 103886255 * i_198_;
						class586.anInt7777 = i_197_ * -1914017185;
						if (-1 != graphicsId) {
							GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(graphicsId, -2100860941));
							int i_218_ = class659.aBool8427 ? 0 : 2;
							if (bool)
								i_218_ = 1;
							class586.aClass663_7776.method7792(class659.anInt8433 * 1281094747, delay, i_218_, false, 1224281116);
						} else
							class586.aClass663_7776.method7801(-1, 751680147);
					}
				}
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3953) {
			int i_219_ = buf.readUnsignedByte(690600628);
			int i_220_ = buf.readIntLE(2014611255);
			int i_221_ = buf.readShort(-710976385);
			int i_222_ = buf.readUnsignedShort(647518597);
			LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_222_));
			if (class572_sub9 != null) {
				NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
				if (null == class456_sub1_sub2_sub3_sub1.aClass418_11813)
					class456_sub1_sub2_sub3_sub1.aClass418_11813 = new Class418(class456_sub1_sub2_sub3_sub1.aClass410_11803);
				class456_sub1_sub2_sub3_sub1.aClass418_11813.anIntArray4944[i_219_] = i_220_;
				class456_sub1_sub2_sub3_sub1.aClass418_11813.aShortArray4945[i_219_] = (short) i_221_;
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4073) {
			boolean bool = buf.readUnsignedByteC(-1579826700) == 1;
			Class565_Sub1.method8259(353525353);
			Class212.aBool2460 = bool;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3919) {
			boolean bool = buf.readUnsignedByte(62031847) == 1;
			String string = buf.readString(1295706626);
			String string_223_ = string;
			if (bool)
				string_223_ = buf.readString(1295706626);
			String string_224_ = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_225_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = (Class319) Class455.method5387(Class428.method5212((byte) 0), buf.readUnsignedByte(203915173), -2059988815);
			long l_226_ = l_225_ + (l << 32);
			boolean bool_227_ = false;
			while_25_: do {
				for (int i_228_ = 0; i_228_ < 100; i_228_++) {
					if (l_226_ == client.aLongArray8834[i_228_]) {
						bool_227_ = true;
						break while_25_;
					}
				}
				if (class319.aBool3878) {
					if (client.aBool8734 && !client.aBool8596 || client.aBool8738)
						bool_227_ = true;
					else if (Class616.method7378(string_223_, -1378625580))
						bool_227_ = true;
				}
			} while (false);
			if (!bool_227_) {
				client.aLongArray8834[client.anInt8817 * -307333839] = l_226_;
				client.anInt8817 = -1968258095 * ((1 + -307333839 * client.anInt8817) % 100);
				String string_229_ = (Class133_Sub17.method9500(Class662.decodeHuffman(buf, 129089962), (byte) -59));
				if (-1 != -1848967575 * class319.anInt3877)
					Class241.method3327(9, 0, new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((class319.anInt3877 * -1848967575), 2009472133)).append(string_223_).toString(), string, string_229_, string_224_, -1, (byte) 36);
				else
					Class241.method3327(9, 0, string, string_223_, string, string_229_, string_224_, -1, (byte) 91);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3990 == class195.currentPacket) { //camera look
			int i_230_ = buf.readUnsignedByte(-8227699);
			int i_231_ = buf.readUnsignedShort(647518597) << 2;
			int i_232_ = buf.readUnsigned128Byte((byte) 60);
			int i_233_ = buf.readUnsignedByte128(-563485207);
			int i_234_ = buf.readUnsigned128Byte((byte) 119);
			Class565_Sub1.method8259(172523779);
			Class457.method5426(i_232_, i_230_, i_231_, i_233_, i_234_, -33700517);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.SET_INTERFACE == class195.currentPacket) {
			int parent = buf.readIntV1((byte) 0);
			int i_236_ = buf.readInt(1262353550);
			int i_237_ = buf.readIntV1((byte) 0);
			int i_238_ = buf.readIntLE(2113028463);
			int clipped = buf.readUnsignedByte(1409633112);
			int i_240_ = buf.readIntV1((byte) 0);
			int id = buf.readUnsignedShortLE128((byte) 98);
			Class565_Sub1.method8259(-1851283824);
			Class104_Sub1.method9918(parent, new Class572_Sub29(id, clipped), new int[] { i_240_, i_237_, i_238_, i_236_ }, false, (byte) 0);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CHANGE_WORLD) {
			String string = buf.readString(1295706626);
			int i_242_ = buf.readUnsignedShort(647518597);
			Class633.aClass641_8208.address = string;
			Class633.aClass641_8208.id = -1002799573 * i_242_;
			MaterialInformation.method1604(801210320);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3980 == class195.currentPacket) {
			byte i_243_ = buf.readByte(342541413);
			Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.decodePlayerLook(buf, i_243_, -1448903270);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3966) {
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.LOBBY_LOGOUT == class195.currentPacket) {
			Class439.method5276(Class13.aBool114, (byte) 8);
			class195.currentPacket = null;
			return false;
		}
		if (IncomingPacket.CS_VAR_STRING_SHORT == class195.currentPacket) {
			String string = buf.readString(1295706626);
			int i_244_ = buf.readUnsignedShort(647518597);
			Class565_Sub1.method8259(-1272079270);
			MapSize.method1547(i_244_, string, 826363092);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3914 == class195.currentPacket) {
			int i_245_ = buf.readUnsignedShort(647518597);
			Class572_Sub10.method8407(i_245_, -988185155);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4049 == class195.currentPacket) {
			client.anInt8861 = 1518092997;
			client.anInt8715 = 2017179605 * client.anInt8839;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3940) {
			buf.o += 101090548;
			if (buf.method8546((byte) 110))
				Class55.method991(buf, (buf.o * -1585139053 - 28), 617309171);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.HIDE_INTERFACE_COMPONENT == class195.currentPacket) {
			int i_246_ = buf.readUnsigned128Byte((byte) 101);
			int i_247_ = buf.readIntLE(2111672721);
			Class565_Sub1.method8259(-112581131);
			Class672.method7896(i_247_, i_246_, -1447135303);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CLIENT_EDIT_CHECK == class195.currentPacket) {
			UnderlayDefinition.method5288(buf, class195.anInt2333 * -875297237, 1250995235);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.SEND_GROUND_ITEM) {
			Class65.method1035(Class301.SEND_GROUND_ITEM, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.MOVE_INTERFACE) {
			int i_248_ = buf.readIntLE(2033933254);
			int i_249_ = buf.readInt(1478461463);
			Class565_Sub1.method8259(-746578222);
			Class572_Sub29 class572_sub29 = ((Class572_Sub29) client.aClass676_8760.get((long) i_248_));
			Class572_Sub29 class572_sub29_250_ = ((Class572_Sub29) client.aClass676_8760.get((long) i_249_));
			if (class572_sub29_250_ != null)
				Class96.method1554(class572_sub29_250_, (class572_sub29 == null || ((493419501 * class572_sub29_250_.anInt9301) != (class572_sub29.anInt9301 * 493419501))), false, 1900102088);
			if (class572_sub29 != null) {
				class572_sub29.method6794((byte) -16);
				client.aClass676_8760.put(class572_sub29, (long) i_249_);
			}
			InterfaceDefinitions class73 = Class512.method6083(i_248_, (short) -17433);
			if (class73 != null)
				Class555.method6575(class73, (short) 19275);
			class73 = Class512.method6083(i_249_, (short) -10953);
			if (null != class73) {
				Class555.method6575(class73, (short) 23473);
				Class496.method5923((Class534.aClass83Array5975[-1718435171 * class73.selfId >>> 16]), class73, true, (byte) 20);
			}
			if (-507155049 * client.anInt8790 != -1)
				Class498.method5945(-507155049 * client.anInt8790, 1, -144391391);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4039) {
			Class2.aClass134_21 = null;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4067 == class195.currentPacket) {
			int i_251_ = buf.readUnsignedShort(647518597);
			Class344.audio.method922(i_251_, (byte) 49);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.SET_OBJECT_INTERFACE) {
			int i_252_ = buf.readIntV2(1385694504);
			int i_253_ = buf.readIntV2(-791494547);
			Class497 class497 = new Class497(buf.readInt(-113470626));
			int i_254_ = buf.readIntLE(2047443494);
			int i_255_ = buf.readIntV2(-1264333685);
			int i_256_ = buf.readUnsignedByteC(1258274732);
			int i_257_ = i_256_ >> 2;
			int i_258_ = i_256_ & 0x3;
			int i_259_ = buf.readInt(-29600988);
			int i_260_ = buf.readUnsigned128Byte((byte) 73);
			int i_261_ = buf.readUnsignedShortLE((byte) -11);
			int i_262_ = buf.readIntV2(1555864526);
			Class565_Sub1.method8259(1874568457);
			Class104_Sub1.method9918(i_252_, new Class572_Sub29_Sub3(i_261_, i_260_, new Class430(class497, i_257_, i_258_, i_262_)), new int[] { i_255_, i_259_, i_253_, i_254_ }, false, (byte) 0);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.HINTICON) {
			int i_263_ = buf.readUnsignedByte(493211654);
			int i_264_ = i_263_ >> 5;
			int i_265_ = i_263_ & 0x1f;
			if (0 == i_265_) {
				client.aClass193Array8593[i_264_] = null;
				class195.currentPacket = null;
				return true;
			}
			Class193 class193 = new Class193();
			class193.anInt2319 = i_265_ * 1277894497;
			class193.anInt2312 = buf.readUnsignedByte(1149227850) * -770843117;
			if (-1800233957 * class193.anInt2312 >= 0 && (-1800233957 * class193.anInt2312 < Class1.aClass161Array11.length)) {
				if (class193.anInt2319 * -910441311 == 1 || class193.anInt2319 * -910441311 == 10) {
					class193.anInt2316 = (buf.readUnsignedShort(647518597) * -2067681699);
					class193.anInt2320 = (buf.readUnsignedShort(647518597) * -806279453);
					buf.o += 1241575020;
				} else if (-910441311 * class193.anInt2319 >= 2 && class193.anInt2319 * -910441311 <= 6) {
					if (2 == class193.anInt2319 * -910441311) {
						class193.anInt2315 = -463121664;
						class193.anInt2321 = 527610112;
					}
					if (3 == -910441311 * class193.anInt2319) {
						class193.anInt2315 = 0;
						class193.anInt2321 = 527610112;
					}
					if (-910441311 * class193.anInt2319 == 4) {
						class193.anInt2315 = -926243328;
						class193.anInt2321 = 527610112;
					}
					if (class193.anInt2319 * -910441311 == 5) {
						class193.anInt2315 = -463121664;
						class193.anInt2321 = 0;
					}
					if (6 == -910441311 * class193.anInt2319) {
						class193.anInt2315 = -463121664;
						class193.anInt2321 = 1055220224;
					}
					class193.anInt2319 = -1739178302;
					class193.anInt2314 = (buf.readUnsignedByte(-13578312) * -722091313);
					Class497 class497 = client.aClass613_8605.method7280((byte) -109);
					class193.anInt2315 += ((buf.readUnsignedShort(647518597) - -2109597897 * class497.localX) << 9) * -1578867373;
					class193.anInt2321 += ((buf.readUnsignedShort(647518597) - 417324155 * class497.localY) << 9) * -1021349199;
					class193.anInt2317 = ((buf.readUnsignedByte(1060804818) << 2) * -790741859);
					class193.anInt2311 = (buf.readUnsignedShort(647518597) * -725747395);
				}
				class193.anInt2318 = buf.readInt(14589733) * 1690293247;
				client.aClass193Array8593[i_264_] = class193;
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.RESET_SOUNDS == class195.currentPacket) {
			Class344.audio.method934(Class126.aClass126_1511.method2215(-1452070334), -545725443);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4012) {
			int i_266_ = buf.readUnsignedShortLE((byte) 60);
			int i_267_ = buf.readUnsignedByteC(974448428);
			boolean bool = 1 == (i_267_ & 0x1);
			Class196.method2957(i_266_, bool, 411995609);
			client.anIntArray8722[(client.anInt8793 += -580965435) * 1042881293 - 1 & 0x3f] = i_266_;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3949 == class195.currentPacket) {
			boolean bool = buf.readUnsignedByte(1703820637) == 1;
			String string = buf.readString(1295706626);
			String string_268_ = string;
			if (bool)
				string_268_ = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_269_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = ((Class319) Class455.method5387(Class428.method5212((byte) 73), buf.readUnsignedByte(1610707102), -2076371134));
			int i_270_ = buf.readUnsignedShort(647518597);
			long l_271_ = (l << 32) + l_269_;
			boolean bool_272_ = false;
			while_26_: do {
				for (int i_273_ = 0; i_273_ < 100; i_273_++) {
					if (l_271_ == client.aLongArray8834[i_273_]) {
						bool_272_ = true;
						break while_26_;
					}
				}
				if (class319.aBool3878 && Class616.method7378(string_268_, 2106311172))
					bool_272_ = true;
			} while (false);
			if (!bool_272_) {
				client.aLongArray8834[-307333839 * client.anInt8817] = l_271_;
				client.anInt8817 = -1968258095 * ((1 + client.anInt8817 * -307333839) % 100);
				String string_274_ = Class111.aClass244_1428.method3345(i_270_, 325100700).method10434(buf, -1242058187);
				if (class319.anInt3877 * -1848967575 != -1)
					Class241.method3327(18, 0, new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string_268_).toString(), string, string_274_, null, i_270_, (byte) 95);
				else
					Class241.method3327(18, 0, string, string_268_, string, string_274_, null, i_270_, (byte) 77);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3939) {
			for (int i_275_ = 0; i_275_ < client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727.length; i_275_++) {
				if (null != client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_275_]) {
					client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_275_].anIntArray11640 = null;
					client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_275_].aClass663_11670.method7801(-1, 751680147);
				}
			}
			for (int i_276_ = 0; i_276_ < client.anInt8624 * 617551237; i_276_++) {
				((Entity) client.aClass572_Sub9Array8623[i_276_].anObject9081).anIntArray11640 = null;
				((Entity) client.aClass572_Sub9Array8623[i_276_].anObject9081).aClass663_11670.method7801(-1, 751680147);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4068 == class195.currentPacket) {
			Class344.audio.method945(1342639030);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3957) {
			boolean bool = buf.readUnsignedByte(1961018445) == 1;
			if (bool)
				Class133_Sub4.method9340(1, (short) 25107);
			else
				Class133_Sub4.method9340(4, (short) 20891);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CHUNK_STREAM) {
			Class653.anInt8399 = buf.readUnsigned128Byte((byte) 116) * 155246469;
			Class396.anInt4690 = (buf.readByte(2087067748) << 3) * 121133201;
			Class63.anInt674 = (buf.readByte(1090766478) << 3) * -1424782507;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3937 == class195.currentPacket) {
			Class396.anInt4690 = (buf.readByte(958222144) << 3) * 121133201;
			Class63.anInt674 = (buf.read128Byte(1746773889) << 3) * -1424782507;
			Class653.anInt8399 = buf.readUnsignedByteC(1472865513) * 155246469;
			Class497 class497 = client.aClass613_8605.method7280((byte) -5);
			for (Class572_Sub42 class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7968((byte) -34)); null != class572_sub42; class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7969(1775601609))) {
				int i_277_ = (int) ((class572_sub42.hash * 381237825124074065L >> 28) & 0x3L);
				int i_278_ = (int) (381237825124074065L * class572_sub42.hash & 0x3fffL);
				int i_279_ = i_278_ - class497.localX * -2109597897;
				int i_280_ = (int) ((class572_sub42.hash * 381237825124074065L >> 14) & 0x3fffL);
				int i_281_ = i_280_ - 417324155 * class497.localY;
				if (i_277_ == Class653.anInt8399 * 445399373 && i_279_ >= Class396.anInt4690 * -1396283279 && i_279_ < Class396.anInt4690 * -1396283279 + 8 && i_281_ >= Class63.anInt674 * -121366019 && i_281_ < 8 + -121366019 * Class63.anInt674) {
					class572_sub42.method6794((byte) 45);
					if (i_279_ >= 0 && i_281_ >= 0 && (i_279_ < client.aClass613_8605.method7347(-1533087349)) && (i_281_ < client.aClass613_8605.method7278(277214477)))
						Class130.method2281(445399373 * Class653.anInt8399, i_279_, i_281_, -1405816306);
				}
			}
			for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7932((byte) 50)); null != class572_sub34; class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7926(548067928))) {
				if ((class572_sub34.anInt9334 * 163944051 >= Class396.anInt4690 * -1396283279) && (class572_sub34.anInt9334 * 163944051 < -1396283279 * Class396.anInt4690 + 8) && (class572_sub34.anInt9332 * 254036161 >= -121366019 * Class63.anInt674) && (254036161 * class572_sub34.anInt9332 < -121366019 * Class63.anInt674 + 8) && (445399373 * Class653.anInt8399 == (-2045257115 * ((Class572_Sub34) class572_sub34).anInt9335)))
					((Class572_Sub34) class572_sub34).aBool9344 = true;
			}
			for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9336.method7926(1620129389)) {
				if ((163944051 * class572_sub34.anInt9334 >= Class396.anInt4690 * -1396283279) && (class572_sub34.anInt9334 * 163944051 < Class396.anInt4690 * -1396283279 + 8) && (class572_sub34.anInt9332 * 254036161 >= Class63.anInt674 * -121366019) && (254036161 * class572_sub34.anInt9332 < Class63.anInt674 * -121366019 + 8) && (((Class572_Sub34) class572_sub34).anInt9335 * -2045257115) == 445399373 * Class653.anInt8399)
					((Class572_Sub34) class572_sub34).aBool9344 = true;
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3958 == class195.currentPacket) {
			client.anInt8743 = client.anInt8839 * -1769174305;
			int i_282_ = buf.o * -1585139053;
			int i_283_ = buf.readUnsignedShort(647518597);
			boolean bool = buf.readUnsignedByte(538057952) == 1;
			Class115 class115 = Class221.aClass49_2607.method854(i_283_, 1493492562);
			Class630 class630 = class115.method2111((byte) -114);
			if (class630 == null || bool) {
				class115.method2110(client.anInterface1_8558, (byte) 40);
				class630 = class115.method2111((byte) -43);
			}
			while ((-875297237 * class195.anInt2333 - (-1585139053 * buf.o - i_282_)) > 0) {
				Class323 class323 = Class472.aClass202_Sub1_Sub1_5310.method9203(buf, 94617807);
				class630.method443(class323.anInt4079 * 380662693, class323.anObject4078, -222761234);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CS_VAR_STRING_LONG == class195.currentPacket) {
			String string = buf.readString(1295706626);
			int i_284_ = buf.readUnsignedShort128((byte) 72);
			Class565_Sub1.method8259(1556461833);
			MapSize.method1547(i_284_, string, 997354524);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3973) {
			Class133_Sub23.playerVarsProvider.domain.method6070((byte) -8);
			client.anInt8791 += -259148736;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4053) {
			int i_285_ = buf.readIntLE(2131719667);
			int i_286_ = buf.readUnsignedByteC(-121245769);
			int i_287_ = buf.readIntV2(1426905);
			int i_288_ = buf.readUnsigned128Byte((byte) 106);
			int i_289_ = buf.readUnsigned128Byte((byte) 96);
			int i_290_ = i_287_ >> 28;
			int i_291_ = i_287_ >> 14 & 0x3fff;
			int i_292_ = i_287_ & 0x3fff;
			Class344.audio.sendMusic(i_285_, i_289_, true, i_290_, i_291_ << 9, i_292_ << 9, i_288_ << 9, i_286_ << 9);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.ADD_IGNORE) {
			while (buf.o * -1585139053 < class195.anInt2333 * -875297237) {
				int i_293_ = buf.readUnsignedByte(1883270755);
				boolean bool = 1 == (i_293_ & 0x1);
				String string = buf.readString(1295706626);
				String string_294_ = buf.readString(1295706626);
				String string_295_ = buf.readString(1295706626);
				for (int i_296_ = 0; i_296_ < client.anInt8865 * 351572371; i_296_++) {
					Class23 class23 = client.aClass23Array8650[i_296_];
					if (bool) {
						if (string_294_.equals(class23.aString153)) {
							class23.aString153 = string;
							class23.aString152 = string_294_;
							string = null;
							break;
						}
					} else if (string.equals(class23.aString153)) {
						class23.aString153 = string;
						class23.aString152 = string_294_;
						class23.aString151 = string_295_;
						string = null;
						break;
					}
				}
				if (string != null && client.anInt8865 * 351572371 < 400) {
					Class23 class23 = new Class23();
					client.aClass23Array8650[client.anInt8865 * 351572371] = class23;
					class23.aString153 = string;
					class23.aString152 = string_294_;
					class23.aString151 = string_295_;
					class23.aBool154 = 2 == (i_293_ & 0x2);
					client.anInt8865 += -1803668325;
				}
			}
			client.anInt8715 = client.anInt8839 * 2017179605;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CLIENT_COMMAND) {
			String string = buf.readString(1295706626);
			Class266.method3632(string, false, false, 1803040773);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4020 == class195.currentPacket) {
			if (Class2.aClass134_21 == null)
				Class2.aClass134_21 = new Class134(Class92.aClass202_Sub1_Sub2_1240);
			Class323 class323 = Class92.aClass202_Sub1_Sub2_1240.method9203(buf, -1567516871);
			Class2.aClass134_21.anInterface71_1567.method443(380662693 * class323.anInt4079, class323.anObject4078, 799352726);
			client.anIntArray8800[(client.anInt8578 += 707901121) * 1647827265 - 1 & 0x3f] = 380662693 * class323.anInt4079;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4025 == class195.currentPacket) {
			Class65.method1035(Class301.aClass301_3495, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3997 == class195.currentPacket) {
			client.aBool8657 = buf.readUnsignedByte(769917381) == 1;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CLIENT_SCRIPT == class195.currentPacket) {
			String string = buf.readString(1295706626);
			Object[] objects = new Object[string.length() + 1];
			for (int i_297_ = string.length() - 1; i_297_ >= 0; i_297_--) {
				if (string.charAt(i_297_) == 's')
					objects[1 + i_297_] = buf.readString(1295706626);
				else
					objects[i_297_ + 1] = new Integer(buf.readInt(2010496895));
			}
			objects[0] = new Integer(buf.readInt(-929732314));
			Class565_Sub1.method8259(584955607);
			Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
			class572_sub20.params = objects;
			Class34.executeCs2(class572_sub20, -1987045667);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3931 == class195.currentPacket) {
			int i_298_ = buf.readUnsignedShortLE128((byte) 27);
			int i_299_ = buf.readIntV1((byte) 0);
			Class565_Sub1.method8259(920137311);
			Player.method10708(i_299_, i_298_, -806356398);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4006) {
			int i_300_ = buf.readShort128(-666005688);
			int i_301_ = buf.method8548((byte) 8);
			int i_302_ = buf.readIntLE(2102369927);
			Class565_Sub1.method8259(-1440142955);
			Class6.method499(i_302_, i_301_, i_300_, -1017146554);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.VAR_BIG) {
			int i_303_ = buf.readIntLE(2052240566);
			int i_304_ = buf.readUnsignedShort128((byte) 49);
			Class133_Sub23.playerVarsProvider.domain.method6071((VarDefinition) Class472.aClass202_Sub1_Sub1_5310.getDefinition(i_304_, -227420050), i_303_, 680769369);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.GRAND_EXCHANGE_PACKET == class195.currentPacket) {
			int i_305_ = buf.readUnsignedByte(1533211798);
			if (buf.readUnsignedByte(470953949) == 0)
				client.exchangeSlots[i_305_] = new Class592();
			else {
				buf.o -= 310393755;
				client.exchangeSlots[i_305_] = new Class592(buf, null);
			}
			client.anInt8806 = client.anInt8839 * 1072104783;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3921 == class195.currentPacket) {
			int i_306_ = buf.readUnsignedShort(647518597);
			int i_307_ = buf.readUnsignedShort128((byte) 105);
			int i_308_ = buf.readUnsignedShortLE128((byte) 89);
			int i_309_ = buf.readUnsignedByte128(1307206887);
			int i_310_ = buf.readByte(1921858970);
			int i_311_ = buf.readUnsignedShort(647518597);
			int i_312_ = buf.method8516(1603479981);
			int i_313_ = buf.readUnsignedShortLE((byte) -2);
			int i_314_ = buf.readUnsignedByte128(-300873816) * 4;
			int i_315_ = buf.readShort128(-509073119);
			int i_316_ = buf.readUnsignedByte128(1217954752);
			int i_317_ = buf.readUnsigned128Byte((byte) 34);
			if (i_317_ == 255)
				i_317_ = -1;
			int i_318_ = buf.readByte(482081102);
			int i_319_ = buf.readUnsignedShortLE128((byte) 119);
			boolean bool = (i_309_ & 0x1) != 0;
			boolean bool_320_ = 0 != (i_309_ & 0x2);
			int i_321_ = bool_320_ ? i_309_ >> 2 : -1;
			if (bool_320_)
				i_316_ = (byte) i_316_;
			else
				i_316_ *= 4;
			Class497 class497 = client.aClass613_8605.method7280((byte) -120);
			int i_322_ = i_308_ - 75771502 * class497.localX;
			int i_323_ = i_311_ - class497.localY * 834648310;
			i_310_ += i_322_;
			i_318_ += i_323_;
			if (i_322_ >= 0 && i_323_ >= 0 && i_322_ < client.aClass613_8605.method7347(316402157) * 2 && i_323_ < client.aClass613_8605.method7347(-930087461) * 2 && i_310_ >= 0 && i_318_ >= 0 && i_310_ < client.aClass613_8605.method7278(277214477) * 2 && i_318_ < client.aClass613_8605.method7278(277214477) * 2 && i_319_ != 65535) {
				i_322_ *= 256;
				i_323_ = 256 * i_323_;
				i_310_ *= 256;
				i_318_ = 256 * i_318_;
				i_316_ <<= 2;
				i_314_ <<= 2;
				i_313_ <<= 2;
				Class473.method5595(i_319_, i_315_, i_312_, i_321_, i_316_, i_314_, i_322_, i_323_, i_310_, i_318_, i_307_, i_306_, i_317_, i_313_, bool, 0, (short) 915);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3948 == class195.currentPacket) {
			int i_324_ = buf.readUnsignedByte(1775622984);
			Class667 class667 = (Class667) Class455.method5387(Class315.method4076((byte) 1), i_324_, -2043662764);
			if (null == class667)
				class667 = Class667.aClass667_8505;
			Class566.method6717(class667, 1887289114);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4058) {
			if (client.anInt8790 * -507155049 != -1)
				Class498.method5945(-507155049 * client.anInt8790, 0, 1048853905);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4048 == class195.currentPacket) {
			int i_325_ = buf.readUnsignedByte128(525005331);
			int i_326_ = buf.readUnsigned128Byte((byte) 73);
			int i_327_ = buf.readUnsignedByte128(699996449);
			int i_328_ = buf.readUnsignedShort(647518597) << 2;
			int i_329_ = buf.readUnsignedByte128(-281075235);
			Class565_Sub1.method8259(-2092425218);
			Class348.method4342(i_327_, i_325_, i_328_, i_329_, i_326_, true, (byte) -119);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4074) {
			int i_330_ = buf.readIntV1((byte) 0);
			int i_331_ = buf.readInt(886858379);
			Class565_Sub1.method8259(-115216335);
			Class473.method5596(i_330_, i_331_, 1674707469);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3945) {
			BaseVarType.anInt7965 = buf.method8491(-1075736219) * -1091304041;
			client.aBool8734 = buf.readUnsignedByte(1512272594) == 1;
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4040) {
			if (Class637.aBool8266 && Class554.aFrame6320 != null)
				Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(-110318348), -1, -1, false, 623786968);
			byte[] is = new byte[class195.anInt2333 * -875297237];
			buf.method10393(is, 0, -875297237 * (class195.anInt2333), 2121576825);
			String string = Class658.method7757(is, 0, (-875297237 * class195.anInt2333), 790489748);
			Class611.method7271(string, true, client.aBool8621, (byte) 73);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3928) {
			int i_332_ = buf.readInt(1436114399);
			if (Class112.anInt1436 * 1391452711 != i_332_) {
				Class112.anInt1436 = -1301189225 * i_332_;
				Class567.method6723(Class530.aClass530_5916, -1, -1, (short) 9261);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4046 == class195.currentPacket) {
			Class65.method1035(Class301.aClass301_3496, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.OTHER_PLAYER_ON_COMPONENT) {
			int i_333_ = buf.readIntV2(-952008807);
			int i_334_ = buf.readUnsignedShortLE((byte) 36);
			int i_335_ = buf.readIntLE(2095225409);
			Class565_Sub1.method8259(1829206267);
			Class102_Sub5.method9950(i_335_, 3, i_334_, i_333_, (byte) -116);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CLAN_QC_MSG == class195.currentPacket) {
			boolean bool = buf.readUnsignedByte(743280781) == 1;
			String string = buf.readString(1295706626);
			long l = (long) buf.readUnsignedShort(647518597);
			long l_336_ = (long) buf.read24BitInt(1140925462);
			Class319 class319 = ((Class319) Class455.method5387(Class428.method5212((byte) -36), buf.readUnsignedByte(1348423025), -2143321001));
			int i_337_ = buf.readUnsignedShort(647518597);
			long l_338_ = l_336_ + (l << 32);
			boolean bool_339_ = false;
			Object object = null;
			Class572_Sub10 class572_sub10 = (bool ? Class251.aClass572_Sub10_2731 : Class55.aClass572_Sub10_526);
			while_27_: do {
				if (null == class572_sub10)
					bool_339_ = true;
				else {
					for (int i_340_ = 0; i_340_ < 100; i_340_++) {
						if (client.aLongArray8834[i_340_] == l_338_) {
							bool_339_ = true;
							break while_27_;
						}
					}
					if (class319.aBool3878 && Class616.method7378(string, -1778824841))
						bool_339_ = true;
				}
			} while (false);
			if (!bool_339_) {
				client.aLongArray8834[-307333839 * client.anInt8817] = l_338_;
				client.anInt8817 = (client.anInt8817 * -307333839 + 1) % 100 * -1968258095;
				String string_341_ = Class111.aClass244_1428.method3345(i_337_, 1307173681).method10434(buf, -1242058187);
				int i_342_ = bool ? 42 : 45;
				if (-1 != -1848967575 * class319.anInt3877)
					Class241.method3327(i_342_, 0, new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), new StringBuilder().append(Class520.method6215((-1848967575 * class319.anInt3877), 2009472133)).append(string).toString(), string, string_341_, class572_sub10.aString9089, i_337_, (byte) 113);
				else
					Class241.method3327(i_342_, 0, string, string, string, string_341_, class572_sub10.aString9089, i_337_, (byte) 28);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.ADD_FRIEND) {
			while (buf.o * -1585139053 < -875297237 * class195.anInt2333) {
				boolean bool = buf.readUnsignedByte(830498041) == 1;
				String string = buf.readString(1295706626);
				String string_343_ = buf.readString(1295706626);
				int i_344_ = buf.readUnsignedShort(647518597);
				int i_345_ = buf.readUnsignedByte(1663199704);
				int i_346_ = buf.readUnsignedByte(703051613);
				boolean bool_347_ = (i_346_ & 0x2) != 0;
				boolean bool_348_ = 0 != (i_346_ & 0x1);
				String string_349_ = "";
				int i_350_ = -1;
				int i_351_ = 0;
				if (i_344_ > 0) {
					string_349_ = buf.readString(1295706626);
					i_350_ = buf.readUnsignedByte(-49088742);
					i_351_ = buf.readInt(1969438237);
				}
				String string_352_ = buf.readString(1295706626);
				for (int i_353_ = 0; i_353_ < client.anInt8860 * 681720871; i_353_++) {
					Class26 class26 = client.aClass26Array8863[i_353_];
					if (!bool) {
						if (string.equals(class26.aString209)) {
							if (i_344_ != 1870287645 * class26.anInt207) {
								boolean bool_354_ = true;
								for (Class591_Sub1 class591_sub1 = ((Class591_Sub1) client.aClass652_8864.method7697(-40730682)); class591_sub1 != null; class591_sub1 = ((Class591_Sub1) client.aClass652_8864.method7698(-2044832979))) {
									if (((Class591_Sub1) class591_sub1).aString9179.equals(string)) {
										if (i_344_ != 0 && (((Class591_Sub1) class591_sub1).aShort9181) == 0) {
											class591_sub1.method7002((byte) 55);
											bool_354_ = false;
										} else if (0 == i_344_ && 0 != (((Class591_Sub1) class591_sub1).aShort9181)) {
											class591_sub1.method7002((byte) 7);
											bool_354_ = false;
										}
									}
								}
								if (bool_354_)
									client.aClass652_8864.method7703(new Class591_Sub1(string, i_344_), (short) -6399);
								class26.anInt207 = i_344_ * 1431504693;
							}
							class26.aString206 = string_343_;
							class26.aString205 = string_349_;
							class26.anInt208 = 921997803 * i_345_;
							class26.anInt210 = 141771285 * i_350_;
							class26.aBool213 = bool_347_;
							class26.aBool212 = bool_348_;
							class26.aString211 = string_352_;
							class26.anInt214 = -46230465 * i_351_;
							string = null;
							break;
						}
					} else if (string_343_.equals(class26.aString209)) {
						class26.aString209 = string;
						class26.aString206 = string_343_;
						string = null;
						break;
					}
				}
				if (string != null && 681720871 * client.anInt8860 < 400) {
					Class26 class26 = new Class26();
					client.aClass26Array8863[681720871 * client.anInt8860] = class26;
					class26.aString209 = string;
					class26.aString206 = string_343_;
					class26.anInt207 = 1431504693 * i_344_;
					class26.aString205 = string_349_;
					class26.anInt208 = 921997803 * i_345_;
					class26.anInt210 = i_350_ * 141771285;
					class26.aBool213 = bool_347_;
					class26.aBool212 = bool_348_;
					class26.aString211 = string_352_;
					class26.anInt214 = i_351_ * -46230465;
					client.anInt8860 += -149982313;
				}
			}
			client.anInt8861 = -1258781302;
			client.anInt8715 = 2017179605 * client.anInt8839;
			boolean bool = false;
			int i_355_ = client.anInt8860 * 681720871;
			do {
				if (i_355_ <= 0)
					break;
				bool = true;
				i_355_--;
				for (int i_356_ = 0; i_356_ < i_355_; i_356_++) {
					boolean bool_357_ = false;
					Class26 class26 = client.aClass26Array8863[i_356_];
					Class26 class26_358_ = client.aClass26Array8863[1 + i_356_];
					if ((Class633.aClass641_8197.id * 2112639107 != 1870287645 * class26.anInt207) && (Class633.aClass641_8197.id * 2112639107 == 1870287645 * class26_358_.anInt207))
						bool_357_ = true;
					if (!bool_357_ && class26.anInt207 * 1870287645 == 0 && 0 != 1870287645 * class26_358_.anInt207)
						bool_357_ = true;
					if (!bool_357_ && !class26.aBool213 && class26_358_.aBool213)
						bool_357_ = true;
					if (!bool_357_ && !class26.aBool212 && class26_358_.aBool212)
						bool_357_ = true;
					if (bool_357_) {
						Class26 class26_359_ = client.aClass26Array8863[i_356_];
						client.aClass26Array8863[i_356_] = client.aClass26Array8863[i_356_ + 1];
						client.aClass26Array8863[i_356_ + 1] = class26_359_;
						bool = false;
					}
				}
			} while (!bool);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4037) {
			int i_360_ = buf.readUnsignedShort(647518597);
			int i_361_ = buf.readUnsignedShort(647518597);
			int i_362_ = buf.readUnsignedShort(647518597);
			Class565_Sub1.method8259(-1854532385);
			if (Class534.aClass83Array5975[i_360_] != null) {
				for (int i_363_ = i_361_; i_363_ < i_362_; i_363_++) {
					int i_364_ = buf.read24BitInt(1140925462);
					if (i_363_ < (Class534.aClass83Array5975[i_360_].aClass73Array1081).length && (Class534.aClass83Array5975[i_360_].aClass73Array1081[i_363_]) != null)
						Class534.aClass83Array5975[i_360_].aClass73Array1081[i_363_].anInt863 = i_364_ * 932382371;
				}
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3993 == class195.currentPacket) {
			int i_365_ = buf.readUnsignedByte(1971598017);
			Class655 class655 = ((Class655) Class455.method5387(Class134.method2315((short) 31031), i_365_, -1923392112));
			if (null == class655)
				class655 = Class655.aClass655_8407;
			Class245.method3352(class655, 1252476882);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4023 == class195.currentPacket) {// TODO
			int i_366_ = buf.readUnsignedShortLE128((byte) 42);
			int i_367_ = buf.readIntV2(-2015454710);
			int i_368_ = buf.readUnsignedShortLE((byte) -19);
			if (65535 == i_368_)
				i_368_ = -1;
			int i_369_ = buf.readUnsignedShort(647518597);
			if (65535 == i_369_)
				i_369_ = -1;
			Class565_Sub1.method8259(580160342);
			for (int i_370_ = i_369_; i_370_ <= i_368_; i_370_++) {
				long l = (long) i_370_ + ((long) i_367_ << 32);
				Class572_Sub30 class572_sub30 = (Class572_Sub30) client.aClass676_8815.get(l);
				Class572_Sub30 class572_sub30_371_;
				if (null == class572_sub30) {
					if (-1 == i_370_)
						class572_sub30_371_ = new Class572_Sub30((Class512.method6083(i_367_, (short) 7391).aClass572_Sub30_843.anInt9311) * 2066234753, i_366_);
					else
						class572_sub30_371_ = new Class572_Sub30(0, i_366_);
				} else {
					class572_sub30_371_ = new Class572_Sub30((class572_sub30.anInt9311 * 2066234753), i_366_);
					class572_sub30.method6794((byte) 10);
				}
				client.aClass676_8815.put(class572_sub30_371_, l);
			}
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CLOSE_INTERFACE) {
			int i_372_ = buf.readIntV1((byte) 0);
			Class565_Sub1.method8259(-204520272);
			Class572_Sub29 class572_sub29 = ((Class572_Sub29) client.aClass676_8760.get((long) i_372_));
			if (class572_sub29 != null)
				Class96.method1554(class572_sub29, true, false, -1609347096);
			if (client.aClass73_8762 != null) {
				Class555.method6575(client.aClass73_8762, (short) 14614);
				client.aClass73_8762 = null;
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CLAN_SETTINGS_PACKET == class195.currentPacket) {
			client.anInt8598 = -716364213 * client.anInt8839;
			boolean bool = buf.readUnsignedByte(1811939997) == 1;
			if (class195.anInt2333 * -875297237 == 1) {
				if (bool)
					Class251.aClass572_Sub10_2731 = null;
				else
					Class55.aClass572_Sub10_526 = null;
				class195.currentPacket = null;
				return true;
			}
			if (bool)
				Class251.aClass572_Sub10_2731 = new Class572_Sub10(buf);
			else
				Class55.aClass572_Sub10_526 = new Class572_Sub10(buf);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.PLAYER_UNDER_NPC_PRIORITY_PACKET) {
			int i_373_ = buf.readUnsigned128Byte((byte) 121);
			Class565_Sub1.method8259(-513806834);
			client.anInt8704 = 608775979 * i_373_;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4064 == class195.currentPacket) {
			Class65.method1035(Class301.aClass301_3494, 672149233);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4016) {
			int i_374_ = buf.readInt(-862419625);
			int i_375_ = buf.readIntV1((byte) 0);
			Class565_Sub1.method8259(-850951139);
			Class407.method4931(i_375_, i_374_, (byte) 0);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4033 == class195.currentPacket) {
			String string = buf.readString(1295706626);
			boolean bool = buf.readUnsignedByte(1896310390) == 1;
			String string_376_;
			if (bool)
				string_376_ = buf.readString(1295706626);
			else
				string_376_ = string;
			int i_377_ = buf.readUnsignedShort(647518597);
			byte i_378_ = buf.readByte(349151310);
			boolean bool_379_ = false;
			if (i_378_ == -128)
				bool_379_ = true;
			if (bool_379_) {
				if (1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558 == 0) {
					class195.currentPacket = null;
					return true;
				}
				boolean bool_380_ = false;
				int i_381_;
				for (i_381_ = 0; (i_381_ < 1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558 && (!Class328.aClass196Array4209[i_381_].aString2349.equals(string_376_) || i_377_ != 429736805 * (Class328.aClass196Array4209[i_381_].anInt2351))); i_381_++) {
					/* empty */
				}
				if (i_381_ < 1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558) {
					for (/**/; i_381_ < (Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641) - 1; i_381_++)
						Class328.aClass196Array4209[i_381_] = Class328.aClass196Array4209[i_381_ + 1];
					Class456_Sub1_Sub1_Sub1.anInt11558 -= -1526660351;
					Class328.aClass196Array4209[Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641] = null;
				}
			} else {
				String string_382_ = buf.readString(1295706626);
				Class196 class196 = new Class196();
				class196.aString2350 = string;
				class196.aString2349 = string_376_;
				((Class196) class196).aString2353 = Class251.method3503(class196.aString2349, Class414.aClass207_4922, -481970331);
				class196.anInt2351 = i_377_ * -354994579;
				class196.aByte2348 = i_378_;
				class196.aString2352 = string_382_;
				int i_383_;
				for (i_383_ = Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641 - 1; i_383_ >= 0; i_383_--) {
					int i_384_ = ((Class196) Class328.aClass196Array4209[i_383_]).aString2353.compareTo(((Class196) class196).aString2353);
					if (i_384_ == 0) {
						Class328.aClass196Array4209[i_383_].anInt2351 = -354994579 * i_377_;
						Class328.aClass196Array4209[i_383_].aByte2348 = i_378_;
						Class328.aClass196Array4209[i_383_].aString2352 = string_382_;
						if (string_376_.equals(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username))
							Class477.aByte5334 = i_378_;
						client.anInt8858 = 920622699 * client.anInt8839;
						class195.currentPacket = null;
						return true;
					}
					if (i_384_ < 0)
						break;
				}
				if (Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641 >= Class328.aClass196Array4209.length) {
					class195.currentPacket = null;
					return true;
				}
				for (int i_385_ = 1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558 - 1; i_385_ > i_383_; i_385_--)
					Class328.aClass196Array4209[i_385_ + 1] = Class328.aClass196Array4209[i_385_];
				if (Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641 == 0)
					Class328.aClass196Array4209 = new Class196[100];
				Class328.aClass196Array4209[1 + i_383_] = class196;
				Class456_Sub1_Sub1_Sub1.anInt11558 += -1526660351;
				if (string_376_.equals(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username))
					Class477.aByte5334 = i_378_;
			}
			client.anInt8858 = 920622699 * client.anInt8839;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.INSTANCED_MAP_SCENE == class195.currentPacket) {
			Class572_Sub15_Sub2 class572_sub15_sub2_386_ = new Class572_Sub15_Sub2(-875297237 * class195.anInt2333);
			System.arraycopy((class195.aClass572_Sub15_Sub2_2330.b), -1585139053 * (class195.aClass572_Sub15_Sub2_2330.o), class572_sub15_sub2_386_.b, 0, -875297237 * class195.anInt2333);
			Class479.method5672(-1300107519);
			if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(2060927095) == 1)
				Class204.aClass602_2411.method7076(new Class598(Class569.aClass569_6396, class572_sub15_sub2_386_), 558044980);
			else
				client.aClass613_8605.method7348(new Class598(Class569.aClass569_6396, class572_sub15_sub2_386_), -241300873);
			class195.currentPacket = null;
			return false;
		}
		if (IncomingPacket.aClass321_3995 == class195.currentPacket) {
			String string = buf.readString(1295706626);
			int i_387_ = buf.readUnsignedShort(647518597);
			Class633.aClass641_8196.address = string;
			Class633.aClass641_8196.id = i_387_ * -1002799573;
			MaterialInformation.method1604(-592146983);
			Class72.aClass617_721.method7382((Class633.aClass641_8196.address), Class633.aClass641_8196.method7600(665368727), -1064149343);
			Class41.aClass259_425.method3547(1803946941);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3905) {
			int i_388_ = buf.readUnsignedShort(647518597);
			int i_389_ = buf.readUnsignedShort128((byte) 53);
			int i_390_ = buf.readUnsignedByte(713213455);
			int i_391_ = buf.readIntV2(-1641648291);
			Class565_Sub1.method8259(532163642);
			Class494.method5907(i_391_, i_390_, i_389_, i_388_, 1107270062);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4056 == class195.currentPacket) {
			int i_392_ = buf.readUnsignedShortLE((byte) -44);
			int i_393_ = buf.readIntV1((byte) 0);
			int i_394_ = buf.readUnsignedShort128((byte) 46);
			int i_395_ = buf.readUnsignedShortLE((byte) -44);
			Class565_Sub1.method8259(1139448984);
			Class416.method5103(i_393_, i_392_, i_394_, i_395_, -1074732631);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3947 == class195.currentPacket) {
			client.anInt8805 = -1190757321 * client.anInt8839;
			boolean bool = buf.readUnsignedByte(1401460258) == 1;
			Class336 class336 = new Class336(buf);
			Class334 class334;
			if (bool)
				class334 = Class440.aClass334_5097;
			else
				class334 = Class210.aClass334_2440;
			class336.method4228(class334, (byte) -1);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.VAR_SMALL) {
			int i_396_ = buf.readUnsignedShort128((byte) 89);
			byte i_397_ = buf.readByte128((byte) -88);
			Class133_Sub23.playerVarsProvider.domain.method6071((VarDefinition) Class472.aClass202_Sub1_Sub1_5310.getDefinition(i_396_, -2137013176), i_397_, -383064029);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_3987 == class195.currentPacket) {
			int i_398_ = buf.readUnsignedByte(984211279);
			Class662 class662 = ((Class662) Class455.method5387(Class472.method5583(-332507354), i_398_, -2038028528));
			if (null == class662)
				class662 = Class662.aClass662_8458;
			Class587.method6964(class662, 1234909698);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.CHUNK_SCENE) {
			Class653.anInt8399 = buf.readUnsignedByte128(74654891) * 155246469;
			Class396.anInt4690 = (buf.read128Byte(1629477118) << 3) * 121133201;
			Class63.anInt674 = (buf.readByte(1662626024) << 3) * -1424782507;
			while (buf.o * -1585139053 < -875297237 * class195.anInt2333) {
				Class301 class301 = (Class459.method5451((byte) 14)[buf.readUnsignedByte(1750019574)]);
				Class65.method1035(class301, 672149233);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.MODEL_ON_ICOMPONENT == class195.currentPacket) {
			int i_399_ = buf.readIntV2(-497647854);
			int i_400_ = buf.readIntV1((byte) 0);
			Class565_Sub1.method8259(1378309388);
			Class102_Sub5.method9950(i_399_, 1, i_400_, -1, (byte) -5);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.UPDATE_SKILLS == class195.currentPacket) {
			class195.currentPacket = null;
			int id = buf.readUnsignedByte128(-1896954596);
			Class193.aClass487_2323.method5794(id, -16687425);
			int exp = buf.readInt(-349125331);
			int lvl = buf.readUnsignedByte(345701278);
			((Class197) Class133_Sub23.playerVarsProvider).aClass493Array2355[id].method5876(exp, (byte) 69);
			((Class197) Class133_Sub23.playerVarsProvider).aClass493Array2355[id].method5880(lvl, 1932071451);
			client.anIntArray8794[(client.anInt8795 += -639119835) * -47604307 - 1 & 0x3f] = id;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.CONTAINER_UPDATE == class195.currentPacket) {
			int key = buf.readUnsignedShort(647518597);
			int keyFlag = buf.readUnsignedByte(1961810727);
			boolean negativeKey = 1 == (keyFlag & 0x1);
			while (-1585139053 * buf.o < class195.anInt2333 * -875297237) {
				int idx = buf.readUnsignedSmart(1577052547);
				int id = buf.readUnsignedShort(647518597);
				int amount = 0;
				if (id != 0) {
					amount = buf.readUnsignedByte(2096956186);
					if (255 == amount)
						amount = buf.readInt(-272323591);
				}
				Class303_Sub1.setContainerItem(key, idx, id - 1, amount, negativeKey, -1043153398);
			}
			client.anIntArray8722[(client.anInt8793 += -580965435) * 1042881293 - 1 & 0x3f] = key;
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.PLAYER_HEAD_ON_ICOMPONENT == class195.currentPacket) {
			int i_409_ = buf.readIntV2(294320847);
			Class565_Sub1.method8259(-675884262);
			Class102_Sub5.method9950(i_409_, 3, client.anInt8728 * -1921142451, 0, (byte) -24);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4054 == class195.currentPacket) {
			HashTable class466 = new HashTable();
			boolean bool = class466.method5495(buf, -1572383799);
			client.aClass613_8605.method7306(-1042067865).method5955(client.aClass613_8605, bool ? class466 : null, class466.method5511(504855875), 1479537918);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.SET_PLAYER_INTERFACE) {
			int i_410_ = buf.readIntV1((byte) 0);
			int i_411_ = buf.readIntV2(-2033029527);
			int i_412_ = buf.readUnsignedByte(957317015);
			int i_413_ = buf.readUnsignedShortLE128((byte) 121);
			int i_414_ = buf.readIntV1((byte) 0);
			int i_415_ = buf.readIntLE(2135102507);
			int i_416_ = buf.readUnsignedShortLE128((byte) 18);
			int i_417_ = buf.readIntV2(540950229);
			Class565_Sub1.method8259(-237011735);
			Class104_Sub1.method9918(i_411_, new Class572_Sub29_Sub2(i_413_, i_412_, i_416_), new int[] { i_415_, i_410_, i_414_, i_417_ }, false, (byte) 0);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4035 == class195.currentPacket) {
			boolean bool = buf.readUnsignedByte128(-1937406959) == 1;
			int i_418_ = buf.readIntV2(-192138078);
			Class565_Sub1.method8259(-400001097);
			Class327.method4150(i_418_, bool, 870178036);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.ITEM_ON_ICOMPONENT) {
			int id = buf.readUnsignedShortLE((byte) -71);
			if (65535 == id)
				id = -1;
			int uid = buf.readIntV2(-1282873452);
			int amount = buf.readIntV1((byte) 0);
			Class565_Sub1.method8259(-862699656);
			Cs2LaunchArgs.method8595(uid, id, amount, -1838652895);
			ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(id, 988457350));
			Class416.method5103(uid, class631.anInt8157 * -1383953861, class631.anInt8120 * -69312199, class631.anInt8134 * 1107442221, -502100564);
			Class417.method5106(uid, -1450208169 * class631.anInt8138, -222724811 * class631.anInt8139, -1330675575 * class631.anInt8166, -466135773);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.INTERFACE_SETTINGS == class195.currentPacket) {
			int fromSlot = buf.readUnsignedShort(647518597);
			if (65535 == fromSlot)
				fromSlot = -1;
			int settings = buf.readInt(845484658);
			int toSlot = buf.readUnsignedShort(647518597);
			if (toSlot == 65535)
				toSlot = -1;
			int interHash = buf.readIntLE(2039219908);
			Class565_Sub1.method8259(-108732882);
			for (int index = fromSlot; index <= toSlot; index++) {
				long l = ((long) interHash << 32) + (long) index;
				Class572_Sub30 class572_sub30 = (Class572_Sub30) client.aClass676_8815.get(l);
				Class572_Sub30 class572_sub30_427_;
				if (class572_sub30 == null) {
					if (index == -1)
						class572_sub30_427_ = new Class572_Sub30(settings, (Class512.method6083(interHash, (short) -11971).aClass572_Sub30_843.anInt9302) * 1054444675);
					else
						class572_sub30_427_ = new Class572_Sub30(settings, -1);
				} else {
					class572_sub30_427_ = new Class572_Sub30(settings, (class572_sub30.anInt9302 * 1054444675));
					class572_sub30.method6794((byte) -84);
				}
				client.aClass676_8815.put(class572_sub30_427_, l);
			}
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4031 == class195.currentPacket) {
			int i_428_ = buf.readUnsignedByte(675934236);
			int i_429_ = buf.readBigSmart((byte) 67);
			if (client.aClass575Array8594[i_428_] != null) {
				client.aClass575Array8594[i_428_].method6810(client.aClass613_8605.method7285(1179310320), (byte) -23);
				client.aClass575Array8594[i_428_] = null;
			}
			if (-1 != i_429_)
				client.aClass575Array8594[i_428_] = new Class575(Class272_Sub2.aClass106_9517, buf, i_429_);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_4036) {
			int i_430_ = buf.readInt(1807552014);
			int i_431_ = buf.readInt(-76070484);
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3762, class195.aClass650_2340, -1795537296);
			class572_sub25.aRsByteBuffer.writeByte(client.anInt7734 * -267830063, -1384395473);
			class572_sub25.aRsByteBuffer.writeIntV2(i_430_, (byte) 1);
			class572_sub25.aRsByteBuffer.writeIntV1(i_431_, 65280);
			class195.method2929(class572_sub25, (byte) -22);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.REFRESH_WORLDLIST == class195.currentPacket) {
			boolean bool = buf.readUnsignedByte(665142025) == 1;
			byte[] is = new byte[-875297237 * class195.anInt2333 - 1];
			buf.readBytes(is, 0, (class195.anInt2333 * -875297237) - 1, 1380118721);
			Class308.method4031(bool, is, -238193207);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.aClass321_3908) {
			int i_432_ = buf.readUnsignedShort(647518597);
			if (65535 == i_432_)
				i_432_ = -1;
			int i_433_ = buf.readUnsignedByte(103587730);
			int i_434_ = buf.readUnsignedShort(647518597);
			int i_435_ = buf.readUnsignedByte(244790812);
			int i_436_ = buf.readUnsignedShort(647518597);
			int i_437_ = buf.readUnsignedShort(647518597);
			Class603 class603 = Class344.audio.method935(Class124.aClass124_1504, Class344.audio, i_432_, i_433_, i_435_, Class126.aClass126_1509.method2215(266763565), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_436_, false, -1711550416);
			if (class603 != null)
				Class344.audio.method952(class603, i_437_, i_434_, (byte) 12);
			class195.currentPacket = null;
			return true;
		}
		if (class195.currentPacket == IncomingPacket.INTERFACE_COMPONENT_TEXT) {
			int parent = buf.readInt(438159449);
			String string = buf.readString(1295706626);
			Class565_Sub1.method8259(-739224913);
			Class294.method3960(parent, string, 1663460783);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.aClass321_4061 == class195.currentPacket) {
			String string = buf.readString(1295706626);
			Class292.method3948(string, (short) 1009);
			class195.currentPacket = null;
			return true;
		}
		if (IncomingPacket.NPC_UPDATE_LARGE == class195.currentPacket) {
			Class620.method7433(true, 1347023063);
			class195.currentPacket = null;
			return true;
		}
		Class640.method7592(new StringBuilder().append(null != class195.currentPacket ? 1839801621 * class195.currentPacket.id : -1).append(Class3.aString23).append(class195.aClass321_2342 != null ? class195.aClass321_2342.id * 1839801621 : -1).append(Class3.aString23).append(null != class195.aClass321_2343 ? class195.aClass321_2343.id * 1839801621 : -1).append(" ").append(class195.anInt2333 * -875297237).toString(), new RuntimeException(), 1193106114);
		Class439.method5276(false, (byte) 8);
		return true;
	}

	static final void method3032(Cs2Executor class441, byte i) {
		int i_439_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (((Cs2Executor) class441).aClass572_Sub10_5104.aClass343Array9084[i_439_].aString4361);
	}
}

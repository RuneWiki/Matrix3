package game;

/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Class266 implements Interface17, Interface73 {
	public int anInt2840 = 0;
	public int anInt2841 = 0;
	public int anInt2842 = 679233536;
	public int anInt2843 = -1490601984;

	void method3627(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt2840 = class572_sub15.readUnsignedByte(1539442135) * -321907983;
		else if (i == 2)
			anInt2843 = class572_sub15.readUnsignedShort(647518597) * 1834280167;
		else if (3 == i)
			anInt2842 = class572_sub15.readUnsignedShort(647518597) * -391835767;
		else if (i == 4)
			anInt2841 = class572_sub15.readShort(-710976385) * 472842363;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(1481849914);
			if (0 == i_0_)
				break;
			method3628(class572_sub15, i_0_, (byte) 113);
		}
	}

	void method3628(RSByteBuffer class572_sub15, int i, byte i_1_) {
		if (1 == i)
			anInt2840 = class572_sub15.readUnsignedByte(1431620263) * -321907983;
		else if (i == 2)
			anInt2843 = class572_sub15.readUnsignedShort(647518597) * 1834280167;
		else if (3 == i)
			anInt2842 = class572_sub15.readUnsignedShort(647518597) * -391835767;
		else if (i == 4)
			anInt2841 = class572_sub15.readShort(-710976385) * 472842363;
	}

	public void method112() {
		/* empty */
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(675382136);
			if (0 == i)
				break;
			method3628(class572_sub15, i, (byte) 104);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(733716697);
			if (0 == i)
				break;
			method3628(class572_sub15, i, (byte) 72);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1190999978);
			if (0 == i)
				break;
			method3628(class572_sub15, i, (byte) 19);
		}
	}

	public void method468(int i, int i_2_) {
		/* empty */
	}

	public void method103() {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2097094469);
			if (0 == i)
				break;
			method3628(class572_sub15, i, (byte) 87);
		}
	}

	public void method106() {
		/* empty */
	}

	public void method469(int i) {
		/* empty */
	}

	void method3629(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt2840 = class572_sub15.readUnsignedByte(1432026397) * -321907983;
		else if (i == 2)
			anInt2843 = class572_sub15.readUnsignedShort(647518597) * 1834280167;
		else if (3 == i)
			anInt2842 = class572_sub15.readUnsignedShort(647518597) * -391835767;
		else if (i == 4)
			anInt2841 = class572_sub15.readShort(-710976385) * 472842363;
	}

	Class266() {
		/* empty */
	}

	void method3630(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt2840 = class572_sub15.readUnsignedByte(1397224937) * -321907983;
		else if (i == 2)
			anInt2843 = class572_sub15.readUnsignedShort(647518597) * 1834280167;
		else if (3 == i)
			anInt2842 = class572_sub15.readUnsignedShort(647518597) * -391835767;
		else if (i == 4)
			anInt2841 = class572_sub15.readShort(-710976385) * 472842363;
	}

	static void method3631(Class572_Sub12_Sub19 class572_sub12_sub19, int i) {
		boolean bool = false;
		class572_sub12_sub19.method8412(724585842);
		for (Class572_Sub12_Sub19 class572_sub12_sub19_3_ = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7848(-1042067865)); class572_sub12_sub19_3_ != null; class572_sub12_sub19_3_ = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7845(-991411221))) {
			if (Class245.method3348(class572_sub12_sub19.method10458(145088220), class572_sub12_sub19_3_.method10458(-1240947322), 1455824828)) {
				Class551.method6539(class572_sub12_sub19, class572_sub12_sub19_3_, 1179466163);
				bool = true;
				break;
			}
		}
		if (!bool)
			Class25.aClass664_176.method7842(class572_sub12_sub19, 2127450238);
	}

	public static void method3632(String string, boolean bool, boolean bool_4_, int i) {
		do {
			try {
				if (string.equalsIgnoreCase("commands") || string.equalsIgnoreCase("help")) {
					Class118.method2154("commands - This command", -501434577);
					Class118.method2154("cls - Clear console", 1045252395);
					Class118.method2154("displayfps - Toggle FPS and other information", -713138957);
					Class118.method2154("renderer - Print graphics renderer information", 856997121);
					Class118.method2154("heap - Print java memory information", -875922700);
					Class118.method2154("getcamerapos - Print location and direction of camera for use in bug reports", 139462819);
				} else if (string.equalsIgnoreCase("cls")) {
					Class190.anInt2232 = 0;
					Class190.anInt2233 = 0;
				} else if (string.equalsIgnoreCase("displayfps")) {
					client.aBool8874 = !client.aBool8874;
					if (client.aBool8874)
						Class118.method2154("FPS on", -394028381);
					else
						Class118.method2154("FPS off", 1877115083);
				} else if (string.equals("renderer")) {
					Class165 class165 = Class272_Sub2.aClass106_9517.method1662();
					Class118.method2154(new StringBuilder().append("Toolkit ID: ").append(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1951149441)).toString(), -1033377181);
					Class118.method2154(new StringBuilder().append("Vendor: ").append(class165.anInt2042 * -1937478109).toString(), 1085249137);
					Class118.method2154(new StringBuilder().append("Name: ").append(class165.aString2037).toString(), -1043590106);
					Class118.method2154(new StringBuilder().append("Version: ").append(class165.anInt2044 * 380261427).toString(), 600904506);
					Class118.method2154(new StringBuilder().append("Device: ").append(class165.aString2043).toString(), 834218465);
					Class118.method2154(new StringBuilder().append("Driver Version: ").append(-2707634995017507005L * class165.aLong2046).toString(), -660381108);
					String string_5_ = Class272_Sub2.aClass106_9517.method1681();
					if (string_5_.length() > 0)
						Class118.method2154(string_5_, 14947156);
				} else if (string.equals("heap"))
					Class118.method2154(new StringBuilder().append("Heap: ").append(-456796019 * Class584.anInt7769).append("MB").toString(), 1154536021);
				else if (string.equalsIgnoreCase("getcamerapos")) {
					Class497 class497 = client.aClass613_8605.method7280((byte) -24);
					if (625220759 * Class18.anInt143 == 1) {
						Class240 class240 = Class133_Sub1.aClass411_Sub1_9827.method4968(1302118654);
						Class240 class240_6_ = Class133_Sub1.aClass411_Sub1_9827.method4997(-481779842);
						Class118.method2154(new StringBuilder().append("Pos: ").append(new Class497((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9).toString()).append(" Height: ").append((Class314.method4072(((int) class240.aFloat2653 - (-2109597897 * class497.localX << 9)), ((int) class240.aFloat2657 - (417324155 * class497.localY << 9)), (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), -1902762338)) + (int) class240.aFloat2656).toString(), 1013123574);
						Class118.method2154(new StringBuilder().append("Look: ").append(new Class497((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), (int) class240_6_.aFloat2653 >> 9, (int) class240_6_.aFloat2657 >> 9).toString()).append(" Height: ").append((Class314.method4072(((int) class240_6_.aFloat2653 - (class497.localX * -2109597897 << 9)), ((int) class240.aFloat2657 - (class497.localY * 417324155 << 9)), (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), -1906863340)) + (int) class240.aFloat2656).toString(), -1457735457);
					} else {
						Class118.method2154(new StringBuilder().append("Pos: ").append(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009).append(",").append(((Class36.anInt387 * 386814715 >> 9) + class497.localX * -2109597897) >> 6).append(",").append(((-999214779 * Class49.anInt490 >> 9) + class497.localY * 417324155) >> 6).append(",").append(((Class36.anInt387 * 386814715 >> 9) + class497.localX * -2109597897) & 0x3f).append(",").append((class497.localY * 417324155 + (-999214779 * Class49.anInt490 >> 9)) & 0x3f).append(" Height: ").append((Class314.method4072(386814715 * Class36.anInt387, Class49.anInt490 * -999214779, (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), -2020121940)) - (-1094666305 * Class572_Sub13_Sub2.anInt11451)).toString(), -1421493786);
						Class118.method2154(new StringBuilder().append("Look: ").append(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009).append(",").append((-2109597897 * class497.localX + -1164955221 * Class442.anInt5132) >> 6).append(",").append((417324155 * class497.localY + -1833123249 * Class438.anInt5081) >> 6).append(",").append((Class442.anInt5132 * -1164955221 + class497.localX * -2109597897) & 0x3f).append(",").append((Class438.anInt5081 * -1833123249 + 417324155 * class497.localY) & 0x3f).append(" Height: ").append((Class314.method4072(Class442.anInt5132 * -1164955221, Class438.anInt5081 * -1833123249, (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), -1950676098)) - Class44.anInt445 * 611634393).toString(), 760482699);
					}
				} else if (string.equalsIgnoreCase("cam_shake_test")) {
					Class572_Sub12_Sub17_Sub2 class572_sub12_sub17_sub2 = (new Class572_Sub12_Sub17_Sub2(0, Class393.aClass393_4670, Class325.method4146(125), 2.0F));
					Class133_Sub1.aClass411_Sub1_9827.method5041(class572_sub12_sub17_sub2, -435326039);
				} else {
					if (!string.equalsIgnoreCase("cam_shake_reset"))
						break;
					Class133_Sub1.aClass411_Sub1_9827.method5022((byte) -58);
				}
			} catch (Exception exception) {
				Class118.method2154((Class279.aClass279_2951.method3758(Class594.aClass435_7823, 16711935)), -1325219199);
			}
			return;
		} while (false);
		if (Class151.aClass434_1702 != Class434.aClass434_5044 || -1550439133 * client.rights >= 2) {
			try {
				if (string.equalsIgnoreCase("wm1")) {
					Class572_Sub8_Sub1.method10279(1, -1, -1, false, 623786968);
					if (Class344_Sub2.method9253(-1565539699) == 1)
						Class118.method2154("Success", 1994776650);
					else
						Class118.method2154("Failure", -173452944);
					return;
				}
				if (string.equalsIgnoreCase("wm2")) {
					Class572_Sub8_Sub1.method10279(2, -1, -1, false, 623786968);
					if (Class344_Sub2.method9253(-704135425) == 2)
						Class118.method2154("Success", -2025997500);
					else
						Class118.method2154("Failure", 1648753702);
					return;
				}
				if (Class637.aBool8266 && string.equalsIgnoreCase("wm3")) {
					Class572_Sub8_Sub1.method10279(3, 1024, 768, false, 623786968);
					if (Class344_Sub2.method9253(1985115234) == 3)
						Class118.method2154("Success", -1819883800);
					else
						Class118.method2154("Failure", -1669239848);
					return;
				}
				if (string.startsWith("setlobby ")) {
					if (client.anInt8580 * 835742603 != 12)
						Class118.method2154("Failure", 1277871477);
					else {
						int i_7_ = -1;
						Object object = null;
						string = string.substring(9);
						int i_8_ = string.indexOf(' ');
						if (-1 == i_8_)
							Class118.method2154("Failure", -1080334333);
						else {
							try {
								i_7_ = Integer.parseInt(string.substring(0, i_8_));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (-1 == i_7_)
								Class118.method2154("Failure", 825619715);
							else {
								String string_9_ = new StringBuilder().append(string.substring(1 + i_8_).trim()).append(".runescape.com").toString();
								Class462.method5474(string_9_, i_7_, (byte) -116);
								Class118.method2154("Success", 1547355394);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.startsWith("setmediastream ")) {
					if (835742603 * client.anInt8580 != 12)
						Class118.method2154("Failure", -1630980178);
					else {
						int i_10_ = -1;
						Object object = null;
						string = string.substring(15);
						int i_11_ = string.indexOf(' ');
						if (i_11_ == -1)
							Class118.method2154("Failure", 282405887);
						else {
							try {
								i_10_ = (Integer.parseInt(string.substring(0, i_11_)));
							} catch (NumberFormatException numberformatexception) {
								/* empty */
							}
							if (i_10_ == -1)
								Class118.method2154("Failure", 1188939386);
							else {
								String string_12_ = new StringBuilder().append(string.substring(1 + i_11_).trim()).append(".runescape.com").toString();
								Class130.method2280(string_12_, i_10_, 1363850375);
								Class72.aClass617_721.method7382(Class633.aClass641_8196.address, Class633.aClass641_8196.method7600(1988074258), 543520437);
								Class41.aClass259_425.method3547(952649562);
								Class118.method2154("Success", -555949649);
								return;
							}
							return;
						}
						return;
					}
					return;
				}
				if (string.equalsIgnoreCase("tk0")) {
					BaseVarType.method7260(0, false, 2048155328);
					if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1702179261) == 0) {
						Class118.method2154("Success", 1763763626);
						Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub30_9231), 0, 1111051410);
						Class623.method7443(-1046784396);
						client.aBool8854 = false;
					} else
						Class118.method2154("Failure", 1111414954);
					return;
				}
				if (string.equalsIgnoreCase("tk1")) {
					BaseVarType.method7260(1, false, 1466092261);
					if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1903919082) == 1) {
						Class118.method2154("Success", 1176115850);
						Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub30_9231), 1, 887789278);
						Class623.method7443(-1085780741);
						client.aBool8854 = false;
					} else
						Class118.method2154("Failure", 1912626989);
					return;
				}
				if (string.equalsIgnoreCase("tk3")) {
					BaseVarType.method7260(3, false, 1869307326);
					if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1565707437) == 3) {
						Class118.method2154("Success", -820196190);
						Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub30_9231), 3, 611583731);
						Class623.method7443(-1401582954);
						client.aBool8854 = false;
					} else
						Class118.method2154("Failure", 414985584);
					return;
				}
				if (string.equalsIgnoreCase("tk5")) {
					BaseVarType.method7260(5, false, 1431638375);
					if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1886941879) == 5) {
						Class118.method2154("Success", 1112950022);
						Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub30_9231), 5, 2146698155);
						Class623.method7443(-1913327995);
						client.aBool8854 = false;
					} else
						Class118.method2154("Failure", -1309208831);
					return;
				}
				if (string.equalsIgnoreCase("clientdrop")) {
					if (client.anInt8580 * 835742603 == 1)
						Class113.method2092(1960008064);
					else if (client.anInt8580 * 835742603 == 18)
						client.aClass195_8589.aBool2344 = true;
					return;
				}
				if (string.equalsIgnoreCase("breakcon")) {
					Class195[] class195s = client.aClass195Array8592;
					for (int i_13_ = 0; i_13_ < class195s.length; i_13_++) {
						Class195 class195 = class195s[i_13_];
						if (class195.method2933(-2118440609) != null)
							class195.method2933(-1974992496).method6564(936135786);
					}
					Class51.aClass278_491.method3732(-1048625197);
					return;
				}
				if (string.startsWith("getclientvarpbit")) {
					int i_14_ = Integer.parseInt(string.substring(17));
					Class118.method2154(new StringBuilder().append("varpbit=").append(Class133_Sub23.playerVarsProvider.method72(Class133_Sub23.playerVarsProvider.method95(i_14_, 819446449), -458156336)).toString(), 1552035202);
					return;
				}
				if (string.startsWith("getclientvarp")) {
					int i_15_ = Integer.parseInt(string.substring(14));
					Class118.method2154(new StringBuilder().append("varp=").append(Class133_Sub23.playerVarsProvider.method73((Class133_Sub23.playerVarsProvider.method94(VarDomainType.PLAYER_CONFIGS, i_15_, (byte) 119)), -1335170955)).toString(), -523795165);
					return;
				}
				if (string.startsWith("directlogin")) {
					String[] strings = Class104_Sub2.method9935(string.substring(12), ' ', 207597699);
					if (2 == strings.length || strings.length == 3) {
						if (Class574.method6808(-709258367))
							Class269.method3659(1622797108);
						Class257.method3541(strings[0], strings[1], (strings.length > 2 ? strings[2] : ""), true, -1050420693);
					}
					return;
				}
				if (string.startsWith("snlogin ")) {
					String[] strings = Class104_Sub2.method9935(string.substring(8), ' ', 207597699);
					int i_16_ = Integer.parseInt(strings[0]);
					String string_17_ = strings.length > 1 ? strings[1] : "";
					Class542.method6438(i_16_, string_17_, true, 325411818);
					return;
				}
				if (string.startsWith("setoutput ")) {
					File file = new File(string.substring(10));
					if (file.exists()) {
						file = new File(new StringBuilder().append(string.substring(10)).append(".").append(Class69.method1067(-1689156788)).append(".log").toString());
						if (file.exists()) {
							Class118.method2154("file already exists!", 1033096431);
							return;
						}
					}
					if (null != Class5.aFileOutputStream31) {
						Class5.aFileOutputStream31.close();
						Class5.aFileOutputStream31 = null;
					}
					try {
						Class5.aFileOutputStream31 = new FileOutputStream(file);
					} catch (FileNotFoundException filenotfoundexception) {
						Class118.method2154(new StringBuilder().append("Could not create ").append(file.getName()).toString(), -470792712);
					} catch (SecurityException securityexception) {
						Class118.method2154(new StringBuilder().append("Cannot write to ").append(file.getName()).toString(), -1833897246);
					}
					return;
				}
				if (string.equals("closeoutput")) {
					if (Class5.aFileOutputStream31 != null)
						Class5.aFileOutputStream31.close();
					Class5.aFileOutputStream31 = null;
					return;
				}
				if (string.startsWith("runscript ")) {
					File file = new File(string.substring(10));
					if (!file.exists()) {
						Class118.method2154("No such file", -295532669);
						return;
					}
					byte[] is = Class128.method2259(file, (byte) -6);
					if (null == is) {
						Class118.method2154("Failed to read file", 1385364575);
						return;
					}
					String[] strings = (Class104_Sub2.method9935((Class500.method5950(RSSocket.method7602(is, -1797848196), '\r', "", (byte) 4)), '\n', 207597699));
					Class208.method3038(strings, (byte) 73);
				}
				if (string.equalsIgnoreCase("togglesnow")) {
					Class190.aBool2239 = !Class190.aBool2239;
					Class118.method2154("Success", -2027284060);
					return;
				}
				if (835742603 * client.anInt8580 == 1 || 5 == client.anInt8580 * 835742603) {
					Class195 class195 = Class166.method2676((byte) 35);
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.COMMANDS_PACKET, class195.aClass650_2340, -1072981984);
					class572_sub25.aRsByteBuffer.writeByte(string.length() + 3, -1384395473);
					class572_sub25.aRsByteBuffer.writeByte(bool ? 1 : 0, -1384395473);
					class572_sub25.aRsByteBuffer.writeByte(bool_4_ ? 1 : 0, -1384395473);
					class572_sub25.aRsByteBuffer.writeString(string, (byte) -113);
					class195.method2929(class572_sub25, (byte) -124);
				}
			} catch (Exception exception) {
				Class118.method2154((Class279.aClass279_2951.method3758(Class594.aClass435_7823, 16711935)), -1641930606);
				return;
			}
		}
		if (client.anInt8580 * 835742603 != 1 && 835742603 * client.anInt8580 != 5)
			Class118.method2154(new StringBuilder().append(Class279.aClass279_2953.method3758(Class594.aClass435_7823, 16711935)).append(string).toString(), -1004735648);
	}

	static final void method3633(Cs2Executor class441, int i) {
		if (5 != client.anInt8580 * 835742603 || Class574.method6808(-115159583))
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else if (Class633.aBool8202)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else if (661584712947707725L * Class633.aLong8199 > Class69.method1067(-2034514711) - 1000L)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else {
			Class633.aBool8202 = true;
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.UPDATE_WORLD_LIST, client.aClass195_8632.aClass650_2340, 731314657);
			class572_sub25.aRsByteBuffer.writeInt(Class133_Sub4_Sub2.anInt11203 * 301096939, -1743753997);
			client.aClass195_8632.method2929(class572_sub25, (byte) -80);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		}
	}
}

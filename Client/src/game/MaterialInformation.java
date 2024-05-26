package game;

/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class MaterialInformation {
	static final int anInt1299 = 256;
	static final int anInt1300 = 1;
	static final int anInt1301 = 32;
	static final int anInt1302 = 3;
	public static final int anInt1303 = 3;
	public static final int anInt1304 = 0;
	static final int anInt1305 = 2;
	public static final int anInt1306 = 2;
	static final int anInt1307 = 1;
	public static final int anInt1308 = 4;
	public static final int anInt1309 = 5;
	public static final int anInt1310 = 11;
	public static final int anInt1311 = 1;
	static final int anInt1312 = 4;
	public static final byte aByte1313 = 0;
	static final int anInt1314 = 4;
	static final int anInt1315 = 2;
	static final int anInt1316 = 64;
	public short aShort1317;
	static final int anInt1318 = 256;
	public static final int anInt1319 = 6;
	static final int anInt1320 = 1024;
	static final int anInt1321 = 2048;
	static final int anInt1322 = 4096;
	public byte combineMode;
	static final int anInt1324 = 8;
	static final int anInt1325 = 64;
	static final int anInt1326 = 128;
	static final int anInt1327 = 32;
	public static final int anInt1328 = 3;
	static final int anInt1329 = 512;
	static final int anInt1330 = 16;
	static final int anInt1331 = 16;
	static final int anInt1332 = 2;
	static final int anInt1333 = 4;
	static final int anInt1334 = 8;
	public int textureId = 1658409611;
	public int[] anIntArray1336 = null;
	byte[] aByteArray1337 = null;
	public int anInt1338;
	public byte textureSpeedU = 0;
	public byte textureSpeedV = 0;
	public boolean aBool1341 = false;
	public Class511 aClass511_1342 = Class511.aClass511_5695;
	public byte aByte1343 = -1;
	public byte aByte1344 = 0;
	public byte aByte1345 = 0;
	public static final int anInt1346 = 0;
	static final int anInt1347 = 128;
	public static final int anInt1348 = 2;
	static final int anInt1349 = 1;
	public boolean aBool1350;
	public static final int anInt1351 = 5;
	public static final int anInt1352 = 13;
	public static final int anInt1353 = 7;
	public static final int anInt1354 = 8;
	public static final int anInt1355 = 9;
	public byte effectId = 0;
	public static final int anInt1357 = 1;
	public static final int anInt1358 = 16;
	static final int anInt1359 = 0;
	public byte effectParam1 = 0;
	public int anInt1361 = 0;
	public byte aByte1362 = 0;
	public boolean aBool1363 = false;
	public static final int anInt1364 = 4;
	static final int anInt1365 = 512;
	public byte aByte1366;
	public static final byte aByte1367 = 1;
	public byte aByte1368;

	public static boolean method1596(int i) {
		return 1 != i && 7 != i;
	}

	void method1597(int i, RSByteBuffer class572_sub15, int i_0_) {
		int i_1_ = class572_sub15.readUnsignedByte(1530703177);
		if (i_1_ == 0)
			anInt1338 = 996222400;
		else if (1 == i_1_)
			anInt1338 = 1992444800;
		else if (i_1_ == 2)
			anInt1338 = -310077696;
		else if (i_1_ == 3)
			anInt1338 = -620155392;
		else if (i_1_ == 4)
			anInt1338 = -1240310784;
		int i_2_ = class572_sub15.readInt(1268175660);
		if ((i_2_ & 0x1) != 0) {
			textureId = class572_sub15.readUnsignedShort(647518597) * -1658409611;
			class572_sub15.readUnsignedByte(1698923919);
		}
		if ((i_2_ & 0x1000) != 0) {
			anIntArray1336 = new int[6];
			((MaterialInformation) this).aByteArray1337 = new byte[6];
			for (int i_3_ = 0; i_3_ < 6; i_3_++) {
				anIntArray1336[i_3_] = class572_sub15.readUnsignedShort(647518597);
				((MaterialInformation) this).aByteArray1337[i_3_] = (byte) class572_sub15.readUnsignedByte(925063023);
			}
		}
		if ((i_2_ & 0x2) != 0) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(520950183);
		}
		if ((i_2_ & 0x4) != 0) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(2147224492);
		}
		if ((i_2_ & 0x8) != 0)
			class572_sub15.readUnsignedShort(647518597);
		if (0 != (i_2_ & 0x10)) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(516755220);
		}
		if (0 != (i_2_ & 0x20)) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(1177892665);
		}
		if ((i_2_ & 0x40) != 0) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(98617180);
		}
		if ((i_2_ & 0x80) != 0) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(859676286);
		}
		if (0 != (i_2_ & 0x100)) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(1019671104);
		}
		if (0 != (i_2_ & 0x200)) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(1917346031);
		}
		if (0 != (i_2_ & 0x400)) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(35858460);
		}
		if ((i_2_ & 0x800) != 0) {
			class572_sub15.readUnsignedShort(647518597);
			class572_sub15.readUnsignedByte(307580362);
		}
		int i_4_ = class572_sub15.readUnsignedByte(31717706);
		aByte1344 = (byte) (i_4_ & 0xf);
		aByte1345 = (byte) (i_4_ >> 4 & 0xf);
		int i_5_ = class572_sub15.readInt(1185133901);
		if ((i_5_ & 0x10) != 0) {
			class572_sub15.method8448((byte) 2);
			class572_sub15.method8448((byte) 2);
		}
		if (0 != (i_5_ & 0x20))
			class572_sub15.readInt(-429683992);
		if ((i_5_ & 0x40) != 0)
			class572_sub15.readInt(173697429);
		if ((i_5_ & 0x80) != 0)
			class572_sub15.readInt(-977840572);
		if (0 != (i_5_ & 0x100))
			class572_sub15.readInt(886721628);
		if (0 != (i_5_ & 0x200))
			class572_sub15.readInt(823133839);
		aBool1341 = class572_sub15.readUnsignedByte(1420271553) == 1;
		Class455.method5387(Class16.method668(-852665954), class572_sub15.readUnsignedByte(1206508695), -1887599522);
		Class455.method5387(Class46.method834((byte) 0), class572_sub15.readUnsignedByte(685824294), -1953240767);
		aClass511_1342 = ((Class511) Class455.method5387(Class69.method1073(-2077599643), class572_sub15.readUnsignedByte(1084366965), -1879926657));
		if (aClass511_1342 == Class511.aClass511_5696)
			aByte1343 = (byte) class572_sub15.readUnsignedByte(1730042473);
		int i_6_ = class572_sub15.readUnsignedByte(1329579355);
		if ((i_6_ & 0x1) != 0)
			textureSpeedU = (byte) class572_sub15.readUnsignedByte(1685467139);
		if ((i_6_ & 0x2) != 0)
			textureSpeedV = (byte) class572_sub15.readUnsignedByte(2006410477);
		if (0 != (i_6_ & 0x4))
			class572_sub15.readUnsignedByte(1856015409);
		if (0 != (i_6_ & 0x8))
			class572_sub15.readUnsignedByte(236988344);
		if (class572_sub15.readUnsignedByte(1054602840) == 1) {
			effectId = (byte) class572_sub15.readUnsignedByte(954059026);
			effectParam1 = (byte) class572_sub15.readUnsignedByte(-84613412);
			anInt1361 = class572_sub15.readInt(415502799) * 1448366229;
			combineMode = (byte) class572_sub15.readUnsignedByte(966509509);
			class572_sub15.readUnsignedByte(626555115);
			aByte1362 = (byte) class572_sub15.readUnsignedByte(1390791327);
			aBool1363 = class572_sub15.readUnsignedByte(20331866) == 1;
			aBool1350 = class572_sub15.readUnsignedByte(2112430897) == 1;
			aByte1368 = (byte) class572_sub15.readUnsignedByte(379596445);
			aByte1366 = (byte) class572_sub15.readUnsignedByte(1448186595);
			aShort1317 = (short) class572_sub15.readUnsignedShort(647518597);
		}
	}

	public static boolean method1598(int i) {
		return 1 != i && 7 != i;
	}

	MaterialInformation() {
		aBool1350 = false;
		aByte1368 = (byte) 0;
		aByte1366 = (byte) -1;
		combineMode = (byte) 0;
		aShort1317 = (short) 0;
	}

	static final void method1599(Cs2Executor class441, int i) {
		client.aClass73_8770 = null;
		client.aClass73_8771 = null;
	}

	static final void method1600(Cs2Executor class441, byte i) {
		NPC class456_sub1_sub2_sub3_sub1 = ((NPC) ((Cs2Executor) class441).entity);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class456_sub1_sub2_sub3_sub1.anInt11806 * 1667386203;
	}

	static final void method1601(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1;
	}

	static final void method1602(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class256.method3539(i_7_, (byte) 105);
	}

	static final void method1603(InterfaceDefinitions class73, Cs2Executor class441, int i) {
		int i_8_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_9_ = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) - 1);
		int i_10_ = i_9_;
		if (class73.anInt892 * -22820201 != 6 && -22820201 * class73.anInt892 != 2)
			throw new RuntimeException("");
		NPCDefintion class410 = ((NPCDefintion) Class197.aClass639_Sub15_2360.getDefinition(-1063203465 * class73.anInt803, -1592105712));
		if (null == class73.aClass399_908)
			class73.aClass399_908 = new Class399(class410, 6 == class73.anInt892 * -22820201);
		class73.aClass399_908.aLong4723 = Class542.method6439(-1835602804) * -6756611017005174427L;
		if (class410.aByteArray4803 != null) {
			if (i_9_ < 0 || i_9_ >= class410.aByteArray4803.length)
				throw new RuntimeException("");
			i_10_ = class410.aByteArray4803[i_9_];
		}
		if (class410.aShortArray4801 == null || i_10_ < 0 || i_10_ >= class410.aShortArray4801.length)
			throw new RuntimeException("");
		class73.aClass399_908.aShortArray4725[i_10_] = (short) i_8_;
		Class555.method6575(class73, (short) 1989);
	}

	static void method1604(int i) {
		if (Class434.aClass434_5044 == Class151.aClass434_1702) {
			Class633.aClass641_8196.port = 1192984823;
			Class633.aClass641_8196.securePort = 42791504;
		} else if (Class151.aClass434_1702.method5252(Class440.aClass440_5094, 637773908)) {
			Class633.aClass641_8208.port = Class633.aClass641_8208.id * -984285601 + -1352120000;
			Class633.aClass641_8208.securePort = 974886224 + -172050845 * Class633.aClass641_8208.id;
			Class633.aClass641_8196.port = -984285601 * Class633.aClass641_8196.id + -1352120000;
			if (Class633.aClass641_8196.aBool8289)
				Class633.aClass641_8196.securePort = (2123758304 + -172050845 * Class633.aClass641_8196.id);
			else
				Class633.aClass641_8196.securePort = (1596772952 + Class633.aClass641_8196.id * -172050845);
		} else if (Class151.aClass434_1702 == Class434.aClass434_5047) {
			Class633.aClass641_8208.port = -1352120000 + -984285601 * Class633.aClass641_8208.id;
			Class633.aClass641_8208.securePort = -172050845 * Class633.aClass641_8208.id + 974886224;
			Class633.aClass641_8196.port = -1352120000 + -984285601 * Class633.aClass641_8196.id;
			if (Class633.aClass641_8196.aBool8289)
				Class633.aClass641_8196.securePort = (Class633.aClass641_8196.id * -172050845 + 2123758304);
			else
				Class633.aClass641_8196.securePort = (Class633.aClass641_8196.id * -172050845 + 1596772952);
		}
	}

	static final boolean method1605(Class195 class195, int i) {
		boolean bool;
		try {
			bool = PacketsDecoder.method3031(class195, (byte) 78);
		} catch (IOException ioexception) {
			if (client.anInt8580 * 835742603 == 11) {
				class195.method2946((byte) 0);
				return false;
			}
			Class113.method2092(2136611172);
			return true;
		} catch (Exception exception) {
			Class497 class497 = client.aClass613_8605.method7280((byte) -90);
			String string = new StringBuilder().append(((Class195) class195).currentPacket != null ? (((Class195) class195).currentPacket.id * 1839801621) : -1).append(Class3.aString23).append(null != ((Class195) class195).aClass321_2342 ? (((Class195) class195).aClass321_2342.id * 1839801621) : -1).append(Class3.aString23).append(((Class195) class195).aClass321_2343 != null ? (((Class195) class195).aClass321_2343.id * 1839801621) : -1).append(" ").append(-875297237 * ((Class195) class195).anInt2333).append(Class3.aString23).append((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) + class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])).append(" ").toString();
			for (int i_11_ = 0; (i_11_ < ((Class195) class195).anInt2333 * -875297237 && i_11_ < 50); i_11_++)
				string = new StringBuilder().append(string).append(((Class195) class195).aClass572_Sub15_Sub2_2330.b[i_11_]).append(Class3.aString23).toString();
			Class640.method7592(string, exception, 911653656);
			Class439.method5276(false, (byte) 8);
			return true;
		}
		return bool;
	}

	public static final void method1606(String string, String string_12_, int i) {
		Class195 class195 = Class166.method2676((byte) 69);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3751, class195.aClass650_2340, -1689406964);
		if (string_12_.length() > 30)
			string_12_ = string_12_.substring(0, 30);
		class572_sub25.aRsByteBuffer.writeByte((ObjectDefinitions.method6069(string, -1501436417) + ObjectDefinitions.method6069(string_12_, -1740777360)), -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -38);
		class572_sub25.aRsByteBuffer.writeString(string_12_, (byte) -20);
		class195.method2929(class572_sub25, (byte) -22);
	}

	static int method1607(Class481_Sub1 class481_sub1, Class481_Sub1 class481_sub1_13_, int i, boolean bool, int i_14_, boolean bool_15_, byte i_16_) {
		int i_17_ = NPCDefintion.method4964(class481_sub1, class481_sub1_13_, i, bool, -1792451069);
		if (0 != i_17_) {
			if (bool)
				return -i_17_;
			return i_17_;
		}
		if (-1 == i_14_)
			return 0;
		int i_18_ = NPCDefintion.method4964(class481_sub1, class481_sub1_13_, i_14_, bool_15_, -1706731159);
		if (bool_15_)
			return -i_18_;
		return i_18_;
	}

	static final void method1608(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 448209883 * Class547_Sub1.anInt8987 == 100 ? 1 : 0;
	}
}

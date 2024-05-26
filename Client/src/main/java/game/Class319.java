package game;

/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class319 implements Interface52 {
	static Class319 aClass319_3876;
	public int anInt3877;
	public boolean aBool3878;
	static Class319 aClass319_3879;
	static Class319 aClass319_3880;
	static Class319 aClass319_3881;
	static Class319 aClass319_3882;
	static Class319 aClass319_3883;
	static Class319 aClass319_3884;
	int anInt3885;
	static Class319 aClass319_3886;
	public boolean aBool3887;
	static Class319 aClass319_3888 = new Class319(0, -1, true, false, true);
	public static Class639_Sub17 aClass639_Sub17_3889;

	public int getId(int i) {
		return 1761311505 * ((Class319) this).anInt3885;
	}

	static {
		aClass319_3886 = new Class319(1, 0, true, true, true);
		aClass319_3884 = new Class319(2, 1, true, true, false);
		aClass319_3879 = new Class319(3, 8, false, true, true);
		aClass319_3880 = new Class319(4, 9, false, false, true);
		aClass319_3881 = new Class319(5, 10, false, true, true);
		aClass319_3882 = new Class319(6, 11, false, false, true);
		aClass319_3883 = new Class319(7, 12, false, false, true);
		aClass319_3876 = new Class319(8, 13, false, false, true);
	}

	public int method143() {
		return 1761311505 * ((Class319) this).anInt3885;
	}

	public int method45() {
		return 1761311505 * ((Class319) this).anInt3885;
	}

	public int method61() {
		return 1761311505 * ((Class319) this).anInt3885;
	}

	Class319(int i, int i_0_, boolean bool, boolean bool_1_, boolean bool_2_) {
		((Class319) this).anInt3885 = i * -132327951;
		anInt3877 = i_0_ * 1532129753;
		aBool3887 = bool_1_;
		aBool3878 = bool_2_;
	}

	public int method43() {
		return 1761311505 * ((Class319) this).anInt3885;
	}

	static final void method4091(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) -21193);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		Class59.method1005(class73, class83, class441, (short) -7588);
	}

	static final void method4092(Cs2Executor class441, int i) {
		long l = Class69.method1067(-2057175120);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) (l / 60000L);
	}

	public static final void method4093(int i) {
		if (!client.aBool8681) {
			client.aFloat8660 += (-12.0F - client.aFloat8660) / 2.0F;
			client.aBool8685 = true;
			client.aBool8681 = true;
		}
	}

	static void method4094(Class572_Sub12_Sub10 class572_sub12_sub10, int i, int i_4_, byte i_5_) {
		if (class572_sub12_sub10 != null && Class25.aClass675_174.aClass572_8547 != class572_sub12_sub10) {
			int i_6_ = (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11397 * 740323685);
			int i_7_ = (200110927 * ((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11392);
			int i_8_ = (-44467871 * ((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402);
			int i_9_ = (int) ((((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11395) * -6760453999157901937L);
			long l = (-6760453999157901937L * ((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11395);
			if (i_8_ >= 2000)
				i_8_ -= 2000;
			Class497 class497 = client.aClass613_8605.method7280((byte) -102);
			if (16 == i_8_) {
				client.anInt8706 = i * 253386063;
				client.anInt8707 = 272032225 * i_4_;
				client.anInt8606 = 1719214866;
				client.anInt8803 = 0;
				Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3716, client.aClass195_8589.aClass650_2340, -1733964022);
				class572_sub25.aRsByteBuffer.writeShortLE(654388253 * client.anInt8755, -971252436);
				class572_sub25.aRsByteBuffer.write128Byte(Class445.method5339(-1450389533) ? 1 : 0, (byte) -102);
				class572_sub25.aRsByteBuffer.writeIntV1(-806385553 * Class167.interfaceHash, 65280);
				class572_sub25.aRsByteBuffer.writeShortLE128(-1582286463 * client.anInt8756, (byte) -64);
				class572_sub25.aRsByteBuffer.writeShortLE(-821391465 * (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.anInt11633), -971252436);
				client.aClass195_8589.method2929(class572_sub25, (byte) -90);
			}
			if (25 == i_8_) {
				InterfaceDefinitions class73 = Class530.method6338(i_7_, i_6_, 2089684701);
				if (null != class73) {
					Class131.method2286(-1705608345);
					Class572_Sub30 class572_sub30 = client.method7992(class73);
					Class639_Sub16.method8968(class73, class572_sub30.method8647((byte) 0), class572_sub30.anInt9302 * 1054444675, 16711935);
					client.aString8757 = Class607.method7252(class73, -870074249);
					if (null == client.aString8757)
						client.aString8757 = "Null";
					client.aString8732 = new StringBuilder().append(class73.aString847).append(GraphicsDefinition.method7770(16777215, (byte) -18)).toString();
				}
			} else {
				OutgoingPacket class312 = null;
				if (i_8_ == 18)
					class312 = OutgoingPacket.aClass312_3777;
				else if (i_8_ == 19)
					class312 = OutgoingPacket.aClass312_3695;
				else if (i_8_ == 20)
					class312 = OutgoingPacket.TAKE_ITEM;
				else if (i_8_ == 21)
					class312 = OutgoingPacket.aClass312_3745;
				else if (22 == i_8_)
					class312 = OutgoingPacket.aClass312_3775;
				else if (i_8_ == 1004)
					class312 = OutgoingPacket.aClass312_3754;
				if (null != class312) {
					client.anInt8706 = 253386063 * i;
					client.anInt8707 = i_4_ * 272032225;
					client.anInt8606 = 1719214866;
					client.anInt8803 = 0;
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(class312, (client.aClass195_8589.aClass650_2340), -1937737887);
					class572_sub25.aRsByteBuffer.writeShortLE128(class497.localY * 417324155 + i_7_, (byte) -8);
					class572_sub25.aRsByteBuffer.writeShort128(i_9_, -16711936);
					class572_sub25.aRsByteBuffer.writeByte(Class445.method5339(-893994362) ? 1 : 0, -1384395473);
					class572_sub25.aRsByteBuffer.writeShort128(i_6_ + -2109597897 * class497.localX, -16711936);
					client.aClass195_8589.method2929(class572_sub25, (byte) -20);
					Class616.method7377(i_6_, i_7_, -1146690609);
				}
				if (8 == i_8_) {
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_9_));
					if (class572_sub9 != null) {
						NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
						client.anInt8706 = 253386063 * i;
						client.anInt8707 = i_4_ * 272032225;
						client.anInt8606 = 1719214866;
						client.anInt8803 = 0;
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3670, (client.aClass195_8589.aClass650_2340), -1698324202);
						class572_sub25.aRsByteBuffer.writeIntLE(Class167.interfaceHash * -806385553, (byte) 55);
						class572_sub25.aRsByteBuffer.writeShort(654388253 * client.anInt8755, -931195514);
						class572_sub25.aRsByteBuffer.writeShort(-1582286463 * client.anInt8756, -2107916095);
						class572_sub25.aRsByteBuffer.writeShort(i_9_, -816330023);
						class572_sub25.aRsByteBuffer.writeByte128(Class445.method5339(-948877087) ? 1 : 0, 1839547733);
						client.aClass195_8589.method2929(class572_sub25, (byte) -62);
						Class616.method7377((class456_sub1_sub2_sub3_sub1.screenX[0]), (class456_sub1_sub2_sub3_sub1.screenY[0]), -2128852175);
					}
				}
				if (i_8_ == 30 && client.aClass73_8762 == null) {
					Class200.method2993(i_7_, i_6_, (byte) -57);
					client.aClass73_8762 = Class530.method6338(i_7_, i_6_, -2013841957);
					if (client.aClass73_8762 != null)
						Class555.method6575(client.aClass73_8762, (short) 23215);
				}
				if (i_8_ == 15) {
					Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_9_];
					if (class456_sub1_sub2_sub3_sub2 != null) {
						client.anInt8706 = 253386063 * i;
						client.anInt8707 = i_4_ * 272032225;
						client.anInt8606 = 1719214866;
						client.anInt8803 = 0;
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3716, (client.aClass195_8589.aClass650_2340), 937257848);
						class572_sub25.aRsByteBuffer.writeShortLE(654388253 * client.anInt8755, -971252436);
						class572_sub25.aRsByteBuffer.write128Byte(Class445.method5339(642047461) ? 1 : 0, (byte) -23);
						class572_sub25.aRsByteBuffer.writeIntV1(-806385553 * Class167.interfaceHash, 65280);
						class572_sub25.aRsByteBuffer.writeShortLE128(client.anInt8756 * -1582286463, (byte) -95);
						class572_sub25.aRsByteBuffer.writeShortLE(i_9_, -971252436);
						client.aClass195_8589.method2929(class572_sub25, (byte) -74);
						Class616.method7377((class456_sub1_sub2_sub3_sub2.screenX[0]), (class456_sub1_sub2_sub3_sub2.screenY[0]), -1082222782);
					}
				}
				if (i_8_ == 2) {
					client.anInt8706 = 253386063 * i;
					client.anInt8707 = 272032225 * i_4_;
					client.anInt8606 = 1719214866;
					client.anInt8803 = 0;
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3779, (client.aClass195_8589.aClass650_2340), 269448065);
					class572_sub25.aRsByteBuffer.writeByte(Class445.method5339(-1218978902) ? 1 : 0, -1384395473);
					class572_sub25.aRsByteBuffer.writeInt(Class167.interfaceHash * -806385553, -1743753997);
					class572_sub25.aRsByteBuffer.writeShort128(client.anInt8755 * 654388253, -16711936);
					class572_sub25.aRsByteBuffer.writeShortLE128(i_6_ + class497.localX * -2109597897, (byte) -128);
					class572_sub25.aRsByteBuffer.writeIntV1((int) (l >>> 32) & 0x7fffffff, 65280);
					class572_sub25.aRsByteBuffer.writeShortLE(class497.localY * 417324155 + i_7_, -971252436);
					class572_sub25.aRsByteBuffer.writeShort(client.anInt8756 * -1582286463, -1159788419);
					client.aClass195_8589.method2929(class572_sub25, (byte) -42);
					Class616.method7377(i_6_, i_7_, -1321738775);
				}
				if (i_8_ == 60) {
					if (client.rights * -1550439133 > 0 && Class249.method3427(-2141677931))
						Class21.method703((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), (class497.localX * -2109597897 + i_6_), (class497.localY * 417324155 + i_7_), -2090858648);
					else {
						client.anInt8706 = i * 253386063;
						client.anInt8707 = i_4_ * 272032225;
						client.anInt8606 = -1287876215;
						client.anInt8803 = 0;
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3679, (client.aClass195_8589.aClass650_2340), 35618984);
						class572_sub25.aRsByteBuffer.writeShortLE128(-2109597897 * class497.localX + i_6_, (byte) -88);
						class572_sub25.aRsByteBuffer.writeShortLE(class497.localY * 417324155 + i_7_, -971252436);
						client.aClass195_8589.method2929(class572_sub25, (byte) -3);
					}
				}
				if (59 == i_8_) {
					client.anInt8706 = 253386063 * i;
					client.anInt8707 = i_4_ * 272032225;
					client.anInt8606 = -1287876215;
					client.anInt8803 = 0;
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3707, (client.aClass195_8589.aClass650_2340), -555836065);
					class572_sub25.aRsByteBuffer.writeShort128(client.anInt8756 * -1582286463, -16711936);
					class572_sub25.aRsByteBuffer.writeShort128(i_7_ + 417324155 * class497.localY, -16711936);
					class572_sub25.aRsByteBuffer.writeIntV1(-806385553 * Class167.interfaceHash, 65280);
					class572_sub25.aRsByteBuffer.writeShort(client.anInt8755 * 654388253, -769354617);
					class572_sub25.aRsByteBuffer.writeShortLE128(i_6_ + class497.localX * -2109597897, (byte) -55);
					client.aClass195_8589.method2929(class572_sub25, (byte) -26);
					Class616.method7377(i_6_, i_7_, -1283190408);
				}
				if (57 == i_8_ || 1007 == i_8_)
					Class385.method4663(i_9_, i_7_, i_6_, ((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391, (byte) -40);
				if (1008 == i_8_ || i_8_ == 1009 || 1010 == i_8_ || 1011 == i_8_ || i_8_ == 1012)
					Class122.method2198(i_8_, i_9_, i_6_, 159203281);
				if (58 == i_8_) {
					InterfaceDefinitions class73 = Class530.method6338(i_7_, i_6_, -93040308);
					if (null != class73)
						Class131.method2287(class73, 2137708951);
				}
				if (17 == i_8_) {
					client.anInt8706 = 253386063 * i;
					client.anInt8707 = i_4_ * 272032225;
					client.anInt8606 = 1719214866;
					client.anInt8803 = 0;
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3700, (client.aClass195_8589.aClass650_2340), -1000901349);
					class572_sub25.aRsByteBuffer.write128Byte(Class445.method5339(899655056) ? 1 : 0, (byte) -31);
					class572_sub25.aRsByteBuffer.writeShort128(654388253 * client.anInt8755, -16711936);
					class572_sub25.aRsByteBuffer.writeShort128(-2109597897 * class497.localX + i_6_, -16711936);
					class572_sub25.aRsByteBuffer.writeIntV2(Class167.interfaceHash * -806385553, (byte) 1);
					class572_sub25.aRsByteBuffer.writeShort(client.anInt8756 * -1582286463, -907115672);
					class572_sub25.aRsByteBuffer.writeShort(i_7_ + class497.localY * 417324155, -1123219303);
					class572_sub25.aRsByteBuffer.writeShort128(i_9_, -16711936);
					client.aClass195_8589.method2929(class572_sub25, (byte) -114);
					Class616.method7377(i_6_, i_7_, -2144987733);
				}
				if (23 == i_8_) {
					if (client.rights * -1550439133 > 0 && Class249.method3427(-1869472733))
						Class21.method703((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), (i_6_ + -2109597897 * class497.localX), (417324155 * class497.localY + i_7_), -725339348);
					else {
						Class572_Sub25 class572_sub25 = IncomingPacket.method4108(i_6_, i_7_, i_9_, 949370715);
						if (i_9_ == 1) {
							class572_sub25.aRsByteBuffer.writeByte(-1, -1384395473);
							class572_sub25.aRsByteBuffer.writeByte(-1, -1384395473);
							class572_sub25.aRsByteBuffer.writeShort((int) client.aFloat8678, -1799517015);
							class572_sub25.aRsByteBuffer.writeByte(57, -1384395473);
							class572_sub25.aRsByteBuffer.writeByte(-777638353 * client.anInt8766, -1384395473);
							class572_sub25.aRsByteBuffer.writeByte(client.anInt8670 * -1034566343, -1384395473);
							class572_sub25.aRsByteBuffer.writeByte(89, -1384395473);
							Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
							class572_sub25.aRsByteBuffer.writeShort((int) class240.aFloat2653, -1996410245);
							class572_sub25.aRsByteBuffer.writeShort((int) class240.aFloat2657, -976405350);
							class572_sub25.aRsByteBuffer.writeByte(63, -1384395473);
						} else {
							client.anInt8706 = 253386063 * i;
							client.anInt8707 = i_4_ * 272032225;
							client.anInt8606 = -1287876215;
							client.anInt8803 = 0;
						}
						client.aClass195_8589.method2929(class572_sub25, (byte) -6);
						Class616.method7377(i_6_, i_7_, -1149188365);
					}
				}
				OutgoingPacket class312_10_ = null;
				if (44 == i_8_)
					class312_10_ = OutgoingPacket.aClass312_3673;
				else if (i_8_ == 45)
					class312_10_ = OutgoingPacket.aClass312_3756;
				else if (46 == i_8_)
					class312_10_ = OutgoingPacket.aClass312_3772;
				else if (47 == i_8_)
					class312_10_ = OutgoingPacket.aClass312_3776;
				else if (48 == i_8_)
					class312_10_ = OutgoingPacket.aClass312_3725;
				else if (i_8_ == 49)
					class312_10_ = OutgoingPacket.aClass312_3677;
				else if (50 == i_8_)
					class312_10_ = OutgoingPacket.aClass312_3767;
				else if (i_8_ == 51)
					class312_10_ = OutgoingPacket.aClass312_3785;
				else if (i_8_ == 52)
					class312_10_ = OutgoingPacket.aClass312_3694;
				else if (53 == i_8_)
					class312_10_ = OutgoingPacket.aClass312_3688;
				if (class312_10_ != null) {
					Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_9_];
					if (null != class456_sub1_sub2_sub3_sub2) {
						client.anInt8706 = i * 253386063;
						client.anInt8707 = i_4_ * 272032225;
						client.anInt8606 = 1719214866;
						client.anInt8803 = 0;
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(class312_10_, (client.aClass195_8589.aClass650_2340), 124402736);
						class572_sub25.aRsByteBuffer.writeByte128(Class445.method5339(-321970595) ? 1 : 0, 759617766);
						class572_sub25.aRsByteBuffer.writeShort128(i_9_, -16711936);
						client.aClass195_8589.method2929(class572_sub25, (byte) -59);
						Class616.method7377((class456_sub1_sub2_sub3_sub2.screenX[0]), (class456_sub1_sub2_sub3_sub2.screenY[0]), -2096607573);
					}
				}
				OutgoingPacket class312_11_ = null;
				if (9 == i_8_)
					class312_11_ = OutgoingPacket.aClass312_3760;
				else if (i_8_ == 10)
					class312_11_ = OutgoingPacket.aClass312_3702;
				else if (11 == i_8_)
					class312_11_ = OutgoingPacket.aClass312_3703;
				else if (12 == i_8_)
					class312_11_ = OutgoingPacket.aClass312_3787;
				else if (13 == i_8_)
					class312_11_ = OutgoingPacket.aClass312_3671;
				else if (i_8_ == 1003)
					class312_11_ = OutgoingPacket.aClass312_3683;
				if (class312_11_ != null) {
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_9_));
					if (null != class572_sub9) {
						NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
						client.anInt8706 = 253386063 * i;
						client.anInt8707 = i_4_ * 272032225;
						client.anInt8606 = 1719214866;
						client.anInt8803 = 0;
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(class312_11_, (client.aClass195_8589.aClass650_2340), -923633357);
						class572_sub25.aRsByteBuffer.writeByteC(Class445.method5339(-1944836885) ? 1 : 0, (byte) -8);
						class572_sub25.aRsByteBuffer.writeShort128(i_9_, -16711936);
						client.aClass195_8589.method2929(class572_sub25, (byte) -28);
						Class616.method7377((class456_sub1_sub2_sub3_sub1.screenX[0]), (class456_sub1_sub2_sub3_sub1.screenY[0]), -1416428986);
					}
				}
				OutgoingPacket class312_12_ = null;
				if (3 == i_8_)
					class312_12_ = OutgoingPacket.aClass312_3761;
				else if (4 == i_8_)
					class312_12_ = OutgoingPacket.aClass312_3774;
				else if (i_8_ == 5)
					class312_12_ = OutgoingPacket.aClass312_3764;
				else if (6 == i_8_)
					class312_12_ = OutgoingPacket.aClass312_3711;
				else if (i_8_ == 1001)
					class312_12_ = OutgoingPacket.aClass312_3687;
				else if (1002 == i_8_)
					class312_12_ = OutgoingPacket.aClass312_3721;
				if (null != class312_12_) {
					client.anInt8706 = i * 253386063;
					client.anInt8707 = 272032225 * i_4_;
					client.anInt8606 = 1719214866;
					client.anInt8803 = 0;
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(class312_12_, (client.aClass195_8589.aClass650_2340), -919201793);
					class572_sub25.aRsByteBuffer.writeShort(417324155 * class497.localY + i_7_, -1517415760);
					class572_sub25.aRsByteBuffer.writeIntLE((int) (l >>> 32) & 0x7fffffff, (byte) 125);
					class572_sub25.aRsByteBuffer.write128Byte(Class445.method5339(788595660) ? 1 : 0, (byte) -126);
					class572_sub25.aRsByteBuffer.writeShort128(-2109597897 * class497.localX + i_6_, -16711936);
					client.aClass195_8589.method2929(class572_sub25, (byte) -41);
					Class616.method7377(i_6_, i_7_, -632285306);
				}
				if (client.aBool8754)
					Class131.method2286(-1705608345);
				if (null != Class323.aClass73_4080 && client.anInt8710 * 1766020549 == 0)
					Class555.method6575(Class323.aClass73_4080, (short) 30819);
			}
		}
	}
}

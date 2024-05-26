package game;

/* Class613 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

public class Class613 {
	public boolean aBool7990;
	Class569 aClass569_7991;
	Class614 aClass614_7992;
	Class65 aClass65_7993;
	Class280_Sub1 aClass280_Sub1_7994;
	Class280_Sub1 aClass280_Sub1_7995;
	int anInt7996;
	Class497 aClass497_7997;
	int anInt7998;
	int anInt7999;
	int anInt8000;
	Class497 aClass497_8001 = new Class497();
	Class523 aClass523_8002;
	byte[][][] aByteArrayArrayArray8003;
	Class274 aClass274_8004;
	int anInt8005;
	int anInt8006;
	Class572_Sub12_Sub5 aClass572_Sub12_Sub5_8007;
	Class548 aClass548_8008;
	int anInt8009;
	float aFloat8010;
	Class639_Sub16 aClass639_Sub16_8011;
	int[][] anIntArrayArray8012;
	int[][] anIntArrayArray8013;
	int[][][] anIntArrayArrayArray8014;
	int[] anIntArray8015;
	int anInt8016;
	int anInt8017;
	int[] anIntArray8018;
	int anInt8019;
	boolean aBool8020;
	int anInt8021;
	int anInt8022;
	Class569 aClass569_8023;
	byte[][] aByteArrayArray8024;
	byte[][] aByteArrayArray8025;
	Class501 aClass501_8026;
	byte[][] aByteArrayArray8027;
	byte[][] aByteArrayArray8028;
	Class611 aClass611_8029;
	byte[][] aByteArrayArray8030;
	public long aLong8031;
	HashMap aHashMap8032;
	public static byte[][] aByteArrayArray8033;

	void method7277(int i) {
		((Class613) this).aClass569_8023 = ((Class613) this).aClass569_7991;
		method7345(Class65.aClass65_681, 1128666979);
		for (int i_0_ = 0; i_0_ < 4; i_0_++) {
			for (int i_1_ = 0; i_1_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_1_++) {
				for (int i_2_ = 0; i_2_ < ((Class613) this).anInt8022 * -415841877 >> 3; i_2_++)
					((Class613) this).anIntArrayArrayArray8014[i_0_][i_1_][i_2_] = -1;
			}
		}
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(1163032376)) {
			int i_3_ = class572_sub28.anInt9292 * -2076205737;
			boolean bool = (i_3_ & 0x1) == 1;
			int i_4_ = 1104080005 * class572_sub28.anInt9298 >> 3;
			int i_5_ = 1979106429 * class572_sub28.anInt9293 >> 3;
			int i_6_ = class572_sub28.anInt9299 * -1911316627;
			int i_7_ = -1017107655 * class572_sub28.anInt9291;
			int i_8_ = class572_sub28.anInt9295 * 10595425;
			int i_9_ = class572_sub28.anInt9294 * 1786583713;
			int i_10_ = class572_sub28.anInt9297 * 1004939077;
			int i_11_ = 592655707 * class572_sub28.anInt9296;
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = 1;
			int i_15_ = 1;
			if (1 == i_3_) {
				i_13_ = i_10_ - 1;
				i_14_ = -1;
			} else if (i_3_ == 2) {
				i_13_ = i_10_ - 1;
				i_12_ = i_11_ - 1;
				i_14_ = -1;
				i_15_ = -1;
			} else if (3 == i_3_) {
				i_12_ = i_11_ - 1;
				i_14_ = 1;
				i_15_ = -1;
			}
			int i_16_ = i_5_;
			while (i_16_ < i_11_ + i_5_) {
				int i_17_ = i_13_;
				int i_18_ = i_4_;
				while (i_18_ < i_4_ + i_10_) {
					if (bool)
						((Class613) this).anIntArrayArrayArray8014[i_9_][i_12_ + i_6_][i_7_ + i_17_] = ((i_16_ << 3) + ((i_18_ << 14) + (i_8_ << 24)) + (i_3_ << 1));
					else
						((Class613) this).anIntArrayArrayArray8014[i_9_][i_6_ + i_17_][i_12_ + i_7_] = (i_3_ << 1) + ((i_8_ << 24) + (i_18_ << 14) + (i_16_ << 3));
					i_18_++;
					i_17_ += i_14_;
				}
				i_16_++;
				i_12_ += i_15_;
			}
		}
		int i_19_ = -300026841 * client.anInt8577;
		((Class613) this).anIntArray8015 = new int[i_19_];
		((Class613) this).anIntArray8018 = new int[i_19_];
		((Class613) this).aByteArrayArray8024 = new byte[i_19_][];
		((Class613) this).aByteArrayArray8025 = new byte[i_19_][];
		((Class613) this).aByteArrayArray8030 = null;
		((Class613) this).aByteArrayArray8027 = new byte[i_19_][];
		((Class613) this).aByteArrayArray8028 = new byte[i_19_][];
		i_19_ = 0;
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(979405931)) {
			int i_20_ = class572_sub28.anInt9298 * 1104080005 >>> 3;
			int i_21_ = 1979106429 * class572_sub28.anInt9293 >>> 3;
			int i_22_ = i_20_ + class572_sub28.anInt9297 * 1004939077;
			if ((i_22_ & 0x7) == 0)
				i_22_--;
			i_22_ >>>= 3;
			int i_23_ = i_21_ + class572_sub28.anInt9296 * 592655707;
			if (0 == (i_23_ & 0x7))
				i_23_--;
			i_23_ >>>= 3;
			for (int i_24_ = i_20_ >>> 3; i_24_ <= i_22_; i_24_++) {
				while_11_: for (int i_25_ = i_21_ >>> 3; i_25_ <= i_23_; i_25_++) {
					int i_26_ = i_24_ << 8 | i_25_;
					for (int i_27_ = 0; i_27_ < i_19_; i_27_++) {
						if (i_26_ == ((Class613) this).anIntArray8015[i_27_])
							continue while_11_;
					}
					if (Class630.aClass248_8114.method3365(method7286(i_24_, i_25_, (byte) -88), Class269.aClass269_2854.anInt2856 * -609065221, 2052038998)) {
						((Class613) this).anIntArray8015[i_19_] = i_26_;
						((Class613) this).anIntArray8018[i_19_] = method7286(i_24_, i_25_, (byte) -53);
						i_19_++;
					}
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i_19_;
		method7322(1493989933 * ((Class613) this).anInt8000 >> 4, ((Class613) this).anInt8022 * -415841877 >> 4, 18, false, (short) -589);
	}

	public int method7278(int i) {
		return ((Class613) this).anInt8022 * -415841877;
	}

	public int method7279(int i) {
		return 100 - (-474907244 * ((Class613) this).anInt8016 / (((Class613) this).anInt8017 * -1606330877));
	}

	public Class497 method7280(byte i) {
		return ((Class613) this).aClass497_8001;
	}

	public Class548 method7281(int i) {
		return ((Class613) this).aClass548_8008;
	}

	public int method7282(byte i) {
		return 100 - (299841668 * ((Class613) this).anInt8019 / (1408604005 * ((Class613) this).anInt8009));
	}

	public float method7283(int i) {
		return ((Class613) this).aFloat8010;
	}

	public int method7284(int i) {
		return 553289181 * ((Class613) this).anInt8005;
	}

	public Class523 method7285(int i) {
		return ((Class613) this).aClass523_8002;
	}

	int method7286(int i, int i_28_, byte i_29_) {
		return i | i_28_ << 7;
	}

	public Class274 method7287(byte i) {
		return ((Class613) this).aClass274_8004;
	}

	public Class639_Sub16 method7288(int i) {
		return ((Class613) this).aClass639_Sub16_8011;
	}

	public Class611 method7289(int i) {
		return ((Class613) this).aClass611_8029;
	}

	public int[][] method7290(int i) {
		return ((Class613) this).anIntArrayArray8013;
	}

	void method7291() {
		int i = ((Class613) this).aByteArrayArray8030.length;
		for (int i_30_ = 0; i_30_ < i; i_30_++) {
			if (null != ((Class613) this).aByteArrayArray8030[i_30_]) {
				int i_31_ = -1;
				for (int i_32_ = 0; i_32_ < 1387212887 * client.anInt8850; i_32_++) {
					if (((Class613) this).anIntArray8015[i_30_] == client.anIntArray8575[i_32_]) {
						i_31_ = i_32_;
						break;
					}
				}
				if (-1 == i_31_) {
					client.anIntArray8575[client.anInt8850 * 1387212887] = ((Class613) this).anIntArray8015[i_30_];
					i_31_ = (client.anInt8850 += -2048083097) * 1387212887 - 1;
				}
				RSByteBuffer class572_sub15 = new RSByteBuffer(((Class613) this).aByteArrayArray8030[i_30_]);
				int i_33_ = 0;
				while ((-1585139053 * class572_sub15.o < ((Class613) this).aByteArrayArray8030[i_30_].length) && i_33_ < 511 && 765313669 * client.anInt8625 < 1023) {
					int i_34_ = i_31_ | i_33_++ << 6;
					int i_35_ = class572_sub15.readUnsignedShort(647518597);
					int i_36_ = i_35_ >> 14;
					int i_37_ = i_35_ >> 7 & 0x3f;
					int i_38_ = i_35_ & 0x3f;
					int i_39_ = (64 * (((Class613) this).anIntArray8015[i_30_] >> 8) - (((Class613) this).aClass497_8001.localX * -2109597897) + i_37_);
					int i_40_ = (i_38_ + (64 * (((Class613) this).anIntArray8015[i_30_] & 0xff) - (((Class613) this).aClass497_8001.localY * 417324155)));
					NPCDefintion class410 = (NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(class572_sub15.readUnsignedShort(647518597), 816828651));
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_34_));
					if (null == class572_sub9 && (class410.aByte4836 & 0x1) > 0 && i_39_ >= 0 && (i_39_ + 358769667 * class410.anInt4792 < 1493989933 * ((Class613) this).anInt8000) && i_40_ >= 0 && (358769667 * class410.anInt4792 + i_40_ < -415841877 * ((Class613) this).anInt8022)) {
						NPC class456_sub1_sub2_sub3_sub1 = (new NPC(((Class613) this).aClass523_8002));
						class456_sub1_sub2_sub3_sub1.anInt11633 = i_34_ * 2118180903;
						LinkableObject class572_sub9_41_ = new LinkableObject(class456_sub1_sub2_sub3_sub1);
						client.aClass676_8622.put(class572_sub9_41_, (long) i_34_);
						client.aClass572_Sub9Array8623[(client.anInt8624 += -123495603) * 617551237 - 1] = class572_sub9_41_;
						client.anIntArray8626[(client.anInt8625 += 1417012813) * 765313669 - 1] = i_34_;
						class456_sub1_sub2_sub3_sub1.anInt11649 = 1226228503 * client.cycles;
						class456_sub1_sub2_sub3_sub1.method10680(class410, (byte) -52);
						class456_sub1_sub2_sub3_sub1.method10525((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667, (byte) 10);
						class456_sub1_sub2_sub3_sub1.anInt11653 = (-1233753521 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4823) << 3) * -631722783;
						class456_sub1_sub2_sub3_sub1.method10516((class456_sub1_sub2_sub3_sub1.aClass410_11803.aClass661_4846.method7778((byte) -45).getId(-173920318) << 11 & 0x3fff), true, 648650492);
						class456_sub1_sub2_sub3_sub1.method10686(i_36_, i_39_, i_40_, true, class456_sub1_sub2_sub3_sub1.method10556((short) -3029), -785457560);
					}
				}
			}
		}
	}

	public int method7292() {
		return ((Class613) this).anInt8006 * 1686352907;
	}

	public Class280_Sub1 method7293(int i) {
		return ((Class613) this).aClass280_Sub1_7995;
	}

	public void method7294(Class639_Sub16 class639_sub16, byte i) {
		((Class613) this).aClass639_Sub16_8011 = class639_sub16;
	}

	public void method7295(byte i) {
		((Class613) this).aClass497_8001 = new Class497();
		((Class613) this).anInt7999 = 0;
		((Class613) this).anInt7996 = 0;
	}

	public void method7296(int i) {
		if (null != ((Class613) this).aClass523_8002) {
			Class557.method6589((byte) 41);
			((Class613) this).aHashMap8032 = ((Class613) this).aClass523_8002.method6267(-630942398);
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	public void method7297(byte i) {
		((Class613) this).aClass614_7992 = Class614.aClass614_8034;
		((Class613) this).anInt8016 = 0;
		((Class613) this).anInt8017 = 1968604331;
		((Class613) this).anInt8019 = 0;
		((Class613) this).anInt8009 = -1683701139;
		((Class613) this).anInt8021 = 0;
	}

	public void method7298(boolean bool, int i) {
		HashTable class466 = null;
		if (((Class613) this).aClass501_8026 != null && bool)
			class466 = ((Class613) this).aClass501_8026.method5956(-1525011322);
		((Class613) this).aClass501_8026 = new Class501(Class272_Sub2.aClass106_9517, Class582.aClass248_7725, 1493989933 * ((Class613) this).anInt8000 >> 3, ((Class613) this).anInt8022 * -415841877 >> 3);
		if (null != class466)
			((Class613) this).aClass501_8026.method5955(this, class466, 0, 1715361497);
	}

	public void method7299(int i) {
		((Class613) this).aClass501_8026.method5955(this, null, 0, 1490693139);
	}

	public void method7300(int i) {
		((Class613) this).anInt8005 = -1365529752;
		if (0 == ((Class613) this).anInt8000 * 1493989933)
			((Class613) this).anInt8006 = 1736012746;
		else
			((Class613) this).anInt8006 = 1092761507 * (int) ((double) (1493989933 * ((Class613) this).anInt8000) * 34.46);
		((Class613) this).anInt8006 = (1686352907 * ((Class613) this).anInt8006 << 2) * 1092761507;
		if (Class272_Sub2.aClass106_9517.method1679())
			((Class613) this).anInt8006 += 1148143104;
	}

	void method7301(Class613 class613_42_, byte i) {
		boolean bool = ((Class613) class613_42_).aBool8020;
		((Class613) class613_42_).aBool8020 = ((Class613) this).aBool8020;
		((Class613) this).aBool8020 = bool;
		Class569 class569 = ((Class613) class613_42_).aClass569_8023;
		((Class613) class613_42_).aClass569_8023 = ((Class613) this).aClass569_8023;
		((Class613) this).aClass569_8023 = class569;
		((Class613) class613_42_).aClass497_7997 = ((Class613) this).aClass497_8001;
		((Class613) this).aClass497_7997 = ((Class613) class613_42_).aClass497_8001;
		((Class613) this).aClass501_8026.method5984(class613_42_.method7306(-1042067865), 1887098353);
	}

	public void method7302(int i) {
		if (((Class613) this).aBool8020) {
			method7297((byte) 0);
			Class613 class613_43_ = client.aClass613_8605;
			((Class613) this).anInt7998 = 1 * ((Class613) class613_43_).anInt7998;
			((Class613) this).anIntArray8015 = ((Class613) class613_43_).anIntArray8015;
			((Class613) this).anIntArray8018 = ((Class613) class613_43_).anIntArray8018;
			((Class613) this).aByteArrayArray8024 = ((Class613) class613_43_).aByteArrayArray8024;
			((Class613) this).aByteArrayArray8025 = ((Class613) class613_43_).aByteArrayArray8025;
			((Class613) this).aByteArrayArray8030 = ((Class613) class613_43_).aByteArrayArray8030;
			((Class613) this).aByteArrayArray8027 = ((Class613) class613_43_).aByteArrayArray8027;
			((Class613) this).aByteArrayArray8028 = ((Class613) class613_43_).aByteArrayArray8028;
			((Class613) this).aClass274_8004 = ((Class613) class613_43_).aClass274_8004;
			((Class613) this).aClass501_8026 = ((Class613) class613_43_).aClass501_8026;
			((Class613) this).anIntArrayArrayArray8014 = ((Class613) class613_43_).anIntArrayArrayArray8014;
			((Class613) this).anInt8005 = 1 * ((Class613) class613_43_).anInt8005;
			((Class613) this).anInt8006 = 1 * ((Class613) class613_43_).anInt8006;
			((Class613) this).aClass572_Sub12_Sub5_8007 = ((Class613) class613_43_).aClass572_Sub12_Sub5_8007;
			((Class613) this).aClass548_8008 = ((Class613) class613_43_).aClass548_8008;
			((Class613) this).anIntArrayArray8012 = ((Class613) class613_43_).anIntArrayArray8012;
			((Class613) this).anIntArrayArray8013 = ((Class613) class613_43_).anIntArrayArray8013;
			((Class613) this).aByteArrayArrayArray8003 = ((Class613) class613_43_).aByteArrayArrayArray8003;
			((Class613) this).aClass569_7991 = ((Class613) class613_43_).aClass569_7991;
			((Class613) this).aClass65_7993 = ((Class613) class613_43_).aClass65_7993;
			((Class613) this).aClass497_8001 = ((Class613) class613_43_).aClass497_8001;
			((Class613) this).aClass497_7997 = ((Class613) class613_43_).aClass497_7997;
			((Class613) this).anInt7996 = ((Class613) class613_43_).anInt7996 * 1;
			((Class613) this).anInt7999 = 1 * ((Class613) class613_43_).anInt7999;
			((Class613) this).anInt8000 = ((Class613) class613_43_).anInt8000 * 1;
			((Class613) this).anInt8022 = ((Class613) class613_43_).anInt8022 * 1;
		} else if (12 == client.anInt8580 * 835742603)
			Class463.method5478(9, -1799582933);
		else if (client.anInt8580 * 835742603 == 5)
			Class463.method5478(7, -748127753);
		else if (client.anInt8580 * 835742603 == 11)
			Class463.method5478(3, -626392049);
		else if (835742603 * client.anInt8580 == 1)
			Class463.method5478(18, 1474700666);
		else if (client.anInt8580 * 835742603 == 6)
			Class463.method5478(10, -699052319);
	}

	void method7303(byte i) {
		method7345(Class272_Sub5.method8883(Class213.aClass572_Sub24_2463.aClass665_Sub29_9212.method9121(-1245023927), 2025579843), -309104753);
		int i_44_ = -2109597897 * ((Class613) this).aClass497_8001.localX;
		int i_45_ = 417324155 * ((Class613) this).aClass497_8001.localY;
		int i_46_ = (i_44_ >> 3) + (Class36.anInt387 * 386814715 >> 12);
		int i_47_ = (Class49.anInt490 * -999214779 >> 12) + (i_45_ >> 3);
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009 = (byte) 0;
		Class274.anInt2911 = 0;
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10699(8, 8, (byte) 110);
		int i_48_ = 18;
		((Class613) this).anIntArray8015 = new int[i_48_];
		((Class613) this).anIntArray8018 = new int[i_48_];
		((Class613) this).aByteArrayArray8024 = new byte[i_48_][];
		((Class613) this).aByteArrayArray8025 = new byte[i_48_][];
		((Class613) this).aByteArrayArray8030 = new byte[i_48_][];
		((Class613) this).aByteArrayArray8027 = new byte[i_48_][];
		((Class613) this).aByteArrayArray8028 = new byte[i_48_][];
		i_48_ = 0;
		for (int i_49_ = (i_46_ - (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_49_ <= (i_46_ + (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_49_++) {
			for (int i_50_ = (i_47_ - (((Class613) this).anInt8022 * -415841877 >> 4)) / 8; i_50_ <= ((((Class613) this).anInt8022 * -415841877 >> 4) + i_47_) / 8; i_50_++) {
				int i_51_ = (i_49_ << 8) + i_50_;
				if (Class630.aClass248_8114.method3365(method7286(i_49_, i_50_, (byte) -66), Class269.aClass269_2854.anInt2856 * -609065221, 1237167570)) {
					((Class613) this).anIntArray8015[i_48_] = i_51_;
					((Class613) this).anIntArray8018[i_48_] = method7286(i_49_, i_50_, (byte) -27);
					i_48_++;
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i_48_;
		int i_52_;
		if (12 == client.anInt8580 * 835742603)
			i_52_ = 9;
		else if (11 == client.anInt8580 * 835742603)
			i_52_ = 3;
		else if (client.anInt8580 * 835742603 == 5)
			i_52_ = 7;
		else if (6 == client.anInt8580 * 835742603)
			i_52_ = 10;
		else
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt8580 * 835742603).toString());
		method7322(i_46_, i_47_, i_52_, false, (short) -15642);
	}

	void sendMapScene(Class572_Sub15_Sub2 class572_sub15_sub2, byte i) {
		int i_53_ = class572_sub15_sub2.readUnsignedShort128((byte) 79);
		int i_54_ = class572_sub15_sub2.readUnsignedByteC(-1782272129);
		int i_55_ = class572_sub15_sub2.readUnsignedByteC(-1394835962);
		boolean bool = class572_sub15_sub2.readUnsignedByteC(411844224) == 1;
		int i_56_ = class572_sub15_sub2.readUnsignedShort128((byte) 28);
		if (!((Class613) this).aBool8020)
			method7308(1939349424);
		method7345(Class272_Sub5.method8883(i_54_, 1188138389), 2009769264);
		((Class613) this).anIntArray8015 = new int[i_55_];
		((Class613) this).anIntArray8018 = new int[i_55_];
		((Class613) this).aByteArrayArray8024 = new byte[i_55_][];
		((Class613) this).aByteArrayArray8025 = new byte[i_55_][];
		((Class613) this).aByteArrayArray8030 = null;
		((Class613) this).aByteArrayArray8027 = new byte[i_55_][];
		((Class613) this).aByteArrayArray8028 = new byte[i_55_][];
		i_55_ = 0;
		for (int i_57_ = (i_56_ - (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_57_ <= ((((Class613) this).anInt8000 * 1493989933 >> 4) + i_56_) / 8; i_57_++) {
			for (int i_58_ = (i_53_ - (((Class613) this).anInt8022 * -415841877 >> 4)) / 8; i_58_ <= (i_53_ + (-415841877 * ((Class613) this).anInt8022 >> 4)) / 8; i_58_++) {
				if (Class630.aClass248_8114.method3365(method7286(i_57_, i_58_, (byte) -24), Class269.aClass269_2854.anInt2856 * -609065221, -1668056988)) {
					((Class613) this).anIntArray8015[i_55_] = i_58_ + (i_57_ << 8);
					((Class613) this).anIntArray8018[i_55_] = method7286(i_57_, i_58_, (byte) -50);
					i_55_++;
				}
			}
		}
		((Class613) this).anInt7998 = i_55_ * -47847863;
		method7322(i_56_, i_53_, 18, bool, (short) -8229);
	}

	void sendDynamicMap(Class572_Sub15_Sub2 class572_sub15_sub2, int i) {
		int chunkY = class572_sub15_sub2.readUnsignedShort(647518597);
		int mapSize = class572_sub15_sub2.readUnsigned128Byte((byte) 26);
		int chunkX = class572_sub15_sub2.readUnsignedShortLE128((byte) 112);
		int forceRefreshMask = class572_sub15_sub2.readUnsignedByte128(-1842499997);
		boolean forceRefresh = (forceRefreshMask & 0x1) != 0;
		int i_63_ = class572_sub15_sub2.readUnsignedByte(1534413661);
		if (1 == i_63_)
			((Class613) this).aClass569_7991 = Class569.aClass569_6396;
		else if (2 == i_63_)
			((Class613) this).aClass569_7991 = Class569.aClass569_6393;
		else if (3 == i_63_)
			((Class613) this).aClass569_7991 = Class569.aClass569_6395;
		else if (i_63_ == 4)
			((Class613) this).aClass569_7991 = Class569.aClass569_6390;
		if (!((Class613) this).aBool8020)
			method7308(1840264787);
		method7345(Class272_Sub5.method8883(mapSize, 1437017477), -15689892);
		class572_sub15_sub2.method10397(-860683894);
		for (int i_64_ = 0; i_64_ < 4; i_64_++) {
			for (int i_65_ = 0; i_65_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_65_++) {
				for (int i_66_ = 0; i_66_ < -415841877 * ((Class613) this).anInt8022 >> 3; i_66_++) {
					int i_67_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (i_67_ == 1)
						((Class613) this).anIntArrayArrayArray8014[i_64_][i_65_][i_66_] = class572_sub15_sub2.readBits(26, -1809904620);
					else
						((Class613) this).anIntArrayArrayArray8014[i_64_][i_65_][i_66_] = -1;
				}
			}
		}
		class572_sub15_sub2.method10395(-1418899355);
		int i_68_ = class572_sub15_sub2.readUnsignedByte(1848889834);
		((Class613) this).anIntArray8015 = new int[i_68_];
		((Class613) this).anIntArray8018 = new int[i_68_];
		((Class613) this).aByteArrayArray8024 = new byte[i_68_][];
		((Class613) this).aByteArrayArray8025 = new byte[i_68_][];
		((Class613) this).aByteArrayArray8030 = null;
		((Class613) this).aByteArrayArray8027 = new byte[i_68_][];
		((Class613) this).aByteArrayArray8028 = new byte[i_68_][];
		i_68_ = 0;
		for (int i_69_ = 0; i_69_ < 4; i_69_++) {
			for (int i_70_ = 0; i_70_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_70_++) {
				for (int i_71_ = 0; i_71_ < -415841877 * ((Class613) this).anInt8022 >> 3; i_71_++) {
					int i_72_ = (((Class613) this).anIntArrayArrayArray8014[i_69_][i_70_][i_71_]);
					if (i_72_ != -1) {
						int i_73_ = i_72_ >> 14 & 0x3ff;
						int i_74_ = i_72_ >> 3 & 0x7ff;
						int i_75_ = (i_73_ / 8 << 8) + i_74_ / 8;
						for (int i_76_ = 0; i_76_ < i_68_; i_76_++) {
							if (((Class613) this).anIntArray8015[i_76_] == i_75_) {
								i_75_ = -1;
								break;
							}
						}
						if (i_75_ != -1) {
							int i_77_ = i_75_ >> 8 & 0xff;
							int i_78_ = i_75_ & 0xff;
							if (Class630.aClass248_8114.method3365(method7286(i_77_, i_78_, (byte) -95), (Class269.aClass269_2854.anInt2856 * -609065221), -1945173550)) {
								((Class613) this).anIntArray8015[i_68_] = i_75_;
								((Class613) this).anIntArray8018[i_68_] = method7286(i_77_, i_78_, (byte) -87);
								i_68_++;
							}
						}
					}
				}
			}
		}
		((Class613) this).anInt7998 = i_68_ * -47847863;
		method7322(chunkX, chunkY, 18, forceRefresh, (short) -6260);
	}

	public Class501 method7306(int i) {
		return ((Class613) this).aClass501_8026;
	}

	public byte[][] method7307(int i, int i_79_) {
		if (((Class613) this).aClass280_Sub1_7995 != null && (((Class613) this).aClass280_Sub1_7995.aByteArrayArrayArray3142 != null) && (((Class613) this).aClass280_Sub1_7995.aByteArrayArrayArray3142[i]) != null)
			return (((Class613) this).aClass280_Sub1_7995.aByteArrayArrayArray3142[i]);
		return null;
	}

	void method7308(int i) {
		if (Class569.aClass569_6394 != ((Class613) this).aClass569_7991 && ((Class613) this).aClass569_8023 != Class569.aClass569_6394) {
			if (((Class613) this).aClass569_7991 == Class569.aClass569_6396 || Class569.aClass569_6395 == ((Class613) this).aClass569_7991 || ((((Class613) this).aClass569_7991 != ((Class613) this).aClass569_8023) && ((Class569.aClass569_6391 == ((Class613) this).aClass569_7991) || (((Class613) this).aClass569_8023 == Class569.aClass569_6391)))) {
				Iterator iterator = client.aClass676_8622.iterator();
				while (iterator.hasNext()) {
					LinkableObject class572_sub9 = (LinkableObject) iterator.next();
					Class259.method3561(((NPC) class572_sub9.anObject9081), -697323678);
				}
				client.anInt8625 = 0;
				client.anInt8624 = 0;
				client.aClass676_8622.method7964((byte) 116);
			}
			((Class613) this).aClass569_8023 = ((Class613) this).aClass569_7991;
		}
	}

	void method7309(Class280_Sub1 class280_sub1, byte[][] is, int i) {
		for (int i_80_ = 0; i_80_ < 1171188729 * ((Class613) this).anInt7998; i_80_++) {
			byte[] is_81_ = is[i_80_];
			if (null != is_81_) {
				int i_82_ = ((((Class613) this).anIntArray8015[i_80_] >> 8) * 64 - (-2109597897 * ((Class613) this).aClass497_8001.localX));
				int i_83_ = (64 * (((Class613) this).anIntArray8015[i_80_] & 0xff) - (((Class613) this).aClass497_8001.localY * 417324155));
				if (!((Class613) this).aBool8020)
					Class344.audio.method920((short) -16820);
				class280_sub1.method8809(Class272_Sub2.aClass106_9517, is_81_, i_82_, i_83_, -534210760);
				if (((Class613) this).aBool8020)
					method7312(10, 1532899623);
			}
		}
	}

	void method7310(int i) {
		((Class613) this).aClass280_Sub1_7994 = null;
		((Class613) this).aClass280_Sub1_7995 = null;
		if (null != ((Class613) this).aClass274_8004)
			((Class613) this).aClass274_8004.method3681(-2033255464);
		if (null != ((Class613) this).aClass501_8026)
			((Class613) this).aClass501_8026.method5964(-414239420);
		if (null != ((Class613) this).aClass523_8002) {
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	public boolean method7311(int i) {
		if (!((Class613) this).aBool8020)
			Class378.method4626(false, -1001018997);
		((Class613) this).anInt8016 = 0;
		for (int i_84_ = 0; i_84_ < ((Class613) this).anInt7998 * 1171188729; i_84_++) {
			if (!Class630.aClass248_8114.method3370((((Class613) this).anIntArray8018[i_84_]), 2046676894))
				((Class613) this).anInt8016 += 365835429;
		}
		if (null == ((Class613) this).aClass548_8008) {
			if (((Class613) this).aClass572_Sub12_Sub5_8007 != null && (Class623.idx41.method3381(((Class613) this).aClass572_Sub12_Sub5_8007.mapName, 2054720917))) {
				if (!Class623.idx41.method3387(((Class613) this).aClass572_Sub12_Sub5_8007.mapName, (byte) -109))
					((Class613) this).anInt8016 += 365835429;
				else
					((Class613) this).aClass548_8008 = Class13.method616(Class623.idx41, (((Class613) this).aClass572_Sub12_Sub5_8007.mapName), client.aBool8731, (byte) -67);
			} else
				((Class613) this).aClass548_8008 = new Class548(0);
		}
		if (((Class613) this).anInt8016 * 596546349 > 0) {
			if (((Class613) this).anInt8017 * -1606330877 < ((Class613) this).anInt8016 * 596546349)
				((Class613) this).anInt8017 = ((Class613) this).anInt8016 * 1178436367;
			((Class613) this).aClass614_7992 = Class614.aClass614_8035;
			return false;
		}
		for (int i_85_ = 0; i_85_ < 1171188729 * ((Class613) this).anInt7998; i_85_++) {
			if (null == ((Class613) this).aByteArrayArray8024[i_85_])
				((Class613) this).aByteArrayArray8024[i_85_] = (Class630.aClass248_8114.getFile(((Class613) this).anIntArray8018[i_85_], Class269.aClass269_2854.anInt2856 * -609065221, 609671521));
			if (((Class613) this).aByteArrayArray8025[i_85_] == null)
				((Class613) this).aByteArrayArray8025[i_85_] = (Class630.aClass248_8114.getFile(((Class613) this).anIntArray8018[i_85_], Class269.aClass269_2859.anInt2856 * -609065221, 636070608));
			if (null == ((Class613) this).aByteArrayArray8027[i_85_])
				((Class613) this).aByteArrayArray8027[i_85_] = (Class630.aClass248_8114.getFile(((Class613) this).anIntArray8018[i_85_], -609065221 * Class269.aClass269_2855.anInt2856, -2065115871));
			if (((Class613) this).aByteArrayArray8028[i_85_] == null)
				((Class613) this).aByteArrayArray8028[i_85_] = (Class630.aClass248_8114.getFile(((Class613) this).anIntArray8018[i_85_], -609065221 * Class269.aClass269_2852.anInt2856, 273177163));
			if (((Class613) this).aByteArrayArray8030 != null && ((Class613) this).aByteArrayArray8030[i_85_] == null)
				((Class613) this).aByteArrayArray8030[i_85_] = (Class630.aClass248_8114.getFile(((Class613) this).anIntArray8018[i_85_], Class269.aClass269_2851.anInt2856 * -609065221, -1585284587));
		}
		int i_86_ = -1414340791 * ((Class613) this).anInt8019;
		Class463 class463 = new Class463(-1);
		Class463 class463_87_ = new Class463(-1);
		((Class613) this).anInt8019 = 0;
		for (int i_88_ = 0; i_88_ < ((Class613) this).anInt7998 * 1171188729; i_88_++) {
			byte[] is = ((Class613) this).aByteArrayArray8025[i_88_];
			if (null != is) {
				int i_89_ = (64 * (((Class613) this).anIntArray8015[i_88_] >> 8) - (((Class613) this).aClass497_8001.localX * -2109597897));
				int i_90_ = ((((Class613) this).anIntArray8015[i_88_] & 0xff) * 64 - (((Class613) this).aClass497_8001.localY * 417324155));
				if (((Class613) this).aClass569_7991.method6755(-1323548566)) {
					i_89_ = 10;
					i_90_ = 10;
				}
				int i_91_ = (Class282.method3818(((Class613) this).aClass639_Sub16_8011, is, i_89_, i_90_, 1493989933 * ((Class613) this).anInt8000, -415841877 * ((Class613) this).anInt8022, class463_87_, class463, -1501361059));
				if (i_91_ > 0)
					((Class613) this).anInt8019 += i_91_ * 835994361;
			}
			is = ((Class613) this).aByteArrayArray8028[i_88_];
			if (null != is) {
				int i_92_ = (64 * (((Class613) this).anIntArray8015[i_88_] >> 8) - (((Class613) this).aClass497_8001.localX * -2109597897));
				int i_93_ = ((((Class613) this).anIntArray8015[i_88_] & 0xff) * 64 - (((Class613) this).aClass497_8001.localY * 417324155));
				if (((Class613) this).aClass569_7991.method6755(-555970736)) {
					i_92_ = 10;
					i_93_ = 10;
				}
				int i_94_ = (Class282.method3818(((Class613) this).aClass639_Sub16_8011, is, i_92_, i_93_, ((Class613) this).anInt8000 * 1493989933, ((Class613) this).anInt8022 * -415841877, class463_87_, class463, -215490937));
				if (i_94_ > 0)
					((Class613) this).anInt8019 += 835994361 * i_94_;
			}
		}
		if (-1414340791 * ((Class613) this).anInt8019 > 0) {
			if (i_86_ == -1414340791 * ((Class613) this).anInt8019) {
				if (((Class613) this).anInt8021 * -153065001 != 0 && (client.cycles - -153065001 * ((Class613) this).anInt8021) == 1000) {
					Class625.method7454(class463_87_.anInt5233 * 1629104091, 1629104091 * class463.anInt5233, (((Class613) this).anInt8019 * -1414340791), (byte) -13);
					Class382.method4650(-2049999768);
				}
			} else
				((Class613) this).anInt8021 = client.cycles * 601463271;
			if (((Class613) this).anInt8009 * 1408604005 < ((Class613) this).anInt8019 * -1414340791)
				((Class613) this).anInt8009 = -433953771 * ((Class613) this).anInt8019;
			((Class613) this).aClass614_7992 = Class614.aClass614_8036;
			return false;
		}
		if (!((Class613) this).aBool8020 && Class614.aClass614_8034 != ((Class613) this).aClass614_7992)
			Class677.method7987(new StringBuilder().append(Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)).append(Class3.aString25).append("(100%)").toString(), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 1008160972);
		((Class613) this).aClass614_7992 = Class614.aClass614_8037;
		if (!((Class613) this).aBool8020 && Class344.audio != null)
			Class344.audio.method920((short) 15653);
		if (!((Class613) this).aBool8020) {
			for (int i_95_ = 0; i_95_ < 2048; i_95_++) {
				Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_95_];
				if (null != class456_sub1_sub2_sub3_sub2)
					class456_sub1_sub2_sub3_sub2.aClass523_9010 = null;
			}
			for (int i_96_ = 0; i_96_ < client.aClass572_Sub9Array8623.length; i_96_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_96_];
				if (class572_sub9 != null)
					((Class456_Sub1) class572_sub9.anObject9081).aClass523_9010 = null;
			}
		}
		if (!((Class613) this).aBool8020)
			Class556.method6587(true, -1538947929);
		boolean bool = false;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9183(-1766763163) == 2) {
			for (int i_97_ = 0; i_97_ < ((Class613) this).anInt7998 * 1171188729; i_97_++) {
				if (null != ((Class613) this).aByteArrayArray8028[i_97_] || null != ((Class613) this).aByteArrayArray8027[i_97_]) {
					bool = true;
					break;
				}
			}
		}
		int i_98_ = (Class405.method4854(Class213.aClass572_Sub24_2463.aClass665_Sub27_9214.method9100(2142022900), (byte) 29).anInt4939 * 1818793048);
		if (Class272_Sub2.aClass106_9517.method1679())
			i_98_++;
		method7300(180940374);
		method7310(1859949593);
		((Class613) this).aClass523_8002 = new Class523(Class272_Sub2.aClass106_9517, 9, 4, ((Class613) this).anInt8000 * 1493989933, ((Class613) this).anInt8022 * -415841877, i_98_, bool, Class272_Sub2.aClass106_9517.method1849() > 0);
		((Class613) this).aClass523_8002.method6266(false, 1947680739);
		((Class613) this).aClass523_8002.method6223(2103493263 * client.anInt8600, -1070119466);
		((Class613) this).aClass523_8002.method6287(((Class613) this).aHashMap8032, 1374487280);
		if (client.anInt8600 * 2103493263 != 0)
			((Class613) this).aClass523_8002.method6224(Class298.aClass102_3481, (short) 255);
		else
			((Class613) this).aClass523_8002.method6224(null, (short) 255);
		((Class613) this).aClass611_8029 = new Class611();
		((Class613) this).aFloat8010 = -0.05F + (float) (Math.random() / 10.0);
		((Class613) this).aClass280_Sub1_7995 = new Class280_Sub1(((Class613) this).aClass523_8002, ((Class613) this).aClass639_Sub16_8011, 4, ((Class613) this).anInt8000 * 1493989933, ((Class613) this).anInt8022 * -415841877, false, ((Class613) this).aClass274_8004, ((Class613) this).aClass501_8026);
		((Class613) this).aClass280_Sub1_7995.method3788((byte) 111);
		((Class613) this).aClass280_Sub1_7995.anInt3132 = Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 36) * 2064706867;
		((Class613) this).aClass280_Sub1_7995.aBool3207 = Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9183(-1766763163) == 2;
		((Class613) this).aClass280_Sub1_7995.aBool3134 = Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(-1427100506) == 1;
		((Class613) this).aClass280_Sub1_7995.aBool3135 = Class213.aClass572_Sub24_2463.aClass665_Sub23_9208.method9058((byte) 24) == 1;
		((Class613) this).aClass280_Sub1_7995.aBool3136 = Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(1966154570) == 1;
		if (!((Class613) this).aClass569_7991.method6755(-192844838))
			method7355(((Class613) this).aClass280_Sub1_7995, ((Class613) this).aByteArrayArray8024, -721613551);
		else
			method7314(((Class613) this).aClass280_Sub1_7995, ((Class613) this).aByteArrayArray8024, -981601895);
		if (((Class613) this).aBool8020)
			method7312(50, 711429221);
		((Class613) this).aClass501_8026.method5965(1493989933 * ((Class613) this).anInt8000 >> 4, -415841877 * ((Class613) this).anInt8022 >> 4, (byte) -14);
		((Class613) this).aClass501_8026.method5978(this, 1321166631);
		if (bool) {
			((Class613) this).aClass523_8002.method6266(true, 1832977184);
			((Class613) this).aClass280_Sub1_7994 = new Class280_Sub1(((Class613) this).aClass523_8002, ((Class613) this).aClass639_Sub16_8011, 1, 1493989933 * ((Class613) this).anInt8000, ((Class613) this).anInt8022 * -415841877, true, ((Class613) this).aClass274_8004, ((Class613) this).aClass501_8026);
			((Class613) this).aClass280_Sub1_7994.method3788((byte) 32);
			((Class613) this).aClass280_Sub1_7994.anInt3132 = Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 20) * 2064706867;
			((Class613) this).aClass280_Sub1_7994.aBool3207 = Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9183(-1766763163) == 2;
			((Class613) this).aClass280_Sub1_7994.aBool3134 = Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(-754149068) == 1;
			((Class613) this).aClass280_Sub1_7994.aBool3135 = Class213.aClass572_Sub24_2463.aClass665_Sub23_9208.method9058((byte) 50) == 1;
			((Class613) this).aClass280_Sub1_7994.aBool3136 = Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1250666636) == 1;
			if (!((Class613) this).aClass569_7991.method6755(109360007)) {
				method7355(((Class613) this).aClass280_Sub1_7994, ((Class613) this).aByteArrayArray8027, -721613551);
				if (!((Class613) this).aBool8020)
					Class378.method4626(true, -1001018997);
			} else {
				method7314(((Class613) this).aClass280_Sub1_7994, ((Class613) this).aByteArrayArray8027, -981601895);
				if (!((Class613) this).aBool8020)
					Class378.method4626(true, -1001018997);
			}
			((Class613) this).aClass280_Sub1_7994.method3772(0, (((Class613) this).aClass280_Sub1_7995.anIntArrayArrayArray3141[0]), 1987174050);
			((Class613) this).aClass280_Sub1_7994.method3790(Class272_Sub2.aClass106_9517, null, -366617290);
			((Class613) this).aClass523_8002.method6266(false, 2130543096);
			if (((Class613) this).aBool8020)
				method7312(50, -398086749);
		}
		((Class613) this).aClass280_Sub1_7995.method3790(Class272_Sub2.aClass106_9517, (bool ? ((Class613) this).aClass280_Sub1_7994.anIntArrayArrayArray3141 : null), 1372035727);
		if (!((Class613) this).aClass569_7991.method6755(-2030694849)) {
			if (!((Class613) this).aBool8020)
				Class378.method4626(true, -1001018997);
			method7309(((Class613) this).aClass280_Sub1_7995, ((Class613) this).aByteArrayArray8025, -1411062332);
			if (null != ((Class613) this).aByteArrayArray8030)
				method7329((byte) 42);
		} else {
			if (!((Class613) this).aBool8020)
				Class378.method4626(true, -1001018997);
			method7325(((Class613) this).aClass280_Sub1_7995, ((Class613) this).aByteArrayArray8025, 1268750233);
		}
		if (!((Class613) this).aBool8020)
			Class378.method4626(true, -1001018997);
		((Class613) this).aClass280_Sub1_7995.method3774(Class272_Sub2.aClass106_9517, (bool ? ((Class613) this).aClass523_8002.aClass174Array5840[0] : null), null, (byte) 38);
		if (((Class613) this).aBool8020)
			method7312(75, 1984529354);
		((Class613) this).aClass280_Sub1_7995.method8813(Class272_Sub2.aClass106_9517, false, (byte) 6);
		if (((Class613) this).aBool8020)
			method7312(75, 2031836529);
		if (!((Class613) this).aBool8020)
			Class378.method4626(true, -1001018997);
		if (bool) {
			((Class613) this).aClass523_8002.method6266(true, 1058037597);
			if (!((Class613) this).aBool8020)
				Class378.method4626(true, -1001018997);
			if (!((Class613) this).aClass569_7991.method6755(938151157))
				method7309(((Class613) this).aClass280_Sub1_7994, ((Class613) this).aByteArrayArray8028, -136543594);
			else
				method7325(((Class613) this).aClass280_Sub1_7994, ((Class613) this).aByteArrayArray8028, 2126199403);
			if (!((Class613) this).aBool8020)
				Class378.method4626(true, -1001018997);
			((Class613) this).aClass280_Sub1_7994.method3774(Class272_Sub2.aClass106_9517, null, ((Class613) this).aClass523_8002.aClass174Array5838[0], (byte) 6);
			((Class613) this).aClass280_Sub1_7994.method8813(Class272_Sub2.aClass106_9517, true, (byte) 6);
			if (!((Class613) this).aBool8020)
				Class378.method4626(true, -1001018997);
			((Class613) this).aClass523_8002.method6266(false, 754130689);
			if (((Class613) this).aBool8020)
				method7312(50, -667227835);
		}
		((Class613) this).aClass280_Sub1_7995.method3767(-500459087);
		if (((Class613) this).aClass280_Sub1_7994 != null)
			((Class613) this).aClass280_Sub1_7994.method3767(-1266950518);
		((Class613) this).aClass523_8002.method6225(1870287645);
		if (((Class613) this).aBool8020) {
			Class69.method1067(-1912844931);
			while (!Class272_Sub2.aClass106_9517.method1723(2135196806))
				method7312(1, -12367353);
		}
		boolean bool_99_ = false;
		if (((Class613) this).aBool8020) {
			Class613 class613_100_ = client.aClass613_8605;
			method7301(class613_100_, (byte) 86);
			Class204.aClass602_2411.method7086(class613_100_, 1633499874);
			bool_99_ = true;
			Class69.method1067(-1795115792);
			synchronized (client.anObject8694) {
				client.aBool8856 = true;
				try {
					client.anObject8694.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
			client.aClass613_8605 = this;
			class613_100_.method7310(1402562731);
			method7315(18, (byte) -3);
			method7308(2067485231);
		} else {
			Class344.audio.method920((short) -4172);
			((Class613) this).aClass501_8026.method5970(193555028);
			Class565.method6697(639423771);
		}
		for (int i_101_ = 0; i_101_ < 4; i_101_++) {
			for (int i_102_ = 0; i_102_ < ((Class613) this).anInt8000 * 1493989933; i_102_++) {
				for (int i_103_ = 0; i_103_ < -415841877 * ((Class613) this).anInt8022; i_103_++)
					Class130.method2281(i_101_, i_102_, i_103_, -1002917661);
			}
		}
		for (int i_104_ = 0; i_104_ < client.aClass575Array8594.length; i_104_++) {
			if (null != client.aClass575Array8594[i_104_])
				client.aClass575Array8594[i_104_].method6809(-2049495071);
		}
		Class286.method3869((byte) -61);
		Class572_Sub7.method8392((byte) 0);
		if (Class554.method6557(-1510249101) == Class578.aClass578_7670 && client.aClass195_8589.method2933(-1967195220) != null && client.anInt8580 * 835742603 == 18) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3742, client.aClass195_8589.aClass650_2340, -74112174);
			class572_sub25.aRsByteBuffer.writeInt(1057001181, -1743753997);
			client.aClass195_8589.method2929(class572_sub25, (byte) -63);
		}
		if (!((Class613) this).aClass569_7991.method6755(-950109328)) {
			int i_105_ = ((-136691291 * ((Class613) this).anInt7996 - (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8);
			int i_106_ = ((-136691291 * ((Class613) this).anInt7996 + (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8);
			int i_107_ = ((((Class613) this).anInt7999 * -1483987005 - (((Class613) this).anInt8022 * -415841877 >> 4)) / 8);
			int i_108_ = ((((Class613) this).anInt7999 * -1483987005 + (-415841877 * ((Class613) this).anInt8022 >> 4)) / 8);
			for (int i_109_ = i_105_ - 1; i_109_ <= i_106_ + 1; i_109_++) {
				for (int i_110_ = i_107_ - 1; i_110_ <= i_108_ + 1; i_110_++) {
					if (i_109_ < i_105_ || i_109_ > i_106_ || i_110_ < i_107_ || i_110_ > i_108_)
						Class630.aClass248_8114.method3367(method7286(i_109_, i_110_, (byte) -8), (byte) 15);
				}
			}
		}
		if (9 == 835742603 * client.anInt8580)
			Class463.method5478(12, 1868409143);
		else if (client.anInt8580 * 835742603 == 7)
			Class463.method5478(5, 1511092839);
		else if (3 == 835742603 * client.anInt8580)
			Class463.method5478(11, 1218478644);
		else if (10 == client.anInt8580 * 835742603)
			Class463.method5478(6, 425533900);
		else {
			Class463.method5478(1, -1749293481);
			if (client.aClass195_8589.method2933(-1898764703) != null) {
				Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3731, client.aClass195_8589.aClass650_2340, -427740918);
				client.aClass195_8589.method2929(class572_sub25, (byte) -120);
			}
		}
		if (aBool7990) {
			Class118.method2154(Long.toString(Class69.method1067(-2129580919) - (-88363365188860213L * aLong8031)), 668408643);
			aBool7990 = false;
		}
		if (bool_99_) {
			synchronized (client.anObject8601) {
				client.anObject8601.notify();
			}
		}
		return true;
	}

	void method7312(int i, int i_111_) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public int method7313(byte i) {
		return ((Class613) this).anInt8006 * 1686352907;
	}

	void method7314(Class280_Sub1 class280_sub1, byte[][] is, int i) {
		for (int i_112_ = 0; i_112_ < 1097116465 * class280_sub1.anInt3186; i_112_++) {
			if (!((Class613) this).aBool8020)
				Class344.audio.method920((short) 11831);
			for (int i_113_ = 0; i_113_ < 1493989933 * ((Class613) this).anInt8000 >> 3; i_113_++) {
				for (int i_114_ = 0; i_114_ < ((Class613) this).anInt8022 * -415841877 >> 3; i_114_++) {
					int i_115_ = (((Class613) this).anIntArrayArrayArray8014[i_112_][i_113_][i_114_]);
					if (i_115_ != -1) {
						int i_116_ = i_115_ >> 24 & 0x3;
						if (!class280_sub1.aBool3140 || i_116_ == 0) {
							int i_117_ = i_115_ >> 1 & 0x3;
							int i_118_ = i_115_ >> 14 & 0x3ff;
							int i_119_ = i_115_ >> 3 & 0x7ff;
							int i_120_ = (i_118_ / 8 << 8) + i_119_ / 8;
							for (int i_121_ = 0; (i_121_ < ((Class613) this).anIntArray8015.length); i_121_++) {
								if ((((Class613) this).anIntArray8015[i_121_] == i_120_) && null != is[i_121_]) {
									RSByteBuffer class572_sub15 = new RSByteBuffer(is[i_121_]);
									class280_sub1.method3770(class572_sub15, i_112_, i_113_ * 8, i_114_ * 8, i_116_, i_118_, i_119_, i_117_, -1191117870);
									class280_sub1.method8808(Class272_Sub2.aClass106_9517, class572_sub15, i_112_, i_113_ * 8, 8 * i_114_, i_116_, i_118_, i_119_, i_117_, 2133059401);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (int i_122_ = 0; i_122_ < 1097116465 * class280_sub1.anInt3186; i_122_++) {
			if (!((Class613) this).aBool8020)
				Class344.audio.method920((short) -29506);
			for (int i_123_ = 0; i_123_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_123_++) {
				for (int i_124_ = 0; i_124_ < -415841877 * ((Class613) this).anInt8022 >> 3; i_124_++) {
					int i_125_ = (((Class613) this).anIntArrayArrayArray8014[i_122_][i_123_][i_124_]);
					if (i_125_ == -1)
						class280_sub1.method3769(i_122_, i_123_ * 8, 8 * i_124_, 8, 8, (byte) 72);
				}
			}
		}
	}

	void method7315(int i, byte i_126_) {
		int i_127_ = (((Class613) this).aClass497_8001.localX * -2109597897 - ((Class613) this).aClass497_7997.localX * -2109597897);
		int i_128_ = (((Class613) this).aClass497_8001.localY * 417324155 - ((Class613) this).aClass497_7997.localY * 417324155);
		if (i == 18) {
			for (int i_129_ = 0; i_129_ < client.anInt8624 * 617551237; i_129_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_129_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					for (int i_130_ = 0; i_130_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_130_++) {
						class456_sub1_sub2_sub3_sub1.screenX[i_130_] -= i_127_;
						class456_sub1_sub2_sub3_sub1.screenY[i_130_] -= i_128_;
					}
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_127_ * 512);
					class240.aFloat2657 -= (float) (i_128_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					class240.method3261();
				}
			}
		} else {
			boolean bool = false;
			client.anInt8625 = 0;
			int i_131_ = ((Class613) this).anInt8000 * 418667008 - 512;
			int i_132_ = 1837323776 * ((Class613) this).anInt8022 - 512;
			for (int i_133_ = 0; i_133_ < 617551237 * client.anInt8624; i_133_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_133_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_127_ * 512);
					class240.aFloat2657 -= (float) (i_128_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					if ((int) class240.aFloat2653 < 0 || (int) class240.aFloat2653 > i_131_ || (int) class240.aFloat2657 < 0 || (int) class240.aFloat2657 > i_132_) {
						class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -62);
						class572_sub9.method6794((byte) 94);
						bool = true;
					} else {
						boolean bool_134_ = true;
						for (int i_135_ = 0; i_135_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_135_++) {
							class456_sub1_sub2_sub3_sub1.screenX[i_135_] -= i_127_;
							class456_sub1_sub2_sub3_sub1.screenY[i_135_] -= i_128_;
							if ((class456_sub1_sub2_sub3_sub1.screenX[i_135_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenX[i_135_]) >= (1493989933 * ((Class613) this).anInt8000)) || (class456_sub1_sub2_sub3_sub1.screenY[i_135_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenY[i_135_]) >= (-415841877 * ((Class613) this).anInt8022)))
								bool_134_ = false;
						}
						if (bool_134_)
							client.anIntArray8626[((client.anInt8625 += 1417012813) * 765313669 - 1)] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633);
						else {
							class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -30);
							class572_sub9.method6794((byte) -9);
							bool = true;
						}
					}
					class240.method3261();
				}
			}
			if (bool) {
				client.anInt8624 = client.aClass676_8622.method7962((byte) 0) * -123495603;
				int i_136_ = 0;
				Iterator iterator = client.aClass676_8622.iterator();
				while (iterator.hasNext()) {
					LinkableObject class572_sub9 = (LinkableObject) iterator.next();
					client.aClass572_Sub9Array8623[i_136_++] = class572_sub9;
				}
			}
		}
		for (int i_137_ = 0; i_137_ < 2048; i_137_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_137_];
			if (class456_sub1_sub2_sub3_sub2 != null) {
				for (int i_138_ = 0; (i_138_ < class456_sub1_sub2_sub3_sub2.screenX.length); i_138_++) {
					class456_sub1_sub2_sub3_sub2.screenX[i_138_] -= i_127_;
					class456_sub1_sub2_sub3_sub2.screenY[i_138_] -= i_128_;
				}
				Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
				class240.aFloat2653 -= (float) (i_127_ * 512);
				class240.aFloat2657 -= (float) (i_128_ * 512);
				class456_sub1_sub2_sub3_sub2.method5401(class240);
				class240.method3261();
			}
		}
		Class193[] class193s = client.aClass193Array8593;
		for (int i_139_ = 0; i_139_ < class193s.length; i_139_++) {
			Class193 class193 = class193s[i_139_];
			if (null != class193) {
				class193.anInt2315 -= -926243328 * i_127_;
				class193.anInt2321 -= i_128_ * 1055220224;
			}
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9346.method7926(815523125)) {
			class572_sub34.anInt9334 -= i_127_ * 717749947;
			class572_sub34.anInt9332 -= i_128_ * 1117538113;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(1989941229 * class572_sub34.anInt9339, -951219699)));
			int i_140_;
			int i_141_;
			if ((class572_sub34.anInt9343 * 975125487 & 0x1) == 0) {
				i_140_ = -876498849 * class509.sizeX;
				i_141_ = class509.sizeY * 1922784011;
			} else {
				i_140_ = 1922784011 * class509.sizeY;
				i_141_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (i_140_ + 163944051 * class572_sub34.anInt9334 <= 0 || 254036161 * class572_sub34.anInt9332 + i_141_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (254036161 * class572_sub34.anInt9332 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) -58);
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9336.method7926(1259805582)) {
			class572_sub34.anInt9334 -= i_127_ * 717749947;
			class572_sub34.anInt9332 -= 1117538113 * i_128_;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(class572_sub34.anInt9339 * 1989941229, 1945281629)));
			int i_142_;
			int i_143_;
			if (0 == (975125487 * class572_sub34.anInt9343 & 0x1)) {
				i_142_ = -876498849 * class509.sizeX;
				i_143_ = 1922784011 * class509.sizeY;
			} else {
				i_142_ = 1922784011 * class509.sizeY;
				i_143_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (class572_sub34.anInt9334 * 163944051 + i_142_ <= 0 || class572_sub34.anInt9332 * 254036161 + i_143_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (class572_sub34.anInt9332 * 254036161 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) 5);
		}
		for (Class572_Sub42 class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7968((byte) 42)); class572_sub42 != null; class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7969(1870386665))) {
			int i_144_ = (int) (class572_sub42.hash * 381237825124074065L >> 28 & 0x3L);
			int i_145_ = (int) (class572_sub42.hash * 381237825124074065L & 0x3fffL);
			int i_146_ = (i_145_ - -2109597897 * ((Class613) this).aClass497_8001.localX);
			int i_147_ = (int) (381237825124074065L * class572_sub42.hash >> 14 & 0x3fffL);
			int i_148_ = (i_147_ - ((Class613) this).aClass497_8001.localY * 417324155);
			if (((Class613) this).aClass523_8002 != null) {
				if (i_146_ < 0 || i_148_ < 0 || i_146_ >= ((Class613) this).anInt8000 * 1493989933 || i_148_ >= ((Class613) this).anInt8022 * -415841877 || i_146_ >= (((Class613) this).aClass523_8002.anInt5833 * -1396185127) || i_148_ >= -1519623925 * (((Class613) this).aClass523_8002.anInt5834)) {
					if (Class569.aClass569_6390 != ((Class613) this).aClass569_7991)
						class572_sub42.method6794((byte) 46);
				} else if ((((Class613) this).aClass523_8002.aClass536ArrayArrayArray5882) != null)
					((Class613) this).aClass523_8002.method6282(i_144_, i_146_, i_148_, (byte) 2);
			}
		}
		if (Class192.anInt2310 * -1539999119 != 0) {
			Class192.anInt2310 -= -3733871 * i_127_;
			Class192.anInt2300 -= -343091919 * i_128_;
		}
		Class272_Sub2.method8875(false, 427296588);
		if (i == 18) {
			client.anInt8675 -= -34918912 * i_127_;
			client.anInt8792 -= i_128_ * 334740992;
			Entity.anInt11674 -= i_127_ * -1348754944;
			Class165.anInt2050 -= i_128_ * 1748963840;
			if (6 != 625220759 * Class18.anInt143 && Class18.anInt143 * 625220759 != 1)
				Class133_Sub4.method9340(Class111.method2081((byte) -20), (short) -5223);
		} else {
			Class39.anInt402 -= i_127_ * -966014557;
			Class9.anInt44 -= -1358470103 * i_128_;
			Class442.anInt5132 -= 236536067 * i_127_;
			Class438.anInt5081 -= -60353361 * i_128_;
			Class36.anInt387 -= 1842374144 * i_127_;
			Class49.anInt490 -= i_128_ * 1400052224;
			if (Math.abs(i_127_) > 1493989933 * ((Class613) this).anInt8000 || Math.abs(i_128_) > -415841877 * ((Class613) this).anInt8022)
				((Class613) this).aClass501_8026.method5981((byte) 32);
		}
		Class19.method688((byte) -96);
		Class556.method6584(297318035);
		client.aClass676_8747.method7964((byte) 115);
		client.aClass675_8774.method7918(269467347);
		client.aClass652_8748.method7704(1389204582);
		Class265.method3623(1350155308);
	}

	public void method7316() {
		((Class613) this).aClass497_8001 = new Class497();
		((Class613) this).anInt7999 = 0;
		((Class613) this).anInt7996 = 0;
	}

	public int method7317() {
		return 100 - (-474907244 * ((Class613) this).anInt8016 / (((Class613) this).anInt8017 * -1606330877));
	}

	public int method7318() {
		return 100 - (-474907244 * ((Class613) this).anInt8016 / (((Class613) this).anInt8017 * -1606330877));
	}

	public int method7319() {
		return 100 - (299841668 * ((Class613) this).anInt8019 / (1408604005 * ((Class613) this).anInt8009));
	}

	public int method7320() {
		return 100 - (299841668 * ((Class613) this).anInt8019 / (1408604005 * ((Class613) this).anInt8009));
	}

	void method7321() {
		((Class613) this).aClass569_8023 = ((Class613) this).aClass569_7991;
		method7345(Class65.aClass65_681, 1409071949);
		for (int i = 0; i < 4; i++) {
			for (int i_149_ = 0; i_149_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_149_++) {
				for (int i_150_ = 0; i_150_ < ((Class613) this).anInt8022 * -415841877 >> 3; i_150_++)
					((Class613) this).anIntArrayArrayArray8014[i][i_149_][i_150_] = -1;
			}
		}
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(538215917)) {
			int i = class572_sub28.anInt9292 * -2076205737;
			boolean bool = (i & 0x1) == 1;
			int i_151_ = 1104080005 * class572_sub28.anInt9298 >> 3;
			int i_152_ = 1979106429 * class572_sub28.anInt9293 >> 3;
			int i_153_ = class572_sub28.anInt9299 * -1911316627;
			int i_154_ = -1017107655 * class572_sub28.anInt9291;
			int i_155_ = class572_sub28.anInt9295 * 10595425;
			int i_156_ = class572_sub28.anInt9294 * 1786583713;
			int i_157_ = class572_sub28.anInt9297 * 1004939077;
			int i_158_ = 592655707 * class572_sub28.anInt9296;
			int i_159_ = 0;
			int i_160_ = 0;
			int i_161_ = 1;
			int i_162_ = 1;
			if (1 == i) {
				i_160_ = i_157_ - 1;
				i_161_ = -1;
			} else if (i == 2) {
				i_160_ = i_157_ - 1;
				i_159_ = i_158_ - 1;
				i_161_ = -1;
				i_162_ = -1;
			} else if (3 == i) {
				i_159_ = i_158_ - 1;
				i_161_ = 1;
				i_162_ = -1;
			}
			int i_163_ = i_152_;
			while (i_163_ < i_158_ + i_152_) {
				int i_164_ = i_160_;
				int i_165_ = i_151_;
				while (i_165_ < i_151_ + i_157_) {
					if (bool)
						((Class613) this).anIntArrayArrayArray8014[i_156_][i_159_ + i_153_][i_154_ + i_164_] = ((i_163_ << 3) + ((i_165_ << 14) + (i_155_ << 24)) + (i << 1));
					else
						((Class613) this).anIntArrayArrayArray8014[i_156_][i_153_ + i_164_][i_159_ + i_154_] = (i << 1) + ((i_155_ << 24) + (i_165_ << 14) + (i_163_ << 3));
					i_165_++;
					i_164_ += i_161_;
				}
				i_163_++;
				i_159_ += i_162_;
			}
		}
		int i = -300026841 * client.anInt8577;
		((Class613) this).anIntArray8015 = new int[i];
		((Class613) this).anIntArray8018 = new int[i];
		((Class613) this).aByteArrayArray8024 = new byte[i][];
		((Class613) this).aByteArrayArray8025 = new byte[i][];
		((Class613) this).aByteArrayArray8030 = null;
		((Class613) this).aByteArrayArray8027 = new byte[i][];
		((Class613) this).aByteArrayArray8028 = new byte[i][];
		i = 0;
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(276893163)) {
			int i_166_ = class572_sub28.anInt9298 * 1104080005 >>> 3;
			int i_167_ = 1979106429 * class572_sub28.anInt9293 >>> 3;
			int i_168_ = i_166_ + class572_sub28.anInt9297 * 1004939077;
			if ((i_168_ & 0x7) == 0)
				i_168_--;
			i_168_ >>>= 3;
			int i_169_ = i_167_ + class572_sub28.anInt9296 * 592655707;
			if (0 == (i_169_ & 0x7))
				i_169_--;
			i_169_ >>>= 3;
			for (int i_170_ = i_166_ >>> 3; i_170_ <= i_168_; i_170_++) {
				while_13_: for (int i_171_ = i_167_ >>> 3; i_171_ <= i_169_; i_171_++) {
					int i_172_ = i_170_ << 8 | i_171_;
					for (int i_173_ = 0; i_173_ < i; i_173_++) {
						if (i_172_ == ((Class613) this).anIntArray8015[i_173_])
							continue while_13_;
					}
					if (Class630.aClass248_8114.method3365(method7286(i_170_, i_171_, (byte) -96), Class269.aClass269_2854.anInt2856 * -609065221, -1723799974)) {
						((Class613) this).anIntArray8015[i] = i_172_;
						((Class613) this).anIntArray8018[i] = method7286(i_170_, i_171_, (byte) -123);
						i++;
					}
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i;
		method7322(1493989933 * ((Class613) this).anInt8000 >> 4, ((Class613) this).anInt8022 * -415841877 >> 4, 18, false, (short) -23612);
	}

	void method7322(int i, int i_174_, int i_175_, boolean bool, short i_176_) {
		if (1797623853 * client.anInt8646 == 1) {
			if (((Class613) this).aBool8020)
				throw new IllegalStateException();
			client.anInt8646 = 0;
			client.anInt8645 = 664497205;
		}
		if (bool || i != ((Class613) this).anInt7996 * -136691291 || i_174_ != -1483987005 * ((Class613) this).anInt7999) {
			((Class613) this).anInt7996 = i * -1306345939;
			((Class613) this).anInt7999 = i_174_ * -162365205;
			if (!((Class613) this).aBool8020) {
				Class463.method5478(i_175_, -1570301586);
				Class677.method7987((Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 621672199);
			}
			if (null != ((Class613) this).aClass497_8001)
				((Class613) this).aClass497_7997 = ((Class613) this).aClass497_8001;
			else
				((Class613) this).aClass497_7997 = new Class497(0, 0, 0);
			((Class613) this).aClass497_8001 = new Class497(0, 8 * (-136691291 * ((Class613) this).anInt7996 - (1493989933 * ((Class613) this).anInt8000 >> 4)), 8 * (-1483987005 * ((Class613) this).anInt7999 - (((Class613) this).anInt8022 * -415841877 >> 4)));
			((Class613) this).aClass572_Sub12_Sub5_8007 = (Class547.method6460((((Class613) this).aClass497_8001.localX * -2109597897 + ((Class613) this).anInt8000 * 1493989933 / 2), (1493989933 * ((Class613) this).anInt8000 / 2 + (417324155 * ((Class613) this).aClass497_8001.localY))));
			((Class613) this).aClass548_8008 = null;
			if (!((Class613) this).aBool8020)
				method7315(i_175_, (byte) -41);
		}
	}

	public float method7323() {
		return ((Class613) this).aFloat8010;
	}

	public float method7324() {
		return ((Class613) this).aFloat8010;
	}

	void method7325(Class280_Sub1 class280_sub1, byte[][] is, int i) {
		for (int i_177_ = 0; i_177_ < 1097116465 * class280_sub1.anInt3186; i_177_++) {
			if (!((Class613) this).aBool8020)
				Class344.audio.method920((short) 28460);
			for (int i_178_ = 0; i_178_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_178_++) {
				for (int i_179_ = 0; i_179_ < -415841877 * ((Class613) this).anInt8022 >> 3; i_179_++) {
					int i_180_ = (((Class613) this).anIntArrayArrayArray8014[i_177_][i_178_][i_179_]);
					if (-1 != i_180_) {
						int i_181_ = i_180_ >> 24 & 0x3;
						if (!class280_sub1.aBool3140 || 0 == i_181_) {
							int i_182_ = i_180_ >> 1 & 0x3;
							int i_183_ = i_180_ >> 14 & 0x3ff;
							int i_184_ = i_180_ >> 3 & 0x7ff;
							int i_185_ = i_184_ / 8 + (i_183_ / 8 << 8);
							for (int i_186_ = 0; (i_186_ < ((Class613) this).anIntArray8015.length); i_186_++) {
								if ((((Class613) this).anIntArray8015[i_186_] == i_185_) && is[i_186_] != null) {
									class280_sub1.method8814(Class272_Sub2.aClass106_9517, is[i_186_], i_177_, 8 * i_178_, 8 * i_179_, i_181_, 8 * (i_183_ & 0x7), (i_184_ & 0x7) * 8, i_182_, (byte) -33);
									break;
								}
							}
						}
					}
					if (((Class613) this).aBool8020)
						method7312(5, -311130564);
				}
			}
		}
	}

	public void method7326(byte[][][] is, int i) {
		((Class613) this).aByteArrayArrayArray8003 = is;
	}

	public Class569 method7327(int i) {
		return ((Class613) this).aClass569_7991;
	}

	public void method7328() {
		if (((Class613) this).aBool8020) {
			method7297((byte) 0);
			Class613 class613_187_ = client.aClass613_8605;
			((Class613) this).anInt7998 = 1 * ((Class613) class613_187_).anInt7998;
			((Class613) this).anIntArray8015 = ((Class613) class613_187_).anIntArray8015;
			((Class613) this).anIntArray8018 = ((Class613) class613_187_).anIntArray8018;
			((Class613) this).aByteArrayArray8024 = ((Class613) class613_187_).aByteArrayArray8024;
			((Class613) this).aByteArrayArray8025 = ((Class613) class613_187_).aByteArrayArray8025;
			((Class613) this).aByteArrayArray8030 = ((Class613) class613_187_).aByteArrayArray8030;
			((Class613) this).aByteArrayArray8027 = ((Class613) class613_187_).aByteArrayArray8027;
			((Class613) this).aByteArrayArray8028 = ((Class613) class613_187_).aByteArrayArray8028;
			((Class613) this).aClass274_8004 = ((Class613) class613_187_).aClass274_8004;
			((Class613) this).aClass501_8026 = ((Class613) class613_187_).aClass501_8026;
			((Class613) this).anIntArrayArrayArray8014 = ((Class613) class613_187_).anIntArrayArrayArray8014;
			((Class613) this).anInt8005 = 1 * ((Class613) class613_187_).anInt8005;
			((Class613) this).anInt8006 = 1 * ((Class613) class613_187_).anInt8006;
			((Class613) this).aClass572_Sub12_Sub5_8007 = ((Class613) class613_187_).aClass572_Sub12_Sub5_8007;
			((Class613) this).aClass548_8008 = ((Class613) class613_187_).aClass548_8008;
			((Class613) this).anIntArrayArray8012 = ((Class613) class613_187_).anIntArrayArray8012;
			((Class613) this).anIntArrayArray8013 = ((Class613) class613_187_).anIntArrayArray8013;
			((Class613) this).aByteArrayArrayArray8003 = ((Class613) class613_187_).aByteArrayArrayArray8003;
			((Class613) this).aClass569_7991 = ((Class613) class613_187_).aClass569_7991;
			((Class613) this).aClass65_7993 = ((Class613) class613_187_).aClass65_7993;
			((Class613) this).aClass497_8001 = ((Class613) class613_187_).aClass497_8001;
			((Class613) this).aClass497_7997 = ((Class613) class613_187_).aClass497_7997;
			((Class613) this).anInt7996 = ((Class613) class613_187_).anInt7996 * 1;
			((Class613) this).anInt7999 = 1 * ((Class613) class613_187_).anInt7999;
			((Class613) this).anInt8000 = ((Class613) class613_187_).anInt8000 * 1;
			((Class613) this).anInt8022 = ((Class613) class613_187_).anInt8022 * 1;
		} else if (12 == client.anInt8580 * 835742603)
			Class463.method5478(9, -182497493);
		else if (client.anInt8580 * 835742603 == 5)
			Class463.method5478(7, -761474484);
		else if (client.anInt8580 * 835742603 == 11)
			Class463.method5478(3, -1928790629);
		else if (835742603 * client.anInt8580 == 1)
			Class463.method5478(18, 1918037466);
		else if (client.anInt8580 * 835742603 == 6)
			Class463.method5478(10, -1526613612);
	}

	void method7329(byte i) {
		int i_188_ = ((Class613) this).aByteArrayArray8030.length;
		for (int i_189_ = 0; i_189_ < i_188_; i_189_++) {
			if (null != ((Class613) this).aByteArrayArray8030[i_189_]) {
				int i_190_ = -1;
				for (int i_191_ = 0; i_191_ < 1387212887 * client.anInt8850; i_191_++) {
					if (((Class613) this).anIntArray8015[i_189_] == client.anIntArray8575[i_191_]) {
						i_190_ = i_191_;
						break;
					}
				}
				if (-1 == i_190_) {
					client.anIntArray8575[client.anInt8850 * 1387212887] = ((Class613) this).anIntArray8015[i_189_];
					i_190_ = (client.anInt8850 += -2048083097) * 1387212887 - 1;
				}
				RSByteBuffer class572_sub15 = new RSByteBuffer(((Class613) this).aByteArrayArray8030[i_189_]);
				int i_192_ = 0;
				while ((-1585139053 * class572_sub15.o < ((Class613) this).aByteArrayArray8030[i_189_].length) && i_192_ < 511 && 765313669 * client.anInt8625 < 1023) {
					int i_193_ = i_190_ | i_192_++ << 6;
					int i_194_ = class572_sub15.readUnsignedShort(647518597);
					int i_195_ = i_194_ >> 14;
					int i_196_ = i_194_ >> 7 & 0x3f;
					int i_197_ = i_194_ & 0x3f;
					int i_198_ = (64 * (((Class613) this).anIntArray8015[i_189_] >> 8) - (((Class613) this).aClass497_8001.localX * -2109597897) + i_196_);
					int i_199_ = (i_197_ + (64 * (((Class613) this).anIntArray8015[i_189_] & 0xff) - (((Class613) this).aClass497_8001.localY * 417324155)));
					NPCDefintion class410 = (NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(class572_sub15.readUnsignedShort(647518597), -1783270177));
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_193_));
					if (null == class572_sub9 && (class410.aByte4836 & 0x1) > 0 && i_198_ >= 0 && (i_198_ + 358769667 * class410.anInt4792 < 1493989933 * ((Class613) this).anInt8000) && i_199_ >= 0 && (358769667 * class410.anInt4792 + i_199_ < -415841877 * ((Class613) this).anInt8022)) {
						NPC class456_sub1_sub2_sub3_sub1 = (new NPC(((Class613) this).aClass523_8002));
						class456_sub1_sub2_sub3_sub1.anInt11633 = i_193_ * 2118180903;
						LinkableObject class572_sub9_200_ = new LinkableObject(class456_sub1_sub2_sub3_sub1);
						client.aClass676_8622.put(class572_sub9_200_, (long) i_193_);
						client.aClass572_Sub9Array8623[(client.anInt8624 += -123495603) * 617551237 - 1] = class572_sub9_200_;
						client.anIntArray8626[(client.anInt8625 += 1417012813) * 765313669 - 1] = i_193_;
						class456_sub1_sub2_sub3_sub1.anInt11649 = 1226228503 * client.cycles;
						class456_sub1_sub2_sub3_sub1.method10680(class410, (byte) -18);
						class456_sub1_sub2_sub3_sub1.method10525((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667, (byte) 74);
						class456_sub1_sub2_sub3_sub1.anInt11653 = (-1233753521 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4823) << 3) * -631722783;
						class456_sub1_sub2_sub3_sub1.method10516((class456_sub1_sub2_sub3_sub1.aClass410_11803.aClass661_4846.method7778((byte) 57).getId(1837673028) << 11 & 0x3fff), true, 648650492);
						class456_sub1_sub2_sub3_sub1.method10686(i_195_, i_198_, i_199_, true, class456_sub1_sub2_sub3_sub1.method10556((short) -29444), -785457560);
					}
				}
			}
		}
	}

	public void method7330() {
		((Class613) this).aClass497_8001 = new Class497();
		((Class613) this).anInt7999 = 0;
		((Class613) this).anInt7996 = 0;
	}

	public void method7331() {
		if (null != ((Class613) this).aClass523_8002) {
			Class557.method6589((byte) -5);
			((Class613) this).aHashMap8032 = ((Class613) this).aClass523_8002.method6267(-854634833);
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	public void method7332() {
		if (null != ((Class613) this).aClass523_8002) {
			Class557.method6589((byte) -7);
			((Class613) this).aHashMap8032 = ((Class613) this).aClass523_8002.method6267(1074593958);
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	public void method7333() {
		if (null != ((Class613) this).aClass523_8002) {
			Class557.method6589((byte) 37);
			((Class613) this).aHashMap8032 = ((Class613) this).aClass523_8002.method6267(1411376759);
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	public void method7334() {
		((Class613) this).aClass614_7992 = Class614.aClass614_8034;
		((Class613) this).anInt8016 = 0;
		((Class613) this).anInt8017 = 1968604331;
		((Class613) this).anInt8019 = 0;
		((Class613) this).anInt8009 = -1683701139;
		((Class613) this).anInt8021 = 0;
	}

	public void method7335() {
		((Class613) this).aClass614_7992 = Class614.aClass614_8034;
		((Class613) this).anInt8016 = 0;
		((Class613) this).anInt8017 = 1968604331;
		((Class613) this).anInt8019 = 0;
		((Class613) this).anInt8009 = -1683701139;
		((Class613) this).anInt8021 = 0;
	}

	public void method7336() {
		((Class613) this).aClass501_8026.method5955(this, null, 0, 2026010806);
	}

	public void method7337() {
		((Class613) this).anInt8005 = -1365529752;
		if (0 == ((Class613) this).anInt8000 * 1493989933)
			((Class613) this).anInt8006 = 1736012746;
		else
			((Class613) this).anInt8006 = 1092761507 * (int) ((double) (1493989933 * ((Class613) this).anInt8000) * 34.46);
		((Class613) this).anInt8006 = (1686352907 * ((Class613) this).anInt8006 << 2) * 1092761507;
		if (Class272_Sub2.aClass106_9517.method1679())
			((Class613) this).anInt8006 += 1148143104;
	}

	void method7338() {
		((Class613) this).aClass280_Sub1_7994 = null;
		((Class613) this).aClass280_Sub1_7995 = null;
		if (null != ((Class613) this).aClass274_8004)
			((Class613) this).aClass274_8004.method3681(-1303356357);
		if (null != ((Class613) this).aClass501_8026)
			((Class613) this).aClass501_8026.method5964(-414239420);
		if (null != ((Class613) this).aClass523_8002) {
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	public Class614 method7339(byte i) {
		return ((Class613) this).aClass614_7992;
	}

	void method7340() {
		method7345(Class272_Sub5.method8883(Class213.aClass572_Sub24_2463.aClass665_Sub29_9212.method9121(683874822), 1882115200), 1773714603);
		int i = -2109597897 * ((Class613) this).aClass497_8001.localX;
		int i_201_ = 417324155 * ((Class613) this).aClass497_8001.localY;
		int i_202_ = (i >> 3) + (Class36.anInt387 * 386814715 >> 12);
		int i_203_ = (Class49.anInt490 * -999214779 >> 12) + (i_201_ >> 3);
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009 = (byte) 0;
		Class274.anInt2911 = 0;
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10699(8, 8, (byte) 72);
		int i_204_ = 18;
		((Class613) this).anIntArray8015 = new int[i_204_];
		((Class613) this).anIntArray8018 = new int[i_204_];
		((Class613) this).aByteArrayArray8024 = new byte[i_204_][];
		((Class613) this).aByteArrayArray8025 = new byte[i_204_][];
		((Class613) this).aByteArrayArray8030 = new byte[i_204_][];
		((Class613) this).aByteArrayArray8027 = new byte[i_204_][];
		((Class613) this).aByteArrayArray8028 = new byte[i_204_][];
		i_204_ = 0;
		for (int i_205_ = (i_202_ - (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_205_ <= (i_202_ + (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_205_++) {
			for (int i_206_ = (i_203_ - (((Class613) this).anInt8022 * -415841877 >> 4)) / 8; i_206_ <= ((((Class613) this).anInt8022 * -415841877 >> 4) + i_203_) / 8; i_206_++) {
				int i_207_ = (i_205_ << 8) + i_206_;
				if (Class630.aClass248_8114.method3365(method7286(i_205_, i_206_, (byte) -95), Class269.aClass269_2854.anInt2856 * -609065221, 1583820000)) {
					((Class613) this).anIntArray8015[i_204_] = i_207_;
					((Class613) this).anIntArray8018[i_204_] = method7286(i_205_, i_206_, (byte) -77);
					i_204_++;
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i_204_;
		int i_208_;
		if (12 == client.anInt8580 * 835742603)
			i_208_ = 9;
		else if (11 == client.anInt8580 * 835742603)
			i_208_ = 3;
		else if (client.anInt8580 * 835742603 == 5)
			i_208_ = 7;
		else if (6 == client.anInt8580 * 835742603)
			i_208_ = 10;
		else
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt8580 * 835742603).toString());
		method7322(i_202_, i_203_, i_208_, false, (short) -10818);
	}

	void method7341() {
		method7345(Class272_Sub5.method8883(Class213.aClass572_Sub24_2463.aClass665_Sub29_9212.method9121(-994753532), 1507857154), -1544651940);
		int i = -2109597897 * ((Class613) this).aClass497_8001.localX;
		int i_209_ = 417324155 * ((Class613) this).aClass497_8001.localY;
		int i_210_ = (i >> 3) + (Class36.anInt387 * 386814715 >> 12);
		int i_211_ = (Class49.anInt490 * -999214779 >> 12) + (i_209_ >> 3);
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009 = (byte) 0;
		Class274.anInt2911 = 0;
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10699(8, 8, (byte) 81);
		int i_212_ = 18;
		((Class613) this).anIntArray8015 = new int[i_212_];
		((Class613) this).anIntArray8018 = new int[i_212_];
		((Class613) this).aByteArrayArray8024 = new byte[i_212_][];
		((Class613) this).aByteArrayArray8025 = new byte[i_212_][];
		((Class613) this).aByteArrayArray8030 = new byte[i_212_][];
		((Class613) this).aByteArrayArray8027 = new byte[i_212_][];
		((Class613) this).aByteArrayArray8028 = new byte[i_212_][];
		i_212_ = 0;
		for (int i_213_ = (i_210_ - (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_213_ <= (i_210_ + (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_213_++) {
			for (int i_214_ = (i_211_ - (((Class613) this).anInt8022 * -415841877 >> 4)) / 8; i_214_ <= ((((Class613) this).anInt8022 * -415841877 >> 4) + i_211_) / 8; i_214_++) {
				int i_215_ = (i_213_ << 8) + i_214_;
				if (Class630.aClass248_8114.method3365(method7286(i_213_, i_214_, (byte) -51), Class269.aClass269_2854.anInt2856 * -609065221, 1464759048)) {
					((Class613) this).anIntArray8015[i_212_] = i_215_;
					((Class613) this).anIntArray8018[i_212_] = method7286(i_213_, i_214_, (byte) -59);
					i_212_++;
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i_212_;
		int i_216_;
		if (12 == client.anInt8580 * 835742603)
			i_216_ = 9;
		else if (11 == client.anInt8580 * 835742603)
			i_216_ = 3;
		else if (client.anInt8580 * 835742603 == 5)
			i_216_ = 7;
		else if (6 == client.anInt8580 * 835742603)
			i_216_ = 10;
		else
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt8580 * 835742603).toString());
		method7322(i_210_, i_211_, i_216_, false, (short) -21090);
	}

	void method7342() {
		method7345(Class272_Sub5.method8883(Class213.aClass572_Sub24_2463.aClass665_Sub29_9212.method9121(-1552388560), 1606054379), -482823890);
		int i = -2109597897 * ((Class613) this).aClass497_8001.localX;
		int i_217_ = 417324155 * ((Class613) this).aClass497_8001.localY;
		int i_218_ = (i >> 3) + (Class36.anInt387 * 386814715 >> 12);
		int i_219_ = (Class49.anInt490 * -999214779 >> 12) + (i_217_ >> 3);
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009 = (byte) 0;
		Class274.anInt2911 = 0;
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10699(8, 8, (byte) 111);
		int i_220_ = 18;
		((Class613) this).anIntArray8015 = new int[i_220_];
		((Class613) this).anIntArray8018 = new int[i_220_];
		((Class613) this).aByteArrayArray8024 = new byte[i_220_][];
		((Class613) this).aByteArrayArray8025 = new byte[i_220_][];
		((Class613) this).aByteArrayArray8030 = new byte[i_220_][];
		((Class613) this).aByteArrayArray8027 = new byte[i_220_][];
		((Class613) this).aByteArrayArray8028 = new byte[i_220_][];
		i_220_ = 0;
		for (int i_221_ = (i_218_ - (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_221_ <= (i_218_ + (1493989933 * ((Class613) this).anInt8000 >> 4)) / 8; i_221_++) {
			for (int i_222_ = (i_219_ - (((Class613) this).anInt8022 * -415841877 >> 4)) / 8; i_222_ <= ((((Class613) this).anInt8022 * -415841877 >> 4) + i_219_) / 8; i_222_++) {
				int i_223_ = (i_221_ << 8) + i_222_;
				if (Class630.aClass248_8114.method3365(method7286(i_221_, i_222_, (byte) -46), Class269.aClass269_2854.anInt2856 * -609065221, -165742845)) {
					((Class613) this).anIntArray8015[i_220_] = i_223_;
					((Class613) this).anIntArray8018[i_220_] = method7286(i_221_, i_222_, (byte) -99);
					i_220_++;
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i_220_;
		int i_224_;
		if (12 == client.anInt8580 * 835742603)
			i_224_ = 9;
		else if (11 == client.anInt8580 * 835742603)
			i_224_ = 3;
		else if (client.anInt8580 * 835742603 == 5)
			i_224_ = 7;
		else if (6 == client.anInt8580 * 835742603)
			i_224_ = 10;
		else
			throw new RuntimeException(new StringBuilder().append("").append(client.anInt8580 * 835742603).toString());
		method7322(i_218_, i_219_, i_224_, false, (short) 7227);
	}

	void method7343() {
		((Class613) this).aClass569_8023 = ((Class613) this).aClass569_7991;
		method7345(Class65.aClass65_681, -963470755);
		for (int i = 0; i < 4; i++) {
			for (int i_225_ = 0; i_225_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_225_++) {
				for (int i_226_ = 0; i_226_ < ((Class613) this).anInt8022 * -415841877 >> 3; i_226_++)
					((Class613) this).anIntArrayArrayArray8014[i][i_225_][i_226_] = -1;
			}
		}
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(1813054041)) {
			int i = class572_sub28.anInt9292 * -2076205737;
			boolean bool = (i & 0x1) == 1;
			int i_227_ = 1104080005 * class572_sub28.anInt9298 >> 3;
			int i_228_ = 1979106429 * class572_sub28.anInt9293 >> 3;
			int i_229_ = class572_sub28.anInt9299 * -1911316627;
			int i_230_ = -1017107655 * class572_sub28.anInt9291;
			int i_231_ = class572_sub28.anInt9295 * 10595425;
			int i_232_ = class572_sub28.anInt9294 * 1786583713;
			int i_233_ = class572_sub28.anInt9297 * 1004939077;
			int i_234_ = 592655707 * class572_sub28.anInt9296;
			int i_235_ = 0;
			int i_236_ = 0;
			int i_237_ = 1;
			int i_238_ = 1;
			if (1 == i) {
				i_236_ = i_233_ - 1;
				i_237_ = -1;
			} else if (i == 2) {
				i_236_ = i_233_ - 1;
				i_235_ = i_234_ - 1;
				i_237_ = -1;
				i_238_ = -1;
			} else if (3 == i) {
				i_235_ = i_234_ - 1;
				i_237_ = 1;
				i_238_ = -1;
			}
			int i_239_ = i_228_;
			while (i_239_ < i_234_ + i_228_) {
				int i_240_ = i_236_;
				int i_241_ = i_227_;
				while (i_241_ < i_227_ + i_233_) {
					if (bool)
						((Class613) this).anIntArrayArrayArray8014[i_232_][i_235_ + i_229_][i_230_ + i_240_] = ((i_239_ << 3) + ((i_241_ << 14) + (i_231_ << 24)) + (i << 1));
					else
						((Class613) this).anIntArrayArrayArray8014[i_232_][i_229_ + i_240_][i_235_ + i_230_] = (i << 1) + ((i_231_ << 24) + (i_241_ << 14) + (i_239_ << 3));
					i_241_++;
					i_240_ += i_237_;
				}
				i_239_++;
				i_235_ += i_238_;
			}
		}
		int i = -300026841 * client.anInt8577;
		((Class613) this).anIntArray8015 = new int[i];
		((Class613) this).anIntArray8018 = new int[i];
		((Class613) this).aByteArrayArray8024 = new byte[i][];
		((Class613) this).aByteArrayArray8025 = new byte[i][];
		((Class613) this).aByteArrayArray8030 = null;
		((Class613) this).aByteArrayArray8027 = new byte[i][];
		((Class613) this).aByteArrayArray8028 = new byte[i][];
		i = 0;
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(974082488)) {
			int i_242_ = class572_sub28.anInt9298 * 1104080005 >>> 3;
			int i_243_ = 1979106429 * class572_sub28.anInt9293 >>> 3;
			int i_244_ = i_242_ + class572_sub28.anInt9297 * 1004939077;
			if ((i_244_ & 0x7) == 0)
				i_244_--;
			i_244_ >>>= 3;
			int i_245_ = i_243_ + class572_sub28.anInt9296 * 592655707;
			if (0 == (i_245_ & 0x7))
				i_245_--;
			i_245_ >>>= 3;
			for (int i_246_ = i_242_ >>> 3; i_246_ <= i_244_; i_246_++) {
				while_15_: for (int i_247_ = i_243_ >>> 3; i_247_ <= i_245_; i_247_++) {
					int i_248_ = i_246_ << 8 | i_247_;
					for (int i_249_ = 0; i_249_ < i; i_249_++) {
						if (i_248_ == ((Class613) this).anIntArray8015[i_249_])
							continue while_15_;
					}
					if (Class630.aClass248_8114.method3365(method7286(i_246_, i_247_, (byte) -16), Class269.aClass269_2854.anInt2856 * -609065221, -1479545708)) {
						((Class613) this).anIntArray8015[i] = i_248_;
						((Class613) this).anIntArray8018[i] = method7286(i_246_, i_247_, (byte) -51);
						i++;
					}
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i;
		method7322(1493989933 * ((Class613) this).anInt8000 >> 4, ((Class613) this).anInt8022 * -415841877 >> 4, 18, false, (short) -18126);
	}

	void method7344() {
		((Class613) this).aClass569_8023 = ((Class613) this).aClass569_7991;
		method7345(Class65.aClass65_681, 151664705);
		for (int i = 0; i < 4; i++) {
			for (int i_250_ = 0; i_250_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_250_++) {
				for (int i_251_ = 0; i_251_ < ((Class613) this).anInt8022 * -415841877 >> 3; i_251_++)
					((Class613) this).anIntArrayArrayArray8014[i][i_250_][i_251_] = -1;
			}
		}
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(1335453261)) {
			int i = class572_sub28.anInt9292 * -2076205737;
			boolean bool = (i & 0x1) == 1;
			int i_252_ = 1104080005 * class572_sub28.anInt9298 >> 3;
			int i_253_ = 1979106429 * class572_sub28.anInt9293 >> 3;
			int i_254_ = class572_sub28.anInt9299 * -1911316627;
			int i_255_ = -1017107655 * class572_sub28.anInt9291;
			int i_256_ = class572_sub28.anInt9295 * 10595425;
			int i_257_ = class572_sub28.anInt9294 * 1786583713;
			int i_258_ = class572_sub28.anInt9297 * 1004939077;
			int i_259_ = 592655707 * class572_sub28.anInt9296;
			int i_260_ = 0;
			int i_261_ = 0;
			int i_262_ = 1;
			int i_263_ = 1;
			if (1 == i) {
				i_261_ = i_258_ - 1;
				i_262_ = -1;
			} else if (i == 2) {
				i_261_ = i_258_ - 1;
				i_260_ = i_259_ - 1;
				i_262_ = -1;
				i_263_ = -1;
			} else if (3 == i) {
				i_260_ = i_259_ - 1;
				i_262_ = 1;
				i_263_ = -1;
			}
			int i_264_ = i_253_;
			while (i_264_ < i_259_ + i_253_) {
				int i_265_ = i_261_;
				int i_266_ = i_252_;
				while (i_266_ < i_252_ + i_258_) {
					if (bool)
						((Class613) this).anIntArrayArrayArray8014[i_257_][i_260_ + i_254_][i_255_ + i_265_] = ((i_264_ << 3) + ((i_266_ << 14) + (i_256_ << 24)) + (i << 1));
					else
						((Class613) this).anIntArrayArrayArray8014[i_257_][i_254_ + i_265_][i_260_ + i_255_] = (i << 1) + ((i_256_ << 24) + (i_266_ << 14) + (i_264_ << 3));
					i_266_++;
					i_265_ += i_262_;
				}
				i_264_++;
				i_260_ += i_263_;
			}
		}
		int i = -300026841 * client.anInt8577;
		((Class613) this).anIntArray8015 = new int[i];
		((Class613) this).anIntArray8018 = new int[i];
		((Class613) this).aByteArrayArray8024 = new byte[i][];
		((Class613) this).aByteArrayArray8025 = new byte[i][];
		((Class613) this).aByteArrayArray8030 = null;
		((Class613) this).aByteArrayArray8027 = new byte[i][];
		((Class613) this).aByteArrayArray8028 = new byte[i][];
		i = 0;
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(321327107)) {
			int i_267_ = class572_sub28.anInt9298 * 1104080005 >>> 3;
			int i_268_ = 1979106429 * class572_sub28.anInt9293 >>> 3;
			int i_269_ = i_267_ + class572_sub28.anInt9297 * 1004939077;
			if ((i_269_ & 0x7) == 0)
				i_269_--;
			i_269_ >>>= 3;
			int i_270_ = i_268_ + class572_sub28.anInt9296 * 592655707;
			if (0 == (i_270_ & 0x7))
				i_270_--;
			i_270_ >>>= 3;
			for (int i_271_ = i_267_ >>> 3; i_271_ <= i_269_; i_271_++) {
				while_17_: for (int i_272_ = i_268_ >>> 3; i_272_ <= i_270_; i_272_++) {
					int i_273_ = i_271_ << 8 | i_272_;
					for (int i_274_ = 0; i_274_ < i; i_274_++) {
						if (i_273_ == ((Class613) this).anIntArray8015[i_274_])
							continue while_17_;
					}
					if (Class630.aClass248_8114.method3365(method7286(i_271_, i_272_, (byte) -9), Class269.aClass269_2854.anInt2856 * -609065221, -170725303)) {
						((Class613) this).anIntArray8015[i] = i_273_;
						((Class613) this).anIntArray8018[i] = method7286(i_271_, i_272_, (byte) -69);
						i++;
					}
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i;
		method7322(1493989933 * ((Class613) this).anInt8000 >> 4, ((Class613) this).anInt8022 * -415841877 >> 4, 18, false, (short) -8974);
	}

	void method7345(Class65 class65, int i) {
		if (class65 != ((Class613) this).aClass65_7993) {
			((Class613) this).anInt8000 = (((Class613) this).anInt8022 = -137468817 * class65.anInt678) * 1531300407;
			((Class613) this).anIntArrayArrayArray8014 = (new int[4][((Class613) this).anInt8000 * 1493989933 >> 3][((Class613) this).anInt8022 * -415841877 >> 3]);
			((Class613) this).anIntArrayArray8012 = (new int[1493989933 * ((Class613) this).anInt8000][-415841877 * ((Class613) this).anInt8022]);
			((Class613) this).anIntArrayArray8013 = (new int[1493989933 * ((Class613) this).anInt8000][((Class613) this).anInt8022 * -415841877]);
			((Class613) this).aByteArrayArrayArray8003 = (new byte[4][1493989933 * ((Class613) this).anInt8000][-415841877 * ((Class613) this).anInt8022]);
			((Class613) this).aClass274_8004 = new Class274(4, 1493989933 * ((Class613) this).anInt8000, -415841877 * ((Class613) this).anInt8022);
			method7298(false, 571336097);
			Class22.method707(-1031211128);
			((Class613) this).aClass65_7993 = class65;
		}
	}

	public byte[][][] method7346(byte i) {
		return ((Class613) this).aByteArrayArrayArray8003;
	}

	public int method7347(int i) {
		return 1493989933 * ((Class613) this).anInt8000;
	}

	public void method7348(Class598 class598, int i) {
		((Class613) this).aClass569_7991 = ((Class598) class598).aClass569_7849;
		if (((Class613) this).aClass569_7991 == Class569.aClass569_6392)
			method7303((byte) -60);
		else if (Class569.aClass569_6391 == ((Class613) this).aClass569_7991)
			sendMapScene(((Class598) class598).aClass572_Sub15_Sub2_7850, (byte) 0);
		else if (Class569.aClass569_6394 == ((Class613) this).aClass569_7991)
			method7277(1276173077);
		else if (((Class613) this).aClass569_7991.method6755(-427262641))
			sendDynamicMap(((Class598) class598).aClass572_Sub15_Sub2_7850, -1567116835);
	}

	void method7349() {
		if (Class569.aClass569_6394 != ((Class613) this).aClass569_7991 && ((Class613) this).aClass569_8023 != Class569.aClass569_6394) {
			if (((Class613) this).aClass569_7991 == Class569.aClass569_6396 || Class569.aClass569_6395 == ((Class613) this).aClass569_7991 || ((((Class613) this).aClass569_7991 != ((Class613) this).aClass569_8023) && ((Class569.aClass569_6391 == ((Class613) this).aClass569_7991) || (((Class613) this).aClass569_8023 == Class569.aClass569_6391)))) {
				Iterator iterator = client.aClass676_8622.iterator();
				while (iterator.hasNext()) {
					LinkableObject class572_sub9 = (LinkableObject) iterator.next();
					Class259.method3561(((NPC) class572_sub9.anObject9081), -441046454);
				}
				client.anInt8625 = 0;
				client.anInt8624 = 0;
				client.aClass676_8622.method7964((byte) 16);
			}
			((Class613) this).aClass569_8023 = ((Class613) this).aClass569_7991;
		}
	}

	void method7350(int i) {
		int i_275_ = (((Class613) this).aClass497_8001.localX * -2109597897 - ((Class613) this).aClass497_7997.localX * -2109597897);
		int i_276_ = (((Class613) this).aClass497_8001.localY * 417324155 - ((Class613) this).aClass497_7997.localY * 417324155);
		if (i == 18) {
			for (int i_277_ = 0; i_277_ < client.anInt8624 * 617551237; i_277_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_277_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					for (int i_278_ = 0; i_278_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_278_++) {
						class456_sub1_sub2_sub3_sub1.screenX[i_278_] -= i_275_;
						class456_sub1_sub2_sub3_sub1.screenY[i_278_] -= i_276_;
					}
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_275_ * 512);
					class240.aFloat2657 -= (float) (i_276_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					class240.method3261();
				}
			}
		} else {
			boolean bool = false;
			client.anInt8625 = 0;
			int i_279_ = ((Class613) this).anInt8000 * 418667008 - 512;
			int i_280_ = 1837323776 * ((Class613) this).anInt8022 - 512;
			for (int i_281_ = 0; i_281_ < 617551237 * client.anInt8624; i_281_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_281_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_275_ * 512);
					class240.aFloat2657 -= (float) (i_276_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					if ((int) class240.aFloat2653 < 0 || (int) class240.aFloat2653 > i_279_ || (int) class240.aFloat2657 < 0 || (int) class240.aFloat2657 > i_280_) {
						class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -62);
						class572_sub9.method6794((byte) 64);
						bool = true;
					} else {
						boolean bool_282_ = true;
						for (int i_283_ = 0; i_283_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_283_++) {
							class456_sub1_sub2_sub3_sub1.screenX[i_283_] -= i_275_;
							class456_sub1_sub2_sub3_sub1.screenY[i_283_] -= i_276_;
							if ((class456_sub1_sub2_sub3_sub1.screenX[i_283_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenX[i_283_]) >= (1493989933 * ((Class613) this).anInt8000)) || (class456_sub1_sub2_sub3_sub1.screenY[i_283_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenY[i_283_]) >= (-415841877 * ((Class613) this).anInt8022)))
								bool_282_ = false;
						}
						if (bool_282_)
							client.anIntArray8626[((client.anInt8625 += 1417012813) * 765313669 - 1)] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633);
						else {
							class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -118);
							class572_sub9.method6794((byte) 14);
							bool = true;
						}
					}
					class240.method3261();
				}
			}
			if (bool) {
				client.anInt8624 = client.aClass676_8622.method7962((byte) 0) * -123495603;
				int i_284_ = 0;
				Iterator iterator = client.aClass676_8622.iterator();
				while (iterator.hasNext()) {
					LinkableObject class572_sub9 = (LinkableObject) iterator.next();
					client.aClass572_Sub9Array8623[i_284_++] = class572_sub9;
				}
			}
		}
		for (int i_285_ = 0; i_285_ < 2048; i_285_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_285_];
			if (class456_sub1_sub2_sub3_sub2 != null) {
				for (int i_286_ = 0; (i_286_ < class456_sub1_sub2_sub3_sub2.screenX.length); i_286_++) {
					class456_sub1_sub2_sub3_sub2.screenX[i_286_] -= i_275_;
					class456_sub1_sub2_sub3_sub2.screenY[i_286_] -= i_276_;
				}
				Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
				class240.aFloat2653 -= (float) (i_275_ * 512);
				class240.aFloat2657 -= (float) (i_276_ * 512);
				class456_sub1_sub2_sub3_sub2.method5401(class240);
				class240.method3261();
			}
		}
		Class193[] class193s = client.aClass193Array8593;
		for (int i_287_ = 0; i_287_ < class193s.length; i_287_++) {
			Class193 class193 = class193s[i_287_];
			if (null != class193) {
				class193.anInt2315 -= -926243328 * i_275_;
				class193.anInt2321 -= i_276_ * 1055220224;
			}
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9346.method7926(1663458030)) {
			class572_sub34.anInt9334 -= i_275_ * 717749947;
			class572_sub34.anInt9332 -= i_276_ * 1117538113;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(1989941229 * class572_sub34.anInt9339, 1242465844)));
			int i_288_;
			int i_289_;
			if ((class572_sub34.anInt9343 * 975125487 & 0x1) == 0) {
				i_288_ = -876498849 * class509.sizeX;
				i_289_ = class509.sizeY * 1922784011;
			} else {
				i_288_ = 1922784011 * class509.sizeY;
				i_289_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (i_288_ + 163944051 * class572_sub34.anInt9334 <= 0 || 254036161 * class572_sub34.anInt9332 + i_289_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (254036161 * class572_sub34.anInt9332 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) 39);
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9336.method7926(974045383)) {
			class572_sub34.anInt9334 -= i_275_ * 717749947;
			class572_sub34.anInt9332 -= 1117538113 * i_276_;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(class572_sub34.anInt9339 * 1989941229, 1346815479)));
			int i_290_;
			int i_291_;
			if (0 == (975125487 * class572_sub34.anInt9343 & 0x1)) {
				i_290_ = -876498849 * class509.sizeX;
				i_291_ = 1922784011 * class509.sizeY;
			} else {
				i_290_ = 1922784011 * class509.sizeY;
				i_291_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (class572_sub34.anInt9334 * 163944051 + i_290_ <= 0 || class572_sub34.anInt9332 * 254036161 + i_291_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (class572_sub34.anInt9332 * 254036161 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) 95);
		}
		for (Class572_Sub42 class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7968((byte) 64)); class572_sub42 != null; class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7969(-259414059))) {
			int i_292_ = (int) (class572_sub42.hash * 381237825124074065L >> 28 & 0x3L);
			int i_293_ = (int) (class572_sub42.hash * 381237825124074065L & 0x3fffL);
			int i_294_ = (i_293_ - -2109597897 * ((Class613) this).aClass497_8001.localX);
			int i_295_ = (int) (381237825124074065L * class572_sub42.hash >> 14 & 0x3fffL);
			int i_296_ = (i_295_ - ((Class613) this).aClass497_8001.localY * 417324155);
			if (((Class613) this).aClass523_8002 != null) {
				if (i_294_ < 0 || i_296_ < 0 || i_294_ >= ((Class613) this).anInt8000 * 1493989933 || i_296_ >= ((Class613) this).anInt8022 * -415841877 || i_294_ >= (((Class613) this).aClass523_8002.anInt5833 * -1396185127) || i_296_ >= -1519623925 * (((Class613) this).aClass523_8002.anInt5834)) {
					if (Class569.aClass569_6390 != ((Class613) this).aClass569_7991)
						class572_sub42.method6794((byte) -8);
				} else if ((((Class613) this).aClass523_8002.aClass536ArrayArrayArray5882) != null)
					((Class613) this).aClass523_8002.method6282(i_292_, i_294_, i_296_, (byte) 2);
			}
		}
		if (Class192.anInt2310 * -1539999119 != 0) {
			Class192.anInt2310 -= -3733871 * i_275_;
			Class192.anInt2300 -= -343091919 * i_276_;
		}
		Class272_Sub2.method8875(false, -1129618065);
		if (i == 18) {
			client.anInt8675 -= -34918912 * i_275_;
			client.anInt8792 -= i_276_ * 334740992;
			Entity.anInt11674 -= i_275_ * -1348754944;
			Class165.anInt2050 -= i_276_ * 1748963840;
			if (6 != 625220759 * Class18.anInt143 && Class18.anInt143 * 625220759 != 1)
				Class133_Sub4.method9340(Class111.method2081((byte) -15), (short) -6805);
		} else {
			Class39.anInt402 -= i_275_ * -966014557;
			Class9.anInt44 -= -1358470103 * i_276_;
			Class442.anInt5132 -= 236536067 * i_275_;
			Class438.anInt5081 -= -60353361 * i_276_;
			Class36.anInt387 -= 1842374144 * i_275_;
			Class49.anInt490 -= i_276_ * 1400052224;
			if (Math.abs(i_275_) > 1493989933 * ((Class613) this).anInt8000 || Math.abs(i_276_) > -415841877 * ((Class613) this).anInt8022)
				((Class613) this).aClass501_8026.method5981((byte) 32);
		}
		Class19.method688((byte) -6);
		Class556.method6584(-1287153301);
		client.aClass676_8747.method7964((byte) 120);
		client.aClass675_8774.method7918(-901265898);
		client.aClass652_8748.method7704(775194132);
		Class265.method3623(-1240158070);
	}

	void method7351(int i) {
		int i_297_ = (((Class613) this).aClass497_8001.localX * -2109597897 - ((Class613) this).aClass497_7997.localX * -2109597897);
		int i_298_ = (((Class613) this).aClass497_8001.localY * 417324155 - ((Class613) this).aClass497_7997.localY * 417324155);
		if (i == 18) {
			for (int i_299_ = 0; i_299_ < client.anInt8624 * 617551237; i_299_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_299_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					for (int i_300_ = 0; i_300_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_300_++) {
						class456_sub1_sub2_sub3_sub1.screenX[i_300_] -= i_297_;
						class456_sub1_sub2_sub3_sub1.screenY[i_300_] -= i_298_;
					}
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_297_ * 512);
					class240.aFloat2657 -= (float) (i_298_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					class240.method3261();
				}
			}
		} else {
			boolean bool = false;
			client.anInt8625 = 0;
			int i_301_ = ((Class613) this).anInt8000 * 418667008 - 512;
			int i_302_ = 1837323776 * ((Class613) this).anInt8022 - 512;
			for (int i_303_ = 0; i_303_ < 617551237 * client.anInt8624; i_303_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_303_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_297_ * 512);
					class240.aFloat2657 -= (float) (i_298_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					if ((int) class240.aFloat2653 < 0 || (int) class240.aFloat2653 > i_301_ || (int) class240.aFloat2657 < 0 || (int) class240.aFloat2657 > i_302_) {
						class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -75);
						class572_sub9.method6794((byte) 26);
						bool = true;
					} else {
						boolean bool_304_ = true;
						for (int i_305_ = 0; i_305_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_305_++) {
							class456_sub1_sub2_sub3_sub1.screenX[i_305_] -= i_297_;
							class456_sub1_sub2_sub3_sub1.screenY[i_305_] -= i_298_;
							if ((class456_sub1_sub2_sub3_sub1.screenX[i_305_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenX[i_305_]) >= (1493989933 * ((Class613) this).anInt8000)) || (class456_sub1_sub2_sub3_sub1.screenY[i_305_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenY[i_305_]) >= (-415841877 * ((Class613) this).anInt8022)))
								bool_304_ = false;
						}
						if (bool_304_)
							client.anIntArray8626[((client.anInt8625 += 1417012813) * 765313669 - 1)] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633);
						else {
							class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -80);
							class572_sub9.method6794((byte) 8);
							bool = true;
						}
					}
					class240.method3261();
				}
			}
			if (bool) {
				client.anInt8624 = client.aClass676_8622.method7962((byte) 0) * -123495603;
				int i_306_ = 0;
				Iterator iterator = client.aClass676_8622.iterator();
				while (iterator.hasNext()) {
					LinkableObject class572_sub9 = (LinkableObject) iterator.next();
					client.aClass572_Sub9Array8623[i_306_++] = class572_sub9;
				}
			}
		}
		for (int i_307_ = 0; i_307_ < 2048; i_307_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_307_];
			if (class456_sub1_sub2_sub3_sub2 != null) {
				for (int i_308_ = 0; (i_308_ < class456_sub1_sub2_sub3_sub2.screenX.length); i_308_++) {
					class456_sub1_sub2_sub3_sub2.screenX[i_308_] -= i_297_;
					class456_sub1_sub2_sub3_sub2.screenY[i_308_] -= i_298_;
				}
				Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
				class240.aFloat2653 -= (float) (i_297_ * 512);
				class240.aFloat2657 -= (float) (i_298_ * 512);
				class456_sub1_sub2_sub3_sub2.method5401(class240);
				class240.method3261();
			}
		}
		Class193[] class193s = client.aClass193Array8593;
		for (int i_309_ = 0; i_309_ < class193s.length; i_309_++) {
			Class193 class193 = class193s[i_309_];
			if (null != class193) {
				class193.anInt2315 -= -926243328 * i_297_;
				class193.anInt2321 -= i_298_ * 1055220224;
			}
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9346.method7926(1092751162)) {
			class572_sub34.anInt9334 -= i_297_ * 717749947;
			class572_sub34.anInt9332 -= i_298_ * 1117538113;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(1989941229 * class572_sub34.anInt9339, 403924200)));
			int i_310_;
			int i_311_;
			if ((class572_sub34.anInt9343 * 975125487 & 0x1) == 0) {
				i_310_ = -876498849 * class509.sizeX;
				i_311_ = class509.sizeY * 1922784011;
			} else {
				i_310_ = 1922784011 * class509.sizeY;
				i_311_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (i_310_ + 163944051 * class572_sub34.anInt9334 <= 0 || 254036161 * class572_sub34.anInt9332 + i_311_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (254036161 * class572_sub34.anInt9332 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) -80);
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9336.method7926(1522547971)) {
			class572_sub34.anInt9334 -= i_297_ * 717749947;
			class572_sub34.anInt9332 -= 1117538113 * i_298_;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(class572_sub34.anInt9339 * 1989941229, 1798751406)));
			int i_312_;
			int i_313_;
			if (0 == (975125487 * class572_sub34.anInt9343 & 0x1)) {
				i_312_ = -876498849 * class509.sizeX;
				i_313_ = 1922784011 * class509.sizeY;
			} else {
				i_312_ = 1922784011 * class509.sizeY;
				i_313_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (class572_sub34.anInt9334 * 163944051 + i_312_ <= 0 || class572_sub34.anInt9332 * 254036161 + i_313_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (class572_sub34.anInt9332 * 254036161 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) 67);
		}
		for (Class572_Sub42 class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7968((byte) -77)); class572_sub42 != null; class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7969(1688846781))) {
			int i_314_ = (int) (class572_sub42.hash * 381237825124074065L >> 28 & 0x3L);
			int i_315_ = (int) (class572_sub42.hash * 381237825124074065L & 0x3fffL);
			int i_316_ = (i_315_ - -2109597897 * ((Class613) this).aClass497_8001.localX);
			int i_317_ = (int) (381237825124074065L * class572_sub42.hash >> 14 & 0x3fffL);
			int i_318_ = (i_317_ - ((Class613) this).aClass497_8001.localY * 417324155);
			if (((Class613) this).aClass523_8002 != null) {
				if (i_316_ < 0 || i_318_ < 0 || i_316_ >= ((Class613) this).anInt8000 * 1493989933 || i_318_ >= ((Class613) this).anInt8022 * -415841877 || i_316_ >= (((Class613) this).aClass523_8002.anInt5833 * -1396185127) || i_318_ >= -1519623925 * (((Class613) this).aClass523_8002.anInt5834)) {
					if (Class569.aClass569_6390 != ((Class613) this).aClass569_7991)
						class572_sub42.method6794((byte) 9);
				} else if ((((Class613) this).aClass523_8002.aClass536ArrayArrayArray5882) != null)
					((Class613) this).aClass523_8002.method6282(i_314_, i_316_, i_318_, (byte) 2);
			}
		}
		if (Class192.anInt2310 * -1539999119 != 0) {
			Class192.anInt2310 -= -3733871 * i_297_;
			Class192.anInt2300 -= -343091919 * i_298_;
		}
		Class272_Sub2.method8875(false, 1283150241);
		if (i == 18) {
			client.anInt8675 -= -34918912 * i_297_;
			client.anInt8792 -= i_298_ * 334740992;
			Entity.anInt11674 -= i_297_ * -1348754944;
			Class165.anInt2050 -= i_298_ * 1748963840;
			if (6 != 625220759 * Class18.anInt143 && Class18.anInt143 * 625220759 != 1)
				Class133_Sub4.method9340(Class111.method2081((byte) -74), (short) -13698);
		} else {
			Class39.anInt402 -= i_297_ * -966014557;
			Class9.anInt44 -= -1358470103 * i_298_;
			Class442.anInt5132 -= 236536067 * i_297_;
			Class438.anInt5081 -= -60353361 * i_298_;
			Class36.anInt387 -= 1842374144 * i_297_;
			Class49.anInt490 -= i_298_ * 1400052224;
			if (Math.abs(i_297_) > 1493989933 * ((Class613) this).anInt8000 || Math.abs(i_298_) > -415841877 * ((Class613) this).anInt8022)
				((Class613) this).aClass501_8026.method5981((byte) 32);
		}
		Class19.method688((byte) -62);
		Class556.method6584(-45819298);
		client.aClass676_8747.method7964((byte) 74);
		client.aClass675_8774.method7918(1410705334);
		client.aClass652_8748.method7704(1618121685);
		Class265.method3623(1724730564);
	}

	void method7352(int i) {
		int i_319_ = (((Class613) this).aClass497_8001.localX * -2109597897 - ((Class613) this).aClass497_7997.localX * -2109597897);
		int i_320_ = (((Class613) this).aClass497_8001.localY * 417324155 - ((Class613) this).aClass497_7997.localY * 417324155);
		if (i == 18) {
			for (int i_321_ = 0; i_321_ < client.anInt8624 * 617551237; i_321_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_321_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					for (int i_322_ = 0; i_322_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_322_++) {
						class456_sub1_sub2_sub3_sub1.screenX[i_322_] -= i_319_;
						class456_sub1_sub2_sub3_sub1.screenY[i_322_] -= i_320_;
					}
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_319_ * 512);
					class240.aFloat2657 -= (float) (i_320_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					class240.method3261();
				}
			}
		} else {
			boolean bool = false;
			client.anInt8625 = 0;
			int i_323_ = ((Class613) this).anInt8000 * 418667008 - 512;
			int i_324_ = 1837323776 * ((Class613) this).anInt8022 - 512;
			for (int i_325_ = 0; i_325_ < 617551237 * client.anInt8624; i_325_++) {
				LinkableObject class572_sub9 = client.aClass572_Sub9Array8623[i_325_];
				if (null != class572_sub9) {
					NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
					Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
					class240.aFloat2653 -= (float) (i_319_ * 512);
					class240.aFloat2657 -= (float) (i_320_ * 512);
					class456_sub1_sub2_sub3_sub1.method5401(class240);
					if ((int) class240.aFloat2653 < 0 || (int) class240.aFloat2653 > i_323_ || (int) class240.aFloat2657 < 0 || (int) class240.aFloat2657 > i_324_) {
						class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -98);
						class572_sub9.method6794((byte) 15);
						bool = true;
					} else {
						boolean bool_326_ = true;
						for (int i_327_ = 0; i_327_ < (class456_sub1_sub2_sub3_sub1.screenX).length; i_327_++) {
							class456_sub1_sub2_sub3_sub1.screenX[i_327_] -= i_319_;
							class456_sub1_sub2_sub3_sub1.screenY[i_327_] -= i_320_;
							if ((class456_sub1_sub2_sub3_sub1.screenX[i_327_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenX[i_327_]) >= (1493989933 * ((Class613) this).anInt8000)) || (class456_sub1_sub2_sub3_sub1.screenY[i_327_]) < 0 || ((class456_sub1_sub2_sub3_sub1.screenY[i_327_]) >= (-415841877 * ((Class613) this).anInt8022)))
								bool_326_ = false;
						}
						if (bool_326_)
							client.anIntArray8626[((client.anInt8625 += 1417012813) * 765313669 - 1)] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633);
						else {
							class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -124);
							class572_sub9.method6794((byte) 65);
							bool = true;
						}
					}
					class240.method3261();
				}
			}
			if (bool) {
				client.anInt8624 = client.aClass676_8622.method7962((byte) 0) * -123495603;
				int i_328_ = 0;
				Iterator iterator = client.aClass676_8622.iterator();
				while (iterator.hasNext()) {
					LinkableObject class572_sub9 = (LinkableObject) iterator.next();
					client.aClass572_Sub9Array8623[i_328_++] = class572_sub9;
				}
			}
		}
		for (int i_329_ = 0; i_329_ < 2048; i_329_++) {
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_329_];
			if (class456_sub1_sub2_sub3_sub2 != null) {
				for (int i_330_ = 0; (i_330_ < class456_sub1_sub2_sub3_sub2.screenX.length); i_330_++) {
					class456_sub1_sub2_sub3_sub2.screenX[i_330_] -= i_319_;
					class456_sub1_sub2_sub3_sub2.screenY[i_330_] -= i_320_;
				}
				Class240 class240 = Class240.method3276(class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
				class240.aFloat2653 -= (float) (i_319_ * 512);
				class240.aFloat2657 -= (float) (i_320_ * 512);
				class456_sub1_sub2_sub3_sub2.method5401(class240);
				class240.method3261();
			}
		}
		Class193[] class193s = client.aClass193Array8593;
		for (int i_331_ = 0; i_331_ < class193s.length; i_331_++) {
			Class193 class193 = class193s[i_331_];
			if (null != class193) {
				class193.anInt2315 -= -926243328 * i_319_;
				class193.anInt2321 -= i_320_ * 1055220224;
			}
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9346.method7926(1662022838)) {
			class572_sub34.anInt9334 -= i_319_ * 717749947;
			class572_sub34.anInt9332 -= i_320_ * 1117538113;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(1989941229 * class572_sub34.anInt9339, -1069868890)));
			int i_332_;
			int i_333_;
			if ((class572_sub34.anInt9343 * 975125487 & 0x1) == 0) {
				i_332_ = -876498849 * class509.sizeX;
				i_333_ = class509.sizeY * 1922784011;
			} else {
				i_332_ = 1922784011 * class509.sizeY;
				i_333_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (i_332_ + 163944051 * class572_sub34.anInt9334 <= 0 || 254036161 * class572_sub34.anInt9332 + i_333_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (254036161 * class572_sub34.anInt9332 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) -64);
		}
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9336.method7926(1059339095)) {
			class572_sub34.anInt9334 -= i_319_ * 717749947;
			class572_sub34.anInt9332 -= 1117538113 * i_320_;
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class613) this).aClass639_Sub16_8011.getDefinition(class572_sub34.anInt9339 * 1989941229, 1731651720)));
			int i_334_;
			int i_335_;
			if (0 == (975125487 * class572_sub34.anInt9343 & 0x1)) {
				i_334_ = -876498849 * class509.sizeX;
				i_335_ = 1922784011 * class509.sizeY;
			} else {
				i_334_ = 1922784011 * class509.sizeY;
				i_335_ = class509.sizeX * -876498849;
			}
			if (((Class613) this).aClass569_7991 != Class569.aClass569_6390 && (class572_sub34.anInt9334 * 163944051 + i_334_ <= 0 || class572_sub34.anInt9332 * 254036161 + i_335_ <= 0 || (163944051 * class572_sub34.anInt9334 >= 1493989933 * ((Class613) this).anInt8000) || (class572_sub34.anInt9332 * 254036161 >= ((Class613) this).anInt8022 * -415841877)))
				class572_sub34.method6794((byte) -32);
		}
		for (Class572_Sub42 class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7968((byte) -3)); class572_sub42 != null; class572_sub42 = ((Class572_Sub42) client.aClass676_8749.method7969(1301296757))) {
			int i_336_ = (int) (class572_sub42.hash * 381237825124074065L >> 28 & 0x3L);
			int i_337_ = (int) (class572_sub42.hash * 381237825124074065L & 0x3fffL);
			int i_338_ = (i_337_ - -2109597897 * ((Class613) this).aClass497_8001.localX);
			int i_339_ = (int) (381237825124074065L * class572_sub42.hash >> 14 & 0x3fffL);
			int i_340_ = (i_339_ - ((Class613) this).aClass497_8001.localY * 417324155);
			if (((Class613) this).aClass523_8002 != null) {
				if (i_338_ < 0 || i_340_ < 0 || i_338_ >= ((Class613) this).anInt8000 * 1493989933 || i_340_ >= ((Class613) this).anInt8022 * -415841877 || i_338_ >= (((Class613) this).aClass523_8002.anInt5833 * -1396185127) || i_340_ >= -1519623925 * (((Class613) this).aClass523_8002.anInt5834)) {
					if (Class569.aClass569_6390 != ((Class613) this).aClass569_7991)
						class572_sub42.method6794((byte) 53);
				} else if ((((Class613) this).aClass523_8002.aClass536ArrayArrayArray5882) != null)
					((Class613) this).aClass523_8002.method6282(i_336_, i_338_, i_340_, (byte) 2);
			}
		}
		if (Class192.anInt2310 * -1539999119 != 0) {
			Class192.anInt2310 -= -3733871 * i_319_;
			Class192.anInt2300 -= -343091919 * i_320_;
		}
		Class272_Sub2.method8875(false, 107927490);
		if (i == 18) {
			client.anInt8675 -= -34918912 * i_319_;
			client.anInt8792 -= i_320_ * 334740992;
			Entity.anInt11674 -= i_319_ * -1348754944;
			Class165.anInt2050 -= i_320_ * 1748963840;
			if (6 != 625220759 * Class18.anInt143 && Class18.anInt143 * 625220759 != 1)
				Class133_Sub4.method9340(Class111.method2081((byte) -90), (short) 6565);
		} else {
			Class39.anInt402 -= i_319_ * -966014557;
			Class9.anInt44 -= -1358470103 * i_320_;
			Class442.anInt5132 -= 236536067 * i_319_;
			Class438.anInt5081 -= -60353361 * i_320_;
			Class36.anInt387 -= 1842374144 * i_319_;
			Class49.anInt490 -= i_320_ * 1400052224;
			if (Math.abs(i_319_) > 1493989933 * ((Class613) this).anInt8000 || Math.abs(i_320_) > -415841877 * ((Class613) this).anInt8022)
				((Class613) this).aClass501_8026.method5981((byte) 32);
		}
		Class19.method688((byte) 28);
		Class556.method6584(612122283);
		client.aClass676_8747.method7964((byte) 42);
		client.aClass675_8774.method7918(1537926559);
		client.aClass652_8748.method7704(1432777995);
		Class265.method3623(484993348);
	}

	void method7353() {
		((Class613) this).aClass280_Sub1_7994 = null;
		((Class613) this).aClass280_Sub1_7995 = null;
		if (null != ((Class613) this).aClass274_8004)
			((Class613) this).aClass274_8004.method3681(-1451023220);
		if (null != ((Class613) this).aClass501_8026)
			((Class613) this).aClass501_8026.method5964(-414239420);
		if (null != ((Class613) this).aClass523_8002) {
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	void method7354() {
		((Class613) this).aClass280_Sub1_7994 = null;
		((Class613) this).aClass280_Sub1_7995 = null;
		if (null != ((Class613) this).aClass274_8004)
			((Class613) this).aClass274_8004.method3681(-1160269511);
		if (null != ((Class613) this).aClass501_8026)
			((Class613) this).aClass501_8026.method5964(-414239420);
		if (null != ((Class613) this).aClass523_8002) {
			((Class613) this).aClass523_8002.aClass545_5849.method6450(-1729936932);
			((Class613) this).aClass523_8002 = null;
		}
	}

	void method7355(Class280_Sub1 class280_sub1, byte[][] is, int i) {
		int i_341_ = is.length;
		for (int i_342_ = 0; i_342_ < i_341_; i_342_++) {
			byte[] is_343_ = is[i_342_];
			if (null != is_343_) {
				RSByteBuffer class572_sub15 = new RSByteBuffer(is_343_);
				int i_344_ = ((Class613) this).anIntArray8015[i_342_] >> 8;
				int i_345_ = ((Class613) this).anIntArray8015[i_342_] & 0xff;
				int i_346_ = i_344_ * 64 - -2109597897 * (((Class613) this).aClass497_8001.localX);
				int i_347_ = 64 * i_345_ - 417324155 * (((Class613) this).aClass497_8001.localY);
				if (!((Class613) this).aBool8020 && null != Class344.audio)
					Class344.audio.method920((short) -16054);
				class280_sub1.method3773(class572_sub15, i_346_, i_347_, ((Class613) this).aClass497_8001.localX * -2109597897, ((Class613) this).aClass497_8001.localY * 417324155, 540981537);
				class280_sub1.method8807(Class272_Sub2.aClass106_9517, class572_sub15, i_346_, i_347_, (byte) -19);
			}
		}
		for (int i_348_ = 0; i_348_ < i_341_; i_348_++) {
			int i_349_ = ((((Class613) this).anIntArray8015[i_348_] >> 8) * 64 - -2109597897 * ((Class613) this).aClass497_8001.localX);
			int i_350_ = ((((Class613) this).anIntArray8015[i_348_] & 0xff) * 64 - ((Class613) this).aClass497_8001.localY * 417324155);
			byte[] is_351_ = is[i_348_];
			if (is_351_ == null && ((Class613) this).anInt7999 * -1483987005 < 800) {
				if (!((Class613) this).aBool8020 && Class344.audio != null)
					Class344.audio.method920((short) 6758);
				class280_sub1.method3768(i_349_, i_350_, 64, 64, 2064070769);
			}
		}
	}

	public int[][] method7356(int i) {
		return ((Class613) this).anIntArrayArray8012;
	}

	void method7357(int i) {
		try {
			Thread.sleep((long) i);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public int method7358() {
		return 100 - (-474907244 * ((Class613) this).anInt8016 / (((Class613) this).anInt8017 * -1606330877));
	}

	public Class613(boolean bool) {
		((Class613) this).aClass497_7997 = new Class497();
		((Class613) this).aClass611_8029 = new Class611(0, 0, 0, 0);
		((Class613) this).anInt8016 = 0;
		((Class613) this).anInt8017 = 1968604331;
		((Class613) this).anInt8019 = 0;
		((Class613) this).anInt8009 = -1683701139;
		((Class613) this).anInt7998 = 0;
		aBool7990 = false;
		((Class613) this).aHashMap8032 = new HashMap();
		((Class613) this).aBool8020 = bool;
	}

	void method7359() {
		int i = ((Class613) this).aByteArrayArray8030.length;
		for (int i_352_ = 0; i_352_ < i; i_352_++) {
			if (null != ((Class613) this).aByteArrayArray8030[i_352_]) {
				int i_353_ = -1;
				for (int i_354_ = 0; i_354_ < 1387212887 * client.anInt8850; i_354_++) {
					if (((Class613) this).anIntArray8015[i_352_] == client.anIntArray8575[i_354_]) {
						i_353_ = i_354_;
						break;
					}
				}
				if (-1 == i_353_) {
					client.anIntArray8575[client.anInt8850 * 1387212887] = ((Class613) this).anIntArray8015[i_352_];
					i_353_ = (client.anInt8850 += -2048083097) * 1387212887 - 1;
				}
				RSByteBuffer class572_sub15 = new RSByteBuffer(((Class613) this).aByteArrayArray8030[i_352_]);
				int i_355_ = 0;
				while ((-1585139053 * class572_sub15.o < ((Class613) this).aByteArrayArray8030[i_352_].length) && i_355_ < 511 && 765313669 * client.anInt8625 < 1023) {
					int i_356_ = i_353_ | i_355_++ << 6;
					int i_357_ = class572_sub15.readUnsignedShort(647518597);
					int i_358_ = i_357_ >> 14;
					int i_359_ = i_357_ >> 7 & 0x3f;
					int i_360_ = i_357_ & 0x3f;
					int i_361_ = (64 * (((Class613) this).anIntArray8015[i_352_] >> 8) - (((Class613) this).aClass497_8001.localX * -2109597897) + i_359_);
					int i_362_ = (i_360_ + (64 * (((Class613) this).anIntArray8015[i_352_] & 0xff) - (((Class613) this).aClass497_8001.localY * 417324155)));
					NPCDefintion class410 = (NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(class572_sub15.readUnsignedShort(647518597), 1267098140));
					LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_356_));
					if (null == class572_sub9 && (class410.aByte4836 & 0x1) > 0 && i_361_ >= 0 && (i_361_ + 358769667 * class410.anInt4792 < 1493989933 * ((Class613) this).anInt8000) && i_362_ >= 0 && (358769667 * class410.anInt4792 + i_362_ < -415841877 * ((Class613) this).anInt8022)) {
						NPC class456_sub1_sub2_sub3_sub1 = (new NPC(((Class613) this).aClass523_8002));
						class456_sub1_sub2_sub3_sub1.anInt11633 = i_356_ * 2118180903;
						LinkableObject class572_sub9_363_ = new LinkableObject(class456_sub1_sub2_sub3_sub1);
						client.aClass676_8622.put(class572_sub9_363_, (long) i_356_);
						client.aClass572_Sub9Array8623[(client.anInt8624 += -123495603) * 617551237 - 1] = class572_sub9_363_;
						client.anIntArray8626[(client.anInt8625 += 1417012813) * 765313669 - 1] = i_356_;
						class456_sub1_sub2_sub3_sub1.anInt11649 = 1226228503 * client.cycles;
						class456_sub1_sub2_sub3_sub1.method10680(class410, (byte) -78);
						class456_sub1_sub2_sub3_sub1.method10525((class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792) * 358769667, (byte) -57);
						class456_sub1_sub2_sub3_sub1.anInt11653 = (-1233753521 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4823) << 3) * -631722783;
						class456_sub1_sub2_sub3_sub1.method10516((class456_sub1_sub2_sub3_sub1.aClass410_11803.aClass661_4846.method7778((byte) 43).getId(1966239453) << 11 & 0x3fff), true, 648650492);
						class456_sub1_sub2_sub3_sub1.method10686(i_358_, i_361_, i_362_, true, class456_sub1_sub2_sub3_sub1.method10556((short) -27351), -785457560);
					}
				}
			}
		}
	}

	void method7360() {
		((Class613) this).aClass569_8023 = ((Class613) this).aClass569_7991;
		method7345(Class65.aClass65_681, 2005517636);
		for (int i = 0; i < 4; i++) {
			for (int i_364_ = 0; i_364_ < ((Class613) this).anInt8000 * 1493989933 >> 3; i_364_++) {
				for (int i_365_ = 0; i_365_ < ((Class613) this).anInt8022 * -415841877 >> 3; i_365_++)
					((Class613) this).anIntArrayArrayArray8014[i][i_364_][i_365_] = -1;
			}
		}
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(1602636545)) {
			int i = class572_sub28.anInt9292 * -2076205737;
			boolean bool = (i & 0x1) == 1;
			int i_366_ = 1104080005 * class572_sub28.anInt9298 >> 3;
			int i_367_ = 1979106429 * class572_sub28.anInt9293 >> 3;
			int i_368_ = class572_sub28.anInt9299 * -1911316627;
			int i_369_ = -1017107655 * class572_sub28.anInt9291;
			int i_370_ = class572_sub28.anInt9295 * 10595425;
			int i_371_ = class572_sub28.anInt9294 * 1786583713;
			int i_372_ = class572_sub28.anInt9297 * 1004939077;
			int i_373_ = 592655707 * class572_sub28.anInt9296;
			int i_374_ = 0;
			int i_375_ = 0;
			int i_376_ = 1;
			int i_377_ = 1;
			if (1 == i) {
				i_375_ = i_372_ - 1;
				i_376_ = -1;
			} else if (i == 2) {
				i_375_ = i_372_ - 1;
				i_374_ = i_373_ - 1;
				i_376_ = -1;
				i_377_ = -1;
			} else if (3 == i) {
				i_374_ = i_373_ - 1;
				i_376_ = 1;
				i_377_ = -1;
			}
			int i_378_ = i_367_;
			while (i_378_ < i_373_ + i_367_) {
				int i_379_ = i_375_;
				int i_380_ = i_366_;
				while (i_380_ < i_366_ + i_372_) {
					if (bool)
						((Class613) this).anIntArrayArrayArray8014[i_371_][i_374_ + i_368_][i_369_ + i_379_] = ((i_378_ << 3) + ((i_380_ << 14) + (i_370_ << 24)) + (i << 1));
					else
						((Class613) this).anIntArrayArrayArray8014[i_371_][i_368_ + i_379_][i_374_ + i_369_] = (i << 1) + ((i_370_ << 24) + (i_380_ << 14) + (i_378_ << 3));
					i_380_++;
					i_379_ += i_376_;
				}
				i_378_++;
				i_374_ += i_377_;
			}
		}
		int i = -300026841 * client.anInt8577;
		((Class613) this).anIntArray8015 = new int[i];
		((Class613) this).anIntArray8018 = new int[i];
		((Class613) this).aByteArrayArray8024 = new byte[i][];
		((Class613) this).aByteArrayArray8025 = new byte[i][];
		((Class613) this).aByteArrayArray8030 = null;
		((Class613) this).aByteArrayArray8027 = new byte[i][];
		((Class613) this).aByteArrayArray8028 = new byte[i][];
		i = 0;
		for (Class572_Sub28 class572_sub28 = ((Class572_Sub28) Class122.aClass675_1482.method7932((byte) 50)); null != class572_sub28; class572_sub28 = (Class572_Sub28) Class122.aClass675_1482.method7926(1113690856)) {
			int i_381_ = class572_sub28.anInt9298 * 1104080005 >>> 3;
			int i_382_ = 1979106429 * class572_sub28.anInt9293 >>> 3;
			int i_383_ = i_381_ + class572_sub28.anInt9297 * 1004939077;
			if ((i_383_ & 0x7) == 0)
				i_383_--;
			i_383_ >>>= 3;
			int i_384_ = i_382_ + class572_sub28.anInt9296 * 592655707;
			if (0 == (i_384_ & 0x7))
				i_384_--;
			i_384_ >>>= 3;
			for (int i_385_ = i_381_ >>> 3; i_385_ <= i_383_; i_385_++) {
				while_19_: for (int i_386_ = i_382_ >>> 3; i_386_ <= i_384_; i_386_++) {
					int i_387_ = i_385_ << 8 | i_386_;
					for (int i_388_ = 0; i_388_ < i; i_388_++) {
						if (i_387_ == ((Class613) this).anIntArray8015[i_388_])
							continue while_19_;
					}
					if (Class630.aClass248_8114.method3365(method7286(i_385_, i_386_, (byte) -68), Class269.aClass269_2854.anInt2856 * -609065221, -2076349535)) {
						((Class613) this).anIntArray8015[i] = i_387_;
						((Class613) this).anIntArray8018[i] = method7286(i_385_, i_386_, (byte) -48);
						i++;
					}
				}
			}
		}
		((Class613) this).anInt7998 = -47847863 * i;
		method7322(1493989933 * ((Class613) this).anInt8000 >> 4, ((Class613) this).anInt8022 * -415841877 >> 4, 18, false, (short) -3741);
	}

	static final void method7361(Cs2Executor class441, byte i) {
		int i_389_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class111.aClass244_1428.method3345(i_389_, 626381579).method10419((byte) -64);
	}

	static final void method7362(Cs2Executor class441, int i) {
		int i_390_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class572_Sub40.method8780((char) i_390_, -1493246322) ? 1 : 0;
	}

	public static void method7363(byte i) {
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub1_9235), 2, 1331352243);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub1_9201), 2, 798461288);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub28_9218), 1, 699222867);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub23_9208), 1, 1433603945);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub26_9240), 1, 1913936452);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub14_9215), 1, 1481907349);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub5_9248), 1, 1251692035);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub12_9230), 1, 1558987617);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub24_9221), 1, 2133355603);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub13_9220), 1, 599467169);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub35_9233), 0, 1999849858);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub11_9219), 1, 607699107);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub2_9247), 0, 1613664811);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub2_9203), 0, 570322298);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub4_9200), 1, 1264182094);
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub29_9212, -148076679 * Class65.aClass65_681.anInt684, 756137360);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub21_9210), 0, 1645023534);
		if (null != Class272_Sub2.aClass106_9517 && Class272_Sub2.aClass106_9517.method1675() && Class272_Sub2.aClass106_9517.method1786())
			Class272_Sub2.aClass106_9517.method1785();
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub31_9228), 1, 1757804055);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub32_9202), 1, 993480777);
		Class289.method3921((short) -17055);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub7_9227), 1, 587196767);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub19_9237), 3, 553988954);
		Exception_Sub2.method10186(1931448410);
		client.aClass613_8605.method7306(-1042067865).method5981((byte) 32);
		client.aBool8599 = true;
	}

	static final void method7364(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_391_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class225.method3152(i_391_, bool, (byte) -14);
	}
}

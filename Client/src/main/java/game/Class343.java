package game;

/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;

public class Class343 {
	public int anInt4359;
	public byte aByte4360;
	public String aString4361;

	Class343() {
		/* empty */
	}

	static final void method4298(Cs2Executor class441, byte i) {
		if ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1)
			((Cs2Executor) class441).instrPtr += ((((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]) * -1866055967);
	}

	static final void method4299(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 0;
	}

	static void method4300(long[] ls, int[] is, int i, int i_0_, int i_1_) {
		if (i < i_0_) {
			int i_2_ = (i_0_ + i) / 2;
			int i_3_ = i;
			long l = ls[i_2_];
			ls[i_2_] = ls[i_0_];
			ls[i_0_] = l;
			int i_4_ = is[i_2_];
			is[i_2_] = is[i_0_];
			is[i_0_] = i_4_;
			int i_5_ = 9223372036854775807L == l ? 0 : 1;
			for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
				if (ls[i_6_] < (long) (i_6_ & i_5_) + l) {
					long l_7_ = ls[i_6_];
					ls[i_6_] = ls[i_3_];
					ls[i_3_] = l_7_;
					int i_8_ = is[i_6_];
					is[i_6_] = is[i_3_];
					is[i_3_++] = i_8_;
				}
			}
			ls[i_0_] = ls[i_3_];
			ls[i_3_] = l;
			is[i_0_] = is[i_3_];
			is[i_3_] = i_4_;
			method4300(ls, is, i, i_3_ - 1, -2146734991);
			method4300(ls, is, i_3_ + 1, i_0_, -964912680);
		}
	}

	static final void method4301(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class286.method3868(class73, class83, class441, -1899316808);
	}

	static final void method4302(int i, int i_9_, int i_10_, int i_11_, boolean bool, byte i_12_) {
		if (client.aClass613_8605.method7285(1971061836) == null)
			Class272_Sub2.aClass106_9517.method1720(i, i_9_, i_10_, i_11_, -16777216, (byte) -95);
		else {
			Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
			boolean bool_13_ = false;
			if (client.anInt8646 * 1797623853 != 0) {
				if (!client.aBool8647)
					bool_13_ = true;
			} else {
				if ((int) class240.aFloat2653 < 0 || ((int) class240.aFloat2653 >= client.aClass613_8605.method7347(-740581830) * 512) || (int) class240.aFloat2657 < 0 || ((int) class240.aFloat2657 >= client.aClass613_8605.method7278(277214477) * 512))
					bool_13_ = true;
				if (Class18.anInt143 * 625220759 == 1 && !Class133_Sub1.aClass411_Sub1_9827.method5034((byte) 86))
					bool_13_ = true;
			}
			if (bool_13_)
				Class272_Sub2.aClass106_9517.method1720(i, i_9_, i_10_, i_11_, -16777216, (byte) -125);
			else {
				client.anInt8699 += -676221455;
				if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != null && ((int) class240.aFloat2653 - (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10556((short) -22093) - 1) * 256) >> 9 == Class192.anInt2310 * -1539999119 && (((int) class240.aFloat2657 - (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10556((short) -9332) - 1) * 256) >> 9 == Class192.anInt2300 * -539728943)) {
					Class192.anInt2310 = 3733871;
					Class192.anInt2300 = 343091919;
					Class10.method544((byte) 1);
				}
				Class445.method5337(-237201905);
				if (!bool)
					Class235.method3226(-624840348);
				Class566.method6714(-1565771833);
				for (int i_14_ = 0; i_14_ < client.aClass575Array8594.length; i_14_++) {
					if (null != client.aClass575Array8594[i_14_] && !client.aClass575Array8594[i_14_].method6813(1295954957) && (client.aClass575Array8594[i_14_].method6814(Class272_Sub2.aClass106_9517, -1905823128)))
						client.aClass575Array8594[i_14_].method6816(client.aClass613_8605.method7285(1284318069), (byte) 105);
				}
				InterfaceDefinitions.method1139(i, i_9_, i_10_, i_11_, true, (byte) 46);
				i = client.anInt8855 * 759890131;
				i_9_ = -393638955 * client.anInt8590;
				i_10_ = client.anInt8821 * 199182677;
				i_11_ = client.anInt8804 * 1460163483;
				Class175.method2756(i, i_9_, -1034419750);
				if (625220759 * Class18.anInt143 == 4) {
					int i_15_ = (int) client.aFloat8822;
					if (client.anInt8686 * -171256967 >> 8 > i_15_)
						i_15_ = -171256967 * client.anInt8686 >> 8;
					if (client.aBoolArray8842[4] && 128 + client.anIntArray8848[4] > i_15_)
						i_15_ = 128 + client.anIntArray8848[4];
					int i_16_ = (((int) client.aFloat8678 + client.anInt8665 * -706438965) & 0x3fff);
					Class246.method3359(Entity.anInt11674 * 1007135537, (Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, Class274.anInt2911 * -374189215, -2063621494) - client.anInt8684 * 1915481369), Class165.anInt2050 * -1126693191, i_15_, i_16_, 600 + (i_15_ >> 3) * 3 << 2, i_11_, -1798877514);
				} else if (6 == Class18.anInt143 * 625220759) {
					int i_17_ = (int) client.aFloat8822;
					if (-171256967 * client.anInt8686 >> 8 > i_17_)
						i_17_ = client.anInt8686 * -171256967 >> 8;
					if (client.aBoolArray8842[4] && 128 + client.anIntArray8848[4] > i_17_)
						i_17_ = client.anIntArray8848[4] + 128;
					int i_18_ = (int) client.aFloat8678 & 0x3fff;
					Class246.method3359(Entity.anInt11674 * 1007135537, (Class314.method4072(325769767 * client.anInt8675, -1702297057 * client.anInt8792, Class274.anInt2911 * -374189215, -1808650936) - client.anInt8684 * 1915481369), -1126693191 * Class165.anInt2050, i_17_, i_18_, (i_17_ >> 3) * 3 + 600 << 2, i_11_, -2058613347);
				} else if (Class18.anInt143 * 625220759 == 2)
					Class371.method4607(i_11_, -1619636191);
				int i_19_ = Class36.anInt387 * 386814715;
				int i_20_ = Class572_Sub13_Sub2.anInt11451 * -1094666305;
				int i_21_ = Class49.anInt490 * -999214779;
				int i_22_ = 1406555935 * Class455.anInt5187;
				int i_23_ = 426389501 * Class406.anInt4765;
				for (int i_24_ = 0; i_24_ < 5; i_24_++) {
					if (client.aBoolArray8842[i_24_]) {
						int i_25_ = (int) ((Math.random() * (double) (2 * (client.anIntArray8843[i_24_]) + 1)) - (double) client.anIntArray8843[i_24_] + (Math.sin((double) (client.anIntArray8597[i_24_]) * ((double) (client.anIntArray8741[i_24_]) / 100.0)) * (double) (client.anIntArray8848[i_24_])));
						if (i_24_ == 0)
							Class36.anInt387 += (i_25_ << 2) * 70707251;
						if (i_24_ == 1)
							Class572_Sub13_Sub2.anInt11451 += (i_25_ << 2) * -371247041;
						if (2 == i_24_)
							Class49.anInt490 += (i_25_ << 2) * -114706035;
						if (i_24_ == 3)
							Class406.anInt4765 = (1259382101 * (i_25_ + 426389501 * Class406.anInt4765 & 0x3fff));
						if (i_24_ == 4) {
							Class455.anInt5187 += 58615007 * i_25_;
							if (Class455.anInt5187 * 1406555935 < 1024)
								Class455.anInt5187 = -107774976;
							else if (1406555935 * Class455.anInt5187 > 3072)
								Class455.anInt5187 = -323324928;
						}
					}
				}
				if (Class36.anInt387 * 386814715 < 0)
					Class36.anInt387 = 0;
				if (Class36.anInt387 * 386814715 > ((client.aClass613_8605.method7285(1990448528).anInt5833 * -1396185127) << 9) - 1)
					Class36.anInt387 = (((client.aClass613_8605.method7285(1594816239).anInt5833) * -1396185127 << 9) - 1) * 70707251;
				if (-999214779 * Class49.anInt490 < 0)
					Class49.anInt490 = 0;
				if (-999214779 * Class49.anInt490 > ((client.aClass613_8605.method7285(1480123853).anInt5834 * -1519623925) << 9) - 1)
					Class49.anInt490 = (((client.aClass613_8605.method7285(1984533531).anInt5834) * -1519623925 << 9) - 1) * -114706035;
				Class471.method5564((byte) 0);
				Class272_Sub2.aClass106_9517.method2004(i, i_9_, i_10_, i_11_);
				Class272_Sub2.aClass106_9517.method1717(true);
				Class272_Sub2.aClass106_9517.method1715(i, i_9_, i + i_10_, i_11_ + i_9_);
				Class472 class472 = client.aClass613_8605.method7306(-1042067865).method5957(1941635118);
				int i_26_ = class472.method5573((byte) 3);
				Class403 class403 = new Class403();
				Class497 class497 = client.aClass613_8605.method7280((byte) -1);
				if (IncomingPacket.method4113((byte) -101))
					Class24.aClass411_Sub1_158.method5027(class403, client.aClass261_8582, client.aClass250_8581, class497.localX * -2109597897 << 9, class497.localY * 417324155 << 9, -217871041);
				else if (1 == 625220759 * Class18.anInt143)
					Class133_Sub1.aClass411_Sub1_9827.method5027(class403, client.aClass261_8582, client.aClass250_8581, class497.localX * -2109597897 << 9, class497.localY * 417324155 << 9, -217871041);
				else {
					client.aClass261_8582.method3588((float) -(Class36.anInt387 * 386814715), (float) -(-1094666305 * Class572_Sub13_Sub2.anInt11451), (float) -(Class49.anInt490 * -999214779));
					client.aClass261_8582.method3576(0.0F, -1.0F, 0.0F, Class325.method4146(-(426389501 * Class406.anInt4765) & 0x3fff));
					client.aClass261_8582.method3576(-1.0F, 0.0F, 0.0F, Class325.method4146(-(1406555935 * Class455.anInt5187) & 0x3fff));
					client.aClass261_8582.method3576(0.0F, 0.0F, -1.0F, Class325.method4146(-(-1744889819 * Class88.anInt1225) & 0x3fff));
					Class6.method494(client.aClass250_8581, true, (float) (i_10_ / 2), (float) (i_11_ / 2), (float) (client.anInt8859 * -694980833 << 1), (float) (client.anInt8859 * -694980833 << 1), i_10_, i_11_, -895942855);
				}
				Class272_Sub2.aClass106_9517.method1761(client.aClass261_8582);
				Class272_Sub2.aClass106_9517.method1764(client.aClass250_8581);
				if (class472.method5568((byte) -76) != null) {
					Class272_Sub2.aClass106_9517.method1709(1.0F);
					Class272_Sub2.aClass106_9517.method1767(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					if (625220759 * Class18.anInt143 == 1) {
						int i_27_ = (int) ((double) Class133_Sub1.aClass411_Sub1_9827.method4999(-368628687) * 2607.5945876176133);
						int i_28_ = (int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133);
						class472.method5568((byte) -69).method6854(Class272_Sub2.aClass106_9517, Class190.anInt2246 * -960906585 << 3, i, i_9_, i_10_, i_11_, i_27_, i_28_, 0, i_26_, true, false, -1726244689);
					} else
						class472.method5568((byte) -12).method6854(Class272_Sub2.aClass106_9517, Class190.anInt2246 * -960906585 << 3, i, i_9_, i_10_, i_11_, Class455.anInt5187 * 1406555935, 426389501 * Class406.anInt4765, Class88.anInt1225 * -1744889819, i_26_, true, false, -1726244689);
					Class272_Sub2.aClass106_9517.method1747();
				} else
					Class272_Sub2.aClass106_9517.method1719(3, i_26_);
				Class272_Sub2.aClass106_9517.method1717(false);
				Class278.method3754(client.aClass261_8582, client.aClass250_8581, i_10_, i_11_, (byte) 3);
				client.aClass613_8605.method7306(-1042067865).method5978(client.aClass613_8605, 666397293);
				byte i_29_ = (Class213.aClass572_Sub24_2463.aClass665_Sub1_9201.method8101(-790894403) == 2 ? (byte) (client.anInt8699 * 2074321681) : (byte) 1);
				if (IncomingPacket.method4113((byte) -31) || 625220759 * Class18.anInt143 == 1)
					client.aClass613_8605.method7285(1098911112).method6240(client.cycles, 2095151347 * class403.anInt4748, -1940941519 * class403.anInt4747, class403.anInt4749 * -101352869, client.aClass613_8605.method7346((byte) 2), client.anIntArray8701, client.anIntArray8716, client.anIntArray8717, client.anIntArray8718, client.anIntArray8719, 1 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), i_29_, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, Class213.aClass572_Sub24_2463.aClass665_Sub14_9215.method8241((byte) 6) == 0, true, 0, true);
				else
					client.aClass613_8605.method7285(2030280078).method6240(client.cycles, Class36.anInt387 * 386814715, Class572_Sub13_Sub2.anInt11451 * -1094666305, Class49.anInt490 * -999214779, client.aClass613_8605.method7346((byte) 96), client.anIntArray8701, client.anIntArray8716, client.anIntArray8717, client.anIntArray8718, client.anIntArray8719, 1 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009), i_29_, (int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, Class213.aClass572_Sub24_2463.aClass665_Sub14_9215.method8241((byte) 6) == 0, true, 0, true);
				client.anInt8620 += 302694541;
				if (!Class272_Sub2.aClass106_9517.method1778() && 1 == client.anInt8580 * 835742603)
					Class97.method1566(i, i_9_, i_10_, i_11_, (byte) -17);
				client.aClass613_8605.method7285(1464501983).method6253((short) -23134);
				Class36.anInt387 = 70707251 * i_19_;
				Class572_Sub13_Sub2.anInt11451 = -371247041 * i_20_;
				Class49.anInt490 = i_21_ * -114706035;
				Class455.anInt5187 = i_22_ * 58615007;
				Class406.anInt4765 = 1259382101 * i_23_;
				if (client.aBool8586 && Class51.aClass278_491.method3728(-1838840178) == 0)
					client.aBool8586 = false;
				if (client.aBool8586) {
					Class272_Sub2.aClass106_9517.method1720(i, i_9_, i_10_, i_11_, -16777216, (byte) -61);
					Class677.method7987((Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)), false, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 1298300282);
				}
				Class6.method494(client.aClass250_8581, false, (float) (i_10_ / 2 + i), (float) (i_11_ / 2 + i_9_), (float) (client.anInt8859 * -694980833 << 1), (float) (-694980833 * client.anInt8859 << 1), i_10_, i_11_, 1617098135);
				Class272_Sub2.aClass106_9517.method1764(client.aClass250_8581);
				Class538.method6400(client.aClass250_8581, -2090855651);
			}
		}
	}

	static Class572_Sub12_Sub5 method4303(Class248 idx23, int i, byte i_30_) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(idx23.getFile(0, i, 190408229));
		return Class53.decodeMap(class572_sub15, i, 1257542736);
	}

	public static Class661[] method4304(int i) {
		return (new Class661[] { Class661.aClass661_8443, Class661.aClass661_8445, Class661.aClass661_8450, Class661.aClass661_8448, Class661.aClass661_8452, Class661.aClass661_8444,
			Class661.aClass661_8447, Class661.aClass661_8449 });
	}

	public static File method4305(String string, int i) {
		if (!Class587.aBool7780)
			throw new RuntimeException("");
		File file = (File) Class587.aHashtable7781.get(string);
		if (null != file)
			return file;
		File file_31_ = new File(Class91.aFile1236, string);
		RandomAccessFile randomaccessfile = null;
		File file_32_;
		try {
			File file_33_ = new File(file_31_.getParent());
			if (!file_33_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_31_, "rw");
			int i_34_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_34_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			Class587.aHashtable7781.put(string, file_31_);
			file_32_ = file_31_;
		} catch (Exception exception) {
			try {
				if (randomaccessfile != null) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_35_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_32_;
	}
}

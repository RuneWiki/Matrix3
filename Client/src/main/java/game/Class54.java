package game;

/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class54 {
	Class127 aClass127_493;
	static final int anInt494 = 16384;
	static final int anInt495 = 16384;
	Class603 aClass603_496;
	HashMap idx40audio;
	static final int anInt498 = 4096;
	int currentMusicId;
	boolean ready;
	List aList501 = new ArrayList();
	List aList502 = new ArrayList();
	HashMap idx14audio = new HashMap();
	Interface70 anInterface70_504;
	List aList505;
	Class127 aClass127_506;
	Class127 aClass127_507;
	static final int anInt508 = 4096;
	int anInt509;
	Class240 aClass240_510;
	HashMap aHashMap511;
	int anInt512;
	Class603 aClass603_513;
	Interface70 anInterface70_514;
	boolean aBool515;
	int anInt516;
	static final int anInt517 = 0;
	boolean aBool518;
	static final int anInt519 = 8192;
	static final int anInt520 = 8192;
	Interface70 anInterface70_521;
	Interface70 anInterface70_522;
	public static Class161 aClass161_523;

	List method918(int i) {
		return aList505;
	}

	public void method919(int i, int i_0_) {
		Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
		if (class43 != null) {
			List list = class43.method821(-1213088143);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				class603.method7098(50, -1110366939);
			}
		}
	}

	public Class54() {
		idx40audio = new HashMap();
		aList505 = new ArrayList();
		aHashMap511 = new HashMap();
		aClass603_496 = null;
		aBool515 = false;
		anInterface70_504 = new Class111(this);
		anInterface70_514 = new Class128(this);
		anInterface70_521 = new Class109(this);
		anInterface70_522 = new Class129(this);
	}

	public void method920(short i) {
		if (ready) {
			if (Class465.aClass289_5235 != null)
				Class465.aClass289_5235.method3887((byte) 19);
			if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != null && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394() != null)) {
				if (null == aClass240_510)
					aClass240_510 = new Class240();
				aClass240_510.aFloat2653 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647.aFloat2653);
				aClass240_510.aFloat2656 = 0.0F;
				aClass240_510.aFloat2657 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647.aFloat2657);
			}
			Iterator iterator = idx14audio.values().iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				interface58.method150(-1852493599);
			}
			iterator = idx40audio.values().iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				interface58.method150(-622657078);
			}
			iterator = aList505.iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				if (interface58.method342(375475754))
					idx40audio.remove(Integer.valueOf(interface58.method335((byte) 12)));
				else
					idx14audio.remove(Integer.valueOf(interface58.method335((byte) 12)));
			}
			aList505.clear();
			if (null != aClass603_496 && (aClass603_496.method7129(1458710022) == Class595.aClass595_7827) && false == aBool515 && null != client.aClass195_8589.aClass650_2340 && Class435.method5266(client.anInt8580 * 835742603, (byte) -21)) {
				Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3715, client.aClass195_8589.aClass650_2340, 457646605);
				class572_sub25.aRsByteBuffer.writeInt(aClass603_496.method7103(-1957611308).method335((byte) 12), -1743753997);
				client.aClass195_8589.method2929(class572_sub25, (byte) -47);
				aBool515 = true;
			}
			iterator = aList501.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				class603.method7117((byte) 94);
				class603.method7097(-1741346143);
				Class595 class595 = class603.method7129(780670600);
				if (class603.method7119(-1801674739) == this) {
					if (class595 == Class595.aClass595_7830 || class595 == Class595.aClass595_7831) {
						if ((class603.method7115((short) 355) == Class124.aClass124_1495) || (class603.method7115((short) 355) == Class124.aClass124_1500)) {
							if (aClass603_496 == class603) {
								aBool515 = false;
								aClass603_496 = null;
								class603.method7131(2058364529);
								aList502.remove(class603);
							} else {
								int i_1_ = class603.method7103(-848192969).method335((byte) 12);
								boolean bool = (method928(Class126.aClass126_1514.method2215(275634048), -779052415) > 0.0F);
								if (!aBool518 && bool) {
									if (i_1_ == -1530742551 * (anInt512)) {
										method984(i_1_, 1549159490);
										anInt512 = -44932953;
									}
									class603.method7131(1783172984);
									aList502.remove(class603);
								} else if ((anInt516 * -2055433909) == i_1_) {
									anInt516 = -1827237987;
									aBool518 = false;
									class603.method7131(1206553403);
									aList502.remove(class603);
									Iterator iterator_2_ = aList501.iterator();
									while (iterator_2_.hasNext()) {
										Class603 class603_3_ = (Class603) iterator_2_.next();
										if (class603_3_.method7115((short) 355) == Class124.aClass124_1495) {
											int i_4_ = class603_3_.method7103(1661288745).method335((byte) 12);
											if (((anInt512 * -1530742551) == i_4_ && ((class603_3_.method7129(-452483903)) == (Class595.aClass595_7830))) || (class603_3_.method7129(127921023) == Class595.aClass595_7825) || (class603_3_.method7129(-235846621) == Class595.aClass595_7826) || ((class603_3_.method7129(-1615776663)) == (Class595.aClass595_7827))) {
												if ((class603_3_.method7129(-1578536135)) == Class595.aClass595_7830)
													class603_3_.method7118(782709624);
												else
													class603_3_.method7140(-357673337);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool518 || i_1_ != (anInt512 * -1530742551)) {
										class603.method7131(1676260789);
										aList502.remove(class603);
									}
									if (false == aBool518 && -1530742551 * (anInt512) == i_1_) {
										anInt512 = -44932953;
										aClass603_513 = null;
									}
								}
							}
						} else {
							Iterator iterator_5_ = aHashMap511.keySet().iterator();
							while (iterator_5_.hasNext()) {
								int i_6_ = ((Integer) iterator_5_.next()).intValue();
								Class43 class43 = ((Class43) aHashMap511.get(Integer.valueOf(i_6_)));
								if (class43.method821(-1995022955).contains(class603)) {
									class43.method819(class603, 653791046);
									break;
								}
							}
							class603.method7131(2013131014);
							aList502.remove(class603);
						}
					} else if ((class603.method7129(-709400523) != Class595.aClass595_7829) && (class603.method7106(-659329613) == Class126.aClass126_1514.method2215(497569425))) {
						boolean bool = (method928(Class126.aClass126_1514.method2215(234499193), -2063445031) > 1.0E-4F);
						if (!bool)
							class603.method7098(150, -1110366939);
					}
				}
			}
		}
	}

	public void method921(byte i) {
		Class481.method5739((byte) 48);
	}

	public void method922(int i, byte i_7_) {
		Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
		if (class43 != null) {
			List list = class43.method821(-1274693494);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				if (!class603.method7116((byte) -94))
					class603.method7140(683459334);
			}
		}
	}

	public void method923(int i, int i_8_, int i_9_) {
		if (!ready) {
			anInt509 = i * -1051351007;
			aClass127_506 = new Class127(i_8_, 100);
			aClass127_507 = new Class127(10);
			aClass127_506.method2226(new Class125(this), -1126532727);
			Class469 class469 = new Class469(Class296.aClass296_3465);
			Class545.method6452(class469, 1595351013);
			method925(1108521665);
			anInt512 = -44932953;
			ready = true;
		}
	}

	public void method924(int i, byte i_10_) {
		Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
		if (class43 != null) {
			List list = class43.method821(-917908292);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				class603.method7126(-730329351);
			}
		}
	}

	//setup volume
	void method925(int i) {
		Class110 class110 = new Class110(this);
		MusicVolume class123 = new MusicVolume(this);
		Class52 class52 = new Class52(this);
		Class53 class53 = new Class53(this);
		Class48 class48 = new Class48(this);

		Class2.method474(Class112.aClass112_1430.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 0.2F, class110, -1876454385);

		//music here
		Class2.method474(Class112.music.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class123, -1965052374);

		Class2.method474(Class112.aClass112_1432.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class52, -1934524636);
		Class2.method474(Class112.aClass112_1435.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 0.8F, class53, -1965331169);
		Class2.method474(Class112.aClass112_1434.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class48, -1698626395);

		Class2.method474(Class126.aClass126_1514.method2215(-698106180), Class112.music.method2083((short) 362), 1.0F, null, -2113268990);
		Class2.method474(Class126.aClass126_1511.method2215(-1299084177), Class112.aClass112_1434.method2083((short) 362), 1.0F, null, -1703122549);
		Class2.method474(Class126.aClass126_1509.method2215(-1634116891), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1459288057);
		Class2.method474(Class126.aClass126_1512.method2215(523509972), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1493518156);
		Class2.method474(Class126.aClass126_1513.method2215(-1708642419), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1694830466);
		Class2.method474(Class126.aClass126_1519.method2215(-1368573002), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1646940998);
		Class2.method474(Class126.aClass126_1515.method2215(450308656), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1446253837);
		Class2.method474(Class126.aClass126_1516.method2215(-504156043), Class112.aClass112_1435.method2083((short) 362), 1.0F, null, -1444501041);
		Class2.method474(Class126.aClass126_1510.method2215(-1243556050), Class126.aClass126_1516.method2215(-1733519844), 1.0F, null, -1485139258);
		Class2.method474(Class126.aClass126_1517.method2215(46609396), Class126.aClass126_1516.method2215(375385954), 1.0F, null, -1872140429);
		Class523.method6293(Class126.aClass126_1514.method2215(-1989907285), -1208661048).method4612(0.75F, (byte) 119);
	}

	public void setCurrentMusicId(int i, int i_11_) {
		currentMusicId = i * -114760015;
	}

	public void method927(int i, int i_12_, int i_13_) {
		Class374 class374 = Class523.method6293(i, -1208661048);
		if (class374 != null) {
			float f = 1.5258789E-5F * (float) i_12_;
			class374.method4612(f, (byte) 52);
		}
	}

	float method928(int i, int i_14_) {
		Class374 class374 = Class523.method6293(i, -1208661048);
		float f = 1.0F;
		for (/**/; null != class374; class374 = class374.method4611(1607049725))
			f *= class374.method4616(188885241);
		return f;
	}

	void method929(int[] is, byte i) {
		if (ready && is != null) {
			int[] is_15_ = is;
			for (int i_16_ = 0; i_16_ < is_15_.length; i_16_++) {
				int i_17_ = is_15_[i_16_];
				method933(i_17_, 1837396790);
			}
		}
	}

	List method930(byte i) {
		return aList502;
	}

	Interface58 method931(int i, boolean bool, byte i_18_) {
		if (!ready)
			return null;
		Interface58 interface58 = ((Interface58) (bool ? aClass127_507.method2246((long) i) : aClass127_506.method2246((long) i)));
		if (interface58 == null) {
			if (bool)
				interface58 = (Interface58) idx40audio.get(Integer.valueOf(i));
			else
				interface58 = (Interface58) idx14audio.get(Integer.valueOf(i));
		}
		return interface58;
	}

	Interface58 method932(int i, boolean bool, int i_19_) {
		if (!ready)
			return null;
		Interface58 interface58 = method931(i, bool, (byte) 89);
		if (null == interface58) {
			Class36 class36 = new Class36(this);
			interface58 = MusicVolume.method2200((bool ? Class435.idx40 : Class510.idx14), i, class36, bool, aClass127_493, -1623086163);
			if (bool)
				idx40audio.put(Integer.valueOf(i), interface58);
			else
				idx14audio.put(Integer.valueOf(i), interface58);
		}
		return interface58;
	}

	public void method933(int i, int i_20_) {
		if (ready && i >= 0)
			method932(i, false, 573657574);
	}

	public void method934(int i, int i_21_) {
		Iterator iterator = aList502.iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			int i_22_ = class603.method7106(-1131609580);
			boolean bool = Class204.method3014(i_22_, i, 497243082);
			if (bool)
				class603.method7098(50, -1110366939);
		}
	}

	public Class603 method935(Class124 class124, Object object, int i, int i_23_, int i_24_, int i_25_, Class93 class93, float f, float f_26_, Class240 class240, int i_27_, int i_28_, boolean bool, int i_29_) {
		if (!ready)
			return null;
		if (object == null)
			return null;
		i_24_ = Math.max(0, Math.min(i_24_, 255));
		i_28_ = Math.max(0, i_28_);
		if (class93 != Class93.aClass93_1246 && !method941(aClass240_510, class240, f_26_, (byte) -24))
			return null;
		if (i_28_ <= 0)
			i_28_ = 255;
		float f_30_ = (float) i_24_ / 255.0F;
		float f_31_ = (float) i_28_ / 255.0F;
		Interface58 interface58 = method932(i, bool, 573657574);
		Class603 class603 = method949(interface58, (byte) 32);
		if (class603 == null)
			return null;
		class603.method7102(object, 1786783358);
		class603.method7107(i_25_, -1268136275);
		if (class93 != Class93.aClass93_1246) {
			class603.method7108(true, 1254219409);
			class603.method7109(class240, -1661606702);
			class603.method7113(f, (byte) 90);
			class603.method7114(f_26_, -1828316882);
			if (Class93.aClass93_1243 == class93)
				class603.method7100(anInterface70_514, (byte) 26);
			else if (class93 == Class93.aClass93_1245)
				class603.method7100(anInterface70_522, (byte) -63);
			else if (Class93.aClass93_1242 == class93)
				class603.method7100(anInterface70_504, (byte) 28);
			else if (class93 == Class93.aClass93_1244)
				class603.method7100(anInterface70_521, (byte) 111);
			else
				class603.method7108(false, 435267751);
		}
		class603.method7135(f_30_, 0, -1414154185);
		class603.method7122(i_23_ > 1 || i_23_ < 0, i_23_ > 0 ? i_23_ - 1 : i_23_, 1739931174);
		class603.method7120(f_31_, 1411370122);
		class603.method7104(class124, -136720909);
		return class603;
	}

	public void sendSoundEffect(Class124 class124, int soundId, int repeatCount, int volume, int i_34_, Class93 class93, float f, float f_35_, Class240 class240, int i_36_, int i_37_, int delay) {
		if (ready) {
			Class603 class603 = method935(class124, this, soundId, repeatCount, volume, i_34_, class93, f, f_35_, class240, i_36_, i_37_, false, 1899562939);
			if (null != class603) {
				if (delay == 0)
					class603.method7140(-1818399696);
				else
					class603.method7101(delay, false, (byte) -37);
				method958(class603, 852431775);
			}
		}
	}

	public void method937(int i, int i_40_, int i_41_) {
		if (i != -1530742551 * anInt512) {
			if (null != aClass603_496) {
				aClass603_496.method7098(0, -1110366939);
				method958(aClass603_496, -1614297927);
				aClass603_496 = null;
			}
			Class603 class603 = method935(Class124.aClass124_1495, this, i, 0, i_40_, Class126.aClass126_1514.method2215(-1192134512), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, 255, true, 1403499244);
			if (class603 != null) {
				class603.method7126(-730329351);
				aClass603_496 = class603;
			}
			aBool515 = false;
		}
	}

	public int method938(int i) {
		return -1530742551 * anInt512;
	}

	Class240 method939(byte i) {
		return aClass240_510;
	}

	public int method940(int i) {
		return currentMusicId * -737959343;
	}

	boolean method941(Class240 class240, Class240 class240_42_, float f, byte i) {
		Class240 class240_43_ = Class240.method3277(class240_42_, class240);
		if (class240_43_.method3301() >= f)
			return false;
		return true;
	}

	public void sendMusic(int i) {
		sendMusic(i, 255);
	}

	public void sendMusic(int musicId, int volume) {
		sendMusic(musicId, volume, false, 0, 0, 0, 0, 0);
	}

	public void sendMusic(int musicId, int volume, boolean ambient, int plane, int x, int y, int xOffset, int yOffset) {
		if (ready && musicId != -1530742551 * anInt512) {
			Class603 class603 = method970(-1693997382);
			if (null != class603 && (class603.method7103(-1219560580).method335((byte) 12) == musicId)) {
				aClass603_513 = class603;
				anInt512 = (class603.method7103(1727003917).method335((byte) 12) * 44932953);
			} else {
				boolean bool_54_ = false;
				if (-1530742551 * anInt512 >= 0) {
					Iterator iterator = aList502.iterator();
					while (iterator.hasNext()) {
						Class603 class603_55_ = (Class603) iterator.next();
						if (class603_55_.method7115((short) 355) == Class124.aClass124_1495) {
							class603_55_.method7098(2000, -1110366939);
							bool_54_ = true;
						}
					}
				}
				aClass603_513 = null;
				anInt512 = -44932953;
				Class603 class603_56_ = null;
				if (null != aClass603_496 && (aClass603_496.method7103(-122716845) != null) && aClass603_496.method7103(1535433864).method335((byte) 12) == musicId && (aClass603_496.method7129(290479017) == Class595.aClass595_7827)) {
					class603_56_ = aClass603_496;
					aClass603_496 = null;
					aBool515 = false;
				}
				if (null == class603_56_) {
					if (ambient) {
						float f = (float) xOffset;
						float f_57_ = (float) yOffset;
						Class240 class240 = new Class240((float) x, 0.0F, (float) y);
						class603_56_ = method935(Class124.aClass124_1495, this, musicId, 0, bool_54_ ? 0 : volume, ((currentMusicId * -737959343) == musicId ? Class112.aClass112_1432.method2083((short) 362) : Class126.aClass126_1514.method2215(-1052269937)), Class93.aClass93_1244, f, f_57_, class240, plane, 255, true, 194565616);
					} else
						class603_56_ = method935(Class124.aClass124_1495, this, musicId, 0, bool_54_ ? 0 : volume, ((-737959343 * currentMusicId) == musicId ? Class112.aClass112_1432.method2083((short) 362) : Class126.aClass126_1514.method2215(497178602)), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, 255, true, 309913260);
				}
				if (class603_56_ != null) {
					if (false == aBool518) {
						if (bool_54_) {
							float f = (float) volume / 255.0F;
							class603_56_.method7135(f, 2000, -1414154185);
						}
						class603_56_.method7140(-748001798);
					} else if ((class603_56_.method7129(-2020204489).anInt7834 * -1593940065) < (-1593940065 * Class595.aClass595_7827.anInt7834))
						class603_56_.method7126(-730329351);
					method958(class603_56_, -1134757706);
					aClass603_513 = class603_56_;
					anInt512 = 44932953 * musicId;
					if (client.aClass195_8589.aClass650_2340 != null && Class435.method5266(835742603 * client.anInt8580, (byte) -58)) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3715, (client.aClass195_8589.aClass650_2340), 736491062);
						class572_sub25.aRsByteBuffer.writeInt(anInt512 * -1530742551, -1743753997);
						client.aClass195_8589.method2929(class572_sub25, (byte) -119);
					}
				}
			}
		}
	}

	public void method945(int i) {
		Iterator iterator = aList502.iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			if (class603.method7115((short) 355) == Class124.aClass124_1495) {
				class603.method7098(500, -1110366939);
				if (class603.method7103(1618425421).method335((byte) 12) == -1530742551 * anInt512) {
					method984(-1530742551 * anInt512, 629497775);
					break;
				}
			}
		}
		aClass603_513 = null;
		anInt512 = -44932953;
	}

	public void method946() {
		Class481.method5739((byte) 48);
	}

	public void method947(AnimationDefinition class132, int i, Class456_Sub1 class456_sub1, int i_58_) {
		if (null != class132 && null != class132.anIntArrayArray1550 && i < class132.anIntArrayArray1550.length && null != class132.anIntArrayArray1550[i] && (class456_sub1.aByte9009 == Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) && class456_sub1.method8309((byte) -28)) {
			int i_59_ = class132.anIntArrayArray1550[i][0];
			int i_60_ = i_59_ >> 8;
			int i_61_ = i_59_ >> 5 & 0x7;
			int i_62_ = i_59_ & 0x1f;
			if (class132.anIntArrayArray1550[i].length > 1) {
				int i_63_ = (int) (Math.random() * (double) (class132.anIntArrayArray1550[i]).length);
				if (i_63_ > 0)
					i_60_ = class132.anIntArrayArray1550[i][i_63_];
			}
			int i_64_ = 256;
			if (null != class132.anIntArray1562 && null != class132.anIntArray1557)
				i_64_ = ((int) (Math.random() * (double) (class132.anIntArray1557[i] - class132.anIntArray1562[i])) + class132.anIntArray1562[i]);
			int i_65_ = (class132.anIntArray1541 == null ? 255 : class132.anIntArray1541[i]);
			if (i_62_ == 0) {
				if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == class456_sub1)
					sendSoundEffect(Class124.aClass124_1502, i_60_, i_61_, i_65_, Class126.aClass126_1512.method2215(-156987948), Class93.aClass93_1246, 0.0F, 0.0F, null, class456_sub1.aByte9009, i_64_, 0);
			} else {
				if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == class456_sub1) {
					if (Class213.aClass572_Sub24_2463.aClass665_Sub15_9243.method8970(660014728) == 0)
						return;
				} else if (Class213.aClass572_Sub24_2463.aClass665_Sub15_9244.method8970(660014728) == 0)
					return;
				if (-1 != class132.anInt1551 * 311512121) {
					int i_66_ = 0;
					if (class456_sub1 instanceof Entity)
						i_66_ = ((Entity) class456_sub1).method10541(2101071067);
					else if (class456_sub1 instanceof Class456_Sub1_Sub2_Sub4)
						i_66_ = ((Class456_Sub1_Sub2_Sub4) class456_sub1).method10595(-511257707);
					else if (class456_sub1 instanceof Class456_Sub1_Sub2_Sub5)
						i_66_ = ((Class456_Sub1_Sub2_Sub5) class456_sub1).method10635((byte) -75);
					if (i_66_ != 0 && i_66_ != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10541(1882641337) && i_66_ != -847550693 * client.anInt8576) {
						i_65_ = class132.anInt1551 * 311512121 * i_65_ / 100;
						if (i_65_ < 0)
							i_65_ = 0;
						else if (i_65_ > 255)
							i_65_ = 255;
					}
				}
				Class240 class240 = class456_sub1.method5394().aClass240_2647;
				int i_67_ = (int) class240.aFloat2653 - 256 >> 9;
				int i_68_ = (int) class240.aFloat2657 - 256 >> 9;
				Class240 class240_69_ = new Class240((float) (i_67_ << 9), 0.0F, (float) (i_68_ << 9));
				int i_70_ = class456_sub1.aByte9009 << 24;
				sendSoundEffect(Class124.aClass124_1501, i_60_, i_61_, i_65_, Class126.aClass126_1513.method2215(-1046565385), ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != class456_sub1) ? Class93.aClass93_1242 : Class93.aClass93_1246), 0.0F, (float) (i_62_ << 9), class240_69_, i_70_, i_64_, 0);
			}
		}
	}

	public void method948(AnimationDefinition class132, int i, int i_71_) {
		if (class132 != null && null != class132.anIntArrayArray1550 && i < class132.anIntArrayArray1550.length && class132.anIntArrayArray1550[i] != null) {
			int i_72_ = class132.anIntArrayArray1550[i][0];
			int i_73_ = i_72_ >> 8;
			int i_74_ = i_72_ >> 5 & 0x7;
			if (class132.anIntArrayArray1550[i].length > 1) {
				int i_75_ = (int) (Math.random() * (double) (class132.anIntArrayArray1550[i]).length);
				if (i_75_ > 0)
					i_73_ = class132.anIntArrayArray1550[i][i_75_];
			}
			int i_76_ = 256;
			if (class132.anIntArray1562 != null && null != class132.anIntArray1557)
				i_76_ = (int) ((double) class132.anIntArray1562[i] + (Math.random() * (double) (class132.anIntArray1557[i] - class132.anIntArray1562[i])));
			int i_77_ = (class132.anIntArray1541 == null ? 255 : class132.anIntArray1541[i]);
			sendSoundEffect(Class124.aClass124_1504, i_73_, i_74_, i_77_, Class126.aClass126_1513.method2215(-2095464967), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_76_, 0);
		}
	}

	Class603 method949(Interface58 interface58, byte i) {
		if (!ready)
			return null;
		int i_78_ = 0;
		Iterator iterator = aList501.iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			i_78_++;
			if (class603.method7129(-549458645) == Class595.aClass595_7832) {
				class603.method7096(interface58, (byte) 94);
				return class603;
			}
		}
		if (i_78_ >= anInt509 * 1149492193)
			return null;
		Class603 class603 = interface58.method353(-685628402);
		aList501.add(class603);
		return class603;
	}

	public void sendMusicEffect(int effectId, int volume) {
		if (ready && !aBool518) {
			if (volume != 0 && effectId != -1) {
				if (!aBool518 && aClass603_513 != null)
					aClass603_513.method7099(1224741619);
				Class603 class603 = method935(Class124.aClass124_1500, this, effectId, 0, volume, Class126.aClass126_1514.method2215(-832432576), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, 255, true, 1599411778);
				if (null != class603) {
					class603.method7140(557572381);
					method958(class603, -1392563188);
					aBool518 = true;
					anInt516 = 1827237987 * effectId;
				}
			}
		}
	}

	Class127 method951(int i) {
		return aClass127_507;
	}

	public void method952(Class603 class603, int i, int i_81_, byte i_82_) {
		if (class603 != null) {
			Class43 class43 = ((Class43) aHashMap511.get(Integer.valueOf(i)));
			if (class43 == null) {
				class43 = new Class43(this);
				aHashMap511.put(Integer.valueOf(i), class43);
			}
			if (!class43.method820(class603, 1230118018)) {
				class603.method7101(i_81_, true, (byte) 0);
				class43.method818(class603, 501457906);
			}
		}
	}

	public void method953(int i, int i_83_, int i_84_, int i_85_) {
		int i_86_ = Class112.aClass112_1431.method2083((short) 362);
		if (Class523.method6293(i, -1208661048) == null && (i_86_ == i_83_ || Class523.method6293(i_83_, -1208661048) != null)) {
			float f = (float) i_84_ * 1.5258789E-5F;
			Class2.method474(i, i_83_ == i_86_ ? -1 : i_83_, f, null, -2139304264);
		}
	}

	public void method954(int i, int i_87_) {
		if (!ready) {
			anInt509 = i * -1051351007;
			aClass127_506 = new Class127(i_87_, 100);
			aClass127_507 = new Class127(10);
			aClass127_506.method2226(new Class125(this), -171308169);
			Class469 class469 = new Class469(Class296.aClass296_3465);
			Class545.method6452(class469, 467556085);
			method925(585125381);
			anInt512 = -44932953;
			ready = true;
		}
	}

	public void method955(int i, int i_88_) {
		if (!ready) {
			anInt509 = i * -1051351007;
			aClass127_506 = new Class127(i_88_, 100);
			aClass127_507 = new Class127(10);
			aClass127_506.method2226(new Class125(this), -447117910);
			Class469 class469 = new Class469(Class296.aClass296_3465);
			Class545.method6452(class469, -819614125);
			method925(410550183);
			anInt512 = -44932953;
			ready = true;
		}
	}

	public void method956() {
		if (ready) {
			if (Class465.aClass289_5235 != null)
				Class465.aClass289_5235.method3887((byte) 59);
			if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != null && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394() != null)) {
				if (null == aClass240_510)
					aClass240_510 = new Class240();
				aClass240_510.aFloat2653 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647.aFloat2653);
				aClass240_510.aFloat2656 = 0.0F;
				aClass240_510.aFloat2657 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647.aFloat2657);
			}
			Iterator iterator = idx14audio.values().iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				interface58.method150(656654913);
			}
			iterator = idx40audio.values().iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				interface58.method150(-2114234444);
			}
			iterator = aList505.iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				if (interface58.method342(1742969536))
					idx40audio.remove(Integer.valueOf(interface58.method335((byte) 12)));
				else
					idx14audio.remove(Integer.valueOf(interface58.method335((byte) 12)));
			}
			aList505.clear();
			if (null != aClass603_496 && (aClass603_496.method7129(-1762152778) == Class595.aClass595_7827) && false == aBool515 && null != client.aClass195_8589.aClass650_2340 && Class435.method5266(client.anInt8580 * 835742603, (byte) -56)) {
				Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3715, client.aClass195_8589.aClass650_2340, 910819952);
				class572_sub25.aRsByteBuffer.writeInt(aClass603_496.method7103(-2124934242).method335((byte) 12), -1743753997);
				client.aClass195_8589.method2929(class572_sub25, (byte) -58);
				aBool515 = true;
			}
			iterator = aList501.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				class603.method7117((byte) 94);
				class603.method7097(91346838);
				Class595 class595 = class603.method7129(-129131048);
				if (class603.method7119(-1801674739) == this) {
					if (class595 == Class595.aClass595_7830 || class595 == Class595.aClass595_7831) {
						if ((class603.method7115((short) 355) == Class124.aClass124_1495) || (class603.method7115((short) 355) == Class124.aClass124_1500)) {
							if (aClass603_496 == class603) {
								aBool515 = false;
								aClass603_496 = null;
								class603.method7131(1416870368);
								aList502.remove(class603);
							} else {
								int i = class603.method7103(-1167679984).method335((byte) 12);
								boolean bool = (method928(Class126.aClass126_1514.method2215(-1916878197), -1808592504) > 0.0F);
								if (!aBool518 && bool) {
									if (i == (-1530742551 * anInt512)) {
										method984(i, 978991644);
										anInt512 = -44932953;
									}
									class603.method7131(2139990972);
									aList502.remove(class603);
								} else if ((anInt516 * -2055433909) == i) {
									anInt516 = -1827237987;
									aBool518 = false;
									class603.method7131(2112277577);
									aList502.remove(class603);
									Iterator iterator_89_ = aList501.iterator();
									while (iterator_89_.hasNext()) {
										Class603 class603_90_ = (Class603) iterator_89_.next();
										if (class603_90_.method7115((short) 355) == Class124.aClass124_1495) {
											int i_91_ = class603_90_.method7103(1927447716).method335((byte) 12);
											if (((anInt512 * -1530742551) == i_91_ && (class603_90_.method7129(800051515) == (Class595.aClass595_7830))) || ((class603_90_.method7129(-1247173987)) == Class595.aClass595_7825) || ((class603_90_.method7129(-1371254886)) == Class595.aClass595_7826) || (class603_90_.method7129(1484798787) == (Class595.aClass595_7827))) {
												if (class603_90_.method7129(-712536457) == Class595.aClass595_7830)
													class603_90_.method7118(782709624);
												else
													class603_90_.method7140(-504022467);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool518 || i != (anInt512 * -1530742551)) {
										class603.method7131(2101303659);
										aList502.remove(class603);
									}
									if (false == aBool518 && -1530742551 * (anInt512) == i) {
										anInt512 = -44932953;
										aClass603_513 = null;
									}
								}
							}
						} else {
							Iterator iterator_92_ = aHashMap511.keySet().iterator();
							while (iterator_92_.hasNext()) {
								int i = ((Integer) iterator_92_.next()).intValue();
								Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
								if (class43.method821(-1657273654).contains(class603)) {
									class43.method819(class603, 770214161);
									break;
								}
							}
							class603.method7131(1774447314);
							aList502.remove(class603);
						}
					} else if ((class603.method7129(-827753758) != Class595.aClass595_7829) && (class603.method7106(-1215577037) == Class126.aClass126_1514.method2215(-536247958))) {
						boolean bool = (method928(Class126.aClass126_1514.method2215(-2044526368), 1107463351) > 1.0E-4F);
						if (!bool)
							class603.method7098(150, -1110366939);
					}
				}
			}
		}
	}

	public void method957() {
		if (ready) {
			if (Class465.aClass289_5235 != null)
				Class465.aClass289_5235.method3887((byte) 57);
			if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != null && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394() != null)) {
				if (null == aClass240_510)
					aClass240_510 = new Class240();
				aClass240_510.aFloat2653 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647.aFloat2653);
				aClass240_510.aFloat2656 = 0.0F;
				aClass240_510.aFloat2657 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647.aFloat2657);
			}
			Iterator iterator = idx14audio.values().iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				interface58.method150(887815713);
			}
			iterator = idx40audio.values().iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				interface58.method150(1096024994);
			}
			iterator = aList505.iterator();
			while (iterator.hasNext()) {
				Interface58 interface58 = (Interface58) iterator.next();
				if (interface58.method342(-1037215798))
					idx40audio.remove(Integer.valueOf(interface58.method335((byte) 12)));
				else
					idx14audio.remove(Integer.valueOf(interface58.method335((byte) 12)));
			}
			aList505.clear();
			if (null != aClass603_496 && (aClass603_496.method7129(1931124937) == Class595.aClass595_7827) && false == aBool515 && null != client.aClass195_8589.aClass650_2340 && Class435.method5266(client.anInt8580 * 835742603, (byte) -86)) {
				Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3715, client.aClass195_8589.aClass650_2340, -1454840606);
				class572_sub25.aRsByteBuffer.writeInt(aClass603_496.method7103(1580388170).method335((byte) 12), -1743753997);
				client.aClass195_8589.method2929(class572_sub25, (byte) -5);
				aBool515 = true;
			}
			iterator = aList501.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				class603.method7117((byte) 94);
				class603.method7097(-1975221853);
				Class595 class595 = class603.method7129(-1891561761);
				if (class603.method7119(-1801674739) == this) {
					if (class595 == Class595.aClass595_7830 || class595 == Class595.aClass595_7831) {
						if ((class603.method7115((short) 355) == Class124.aClass124_1495) || (class603.method7115((short) 355) == Class124.aClass124_1500)) {
							if (aClass603_496 == class603) {
								aBool515 = false;
								aClass603_496 = null;
								class603.method7131(2004171122);
								aList502.remove(class603);
							} else {
								int i = class603.method7103(-469378288).method335((byte) 12);
								boolean bool = (method928(Class126.aClass126_1514.method2215(151602473), -600845176) > 0.0F);
								if (!aBool518 && bool) {
									if (i == (-1530742551 * anInt512)) {
										method984(i, 1880536997);
										anInt512 = -44932953;
									}
									class603.method7131(1972997057);
									aList502.remove(class603);
								} else if ((anInt516 * -2055433909) == i) {
									anInt516 = -1827237987;
									aBool518 = false;
									class603.method7131(1925254113);
									aList502.remove(class603);
									Iterator iterator_93_ = aList501.iterator();
									while (iterator_93_.hasNext()) {
										Class603 class603_94_ = (Class603) iterator_93_.next();
										if (class603_94_.method7115((short) 355) == Class124.aClass124_1495) {
											int i_95_ = class603_94_.method7103(-1989198659).method335((byte) 12);
											if (((anInt512 * -1530742551) == i_95_ && ((class603_94_.method7129(-500977413)) == (Class595.aClass595_7830))) || (class603_94_.method7129(367610049) == Class595.aClass595_7825) || (class603_94_.method7129(-465397043) == Class595.aClass595_7826) || (class603_94_.method7129(-217458995) == (Class595.aClass595_7827))) {
												if ((class603_94_.method7129(-1870465699)) == Class595.aClass595_7830)
													class603_94_.method7118(782709624);
												else
													class603_94_.method7140(-987015523);
												break;
											}
										}
									}
								} else if (bool) {
									if (!aBool518 || i != (anInt512 * -1530742551)) {
										class603.method7131(1941296396);
										aList502.remove(class603);
									}
									if (false == aBool518 && -1530742551 * (anInt512) == i) {
										anInt512 = -44932953;
										aClass603_513 = null;
									}
								}
							}
						} else {
							Iterator iterator_96_ = aHashMap511.keySet().iterator();
							while (iterator_96_.hasNext()) {
								int i = ((Integer) iterator_96_.next()).intValue();
								Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
								if (class43.method821(-704932723).contains(class603)) {
									class43.method819(class603, 718720894);
									break;
								}
							}
							class603.method7131(1657501452);
							aList502.remove(class603);
						}
					} else if ((class603.method7129(1561684755) != Class595.aClass595_7829) && (class603.method7106(-1144060502) == Class126.aClass126_1514.method2215(178565866))) {
						boolean bool = (method928(Class126.aClass126_1514.method2215(-726580654), -1410783715) > 1.0E-4F);
						if (!bool)
							class603.method7098(150, -1110366939);
					}
				}
			}
		}
	}

	public void method958(Class603 class603, int i) {
		class603.method7102(this, 443032302);
		aList502.add(class603);
	}

	public void method959(int i) {
		Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
		if (class43 != null) {
			List list = class43.method821(-1031961941);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				if (!class603.method7116((byte) -81))
					class603.method7140(962211885);
			}
		}
	}

	public void method960(int i) {
		Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
		if (class43 != null) {
			List list = class43.method821(-1764191320);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				class603.method7098(50, -1110366939);
			}
		}
	}

	public void method961(int i) {
		Class43 class43 = (Class43) aHashMap511.get(Integer.valueOf(i));
		if (class43 != null) {
			List list = class43.method821(-1441829864);
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class603 class603 = (Class603) iterator.next();
				class603.method7098(50, -1110366939);
			}
		}
	}

	public void method964(int i) {
		Iterator iterator = aList502.iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			int i_99_ = class603.method7106(-881463782);
			boolean bool = Class204.method3014(i_99_, i, -955939800);
			if (bool)
				class603.method7098(50, -1110366939);
		}
	}

	public void method965(int i) {
		Iterator iterator = aList502.iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			int i_100_ = class603.method7106(-430905177);
			boolean bool = Class204.method3014(i_100_, i, 1460692946);
			if (bool)
				class603.method7098(50, -1110366939);
		}
	}

	public void method966(int i) {
		if (ready && i >= 0)
			method932(i, false, 573657574);
	}

	public void method967(int i) {
		if (ready && i >= 0)
			method932(i, false, 573657574);
	}

	public void method968(int i) {
		if (ready && i >= 0)
			method932(i, false, 573657574);
	}

	public void method969() {
		Class481.method5739((byte) 48);
	}

	Class603 method970(int i) {
		Iterator iterator = aList502.iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			if (class603.method7115((short) 355) == Class124.aClass124_1495 && class603.method7129(1526125137) == Class595.aClass595_7828)
				return class603;
		}
		return null;
	}

	public void method971(int i, int i_101_) {
		if (i != -1530742551 * anInt512) {
			if (null != aClass603_496) {
				aClass603_496.method7098(0, -1110366939);
				method958(aClass603_496, 400546319);
				aClass603_496 = null;
			}
			Class603 class603 = method935(Class124.aClass124_1495, this, i, 0, i_101_, Class126.aClass126_1514.method2215(-2112718954), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, 255, true, 619143987);
			if (class603 != null) {
				class603.method7126(-730329351);
				aClass603_496 = class603;
			}
			aBool515 = false;
		}
	}

	public int method972() {
		return -1530742551 * anInt512;
	}

	public int method973() {
		return -1530742551 * anInt512;
	}

	public int method974() {
		return -1530742551 * anInt512;
	}

	public void method975(int i) {
		currentMusicId = i * -114760015;
	}

	public void method976(int i) {
		currentMusicId = i * -114760015;
	}

	public int method977() {
		return currentMusicId * -737959343;
	}

	void method978(int i) {
		if (client.aClass195_8589.aClass650_2340 != null && Class435.method5266(835742603 * client.anInt8580, (byte) -56)) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3780, client.aClass195_8589.aClass650_2340, -490651035);
			class572_sub25.aRsByteBuffer.writeInt(i, -1743753997);
			client.aClass195_8589.method2929(class572_sub25, (byte) -99);
		}
	}

	public void method979(int i) {
		sendMusic(i, 255);
	}

	public void method980(int i) {
		sendMusic(i, 255);
	}

	Class127 method981(int i) {
		return aClass127_506;
	}

	public void method982() {
		Iterator iterator = aList502.iterator();
		while (iterator.hasNext()) {
			Class603 class603 = (Class603) iterator.next();
			if (class603.method7115((short) 355) == Class124.aClass124_1495) {
				class603.method7098(500, -1110366939);
				if (class603.method7103(-1782731285).method335((byte) 12) == -1530742551 * anInt512) {
					method984(-1530742551 * anInt512, 1159304053);
					break;
				}
			}
		}
		aClass603_513 = null;
		anInt512 = -44932953;
	}

	void method983() {
		Class110 class110 = new Class110(this);
		MusicVolume class123 = new MusicVolume(this);
		Class52 class52 = new Class52(this);
		Class53 class53 = new Class53(this);
		Class48 class48 = new Class48(this);
		Class2.method474(Class112.aClass112_1430.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 0.2F, class110, -1758773914);
		Class2.method474(Class112.music.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class123, -1961523801);
		Class2.method474(Class112.aClass112_1432.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class52, -1595179320);
		Class2.method474(Class112.aClass112_1435.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 0.8F, class53, -2136967787);
		Class2.method474(Class112.aClass112_1434.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class48, -1459723141);
		Class2.method474(Class126.aClass126_1514.method2215(-252206865), Class112.music.method2083((short) 362), 1.0F, null, -1492983035);
		Class2.method474(Class126.aClass126_1511.method2215(-857428034), Class112.aClass112_1434.method2083((short) 362), 1.0F, null, -1524503822);
		Class2.method474(Class126.aClass126_1509.method2215(133266230), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -2088600301);
		Class2.method474(Class126.aClass126_1512.method2215(-847470762), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1669425504);
		Class2.method474(Class126.aClass126_1513.method2215(-1005888569), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -2105541162);
		Class2.method474(Class126.aClass126_1519.method2215(-421038022), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1603498667);
		Class2.method474(Class126.aClass126_1515.method2215(-990004390), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1749006025);
		Class2.method474(Class126.aClass126_1516.method2215(285665045), Class112.aClass112_1435.method2083((short) 362), 1.0F, null, -1784352115);
		Class2.method474(Class126.aClass126_1510.method2215(-335353286), Class126.aClass126_1516.method2215(-1174541334), 1.0F, null, -1996217873);
		Class2.method474(Class126.aClass126_1517.method2215(-1312842150), Class126.aClass126_1516.method2215(-2012728087), 1.0F, null, -1624917388);
		Class523.method6293(Class126.aClass126_1514.method2215(-1371787323), -1208661048).method4612(0.75F, (byte) 96);
	}

	void method984(int i, int i_102_) {
		if (client.aClass195_8589.aClass650_2340 != null && Class435.method5266(835742603 * client.anInt8580, (byte) -69)) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3780, client.aClass195_8589.aClass650_2340, -309141465);
			class572_sub25.aRsByteBuffer.writeInt(i, -1743753997);
			client.aClass195_8589.method2929(class572_sub25, (byte) -98);
		}
	}

	void method985() {
		Class110 class110 = new Class110(this);
		MusicVolume class123 = new MusicVolume(this);
		Class52 class52 = new Class52(this);
		Class53 class53 = new Class53(this);
		Class48 class48 = new Class48(this);
		Class2.method474(Class112.aClass112_1430.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 0.2F, class110, -1918286904);
		Class2.method474(Class112.music.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class123, -1798069288);
		Class2.method474(Class112.aClass112_1432.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class52, -1742250774);
		Class2.method474(Class112.aClass112_1435.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 0.8F, class53, -1917847855);
		Class2.method474(Class112.aClass112_1434.method2083((short) 362), Class112.aClass112_1431.method2083((short) 362), 1.0F, class48, -1684122544);
		Class2.method474(Class126.aClass126_1514.method2215(-1639618919), Class112.music.method2083((short) 362), 1.0F, null, -2025165507);
		Class2.method474(Class126.aClass126_1511.method2215(-1884815868), Class112.aClass112_1434.method2083((short) 362), 1.0F, null, -1653678497);
		Class2.method474(Class126.aClass126_1509.method2215(-277005796), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1745206897);
		Class2.method474(Class126.aClass126_1512.method2215(325090607), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -2074371551);
		Class2.method474(Class126.aClass126_1513.method2215(35279921), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1704685171);
		Class2.method474(Class126.aClass126_1519.method2215(-1399873594), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1554010730);
		Class2.method474(Class126.aClass126_1515.method2215(28385145), Class112.aClass112_1430.method2083((short) 362), 1.0F, null, -1861906232);
		Class2.method474(Class126.aClass126_1516.method2215(481773059), Class112.aClass112_1435.method2083((short) 362), 1.0F, null, -1575661849);
		Class2.method474(Class126.aClass126_1510.method2215(-2000281977), Class126.aClass126_1516.method2215(586845481), 1.0F, null, -1534416905);
		Class2.method474(Class126.aClass126_1517.method2215(-1473967999), Class126.aClass126_1516.method2215(150354120), 1.0F, null, -2004058178);
		Class523.method6293(Class126.aClass126_1514.method2215(-1896647909), -1208661048).method4612(0.75F, (byte) 107);
	}

	public void method986(int i) {
		if (ready && i >= 0)
			method932(i, false, 573657574);
	}

	public static void method987(byte i) {
		for (int i_103_ = 0; i_103_ < 107; i_103_++)
			client.aBoolArray8784[i_103_] = true;
	}

	static final void method988(Cs2Executor class441, byte i) {
		Class92.method1531(class441, ((Cs2Executor) class441).entity, (short) -13064);
	}

	static final void method989(Cs2Executor class441, int i) {
		int i_104_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_105_ = i_104_ >> 14 & 0x3fff;
		int i_106_ = i_104_ & 0x3fff;
		Class497 class497 = client.aClass613_8605.method7280((byte) -76);
		i_105_ -= class497.localX * -2109597897;
		if (i_105_ < 0)
			i_105_ = 0;
		else if (i_105_ >= client.aClass613_8605.method7347(276416680))
			i_105_ = client.aClass613_8605.method7347(2069621484);
		i_106_ -= class497.localY * 417324155;
		if (i_106_ < 0)
			i_106_ = 0;
		else if (i_106_ >= client.aClass613_8605.method7278(277214477))
			i_106_ = client.aClass613_8605.method7278(277214477);
		client.anInt8675 = 108983703 * (256 + (i_105_ << 9));
		client.anInt8792 = 1669986783 * ((i_106_ << 9) + 256);
		Class18.anInt143 = -1723411734;
		Class419.anInt4958 = 1724865785;
		Class566.anInt6375 = 2114279121;
	}

	static final void method990(Cs2Executor class441, int i) {
		Class572_Sub17 class572_sub17 = (Class572_Sub17) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1661817525 * class572_sub17.anInt9124;
	}
}

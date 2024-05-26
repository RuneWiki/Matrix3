package game;

/* Class550 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;

public class Class550 {
	Class550() throws Throwable {
		throw new Error();
	}

	static void method6529(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = IncomingPacket.method4112(-1971973035);
	}

	static final void method6530(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_0_, -92971092)).equipSlot) * -917104297;
	}

	static final void method6531(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.anInt4269 * -455995945;
	}

	static final void method6532(byte i) {
		if (-1784648141 * client.anInt8604 > 1) {
			client.anInt8604 -= -425706245;
			client.anInt8729 = 653930141 * client.anInt8839;
		}
		if (client.aClass195_8589.aBool2344) {
			client.aClass195_8589.aBool2344 = false;
			Class113.method2092(1505300721);
		} else {
			if (!Class25.aBool165)
				Class345.method4317((byte) -100);
			for (int i_1_ = 0; (i_1_ < 100 && MaterialInformation.method1605(client.aClass195_8589, 24717376)); i_1_++) {
				/* empty */
			}
			if (1 == 835742603 * client.anInt8580) {
				while (Class344.method4315((byte) 54)) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3753, (client.aClass195_8589.aClass650_2340), 895421904);
					class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
					int i_2_ = (class572_sub25.aRsByteBuffer.o * -1585139053);
					Class190.method2889((class572_sub25.aRsByteBuffer), 48748209);
					class572_sub25.aRsByteBuffer.method8552((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i_2_), -2006953853);
					client.aClass195_8589.method2929(class572_sub25, (byte) -36);
				}
				if (null != Class273.aClass461_2902) {
					if (633548015 * Class273.aClass461_2902.anInt5216 != -1) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.GC_PACKET, (client.aClass195_8589.aClass650_2340), -703048304);
						if (Class65.aGarbageCollectorMXBean685 == null || !Class65.aGarbageCollectorMXBean685.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class65.aGarbageCollectorMXBean685 = garbagecollectormxbean;
										client.aLong8875 = -6094611317542751281L;
										client.aLong8737 = -5272074439168099041L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class69.method1067(-2134152349);
						int i_3_ = -1;
						if (null != Class65.aGarbageCollectorMXBean685) {
							long l_4_ = Class65.aGarbageCollectorMXBean685.getCollectionTime();
							if (client.aLong8737 * 7147685318279086369L != -1L) {
								long l_5_ = l_4_ - (7147685318279086369L * client.aLong8737);
								long l_6_ = l - (2681765377846398161L * client.aLong8875);
								if (0L != l_6_)
									i_3_ = (int) (l_5_ * 100L / l_6_);
							}
							client.aLong8737 = 5272074439168099041L * l_4_;
							client.aLong8875 = 6094611317542751281L * l;
						}
						class572_sub25.aRsByteBuffer.writeByteC(i_3_, (byte) -99);
						class572_sub25.aRsByteBuffer.writeByte128(-267830063 * client.anInt7734, 881918529);
						class572_sub25.aRsByteBuffer.writeShort128(633548015 * Class273.aClass461_2902.anInt5216, -16711936);
						client.aClass195_8589.method2929(class572_sub25, (byte) -95);
						Class273.aClass461_2902 = null;
						Class324.aLong4087 = (l + 30000L) * 5143952497543217671L;
					}
				} else if (Class69.method1067(-1755332923) >= -5049570460082517065L * Class324.aLong4087)
					Class273.aClass461_2902 = client.aClass455_8759.method5379((Class633.aClass641_8197.address), -221036758);
				if (!RS3Applet.MODS) //disables junk packets
					Class563.method6649((byte) 1);

				Class382.method4650(-1829291800);
				Class572_Sub13 class572_sub13 = ((Class572_Sub13) client.aClass675_8745.method7932((byte) 50));
				if (client.aClass613_8605.method7285(1688211595) != null) {
					if (5 == 625220759 * Class18.anInt143)
						Class444.method5331((byte) 80);
					else if (625220759 * Class18.anInt143 == 3)
						Class540.method6417((byte) -23);
				}
				if (client.aBool8681)
					client.aBool8681 = false;
				else
					client.aFloat8660 /= 2.0F;
				if (client.aBool8682)
					client.aBool8682 = false;
				else
					client.aFloat8679 /= 2.0F;
				if (IncomingPacket.method4113((byte) -73))
					Class572_Sub36.method8756(-448897714);
				else if (Class18.anInt143 * 625220759 == 1) {
					Class497 class497 = client.aClass613_8605.method7280((byte) -10);
					int i_7_ = class497.localX * -2109597897 << 9;
					int i_8_ = class497.localY * 417324155 << 9;
					if (Class218.aLong2511 * -1389695526323027701L <= 0L)
						Class218.aLong2511 = (Class69.method1067(-1894820228) * 8241051270684000931L);
					float f = (float) (Class69.method1067(-1677844549) - (Class218.aLong2511 * -1389695526323027701L));
					int i_9_ = 1000 / Class425.method5176(496397357);
					i_9_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_9_) {
						float f_10_ = Math.min(f, (float) i_9_);
						Class133_Sub1.aClass411_Sub1_9827.method5012(f_10_ / 1000.0F, (client.aClass613_8605.method7293(1307051874).anIntArrayArrayArray3141), client.aClass613_8605.method7287((byte) 35), i_7_, i_8_, (byte) -14);
					}
					Class218.aLong2511 = (Class69.method1067(-2120354790) * 8241051270684000931L);
				}
				Class298.method3974(-1174865631);
				if (client.anInt8580 * 835742603 == 1) {
					client.aClass613_8605.method7306(-1042067865).method5978(client.aClass613_8605, 2037978249);
					Class624.method7451(1326993702);
					if (-599981499 * client.anInt8620 > 10)
						((Class195) client.aClass195_8589).anInt2335 += 707314625;
					if ((((Class195) client.aClass195_8589).anInt2335 * 1070156865) > 2250)
						Class113.method2092(2032980138);
					else {
						if (1797623853 * client.anInt8646 == 0) {
							Class589.method6993((byte) 0);
							Class194.method2924((byte) -10);
						} else if (Class102_Sub2.aClass494_10268.anInterface57_5489.method320(class572_sub13, client.anInterface64Array8610, client.anInt8609 * 2134888631, Class108.aClass549_1426, -1192443456))
							Class133_Sub4.method9339(false, -637312475);
						else {
							if (2 == client.anInt8646 * 1797623853 && Class255.method3522((client.anInt8645 * 1545763299), 1615140874)) {
								client.aClass613_8605.method7348(new Class598(Class569.aClass569_6394, null), 1316513938);
								client.anInt8646 = 432127727;
							}
							if (1797623853 * client.anInt8646 == 3 && 18 != client.anInt8580 * 835742603) {
								Class122.aClass676_1485.method7964((byte) 118);
								client.anInt8646 = 2007826068;
								client.anInt8648 = client.cycles * -1389120501;
								client.anInt8649 = 0;
								client.aBool8647 = false;
								Class198.method2976(1328848990);
							}
							if (4 == 1797623853 * client.anInt8646) {
								int i_11_ = (client.cycles - 2129803171 * client.anInt8648);
								if (-1287240229 * client.anInt8649 < Class122.aClass133Array1481.length) {
									do {
										Class133 class133 = (Class122.aClass133Array1481[(client.anInt8649 * -1287240229)]);
										if (class133.anInt1566 * -762660985 > i_11_)
											break;
										class133.method2303(708828336);
									} while (client.anInt8646 * 1797623853 == 4 && ((client.anInt8649 += 807284307) * -1287240229 < (Class122.aClass133Array1481).length));
								}
								if (4 == client.anInt8646 * 1797623853) {
									for (int i_12_ = 0; i_12_ < (Class122.aClass130Array1483).length; i_12_++) {
										Class130 class130 = (Class122.aClass130Array1483[i_12_]);
										if (class130.aBool1529) {
											Entity class456_sub1_sub2_sub3 = class130.method2268(-2087914379);
											Class461.method5469(class456_sub1_sub2_sub3, true, 229703155);
										}
									}
								}
							}
						}
						Class676.method7976(-783841739);
						Class433.method5249(743682542);
						Class603.method7145(1524456170);
						Class71.method1084(false, (byte) 5);
						Class572_Sub16.method8567(Class272_Sub2.aClass106_9517, (Class456_Sub1_Sub3_Sub2.aClass94_11589), 1881767612);
						client.anInt8674 += 237624865;
						if (0 != 1251161273 * client.anInt8606) {
							client.anInt8803 += 1970875452;
							if (-311274581 * client.anInt8803 >= 400)
								client.anInt8606 = 0;
						}
						if (Class323.aClass73_4080 != null) {
							client.anInt8710 += -904830707;
							if (client.anInt8710 * 1766020549 >= 15) {
								Class555.method6575(Class323.aClass73_4080, (short) 714);
								Class323.aClass73_4080 = null;
							}
						}
						client.aClass73_8603 = null;
						client.aBool8780 = false;
						client.aBool8775 = false;
						Class383.aClass73_4610 = null;
						Class296.method3964(null, -1, -1, -1984317083);
						if (!client.aBool8754)
							client.anInt8751 = 1983555971;
						Class514.method6093(1370615272);
						client.anInt8839 += -1210150071;
						if (client.aBool8786) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3710, (client.aClass195_8589.aClass650_2340), -856629026);
							class572_sub25.aRsByteBuffer.writeIntV2((Class612.anInt7988 * -36891819 << 28 | Class498.anInt5510 * 863160757 << 14 | Class665_Sub22.anInt9601 * -1817958735), (byte) 1);
							client.aClass195_8589.method2929(class572_sub25, (byte) -117);
							client.aBool8786 = false;
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) client.aClass675_8813.method7920(-1945803963));
							if (class572_sub20 == null)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (class73.activeComponent * -1665128073 >= 0) {
								InterfaceDefinitions class73_13_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 6900);
								if (null == class73_13_ || class73_13_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= class73_13_.aClass73Array916.length) || ((class73_13_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -1949582066);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) client.aClass675_8884.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_14_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -12132);
								if (null == class73_14_ || null == class73_14_.aClass73Array916 || (class73.activeComponent * -1665128073 >= class73_14_.aClass73Array916.length) || ((class73_14_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2095596744);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) client.aClass675_8812.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_15_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -21821);
								if (class73_15_ == null || class73_15_.aClass73Array916 == null || (-1665128073 * class73.activeComponent >= class73_15_.aClass73Array916.length) || (class73 != (class73_15_.aClass73Array916[-1665128073 * class73.activeComponent])))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2048033401);
						}
						if (Class383.aClass73_4610 == null)
							client.anInt8844 = 0;
						if (client.aClass73_8770 != null)
							Class122.method2197(-1930796478);
						Class15.method654(-1614635701);
						if (-1550439133 * client.rights > 0 && Class108.aClass549_1426.method6514(82, (byte) 1) && Class108.aClass549_1426.method6514(81, (byte) 1) && client.anInt8787 * -1840536699 != 0) {
							int i_16_ = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) - -1840536699 * client.anInt8787);
							if (i_16_ < 0)
								i_16_ = 0;
							else if (i_16_ > 3)
								i_16_ = 3;
							Class497 class497 = client.aClass613_8605.method7280((byte) -19);
							Class21.method703(i_16_, (class497.localX * -2109597897 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0])), (417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])), -1111808379);
						}
						for (int i_17_ = 0; i_17_ < 5; i_17_++)
							client.anIntArray8597[i_17_]++;
						if (Class306.clientConfigsDomain.aBool10652 && ((Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L) < Class69.method1067(-1880505230) - 60000L))
							Class614.method7367(239906896);
						Class306.clientConfigsDomain.method9968((byte) 0);
						for (Class591_Sub1 class591_sub1 = (Class591_Sub1) client.aClass652_8864.method7697(219806155); null != class591_sub1; class591_sub1 = ((Class591_Sub1) client.aClass652_8864.method7698(-859231594))) {
							if ((long) (-1160847613 * (((Class591_Sub1) class591_sub1).anInt9180)) < (Class69.method1067(-1643140583) / 1000L - 5L)) {
								if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 2058923738);
								if (0 == (((Class591_Sub1) class591_sub1).aShort9181))
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 1815139449);
								class591_sub1.method7002((byte) 113);
							}
						}
						client.anInt8819 += 745021087;
						if (client.anInt8819 * -34112161 > 502) {
							client.anInt8819 = 0;
							int i_18_ = (int) (Math.random() * 8.0);
							if (1 == (i_18_ & 0x1))
								client.anInt8877 += -19134435 * client.anInt8662;
							if (2 == (i_18_ & 0x2))
								client.anInt8663 += client.anInt8664 * -1977461499;
							if ((i_18_ & 0x4) == 4)
								client.anInt8665 += -139987683 * client.anInt8666;
						}
						if (-1037352299 * client.anInt8877 < -55)
							client.anInt8662 = -87875006;
						if (client.anInt8877 * -1037352299 > 54)
							client.anInt8662 = 87875006;
						if (713494119 * client.anInt8663 < -55)
							client.anInt8664 = -2093052074;
						if (client.anInt8663 * 713494119 > 55)
							client.anInt8664 = 2093052074;
						if (-706438965 * client.anInt8665 < -42)
							client.anInt8666 = 1972333055;
						if (-706438965 * client.anInt8665 > 44)
							client.anInt8666 = -1972333055;
						client.anInt8672 += -1809977439;
						if (client.anInt8672 * -1605651359 > 505) {
							client.anInt8672 = 0;
							int i_19_ = (int) (Math.random() * 8.0);
							if ((i_19_ & 0x1) == 1)
								client.anInt8766 += 1104829617 * client.anInt8846;
							if (2 == (i_19_ & 0x2))
								client.anInt8670 += 151185977 * client.anInt8671;
						}
						if (client.anInt8766 * -777638353 < -61)
							client.anInt8846 = -410395906;
						if (client.anInt8766 * -777638353 > 65)
							client.anInt8846 = 410395906;
						if (client.anInt8670 * -1034566343 < -21)
							client.anInt8671 = 255419729;
						if (-1034566343 * client.anInt8670 > 12)
							client.anInt8671 = -255419729;
						client.aClass195_8589.anInt2337 += 394568993;
						if (client.aClass195_8589.anInt2337 * -1242489119 > 50) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, (client.aClass195_8589.aClass650_2340), -835562447);
							client.aClass195_8589.method2929(class572_sub25, (byte) -69);
						}
						if (client.aBool8573) {
							Class425.method5177((short) 28268);
							client.aBool8573 = false;
						}
						try {
							client.aClass195_8589.method2936((byte) 48);
						} catch (IOException ioexception) {
							Class113.method2092(1804759083);
						}
					}
				}
			}
		}
	}

	public static void method6533(int i, String string, boolean bool, int i_20_) {
		if (Class320.method4100(-544366613)) {
			if (Class13.anInt68 * -2082178003 != i)
				Class13.aLong79 = -4922727120155625359L;
			Class13.anInt68 = i * -916769883;
			Class13.aString99 = string;
			Class13.aBool75 = bool;
			client.aClass195_8632.method2943(-2047198126);
			Class463.method5478(15, 1017160333);
		}
	}
}

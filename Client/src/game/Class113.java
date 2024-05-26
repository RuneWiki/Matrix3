package game;

/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class113 implements Interface2 {
	boolean aBool1437;
	Class46 this$0;
	int anInt1438;

	Class113(Class46 class46, RSByteBuffer class572_sub15) {
		((Class113) this).this$0 = class46;
		((Class113) this).anInt1438 = class572_sub15.readUnsignedShort(647518597) * -821462869;
		((Class113) this).aBool1437 = class572_sub15.readUnsignedByte(385822076) == 1;
	}

	public void method17(Class49 class49) {
		class49.method863(((Class113) this).anInt1438 * -1806253565, ((Class113) this).aBool1437, (byte) 0);
		class49.method854(((Class113) this).anInt1438 * -1806253565, 1493492562).method2107(1476357728);
	}

	public void method16(Class49 class49) {
		class49.method863(((Class113) this).anInt1438 * -1806253565, ((Class113) this).aBool1437, (byte) 0);
		class49.method854(((Class113) this).anInt1438 * -1806253565, 1493492562).method2107(280333027);
	}

	public void method15(Class49 class49, int i) {
		class49.method863(((Class113) this).anInt1438 * -1806253565, ((Class113) this).aBool1437, (byte) 0);
		class49.method854(((Class113) this).anInt1438 * -1806253565, 1493492562).method2107(139006288);
	}

	public static void method2088(Class106 class106, long l, int i, int i_0_, int i_1_) {
		do {
			if (class106.method1698() && class106.method1938() > -1) {
				int i_2_ = class106.method1938();
				Class526 class526 = null;
				if (!Class520.aLinkedList5789.isEmpty())
					class526 = (Class526) Class520.aLinkedList5789.getFirst();
				if (class526 == null || -1881188469 * ((Class526) class526).anInt5891 != i_2_) {
					class106.method1703();
					Class520.aLinkedList5789.clear();
				} else {
					Class520.aLinkedList5789.removeFirst();
					class106.method2049();
					boolean bool = false;
					int i_3_;
					if (((Class526) class526).aLinkedList5888.isEmpty() && class106.method1746()) {
						long l_4_ = class106.method1705((-178850837 * Class418.anInt4946), (Class67.anInt692 * 665552453));
						i_3_ = (Class572_Sub2.aTwitchTV8969.SubmitFrame(l_4_, class106.method1701(), Class520.aBool5806, i, i_0_));
						class106.method1706(l_4_);
					} else {
						class106.method1707(-178850837 * Class418.anInt4946, 665552453 * Class67.anInt692, Class386.anIntArray4640, Class165.anIntArray2048);
						Class317.method4088(Class386.anIntArray4640, ((Class526) class526).aLinkedList5888, ((Class526) class526).anInt5889 * 2024932609, -839883203 * ((Class526) class526).anInt5892, ((Class526) class526).aFloat5890, (byte) -52);
						i_3_ = (Class572_Sub2.aTwitchTV8969.SubmitFrameRaw(Class386.anIntArray4640, Class520.aBool5806, i, i_0_));
					}
					class106.method1748();
					if (i_3_ == 2072)
						Class520.aLong5802 = -6266719081717469103L * l;
					else if (23 == i_3_)
						Class520.aLong5803 = -750361583638638433L * l;
					else if (-995 == i_3_ || i_3_ != 0)
						break;
				}
			}
		} while (false);
		if (Class520.aBool5811) {
			if (null == Class386.anIntArray4640) {
				Class386.anIntArray4640 = new int[(Class520.aBool5806 ? i_0_ * i : (Class418.anInt4946 * -178850837 * (665552453 * Class67.anInt692)))];
				Class165.anIntArray2048 = new int[(Class520.aBool5806 ? i_0_ * i : (Class67.anInt692 * 665552453 * (Class418.anInt4946 * -178850837)))];
			}
			if (!class106.method1698()) {
				class106.method2049();
				class106.method1707(Class418.anInt4946 * -178850837, 665552453 * Class67.anInt692, Class386.anIntArray4640, Class165.anIntArray2048);
				Class317.method4088(Class386.anIntArray4640, Class520.aLinkedList5808, class106.anInt1402 * 886687387, class106.anInt1417 * -1832602033, class106.aFloat1420, (byte) -6);
				int i_5_ = (Class572_Sub2.aTwitchTV8969.SubmitFrameRaw(Class386.anIntArray4640, Class520.aBool5806, i, i_0_));
				class106.method1748();
				Class520.aLinkedList5808.clear();
				do {
					if (2072 == i_5_)
						Class520.aLong5802 = l * -6266719081717469103L;
					else if (i_5_ == 23)
						Class520.aLong5803 = -750361583638638433L * l;
					else if (-995 == i_5_ || 0 != i_5_)
						break;
				} while (false);
			} else {
				class106.method1704(client.cycles, Class418.anInt4946 * -178850837, Class67.anInt692 * 665552453);
				Class520.aLinkedList5789.add(new Class526(client.cycles, Class520.aLinkedList5808, 886687387 * class106.anInt1402, -1832602033 * class106.anInt1417, class106.aFloat1420));
				Class520.aLinkedList5808 = new LinkedList();
			}
			Class520.aBool5811 = false;
		}
	}

	static void method2089(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class557.method6592(1027718431);
	}

	static final void method2090(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_6_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_7_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_8_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_9_ = (((Cs2Executor) class441).intStack[3 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_10_ = 256;
		Class344.audio.sendSoundEffect(Class124.aClass124_1503, i_6_, i_7_, i_9_, Class126.aClass126_1509.method2215(-1385378105), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_10_, i_8_);
	}

	static final void method2091(Cs2Executor class441, int i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub35_9233, ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 1) ? 2 : 0, 1109132023);
		client.aClass613_8605.method7302(-2088989329);
		Class623.method7443(-1253465515);
		client.aBool8854 = false;
	}

	static final void method2092(int i) {
		if (Class19.method692(client.anInt8580 * 835742603, (byte) 4) || Class133_Sub12.method9368(client.anInt8580 * 835742603, 2134888631))
			Class439.method5276(false, (byte) 8);
		else {
			Class665_Sub1.aClass555_8908 = client.aClass195_8589.method2933(-1821330803);
			client.aClass195_8589.method2946((byte) 0);
			Class463.method5478(13, -1022482017);
		}
	}

	static final void method2093(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr]);
		String string_11_ = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581 + 1]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = new StringBuilder().append(string).append(string_11_).toString();
	}
}

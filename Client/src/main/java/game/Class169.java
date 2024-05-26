package game;

/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Iterator;

class Class169 implements Runnable {
	Class289_Sub2 this$0;

	public void run() {
		try {
			while (!((Class289_Sub2) ((Class169) this).this$0).aBool9496) {
				HashMap hashmap = ((Class169) this).this$0.method8862(-555126205);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7230(-1596376442);
					}
				}
				Class198.method2977(25L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, 1645677946);
		}
	}

	public void method2700() {
		try {
			while (!((Class289_Sub2) ((Class169) this).this$0).aBool9496) {
				HashMap hashmap = ((Class169) this).this$0.method8862(-1039569367);
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class612 class612 = (Class612) iterator.next();
					if (!class612.aBool7981) {
						Class605[] class605s = (Class605[]) hashmap.get(class612);
						for (int i = 0; i < class605s.length; i++)
							class605s[i].method7230(-2012996891);
					}
				}
				Class198.method2977(25L);
			}
		} catch (Exception exception) {
			Class640.method7592(null, exception, 543747417);
		}
	}

	Class169(Class289_Sub2 class289_sub2) {
		((Class169) this).this$0 = class289_sub2;
	}

	public static int method2701(int i, int i_0_, int i_1_, int i_2_) {
		i_1_ &= 0x3;
		if (0 == i_1_)
			return i_0_;
		if (1 == i_1_)
			return 4095 - i;
		if (2 == i_1_)
			return 4095 - i_0_;
		return i;
	}

	static final void method2702(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = new StringBuilder().append(Class569.method6758((long) (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 60000L, Class594.aClass435_7823.getId(-1996046761), true, 1531612491)).append(" UTC").toString();
	}

	static final void method2703(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 2039935402;
		String string = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]);
		String string_3_ = (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr + 1]);
		if (client.rights * -1550439133 != 0 || (!client.aBool8734 || client.aBool8596) && !client.aBool8738) {
			Class195 class195 = Class166.method2676((byte) 110);
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3717, class195.aClass650_2340, 693316557);
			class572_sub25.aRsByteBuffer.writeShort(0, -1489003247);
			int i_4_ = (class572_sub25.aRsByteBuffer.o * -1585139053);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -67);
			Class25.method752(class572_sub25.aRsByteBuffer, string_3_, (byte) -60);
			class572_sub25.aRsByteBuffer.method8464((class572_sub25.aRsByteBuffer.o * -1585139053) - i_4_, -1404479454);
			class195.method2929(class572_sub25, (byte) -9);
		}
	}

	static final void method2704(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (null != Class547.aClass572_Sub12_Sub5_6129 ? -2130748737 * Class547.aClass572_Sub12_Sub5_6129.anInt11325 : -1);
	}
}

package game;

/* Class401 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchEvent;

public class Class401 {
	public static Class401 aClass401_4742 = new Class401(0);
	public static Class401 aClass401_4743 = new Class401(1);
	int anInt4744;

	Class401(int i) {
		((Class401) this).anInt4744 = 1341594613 * i;
	}

	static final void method4773(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_1_ < 0 || i_1_ >= ((Cs2Executor) class441).globalArrayLengths[i_0_])
			throw new RuntimeException();
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).globalArrays[i_0_][i_1_];
	}

	static final void method4774(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Character.toLowerCase((char) i_2_);
	}

	static final void method4775(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class419.anInt4956 * 1637554457;
	}

	public static void method4776(Class106 class106, long l) {
		if (Class520.anInt5796 * -1448797863 != 3 && -1448797863 * Class520.anInt5796 != 0) {
			if (Class520.anInt5796 * -1448797863 == 1) {
				if (Class520.aStringArray5799 == null || Class520.aStringArray5799.length == 0)
					throw new RuntimeException("");
				int i = 0;
				for (int i_3_ = 0; i_3_ < Class520.aStringArray5799.length; i_3_++) {
					if (null != Class520.aStringArray5799[i_3_]) {
						try {
							i += (Class297.aClass567_3477.method6718(Class520.aStringArray5799[i_3_], (byte) 0));
						} catch (Exception_Sub5 exception_sub5) {
							Class280.method3793(Class268.aClass268_2850, exception_sub5.aString11239, (-1592646523 * exception_sub5.anInt11240), exception_sub5.getCause(), 1498622088);
							Class520.anInt5796 = -1781605189;
							return;
						}
					} else
						i += 100;
				}
				Class520.anInt5797 = i / Class520.aStringArray5799.length * 2084015259;
				if (100 == 968849811 * Class520.anInt5797) {
					Class520.anInt5796 = Class38.method793((byte) -104) * 837787369;
					if (2 != Class520.anInt5796 * -1448797863)
						return;
				} else
					return;
			}
			TwitchEvent[] twitchevents = Class572_Sub2.aTwitchTV8969.Service();
			if (twitchevents != null) {
				for (int i = 0; i < twitchevents.length; i++) {
					TwitchEvent twitchevent = twitchevents[i];
					if (twitchevent != null && Class344.method4313(twitchevent, l)) {
						Class534 class534 = twitchevent.method7459();
						if (null != class534)
							VarTransmitLevel.method7439(class534.getId(-1601518265), twitchevent, -1295463334);
					}
				}
			}
			if (Class572_Sub2.aTwitchTV8969.IsStreaming() && (l - -7669926747422475625L * Class520.aLong5801 > -7886968894272164299L * Class258.aLong2784)) {
				Class520.aLong5801 = l * -201621344568384217L;
				if (class106.method1699())
					Class520.aBool5811 = true;
			}
			if (Class572_Sub2.aTwitchTV8969.IsStreaming()) {
				if (l - 742205428047141041L * Class520.aLong5802 < (long) (Class520.anInt5793 * -1015400411))
					Class520.anInt5786 = 1799710910;
				else if (l - 3493944752617720671L * Class520.aLong5803 < (long) (-1015400411 * Class520.anInt5793))
					Class520.anInt5786 = -1247628193;
				else
					Class520.anInt5786 = 0;
			} else
				Class520.anInt5786 = 0;
			if ((l - Class520.aLong5813 * 5260012431327957201L > (long) (Class520.anInt5791 * 1735208569)) && Class572_Sub2.aTwitchTV8969.GetWebcamState() == 5) {
				Class572_Sub2.aTwitchTV8969.RestartWebcamDevice();
				Class520.aLong5813 = -1321206776551356367L * l;
			}
		}
	}
}

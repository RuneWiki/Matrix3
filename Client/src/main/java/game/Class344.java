package game;

/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchEvent;
import com.jagex.twitchtv.TwitchEventLiveStreams;
import com.jagex.twitchtv.TwitchEventResult;

public abstract class Class344 implements Interface50 {
	Class102 aClass102_4362;
	Class248 aClass248_4363;
	Class375 aClass375_4364;
	long aLong4365;
	int anInt4366;
	Class248 aClass248_4367;
	public static Class54 audio;

	int method4306(byte i) {
		int i_0_ = BaseVarType.aClass412_7963.method5058(1538831658);
		int i_1_ = 100 * i_0_;
		if (i_0_ == ((Class344) this).anInt4366 * -1476946433 && 0 != i_0_) {
			int i_2_ = BaseVarType.aClass412_7963.method5052((byte) 37);
			if (i_2_ > i_0_) {
				long l = (((Class344) this).aLong4365 * 4111562510662103039L - BaseVarType.aClass412_7963.method5056(-2028686497));
				if (l > 0L) {
					long l_3_ = l * 10000L / (long) i_0_ * (long) (i_2_ - i_0_);
					long l_4_ = ((Class69.method1067(-2042882798) - (((Class344) this).aLong4365 * 4111562510662103039L)) * 10000L);
					if (l_4_ < l_3_)
						i_1_ = (int) ((long) (i_2_ - i_0_) * l_4_ * 100L / l_3_ + (long) (i_0_ * 100));
					else
						i_1_ = 100 * i_2_;
				}
			}
		} else {
			((Class344) this).anInt4366 = -198940161 * i_0_;
			((Class344) this).aLong4365 = Class69.method1067(-2006232845) * -7554153781832970241L;
		}
		return i_1_;
	}

	Class344(Class248 class248, Class248 class248_5_, Class375 class375) {
		((Class344) this).aClass248_4367 = class248;
		((Class344) this).aClass248_4363 = class248_5_;
		((Class344) this).aClass375_4364 = class375;
	}

	public void method299(short i) {
		Class284 class284 = Class542.method6435(((Class344) this).aClass248_4363, -857233559 * (((Class344) this).aClass375_4364.anInt4563), (byte) 7);
		((Class344) this).aClass102_4362 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2574(((Class344) this).aClass248_4367, -857233559 * (((Class344) this).aClass375_4364.anInt4563)), true));
	}

	public void method38() {
		Class284 class284 = Class542.method6435(((Class344) this).aClass248_4363, -857233559 * (((Class344) this).aClass375_4364.anInt4563), (byte) 7);
		((Class344) this).aClass102_4362 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2574(((Class344) this).aClass248_4367, -857233559 * (((Class344) this).aClass375_4364.anInt4563)), true));
	}

	public void method300(boolean bool, int i) {
		int i_6_ = ((((Class344) this).aClass375_4364.aClass320_4560.method4095(((Class344) this).aClass375_4364.anInt4559 * -139432737, client.anInt8724 * -507276561, 866359492)) + ((Class344) this).aClass375_4364.anInt4557 * -1706069299);
		int i_7_ = ((((Class344) this).aClass375_4364.aClass300_4556.method3986(-670814997 * ((Class344) this).aClass375_4364.anInt4562, client.anInt8725 * -199235591, -506038489)) + ((Class344) this).aClass375_4364.anInt4558 * -1354888403);
		method4308(bool, i_6_, i_7_, -740523668);
		method4307(bool, i_6_, i_7_, -374189215);
		String string = BaseVarType.aClass412_7963.method5054(2140551345);
		if ((Class69.method1067(-2082144805) - 4111562510662103039L * ((Class344) this).aLong4365) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(BaseVarType.aClass412_7963.method5065(313068810).anInt4692 * 169628821).append(")").toString();
		((Class344) this).aClass102_4362.method1612(string, (i_6_ + ((Class344) this).aClass375_4364.anInt4559 * -139432737 / 2), (((Class344) this).aClass375_4364.anInt4561 * -1271031675 + (4 + (-670814997 * ((Class344) this).aClass375_4364.anInt4562 / 2 + i_7_))), ((Class344) this).aClass375_4364.anInt4555 * -983568713, -1, (byte) 8);
	}

	abstract void method4307(boolean bool, int i, int i_8_, int i_9_);

	public void method303(boolean bool) {
		int i = ((((Class344) this).aClass375_4364.aClass320_4560.method4095(((Class344) this).aClass375_4364.anInt4559 * -139432737, client.anInt8724 * -507276561, 866359492)) + ((Class344) this).aClass375_4364.anInt4557 * -1706069299);
		int i_10_ = ((((Class344) this).aClass375_4364.aClass300_4556.method3986(-670814997 * ((Class344) this).aClass375_4364.anInt4562, client.anInt8725 * -199235591, -1867313721)) + ((Class344) this).aClass375_4364.anInt4558 * -1354888403);
		method4308(bool, i, i_10_, -1684545786);
		method4307(bool, i, i_10_, -374189215);
		String string = BaseVarType.aClass412_7963.method5054(1025020903);
		if ((Class69.method1067(-1692091895) - 4111562510662103039L * ((Class344) this).aLong4365) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(BaseVarType.aClass412_7963.method5065(-446339318).anInt4692 * 169628821).append(")").toString();
		((Class344) this).aClass102_4362.method1612(string, i + ((Class344) this).aClass375_4364.anInt4559 * -139432737 / 2, (((Class344) this).aClass375_4364.anInt4561 * -1271031675 + (4 + (-670814997 * ((Class344) this).aClass375_4364.anInt4562 / 2 + i_10_))), ((Class344) this).aClass375_4364.anInt4555 * -983568713, -1, (byte) 8);
	}

	public void method112() {
		Class284 class284 = Class542.method6435(((Class344) this).aClass248_4363, -857233559 * (((Class344) this).aClass375_4364.anInt4563), (byte) 7);
		((Class344) this).aClass102_4362 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2574(((Class344) this).aClass248_4367, -857233559 * (((Class344) this).aClass375_4364.anInt4563)), true));
	}

	public void method298() {
		Class284 class284 = Class542.method6435(((Class344) this).aClass248_4363, -857233559 * (((Class344) this).aClass375_4364.anInt4563), (byte) 7);
		((Class344) this).aClass102_4362 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2574(((Class344) this).aClass248_4367, -857233559 * (((Class344) this).aClass375_4364.anInt4563)), true));
	}

	abstract void method4308(boolean bool, int i, int i_11_, int i_12_);

	public void method103() {
		Class284 class284 = Class542.method6435(((Class344) this).aClass248_4363, -857233559 * (((Class344) this).aClass375_4364.anInt4563), (byte) 7);
		((Class344) this).aClass102_4362 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2574(((Class344) this).aClass248_4367, -857233559 * (((Class344) this).aClass375_4364.anInt4563)), true));
	}

	public void method110() {
		Class284 class284 = Class542.method6435(((Class344) this).aClass248_4363, -857233559 * (((Class344) this).aClass375_4364.anInt4563), (byte) 7);
		((Class344) this).aClass102_4362 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2574(((Class344) this).aClass248_4367, -857233559 * (((Class344) this).aClass375_4364.anInt4563)), true));
	}

	public boolean method301() {
		boolean bool = true;
		if (!((Class344) this).aClass248_4367.method3383((-857233559 * (((Class344) this).aClass375_4364.anInt4563)), 361839115))
			bool = false;
		if (!((Class344) this).aClass248_4363.method3383(((((Class344) this).aClass375_4364.anInt4563) * -857233559), 813779119))
			bool = false;
		return bool;
	}

	public void method302(boolean bool) {
		int i = ((((Class344) this).aClass375_4364.aClass320_4560.method4095(((Class344) this).aClass375_4364.anInt4559 * -139432737, client.anInt8724 * -507276561, 866359492)) + ((Class344) this).aClass375_4364.anInt4557 * -1706069299);
		int i_13_ = ((((Class344) this).aClass375_4364.aClass300_4556.method3986(-670814997 * ((Class344) this).aClass375_4364.anInt4562, client.anInt8725 * -199235591, -1941777496)) + ((Class344) this).aClass375_4364.anInt4558 * -1354888403);
		method4308(bool, i, i_13_, 1541588201);
		method4307(bool, i, i_13_, -374189215);
		String string = BaseVarType.aClass412_7963.method5054(566039850);
		if ((Class69.method1067(-1822607011) - 4111562510662103039L * ((Class344) this).aLong4365) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(BaseVarType.aClass412_7963.method5065(-79850248).anInt4692 * 169628821).append(")").toString();
		((Class344) this).aClass102_4362.method1612(string, i + ((Class344) this).aClass375_4364.anInt4559 * -139432737 / 2, (((Class344) this).aClass375_4364.anInt4561 * -1271031675 + (4 + (-670814997 * ((Class344) this).aClass375_4364.anInt4562 / 2 + i_13_))), ((Class344) this).aClass375_4364.anInt4555 * -983568713, -1, (byte) 8);
	}

	public void method149() {
		Class284 class284 = Class542.method6435(((Class344) this).aClass248_4363, -857233559 * (((Class344) this).aClass375_4364.anInt4563), (byte) 7);
		((Class344) this).aClass102_4362 = (Class272_Sub2.aClass106_9517.method1751(class284, Class160.method2574(((Class344) this).aClass248_4367, -857233559 * (((Class344) this).aClass375_4364.anInt4563)), true));
	}

	public boolean method297(int i) {
		boolean bool = true;
		if (!((Class344) this).aClass248_4367.method3383((-857233559 * (((Class344) this).aClass375_4364.anInt4563)), -393865729))
			bool = false;
		if (!((Class344) this).aClass248_4363.method3383(((((Class344) this).aClass375_4364.anInt4563) * -857233559), 108119965))
			bool = false;
		return bool;
	}

	abstract void method4309(boolean bool, int i, int i_14_);

	abstract void method4310(boolean bool, int i, int i_15_);

	abstract void method4311(boolean bool, int i, int i_16_);

	int method4312() {
		int i = BaseVarType.aClass412_7963.method5058(864705866);
		int i_17_ = 100 * i;
		if (i == ((Class344) this).anInt4366 * -1476946433 && 0 != i) {
			int i_18_ = BaseVarType.aClass412_7963.method5052((byte) 70);
			if (i_18_ > i) {
				long l = (((Class344) this).aLong4365 * 4111562510662103039L - BaseVarType.aClass412_7963.method5056(-1846773405));
				if (l > 0L) {
					long l_19_ = l * 10000L / (long) i * (long) (i_18_ - i);
					long l_20_ = ((Class69.method1067(-2001997313) - (((Class344) this).aLong4365 * 4111562510662103039L)) * 10000L);
					if (l_20_ < l_19_)
						i_17_ = (int) ((long) (i_18_ - i) * l_20_ * 100L / l_19_ + (long) (i * 100));
					else
						i_17_ = 100 * i_18_;
				}
			}
		} else {
			((Class344) this).anInt4366 = -198940161 * i;
			((Class344) this).aLong4365 = Class69.method1067(-1883925092) * -7554153781832970241L;
		}
		return i_17_;
	}

	static boolean method4313(TwitchEvent twitchevent, long l) {
		if (!Class520.aBool5783) {
			switch (twitchevent.eventType) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}
		if (twitchevent.eventType == 33) {
			if (null == Class520.aTwitchWebcamFrameData5807)
				return false;
			int i = ((TwitchEventResult) twitchevent).result;
			int i_21_ = (Class572_Sub2.aTwitchTV8969.GetWebcamFrameData(i, Class520.aTwitchWebcamFrameData5807));
			if (0 == i_21_) {
				if (Class520.aBool5794)
					Class520.aTwitchWebcamFrameData5807.method759();
				if (Class520.aBool5816)
					Class520.aTwitchWebcamFrameData5807.method760();
				Class660.method7777(505789592);
				Class520.aLong5813 = -1321206776551356367L * l;
				Class167.method2679(33, 0, -1845523466);
			} else
				Class520.aClass161_5817 = null;
			return false;
		}
		if (twitchevent.eventType == 30) {
			int i = ((TwitchEventResult) twitchevent).result;
			if (0 == i || i == 1)
				Class221.method3114(-1593546523);
			else if (i == 2)
				Class520.aLong5813 = -1321206776551356367L * l;
		}
		if (twitchevent.eventType == 34) {
			Class520.aTwitchEventLiveStreams5810 = (TwitchEventLiveStreams) twitchevent;
			Class167.method2679(34, 0, -1254295819);
		}
		return true;
	}

	static final void method4314(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class572_Sub30.method8666(class73, class83, class441, -662548587);
	}

	public static boolean method4315(byte i) {
		Class572_Sub6 class572_sub6 = (Class572_Sub6) Class256.aClass675_2765.method7932((byte) 50);
		if (null == class572_sub6)
			return false;
		return true;
	}

	public static final void method4316(InterfaceDefinitions class73, int i, int i_22_, int i_23_) {
		if (null == client.aClass73_8770 && !Class25.aBool165 && (class73 != null && Class272_Sub1.method8820(class73, (byte) 21))) {
			client.aClass73_8770 = class73;
			client.aClass73_8771 = Class232.method3220(class73, (byte) 61);
			client.anInt8772 = 953125055 * i;
			client.anInt8676 = i_22_ * 64511353;
			Class568.anInt6388 = 0;
			client.aBool8783 = false;
		}
	}
}

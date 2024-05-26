package game;

/* Class600 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

class Class600 implements Interface30 {
	Class605 this$0;

	public void method150(int i) {
		((Class600) this).this$0.method7177(true, -1629943951);
	}

	public void method151() {
		((Class600) this).this$0.method7177(true, -1961723173);
	}

	public void method149() {
		((Class600) this).this$0.method7177(true, -1359313436);
	}

	public void method39() {
		((Class600) this).this$0.method7177(true, -1255091643);
	}

	Class600(Class605 class605) {
		((Class600) this).this$0 = class605;
	}

	public static boolean method7060(byte i) {
		return Class520.aBool5811;
	}

	static void method7061(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class303.method4003(string, -1450897339);
	}

	static void method7062(Entity class456_sub1_sub2_sub3, int i, int i_0_) {
		if (null != class456_sub1_sub2_sub3.anIntArray11640) {
			Class453 class453 = ((Class453) Class455.method5387(Class404.method4797(1709836552), i, -2116877913));
			int i_1_ = (class456_sub1_sub2_sub3.anIntArray11640[class453.method5377((byte) -122)]);
			if (i_1_ != class456_sub1_sub2_sub3.aClass663_11670.method7795(-1478180242)) {
				class456_sub1_sub2_sub3.aClass663_11670.method7789(i_1_, class456_sub1_sub2_sub3.aClass663_11670.method7808((byte) -67), (byte) 91);
				class456_sub1_sub2_sub3.anInt11663 = class456_sub1_sub2_sub3.stepsCount * 1079727145;
			}
		}
	}

	static void method7063(int i, boolean bool, byte i_2_) {
		ItemsContainer class572_sub31 = Class447.getContainer(i, bool, -1172616480);
		if (null != class572_sub31) {
			for (int i_3_ = 0; (i_3_ < ((ItemsContainer) class572_sub31).itemIds.length); i_3_++) {
				((ItemsContainer) class572_sub31).itemIds[i_3_] = -1;
				((ItemsContainer) class572_sub31).itemAmounts[i_3_] = 0;
			}
		}
	}

	public static void method7064(int i) {
		Class122.aClass676_1485.method7964((byte) 108);
		Class122.aClass675_1482.method7918(1780017688);
		Class122.aClass119Array1487 = null;
		Class122.aClass130Array1483 = null;
		Class442.aClass120Array5129 = null;
		Class557.aClass118Array6331 = null;
		Class122.aClass133Array1481 = null;
		Class122.anInt1486 = 571007091;
		Class122.anInt1484 = 0;
		Class122.anInt1488 = 0;
		Class120.aClass121_1474 = null;
		Class122.anInt1493 = 1266126359;
		Class122.anInt1492 = 1725537827;
		if (Class122.aBool1489) {
			client.aShort8853 = Class122.aShort1490;
			client.aShort8693 = Class70.aShort708;
			client.aShort8851 = Class122.aShort1491;
			client.aShort8852 = Class134.aShort1568;
			Class122.aBool1489 = false;
		}
	}

	static String method7065(long l, int i, boolean bool, int i_4_) {
		Calendar calendar;
		if (bool) {
			Class675.method7960(l);
			calendar = Class273.aCalendar2898;
		} else {
			Class388.method4694(l);
			calendar = Class273.aCalendar2899;
		}
		int i_5_ = calendar.get(5);
		int i_6_ = calendar.get(2) + 1;
		int i_7_ = calendar.get(1);
		int i_8_ = calendar.get(11);
		int i_9_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_5_ / 10)).append(i_5_ % 10).append("/").append(i_6_ / 10).append(i_6_ % 10).append("/").append(i_7_ % 100 / 10).append(i_7_ % 10).append(" ").append(i_8_ / 10).append(i_8_ % 10).append(":").append(i_9_ / 10).append(i_9_ % 10).toString();
	}

	static final void method7066(Cs2Executor class441, short i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_10_, -1251312877)).anInt8141) * 1954784445;
	}
}

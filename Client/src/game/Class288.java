package game;

/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class288 implements Interface52 {
	int anInt3422;
	static Class288 aClass288_3423;
	static Class288 aClass288_3424;
	static Class288 aClass288_3425 = new Class288(0);

	Class288(int i) {
		((Class288) this).anInt3422 = i * 1384461865;
	}

	public int getId(int i) {
		return ((Class288) this).anInt3422 * -544553447;
	}

	public int method143() {
		return ((Class288) this).anInt3422 * -544553447;
	}

	static {
		aClass288_3423 = new Class288(1);
		aClass288_3424 = new Class288(2);
	}

	public int method43() {
		return ((Class288) this).anInt3422 * -544553447;
	}

	public int method61() {
		return ((Class288) this).anInt3422 * -544553447;
	}

	public int method45() {
		return ((Class288) this).anInt3422 * -544553447;
	}

	static final void method3880(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int[] is = Class665_Sub11.method8207(string, class441, -515340983);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray874 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.anIntArray875 = is;
		class73.aBool857 = true;
	}

	static final void method3881(Cs2Executor class441, Entity class456_sub1_sub2_sub3, int i) {
		((Cs2Executor) class441).intStackPtr -= 1295459537;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		int i_3_ = (((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_4_ = (((Cs2Executor) class441).intStack[4 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[5 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_5_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 6]);
		if (Class133_Sub1.aClass411_Sub1_9827.method4994(-1054913922) != Class413.aClass413_4915)
			throw new RuntimeException();
		Class423_Sub3 class423_sub3 = ((Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -86));
		Class230 class230 = new Class230();
		Class230 class230_6_ = new Class230();
		class230.method3172(0.0F, 1.0F, 0.0F, (float) ((double) i_4_ * 3.141592653589793 * 2.0 / 16384.0));
		Class240 class240 = new Class240(1.0F, 0.0F, 0.0F);
		class240.method3288(class230);
		class240.method3272();
		class230_6_.method3209(class240, (float) (2.0 * (3.141592653589793 * (double) i_3_) / 16384.0));
		class230.method3189(class230_6_);
		Class497 class497 = client.aClass613_8605.method7280((byte) -57);
		int i_7_ = -2109597897 * class497.localX << 9;
		int i_8_ = 417324155 * class497.localY << 9;
		if (class456_sub1_sub2_sub3 != null)
			class423_sub3.method9312(class456_sub1_sub2_sub3, new Class240((float) i_0_, (float) i_1_, (float) i_2_), class230, bool, i_5_, (client.aClass613_8605.method7293(597829612).anIntArrayArrayArray3141), client.aClass613_8605.method7287((byte) -86), i_7_, i_8_, -1315433770);
		client.aBool8685 = true;
	}

	static final void method3882(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -319529489) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray858 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static boolean method3883(int i, int i_9_) {
		return 12 == i || 5 == i || 11 == i || i == 1;
	}

	static final void method3884(boolean bool, byte i) {
		Class287.method3879(client.anInt8790 * -507155049, 1960824389 * Class269.anInt2861, client.anInt7739 * -530390519, bool, 828851308);
	}

	static final void method3885(Cs2Executor class441, int i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub32_9202.method7863(i_10_, 1109985704);
	}
}

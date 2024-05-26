package game;

/* Class614 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class614 {
	static Class614 aClass614_8034 = new Class614();
	public static Class614 aClass614_8035 = new Class614();
	public static Class614 aClass614_8036 = new Class614();
	static Class614 aClass614_8037 = new Class614();
	public static int anInt8038;
	static Class161 aClass161_8039;

	Class614() {
		/* empty */
	}

	static final void method7365(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1957439894;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (i_0_ >= 2)
			throw new RuntimeException();
		client.anInt8690 = i_0_ * -1542880195;
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		if (i_1_ + 1 >= (client.anIntArrayArrayArray8689[client.anInt8690 * 996160277]).length >> 1)
			throw new RuntimeException();
		client.anInt8692 = -1645791019 * i_1_;
		client.anInt8651 = 0;
		client.anInt8709 = ((((Cs2Executor) class441).intStack[2 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * -1354377117);
		client.anInt8696 = (1044141747 * (((Cs2Executor) class441).intStack[3 + 1369304407 * ((Cs2Executor) class441).intStackPtr]));
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 4]);
		if (i_2_ >= 2)
			throw new RuntimeException();
		client.anInt8711 = 527050097 * i_2_;
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 5]);
		if (i_3_ + 1 >= (client.anIntArrayArrayArray8689[-2091123823 * client.anInt8711]).length >> 1)
			throw new RuntimeException();
		client.anInt8824 = i_3_ * -12111643;
		Class18.anInt143 = 1285777781;
		Class419.anInt4958 = 1724865785;
		Class566.anInt6375 = 2114279121;
	}

	static final void method7366(Cs2Executor class441, byte i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub2_9247, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1261303704);
		Class623.method7443(-1416627723);
	}

	public static void method7367(int i) {
		Class649 class649 = Class504.method6027("2", client.aClass437_8705.aString5074, true, -1798379077);
		Class306.clientConfigsDomain.method9961(class649, 1198242176);
	}

	static Class630 method7368(RSByteBuffer class572_sub15, Class202_Sub1 class202_sub1, byte i) {
		Class630 class630 = new Class630(class202_sub1);
		for (;;) {
			int i_4_ = class572_sub15.readUnsignedByte(41927590);
			if (i_4_ == 255)
				break;
			BaseVarType class609 = ((BaseVarType) Class455.method5386(BaseVarType.class, i_4_, 1467348111));
			for (;;) {
				int i_5_ = class572_sub15.readUnsignedByte(568725704);
				if (255 == i_5_)
					break;
				class572_sub15.o -= 310393755;
				Class323 class323 = class202_sub1.method9205(class572_sub15, class609, -141889912);
				if (class323 != null)
					class630.method443(380662693 * class323.anInt4079, class323.anObject4078, 1700359447);
			}
		}
		return class630;
	}

	static void method7369(short i) {
		if (null != Class5.aFileOutputStream31) {
			try {
				Class5.aFileOutputStream31.close();
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		Class5.aFileOutputStream31 = null;
	}
}

package game;

/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchTV;

public class Class38 implements Interface3 {
	Class115 aClass115_396;
	Class46 this$0;

	public void method16(Class49 class49) {
		class49.method857(((Class38) this).aClass115_396, (byte) -24);
	}

	Class38(Class46 class46, RSByteBuffer class572_sub15) {
		((Class38) this).this$0 = class46;
		boolean bool = class572_sub15.readUnsignedByte(2061002897) != 255;
		if (bool)
			class572_sub15.o -= 310393755;
		((Class38) this).aClass115_396 = new Class115(class572_sub15, bool, true, ((Class46) class46).anInterface1_463);
	}

	public void method17(Class49 class49) {
		class49.method857(((Class38) this).aClass115_396, (byte) -15);
	}

	public void method15(Class49 class49, int i) {
		class49.method857(((Class38) this).aClass115_396, (byte) 1);
	}

	static final void method790(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -19375);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class184.method2829(class73, class83, class441, 1148836882);
	}

	public static void method791(int i) {
		if (Class10.aClass641_48.id * 2112639107 != -1)
			Class242.method3340(Class10.aClass641_48.id * 2112639107, Class10.aClass641_48.address, (byte) 58);
	}

	static final void method792(Cs2Executor class441, short i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1883230751 * class73.anInt774;
	}

	static int method793(byte i) {
		try {
			for (int i_1_ = 0; i_1_ < Class520.aStringArray5799.length; i_1_++) {
				if (null != Class520.aStringArray5799[i_1_] && Class520.aBoolArray5798[i_1_])
					Class597.method7040(441439603).method421(Class520.aStringArray5799[i_1_], (byte) 13);
			}
		} catch (Exception_Sub7 exception_sub7) {
			return 3;
		}
		Class572_Sub2.aTwitchTV8969 = new TwitchTV();
		int i_2_ = Class572_Sub2.aTwitchTV8969.InitialiseTTV(Class260.method3564(-839505981));
		if (i_2_ == 0)
			Class520.aBool5800 = true;
		else
			Class640.method7592(new StringBuilder().append(10).append(Class3.aString23).append(i_2_).toString(), new RuntimeException(), -302960696);
		return 2;
	}

	public static void method794(int i, int i_3_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(21, (long) i);
		class572_sub12_sub11.method10384(-1687780439);
	}
}

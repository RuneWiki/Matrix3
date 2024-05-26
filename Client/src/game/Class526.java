package game;

/* Class526 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class526 {
	LinkedList aLinkedList5888;
	int anInt5889;
	float aFloat5890;
	int anInt5891;
	int anInt5892;
	static Class87_Sub1[] aClass87_Sub1Array5893;

	Class526(int i, LinkedList linkedlist, int i_0_, int i_1_, float f) {
		((Class526) this).anInt5891 = i * -452585437;
		((Class526) this).aLinkedList5888 = linkedlist;
		((Class526) this).anInt5889 = -26805503 * i_0_;
		((Class526) this).anInt5892 = 433905941 * i_1_;
		((Class526) this).aFloat5890 = f;
	}

	static final void method6308(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		VarDomainType.method3675(class73, class83, class441, (byte) 71);
	}

	static final void method6309(Cs2Executor class441, int i) throws Exception_Sub4 {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class427 class427 = RSSocket.method7603(i_2_, -1890026148);
		if (class427 == null)
			throw new RuntimeException();
		Class133_Sub1.aClass411_Sub1_9827.method4975(class427, 1214428364);
	}

	static final void method6310(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) 2588);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		VarDomainType.method3675(class73, class83, class441, (byte) 79);
	}

	static final void method6311(Cs2Executor class441, int i) {
		Class562.method6637(559575787);
	}

	static final void method6312(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class13.anInt110 * 878428981;
	}
}

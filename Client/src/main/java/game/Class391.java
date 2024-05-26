package game;

/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class391 {
	static final int anInt4658 = 100;
	Class572_Sub12_Sub13[] aClass572_Sub12_Sub13Array4659 = new Class572_Sub12_Sub13[100];
	int anInt4660;

	int method4711() {
		return 1730560953 * ((Class391) this).anInt4660;
	}

	int method4712(int i) {
		return 1730560953 * ((Class391) this).anInt4660;
	}

	Class391() {
		/* empty */
	}

	Class572_Sub12_Sub13 method4713(int i, int i_0_) {
		if (i < 0 || i >= 1730560953 * ((Class391) this).anInt4660)
			return null;
		return ((Class391) this).aClass572_Sub12_Sub13Array4659[i];
	}

	int method4714() {
		return 1730560953 * ((Class391) this).anInt4660;
	}

	int method4715() {
		return 1730560953 * ((Class391) this).anInt4660;
	}

	Class572_Sub12_Sub13 method4716(int i, int i_1_, String string, String string_2_, String string_3_, String string_4_, String string_5_, int i_6_, byte i_7_) {
		Class572_Sub12_Sub13 class572_sub12_sub13 = ((Class391) this).aClass572_Sub12_Sub13Array4659[99];
		for (int i_8_ = ((Class391) this).anInt4660 * 1730560953; i_8_ > 0; i_8_--) {
			if (100 != i_8_)
				((Class391) this).aClass572_Sub12_Sub13Array4659[i_8_] = (((Class391) this).aClass572_Sub12_Sub13Array4659[i_8_ - 1]);
		}
		if (class572_sub12_sub13 == null)
			class572_sub12_sub13 = new Class572_Sub12_Sub13(i, i_1_, string, string_2_, string_3_, string_5_, i_6_, string_4_);
		else {
			class572_sub12_sub13.method6794((byte) 109);
			class572_sub12_sub13.method8412(724585842);
			class572_sub12_sub13.method10409(i, i_1_, string, string_2_, string_3_, string_5_, i_6_, string_4_, (byte) 88);
		}
		((Class391) this).aClass572_Sub12_Sub13Array4659[0] = class572_sub12_sub13;
		if (1730560953 * ((Class391) this).anInt4660 < 100)
			((Class391) this).anInt4660 += -1665609079;
		return class572_sub12_sub13;
	}

	int method4717() {
		return 1730560953 * ((Class391) this).anInt4660;
	}

	static final void method4718(Cs2Executor class441, byte i) {
		int i_9_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_9_, (short) -7115);
		Class83 class83 = Class534.aClass83Array5975[i_9_ >> 16];
		Class500.method5949(class73, class83, class441, (byte) 40);
	}

	static final void method4719(Cs2Executor class441, int i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547.method6461(i_10_);
		if (null == class572_sub12_sub5)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub12_sub5.anInt11321 * 2132255543;
	}

	static final void method4720(Cs2Executor class441, int i) throws Exception_Sub4 {
		Class133_Sub1.aClass411_Sub1_9827.method4988((float) (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) / 1000.0F, (byte) -62);
	}

	public static void method4721(Class672 class672, Frame frame, byte i) {
		class672.method7889(854587594);
		frame.setVisible(false);
		frame.dispose();
	}

	static final void method4722(InterfaceDefinitions class73, byte[] is, byte[] is_11_, Cs2Executor class441, byte i) {
		int i_12_ = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) - 1);
		if (i_12_ < 0 || i_12_ > 9)
			throw new RuntimeException();
		Class527.method6319(class73, i_12_, is, is_11_, class441, 1220347959);
	}

	public static Class668 method4723(int i) {
		if (null == Class448.aClass668_5165)
			return Class668.aClass668_8514;
		return Class448.aClass668_5165;
	}
}

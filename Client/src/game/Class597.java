package game;

/* Class597 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class597 {
	static Class597 aClass597_7839;
	public static Class597 aClass597_7840;
	static Class597 aClass597_7841;
	public static Class597 aClass597_7842;
	static Class597 aClass597_7843 = new Class597(0);
	public static Class597 aClass597_7844;
	public static Class597 aClass597_7845;
	static Class597 aClass597_7846;
	static Class597 aClass597_7847;
	int anInt7848;

	static {
		aClass597_7840 = new Class597(1);
		aClass597_7841 = new Class597(2);
		aClass597_7842 = new Class597(3);
		aClass597_7845 = new Class597(4);
		aClass597_7844 = new Class597(5);
		aClass597_7839 = new Class597(6);
		aClass597_7846 = new Class597(7);
		aClass597_7847 = new Class597(8);
	}

	Class597(int i) {
		((Class597) this).anInt7848 = i * 717662179;
	}

	public static Interface67 method7040(int i) {
		if (Class585.anInterface67_7773 == null)
			throw new IllegalStateException("");
		return Class585.anInterface67_7773;
	}

	static final void method7041(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -656019134) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray897 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method7042(Cs2Executor class441, byte i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub15_9244, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 1977186761);
		Class623.method7443(-2079700607);
		client.aBool8854 = false;
	}

	static final void method7043(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}

	public static final void method7044(boolean bool, int i, short i_0_) {
		Class572_Sub10 class572_sub10 = (bool ? Class251.aClass572_Sub10_2731 : Class55.aClass572_Sub10_526);
		if (class572_sub10 != null && i >= 0 && i < class572_sub10.anInt9082 * -58096969) {
			Class343 class343 = class572_sub10.aClass343Array9084[i];
			if (class343.aByte4360 == -1) {
				String string = class343.aString4361;
				Class195 class195 = Class166.method2676((byte) 40);
				Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3784, class195.aClass650_2340, -1644257917);
				class572_sub25.aRsByteBuffer.writeByte(3 + ObjectDefinitions.method6069(string, -975506209), -1384395473);
				class572_sub25.aRsByteBuffer.writeByte(bool ? 1 : 0, -1384395473);
				class572_sub25.aRsByteBuffer.writeShort(i, -1689698205);
				class572_sub25.aRsByteBuffer.writeString(string, (byte) -119);
				class195.method2929(class572_sub25, (byte) -71);
			}
		}
	}

	static final void method7045(Cs2Executor class441, byte i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) -15757);
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		i_2_--;
		if (null == class73.aStringArray867 || i_2_ >= class73.aStringArray867.length || class73.aStringArray867[i_2_] == null)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class73.aStringArray867[i_2_];
	}
}

package game;

/* Class539 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class539 implements Interface61 {
	int anInt6060;

	public void method151() {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3766, client.aClass195_8589.aClass650_2340, 351301525);
		class572_sub25.aRsByteBuffer.writeShort128(((Class539) this).anInt6060 * 930725033, -16711936);
		client.aClass195_8589.method2929(class572_sub25, (byte) -27);
	}

	public void method299(short i) {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3766, client.aClass195_8589.aClass650_2340, -1352301651);
		class572_sub25.aRsByteBuffer.writeShort128(((Class539) this).anInt6060 * 930725033, -16711936);
		client.aClass195_8589.method2929(class572_sub25, (byte) -122);
	}

	Class539(int i) {
		((Class539) this).anInt6060 = -1941133415 * i;
	}

	static void method6401(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 2]), 1713987547))).aStringArray4633[(((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1])]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
	}

	static final void method6402(InterfaceDefinitions class73, Class83 class83, boolean bool, int i, Cs2Executor class441, byte i_0_) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_1_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		if (class73.activeComponent * -1665128073 == -1 && !class83.aBool1079) {
			Class575.method6828(class73.selfId * -1718435171, 853490396);
			Class251.method3504(-1718435171 * class73.selfId, -1769071719);
			Class572_Sub17.method8580(-1718435171 * class73.selfId, (byte) -101);
		}
		if (i_1_ == -1) {
			class73.anInt892 = -2072488665;
			class73.anInt803 = -771890247;
			class73.nvmtheindexisotherone = 2060589165;
		} else {
			class73.nvmtheindexisotherone = -2060589165 * i_1_;
			class73.anInt903 = i_2_ * -1311041011;
			class73.aBool864 = bool;
			ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_1_, 480186469));
			class73.anInt798 = 2031078375 * class631.anInt8157;
			class73.anInt799 = class631.anInt8120 * -1019640337;
			class73.anInt800 = class631.anInt8166 * 302551535;
			class73.anInt860 = 61707827 * class631.anInt8138;
			class73.anInt797 = -478393639 * class631.anInt8139;
			class73.anInt804 = class631.anInt8134 * 262995269;
			class73.anInt809 = 511305397 * i;
			if (class73.anInt805 * -96689919 > 0)
				class73.anInt804 = -1342032263 * (-1656063712 * class73.anInt804 / (-96689919 * class73.anInt805));
			else if (class73.anInt760 * 1473094557 > 0)
				class73.anInt804 = (-1656063712 * class73.anInt804 / (class73.anInt760 * 1473094557) * -1342032263);
		}
	}
}

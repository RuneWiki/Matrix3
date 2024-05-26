package game;

/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35 implements Interface2 {
	int anInt385;
	Class46 this$0;

	public void method17(Class49 class49) {
		Class116 class116 = (Class116) class49.method846((byte) 28).get(((Class35) this).anInt385 * -112444687);
		class49.method881(((Class35) this).anInt385 * -112444687, -1225762349);
		class116.method2143((byte) 14);
	}

	public void method15(Class49 class49, int i) {
		Class116 class116 = (Class116) class49.method846((byte) 28).get(((Class35) this).anInt385 * -112444687);
		class49.method881(((Class35) this).anInt385 * -112444687, -2003379401);
		class116.method2143((byte) 117);
	}

	public void method16(Class49 class49) {
		Class116 class116 = (Class116) class49.method846((byte) 28).get(((Class35) this).anInt385 * -112444687);
		class49.method881(((Class35) this).anInt385 * -112444687, 2089502070);
		class116.method2143((byte) 47);
	}

	Class35(Class46 class46, RSByteBuffer class572_sub15) {
		((Class35) this).this$0 = class46;
		((Class35) this).anInt385 = class572_sub15.readUnsignedShort(647518597) * 152401425;
	}

	public static void method782(short i) {
		Class69.method1070(-264897474);
		Class25.aBool165 = false;
		VarBitDefinition.method5229(Class442.anInt5133 * -699022169, Class202_Sub1.anInt9650 * 1113238055, -1568261905 * Class25.anInt180, Class665_Sub31.anInt9619 * -776124211, 2124627618);
		Class572_Sub16_Sub12.aClass572_Sub12_Sub10_11311 = null;
		Class580.aClass572_Sub12_Sub10_7702 = null;
	}

	static void method783(int i, int i_0_, int i_1_, Class572_Sub40 class572_sub40, short i_2_) {
		long l = (long) (i << 28 | i_1_ << 14 | i_0_);
		Class572_Sub42 class572_sub42 = (Class572_Sub42) client.aClass676_8749.get(l);
		if (class572_sub42 == null) {
			class572_sub42 = new Class572_Sub42();
			client.aClass676_8749.put(class572_sub42, l);
			class572_sub42.aClass675_9435.method7940(class572_sub40, -2022820488);
		} else {
			ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(((class572_sub40.anInt9401) * 1544118073), 706296914));
			int i_3_ = class631.anInt8142 * -1448231669;
			if (1 == 532985983 * class631.anInt8174)
				i_3_ *= (-1812999493 * ((Class572_Sub40) class572_sub40).anInt9400) + 1;
			for (Class572_Sub40 class572_sub40_4_ = ((Class572_Sub40) class572_sub42.aClass675_9435.method7932((byte) 50)); class572_sub40_4_ != null; class572_sub40_4_ = ((Class572_Sub40) class572_sub42.aClass675_9435.method7926(828019570))) {
				class631 = (ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition(1544118073 * class572_sub40_4_.anInt9401, -191752899));
				int i_5_ = -1448231669 * class631.anInt8142;
				if (532985983 * class631.anInt8174 == 1)
					i_5_ *= (((Class572_Sub40) class572_sub40_4_).anInt9400 * -1812999493) + 1;
				if (i_3_ > i_5_) {
					Cs2Executor.method5280(class572_sub40, class572_sub40_4_, 1572833689);
					return;
				}
			}
			class572_sub42.aClass675_9435.method7940(class572_sub40, -1491720302);
		}
	}

	static final void method784(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_6_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_7_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_6_, -930589879));
		if (ScriptVarType.aClass283_3261 == class645.aClass283_8314) {
			/* empty */
		}
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = class645.method7632(i_7_, -756724828);
	}
}

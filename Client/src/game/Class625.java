package game;

/* Class625 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class625 {
	int anInt8081;
	static Class625 aClass625_8082;
	public static Class625 aClass625_8083 = new Class625(1);

	static {
		aClass625_8082 = new Class625(0);
	}

	Class625(int i) {
		((Class625) this).anInt8081 = -1553105707 * i;
	}

	public static void method7454(int i, int i_0_, int i_1_, byte i_2_) {
		Class587.method6962(new Class255_Sub1(i, i_0_, i_1_, client.anInt8814 * -1396889455, 53108039 * Class51.aClass278_491.anInt2942, -2020283055 * Class51.aClass278_491.anInt2943, Class51.aClass278_491.method3745(-748320724), Class51.aClass278_491.method3723(-523257156), Class540.aClass267_6063.method3638(1524163224)), (byte) 0);
	}

	static final void method7455(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		int i_3_ = -1;
		int i_4_ = -1;
		Class71 class71 = class73.method1099(Class272_Sub2.aClass106_9517, -1533945559);
		if (class71 != null) {
			i_3_ = -1355315821 * class71.anInt711;
			i_4_ = -1763697347 * class71.anInt710;
		}
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_3_;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_4_;
	}

	static final void method7456(Cs2Executor class441, int i) {
		if (1472719885 * client.anInt8861 == 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -2;
		else if (1 == client.anInt8861 * 1472719885)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.anInt8860 * 681720871;
	}

	static final int method7457(Entity class456_sub1_sub2_sub3, int i) {
		if (0 == 1589221153 * class456_sub1_sub2_sub3.anInt11653)
			return 0;
		if (-1 != -1639699965 * class456_sub1_sub2_sub3.anInt11619) {
			Entity class456_sub1_sub2_sub3_5_ = null;
			if (class456_sub1_sub2_sub3.anInt11619 * -1639699965 < 32768) {
				LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) (class456_sub1_sub2_sub3.anInt11619 * -1639699965))));
				if (null != class572_sub9)
					class456_sub1_sub2_sub3_5_ = (Entity) class572_sub9.anObject9081;
			} else if (class456_sub1_sub2_sub3.anInt11619 * -1639699965 >= 32768)
				class456_sub1_sub2_sub3_5_ = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[(-1639699965 * class456_sub1_sub2_sub3.anInt11619 - 32768)]);
			if (class456_sub1_sub2_sub3_5_ != null) {
				Class240 class240 = Class240.method3277((class456_sub1_sub2_sub3.method5394().aClass240_2647), class456_sub1_sub2_sub3_5_.method5394().aClass240_2647);
				int i_6_ = (int) class240.aFloat2653;
				int i_7_ = (int) class240.aFloat2657;
				if (0 != i_6_ || i_7_ != 0)
					class456_sub1_sub2_sub3.method10546((int) (Math.atan2((double) i_6_, (double) i_7_) * 2607.5945876176133) & 0x3fff, -2090420146);
			}
		}
		if (class456_sub1_sub2_sub3 instanceof Player) {
			Player class456_sub1_sub2_sub3_sub2 = (Player) class456_sub1_sub2_sub3;
			if (class456_sub1_sub2_sub3_sub2.anInt11827 * -1319740849 != -1 && (-2037536229 * class456_sub1_sub2_sub3_sub2.stepsCount == 0 || (891354269 * class456_sub1_sub2_sub3_sub2.anInt11662 > 0))) {
				class456_sub1_sub2_sub3_sub2.method10546(class456_sub1_sub2_sub3_sub2.anInt11827 * -1319740849, -2135899766);
				class456_sub1_sub2_sub3_sub2.anInt11827 = 1381598033;
			}
		} else if (class456_sub1_sub2_sub3 instanceof NPC) {
			NPC class456_sub1_sub2_sub3_sub1 = (NPC) class456_sub1_sub2_sub3;
			if (-171642327 * class456_sub1_sub2_sub3_sub1.anInt11799 != -1 && (class456_sub1_sub2_sub3_sub1.stepsCount * -2037536229 == 0 || (891354269 * class456_sub1_sub2_sub3_sub1.anInt11662 > 0))) {
				Class240 class240 = class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647;
				Class497 class497 = client.aClass613_8605.method7280((byte) -85);
				int i_8_ = ((int) class240.aFloat2653 - (class456_sub1_sub2_sub3_sub1.anInt11799 * -990762752 - 1108817664 * class497.localX - class497.localX * 1108817664));
				int i_9_ = ((int) class240.aFloat2657 - (class456_sub1_sub2_sub3_sub1.anInt11800 * 192246528 - class497.localY * -539198720 - -539198720 * class497.localY));
				if (0 != i_8_ || i_9_ != 0)
					class456_sub1_sub2_sub3_sub1.method10546((int) (Math.atan2((double) i_8_, (double) i_9_) * 2607.5945876176133) & 0x3fff, -2055572758);
				class456_sub1_sub2_sub3_sub1.anInt11799 = 919549415;
			}
		}
		return class456_sub1_sub2_sub3.method10517((short) -10592);
	}
}

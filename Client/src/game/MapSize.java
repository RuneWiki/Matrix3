package game;

/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class MapSize {
	MaterialInformation[] textures;
	int anInt1249;

	public MaterialInformation getTexture(int i, int i_0_) {
		return ((MapSize) this).textures[i];
	}

	public MapSize(Class248 class248) {
		((MapSize) this).anInt1249 = class248.method3376(0, -792119799) * 1513963923;
		((MapSize) this).textures = new MaterialInformation[1920009371 * ((MapSize) this).anInt1249];
		for (int i = 0; i < 1920009371 * ((MapSize) this).anInt1249; i++) {
			RSByteBuffer class572_sub15 = new RSByteBuffer(class248.getFile(0, i, 161590220));
			if (class572_sub15.b == null)
				((MapSize) this).textures[i] = null;
			else {
				try {
					MaterialInformation class101 = new MaterialInformation();
					class101.method1597(i, class572_sub15, 1518948721);
					((MapSize) this).textures[i] = class101;
				} catch (Exception exception) {
					((MapSize) this).textures[i] = null;
				}
			}
		}
	}

	public static void method1539(int i) {
		Class571.method6791();
	}

	static final void method1540(Cs2Executor class441, byte i) {
		Class133_Sub1.aClass411_Sub1_9827.method5022((byte) -38);
	}

	static final void method1541(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class508.method6040(class73, class83, class441, 195509238);
	}

	static final void method1542(Cs2Executor class441, int i) {
		Class285.method3859((((Cs2Executor) class441).entity), (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), true, (byte) 15);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[0];
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[1];
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) client.aFloatArray8677[2];
	}

	static byte[] method1543(Class248 class248, JS5ConfigGroup jS5ConfigGroup, int i, int i_1_) {
		if (jS5ConfigGroup.method3106(-8711980) > 1)
			return class248.getFile(jS5ConfigGroup.method3101(i, 1616054708), jS5ConfigGroup.method3102(i, -76818276), 845590363);
		return class248.getFile(1890065851 * jS5ConfigGroup.anInt2591, i, 1267859930);
	}

	static final void method1544(Cs2Executor class441, int i) {
		Class216.method3080(ScriptVarType.method3828(1888270523), class441, 546795789);
	}

	static boolean method1545(boolean bool, boolean bool_2_, String string, String string_3_, long l) {
		Class13.aBool67 = bool;
		if (!bool_2_)
			Class13.anInt68 = 916769883;
		Class13.aBool66 = bool_2_;
		Class13.aString70 = string;
		Class13.aString103 = string_3_;
		Class13.aLong79 = l * 4922727120155625359L;
		if (!Class13.aBool66 && (Class13.aString70.equals("") || Class13.aString103.equals(""))) {
			Class276.method3715(3, 705464737);
			Class430.method5240(-714083908);
			return false;
		}
		if (Class13.anInt64 * -298874073 != 176) {
			Class13.anInt110 = 0;
			Class13.anInt90 = 394872319;
			Class13.anInt111 = 1150282425;
		}
		Class13.aClass195_96.aBool2344 = false;
		Class276.method3715(-3, 1653464797);
		Class13.anInt97 = -185065007;
		Class13.anInt100 = 0;
		Class13.anInt101 = 0;
		return true;
	}

	static final void method1546(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1;
	}

	static void method1547(int i, String string, int i_4_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(2, (long) i);
		class572_sub12_sub11.method10338(1241506960);
		((GameTask) class572_sub12_sub11).aString11408 = string;
	}
}

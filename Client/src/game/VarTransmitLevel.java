package game;

/* Class621 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import com.jagex.twitchtv.TwitchEvent;

public class VarTransmitLevel implements Interface52 {
	int anInt8063;
	public static VarTransmitLevel ALWAYS_ON_SET_TO_FILE;
	public static VarTransmitLevel DIFFERENT_ON_SET_TO_SERVER;
	public static VarTransmitLevel NEVER = new VarTransmitLevel(0);
	public static Applet anApplet8067;

	public int method43() {
		return ((VarTransmitLevel) this).anInt8063 * -744940133;
	}

	public int getId(int i) {
		return ((VarTransmitLevel) this).anInt8063 * -744940133;
	}

	public int method143() {
		return ((VarTransmitLevel) this).anInt8063 * -744940133;
	}

	VarTransmitLevel(int i) {
		((VarTransmitLevel) this).anInt8063 = -126091117 * i;
	}

	public int method45() {
		return ((VarTransmitLevel) this).anInt8063 * -744940133;
	}

	public int method61() {
		return ((VarTransmitLevel) this).anInt8063 * -744940133;
	}

	static {
		ALWAYS_ON_SET_TO_FILE = new VarTransmitLevel(1);
		DIFFERENT_ON_SET_TO_SERVER = new VarTransmitLevel(2);
	}

	static final void method7436(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -7427);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = class73.aString829;
	}

	public static void method7437(Class572_Sub12 class572_sub12, Class572_Sub12 class572_sub12_1_, byte i) {
		if (class572_sub12.aClass572_Sub12_9092 != null)
			class572_sub12.method8412(724585842);
		class572_sub12.aClass572_Sub12_9092 = class572_sub12_1_.aClass572_Sub12_9092;
		class572_sub12.aClass572_Sub12_9094 = class572_sub12_1_;
		class572_sub12.aClass572_Sub12_9092.aClass572_Sub12_9094 = class572_sub12;
		class572_sub12.aClass572_Sub12_9094.aClass572_Sub12_9092 = class572_sub12;
	}

	static final void method7438(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class124.method2205(class73, class83, class441, 2058443343);
	}

	public static void method7439(int i, TwitchEvent twitchevent, int i_2_) {
		Cs2Script class572_sub12_sub8 = Class224.method3150(Class530.aClass530_5924, i, -1, -560680881);
		if (null != class572_sub12_sub8) {
			Cs2Executor class441 = Class519.getCachedExecutor(-1452806256);
			if (0 != -2100895907 * class572_sub12_sub8.nLongLocals)
				((Cs2Executor) class441).longLocals = new long[-2100895907 * class572_sub12_sub8.nLongLocals];
			if (0 != class572_sub12_sub8.nIntLocals * -210642863)
				((Cs2Executor) class441).intLocals = new int[-210642863 * class572_sub12_sub8.nIntLocals];
			if (0 != class572_sub12_sub8.nObjectLocals * 1139034625)
				((Cs2Executor) class441).objectLocals = new String[class572_sub12_sub8.nObjectLocals * 1139034625];
			twitchevent.method7458(((Cs2Executor) class441).intLocals, ((Cs2Executor) class441).longLocals, ((Cs2Executor) class441).objectLocals);
			Class572_Sub16_Sub3.method10067(class572_sub12_sub8, 200000, class441, 1913809632);
		}
	}
}

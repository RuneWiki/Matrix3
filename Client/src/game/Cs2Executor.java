package game;

/* Class441 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Cs2Executor {
	public Cs2LaunchArgs custom_launchargs; // customly added
	public Map playerentity_configs_map;
	public Object[] objectLocals;
	public int intStackPtr;
	public int[] globalArrayLengths = new int[5];
	public int[][] globalArrays = new int[5][5000];
	public int objectStackPtr;
	public Class572_Sub10 aClass572_Sub10_5104;
	public Class305 aClass305_5105;
	public int[] intLocals;
	public Class574[] aClass574Array5107;
	public int longStackPtr;
	public long[] longStack;
	public Cs2CallPointer[] callStack;
	public int instrPtr;
	public UnderlayDefinition aClass443_5112;
	public int[] intStack = new int[1000];
	public Class334 current_clan;
	public int callStackPtr;
	public Entity entity;
	public Interface65 anInterface65_5117;
	public Class456_Sub1_Sub5_Sub1 aClass456_Sub1_Sub5_Sub1_5118;
	public Map main_configs_map;
	public long[] longLocals;
	public int anInt5121;
	public int anInt5122;
	public Class189 aClass189_5123;
	public int[] anIntArray5124;
	public Object[] objectStack;
	public UnderlayDefinition aClass443_5126;
	public Cs2Script current;
	public boolean aBool5128;

	Cs2Executor() {
		((Cs2Executor) this).intStackPtr = 0;
		((Cs2Executor) this).objectStack = new Object[1000];
		((Cs2Executor) this).objectStackPtr = 0;
		((Cs2Executor) this).longStack = new long[1000];
		((Cs2Executor) this).longStackPtr = 0;
		((Cs2Executor) this).callStackPtr = 0;
		((Cs2Executor) this).callStack = new Cs2CallPointer[50];
		((Cs2Executor) this).aClass443_5126 = new UnderlayDefinition();
		((Cs2Executor) this).aClass443_5112 = new UnderlayDefinition();
		((Cs2Executor) this).main_configs_map = new HashMap();
		((Cs2Executor) this).playerentity_configs_map = new HashMap();
		((Cs2Executor) this).anInt5121 = 0;
		((Cs2Executor) this).instrPtr = 1866055967;
	}

	public static void method5280(Class572 class572, Class572 class572_0_, int i) {
		if (class572.aClass572_6431 != null)
			class572.method6794((byte) -39);
		class572.aClass572_6431 = class572_0_.aClass572_6431;
		class572.aClass572_6433 = class572_0_;
		class572.aClass572_6431.aClass572_6433 = class572;
		class572.aClass572_6433.aClass572_6431 = class572;
	}
}

package game;

/* Class531 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Class531 {
	Class545 aClass545_5928;
	public Class456_Sub1 aClass456_Sub1_5929;
	boolean aBool5930;
	static Stack aStack5931 = new Stack();
	public static Class635_Sub1 aClass635_Sub1_5932;

	public boolean method6339(Class106 class106, int i, int i_0_, int i_1_) {
		int i_2_ = aClass456_Sub1_5929.method8298(2091385092);
		if (aClass456_Sub1_5929.aClass90Array9007 != null) {
			for (int i_3_ = 0; i_3_ < aClass456_Sub1_5929.aClass90Array9007.length; i_3_++) {
				aClass456_Sub1_5929.aClass90Array9007[i_3_].anInt1229 <<= i_2_;
				if ((aClass456_Sub1_5929.aClass90Array9007[i_3_].method1510(i + (1883590907 * (((Class545) ((Class531) this).aClass545_5928).anInt6112)), i_0_ + (((Class545) ((Class531) this).aClass545_5928).anInt6113) * 1828085115)) && aClass456_Sub1_5929.method8297(class106, i, i_0_, 199502043)) {
					aClass456_Sub1_5929.aClass90Array9007[i_3_].anInt1229 >>= i_2_;
					return true;
				}
				aClass456_Sub1_5929.aClass90Array9007[i_3_].anInt1229 >>= i_2_;
			}
		}
		return false;
	}

	Class531() {
		/* empty */
	}

	public static void method6340() {
		synchronized (aStack5931) {
			aStack5931 = new Stack();
		}
	}

	//load script
	static void executeCs2(Cs2LaunchArgs args, int maxInstrs, int i_4_) {
		Object[] params = args.params;
		int scriptId = ((Integer) params[0]).intValue();
		Cs2Script script = Class217.method3081(scriptId, (byte) -4);
		if (null != script) {
			Cs2Executor executor = Class519.getCachedExecutor(-1452806256);
			executor.custom_launchargs = args; // customly added
			((Cs2Executor) executor).intLocals = new int[script.nIntLocals * -210642863];
			int i_6_ = 0;
			((Cs2Executor) executor).objectLocals = new String[script.nObjectLocals * 1139034625];
			int i_7_ = 0;
			((Cs2Executor) executor).longLocals = new long[script.nLongLocals * -2100895907];
			int i_8_ = 0;
			for (int i_9_ = 1; i_9_ < params.length; i_9_++) {
				if (params[i_9_] instanceof Integer) {
					int i_10_ = ((Integer) params[i_9_]).intValue();
					if (i_10_ == -2147483647)
						i_10_ = 430690489 * args.anInt9148;
					if (i_10_ == -2147483646)
						i_10_ = -397807467 * args.anInt9150;
					if (i_10_ == -2147483645)
						i_10_ = (args.thizInterface != null ? (args.thizInterface.selfId * -1718435171) : -1);
					if (-2147483644 == i_10_)
						i_10_ = args.anInt9152 * 391913173;
					if (i_10_ == -2147483643) {
						i_10_ = (args.thizInterface != null ? (-1665128073 * args.thizInterface.activeComponent) : -1);
					}
					if (-2147483642 == i_10_)
						i_10_ = (null != args.targetInterface ? (-1718435171 * args.targetInterface.selfId) : -1);
					if (-2147483641 == i_10_)
						i_10_ = (args.targetInterface != null ? (args.targetInterface.activeComponent * -1665128073) : -1);
					if (i_10_ == -2147483640)
						i_10_ = -526417153 * args.anInt9145;
					if (i_10_ == -2147483639)
						i_10_ = -1927887091 * args.anInt9153;
					((Cs2Executor) executor).intLocals[i_6_++] = i_10_;
				} else if (params[i_9_] instanceof String) {
					String string = (String) params[i_9_];
					if (string.equals("event_opbase"))
						string = args.aString9154;
					((Cs2Executor) executor).objectLocals[i_7_++] = string;
				} else if (params[i_9_] instanceof Long) {
					long l = ((Long) params[i_9_]).longValue();
					((Cs2Executor) executor).longLocals[i_8_++] = l;
				}
			}
			((Cs2Executor) executor).anInt5121 = ((Cs2LaunchArgs) args).anInt9155 * 1847933225;
			Class572_Sub16_Sub3.method10067(script, maxInstrs, executor, -1346936427);
			((Cs2Executor) executor).anInt5121 = 0;
		}
	}

	static final void method6342(Cs2Executor class441, int i) {
		Class319.method4093(-997300593);
	}

	static final void method6343(Cs2Executor class441, byte i) {
		int i_11_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = ((Cs2Executor) class441).current_clan.aStringArray4281[i_11_];
	}

	static final void method6344(InterfaceDefinitions class73, Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_12_ = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]) - 1);
		int i_13_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_14_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (i_12_ < 0 || i_12_ > 9)
			throw new RuntimeException();
		Class286.method3862(class73, i_12_, i_13_, i_14_, class441, 1590232863);
	}
}

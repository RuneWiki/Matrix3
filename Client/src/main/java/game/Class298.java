package game;

/* Class298 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298 {
	public static Class298 aClass298_3478 = new Class298();
	public static Class298 aClass298_3479 = new Class298();
	public static short[] aShortArray3480;
	public static Class102 aClass102_3481;

	Class298() {
		/* empty */
	}

	static final void method3972(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_0_ != class73.anInt926 * -1286545333) {
			if (-1 != i_0_) {
				if (null == class73.aClass663_915)
					class73.aClass663_915 = new Class663_Sub1();
				class73.aClass663_915.method7801(i_0_, 751680147);
			} else
				class73.aClass663_915 = null;
			class73.anInt926 = i_0_ * 396355939;
			Class555.method6575(class73, (short) 10235);
		}
		if (-1 == class73.activeComponent * -1665128073 && !class83.aBool1079)
			Class490.method5851(-1718435171 * class73.selfId, (byte) 72);
	}

	static final void method3973(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.stepsCount * -2037536229);
	}

	static final void method3974(int i) {
		Class21.method700(Class272_Sub2.aClass106_9517, (short) 8192);
		if (-1498269815 * client.anInt8714 != Class274.anInt2911 * -374189215)
			Class286.method3869((byte) -55);
	}

	static int[] method3975(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		int[] is = null;
		if (Class281.method3797((((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402) * -44467871, 986747472))
			is = ((ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition((int) ((((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11395) * -6760453999157901937L), -1974903904))).anIntArray8160;
		else if ((((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11394 * -544336619) != -1)
			is = ((ItemDefinitions) (Class672.aClass639_Sub5_8533.getDefinition((((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11394 * -544336619), -1017323723))).anIntArray8160;
		else if (Class481.method5737(-44467871 * (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402), -1689562333)) {
			LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) (int) (((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11395 * -6760453999157901937L))));
			if (null != class572_sub9) {
				NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
				NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
				if (class410.anIntArray4795 != null)
					class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 946163532);
				if (null != class410)
					is = class410.anIntArray4850;
			}
		} else if (Class378.method4632((((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402 * -44467871), 1416311620)) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (client.aClass613_8605.method7288(680550066).getDefinition((int) ((((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11395) * -6760453999157901937L >>> 32 & 0x7fffffffL), 2011166085)));
			if (null != class509.anIntArray5605)
				class509 = class509.method6047(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 623307957);
			if (class509 != null)
				is = class509.anIntArray5631;
		}
		return is;
	}
}

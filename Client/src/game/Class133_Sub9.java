package game;

/* Class133_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub9 extends Class133 {
	int anInt9855;
	int anInt9856;
	int anInt9857;
	int anInt9858;
	int anInt9859;

	Class133_Sub9(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub9) this).anInt9857 = class572_sub15.readUnsignedShort(647518597) * 439593721;
		int i = class572_sub15.readInt(-336273575);
		((Class133_Sub9) this).anInt9856 = -1011239441 * (i >>> 16);
		((Class133_Sub9) this).anInt9855 = 842766063 * (i & 0xffff);
		((Class133_Sub9) this).anInt9858 = class572_sub15.readUnsignedByte(1087868327) * -2042420365;
		((Class133_Sub9) this).anInt9859 = class572_sub15.readUnsignedByte(2111932508) * -17250069;
	}

	public void method2303(int i) {
		Class442.aClass120Array5129[((Class133_Sub9) this).anInt9857 * -1388382391].method2168(378386875 * ((Class133_Sub9) this).anInt9858, -1169811185 * ((Class133_Sub9) this).anInt9856, -1755293681 * ((Class133_Sub9) this).anInt9855, ((Class133_Sub9) this).anInt9859 * -35676221, 1581692271);
	}

	public void method2309() {
		Class442.aClass120Array5129[((Class133_Sub9) this).anInt9857 * -1388382391].method2168(378386875 * ((Class133_Sub9) this).anInt9858, -1169811185 * ((Class133_Sub9) this).anInt9856, -1755293681 * ((Class133_Sub9) this).anInt9855, ((Class133_Sub9) this).anInt9859 * -35676221, 1358318124);
	}

	static void method9350(int i, byte i_0_) {
		/* empty */
	}

	static final void method9351(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		if ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]) == (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]))
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]));
	}
}

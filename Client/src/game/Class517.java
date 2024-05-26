package game;

/* Class517 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class517 implements Interface57 {
	int anInt5745;
	int anInt5746;

	public boolean method320(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549, int i_0_) {
		for (int i_1_ = 0; i_1_ < i && i_1_ < interface64s.length; i_1_++) {
			Interface64 interface64 = interface64s[i_1_];
			if (null != interface64 && (interface64.method383(-1475284499) == 771219531 * ((Class517) this).anInt5746) && (interface64.method378(-802818188) == ((Class517) this).anInt5745 * 564381025))
				return true;
		}
		return false;
	}

	Class517(int i, int i_2_) {
		((Class517) this).anInt5746 = i * 436267363;
		((Class517) this).anInt5745 = 1670356641 * i_2_;
	}

	public boolean method322(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549) {
		for (int i_3_ = 0; i_3_ < i && i_3_ < interface64s.length; i_3_++) {
			Interface64 interface64 = interface64s[i_3_];
			if (null != interface64 && (interface64.method383(-1540009748) == 771219531 * ((Class517) this).anInt5746) && (interface64.method378(-1878948515) == ((Class517) this).anInt5745 * 564381025))
				return true;
		}
		return false;
	}

	public boolean method321(Class572_Sub13 class572_sub13, Interface64[] interface64s, int i, Class549 class549) {
		for (int i_4_ = 0; i_4_ < i && i_4_ < interface64s.length; i_4_++) {
			Interface64 interface64 = interface64s[i_4_];
			if (null != interface64 && (interface64.method383(-1481540043) == 771219531 * ((Class517) this).anInt5746) && (interface64.method378(-430000154) == ((Class517) this).anInt5745 * 564381025))
				return true;
		}
		return false;
	}

	static final void method6119(Cs2Executor class441, int i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_5_ & 0x3fff;
	}

	static final void method6120(Cs2Executor class441, int i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.anIntArray4274[i_6_];
	}

	static final void method6121(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1887582659 * Class13.anInt115;
	}

	static final void method6122(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub15_9243.method8970(660014728);
	}

	static final void method6123(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		int i_7_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class344.audio.method919(i_7_, 1269016243);
	}

	static void method6124(int i, int i_8_, int i_9_, int i_10_, byte i_11_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(17, (long) i_8_ << 32 | (long) i);
		class572_sub12_sub11.method10338(1704080753);
		((GameTask) class572_sub12_sub11).p1 = 720886855 * i_9_;
		((GameTask) class572_sub12_sub11).p2 = 1921029481 * i_10_;
	}

	static void method6125(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, Class508 class508, int i_17_) {
		Class572_Sub34 class572_sub34 = null;
		for (Class572_Sub34 class572_sub34_18_ = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7932((byte) 50)); null != class572_sub34_18_; class572_sub34_18_ = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7926(303922487))) {
			if ((-2045257115 * ((Class572_Sub34) class572_sub34_18_).anInt9335 == i) && i_12_ == class572_sub34_18_.anInt9334 * 163944051 && i_13_ == class572_sub34_18_.anInt9332 * 254036161 && i_14_ == -451769195 * (((Class572_Sub34) class572_sub34_18_).anInt9333)) {
				class572_sub34 = class572_sub34_18_;
				break;
			}
		}
		if (class572_sub34 == null) {
			class572_sub34 = new Class572_Sub34();
			((Class572_Sub34) class572_sub34).anInt9335 = 164513645 * i;
			((Class572_Sub34) class572_sub34).anInt9333 = -1080959299 * i_14_;
			class572_sub34.anInt9334 = 717749947 * i_12_;
			class572_sub34.anInt9332 = i_13_ * 1117538113;
			Class572_Sub34.aClass675_9336.method7940(class572_sub34, -1508548692);
		}
		class572_sub34.anInt9339 = -1212949019 * i_15_;
		((Class572_Sub34) class572_sub34).anInt9341 = -1781233699 * i_16_;
		((Class572_Sub34) class572_sub34).aClass508_9342 = class508;
		((Class572_Sub34) class572_sub34).aBool9340 = true;
		((Class572_Sub34) class572_sub34).aBool9344 = false;
	}
}

package game;

/* Class309 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class309 {
	public static final int anInt3628 = 0;
	public static final int anInt3629 = 2;
	static final int anInt3630 = 0;
	public static final int anInt3631 = 1;
	public static final int anInt3632 = 2;
	public static final int anInt3633 = 0;
	public int anInt3634;
	public int anInt3635;
	static final int anInt3636 = 1;
	public int anInt3637;
	public int anInt3638;
	int anInt3639;
	public int anInt3640;
	public int anInt3641;
	public int anInt3642;
	public static final int anInt3643 = 1;
	public int anInt3644;
	public int anInt3645 = 0;
	public int anInt3646 = 0;
	static final int anInt3647 = 1;
	boolean aBool3648 = false;
	public long aLong3649;
	public int anInt3650;

	void method4032(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(1797442339);
			if (0 == i_0_)
				break;
			method4034(class572_sub15, i_0_, 2018470549);
		}
	}

	void method4033(RSByteBuffer class572_sub15, int i) {
		if (i == 1)
			((Class309) this).anInt3639 = class572_sub15.readUnsignedShort(647518597) * 1036516239;
		else if (2 == i)
			class572_sub15.readUnsignedByte(173900617);
		else if (i == 3) {
			anInt3640 = class572_sub15.readInt(1359032132) * 573849591;
			anInt3635 = class572_sub15.readInt(-290381996) * 1871362173;
			anInt3642 = class572_sub15.readInt(-769693770) * 359641067;
		} else if (4 == i) {
			anInt3634 = class572_sub15.readUnsignedByte(-40736089) * -457590499;
			anInt3644 = class572_sub15.readInt(1318957764) * -2125925427;
		} else if (i == 6)
			anInt3638 = class572_sub15.readUnsignedByte(573881689) * 838181791;
		else if (8 == i)
			anInt3645 = 1767814477;
		else if (i == 9)
			anInt3646 = -672882889;
		else if (10 == i)
			((Class309) this).aBool3648 = true;
	}

	void method4034(RSByteBuffer class572_sub15, int i, int i_1_) {
		if (i == 1)
			((Class309) this).anInt3639 = class572_sub15.readUnsignedShort(647518597) * 1036516239;
		else if (2 == i)
			class572_sub15.readUnsignedByte(520009329);
		else if (i == 3) {
			anInt3640 = class572_sub15.readInt(1887771989) * 573849591;
			anInt3635 = class572_sub15.readInt(437502455) * 1871362173;
			anInt3642 = class572_sub15.readInt(1516544754) * 359641067;
		} else if (4 == i) {
			anInt3634 = class572_sub15.readUnsignedByte(80078785) * -457590499;
			anInt3644 = class572_sub15.readInt(-877257247) * -2125925427;
		} else if (i == 6)
			anInt3638 = class572_sub15.readUnsignedByte(416983335) * 838181791;
		else if (8 == i)
			anInt3645 = 1767814477;
		else if (i == 9)
			anInt3646 = -672882889;
		else if (10 == i)
			((Class309) this).aBool3648 = true;
	}

	Class309() {
		/* empty */
	}

	void method4035(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1723427240);
			if (0 == i)
				break;
			method4034(class572_sub15, i, 2018470549);
		}
	}

	void method4036(RSByteBuffer class572_sub15, int i) {
		if (i == 1)
			((Class309) this).anInt3639 = class572_sub15.readUnsignedShort(647518597) * 1036516239;
		else if (2 == i)
			class572_sub15.readUnsignedByte(151098403);
		else if (i == 3) {
			anInt3640 = class572_sub15.readInt(266634611) * 573849591;
			anInt3635 = class572_sub15.readInt(-115600194) * 1871362173;
			anInt3642 = class572_sub15.readInt(-990653527) * 359641067;
		} else if (4 == i) {
			anInt3634 = class572_sub15.readUnsignedByte(824160176) * -457590499;
			anInt3644 = class572_sub15.readInt(1979533174) * -2125925427;
		} else if (i == 6)
			anInt3638 = class572_sub15.readUnsignedByte(982876368) * 838181791;
		else if (8 == i)
			anInt3645 = 1767814477;
		else if (i == 9)
			anInt3646 = -672882889;
		else if (10 == i)
			((Class309) this).aBool3648 = true;
	}

	void method4037(int i) {
		anInt3650 = -1282017005 * (Class325.anIntArray4105[-577453201 * ((Class309) this).anInt3639 << 3]);
		long l = (long) (-1627639353 * anInt3640);
		long l_2_ = (long) (anInt3635 * -2138144555);
		long l_3_ = (long) (anInt3642 * -175701821);
		anInt3641 = ((int) Math.sqrt((double) (l_3_ * l_3_ + (l * l + l_2_ * l_2_))) * -1047273853);
		if (0 == 663564549 * anInt3644)
			anInt3644 = -2125925427;
		if (anInt3634 * 1264374069 == 0)
			aLong3649 = 6538007699626321991L;
		else if (1 == 1264374069 * anInt3634) {
			aLong3649 = 8053808872210634681L * (long) (938410328 * anInt3641 / (anInt3644 * 663564549));
			aLong3649 *= -7965896261850644855L * aLong3649;
		} else if (anInt3634 * 1264374069 == 2)
			aLong3649 = 8053808872210634681L * (long) (938410328 * anInt3641 / (anInt3644 * 663564549));
		if (((Class309) this).aBool3648)
			anInt3641 *= -1;
	}

	void method4038(RSByteBuffer class572_sub15, int i) {
		if (i == 1)
			((Class309) this).anInt3639 = class572_sub15.readUnsignedShort(647518597) * 1036516239;
		else if (2 == i)
			class572_sub15.readUnsignedByte(162889454);
		else if (i == 3) {
			anInt3640 = class572_sub15.readInt(223186820) * 573849591;
			anInt3635 = class572_sub15.readInt(-661587685) * 1871362173;
			anInt3642 = class572_sub15.readInt(1359472327) * 359641067;
		} else if (4 == i) {
			anInt3634 = class572_sub15.readUnsignedByte(1352676947) * -457590499;
			anInt3644 = class572_sub15.readInt(314036400) * -2125925427;
		} else if (i == 6)
			anInt3638 = class572_sub15.readUnsignedByte(532860687) * 838181791;
		else if (8 == i)
			anInt3645 = 1767814477;
		else if (i == 9)
			anInt3646 = -672882889;
		else if (10 == i)
			((Class309) this).aBool3648 = true;
	}

	void method4039() {
		anInt3650 = -1282017005 * (Class325.anIntArray4105[-577453201 * ((Class309) this).anInt3639 << 3]);
		long l = (long) (-1627639353 * anInt3640);
		long l_4_ = (long) (anInt3635 * -2138144555);
		long l_5_ = (long) (anInt3642 * -175701821);
		anInt3641 = ((int) Math.sqrt((double) (l_5_ * l_5_ + (l * l + l_4_ * l_4_))) * -1047273853);
		if (0 == 663564549 * anInt3644)
			anInt3644 = -2125925427;
		if (anInt3634 * 1264374069 == 0)
			aLong3649 = 6538007699626321991L;
		else if (1 == 1264374069 * anInt3634) {
			aLong3649 = 8053808872210634681L * (long) (938410328 * anInt3641 / (anInt3644 * 663564549));
			aLong3649 *= -7965896261850644855L * aLong3649;
		} else if (anInt3634 * 1264374069 == 2)
			aLong3649 = 8053808872210634681L * (long) (938410328 * anInt3641 / (anInt3644 * 663564549));
		if (((Class309) this).aBool3648)
			anInt3641 *= -1;
	}

	static final void method4040(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1604592419 * class73.anInt768;
	}

	static void method4041(Class530 class530, int i, int i_6_, Cs2Executor class441, int i_7_) {
		Cs2Script class572_sub12_sub8 = Class224.method3150(class530, i, i_6_, -1457235144);
		if (null == class572_sub12_sub8)
			Class431.method5243(1490243704);
		else {
			((Cs2Executor) class441).intLocals = new int[-210642863 * class572_sub12_sub8.nIntLocals];
			((Cs2Executor) class441).objectLocals = new Object[class572_sub12_sub8.nObjectLocals * 1139034625];
			if (class572_sub12_sub8.aClass530_11388 == Class530.aClass530_5910 || (Class530.aClass530_5912 == class572_sub12_sub8.aClass530_11388) || (Class530.aClass530_5907 == class572_sub12_sub8.aClass530_11388)) {
				int i_8_ = 0;
				int i_9_ = 0;
				if (Class383.aClass73_4610 != null) {
					i_8_ = Class383.aClass73_4610.anInt762 * 278882041;
					i_9_ = -1681379547 * Class383.aClass73_4610.anInt842;
				}
				((Cs2Executor) class441).intLocals[0] = i;
				((Cs2Executor) class441).intLocals[1] = Class26.aClass564_216.method6657((short) 4426) - i_8_;
				((Cs2Executor) class441).intLocals[2] = Class26.aClass564_216.method6658((byte) -84) - i_9_;
			} else if ((class572_sub12_sub8.aClass530_11388 == Class530.aClass530_5922) || (Class530.aClass530_5906 == class572_sub12_sub8.aClass530_11388) || (Class530.aClass530_5908 == class572_sub12_sub8.aClass530_11388) || (Class530.aClass530_5917 == class572_sub12_sub8.aClass530_11388) || (Class530.aClass530_5909 == class572_sub12_sub8.aClass530_11388))
				((Cs2Executor) class441).intLocals[0] = i;
			else if (class572_sub12_sub8.aClass530_11388 == Class530.aClass530_5918)
				((Cs2Executor) class441).intLocals[0] = ((Cs2Executor) class441).anInt5122 * -1777878275;
			Class572_Sub16_Sub3.method10067(class572_sub12_sub8, 200000, class441, -1201834502);
		}
	}

	public static float method4042(Class230 class230, int i) {
		Class240 class240 = Class240.method3316(0.0F, 0.0F, 1.0F);
		class240.method3288(class230);
		double d = Math.atan2((double) class240.aFloat2653, (double) class240.aFloat2657);
		class240.method3261();
		if (d < 0.0)
			d = 3.141592653589793 + (3.141592653589793 + d);
		return (float) d;
	}

	public static void method4043(int i, int i_10_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(4, (long) i);
		class572_sub12_sub11.method10384(-2027239422);
	}
}

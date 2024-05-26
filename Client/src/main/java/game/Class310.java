package game;

/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class310 {
	public static Class310 aClass310_3651;
	public static Class310 aClass310_3652;
	public static Class310 aClass310_3653;
	public static Class310 aClass310_3654;
	public static Class310 aClass310_3655;
	public static Class310 aClass310_3656 = new Class310(1);
	public static Class310 aClass310_3657;
	public static Class310 aClass310_3658;
	public static Class310 aClass310_3659;
	public static Class310 aClass310_3660;
	public static Class310 aClass310_3661;
	public int anInt3662;
	static int anInt3663;

	static {
		aClass310_3652 = new Class310(2);
		aClass310_3651 = new Class310(2);
		aClass310_3654 = new Class310(2);
		aClass310_3653 = new Class310(1);
		aClass310_3660 = new Class310(1);
		aClass310_3657 = new Class310(1);
		aClass310_3658 = new Class310(2);
		aClass310_3659 = new Class310(1);
		aClass310_3655 = new Class310(2);
		aClass310_3661 = new Class310(1);
	}

	Class310(int i) {
		anInt3662 = 666966775 * i;
	}

	static final void method4044(Cs2Executor class441, int i) {
		Class676 class676 = (((Cs2Executor) class441).current.aClass676Array11377[(((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr])]);
		LinkableInt class572_sub26 = ((LinkableInt) class676.get((long) ((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]));
		if (class572_sub26 != null)
			((Cs2Executor) class441).instrPtr += class572_sub26.anInt9258 * 1328944181;
	}

	static final void method4045(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class542.method6436(i_0_, i_1_, false, (short) -13903);
	}

	static final void method4046(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method846((byte) 28).size();
	}

	static final void method4047(Cs2Executor class441, byte i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_2_, 937303086)).equipLookHideSlot) * 1449218281;
	}

	public static Class653 method4048(int i, int i_3_) {
		Class653[] class653s = Class530.method6337(994576910);
		for (int i_4_ = 0; i_4_ < class653s.length; i_4_++) {
			Class653 class653 = class653s[i_4_];
			if (class653.anInt8397 * -591702641 == i)
				return class653;
		}
		return null;
	}

	static void method4049(InterfaceDefinitions class73, int i, int i_5_, boolean bool, byte i_6_) {
		int i_7_ = class73.anInt764 * 669238293;
		int i_8_ = 1360982075 * class73.anInt765;
		if (class73.aByte756 == 0)
			class73.anInt764 = class73.anInt760 * -941352087;
		else if (1 == class73.aByte756)
			class73.anInt764 = -628102339 * (i - class73.anInt760 * 1473094557);
		else if (class73.aByte756 == 2)
			class73.anInt764 = -628102339 * (1473094557 * class73.anInt760 * i >> 14);
		if (0 == class73.aByte757)
			class73.anInt765 = 367149437 * class73.anInt761;
		else if (1 == class73.aByte757)
			class73.anInt765 = -2088867597 * (i_5_ - class73.anInt761 * 1647331279);
		else if (2 == class73.aByte757)
			class73.anInt765 = (i_5_ * (class73.anInt761 * 1647331279) >> 14) * -2088867597;
		if (class73.aByte756 == 4)
			class73.anInt764 = (628663475 * class73.anInt766 * (class73.anInt765 * 1360982075) / (21156219 * class73.anInt767) * -628102339);
		if (4 == class73.aByte757)
			class73.anInt765 = (class73.anInt767 * 21156219 * (class73.anInt764 * 669238293) / (class73.anInt766 * 628663475) * -2088867597);
		if (client.aBool8763 && (client.method7992(class73).anInt9311 * 2066234753 != 0 || -1285279191 * class73.anInt752 == 0)) {
			if (class73.anInt765 * 1360982075 < 5 && 669238293 * class73.anInt764 < 5) {
				class73.anInt765 = -1854403393;
				class73.anInt764 = 1154455601;
			} else {
				if (class73.anInt765 * 1360982075 <= 0)
					class73.anInt765 = -1854403393;
				if (669238293 * class73.anInt764 <= 0)
					class73.anInt764 = 1154455601;
			}
		}
		if (154950255 * InterfaceDefinitions.anInt728 == -1792394419 * class73.anInt854)
			client.aClass73_8880 = class73;
		if (bool && null != class73.anObjectArray897 && (class73.anInt764 * 669238293 != i_7_ || 1360982075 * class73.anInt765 != i_8_)) {
			Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
			class572_sub20.thizInterface = class73;
			class572_sub20.params = class73.anObjectArray897;
			client.aClass675_8812.method7940(class572_sub20, -2076472826);
		}
	}

	static long method4050(Interface65 interface65, int i, int i_9_, int i_10_) {
		long l = 4194304L;
		long l_11_ = -9223372036854775808L;
		ObjectDefinitions class509 = ((ObjectDefinitions) client.aClass613_8605.method7288(1984977017).getDefinition(interface65.method136(-1477527074), -98611311));
		long l_12_ = (long) (i | i_9_ << 7 | interface65.method304(1344808718) << 14 | interface65.method383(-2018827575) << 20 | 0x40000000);
		if (0 == class509.anInt5627 * -1262171129)
			l_12_ |= l_11_;
		if (1 == -648940047 * class509.anInt5660)
			l_12_ |= l;
		l_12_ |= (long) interface65.method136(-1403921719) << 32;
		return l_12_;
	}

	static Class104_Sub2_Sub3 method4051(Class106_Sub2 class106_sub2, Canvas canvas, int i, int i_13_, int i_14_) {
		Class104_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1 = new Class104_Sub2_Sub3_Sub1(class106_sub2, canvas, i, i_13_);
		return class104_sub2_sub3_sub1;
	}
}

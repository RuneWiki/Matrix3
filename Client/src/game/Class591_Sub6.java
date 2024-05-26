package game;

/* Class591_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class591_Sub6 extends Class591 {
	Class652 aClass652_9433 = new Class652();
	public Class566 aClass566_9434;

	public boolean method8799() {
		return ((Class591_Sub6) this).aClass652_9433.method7699(1339095017);
	}

	public void method8800(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class591_Sub5 class591_sub5 = null;
		int i_4_ = 0;
		for (Class591_Sub5 class591_sub5_5_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7697(1805561198); null != class591_sub5_5_; class591_sub5_5_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7698(-1930795528)) {
			i_4_++;
			if (class591_sub5_5_.anInt9404 * 1305829441 == i) {
				class591_sub5_5_.method8783(i, i_0_, i_1_, i_2_, 1163421002);
				return;
			}
			if (class591_sub5_5_.anInt9404 * 1305829441 <= i)
				class591_sub5 = class591_sub5_5_;
		}
		if (null == class591_sub5) {
			if (i_4_ < JS5ConfigGroup.aClass484_2593.anInt5410 * 1697068469)
				((Class591_Sub6) this).aClass652_9433.method7707(new Class591_Sub5(i, i_0_, i_1_, i_2_), (byte) 21);
		} else {
			Class191.method2893(new Class591_Sub5(i, i_0_, i_1_, i_2_), class591_sub5, (byte) -124);
			if (i_4_ >= JS5ConfigGroup.aClass484_2593.anInt5410 * 1697068469)
				((Class591_Sub6) this).aClass652_9433.method7697(186955663).method7002((byte) 25);
		}
	}

	public boolean method8801(int i) {
		return ((Class591_Sub6) this).aClass652_9433.method7699(1528142929);
	}

	public void method8802(int i, int i_6_, int i_7_, int i_8_) {
		Class591_Sub5 class591_sub5 = null;
		int i_9_ = 0;
		for (Class591_Sub5 class591_sub5_10_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7697(-495935631); null != class591_sub5_10_; class591_sub5_10_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7698(-126261438)) {
			i_9_++;
			if (class591_sub5_10_.anInt9404 * 1305829441 == i) {
				class591_sub5_10_.method8783(i, i_6_, i_7_, i_8_, -151728217);
				return;
			}
			if (class591_sub5_10_.anInt9404 * 1305829441 <= i)
				class591_sub5 = class591_sub5_10_;
		}
		if (null == class591_sub5) {
			if (i_9_ < JS5ConfigGroup.aClass484_2593.anInt5410 * 1697068469)
				((Class591_Sub6) this).aClass652_9433.method7707(new Class591_Sub5(i, i_6_, i_7_, i_8_), (byte) 8);
		} else {
			Class191.method2893(new Class591_Sub5(i, i_6_, i_7_, i_8_), class591_sub5, (byte) -90);
			if (i_9_ >= JS5ConfigGroup.aClass484_2593.anInt5410 * 1697068469)
				((Class591_Sub6) this).aClass652_9433.method7697(1357788588).method7002((byte) 4);
		}
	}

	public void method8803(int i, int i_11_, int i_12_, int i_13_) {
		Class591_Sub5 class591_sub5 = null;
		int i_14_ = 0;
		for (Class591_Sub5 class591_sub5_15_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7697(-617710204); null != class591_sub5_15_; class591_sub5_15_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7698(2011559258)) {
			i_14_++;
			if (class591_sub5_15_.anInt9404 * 1305829441 == i) {
				class591_sub5_15_.method8783(i, i_11_, i_12_, i_13_, -1526981888);
				return;
			}
			if (class591_sub5_15_.anInt9404 * 1305829441 <= i)
				class591_sub5 = class591_sub5_15_;
		}
		if (null == class591_sub5) {
			if (i_14_ < JS5ConfigGroup.aClass484_2593.anInt5410 * 1697068469)
				((Class591_Sub6) this).aClass652_9433.method7707(new Class591_Sub5(i, i_11_, i_12_, i_13_), (byte) 30);
		} else {
			Class191.method2893(new Class591_Sub5(i, i_11_, i_12_, i_13_), class591_sub5, (byte) -43);
			if (i_14_ >= JS5ConfigGroup.aClass484_2593.anInt5410 * 1697068469)
				((Class591_Sub6) this).aClass652_9433.method7697(389114555).method7002((byte) 32);
		}
	}

	public Class591_Sub6(Class566 class566) {
		aClass566_9434 = class566;
	}

	public Class591_Sub5 method8804(int i, byte i_16_) {
		Class591_Sub5 class591_sub5 = ((Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7697(1670432977));
		if (class591_sub5 == null || class591_sub5.anInt9404 * 1305829441 > i)
			return null;
		for (Class591_Sub5 class591_sub5_17_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7698(-1555355818); (class591_sub5_17_ != null && 1305829441 * class591_sub5_17_.anInt9404 <= i); class591_sub5_17_ = (Class591_Sub5) ((Class591_Sub6) this).aClass652_9433.method7698(167284746)) {
			class591_sub5.method7002((byte) 105);
			class591_sub5 = class591_sub5_17_;
		}
		if ((-1884348893 * class591_sub5.anInt9406 + 1305829441 * class591_sub5.anInt9404 + 2018543333 * aClass566_9434.anInt6368) > i)
			return class591_sub5;
		class591_sub5.method7002((byte) 90);
		return null;
	}

	public boolean method8805() {
		return ((Class591_Sub6) this).aClass652_9433.method7699(1607588954);
	}
}

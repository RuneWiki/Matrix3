package game;

/* Class404 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class404 {
	Class572_Sub8[] aClass572_Sub8Array4750;
	Interface4 anInterface4_4751;
	Class676 aClass676_4752;

	public Class572_Sub8 method4791(int i, int i_0_) {
		if (i >= ((Class404) this).aClass572_Sub8Array4750.length)
			return null;
		return ((Class404) this).aClass572_Sub8Array4750[i];
	}

	public Class572_Sub8 method4792(String string, int i) {
		long l = ((Class404) this).anInterface4_4751.method19(string, (byte) 1);
		for (Class572_Sub8 class572_sub8 = (Class572_Sub8) ((Class404) this).aClass676_4752.get(l); class572_sub8 != null; class572_sub8 = (Class572_Sub8) ((Class404) this).aClass676_4752.method7971((byte) 29)) {
			if (((Class572_Sub8) class572_sub8).aString9080.equals(string))
				return class572_sub8;
		}
		return null;
	}

	public Class404(int i, Interface4 interface4) {
		int i_1_;
		for (i_1_ = 1; i_1_ < i; i_1_ += i_1_) {
			/* empty */
		}
		((Class404) this).aClass676_4752 = new Class676(i_1_);
		((Class404) this).aClass572_Sub8Array4750 = new Class572_Sub8[i_1_];
		((Class404) this).anInterface4_4751 = interface4;
	}

	public void method4793(int i, String string, Class572_Sub8 class572_sub8, byte i_2_) {
		Class572_Sub8 class572_sub8_3_ = method4792(string, 349565635);
		if (null != class572_sub8_3_ && -1900408911 * ((Class572_Sub8) class572_sub8_3_).anInt9079 != i)
			throw new IllegalArgumentException(string);
		method4795(i, -1141045035);
		if (i >= ((Class404) this).aClass572_Sub8Array4750.length) {
			int i_4_;
			for (i_4_ = ((Class404) this).aClass572_Sub8Array4750.length; i >= i_4_; i_4_ += i_4_) {
				/* empty */
			}
			((Class404) this).aClass676_4752 = new Class676(i_4_);
			for (int i_5_ = 0; i_5_ < ((Class404) this).aClass572_Sub8Array4750.length; i_5_++) {
				Class572_Sub8 class572_sub8_6_ = ((Class404) this).aClass572_Sub8Array4750[i_5_];
				if (null != class572_sub8_6_)
					((Class404) this).aClass676_4752.put(class572_sub8_6_, class572_sub8_6_.hash * 381237825124074065L);
			}
			Class572_Sub8[] class572_sub8s = new Class572_Sub8[i_4_];
			for (int i_7_ = 0; i_7_ < ((Class404) this).aClass572_Sub8Array4750.length; i_7_++)
				class572_sub8s[i_7_] = ((Class404) this).aClass572_Sub8Array4750[i_7_];
			((Class404) this).aClass572_Sub8Array4750 = class572_sub8s;
		}
		((Class572_Sub8) class572_sub8).anInt9079 = -971712175 * i;
		((Class572_Sub8) class572_sub8).aString9080 = string;
		((Class404) this).aClass676_4752.put(class572_sub8, ((Class404) this).anInterface4_4751.method19(string, (byte) 1));
		((Class404) this).aClass572_Sub8Array4750[i] = class572_sub8;
	}

	void method4794(int i) {
		Class572_Sub8 class572_sub8 = method4791(i, 629740530);
		if (class572_sub8 != null) {
			class572_sub8.method6794((byte) -92);
			((Class404) this).aClass572_Sub8Array4750[((Class572_Sub8) class572_sub8).anInt9079 * -1900408911] = null;
		}
	}

	void method4795(int i, int i_8_) {
		Class572_Sub8 class572_sub8 = method4791(i, 528852928);
		if (class572_sub8 != null) {
			class572_sub8.method6794((byte) -43);
			((Class404) this).aClass572_Sub8Array4750[((Class572_Sub8) class572_sub8).anInt9079 * -1900408911] = null;
		}
	}

	static final void method4796(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_9_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_10_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		if (null == Class534.aClass83Array5975[i_9_])
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else {
			String string = (Class534.aClass83Array5975[i_9_].aClass73Array1081[i_10_].aString748);
			if (string == null)
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = "";
			else
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = string;
		}
	}

	public static Class453[] method4797(int i) {
		return (new Class453[] { Class453.aClass453_5176, Class453.aClass453_5182, Class453.aClass453_5177, Class453.aClass453_5179, Class453.aClass453_5180 });
	}

	public static int method4798(int i, int i_11_) {
		if (i == -37537681 * Class547_Sub1.anInt8981)
			return Class547_Sub1.aBool9004 ? 1 : 0;
		if (Class547_Sub1.anInt8976 * -897840035 == i)
			return Class547_Sub1.aBool8994 ? 1 : 0;
		if (Class547_Sub1.anInt8996 * 571102123 == i)
			return Class547_Sub1.aBool9003 ? 1 : 0;
		return -1;
	}

	static boolean method4799(int i) {
		Class13.anInt64 = -89578530;
		Class13.aClass195_96 = client.aClass195_8589;
		if (client.aByteArray8565 != null) {
			RSByteBuffer class572_sub15 = new RSByteBuffer(client.aByteArray8565);
			Class13.aLong79 = class572_sub15.method8476((byte) 4) * 4922727120155625359L;
			Class13.aLong98 = class572_sub15.method8476((byte) 4) * -2993361953026542521L;
		}
		if (Class13.aLong79 * -1112276700564261009L < 0L) {
			Class276.method3715(35, 284598401);
			return false;
		}
		return MapSize.method1545(false, true, "", "", -1112276700564261009L * Class13.aLong79);
	}

	static final void method4800(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (int) ((Class69.method1067(-1745600704) - Class221.aClass49_2607.method850((byte) 126) - 4469556796047147925L * Class133_Sub6.aLong9845) / 1000L);
	}
}

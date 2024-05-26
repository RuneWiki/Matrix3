package game;

/* Class666 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class666 {
	boolean aBool8496 = false;
	int anInt8497;
	int anInt8498;
	Class572_Sub12_Sub7 aClass572_Sub12_Sub7_8499;
	Class572_Sub12_Sub7 aClass572_Sub12_Sub7_8500;
	int anInt8501;

	final void method7870() {
		((Class666) this).aBool8496 = false;
		((Class666) this).anInt8498 = 0;
		((Class666) this).aClass572_Sub12_Sub7_8500 = null;
		((Class666) this).aClass572_Sub12_Sub7_8499 = null;
	}

	final boolean method7871(Class639_Sub18 class639_sub18, AnimationDefinition class132, int i, int i_0_, int[] is, int i_1_) {
		if (!((Class666) this).aBool8496) {
			if (i >= is.length)
				return false;
			((Class666) this).anInt8497 = is[i] * 1400989281;
			((Class666) this).aClass572_Sub12_Sub7_8499 = class639_sub18.method8988((((Class666) this).anInt8497 * 2108276129) >> 16, 1448728398);
			((Class666) this).anInt8497 = 1400989281 * (((Class666) this).anInt8497 * 2108276129 & 0xffff);
			if (null != ((Class666) this).aClass572_Sub12_Sub7_8499) {
				if (class132.aBool1560 && -1 != i_0_ && i_0_ < is.length) {
					((Class666) this).anInt8501 = is[i_0_] * -476835027;
					((Class666) this).aClass572_Sub12_Sub7_8500 = class639_sub18.method8988(((((Class666) this).anInt8501) * -1595624283 >> 16), 1852946487);
					((Class666) this).anInt8501 = (-476835027 * (-1595624283 * ((Class666) this).anInt8501 & 0xffff));
				}
				if (class132.aBool1563)
					((Class666) this).anInt8498 = (-1676534237 * (((Class666) this).anInt8498 * -507608693 | 0x200));
				if (((Class666) this).aClass572_Sub12_Sub7_8499.method10317(2108276129 * ((Class666) this).anInt8497, 885694468))
					((Class666) this).anInt8498 = ((-507608693 * ((Class666) this).anInt8498 | 0x80) * -1676534237);
				if (((Class666) this).aClass572_Sub12_Sub7_8499.method10316(2108276129 * ((Class666) this).anInt8497, 16711935))
					((Class666) this).anInt8498 = ((((Class666) this).anInt8498 * -507608693 | 0x100) * -1676534237);
				if (((Class666) this).aClass572_Sub12_Sub7_8499.method10318(2108276129 * ((Class666) this).anInt8497, 891148254))
					((Class666) this).anInt8498 = (-1676534237 * (-507608693 * ((Class666) this).anInt8498 | 0x400));
				if (null != ((Class666) this).aClass572_Sub12_Sub7_8500) {
					if (((Class666) this).aClass572_Sub12_Sub7_8500.method10317(((Class666) this).anInt8501 * -1595624283, 1136443588))
						((Class666) this).anInt8498 = (-507608693 * ((Class666) this).anInt8498 | 0x80) * -1676534237;
					if (((Class666) this).aClass572_Sub12_Sub7_8500.method10316(((Class666) this).anInt8501 * -1595624283, 16711935))
						((Class666) this).anInt8498 = (-1676534237 * (((Class666) this).anInt8498 * -507608693 | 0x100));
					if (((Class666) this).aClass572_Sub12_Sub7_8500.method10318(((Class666) this).anInt8501 * -1595624283, -52782990))
						((Class666) this).anInt8498 = (-1676534237 * (((Class666) this).anInt8498 * -507608693 | 0x400));
				}
				((Class666) this).anInt8498 = -1676534237 * (((Class666) this).anInt8498 * -507608693 | 0x20);
				((Class666) this).aBool8496 = true;
				return true;
			}
			return false;
		}
		return true;
	}

	Class666() {
		/* empty */
	}

	final void method7872(int i) {
		((Class666) this).aBool8496 = false;
		((Class666) this).anInt8498 = 0;
		((Class666) this).aClass572_Sub12_Sub7_8500 = null;
		((Class666) this).aClass572_Sub12_Sub7_8499 = null;
	}

	final void method7873() {
		((Class666) this).aBool8496 = false;
		((Class666) this).anInt8498 = 0;
		((Class666) this).aClass572_Sub12_Sub7_8500 = null;
		((Class666) this).aClass572_Sub12_Sub7_8499 = null;
	}

	final void method7874() {
		((Class666) this).aBool8496 = false;
		((Class666) this).anInt8498 = 0;
		((Class666) this).aClass572_Sub12_Sub7_8500 = null;
		((Class666) this).aClass572_Sub12_Sub7_8499 = null;
	}

	static final void method7875(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (i_2_ > 255 || i_2_ < 0)
			i_2_ = 0;
		if (i_2_ != Class213.aClass572_Sub24_2463.aClass665_Sub3_9239.method8122(-2036517806)) {
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub3_9239), i_2_, 1053205834);
			Class623.method7443(-1198147039);
			client.aBool8854 = false;
		}
	}

	static final void method7876(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 722211665 * class73.anInt802;
	}
}

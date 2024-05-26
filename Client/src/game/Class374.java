package game;

/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class374 {
	float aFloat4547;
	Class374 aClass374_4548;
	long aLong4549;
	float aFloat4550;
	Interface31 anInterface31_4551;
	float aFloat4552;
	float aFloat4553;
	long aLong4554;

	float method4608(int i) {
		return ((Class374) this).aFloat4547;
	}

	public float method4609(int i) {
		float f = ((Class374) this).aFloat4553;
		for (Class374 class374_0_ = ((Class374) this).aClass374_4548; null != class374_0_; class374_0_ = class374_0_.method4611(1031882975))
			f *= class374_0_.method4616(391960876);
		f = Math.min(Math.max(f, 0.0F), 1.0F);
		return f;
	}

	void method4610(byte i) {
		if (null != ((Class374) this).anInterface31_4551) {
			float f = ((Class374) this).anInterface31_4551.method152((byte) 103);
			if (((Class374) this).aFloat4553 != f && ((Class374) this).aFloat4550 < 0.0F) {
				((Class374) this).aFloat4552 = ((Class374) this).aFloat4553;
				((Class374) this).aFloat4550 = f;
				((Class374) this).aLong4549 = Class69.method1067(-1981144823) * 484728264907537023L;
				((Class374) this).aLong4554 = (-3387765334646714883L * ((Class374) this).aLong4549 + -6279250115356525780L);
			}
		}
		if (((Class374) this).aFloat4550 >= 0.0F) {
			long l = Class69.method1067(-1729469955);
			if (l > ((Class374) this).aLong4554 * 6923451332020935723L) {
				((Class374) this).aFloat4553 = ((Class374) this).aFloat4550;
				((Class374) this).aFloat4550 = -1.0F;
			} else {
				float f = (((Class374) this).aFloat4550 - ((Class374) this).aFloat4552);
				long l_1_ = (6923451332020935723L * ((Class374) this).aLong4554 - 4647683903511463295L * ((Class374) this).aLong4549);
				float f_2_ = f / (float) l_1_;
				((Class374) this).aFloat4553 = (f_2_ * (float) (l - (((Class374) this).aLong4549 * 4647683903511463295L)) + ((Class374) this).aFloat4552);
				if (((Class374) this).aFloat4550 == ((Class374) this).aFloat4553)
					((Class374) this).aFloat4550 = -1.0F;
			}
		}
		((Class374) this).aFloat4553 = Math.min(1.0F, Math.max(((Class374) this).aFloat4553, 0.0F));
	}

	public Class374 method4611(int i) {
		return ((Class374) this).aClass374_4548;
	}

	public void method4612(float f, byte i) {
		if (((Class374) this).anInterface31_4551 == null) {
			((Class374) this).aFloat4550 = f;
			((Class374) this).aFloat4552 = ((Class374) this).aFloat4553;
			((Class374) this).aLong4549 = Class69.method1067(-1776141201) * 484728264907537023L;
			((Class374) this).aLong4554 = (((Class374) this).aLong4549 * -3387765334646714883L + -6279250115356525780L);
		}
	}

	Class374(int i, float f, Object object, Class294 class294, Interface31 interface31, Class374 class374_3_) {
		((Class374) this).aClass374_4548 = class374_3_;
		((Class374) this).anInterface31_4551 = interface31;
		((Class374) this).aFloat4553 = 1.0F;
		((Class374) this).aFloat4547 = f;
		((Class374) this).aFloat4552 = -1.0F;
		((Class374) this).aFloat4550 = -1.0F;
		((Class374) this).aLong4549 = -484728264907537023L;
		((Class374) this).aLong4554 = 3752141315895475581L;
	}

	public float method4613() {
		float f = 1.0F;
		for (Class374 class374_4_ = this; null != class374_4_; class374_4_ = class374_4_.method4611(1287917949))
			f *= class374_4_.method4608(-1422727219);
		return f;
	}

	void method4614() {
		if (null != ((Class374) this).anInterface31_4551) {
			float f = ((Class374) this).anInterface31_4551.method152((byte) 49);
			if (((Class374) this).aFloat4553 != f && ((Class374) this).aFloat4550 < 0.0F) {
				((Class374) this).aFloat4552 = ((Class374) this).aFloat4553;
				((Class374) this).aFloat4550 = f;
				((Class374) this).aLong4549 = Class69.method1067(-1693104974) * 484728264907537023L;
				((Class374) this).aLong4554 = (-3387765334646714883L * ((Class374) this).aLong4549 + -6279250115356525780L);
			}
		}
		if (((Class374) this).aFloat4550 >= 0.0F) {
			long l = Class69.method1067(-1649208132);
			if (l > ((Class374) this).aLong4554 * 6923451332020935723L) {
				((Class374) this).aFloat4553 = ((Class374) this).aFloat4550;
				((Class374) this).aFloat4550 = -1.0F;
			} else {
				float f = (((Class374) this).aFloat4550 - ((Class374) this).aFloat4552);
				long l_5_ = (6923451332020935723L * ((Class374) this).aLong4554 - 4647683903511463295L * ((Class374) this).aLong4549);
				float f_6_ = f / (float) l_5_;
				((Class374) this).aFloat4553 = (f_6_ * (float) (l - (((Class374) this).aLong4549 * 4647683903511463295L)) + ((Class374) this).aFloat4552);
				if (((Class374) this).aFloat4550 == ((Class374) this).aFloat4553)
					((Class374) this).aFloat4550 = -1.0F;
			}
		}
		((Class374) this).aFloat4553 = Math.min(1.0F, Math.max(((Class374) this).aFloat4553, 0.0F));
	}

	void method4615() {
		if (null != ((Class374) this).anInterface31_4551) {
			float f = ((Class374) this).anInterface31_4551.method152((byte) 43);
			if (((Class374) this).aFloat4553 != f && ((Class374) this).aFloat4550 < 0.0F) {
				((Class374) this).aFloat4552 = ((Class374) this).aFloat4553;
				((Class374) this).aFloat4550 = f;
				((Class374) this).aLong4549 = Class69.method1067(-1848840169) * 484728264907537023L;
				((Class374) this).aLong4554 = (-3387765334646714883L * ((Class374) this).aLong4549 + -6279250115356525780L);
			}
		}
		if (((Class374) this).aFloat4550 >= 0.0F) {
			long l = Class69.method1067(-1935289172);
			if (l > ((Class374) this).aLong4554 * 6923451332020935723L) {
				((Class374) this).aFloat4553 = ((Class374) this).aFloat4550;
				((Class374) this).aFloat4550 = -1.0F;
			} else {
				float f = (((Class374) this).aFloat4550 - ((Class374) this).aFloat4552);
				long l_7_ = (6923451332020935723L * ((Class374) this).aLong4554 - 4647683903511463295L * ((Class374) this).aLong4549);
				float f_8_ = f / (float) l_7_;
				((Class374) this).aFloat4553 = (f_8_ * (float) (l - (((Class374) this).aLong4549 * 4647683903511463295L)) + ((Class374) this).aFloat4552);
				if (((Class374) this).aFloat4550 == ((Class374) this).aFloat4553)
					((Class374) this).aFloat4550 = -1.0F;
			}
		}
		((Class374) this).aFloat4553 = Math.min(1.0F, Math.max(((Class374) this).aFloat4553, 0.0F));
	}

	public float method4616(int i) {
		return ((Class374) this).aFloat4553;
	}

	public float method4617(byte i) {
		float f = 1.0F;
		for (Class374 class374_9_ = this; null != class374_9_; class374_9_ = class374_9_.method4611(1891614397))
			f *= class374_9_.method4608(-912973143);
		return f;
	}

	public static Class371 method4618(RSByteBuffer class572_sub15, int i) {
		Class320 class320 = (Class133_Sub20.method9537(272383510)[class572_sub15.readUnsignedByte(15719256)]);
		Class300 class300 = (Class480.method5718(-1312281852)[class572_sub15.readUnsignedByte(502073884)]);
		int i_10_ = class572_sub15.readShort(-710976385);
		int i_11_ = class572_sub15.readShort(-710976385);
		int i_12_ = class572_sub15.readBigSmart((byte) 109);
		int i_13_ = class572_sub15.readInt(405699694);
		int i_14_ = class572_sub15.readUnsignedByte(753518425);
		return new Class371(class320, class300, i_10_, i_11_, i_12_, i_13_, i_14_);
	}

	static Class method4619(String string, int i) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	static final void method4620(Cs2Executor class441, byte i) {
		Class613.method7363((byte) 0);
		Class301.method3994((byte) 54);
		client.aClass613_8605.method7302(-507801830);
		Class623.method7443(-2061234387);
		client.aBool8854 = false;
	}

	static final void method4621(Cs2Executor class441, byte i) {
		int i_15_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_15_, (short) 27629);
		Class83 class83 = Class534.aClass83Array5975[i_15_ >> 16];
		Class71.method1082(class73, class83, class441, (byte) 6);
	}

	static void method4622(Class106 class106, Class572_Sub19 class572_sub19, Class78 class78, int i, int i_16_, int i_17_, int i_18_, int i_19_) {
		int i_20_ = i - 5;
		int i_21_ = 2 + i_16_;
		if (0 != 1965241951 * class78.anInt969)
			class106.method1720(i_20_, i_21_, i_18_ + 10, 1 + (i_16_ + i_17_ - i_21_), 1965241951 * class78.anInt969, (byte) -103);
		if (2086128583 * class78.anInt970 != 0)
			class106.method1982(i_20_, i_21_, i_18_ + 10, 1 + (i_16_ + i_17_ - i_21_), class78.anInt970 * 2086128583, (byte) -54);
		int i_22_ = class78.anInt958 * -1706590863;
		if (class572_sub19.aBool9144 && -1 != 2087111787 * class78.anInt988)
			i_22_ = 2087111787 * class78.anInt988;
		Class579.aClass102_7676.method1613(class78.aString964, i, i_16_, i_18_, i_17_, ~0xffffff | i_22_, (Class547_Sub1.aClass482_6181.anInt5381) * 2080588741, 1, 0, 0, null, null, null, 0, 0, (byte) 44);
	}
}

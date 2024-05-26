package game;

/* Class423_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class423_Sub2 extends Class423 {
	int anInt9756;
	boolean aBool9757;
	Class240 aClass240_9758;
	Class240 aClass240_9759;
	Class240 aClass240_9760 = new Class240(Float.NaN, Float.NaN, Float.NaN);
	public static Class248 aClass248_9761;
	public static int anInt9762;

	void method9273(int[][][] is, Class274 class274, int i, int i_0_, int i_1_) {
		if (method5145(-2059209860) && (((Class423_Sub2) this).aClass411_4989.method5008(-791672372) || ((Class423_Sub2) this).aClass411_4989.method4967((byte) 1)) && ((Class423_Sub2) this).aClass411_4989.method4967((byte) 1) && null != is) {
			int i_2_ = ((int) ((Class423_Sub2) this).aClass240_9758.aFloat2653 - i >> 9);
			int i_3_ = (((int) ((Class423_Sub2) this).aClass240_9758.aFloat2657 - i_0_) >> 9);
			if (i_2_ >= 0 && i_3_ >= 0 && i_2_ + 1 < is[0].length && 1 + i_3_ < is[0][0].length) {
				int i_4_ = ((Class423_Sub2) this).anInt9756 * -1774156723;
				if (class274.method3689(i_2_, i_3_, -2067514580))
					i_4_ = 1 + ((Class423_Sub2) this).anInt9756 * -1774156723;
				long l = ((long) ((Class423_Sub2) this).aClass240_9758.aFloat2653 % 512L);
				long l_5_ = ((long) ((Class423_Sub2) this).aClass240_9758.aFloat2657 % 512L);
				long l_6_ = (long) is[i_4_][i_2_][i_3_] * (512L - l) * (512L - l_5_);
				l_6_ += l * (long) is[i_4_][1 + i_2_][i_3_] * (512L - l_5_);
				l_6_ += l_5_ * ((long) is[i_4_][i_2_][i_3_ + 1] * (512L - l));
				l_6_ += l * (long) is[i_4_][i_2_ + 1][i_3_ + 1] * l_5_;
				l_6_ /= 262144L;
				l_6_ -= 512L;
				float f = ((float) -l_6_ - ((Class423_Sub2) this).aClass240_9758.aFloat2656);
				if (f > 0.0F)
					((Class423_Sub2) this).aClass240_9758.aFloat2656 = (float) -l_6_;
			}
		}
	}

	public Class572_Sub17 method5157() {
		return (new Class572_Sub17(((Class423_Sub2) this).anInt9756 * -1774156723, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2653, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2656, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2657));
	}

	public void method5142(float f, int[][][] is, Class274 class274, int i, int i_7_, int i_8_) {
		if (((Class423_Sub2) this).aBool9757)
			method9273(is, class274, i, i_7_, -1631215425);
		((Class423_Sub2) this).aClass411_4989.method4970(true, f, ((Class423_Sub2) this).aClass240_9760, ((Class423_Sub2) this).aClass411_4989.method5002((byte) 9), ((Class423_Sub2) this).aClass240_9758, ((Class423_Sub2) this).aClass240_9759, 1210240699);
	}

	public boolean method5145(int i) {
		return !Float.isNaN(((Class423_Sub2) this).aClass240_9760.aFloat2653);
	}

	public Class240 method5159(byte i) {
		return Class240.method3276(((Class423_Sub2) this).aClass240_9760);
	}

	public void method5166(RSByteBuffer class572_sub15) {
		((Class423_Sub2) this).aClass240_9758.method3308(class572_sub15);
	}

	public Class572_Sub17 method5160() {
		return (new Class572_Sub17(((Class423_Sub2) this).anInt9756 * -1774156723, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2653, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2656, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2657));
	}

	public float method5147(byte i) {
		return 0.0F;
	}

	public void method5148(Class403 class403, int i, int i_9_, int i_10_) {
		class403.anInt4748 = (-1776656325 * ((int) ((Class423_Sub2) this).aClass240_9760.aFloat2653 - i));
		class403.anInt4747 = ((int) -((Class423_Sub2) this).aClass240_9760.aFloat2656 * 962175953);
		class403.anInt4749 = 243738067 * ((int) (((Class423_Sub2) this).aClass240_9760.aFloat2657) - i_9_);
	}

	public void method5162(RSByteBuffer class572_sub15, byte i) {
		((Class423_Sub2) this).aClass240_9758.method3308(class572_sub15);
	}

	public void method9274(boolean bool, int i) {
		((Class423_Sub2) this).aBool9757 = bool;
	}

	public Class572_Sub17 method5146(int i) {
		return (new Class572_Sub17(((Class423_Sub2) this).anInt9756 * -1774156723, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2653, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2656, (int) ((Class423_Sub2) this).aClass240_9760.aFloat2657));
	}

	public void method9275(boolean bool) {
		((Class423_Sub2) this).aBool9757 = bool;
	}

	public void method5150(float f, int[][][] is, Class274 class274, int i, int i_11_) {
		if (((Class423_Sub2) this).aBool9757)
			method9273(is, class274, i, i_11_, -1631215425);
		((Class423_Sub2) this).aClass411_4989.method4970(true, f, ((Class423_Sub2) this).aClass240_9760, ((Class423_Sub2) this).aClass411_4989.method5002((byte) 9), ((Class423_Sub2) this).aClass240_9758, ((Class423_Sub2) this).aClass240_9759, 1210240699);
	}

	public boolean method5151() {
		return !Float.isNaN(((Class423_Sub2) this).aClass240_9760.aFloat2653);
	}

	public boolean method5152() {
		return !Float.isNaN(((Class423_Sub2) this).aClass240_9760.aFloat2653);
	}

	public void method9276(boolean bool) {
		((Class423_Sub2) this).aBool9757 = bool;
	}

	public boolean method5154() {
		return !Float.isNaN(((Class423_Sub2) this).aClass240_9760.aFloat2653);
	}

	public Class240 method5155() {
		return Class240.method3276(((Class423_Sub2) this).aClass240_9760);
	}

	public Class423_Sub2(Class411 class411) {
		super(class411);
		((Class423_Sub2) this).aClass240_9758 = new Class240(Float.NaN, Float.NaN, Float.NaN);
		((Class423_Sub2) this).aClass240_9759 = new Class240();
		((Class423_Sub2) this).aBool9757 = false;
	}

	public float method5153() {
		return 0.0F;
	}

	public double[] method5144(int i) {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -60);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public boolean method5149() {
		return !Float.isNaN(((Class423_Sub2) this).aClass240_9760.aFloat2653);
	}

	public float method5143() {
		return 0.0F;
	}

	public void method5161(Class403 class403, int i, int i_12_) {
		class403.anInt4748 = (-1776656325 * ((int) ((Class423_Sub2) this).aClass240_9760.aFloat2653 - i));
		class403.anInt4747 = ((int) -((Class423_Sub2) this).aClass240_9760.aFloat2656 * 962175953);
		class403.anInt4749 = 243738067 * ((int) (((Class423_Sub2) this).aClass240_9760.aFloat2657) - i_12_);
	}

	public void method5165(Class403 class403, int i, int i_13_) {
		class403.anInt4748 = (-1776656325 * ((int) ((Class423_Sub2) this).aClass240_9760.aFloat2653 - i));
		class403.anInt4747 = ((int) -((Class423_Sub2) this).aClass240_9760.aFloat2656 * 962175953);
		class403.anInt4749 = 243738067 * ((int) (((Class423_Sub2) this).aClass240_9760.aFloat2657) - i_13_);
	}

	public void method9277(boolean bool) {
		((Class423_Sub2) this).aBool9757 = bool;
	}

	public void method9278(Class572_Sub17 class572_sub17, byte i) {
		((Class423_Sub2) this).aClass240_9758.aFloat2653 = (float) (-862367545 * class572_sub17.anInt9126);
		((Class423_Sub2) this).aClass240_9758.aFloat2656 = (float) (class572_sub17.anInt9127 * -930360273);
		((Class423_Sub2) this).aClass240_9758.aFloat2657 = (float) (-1661817525 * class572_sub17.anInt9124);
		if (Float.isNaN(((Class423_Sub2) this).aClass240_9760.aFloat2653)) {
			((Class423_Sub2) this).aClass240_9760.method3269(((Class423_Sub2) this).aClass240_9758);
			((Class423_Sub2) this).aClass240_9759.method3270();
		}
		((Class423_Sub2) this).anInt9756 = 438299395 * class572_sub17.anInt9123;
	}

	public double[] method5158() {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -52);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public double[] method5164() {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -44);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public double[] method5163() {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -49);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public Class240 method5156() {
		return Class240.method3276(((Class423_Sub2) this).aClass240_9760);
	}

	public void method5167(RSByteBuffer class572_sub15) {
		((Class423_Sub2) this).aClass240_9758.method3308(class572_sub15);
	}

	public static void method9279(int i) {
		if (Class554.method6557(-1519935387) != Class578.aClass578_7670) {
			try {
				String string = VarTransmitLevel.anApplet8067.getParameter(Class328.aClass328_4186.aString4200);
				int i_14_ = ((int) (Class69.method1067(-2135119117) / 86400000L) - 11745);
				String string_15_ = new StringBuilder().append("usrdob=").append(i_14_).append("; version=1; path=/; domain=").append(string).toString();
				Class277.method3717(VarTransmitLevel.anApplet8067, new StringBuilder().append("document.cookie=\"").append(string_15_).append("\"").toString(), (byte) 44);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method9280(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= -1235064193;
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		Class494.method5906((String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr]), (String) (((Cs2Executor) class441).objectStack[1 + ((Cs2Executor) class441).objectStackPtr * 1628307581]), (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]), 1 == (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]), (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr + 2]), -467096348);
	}

	static final void method9281(Cs2Executor class441, int i) {
		int i_16_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub31_9228.method7863(i_16_, 430538401);
	}
}

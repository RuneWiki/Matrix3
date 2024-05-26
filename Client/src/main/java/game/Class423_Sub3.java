package game;

/* Class423_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class423_Sub3 extends Class423 {
	int anInt9799;
	Interface48 anInterface48_9800;
	int anInt9801;
	boolean aBool9802;
	Class240 aClass240_9803;
	Class240 aClass240_9804 = new Class240();
	Class240 aClass240_9805;
	public Class230 aClass230_9806 = new Class230();
	Class240 aClass240_9807;
	Class230 aClass230_9808;

	public void method9312(Interface48 interface48, Class240 class240, Class230 class230, boolean bool, int i, int[][][] is, Class274 class274, int i_0_, int i_1_, int i_2_) {
		((Class423_Sub3) this).anInterface48_9800 = interface48;
		((Class423_Sub3) this).aClass240_9804.method3269(class240);
		aClass230_9806.method3170(class230);
		((Class423_Sub3) this).aBool9802 = bool;
		((Class423_Sub3) this).anInt9801 = -569426549 * i;
		((Class423_Sub3) this).anInt9799 = (((Class423_Sub3) this).anInterface48_9800.method273((byte) -83).anInt9123) * -1121374187;
		method9314(is, class274, i_0_, i_1_, 1206370283);
	}

	public void method9313(int i) {
		if (((Class423_Sub3) this).anInterface48_9800 != null)
			((Class423_Sub3) this).anInterface48_9800 = (((Class423_Sub3) this).aClass411_4989.method4992((byte) 71).method268(((Class423_Sub3) this).anInterface48_9800.method281(2142610479), ((Class423_Sub3) this).anInterface48_9800.method113((byte) 0), 1565244322));
	}

	public void method5142(float f, int[][][] is, Class274 class274, int i, int i_3_, int i_4_) {
		if (null != ((Class423_Sub3) this).anInterface48_9800) {
			method9314(is, class274, i, i_3_, 2011069280);
			Class230 class230 = method9320(1932016076);
			((Class423_Sub3) this).aClass230_9808.method3198(class230, ((Class423_Sub3) this).aClass411_4989.method5005((byte) -14));
			if (Float.isNaN(((Class423_Sub3) this).aClass230_9808.aFloat2624))
				((Class423_Sub3) this).aClass230_9808.method3170(class230);
			class230.method3165();
			((Class423_Sub3) this).aClass240_9803.method3269(((Class423_Sub3) this).anInterface48_9800.method273((byte) -28).method8572(-1156122907));
			((Class423_Sub3) this).aClass411_4989.method4970(true, f, ((Class423_Sub3) this).aClass240_9805, ((Class423_Sub3) this).aClass411_4989.method5002((byte) 9), ((Class423_Sub3) this).aClass240_9803, ((Class423_Sub3) this).aClass240_9807, 1210240699);
		}
	}

	public void method5148(Class403 class403, int i, int i_5_, int i_6_) {
		Class240 class240 = method5159((byte) -66);
		class403.anInt4748 = -1776656325 * ((int) class240.aFloat2653 - i);
		class403.anInt4747 = 962175953 * (int) -class240.aFloat2656;
		class403.anInt4749 = ((int) class240.aFloat2657 - i_5_) * 243738067;
		class240.method3261();
	}

	void method9314(int[][][] is, Class274 class274, int i, int i_7_, int i_8_) {
		if (method5145(-2059209860) && (((Class423_Sub3) this).aClass411_4989.method5008(-791672372) || ((Class423_Sub3) this).aClass411_4989.method4967((byte) 1))) {
			Class572_Sub17 class572_sub17 = ((Class423_Sub3) this).anInterface48_9800.method273((byte) -63);
			((Class423_Sub3) this).anInt9799 = -1121374187 * class572_sub17.anInt9123;
			int i_9_ = -25608437 * ((Class423_Sub3) this).anInt9799;
			boolean bool = true;
			if (3 == -25608437 * ((Class423_Sub3) this).anInt9799)
				bool = false;
			else if (null != class274 && (class274.method3689(class572_sub17.anInt9126 * -862367545 - i >> 9, -1661817525 * class572_sub17.anInt9124 - i_7_ >> 9, -2053192892))) {
				i_9_ = 1 + ((Class423_Sub3) this).anInt9799 * -25608437;
				bool = false;
			}
			if (((Class423_Sub3) this).aClass411_4989.method4967((byte) 1) && null != is) {
				float f = method9321(is, class274, i, i_7_, i_9_, bool, 32935479);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_10_ = 3.1415927F;
						Class240 class240 = Class240.method3316(0.0F, 0.0F, 1.0F);
						class240.method3288(aClass230_9806);
						Class240 class240_11_ = Class240.method3316(class240.aFloat2653, 0.0F, class240.aFloat2657);
						class240_11_.method3273();
						float f_12_ = Class240.method3275(class240, class240_11_);
						for (int i_13_ = 0; i_13_ < 10; i_13_++) {
							float f_14_ = (f_12_ + f_10_) / 2.0F - f_12_;
							float f_15_ = f_14_;
							if (f > 0.0F)
								f_15_ *= -1.0F;
							Class240 class240_16_ = Class240.method3316(1.0F, 0.0F, 0.0F);
							class240_16_.method3288(aClass230_9806);
							Class230 class230 = Class230.method3210();
							class230.method3209(class240_16_, f_15_);
							aClass230_9806.method3189(class230);
							aClass230_9806.method3166();
							class240_16_.method3261();
							class230.method3165();
							f = method9321(is, class274, i, i_7_, i_9_, bool, 1944772396);
							if (Float.isNaN(f))
								break;
							if (f > 0.0F)
								f_12_ += f_14_;
							else
								f_10_ -= f_14_;
						}
					}
				}
			}
		}
	}

	public Class572_Sub17 method5160() {
		Class240 class240 = method5159((byte) -49);
		Class572_Sub17 class572_sub17 = new Class572_Sub17(((Class423_Sub3) this).anInt9799 * -25608437, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657);
		class240.method3261();
		return class572_sub17;
	}

	Class240 method9315(Class230 class230, int i) {
		Class240 class240 = Class240.method3276(((Class423_Sub3) this).aClass240_9804);
		class240.method3288(class230);
		Class240 class240_17_ = Class240.method3303(((Class423_Sub3) this).aClass240_9803, class240);
		class240.method3261();
		return class240_17_;
	}

	public boolean method5145(int i) {
		return !Float.isNaN(((Class423_Sub3) this).aClass240_9805.aFloat2653);
	}

	public Class240 method5159(byte i) {
		Class240 class240 = Class240.method3276(((Class423_Sub3) this).aClass240_9804);
		class240.method3288(((Class423_Sub3) this).aClass230_9808);
		Class240 class240_18_ = Class240.method3303(((Class423_Sub3) this).aClass240_9805, class240);
		class240.method3261();
		return class240_18_;
	}

	public double[] method5144(int i) {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -38);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public Class572_Sub17 method5146(int i) {
		Class240 class240 = method5159((byte) -85);
		Class572_Sub17 class572_sub17 = new Class572_Sub17(((Class423_Sub3) this).anInt9799 * -25608437, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657);
		class240.method3261();
		return class572_sub17;
	}

	public Class240 method9316(int i) {
		return ((Class423_Sub3) this).aClass240_9805;
	}

	public Class240 method9317(int i) {
		return ((Class423_Sub3) this).aClass240_9804;
	}

	public float method9318(int i) {
		return Class263.method3613(aClass230_9806, (byte) 68);
	}

	public float method9319(int i) {
		return Class309.method4042(aClass230_9806, -1332607419);
	}

	public void method5162(RSByteBuffer class572_sub15, byte i) {
		Class401 class401 = Class620.method7435(class572_sub15.readUnsignedByte(360838760), (byte) 4);
		int i_19_ = class572_sub15.readUnsignedShort(647518597);
		((Class423_Sub3) this).aClass240_9804.method3308(class572_sub15);
		aClass230_9806.method3168(class572_sub15);
		if (class572_sub15.readUnsignedByte(1130911817) == 1)
			((Class423_Sub3) this).aBool9802 = true;
		else
			((Class423_Sub3) this).aBool9802 = false;
		((Class423_Sub3) this).anInt9801 = class572_sub15.readUnsignedShort(647518597) * -569426549;
		((Class423_Sub3) this).anInterface48_9800 = ((Class423_Sub3) this).aClass411_4989.method4992((byte) 63).method268(class401, i_19_, 1565244322);
	}

	public void method5150(float f, int[][][] is, Class274 class274, int i, int i_20_) {
		if (null != ((Class423_Sub3) this).anInterface48_9800) {
			method9314(is, class274, i, i_20_, 1725574633);
			Class230 class230 = method9320(85515181);
			((Class423_Sub3) this).aClass230_9808.method3198(class230, ((Class423_Sub3) this).aClass411_4989.method5005((byte) -99));
			if (Float.isNaN(((Class423_Sub3) this).aClass230_9808.aFloat2624))
				((Class423_Sub3) this).aClass230_9808.method3170(class230);
			class230.method3165();
			((Class423_Sub3) this).aClass240_9803.method3269(((Class423_Sub3) this).anInterface48_9800.method273((byte) -35).method8572(319826223));
			((Class423_Sub3) this).aClass411_4989.method4970(true, f, ((Class423_Sub3) this).aClass240_9805, ((Class423_Sub3) this).aClass411_4989.method5002((byte) 9), ((Class423_Sub3) this).aClass240_9803, ((Class423_Sub3) this).aClass240_9807, 1210240699);
		}
	}

	public boolean method5151() {
		return !Float.isNaN(((Class423_Sub3) this).aClass240_9805.aFloat2653);
	}

	Class230 method9320(int i) {
		Class230 class230 = Class230.method3164(aClass230_9806);
		if (((Class423_Sub3) this).aBool9802) {
			Class240 class240 = ((Class423_Sub3) this).anInterface48_9800.method280(1895024656);
			if (class240.method3301() < (float) (((Class423_Sub3) this).anInt9801 * -583106013)) {
				class240 = Class240.method3316(0.0F, 0.0F, 1.0F);
				Class230 class230_21_ = ((Class423_Sub3) this).anInterface48_9800.method274(-32687699);
				class240.method3288(class230_21_);
			}
			class240.aFloat2656 = 0.0F;
			float f = (float) Math.atan2((double) class240.aFloat2653, (double) class240.aFloat2657);
			class240.method3261();
			Class230 class230_22_ = new Class230();
			class230_22_.method3172(0.0F, 1.0F, 0.0F, f);
			class230.method3189(class230_22_);
		}
		return class230;
	}

	public Class240 method5156() {
		Class240 class240 = Class240.method3276(((Class423_Sub3) this).aClass240_9804);
		class240.method3288(((Class423_Sub3) this).aClass230_9808);
		Class240 class240_23_ = Class240.method3303(((Class423_Sub3) this).aClass240_9805, class240);
		class240.method3261();
		return class240_23_;
	}

	public Class240 method5155() {
		Class240 class240 = Class240.method3276(((Class423_Sub3) this).aClass240_9804);
		class240.method3288(((Class423_Sub3) this).aClass230_9808);
		Class240 class240_24_ = Class240.method3303(((Class423_Sub3) this).aClass240_9805, class240);
		class240.method3261();
		return class240_24_;
	}

	public Class423_Sub3(Class411 class411) {
		super(class411);
		((Class423_Sub3) this).anInt9801 = 2078807192;
		((Class423_Sub3) this).aClass240_9805 = new Class240(Float.NaN, Float.NaN, Float.NaN);
		((Class423_Sub3) this).aClass240_9803 = new Class240(Float.NaN, Float.NaN, Float.NaN);
		((Class423_Sub3) this).aClass240_9807 = new Class240();
		((Class423_Sub3) this).aClass230_9808 = new Class230();
	}

	public Class572_Sub17 method5157() {
		Class240 class240 = method5159((byte) -9);
		Class572_Sub17 class572_sub17 = new Class572_Sub17(((Class423_Sub3) this).anInt9799 * -25608437, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657);
		class240.method3261();
		return class572_sub17;
	}

	public boolean method5152() {
		return !Float.isNaN(((Class423_Sub3) this).aClass240_9805.aFloat2653);
	}

	public float method5147(byte i) {
		return 0.0F;
	}

	public void method5161(Class403 class403, int i, int i_25_) {
		Class240 class240 = method5159((byte) -17);
		class403.anInt4748 = -1776656325 * ((int) class240.aFloat2653 - i);
		class403.anInt4747 = 962175953 * (int) -class240.aFloat2656;
		class403.anInt4749 = ((int) class240.aFloat2657 - i_25_) * 243738067;
		class240.method3261();
	}

	public void method5165(Class403 class403, int i, int i_26_) {
		Class240 class240 = method5159((byte) -71);
		class403.anInt4748 = -1776656325 * ((int) class240.aFloat2653 - i);
		class403.anInt4747 = 962175953 * (int) -class240.aFloat2656;
		class403.anInt4749 = ((int) class240.aFloat2657 - i_26_) * 243738067;
		class240.method3261();
	}

	public double[] method5158() {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -26);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public float method5143() {
		return 0.0F;
	}

	public double[] method5163() {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -79);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public void method5166(RSByteBuffer class572_sub15) {
		Class401 class401 = Class620.method7435(class572_sub15.readUnsignedByte(1140252956), (byte) 94);
		int i = class572_sub15.readUnsignedShort(647518597);
		((Class423_Sub3) this).aClass240_9804.method3308(class572_sub15);
		aClass230_9806.method3168(class572_sub15);
		if (class572_sub15.readUnsignedByte(-53251947) == 1)
			((Class423_Sub3) this).aBool9802 = true;
		else
			((Class423_Sub3) this).aBool9802 = false;
		((Class423_Sub3) this).anInt9801 = class572_sub15.readUnsignedShort(647518597) * -569426549;
		((Class423_Sub3) this).anInterface48_9800 = ((Class423_Sub3) this).aClass411_4989.method4992((byte) 43).method268(class401, i, 1565244322);
	}

	public void method5167(RSByteBuffer class572_sub15) {
		Class401 class401 = Class620.method7435(class572_sub15.readUnsignedByte(977536410), (byte) 86);
		int i = class572_sub15.readUnsignedShort(647518597);
		((Class423_Sub3) this).aClass240_9804.method3308(class572_sub15);
		aClass230_9806.method3168(class572_sub15);
		if (class572_sub15.readUnsignedByte(1555104939) == 1)
			((Class423_Sub3) this).aBool9802 = true;
		else
			((Class423_Sub3) this).aBool9802 = false;
		((Class423_Sub3) this).anInt9801 = class572_sub15.readUnsignedShort(647518597) * -569426549;
		((Class423_Sub3) this).anInterface48_9800 = ((Class423_Sub3) this).aClass411_4989.method4992((byte) 80).method268(class401, i, 1565244322);
	}

	float method9321(int[][][] is, Class274 class274, int i, int i_27_, int i_28_, boolean bool, int i_29_) {
		Class230 class230 = method9320(-897107590);
		Class240 class240 = method9315(class230, -1592514992);
		class230.method3165();
		int i_30_ = (int) class240.aFloat2653 - i >> 9;
		int i_31_ = (int) class240.aFloat2657 - i_27_ >> 9;
		if (i_30_ >= 0 && i_31_ >= 0 && 1 + i_30_ < is[0].length && i_31_ + 1 < is[0][0].length) {
			int i_32_ = i_28_;
			if (bool && class274.method3689(i_30_, i_31_, -1983569640))
				i_32_ = 1 + i_28_;
			long l = (long) class240.aFloat2653 % 512L;
			long l_33_ = (long) class240.aFloat2657 % 512L;
			long l_34_ = (long) is[i_32_][i_30_][i_31_] * (512L - l) * (512L - l_33_);
			l_34_ += l * (long) is[i_32_][1 + i_30_][i_31_] * (512L - l_33_);
			l_34_ += (long) is[i_32_][i_30_][i_31_ + 1] * (512L - l) * l_33_;
			l_34_ += l_33_ * (l * (long) is[i_32_][1 + i_30_][i_31_ + 1]);
			l_34_ /= 262144L;
			l_34_ -= 1024L;
			float f = (float) -l_34_ - class240.aFloat2656;
			class240.method3261();
			return f;
		}
		class240.method3261();
		return Float.NaN;
	}

	public float method5153() {
		return 0.0F;
	}

	public boolean method5149() {
		return !Float.isNaN(((Class423_Sub3) this).aClass240_9805.aFloat2653);
	}

	public double[] method5164() {
		double[] ds = new double[3];
		Class240 class240 = method5159((byte) -94);
		ds[0] = (double) class240.aFloat2653;
		ds[1] = (double) class240.aFloat2656;
		ds[2] = (double) class240.aFloat2657;
		return ds;
	}

	public boolean method5154() {
		return !Float.isNaN(((Class423_Sub3) this).aClass240_9805.aFloat2653);
	}

	public float method9322() {
		return Class309.method4042(aClass230_9806, 432808142);
	}

	static final void method9323(Cs2Executor class441, byte i) {
		int i_35_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = ((Class116) Class221.aClass49_2607.method846((byte) 28).get(i_35_)).method2143((byte) 2);
	}

	public static void method9324(Class248 class248, int i) {
		Class1.anInt14 = class248.method3413("p11_full", -1381410200) * 1859982003;
		Class1.anInt9 = class248.method3413("p12_full", -1345436114) * -1536278097;
		Class1.anInt12 = class248.method3413("b12_full", -896163131) * 1516685671;
	}

	static final void method9325(Cs2Executor class441, byte i) {
		if (null != Class210.aClass334_2440) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
			((Cs2Executor) class441).current_clan = Class210.aClass334_2440;
			((Cs2Executor) class441).main_configs_map.put(VarDomainType.CLAN_SETTING_CONFIGS, Class67.method1055(((Cs2Executor) class441).current_clan, 1479294255));
		} else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}
}

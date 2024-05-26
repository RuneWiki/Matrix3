package game;

/* Class442 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Class442 {
	static Class120[] aClass120Array5129;
	static Map aMap5130 = new HashMap();
	public static boolean aBool5131;
	public static int anInt5132;
	static int anInt5133;

	Class442() throws Throwable {
		throw new Error();
	}

	static void method5281(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		float f = ((float) Class547_Sub1.anInt6151 / (float) Class547_Sub1.anInt6145);
		int i_4_ = i_1_;
		int i_5_ = i_2_;
		if (f < 1.0F)
			i_5_ = (int) (f * (float) i_1_);
		else
			i_4_ = (int) ((float) i_2_ / f);
		i -= (i_1_ - i_4_) / 2;
		i_0_ -= (i_2_ - i_5_) / 2;
		Class185.anInt2172 = 106919739 * (i * Class547_Sub1.anInt6145 / i_4_);
		Class386.anInt4642 = (Class547_Sub1.anInt6151 - i_0_ * Class547_Sub1.anInt6151 / i_5_) * 1527379917;
		Class547_Sub1.anInt8982 = 1904285671;
		Class547_Sub1.anInt8983 = 1743033659;
		Class280.method3794(-1620645063);
	}
}

package game;

/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.Map;

public class Class323 {
	public Object anObject4078;
	public int anInt4079;
	static InterfaceDefinitions aClass73_4080;
	public static Class639_Sub12 aClass639_Sub12_4081;

	public Class323(int i, Object object) {
		anInt4079 = 1049443373 * i;
		anObject4078 = object;
	}

	public boolean equals(Object object) {
		if (!(object instanceof Class323))
			return false;
		Class323 class323_0_ = (Class323) object;
		if (class323_0_.anObject4078 == null && null != anObject4078)
			return false;
		if (anObject4078 == null && class323_0_.anObject4078 != null)
			return false;
		if (class323_0_.anInt4079 * 380662693 == 380662693 * anInt4079 && class323_0_.anObject4078.equals(anObject4078))
			return true;
		return false;
	}

	public Class323(int i) {
		anInt4079 = 1049443373 * i;
	}

	public boolean method4121(Object object) {
		if (!(object instanceof Class323))
			return false;
		Class323 class323_1_ = (Class323) object;
		if (class323_1_.anObject4078 == null && null != anObject4078)
			return false;
		if (anObject4078 == null && class323_1_.anObject4078 != null)
			return false;
		if (class323_1_.anInt4079 * 380662693 == 380662693 * anInt4079 && class323_1_.anObject4078.equals(anObject4078))
			return true;
		return false;
	}

	public boolean method4122(Object object) {
		if (!(object instanceof Class323))
			return false;
		Class323 class323_2_ = (Class323) object;
		if (class323_2_.anObject4078 == null && null != anObject4078)
			return false;
		if (anObject4078 == null && class323_2_.anObject4078 != null)
			return false;
		if (class323_2_.anInt4079 * 380662693 == 380662693 * anInt4079 && class323_2_.anObject4078.equals(anObject4078))
			return true;
		return false;
	}

	static final void method4123(Cs2Executor class441, byte i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_3_, (short) 9053);
		Class83 class83 = Class534.aClass83Array5975[i_3_ >> 16];
		Class435.method5267(class73, class83, class441, 72330618);
	}

	static final void method4124(int i, int i_4_, short i_5_) {
		if (Class547_Sub1.aFloat6139 < Class547_Sub1.aFloat6128) {
			Class547_Sub1.aFloat6139 += (double) Class547_Sub1.aFloat6139 / 30.0;
			if (Class547_Sub1.aFloat6139 > Class547_Sub1.aFloat6128)
				Class547_Sub1.aFloat6139 = Class547_Sub1.aFloat6128;
			Class280.method3794(-1522035418);
			Class547_Sub1.anInt6136 = (int) Class547_Sub1.aFloat6128 >> 1;
			Class547_Sub1.aByteArrayArrayArray6166 = Class91.method1518(Class547_Sub1.anInt6136, 1961923964);
		} else if (Class547_Sub1.aFloat6139 > Class547_Sub1.aFloat6128) {
			Class547_Sub1.aFloat6139 -= (double) Class547_Sub1.aFloat6139 / 30.0;
			if (Class547_Sub1.aFloat6139 < Class547_Sub1.aFloat6128)
				Class547_Sub1.aFloat6139 = Class547_Sub1.aFloat6128;
			Class280.method3794(-1792470025);
			Class547_Sub1.anInt6136 = (int) Class547_Sub1.aFloat6128 >> 1;
			Class547_Sub1.aByteArrayArrayArray6166 = Class91.method1518(Class547_Sub1.anInt6136, 1904793069);
		}
		if (-1900153815 * Class547_Sub1.anInt8982 != -1 && -1 != Class547_Sub1.anInt8983 * 104236045) {
			int i_6_ = (-1900153815 * Class547_Sub1.anInt8982 - Class185.anInt2172 * -586790413);
			if (0 != i_6_)
				i_6_ /= Math.min(1153707037 * Class547_Sub1.anInt8978, Math.abs(i_6_));
			int i_7_ = (Class547_Sub1.anInt8983 * 104236045 - Class386.anInt4642 * 1172032773);
			if (i_7_ != 0)
				i_7_ /= Math.min(1153707037 * Class547_Sub1.anInt8978, Math.abs(i_7_));
			Class185.anInt2172 = (-586790413 * Class185.anInt2172 + i_6_) * 106919739;
			Class386.anInt4642 = 1527379917 * (i_7_ + Class386.anInt4642 * 1172032773);
			if (i_6_ == 0 && i_7_ == 0) {
				Class547_Sub1.anInt8982 = 1904285671;
				Class547_Sub1.anInt8983 = 1743033659;
			}
			Class280.method3794(-1187933191);
		}
		Iterator iterator = Class547_Sub1.aHashMap8990.entrySet().iterator();
		while (iterator.hasNext()) {
			Class22 class22 = (Class22) ((Map.Entry) iterator.next()).getValue();
			((Class22) class22).anInt150 -= -632571903;
			if (((Class22) class22).anInt150 * 2046052353 == 0) {
				if (((Class22) class22).anInt149 * -1977441941 <= 1 && !Class547_Sub1.aBool8989)
					iterator.remove();
				else {
					((Class22) class22).anInt149 -= 2021819203;
					((Class22) class22).anInt150 = 545644611 * Class547_Sub1.anInt8993;
				}
			}
		}
		iterator = Class547_Sub1.aHashMap8980.entrySet().iterator();
		while (iterator.hasNext()) {
			Class22 class22 = (Class22) ((Map.Entry) iterator.next()).getValue();
			((Class22) class22).anInt150 -= -632571903;
			if (((Class22) class22).anInt150 * 2046052353 == 0) {
				if (((Class22) class22).anInt149 * -1977441941 <= 1 && !Class547_Sub1.aBool8989)
					iterator.remove();
				else {
					((Class22) class22).anInt149 -= 2021819203;
					((Class22) class22).anInt150 = 545644611 * Class547_Sub1.anInt8993;
				}
			}
		}
		if (Class547_Sub1.aBool8984 && null != Class502.aClass675_5557) {
			for (Class572_Sub41 class572_sub41 = ((Class572_Sub41) Class502.aClass675_5557.method7932((byte) 50)); class572_sub41 != null; class572_sub41 = ((Class572_Sub41) Class502.aClass675_5557.method7926(518985143))) {
				Class78 class78 = ((Class78) (Class547_Sub1.aClass639_Sub12_6173.getDefinition((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623, 1166340915)));
				if (class572_sub41.method8788(i, i_4_, -518555592)) {
					if (class78.aStringArray973 != null) {
						if (class78.aStringArray973[4] != null)
							Class592.method7012(class78.aStringArray973[4], class78.aString989, -1, 1012, -1, (long) ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), -1430206655 * class78.anInt980, 0, true, false, (long) (295399623 * (((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142)), false, 1447140101);
						if (class78.aStringArray973[3] != null)
							Class592.method7012(class78.aStringArray973[3], class78.aString989, -1, 1011, -1, (long) ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), -1430206655 * class78.anInt980, 0, true, false, (long) ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), false, 1447140101);
						if (null != class78.aStringArray973[2])
							Class592.method7012(class78.aStringArray973[2], class78.aString989, -1, 1010, -1, (long) ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), class78.anInt980 * -1430206655, 0, true, false, (long) (295399623 * (((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142)), false, 1447140101);
						if (null != class78.aStringArray973[1])
							Class592.method7012(class78.aStringArray973[1], class78.aString989, -1, 1009, -1, (long) ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), class78.anInt980 * -1430206655, 0, true, false, (long) (295399623 * (((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142)), false, 1447140101);
						if (class78.aStringArray973[0] != null)
							Class592.method7012(class78.aStringArray973[0], class78.aString989, -1, 1008, -1, (long) ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), -1430206655 * class78.anInt980, 0, true, false, (long) ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), false, 1447140101);
					}
					if (!((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.aBool9144) {
						((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.aBool9144 = true;
						Class567.method6723(Class530.aClass530_5910, ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), -1430206655 * class78.anInt980, (short) -9520);
					}
					if (((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.aBool9144)
						Class567.method6723(Class530.aClass530_5912, ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), class78.anInt980 * -1430206655, (short) -20194);
				} else if (((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.aBool9144) {
					((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.aBool9144 = false;
					Class567.method6723(Class530.aClass530_5907, ((((Class572_Sub41) class572_sub41).aClass572_Sub19_9415.anInt9142) * 295399623), class78.anInt980 * -1430206655, (short) -24975);
				}
			}
		}
	}

	public static void method4125(int i, int i_8_, byte i_9_) {
		Class185.anInt2172 = (i - Class547_Sub1.anInt6143) * 106919739;
		Class386.anInt4642 = 1527379917 * (i_8_ - Class547_Sub1.anInt6165);
		Class547_Sub1.anInt8982 = 1904285671;
		Class547_Sub1.anInt8983 = 1743033659;
		Class280.method3794(-1385919519);
	}
}

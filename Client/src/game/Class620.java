package game;

/* Class620 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class620 {
	public static int method7421(int i, int i_0_, int i_1_) {
		i_1_ &= 0x3;
		if (i_1_ == 0)
			return i;
		if (i_1_ == 1)
			return i_0_;
		if (i_1_ == 2)
			return 7 - i;
		return 7 - i_0_;
	}

	public static int method7422(int i, int i_2_, int i_3_) {
		i_3_ &= 0x3;
		if (i_3_ == 0)
			return i;
		if (i_3_ == 1)
			return i_2_;
		if (i_3_ == 2)
			return 7 - i;
		return 7 - i_2_;
	}

	public static int method7423(int i, int i_4_, int i_5_) {
		i_5_ &= 0x3;
		if (0 == i_5_)
			return i;
		if (i_5_ == 1)
			return i_4_;
		if (2 == i_5_)
			return 4095 - i;
		return 4095 - i_4_;
	}

	public static int method7424(int i, int i_6_, int i_7_) {
		i_7_ &= 0x3;
		if (i_7_ == 0)
			return i_6_;
		if (i_7_ == 1)
			return 7 - i;
		if (i_7_ == 2)
			return 7 - i_6_;
		return i;
	}

	public static int method7425(int i, int i_8_, int i_9_) {
		i_9_ &= 0x3;
		if (0 == i_9_)
			return i_8_;
		if (1 == i_9_)
			return 4095 - i;
		if (2 == i_9_)
			return 4095 - i_8_;
		return i;
	}

	Class620() throws Throwable {
		throw new Error();
	}

	public static int method7426(int i, int i_10_, int i_11_) {
		i_11_ &= 0x3;
		if (0 == i_11_)
			return i;
		if (i_11_ == 1)
			return i_10_;
		if (2 == i_11_)
			return 4095 - i;
		return 4095 - i_10_;
	}

	public static int method7427(int i, int i_12_, int i_13_) {
		i_13_ &= 0x3;
		if (i_13_ == 0)
			return i_12_;
		if (i_13_ == 1)
			return 7 - i;
		if (i_13_ == 2)
			return 7 - i_12_;
		return i;
	}

	public static int method7428(int i) {
		if (!Class520.aBool5800)
			return 12;
		Class122.method2199(Class272_Sub2.aClass106_9517, (short) 19604);
		return Class572_Sub2.aTwitchTV8969.Logout();
	}

	static final void method7429(Cs2Executor class441, int i) {
		if (client.anInt8702 * -733280019 >= 5 && client.anInt8702 * -733280019 <= 9)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method7430(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub31_9228.method9141(1770432592);
	}

	static final void method7431(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub33_9238.method9169((byte) -53);
	}

	static boolean method7432(Class78 class78, byte i) {
		if (null == class78)
			return false;
		if (class78.anIntArray984 != null) {
			class78 = class78.method1163(Class547_Sub1.anInterface15_6127, Class547_Sub1.anInterface13_6159, 1393445306);
			if (class78 == null)
				return false;
		}
		if (!class78.aBool971)
			return false;
		if (!class78.method1158(Class547_Sub1.anInterface15_6127, Class547_Sub1.anInterface13_6159, -683248713))
			return false;
		if (Class547_Sub1.aClass676_8991.get((long) (1367229089 * class78.anInt959)) != null)
			return false;
		if (Class547_Sub1.aClass676_8997.get((long) (-1430206655 * class78.anInt980)) != null)
			return false;
		if (null != class78.aString964) {
			if (0 == class78.anInt965 * 1751892143 && Class547_Sub1.aBool8999)
				return false;
			if (1751892143 * class78.anInt965 == 1 && Class547_Sub1.aBool9002)
				return false;
			if (2 == class78.anInt965 * 1751892143 && Class547_Sub1.aBool9001)
				return false;
		}
		return true;
	}

	static final void method7433(boolean bool, int i) {
		client.anInt8869 = 0;
		client.anInt8627 = 0;
		client.anInt8629 += 1469581241;
		Class633.method7554(-1741201418);
		Class484.method5761(bool, (byte) -51);
		Class644.method7629(495827624);
		boolean bool_14_ = false;
		for (int i_15_ = 0; i_15_ < 1412759759 * client.anInt8869; i_15_++) {
			int i_16_ = client.anIntArray8832[i_15_];
			LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) i_16_));
			NPC class456_sub1_sub2_sub3_sub1 = (NPC) class572_sub9.anObject9081;
			if (-2125082999 * client.anInt8629 != -1749769049 * class456_sub1_sub2_sub3_sub1.anInt11649) {
				if (Class25.aBool165 && Class572_Sub10.method8409(i_16_, (byte) -1))
					Class35.method782((short) 582);
				if (class456_sub1_sub2_sub3_sub1.aClass410_11803.method4955((short) 229))
					Class259.method3561(class456_sub1_sub2_sub3_sub1, 1533598718);
				class456_sub1_sub2_sub3_sub1.method10680(null, (byte) -124);
				class572_sub9.method6794((byte) 23);
				bool_14_ = true;
			}
		}
		if (bool_14_) {
			int i_17_ = client.anInt8624 * 617551237;
			client.anInt8624 = client.aClass676_8622.method7962((byte) 0) * -123495603;
			int i_18_ = 0;
			Iterator iterator = client.aClass676_8622.iterator();
			while (iterator.hasNext()) {
				LinkableObject class572_sub9 = (LinkableObject) iterator.next();
				client.aClass572_Sub9Array8623[i_18_++] = class572_sub9;
			}
			for (int i_19_ = 617551237 * client.anInt8624; i_19_ < i_17_; i_19_++)
				client.aClass572_Sub9Array8623[i_19_] = null;
			Class413 class413 = Class133_Sub1.aClass411_Sub1_9827.method4994(-1018533743);
			if (Class413.aClass413_4915 == class413) {
				Class423_Sub3 class423_sub3 = (Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -29);
				class423_sub3.method9313(-966975016);
			}
			Class416 class416 = Class133_Sub1.aClass411_Sub1_9827.method4993((byte) 24);
			if (Class416.aClass416_4935 == class416) {
				Class658_Sub3 class658_sub3 = (Class658_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040);
				class658_sub3.method8977(-1050417047);
			}
		}
		if (-1585139053 * (((Class195) client.aClass195_8589).aClass572_Sub15_Sub2_2330.o) != ((Class195) client.aClass195_8589).anInt2333 * -875297237)
			throw new RuntimeException(new StringBuilder().append(-1585139053 * (((Class195) client.aClass195_8589).aClass572_Sub15_Sub2_2330.o)).append(" ").append(-875297237 * ((Class195) client.aClass195_8589).anInt2333).toString());
		for (int i_20_ = 0; i_20_ < 765313669 * client.anInt8625; i_20_++) {
			if (client.aClass676_8622.get((long) client.anIntArray8626[i_20_]) == null)
				throw new RuntimeException(new StringBuilder().append(i_20_).append(" ").append(client.anInt8625 * 765313669).toString());
		}
		if (client.anInt8624 * 617551237 - client.anInt8625 * 765313669 != 0)
			throw new RuntimeException(new StringBuilder().append("").append(617551237 * client.anInt8624 - client.anInt8625 * 765313669).toString());
		for (int i_21_ = 0; i_21_ < client.anInt8624 * 617551237; i_21_++) {
			if (client.anInt8629 * -2125082999 != (((Entity) client.aClass572_Sub9Array8623[i_21_].anObject9081).anInt11649) * -1749769049)
				throw new RuntimeException(new StringBuilder().append("").append(-821391465 * (((Entity) (client.aClass572_Sub9Array8623[i_21_].anObject9081)).anInt11633)).toString());
		}
	}

	static final void method7434(Cs2Executor class441, int i) {
		int i_22_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_22_, (short) -23010);
		Class83 class83 = Class534.aClass83Array5975[i_22_ >> 16];
		Class190.method2888(class73, class83, class441, 455956284);
	}

	public static Class401 method7435(int i, byte i_23_) {
		if (((Class401) Class401.aClass401_4742).anInt4744 * -241141667 == i)
			return Class401.aClass401_4742;
		if (((Class401) Class401.aClass401_4743).anInt4744 * -241141667 == i)
			return Class401.aClass401_4743;
		return null;
	}
}

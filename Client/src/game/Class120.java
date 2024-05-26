package game;

/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120 {
	int anInt1468;
	int anInt1469;
	int anInt1470;
	int anInt1471;
	int anInt1472;
	Class516 aClass516_1473;
	static Class121 aClass121_1474;

	void method2167() {
		Class500.method5952(-1012352189 * ((Class120) this).anInt1469, 224268371 * ((Class120) this).anInt1471, -1075413501 * ((Class120) this).anInt1470, 1802271777 * ((Class120) this).aClass516_1473.anInt5721, -1, 1870735441 * ((Class120) this).aClass516_1473.anInt5742, 540539263 * ((Class120) this).anInt1468, -2119628336);
	}

	void method2168(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class500.method5952(i, i_0_, i_1_, (1802271777 * ((Class120) this).aClass516_1473.anInt5721), -1066496033 * ((Class120) this).anInt1472, (((Class120) this).aClass516_1473.anInt5742 * 1870735441), i_2_, -2119628336);
		((Class120) this).anInt1469 = i * -170645141;
		((Class120) this).anInt1471 = i_0_ * -1129663525;
		((Class120) this).anInt1470 = -1631544149 * i_1_;
		((Class120) this).anInt1468 = -1170356609 * i_2_;
	}

	void method2169(int i) {
		Class500.method5952(-1012352189 * ((Class120) this).anInt1469, 224268371 * ((Class120) this).anInt1471, -1075413501 * ((Class120) this).anInt1470, 1802271777 * ((Class120) this).aClass516_1473.anInt5721, -1, 1870735441 * ((Class120) this).aClass516_1473.anInt5742, 540539263 * ((Class120) this).anInt1468, -2119628336);
	}

	void method2170(int i, int i_4_, int i_5_, int i_6_) {
		Class500.method5952(i, i_4_, i_5_, (1802271777 * ((Class120) this).aClass516_1473.anInt5721), -1066496033 * ((Class120) this).anInt1472, (((Class120) this).aClass516_1473.anInt5742 * 1870735441), i_6_, -2119628336);
		((Class120) this).anInt1469 = i * -170645141;
		((Class120) this).anInt1471 = i_4_ * -1129663525;
		((Class120) this).anInt1470 = -1631544149 * i_5_;
		((Class120) this).anInt1468 = -1170356609 * i_6_;
	}

	void method2171(int i, int i_7_, int i_8_, int i_9_) {
		Class500.method5952(i, i_7_, i_8_, (1802271777 * ((Class120) this).aClass516_1473.anInt5721), -1066496033 * ((Class120) this).anInt1472, (((Class120) this).aClass516_1473.anInt5742 * 1870735441), i_9_, -2119628336);
		((Class120) this).anInt1469 = i * -170645141;
		((Class120) this).anInt1471 = i_7_ * -1129663525;
		((Class120) this).anInt1470 = -1631544149 * i_8_;
		((Class120) this).anInt1468 = -1170356609 * i_9_;
	}

	void method2172(int i, int i_10_, int i_11_, int i_12_) {
		Class500.method5952(i, i_10_, i_11_, (1802271777 * ((Class120) this).aClass516_1473.anInt5721), -1066496033 * ((Class120) this).anInt1472, (((Class120) this).aClass516_1473.anInt5742 * 1870735441), i_12_, -2119628336);
		((Class120) this).anInt1469 = i * -170645141;
		((Class120) this).anInt1471 = i_10_ * -1129663525;
		((Class120) this).anInt1470 = -1631544149 * i_11_;
		((Class120) this).anInt1468 = -1170356609 * i_12_;
	}

	Class120(RSByteBuffer class572_sub15) {
		((Class120) this).anInt1472 = class572_sub15.readBigSmart((byte) 121) * 1566960671;
		((Class120) this).aClass516_1473 = ((Class516) Class455.method5387(Class197.method2970(244552093), class572_sub15.readUnsignedByte(330722340), -1936589456));
	}

	void method2173() {
		Class500.method5952(-1012352189 * ((Class120) this).anInt1469, 224268371 * ((Class120) this).anInt1471, -1075413501 * ((Class120) this).anInt1470, 1802271777 * ((Class120) this).aClass516_1473.anInt5721, -1, 1870735441 * ((Class120) this).aClass516_1473.anInt5742, 540539263 * ((Class120) this).anInt1468, -2119628336);
	}

	boolean method2174(int i) {
		if (((Class120) this).anInt1472 * -1066496033 >= 0) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (Class289.aClass639_Sub16_3426.getDefinition(-1066496033 * ((Class120) this).anInt1472, -439246537)));
			boolean bool = class509.method6042(1870735441 * (((Class120) this).aClass516_1473.anInt5742), (byte) -94);
			int[] is = class509.method6053((byte) 0);
			if (is != null) {
				int[] is_13_ = is;
				for (int i_14_ = 0; i_14_ < is_13_.length; i_14_++) {
					int i_15_ = is_13_[i_14_];
					bool &= ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_15_, 792819984)).method2291(53405980);
				}
			}
			return bool;
		}
		return true;
	}

	boolean method2175() {
		if (((Class120) this).anInt1472 * -1066496033 >= 0) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (Class289.aClass639_Sub16_3426.getDefinition(-1066496033 * ((Class120) this).anInt1472, 869822711)));
			boolean bool = class509.method6042(1870735441 * (((Class120) this).aClass516_1473.anInt5742), (byte) -41);
			int[] is = class509.method6053((byte) 0);
			if (is != null) {
				int[] is_16_ = is;
				for (int i = 0; i < is_16_.length; i++) {
					int i_17_ = is_16_[i];
					bool &= ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_17_, -234458320)).method2291(1432222398);
				}
			}
			return bool;
		}
		return true;
	}

	boolean method2176() {
		if (((Class120) this).anInt1472 * -1066496033 >= 0) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (Class289.aClass639_Sub16_3426.getDefinition(-1066496033 * ((Class120) this).anInt1472, 1115488418)));
			boolean bool = class509.method6042(1870735441 * (((Class120) this).aClass516_1473.anInt5742), (byte) -99);
			int[] is = class509.method6053((byte) 0);
			if (is != null) {
				int[] is_18_ = is;
				for (int i = 0; i < is_18_.length; i++) {
					int i_19_ = is_18_[i];
					bool &= ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_19_, -2101561524)).method2291(-312625691);
				}
			}
			return bool;
		}
		return true;
	}

	static Class41[] method2177(int i) {
		return new Class41[] { Class41.aClass41_408, Class41.aClass41_414, Class41.aClass41_417, Class41.aClass41_409, Class41.aClass41_413, Class41.aClass41_424, Class41.aClass41_405,
			Class41.aClass41_418, Class41.aClass41_411, Class41.aClass41_412, Class41.aClass41_421, Class41.aClass41_416, Class41.aClass41_410, Class41.aClass41_415, Class41.aClass41_419,
			Class41.aClass41_422, Class41.aClass41_407, Class41.aClass41_406 };
	}

	public static void method2178(byte i) {
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub1_9235), 1, 549483860);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub1_9201), 1, 1056632769);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub28_9218), 1, 708438168);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub23_9208), 1, 1674364611);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub26_9240), 0, 1863547885);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub14_9215), 0, 568117516);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub5_9248), 0, 983961750);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub24_9221), 0, 1793140034);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub12_9230), 0, 1880365549);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub13_9220), 0, 1844827261);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub35_9233), 0, 611630246);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub11_9219), 0, 1688542273);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub2_9247), 0, 605219452);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub2_9203), 0, 1911071066);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub4_9200), 0, 1962718089);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub29_9212), (Class65.aClass65_681.anInt684 * -148076679), 1839682759);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub21_9210), 0, 847129114);
		if (Class272_Sub2.aClass106_9517 != null && Class272_Sub2.aClass106_9517.method1675() && Class272_Sub2.aClass106_9517.method1786())
			Class272_Sub2.aClass106_9517.method1785();
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub31_9228), 0, 1194567380);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub32_9202), 0, 1563921108);
		Class289.method3921((short) -8432);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub7_9227), 2, 1644033438);
		Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub19_9237), 2, 770884200);
		Exception_Sub2.method10186(-206818552);
		client.aClass613_8605.method7306(-1042067865).method5981((byte) 32);
		client.aBool8599 = true;
	}

	static final void method2179(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class584.anInt7734 * -267830063;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class584.anInt7734 * -267830063;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1;
	}

	public static void method2180(int i) {
		Class665_Sub18.method9023((byte) 1);
		Class44.aClass161Array443 = null;
	}
}

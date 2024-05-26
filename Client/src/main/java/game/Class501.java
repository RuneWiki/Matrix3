package game;

/* Class501 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class501 {
	Class472 aClass472_5517;
	Class127 aClass127_5518;
	static int anInt5519;
	Class106 aClass106_5520;
	Class472[][] aClass472ArrayArray5521;
	int anInt5522 = 0;
	int anInt5523 = -401143121;
	long aLong5524 = 0L;
	int[] anIntArray5525;
	static Class580 aClass580_5526;
	Class240 aClass240_5527;
	Class472 aClass472_5528;
	Class472 aClass472_5529;
	Class472 aClass472_5530;
	HashTable aClass466_5531;
	float aFloat5532;
	Class127 aClass127_5533;
	Class127 aClass127_5534;
	float aFloat5535;
	Class248 aClass248_5536;
	boolean aBool5537 = false;
	Class472 aClass472_5538;
	float[] aFloatArray5539;
	boolean aBool5540;
	float aFloat5541;
	boolean aBool5542;
	float aFloat5543;
	float aFloat5544;
	public static int anInt5545 = 1392499547;

	void method5953(int i) {
		((Class501) this).aBool5542 = false;
		int[] is = ((Class501) this).anIntArray5525;
		int[] is_0_ = ((Class501) this).anIntArray5525;
		((Class501) this).anIntArray5525[2] = -1;
		is_0_[1] = -1;
		is[0] = -1;
		float[] fs = ((Class501) this).aFloatArray5539;
		float[] fs_1_ = ((Class501) this).aFloatArray5539;
		((Class501) this).aFloatArray5539[2] = 0.0F;
		fs_1_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public void method5954(Class613 class613, byte i) {
		Class472 class472 = method5990(class613, -1842625661);
		if (null != ((Class501) this).aClass466_5531) {
			((Class501) this).aClass472_5530.method5575(class472, 128161624);
			((Class501) this).aClass472_5530.method5582(this, (((Class501) this).aClass466_5531), (byte) 122);
			method5967(((Class501) this).aClass472_5530, ((Class501) this).aClass466_5531.method5511(504855875), 710576835);
		} else
			method5967(class472, -954591891 * anInt5519, 710576835);
		method5968((byte) 61);
		method5971(-2052930330);
		method5973(-1661464043);
		method5974((byte) 3);
	}

	public void method5955(Class613 class613, HashTable class466, int i, int i_2_) {
		((Class501) this).aClass466_5531 = class466;
		Class472 class472 = method5990(class613, -2056087728);
		if (((Class501) this).aClass466_5531 != null) {
			if (((Class501) this).aClass472_5530 == null)
				((Class501) this).aClass472_5530 = new Class472();
			((Class501) this).aClass472_5530.method5575(class472, 527380644);
			((Class501) this).aClass472_5530.method5582(this, ((Class501) this).aClass466_5531, (byte) 71);
			method5967(((Class501) this).aClass472_5530, i, 710576835);
		} else {
			method5967(class472, i, 710576835);
			((Class501) this).aClass472_5530 = null;
		}
	}

	public HashTable method5956(int i) {
		return ((Class501) this).aClass466_5531;
	}

	public Class472 method5957(int i) {
		return ((Class501) this).aClass472_5517;
	}

	void method5958() {
		if (55276465 * ((Class501) this).anInt5523 >= 0) {
			long l = Class69.method1067(-1856813801);
			((Class501) this).anInt5523 -= ((l - ((Class501) this).aLong5524 * 9010618363478417029L) * 401143121L);
			if (((Class501) this).anInt5523 * 55276465 > 0)
				((Class501) this).aClass472_5517.method5576(((Class501) this).aClass106_5520, ((Class501) this).aClass472_5528, ((Class501) this).aClass472_5529, ((float) (-1694823265 * ((Class501) this).anInt5522 - 55276465 * ((Class501) this).anInt5523) / (float) (-1694823265 * ((Class501) this).anInt5522)), (byte) -68);
			else {
				((Class501) this).aClass472_5517.method5575(((Class501) this).aClass472_5529, 1527701971);
				if ((((Class472) ((Class501) this).aClass472_5517).aClass580_5309) != null)
					((Class472) ((Class501) this).aClass472_5517).aClass580_5309.method6861((byte) 2);
				((Class501) this).anInt5523 = -401143121;
			}
			((Class501) this).aLong5524 = l * 7233756536072514125L;
		}
	}

	public void method5959(int i) {
		((Class501) this).aClass127_5533.method2231((byte) -56);
		((Class501) this).aClass127_5534.method2231((byte) -12);
		((Class501) this).aClass127_5518.method2231((byte) -14);
	}

	Class103 method5960(int i, int i_3_) {
		Class103 class103 = (Class103) ((Class501) this).aClass127_5533.method2246((long) i);
		if (class103 != null)
			return class103;
		class103 = ((Class501) this).aClass106_5520.method1773(i);
		((Class501) this).aClass127_5533.method2229(class103, (long) i);
		return class103;
	}

	Class580 method5961(int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		long l = (((long) i_4_ & 0xffffL) << 48 | ((long) i_5_ & 0xffffL) << 32 | ((long) i_6_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class580 class580 = (Class580) ((Class501) this).aClass127_5534.method2246(l);
		if (null == class580) {
			class580 = Class586.method6956(i, i_4_, i_5_, i_6_, Class629.aClass639_Sub20_8111, Class300.aClass639_Sub13_3489, -54112286);
			((Class501) this).aClass127_5534.method2229(class580, l);
		}
		return class580;
	}

	public void method5962() {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(565343265) * 0.1F + client.aClass613_8605.method7283(1156012835)) * 1.1523438F);
		((Class501) this).aClass106_5520.method1767(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class501) this).aClass106_5520.method1991(13156520, -1, 0);
		((Class501) this).aClass106_5520.method1775(Class392.aClass103_4662);
	}

	public void method5963(int i, int i_8_, Class472 class472, int i_9_) {
		((Class501) this).aClass472ArrayArray5521[i][i_8_] = class472;
	}

	public void method5964(int i) {
		for (int i_10_ = 0; i_10_ < ((Class501) this).aClass472ArrayArray5521.length; i_10_++) {
			for (int i_11_ = 0; (i_11_ < ((Class501) this).aClass472ArrayArray5521[i_10_].length); i_11_++)
				((Class501) this).aClass472ArrayArray5521[i_10_][i_11_] = ((Class501) this).aClass472_5538;
		}
	}

	public void method5965(int i, int i_12_, byte i_13_) {
		Class472 class472 = ((Class501) this).aClass472ArrayArray5521[i][i_12_];
		if (null != class472)
			((Class501) this).aClass240_5527.method3269(((Class472) class472).aClass240_5295);
		method5969((byte) -80);
	}

	public void method5966(float f, float f_14_, float f_15_, int i, int i_16_, int i_17_, int i_18_, int i_19_, byte i_20_) {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(-344867046) * 0.1F + client.aClass613_8605.method7283(1482345377)) * f);
		((Class501) this).aClass106_5520.method1767(i, f_14_, f_15_, (float) (i_16_ << 2), (float) (i_17_ << 2), (float) (i_18_ << 2));
		((Class501) this).aClass106_5520.method1775(method5960(i_19_, -1114892789));
	}

	void method5967(Class472 class472, int i, int i_21_) {
		if (((Class501) this).aBool5537) {
			((Class501) this).aBool5537 = false;
			i = 0;
		}
		if (!((Class501) this).aClass472_5529.method5581(class472, -1946866412)) {
			((Class501) this).aClass472_5529.method5575(class472, 59810545);
			((Class501) this).aLong5524 = Class69.method1067(-2063321681) * 7233756536072514125L;
			((Class501) this).anInt5522 = (((Class501) this).anInt5523 = 401143121 * i) * 1138642351;
			if (0 != -1694823265 * ((Class501) this).anInt5522) {
				((Class501) this).aClass472_5528.method5575(((Class501) this).aClass472_5517, 1994969243);
				if (null != (((Class472) ((Class501) this).aClass472_5517).aClass580_5309)) {
					if (((Class472) ((Class501) this).aClass472_5517).aClass580_5309.method6856(16711935))
						((Class472) ((Class501) this).aClass472_5517).aClass580_5309 = ((Class472) ((Class501) this).aClass472_5528).aClass580_5309 = ((Class472) ((Class501) this).aClass472_5517).aClass580_5309.method6857(218106751);
					if (null != (((Class472) ((Class501) this).aClass472_5517).aClass580_5309) && ((((Class472) ((Class501) this).aClass472_5529).aClass580_5309) != (((Class472) ((Class501) this).aClass472_5517).aClass580_5309)))
						((Class472) ((Class501) this).aClass472_5517).aClass580_5309.method6865((((Class472) ((Class501) this).aClass472_5529).aClass580_5309), (byte) -108);
				}
			}
		}
	}

	void method5968(byte i) {
		if (55276465 * ((Class501) this).anInt5523 >= 0) {
			long l = Class69.method1067(-1992753131);
			((Class501) this).anInt5523 -= ((l - ((Class501) this).aLong5524 * 9010618363478417029L) * 401143121L);
			if (((Class501) this).anInt5523 * 55276465 > 0)
				((Class501) this).aClass472_5517.method5576(((Class501) this).aClass106_5520, ((Class501) this).aClass472_5528, ((Class501) this).aClass472_5529, ((float) (-1694823265 * ((Class501) this).anInt5522 - 55276465 * ((Class501) this).anInt5523) / (float) (-1694823265 * ((Class501) this).anInt5522)), (byte) -26);
			else {
				((Class501) this).aClass472_5517.method5575(((Class501) this).aClass472_5529, 1285604458);
				if ((((Class472) ((Class501) this).aClass472_5517).aClass580_5309) != null)
					((Class472) ((Class501) this).aClass472_5517).aClass580_5309.method6861((byte) 66);
				((Class501) this).anInt5523 = -401143121;
			}
			((Class501) this).aLong5524 = l * 7233756536072514125L;
		}
	}

	public Class501(Class106 class106, Class248 class248, int i, int i_22_) {
		((Class501) this).aClass240_5527 = new Class240(-50.0F, -60.0F, -50.0F);
		((Class501) this).aClass127_5533 = new Class127(8);
		((Class501) this).aClass127_5534 = new Class127(9);
		((Class501) this).aClass127_5518 = new Class127(9);
		((Class501) this).aBool5542 = false;
		((Class501) this).anIntArray5525 = new int[] { -1, -1, -1 };
		((Class501) this).aFloatArray5539 = new float[] { 0.0F, 0.0F, 0.0F };
		((Class501) this).aBool5540 = false;
		((Class501) this).aClass106_5520 = class106;
		((Class501) this).aClass248_5536 = class248;
		((Class501) this).aClass472ArrayArray5521 = new Class472[i][i_22_];
		if (-1 != anInt5545 * 1835737901)
			Class392.aClass103_4662 = method5960(1835737901 * anInt5545, -1114892789);
		aClass580_5526 = null;
		((Class501) this).aClass472_5538 = new Class472();
		((Class501) this).aClass472_5517 = new Class472();
		((Class501) this).aClass472_5528 = new Class472();
		((Class501) this).aClass472_5529 = new Class472();
		method5981((byte) 32);
		method5953(-1040409617);
		method5982((byte) -38);
	}

	void method5969(byte i) {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(-1999603638) * 0.1F + client.aClass613_8605.method7283(1026082419)) * ((Class472) ((Class501) this).aClass472_5517).aFloat5292);
		((Class501) this).aClass106_5520.method1767((((Class472) ((Class501) this).aClass472_5517).anInt5302 * -962674743), ((Class472) ((Class501) this).aClass472_5517).aFloat5293, ((Class472) ((Class501) this).aClass472_5517).aFloat5294, (float) ((int) ((Class501) this).aClass240_5527.aFloat2653 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2656 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2657 << 2));
		((Class501) this).aClass106_5520.method1775(((Class472) ((Class501) this).aClass472_5517).aClass103_5298);
	}

	public void method5970(int i) {
		int i_23_ = 0;
		int i_24_ = i_23_ + ((((Class472) ((Class501) this).aClass472_5517).anInt5305 * -330412533) + 256 << 2);
		((Class501) this).aClass106_5520.method1991((1800241959 * ((Class472) ((Class501) this).aClass472_5517).anInt5296), Class213.aClass572_Sub24_2463.aClass665_Sub11_9219.method8203(1515773199) == 1 ? i_24_ : -1, 0);
	}

	void method5971(int i) {
		((Class501) this).aClass106_5520.method1787(((Class472) ((Class501) this).aClass472_5517).aFloat5301, ((Class472) ((Class501) this).aClass472_5517).aFloat5299, ((Class472) ((Class501) this).aClass472_5517).aFloat5300, 1659861470);
	}

	public void method5972() {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(-902706528) * 0.1F + client.aClass613_8605.method7283(-1977828142)) * 1.1523438F);
		((Class501) this).aClass106_5520.method1767(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class501) this).aClass106_5520.method1991(13156520, -1, 0);
		((Class501) this).aClass106_5520.method1775(Class392.aClass103_4662);
	}

	void method5973(int i) {
		if (((Class501) this).aClass106_5520.method1779()) {
			if (((Class501) this).aBool5540)
				((Class501) this).aClass106_5520.method1702(((Class501) this).aFloat5541, ((Class501) this).aFloat5532, ((Class501) this).aFloat5535, ((Class501) this).aFloat5544, ((Class501) this).aFloat5543);
			else
				((Class501) this).aClass106_5520.method1702(((Class472) ((Class501) this).aClass472_5517).aFloat5308, ((Class472) ((Class501) this).aClass472_5517).aFloat5297, ((Class472) ((Class501) this).aClass472_5517).aFloat5291, ((Class472) ((Class501) this).aClass472_5517).aFloat5306, ((Class472) ((Class501) this).aClass472_5517).aFloat5307);
		}
	}

	void method5974(byte i) {
		if (((Class501) this).aClass106_5520.method1782()) {
			Class96 class96 = null;
			Class96 class96_25_ = null;
			Class96 class96_26_ = null;
			if (((Class501) this).aBool5542) {
				if (((Class501) this).anIntArray5525[0] > -1)
					class96 = method5979(((Class501) this).anIntArray5525[0], 464517806);
				if (((Class501) this).anIntArray5525[1] > -1)
					class96_25_ = method5979(((Class501) this).anIntArray5525[1], 769775796);
				if (((Class501) this).anIntArray5525[2] > -1)
					class96_26_ = method5979(((Class501) this).anIntArray5525[2], -705716403);
				((Class501) this).aClass106_5520.method1774(class96, ((Class501) this).aFloatArray5539[0], class96_25_, ((Class501) this).aFloatArray5539[1], class96_26_, ((Class501) this).aFloatArray5539[2]);
			} else {
				if ((((Class472) ((Class501) this).aClass472_5517).anIntArray5303[0]) > -1)
					class96 = method5979((((Class472) ((Class501) this).aClass472_5517).anIntArray5303[0]), -2093335486);
				if ((((Class472) ((Class501) this).aClass472_5517).anIntArray5303[1]) > -1)
					class96_25_ = method5979((((Class472) (((Class501) this).aClass472_5517)).anIntArray5303[1]), -1872243955);
				if ((((Class472) ((Class501) this).aClass472_5517).anIntArray5303[2]) > -1)
					class96_26_ = method5979((((Class472) (((Class501) this).aClass472_5517)).anIntArray5303[2]), -1510445161);
				((Class501) this).aClass106_5520.method1774(class96, (((Class472) ((Class501) this).aClass472_5517).aFloatArray5304[0]), class96_25_, (((Class472) ((Class501) this).aClass472_5517).aFloatArray5304[1]), class96_26_, (((Class472) ((Class501) this).aClass472_5517).aFloatArray5304[2]));
			}
		}
	}

	void method5975() {
		if (((Class501) this).aClass106_5520.method1779()) {
			if (((Class501) this).aBool5540)
				((Class501) this).aClass106_5520.method1702(((Class501) this).aFloat5541, ((Class501) this).aFloat5532, ((Class501) this).aFloat5535, ((Class501) this).aFloat5544, ((Class501) this).aFloat5543);
			else
				((Class501) this).aClass106_5520.method1702(((Class472) ((Class501) this).aClass472_5517).aFloat5308, ((Class472) ((Class501) this).aClass472_5517).aFloat5297, ((Class472) ((Class501) this).aClass472_5517).aFloat5291, ((Class472) ((Class501) this).aClass472_5517).aFloat5306, ((Class472) ((Class501) this).aClass472_5517).aFloat5307);
		}
	}

	public void method5976(int i) {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(570892186) * 0.1F + client.aClass613_8605.method7283(-1677539787)) * 1.1523438F);
		((Class501) this).aClass106_5520.method1767(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class501) this).aClass106_5520.method1991(13156520, -1, 0);
		((Class501) this).aClass106_5520.method1775(Class392.aClass103_4662);
	}

	void method5977() {
		((Class501) this).aClass106_5520.method1787(((Class472) ((Class501) this).aClass472_5517).aFloat5301, ((Class472) ((Class501) this).aClass472_5517).aFloat5299, ((Class472) ((Class501) this).aClass472_5517).aFloat5300, 1503262955);
	}

	public void method5978(Class613 class613, int i) {
		Class472 class472 = method5990(class613, -2059967749);
		if (null != ((Class501) this).aClass466_5531) {
			((Class501) this).aClass472_5530.method5575(class472, 354914070);
			((Class501) this).aClass472_5530.method5582(this, ((Class501) this).aClass466_5531, (byte) 81);
			method5967(((Class501) this).aClass472_5530, ((Class501) this).aClass466_5531.method5511(504855875), 710576835);
		} else
			method5967(class472, anInt5519 * -954591891, 710576835);
		method5968((byte) 74);
		method5969((byte) -34);
		method5970(-1925336016);
	}

	Class96 method5979(int i, int i_27_) {
		Class96 class96 = (Class96) ((Class501) this).aClass127_5518.method2246((long) i);
		if (class96 != null)
			return class96;
		Class87 class87 = Class160.method2572(((Class501) this).aClass248_5536, i);
		if (null != class87 && class87.method1329() == 256 && class87.method1330() == 16) {
			int[] is = class87.method1285(false);
			class96 = ((Class501) this).aClass106_5520.method1951(is);
			if (null != class96)
				((Class501) this).aClass127_5518.method2229(class96, (long) i);
		}
		return class96;
	}

	void method5980() {
		if (((Class501) this).aClass106_5520.method1779()) {
			if (((Class501) this).aBool5540)
				((Class501) this).aClass106_5520.method1702(((Class501) this).aFloat5541, ((Class501) this).aFloat5532, ((Class501) this).aFloat5535, ((Class501) this).aFloat5544, ((Class501) this).aFloat5543);
			else
				((Class501) this).aClass106_5520.method1702(((Class472) ((Class501) this).aClass472_5517).aFloat5308, ((Class472) ((Class501) this).aClass472_5517).aFloat5297, ((Class472) ((Class501) this).aClass472_5517).aFloat5291, ((Class472) ((Class501) this).aClass472_5517).aFloat5306, ((Class472) ((Class501) this).aClass472_5517).aFloat5307);
		}
	}

	public void method5981(byte i) {
		((Class501) this).aBool5537 = true;
	}

	static {
		anInt5519 = -1302108031;
	}

	void method5982(byte i) {
		((Class501) this).aBool5540 = false;
		((Class501) this).aFloat5541 = 1.0F;
		((Class501) this).aFloat5532 = 0.0F;
		((Class501) this).aFloat5535 = 1.0F;
		((Class501) this).aFloat5544 = 0.0F;
		((Class501) this).aFloat5543 = 1.0F;
	}

	public void method5983() {
		for (int i = 0; i < ((Class501) this).aClass472ArrayArray5521.length; i++) {
			for (int i_28_ = 0; i_28_ < ((Class501) this).aClass472ArrayArray5521[i].length; i_28_++)
				((Class501) this).aClass472ArrayArray5521[i][i_28_] = ((Class501) this).aClass472_5538;
		}
	}

	public void method5984(Class501 class501_29_, int i) {
		((Class501) this).aClass472_5517.method5575(((Class501) class501_29_).aClass472_5517, 551480231);
		((Class501) this).aClass472_5528.method5575(((Class501) class501_29_).aClass472_5528, 832788676);
		((Class501) this).aClass472_5529.method5575(((Class501) class501_29_).aClass472_5529, 1544124966);
		((Class501) this).aLong5524 = ((Class501) class501_29_).aLong5524 * 1L;
		((Class501) this).anInt5522 = 1 * ((Class501) class501_29_).anInt5522;
		((Class501) this).anInt5523 = ((Class501) class501_29_).anInt5523 * 1;
	}

	public void method5985() {
		((Class501) this).aBool5537 = true;
	}

	void method5986() {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(-271493618) * 0.1F + client.aClass613_8605.method7283(-840425352)) * ((Class472) ((Class501) this).aClass472_5517).aFloat5292);
		((Class501) this).aClass106_5520.method1767((((Class472) ((Class501) this).aClass472_5517).anInt5302 * -962674743), ((Class472) ((Class501) this).aClass472_5517).aFloat5293, ((Class472) ((Class501) this).aClass472_5517).aFloat5294, (float) ((int) ((Class501) this).aClass240_5527.aFloat2653 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2656 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2657 << 2));
		((Class501) this).aClass106_5520.method1775(((Class472) ((Class501) this).aClass472_5517).aClass103_5298);
	}

	void method5987() {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(-1914902092) * 0.1F + client.aClass613_8605.method7283(1014959050)) * ((Class472) ((Class501) this).aClass472_5517).aFloat5292);
		((Class501) this).aClass106_5520.method1767((((Class472) ((Class501) this).aClass472_5517).anInt5302 * -962674743), ((Class472) ((Class501) this).aClass472_5517).aFloat5293, ((Class472) ((Class501) this).aClass472_5517).aFloat5294, (float) ((int) ((Class501) this).aClass240_5527.aFloat2653 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2656 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2657 << 2));
		((Class501) this).aClass106_5520.method1775(((Class472) ((Class501) this).aClass472_5517).aClass103_5298);
	}

	void method5988() {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(-1694952187) * 0.1F + client.aClass613_8605.method7283(1568555217)) * ((Class472) ((Class501) this).aClass472_5517).aFloat5292);
		((Class501) this).aClass106_5520.method1767((((Class472) ((Class501) this).aClass472_5517).anInt5302 * -962674743), ((Class472) ((Class501) this).aClass472_5517).aFloat5293, ((Class472) ((Class501) this).aClass472_5517).aFloat5294, (float) ((int) ((Class501) this).aClass240_5527.aFloat2653 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2656 << 2), (float) ((int) ((Class501) this).aClass240_5527.aFloat2657 << 2));
		((Class501) this).aClass106_5520.method1775(((Class472) ((Class501) this).aClass472_5517).aClass103_5298);
	}

	void method5989() {
		if (((Class501) this).aClass106_5520.method1779()) {
			if (((Class501) this).aBool5540)
				((Class501) this).aClass106_5520.method1702(((Class501) this).aFloat5541, ((Class501) this).aFloat5532, ((Class501) this).aFloat5535, ((Class501) this).aFloat5544, ((Class501) this).aFloat5543);
			else
				((Class501) this).aClass106_5520.method1702(((Class472) ((Class501) this).aClass472_5517).aFloat5308, ((Class472) ((Class501) this).aClass472_5517).aFloat5297, ((Class472) ((Class501) this).aClass472_5517).aFloat5291, ((Class472) ((Class501) this).aClass472_5517).aFloat5306, ((Class472) ((Class501) this).aClass472_5517).aFloat5307);
		}
	}

	Class472 method5990(Class613 class613, int i) {
		Object object = null;
		int i_30_ = -1;
		int i_31_ = -1;
		if (Class133_Sub12.method9368(client.anInt8580 * 835742603, 2134888631) || Class19.method692(835742603 * client.anInt8580, (byte) 4)) {
			i_30_ = Class36.anInt387 * 386814715 >> 12;
			i_31_ = Class49.anInt490 * -999214779 >> 12;
		} else {
			if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != null) {
				i_30_ = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) >> 3;
				i_31_ = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0]) >> 3;
			}
			if (i_30_ < 0 || i_30_ >= class613.method7347(-611752976) >> 3 || i_31_ < 0 || i_31_ >= class613.method7278(277214477) >> 3) {
				i_30_ = class613.method7347(-369912339) >> 4;
				i_31_ = class613.method7278(277214477) >> 4;
			}
		}
		Class472 class472 = ((Class501) this).aClass472ArrayArray5521[i_30_][i_31_];
		if (null == class472)
			class472 = ((Class501) this).aClass472_5538;
		return class472;
	}

	void method5991() {
		((Class501) this).aBool5540 = false;
		((Class501) this).aFloat5541 = 1.0F;
		((Class501) this).aFloat5532 = 0.0F;
		((Class501) this).aFloat5535 = 1.0F;
		((Class501) this).aFloat5544 = 0.0F;
		((Class501) this).aFloat5543 = 1.0F;
	}

	void method5992() {
		((Class501) this).aBool5542 = false;
		int[] is = ((Class501) this).anIntArray5525;
		int[] is_32_ = ((Class501) this).anIntArray5525;
		((Class501) this).anIntArray5525[2] = -1;
		is_32_[1] = -1;
		is[0] = -1;
		float[] fs = ((Class501) this).aFloatArray5539;
		float[] fs_33_ = ((Class501) this).aFloatArray5539;
		((Class501) this).aFloatArray5539[2] = 0.0F;
		fs_33_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	public void method5993() {
		((Class501) this).aClass106_5520.method1709((0.7F + (float) Class213.aClass572_Sub24_2463.aClass665_Sub10_9211.method8190(-77322508) * 0.1F + client.aClass613_8605.method7283(494556368)) * 1.1523438F);
		((Class501) this).aClass106_5520.method1767(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class501) this).aClass106_5520.method1991(13156520, -1, 0);
		((Class501) this).aClass106_5520.method1775(Class392.aClass103_4662);
	}

	static void method5994(int i) {
		Class253.anInt2734 = (Class318.aClass284_3875.anInt3412 * 1593101245 + Class318.aClass284_3875.anInt3413 * 1236277411 + 286722598);
		Class452_Sub1.anInt8933 = -825093674 + (Class26.aClass284_215.anInt3412 * 1604033125 + Class26.aClass284_215.anInt3413 * 1460360443);
		LinkableInt.aStringArray9257 = new String[500];
		for (int i_34_ = 0; i_34_ < LinkableInt.aStringArray9257.length; i_34_++)
			LinkableInt.aStringArray9257[i_34_] = "";
		Class118.method2154(Class279.aClass279_3036.method3758(Class594.aClass435_7823, 16711935), -339197376);
	}

	static final void method5995(short i) {
		Class508.method6038(Class272_Sub2.aClass106_9517, (long) client.cycles);
		if (-1 != -507155049 * client.anInt8790)
			Class244.method3347(client.anInt8790 * -507155049, 1981358881);
		for (int i_35_ = 0; i_35_ < client.anInt8560 * 983810053; i_35_++) {
			client.aBoolArray8820[i_35_] = client.aBoolArray8784[i_35_];
			client.aBoolArray8784[i_35_] = false;
		}
		client.anInt8818 = -1851859609 * client.cycles;
		if (client.anInt8790 * -507155049 != -1) {
			client.anInt8560 = 0;
			Class126.method2220((byte) -77);
		}
		Class272_Sub2.aClass106_9517.method1714();
		Class418.method5108(Class272_Sub2.aClass106_9517, (byte) -24);
		int i_36_ = Class15.method652(-1219007896);
		if (-1 == i_36_)
			i_36_ = -646491435 * client.anInt8751;
		if (-1 == i_36_)
			i_36_ = client.anInt8750 * 415097709;
		GraphicsDefinition.method7772(i_36_, -1447681941);
		client.anInt8674 = 0;
	}

	static final void method5996(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		Class344.audio.sendMusic((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr * 1369304407)]), (((Cs2Executor) class441).intStack[1 + (((Cs2Executor) class441).intStackPtr * 1369304407)]));
	}

	static final void method5997(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_37_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_38_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_38_, -1412250518));
		if (class264.method3614(1783094145))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_37_, 1581644047)).method7534(i_38_, class264.aString2833, (byte) 84);
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_37_, -200610486)).method7520(i_38_, -1132777561 * class264.anInt2832, 457820934));
	}
}

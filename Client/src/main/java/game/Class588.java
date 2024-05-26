package game;

/* Class588 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class588 {
	boolean aBool7784;
	Class639_Sub16 aClass639_Sub16_7785;
	int anInt7786;
	int anInt7787;
	int anInt7788;
	int anInt7789;
	boolean aBool7790 = false;
	Model aClass89_7791;
	Class663 aClass663_7792;
	Class663 aClass663_7793;
	int anInt7794;
	Class456_Sub1 aClass456_Sub1_7795;
	Class485 aClass485_7796;
	boolean aBool7797;
	int anInt7798;
	Class572_Sub12_Sub18 aClass572_Sub12_Sub18_7799;
	boolean aBool7800;
	boolean[] aBoolArray7801;
	byte aByte7802;
	Class508 aClass508_7803;

	public void method6967(int i, int i_0_, byte i_1_) {
		((Class588) this).aClass663_7793 = null;
		if (i_0_ > 0) {
			((Class588) this).aClass663_7793 = new Class663_Sub3(((Class588) this).aClass456_Sub1_7795, false);
			((Class588) this).aClass663_7793.method7792(i, i_0_, 1, false, 141851255);
		} else {
			((Class588) this).aBool7797 = true;
			method6973(false, i, 1, 0, -780570591);
		}
	}

	int method6968(int i) {
		return -2031137447 * ((Class588) this).anInt7786;
	}

	void method6969(Class508 class508, int i) {
		((Class588) this).aClass508_7803 = class508;
		((Class588) this).aClass89_7791 = null;
	}

	final Model method6970(Class106 class106, int i, boolean bool, boolean bool_2_, byte i_3_) {
		ObjectDefinitions class509 = ((ObjectDefinitions) (((Class588) this).aClass639_Sub16_7785.getDefinition(((Class588) this).anInt7787 * -2028862971, -1586481063)));
		if (class509.anIntArray5605 != null)
			class509 = class509.method6047(Class133_Sub23.playerVarsProvider, (4 == client.anInt8646 * 1797623853 ? (Interface13) (Class122.anInterface13_1494) : Class133_Sub23.playerVarsProvider), 623307957);
		if (class509 == null) {
			method6989(class106, -712689468);
			((Class588) this).anInt7789 = -546140175;
			return null;
		}
		if (!((Class588) this).aBool7797 && (class509.anInt5607 * -131590913 != ((Class588) this).anInt7789 * -949780753)) {
			method6973(true, -1, 0, 0, -1849465634);
			((Class588) this).aBool7800 = false;
			((Class588) this).aClass89_7791 = null;
		}
		method6982(((Class588) this).aClass456_Sub1_7795, (byte) 97);
		if (bool_2_)
			bool_2_ = bool_2_ & (((Class588) this).aBool7784 & !((Class588) this).aBool7800 & Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 94) != 0);
		if (bool && !bool_2_) {
			((Class588) this).anInt7789 = class509.anInt5607 * -2080650511;
			return null;
		}
		Class240 class240 = (((Class588) this).aClass456_Sub1_7795.method5394().aClass240_2647);
		Class523 class523 = client.aClass613_8605.method7285(2005101247);
		if (bool_2_) {
			class523.method6270(((Class588) this).aClass572_Sub12_Sub18_7799, ((Class588) this).aByte7802, (int) class240.aFloat2653, (int) class240.aFloat2657, ((Class588) this).aBoolArray7801, -1809462580);
			((Class588) this).aBool7800 = false;
		}
		Class174 class174 = class523.aClass174Array5875[((Class588) this).aByte7802];
		Class174 class174_4_;
		if (((Class588) this).aBool7790)
			class174_4_ = class523.aClass174Array5838[0];
		else
			class174_4_ = (((Class588) this).aByte7802 < 3 ? (class523.aClass174Array5875[((Class588) this).aByte7802 + 1]) : null);
		Model model = null;
		if (((Class588) this).aClass663_7792.method7786(-238764718)) {
			if (bool_2_)
				i |= 0x40000;
			model = (class509.method6061(class106, i, (-1832178263 * ((Class588) this).anInt7788 != 11 ? ((Class588) this).anInt7788 * -1832178263 : 10), (11 == -1832178263 * ((Class588) this).anInt7788 ? 776659493 * ((Class588) this).anInt7798 + 4 : 776659493 * ((Class588) this).anInt7798), class174, class174_4_, (int) class240.aFloat2653, class174.method2726((int) class240.aFloat2653, (int) class240.aFloat2657, 358769667), (int) class240.aFloat2657, ((Class588) this).aClass663_7792, ((Class588) this).aClass508_7803, -45921663));
			if (null != model) {
				if (bool_2_) {
					if (null == ((Class588) this).aBoolArray7801)
						((Class588) this).aBoolArray7801 = new boolean[4];
					((Class588) this).aClass572_Sub12_Sub18_7799 = model.method1398(((Class588) this).aClass572_Sub12_Sub18_7799);
					class523.method6261((((Class588) this).aClass572_Sub12_Sub18_7799), ((Class588) this).aByte7802, (int) class240.aFloat2653, (int) class240.aFloat2657, ((Class588) this).aBoolArray7801, -918587528);
					((Class588) this).aBool7800 = true;
				}
				((Class588) this).anInt7786 = model.method1382() * 2136091369;
				model.method1379();
			} else {
				((Class588) this).aBoolArray7801 = null;
				((Class588) this).aClass572_Sub12_Sub18_7799 = null;
				((Class588) this).anInt7786 = 0;
			}
			((Class588) this).aClass89_7791 = null;
		} else if (null == ((Class588) this).aClass89_7791 || (((Class588) this).aClass89_7791.method1353() & i) != i || (-949780753 * ((Class588) this).anInt7789 != class509.anInt5607 * -131590913)) {
			if (null != ((Class588) this).aClass89_7791)
				i |= ((Class588) this).aClass89_7791.method1353();
			Class647 class647 = (class509.method6057(class106, i, (11 != ((Class588) this).anInt7788 * -1832178263 ? -1832178263 * ((Class588) this).anInt7788 : 10), (11 == ((Class588) this).anInt7788 * -1832178263 ? ((Class588) this).anInt7798 * 776659493 + 4 : ((Class588) this).anInt7798 * 776659493), class174, class174_4_, (int) class240.aFloat2653, class174.method2726((int) class240.aFloat2653, (int) class240.aFloat2657, 358769667), (int) class240.aFloat2657, bool_2_, ((Class588) this).aClass508_7803, -272661735));
			if (null != class647) {
				((Class588) this).aClass89_7791 = model = (Model) class647.anObject8324;
				if (bool_2_) {
					((Class588) this).aClass572_Sub12_Sub18_7799 = (Class572_Sub12_Sub18) class647.anObject8325;
					((Class588) this).aBoolArray7801 = null;
					class523.method6261((((Class588) this).aClass572_Sub12_Sub18_7799), ((Class588) this).aByte7802, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 741094071);
					((Class588) this).aBool7800 = true;
				}
				((Class588) this).anInt7786 = model.method1382() * 2136091369;
				model.method1379();
			} else {
				((Class588) this).aBoolArray7801 = null;
				((Class588) this).aClass572_Sub12_Sub18_7799 = null;
				((Class588) this).aClass89_7791 = null;
				((Class588) this).anInt7786 = 0;
			}
		} else
			model = ((Class588) this).aClass89_7791;
		((Class588) this).anInt7789 = -2080650511 * class509.anInt5607;
		return model;
	}

	void method6971(Class106 class106, int i) {
		method6970(class106, 262144, true, true, (byte) -49);
	}

	public void method6972(int i, int i_5_) {
		((Class588) this).aClass663_7793 = null;
		if (i_5_ > 0) {
			((Class588) this).aClass663_7793 = new Class663_Sub3(((Class588) this).aClass456_Sub1_7795, false);
			((Class588) this).aClass663_7793.method7792(i, i_5_, 1, false, -154880490);
		} else {
			((Class588) this).aBool7797 = true;
			method6973(false, i, 1, 0, -1435205895);
		}
	}

	void method6973(boolean bool, int i, int i_6_, int i_7_, int i_8_) {
		int i_9_ = i;
		boolean bool_10_ = false;
		if (i_9_ == -1) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class588) this).aClass639_Sub16_7785.getDefinition(-2028862971 * ((Class588) this).anInt7787, 1702095576)));
			ObjectDefinitions class509_11_ = class509;
			if (null != class509.anIntArray5605)
				class509 = (class509.method6047(Class133_Sub23.playerVarsProvider, (4 == 1797623853 * client.anInt8646 ? (Interface13) Class122.anInterface13_1494 : Class133_Sub23.playerVarsProvider), 623307957));
			if (null == class509)
				return;
			if (class509 == class509_11_)
				class509_11_ = null;
			if (class509.method6050(1669838072)) {
				if (!class509.aBool5636 || Class213.aClass572_Sub24_2463.aClass665_Sub32_9202.method9153(-157796133) == 1) {
					if (bool && ((Class588) this).aClass663_7792.method7786(-1522901921) && class509.method6041(((Class588) this).aClass663_7792.method7795(-1478180242), (byte) 110))
						return;
					if (-949780753 * ((Class588) this).anInt7789 != -131590913 * class509.anInt5607)
						bool_10_ = class509.aBool5672;
					i_9_ = class509.method6052((byte) 86);
					if (class509.method6062(-222652893))
						i_6_ = 0;
					else
						i_6_ = 1;
				}
			} else if (class509_11_ != null && class509_11_.method6050(1825739233) && (!class509_11_.aBool5636 || Class213.aClass572_Sub24_2463.aClass665_Sub32_9202.method9153(-1248953842) == 1)) {
				if (bool && ((Class588) this).aClass663_7792.method7786(843480442) && class509_11_.method6041(((Class588) this).aClass663_7792.method7795(-1478180242), (byte) 42))
					return;
				if (-949780753 * ((Class588) this).anInt7789 != class509.anInt5607 * -131590913)
					bool_10_ = class509_11_.aBool5672;
				i_9_ = class509_11_.method6052((byte) 104);
				if (class509_11_.method6062(1680549224))
					i_6_ = 0;
				else
					i_6_ = 1;
			}
		}
		if (i_9_ == -1)
			((Class588) this).aClass663_7792.method7790(-1, false, (byte) 7);
		else {
			((Class588) this).aClass663_7792.method7792(i_9_, i_7_, i_6_, bool_10_, 812831343);
			((Class588) this).anInt7794 = client.cycles * 1423198429;
			((Class588) this).aBool7800 = false;
			((Class588) this).aClass89_7791 = null;
		}
	}

	int method6974(int i) {
		return -method6968(1832744206);
	}

	public void method6975(int i, int i_12_) {
		((Class588) this).aClass663_7793 = null;
		if (i_12_ > 0) {
			((Class588) this).aClass663_7793 = new Class663_Sub3(((Class588) this).aClass456_Sub1_7795, false);
			((Class588) this).aClass663_7793.method7792(i, i_12_, 1, false, 79428046);
		} else {
			((Class588) this).aBool7797 = true;
			method6973(false, i, 1, 0, -1878951054);
		}
	}

	int method6976() {
		return -2031137447 * ((Class588) this).anInt7786;
	}

	int method6977() {
		return -2031137447 * ((Class588) this).anInt7786;
	}

	int method6978() {
		return -2031137447 * ((Class588) this).anInt7786;
	}

	void method6979(Class106 class106, Model model, Class261 class261, int i, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_) {
		Class84[] class84s = model.method1394();
		Class175[] class175s = model.method1507();
		if ((null == ((Class588) this).aClass485_7796 || ((Class588) this).aClass485_7796.aBool5432) && (class84s != null || class175s != null)) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (((Class588) this).aClass639_Sub16_7785.getDefinition(((Class588) this).anInt7787 * -2028862971, 2087869563)));
			if (class509.anIntArray5605 != null)
				class509 = (class509.method6047(Class133_Sub23.playerVarsProvider, (4 == client.anInt8646 * 1797623853 ? (Interface13) Class122.anInterface13_1494 : Class133_Sub23.playerVarsProvider), 623307957));
			if (null != class509)
				((Class588) this).aClass485_7796 = Class485.method5766(client.cycles, true);
		}
		if (((Class588) this).aClass485_7796 != null) {
			model.method1426(class261);
			if (bool)
				((Class588) this).aClass485_7796.method5771(class106, (long) client.cycles, class84s, class175s, false);
			else
				((Class588) this).aClass485_7796.method5770((long) client.cycles);
			((Class588) this).aClass485_7796.method5775((((Class588) this).aByte7802), i, i_13_, i_14_, i_15_);
		}
	}

	int method6980() {
		return -method6968(1344108127);
	}

	int method6981() {
		return -method6968(1830165140);
	}

	void method6982(Class456_Sub1 class456_sub1, byte i) {
		if (null != ((Class588) this).aClass663_7793 && ((Class588) this).aClass663_7793.method7786(-723399949)) {
			((Class588) this).aClass663_7793.method7802(client.cycles - ((Class588) this).anInt7794 * -1689202827, -800169103);
			if (!((Class588) this).aClass663_7793.method7793(-2076406911)) {
				((Class588) this).aClass663_7792 = ((Class588) this).aClass663_7793;
				((Class588) this).aBool7797 = true;
				((Class588) this).anInt7794 = client.cycles * 1423198429;
				return;
			}
		}
		if (((Class588) this).aClass663_7792.method7786(1502474420)) {
			if (((Class588) this).aClass663_7792.method7802(client.cycles - ((Class588) this).anInt7794 * -1689202827, -1859836473)) {
				if (Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 51) == 2)
					((Class588) this).aBool7800 = false;
				if (((Class588) this).aClass663_7792.method7800(-24083291)) {
					((Class588) this).aClass663_7792.method7801(-1, 751680147);
					((Class588) this).aBool7797 = false;
					method6973(false, -1, 0, 0, -1051896689);
				}
			}
		} else
			method6973(false, -1, 0, 0, -1195237990);
		((Class588) this).anInt7794 = 1423198429 * client.cycles;
	}

	boolean method6983(byte i) {
		return ((Class588) this).aBool7784;
	}

	void method6984(Class106 class106) {
		method6970(class106, 262144, true, true, (byte) -128);
	}

	void method6985(Class106 class106) {
		if (((Class588) this).aClass572_Sub12_Sub18_7799 != null) {
			Class240 class240 = (((Class588) this).aClass456_Sub1_7795.method5394().aClass240_2647);
			client.aClass613_8605.method7285(2020006953).method6270(((Class588) this).aClass572_Sub12_Sub18_7799, ((Class588) this).aByte7802, (int) class240.aFloat2653, (int) class240.aFloat2657, ((Class588) this).aBoolArray7801, 950230871);
			((Class588) this).aBoolArray7801 = null;
			((Class588) this).aClass572_Sub12_Sub18_7799 = null;
		}
	}

	Class588(Class106 class106, Class639_Sub16 class639_sub16, ObjectDefinitions class509, int i, int i_17_, int i_18_, Class456_Sub1 class456_sub1, boolean bool, int i_19_, int i_20_) {
		((Class588) this).anInt7789 = -546140175;
		((Class588) this).anInt7786 = 0;
		((Class588) this).aBool7797 = false;
		((Class588) this).aBool7800 = false;
		((Class588) this).aClass639_Sub16_7785 = class639_sub16;
		((Class588) this).anInt7787 = -124496333 * class509.anInt5607;
		((Class588) this).anInt7788 = i * -203831655;
		((Class588) this).anInt7798 = -1294702163 * i_17_;
		((Class588) this).aClass456_Sub1_7795 = class456_sub1;
		((Class588) this).aBool7797 = -1 != i_19_;
		((Class588) this).aByte7802 = (byte) i_18_;
		((Class588) this).aBool7790 = bool;
		((Class588) this).aBool7784 = (class106.method1674() && class509.aBool5674 && !((Class588) this).aBool7790);
		((Class588) this).aClass663_7792 = new Class663_Sub3(class456_sub1, false);
		method6973(false, i_19_, 1, ((Class588) this).aBool7797 ? i_20_ : 0, -1644643241);
	}

	void method6986(Class106 class106) {
		if (((Class588) this).aClass572_Sub12_Sub18_7799 != null) {
			Class240 class240 = (((Class588) this).aClass456_Sub1_7795.method5394().aClass240_2647);
			client.aClass613_8605.method7285(1188364734).method6270(((Class588) this).aClass572_Sub12_Sub18_7799, ((Class588) this).aByte7802, (int) class240.aFloat2653, (int) class240.aFloat2657, ((Class588) this).aBoolArray7801, 1875218931);
			((Class588) this).aBoolArray7801 = null;
			((Class588) this).aClass572_Sub12_Sub18_7799 = null;
		}
	}

	ObjectDefinitions method6987(byte i) {
		return ((ObjectDefinitions) (((Class588) this).aClass639_Sub16_7785.getDefinition(((Class588) this).anInt7787 * -2028862971, 172429189)));
	}

	int method6988() {
		return -method6968(1681720314);
	}

	void method6989(Class106 class106, int i) {
		if (((Class588) this).aClass572_Sub12_Sub18_7799 != null) {
			Class240 class240 = (((Class588) this).aClass456_Sub1_7795.method5394().aClass240_2647);
			client.aClass613_8605.method7285(1649957036).method6270(((Class588) this).aClass572_Sub12_Sub18_7799, ((Class588) this).aByte7802, (int) class240.aFloat2653, (int) class240.aFloat2657, ((Class588) this).aBoolArray7801, -2083685375);
			((Class588) this).aBoolArray7801 = null;
			((Class588) this).aClass572_Sub12_Sub18_7799 = null;
		}
	}

	static final void method6990(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= -1235064193;
		String string = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]);
		String string_21_ = (String) (((Cs2Executor) class441).objectStack[1628307581 * ((Cs2Executor) class441).objectStackPtr + 1]);
		String string_22_ = (String) (((Cs2Executor) class441).objectStack[2 + ((Cs2Executor) class441).objectStackPtr * 1628307581]);
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1);
		Class104_Sub1.method9917(string, string_21_, string_22_, bool, (byte) 58);
	}

	static final void method6991(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class59.method1005(class73, class83, class441, (short) -11154);
	}
}

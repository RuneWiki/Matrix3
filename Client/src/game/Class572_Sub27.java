package game;

/* Class572_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub27 extends Class572 {
	int anInt9259;
	ObjectDefinitions aClass509_9260;
	static Class675 aClass675_9261;
	static Class676 aClass676_9262;
	int anInt9263;
	int anInt9264;
	int anInt9265;
	int anInt9266;
	int anInt9267;
	int[] anIntArray9268;
	Class240 aClass240_9269;
	boolean aBool9270;
	int anInt9271;
	static Class675 aClass675_9272 = new Class675();
	Class240 aClass240_9273 = new Class240(0.0F, 0.0F, 0.0F);
	int anInt9274;
	Player aClass456_Sub1_Sub2_Sub3_Sub2_9275;
	static final int anInt9276 = 0;
	static final int anInt9277 = 1;
	static final int anInt9278 = 2;
	static final int anInt9279 = 3;
	int anInt9280;
	int anInt9281;
	int anInt9282;
	int anInt9283;
	int anInt9284;
	Class603 aClass603_9285;
	Class603 aClass603_9286;
	int anInt9287;
	int anInt9288;
	static final int anInt9289 = 512;
	NPC aClass456_Sub1_Sub2_Sub3_Sub1_9290;

	void method8630() {
		int i = ((Class572_Sub27) this).anInt9284 * 293216223;
		if (((Class572_Sub27) this).aClass509_9260 != null) {
			ObjectDefinitions class509 = (((Class572_Sub27) this).aClass509_9260.method6047(Class133_Sub23.playerVarsProvider, (1797623853 * client.anInt8646 == 4 ? (Interface13) Class122.anInterface13_1494 : Class133_Sub23.playerVarsProvider), 623307957));
			if (null != class509) {
				((Class572_Sub27) this).anInt9284 = 1320697427 * class509.anInt5665;
				((Class572_Sub27) this).anInt9271 = (class509.anInt5656 * 1193964015 << 9) * 354114265;
				((Class572_Sub27) this).anInt9281 = class509.anInt5668 * -2040910685;
				((Class572_Sub27) this).anInt9287 = -674188913 * class509.anInt5620;
				((Class572_Sub27) this).anInt9288 = -347077815 * class509.anInt5670;
				((Class572_Sub27) this).anIntArray9268 = class509.anIntArray5671;
				((Class572_Sub27) this).anInt9283 = -530301109 * class509.anInt5610;
				((Class572_Sub27) this).anInt9282 = -1335196643 * class509.anInt5679;
			} else {
				((Class572_Sub27) this).anInt9284 = 1853989857;
				((Class572_Sub27) this).anInt9271 = 0;
				((Class572_Sub27) this).anInt9281 = 0;
				((Class572_Sub27) this).anInt9287 = 0;
				((Class572_Sub27) this).anInt9288 = 0;
				((Class572_Sub27) this).anIntArray9268 = null;
				((Class572_Sub27) this).anInt9283 = -993786112;
				((Class572_Sub27) this).anInt9282 = 2144262400;
				((Class572_Sub27) this).anInt9259 = 0;
			}
		} else if (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290 != null) {
			int i_0_ = Class474.method5624((((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290), (byte) 0);
			if (i_0_ != i) {
				((Class572_Sub27) this).anInt9284 = i_0_ * -1853989857;
				NPCDefintion class410 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aClass410_11803);
				if (class410.anIntArray4795 != null)
					class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -433081133);
				if (class410 != null) {
					((Class572_Sub27) this).anInt9271 = 354114265 * (class410.anInt4843 * -1077640307 << 9);
					((Class572_Sub27) this).anInt9259 = -1707973957 * (class410.anInt4789 * 881100189 << 9);
					((Class572_Sub27) this).anInt9281 = class410.anInt4790 * 2128225023;
					((Class572_Sub27) this).anInt9283 = class410.anInt4855 * -724759637;
					((Class572_Sub27) this).anInt9282 = class410.anInt4794 * -1728880853;
				} else {
					((Class572_Sub27) this).anInt9259 = 0;
					((Class572_Sub27) this).anInt9271 = 0;
					((Class572_Sub27) this).anInt9281 = 0;
					((Class572_Sub27) this).anInt9283 = -993786112;
					((Class572_Sub27) this).anInt9282 = 2144262400;
				}
			}
		} else if (null != (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275)) {
			((Class572_Sub27) this).anInt9284 = (Class102_Sub5.method9949(((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275, -2119515541)) * -1853989857;
			((Class572_Sub27) this).anInt9271 = (354114265 * (-288578911 * (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11834) << 9));
			((Class572_Sub27) this).anInt9259 = 0;
			((Class572_Sub27) this).anInt9281 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11835) * 958321679;
			((Class572_Sub27) this).anInt9283 = -993786112;
			((Class572_Sub27) this).anInt9282 = 2144262400;
		}
		if (i != 293216223 * ((Class572_Sub27) this).anInt9284 && ((Class572_Sub27) this).aClass603_9285 != null && null != ((Class572_Sub27) this).aClass603_9285) {
			((Class572_Sub27) this).aClass603_9285.method7098(100, -1110366939);
			Class344.audio.method958(((Class572_Sub27) this).aClass603_9285, 541535914);
			((Class572_Sub27) this).aClass603_9285 = null;
		}
	}

	void method8631(short i) {
		int i_1_ = ((Class572_Sub27) this).anInt9284 * 293216223;
		if (((Class572_Sub27) this).aClass509_9260 != null) {
			ObjectDefinitions class509 = (((Class572_Sub27) this).aClass509_9260.method6047(Class133_Sub23.playerVarsProvider, (1797623853 * client.anInt8646 == 4 ? (Interface13) Class122.anInterface13_1494 : Class133_Sub23.playerVarsProvider), 623307957));
			if (null != class509) {
				((Class572_Sub27) this).anInt9284 = 1320697427 * class509.anInt5665;
				((Class572_Sub27) this).anInt9271 = (class509.anInt5656 * 1193964015 << 9) * 354114265;
				((Class572_Sub27) this).anInt9281 = class509.anInt5668 * -2040910685;
				((Class572_Sub27) this).anInt9287 = -674188913 * class509.anInt5620;
				((Class572_Sub27) this).anInt9288 = -347077815 * class509.anInt5670;
				((Class572_Sub27) this).anIntArray9268 = class509.anIntArray5671;
				((Class572_Sub27) this).anInt9283 = -530301109 * class509.anInt5610;
				((Class572_Sub27) this).anInt9282 = -1335196643 * class509.anInt5679;
			} else {
				((Class572_Sub27) this).anInt9284 = 1853989857;
				((Class572_Sub27) this).anInt9271 = 0;
				((Class572_Sub27) this).anInt9281 = 0;
				((Class572_Sub27) this).anInt9287 = 0;
				((Class572_Sub27) this).anInt9288 = 0;
				((Class572_Sub27) this).anIntArray9268 = null;
				((Class572_Sub27) this).anInt9283 = -993786112;
				((Class572_Sub27) this).anInt9282 = 2144262400;
				((Class572_Sub27) this).anInt9259 = 0;
			}
		} else if (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290 != null) {
			int i_2_ = Class474.method5624((((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290), (byte) 0);
			if (i_2_ != i_1_) {
				((Class572_Sub27) this).anInt9284 = i_2_ * -1853989857;
				NPCDefintion class410 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aClass410_11803);
				if (class410.anIntArray4795 != null)
					class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 1464003762);
				if (class410 != null) {
					((Class572_Sub27) this).anInt9271 = 354114265 * (class410.anInt4843 * -1077640307 << 9);
					((Class572_Sub27) this).anInt9259 = -1707973957 * (class410.anInt4789 * 881100189 << 9);
					((Class572_Sub27) this).anInt9281 = class410.anInt4790 * 2128225023;
					((Class572_Sub27) this).anInt9283 = class410.anInt4855 * -724759637;
					((Class572_Sub27) this).anInt9282 = class410.anInt4794 * -1728880853;
				} else {
					((Class572_Sub27) this).anInt9259 = 0;
					((Class572_Sub27) this).anInt9271 = 0;
					((Class572_Sub27) this).anInt9281 = 0;
					((Class572_Sub27) this).anInt9283 = -993786112;
					((Class572_Sub27) this).anInt9282 = 2144262400;
				}
			}
		} else if (null != (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275)) {
			((Class572_Sub27) this).anInt9284 = (Class102_Sub5.method9949(((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275, -1822410801)) * -1853989857;
			((Class572_Sub27) this).anInt9271 = (354114265 * (-288578911 * (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11834) << 9));
			((Class572_Sub27) this).anInt9259 = 0;
			((Class572_Sub27) this).anInt9281 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11835) * 958321679;
			((Class572_Sub27) this).anInt9283 = -993786112;
			((Class572_Sub27) this).anInt9282 = 2144262400;
		}
		if (i_1_ != 293216223 * ((Class572_Sub27) this).anInt9284 && ((Class572_Sub27) this).aClass603_9285 != null && null != ((Class572_Sub27) this).aClass603_9285) {
			((Class572_Sub27) this).aClass603_9285.method7098(100, -1110366939);
			Class344.audio.method958((((Class572_Sub27) this).aClass603_9285), -1044709575);
			((Class572_Sub27) this).aClass603_9285 = null;
		}
	}

	static {
		aClass675_9261 = new Class675();
		aClass676_9262 = new Class676(16);
	}

	public static void method8632(boolean bool) {
		for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9272.method7932((byte) 50); null != class572_sub27; class572_sub27 = (Class572_Sub27) aClass675_9272.method7926(676672177)) {
			if (null != ((Class572_Sub27) class572_sub27).aClass603_9285) {
				((Class572_Sub27) class572_sub27).aClass603_9285.method7098(150, -1110366939);
				Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -233345610);
				((Class572_Sub27) class572_sub27).aClass603_9285 = null;
			}
			if (((Class572_Sub27) class572_sub27).aClass603_9286 != null) {
				((Class572_Sub27) class572_sub27).aClass603_9286.method7098(150, -1110366939);
				Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9286), 964431968);
				((Class572_Sub27) class572_sub27).aClass603_9286 = null;
			}
			class572_sub27.method6794((byte) -65);
		}
		if (bool) {
			for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9261.method7932((byte) 50); class572_sub27 != null; class572_sub27 = (Class572_Sub27) aClass675_9261.method7926(745848967)) {
				if (((Class572_Sub27) class572_sub27).aClass603_9285 != null) {
					((Class572_Sub27) class572_sub27).aClass603_9285.method7098(150, -1110366939);
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -624034926);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
				class572_sub27.method6794((byte) -112);
			}
			for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass676_9262.method7968((byte) 7); class572_sub27 != null; class572_sub27 = ((Class572_Sub27) aClass676_9262.method7969(-174856541))) {
				if (null != ((Class572_Sub27) class572_sub27).aClass603_9285) {
					((Class572_Sub27) class572_sub27).aClass603_9285.method7098(150, -1110366939);
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), 430575633);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
				class572_sub27.method6794((byte) 14);
			}
		}
	}

	void method8633() {
		int i = ((Class572_Sub27) this).anInt9284 * 293216223;
		if (((Class572_Sub27) this).aClass509_9260 != null) {
			ObjectDefinitions class509 = (((Class572_Sub27) this).aClass509_9260.method6047(Class133_Sub23.playerVarsProvider, (1797623853 * client.anInt8646 == 4 ? (Interface13) Class122.anInterface13_1494 : Class133_Sub23.playerVarsProvider), 623307957));
			if (null != class509) {
				((Class572_Sub27) this).anInt9284 = 1320697427 * class509.anInt5665;
				((Class572_Sub27) this).anInt9271 = (class509.anInt5656 * 1193964015 << 9) * 354114265;
				((Class572_Sub27) this).anInt9281 = class509.anInt5668 * -2040910685;
				((Class572_Sub27) this).anInt9287 = -674188913 * class509.anInt5620;
				((Class572_Sub27) this).anInt9288 = -347077815 * class509.anInt5670;
				((Class572_Sub27) this).anIntArray9268 = class509.anIntArray5671;
				((Class572_Sub27) this).anInt9283 = -530301109 * class509.anInt5610;
				((Class572_Sub27) this).anInt9282 = -1335196643 * class509.anInt5679;
			} else {
				((Class572_Sub27) this).anInt9284 = 1853989857;
				((Class572_Sub27) this).anInt9271 = 0;
				((Class572_Sub27) this).anInt9281 = 0;
				((Class572_Sub27) this).anInt9287 = 0;
				((Class572_Sub27) this).anInt9288 = 0;
				((Class572_Sub27) this).anIntArray9268 = null;
				((Class572_Sub27) this).anInt9283 = -993786112;
				((Class572_Sub27) this).anInt9282 = 2144262400;
				((Class572_Sub27) this).anInt9259 = 0;
			}
		} else if (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290 != null) {
			int i_3_ = Class474.method5624((((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290), (byte) 0);
			if (i_3_ != i) {
				((Class572_Sub27) this).anInt9284 = i_3_ * -1853989857;
				NPCDefintion class410 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aClass410_11803);
				if (class410.anIntArray4795 != null)
					class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -1477801867);
				if (class410 != null) {
					((Class572_Sub27) this).anInt9271 = 354114265 * (class410.anInt4843 * -1077640307 << 9);
					((Class572_Sub27) this).anInt9259 = -1707973957 * (class410.anInt4789 * 881100189 << 9);
					((Class572_Sub27) this).anInt9281 = class410.anInt4790 * 2128225023;
					((Class572_Sub27) this).anInt9283 = class410.anInt4855 * -724759637;
					((Class572_Sub27) this).anInt9282 = class410.anInt4794 * -1728880853;
				} else {
					((Class572_Sub27) this).anInt9259 = 0;
					((Class572_Sub27) this).anInt9271 = 0;
					((Class572_Sub27) this).anInt9281 = 0;
					((Class572_Sub27) this).anInt9283 = -993786112;
					((Class572_Sub27) this).anInt9282 = 2144262400;
				}
			}
		} else if (null != (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275)) {
			((Class572_Sub27) this).anInt9284 = (Class102_Sub5.method9949(((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275, -1742478061)) * -1853989857;
			((Class572_Sub27) this).anInt9271 = (354114265 * (-288578911 * (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11834) << 9));
			((Class572_Sub27) this).anInt9259 = 0;
			((Class572_Sub27) this).anInt9281 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11835) * 958321679;
			((Class572_Sub27) this).anInt9283 = -993786112;
			((Class572_Sub27) this).anInt9282 = 2144262400;
		}
		if (i != 293216223 * ((Class572_Sub27) this).anInt9284 && ((Class572_Sub27) this).aClass603_9285 != null && null != ((Class572_Sub27) this).aClass603_9285) {
			((Class572_Sub27) this).aClass603_9285.method7098(100, -1110366939);
			Class344.audio.method958(((Class572_Sub27) this).aClass603_9285, -498603181);
			((Class572_Sub27) this).aClass603_9285 = null;
		}
	}

	public static void method8634() {
		for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9272.method7932((byte) 50); class572_sub27 != null; class572_sub27 = (Class572_Sub27) aClass675_9272.method7926(1944827963)) {
			if (((Class572_Sub27) class572_sub27).aBool9270)
				class572_sub27.method8631((short) -6535);
		}
		for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9261.method7932((byte) 50); class572_sub27 != null; class572_sub27 = (Class572_Sub27) aClass675_9261.method7926(64375679)) {
			if (((Class572_Sub27) class572_sub27).aBool9270)
				class572_sub27.method8631((short) -28398);
		}
	}

	void method8635() {
		int i = ((Class572_Sub27) this).anInt9284 * 293216223;
		if (((Class572_Sub27) this).aClass509_9260 != null) {
			ObjectDefinitions class509 = (((Class572_Sub27) this).aClass509_9260.method6047(Class133_Sub23.playerVarsProvider, (1797623853 * client.anInt8646 == 4 ? (Interface13) Class122.anInterface13_1494 : Class133_Sub23.playerVarsProvider), 623307957));
			if (null != class509) {
				((Class572_Sub27) this).anInt9284 = 1320697427 * class509.anInt5665;
				((Class572_Sub27) this).anInt9271 = (class509.anInt5656 * 1193964015 << 9) * 354114265;
				((Class572_Sub27) this).anInt9281 = class509.anInt5668 * -2040910685;
				((Class572_Sub27) this).anInt9287 = -674188913 * class509.anInt5620;
				((Class572_Sub27) this).anInt9288 = -347077815 * class509.anInt5670;
				((Class572_Sub27) this).anIntArray9268 = class509.anIntArray5671;
				((Class572_Sub27) this).anInt9283 = -530301109 * class509.anInt5610;
				((Class572_Sub27) this).anInt9282 = -1335196643 * class509.anInt5679;
			} else {
				((Class572_Sub27) this).anInt9284 = 1853989857;
				((Class572_Sub27) this).anInt9271 = 0;
				((Class572_Sub27) this).anInt9281 = 0;
				((Class572_Sub27) this).anInt9287 = 0;
				((Class572_Sub27) this).anInt9288 = 0;
				((Class572_Sub27) this).anIntArray9268 = null;
				((Class572_Sub27) this).anInt9283 = -993786112;
				((Class572_Sub27) this).anInt9282 = 2144262400;
				((Class572_Sub27) this).anInt9259 = 0;
			}
		} else if (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290 != null) {
			int i_4_ = Class474.method5624((((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290), (byte) 0);
			if (i_4_ != i) {
				((Class572_Sub27) this).anInt9284 = i_4_ * -1853989857;
				NPCDefintion class410 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aClass410_11803);
				if (class410.anIntArray4795 != null)
					class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -266740980);
				if (class410 != null) {
					((Class572_Sub27) this).anInt9271 = 354114265 * (class410.anInt4843 * -1077640307 << 9);
					((Class572_Sub27) this).anInt9259 = -1707973957 * (class410.anInt4789 * 881100189 << 9);
					((Class572_Sub27) this).anInt9281 = class410.anInt4790 * 2128225023;
					((Class572_Sub27) this).anInt9283 = class410.anInt4855 * -724759637;
					((Class572_Sub27) this).anInt9282 = class410.anInt4794 * -1728880853;
				} else {
					((Class572_Sub27) this).anInt9259 = 0;
					((Class572_Sub27) this).anInt9271 = 0;
					((Class572_Sub27) this).anInt9281 = 0;
					((Class572_Sub27) this).anInt9283 = -993786112;
					((Class572_Sub27) this).anInt9282 = 2144262400;
				}
			}
		} else if (null != (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275)) {
			((Class572_Sub27) this).anInt9284 = (Class102_Sub5.method9949(((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275, -1930207217)) * -1853989857;
			((Class572_Sub27) this).anInt9271 = (354114265 * (-288578911 * (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11834) << 9));
			((Class572_Sub27) this).anInt9259 = 0;
			((Class572_Sub27) this).anInt9281 = (((Class572_Sub27) this).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11835) * 958321679;
			((Class572_Sub27) this).anInt9283 = -993786112;
			((Class572_Sub27) this).anInt9282 = 2144262400;
		}
		if (i != 293216223 * ((Class572_Sub27) this).anInt9284 && ((Class572_Sub27) this).aClass603_9285 != null && null != ((Class572_Sub27) this).aClass603_9285) {
			((Class572_Sub27) this).aClass603_9285.method7098(100, -1110366939);
			Class344.audio.method958(((Class572_Sub27) this).aClass603_9285, -966998629);
			((Class572_Sub27) this).aClass603_9285 = null;
		}
	}

	public static void method8636(int i, int i_5_, int i_6_, int i_7_) {
		for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9272.method7932((byte) 50); null != class572_sub27; class572_sub27 = (Class572_Sub27) aClass675_9272.method7926(1438891607))
			Class572_Sub12_Sub2.method10233(class572_sub27, i, i_5_, i_6_, i_7_, (byte) 12);
		for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9261.method7932((byte) 50); class572_sub27 != null; class572_sub27 = (Class572_Sub27) aClass675_9261.method7926(2087598740)) {
			int i_8_ = 1;
			Class538 class538 = ((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.method10554((byte) -10);
			int i_9_ = ((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aClass663_Sub2_11631.method7795(-1478180242);
			if (i_9_ == -1 || (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aClass663_Sub2_11631.aBool9556))
				i_8_ = 0;
			else if (i_9_ == -182549727 * class538.anInt6026 || -1172829509 * class538.anInt6027 == i_9_ || i_9_ == class538.anInt6019 * -1871450263 || -1351448577 * class538.anInt6028 == i_9_)
				i_8_ = 2;
			else if (i_9_ == class538.anInt6030 * -1506072601 || 1966431491 * class538.anInt6031 == i_9_ || class538.anInt6033 * 1541680687 == i_9_ || i_9_ == -500215193 * class538.anInt6032)
				i_8_ = 3;
			if (i_8_ != 24924203 * ((Class572_Sub27) class572_sub27).anInt9267) {
				int i_10_ = (Class474.method5624((((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290), (byte) 0));
				NPCDefintion class410 = (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aClass410_11803);
				if (class410.anIntArray4795 != null)
					class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -1544774653);
				if (null == class410 || -1 == i_10_) {
					((Class572_Sub27) class572_sub27).anInt9284 = 1853989857;
					((Class572_Sub27) class572_sub27).anInt9267 = 135392899 * i_8_;
				} else if (i_10_ != (((Class572_Sub27) class572_sub27).anInt9284 * 293216223)) {
					boolean bool = false;
					if (((Class572_Sub27) class572_sub27).aClass603_9285 != null) {
						((Class572_Sub27) class572_sub27).anInt9281 -= -1699524096;
						if ((((Class572_Sub27) class572_sub27).anInt9281 * -1790944615) <= 0) {
							((Class572_Sub27) class572_sub27).aClass603_9285.method7098(100, -1110366939);
							Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -36130758);
							((Class572_Sub27) class572_sub27).aClass603_9285 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						((Class572_Sub27) class572_sub27).anInt9281 = class410.anInt4790 * 2128225023;
						((Class572_Sub27) class572_sub27).anInt9284 = -1853989857 * i_10_;
						((Class572_Sub27) class572_sub27).anInt9267 = i_8_ * 135392899;
					}
				} else {
					((Class572_Sub27) class572_sub27).anInt9267 = i_8_ * 135392899;
					((Class572_Sub27) class572_sub27).anInt9281 = class410.anInt4790 * 2128225023;
				}
			}
			Class240 class240 = (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.method5394().aClass240_2647);
			((Class572_Sub27) class572_sub27).anInt9264 = (int) class240.aFloat2653 * 1200357575;
			((Class572_Sub27) class572_sub27).anInt9266 = ((int) class240.aFloat2653 + (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.method10556((short) 438) << 8)) * -1754587443;
			((Class572_Sub27) class572_sub27).anInt9265 = (int) class240.aFloat2657 * 904406815;
			((Class572_Sub27) class572_sub27).anInt9280 = ((int) class240.aFloat2657 + (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.method10556((short) 55) << 8)) * -2061202665;
			((Class572_Sub27) class572_sub27).anInt9274 = -57728029 * (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290.aByte9009);
			Class572_Sub12_Sub2.method10233(class572_sub27, i, i_5_, i_6_, i_7_, (byte) 12);
		}
		for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass676_9262.method7968((byte) 29); null != class572_sub27; class572_sub27 = (Class572_Sub27) aClass676_9262.method7969(-295135868)) {
			int i_11_ = 1;
			Class538 class538 = ((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.method10554((byte) 78);
			int i_12_ = ((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.aClass663_Sub2_11631.method7795(-1478180242);
			if (i_12_ == -1 || (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.aClass663_Sub2_11631.aBool9556))
				i_11_ = 0;
			else if (class538.anInt6026 * -182549727 == i_12_ || i_12_ == -1172829509 * class538.anInt6027 || i_12_ == class538.anInt6019 * -1871450263 || class538.anInt6028 * -1351448577 == i_12_)
				i_11_ = 2;
			else if (i_12_ == class538.anInt6030 * -1506072601 || i_12_ == 1966431491 * class538.anInt6031 || i_12_ == 1541680687 * class538.anInt6033 || class538.anInt6032 * -500215193 == i_12_)
				i_11_ = 3;
			if (24924203 * ((Class572_Sub27) class572_sub27).anInt9267 != i_11_) {
				int i_13_ = (Class102_Sub5.method9949((((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275), -2008376471));
				if (i_13_ != (293216223 * ((Class572_Sub27) class572_sub27).anInt9284)) {
					boolean bool = false;
					if (null != ((Class572_Sub27) class572_sub27).aClass603_9285) {
						((Class572_Sub27) class572_sub27).anInt9281 -= -1699524096;
						if ((((Class572_Sub27) class572_sub27).anInt9281 * -1790944615) <= 0) {
							((Class572_Sub27) class572_sub27).aClass603_9285.method7098(100, -1110366939);
							Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -631124743);
							((Class572_Sub27) class572_sub27).aClass603_9285 = null;
							bool = true;
						}
					} else
						bool = true;
					if (bool) {
						((Class572_Sub27) class572_sub27).anInt9281 = ((((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11835) * 958321679);
						((Class572_Sub27) class572_sub27).anInt9284 = -1853989857 * i_13_;
						((Class572_Sub27) class572_sub27).anInt9267 = i_11_ * 135392899;
					}
				} else {
					((Class572_Sub27) class572_sub27).anInt9281 = ((((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.anInt11835) * 958321679);
					((Class572_Sub27) class572_sub27).anInt9267 = i_11_ * 135392899;
				}
			}
			Class240 class240 = (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.method5394().aClass240_2647);
			((Class572_Sub27) class572_sub27).anInt9264 = 1200357575 * (int) class240.aFloat2653;
			((Class572_Sub27) class572_sub27).anInt9266 = ((int) class240.aFloat2653 + (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.method10556((short) -23732) << 8)) * -1754587443;
			((Class572_Sub27) class572_sub27).anInt9265 = (int) class240.aFloat2657 * 904406815;
			((Class572_Sub27) class572_sub27).anInt9280 = ((int) class240.aFloat2657 + (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.method10556((short) -23721) << 8)) * -2061202665;
			((Class572_Sub27) class572_sub27).anInt9274 = (((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275.aByte9009) * -57728029;
			Class572_Sub12_Sub2.method10233(class572_sub27, i, i_5_, i_6_, i_7_, (byte) 12);
		}
	}

	Class572_Sub27() {
		((Class572_Sub27) this).aClass240_9269 = new Class240(0.0F, 0.0F, 0.0F);
		((Class572_Sub27) this).anInt9267 = 0;
	}

	public static void method8637(boolean bool) {
		for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9272.method7932((byte) 50); null != class572_sub27; class572_sub27 = (Class572_Sub27) aClass675_9272.method7926(1769850293)) {
			if (null != ((Class572_Sub27) class572_sub27).aClass603_9285) {
				((Class572_Sub27) class572_sub27).aClass603_9285.method7098(150, -1110366939);
				Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -919891387);
				((Class572_Sub27) class572_sub27).aClass603_9285 = null;
			}
			if (((Class572_Sub27) class572_sub27).aClass603_9286 != null) {
				((Class572_Sub27) class572_sub27).aClass603_9286.method7098(150, -1110366939);
				Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9286), -2060910500);
				((Class572_Sub27) class572_sub27).aClass603_9286 = null;
			}
			class572_sub27.method6794((byte) -58);
		}
		if (bool) {
			for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass675_9261.method7932((byte) 50); class572_sub27 != null; class572_sub27 = ((Class572_Sub27) aClass675_9261.method7926(2090066552))) {
				if (((Class572_Sub27) class572_sub27).aClass603_9285 != null) {
					((Class572_Sub27) class572_sub27).aClass603_9285.method7098(150, -1110366939);
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -2147279584);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
				class572_sub27.method6794((byte) -5);
			}
			for (Class572_Sub27 class572_sub27 = (Class572_Sub27) aClass676_9262.method7968((byte) -88); class572_sub27 != null; class572_sub27 = (Class572_Sub27) aClass676_9262.method7969(753375710)) {
				if (null != ((Class572_Sub27) class572_sub27).aClass603_9285) {
					((Class572_Sub27) class572_sub27).aClass603_9285.method7098(150, -1110366939);
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), 930619306);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
				class572_sub27.method6794((byte) -22);
			}
		}
	}

	static boolean method8638(String string, String string_14_, int i) {
		Class13.anInt64 = -89578530;
		Class13.aClass195_96 = client.aClass195_8589;
		return MapSize.method1545(false, false, string, string_14_, -1L);
	}
}

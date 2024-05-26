package game;

/* Class456_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub1_Sub2_Sub1 extends Class456_Sub1_Sub2 implements Interface65 {
	boolean aBool11529;
	boolean aBool11530;
	Class572_Sub12_Sub18 aClass572_Sub12_Sub18_11531;
	Class535 aClass535_11532;
	int anInt11533;
	byte aByte11534;
	byte aByte11535;
	Model aClass89_11536;
	boolean aBool11537;
	boolean aBool11538;
	boolean aBool11539;
	Class639_Sub16 aClass639_Sub16_11540;

	void method8330(Class106 class106) {
		/* empty */
	}

	public Class535 method8306(Class106 class106, byte i) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532)
			((Class456_Sub1_Sub2_Sub1) this).aClass535_11532 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10476(class106, 0, 1003081376), -1249562572);
		return ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532;
	}

	boolean method8301(byte i) {
		if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536)
			return ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1400();
		return false;
	}

	public Class456_Sub1_Sub2_Sub1(Class523 class523, Class106 class106, Class639_Sub16 class639_sub16, ObjectDefinitions class509, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool_10_, boolean bool_11_) {
		super(class523, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, 1 == class509.anInt5660 * -648940047, Class133_Sub14.method9371(i_8_, i_9_, (byte) 1));
		((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540 = class639_sub16;
		((Class456_Sub1_Sub2_Sub1) this).anInt11533 = class509.anInt5607 * 1988696433;
		aByte9008 = (byte) i_0_;
		((Class456_Sub1_Sub2_Sub1) this).aBool11530 = bool;
		((Class456_Sub1_Sub2_Sub1) this).aByte11534 = (byte) i_8_;
		((Class456_Sub1_Sub2_Sub1) this).aByte11535 = (byte) i_9_;
		((Class456_Sub1_Sub2_Sub1) this).aBool11537 = -1262171129 * class509.anInt5627 != 0 && !bool;
		((Class456_Sub1_Sub2_Sub1) this).aBool11538 = bool_10_;
		((Class456_Sub1_Sub2_Sub1) this).aBool11539 = (class106.method1674() && class509.aBool5674 && !((Class456_Sub1_Sub2_Sub1) this).aBool11530 && Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 74) != 0);
		((Class456_Sub1_Sub2_Sub1) this).aBool11529 = bool_11_;
		int i_12_ = 2048;
		if (((Class456_Sub1_Sub2_Sub1) this).aBool11538)
			i_12_ |= 0x10000;
		if (class509.aBool5682)
			i_12_ |= 0x80000;
		Class647 class647 = method10477(class106, i_12_, ((Class456_Sub1_Sub2_Sub1) this).aBool11539, -1508414854);
		if (null != class647) {
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 = (Model) class647.anObject8324;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = (Class572_Sub12_Sub18) class647.anObject8325;
			if (((Class456_Sub1_Sub2_Sub1) this).aBool11538 || class509.aBool5682) {
				((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 = ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1351((byte) 0, i_12_, false);
				if (class509.aBool5682) {
					Class611 class611 = client.aClass613_8605.method7289(1872177864);
					((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1396(class611.anInt7974 * 343771243, -1225020641 * class611.anInt7973, class611.anInt7972 * -1614809839, 2040077645 * class611.anInt7975);
				}
			}
		}
		method8339(1, -215054625);
	}

	Model method10476(Class106 class106, int i, int i_13_) {
		if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 && class106.method1756(((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1353(), i) == 0)
			return ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536;
		Class647 class647 = method10477(class106, i, false, -2058905995);
		if (null != class647)
			return (Model) class647.anObject8324;
		return null;
	}

	Class647 method10477(Class106 class106, int i, boolean bool, int i_14_) {
		ObjectDefinitions class509 = ((ObjectDefinitions) (((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540.getDefinition(((Class456_Sub1_Sub2_Sub1) this).anInt11533 * -1879548561, -1356282071)));
		Class174 class174;
		Class174 class174_15_;
		if (((Class456_Sub1_Sub2_Sub1) this).aBool11530) {
			class174 = aClass523_9010.aClass174Array5840[aByte9008];
			class174_15_ = aClass523_9010.aClass174Array5838[0];
		} else {
			class174 = aClass523_9010.aClass174Array5838[aByte9008];
			if (aByte9008 < 3)
				class174_15_ = aClass523_9010.aClass174Array5838[aByte9008 + 1];
			else
				class174_15_ = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		return (class509.method6057(class106, i, ((1870735441 * Class516.aClass516_5740.anInt5742 != ((Class456_Sub1_Sub2_Sub1) this).aByte11534) ? (int) ((Class456_Sub1_Sub2_Sub1) this).aByte11534 : 1870735441 * Class516.aClass516_5739.anInt5742), ((((Class456_Sub1_Sub2_Sub1) this).aByte11534 == 1870735441 * Class516.aClass516_5740.anInt5742) ? (int) (4 + ((Class456_Sub1_Sub2_Sub1) this).aByte11535) : ((Class456_Sub1_Sub2_Sub1) this).aByte11535), class174, class174_15_, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, bool, null, -272661735));
	}

	public int method8320() {
		return (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null ? ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1382() : 0);
	}

	Class531 method8350(Class106 class106, int i) {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub2_Sub1) this).aBool11537), -2118635939);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540.getDefinition(-1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533, 1844530322))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	public int method10478() {
		return (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 ? (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1378() / 4) : 15);
	}

	boolean method8297(Class106 class106, int i, int i_16_, int i_17_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540.getDefinition(-1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533, -459879622))).aClass326_5684);
		if (class326 != null)
			return class106.method1736(i, i_16_, method5392(), class326, 65280);
		Model model = method10476(class106, 131072, 1056057793);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_16_, class261, false, 0);
		}
		return false;
	}

	boolean method8342() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			return !((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1399();
		return true;
	}

	void method8302(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_18_, int i_19_, boolean bool, int i_20_) {
		if (class456_sub1 instanceof Class456_Sub1_Sub4_Sub1) {
			Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1 = (Class456_Sub1_Sub4_Sub1) class456_sub1;
			if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 && null != (((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1).aClass89_11541))
				((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1402((((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1).aClass89_11541), i, i_18_, i_19_, bool);
		} else if (class456_sub1 instanceof Class456_Sub1_Sub2_Sub1) {
			Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1_21_ = (Class456_Sub1_Sub2_Sub1) class456_sub1;
			if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null && null != ((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1_21_).aClass89_11536)
				((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1402((((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1_21_).aClass89_11536), i, i_18_, i_19_, bool);
		}
	}

	void method8303(int i) {
		((Class456_Sub1_Sub2_Sub1) this).aBool11538 = false;
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1450(((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1353() & ~0x10000);
	}

	public int method8310(byte i) {
		return (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null ? ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1382() : 0);
	}

	public int method304(int i) {
		return ((Class456_Sub1_Sub2_Sub1) this).aByte11534;
	}

	void method8336(Class106 class106, int i) {
		/* empty */
	}

	public void method387(int i) {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1503();
	}

	public boolean method400(int i) {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11529;
	}

	boolean method8314() {
		if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536)
			return ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1400();
		return false;
	}

	public Class535 method8341(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532)
			((Class456_Sub1_Sub2_Sub1) this).aClass535_11532 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10476(class106, 0, 1739992635), -1340327036);
		return ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532;
	}

	public void method390(Class106 class106, byte i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 == null) && ((Class456_Sub1_Sub2_Sub1) this).aBool11539) {
			Class647 class647 = method10477(class106, 262144, true, -1573600166);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (null != class647 ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -1226182210);
	}

	public int method10479(int i) {
		return (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 ? (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1378() / 4) : 15);
	}

	public int method55() {
		return ((Class456_Sub1_Sub2_Sub1) this).aByte11534;
	}

	public void method106() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1503();
	}

	public void method127() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1503();
	}

	public void method128() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1503();
	}

	public void method120() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1503();
	}

	public void method122() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1503();
	}

	public boolean method391() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11539;
	}

	public int method401() {
		return ((Class456_Sub1_Sub2_Sub1) this).aByte11535;
	}

	Class531 method8328(Class106 class106) {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub2_Sub1) this).aBool11537), 815352260);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540.getDefinition(-1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533, 326769925))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	public void method395(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 == null) && ((Class456_Sub1_Sub2_Sub1) this).aBool11539) {
			Class647 class647 = method10477(class106, 262144, true, -1841201640);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (null != class647 ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1447158045);
	}

	void method8343() {
		((Class456_Sub1_Sub2_Sub1) this).aBool11538 = false;
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1450(((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1353() & ~0x10000);
	}

	public int method136(int i) {
		return -1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533;
	}

	boolean method8331() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			return !((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1399();
		return true;
	}

	boolean method8315() {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			return !((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1399();
		return true;
	}

	boolean method8299(int i) {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11538;
	}

	public boolean method388(byte i) {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11539;
	}

	public void method386(Class106 class106, int i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 == null) && ((Class456_Sub1_Sub2_Sub1) this).aBool11539) {
			Class647 class647 = method10477(class106, 262144, true, -2059430604);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 4353232);
	}

	boolean method8319() {
		if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536)
			return ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1400();
		return false;
	}

	public int method8316() {
		return (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null ? ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1382() : 0);
	}

	public int method8322() {
		return (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null ? ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1382() : 0);
	}

	public int method8323() {
		return (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null ? ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1382() : 0);
	}

	boolean method8317() {
		if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536)
			return ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1400();
		return false;
	}

	Class531 method8327(Class106 class106) {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub2_Sub1) this).aBool11537), -1016578503);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540.getDefinition(-1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533, -286529013))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	public int method291() {
		return ((Class456_Sub1_Sub2_Sub1) this).aByte11535;
	}

	void method8313(Class106 class106) {
		/* empty */
	}

	public boolean method394() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11529;
	}

	boolean method8321(Class106 class106, int i, int i_22_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540.getDefinition(-1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533, -2117512256))).aClass326_5684);
		if (class326 != null)
			return class106.method1736(i, i_22_, method5392(), class326, 65280);
		Model model = method10476(class106, 131072, 1706236219);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_22_, class261, false, 0);
		}
		return false;
	}

	boolean method8332() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11538;
	}

	boolean method8333() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11538;
	}

	boolean method8334() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11538;
	}

	boolean method8347() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11538;
	}

	boolean method8349() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11538;
	}

	void method8337(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_23_, int i_24_, boolean bool) {
		if (class456_sub1 instanceof Class456_Sub1_Sub4_Sub1) {
			Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1 = (Class456_Sub1_Sub4_Sub1) class456_sub1;
			if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 && null != (((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1).aClass89_11541))
				((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1402((((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1).aClass89_11541), i, i_23_, i_24_, bool);
		} else if (class456_sub1 instanceof Class456_Sub1_Sub2_Sub1) {
			Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1_25_ = (Class456_Sub1_Sub2_Sub1) class456_sub1;
			if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null && null != ((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1_25_).aClass89_11536)
				((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1402((((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1_25_).aClass89_11536), i, i_23_, i_24_, bool);
		}
	}

	void method8338() {
		((Class456_Sub1_Sub2_Sub1) this).aBool11538 = false;
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1450(((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1353() & ~0x10000);
	}

	boolean method8300(int i) {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			return !((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1399();
		return true;
	}

	void method8304() {
		((Class456_Sub1_Sub2_Sub1) this).aBool11538 = false;
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 != null)
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1450(((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1353() & ~0x10000);
	}

	public void method393(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 == null) && ((Class456_Sub1_Sub2_Sub1) this).aBool11539) {
			Class647 class647 = method10477(class106, 262144, true, -1203850309);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (null != class647 ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1755673453);
	}

	public void method397(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 == null) && ((Class456_Sub1_Sub2_Sub1) this).aBool11539) {
			Class647 class647 = method10477(class106, 262144, true, -1479502621);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -176885058);
	}

	public void method392(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 == null) && ((Class456_Sub1_Sub2_Sub1) this).aBool11539) {
			Class647 class647 = method10477(class106, 262144, true, -1669513481);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 521036281);
	}

	public int method383(int i) {
		return ((Class456_Sub1_Sub2_Sub1) this).aByte11535;
	}

	public Class535 method8305(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532)
			((Class456_Sub1_Sub2_Sub1) this).aClass535_11532 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10476(class106, 0, 1534234674), -945060277);
		return ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532;
	}

	public Class535 method8344(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532)
			((Class456_Sub1_Sub2_Sub1) this).aClass535_11532 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10476(class106, 0, 2018189865), -515843622);
		return ((Class456_Sub1_Sub2_Sub1) this).aClass535_11532;
	}

	public int method398() {
		return -1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533;
	}

	public int method399() {
		return -1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533;
	}

	public int method389() {
		return -1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533;
	}

	public void method396(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 == null) && ((Class456_Sub1_Sub2_Sub1) this).aBool11539) {
			Class647 class647 = method10477(class106, 262144, true, -1930036808);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531;
			((Class456_Sub1_Sub2_Sub1) this).aClass572_Sub12_Sub18_11531 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -90639083);
	}

	public int method292() {
		return ((Class456_Sub1_Sub2_Sub1) this).aByte11535;
	}

	boolean method8329() {
		if (null != ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536)
			return ((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1400();
		return false;
	}

	public boolean method237() {
		return ((Class456_Sub1_Sub2_Sub1) this).aBool11529;
	}

	Class531 method8326(Class106 class106) {
		if (((Class456_Sub1_Sub2_Sub1) this).aClass89_11536 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub2_Sub1) this).aBool11537), -183887800);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub2_Sub1) this).aClass639_Sub16_11540.getDefinition(-1879548561 * ((Class456_Sub1_Sub2_Sub1) this).anInt11533, 1759823641))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub2_Sub1) this).aClass89_11536.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	static final void method10480(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class289_Sub2.method8865(class73, class83, class441, 533208359);
	}

	static final void method10481(Cs2Executor class441, byte i) {
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) == 1);
		if (bool)
			Class133_Sub4.method9340(1, (short) -1769);
		else
			Class133_Sub4.method9340(4, (short) 5013);
	}
}

package game;

/* Class456_Sub1_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub1_Sub1_Sub2 extends Class456_Sub1_Sub1 implements Interface65 {
	Model aClass89_11559;
	boolean aBool11560;
	byte aByte11561;
	Class535 aClass535_11562;
	Class572_Sub12_Sub18 aClass572_Sub12_Sub18_11563;
	int anInt11564;
	Class639_Sub16 aClass639_Sub16_11565;
	boolean aBool11566;
	boolean aBool11567;
	boolean aBool11568;

	boolean method8329() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1400();
		return false;
	}

	boolean method8300(int i) {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return !((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1399();
		return true;
	}

	boolean method8301(byte i) {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1400();
		return false;
	}

	Model method10489(Class106 class106, int i, int i_0_) {
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null && class106.method1756(((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1353(), i) == 0)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559;
		Class647 class647 = method10490(class106, i, false, 62698464);
		if (class647 != null)
			return (Model) class647.anObject8324;
		return null;
	}

	Class647 method10490(Class106 class106, int i, boolean bool, int i_1_) {
		ObjectDefinitions class509 = ((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, 1832864758)));
		Class174 class174;
		Class174 class174_2_;
		if (((Class456_Sub1_Sub1_Sub2) this).aBool11560) {
			class174 = aClass523_9010.aClass174Array5840[aByte9008];
			class174_2_ = aClass523_9010.aClass174Array5838[0];
		} else {
			class174 = aClass523_9010.aClass174Array5838[aByte9008];
			if (aByte9008 < 3)
				class174_2_ = aClass523_9010.aClass174Array5838[aByte9008 + 1];
			else
				class174_2_ = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		return class509.method6057(class106, i, (Class516.aClass516_5741.anInt5742 * 1870735441), ((Class456_Sub1_Sub1_Sub2) this).aByte11561, class174, class174_2_, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, bool, null, -272661735);
	}

	public Class535 method8344(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 == null)
			((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10489(class106, 0, 593987895), -1498682135);
		return ((Class456_Sub1_Sub1_Sub2) this).aClass535_11562;
	}

	Class531 method8350(Class106 class106, int i) {
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub1_Sub2) this).aBool11566), -1760039744);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, 1314672283))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	Class647 method10491(Class106 class106, int i, boolean bool) {
		ObjectDefinitions class509 = ((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, -146762182)));
		Class174 class174;
		Class174 class174_3_;
		if (((Class456_Sub1_Sub1_Sub2) this).aBool11560) {
			class174 = aClass523_9010.aClass174Array5840[aByte9008];
			class174_3_ = aClass523_9010.aClass174Array5838[0];
		} else {
			class174 = aClass523_9010.aClass174Array5838[aByte9008];
			if (aByte9008 < 3)
				class174_3_ = aClass523_9010.aClass174Array5838[aByte9008 + 1];
			else
				class174_3_ = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		return class509.method6057(class106, i, (Class516.aClass516_5741.anInt5742 * 1870735441), ((Class456_Sub1_Sub1_Sub2) this).aByte11561, class174, class174_3_, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, bool, null, -272661735);
	}

	void method8337(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_4_, int i_5_, boolean bool) {
		if (class456_sub1 instanceof Class456_Sub1_Sub1_Sub2) {
			Class456_Sub1_Sub1_Sub2 class456_sub1_sub1_sub2_6_ = (Class456_Sub1_Sub1_Sub2) class456_sub1;
			if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 && null != ((Class456_Sub1_Sub1_Sub2) class456_sub1_sub1_sub2_6_).aClass89_11559)
				((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1402((((Class456_Sub1_Sub1_Sub2) class456_sub1_sub1_sub2_6_).aClass89_11559), i, i_4_, i_5_, bool);
		}
	}

	void method8343() {
		((Class456_Sub1_Sub1_Sub2) this).aBool11567 = false;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1450(((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1353() & ~0x10000);
	}

	void method8302(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_7_, int i_8_, boolean bool, int i_9_) {
		if (class456_sub1 instanceof Class456_Sub1_Sub1_Sub2) {
			Class456_Sub1_Sub1_Sub2 class456_sub1_sub1_sub2_10_ = (Class456_Sub1_Sub1_Sub2) class456_sub1;
			if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 && null != ((Class456_Sub1_Sub1_Sub2) class456_sub1_sub1_sub2_10_).aClass89_11559)
				((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1402((((Class456_Sub1_Sub1_Sub2) class456_sub1_sub1_sub2_10_).aClass89_11559), i, i_7_, i_8_, bool);
		}
	}

	public int method291() {
		return ((Class456_Sub1_Sub1_Sub2) this).aByte11561;
	}

	public int method136(int i) {
		return -1161044643 * ((Class456_Sub1_Sub1_Sub2) this).anInt11564;
	}

	public int method383(int i) {
		return ((Class456_Sub1_Sub1_Sub2) this).aByte11561;
	}

	public int method8320() {
		return (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null ? ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1382() : 0);
	}

	public boolean method400(int i) {
		return true;
	}

	public boolean method388(byte i) {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11568;
	}

	public void method386(Class106 class106, int i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563) && ((Class456_Sub1_Sub1_Sub2) this).aBool11568) {
			Class647 class647 = method10490(class106, 262144, true, 62698464);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1786380869);
	}

	public void method390(Class106 class106, byte i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563) && ((Class456_Sub1_Sub1_Sub2) this).aBool11568) {
			Class647 class647 = method10490(class106, 262144, true, 62698464);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (null != class572_sub12_sub18)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -690691816);
	}

	Model method10492(Class106 class106, int i) {
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null && class106.method1756(((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1353(), i) == 0)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559;
		Class647 class647 = method10490(class106, i, false, 62698464);
		if (class647 != null)
			return (Model) class647.anObject8324;
		return null;
	}

	public void method106() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1503();
	}

	void method8336(Class106 class106, int i) {
		/* empty */
	}

	public void method128() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1503();
	}

	public void method120() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1503();
	}

	public void method122() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1503();
	}

	public void method127() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1503();
	}

	public boolean method237() {
		return true;
	}

	public boolean method394() {
		return true;
	}

	public void method395(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563) && ((Class456_Sub1_Sub1_Sub2) this).aBool11568) {
			Class647 class647 = method10490(class106, 262144, true, 62698464);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (null != class572_sub12_sub18)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -812470121);
	}

	public void method393(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563) && ((Class456_Sub1_Sub1_Sub2) this).aBool11568) {
			Class647 class647 = method10490(class106, 262144, true, 62698464);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (null != class572_sub12_sub18)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 372766808);
	}

	public int method55() {
		return 1870735441 * Class516.aClass516_5741.anInt5742;
	}

	boolean method8314() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1400();
		return false;
	}

	boolean method8315() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return !((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1399();
		return true;
	}

	boolean method8297(Class106 class106, int i, int i_11_, int i_12_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, 1464121441))).aClass326_5684);
		if (class326 != null)
			return class106.method1736(i, i_11_, method5392(), class326, 65280);
		Model model = method10489(class106, 131072, 593987895);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_11_, class261, false, 0);
		}
		return false;
	}

	boolean method8317() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1400();
		return false;
	}

	public void method387(int i) {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1503();
	}

	boolean method8319() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1400();
		return false;
	}

	boolean method8342() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return !((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1399();
		return true;
	}

	public int method8316() {
		return (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null ? ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1382() : 0);
	}

	public int method8322() {
		return (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null ? ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1382() : 0);
	}

	public int method8323() {
		return (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null ? ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1382() : 0);
	}

	Class531 method8326(Class106 class106) {
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub1_Sub2) this).aBool11566), 407281747);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, -1713532563))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	Class531 method8327(Class106 class106) {
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub1_Sub2) this).aBool11566), -1099176274);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, 1445489777))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	Class531 method8328(Class106 class106) {
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 == null)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub1_Sub2) this).aBool11566), -1490835082);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, -1901388344))).aClass326_5684);
		if (null != class326) {
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	void method8313(Class106 class106) {
		/* empty */
	}

	void method8330(Class106 class106) {
		/* empty */
	}

	public int method399() {
		return -1161044643 * ((Class456_Sub1_Sub1_Sub2) this).anInt11564;
	}

	boolean method8332() {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11567;
	}

	boolean method8333() {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11567;
	}

	void method8338() {
		((Class456_Sub1_Sub1_Sub2) this).aBool11567 = false;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1450(((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1353() & ~0x10000);
	}

	boolean method8347() {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11567;
	}

	boolean method8349() {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11567;
	}

	public int method304(int i) {
		return 1870735441 * Class516.aClass516_5741.anInt5742;
	}

	public Class456_Sub1_Sub1_Sub2(Class523 class523, Class106 class106, Class639_Sub16 class639_sub16, ObjectDefinitions class509, int i, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, int i_17_, boolean bool_18_) {
		super(class523, i_14_, i_15_, i_16_, i, i_13_, 1268838619 * class509.anInt5661);
		((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565 = class639_sub16;
		((Class456_Sub1_Sub1_Sub2) this).anInt11564 = class509.anInt5607 * 1674623499;
		((Class456_Sub1_Sub1_Sub2) this).aBool11560 = bool;
		((Class456_Sub1_Sub1_Sub2) this).aByte11561 = (byte) i_17_;
		((Class456_Sub1_Sub1_Sub2) this).aBool11566 = 0 != -1262171129 * class509.anInt5627 && !bool;
		((Class456_Sub1_Sub1_Sub2) this).aBool11567 = bool_18_;
		((Class456_Sub1_Sub1_Sub2) this).aBool11568 = (class106.method1674() && class509.aBool5674 && !((Class456_Sub1_Sub1_Sub2) this).aBool11560 && Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 18) != 0);
		int i_19_ = 2048;
		if (((Class456_Sub1_Sub1_Sub2) this).aBool11567)
			i_19_ |= 0x10000;
		if (class509.aBool5682)
			i_19_ |= 0x80000;
		Class647 class647 = method10490(class106, i_19_, ((Class456_Sub1_Sub1_Sub2) this).aBool11568, 62698464);
		if (null != class647) {
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 = (Model) class647.anObject8324;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = (Class572_Sub12_Sub18) class647.anObject8325;
			if (((Class456_Sub1_Sub1_Sub2) this).aBool11567 || class509.aBool5682) {
				((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 = ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1351((byte) 0, i_19_, false);
				if (class509.aBool5682) {
					Class611 class611 = client.aClass613_8605.method7289(1872177864);
					((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1396(class611.anInt7974 * 343771243, class611.anInt7973 * -1225020641, class611.anInt7972 * -1614809839, 2040077645 * class611.anInt7975);
				}
			}
		}
		method8339(1, -152195113);
	}

	public int method8310(byte i) {
		return (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null ? ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1382() : 0);
	}

	void method8304() {
		((Class456_Sub1_Sub1_Sub2) this).aBool11567 = false;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1450(((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1353() & ~0x10000);
	}

	public void method396(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563) && ((Class456_Sub1_Sub1_Sub2) this).aBool11568) {
			Class647 class647 = method10490(class106, 262144, true, 62698464);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1004489532);
	}

	public void method397(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563) && ((Class456_Sub1_Sub1_Sub2) this).aBool11568) {
			Class647 class647 = method10490(class106, 262144, true, 62698464);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -230264490);
	}

	public void method392(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563) && ((Class456_Sub1_Sub1_Sub2) this).aBool11568) {
			Class647 class647 = method10490(class106, 262144, true, 62698464);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563;
			((Class456_Sub1_Sub1_Sub2) this).aClass572_Sub12_Sub18_11563 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -491090470);
	}

	boolean method8321(Class106 class106, int i, int i_20_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub1_Sub2) this).aClass639_Sub16_11565.getDefinition(((Class456_Sub1_Sub1_Sub2) this).anInt11564 * -1161044643, 294717432))).aClass326_5684);
		if (class326 != null)
			return class106.method1736(i, i_20_, method5392(), class326, 65280);
		Model model = method10489(class106, 131072, 593987895);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_20_, class261, false, 0);
		}
		return false;
	}

	public Class535 method8305(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 == null)
			((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10489(class106, 0, 593987895), -2033612409);
		return ((Class456_Sub1_Sub1_Sub2) this).aClass535_11562;
	}

	void method8303(int i) {
		((Class456_Sub1_Sub1_Sub2) this).aBool11567 = false;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null)
			((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1450(((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1353() & ~0x10000);
	}

	public int method398() {
		return -1161044643 * ((Class456_Sub1_Sub1_Sub2) this).anInt11564;
	}

	boolean method8331() {
		if (null != ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559)
			return !((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1399();
		return true;
	}

	public int method389() {
		return -1161044643 * ((Class456_Sub1_Sub1_Sub2) this).anInt11564;
	}

	public int method401() {
		return ((Class456_Sub1_Sub1_Sub2) this).aByte11561;
	}

	public int method292() {
		return ((Class456_Sub1_Sub1_Sub2) this).aByte11561;
	}

	boolean method8299(int i) {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11567;
	}

	public Class535 method8341(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 == null)
			((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10489(class106, 0, 593987895), -669147059);
		return ((Class456_Sub1_Sub1_Sub2) this).aClass535_11562;
	}

	public boolean method391() {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11568;
	}

	Model method10493(Class106 class106, int i) {
		if (((Class456_Sub1_Sub1_Sub2) this).aClass89_11559 != null && class106.method1756(((Class456_Sub1_Sub1_Sub2) this).aClass89_11559.method1353(), i) == 0)
			return ((Class456_Sub1_Sub1_Sub2) this).aClass89_11559;
		Class647 class647 = method10490(class106, i, false, 62698464);
		if (class647 != null)
			return (Model) class647.anObject8324;
		return null;
	}

	public Class535 method8306(Class106 class106, byte i) {
		Class240 class240 = method5394().aClass240_2647;
		if (((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 == null)
			((Class456_Sub1_Sub1_Sub2) this).aClass535_11562 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10489(class106, 0, 593987895), -1665193717);
		return ((Class456_Sub1_Sub1_Sub2) this).aClass535_11562;
	}

	boolean method8334() {
		return ((Class456_Sub1_Sub1_Sub2) this).aBool11567;
	}

	static final void method10494(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 2112639107 * Class633.aClass641_8197.id;
	}
}

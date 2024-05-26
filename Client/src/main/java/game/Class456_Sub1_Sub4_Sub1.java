package game;

/* Class456_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub1_Sub4_Sub1 extends Class456_Sub1_Sub4 implements Interface65 {
	Model aClass89_11541;
	byte aByte11542;
	Class639_Sub16 aClass639_Sub16_11543;
	static int[] anIntArray11544 = { 1, 2, 4, 8 };
	Class572_Sub12_Sub18 aClass572_Sub12_Sub18_11545;
	Class535 aClass535_11546;
	int anInt11547;
	static int[] anIntArray11548 = { 16, 32, 64, 128 };
	byte aByte11549;
	boolean aBool11550;
	boolean aBool11551;
	boolean aBool11552;
	boolean aBool11553;

	void method8338() {
		((Class456_Sub1_Sub4_Sub1) this).aBool11550 = false;
		if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1450(((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1353() & ~0x10000);
	}

	boolean method8300(int i) {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return !((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1399();
		return true;
	}

	public boolean method394() {
		return true;
	}

	public int method8310(byte i) {
		return (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null ? ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1382() : 0);
	}

	Model method10482(Class106 class106, int i, byte i_0_) {
		if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null && class106.method1756(((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1353(), i) == 0)
			return ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541;
		Class647 class647 = method10484(class106, i, false, 1436419754);
		if (null != class647)
			return (Model) class647.anObject8324;
		return null;
	}

	boolean method8333() {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11550;
	}

	public Class535 method8306(Class106 class106, byte i) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546)
			((Class456_Sub1_Sub4_Sub1) this).aClass535_11546 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10482(class106, 0, (byte) 95), -248176339);
		return ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546;
	}

	boolean method8301(byte i) {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1400();
		return false;
	}

	Class531 method8350(Class106 class106, int i) {
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub4_Sub1) this).aBool11551), -1355092456);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, -1534240484))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	boolean method8321(Class106 class106, int i, int i_1_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, -1499132107))).aClass326_5684);
		if (null != class326)
			return class106.method1736(i, i_1_, method5392(), class326, 65280);
		Model model = method10482(class106, 131072, (byte) 86);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_1_, class261, false, 0);
		}
		return false;
	}

	boolean method8299(int i) {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11550;
	}

	void method8302(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_2_, int i_3_, boolean bool, int i_4_) {
		if (class456_sub1 instanceof Class456_Sub1_Sub4_Sub1) {
			Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1_5_ = (Class456_Sub1_Sub4_Sub1) class456_sub1;
			if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null && null != ((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1_5_).aClass89_11541)
				((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1402((((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1_5_).aClass89_11541), i, i_2_, i_3_, bool);
		} else if (class456_sub1 instanceof Class456_Sub1_Sub2_Sub1) {
			Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1 = (Class456_Sub1_Sub2_Sub1) class456_sub1;
			if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null && (((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1).aClass89_11536) != null)
				((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1402((((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1).aClass89_11536), i, i_2_, i_3_, bool);
		}
	}

	void method8303(int i) {
		((Class456_Sub1_Sub4_Sub1) this).aBool11550 = false;
		if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1450(((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1353() & ~0x10000);
	}

	public int method136(int i) {
		return ((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765;
	}

	static int method10483(int i, int i_6_) {
		if (i == Class516.aClass516_5738.anInt5742 * 1870735441 || Class516.aClass516_5728.anInt5742 * 1870735441 == i)
			return anIntArray11548[i_6_ & 0x3];
		return anIntArray11544[i_6_ & 0x3];
	}

	public int method383(int i) {
		return ((Class456_Sub1_Sub4_Sub1) this).aByte11542;
	}

	boolean method8329() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1400();
		return false;
	}

	public boolean method400(int i) {
		return true;
	}

	public boolean method388(byte i) {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11553;
	}

	public void method386(Class106 class106, int i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 == null) && ((Class456_Sub1_Sub4_Sub1) this).aBool11553) {
			Class647 class647 = method10484(class106, 262144, true, 1232597065);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -24572132);
	}

	public void method390(Class106 class106, byte i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 == null) && ((Class456_Sub1_Sub4_Sub1) this).aBool11553) {
			Class647 class647 = method10484(class106, 262144, true, 584114126);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (null != class647 ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1012488496);
	}

	public int method55() {
		return ((Class456_Sub1_Sub4_Sub1) this).aByte11549;
	}

	public void method106() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1503();
	}

	public void method127() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1503();
	}

	Class647 method10484(Class106 class106, int i, boolean bool, int i_7_) {
		ObjectDefinitions class509 = ((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, 931502825)));
		Class174 class174;
		Class174 class174_8_;
		if (((Class456_Sub1_Sub4_Sub1) this).aBool11552) {
			class174 = aClass523_9010.aClass174Array5840[aByte9008];
			class174_8_ = aClass523_9010.aClass174Array5838[0];
		} else {
			class174 = aClass523_9010.aClass174Array5838[aByte9008];
			if (aByte9008 < 3)
				class174_8_ = aClass523_9010.aClass174Array5838[aByte9008 + 1];
			else
				class174_8_ = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		return class509.method6057(class106, i, ((Class456_Sub1_Sub4_Sub1) this).aByte11549, ((Class456_Sub1_Sub4_Sub1) this).aByte11542, class174, class174_8_, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, bool, null, -272661735);
	}

	public void method120() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1503();
	}

	public void method122() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1503();
	}

	public boolean method391() {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11553;
	}

	public boolean method237() {
		return true;
	}

	public void method128() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1503();
	}

	public int method8322() {
		return (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null ? ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1382() : 0);
	}

	Class647 method10485(Class106 class106, int i, boolean bool) {
		ObjectDefinitions class509 = ((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, -2105765507)));
		Class174 class174;
		Class174 class174_9_;
		if (((Class456_Sub1_Sub4_Sub1) this).aBool11552) {
			class174 = aClass523_9010.aClass174Array5840[aByte9008];
			class174_9_ = aClass523_9010.aClass174Array5838[0];
		} else {
			class174 = aClass523_9010.aClass174Array5838[aByte9008];
			if (aByte9008 < 3)
				class174_9_ = aClass523_9010.aClass174Array5838[aByte9008 + 1];
			else
				class174_9_ = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		return class509.method6057(class106, i, ((Class456_Sub1_Sub4_Sub1) this).aByte11549, ((Class456_Sub1_Sub4_Sub1) this).aByte11542, class174, class174_9_, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, bool, null, -272661735);
	}

	boolean method8342() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return !((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1399();
		return true;
	}

	boolean method8331() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return !((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1399();
		return true;
	}

	public Class535 method8344(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546)
			((Class456_Sub1_Sub4_Sub1) this).aClass535_11546 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10482(class106, 0, (byte) 100), -1547569604);
		return ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546;
	}

	boolean method8314() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1400();
		return false;
	}

	boolean method8317() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1400();
		return false;
	}

	public void method392(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 == null) && ((Class456_Sub1_Sub4_Sub1) this).aBool11553) {
			Class647 class647 = method10484(class106, 262144, true, -457947715);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 227560133);
	}

	boolean method8319() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1400();
		return false;
	}

	public int method8320() {
		return (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null ? ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1382() : 0);
	}

	void method8313(Class106 class106) {
		/* empty */
	}

	void method8336(Class106 class106, int i) {
		/* empty */
	}

	public int method8323() {
		return (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null ? ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1382() : 0);
	}

	Class531 method8326(Class106 class106) {
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub4_Sub1) this).aBool11551), 330204894);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, 1364996684))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	Class531 method8327(Class106 class106) {
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub4_Sub1) this).aBool11551), 785591097);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, -205715744))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	Class531 method8328(Class106 class106) {
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return null;
		Class261 class261 = method5392();
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub4_Sub1) this).aBool11551), 496406168);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, 1667820393))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	public int method389() {
		return ((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765;
	}

	void method8330(Class106 class106) {
		/* empty */
	}

	boolean method8315() {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			return !((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1399();
		return true;
	}

	boolean method8332() {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11550;
	}

	public int method304(int i) {
		return ((Class456_Sub1_Sub4_Sub1) this).aByte11549;
	}

	boolean method8334() {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11550;
	}

	boolean method8347() {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11550;
	}

	boolean method8349() {
		return ((Class456_Sub1_Sub4_Sub1) this).aBool11550;
	}

	void method8337(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_10_, int i_11_, boolean bool) {
		if (class456_sub1 instanceof Class456_Sub1_Sub4_Sub1) {
			Class456_Sub1_Sub4_Sub1 class456_sub1_sub4_sub1_12_ = (Class456_Sub1_Sub4_Sub1) class456_sub1;
			if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null && null != ((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1_12_).aClass89_11541)
				((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1402((((Class456_Sub1_Sub4_Sub1) class456_sub1_sub4_sub1_12_).aClass89_11541), i, i_10_, i_11_, bool);
		} else if (class456_sub1 instanceof Class456_Sub1_Sub2_Sub1) {
			Class456_Sub1_Sub2_Sub1 class456_sub1_sub2_sub1 = (Class456_Sub1_Sub2_Sub1) class456_sub1;
			if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null && (((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1).aClass89_11536) != null)
				((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1402((((Class456_Sub1_Sub2_Sub1) class456_sub1_sub2_sub1).aClass89_11536), i, i_10_, i_11_, bool);
		}
	}

	public Class535 method8305(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546)
			((Class456_Sub1_Sub4_Sub1) this).aClass535_11546 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10482(class106, 0, (byte) 86), -1112938742);
		return ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546;
	}

	void method8343() {
		((Class456_Sub1_Sub4_Sub1) this).aBool11550 = false;
		if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1450(((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1353() & ~0x10000);
	}

	void method8304() {
		((Class456_Sub1_Sub4_Sub1) this).aBool11550 = false;
		if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1450(((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1353() & ~0x10000);
	}

	public void method396(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 == null) && ((Class456_Sub1_Sub4_Sub1) this).aBool11553) {
			Class647 class647 = method10484(class106, 262144, true, -1344012215);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1672008270);
	}

	public void method397(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 == null) && ((Class456_Sub1_Sub4_Sub1) this).aBool11553) {
			Class647 class647 = method10484(class106, 262144, true, -1704658552);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 2108546734);
	}

	boolean method8297(Class106 class106, int i, int i_13_, int i_14_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543.getDefinition(((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765, 196639338))).aClass326_5684);
		if (null != class326)
			return class106.method1736(i, i_13_, method5392(), class326, 65280);
		Model model = method10482(class106, 131072, (byte) 15);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_13_, class261, false, 0);
		}
		return false;
	}

	public Class535 method8341(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546)
			((Class456_Sub1_Sub4_Sub1) this).aClass535_11546 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10482(class106, 0, (byte) 28), -1117371479);
		return ((Class456_Sub1_Sub4_Sub1) this).aClass535_11546;
	}

	public void method393(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 == null) && ((Class456_Sub1_Sub4_Sub1) this).aBool11553) {
			Class647 class647 = method10484(class106, 262144, true, -1042451672);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (null != class647 ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -1666761893);
	}

	public int method8316() {
		return (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null ? ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1382() : 0);
	}

	public int method398() {
		return ((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765;
	}

	public int method399() {
		return ((Class456_Sub1_Sub4_Sub1) this).anInt11547 * 1600493765;
	}

	public void method387(int i) {
		if (null != ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541)
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1503();
	}

	public int method401() {
		return ((Class456_Sub1_Sub4_Sub1) this).aByte11542;
	}

	public int method292() {
		return ((Class456_Sub1_Sub4_Sub1) this).aByte11542;
	}

	public int method291() {
		return ((Class456_Sub1_Sub4_Sub1) this).aByte11542;
	}

	public void method395(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 == null) && ((Class456_Sub1_Sub4_Sub1) this).aBool11553) {
			Class647 class647 = method10484(class106, 262144, true, 1647969533);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (null != class647 ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -1053838585);
	}

	Model method10486(Class106 class106, int i) {
		if (((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 != null && class106.method1756(((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1353(), i) == 0)
			return ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541;
		Class647 class647 = method10484(class106, i, false, 372756383);
		if (null != class647)
			return (Model) class647.anObject8324;
		return null;
	}

	public Class456_Sub1_Sub4_Sub1(Class523 class523, Class106 class106, Class639_Sub16 class639_sub16, ObjectDefinitions class509, int i, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, int i_19_, int i_20_, boolean bool_21_) {
		super(class523, i_16_, i_17_, i_18_, i, i_15_, Class133_Sub10.method9352(i_19_, i_20_, -1183717346));
		((Class456_Sub1_Sub4_Sub1) this).aClass639_Sub16_11543 = class639_sub16;
		((Class456_Sub1_Sub4_Sub1) this).anInt11547 = 570747635 * class509.anInt5607;
		((Class456_Sub1_Sub4_Sub1) this).aBool11552 = bool;
		((Class456_Sub1_Sub4_Sub1) this).aByte11549 = (byte) i_19_;
		((Class456_Sub1_Sub4_Sub1) this).aByte11542 = (byte) i_20_;
		((Class456_Sub1_Sub4_Sub1) this).aBool11551 = 0 != class509.anInt5627 * -1262171129 && !bool;
		((Class456_Sub1_Sub4_Sub1) this).aBool11550 = bool_21_;
		((Class456_Sub1_Sub4_Sub1) this).aBool11553 = (class106.method1674() && class509.aBool5674 && !((Class456_Sub1_Sub4_Sub1) this).aBool11552 && Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 45) != 0);
		int i_22_ = 2048;
		if (((Class456_Sub1_Sub4_Sub1) this).aBool11550)
			i_22_ |= 0x10000;
		if (class509.aBool5682)
			i_22_ |= 0x80000;
		Class647 class647 = method10484(class106, i_22_, ((Class456_Sub1_Sub4_Sub1) this).aBool11553, 308956507);
		if (class647 != null) {
			((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 = (Model) class647.anObject8324;
			((Class456_Sub1_Sub4_Sub1) this).aClass572_Sub12_Sub18_11545 = (Class572_Sub12_Sub18) class647.anObject8325;
			if (((Class456_Sub1_Sub4_Sub1) this).aBool11550 || class509.aBool5682) {
				((Class456_Sub1_Sub4_Sub1) this).aClass89_11541 = ((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1351((byte) 0, i_22_, false);
				if (class509.aBool5682) {
					Class611 class611 = client.aClass613_8605.method7289(1872177864);
					((Class456_Sub1_Sub4_Sub1) this).aClass89_11541.method1396(class611.anInt7974 * 343771243, class611.anInt7973 * -1225020641, class611.anInt7972 * -1614809839, class611.anInt7975 * 2040077645);
				}
			}
		}
		method8339(1, -1968666567);
	}
}

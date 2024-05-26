package game;

/* Class456_Sub1_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456_Sub1_Sub3_Sub1 extends Class456_Sub1_Sub3 implements Interface65 {
	byte aByte11575;
	Model aClass89_11576;
	Class572_Sub12_Sub18 aClass572_Sub12_Sub18_11577;
	Class535 aClass535_11578;
	byte aByte11579;
	Class639_Sub16 aClass639_Sub16_11580;
	int anInt11581;
	boolean aBool11582;
	boolean aBool11583;
	boolean aBool11584;

	public void method106() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1503();
	}

	void method8313(Class106 class106) {
		/* empty */
	}

	public void method393(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 == null) && ((Class456_Sub1_Sub3_Sub1) this).aBool11584) {
			Class647 class647 = method10501(class106, 262144, true, (short) 30593);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 357273964);
	}

	public Class456_Sub1_Sub3_Sub1(Class523 class523, Class106 class106, Class639_Sub16 class639_sub16, ObjectDefinitions class509, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, int i_6_, int i_7_) {
		super(class523, i_1_, i_2_, i_3_, i, i_0_, i_4_, i_5_);
		((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580 = class639_sub16;
		((Class456_Sub1_Sub3_Sub1) this).anInt11581 = 1806512879 * class509.anInt5607;
		((Class456_Sub1_Sub3_Sub1) this).aBool11582 = bool;
		((Class456_Sub1_Sub3_Sub1) this).aByte11575 = (byte) i_7_;
		((Class456_Sub1_Sub3_Sub1) this).aByte11579 = (byte) i_6_;
		((Class456_Sub1_Sub3_Sub1) this).aBool11583 = 0 != class509.anInt5627 * -1262171129 && !bool;
		((Class456_Sub1_Sub3_Sub1) this).aBool11584 = (class106.method1674() && class509.aBool5674 && !((Class456_Sub1_Sub3_Sub1) this).aBool11582 && Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 58) != 0);
		int i_8_ = 2048;
		if (class509.aBool5682)
			i_8_ |= 0x80000;
		Class647 class647 = method10501(class106, i_8_, ((Class456_Sub1_Sub3_Sub1) this).aBool11584, (short) 2490);
		if (null != class647) {
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 = (Model) class647.anObject8324;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = (Class572_Sub12_Sub18) class647.anObject8325;
			if (class509.aBool5682) {
				((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 = ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1351((byte) 0, i_8_, false);
				if (class509.aBool5682) {
					Class611 class611 = client.aClass613_8605.method7289(1872177864);
					((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1396(343771243 * class611.anInt7974, -1225020641 * class611.anInt7973, -1614809839 * class611.anInt7972, 2040077645 * class611.anInt7975);
				}
			}
		}
		method8339(1, 109152673);
	}

	Model method10500(Class106 class106, int i, short i_9_) {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null && class106.method1756(((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1353(), i) == 0)
			return ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576;
		Class647 class647 = method10501(class106, i, false, (short) 1449);
		if (class647 != null)
			return (Model) class647.anObject8324;
		return null;
	}

	public void method390(Class106 class106, byte i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 == null) && ((Class456_Sub1_Sub3_Sub1) this).aBool11584) {
			Class647 class647 = method10501(class106, 262144, true, (short) 11457);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 858978969);
	}

	public Class535 method8306(Class106 class106, byte i) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578)
			((Class456_Sub1_Sub3_Sub1) this).aClass535_11578 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10500(class106, 0, (short) 255), -782795559);
		return ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578;
	}

	public int method291() {
		return ((Class456_Sub1_Sub3_Sub1) this).aByte11575;
	}

	void method8336(Class106 class106, int i) {
		/* empty */
	}

	Class531 method8350(Class106 class106, int i) {
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return null;
		Class261 class261 = class106.method1753();
		class261.method3568(method5392());
		class261.method3580((float) aShort11507, 0.0F, (float) aShort11506);
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub3_Sub1) this).aBool11583), -1485658590);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580.getDefinition(((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031, -1640563301))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	public int method136(int i) {
		return ((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031;
	}

	Class647 method10501(Class106 class106, int i, boolean bool, short i_10_) {
		ObjectDefinitions class509 = ((ObjectDefinitions) (((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580.getDefinition(-1886454031 * ((Class456_Sub1_Sub3_Sub1) this).anInt11581, 454388567)));
		Class174 class174;
		Class174 class174_11_;
		if (((Class456_Sub1_Sub3_Sub1) this).aBool11582) {
			class174 = aClass523_9010.aClass174Array5840[aByte9008];
			class174_11_ = aClass523_9010.aClass174Array5838[0];
		} else {
			class174 = aClass523_9010.aClass174Array5838[aByte9008];
			if (aByte9008 < 3)
				class174_11_ = aClass523_9010.aClass174Array5838[aByte9008 + 1];
			else
				class174_11_ = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		return class509.method6057(class106, i, ((Class456_Sub1_Sub3_Sub1) this).aByte11579, ((Class456_Sub1_Sub3_Sub1) this).aByte11575, class174, class174_11_, (int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, bool, null, -272661735);
	}

	public int method383(int i) {
		return ((Class456_Sub1_Sub3_Sub1) this).aByte11575;
	}

	public int method398() {
		return ((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031;
	}

	public void method387(int i) {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1503();
	}

	public boolean method388(byte i) {
		return ((Class456_Sub1_Sub3_Sub1) this).aBool11584;
	}

	public void method386(Class106 class106, int i) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577) && ((Class456_Sub1_Sub3_Sub1) this).aBool11584) {
			Class647 class647 = method10501(class106, 262144, true, (short) 2134);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (null != class572_sub12_sub18)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1287930310);
	}

	public void method127() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1503();
	}

	public int method55() {
		return ((Class456_Sub1_Sub3_Sub1) this).aByte11579;
	}

	public void method395(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 == null) && ((Class456_Sub1_Sub3_Sub1) this).aBool11584) {
			Class647 class647 = method10501(class106, 262144, true, (short) 5221);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (class572_sub12_sub18 != null)
			aClass523_9010.method6270(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -1535635540);
	}

	public void method396(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577) && ((Class456_Sub1_Sub3_Sub1) this).aBool11584) {
			Class647 class647 = method10501(class106, 262144, true, (short) 21625);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (null != class572_sub12_sub18)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -329722309);
	}

	public int method8310(byte i) {
		return (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 ? ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1382() : 0);
	}

	public Class535 method8341(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578)
			((Class456_Sub1_Sub3_Sub1) this).aClass535_11578 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10500(class106, 0, (short) 255), -731557882);
		return ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578;
	}

	public void method122() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1503();
	}

	public int method401() {
		return ((Class456_Sub1_Sub3_Sub1) this).aByte11575;
	}

	public boolean method237() {
		return true;
	}

	public boolean method394() {
		return true;
	}

	public boolean method400(int i) {
		return true;
	}

	public int method304(int i) {
		return ((Class456_Sub1_Sub3_Sub1) this).aByte11579;
	}

	boolean method8342() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			return !((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1399();
		return true;
	}

	boolean method8331() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			return !((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1399();
		return true;
	}

	boolean method8315() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			return !((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1399();
		return true;
	}

	public void method120() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1503();
	}

	boolean method8317() {
		if (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1400();
		return false;
	}

	boolean method8329() {
		if (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1400();
		return false;
	}

	public boolean method391() {
		return ((Class456_Sub1_Sub3_Sub1) this).aBool11584;
	}

	public int method8320() {
		return (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 ? ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1382() : 0);
	}

	public int method8316() {
		return (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 ? ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1382() : 0);
	}

	public int method8322() {
		return (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 ? ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1382() : 0);
	}

	public int method8323() {
		return (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 ? ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1382() : 0);
	}

	Class531 method8326(Class106 class106) {
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return null;
		Class261 class261 = class106.method1753();
		class261.method3568(method5392());
		class261.method3580((float) aShort11507, 0.0F, (float) aShort11506);
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub3_Sub1) this).aBool11583), -1699613418);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580.getDefinition(((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031, -991743212))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	Class531 method8327(Class106 class106) {
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return null;
		Class261 class261 = class106.method1753();
		class261.method3568(method5392());
		class261.method3580((float) aShort11507, 0.0F, (float) aShort11506);
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub3_Sub1) this).aBool11583), 241845529);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580.getDefinition(((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031, 617495409))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	Class531 method8328(Class106 class106) {
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return null;
		Class261 class261 = class106.method1753();
		class261.method3568(method5392());
		class261.method3580((float) aShort11507, 0.0F, (float) aShort11506);
		Class531 class531 = Class572_Sub16_Sub9.method10262((((Class456_Sub1_Sub3_Sub1) this).aBool11583), 406873792);
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580.getDefinition(((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031, 1106257887))).aClass326_5684);
		if (class326 != null) {
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, null, 0);
			class106.method1738(class261, aClass90Array9007[0], class326);
		} else
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1375(class261, aClass90Array9007[0], 0);
		return class531;
	}

	void method8330(Class106 class106) {
		/* empty */
	}

	boolean method8321(Class106 class106, int i, int i_12_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580.getDefinition(-1886454031 * ((Class456_Sub1_Sub3_Sub1) this).anInt11581, 1343460649))).aClass326_5684);
		if (class326 != null)
			return class106.method1736(i, i_12_, method5392(), class326, 65280);
		Model model = method10500(class106, 131072, (short) 255);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_12_, class261, false, 0);
		}
		return false;
	}

	boolean method8314() {
		if (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1400();
		return false;
	}

	public void method397(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577) && ((Class456_Sub1_Sub3_Sub1) this).aBool11584) {
			Class647 class647 = method10501(class106, 262144, true, (short) 19542);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (null != class572_sub12_sub18)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, -655563407);
	}

	public void method392(Class106 class106) {
		Object object = null;
		Class572_Sub12_Sub18 class572_sub12_sub18;
		if ((null == ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577) && ((Class456_Sub1_Sub3_Sub1) this).aBool11584) {
			Class647 class647 = method10501(class106, 262144, true, (short) 18762);
			class572_sub12_sub18 = (Class572_Sub12_Sub18) (class647 != null ? class647.anObject8325 : null);
		} else {
			class572_sub12_sub18 = ((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577;
			((Class456_Sub1_Sub3_Sub1) this).aClass572_Sub12_Sub18_11577 = null;
		}
		Class240 class240 = method5394().aClass240_2647;
		if (null != class572_sub12_sub18)
			aClass523_9010.method6261(class572_sub12_sub18, aByte9008, (int) class240.aFloat2653, (int) class240.aFloat2657, null, 1149960662);
	}

	boolean method8319() {
		if (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1400();
		return false;
	}

	public Class535 method8305(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578)
			((Class456_Sub1_Sub3_Sub1) this).aClass535_11578 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10500(class106, 0, (short) 255), -579685468);
		return ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578;
	}

	public Class535 method8344(Class106 class106) {
		Class240 class240 = method5394().aClass240_2647;
		if (null == ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578)
			((Class456_Sub1_Sub3_Sub1) this).aClass535_11578 = Class421_Sub1.method9246((int) class240.aFloat2653, (int) class240.aFloat2656, (int) class240.aFloat2657, method10500(class106, 0, (short) 255), -1007389952);
		return ((Class456_Sub1_Sub3_Sub1) this).aClass535_11578;
	}

	public void method128() {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1503();
	}

	public int method399() {
		return ((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031;
	}

	public int method389() {
		return ((Class456_Sub1_Sub3_Sub1) this).anInt11581 * -1886454031;
	}

	boolean method8297(Class106 class106, int i, int i_13_, int i_14_) {
		Class326 class326 = (((ObjectDefinitions) (((Class456_Sub1_Sub3_Sub1) this).aClass639_Sub16_11580.getDefinition(-1886454031 * ((Class456_Sub1_Sub3_Sub1) this).anInt11581, 274002843))).aClass326_5684);
		if (class326 != null)
			return class106.method1736(i, i_13_, method5392(), class326, 65280);
		Model model = method10500(class106, 131072, (short) 255);
		if (model != null) {
			Class261 class261 = method5392();
			return model.method1376(i, i_13_, class261, false, 0);
		}
		return false;
	}

	public int method292() {
		return ((Class456_Sub1_Sub3_Sub1) this).aByte11575;
	}

	boolean method8301(byte i) {
		if (null != ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576)
			return ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1400();
		return false;
	}

	Model method10502(Class106 class106, int i) {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null && class106.method1756(((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1353(), i) == 0)
			return ((Class456_Sub1_Sub3_Sub1) this).aClass89_11576;
		Class647 class647 = method10501(class106, i, false, (short) 9549);
		if (class647 != null)
			return (Model) class647.anObject8324;
		return null;
	}

	boolean method8300(int i) {
		if (((Class456_Sub1_Sub3_Sub1) this).aClass89_11576 != null)
			return !((Class456_Sub1_Sub3_Sub1) this).aClass89_11576.method1399();
		return true;
	}

	static final void method10503(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub18_9206.method9016(-826351445) == 1 ? 1 : 0;
	}
}

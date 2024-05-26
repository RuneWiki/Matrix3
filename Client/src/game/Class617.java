package game;

/* Class617 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class617 {
	int webPort;
	int anInt8048;
	static final int anInt8049 = 10;
	String aString8050;
	boolean aBool8051;
	static final int anInt8052 = 2;
	ExecutorService anExecutorService8053;
	long aLong8054;
	static final int anInt8055 = 10000;
	static final int anInt8056 = 10000;
	static final int anInt8057 = 60000;
	volatile int anInt8058 = 0;

	void method7381(byte i) {
		((Class617) this).anInt8058 -= 881327507;
	}

	public void method7382(String string, int i, int i_0_) {
		((Class617) this).aString8050 = string;
		((Class617) this).webPort = 868946287 * i;
	}

	boolean method7383(int i) {
		return -262428517 * ((Class617) this).anInt8058 >= 10;
	}

	Class572_Sub12_Sub16_Sub1 method7384(int i) {
		return method7396(255, 255, (byte) 0, true, 0, 0, (byte) 71);
	}

	public void method7385() {
		((Class617) this).anExecutorService8053.shutdown();
	}

	public void method7386(int i) {
		((Class617) this).anExecutorService8053.shutdown();
	}

	void method7387(boolean bool, byte i) {
		((Class617) this).aBool8051 = bool;
	}

	public Class617(String string, int i, int i_1_) {
		((Class617) this).anExecutorService8053 = Executors.newFixedThreadPool(2);
		((Class617) this).aBool8051 = false;
		((Class617) this).aString8050 = string;
		((Class617) this).webPort = 868946287 * i;
		((Class617) this).anInt8048 = i_1_ * -1627035679;
	}

	boolean method7388() {
		return -262428517 * ((Class617) this).anInt8058 >= 10;
	}

	void method7389(boolean bool) {
		((Class617) this).aBool8051 = bool;
	}

	void method7390() {
		((Class617) this).anInt8058 -= 881327507;
	}

	void method7391() {
		((Class617) this).anInt8058 -= 881327507;
	}

	public void method7392() {
		((Class617) this).anExecutorService8053.shutdown();
	}

	public void method7393() {
		((Class617) this).anExecutorService8053.shutdown();
	}

	void method7394(boolean bool) {
		((Class617) this).aBool8051 = bool;
	}

	void method7395(boolean bool) {
		((Class617) this).aBool8051 = bool;
	}

	Class572_Sub12_Sub16_Sub1 method7396(int i, int i_2_, byte i_3_, boolean bool, int i_4_, int i_5_, byte i_6_) {
		if (i < 0 || i_2_ < 0)
			throw new RuntimeException(new StringBuilder().append(i).append(",").append(i_2_).toString());
		if (method7383(-1197308108))
			return null;
		boolean bool_7_ = i == 255 && 255 == i_2_;
		if (!((Class617) this).aBool8051 && !bool_7_)
			return null;
		if (10000L + ((Class617) this).aLong8054 * 3021964423683908253L >= Class69.method1067(-1735951972))
			return null;
		Object object = null;
		String string;
		if (bool_7_)
			string = new StringBuilder().append("&cb=").append(Class69.method1067(-2119291422)).toString();
		else
			string = new StringBuilder().append("&c=").append(i_4_).append("&v=").append(i_5_).toString();
		URL url;
		try {
			url = new URL("http", ((Class617) this).aString8050, ((Class617) this).webPort * 1789619599, new StringBuilder().append("/ms?m=").append(1662065697 * ((Class617) this).anInt8048).append("&a=").append(i).append("&g=").append(i_2_).append(string).toString());
		} catch (MalformedURLException malformedurlexception) {
			return null;
		}
		Class572_Sub12_Sub16_Sub1 class572_sub12_sub16_sub1 = new Class572_Sub12_Sub16_Sub1(i_3_);
		((Class572_Sub12_Sub16_Sub1) class572_sub12_sub16_sub1).aBool11475 = bool;
		((Class617) this).anInt8058 += 881327507;
		Future future = ((Class617) this).anExecutorService8053.submit(new Class624(this, url, class572_sub12_sub16_sub1));
		class572_sub12_sub16_sub1.method10621(future, -1906330617);
		return class572_sub12_sub16_sub1;
	}

	static final void method7397(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_8_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_9_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class202_Sub1_Sub1.getContainerAmount(i_8_, i_9_, false, (byte) 0);
	}

	static String method7398(Class572_Sub12_Sub19 class572_sub12_sub19, int i) {
		return new StringBuilder().append(((Class572_Sub12_Sub19) class572_sub12_sub19).aString11481).append(GraphicsDefinition.method7770(16777215, (byte) -119)).append(" >").toString();
	}

	public static void method7399(int i, int i_10_, int i_11_, int i_12_, ObjectDefinitions class509, NPC class456_sub1_sub2_sub3_sub1, Player class456_sub1_sub2_sub3_sub2, int i_13_) {
		Class572_Sub27 class572_sub27 = new Class572_Sub27();
		((Class572_Sub27) class572_sub27).anInt9274 = -57728029 * i;
		((Class572_Sub27) class572_sub27).anInt9264 = 1200357575 * (i_10_ << 9);
		((Class572_Sub27) class572_sub27).anInt9265 = 904406815 * (i_11_ << 9);
		if (null != class509) {
			((Class572_Sub27) class572_sub27).aClass509_9260 = class509;
			int i_14_ = class509.sizeX * -876498849;
			int i_15_ = class509.sizeY * 1922784011;
			if (1 == i_12_ || i_12_ == 3) {
				i_14_ = class509.sizeY * 1922784011;
				i_15_ = class509.sizeX * -876498849;
			}
			((Class572_Sub27) class572_sub27).anInt9266 = -1754587443 * (i_14_ + i_10_ << 9);
			((Class572_Sub27) class572_sub27).anInt9280 = -2061202665 * (i_11_ + i_15_ << 9);
			((Class572_Sub27) class572_sub27).anInt9284 = class509.anInt5665 * 1320697427;
			((Class572_Sub27) class572_sub27).anInt9271 = 354114265 * (class509.anInt5656 * 1193964015 << 9);
			((Class572_Sub27) class572_sub27).anInt9281 = -2040910685 * class509.anInt5668;
			((Class572_Sub27) class572_sub27).anInt9287 = -674188913 * class509.anInt5620;
			((Class572_Sub27) class572_sub27).anInt9288 = -347077815 * class509.anInt5670;
			((Class572_Sub27) class572_sub27).anIntArray9268 = class509.anIntArray5671;
			((Class572_Sub27) class572_sub27).anInt9283 = -530301109 * class509.anInt5610;
			((Class572_Sub27) class572_sub27).anInt9282 = class509.anInt5679 * -1335196643;
			((Class572_Sub27) class572_sub27).anInt9259 = (class509.anInt5619 * -1910786617 << 9) * -1707973957;
			if (class509.anIntArray5605 != null) {
				((Class572_Sub27) class572_sub27).aBool9270 = true;
				class572_sub27.method8631((short) -7677);
			}
			if (((Class572_Sub27) class572_sub27).anIntArray9268 != null)
				((Class572_Sub27) class572_sub27).anInt9263 = (((Class572_Sub27) class572_sub27).anInt9287 * 1045737381 + (int) (Math.random() * (double) ((((Class572_Sub27) class572_sub27).anInt9288) * 111819989 - (((Class572_Sub27) class572_sub27).anInt9287 * 1045737381)))) * -1789772835;
			Class572_Sub27.aClass675_9272.method7940(class572_sub27, -1675213761);
			Class344.audio.method933((((Class572_Sub27) class572_sub27).anInt9284) * 293216223, 1702282397);
			Class344.audio.method929((((Class572_Sub27) class572_sub27).anIntArray9268), (byte) 122);
		} else if (null != class456_sub1_sub2_sub3_sub1) {
			((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290 = class456_sub1_sub2_sub3_sub1;
			NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
			if (class410.anIntArray4795 != null) {
				((Class572_Sub27) class572_sub27).aBool9270 = true;
				class410 = class410.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -289306863);
			}
			if (null != class410) {
				((Class572_Sub27) class572_sub27).anInt9266 = -1754587443 * (i_10_ + class410.anInt4792 * 358769667 << 9);
				((Class572_Sub27) class572_sub27).anInt9280 = ((i_11_ + class410.anInt4792 * 358769667 << 9) * -2061202665);
				((Class572_Sub27) class572_sub27).anInt9284 = Class474.method5624(class456_sub1_sub2_sub3_sub1, (byte) 0) * -1853989857;
				((Class572_Sub27) class572_sub27).anInt9271 = 354114265 * (class410.anInt4843 * -1077640307 << 9);
				((Class572_Sub27) class572_sub27).anInt9281 = 2128225023 * class410.anInt4790;
				((Class572_Sub27) class572_sub27).anInt9283 = -724759637 * class410.anInt4855;
				((Class572_Sub27) class572_sub27).anInt9282 = -1728880853 * class410.anInt4794;
				((Class572_Sub27) class572_sub27).anInt9259 = -1707973957 * (881100189 * class410.anInt4789 << 9);
				Class344.audio.method933(-588253189 * class410.anInt4839, -1201817113);
				Class344.audio.method933(class410.anInt4840 * -501509183, 1893687501);
				Class344.audio.method933(499278571 * class410.anInt4841, -626406511);
				Class344.audio.method933(164584663 * class410.anInt4842, 1286134271);
			}
			Class572_Sub27.aClass675_9261.method7940(class572_sub27, -1890249044);
		} else if (null != class456_sub1_sub2_sub3_sub2) {
			((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub2_9275 = class456_sub1_sub2_sub3_sub2;
			((Class572_Sub27) class572_sub27).anInt9266 = ((i_10_ + class456_sub1_sub2_sub3_sub2.method10556((short) -7763)) << 9) * -1754587443;
			((Class572_Sub27) class572_sub27).anInt9280 = ((i_11_ + class456_sub1_sub2_sub3_sub2.method10556((short) -29585)) << 9) * -2061202665;
			((Class572_Sub27) class572_sub27).anInt9284 = Class102_Sub5.method9949(class456_sub1_sub2_sub3_sub2, -1278130394) * -1853989857;
			((Class572_Sub27) class572_sub27).anInt9271 = ((-288578911 * class456_sub1_sub2_sub3_sub2.anInt11834 << 9) * 354114265);
			((Class572_Sub27) class572_sub27).anInt9281 = 958321679 * class456_sub1_sub2_sub3_sub2.anInt11835;
			((Class572_Sub27) class572_sub27).anInt9283 = -993786112;
			((Class572_Sub27) class572_sub27).anInt9282 = 2144262400;
			((Class572_Sub27) class572_sub27).anInt9259 = 0;
			Class572_Sub27.aClass676_9262.put(class572_sub27, (long) (class456_sub1_sub2_sub3_sub2.anInt11633 * -821391465));
			Class344.audio.method933((1637716933 * (class456_sub1_sub2_sub3_sub2.anInt11830)), 772734695);
			Class344.audio.method933((class456_sub1_sub2_sub3_sub2.anInt11824) * 1993650939, 1612001791);
			Class344.audio.method933((-1492335633 * (class456_sub1_sub2_sub3_sub2.anInt11817)), 337116880);
			Class344.audio.method933((-2027496613 * (class456_sub1_sub2_sub3_sub2.anInt11815)), 1753719353);
		}
	}
}

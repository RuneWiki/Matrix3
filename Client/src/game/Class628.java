package game;

/* Class628 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class628 implements Interface72 {
	Class515 aClass515_8097;
	Class435 aClass435_8098;
	Class248 aClass248_8099;
	Class127 aClass127_8100 = new Class127(50);
	String[] aStringArray8101;
	String[] aStringArray8102;
	Interface18 anInterface18_8103;
	int anInt8104;
	Class627 aClass627_8105;
	boolean aBool8106;

	void method7477(byte i) {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -61);
		}
	}

	Class161 method7478(Class106 class106, int i, int i_0_, int i_1_, int i_2_, int i_3_, Class474 class474, int i_4_) {
		((Class627) ((Class628) this).aClass627_8105).anInt8095 = class106.anInt1416 * -2125497331;
		((Class627) ((Class628) this).aClass627_8105).anInt8090 = -1856826365 * i;
		((Class627) ((Class628) this).aClass627_8105).anInt8094 = 1159223355 * i_0_;
		((Class627) ((Class628) this).aClass627_8105).anInt8093 = i_1_ * 2101853951;
		((Class627) ((Class628) this).aClass627_8105).anInt8091 = -1009566495 * i_2_;
		((Class627) ((Class628) this).aClass627_8105).anInt8092 = i_3_ * -2088211013;
		((Class627) ((Class628) this).aClass627_8105).aBool8096 = null != class474;
		return (Class161) ((Class628) this).aClass515_8097.method6095(((Class628) this).aClass627_8105);
	}

	Class161 method7479(Class106 class106, Class106 class106_5_, int i, int i_6_, int i_7_, int i_8_, boolean bool, boolean bool_9_, int i_10_, Class102 class102, Class474 class474, Class484 class484, Interface18 interface18, int i_11_) {
		if (!bool_9_) {
			Class161 class161 = method7478(class106_5_, i, i_6_, i_7_, i_8_, i_10_, class474, 329956328);
			if (null != class161)
				return class161;
		}
		ItemDefinitions class631 = (ItemDefinitions) interface18.getDefinition(i, 1794756996);
		if (i_6_ > 1 && ((ItemDefinitions) class631).anIntArray8167 != null) {
			int i_12_ = -1;
			for (int i_13_ = 0; i_13_ < 10; i_13_++) {
				if (i_6_ >= ((ItemDefinitions) class631).anIntArray8168[i_13_] && 0 != ((ItemDefinitions) class631).anIntArray8168[i_13_])
					i_12_ = ((ItemDefinitions) class631).anIntArray8167[i_13_];
			}
			if (-1 != i_12_)
				class631 = (ItemDefinitions) interface18.getDefinition(i_12_, 1338214072);
		}
		int[] is = class631.method7528(class106, class106_5_, i_6_, i_7_, i_8_, bool, i_10_, class102, class474, class484, (byte) 1);
		if (is == null)
			return null;
		Class161 class161;
		if (bool_9_)
			class161 = class106.method1744(is, 0, 36, 36, 32, -2021177434);
		else
			class161 = class106_5_.method1744(is, 0, 36, 36, 32, -430636875);
		if (!bool_9_) {
			Class627 class627 = new Class627();
			((Class627) class627).anInt8095 = -2125497331 * class106_5_.anInt1416;
			((Class627) class627).anInt8090 = i * -1856826365;
			((Class627) class627).anInt8094 = 1159223355 * i_6_;
			((Class627) class627).anInt8093 = i_7_ * 2101853951;
			((Class627) class627).anInt8091 = -1009566495 * i_8_;
			((Class627) class627).anInt8092 = i_10_ * -2088211013;
			((Class627) class627).aBool8096 = null != class474;
			((Class628) this).aClass515_8097.method6097(class161, class627);
		}
		return class161;
	}

	void method7480() {
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7481(int i, byte i_14_) {
		((Class628) this).anInt8104 = -1634664855 * i;
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -15);
		}
	}

	void method7482(byte i) {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -29);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7483(short i) {
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7484(boolean bool, int i) {
		if (((Class628) this).aBool8106 != bool) {
			((Class628) this).aBool8106 = bool;
			method7482((byte) 71);
		}
	}

	void method7485() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -53);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7486(int i) {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2234((byte) -35);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6101();
		}
	}

	void method7487() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2234((byte) 109);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6101();
		}
	}

	void method7488(boolean bool) {
		if (((Class628) this).aBool8106 != bool) {
			((Class628) this).aBool8106 = bool;
			method7482((byte) -34);
		}
	}

	Class628(Class437 class437, Class435 class435, boolean bool, Class248 class248, Interface18 interface18) {
		((Class628) this).aClass515_8097 = new Class515(250);
		((Class628) this).aClass627_8105 = new Class627();
		((Class628) this).aClass435_8098 = class435;
		((Class628) this).aBool8106 = bool;
		((Class628) this).aClass248_8099 = class248;
		((Class628) this).anInterface18_8103 = interface18;
		if (Class437.aClass437_5072 == class437)
			((Class628) this).aStringArray8102 = (new String[] { null, null, Class279.aClass279_2963.method3758((((Class628) this).aClass435_8098), 16711935), null, null,
				Class279.aClass279_3058.method3758((((Class628) this).aClass435_8098), 16711935) });
		else
			((Class628) this).aStringArray8102 = (new String[] { null, null, Class279.aClass279_2963.method3758((((Class628) this).aClass435_8098), 16711935), null, null, null });
		((Class628) this).aStringArray8101 = (new String[] { null, null, null, null, Class279.aClass279_2964.method3758((((Class628) this).aClass435_8098), 16711935) });
	}

	void method7489(int i) {
		((Class628) this).anInt8104 = -1634664855 * i;
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -45);
		}
	}

	void method7490() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -84);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7491() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -113);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7492() {
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7493(int i) {
		((Class628) this).anInt8104 = -1634664855 * i;
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -22);
		}
	}

	void method7494(int i, byte i_15_) {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2235(i, 1318887848);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6098(i);
		}
	}

	void method7495() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -114);
		}
	}

	void method7496() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2231((byte) -11);
		}
	}

	void method7497(int i) {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2235(i, 1776051468);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6098(i);
		}
	}

	void method7498() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2234((byte) -75);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6101();
		}
	}

	void method7499() {
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6099();
		}
	}

	void method7500() {
		synchronized (((Class628) this).aClass127_8100) {
			((Class628) this).aClass127_8100.method2234((byte) 63);
		}
		synchronized (((Class628) this).aClass515_8097) {
			((Class628) this).aClass515_8097.method6101();
		}
	}

	static final void method7501(Cs2Executor class441, int i) {
		int i_16_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_16_, (short) -19423);
		Class83 class83 = Class534.aClass83Array5975[i_16_ >> 16];
		Class4.method486(class73, class83, class441, (byte) 58);
	}

	static final void method7502(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		OutgoingPacket.method4056(class73, class83, class441, (byte) 1);
	}

	public static int method7503(Random random, int i, int i_17_) {
		if (null == random) {
			random = Class282.aRandom3223;
			if (null == random) {
				synchronized (Class282.anObject3222) {
					if (Class282.aRandom3223 == null)
						Class282.aRandom3223 = new Random();
					random = Class282.aRandom3223;
				}
			}
		}
		if (i <= 0)
			throw new IllegalArgumentException();
		if (Class521.method6219(i, (byte) 118))
			return (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
		int i_18_ = -2147483648 - (int) (4294967296L % (long) i);
		int i_19_;
		do
			i_19_ = random.nextInt();
		while (i_19_ >= i_18_);
		return Class253.method3514(i_19_, i, -916716006);
	}
}

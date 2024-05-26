package game;

/* Class202_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.Iterator;

public class Class202_Sub1_Sub1 extends Class202_Sub1 implements Interface18 {
	Class248 aClass248_11243;
	Class127 aClass127_11244 = new Class127(64);

	public void method10196(int i) {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2235(i, 1535977603);
		}
	}

	Class179_Sub2 method10197(int i, byte i_0_) {
		byte[] is = (((Class202_Sub1_Sub1) this).aClass248_11243.getFile(aClass272_9649.method3668((byte) -5).anInt2591 * 1890065851, i, 1903297617));
		Class179_Sub2 class179_sub2 = new Class179_Sub2(aClass272_9649, i);
		if (is != null)
			class179_sub2.method109(new RSByteBuffer(is), -612602623);
		return class179_sub2;
	}

	public void method10198(int i) {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2231((byte) -6);
		}
	}

	public void method10199(int i, int i_1_) {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2235(i, 1952671961);
		}
	}

	public void method10200() {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2231((byte) -71);
		}
	}

	public Iterator iterator() {
		return new Class76(this);
	}

	public int method113(byte i) {
		return super.method113((byte) 97);
	}

	public void method10201() {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2234((byte) 46);
		}
	}

	public int method45() {
		return super.method113((byte) 71);
	}

	public Interface17 method114(int i) {
		Class179_Sub2 class179_sub2;
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			class179_sub2 = (Class179_Sub2) ((Class202_Sub1_Sub1) this).aClass127_11244.method2246((long) i);
			if (class179_sub2 == null) {
				class179_sub2 = method10197(i, (byte) -11);
				((Class202_Sub1_Sub1) this).aClass127_11244.method2229(class179_sub2, (long) i);
			}
		}
		return class179_sub2;
	}

	public Interface17 getDefinition(int i, int i_2_) {
		Class179_Sub2 class179_sub2;
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			class179_sub2 = (Class179_Sub2) ((Class202_Sub1_Sub1) this).aClass127_11244.method2246((long) i);
			if (class179_sub2 == null) {
				class179_sub2 = method10197(i, (byte) -19);
				((Class202_Sub1_Sub1) this).aClass127_11244.method2229(class179_sub2, (long) i);
			}
		}
		return class179_sub2;
	}

	public Class202_Sub1_Sub1(Class437 class437, VarDomainType class272, Class435 class435, Class248 class248) {
		super(class437, class272, class435, (null != class248 ? class248.method3376((class272.method3668((byte) 113).anInt2591 * 1890065851), 1981081642) : 0));
		((Class202_Sub1_Sub1) this).aClass248_11243 = class248;
	}

	public void method10202() {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2234((byte) 53);
		}
	}

	public void method10203(int i) {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2234((byte) -30);
		}
	}

	public void method10204() {
		synchronized (((Class202_Sub1_Sub1) this).aClass127_11244) {
			((Class202_Sub1_Sub1) this).aClass127_11244.method2234((byte) 43);
		}
	}

	public Iterator method10205() {
		return new Class76(this);
	}

	public static int getContainerAmount(int key, int index, boolean split, byte i_4_) {
		ItemsContainer class572_sub31 = Class447.getContainer(key, split, -2097897176);
		if (class572_sub31 == null)
			return 0;
		if (index < 0 || index >= ((ItemsContainer) class572_sub31).itemAmounts.length)
			return 0;
		return ((ItemsContainer) class572_sub31).itemAmounts[index];
	}

	static final void method10207(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = ((Player) ((Cs2Executor) class441).entity).method10697(true, 516091053);
	}

	static void method10208(Class106 class106, int i) {
		if (Class7.aClass675_37.method7927(-219501383) != 0) {
			if (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(2118147269) == 0) {
				for (Class572_Sub33 class572_sub33 = ((Class572_Sub33) Class7.aClass675_37.method7932((byte) 50)); null != class572_sub33; class572_sub33 = ((Class572_Sub33) Class7.aClass675_37.method7926(1403261026))) {
					Class672.aClass639_Sub5_8533.method8898(class106, class106, (-1949720269 * ((Class572_Sub33) class572_sub33).anInt9326), (((Class572_Sub33) class572_sub33).anInt9327 * 152046793), (((Class572_Sub33) class572_sub33).anInt9328 * -2073853737), (752265759 * ((Class572_Sub33) class572_sub33).anInt9331), false, false, (1372212147 * ((Class572_Sub33) class572_sub33).anInt9330), Class298.aClass102_3481, (((Class572_Sub33) class572_sub33).aBool9329 ? (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831) : null), JS5ConfigGroup.aClass484_2593, (short) -1562);
					class572_sub33.method6794((byte) -42);
				}
				Class54.method987((byte) 20);
			} else {
				if (null == Class166.aClass106_2051) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					Class166.aClass106_2051 = Class435.method5263(0, canvas, (Class456_Sub1_Sub3_Sub2.aClass94_11589), Class274.anInterface5_2910, Class583.aClass318_7731, Class224_Sub1.aClass307_9491, Class428.aClass304_5021, Class423_Sub2.aClass248_9761, 0, 2049550306);
					Class252.aClass102_2732 = (Class166.aClass106_2051.method1751(Class549_Sub1.method8097(Class88.aClass248_1226, (-1060508549 * Class1.anInt14), 0, 707569257), Class160.method2573(Class582.aClass248_7725, -1060508549 * Class1.anInt14, 0), true));
				}
				for (Class572_Sub33 class572_sub33 = ((Class572_Sub33) Class7.aClass675_37.method7932((byte) 50)); null != class572_sub33; class572_sub33 = ((Class572_Sub33) Class7.aClass675_37.method7926(474448214))) {
					Class672.aClass639_Sub5_8533.method8898(Class166.aClass106_2051, class106, (-1949720269 * ((Class572_Sub33) class572_sub33).anInt9326), (152046793 * ((Class572_Sub33) class572_sub33).anInt9327), (((Class572_Sub33) class572_sub33).anInt9328 * -2073853737), (752265759 * ((Class572_Sub33) class572_sub33).anInt9331), false, false, (1372212147 * ((Class572_Sub33) class572_sub33).anInt9330), Class252.aClass102_2732, (((Class572_Sub33) class572_sub33).aBool9329 ? (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aClass474_11831) : null), JS5ConfigGroup.aClass484_2593, (short) -18652);
					class572_sub33.method6794((byte) -25);
				}
			}
		}
	}
}

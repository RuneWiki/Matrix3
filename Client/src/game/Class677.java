package game;

/* Class677 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class677 implements Iterator {
	Class664 aClass664_8554;
	Class572_Sub12 aClass572_Sub12_8555;
	Class572_Sub12 aClass572_Sub12_8556 = null;
	static long aLong8557;

	public boolean method7977() {
		return (((Class677) this).aClass572_Sub12_8555 != ((Class677) this).aClass664_8554.aClass572_Sub12_8489);
	}

	void method7978(short i) {
		((Class677) this).aClass572_Sub12_8555 = (((Class677) this).aClass664_8554.aClass572_Sub12_8489.aClass572_Sub12_9094);
		((Class677) this).aClass572_Sub12_8556 = null;
	}

	public Class572_Sub12 method7979(int i) {
		method7978((short) 16383);
		return (Class572_Sub12) next();
	}

	public Object next() {
		Class572_Sub12 class572_sub12 = ((Class677) this).aClass572_Sub12_8555;
		if (((Class677) this).aClass664_8554.aClass572_Sub12_8489 == class572_sub12) {
			class572_sub12 = null;
			((Class677) this).aClass572_Sub12_8555 = null;
		} else
			((Class677) this).aClass572_Sub12_8555 = class572_sub12.aClass572_Sub12_9094;
		((Class677) this).aClass572_Sub12_8556 = class572_sub12;
		return class572_sub12;
	}

	public Object method7980() {
		Class572_Sub12 class572_sub12 = ((Class677) this).aClass572_Sub12_8555;
		if (((Class677) this).aClass664_8554.aClass572_Sub12_8489 == class572_sub12) {
			class572_sub12 = null;
			((Class677) this).aClass572_Sub12_8555 = null;
		} else
			((Class677) this).aClass572_Sub12_8555 = class572_sub12.aClass572_Sub12_9094;
		((Class677) this).aClass572_Sub12_8556 = class572_sub12;
		return class572_sub12;
	}

	public boolean hasNext() {
		return (((Class677) this).aClass572_Sub12_8555 != ((Class677) this).aClass664_8554.aClass572_Sub12_8489);
	}

	public boolean method7981() {
		return (((Class677) this).aClass572_Sub12_8555 != ((Class677) this).aClass664_8554.aClass572_Sub12_8489);
	}

	public Object method7982() {
		Class572_Sub12 class572_sub12 = ((Class677) this).aClass572_Sub12_8555;
		if (((Class677) this).aClass664_8554.aClass572_Sub12_8489 == class572_sub12) {
			class572_sub12 = null;
			((Class677) this).aClass572_Sub12_8555 = null;
		} else
			((Class677) this).aClass572_Sub12_8555 = class572_sub12.aClass572_Sub12_9094;
		((Class677) this).aClass572_Sub12_8556 = class572_sub12;
		return class572_sub12;
	}

	void method7983() {
		((Class677) this).aClass572_Sub12_8555 = (((Class677) this).aClass664_8554.aClass572_Sub12_8489.aClass572_Sub12_9094);
		((Class677) this).aClass572_Sub12_8556 = null;
	}

	public void method7984() {
		if (null == ((Class677) this).aClass572_Sub12_8556)
			throw new IllegalStateException();
		((Class677) this).aClass572_Sub12_8556.method8412(724585842);
		((Class677) this).aClass572_Sub12_8556 = null;
	}

	public void method7985() {
		if (null == ((Class677) this).aClass572_Sub12_8556)
			throw new IllegalStateException();
		((Class677) this).aClass572_Sub12_8556.method8412(724585842);
		((Class677) this).aClass572_Sub12_8556 = null;
	}

	public Class677(Class664 class664) {
		((Class677) this).aClass664_8554 = class664;
		((Class677) this).aClass572_Sub12_8555 = (((Class677) this).aClass664_8554.aClass572_Sub12_8489.aClass572_Sub12_9094);
		((Class677) this).aClass572_Sub12_8556 = null;
	}

	void method7986() {
		((Class677) this).aClass572_Sub12_8555 = (((Class677) this).aClass664_8554.aClass572_Sub12_8489.aClass572_Sub12_9094);
		((Class677) this).aClass572_Sub12_8556 = null;
	}

	public void remove() {
		if (null == ((Class677) this).aClass572_Sub12_8556)
			throw new IllegalStateException();
		((Class677) this).aClass572_Sub12_8556.method8412(724585842);
		((Class677) this).aClass572_Sub12_8556 = null;
	}

	public static void method7987(String string, boolean bool, Class106 class106, Class102 class102, Class284 class284, int i) {
		boolean bool_0_ = !Class658.aBool8422 || Class330.method4158(1747340175);
		if (bool_0_) {
			if (Class658.aBool8422 && bool_0_) {
				class284 = Class165.aClass284_2047;
				class102 = class106.method1751(class284, Class526.aClass87_Sub1Array5893, true);
				int i_1_ = class284.method3835(string, 250, null, 1175787055);
				int i_2_ = class284.method3830(string, 250, -1605051853 * class284.anInt3411, null, (byte) 100);
				int i_3_ = Class635_Sub2.aClass87_9532.method1329();
				int i_4_ = i_3_ + 4;
				i_1_ += 2 * i_4_;
				i_2_ += 2 * i_4_;
				if (i_1_ < Class421_Sub1.anInt9727 * -1316497113)
					i_1_ = Class421_Sub1.anInt9727 * -1316497113;
				if (i_2_ < Class204.anInt2408 * 65930557)
					i_2_ = Class204.anInt2408 * 65930557;
				int i_5_ = (Class204.aClass320_2404.method4095(i_1_, (client.anInt8724 * -507276561), 866359492) + -2024972171 * Class204.anInt2406);
				int i_6_ = (Class204.aClass300_2405.method3986(i_2_, (client.anInt8725 * -199235591), 313685373) + -744807329 * Class204.anInt2407);
				class106.method1711(Class572_Sub3_Sub4.aClass87_11372, false).method2630(i_5_ + Class48.aClass87_473.method1329(), i_6_ + Class48.aClass87_473.method1330(), i_1_ - Class48.aClass87_473.method1329() * 2, i_2_ - Class48.aClass87_473.method1330() * 2, 1, -1, 0);
				class106.method1711(Class48.aClass87_473, true).method2595(i_5_, i_6_);
				Class48.aClass87_473.method1296();
				class106.method1711(Class48.aClass87_473, true).method2595(i_1_ + i_5_ - i_3_, i_6_);
				Class48.aClass87_473.method1281();
				class106.method1711(Class48.aClass87_473, true).method2595(i_1_ + i_5_ - i_3_, i_6_ + i_2_ - i_3_);
				Class48.aClass87_473.method1296();
				class106.method1711(Class48.aClass87_473, true).method2595(i_5_, i_2_ + i_6_ - i_3_);
				Class48.aClass87_473.method1281();
				class106.method1711(Class635_Sub2.aClass87_9532, true).method2600(i_5_, i_6_ + Class48.aClass87_473.method1330(), i_3_, i_2_ - Class48.aClass87_473.method1330() * 2);
				Class635_Sub2.aClass87_9532.method1299();
				class106.method1711(Class635_Sub2.aClass87_9532, true).method2600(i_5_ + Class48.aClass87_473.method1329(), i_6_, i_1_ - Class48.aClass87_473.method1329() * 2, i_3_);
				Class635_Sub2.aClass87_9532.method1299();
				class106.method1711(Class635_Sub2.aClass87_9532, true).method2600(i_1_ + i_5_ - i_3_, i_6_ + Class48.aClass87_473.method1330(), i_3_, i_2_ - Class48.aClass87_473.method1330() * 2);
				Class635_Sub2.aClass87_9532.method1299();
				class106.method1711(Class635_Sub2.aClass87_9532, true).method2600(i_5_ + Class48.aClass87_473.method1329(), i_2_ + i_6_ - i_3_, i_1_ - Class48.aClass87_473.method1329() * 2, i_3_);
				Class635_Sub2.aClass87_9532.method1299();
				class102.method1613(string, i_5_ + i_4_, i_6_ + i_4_, i_1_ - i_4_ * 2, i_2_ - i_4_ * 2, (158790427 * Class415_Sub1.anInt9809 | ~0xffffff), -1, 1, 1, 0, null, null, null, 0, 0, (byte) 27);
				VarBitDefinition.method5229(i_5_, i_6_, i_1_, i_2_, 1805235097);
			} else {
				int i_7_ = class284.method3835(string, 250, null, 1650967318);
				int i_8_ = class284.method3841(string, 250, null, -1590140001) * 13;
				int i_9_ = 4;
				int i_10_ = 6 + i_9_;
				int i_11_ = i_9_ + 6;
				class106.method1725(i_10_ - i_9_, i_11_ - i_9_, i_7_ + i_9_ + i_9_, i_9_ + i_8_ + i_9_, -16777216, 0);
				class106.method1724(i_10_ - i_9_, i_11_ - i_9_, i_9_ + (i_9_ + i_7_), i_9_ + i_8_ + i_9_, -1, 0);
				class102.method1613(string, i_10_, i_11_, i_7_, i_8_, -1, -1, 1, 1, 0, null, null, null, 0, 0, (byte) 13);
				VarBitDefinition.method5229(i_10_ - i_9_, i_11_ - i_9_, i_9_ + i_7_ + i_9_, i_9_ + i_8_ + i_9_, 150366635);
			}
			if (bool) {
				try {
					class106.method1747();
					class106.method1966(-666138603);
				} catch (Exception_Sub1 exception_sub1) {
					/* empty */
				}
			}
		}
	}
}

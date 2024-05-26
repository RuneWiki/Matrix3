package game;

/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class46 {
	long aLong462;
	Interface1 anInterface1_463;
	LinkedList aLinkedList464;
	int anInt465 = -602278641;

	public void method829(Class49 class49) {
		if ((-3998659207941993475L * ((Class46) this).aLong462 != ((Class49) class49).aLong479 * 4503102097696340271L) || (class49.method847(1898584971) != ((Class46) this).anInt465 * 45196817))
			throw new IllegalStateException("");
		Iterator iterator = ((Class46) this).aLinkedList464.iterator();
		while (iterator.hasNext()) {
			Interface2 interface2 = (Interface2) iterator.next();
			interface2.method15(class49, -1648379419);
		}
		class49.method865((byte) 15);
	}

	public void method830(Class49 class49, byte i) {
		if ((-3998659207941993475L * ((Class46) this).aLong462 != ((Class49) class49).aLong479 * 4503102097696340271L) || (class49.method847(1820888736) != ((Class46) this).anInt465 * 45196817))
			throw new IllegalStateException("");
		Iterator iterator = ((Class46) this).aLinkedList464.iterator();
		while (iterator.hasNext()) {
			Interface2 interface2 = (Interface2) iterator.next();
			interface2.method15(class49, -1648379419);
		}
		class49.method865((byte) 48);
	}

	public Class46(RSByteBuffer class572_sub15, Interface1 interface1) {
		((Class46) this).aLinkedList464 = new LinkedList();
		((Class46) this).anInterface1_463 = interface1;
		((Class46) this).aLong462 = class572_sub15.method8476((byte) 4) * -6508803349478708907L;
		((Class46) this).anInt465 = class572_sub15.readInt(2102451488) * 602278641;
		for (int i = class572_sub15.readUnsignedByte(6664728); i != 0; i = class572_sub15.readUnsignedByte(472645238)) {
			Class45 class45 = (Class45) Class455.method5387(Class45.method824(1877843330), i, -1948596836);
			Interface2 interface2;
			switch (2026014687 * ((Class45) class45).anInt460) {
				case 9:
					interface2 = new Class56(this, class572_sub15);
					break;
				case 6:
					interface2 = new Class55(this, class572_sub15);
					break;
				case 12:
					interface2 = new Class50(this);
					break;
				case 10:
					interface2 = new Class34(this, class572_sub15);
					break;
				case 1:
					interface2 = new Class114(this, class572_sub15);
					break;
				case 5:
					interface2 = new Class38(this, class572_sub15);
					break;
				case 8:
					interface2 = new Class113(this, class572_sub15);
					break;
				case 4:
					interface2 = new Class35(this, class572_sub15);
					break;
				case 7:
					interface2 = new Class44(this, class572_sub15);
					break;
				case 0:
					interface2 = new Class117(this, class572_sub15);
					break;
				case 11:
					interface2 = new Class57(this, class572_sub15);
					break;
				case 2:
					interface2 = new Class51(this);
					break;
				case 13:
					interface2 = new Class81(this, class572_sub15);
					break;
				case 3:
					interface2 = new Class58(this, class572_sub15);
					break;
				default:
					throw new IllegalStateException("");
			}
			((Class46) this).aLinkedList464.add(interface2);
		}
	}

	static final void method831(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((Class572_Sub12_Sub1) Class639_Sub10.aClass639_Sub4_9534.getDefinition(i_0_, -119689724)).anInt11247) * -2096325171;
	}

	static final void method832(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (1472719885 * client.anInt8861 == 2 && i_1_ < client.anInt8860 * 681720871)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = client.aClass26Array8863[i_1_].aString205;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}

	static final void method833(Cs2Executor class441, int i) {
		if (client.anInt8861 * 1472719885 == 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 351572371 * client.anInt8865;
	}

	public static Class513[] method834(byte i) {
		return (new Class513[] { Class513.aClass513_5710, Class513.aClass513_5708, Class513.aClass513_5706, Class513.aClass513_5709, Class513.aClass513_5705, Class513.aClass513_5707 });
	}

	static void method835(Class106 class106, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if ((Class486.aClass161_5448 == null || Class654.aClass161_8404 == null || null == Class639_Sub14.aClass161_9555) && Class582.aClass248_7725.method3383(Class346.anInt4385 * -459782925, 166504713) && Class582.aClass248_7725.method3383(Class307.anInt3549 * 893031309, -1358586841) && Class582.aClass248_7725.method3383(Class121.anInt1480 * -1176761017, -81354036)) {
			Class87 class87 = Class160.method2571(Class582.aClass248_7725, 893031309 * Class307.anInt3549, 0);
			Class654.aClass161_8404 = class106.method1711(class87, true);
			class87.method1296();
			Class17.aClass161_137 = class106.method1711(class87, true);
			Class486.aClass161_5448 = (class106.method1711(Class160.method2571(Class582.aClass248_7725, -459782925 * Class346.anInt4385, 0), true));
			Class87 class87_7_ = Class160.method2571(Class582.aClass248_7725, -1176761017 * Class121.anInt1480, 0);
			Class639_Sub14.aClass161_9555 = class106.method1711(class87_7_, true);
			class87_7_.method1296();
			Class255_Sub1.aClass161_8947 = class106.method1711(class87_7_, true);
		}
		if (Class486.aClass161_5448 != null && Class654.aClass161_8404 != null && Class639_Sub14.aClass161_9555 != null) {
			int i_8_ = ((i_3_ - Class639_Sub14.aClass161_9555.method2587() * 2) / Class486.aClass161_5448.method2587());
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
				Class486.aClass161_5448.method2595((i + Class639_Sub14.aClass161_9555.method2587() + i_9_ * Class486.aClass161_5448.method2587()), i_4_ + i_2_ - Class486.aClass161_5448.method2588());
			int i_10_ = ((i_4_ - i_5_ - Class639_Sub14.aClass161_9555.method2588()) / Class654.aClass161_8404.method2588());
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				Class654.aClass161_8404.method2595(i, (i_5_ + i_2_ + i_11_ * Class654.aClass161_8404.method2588()));
				Class17.aClass161_137.method2595(i + i_3_ - Class17.aClass161_137.method2587(), (i_2_ + i_5_ + i_11_ * Class654.aClass161_8404.method2588()));
			}
			Class639_Sub14.aClass161_9555.method2595(i, (i_2_ + i_4_ - Class639_Sub14.aClass161_9555.method2588()));
			Class255_Sub1.aClass161_8947.method2595(i + i_3_ - Class639_Sub14.aClass161_9555.method2587(), i_2_ + i_4_ - Class639_Sub14.aClass161_9555.method2588());
		}
	}

	static final void method836(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1554484939 * class73.anInt783;
	}

	static final void method837(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_12_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_13_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class542.method6436(i_12_, i_13_, true, (short) -2844);
	}
}

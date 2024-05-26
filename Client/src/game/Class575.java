package game;

/* Class575 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class575 {
	static int anInt7659 = 0;
	LinkedList aLinkedList7660;
	int anInt7661;
	int[] anIntArray7662;
	int[] anIntArray7663;
	public Model aClass89_7664;
	int anInt7665;
	boolean aBool7666;

	public void method6809(int i) {
		((Class575) this).aBool7666 = false;
		aClass89_7664 = null;
	}

	public void method6810(Class523 class523, byte i) {
		if (null != class523 && null != ((Class575) this).aLinkedList7660) {
			Iterator iterator = ((Class575) this).aLinkedList7660.iterator();
			while (iterator.hasNext()) {
				Class456_Sub1_Sub2_Sub6 class456_sub1_sub2_sub6 = (Class456_Sub1_Sub2_Sub6) iterator.next();
				class523.method6247(class456_sub1_sub2_sub6.aByte9009, class456_sub1_sub2_sub6.aShort11503, class456_sub1_sub2_sub6.aShort11500, new Class573(class456_sub1_sub2_sub6), (byte) -2);
			}
		}
	}

	void method6811(Class523 class523, int i) {
		((Class575) this).aLinkedList7660 = new LinkedList();
		Class274 class274 = client.aClass613_8605.method7287((byte) -40);
		Class497 class497 = client.aClass613_8605.method7280((byte) 1);
		Class497 class497_0_ = new Class497(-374189215 * Class274.anInt2911, ((Class575) this).anIntArray7662[0], ((Class575) this).anIntArray7663[0]);
		for (int i_1_ = 1; i_1_ < ((Class575) this).anInt7661 * -934662493; i_1_++) {
			Class497 class497_2_ = new Class497(Class274.anInt2911 * -374189215, ((Class575) this).anIntArray7662[i_1_], ((Class575) this).anIntArray7663[i_1_]);
			while ((-2109597897 * class497_2_.localX != class497_0_.localX * -2109597897) || (class497_0_.localY * 417324155 != class497_2_.localY * 417324155)) {
				if (class497_0_.localX * -2109597897 < -2109597897 * class497_2_.localX)
					class497_0_.localX += 134565511;
				else if (-2109597897 * class497_0_.localX > class497_2_.localX * -2109597897)
					class497_0_.localX -= 134565511;
				if (class497_0_.localY * 417324155 < class497_2_.localY * 417324155)
					class497_0_.localY += -219569485;
				else if (417324155 * class497_0_.localY > 417324155 * class497_2_.localY)
					class497_0_.localY -= -219569485;
				int i_3_ = -374189215 * Class274.anInt2911;
				int i_4_ = (class497_0_.localX * -2109597897 - class497.localX * -2109597897);
				int i_5_ = (417324155 * class497_0_.localY - class497.localY * 417324155);
				if (i_4_ >= 0 && i_4_ < class523.anInt5833 * -1396185127 && i_5_ >= 0 && i_5_ < -1519623925 * class523.anInt5834) {
					int i_6_ = 256 + (i_4_ << 9);
					int i_7_ = 256 + (i_5_ << 9);
					if (class274.method3689(i_4_, i_5_, -1914582593))
						i_3_++;
					((Class575) this).aLinkedList7660.add(new Class456_Sub1_Sub2_Sub6(class523, this, -374189215 * Class274.anInt2911, i_3_, i_6_, Class314.method4072(i_6_, i_7_, -374189215 * Class274.anInt2911, -2056684555), i_7_));
				}
			}
			class497_0_ = class497_2_;
		}
	}

	public boolean method6812() {
		return ((Class575) this).aBool7666;
	}

	public boolean method6813(int i) {
		return ((Class575) this).aBool7666;
	}

	public boolean method6814(Class106 class106, int i) {
		aClass89_7664 = method6815(class106, (byte) 43);
		return aClass89_7664 != null;
	}

	Model method6815(Class106 class106, byte i) {
		Class159 class159 = Class159.method2569(Class489.aClass248_5463, ((Class575) this).anInt7665 * 186471597, 0);
		if (class159 == null)
			return null;
		if (class159.anInt1773 < 13)
			class159.method2567(2);
		return class106.method1755(class159, 2048, anInt7659 * 924489721, 64, 768);
	}

	public void method6816(Class523 class523, byte i) {
		if (class523 != null && -934662493 * ((Class575) this).anInt7661 > 0) {
			method6811(class523, -624027861);
			Iterator iterator = ((Class575) this).aLinkedList7660.iterator();
			while (iterator.hasNext()) {
				Class456_Sub1_Sub2_Sub6 class456_sub1_sub2_sub6 = (Class456_Sub1_Sub2_Sub6) iterator.next();
				class523.method6232(class456_sub1_sub2_sub6, false, -1004379327);
			}
			((Class575) this).aBool7666 = true;
		}
	}

	public static void method6817(int i) {
		anInt7659 = -798066103 * i;
	}

	public static void method6818(int i) {
		anInt7659 = -798066103 * i;
	}

	public void method6819() {
		((Class575) this).aBool7666 = false;
		aClass89_7664 = null;
	}

	public void method6820() {
		((Class575) this).aBool7666 = false;
		aClass89_7664 = null;
	}

	public Class575(Class106 class106, RSByteBuffer class572_sub15, int i) {
		((Class575) this).anInt7665 = 1794322213 * i;
		((Class575) this).anInt7661 = class572_sub15.readSmart(16777215) * 1778054411;
		((Class575) this).anIntArray7662 = new int[-934662493 * ((Class575) this).anInt7661];
		((Class575) this).anIntArray7663 = new int[-934662493 * ((Class575) this).anInt7661];
		int i_8_ = class572_sub15.readUnsignedShort(647518597);
		int i_9_ = class572_sub15.readUnsignedShort(647518597);
		for (int i_10_ = 0; i_10_ < ((Class575) this).anInt7661 * -934662493; i_10_++) {
			((Class575) this).anIntArray7662[i_10_] = i_8_ + class572_sub15.readByte(1346763317);
			((Class575) this).anIntArray7663[i_10_] = i_9_ + class572_sub15.readByte(1406790909);
		}
		aClass89_7664 = method6815(class106, (byte) 112);
	}

	public boolean method6821() {
		return ((Class575) this).aBool7666;
	}

	public boolean method6822() {
		return ((Class575) this).aBool7666;
	}

	static final void method6823(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class492.method5865(class73, class83, class441, -1533355944);
	}

	static final void method6824(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_11_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_12_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		((Cs2Executor) class441).aClass305_5105.anIntArray3539[i_11_] = i_12_;
	}

	static final void method6825(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		Class133_Sub1.aClass411_Sub1_9827.method4977((float) (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]), (float) (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]), (float) (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 2]), (byte) 47);
	}

	static final void method6826(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_13_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_14_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_15_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (-1 == i_14_)
			throw new RuntimeException();
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_14_, 1529410570));
		if (class645.aClass283_8313.getId(1039801013) != i_13_)
			throw new RuntimeException();
		if (class645.aClass283_8314.getId(-1448683587) != ScriptVarType.aClass283_3261.getId(-1252141289))
			throw new RuntimeException();
		int[] is = class645.method7634(string, 1719214866);
		if (i_15_ < 0 || null == is || is.length <= i_15_)
			throw new RuntimeException();
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = is[i_15_];
	}

	public static int method6827(int i, short i_16_) {
		Class391 class391 = (Class391) Class390.aMap4653.get(Integer.valueOf(i));
		if (null == class391)
			return 0;
		return class391.method4712(1312554635);
	}

	public static void method6828(int i, int i_17_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(9, (long) i);
		class572_sub12_sub11.method10384(-1776073504);
	}
}

package game;

/* Class633 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class633 {
	public static RSSocket aClass641_8195;
	public static RSSocket aClass641_8196;
	public static RSSocket aClass641_8197;
	public static boolean aBool8198;
	public static long aLong8199;
	public static boolean aBool8200;
	static Class461 aClass461_8201;
	public static boolean aBool8202 = false;
	public static RSSocket aClass641_8203;
	static RSByteBuffer aClass572_Sub15_8204;
	static int anInt8205;
	static int anInt8206;
	static Class481_Sub1[] aClass481_Sub1Array8207 = new Class481_Sub1[0];
	public static RSSocket aClass641_8208;
	public static boolean aBool8209;
	public static int anInt8210;

	static {
		anInt8205 = 557745927;
		anInt8206 = 0;
		aClass461_8201 = null;
		aBool8198 = false;
	}

	public static void method7549() {
		if (Class10.aClass641_48.id * 2112639107 != -1)
			Class242.method3340(Class10.aClass641_48.id * 2112639107, Class10.aClass641_48.address, (byte) 50);
	}

	public static void method7550() {
		if (Class10.aClass641_48.id * 2112639107 != -1)
			Class242.method3340(Class10.aClass641_48.id * 2112639107, Class10.aClass641_48.address, (byte) -46);
	}

	Class633() throws Throwable {
		throw new Error();
	}

	public static void method7551() {
		if (Class10.aClass641_48.id * 2112639107 != -1)
			Class242.method3340(Class10.aClass641_48.id * 2112639107, Class10.aClass641_48.address, (byte) 23);
	}

	public static void method7552() {
		if (Class10.aClass641_48.id * 2112639107 != -1)
			Class242.method3340(Class10.aClass641_48.id * 2112639107, Class10.aClass641_48.address, (byte) -58);
	}

	static final void method7553(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method845((byte) -17).size();
	}

	static final void method7554(int i) {
		Class572_Sub15_Sub2 class572_sub15_sub2 = ((Class195) client.aClass195_8589).aClass572_Sub15_Sub2_2330;
		class572_sub15_sub2.method10397(-860683894);
		int i_0_ = class572_sub15_sub2.readBits(8, -1809904620);
		if (i_0_ < client.anInt8625 * 765313669) {
			for (int i_1_ = i_0_; i_1_ < client.anInt8625 * 765313669; i_1_++)
				client.anIntArray8832[(client.anInt8869 += 2143290927) * 1412759759 - 1] = client.anIntArray8626[i_1_];
		}
		if (i_0_ > 765313669 * client.anInt8625)
			throw new RuntimeException();
		client.anInt8625 = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = client.anIntArray8626[i_2_];
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) client.aClass676_8622.get((long) i_3_)).anObject9081));
			int i_4_ = class572_sub15_sub2.readBits(1, -1809904620);
			if (i_4_ == 0) {
				client.anIntArray8626[(client.anInt8625 += 1417012813) * 765313669 - 1] = i_3_;
				class456_sub1_sub2_sub3_sub1.anInt11649 = -875697841 * client.anInt8629;
			} else {
				int i_5_ = class572_sub15_sub2.readBits(2, -1809904620);
				if (i_5_ == 0) {
					client.anIntArray8626[(client.anInt8625 += 1417012813) * 765313669 - 1] = i_3_;
					class456_sub1_sub2_sub3_sub1.anInt11649 = client.anInt8629 * -875697841;
					client.anIntArray8628[(client.anInt8627 += -720093963) * 865439581 - 1] = i_3_;
				} else if (1 == i_5_) {
					client.anIntArray8626[(client.anInt8625 += 1417012813) * 765313669 - 1] = i_3_;
					class456_sub1_sub2_sub3_sub1.anInt11649 = -875697841 * client.anInt8629;
					Class661 class661 = ((Class661) (Class455.method5387(Class343.method4304(1486071676), class572_sub15_sub2.readBits(3, -1809904620), -2042854848)));
					class456_sub1_sub2_sub3_sub1.method10682(class661, (Class453.aClass453_5177.aByte5183), (byte) 97);
					int i_6_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (i_6_ == 1)
						client.anIntArray8628[(client.anInt8627 += -720093963) * 865439581 - 1] = i_3_;
				} else if (i_5_ == 2) {
					client.anIntArray8626[(client.anInt8625 += 1417012813) * 765313669 - 1] = i_3_;
					class456_sub1_sub2_sub3_sub1.anInt11649 = -875697841 * client.anInt8629;
					if (class572_sub15_sub2.readBits(1, -1809904620) == 1) {
						Class661 class661 = ((Class661) (Class455.method5387(Class343.method4304(1340543686), class572_sub15_sub2.readBits(3, -1809904620), -1925484373)));
						class456_sub1_sub2_sub3_sub1.method10682(class661, Class453.aClass453_5179.aByte5183, (byte) 106);
						Class661 class661_7_ = ((Class661) (Class455.method5387(Class343.method4304(1980605472), class572_sub15_sub2.readBits(3, -1809904620), -2037923920)));
						class456_sub1_sub2_sub3_sub1.method10682(class661_7_, Class453.aClass453_5179.aByte5183, (byte) 64);
					} else {
						Class661 class661 = ((Class661) (Class455.method5387(Class343.method4304(987728525), class572_sub15_sub2.readBits(3, -1809904620), -2088722418)));
						class456_sub1_sub2_sub3_sub1.method10682(class661, Class453.aClass453_5182.aByte5183, (byte) 89);
					}
					int i_8_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (1 == i_8_)
						client.anIntArray8628[(client.anInt8627 += -720093963) * 865439581 - 1] = i_3_;
				} else if (i_5_ == 3)
					client.anIntArray8832[(client.anInt8869 += 2143290927) * 1412759759 - 1] = i_3_;
			}
		}
	}

	static final void method7555(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class623.method7448(string, 2090808169);
	}
}

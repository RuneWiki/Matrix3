package game;

/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class198 implements Interface6 {
	int anInt2361;
	int anInt2362;
	int[] anIntArray2363;

	public void method39() {
		/* empty */
	}

	Class198(int i, int i_0_, int[] is) {
		((Class198) this).anInt2362 = 444123689 * i;
		((Class198) this).anInt2361 = i_0_ * -1083005641;
		((Class198) this).anIntArray2363 = is;
	}

	public int method43() {
		return ((Class198) this).anInt2362 * 545157657;
	}

	public int method42() {
		return ((Class198) this).anInt2362 * 545157657;
	}

	public int method41() {
		return 1799102599 * ((Class198) this).anInt2361;
	}

	public int method45() {
		return ((Class198) this).anInt2362 * 545157657;
	}

	Class198(int i, int i_1_) {
		this(i, i_1_, new int[i_1_ * i]);
	}

	public void method38() {
		/* empty */
	}

	public int method40() {
		return 1799102599 * ((Class198) this).anInt2361;
	}

	public int method44() {
		return 1799102599 * ((Class198) this).anInt2361;
	}

	static final void method2973(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_2_, (short) 7065);
		Class83 class83 = Class534.aClass83Array5975[i_2_ >> 16];
		Class291.method3945(class73, class83, class441, (byte) 0);
	}

	static final void method2974(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStackPtr -= 1019967701;
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		String string = (String) (((Cs2Executor) class441).objectStack[((Cs2Executor) class441).objectStackPtr * 1628307581]);
		boolean bool = 1 == (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		boolean bool_3_ = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]) == 1);
		boolean bool_4_ = ((((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]) == 1);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3790, client.aClass195_8632.aClass650_2340, 972186972);
		class572_sub25.aRsByteBuffer.writeShort(ObjectDefinitions.method6069(string, -1881681846) + 1, -2031641973);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -24);
		int i_5_ = 0;
		if (bool)
			i_5_ |= 0x1;
		if (bool_3_)
			i_5_ |= 0x2;
		if (bool_4_)
			i_5_ |= 0x4;
		class572_sub25.aRsByteBuffer.writeByte(i_5_, -1384395473);
		client.aClass195_8632.method2929(class572_sub25, (byte) -38);
	}

	static int[] method2975(Class572_Sub25 class572_sub25, int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(518);
		int[] is = new int[4];
		for (int i_6_ = 0; i_6_ < 4; i_6_++)
			is[i_6_] = (int) (Math.random() * 9.9999999E7);
		class572_sub15.writeByte(10, -1384395473);
		class572_sub15.writeInt(is[0], -1743753997);
		class572_sub15.writeInt(is[1], -1743753997);
		class572_sub15.writeInt(is[2], -1743753997);
		class572_sub15.writeInt(is[3], -1743753997);
		for (int i_7_ = 0; i_7_ < 10; i_7_++)
			class572_sub15.writeInt((int) (Math.random() * 9.9999999E7), -1743753997);
		class572_sub15.writeShort((int) (Math.random() * 9.9999999E7), -1818900537);
		class572_sub15.method8537(Class18.LOGIN_PUBLIC_EXPONENT, Class18.LOGIN_MODULUS, 1815134304);
		class572_sub25.aRsByteBuffer.writeBytes(class572_sub15.b, 0, -1585139053 * class572_sub15.o, (byte) 31);
		return is;
	}

	public static void method2976(int i) {
		Class122.aShort1490 = client.aShort8853;
		Class70.aShort708 = client.aShort8693;
		Class122.aShort1491 = client.aShort8851;
		Class134.aShort1568 = client.aShort8852;
		Class122.aBool1489 = true;
		Class122.anInt1492 = Class344.audio.method938(-2137998111) * -1725537827;
		if (0 != -84129397 * Class122.anInt1488 && Class122.anInt1484 * -249822281 != 0) {
			client.aShort8851 = (short) 334;
			client.aShort8852 = (short) 334;
			client.aShort8693 = client.aShort8853 = (short) (Class122.anInt1488 * -124578304 / (Class122.anInt1484 * -249822281));
		}
	}

	public static final void method2977(long l) {
		if (l > 0L) {
			if (l % 10L == 0L) {
				Class276.method3714(l - 1L);
				Class276.method3714(1L);
			} else
				Class276.method3714(l);
		}
	}
}

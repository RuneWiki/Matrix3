package game;

/* Class286 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class286 {
	Class232[] aClass232Array3420;

	Class286(RSByteBuffer class572_sub15, BigInteger biginteger, BigInteger biginteger_0_) {
		class572_sub15.o = 1551968775;
		int i = class572_sub15.readUnsignedByte(2082786068);
		class572_sub15.o += i * -938303376;
		byte[] is = new byte[(class572_sub15.b.length - -1585139053 * class572_sub15.o)];
		class572_sub15.readBytes(is, 0, is.length, 1244997677);
		byte[] is_1_;
		if (null == biginteger || null == biginteger_0_)
			is_1_ = is;
		else {
			BigInteger biginteger_2_ = new BigInteger(is);
			BigInteger biginteger_3_ = biginteger_2_.modPow(biginteger, biginteger_0_);
			is_1_ = biginteger_3_.toByteArray();
		}
		//if (65 != is_1_.length)
		//    throw new RuntimeException();
		byte[] is_4_ = (Entity.method10573(class572_sub15.b, 5, class572_sub15.o * -1585139053 - is.length - 5, 2119101551));
		for (int i_5_ = 0; i_5_ < 64; i_5_++) {
			// if (is_4_[i_5_] != is_1_[i_5_ + 1])
			//throw new RuntimeException();
		}
		((Class286) this).aClass232Array3420 = new Class232[i];
		for (int i_6_ = 0; i_6_ < i; i_6_++) {
			class572_sub15.o = i_6_ * -938303376 + 1862362530;
			int i_7_ = class572_sub15.readInt(492834304);
			int i_8_ = class572_sub15.readInt(-306274325);
			int i_9_ = class572_sub15.readInt(801149931);
			int i_10_ = class572_sub15.readInt(2056823674);
			byte[] is_11_ = new byte[64];
			class572_sub15.readBytes(is_11_, 0, 64, 1400317015);
			((Class286) this).aClass232Array3420[i_6_] = new Class232(i_7_, i_9_, i_8_, i_10_, is_11_);
		}
	}

	public static int method3860(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (1 == (i_16_ & 0x1)) {
			int i_18_ = i_14_;
			i_14_ = i_15_;
			i_15_ = i_18_;
		}
		i_13_ &= 0x3;
		if (i_13_ == 0)
			return i;
		if (1 == i_13_)
			return i_12_;
		if (i_13_ == 2)
			return 7 - i - (i_14_ - 1);
		return 7 - i_12_ - (i_15_ - 1);
	}

	public static void method3861(Class106 class106, long l) {
		class106.method2018();
		Class520.aLinkedList5808.clear();
		Class520.aLinkedList5789.clear();
		Class520.aLong5801 = (((long) (Class520.anInt5795 * 520122695) + l) * -201621344568384217L);
	}

	static final void method3862(InterfaceDefinitions class73, int i, int i_19_, int i_20_, Cs2Executor class441, int i_21_) {
		if (class73.anIntArray749 == null)
			throw new RuntimeException();
		class73.anIntArray749[i] = i_19_;
		class73.anIntArray841[i] = i_20_;
	}

	static final void method3863(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -672558609 * client.anInt8616;
	}

	static final void method3864(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (client.anInt8576 * -847550693 == ((Cs2Executor) class441).entity.method10541(1598068064)) ? 1 : 0;
	}

	public static void method3865(int[] is, int[] is_22_, int i) {
		if (null == is || is_22_ == null) {
			Class639_Sub5.anIntArray9531 = null;
			Class448.anIntArray5164 = null;
			Class130.aByteArrayArrayArray1533 = null;
		} else {
			Class639_Sub5.anIntArray9531 = is;
			Class448.anIntArray5164 = new int[is.length];
			Class130.aByteArrayArrayArray1533 = new byte[is.length][][];
			for (int i_23_ = 0; i_23_ < Class639_Sub5.anIntArray9531.length; i_23_++)
				Class130.aByteArrayArrayArray1533[i_23_] = new byte[is_22_[i_23_]][];
		}
	}

	public static Object method3866(byte[] is, boolean bool, short i) {
		if (is == null)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	static final void method3867(Cs2Executor class441, int i) {
		throw new RuntimeException("");
	}

	static final void method3868(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -409952002) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray888 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	public static final void method3869(byte i) {
		int i_24_ = Class213.aClass572_Sub24_2463.aClass665_Sub1_9201.method8101(-1058952626);
		if (i_24_ == 0) {
			client.aClass613_8605.method7326(null, -954026962);
			Class125.method2210(0, (byte) 48);
		} else if (1 == i_24_) {
			Class179_Sub1.method9992((byte) 0, 1542380020);
			Class125.method2210(512, (byte) 95);
			if (client.aClass613_8605.method7285(1912655402) != null)
				Class496.method5922(-1084794575);
		} else {
			Class179_Sub1.method9992((byte) (client.anInt8699 * 2074321681 - 4 & 0xff), -844132442);
			Class125.method2210(2, (byte) -61);
		}
		client.anInt8714 = Class274.anInt2911 * -1906118887;
	}
}

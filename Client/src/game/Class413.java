package game;

/* Class413 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class413 {
	public static Class413 aClass413_4910 = new Class413(0, false);
	public int anInt4911;
	static Class413 aClass413_4912;
	static Class413 aClass413_4913;
	static Class413 aClass413_4914;
	public static Class413 aClass413_4915 = new Class413(1, false);
	boolean aBool4916;
	public static Class248 aClass248_4917;

	static {
		aClass413_4912 = new Class413(2, true);
		aClass413_4913 = new Class413(3, true);
		aClass413_4914 = new Class413(4, true);
	}

	public boolean method5077(int i) {
		return ((Class413) this).aBool4916;
	}

	public boolean method5078() {
		return ((Class413) this).aBool4916;
	}

	Class413(int i, boolean bool) {
		anInt4911 = -1504924467 * i;
		((Class413) this).aBool4916 = bool;
	}

	public boolean method5079() {
		return ((Class413) this).aBool4916;
	}

	static final void method5080(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		if (i_0_ == 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else if (i_1_ == 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 2147483647;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (int) Math.pow((double) i_0_, 1.0 / (double) i_1_);
	}

	static final void method5081(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class654.method7709(1619140790);
		if (class572_sub12_sub5 != null) {
			boolean bool = class572_sub12_sub5.method10290(i_2_ >> 28 & 0x3, i_2_ >> 14 & 0x3fff, i_2_ & 0x3fff, Class439.anIntArray5086, (byte) 1);
			if (bool)
				Class259.method3562(Class439.anIntArray5086[1], Class439.anIntArray5086[2], (short) 1010);
		}
	}

	public static byte[] method5082(Object object, int i, int i_3_, int i_4_) {
		if (object == null)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i + i_3_);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_3_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_3_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static String method5083(String string, int i) {
		StringBuilder stringbuilder = new StringBuilder();
		int i_5_ = string.length();
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			char c = string.charAt(i_6_);
			if (37 == c && i_5_ > i_6_ + 2) {
				c = string.charAt(1 + i_6_);
				boolean bool = false;
				int i_7_;
				if (c >= 48 && c <= 57)
					i_7_ = c - 48;
				else if (c >= 97 && c <= 102)
					i_7_ = c + 10 - 97;
				else if (c >= 65 && c <= 70)
					i_7_ = 10 + c - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				i_7_ *= 16;
				int i_8_ = string.charAt(2 + i_6_);
				if (i_8_ >= 48 && i_8_ <= 57)
					i_7_ += i_8_ - 48;
				else if (i_8_ >= 97 && i_8_ <= 102)
					i_7_ += 10 + i_8_ - 97;
				else if (i_8_ >= 65 && i_8_ <= 70)
					i_7_ += i_8_ + 10 - 65;
				else {
					stringbuilder.append('%');
					continue;
				}
				if (0 != i_7_ && Class259.method3560((byte) i_7_, 1630816032))
					stringbuilder.append(Class118.method2157((byte) i_7_, 1948041825));
				i_6_ += 2;
			} else if (c == 43)
				stringbuilder.append(' ');
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	static Class648[] getIDXReferences(int i) {
		return (new Class648[] { Class648.aClass648_8333, Class648.aClass648_8341, Class648.aClass648_8344, Class648.aClass648_8355, Class648.aClass648_8338, Class648.idx40Reference,
			Class648.idx41reference, Class648.aClass648_8347, Class648.aClass648_8350, Class648.aClass648_8335, Class648.aClass648_8343, Class648.aClass648_8361, Class648.aClass648_8348,
			Class648.idx17Reference, Class648.aClass648_8328, Class648.aClass648_8356, Class648.aClass648_8354, Class648.aClass648_8346, Class648.aClass648_8340, Class648.aClass648_8349,
			Class648.aClass648_8331, Class648.idx14Reference, Class648.aClass648_8351, Class648.aClass648_8332, Class648.aClass648_8327, Class648.aClass648_8334, Class648.aClass648_8352,
			Class648.aClass648_8330, Class648.aClass648_8357, Class648.aClass648_8364, Class648.aClass648_8353, Class648.aClass648_8342, Class648.aClass648_8336, Class648.idx23reference,
			Class648.aClass648_8345, Class648.aClass648_8329 });
	}
}

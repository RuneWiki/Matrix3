package game;

/* Class572_Sub12_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub14 extends Class572_Sub12 {
	public int[] anIntArray11463;
	public String aString11464;
	public char[] aCharArray11465;
	public int[] anIntArray11466;
	public char[] aCharArray11467;

	void method10410(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(479385823);
			if (0 == i_0_)
				break;
			method10411(class572_sub15, i_0_, (byte) -41);
		}
	}

	void method10411(RSByteBuffer class572_sub15, int i, byte i_1_) {
		do {
			if (1 == i)
				aString11464 = class572_sub15.readString(1295706626);
			else if (i == 2) {
				int i_2_ = class572_sub15.readUnsignedByte(25560535);
				anIntArray11466 = new int[i_2_];
				aCharArray11465 = new char[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					anIntArray11466[i_3_] = class572_sub15.readUnsignedShort(647518597);
					byte i_4_ = class572_sub15.readByte(1692984897);
					aCharArray11465[i_3_] = i_4_ == 0 ? '\0' : Class118.method2157(i_4_, 2011440308);
				}
			} else if (i == 3) {
				int i_5_ = class572_sub15.readUnsignedByte(614865757);
				anIntArray11463 = new int[i_5_];
				aCharArray11467 = new char[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					anIntArray11463[i_6_] = class572_sub15.readUnsignedShort(647518597);
					byte i_7_ = class572_sub15.readByte(1156922223);
					aCharArray11467[i_6_] = 0 == i_7_ ? '\0' : Class118.method2157(i_7_, 1967083237);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	public int method10412(char c, int i) {
		if (anIntArray11466 == null)
			return -1;
		for (int i_8_ = 0; i_8_ < anIntArray11466.length; i_8_++) {
			if (aCharArray11465[i_8_] == c)
				return anIntArray11466[i_8_];
		}
		return -1;
	}

	public int method10413(char c, int i) {
		if (null == anIntArray11463)
			return -1;
		for (int i_9_ = 0; i_9_ < anIntArray11463.length; i_9_++) {
			if (c == aCharArray11467[i_9_])
				return anIntArray11463[i_9_];
		}
		return -1;
	}

	void method10414(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1502864814);
			if (0 == i)
				break;
			method10411(class572_sub15, i, (byte) -65);
		}
	}

	void method10415(short i) {
		if (anIntArray11463 != null) {
			for (int i_10_ = 0; i_10_ < anIntArray11463.length; i_10_++)
				anIntArray11463[i_10_] |= 0x8000;
		}
		if (anIntArray11466 != null) {
			for (int i_11_ = 0; i_11_ < anIntArray11466.length; i_11_++)
				anIntArray11466[i_11_] |= 0x8000;
		}
	}

	void method10416(RSByteBuffer class572_sub15, int i) {
		do {
			if (1 == i)
				aString11464 = class572_sub15.readString(1295706626);
			else if (i == 2) {
				int i_12_ = class572_sub15.readUnsignedByte(1718265631);
				anIntArray11466 = new int[i_12_];
				aCharArray11465 = new char[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					anIntArray11466[i_13_] = class572_sub15.readUnsignedShort(647518597);
					byte i_14_ = class572_sub15.readByte(1757064240);
					aCharArray11465[i_13_] = i_14_ == 0 ? '\0' : Class118.method2157(i_14_, 1705701861);
				}
			} else if (i == 3) {
				int i_15_ = class572_sub15.readUnsignedByte(437975299);
				anIntArray11463 = new int[i_15_];
				aCharArray11467 = new char[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
					anIntArray11463[i_16_] = class572_sub15.readUnsignedShort(647518597);
					byte i_17_ = class572_sub15.readByte(1810239090);
					aCharArray11467[i_16_] = 0 == i_17_ ? '\0' : Class118.method2157(i_17_, 1991102489);
				}
			} else if (i == 4)
				break;
		} while (false);
	}

	Class572_Sub12_Sub14() {
		/* empty */
	}

	void method10417() {
		if (anIntArray11463 != null) {
			for (int i = 0; i < anIntArray11463.length; i++)
				anIntArray11463[i] |= 0x8000;
		}
		if (anIntArray11466 != null) {
			for (int i = 0; i < anIntArray11466.length; i++)
				anIntArray11466[i] |= 0x8000;
		}
	}

	void method10418() {
		if (anIntArray11463 != null) {
			for (int i = 0; i < anIntArray11463.length; i++)
				anIntArray11463[i] |= 0x8000;
		}
		if (anIntArray11466 != null) {
			for (int i = 0; i < anIntArray11466.length; i++)
				anIntArray11466[i] |= 0x8000;
		}
	}
}

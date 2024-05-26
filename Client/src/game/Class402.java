package game;

/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public abstract class Class402 {
	int anInt4745;
	int anInt4746;
	Class419 this$0;

	abstract void method4777(Graphics graphics);

	abstract void method4778(Graphics graphics, int i);

	Class402(Class419 class419, int i, int i_0_) {
		((Class402) this).this$0 = class419;
		((Class402) this).anInt4746 = i * -1522135369;
		((Class402) this).anInt4745 = -1999195015 * i_0_;
	}

	abstract void method4779(Graphics graphics);

	abstract void method4780(Graphics graphics);

	static boolean method4781(Class572_Sub15_Sub2 class572_sub15_sub2, int i, byte i_1_) {
		int i_2_ = class572_sub15_sub2.readBits(2, -1809904620);
		if (0 == i_2_) {
			if (class572_sub15_sub2.readBits(1, -1809904620) != 0)
				method4781(class572_sub15_sub2, i, (byte) 60);
			int i_3_ = class572_sub15_sub2.readBits(6, -1809904620);
			int i_4_ = class572_sub15_sub2.readBits(6, -1809904620);
			boolean bool = class572_sub15_sub2.readBits(1, -1809904620) == 1;
			if (bool)
				Class184.anIntArray2156[(Class184.anInt2164 += 1500331991) * -1531501593 - 1] = i;
			if (null != client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i])
				throw new RuntimeException();
			Class6 class6 = Class184.aClass6Array2166[i];
			Player class456_sub1_sub2_sub3_sub2 = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i] = (new Player(client.aClass613_8605.method7285(1306595070))));
			class456_sub1_sub2_sub3_sub2.anInt11633 = i * 2118180903;
			if (null != Class184.aClass572_Sub15Array2157[i])
				class456_sub1_sub2_sub3_sub2.decodePlayerAppearance(Class184.aClass572_Sub15Array2157[i], (byte) 16);
			if (null != Class184.aClass572_Sub15Array2158[i])
				class456_sub1_sub2_sub3_sub2.decodeHeadIcons(Class184.aClass572_Sub15Array2158[i], 1130515724);
			class456_sub1_sub2_sub3_sub2.method10516((-1004274433 * (((Class6) class6).anInt34)), true, 648650492);
			class456_sub1_sub2_sub3_sub2.anInt11619 = ((Class6) class6).anInt36 * -273499951;
			int i_5_ = 1878196793 * ((Class6) class6).anInt33;
			int i_6_ = i_5_ >> 28;
			int i_7_ = i_5_ >> 14 & 0xff;
			int i_8_ = i_5_ & 0xff;
			Class497 class497 = client.aClass613_8605.method7280((byte) -49);
			int i_9_ = (i_7_ << 6) + i_3_ - -2109597897 * class497.localX;
			int i_10_ = i_4_ + (i_8_ << 6) - 417324155 * class497.localY;
			class456_sub1_sub2_sub3_sub2.aClass47_11837 = ((Class6) class6).aClass47_35;
			class456_sub1_sub2_sub3_sub2.isClanMember = ((Class6) class6).aBool32;
			class456_sub1_sub2_sub3_sub2.aByteArray11661[0] = Class184.aByteArray2159[i];
			class456_sub1_sub2_sub3_sub2.aByte9009 = class456_sub1_sub2_sub3_sub2.aByte9008 = (byte) i_6_;
			if (client.aClass613_8605.method7287((byte) 81).method3689(i_9_, i_10_, -2095709279))
				class456_sub1_sub2_sub3_sub2.aByte9008++;
			class456_sub1_sub2_sub3_sub2.method10699(i_9_, i_10_, (byte) 81);
			Class184.aClass6Array2166[i] = null;
			return true;
		}
		if (1 == i_2_) {
			int i_11_ = class572_sub15_sub2.readBits(2, -1809904620);
			int i_12_ = ((Class6) Class184.aClass6Array2166[i]).anInt33 * 1878196793;
			((Class6) Class184.aClass6Array2166[i]).anInt33 = (((i_11_ + (i_12_ >> 28) & 0x3) << 28) + (i_12_ & 0xfffffff)) * -634631159;
			return false;
		}
		if (2 == i_2_) {
			int i_13_ = class572_sub15_sub2.readBits(5, -1809904620);
			int i_14_ = i_13_ >> 3 & 0x3;
			int i_15_ = i_13_ & 0x7;
			int i_16_ = 1878196793 * ((Class6) Class184.aClass6Array2166[i]).anInt33;
			if (!Class184.$assertionsDisabled && (Class184.aByteArray2159[i] < 0 || Class184.aByteArray2159[i] > 3))
				throw new AssertionError();
			int i_17_ = i_14_ + (i_16_ >> 28) & 0x3;
			int i_18_ = i_16_ >> 14 & 0xff;
			int i_19_ = i_16_ & 0xff;
			if (0 == i_15_) {
				i_18_--;
				i_19_--;
			}
			if (i_15_ == 1)
				i_19_--;
			if (2 == i_15_) {
				i_18_++;
				i_19_--;
			}
			if (i_15_ == 3)
				i_18_--;
			if (i_15_ == 4)
				i_18_++;
			if (5 == i_15_) {
				i_18_--;
				i_19_++;
			}
			if (6 == i_15_)
				i_19_++;
			if (i_15_ == 7) {
				i_18_++;
				i_19_++;
			}
			Class455.method5387(Class404.method4797(1787726779), Class184.aByteArray2159[i], -2115478836);
			((Class6) Class184.aClass6Array2166[i]).anInt33 = -634631159 * (i_19_ + ((i_18_ << 14) + (i_17_ << 28)));
			return false;
		}
		int i_20_ = class572_sub15_sub2.readBits(20, -1809904620);
		int i_21_ = i_20_ >> 18 & 0x3;
		int i_22_ = i_20_ >> 16 & 0x3;
		int i_23_ = i_20_ >> 8 & 0xff;
		int i_24_ = i_20_ & 0xff;
		int i_25_ = ((Class6) Class184.aClass6Array2166[i]).anInt33 * 1878196793;
		Class184.aByteArray2159[i] = (byte) (i_21_ - 1);
		if (!Class184.$assertionsDisabled && (Class184.aByteArray2159[i] < 0 || Class184.aByteArray2159[i] > 3))
			throw new AssertionError();
		int i_26_ = i_22_ + (i_25_ >> 28) & 0x3;
		int i_27_ = i_23_ + (i_25_ >> 14) & 0xff;
		int i_28_ = i_25_ + i_24_ & 0xff;
		Class455.method5387(Class404.method4797(1949821456), i_21_ - 1, -1996709127);
		((Class6) Class184.aClass6Array2166[i]).anInt33 = -634631159 * (i_28_ + ((i_27_ << 14) + (i_26_ << 28)));
		return false;
	}

	public static Class413 method4782(int i, int i_29_) {
		if (Class413.aClass413_4910.anInt4911 * -1232920571 == i)
			return Class413.aClass413_4910;
		if (i == Class413.aClass413_4915.anInt4911 * -1232920571)
			return Class413.aClass413_4915;
		if (-1232920571 * Class413.aClass413_4912.anInt4911 == i)
			return Class413.aClass413_4912;
		if (i == Class413.aClass413_4913.anInt4911 * -1232920571)
			return Class413.aClass413_4913;
		if (i == -1232920571 * Class413.aClass413_4914.anInt4911)
			return Class413.aClass413_4914;
		return null;
	}
}

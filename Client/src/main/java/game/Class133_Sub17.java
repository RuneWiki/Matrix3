package game;

/* Class133_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub17 extends Class133 {
	int anInt10203;
	int anInt10204;
	int anInt10205;
	int anInt10206;
	int anInt10207;

	public void method2309() {
		Class122.aClass130Array1483[((Class133_Sub17) this).anInt10205 * 510000603].method2274(((Class133_Sub17) this).anInt10204 * -237765473, ((Class133_Sub17) this).anInt10203 * 1430377093, -2051353587 * ((Class133_Sub17) this).anInt10206, ((Class133_Sub17) this).anInt10207 * -1124899991, -2081539231);
	}

	Class133_Sub17(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub17) this).anInt10205 = class572_sub15.readUnsignedShort(647518597) * -638601645;
		int i = class572_sub15.readInt(1754404249);
		((Class133_Sub17) this).anInt10204 = (i >>> 16) * -226353313;
		((Class133_Sub17) this).anInt10203 = 486495821 * (i & 0xffff);
		((Class133_Sub17) this).anInt10206 = class572_sub15.readUnsignedByte(2098381989) * 546806469;
		((Class133_Sub17) this).anInt10207 = class572_sub15.readSmart(16777215) * 1784634585;
	}

	public void method2303(int i) {
		Class122.aClass130Array1483[((Class133_Sub17) this).anInt10205 * 510000603].method2274(((Class133_Sub17) this).anInt10204 * -237765473, ((Class133_Sub17) this).anInt10203 * 1430377093, -2051353587 * ((Class133_Sub17) this).anInt10206, ((Class133_Sub17) this).anInt10207 * -1124899991, -2147095567);
	}

	public static String method9500(String string, byte i) {
		int i_0_ = string.length();
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			char c = string.charAt(i_2_);
			if ('<' == c || c == '>')
				i_1_ += 3;
		}
		StringBuilder stringbuilder = new StringBuilder(i_1_ + i_0_);
		for (int i_3_ = 0; i_3_ < i_0_; i_3_++) {
			char c = string.charAt(i_3_);
			if (c == '<')
				stringbuilder.append("<lt>");
			else if (c == '>')
				stringbuilder.append("<gt>");
			else
				stringbuilder.append(c);
		}
		return stringbuilder.toString();
	}

	static final void method9501(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
	}
}

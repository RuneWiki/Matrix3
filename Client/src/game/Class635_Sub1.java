package game;

/* Class635_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class635_Sub1 extends Class635 {
	public Class635_Sub1(Class437 class437, Class435 class435, Class248 class248, boolean bool) {
		super(class437, class435, JS5ConfigGroup.aClass220_2589, class248, new Class644(Class572_Sub12_Sub2.class), bool);
	}

	static String method8889(RSByteBuffer class572_sub15, int i, int i_0_) {
		String string;
		try {
			int i_1_ = class572_sub15.readUnsignedSmart(1416517616);
			if (i_1_ > i)
				i_1_ = i;
			byte[] is = new byte[i_1_];
			class572_sub15.o += (InputStream_Sub1.aClass387_9533.method4688(class572_sub15.b, -1585139053 * class572_sub15.o, is, 0, i_1_, 674858726)) * 310393755;
			String string_2_ = Class658.method7757(is, 0, i_1_, 1677168670);
			string = string_2_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}

	static void method8890(int i, byte i_3_) {
		Class193.aClass127_2322.method2235(i, 1323165438);
	}
}

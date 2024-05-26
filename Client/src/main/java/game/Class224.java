package game;

/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class224 {
	Class224() {
		/* empty */
	}

	abstract Class254 method3136(int i);

	abstract byte[] method3137(int i, byte i_0_);

	abstract void method3138(int i, int i_1_);

	abstract void method3139(int i);

	abstract Class254 method3140();

	abstract int method3141(int i);

	abstract Class254 method3142();

	abstract int method3143(int i, short i_2_);

	abstract Class254 method3144();

	abstract byte[] method3145(int i);

	abstract void method3146(int i);

	abstract Class254 method3147();

	abstract int method3148(int i);

	abstract Class254 method3149();

	static Cs2Script method3150(Class530 class530, int i, int i_3_, int i_4_) {
		int i_5_ = class530.anInt5927 * 2137884431 | i << 10;
		Cs2Script class572_sub12_sub8 = ((Cs2Script) Class477.aClass131_5333.method2283((long) i_5_ << 16));
		if (null != class572_sub12_sub8)
			return class572_sub12_sub8;
		byte[] is = (Class438.aClass248_5080.method3373(Class438.aClass248_5080.method3382(i_5_, 1870894503), (byte) -44));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class572_sub12_sub8 = MusicVolume.method2202(is, (byte) -127);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class572_sub12_sub8.aClass530_11388 = class530;
			Class477.aClass131_5333.method2284(class572_sub12_sub8, (long) i_5_ << 16);
			return class572_sub12_sub8;
		}
		i_5_ = 2137884431 * class530.anInt5927 | i_3_ + 65536 << 10;
		class572_sub12_sub8 = ((Cs2Script) Class477.aClass131_5333.method2283((long) i_5_ << 16));
		if (null != class572_sub12_sub8)
			return class572_sub12_sub8;
		is = (Class438.aClass248_5080.method3373(Class438.aClass248_5080.method3382(i_5_, -1814084252), (byte) -9));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class572_sub12_sub8 = MusicVolume.method2202(is, (byte) -126);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class572_sub12_sub8.aClass530_11388 = class530;
			Class477.aClass131_5333.method2284(class572_sub12_sub8, (long) i_5_ << 16);
			return class572_sub12_sub8;
		}
		i_5_ = class530.anInt5927 * 2137884431 | 0x3fffc00;
		class572_sub12_sub8 = ((Cs2Script) Class477.aClass131_5333.method2283((long) i_5_ << 16));
		if (null != class572_sub12_sub8)
			return class572_sub12_sub8;
		is = (Class438.aClass248_5080.method3373(Class438.aClass248_5080.method3382(i_5_, -357634611), (byte) -35));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class572_sub12_sub8 = MusicVolume.method2202(is, (byte) -82);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_5_).toString());
			}
			class572_sub12_sub8.aClass530_11388 = class530;
			Class477.aClass131_5333.method2284(class572_sub12_sub8, (long) i_5_ << 16);
			return class572_sub12_sub8;
		}
		return null;
	}
}

package game;

/* Class593 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class593 {
	public static void method7019(boolean bool) {
		Class344.audio.method920((short) -4266);
		if (Class435.method5266(client.anInt8580 * 835742603, (byte) -69)) {
			Class195[] class195s = client.aClass195Array8592;
			for (int i = 0; i < class195s.length; i++) {
				Class195 class195 = class195s[i];
				class195.anInt2337 += 394568993;
				if (class195.anInt2337 * -1242489119 < 50 && !bool)
					return;
				class195.anInt2337 = 0;
				if (!class195.aBool2344 && class195.method2933(-2054309879) != null) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, class195.aClass650_2340, -805635239);
					class195.method2929(class572_sub25, (byte) -89);
					try {
						class195.method2936((byte) 88);
					} catch (IOException ioexception) {
						class195.aBool2344 = true;
					}
				}
			}
			Class344.audio.method920((short) -20718);
		}
	}

	Class593() throws Throwable {
		throw new Error();
	}

	static final int method7020(int i, int i_0_) {
		int i_1_ = i & 0x3f;
		int i_2_ = i >> 6 & 0x3;
		if (18 == i_1_) {
			if (0 == i_2_)
				return 1;
			if (i_2_ == 1)
				return 2;
			if (2 == i_2_)
				return 4;
			if (i_2_ == 3)
				return 8;
		} else if (19 == i_1_ || i_1_ == 21) {
			if (0 == i_2_)
				return 16;
			if (1 == i_2_)
				return 32;
			if (2 == i_2_)
				return 64;
			if (3 == i_2_)
				return 128;
		}
		return 0;
	}

	public static Class655 method7021(byte i) {
		if (null == Class16.aClass655_133)
			return Class655.aClass655_8413;
		return Class16.aClass655_133;
	}

	public static Class261 method7022(int i) {
		Class261 class261 = new Class261();
		class261.method3571(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		float f = (float) (0.5 + 0.5 * Math.random()) * 256.0F;
		class261.method3580(f - 128.0F, 0.0F, 0.0F);
		class261.method3576(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793 * 2.0));
		return class261;
	}
}

package game;

/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class307 implements Interface36 {
	Class248 aClass248_3546;
	Class127 aClass127_3547 = new Class127(64);
	static MapSize aClass94_3548;
	public static int anInt3549;

	public Class307(Class248 class248) {
		((Class307) this).aClass248_3546 = class248;
	}

	public synchronized Class308 method210(int i) {
		Class308 class308 = (Class308) ((Class307) this).aClass127_3547.method2246((long) i);
		if (null != class308)
			return class308;
		byte[] is = ((Class307) this).aClass248_3546.getFile(0, i, -1941034163);
		class308 = new Class308();
		if (null != is)
			class308.method4024(new RSByteBuffer(is), 999479229);
		class308.method4021(-991321466);
		((Class307) this).aClass127_3547.method2229(class308, (long) i);
		return class308;
	}

	public void method4017(int i) {
		((Class307) this).aClass127_3547.method2231((byte) -111);
	}

	public synchronized Class308 method211(int i, byte i_0_) {
		Class308 class308 = (Class308) ((Class307) this).aClass127_3547.method2246((long) i);
		if (null != class308)
			return class308;
		byte[] is = ((Class307) this).aClass248_3546.getFile(0, i, -1080787752);
		class308 = new Class308();
		if (null != is)
			class308.method4024(new RSByteBuffer(is), 1317623696);
		class308.method4021(-1567140869);
		((Class307) this).aClass127_3547.method2229(class308, (long) i);
		return class308;
	}

	static final void method4018(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int[] is = Class665_Sub11.method8207(string, class441, 138882340);
		if (null != is)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray876 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.anIntArray921 = is;
		class73.aBool857 = true;
	}

	public static float method4019(float f, float f_1_, int i) {
		double d = Math.atan2((double) f, (double) f_1_);
		if (d < 0.0)
			d = 3.141592653589793 + (3.141592653589793 + d);
		return (float) d;
	}

	static String method4020(byte[] is, int i, int i_2_, int i_3_) {
		StringBuilder stringbuilder = new StringBuilder();
		for (int i_4_ = i; i_4_ < i + i_2_; i_4_ += 3) {
			int i_5_ = is[i_4_] & 0xff;
			stringbuilder.append(Class449.aCharArray5168[i_5_ >>> 2]);
			if (i_4_ < i_2_ - 1) {
				int i_6_ = is[1 + i_4_] & 0xff;
				stringbuilder.append(Class449.aCharArray5168[(i_5_ & 0x3) << 4 | i_6_ >>> 4]);
				if (i_4_ < i_2_ - 2) {
					int i_7_ = is[2 + i_4_] & 0xff;
					stringbuilder.append(Class449.aCharArray5168[(i_6_ & 0xf) << 2 | i_7_ >>> 6]).append(Class449.aCharArray5168[i_7_ & 0x3f]);
				} else
					stringbuilder.append(Class449.aCharArray5168[(i_6_ & 0xf) << 2]).append('=');
			} else
				stringbuilder.append(Class449.aCharArray5168[(i_5_ & 0x3) << 4]).append('=').append('=');
		}
		return stringbuilder.toString();
	}
}

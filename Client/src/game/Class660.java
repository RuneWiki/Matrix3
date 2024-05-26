package game;

/* Class660 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class660 {
	Class660() throws Throwable {
		throw new Error();
	}

	public static byte[] method7773(byte[] is) {
		if (is == null)
			return null;
		byte[] is_0_ = new byte[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}

	public static byte[] method7774(byte[] is) {
		if (is == null)
			return null;
		byte[] is_1_ = new byte[is.length];
		System.arraycopy(is, 0, is_1_, 0, is.length);
		return is_1_;
	}

	public static byte[] method7775(byte[] is) {
		if (is == null)
			return null;
		byte[] is_2_ = new byte[is.length];
		System.arraycopy(is, 0, is_2_, 0, is.length);
		return is_2_;
	}

	static final void method7776(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		Class565.aShortArray6361[(((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr * 1369304407)])] = (short) Class665_Sub32.method9159((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr) * 1369304407 + 1)]), -1662966131);
		Class672.aClass639_Sub5_8533.method8901(100559738);
		Class672.aClass639_Sub5_8533.method8903(-139461998);
		Class197.aClass639_Sub15_2360.method8959(375860658);
		Class54.method987((byte) 80);
	}

	static void method7777(int i) {
		if (Class520.aClass161_5817 == null || (Class520.aClass161_5817.method2587() != Class520.aTwitchWebcamFrameData5807.width) || (Class520.aClass161_5817.method2588() != Class520.aTwitchWebcamFrameData5807.height))
			Class520.aClass161_5817 = (Class272_Sub2.aClass106_9517.method1960(Class520.aTwitchWebcamFrameData5807.buffer, 0, Class520.aTwitchWebcamFrameData5807.width, Class520.aTwitchWebcamFrameData5807.width, Class520.aTwitchWebcamFrameData5807.height, false));
		else
			Class520.aClass161_5817.method2591(0, 0, Class520.aTwitchWebcamFrameData5807.width, Class520.aTwitchWebcamFrameData5807.height, Class520.aTwitchWebcamFrameData5807.buffer, 0, Class520.aTwitchWebcamFrameData5807.width);
	}
}

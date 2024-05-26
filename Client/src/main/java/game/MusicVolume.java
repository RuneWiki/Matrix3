package game;

/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

class MusicVolume implements Interface31 {
	Class54 this$0;

	public float method153() {
		return ((float) Class213.aClass572_Sub24_2463.musicVolume.method8970(660014728) / 255.0F);
	}

	//music volume
	public float method152(byte i) {
		return ((float) Class213.aClass572_Sub24_2463.musicVolume.method8970(660014728) / 255.0F);
	}

	MusicVolume(Class54 class54) {
		((MusicVolume) this).this$0 = class54;
	}

	public static Interface58 method2200(Class248 class248, int i, Interface59 interface59, boolean bool, Class127 class127, int i_0_) {
		if (Class465.aClass289_5235 != null) {
			if (bool)
				return new Class483(class248, i, Class465.aClass289_5235, interface59);
			return new Class496(class248, i, Class465.aClass289_5235, interface59, class127);
		}
		return null;
	}

	public static byte[] method2201(Object object, boolean bool, int i) {
		if (object == null)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	static Cs2Script method2202(byte[] is, byte i) {
		return new Cs2Script(new RSByteBuffer(is), Class185.anInterface15_2171);
	}
}

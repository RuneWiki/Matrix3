package game;

/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class206 {
	Inflater anInflater2418;

	public byte[] method3024(byte[] is) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		class572_sub15.o = 310393755 * (is.length - 4);
		int i = class572_sub15.method8512((byte) 12);
		byte[] is_0_ = new byte[i];
		class572_sub15.o = 0;
		method3028(class572_sub15, is_0_, (byte) -13);
		return is_0_;
	}

	public Class206() {
		this(-1, 1000000, 1000000);
	}

	public byte[] method3025(byte[] is, int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		class572_sub15.o = 310393755 * (is.length - 4);
		int i_1_ = class572_sub15.method8512((byte) 71);
		byte[] is_2_ = new byte[i_1_];
		class572_sub15.o = 0;
		method3028(class572_sub15, is_2_, (byte) -56);
		return is_2_;
	}

	Class206(int i, int i_3_, int i_4_) {
		/* empty */
	}

	public byte[] method3026(byte[] is) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		class572_sub15.o = 310393755 * (is.length - 4);
		int i = class572_sub15.method8512((byte) 25);
		byte[] is_5_ = new byte[i];
		class572_sub15.o = 0;
		method3028(class572_sub15, is_5_, (byte) -24);
		return is_5_;
	}

	public byte[] method3027(byte[] is) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		class572_sub15.o = 310393755 * (is.length - 4);
		int i = class572_sub15.method8512((byte) 2);
		byte[] is_6_ = new byte[i];
		class572_sub15.o = 0;
		method3028(class572_sub15, is_6_, (byte) -48);
		return is_6_;
	}

	public void method3028(RSByteBuffer class572_sub15, byte[] is, byte i) {
		if ((class572_sub15.b[-1585139053 * class572_sub15.o]) != 31 || (class572_sub15.b[class572_sub15.o * -1585139053 + 1]) != -117)
			throw new RuntimeException("");
		if (null == ((Class206) this).anInflater2418)
			((Class206) this).anInflater2418 = new Inflater(true);
		try {
			((Class206) this).anInflater2418.setInput(class572_sub15.b, 10 + -1585139053 * class572_sub15.o, (class572_sub15.b.length - (8 + (10 + -1585139053 * class572_sub15.o))));
			((Class206) this).anInflater2418.inflate(is);
		} catch (Exception exception) {
			((Class206) this).anInflater2418.reset();
			throw new RuntimeException("");
		}
		((Class206) this).anInflater2418.reset();
	}
}

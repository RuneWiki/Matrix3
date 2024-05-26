package game;

/* Class572_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

public class Class572_Sub15_Sub1 extends RSByteBuffer {
	Class572_Sub15_Sub1(int i) {
		super(i);
	}

	void method10298(float f) {
		int i = Stream.floatToRawIntBits(f);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
	}

	void method10299(float f) {
		int i = Stream.floatToRawIntBits(f);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 24);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 16);
		b[(o += 310393755) * -1585139053 - 1] = (byte) (i >> 8);
		b[(o += 310393755) * -1585139053 - 1] = (byte) i;
	}
}

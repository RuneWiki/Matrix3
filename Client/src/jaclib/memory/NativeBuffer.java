/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private int anInt4643 = 127731757;
	private long aLong4644;

	protected NativeBuffer() {
		/* empty */
	}

	public final int method42() {
		return anInt4643 * -211978149;
	}

	public final long method64() {
		return 8734911963862674343L * aLong4644;
	}

	public void method100(byte[] is, int i, int i_0_, int i_1_) {
		if (0L == 8734911963862674343L * aLong4644 | null == is | i < 0 | i_1_ + i > is.length | i_0_ < 0 | i_1_ + i_0_ > anInt4643 * -211978149)
			throw new RuntimeException();
		put(8734911963862674343L * aLong4644, is, i, i_0_, i_1_);
	}

	private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	private final native void put(long l, byte[] is, int i, int i_4_, int i_5_);

	public final int method45() {
		return anInt4643 * -211978149;
	}

	public final int method43() {
		return anInt4643 * -211978149;
	}

	public final long method101() {
		return 8734911963862674343L * aLong4644;
	}

	public void method102(byte[] is, int i, int i_6_, int i_7_) {
		if (0L == 8734911963862674343L * aLong4644 | null == is | i < 0 | i_7_ + i > is.length | i_6_ < 0 | i_7_ + i_6_ > anInt4643 * -211978149)
			throw new RuntimeException();
		put(8734911963862674343L * aLong4644, is, i, i_6_, i_7_);
	}
}

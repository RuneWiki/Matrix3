/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public final class Stream {
	private Buffer aBuffer2125;
	private int anInt2126;
	private int anInt2127;
	private int anInt2128;
	private byte[] aByteArray2129;
	private static boolean aBool2130 = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	private Stream(int i) {
		aByteArray2129 = new byte[i];
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.method42());
	}

	private Stream(Buffer buffer, int i, int i_0_) {
		this(buffer.method42() < 4096 ? buffer.method42() : 4096);
		method2797(buffer, i, i_0_);
	}

	private void method2797(Buffer buffer, int i, int i_1_) {
		method2803();
		aBuffer2125 = buffer;
		anInt2127 = i * 98662031;
		anInt2126 = (i + i_1_) * -590063847;
		if (anInt2126 * -1782508247 > buffer.method42())
			throw new RuntimeException();
	}

	public int method2798() {
		return anInt2128 * -724584619 + -1451956113 * anInt2127;
	}

	public void method2799(int i) {
		method2803();
		anInt2127 = 98662031 * i;
	}

	public void method2800(int i) {
		if (anInt2128 * -724584619 >= aByteArray2129.length)
			method2803();
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) i;
	}

	public void method2801(float f) {
		if (-724584619 * anInt2128 + 3 >= aByteArray2129.length)
			method2803();
		int i = floatToRawIntBits(f);
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) (i >> 24);
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) (i >> 16);
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) (i >> 8);
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) i;
	}

	public void method2802(float f) {
		if (anInt2128 * -724584619 + 3 >= aByteArray2129.length)
			method2803();
		int i = floatToRawIntBits(f);
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) i;
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) (i >> 8);
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) (i >> 16);
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) (i >> 24);
	}

	public void method2803() {
		if (anInt2128 * -724584619 > 0) {
			if (anInt2127 * -1451956113 + -724584619 * anInt2128 > -1782508247 * anInt2126)
				throw new RuntimeException();
			aBuffer2125.method100(aByteArray2129, 0, anInt2127 * -1451956113, anInt2128 * -724584619);
			anInt2127 += anInt2128 * 1765643899;
			anInt2128 = 0;
		}
	}

	public static final boolean method2804() {
		return aBool2130;
	}

	public static native int floatToRawIntBits(float f);

	private static final native byte getLSB(int i);

	public int method2805() {
		return anInt2128 * -724584619 + -1451956113 * anInt2127;
	}

	public int method2806() {
		return anInt2128 * -724584619 + -1451956113 * anInt2127;
	}

	public void method2807(int i) {
		if (anInt2128 * -724584619 >= aByteArray2129.length)
			method2803();
		aByteArray2129[(anInt2128 += -1882812931) * -724584619 - 1] = (byte) i;
	}

	public void method2808() {
		if (anInt2128 * -724584619 > 0) {
			if (anInt2127 * -1451956113 + -724584619 * anInt2128 > -1782508247 * anInt2126)
				throw new RuntimeException();
			aBuffer2125.method100(aByteArray2129, 0, anInt2127 * -1451956113, anInt2128 * -724584619);
			anInt2127 += anInt2128 * 1765643899;
			anInt2128 = 0;
		}
	}

	public void method2809() {
		if (anInt2128 * -724584619 > 0) {
			if (anInt2127 * -1451956113 + -724584619 * anInt2128 > -1782508247 * anInt2126)
				throw new RuntimeException();
			aBuffer2125.method100(aByteArray2129, 0, anInt2127 * -1451956113, anInt2128 * -724584619);
			anInt2127 += anInt2128 * 1765643899;
			anInt2128 = 0;
		}
	}

	public static final boolean method2810() {
		return aBool2130;
	}

	public static final boolean method2811() {
		return aBool2130;
	}

	public static final boolean method2812() {
		return aBool2130;
	}

	public static final boolean method2813() {
		return aBool2130;
	}
}

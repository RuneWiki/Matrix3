/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private int anInt686;
	public NativeHeap aNativeHeap687;
	private int anInt688;
	private boolean aBool689 = true;

	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_0_) {
		aNativeHeap687 = nativeheap;
		anInt688 = 100224455 * i;
		anInt686 = i_0_ * -1461809723;
	}

	private final synchronized boolean method1037() {
		return aNativeHeap687.method771() && aBool689;
	}

	public final long method64() {
		return aNativeHeap687.getBufferAddress(anInt688 * -644979721);
	}

	public final int method42() {
		return anInt686 * -1339463411;
	}

	public final synchronized void method100(byte[] is, int i, int i_1_, int i_2_) {
		if (!method1037() | null == is | i < 0 | i_2_ + i > is.length | i_1_ < 0 | i_1_ + i_2_ > -1339463411 * anInt686)
			throw new RuntimeException();
		aNativeHeap687.put(-644979721 * anInt688, is, i, i_1_, i_2_);
	}

	public final synchronized void method1038() {
		if (method1037())
			aNativeHeap687.deallocateBuffer(anInt688 * -644979721);
		aBool689 = false;
	}

	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		method1038();
	}

	protected final synchronized void method1039() throws Throwable {
		super.finalize();
		method1038();
	}

	public final int method45() {
		return anInt686 * -1339463411;
	}

	public final int method43() {
		return anInt686 * -1339463411;
	}

	public final long method101() {
		return aNativeHeap687.getBufferAddress(anInt688 * -644979721);
	}

	public final synchronized void method102(byte[] is, int i, int i_3_, int i_4_) {
		if (!method1037() | null == is | i < 0 | i_4_ + i > is.length | i_3_ < 0 | i_3_ + i_4_ > -1339463411 * anInt686)
			throw new RuntimeException();
		aNativeHeap687.put(-644979721 * anInt688, is, i, i_3_, i_4_);
	}

	private final synchronized boolean method1040() {
		return aNativeHeap687.method771() && aBool689;
	}

	private final synchronized boolean method1041() {
		return aNativeHeap687.method771() && aBool689;
	}

	private final synchronized boolean method1042() {
		return aNativeHeap687.method771() && aBool689;
	}

	private final synchronized boolean method1043() {
		return aNativeHeap687.method771() && aBool689;
	}

	private final synchronized boolean method1044() {
		return aNativeHeap687.method771() && aBool689;
	}

	public final synchronized void method1045() {
		if (method1037())
			aNativeHeap687.deallocateBuffer(anInt688 * -644979721);
		aBool689 = false;
	}

	public final synchronized void method1046() {
		if (method1037())
			aNativeHeap687.deallocateBuffer(anInt688 * -644979721);
		aBool689 = false;
	}

	public final synchronized void method1047() {
		if (method1037())
			aNativeHeap687.deallocateBuffer(anInt688 * -644979721);
		aBool689 = false;
	}
}

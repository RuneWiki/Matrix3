/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public final class NativeHeap {
	long peer;
	private int anInt380;
	private boolean aBool381;

	public NativeHeap(int i) {
		anInt380 = -72975279 * i;
		allocateHeap(anInt380 * -767800143);
		aBool381 = true;
	}

	synchronized boolean method771() {
		return aBool381;
	}

	public NativeHeapBuffer method772(int i, boolean bool) {
		if (!aBool381)
			throw new IllegalStateException();
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}

	public synchronized void method773() {
		if (aBool381)
			deallocateHeap();
		aBool381 = false;
	}

	private native void allocateHeap(int i);

	private native void deallocateHeap();

	synchronized native int allocateBuffer(int i, boolean bool);

	synchronized native long getBufferAddress(int i);

	synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

	synchronized native void put(int i, byte[] is, int i_3_, int i_4_, int i_5_);

	synchronized native void deallocateBuffer(int i);

	public synchronized native void copy(long l, long l_6_, int i);

	protected synchronized void finalize() throws Throwable {
		super.finalize();
		method773();
	}

	protected synchronized void method774() throws Throwable {
		super.finalize();
		method773();
	}

	synchronized boolean method775() {
		return aBool381;
	}

	public synchronized void method776() {
		if (aBool381)
			deallocateHeap();
		aBool381 = false;
	}

	public synchronized void method777() {
		if (aBool381)
			deallocateHeap();
		aBool381 = false;
	}
}

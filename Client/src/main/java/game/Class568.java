package game;

/* Class568 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class Class568 implements Runnable {
	byte[] aByteArray6381;
	IOException anIOException6382;
	int anInt6383;
	InputStream anInputStream6384;
	int anInt6385 = 0;
	int anInt6386 = 0;
	Thread aThread6387;
	static int anInt6388;

	void method6725() {
		((Class568) this).anInputStream6384 = new InputStream_Sub1();
	}

	public void run() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (((Class568) this).anIOException6382 != null)
						return;
					if (((Class568) this).anInt6385 * -1255417121 == 0)
						i = (-1852681403 * ((Class568) this).anInt6383 - ((Class568) this).anInt6386 * 988480457 - 1);
					else if (-1255417121 * ((Class568) this).anInt6385 <= ((Class568) this).anInt6386 * 988480457)
						i = (-1852681403 * ((Class568) this).anInt6383 - 988480457 * ((Class568) this).anInt6386);
					else
						i = (((Class568) this).anInt6385 * -1255417121 - 988480457 * ((Class568) this).anInt6386 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_0_;
			try {
				i_0_ = (((Class568) this).anInputStream6384.read(((Class568) this).aByteArray6381, 988480457 * ((Class568) this).anInt6386, i));
				if (i_0_ == -1)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class568) this).anIOException6382 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class568) this).anInt6386 = (594577017 * ((((Class568) this).anInt6386 * 988480457 + i_0_) % (((Class568) this).anInt6383 * -1852681403)));
			}
		}
	}

	boolean method6726(int i, byte i_1_) throws IOException {
		if (i <= 0 || i >= -1852681403 * ((Class568) this).anInt6383)
			throw new IOException();
		synchronized (this) {
			int i_2_;
			if (-1255417121 * ((Class568) this).anInt6385 <= 988480457 * ((Class568) this).anInt6386)
				i_2_ = (988480457 * ((Class568) this).anInt6386 - -1255417121 * ((Class568) this).anInt6385);
			else
				i_2_ = (((Class568) this).anInt6383 * -1852681403 - ((Class568) this).anInt6385 * -1255417121 + 988480457 * ((Class568) this).anInt6386);
			if (i_2_ < i) {
				if (null != ((Class568) this).anIOException6382)
					throw new IOException(((Class568) this).anIOException6382.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	int method6727(int i) throws IOException {
		synchronized (this) {
			int i_3_;
			if (((Class568) this).anInt6385 * -1255417121 <= ((Class568) this).anInt6386 * 988480457)
				i_3_ = (988480457 * ((Class568) this).anInt6386 - -1255417121 * ((Class568) this).anInt6385);
			else
				i_3_ = (988480457 * ((Class568) this).anInt6386 + (((Class568) this).anInt6383 * -1852681403 - -1255417121 * ((Class568) this).anInt6385));
			if (((Class568) this).anIOException6382 != null)
				throw new IOException(((Class568) this).anIOException6382.toString());
			this.notifyAll();
			int i_4_ = i_3_;
			return i_4_;
		}
	}

	int method6728(byte[] is, int i, int i_5_) throws IOException {
		if (i_5_ < 0 || i < 0 || i_5_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_6_;
			if (((Class568) this).anInt6385 * -1255417121 <= ((Class568) this).anInt6386 * 988480457)
				i_6_ = (988480457 * ((Class568) this).anInt6386 - ((Class568) this).anInt6385 * -1255417121);
			else
				i_6_ = (988480457 * ((Class568) this).anInt6386 + (((Class568) this).anInt6383 * -1852681403 - ((Class568) this).anInt6385 * -1255417121));
			if (i_5_ > i_6_)
				i_5_ = i_6_;
			if (i_5_ == 0 && ((Class568) this).anIOException6382 != null)
				throw new IOException(((Class568) this).anIOException6382.toString());
			if (i_5_ + -1255417121 * ((Class568) this).anInt6385 <= -1852681403 * ((Class568) this).anInt6383)
				System.arraycopy(((Class568) this).aByteArray6381, ((Class568) this).anInt6385 * -1255417121, is, i, i_5_);
			else {
				int i_7_ = (-1852681403 * ((Class568) this).anInt6383 - ((Class568) this).anInt6385 * -1255417121);
				System.arraycopy(((Class568) this).aByteArray6381, -1255417121 * ((Class568) this).anInt6385, is, i, i_7_);
				System.arraycopy(((Class568) this).aByteArray6381, 0, is, i_7_ + i, i_5_ - i_7_);
			}
			((Class568) this).anInt6385 = ((i_5_ + ((Class568) this).anInt6385 * -1255417121) % (-1852681403 * ((Class568) this).anInt6383) * 1216241951);
			this.notifyAll();
			int i_8_ = i_5_;
			return i_8_;
		}
	}

	void method6729(int i) {
		synchronized (this) {
			if (((Class568) this).anIOException6382 == null)
				((Class568) this).anIOException6382 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class568) this).aThread6387.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6730(int i) {
		((Class568) this).anInputStream6384 = new InputStream_Sub1();
	}

	int method6731(byte[] is, int i, int i_9_) throws IOException {
		if (i_9_ < 0 || i < 0 || i_9_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_10_;
			if (((Class568) this).anInt6385 * -1255417121 <= ((Class568) this).anInt6386 * 988480457)
				i_10_ = (988480457 * ((Class568) this).anInt6386 - ((Class568) this).anInt6385 * -1255417121);
			else
				i_10_ = (988480457 * ((Class568) this).anInt6386 + (((Class568) this).anInt6383 * -1852681403 - ((Class568) this).anInt6385 * -1255417121));
			if (i_9_ > i_10_)
				i_9_ = i_10_;
			if (i_9_ == 0 && ((Class568) this).anIOException6382 != null)
				throw new IOException(((Class568) this).anIOException6382.toString());
			if (i_9_ + -1255417121 * ((Class568) this).anInt6385 <= -1852681403 * ((Class568) this).anInt6383)
				System.arraycopy(((Class568) this).aByteArray6381, ((Class568) this).anInt6385 * -1255417121, is, i, i_9_);
			else {
				int i_11_ = (-1852681403 * ((Class568) this).anInt6383 - ((Class568) this).anInt6385 * -1255417121);
				System.arraycopy(((Class568) this).aByteArray6381, -1255417121 * ((Class568) this).anInt6385, is, i, i_11_);
				System.arraycopy(((Class568) this).aByteArray6381, 0, is, i_11_ + i, i_9_ - i_11_);
			}
			((Class568) this).anInt6385 = ((i_9_ + ((Class568) this).anInt6385 * -1255417121) % (-1852681403 * ((Class568) this).anInt6383) * 1216241951);
			this.notifyAll();
			int i_12_ = i_9_;
			return i_12_;
		}
	}

	boolean method6732(int i) throws IOException {
		if (i <= 0 || i >= -1852681403 * ((Class568) this).anInt6383)
			throw new IOException();
		synchronized (this) {
			int i_13_;
			if (-1255417121 * ((Class568) this).anInt6385 <= 988480457 * ((Class568) this).anInt6386)
				i_13_ = (988480457 * ((Class568) this).anInt6386 - -1255417121 * ((Class568) this).anInt6385);
			else
				i_13_ = (((Class568) this).anInt6383 * -1852681403 - ((Class568) this).anInt6385 * -1255417121 + 988480457 * ((Class568) this).anInt6386);
			if (i_13_ < i) {
				if (null != ((Class568) this).anIOException6382)
					throw new IOException(((Class568) this).anIOException6382.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	boolean method6733(int i) throws IOException {
		if (i <= 0 || i >= -1852681403 * ((Class568) this).anInt6383)
			throw new IOException();
		synchronized (this) {
			int i_14_;
			if (-1255417121 * ((Class568) this).anInt6385 <= 988480457 * ((Class568) this).anInt6386)
				i_14_ = (988480457 * ((Class568) this).anInt6386 - -1255417121 * ((Class568) this).anInt6385);
			else
				i_14_ = (((Class568) this).anInt6383 * -1852681403 - ((Class568) this).anInt6385 * -1255417121 + 988480457 * ((Class568) this).anInt6386);
			if (i_14_ < i) {
				if (null != ((Class568) this).anIOException6382)
					throw new IOException(((Class568) this).anIOException6382.toString());
				this.notifyAll();
				boolean bool = false;
				return bool;
			}
			boolean bool = true;
			return bool;
		}
	}

	int method6734() throws IOException {
		synchronized (this) {
			int i;
			if (((Class568) this).anInt6385 * -1255417121 <= ((Class568) this).anInt6386 * 988480457)
				i = (988480457 * ((Class568) this).anInt6386 - -1255417121 * ((Class568) this).anInt6385);
			else
				i = (988480457 * ((Class568) this).anInt6386 + (((Class568) this).anInt6383 * -1852681403 - -1255417121 * ((Class568) this).anInt6385));
			if (((Class568) this).anIOException6382 != null)
				throw new IOException(((Class568) this).anIOException6382.toString());
			this.notifyAll();
			int i_15_ = i;
			return i_15_;
		}
	}

	int method6735() throws IOException {
		synchronized (this) {
			int i;
			if (((Class568) this).anInt6385 * -1255417121 <= ((Class568) this).anInt6386 * 988480457)
				i = (988480457 * ((Class568) this).anInt6386 - -1255417121 * ((Class568) this).anInt6385);
			else
				i = (988480457 * ((Class568) this).anInt6386 + (((Class568) this).anInt6383 * -1852681403 - -1255417121 * ((Class568) this).anInt6385));
			if (((Class568) this).anIOException6382 != null)
				throw new IOException(((Class568) this).anIOException6382.toString());
			this.notifyAll();
			int i_16_ = i;
			return i_16_;
		}
	}

	Class568(InputStream inputstream, int i) {
		((Class568) this).anInputStream6384 = inputstream;
		((Class568) this).anInt6383 = -183482483 * (1 + i);
		((Class568) this).aByteArray6381 = new byte[((Class568) this).anInt6383 * -1852681403];
		((Class568) this).aThread6387 = new Thread(this);
		((Class568) this).aThread6387.setDaemon(true);
		((Class568) this).aThread6387.start();
	}

	void method6736() {
		synchronized (this) {
			if (((Class568) this).anIOException6382 == null)
				((Class568) this).anIOException6382 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class568) this).aThread6387.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void method6737() {
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (((Class568) this).anIOException6382 != null)
						return;
					if (((Class568) this).anInt6385 * -1255417121 == 0)
						i = (-1852681403 * ((Class568) this).anInt6383 - ((Class568) this).anInt6386 * 988480457 - 1);
					else if (-1255417121 * ((Class568) this).anInt6385 <= ((Class568) this).anInt6386 * 988480457)
						i = (-1852681403 * ((Class568) this).anInt6383 - 988480457 * ((Class568) this).anInt6386);
					else
						i = (((Class568) this).anInt6385 * -1255417121 - 988480457 * ((Class568) this).anInt6386 - 1);
					if (i > 0)
						break;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			int i_17_;
			try {
				i_17_ = (((Class568) this).anInputStream6384.read(((Class568) this).aByteArray6381, 988480457 * ((Class568) this).anInt6386, i));
				if (i_17_ == -1)
					throw new EOFException();
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class568) this).anIOException6382 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class568) this).anInt6386 = (594577017 * ((((Class568) this).anInt6386 * 988480457 + i_17_) % (((Class568) this).anInt6383 * -1852681403)));
			}
		}
	}

	int method6738(byte[] is, int i, int i_18_) throws IOException {
		if (i_18_ < 0 || i < 0 || i_18_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_19_;
			if (((Class568) this).anInt6385 * -1255417121 <= ((Class568) this).anInt6386 * 988480457)
				i_19_ = (988480457 * ((Class568) this).anInt6386 - ((Class568) this).anInt6385 * -1255417121);
			else
				i_19_ = (988480457 * ((Class568) this).anInt6386 + (((Class568) this).anInt6383 * -1852681403 - ((Class568) this).anInt6385 * -1255417121));
			if (i_18_ > i_19_)
				i_18_ = i_19_;
			if (i_18_ == 0 && ((Class568) this).anIOException6382 != null)
				throw new IOException(((Class568) this).anIOException6382.toString());
			if (i_18_ + -1255417121 * ((Class568) this).anInt6385 <= -1852681403 * ((Class568) this).anInt6383)
				System.arraycopy(((Class568) this).aByteArray6381, ((Class568) this).anInt6385 * -1255417121, is, i, i_18_);
			else {
				int i_20_ = (-1852681403 * ((Class568) this).anInt6383 - ((Class568) this).anInt6385 * -1255417121);
				System.arraycopy(((Class568) this).aByteArray6381, -1255417121 * ((Class568) this).anInt6385, is, i, i_20_);
				System.arraycopy(((Class568) this).aByteArray6381, 0, is, i_20_ + i, i_18_ - i_20_);
			}
			((Class568) this).anInt6385 = ((i_18_ + ((Class568) this).anInt6385 * -1255417121) % (-1852681403 * ((Class568) this).anInt6383) * 1216241951);
			this.notifyAll();
			int i_21_ = i_18_;
			return i_21_;
		}
	}

	void method6739() {
		synchronized (this) {
			if (((Class568) this).anIOException6382 == null)
				((Class568) this).anIOException6382 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class568) this).aThread6387.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6740() {
		synchronized (this) {
			if (((Class568) this).anIOException6382 == null)
				((Class568) this).anIOException6382 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class568) this).aThread6387.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6741() {
		synchronized (this) {
			if (((Class568) this).anIOException6382 == null)
				((Class568) this).anIOException6382 = new IOException("");
			this.notifyAll();
		}
		try {
			((Class568) this).aThread6387.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6742() {
		((Class568) this).anInputStream6384 = new InputStream_Sub1();
	}

	int method6743(byte[] is, int i, int i_22_, byte i_23_) throws IOException {
		if (i_22_ < 0 || i < 0 || i_22_ + i > is.length)
			throw new IOException();
		synchronized (this) {
			int i_24_;
			if (((Class568) this).anInt6385 * -1255417121 <= ((Class568) this).anInt6386 * 988480457)
				i_24_ = (988480457 * ((Class568) this).anInt6386 - ((Class568) this).anInt6385 * -1255417121);
			else
				i_24_ = (988480457 * ((Class568) this).anInt6386 + (((Class568) this).anInt6383 * -1852681403 - ((Class568) this).anInt6385 * -1255417121));
			if (i_22_ > i_24_)
				i_22_ = i_24_;
			if (i_22_ == 0 && ((Class568) this).anIOException6382 != null)
				throw new IOException(((Class568) this).anIOException6382.toString());
			if (i_22_ + -1255417121 * ((Class568) this).anInt6385 <= -1852681403 * ((Class568) this).anInt6383)
				System.arraycopy(((Class568) this).aByteArray6381, ((Class568) this).anInt6385 * -1255417121, is, i, i_22_);
			else {
				int i_25_ = (-1852681403 * ((Class568) this).anInt6383 - ((Class568) this).anInt6385 * -1255417121);
				System.arraycopy(((Class568) this).aByteArray6381, -1255417121 * ((Class568) this).anInt6385, is, i, i_25_);
				System.arraycopy(((Class568) this).aByteArray6381, 0, is, i_25_ + i, i_22_ - i_25_);
			}
			((Class568) this).anInt6385 = ((i_22_ + ((Class568) this).anInt6385 * -1255417121) % (-1852681403 * ((Class568) this).anInt6383) * 1216241951);
			this.notifyAll();
			int i_26_ = i_22_;
			return i_26_;
		}
	}

	void method6744() {
		((Class568) this).anInputStream6384 = new InputStream_Sub1();
	}

	void method6745() {
		((Class568) this).anInputStream6384 = new InputStream_Sub1();
	}

	void method6746() {
		((Class568) this).anInputStream6384 = new InputStream_Sub1();
	}

	static final void method6747(Cs2Executor class441, int i) {
		int i_27_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_27_, (short) -3043);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (1 == class73.anInt892 * -22820201 ? class73.anInt803 * -1063203465 : -1);
	}

	static final void method6748(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_28_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_29_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_29_, 1204575737));
		if (class264.method3614(1783094145))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = ((Class572_Sub12_Sub2) Class531.aClass635_Sub1_5932.getDefinition(i_28_, 1069937722)).method10227(i_29_, class264.aString2833, 526861992);
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (((Class572_Sub12_Sub2) Class531.aClass635_Sub1_5932.getDefinition(i_28_, -1972739674)).method10226(i_29_, -1132777561 * class264.anInt2832, (short) 896));
	}

	static final void method6749(Cs2Executor class441, int i) {
		int i_30_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (client.anInt8861 * 1472719885 != 0 && i_30_ < client.anInt8865 * 351572371) {
			Class23 class23 = client.aClass23Array8650[i_30_];
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class23.aString153;
			if (class23.aString152 != null)
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = class23.aString152;
			else
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = "";
		} else {
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		}
	}

	static final void method6750(Class572_Sub29 class572_sub29, int i, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_) {
		if (Class569.method6760(i, null, -1465216974)) {
			if (class572_sub29 != null && !class572_sub29.method8641(-1873512146))
				Class96.method1554(class572_sub29, true, false, 451662773);
			else {
				Class83 class83 = Class534.aClass83Array5975[i];
				client.method7991(class83, class83.method1257(-2021020454), -1, i_31_, i_32_, i_33_, i_34_, i_35_, i_36_, i_37_, i_38_);
			}
		}
	}
}

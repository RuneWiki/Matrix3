package game;

/* Class561 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class Class561 implements Runnable {
	int anInt6349;
	boolean aBool6350;
	Thread aThread6351;
	OutputStream anOutputStream6352;
	int anInt6353 = 0;
	int anInt6354 = 0;
	IOException anIOException6355;
	byte[] aByteArray6356;

	void method6619(byte[] is, int i, int i_0_) throws IOException {
		if (i_0_ < 0 || i < 0 || i + i_0_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (null != ((Class561) this).anIOException6355)
				throw new IOException(((Class561) this).anIOException6355.toString());
			int i_1_;
			if (((Class561) this).anInt6353 * 1024985123 <= -13416873 * ((Class561) this).anInt6354)
				i_1_ = (317421711 * ((Class561) this).anInt6349 - -13416873 * ((Class561) this).anInt6354 + 1024985123 * ((Class561) this).anInt6353 - 1);
			else
				i_1_ = (1024985123 * ((Class561) this).anInt6353 - ((Class561) this).anInt6354 * -13416873 - 1);
			if (i_1_ < i_0_)
				throw new IOException("");
			if (-13416873 * ((Class561) this).anInt6354 + i_0_ <= ((Class561) this).anInt6349 * 317421711)
				System.arraycopy(is, i, ((Class561) this).aByteArray6356, -13416873 * ((Class561) this).anInt6354, i_0_);
			else {
				int i_2_ = (317421711 * ((Class561) this).anInt6349 - -13416873 * ((Class561) this).anInt6354);
				System.arraycopy(is, i, ((Class561) this).aByteArray6356, ((Class561) this).anInt6354 * -13416873, i_2_);
				System.arraycopy(is, i + i_2_, ((Class561) this).aByteArray6356, 0, i_0_ - i_2_);
			}
			((Class561) this).anInt6354 = -124189337 * ((i_0_ + -13416873 * ((Class561) this).anInt6354) % (((Class561) this).anInt6349 * 317421711));
			this.notifyAll();
		}
	}

	boolean method6620(short i) {
		if (((Class561) this).aBool6350) {
			try {
				((Class561) this).anOutputStream6352.close();
				if (((Class561) this).anIOException6355 == null)
					((Class561) this).anIOException6355 = new IOException("");
			} catch (IOException ioexception) {
				if (((Class561) this).anIOException6355 == null)
					((Class561) this).anIOException6355 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	public void method6621() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (((Class561) this).anIOException6355 != null)
						return;
					if (1024985123 * ((Class561) this).anInt6353 <= ((Class561) this).anInt6354 * -13416873)
						i = (((Class561) this).anInt6354 * -13416873 - ((Class561) this).anInt6353 * 1024985123);
					else
						i = (((Class561) this).anInt6354 * -13416873 + (317421711 * ((Class561) this).anInt6349 - 1024985123 * ((Class561) this).anInt6353));
					if (i > 0)
						break;
					try {
						((Class561) this).anOutputStream6352.flush();
					} catch (IOException ioexception) {
						((Class561) this).anIOException6355 = ioexception;
						return;
					}
					if (method6620((short) -14722))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (1024985123 * ((Class561) this).anInt6353 + i <= 317421711 * ((Class561) this).anInt6349)
					((Class561) this).anOutputStream6352.write(((Class561) this).aByteArray6356, 1024985123 * ((Class561) this).anInt6353, i);
				else {
					int i_3_ = (((Class561) this).anInt6349 * 317421711 - 1024985123 * ((Class561) this).anInt6353);
					((Class561) this).anOutputStream6352.write(((Class561) this).aByteArray6356, ((Class561) this).anInt6353 * 1024985123, i_3_);
					((Class561) this).anOutputStream6352.write(((Class561) this).aByteArray6356, 0, i - i_3_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class561) this).anIOException6355 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class561) this).anInt6353 = (-1531648117 * ((1024985123 * ((Class561) this).anInt6353 + i) % (317421711 * ((Class561) this).anInt6349)));
			}
		} while (!method6620((short) -24117));
	}

	void method6622(byte[] is, int i, int i_4_, int i_5_) throws IOException {
		if (i_4_ < 0 || i < 0 || i + i_4_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (null != ((Class561) this).anIOException6355)
				throw new IOException(((Class561) this).anIOException6355.toString());
			int i_6_;
			if (((Class561) this).anInt6353 * 1024985123 <= -13416873 * ((Class561) this).anInt6354)
				i_6_ = (317421711 * ((Class561) this).anInt6349 - -13416873 * ((Class561) this).anInt6354 + 1024985123 * ((Class561) this).anInt6353 - 1);
			else
				i_6_ = (1024985123 * ((Class561) this).anInt6353 - ((Class561) this).anInt6354 * -13416873 - 1);
			if (i_6_ < i_4_)
				throw new IOException("");
			if (-13416873 * ((Class561) this).anInt6354 + i_4_ <= ((Class561) this).anInt6349 * 317421711)
				System.arraycopy(is, i, ((Class561) this).aByteArray6356, -13416873 * ((Class561) this).anInt6354, i_4_);
			else {
				int i_7_ = (317421711 * ((Class561) this).anInt6349 - -13416873 * ((Class561) this).anInt6354);
				System.arraycopy(is, i, ((Class561) this).aByteArray6356, ((Class561) this).anInt6354 * -13416873, i_7_);
				System.arraycopy(is, i + i_7_, ((Class561) this).aByteArray6356, 0, i_4_ - i_7_);
			}
			((Class561) this).anInt6354 = -124189337 * ((i_4_ + -13416873 * ((Class561) this).anInt6354) % (((Class561) this).anInt6349 * 317421711));
			this.notifyAll();
		}
	}

	void method6623(int i) {
		synchronized (this) {
			((Class561) this).aBool6350 = true;
			this.notifyAll();
		}
		try {
			((Class561) this).aThread6351.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method6624(int i) {
		((Class561) this).anOutputStream6352 = new OutputStream_Sub1();
	}

	Class561(OutputStream outputstream, int i) {
		((Class561) this).anOutputStream6352 = outputstream;
		((Class561) this).anInt6349 = -1582913937 * (i + 1);
		((Class561) this).aByteArray6356 = new byte[((Class561) this).anInt6349 * 317421711];
		((Class561) this).aThread6351 = new Thread(this);
		((Class561) this).aThread6351.setDaemon(true);
		((Class561) this).aThread6351.start();
	}

	boolean method6625() {
		if (((Class561) this).aBool6350) {
			try {
				((Class561) this).anOutputStream6352.close();
				if (((Class561) this).anIOException6355 == null)
					((Class561) this).anIOException6355 = new IOException("");
			} catch (IOException ioexception) {
				if (((Class561) this).anIOException6355 == null)
					((Class561) this).anIOException6355 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	boolean method6626() {
		if (((Class561) this).aBool6350) {
			try {
				((Class561) this).anOutputStream6352.close();
				if (((Class561) this).anIOException6355 == null)
					((Class561) this).anIOException6355 = new IOException("");
			} catch (IOException ioexception) {
				if (((Class561) this).anIOException6355 == null)
					((Class561) this).anIOException6355 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	void method6627(byte[] is, int i, int i_8_) throws IOException {
		if (i_8_ < 0 || i < 0 || i + i_8_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (null != ((Class561) this).anIOException6355)
				throw new IOException(((Class561) this).anIOException6355.toString());
			int i_9_;
			if (((Class561) this).anInt6353 * 1024985123 <= -13416873 * ((Class561) this).anInt6354)
				i_9_ = (317421711 * ((Class561) this).anInt6349 - -13416873 * ((Class561) this).anInt6354 + 1024985123 * ((Class561) this).anInt6353 - 1);
			else
				i_9_ = (1024985123 * ((Class561) this).anInt6353 - ((Class561) this).anInt6354 * -13416873 - 1);
			if (i_9_ < i_8_)
				throw new IOException("");
			if (-13416873 * ((Class561) this).anInt6354 + i_8_ <= ((Class561) this).anInt6349 * 317421711)
				System.arraycopy(is, i, ((Class561) this).aByteArray6356, -13416873 * ((Class561) this).anInt6354, i_8_);
			else {
				int i_10_ = (317421711 * ((Class561) this).anInt6349 - -13416873 * ((Class561) this).anInt6354);
				System.arraycopy(is, i, ((Class561) this).aByteArray6356, ((Class561) this).anInt6354 * -13416873, i_10_);
				System.arraycopy(is, i + i_10_, ((Class561) this).aByteArray6356, 0, i_8_ - i_10_);
			}
			((Class561) this).anInt6354 = -124189337 * ((i_8_ + -13416873 * ((Class561) this).anInt6354) % (((Class561) this).anInt6349 * 317421711));
			this.notifyAll();
		}
	}

	void method6628() {
		((Class561) this).anOutputStream6352 = new OutputStream_Sub1();
	}

	void method6629() {
		synchronized (this) {
			((Class561) this).aBool6350 = true;
			this.notifyAll();
		}
		try {
			((Class561) this).aThread6351.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public void run() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (((Class561) this).anIOException6355 != null)
						return;
					if (1024985123 * ((Class561) this).anInt6353 <= ((Class561) this).anInt6354 * -13416873)
						i = (((Class561) this).anInt6354 * -13416873 - ((Class561) this).anInt6353 * 1024985123);
					else
						i = (((Class561) this).anInt6354 * -13416873 + (317421711 * ((Class561) this).anInt6349 - 1024985123 * ((Class561) this).anInt6353));
					if (i > 0)
						break;
					try {
						((Class561) this).anOutputStream6352.flush();
					} catch (IOException ioexception) {
						((Class561) this).anIOException6355 = ioexception;
						return;
					}
					if (method6620((short) -25275))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (1024985123 * ((Class561) this).anInt6353 + i <= 317421711 * ((Class561) this).anInt6349)
					((Class561) this).anOutputStream6352.write(((Class561) this).aByteArray6356, 1024985123 * ((Class561) this).anInt6353, i);
				else {
					int i_11_ = (((Class561) this).anInt6349 * 317421711 - 1024985123 * ((Class561) this).anInt6353);
					((Class561) this).anOutputStream6352.write(((Class561) this).aByteArray6356, ((Class561) this).anInt6353 * 1024985123, i_11_);
					((Class561) this).anOutputStream6352.write(((Class561) this).aByteArray6356, 0, i - i_11_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class561) this).anIOException6355 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class561) this).anInt6353 = (-1531648117 * ((1024985123 * ((Class561) this).anInt6353 + i) % (317421711 * ((Class561) this).anInt6349)));
			}
		} while (!method6620((short) -7361));
	}

	void method6630() {
		((Class561) this).anOutputStream6352 = new OutputStream_Sub1();
	}

	static void method6631(InterfaceDefinitions class73, Class167 class167, int i, int i_12_, int i_13_, int i_14_, Class161 class161, int i_15_) {
		Class12.method558(class73, class167, i, i_12_, i_13_, i_14_, class161, 100.0, Class39.aClass39_398, Class75.aClass75_942, (byte) -2);
	}

	static final void method6632(Cs2Executor class441, int i) {
		int i_16_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_16_, (short) 3734);
		Class83 class83 = Class534.aClass83Array5975[i_16_ >> 16];
		Class100.method1593(class73, class83, class441, 1591946636);
	}
}

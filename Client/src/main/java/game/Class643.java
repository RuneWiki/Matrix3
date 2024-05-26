package game;

/* Class643 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class Class643 {
	long aLong8298;
	long aLong8299;
	byte[] aByteArray8300;
	long aLong8301 = 7715992254024309849L;
	int anInt8302;
	byte[] aByteArray8303;
	long aLong8304;
	int anInt8305;
	Class649 aClass649_8306;
	long aLong8307 = 5562615674902337347L;
	long aLong8308;
	static final int anInt8309 = 200000000;
	static int anInt8310;

	void method7612(byte i) throws IOException {
		((Class643) this).anInt8302 = 0;
		if (4705366199259519221L * ((Class643) this).aLong8299 != 7244936371031437473L * ((Class643) this).aLong8304) {
			((Class643) this).aClass649_8306.method7670(((Class643) this).aLong8299 * 4705366199259519221L);
			((Class643) this).aLong8304 = 2748185488689087445L * ((Class643) this).aLong8299;
		}
		((Class643) this).aLong8301 = 7830601188356163283L * ((Class643) this).aLong8299;
		int i_0_;
		for (/**/; (((Class643) this).anInt8302 * -1068193677 < ((Class643) this).aByteArray8300.length); ((Class643) this).anInt8302 += 1964653755 * i_0_) {
			int i_1_ = (((Class643) this).aByteArray8300.length - ((Class643) this).anInt8302 * -1068193677);
			if (i_1_ > 200000000)
				i_1_ = 200000000;
			i_0_ = (((Class643) this).aClass649_8306.method7665(((Class643) this).aByteArray8300, ((Class643) this).anInt8302 * -1068193677, i_1_, -1526014884));
			if (i_0_ == -1)
				break;
			((Class643) this).aLong8304 += (long) i_0_ * 6301187073992487777L;
		}
	}

	public void method7613(int i) throws IOException {
		method7621(1301762054);
		((Class643) this).aClass649_8306.method7673(1992663669);
	}

	public void method7614(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		((Class643) this).aLong8299 = 912128040997327709L * l;
	}

	public long method7615(int i) {
		return 4579146535655566637L * ((Class643) this).aLong8308;
	}

	public void method7616(byte[] is, int i) throws IOException {
		method7623(is, 0, is.length, (byte) 64);
	}

	public long method7617() {
		return 4579146535655566637L * ((Class643) this).aLong8308;
	}

	public long method7618() {
		return 4579146535655566637L * ((Class643) this).aLong8308;
	}

	public void method7619(byte[] is, int i, int i_2_, int i_3_) throws IOException {
		do {
			try {
				if ((((Class643) this).aLong8299 * 4705366199259519221L + (long) i_2_) > ((Class643) this).aLong8308 * 4579146535655566637L)
					((Class643) this).aLong8308 = (((Class643) this).aLong8299 * 4705366199259519221L + (long) i_2_) * -1499668600504456539L;
				if (4008607137883361941L * ((Class643) this).aLong8307 != -1L && ((4705366199259519221L * ((Class643) this).aLong8299 < 4008607137883361941L * ((Class643) this).aLong8307) || (((Class643) this).aLong8299 * 4705366199259519221L > ((4008607137883361941L * ((Class643) this).aLong8307) + (long) (((Class643) this).anInt8305 * -1897432181)))))
					method7621(1301762054);
				if (((Class643) this).aLong8307 * 4008607137883361941L != -1L && (((long) i_2_ + 4705366199259519221L * ((Class643) this).aLong8299) > (4008607137883361941L * ((Class643) this).aLong8307 + (long) (((Class643) this).aByteArray8303).length))) {
					int i_4_ = (int) ((long) ((Class643) this).aByteArray8303.length - ((4705366199259519221L * ((Class643) this).aLong8299) - (4008607137883361941L * ((Class643) this).aLong8307)));
					System.arraycopy(is, i, ((Class643) this).aByteArray8303, (int) ((4705366199259519221L * ((Class643) this).aLong8299) - (4008607137883361941L * ((Class643) this).aLong8307)), i_4_);
					((Class643) this).aLong8299 += (long) i_4_ * 912128040997327709L;
					i += i_4_;
					i_2_ -= i_4_;
					((Class643) this).anInt8305 = -377367517 * ((Class643) this).aByteArray8303.length;
					method7621(1301762054);
				}
				if (i_2_ > ((Class643) this).aByteArray8303.length) {
					if (((Class643) this).aLong8304 * 7244936371031437473L != (4705366199259519221L * ((Class643) this).aLong8299)) {
						((Class643) this).aClass649_8306.method7670(4705366199259519221L * ((Class643) this).aLong8299);
						((Class643) this).aLong8304 = (2748185488689087445L * ((Class643) this).aLong8299);
					}
					((Class643) this).aClass649_8306.method7674(is, i, i_2_, 1986844104);
					((Class643) this).aLong8304 += 6301187073992487777L * (long) i_2_;
					if (((Class643) this).aLong8304 * 7244936371031437473L > 3578369531521669225L * ((Class643) this).aLong8298)
						((Class643) this).aLong8298 = (((Class643) this).aLong8304 * -326708480705998983L);
					long l = -1L;
					long l_5_ = -1L;
					if ((((Class643) this).aLong8299 * 4705366199259519221L >= (-2991052988434394089L * ((Class643) this).aLong8301)) && (4705366199259519221L * ((Class643) this).aLong8299 < ((-2991052988434394089L * ((Class643) this).aLong8301) + (long) (-1068193677 * ((Class643) this).anInt8302))))
						l = ((Class643) this).aLong8299 * 4705366199259519221L;
					else if (((((Class643) this).aLong8301 * -2991052988434394089L) >= (((Class643) this).aLong8299 * 4705366199259519221L)) && ((-2991052988434394089L * ((Class643) this).aLong8301) < (long) i_2_ + (((Class643) this).aLong8299 * 4705366199259519221L)))
						l = (((Class643) this).aLong8301 * -2991052988434394089L);
					if ((((long) i_2_ + 4705366199259519221L * ((Class643) this).aLong8299) > -2991052988434394089L * ((Class643) this).aLong8301) && ((long) i_2_ + (4705366199259519221L * ((Class643) this).aLong8299) <= ((-2991052988434394089L * ((Class643) this).aLong8301) + (long) (-1068193677 * ((Class643) this).anInt8302))))
						l_5_ = (long) i_2_ + (4705366199259519221L * ((Class643) this).aLong8299);
					else if ((((-2991052988434394089L * ((Class643) this).aLong8301) + (long) (-1068193677 * ((Class643) this).anInt8302)) > (4705366199259519221L * ((Class643) this).aLong8299)) && (((((Class643) this).aLong8301 * -2991052988434394089L) + (long) (-1068193677 * ((Class643) this).anInt8302)) <= ((long) i_2_ + (4705366199259519221L * ((Class643) this).aLong8299))))
						l_5_ = ((((Class643) this).aLong8301 * -2991052988434394089L) + (long) (((Class643) this).anInt8302 * -1068193677));
					if (l > -1L && l_5_ > l) {
						int i_6_ = (int) (l_5_ - l);
						System.arraycopy(is, (int) (l + (long) i - (4705366199259519221L * (((Class643) this).aLong8299))), ((Class643) this).aByteArray8300, (int) (l - (((Class643) this).aLong8301 * -2991052988434394089L)), i_6_);
					}
					((Class643) this).aLong8299 += (long) i_2_ * 912128040997327709L;
				} else {
					if (i_2_ <= 0)
						break;
					if (-1L == 4008607137883361941L * ((Class643) this).aLong8307)
						((Class643) this).aLong8307 = (-7019920593432677151L * ((Class643) this).aLong8299);
					System.arraycopy(is, i, ((Class643) this).aByteArray8303, (int) ((4705366199259519221L * ((Class643) this).aLong8299) - (4008607137883361941L * ((Class643) this).aLong8307)), i_2_);
					((Class643) this).aLong8299 += (long) i_2_ * 912128040997327709L;
					if ((4705366199259519221L * ((Class643) this).aLong8299 - ((Class643) this).aLong8307 * 4008607137883361941L) > (long) (((Class643) this).anInt8305 * -1897432181))
						((Class643) this).anInt8305 = (int) ((4705366199259519221L * ((Class643) this).aLong8299) - (((Class643) this).aLong8307 * 4008607137883361941L)) * -377367517;
				}
			} catch (IOException ioexception) {
				((Class643) this).aLong8304 = -6301187073992487777L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	public Class643(Class649 class649, int i, int i_7_) throws IOException {
		((Class643) this).anInt8305 = 0;
		((Class643) this).aClass649_8306 = class649;
		((Class643) this).aLong8308 = ((((Class643) this).aLong8298 = class649.method7667(668769978) * 7032863471475685337L) * 7990409516568851885L);
		((Class643) this).aByteArray8300 = new byte[i];
		((Class643) this).aByteArray8303 = new byte[i_7_];
		((Class643) this).aLong8299 = 0L;
	}

	public void method7620() throws IOException {
		method7621(1301762054);
		((Class643) this).aClass649_8306.method7673(1128240082);
	}

	void method7621(int i) throws IOException {
		if (-1L != ((Class643) this).aLong8307 * 4008607137883361941L) {
			if (4008607137883361941L * ((Class643) this).aLong8307 != 7244936371031437473L * ((Class643) this).aLong8304) {
				((Class643) this).aClass649_8306.method7670(((Class643) this).aLong8307 * 4008607137883361941L);
				((Class643) this).aLong8304 = ((Class643) this).aLong8307 * -8206647925369046667L;
			}
			((Class643) this).aClass649_8306.method7674(((Class643) this).aByteArray8303, 0, ((Class643) this).anInt8305 * -1897432181, -1183559899);
			((Class643) this).aLong8304 += 6209752053726101675L * (long) ((Class643) this).anInt8305;
			if (((Class643) this).aLong8304 * 7244936371031437473L > 3578369531521669225L * ((Class643) this).aLong8298)
				((Class643) this).aLong8298 = -326708480705998983L * ((Class643) this).aLong8304;
			long l = -1L;
			long l_8_ = -1L;
			if ((((Class643) this).aLong8307 * 4008607137883361941L >= -2991052988434394089L * ((Class643) this).aLong8301) && (((Class643) this).aLong8307 * 4008607137883361941L < ((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301)))
				l = ((Class643) this).aLong8307 * 4008607137883361941L;
			else if ((((Class643) this).aLong8301 * -2991052988434394089L >= ((Class643) this).aLong8307 * 4008607137883361941L) && (((Class643) this).aLong8301 * -2991052988434394089L < ((long) (((Class643) this).anInt8305 * -1897432181) + (((Class643) this).aLong8307 * 4008607137883361941L))))
				l = ((Class643) this).aLong8301 * -2991052988434394089L;
			if (((((Class643) this).aLong8307 * 4008607137883361941L + (long) (-1897432181 * ((Class643) this).anInt8305)) > ((Class643) this).aLong8301 * -2991052988434394089L) && ((4008607137883361941L * ((Class643) this).aLong8307 + (long) (((Class643) this).anInt8305 * -1897432181)) <= (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302))))
				l_8_ = ((long) (-1897432181 * ((Class643) this).anInt8305) + ((Class643) this).aLong8307 * 4008607137883361941L);
			else if ((((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301) > ((Class643) this).aLong8307 * 4008607137883361941L) && ((-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302)) <= (4008607137883361941L * ((Class643) this).aLong8307 + (long) (-1897432181 * ((Class643) this).anInt8305))))
				l_8_ = (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (((Class643) this).anInt8302 * -1068193677));
			if (l > -1L && l_8_ > l) {
				int i_9_ = (int) (l_8_ - l);
				System.arraycopy(((Class643) this).aByteArray8303, (int) (l - (((Class643) this).aLong8307 * 4008607137883361941L)), ((Class643) this).aByteArray8300, (int) (l - (-2991052988434394089L * ((Class643) this).aLong8301)), i_9_);
			}
			((Class643) this).aLong8307 = 5562615674902337347L;
			((Class643) this).anInt8305 = 0;
		}
	}

	public void method7622() throws IOException {
		method7621(1301762054);
		((Class643) this).aClass649_8306.method7673(1223785831);
	}

	public void method7623(byte[] is, int i, int i_10_, byte i_11_) throws IOException {
		try {
			if (i + i_10_ > is.length)
				throw new ArrayIndexOutOfBoundsException(i + i_10_ - is.length);
			if (4008607137883361941L * ((Class643) this).aLong8307 != -1L && (((Class643) this).aLong8299 * 4705366199259519221L >= 4008607137883361941L * ((Class643) this).aLong8307) && (((long) i_10_ + ((Class643) this).aLong8299 * 4705366199259519221L) <= (((Class643) this).aLong8307 * 4008607137883361941L + (long) (-1897432181 * ((Class643) this).anInt8305)))) {
				System.arraycopy(((Class643) this).aByteArray8303, (int) ((4705366199259519221L * ((Class643) this).aLong8299) - (4008607137883361941L * ((Class643) this).aLong8307)), is, i, i_10_);
				((Class643) this).aLong8299 += (long) i_10_ * 912128040997327709L;
				return;
			}
			long l = ((Class643) this).aLong8299 * 4705366199259519221L;
			int i_12_ = i;
			int i_13_ = i_10_;
			if ((((Class643) this).aLong8299 * 4705366199259519221L >= -2991052988434394089L * ((Class643) this).aLong8301) && (((Class643) this).aLong8299 * 4705366199259519221L < ((long) (-1068193677 * ((Class643) this).anInt8302) + (-2991052988434394089L * ((Class643) this).aLong8301)))) {
				int i_14_ = (int) ((long) (((Class643) this).anInt8302 * -1068193677) - ((((Class643) this).aLong8299 * 4705366199259519221L) - (-2991052988434394089L * ((Class643) this).aLong8301)));
				if (i_14_ > i_10_)
					i_14_ = i_10_;
				System.arraycopy(((Class643) this).aByteArray8300, (int) ((4705366199259519221L * ((Class643) this).aLong8299) - (-2991052988434394089L * ((Class643) this).aLong8301)), is, i, i_14_);
				((Class643) this).aLong8299 += (long) i_14_ * 912128040997327709L;
				i += i_14_;
				i_10_ -= i_14_;
			}
			if (i_10_ > ((Class643) this).aByteArray8300.length) {
				((Class643) this).aClass649_8306.method7670(4705366199259519221L * ((Class643) this).aLong8299);
				((Class643) this).aLong8304 = ((Class643) this).aLong8299 * 2748185488689087445L;
				int i_15_;
				for (/**/; i_10_ > 0; i_10_ -= i_15_) {
					i_15_ = ((Class643) this).aClass649_8306.method7665(is, i, i_10_, -1580144143);
					if (-1 == i_15_)
						break;
					((Class643) this).aLong8304 += (long) i_15_ * 6301187073992487777L;
					((Class643) this).aLong8299 += (long) i_15_ * 912128040997327709L;
					i += i_15_;
				}
			} else if (i_10_ > 0) {
				method7612((byte) 124);
				int i_16_ = i_10_;
				if (i_16_ > ((Class643) this).anInt8302 * -1068193677)
					i_16_ = ((Class643) this).anInt8302 * -1068193677;
				System.arraycopy(((Class643) this).aByteArray8300, 0, is, i, i_16_);
				i += i_16_;
				i_10_ -= i_16_;
				((Class643) this).aLong8299 += 912128040997327709L * (long) i_16_;
			}
			if (4008607137883361941L * ((Class643) this).aLong8307 != -1L) {
				if ((4008607137883361941L * ((Class643) this).aLong8307 > ((Class643) this).aLong8299 * 4705366199259519221L) && i_10_ > 0) {
					int i_17_ = ((int) ((4008607137883361941L * ((Class643) this).aLong8307) - (4705366199259519221L * ((Class643) this).aLong8299)) + i);
					if (i_17_ > i + i_10_)
						i_17_ = i + i_10_;
					while (i < i_17_) {
						is[i++] = (byte) 0;
						i_10_--;
						((Class643) this).aLong8299 += 912128040997327709L;
					}
				}
				long l_18_ = -1L;
				long l_19_ = -1L;
				if (((Class643) this).aLong8307 * 4008607137883361941L >= l && (4008607137883361941L * ((Class643) this).aLong8307 < l + (long) i_13_))
					l_18_ = 4008607137883361941L * ((Class643) this).aLong8307;
				else if (l >= (4008607137883361941L * ((Class643) this).aLong8307) && l < ((((Class643) this).aLong8307 * 4008607137883361941L) + (long) (((Class643) this).anInt8305 * -1897432181)))
					l_18_ = l;
				if ((((Class643) this).aLong8307 * 4008607137883361941L + (long) (-1897432181 * ((Class643) this).anInt8305)) > l && ((4008607137883361941L * ((Class643) this).aLong8307 + (long) (-1897432181 * ((Class643) this).anInt8305)) <= (long) i_13_ + l))
					l_19_ = (4008607137883361941L * ((Class643) this).aLong8307 + (long) (-1897432181 * ((Class643) this).anInt8305));
				else if ((l + (long) i_13_ > 4008607137883361941L * ((Class643) this).aLong8307) && ((long) i_13_ + l <= ((((Class643) this).aLong8307 * 4008607137883361941L) + (long) (-1897432181 * ((Class643) this).anInt8305))))
					l_19_ = l + (long) i_13_;
				if (l_18_ > -1L && l_19_ > l_18_) {
					int i_20_ = (int) (l_19_ - l_18_);
					System.arraycopy(((Class643) this).aByteArray8303, (int) (l_18_ - (((Class643) this).aLong8307 * 4008607137883361941L)), is, (int) (l_18_ - l) + i_12_, i_20_);
					if (l_19_ > 4705366199259519221L * ((Class643) this).aLong8299) {
						i_10_ -= l_19_ - (((Class643) this).aLong8299 * 4705366199259519221L);
						((Class643) this).aLong8299 = 912128040997327709L * l_19_;
					}
				}
			}
		} catch (IOException ioexception) {
			((Class643) this).aLong8304 = -6301187073992487777L;
			throw ioexception;
		}
		if (i_10_ > 0)
			throw new EOFException();
	}

	void method7624() throws IOException {
		((Class643) this).anInt8302 = 0;
		if (4705366199259519221L * ((Class643) this).aLong8299 != 7244936371031437473L * ((Class643) this).aLong8304) {
			((Class643) this).aClass649_8306.method7670(((Class643) this).aLong8299 * 4705366199259519221L);
			((Class643) this).aLong8304 = 2748185488689087445L * ((Class643) this).aLong8299;
		}
		((Class643) this).aLong8301 = 7830601188356163283L * ((Class643) this).aLong8299;
		int i;
		for (/**/; (((Class643) this).anInt8302 * -1068193677 < ((Class643) this).aByteArray8300.length); ((Class643) this).anInt8302 += 1964653755 * i) {
			int i_21_ = (((Class643) this).aByteArray8300.length - ((Class643) this).anInt8302 * -1068193677);
			if (i_21_ > 200000000)
				i_21_ = 200000000;
			i = ((Class643) this).aClass649_8306.method7665((((Class643) this).aByteArray8300), ((((Class643) this).anInt8302) * -1068193677), i_21_, -763992363);
			if (i == -1)
				break;
			((Class643) this).aLong8304 += (long) i * 6301187073992487777L;
		}
	}

	void method7625() throws IOException {
		if (-1L != ((Class643) this).aLong8307 * 4008607137883361941L) {
			if (4008607137883361941L * ((Class643) this).aLong8307 != 7244936371031437473L * ((Class643) this).aLong8304) {
				((Class643) this).aClass649_8306.method7670(((Class643) this).aLong8307 * 4008607137883361941L);
				((Class643) this).aLong8304 = ((Class643) this).aLong8307 * -8206647925369046667L;
			}
			((Class643) this).aClass649_8306.method7674(((Class643) this).aByteArray8303, 0, ((Class643) this).anInt8305 * -1897432181, -825628609);
			((Class643) this).aLong8304 += 6209752053726101675L * (long) ((Class643) this).anInt8305;
			if (((Class643) this).aLong8304 * 7244936371031437473L > 3578369531521669225L * ((Class643) this).aLong8298)
				((Class643) this).aLong8298 = -326708480705998983L * ((Class643) this).aLong8304;
			long l = -1L;
			long l_22_ = -1L;
			if ((((Class643) this).aLong8307 * 4008607137883361941L >= -2991052988434394089L * ((Class643) this).aLong8301) && (((Class643) this).aLong8307 * 4008607137883361941L < ((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301)))
				l = ((Class643) this).aLong8307 * 4008607137883361941L;
			else if ((((Class643) this).aLong8301 * -2991052988434394089L >= ((Class643) this).aLong8307 * 4008607137883361941L) && (((Class643) this).aLong8301 * -2991052988434394089L < ((long) (((Class643) this).anInt8305 * -1897432181) + (((Class643) this).aLong8307 * 4008607137883361941L))))
				l = ((Class643) this).aLong8301 * -2991052988434394089L;
			if (((((Class643) this).aLong8307 * 4008607137883361941L + (long) (-1897432181 * ((Class643) this).anInt8305)) > ((Class643) this).aLong8301 * -2991052988434394089L) && ((4008607137883361941L * ((Class643) this).aLong8307 + (long) (((Class643) this).anInt8305 * -1897432181)) <= (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302))))
				l_22_ = ((long) (-1897432181 * ((Class643) this).anInt8305) + ((Class643) this).aLong8307 * 4008607137883361941L);
			else if ((((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301) > ((Class643) this).aLong8307 * 4008607137883361941L) && ((-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302)) <= (4008607137883361941L * ((Class643) this).aLong8307 + (long) (-1897432181 * ((Class643) this).anInt8305))))
				l_22_ = (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (((Class643) this).anInt8302 * -1068193677));
			if (l > -1L && l_22_ > l) {
				int i = (int) (l_22_ - l);
				System.arraycopy(((Class643) this).aByteArray8303, (int) (l - (((Class643) this).aLong8307 * 4008607137883361941L)), ((Class643) this).aByteArray8300, (int) (l - (-2991052988434394089L * ((Class643) this).aLong8301)), i);
			}
			((Class643) this).aLong8307 = 5562615674902337347L;
			((Class643) this).anInt8305 = 0;
		}
	}

	void method7626() throws IOException {
		if (-1L != ((Class643) this).aLong8307 * 4008607137883361941L) {
			if (4008607137883361941L * ((Class643) this).aLong8307 != 7244936371031437473L * ((Class643) this).aLong8304) {
				((Class643) this).aClass649_8306.method7670(((Class643) this).aLong8307 * 4008607137883361941L);
				((Class643) this).aLong8304 = ((Class643) this).aLong8307 * -8206647925369046667L;
			}
			((Class643) this).aClass649_8306.method7674(((Class643) this).aByteArray8303, 0, ((Class643) this).anInt8305 * -1897432181, -1029729081);
			((Class643) this).aLong8304 += 6209752053726101675L * (long) ((Class643) this).anInt8305;
			if (((Class643) this).aLong8304 * 7244936371031437473L > 3578369531521669225L * ((Class643) this).aLong8298)
				((Class643) this).aLong8298 = -326708480705998983L * ((Class643) this).aLong8304;
			long l = -1L;
			long l_23_ = -1L;
			if ((((Class643) this).aLong8307 * 4008607137883361941L >= -2991052988434394089L * ((Class643) this).aLong8301) && (((Class643) this).aLong8307 * 4008607137883361941L < ((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301)))
				l = ((Class643) this).aLong8307 * 4008607137883361941L;
			else if ((((Class643) this).aLong8301 * -2991052988434394089L >= ((Class643) this).aLong8307 * 4008607137883361941L) && (((Class643) this).aLong8301 * -2991052988434394089L < ((long) (((Class643) this).anInt8305 * -1897432181) + (((Class643) this).aLong8307 * 4008607137883361941L))))
				l = ((Class643) this).aLong8301 * -2991052988434394089L;
			if (((((Class643) this).aLong8307 * 4008607137883361941L + (long) (-1897432181 * ((Class643) this).anInt8305)) > ((Class643) this).aLong8301 * -2991052988434394089L) && ((4008607137883361941L * ((Class643) this).aLong8307 + (long) (((Class643) this).anInt8305 * -1897432181)) <= (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302))))
				l_23_ = ((long) (-1897432181 * ((Class643) this).anInt8305) + ((Class643) this).aLong8307 * 4008607137883361941L);
			else if ((((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301) > ((Class643) this).aLong8307 * 4008607137883361941L) && ((-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302)) <= (4008607137883361941L * ((Class643) this).aLong8307 + (long) (-1897432181 * ((Class643) this).anInt8305))))
				l_23_ = (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (((Class643) this).anInt8302 * -1068193677));
			if (l > -1L && l_23_ > l) {
				int i = (int) (l_23_ - l);
				System.arraycopy(((Class643) this).aByteArray8303, (int) (l - (((Class643) this).aLong8307 * 4008607137883361941L)), ((Class643) this).aByteArray8300, (int) (l - (-2991052988434394089L * ((Class643) this).aLong8301)), i);
			}
			((Class643) this).aLong8307 = 5562615674902337347L;
			((Class643) this).anInt8305 = 0;
		}
	}

	void method7627() throws IOException {
		if (-1L != ((Class643) this).aLong8307 * 4008607137883361941L) {
			if (4008607137883361941L * ((Class643) this).aLong8307 != 7244936371031437473L * ((Class643) this).aLong8304) {
				((Class643) this).aClass649_8306.method7670(((Class643) this).aLong8307 * 4008607137883361941L);
				((Class643) this).aLong8304 = ((Class643) this).aLong8307 * -8206647925369046667L;
			}
			((Class643) this).aClass649_8306.method7674(((Class643) this).aByteArray8303, 0, ((Class643) this).anInt8305 * -1897432181, 199672826);
			((Class643) this).aLong8304 += 6209752053726101675L * (long) ((Class643) this).anInt8305;
			if (((Class643) this).aLong8304 * 7244936371031437473L > 3578369531521669225L * ((Class643) this).aLong8298)
				((Class643) this).aLong8298 = -326708480705998983L * ((Class643) this).aLong8304;
			long l = -1L;
			long l_24_ = -1L;
			if ((((Class643) this).aLong8307 * 4008607137883361941L >= -2991052988434394089L * ((Class643) this).aLong8301) && (((Class643) this).aLong8307 * 4008607137883361941L < ((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301)))
				l = ((Class643) this).aLong8307 * 4008607137883361941L;
			else if ((((Class643) this).aLong8301 * -2991052988434394089L >= ((Class643) this).aLong8307 * 4008607137883361941L) && (((Class643) this).aLong8301 * -2991052988434394089L < ((long) (((Class643) this).anInt8305 * -1897432181) + (((Class643) this).aLong8307 * 4008607137883361941L))))
				l = ((Class643) this).aLong8301 * -2991052988434394089L;
			if (((((Class643) this).aLong8307 * 4008607137883361941L + (long) (-1897432181 * ((Class643) this).anInt8305)) > ((Class643) this).aLong8301 * -2991052988434394089L) && ((4008607137883361941L * ((Class643) this).aLong8307 + (long) (((Class643) this).anInt8305 * -1897432181)) <= (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302))))
				l_24_ = ((long) (-1897432181 * ((Class643) this).anInt8305) + ((Class643) this).aLong8307 * 4008607137883361941L);
			else if ((((long) (-1068193677 * ((Class643) this).anInt8302) + -2991052988434394089L * ((Class643) this).aLong8301) > ((Class643) this).aLong8307 * 4008607137883361941L) && ((-2991052988434394089L * ((Class643) this).aLong8301 + (long) (-1068193677 * ((Class643) this).anInt8302)) <= (4008607137883361941L * ((Class643) this).aLong8307 + (long) (-1897432181 * ((Class643) this).anInt8305))))
				l_24_ = (-2991052988434394089L * ((Class643) this).aLong8301 + (long) (((Class643) this).anInt8302 * -1068193677));
			if (l > -1L && l_24_ > l) {
				int i = (int) (l_24_ - l);
				System.arraycopy(((Class643) this).aByteArray8303, (int) (l - (((Class643) this).aLong8307 * 4008607137883361941L)), ((Class643) this).aByteArray8300, (int) (l - (-2991052988434394089L * ((Class643) this).aLong8301)), i);
			}
			((Class643) this).aLong8307 = 5562615674902337347L;
			((Class643) this).anInt8305 = 0;
		}
	}

	static final void method7628(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}
}

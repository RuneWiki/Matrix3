package game;

/* Class570_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.nanotime.QueryPerformanceCounter;

public class Class570_Sub2 extends Class570 {
	int anInt9522;
	long aLong9523 = 0L;
	long aLong9524;
	long[] aLongArray9525;
	long aLong9526 = 0L;
	int anInt9527;

	int method6774(long l) {
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L) {
			((Class570_Sub2) this).aLong9524 += (-406761136618720095L * ((Class570_Sub2) this).aLong9526 - (((Class570_Sub2) this).aLong9523 * -7272717282732304143L));
			((Class570_Sub2) this).aLong9523 += (-2730369811269757263L * ((Class570_Sub2) this).aLong9526 - 1L * ((Class570_Sub2) this).aLong9523);
			((Class570_Sub2) this).aLong9526 += -8278404902932963575L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class570_Sub2) this).aLong9526 += l * -8278404902932963575L;
		} while (i < 10 && (7437728312218820409L * ((Class570_Sub2) this).aLong9526 < (7293917694651761417L * ((Class570_Sub2) this).aLong9523)));
		if (7437728312218820409L * ((Class570_Sub2) this).aLong9526 < 7293917694651761417L * ((Class570_Sub2) this).aLong9523)
			((Class570_Sub2) this).aLong9526 = ((Class570_Sub2) this).aLong9523 * 3265726454552703569L;
		return i;
	}

	void method6768() {
		((Class570_Sub2) this).aLong9524 = 0L;
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L)
			((Class570_Sub2) this).aLong9523 += (((Class570_Sub2) this).aLong9526 * -2730369811269757263L - ((Class570_Sub2) this).aLong9523 * 1L);
	}

	long method6773() {
		((Class570_Sub2) this).aLong9523 += method8885(84061108) * 3737860166258457401L;
		if (7437728312218820409L * ((Class570_Sub2) this).aLong9526 > 7293917694651761417L * ((Class570_Sub2) this).aLong9523)
			return ((7437728312218820409L * ((Class570_Sub2) this).aLong9526 - ((Class570_Sub2) this).aLong9523 * 7293917694651761417L) / 1000000L);
		return 0L;
	}

	int method6767(long l) {
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L) {
			((Class570_Sub2) this).aLong9524 += (-406761136618720095L * ((Class570_Sub2) this).aLong9526 - (((Class570_Sub2) this).aLong9523 * -7272717282732304143L));
			((Class570_Sub2) this).aLong9523 += (-2730369811269757263L * ((Class570_Sub2) this).aLong9526 - 1L * ((Class570_Sub2) this).aLong9523);
			((Class570_Sub2) this).aLong9526 += -8278404902932963575L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class570_Sub2) this).aLong9526 += l * -8278404902932963575L;
		} while (i < 10 && (7437728312218820409L * ((Class570_Sub2) this).aLong9526 < (7293917694651761417L * ((Class570_Sub2) this).aLong9523)));
		if (7437728312218820409L * ((Class570_Sub2) this).aLong9526 < 7293917694651761417L * ((Class570_Sub2) this).aLong9523)
			((Class570_Sub2) this).aLong9526 = ((Class570_Sub2) this).aLong9523 * 3265726454552703569L;
		return i;
	}

	long method8884() {
		long l = QueryPerformanceCounter.nanoTime();
		long l_0_ = l - -305564395710657639L * ((Class570_Sub2) this).aLong9524;
		((Class570_Sub2) this).aLong9524 = 140072795246516393L * l;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			((Class570_Sub2) this).aLongArray9525[-1194358187 * ((Class570_Sub2) this).anInt9522] = l_0_;
			((Class570_Sub2) this).anInt9522 = -814669059 * ((((Class570_Sub2) this).anInt9522 * -1194358187 + 1) % 10);
			if (-1154027523 * ((Class570_Sub2) this).anInt9527 < 1)
				((Class570_Sub2) this).anInt9527 += -369498795;
		}
		long l_1_ = 0L;
		for (int i = 1; i <= ((Class570_Sub2) this).anInt9527 * -1154027523; i++)
			l_1_ += (((Class570_Sub2) this).aLongArray9525[(10 + (-1194358187 * ((Class570_Sub2) this).anInt9522 - i)) % 10]);
		return l_1_ / (long) (-1154027523 * ((Class570_Sub2) this).anInt9527);
	}

	long method8885(int i) {
		long l = QueryPerformanceCounter.nanoTime();
		long l_2_ = l - -305564395710657639L * ((Class570_Sub2) this).aLong9524;
		((Class570_Sub2) this).aLong9524 = 140072795246516393L * l;
		if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
			((Class570_Sub2) this).aLongArray9525[-1194358187 * ((Class570_Sub2) this).anInt9522] = l_2_;
			((Class570_Sub2) this).anInt9522 = -814669059 * ((((Class570_Sub2) this).anInt9522 * -1194358187 + 1) % 10);
			if (-1154027523 * ((Class570_Sub2) this).anInt9527 < 1)
				((Class570_Sub2) this).anInt9527 += -369498795;
		}
		long l_3_ = 0L;
		for (int i_4_ = 1; i_4_ <= ((Class570_Sub2) this).anInt9527 * -1154027523; i_4_++)
			l_3_ += (((Class570_Sub2) this).aLongArray9525[(10 + (-1194358187 * ((Class570_Sub2) this).anInt9522 - i_4_)) % 10]);
		return l_3_ / (long) (-1154027523 * ((Class570_Sub2) this).anInt9527);
	}

	long method6769(int i) {
		return 7293917694651761417L * ((Class570_Sub2) this).aLong9523;
	}

	void method6776() {
		((Class570_Sub2) this).aLong9524 = 0L;
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L)
			((Class570_Sub2) this).aLong9523 += (((Class570_Sub2) this).aLong9526 * -2730369811269757263L - ((Class570_Sub2) this).aLong9523 * 1L);
	}

	void method6770() {
		((Class570_Sub2) this).aLong9524 = 0L;
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L)
			((Class570_Sub2) this).aLong9523 += (((Class570_Sub2) this).aLong9526 * -2730369811269757263L - ((Class570_Sub2) this).aLong9523 * 1L);
	}

	void method6771() {
		((Class570_Sub2) this).aLong9524 = 0L;
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L)
			((Class570_Sub2) this).aLong9523 += (((Class570_Sub2) this).aLong9526 * -2730369811269757263L - ((Class570_Sub2) this).aLong9523 * 1L);
	}

	long method6766() {
		((Class570_Sub2) this).aLong9523 += method8885(84061108) * 3737860166258457401L;
		if (7437728312218820409L * ((Class570_Sub2) this).aLong9526 > 7293917694651761417L * ((Class570_Sub2) this).aLong9523)
			return ((7437728312218820409L * ((Class570_Sub2) this).aLong9526 - ((Class570_Sub2) this).aLong9523 * 7293917694651761417L) / 1000000L);
		return 0L;
	}

	Class570_Sub2() {
		((Class570_Sub2) this).aLong9524 = 0L;
		((Class570_Sub2) this).aLongArray9525 = new long[10];
		((Class570_Sub2) this).anInt9522 = 0;
		((Class570_Sub2) this).anInt9527 = -369498795;
		((Class570_Sub2) this).aLong9526 = ((((Class570_Sub2) this).aLong9523 = QueryPerformanceCounter.nanoTime() * 3737860166258457401L) * 3265726454552703569L);
		if (0L == ((Class570_Sub2) this).aLong9523 * 7293917694651761417L)
			throw new RuntimeException();
	}

	void method6765(int i) {
		((Class570_Sub2) this).aLong9524 = 0L;
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L)
			((Class570_Sub2) this).aLong9523 += (((Class570_Sub2) this).aLong9526 * -2730369811269757263L - ((Class570_Sub2) this).aLong9523 * 1L);
	}

	int method6775(long l) {
		if (((Class570_Sub2) this).aLong9526 * 7437728312218820409L > ((Class570_Sub2) this).aLong9523 * 7293917694651761417L) {
			((Class570_Sub2) this).aLong9524 += (-406761136618720095L * ((Class570_Sub2) this).aLong9526 - (((Class570_Sub2) this).aLong9523 * -7272717282732304143L));
			((Class570_Sub2) this).aLong9523 += (-2730369811269757263L * ((Class570_Sub2) this).aLong9526 - 1L * ((Class570_Sub2) this).aLong9523);
			((Class570_Sub2) this).aLong9526 += -8278404902932963575L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class570_Sub2) this).aLong9526 += l * -8278404902932963575L;
		} while (i < 10 && (7437728312218820409L * ((Class570_Sub2) this).aLong9526 < (7293917694651761417L * ((Class570_Sub2) this).aLong9523)));
		if (7437728312218820409L * ((Class570_Sub2) this).aLong9526 < 7293917694651761417L * ((Class570_Sub2) this).aLong9523)
			((Class570_Sub2) this).aLong9526 = ((Class570_Sub2) this).aLong9523 * 3265726454552703569L;
		return i;
	}

	long method6764() {
		return 7293917694651761417L * ((Class570_Sub2) this).aLong9523;
	}

	long method8886() {
		long l = QueryPerformanceCounter.nanoTime();
		long l_5_ = l - -305564395710657639L * ((Class570_Sub2) this).aLong9524;
		((Class570_Sub2) this).aLong9524 = 140072795246516393L * l;
		if (l_5_ > -5000000000L && l_5_ < 5000000000L) {
			((Class570_Sub2) this).aLongArray9525[-1194358187 * ((Class570_Sub2) this).anInt9522] = l_5_;
			((Class570_Sub2) this).anInt9522 = -814669059 * ((((Class570_Sub2) this).anInt9522 * -1194358187 + 1) % 10);
			if (-1154027523 * ((Class570_Sub2) this).anInt9527 < 1)
				((Class570_Sub2) this).anInt9527 += -369498795;
		}
		long l_6_ = 0L;
		for (int i = 1; i <= ((Class570_Sub2) this).anInt9527 * -1154027523; i++)
			l_6_ += (((Class570_Sub2) this).aLongArray9525[(10 + (-1194358187 * ((Class570_Sub2) this).anInt9522 - i)) % 10]);
		return l_6_ / (long) (-1154027523 * ((Class570_Sub2) this).anInt9527);
	}

	long method6763(byte i) {
		((Class570_Sub2) this).aLong9523 += method8885(84061108) * 3737860166258457401L;
		if (7437728312218820409L * ((Class570_Sub2) this).aLong9526 > 7293917694651761417L * ((Class570_Sub2) this).aLong9523)
			return ((7437728312218820409L * ((Class570_Sub2) this).aLong9526 - ((Class570_Sub2) this).aLong9523 * 7293917694651761417L) / 1000000L);
		return 0L;
	}
}

package game;

/* Class570_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class570_Sub1 extends Class570 {
	long aLong9427;
	long aLong9428 = 0L;
	long aLong9429 = 0L;
	long[] aLongArray9430;
	int anInt9431;
	int anInt9432;

	long method8793(int i) {
		long l = System.nanoTime();
		long l_0_ = l - -2090217708636483805L * ((Class570_Sub1) this).aLong9427;
		((Class570_Sub1) this).aLong9427 = l * -6747542046311327605L;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			((Class570_Sub1) this).aLongArray9430[410416711 * ((Class570_Sub1) this).anInt9431] = l_0_;
			((Class570_Sub1) this).anInt9431 = ((((Class570_Sub1) this).anInt9431 * 410416711 + 1) % 10 * -273001609);
			if (1737840367 * ((Class570_Sub1) this).anInt9432 < 1)
				((Class570_Sub1) this).anInt9432 += 394172431;
		}
		long l_1_ = 0L;
		for (int i_2_ = 1; i_2_ <= ((Class570_Sub1) this).anInt9432 * 1737840367; i_2_++)
			l_1_ += (((Class570_Sub1) this).aLongArray9430[(10 + (410416711 * ((Class570_Sub1) this).anInt9431 - i_2_)) % 10]);
		return l_1_ / (long) (((Class570_Sub1) this).anInt9432 * 1737840367);
	}

	void method6765(int i) {
		((Class570_Sub1) this).aLong9427 = 0L;
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - ((Class570_Sub1) this).aLong9428 * 1L);
	}

	long method6763(byte i) {
		((Class570_Sub1) this).aLong9428 += method8793(-689636982) * 869897061877120563L;
		if (4726484628847905239L * ((Class570_Sub1) this).aLong9429 > ((Class570_Sub1) this).aLong9428 * 1975844250287320315L)
			return ((((Class570_Sub1) this).aLong9429 * 4726484628847905239L - ((Class570_Sub1) this).aLong9428 * 1975844250287320315L) / 1000000L);
		return 0L;
	}

	int method6767(long l) {
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428) {
			((Class570_Sub1) this).aLong9427 += (2074299512330911677L * ((Class570_Sub1) this).aLong9429 - (((Class570_Sub1) this).aLong9428 * -7353228846328859575L));
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - 1L * ((Class570_Sub1) this).aLong9428);
			((Class570_Sub1) this).aLong9429 += 4675486618581023207L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class570_Sub1) this).aLong9429 += l * 4675486618581023207L;
		} while (i < 10 && (4726484628847905239L * ((Class570_Sub1) this).aLong9429 < (((Class570_Sub1) this).aLong9428 * 1975844250287320315L)));
		if (4726484628847905239L * ((Class570_Sub1) this).aLong9429 < 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9429 = 8516106466082945405L * ((Class570_Sub1) this).aLong9428;
		return i;
	}

	long method6764() {
		return ((Class570_Sub1) this).aLong9428 * 1975844250287320315L;
	}

	long method6769(int i) {
		return ((Class570_Sub1) this).aLong9428 * 1975844250287320315L;
	}

	void method6768() {
		((Class570_Sub1) this).aLong9427 = 0L;
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - ((Class570_Sub1) this).aLong9428 * 1L);
	}

	void method6776() {
		((Class570_Sub1) this).aLong9427 = 0L;
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - ((Class570_Sub1) this).aLong9428 * 1L);
	}

	void method6770() {
		((Class570_Sub1) this).aLong9427 = 0L;
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - ((Class570_Sub1) this).aLong9428 * 1L);
	}

	Class570_Sub1() {
		((Class570_Sub1) this).aLong9427 = 0L;
		((Class570_Sub1) this).aLongArray9430 = new long[10];
		((Class570_Sub1) this).anInt9431 = 0;
		((Class570_Sub1) this).anInt9432 = 394172431;
		((Class570_Sub1) this).aLong9428 = System.nanoTime() * 869897061877120563L;
		((Class570_Sub1) this).aLong9429 = System.nanoTime() * 4675486618581023207L;
	}

	long method6766() {
		((Class570_Sub1) this).aLong9428 += method8793(-1322236071) * 869897061877120563L;
		if (4726484628847905239L * ((Class570_Sub1) this).aLong9429 > ((Class570_Sub1) this).aLong9428 * 1975844250287320315L)
			return ((((Class570_Sub1) this).aLong9429 * 4726484628847905239L - ((Class570_Sub1) this).aLong9428 * 1975844250287320315L) / 1000000L);
		return 0L;
	}

	long method6773() {
		((Class570_Sub1) this).aLong9428 += method8793(448578042) * 869897061877120563L;
		if (4726484628847905239L * ((Class570_Sub1) this).aLong9429 > ((Class570_Sub1) this).aLong9428 * 1975844250287320315L)
			return ((((Class570_Sub1) this).aLong9429 * 4726484628847905239L - ((Class570_Sub1) this).aLong9428 * 1975844250287320315L) / 1000000L);
		return 0L;
	}

	int method6774(long l) {
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428) {
			((Class570_Sub1) this).aLong9427 += (2074299512330911677L * ((Class570_Sub1) this).aLong9429 - (((Class570_Sub1) this).aLong9428 * -7353228846328859575L));
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - 1L * ((Class570_Sub1) this).aLong9428);
			((Class570_Sub1) this).aLong9429 += 4675486618581023207L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class570_Sub1) this).aLong9429 += l * 4675486618581023207L;
		} while (i < 10 && (4726484628847905239L * ((Class570_Sub1) this).aLong9429 < (((Class570_Sub1) this).aLong9428 * 1975844250287320315L)));
		if (4726484628847905239L * ((Class570_Sub1) this).aLong9429 < 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9429 = 8516106466082945405L * ((Class570_Sub1) this).aLong9428;
		return i;
	}

	int method6775(long l) {
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428) {
			((Class570_Sub1) this).aLong9427 += (2074299512330911677L * ((Class570_Sub1) this).aLong9429 - (((Class570_Sub1) this).aLong9428 * -7353228846328859575L));
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - 1L * ((Class570_Sub1) this).aLong9428);
			((Class570_Sub1) this).aLong9429 += 4675486618581023207L * l;
			return 1;
		}
		int i = 0;
		do {
			i++;
			((Class570_Sub1) this).aLong9429 += l * 4675486618581023207L;
		} while (i < 10 && (4726484628847905239L * ((Class570_Sub1) this).aLong9429 < (((Class570_Sub1) this).aLong9428 * 1975844250287320315L)));
		if (4726484628847905239L * ((Class570_Sub1) this).aLong9429 < 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9429 = 8516106466082945405L * ((Class570_Sub1) this).aLong9428;
		return i;
	}

	void method6771() {
		((Class570_Sub1) this).aLong9427 = 0L;
		if (((Class570_Sub1) this).aLong9429 * 4726484628847905239L > 1975844250287320315L * ((Class570_Sub1) this).aLong9428)
			((Class570_Sub1) this).aLong9428 += (((Class570_Sub1) this).aLong9429 * 6219380068522067925L - ((Class570_Sub1) this).aLong9428 * 1L);
	}

	long method8794() {
		long l = System.nanoTime();
		long l_3_ = l - -2090217708636483805L * ((Class570_Sub1) this).aLong9427;
		((Class570_Sub1) this).aLong9427 = l * -6747542046311327605L;
		if (l_3_ > -5000000000L && l_3_ < 5000000000L) {
			((Class570_Sub1) this).aLongArray9430[410416711 * ((Class570_Sub1) this).anInt9431] = l_3_;
			((Class570_Sub1) this).anInt9431 = ((((Class570_Sub1) this).anInt9431 * 410416711 + 1) % 10 * -273001609);
			if (1737840367 * ((Class570_Sub1) this).anInt9432 < 1)
				((Class570_Sub1) this).anInt9432 += 394172431;
		}
		long l_4_ = 0L;
		for (int i = 1; i <= ((Class570_Sub1) this).anInt9432 * 1737840367; i++)
			l_4_ += (((Class570_Sub1) this).aLongArray9430[(10 + (410416711 * ((Class570_Sub1) this).anInt9431 - i)) % 10]);
		return l_4_ / (long) (((Class570_Sub1) this).anInt9432 * 1737840367);
	}

	long method8795() {
		long l = System.nanoTime();
		long l_5_ = l - -2090217708636483805L * ((Class570_Sub1) this).aLong9427;
		((Class570_Sub1) this).aLong9427 = l * -6747542046311327605L;
		if (l_5_ > -5000000000L && l_5_ < 5000000000L) {
			((Class570_Sub1) this).aLongArray9430[410416711 * ((Class570_Sub1) this).anInt9431] = l_5_;
			((Class570_Sub1) this).anInt9431 = ((((Class570_Sub1) this).anInt9431 * 410416711 + 1) % 10 * -273001609);
			if (1737840367 * ((Class570_Sub1) this).anInt9432 < 1)
				((Class570_Sub1) this).anInt9432 += 394172431;
		}
		long l_6_ = 0L;
		for (int i = 1; i <= ((Class570_Sub1) this).anInt9432 * 1737840367; i++)
			l_6_ += (((Class570_Sub1) this).aLongArray9430[(10 + (410416711 * ((Class570_Sub1) this).anInt9431 - i)) % 10]);
		return l_6_ / (long) (((Class570_Sub1) this).anInt9432 * 1737840367);
	}

	static final void method8796(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -3460);
		Class384.method4656(class73, class441, 484988321);
	}

	public static Class328[] method8797(int i) {
		return (new Class328[] { Class328.aClass328_4169, Class328.aClass328_4170, Class328.aClass328_4189, Class328.aClass328_4175, Class328.aClass328_4195, Class328.aClass328_4183,
			Class328.aClass328_4167, Class328.aClass328_4205, Class328.aClass328_4198, Class328.aClass328_4166, Class328.aClass328_4197, Class328.aClass328_4199, Class328.aClass328_4174,
			Class328.aClass328_4186, Class328.aClass328_4193, Class328.aClass328_4202, Class328.aClass328_4188, Class328.aClass328_4204, Class328.aClass328_4187, Class328.aClass328_4203,
			Class328.aClass328_4179, Class328.aClass328_4180, Class328.aClass328_4173, Class328.aClass328_4171, Class328.aClass328_4176, Class328.aClass328_4207, Class328.aClass328_4196,
			Class328.aClass328_4185, Class328.aClass328_4178, Class328.aClass328_4206, Class328.aClass328_4192, Class328.aClass328_4201, Class328.aClass328_4182, Class328.aClass328_4168,
			Class328.aClass328_4194, Class328.aClass328_4208, Class328.aClass328_4184, Class328.aClass328_4177, Class328.aClass328_4191, Class328.aClass328_4190, Class328.aClass328_4181,
			Class328.aClass328_4172 });
	}

	public static void method8798(boolean bool, byte i) {
		if (BaseVarType.aClass412_7963 == null)
			Class359.method4440(-1607532871);
		if (bool)
			BaseVarType.aClass412_7963.method5060(1133451586);
	}
}

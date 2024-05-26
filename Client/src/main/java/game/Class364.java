package game;

/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class364 {
	public static Class364 aClass364_4464;
	int anInt4465;
	public int anInt4466;
	Class88 aClass88_4467;
	public static Class364 aClass364_4468;
	public static Class364 aClass364_4469;
	public static Class364 aClass364_4470;
	public static Class364 aClass364_4471;
	public static Class364 aClass364_4472 = new Class364(5, 0, 3, Class88.aClass88_1213);
	static Class364 aClass364_4473;
	static Class364 aClass364_4474;
	static Class364 aClass364_4475;
	public int anInt4476;
	static final int anInt4477 = 16;
	static int anInt4478;
	static Class364 aClass364_4479;
	static Class364 aClass364_4480;
	int anInt4481;
	public static Class364 aClass364_4482;

	static Class364 method4486(int i) {
		switch (i) {
			case 4:
				return aClass364_4482;
			case 3:
				return aClass364_4471;
			case 6:
				return aClass364_4470;
			case 2:
				return aClass364_4468;
			case 0:
				return aClass364_4472;
			case 1:
				return aClass364_4464;
			case 5:
				return aClass364_4469;
			default:
				return null;
		}
	}

	Class364(int i, int i_0_, int i_1_, Class88 class88) {
		anInt4476 = i;
		((Class364) this).anInt4465 = i_0_;
		((Class364) this).anInt4481 = i_1_;
		((Class364) this).aClass88_4467 = class88;
		anInt4466 = (((Class364) this).anInt4481 * (((Class364) this).aClass88_4467.anInt1223 * -1071269501));
		if (((Class364) this).anInt4465 >= 16)
			throw new RuntimeException();
	}

	static {
		aClass364_4464 = new Class364(1, 1, 3, Class88.aClass88_1213);
		aClass364_4468 = new Class364(8, 2, 4, Class88.aClass88_1218);
		aClass364_4471 = new Class364(9, 3, 1, Class88.aClass88_1213);
		aClass364_4482 = new Class364(6, 4, 2, Class88.aClass88_1213);
		aClass364_4469 = new Class364(4, 5, 3, Class88.aClass88_1213);
		aClass364_4470 = new Class364(7, 6, 4, Class88.aClass88_1213);
		aClass364_4480 = new Class364(3, 7, 4, Class88.aClass88_1213);
		aClass364_4479 = new Class364(0, 8, 4, Class88.aClass88_1213);
		aClass364_4473 = new Class364(10, 9, 4, Class88.aClass88_1213);
		aClass364_4474 = new Class364(2, 10, 3, Class88.aClass88_1213);
		aClass364_4475 = new Class364(11, 11, 3, Class88.aClass88_1213);
		anInt4478 = Class522.method6220(16, 201284318);
	}

	static Class364 method4487(int i) {
		switch (i) {
			case 4:
				return aClass364_4482;
			case 3:
				return aClass364_4471;
			case 6:
				return aClass364_4470;
			case 2:
				return aClass364_4468;
			case 0:
				return aClass364_4472;
			case 1:
				return aClass364_4464;
			case 5:
				return aClass364_4469;
			default:
				return null;
		}
	}
}

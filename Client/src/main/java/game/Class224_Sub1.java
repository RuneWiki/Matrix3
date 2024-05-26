package game;

/* Class224_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class224_Sub1 extends Class224 {
	Class675 aClass675_9460;
	Class675 aClass675_9461;
	Class617 aClass617_9462;
	Class267 aClass267_9463;
	Class558 aClass558_9464;
	Class558 aClass558_9465;
	Class572_Sub12_Sub16 aClass572_Sub12_Sub16_9466;
	int anInt9467;
	static final int anInt9468 = 1;
	int anInt9469;
	Class254 aClass254_9470;
	static final byte aByte9471 = 0;
	static final byte aByte9472 = 1;
	static final byte aByte9473 = -1;
	int anInt9474 = 0;
	int anInt9475;
	Class676 aClass676_9476 = new Class676(16);
	byte[] aByteArray9477;
	boolean aBool9478;
	boolean aBool9479;
	int anInt9480 = 0;
	Class278 aClass278_9481;
	boolean aBool9482;
	byte[] aByteArray9483;
	boolean aBool9484;
	static final int anInt9485 = 1000;
	static final int anInt9486 = 250;
	static CRC32 aCRC32_9487 = new CRC32();
	static final int anInt9488 = 0;
	long aLong9489;
	static final int anInt9490 = 2;
	public static Class307 aClass307_9491;
	static Class558 aClass558_9492;

	public int method8826() {
		if (null == ((Class224_Sub1) this).aClass254_9470)
			return 0;
		if (!((Class224_Sub1) this).aBool9479)
			return (617309171 * (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2740));
		Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50);
		if (class572 == null)
			return 0;
		return (int) (class572.hash * 381237825124074065L);
	}

	void method8827(int i, byte[] is, int i_0_, int i_1_, byte i_2_) {
		if (!method8828(i, is, i_0_, i_1_, (byte) -94)) {
			((Class224_Sub1) this).anInt9475 = -899075415 * i;
			((Class224_Sub1) this).aByteArray9483 = is;
			((Class224_Sub1) this).anInt9469 = i_0_ * 1894147815;
			((Class224_Sub1) this).aClass254_9470 = null;
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
			if (!((Class224_Sub1) this).aClass278_9481.method3745(-1047553020))
				((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 699072859));
		}
	}

	boolean method8828(int i, byte[] is, int i_3_, int i_4_, byte i_5_) {
		if (i == -1437101671 * ((Class224_Sub1) this).anInt9475 && ((Class224_Sub1) this).anInt9469 * 286608599 == i_3_) {
			boolean bool = true;
			for (int i_6_ = 0; i_6_ < ((Class224_Sub1) this).aByteArray9483.length; i_6_++) {
				if (is[i_6_] != ((Class224_Sub1) this).aByteArray9483[i_6_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
		}
		return false;
	}

	public int method8829(byte i) {
		if (method3136(2134921225) == null) {
			if (null == ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466)
				return 0;
			return ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10441(1800793391);
		}
		return 100;
	}

	boolean method8830() {
		return null != ((Class224_Sub1) this).aClass617_9462;
	}

	byte[] method3137(int i, byte i_7_) {
		Class572_Sub12_Sub16 class572_sub12_sub16 = method8860(i, 0, -696904315);
		if (null == class572_sub12_sub16)
			return null;
		byte[] is = class572_sub12_sub16.method10440((byte) 70);
		class572_sub12_sub16.method6794((byte) 104);
		return is;
	}

	boolean method8831(int i) {
		return null != ((Class224_Sub1) this).aClass617_9462;
	}

	public boolean method8832() {
		return ((Class224_Sub1) this).aBool9478;
	}

	void method8833(byte i) {
		if (((Class224_Sub1) this).aClass675_9460 != null) {
			if (method3136(1349994828) == null)
				return;
			if (((Class224_Sub1) this).aBool9479) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(1093926541)) {
					int i_8_ = (int) (class572.hash * 381237825124074065L);
					if (0 == ((Class224_Sub1) this).aByteArray9477[i_8_])
						method8860(i_8_, 1, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i_8_] != 0)
						class572.method6794((byte) -32);
					else
						bool = false;
				}
				while (((Class224_Sub1) this).anInt9480 * -2141584979 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]) == 0)
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if ((((Class267) ((Class224_Sub1) this).aClass267_9463).anInt2845) * -929729343 >= 250) {
							bool = false;
							break;
						}
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0)
							method8860((((Class224_Sub1) this).anInt9480 * -2141584979), 1, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0) {
							Class572 class572 = new Class572();
							class572.hash = (-4961852955067205987L * (long) ((Class224_Sub1) this).anInt9480);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -1469212758);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9479 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else if (((Class224_Sub1) this).aBool9482) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(254105494)) {
					int i_9_ = (int) (class572.hash * 381237825124074065L);
					if (((Class224_Sub1) this).aByteArray9477[i_9_] != 1)
						method8860(i_9_, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i_9_] == 1)
						class572.method6794((byte) 62);
					else
						bool = false;
				}
				while (-2141584979 * ((Class224_Sub1) this).anInt9480 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if (0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]))
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if (((Class224_Sub1) this).aClass278_9481.method3723(-1512466779)) {
							bool = false;
							break;
						}
						if (1 != (((Class224_Sub1) this).aByteArray9477[(-2141584979 * ((Class224_Sub1) this).anInt9480)]))
							method8860((-2141584979 * ((Class224_Sub1) this).anInt9480), 2, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) != 1) {
							Class572 class572 = new Class572();
							class572.hash = ((long) ((Class224_Sub1) this).anInt9480 * -4961852955067205987L);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -2122845147);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9482 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else
				((Class224_Sub1) this).aClass675_9460 = null;
		}
		if (((Class224_Sub1) this).aBool9484 && (Class69.method1067(-1933971241) >= ((Class224_Sub1) this).aLong9489 * 6675065276428167775L)) {
			for (Class572_Sub12_Sub16 class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7968((byte) -52); class572_sub12_sub16 != null; class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7969(-144495009)) {
				if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11476) {
					if (((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474) {
						if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475)
							throw new RuntimeException();
						class572_sub12_sub16.method6794((byte) 91);
					} else
						((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474 = true;
				}
			}
			((Class224_Sub1) this).aLong9489 = ((Class69.method1067(-1694592118) + 1000L) * -3593537682812489313L);
		}
	}

	public int method8834(int i) {
		if (((Class224_Sub1) this).aClass254_9470 == null)
			return 0;
		return 617309171 * (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2740);
	}

	public int method8835(int i) {
		if (null == ((Class224_Sub1) this).aClass254_9470)
			return 0;
		if (!((Class224_Sub1) this).aBool9479)
			return (617309171 * (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2740));
		Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50);
		if (class572 == null)
			return 0;
		return (int) (class572.hash * 381237825124074065L);
	}

	Class254 method3147() {
		if (null != ((Class224_Sub1) this).aClass254_9470)
			return ((Class224_Sub1) this).aClass254_9470;
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 == null) {
			if (((Class224_Sub1) this).aClass278_9481.method3745(807560231))
				return null;
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1279220810));
		}
		if (((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466).aBool11476)
			return null;
		byte[] is = ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10440((byte) 117);
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 instanceof Class572_Sub12_Sub16_Sub3) {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (((Class224_Sub1) this).anInt9475 * -1437101671), ((Class224_Sub1) this).aByteArray9483);
				if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2739) * 1333529401 != ((Class224_Sub1) this).anInt9469 * 286608599)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-1297205668))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 584120767));
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (-1437101671 * ((Class224_Sub1) this).anInt9475), ((Class224_Sub1) this).aByteArray9483);
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass278_9481.method3726(255, ((Class224_Sub1) this).anInt9467 * 579551495, -1969595114);
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-1969436915))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1337034916));
				return null;
			}
			if (((Class224_Sub1) this).aClass558_9465 != null)
				((Class224_Sub1) this).aClass267_9463.method3634(((Class224_Sub1) this).anInt9467 * 579551495, is, ((Class224_Sub1) this).aClass558_9465, (byte) 4);
		}
		((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
		if (null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aByteArray9477 = new byte[1312554635 * (((Class254) (((Class224_Sub1) this).aClass254_9470)).anInt2744)];
			((Class224_Sub1) this).anInt9474 = 0;
		}
		return ((Class224_Sub1) this).aClass254_9470;
	}

	void method3146(int i) {
		if (((Class224_Sub1) this).aClass558_9464 != null) {
			for (Class572 class572 = ((Class224_Sub1) this).aClass675_9461.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9461.method7926(1267053212)) {
				if (class572.hash * 381237825124074065L == (long) i)
					return;
			}
			Class572 class572 = new Class572();
			class572.hash = 8535728873556543153L * (long) i;
			((Class224_Sub1) this).aClass675_9461.method7940(class572, -1601471205);
		}
	}

	int method3143(int i, short i_10_) {
		Class572_Sub12_Sub16 class572_sub12_sub16 = ((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.get((long) i));
		if (class572_sub12_sub16 != null)
			return class572_sub12_sub16.method10441(1800793391);
		return 0;
	}

	public boolean method8836(int i) {
		return ((Class224_Sub1) this).aBool9478;
	}

	void method8837(boolean bool, byte i) {
		((Class224_Sub1) this).aClass617_9462.method7387(bool, (byte) 1);
	}

	void method8838() {
		if (null != ((Class224_Sub1) this).aClass675_9460 && method3136(1736931425) != null) {
			for (Class572 class572 = ((Class224_Sub1) this).aClass675_9461.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9461.method7926(327504529)) {
				int i = (int) (class572.hash * 381237825124074065L);
				if (i < 0 || i >= (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2744) * 1312554635 || 0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[i]))
					class572.method6794((byte) 94);
				else {
					if (((Class224_Sub1) this).aByteArray9477[i] == 0)
						method8860(i, 1, -696904315);
					if (-1 == ((Class224_Sub1) this).aByteArray9477[i])
						method8860(i, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] == 1)
						class572.method6794((byte) -45);
				}
			}
		}
	}

	public int method8839() {
		if (null == ((Class224_Sub1) this).aClass254_9470)
			return 0;
		if (!((Class224_Sub1) this).aBool9479)
			return (617309171 * (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2740));
		Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50);
		if (class572 == null)
			return 0;
		return (int) (class572.hash * 381237825124074065L);
	}

	Class254 method3142() {
		if (null != ((Class224_Sub1) this).aClass254_9470)
			return ((Class224_Sub1) this).aClass254_9470;
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 == null) {
			if (((Class224_Sub1) this).aClass278_9481.method3745(137440525))
				return null;
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1447560825));
		}
		if (((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466).aBool11476)
			return null;
		byte[] is = ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10440((byte) 126);
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 instanceof Class572_Sub12_Sub16_Sub3) {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (((Class224_Sub1) this).anInt9475 * -1437101671), ((Class224_Sub1) this).aByteArray9483);
				if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2739) * 1333529401 != ((Class224_Sub1) this).anInt9469 * 286608599)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-151957473))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1235288523));
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (-1437101671 * ((Class224_Sub1) this).anInt9475), ((Class224_Sub1) this).aByteArray9483);
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass278_9481.method3726(255, ((Class224_Sub1) this).anInt9467 * 579551495, -2024183319);
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-209378847))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 598257187));
				return null;
			}
			if (((Class224_Sub1) this).aClass558_9465 != null)
				((Class224_Sub1) this).aClass267_9463.method3634(((Class224_Sub1) this).anInt9467 * 579551495, is, ((Class224_Sub1) this).aClass558_9465, (byte) 4);
		}
		((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
		if (null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aByteArray9477 = new byte[1312554635 * (((Class254) (((Class224_Sub1) this).aClass254_9470)).anInt2744)];
			((Class224_Sub1) this).anInt9474 = 0;
		}
		return ((Class224_Sub1) this).aClass254_9470;
	}

	public int method8840() {
		return -287516197 * ((Class224_Sub1) this).anInt9474;
	}

	Class254 method3144() {
		if (null != ((Class224_Sub1) this).aClass254_9470)
			return ((Class224_Sub1) this).aClass254_9470;
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 == null) {
			if (((Class224_Sub1) this).aClass278_9481.method3745(-2054652136))
				return null;
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 516076725));
		}
		if (((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466).aBool11476)
			return null;
		byte[] is = ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10440((byte) 96);
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 instanceof Class572_Sub12_Sub16_Sub3) {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (((Class224_Sub1) this).anInt9475 * -1437101671), ((Class224_Sub1) this).aByteArray9483);
				if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2739) * 1333529401 != ((Class224_Sub1) this).anInt9469 * 286608599)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-590493728))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 674549539));
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (-1437101671 * ((Class224_Sub1) this).anInt9475), ((Class224_Sub1) this).aByteArray9483);
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass278_9481.method3726(255, ((Class224_Sub1) this).anInt9467 * 579551495, -1888803121);
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-2080169198))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 962802894));
				return null;
			}
			if (((Class224_Sub1) this).aClass558_9465 != null)
				((Class224_Sub1) this).aClass267_9463.method3634(((Class224_Sub1) this).anInt9467 * 579551495, is, ((Class224_Sub1) this).aClass558_9465, (byte) 4);
		}
		((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
		if (null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aByteArray9477 = new byte[1312554635 * (((Class254) (((Class224_Sub1) this).aClass254_9470)).anInt2744)];
			((Class224_Sub1) this).anInt9474 = 0;
		}
		return ((Class224_Sub1) this).aClass254_9470;
	}

	Class254 method3149() {
		if (null != ((Class224_Sub1) this).aClass254_9470)
			return ((Class224_Sub1) this).aClass254_9470;
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 == null) {
			if (((Class224_Sub1) this).aClass278_9481.method3745(-713273230))
				return null;
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 787929936));
		}
		if (((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466).aBool11476)
			return null;
		byte[] is = ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10440((byte) 66);
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 instanceof Class572_Sub12_Sub16_Sub3) {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (((Class224_Sub1) this).anInt9475 * -1437101671), ((Class224_Sub1) this).aByteArray9483);
				if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2739) * 1333529401 != ((Class224_Sub1) this).anInt9469 * 286608599)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(523526096))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 504394656));
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (-1437101671 * ((Class224_Sub1) this).anInt9475), ((Class224_Sub1) this).aByteArray9483);
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass278_9481.method3726(255, ((Class224_Sub1) this).anInt9467 * 579551495, -2080177093);
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-834099747))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1807643385));
				return null;
			}
			if (((Class224_Sub1) this).aClass558_9465 != null)
				((Class224_Sub1) this).aClass267_9463.method3634(((Class224_Sub1) this).anInt9467 * 579551495, is, ((Class224_Sub1) this).aClass558_9465, (byte) 4);
		}
		((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
		if (null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aByteArray9477 = new byte[1312554635 * (((Class254) (((Class224_Sub1) this).aClass254_9470)).anInt2744)];
			((Class224_Sub1) this).anInt9474 = 0;
		}
		return ((Class224_Sub1) this).aClass254_9470;
	}

	byte[] method3145(int i) {
		Class572_Sub12_Sub16 class572_sub12_sub16 = method8860(i, 0, -696904315);
		if (null == class572_sub12_sub16)
			return null;
		byte[] is = class572_sub12_sub16.method10440((byte) 91);
		class572_sub12_sub16.method6794((byte) -78);
		return is;
	}

	Class254 method3136(int i) {
		if (null != ((Class224_Sub1) this).aClass254_9470)
			return ((Class224_Sub1) this).aClass254_9470;
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 == null) {
			if (((Class224_Sub1) this).aClass278_9481.method3745(-2031074720))
				return null;
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1121788219));
		}
		if (((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466).aBool11476)
			return null;
		byte[] is = ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10440((byte) 78);
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 instanceof Class572_Sub12_Sub16_Sub3) {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (((Class224_Sub1) this).anInt9475 * -1437101671), ((Class224_Sub1) this).aByteArray9483);
				if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2739) * 1333529401 != ((Class224_Sub1) this).anInt9469 * 286608599)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-664162934))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 825164502));
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (-1437101671 * ((Class224_Sub1) this).anInt9475), ((Class224_Sub1) this).aByteArray9483);
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass278_9481.method3726(255, ((Class224_Sub1) this).anInt9467 * 579551495, -1868578937);
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-1194471009))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1209883770));
				return null;
			}
			if (((Class224_Sub1) this).aClass558_9465 != null)
				((Class224_Sub1) this).aClass267_9463.method3634(((Class224_Sub1) this).anInt9467 * 579551495, is, ((Class224_Sub1) this).aClass558_9465, (byte) 4);
		}
		((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
		if (null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aByteArray9477 = new byte[1312554635 * (((Class254) (((Class224_Sub1) this).aClass254_9470)).anInt2744)];
			((Class224_Sub1) this).anInt9474 = 0;
		}
		return ((Class224_Sub1) this).aClass254_9470;
	}

	void method3139(int i) {
		if (((Class224_Sub1) this).aClass558_9464 != null) {
			for (Class572 class572 = ((Class224_Sub1) this).aClass675_9461.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9461.method7926(118361978)) {
				if (class572.hash * 381237825124074065L == (long) i)
					return;
			}
			Class572 class572 = new Class572();
			class572.hash = 8535728873556543153L * (long) i;
			((Class224_Sub1) this).aClass675_9461.method7940(class572, -1870766562);
		}
	}

	int method3148(int i) {
		Class572_Sub12_Sub16 class572_sub12_sub16 = ((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.get((long) i));
		if (class572_sub12_sub16 != null)
			return class572_sub12_sub16.method10441(1800793391);
		return 0;
	}

	int method3141(int i) {
		Class572_Sub12_Sub16 class572_sub12_sub16 = ((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.get((long) i));
		if (class572_sub12_sub16 != null)
			return class572_sub12_sub16.method10441(1800793391);
		return 0;
	}

	void method3138(int i, int i_11_) {
		if (((Class224_Sub1) this).aClass558_9464 != null) {
			for (Class572 class572 = ((Class224_Sub1) this).aClass675_9461.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9461.method7926(1501514487)) {
				if (class572.hash * 381237825124074065L == (long) i)
					return;
			}
			Class572 class572 = new Class572();
			class572.hash = 8535728873556543153L * (long) i;
			((Class224_Sub1) this).aClass675_9461.method7940(class572, -1882290352);
		}
	}

	public int method8841(byte i) {
		return -287516197 * ((Class224_Sub1) this).anInt9474;
	}

	public int method8842() {
		if (method3136(973715204) == null) {
			if (null == ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466)
				return 0;
			return ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10441(1800793391);
		}
		return 100;
	}

	void method8843() {
		if (null != ((Class224_Sub1) this).aClass675_9460 && method3136(1315193400) != null) {
			for (Class572 class572 = ((Class224_Sub1) this).aClass675_9461.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9461.method7926(1106367570)) {
				int i = (int) (class572.hash * 381237825124074065L);
				if (i < 0 || i >= (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2744) * 1312554635 || 0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[i]))
					class572.method6794((byte) 58);
				else {
					if (((Class224_Sub1) this).aByteArray9477[i] == 0)
						method8860(i, 1, -696904315);
					if (-1 == ((Class224_Sub1) this).aByteArray9477[i])
						method8860(i, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] == 1)
						class572.method6794((byte) -104);
				}
			}
		}
	}

	void method8844() {
		if (null != ((Class224_Sub1) this).aClass675_9460 && method3136(958403691) != null) {
			for (Class572 class572 = ((Class224_Sub1) this).aClass675_9461.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9461.method7926(1065267356)) {
				int i = (int) (class572.hash * 381237825124074065L);
				if (i < 0 || i >= (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2744) * 1312554635 || 0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[i]))
					class572.method6794((byte) -55);
				else {
					if (((Class224_Sub1) this).aByteArray9477[i] == 0)
						method8860(i, 1, -696904315);
					if (-1 == ((Class224_Sub1) this).aByteArray9477[i])
						method8860(i, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] == 1)
						class572.method6794((byte) -6);
				}
			}
		}
	}

	void method8845() {
		if (((Class224_Sub1) this).aClass675_9460 != null) {
			if (method3136(817597438) == null)
				return;
			if (((Class224_Sub1) this).aBool9479) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(1842145856)) {
					int i = (int) (class572.hash * 381237825124074065L);
					if (0 == ((Class224_Sub1) this).aByteArray9477[i])
						method8860(i, 1, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] != 0)
						class572.method6794((byte) 52);
					else
						bool = false;
				}
				while (((Class224_Sub1) this).anInt9480 * -2141584979 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]) == 0)
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if ((((Class267) ((Class224_Sub1) this).aClass267_9463).anInt2845) * -929729343 >= 250) {
							bool = false;
							break;
						}
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0)
							method8860((((Class224_Sub1) this).anInt9480 * -2141584979), 1, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0) {
							Class572 class572 = new Class572();
							class572.hash = (-4961852955067205987L * (long) ((Class224_Sub1) this).anInt9480);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -1913266767);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9479 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else if (((Class224_Sub1) this).aBool9482) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(241403833)) {
					int i = (int) (class572.hash * 381237825124074065L);
					if (((Class224_Sub1) this).aByteArray9477[i] != 1)
						method8860(i, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] == 1)
						class572.method6794((byte) -18);
					else
						bool = false;
				}
				while (-2141584979 * ((Class224_Sub1) this).anInt9480 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if (0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]))
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if (((Class224_Sub1) this).aClass278_9481.method3723(-464783340)) {
							bool = false;
							break;
						}
						if (1 != (((Class224_Sub1) this).aByteArray9477[(-2141584979 * ((Class224_Sub1) this).anInt9480)]))
							method8860((-2141584979 * ((Class224_Sub1) this).anInt9480), 2, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) != 1) {
							Class572 class572 = new Class572();
							class572.hash = ((long) ((Class224_Sub1) this).anInt9480 * -4961852955067205987L);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -1477607607);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9482 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else
				((Class224_Sub1) this).aClass675_9460 = null;
		}
		if (((Class224_Sub1) this).aBool9484 && (Class69.method1067(-2129178392) >= ((Class224_Sub1) this).aLong9489 * 6675065276428167775L)) {
			for (Class572_Sub12_Sub16 class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7968((byte) 12); class572_sub12_sub16 != null; class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7969(-330247929)) {
				if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11476) {
					if (((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474) {
						if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475)
							throw new RuntimeException();
						class572_sub12_sub16.method6794((byte) 37);
					} else
						((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474 = true;
				}
			}
			((Class224_Sub1) this).aLong9489 = ((Class69.method1067(-1795252284) + 1000L) * -3593537682812489313L);
		}
	}

	public boolean method8846() {
		return ((Class224_Sub1) this).aBool9478;
	}

	void method8847() {
		if (((Class224_Sub1) this).aClass675_9460 != null) {
			if (method3136(1024285196) == null)
				return;
			if (((Class224_Sub1) this).aBool9479) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(490207227)) {
					int i = (int) (class572.hash * 381237825124074065L);
					if (0 == ((Class224_Sub1) this).aByteArray9477[i])
						method8860(i, 1, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] != 0)
						class572.method6794((byte) 12);
					else
						bool = false;
				}
				while (((Class224_Sub1) this).anInt9480 * -2141584979 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]) == 0)
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if ((((Class267) ((Class224_Sub1) this).aClass267_9463).anInt2845) * -929729343 >= 250) {
							bool = false;
							break;
						}
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0)
							method8860((((Class224_Sub1) this).anInt9480 * -2141584979), 1, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0) {
							Class572 class572 = new Class572();
							class572.hash = (-4961852955067205987L * (long) ((Class224_Sub1) this).anInt9480);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -1607333394);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9479 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else if (((Class224_Sub1) this).aBool9482) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(1096265554)) {
					int i = (int) (class572.hash * 381237825124074065L);
					if (((Class224_Sub1) this).aByteArray9477[i] != 1)
						method8860(i, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] == 1)
						class572.method6794((byte) -23);
					else
						bool = false;
				}
				while (-2141584979 * ((Class224_Sub1) this).anInt9480 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if (0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]))
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if (((Class224_Sub1) this).aClass278_9481.method3723(-241299575)) {
							bool = false;
							break;
						}
						if (1 != (((Class224_Sub1) this).aByteArray9477[(-2141584979 * ((Class224_Sub1) this).anInt9480)]))
							method8860((-2141584979 * ((Class224_Sub1) this).anInt9480), 2, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) != 1) {
							Class572 class572 = new Class572();
							class572.hash = ((long) ((Class224_Sub1) this).anInt9480 * -4961852955067205987L);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -1514412877);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9482 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else
				((Class224_Sub1) this).aClass675_9460 = null;
		}
		if (((Class224_Sub1) this).aBool9484 && (Class69.method1067(-1641199752) >= ((Class224_Sub1) this).aLong9489 * 6675065276428167775L)) {
			for (Class572_Sub12_Sub16 class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7968((byte) 1); class572_sub12_sub16 != null; class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7969(1388849949)) {
				if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11476) {
					if (((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474) {
						if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475)
							throw new RuntimeException();
						class572_sub12_sub16.method6794((byte) 106);
					} else
						((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474 = true;
				}
			}
			((Class224_Sub1) this).aLong9489 = ((Class69.method1067(-1708254504) + 1000L) * -3593537682812489313L);
		}
	}

	void method8848() {
		if (((Class224_Sub1) this).aClass675_9460 != null) {
			if (method3136(1280645314) == null)
				return;
			if (((Class224_Sub1) this).aBool9479) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(2090978428)) {
					int i = (int) (class572.hash * 381237825124074065L);
					if (0 == ((Class224_Sub1) this).aByteArray9477[i])
						method8860(i, 1, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] != 0)
						class572.method6794((byte) -46);
					else
						bool = false;
				}
				while (((Class224_Sub1) this).anInt9480 * -2141584979 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]) == 0)
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if ((((Class267) ((Class224_Sub1) this).aClass267_9463).anInt2845) * -929729343 >= 250) {
							bool = false;
							break;
						}
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0)
							method8860((((Class224_Sub1) this).anInt9480 * -2141584979), 1, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) == 0) {
							Class572 class572 = new Class572();
							class572.hash = (-4961852955067205987L * (long) ((Class224_Sub1) this).anInt9480);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -1687272896);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9479 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else if (((Class224_Sub1) this).aBool9482) {
				boolean bool = true;
				for (Class572 class572 = ((Class224_Sub1) this).aClass675_9460.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9460.method7926(1497066713)) {
					int i = (int) (class572.hash * 381237825124074065L);
					if (((Class224_Sub1) this).aByteArray9477[i] != 1)
						method8860(i, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i] == 1)
						class572.method6794((byte) -5);
					else
						bool = false;
				}
				while (-2141584979 * ((Class224_Sub1) this).anInt9480 < (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742).length) {
					if (0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[-2141584979 * ((Class224_Sub1) this).anInt9480]))
						((Class224_Sub1) this).anInt9480 += -901707227;
					else {
						if (((Class224_Sub1) this).aClass278_9481.method3723(-682912638)) {
							bool = false;
							break;
						}
						if (1 != (((Class224_Sub1) this).aByteArray9477[(-2141584979 * ((Class224_Sub1) this).anInt9480)]))
							method8860((-2141584979 * ((Class224_Sub1) this).anInt9480), 2, -696904315);
						if ((((Class224_Sub1) this).aByteArray9477[((Class224_Sub1) this).anInt9480 * -2141584979]) != 1) {
							Class572 class572 = new Class572();
							class572.hash = ((long) ((Class224_Sub1) this).anInt9480 * -4961852955067205987L);
							((Class224_Sub1) this).aClass675_9460.method7940(class572, -1714259604);
							bool = false;
						}
						((Class224_Sub1) this).anInt9480 += -901707227;
					}
				}
				if (bool) {
					((Class224_Sub1) this).aBool9482 = false;
					((Class224_Sub1) this).anInt9480 = 0;
				}
			} else
				((Class224_Sub1) this).aClass675_9460 = null;
		}
		if (((Class224_Sub1) this).aBool9484 && (Class69.method1067(-1754284324) >= ((Class224_Sub1) this).aLong9489 * 6675065276428167775L)) {
			for (Class572_Sub12_Sub16 class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7968((byte) 92); class572_sub12_sub16 != null; class572_sub12_sub16 = (Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.method7969(742248318)) {
				if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11476) {
					if (((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474) {
						if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475)
							throw new RuntimeException();
						class572_sub12_sub16.method6794((byte) -11);
					} else
						((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11474 = true;
				}
			}
			((Class224_Sub1) this).aLong9489 = ((Class69.method1067(-1898721748) + 1000L) * -3593537682812489313L);
		}
	}

	public int method8849() {
		if (((Class224_Sub1) this).aClass254_9470 == null)
			return 0;
		return 617309171 * (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2740);
	}

	public void method8850(byte i) {
		if (null == ((Class224_Sub1) this).aClass617_9462 && null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aBool9482 = true;
			((Class224_Sub1) this).aBool9478 = true;
			if (null == ((Class224_Sub1) this).aClass675_9460)
				((Class224_Sub1) this).aClass675_9460 = new Class675();
		}
	}

	public int method8851() {
		return -287516197 * ((Class224_Sub1) this).anInt9474;
	}

	void method8852(boolean bool) {
		((Class224_Sub1) this).aClass617_9462.method7387(bool, (byte) 1);
	}

	public void method8853() {
		if (null == ((Class224_Sub1) this).aClass617_9462 && null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aBool9482 = true;
			((Class224_Sub1) this).aBool9478 = true;
			if (null == ((Class224_Sub1) this).aClass675_9460)
				((Class224_Sub1) this).aClass675_9460 = new Class675();
		}
	}

	public boolean method8854() {
		return ((Class224_Sub1) this).aBool9478;
	}

	boolean method8855() {
		return null != ((Class224_Sub1) this).aClass617_9462;
	}

	boolean method8856() {
		return null != ((Class224_Sub1) this).aClass617_9462;
	}

	void method8857(boolean bool) {
		((Class224_Sub1) this).aClass617_9462.method7387(bool, (byte) 1);
	}

	Class224_Sub1(int i, Class558 class558, Class558 class558_12_, Class278 class278, Class617 class617, Class267 class267, int i_13_, byte[] is, int i_14_, boolean bool, int i_15_) {
		((Class224_Sub1) this).aClass675_9461 = new Class675();
		((Class224_Sub1) this).aLong9489 = 0L;
		((Class224_Sub1) this).anInt9467 = i * -591766345;
		((Class224_Sub1) this).aClass558_9464 = class558;
		if (((Class224_Sub1) this).aClass558_9464 == null)
			((Class224_Sub1) this).aBool9479 = false;
		else {
			((Class224_Sub1) this).aBool9479 = true;
			((Class224_Sub1) this).aClass675_9460 = new Class675();
		}
		((Class224_Sub1) this).aClass558_9465 = class558_12_;
		((Class224_Sub1) this).aClass278_9481 = class278;
		((Class224_Sub1) this).aClass617_9462 = class617;
		((Class224_Sub1) this).aClass267_9463 = class267;
		((Class224_Sub1) this).anInt9475 = -899075415 * i_13_;
		((Class224_Sub1) this).aByteArray9483 = is;
		((Class224_Sub1) this).anInt9469 = 1894147815 * i_14_;
		((Class224_Sub1) this).aBool9484 = bool;
		if (null != ((Class224_Sub1) this).aClass558_9465)
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass267_9463.method3635(579551495 * ((Class224_Sub1) this).anInt9467, ((Class224_Sub1) this).aClass558_9465, -1951409304));
	}

	void method8858(int i) {
		if (null != ((Class224_Sub1) this).aClass675_9460 && method3136(1935482363) != null) {
			for (Class572 class572 = ((Class224_Sub1) this).aClass675_9461.method7932((byte) 50); class572 != null; class572 = ((Class224_Sub1) this).aClass675_9461.method7926(1369135964)) {
				int i_16_ = (int) (class572.hash * 381237825124074065L);
				if (i_16_ < 0 || (i_16_ >= (((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2744) * 1312554635) || 0 == (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2742[i_16_]))
					class572.method6794((byte) 58);
				else {
					if (((Class224_Sub1) this).aByteArray9477[i_16_] == 0)
						method8860(i_16_, 1, -696904315);
					if (-1 == ((Class224_Sub1) this).aByteArray9477[i_16_])
						method8860(i_16_, 2, -696904315);
					if (((Class224_Sub1) this).aByteArray9477[i_16_] == 1)
						class572.method6794((byte) -59);
				}
			}
		}
	}

	boolean method8859() {
		return null != ((Class224_Sub1) this).aClass617_9462;
	}

	Class572_Sub12_Sub16 method8860(int i, int i_17_, int i_18_) {
		Class572_Sub12_Sub16 class572_sub12_sub16 = ((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass676_9476.get((long) i));
		if (class572_sub12_sub16 != null && i_17_ == 0 && !((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475 && ((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11476) {
			class572_sub12_sub16.method6794((byte) 25);
			class572_sub12_sub16 = null;
		}
		if (class572_sub12_sub16 == null) {
			if (0 == i_17_) {
				if (((Class224_Sub1) this).aClass558_9464 != null && -1 != ((Class224_Sub1) this).aByteArray9477[i])
					class572_sub12_sub16 = (((Class224_Sub1) this).aClass267_9463.method3635(i, ((Class224_Sub1) this).aClass558_9464, -1746866404));
				else if (null != ((Class224_Sub1) this).aClass617_9462) {
					class572_sub12_sub16 = (((Class224_Sub1) this).aClass617_9462.method7396(579551495 * ((Class224_Sub1) this).anInt9467, i, (byte) 2, true, (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2745[i]), (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2748[i]), (byte) 21));
					if (null == class572_sub12_sub16)
						return null;
				} else if (!((Class224_Sub1) this).aClass278_9481.method3745(-28532395))
					class572_sub12_sub16 = (((Class224_Sub1) this).aClass278_9481.method3722(579551495 * ((Class224_Sub1) this).anInt9467, i, (byte) 2, true, 523007728));
				else
					return null;
			} else if (i_17_ == 1) {
				if (((Class224_Sub1) this).aClass558_9464 == null)
					throw new RuntimeException();
				class572_sub12_sub16 = (((Class224_Sub1) this).aClass267_9463.method3642(i, ((Class224_Sub1) this).aClass558_9464, -1035993911));
			} else if (2 == i_17_) {
				if (((Class224_Sub1) this).aClass558_9464 == null)
					throw new RuntimeException();
				if (((Class224_Sub1) this).aByteArray9477[i] != -1)
					throw new RuntimeException();
				if (null != ((Class224_Sub1) this).aClass617_9462)
					return null;
				if (!((Class224_Sub1) this).aClass278_9481.method3723(-1335721520))
					class572_sub12_sub16 = (((Class224_Sub1) this).aClass278_9481.method3722(579551495 * ((Class224_Sub1) this).anInt9467, i, (byte) 2, false, 889479671));
				else
					return null;
			} else
				throw new RuntimeException();
			((Class224_Sub1) this).aClass676_9476.put(class572_sub12_sub16, (long) i);
		}
		if (((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11476)
			return null;
		byte[] is = class572_sub12_sub16.method10440((byte) 72);
		if (class572_sub12_sub16 instanceof Class572_Sub12_Sub16_Sub3) {
			Class572_Sub12_Sub16 class572_sub12_sub16_19_;
			try {
				if (null == is || is.length <= 2)
					throw new RuntimeException();
				aCRC32_9487.reset();
				aCRC32_9487.update(is, 0, is.length - 2);
				int i_20_ = (int) aCRC32_9487.getValue();
				if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2745[i]) != i_20_)
					throw new RuntimeException();
				if (null != (((Class254) ((Class224_Sub1) this).aClass254_9470).aByteArrayArray2747) && (null != (((Class254) ((Class224_Sub1) this).aClass254_9470).aByteArrayArray2747[i]))) {
					byte[] is_21_ = (((Class254) ((Class224_Sub1) this).aClass254_9470).aByteArrayArray2747[i]);
					byte[] is_22_ = Entity.method10573(is, 0, is.length - 2, 2113377329);
					for (int i_23_ = 0; i_23_ < 64; i_23_++) {
						if (is_21_[i_23_] != is_22_[i_23_])
							throw new RuntimeException();
					}
				}
				int i_24_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2748[i]) & 0xffff) != i_24_)
					throw new RuntimeException();
				if (1 != ((Class224_Sub1) this).aByteArray9477[i]) {
					if (0 != ((Class224_Sub1) this).aByteArray9477[i]) {
						/* empty */
					}
					((Class224_Sub1) this).anInt9474 += -2018936237;
					((Class224_Sub1) this).aByteArray9477[i] = (byte) 1;
				}
				if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475)
					class572_sub12_sub16.method6794((byte) -55);
				class572_sub12_sub16_19_ = class572_sub12_sub16;
			} catch (Exception exception) {
				((Class224_Sub1) this).aByteArray9477[i] = (byte) -1;
				class572_sub12_sub16.method6794((byte) -43);
				if (((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475) {
					if (((Class224_Sub1) this).aClass617_9462 != null) {
						if (!((Class224_Sub1) this).aClass617_9462.method7383(1143617166)) {
							Class572_Sub12_Sub16_Sub1 class572_sub12_sub16_sub1 = (((Class224_Sub1) this).aClass617_9462.method7396((579551495 * ((Class224_Sub1) this).anInt9467), i, (byte) 2, true, (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2745[i]), (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2748[i]), (byte) 90));
							if (class572_sub12_sub16_sub1 != null)
								((Class224_Sub1) this).aClass676_9476.put(class572_sub12_sub16_sub1, (long) i);
						}
					} else if (!((Class224_Sub1) this).aClass278_9481.method3745(-1791352249)) {
						Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = (((Class224_Sub1) this).aClass278_9481.method3722(((Class224_Sub1) this).anInt9467 * 579551495, i, (byte) 2, true, 751508968));
						((Class224_Sub1) this).aClass676_9476.put(class572_sub12_sub16_sub2, (long) i);
					}
				}
				return null;
			}
			return class572_sub12_sub16_19_;
		}
		try {
			if (null == is || is.length <= 2) {
				if (((Class224_Sub1) this).aClass617_9462 != null) {
					class572_sub12_sub16.method6794((byte) 11);
					return null;
				}
				throw new RuntimeException();
			}
			aCRC32_9487.reset();
			aCRC32_9487.update(is, 0, is.length - 2);
			int i_25_ = (int) aCRC32_9487.getValue();
			if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2745[i]) != i_25_)
				throw new RuntimeException();
			if ((((Class254) ((Class224_Sub1) this).aClass254_9470).aByteArrayArray2747) != null && null != (((Class254) ((Class224_Sub1) this).aClass254_9470).aByteArrayArray2747[i])) {
				byte[] is_26_ = (((Class254) ((Class224_Sub1) this).aClass254_9470).aByteArrayArray2747[i]);
				byte[] is_27_ = Entity.method10573(is, 0, is.length - 2, 2106461994);
				for (int i_28_ = 0; i_28_ < 64; i_28_++) {
					if (is_27_[i_28_] != is_26_[i_28_])
						throw new RuntimeException();
				}
			}
			if (((Class224_Sub1) this).aClass617_9462 != null) {
				((Class224_Sub1) this).aClass278_9481.anInt2942 = 0;
				((Class224_Sub1) this).aClass278_9481.anInt2943 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			((Class224_Sub1) this).aClass278_9481.method3726(579551495 * ((Class224_Sub1) this).anInt9467, i, -2123591576);
			class572_sub12_sub16.method6794((byte) 93);
			if (((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475) {
				if (null != ((Class224_Sub1) this).aClass617_9462) {
					if (!((Class224_Sub1) this).aClass617_9462.method7383(534020549)) {
						Class572_Sub12_Sub16_Sub1 class572_sub12_sub16_sub1 = (((Class224_Sub1) this).aClass617_9462.method7396(579551495 * ((Class224_Sub1) this).anInt9467, i, (byte) 2, true, (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2745[i]), (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2748[i]), (byte) 105));
						if (class572_sub12_sub16_sub1 != null)
							((Class224_Sub1) this).aClass676_9476.put(class572_sub12_sub16_sub1, (long) i);
					}
				} else if (!((Class224_Sub1) this).aClass278_9481.method3745(-471843144)) {
					Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = (((Class224_Sub1) this).aClass278_9481.method3722(579551495 * ((Class224_Sub1) this).anInt9467, i, (byte) 2, true, 1994767296));
					((Class224_Sub1) this).aClass676_9476.put(class572_sub12_sub16_sub2, (long) i);
				}
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2748[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class254) ((Class224_Sub1) this).aClass254_9470).anIntArray2748[i]);
		if (null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aClass267_9463.method3634(i, is, ((Class224_Sub1) this).aClass558_9464, (byte) 4);
			if (1 != ((Class224_Sub1) this).aByteArray9477[i]) {
				((Class224_Sub1) this).anInt9474 += -2018936237;
				((Class224_Sub1) this).aByteArray9477[i] = (byte) 1;
			}
		}
		if (!((Class572_Sub12_Sub16) class572_sub12_sub16).aBool11475)
			class572_sub12_sub16.method6794((byte) 30);
		return class572_sub12_sub16;
	}

	Class254 method3140() {
		if (null != ((Class224_Sub1) this).aClass254_9470)
			return ((Class224_Sub1) this).aClass254_9470;
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 == null) {
			if (((Class224_Sub1) this).aClass278_9481.method3745(414125254))
				return null;
			((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1608921853));
		}
		if (((Class572_Sub12_Sub16) ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466).aBool11476)
			return null;
		byte[] is = ((Class224_Sub1) this).aClass572_Sub12_Sub16_9466.method10440((byte) 94);
		if (((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 instanceof Class572_Sub12_Sub16_Sub3) {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (((Class224_Sub1) this).anInt9475 * -1437101671), ((Class224_Sub1) this).aByteArray9483);
				if ((((Class254) ((Class224_Sub1) this).aClass254_9470).anInt2739) * 1333529401 != ((Class224_Sub1) this).anInt9469 * 286608599)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-1866204859))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1666728168));
				return null;
			}
		} else {
			try {
				if (null == is)
					throw new RuntimeException();
				((Class224_Sub1) this).aClass254_9470 = new Class254(is, (-1437101671 * ((Class224_Sub1) this).anInt9475), ((Class224_Sub1) this).aByteArray9483);
			} catch (RuntimeException runtimeexception) {
				((Class224_Sub1) this).aClass278_9481.method3726(255, ((Class224_Sub1) this).anInt9467 * 579551495, -1902056641);
				((Class224_Sub1) this).aClass254_9470 = null;
				if (((Class224_Sub1) this).aClass278_9481.method3745(-1864176460))
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
				else
					((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = (((Class224_Sub1) this).aClass278_9481.method3722(255, ((Class224_Sub1) this).anInt9467 * 579551495, (byte) 0, true, 1858919233));
				return null;
			}
			if (((Class224_Sub1) this).aClass558_9465 != null)
				((Class224_Sub1) this).aClass267_9463.method3634(((Class224_Sub1) this).anInt9467 * 579551495, is, ((Class224_Sub1) this).aClass558_9465, (byte) 4);
		}
		((Class224_Sub1) this).aClass572_Sub12_Sub16_9466 = null;
		if (null != ((Class224_Sub1) this).aClass558_9464) {
			((Class224_Sub1) this).aByteArray9477 = new byte[1312554635 * (((Class254) (((Class224_Sub1) this).aClass254_9470)).anInt2744)];
			((Class224_Sub1) this).anInt9474 = 0;
		}
		return ((Class224_Sub1) this).aClass254_9470;
	}
}

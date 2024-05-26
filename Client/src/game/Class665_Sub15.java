package game;

/* Class665_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class665_Sub15 extends Class665 {
	static final int MAX_VOLUME = 255;
	static final int MIN_VOLUME = 0;

	void method7855(int i) {
		volume = 2081142341 * i;
	}

	public void method8969(byte i) {
		if (-767431539 * volume < 0 && volume * -767431539 > 255) {
			volume = method7858((byte) -126) * 2081142341;

		}
		/*if(this == Class213.aClass572_Sub24_2463.musicVolume)
			throw new RuntimeException();*/
		//System.out.println("123: "+method8970(0)+", "+(this == Class213.aClass572_Sub24_2463.musicVolume));
	}

	int method7863(int i, int i_0_) {
		return 1;
	}

	public Class665_Sub15(Class572_Sub24 class572_sub24) {
		super(class572_sub24);
	}

	int method7861() {
		return 127;
	}

	void setVolume(int i, byte i_1_) {
		volume = 2081142341 * i;
	}

	public int method8970(int i) {
		return -767431539 * volume;
	}

	void method7865(int i) {
		volume = 2081142341 * i;
	}

	int method7862(int i) {
		return 1;
	}

	int method7856(int i) {
		return 1;
	}

	int method7864(int i) {
		return 1;
	}

	int method7857(int i) {
		return 1;
	}

	public void method8971() {
		if (-767431539 * volume < 0 && volume * -767431539 > 255)
			volume = method7858((byte) -95) * 2081142341;
	}

	public Class665_Sub15(int i, Class572_Sub24 class572_sub24) {
		super(i, class572_sub24);
	}

	int method7858(byte i) {
		return 127;
	}

	public void method8972() {
		if (-767431539 * volume < 0 && volume * -767431539 > 255)
			volume = method7858((byte) -100) * 2081142341;
	}

	public void method8973() {
		if (-767431539 * volume < 0 && volume * -767431539 > 255)
			volume = method7858((byte) -33) * 2081142341;
	}

	public int method8974() {
		return -767431539 * volume;
	}

	public int method8975() {
		return -767431539 * volume;
	}

	static GameTask createGameTask(int i, long l) {
		GameTask.aBool11435 = false;
		GameTask class572_sub12_sub11 = (GameTask) GameTask.aClass676_11431.get((long) i << 56 | l);
		if (class572_sub12_sub11 == null) {
			class572_sub12_sub11 = new GameTask(i, l);
			GameTask.aClass676_11431.put(class572_sub12_sub11, 381237825124074065L * class572_sub12_sub11.hash);
			GameTask.aBool11435 = true;
		}
		return class572_sub12_sub11;
	}
}

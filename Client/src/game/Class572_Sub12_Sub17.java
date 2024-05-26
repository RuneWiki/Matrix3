package game;

/* Class572_Sub12_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class572_Sub12_Sub17 extends Class572_Sub12 {
	public int anInt11479;

	Class572_Sub12_Sub17(int i) {
		anInt11479 = i * 1344748223;
	}

	public abstract void method10447(float f, int i);

	public abstract void method10448(Class403 class403, Class261 class261, Class250 class250, byte i);

	public abstract void method10449(RSByteBuffer class572_sub15, byte i);

	public abstract void method10450(float f);

	public abstract void method10451(float f);

	public abstract void method10452(float f);

	public abstract void method10453(Class403 class403, Class261 class261, Class250 class250);

	public abstract void method10454(Class403 class403, Class261 class261, Class250 class250);

	public abstract void method10455(RSByteBuffer class572_sub15);

	public static void method10456(short i) {
		synchronized (Class458.aQueue5202) {
			for (;;) {
				Class572_Sub13_Sub1 class572_sub13_sub1 = (Class572_Sub13_Sub1) Class458.aQueue5202.poll();
				if (null == class572_sub13_sub1)
					break;
				class572_sub13_sub1.method8421(421222932);
			}
		}
	}
}

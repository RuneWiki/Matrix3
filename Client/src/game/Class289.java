package game;

/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class289 {
	public static Class639_Sub16 aClass639_Sub16_3426;

	public abstract int method3886(Object object, int i);

	public abstract void method3887(byte i);

	public abstract Object method3888(int i, int i_0_, Class297 class297, Class298 class298, int i_1_, float f, byte i_2_);

	public abstract Class605 method3889(Class612 class612);

	public abstract void method3890(Object object, byte[] is, int i, int i_3_, int i_4_);

	public abstract Class294 method3891();

	public abstract Class605 method3892(Class612 class612, byte i);

	abstract Object method3893(Class374 class374, byte i);

	public abstract Class294 method3894(int i);

	public abstract void method3895(byte i);

	public abstract int method3896(Object object);

	public abstract int method3897(Object object);

	public abstract Object method3898(int i, int i_5_, Class297 class297, Class298 class298, int i_6_, float f);

	public abstract void method3899(Object object, int i);

	public abstract Object method3900(int i, int i_7_, Class297 class297, Class298 class298, int i_8_, float f);

	public abstract Object method3901(int i, int i_9_, Class297 class297, Class298 class298, int i_10_, float f);

	public abstract Object method3902(int i, int i_11_, Class297 class297, Class298 class298, int i_12_, float f);

	Class289() {
		/* empty */
	}

	public abstract void method3903(Object object);

	public abstract void method3904(Object object);

	public abstract void method3905(Object object);

	public abstract void method3906();

	public abstract Object method3907(int i, int i_13_, Class297 class297, Class298 class298, int i_14_, float f);

	abstract Object method3908(Class374 class374);

	public abstract Class294 method3909();

	public abstract Class294 method3910();

	public abstract Object method3911(int i, int i_15_, Class297 class297, Class298 class298, int i_16_, float f);

	abstract Object method3912(Class374 class374);

	public abstract void method3913();

	public abstract void method3914();

	public abstract void method3915();

	public abstract Class605 method3916(Class612 class612);

	public abstract void method3917();

	public abstract Class605 method3918(Class612 class612);

	public abstract void method3919(Object object, byte[] is, int i, int i_17_);

	static void method3920(RSByteBuffer class572_sub15, byte i) {
		int i_18_ = class572_sub15.readUnsignedSmart(-612560632);
		Class665_Sub11.aClass490Array8930 = new Class490[i_18_];
		for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
			Class665_Sub11.aClass490Array8930[i_19_] = new Class490();
			((Class490) Class665_Sub11.aClass490Array8930[i_19_]).anInt5465 = class572_sub15.readUnsignedSmart(460144112) * 1251833303;
			((Class490) Class665_Sub11.aClass490Array8930[i_19_]).aString5464 = class572_sub15.readVersionedString(-918321712);
		}
		Class488.anInt5454 = class572_sub15.readUnsignedSmart(-1485970599) * -692448587;
		Class297.anInt3474 = class572_sub15.readUnsignedSmart(-1214924958) * 186193913;
		Class488.anInt5456 = class572_sub15.readUnsignedSmart(-1862767067) * 1770457459;
		Class488.aClass481_Sub1Array5455 = new Class481_Sub1[(2041051721 * Class297.anInt3474 - -302396515 * Class488.anInt5454 + 1)];
		for (int i_20_ = 0; i_20_ < Class488.anInt5456 * -1261354053; i_20_++) {
			int i_21_ = class572_sub15.readUnsignedSmart(-738988217);
			Class481_Sub1 class481_sub1 = (Class488.aClass481_Sub1Array5455[i_21_] = new Class481_Sub1());
			((Class481_Sub1) class481_sub1).anInt5359 = class572_sub15.readUnsignedByte(2112930618) * 1019676757;
			class481_sub1.anInt5358 = class572_sub15.readInt(1616800852) * 1196358345;
			((Class481_Sub1) class481_sub1).anInt8941 = class572_sub15.readUnsignedSmart(1275251010) * 1843114741;
			if (0 != ((Class481_Sub1) class481_sub1).anInt8941 * 11790685)
				((Class481_Sub1) class481_sub1).aString8942 = class572_sub15.readVersionedString(-1689083277);
			class481_sub1.anInt8939 = (-302396515 * Class488.anInt5454 + i_21_) * -1580049721;
			class481_sub1.aString8937 = class572_sub15.readVersionedString(-1274443549);
			class481_sub1.aString8938 = class572_sub15.readVersionedString(-1815499099);
		}
		Class133_Sub4_Sub2.anInt11203 = class572_sub15.readInt(-473477127) * -1462316861;
		Class488.aBool5450 = true;
	}

	static void method3921(short i) {
		if (Class584.anInt7742 * 133994349 > 1)
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub33_9238), 4, 1539385171);
		else
			Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub33_9238), 2, 1870807185);
	}
}

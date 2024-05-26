package game;

/* Class133_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class133_Sub4 extends Class133 {
	int anInt9833;
	int anInt9834;
	int anInt9835;

	boolean method2306() {
		GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(((((Class133_Sub4) this).anInt9833) * -1825058389), 390604218));
		boolean bool = class659.method7767(-1535064153);
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659.anInt8433, 352771071));
		bool &= class132.method2291(1006110092);
		return bool;
	}

	boolean method2305(int i) {
		GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(((((Class133_Sub4) this).anInt9833) * -1825058389), 1788335351));
		boolean bool = class659.method7767(-1457364440);
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659.anInt8433, -1486241380));
		bool &= class132.method2291(770728289);
		return bool;
	}

	Class133_Sub4(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub4) this).anInt9833 = class572_sub15.readUnsignedShort(647518597) * 2121572611;
		((Class133_Sub4) this).anInt9834 = class572_sub15.readUnsignedShort(647518597) * 381806073;
		((Class133_Sub4) this).anInt9835 = class572_sub15.readUnsignedByte(87007694) * -759567287;
	}

	boolean method2307() {
		GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(((((Class133_Sub4) this).anInt9833) * -1825058389), -1878843664));
		boolean bool = class659.method7767(-641926983);
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659.anInt8433, 1137107997));
		bool &= class132.method2291(852314669);
		return bool;
	}

	boolean method2308() {
		GraphicsDefinition class659 = ((GraphicsDefinition) Class667.aClass639_Sub10_8509.getDefinition(((((Class133_Sub4) this).anInt9833) * -1825058389), -1601618732));
		boolean bool = class659.method7767(-952788035);
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659.anInt8433, -1039326718));
		bool &= class132.method2291(-49414574);
		return bool;
	}

	public static void method9339(boolean bool, int i) {
		if (1 != client.anInt8646 * 1797623853 && 0 != client.anInt8646 * 1797623853) {
			if (!bool) {
				if (Class122.aClass133Array1481 != null) {
					Class133[] class133s = Class122.aClass133Array1481;
					for (int i_0_ = 0; i_0_ < class133s.length; i_0_++) {
						Class133 class133 = class133s[i_0_];
						class133.method2304(1282497210);
					}
				}
				if (-1 != 1309474421 * Class122.anInt1492)
					Class344.audio.sendMusic((Class122.anInt1492 * 1309474421), 255);
			}
			client.anInt8646 = 1575698341;
			Class481.aClass572_Sub15_5361 = null;
			client.aBool8647 = false;
			if (Class122.anInt1493 * -2026408359 > 0)
				Class567.method6723(Class530.aClass530_5923, Class122.anInt1493 * -2026408359, -1, (short) -31743);
			Class600.method7064(-592554779);
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3720, client.aClass195_8589.aClass650_2340, -927039071);
			class572_sub25.aRsByteBuffer.writeByte(bool ? 1 : 0, -1384395473);
			client.aClass195_8589.method2929(class572_sub25, (byte) -36);
		}
	}

	public static final void method9340(int i, short i_1_) {
		for (int i_2_ = 0; i_2_ < 5; i_2_++)
			client.aBoolArray8842[i_2_] = false;
		client.anInt8690 = 1542880195;
		client.anInt8711 = -527050097;
		Class643.anInt8310 = 0;
		Class347.anInt4389 = 0;
		Class419.anInt4958 = 1724865785;
		Class566.anInt6375 = 2114279121;
		Class18.anInt143 = i * 1860248359;
		if (Class18.anInt143 * 625220759 != 1)
			Class218.aLong2511 = 0L;
	}

	static final void method9341(Class456_Sub1 class456_sub1, int i, boolean bool, boolean bool_3_, int i_4_) {
		int i_5_;
		int i_6_;
		if (class456_sub1 instanceof Class456_Sub1_Sub2 && class456_sub1 instanceof Interface65) {
			Class456_Sub1_Sub2 class456_sub1_sub2 = (Class456_Sub1_Sub2) class456_sub1;
			int i_7_ = ((class456_sub1_sub2.aShort11499 - class456_sub1_sub2.aShort11503 + 1) << 9);
			int i_8_ = ((class456_sub1_sub2.aShort11502 - class456_sub1_sub2.aShort11500 + 1) << 9);
			i_5_ = (class456_sub1_sub2.aShort11503 << 9) + i_7_ / 2;
			i_6_ = i_8_ / 2 + (class456_sub1_sub2.aShort11500 << 9);
		} else {
			Class240 class240 = class456_sub1.method5394().aClass240_2647;
			i_5_ = (int) class240.aFloat2653;
			i_6_ = (int) class240.aFloat2657;
		}
		Class268.method3654(class456_sub1.aByte9009, i_5_, i_6_, 0, i, bool, bool_3_, -1263655559);
	}

	public static void method9342(int i, int i_9_) {
		Class183.anInt2153 = i * -161818577;
		InterfaceDefinitions.aClass127_823.method2231((byte) -2);
	}
}

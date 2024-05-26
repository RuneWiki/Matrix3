package game;

/* Class133_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

public class Class133_Sub5 extends Class133 {
	int anInt9836;
	int[] anIntArray9837;
	int anInt9838;
	int anInt9839;

	boolean method2307() {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition((19820865 * (((Class133_Sub5) this).anInt9836)), 1302900226));
		return class132.method2291(1871973395);
	}

	boolean method2305(int i) {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition((19820865 * (((Class133_Sub5) this).anInt9836)), -1265993659));
		return class132.method2291(-125105156);
	}

	boolean method2308() {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition((19820865 * (((Class133_Sub5) this).anInt9836)), -1750971739));
		return class132.method2291(1452438429);
	}

	public void method2309() {
		Entity class456_sub1_sub2_sub3 = Class122.aClass130Array1483[-671511571 * ((Class133_Sub5) this).anInt9839].method2268(-1863282550);
		if (-1999081529 * ((Class133_Sub5) this).anInt9838 == 0)
			Class565.method6699(class456_sub1_sub2_sub3, ((Class133_Sub5) this).anIntArray9837, 0, false, (short) -3760);
		else
			Class102_Sub3.method9564(class456_sub1_sub2_sub3, new int[] { ((Class133_Sub5) this).anInt9836 * 19820865 }, new int[] { 0 }, new int[] { -1999081529 * ((Class133_Sub5) this).anInt9838 }, (byte) 4);
	}

	boolean method2306() {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition((19820865 * (((Class133_Sub5) this).anInt9836)), 1797079168));
		return class132.method2291(-258042442);
	}

	public void method2303(int i) {
		Entity class456_sub1_sub2_sub3 = Class122.aClass130Array1483[-671511571 * ((Class133_Sub5) this).anInt9839].method2268(-1832059092);
		if (-1999081529 * ((Class133_Sub5) this).anInt9838 == 0)
			Class565.method6699(class456_sub1_sub2_sub3, ((Class133_Sub5) this).anIntArray9837, 0, false, (short) 447);
		else
			Class102_Sub3.method9564(class456_sub1_sub2_sub3, new int[] { ((Class133_Sub5) this).anInt9836 * 19820865 }, new int[] { 0 }, new int[] { -1999081529 * ((Class133_Sub5) this).anInt9838 }, (byte) 4);
	}

	Class133_Sub5(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub5) this).anInt9839 = class572_sub15.readUnsignedShort(647518597) * -185300507;
		((Class133_Sub5) this).anIntArray9837 = new int[4];
		((Class133_Sub5) this).anInt9836 = class572_sub15.readBigSmart((byte) 85) * 636952257;
		Arrays.fill(((Class133_Sub5) this).anIntArray9837, 0, ((Class133_Sub5) this).anIntArray9837.length, 19820865 * ((Class133_Sub5) this).anInt9836);
		((Class133_Sub5) this).anInt9838 = class572_sub15.readInt(1502928554) * 539009527;
	}

	static final void method9343(Cs2Executor class441, short i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class616.method7379(class73, class83, class441, (byte) -17);
	}

	public static void method9344(int i, int i_0_, int i_1_, ObjectDefinitions class509, int i_2_) {
		for (Class572_Sub27 class572_sub27 = ((Class572_Sub27) Class572_Sub27.aClass675_9272.method7932((byte) 50)); class572_sub27 != null; class572_sub27 = (Class572_Sub27) Class572_Sub27.aClass675_9272.method7926(1923633521)) {
			if (i == ((Class572_Sub27) class572_sub27).anInt9274 * -934594101 && (i_0_ << 9 == ((Class572_Sub27) class572_sub27).anInt9264 * 603635959) && (((Class572_Sub27) class572_sub27).anInt9265 * -287796001 == i_1_ << 9) && (class509.anInt5607 * -131590913 == -131590913 * (((Class572_Sub27) class572_sub27).aClass509_9260.anInt5607))) {
				if (null != ((Class572_Sub27) class572_sub27).aClass603_9285) {
					((Class572_Sub27) class572_sub27).aClass603_9285.method7098(100, -1110366939);
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), -774737820);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
				class572_sub27.method6794((byte) 3);
				break;
			}
		}
	}

	static void method9345(int i) {
		Class13.aClass195_96.method2926((byte) -40);
		((Class195) Class13.aClass195_96).aClass572_Sub15_Sub2_2330.o = 0;
		((Class195) Class13.aClass195_96).currentPacket = null;
		((Class195) Class13.aClass195_96).aClass321_2334 = null;
		((Class195) Class13.aClass195_96).aClass321_2342 = null;
		((Class195) Class13.aClass195_96).aClass321_2343 = null;
		((Class195) Class13.aClass195_96).anInt2333 = 0;
		((Class195) Class13.aClass195_96).anInt2335 = 0;
		client.anInt8604 = 0;
		Class19.method688((byte) 76);
		Class378.method4633(1146528256);
		for (int i_3_ = 0; i_3_ < 2048; i_3_++)
			client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_3_] = null;
		Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 = null;
		for (int i_4_ = 0; i_4_ < 617551237 * client.anInt8624; i_4_++) {
			Entity class456_sub1_sub2_sub3 = ((Entity) client.aClass572_Sub9Array8623[i_4_].anObject9081);
			if (null != class456_sub1_sub2_sub3)
				class456_sub1_sub2_sub3.anInt11619 = -320688299;
		}
		Class63.method1020(-614986849);
		Class133_Sub4.method9340(Class111.method2081((byte) 1), (short) 1571);
		Class463.method5478(1, 578850476);
		for (int i_5_ = 0; i_5_ < 107; i_5_++)
			client.aBoolArray8784[i_5_] = true;
		Class627.method7476(Class13.aClass195_96, (byte) -99);
		Class273.aClass461_2902 = null;
		Class324.aLong4087 = 0L;
		Class479.method5672(2143898244);
		Class306.clientConfigsDomain.method9959((byte) 58);
	}
}

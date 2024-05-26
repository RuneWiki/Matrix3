package game;

/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;

public class Class12 {
	static final int anInt49 = 2;
	static final String aString50 = "services";
	static final String aString51 = "passwordchoice.ws";
	static final int anInt52 = 1000;
	static BigInteger aBigInteger53 = (new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"));
	static BigInteger aBigInteger54 = (new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"));
	static final int anInt55 = 2;
	static final int anInt56 = 4;
	static final String aString57 = "m=accountappeal/login.ws";
	public static final int anInt58 = 5;
	static final int anInt59 = 6;
	static final int anInt60 = 7;
	static final int anInt61 = 3;

	public static long method555() {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class565.method6700("services", false, -547929225)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class572_sub15 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i = inputstream.read(class572_sub15.b, class572_sub15.o * -1585139053, 1000 - (-1585139053 * class572_sub15.o));
				if (-1 == i)
					break;
				class572_sub15.o += 310393755 * i;
				if (-1585139053 * class572_sub15.o >= 1000)
					return 0L;
			}
			class572_sub15.o = 0;
			long l_0_ = class572_sub15.method8476((byte) 4);
			l = l_0_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	public static long method556() {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class565.method6700("services", false, -233682365)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class572_sub15 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i = inputstream.read(class572_sub15.b, class572_sub15.o * -1585139053, 1000 - (-1585139053 * class572_sub15.o));
				if (-1 == i)
					break;
				class572_sub15.o += 310393755 * i;
				if (-1585139053 * class572_sub15.o >= 1000)
					return 0L;
			}
			class572_sub15.o = 0;
			long l_1_ = class572_sub15.method8476((byte) 4);
			l = l_1_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	public static long method557() {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class565.method6700("services", false, -560906178)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class572_sub15 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i = inputstream.read(class572_sub15.b, class572_sub15.o * -1585139053, 1000 - (-1585139053 * class572_sub15.o));
				if (-1 == i)
					break;
				class572_sub15.o += 310393755 * i;
				if (-1585139053 * class572_sub15.o >= 1000)
					return 0L;
			}
			class572_sub15.o = 0;
			long l_2_ = class572_sub15.method8476((byte) 4);
			l = l_2_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}

	Class12() throws Throwable {
		throw new Error();
	}

	static void method558(InterfaceDefinitions class73, Class167 class167, int i, int i_3_, int i_4_, int i_5_, Class161 class161, double d, Class39 class39, Class75 class75, byte i_6_) {
		if (class161 != null) {
			int i_7_;
			if (625220759 * Class18.anInt143 == 1)
				i_7_ = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) + client.anInt8766 * -777638353) & 0x3fff;
			else if (6 == Class18.anInt143 * 625220759)
				i_7_ = (int) client.aFloat8678 & 0x3fff;
			else
				i_7_ = (client.anInt8766 * -777638353 + (int) client.aFloat8678 & 0x3fff);
			int i_8_ = (Math.max(class73.anInt764 * 669238293 / 2, 1360982075 * class73.anInt765 / 2) + 10);
			int i_9_ = i_4_ * i_4_ + i_5_ * i_5_;
			if (i_9_ <= i_8_ * i_8_) {
				int i_10_ = Class325.anIntArray4103[i_7_];
				int i_11_ = Class325.anIntArray4105[i_7_];
				if (Class18.anInt143 * 625220759 != 6) {
					i_10_ = i_10_ * 256 / (256 + client.anInt8670 * -1034566343);
					i_11_ = 256 * i_11_ / (client.anInt8670 * -1034566343 + 256);
				}
				int i_12_ = i_5_ * i_10_ + i_4_ * i_11_ >> 14;
				int i_13_ = i_5_ * i_11_ - i_4_ * i_10_ >> 14;
				double d_14_ = d / 100.0;
				switch (1362534335 * class39.anInt401) {
					case 1:
						i = (class73.anInt764 * 669238293 / 2 + i + i_12_ - (int) ((double) class161.method45() * d_14_));
						break;
					case 0:
						i = class73.anInt764 * 669238293 / 2 + i + i_12_;
						break;
					case 2:
						i = (i + 669238293 * class73.anInt764 / 2 + i_12_ - (int) ((double) (class161.method45() / 2) * d_14_));
						break;
				}
				switch (class75.anInt941 * 94437597) {
					case 0:
						i_3_ = (1360982075 * class73.anInt765 / 2 + i_3_ - i_13_ - (int) ((double) (class161.method2589() / 2) * d_14_));
						break;
					case 1:
						i_3_ = (i_3_ + class73.anInt765 * 1360982075 / 2 - i_13_ - (int) ((double) class161.method2589() * d_14_));
						break;
					case 2:
						i_3_ = i_3_ + class73.anInt765 * 1360982075 / 2 - i_13_;
						break;
				}
				if (class167 != null) {
					if (1.0 == d_14_)
						class161.method2596(i, i_3_, class167, i, i_3_);
					else
						class161.method2597(i, i_3_, (int) ((double) class161.method45() * d_14_), (int) ((double) class161.method2589() * d_14_));
				} else {
					if (1.0 == d_14_)
						class161.method2595(i, i_3_);
					class161.method2597(i, i_3_, (int) ((double) class161.method45() * d_14_), (int) ((double) class161.method2589() * d_14_));
				}
			}
		}
	}

	static Class161 method559(byte[] is, int i) {
		if (is == null)
			throw new RuntimeException("");
		Class161 class161;
		for (;;) {
			try {
				Image image = Toolkit.getDefaultToolkit().createImage(is);
				MediaTracker mediatracker = new MediaTracker(VarTransmitLevel.anApplet8067);
				mediatracker.addImage(image, 0);
				mediatracker.waitForAll();
				int i_15_ = image.getWidth(VarTransmitLevel.anApplet8067);
				int i_16_ = image.getHeight(VarTransmitLevel.anApplet8067);
				if (mediatracker.isErrorAny() || i_15_ < 0 || i_16_ < 0)
					throw new RuntimeException("");
				int[] is_17_ = new int[i_15_ * i_16_];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_15_, i_16_, is_17_, 0, i_15_);
				pixelgrabber.grabPixels();
				class161 = Class272_Sub2.aClass106_9517.method1744(is_17_, 0, i_15_, i_15_, i_16_, -1822983681);
				break;
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
		return class161;
	}

	static final void method560(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		if ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]) >= (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]))
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]));
	}

	static final void method561(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_18_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		boolean bool = ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]) == 1);
		if (Class547_Sub1.aClass676_8997 != null) {
			Class572 class572 = Class547_Sub1.aClass676_8997.get((long) i_18_);
			if (null != class572 && !bool)
				class572.method6794((byte) -89);
			else if (class572 == null && bool) {
				class572 = new Class572();
				Class547_Sub1.aClass676_8997.put(class572, (long) i_18_);
			}
		}
	}

	static final void method562(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		class73.anInt772 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 314283547;
	}

	public static Class572_Sub17 method563(Class572_Sub17 class572_sub17, int i) {
		synchronized (Class572_Sub17.aClass572_Sub17Array9125) {
			if (Class572_Sub17.anInt9128 * 1081174397 == 0) {
				Class572_Sub17 class572_sub17_19_ = new Class572_Sub17(class572_sub17);
				return class572_sub17_19_;
			}
			Class572_Sub17.aClass572_Sub17Array9125[(Class572_Sub17.anInt9128 -= -1776478251) * 1081174397].method8571(class572_sub17, (byte) 0);
			Class572_Sub17 class572_sub17_20_ = (Class572_Sub17.aClass572_Sub17Array9125[1081174397 * Class572_Sub17.anInt9128]);
			return class572_sub17_20_;
		}
	}

	static final void method564(Cs2Executor class441, int i) {
		Class315.method4079(749618361 * Class547_Sub1.anInt8979, (byte) 7);
	}

	static void method565(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 2] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 2]), -1188900108))).anIntArrayArray4626[(((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1])][0]);
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}

	public static void method566(int[] is, float[] fs, float[] fs_21_, int i) {
		Class287.method3870(is, fs, fs_21_, 0, is.length - 1, -379867008);
	}

	static void method567(int i, int i_22_, int i_23_, boolean bool, int i_24_, boolean bool_25_, byte i_26_) {
		if (i < i_22_) {
			int i_27_ = (i_22_ + i) / 2;
			int i_28_ = i;
			Class481_Sub1 class481_sub1 = Class633.aClass481_Sub1Array8207[i_27_];
			Class633.aClass481_Sub1Array8207[i_27_] = Class633.aClass481_Sub1Array8207[i_22_];
			Class633.aClass481_Sub1Array8207[i_22_] = class481_sub1;
			for (int i_29_ = i; i_29_ < i_22_; i_29_++) {
				if (MaterialInformation.method1607((Class633.aClass481_Sub1Array8207[i_29_]), class481_sub1, i_23_, bool, i_24_, bool_25_, (byte) 23) <= 0) {
					Class481_Sub1 class481_sub1_30_ = Class633.aClass481_Sub1Array8207[i_29_];
					Class633.aClass481_Sub1Array8207[i_29_] = Class633.aClass481_Sub1Array8207[i_28_];
					Class633.aClass481_Sub1Array8207[i_28_++] = class481_sub1_30_;
				}
			}
			Class633.aClass481_Sub1Array8207[i_22_] = Class633.aClass481_Sub1Array8207[i_28_];
			Class633.aClass481_Sub1Array8207[i_28_] = class481_sub1;
			method567(i, i_28_ - 1, i_23_, bool, i_24_, bool_25_, (byte) -127);
			method567(1 + i_28_, i_22_, i_23_, bool, i_24_, bool_25_, (byte) -31);
		}
	}
}

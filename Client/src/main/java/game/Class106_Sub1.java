package game;

/* Class106_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.Canvas;
import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class Class106_Sub1 extends Class106 {
	float aFloat9991;
	float aFloat9992;
	static final int anInt9993 = 0;
	boolean aBool9994;
	String aString9995;
	static final int anInt9996 = 4;
	static final int anInt9997 = 8;
	float[] aFloatArray9998;
	static final int anInt9999 = 32;
	static final int anInt10000 = 32993;
	static final int anInt10001 = 5121;
	static final int anInt10002 = 5123;
	static final int anInt10003 = 5126;
	static final int anInt10004 = 4;
	static final int anInt10005 = 7;
	static final int anInt10006 = 128;
	static final int anInt10007 = -1;
	static final int anInt10008 = -2;
	static final int anInt10009 = 1;
	static final int anInt10010 = 8448;
	float aFloat10011;
	static final int anInt10012 = 34023;
	static final int anInt10013 = 34165;
	static final int anInt10014 = 34479;
	static final int anInt10015 = 34168;
	static final int anInt10016 = 260;
	static final int anInt10017 = 34167;
	Class86 aClass86_10018;
	static final int anInt10019 = 770;
	static final int anInt10020 = 768;
	static final int anInt10021 = 100663296;
	Unsafe anUnsafe10022;
	static final int anInt10023 = 2;
	static final int anInt10024 = 0;
	Class675 aClass675_10025;
	static final int anInt10026 = 2;
	static final int anInt10027 = 3;
	static final int anInt10028 = 1;
	static final int anInt10029 = 2;
	static final int anInt10030 = 4;
	static final int anInt10031 = 8;
	Class675 aClass675_10032;
	static final int anInt10033 = 16;
	OpenGL anOpenGL10034;
	int anInt10035;
	Class168 aClass168_10036;
	Class147 aClass147_10037;
	Class135 aClass135_10038;
	Class572_Sub32_Sub2 aClass572_Sub32_Sub2_10039;
	Class572_Sub32_Sub1 aClass572_Sub32_Sub1_10040;
	Class572_Sub36[] aClass572_Sub36Array10041;
	Class153 aClass153_10042 = new Class153();
	Class250 aClass250_10043 = new Class250();
	Class250 aClass250_10044 = new Class250();
	Class261 aClass261_10045 = new Class261();
	Class176 aClass176_10046;
	int anInt10047;
	boolean aBool10048;
	int anInt10049;
	boolean aBool10050;
	NativeHeap aNativeHeap10051;
	float aFloat10052;
	int anInt10053;
	int anInt10054;
	int anInt10055;
	static final int anInt10056 = 1;
	Class675 aClass675_10057;
	int anInt10058;
	Class675 aClass675_10059;
	int anInt10060 = 8;
	Class675 aClass675_10061;
	Class675 aClass675_10062;
	Class675 aClass675_10063;
	long aLong10064;
	static int[] anIntArray10065 = new int[1000];
	int anInt10066;
	int anInt10067;
	int anInt10068;
	boolean aBool10069;
	static final int anInt10070 = 0;
	int anInt10071;
	int[] anIntArray10072;
	byte aByte10073;
	boolean aBool10074;
	float aFloat10075;
	Class261 aClass261_10076;
	boolean aBool10077;
	Class250 aClass250_10078;
	Class250 aClass250_10079;
	Class250 aClass250_10080;
	static final int anInt10081 = 7;
	float[][] aFloatArrayArray10082;
	boolean aBool10083;
	float aFloat10084;
	float aFloat10085;
	boolean aBool10086;
	int anInt10087;
	float aFloat10088;
	static final int anInt10089 = 1;
	float aFloat10090;
	float aFloat10091;
	Class261 aClass261_10092;
	Class250 aClass250_10093;
	Class250 aClass250_10094;
	float[] aFloatArray10095;
	int anInt10096;
	int anInt10097;
	int anInt10098;
	int anInt10099;
	boolean aBool10100;
	int anInt10101;
	int anInt10102;
	static final int anInt10103 = 34166;
	int anInt10104;
	int anInt10105;
	int anInt10106;
	int anInt10107;
	static int anInt10108 = 4;
	Class161 aClass161_10109;
	boolean aBool10110;
	float[] aFloatArray10111;
	float[] aFloatArray10112;
	float[] aFloatArray10113;
	boolean aBool10114;
	int anInt10115;
	boolean aBool10116;
	float aFloat10117;
	boolean aBool10118;
	float aFloat10119;
	float aFloat10120;
	float aFloat10121;
	Class103_Sub2 aClass103_Sub2_10122;
	int anInt10123;
	boolean aBool10124;
	int anInt10125;
	float aFloat10126;
	boolean aBool10127;
	Class104_Sub1_Sub1 aClass104_Sub1_Sub1_10128;
	int anInt10129;
	Class675 aClass675_10130;
	float aFloat10131;
	float aFloat10132;
	float aFloat10133;
	float aFloat10134;
	boolean aBool10135;
	Class572_Sub32_Sub3 aClass572_Sub32_Sub3_10136;
	int anInt10137;
	int anInt10138;
	Interface12 anInterface12_10139;
	Interface9 anInterface9_10140;
	static float[] aFloatArray10141 = new float[4];
	int anInt10142;
	int anInt10143;
	boolean aBool10144;
	static final int anInt10145 = 7681;
	Class155[] aClass155Array10146;
	Class161 aClass161_10147;
	static final int anInt10148 = 2;
	String aString10149;
	int anInt10150;
	boolean aBool10151;
	int anInt10152;
	boolean aBool10153;
	boolean aBool10154;
	int anInt10155;
	float[] aFloatArray10156;
	int[] anIntArray10157;
	Class572_Sub15_Sub1 aClass572_Sub15_Sub1_10158;
	boolean aBool10159;
	boolean aBool10160;
	boolean aBool10161;
	boolean aBool10162;
	boolean aBool10163;
	boolean aBool10164;
	boolean aBool10165;
	boolean aBool10166;
	static final float aFloat10167 = 0.35F;
	boolean aBool10168;
	boolean aBool10169;
	int anInt10170;
	int anInt10171;
	boolean aBool10172;
	boolean aBool10173;
	boolean aBool10174;
	boolean aBool10175;
	boolean aBool10176;
	boolean aBool10177;
	int anInt10178;
	float aFloat10179;
	Interface9 anInterface9_10180;
	OpenGLModel[] aClass89_Sub1Array10181;
	OpenGLModel[] aClass89_Sub1Array10182;
	Class250 aClass250_10183;
	Class142 aClass142_10184;
	Class142 aClass142_10185;
	int[] anIntArray10186;
	int anInt10187;
	static float[] aFloatArray10188 = new float[4];
	int anInt10189;
	Class104_Sub1 aClass104_Sub1_10190;
	int[] anIntArray10191;
	static final int anInt10192 = 5890;
	byte[] aByteArray10193;
	int anInt10194;
	Class155_Sub4 aClass155_Sub4_10195;
	static final int anInt10196 = 55;
	Class250 aClass250_10197;
	int anInt10198;
	long[] aLongArray10199;
	int[] anIntArray10200;
	static final int anInt10201 = 3;
	int anInt10202;

	public void method1724(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		float f = (float) i + 0.35F;
		float f_5_ = (float) i_0_ + 0.35F;
		float f_6_ = f + (float) i_1_ - 1.0F;
		float f_7_ = f_5_ + (float) i_2_ - 1.0F;
		method9418();
		method9456(i_4_);
		OpenGL.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_, (byte) (i_3_ >> 24));
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f, f_5_);
		OpenGL.glVertex2f(f, f_7_);
		OpenGL.glVertex2f(f_6_, f_7_);
		OpenGL.glVertex2f(f_6_, f_5_);
		OpenGL.glEnd();
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glEnable(32925);
	}

	public void method1732(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		if (i != i_9_ || i_8_ != i_10_) {
			method9418();
			method9456(i_12_);
			float f = (float) i_9_ - (float) i;
			float f_16_ = (float) i_10_ - (float) i_8_;
			float f_17_ = (float) (1.0 / Math.sqrt((double) (f * f + f_16_ * f_16_)));
			f *= f_17_;
			f_16_ *= f_17_;
			OpenGL.glColor4ub((byte) (i_11_ >> 16), (byte) (i_11_ >> 8), (byte) i_11_, (byte) (i_11_ >> 24));
			i_15_ %= i_14_ + i_13_;
			float f_18_ = f * (float) i_13_;
			float f_19_ = f_16_ * (float) i_13_;
			float f_20_ = 0.0F;
			float f_21_ = 0.0F;
			float f_22_ = f_18_;
			float f_23_ = f_19_;
			if (i_15_ > i_13_) {
				f_20_ = f * (float) (i_13_ + i_14_ - i_15_);
				f_21_ = f_16_ * (float) (i_13_ + i_14_ - i_15_);
			} else {
				f_22_ = f * (float) (i_13_ - i_15_);
				f_23_ = f_16_ * (float) (i_13_ - i_15_);
			}
			float f_24_ = (float) i + 0.35F + f_20_;
			float f_25_ = (float) i_8_ + 0.35F + f_21_;
			float f_26_ = f * (float) i_14_;
			float f_27_ = f_16_ * (float) i_14_;
			for (;;) {
				if (i_9_ > i) {
					if (f_24_ > (float) i_9_ + 0.35F)
						break;
					if (f_24_ + f_22_ > (float) i_9_)
						f_22_ = (float) i_9_ - f_24_;
				} else {
					if (f_24_ < (float) i_9_ + 0.35F)
						break;
					if (f_24_ + f_22_ < (float) i_9_)
						f_22_ = (float) i_9_ - f_24_;
				}
				if (i_10_ > i_8_) {
					if (f_25_ > (float) i_10_ + 0.35F)
						break;
					if (f_25_ + f_23_ > (float) i_10_)
						f_23_ = (float) i_10_ - f_25_;
				} else {
					if (f_25_ < (float) i_10_ + 0.35F)
						break;
					if (f_25_ + f_23_ < (float) i_10_)
						f_23_ = (float) i_10_ - f_25_;
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_24_, f_25_);
				OpenGL.glVertex2f(f_24_ + f_22_, f_25_ + f_23_);
				OpenGL.glEnd();
				f_24_ += f_26_ + f_22_;
				f_25_ += f_27_ + f_23_;
				f_22_ = f_18_;
				f_23_ = f_19_;
			}
		}
	}

	public void method1879(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		float f = (float) i + 0.35F;
		float f_33_ = (float) i_28_ + 0.35F;
		float f_34_ = f + (float) i_29_;
		float f_35_ = f_33_ + (float) i_30_;
		method9418();
		method9456(i_32_);
		OpenGL.glColor4ub((byte) (i_31_ >> 16), (byte) (i_31_ >> 8), (byte) i_31_, (byte) (i_31_ >> 24));
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_33_);
		OpenGL.glVertex2f(f, f_35_);
		OpenGL.glVertex2f(f_34_, f_35_);
		OpenGL.glVertex2f(f_34_, f_33_);
		OpenGL.glEnd();
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glEnable(32925);
	}

	void method9376() {
		method9389(-2);
		for (int i = ((Class106_Sub1) this).anInt10150 - 1; i >= 0; i--) {
			method9421(i);
			method9422(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}
		method9434(8448, 8448);
		method9423(2, 34168, 770);
		method9427();
		((Class106_Sub1) this).anInt10067 = 1;
		((Class106_Sub1) this).anInt10071 = 0;
		((Class106_Sub1) this).aBool10168 = true;
		if (((Class106_Sub1) this).aBool10177)
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		else
			OpenGL.glBlendFunc(770, 771);
		((Class106_Sub1) this).anInt10068 = 1;
		((Class106_Sub1) this).aByte10073 = (byte) -1;
		method9438((byte) 0);
		((Class106_Sub1) this).aBool10144 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, (float) ((Class106_Sub1) this).aByte10073);
		if (((Class106_Sub1) this).aBool10161) {
			if (((Class106_Sub1) this).anInt10035 == 0)
				OpenGL.glDisable(32925);
			else
				OpenGL.glEnable(32925);
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		((Class106_Sub1) this).aBool10069 = true;
		method9428(true);
		method9429(true);
		method9431(true);
		method9432(true);
		method1713(0.0F, 1.0F);
		method9399();
		((Class106_Sub1) this).anOpenGL10034.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_36_ = 16384 + i;
			OpenGL.glLightfv(i_36_, 4608, fs, 0);
			OpenGL.glLightf(i_36_, 4615, 0.0F);
			OpenGL.glLightf(i_36_, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (((Class106_Sub1) this).aBool10173)
			OpenGL.glEnable(34895);
		((Class106_Sub1) this).anInt10058 = -1;
		((Class106_Sub1) this).anInt10115 = -1;
		method1975();
		method1714();
	}

	final void method9377() {
		if (((Class106_Sub1) this).anInt10066 != 1) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9422(null);
			method9389(-2);
			method9454(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 1;
		}
	}

	void method1664(int i, int i_37_) throws Exception_Sub1 {
		try {
			aClass104_Sub2_1419.method9924();
		} catch (Exception exception) {
			/* empty */
		}
		if (anInterface5_1408 != null)
			anInterface5_1408.method22((byte) -33);
	}

	public boolean method1672() {
		return true;
	}

	final void method9378(boolean bool) {
		if (bool != ((Class106_Sub1) this).aBool10110) {
			((Class106_Sub1) this).aBool10110 = bool;
			method9430();
		}
	}

	public final void method2010() {
		if (aClass104_1410 != null) {
			((Class106_Sub1) this).anInt10187 = 0;
			((Class106_Sub1) this).anInt10098 = 0;
			((Class106_Sub1) this).anInt10101 = aClass104_1410.method1648();
			((Class106_Sub1) this).anInt10099 = aClass104_1410.method1646();
			OpenGL.glDisable(3089);
		}
	}

	public boolean method1673() {
		return true;
	}

	public boolean method1675() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && (((Class106_Sub1) this).anInt10035 <= 1 || ((Class106_Sub1) this).aBool10162));
	}

	public int method1904(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
		int i_43_ = 0;
		float f = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_38_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_39_));
		float f_44_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i_40_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_41_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_42_));
		float f_45_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_38_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_39_));
		float f_46_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i_40_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_41_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_42_));
		if (f < -f_45_ && f_44_ < -f_46_)
			i_43_ |= 0x10;
		else if (f > f_45_ && f_44_ > f_46_)
			i_43_ |= 0x20;
		float f_47_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_38_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_39_));
		float f_48_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i_40_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_41_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_42_));
		if (f_47_ < -f_45_ && f_48_ < -f_46_)
			i_43_ |= 0x1;
		if (f_47_ > f_45_ && f_48_ > f_46_)
			i_43_ |= 0x2;
		float f_49_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_38_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_39_));
		float f_50_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i_40_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_41_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_42_));
		if (f_49_ < -f_45_ && f_50_ < -f_46_)
			i_43_ |= 0x4;
		if (f_49_ > f_45_ && f_50_ > f_46_)
			i_43_ |= 0x8;
		return i_43_;
	}

	final int method9379(int i) {
		if (i == 1)
			return 7681;
		if (i == 0)
			return 8448;
		if (i == 2)
			return 34165;
		if (i == 3)
			return 260;
		if (i == 4)
			return 34023;
		throw new IllegalArgumentException();
	}

	public boolean method1677() {
		return (((Class106_Sub1) this).aBool10161 && (!method1786() || ((Class106_Sub1) this).aBool10162));
	}

	public Class572_Sub35 method1952(int i) {
		Class572_Sub35_Sub2 class572_sub35_sub2 = new Class572_Sub35_Sub2(i);
		((Class106_Sub1) this).aClass675_10130.method7940(class572_sub35_sub2, -1720309038);
		return class572_sub35_sub2;
	}

	boolean method9380() {
		return ((Class106_Sub1) this).aClass147_10037.method2475(3);
	}

	public final boolean method1863() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null) {
			if (!((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684()) {
				if (((Class106_Sub1) this).aClass135_10038.method2322(((Class106_Sub1) this).aClass572_Sub32_Sub2_10039))
					((Class106_Sub1) this).aClass168_10036.method2688();
				else
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean method1680() {
		return false;
	}

	public String method1681() {
		String string = "Caps: 2:";
		String string_51_ = ":";
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10035).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10178).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10150).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10155).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10170).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10052).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10179).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10153 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10151 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10077 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10163 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10164 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10161 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10172 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10174 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10116 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10048 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10166 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10169 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10074 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10173 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10154 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10124 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10159 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10160 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10175 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10176 ? 1 : 0).append(string_51_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10177 ? 1 : 0).toString();
		return string;
	}

	void method9381() {
		method9382();
	}

	void method9382() {
		int i = aClass104_1410.method1648();
		int i_52_ = aClass104_1410.method1646();
		((Class106_Sub1) this).aClass250_10080.method3441(0.0F, (float) i, 0.0F, (float) i_52_, -1.0F, 1.0F);
		method1975();
		method9399();
		method1714();
	}

	public int[] method1696(int i, int i_53_, int i_54_, int i_55_) {
		if (aClass104_1410 != null) {
			int[] is = new int[i_54_ * i_55_];
			int i_56_ = aClass104_1410.method1646();
			for (int i_57_ = 0; i_57_ < i_55_; i_57_++)
				OpenGL.glReadPixelsi(i, i_56_ - i_53_ - i_57_ - 1, i_54_, 1, 32993, ((Class106_Sub1) this).anInt10178, is, i_57_ * i_54_);
			return is;
		}
		return null;
	}

	public void method2044() {
		if (((Class106_Sub1) this).aBool10176 && aClass104_1410 != null) {
			int i = ((Class106_Sub1) this).anInt10187;
			int i_58_ = ((Class106_Sub1) this).anInt10101;
			int i_59_ = ((Class106_Sub1) this).anInt10098;
			int i_60_ = ((Class106_Sub1) this).anInt10099;
			method1714();
			int i_61_ = ((Class106_Sub1) this).anInt10104;
			int i_62_ = ((Class106_Sub1) this).anInt10105;
			int i_63_ = ((Class106_Sub1) this).anInt10106;
			int i_64_ = ((Class106_Sub1) this).anInt10107;
			method1975();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			method9399();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9422(null);
			method9389(-2);
			method9454(1);
			method9456(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			method1715(i, i_59_, i_58_, i_60_);
			method2004(i_61_, i_62_, i_63_, i_64_);
		}
	}

	public boolean method1698() {
		return ((Class106_Sub1) this).aBool10165;
	}

	public boolean method1746() {
		return true;
	}

	public boolean method1701() {
		return true;
	}

	public int method1938() {
		if (((Class106_Sub1) this).aBool10165) {
			if ((((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10171]) == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync((((Class106_Sub1) this).aLongArray10199[(((Class106_Sub1) this).anInt10171)]), 0, 0);
			if (i == 37149) {
				method1703();
				return -1;
			}
			return i != 37147 ? (((Class106_Sub1) this).anIntArray10200[((Class106_Sub1) this).anInt10171]) : -1;
		}
		return -1;
	}

	public Class250 method1935() {
		return ((Class106_Sub1) this).aClass250_10043;
	}

	public void method1703() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
				((Class106_Sub1) this).aLongArray10199[i] = 0L;
			}
		}
		((Class106_Sub1) this).anInt10202 = 0;
		((Class106_Sub1) this).anInt10171 = 0;
	}

	public long method1705(int i, int i_65_) {
		return method9452(i, i_65_, null, null);
	}

	public void method1707(int i, int i_66_, int[] is, int[] is_67_) {
		method9452(i, i_66_, is, is_67_);
	}

	public Class102 method1923(Class284 class284, Class87[] class87s, boolean bool) {
		return new Class102_Sub6(this, class284, class87s, bool);
	}

	public void method2018() {
		if (((Class106_Sub1) this).aBool10165) {
			((Class106_Sub1) this).aClass161_10147 = null;
			if (((Class106_Sub1) this).aClass104_Sub1_10190 != null) {
				((Class106_Sub1) this).aClass104_Sub1_10190.method39();
				((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			}
			OpenGL.glDeleteBuffersARB(3, ((Class106_Sub1) this).anIntArray10186, 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub1) this).anIntArray10186[i] = 0;
				if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
					((Class106_Sub1) this).aLongArray10199[i] = 0L;
				}
			}
		} else {
			((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			((Class106_Sub1) this).aClass161_10109 = null;
			((Class106_Sub1) this).aClass161_10147 = null;
		}
	}

	public Class250 method1932() {
		return ((Class106_Sub1) this).aClass250_10043;
	}

	final void method9383() {
		if (((Class106_Sub1) this).anInt10066 != 2) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9389(-2);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 2;
		}
	}

	public boolean method1742() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method8684());
	}

	public void method1725(int i, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_) {
		float f = (float) i + 0.35F;
		float f_73_ = (float) i_68_ + 0.35F;
		float f_74_ = f + (float) i_69_;
		float f_75_ = f_73_ + (float) i_70_;
		method9418();
		method9456(i_72_);
		OpenGL.glColor4ub((byte) (i_71_ >> 16), (byte) (i_71_ >> 8), (byte) i_71_, (byte) (i_71_ >> 24));
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_73_);
		OpenGL.glVertex2f(f, f_75_);
		OpenGL.glVertex2f(f_74_, f_75_);
		OpenGL.glVertex2f(f_74_, f_73_);
		OpenGL.glEnd();
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glEnable(32925);
	}

	void method9384() {
		OpenGL.glLightfv(16384, 4611, ((Class106_Sub1) this).aFloatArray10113, 0);
		OpenGL.glLightfv(16385, 4611, ((Class106_Sub1) this).aFloatArray9998, 0);
	}

	void method1727(int i, int i_76_, int i_77_, int i_78_, int i_79_) {
		if (i_77_ < 0)
			i_77_ = -i_77_;
		if (i + i_77_ >= ((Class106_Sub1) this).anInt10187 && i - i_77_ <= ((Class106_Sub1) this).anInt10101 && i_76_ + i_77_ >= ((Class106_Sub1) this).anInt10098 && i_76_ - i_77_ <= ((Class106_Sub1) this).anInt10099) {
			method9418();
			method9456(i_79_);
			OpenGL.glColor4ub((byte) (i_78_ >> 16), (byte) (i_78_ >> 8), (byte) i_78_, (byte) (i_78_ >> 24));
			float f = (float) i + 0.35F;
			float f_80_ = (float) i_76_ + 0.35F;
			int i_81_ = i_77_ << 1;
			if ((float) i_81_ < ((Class106_Sub1) this).aFloat10052) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f + 1.0F, f_80_ + 1.0F);
				OpenGL.glVertex2f(f + 1.0F, f_80_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_80_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_80_ + 1.0F);
				OpenGL.glEnd();
			} else if ((float) i_81_ <= ((Class106_Sub1) this).aFloat10179) {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize((float) i_81_);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f, f_80_);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			} else {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f, f_80_);
				int i_82_ = 262144 / (6 * i_77_);
				if (i_82_ <= 64)
					i_82_ = 64;
				else if (i_82_ > 512)
					i_82_ = 512;
				i_82_ = Cs2CallPointer.method5627(i_82_, 326245663);
				OpenGL.glVertex2f(f + (float) i_77_, f_80_);
				for (int i_83_ = 16384 - i_82_; i_83_ > 0; i_83_ -= i_82_)
					OpenGL.glVertex2f(f + (Class178.aFloatArray2109[i_83_] * (float) i_77_), f_80_ + (Class178.aFloatArray2110[i_83_] * (float) i_77_));
				OpenGL.glVertex2f(f + (float) i_77_, f_80_);
				OpenGL.glEnd();
			}
		}
	}

	public final void method2012(int i, int i_84_, int i_85_, int i_86_) {
		if (((Class106_Sub1) this).anInt10187 < i)
			((Class106_Sub1) this).anInt10187 = i;
		if (((Class106_Sub1) this).anInt10101 > i_85_)
			((Class106_Sub1) this).anInt10101 = i_85_;
		if (((Class106_Sub1) this).anInt10098 < i_84_)
			((Class106_Sub1) this).anInt10098 = i_84_;
		if (((Class106_Sub1) this).anInt10099 > i_86_)
			((Class106_Sub1) this).anInt10099 = i_86_;
		OpenGL.glEnable(3089);
		method9395();
	}

	public boolean method1822() {
		return (((Class106_Sub1) this).aBool10161 && (!method1786() || ((Class106_Sub1) this).aBool10162));
	}

	public void method1731(int i, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, Class167 class167, int i_92_, int i_93_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(i_91_);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_94_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		float f_95_ = (float) i_88_ - (float) i;
		float f_96_ = (float) i_89_ - (float) i_87_;
		float f_97_ = (float) (1.0 / Math.sqrt((double) (f_95_ * f_95_ + f_96_ * f_96_)));
		f_95_ *= f_97_;
		f_96_ *= f_97_;
		OpenGL.glColor4ub((byte) (i_90_ >> 16), (byte) (i_90_ >> 8), (byte) i_90_, (byte) (i_90_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f * (float) (i - i_92_), f_94_ * (float) (i_87_ - i_93_));
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_87_ + 0.35F);
		OpenGL.glTexCoord2f(f * (float) (i_88_ - i_92_), f_94_ * (float) (i_89_ - i_93_));
		OpenGL.glVertex2f((float) i_88_ + f_95_ + 0.35F, (float) i_89_ + f_96_ + 0.35F);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	void method9385() {
		int i = aClass104_1410.method1648();
		int i_98_ = aClass104_1410.method1646();
		((Class106_Sub1) this).aClass250_10080.method3441(0.0F, (float) i, 0.0F, (float) i_98_, -1.0F, 1.0F);
		method1975();
		method9399();
		method1714();
	}

	public void method1950(int i, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_) {
		OpenGL.glLineWidth((float) i_103_);
		method1730(i, i_99_, i_100_, i_101_, i_102_, i_104_);
		OpenGL.glLineWidth(1.0F);
	}

	void method9386() {
		int i = 0;
		while (!((Class106_Sub1) this).anOpenGL10034.method2577()) {
			if (i++ > 5)
				throw new RuntimeException("");
			Class198.method2977(1000L);
		}
	}

	public void method1792(float f, float f_105_, float f_106_, float[] fs) {
		float f_107_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * f_105_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * f_106_));
		float f_108_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * f_105_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * f_106_));
		if (f_107_ < -f_108_ || f_107_ > f_108_) {
			float[] fs_109_ = fs;
			float[] fs_110_ = fs;
			fs[2] = Float.NaN;
			fs_110_[1] = Float.NaN;
			fs_109_[0] = Float.NaN;
		} else {
			float f_111_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * f) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * f_105_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * f_106_));
			if (f_111_ < -f_108_ || f_111_ > f_108_) {
				float[] fs_112_ = fs;
				float[] fs_113_ = fs;
				fs[2] = Float.NaN;
				fs_113_[1] = Float.NaN;
				fs_112_[0] = Float.NaN;
			} else {
				float f_114_ = ((((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13]) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1]) * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5]) * f_105_ + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9]) * f_106_);
				if (f_114_ < -f_108_ || f_114_ > f_108_) {
					float[] fs_115_ = fs;
					float[] fs_116_ = fs;
					fs[2] = Float.NaN;
					fs_116_[1] = Float.NaN;
					fs_115_[0] = Float.NaN;
				} else {
					float f_117_ = ((((Class106_Sub1) this).aClass250_10197.aFloatArray2728[14]) + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[2]) * f + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[6]) * f_105_ + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[10]) * f_106_);
					fs[0] = (((Class106_Sub1) this).aFloat10084 + (((Class106_Sub1) this).aFloat10085 * f_111_ / f_108_));
					fs[1] = (((Class106_Sub1) this).aFloat10075 + (((Class106_Sub1) this).aFloat10121 * f_114_ / f_108_));
					fs[2] = f_117_;
				}
			}
		}
	}

	public int method1797(int i, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_) {
		int i_123_ = 0;
		float f = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_118_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_119_));
		float f_124_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i_120_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_121_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_122_));
		float f_125_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_118_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_119_));
		float f_126_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i_120_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_121_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_122_));
		if (f < -f_125_ && f_124_ < -f_126_)
			i_123_ |= 0x10;
		else if (f > f_125_ && f_124_ > f_126_)
			i_123_ |= 0x20;
		float f_127_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_118_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_119_));
		float f_128_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i_120_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_121_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_122_));
		if (f_127_ < -f_125_ && f_128_ < -f_126_)
			i_123_ |= 0x1;
		if (f_127_ > f_125_ && f_128_ > f_126_)
			i_123_ |= 0x2;
		float f_129_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_118_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_119_));
		float f_130_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i_120_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_121_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_122_));
		if (f_129_ < -f_125_ && f_130_ < -f_126_)
			i_123_ |= 0x4;
		if (f_129_ > f_125_ && f_130_ > f_126_)
			i_123_ |= 0x8;
		return i_123_;
	}

	void method9387() {
		((Class106_Sub1) this).aClass155Array10146 = new Class155[((Class106_Sub1) this).anInt10150];
		((Class106_Sub1) this).aClass155_Sub4_10195 = new Class155_Sub4(this, 3553, Class171.aClass171_2071, Class88.aClass88_1218, 1, 1);
		new Class155_Sub4(this, 3553, Class171.aClass171_2071, Class88.aClass88_1218, 1, 1);
		new Class155_Sub4(this, 3553, Class171.aClass171_2071, Class88.aClass88_1218, 1, 1);
		for (int i = 0; i < 8; i++) {
			((Class106_Sub1) this).aClass89_Sub1Array10181[i] = new OpenGLModel(this);
			((Class106_Sub1) this).aClass89_Sub1Array10182[i] = new OpenGLModel(this);
		}
		if (((Class106_Sub1) this).aBool10124) {
			((Class106_Sub1) this).aClass104_Sub1_Sub1_10128 = new Class104_Sub1_Sub1(this);
			new Class104_Sub1_Sub1(this);
		}
	}

	public void method1738(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		class90.method1511(class326, ((Class106_Sub1) this).aClass250_10079, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	final void method9388() {
		if (((Class106_Sub1) this).anInt10087 != 1) {
			((Class106_Sub1) this).anInt10087 = 1;
			method9400();
			method9482();
			method9394();
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			((Class106_Sub1) this).anInt10066 &= ~0x8;
		}
	}

	public void method1740(Class572_Sub35 class572_sub35) {
		((Class106_Sub1) this).aNativeHeap10051 = (((Class572_Sub35_Sub2) (Class572_Sub35_Sub2) class572_sub35).aNativeHeap10989);
		if (((Class106_Sub1) this).anInterface9_10180 == null) {
			Class572_Sub15_Sub1 class572_sub15_sub1 = new Class572_Sub15_Sub1(80);
			if (((Class106_Sub1) this).aBool10153) {
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(0.0F);
			} else {
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(0.0F);
			}
			((Class106_Sub1) this).anInterface9_10180 = method9413(20, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053, false);
			((Class106_Sub1) this).aClass142_10184 = new Class142(((Class106_Sub1) this).anInterface9_10180, 5126, 3, 0);
			((Class106_Sub1) this).aClass142_10185 = new Class142(((Class106_Sub1) this).anInterface9_10180, 5126, 2, 12);
			((Class106_Sub1) this).aClass153_10042.method2510(this);
		}
	}

	public Class161 method1864(int i, int i_131_, boolean bool, boolean bool_132_) {
		return new Class161_Sub2(this, i, i_131_, bool);
	}

	public Class161 method1711(Class87 class87, boolean bool) {
		int[] is = class87.method1285(false);
		Class161 class161 = method1744(is, 0, class87.method1329(), class87.method1329(), class87.method1330(), -434543205);
		class161.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161;
	}

	public Class161 method1960(int[] is, int i, int i_133_, int i_134_, int i_135_, boolean bool) {
		return new Class161_Sub2(this, i_134_, i_135_, is, i, i_133_);
	}

	public Class161 method1821(int i, int i_136_, int i_137_, int i_138_, boolean bool) {
		return new Class161_Sub2(this, i, i_136_, i_137_, i_138_);
	}

	public Class167 method1749(int i, int i_139_, int[] is, int[] is_140_) {
		return Class167_Sub2.method10049(this, i, i_139_, is, is_140_);
	}

	public Class102 method1751(Class284 class284, Class87[] class87s, boolean bool) {
		return new Class102_Sub6(this, class284, class87s, bool);
	}

	public void method1754(int i) {
		/* empty */
	}

	public void method1981(float f, float f_141_, float f_142_, float f_143_, float f_144_) {
		Class572_Sub32_Sub1.aFloat10995 = f;
		Class572_Sub32_Sub1.aFloat10994 = f_141_;
		Class572_Sub32_Sub1.aFloat10996 = f_142_;
		Class572_Sub32_Sub1.aFloat10999 = f_143_;
		Class572_Sub32_Sub1.aFloat10998 = f_144_;
	}

	public String method1964() {
		String string = "Caps: 2:";
		String string_145_ = ":";
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10035).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10178).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10150).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10155).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10170).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10052).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10179).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10153 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10151 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10077 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10163 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10164 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10161 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10172 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10174 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10116 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10048 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10166 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10169 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10074 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10173 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10154 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10124 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10159 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10160 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10175 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10176 ? 1 : 0).append(string_145_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10177 ? 1 : 0).toString();
		return string;
	}

	public int method1798(int i, int i_146_) {
		return i | i_146_;
	}

	public Class174 method1909(int i, int i_147_, int[][] is, int[][] is_148_, int i_149_, int i_150_, int i_151_) {
		return new Class174_Sub3(this, i_150_, i_151_, i, i_147_, is, is_148_, i_149_);
	}

	public Class250 method1752() {
		return ((Class106_Sub1) this).aClass250_10043;
	}

	public Class261 method1753() {
		return ((Class106_Sub1) this).aClass261_10045;
	}

	public void method1760(Class105 class105) {
		((Class106_Sub1) this).aClass153_10042.method2506(this, class105);
	}

	final void method9389(int i) {
		method9484(i, true);
	}

	public void method1790(int i, Class86 class86) {
		if (!((Class106_Sub1) this).aBool10135)
			throw new RuntimeException("");
		((Class106_Sub1) this).anInt10137 = i;
		((Class106_Sub1) this).aClass86_10018 = class86;
		if (((Class106_Sub1) this).aBool10086) {
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9981();
		}
	}

	public void method1791() {
		((Class106_Sub1) this).aBool10135 = false;
	}

	public int method1902(int i, int i_152_, int i_153_, int i_154_, int i_155_, int i_156_) {
		int i_157_ = 0;
		float f = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_152_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_153_));
		float f_158_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i_154_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_155_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_156_));
		float f_159_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_152_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_153_));
		float f_160_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i_154_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_155_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_156_));
		if (f < -f_159_ && f_158_ < -f_160_)
			i_157_ |= 0x10;
		else if (f > f_159_ && f_158_ > f_160_)
			i_157_ |= 0x20;
		float f_161_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_152_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_153_));
		float f_162_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i_154_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_155_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_156_));
		if (f_161_ < -f_159_ && f_162_ < -f_160_)
			i_157_ |= 0x1;
		if (f_161_ > f_159_ && f_162_ > f_160_)
			i_157_ |= 0x2;
		float f_163_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_152_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_153_));
		float f_164_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i_154_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_155_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_156_));
		if (f_163_ < -f_159_ && f_164_ < -f_160_)
			i_157_ |= 0x4;
		if (f_163_ > f_159_ && f_164_ > f_160_)
			i_157_ |= 0x8;
		return i_157_;
	}

	boolean method1737(int i, int i_165_, int i_166_, int i_167_, Class261 class261, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		return class326.method4147(i, i_165_, i_166_, i_167_, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	public void method1712(int[] is) {
		is[0] = ((Class106_Sub1) this).anInt10104;
		is[1] = ((Class106_Sub1) this).anInt10105;
		is[2] = ((Class106_Sub1) this).anInt10106;
		is[3] = ((Class106_Sub1) this).anInt10107;
	}

	final void method9390() {
		if (((Class106_Sub1) this).anInt10066 != 4) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9389(-2);
			method9456(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 4;
		}
	}

	Class106_Sub1(Canvas canvas, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, int i) {
		super(mapSize, interface5, interface35, interface36, interface37);
		((Class106_Sub1) this).anInt10049 = 3;
		((Class106_Sub1) this).aBool10050 = false;
		((Class106_Sub1) this).aClass675_10130 = new Class675();
		((Class106_Sub1) this).anUnsafe10022 = null;
		((Class106_Sub1) this).aClass675_10057 = new Class675();
		((Class106_Sub1) this).aClass675_10025 = new Class675();
		((Class106_Sub1) this).aClass675_10059 = new Class675();
		((Class106_Sub1) this).aClass675_10032 = new Class675();
		((Class106_Sub1) this).aClass675_10061 = new Class675();
		((Class106_Sub1) this).aClass675_10062 = new Class675();
		((Class106_Sub1) this).aClass675_10063 = new Class675();
		((Class106_Sub1) this).aClass261_10076 = new Class261();
		((Class106_Sub1) this).aClass250_10197 = new Class250();
		((Class106_Sub1) this).aClass250_10078 = new Class250();
		((Class106_Sub1) this).aClass250_10079 = new Class250();
		((Class106_Sub1) this).aClass250_10080 = new Class250();
		((Class106_Sub1) this).aClass250_10183 = new Class250();
		((Class106_Sub1) this).aFloatArrayArray10082 = new float[6][4];
		((Class106_Sub1) this).aFloatArray10156 = new float[4];
		((Class106_Sub1) this).aFloat10088 = 0.0F;
		((Class106_Sub1) this).aFloat9991 = 1.0F;
		((Class106_Sub1) this).aFloat10090 = 0.0F;
		((Class106_Sub1) this).aFloat10091 = -1.0F;
		((Class106_Sub1) this).aClass261_10092 = new Class261();
		((Class106_Sub1) this).aClass250_10093 = new Class250();
		((Class106_Sub1) this).aClass250_10094 = new Class250();
		((Class106_Sub1) this).aFloatArray10095 = new float[16];
		((Class106_Sub1) this).aBool10118 = true;
		((Class106_Sub1) this).anInt10098 = 0;
		((Class106_Sub1) this).anInt10099 = 0;
		((Class106_Sub1) this).anInt10187 = 0;
		((Class106_Sub1) this).anInt10101 = 0;
		((Class106_Sub1) this).anInt10102 = 0;
		((Class106_Sub1) this).anInt10096 = 0;
		((Class106_Sub1) this).aFloatArray10111 = new float[4];
		((Class106_Sub1) this).aFloatArray10112 = new float[4];
		((Class106_Sub1) this).aFloatArray10113 = new float[4];
		((Class106_Sub1) this).aFloatArray9998 = new float[4];
		((Class106_Sub1) this).anInt10115 = -1;
		((Class106_Sub1) this).aFloat10011 = 1.0F;
		((Class106_Sub1) this).aFloat10117 = 1.0F;
		((Class106_Sub1) this).aFloat9992 = 1.0F;
		((Class106_Sub1) this).aFloat10120 = -1.0F;
		((Class106_Sub1) this).aFloat10126 = -1.0F;
		((Class106_Sub1) this).aClass572_Sub36Array10041 = new Class572_Sub36[anInt10108];
		((Class106_Sub1) this).anInt10058 = -1;
		((Class106_Sub1) this).anInt10129 = -1;
		((Class106_Sub1) this).anInt10189 = 0;
		((Class106_Sub1) this).aFloat10133 = 1.0F;
		((Class106_Sub1) this).aFloat10134 = 0.0F;
		((Class106_Sub1) this).aBool10086 = false;
		((Class106_Sub1) this).anInt10142 = 8448;
		((Class106_Sub1) this).anInt10143 = 8448;
		((Class106_Sub1) this).aFloat10179 = -1.0F;
		((Class106_Sub1) this).aFloat10052 = -1.0F;
		((Class106_Sub1) this).aClass89_Sub1Array10181 = new OpenGLModel[8];
		((Class106_Sub1) this).aClass89_Sub1Array10182 = new OpenGLModel[8];
		((Class106_Sub1) this).aClass572_Sub15_Sub1_10158 = new Class572_Sub15_Sub1(8192);
		((Class106_Sub1) this).anIntArray10157 = new int[1];
		((Class106_Sub1) this).anIntArray10191 = new int[1];
		((Class106_Sub1) this).anIntArray10072 = new int[1];
		((Class106_Sub1) this).aByteArray10193 = new byte[16384];
		((Class106_Sub1) this).aClass161_10147 = null;
		((Class106_Sub1) this).aClass161_10109 = null;
		((Class106_Sub1) this).aClass104_Sub1_10190 = null;
		((Class106_Sub1) this).anIntArray10186 = new int[3];
		((Class106_Sub1) this).aLongArray10199 = new long[3];
		((Class106_Sub1) this).anIntArray10200 = new int[3];
		((Class106_Sub1) this).anInt10171 = 0;
		((Class106_Sub1) this).anInt10202 = 0;
		try {
			try {
				Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				((Class106_Sub1) this).anUnsafe10022 = (Unsafe) field.get(null);
			} catch (Exception exception) {
				/* empty */
			}
			((Class106_Sub1) this).anInt10035 = i;
			Class597.method7040(1072544359).method421("jaclib", (byte) 95);
			Class597.method7040(320943770).method421("jaggl", (byte) 54);
			((Class106_Sub1) this).anOpenGL10034 = new OpenGL();
			long l = ((Class106_Sub1) this).anOpenGL10034.init(canvas, 8, 8, 8, 24, 0, ((Class106_Sub1) this).anInt10035);
			if (l == 0L)
				throw new RuntimeException("");
			method9386();
			int i_168_ = method9465();
			if (i_168_ != 0)
				throw new RuntimeException("");
			((Class106_Sub1) this).anInt10178 = ((Class106_Sub1) this).aBool10153 ? 33639 : 5121;
			((Class106_Sub1) this).aBool10151 = ((Class106_Sub1) this).aString9995.indexOf("radeon") != -1;
			boolean bool = ((Class106_Sub1) this).aString10149.indexOf("intel") != -1;
			boolean bool_169_ = false;
			boolean bool_170_ = false;
			int i_171_ = 0;
			if (((Class106_Sub1) this).aBool10151 || bool) {
				String[] strings = Class104_Sub2.method9935(((Class106_Sub1) this).aString9995.replace('/', ' '), ' ', 207597699);
				int i_172_ = 0;
				for (/**/; i_172_ < strings.length; i_172_++) {
					String string = strings[i_172_];
					try {
						if (string.length() <= 0)
							continue;
						if (string.charAt(0) == 'x' && string.length() >= 3 && Class513.method6089(string.substring(1, 3), -2003450722)) {
							string = string.substring(1);
							bool_170_ = true;
						}
						if (string.equals("hd")) {
							bool_169_ = true;
							continue;
						}
						if (string.startsWith("hd")) {
							string = string.substring(2);
							bool_169_ = true;
						}
						if (string.length() < 4 || !Class513.method6089(string.substring(0, 4), 274201949))
							continue;
						i_171_ = Class97.method1565(string.substring(0, 4), (byte) -26);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
			}
			if (((Class106_Sub1) this).anInt10035 != 0 && bool && !bool_169_)
				throw new RuntimeException_Sub3("");
			if (((Class106_Sub1) this).aBool10151 || bool) {
				if (bool) {
					if (!bool_169_) {
						((Class106_Sub1) this).aBool10124 = false;
						((Class106_Sub1) this).aBool10161 = false;
						((Class106_Sub1) this).aBool10162 = false;
					}
				} else {
					if (!bool_170_ && !bool_169_) {
						if (i_171_ >= 7000 && i_171_ <= 7999)
							((Class106_Sub1) this).aBool10163 = false;
						if (i_171_ >= 7000 && i_171_ <= 9250)
							((Class106_Sub1) this).aBool10166 = false;
					}
					if (!bool_169_ || i_171_ < 4000)
						((Class106_Sub1) this).aBool10175 = false;
					((Class106_Sub1) this).aBool10169 &= ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_half_float_pixel");
					((Class106_Sub1) this).aBool10164 = ((Class106_Sub1) this).aBool10163;
				}
			}
			((Class106_Sub1) this).aBool10176 = !((Class106_Sub1) this).aString10149.equals("s3 graphics");
			if (((Class106_Sub1) this).aBool10163) {
				try {
					int[] is = new int[1];
					OpenGL.glGenBuffersARB(1, is, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
			Class245.method3353(false, true, (byte) 48);
			((Class106_Sub1) this).aBool10050 = true;
			((Class106_Sub1) this).aClass168_10036 = new Class168(this, anInterface5_1408);
			method9387();
			((Class106_Sub1) this).aClass176_10046 = new Class176(this);
			((Class106_Sub1) this).aClass135_10038 = new Class135(this);
			if (!((Class106_Sub1) this).aClass135_10038.method2318()) {
				((Class106_Sub1) this).aClass135_10038.method2316();
				((Class106_Sub1) this).aClass135_10038 = null;
			} else {
				((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 = new Class572_Sub32_Sub2(this);
				if (!((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method10079()) {
					((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8683();
					((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 = null;
				}
				((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 = new Class572_Sub32_Sub1(this);
				if (!((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method10074()) {
					((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method8683();
					((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 = null;
				}
				((Class106_Sub1) this).aClass572_Sub32_Sub3_10136 = new Class572_Sub32_Sub3(this);
				if (!((Class106_Sub1) this).aClass572_Sub32_Sub3_10136.method10259()) {
					((Class106_Sub1) this).aClass572_Sub32_Sub3_10136.method8683();
					((Class106_Sub1) this).aClass572_Sub32_Sub3_10136 = null;
				}
			}
			method1841(canvas, new Class104_Sub2_Sub2(this, canvas, l), -1717765631);
			method1688(canvas, (byte) 13);
			((Class106_Sub1) this).aClass147_10037 = new Class147(this);
			method9376();
			method2044();
			if (((Class106_Sub1) this).aClass135_10038 != null) {
				method9410();
				method9450();
			}
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method1666(-1695767598);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			if (throwable instanceof RuntimeException_Sub3)
				throw (RuntimeException_Sub3) throwable;
			throw new RuntimeException("");
		}
	}

	final void method9391() {
		if (((Class106_Sub1) this).aBool10168)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	public void method1702(float f, float f_173_, float f_174_, float f_175_, float f_176_) {
		Class572_Sub32_Sub1.aFloat10995 = f;
		Class572_Sub32_Sub1.aFloat10994 = f_173_;
		Class572_Sub32_Sub1.aFloat10996 = f_174_;
		Class572_Sub32_Sub1.aFloat10999 = f_175_;
		Class572_Sub32_Sub1.aFloat10998 = f_176_;
	}

	public final void method1716(int i, int i_177_, int i_178_, int i_179_) {
		if (((Class106_Sub1) this).anInt10187 < i)
			((Class106_Sub1) this).anInt10187 = i;
		if (((Class106_Sub1) this).anInt10101 > i_178_)
			((Class106_Sub1) this).anInt10101 = i_178_;
		if (((Class106_Sub1) this).anInt10098 < i_177_)
			((Class106_Sub1) this).anInt10098 = i_177_;
		if (((Class106_Sub1) this).anInt10099 > i_179_)
			((Class106_Sub1) this).anInt10099 = i_179_;
		OpenGL.glEnable(3089);
		method9395();
	}

	final void method9392(int i, int i_180_) {
		((Class106_Sub1) this).anInt10102 = i;
		((Class106_Sub1) this).anInt10096 = i_180_;
		method9482();
		method9395();
	}

	final void method9393() {
		if (((Class106_Sub1) this).anInt10087 != 2) {
			((Class106_Sub1) this).anInt10087 = 2;
			method9402(((Class106_Sub1) this).aClass250_10079.aFloatArray2728);
			method9398();
			method9482();
			method9394();
			((Class106_Sub1) this).anInt10066 &= ~0x7;
		}
	}

	final void method9394() {
		if (((Class106_Sub1) this).anInt10087 == 2)
			OpenGL.glDepthRange(((Class106_Sub1) this).aFloat10088, ((Class106_Sub1) this).aFloat9991);
		else
			OpenGL.glDepthRange(0.0F, 1.0F);
	}

	final void method9395() {
		if (aClass104_1410 != null && (((Class106_Sub1) this).anInt10187 < ((Class106_Sub1) this).anInt10101) && (((Class106_Sub1) this).anInt10098 < ((Class106_Sub1) this).anInt10099))
			OpenGL.glScissor((((Class106_Sub1) this).anInt10102 + ((Class106_Sub1) this).anInt10187), (((Class106_Sub1) this).anInt10096 + aClass104_1410.method1646() - ((Class106_Sub1) this).anInt10099), (((Class106_Sub1) this).anInt10101 - ((Class106_Sub1) this).anInt10187), (((Class106_Sub1) this).anInt10099 - ((Class106_Sub1) this).anInt10098));
		else
			OpenGL.glScissor(0, 0, 0, 0);
	}

	final void method9396() {
		if (((Class106_Sub1) this).anInt10066 != 8) {
			method9494();
			method9428(true);
			method9431(true);
			method9432(true);
			method9456(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 8;
		}
	}

	public final void method1715(int i, int i_181_, int i_182_, int i_183_) {
		if (aClass104_1410 != null) {
			if (i < 0)
				i = 0;
			if (i_182_ > aClass104_1410.method1648())
				i_182_ = aClass104_1410.method1648();
			if (i_181_ < 0)
				i_181_ = 0;
			if (i_183_ > aClass104_1410.method1646())
				i_183_ = aClass104_1410.method1646();
			((Class106_Sub1) this).anInt10187 = i;
			((Class106_Sub1) this).anInt10098 = i_181_;
			((Class106_Sub1) this).anInt10101 = i_182_;
			((Class106_Sub1) this).anInt10099 = i_183_;
			OpenGL.glEnable(3089);
			method9395();
		}
	}

	final void method9397(Class250 class250) {
		OpenGL.glLoadMatrixf(class250.aFloatArray2728, 0);
	}

	public boolean method1679() {
		return true;
	}

	public final void method1761(Class261 class261) {
		((Class106_Sub1) this).aClass261_10076.method3568(class261);
		((Class106_Sub1) this).aClass250_10197.method3446(((Class106_Sub1) this).aClass261_10076);
		((Class106_Sub1) this).aClass261_10092.method3568(class261);
		((Class106_Sub1) this).aClass261_10092.method3600();
		((Class106_Sub1) this).aClass250_10078.method3446(((Class106_Sub1) this).aClass261_10092);
		method9401();
		if (((Class106_Sub1) this).anInt10087 != 1)
			method9398();
	}

	public Class261 method1762() {
		return new Class261(((Class106_Sub1) this).aClass261_10076);
	}

	final void method9398() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf((((Class106_Sub1) this).aClass250_10197.aFloatArray2728), 0);
		if (((Class106_Sub1) this).aBool10086)
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
		method9384();
		method9403();
	}

	public final void method1764(Class250 class250) {
		((Class106_Sub1) this).aClass250_10079.method3442(class250);
		method9401();
		method9400();
	}

	public final Class250 method1765() {
		return new Class250(((Class106_Sub1) this).aClass250_10079);
	}

	final void method9399() {
		if (((Class106_Sub1) this).anInt10087 != 0) {
			((Class106_Sub1) this).anInt10087 = 0;
			method9482();
			method9394();
			((Class106_Sub1) this).anInt10066 &= ~0xf;
		}
	}

	public final boolean method2042() {
		if (((Class106_Sub1) this).aClass135_10038 == null)
			return false;
		return ((Class106_Sub1) this).aClass135_10038.method2328();
	}

	Class104_Sub2 method1692(Canvas canvas, int i, int i_184_) {
		return new Class104_Sub2_Sub2(this, canvas);
	}

	final void method9400() {
		((Class106_Sub1) this).aFloat10091 = ((Class106_Sub1) this).aClass250_10079.method3487();
		((Class106_Sub1) this).aFloat10090 = ((Class106_Sub1) this).aClass250_10079.method3453();
		method9408();
		if (((Class106_Sub1) this).anInt10087 == 2)
			method9402(((Class106_Sub1) this).aClass250_10079.aFloatArray2728);
		else if (((Class106_Sub1) this).anInt10087 == 1)
			method9402(((Class106_Sub1) this).aClass250_10080.aFloatArray2728);
	}

	final void method9401() {
		((Class106_Sub1) this).aClass250_10183.method3442(((Class106_Sub1) this).aClass250_10197);
		((Class106_Sub1) this).aClass250_10183.method3445(((Class106_Sub1) this).aClass250_10079);
		((Class106_Sub1) this).aClass250_10183.method3459(((Class106_Sub1) this).aFloatArrayArray10082[0]);
		((Class106_Sub1) this).aClass250_10183.method3460(((Class106_Sub1) this).aFloatArrayArray10082[1]);
		((Class106_Sub1) this).aClass250_10183.method3455(((Class106_Sub1) this).aFloatArrayArray10082[2]);
		((Class106_Sub1) this).aClass250_10183.method3475(((Class106_Sub1) this).aFloatArrayArray10082[3]);
		((Class106_Sub1) this).aClass250_10183.method3457(((Class106_Sub1) this).aFloatArrayArray10082[4]);
		((Class106_Sub1) this).aClass250_10183.method3456(((Class106_Sub1) this).aFloatArrayArray10082[5]);
	}

	final void method9402(float[] fs) {
		float[] fs_185_ = new float[16];
		System.arraycopy(fs, 0, fs_185_, 0, 16);
		fs_185_[1] = -fs_185_[1];
		fs_185_[5] = -fs_185_[5];
		fs_185_[9] = -fs_185_[9];
		fs_185_[13] = -fs_185_[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(fs_185_, 0);
		OpenGL.glMatrixMode(5888);
	}

	public void method1763(boolean bool) {
		((Class106_Sub1) this).aBool10118 = bool;
		method9433();
	}

	public int method1849() {
		return 4;
	}

	public void method1772(int i, Class572_Sub36[] class572_sub36s) {
		for (int i_186_ = 0; i_186_ < i; i_186_++)
			((Class106_Sub1) this).aClass572_Sub36Array10041[i_186_] = class572_sub36s[i_186_];
		((Class106_Sub1) this).anInt10097 = i;
		if (((Class106_Sub1) this).anInt10087 != 1)
			method9403();
	}

	void method9403() {
		int i;
		for (i = 0; i < ((Class106_Sub1) this).anInt10097; i++) {
			Class572_Sub36 class572_sub36 = ((Class106_Sub1) this).aClass572_Sub36Array10041[i];
			int i_187_ = 16386 + i;
			aFloatArray10188[0] = (float) class572_sub36.method8720(528458780);
			aFloatArray10188[1] = (float) class572_sub36.method8721((byte) -54);
			aFloatArray10188[2] = (float) class572_sub36.method8722(1086974502);
			aFloatArray10188[3] = 1.0F;
			OpenGL.glLightfv(i_187_, 4611, aFloatArray10188, 0);
			int i_188_ = class572_sub36.method8723(-1288611141);
			float f = class572_sub36.method8724((byte) 67) / 255.0F;
			aFloatArray10188[0] = (float) (i_188_ >> 16 & 0xff) * f;
			aFloatArray10188[1] = (float) (i_188_ >> 8 & 0xff) * f;
			aFloatArray10188[2] = (float) (i_188_ & 0xff) * f;
			OpenGL.glLightfv(i_187_, 4609, aFloatArray10188, 0);
			OpenGL.glLightf(i_187_, 4617, (1.0F / (float) (class572_sub36.method8752((byte) 43) * class572_sub36.method8752((byte) 7))));
			OpenGL.glEnable(i_187_);
		}
		for (/**/; i < ((Class106_Sub1) this).anInt10123; i++)
			OpenGL.glDisable(16386 + i);
		((Class106_Sub1) this).anInt10123 = ((Class106_Sub1) this).anInt10097;
	}

	public final void method1709(float f) {
		if (((Class106_Sub1) this).aFloat10119 != f) {
			((Class106_Sub1) this).aFloat10119 = f;
			method9405();
		}
	}

	public void method2017() {
		OpenGL.glFinish();
	}

	public final void method1991(int i, int i_189_, int i_190_) {
		if (((Class106_Sub1) this).anInt10058 != i || ((Class106_Sub1) this).anInt10129 != i_189_ || ((Class106_Sub1) this).anInt10189 != i_190_) {
			((Class106_Sub1) this).anInt10058 = i;
			((Class106_Sub1) this).anInt10129 = i_189_;
			((Class106_Sub1) this).anInt10189 = i_190_;
			method9408();
			method9407();
		}
	}

	final void method9404(float f, float f_191_) {
		((Class106_Sub1) this).aFloat10133 = f;
		((Class106_Sub1) this).aFloat10134 = f_191_;
		method9408();
	}

	void method9405() {
		aFloatArray10141[0] = (((Class106_Sub1) this).aFloat10119 * ((Class106_Sub1) this).aFloat10011);
		aFloatArray10141[1] = (((Class106_Sub1) this).aFloat10119 * ((Class106_Sub1) this).aFloat10117);
		aFloatArray10141[2] = (((Class106_Sub1) this).aFloat10119 * ((Class106_Sub1) this).aFloat9992);
		aFloatArray10141[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray10141, 0);
	}

	void method9406() {
		aFloatArray10141[0] = (((Class106_Sub1) this).aFloat10120 * ((Class106_Sub1) this).aFloat10011);
		aFloatArray10141[1] = (((Class106_Sub1) this).aFloat10120 * ((Class106_Sub1) this).aFloat10117);
		aFloatArray10141[2] = (((Class106_Sub1) this).aFloat10120 * ((Class106_Sub1) this).aFloat9992);
		aFloatArray10141[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray10141, 0);
		aFloatArray10141[0] = (-((Class106_Sub1) this).aFloat10126 * ((Class106_Sub1) this).aFloat10011);
		aFloatArray10141[1] = (-((Class106_Sub1) this).aFloat10126 * ((Class106_Sub1) this).aFloat10117);
		aFloatArray10141[2] = (-((Class106_Sub1) this).aFloat10126 * ((Class106_Sub1) this).aFloat9992);
		aFloatArray10141[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray10141, 0);
	}

	void method1743(int i, int i_192_) throws Exception_Sub1 {
		try {
			aClass104_Sub2_1419.method9924();
		} catch (Exception exception) {
			/* empty */
		}
		if (anInterface5_1408 != null)
			anInterface5_1408.method22((byte) 37);
	}

	void method9407() {
		if (((Class106_Sub1) this).aBool10127 && ((Class106_Sub1) this).anInt10129 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method9408() {
		((Class106_Sub1) this).aFloat10132 = (((Class106_Sub1) this).aFloat10091 - (float) ((Class106_Sub1) this).anInt10189 - ((Class106_Sub1) this).aFloat10134);
		((Class106_Sub1) this).aFloat10131 = (((Class106_Sub1) this).aFloat10132 - ((float) ((Class106_Sub1) this).anInt10129 * ((Class106_Sub1) this).aFloat10133));
		if (((Class106_Sub1) this).aFloat10131 < ((Class106_Sub1) this).aFloat10090)
			((Class106_Sub1) this).aFloat10131 = ((Class106_Sub1) this).aFloat10090;
		OpenGL.glFogf(2915, ((Class106_Sub1) this).aFloat10131);
		OpenGL.glFogf(2916, ((Class106_Sub1) this).aFloat10132);
		aFloatArray10141[0] = (float) (((Class106_Sub1) this).anInt10058 & 0xff0000) / 1.671168E7F;
		aFloatArray10141[1] = (float) (((Class106_Sub1) this).anInt10058 & 0xff00) / 65280.0F;
		aFloatArray10141[2] = (float) (((Class106_Sub1) this).anInt10058 & 0xff) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray10141, 0);
	}

	public Class103 method1773(int i) {
		return (((Class106_Sub1) this).aBool10074 ? new Class103_Sub2_Sub2(this, i) : null);
	}

	public Class103 method1729(Class103 class103, Class103 class103_193_, float f, Class103 class103_194_) {
		if (class103 != null && class103_193_ != null && ((Class106_Sub1) this).aBool10074 && ((Class106_Sub1) this).aBool10124) {
			Class103_Sub2_Sub1 class103_sub2_sub1 = null;
			Class103_Sub2 class103_sub2 = (Class103_Sub2) class103;
			Class103_Sub2 class103_sub2_195_ = (Class103_Sub2) class103_193_;
			Class155_Sub3 class155_sub3 = class103_sub2.method9851();
			Class155_Sub3 class155_sub3_196_ = class103_sub2_195_.method9851();
			if (class155_sub3 != null && class155_sub3_196_ != null) {
				int i = ((((Class155_Sub3) class155_sub3).anInt9644 > ((Class155_Sub3) class155_sub3_196_).anInt9644) ? ((Class155_Sub3) class155_sub3).anInt9644 : ((Class155_Sub3) class155_sub3_196_).anInt9644);
				if (class103 != class103_194_ && class103_193_ != class103_194_ && class103_194_ instanceof Class103_Sub2_Sub1) {
					Class103_Sub2_Sub1 class103_sub2_sub1_197_ = (Class103_Sub2_Sub1) class103_194_;
					if (class103_sub2_sub1_197_.method10106() == i)
						class103_sub2_sub1 = class103_sub2_sub1_197_;
				}
				if (class103_sub2_sub1 == null)
					class103_sub2_sub1 = new Class103_Sub2_Sub1(this, i);
				if (class103_sub2_sub1.method10109(class155_sub3, class155_sub3_196_, f))
					return class103_sub2_sub1;
			}
		}
		return f < 0.5F ? class103 : class103_193_;
	}

	public final void method1775(Class103 class103) {
		((Class106_Sub1) this).aClass103_Sub2_10122 = (Class103_Sub2) class103;
	}

	final Class155_Sub3 method9409() {
		return (((Class106_Sub1) this).aClass103_Sub2_10122 != null ? ((Class106_Sub1) this).aClass103_Sub2_10122.method9851() : null);
	}

	public final void method2024(int i, int i_198_, int i_199_, int i_200_) {
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2320(i, i_198_, i_199_, i_200_);
	}

	public boolean method1843() {
		return true;
	}

	public final boolean method1778() {
		if (((Class106_Sub1) this).aClass135_10038 == null)
			return false;
		return ((Class106_Sub1) this).aClass135_10038.method2328();
	}

	boolean method9410() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 != null) {
			if (!((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method8684()) {
				if (((Class106_Sub1) this).aClass135_10038.method2322(((Class106_Sub1) this).aClass572_Sub32_Sub1_10040))
					((Class106_Sub1) this).aClass168_10036.method2688();
				else
					return false;
			}
			return true;
		}
		return false;
	}

	public boolean method1779() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method8684());
	}

	public Class96 method1951(int[] is) {
		return new Class96_Sub1(this, is);
	}

	final void method9411(Interface12 interface12, int i, int i_201_, int i_202_) {
		method9415(interface12);
		OpenGL.glDrawElements(i, i_202_, 5123, interface12.method64() + (long) (i_201_ * 2));
	}

	public boolean method1782() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub3_10136 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub3_10136.method8684());
	}

	public void method1774(Class96 class96, float f, Class96 class96_203_, float f_204_, Class96 class96_205_, float f_206_) {
		int i = 0;
		if (class96_205_ == null && f_206_ > 0.0F)
			f_206_ = 0.0F;
		if (class96_203_ == null && f_204_ > 0.0F) {
			class96_203_ = class96_205_;
			class96_205_ = null;
			f_204_ = f_206_;
			f_206_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_203_;
			class96_203_ = class96_205_;
			class96_205_ = null;
			f = f_204_;
			f_204_ = f_206_;
			f_206_ = 0.0F;
		}
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[0] = (Class96_Sub1) class96;
		Class572_Sub32_Sub3.aFloatArray11285[0] = f;
		if (f > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[1] = (Class96_Sub1) class96_203_;
		Class572_Sub32_Sub3.aFloatArray11285[1] = f_204_;
		if (f_204_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[2] = (Class96_Sub1) class96_205_;
		Class572_Sub32_Sub3.aFloatArray11285[2] = f_206_;
		if (f_206_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.anInt11276 = i;
		Class572_Sub32_Sub3.aFloat11277 = 1.0F - (f + f_204_ + f_206_);
	}

	public boolean method1823() {
		if (((Class106_Sub1) this).aBool10165 && (((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10202]) != 0L)
			return false;
		return true;
	}

	public final void method1785() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684()) {
			((Class106_Sub1) this).aClass135_10038.method2325(((Class106_Sub1) this).aClass572_Sub32_Sub2_10039);
			((Class106_Sub1) this).aClass168_10036.method2688();
		}
	}

	public boolean method1819() {
		return true;
	}

	final void method1835(float f, float f_207_, float f_208_, float f_209_, float f_210_, float f_211_) {
		Class572_Sub32_Sub2.aFloat11006 = f;
		Class572_Sub32_Sub2.aFloat11003 = f_207_;
		Class572_Sub32_Sub2.aFloat11002 = f_208_;
	}

	public Class104_Sub1 method1693() {
		return new Class104_Sub1_Sub1(this);
	}

	public Interface11 method1781(int i, int i_212_, int i_213_) {
		return new Class572_Sub12_Sub3(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_212_, i_213_);
	}

	public Interface6 method2039(int i, int i_214_, Class171 class171, Class88 class88, int i_215_) {
		return new Class572_Sub12_Sub3(this, class171, class88, i, i_214_, i_215_);
	}

	final Interface12 method9412(int i, byte[] is, int i_216_, boolean bool) {
		if (((Class106_Sub1) this).aBool10163 && (!bool || ((Class106_Sub1) this).aBool10164))
			return new Class154_Sub2(this, i, is, i_216_, bool);
		return new Class158_Sub1(this, i, is, i_216_);
	}

	final Interface9 method9413(int i, byte[] is, int i_217_, boolean bool) {
		if (((Class106_Sub1) this).aBool10163 && (!bool || ((Class106_Sub1) this).aBool10164))
			return new Class154_Sub1(this, i, is, i_217_, bool);
		return new Class158_Sub2(this, i, is, i_217_);
	}

	final Interface9 method9414(int i, Buffer buffer, int i_218_, boolean bool) {
		if (((Class106_Sub1) this).aBool10163 && (!bool || ((Class106_Sub1) this).aBool10164))
			return new Class154_Sub1(this, i, buffer, i_218_, bool);
		return new Class158_Sub2(this, i, buffer);
	}

	public final void method1971(int i, int i_219_) {
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2323(i, i_219_);
	}

	final void method9415(Interface12 interface12) {
		if (((Class106_Sub1) this).anInterface12_10139 != interface12) {
			if (((Class106_Sub1) this).aBool10163)
				OpenGL.glBindBufferARB(34963, interface12.method42());
			((Class106_Sub1) this).anInterface12_10139 = interface12;
		}
	}

	final void method9416(Class142 class142, Class142 class142_220_, Class142 class142_221_, Class142 class142_222_) {
		if (class142 != null) {
			method9453(((Class142) class142).anInterface9_1615);
			OpenGL.glVertexPointer(((Class142) class142).aByte1614, ((Class142) class142).aShort1616, ((Class106_Sub1) this).anInterface9_10140.method41(), (((Class106_Sub1) this).anInterface9_10140.method52() + (long) ((Class142) class142).aByte1613));
			OpenGL.glEnableClientState(32884);
		} else
			OpenGL.glDisableClientState(32884);
		if (class142_220_ != null) {
			method9453(((Class142) class142_220_).anInterface9_1615);
			OpenGL.glNormalPointer(((Class142) class142_220_).aShort1616, ((Class106_Sub1) this).anInterface9_10140.method41(), (((Class106_Sub1) this).anInterface9_10140.method52() + (long) ((Class142) class142_220_).aByte1613));
			OpenGL.glEnableClientState(32885);
		} else
			OpenGL.glDisableClientState(32885);
		if (class142_221_ != null) {
			method9453(((Class142) class142_221_).anInterface9_1615);
			OpenGL.glColorPointer(((Class142) class142_221_).aByte1614, ((Class142) class142_221_).aShort1616, ((Class106_Sub1) this).anInterface9_10140.method41(), (((Class106_Sub1) this).anInterface9_10140.method52() + (long) ((Class142) class142_221_).aByte1613));
			OpenGL.glEnableClientState(32886);
		} else
			OpenGL.glDisableClientState(32886);
		if (class142_222_ != null) {
			method9453(((Class142) class142_222_).anInterface9_1615);
			OpenGL.glTexCoordPointer(((Class142) class142_222_).aByte1614, ((Class142) class142_222_).aShort1616, ((Class106_Sub1) this).anInterface9_10140.method41(), (((Class106_Sub1) this).anInterface9_10140.method52() + (long) ((Class142) class142_222_).aByte1613));
			OpenGL.glEnableClientState(32888);
		} else
			OpenGL.glDisableClientState(32888);
	}

	final void method9417(int i, int i_223_, int i_224_) {
		OpenGL.glDrawArrays(i, i_223_, i_224_);
	}

	public void method1998(float f, float f_225_, float f_226_, float[] fs) {
		float f_227_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * f_225_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * f_226_));
		float f_228_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * f_225_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * f_226_));
		if (f_227_ < -f_228_ || f_227_ > f_228_) {
			float[] fs_229_ = fs;
			float[] fs_230_ = fs;
			fs[2] = Float.NaN;
			fs_230_[1] = Float.NaN;
			fs_229_[0] = Float.NaN;
		} else {
			float f_231_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * f) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * f_225_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * f_226_));
			if (f_231_ < -f_228_ || f_231_ > f_228_) {
				float[] fs_232_ = fs;
				float[] fs_233_ = fs;
				fs[2] = Float.NaN;
				fs_233_[1] = Float.NaN;
				fs_232_[0] = Float.NaN;
			} else {
				float f_234_ = ((((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13]) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1]) * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5]) * f_225_ + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9]) * f_226_);
				if (f_234_ < -f_228_ || f_234_ > f_228_) {
					float[] fs_235_ = fs;
					float[] fs_236_ = fs;
					fs[2] = Float.NaN;
					fs_236_[1] = Float.NaN;
					fs_235_[0] = Float.NaN;
				} else {
					float f_237_ = ((((Class106_Sub1) this).aClass250_10197.aFloatArray2728[14]) + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[2]) * f + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[6]) * f_225_ + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[10]) * f_226_);
					fs[0] = (((Class106_Sub1) this).aFloat10084 + (((Class106_Sub1) this).aFloat10085 * f_231_ / f_228_));
					fs[1] = (((Class106_Sub1) this).aFloat10075 + (((Class106_Sub1) this).aFloat10121 * f_234_ / f_228_));
					fs[2] = f_237_;
				}
			}
		}
	}

	final void method9418() {
		if (((Class106_Sub1) this).anInt10066 != 1) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9422(null);
			method9389(-2);
			method9454(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 1;
		}
	}

	final void method9419() {
		if (((Class106_Sub1) this).anInt10066 != 2) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9389(-2);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 2;
		}
	}

	public boolean method1980() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub3_10136 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub3_10136.method8684());
	}

	public boolean method1844() {
		return true;
	}

	public final void method1718(int[] is) {
		is[0] = ((Class106_Sub1) this).anInt10187;
		is[1] = ((Class106_Sub1) this).anInt10098;
		is[2] = ((Class106_Sub1) this).anInt10101;
		is[3] = ((Class106_Sub1) this).anInt10099;
	}

	public void method1944(Class105 class105) {
		((Class106_Sub1) this).aClass153_10042.method2506(this, class105);
	}

	final void method9420(int i, boolean bool, boolean bool_238_) {
		if (i != ((Class106_Sub1) this).anInt10138 || (((Class106_Sub1) this).aBool10086 != ((Class106_Sub1) this).aBool10135)) {
			Class155_Sub4 class155_sub4 = null;
			byte i_239_ = 0;
			byte i_240_ = 0;
			int i_241_ = 0;
			byte i_242_ = ((Class106_Sub1) this).aBool10135 ? (byte) 3 : (byte) 0;
			byte i_243_ = 0;
			if (i >= 0) {
				MaterialInformation class101 = aClass94_1396.getTexture(i, 798702301);
				if (class101.textureId * 811137757 != -1) {
					class155_sub4 = ((Class106_Sub1) this).aClass168_10036.method2684(class101);
					if (class101.textureSpeedU != 0 || class101.textureSpeedV != 0)
						method9491(((float) (((Class106_Sub1) this).anInt10047 % 128000) / 1000.0F * (float) class101.textureSpeedU / 64.0F % 1.0F), ((float) (((Class106_Sub1) this).anInt10047 % 128000) / 1000.0F * (float) class101.textureSpeedV / 64.0F % 1.0F), 0.0F);
					else
						method9427();
					if (!((Class106_Sub1) this).aBool10135) {
						i_240_ = class101.effectParam1;
						i_241_ = class101.anInt1361 * -1441531203;
						i_242_ = class101.effectId;
					}
					i_239_ = class101.combineMode;
				} else
					method9427();
				if (class101.aClass511_1342 == Class511.aClass511_5696)
					i_243_ = class101.aByte1343;
			} else
				method9427();
			method9438(i_243_);
			((Class106_Sub1) this).aClass147_10037.method2477(i_242_, i_240_, i_241_, bool, bool_238_);
			if (!((Class106_Sub1) this).aClass147_10037.method2478(class155_sub4, i_239_)) {
				method9422(class155_sub4);
				method9454(i_239_);
			}
			((Class106_Sub1) this).aBool10086 = ((Class106_Sub1) this).aBool10135;
			((Class106_Sub1) this).anInt10138 = i;
		}
		((Class106_Sub1) this).anInt10066 &= ~0x7;
	}

	final void method9421(int i) {
		if (((Class106_Sub1) this).anInt10194 != i) {
			OpenGL.glActiveTexture(33984 + i);
			((Class106_Sub1) this).anInt10194 = i;
		}
	}

	final void method9422(Class155 class155) {
		Class155 class155_244_ = (((Class106_Sub1) this).aClass155Array10146[((Class106_Sub1) this).anInt10194]);
		if (class155_244_ != class155) {
			if (class155 != null) {
				if (class155_244_ != null) {
					if (((Class155) class155).anInt1744 != ((Class155) class155_244_).anInt1744) {
						OpenGL.glDisable(((Class155) class155_244_).anInt1744);
						OpenGL.glEnable(((Class155) class155).anInt1744);
					}
				} else
					OpenGL.glEnable(((Class155) class155).anInt1744);
				OpenGL.glBindTexture(((Class155) class155).anInt1744, ((Class155) class155).anInt1745);
			} else
				OpenGL.glDisable(((Class155) class155_244_).anInt1744);
			((Class106_Sub1) this).aClass155Array10146[(((Class106_Sub1) this).anInt10194)] = class155;
		}
		((Class106_Sub1) this).anInt10066 &= ~0x1;
	}

	public boolean method1814() {
		return true;
	}

	public final int method2043() {
		return (((Class106_Sub1) this).anInt10055 + ((Class106_Sub1) this).anInt10054 + ((Class106_Sub1) this).anInt10198);
	}

	final void method9423(int i, int i_245_, int i_246_) {
		OpenGL.glTexEnvi(8960, 34176 + i, i_245_);
		OpenGL.glTexEnvi(8960, 34192 + i, i_246_);
	}

	final void method9424(int i, int i_247_, int i_248_) {
		OpenGL.glTexEnvi(8960, 34184 + i, i_247_);
		OpenGL.glTexEnvi(8960, 34200 + i, i_248_);
	}

	final void method9425(int i) {
		aFloatArray10141[0] = (float) (i & 0xff0000) / 1.671168E7F;
		aFloatArray10141[1] = (float) (i & 0xff00) / 65280.0F;
		aFloatArray10141[2] = (float) (i & 0xff) / 255.0F;
		aFloatArray10141[3] = (float) (i >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10141, 0);
	}

	final void method9426(float f, float f_249_, float f_250_, float f_251_) {
		aFloatArray10141[0] = f;
		aFloatArray10141[1] = f_249_;
		aFloatArray10141[2] = f_250_;
		aFloatArray10141[3] = f_251_;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10141, 0);
	}

	public Class261 method1770() {
		return new Class261(((Class106_Sub1) this).aClass261_10076);
	}

	final void method9427() {
		if (((Class106_Sub1) this).aBool10114) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			((Class106_Sub1) this).aBool10114 = false;
		}
	}

	final void method9428(boolean bool) {
		if (bool != ((Class106_Sub1) this).aBool10127) {
			((Class106_Sub1) this).aBool10127 = bool;
			method9407();
			((Class106_Sub1) this).anInt10066 &= ~0xf;
		}
	}

	final void method9429(boolean bool) {
		if (bool != ((Class106_Sub1) this).aBool9994) {
			((Class106_Sub1) this).aBool9994 = bool;
			method9430();
			((Class106_Sub1) this).anInt10066 &= ~0x7;
		}
	}

	public Class103 method1962(int i) {
		return (((Class106_Sub1) this).aBool10074 ? new Class103_Sub2_Sub2(this, i) : null);
	}

	void method9430() {
		if (((Class106_Sub1) this).aBool9994 && !((Class106_Sub1) this).aBool10110)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	final void method9431(boolean bool) {
		if (bool != ((Class106_Sub1) this).aBool10100) {
			if (bool)
				OpenGL.glEnable(2929);
			else
				OpenGL.glDisable(2929);
			((Class106_Sub1) this).aBool10100 = bool;
			((Class106_Sub1) this).anInt10066 &= ~0xf;
		}
	}

	final void method9432(boolean bool) {
		if (bool != ((Class106_Sub1) this).aBool10083) {
			((Class106_Sub1) this).aBool10083 = bool;
			method9433();
			((Class106_Sub1) this).anInt10066 &= ~0xf;
		}
	}

	final void method9433() {
		OpenGL.glDepthMask(((Class106_Sub1) this).aBool10083 && ((Class106_Sub1) this).aBool10118);
	}

	final void method9434(int i, int i_252_) {
		if (((Class106_Sub1) this).anInt10194 == 0) {
			boolean bool = false;
			if (((Class106_Sub1) this).anInt10142 != i) {
				OpenGL.glTexEnvi(8960, 34161, i);
				((Class106_Sub1) this).anInt10142 = i;
				bool = true;
			}
			if (((Class106_Sub1) this).anInt10143 != i_252_) {
				OpenGL.glTexEnvi(8960, 34162, i_252_);
				((Class106_Sub1) this).anInt10143 = i_252_;
				bool = true;
			}
			if (bool)
				((Class106_Sub1) this).anInt10066 &= ~0xd;
		} else {
			OpenGL.glTexEnvi(8960, 34161, i);
			OpenGL.glTexEnvi(8960, 34162, i_252_);
		}
	}

	final void method9435() {
		if (((Class106_Sub1) this).aBool10168)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	final void method9436() {
		if (((Class106_Sub1) this).aBool10177) {
			int i = 0;
			int i_253_ = 0;
			if (((Class106_Sub1) this).anInt10071 == 0) {
				i = 0;
				i_253_ = 0;
			} else if (((Class106_Sub1) this).anInt10071 == 1) {
				i = 1;
				i_253_ = 0;
			} else if (((Class106_Sub1) this).anInt10071 == 2) {
				i = 1;
				i_253_ = 1;
			} else if (((Class106_Sub1) this).anInt10071 == 3) {
				i = 0;
				i_253_ = 1;
			}
			if (((Class106_Sub1) this).anInt10068 == 1)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_253_);
			else if (((Class106_Sub1) this).anInt10068 == 2)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_253_);
			else if (((Class106_Sub1) this).anInt10068 == 3)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_253_);
			else if (((Class106_Sub1) this).anInt10068 == 0)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_253_);
		} else if (((Class106_Sub1) this).anInt10068 == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (((Class106_Sub1) this).anInt10068 == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (((Class106_Sub1) this).anInt10068 == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	final void method9437() {
		if (((Class106_Sub1) this).aBool10144)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (((Class106_Sub1) this).aByte10073 & 0xff) / 255.0F);
		if (((Class106_Sub1) this).anInt10035 > 0) {
			if (((Class106_Sub1) this).aByte10073 == 0)
				OpenGL.glDisable(32926);
			else
				OpenGL.glEnable(32926);
		}
	}

	final void method9438(byte i) {
		if (((Class106_Sub1) this).aByte10073 != i) {
			((Class106_Sub1) this).aByte10073 = i;
			if (i == 0) {
				method9448(2);
				method9456(1);
			} else {
				method9448(3);
				method9456(3);
			}
			method9437();
		}
	}

	public final int method1669() {
		return (((Class106_Sub1) this).anInt10055 + ((Class106_Sub1) this).anInt10054 + ((Class106_Sub1) this).anInt10198);
	}

	public final synchronized void method1668(int i) {
		int i_254_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub1) this).aClass675_10025.method7928((byte) -47)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10025.method7920(-1945803963);
			anIntArray10065[i_254_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10055 -= class572_sub26.anInt9258 * -1945426987;
			if (i_254_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_254_, anIntArray10065, 0);
				i_254_ = 0;
			}
		}
		if (i_254_ > 0) {
			OpenGL.glDeleteBuffersARB(i_254_, anIntArray10065, 0);
			i_254_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10059.method7928((byte) -6)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10059.method7920(-1945803963);
			anIntArray10065[i_254_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10054 -= class572_sub26.anInt9258 * -1945426987;
			if (i_254_ == 1000) {
				OpenGL.glDeleteTextures(i_254_, anIntArray10065, 0);
				i_254_ = 0;
			}
		}
		if (i_254_ > 0) {
			OpenGL.glDeleteTextures(i_254_, anIntArray10065, 0);
			i_254_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10032.method7928((byte) -101)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10032.method7920(-1945803963);
			anIntArray10065[i_254_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_254_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_254_, anIntArray10065, 0);
				i_254_ = 0;
			}
		}
		if (i_254_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_254_, anIntArray10065, 0);
			i_254_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10061.method7928((byte) -58)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10061.method7920(-1945803963);
			anIntArray10065[i_254_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10198 -= class572_sub26.anInt9258 * -1945426987;
			if (i_254_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_254_, anIntArray10065, 0);
				i_254_ = 0;
			}
		}
		if (i_254_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_254_, anIntArray10065, 0);
			boolean bool = false;
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -113)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub1) this).aClass675_10062.method7928((byte) -86)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10062.method7920(-1945803963);
			OpenGL.glDeleteProgramARB((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10063.method7928((byte) -46)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10063.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -66)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		((Class106_Sub1) this).aClass168_10036.method2690();
		if (method1669() > 100663296 && (Class69.method1067(-1820818434) > ((Class106_Sub1) this).aLong10064 + 60000L)) {
			System.gc();
			((Class106_Sub1) this).aLong10064 = Class69.method1067(-1971303424);
		}
		((Class106_Sub1) this).anInt10047 = i;
	}

	public void method1704(int i, int i_255_, int i_256_) {
		method2049();
		if (((Class106_Sub1) this).aClass104_Sub1_10190 == null)
			method9480(i_255_, i_256_);
		if (((Class106_Sub1) this).aClass161_10147 == null)
			((Class106_Sub1) this).aClass161_10147 = method1821(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), true);
		else
			((Class161_Sub2) ((Class106_Sub1) this).aClass161_10147).method10046(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 0, 0, true);
		method1661(((Class106_Sub1) this).aClass104_Sub1_10190, -1575826843);
		method1719(1, -16777216);
		((Class106_Sub1) this).aClass161_10147.method2597(anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553);
		OpenGL.glBindBufferARB(35051, (((Class106_Sub1) this).anIntArray10186[((Class106_Sub1) this).anInt10202]));
		OpenGL.glReadPixelsub(0, 0, anInt1414 * -2072806597, anInt1415 * -1374470803, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method1884(((Class106_Sub1) this).aClass104_Sub1_10190, 357481565);
		((Class106_Sub1) this).aLongArray10199[(((Class106_Sub1) this).anInt10202)] = OpenGL.glFenceSync(37143, 0);
		((Class106_Sub1) this).anIntArray10200[(((Class106_Sub1) this).anInt10202)] = i;
		if (++((Class106_Sub1) this).anInt10202 >= 3)
			((Class106_Sub1) this).anInt10202 = 0;
		method1748();
	}

	final synchronized void method9439(int i, int i_257_) {
		LinkableInt class572_sub26 = new LinkableInt(i_257_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub1) this).aClass675_10059.method7940(class572_sub26, -1499345626);
	}

	final synchronized void method9440(int i) {
		LinkableInt class572_sub26 = new LinkableInt(i);
		((Class106_Sub1) this).aClass675_10032.method7940(class572_sub26, -1634654254);
	}

	final synchronized void method9441(int i, int i_258_) {
		LinkableInt class572_sub26 = new LinkableInt(i_258_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub1) this).aClass675_10061.method7940(class572_sub26, -1948053981);
	}

	final synchronized void method9442(long l) {
		Class572 class572 = new Class572();
		class572.hash = l * 8535728873556543153L;
		((Class106_Sub1) this).aClass675_10063.method7940(class572, -1505832743);
	}

	final synchronized void method9443(int i) {
		Class572 class572 = new Class572();
		class572.hash = (long) i * 8535728873556543153L;
		((Class106_Sub1) this).aClass675_10062.method7940(class572, -2128030122);
	}

	static int method9444(Class171 class171) {
		switch (class171.anInt2065 * -660609339) {
			default:
				throw new IllegalStateException();
			case 1:
				return 6407;
			case 0:
				return 6408;
			case 6:
				return 6410;
			case 8:
				return 6409;
			case 2:
				return 6406;
			case 4:
				return 6402;
		}
	}

	static int method9445(Class171 class171, Class88 class88) {
		if (class88 == Class88.aClass88_1218) {
			switch (class171.anInt2065 * -660609339) {
				case 2:
					return 6406;
				case 6:
					return 6410;
				case 8:
					return 6409;
				case 1:
					return 6407;
				case 0:
					return 6408;
				default:
					throw new IllegalArgumentException();
			}
		}
		if (class88 == Class88.aClass88_1217) {
			switch (class171.anInt2065 * -660609339) {
				case 1:
					return 32852;
				case 4:
					return 33189;
				case 2:
					return 32830;
				case 0:
					return 32859;
				default:
					throw new IllegalArgumentException();
				case 6:
					return 36219;
				case 8:
					return 32834;
			}
		}
		if (class88 == Class88.aClass88_1216) {
			switch (class171.anInt2065 * -660609339) {
				case 4:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		}
		if (class88 == Class88.aClass88_1220) {
			switch (class171.anInt2065 * -660609339) {
				case 0:
					return 34842;
				case 6:
					return 34847;
				default:
					throw new IllegalArgumentException();
				case 2:
					return 34844;
				case 8:
					return 34846;
				case 1:
					return 34843;
			}
		}
		if (class88 == Class88.aClass88_1213) {
			switch (class171.anInt2065 * -660609339) {
				case 1:
					return 34837;
				case 8:
					return 34840;
				case 2:
					return 34838;
				case 0:
					return 34836;
				default:
					throw new IllegalArgumentException();
				case 6:
					return 34841;
			}
		}
		throw new IllegalArgumentException();
	}

	void method1667() {
		for (Class572 class572 = ((Class106_Sub1) this).aClass675_10130.method7932((byte) 50); class572 != null; class572 = ((Class106_Sub1) this).aClass675_10130.method7926(1360522156))
			((Class572_Sub35_Sub2) class572).method10071();
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2316();
		if (((Class106_Sub1) this).aBool10050) {
			Class472.method5585(false, true, (byte) -83);
			((Class106_Sub1) this).aBool10050 = false;
		}
	}

	public Class174 method1931(int i, int i_259_, int[][] is, int[][] is_260_, int i_261_, int i_262_, int i_263_) {
		return new Class174_Sub3(this, i_262_, i_263_, i, i_259_, is, is_260_, i_261_);
	}

	void method1733(int i, int i_264_) throws Exception_Sub1 {
		try {
			aClass104_Sub2_1419.method9924();
		} catch (Exception exception) {
			/* empty */
		}
		if (anInterface5_1408 != null)
			anInterface5_1408.method22((byte) -32);
	}

	public void method2020() {
		OpenGL.glFinish();
	}

	public final void method1886(int i, float f, float f_265_, float f_266_, float f_267_, float f_268_) {
		boolean bool = ((Class106_Sub1) this).anInt10115 != i;
		if (bool || ((Class106_Sub1) this).aFloat10120 != f || ((Class106_Sub1) this).aFloat10126 != f_265_) {
			((Class106_Sub1) this).anInt10115 = i;
			((Class106_Sub1) this).aFloat10120 = f;
			((Class106_Sub1) this).aFloat10126 = f_265_;
			if (bool) {
				((Class106_Sub1) this).aFloat10011 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff0000) / 1.671168E7F);
				((Class106_Sub1) this).aFloat10117 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff00) / 65280.0F);
				((Class106_Sub1) this).aFloat9992 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff) / 255.0F);
				method9405();
			}
			method9406();
		}
		if (((Class106_Sub1) this).aFloatArray10111[0] != f_266_ || ((Class106_Sub1) this).aFloatArray10111[1] != f_267_ || ((Class106_Sub1) this).aFloatArray10111[2] != f_268_) {
			((Class106_Sub1) this).aFloatArray10111[0] = f_266_;
			((Class106_Sub1) this).aFloatArray10111[1] = f_267_;
			((Class106_Sub1) this).aFloatArray10111[2] = f_268_;
			((Class106_Sub1) this).aFloatArray10112[0] = -f_266_;
			((Class106_Sub1) this).aFloatArray10112[1] = -f_267_;
			((Class106_Sub1) this).aFloatArray10112[2] = -f_268_;
			float f_269_ = (float) (1.0 / Math.sqrt((double) (f_266_ * f_266_ + f_267_ * f_267_ + f_268_ * f_268_)));
			((Class106_Sub1) this).aFloatArray10113[0] = f_266_ * f_269_;
			((Class106_Sub1) this).aFloatArray10113[1] = f_267_ * f_269_;
			((Class106_Sub1) this).aFloatArray10113[2] = f_268_ * f_269_;
			((Class106_Sub1) this).aFloatArray9998[0] = -((Class106_Sub1) this).aFloatArray10113[0];
			((Class106_Sub1) this).aFloatArray9998[1] = -((Class106_Sub1) this).aFloatArray10113[1];
			((Class106_Sub1) this).aFloatArray9998[2] = -((Class106_Sub1) this).aFloatArray10113[2];
			method9384();
			((Class106_Sub1) this).anInt10125 = (int) (f_266_ * 256.0F / f_267_);
			((Class106_Sub1) this).anInt10053 = (int) (f_268_ * 256.0F / f_267_);
		}
	}

	public void method1827(int i, int i_270_, int i_271_) {
		method2049();
		if (((Class106_Sub1) this).aClass104_Sub1_10190 == null)
			method9480(i_270_, i_271_);
		if (((Class106_Sub1) this).aClass161_10147 == null)
			((Class106_Sub1) this).aClass161_10147 = method1821(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), true);
		else
			((Class161_Sub2) ((Class106_Sub1) this).aClass161_10147).method10046(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 0, 0, true);
		method1661(((Class106_Sub1) this).aClass104_Sub1_10190, -1985557903);
		method1719(1, -16777216);
		((Class106_Sub1) this).aClass161_10147.method2597(anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553);
		OpenGL.glBindBufferARB(35051, (((Class106_Sub1) this).anIntArray10186[((Class106_Sub1) this).anInt10202]));
		OpenGL.glReadPixelsub(0, 0, anInt1414 * -2072806597, anInt1415 * -1374470803, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method1884(((Class106_Sub1) this).aClass104_Sub1_10190, 1747900938);
		((Class106_Sub1) this).aLongArray10199[(((Class106_Sub1) this).anInt10202)] = OpenGL.glFenceSync(37143, 0);
		((Class106_Sub1) this).anIntArray10200[(((Class106_Sub1) this).anInt10202)] = i;
		if (++((Class106_Sub1) this).anInt10202 >= 3)
			((Class106_Sub1) this).anInt10202 = 0;
		method1748();
	}

	public final synchronized void method1885(int i) {
		int i_272_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub1) this).aClass675_10025.method7928((byte) -92)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10025.method7920(-1945803963);
			anIntArray10065[i_272_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10055 -= class572_sub26.anInt9258 * -1945426987;
			if (i_272_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_272_, anIntArray10065, 0);
				i_272_ = 0;
			}
		}
		if (i_272_ > 0) {
			OpenGL.glDeleteBuffersARB(i_272_, anIntArray10065, 0);
			i_272_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10059.method7928((byte) -66)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10059.method7920(-1945803963);
			anIntArray10065[i_272_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10054 -= class572_sub26.anInt9258 * -1945426987;
			if (i_272_ == 1000) {
				OpenGL.glDeleteTextures(i_272_, anIntArray10065, 0);
				i_272_ = 0;
			}
		}
		if (i_272_ > 0) {
			OpenGL.glDeleteTextures(i_272_, anIntArray10065, 0);
			i_272_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10032.method7928((byte) -70)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10032.method7920(-1945803963);
			anIntArray10065[i_272_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_272_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_272_, anIntArray10065, 0);
				i_272_ = 0;
			}
		}
		if (i_272_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_272_, anIntArray10065, 0);
			i_272_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10061.method7928((byte) -35)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10061.method7920(-1945803963);
			anIntArray10065[i_272_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10198 -= class572_sub26.anInt9258 * -1945426987;
			if (i_272_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_272_, anIntArray10065, 0);
				i_272_ = 0;
			}
		}
		if (i_272_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_272_, anIntArray10065, 0);
			boolean bool = false;
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -18)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub1) this).aClass675_10062.method7928((byte) -116)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10062.method7920(-1945803963);
			OpenGL.glDeleteProgramARB((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10063.method7928((byte) -9)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10063.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -18)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		((Class106_Sub1) this).aClass168_10036.method2690();
		if (method1669() > 100663296 && (Class69.method1067(-1824246455) > ((Class106_Sub1) this).aLong10064 + 60000L)) {
			System.gc();
			((Class106_Sub1) this).aLong10064 = Class69.method1067(-1872550351);
		}
		((Class106_Sub1) this).anInt10047 = i;
	}

	public final synchronized void method1805(int i) {
		int i_273_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub1) this).aClass675_10025.method7928((byte) -57)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10025.method7920(-1945803963);
			anIntArray10065[i_273_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10055 -= class572_sub26.anInt9258 * -1945426987;
			if (i_273_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_273_, anIntArray10065, 0);
				i_273_ = 0;
			}
		}
		if (i_273_ > 0) {
			OpenGL.glDeleteBuffersARB(i_273_, anIntArray10065, 0);
			i_273_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10059.method7928((byte) -62)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10059.method7920(-1945803963);
			anIntArray10065[i_273_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10054 -= class572_sub26.anInt9258 * -1945426987;
			if (i_273_ == 1000) {
				OpenGL.glDeleteTextures(i_273_, anIntArray10065, 0);
				i_273_ = 0;
			}
		}
		if (i_273_ > 0) {
			OpenGL.glDeleteTextures(i_273_, anIntArray10065, 0);
			i_273_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10032.method7928((byte) -80)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10032.method7920(-1945803963);
			anIntArray10065[i_273_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_273_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_273_, anIntArray10065, 0);
				i_273_ = 0;
			}
		}
		if (i_273_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_273_, anIntArray10065, 0);
			i_273_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10061.method7928((byte) -81)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10061.method7920(-1945803963);
			anIntArray10065[i_273_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10198 -= class572_sub26.anInt9258 * -1945426987;
			if (i_273_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_273_, anIntArray10065, 0);
				i_273_ = 0;
			}
		}
		if (i_273_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_273_, anIntArray10065, 0);
			boolean bool = false;
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -27)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub1) this).aClass675_10062.method7928((byte) -69)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10062.method7920(-1945803963);
			OpenGL.glDeleteProgramARB((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10063.method7928((byte) -17)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10063.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -57)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		((Class106_Sub1) this).aClass168_10036.method2690();
		if (method1669() > 100663296 && (Class69.method1067(-1869766503) > ((Class106_Sub1) this).aLong10064 + 60000L)) {
			System.gc();
			((Class106_Sub1) this).aLong10064 = Class69.method1067(-1835428217);
		}
		((Class106_Sub1) this).anInt10047 = i;
	}

	public void method1706(long l) {
		if (OpenGL.glUnmapBufferARB(35051)) {
			/* empty */
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	public final int method2045() {
		return (((Class106_Sub1) this).anInt10055 + ((Class106_Sub1) this).anInt10054 + ((Class106_Sub1) this).anInt10198);
	}

	public final int method1808() {
		return (((Class106_Sub1) this).anInt10055 + ((Class106_Sub1) this).anInt10054 + ((Class106_Sub1) this).anInt10198);
	}

	final void method9446() {
		OpenGL.glPushMatrix();
	}

	public boolean method1977() {
		return true;
	}

	public boolean method1811() {
		return true;
	}

	public boolean method1769() {
		return true;
	}

	public void method2035(float f, float f_274_, float f_275_, float[] fs) {
		float f_276_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * f_274_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * f_275_));
		float f_277_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * f_274_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * f_275_));
		float f_278_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * f_274_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * f_275_));
		float f_279_ = (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[14] + ((Class106_Sub1) this).aClass250_10197.aFloatArray2728[2] * f + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[6] * f_274_) + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[10] * f_275_));
		fs[0] = (((Class106_Sub1) this).aFloat10084 + ((Class106_Sub1) this).aFloat10085 * f_277_ / f_276_);
		fs[1] = (((Class106_Sub1) this).aFloat10075 + ((Class106_Sub1) this).aFloat10121 * f_278_ / f_276_);
		fs[2] = f_279_;
	}

	public boolean method1815() {
		return true;
	}

	public boolean method1816() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && (((Class106_Sub1) this).anInt10035 <= 1 || ((Class106_Sub1) this).aBool10162));
	}

	public boolean method1817() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && (((Class106_Sub1) this).anInt10035 <= 1 || ((Class106_Sub1) this).aBool10162));
	}

	public final void method2036() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684()) {
			((Class106_Sub1) this).aClass135_10038.method2325(((Class106_Sub1) this).aClass572_Sub32_Sub2_10039);
			((Class106_Sub1) this).aClass168_10036.method2688();
		}
	}

	public void method1719(int i, int i_280_) {
		int i_281_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_280_ & 0xff0000) / 1.671168E7F, (float) (i_280_ & 0xff00) / 65280.0F, (float) (i_280_ & 0xff) / 255.0F, (float) (i_280_ >>> 24) / 255.0F);
			i_281_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method9432(true);
			i_281_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_281_ |= 0x400;
		OpenGL.glClear(i_281_);
	}

	final void method9447() {
		if (((Class106_Sub1) this).anInt10066 != 1) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9422(null);
			method9389(-2);
			method9454(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 1;
		}
	}

	public Class250 method1799() {
		return ((Class106_Sub1) this).aClass250_10043;
	}

	final void method9448(int i) {
		if (((Class106_Sub1) this).anInt10071 != i) {
			((Class106_Sub1) this).anInt10071 = i;
			method9436();
		}
	}

	public void method1975() {
		((Class106_Sub1) this).anInt10104 = 0;
		((Class106_Sub1) this).anInt10105 = 0;
		((Class106_Sub1) this).anInt10106 = aClass104_1410.method1648();
		((Class106_Sub1) this).anInt10107 = aClass104_1410.method1646();
		method9482();
	}

	public void method1983(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		class90.method1511(class326, ((Class106_Sub1) this).aClass250_10079, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	public boolean method1903() {
		return true;
	}

	public boolean method1825() {
		return true;
	}

	public boolean method1921() {
		return false;
	}

	public boolean method1996() {
		return false;
	}

	public String method1829() {
		String string = "Caps: 2:";
		String string_282_ = ":";
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10035).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10178).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10150).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10155).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10170).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10052).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10179).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10153 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10151 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10077 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10163 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10164 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10161 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10172 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10174 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10116 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10048 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10166 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10169 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10074 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10173 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10154 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10124 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10159 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10160 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10175 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10176 ? 1 : 0).append(string_282_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10177 ? 1 : 0).toString();
		return string;
	}

	public String method1830() {
		String string = "Caps: 2:";
		String string_283_ = ":";
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10035).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10178).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10150).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10155).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).anInt10170).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10052).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aFloat10179).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10153 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10151 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10077 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10163 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10164 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10161 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10172 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10174 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10116 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10048 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10166 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10169 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10074 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10173 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10154 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10124 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10159 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10160 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10175 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10176 ? 1 : 0).append(string_283_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub1) this).aBool10177 ? 1 : 0).toString();
		return string;
	}

	public void method1710(boolean bool) {
		/* empty */
	}

	public void method1832(boolean bool) {
		/* empty */
	}

	Class104_Sub2 method1833(Canvas canvas, int i, int i_284_) {
		return new Class104_Sub2_Sub2(this, canvas);
	}

	public int[] method1834(int i, int i_285_, int i_286_, int i_287_) {
		if (aClass104_1410 != null) {
			int[] is = new int[i_286_ * i_287_];
			int i_288_ = aClass104_1410.method1646();
			for (int i_289_ = 0; i_289_ < i_287_; i_289_++)
				OpenGL.glReadPixelsi(i, i_288_ - i_285_ - i_289_ - 1, i_286_, 1, 32993, ((Class106_Sub1) this).anInt10178, is, i_289_ * i_286_);
			return is;
		}
		return null;
	}

	public int[] method1780(int i, int i_290_, int i_291_, int i_292_) {
		if (aClass104_1410 != null) {
			int[] is = new int[i_291_ * i_292_];
			int i_293_ = aClass104_1410.method1646();
			for (int i_294_ = 0; i_294_ < i_292_; i_294_++)
				OpenGL.glReadPixelsi(i, i_293_ - i_290_ - i_294_ - 1, i_291_, 1, 32993, ((Class106_Sub1) this).anInt10178, is, i_294_ * i_291_);
			return is;
		}
		return null;
	}

	public Class165 method1662() {
		int i = -1;
		if (((Class106_Sub1) this).aString10149.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class106_Sub1) this).aString10149.indexOf("intel") != -1)
			i = 32902;
		else if (((Class106_Sub1) this).aString10149.indexOf("ati") != -1)
			i = 4098;
		return new Class165(i, "OpenGL", ((Class106_Sub1) this).anInt10152, ((Class106_Sub1) this).aString9995, 0L, false);
	}

	public void method1837() {
		if (((Class106_Sub1) this).aBool10176 && aClass104_1410 != null) {
			int i = ((Class106_Sub1) this).anInt10187;
			int i_295_ = ((Class106_Sub1) this).anInt10101;
			int i_296_ = ((Class106_Sub1) this).anInt10098;
			int i_297_ = ((Class106_Sub1) this).anInt10099;
			method1714();
			int i_298_ = ((Class106_Sub1) this).anInt10104;
			int i_299_ = ((Class106_Sub1) this).anInt10105;
			int i_300_ = ((Class106_Sub1) this).anInt10106;
			int i_301_ = ((Class106_Sub1) this).anInt10107;
			method1975();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			method9399();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9422(null);
			method9389(-2);
			method9454(1);
			method9456(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			method1715(i, i_296_, i_295_, i_297_);
			method2004(i_298_, i_299_, i_300_, i_301_);
		}
	}

	public boolean method1839() {
		return ((Class106_Sub1) this).aBool10165;
	}

	public final void method1947(int i) {
		((Class106_Sub1) this).anInt10049 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class106_Sub1) this).anInt10049++;
		((Class106_Sub1) this).anInt10060 = 1 << ((Class106_Sub1) this).anInt10049;
	}

	public boolean method2047() {
		if (((Class106_Sub1) this).aBool10165 && (((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10202]) != 0L)
			return false;
		return true;
	}

	public boolean method2022() {
		return true;
	}

	public boolean method1846() {
		return true;
	}

	boolean method1906(int i, int i_302_, int i_303_, int i_304_, Class261 class261, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		return class326.method4147(i, i_302_, i_303_, i_304_, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	public int method1848() {
		if (((Class106_Sub1) this).aBool10165) {
			if ((((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10171]) == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync((((Class106_Sub1) this).aLongArray10199[(((Class106_Sub1) this).anInt10171)]), 0, 0);
			if (i == 37149) {
				method1703();
				return -1;
			}
			return i != 37147 ? (((Class106_Sub1) this).anIntArray10200[((Class106_Sub1) this).anInt10171]) : -1;
		}
		return -1;
	}

	public Class165 method2011() {
		int i = -1;
		if (((Class106_Sub1) this).aString10149.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class106_Sub1) this).aString10149.indexOf("intel") != -1)
			i = 32902;
		else if (((Class106_Sub1) this).aString10149.indexOf("ati") != -1)
			i = 4098;
		return new Class165(i, "OpenGL", ((Class106_Sub1) this).anInt10152, ((Class106_Sub1) this).aString9995, 0L, false);
	}

	public void method1880() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
				((Class106_Sub1) this).aLongArray10199[i] = 0L;
			}
		}
		((Class106_Sub1) this).anInt10202 = 0;
		((Class106_Sub1) this).anInt10171 = 0;
	}

	public final boolean method1809() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null) {
			if (!((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684()) {
				if (((Class106_Sub1) this).aClass135_10038.method2322(((Class106_Sub1) this).aClass572_Sub32_Sub2_10039))
					((Class106_Sub1) this).aClass168_10036.method2688();
				else
					return false;
			}
			return true;
		}
		return false;
	}

	public long method1853(int i, int i_305_) {
		return method9452(i, i_305_, null, null);
	}

	public long method1854(int i, int i_306_) {
		return method9452(i, i_306_, null, null);
	}

	public void method1855(long l) {
		if (OpenGL.glUnmapBufferARB(35051)) {
			/* empty */
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	public void method1856(long l) {
		if (OpenGL.glUnmapBufferARB(35051)) {
			/* empty */
		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	public void method1857(int i, int i_307_, int[] is, int[] is_308_) {
		method9452(i, i_307_, is, is_308_);
	}

	public void method1858() {
		if (((Class106_Sub1) this).aBool10165) {
			((Class106_Sub1) this).aClass161_10147 = null;
			if (((Class106_Sub1) this).aClass104_Sub1_10190 != null) {
				((Class106_Sub1) this).aClass104_Sub1_10190.method39();
				((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			}
			OpenGL.glDeleteBuffersARB(3, ((Class106_Sub1) this).anIntArray10186, 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub1) this).anIntArray10186[i] = 0;
				if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
					((Class106_Sub1) this).aLongArray10199[i] = 0L;
				}
			}
		} else {
			((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			((Class106_Sub1) this).aClass161_10109 = null;
			((Class106_Sub1) this).aClass161_10147 = null;
		}
	}

	public void method1859() {
		if (((Class106_Sub1) this).aBool10165) {
			((Class106_Sub1) this).aClass161_10147 = null;
			if (((Class106_Sub1) this).aClass104_Sub1_10190 != null) {
				((Class106_Sub1) this).aClass104_Sub1_10190.method39();
				((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			}
			OpenGL.glDeleteBuffersARB(3, ((Class106_Sub1) this).anIntArray10186, 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub1) this).anIntArray10186[i] = 0;
				if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
					((Class106_Sub1) this).aLongArray10199[i] = 0L;
				}
			}
		} else {
			((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			((Class106_Sub1) this).aClass161_10109 = null;
			((Class106_Sub1) this).aClass161_10147 = null;
		}
	}

	public int method1847() {
		if (((Class106_Sub1) this).aBool10165) {
			if ((((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10171]) == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync((((Class106_Sub1) this).aLongArray10199[(((Class106_Sub1) this).anInt10171)]), 0, 0);
			if (i == 37149) {
				method1703();
				return -1;
			}
			return i != 37147 ? (((Class106_Sub1) this).anIntArray10200[((Class106_Sub1) this).anInt10171]) : -1;
		}
		return -1;
	}

	public void method1985(boolean bool) {
		((Class106_Sub1) this).aBool10118 = bool;
		method9433();
	}

	public void method1924(boolean bool) {
		((Class106_Sub1) this).aBool10118 = bool;
		method9433();
	}

	public void method1687(boolean bool) {
		((Class106_Sub1) this).aBool10118 = bool;
		method9433();
	}

	public boolean method1674() {
		return true;
	}

	public boolean method1691() {
		return true;
	}

	public void method1866() {
		((Class106_Sub1) this).anInt10104 = 0;
		((Class106_Sub1) this).anInt10105 = 0;
		((Class106_Sub1) this).anInt10106 = aClass104_1410.method1648();
		((Class106_Sub1) this).anInt10107 = aClass104_1410.method1646();
		method9482();
	}

	public void method1867() {
		((Class106_Sub1) this).anInt10104 = 0;
		((Class106_Sub1) this).anInt10105 = 0;
		((Class106_Sub1) this).anInt10106 = aClass104_1410.method1648();
		((Class106_Sub1) this).anInt10107 = aClass104_1410.method1646();
		method9482();
	}

	public void method1784(int i, int i_309_, int i_310_, int i_311_) {
		((Class106_Sub1) this).anInt10104 = i;
		((Class106_Sub1) this).anInt10105 = i_309_;
		((Class106_Sub1) this).anInt10106 = i_310_;
		((Class106_Sub1) this).anInt10107 = i_311_;
		method9482();
	}

	public void method1869(int[] is) {
		is[0] = ((Class106_Sub1) this).anInt10104;
		is[1] = ((Class106_Sub1) this).anInt10105;
		is[2] = ((Class106_Sub1) this).anInt10106;
		is[3] = ((Class106_Sub1) this).anInt10107;
	}

	public void method1741(float f, float f_312_) {
		((Class106_Sub1) this).aFloat10088 = f;
		((Class106_Sub1) this).aFloat9991 = f_312_;
		method9394();
	}

	public void method1871(float f, float f_313_) {
		((Class106_Sub1) this).aFloat10088 = f;
		((Class106_Sub1) this).aFloat9991 = f_313_;
		method9394();
	}

	public final void method1735(int i, int i_314_, int i_315_, int i_316_) {
		if (aClass104_1410 != null) {
			if (i < 0)
				i = 0;
			if (i_315_ > aClass104_1410.method1648())
				i_315_ = aClass104_1410.method1648();
			if (i_314_ < 0)
				i_314_ = 0;
			if (i_316_ > aClass104_1410.method1646())
				i_316_ = aClass104_1410.method1646();
			((Class106_Sub1) this).anInt10187 = i;
			((Class106_Sub1) this).anInt10098 = i_314_;
			((Class106_Sub1) this).anInt10101 = i_315_;
			((Class106_Sub1) this).anInt10099 = i_316_;
			OpenGL.glEnable(3089);
			method9395();
		}
	}

	final void method9449() {
		((Class106_Sub1) this).aFloat10091 = ((Class106_Sub1) this).aClass250_10079.method3487();
		((Class106_Sub1) this).aFloat10090 = ((Class106_Sub1) this).aClass250_10079.method3453();
		method9408();
		if (((Class106_Sub1) this).anInt10087 == 2)
			method9402(((Class106_Sub1) this).aClass250_10079.aFloatArray2728);
		else if (((Class106_Sub1) this).anInt10087 == 1)
			method9402(((Class106_Sub1) this).aClass250_10080.aFloatArray2728);
	}

	public void method1911(Class572_Sub35 class572_sub35) {
		((Class106_Sub1) this).aNativeHeap10051 = (((Class572_Sub35_Sub2) (Class572_Sub35_Sub2) class572_sub35).aNativeHeap10989);
		if (((Class106_Sub1) this).anInterface9_10180 == null) {
			Class572_Sub15_Sub1 class572_sub15_sub1 = new Class572_Sub15_Sub1(80);
			if (((Class106_Sub1) this).aBool10153) {
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(-1.0F);
				class572_sub15_sub1.method10299(0.0F);
				class572_sub15_sub1.method10299(1.0F);
				class572_sub15_sub1.method10299(0.0F);
			} else {
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(-1.0F);
				class572_sub15_sub1.method10298(0.0F);
				class572_sub15_sub1.method10298(1.0F);
				class572_sub15_sub1.method10298(0.0F);
			}
			((Class106_Sub1) this).anInterface9_10180 = method9413(20, class572_sub15_sub1.b, class572_sub15_sub1.o * -1585139053, false);
			((Class106_Sub1) this).aClass142_10184 = new Class142(((Class106_Sub1) this).anInterface9_10180, 5126, 3, 0);
			((Class106_Sub1) this).aClass142_10185 = new Class142(((Class106_Sub1) this).anInterface9_10180, 5126, 2, 12);
			((Class106_Sub1) this).aClass153_10042.method2510(this);
		}
	}

	public void method1876(int i, int i_317_, int i_318_, int i_319_, int i_320_, int i_321_) {
		float f = (float) i + 0.35F;
		float f_322_ = (float) i_317_ + 0.35F;
		float f_323_ = f + (float) i_318_;
		float f_324_ = f_322_ + (float) i_319_;
		method9418();
		method9456(i_321_);
		OpenGL.glColor4ub((byte) (i_320_ >> 16), (byte) (i_320_ >> 8), (byte) i_320_, (byte) (i_320_ >> 24));
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_322_);
		OpenGL.glVertex2f(f, f_324_);
		OpenGL.glVertex2f(f_323_, f_324_);
		OpenGL.glVertex2f(f_323_, f_322_);
		OpenGL.glEnd();
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glEnable(32925);
	}

	public void method1663(int i, int i_325_, int i_326_, int i_327_, int i_328_, int i_329_) {
		float f = (float) i + 0.35F;
		float f_330_ = (float) i_325_ + 0.35F;
		float f_331_ = f + (float) i_326_;
		float f_332_ = f_330_ + (float) i_327_;
		method9418();
		method9456(i_329_);
		OpenGL.glColor4ub((byte) (i_328_ >> 16), (byte) (i_328_ >> 8), (byte) i_328_, (byte) (i_328_ >> 24));
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_330_);
		OpenGL.glVertex2f(f, f_332_);
		OpenGL.glVertex2f(f_331_, f_332_);
		OpenGL.glVertex2f(f_331_, f_330_);
		OpenGL.glEnd();
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glEnable(32925);
	}

	public void method1878(int i, int i_333_, int i_334_, int i_335_, int i_336_, int i_337_) {
		float f = (float) i + 0.35F;
		float f_338_ = (float) i_333_ + 0.35F;
		float f_339_ = f + (float) i_334_;
		float f_340_ = f_338_ + (float) i_335_;
		method9418();
		method9456(i_337_);
		OpenGL.glColor4ub((byte) (i_336_ >> 16), (byte) (i_336_ >> 8), (byte) i_336_, (byte) (i_336_ >> 24));
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_338_);
		OpenGL.glVertex2f(f, f_340_);
		OpenGL.glVertex2f(f_339_, f_340_);
		OpenGL.glVertex2f(f_339_, f_338_);
		OpenGL.glEnd();
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glEnable(32925);
	}

	public boolean method1734() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && (((Class106_Sub1) this).anInt10035 <= 1 || ((Class106_Sub1) this).aBool10162));
	}

	void method1721(int i, int i_341_, int i_342_, int i_343_, int i_344_) {
		if (i_342_ < 0)
			i_342_ = -i_342_;
		if (i + i_342_ >= ((Class106_Sub1) this).anInt10187 && i - i_342_ <= ((Class106_Sub1) this).anInt10101 && i_341_ + i_342_ >= ((Class106_Sub1) this).anInt10098 && i_341_ - i_342_ <= ((Class106_Sub1) this).anInt10099) {
			method9418();
			method9456(i_344_);
			OpenGL.glColor4ub((byte) (i_343_ >> 16), (byte) (i_343_ >> 8), (byte) i_343_, (byte) (i_343_ >> 24));
			float f = (float) i + 0.35F;
			float f_345_ = (float) i_341_ + 0.35F;
			int i_346_ = i_342_ << 1;
			if ((float) i_346_ < ((Class106_Sub1) this).aFloat10052) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f + 1.0F, f_345_ + 1.0F);
				OpenGL.glVertex2f(f + 1.0F, f_345_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_345_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_345_ + 1.0F);
				OpenGL.glEnd();
			} else if ((float) i_346_ <= ((Class106_Sub1) this).aFloat10179) {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize((float) i_346_);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f, f_345_);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			} else {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f, f_345_);
				int i_347_ = 262144 / (6 * i_342_);
				if (i_347_ <= 64)
					i_347_ = 64;
				else if (i_347_ > 512)
					i_347_ = 512;
				i_347_ = Cs2CallPointer.method5627(i_347_, 326245663);
				OpenGL.glVertex2f(f + (float) i_342_, f_345_);
				for (int i_348_ = 16384 - i_347_; i_348_ > 0; i_348_ -= i_347_)
					OpenGL.glVertex2f(f + (Class178.aFloatArray2109[i_348_] * (float) i_342_), f_345_ + (Class178.aFloatArray2110[i_348_]) * (float) i_342_);
				OpenGL.glVertex2f(f + (float) i_342_, f_345_);
				OpenGL.glEnd();
			}
		}
	}

	void method2013(int i, int i_349_, int i_350_, int i_351_, int i_352_) {
		method9418();
		method9456(i_352_);
		float f = (float) i + 0.35F;
		float f_353_ = (float) i_349_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_351_ >> 16), (byte) (i_351_ >> 8), (byte) i_351_, (byte) (i_351_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_353_);
		OpenGL.glVertex2f(f + (float) i_350_, f_353_);
		OpenGL.glEnd();
	}

	void method1882(int i, int i_354_, int i_355_, int i_356_, int i_357_) {
		method9418();
		method9456(i_357_);
		float f = (float) i + 0.35F;
		float f_358_ = (float) i_354_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_356_ >> 16), (byte) (i_356_ >> 8), (byte) i_356_, (byte) (i_356_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_358_);
		OpenGL.glVertex2f(f + (float) i_355_, f_358_);
		OpenGL.glEnd();
	}

	void method1883(int i, int i_359_, int i_360_, int i_361_, int i_362_) {
		method9418();
		method9456(i_362_);
		float f = (float) i + 0.35F;
		float f_363_ = (float) i_359_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_361_ >> 16), (byte) (i_361_ >> 8), (byte) i_361_, (byte) (i_361_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_363_);
		OpenGL.glVertex2f(f, f_363_ + (float) i_360_);
		OpenGL.glEnd();
	}

	void method1768(int i, int i_364_, int i_365_, int i_366_, int i_367_) {
		method9418();
		method9456(i_367_);
		float f = (float) i + 0.35F;
		float f_368_ = (float) i_364_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_366_ >> 16), (byte) (i_366_ >> 8), (byte) i_366_, (byte) (i_366_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_368_);
		OpenGL.glVertex2f(f, f_368_ + (float) i_365_);
		OpenGL.glEnd();
	}

	void method1800(int i, int i_369_, int i_370_, int i_371_, int i_372_) {
		method9418();
		method9456(i_372_);
		float f = (float) i + 0.35F;
		float f_373_ = (float) i_369_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_371_ >> 16), (byte) (i_371_ >> 8), (byte) i_371_, (byte) (i_371_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_373_);
		OpenGL.glVertex2f(f, f_373_ + (float) i_370_);
		OpenGL.glEnd();
	}

	public void method1813(int i, int i_374_, int i_375_, int i_376_, int i_377_, int i_378_) {
		method9418();
		method9456(i_378_);
		float f = (float) i_375_ - (float) i;
		float f_379_ = (float) i_376_ - (float) i_374_;
		if (f == 0.0F && f_379_ == 0.0F)
			f = 1.0F;
		else {
			float f_380_ = (float) (1.0 / Math.sqrt((double) (f * f + f_379_ * f_379_)));
			f *= f_380_;
			f_379_ *= f_380_;
		}
		OpenGL.glColor4ub((byte) (i_377_ >> 16), (byte) (i_377_ >> 8), (byte) i_377_, (byte) (i_377_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_374_ + 0.35F);
		OpenGL.glVertex2f((float) i_375_ + f + 0.35F, (float) i_376_ + f_379_ + 0.35F);
		OpenGL.glEnd();
	}

	public void method2029(int i, Class167 class167, int i_381_, int i_382_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(1);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_383_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_381_), f_383_ * (float) (((Class106_Sub1) this).anInt10098 - i_382_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10098);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_381_), f_383_ * (float) (((Class106_Sub1) this).anInt10099 - i_382_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_381_), f_383_ * (float) (((Class106_Sub1) this).anInt10099 - i_382_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_381_), f_383_ * (float) (((Class106_Sub1) this).anInt10098 - i_382_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10098);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	public void method1979(int i, int i_384_, int i_385_, int i_386_, int i_387_, int i_388_) {
		method9418();
		method9456(i_388_);
		float f = (float) i_385_ - (float) i;
		float f_389_ = (float) i_386_ - (float) i_384_;
		if (f == 0.0F && f_389_ == 0.0F)
			f = 1.0F;
		else {
			float f_390_ = (float) (1.0 / Math.sqrt((double) (f * f + f_389_ * f_389_)));
			f *= f_390_;
			f_389_ *= f_390_;
		}
		OpenGL.glColor4ub((byte) (i_387_ >> 16), (byte) (i_387_ >> 8), (byte) i_387_, (byte) (i_387_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_384_ + 0.35F);
		OpenGL.glVertex2f((float) i_385_ + f + 0.35F, (float) i_386_ + f_389_ + 0.35F);
		OpenGL.glEnd();
	}

	public void method1889(int i, int i_391_, int i_392_, int i_393_, int i_394_, int i_395_, int i_396_, int i_397_, int i_398_) {
		if (i != i_392_ || i_391_ != i_393_) {
			method9418();
			method9456(i_395_);
			float f = (float) i_392_ - (float) i;
			float f_399_ = (float) i_393_ - (float) i_391_;
			float f_400_ = (float) (1.0 / Math.sqrt((double) (f * f + f_399_ * f_399_)));
			f *= f_400_;
			f_399_ *= f_400_;
			OpenGL.glColor4ub((byte) (i_394_ >> 16), (byte) (i_394_ >> 8), (byte) i_394_, (byte) (i_394_ >> 24));
			i_398_ %= i_397_ + i_396_;
			float f_401_ = f * (float) i_396_;
			float f_402_ = f_399_ * (float) i_396_;
			float f_403_ = 0.0F;
			float f_404_ = 0.0F;
			float f_405_ = f_401_;
			float f_406_ = f_402_;
			if (i_398_ > i_396_) {
				f_403_ = f * (float) (i_396_ + i_397_ - i_398_);
				f_404_ = f_399_ * (float) (i_396_ + i_397_ - i_398_);
			} else {
				f_405_ = f * (float) (i_396_ - i_398_);
				f_406_ = f_399_ * (float) (i_396_ - i_398_);
			}
			float f_407_ = (float) i + 0.35F + f_403_;
			float f_408_ = (float) i_391_ + 0.35F + f_404_;
			float f_409_ = f * (float) i_397_;
			float f_410_ = f_399_ * (float) i_397_;
			for (;;) {
				if (i_392_ > i) {
					if (f_407_ > (float) i_392_ + 0.35F)
						break;
					if (f_407_ + f_405_ > (float) i_392_)
						f_405_ = (float) i_392_ - f_407_;
				} else {
					if (f_407_ < (float) i_392_ + 0.35F)
						break;
					if (f_407_ + f_405_ < (float) i_392_)
						f_405_ = (float) i_392_ - f_407_;
				}
				if (i_393_ > i_391_) {
					if (f_408_ > (float) i_393_ + 0.35F)
						break;
					if (f_408_ + f_406_ > (float) i_393_)
						f_406_ = (float) i_393_ - f_408_;
				} else {
					if (f_408_ < (float) i_393_ + 0.35F)
						break;
					if (f_408_ + f_406_ < (float) i_393_)
						f_406_ = (float) i_393_ - f_408_;
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_407_, f_408_);
				OpenGL.glVertex2f(f_407_ + f_405_, f_408_ + f_406_);
				OpenGL.glEnd();
				f_407_ += f_409_ + f_405_;
				f_408_ += f_410_ + f_406_;
				f_405_ = f_401_;
				f_406_ = f_402_;
			}
		}
	}

	boolean method9450() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub3_10136 != null) {
			if (!((Class106_Sub1) this).aClass572_Sub32_Sub3_10136.method8684()) {
				if (((Class106_Sub1) this).aClass135_10038.method2322(((Class106_Sub1) this).aClass572_Sub32_Sub3_10136))
					((Class106_Sub1) this).aClass168_10036.method2688();
				else
					return false;
			}
			return true;
		}
		return false;
	}

	public void method1891(int i, int i_411_, int i_412_, int i_413_, int i_414_, int i_415_, int i_416_, int i_417_, int i_418_) {
		if (i != i_412_ || i_411_ != i_413_) {
			method9418();
			method9456(i_415_);
			float f = (float) i_412_ - (float) i;
			float f_419_ = (float) i_413_ - (float) i_411_;
			float f_420_ = (float) (1.0 / Math.sqrt((double) (f * f + f_419_ * f_419_)));
			f *= f_420_;
			f_419_ *= f_420_;
			OpenGL.glColor4ub((byte) (i_414_ >> 16), (byte) (i_414_ >> 8), (byte) i_414_, (byte) (i_414_ >> 24));
			i_418_ %= i_417_ + i_416_;
			float f_421_ = f * (float) i_416_;
			float f_422_ = f_419_ * (float) i_416_;
			float f_423_ = 0.0F;
			float f_424_ = 0.0F;
			float f_425_ = f_421_;
			float f_426_ = f_422_;
			if (i_418_ > i_416_) {
				f_423_ = f * (float) (i_416_ + i_417_ - i_418_);
				f_424_ = f_419_ * (float) (i_416_ + i_417_ - i_418_);
			} else {
				f_425_ = f * (float) (i_416_ - i_418_);
				f_426_ = f_419_ * (float) (i_416_ - i_418_);
			}
			float f_427_ = (float) i + 0.35F + f_423_;
			float f_428_ = (float) i_411_ + 0.35F + f_424_;
			float f_429_ = f * (float) i_417_;
			float f_430_ = f_419_ * (float) i_417_;
			for (;;) {
				if (i_412_ > i) {
					if (f_427_ > (float) i_412_ + 0.35F)
						break;
					if (f_427_ + f_425_ > (float) i_412_)
						f_425_ = (float) i_412_ - f_427_;
				} else {
					if (f_427_ < (float) i_412_ + 0.35F)
						break;
					if (f_427_ + f_425_ < (float) i_412_)
						f_425_ = (float) i_412_ - f_427_;
				}
				if (i_413_ > i_411_) {
					if (f_428_ > (float) i_413_ + 0.35F)
						break;
					if (f_428_ + f_426_ > (float) i_413_)
						f_426_ = (float) i_413_ - f_428_;
				} else {
					if (f_428_ < (float) i_413_ + 0.35F)
						break;
					if (f_428_ + f_426_ < (float) i_413_)
						f_426_ = (float) i_413_ - f_428_;
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_427_, f_428_);
				OpenGL.glVertex2f(f_427_ + f_425_, f_428_ + f_426_);
				OpenGL.glEnd();
				f_427_ += f_429_ + f_425_;
				f_428_ += f_430_ + f_426_;
				f_425_ = f_421_;
				f_426_ = f_422_;
			}
		}
	}

	public void method1892(int i, int i_431_, int i_432_, int i_433_, int i_434_, int i_435_, int i_436_, int i_437_, int i_438_) {
		if (i != i_432_ || i_431_ != i_433_) {
			method9418();
			method9456(i_435_);
			float f = (float) i_432_ - (float) i;
			float f_439_ = (float) i_433_ - (float) i_431_;
			float f_440_ = (float) (1.0 / Math.sqrt((double) (f * f + f_439_ * f_439_)));
			f *= f_440_;
			f_439_ *= f_440_;
			OpenGL.glColor4ub((byte) (i_434_ >> 16), (byte) (i_434_ >> 8), (byte) i_434_, (byte) (i_434_ >> 24));
			i_438_ %= i_437_ + i_436_;
			float f_441_ = f * (float) i_436_;
			float f_442_ = f_439_ * (float) i_436_;
			float f_443_ = 0.0F;
			float f_444_ = 0.0F;
			float f_445_ = f_441_;
			float f_446_ = f_442_;
			if (i_438_ > i_436_) {
				f_443_ = f * (float) (i_436_ + i_437_ - i_438_);
				f_444_ = f_439_ * (float) (i_436_ + i_437_ - i_438_);
			} else {
				f_445_ = f * (float) (i_436_ - i_438_);
				f_446_ = f_439_ * (float) (i_436_ - i_438_);
			}
			float f_447_ = (float) i + 0.35F + f_443_;
			float f_448_ = (float) i_431_ + 0.35F + f_444_;
			float f_449_ = f * (float) i_437_;
			float f_450_ = f_439_ * (float) i_437_;
			for (;;) {
				if (i_432_ > i) {
					if (f_447_ > (float) i_432_ + 0.35F)
						break;
					if (f_447_ + f_445_ > (float) i_432_)
						f_445_ = (float) i_432_ - f_447_;
				} else {
					if (f_447_ < (float) i_432_ + 0.35F)
						break;
					if (f_447_ + f_445_ < (float) i_432_)
						f_445_ = (float) i_432_ - f_447_;
				}
				if (i_433_ > i_431_) {
					if (f_448_ > (float) i_433_ + 0.35F)
						break;
					if (f_448_ + f_446_ > (float) i_433_)
						f_446_ = (float) i_433_ - f_448_;
				} else {
					if (f_448_ < (float) i_433_ + 0.35F)
						break;
					if (f_448_ + f_446_ < (float) i_433_)
						f_446_ = (float) i_433_ - f_448_;
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_447_, f_448_);
				OpenGL.glVertex2f(f_447_ + f_445_, f_448_ + f_446_);
				OpenGL.glEnd();
				f_447_ += f_449_ + f_445_;
				f_448_ += f_450_ + f_446_;
				f_445_ = f_441_;
				f_446_ = f_442_;
			}
		}
	}

	public void method1851(int i, int i_451_, int i_452_, int i_453_, int i_454_, int i_455_, Class167 class167, int i_456_, int i_457_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(i_455_);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_458_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		float f_459_ = (float) i_452_ - (float) i;
		float f_460_ = (float) i_453_ - (float) i_451_;
		float f_461_ = (float) (1.0 / Math.sqrt((double) (f_459_ * f_459_ + f_460_ * f_460_)));
		f_459_ *= f_461_;
		f_460_ *= f_461_;
		OpenGL.glColor4ub((byte) (i_454_ >> 16), (byte) (i_454_ >> 8), (byte) i_454_, (byte) (i_454_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f * (float) (i - i_456_), f_458_ * (float) (i_451_ - i_457_));
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_451_ + 0.35F);
		OpenGL.glTexCoord2f(f * (float) (i_452_ - i_456_), f_458_ * (float) (i_453_ - i_457_));
		OpenGL.glVertex2f((float) i_452_ + f_459_ + 0.35F, (float) i_453_ + f_460_ + 0.35F);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	public void method1894(int i, int i_462_, int i_463_, int i_464_, int i_465_, int i_466_, Class167 class167, int i_467_, int i_468_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(i_466_);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_469_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		float f_470_ = (float) i_463_ - (float) i;
		float f_471_ = (float) i_464_ - (float) i_462_;
		float f_472_ = (float) (1.0 / Math.sqrt((double) (f_470_ * f_470_ + f_471_ * f_471_)));
		f_470_ *= f_472_;
		f_471_ *= f_472_;
		OpenGL.glColor4ub((byte) (i_465_ >> 16), (byte) (i_465_ >> 8), (byte) i_465_, (byte) (i_465_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f * (float) (i - i_467_), f_469_ * (float) (i_462_ - i_468_));
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_462_ + 0.35F);
		OpenGL.glTexCoord2f(f * (float) (i_463_ - i_467_), f_469_ * (float) (i_464_ - i_468_));
		OpenGL.glVertex2f((float) i_463_ + f_470_ + 0.35F, (float) i_464_ + f_471_ + 0.35F);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	public void method1895(int i, int i_473_, int i_474_, int i_475_, int i_476_, int i_477_, Class167 class167, int i_478_, int i_479_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(i_477_);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_480_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		float f_481_ = (float) i_474_ - (float) i;
		float f_482_ = (float) i_475_ - (float) i_473_;
		float f_483_ = (float) (1.0 / Math.sqrt((double) (f_481_ * f_481_ + f_482_ * f_482_)));
		f_481_ *= f_483_;
		f_482_ *= f_483_;
		OpenGL.glColor4ub((byte) (i_476_ >> 16), (byte) (i_476_ >> 8), (byte) i_476_, (byte) (i_476_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f * (float) (i - i_478_), f_480_ * (float) (i_473_ - i_479_));
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_473_ + 0.35F);
		OpenGL.glTexCoord2f(f * (float) (i_474_ - i_478_), f_480_ * (float) (i_475_ - i_479_));
		OpenGL.glVertex2f((float) i_474_ + f_481_ + 0.35F, (float) i_475_ + f_482_ + 0.35F);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	public void method1896(int i, int i_484_, int i_485_, int i_486_, int i_487_, int i_488_, Class167 class167, int i_489_, int i_490_, int i_491_, int i_492_, int i_493_) {
		if (i != i_485_ || i_484_ != i_486_) {
			Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
			Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
			method9419();
			method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
			method9456(i_488_);
			method9434(7681, 8448);
			method9423(0, 34167, 768);
			float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236));
			float f_494_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232));
			float f_495_ = (float) i_485_ - (float) i;
			float f_496_ = (float) i_486_ - (float) i_484_;
			float f_497_ = (float) (1.0 / Math.sqrt((double) (f_495_ * f_495_ + f_496_ * f_496_)));
			f_495_ *= f_497_;
			f_496_ *= f_497_;
			OpenGL.glColor4ub((byte) (i_487_ >> 16), (byte) (i_487_ >> 8), (byte) i_487_, (byte) (i_487_ >> 24));
			i_493_ %= i_492_ + i_491_;
			float f_498_ = f_495_ * (float) i_491_;
			float f_499_ = f_496_ * (float) i_491_;
			float f_500_ = 0.0F;
			float f_501_ = 0.0F;
			float f_502_ = f_498_;
			float f_503_ = f_499_;
			if (i_493_ > i_491_) {
				f_500_ = f_495_ * (float) (i_491_ + i_492_ - i_493_);
				f_501_ = f_496_ * (float) (i_491_ + i_492_ - i_493_);
			} else {
				f_502_ = f_495_ * (float) (i_491_ - i_493_);
				f_503_ = f_496_ * (float) (i_491_ - i_493_);
			}
			float f_504_ = (float) i + 0.35F + f_500_;
			float f_505_ = (float) i_484_ + 0.35F + f_501_;
			float f_506_ = f_495_ * (float) i_492_;
			float f_507_ = f_496_ * (float) i_492_;
			for (;;) {
				if (i_485_ > i) {
					if (f_504_ > (float) i_485_ + 0.35F)
						break;
					if (f_504_ + f_502_ > (float) i_485_)
						f_502_ = (float) i_485_ - f_504_;
				} else {
					if (f_504_ < (float) i_485_ + 0.35F)
						break;
					if (f_504_ + f_502_ < (float) i_485_)
						f_502_ = (float) i_485_ - f_504_;
				}
				if (i_486_ > i_484_) {
					if (f_505_ > (float) i_486_ + 0.35F)
						break;
					if (f_505_ + f_503_ > (float) i_486_)
						f_503_ = (float) i_486_ - f_505_;
				} else {
					if (f_505_ < (float) i_486_ + 0.35F)
						break;
					if (f_505_ + f_503_ < (float) i_486_)
						f_503_ = (float) i_486_ - f_505_;
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_504_ - (float) i_489_), f_494_ * (f_505_ - (float) i_490_));
				OpenGL.glVertex2f(f_504_, f_505_);
				OpenGL.glTexCoord2f(f * (f_504_ + f_502_ - (float) i_489_), f_494_ * (f_505_ + f_503_ - (float) i_490_));
				OpenGL.glVertex2f(f_504_ + f_502_, f_505_ + f_503_);
				OpenGL.glEnd();
				f_504_ += f_506_ + f_502_;
				f_505_ += f_507_ + f_503_;
				f_502_ = f_498_;
				f_503_ = f_499_;
			}
			method9423(0, 5890, 768);
		}
	}

	public void method1898(int i, int i_508_, int i_509_, int i_510_, int i_511_, int i_512_, Class167 class167, int i_513_, int i_514_, int i_515_, int i_516_, int i_517_) {
		if (i != i_509_ || i_508_ != i_510_) {
			Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
			Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
			method9419();
			method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
			method9456(i_512_);
			method9434(7681, 8448);
			method9423(0, 34167, 768);
			float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236));
			float f_518_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232));
			float f_519_ = (float) i_509_ - (float) i;
			float f_520_ = (float) i_510_ - (float) i_508_;
			float f_521_ = (float) (1.0 / Math.sqrt((double) (f_519_ * f_519_ + f_520_ * f_520_)));
			f_519_ *= f_521_;
			f_520_ *= f_521_;
			OpenGL.glColor4ub((byte) (i_511_ >> 16), (byte) (i_511_ >> 8), (byte) i_511_, (byte) (i_511_ >> 24));
			i_517_ %= i_516_ + i_515_;
			float f_522_ = f_519_ * (float) i_515_;
			float f_523_ = f_520_ * (float) i_515_;
			float f_524_ = 0.0F;
			float f_525_ = 0.0F;
			float f_526_ = f_522_;
			float f_527_ = f_523_;
			if (i_517_ > i_515_) {
				f_524_ = f_519_ * (float) (i_515_ + i_516_ - i_517_);
				f_525_ = f_520_ * (float) (i_515_ + i_516_ - i_517_);
			} else {
				f_526_ = f_519_ * (float) (i_515_ - i_517_);
				f_527_ = f_520_ * (float) (i_515_ - i_517_);
			}
			float f_528_ = (float) i + 0.35F + f_524_;
			float f_529_ = (float) i_508_ + 0.35F + f_525_;
			float f_530_ = f_519_ * (float) i_516_;
			float f_531_ = f_520_ * (float) i_516_;
			for (;;) {
				if (i_509_ > i) {
					if (f_528_ > (float) i_509_ + 0.35F)
						break;
					if (f_528_ + f_526_ > (float) i_509_)
						f_526_ = (float) i_509_ - f_528_;
				} else {
					if (f_528_ < (float) i_509_ + 0.35F)
						break;
					if (f_528_ + f_526_ < (float) i_509_)
						f_526_ = (float) i_509_ - f_528_;
				}
				if (i_510_ > i_508_) {
					if (f_529_ > (float) i_510_ + 0.35F)
						break;
					if (f_529_ + f_527_ > (float) i_510_)
						f_527_ = (float) i_510_ - f_529_;
				} else {
					if (f_529_ < (float) i_510_ + 0.35F)
						break;
					if (f_529_ + f_527_ < (float) i_510_)
						f_527_ = (float) i_510_ - f_529_;
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_528_ - (float) i_513_), f_518_ * (f_529_ - (float) i_514_));
				OpenGL.glVertex2f(f_528_, f_529_);
				OpenGL.glTexCoord2f(f * (f_528_ + f_526_ - (float) i_513_), f_518_ * (f_529_ + f_527_ - (float) i_514_));
				OpenGL.glVertex2f(f_528_ + f_526_, f_529_ + f_527_);
				OpenGL.glEnd();
				f_528_ += f_530_ + f_526_;
				f_529_ += f_531_ + f_527_;
				f_526_ = f_522_;
				f_527_ = f_523_;
			}
			method9423(0, 5890, 768);
		}
	}

	public void method1899(int i, int i_532_, int i_533_, int i_534_, int i_535_, int i_536_, Class167 class167, int i_537_, int i_538_, int i_539_, int i_540_, int i_541_) {
		if (i != i_533_ || i_532_ != i_534_) {
			Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
			Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
			method9419();
			method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
			method9456(i_536_);
			method9434(7681, 8448);
			method9423(0, 34167, 768);
			float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236));
			float f_542_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232));
			float f_543_ = (float) i_533_ - (float) i;
			float f_544_ = (float) i_534_ - (float) i_532_;
			float f_545_ = (float) (1.0 / Math.sqrt((double) (f_543_ * f_543_ + f_544_ * f_544_)));
			f_543_ *= f_545_;
			f_544_ *= f_545_;
			OpenGL.glColor4ub((byte) (i_535_ >> 16), (byte) (i_535_ >> 8), (byte) i_535_, (byte) (i_535_ >> 24));
			i_541_ %= i_540_ + i_539_;
			float f_546_ = f_543_ * (float) i_539_;
			float f_547_ = f_544_ * (float) i_539_;
			float f_548_ = 0.0F;
			float f_549_ = 0.0F;
			float f_550_ = f_546_;
			float f_551_ = f_547_;
			if (i_541_ > i_539_) {
				f_548_ = f_543_ * (float) (i_539_ + i_540_ - i_541_);
				f_549_ = f_544_ * (float) (i_539_ + i_540_ - i_541_);
			} else {
				f_550_ = f_543_ * (float) (i_539_ - i_541_);
				f_551_ = f_544_ * (float) (i_539_ - i_541_);
			}
			float f_552_ = (float) i + 0.35F + f_548_;
			float f_553_ = (float) i_532_ + 0.35F + f_549_;
			float f_554_ = f_543_ * (float) i_540_;
			float f_555_ = f_544_ * (float) i_540_;
			for (;;) {
				if (i_533_ > i) {
					if (f_552_ > (float) i_533_ + 0.35F)
						break;
					if (f_552_ + f_550_ > (float) i_533_)
						f_550_ = (float) i_533_ - f_552_;
				} else {
					if (f_552_ < (float) i_533_ + 0.35F)
						break;
					if (f_552_ + f_550_ < (float) i_533_)
						f_550_ = (float) i_533_ - f_552_;
				}
				if (i_534_ > i_532_) {
					if (f_553_ > (float) i_534_ + 0.35F)
						break;
					if (f_553_ + f_551_ > (float) i_534_)
						f_551_ = (float) i_534_ - f_553_;
				} else {
					if (f_553_ < (float) i_534_ + 0.35F)
						break;
					if (f_553_ + f_551_ < (float) i_534_)
						f_551_ = (float) i_534_ - f_553_;
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_552_ - (float) i_537_), f_542_ * (f_553_ - (float) i_538_));
				OpenGL.glVertex2f(f_552_, f_553_);
				OpenGL.glTexCoord2f(f * (f_552_ + f_550_ - (float) i_537_), f_542_ * (f_553_ + f_551_ - (float) i_538_));
				OpenGL.glVertex2f(f_552_ + f_550_, f_553_ + f_551_);
				OpenGL.glEnd();
				f_552_ += f_554_ + f_550_;
				f_553_ += f_555_ + f_551_;
				f_550_ = f_546_;
				f_551_ = f_547_;
			}
			method9423(0, 5890, 768);
		}
	}

	public void method1726(int i, int i_556_, int i_557_, int i_558_, int i_559_, int i_560_, int i_561_) {
		OpenGL.glLineWidth((float) i_560_);
		method1730(i, i_556_, i_557_, i_558_, i_559_, i_561_);
		OpenGL.glLineWidth(1.0F);
	}

	public final Class250 method2007() {
		return new Class250(((Class106_Sub1) this).aClass250_10079);
	}

	final synchronized void method9451(int i, int i_562_) {
		LinkableInt class572_sub26 = new LinkableInt(i_562_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub1) this).aClass675_10025.method7940(class572_sub26, -1597163928);
	}

	public void method1789(int i, Class86 class86) {
		((Class106_Sub1) this).anInt10137 = i;
		((Class106_Sub1) this).aClass86_10018 = class86;
		((Class106_Sub1) this).aBool10135 = true;
	}

	boolean method1905(int i, int i_563_, int i_564_, int i_565_, Class261 class261, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		return class326.method4147(i, i_563_, i_564_, i_565_, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	long method9452(int i, int i_566_, int[] is, int[] is_567_) {
		if (((Class106_Sub1) this).aBool10165) {
			if ((((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10171]) != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10171]);
				((Class106_Sub1) this).aLongArray10199[(((Class106_Sub1) this).anInt10171)] = 0L;
			}
			OpenGL.glBindBufferARB(35051, (((Class106_Sub1) this).anIntArray10186[((Class106_Sub1) this).anInt10171]));
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				int i_568_ = 0;
				for (int i_569_ = i_566_ - 1; i_569_ >= 0; i_569_--) {
					for (int i_570_ = 0; i_570_ < i; i_570_++)
						is[i_568_++] = (((Class106_Sub1) this).anUnsafe10022.getInt(l + (long) ((i_569_ * i + i_570_) * 4)));
				}
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++((Class106_Sub1) this).anInt10171 >= 3)
				((Class106_Sub1) this).anInt10171 = 0;
			return l;
		}
		if (((Class106_Sub1) this).aClass161_10109 == null)
			method9480(i, i_566_);
		if (((Class106_Sub1) this).aClass161_10147 == null)
			((Class106_Sub1) this).aClass161_10147 = method1821(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), true);
		else
			((Class161_Sub2) ((Class106_Sub1) this).aClass161_10147).method10046(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 0, 0, true);
		method1661(((Class106_Sub1) this).aClass104_Sub1_10190, 43917517);
		method1719(1, -16777216);
		((Class106_Sub1) this).aClass161_10147.method2597(anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553);
		((Class106_Sub1) this).aClass161_10109.method2592(0, 0, i, i_566_, is, is_567_, 0, i);
		method1884(((Class106_Sub1) this).aClass104_Sub1_10190, 1224774443);
		return 0L;
	}

	public void method2052(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		class90.method1511(class326, ((Class106_Sub1) this).aClass250_10079, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	public final boolean method2006() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684());
	}

	public void method2002(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		class90.method1511(class326, ((Class106_Sub1) this).aClass250_10079, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	public void method1887(int i, int i_571_, int i_572_, int i_573_, int i_574_, int i_575_) {
		method9418();
		method9456(i_575_);
		float f = (float) i_572_ - (float) i;
		float f_576_ = (float) i_573_ - (float) i_571_;
		if (f == 0.0F && f_576_ == 0.0F)
			f = 1.0F;
		else {
			float f_577_ = (float) (1.0 / Math.sqrt((double) (f * f + f_576_ * f_576_)));
			f *= f_577_;
			f_576_ *= f_577_;
		}
		OpenGL.glColor4ub((byte) (i_574_ >> 16), (byte) (i_574_ >> 8), (byte) i_574_, (byte) (i_574_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_571_ + 0.35F);
		OpenGL.glVertex2f((float) i_572_ + f + 0.35F, (float) i_573_ + f_576_ + 0.35F);
		OpenGL.glEnd();
	}

	public void method1670(int i, int i_578_, float f, int i_579_, int i_580_, float f_581_, int i_582_, int i_583_, float f_584_, int i_585_, int i_586_, int i_587_, int i_588_) {
		method9418();
		method9456(i_588_);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_585_ >> 16), (byte) (i_585_ >> 8), (byte) i_585_, (byte) (i_585_ >> 24));
		OpenGL.glVertex3f((float) i + 0.35F, (float) i_578_ + 0.35F, f);
		OpenGL.glColor4ub((byte) (i_586_ >> 16), (byte) (i_586_ >> 8), (byte) i_586_, (byte) (i_586_ >> 24));
		OpenGL.glVertex3f((float) i_579_ + 0.35F, (float) i_580_ + 0.35F, f_581_);
		OpenGL.glColor4ub((byte) (i_587_ >> 16), (byte) (i_587_ >> 8), (byte) i_587_, (byte) (i_587_ >> 24));
		OpenGL.glVertex3f((float) i_582_ + 0.35F, (float) i_583_ + 0.35F, f_584_);
		OpenGL.glEnd();
	}

	public Class572_Sub35 method1949(int i) {
		Class572_Sub35_Sub2 class572_sub35_sub2 = new Class572_Sub35_Sub2(i);
		((Class106_Sub1) this).aClass675_10130.method7940(class572_sub35_sub2, -1869182327);
		return class572_sub35_sub2;
	}

	public Class161 method1914(Class87 class87, boolean bool) {
		int[] is = class87.method1285(false);
		Class161 class161 = method1744(is, 0, class87.method1329(), class87.method1329(), class87.method1330(), -1420207851);
		class161.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161;
	}

	public Class161 method1913(int i, int i_589_, boolean bool, boolean bool_590_) {
		return new Class161_Sub2(this, i, i_589_, bool);
	}

	public Class161 method1915(Class87 class87, boolean bool) {
		int[] is = class87.method1285(false);
		Class161 class161 = method1744(is, 0, class87.method1329(), class87.method1329(), class87.method1330(), -540826061);
		class161.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161;
	}

	public Class161 method1916(int i, int i_591_, int i_592_, int i_593_, boolean bool) {
		return new Class161_Sub2(this, i, i_591_, i_592_, i_593_);
	}

	public Class161 method1917(int i, int i_594_, int i_595_, int i_596_, boolean bool) {
		return new Class161_Sub2(this, i, i_594_, i_595_, i_596_);
	}

	public Class167 method1918(int i, int i_597_, int[] is, int[] is_598_) {
		return Class167_Sub2.method10049(this, i, i_597_, is, is_598_);
	}

	public void method1804(int i, Class167 class167, int i_599_, int i_600_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(1);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_601_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_599_), f_601_ * (float) (((Class106_Sub1) this).anInt10098 - i_600_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10098);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_599_), f_601_ * (float) (((Class106_Sub1) this).anInt10099 - i_600_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_599_), f_601_ * (float) (((Class106_Sub1) this).anInt10099 - i_600_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_599_), f_601_ * (float) (((Class106_Sub1) this).anInt10098 - i_600_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10098);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	public void method1920(int i, Class167 class167, int i_602_, int i_603_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(1);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_604_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_602_), f_604_ * (float) (((Class106_Sub1) this).anInt10098 - i_603_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10098);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_602_), f_604_ * (float) (((Class106_Sub1) this).anInt10099 - i_603_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_602_), f_604_ * (float) (((Class106_Sub1) this).anInt10099 - i_603_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_602_), f_604_ * (float) (((Class106_Sub1) this).anInt10098 - i_603_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10098);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	public final void method1700(int i, int i_605_) {
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2323(i, i_605_);
	}

	public Class102 method1922(Class284 class284, Class87[] class87s, boolean bool) {
		return new Class102_Sub6(this, class284, class87s, bool);
	}

	final void method9453(Interface9 interface9) {
		if (((Class106_Sub1) this).anInterface9_10140 != interface9) {
			if (((Class106_Sub1) this).aBool10163)
				OpenGL.glBindBufferARB(34962, interface9.method42());
			((Class106_Sub1) this).anInterface9_10140 = interface9;
		}
	}

	public void method1908(int i) {
		/* empty */
	}

	public Model method1925(Class159 class159, int i, int i_606_, int i_607_, int i_608_) {
		return new OpenGLModel(this, class159, i, i_607_, i_608_, i_606_);
	}

	public Class161 method1697(int[] is, int i, int i_609_, int i_610_, int i_611_, boolean bool) {
		return new Class161_Sub2(this, i_610_, i_611_, is, i, i_609_);
	}

	public Model method1695(Class159 class159, int i, int i_612_, int i_613_, int i_614_) {
		return new OpenGLModel(this, class159, i, i_613_, i_614_, i_612_);
	}

	public int method1928(int i, int i_615_) {
		return i & i_615_ ^ i_615_;
	}

	public Model method1755(Class159 class159, int i, int i_616_, int i_617_, int i_618_) {
		return new OpenGLModel(this, class159, i, i_617_, i_618_, i_616_);
	}

	public Class174 method1930(int i, int i_619_, int[][] is, int[][] is_620_, int i_621_, int i_622_, int i_623_) {
		return new Class174_Sub3(this, i_622_, i_623_, i, i_619_, is, is_620_, i_621_);
	}

	public Interface6 method2000(int i, int i_624_, Class171 class171, Class88 class88, int i_625_) {
		return new Class572_Sub12_Sub3(this, class171, class88, i, i_624_, i_625_);
	}

	public boolean method1812() {
		return true;
	}

	public boolean method1941() {
		return (((Class106_Sub1) this).aBool10161 && (!method1786() || ((Class106_Sub1) this).aBool10162));
	}

	public boolean method1676() {
		return true;
	}

	public Class250 method1934() {
		return ((Class106_Sub1) this).aClass250_10043;
	}

	public final void method1783(int i) {
		((Class106_Sub1) this).anInt10049 = 0;
		for (/**/; i > 1; i >>= 1)
			((Class106_Sub1) this).anInt10049++;
		((Class106_Sub1) this).anInt10060 = 1 << ((Class106_Sub1) this).anInt10049;
	}

	public Class261 method1937() {
		return ((Class106_Sub1) this).aClass261_10045;
	}

	public void method2019(Class96 class96, float f, Class96 class96_626_, float f_627_, Class96 class96_628_, float f_629_) {
		int i = 0;
		if (class96_628_ == null && f_629_ > 0.0F)
			f_629_ = 0.0F;
		if (class96_626_ == null && f_627_ > 0.0F) {
			class96_626_ = class96_628_;
			class96_628_ = null;
			f_627_ = f_629_;
			f_629_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_626_;
			class96_626_ = class96_628_;
			class96_628_ = null;
			f = f_627_;
			f_627_ = f_629_;
			f_629_ = 0.0F;
		}
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[0] = (Class96_Sub1) class96;
		Class572_Sub32_Sub3.aFloatArray11285[0] = f;
		if (f > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[1] = (Class96_Sub1) class96_626_;
		Class572_Sub32_Sub3.aFloatArray11285[1] = f_627_;
		if (f_627_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[2] = (Class96_Sub1) class96_628_;
		Class572_Sub32_Sub3.aFloatArray11285[2] = f_629_;
		if (f_629_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.anInt11276 = i;
		Class572_Sub32_Sub3.aFloat11277 = 1.0F - (f + f_627_ + f_629_);
	}

	public void method1875(int i, int i_630_, int i_631_, int i_632_, int i_633_, int i_634_) {
		float f = (float) i + 0.35F;
		float f_635_ = (float) i_630_ + 0.35F;
		float f_636_ = f + (float) i_631_ - 1.0F;
		float f_637_ = f_635_ + (float) i_632_ - 1.0F;
		method9418();
		method9456(i_634_);
		OpenGL.glColor4ub((byte) (i_633_ >> 16), (byte) (i_633_ >> 8), (byte) i_633_, (byte) (i_633_ >> 24));
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glDisable(32925);
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f, f_635_);
		OpenGL.glVertex2f(f, f_637_);
		OpenGL.glVertex2f(f_636_, f_637_);
		OpenGL.glVertex2f(f_636_, f_635_);
		OpenGL.glEnd();
		if (((Class106_Sub1) this).aBool10161)
			OpenGL.glEnable(32925);
	}

	public Class250 method1933() {
		return ((Class106_Sub1) this).aClass250_10043;
	}

	public void method1910(Class105 class105) {
		((Class106_Sub1) this).aClass153_10042.method2506(this, class105);
	}

	public final void method1984() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684()) {
			((Class106_Sub1) this).aClass135_10038.method2325(((Class106_Sub1) this).aClass572_Sub32_Sub2_10039);
			((Class106_Sub1) this).aClass168_10036.method2688();
		}
	}

	public void method1943(int i, int i_638_, int i_639_, int i_640_, int i_641_, int i_642_, Class167 class167, int i_643_, int i_644_, int i_645_, int i_646_, int i_647_) {
		if (i != i_639_ || i_638_ != i_640_) {
			Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
			Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
			method9419();
			method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
			method9456(i_642_);
			method9434(7681, 8448);
			method9423(0, 34167, 768);
			float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236));
			float f_648_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232));
			float f_649_ = (float) i_639_ - (float) i;
			float f_650_ = (float) i_640_ - (float) i_638_;
			float f_651_ = (float) (1.0 / Math.sqrt((double) (f_649_ * f_649_ + f_650_ * f_650_)));
			f_649_ *= f_651_;
			f_650_ *= f_651_;
			OpenGL.glColor4ub((byte) (i_641_ >> 16), (byte) (i_641_ >> 8), (byte) i_641_, (byte) (i_641_ >> 24));
			i_647_ %= i_646_ + i_645_;
			float f_652_ = f_649_ * (float) i_645_;
			float f_653_ = f_650_ * (float) i_645_;
			float f_654_ = 0.0F;
			float f_655_ = 0.0F;
			float f_656_ = f_652_;
			float f_657_ = f_653_;
			if (i_647_ > i_645_) {
				f_654_ = f_649_ * (float) (i_645_ + i_646_ - i_647_);
				f_655_ = f_650_ * (float) (i_645_ + i_646_ - i_647_);
			} else {
				f_656_ = f_649_ * (float) (i_645_ - i_647_);
				f_657_ = f_650_ * (float) (i_645_ - i_647_);
			}
			float f_658_ = (float) i + 0.35F + f_654_;
			float f_659_ = (float) i_638_ + 0.35F + f_655_;
			float f_660_ = f_649_ * (float) i_646_;
			float f_661_ = f_650_ * (float) i_646_;
			for (;;) {
				if (i_639_ > i) {
					if (f_658_ > (float) i_639_ + 0.35F)
						break;
					if (f_658_ + f_656_ > (float) i_639_)
						f_656_ = (float) i_639_ - f_658_;
				} else {
					if (f_658_ < (float) i_639_ + 0.35F)
						break;
					if (f_658_ + f_656_ < (float) i_639_)
						f_656_ = (float) i_639_ - f_658_;
				}
				if (i_640_ > i_638_) {
					if (f_659_ > (float) i_640_ + 0.35F)
						break;
					if (f_659_ + f_657_ > (float) i_640_)
						f_657_ = (float) i_640_ - f_659_;
				} else {
					if (f_659_ < (float) i_640_ + 0.35F)
						break;
					if (f_659_ + f_657_ < (float) i_640_)
						f_657_ = (float) i_640_ - f_659_;
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_658_ - (float) i_643_), f_648_ * (f_659_ - (float) i_644_));
				OpenGL.glVertex2f(f_658_, f_659_);
				OpenGL.glTexCoord2f(f * (f_658_ + f_656_ - (float) i_643_), f_648_ * (f_659_ + f_657_ - (float) i_644_));
				OpenGL.glVertex2f(f_658_ + f_656_, f_659_ + f_657_);
				OpenGL.glEnd();
				f_658_ += f_660_ + f_656_;
				f_659_ += f_661_ + f_657_;
				f_656_ = f_652_;
				f_657_ = f_653_;
			}
			method9423(0, 5890, 768);
		}
	}

	public final void method2009(Class261 class261) {
		((Class106_Sub1) this).aClass261_10076.method3568(class261);
		((Class106_Sub1) this).aClass250_10197.method3446(((Class106_Sub1) this).aClass261_10076);
		((Class106_Sub1) this).aClass261_10092.method3568(class261);
		((Class106_Sub1) this).aClass261_10092.method3600();
		((Class106_Sub1) this).aClass250_10078.method3446(((Class106_Sub1) this).aClass261_10092);
		method9401();
		if (((Class106_Sub1) this).anInt10087 != 1)
			method9398();
	}

	public final void method1766(Class261 class261) {
		((Class106_Sub1) this).aClass261_10076.method3568(class261);
		((Class106_Sub1) this).aClass250_10197.method3446(((Class106_Sub1) this).aClass261_10076);
		((Class106_Sub1) this).aClass261_10092.method3568(class261);
		((Class106_Sub1) this).aClass261_10092.method3600();
		((Class106_Sub1) this).aClass250_10078.method3446(((Class106_Sub1) this).aClass261_10092);
		method9401();
		if (((Class106_Sub1) this).anInt10087 != 1)
			method9398();
	}

	public Class261 method1948() {
		return new Class261(((Class106_Sub1) this).aClass261_10076);
	}

	public Class261 method1862() {
		return new Class261(((Class106_Sub1) this).aClass261_10076);
	}

	public Class261 method1831() {
		return new Class261(((Class106_Sub1) this).aClass261_10076);
	}

	public Class261 method1842() {
		return new Class261(((Class106_Sub1) this).aClass261_10076);
	}

	public int method2048(int i, int i_662_, int i_663_, int i_664_, int i_665_, int i_666_) {
		int i_667_ = 0;
		float f = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_662_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_663_));
		float f_668_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * (float) i_664_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * (float) i_665_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * (float) i_666_));
		float f_669_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_662_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_663_));
		float f_670_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * (float) i_664_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * (float) i_665_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * (float) i_666_));
		if (f < -f_669_ && f_668_ < -f_670_)
			i_667_ |= 0x10;
		else if (f > f_669_ && f_668_ > f_670_)
			i_667_ |= 0x20;
		float f_671_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_662_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_663_));
		float f_672_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * (float) i_664_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * (float) i_665_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * (float) i_666_));
		if (f_671_ < -f_669_ && f_672_ < -f_670_)
			i_667_ |= 0x1;
		if (f_671_ > f_669_ && f_672_ > f_670_)
			i_667_ |= 0x2;
		float f_673_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_662_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_663_));
		float f_674_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * (float) i_664_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * (float) i_665_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * (float) i_666_));
		if (f_673_ < -f_669_ && f_674_ < -f_670_)
			i_667_ |= 0x4;
		if (f_673_ > f_669_ && f_674_ > f_670_)
			i_667_ |= 0x8;
		return i_667_;
	}

	public void method1994(int i, int i_675_, float f, int i_676_, int i_677_, float f_678_, int i_679_, int i_680_, float f_681_, int i_682_, int i_683_, int i_684_, int i_685_) {
		method9418();
		method9456(i_685_);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_682_ >> 16), (byte) (i_682_ >> 8), (byte) i_682_, (byte) (i_682_ >> 24));
		OpenGL.glVertex3f((float) i + 0.35F, (float) i_675_ + 0.35F, f);
		OpenGL.glColor4ub((byte) (i_683_ >> 16), (byte) (i_683_ >> 8), (byte) i_683_, (byte) (i_683_ >> 24));
		OpenGL.glVertex3f((float) i_676_ + 0.35F, (float) i_677_ + 0.35F, f_678_);
		OpenGL.glColor4ub((byte) (i_684_ >> 16), (byte) (i_684_ >> 8), (byte) i_684_, (byte) (i_684_ >> 24));
		OpenGL.glVertex3f((float) i_679_ + 0.35F, (float) i_680_ + 0.35F, f_681_);
		OpenGL.glEnd();
	}

	public final void method1954(Class250 class250) {
		((Class106_Sub1) this).aClass250_10079.method3442(class250);
		method9401();
		method9400();
	}

	public void method1730(int i, int i_686_, int i_687_, int i_688_, int i_689_, int i_690_) {
		method9418();
		method9456(i_690_);
		float f = (float) i_687_ - (float) i;
		float f_691_ = (float) i_688_ - (float) i_686_;
		if (f == 0.0F && f_691_ == 0.0F)
			f = 1.0F;
		else {
			float f_692_ = (float) (1.0 / Math.sqrt((double) (f * f + f_691_ * f_691_)));
			f *= f_692_;
			f_691_ *= f_692_;
		}
		OpenGL.glColor4ub((byte) (i_689_ >> 16), (byte) (i_689_ >> 8), (byte) i_689_, (byte) (i_689_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f((float) i + 0.35F, (float) i_686_ + 0.35F);
		OpenGL.glVertex2f((float) i_687_ + f + 0.35F, (float) i_688_ + f_691_ + 0.35F);
		OpenGL.glEnd();
	}

	public boolean method1840() {
		if (((Class106_Sub1) this).aBool10165 && (((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10202]) != 0L)
			return false;
		return true;
	}

	public final void method1758(float f) {
		if (((Class106_Sub1) this).aFloat10119 != f) {
			((Class106_Sub1) this).aFloat10119 = f;
			method9405();
		}
	}

	public final void method1745(float f) {
		if (((Class106_Sub1) this).aFloat10119 != f) {
			((Class106_Sub1) this).aFloat10119 = f;
			method9405();
		}
	}

	public final void method1686(int i, float f, float f_693_, float f_694_, float f_695_, float f_696_) {
		boolean bool = ((Class106_Sub1) this).anInt10115 != i;
		if (bool || ((Class106_Sub1) this).aFloat10120 != f || ((Class106_Sub1) this).aFloat10126 != f_693_) {
			((Class106_Sub1) this).anInt10115 = i;
			((Class106_Sub1) this).aFloat10120 = f;
			((Class106_Sub1) this).aFloat10126 = f_693_;
			if (bool) {
				((Class106_Sub1) this).aFloat10011 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff0000) / 1.671168E7F);
				((Class106_Sub1) this).aFloat10117 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff00) / 65280.0F);
				((Class106_Sub1) this).aFloat9992 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff) / 255.0F);
				method9405();
			}
			method9406();
		}
		if (((Class106_Sub1) this).aFloatArray10111[0] != f_694_ || ((Class106_Sub1) this).aFloatArray10111[1] != f_695_ || ((Class106_Sub1) this).aFloatArray10111[2] != f_696_) {
			((Class106_Sub1) this).aFloatArray10111[0] = f_694_;
			((Class106_Sub1) this).aFloatArray10111[1] = f_695_;
			((Class106_Sub1) this).aFloatArray10111[2] = f_696_;
			((Class106_Sub1) this).aFloatArray10112[0] = -f_694_;
			((Class106_Sub1) this).aFloatArray10112[1] = -f_695_;
			((Class106_Sub1) this).aFloatArray10112[2] = -f_696_;
			float f_697_ = (float) (1.0 / Math.sqrt((double) (f_694_ * f_694_ + f_695_ * f_695_ + f_696_ * f_696_)));
			((Class106_Sub1) this).aFloatArray10113[0] = f_694_ * f_697_;
			((Class106_Sub1) this).aFloatArray10113[1] = f_695_ * f_697_;
			((Class106_Sub1) this).aFloatArray10113[2] = f_696_ * f_697_;
			((Class106_Sub1) this).aFloatArray9998[0] = -((Class106_Sub1) this).aFloatArray10113[0];
			((Class106_Sub1) this).aFloatArray9998[1] = -((Class106_Sub1) this).aFloatArray10113[1];
			((Class106_Sub1) this).aFloatArray9998[2] = -((Class106_Sub1) this).aFloatArray10113[2];
			method9384();
			((Class106_Sub1) this).anInt10125 = (int) (f_694_ * 256.0F / f_695_);
			((Class106_Sub1) this).anInt10053 = (int) (f_696_ * 256.0F / f_695_);
		}
	}

	public boolean method1826() {
		return true;
	}

	public final void method1959(int i, float f, float f_698_, float f_699_, float f_700_, float f_701_) {
		boolean bool = ((Class106_Sub1) this).anInt10115 != i;
		if (bool || ((Class106_Sub1) this).aFloat10120 != f || ((Class106_Sub1) this).aFloat10126 != f_698_) {
			((Class106_Sub1) this).anInt10115 = i;
			((Class106_Sub1) this).aFloat10120 = f;
			((Class106_Sub1) this).aFloat10126 = f_698_;
			if (bool) {
				((Class106_Sub1) this).aFloat10011 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff0000) / 1.671168E7F);
				((Class106_Sub1) this).aFloat10117 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff00) / 65280.0F);
				((Class106_Sub1) this).aFloat9992 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff) / 255.0F);
				method9405();
			}
			method9406();
		}
		if (((Class106_Sub1) this).aFloatArray10111[0] != f_699_ || ((Class106_Sub1) this).aFloatArray10111[1] != f_700_ || ((Class106_Sub1) this).aFloatArray10111[2] != f_701_) {
			((Class106_Sub1) this).aFloatArray10111[0] = f_699_;
			((Class106_Sub1) this).aFloatArray10111[1] = f_700_;
			((Class106_Sub1) this).aFloatArray10111[2] = f_701_;
			((Class106_Sub1) this).aFloatArray10112[0] = -f_699_;
			((Class106_Sub1) this).aFloatArray10112[1] = -f_700_;
			((Class106_Sub1) this).aFloatArray10112[2] = -f_701_;
			float f_702_ = (float) (1.0 / Math.sqrt((double) (f_699_ * f_699_ + f_700_ * f_700_ + f_701_ * f_701_)));
			((Class106_Sub1) this).aFloatArray10113[0] = f_699_ * f_702_;
			((Class106_Sub1) this).aFloatArray10113[1] = f_700_ * f_702_;
			((Class106_Sub1) this).aFloatArray10113[2] = f_701_ * f_702_;
			((Class106_Sub1) this).aFloatArray9998[0] = -((Class106_Sub1) this).aFloatArray10113[0];
			((Class106_Sub1) this).aFloatArray9998[1] = -((Class106_Sub1) this).aFloatArray10113[1];
			((Class106_Sub1) this).aFloatArray9998[2] = -((Class106_Sub1) this).aFloatArray10113[2];
			method9384();
			((Class106_Sub1) this).anInt10125 = (int) (f_699_ * 256.0F / f_700_);
			((Class106_Sub1) this).anInt10053 = (int) (f_701_ * 256.0F / f_700_);
		}
	}

	public void method1860() {
		if (((Class106_Sub1) this).aBool10165) {
			((Class106_Sub1) this).aClass161_10147 = null;
			if (((Class106_Sub1) this).aClass104_Sub1_10190 != null) {
				((Class106_Sub1) this).aClass104_Sub1_10190.method39();
				((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			}
			OpenGL.glDeleteBuffersARB(3, ((Class106_Sub1) this).anIntArray10186, 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub1) this).anIntArray10186[i] = 0;
				if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
					((Class106_Sub1) this).aLongArray10199[i] = 0L;
				}
			}
		} else {
			((Class106_Sub1) this).aClass104_Sub1_10190 = null;
			((Class106_Sub1) this).aClass161_10109 = null;
			((Class106_Sub1) this).aClass161_10147 = null;
		}
	}

	public final void method1961(int i, int i_703_, int i_704_) {
		if (((Class106_Sub1) this).anInt10058 != i || ((Class106_Sub1) this).anInt10129 != i_703_ || ((Class106_Sub1) this).anInt10189 != i_704_) {
			((Class106_Sub1) this).anInt10058 = i;
			((Class106_Sub1) this).anInt10129 = i_703_;
			((Class106_Sub1) this).anInt10189 = i_704_;
			method9408();
			method9407();
		}
	}

	public void method1919(int i, int i_705_, int i_706_, int i_707_, int i_708_, int i_709_, int i_710_) {
		OpenGL.glLineWidth((float) i_709_);
		method1730(i, i_705_, i_706_, i_707_, i_708_, i_710_);
		OpenGL.glLineWidth(1.0F);
	}

	public Class103 method1963(int i) {
		return (((Class106_Sub1) this).aBool10074 ? new Class103_Sub2_Sub2(this, i) : null);
	}

	public Class103 method2025(int i) {
		return (((Class106_Sub1) this).aBool10074 ? new Class103_Sub2_Sub2(this, i) : null);
	}

	public void method1845() {
		((Class106_Sub1) this).aBool10135 = false;
	}

	public Class103 method1900(Class103 class103, Class103 class103_711_, float f, Class103 class103_712_) {
		if (class103 != null && class103_711_ != null && ((Class106_Sub1) this).aBool10074 && ((Class106_Sub1) this).aBool10124) {
			Class103_Sub2_Sub1 class103_sub2_sub1 = null;
			Class103_Sub2 class103_sub2 = (Class103_Sub2) class103;
			Class103_Sub2 class103_sub2_713_ = (Class103_Sub2) class103_711_;
			Class155_Sub3 class155_sub3 = class103_sub2.method9851();
			Class155_Sub3 class155_sub3_714_ = class103_sub2_713_.method9851();
			if (class155_sub3 != null && class155_sub3_714_ != null) {
				int i = ((((Class155_Sub3) class155_sub3).anInt9644 > ((Class155_Sub3) class155_sub3_714_).anInt9644) ? ((Class155_Sub3) class155_sub3).anInt9644 : ((Class155_Sub3) class155_sub3_714_).anInt9644);
				if (class103 != class103_712_ && class103_711_ != class103_712_ && class103_712_ instanceof Class103_Sub2_Sub1) {
					Class103_Sub2_Sub1 class103_sub2_sub1_715_ = (Class103_Sub2_Sub1) class103_712_;
					if (class103_sub2_sub1_715_.method10106() == i)
						class103_sub2_sub1 = class103_sub2_sub1_715_;
				}
				if (class103_sub2_sub1 == null)
					class103_sub2_sub1 = new Class103_Sub2_Sub1(this, i);
				if (class103_sub2_sub1.method10109(class155_sub3, class155_sub3_714_, f))
					return class103_sub2_sub1;
			}
		}
		return f < 0.5F ? class103 : class103_711_;
	}

	public final void method1901(Class103 class103) {
		((Class106_Sub1) this).aClass103_Sub2_10122 = (Class103_Sub2) class103;
	}

	public final void method1968(Class103 class103) {
		((Class106_Sub1) this).aClass103_Sub2_10122 = (Class103_Sub2) class103;
	}

	public final void method1969(int i, int i_716_, int i_717_, int i_718_) {
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2320(i, i_716_, i_717_, i_718_);
	}

	void method1802() {
		for (Class572 class572 = ((Class106_Sub1) this).aClass675_10130.method7932((byte) 50); class572 != null; class572 = ((Class106_Sub1) this).aClass675_10130.method7926(-13564588))
			((Class572_Sub35_Sub2) class572).method10071();
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2316();
		if (((Class106_Sub1) this).aBool10050) {
			Class472.method5585(false, true, (byte) -2);
			((Class106_Sub1) this).aBool10050 = false;
		}
	}

	public void method1852() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
				((Class106_Sub1) this).aLongArray10199[i] = 0L;
			}
		}
		((Class106_Sub1) this).anInt10202 = 0;
		((Class106_Sub1) this).anInt10171 = 0;
	}

	public final void method1953(Class250 class250) {
		((Class106_Sub1) this).aClass250_10079.method3442(class250);
		method9401();
		method9400();
	}

	public final boolean method1974() {
		if (((Class106_Sub1) this).aClass135_10038 == null)
			return false;
		return ((Class106_Sub1) this).aClass135_10038.method2328();
	}

	public void method1976(float f, float f_719_, float f_720_, float f_721_, float f_722_) {
		Class572_Sub32_Sub1.aFloat10995 = f;
		Class572_Sub32_Sub1.aFloat10994 = f_719_;
		Class572_Sub32_Sub1.aFloat10996 = f_720_;
		Class572_Sub32_Sub1.aFloat10999 = f_721_;
		Class572_Sub32_Sub1.aFloat10998 = f_722_;
	}

	public void method1978(float f, float f_723_, float f_724_, float f_725_, float f_726_) {
		Class572_Sub32_Sub1.aFloat10995 = f;
		Class572_Sub32_Sub1.aFloat10994 = f_723_;
		Class572_Sub32_Sub1.aFloat10996 = f_724_;
		Class572_Sub32_Sub1.aFloat10999 = f_725_;
		Class572_Sub32_Sub1.aFloat10998 = f_726_;
	}

	public Class96 method1927(int[] is) {
		return new Class96_Sub1(this, is);
	}

	public boolean method1990() {
		return true;
	}

	public final void method1873(int i, int i_727_, int i_728_, int i_729_) {
		if (aClass104_1410 != null) {
			if (i < 0)
				i = 0;
			if (i_728_ > aClass104_1410.method1648())
				i_728_ = aClass104_1410.method1648();
			if (i_727_ < 0)
				i_727_ = 0;
			if (i_729_ > aClass104_1410.method1646())
				i_729_ = aClass104_1410.method1646();
			((Class106_Sub1) this).anInt10187 = i;
			((Class106_Sub1) this).anInt10098 = i_727_;
			((Class106_Sub1) this).anInt10101 = i_728_;
			((Class106_Sub1) this).anInt10099 = i_729_;
			OpenGL.glEnable(3089);
			method9395();
		}
	}

	public final void method1777(int i, int i_730_) {
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2323(i, i_730_);
	}

	public final void method1793() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684()) {
			((Class106_Sub1) this).aClass135_10038.method2325(((Class106_Sub1) this).aClass572_Sub32_Sub2_10039);
			((Class106_Sub1) this).aClass168_10036.method2688();
		}
	}

	final void method9454(int i) {
		if (i == 1)
			method9434(7681, 7681);
		else if (i == 0)
			method9434(8448, 8448);
		else if (i == 2)
			method9434(34165, 7681);
		else if (i == 3)
			method9434(260, 8448);
		else if (i == 4)
			method9434(34023, 34023);
	}

	public final boolean method1986() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684());
	}

	public final boolean method1987() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684());
	}

	void method9455() {
		if (((Class106_Sub1) this).aBool9994 && !((Class106_Sub1) this).aBool10110)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	public void method1989(int i, Class86 class86) {
		((Class106_Sub1) this).anInt10137 = i;
		((Class106_Sub1) this).aClass86_10018 = class86;
		((Class106_Sub1) this).aBool10135 = true;
	}

	public void method1757(int i, Class86 class86) {
		((Class106_Sub1) this).anInt10137 = i;
		((Class106_Sub1) this).aClass86_10018 = class86;
		((Class106_Sub1) this).aBool10135 = true;
	}

	public void method1665(int i, Class86 class86) {
		if (!((Class106_Sub1) this).aBool10135)
			throw new RuntimeException("");
		((Class106_Sub1) this).anInt10137 = i;
		((Class106_Sub1) this).aClass86_10018 = class86;
		if (((Class106_Sub1) this).aBool10086) {
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9981();
		}
	}

	public void method1992(int i, Class86 class86) {
		if (!((Class106_Sub1) this).aBool10135)
			throw new RuntimeException("");
		((Class106_Sub1) this).anInt10137 = i;
		((Class106_Sub1) this).aClass86_10018 = class86;
		if (((Class106_Sub1) this).aBool10086) {
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9981();
		}
	}

	public void method1872(boolean bool) {
		((Class106_Sub1) this).aBool10118 = bool;
		method9433();
	}

	final void method9456(int i) {
		if (((Class106_Sub1) this).anInt10067 != i) {
			int i_731_;
			boolean bool;
			boolean bool_732_;
			boolean bool_733_;
			if (i == 1) {
				i_731_ = 1;
				bool = true;
				bool_732_ = true;
				bool_733_ = true;
			} else if (i == 2) {
				i_731_ = 2;
				bool = true;
				bool_732_ = false;
				bool_733_ = true;
			} else if (i == 128) {
				i_731_ = 3;
				bool = true;
				bool_732_ = true;
				bool_733_ = true;
			} else if (i == 3) {
				i_731_ = 0;
				bool = true;
				bool_732_ = true;
				bool_733_ = false;
			} else {
				i_731_ = 0;
				bool = true;
				bool_732_ = false;
				bool_733_ = false;
			}
			if (bool != ((Class106_Sub1) this).aBool10069) {
				OpenGL.glColorMask(bool, bool, bool, true);
				((Class106_Sub1) this).aBool10069 = bool;
			}
			if (bool_732_ != ((Class106_Sub1) this).aBool10144) {
				((Class106_Sub1) this).aBool10144 = bool_732_;
				method9437();
			}
			if (bool_733_ != ((Class106_Sub1) this).aBool10168) {
				((Class106_Sub1) this).aBool10168 = bool_733_;
				method9435();
			}
			if (i_731_ != ((Class106_Sub1) this).anInt10068) {
				((Class106_Sub1) this).anInt10068 = i_731_;
				method9436();
			}
			((Class106_Sub1) this).anInt10067 = i;
			((Class106_Sub1) this).anInt10066 &= ~0xc;
		}
	}

	public void method1877(float f, float f_734_, float f_735_, float[] fs) {
		float f_736_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * f_734_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * f_735_));
		float f_737_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * f_734_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * f_735_));
		float f_738_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5] * f_734_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9] * f_735_));
		float f_739_ = (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[14] + ((Class106_Sub1) this).aClass250_10197.aFloatArray2728[2] * f + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[6] * f_734_) + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[10] * f_735_));
		fs[0] = (((Class106_Sub1) this).aFloat10084 + ((Class106_Sub1) this).aFloat10085 * f_737_ / f_736_);
		fs[1] = (((Class106_Sub1) this).aFloat10075 + ((Class106_Sub1) this).aFloat10121 * f_738_ / f_736_);
		fs[2] = f_739_;
	}

	public void method1997(float f, float f_740_, float f_741_, float[] fs) {
		float f_742_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * f_740_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * f_741_));
		float f_743_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * f_740_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * f_741_));
		if (f_742_ < -f_743_ || f_742_ > f_743_) {
			float[] fs_744_ = fs;
			float[] fs_745_ = fs;
			fs[2] = Float.NaN;
			fs_745_[1] = Float.NaN;
			fs_744_[0] = Float.NaN;
		} else {
			float f_746_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * f) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * f_740_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * f_741_));
			if (f_746_ < -f_743_ || f_746_ > f_743_) {
				float[] fs_747_ = fs;
				float[] fs_748_ = fs;
				fs[2] = Float.NaN;
				fs_748_[1] = Float.NaN;
				fs_747_[0] = Float.NaN;
			} else {
				float f_749_ = ((((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13]) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1]) * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5]) * f_740_ + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9]) * f_741_);
				if (f_749_ < -f_743_ || f_749_ > f_743_) {
					float[] fs_750_ = fs;
					float[] fs_751_ = fs;
					fs[2] = Float.NaN;
					fs_751_[1] = Float.NaN;
					fs_750_[0] = Float.NaN;
				} else {
					float f_752_ = ((((Class106_Sub1) this).aClass250_10197.aFloatArray2728[14]) + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[2]) * f + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[6]) * f_740_ + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[10]) * f_741_);
					fs[0] = (((Class106_Sub1) this).aFloat10084 + (((Class106_Sub1) this).aFloat10085 * f_746_ / f_743_));
					fs[1] = (((Class106_Sub1) this).aFloat10075 + (((Class106_Sub1) this).aFloat10121 * f_749_ / f_743_));
					fs[2] = f_752_;
				}
			}
		}
	}

	void method9457() {
		int i = aClass104_1410.method1648();
		int i_753_ = aClass104_1410.method1646();
		((Class106_Sub1) this).aClass250_10080.method3441(0.0F, (float) i, 0.0F, (float) i_753_, -1.0F, 1.0F);
		method1975();
		method9399();
		method1714();
	}

	public void method1999(float f, float f_754_, float f_755_, float[] fs) {
		float f_756_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * f_754_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * f_755_));
		float f_757_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * f_754_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * f_755_));
		if (f_756_ < -f_757_ || f_756_ > f_757_) {
			float[] fs_758_ = fs;
			float[] fs_759_ = fs;
			fs[2] = Float.NaN;
			fs_759_[1] = Float.NaN;
			fs_758_[0] = Float.NaN;
		} else {
			float f_760_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * f) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * f_754_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * f_755_));
			if (f_760_ < -f_757_ || f_760_ > f_757_) {
				float[] fs_761_ = fs;
				float[] fs_762_ = fs;
				fs[2] = Float.NaN;
				fs_762_[1] = Float.NaN;
				fs_761_[0] = Float.NaN;
			} else {
				float f_763_ = ((((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13]) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1]) * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5]) * f_754_ + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9]) * f_755_);
				if (f_763_ < -f_757_ || f_763_ > f_757_) {
					float[] fs_764_ = fs;
					float[] fs_765_ = fs;
					fs[2] = Float.NaN;
					fs_765_[1] = Float.NaN;
					fs_764_[0] = Float.NaN;
				} else {
					float f_766_ = ((((Class106_Sub1) this).aClass250_10197.aFloatArray2728[14]) + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[2]) * f + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[6]) * f_754_ + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[10]) * f_755_);
					fs[0] = (((Class106_Sub1) this).aFloat10084 + (((Class106_Sub1) this).aFloat10085 * f_760_ / f_757_));
					fs[1] = (((Class106_Sub1) this).aFloat10075 + (((Class106_Sub1) this).aFloat10121 * f_763_ / f_757_));
					fs[2] = f_766_;
				}
			}
		}
	}

	public void method2046(float f, float f_767_, float f_768_, float[] fs) {
		float f_769_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[14] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[2] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[6] * f_767_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[10] * f_768_));
		float f_770_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[15] + ((Class106_Sub1) this).aClass250_10183.aFloatArray2728[3] * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[7] * f_767_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[11] * f_768_));
		if (f_769_ < -f_770_ || f_769_ > f_770_) {
			float[] fs_771_ = fs;
			float[] fs_772_ = fs;
			fs[2] = Float.NaN;
			fs_772_[1] = Float.NaN;
			fs_771_[0] = Float.NaN;
		} else {
			float f_773_ = (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[12] + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[0] * f) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[4] * f_767_) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[8] * f_768_));
			if (f_773_ < -f_770_ || f_773_ > f_770_) {
				float[] fs_774_ = fs;
				float[] fs_775_ = fs;
				fs[2] = Float.NaN;
				fs_775_[1] = Float.NaN;
				fs_774_[0] = Float.NaN;
			} else {
				float f_776_ = ((((Class106_Sub1) this).aClass250_10183.aFloatArray2728[13]) + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[1]) * f + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[5]) * f_767_ + (((Class106_Sub1) this).aClass250_10183.aFloatArray2728[9]) * f_768_);
				if (f_776_ < -f_770_ || f_776_ > f_770_) {
					float[] fs_777_ = fs;
					float[] fs_778_ = fs;
					fs[2] = Float.NaN;
					fs_778_[1] = Float.NaN;
					fs_777_[0] = Float.NaN;
				} else {
					float f_779_ = ((((Class106_Sub1) this).aClass250_10197.aFloatArray2728[14]) + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[2]) * f + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[6]) * f_767_ + (((Class106_Sub1) this).aClass250_10197.aFloatArray2728[10]) * f_768_);
					fs[0] = (((Class106_Sub1) this).aFloat10084 + (((Class106_Sub1) this).aFloat10085 * f_773_ / f_770_));
					fs[1] = (((Class106_Sub1) this).aFloat10075 + (((Class106_Sub1) this).aFloat10121 * f_776_ / f_770_));
					fs[2] = f_779_;
				}
			}
		}
	}

	public Interface11 method2001(int i, int i_780_) {
		return new Class572_Sub12_Sub3(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_780_);
	}

	public Interface11 method1810(int i, int i_781_) {
		return new Class572_Sub12_Sub3(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_781_);
	}

	public Interface11 method1750(int i, int i_782_, int i_783_) {
		return new Class572_Sub12_Sub3(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_782_, i_783_);
	}

	public final void method1714() {
		if (aClass104_1410 != null) {
			((Class106_Sub1) this).anInt10187 = 0;
			((Class106_Sub1) this).anInt10098 = 0;
			((Class106_Sub1) this).anInt10101 = aClass104_1410.method1648();
			((Class106_Sub1) this).anInt10099 = aClass104_1410.method1646();
			OpenGL.glDisable(3089);
		}
	}

	void method1728(int i, int i_784_, int i_785_, int i_786_, int i_787_) {
		method9418();
		method9456(i_787_);
		float f = (float) i + 0.35F;
		float f_788_ = (float) i_784_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_786_ >> 16), (byte) (i_786_ >> 8), (byte) i_786_, (byte) (i_786_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_788_);
		OpenGL.glVertex2f(f + (float) i_785_, f_788_);
		OpenGL.glEnd();
	}

	public void method2037(boolean bool) {
		/* empty */
	}

	public final void method1767(int i, float f, float f_789_, float f_790_, float f_791_, float f_792_) {
		boolean bool = ((Class106_Sub1) this).anInt10115 != i;
		if (bool || ((Class106_Sub1) this).aFloat10120 != f || ((Class106_Sub1) this).aFloat10126 != f_789_) {
			((Class106_Sub1) this).anInt10115 = i;
			((Class106_Sub1) this).aFloat10120 = f;
			((Class106_Sub1) this).aFloat10126 = f_789_;
			if (bool) {
				((Class106_Sub1) this).aFloat10011 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff0000) / 1.671168E7F);
				((Class106_Sub1) this).aFloat10117 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff00) / 65280.0F);
				((Class106_Sub1) this).aFloat9992 = ((float) (((Class106_Sub1) this).anInt10115 & 0xff) / 255.0F);
				method9405();
			}
			method9406();
		}
		if (((Class106_Sub1) this).aFloatArray10111[0] != f_790_ || ((Class106_Sub1) this).aFloatArray10111[1] != f_791_ || ((Class106_Sub1) this).aFloatArray10111[2] != f_792_) {
			((Class106_Sub1) this).aFloatArray10111[0] = f_790_;
			((Class106_Sub1) this).aFloatArray10111[1] = f_791_;
			((Class106_Sub1) this).aFloatArray10111[2] = f_792_;
			((Class106_Sub1) this).aFloatArray10112[0] = -f_790_;
			((Class106_Sub1) this).aFloatArray10112[1] = -f_791_;
			((Class106_Sub1) this).aFloatArray10112[2] = -f_792_;
			float f_793_ = (float) (1.0 / Math.sqrt((double) (f_790_ * f_790_ + f_791_ * f_791_ + f_792_ * f_792_)));
			((Class106_Sub1) this).aFloatArray10113[0] = f_790_ * f_793_;
			((Class106_Sub1) this).aFloatArray10113[1] = f_791_ * f_793_;
			((Class106_Sub1) this).aFloatArray10113[2] = f_792_ * f_793_;
			((Class106_Sub1) this).aFloatArray9998[0] = -((Class106_Sub1) this).aFloatArray10113[0];
			((Class106_Sub1) this).aFloatArray9998[1] = -((Class106_Sub1) this).aFloatArray10113[1];
			((Class106_Sub1) this).aFloatArray9998[2] = -((Class106_Sub1) this).aFloatArray10113[2];
			method9384();
			((Class106_Sub1) this).anInt10125 = (int) (f_790_ * 256.0F / f_791_);
			((Class106_Sub1) this).anInt10053 = (int) (f_792_ * 256.0F / f_791_);
		}
	}

	void method9458() {
		method9382();
	}

	final void method9459() {
		if (((Class106_Sub1) this).anInt10087 == 2)
			OpenGL.glDepthRange(((Class106_Sub1) this).aFloat10088, ((Class106_Sub1) this).aFloat9991);
		else
			OpenGL.glDepthRange(0.0F, 1.0F);
	}

	void method9460() {
		int i = aClass104_1410.method1648();
		int i_794_ = aClass104_1410.method1646();
		((Class106_Sub1) this).aClass250_10080.method3441(0.0F, (float) i, 0.0F, (float) i_794_, -1.0F, 1.0F);
		method1975();
		method9399();
		method1714();
	}

	public final boolean method1786() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684());
	}

	public Class161 method2005(int[] is, int i, int i_795_, int i_796_, int i_797_, boolean bool) {
		return new Class161_Sub2(this, i_796_, i_797_, is, i, i_795_);
	}

	public void method1850() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub1) this).aLongArray10199[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub1) this).aLongArray10199[i]);
				((Class106_Sub1) this).aLongArray10199[i] = 0L;
			}
		}
		((Class106_Sub1) this).anInt10202 = 0;
		((Class106_Sub1) this).anInt10171 = 0;
	}

	public Class161 method1957(int[] is, int i, int i_798_, int i_799_, int i_800_, boolean bool) {
		return new Class161_Sub2(this, i_799_, i_800_, is, i, i_798_);
	}

	public void method1893(int i, Class167 class167, int i_801_, int i_802_) {
		Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
		Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
		method9419();
		method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
		method9456(1);
		method9434(7681, 8448);
		method9423(0, 34167, 768);
		float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236);
		float f_803_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) ((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232);
		OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_801_), f_803_ * (float) (((Class106_Sub1) this).anInt10098 - i_802_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10098);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10187 - i_801_), f_803_ * (float) (((Class106_Sub1) this).anInt10099 - i_802_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10187, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_801_), f_803_ * (float) (((Class106_Sub1) this).anInt10099 - i_802_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10099);
		OpenGL.glTexCoord2f(f * (float) (((Class106_Sub1) this).anInt10101 - i_801_), f_803_ * (float) (((Class106_Sub1) this).anInt10098 - i_802_));
		OpenGL.glVertex2i(((Class106_Sub1) this).anInt10101, ((Class106_Sub1) this).anInt10098);
		OpenGL.glEnd();
		method9423(0, 5890, 768);
	}

	public final void method2008() {
		if (aClass104_1410 != null) {
			((Class106_Sub1) this).anInt10187 = 0;
			((Class106_Sub1) this).anInt10098 = 0;
			((Class106_Sub1) this).anInt10101 = aClass104_1410.method1648();
			((Class106_Sub1) this).anInt10099 = aClass104_1410.method1646();
			OpenGL.glDisable(3089);
		}
	}

	public final void method1788() {
		if (aClass104_1410 != null) {
			((Class106_Sub1) this).anInt10187 = 0;
			((Class106_Sub1) this).anInt10098 = 0;
			((Class106_Sub1) this).anInt10101 = aClass104_1410.method1648();
			((Class106_Sub1) this).anInt10099 = aClass104_1410.method1646();
			OpenGL.glDisable(3089);
		}
	}

	public int[] method1836(int i, int i_804_, int i_805_, int i_806_) {
		if (aClass104_1410 != null) {
			int[] is = new int[i_805_ * i_806_];
			int i_807_ = aClass104_1410.method1646();
			for (int i_808_ = 0; i_808_ < i_806_; i_808_++)
				OpenGL.glReadPixelsi(i, i_807_ - i_804_ - i_808_ - 1, i_805_, 1, 32993, ((Class106_Sub1) this).anInt10178, is, i_808_ * i_805_);
			return is;
		}
		return null;
	}

	public final void method2003() {
		if (aClass104_1410 != null) {
			((Class106_Sub1) this).anInt10187 = 0;
			((Class106_Sub1) this).anInt10098 = 0;
			((Class106_Sub1) this).anInt10101 = aClass104_1410.method1648();
			((Class106_Sub1) this).anInt10099 = aClass104_1410.method1646();
			OpenGL.glDisable(3089);
		}
	}

	public void method1771(int i, Class572_Sub36[] class572_sub36s) {
		for (int i_809_ = 0; i_809_ < i; i_809_++)
			((Class106_Sub1) this).aClass572_Sub36Array10041[i_809_] = class572_sub36s[i_809_];
		((Class106_Sub1) this).anInt10097 = i;
		if (((Class106_Sub1) this).anInt10087 != 1)
			method9403();
	}

	public final void method1870(int i, int i_810_, int i_811_, int i_812_) {
		if (((Class106_Sub1) this).anInt10187 < i)
			((Class106_Sub1) this).anInt10187 = i;
		if (((Class106_Sub1) this).anInt10101 > i_811_)
			((Class106_Sub1) this).anInt10101 = i_811_;
		if (((Class106_Sub1) this).anInt10098 < i_810_)
			((Class106_Sub1) this).anInt10098 = i_810_;
		if (((Class106_Sub1) this).anInt10099 > i_812_)
			((Class106_Sub1) this).anInt10099 = i_812_;
		OpenGL.glEnable(3089);
		method9395();
	}

	public final void method2014(int i, int i_813_, int i_814_, int i_815_) {
		if (((Class106_Sub1) this).anInt10187 < i)
			((Class106_Sub1) this).anInt10187 = i;
		if (((Class106_Sub1) this).anInt10101 > i_814_)
			((Class106_Sub1) this).anInt10101 = i_814_;
		if (((Class106_Sub1) this).anInt10098 < i_813_)
			((Class106_Sub1) this).anInt10098 = i_813_;
		if (((Class106_Sub1) this).anInt10099 > i_815_)
			((Class106_Sub1) this).anInt10099 = i_815_;
		OpenGL.glEnable(3089);
		method9395();
	}

	public Model method1926(Class159 class159, int i, int i_816_, int i_817_, int i_818_) {
		return new OpenGLModel(this, class159, i, i_817_, i_818_, i_816_);
	}

	final void method9461() {
		if (aClass104_1410 != null) {
			int i;
			int i_819_;
			int i_820_;
			int i_821_;
			if (((Class106_Sub1) this).anInt10087 == 2) {
				i = ((Class106_Sub1) this).anInt10104;
				i_819_ = ((Class106_Sub1) this).anInt10105;
				i_820_ = ((Class106_Sub1) this).anInt10106;
				i_821_ = ((Class106_Sub1) this).anInt10107;
			} else {
				i = 0;
				i_819_ = 0;
				i_820_ = aClass104_1410.method1648();
				i_821_ = aClass104_1410.method1646();
			}
			if (i_820_ < 1)
				i_820_ = 1;
			if (i_821_ < 1)
				i_821_ = 1;
			OpenGL.glViewport(((Class106_Sub1) this).anInt10102 + i, (((Class106_Sub1) this).anInt10096 + aClass104_1410.method1646() - i_819_ - i_821_), i_820_, i_821_);
			((Class106_Sub1) this).aFloat10085 = (float) ((Class106_Sub1) this).anInt10106 / 2.0F;
			((Class106_Sub1) this).aFloat10121 = (float) ((Class106_Sub1) this).anInt10107 / 2.0F;
			((Class106_Sub1) this).aFloat10084 = ((float) ((Class106_Sub1) this).anInt10104 + ((Class106_Sub1) this).aFloat10085);
			((Class106_Sub1) this).aFloat10075 = ((float) ((Class106_Sub1) this).anInt10105 + ((Class106_Sub1) this).aFloat10121);
		}
	}

	final void method9462() {
		if (((Class106_Sub1) this).anInt10087 == 2)
			OpenGL.glDepthRange(((Class106_Sub1) this).aFloat10088, ((Class106_Sub1) this).aFloat9991);
		else
			OpenGL.glDepthRange(0.0F, 1.0F);
	}

	public void method1713(float f, float f_822_) {
		((Class106_Sub1) this).aFloat10088 = f;
		((Class106_Sub1) this).aFloat9991 = f_822_;
		method9394();
	}

	final void method9463() {
		if (aClass104_1410 != null && (((Class106_Sub1) this).anInt10187 < ((Class106_Sub1) this).anInt10101) && (((Class106_Sub1) this).anInt10098 < ((Class106_Sub1) this).anInt10099))
			OpenGL.glScissor((((Class106_Sub1) this).anInt10102 + ((Class106_Sub1) this).anInt10187), (((Class106_Sub1) this).anInt10096 + aClass104_1410.method1646() - ((Class106_Sub1) this).anInt10099), (((Class106_Sub1) this).anInt10101 - ((Class106_Sub1) this).anInt10187), (((Class106_Sub1) this).anInt10099 - ((Class106_Sub1) this).anInt10098));
		else
			OpenGL.glScissor(0, 0, 0, 0);
	}

	final void method9464() {
		OpenGL.glPushMatrix();
	}

	public final synchronized void method1806(int i) {
		int i_823_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub1) this).aClass675_10025.method7928((byte) -119)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10025.method7920(-1945803963);
			anIntArray10065[i_823_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10055 -= class572_sub26.anInt9258 * -1945426987;
			if (i_823_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_823_, anIntArray10065, 0);
				i_823_ = 0;
			}
		}
		if (i_823_ > 0) {
			OpenGL.glDeleteBuffersARB(i_823_, anIntArray10065, 0);
			i_823_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10059.method7928((byte) -16)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10059.method7920(-1945803963);
			anIntArray10065[i_823_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10054 -= class572_sub26.anInt9258 * -1945426987;
			if (i_823_ == 1000) {
				OpenGL.glDeleteTextures(i_823_, anIntArray10065, 0);
				i_823_ = 0;
			}
		}
		if (i_823_ > 0) {
			OpenGL.glDeleteTextures(i_823_, anIntArray10065, 0);
			i_823_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10032.method7928((byte) -30)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10032.method7920(-1945803963);
			anIntArray10065[i_823_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_823_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_823_, anIntArray10065, 0);
				i_823_ = 0;
			}
		}
		if (i_823_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_823_, anIntArray10065, 0);
			i_823_ = 0;
		}
		while (!((Class106_Sub1) this).aClass675_10061.method7928((byte) -99)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10061.method7920(-1945803963);
			anIntArray10065[i_823_++] = (int) (class572_sub26.hash * 381237825124074065L);
			((Class106_Sub1) this).anInt10198 -= class572_sub26.anInt9258 * -1945426987;
			if (i_823_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_823_, anIntArray10065, 0);
				i_823_ = 0;
			}
		}
		if (i_823_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_823_, anIntArray10065, 0);
			boolean bool = false;
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -101)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub1) this).aClass675_10062.method7928((byte) -109)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10062.method7920(-1945803963);
			OpenGL.glDeleteProgramARB((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10063.method7928((byte) -12)) {
			Class572 class572 = ((Class106_Sub1) this).aClass675_10063.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub1) this).aClass675_10057.method7928((byte) -116)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub1) this).aClass675_10057.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		((Class106_Sub1) this).aClass168_10036.method2690();
		if (method1669() > 100663296 && (Class69.method1067(-2001216479) > ((Class106_Sub1) this).aLong10064 + 60000L)) {
			System.gc();
			((Class106_Sub1) this).aLong10064 = Class69.method1067(-2114779652);
		}
		((Class106_Sub1) this).anInt10047 = i;
	}

	int method9465() {
		int i = 0;
		((Class106_Sub1) this).aString10149 = OpenGL.glGetString(7936).toLowerCase();
		((Class106_Sub1) this).aString9995 = OpenGL.glGetString(7937).toLowerCase();
		if (((Class106_Sub1) this).aString10149.indexOf("microsoft") != -1)
			i |= 0x1;
		if (((Class106_Sub1) this).aString10149.indexOf("brian paul") != -1 || ((Class106_Sub1) this).aString10149.indexOf("mesa") != -1)
			i |= 0x1;
		String string = OpenGL.glGetString(7938);
		String[] strings = Class104_Sub2.method9935(string.replace('.', ' '), ' ', 207597699);
		if (strings.length >= 2) {
			try {
				int i_824_ = Class97.method1565(strings[0], (byte) -17);
				int i_825_ = Class97.method1565(strings[1], (byte) -35);
				((Class106_Sub1) this).anInt10152 = i_824_ * 10 + i_825_;
			} catch (NumberFormatException numberformatexception) {
				i |= 0x4;
			}
		} else
			i |= 0x4;
		if (((Class106_Sub1) this).anInt10152 < 12)
			i |= 0x2;
		if (!((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_multitexture"))
			i |= 0x8;
		if (!((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_texture_env_combine"))
			i |= 0x20;
		int[] is = new int[1];
		OpenGL.glGetIntegerv(34018, is, 0);
		((Class106_Sub1) this).anInt10150 = is[0];
		OpenGL.glGetIntegerv(34929, is, 0);
		((Class106_Sub1) this).anInt10155 = is[0];
		OpenGL.glGetIntegerv(34930, is, 0);
		((Class106_Sub1) this).anInt10170 = is[0];
		if (((Class106_Sub1) this).anInt10150 < 2 || ((Class106_Sub1) this).anInt10155 < 2 || ((Class106_Sub1) this).anInt10170 < 2)
			i |= 0x10;
		((Class106_Sub1) this).aBool10153 = Stream.method2804();
		((Class106_Sub1) this).aBool10163 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_vertex_buffer_object");
		((Class106_Sub1) this).aBool10161 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_multisample");
		((Class106_Sub1) this).aBool10172 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_vertex_program");
		((Class106_Sub1) this).aBool10174 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_fragment_program");
		((Class106_Sub1) this).aBool10116 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_vertex_shader");
		((Class106_Sub1) this).aBool10048 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_fragment_shader");
		((Class106_Sub1) this).aBool10166 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_EXT_texture3D");
		((Class106_Sub1) this).aBool10169 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_texture_rectangle");
		((Class106_Sub1) this).aBool10074 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_texture_cube_map");
		((Class106_Sub1) this).aBool10173 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_seamless_cube_map");
		((Class106_Sub1) this).aBool10175 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_texture_float");
		((Class106_Sub1) this).aBool10154 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_texture_non_power_of_two");
		((Class106_Sub1) this).aBool10124 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_EXT_framebuffer_object");
		((Class106_Sub1) this).aBool10159 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_EXT_framebuffer_blit");
		((Class106_Sub1) this).aBool10160 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_EXT_framebuffer_multisample");
		((Class106_Sub1) this).aBool10162 = (((Class106_Sub1) this).aBool10159 & ((Class106_Sub1) this).aBool10160);
		((Class106_Sub1) this).aBool10177 = ((Class106_Sub1) this).anOpenGL10034.method2576("GL_EXT_blend_func_separate");
		((Class106_Sub1) this).aBool10165 = (((Class106_Sub1) this).anUnsafe10022 != null && (((Class106_Sub1) this).anInt10152 >= 32 || ((Class106_Sub1) this).anOpenGL10034.method2576("GL_ARB_sync")));
		((Class106_Sub1) this).aBool10077 = Class589.aString7805.startsWith("mac");
		OpenGL.glGetFloatv(2834, aFloatArray10141, 0);
		((Class106_Sub1) this).aFloat10052 = aFloatArray10141[0];
		((Class106_Sub1) this).aFloat10179 = aFloatArray10141[1];
		return i != 0 ? i : 0;
	}

	final void method9466() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf((((Class106_Sub1) this).aClass250_10197.aFloatArray2728), 0);
		if (((Class106_Sub1) this).aBool10086)
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
		method9384();
		method9403();
	}

	final void method9467() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf((((Class106_Sub1) this).aClass250_10197.aFloatArray2728), 0);
		if (((Class106_Sub1) this).aBool10086)
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
		method9384();
		method9403();
	}

	final void method9468() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf((((Class106_Sub1) this).aClass250_10197.aFloatArray2728), 0);
		if (((Class106_Sub1) this).aBool10086)
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
		method9384();
		method9403();
	}

	final void method9469() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf((((Class106_Sub1) this).aClass250_10197.aFloatArray2728), 0);
		if (((Class106_Sub1) this).aBool10086)
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
		method9384();
		method9403();
	}

	final void method9470() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf((((Class106_Sub1) this).aClass250_10197.aFloatArray2728), 0);
		if (((Class106_Sub1) this).aBool10086)
			((Class147) ((Class106_Sub1) this).aClass147_10037).aClass148_Sub6_1688.method9980();
		method9384();
		method9403();
	}

	public int method1929(int i, int i_826_) {
		return i | i_826_;
	}

	void method9471() {
		((Class106_Sub1) this).aFloat10132 = (((Class106_Sub1) this).aFloat10091 - (float) ((Class106_Sub1) this).anInt10189 - ((Class106_Sub1) this).aFloat10134);
		((Class106_Sub1) this).aFloat10131 = (((Class106_Sub1) this).aFloat10132 - ((float) ((Class106_Sub1) this).anInt10129 * ((Class106_Sub1) this).aFloat10133));
		if (((Class106_Sub1) this).aFloat10131 < ((Class106_Sub1) this).aFloat10090)
			((Class106_Sub1) this).aFloat10131 = ((Class106_Sub1) this).aFloat10090;
		OpenGL.glFogf(2915, ((Class106_Sub1) this).aFloat10131);
		OpenGL.glFogf(2916, ((Class106_Sub1) this).aFloat10132);
		aFloatArray10141[0] = (float) (((Class106_Sub1) this).anInt10058 & 0xff0000) / 1.671168E7F;
		aFloatArray10141[1] = (float) (((Class106_Sub1) this).anInt10058 & 0xff00) / 65280.0F;
		aFloatArray10141[2] = (float) (((Class106_Sub1) this).anInt10058 & 0xff) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray10141, 0);
	}

	public final boolean method1973() {
		if (((Class106_Sub1) this).aClass135_10038 == null)
			return false;
		return ((Class106_Sub1) this).aClass135_10038.method2328();
	}

	void method1803() {
		for (Class572 class572 = ((Class106_Sub1) this).aClass675_10130.method7932((byte) 50); class572 != null; class572 = ((Class106_Sub1) this).aClass675_10130.method7926(1363753042))
			((Class572_Sub35_Sub2) class572).method10071();
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2316();
		if (((Class106_Sub1) this).aBool10050) {
			Class472.method5585(false, true, (byte) -10);
			((Class106_Sub1) this).aBool10050 = false;
		}
	}

	final void method9472() {
		((Class106_Sub1) this).aClass250_10183.method3442(((Class106_Sub1) this).aClass250_10197);
		((Class106_Sub1) this).aClass250_10183.method3445(((Class106_Sub1) this).aClass250_10079);
		((Class106_Sub1) this).aClass250_10183.method3459(((Class106_Sub1) this).aFloatArrayArray10082[0]);
		((Class106_Sub1) this).aClass250_10183.method3460(((Class106_Sub1) this).aFloatArrayArray10082[1]);
		((Class106_Sub1) this).aClass250_10183.method3455(((Class106_Sub1) this).aFloatArrayArray10082[2]);
		((Class106_Sub1) this).aClass250_10183.method3475(((Class106_Sub1) this).aFloatArrayArray10082[3]);
		((Class106_Sub1) this).aClass250_10183.method3457(((Class106_Sub1) this).aFloatArrayArray10082[4]);
		((Class106_Sub1) this).aClass250_10183.method3456(((Class106_Sub1) this).aFloatArrayArray10082[5]);
	}

	public int method2015() {
		return 4;
	}

	void method9473() {
		int i;
		for (i = 0; i < ((Class106_Sub1) this).anInt10097; i++) {
			Class572_Sub36 class572_sub36 = ((Class106_Sub1) this).aClass572_Sub36Array10041[i];
			int i_827_ = 16386 + i;
			aFloatArray10188[0] = (float) class572_sub36.method8720(-1319735737);
			aFloatArray10188[1] = (float) class572_sub36.method8721((byte) 39);
			aFloatArray10188[2] = (float) class572_sub36.method8722(2100481022);
			aFloatArray10188[3] = 1.0F;
			OpenGL.glLightfv(i_827_, 4611, aFloatArray10188, 0);
			int i_828_ = class572_sub36.method8723(-1288611141);
			float f = class572_sub36.method8724((byte) 44) / 255.0F;
			aFloatArray10188[0] = (float) (i_828_ >> 16 & 0xff) * f;
			aFloatArray10188[1] = (float) (i_828_ >> 8 & 0xff) * f;
			aFloatArray10188[2] = (float) (i_828_ & 0xff) * f;
			OpenGL.glLightfv(i_827_, 4609, aFloatArray10188, 0);
			OpenGL.glLightf(i_827_, 4617, (1.0F / (float) (class572_sub36.method8752((byte) 99) * class572_sub36.method8752((byte) 118))));
			OpenGL.glEnable(i_827_);
		}
		for (/**/; i < ((Class106_Sub1) this).anInt10123; i++)
			OpenGL.glDisable(16386 + i);
		((Class106_Sub1) this).anInt10123 = ((Class106_Sub1) this).anInt10097;
	}

	public Class261 method1936() {
		return ((Class106_Sub1) this).aClass261_10045;
	}

	void method9474() {
		aFloatArray10141[0] = (((Class106_Sub1) this).aFloat10120 * ((Class106_Sub1) this).aFloat10011);
		aFloatArray10141[1] = (((Class106_Sub1) this).aFloat10120 * ((Class106_Sub1) this).aFloat10117);
		aFloatArray10141[2] = (((Class106_Sub1) this).aFloat10120 * ((Class106_Sub1) this).aFloat9992);
		aFloatArray10141[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray10141, 0);
		aFloatArray10141[0] = (-((Class106_Sub1) this).aFloat10126 * ((Class106_Sub1) this).aFloat10011);
		aFloatArray10141[1] = (-((Class106_Sub1) this).aFloat10126 * ((Class106_Sub1) this).aFloat10117);
		aFloatArray10141[2] = (-((Class106_Sub1) this).aFloat10126 * ((Class106_Sub1) this).aFloat9992);
		aFloatArray10141[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray10141, 0);
	}

	void method9475() {
		OpenGL.glLightfv(16384, 4611, ((Class106_Sub1) this).aFloatArray10113, 0);
		OpenGL.glLightfv(16385, 4611, ((Class106_Sub1) this).aFloatArray9998, 0);
	}

	void method9476() {
		OpenGL.glLightfv(16384, 4611, ((Class106_Sub1) this).aFloatArray10113, 0);
		OpenGL.glLightfv(16385, 4611, ((Class106_Sub1) this).aFloatArray9998, 0);
	}

	void method9477() {
		if (((Class106_Sub1) this).aBool10127 && ((Class106_Sub1) this).anInt10129 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public final void method1955(Class250 class250) {
		((Class106_Sub1) this).aClass250_10079.method3442(class250);
		method9401();
		method9400();
	}

	void method9478() {
		if (((Class106_Sub1) this).aBool10127 && ((Class106_Sub1) this).anInt10129 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method9479() {
		if (((Class106_Sub1) this).aBool10127 && ((Class106_Sub1) this).anInt10129 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public Class261 method2038() {
		return ((Class106_Sub1) this).aClass261_10045;
	}

	void method9480(int i, int i_829_) {
		method2018();
		method1708(i, i_829_, 1533561586);
		if (((Class106_Sub1) this).aBool10165) {
			((Class106_Sub1) this).aClass161_10109 = method1864(i, i_829_, true, true);
			((Class106_Sub1) this).aClass104_Sub1_10190 = method1693();
			((Class106_Sub1) this).aClass104_Sub1_10190.method9908(0, ((Class106_Sub1) this).aClass161_10109.method2590());
			OpenGL.glGenBuffersARB(3, ((Class106_Sub1) this).anIntArray10186, 0);
			for (int i_830_ = 0; i_830_ < 3; i_830_++) {
				OpenGL.glBindBufferARB(35051, (((Class106_Sub1) this).anIntArray10186[i_830_]));
				OpenGL.glBufferDataARBa(35051, i * i_829_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			((Class106_Sub1) this).aClass161_10109 = method1864(i, i_829_, true, true);
			((Class106_Sub1) this).aClass104_Sub1_10190 = method1693();
			((Class106_Sub1) this).aClass104_Sub1_10190.method9908(0, ((Class106_Sub1) this).aClass161_10109.method2590());
		}
	}

	boolean method1907(int i, int i_831_, int i_832_, int i_833_, Class261 class261, Class326 class326) {
		Class250 class250 = ((Class106_Sub1) this).aClass250_10093;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub1) this).aClass250_10183);
		return class326.method4147(i, i_831_, i_832_, i_833_, class250, ((Class106_Sub1) this).aFloat10084, ((Class106_Sub1) this).aFloat10075, ((Class106_Sub1) this).aFloat10085, ((Class106_Sub1) this).aFloat10121);
	}

	final void method9481(Class250 class250) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(class250.aFloatArray2728, 0);
	}

	public boolean method2016() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method8684());
	}

	final void method9482() {
		if (aClass104_1410 != null) {
			int i;
			int i_834_;
			int i_835_;
			int i_836_;
			if (((Class106_Sub1) this).anInt10087 == 2) {
				i = ((Class106_Sub1) this).anInt10104;
				i_834_ = ((Class106_Sub1) this).anInt10105;
				i_835_ = ((Class106_Sub1) this).anInt10106;
				i_836_ = ((Class106_Sub1) this).anInt10107;
			} else {
				i = 0;
				i_834_ = 0;
				i_835_ = aClass104_1410.method1648();
				i_836_ = aClass104_1410.method1646();
			}
			if (i_835_ < 1)
				i_835_ = 1;
			if (i_836_ < 1)
				i_836_ = 1;
			OpenGL.glViewport(((Class106_Sub1) this).anInt10102 + i, (((Class106_Sub1) this).anInt10096 + aClass104_1410.method1646() - i_834_ - i_836_), i_835_, i_836_);
			((Class106_Sub1) this).aFloat10085 = (float) ((Class106_Sub1) this).anInt10106 / 2.0F;
			((Class106_Sub1) this).aFloat10121 = (float) ((Class106_Sub1) this).anInt10107 / 2.0F;
			((Class106_Sub1) this).aFloat10084 = ((float) ((Class106_Sub1) this).anInt10104 + ((Class106_Sub1) this).aFloat10085);
			((Class106_Sub1) this).aFloat10075 = ((float) ((Class106_Sub1) this).anInt10105 + ((Class106_Sub1) this).aFloat10121);
		}
	}

	public boolean method1972() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method8684());
	}

	public boolean method1993() {
		return (((Class106_Sub1) this).aClass572_Sub32_Sub1_10040 != null && ((Class106_Sub1) this).aClass572_Sub32_Sub1_10040.method8684());
	}

	public boolean method1699() {
		if (((Class106_Sub1) this).aBool10165 && (((Class106_Sub1) this).aLongArray10199[((Class106_Sub1) this).anInt10202]) != 0L)
			return false;
		return true;
	}

	public void method1690(Class96 class96, float f, Class96 class96_837_, float f_838_, Class96 class96_839_, float f_840_) {
		int i = 0;
		if (class96_839_ == null && f_840_ > 0.0F)
			f_840_ = 0.0F;
		if (class96_837_ == null && f_838_ > 0.0F) {
			class96_837_ = class96_839_;
			class96_839_ = null;
			f_838_ = f_840_;
			f_840_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_837_;
			class96_837_ = class96_839_;
			class96_839_ = null;
			f = f_838_;
			f_838_ = f_840_;
			f_840_ = 0.0F;
		}
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[0] = (Class96_Sub1) class96;
		Class572_Sub32_Sub3.aFloatArray11285[0] = f;
		if (f > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[1] = (Class96_Sub1) class96_837_;
		Class572_Sub32_Sub3.aFloatArray11285[1] = f_838_;
		if (f_838_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[2] = (Class96_Sub1) class96_839_;
		Class572_Sub32_Sub3.aFloatArray11285[2] = f_840_;
		if (f_840_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.anInt11276 = i;
		Class572_Sub32_Sub3.aFloat11277 = 1.0F - (f + f_838_ + f_840_);
	}

	public void method1759(Class96 class96, float f, Class96 class96_841_, float f_842_, Class96 class96_843_, float f_844_) {
		int i = 0;
		if (class96_843_ == null && f_844_ > 0.0F)
			f_844_ = 0.0F;
		if (class96_841_ == null && f_842_ > 0.0F) {
			class96_841_ = class96_843_;
			class96_843_ = null;
			f_842_ = f_844_;
			f_844_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_841_;
			class96_841_ = class96_843_;
			class96_843_ = null;
			f = f_842_;
			f_842_ = f_844_;
			f_844_ = 0.0F;
		}
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[0] = (Class96_Sub1) class96;
		Class572_Sub32_Sub3.aFloatArray11285[0] = f;
		if (f > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[1] = (Class96_Sub1) class96_841_;
		Class572_Sub32_Sub3.aFloatArray11285[1] = f_842_;
		if (f_842_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.aClass96_Sub1Array11279[2] = (Class96_Sub1) class96_843_;
		Class572_Sub32_Sub3.aFloatArray11285[2] = f_844_;
		if (f_844_ > 0.0F)
			i++;
		Class572_Sub32_Sub3.anInt11276 = i;
		Class572_Sub32_Sub3.aFloat11277 = 1.0F - (f + f_842_ + f_844_);
	}

	public Interface6 method2021(int i, int i_845_, Class171 class171, Class88 class88, int i_846_) {
		return new Class572_Sub12_Sub3(this, class171, class88, i, i_845_, i_846_);
	}

	final void method1988(float f, float f_847_, float f_848_, float f_849_, float f_850_, float f_851_) {
		Class572_Sub32_Sub2.aFloat11006 = f;
		Class572_Sub32_Sub2.aFloat11003 = f_847_;
		Class572_Sub32_Sub2.aFloat11002 = f_848_;
	}

	public void method1874(int i, int i_852_) {
		int i_853_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_852_ & 0xff0000) / 1.671168E7F, (float) (i_852_ & 0xff00) / 65280.0F, (float) (i_852_ & 0xff) / 255.0F, (float) (i_852_ >>> 24) / 255.0F);
			i_853_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method9432(true);
			i_853_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_853_ |= 0x400;
		OpenGL.glClear(i_853_);
	}

	void method9483() {
		((Class106_Sub1) this).aFloat10132 = (((Class106_Sub1) this).aFloat10091 - (float) ((Class106_Sub1) this).anInt10189 - ((Class106_Sub1) this).aFloat10134);
		((Class106_Sub1) this).aFloat10131 = (((Class106_Sub1) this).aFloat10132 - ((float) ((Class106_Sub1) this).anInt10129 * ((Class106_Sub1) this).aFloat10133));
		if (((Class106_Sub1) this).aFloat10131 < ((Class106_Sub1) this).aFloat10090)
			((Class106_Sub1) this).aFloat10131 = ((Class106_Sub1) this).aFloat10090;
		OpenGL.glFogf(2915, ((Class106_Sub1) this).aFloat10131);
		OpenGL.glFogf(2916, ((Class106_Sub1) this).aFloat10132);
		aFloatArray10141[0] = (float) (((Class106_Sub1) this).anInt10058 & 0xff0000) / 1.671168E7F;
		aFloatArray10141[1] = (float) (((Class106_Sub1) this).anInt10058 & 0xff00) / 65280.0F;
		aFloatArray10141[2] = (float) (((Class106_Sub1) this).anInt10058 & 0xff) / 255.0F;
		OpenGL.glFogfv(2918, aFloatArray10141, 0);
	}

	public Class161 method1912(int i, int i_854_, boolean bool, boolean bool_855_) {
		return new Class161_Sub2(this, i, i_854_, bool);
	}

	final void method9484(int i, boolean bool) {
		method9420(i, bool, true);
	}

	final void method9485() {
		if (((Class106_Sub1) this).anInt10066 != 1) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9422(null);
			method9389(-2);
			method9454(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 1;
		}
	}

	public void method1890(int i, int i_856_, int i_857_, int i_858_, int i_859_, int i_860_, int i_861_, int i_862_, int i_863_) {
		if (i != i_857_ || i_856_ != i_858_) {
			method9418();
			method9456(i_860_);
			float f = (float) i_857_ - (float) i;
			float f_864_ = (float) i_858_ - (float) i_856_;
			float f_865_ = (float) (1.0 / Math.sqrt((double) (f * f + f_864_ * f_864_)));
			f *= f_865_;
			f_864_ *= f_865_;
			OpenGL.glColor4ub((byte) (i_859_ >> 16), (byte) (i_859_ >> 8), (byte) i_859_, (byte) (i_859_ >> 24));
			i_863_ %= i_862_ + i_861_;
			float f_866_ = f * (float) i_861_;
			float f_867_ = f_864_ * (float) i_861_;
			float f_868_ = 0.0F;
			float f_869_ = 0.0F;
			float f_870_ = f_866_;
			float f_871_ = f_867_;
			if (i_863_ > i_861_) {
				f_868_ = f * (float) (i_861_ + i_862_ - i_863_);
				f_869_ = f_864_ * (float) (i_861_ + i_862_ - i_863_);
			} else {
				f_870_ = f * (float) (i_861_ - i_863_);
				f_871_ = f_864_ * (float) (i_861_ - i_863_);
			}
			float f_872_ = (float) i + 0.35F + f_868_;
			float f_873_ = (float) i_856_ + 0.35F + f_869_;
			float f_874_ = f * (float) i_862_;
			float f_875_ = f_864_ * (float) i_862_;
			for (;;) {
				if (i_857_ > i) {
					if (f_872_ > (float) i_857_ + 0.35F)
						break;
					if (f_872_ + f_870_ > (float) i_857_)
						f_870_ = (float) i_857_ - f_872_;
				} else {
					if (f_872_ < (float) i_857_ + 0.35F)
						break;
					if (f_872_ + f_870_ < (float) i_857_)
						f_870_ = (float) i_857_ - f_872_;
				}
				if (i_858_ > i_856_) {
					if (f_873_ > (float) i_858_ + 0.35F)
						break;
					if (f_873_ + f_871_ > (float) i_858_)
						f_871_ = (float) i_858_ - f_873_;
				} else {
					if (f_873_ < (float) i_858_ + 0.35F)
						break;
					if (f_873_ + f_871_ < (float) i_858_)
						f_871_ = (float) i_858_ - f_873_;
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_872_, f_873_);
				OpenGL.glVertex2f(f_872_ + f_870_, f_873_ + f_871_);
				OpenGL.glEnd();
				f_872_ += f_874_ + f_870_;
				f_873_ += f_875_ + f_871_;
				f_870_ = f_866_;
				f_871_ = f_867_;
			}
		}
	}

	final void method9486() {
		if (((Class106_Sub1) this).anInt10066 != 2) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9389(-2);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 2;
		}
	}

	final void method9487() {
		if (((Class106_Sub1) this).anInt10066 != 2) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9389(-2);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 2;
		}
	}

	final void method9488() {
		if (((Class106_Sub1) this).anInt10066 != 4) {
			method9388();
			method9428(false);
			method9429(false);
			method9431(false);
			method9432(false);
			method9389(-2);
			method9456(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 4;
		}
	}

	final void method9489() {
		if (((Class106_Sub1) this).anInt10066 != 8) {
			method9494();
			method9428(true);
			method9431(true);
			method9432(true);
			method9456(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 8;
		}
	}

	final void method9490() {
		if (((Class106_Sub1) this).anInt10066 != 8) {
			method9494();
			method9428(true);
			method9431(true);
			method9432(true);
			method9456(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 8;
		}
	}

	void method1881(int i, int i_876_, int i_877_, int i_878_, int i_879_) {
		method9418();
		method9456(i_879_);
		float f = (float) i + 0.35F;
		float f_880_ = (float) i_876_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_878_ >> 16), (byte) (i_878_ >> 8), (byte) i_878_, (byte) (i_878_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_880_);
		OpenGL.glVertex2f(f + (float) i_877_, f_880_);
		OpenGL.glEnd();
	}

	public Class103 method1956(Class103 class103, Class103 class103_881_, float f, Class103 class103_882_) {
		if (class103 != null && class103_881_ != null && ((Class106_Sub1) this).aBool10074 && ((Class106_Sub1) this).aBool10124) {
			Class103_Sub2_Sub1 class103_sub2_sub1 = null;
			Class103_Sub2 class103_sub2 = (Class103_Sub2) class103;
			Class103_Sub2 class103_sub2_883_ = (Class103_Sub2) class103_881_;
			Class155_Sub3 class155_sub3 = class103_sub2.method9851();
			Class155_Sub3 class155_sub3_884_ = class103_sub2_883_.method9851();
			if (class155_sub3 != null && class155_sub3_884_ != null) {
				int i = ((((Class155_Sub3) class155_sub3).anInt9644 > ((Class155_Sub3) class155_sub3_884_).anInt9644) ? ((Class155_Sub3) class155_sub3).anInt9644 : ((Class155_Sub3) class155_sub3_884_).anInt9644);
				if (class103 != class103_882_ && class103_881_ != class103_882_ && class103_882_ instanceof Class103_Sub2_Sub1) {
					Class103_Sub2_Sub1 class103_sub2_sub1_885_ = (Class103_Sub2_Sub1) class103_882_;
					if (class103_sub2_sub1_885_.method10106() == i)
						class103_sub2_sub1 = class103_sub2_sub1_885_;
				}
				if (class103_sub2_sub1 == null)
					class103_sub2_sub1 = new Class103_Sub2_Sub1(this, i);
				if (class103_sub2_sub1.method10109(class155_sub3, class155_sub3_884_, f))
					return class103_sub2_sub1;
			}
		}
		return f < 0.5F ? class103 : class103_881_;
	}

	final void method9491(float f, float f_886_, float f_887_) {
		OpenGL.glMatrixMode(5890);
		if (((Class106_Sub1) this).aBool10114)
			OpenGL.glLoadIdentity();
		OpenGL.glTranslatef(f, f_886_, f_887_);
		OpenGL.glMatrixMode(5888);
		((Class106_Sub1) this).aBool10114 = true;
	}

	final void method9492() {
		OpenGL.glPushMatrix();
	}

	public void method1945(Class105 class105) {
		((Class106_Sub1) this).aClass153_10042.method2506(this, class105);
	}

	public void method1942(int i, Class572_Sub36[] class572_sub36s) {
		for (int i_888_ = 0; i_888_ < i; i_888_++)
			((Class106_Sub1) this).aClass572_Sub36Array10041[i_888_] = class572_sub36s[i_888_];
		((Class106_Sub1) this).anInt10097 = i;
		if (((Class106_Sub1) this).anInt10087 != 1)
			method9403();
	}

	void method9493() {
		method9382();
	}

	public void method1995(int i, int i_889_, float f, int i_890_, int i_891_, float f_892_, int i_893_, int i_894_, float f_895_, int i_896_, int i_897_, int i_898_, int i_899_) {
		method9418();
		method9456(i_899_);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_896_ >> 16), (byte) (i_896_ >> 8), (byte) i_896_, (byte) (i_896_ >> 24));
		OpenGL.glVertex3f((float) i + 0.35F, (float) i_889_ + 0.35F, f);
		OpenGL.glColor4ub((byte) (i_897_ >> 16), (byte) (i_897_ >> 8), (byte) i_897_, (byte) (i_897_ >> 24));
		OpenGL.glVertex3f((float) i_890_ + 0.35F, (float) i_891_ + 0.35F, f_892_);
		OpenGL.glColor4ub((byte) (i_898_ >> 16), (byte) (i_898_ >> 8), (byte) i_898_, (byte) (i_898_ >> 24));
		OpenGL.glVertex3f((float) i_893_ + 0.35F, (float) i_894_ + 0.35F, f_895_);
		OpenGL.glEnd();
	}

	final void method9494() {
		if (((Class106_Sub1) this).anInt10087 != 2) {
			((Class106_Sub1) this).anInt10087 = 2;
			method9402(((Class106_Sub1) this).aClass250_10079.aFloatArray2728);
			method9398();
			method9482();
			method9394();
			((Class106_Sub1) this).anInt10066 &= ~0x7;
		}
	}

	public boolean method1818() {
		return true;
	}

	final void method9495() {
		OpenGL.glPopMatrix();
	}

	public Interface11 method1694(int i, int i_900_) {
		return new Class572_Sub12_Sub3(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_900_);
	}

	void method9496() {
		if (((Class106_Sub1) this).aBool9994 && !((Class106_Sub1) this).aBool10110)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	public void method1897(int i, int i_901_, int i_902_, int i_903_, int i_904_, int i_905_, Class167 class167, int i_906_, int i_907_, int i_908_, int i_909_, int i_910_) {
		if (i != i_902_ || i_901_ != i_903_) {
			Class167_Sub2 class167_sub2 = (Class167_Sub2) class167;
			Class155_Sub4_Sub1 class155_sub4_sub1 = ((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916;
			method9419();
			method9422(((Class167_Sub2) class167_sub2).aClass155_Sub4_Sub1_10916);
			method9456(i_905_);
			method9434(7681, 8448);
			method9423(0, 34167, 768);
			float f = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11234 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11236));
			float f_911_ = (((Class155_Sub4_Sub1) class155_sub4_sub1).aFloat11231 / (float) (((Class155_Sub4_Sub1) class155_sub4_sub1).anInt11232));
			float f_912_ = (float) i_902_ - (float) i;
			float f_913_ = (float) i_903_ - (float) i_901_;
			float f_914_ = (float) (1.0 / Math.sqrt((double) (f_912_ * f_912_ + f_913_ * f_913_)));
			f_912_ *= f_914_;
			f_913_ *= f_914_;
			OpenGL.glColor4ub((byte) (i_904_ >> 16), (byte) (i_904_ >> 8), (byte) i_904_, (byte) (i_904_ >> 24));
			i_910_ %= i_909_ + i_908_;
			float f_915_ = f_912_ * (float) i_908_;
			float f_916_ = f_913_ * (float) i_908_;
			float f_917_ = 0.0F;
			float f_918_ = 0.0F;
			float f_919_ = f_915_;
			float f_920_ = f_916_;
			if (i_910_ > i_908_) {
				f_917_ = f_912_ * (float) (i_908_ + i_909_ - i_910_);
				f_918_ = f_913_ * (float) (i_908_ + i_909_ - i_910_);
			} else {
				f_919_ = f_912_ * (float) (i_908_ - i_910_);
				f_920_ = f_913_ * (float) (i_908_ - i_910_);
			}
			float f_921_ = (float) i + 0.35F + f_917_;
			float f_922_ = (float) i_901_ + 0.35F + f_918_;
			float f_923_ = f_912_ * (float) i_909_;
			float f_924_ = f_913_ * (float) i_909_;
			for (;;) {
				if (i_902_ > i) {
					if (f_921_ > (float) i_902_ + 0.35F)
						break;
					if (f_921_ + f_919_ > (float) i_902_)
						f_919_ = (float) i_902_ - f_921_;
				} else {
					if (f_921_ < (float) i_902_ + 0.35F)
						break;
					if (f_921_ + f_919_ < (float) i_902_)
						f_919_ = (float) i_902_ - f_921_;
				}
				if (i_903_ > i_901_) {
					if (f_922_ > (float) i_903_ + 0.35F)
						break;
					if (f_922_ + f_920_ > (float) i_903_)
						f_920_ = (float) i_903_ - f_922_;
				} else {
					if (f_922_ < (float) i_903_ + 0.35F)
						break;
					if (f_922_ + f_920_ < (float) i_903_)
						f_920_ = (float) i_903_ - f_922_;
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_921_ - (float) i_906_), f_911_ * (f_922_ - (float) i_907_));
				OpenGL.glVertex2f(f_921_, f_922_);
				OpenGL.glTexCoord2f(f * (f_921_ + f_919_ - (float) i_906_), f_911_ * (f_922_ + f_920_ - (float) i_907_));
				OpenGL.glVertex2f(f_921_ + f_919_, f_922_ + f_920_);
				OpenGL.glEnd();
				f_921_ += f_923_ + f_919_;
				f_922_ += f_924_ + f_920_;
				f_919_ = f_915_;
				f_920_ = f_916_;
			}
			method9423(0, 5890, 768);
		}
	}

	public boolean method1671() {
		return true;
	}

	final void method9497() {
		OpenGL.glDepthMask(((Class106_Sub1) this).aBool10083 && ((Class106_Sub1) this).aBool10118);
	}

	void method1678(int i, int i_925_, int i_926_, int i_927_, int i_928_) {
		method9418();
		method9456(i_928_);
		float f = (float) i + 0.35F;
		float f_929_ = (float) i_925_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_927_ >> 16), (byte) (i_927_ >> 8), (byte) i_927_, (byte) (i_927_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_929_);
		OpenGL.glVertex2f(f, f_929_ + (float) i_926_);
		OpenGL.glEnd();
	}

	public int method1756(int i, int i_930_) {
		return i & i_930_ ^ i_930_;
	}

	void method9498() {
		if (((Class106_Sub1) this).aBool10127 && ((Class106_Sub1) this).anInt10129 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	public void method1865() {
		((Class106_Sub1) this).anInt10104 = 0;
		((Class106_Sub1) this).anInt10105 = 0;
		((Class106_Sub1) this).anInt10106 = aClass104_1410.method1648();
		((Class106_Sub1) this).anInt10107 = aClass104_1410.method1646();
		method9482();
	}

	public Class572_Sub35 method1739(int i) {
		Class572_Sub35_Sub2 class572_sub35_sub2 = new Class572_Sub35_Sub2(i);
		((Class106_Sub1) this).aClass675_10130.method7940(class572_sub35_sub2, -1452644536);
		return class572_sub35_sub2;
	}

	public void method2004(int i, int i_931_, int i_932_, int i_933_) {
		((Class106_Sub1) this).anInt10104 = i;
		((Class106_Sub1) this).anInt10105 = i_931_;
		((Class106_Sub1) this).anInt10106 = i_932_;
		((Class106_Sub1) this).anInt10107 = i_933_;
		method9482();
	}

	public boolean method1820() {
		return true;
	}

	public final boolean method1807() {
		if (((Class106_Sub1) this).aClass572_Sub32_Sub2_10039 != null) {
			if (!((Class106_Sub1) this).aClass572_Sub32_Sub2_10039.method8684()) {
				if (((Class106_Sub1) this).aClass135_10038.method2322(((Class106_Sub1) this).aClass572_Sub32_Sub2_10039))
					((Class106_Sub1) this).aClass168_10036.method2688();
				else
					return false;
			}
			return true;
		}
		return false;
	}

	public final void method1946(int[] is) {
		is[0] = ((Class106_Sub1) this).anInt10187;
		is[1] = ((Class106_Sub1) this).anInt10098;
		is[2] = ((Class106_Sub1) this).anInt10101;
		is[3] = ((Class106_Sub1) this).anInt10099;
	}

	public final void method1970(int i, int i_934_) {
		if (((Class106_Sub1) this).aClass135_10038 != null)
			((Class106_Sub1) this).aClass135_10038.method2323(i, i_934_);
	}

	final void method9499() {
		if (((Class106_Sub1) this).anInt10066 != 8) {
			method9494();
			method9428(true);
			method9431(true);
			method9432(true);
			method9456(1);
			method9438((byte) 0);
			((Class106_Sub1) this).anInt10066 = 8;
		}
	}

	public Class104_Sub1 method2040() {
		return new Class104_Sub1_Sub1(this);
	}
}

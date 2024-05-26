package game;

/* Class106_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.Canvas;

public final class Class106_Sub3_Sub2 extends Class106_Sub3 {
	boolean aBool11076;
	Class675 aClass675_11077 = new Class675();
	Class675 aClass675_11078 = new Class675();
	Class675 aClass675_11079 = new Class675();
	Class675 aClass675_11080 = new Class675();
	Class675 aClass675_11081 = new Class675();
	Class675 aClass675_11082 = new Class675();
	Class675 aClass675_11083 = new Class675();
	long aLong11084;
	Class104_Sub1 aClass104_Sub1_11085;
	String aString11086;
	boolean aBool11087;
	int anInt11088;
	int anInt11089;
	Class601_Sub2[] aClass601_Sub2Array11090;
	OpenGL anOpenGL11091;
	int[] anIntArray11092;
	Class405_Sub2 aClass405_Sub2_11093;
	boolean aBool11094;
	String aString11095;
	float[] aFloatArray11096;
	int anInt11097;
	boolean aBool11098;
	boolean aBool11099;
	static final int anInt11100 = 3;
	boolean aBool11101;
	boolean aBool11102;
	boolean aBool11103;
	int[] anIntArray11104 = new int[1000];
	int anInt11105;
	Class601_Sub1 aClass601_Sub1_11106;
	boolean aBool11107;
	float[] aFloatArray11108;
	boolean aBool11109;
	Class161 aClass161_11110;
	boolean aBool11111;
	Class161 aClass161_11112;
	boolean aBool11113;
	int[] anIntArray11114;
	long[] aLongArray11115;
	int[] anIntArray11116;
	int anInt11117;
	boolean aBool11118;

	void method9594() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = aFloat10458 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = aFloat10458 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = aFloat10458 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	public Class406 method9619(String string) {
		byte[] is = method10120(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub1(this, class381);
	}

	public boolean method9575() {
		return ((Class106_Sub3_Sub2) this).aBool11107;
	}

	public boolean method9637() {
		return ((Class106_Sub3_Sub2) this).aBool11103;
	}

	void method1733(int i, int i_0_) throws Exception_Sub1 {
		aClass104_Sub2_1419.method9924();
		if (anInterface5_1408 != null)
			anInterface5_1408.method22((byte) 36);
	}

	public void method1859() {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
			if (((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 != null) {
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085.method39();
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			}
			OpenGL.glDeleteBuffersARB(3, (((Class106_Sub3_Sub2) this).anIntArray11114), 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub3_Sub2) this).anIntArray11114[i] = 0;
				if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
					((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
				}
			}
		} else {
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			((Class106_Sub3_Sub2) this).aClass161_11112 = null;
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	void method9738() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool10522) {
			method9670(anInt10511 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt10454 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_1_ = 16384 + i;
			OpenGL.glLightfv(i_1_, 4608, fs, 0);
			OpenGL.glLightf(i_1_, 4615, 0.0F);
			OpenGL.glLightf(i_1_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class106_Sub3_Sub2) this).anOpenGL11091.setSwapInterval(0);
		super.method9738();
	}

	void method1664(int i, int i_2_) throws Exception_Sub1 {
		aClass104_Sub2_1419.method9924();
		if (anInterface5_1408 != null)
			anInterface5_1408.method22((byte) -20);
	}

	final Interface46 method9690(boolean bool) {
		return new Class601_Sub1(this, Class88.aClass88_1217, bool);
	}

	void method1667() {
		super.method1667();
		if (((Class106_Sub3_Sub2) this).anOpenGL11091 != null) {
			((Class106_Sub3_Sub2) this).anOpenGL11091.method2578();
			((Class106_Sub3_Sub2) this).anOpenGL11091.release();
			((Class106_Sub3_Sub2) this).anOpenGL11091 = null;
		}
	}

	void method9812() {
		if (aBool10526) {
			int i = 0;
			int i_3_ = 0;
			if (anInt10506 == 0) {
				i = 0;
				i_3_ = 0;
			} else if (anInt10506 == 1) {
				i = 1;
				i_3_ = 0;
			} else if (anInt10506 == 2) {
				i = 1;
				i_3_ = 1;
			} else if (anInt10506 == 3) {
				i = 0;
				i_3_ = 1;
			}
			if (aClass376_10418 == Class376.aClass376_4569)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_3_);
			else if (aClass376_10418 == Class376.aClass376_4568)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_3_);
			else if (aClass376_10418 == Class376.aClass376_4567)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_3_);
			else if (aClass376_10418 == Class376.aClass376_4566)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_3_);
		} else if (aClass376_10418 == Class376.aClass376_4569) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass376_10418 == Class376.aClass376_4568) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass376_10418 == Class376.aClass376_4567) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	Class104_Sub2 method1692(Canvas canvas, int i, int i_4_) {
		return new Class104_Sub2_Sub1_Sub2(this, canvas);
	}

	public Class104_Sub1 method1693() {
		return new Class104_Sub1_Sub3_Sub1(this);
	}

	public Interface6 method2039(int i, int i_5_, Class171 class171, Class88 class88, int i_6_) {
		return new Class610(this, class171, class88, i, i_5_, i_6_);
	}

	public boolean method1844() {
		return true;
	}

	public Interface11 method1781(int i, int i_7_, int i_8_) {
		return new Class610(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_7_, i_8_);
	}

	public int[] method1696(int i, int i_9_, int i_10_, int i_11_) {
		int[] is = new int[i_10_ * i_11_];
		int i_12_ = aClass104_1410.method1646();
		for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
			OpenGL.glReadPixelsi(i, i_12_ - i_9_ - i_13_ - 1, i_10_, 1, 32993, ((Class106_Sub3_Sub2) this).anInt11105, is, i_13_ * i_10_);
		return is;
	}

	public void method2044() {
		if (aClass104_1410 != null) {
			int i = aClass104_1410.method1648();
			int i_14_ = aClass104_1410.method1646();
			if (i > 0 || i_14_ > 0) {
				int i_15_ = anInt10434;
				int i_16_ = anInt10435;
				int i_17_ = anInt10531;
				int i_18_ = anInt10437;
				method1975();
				int i_19_ = anInt10428;
				int i_20_ = anInt10429;
				int i_21_ = anInt10426;
				int i_22_ = anInt10427;
				method1714();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method9611();
				method9847(false);
				method9596(false);
				method9617(false);
				method9618(false);
				method9659(null);
				method9643(1);
				method9591(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_14_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method1715(i_19_, i_21_, i_20_, i_22_);
				method2004(i_15_, i_16_, i_17_, i_18_);
			}
		}
	}

	public boolean method1698() {
		return ((Class106_Sub3_Sub2) this).aBool11118;
	}

	public boolean method1699() {
		if (((Class106_Sub3_Sub2) this).aBool11118 && (((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11088]) != 0L)
			return false;
		return true;
	}

	void method9837() {
		if (aBool10452) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	final Interface46 method9625(boolean bool) {
		return new Class601_Sub1(this, Class88.aClass88_1217, bool);
	}

	public void method9702(Class250 class250, Class250 class250_23_, Class250 class250_24_) {
		OpenGL.glMatrixMode(5888);
		aClass250_10399.method3473(class250, class250_23_);
		OpenGL.glLoadMatrixf(aClass250_10399.aFloatArray2728, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class250_24_.aFloatArray2728, 0);
	}

	public void method1704(int i, int i_25_, int i_26_) {
		method2049();
		if (((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 == null)
			method10119(i_25_, i_26_);
		if (((Class106_Sub3_Sub2) this).aClass161_11110 == null)
			((Class106_Sub3_Sub2) this).aClass161_11110 = method1821(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), false);
		else
			((Class106_Sub3_Sub2) this).aClass161_11110.method2607(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 0, 0);
		method1661(((Class106_Sub3_Sub2) this).aClass104_Sub1_11085, -2131043853);
		method1719(1, -16777216);
		((Class106_Sub3_Sub2) this).aClass161_11110.method2597(anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553);
		OpenGL.glBindBufferARB(35051, (((Class106_Sub3_Sub2) this).anIntArray11114[((Class106_Sub3_Sub2) this).anInt11088]));
		OpenGL.glReadPixelsub(0, 0, anInt1414 * -2072806597, anInt1415 * -1374470803, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method1884(((Class106_Sub3_Sub2) this).aClass104_Sub1_11085, 1526516810);
		((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11088] = OpenGL.glFenceSync(37143, 0);
		((Class106_Sub3_Sub2) this).anIntArray11116[((Class106_Sub3_Sub2) this).anInt11088] = i;
		if (++((Class106_Sub3_Sub2) this).anInt11088 >= 3)
			((Class106_Sub3_Sub2) this).anInt11088 = 0;
		method1748();
	}

	void method9809() {
		OpenGL.glTexEnvi(8960, 34161, method10125(aClass373Array10403[anInt10367]));
	}

	public long method1705(int i, int i_27_) {
		return method10110(i, i_27_, null, null);
	}

	void method9839() {
		OpenGL.glActiveTexture(33984 + anInt10367);
	}

	long method10110(int i, int i_28_, int[] is, int[] is_29_) {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			if ((((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11117]) != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11117]);
				((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11117] = 0L;
			}
			OpenGL.glBindBufferARB(35051, (((Class106_Sub3_Sub2) this).anIntArray11114[((Class106_Sub3_Sub2) this).anInt11117]));
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_30_ = 0; i_30_ < i * i_28_; i_30_++)
					is[i_30_] = anUnsafe10377.getInt(l + (long) (i_30_ * 4));
				if (OpenGL.glUnmapBufferARB(35051)) {
					/* empty */
				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++((Class106_Sub3_Sub2) this).anInt11117 >= 3)
				((Class106_Sub3_Sub2) this).anInt11117 = 0;
			return l;
		}
		if (((Class106_Sub3_Sub2) this).aClass161_11112 == null)
			method10119(i, i_28_);
		if (((Class106_Sub3_Sub2) this).aClass161_11110 == null)
			((Class106_Sub3_Sub2) this).aClass161_11110 = method1821(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), false);
		else
			((Class106_Sub3_Sub2) this).aClass161_11110.method2607(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 0, 0);
		method1661(((Class106_Sub3_Sub2) this).aClass104_Sub1_11085, -1306575318);
		method1719(1, -16777216);
		((Class106_Sub3_Sub2) this).aClass161_11110.method2597(anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553);
		((Class106_Sub3_Sub2) this).aClass161_11112.method2592(0, 0, i, i_28_, is, is_29_, 0, i);
		method1884(((Class106_Sub3_Sub2) this).aClass104_Sub1_11085, 1099323782);
		return 0L;
	}

	public void method1706(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public void method2018() {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
			if (((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 != null) {
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085.method39();
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			}
			OpenGL.glDeleteBuffersARB(3, (((Class106_Sub3_Sub2) this).anIntArray11114), 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub3_Sub2) this).anIntArray11114[i] = 0;
				if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
					((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
				}
			}
		} else {
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			((Class106_Sub3_Sub2) this).aClass161_11112 = null;
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	boolean method9782(Class171 class171, Class88 class88) {
		return aBool10524;
	}

	public Class103 method1729(Class103 class103, Class103 class103_31_, float f, Class103 class103_32_) {
		return f < 0.5F ? class103 : class103_31_;
	}

	public void method1710(boolean bool) {
		/* empty */
	}

	final synchronized void method10111(long l) {
		Class572 class572 = new Class572();
		class572.hash = l * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11083.method7940(class572, -1961774991);
	}

	void method9675() {
		if (aClass104_1410 != null) {
			int i = anInt10438 + anInt10428;
			int i_33_ = anInt10424 + aClass104_1410.method1646() - anInt10427;
			int i_34_ = anInt10429 - anInt10428;
			int i_35_ = anInt10427 - anInt10426;
			if (i_34_ < 0)
				i_34_ = 0;
			if (i_35_ < 0)
				i_35_ = 0;
			OpenGL.glScissor(i, i_33_, i_34_, i_35_);
		}
	}

	void method9694() {
		if (aBool10541)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	Class106_Sub3_Sub2(OpenGL opengl, Canvas canvas, long l, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, Class248 class248, int i) {
		super(mapSize, interface5, interface35, interface36, interface37, class248, i, 1);
		((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090 = new Class601_Sub2[16];
		new MapBuffer();
		new MapBuffer();
		((Class106_Sub3_Sub2) this).aFloatArray11108 = new float[4];
		((Class106_Sub3_Sub2) this).aFloatArray11096 = new float[16];
		((Class106_Sub3_Sub2) this).aClass161_11110 = null;
		((Class106_Sub3_Sub2) this).aClass161_11112 = null;
		((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
		((Class106_Sub3_Sub2) this).anIntArray11114 = new int[3];
		((Class106_Sub3_Sub2) this).aLongArray11115 = new long[3];
		((Class106_Sub3_Sub2) this).anIntArray11116 = new int[3];
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		int[] is = new int[1];
		try {
			((Class106_Sub3_Sub2) this).anOpenGL11091 = opengl;
			((Class106_Sub3_Sub2) this).anOpenGL11091.method2577();
			((Class106_Sub3_Sub2) this).aString11095 = OpenGL.glGetString(7936).toLowerCase();
			((Class106_Sub3_Sub2) this).aString11086 = OpenGL.glGetString(7937).toLowerCase();
			if ((((Class106_Sub3_Sub2) this).aString11095.indexOf("microsoft") != -1) || ((Class106_Sub3_Sub2) this).aString11095.indexOf("brian paul") != -1 || (((Class106_Sub3_Sub2) this).aString11095.indexOf("mesa") != -1))
				throw new RuntimeException("");
			String string = OpenGL.glGetString(7938);
			String[] strings = Class104_Sub2.method9935(string.replace('.', ' '), ' ', 207597699);
			if (strings.length >= 2) {
				try {
					int i_36_ = Class97.method1565(strings[0], (byte) -66);
					int i_37_ = Class97.method1565(strings[1], (byte) -27);
					((Class106_Sub3_Sub2) this).anInt11097 = i_36_ * 10 + i_37_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			if (((Class106_Sub3_Sub2) this).anInt11097 < 12)
				throw new RuntimeException("");
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt10454 = is[0];
			if (anInt10454 < 2)
				throw new RuntimeException("");
			anInt10415 = 8;
			((Class106_Sub3_Sub2) this).aBool11098 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_vertex_buffer_object");
			aBool10522 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_multisample");
			aBool10526 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_EXT_blend_func_separate");
			((Class106_Sub3_Sub2) this).aBool11099 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_texture_rectangle");
			aBool10467 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_texture_cube_map");
			((Class106_Sub3_Sub2) this).aBool11111 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_texture_non_power_of_two");
			aBool10524 = true;
			((Class106_Sub3_Sub2) this).aBool11107 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_vertex_shader");
			((Class106_Sub3_Sub2) this).aBool11102 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_vertex_program");
			((Class106_Sub3_Sub2) this).aBool11103 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_fragment_shader");
			((Class106_Sub3_Sub2) this).aBool11101 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_fragment_program");
			aBool10519 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_EXT_framebuffer_object");
			aBool10525 = aBool10519;
			aBool10520 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_EXT_framebuffer_blit");
			aBool10521 = ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_EXT_framebuffer_multisample");
			((Class106_Sub3_Sub2) this).aBool11118 = (anUnsafe10377 != null && (((Class106_Sub3_Sub2) this).anInt11097 >= 32 || ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_sync")));
			((Class106_Sub3_Sub2) this).anIntArray11092 = new int[anInt10454];
			if (!method9575() || !method9637()) {
				if (!((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_multitexture"))
					throw new RuntimeException("");
				if (!((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_texture_env_combine"))
					throw new RuntimeException("");
			}
			Class589.aString7805.startsWith("mac");
			((Class106_Sub3_Sub2) this).anInt11105 = Stream.method2804() ? 33639 : 5121;
			if ((((Class106_Sub3_Sub2) this).aString11086.indexOf("radeon") != -1) || (((Class106_Sub3_Sub2) this).aString11095.indexOf("intel") != -1)) {
				int i_38_ = 0;
				boolean bool = (((Class106_Sub3_Sub2) this).aString11095.indexOf("intel") != -1);
				boolean bool_39_ = false;
				boolean bool_40_ = false;
				String[] strings_41_ = Class104_Sub2.method9935(((Class106_Sub3_Sub2) this).aString11086.replace('/', ' '), ' ', 207597699);
				for (int i_42_ = 0; i_42_ < strings_41_.length; i_42_++) {
					String string_43_ = strings_41_[i_42_];
					try {
						if (string_43_.length() <= 0)
							continue;
						if (string_43_.charAt(0) == 'x' && string_43_.length() >= 3 && Class513.method6089(string_43_.substring(1, 3), -214795675)) {
							string_43_ = string_43_.substring(1);
							bool_40_ = true;
						}
						if (string_43_.equals("hd")) {
							bool_39_ = true;
							continue;
						}
						if (string_43_.startsWith("hd")) {
							string_43_ = string_43_.substring(2);
							bool_39_ = true;
						}
						if (string_43_.length() < 4 || !Class513.method6089(string_43_.substring(0, 4), -1265143699))
							continue;
						i_38_ = Class97.method1565(string_43_.substring(0, 4), (byte) -55);
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (bool) {
					if (!bool_39_)
						aBool10519 = false;
				} else {
					if (!bool_40_ && !bool_39_) {
						if (i_38_ >= 7000 && i_38_ <= 7999)
							((Class106_Sub3_Sub2) this).aBool11098 = false;
						if (i_38_ >= 7000 && i_38_ <= 9250)
							aBool10524 = false;
					}
					((Class106_Sub3_Sub2) this).aBool11099 &= ((Class106_Sub3_Sub2) this).anOpenGL11091.method2576("GL_ARB_half_float_pixel");
					((Class106_Sub3_Sub2) this).aBool11094 = true;
				}
			}
			if (((Class106_Sub3_Sub2) this).aBool11098) {
				try {
					int[] is_44_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_44_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			} else
				throw new RuntimeException("");
			method1841(canvas, new Class104_Sub2_Sub1_Sub2(this, canvas, l), -1724564193);
			method1688(canvas, (byte) 13);
			method9800(32768, false);
			method9800(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method1666(-1556757828);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
	}

	public String method1964() {
		String string = "Caps: 4:";
		String string_45_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).anInt11105).append(string_45_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_45_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11098 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11102 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11101 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11107 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11103 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11099 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11111 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_45_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	void method9588() {
		if (aBool10442)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	public Class406 method9801(String string) {
		byte[] is = method10120(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub1(this, class381);
	}

	void method9624() {
		if (aBool10369 && !aBool10420)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method9748() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = aFloat10455 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = aFloat10455 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = aFloat10455 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = -aFloat10456 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = -aFloat10456 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = -aFloat10456 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	Class104_Sub2 method1833(Canvas canvas, int i, int i_46_) {
		return new Class104_Sub2_Sub1_Sub2(this, canvas);
	}

	void method9730() {
		if (aBool10442)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method9627() {
		/* empty */
	}

	void method9629() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass250_10392.aFloatArray2728, 0);
		int i;
		for (i = 0; i < anInt10459; i++) {
			Class572_Sub36 class572_sub36 = aClass572_Sub36Array10457[i];
			int i_47_ = class572_sub36.method8723(-1288611141);
			int i_48_ = 16386 + i;
			float f = class572_sub36.method8724((byte) 111) / 255.0F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) class572_sub36.method8720(-656678015);
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) class572_sub36.method8721((byte) -23);
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) class572_sub36.method8722(-1968125293);
			((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
			OpenGL.glLightfv(i_48_, 4611, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (i_47_ >> 16 & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (i_47_ >> 8 & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (i_47_ & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
			OpenGL.glLightfv(i_48_, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
			OpenGL.glLightf(i_48_, 4617, (1.0F / (float) (class572_sub36.method8752((byte) 43) * class572_sub36.method8752((byte) 103))));
			OpenGL.glEnable(i_48_);
		}
		for (/**/; i < anInt10388; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method9630(Class171 class171, Class88 class88) {
		return true;
	}

	public void method9761(Class250 class250) {
		float[] fs = class250.aFloatArray2728;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public final synchronized void method1805(int i) {
		try {
			method10124();
		} catch (Exception exception) {
			return;
		}
		int i_49_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub3_Sub2) this).aClass675_11078.method7928((byte) 8)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11078.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_49_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10386 -= class572_sub26.anInt9258 * -1945426987;
			if (i_49_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_49_ = 0;
			}
		}
		if (i_49_ > 0) {
			OpenGL.glDeleteBuffersARB(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_49_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11079.method7928((byte) -95)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11079.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_49_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10385 -= class572_sub26.anInt9258 * -1945426987;
			if (i_49_ == 1000) {
				OpenGL.glDeleteTextures(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_49_ = 0;
			}
		}
		if (i_49_ > 0) {
			OpenGL.glDeleteTextures(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_49_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11080.method7928((byte) -63)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11080.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_49_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_49_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_49_ = 0;
			}
		}
		if (i_49_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_49_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11081.method7928((byte) -126)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11081.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_49_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10387 -= class572_sub26.anInt9258 * -1945426987;
			if (i_49_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_49_ = 0;
			}
		}
		if (i_49_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_49_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			boolean bool = false;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) -34)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11082.method7928((byte) -85)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11082.method7920(-1945803963);
			OpenGL.glDeleteProgram((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11083.method7928((byte) -59)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11083.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) -106)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		if (method1669() > 100663296 && (Class69.method1067(-1893552041) > ((Class106_Sub3_Sub2) this).aLong11084 + 60000L)) {
			System.gc();
			((Class106_Sub3_Sub2) this).aLong11084 = Class69.method1067(-2122904156);
		}
		super.method1668(i);
	}

	final synchronized void method10112(int i) {
		LinkableInt class572_sub26 = new LinkableInt(i);
		((Class106_Sub3_Sub2) this).aClass675_11080.method7940(class572_sub26, -2085094993);
	}

	Interface43 method9760(Class171 class171, int i, int i_50_, boolean bool, byte[] is, int i_51_, int i_52_) {
		return new Class599_Sub2(this, class171, i, i_50_, bool, is, i_51_, i_52_);
	}

	Interface43 method9635(Class171 class171, int i, int i_53_, boolean bool, float[] fs, int i_54_, int i_55_) {
		return new Class599_Sub2(this, class171, i, i_53_, bool, fs, i_54_, i_55_);
	}

	Interface45 method9639(Class171 class171, Class88 class88, int i, int i_56_) {
		return new Class599_Sub2(this, class171, class88, i, i_56_);
	}

	Interface33 method9759(int i, boolean bool, int[][] is) {
		return new Class599_Sub1(this, i, bool, is);
	}

	Interface40 method9638(Class171 class171, int i, int i_57_, int i_58_, boolean bool, byte[] is) {
		return new Class599_Sub3(this, class171, i, i_57_, i_58_, bool, is);
	}

	public void method9642() {
		int i = ((Class106_Sub3_Sub2) this).anIntArray11092[anInt10367];
		if (i != 0) {
			((Class106_Sub3_Sub2) this).anIntArray11092[anInt10367] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method9656() {
		OpenGL.glActiveTexture(33984 + anInt10367);
	}

	void method9691() {
		OpenGL.glTexEnvi(8960, 34161, method10125(aClass373Array10403[anInt10367]));
	}

	void method9657() {
		OpenGL.glTexEnvi(8960, 34162, method10125(aClass373Array10469[anInt10367]));
	}

	final void method9646(int i, Class293 class293, boolean bool, boolean bool_59_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10123(class293));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_59_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_59_ ? 769 : 768);
	}

	Interface43 method9787(int i, int i_60_, boolean bool, int[] is, int i_61_, int i_62_) {
		return new Class599_Sub2(this, i, i_60_, bool, is, i_61_, i_62_);
	}

	final void method9655() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (anInt10471 & 0xff0000) / 1.671168E7F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (anInt10471 & 0xff00) / 65280.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (anInt10471 & 0xff) / 255.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = (float) (anInt10471 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	final synchronized void method10113(int i, int i_63_) {
		LinkableInt class572_sub26 = new LinkableInt(i_63_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11079.method7940(class572_sub26, -1991806040);
	}

	boolean method9631(Class171 class171, Class88 class88) {
		return aBool10524;
	}

	public void method9843(Class362 class362) {
		Class354[] class354s = class362.aClass354Array4440;
		int i = 0;
		boolean bool = false;
		boolean bool_64_ = false;
		boolean bool_65_ = false;
		for (int i_66_ = 0; i_66_ < class354s.length; i_66_++) {
			Class354 class354 = class354s[i_66_];
			Class601_Sub2 class601_sub2 = ((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i_66_];
			int i_67_ = 0;
			int i_68_ = class601_sub2.method9256();
			long l = class601_sub2.method7070();
			class601_sub2.method7069();
			for (int i_69_ = 0; i_69_ < class354.method4415(); i_69_++) {
				Class364 class364 = class354.method4416(i_69_);
				switch (class364.anInt4476) {
					case 8:
						OpenGL.glColorPointer(4, 5121, i_68_, l + (long) i_67_);
						bool = true;
						break;
					case 4:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(3, 5126, i_68_, l + (long) i_67_);
						break;
					case 7:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(4, 5126, i_68_, l + (long) i_67_);
						break;
					case 6:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(2, 5126, i_68_, l + (long) i_67_);
						break;
					case 9:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(1, 5126, i_68_, l + (long) i_67_);
						break;
					default:
						break;
					case 1:
						OpenGL.glNormalPointer(5126, i_68_, l + (long) i_67_);
						bool_64_ = true;
						break;
					case 5:
						OpenGL.glVertexPointer(3, 5126, i_68_, l + (long) i_67_);
						bool_65_ = true;
				}
				i_67_ += class364.anInt4466;
			}
		}
		if (((Class106_Sub3_Sub2) this).aBool11109 != bool_65_) {
			if (bool_65_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class106_Sub3_Sub2) this).aBool11109 = bool_65_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11076 != bool_64_) {
			if (bool_64_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class106_Sub3_Sub2) this).aBool11076 = bool_64_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11087 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class106_Sub3_Sub2) this).aBool11087 = bool;
		}
		if (((Class106_Sub3_Sub2) this).anInt11089 < i) {
			for (int i_70_ = ((Class106_Sub3_Sub2) this).anInt11089; i_70_ < i; i_70_++) {
				OpenGL.glClientActiveTexture(33984 + i_70_);
				OpenGL.glEnableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		} else if (((Class106_Sub3_Sub2) this).anInt11089 > i) {
			for (int i_71_ = i; i_71_ < ((Class106_Sub3_Sub2) this).anInt11089; i_71_++) {
				OpenGL.glClientActiveTexture(33984 + i_71_);
				OpenGL.glDisableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		}
	}

	void method9664() {
		if (aBool10483)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte10510 & 0xff) / 255.0F);
		if (anInt10511 > 1) {
			if (aByte10510 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method9665() {
		if (aBool10526) {
			int i = 0;
			int i_72_ = 0;
			if (anInt10506 == 0) {
				i = 0;
				i_72_ = 0;
			} else if (anInt10506 == 1) {
				i = 1;
				i_72_ = 0;
			} else if (anInt10506 == 2) {
				i = 1;
				i_72_ = 1;
			} else if (anInt10506 == 3) {
				i = 0;
				i_72_ = 1;
			}
			if (aClass376_10418 == Class376.aClass376_4569)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_72_);
			else if (aClass376_10418 == Class376.aClass376_4568)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_72_);
			else if (aClass376_10418 == Class376.aClass376_4567)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_72_);
			else if (aClass376_10418 == Class376.aClass376_4566)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_72_);
		} else if (aClass376_10418 == Class376.aClass376_4569) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass376_10418 == Class376.aClass376_4568) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass376_10418 == Class376.aClass376_4567) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	void method9666() {
		if (aBool10508)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method9669() {
		if (aBool10499 && aBool10498 && anInt10448 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	void method9668() {
		aFloat10504 = aFloat10425 - (float) anInt10398;
		aFloat10503 = aFloat10504 - (float) anInt10448;
		if (aFloat10503 < aFloat10464)
			aFloat10503 = aFloat10464;
		if (aBool10488) {
			OpenGL.glFogf(2915, aFloat10503);
			OpenGL.glFogf(2916, aFloat10504);
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (anInt10500 & 0xff0000) / 1.671168E7F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (anInt10500 & 0xff00) / 65280.0F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (anInt10500 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
		}
	}

	void method9670(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	final Interface44 method9723(boolean bool) {
		return new Class601_Sub2(this, bool);
	}

	final Interface46 method9671(boolean bool) {
		return new Class601_Sub1(this, Class88.aClass88_1217, bool);
	}

	Class362 method9672(Class354[] class354s) {
		return new Class362_Sub1(class354s);
	}

	void method9693(Interface46 interface46) {
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106 = (Class601_Sub1) interface46;
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7069();
	}

	public final void method9660(Class379 class379, int i, int i_73_) {
		int i_74_;
		int i_75_;
		if (class379 == Class379.aClass379_4590) {
			i_74_ = 1;
			i_75_ = i_73_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_74_ = 3;
			i_75_ = i_73_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_74_ = 4;
			i_75_ = i_73_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_74_ = 6;
			i_75_ = i_73_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_74_ = 5;
			i_75_ = i_73_ + 2;
		} else {
			i_74_ = 0;
			i_75_ = i_73_;
		}
		OpenGL.glDrawArrays(i_74_, i, i_75_);
	}

	void method9698() {
		if (aBool10541)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public final void method9652(Class379 class379, int i, int i_76_, int i_77_, int i_78_) {
		int i_79_;
		int i_80_;
		if (class379 == Class379.aClass379_4590) {
			i_79_ = 1;
			i_80_ = i_78_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_79_ = 3;
			i_80_ = i_78_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_79_ = 4;
			i_80_ = i_78_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_79_ = 6;
			i_80_ = i_78_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_79_ = 5;
			i_80_ = i_78_ + 2;
		} else {
			i_79_ = 0;
			i_80_ = i_78_;
		}
		Class88 class88 = ((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method263();
		OpenGL.glDrawElements(i_79_, i_80_, method10122(class88), (((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7070() + (long) (i_77_ * (class88.anInt1223 * -1071269501))));
	}

	public final synchronized void method1668(int i) {
		try {
			method10124();
		} catch (Exception exception) {
			return;
		}
		int i_81_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub3_Sub2) this).aClass675_11078.method7928((byte) -43)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11078.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_81_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10386 -= class572_sub26.anInt9258 * -1945426987;
			if (i_81_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_81_ = 0;
			}
		}
		if (i_81_ > 0) {
			OpenGL.glDeleteBuffersARB(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_81_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11079.method7928((byte) -89)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11079.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_81_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10385 -= class572_sub26.anInt9258 * -1945426987;
			if (i_81_ == 1000) {
				OpenGL.glDeleteTextures(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_81_ = 0;
			}
		}
		if (i_81_ > 0) {
			OpenGL.glDeleteTextures(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_81_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11080.method7928((byte) -30)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11080.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_81_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_81_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_81_ = 0;
			}
		}
		if (i_81_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_81_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11081.method7928((byte) -59)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11081.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_81_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10387 -= class572_sub26.anInt9258 * -1945426987;
			if (i_81_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_81_ = 0;
			}
		}
		if (i_81_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_81_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			boolean bool = false;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) -40)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11082.method7928((byte) -32)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11082.method7920(-1945803963);
			OpenGL.glDeleteProgram((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11083.method7928((byte) 12)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11083.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) 7)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		if (method1669() > 100663296 && (Class69.method1067(-1768110396) > ((Class106_Sub3_Sub2) this).aLong11084 + 60000L)) {
			System.gc();
			((Class106_Sub3_Sub2) this).aLong11084 = Class69.method1067(-1648260440);
		}
		super.method1668(i);
	}

	final synchronized void method10114(int i, int i_82_) {
		LinkableInt class572_sub26 = new LinkableInt(i_82_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11078.method7940(class572_sub26, -1682290014);
	}

	final synchronized void method10115(int i, int i_83_) {
		LinkableInt class572_sub26 = new LinkableInt(i_83_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11081.method7940(class572_sub26, -1979318906);
	}

	void method9806() {
		OpenGL.glMatrixMode(5890);
		if (aClass295Array10436[anInt10367] != Class295.aClass295_3462)
			OpenGL.glLoadMatrixf(aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub2) this).aFloatArray11096), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	public void method9796(Class250 class250) {
		float[] fs = class250.aFloatArray2728;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	final synchronized void method10116(long l) {
		Class572 class572 = new Class572();
		class572.hash = l * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11083.method7940(class572, -1954216948);
	}

	void method9768() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = aFloat10458 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = aFloat10458 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = aFloat10458 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	void method9578() {
		if (aBool10499 && aBool10498 && anInt10448 >= 0)
			OpenGL.glEnable(2912);
		else
			OpenGL.glDisable(2912);
	}

	static int method10117(Class171 class171) {
		switch (class171.anInt2065 * -660609339) {
			case 6:
				return 6410;
			case 8:
				return 6409;
			case 2:
				return 6406;
			case 4:
				return 6402;
			default:
				throw new IllegalStateException();
			case 0:
				return 6408;
			case 1:
				return 6407;
		}
	}

	static int method10118(Class171 class171, Class88 class88) {
		if (class88 == Class88.aClass88_1218) {
			switch (class171.anInt2065 * -660609339) {
				case 1:
					return 6407;
				default:
					throw new IllegalArgumentException();
				case 2:
					return 6406;
				case 7:
					return 33779;
				case 6:
					return 6410;
				case 3:
					return 33777;
				case 8:
					return 6409;
				case 0:
					return 6408;
			}
		}
		if (class88 == Class88.aClass88_1217) {
			switch (class171.anInt2065 * -660609339) {
				case 2:
					return 32830;
				case 4:
					return 33189;
				case 0:
					return 32859;
				default:
					throw new IllegalArgumentException();
				case 8:
					return 32834;
				case 1:
					return 32852;
				case 6:
					return 36219;
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
		if (class88 == Class88.aClass88_1219) {
			switch (class171.anInt2065 * -660609339) {
				default:
					throw new IllegalArgumentException();
				case 4:
					return 33191;
			}
		}
		if (class88 == Class88.aClass88_1220) {
			switch (class171.anInt2065 * -660609339) {
				default:
					throw new IllegalArgumentException();
				case 2:
					return 34844;
				case 6:
					return 34847;
				case 1:
					return 34843;
				case 8:
					return 34846;
				case 0:
					return 34842;
			}
		}
		if (class88 == Class88.aClass88_1213) {
			switch (class171.anInt2065 * -660609339) {
				case 6:
					return 34841;
				case 2:
					return 34838;
				case 1:
					return 34837;
				case 8:
					return 34840;
				case 0:
					return 34836;
				default:
					throw new IllegalArgumentException();
			}
		}
		throw new IllegalArgumentException();
	}

	public void method2037(boolean bool) {
		/* empty */
	}

	Interface33 method9792(int i, boolean bool, int[][] is) {
		return new Class599_Sub1(this, i, bool, is);
	}

	void method9686(int i) {
		if (!((Class106_Sub3_Sub2) this).aBool11113)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	public void method9706(Class362 class362) {
		Class354[] class354s = class362.aClass354Array4440;
		int i = 0;
		boolean bool = false;
		boolean bool_84_ = false;
		boolean bool_85_ = false;
		for (int i_86_ = 0; i_86_ < class354s.length; i_86_++) {
			Class354 class354 = class354s[i_86_];
			Class601_Sub2 class601_sub2 = ((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i_86_];
			int i_87_ = 0;
			int i_88_ = class601_sub2.method9256();
			long l = class601_sub2.method7070();
			class601_sub2.method7069();
			for (int i_89_ = 0; i_89_ < class354.method4415(); i_89_++) {
				Class364 class364 = class354.method4416(i_89_);
				switch (class364.anInt4476) {
					case 8:
						OpenGL.glColorPointer(4, 5121, i_88_, l + (long) i_87_);
						bool = true;
						break;
					case 4:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(3, 5126, i_88_, l + (long) i_87_);
						break;
					case 7:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(4, 5126, i_88_, l + (long) i_87_);
						break;
					case 6:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(2, 5126, i_88_, l + (long) i_87_);
						break;
					case 9:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(1, 5126, i_88_, l + (long) i_87_);
						break;
					default:
						break;
					case 1:
						OpenGL.glNormalPointer(5126, i_88_, l + (long) i_87_);
						bool_84_ = true;
						break;
					case 5:
						OpenGL.glVertexPointer(3, 5126, i_88_, l + (long) i_87_);
						bool_85_ = true;
				}
				i_87_ += class364.anInt4466;
			}
		}
		if (((Class106_Sub3_Sub2) this).aBool11109 != bool_85_) {
			if (bool_85_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class106_Sub3_Sub2) this).aBool11109 = bool_85_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11076 != bool_84_) {
			if (bool_84_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class106_Sub3_Sub2) this).aBool11076 = bool_84_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11087 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class106_Sub3_Sub2) this).aBool11087 = bool;
		}
		if (((Class106_Sub3_Sub2) this).anInt11089 < i) {
			for (int i_90_ = ((Class106_Sub3_Sub2) this).anInt11089; i_90_ < i; i_90_++) {
				OpenGL.glClientActiveTexture(33984 + i_90_);
				OpenGL.glEnableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		} else if (((Class106_Sub3_Sub2) this).anInt11089 > i) {
			for (int i_91_ = i; i_91_ < ((Class106_Sub3_Sub2) this).anInt11089; i_91_++) {
				OpenGL.glClientActiveTexture(33984 + i_91_);
				OpenGL.glDisableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		}
	}

	void method1743(int i, int i_92_) throws Exception_Sub1 {
		aClass104_Sub2_1419.method9924();
		if (anInterface5_1408 != null)
			anInterface5_1408.method22((byte) 7);
	}

	void method9835() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);
		if (aBool10522) {
			method9670(anInt10511 > 1);
			OpenGL.glDisable(32926);
		}
		for (int i = anInt10454 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_93_ = 16384 + i;
			OpenGL.glLightfv(i_93_, 4608, fs, 0);
			OpenGL.glLightf(i_93_, 4615, 0.0F);
			OpenGL.glLightf(i_93_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		((Class106_Sub3_Sub2) this).anOpenGL11091.setSwapInterval(0);
		super.method9738();
	}

	public void method2020() {
		OpenGL.glFinish();
	}

	void method1802() {
		super.method1667();
		if (((Class106_Sub3_Sub2) this).anOpenGL11091 != null) {
			((Class106_Sub3_Sub2) this).anOpenGL11091.method2578();
			((Class106_Sub3_Sub2) this).anOpenGL11091.release();
			((Class106_Sub3_Sub2) this).anOpenGL11091 = null;
		}
	}

	void method1803() {
		super.method1667();
		if (((Class106_Sub3_Sub2) this).anOpenGL11091 != null) {
			((Class106_Sub3_Sub2) this).anOpenGL11091.method2578();
			((Class106_Sub3_Sub2) this).anOpenGL11091.release();
			((Class106_Sub3_Sub2) this).anOpenGL11091 = null;
		}
	}

	public final synchronized void method1885(int i) {
		try {
			method10124();
		} catch (Exception exception) {
			return;
		}
		int i_94_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub3_Sub2) this).aClass675_11078.method7928((byte) -67)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11078.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_94_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10386 -= class572_sub26.anInt9258 * -1945426987;
			if (i_94_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_94_ = 0;
			}
		}
		if (i_94_ > 0) {
			OpenGL.glDeleteBuffersARB(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_94_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11079.method7928((byte) -112)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11079.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_94_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10385 -= class572_sub26.anInt9258 * -1945426987;
			if (i_94_ == 1000) {
				OpenGL.glDeleteTextures(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_94_ = 0;
			}
		}
		if (i_94_ > 0) {
			OpenGL.glDeleteTextures(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_94_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11080.method7928((byte) 6)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11080.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_94_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_94_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_94_ = 0;
			}
		}
		if (i_94_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_94_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11081.method7928((byte) -119)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11081.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_94_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10387 -= class572_sub26.anInt9258 * -1945426987;
			if (i_94_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_94_ = 0;
			}
		}
		if (i_94_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_94_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			boolean bool = false;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) -102)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11082.method7928((byte) -4)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11082.method7920(-1945803963);
			OpenGL.glDeleteProgram((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11083.method7928((byte) -38)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11083.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) -21)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		if (method1669() > 100663296 && (Class69.method1067(-1719606120) > ((Class106_Sub3_Sub2) this).aLong11084 + 60000L)) {
			System.gc();
			((Class106_Sub3_Sub2) this).aLong11084 = Class69.method1067(-2143742688);
		}
		super.method1668(i);
	}

	public boolean method1701() {
		return false;
	}

	public Class165 method1662() {
		int i = -1;
		if (((Class106_Sub3_Sub2) this).aString11095.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class106_Sub3_Sub2) this).aString11095.indexOf("intel") != -1)
			i = 32902;
		else if (((Class106_Sub3_Sub2) this).aString11095.indexOf("ati") != -1)
			i = 4098;
		return new Class165(i, method9713() ? "OpenGL FF" : "OpenGL", ((Class106_Sub3_Sub2) this).anInt11097, ((Class106_Sub3_Sub2) this).aString11086, 0L, method9713());
	}

	void method9766() {
		OpenGL.glDepthMask(aBool10536 && aBool10441);
	}

	void method10119(int i, int i_95_) {
		method2018();
		method1708(i, i_95_, 1736796262);
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			((Class106_Sub3_Sub2) this).aClass161_11112 = method1864(i, i_95_, false, true);
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = method1693();
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085.method9908(0, ((Class106_Sub3_Sub2) this).aClass161_11112.method2590());
			OpenGL.glGenBuffersARB(3, ((Class106_Sub3_Sub2) this).anIntArray11114, 0);
			for (int i_96_ = 0; i_96_ < 3; i_96_++) {
				OpenGL.glBindBufferARB(35051, (((Class106_Sub3_Sub2) this).anIntArray11114[i_96_]));
				OpenGL.glBufferDataARBa(35051, i * i_95_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			((Class106_Sub3_Sub2) this).aClass161_11112 = method1864(i, i_95_, false, true);
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = method1693();
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085.method9908(0, ((Class106_Sub3_Sub2) this).aClass161_11112.method2590());
		}
	}

	byte[] method10120(String string) {
		return method9775("gl", string);
	}

	public void method1832(boolean bool) {
		/* empty */
	}

	public boolean method1746() {
		return true;
	}

	public int[] method1834(int i, int i_97_, int i_98_, int i_99_) {
		int[] is = new int[i_98_ * i_99_];
		int i_100_ = aClass104_1410.method1646();
		for (int i_101_ = 0; i_101_ < i_99_; i_101_++)
			OpenGL.glReadPixelsi(i, i_100_ - i_97_ - i_101_ - 1, i_98_, 1, 32993, ((Class106_Sub3_Sub2) this).anInt11105, is, i_101_ * i_98_);
		return is;
	}

	public int[] method1780(int i, int i_102_, int i_103_, int i_104_) {
		int[] is = new int[i_103_ * i_104_];
		int i_105_ = aClass104_1410.method1646();
		for (int i_106_ = 0; i_106_ < i_104_; i_106_++)
			OpenGL.glReadPixelsi(i, i_105_ - i_102_ - i_106_ - 1, i_103_, 1, 32993, ((Class106_Sub3_Sub2) this).anInt11105, is, i_106_ * i_103_);
		return is;
	}

	public int[] method1836(int i, int i_107_, int i_108_, int i_109_) {
		int[] is = new int[i_108_ * i_109_];
		int i_110_ = aClass104_1410.method1646();
		for (int i_111_ = 0; i_111_ < i_109_; i_111_++)
			OpenGL.glReadPixelsi(i, i_110_ - i_107_ - i_111_ - 1, i_108_, 1, 32993, ((Class106_Sub3_Sub2) this).anInt11105, is, i_111_ * i_108_);
		return is;
	}

	public boolean method9793() {
		return ((Class106_Sub3_Sub2) this).aBool11107;
	}

	public void method1874(int i, int i_112_) {
		int i_113_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_112_ & 0xff0000) / 1.671168E7F, (float) (i_112_ & 0xff00) / 65280.0F, (float) (i_112_ & 0xff) / 255.0F, (float) (i_112_ >>> 24) / 255.0F);
			i_113_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method9618(true);
			i_113_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_113_ |= 0x400;
		OpenGL.glClear(i_113_);
	}

	public boolean method1840() {
		if (((Class106_Sub3_Sub2) this).aBool11118 && (((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11088]) != 0L)
			return false;
		return true;
	}

	public boolean method2047() {
		if (((Class106_Sub3_Sub2) this).aBool11118 && (((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11088]) != 0L)
			return false;
		return true;
	}

	public boolean method1823() {
		if (((Class106_Sub3_Sub2) this).aBool11118 && (((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11088]) != 0L)
			return false;
		return true;
	}

	public boolean method1843() {
		return true;
	}

	void method9744() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = aFloat10458 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = aFloat10458 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = aFloat10458 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightModelfv(2899, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	public final synchronized void method1806(int i) {
		try {
			method10124();
		} catch (Exception exception) {
			return;
		}
		int i_114_ = 0;
		i &= 0x7fffffff;
		while (!((Class106_Sub3_Sub2) this).aClass675_11078.method7928((byte) 6)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11078.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_114_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10386 -= class572_sub26.anInt9258 * -1945426987;
			if (i_114_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_114_ = 0;
			}
		}
		if (i_114_ > 0) {
			OpenGL.glDeleteBuffersARB(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_114_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11079.method7928((byte) -105)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11079.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_114_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10385 -= class572_sub26.anInt9258 * -1945426987;
			if (i_114_ == 1000) {
				OpenGL.glDeleteTextures(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_114_ = 0;
			}
		}
		if (i_114_ > 0) {
			OpenGL.glDeleteTextures(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_114_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11080.method7928((byte) -45)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11080.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_114_++] = class572_sub26.anInt9258 * -1945426987;
			if (i_114_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_114_ = 0;
			}
		}
		if (i_114_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			i_114_ = 0;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11081.method7928((byte) -116)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11081.method7920(-1945803963);
			((Class106_Sub3_Sub2) this).anIntArray11104[i_114_++] = (int) (class572_sub26.hash * 381237825124074065L);
			anInt10387 -= class572_sub26.anInt9258 * -1945426987;
			if (i_114_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
				i_114_ = 0;
			}
		}
		if (i_114_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_114_, (((Class106_Sub3_Sub2) this).anIntArray11104), 0);
			boolean bool = false;
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) -109)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11082.method7928((byte) -119)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11082.method7920(-1945803963);
			OpenGL.glDeleteProgram((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11083.method7928((byte) -66)) {
			Class572 class572 = ((Class106_Sub3_Sub2) this).aClass675_11083.method7920(-1945803963);
			OpenGL.glDeleteShader((int) (class572.hash * 381237825124074065L));
		}
		while (!((Class106_Sub3_Sub2) this).aClass675_11077.method7928((byte) -8)) {
			LinkableInt class572_sub26 = (LinkableInt) ((Class106_Sub3_Sub2) this).aClass675_11077.method7920(-1945803963);
			OpenGL.glDeleteLists((int) (class572_sub26.hash * 381237825124074065L), class572_sub26.anInt9258 * -1945426987);
		}
		if (method1669() > 100663296 && (Class69.method1067(-2043661780) > ((Class106_Sub3_Sub2) this).aLong11084 + 60000L)) {
			System.gc();
			((Class106_Sub3_Sub2) this).aLong11084 = Class69.method1067(-2053865414);
		}
		super.method1668(i);
	}

	public boolean method1846() {
		return false;
	}

	final synchronized void method10121(int i) {
		Class572 class572 = new Class572();
		class572.hash = (long) i * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11082.method7940(class572, -1882769718);
	}

	public int method1848() {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			if ((((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11117]) == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync((((Class106_Sub3_Sub2) this).aLongArray11115[(((Class106_Sub3_Sub2) this).anInt11117)]), 0, 0);
			if (i == 37149) {
				method1703();
				return -1;
			}
			return (i != 37147 ? (((Class106_Sub3_Sub2) this).anIntArray11116[((Class106_Sub3_Sub2) this).anInt11117]) : -1);
		}
		return -1;
	}

	public void method1827(int i, int i_115_, int i_116_) {
		method2049();
		if (((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 == null)
			method10119(i_115_, i_116_);
		if (((Class106_Sub3_Sub2) this).aClass161_11110 == null)
			((Class106_Sub3_Sub2) this).aClass161_11110 = method1821(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), false);
		else
			((Class106_Sub3_Sub2) this).aClass161_11110.method2607(0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), 0, 0);
		method1661(((Class106_Sub3_Sub2) this).aClass104_Sub1_11085, 82964512);
		method1719(1, -16777216);
		((Class106_Sub3_Sub2) this).aClass161_11110.method2597(anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553);
		OpenGL.glBindBufferARB(35051, (((Class106_Sub3_Sub2) this).anIntArray11114[((Class106_Sub3_Sub2) this).anInt11088]));
		OpenGL.glReadPixelsub(0, 0, anInt1414 * -2072806597, anInt1415 * -1374470803, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method1884(((Class106_Sub3_Sub2) this).aClass104_Sub1_11085, 1618312468);
		((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11088] = OpenGL.glFenceSync(37143, 0);
		((Class106_Sub3_Sub2) this).anIntArray11116[((Class106_Sub3_Sub2) this).anInt11088] = i;
		if (++((Class106_Sub3_Sub2) this).anInt11088 >= 3)
			((Class106_Sub3_Sub2) this).anInt11088 = 0;
		method1748();
	}

	public void method1703() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
				((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
			}
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	public void method1880() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
				((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
			}
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	public void method1852() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
				((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
			}
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	public long method1853(int i, int i_117_) {
		return method10110(i, i_117_, null, null);
	}

	public long method1854(int i, int i_118_) {
		return method10110(i, i_118_, null, null);
	}

	public void method1855(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public void method1856(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {
				/* empty */
			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	public void method1857(int i, int i_119_, int[] is, int[] is_120_) {
		method10110(i, i_119_, is, is_120_);
	}

	public void method1858() {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
			if (((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 != null) {
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085.method39();
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			}
			OpenGL.glDeleteBuffersARB(3, (((Class106_Sub3_Sub2) this).anIntArray11114), 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub3_Sub2) this).anIntArray11114[i] = 0;
				if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
					((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
				}
			}
		} else {
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			((Class106_Sub3_Sub2) this).aClass161_11112 = null;
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	void method9769() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = aFloat10455 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = aFloat10455 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = aFloat10455 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = -aFloat10456 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = -aFloat10456 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = -aFloat10456 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	public void method1860() {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
			if (((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 != null) {
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085.method39();
				((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			}
			OpenGL.glDeleteBuffersARB(3, (((Class106_Sub3_Sub2) this).anIntArray11114), 0);
			for (int i = 0; i < 3; i++) {
				((Class106_Sub3_Sub2) this).anIntArray11114[i] = 0;
				if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
					OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
					((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
				}
			}
		} else {
			((Class106_Sub3_Sub2) this).aClass104_Sub1_11085 = null;
			((Class106_Sub3_Sub2) this).aClass161_11112 = null;
			((Class106_Sub3_Sub2) this).aClass161_11110 = null;
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	public Class103 method1956(Class103 class103, Class103 class103_121_, float f, Class103 class103_122_) {
		return f < 0.5F ? class103 : class103_121_;
	}

	public Class103 method1900(Class103 class103, Class103 class103_123_, float f, Class103 class103_124_) {
		return f < 0.5F ? class103 : class103_123_;
	}

	public Interface11 method2001(int i, int i_125_) {
		return new Class610(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_125_);
	}

	public Interface11 method1810(int i, int i_126_) {
		return new Class610(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_126_);
	}

	Interface43 method9634(Class171 class171, Class88 class88, int i, int i_127_) {
		return method9639(class171, class88, i, i_127_);
	}

	public Class165 method2011() {
		int i = -1;
		if (((Class106_Sub3_Sub2) this).aString11095.indexOf("nvidia") != -1)
			i = 4318;
		else if (((Class106_Sub3_Sub2) this).aString11095.indexOf("intel") != -1)
			i = 32902;
		else if (((Class106_Sub3_Sub2) this).aString11095.indexOf("ati") != -1)
			i = 4098;
		return new Class165(i, method9713() ? "OpenGL FF" : "OpenGL", ((Class106_Sub3_Sub2) this).anInt11097, ((Class106_Sub3_Sub2) this).aString11086, 0L, method9713());
	}

	public void method9703(Class250 class250, Class250 class250_128_, Class250 class250_129_) {
		OpenGL.glMatrixMode(5888);
		aClass250_10399.method3473(class250, class250_128_);
		OpenGL.glLoadMatrixf(aClass250_10399.aFloatArray2728, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class250_129_.aFloatArray2728, 0);
	}

	public Interface6 method2000(int i, int i_130_, Class171 class171, Class88 class88, int i_131_) {
		return new Class610(this, class171, class88, i, i_130_, i_131_);
	}

	public Class104_Sub1 method2040() {
		return new Class104_Sub1_Sub3_Sub1(this);
	}

	final Interface44 method9689(boolean bool) {
		return new Class601_Sub2(this, bool);
	}

	public boolean method9818() {
		return ((Class106_Sub3_Sub2) this).aBool11107;
	}

	public boolean method9724() {
		return ((Class106_Sub3_Sub2) this).aBool11107;
	}

	public boolean method9725() {
		return ((Class106_Sub3_Sub2) this).aBool11103;
	}

	public boolean method9726(boolean bool) {
		return true;
	}

	public boolean method9727(boolean bool) {
		return true;
	}

	final void method9696() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (anInt10471 & 0xff0000) / 1.671168E7F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (anInt10471 & 0xff00) / 65280.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (anInt10471 & 0xff) / 255.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = (float) (anInt10471 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	public Class406 method9632(String string) {
		byte[] is = method10120(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub1(this, class381);
	}

	public Class406 method9729(String string) {
		byte[] is = method10120(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub1(this, class381);
	}

	final Interface44 method9710(boolean bool) {
		return new Class601_Sub2(this, bool);
	}

	Interface45 method9795(Class171 class171, Class88 class88, int i, int i_132_) {
		return new Class599_Sub2(this, class171, class88, i, i_132_);
	}

	public void method9732(Class250 class250, Class250 class250_133_, Class250 class250_134_) {
		OpenGL.glMatrixMode(5888);
		aClass250_10399.method3473(class250, class250_133_);
		OpenGL.glLoadMatrixf(aClass250_10399.aFloatArray2728, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class250_134_.aFloatArray2728, 0);
	}

	public Interface6 method2021(int i, int i_135_, Class171 class171, Class88 class88, int i_136_) {
		return new Class610(this, class171, class88, i, i_135_, i_136_);
	}

	public float method9747() {
		return 0.0F;
	}

	void method9700() {
		if (aClass104_1410 != null)
			OpenGL.glViewport(anInt10438 + anInt10434, (anInt10424 + aClass104_1410.method1646() - anInt10435 - anInt10437), anInt10531, anInt10437);
		OpenGL.glDepthRange(aFloat10364, aFloat10421);
	}

	void method9751() {
		if (aClass104_1410 != null)
			OpenGL.glViewport(anInt10438 + anInt10434, (anInt10424 + aClass104_1410.method1646() - anInt10435 - anInt10437), anInt10531, anInt10437);
		OpenGL.glDepthRange(aFloat10364, aFloat10421);
	}

	void method9752() {
		if (aClass104_1410 != null)
			OpenGL.glViewport(anInt10438 + anInt10434, (anInt10424 + aClass104_1410.method1646() - anInt10435 - anInt10437), anInt10531, anInt10437);
		OpenGL.glDepthRange(aFloat10364, aFloat10421);
	}

	void method9720() {
		if (aClass104_1410 != null) {
			int i = anInt10438 + anInt10428;
			int i_137_ = anInt10424 + aClass104_1410.method1646() - anInt10427;
			int i_138_ = anInt10429 - anInt10428;
			int i_139_ = anInt10427 - anInt10426;
			if (i_138_ < 0)
				i_138_ = 0;
			if (i_139_ < 0)
				i_139_ = 0;
			OpenGL.glScissor(i, i_137_, i_138_, i_139_);
		}
	}

	void method9754() {
		if (aClass104_1410 != null) {
			int i = anInt10438 + anInt10428;
			int i_140_ = anInt10424 + aClass104_1410.method1646() - anInt10427;
			int i_141_ = anInt10429 - anInt10428;
			int i_142_ = anInt10427 - anInt10426;
			if (i_141_ < 0)
				i_141_ = 0;
			if (i_142_ < 0)
				i_142_ = 0;
			OpenGL.glScissor(i, i_140_, i_141_, i_142_);
		}
	}

	void method9610() {
		if (aBool10452) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method9715() {
		OpenGL.glTexEnvi(8960, 34162, method10125(aClass373Array10469[anInt10367]));
	}

	public void method9762(Class250 class250) {
		float[] fs = class250.aFloatArray2728;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	public Interface11 method1750(int i, int i_143_, int i_144_) {
		return new Class610(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_143_, i_144_);
	}

	void method9756() {
		if (aBool10442)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	void method9733() {
		if (aBool10442)
			OpenGL.glEnable(2929);
		else
			OpenGL.glDisable(2929);
	}

	public float method9590() {
		return 0.0F;
	}

	void method9767() {
		OpenGL.glDepthMask(aBool10536 && aBool10441);
	}

	Interface43 method9784(Class171 class171, Class88 class88, int i, int i_145_) {
		return method9639(class171, class88, i, i_145_);
	}

	void method9804() {
		OpenGL.glMatrixMode(5890);
		if (aClass295Array10436[anInt10367] != Class295.aClass295_3462)
			OpenGL.glLoadMatrixf(aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub2) this).aFloatArray11096), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	static final int method10122(Class88 class88) {
		switch (class88.anInt1222 * 1800169017) {
			default:
				return 5121;
			case 0:
				return 5125;
			case 1:
				return 5122;
			case 2:
				return 5121;
			case 5:
				return 5131;
			case 4:
				return 5124;
			case 6:
				return 5123;
			case 8:
				return 5126;
			case 3:
				return 5120;
		}
	}

	void method9745() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = aFloat10455 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = aFloat10455 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = aFloat10455 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = -aFloat10456 * aFloat10451;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = -aFloat10456 * aFloat10439;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = -aFloat10456 * aFloat10453;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	void method9770() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass250_10392.aFloatArray2728, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray10446, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray10440, 0);
	}

	void method9771() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass250_10392.aFloatArray2728, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray10446, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray10440, 0);
	}

	public void method9823(int i, Interface44 interface44) {
		((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i] = (Class601_Sub2) interface44;
	}

	void method9773() {
		/* empty */
	}

	void method9774() {
		/* empty */
	}

	public String method1681() {
		String string = "Caps: 4:";
		String string_146_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).anInt11105).append(string_146_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_146_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11098 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11102 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11101 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11107 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11103 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11099 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11111 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_146_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	static final int method10123(Class293 class293) {
		if (class293 == Class293.aClass293_3449)
			return 5890;
		if (class293 == Class293.aClass293_3448)
			return 34167;
		if (class293 == Class293.aClass293_3450)
			return 34168;
		if (class293 == Class293.aClass293_3451)
			return 34166;
		throw new IllegalArgumentException();
	}

	void method9777() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass250_10392.aFloatArray2728, 0);
		int i;
		for (i = 0; i < anInt10459; i++) {
			Class572_Sub36 class572_sub36 = aClass572_Sub36Array10457[i];
			int i_147_ = class572_sub36.method8723(-1288611141);
			int i_148_ = 16386 + i;
			float f = class572_sub36.method8724((byte) 110) / 255.0F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) class572_sub36.method8720(634847200);
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) class572_sub36.method8721((byte) -38);
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) class572_sub36.method8722(152660840);
			((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
			OpenGL.glLightfv(i_148_, 4611, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (i_147_ >> 16 & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (i_147_ >> 8 & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (i_147_ & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
			OpenGL.glLightfv(i_148_, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
			OpenGL.glLightf(i_148_, 4617, (1.0F / (float) (class572_sub36.method8752((byte) 93) * class572_sub36.method8752((byte) 62))));
			OpenGL.glEnable(i_148_);
		}
		for (/**/; i < anInt10388; i++)
			OpenGL.glDisable(16386 + i);
	}

	boolean method9778(Class171 class171, Class88 class88) {
		return true;
	}

	boolean method9779(Class171 class171, Class88 class88) {
		return true;
	}

	boolean method9780(Class171 class171, Class88 class88) {
		return true;
	}

	boolean method9781(Class171 class171, Class88 class88) {
		return true;
	}

	boolean method9750(Class171 class171, Class88 class88) {
		return aBool10524;
	}

	void method9701() {
		OpenGL.glMatrixMode(5890);
		if (aClass295Array10436[anInt10367] != Class295.aClass295_3462)
			OpenGL.glLoadMatrixf(aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub2) this).aFloatArray11096), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	Interface43 method9783(Class171 class171, Class88 class88, int i, int i_149_) {
		return method9639(class171, class88, i, i_149_);
	}

	final void method9648(int i, Class293 class293, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method10123(class293));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	Interface43 method9758(Class171 class171, int i, int i_150_, boolean bool, byte[] is, int i_151_, int i_152_) {
		return new Class599_Sub2(this, class171, i, i_150_, bool, is, i_151_, i_152_);
	}

	public boolean method1839() {
		return ((Class106_Sub3_Sub2) this).aBool11118;
	}

	Interface43 method9785(Class171 class171, int i, int i_153_, boolean bool, float[] fs, int i_154_, int i_155_) {
		return new Class599_Sub2(this, class171, i, i_153_, bool, fs, i_154_, i_155_);
	}

	Interface43 method9786(Class171 class171, int i, int i_156_, boolean bool, float[] fs, int i_157_, int i_158_) {
		return new Class599_Sub2(this, class171, i, i_156_, bool, fs, i_157_, i_158_);
	}

	Interface43 method9604(Class171 class171, int i, int i_159_, boolean bool, byte[] is, int i_160_, int i_161_) {
		return new Class599_Sub2(this, class171, i, i_159_, bool, is, i_160_, i_161_);
	}

	Interface43 method9788(int i, int i_162_, boolean bool, int[] is, int i_163_, int i_164_) {
		return new Class599_Sub2(this, i, i_162_, bool, is, i_163_, i_164_);
	}

	Interface43 method9789(int i, int i_165_, boolean bool, int[] is, int i_166_, int i_167_) {
		return new Class599_Sub2(this, i, i_165_, bool, is, i_166_, i_167_);
	}

	Interface33 method9790(int i, boolean bool, int[][] is) {
		return new Class599_Sub1(this, i, bool, is);
	}

	Interface33 method9791(int i, boolean bool, int[][] is) {
		return new Class599_Sub1(this, i, bool, is);
	}

	Interface33 method9731(int i, boolean bool, int[][] is) {
		return new Class599_Sub1(this, i, bool, is);
	}

	void method9808() {
		OpenGL.glTexEnvi(8960, 34161, method10125(aClass373Array10403[anInt10367]));
	}

	Interface40 method9708(Class171 class171, int i, int i_168_, int i_169_, boolean bool, byte[] is) {
		return new Class599_Sub3(this, class171, i, i_168_, i_169_, bool, is);
	}

	Interface40 method9757(Class171 class171, int i, int i_170_, int i_171_, boolean bool, byte[] is) {
		return new Class599_Sub3(this, class171, i, i_170_, i_171_, bool, is);
	}

	Interface45 method9794(Class171 class171, Class88 class88, int i, int i_172_) {
		return new Class599_Sub2(this, class171, class88, i, i_172_);
	}

	void method10124() {
		int i = 0;
		while (!((Class106_Sub3_Sub2) this).anOpenGL11091.method2577()) {
			if (i++ > 5)
				throw new RuntimeException("");
			Class198.method2977(1000L);
		}
	}

	void method9717() {
		/* empty */
	}

	final void method9797(int i, Class293 class293, boolean bool, boolean bool_173_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10123(class293));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_173_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_173_ ? 769 : 768);
	}

	final void method9798(int i, Class293 class293, boolean bool, boolean bool_174_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method10123(class293));
		if (bool)
			OpenGL.glTexEnvi(8960, 34192 + i, bool_174_ ? 771 : 770);
		else
			OpenGL.glTexEnvi(8960, 34192 + i, bool_174_ ? 769 : 768);
	}

	final void method9589(int i, Class293 class293, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method10123(class293));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	final void method9799() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (anInt10471 & 0xff0000) / 1.671168E7F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (anInt10471 & 0xff00) / 65280.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (anInt10471 & 0xff) / 255.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = (float) (anInt10471 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	final void method9802() {
		((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (anInt10471 & 0xff0000) / 1.671168E7F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (anInt10471 & 0xff00) / 65280.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (anInt10471 & 0xff) / 255.0F;
		((Class106_Sub3_Sub2) this).aFloatArray11108[3] = (float) (anInt10471 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
	}

	public boolean method9576(boolean bool) {
		return true;
	}

	public Interface11 method1694(int i, int i_175_) {
		return new Class610(this, Class171.aClass171_2066, Class88.aClass88_1216, i, i_175_);
	}

	void method9805() {
		OpenGL.glMatrixMode(5890);
		if (aClass295Array10436[anInt10367] != Class295.aClass295_3462)
			OpenGL.glLoadMatrixf(aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub2) this).aFloatArray11096), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method9840() {
		OpenGL.glActiveTexture(33984 + anInt10367);
	}

	void method9807() {
		OpenGL.glMatrixMode(5890);
		if (aClass295Array10436[anInt10367] != Class295.aClass295_3462)
			OpenGL.glLoadMatrixf(aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub2) this).aFloatArray11096), 0);
		else
			OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	void method9836() {
		if (aBool10369 && !aBool10420)
			OpenGL.glEnable(2896);
		else
			OpenGL.glDisable(2896);
	}

	void method9810() {
		OpenGL.glTexEnvi(8960, 34162, method10125(aClass373Array10469[anInt10367]));
	}

	void method9683() {
		OpenGL.glTexEnvi(8960, 34162, method10125(aClass373Array10469[anInt10367]));
	}

	public void method1837() {
		if (aClass104_1410 != null) {
			int i = aClass104_1410.method1648();
			int i_176_ = aClass104_1410.method1646();
			if (i > 0 || i_176_ > 0) {
				int i_177_ = anInt10434;
				int i_178_ = anInt10435;
				int i_179_ = anInt10531;
				int i_180_ = anInt10437;
				method1975();
				int i_181_ = anInt10428;
				int i_182_ = anInt10429;
				int i_183_ = anInt10426;
				int i_184_ = anInt10427;
				method1714();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method9611();
				method9847(false);
				method9596(false);
				method9617(false);
				method9618(false);
				method9659(null);
				method9643(1);
				method9591(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_176_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method1715(i_181_, i_183_, i_182_, i_184_);
				method2004(i_177_, i_178_, i_179_, i_180_);
			}
		}
	}

	void method9811(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	void method9676() {
		if (aBool10526) {
			int i = 0;
			int i_185_ = 0;
			if (anInt10506 == 0) {
				i = 0;
				i_185_ = 0;
			} else if (anInt10506 == 1) {
				i = 1;
				i_185_ = 0;
			} else if (anInt10506 == 2) {
				i = 1;
				i_185_ = 1;
			} else if (anInt10506 == 3) {
				i = 0;
				i_185_ = 1;
			}
			if (aClass376_10418 == Class376.aClass376_4569)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_185_);
			else if (aClass376_10418 == Class376.aClass376_4568)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_185_);
			else if (aClass376_10418 == Class376.aClass376_4567)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_185_);
			else if (aClass376_10418 == Class376.aClass376_4566)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_185_);
		} else if (aClass376_10418 == Class376.aClass376_4569) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass376_10418 == Class376.aClass376_4568) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass376_10418 == Class376.aClass376_4567) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	void method9813() {
		if (aBool10526) {
			int i = 0;
			int i_186_ = 0;
			if (anInt10506 == 0) {
				i = 0;
				i_186_ = 0;
			} else if (anInt10506 == 1) {
				i = 1;
				i_186_ = 0;
			} else if (anInt10506 == 2) {
				i = 1;
				i_186_ = 1;
			} else if (anInt10506 == 3) {
				i = 0;
				i_186_ = 1;
			}
			if (aClass376_10418 == Class376.aClass376_4569)
				OpenGL.glBlendFuncSeparate(770, 771, i, i_186_);
			else if (aClass376_10418 == Class376.aClass376_4568)
				OpenGL.glBlendFuncSeparate(1, 1, i, i_186_);
			else if (aClass376_10418 == Class376.aClass376_4567)
				OpenGL.glBlendFuncSeparate(774, 1, i, i_186_);
			else if (aClass376_10418 == Class376.aClass376_4566)
				OpenGL.glBlendFuncSeparate(1, 0, i, i_186_);
		} else if (aClass376_10418 == Class376.aClass376_4569) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass376_10418 == Class376.aClass376_4568) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass376_10418 == Class376.aClass376_4567) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else
			OpenGL.glDisable(3042);
	}

	void method9814() {
		if (aBool10508)
			OpenGL.glEnable(3042);
		else
			OpenGL.glDisable(3042);
	}

	void method9815() {
		aFloat10504 = aFloat10425 - (float) anInt10398;
		aFloat10503 = aFloat10504 - (float) anInt10448;
		if (aFloat10503 < aFloat10464)
			aFloat10503 = aFloat10464;
		if (aBool10488) {
			OpenGL.glFogf(2915, aFloat10503);
			OpenGL.glFogf(2916, aFloat10504);
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (anInt10500 & 0xff0000) / 1.671168E7F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (anInt10500 & 0xff00) / 65280.0F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (anInt10500 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
		}
	}

	void method9709() {
		aFloat10504 = aFloat10425 - (float) anInt10398;
		aFloat10503 = aFloat10504 - (float) anInt10448;
		if (aFloat10503 < aFloat10464)
			aFloat10503 = aFloat10464;
		if (aBool10488) {
			OpenGL.glFogf(2915, aFloat10503);
			OpenGL.glFogf(2916, aFloat10504);
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (anInt10500 & 0xff0000) / 1.671168E7F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (anInt10500 & 0xff00) / 65280.0F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (anInt10500 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
		}
	}

	public void method2017() {
		OpenGL.glFinish();
	}

	void method9817(boolean bool) {
		if (bool)
			OpenGL.glEnable(32925);
		else
			OpenGL.glDisable(32925);
	}

	public void method9705() {
		int i = ((Class106_Sub3_Sub2) this).anIntArray11092[anInt10367];
		if (i != 0) {
			((Class106_Sub3_Sub2) this).anIntArray11092[anInt10367] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	void method9755() {
		if (aClass104_1410 != null) {
			int i = anInt10438 + anInt10428;
			int i_187_ = anInt10424 + aClass104_1410.method1646() - anInt10427;
			int i_188_ = anInt10429 - anInt10428;
			int i_189_ = anInt10427 - anInt10426;
			if (i_188_ < 0)
				i_188_ = 0;
			if (i_189_ < 0)
				i_189_ = 0;
			OpenGL.glScissor(i, i_187_, i_188_, i_189_);
		}
	}

	void method9599() {
		OpenGL.glActiveTexture(33984 + anInt10367);
	}

	final Interface44 method9819(boolean bool) {
		return new Class601_Sub2(this, bool);
	}

	void method9776() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass250_10392.aFloatArray2728, 0);
		int i;
		for (i = 0; i < anInt10459; i++) {
			Class572_Sub36 class572_sub36 = aClass572_Sub36Array10457[i];
			int i_190_ = class572_sub36.method8723(-1288611141);
			int i_191_ = 16386 + i;
			float f = class572_sub36.method8724((byte) 28) / 255.0F;
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) class572_sub36.method8720(-605516507);
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) class572_sub36.method8721((byte) -17);
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) class572_sub36.method8722(799000559);
			((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
			OpenGL.glLightfv(i_191_, 4611, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
			((Class106_Sub3_Sub2) this).aFloatArray11108[0] = (float) (i_190_ >> 16 & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[1] = (float) (i_190_ >> 8 & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[2] = (float) (i_190_ & 0xff) * f;
			((Class106_Sub3_Sub2) this).aFloatArray11108[3] = 1.0F;
			OpenGL.glLightfv(i_191_, 4609, ((Class106_Sub3_Sub2) this).aFloatArray11108, 0);
			OpenGL.glLightf(i_191_, 4617, (1.0F / (float) (class572_sub36.method8752((byte) 124) * class572_sub36.method8752((byte) 68))));
			OpenGL.glEnable(i_191_);
		}
		for (/**/; i < anInt10388; i++)
			OpenGL.glDisable(16386 + i);
	}

	Class362 method9820(Class354[] class354s) {
		return new Class362_Sub1(class354s);
	}

	void method9626() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass250_10392.aFloatArray2728, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray10446, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray10440, 0);
	}

	Class362 method9829(Class354[] class354s) {
		return new Class362_Sub1(class354s);
	}

	Class362 method9749(Class354[] class354s) {
		return new Class362_Sub1(class354s);
	}

	void method9603() {
		if (aClass104_1410 != null)
			OpenGL.glViewport(anInt10438 + anInt10434, (anInt10424 + aClass104_1410.method1646() - anInt10435 - anInt10437), anInt10531, anInt10437);
		OpenGL.glDepthRange(aFloat10364, aFloat10421);
	}

	void method9772() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass250_10392.aFloatArray2728, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray10446, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray10440, 0);
	}

	public final void method9825(Class379 class379, int i, int i_192_) {
		int i_193_;
		int i_194_;
		if (class379 == Class379.aClass379_4590) {
			i_193_ = 1;
			i_194_ = i_192_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_193_ = 3;
			i_194_ = i_192_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_193_ = 4;
			i_194_ = i_192_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_193_ = 6;
			i_194_ = i_192_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_193_ = 5;
			i_194_ = i_192_ + 2;
		} else {
			i_193_ = 0;
			i_194_ = i_192_;
		}
		OpenGL.glDrawArrays(i_193_, i, i_194_);
	}

	final void method9826(Interface46 interface46, Class379 class379, int i, int i_195_, int i_196_, int i_197_) {
		int i_198_;
		int i_199_;
		if (class379 == Class379.aClass379_4590) {
			i_198_ = 1;
			i_199_ = i_197_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_198_ = 3;
			i_199_ = i_197_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_198_ = 4;
			i_199_ = i_197_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_198_ = 6;
			i_199_ = i_197_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_198_ = 5;
			i_199_ = i_197_ + 2;
		} else {
			i_198_ = 0;
			i_199_ = i_197_;
		}
		Class88 class88 = interface46.method263();
		Class601_Sub1 class601_sub1 = (Class601_Sub1) interface46;
		class601_sub1.method7069();
		OpenGL.glDrawElements(i_198_, i_199_, method10122(class88), (class601_sub1.method7070() + (long) (i_196_ * (class88.anInt1223 * -1071269501))));
	}

	final void method9827(Interface46 interface46, Class379 class379, int i, int i_200_, int i_201_, int i_202_) {
		int i_203_;
		int i_204_;
		if (class379 == Class379.aClass379_4590) {
			i_203_ = 1;
			i_204_ = i_202_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_203_ = 3;
			i_204_ = i_202_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_203_ = 4;
			i_204_ = i_202_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_203_ = 6;
			i_204_ = i_202_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_203_ = 5;
			i_204_ = i_202_ + 2;
		} else {
			i_203_ = 0;
			i_204_ = i_202_;
		}
		Class88 class88 = interface46.method263();
		Class601_Sub1 class601_sub1 = (Class601_Sub1) interface46;
		class601_sub1.method7069();
		OpenGL.glDrawElements(i_203_, i_204_, method10122(class88), (class601_sub1.method7070() + (long) (i_201_ * (class88.anInt1223 * -1071269501))));
	}

	final void method9828(Interface46 interface46, Class379 class379, int i, int i_205_, int i_206_, int i_207_) {
		int i_208_;
		int i_209_;
		if (class379 == Class379.aClass379_4590) {
			i_208_ = 1;
			i_209_ = i_207_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_208_ = 3;
			i_209_ = i_207_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_208_ = 4;
			i_209_ = i_207_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_208_ = 6;
			i_209_ = i_207_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_208_ = 5;
			i_209_ = i_207_ + 2;
		} else {
			i_208_ = 0;
			i_209_ = i_207_;
		}
		Class88 class88 = interface46.method263();
		Class601_Sub1 class601_sub1 = (Class601_Sub1) interface46;
		class601_sub1.method7069();
		OpenGL.glDrawElements(i_208_, i_209_, method10122(class88), (class601_sub1.method7070() + (long) (i_206_ * (class88.anInt1223 * -1071269501))));
	}

	public final void method9721(Class379 class379, int i, int i_210_, int i_211_, int i_212_) {
		int i_213_;
		int i_214_;
		if (class379 == Class379.aClass379_4590) {
			i_213_ = 1;
			i_214_ = i_212_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_213_ = 3;
			i_214_ = i_212_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_213_ = 4;
			i_214_ = i_212_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_213_ = 6;
			i_214_ = i_212_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_213_ = 5;
			i_214_ = i_212_ + 2;
		} else {
			i_213_ = 0;
			i_214_ = i_212_;
		}
		Class88 class88 = ((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method263();
		OpenGL.glDrawElements(i_213_, i_214_, method10122(class88), (((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7070() + (long) (i_211_ * (class88.anInt1223 * -1071269501))));
	}

	public final void method9830(Class379 class379, int i, int i_215_, int i_216_, int i_217_) {
		int i_218_;
		int i_219_;
		if (class379 == Class379.aClass379_4590) {
			i_218_ = 1;
			i_219_ = i_217_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_218_ = 3;
			i_219_ = i_217_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_218_ = 4;
			i_219_ = i_217_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_218_ = 6;
			i_219_ = i_217_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_218_ = 5;
			i_219_ = i_217_ + 2;
		} else {
			i_218_ = 0;
			i_219_ = i_217_;
		}
		Class88 class88 = ((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method263();
		OpenGL.glDrawElements(i_218_, i_219_, method10122(class88), (((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7070() + (long) (i_216_ * (class88.anInt1223 * -1071269501))));
	}

	public final void method9677(Class379 class379, int i, int i_220_, int i_221_, int i_222_) {
		int i_223_;
		int i_224_;
		if (class379 == Class379.aClass379_4590) {
			i_223_ = 1;
			i_224_ = i_222_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_223_ = 3;
			i_224_ = i_222_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_223_ = 4;
			i_224_ = i_222_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_223_ = 6;
			i_224_ = i_222_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_223_ = 5;
			i_224_ = i_222_ + 2;
		} else {
			i_223_ = 0;
			i_224_ = i_222_;
		}
		Class88 class88 = ((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method263();
		OpenGL.glDrawElements(i_223_, i_224_, method10122(class88), (((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7070() + (long) (i_221_ * (class88.anInt1223 * -1071269501))));
	}

	void method9833(int i) {
		if (!((Class106_Sub3_Sub2) this).aBool11113)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	void method9834(int i) {
		if (!((Class106_Sub3_Sub2) this).aBool11113)
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
	}

	static final int method10125(Class373 class373) {
		if (class373 == Class373.aClass373_4542)
			return 7681;
		if (class373 == Class373.aClass373_4541)
			return 8448;
		if (class373 == Class373.aClass373_4543)
			return 34165;
		if (class373 == Class373.aClass373_4545)
			return 260;
		if (class373 == Class373.aClass373_4544)
			return 34023;
		throw new IllegalArgumentException();
	}

	public void method9673(Class362 class362) {
		Class354[] class354s = class362.aClass354Array4440;
		int i = 0;
		boolean bool = false;
		boolean bool_225_ = false;
		boolean bool_226_ = false;
		for (int i_227_ = 0; i_227_ < class354s.length; i_227_++) {
			Class354 class354 = class354s[i_227_];
			Class601_Sub2 class601_sub2 = ((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i_227_];
			int i_228_ = 0;
			int i_229_ = class601_sub2.method9256();
			long l = class601_sub2.method7070();
			class601_sub2.method7069();
			for (int i_230_ = 0; i_230_ < class354.method4415(); i_230_++) {
				Class364 class364 = class354.method4416(i_230_);
				switch (class364.anInt4476) {
					case 8:
						OpenGL.glColorPointer(4, 5121, i_229_, l + (long) i_228_);
						bool = true;
						break;
					case 4:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(3, 5126, i_229_, l + (long) i_228_);
						break;
					case 7:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(4, 5126, i_229_, l + (long) i_228_);
						break;
					case 6:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(2, 5126, i_229_, l + (long) i_228_);
						break;
					case 9:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(1, 5126, i_229_, l + (long) i_228_);
						break;
					default:
						break;
					case 1:
						OpenGL.glNormalPointer(5126, i_229_, l + (long) i_228_);
						bool_225_ = true;
						break;
					case 5:
						OpenGL.glVertexPointer(3, 5126, i_229_, l + (long) i_228_);
						bool_226_ = true;
				}
				i_228_ += class364.anInt4466;
			}
		}
		if (((Class106_Sub3_Sub2) this).aBool11109 != bool_226_) {
			if (bool_226_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class106_Sub3_Sub2) this).aBool11109 = bool_226_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11076 != bool_225_) {
			if (bool_225_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class106_Sub3_Sub2) this).aBool11076 = bool_225_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11087 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class106_Sub3_Sub2) this).aBool11087 = bool;
		}
		if (((Class106_Sub3_Sub2) this).anInt11089 < i) {
			for (int i_231_ = ((Class106_Sub3_Sub2) this).anInt11089; i_231_ < i; i_231_++) {
				OpenGL.glClientActiveTexture(33984 + i_231_);
				OpenGL.glEnableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		} else if (((Class106_Sub3_Sub2) this).anInt11089 > i) {
			for (int i_232_ = i; i_232_ < ((Class106_Sub3_Sub2) this).anInt11089; i_232_++) {
				OpenGL.glClientActiveTexture(33984 + i_232_);
				OpenGL.glDisableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		}
	}

	void method9838() {
		if (aBool10452) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	void method9699() {
		if (aBool10452) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	public int method1847() {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			if ((((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11117]) == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync((((Class106_Sub3_Sub2) this).aLongArray11115[(((Class106_Sub3_Sub2) this).anInt11117)]), 0, 0);
			if (i == 37149) {
				method1703();
				return -1;
			}
			return (i != 37147 ? (((Class106_Sub3_Sub2) this).anIntArray11116[((Class106_Sub3_Sub2) this).anInt11117]) : -1);
		}
		return -1;
	}

	public String method1829() {
		String string = "Caps: 4:";
		String string_233_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).anInt11105).append(string_233_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_233_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11098 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11102 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11101 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11107 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11103 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11099 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11111 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_233_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	public void method9824(int i, Interface44 interface44) {
		((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i] = (Class601_Sub2) interface44;
	}

	void method9841() {
		if (aBool10483)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte10510 & 0xff) / 255.0F);
		if (anInt10511 > 1) {
			if (aByte10510 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method9842() {
		if (aBool10483)
			OpenGL.glEnable(3008);
		else
			OpenGL.glDisable(3008);
		OpenGL.glAlphaFunc(516, (float) (aByte10510 & 0xff) / 255.0F);
		if (anInt10511 > 1) {
			if (aByte10510 != 0)
				OpenGL.glEnable(32926);
			else
				OpenGL.glDisable(32926);
		}
	}

	void method9704() {
		if (aBool10541)
			OpenGL.glEnable(3089);
		else
			OpenGL.glDisable(3089);
	}

	public void method9844(Class362 class362) {
		Class354[] class354s = class362.aClass354Array4440;
		int i = 0;
		boolean bool = false;
		boolean bool_234_ = false;
		boolean bool_235_ = false;
		for (int i_236_ = 0; i_236_ < class354s.length; i_236_++) {
			Class354 class354 = class354s[i_236_];
			Class601_Sub2 class601_sub2 = ((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i_236_];
			int i_237_ = 0;
			int i_238_ = class601_sub2.method9256();
			long l = class601_sub2.method7070();
			class601_sub2.method7069();
			for (int i_239_ = 0; i_239_ < class354.method4415(); i_239_++) {
				Class364 class364 = class354.method4416(i_239_);
				switch (class364.anInt4476) {
					case 8:
						OpenGL.glColorPointer(4, 5121, i_238_, l + (long) i_237_);
						bool = true;
						break;
					case 4:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(3, 5126, i_238_, l + (long) i_237_);
						break;
					case 7:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(4, 5126, i_238_, l + (long) i_237_);
						break;
					case 6:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(2, 5126, i_238_, l + (long) i_237_);
						break;
					case 9:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(1, 5126, i_238_, l + (long) i_237_);
						break;
					default:
						break;
					case 1:
						OpenGL.glNormalPointer(5126, i_238_, l + (long) i_237_);
						bool_234_ = true;
						break;
					case 5:
						OpenGL.glVertexPointer(3, 5126, i_238_, l + (long) i_237_);
						bool_235_ = true;
				}
				i_237_ += class364.anInt4466;
			}
		}
		if (((Class106_Sub3_Sub2) this).aBool11109 != bool_235_) {
			if (bool_235_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class106_Sub3_Sub2) this).aBool11109 = bool_235_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11076 != bool_234_) {
			if (bool_234_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class106_Sub3_Sub2) this).aBool11076 = bool_234_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11087 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class106_Sub3_Sub2) this).aBool11087 = bool;
		}
		if (((Class106_Sub3_Sub2) this).anInt11089 < i) {
			for (int i_240_ = ((Class106_Sub3_Sub2) this).anInt11089; i_240_ < i; i_240_++) {
				OpenGL.glClientActiveTexture(33984 + i_240_);
				OpenGL.glEnableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		} else if (((Class106_Sub3_Sub2) this).anInt11089 > i) {
			for (int i_241_ = i; i_241_ < ((Class106_Sub3_Sub2) this).anInt11089; i_241_++) {
				OpenGL.glClientActiveTexture(33984 + i_241_);
				OpenGL.glDisableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		}
	}

	public void method9845(Class362 class362) {
		Class354[] class354s = class362.aClass354Array4440;
		int i = 0;
		boolean bool = false;
		boolean bool_242_ = false;
		boolean bool_243_ = false;
		for (int i_244_ = 0; i_244_ < class354s.length; i_244_++) {
			Class354 class354 = class354s[i_244_];
			Class601_Sub2 class601_sub2 = ((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i_244_];
			int i_245_ = 0;
			int i_246_ = class601_sub2.method9256();
			long l = class601_sub2.method7070();
			class601_sub2.method7069();
			for (int i_247_ = 0; i_247_ < class354.method4415(); i_247_++) {
				Class364 class364 = class354.method4416(i_247_);
				switch (class364.anInt4476) {
					case 8:
						OpenGL.glColorPointer(4, 5121, i_246_, l + (long) i_245_);
						bool = true;
						break;
					case 4:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(3, 5126, i_246_, l + (long) i_245_);
						break;
					case 7:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(4, 5126, i_246_, l + (long) i_245_);
						break;
					case 6:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(2, 5126, i_246_, l + (long) i_245_);
						break;
					case 9:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(1, 5126, i_246_, l + (long) i_245_);
						break;
					default:
						break;
					case 1:
						OpenGL.glNormalPointer(5126, i_246_, l + (long) i_245_);
						bool_242_ = true;
						break;
					case 5:
						OpenGL.glVertexPointer(3, 5126, i_246_, l + (long) i_245_);
						bool_243_ = true;
				}
				i_245_ += class364.anInt4466;
			}
		}
		if (((Class106_Sub3_Sub2) this).aBool11109 != bool_243_) {
			if (bool_243_)
				OpenGL.glEnableClientState(32884);
			else
				OpenGL.glDisableClientState(32884);
			((Class106_Sub3_Sub2) this).aBool11109 = bool_243_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11076 != bool_242_) {
			if (bool_242_)
				OpenGL.glEnableClientState(32885);
			else
				OpenGL.glDisableClientState(32885);
			((Class106_Sub3_Sub2) this).aBool11076 = bool_242_;
		}
		if (((Class106_Sub3_Sub2) this).aBool11087 != bool) {
			if (bool)
				OpenGL.glEnableClientState(32886);
			else
				OpenGL.glDisableClientState(32886);
			((Class106_Sub3_Sub2) this).aBool11087 = bool;
		}
		if (((Class106_Sub3_Sub2) this).anInt11089 < i) {
			for (int i_248_ = ((Class106_Sub3_Sub2) this).anInt11089; i_248_ < i; i_248_++) {
				OpenGL.glClientActiveTexture(33984 + i_248_);
				OpenGL.glEnableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		} else if (((Class106_Sub3_Sub2) this).anInt11089 > i) {
			for (int i_249_ = i; i_249_ < ((Class106_Sub3_Sub2) this).anInt11089; i_249_++) {
				OpenGL.glClientActiveTexture(33984 + i_249_);
				OpenGL.glDisableClientState(32888);
			}
			((Class106_Sub3_Sub2) this).anInt11089 = i;
		}
	}

	void method9846(Interface46 interface46) {
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106 = (Class601_Sub1) interface46;
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7069();
	}

	void method9718(Interface46 interface46) {
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106 = (Class601_Sub1) interface46;
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7069();
	}

	void method9848(Interface46 interface46) {
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106 = (Class601_Sub1) interface46;
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7069();
	}

	void method9849(Interface46 interface46) {
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106 = (Class601_Sub1) interface46;
		((Class106_Sub3_Sub2) this).aClass601_Sub1_11106.method7069();
	}

	byte[] method10126(String string) {
		return method9775("gl", string);
	}

	public void method1850() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub2) this).aLongArray11115[i] != 0L) {
				OpenGL.glDeleteSync(((Class106_Sub3_Sub2) this).aLongArray11115[i]);
				((Class106_Sub3_Sub2) this).aLongArray11115[i] = 0L;
			}
		}
		((Class106_Sub3_Sub2) this).anInt11088 = 0;
		((Class106_Sub3_Sub2) this).anInt11117 = 0;
	}

	void method9620() {
		OpenGL.glDepthMask(aBool10536 && aBool10441);
	}

	public int method1938() {
		if (((Class106_Sub3_Sub2) this).aBool11118) {
			if ((((Class106_Sub3_Sub2) this).aLongArray11115[((Class106_Sub3_Sub2) this).anInt11117]) == 0L)
				return -1;
			int i = OpenGL.glClientWaitSync((((Class106_Sub3_Sub2) this).aLongArray11115[(((Class106_Sub3_Sub2) this).anInt11117)]), 0, 0);
			if (i == 37149) {
				method1703();
				return -1;
			}
			return (i != 37147 ? (((Class106_Sub3_Sub2) this).anIntArray11116[((Class106_Sub3_Sub2) this).anInt11117]) : -1);
		}
		return -1;
	}

	public void method9674(int i, Interface44 interface44) {
		((Class106_Sub3_Sub2) this).aClass601_Sub2Array11090[i] = (Class601_Sub2) interface44;
	}

	final void method9682(Interface46 interface46, Class379 class379, int i, int i_250_, int i_251_, int i_252_) {
		int i_253_;
		int i_254_;
		if (class379 == Class379.aClass379_4590) {
			i_253_ = 1;
			i_254_ = i_252_ * 2;
		} else if (class379 == Class379.aClass379_4586) {
			i_253_ = 3;
			i_254_ = i_252_ + 1;
		} else if (class379 == Class379.aClass379_4588) {
			i_253_ = 4;
			i_254_ = i_252_ * 3;
		} else if (class379 == Class379.aClass379_4589) {
			i_253_ = 6;
			i_254_ = i_252_ + 2;
		} else if (class379 == Class379.aClass379_4585) {
			i_253_ = 5;
			i_254_ = i_252_ + 2;
		} else {
			i_253_ = 0;
			i_254_ = i_252_;
		}
		Class88 class88 = interface46.method263();
		Class601_Sub1 class601_sub1 = (Class601_Sub1) interface46;
		class601_sub1.method7069();
		OpenGL.glDrawElements(i_253_, i_254_, method10122(class88), (class601_sub1.method7070() + (long) (i_251_ * (class88.anInt1223 * -1071269501))));
	}

	public boolean method2022() {
		return false;
	}

	Class362 method9821(Class354[] class354s) {
		return new Class362_Sub1(class354s);
	}

	public boolean method9728(boolean bool) {
		return true;
	}

	final synchronized void method10127(int i, int i_255_) {
		LinkableInt class572_sub26 = new LinkableInt(i_255_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11079.method7940(class572_sub26, -1769443591);
	}

	final synchronized void method10128(int i, int i_256_) {
		LinkableInt class572_sub26 = new LinkableInt(i_256_);
		class572_sub26.hash = (long) i * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11079.method7940(class572_sub26, -1746365513);
	}

	Interface43 method9636(int i, int i_257_, boolean bool, int[] is, int i_258_, int i_259_) {
		return new Class599_Sub2(this, i, i_257_, bool, is, i_258_, i_259_);
	}

	void method9680(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	public void method1707(int i, int i_260_, int[] is, int[] is_261_) {
		method10110(i, i_260_, is, is_261_);
	}

	final synchronized void method10129(long l) {
		Class572 class572 = new Class572();
		class572.hash = l * 8535728873556543153L;
		((Class106_Sub3_Sub2) this).aClass675_11083.method7940(class572, -1537344240);
	}

	public float method9746() {
		return 0.0F;
	}

	public void method1719(int i, int i_262_) {
		int i_263_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((float) (i_262_ & 0xff0000) / 1.671168E7F, (float) (i_262_ & 0xff00) / 65280.0F, (float) (i_262_ & 0xff) / 255.0F, (float) (i_262_ >>> 24) / 255.0F);
			i_263_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method9618(true);
			i_263_ |= 0x100;
		}
		if ((i & 0x4) != 0)
			i_263_ |= 0x400;
		OpenGL.glClear(i_263_);
	}

	public String method1830() {
		String string = "Caps: 4:";
		String string_264_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).anInt11105).append(string_264_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_264_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11098 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11102 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11101 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11107 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11103 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11099 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub2) this).aBool11111 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_264_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}
}

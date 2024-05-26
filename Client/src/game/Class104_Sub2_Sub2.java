package game;

/* Class104_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.awt.Canvas;
import java.awt.Dimension;

public class Class104_Sub2_Sub2 extends Class104_Sub2 {
	int anInt11143;
	Canvas aCanvas11144;
	OpenGL anOpenGL11145;
	Class106_Sub1 aClass106_Sub1_11146;
	int anInt11147;
	long aLong11148;
	boolean aBool11149 = false;
	boolean aBool11150 = false;

	void method9927(int i, int i_0_) {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.surfaceResized(((Class104_Sub2_Sub2) this).aLong11148);
		method10146();
		if (this == ((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method1683(904493311))
			((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method9382();
	}

	Class104_Sub2_Sub2(Class106_Sub1 class106_sub1, Canvas canvas, long l) {
		((Class104_Sub2_Sub2) this).aClass106_Sub1_11146 = class106_sub1;
		((Class104_Sub2_Sub2) this).aCanvas11144 = canvas;
		((Class104_Sub2_Sub2) this).anOpenGL11145 = ((Class106_Sub1) class106_sub1).anOpenGL10034;
		((Class104_Sub2_Sub2) this).aLong11148 = l;
		method10146();
	}

	public int method1648() {
		return ((Class104_Sub2_Sub2) this).anInt11147;
	}

	public int method1646() {
		return ((Class104_Sub2_Sub2) this).anInt11143;
	}

	void method9925(int i, int i_1_) {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.surfaceResized(((Class104_Sub2_Sub2) this).aLong11148);
		method10146();
		if (this == ((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method1683(1102940977))
			((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method9382();
	}

	void method10146() {
		Dimension dimension = ((Class104_Sub2_Sub2) this).aCanvas11144.getSize();
		((Class104_Sub2_Sub2) this).anInt11143 = dimension.height;
		((Class104_Sub2_Sub2) this).anInt11147 = dimension.width;
	}

	public void method128() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.releaseSurface(((Class104_Sub2_Sub2) this).aCanvas11144, ((Class104_Sub2_Sub2) this).aLong11148);
		((Class104_Sub2_Sub2) this).aBool11149 = true;
		((Class104_Sub2_Sub2) this).aBool11150 = false;
	}

	Class104_Sub2_Sub2(Class106_Sub1 class106_sub1, Canvas canvas) {
		this(class106_sub1, canvas, ((Class106_Sub1) class106_sub1).anOpenGL10034.prepareSurface(canvas));
	}

	boolean method126() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		if (!((Class104_Sub2_Sub2) this).aBool11150) {
			((Class104_Sub2_Sub2) this).anOpenGL11145.setSurface(((Class104_Sub2_Sub2) this).aLong11148);
			((Class104_Sub2_Sub2) this).aBool11150 = true;
		}
		((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method9381();
		return true;
	}

	boolean method1649() {
		return true;
	}

	public int method9930(int i, int i_2_) {
		return 0;
	}

	public int method1650() {
		return ((Class104_Sub2_Sub2) this).anInt11147;
	}

	public void method127() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.releaseSurface(((Class104_Sub2_Sub2) this).aCanvas11144, ((Class104_Sub2_Sub2) this).aLong11148);
		((Class104_Sub2_Sub2) this).aBool11149 = true;
		((Class104_Sub2_Sub2) this).aBool11150 = false;
	}

	public int method1651() {
		return ((Class104_Sub2_Sub2) this).anInt11147;
	}

	boolean method131() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		if (!((Class104_Sub2_Sub2) this).aBool11150) {
			((Class104_Sub2_Sub2) this).anOpenGL11145.setSurface(((Class104_Sub2_Sub2) this).aLong11148);
			((Class104_Sub2_Sub2) this).aBool11150 = true;
		}
		((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method9381();
		return true;
	}

	boolean method1647() {
		return true;
	}

	void method10147() {
		Dimension dimension = ((Class104_Sub2_Sub2) this).aCanvas11144.getSize();
		((Class104_Sub2_Sub2) this).anInt11143 = dimension.height;
		((Class104_Sub2_Sub2) this).anInt11147 = dimension.width;
	}

	public int method1652() {
		return ((Class104_Sub2_Sub2) this).anInt11143;
	}

	public void method120() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.releaseSurface(((Class104_Sub2_Sub2) this).aCanvas11144, ((Class104_Sub2_Sub2) this).aLong11148);
		((Class104_Sub2_Sub2) this).aBool11149 = true;
		((Class104_Sub2_Sub2) this).aBool11150 = false;
	}

	public int method9923(int i, int i_3_) {
		return 0;
	}

	void method9928(int i, int i_4_) {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.surfaceResized(((Class104_Sub2_Sub2) this).aLong11148);
		method10146();
		if (this == ((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method1683(1803567297))
			((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method9382();
	}

	void method9926(int i, int i_5_) {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.surfaceResized(((Class104_Sub2_Sub2) this).aLong11148);
		method10146();
		if (this == ((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method1683(50144557))
			((Class104_Sub2_Sub2) this).aClass106_Sub1_11146.method9382();
	}

	public int method9929() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.swapBuffers(((Class104_Sub2_Sub2) this).aLong11148);
		return 0;
	}

	public void method39() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.releaseSurface(((Class104_Sub2_Sub2) this).aCanvas11144, ((Class104_Sub2_Sub2) this).aLong11148);
		((Class104_Sub2_Sub2) this).aBool11149 = true;
		((Class104_Sub2_Sub2) this).aBool11150 = false;
	}

	public int method9924() {
		if (((Class104_Sub2_Sub2) this).aBool11149)
			throw new IllegalStateException();
		((Class104_Sub2_Sub2) this).anOpenGL11145.swapBuffers(((Class104_Sub2_Sub2) this).aLong11148);
		return 0;
	}

	public int method9932(int i, int i_6_) {
		return 0;
	}

	public int method9931(int i, int i_7_) {
		return 0;
	}

	void method10148() {
		Dimension dimension = ((Class104_Sub2_Sub2) this).aCanvas11144.getSize();
		((Class104_Sub2_Sub2) this).anInt11143 = dimension.height;
		((Class104_Sub2_Sub2) this).anInt11147 = dimension.width;
	}

	void method10149() {
		Dimension dimension = ((Class104_Sub2_Sub2) this).aCanvas11144.getSize();
		((Class104_Sub2_Sub2) this).anInt11143 = dimension.height;
		((Class104_Sub2_Sub2) this).anInt11147 = dimension.width;
	}
}

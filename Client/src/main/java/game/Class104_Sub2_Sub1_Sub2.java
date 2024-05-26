package game;

/* Class104_Sub2_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.awt.Canvas;
import java.awt.Dimension;

public class Class104_Sub2_Sub1_Sub2 extends Class104_Sub2_Sub1 {
	boolean aBool11789 = false;
	OpenGL anOpenGL11790;
	long aLong11791;
	int anInt11792;
	Canvas aCanvas11793;
	int anInt11794;

	public int method1648() {
		return ((Class104_Sub2_Sub1_Sub2) this).anInt11792;
	}

	Class104_Sub2_Sub1_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, Canvas canvas, long l) {
		super(class106_sub3_sub2);
		((Class104_Sub2_Sub1_Sub2) this).aCanvas11793 = canvas;
		((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790 = ((Class106_Sub3_Sub2) class106_sub3_sub2).anOpenGL11091;
		((Class104_Sub2_Sub1_Sub2) this).aLong11791 = l;
		method10667();
	}

	public int method9932(int i, int i_0_) {
		return 0;
	}

	public void method127() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 != 0L) {
			((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.releaseSurface(((Class104_Sub2_Sub1_Sub2) this).aCanvas11793, ((Class104_Sub2_Sub1_Sub2) this).aLong11791);
			((Class104_Sub2_Sub1_Sub2) this).aLong11791 = 0L;
		}
	}

	void method10666() {
		Dimension dimension = ((Class104_Sub2_Sub1_Sub2) this).aCanvas11793.getSize();
		((Class104_Sub2_Sub1_Sub2) this).anInt11794 = dimension.height;
		((Class104_Sub2_Sub1_Sub2) this).anInt11792 = dimension.width;
	}

	void method10667() {
		Dimension dimension = ((Class104_Sub2_Sub1_Sub2) this).aCanvas11793.getSize();
		((Class104_Sub2_Sub1_Sub2) this).anInt11794 = dimension.height;
		((Class104_Sub2_Sub1_Sub2) this).anInt11792 = dimension.width;
	}

	public int method9924() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.swapBuffers(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
		return 0;
	}

	public int method9923(int i, int i_1_) {
		return 0;
	}

	boolean method126() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!((Class104_Sub2_Sub1_Sub2) this).aBool11789) {
			bool = ((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.setSurface(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
			((Class104_Sub2_Sub1_Sub2) this).aBool11789 = true;
		}
		return bool && super.method126();
	}

	boolean method1649() {
		return true;
	}

	public void method39() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 != 0L) {
			((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.releaseSurface(((Class104_Sub2_Sub1_Sub2) this).aCanvas11793, ((Class104_Sub2_Sub1_Sub2) this).aLong11791);
			((Class104_Sub2_Sub1_Sub2) this).aLong11791 = 0L;
		}
	}

	public int method1650() {
		return ((Class104_Sub2_Sub1_Sub2) this).anInt11792;
	}

	public int method1651() {
		return ((Class104_Sub2_Sub1_Sub2) this).anInt11792;
	}

	public int method1646() {
		return ((Class104_Sub2_Sub1_Sub2) this).anInt11794;
	}

	void method9925(int i, int i_2_) {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.surfaceResized(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
		method10667();
		super.method9925(i, i_2_);
	}

	boolean method1647() {
		return true;
	}

	boolean method131() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		boolean bool = true;
		if (!((Class104_Sub2_Sub1_Sub2) this).aBool11789) {
			bool = ((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.setSurface(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
			((Class104_Sub2_Sub1_Sub2) this).aBool11789 = true;
		}
		return bool && super.method126();
	}

	Class104_Sub2_Sub1_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, Canvas canvas) {
		this(class106_sub3_sub2, canvas, ((Class106_Sub3_Sub2) class106_sub3_sub2).anOpenGL11091.prepareSurface(canvas));
	}

	public void method120() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 != 0L) {
			((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.releaseSurface(((Class104_Sub2_Sub1_Sub2) this).aCanvas11793, ((Class104_Sub2_Sub1_Sub2) this).aLong11791);
			((Class104_Sub2_Sub1_Sub2) this).aLong11791 = 0L;
		}
	}

	void method9926(int i, int i_3_) {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.surfaceResized(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
		method10667();
		super.method9925(i, i_3_);
	}

	void method9928(int i, int i_4_) {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.surfaceResized(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
		method10667();
		super.method9925(i, i_4_);
	}

	public int method9930(int i, int i_5_) {
		return 0;
	}

	public int method9929() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.swapBuffers(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
		return 0;
	}

	public int method1652() {
		return ((Class104_Sub2_Sub1_Sub2) this).anInt11794;
	}

	public int method9931(int i, int i_6_) {
		return 0;
	}

	public void method128() {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 != 0L) {
			((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.releaseSurface(((Class104_Sub2_Sub1_Sub2) this).aCanvas11793, ((Class104_Sub2_Sub1_Sub2) this).aLong11791);
			((Class104_Sub2_Sub1_Sub2) this).aLong11791 = 0L;
		}
	}

	void method10668() {
		Dimension dimension = ((Class104_Sub2_Sub1_Sub2) this).aCanvas11793.getSize();
		((Class104_Sub2_Sub1_Sub2) this).anInt11794 = dimension.height;
		((Class104_Sub2_Sub1_Sub2) this).anInt11792 = dimension.width;
	}

	void method10669() {
		Dimension dimension = ((Class104_Sub2_Sub1_Sub2) this).aCanvas11793.getSize();
		((Class104_Sub2_Sub1_Sub2) this).anInt11794 = dimension.height;
		((Class104_Sub2_Sub1_Sub2) this).anInt11792 = dimension.width;
	}

	void method10670() {
		Dimension dimension = ((Class104_Sub2_Sub1_Sub2) this).aCanvas11793.getSize();
		((Class104_Sub2_Sub1_Sub2) this).anInt11794 = dimension.height;
		((Class104_Sub2_Sub1_Sub2) this).anInt11792 = dimension.width;
	}

	void method9927(int i, int i_7_) {
		if (((Class104_Sub2_Sub1_Sub2) this).aLong11791 == 0L)
			throw new IllegalStateException("");
		((Class104_Sub2_Sub1_Sub2) this).anOpenGL11790.surfaceResized(((Class104_Sub2_Sub1_Sub2) this).aLong11791);
		method10667();
		super.method9925(i, i_7_);
	}
}

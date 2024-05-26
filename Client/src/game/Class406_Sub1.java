package game;

/* Class406_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class406_Sub1 extends Class406 {
	Class405_Sub2 aClass405_Sub2_9868;
	Class106_Sub3_Sub2 aClass106_Sub3_Sub2_9869;
	int anInt9870;

	public boolean method4868(Class405 class405) {
		if (((Class406_Sub1) this).aClass405_Sub2_9868 == class405)
			return true;
		if (!class405.method4803())
			return false;
		boolean bool = method4891();
		((Class406_Sub1) this).aClass405_Sub2_9868 = (Class405_Sub2) class405;
		anInt4762 = method4866(class405, (byte) -23) * 1363937537;
		if (anInt4762 * 772077313 == -1)
			throw new IllegalArgumentException();
		((Class406_Sub1) this).anInt9870 = (((Class405_Sub2) ((Class406_Sub1) this).aClass405_Sub2_9868).anInt9920);
		if (bool) {
			OpenGL.glUseProgram(((Class406_Sub1) this).anInt9870);
			((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093 = ((Class406_Sub1) this).aClass405_Sub2_9868;
		}
		return true;
	}

	public void method4857() {
		if ((((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093) != ((Class406_Sub1) this).aClass405_Sub2_9868) {
			if (((Class406_Sub1) this).aClass405_Sub2_9868 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(((Class406_Sub1) this).anInt9870);
			((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093 = ((Class406_Sub1) this).aClass405_Sub2_9868;
		}
	}

	Class405 method4862(Class106_Sub3 class106_sub3, Class385 class385) {
		return new Class405_Sub2((Class106_Sub3_Sub2) class106_sub3, this, class385);
	}

	Class572_Sub8_Sub1 method4871(Class394 class394) {
		return new Class572_Sub8_Sub1_Sub1(this, class394);
	}

	public void method4858() {
		if ((((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093) != ((Class406_Sub1) this).aClass405_Sub2_9868) {
			if (((Class406_Sub1) this).aClass405_Sub2_9868 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(((Class406_Sub1) this).anInt9870);
			((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093 = ((Class406_Sub1) this).aClass405_Sub2_9868;
		}
	}

	public void method4859() {
		/* empty */
	}

	public void method4892() {
		if ((((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093) != ((Class406_Sub1) this).aClass405_Sub2_9868) {
			if (((Class406_Sub1) this).aClass405_Sub2_9868 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(((Class406_Sub1) this).anInt9870);
			((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093 = ((Class406_Sub1) this).aClass405_Sub2_9868;
		}
	}

	void method4890() {
		for (int i = 0; i < method4909(634763030); i++)
			((Class405_Sub2) method4865(i, 1646423965)).method39();
		super.method4890();
	}

	public void finalize() throws Throwable {
		method4890();
		super.finalize();
	}

	void method9355() throws Throwable {
		method4890();
		super.finalize();
	}

	Class572_Sub8_Sub1 method4886(Class394 class394) {
		return new Class572_Sub8_Sub1_Sub1(this, class394);
	}

	public boolean method4891() {
		return ((((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093) == ((Class406_Sub1) this).aClass405_Sub2_9868);
	}

	Class406_Sub1(Class106_Sub3_Sub2 class106_sub3_sub2, Class381 class381) {
		super((Class106_Sub3) class106_sub3_sub2, class381);
		((Class406_Sub1) this).aClass106_Sub3_Sub2_9869 = class106_sub3_sub2;
	}

	public void method4893() {
		/* empty */
	}

	public boolean method4867() {
		return ((((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093) == ((Class406_Sub1) this).aClass405_Sub2_9868);
	}

	Class405 method4898(Class106_Sub3 class106_sub3, Class385 class385) {
		return new Class405_Sub2((Class106_Sub3_Sub2) class106_sub3, this, class385);
	}

	public boolean method4894(Class405 class405) {
		if (((Class406_Sub1) this).aClass405_Sub2_9868 == class405)
			return true;
		if (!class405.method4803())
			return false;
		boolean bool = method4891();
		((Class406_Sub1) this).aClass405_Sub2_9868 = (Class405_Sub2) class405;
		anInt4762 = method4866(class405, (byte) -68) * 1363937537;
		if (anInt4762 * 772077313 == -1)
			throw new IllegalArgumentException();
		((Class406_Sub1) this).anInt9870 = (((Class405_Sub2) ((Class406_Sub1) this).aClass405_Sub2_9868).anInt9920);
		if (bool) {
			OpenGL.glUseProgram(((Class406_Sub1) this).anInt9870);
			((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093 = ((Class406_Sub1) this).aClass405_Sub2_9868;
		}
		return true;
	}

	public boolean method4912(Class405 class405) {
		if (((Class406_Sub1) this).aClass405_Sub2_9868 == class405)
			return true;
		if (!class405.method4803())
			return false;
		boolean bool = method4891();
		((Class406_Sub1) this).aClass405_Sub2_9868 = (Class405_Sub2) class405;
		anInt4762 = method4866(class405, (byte) -29) * 1363937537;
		if (anInt4762 * 772077313 == -1)
			throw new IllegalArgumentException();
		((Class406_Sub1) this).anInt9870 = (((Class405_Sub2) ((Class406_Sub1) this).aClass405_Sub2_9868).anInt9920);
		if (bool) {
			OpenGL.glUseProgram(((Class406_Sub1) this).anInt9870);
			((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093 = ((Class406_Sub1) this).aClass405_Sub2_9868;
		}
		return true;
	}

	void method4918() {
		for (int i = 0; i < method4909(1324477793); i++)
			((Class405_Sub2) method4865(i, 1812224350)).method39();
		super.method4890();
	}

	public void method4919() {
		if ((((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093) != ((Class406_Sub1) this).aClass405_Sub2_9868) {
			if (((Class406_Sub1) this).aClass405_Sub2_9868 == null)
				throw new RuntimeException_Sub4();
			OpenGL.glUseProgram(((Class406_Sub1) this).anInt9870);
			((Class106_Sub3_Sub2) ((Class406_Sub1) this).aClass106_Sub3_Sub2_9869).aClass405_Sub2_11093 = ((Class406_Sub1) this).aClass405_Sub2_9868;
		}
	}

	void method4901() {
		for (int i = 0; i < method4909(97491295); i++)
			((Class405_Sub2) method4865(i, 1863745952)).method39();
		super.method4890();
	}
}

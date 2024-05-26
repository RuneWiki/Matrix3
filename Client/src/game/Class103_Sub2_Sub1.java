package game;

/* Class103_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class103_Sub2_Sub1 extends Class103_Sub2 {
	static int[] anIntArray11072;
	Class155_Sub3 aClass155_Sub3_11073;
	static int[] anIntArray11074 = new int[4];
	Class106_Sub1 aClass106_Sub1_11075;

	Class155_Sub3 method9850() {
		return ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073;
	}

	int method10106() {
		return (((Class155_Sub3) ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073).anInt9644);
	}

	Class155_Sub3 method9851() {
		return ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073;
	}

	Class103_Sub2_Sub1(Class106_Sub1 class106_sub1, int i) {
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075 = class106_sub1;
		((Class103_Sub2_Sub1) this).aClass155_Sub3_11073 = new Class155_Sub3(class106_sub1, Class171.aClass171_2071, Class88.aClass88_1218, i);
	}

	static {
		anIntArray11072 = new int[4];
	}

	Class155_Sub3 method9852() {
		return ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073;
	}

	Class155_Sub3 method9853() {
		return ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073;
	}

	Class155_Sub3 method9854() {
		return ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073;
	}

	int method10107() {
		return (((Class155_Sub3) ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073).anInt9644);
	}

	int method10108() {
		return (((Class155_Sub3) ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073).anInt9644);
	}

	boolean method10109(Class155_Sub3 class155_sub3, Class155_Sub3 class155_sub3_0_, float f) {
		boolean bool = true;
		Class104_Sub1_Sub1 class104_sub1_sub1 = (((Class106_Sub1) ((Class103_Sub2_Sub1) this).aClass106_Sub1_11075).aClass104_Sub1_Sub1_10128);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method1718(anIntArray11074);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method1714();
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method1712(anIntArray11072);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9399();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glViewport(0, 0, ((Class155_Sub3) (((Class103_Sub2_Sub1) this).aClass155_Sub3_11073)).anInt9644, ((Class155_Sub3) (((Class103_Sub2_Sub1) this).aClass155_Sub3_11073)).anInt9644);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9428(false);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9429(false);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9431(false);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9432(false);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9389(-2);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9421(1);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9426(0.0F, 0.0F, 0.0F, f);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9434(34165, 34165);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9422(class155_sub3_0_);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9421(0);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9454(1);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9422(class155_sub3);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method1661(class104_sub1_sub1, -1626838727);
		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class104_sub1_sub1.method9908(0, ((Class103_Sub2_Sub1) this).aClass155_Sub3_11073.method9194(i_1_, 0));
			class104_sub1_sub1.method10136(0);
			if (class104_sub1_sub1.method9909()) {
				OpenGL.glBegin(7);
				switch (i_1_) {
					case 34069:
						OpenGL.glTexCoord3i(65535, 65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65535, 65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65535, -65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(65535, -65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34071:
						OpenGL.glTexCoord3i(-65534, 65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, 65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34070:
						OpenGL.glTexCoord3i(-65535, 65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(-65535, 65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(-65535, -65534, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65535, -65534, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34073:
						OpenGL.glTexCoord3i(-65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, 65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, -65534, 65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34072:
						OpenGL.glTexCoord3i(-65534, -65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65535, 65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(65534, -65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(-65534, -65535, -65534);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
					case 34074:
						OpenGL.glTexCoord3i(65534, 65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
						OpenGL.glVertex2f(0.0F, 0.0F);
						OpenGL.glTexCoord3i(-65534, 65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
						OpenGL.glVertex2f(1.0F, 0.0F);
						OpenGL.glTexCoord3i(-65534, -65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
						OpenGL.glVertex2f(1.0F, 1.0F);
						OpenGL.glTexCoord3i(65534, -65534, -65535);
						OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
						OpenGL.glVertex2f(0.0F, 1.0F);
						break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class104_sub1_sub1.method9908(0, null);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method1884(class104_sub1_sub1, 208241853);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9421(1);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9422(null);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9434(8448, 8448);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9421(0);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method9422(null);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method1715(anIntArray11074[0], anIntArray11074[1], anIntArray11074[2], anIntArray11074[3]);
		((Class103_Sub2_Sub1) this).aClass106_Sub1_11075.method2004(anIntArray11072[0], anIntArray11072[1], anIntArray11072[2], anIntArray11072[3]);
		if (bool && !((Class106_Sub1) (((Class103_Sub2_Sub1) this).aClass106_Sub1_11075)).aBool10151)
			((Class103_Sub2_Sub1) this).aClass155_Sub3_11073.method2529();
		return bool;
	}
}

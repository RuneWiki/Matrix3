package game;

/* Class572_Sub8_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class572_Sub8_Sub1_Sub1 extends Class572_Sub8_Sub1 {
	Class406_Sub1 aClass406_Sub1_11721;
	int[] anIntArray11722 = null;

	public final int method10278(int i) {
		return ((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i];
	}

	final int method10619() {
		return (((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4880(1449307221)]);
	}

	public boolean method10264(int i) {
		if (((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 == null)
			((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 = new int[((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4909(1946797253)];
		Class405_Sub2 class405_sub2 = ((Class405_Sub2) ((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4865(i, 1510409441));
		((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] = OpenGL.glGetUniformLocation((((Class405_Sub2) class405_sub2).anInt9920), method10274(-673696664));
		return ((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] != -1;
	}

	public final int method10269(int i) {
		return ((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i];
	}

	Class572_Sub8_Sub1_Sub1(Class406_Sub1 class406_sub1, Class394 class394) {
		super(class394);
		((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721 = class406_sub1;
	}

	public boolean method10270(int i) {
		if (((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 == null)
			((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 = new int[((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4909(1410430982)];
		Class405_Sub2 class405_sub2 = ((Class405_Sub2) ((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4865(i, 1592311890));
		((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] = OpenGL.glGetUniformLocation((((Class405_Sub2) class405_sub2).anInt9920), method10274(-673696664));
		return ((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] != -1;
	}

	public boolean method10271(int i) {
		if (((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 == null)
			((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 = new int[((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4909(1016895675)];
		Class405_Sub2 class405_sub2 = ((Class405_Sub2) ((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4865(i, 1548599198));
		((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] = OpenGL.glGetUniformLocation((((Class405_Sub2) class405_sub2).anInt9920), method10274(-673696664));
		return ((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] != -1;
	}

	public boolean method10265(int i) {
		if (((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 == null)
			((Class572_Sub8_Sub1_Sub1) this).anIntArray11722 = new int[((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4909(-290074403)];
		Class405_Sub2 class405_sub2 = ((Class405_Sub2) ((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4865(i, 1630067716));
		((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] = OpenGL.glGetUniformLocation((((Class405_Sub2) class405_sub2).anInt9920), method10274(-673696664));
		return ((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[i] != -1;
	}

	final int method10620() {
		return (((Class572_Sub8_Sub1_Sub1) this).anIntArray11722[((Class572_Sub8_Sub1_Sub1) this).aClass406_Sub1_11721.method4880(-668359908)]);
	}
}

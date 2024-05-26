package game;

/* Class635 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Array;
import java.util.Iterator;

public class Class635 implements Interface18 {
	Class248 aClass248_8222;
	Interface72 anInterface72_8223;
	Interface17[] anInterface17Array8224;
	protected int anInt8225;
	Interface17 anInterface17_8226;
	JS5ConfigGroup aClass220_8227;

	public Iterator method7556() {
		return new Class262(this);
	}

	Class635(Class437 class437, Class435 class435, JS5ConfigGroup jS5ConfigGroup, Class248 class248, Interface72 interface72, boolean bool) {
		((Class635) this).anInterface72_8223 = interface72;
		((Class635) this).aClass220_8227 = jS5ConfigGroup;
		((Class635) this).aClass248_8222 = class248;
		anInt8225 = Class241.method3324(((Class635) this).aClass248_8222, ((Class635) this).aClass220_8227, 2141346985) * -2133852575;
		((Class635) this).anInterface17Array8224 = (Interface17[]) Array.newInstance(((Class635) this).anInterface72_8223.method459(1950327162), 311240097 * anInt8225);
		if (bool) {
			for (int i = 0; i < 311240097 * anInt8225; i++)
				method7557(i, 2136517126);
		}
	}

	void method7557(int i, int i_0_) {
		if (null == ((Class635) this).anInterface17Array8224[i]) {
			try {
				((Class635) this).anInterface17Array8224[i] = ((Class635) this).anInterface72_8223.method458(i, this, -779048912);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}
			Object object = null;
			byte[] is = MapSize.method1543(((Class635) this).aClass248_8222, ((Class635) this).aClass220_8227, i, 1201050600);
			if (null != is)
				((Class635) this).anInterface17Array8224[i].method109(new RSByteBuffer(is), 1989508051);
			((Class635) this).anInterface17Array8224[i].method104((byte) -78);
		}
	}

	public Interface17 getDefinition(int i, int i_1_) {
		if (i < 0) {
			if (null == ((Class635) this).anInterface17_8226)
				((Class635) this).anInterface17_8226 = ((Class635) this).anInterface72_8223.method458(-1, this, 1046990930);
			return ((Class635) this).anInterface17_8226;
		}
		if (null == ((Class635) this).anInterface17Array8224[i])
			method7557(i, 2013416144);
		return ((Class635) this).anInterface17Array8224[i];
	}

	public Iterator iterator() {
		return new Class262(this);
	}

	public Interface17 method114(int i) {
		if (i < 0) {
			if (null == ((Class635) this).anInterface17_8226)
				((Class635) this).anInterface17_8226 = ((Class635) this).anInterface72_8223.method458(-1, this, 468096267);
			return ((Class635) this).anInterface17_8226;
		}
		if (null == ((Class635) this).anInterface17Array8224[i])
			method7557(i, 1955367868);
		return ((Class635) this).anInterface17Array8224[i];
	}

	public int method45() {
		return ((Class635) this).anInterface17Array8224.length;
	}

	public int method113(byte i) {
		return ((Class635) this).anInterface17Array8224.length;
	}

	public static void method7559(int i, byte i_2_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(3, (long) i);
		class572_sub12_sub11.method10384(-1806395243);
	}
}

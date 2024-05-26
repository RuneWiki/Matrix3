package game;

/* Class452 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class452 implements Interface72 {
	Class248 aClass248_5173;
	Class127 aClass127_5174 = new Class127(60);
	int anInt5175;

	void method5366() {
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2231((byte) -32);
		}
	}

	void method5367(int i, int i_0_) {
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2235(i, 1752589254);
		}
	}

	void method5368(int i) {
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2231((byte) -110);
		}
	}

	void method5369() {
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2234((byte) 24);
		}
	}

	void method5370(byte i) {
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2234((byte) -24);
		}
	}

	Class452(Class248 class248) {
		((Class452) this).aClass248_5173 = class248;
	}

	void method5371(int i) {
		((Class452) this).anInt5175 = i * -1044064545;
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2231((byte) -101);
		}
	}

	void method5372() {
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2234((byte) -2);
		}
	}

	void method5373(int i) {
		((Class452) this).anInt5175 = i * -1044064545;
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2231((byte) -15);
		}
	}

	void method5374(int i, int i_1_) {
		((Class452) this).anInt5175 = i * -1044064545;
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2231((byte) -4);
		}
	}

	void method5375() {
		synchronized (((Class452) this).aClass127_5174) {
			((Class452) this).aClass127_5174.method2234((byte) 48);
		}
	}

	static final void method5376(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1649729153) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray862 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}
}

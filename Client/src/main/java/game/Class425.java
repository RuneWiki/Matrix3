package game;

/* Class425 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class425 implements Interface72 {
	Class248 aClass248_4993;
	static int anInt4994;

	public Class method461() {
		return Class346.class;
	}

	public Interface17 method458(int i, Interface18 interface18, int i_0_) {
		return new Class346(i, ((Class425) this).aClass248_4993);
	}

	public Interface17 method464(int i, Interface18 interface18) {
		return new Class346(i, ((Class425) this).aClass248_4993);
	}

	public Interface17 method460(int i, Interface18 interface18) {
		return new Class346(i, ((Class425) this).aClass248_4993);
	}

	public Class method459(int i) {
		return Class346.class;
	}

	public Interface17 method462(int i, Interface18 interface18) {
		return new Class346(i, ((Class425) this).aClass248_4993);
	}

	public Interface17 method465(int i, Interface18 interface18) {
		return new Class346(i, ((Class425) this).aClass248_4993);
	}

	public Interface17 method463(int i, Interface18 interface18) {
		return new Class346(i, ((Class425) this).aClass248_4993);
	}

	public Class method467() {
		return Class346.class;
	}

	Class425(Class248 class248) {
		((Class425) this).aClass248_4993 = class248;
	}

	public Class method466() {
		return Class346.class;
	}

	static final void method5174(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = new StringBuilder().append(string).append(i_1_).toString();
	}

	static boolean method5175(int i, byte i_2_) {
		return i == 12 || i == 15 || i == 2 || i == 6 || i == 0 || i == 10;
	}

	public static final int method5176(int i) {
		return (int) (1000000000L / (6416999803781759981L * Class584.aLong7763));
	}

	static void method5177(short i) {
		Class195 class195 = Class166.method2676((byte) 37);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3728, class195.aClass650_2340, -694345562);
		class572_sub25.aRsByteBuffer.writeInt(1217022041 * client.anInt8614, -1743753997);
		class195.method2929(class572_sub25, (byte) -14);
	}

	public static void method5178(Class106 class106, byte i) {
		Class298.aClass102_3481 = ((Class102) Class133_Sub20.aClass324_10261.method4129((client.anInterface19_8776), (Class1.anInt14 * -1060508549), true, true, 878143997));
		Class23.aClass284_155 = Class133_Sub20.aClass324_10261.method4130((client.anInterface19_8776), (Class1.anInt14 * -1060508549), (byte) 33);
		Class512.aClass102_5703 = (Class102) (Class133_Sub20.aClass324_10261.method4129(client.anInterface19_8776, Class1.anInt9 * -901270193, true, true, 878143997));
		Class26.aClass284_215 = Class133_Sub20.aClass324_10261.method4130((client.anInterface19_8776), (-901270193 * Class1.anInt9), (byte) 61);
		Class1.aClass102_16 = (Class102) (Class133_Sub20.aClass324_10261.method4129(client.anInterface19_8776, Class1.anInt12 * 932397655, true, true, 878143997));
		Class318.aClass284_3875 = Class133_Sub20.aClass324_10261.method4130((client.anInterface19_8776), (932397655 * Class1.anInt12), (byte) 104);
	}
}

package game;

/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class213 {
	public Interface38[] anInterface38Array2462;
	public static Class572_Sub24 aClass572_Sub24_2463;

	void method3066(RSByteBuffer class572_sub15) {
		anInterface38Array2462 = new Interface38[class572_sub15.readUnsignedByte(1929608620)];
		Class310[] class310s = Class572_Sub19.method8594(-808276104);
		for (int i = 0; i < anInterface38Array2462.length; i++)
			anInterface38Array2462[i] = method3071(class572_sub15, class310s[class572_sub15.readUnsignedByte(186543048)], -155501997);
	}

	void method3067(RSByteBuffer class572_sub15, int i) {
		anInterface38Array2462 = new Interface38[class572_sub15.readUnsignedByte(1579220149)];
		Class310[] class310s = Class572_Sub19.method8594(-1572040529);
		for (int i_0_ = 0; i_0_ < anInterface38Array2462.length; i_0_++)
			anInterface38Array2462[i_0_] = method3071(class572_sub15, class310s[class572_sub15.readUnsignedByte(102233137)], -1395264623);
	}

	Class213() {
		/* empty */
	}

	void method3068(RSByteBuffer class572_sub15) {
		anInterface38Array2462 = new Interface38[class572_sub15.readUnsignedByte(723510819)];
		Class310[] class310s = Class572_Sub19.method8594(-2144936409);
		for (int i = 0; i < anInterface38Array2462.length; i++)
			anInterface38Array2462[i] = method3071(class572_sub15, class310s[class572_sub15.readUnsignedByte(655815578)], 2066371042);
	}

	void method3069(RSByteBuffer class572_sub15) {
		anInterface38Array2462 = new Interface38[class572_sub15.readUnsignedByte(718612820)];
		Class310[] class310s = Class572_Sub19.method8594(-228989602);
		for (int i = 0; i < anInterface38Array2462.length; i++)
			anInterface38Array2462[i] = method3071(class572_sub15, class310s[class572_sub15.readUnsignedByte(203514477)], 762056800);
	}

	void method3070(RSByteBuffer class572_sub15) {
		anInterface38Array2462 = new Interface38[class572_sub15.readUnsignedByte(1031542111)];
		Class310[] class310s = Class572_Sub19.method8594(-65073703);
		for (int i = 0; i < anInterface38Array2462.length; i++)
			anInterface38Array2462[i] = method3071(class572_sub15, class310s[class572_sub15.readUnsignedByte(2035739297)], -596015596);
	}

	Interface38 method3071(RSByteBuffer class572_sub15, Class310 class310, int i) {
		if (Class310.aClass310_3656 == class310)
			return Class125.method2207(class572_sub15, 1628307581);
		if (class310 == Class310.aClass310_3652)
			return IncomingPacket.method4110(class572_sub15, (byte) -53);
		if (class310 == Class310.aClass310_3653)
			return Class489.method5844(class572_sub15, (byte) 61);
		if (class310 == Class310.aClass310_3657)
			return Class480.method5717(class572_sub15, (byte) 4);
		if (class310 == Class310.aClass310_3660)
			return Class197.method2972(class572_sub15, (byte) 88);
		if (class310 == Class310.aClass310_3651)
			return Exception_Sub4.method10189(class572_sub15, (byte) 4);
		if (Class310.aClass310_3654 == class310)
			return Class279.method3765(class572_sub15, -1935901031);
		if (class310 == Class310.aClass310_3658)
			return Class511.method6081(class572_sub15, (byte) 4);
		if (Class310.aClass310_3659 == class310)
			return Class378.method4625(class572_sub15, 285458157);
		if (class310 == Class310.aClass310_3655)
			return Class665_Sub10.method8198(class572_sub15, (byte) 1);
		if (class310 == Class310.aClass310_3661)
			return Class374.method4618(class572_sub15, -547239326);
		return null;
	}

	static final void method3072(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.method1097(-1675376968);
	}

	public static void method3073(Canvas canvas, byte i) {
		try {
			Class var_class = Class.forName("java.awt.Canvas");
			Method method = var_class.getMethod("setIgnoreRepaint", new Class[] { Boolean.TYPE });
			method.invoke(canvas, new Object[] { Boolean.TRUE });
		} catch (Exception exception) {
			/* empty */
		}
	}
}

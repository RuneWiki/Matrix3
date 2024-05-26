package game;

/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class468 implements Interface17, Interface73 {
	int anInt5258;
	public int anInt5259;
	public int anInt5260 = 0;
	public int anInt5261 = 405976453;
	public boolean aBool5262 = true;
	static final int anInt5263 = 1190717;
	public int anInt5264;
	public int anInt5265;
	public int anInt5266;
	public boolean aBool5267;
	public int anInt5268;
	public int anInt5269;
	public int anInt5270;
	public int anInt5271 = -1313023257;
	public boolean aBool5272;
	public int anInt5273;
	boolean aBool5274;

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1272731424);
			if (0 == i)
				break;
			method5546(class572_sub15, i, (byte) -105);
		}
	}

	void method5546(RSByteBuffer class572_sub15, int i, byte i_0_) {
		if (1 == i)
			anInt5260 = Class63.method1019(class572_sub15.read24BitInt(1140925462), 1473454257) * -1586913819;
		else if (i == 2)
			anInt5261 = class572_sub15.readUnsignedByte(338379462) * -405976453;
		else if (3 == i) {
			anInt5261 = class572_sub15.readUnsignedShort(647518597) * -405976453;
			if (65535 == -1569651533 * anInt5261)
				anInt5261 = 405976453;
		} else if (5 == i)
			aBool5262 = false;
		else if (7 == i)
			anInt5271 = Class63.method1019(class572_sub15.read24BitInt(1140925462), 1473454257) * 1313023257;
		else if (8 == i)
			((Class468) this).aBool5274 = true;
		else if (9 == i)
			anInt5264 = (class572_sub15.readUnsignedShort(647518597) << 2) * -8282637;
		else if (10 == i)
			aBool5272 = false;
		else if (11 == i)
			anInt5265 = class572_sub15.readUnsignedByte(260357753) * -1447283813;
		else if (12 == i)
			aBool5267 = true;
		else if (i == 13)
			anInt5268 = class572_sub15.read24BitInt(1140925462) * 1498836699;
		else if (14 == i)
			anInt5269 = (class572_sub15.readUnsignedByte(-72047808) << 2) * -337664827;
		else if (i == 16)
			anInt5270 = class572_sub15.readUnsignedByte(-79033609) * -586771577;
		else if (20 == i)
			anInt5266 = class572_sub15.readUnsignedShort(647518597) * 2082490479;
		else if (21 == i)
			anInt5259 = class572_sub15.readUnsignedByte(1802734042) * 961888831;
		else if (22 == i)
			anInt5273 = class572_sub15.readUnsignedShort(647518597) * -843611945;
	}

	Class468() {
		anInt5264 = 54257152;
		aBool5272 = true;
		anInt5265 = 1306631384;
		aBool5267 = false;
		anInt5268 = -1717750993;
		anInt5269 = -135712448;
		anInt5270 = 697103225;
		anInt5266 = -1947085999;
		anInt5259 = 0;
		anInt5273 = 1843410368;
		((Class468) this).aBool5274 = false;
	}

	public void method468(int i, int i_1_) {
		((Class468) this).anInt5258 = -223792189 * i;
	}

	public void method106() {
		anInt5265 = -1447283813 * (850131603 * anInt5265 << 8 | ((Class468) this).anInt5258 * 1945162987);
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1768882982);
			if (0 == i)
				break;
			method5546(class572_sub15, i, (byte) -17);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1643943452);
			if (0 == i)
				break;
			method5546(class572_sub15, i, (byte) -52);
		}
	}

	void method5547(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt5260 = Class63.method1019(class572_sub15.read24BitInt(1140925462), 1473454257) * -1586913819;
		else if (i == 2)
			anInt5261 = class572_sub15.readUnsignedByte(2049519480) * -405976453;
		else if (3 == i) {
			anInt5261 = class572_sub15.readUnsignedShort(647518597) * -405976453;
			if (65535 == -1569651533 * anInt5261)
				anInt5261 = 405976453;
		} else if (5 == i)
			aBool5262 = false;
		else if (7 == i)
			anInt5271 = Class63.method1019(class572_sub15.read24BitInt(1140925462), 1473454257) * 1313023257;
		else if (8 == i)
			((Class468) this).aBool5274 = true;
		else if (9 == i)
			anInt5264 = (class572_sub15.readUnsignedShort(647518597) << 2) * -8282637;
		else if (10 == i)
			aBool5272 = false;
		else if (11 == i)
			anInt5265 = class572_sub15.readUnsignedByte(2117509751) * -1447283813;
		else if (12 == i)
			aBool5267 = true;
		else if (i == 13)
			anInt5268 = class572_sub15.read24BitInt(1140925462) * 1498836699;
		else if (14 == i)
			anInt5269 = (class572_sub15.readUnsignedByte(1203532351) << 2) * -337664827;
		else if (i == 16)
			anInt5270 = class572_sub15.readUnsignedByte(1985823465) * -586771577;
		else if (20 == i)
			anInt5266 = class572_sub15.readUnsignedShort(647518597) * 2082490479;
		else if (21 == i)
			anInt5259 = class572_sub15.readUnsignedByte(1355990780) * 961888831;
		else if (22 == i)
			anInt5273 = class572_sub15.readUnsignedShort(647518597) * -843611945;
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(708928991);
			if (0 == i)
				break;
			method5546(class572_sub15, i, (byte) -86);
		}
	}

	public void method110() {
		anInt5265 = -1447283813 * (850131603 * anInt5265 << 8 | ((Class468) this).anInt5258 * 1945162987);
	}

	public void method112() {
		anInt5265 = -1447283813 * (850131603 * anInt5265 << 8 | ((Class468) this).anInt5258 * 1945162987);
	}

	public void method103() {
		anInt5265 = -1447283813 * (850131603 * anInt5265 << 8 | ((Class468) this).anInt5258 * 1945162987);
	}

	public void method469(int i) {
		((Class468) this).anInt5258 = -223792189 * i;
	}

	void method5548(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt5260 = Class63.method1019(class572_sub15.read24BitInt(1140925462), 1473454257) * -1586913819;
		else if (i == 2)
			anInt5261 = class572_sub15.readUnsignedByte(1486092539) * -405976453;
		else if (3 == i) {
			anInt5261 = class572_sub15.readUnsignedShort(647518597) * -405976453;
			if (65535 == -1569651533 * anInt5261)
				anInt5261 = 405976453;
		} else if (5 == i)
			aBool5262 = false;
		else if (7 == i)
			anInt5271 = Class63.method1019(class572_sub15.read24BitInt(1140925462), 1473454257) * 1313023257;
		else if (8 == i)
			((Class468) this).aBool5274 = true;
		else if (9 == i)
			anInt5264 = (class572_sub15.readUnsignedShort(647518597) << 2) * -8282637;
		else if (10 == i)
			aBool5272 = false;
		else if (11 == i)
			anInt5265 = class572_sub15.readUnsignedByte(211927751) * -1447283813;
		else if (12 == i)
			aBool5267 = true;
		else if (i == 13)
			anInt5268 = class572_sub15.read24BitInt(1140925462) * 1498836699;
		else if (14 == i)
			anInt5269 = (class572_sub15.readUnsignedByte(928954321) << 2) * -337664827;
		else if (i == 16)
			anInt5270 = class572_sub15.readUnsignedByte(799026481) * -586771577;
		else if (20 == i)
			anInt5266 = class572_sub15.readUnsignedShort(647518597) * 2082490479;
		else if (21 == i)
			anInt5259 = class572_sub15.readUnsignedByte(1102160604) * 961888831;
		else if (22 == i)
			anInt5273 = class572_sub15.readUnsignedShort(647518597) * -843611945;
	}

	static int method5549(int i) {
		if (i == 16711935)
			return -1;
		return Class665_Sub32.method9159(i, -1662966131);
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_2_ = class572_sub15.readUnsignedByte(323987748);
			if (0 == i_2_)
				break;
			method5546(class572_sub15, i_2_, (byte) -102);
		}
	}

	static int method5550(int i) {
		if (i == 16711935)
			return -1;
		return Class665_Sub32.method9159(i, -1662966131);
	}

	static int method5551(int i) {
		if (i == 16711935)
			return -1;
		return Class665_Sub32.method9159(i, -1662966131);
	}

	public void method104(byte i) {
		anInt5265 = -1447283813 * (850131603 * anInt5265 << 8 | ((Class468) this).anInt5258 * 1945162987);
	}

	static int method5552(int i) {
		if (i == 16711935)
			return -1;
		return Class665_Sub32.method9159(i, -1662966131);
	}

	static final void method5553(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt784 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * -352385029;
		Class555.method6575(class73, (short) 8084);
	}

	static final void method5554(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class184.method2829(class73, class83, class441, 1148836882);
	}

	static final void method5555(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class388.method4692(class73, class83, class441, 2141946791);
	}

	static final void method5556(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10542(-487796393);
	}

	public static void method5557(int i, byte i_3_) {
		if (i < 0 || i > 2)
			i = 0;
		Class491.anInt5481 = i * -1062209337;
		Class491.aClass485Array5470 = new Class485[1 + (Class100.anIntArray1291[Class491.anInt5481 * -1664530185])];
		Class491.anInt5479 = 0;
		Class491.anInt5472 = 0;
	}
}

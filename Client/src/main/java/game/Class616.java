package game;

/* Class616 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class616 {
	static final int anInt8041 = 32768;
	Class127 aClass127_8042 = new Class127(64);
	Class248 aClass248_8043;
	static final int anInt8044 = 0;
	Class248 aClass248_8045;
	static Class248 aClass248_8046;

	public Class572_Sub12_Sub14 method7372(int i, int i_0_) {
		Class572_Sub12_Sub14 class572_sub12_sub14 = ((Class572_Sub12_Sub14) ((Class616) this).aClass127_8042.method2246((long) i));
		if (null != class572_sub12_sub14)
			return class572_sub12_sub14;
		byte[] is;
		if (i >= 32768)
			is = ((Class616) this).aClass248_8045.getFile(0, i & 0x7fff, 741480020);
		else
			is = ((Class616) this).aClass248_8043.getFile(0, i, 695818074);
		class572_sub12_sub14 = new Class572_Sub12_Sub14();
		if (null != is)
			class572_sub12_sub14.method10410(new RSByteBuffer(is), -2084132891);
		if (i >= 32768)
			class572_sub12_sub14.method10415((short) 8192);
		((Class616) this).aClass127_8042.method2229(class572_sub12_sub14, (long) i);
		return class572_sub12_sub14;
	}

	public Class616(Class435 class435, Class248 class248, Class248 class248_1_) {
		((Class616) this).aClass248_8043 = class248;
		((Class616) this).aClass248_8045 = class248_1_;
		if (((Class616) this).aClass248_8043 != null)
			((Class616) this).aClass248_8043.method3376(0, 2035188271);
		if (null != ((Class616) this).aClass248_8045)
			((Class616) this).aClass248_8045.method3376(0, -428302196);
	}

	static final void method7373(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class26.method756(class73, class83, class441, 796850795);
	}

	static final void method7374(Cs2Executor class441, int i) {
		long l = Class69.method1067(-1733719687);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class418.method5109(l);
	}

	static final void method7375(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -507155049 * client.anInt8790;
	}

	static Class375 method7376(RSByteBuffer class572_sub15, int i) {
		Class320 class320 = (Class133_Sub20.method9537(272383510)[class572_sub15.readUnsignedByte(1086502406)]);
		Class300 class300 = (Class480.method5718(-1978579565)[class572_sub15.readUnsignedByte(353835211)]);
		int i_2_ = class572_sub15.readShort(-710976385);
		int i_3_ = class572_sub15.readShort(-710976385);
		int i_4_ = class572_sub15.readUnsignedShort(647518597);
		int i_5_ = class572_sub15.readUnsignedShort(647518597);
		int i_6_ = class572_sub15.readShort(-710976385);
		int i_7_ = class572_sub15.readBigSmart((byte) 20);
		int i_8_ = class572_sub15.readInt(725029118);
		return new Class375(class320, class300, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_);
	}

	static final void method7377(int i, int i_9_, int i_10_) {
		Class192.anInt2310 = -3733871 * i;
		Class192.anInt2300 = -343091919 * i_9_;
		Class192.aBool2307 = false;
		Class10.method544((byte) 1);
	}

	public static boolean method7378(String string, int i) {
		if (null == string)
			return false;
		for (int i_11_ = 0; i_11_ < 351572371 * client.anInt8865; i_11_++) {
			Class23 class23 = client.aClass23Array8650[i_11_];
			if (string.equalsIgnoreCase(class23.aString153))
				return true;
			if (string.equalsIgnoreCase(class23.aString152))
				return true;
		}
		return false;
	}

	static final void method7379(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, 84857897) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray898 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method7380(Cs2Executor class441, int i) {
		int i_12_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_12_, (short) -7639);
		Class83 class83 = Class534.aClass83Array5975[i_12_ >> 16];
		Class193.method2921(class73, class83, class441, (byte) -52);
	}
}

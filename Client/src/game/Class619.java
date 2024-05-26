package game;

/* Class619 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class619 {
	int anInt8059;
	Class281 aClass281_8060;
	int anInt8061;
	static InterfaceDefinitions aClass73_8062;

	int method7411() {
		return -2087184419 * ((Class619) this).anInt8061;
	}

	Class281 method7412(int i) {
		return ((Class619) this).aClass281_8060;
	}

	int method7413() {
		return 1618737055 * ((Class619) this).anInt8059;
	}

	int method7414(byte i) {
		return -2087184419 * ((Class619) this).anInt8061;
	}

	int method7415() {
		return 1618737055 * ((Class619) this).anInt8059;
	}

	int method7416(int i) {
		return 1618737055 * ((Class619) this).anInt8059;
	}

	int method7417() {
		return -2087184419 * ((Class619) this).anInt8061;
	}

	Class619(RSByteBuffer class572_sub15) {
		((Class619) this).aClass281_8060 = ((Class281) Class455.method5387(Class281.method3796(-581680065), class572_sub15.readUnsignedByte(581093005), -1897605557));
		((Class619) this).anInt8059 = class572_sub15.readInt(-678072353) * 681272415;
		if (((Class619) this).aClass281_8060 != Class281.aClass281_3219)
			((Class619) this).anInt8061 = class572_sub15.readInt(-365795646) * -2022967179;
		else
			((Class619) this).anInt8061 = -1996541013 * ((Class619) this).anInt8059;
	}

	static final void method7418(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		if ((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]) < (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]))
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]));
	}

	public static String method7419(long l, int i, int i_0_) {
		Class388.method4694(l);
		int i_1_ = Class273.aCalendar2899.get(5);
		int i_2_ = Class273.aCalendar2899.get(2);
		int i_3_ = Class273.aCalendar2899.get(1);
		if (i == 3)
			return Cs2CallPointer.method5628(l, i, 1279206495);
		return new StringBuilder().append(Integer.toString(i_1_ / 10)).append(i_1_ % 10).append("-").append(Class273.aStringArrayArray2900[i][i_2_]).append("-").append(i_3_).toString();
	}

	static final void method7420(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class51.method908(class73, class83, class441, (byte) -54);
	}
}

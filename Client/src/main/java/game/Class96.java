package game;

/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchWebcamDevice;

public abstract class Class96 {
	static int anInt1254;

	Class96() {
		/* empty */
	}

	public static TwitchWebcamDevice method1548(String string, int i) {
		if (null == Class520.aTwitchWebcamDeviceArray5812)
			return null;
		for (int i_0_ = 0; i_0_ < Class520.aTwitchWebcamDeviceArray5812.length; i_0_++) {
			if (Class520.aTwitchWebcamDeviceArray5812[i_0_].aString2056.equals(string))
				return Class520.aTwitchWebcamDeviceArray5812[i_0_];
		}
		return null;
	}

	static void method1549(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class574.method6806(818066269);
	}

	static final void method1550(Cs2Executor class441, byte i) {
		if (client.rights * -1550439133 >= 2)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = client.rights * -1550439133;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static final void method1551(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class284 class284 = Class549_Sub1.method8097(Class88.aClass248_1226, i_1_, 0, 707569257);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class284.method3833(string, Class14.aClass161Array123, 1061266590);
	}

	static final void method1552(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		Class264 class264 = ((Class264) Class273.aClass639_Sub3_2901.getDefinition(i_3_, -996741601));
		if (class264.method3614(1783094145))
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_2_, 1954972507)).method2293(i_3_, class264.aString2833, (byte) 2);
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(i_2_, 1990451843)).method2292(i_3_, -1132777561 * class264.anInt2832, -627680551));
	}

	static int method1553(char c, Class435 class435, int i) {
		int i_4_ = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i_4_ = 1 + (c << 4);
		}
		if (241 == c && Class435.aClass435_5056 == class435)
			i_4_ = 1762;
		return i_4_;
	}

	public static final void method1554(Class572_Sub29 class572_sub29, boolean bool, boolean bool_5_, int i) {
		int i_6_ = 493419501 * class572_sub29.anInt9301;
		int i_7_ = (int) (381237825124074065L * class572_sub29.hash);
		class572_sub29.method6794((byte) -5);
		if (bool)
			Class7.method506(i_6_, 1674310446);
		Class396.method4759(i_6_, -801958417);
		InterfaceDefinitions class73 = Class512.method6083(i_7_, (short) -1759);
		if (class73 != null)
			Class555.method6575(class73, (short) 24688);
		Class572_Sub12_Sub1.method10223(i_6_, 1172696342);
		if (!bool_5_ && -507155049 * client.anInt8790 != -1)
			Class498.method5945(-507155049 * client.anInt8790, 1, 1673831057);
		Class629 class629 = new Class629(client.aClass676_8760);
		for (Class572_Sub29 class572_sub29_8_ = (Class572_Sub29) class629.method7505(-38616757); class572_sub29_8_ != null; class572_sub29_8_ = (Class572_Sub29) class629.next()) {
			if (!class572_sub29_8_.method6793((short) 150)) {
				class572_sub29_8_ = (Class572_Sub29) class629.method7505(-38616757);
				if (class572_sub29_8_ == null)
					break;
			}
			if (3 == -1157473207 * class572_sub29_8_.anInt9300) {
				int i_9_ = (int) (class572_sub29_8_.hash * 381237825124074065L);
				if (i_9_ >>> 16 == i_6_)
					method1554(class572_sub29_8_, true, bool_5_, 609884548);
			}
		}
	}
}

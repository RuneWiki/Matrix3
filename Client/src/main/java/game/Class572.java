package game;

/* Class572 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572 {
	public Class572 aClass572_6431;
	public long hash;
	public Class572 aClass572_6433;

	public boolean method6793(short i) {
		if (null == aClass572_6431)
			return false;
		return true;
	}

	public void method6794(byte i) {
		if (aClass572_6431 != null) {
			aClass572_6431.aClass572_6433 = aClass572_6433;
			aClass572_6433.aClass572_6431 = aClass572_6431;
			aClass572_6433 = null;
			aClass572_6431 = null;
		}
	}

	public void method6795() {
		if (aClass572_6431 != null) {
			aClass572_6431.aClass572_6433 = aClass572_6433;
			aClass572_6433.aClass572_6431 = aClass572_6431;
			aClass572_6433 = null;
			aClass572_6431 = null;
		}
	}

	public void method6796() {
		if (aClass572_6431 != null) {
			aClass572_6431.aClass572_6433 = aClass572_6433;
			aClass572_6433.aClass572_6431 = aClass572_6431;
			aClass572_6433 = null;
			aClass572_6431 = null;
		}
	}

	public boolean method6797() {
		if (null == aClass572_6431)
			return false;
		return true;
	}

	public boolean method6798() {
		if (null == aClass572_6431)
			return false;
		return true;
	}

	static final void method6799(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class492.method5871(class73, class83, class441, 160737185);
	}

	static final void method6800(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.nvmtheindexisotherone * 411192987;
	}

	public static boolean method6801(char c, byte i) {
		return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
	}
}

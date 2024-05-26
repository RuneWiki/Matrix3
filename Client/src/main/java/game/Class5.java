package game;

/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.FileOutputStream;
import java.util.Date;

public class Class5 implements Interface47 {
	static FileOutputStream aFileOutputStream31;

	public Interface48 method267(Class401 class401, int i) {
		if (Class401.aClass401_4742 == class401)
			return client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
		if (Class401.aClass401_4743 == class401) {
			LinkableObject class572_sub9 = (LinkableObject) client.aClass676_8622.get((long) i);
			if (null != class572_sub9)
				return (Interface48) class572_sub9.anObject9081;
		}
		return null;
	}

	public Interface48 method268(Class401 class401, int i, int i_0_) {
		if (Class401.aClass401_4742 == class401)
			return client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
		if (Class401.aClass401_4743 == class401) {
			LinkableObject class572_sub9 = (LinkableObject) client.aClass676_8622.get((long) i);
			if (null != class572_sub9)
				return (Interface48) class572_sub9.anObject9081;
		}
		return null;
	}

	Class5() {
		/* empty */
	}

	public Interface48 method266(Class401 class401, int i) {
		if (Class401.aClass401_4742 == class401)
			return client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
		if (Class401.aClass401_4743 == class401) {
			LinkableObject class572_sub9 = (LinkableObject) client.aClass676_8622.get((long) i);
			if (null != class572_sub9)
				return (Interface48) class572_sub9.anObject9081;
		}
		return null;
	}

	static String method489(long l) {
		return Class70.method1077(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz", 865659338);
	}

	static final void method490(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_1_, -859015195)).anInt8142) * -1448231669;
	}
}

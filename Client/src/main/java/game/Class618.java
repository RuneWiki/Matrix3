package game;

/* Class618 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Comparator;

class Class618 implements Comparator {
	Class276 this$0;

	public int method7400(Object object, Object object_0_) {
		return method7407((Class285) object, (Class285) object_0_, (byte) 0);
	}

	Class618(Class276 class276) {
		((Class618) this).this$0 = class276;
	}

	public int compare(Object object, Object object_1_) {
		return method7407((Class285) object, (Class285) object_1_, (byte) 0);
	}

	public boolean method7401(Object object) {
		return super.equals(object);
	}

	public int method7402(Object object, Object object_2_) {
		return method7407((Class285) object, (Class285) object_2_, (byte) 0);
	}

	public int method7403(Object object, Object object_3_) {
		return method7407((Class285) object, (Class285) object_3_, (byte) 0);
	}

	public boolean equals(Object object) {
		return super.equals(object);
	}

	public int method7404(Object object, Object object_4_) {
		return method7407((Class285) object, (Class285) object_4_, (byte) 0);
	}

	public int method7405(Object object, Object object_5_) {
		return method7407((Class285) object, (Class285) object_5_, (byte) 0);
	}

	public boolean method7406(Object object) {
		return super.equals(object);
	}

	int method7407(Class285 class285, Class285 class285_6_, byte i) {
		if (((Class285) class285).aLong3418 * 4489260702705940429L > 4489260702705940429L * ((Class285) class285_6_).aLong3418)
			return 1;
		if (((Class285) class285).aLong3418 * 4489260702705940429L < 4489260702705940429L * ((Class285) class285_6_).aLong3418)
			return -1;
		return 0;
	}

	public static boolean method7408(byte i) {
		if (Class589.aString7805.startsWith("win"))
			return true;
		return false;
	}

	static final void method7409(Cs2Executor class441, byte i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_7_, 1549607678));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 532985983 * class631.anInt8174 == 2 ? 1 : 0;
	}

	static final void method7410(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 1295459537;
		int i_8_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_9_ = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]) << 1);
		int i_10_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_11_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 3]);
		int i_12_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 4]);
		int i_13_ = (((Cs2Executor) class441).intStack[5 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_14_ = (((Cs2Executor) class441).intStack[6 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (i_8_ >= 0 && i_8_ < 2 && client.anIntArrayArrayArray8689[i_8_] != null && i_9_ >= 0 && i_9_ < client.anIntArrayArrayArray8689[i_8_].length) {
			client.anIntArrayArrayArray8689[i_8_][i_9_] = new int[] { (i_10_ >> 14 & 0x3fff) << 9, i_11_ << 2, (i_10_ & 0x3fff) << 9, i_14_ };
			client.anIntArrayArrayArray8689[i_8_][1 + i_9_] = new int[] { (i_12_ >> 14 & 0x3fff) << 9, i_13_ << 2, (i_12_ & 0x3fff) << 9 };
		}
	}
}

package game;

/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.List;

public class Class43 {
	List aList440;
	Class54 this$0;

	void method818(Class603 class603, int i) {
		((Class43) this).aList440.add(class603);
	}

	void method819(Class603 class603, int i) {
		((Class43) this).aList440.remove(class603);
	}

	boolean method820(Class603 class603, int i) {
		return ((Class43) this).aList440.contains(class603);
	}

	Class43(Class54 class54) {
		((Class43) this).this$0 = class54;
		((Class43) this).aList440 = new ArrayList();
	}

	List method821(int i) {
		return ((Class43) this).aList440;
	}
}

package game;

/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class IOException_Sub1 extends IOException {
	IOException_Sub1(String string) {
		super(string);
	}

	public static void method10593(Class530 class530, int i, int i_0_, Entity class456_sub1_sub2_sub3, int i_1_, int i_2_) {
		Cs2Executor class441 = Class519.getCachedExecutor(-1452806256);
		((Cs2Executor) class441).entity = class456_sub1_sub2_sub3;
		((Cs2Executor) class441).anInt5122 = 1149743701 * i_1_;
		Class309.method4041(class530, i, i_0_, class441, -627862136);
		((Cs2Executor) class441).entity = null;
		((Cs2Executor) class441).anInt5122 = -1149743701;
	}
}

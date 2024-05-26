package game;

/* Exception_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub5 extends Exception {
	public String aString11239;
	public int anInt11240;

	Exception_Sub5(int i, String string) {
		this(i, string, null);
	}

	Exception_Sub5(int i, String string, Throwable throwable) {
		super(throwable);
		aString11239 = string;
		anInt11240 = i * 1335899213;
	}
}

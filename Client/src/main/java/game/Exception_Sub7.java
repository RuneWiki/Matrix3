package game;

/* Exception_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Exception_Sub7 extends Exception {
	public String aString11241;
	public int anInt11242;

	public Exception_Sub7(int i, String string, Throwable throwable) {
		super(throwable);
		aString11241 = string;
		anInt11242 = -1601522025 * i;
	}

	public Exception_Sub7(int i, String string) {
		this(i, string, null);
	}
}

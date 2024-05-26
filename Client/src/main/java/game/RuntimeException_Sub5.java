package game;

/* RuntimeException_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RuntimeException_Sub5 extends RuntimeException {
	public static String aString11783;
	static long aLong11784;
	public static int anInt11785;
	public static int anInt11786;
	String aString11787;
	Throwable aThrowable11788;

	RuntimeException_Sub5(Throwable throwable, String string) {
		((RuntimeException_Sub5) this).aString11787 = string;
		((RuntimeException_Sub5) this).aThrowable11788 = throwable;
		initCause(throwable);
	}
}

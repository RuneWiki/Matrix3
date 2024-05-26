package game;

/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class437 {
	public static Class437 aClass437_5068;
	static Class437 aClass437_5069;
	static Class437 aClass437_5070;
	static Class437 aClass437_5071;
	public static Class437 aClass437_5072 = new Class437("runescape", "RuneScape", 0, PacketsDecoder.aClass207_2420);
	static Class437 aClass437_5073;
	public String aString5074;
	public String aString5075;
	public int anInt5076;

	static {
		aClass437_5068 = new Class437("stellardawn", "Stellar Dawn", 1, PacketsDecoder.aClass207_2422);
		aClass437_5070 = new Class437("game3", "Game 3", 2, PacketsDecoder.aClass207_2420);
		aClass437_5069 = new Class437("game4", "Game 4", 3, PacketsDecoder.aClass207_2429);
		aClass437_5071 = new Class437("game5", "Game 5", 4, PacketsDecoder.aClass207_2427);
		aClass437_5073 = new Class437("oldscape", "RuneScape 2007", 5, PacketsDecoder.aClass207_2420);
	}

	Class437(String string, String string_0_, int i, PacketsDecoder class207) {
		aString5074 = string;
		aString5075 = string_0_;
		anInt5076 = 184969305 * i;
	}
}

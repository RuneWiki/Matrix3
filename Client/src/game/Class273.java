package game;

/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

public class Class273 {
	static Calendar aCalendar2898;
	static Calendar aCalendar2899;
	static String[][] aStringArrayArray2900 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
		{ "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" },
		{ "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" },
		{ "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" },
		{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
	public static Class639_Sub3 aClass639_Sub3_2901;
	static Class461 aClass461_2902;

	static {
		aCalendar2899 = Calendar.getInstance();
		aCalendar2898 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	public static int method3679(long l) {
		Class388.method4694(l);
		return aCalendar2899.get(1);
	}

	Class273() throws Throwable {
		throw new Error();
	}

	static final void method3680(Cs2Executor class441, int i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) 4458);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class508.method6040(class73, class83, class441, -1287939067);
	}
}

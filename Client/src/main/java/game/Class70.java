package game;

/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class70 {
	public static final long aLong704 = 60000L;
	public static final long aLong705 = 1000L;
	static HashMap aHashMap706 = new HashMap();
	static Map aMap707;
	static short aShort708;

	static TimeZone method1074(String string, int i) {
		synchronized (aHashMap706) {
			TimeZone timezone = (TimeZone) aHashMap706.get(string);
			if (timezone == null) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap706.put(string, timezone);
			}
			TimeZone timezone_0_ = timezone;
			return timezone_0_;
		}
	}

	Class70() throws Throwable {
		throw new Error();
	}

	static String method1075(Date date, String string, TimeZone timezone, Class435 class435, int i) {
		if (aMap707 == null) {
			aMap707 = new HashMap(7);
			Class435[] class435s = Class435.method5262(-1307437821);
			for (int i_1_ = 0; i_1_ < class435s.length; i_1_++) {
				Class435 class435_2_ = class435s[i_1_];
				aMap707.put(class435_2_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap707.get(class435);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class435.method5256(-562408778));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_3_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_3_;
	}

	static TimeZone method1076(int i) {
		return method1074("Europe/London", -643041006);
	}

	static {
		Calendar.getInstance(method1074("Europe/London", 1979715667));
	}

	public static String method1077(Date date, String string, int i) {
		return method1075(date, string, method1076(1900612860), Class435.aClass435_5054, 344247929);
	}

	static Class512[] method1078(byte i) {
		return (new Class512[] { Class512.aClass512_5700, Class512.aClass512_5699, Class512.aClass512_5701 });
	}

	static final void method1079(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_4_, (short) -12337);
		Class83 class83 = Class534.aClass83Array5975[i_4_ >> 16];
		Class658_Sub5.method9027(class73, class83, class441, -1414734042);
	}

	static Class543 method1080(Class456_Sub1_Sub2 class456_sub1_sub2, byte i) {
		Class543 class543;
		if (null == Class543.aClass543_6102)
			class543 = new Class543();
		else {
			class543 = Class543.aClass543_6102;
			Class543.aClass543_6102 = Class543.aClass543_6102.aClass543_6100;
			class543.aClass543_6100 = null;
			Class543.anInt6101 -= -245145309;
		}
		class543.aClass456_Sub1_Sub2_6099 = class456_sub1_sub2;
		return class543;
	}
}

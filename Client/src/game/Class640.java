package game;

/* Class640 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;

public class Class640 {
	Class640() throws Throwable {
		throw new Error();
	}

	public static void method7589(Class106 class106, Class248 class248, int i) {
		Class87[] class87s = Class160.method2573(class248, 70190271 * Class1.anInt10, 0);
		Class1.aClass161Array11 = new Class161[class87s.length];
		for (int i_0_ = 0; i_0_ < class87s.length; i_0_++)
			Class1.aClass161Array11[i_0_] = class106.method1711(class87s[i_0_], true);
		class87s = Class160.method2573(class248, 2035300345 * Class587.anInt7782, 0);
		Class572_Sub40.aClass161Array9402 = new Class161[class87s.length];
		for (int i_1_ = 0; i_1_ < class87s.length; i_1_++)
			Class572_Sub40.aClass161Array9402[i_1_] = class106.method1711(class87s[i_1_], true);
		class87s = Class160.method2573(class248, 1784828941 * Class1.anInt13, 0);
		Class409.aClass161Array4784 = new Class161[class87s.length];
		int i_2_ = 25;
		for (int i_3_ = 0; i_3_ < class87s.length; i_3_++) {
			class87s[i_3_].method1300(-i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0));
			Class409.aClass161Array4784[i_3_] = class106.method1711(class87s[i_3_], true);
		}
		class87s = Class160.method2573(class248, -159010103 * Class1.anInt17, 0);
		Class481.aClass161Array5362 = new Class161[class87s.length];
		for (int i_4_ = 0; i_4_ < class87s.length; i_4_++)
			Class481.aClass161Array5362[i_4_] = class106.method1711(class87s[i_4_], true);
		class87s = Class160.method2573(class248, -131560899 * Class567.anInt6380, 0);
		Class628_Sub1.aClass161Array9537 = new Class161[class87s.length];
		i_2_ = 12;
		for (int i_5_ = 0; i_5_ < class87s.length; i_5_++) {
			class87s[i_5_].method1300(-i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0));
			Class628_Sub1.aClass161Array9537[i_5_] = class106.method1711(class87s[i_5_], true);
		}
		class87s = Class160.method2573(class248, -728770177 * Class1.anInt15, 0);
		Class14.aClass161Array123 = new Class161[class87s.length];
		i_2_ = 12;
		for (int i_6_ = 0; i_6_ < class87s.length; i_6_++) {
			class87s[i_6_].method1300(-i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0), -i_2_ + (int) (Math.random() * (double) i_2_ * 2.0));
			Class14.aClass161Array123[i_6_] = class106.method1711(class87s[i_6_], true);
		}
		Class121.aClass161_1478 = class106.method1711(Class160.method2571(class248, (568642775 * (Class402_Sub1.anInt9683)), 0), true);
		Class458.aClass161_5208 = class106.method1711(Class160.method2571(class248, (-1874210791 * Class67.anInt693), 0), true);
		class87s = Class160.method2573(class248, Class562.anInt6357 * -2139618225, 0);
		Class80.aClass161Array1075 = new Class161[class87s.length];
		for (int i_7_ = 0; i_7_ < class87s.length; i_7_++)
			Class80.aClass161Array1075[i_7_] = class106.method1711(class87s[i_7_], true);
	}

	static void method7590(Object object, byte i) {
		if (null != Class269.anEventQueue2862) {
			for (int i_8_ = 0; i_8_ < 50 && Class269.anEventQueue2862.peekEvent() != null; i_8_++)
				Class198.method2977(1L);
			try {
				if (null != object)
					Class269.anEventQueue2862.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	static final void method7591(Cs2Executor class441, int i) {
		Class572_Sub19 class572_sub19 = Class445.method5338((byte) 99);
		if (class572_sub19 == null) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class572_sub19.anInt9142 * 295399623;
			int i_9_ = (-824779163 * class572_sub19.anInt9139 << 28 | (class572_sub19.anInt9140 * -1389911785 + Class547.anInt6143) << 14 | (Class547.anInt6165 + 599105849 * class572_sub19.anInt9141));
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = i_9_;
		}
	}

	public static void method7592(String string, Throwable throwable, int i) {
		try {
			String string_10_ = "";
			if (null != throwable)
				string_10_ = Class71.method1085(throwable, 1845616440);
			if (null != string) {
				if (throwable != null)
					string_10_ = new StringBuilder().append(string_10_).append(" | ").toString();
				string_10_ = new StringBuilder().append(string_10_).append(string).toString();
			}
			Class639_Sub13.method8950(string_10_, 584797176);
			string_10_ = Class537.method6384(string_10_, 938880374);
			if (Class133_Sub8.anApplet9854 != null) {
				String string_11_ = "Unknown";
				String string_12_ = "1.1";
				try {
					string_11_ = System.getProperty("java.vendor");
					string_12_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url = (new URL(Class133_Sub8.anApplet9854.getCodeBase(), new StringBuilder().append("clienterror.ws?c=").append(-171441875 * RuntimeException_Sub5.anInt11785).append("&cs=").append(-1027202753 * RuntimeException_Sub5.anInt11786).append("&u=").append(null != RuntimeException_Sub5.aString11783 ? Class537.method6384((RuntimeException_Sub5.aString11783), 1608434396) : new StringBuilder().append("").append(7181665065727514187L * RuntimeException_Sub5.aLong11784).toString()).append("&v1=").append(Class537.method6384(string_11_, 987529668)).append("&v2=").append(Class537.method6384(string_12_, 626108927)).append("&e=").append(string_10_).toString()));
				DataInputStream datainputstream = new DataInputStream(url.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}

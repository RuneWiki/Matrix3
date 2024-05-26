package game;

/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class191 {
	static final short aShort2247 = 2;
	static final short aShort2248 = 3;
	static final short aShort2249 = 4;
	static final short aShort2250 = 1001;
	static final short aShort2251 = 6;
	static final short aShort2252 = 21;
	static final short aShort2253 = 9;
	static final short aShort2254 = 53;
	static final short aShort2255 = 11;
	static final short aShort2256 = 12;
	static final short aShort2257 = 13;
	static final short aShort2258 = 15;
	static final short aShort2259 = 16;
	static final short aShort2260 = 17;
	static final short aShort2261 = 18;
	static final short aShort2262 = 58;
	static final short aShort2263 = 20;
	static final short aShort2264 = 1004;
	static final short aShort2265 = 22;
	static final short aShort2266 = 23;
	static final short aShort2267 = 25;
	static final short aShort2268 = 57;
	static final short aShort2269 = 44;
	static final short aShort2270 = 45;
	static final short aShort2271 = 46;
	static final short aShort2272 = 47;
	static final short aShort2273 = 48;
	static final short aShort2274 = 49;
	static final short aShort2275 = 50;
	static final short aShort2276 = 51;
	static final short aShort2277 = 52;
	static final short aShort2278 = 5;
	static final short aShort2279 = 1010;
	static final short aShort2280 = 10;
	static final short aShort2281 = 59;
	static final short aShort2282 = 60;
	static final short aShort2283 = 30;
	static final short aShort2284 = 8;
	static final short aShort2285 = 1003;
	static final short aShort2286 = 19;
	static final short aShort2287 = 1006;
	static final short aShort2288 = 1007;
	static final short aShort2289 = 1008;
	static final short aShort2290 = 1009;
	static final short aShort2291 = 1002;
	static final short aShort2292 = 1011;
	static final short aShort2293 = 1012;
	public static Class161 aClass161_2294;

	Class191() throws Throwable {
		throw new Error();
	}

	public static Class549 method2891(Component component, short i) {
		return new Class549_Sub1(component);
	}

	public static void method2892(int i) {
		Class477.aClass131_5333.method2285(36160);
	}

	public static void method2893(Class591 class591, Class591 class591_0_, byte i) {
		if (null != class591.aClass591_7814)
			class591.method7002((byte) 47);
		class591.aClass591_7814 = class591_0_;
		class591.aClass591_7815 = class591_0_.aClass591_7815;
		class591.aClass591_7814.aClass591_7815 = class591;
		class591.aClass591_7815.aClass591_7814 = class591;
	}

	static byte method2894(int i, int i_1_, byte i_2_) {
		if (i != Class516.aClass516_5720.anInt5742 * 1870735441)
			return (byte) 0;
		if ((i_1_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	static String method2895(int[] is, int i) {
		StringBuilder stringbuilder = new StringBuilder();
		int i_3_ = Class133_Sub2.anInt9829 * -1283603011;
		for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
			Class386 class386 = ((Class386) Class300.aClass635_Sub2_3488.getDefinition(is[i_4_], -565729607));
			if (class386.anInt4621 * 1133566825 != -1) {
				Class161 class161 = (Class161) (Class25.aClass127_194.method2246((long) (1133566825 * class386.anInt4621)));
				if (null == class161) {
					Class87 class87 = Class160.method2571(Class582.aClass248_7725, class386.anInt4621 * 1133566825, 0);
					if (null != class87) {
						class161 = Class272_Sub2.aClass106_9517.method1711(class87, true);
						Class25.aClass127_194.method2229(class161, (long) (1133566825 * class386.anInt4621));
					}
				}
				if (class161 != null) {
					Class44.aClass161Array443[i_3_] = class161;
					stringbuilder.append(" <img=").append(i_3_).append(">");
					i_3_++;
				}
			}
		}
		return stringbuilder.toString();
	}

	static final void method2896(Cs2Executor class441, int i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Character.toUpperCase((char) i_5_);
	}

	static final void method2897(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class255.method3526(class73, class83, class441, -698856180);
	}
}

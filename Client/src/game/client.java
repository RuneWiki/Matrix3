package game;

/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;

import javax.imageio.ImageIO;

public final class client extends Class584 {
	public static Interface1 anInterface1_8558;
	public static boolean aBool8559;
	static int anInt8560;
	static String aString8561;
	static int[] anIntArray8562;
	static int anInt8563;
	public static boolean aBool8564;
	public static byte[] aByteArray8565;
	public static int anInt8566;
	public static int anInt8567;
	public static boolean aBool8568;
	public static boolean aBool8569;
	static String aString8570;
	public static String aString8571;
	static String aString8572;
	static boolean aBool8573;
	static boolean aBool8574;
	public static int[] anIntArray8575;
	public static int anInt8576;
	public static int anInt8577;
	static int anInt8578;
	public static String aString8579;
	public static int anInt8580;
	static Class250 aClass250_8581;
	static Class261 aClass261_8582;
	static Class127 aClass127_8583;
	static long aLong8584;
	public static boolean aBool8585;
	static boolean aBool8586;
	public static int anInt8587;
	public static int cycles;
	public static Class195 aClass195_8589;
	static int anInt8590;
	static boolean aBool8591;
	public static Class195[] aClass195Array8592;
	public static Class193[] aClass193Array8593;
	public static Class575[] aClass575Array8594;
	static int anInt8595;
	public static boolean aBool8596;
	static int[] anIntArray8597;
	static int anInt8598;
	public static boolean aBool8599;
	public static int anInt8600;
	public static Object anObject8601;
	public static boolean aBool8602;
	static InterfaceDefinitions aClass73_8603;
	public static int anInt8604;
	public static Class613 aClass613_8605;
	static int anInt8606;
	public static Interface64[] anInterface64Array8607;
	static final int anInt8608 = 77;
	public static int anInt8609;
	public static Interface64[] anInterface64Array8610;
	public static Color[] aColorArray8611;
	static boolean aBool8612;
	public static Color[] aColorArray8613;
	static int anInt8614;
	static int anInt8615;
	public static int anInt8616;
	public static int anInt8617;
	static Class127 aClass127_8618;
	static String aString8619;
	static int anInt8620;
	public static boolean aBool8621;
	public static Class676 aClass676_8622;
	public static LinkableObject[] aClass572_Sub9Array8623;
	public static int anInt8624;
	public static int anInt8625;
	public static int[] anIntArray8626;
	static int anInt8627;
	static int[] anIntArray8628;
	static int anInt8629;
	static int[] anIntArray8630;
	static Class127 aClass127_8631;
	public static Class195 aClass195_8632;
	static boolean aBool8633;
	static int[] anIntArray8634;
	public static int anInt8635;
	static boolean aBool8636;
	static int anInt8637;
	static int anInt8638;
	static int anInt8639;
	static Class261 aClass261_8640;
	static final int anInt8641 = 132;
	static int[] anIntArray8642;
	static final int anInt8643 = 63;
	static int anInt8644;
	public static int anInt8645;
	public static int anInt8646;
	public static boolean aBool8647;
	static int anInt8648;
	static int anInt8649;
	public static Class23[] aClass23Array8650;
	public static int anInt8651;
	public static int anInt8652;
	public static int anInt8653;
	public static int anInt8654;
	public static int anInt8655;
	static int[] anIntArray8656;
	static boolean aBool8657;
	static int[] anIntArray8658;
	public static boolean aBool8659;
	static float aFloat8660;
	static final int anInt8661 = -2;
	static int anInt8662;
	static int anInt8663;
	static int anInt8664;
	static int anInt8665;
	static int anInt8666;
	static boolean[] aBoolArray8667;
	public static short aShort8668;
	static int anInt8669;
	static int anInt8670;
	static int anInt8671;
	static int anInt8672;
	static Random aRandom8673;
	static int anInt8674;
	public static int anInt8675;
	static int anInt8676;
	public static float[] aFloatArray8677;
	public static float aFloat8678;
	static float aFloat8679;
	public static int anInt8680;
	static boolean aBool8681;
	static boolean aBool8682;
	public static int anInt8683;
	public static int anInt8684;
	public static boolean aBool8685;
	static int anInt8686;
	public static final int anInt8687 = 2;
	static final int anInt8688 = 65535;
	public static int[][][] anIntArrayArrayArray8689;
	public static int anInt8690;
	static final int anInt8691 = -1845493760;
	public static int anInt8692;
	public static short aShort8693;
	public static Object anObject8694;
	static int[] anIntArray8695;
	public static int anInt8696;
	static boolean aBool8697;
	static boolean aBool8698;
	public static int anInt8699;
	static int[] anIntArray8700;
	static int[] anIntArray8701;
	public static int anInt8702;
	static Class652 aClass652_8703;
	static int anInt8704;
	public static Class437 aClass437_8705 = null;
	static int anInt8706;
	static int anInt8707;
	static Rectangle[] aRectangleArray8708;
	public static int anInt8709;
	static int anInt8710;
	public static int anInt8711;
	static final int anInt8712 = 2;
	public static int[] anIntArray8713;
	static int anInt8714;
	static int anInt8715;
	static int[] anIntArray8716;
	static int[] anIntArray8717;
	static int[] anIntArray8718;
	static int[] anIntArray8719;
	static long aLong8720;
	static boolean aBool8721;
	static int[] anIntArray8722;
	static int anInt8723;
	public static int anInt8724;
	public static int anInt8725;
	public static final int anInt8726 = 2048;
	public static Player[] aClass456_Sub1_Sub2_Sub3_Sub2Array8727;
	public static int anInt8728;
	static int anInt8729;
	public static int anInt8730;
	public static boolean aBool8731;
	public static String aString8732;
	static int anInt8733;
	public static boolean aBool8734;
	static int[] anIntArray8735;
	static boolean aBool8736;
	static long aLong8737;
	public static boolean aBool8738;
	static final int anInt8739 = 8;
	static short[] aShortArray8740;
	static int[] anIntArray8741;
	static String[] aStringArray8742;
	static int anInt8743;
	static int anInt8744;
	public static Class675 aClass675_8745;
	public static int rights;
	public static Class676 aClass676_8747;
	public static Class652 aClass652_8748;
	public static Class676 aClass676_8749;
	public static int anInt8750;
	static int anInt8751;
	public static int anInt8752;
	public static int anInt8753;
	public static boolean aBool8754;
	static int anInt8755;
	static int anInt8756;
	public static String aString8757;
	static final int anInt8758 = 5439488;
	public static Class455 aClass455_8759;
	public static Class676 aClass676_8760;
	static int anInt8761;
	public static InterfaceDefinitions aClass73_8762;
	static boolean aBool8763;
	static Map aMap8764;
	public static int anInt8765;
	static int anInt8766;
	static long aLong8767;
	public static boolean aBool8768;
	static boolean aBool8769;
	public static InterfaceDefinitions aClass73_8770;
	public static InterfaceDefinitions aClass73_8771;
	static int anInt8772;
	static int anInt8773;
	public static Class675 aClass675_8774;
	static boolean aBool8775;
	public static Interface19 anInterface19_8776;
	static int anInt8777;
	static int anInt8778;
	static int anInt8779;
	static boolean aBool8780;
	static final int anInt8781 = 0;
	static int anInt8782;
	static boolean aBool8783;
	public static boolean[] aBoolArray8784;
	static boolean aBool8785;
	static boolean aBool8786;
	static int anInt8787;
	static final int anInt8788 = 64;
	public static int anInt8789;
	public static volatile int anInt8790;
	static int anInt8791;
	public static int anInt8792;
	static int anInt8793;
	static int[] anIntArray8794;
	static int anInt8795;
	static int[] anIntArray8796;
	static int anInt8797;
	static int[] anIntArray8798;
	static int anInt8799;
	static int[] anIntArray8800;
	public static short aShort8801;
	public static int anInt8802;
	static int anInt8803;
	public static int anInt8804;
	static int anInt8805;
	static int anInt8806;
	static final int anInt8807 = 1;
	public static int anInt8808;
	static final int anInt8809 = 9568256;
	public static Class592[] exchangeSlots;
	static int anInt8811;
	public static Class675 aClass675_8812;
	static Class675 aClass675_8813;
	public static int anInt8814;
	static Class676 aClass676_8815;
	public static final int anInt8816 = 107;
	static int anInt8817;
	static int anInt8818;
	static int anInt8819;
	static boolean[] aBoolArray8820;
	public static int anInt8821;
	public static float aFloat8822;
	public static short aShort8823;
	public static int anInt8824;
	static int anInt8825;
	static int anInt8826;
	static int[] anIntArray8827;
	static int[] anIntArray8828;
	static Class583[] aClass583Array8829;
	static int[] anIntArray8830;
	public static int anInt8831;
	static int[] anIntArray8832;
	static final int anInt8833 = 4095;
	static long[] aLongArray8834;
	static final int anInt8835 = 100;
	static int anInt8836;
	public static String aString8837;
	static String aString8838;
	public static int anInt8839;
	static boolean aBool8840;
	static final int anInt8841 = 5;
	static boolean[] aBoolArray8842;
	static int[] anIntArray8843;
	static int anInt8844;
	static int anInt8845;
	static int anInt8846;
	static boolean aBool8847;
	static int[] anIntArray8848;
	public static short aShort8849;
	public static int anInt8850;
	public static short aShort8851;
	public static short aShort8852;
	public static short aShort8853;
	public static boolean aBool8854;
	static int anInt8855;
	public static volatile boolean aBool8856;
	static final int anInt8857 = -754974720;
	static int anInt8858;
	static int anInt8859;
	public static int anInt8860;
	public static int anInt8861;
	static final int anInt8862 = 400;
	public static Class26[] aClass26Array8863;
	static Class652 aClass652_8864;
	public static int anInt8865;
	static final int anInt8866 = 400;
	public static boolean aBool8867;
	static int anInt8868;
	static int anInt8869;
	static int anInt8870;
	static boolean aBool8871;
	static Calendar aCalendar8872;
	public static Interface62 anInterface62_8873;
	static boolean aBool8874;
	static long aLong8875;
	static Class5 aClass5_8876;
	static int anInt8877;
	static final int anInt8878 = 1179648;
	static final int anInt8879 = 5373952;
	public static InterfaceDefinitions aClass73_8880;
	static final int anInt8881 = 13762560;
	static final int anInt8882 = 301989888;
	static final int anInt8883 = 1375731712;
	static Class675 aClass675_8884;
	static final int anInt8885 = -771751936;
	static final int anInt8886 = 1245184;
	public static String aString8887;
	static final int anInt8888 = 9633792;
	static final int anInt8889 = 13828096;
	static final int anInt8890 = 318767104;
	static final int anInt8891 = 1392508928;
	static final int anInt8892 = -1828716544;
	public static Color[] aColorArray8893;
	static int[] anIntArray8894;

	public final void init() {
		if (method6897(-1715178556)) {
			String string = "";
			Class328[] class328s = Class570_Sub1.method8797(-72767905);
			for (int i = 0; i < class328s.length; i++) {
				Class328 class328 = class328s[i];
				String string_0_ = VarTransmitLevel.anApplet8067.getParameter(class328.aString4200);
				if (null != string_0_) {
					switch (Integer.parseInt(class328.aString4200)) {
						case 24:
							aString8571 = string_0_;
							break;
						case 31:
							if (string_0_.equals(Class3.aString29))
								aBool8602 = true;
							else
								aBool8602 = false;
							break;
						case 28:
							Class572_Sub25.aString9256 = string_0_;
							break;
						case 21:
							break;
						case 41:
							if (string_0_.equalsIgnoreCase(Class3.aString29))
								aBool8840 = true;
							else
								aBool8840 = false;
							break;
						case 9:
							if (string_0_ != null) {
								aByteArray8565 = (Class129.method2263(Class413.method5083(string_0_, 1171848968), (byte) 113));
								if (aByteArray8565.length < 16)
									aByteArray8565 = null;
							}
							break;
						case 38:
							Class151.aClass434_1702 = ((Class434) Class455.method5387(Class434.method5251(69832437), Integer.parseInt(string_0_), -1984963355));
							if (Class151.aClass434_1702 == Class434.aClass434_5047)
								Class151.aClass434_1702 = Class434.aClass434_5039;
							else if (!(Class151.aClass434_1702.method5252(Class440.aClass440_5094, 1942219385)) && (Class434.aClass434_5044 != Class151.aClass434_1702))
								Class151.aClass434_1702 = Class434.aClass434_5044;
							break;
						case 23:
							anInt8773 = Integer.parseInt(string_0_) * 32360817;
							break;
						case 35:
							aString8570 = string_0_;
							if (aString8570.length() > 100)
								aString8570 = null;
							break;
						case 27:
							if (Class633.aClass641_8208 == null)
								Class633.aClass641_8208 = new RSSocket(true);
							Class633.aClass641_8208.id = Integer.parseInt(string_0_) * -1002799573;
							break;
						case 14:
							anInt8808 = Integer.parseInt(string_0_) * 219718357;
							break;
						case 4:
							if (string_0_.equalsIgnoreCase(Class3.aString29))
								aBool8612 = true;
							else
								aBool8612 = false;
							break;
						case 10:
							Class133_Sub19.aString10255 = string_0_;
							break;
						case 29:
							if (string_0_.equals(Class3.aString29))
								aBool8564 = true;
							else
								aBool8564 = false;
							break;
						case 1:
							Class7.aString38 = string_0_;
							break;
						case 16:
							if (string_0_.equalsIgnoreCase(Class3.aString29)) {
								/* empty */
							}
							break;
						case 40:
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(true);
							Class633.aClass641_8196.address = string_0_;
							break;
						default:
							Class640.method7592("", new RuntimeException(), 1141251342);
							break;
						case 32:
							if (string_0_.equalsIgnoreCase(Class3.aString29))
								aBool8574 = true;
							else
								aBool8574 = false;
							break;
						case 39:
							Class633.aClass641_8203 = new RSSocket(false);
							Class633.aClass641_8203.id = Integer.parseInt(string_0_) * -1002799573;
							break;
						case 34:
							break;
						case 20:
							if (Class633.aClass641_8208 == null)
								Class633.aClass641_8208 = new RSSocket(true);
							Class633.aClass641_8208.address = string_0_;
							break;
						case 5:
							anInt8566 = Integer.parseInt(string_0_) * -1373900613;
							break;
						case 12:
							if (string_0_.equalsIgnoreCase(Class3.aString29))
								aBool8659 = true;
							break;
						case 26:
							aString8561 = string_0_;
							break;
						case 25:
							Class594.aClass435_7823 = Class435.method5257(Integer.parseInt(string_0_), 16711680);
							break;
						case 6:
							if (string_0_.equalsIgnoreCase(Class3.aString29))
								aBool8621 = true;
							else
								aBool8621 = false;
							break;
						case 2:
							Class34.aClass653_383 = Class310.method4048(Integer.parseInt(string_0_), 1179466163);
							if (Class34.aClass653_383 != Class653.aClass653_8394 && Class34.aClass653_383 != Class653.aClass653_8393 && Class34.aClass653_383 != Class653.aClass653_8395 && (Class653.aClass653_8396 != Class34.aClass653_383))
								Class34.aClass653_383 = Class653.aClass653_8396;
							break;
						case 36:
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(true);
							Class633.aClass641_8196.id = Integer.parseInt(string_0_) * -1002799573;
							break;
						case 37:
							break;
						case 8:
							aString8579 = string_0_;
							break;
						case 18:
							aString8838 = string_0_;
							break;
						case 7:
							break;
						case 42:
							string = string_0_;
							break;
						case 15:
							aString8572 = string_0_;
							break;
						case 11:
							if (string_0_.equalsIgnoreCase(Class3.aString29))
								aBool8559 = true;
							else
								aBool8559 = false;
							break;
						case 43:
							anInt8567 = Integer.parseInt(string_0_) * 588589493;
							break;
						case 33:
							Class21.anInt148 = Integer.parseInt(string_0_) * 2146443313;
							break;
						case 30:
							aClass437_8705 = Class17.method676(Integer.parseInt(string_0_), 1069102804);
							if (Class437.aClass437_5072 == aClass437_8705)
								Class414.aClass207_4922 = PacketsDecoder.aClass207_2420;
							else
								Class414.aClass207_4922 = PacketsDecoder.aClass207_2426;
							break;
						case 22: {
							boolean bool = string_0_.equals(Class3.aString29);
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(bool);
							else
								Class633.aClass641_8196.aBool8289 = bool;
							break;
						}
						case 13:
							Class382.anInt4603 = Integer.parseInt(string_0_) * -501600039;
							break;
						case 3:
							anInt8617 = Integer.parseInt(string_0_) * -535793001;
							if (-826921689 * anInt8617 < 0 || (anInt8617 * -826921689 >= aColorArray8611.length))
								anInt8617 = 0;
					}
				}
			}
			if (aString8561 == null)
				aString8561 = "";
			Class579 class579 = new Class579(-507276561 * anInt8724, anInt8725 * -199235591, 1392353663 * anInt8644, anInt8723 * -217690121, aClass437_8705.aString5075);
			Class278_Sub1.aclient9503 = this;
			String string_1_ = Class34.aClass653_383.aString8391;
			int i = Class34.aClass653_383.anInt8397 * -591702641 + 32;
			if (!string.equals("")) {
				string_1_ = new StringBuilder().append(string_1_).append("_").append(string).toString();
				i = 0;
			}
			method6892(class579, aClass437_8705.aString5074, string_1_, i, Class572_Sub10.method8408(153015262), 831, 1, aBool8612, 16711680);
		}
	}

	public String method6940() {
		String string = " ";
		try {
			Class497 class497 = aClass613_8605.method7280((byte) -72);
			string = new StringBuilder().append(string).append(class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY).append(Class3.aString23).append(aClass613_8605.method7347(171656671)).append(Class3.aString23).append(aClass613_8605.method7278(277214477)).append(" ").toString();
			if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
				string = new StringBuilder().append(string).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) + class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1562461182)).append(" ").append(Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.method8120(1401641568)).append(" ").append(Class344_Sub2.method9253(1593980092)).append(" ").append(1960824389 * Class269.anInt2861).append(Class3.aString23).append(anInt7739 * -530390519).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(124783548)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 121)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9183(-1766763163)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(184164182)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method9045(769854921)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(-456796019 * anInt7769).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt8580 * 835742603).append(" ").toString();
			if (null != Class272_Sub1.aClass572_Sub5_9450)
				string = new StringBuilder().append(string).append(Class272_Sub1.aClass572_Sub5_9450.anInt9048 * -1590322869).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString8838 != null)
				string = new StringBuilder().append(string).append(aString8838).toString();
			else
				string = new StringBuilder().append(string).append(Class3.aString23).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	final void method6904(int i) {
		if (anInt8580 * 835742603 != 19) {
			long l = (Class383.method4654(1506781938) / 1000000L - 8269747268912723799L * aLong8584);
			aLong8584 = (Class383.method4654(1461216254) / 1000000L * -1616926548718902169L);
			if (Class288.method3883(835742603 * anInt8580, 561296376)) {
				if (0L != -233185957257094165L * aLong8720 && (Class69.method1067(-1922586529) > aLong8720 * -233185957257094165L))
					Class572_Sub8_Sub1.method10279(Class344_Sub2.method9253(-379339758), -1, -1, false, 623786968);
				else if (!Class272_Sub2.aClass106_9517.method1672() && aBool7770)
					Class133_Sub3.method9336(1606129431);
			}
			if (Class554.aFrame6320 == null) {
				Container container = Class591_Sub5.method8786((byte) 3);
				int i_2_ = container.getSize().width;
				int i_3_ = container.getSize().height;
				if (Class18.aFrame142 == container) {
					Insets insets = Class18.aFrame142.getInsets();
					i_2_ -= insets.left + insets.right;
					i_3_ -= insets.bottom + insets.top;
				}
				if (-1987897329 * Class656.anInt8418 != i_2_ || -257945127 * Class287.anInt3421 != i_3_ || aBool8599) {
					if (Class272_Sub2.aClass106_9517 == null || Class272_Sub2.aClass106_9517.method1673())
						Class102_Sub5.method9947(119392356);
					else {
						Class656.anInt8418 = i_2_ * -276769041;
						Class287.anInt3421 = i_3_ * 1011048041;
					}
					aLong8720 = ((Class69.method1067(-1697289838) + 500L) * -6983079052808391485L);
					aBool8599 = false;
				}
			}
			if (Class637.aBool8266 && null != Class554.aFrame6320 && !Class408.aBool4780 && Class288.method3883(835742603 * anInt8580, 955725662))
				Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(291508262), -1, -1, false, 623786968);
			boolean bool = false;
			if (aBool7746) {
				aBool7746 = false;
				bool = true;
			}
			if (bool)
				Class107.method2060(-1281900239);
			if ((Class272_Sub2.aClass106_9517 != null && Class272_Sub2.aClass106_9517.method1672()) || Class344_Sub2.method9253(-1813084585) != 1)
				Class54.method987((byte) 63);
			if (Class664.method7853(835742603 * anInt8580, (short) -4310))
				Class570_Sub1.method8798(bool, (byte) 32);
			else if (Class425.method5175(anInt8580 * 835742603, (byte) -106))
				Class501.method5995((short) -27455);
			else if (Class185.method2844(anInt8580 * 835742603, (byte) -15))
				Class501.method5995((short) -18417);
			else if (Class177.method2766(anInt8580 * 835742603, (short) -14903)) {
				if (aClass613_8605.method7339((byte) -109) == Class614.aClass614_8035) {
					int i_4_ = aClass613_8605.method7279(-254483575) / 2;
					Class677.method7987(new StringBuilder().append(Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)).append(Class3.aString25).append("(").append(i_4_).append("%)").toString(), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 225584320);
				} else if (aClass613_8605.method7339((byte) -47) == Class614.aClass614_8036) {
					int i_5_ = 50 + aClass613_8605.method7282((byte) 99) / 2;
					Class677.method7987(new StringBuilder().append(Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)).append(Class3.aString25).append("(").append(i_5_).append("%)").toString(), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 1855460892);
				} else
					Class677.method7987((Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 428630081);
			} else if (835742603 * anInt8580 == 1)
				Class503.method6018(l);
			else if (13 == 835742603 * anInt8580)
				Class677.method7987(new StringBuilder().append(Class279.aClass279_3050.method3758(Class594.aClass435_7823, 16711935)).append(Class3.aString25).append(Class279.aClass279_3051.method3758(Class594.aClass435_7823, 16711935)).toString(), false, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 1718364760);
			else if (anInt8580 * 835742603 == 14)
				Class677.method7987((Class279.aClass279_3088.method3758(Class594.aClass435_7823, 16711935)), false, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 2087673515);
			if (1164535207 * anInt8595 == 3) {
				for (int i_6_ = 0; i_6_ < 983810053 * anInt8560; i_6_++) {
					Rectangle rectangle = aRectangleArray8708[i_6_];
					if (aBoolArray8820[i_6_])
						Class272_Sub2.aClass106_9517.method1982(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, (byte) -95);
					else
						Class272_Sub2.aClass106_9517.method1982(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, (byte) -36);
				}
			}
			if (ItemsContainer.method8674(1380396057))
				Class639.method7582(Class272_Sub2.aClass106_9517, (short) -18464);
			if (!Class664.method7853(835742603 * anInt8580, (short) -22145) && !Class177.method2766(835742603 * anInt8580, (short) -7889) && anInt8790 * -507155049 != -1) {
				try {
					Class272_Sub2.aClass106_9517.method1747();
					Class113.method2088(Class272_Sub2.aClass106_9517, Class69.method1067(-1701358589), 1960824389 * Class269.anInt2861, anInt7739 * -530390519, -953535705);
					Class272_Sub2.aClass106_9517.method1966(13463248);
				} catch (Exception_Sub1 exception_sub1) {
					Class640.method7592(new StringBuilder().append(exception_sub1.getMessage()).append(" ").append(method6946((byte) 58)).toString(), exception_sub1, 906256985);
					switch (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1610486320)) {
						default:
							BaseVarType.method7260(0, false, 1991504628);
							break;
						case 3:
							Class456_Sub1_Sub5.method10475(exception_sub1.method10175((short) -28109), (byte) 4);
							BaseVarType.method7260(1, false, 1588142811);
					}
				}
			}
			int i_7_ = Class213.aClass572_Sub24_2463.aClass665_Sub33_9238.method9169((byte) -57);
			if (i_7_ == 0)
				Class198.method2977(15L);
			else if (i_7_ == 1)
				Class198.method2977(10L);
			else if (2 == i_7_)
				Class198.method2977(5L);
			else if (i_7_ == 3)
				Class198.method2977(2L);
			if (aBool8867)
				Class400.method4772((byte) -26);
			if (Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(1693459574) == 1 && 12 == 835742603 * anInt8580 && -507155049 * anInt8790 != -1) {
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub22_9207, 0, 1272293136);
				Class623.method7443(-1163744828);
			}
		}
	}

	final void method6905(int i) {
		if (Class306.clientConfigsDomain != null && Class306.clientConfigsDomain.aBool10652)
			Class614.method7367(239906896);
		Class202_Sub1.method9211((short) 22190);
		Class392.method4730((byte) 107);
		if (null != Class272_Sub2.aClass106_9517)
			Class272_Sub2.aClass106_9517.method1666(-1828881483);
		if (Class637.aBool8266 && null != Class554.aFrame6320) {
			Class391.method4721(Class4.aClass672_30, Class554.aFrame6320, (byte) 1);
			Class554.aFrame6320 = null;
		}
		aClass195_8589.method2943(-1577411709);
		((Class195) aClass195_8589).aClass14_2336.method624((byte) 61);
		aClass195_8632.method2943(-1640602897);
		((Class195) aClass195_8632).aClass14_2336.method624((byte) 56);
		Class344.audio.method921((byte) 9);
		Class51.aClass278_491.method3731(1100030957);
		Class72.aClass617_721.method7386(2097436872);
		Class540.aClass267_6063.method3639((byte) 2);
		if (aClass455_8759 != null) {
			aClass455_8759.method5382(83240948);
			aClass455_8759 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class76.method1149(693648945);
		try {
			Class614.method7369((short) -581);
		} catch (Exception exception) {
			/* empty */
		}
		if (Class483.aClass10_5388 != null)
			Class483.aClass10_5388.method537(1382044759);
		if (aBool7733 && Class434.aClass434_5047 != Class151.aClass434_1702)
			Class414.method5086((short) -4509);
	}

	public String method6946(byte i) {
		String string = " ";
		try {
			Class497 class497 = aClass613_8605.method7280((byte) -108);
			string = new StringBuilder().append(string).append(class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY).append(Class3.aString23).append(aClass613_8605.method7347(430319812)).append(Class3.aString23).append(aClass613_8605.method7278(277214477)).append(" ").toString();
			if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
				string = new StringBuilder().append(string).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) + class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1614438616)).append(" ").append(Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.method8120(1344203267)).append(" ").append(Class344_Sub2.method9253(97357066)).append(" ").append(1960824389 * Class269.anInt2861).append(Class3.aString23).append(anInt7739 * -530390519).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(-870562436)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 100)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9183(-1766763163)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-697674657)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method9045(769854921)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(-456796019 * anInt7769).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt8580 * 835742603).append(" ").toString();
			if (null != Class272_Sub1.aClass572_Sub5_9450)
				string = new StringBuilder().append(string).append(Class272_Sub1.aClass572_Sub5_9450.anInt9048 * -1590322869).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString8838 != null)
				string = new StringBuilder().append(string).append(aString8838).toString();
			else
				string = new StringBuilder().append(string).append(Class3.aString23).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	void method7988(int i, int i_8_) {
		Class436.aSocket5067 = null;
		Class13.aClass555_117 = null;
		anInt8814 = 0;
		Class51.aClass278_491.anInt2942 += 201210999;
		Class51.aClass278_491.anInt2943 = 1801616305 * i;
	}

	final void method6912() {
		if (19 != anInt8580 * 835742603) {
			if ((8 == 835742603 * anInt8580 || Class133_Sub12.method9368(835742603 * anInt8580, 2134888631) || Class19.method692(835742603 * anInt8580, (byte) 4)) && null != Class344.audio)
				Class344.audio.sendMusic(Class344.audio.method940(312503075), Class213.aClass572_Sub24_2463.aClass665_Sub15_9226.method8970(660014728));
			if (aBool8856) {
				synchronized (anObject8694) {
					anObject8694.notify();
				}
				synchronized (anObject8601) {
					try {
						anObject8601.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool8856 = false;
			}
			cycles++;
			if (cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class439.anInt5093 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
				aRandom8673.setSeed((long) Class439.anInt5093);
			}
			long l = Class69.method1067(-1797661135);
			aClass195_8589.method2930((byte) 4);
			aClass195_8632.method2930((byte) 4);
			method8006((byte) -105);
			if (Class41.aClass259_425 != null)
				Class41.aClass259_425.method3550(-1030558490);
			if (Class344.audio != null)
				Class344.audio.method920((short) 4254);
			Class108.aClass549_1426.method6513(1844994871);
			Class26.aClass564_216.method6655((short) 28720);
			Class401.method4776(Class272_Sub2.aClass106_9517, l);
			if (Class272_Sub2.aClass106_9517 != null)
				Class272_Sub2.aClass106_9517.method1668((int) l);
			anInt8730 = 0;
			anInt8609 = 0;
			for (Interface64 interface64 = Class108.aClass549_1426.method6515((byte) -15); interface64 != null; interface64 = Class108.aClass549_1426.method6515((byte) 62)) {
				int i = interface64.method136(-403205506);
				if (2 == i || 3 == i) {
					if (anInt8730 * -1971020205 < 132) {
						anInterface64Array8607[-1971020205 * anInt8730] = interface64;
						anInt8730 += -88517157;
					}
				} else if (0 == i) {
					if (Class334.method4218((byte) 72) && interface64.method383(-1328608489) == 28) {
						if (-1550439133 * rights >= 2 && Class108.aClass549_1426.method6514(82, (byte) 1)) {
							if (IncomingPacket.method4113((byte) -20))
								RSSocket.method7604(400701252);
							else
								Class102_Sub5.method9948(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method273((byte) -63), 771201334);
						} else if (ItemsContainer.method8674(1661627171) && (Class213.aClass572_Sub24_2463.aClass665_Sub25_9213.method9084(-545727319) == 0 || Class108.aClass549_1426.method6514(86, (byte) 1)))
							Class380.method4639(92795171);
						else if (Class213.aClass572_Sub24_2463.aClass665_Sub25_9213.method9084(-1300693407) == 0 || Class108.aClass549_1426.method6514(86, (byte) 1))
							Class388.method4693(1486523268);
						else
							Class121.method2185((Class279.aClass279_2952.method3758(Class594.aClass435_7823, 16711935)), -1327832495);
					}
					if (anInt8609 * 2134888631 < 77) {
						anInterface64Array8610[2134888631 * anInt8609] = interface64;
						anInt8609 += 2107116807;
					}
				}
			}
			anInt8787 = 0;
			for (Class572_Sub13 class572_sub13 = Class26.aClass564_216.method6659(-904285367); null != class572_sub13; class572_sub13 = Class26.aClass564_216.method6659(-1385865900)) {
				int i = class572_sub13.method8416((byte) 10);
				if (-1 == i)
					Class639_Sub7.method8916(class572_sub13, 539846895);
				else if (6 == i) {
					anInt8787 += class572_sub13.method8419(-1841144) * -610345651;
					class572_sub13.method8421(421222932);
				} else if (Class566.method6715(i, (byte) 0)) {
					aClass675_8745.method7940(class572_sub13, -1912732366);
					if (aClass675_8745.method7927(-391706876) > 10) {
						Class572_Sub13 class572_sub13_9_ = ((Class572_Sub13) aClass675_8745.method7920(-1945803963));
						if (class572_sub13_9_ != null)
							class572_sub13_9_.method8421(421222932);
					}
				}
			}
			if (ItemsContainer.method8674(-647277412))
				Class294.method3957(2040233948);
			if (Class664.method7853(835742603 * anInt8580, (short) -28101)) {
				Class255_Sub1.method8247((byte) -55);
				Class565.method6697(-1995567271);
			} else if (Class177.method2766(anInt8580 * 835742603, (short) -9783))
				aClass613_8605.method7311(889249865);
			if (Class133_Sub12.method9368(835742603 * anInt8580, 2134888631) && !Class177.method2766(anInt8580 * 835742603, (short) 2264)) {
				method8020((byte) -109);
				Class134_Sub1.method9974(-1187990009);
				Class280_Sub1.method8819(1253310523);
			} else if (Class19.method692(835742603 * anInt8580, (byte) 4) && !Class177.method2766(anInt8580 * 835742603, (short) -3951)) {
				method8020((byte) -122);
				Class280_Sub1.method8819(491978833);
			} else if (4 == anInt8580 * 835742603)
				Class280_Sub1.method8819(2027820196);
			else if (Class435.method5266(835742603 * anInt8580, (byte) -96) && !Class177.method2766(835742603 * anInt8580, (short) -5077))
				Class550.method6532((byte) -58);
			else if (anInt8580 * 835742603 == 13 || 835742603 * anInt8580 == 14) {
				Class280_Sub1.method8819(1154237210);
				if (Class13.anInt106 * -1586424751 != -3 && -1586424751 * Class13.anInt106 != 2 && -1586424751 * Class13.anInt106 != 15) {
					if (835742603 * anInt8580 == 14) {
						Class13.anInt109 = Class13.anInt90 * -562270141;
						Class13.anInt108 = 1249033619 * Class13.anInt111;
						Class13.anInt65 = Class13.anInt106 * 2094260509;
						if (Class633.aBool8200) {
							Class242.method3340(2112639107 * (Class633.aClass641_8195.id), (Class633.aClass641_8195.address), (byte) 48);
							aClass195_8589.method2946((byte) 0);
							Class463.method5478(13, -529438240);
						} else
							Class439.method5276(Class13.aBool114, (byte) 8);
					} else
						Class439.method5276(false, (byte) 8);
				}
			}
			Class202_Sub1_Sub1.method10208(Class272_Sub2.aClass106_9517, 1486536042);
			aClass675_8745.method7920(-1945803963);
			if (null != Class272_Sub2.aClass106_9517) {
				Iterator iterator = aMap8764.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class185 class185 = (Class185) entry.getValue();
					if (class185.method2832(-1865954097)) {
						byte[] is = class185.method2831(-640474726);
						if (null != is) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_10_ = Class399.method4769(bufferedimage, (byte) 0);
								Class161 class161 = (Class272_Sub2.aClass106_9517.method1744(is_10_, 0, bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(), -1871502839));
								aClass127_8631.method2229(class161, (long) ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								Class640.method7592(Class278_Sub1.aclient9503.method6946((byte) 91), ioexception, -192020611);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	static final void method7989(int i) {
		int i_11_ = 1657484935 * Class184.anInt2163;
		int[] is = Class184.anIntArray2154;
		int[][] is_12_ = aClass613_8605.method7356(-404138016);
		int[][] is_13_ = aClass613_8605.method7290(-1485827766);
		int i_14_;
		if (4 == 1797623853 * anInt8646)
			i_14_ = Class122.aClass130Array1483.length;
		else
			i_14_ = 765313669 * anInt8625 + i_11_;
		for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
			Entity class456_sub1_sub2_sub3;
			if (4 == 1797623853 * anInt8646) {
				Class130 class130 = Class122.aClass130Array1483[i_15_];
				if (!class130.aBool1529)
					continue;
				class456_sub1_sub2_sub3 = class130.method2268(-1804246921);
			} else {
				if (i_15_ < i_11_)
					class456_sub1_sub2_sub3 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_15_]];
				else
					class456_sub1_sub2_sub3 = ((Entity) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i_15_ - i_11_])).anObject9081));
				if (class456_sub1_sub2_sub3.aByte9009 != i || class456_sub1_sub2_sub3.anInt11646 * 1371302107 < 0)
					continue;
			}
			int i_16_ = class456_sub1_sub2_sub3.method10556((short) -4001);
			Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
			if (0 == (i_16_ & 0x1)) {
				if (((int) class240.aFloat2653 & 0x1ff) != 0 || ((int) class240.aFloat2657 & 0x1ff) != 0)
					continue;
			} else if (((int) class240.aFloat2653 & 0x1ff) != 256 || 256 != ((int) class240.aFloat2657 & 0x1ff))
				continue;
			if (i_16_ == 1) {
				int i_17_ = (int) class240.aFloat2653 >> 9;
				int i_18_ = (int) class240.aFloat2657 >> 9;
				if (class456_sub1_sub2_sub3.anInt11646 * 1371302107 > is_12_[i_17_][i_18_]) {
					is_12_[i_17_][i_18_] = class456_sub1_sub2_sub3.anInt11646 * 1371302107;
					is_13_[i_17_][i_18_] = 1;
				} else if (is_12_[i_17_][i_18_] == 1371302107 * class456_sub1_sub2_sub3.anInt11646)
					is_13_[i_17_][i_18_]++;
			} else {
				int i_19_ = 60 + 256 * (i_16_ - 1);
				int i_20_ = (int) class240.aFloat2653 - i_19_ >> 9;
				int i_21_ = (int) class240.aFloat2657 - i_19_ >> 9;
				int i_22_ = i_19_ + (int) class240.aFloat2653 >> 9;
				int i_23_ = i_19_ + (int) class240.aFloat2657 >> 9;
				for (int i_24_ = i_20_; i_24_ <= i_22_; i_24_++) {
					for (int i_25_ = i_21_; i_25_ <= i_23_; i_25_++) {
						if (1371302107 * class456_sub1_sub2_sub3.anInt11646 > is_12_[i_24_][i_25_]) {
							is_12_[i_24_][i_25_] = (class456_sub1_sub2_sub3.anInt11646 * 1371302107);
							is_13_[i_24_][i_25_] = 1;
						} else if ((class456_sub1_sub2_sub3.anInt11646 * 1371302107) == is_12_[i_24_][i_25_])
							is_13_[i_24_][i_25_]++;
					}
				}
			}
		}
	}

	static final void method7990() {
		int i = Class184.anInt2163 * 1657484935;
		int[] is = Class184.anIntArray2154;
		int i_26_;
		if (anInt8646 * 1797623853 == 4)
			i_26_ = Class122.aClass130Array1483.length;
		else
			i_26_ = aBool8633 ? i : i + anInt8625 * 765313669;
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
			Entity class456_sub1_sub2_sub3;
			if (1797623853 * anInt8646 == 4) {
				Class130 class130 = Class122.aClass130Array1483[i_27_];
				if (!class130.aBool1529)
					continue;
				class456_sub1_sub2_sub3 = class130.method2268(-1535038472);
			} else {
				if (i_27_ < i)
					class456_sub1_sub2_sub3 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_27_]];
				else
					class456_sub1_sub2_sub3 = ((Entity) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i_27_ - i])).anObject9081));
				if (1371302107 * class456_sub1_sub2_sub3.anInt11646 < 0)
					continue;
			}
			int i_28_ = class456_sub1_sub2_sub3.method10556((short) -5484);
			Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
			if ((i_28_ & 0x1) == 0) {
				if (((int) class240.aFloat2653 & 0x1ff) == 0 && 0 == ((int) class240.aFloat2657 & 0x1ff))
					continue;
			} else if (((int) class240.aFloat2653 & 0x1ff) == 256 && 256 == ((int) class240.aFloat2657 & 0x1ff))
				continue;
			class456_sub1_sub2_sub3.method5395(class240.aFloat2653, (float) Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub3.aByte9009, -2110195260), class240.aFloat2657);
			aClass613_8605.method7285(1968095163).method6232(class456_sub1_sub2_sub3, true, 1633205757);
		}
	}

	public static final void method7991(Class83 class83, InterfaceDefinitions[] class73s, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		for (int i_37_ = 0; i_37_ < class73s.length; i_37_++) {
			InterfaceDefinitions class73 = class73s[i_37_];
			if (null != class73 && i == -1604592419 * class73.anInt768) {
				int i_38_ = i_33_ + 278882041 * class73.anInt762;
				int i_39_ = i_34_ + -1681379547 * class73.anInt842;
				int i_40_;
				int i_41_;
				int i_42_;
				int i_43_;
				if (2 == class73.anInt752 * -1285279191) {
					i_40_ = i_29_;
					i_41_ = i_30_;
					i_42_ = i_31_;
					i_43_ = i_32_;
				} else {
					int i_44_ = 669238293 * class73.anInt764 + i_38_;
					int i_45_ = i_39_ + class73.anInt765 * 1360982075;
					if (9 == class73.anInt752 * -1285279191) {
						i_44_++;
						i_45_++;
					}
					i_40_ = i_38_ > i_29_ ? i_38_ : i_29_;
					i_41_ = i_39_ > i_30_ ? i_39_ : i_30_;
					i_42_ = i_44_ < i_31_ ? i_44_ : i_31_;
					i_43_ = i_45_ < i_32_ ? i_45_ : i_32_;
				}
				if (class73.anInt752 * -1285279191 != 0 && !class73.aBool857 && method7992(class73).anInt9311 * 2066234753 == 0 && class73 != aClass73_8771 && (-194192599 * InterfaceDefinitions.anInt930 != -1792394419 * class73.anInt854) && (InterfaceDefinitions.anInt735 * -1652497829 != class73.anInt854 * -1792394419) && (class73.anInt854 * -1792394419 != 154950255 * InterfaceDefinitions.anInt728) && (-1792394419 * class73.anInt854 != -1975200957 * InterfaceDefinitions.anInt729)) {
					if (i_40_ < i_42_ && i_41_ < i_43_)
						Class264.method3622(class73, 2142554719);
				} else if (!method8077(class73)) {
					if (aClass73_8770 == class73 && Class272_Sub1.method8820(aClass73_8770, (byte) 4)) {
						aBool8780 = true;
						anInt8733 = -1672400317 * i_38_;
						anInt8782 = -1879234391 * i_39_;
					}
					if (class73.aBool837 || i_40_ < i_42_ && i_41_ < i_43_) {
						if (class73.aBool773 && i_35_ >= i_40_ && i_36_ >= i_41_ && i_35_ < i_42_ && i_36_ < i_43_) {
							for (Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8812.method7932((byte) 50)); null != class572_sub20; class572_sub20 = ((Cs2LaunchArgs) aClass675_8812.method7926(1001861912))) {
								if (class572_sub20.aBool9146) {
									class572_sub20.method6794((byte) 49);
									class572_sub20.thizInterface.aBool879 = false;
								}
							}
							if (0 == Class568.anInt6388 * 1657009747) {
								aClass73_8770 = null;
								aClass73_8771 = null;
							}
							anInt8844 = 0;
							Class547_Sub1.aBool8984 = false;
							aBool8786 = false;
							if (!Class25.aBool165)
								Class345.method4317((byte) -40);
						}
						boolean bool = (class73.aBool896 && 5 == -1285279191 * class73.anInt752 && class73.anInt780 * 449197009 == 0 && class73.anInt907 * 1754763041 < 0 && -1 == class73.nvmtheindexisotherone * 411192987 && !class73.aBool785 && 0 == -1942295757 * class73.anInt784);
						boolean bool_46_ = false;
						if (i_35_ >= i_40_ && i_36_ >= i_41_ && i_35_ < i_42_ && i_36_ < i_43_) {
							if (bool) {
								Class71 class71 = class73.method1099((Class272_Sub2.aClass106_9517), -1931587061);
								if (null == class71 || (class71.anInt711 * -1355315821 != 669238293 * class73.anInt764) || (1360982075 * class73.anInt765 != class71.anInt710 * -1763697347))
									bool_46_ = true;
								else {
									int i_47_ = i_35_ - i_38_;
									int i_48_ = i_36_ - i_39_;
									if (i_48_ >= 0 && (i_48_ < class71.anIntArray712.length)) {
										int i_49_ = class71.anIntArray712[i_48_];
										if (i_47_ >= i_49_ && i_47_ <= (class71.anIntArray713[i_48_]) + i_49_)
											bool_46_ = true;
									}
								}
							} else
								bool_46_ = true;
						}
						if (!aBool8754 && bool_46_) {
							if (class73.anInt772 * 1437160467 >= 0)
								anInt8751 = class73.anInt772 * -1819578553;
							else if (class73.aBool773)
								anInt8751 = 1983555971;
						}
						if (!Class25.aBool165 && bool_46_ && !class83.aBool1079)
							Class378.method4630(class73, i_35_ - i_38_, i_36_ - i_39_, 1310821157);
						boolean bool_50_ = false;
						if (Class26.aClass564_216.method6653(1301157690) && bool_46_)
							bool_50_ = true;
						boolean bool_51_ = false;
						Class572_Sub13 class572_sub13 = ((Class572_Sub13) aClass675_8745.method7932((byte) 50));
						if (class572_sub13 != null && class572_sub13.method8416((byte) 10) == 0 && class572_sub13.method8417(1636759235) >= i_40_ && class572_sub13.method8425(-1749784373) >= i_41_ && class572_sub13.method8417(1636759235) < i_42_ && (class572_sub13.method8425(-1749784373) < i_43_)) {
							if (bool) {
								Class71 class71 = class73.method1099((Class272_Sub2.aClass106_9517), -1199138690);
								if (class71 == null || (class73.anInt764 * 669238293 != -1355315821 * class71.anInt711) || (class71.anInt710 * -1763697347 != 1360982075 * class73.anInt765))
									bool_51_ = true;
								else {
									int i_52_ = (class572_sub13.method8417(1636759235) - i_38_);
									int i_53_ = (class572_sub13.method8425(-1749784373) - i_39_);
									if (i_53_ >= 0 && (i_53_ < class71.anIntArray712.length)) {
										int i_54_ = class71.anIntArray712[i_53_];
										if (i_52_ >= i_54_ && i_52_ <= (class71.anIntArray713[i_53_]) + i_54_)
											bool_51_ = true;
									}
								}
							} else
								bool_51_ = true;
						}
						if (class73.aBool837 && !ItemsContainer.method8674(172375177)) {
							for (int i_55_ = 0; i_55_ < class73.aByteArrayArray791.length; i_55_++) {
								boolean bool_56_ = false;
								boolean bool_57_ = false;
								if (class73.anIntArray894[i_55_] > 0) {
									for (int i_58_ = 0; i_58_ < anInt8730 * -1971020205; i_58_++) {
										if (class73.anIntArray894[i_55_] == anInterface64Array8607[i_58_].method381((byte) 27)) {
											bool_56_ = true;
											if (null == class73.anIntArray851 || (class73.anIntArray851[i_55_]) <= cycles)
												bool_57_ = true;
											break;
										}
									}
								}
								if (!bool_56_ && (class73.aByteArrayArray791[i_55_] != null)) {
									for (int i_59_ = 0; i_59_ < (class73.aByteArrayArray791[i_55_]).length; i_59_++) {
										if (Class108.aClass549_1426.method6514((class73.aByteArrayArray791[i_55_][i_59_]), (byte) 1)) {
											bool_56_ = true;
											if (null != class73.anIntArray851 && (class73.anIntArray851[i_55_]) > cycles)
												break;
											byte i_60_ = (class73.aByteArrayArray778[i_55_][i_59_]);
											if (i_60_ == 0 || (((i_60_ & 0x8) == 0 || (!(Class108.aClass549_1426.method6514(86, (byte) 1)) && !(Class108.aClass549_1426.method6514(82, (byte) 1)) && !(Class108.aClass549_1426.method6514(81, (byte) 1)))) && (0 == (i_60_ & 0x2) || (Class108.aClass549_1426.method6514(86, (byte) 1))) && ((i_60_ & 0x1) == 0 || (Class108.aClass549_1426.method6514(82, (byte) 1))) && ((i_60_ & 0x4) == 0 || (Class108.aClass549_1426.method6514(81, (byte) 1))))) {
												bool_57_ = true;
												break;
											}
										}
									}
								}
								if (bool_57_) {
									if (i_55_ < 10)
										Class385.method4663(i_55_ + 1, -1718435171 * class73.selfId, -1665128073 * class73.activeComponent, "", (byte) -2);
									else if (10 == i_55_) {
										Class131.method2286(-1705608345);
										Class572_Sub30 class572_sub30 = method7992(class73);
										Class639_Sub16.method8968(class73, class572_sub30.method8647((byte) 0), (class572_sub30.anInt9302 * 1054444675), 16711935);
										aString8757 = Class607.method7252(class73, -520183714);
										if (null == aString8757)
											aString8757 = "Null";
										aString8732 = new StringBuilder().append(class73.aString847).append(GraphicsDefinition.method7770(16777215, (byte) 45)).toString();
									}
									int i_61_ = class73.anIntArray749[i_55_];
									if (null == class73.anIntArray851)
										class73.anIntArray851 = (new int[(class73.aByteArrayArray791).length]);
									if (class73.anIntArray841 == null)
										class73.anIntArray841 = (new int[(class73.aByteArrayArray791).length]);
									if (i_61_ != 0) {
										if (class73.anIntArray851[i_55_] == 0)
											class73.anIntArray851[i_55_] = (class73.anIntArray841[i_55_] + (i_61_ + cycles));
										else
											class73.anIntArray851[i_55_] = cycles + i_61_;
									} else
										class73.anIntArray851[i_55_] = 2147483647;
								}
								if (!bool_56_ && class73.anIntArray851 != null)
									class73.anIntArray851[i_55_] = 0;
							}
						}
						if (bool_51_)
							Class344.method4316(class73, class572_sub13.method8417(1636759235) - i_38_, (class572_sub13.method8425(-1749784373) - i_39_), -1292160981);
						if (aClass73_8770 != null && aClass73_8770 != class73 && bool_46_) {
							if (class73.aBool773 == true)
								aClass73_8603 = null;
							if (method7992(class73).method8662(469300949))
								aClass73_8603 = class73;
						}
						if (aClass73_8771 == class73) {
							aBool8775 = true;
							anInt8845 = i_38_ * 419420465;
							anInt8777 = i_39_ * -256346695;
							anInt8778 = -1687928493 * aClass73_8771.anInt764;
							anInt8779 = aClass73_8771.anInt765 * -276267911;
						}
						if (class73.aBool857 || 0 != -1792394419 * class73.anInt854) {
							if (bool_46_ && anInt8787 * -1840536699 != 0 && null != class73.anObjectArray885) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.aBool9146 = true;
								class572_sub20.thizInterface = class73;
								class572_sub20.anInt9150 = -82216143 * anInt8787;
								class572_sub20.params = class73.anObjectArray885;
								aClass675_8812.method7940(class572_sub20, -1682511742);
							}
							if (aClass73_8770 != null) {
								bool_51_ = false;
								bool_50_ = false;
							} else if (Class25.aBool165 || ((-1792394419 * class73.anInt854 != InterfaceDefinitions.anInt732 * -1411327211) && anInt8844 * 808909649 > 0)) {
								bool_51_ = false;
								bool_50_ = false;
								bool_46_ = false;
							}
							if (-1792394419 * class73.anInt854 != 0) {
								if ((class73.anInt854 * -1792394419 == 154950255 * InterfaceDefinitions.anInt728) || (InterfaceDefinitions.anInt729 * -1975200957 == class73.anInt854 * -1792394419)) {
									aClass73_8880 = class73;
									Class472 class472 = aClass613_8605.method7306(-1042067865).method5957(-1631710883);
									if (class472.method5568((byte) 6) != null && !Class204.aClass602_2411.method7077((byte) 112))
										class472.method5568((byte) 9).method6855(Class272_Sub2.aClass106_9517, class73.anInt765 * 1360982075, Class213.aClass572_Sub24_2463.aClass665_Sub31_9228.method9141(337778554), -1419073002);
									if (class73.anInt854 * -1792394419 == InterfaceDefinitions.anInt728 * 154950255) {
										if (!Class25.aBool165 && i_35_ >= i_40_ && i_36_ >= i_41_ && i_35_ < i_42_ && i_36_ < i_43_) {
											Class227.method3160(Class272_Sub2.aClass106_9517, i_35_, i_36_, -710321638);
											for (Class591_Sub4 class591_sub4 = ((Class591_Sub4) (aClass652_8703.method7697(-870735612))); class591_sub4 != null; class591_sub4 = ((Class591_Sub4) (aClass652_8703.method7698(319781159)))) {
												if ((i_35_ >= (-1196610781 * (((Class591_Sub4) class591_sub4).anInt9351))) && (i_35_ < ((((Class591_Sub4) class591_sub4).anInt9353) * -538958101)) && (i_36_ >= (2002528063 * (((Class591_Sub4) class591_sub4).anInt9352))) && (i_36_ < ((((Class591_Sub4) class591_sub4).anInt9354) * 1808609015))) {
													Class345.method4317((byte) -68);
													Class457.method5427((((Class591_Sub4) class591_sub4).aClass456_Sub1_Sub2_Sub3_9350), -731566524);
												}
											}
										} else
											IncomingPacket.method4115(Class272_Sub2.aClass106_9517, -1684633950);
									}
									int i_62_ = Class184.anInt2163 * 1657484935;
									int[] is = Class184.anIntArray2154;
									for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
										Player class456_sub1_sub2_sub3_sub2 = (aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_63_]]);
										if (null != class456_sub1_sub2_sub3_sub2) {
											IOException_Sub1.method10593(Class530.aClass530_5918, -1, -1, class456_sub1_sub2_sub3_sub2, is[i_63_], 2076958831);
											class456_sub1_sub2_sub3_sub2.method10569(i_40_, i_41_, i_42_, i_43_, i_38_ - (-1883230751 * class73.anInt774), i_39_ - (-2139739529 * class73.anInt775), i_35_, i_36_, 1144397345);
										}
									}
									for (int i_64_ = 0; i_64_ < anInt8625 * 765313669; i_64_++) {
										int i_65_ = anIntArray8626[i_64_];
										LinkableObject class572_sub9 = ((LinkableObject) aClass676_8622.get((long) i_65_));
										if (class572_sub9 != null) {
											IOException_Sub1.method10593(Class530.aClass530_5919, (1355909985 * (((NPC) (class572_sub9.anObject9081)).aClass410_11803.anInt4819)), -1, ((Entity) class572_sub9.anObject9081), i_65_, 2129378454);
											((Entity) class572_sub9.anObject9081).method10569(i_40_, i_41_, i_42_, i_43_, i_38_ - (-1883230751 * class73.anInt774), i_39_ - (class73.anInt775 * -2139739529), i_35_, i_36_, 1708193567);
										}
									}
									continue;
								}
								if (class73.anInt854 * -1792394419 == -194192599 * InterfaceDefinitions.anInt930) {
									int i_66_ = 0;
									int i_67_ = i_31_ - i_29_;
									int i_68_ = i_35_ - i_38_;
									int i_69_ = i_36_ - i_39_;
									if (5 == class73.anInt752 * -1285279191) {
										Class71 class71 = (class73.method1099(Class272_Sub2.aClass106_9517, -1969043348));
										if (null == class71)
											continue;
										if (i_35_ >= i_40_ && i_36_ >= i_41_ && i_35_ < i_42_ && i_36_ < i_43_) {
											i_66_ = class71.anIntArray712[i_69_];
											i_67_ = class71.anIntArray713[i_69_];
										}
									}
									if ((-229939747 * Class192.anInt2304 == 0 || (Class192.anInt2304 * -229939747 == 3)) && !Class25.aBool165 && i_35_ >= i_40_ && i_36_ >= i_41_ && i_35_ < i_42_ && i_36_ < i_43_ && i_68_ >= i_66_ && i_68_ <= i_67_ + i_66_) {
										i_68_ -= (class73.anInt764 * 669238293 / 2);
										i_69_ -= (1360982075 * class73.anInt765 / 2);
										int i_70_;
										if (625220759 * Class18.anInt143 == 6)
											i_70_ = (int) aFloat8678 & 0x3fff;
										else if (1 == (625220759 * Class18.anInt143))
											i_70_ = (int) ((double) (Class133_Sub1.aClass411_Sub1_9827.method5000(69787938)) * 2607.5945876176133);
										else
											i_70_ = ((anInt8766 * -777638353 + (int) aFloat8678) & 0x3fff);
										int i_71_ = Class325.anIntArray4103[i_70_];
										int i_72_ = Class325.anIntArray4105[i_70_];
										if (6 != 625220759 * Class18.anInt143) {
											i_71_ = ((256 + anInt8670 * -1034566343) * i_71_) >> 8;
											i_72_ = (anInt8670 * -1034566343 + 256) * i_72_ >> 8;
										}
										int i_73_ = (i_69_ * i_71_ + i_68_ * i_72_ >> 14);
										int i_74_ = (i_69_ * i_72_ - i_68_ * i_71_ >> 14);
										int i_75_;
										int i_76_;
										if (6 == Class18.anInt143 * 625220759) {
											i_75_ = (anInt8675 * 325769767 >> 9) + (i_73_ >> 2);
											i_76_ = (anInt8792 * -1702297057 >> 9) - (i_74_ >> 2);
										} else {
											int i_77_ = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10556((short) -22476)) - 1) * 256;
											Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
											i_75_ = ((i_73_ >> 2) + (((int) (class240.aFloat2653) - i_77_) >> 9));
											i_76_ = (((int) class240.aFloat2657 - i_77_) >> 9) - (i_74_ >> 2);
										}
										if (aBool8754 && 0 != ((-1613657659 * Class8.anInt43) & 0x40)) {
											InterfaceDefinitions class73_78_ = (Class530.method6338((Class167.interfaceHash * -806385553), 654388253 * anInt8755, -1045905273));
											if (class73_78_ != null)
												Class592.method7012(aString8757, new StringBuilder().append(" ").append(Class3.aString26).toString(), (1904277101 * Class510.anInt5693), 59, (411192987 * class73.nvmtheindexisotherone), 1L, i_75_, i_76_, true, false, (long) (((-1665128073 * (class73.activeComponent)) << 32) | ((class73.selfId) * -1718435171)), true, 1447140101);
											else
												Class131.method2286(-1705608345);
										} else {
											if (Class437.aClass437_5068 == aClass437_8705)
												Class592.method7012((Class279.aClass279_3084.method3758(Class594.aClass435_7823, 16711935)), "", -1, 60, -1, 1L, i_75_, i_76_, true, false, 0L, true, 1447140101);
											Class592.method7012(Class375_Sub3.aString9521, "", anInt8744 * 348859511, 23, -1, 1L, i_75_, i_76_, true, false, 0L, true, 1447140101);
										}
									}
									continue;
								}
								if (InterfaceDefinitions.anInt732 * -1411327211 == -1792394419 * class73.anInt854) {
									Class383.aClass73_4610 = class73;
									if (bool_46_)
										Class547_Sub1.aBool8984 = true;
									if (bool_51_) {
										int i_79_ = (int) ((double) ((class572_sub13.method8417(1636759235)) - i_38_ - (669238293 * (class73.anInt764) / 2)) * 2.0 / (double) (Class547.aFloat6139));
										int i_80_ = (int) -((double) ((class572_sub13.method8425(-1749784373)) - i_39_ - (1360982075 * (class73.anInt765) / 2)) * 2.0 / (double) (Class547.aFloat6139));
										int i_81_ = (Class547.anInt6143 + (i_79_ + (Class185.anInt2172 * -586790413)));
										int i_82_ = (i_80_ + (1172032773 * Class386.anInt4642) + Class547.anInt6165);
										Class572_Sub12_Sub5 class572_sub12_sub5 = Class654.method7709(1900675818);
										if (null != class572_sub12_sub5) {
											int[] is = new int[3];
											class572_sub12_sub5.method10297(i_81_, i_82_, is, (short) -1689);
											if (null != is) {
												if ((Class108.aClass549_1426.method6514(82, (byte) 1)) && (rights * -1550439133 > 0)) {
													Class21.method703(is[0], is[1], is[2], -1510758316);
													continue;
												}
												aBool8786 = true;
												Class612.anInt7988 = is[0] * 1885229565;
												Class498.anInt5510 = is[1] * -1896833891;
												Class665_Sub22.anInt9601 = -1505729967 * is[2];
											}
											anInt8844 = 1092562353;
											aBool8785 = false;
											anInt8772 = ((Class26.aClass564_216.method6657((short) -23044)) * 953125055);
											anInt8676 = (Class26.aClass564_216.method6658((byte) -121) * 64511353);
										}
									} else if (bool_50_ && anInt8844 * 808909649 > 0) {
										if (808909649 * anInt8844 == 1 && ((12052287 * anInt8772 != (Class26.aClass564_216.method6657((short) 6724))) || (-1634173751 * anInt8676 != (Class26.aClass564_216.method6658((byte) -70))))) {
											Class275.anInt2919 = (Class185.anInt2172 * 885022721);
											Class396.anInt4691 = (-1065478139 * Class386.anInt4642);
											anInt8844 = -2109842590;
										}
										if (2 == anInt8844 * 808909649) {
											aBool8785 = true;
											NPCDefintion.method4965(((Class275.anInt2919 * -620025357) + (int) ((double) ((12052287 * anInt8772) - (Class26.aClass564_216.method6657((short) -13697))) * 2.0 / (double) (Class547.aFloat6128))), (byte) -13);
											Class49.method899(((Class396.anInt4691 * 512618753) - (int) ((double) ((-1634173751 * anInt8676) - (Class26.aClass564_216.method6658((byte) -42))) * 2.0 / (double) (Class547.aFloat6128))), -1323825661);
										}
									} else {
										if (anInt8844 * 808909649 > 0 && !aBool8785) {
											if ((1 == -343113449 * anInt8637 || (Class461.method5470(-2101797875))) && (357782167 * Class25.anInt172) > 2)
												Class675.method7961(12052287 * anInt8772, -1634173751 * anInt8676, (byte) 0);
											else if (Class110.method2073(-721745911))
												Class675.method7961(anInt8772 * 12052287, anInt8676 * -1634173751, (byte) 0);
										}
										anInt8844 = 0;
									}
									continue;
								}
								if (1430682275 * InterfaceDefinitions.anInt733 == -1792394419 * class73.anInt854) {
									if (bool_50_)
										Class442.method5281((Class26.aClass564_216.method6657((short) -12389) - i_38_), (Class26.aClass564_216.method6658((byte) -73) - i_39_), class73.anInt764 * 669238293, 1360982075 * class73.anInt765, (byte) 86);
									continue;
								}
								if (-1652497829 * InterfaceDefinitions.anInt735 == class73.anInt854 * -1792394419) {
									Class296.method3964(class73, i_38_, i_39_, 501370591);
									continue;
								}
							}
							if (!class73.aBool901 && bool_51_) {
								class73.aBool901 = true;
								if (null != class73.anObjectArray859) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.aBool9146 = true;
									class572_sub20.thizInterface = class73;
									class572_sub20.anInt9148 = (class572_sub13.method8417(1636759235) - i_38_) * 638530953;
									class572_sub20.anInt9150 = (class572_sub13.method8425(-1749784373) - i_39_) * 2034326205;
									class572_sub20.params = class73.anObjectArray859;
									aClass675_8812.method7940(class572_sub20, -2076029279);
								}
							}
							if (class73.aBool901 && bool_50_ && null != class73.anObjectArray746) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.aBool9146 = true;
								class572_sub20.thizInterface = class73;
								class572_sub20.anInt9148 = (Class26.aClass564_216.method6657((short) -15748) - i_38_) * 638530953;
								class572_sub20.anInt9150 = (Class26.aClass564_216.method6658((byte) -44) - i_39_) * 2034326205;
								class572_sub20.params = class73.anObjectArray746;
								aClass675_8812.method7940(class572_sub20, -1473399474);
							}
							if (class73.aBool901 && !bool_50_) {
								class73.aBool901 = false;
								if (null != class73.anObjectArray814) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.aBool9146 = true;
									class572_sub20.thizInterface = class73;
									class572_sub20.anInt9148 = (Class26.aClass564_216.method6657((short) -16074) - i_38_) * 638530953;
									class572_sub20.anInt9150 = (Class26.aClass564_216.method6658((byte) -49) - i_39_) * 2034326205;
									class572_sub20.params = class73.anObjectArray814;
									aClass675_8884.method7940(class572_sub20, -1919776360);
								}
							}
							if (bool_50_ && null != class73.anObjectArray862) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.aBool9146 = true;
								class572_sub20.thizInterface = class73;
								class572_sub20.anInt9148 = (Class26.aClass564_216.method6657((short) -25689) - i_38_) * 638530953;
								class572_sub20.anInt9150 = (Class26.aClass564_216.method6658((byte) -127) - i_39_) * 2034326205;
								class572_sub20.params = class73.anObjectArray862;
								aClass675_8812.method7940(class572_sub20, -1851517445);
							}
							if (!class73.aBool879 && bool_46_) {
								class73.aBool879 = true;
								if (class73.anObjectArray855 != null) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.aBool9146 = true;
									class572_sub20.thizInterface = class73;
									class572_sub20.anInt9148 = (Class26.aClass564_216.method6657((short) -17596) - i_38_) * 638530953;
									class572_sub20.anInt9150 = (Class26.aClass564_216.method6658((byte) -60) - i_39_) * 2034326205;
									class572_sub20.params = class73.anObjectArray855;
									aClass675_8812.method7940(class572_sub20, -2096516259);
								}
							}
							if (class73.aBool879 && bool_46_ && class73.anObjectArray753 != null) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.aBool9146 = true;
								class572_sub20.thizInterface = class73;
								class572_sub20.anInt9148 = (Class26.aClass564_216.method6657((short) -21399) - i_38_) * 638530953;
								class572_sub20.anInt9150 = (Class26.aClass564_216.method6658((byte) -81) - i_39_) * 2034326205;
								class572_sub20.params = class73.anObjectArray753;
								aClass675_8812.method7940(class572_sub20, -1651769451);
							}
							if (class73.aBool879 && !bool_46_) {
								class73.aBool879 = false;
								if (class73.anObjectArray865 != null) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.aBool9146 = true;
									class572_sub20.thizInterface = class73;
									class572_sub20.anInt9148 = (Class26.aClass564_216.method6657((short) -7661) - i_38_) * 638530953;
									class572_sub20.anInt9150 = (Class26.aClass564_216.method6658((byte) -31) - i_39_) * 2034326205;
									class572_sub20.params = class73.anObjectArray865;
									aClass675_8884.method7940(class572_sub20, -1872703231);
								}
							}
							if (null != class73.anObjectArray882) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray882;
								aClass675_8813.method7940(class572_sub20, -1551228976);
							}
							if (null != class73.anObjectArray876 && (-668970747 * anInt8797 > 386270549 * class73.anInt861)) {
								if (null == class73.anIntArray921 || (anInt8797 * -668970747 - class73.anInt861 * 386270549) > 64) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.thizInterface = class73;
									class572_sub20.params = class73.anObjectArray876;
									aClass675_8812.method7940(class572_sub20, -1716782383);
								} else {
									while_0_: for (int i_83_ = 386270549 * class73.anInt861; i_83_ < anInt8797 * -668970747; i_83_++) {
										int i_84_ = anIntArray8796[i_83_ & 0x3f];
										for (int i_85_ = 0; (i_85_ < class73.anIntArray921.length); i_85_++) {
											if (class73.anIntArray921[i_85_] == i_84_) {
												Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
												class572_sub20.thizInterface = class73;
												class572_sub20.params = class73.anObjectArray876;
												aClass675_8812.method7940(class572_sub20, -1773745175);
												break while_0_;
											}
										}
									}
								}
								class73.anInt861 = anInt8797 * 2002787569;
							}
							if (class73.anObjectArray782 != null && (665914373 * anInt8799 > 1455283049 * class73.anInt759)) {
								if (class73.anIntArray848 == null || ((665914373 * anInt8799 - 1455283049 * class73.anInt759) > 64)) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.thizInterface = class73;
									class572_sub20.params = class73.anObjectArray782;
									aClass675_8812.method7940(class572_sub20, -1786402743);
								} else {
									while_1_: for (int i_86_ = class73.anInt759 * 1455283049; i_86_ < anInt8799 * 665914373; i_86_++) {
										int i_87_ = anIntArray8798[i_86_ & 0x3f];
										for (int i_88_ = 0; (i_88_ < class73.anIntArray848.length); i_88_++) {
											if (class73.anIntArray848[i_88_] == i_87_) {
												Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
												class572_sub20.thizInterface = class73;
												class572_sub20.params = class73.anObjectArray782;
												aClass675_8812.method7940(class572_sub20, -2134310679);
												break while_1_;
											}
										}
									}
								}
								class73.anInt759 = anInt8799 * -1498340291;
							}
							if (null != class73.anObjectArray813 && (anInt8791 * -1505762767 > class73.anInt883 * -1732099239)) {
								if (class73.anIntArray871 == null || ((-1505762767 * anInt8791 - class73.anInt883 * -1732099239) > 64)) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.thizInterface = class73;
									class572_sub20.params = class73.anObjectArray813;
									aClass675_8812.method7940(class572_sub20, -1929649346);
								} else {
									while_2_: for (int i_89_ = class73.anInt883 * -1732099239; i_89_ < -1505762767 * anInt8791; i_89_++) {
										int i_90_ = anIntArray8830[i_89_ & 0x3f];
										for (int i_91_ = 0; (i_91_ < class73.anIntArray871.length); i_91_++) {
											if (class73.anIntArray871[i_91_] == i_90_) {
												Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
												class572_sub20.thizInterface = class73;
												class572_sub20.params = class73.anObjectArray813;
												aClass675_8812.method7940(class572_sub20, -2101182309);
												break while_2_;
											}
										}
									}
								}
								class73.anInt883 = anInt8791 * -597134695;
							}
							if (class73.anObjectArray872 != null && (1042881293 * anInt8793 > class73.anInt895 * -1365067809)) {
								if (null == class73.anIntArray873 || ((anInt8793 * 1042881293 - class73.anInt895 * -1365067809) > 64)) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.thizInterface = class73;
									class572_sub20.params = class73.anObjectArray872;
									aClass675_8812.method7940(class572_sub20, -1815186595);
								} else {
									while_3_: for (int i_92_ = class73.anInt895 * -1365067809; i_92_ < anInt8793 * 1042881293; i_92_++) {
										int i_93_ = anIntArray8722[i_92_ & 0x3f];
										for (int i_94_ = 0; (i_94_ < class73.anIntArray873.length); i_94_++) {
											if (i_93_ == (class73.anIntArray873[i_94_])) {
												Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
												class572_sub20.thizInterface = class73;
												class572_sub20.params = class73.anObjectArray872;
												aClass675_8812.method7940(class572_sub20, -1977486638);
												break while_3_;
											}
										}
									}
								}
								class73.anInt895 = 219101843 * anInt8793;
							}
							if (null != class73.anObjectArray874 && (-47604307 * anInt8795 > 1979253279 * class73.anInt923)) {
								if (null == class73.anIntArray875 || ((-47604307 * anInt8795 - 1979253279 * class73.anInt923) > 64)) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.thizInterface = class73;
									class572_sub20.params = class73.anObjectArray874;
									aClass675_8812.method7940(class572_sub20, -1561371695);
								} else {
									while_4_: for (int i_95_ = class73.anInt923 * 1979253279; i_95_ < -47604307 * anInt8795; i_95_++) {
										int i_96_ = anIntArray8794[i_95_ & 0x3f];
										for (int i_97_ = 0; (i_97_ < class73.anIntArray875.length); i_97_++) {
											if (class73.anIntArray875[i_97_] == i_96_) {
												Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
												class572_sub20.thizInterface = class73;
												class572_sub20.params = class73.anObjectArray874;
												aClass675_8812.method7940(class572_sub20, -1678572802);
												break while_4_;
											}
										}
									}
								}
								class73.anInt923 = -1551720781 * anInt8795;
							}
							if (class73.anObjectArray880 != null && (anInt8578 * 1647827265 > class73.anInt806 * 474941827)) {
								if (null == class73.anIntArray738 || (anInt8578 * 1647827265 - 474941827 * class73.anInt806) > 64) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.thizInterface = class73;
									class572_sub20.params = class73.anObjectArray880;
									aClass675_8812.method7940(class572_sub20, -1819965691);
								} else {
									while_5_: for (int i_98_ = 474941827 * class73.anInt806; i_98_ < 1647827265 * anInt8578; i_98_++) {
										int i_99_ = anIntArray8800[i_98_ & 0x3f];
										for (int i_100_ = 0; (i_100_ < class73.anIntArray738.length); i_100_++) {
											if (i_99_ == (class73.anIntArray738[i_100_])) {
												Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
												class572_sub20.thizInterface = class73;
												class572_sub20.params = class73.anObjectArray880;
												aClass675_8812.method7940(class572_sub20, -1887365388);
												break while_5_;
											}
										}
									}
								}
								class73.anInt806 = -526841109 * anInt8578;
							}
							if ((1844070637 * anInt8802 > 610955829 * class73.anInt920) && null != class73.anObjectArray886) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray886;
								aClass675_8812.method7940(class572_sub20, -2069971063);
							}
							if ((anInt8715 * 1976668309 > class73.anInt920 * 610955829) && null != class73.anObjectArray888) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray888;
								aClass675_8812.method7940(class572_sub20, -1667948655);
							}
							if ((503734571 * anInt8858 > class73.anInt920 * 610955829) && null != class73.anObjectArray889) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray889;
								aClass675_8812.method7940(class572_sub20, -1917602207);
							}
							if ((1867273807 * anInt8805 > class73.anInt920 * 610955829) && class73.anObjectArray929 != null) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray929;
								aClass675_8812.method7940(class572_sub20, -1468793289);
							}
							if ((-1821678261 * anInt8598 > class73.anInt920 * 610955829) && null != class73.anObjectArray730) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray730;
								aClass675_8812.method7940(class572_sub20, -1497416575);
							}
							if ((anInt8806 * -1505499849 > class73.anInt920 * 610955829) && class73.anObjectArray893 != null) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray893;
								aClass675_8812.method7940(class572_sub20, -1978306535);
							}
							if ((1539892493 * anInt8729 > class73.anInt920 * 610955829) && null != class73.anObjectArray831) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray831;
								aClass675_8812.method7940(class572_sub20, -1711428714);
							}
							if ((anInt8563 * -1017052881 > 610955829 * class73.anInt920) && null != class73.anObjectArray898) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray898;
								aClass675_8812.method7940(class572_sub20, -1468018389);
							}
							if ((-1954137817 * anInt8743 > class73.anInt920 * 610955829) && class73.anObjectArray899 != null) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray899;
								aClass675_8812.method7940(class572_sub20, -1762511315);
							}
							if ((106089375 * anInt8811 > class73.anInt920 * 610955829) && class73.anObjectArray900 != null) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray900;
								aClass675_8812.method7940(class572_sub20, -2128516741);
							}
							class73.anInt920 = anInt8839 * 1555415605;
							if (class73.anObjectArray887 != null) {
								for (int i_101_ = 0; i_101_ < anInt8730 * -1971020205; i_101_++) {
									Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
									class572_sub20.thizInterface = class73;
									class572_sub20.anInt9145 = (anInterface64Array8607[i_101_].method383(-752208979) * -2024309505);
									class572_sub20.anInt9153 = (anInterface64Array8607[i_101_].method381((byte) 83) * -1723375675);
									class572_sub20.params = class73.anObjectArray887;
									aClass675_8812.method7940(class572_sub20, -2114377363);
								}
							}
							if (aBool8697 && class73.anObjectArray724 != null) {
								Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
								class572_sub20.thizInterface = class73;
								class572_sub20.params = class73.anObjectArray724;
								aClass675_8812.method7940(class572_sub20, -1597502350);
							}
						}
						if (-1285279191 * class73.anInt752 == 5 && 1754763041 * class73.anInt907 != -1)
							class73.method1111(Class629.aClass639_Sub20_8111, Class300.aClass639_Sub13_3489, 261023521).method6855(Class272_Sub2.aClass106_9517, 1360982075 * class73.anInt765, Class213.aClass572_Sub24_2463.aClass665_Sub31_9228.method9141(914986552), -1419073002);
						Class264.method3622(class73, 2144300816);
						if (0 == -1285279191 * class73.anInt752) {
							method7991(class83, class73s, class73.selfId * -1718435171, i_40_, i_41_, i_42_, i_43_, i_38_ - -1883230751 * class73.anInt774, i_39_ - class73.anInt775 * -2139739529, i_35_, i_36_);
							if (class73.aClass73Array917 != null)
								method7991(class83, class73.aClass73Array917, -1718435171 * class73.selfId, i_40_, i_41_, i_42_, i_43_, (i_38_ - class73.anInt774 * -1883230751), (i_39_ - class73.anInt775 * -2139739529), i_35_, i_36_);
							Class572_Sub29 class572_sub29 = (Class572_Sub29) (aClass676_8760.get((long) (class73.selfId * -1718435171)));
							if (null != class572_sub29)
								Class568.method6750(class572_sub29, 493419501 * class572_sub29.anInt9301, i_40_, i_41_, i_42_, i_43_, i_38_ - -1883230751 * class73.anInt774, i_39_ - -2139739529 * class73.anInt775, i_35_, i_36_, -607388533);
						}
					}
				}
			}
		}
	}

	public static Class572_Sub30 method7992(InterfaceDefinitions class73) {
		Class572_Sub30 class572_sub30 = ((Class572_Sub30) aClass676_8815.get(((long) (class73.selfId * -1718435171) << 32) + (long) (-1665128073 * class73.activeComponent)));
		return (class572_sub30 != null ? class572_sub30 : class73.aClass572_Sub30_843);
	}

	static InterfaceDefinitions method7993(InterfaceDefinitions class73) {
		Class572_Sub30 class572_sub30 = method7992(class73);
		if (class572_sub30.method8651((byte) 37))
			return Class619.aClass73_8062;
		int i = class572_sub30.method8660(-245334245);
		if (i == 0)
			return null;
		for (int i_102_ = 0; i_102_ < i; i_102_++) {
			class73 = Class76.method1152(Class20.method695((-1718435171 * class73.selfId), (byte) 8), class73, (short) 8421);
			if (class73 == null)
				return Class619.aClass73_8062;
		}
		return class73;
	}

	public String method6917() {
		String string = " ";
		try {
			Class497 class497 = aClass613_8605.method7280((byte) -18);
			string = new StringBuilder().append(string).append(class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY).append(Class3.aString23).append(aClass613_8605.method7347(1430742625)).append(Class3.aString23).append(aClass613_8605.method7278(277214477)).append(" ").toString();
			if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
				string = new StringBuilder().append(string).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) + class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1757897550)).append(" ").append(Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.method8120(1050867033)).append(" ").append(Class344_Sub2.method9253(966354870)).append(" ").append(1960824389 * Class269.anInt2861).append(Class3.aString23).append(anInt7739 * -530390519).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(1305319118)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 54)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9183(-1766763163)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1416594357)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method9045(769854921)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(-456796019 * anInt7769).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt8580 * 835742603).append(" ").toString();
			if (null != Class272_Sub1.aClass572_Sub5_9450)
				string = new StringBuilder().append(string).append(Class272_Sub1.aClass572_Sub5_9450.anInt9048 * -1590322869).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString8838 != null)
				string = new StringBuilder().append(string).append(aString8838).toString();
			else
				string = new StringBuilder().append(string).append(Class3.aString23).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	static {
		aBool8559 = false;
		aBool8840 = false;
		aString8561 = null;
		anInt8808 = 0;
		anInt8617 = 0;
		aBool8564 = false;
		aByteArray8565 = null;
		anInt8566 = 0;
		anInt8567 = 0;
		aBool8568 = false;
		aBool8569 = false;
		aString8570 = null;
		aString8571 = null;
		aString8572 = null;
		aBool8621 = false;
		aBool8574 = false;
		aBool8612 = false;
		anInt8576 = 0;
		anInt8773 = -32360817;
		aString8838 = null;
		aString8579 = null;
		anInt8580 = -170507728;
		aClass250_8581 = new Class250();
		aClass261_8582 = new Class261();
		aClass261_8640 = new Class261();
		aLong8584 = 0L;
		aBool8585 = false;
		aBool8586 = true;
		anInt8587 = 0;
		cycles = 0;
		aBool8854 = true;
		aBool8874 = false;
		aBool8591 = false;
		anInt8604 = 0;
		aClass193Array8593 = new Class193[9];
		aClass575Array8594 = new Class575[9];
		aBool8867 = false;
		aBool8633 = false;
		aBool8847 = true;
		aLong8767 = (long) (Math.random() * 9.999999999E9) * 7118768777956610969L;
		aBool8599 = false;
		anInt8600 = 0;
		anInt8620 = 0;
		aBool8602 = false;
		aClass675_8745 = new Class675();
		anInt8787 = 0;
		anInt8730 = 0;
		anInterface64Array8607 = new Interface64[132];
		anInt8609 = 0;
		anInterface64Array8610 = new Interface64[77];
		aColorArray8611 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
		aColorArray8893 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };
		aColorArray8613 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };
		anInt8814 = 0;
		anInt8615 = 0;
		anInt8638 = 0;
		aClass127_8583 = new Class127(8);
		aClass127_8618 = new Class127(8);
		aString8619 = null;
		anInterface19_8776 = new Class21();
		anInterface1_8558 = new Class4();
		aClass676_8622 = new Class676(64);
		aClass572_Sub9Array8623 = new LinkableObject[1024];
		anInt8624 = 0;
		anInt8625 = 0;
		anIntArray8626 = new int[1024];
		anInt8627 = 0;
		anIntArray8628 = new int[253];
		anInt8629 = 0;
		anInt8869 = 0;
		anIntArray8832 = new int[1003];
		aClass195_8632 = new Class195();
		aClass195_8589 = new Class195();
		aClass195Array8592 = new Class195[] { aClass195_8589, aClass195_8632 };
		anInt8614 = 0;
		aBool8573 = false;
		aClass455_8759 = new Class455();
		aClass613_8605 = new Class613(false);
		aBool8856 = false;
		anObject8601 = new Object();
		anObject8694 = new Object();
		anIntArray8575 = new int[64];
		anInt8850 = 0;
		anIntArray8713 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt8645 = 664497205;
		anInt8646 = 0;
		aBool8647 = false;
		anInt8648 = 1389120501;
		anInt8649 = 0;
		anInt8577 = 0;
		anInt8789 = 1924388537;
		anInt8652 = 1431314153;
		anInt8653 = 151062035;
		anInt8654 = 0;
		anInt8655 = 0;
		anInt8635 = 0;
		anIntArray8658 = new int[4096];
		anIntArray8562 = new int[4096];
		anIntArray8735 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt8877 = 0;
		anInt8662 = -87875006;
		anInt8663 = 0;
		anInt8664 = -2093052074;
		anInt8665 = 0;
		anInt8666 = 1972333055;
		anInt8819 = 0;
		anInt8766 = 0;
		anInt8846 = -410395906;
		anInt8670 = 0;
		anInt8671 = 255419729;
		anInt8672 = 0;
		aRandom8673 = new Random();
		anInt8674 = 0;
		anInt8675 = 0;
		anInt8792 = 0;
		aFloat8822 = 1024.0F;
		aFloat8678 = 0.0F;
		aFloat8679 = 0.0F;
		aFloat8660 = 0.0F;
		aBool8681 = false;
		aBool8682 = false;
		anInt8683 = 576713289;
		anInt8684 = anInt8683 * -211635959 + -2111809528;
		aBool8685 = true;
		anInt8686 = 0;
		anIntArrayArrayArray8689 = new int[2][][];
		anInt8690 = 1542880195;
		anInt8711 = -527050097;
		anInt8692 = 0;
		anInt8824 = 0;
		anInt8651 = 0;
		anInt8709 = 0;
		anInt8696 = 0;
		aBool8697 = false;
		aBool8698 = false;
		anInt8699 = 0;
		anIntArray8700 = new int[506];
		anIntArray8656 = new int[504];
		anInt8836 = 0;
		aClass652_8703 = new Class652();
		anInt8704 = 0;
		aFloatArray8677 = new float[3];
		anInt8706 = 0;
		anInt8707 = 0;
		anInt8803 = 0;
		anInt8606 = 0;
		anInt8710 = 0;
		anInt8714 = 1957597511;
		anIntArray8701 = new int[2];
		anIntArray8716 = new int[2];
		anIntArray8717 = new int[2];
		anIntArray8718 = new int[2];
		anIntArray8719 = new int[2];
		aLong8720 = 0L;
		aBool8721 = true;
		anInt8644 = -1744580640;
		anInt8723 = -2081285008;
		anInt8724 = -1133471533;
		anInt8725 = 1135826865;
		aClass456_Sub1_Sub2_Sub3_Sub2Array8727 = new Player[2048];
		anInt8728 = -1675423621;
		aBool8659 = false;
		aBool8731 = false;
		rights = 0;
		anInt8702 = 0;
		aBool8734 = false;
		aBool8596 = false;
		aBool8736 = false;
		aBool8657 = true;
		aBool8738 = false;
		aShortArray8740 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		anIntArray8695 = new int[8];
		aStringArray8742 = new String[8];
		aBoolArray8667 = new boolean[8];
		anInt8744 = 636981945;
		aClass676_8749 = new Class676(64);
		aClass675_8774 = new Class675();
		aClass676_8747 = new Class676(16);
		aClass652_8748 = new Class652();
		anInt8637 = 0;
		anInt8750 = 895967643;
		anInt8751 = 1983555971;
		anInt8752 = 1711626505;
		anInt8753 = 2083756903;
		aBool8754 = false;
		anInt8755 = 1552484811;
		anInt8756 = 304478591;
		aString8757 = null;
		aString8732 = null;
		anInt8790 = 254025177;
		aClass676_8760 = new Class676(8);
		anInt8761 = 0;
		aClass73_8762 = null;
		anInt8616 = 0;
		anInt8765 = 0;
		aBool8763 = false;
		aBool8636 = false;
		aClass73_8880 = null;
		aBool8768 = true;
		aBool8769 = false;
		aClass73_8770 = null;
		aClass73_8771 = null;
		anInt8772 = 0;
		anInt8676 = 0;
		aClass73_8603 = null;
		aBool8775 = false;
		anInt8845 = -419420465;
		anInt8777 = 256346695;
		anInt8778 = -976732615;
		anInt8779 = 5419301;
		aBool8780 = false;
		anInt8733 = 1672400317;
		anInt8782 = 1879234391;
		aBool8783 = false;
		anInt8844 = 0;
		aBool8785 = false;
		aBool8786 = false;
		anInt8839 = -1210150071;
		anIntArray8830 = new int[64];
		anInt8791 = 0;
		anIntArray8722 = new int[64];
		anInt8793 = 0;
		anIntArray8794 = new int[64];
		anInt8795 = 0;
		anIntArray8796 = new int[64];
		anInt8797 = 0;
		anIntArray8798 = new int[64];
		anInt8799 = 0;
		anIntArray8800 = new int[64];
		anInt8578 = 0;
		anInt8802 = 0;
		anInt8715 = 0;
		anInt8858 = 0;
		anInt8805 = 0;
		anInt8598 = 0;
		anInt8806 = 0;
		anInt8729 = 0;
		anInt8563 = 0;
		anInt8743 = 0;
		anInt8811 = 0;
		aClass675_8812 = new Class675();
		aClass675_8813 = new Class675();
		aClass675_8884 = new Class675();
		aClass676_8815 = new Class676(512);
		anInt8560 = 0;
		anInt8818 = -591248078;
		aBoolArray8784 = new boolean[107];
		aBoolArray8820 = new boolean[107];
		aRectangleArray8708 = new Rectangle[107];
		for (int i = 0; i < 107; i++)
			aRectangleArray8708[i] = new Rectangle();
		anInt8595 = 0;
		anIntArray8642 = new int[4];
		anInt8639 = 0;
		anInt8825 = 544662462;
		anIntArray8630 = new int[754613511 * anInt8825];
		anIntArray8827 = new int[754613511 * anInt8825];
		anIntArray8828 = new int[754613511 * anInt8825];
		aClass583Array8829 = new Class583[754613511 * anInt8825];
		anIntArray8634 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt8831 = 0;
		anInt8680 = 0;
		aLongArray8834 = new long[100];
		anInt8817 = 0;
		aString8887 = null;
		aString8837 = null;
		exchangeSlots = new Class592[6];
		anInt8669 = 0;
		aClass5_8876 = new Class5();
		aBoolArray8842 = new boolean[5];
		anIntArray8843 = new int[5];
		anIntArray8848 = new int[5];
		anIntArray8741 = new int[5];
		anIntArray8597 = new int[5];
		aShort8801 = (short) 256;
		aShort8823 = (short) 205;
		aShort8849 = (short) 256;
		aShort8668 = (short) 320;
		aShort8851 = (short) 1;
		aShort8852 = (short) 32767;
		aShort8853 = (short) 1;
		aShort8693 = (short) 32767;
		anInt8855 = 0;
		anInt8590 = 0;
		anInt8821 = 0;
		anInt8804 = 0;
		anInt8859 = 0;
		anInt8860 = 0;
		anInt8861 = 0;
		aClass26Array8863 = new Class26[400];
		aClass652_8864 = new Class652();
		anInt8865 = 0;
		aClass23Array8650 = new Class23[400];
		anInt8868 = 0;
		anInt8826 = -1185873447;
		anInt8870 = -1242892799;
		aBool8871 = false;
		aCalendar8872 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		anInterface62_8873 = new Class9();
		aLong8737 = -5272074439168099041L;
		aLong8875 = -6094611317542751281L;
		aClass127_8631 = new Class127(8);
		aMap8764 = new HashMap();
		anIntArray8894 = new int[4];
	}

	final void method6910() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class619.aClass73_8062 = new InterfaceDefinitions();
		Class102_Sub5.method9947(-1901849903);
		Class286.method3865(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, -955267449);
		Class240.method3304(100);
		Class230.method3190(10);
		Class106.method2053(100, -1651724813);
		Class489.method5843(100, -277679569);
		if (Class434.aClass434_5044 != Class151.aClass434_1702)
			Class613.aByteArrayArray8033 = new byte[50][];
		Class213.aClass572_Sub24_2463 = Class346.method4333((byte) 108);
		if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(-1398658133) == 1)
			Class523.aBool5831 = false;
		switch (Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(-42001432)) {
			case 3:
				Class200.aBool2388 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 1290770871);
				Class300.method3993(Class257.aClass257_2779, 1405773119);
				break;
			case 4:
				Class200.aBool2389 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 1688879472);
				Class300.method3993(Class257.aClass257_2778, 1741339689);
				break;
		}
		if (Class151.aClass434_1702 == Class434.aClass434_5044)
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
		else if (Class151.aClass434_1702.method5252(Class440.aClass440_5094, 659952747)) {
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
			Class633.aClass641_8203.port = -984285601 * Class633.aClass641_8203.id + -1352120000;
			Class633.aClass641_8203.securePort = 974886224 + Class633.aClass641_8203.id * -172050845;
		} else if (Class434.aClass434_5047 == Class151.aClass434_1702) {
			Class633.aClass641_8203.address = Class3.aString27;
			Class633.aClass641_8208.address = Class3.aString27;
			Class633.aClass641_8196.address = Class3.aString27;
			Class633.aClass641_8203.port = Class633.aClass641_8203.id * -984285601 + -1352120000;
			Class633.aClass641_8203.securePort = Class633.aClass641_8203.id * -172050845 + 974886224;
		}
		MaterialInformation.method1604(-1220541290);
		Class633.aClass641_8197 = Class633.aClass641_8203;
		Class540.aClass267_6063 = new Class267();
		Class51.aClass278_491 = new Class278_Sub1();
		Class72.aClass617_721 = new Class617(Class633.aClass641_8196.address, Class633.aClass641_8196.method7600(711286483), aClass437_8705.anInt5076 * 1002594281);
		if (aClass437_8705 == Class437.aClass437_5072)
			aBool8847 = false;
		Class565.aShortArray6361 = ObjectDefinitions.aShortArray5606 = NPCDefintion.aShortArray4796 = ItemDefinitions.aShortArray8151 = new short[256];
		try {
			Class602.aClipboard7878 = Class591_Sub5.method8786((byte) -62).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class108.aClass549_1426 = Class191.method2891(aCanvas7745, (short) 7960);
		Class26.aClass564_216 = Class494.method5903(aCanvas7745, true, -142327857);
		if (aClass643_7752 != null)
			Class224_Sub1.aClass558_9492 = new Class558(255, aClass643_7752, aClass643_7761, 2000000);
		Class133_Sub1.aClass411_Sub1_9827 = new Class411_Sub1(aClass5_8876);
		try {
			Class133_Sub1.aClass411_Sub1_9827.method5037(Class409.aClass409_4783, -336284487);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4971(Class416.aClass416_4931, false, 150920221);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4980(Class240.method3316(99999.0F, 99999.0F, 99999.0F), 1786502300);
			Class133_Sub1.aClass411_Sub1_9827.method4976(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (short) 5885);
			Class133_Sub1.aClass411_Sub1_9827.method4979(Class240.method3316(99999.0F, 99999.0F, 99999.0F), (byte) 111);
			Class133_Sub1.aClass411_Sub1_9827.method5024(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -728157374);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class333.method4180(VarTransmitLevel.anApplet8067, Class572_Sub12_Sub2.aString11255, -1658959500);
		if (Class434.aClass434_5044 != Class151.aClass434_1702 && Class151.aClass434_1702 != Class434.aClass434_5048)
			aBool8874 = true;
		aString7744 = Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935);
		Class204.aClass602_2411 = new Class602();
		new Thread(Class204.aClass602_2411).start();
		Class483.aClass10_5388 = new Class10();
	}

	final void method6914() {
		if (Class306.clientConfigsDomain != null && Class306.clientConfigsDomain.aBool10652)
			Class614.method7367(239906896);
		Class202_Sub1.method9211((short) 8479);
		Class392.method4730((byte) 107);
		if (null != Class272_Sub2.aClass106_9517)
			Class272_Sub2.aClass106_9517.method1666(-2014323025);
		if (Class637.aBool8266 && null != Class554.aFrame6320) {
			Class391.method4721(Class4.aClass672_30, Class554.aFrame6320, (byte) 1);
			Class554.aFrame6320 = null;
		}
		aClass195_8589.method2943(-2036749671);
		((Class195) aClass195_8589).aClass14_2336.method624((byte) 113);
		aClass195_8632.method2943(-1742809574);
		((Class195) aClass195_8632).aClass14_2336.method624((byte) 54);
		Class344.audio.method921((byte) 23);
		Class51.aClass278_491.method3731(-890672056);
		Class72.aClass617_721.method7386(1794105343);
		Class540.aClass267_6063.method3639((byte) 2);
		if (aClass455_8759 != null) {
			aClass455_8759.method5382(-1312945497);
			aClass455_8759 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class76.method1149(-979397332);
		try {
			Class614.method7369((short) -3786);
		} catch (Exception exception) {
			/* empty */
		}
		if (Class483.aClass10_5388 != null)
			Class483.aClass10_5388.method537(1382044759);
		if (aBool7733 && Class434.aClass434_5047 != Class151.aClass434_1702)
			Class414.method5086((short) -24489);
	}

	final void method6919() {
		if (Class306.clientConfigsDomain != null && Class306.clientConfigsDomain.aBool10652)
			Class614.method7367(239906896);
		Class202_Sub1.method9211((short) 28752);
		Class392.method4730((byte) 107);
		if (null != Class272_Sub2.aClass106_9517)
			Class272_Sub2.aClass106_9517.method1666(-1313729872);
		if (Class637.aBool8266 && null != Class554.aFrame6320) {
			Class391.method4721(Class4.aClass672_30, Class554.aFrame6320, (byte) 1);
			Class554.aFrame6320 = null;
		}
		aClass195_8589.method2943(-1983599606);
		((Class195) aClass195_8589).aClass14_2336.method624((byte) 36);
		aClass195_8632.method2943(-1984845954);
		((Class195) aClass195_8632).aClass14_2336.method624((byte) 99);
		Class344.audio.method921((byte) 5);
		Class51.aClass278_491.method3731(-455420299);
		Class72.aClass617_721.method7386(1964124563);
		Class540.aClass267_6063.method3639((byte) 2);
		if (aClass455_8759 != null) {
			aClass455_8759.method5382(859987317);
			aClass455_8759 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class76.method1149(-576493976);
		try {
			Class614.method7369((short) -21992);
		} catch (Exception exception) {
			/* empty */
		}
		if (Class483.aClass10_5388 != null)
			Class483.aClass10_5388.method537(1382044759);
		if (aBool7733 && Class434.aClass434_5047 != Class151.aClass434_1702)
			Class414.method5086((short) -31357);
	}

	public String method6916() {
		String string = " ";
		try {
			Class497 class497 = aClass613_8605.method7280((byte) -78);
			string = new StringBuilder().append(string).append(class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY).append(Class3.aString23).append(aClass613_8605.method7347(2087361646)).append(Class3.aString23).append(aClass613_8605.method7278(277214477)).append(" ").toString();
			if (null != Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
				string = new StringBuilder().append(string).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0]) + class497.localX * -2109597897).append(Class3.aString23).append(417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(Class274.anInt2911 * -374189215).append(Class3.aString23).append(-374189215 * Class274.anInt2911).append(Class3.aString23).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1670126604)).append(" ").append(Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.method8120(1785876541)).append(" ").append(Class344_Sub2.method9253(169233632)).append(" ").append(1960824389 * Class269.anInt2861).append(Class3.aString23).append(anInt7739 * -530390519).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub13_9220.method8236(-1535365997)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub24_9221.method9070((byte) 96)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub35_9233.method9183(-1766763163)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1353504961)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method9045(769854921)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(-456796019 * anInt7769).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt8580 * 835742603).append(" ").toString();
			if (null != Class272_Sub1.aClass572_Sub5_9450)
				string = new StringBuilder().append(string).append(Class272_Sub1.aClass572_Sub5_9450.anInt9048 * -1590322869).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString8838 != null)
				string = new StringBuilder().append(string).append(aString8838).toString();
			else
				string = new StringBuilder().append(string).append(Class3.aString23).toString();
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	static final void method7994() {
		Iterator iterator = aClass676_8747.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub9 class572_sub12_sub9 = (Class572_Sub12_Sub9) iterator.next();
			Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390);
			class456_sub1_sub2_sub4.method10596(1, -738260993);
			if (class456_sub1_sub2_sub4.method10613((byte) -60)) {
				class572_sub12_sub9.method6794((byte) -50);
				class456_sub1_sub2_sub4.method10601(-1902718190);
			}
		}
	}

	static final void method7995() {
		Class555.method6575(aClass73_8770, (short) 3527);
		Class568.anInt6388 += -497304101;
		if (!aBool8780 || !aBool8775) {
			if (1657009747 * Class568.anInt6388 > 1) {
				aClass73_8770 = null;
				aClass73_8771 = null;
			}
		} else {
			int i = Class26.aClass564_216.method6657((short) 623);
			int i_103_ = Class26.aClass564_216.method6658((byte) -71);
			i -= 12052287 * anInt8772;
			i_103_ -= -1634173751 * anInt8676;
			if (i < anInt8845 * 1280237521)
				i = anInt8845 * 1280237521;
			if (aClass73_8770.anInt764 * 669238293 + i > anInt8778 * -2091143177 + 1280237521 * anInt8845)
				i = (-2091143177 * anInt8778 + anInt8845 * 1280237521 - aClass73_8770.anInt764 * 669238293);
			if (i_103_ < 1007747209 * anInt8777)
				i_103_ = anInt8777 * 1007747209;
			if (i_103_ + 1360982075 * aClass73_8770.anInt765 > anInt8779 * 250871123 + anInt8777 * 1007747209)
				i_103_ = (1007747209 * anInt8777 + 250871123 * anInt8779 - aClass73_8770.anInt765 * 1360982075);
			int i_104_;
			int i_105_;
			if (Class619.aClass73_8062 == aClass73_8771) {
				i_104_ = i;
				i_105_ = i_103_;
			} else {
				i_104_ = (aClass73_8771.anInt774 * -1883230751 + (i - 1280237521 * anInt8845));
				i_105_ = (i_103_ - 1007747209 * anInt8777 + aClass73_8771.anInt775 * -2139739529);
			}
			if (!Class26.aClass564_216.method6656(-1640821042)) {
				if (aBool8783) {
					Class131.method2286(-1705608345);
					if (null != aClass73_8770.anObjectArray763) {
						Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
						class572_sub20.thizInterface = aClass73_8770;
						class572_sub20.anInt9148 = i_104_ * 638530953;
						class572_sub20.anInt9150 = 2034326205 * i_105_;
						InterfaceDefinitions class73 = method7993(aClass73_8770);
						InterfaceDefinitions class73_106_ = aClass73_8603;
						boolean bool = false;
						for (/**/; (null != class73_106_ && -1 != -1604592419 * class73_106_.anInt768 && class73 != null); class73_106_ = (Class534.aClass83Array5975[class73_106_.selfId * -1718435171 >> 16].aClass73Array1081[(class73_106_.anInt768 * -1604592419 & 0xffff)])) {
							if (class73_106_.selfId * -1718435171 == class73.selfId * -1718435171) {
								bool = true;
								break;
							}
						}
						if (null != class73_106_ && class73 != null && Class619.aClass73_8062 != class73 && !bool)
							class572_sub20.targetInterface = Class619.aClass73_8062;
						else
							class572_sub20.targetInterface = aClass73_8603;
						class572_sub20.params = aClass73_8770.anObjectArray763;
						Class34.executeCs2(class572_sub20, -2048047621);
					}
					if (null != aClass73_8603 && method7993(aClass73_8770) != null)
						Class381.method4648(aClass73_8770, aClass73_8603, (byte) -80);
				} else if ((-343113449 * anInt8637 == 1 || Class461.method5470(-2101797875)) && Class25.anInt172 * 357782167 > 2)
					Class675.method7961((-27579797 * anInt8733 + anInt8772 * 12052287), (anInt8676 * -1634173751 + anInt8782 * -2142372967), (byte) 0);
				else if (Class110.method2073(191665668))
					Class675.method7961((12052287 * anInt8772 + -27579797 * anInt8733), (anInt8676 * -1634173751 + anInt8782 * -2142372967), (byte) 0);
				aClass73_8770 = null;
				aClass73_8771 = null;
			} else {
				if (Class568.anInt6388 * 1657009747 > aClass73_8770.anInt739 * 2095229683) {
					int i_107_ = i - -27579797 * anInt8733;
					int i_108_ = i_103_ - -2142372967 * anInt8782;
					if (i_107_ > -1961812835 * aClass73_8770.anInt796 || i_107_ < -(-1961812835 * aClass73_8770.anInt796) || i_108_ > -1961812835 * aClass73_8770.anInt796 || i_108_ < -(-1961812835 * aClass73_8770.anInt796))
						aBool8783 = true;
				}
				if (null != aClass73_8770.anObjectArray866 && aBool8783) {
					Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
					class572_sub20.thizInterface = aClass73_8770;
					class572_sub20.anInt9148 = 638530953 * i_104_;
					class572_sub20.anInt9150 = 2034326205 * i_105_;
					class572_sub20.params = aClass73_8770.anObjectArray866;
					Class34.executeCs2(class572_sub20, -2081393329);
				}
			}
		}
	}

	static final void method7996() {
		Class21.method700(Class272_Sub2.aClass106_9517, (short) 8192);
		if (-1498269815 * anInt8714 != Class274.anInt2911 * -374189215)
			Class286.method3869((byte) -76);
	}

	public static boolean method7997(int i) {
		return 1 == i || i == 18 || 4 == i;
	}

	public static boolean method7998(int i) {
		return 1 == i || i == 18 || 4 == i;
	}

	public static boolean method7999(int i) {
		return 1 == i || i == 18 || 4 == i;
	}

	public static boolean method8000(int i) {
		return 1 == i || i == 18 || 4 == i;
	}

	void method8001() {
		boolean bool = Class51.aClass278_491.method3747(-56523819);
		if (!bool)
			method8076(195100249);
	}

	static final void method8002() {
		Class497 class497 = aClass613_8605.method7280((byte) -107);
		Class240 class240 = Class133_Sub1.aClass411_Sub1_9827.method4968(-1835403509);
		Class36.anInt387 = 70707251 * ((int) class240.aFloat2653 - (-2109597897 * class497.localX << 9));
		Class572_Sub13_Sub2.anInt11451 = -371247041 * -(int) class240.aFloat2656;
		Class49.anInt490 = -114706035 * ((int) class240.aFloat2657 - (417324155 * class497.localY << 9));
		Class455.anInt5187 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method4999(-1138907099) * 2607.5945876176133) & 0x3fff) * 58615007;
		Class406.anInt4765 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) & 0x3fff) * 1259382101;
		Class88.anInt1225 = 0;
	}

	void method8003() {
		boolean bool = Class51.aClass278_491.method3747(854556579);
		if (!bool)
			method8076(1967158180);
	}

	void method8004() {
		boolean bool = Class51.aClass278_491.method3747(763908985);
		if (!bool)
			method8076(1475506971);
	}

	static final void method8005() {
		int i = 1657484935 * Class184.anInt2163;
		int[] is = Class184.anIntArray2154;
		int i_109_ = Class213.aClass572_Sub24_2463.aClass665_Sub26_9240.method9090(-498527667);
		boolean bool = 1 == i_109_ && i > 200 || 0 == i_109_ && i > 50;
		for (int i_110_ = 0; i_110_ < i; i_110_++) {
			Player class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_110_]];
			if (!class456_sub1_sub2_sub3_sub2.method10700((byte) 15))
				class456_sub1_sub2_sub3_sub2.anInt11646 = 2010033325;
			else if (class456_sub1_sub2_sub3_sub2.visible)
				class456_sub1_sub2_sub3_sub2.anInt11646 = 2010033325;
			else {
				class456_sub1_sub2_sub3_sub2.method10469((byte) -77);
				if (class456_sub1_sub2_sub3_sub2.aShort11503 < 0 || class456_sub1_sub2_sub3_sub2.aShort11500 < 0 || (class456_sub1_sub2_sub3_sub2.aShort11499 >= aClass613_8605.method7347(1289240312)) || (class456_sub1_sub2_sub3_sub2.aShort11502 >= aClass613_8605.method7278(277214477)))
					class456_sub1_sub2_sub3_sub2.anInt11646 = 2010033325;
				else {
					class456_sub1_sub2_sub3_sub2.aBool11828 = (class456_sub1_sub2_sub3_sub2.aClass663_Sub2_11631.aBool9556) ? bool : false;
					if (class456_sub1_sub2_sub3_sub2 == Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
						class456_sub1_sub2_sub3_sub2.anInt11646 = -137450323;
					else {
						int i_111_ = 0;
						if (!class456_sub1_sub2_sub3_sub2.aBool11612)
							i_111_++;
						if (!class456_sub1_sub2_sub3_sub2.aClass652_11627.method7699(1796444438))
							i_111_ += 2;
						i_111_ += 5 - class456_sub1_sub2_sub3_sub2.method10556((short) -32483) << 2;
						if ((Class47.aClass47_467 != class456_sub1_sub2_sub3_sub2.aClass47_11837) || class456_sub1_sub2_sub3_sub2.isClanMember)
							i_111_ += 512;
						else {
							if (0 == anInt8704 * 1777342339)
								i_111_ += 32;
							else
								i_111_ += 128;
							i_111_ += 256;
						}
						class456_sub1_sub2_sub3_sub2.anInt11646 = -2010033325 * (1 + i_111_);
					}
				}
			}
		}
		for (int i_112_ = 0; i_112_ < 765313669 * anInt8625; i_112_++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i_112_])).anObject9081));
			if (!class456_sub1_sub2_sub3_sub1.method10683((byte) 4) || !(class456_sub1_sub2_sub3_sub1.aClass410_11803.method4963(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, (byte) 2)))
				class456_sub1_sub2_sub3_sub1.anInt11646 = 2010033325;
			else {
				class456_sub1_sub2_sub3_sub1.method10469((byte) 23);
				if (class456_sub1_sub2_sub3_sub1.aShort11503 < 0 || class456_sub1_sub2_sub3_sub1.aShort11500 < 0 || (class456_sub1_sub2_sub3_sub1.aShort11499 >= aClass613_8605.method7347(1250379636)) || (class456_sub1_sub2_sub3_sub1.aShort11502 >= aClass613_8605.method7278(277214477)))
					class456_sub1_sub2_sub3_sub1.anInt11646 = 2010033325;
				else {
					int i_113_ = 0;
					if (!class456_sub1_sub2_sub3_sub1.aBool11612)
						i_113_++;
					if (!class456_sub1_sub2_sub3_sub1.aClass652_11627.method7699(2109124223))
						i_113_ += 2;
					i_113_ += 5 - class456_sub1_sub2_sub3_sub1.method10556((short) -19974) << 2;
					if (anInt8704 * 1777342339 == 0) {
						if (class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4814)
							i_113_ += 64;
						else
							i_113_ += 128;
					} else if (1 == 1777342339 * anInt8704) {
						if (class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4814)
							i_113_ += 32;
						else
							i_113_ += 64;
					}
					if (class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4815)
						i_113_ += 1024;
					else if (!class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4816)
						i_113_ += 256;
					class456_sub1_sub2_sub3_sub1.anInt11646 = (i_113_ + 1) * -2010033325;
				}
			}
		}
		for (int i_114_ = 0; i_114_ < aClass193Array8593.length; i_114_++) {
			Class193 class193 = aClass193Array8593[i_114_];
			if (class193 != null) {
				if (1 == class193.anInt2319 * -910441311) {
					LinkableObject class572_sub9 = ((LinkableObject) aClass676_8622.get((long) (105420277 * (class193.anInt2316))));
					if (null != class572_sub9) {
						NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
						if ((class456_sub1_sub2_sub3_sub1.anInt11646 * 1371302107) >= 0)
							class456_sub1_sub2_sub3_sub1.anInt11646 += -1969580032;
					}
				} else if (-910441311 * class193.anInt2319 == 10) {
					Player class456_sub1_sub2_sub3_sub2 = (aClass456_Sub1_Sub2_Sub3_Sub2Array8727[class193.anInt2316 * 105420277]);
					if (null != class456_sub1_sub2_sub3_sub2 && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != class456_sub1_sub2_sub3_sub2) && (1371302107 * class456_sub1_sub2_sub3_sub2.anInt11646) >= 0)
						class456_sub1_sub2_sub3_sub2.anInt11646 += -1969580032;
				}
			}
		}
	}

	void method8006(byte i) {
		boolean bool = Class51.aClass278_491.method3747(-909871613);
		if (!bool)
			method8076(1021177315);
	}

	public static void method8007(int i, int i_115_, int i_116_) {
		i <<= 3;
		i_115_ <<= 3;
		i_116_ <<= 3;
		if (625220759 * Class18.anInt143 == 1) {
			if (Class133_Sub1.aClass411_Sub1_9827.method4994(57814599) == Class413.aClass413_4915) {
				Class423_Sub3 class423_sub3 = (Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -55);
				Class230 class230 = new Class230();
				Class230 class230_117_ = new Class230();
				class230.method3172(0.0F, 1.0F, 0.0F, 3.1415927F - (float) (2.0 * (3.141592653589793 * (double) i_115_) / 16384.0));
				Class240 class240 = new Class240(1.0F, 0.0F, 0.0F);
				class240.method3288(class230);
				class240.method3272();
				class230_117_.method3209(class240, (float) ((double) i * 3.141592653589793 * 2.0) / 16384.0F);
				class230.method3189(class230_117_);
				class423_sub3.aClass230_9806.method3170(class230);
			}
		} else {
			aFloat8822 = (float) i;
			aFloat8678 = (float) i_115_;
			if (Class18.anInt143 * 625220759 == 5) {
				Class455.anInt5187 = 58615007 * i;
				Class406.anInt4765 = 1259382101 * i_115_;
				Class88.anInt1225 = -1263582291 * i_116_;
			}
			Class245.method3350(2138852627);
		}
		aBool8685 = true;
	}

	static final void method8008() {
		Class479.method5672(-809516282);
		aClass613_8605.method7295((byte) -1);
		for (int i = 0; i < aClass193Array8593.length; i++)
			aClass193Array8593[i] = null;
		for (int i = 0; i < aClass575Array8594.length; i++)
			aClass575Array8594[i] = null;
		Class388.method4691(1651524888);
		for (int i = 0; i < 2048; i++)
			aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i] = null;
		anInt8625 = 0;
		aClass676_8622.method7964((byte) 7);
		anInt8624 = 0;
		aClass676_8749.method7964((byte) 37);
		Class133_Sub4.method9340(Class111.method2081((byte) -109), (short) -1011);
		anInt8614 = 0;
		Class133_Sub23.playerVarsProvider.domain.method6070((byte) -118);
		Class210.aClass334_2440 = null;
		Class440.aClass334_5097 = null;
		Class55.aClass572_Sub10_526 = null;
		Class251.aClass572_Sub10_2731 = null;
		Class221.aClass49_2607 = null;
		Class273.aClass461_2902 = null;
		Class324.aLong4087 = 0L;
		Class35.method782((short) 582);
		Class345.method4317((byte) -6);
	}

	final void method6932(int i) {
		if (19 != anInt8580 * 835742603) {
			if ((8 == 835742603 * anInt8580 || Class133_Sub12.method9368(835742603 * anInt8580, 2134888631) || Class19.method692(835742603 * anInt8580, (byte) 4)) && null != Class344.audio)
				Class344.audio.sendMusic(Class344.audio.method940(-925178650), Class213.aClass572_Sub24_2463.aClass665_Sub15_9226.method8970(660014728));
			if (aBool8856) {
				synchronized (anObject8694) {
					anObject8694.notify();
				}
				synchronized (anObject8601) {
					try {
						anObject8601.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool8856 = false;
			}
			cycles++;
			if (cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class439.anInt5093 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6);
				aRandom8673.setSeed((long) Class439.anInt5093);
			}
			long l = Class69.method1067(-1638304649);
			aClass195_8589.method2930((byte) 4);
			aClass195_8632.method2930((byte) 4);
			method8006((byte) -98);
			if (Class41.aClass259_425 != null)
				Class41.aClass259_425.method3550(1167000314);
			if (Class344.audio != null)
				Class344.audio.method920((short) -6066);
			Class108.aClass549_1426.method6513(1844994871);
			Class26.aClass564_216.method6655((short) 13215);
			Class401.method4776(Class272_Sub2.aClass106_9517, l);
			if (Class272_Sub2.aClass106_9517 != null)
				Class272_Sub2.aClass106_9517.method1668((int) l);
			anInt8730 = 0;
			anInt8609 = 0;
			for (Interface64 interface64 = Class108.aClass549_1426.method6515((byte) 55); interface64 != null; interface64 = Class108.aClass549_1426.method6515((byte) 80)) {
				int i_118_ = interface64.method136(384450946);
				if (2 == i_118_ || 3 == i_118_) {
					if (anInt8730 * -1971020205 < 132) {
						anInterface64Array8607[-1971020205 * anInt8730] = interface64;
						anInt8730 += -88517157;
					}
				} else if (0 == i_118_) {
					if (Class334.method4218((byte) 82) && interface64.method383(-2008746270) == 28) {
						if (-1550439133 * rights >= 2 && Class108.aClass549_1426.method6514(82, (byte) 1)) {
							if (IncomingPacket.method4113((byte) -101))
								RSSocket.method7604(-257855448);
							else
								Class102_Sub5.method9948(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method273((byte) -47), -1346972493);
						} else if (ItemsContainer.method8674(1411481469) && (Class213.aClass572_Sub24_2463.aClass665_Sub25_9213.method9084(935404035) == 0 || Class108.aClass549_1426.method6514(86, (byte) 1)))
							Class380.method4639(57656906);
						else if (Class213.aClass572_Sub24_2463.aClass665_Sub25_9213.method9084(1602568932) == 0 || Class108.aClass549_1426.method6514(86, (byte) 1))
							Class388.method4693(-173290106);
						else
							Class121.method2185((Class279.aClass279_2952.method3758(Class594.aClass435_7823, 16711935)), -1327832495);
					}
					if (anInt8609 * 2134888631 < 77) {
						anInterface64Array8610[2134888631 * anInt8609] = interface64;
						anInt8609 += 2107116807;
					}
				}
			}
			anInt8787 = 0;
			for (Class572_Sub13 class572_sub13 = Class26.aClass564_216.method6659(841595336); null != class572_sub13; class572_sub13 = Class26.aClass564_216.method6659(-1576543714)) {
				int i_119_ = class572_sub13.method8416((byte) 10);
				if (-1 == i_119_)
					Class639_Sub7.method8916(class572_sub13, 1785746541);
				else if (6 == i_119_) {
					anInt8787 += class572_sub13.method8419(-1841144) * -610345651;
					class572_sub13.method8421(421222932);
				} else if (Class566.method6715(i_119_, (byte) 0)) {
					aClass675_8745.method7940(class572_sub13, -1468197789);
					if (aClass675_8745.method7927(-1369550781) > 10) {
						Class572_Sub13 class572_sub13_120_ = ((Class572_Sub13) aClass675_8745.method7920(-1945803963));
						if (class572_sub13_120_ != null)
							class572_sub13_120_.method8421(421222932);
					}
				}
			}
			if (ItemsContainer.method8674(-230928007))
				Class294.method3957(-402877888);
			if (Class664.method7853(835742603 * anInt8580, (short) -24834)) {
				Class255_Sub1.method8247((byte) -101);
				Class565.method6697(894588399);
			} else if (Class177.method2766(anInt8580 * 835742603, (short) 1465))
				aClass613_8605.method7311(1305107780);
			if (Class133_Sub12.method9368(835742603 * anInt8580, 2134888631) && !Class177.method2766(anInt8580 * 835742603, (short) -6890)) {
				method8020((byte) -87);
				Class134_Sub1.method9974(-2079062477);
				Class280_Sub1.method8819(-706759757);
			} else if (Class19.method692(835742603 * anInt8580, (byte) 4) && !Class177.method2766(anInt8580 * 835742603, (short) 4178)) {
				method8020((byte) -79);
				Class280_Sub1.method8819(-283535481);
			} else if (4 == anInt8580 * 835742603)
				Class280_Sub1.method8819(2026103121);
			else if (Class435.method5266(835742603 * anInt8580, (byte) -10) && !Class177.method2766(835742603 * anInt8580, (short) -7529))
				Class550.method6532((byte) 7);
			else if (anInt8580 * 835742603 == 13 || 835742603 * anInt8580 == 14) {
				Class280_Sub1.method8819(1833184183);
				if (Class13.anInt106 * -1586424751 != -3 && -1586424751 * Class13.anInt106 != 2 && -1586424751 * Class13.anInt106 != 15) {
					if (835742603 * anInt8580 == 14) {
						Class13.anInt109 = Class13.anInt90 * -562270141;
						Class13.anInt108 = 1249033619 * Class13.anInt111;
						Class13.anInt65 = Class13.anInt106 * 2094260509;
						if (Class633.aBool8200) {
							Class242.method3340(2112639107 * (Class633.aClass641_8195.id), (Class633.aClass641_8195.address), (byte) 50);
							aClass195_8589.method2946((byte) 0);
							Class463.method5478(13, 204317158);
						} else
							Class439.method5276(Class13.aBool114, (byte) 8);
					} else
						Class439.method5276(false, (byte) 8);
				}
			}
			Class202_Sub1_Sub1.method10208(Class272_Sub2.aClass106_9517, 1435738161);
			aClass675_8745.method7920(-1945803963);
			if (null != Class272_Sub2.aClass106_9517) {
				Iterator iterator = aMap8764.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					Class185 class185 = (Class185) entry.getValue();
					if (class185.method2832(-837002902)) {
						byte[] is = class185.method2831(1360756500);
						if (null != is) {
							try {
								BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
								int[] is_121_ = Class399.method4769(bufferedimage, (byte) 0);
								Class161 class161 = (Class272_Sub2.aClass106_9517.method1744(is_121_, 0, bufferedimage.getWidth(), bufferedimage.getWidth(), bufferedimage.getHeight(), -1470691936));
								aClass127_8631.method2229(class161, (long) ((Integer) entry.getKey()).intValue());
							} catch (IOException ioexception) {
								Class640.method7592(Class278_Sub1.aclient9503.method6946((byte) 40), ioexception, 1497908166);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	public static void method8009() {
		if (Class554.method6557(-1261405164) != Class578.aClass578_7670) {
			try {
				String string = VarTransmitLevel.anApplet8067.getParameter(Class328.aClass328_4186.aString4200);
				int i = ((int) (Class69.method1067(-1778538245) / 86400000L) - 11745);
				String string_122_ = new StringBuilder().append("usrdob=").append(i).append("; version=1; path=/; domain=").append(string).toString();
				Class277.method3717(VarTransmitLevel.anApplet8067, new StringBuilder().append("document.cookie=\"").append(string_122_).append("\"").toString(), (byte) -34);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	final void method8010() {
		if (5 == 835742603 * anInt8580 && !Class574.method6808(-791368938) || (anInt8580 * 835742603 == 11 && 42 == Class13.anInt106 * -1586424751) || (15 == anInt8580 * 835742603 && (49 == 655322057 * Class13.anInt105 || 52 == 655322057 * Class13.anInt105)) || 6 == anInt8580 * 835742603) {
			if (-1784648141 * anInt8604 > 1) {
				anInt8604 -= -425706245;
				anInt8729 = anInt8839 * 653930141;
			}
			if (!Class25.aBool165)
				Class345.method4317((byte) -117);
			if (15 != anInt8580 * 835742603 || (Class13.anInt105 * 655322057 != 49 && 52 != Class13.anInt105 * 655322057)) {
				for (int i = 0; i < 100 && MaterialInformation.method1605(aClass195_8632, 479324213); i++) {
					/* empty */
				}
			}
		}
		Class603.method7145(-2027106995);
		Class572_Sub12_Sub17.method10456((short) -2313);
		anInt8674 += 237624865;
		Class175.method2756(-1, -1, -1034419750);
		Class296.method3964(null, -1, -1, 504000849);
		Class514.method6093(1584055751);
		anInt8839 += -1210150071;
		for (int i = 0; i < anInt8624 * 617551237; i++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) aClass572_Sub9Array8623[i].anObject9081);
			if (class456_sub1_sub2_sub3_sub1 != null) {
				byte i_123_ = class456_sub1_sub2_sub3_sub1.aClass410_11803.aByte4836;
				if (0 != (i_123_ & 0x1)) {
					int i_124_ = class456_sub1_sub2_sub3_sub1.method10556((short) -29657);
					if ((i_123_ & 0x2) != 0 && 0 == (-2037536229 * class456_sub1_sub2_sub3_sub1.stepsCount) && Math.random() * 1000.0 < 10.0) {
						int i_125_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						int i_126_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						if (i_125_ != 0 || i_126_ != 0) {
							int i_127_ = i_125_ + (class456_sub1_sub2_sub3_sub1.screenX[0]);
							int i_128_ = ((class456_sub1_sub2_sub3_sub1.screenY[0]) + i_126_);
							if (i_127_ < 0) {
								boolean bool = false;
							} else if (i_127_ > (aClass613_8605.method7347(-1035221850) - i_124_ - 1))
								i_127_ = (aClass613_8605.method7347(1248125065) - i_124_ - 1);
							if (i_128_ < 0) {
								boolean bool = false;
							} else if (i_128_ > (aClass613_8605.method7278(277214477) - i_124_ - 1))
								i_128_ = (aClass613_8605.method7278(277214477) - i_124_ - 1);
						}
					}
					Class9.method533(class456_sub1_sub2_sub3_sub1, true, 2053613982);
					int i_129_ = Class625.method7457(class456_sub1_sub2_sub3_sub1, 329886583);
					Class592.method7016(class456_sub1_sub2_sub3_sub1, (byte) 63);
					Class534.method6373(class456_sub1_sub2_sub3_sub1, 1927859097 * IncomingPacket.anInt4077, Class270.anInt2863 * 1062500197, i_129_, (byte) 125);
					Class600.method7062(class456_sub1_sub2_sub3_sub1, 1927859097 * IncomingPacket.anInt4077, 2064890174);
					Class52.method910(class456_sub1_sub2_sub3_sub1, (byte) 2);
					Class230 class230 = Class230.method3210();
					class230.method3173(Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11655.method645(-1329845214)), Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11657.method645(1546171949)), Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11656.method645(1280372136)));
					class456_sub1_sub2_sub3_sub1.method5404(class230);
					class230.method3165();
				}
			}
		}
		if ((12 == anInt8580 * 835742603 || 11 == anInt8580 * 835742603 || 5 == anInt8580 * 835742603 || 6 == 835742603 * anInt8580) && (!Class574.method6808(1742982715) || (11 == anInt8580 * 835742603 && Class13.anInt106 * -1586424751 == 42) || (15 == 835742603 * anInt8580 && (49 == Class13.anInt105 * 655322057 || 52 == 655322057 * Class13.anInt105))) && !Class665_Sub26.method9099(672536063)) {
			if (625220759 * Class18.anInt143 == 5)
				Class444.method5331((byte) 94);
			else
				Class540.method6417((byte) 54);
			if (Class36.anInt387 * 386814715 >> 9 < 14 || (Class36.anInt387 * 386814715 >> 9 >= aClass613_8605.method7347(1284153077) - 14) || Class49.anInt490 * -999214779 >> 9 < 14 || (Class49.anInt490 * -999214779 >> 9 >= aClass613_8605.method7278(277214477) - 14))
				aClass613_8605.method7348(new Class598(Class569.aClass569_6392, null), -1676280567);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8813.method7920(-1945803963);
			if (class572_sub20 == null)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (-1665128073 * class73.activeComponent >= 0) {
				InterfaceDefinitions class73_130_ = Class512.method6083(-1604592419 * class73.anInt768, (short) 4580);
				if (null == class73_130_ || null == class73_130_.aClass73Array916 || (-1665128073 * class73.activeComponent >= class73_130_.aClass73Array916.length) || class73 != (class73_130_.aClass73Array916[class73.activeComponent * -1665128073]))
					continue;
			}
			Class34.executeCs2(class572_sub20, -2006323257);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8884.method7920(-1945803963);
			if (null == class572_sub20)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (class73.activeComponent * -1665128073 >= 0) {
				InterfaceDefinitions class73_131_ = Class512.method6083(-1604592419 * class73.anInt768, (short) 23696);
				if (null == class73_131_ || null == class73_131_.aClass73Array916 || (-1665128073 * class73.activeComponent >= class73_131_.aClass73Array916.length) || class73 != (class73_131_.aClass73Array916[-1665128073 * class73.activeComponent]))
					continue;
			}
			Class34.executeCs2(class572_sub20, -2060764240);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8812.method7920(-1945803963);
			if (class572_sub20 == null)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (class73.activeComponent * -1665128073 >= 0) {
				InterfaceDefinitions class73_132_ = Class512.method6083(-1604592419 * class73.anInt768, (short) -6906);
				if (null == class73_132_ || class73_132_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= class73_132_.aClass73Array916.length) || (class73_132_.aClass73Array916[class73.activeComponent * -1665128073]) != class73)
					continue;
			}
			Class34.executeCs2(class572_sub20, -2109232359);
		}
		if (aClass73_8770 != null)
			Class122.method2197(-1915645410);
		if (cycles % 15000 == 0)
			Class175.method2754((byte) 0);
		if (5 == 835742603 * anInt8580 && !Class574.method6808(1315071365) || (11 == anInt8580 * 835742603 && 42 == -1586424751 * Class13.anInt106) || (835742603 * anInt8580 == 15 && (49 == Class13.anInt105 * 655322057 || 655322057 * Class13.anInt105 == 52)) || 6 == 835742603 * anInt8580)
			Class15.method654(2002803636);
		Class572_Sub11.method8410(-1537199586);
		if (aBool8573 && 835742603 * anInt8580 == 5) {
			Class425.method5177((short) 12912);
			aBool8573 = false;
		}
		if (Class306.clientConfigsDomain.aBool10652 && (Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L < Class69.method1067(-1933448111) - 60000L))
			Class614.method7367(239906896);
		for (Class591_Sub1 class591_sub1 = (Class591_Sub1) aClass652_8864.method7697(94721876); null != class591_sub1; class591_sub1 = (Class591_Sub1) aClass652_8864.method7698(1271935443)) {
			if ((long) (((Class591_Sub1) class591_sub1).anInt9180 * -1160847613) < Class69.method1067(-1762932320) / 1000L - 5L) {
				if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
					Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 1885757855);
				if (((Class591_Sub1) class591_sub1).aShort9181 == 0)
					Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 1939929516);
				class591_sub1.method7002((byte) 83);
			}
		}
		if (835742603 * anInt8580 == 5 && !Class574.method6808(-991343886) || (11 == 835742603 * anInt8580 && 42 == -1586424751 * Class13.anInt106) || (15 == anInt8580 * 835742603 && (Class13.anInt105 * 655322057 == 49 || 52 == 655322057 * Class13.anInt105)) || 6 == 835742603 * anInt8580) {
			if (835742603 * anInt8580 != 11 && aClass195_8632.method2933(-1986486647) == null)
				Class439.method5276(false, (byte) 8);
			else if (null != aClass195_8632) {
				aClass195_8632.anInt2337 += 394568993;
				if (aClass195_8632.anInt2337 * -1242489119 > 50) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, aClass195_8632.aClass650_2340, 29311254);
					aClass195_8632.method2929(class572_sub25, (byte) -24);
				}
				try {
					aClass195_8632.method2936((byte) -76);
				} catch (IOException ioexception) {
					if (11 == anInt8580 * 835742603)
						aClass195_8632.method2943(-2101990190);
					else
						Class439.method5276(false, (byte) 8);
				}
			}
		}
	}

	final void method8011() {
		if (5 == 835742603 * anInt8580 && !Class574.method6808(-343411653) || (anInt8580 * 835742603 == 11 && 42 == Class13.anInt106 * -1586424751) || (15 == anInt8580 * 835742603 && (49 == 655322057 * Class13.anInt105 || 52 == 655322057 * Class13.anInt105)) || 6 == anInt8580 * 835742603) {
			if (-1784648141 * anInt8604 > 1) {
				anInt8604 -= -425706245;
				anInt8729 = anInt8839 * 653930141;
			}
			if (!Class25.aBool165)
				Class345.method4317((byte) -18);
			if (15 != anInt8580 * 835742603 || (Class13.anInt105 * 655322057 != 49 && 52 != Class13.anInt105 * 655322057)) {
				for (int i = 0; (i < 100 && MaterialInformation.method1605(aClass195_8632, 2133970172)); i++) {
					/* empty */
				}
			}
		}
		Class603.method7145(-297098827);
		Class572_Sub12_Sub17.method10456((short) -16388);
		anInt8674 += 237624865;
		Class175.method2756(-1, -1, -1034419750);
		Class296.method3964(null, -1, -1, -1954268399);
		Class514.method6093(1665570640);
		anInt8839 += -1210150071;
		for (int i = 0; i < anInt8624 * 617551237; i++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) aClass572_Sub9Array8623[i].anObject9081);
			if (class456_sub1_sub2_sub3_sub1 != null) {
				byte i_133_ = class456_sub1_sub2_sub3_sub1.aClass410_11803.aByte4836;
				if (0 != (i_133_ & 0x1)) {
					int i_134_ = class456_sub1_sub2_sub3_sub1.method10556((short) -32207);
					if ((i_133_ & 0x2) != 0 && 0 == (-2037536229 * class456_sub1_sub2_sub3_sub1.stepsCount) && Math.random() * 1000.0 < 10.0) {
						int i_135_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						int i_136_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						if (i_135_ != 0 || i_136_ != 0) {
							int i_137_ = i_135_ + (class456_sub1_sub2_sub3_sub1.screenX[0]);
							int i_138_ = ((class456_sub1_sub2_sub3_sub1.screenY[0]) + i_136_);
							if (i_137_ < 0) {
								boolean bool = false;
							} else if (i_137_ > (aClass613_8605.method7347(429810256) - i_134_ - 1))
								i_137_ = (aClass613_8605.method7347(-585729250) - i_134_ - 1);
							if (i_138_ < 0) {
								boolean bool = false;
							} else if (i_138_ > (aClass613_8605.method7278(277214477) - i_134_ - 1))
								i_138_ = (aClass613_8605.method7278(277214477) - i_134_ - 1);
						}
					}
					Class9.method533(class456_sub1_sub2_sub3_sub1, true, 1284331440);
					int i_139_ = Class625.method7457(class456_sub1_sub2_sub3_sub1, -1562644731);
					Class592.method7016(class456_sub1_sub2_sub3_sub1, (byte) 61);
					Class534.method6373(class456_sub1_sub2_sub3_sub1, 1927859097 * IncomingPacket.anInt4077, Class270.anInt2863 * 1062500197, i_139_, (byte) 32);
					Class600.method7062(class456_sub1_sub2_sub3_sub1, 1927859097 * IncomingPacket.anInt4077, 1887995428);
					Class52.method910(class456_sub1_sub2_sub3_sub1, (byte) 2);
					Class230 class230 = Class230.method3210();
					class230.method3173(Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11655.method645(-1422008432)), Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11657.method645(-452038613)), Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11656.method645(1954404248)));
					class456_sub1_sub2_sub3_sub1.method5404(class230);
					class230.method3165();
				}
			}
		}
		if ((12 == anInt8580 * 835742603 || 11 == anInt8580 * 835742603 || 5 == anInt8580 * 835742603 || 6 == 835742603 * anInt8580) && (!Class574.method6808(1721053833) || (11 == anInt8580 * 835742603 && Class13.anInt106 * -1586424751 == 42) || (15 == 835742603 * anInt8580 && (49 == Class13.anInt105 * 655322057 || 52 == 655322057 * Class13.anInt105))) && !Class665_Sub26.method9099(890052999)) {
			if (625220759 * Class18.anInt143 == 5)
				Class444.method5331((byte) 104);
			else
				Class540.method6417((byte) 13);
			if (Class36.anInt387 * 386814715 >> 9 < 14 || (Class36.anInt387 * 386814715 >> 9 >= aClass613_8605.method7347(1131501041) - 14) || Class49.anInt490 * -999214779 >> 9 < 14 || (Class49.anInt490 * -999214779 >> 9 >= aClass613_8605.method7278(277214477) - 14))
				aClass613_8605.method7348(new Class598(Class569.aClass569_6392, null), 170272702);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8813.method7920(-1945803963);
			if (class572_sub20 == null)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (-1665128073 * class73.activeComponent >= 0) {
				InterfaceDefinitions class73_140_ = Class512.method6083(-1604592419 * class73.anInt768, (short) -22649);
				if (null == class73_140_ || null == class73_140_.aClass73Array916 || (-1665128073 * class73.activeComponent >= class73_140_.aClass73Array916.length) || class73 != (class73_140_.aClass73Array916[class73.activeComponent * -1665128073]))
					continue;
			}
			Class34.executeCs2(class572_sub20, -2137430774);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8884.method7920(-1945803963);
			if (null == class572_sub20)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (class73.activeComponent * -1665128073 >= 0) {
				InterfaceDefinitions class73_141_ = Class512.method6083(-1604592419 * class73.anInt768, (short) -5127);
				if (null == class73_141_ || null == class73_141_.aClass73Array916 || (-1665128073 * class73.activeComponent >= class73_141_.aClass73Array916.length) || class73 != (class73_141_.aClass73Array916[-1665128073 * class73.activeComponent]))
					continue;
			}
			Class34.executeCs2(class572_sub20, -2020930149);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8812.method7920(-1945803963);
			if (class572_sub20 == null)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (class73.activeComponent * -1665128073 >= 0) {
				InterfaceDefinitions class73_142_ = Class512.method6083(-1604592419 * class73.anInt768, (short) 18571);
				if (null == class73_142_ || class73_142_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= class73_142_.aClass73Array916.length) || (class73_142_.aClass73Array916[class73.activeComponent * -1665128073]) != class73)
					continue;
			}
			Class34.executeCs2(class572_sub20, -1972609383);
		}
		if (aClass73_8770 != null)
			Class122.method2197(-2011978165);
		if (cycles % 15000 == 0)
			Class175.method2754((byte) 0);
		if (5 == 835742603 * anInt8580 && !Class574.method6808(947043265) || (11 == anInt8580 * 835742603 && 42 == -1586424751 * Class13.anInt106) || (835742603 * anInt8580 == 15 && (49 == Class13.anInt105 * 655322057 || 655322057 * Class13.anInt105 == 52)) || 6 == 835742603 * anInt8580)
			Class15.method654(1740166935);
		Class572_Sub11.method8410(-1625895117);
		if (aBool8573 && 835742603 * anInt8580 == 5) {
			Class425.method5177((short) 25893);
			aBool8573 = false;
		}
		if (Class306.clientConfigsDomain.aBool10652 && (Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L < Class69.method1067(-1677266065) - 60000L))
			Class614.method7367(239906896);
		for (Class591_Sub1 class591_sub1 = (Class591_Sub1) aClass652_8864.method7697(1641354341); null != class591_sub1; class591_sub1 = (Class591_Sub1) aClass652_8864.method7698(701840826)) {
			if ((long) (((Class591_Sub1) class591_sub1).anInt9180 * -1160847613) < Class69.method1067(-1804966802) / 1000L - 5L) {
				if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
					Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 1811737703);
				if (((Class591_Sub1) class591_sub1).aShort9181 == 0)
					Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 1970421300);
				class591_sub1.method7002((byte) 120);
			}
		}
		if (835742603 * anInt8580 == 5 && !Class574.method6808(1138115610) || (11 == 835742603 * anInt8580 && 42 == -1586424751 * Class13.anInt106) || (15 == anInt8580 * 835742603 && (Class13.anInt105 * 655322057 == 49 || 52 == 655322057 * Class13.anInt105)) || 6 == 835742603 * anInt8580) {
			if (835742603 * anInt8580 != 11 && aClass195_8632.method2933(-1848825798) == null)
				Class439.method5276(false, (byte) 8);
			else if (null != aClass195_8632) {
				aClass195_8632.anInt2337 += 394568993;
				if (aClass195_8632.anInt2337 * -1242489119 > 50) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, aClass195_8632.aClass650_2340, 379472662);
					aClass195_8632.method2929(class572_sub25, (byte) -53);
				}
				try {
					aClass195_8632.method2936((byte) -53);
				} catch (IOException ioexception) {
					if (11 == anInt8580 * 835742603)
						aClass195_8632.method2943(-1904542489);
					else
						Class439.method5276(false, (byte) 8);
				}
			}
		}
	}

	static final void method8012() {
		if (-1784648141 * anInt8604 > 1) {
			anInt8604 -= -425706245;
			anInt8729 = 653930141 * anInt8839;
		}
		if (aClass195_8589.aBool2344) {
			aClass195_8589.aBool2344 = false;
			Class113.method2092(1666515827);
		} else {
			if (!Class25.aBool165)
				Class345.method4317((byte) -81);
			for (int i = 0; i < 100 && MaterialInformation.method1605(aClass195_8589, 225985968); i++) {
				/* empty */
			}
			if (1 == 835742603 * anInt8580) {
				while (Class344.method4315((byte) 91)) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3753, aClass195_8589.aClass650_2340, -1001779733);
					class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
					int i = (class572_sub25.aRsByteBuffer.o * -1585139053);
					Class190.method2889((class572_sub25.aRsByteBuffer), 48748209);
					class572_sub25.aRsByteBuffer.method8552((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i), 2135625451);
					aClass195_8589.method2929(class572_sub25, (byte) -2);
				}
				if (null != Class273.aClass461_2902) {
					if (633548015 * Class273.aClass461_2902.anInt5216 != -1) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.GC_PACKET, (aClass195_8589.aClass650_2340), -1422069511);
						if (Class65.aGarbageCollectorMXBean685 == null || !Class65.aGarbageCollectorMXBean685.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class65.aGarbageCollectorMXBean685 = garbagecollectormxbean;
										aLong8875 = -6094611317542751281L;
										aLong8737 = -5272074439168099041L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class69.method1067(-1700786397);
						int i = -1;
						if (null != Class65.aGarbageCollectorMXBean685) {
							long l_143_ = Class65.aGarbageCollectorMXBean685.getCollectionTime();
							if (aLong8737 * 7147685318279086369L != -1L) {
								long l_144_ = (l_143_ - 7147685318279086369L * aLong8737);
								long l_145_ = l - 2681765377846398161L * aLong8875;
								if (0L != l_145_)
									i = (int) (l_144_ * 100L / l_145_);
							}
							aLong8737 = 5272074439168099041L * l_143_;
							aLong8875 = 6094611317542751281L * l;
						}
						class572_sub25.aRsByteBuffer.writeByteC(i, (byte) 37);
						class572_sub25.aRsByteBuffer.writeByte128(-267830063 * anInt7734, 727212798);
						class572_sub25.aRsByteBuffer.writeShort128(633548015 * Class273.aClass461_2902.anInt5216, -16711936);
						aClass195_8589.method2929(class572_sub25, (byte) -19);
						Class273.aClass461_2902 = null;
						Class324.aLong4087 = (l + 30000L) * 5143952497543217671L;
					}
				} else if (Class69.method1067(-1770503052) >= -5049570460082517065L * Class324.aLong4087)
					Class273.aClass461_2902 = aClass455_8759.method5379((Class633.aClass641_8197.address), -417879318);
				Class563.method6649((byte) 1);
				Class382.method4650(-2045138220);
				Class572_Sub13 class572_sub13 = (Class572_Sub13) aClass675_8745.method7932((byte) 50);
				if (aClass613_8605.method7285(1737177031) != null) {
					if (5 == 625220759 * Class18.anInt143)
						Class444.method5331((byte) 24);
					else if (625220759 * Class18.anInt143 == 3)
						Class540.method6417((byte) -35);
				}
				if (aBool8681)
					aBool8681 = false;
				else
					aFloat8660 /= 2.0F;
				if (aBool8682)
					aBool8682 = false;
				else
					aFloat8679 /= 2.0F;
				if (IncomingPacket.method4113((byte) -61))
					Class572_Sub36.method8756(311611118);
				else if (Class18.anInt143 * 625220759 == 1) {
					Class497 class497 = aClass613_8605.method7280((byte) -12);
					int i = class497.localX * -2109597897 << 9;
					int i_146_ = class497.localY * 417324155 << 9;
					if (Class218.aLong2511 * -1389695526323027701L <= 0L)
						Class218.aLong2511 = (Class69.method1067(-2055952950) * 8241051270684000931L);
					float f = (float) (Class69.method1067(-1787564553) - (Class218.aLong2511 * -1389695526323027701L));
					int i_147_ = 1000 / Class425.method5176(1875693214);
					i_147_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_147_) {
						float f_148_ = Math.min(f, (float) i_147_);
						Class133_Sub1.aClass411_Sub1_9827.method5012(f_148_ / 1000.0F, (aClass613_8605.method7293(866531488).anIntArrayArrayArray3141), aClass613_8605.method7287((byte) 49), i, i_146_, (byte) -6);
					}
					Class218.aLong2511 = (Class69.method1067(-1872442677) * 8241051270684000931L);
				}
				Class298.method3974(1170363538);
				if (anInt8580 * 835742603 == 1) {
					aClass613_8605.method7306(-1042067865).method5978(aClass613_8605, 1402615934);
					Class624.method7451(-338518220);
					if (-599981499 * anInt8620 > 10)
						((Class195) aClass195_8589).anInt2335 += 707314625;
					if (((Class195) aClass195_8589).anInt2335 * 1070156865 > 2250)
						Class113.method2092(1538479848);
					else {
						if (1797623853 * anInt8646 == 0) {
							Class589.method6993((byte) 0);
							Class194.method2924((byte) -121);
						} else if (Class102_Sub2.aClass494_10268.anInterface57_5489.method320(class572_sub13, anInterface64Array8610, anInt8609 * 2134888631, Class108.aClass549_1426, -2109119429))
							Class133_Sub4.method9339(false, -711036386);
						else {
							if (2 == anInt8646 * 1797623853 && Class255.method3522(anInt8645 * 1545763299, 1615140874)) {
								aClass613_8605.method7348(new Class598(Class569.aClass569_6394, null), 202969597);
								anInt8646 = 432127727;
							}
							if (1797623853 * anInt8646 == 3 && 18 != anInt8580 * 835742603) {
								Class122.aClass676_1485.method7964((byte) 107);
								anInt8646 = 2007826068;
								anInt8648 = cycles * -1389120501;
								anInt8649 = 0;
								aBool8647 = false;
								Class198.method2976(951498446);
							}
							if (4 == 1797623853 * anInt8646) {
								int i = cycles - 2129803171 * anInt8648;
								if (-1287240229 * anInt8649 < Class122.aClass133Array1481.length) {
									do {
										Class133 class133 = (Class122.aClass133Array1481[anInt8649 * -1287240229]);
										if (class133.anInt1566 * -762660985 > i)
											break;
										class133.method2303(-423169751);
									} while (anInt8646 * 1797623853 == 4 && (((anInt8649 += 807284307) * -1287240229) < (Class122.aClass133Array1481).length));
								}
								if (4 == anInt8646 * 1797623853) {
									for (int i_149_ = 0; i_149_ < (Class122.aClass130Array1483).length; i_149_++) {
										Class130 class130 = (Class122.aClass130Array1483[i_149_]);
										if (class130.aBool1529) {
											Entity class456_sub1_sub2_sub3 = class130.method2268(-1318628245);
											Class461.method5469(class456_sub1_sub2_sub3, true, 268443694);
										}
									}
								}
							}
						}
						Class676.method7976(-2028710805);
						Class433.method5249(743682542);
						Class603.method7145(1255496961);
						Class71.method1084(false, (byte) 73);
						Class572_Sub16.method8567(Class272_Sub2.aClass106_9517, (Class456_Sub1_Sub3_Sub2.aClass94_11589), 1938248239);
						anInt8674 += 237624865;
						if (0 != 1251161273 * anInt8606) {
							anInt8803 += 1970875452;
							if (-311274581 * anInt8803 >= 400)
								anInt8606 = 0;
						}
						if (Class323.aClass73_4080 != null) {
							anInt8710 += -904830707;
							if (anInt8710 * 1766020549 >= 15) {
								Class555.method6575(Class323.aClass73_4080, (short) 11620);
								Class323.aClass73_4080 = null;
							}
						}
						aClass73_8603 = null;
						aBool8780 = false;
						aBool8775 = false;
						Class383.aClass73_4610 = null;
						Class296.method3964(null, -1, -1, -1914523608);
						if (!aBool8754)
							anInt8751 = 1983555971;
						Class514.method6093(94169685);
						anInt8839 += -1210150071;
						if (aBool8786) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3710, (aClass195_8589.aClass650_2340), -1353999567);
							class572_sub25.aRsByteBuffer.writeIntV2((Class612.anInt7988 * -36891819 << 28 | Class498.anInt5510 * 863160757 << 14 | Class665_Sub22.anInt9601 * -1817958735), (byte) 1);
							aClass195_8589.method2929(class572_sub25, (byte) -68);
							aBool8786 = false;
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8813.method7920(-1945803963));
							if (class572_sub20 == null)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (class73.activeComponent * -1665128073 >= 0) {
								InterfaceDefinitions class73_150_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -9408);
								if (null == class73_150_ || class73_150_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= (class73_150_.aClass73Array916).length) || ((class73_150_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -1990401330);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8884.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_151_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -2928);
								if (null == class73_151_ || null == class73_151_.aClass73Array916 || (class73.activeComponent * -1665128073 >= (class73_151_.aClass73Array916).length) || ((class73_151_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2018394594);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8812.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_152_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 9198);
								if (class73_152_ == null || class73_152_.aClass73Array916 == null || (-1665128073 * class73.activeComponent >= (class73_152_.aClass73Array916).length) || (class73 != (class73_152_.aClass73Array916[-1665128073 * class73.activeComponent])))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2127924592);
						}
						if (Class383.aClass73_4610 == null)
							anInt8844 = 0;
						if (aClass73_8770 != null)
							Class122.method2197(-1878563466);
						Class15.method654(-361404167);
						if (-1550439133 * rights > 0 && Class108.aClass549_1426.method6514(82, (byte) 1) && Class108.aClass549_1426.method6514(81, (byte) 1) && anInt8787 * -1840536699 != 0) {
							int i = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) - -1840536699 * anInt8787);
							if (i < 0)
								i = 0;
							else if (i > 3)
								i = 3;
							Class497 class497 = aClass613_8605.method7280((byte) -124);
							Class21.method703(i, (class497.localX * -2109597897 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0])), (417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])), -1329987131);
						}
						for (int i = 0; i < 5; i++)
							anIntArray8597[i]++;
						if (Class306.clientConfigsDomain.aBool10652 && ((Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L) < Class69.method1067(-1872194298) - 60000L))
							Class614.method7367(239906896);
						Class306.clientConfigsDomain.method9968((byte) 0);
						for (Class591_Sub1 class591_sub1 = ((Class591_Sub1) aClass652_8864.method7697(1195777213)); null != class591_sub1; class591_sub1 = ((Class591_Sub1) aClass652_8864.method7698(-1656897021))) {
							if ((long) (-1160847613 * (((Class591_Sub1) class591_sub1).anInt9180)) < (Class69.method1067(-1942946797) / 1000L - 5L)) {
								if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 2044874102);
								if (0 == (((Class591_Sub1) class591_sub1).aShort9181))
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 1994716219);
								class591_sub1.method7002((byte) 15);
							}
						}
						anInt8819 += 745021087;
						if (anInt8819 * -34112161 > 502) {
							anInt8819 = 0;
							int i = (int) (Math.random() * 8.0);
							if (1 == (i & 0x1))
								anInt8877 += -19134435 * anInt8662;
							if (2 == (i & 0x2))
								anInt8663 += anInt8664 * -1977461499;
							if ((i & 0x4) == 4)
								anInt8665 += -139987683 * anInt8666;
						}
						if (-1037352299 * anInt8877 < -55)
							anInt8662 = -87875006;
						if (anInt8877 * -1037352299 > 54)
							anInt8662 = 87875006;
						if (713494119 * anInt8663 < -55)
							anInt8664 = -2093052074;
						if (anInt8663 * 713494119 > 55)
							anInt8664 = 2093052074;
						if (-706438965 * anInt8665 < -42)
							anInt8666 = 1972333055;
						if (-706438965 * anInt8665 > 44)
							anInt8666 = -1972333055;
						anInt8672 += -1809977439;
						if (anInt8672 * -1605651359 > 505) {
							anInt8672 = 0;
							int i = (int) (Math.random() * 8.0);
							if ((i & 0x1) == 1)
								anInt8766 += 1104829617 * anInt8846;
							if (2 == (i & 0x2))
								anInt8670 += 151185977 * anInt8671;
						}
						if (anInt8766 * -777638353 < -61)
							anInt8846 = -410395906;
						if (anInt8766 * -777638353 > 65)
							anInt8846 = 410395906;
						if (anInt8670 * -1034566343 < -21)
							anInt8671 = 255419729;
						if (-1034566343 * anInt8670 > 12)
							anInt8671 = -255419729;
						aClass195_8589.anInt2337 += 394568993;
						if (aClass195_8589.anInt2337 * -1242489119 > 50) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, (aClass195_8589.aClass650_2340), 469976877);
							aClass195_8589.method2929(class572_sub25, (byte) -65);
						}
						if (aBool8573) {
							Class425.method5177((short) 8400);
							aBool8573 = false;
						}
						try {
							aClass195_8589.method2936((byte) 108);
						} catch (IOException ioexception) {
							Class113.method2092(2075673540);
						}
					}
				}
			}
		}
	}

	static final void method8013() {
		for (Class591_Sub4 class591_sub4 = (Class591_Sub4) aClass652_8703.method7696(-1986499651); class591_sub4 != null; class591_sub4 = (Class591_Sub4) aClass652_8703.method7696(-1986499651))
			Class313.method4062(class591_sub4, -2017693003);
		int i = 0;
		int i_153_ = 3;
		if (1797623853 * anInt8646 == 4) {
			for (int i_154_ = i; i_154_ <= i_153_; i_154_++)
				method8063(i_154_);
			method7990();
		} else {
			method8072();
			for (int i_155_ = i; i_155_ <= i_153_; i_155_++) {
				method8049();
				method7989(i_155_);
				method8063(i_155_);
			}
			method8021();
			method7990();
		}
	}

	static final void method8014() {
		if (-1784648141 * anInt8604 > 1) {
			anInt8604 -= -425706245;
			anInt8729 = 653930141 * anInt8839;
		}
		if (aClass195_8589.aBool2344) {
			aClass195_8589.aBool2344 = false;
			Class113.method2092(1456971914);
		} else {
			if (!Class25.aBool165)
				Class345.method4317((byte) -46);
			for (int i = 0; i < 100 && MaterialInformation.method1605(aClass195_8589, -826591117); i++) {
				/* empty */
			}
			if (1 == 835742603 * anInt8580) {
				while (Class344.method4315((byte) 87)) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3753, aClass195_8589.aClass650_2340, 146774588);
					class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
					int i = (class572_sub25.aRsByteBuffer.o * -1585139053);
					Class190.method2889((class572_sub25.aRsByteBuffer), 48748209);
					class572_sub25.aRsByteBuffer.method8552((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i), -166239515);
					aClass195_8589.method2929(class572_sub25, (byte) -51);
				}
				if (null != Class273.aClass461_2902) {
					if (633548015 * Class273.aClass461_2902.anInt5216 != -1) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.GC_PACKET, (aClass195_8589.aClass650_2340), -1655765746);
						if (Class65.aGarbageCollectorMXBean685 == null || !Class65.aGarbageCollectorMXBean685.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class65.aGarbageCollectorMXBean685 = garbagecollectormxbean;
										aLong8875 = -6094611317542751281L;
										aLong8737 = -5272074439168099041L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class69.method1067(-1843353994);
						int i = -1;
						if (null != Class65.aGarbageCollectorMXBean685) {
							long l_156_ = Class65.aGarbageCollectorMXBean685.getCollectionTime();
							if (aLong8737 * 7147685318279086369L != -1L) {
								long l_157_ = (l_156_ - 7147685318279086369L * aLong8737);
								long l_158_ = l - 2681765377846398161L * aLong8875;
								if (0L != l_158_)
									i = (int) (l_157_ * 100L / l_158_);
							}
							aLong8737 = 5272074439168099041L * l_156_;
							aLong8875 = 6094611317542751281L * l;
						}
						class572_sub25.aRsByteBuffer.writeByteC(i, (byte) 78);
						class572_sub25.aRsByteBuffer.writeByte128(-267830063 * anInt7734, -1836255722);
						class572_sub25.aRsByteBuffer.writeShort128(633548015 * Class273.aClass461_2902.anInt5216, -16711936);
						aClass195_8589.method2929(class572_sub25, (byte) -94);
						Class273.aClass461_2902 = null;
						Class324.aLong4087 = (l + 30000L) * 5143952497543217671L;
					}
				} else if (Class69.method1067(-1809791201) >= -5049570460082517065L * Class324.aLong4087)
					Class273.aClass461_2902 = aClass455_8759.method5379((Class633.aClass641_8197.address), -1719478561);
				Class563.method6649((byte) 1);
				Class382.method4650(-1939648756);
				Class572_Sub13 class572_sub13 = (Class572_Sub13) aClass675_8745.method7932((byte) 50);
				if (aClass613_8605.method7285(1978575284) != null) {
					if (5 == 625220759 * Class18.anInt143)
						Class444.method5331((byte) 69);
					else if (625220759 * Class18.anInt143 == 3)
						Class540.method6417((byte) -92);
				}
				if (aBool8681)
					aBool8681 = false;
				else
					aFloat8660 /= 2.0F;
				if (aBool8682)
					aBool8682 = false;
				else
					aFloat8679 /= 2.0F;
				if (IncomingPacket.method4113((byte) -65))
					Class572_Sub36.method8756(842323486);
				else if (Class18.anInt143 * 625220759 == 1) {
					Class497 class497 = aClass613_8605.method7280((byte) -60);
					int i = class497.localX * -2109597897 << 9;
					int i_159_ = class497.localY * 417324155 << 9;
					if (Class218.aLong2511 * -1389695526323027701L <= 0L)
						Class218.aLong2511 = (Class69.method1067(-1827141501) * 8241051270684000931L);
					float f = (float) (Class69.method1067(-2145807957) - (Class218.aLong2511 * -1389695526323027701L));
					int i_160_ = 1000 / Class425.method5176(901472260);
					i_160_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_160_) {
						float f_161_ = Math.min(f, (float) i_160_);
						Class133_Sub1.aClass411_Sub1_9827.method5012(f_161_ / 1000.0F, (aClass613_8605.method7293(-307100158).anIntArrayArrayArray3141), aClass613_8605.method7287((byte) -66), i, i_159_, (byte) -20);
					}
					Class218.aLong2511 = (Class69.method1067(-1953753837) * 8241051270684000931L);
				}
				Class298.method3974(-1958881997);
				if (anInt8580 * 835742603 == 1) {
					aClass613_8605.method7306(-1042067865).method5978(aClass613_8605, 1699282524);
					Class624.method7451(-1556648228);
					if (-599981499 * anInt8620 > 10)
						((Class195) aClass195_8589).anInt2335 += 707314625;
					if (((Class195) aClass195_8589).anInt2335 * 1070156865 > 2250)
						Class113.method2092(1590798499);
					else {
						if (1797623853 * anInt8646 == 0) {
							Class589.method6993((byte) 0);
							Class194.method2924((byte) -111);
						} else if (Class102_Sub2.aClass494_10268.anInterface57_5489.method320(class572_sub13, anInterface64Array8610, anInt8609 * 2134888631, Class108.aClass549_1426, -1242710529))
							Class133_Sub4.method9339(false, 766132032);
						else {
							if (2 == anInt8646 * 1797623853 && Class255.method3522(anInt8645 * 1545763299, 1615140874)) {
								aClass613_8605.method7348(new Class598(Class569.aClass569_6394, null), 375343812);
								anInt8646 = 432127727;
							}
							if (1797623853 * anInt8646 == 3 && 18 != anInt8580 * 835742603) {
								Class122.aClass676_1485.method7964((byte) 1);
								anInt8646 = 2007826068;
								anInt8648 = cycles * -1389120501;
								anInt8649 = 0;
								aBool8647 = false;
								Class198.method2976(1488107838);
							}
							if (4 == 1797623853 * anInt8646) {
								int i = cycles - 2129803171 * anInt8648;
								if (-1287240229 * anInt8649 < Class122.aClass133Array1481.length) {
									do {
										Class133 class133 = (Class122.aClass133Array1481[anInt8649 * -1287240229]);
										if (class133.anInt1566 * -762660985 > i)
											break;
										class133.method2303(357787204);
									} while (anInt8646 * 1797623853 == 4 && (((anInt8649 += 807284307) * -1287240229) < (Class122.aClass133Array1481).length));
								}
								if (4 == anInt8646 * 1797623853) {
									for (int i_162_ = 0; i_162_ < (Class122.aClass130Array1483).length; i_162_++) {
										Class130 class130 = (Class122.aClass130Array1483[i_162_]);
										if (class130.aBool1529) {
											Entity class456_sub1_sub2_sub3 = class130.method2268(-918590535);
											Class461.method5469(class456_sub1_sub2_sub3, true, 796245376);
										}
									}
								}
							}
						}
						Class676.method7976(-559058939);
						Class433.method5249(743682542);
						Class603.method7145(247757046);
						Class71.method1084(false, (byte) -68);
						Class572_Sub16.method8567(Class272_Sub2.aClass106_9517, (Class456_Sub1_Sub3_Sub2.aClass94_11589), 1880804231);
						anInt8674 += 237624865;
						if (0 != 1251161273 * anInt8606) {
							anInt8803 += 1970875452;
							if (-311274581 * anInt8803 >= 400)
								anInt8606 = 0;
						}
						if (Class323.aClass73_4080 != null) {
							anInt8710 += -904830707;
							if (anInt8710 * 1766020549 >= 15) {
								Class555.method6575(Class323.aClass73_4080, (short) 26966);
								Class323.aClass73_4080 = null;
							}
						}
						aClass73_8603 = null;
						aBool8780 = false;
						aBool8775 = false;
						Class383.aClass73_4610 = null;
						Class296.method3964(null, -1, -1, -876796536);
						if (!aBool8754)
							anInt8751 = 1983555971;
						Class514.method6093(1898881619);
						anInt8839 += -1210150071;
						if (aBool8786) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3710, (aClass195_8589.aClass650_2340), -1233560318);
							class572_sub25.aRsByteBuffer.writeIntV2((Class612.anInt7988 * -36891819 << 28 | Class498.anInt5510 * 863160757 << 14 | Class665_Sub22.anInt9601 * -1817958735), (byte) 1);
							aClass195_8589.method2929(class572_sub25, (byte) -7);
							aBool8786 = false;
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8813.method7920(-1945803963));
							if (class572_sub20 == null)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (class73.activeComponent * -1665128073 >= 0) {
								InterfaceDefinitions class73_163_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -2954);
								if (null == class73_163_ || class73_163_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= (class73_163_.aClass73Array916).length) || ((class73_163_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2037405977);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8884.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_164_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 17477);
								if (null == class73_164_ || null == class73_164_.aClass73Array916 || (class73.activeComponent * -1665128073 >= (class73_164_.aClass73Array916).length) || ((class73_164_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2081842096);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8812.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_165_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 9633);
								if (class73_165_ == null || class73_165_.aClass73Array916 == null || (-1665128073 * class73.activeComponent >= (class73_165_.aClass73Array916).length) || (class73 != (class73_165_.aClass73Array916[-1665128073 * class73.activeComponent])))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2143753794);
						}
						if (Class383.aClass73_4610 == null)
							anInt8844 = 0;
						if (aClass73_8770 != null)
							Class122.method2197(-1980964769);
						Class15.method654(96077874);
						if (-1550439133 * rights > 0 && Class108.aClass549_1426.method6514(82, (byte) 1) && Class108.aClass549_1426.method6514(81, (byte) 1) && anInt8787 * -1840536699 != 0) {
							int i = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) - -1840536699 * anInt8787);
							if (i < 0)
								i = 0;
							else if (i > 3)
								i = 3;
							Class497 class497 = aClass613_8605.method7280((byte) -51);
							Class21.method703(i, (class497.localX * -2109597897 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0])), (417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])), -1459056673);
						}
						for (int i = 0; i < 5; i++)
							anIntArray8597[i]++;
						if (Class306.clientConfigsDomain.aBool10652 && ((Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L) < Class69.method1067(-1782505122) - 60000L))
							Class614.method7367(239906896);
						Class306.clientConfigsDomain.method9968((byte) 0);
						for (Class591_Sub1 class591_sub1 = ((Class591_Sub1) aClass652_8864.method7697(-957144311)); null != class591_sub1; class591_sub1 = ((Class591_Sub1) aClass652_8864.method7698(-2104157121))) {
							if ((long) (-1160847613 * (((Class591_Sub1) class591_sub1).anInt9180)) < (Class69.method1067(-1646533727) / 1000L - 5L)) {
								if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 2039141191);
								if (0 == (((Class591_Sub1) class591_sub1).aShort9181))
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 2027065046);
								class591_sub1.method7002((byte) 16);
							}
						}
						anInt8819 += 745021087;
						if (anInt8819 * -34112161 > 502) {
							anInt8819 = 0;
							int i = (int) (Math.random() * 8.0);
							if (1 == (i & 0x1))
								anInt8877 += -19134435 * anInt8662;
							if (2 == (i & 0x2))
								anInt8663 += anInt8664 * -1977461499;
							if ((i & 0x4) == 4)
								anInt8665 += -139987683 * anInt8666;
						}
						if (-1037352299 * anInt8877 < -55)
							anInt8662 = -87875006;
						if (anInt8877 * -1037352299 > 54)
							anInt8662 = 87875006;
						if (713494119 * anInt8663 < -55)
							anInt8664 = -2093052074;
						if (anInt8663 * 713494119 > 55)
							anInt8664 = 2093052074;
						if (-706438965 * anInt8665 < -42)
							anInt8666 = 1972333055;
						if (-706438965 * anInt8665 > 44)
							anInt8666 = -1972333055;
						anInt8672 += -1809977439;
						if (anInt8672 * -1605651359 > 505) {
							anInt8672 = 0;
							int i = (int) (Math.random() * 8.0);
							if ((i & 0x1) == 1)
								anInt8766 += 1104829617 * anInt8846;
							if (2 == (i & 0x2))
								anInt8670 += 151185977 * anInt8671;
						}
						if (anInt8766 * -777638353 < -61)
							anInt8846 = -410395906;
						if (anInt8766 * -777638353 > 65)
							anInt8846 = 410395906;
						if (anInt8670 * -1034566343 < -21)
							anInt8671 = 255419729;
						if (-1034566343 * anInt8670 > 12)
							anInt8671 = -255419729;
						aClass195_8589.anInt2337 += 394568993;
						if (aClass195_8589.anInt2337 * -1242489119 > 50) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, (aClass195_8589.aClass650_2340), -1024615186);
							aClass195_8589.method2929(class572_sub25, (byte) -43);
						}
						if (aBool8573) {
							Class425.method5177((short) 27054);
							aBool8573 = false;
						}
						try {
							aClass195_8589.method2936((byte) -19);
						} catch (IOException ioexception) {
							Class113.method2092(1630932140);
						}
					}
				}
			}
		}
	}

	static final void method8015() {
		for (int i = Class133_Sub23.playerVarsProvider.domain.method6073(true, (byte) -102); i != -1; i = Class133_Sub23.playerVarsProvider.domain.method6073(false, (byte) -21)) {
			Class518.method6146(i, (byte) 21);
			anIntArray8830[(anInt8791 += -742246703) * -1505762767 - 1 & 0x3f] = i;
		}
		for (GameTask class572_sub12_sub11 = Class3.method483((byte) 112); class572_sub12_sub11 != null; class572_sub12_sub11 = Class3.method483((byte) 112)) {
			int i = class572_sub12_sub11.method10339((byte) 71);
			long l = class572_sub12_sub11.method10340(1054137524);
			if (i == 1) {
				VarDefinition class179 = (VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, 1723539756);
				Class306.clientConfigsDomain.method76(class179, ((((GameTask) class572_sub12_sub11).p1) * 471797111), (short) 255);
				anIntArray8796[((anInt8797 += -579284019) * -668970747 - 1 & 0x3f)] = (int) l;
			} else if (2 == i) {
				VarDefinition class179 = (VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, 1973187416);
				Class306.clientConfigsDomain.method80(class179, (((GameTask) class572_sub12_sub11).aString11408), -30259456);
				anIntArray8798[((anInt8799 += -856563507) * 665914373 - 1 & 0x3f)] = (int) l;
			} else if (3 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 1620);
				if (!((GameTask) class572_sub12_sub11).aString11408.equals(class73.aString829)) {
					class73.aString829 = (((GameTask) class572_sub12_sub11).aString11408);
					Class555.method6575(class73, (short) 25624);
				}
			} else if (23 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 5883);
				if ((1 == 471797111 * ((GameTask) class572_sub12_sub11).p1) != class73.aBool835) {
					class73.aBool835 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
					Class555.method6575(class73, (short) 31802);
				}
			} else if (4 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -27614);
				int i_166_ = (((GameTask) class572_sub12_sub11).p1 * 471797111);
				int i_167_ = (((GameTask) class572_sub12_sub11).p2 * 405359321);
				int i_168_ = (-1781219319 * (((GameTask) class572_sub12_sub11).p3));
				if (-22820201 * class73.anInt892 != i_166_ || i_167_ != class73.anInt803 * -1063203465 || 1779236057 * class73.anInt794 != i_168_) {
					class73.anInt892 = i_166_ * -2072488665;
					class73.anInt803 = 771890247 * i_167_;
					class73.anInt794 = 2093728617 * i_168_;
					class73.aClass399_908 = null;
					Class555.method6575(class73, (short) 18705);
				}
			} else if (5 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 23703);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != class73.anInt926 * -1286545333) {
					if (471797111 * ((GameTask) class572_sub12_sub11).p1 != -1) {
						if (null == class73.aClass663_915)
							class73.aClass663_915 = new Class663_Sub1();
						class73.aClass663_915.method7801(471797111 * ((GameTask) class572_sub12_sub11).p1, 751680147);
					} else
						class73.aClass663_915 = null;
					class73.anInt926 = (((GameTask) class572_sub12_sub11).p1) * 825000965;
					Class555.method6575(class73, (short) 26144);
				}
			} else if (i == 6) {
				int i_169_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				int i_170_ = i_169_ >> 10 & 0x1f;
				int i_171_ = i_169_ >> 5 & 0x1f;
				int i_172_ = i_169_ & 0x1f;
				int i_173_ = (i_170_ << 19) + (i_171_ << 11) + (i_172_ << 3);
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -12144);
				if (class73.anInt918 * -1311491911 != i_173_) {
					class73.anInt918 = 2018397577 * i_173_;
					Class555.method6575(class73, (short) 9670);
				}
			} else if (i == 7) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 17779);
				boolean bool = (471797111 * ((GameTask) class572_sub12_sub11).p1 == 1);
				if (class73.aBool769 != bool) {
					class73.aBool769 = bool;
					Class555.method6575(class73, (short) 18876);
				}
			} else if (i == 8) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 14988);
				if (471797111 * (((GameTask) class572_sub12_sub11).p1) != class73.anInt798 * -579902323 || ((((GameTask) class572_sub12_sub11).p2) * 405359321 != 969995095 * class73.anInt799) || (-1781219319 * ((GameTask) class572_sub12_sub11).p3 != -1393929271 * class73.anInt804)) {
					class73.anInt798 = 985445139 * ((GameTask) class572_sub12_sub11).p1;
					class73.anInt799 = (((GameTask) class572_sub12_sub11).p2) * 143557967;
					class73.anInt804 = (((GameTask) class572_sub12_sub11).p3) * 1646438977;
					if (class73.nvmtheindexisotherone * 411192987 != -1) {
						if (-96689919 * class73.anInt805 > 0)
							class73.anInt804 = (-1656063712 * class73.anInt804 / (-96689919 * class73.anInt805) * -1342032263);
						else if (class73.anInt760 * 1473094557 > 0)
							class73.anInt804 = -1342032263 * (-1656063712 * class73.anInt804 / (1473094557 * class73.anInt760));
					}
					Class555.method6575(class73, (short) 2557);
				}
			} else if (9 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 4458);
				if ((411192987 * class73.nvmtheindexisotherone != (((GameTask) class572_sub12_sub11).p1) * 471797111) || (-830487355 * class73.anInt903 != 405359321 * ((GameTask) class572_sub12_sub11).p2)) {
					class73.nvmtheindexisotherone = (((GameTask) class572_sub12_sub11).p1) * 1541807189;
					class73.anInt903 = (((GameTask) class572_sub12_sub11).p2) * 2086000389;
					Class555.method6575(class73, (short) 28467);
				}
			} else if (i == 10) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -3119);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != 1483996493 * class73.anInt860 || (405359321 * ((GameTask) class572_sub12_sub11).p2 != -1688915011 * class73.anInt797) || (1450945799 * class73.anInt800 != (((GameTask) class572_sub12_sub11).p3) * -1781219319)) {
					class73.anInt860 = (((GameTask) class572_sub12_sub11).p1) * -107813933;
					class73.anInt797 = 1010423629 * ((GameTask) class572_sub12_sub11).p2;
					class73.anInt800 = (((GameTask) class572_sub12_sub11).p3) * 1183905391;
					Class555.method6575(class73, (short) 23385);
				}
			} else if (11 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 7709);
				class73.aByte811 = (byte) 0;
				class73.anInt762 = (class73.anInt819 = 316319613 * (((GameTask) class572_sub12_sub11).p1)) * -486052645;
				class73.aByte755 = (byte) 0;
				class73.anInt842 = (class73.anInt793 = (((GameTask) class572_sub12_sub11).p2) * -44794633) * -1776972733;
				Class555.method6575(class73, (short) 21898);
			} else if (i == 12) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -25124);
				int i_174_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				if (null != class73 && 0 == class73.anInt752 * -1285279191) {
					if (i_174_ > (382019713 * class73.anInt902 - class73.anInt765 * 1360982075))
						i_174_ = (class73.anInt902 * 382019713 - 1360982075 * class73.anInt765);
					if (i_174_ < 0)
						i_174_ = 0;
					if (i_174_ != class73.anInt775 * -2139739529) {
						class73.anInt775 = -650326201 * i_174_;
						Class555.method6575(class73, (short) 17181);
					}
				}
			} else if (13 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -9695);
				class73.anInt783 = (((GameTask) class572_sub12_sub11).p1 * -599008635);
			} else if (i == 14) {
				Class192.aBool2307 = true;
				Class192.anInt2310 = -1469552025 * ((GameTask) class572_sub12_sub11).p1;
				Class192.anInt2300 = 484040841 * ((GameTask) class572_sub12_sub11).p2;
			} else if (15 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -7310);
				class73.anInt906 = -257415021 * ((GameTask) class572_sub12_sub11).p1;
			} else if (i == 21) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -617);
				class73.aBool725 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
			} else if (22 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 9536);
				class73.aBool896 = 1 == (((GameTask) class572_sub12_sub11).p1) * 471797111;
			} else if (i == 17) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -11689);
				int i_175_ = (int) (l >> 32);
				class73.method1105(i_175_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (((GameTask) class572_sub12_sub11).p2 * 405359321), 33984);
			} else if (20 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 6593);
				int i_176_ = (int) (l >> 32);
				class73.method1106(i_176_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (405359321 * (((GameTask) class572_sub12_sub11).p2)), (byte) 61);
			}
		}
	}

	static final void method8016() {
		for (int i = Class133_Sub23.playerVarsProvider.domain.method6073(true, (byte) 1); i != -1; i = Class133_Sub23.playerVarsProvider.domain.method6073(false, (byte) -74)) {
			Class518.method6146(i, (byte) 21);
			anIntArray8830[(anInt8791 += -742246703) * -1505762767 - 1 & 0x3f] = i;
		}
		for (GameTask class572_sub12_sub11 = Class3.method483((byte) 100); class572_sub12_sub11 != null; class572_sub12_sub11 = Class3.method483((byte) 113)) {
			int i = class572_sub12_sub11.method10339((byte) 95);
			long l = class572_sub12_sub11.method10340(1054137524);
			if (i == 1) {
				VarDefinition class179 = ((VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, 342310918));
				Class306.clientConfigsDomain.method76(class179, ((((GameTask) class572_sub12_sub11).p1) * 471797111), (short) 255);
				anIntArray8796[((anInt8797 += -579284019) * -668970747 - 1 & 0x3f)] = (int) l;
			} else if (2 == i) {
				VarDefinition class179 = (VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, -1979827029);
				Class306.clientConfigsDomain.method80(class179, (((GameTask) class572_sub12_sub11).aString11408), -30259456);
				anIntArray8798[((anInt8799 += -856563507) * 665914373 - 1 & 0x3f)] = (int) l;
			} else if (3 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 23638);
				if (!((GameTask) class572_sub12_sub11).aString11408.equals(class73.aString829)) {
					class73.aString829 = (((GameTask) class572_sub12_sub11).aString11408);
					Class555.method6575(class73, (short) 24538);
				}
			} else if (23 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -13055);
				if ((1 == 471797111 * ((GameTask) class572_sub12_sub11).p1) != class73.aBool835) {
					class73.aBool835 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
					Class555.method6575(class73, (short) 13105);
				}
			} else if (4 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -22687);
				int i_177_ = (((GameTask) class572_sub12_sub11).p1 * 471797111);
				int i_178_ = (((GameTask) class572_sub12_sub11).p2 * 405359321);
				int i_179_ = (-1781219319 * (((GameTask) class572_sub12_sub11).p3));
				if (-22820201 * class73.anInt892 != i_177_ || i_178_ != class73.anInt803 * -1063203465 || 1779236057 * class73.anInt794 != i_179_) {
					class73.anInt892 = i_177_ * -2072488665;
					class73.anInt803 = 771890247 * i_178_;
					class73.anInt794 = 2093728617 * i_179_;
					class73.aClass399_908 = null;
					Class555.method6575(class73, (short) 24704);
				}
			} else if (5 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -7003);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != class73.anInt926 * -1286545333) {
					if (471797111 * ((GameTask) class572_sub12_sub11).p1 != -1) {
						if (null == class73.aClass663_915)
							class73.aClass663_915 = new Class663_Sub1();
						class73.aClass663_915.method7801(471797111 * ((GameTask) class572_sub12_sub11).p1, 751680147);
					} else
						class73.aClass663_915 = null;
					class73.anInt926 = (((GameTask) class572_sub12_sub11).p1) * 825000965;
					Class555.method6575(class73, (short) 24005);
				}
			} else if (i == 6) {
				int i_180_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				int i_181_ = i_180_ >> 10 & 0x1f;
				int i_182_ = i_180_ >> 5 & 0x1f;
				int i_183_ = i_180_ & 0x1f;
				int i_184_ = (i_181_ << 19) + (i_182_ << 11) + (i_183_ << 3);
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -24427);
				if (class73.anInt918 * -1311491911 != i_184_) {
					class73.anInt918 = 2018397577 * i_184_;
					Class555.method6575(class73, (short) 30889);
				}
			} else if (i == 7) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 2264);
				boolean bool = (471797111 * ((GameTask) class572_sub12_sub11).p1 == 1);
				if (class73.aBool769 != bool) {
					class73.aBool769 = bool;
					Class555.method6575(class73, (short) 14358);
				}
			} else if (i == 8) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 1021);
				if (471797111 * (((GameTask) class572_sub12_sub11).p1) != class73.anInt798 * -579902323 || ((((GameTask) class572_sub12_sub11).p2) * 405359321 != 969995095 * class73.anInt799) || (-1781219319 * ((GameTask) class572_sub12_sub11).p3 != -1393929271 * class73.anInt804)) {
					class73.anInt798 = 985445139 * ((GameTask) class572_sub12_sub11).p1;
					class73.anInt799 = (((GameTask) class572_sub12_sub11).p2) * 143557967;
					class73.anInt804 = (((GameTask) class572_sub12_sub11).p3) * 1646438977;
					if (class73.nvmtheindexisotherone * 411192987 != -1) {
						if (-96689919 * class73.anInt805 > 0)
							class73.anInt804 = (-1656063712 * class73.anInt804 / (-96689919 * class73.anInt805) * -1342032263);
						else if (class73.anInt760 * 1473094557 > 0)
							class73.anInt804 = -1342032263 * (-1656063712 * class73.anInt804 / (1473094557 * class73.anInt760));
					}
					Class555.method6575(class73, (short) 23839);
				}
			} else if (9 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 3356);
				if ((411192987 * class73.nvmtheindexisotherone != (((GameTask) class572_sub12_sub11).p1) * 471797111) || (-830487355 * class73.anInt903 != 405359321 * ((GameTask) class572_sub12_sub11).p2)) {
					class73.nvmtheindexisotherone = (((GameTask) class572_sub12_sub11).p1) * 1541807189;
					class73.anInt903 = (((GameTask) class572_sub12_sub11).p2) * 2086000389;
					Class555.method6575(class73, (short) 22914);
				}
			} else if (i == 10) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 26337);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != 1483996493 * class73.anInt860 || (405359321 * ((GameTask) class572_sub12_sub11).p2 != -1688915011 * class73.anInt797) || (1450945799 * class73.anInt800 != (((GameTask) class572_sub12_sub11).p3) * -1781219319)) {
					class73.anInt860 = (((GameTask) class572_sub12_sub11).p1) * -107813933;
					class73.anInt797 = 1010423629 * ((GameTask) class572_sub12_sub11).p2;
					class73.anInt800 = (((GameTask) class572_sub12_sub11).p3) * 1183905391;
					Class555.method6575(class73, (short) 8313);
				}
			} else if (11 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -19445);
				class73.aByte811 = (byte) 0;
				class73.anInt762 = (class73.anInt819 = 316319613 * (((GameTask) class572_sub12_sub11).p1)) * -486052645;
				class73.aByte755 = (byte) 0;
				class73.anInt842 = (class73.anInt793 = (((GameTask) class572_sub12_sub11).p2) * -44794633) * -1776972733;
				Class555.method6575(class73, (short) 28541);
			} else if (i == 12) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -17851);
				int i_185_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				if (null != class73 && 0 == class73.anInt752 * -1285279191) {
					if (i_185_ > (382019713 * class73.anInt902 - class73.anInt765 * 1360982075))
						i_185_ = (class73.anInt902 * 382019713 - 1360982075 * class73.anInt765);
					if (i_185_ < 0)
						i_185_ = 0;
					if (i_185_ != class73.anInt775 * -2139739529) {
						class73.anInt775 = -650326201 * i_185_;
						Class555.method6575(class73, (short) 11271);
					}
				}
			} else if (13 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 2452);
				class73.anInt783 = (((GameTask) class572_sub12_sub11).p1 * -599008635);
			} else if (i == 14) {
				Class192.aBool2307 = true;
				Class192.anInt2310 = -1469552025 * ((GameTask) class572_sub12_sub11).p1;
				Class192.anInt2300 = 484040841 * ((GameTask) class572_sub12_sub11).p2;
			} else if (15 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -15131);
				class73.anInt906 = -257415021 * ((GameTask) class572_sub12_sub11).p1;
			} else if (i == 21) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 14271);
				class73.aBool725 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
			} else if (22 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 7066);
				class73.aBool896 = 1 == (((GameTask) class572_sub12_sub11).p1) * 471797111;
			} else if (i == 17) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -7140);
				int i_186_ = (int) (l >> 32);
				class73.method1105(i_186_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (((GameTask) class572_sub12_sub11).p2 * 405359321), 33984);
			} else if (20 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 10808);
				int i_187_ = (int) (l >> 32);
				class73.method1106(i_187_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (405359321 * (((GameTask) class572_sub12_sub11).p2)), (byte) 62);
			}
		}
	}

	static final void method8017() {
		for (int i = Class133_Sub23.playerVarsProvider.domain.method6073(true, (byte) -94); i != -1; i = Class133_Sub23.playerVarsProvider.domain.method6073(false, (byte) 23)) {
			Class518.method6146(i, (byte) 21);
			anIntArray8830[(anInt8791 += -742246703) * -1505762767 - 1 & 0x3f] = i;
		}
		for (GameTask class572_sub12_sub11 = Class3.method483((byte) 87); class572_sub12_sub11 != null; class572_sub12_sub11 = Class3.method483((byte) 126)) {
			int i = class572_sub12_sub11.method10339((byte) 116);
			long l = class572_sub12_sub11.method10340(1054137524);
			if (i == 1) { //csvar
				VarDefinition class179 = (VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, 1154754400);
				Class306.clientConfigsDomain.method76(class179, ((((GameTask) class572_sub12_sub11).p1) * 471797111), (short) 255);
				anIntArray8796[((anInt8797 += -579284019) * -668970747 - 1 & 0x3f)] = (int) l;
			} else if (2 == i) {
				VarDefinition class179 = (VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, 1915463612);
				Class306.clientConfigsDomain.method80(class179, (((GameTask) class572_sub12_sub11).aString11408), -30259456);
				anIntArray8798[((anInt8799 += -856563507) * 665914373 - 1 & 0x3f)] = (int) l;
			} else if (3 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 6427);
				if (!((GameTask) class572_sub12_sub11).aString11408.equals(class73.aString829)) {
					class73.aString829 = (((GameTask) class572_sub12_sub11).aString11408);
					Class555.method6575(class73, (short) 29472);
				}
			} else if (23 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -24718);
				if ((1 == 471797111 * ((GameTask) class572_sub12_sub11).p1) != class73.aBool835) {
					class73.aBool835 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
					Class555.method6575(class73, (short) 18650);
				}
			} else if (4 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 5770);
				int i_188_ = (((GameTask) class572_sub12_sub11).p1 * 471797111);
				int i_189_ = (((GameTask) class572_sub12_sub11).p2 * 405359321);
				int i_190_ = (-1781219319 * (((GameTask) class572_sub12_sub11).p3));
				if (-22820201 * class73.anInt892 != i_188_ || i_189_ != class73.anInt803 * -1063203465 || 1779236057 * class73.anInt794 != i_190_) {
					class73.anInt892 = i_188_ * -2072488665;
					class73.anInt803 = 771890247 * i_189_;
					class73.anInt794 = 2093728617 * i_190_;
					class73.aClass399_908 = null;
					Class555.method6575(class73, (short) 7785);
				}
			} else if (5 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -15100);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != class73.anInt926 * -1286545333) {
					if (471797111 * ((GameTask) class572_sub12_sub11).p1 != -1) {
						if (null == class73.aClass663_915)
							class73.aClass663_915 = new Class663_Sub1();
						class73.aClass663_915.method7801(471797111 * ((GameTask) class572_sub12_sub11).p1, 751680147);
					} else
						class73.aClass663_915 = null;
					class73.anInt926 = (((GameTask) class572_sub12_sub11).p1) * 825000965;
					Class555.method6575(class73, (short) 7862);
				}
			} else if (i == 6) {
				int i_191_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				int i_192_ = i_191_ >> 10 & 0x1f;
				int i_193_ = i_191_ >> 5 & 0x1f;
				int i_194_ = i_191_ & 0x1f;
				int i_195_ = (i_192_ << 19) + (i_193_ << 11) + (i_194_ << 3);
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -13904);
				if (class73.anInt918 * -1311491911 != i_195_) {
					class73.anInt918 = 2018397577 * i_195_;
					Class555.method6575(class73, (short) 25541);
				}
			} else if (i == 7) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -13652);
				boolean bool = (471797111 * ((GameTask) class572_sub12_sub11).p1 == 1);
				if (class73.aBool769 != bool) {
					class73.aBool769 = bool;
					Class555.method6575(class73, (short) 19779);
				}
			} else if (i == 8) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -10342);
				if (471797111 * (((GameTask) class572_sub12_sub11).p1) != class73.anInt798 * -579902323 || ((((GameTask) class572_sub12_sub11).p2) * 405359321 != 969995095 * class73.anInt799) || (-1781219319 * ((GameTask) class572_sub12_sub11).p3 != -1393929271 * class73.anInt804)) {
					class73.anInt798 = 985445139 * ((GameTask) class572_sub12_sub11).p1;
					class73.anInt799 = (((GameTask) class572_sub12_sub11).p2) * 143557967;
					class73.anInt804 = (((GameTask) class572_sub12_sub11).p3) * 1646438977;
					if (class73.nvmtheindexisotherone * 411192987 != -1) {
						if (-96689919 * class73.anInt805 > 0)
							class73.anInt804 = (-1656063712 * class73.anInt804 / (-96689919 * class73.anInt805) * -1342032263);
						else if (class73.anInt760 * 1473094557 > 0)
							class73.anInt804 = -1342032263 * (-1656063712 * class73.anInt804 / (1473094557 * class73.anInt760));
					}
					Class555.method6575(class73, (short) 18771);
				}
			} else if (9 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -20396);
				if ((411192987 * class73.nvmtheindexisotherone != (((GameTask) class572_sub12_sub11).p1) * 471797111) || (-830487355 * class73.anInt903 != 405359321 * ((GameTask) class572_sub12_sub11).p2)) {
					class73.nvmtheindexisotherone = (((GameTask) class572_sub12_sub11).p1) * 1541807189;
					class73.anInt903 = (((GameTask) class572_sub12_sub11).p2) * 2086000389;
					Class555.method6575(class73, (short) 963);
				}
			} else if (i == 10) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 23994);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != 1483996493 * class73.anInt860 || (405359321 * ((GameTask) class572_sub12_sub11).p2 != -1688915011 * class73.anInt797) || (1450945799 * class73.anInt800 != (((GameTask) class572_sub12_sub11).p3) * -1781219319)) {
					class73.anInt860 = (((GameTask) class572_sub12_sub11).p1) * -107813933;
					class73.anInt797 = 1010423629 * ((GameTask) class572_sub12_sub11).p2;
					class73.anInt800 = (((GameTask) class572_sub12_sub11).p3) * 1183905391;
					Class555.method6575(class73, (short) 31408);
				}
			} else if (11 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -17831);
				class73.aByte811 = (byte) 0;
				class73.anInt762 = (class73.anInt819 = 316319613 * (((GameTask) class572_sub12_sub11).p1)) * -486052645;
				class73.aByte755 = (byte) 0;
				class73.anInt842 = (class73.anInt793 = (((GameTask) class572_sub12_sub11).p2) * -44794633) * -1776972733;
				Class555.method6575(class73, (short) 285);
			} else if (i == 12) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 11498);
				int i_196_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				if (null != class73 && 0 == class73.anInt752 * -1285279191) {
					if (i_196_ > (382019713 * class73.anInt902 - class73.anInt765 * 1360982075))
						i_196_ = (class73.anInt902 * 382019713 - 1360982075 * class73.anInt765);
					if (i_196_ < 0)
						i_196_ = 0;
					if (i_196_ != class73.anInt775 * -2139739529) {
						class73.anInt775 = -650326201 * i_196_;
						Class555.method6575(class73, (short) 28931);
					}
				}
			} else if (13 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 13232);
				class73.anInt783 = (((GameTask) class572_sub12_sub11).p1 * -599008635);
			} else if (i == 14) {
				Class192.aBool2307 = true;
				Class192.anInt2310 = -1469552025 * ((GameTask) class572_sub12_sub11).p1;
				Class192.anInt2300 = 484040841 * ((GameTask) class572_sub12_sub11).p2;
			} else if (15 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 13499);
				class73.anInt906 = -257415021 * ((GameTask) class572_sub12_sub11).p1;
			} else if (i == 21) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -14949);
				class73.aBool725 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
			} else if (22 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -28903);
				class73.aBool896 = 1 == (((GameTask) class572_sub12_sub11).p1) * 471797111;
			} else if (i == 17) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -1013);
				int i_197_ = (int) (l >> 32);
				class73.method1105(i_197_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (((GameTask) class572_sub12_sub11).p2 * 405359321), 33984);
			} else if (20 == i) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 10760);
				int i_198_ = (int) (l >> 32);
				class73.method1106(i_198_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (405359321 * (((GameTask) class572_sub12_sub11).p2)), (byte) -88);
			}
		}
	}

	static final void method8018() {
		Class21.method700(Class272_Sub2.aClass106_9517, (short) 8192);
		if (-1498269815 * anInt8714 != Class274.anInt2911 * -374189215)
			Class286.method3869((byte) -70);
	}

	static final void method8019() {
		Class21.method700(Class272_Sub2.aClass106_9517, (short) 8192);
		if (-1498269815 * anInt8714 != Class274.anInt2911 * -374189215)
			Class286.method3869((byte) -99);
	}

	final void method8020(byte i) {
		if (5 == 835742603 * anInt8580 && !Class574.method6808(-1018133570) || (anInt8580 * 835742603 == 11 && 42 == Class13.anInt106 * -1586424751) || (15 == anInt8580 * 835742603 && (49 == 655322057 * Class13.anInt105 || 52 == 655322057 * Class13.anInt105)) || 6 == anInt8580 * 835742603) {
			if (-1784648141 * anInt8604 > 1) {
				anInt8604 -= -425706245;
				anInt8729 = anInt8839 * 653930141;
			}
			if (!Class25.aBool165)
				Class345.method4317((byte) -39);
			if (15 != anInt8580 * 835742603 || (Class13.anInt105 * 655322057 != 49 && 52 != Class13.anInt105 * 655322057)) {
				for (int i_199_ = 0; (i_199_ < 100 && MaterialInformation.method1605(aClass195_8632, -1095735817)); i_199_++) {
					/* empty */
				}
			}
		}
		Class603.method7145(482473826);
		Class572_Sub12_Sub17.method10456((short) 18272);
		anInt8674 += 237624865;
		Class175.method2756(-1, -1, -1034419750);
		Class296.method3964(null, -1, -1, 1393091249);
		Class514.method6093(1543607650);
		anInt8839 += -1210150071;
		for (int i_200_ = 0; i_200_ < anInt8624 * 617551237; i_200_++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) aClass572_Sub9Array8623[i_200_].anObject9081);
			if (class456_sub1_sub2_sub3_sub1 != null) {
				byte i_201_ = class456_sub1_sub2_sub3_sub1.aClass410_11803.aByte4836;
				if (0 != (i_201_ & 0x1)) {
					int i_202_ = class456_sub1_sub2_sub3_sub1.method10556((short) -25420);
					if ((i_201_ & 0x2) != 0 && 0 == (-2037536229 * class456_sub1_sub2_sub3_sub1.stepsCount) && Math.random() * 1000.0 < 10.0) {
						int i_203_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						int i_204_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						if (i_203_ != 0 || i_204_ != 0) {
							int i_205_ = i_203_ + (class456_sub1_sub2_sub3_sub1.screenX[0]);
							int i_206_ = ((class456_sub1_sub2_sub3_sub1.screenY[0]) + i_204_);
							if (i_205_ < 0) {
								boolean bool = false;
							} else if (i_205_ > (aClass613_8605.method7347(803560982) - i_202_ - 1))
								i_205_ = (aClass613_8605.method7347(-688903908) - i_202_ - 1);
							if (i_206_ < 0) {
								boolean bool = false;
							} else if (i_206_ > (aClass613_8605.method7278(277214477) - i_202_ - 1))
								i_206_ = (aClass613_8605.method7278(277214477) - i_202_ - 1);
						}
					}
					Class9.method533(class456_sub1_sub2_sub3_sub1, true, 1370366839);
					int i_207_ = Class625.method7457(class456_sub1_sub2_sub3_sub1, 471388143);
					Class592.method7016(class456_sub1_sub2_sub3_sub1, (byte) 97);
					Class534.method6373(class456_sub1_sub2_sub3_sub1, 1927859097 * IncomingPacket.anInt4077, Class270.anInt2863 * 1062500197, i_207_, (byte) 58);
					Class600.method7062(class456_sub1_sub2_sub3_sub1, 1927859097 * IncomingPacket.anInt4077, 2071500113);
					Class52.method910(class456_sub1_sub2_sub3_sub1, (byte) 2);
					Class230 class230 = Class230.method3210();
					class230.method3173(Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11655.method645(1248499223)), Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11657.method645(-159544330)), Class325.method4146(class456_sub1_sub2_sub3_sub1.aClass15_11656.method645(620933237)));
					class456_sub1_sub2_sub3_sub1.method5404(class230);
					class230.method3165();
				}
			}
		}
		if ((12 == anInt8580 * 835742603 || 11 == anInt8580 * 835742603 || 5 == anInt8580 * 835742603 || 6 == 835742603 * anInt8580) && (!Class574.method6808(1092627098) || (11 == anInt8580 * 835742603 && Class13.anInt106 * -1586424751 == 42) || (15 == 835742603 * anInt8580 && (49 == Class13.anInt105 * 655322057 || 52 == 655322057 * Class13.anInt105))) && !Class665_Sub26.method9099(-346086189)) {
			if (625220759 * Class18.anInt143 == 5)
				Class444.method5331((byte) 62);
			else
				Class540.method6417((byte) 41);
			if (Class36.anInt387 * 386814715 >> 9 < 14 || (Class36.anInt387 * 386814715 >> 9 >= aClass613_8605.method7347(134582136) - 14) || Class49.anInt490 * -999214779 >> 9 < 14 || (Class49.anInt490 * -999214779 >> 9 >= aClass613_8605.method7278(277214477) - 14))
				aClass613_8605.method7348(new Class598(Class569.aClass569_6392, null), 1293903995);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8813.method7920(-1945803963);
			if (class572_sub20 == null)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (-1665128073 * class73.activeComponent >= 0) {
				InterfaceDefinitions class73_208_ = Class512.method6083(-1604592419 * class73.anInt768, (short) 7318);
				if (null == class73_208_ || null == class73_208_.aClass73Array916 || (-1665128073 * class73.activeComponent >= class73_208_.aClass73Array916.length) || class73 != (class73_208_.aClass73Array916[class73.activeComponent * -1665128073]))
					continue;
			}
			Class34.executeCs2(class572_sub20, -2030946413);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8884.method7920(-1945803963);
			if (null == class572_sub20)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (class73.activeComponent * -1665128073 >= 0) {
				InterfaceDefinitions class73_209_ = Class512.method6083(-1604592419 * class73.anInt768, (short) -2279);
				if (null == class73_209_ || null == class73_209_.aClass73Array916 || (-1665128073 * class73.activeComponent >= class73_209_.aClass73Array916.length) || class73 != (class73_209_.aClass73Array916[-1665128073 * class73.activeComponent]))
					continue;
			}
			Class34.executeCs2(class572_sub20, -2048552336);
		}
		for (;;) {
			Cs2LaunchArgs class572_sub20 = (Cs2LaunchArgs) aClass675_8812.method7920(-1945803963);
			if (class572_sub20 == null)
				break;
			InterfaceDefinitions class73 = class572_sub20.thizInterface;
			if (class73.activeComponent * -1665128073 >= 0) {
				InterfaceDefinitions class73_210_ = Class512.method6083(-1604592419 * class73.anInt768, (short) 9227);
				if (null == class73_210_ || class73_210_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= class73_210_.aClass73Array916.length) || (class73_210_.aClass73Array916[class73.activeComponent * -1665128073]) != class73)
					continue;
			}
			Class34.executeCs2(class572_sub20, -2108523951);
		}
		if (aClass73_8770 != null)
			Class122.method2197(-2016071642);
		if (cycles % 15000 == 0)
			Class175.method2754((byte) 0);
		if (5 == 835742603 * anInt8580 && !Class574.method6808(-265836395) || (11 == anInt8580 * 835742603 && 42 == -1586424751 * Class13.anInt106) || (835742603 * anInt8580 == 15 && (49 == Class13.anInt105 * 655322057 || 655322057 * Class13.anInt105 == 52)) || 6 == 835742603 * anInt8580)
			Class15.method654(-778495728);
		Class572_Sub11.method8410(949435500);
		if (aBool8573 && 835742603 * anInt8580 == 5) {
			Class425.method5177((short) 17823);
			aBool8573 = false;
		}
		if (Class306.clientConfigsDomain.aBool10652 && (Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L < Class69.method1067(-2045375517) - 60000L))
			Class614.method7367(239906896);
		for (Class591_Sub1 class591_sub1 = (Class591_Sub1) aClass652_8864.method7697(-150418674); null != class591_sub1; class591_sub1 = (Class591_Sub1) aClass652_8864.method7698(-930479737)) {
			if ((long) (((Class591_Sub1) class591_sub1).anInt9180 * -1160847613) < Class69.method1067(-1692613206) / 1000L - 5L) {
				if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
					Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 2142949676);
				if (((Class591_Sub1) class591_sub1).aShort9181 == 0)
					Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 1810896751);
				class591_sub1.method7002((byte) 89);
			}
		}
		if (835742603 * anInt8580 == 5 && !Class574.method6808(1613898219) || (11 == 835742603 * anInt8580 && 42 == -1586424751 * Class13.anInt106) || (15 == anInt8580 * 835742603 && (Class13.anInt105 * 655322057 == 49 || 52 == 655322057 * Class13.anInt105)) || 6 == 835742603 * anInt8580) {
			if (835742603 * anInt8580 != 11 && aClass195_8632.method2933(-1931781037) == null)
				Class439.method5276(false, (byte) 8);
			else if (null != aClass195_8632) {
				aClass195_8632.anInt2337 += 394568993;
				if (aClass195_8632.anInt2337 * -1242489119 > 50) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, aClass195_8632.aClass650_2340, -1897356261);
					aClass195_8632.method2929(class572_sub25, (byte) -16);
				}
				try {
					aClass195_8632.method2936((byte) -73);
				} catch (IOException ioexception) {
					if (11 == anInt8580 * 835742603)
						aClass195_8632.method2943(-1900981839);
					else
						Class439.method5276(false, (byte) 8);
				}
			}
		}
	}

	static final void method8021() {
		anInt8836 = 0;
		for (int i = 0; i < anInt8625 * 765313669; i++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i])).anObject9081));
			if (class456_sub1_sub2_sub3_sub1.aBool11612 && class456_sub1_sub2_sub3_sub1.method10531(-60987000) != -1) {
				int i_211_ = ((class456_sub1_sub2_sub3_sub1.method10556((short) -2888) - 1) * 256 + 252);
				Class240 class240 = class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647;
				int i_212_ = (int) class240.aFloat2653 - i_211_ >> 9;
				int i_213_ = (int) class240.aFloat2657 - i_211_ >> 9;
				Entity class456_sub1_sub2_sub3 = Class249.method3438((class456_sub1_sub2_sub3_sub1.aByte9009), i_212_, i_213_, (byte) 10);
				if (null != class456_sub1_sub2_sub3) {
					int i_214_ = class456_sub1_sub2_sub3.anInt11633 * -821391465;
					if (class456_sub1_sub2_sub3 instanceof NPC)
						i_214_ += 2048;
					if (0 == 598264067 * class456_sub1_sub2_sub3.anInt11613 && (class456_sub1_sub2_sub3.method10531(-60987000) != -1)) {
						anIntArray8700[anInt8836 * -643403915] = i_214_;
						anIntArray8656[-643403915 * anInt8836] = i_214_;
						anInt8836 += -925259555;
						class456_sub1_sub2_sub3.anInt11613 += -1222973013;
					}
					anIntArray8700[anInt8836 * -643403915] = i_214_;
					anIntArray8656[-643403915 * anInt8836] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633 + 2048);
					anInt8836 += -925259555;
					class456_sub1_sub2_sub3.anInt11613 += -1222973013;
				}
			}
		}
		Class530.method6335(anIntArray8656, anIntArray8700, 0, -643403915 * anInt8836 - 1, -139286003);
	}

	static final void method8022() {
		Class21.method700(Class272_Sub2.aClass106_9517, (short) 8192);
		if (-1498269815 * anInt8714 != Class274.anInt2911 * -374189215)
			Class286.method3869((byte) -90);
	}

	static final void method8023() {
		int[] is = Class184.anIntArray2154;
		for (int i = 0; i < 1657484935 * Class184.anInt2163; i++) {
			Player class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i]];
			if (class456_sub1_sub2_sub3_sub2 != null)
				class456_sub1_sub2_sub3_sub2.method10532(2077183719);
		}
		for (int i = 0; i < 765313669 * anInt8625; i++) {
			long l = (long) anIntArray8626[i];
			LinkableObject class572_sub9 = (LinkableObject) aClass676_8622.get(l);
			if (null != class572_sub9)
				((Entity) class572_sub9.anObject9081).method10532(1592611193);
		}
		if (4 == 1797623853 * anInt8646) {
			for (int i = 0; i < Class122.aClass130Array1483.length; i++) {
				Class130 class130 = Class122.aClass130Array1483[i];
				if (class130.aBool1529)
					class130.method2268(1932404388).method10532(1544144404);
			}
		}
	}

	static final void method8024() {
		int[] is = Class184.anIntArray2154;
		for (int i = 0; i < 1657484935 * Class184.anInt2163; i++) {
			Player class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i]];
			if (class456_sub1_sub2_sub3_sub2 != null)
				class456_sub1_sub2_sub3_sub2.method10532(-1994407777);
		}
		for (int i = 0; i < 765313669 * anInt8625; i++) {
			long l = (long) anIntArray8626[i];
			LinkableObject class572_sub9 = (LinkableObject) aClass676_8622.get(l);
			if (null != class572_sub9)
				((Entity) class572_sub9.anObject9081).method10532(1287985621);
		}
		if (4 == 1797623853 * anInt8646) {
			for (int i = 0; i < Class122.aClass130Array1483.length; i++) {
				Class130 class130 = Class122.aClass130Array1483[i];
				if (class130.aBool1529)
					class130.method2268(-771113415).method10532(2084618971);
			}
		}
	}

	public static final void method8025() {
		if (anInt8690 * 996160277 != -1 && -1 != anInt8711 * -2091123823) {
			int i = ((((anInt8696 * -1394587525 - anInt8709 * -1411159733) * (366719231 * anInt8651)) >> 16) + anInt8709 * -1411159733);
			anInt8651 += i * -2000466177;
			if (366719231 * anInt8651 >= 65535) {
				anInt8651 = -969166591;
				if (!aBool8698)
					aBool8697 = true;
				else
					aBool8697 = false;
				aBool8698 = true;
			} else {
				aBool8697 = false;
				aBool8698 = false;
			}
			float f = (float) (366719231 * anInt8651) / 65535.0F;
			float[] fs = new float[3];
			int i_215_ = 1420329210 * anInt8692;
			for (int i_216_ = 0; i_216_ < 3; i_216_++) {
				int i_217_ = 3 * (anIntArrayArrayArray8689[anInt8690 * 996160277][i_215_][i_216_]);
				int i_218_ = 3 * (anIntArrayArrayArray8689[996160277 * anInt8690][i_215_ + 1][i_216_]);
				int i_219_ = (((anIntArrayArrayArray8689[996160277 * anInt8690][i_215_ + 2][i_216_]) - ((anIntArrayArrayArray8689[996160277 * anInt8690][i_215_ + 3][i_216_]) - (anIntArrayArrayArray8689[anInt8690 * 996160277][i_215_ + 2][i_216_]))) * 3);
				int i_220_ = (anIntArrayArrayArray8689[996160277 * anInt8690][i_215_][i_216_]);
				int i_221_ = i_218_ - i_217_;
				int i_222_ = i_217_ - i_218_ * 2 + i_219_;
				int i_223_ = ((anIntArrayArrayArray8689[996160277 * anInt8690][i_215_ + 2][i_216_]) - i_220_ + i_218_ - i_219_);
				fs[i_216_] = (float) i_220_ + f * ((float) i_221_ + f * (f * (float) i_223_ + (float) i_222_));
			}
			Class497 class497 = aClass613_8605.method7280((byte) -92);
			Class36.anInt387 = 70707251 * ((int) fs[0] - class497.localX * -2077331968);
			Class572_Sub13_Sub2.anInt11451 = (int) fs[1] * 371247041;
			Class49.anInt490 = (((int) fs[2] - class497.localY * -1078397440) * -114706035);
			float[] fs_224_ = new float[3];
			int i_225_ = anInt8824 * 999430618;
			for (int i_226_ = 0; i_226_ < 3; i_226_++) {
				int i_227_ = ((anIntArrayArrayArray8689[anInt8711 * -2091123823][i_225_][i_226_]) * 3);
				int i_228_ = ((anIntArrayArrayArray8689[-2091123823 * anInt8711][1 + i_225_][i_226_]) * 3);
				int i_229_ = 3 * ((anIntArrayArrayArray8689[anInt8711 * -2091123823][i_225_ + 2][i_226_]) - ((anIntArrayArrayArray8689[-2091123823 * anInt8711][i_225_ + 3][i_226_]) - (anIntArrayArrayArray8689[anInt8711 * -2091123823][2 + i_225_][i_226_])));
				int i_230_ = (anIntArrayArrayArray8689[-2091123823 * anInt8711][i_225_][i_226_]);
				int i_231_ = i_228_ - i_227_;
				int i_232_ = i_227_ - 2 * i_228_ + i_229_;
				int i_233_ = ((anIntArrayArrayArray8689[anInt8711 * -2091123823][2 + i_225_][i_226_]) - i_230_ + i_228_ - i_229_);
				fs_224_[i_226_] = (float) i_230_ + (f * ((float) i_233_ * f + (float) i_232_) + (float) i_231_) * f;
			}
			float f_234_ = fs_224_[0] - fs[0];
			float f_235_ = (fs_224_[1] - fs[1]) * -1.0F;
			float f_236_ = fs_224_[2] - fs[2];
			double d = Math.sqrt((double) (f_234_ * f_234_ + f_236_ * f_236_));
			Class455.anInt5187 = ((int) (Math.atan2((double) f_235_, d) * 2607.5945876176133) & 0x3fff) * 58615007;
			Class406.anInt4765 = ((int) (-Math.atan2((double) f_234_, (double) f_236_) * 2607.5945876176133) & 0x3fff) * 1259382101;
			Class88.anInt1225 = (-1263582291 * ((anIntArrayArrayArray8689[anInt8690 * 996160277][i_215_][3]) + ((366719231 * anInt8651 * ((anIntArrayArrayArray8689[anInt8690 * 996160277][2 + i_215_][3]) - (anIntArrayArrayArray8689[996160277 * anInt8690][i_215_][3]))) >> 16)));
		}
	}

	static final void method8026() {
		int i = Class39.anInt402 * -1285286400 + 256;
		int i_237_ = Class9.anInt44 * 1760571904 + 256;
		int i_238_ = (Class314.method4072(i, i_237_, Class274.anInt2911 * -374189215, -1793329243) - 595469297 * PacketsDecoder.anInt2430);
		if (1274992935 * Class591.anInt7816 >= 100) {
			Class36.anInt387 = 921187072 + Class39.anInt402 * 350249472;
			Class49.anInt490 = Class9.anInt44 * 1651345920 + 700026112;
			Class572_Sub13_Sub2.anInt11451 = (Class314.method4072(386814715 * Class36.anInt387, Class49.anInt490 * -999214779, Class274.anInt2911 * -374189215, -2006025000) - PacketsDecoder.anInt2430 * 595469297) * -371247041;
		} else {
			if (Class36.anInt387 * 386814715 < i) {
				Class36.anInt387 += (((i - 386814715 * Class36.anInt387) * (Class591.anInt7816 * 1274992935) / 1000) + 85378959 * Class272_Sub1.anInt9449) * 70707251;
				if (Class36.anInt387 * 386814715 > i)
					Class36.anInt387 = i * 70707251;
			}
			if (Class36.anInt387 * 386814715 > i) {
				Class36.anInt387 -= 70707251 * ((1274992935 * Class591.anInt7816 * (386814715 * Class36.anInt387 - i) / 1000) + 85378959 * Class272_Sub1.anInt9449);
				if (386814715 * Class36.anInt387 < i)
					Class36.anInt387 = 70707251 * i;
			}
			if (-1094666305 * Class572_Sub13_Sub2.anInt11451 < i_238_) {
				Class572_Sub13_Sub2.anInt11451 += ((1274992935 * Class591.anInt7816 * (i_238_ - Class572_Sub13_Sub2.anInt11451 * -1094666305) / 1000) + 85378959 * Class272_Sub1.anInt9449) * -371247041;
				if (Class572_Sub13_Sub2.anInt11451 * -1094666305 > i_238_)
					Class572_Sub13_Sub2.anInt11451 = i_238_ * -371247041;
			}
			if (Class572_Sub13_Sub2.anInt11451 * -1094666305 > i_238_) {
				Class572_Sub13_Sub2.anInt11451 -= (85378959 * Class272_Sub1.anInt9449 + (1274992935 * Class591.anInt7816 * (-1094666305 * Class572_Sub13_Sub2.anInt11451 - i_238_) / 1000)) * -371247041;
				if (Class572_Sub13_Sub2.anInt11451 * -1094666305 < i_238_)
					Class572_Sub13_Sub2.anInt11451 = -371247041 * i_238_;
			}
			if (-999214779 * Class49.anInt490 < i_237_) {
				Class49.anInt490 += (((i_237_ - -999214779 * Class49.anInt490) * (1274992935 * Class591.anInt7816) / 1000) + Class272_Sub1.anInt9449 * 85378959) * -114706035;
				if (Class49.anInt490 * -999214779 > i_237_)
					Class49.anInt490 = -114706035 * i_237_;
			}
			if (Class49.anInt490 * -999214779 > i_237_) {
				Class49.anInt490 -= (((Class49.anInt490 * -999214779 - i_237_) * (Class591.anInt7816 * 1274992935) / 1000) + Class272_Sub1.anInt9449 * 85378959) * -114706035;
				if (-999214779 * Class49.anInt490 < i_237_)
					Class49.anInt490 = -114706035 * i_237_;
			}
		}
		i = Class442.anInt5132 * 543380992 + 256;
		i_237_ = 256 + 2038734336 * Class438.anInt5081;
		i_238_ = Class314.method4072(i, i_237_, -374189215 * Class274.anInt2911, -1823019558) - 611634393 * Class44.anInt445;
		int i_239_ = i - 386814715 * Class36.anInt387;
		int i_240_ = i_238_ - Class572_Sub13_Sub2.anInt11451 * -1094666305;
		int i_241_ = i_237_ - Class49.anInt490 * -999214779;
		int i_242_ = (int) Math.sqrt((double) (i_241_ * i_241_ + i_239_ * i_239_));
		int i_243_ = ((int) (Math.atan2((double) i_240_, (double) i_242_) * 2607.5945876176133) & 0x3fff);
		int i_244_ = ((int) (Math.atan2((double) i_239_, (double) i_241_) * -2607.5945876176133) & 0x3fff);
		if (i_243_ < 1024)
			i_243_ = 1024;
		if (i_243_ > 3072)
			i_243_ = 3072;
		if (Class455.anInt5187 * 1406555935 < i_243_) {
			Class455.anInt5187 += ((Class643.anInt8310 * 783129753 + (-219783477 * Class347.anInt4389 * (i_243_ - Class455.anInt5187 * 1406555935 >> 3) / 1000)) << 3) * 58615007;
			if (1406555935 * Class455.anInt5187 > i_243_)
				Class455.anInt5187 = 58615007 * i_243_;
		}
		if (1406555935 * Class455.anInt5187 > i_243_) {
			Class455.anInt5187 -= ((((1406555935 * Class455.anInt5187 - i_243_ >> 3) * (-219783477 * Class347.anInt4389) / 1000) + 783129753 * Class643.anInt8310) << 3) * 58615007;
			if (1406555935 * Class455.anInt5187 < i_243_)
				Class455.anInt5187 = 58615007 * i_243_;
		}
		int i_245_ = i_244_ - Class406.anInt4765 * 426389501;
		if (i_245_ > 8192)
			i_245_ -= 16384;
		if (i_245_ < -8192)
			i_245_ += 16384;
		i_245_ >>= 3;
		if (i_245_ > 0) {
			Class406.anInt4765 += ((Class643.anInt8310 * 783129753 + -219783477 * Class347.anInt4389 * i_245_ / 1000) << 3) * 1259382101;
			Class406.anInt4765 = 1259382101 * (426389501 * Class406.anInt4765 & 0x3fff);
		}
		if (i_245_ < 0) {
			Class406.anInt4765 -= (1259382101 * ((783129753 * Class643.anInt8310 + -219783477 * Class347.anInt4389 * -i_245_ / 1000) << 3));
			Class406.anInt4765 = (Class406.anInt4765 * 426389501 & 0x3fff) * 1259382101;
		}
		int i_246_ = i_244_ - 426389501 * Class406.anInt4765;
		if (i_246_ > 8192)
			i_246_ -= 16384;
		if (i_246_ < -8192)
			i_246_ += 16384;
		if (i_246_ < 0 && i_245_ > 0 || i_246_ > 0 && i_245_ < 0)
			Class406.anInt4765 = 1259382101 * i_244_;
		Class88.anInt1225 = 0;
	}

	public static final void method8027() {
		if (!aBool8681) {
			aFloat8660 += (12.0F - aFloat8660) / 2.0F;
			aBool8685 = true;
			aBool8681 = true;
		}
	}

	public static final void method8028() {
		if (!aBool8681) {
			aFloat8660 += (-12.0F - aFloat8660) / 2.0F;
			aBool8685 = true;
			aBool8681 = true;
		}
	}

	public static final void method8029() {
		if (!aBool8682) {
			aFloat8679 += (24.0F - aFloat8679) / 2.0F;
			aBool8685 = true;
			aBool8682 = true;
		}
	}

	public static final void method8030() {
		if (!aBool8682) {
			aFloat8679 += (-24.0F - aFloat8679) / 2.0F;
			aBool8685 = true;
			aBool8682 = true;
		}
	}

	public static final void method8031() {
		if (!aBool8682) {
			aFloat8679 += (-24.0F - aFloat8679) / 2.0F;
			aBool8685 = true;
			aBool8682 = true;
		}
	}

	public static final void method8032() {
		if (!aBool8682) {
			aFloat8679 += (-24.0F - aFloat8679) / 2.0F;
			aBool8685 = true;
			aBool8682 = true;
		}
	}

	public static final void method8033() {
		if (!aBool8682) {
			aFloat8679 += (-24.0F - aFloat8679) / 2.0F;
			aBool8685 = true;
			aBool8682 = true;
		}
	}

	public static void method8034(int i, int i_247_, int i_248_) {
		i <<= 3;
		i_247_ <<= 3;
		i_248_ <<= 3;
		if (625220759 * Class18.anInt143 == 1) {
			if (Class133_Sub1.aClass411_Sub1_9827.method4994(223618320) == Class413.aClass413_4915) {
				Class423_Sub3 class423_sub3 = (Class423_Sub3) Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -45);
				Class230 class230 = new Class230();
				Class230 class230_249_ = new Class230();
				class230.method3172(0.0F, 1.0F, 0.0F, 3.1415927F - (float) (2.0 * (3.141592653589793 * (double) i_247_) / 16384.0));
				Class240 class240 = new Class240(1.0F, 0.0F, 0.0F);
				class240.method3288(class230);
				class240.method3272();
				class230_249_.method3209(class240, (float) ((double) i * 3.141592653589793 * 2.0) / 16384.0F);
				class230.method3189(class230_249_);
				class423_sub3.aClass230_9806.method3170(class230);
			}
		} else {
			aFloat8822 = (float) i;
			aFloat8678 = (float) i_247_;
			if (Class18.anInt143 * 625220759 == 5) {
				Class455.anInt5187 = 58615007 * i;
				Class406.anInt4765 = 1259382101 * i_247_;
				Class88.anInt1225 = -1263582291 * i_248_;
			}
			Class245.method3350(2138852627);
		}
		aBool8685 = true;
	}

	static final void method8035() {
		if (aFloat8822 < 1077.0F)
			aFloat8822 = 1077.0F;
		if (aFloat8822 > 2987.0F)
			aFloat8822 = 2987.0F;
		for (/**/; aFloat8678 >= 16384.0F; aFloat8678 -= 16384.0F) {
			/* empty */
		}
		for (/**/; aFloat8678 < 0.0F; aFloat8678 += 16384.0F) {
			/* empty */
		}
		Class274 class274 = aClass613_8605.method7287((byte) 87);
		Class523 class523 = aClass613_8605.method7285(1861821474);
		int i = 1007135537 * Entity.anInt11674 >> 9;
		int i_250_ = Class165.anInt2050 * -1126693191 >> 9;
		int i_251_ = Class314.method4072(1007135537 * (Entity.anInt11674), Class165.anInt2050 * -1126693191, Class274.anInt2911 * -374189215, -2128140861);
		int i_252_ = 0;
		if (i > 3 && i_250_ > 3 && i < aClass613_8605.method7347(917326289) - 4 && i_250_ < aClass613_8605.method7278(277214477) - 4) {
			for (int i_253_ = i - 4; i_253_ <= 4 + i; i_253_++) {
				for (int i_254_ = i_250_ - 4; i_254_ <= i_250_ + 4; i_254_++) {
					int i_255_ = -374189215 * Class274.anInt2911;
					if (i_255_ < 3 && class274.method3689(i_253_, i_254_, -2127845580))
						i_255_++;
					int i_256_ = 0;
					byte[][] is = aClass613_8605.method7307(i_255_, 660236451);
					if (null != is)
						i_256_ = (is[i_253_][i_254_] & 0xff) * 8 << 2;
					if (class523.aClass174Array5875 != null && null != class523.aClass174Array5875[i_255_]) {
						int i_257_ = (i_251_ - (class523.aClass174Array5875[i_255_].method2713(i_253_, i_254_, -318779175) - i_256_));
						if (i_257_ > i_252_)
							i_252_ = i_257_;
					}
				}
			}
		}
		int i_258_ = 1536 * (i_252_ >> 2);
		if (i_258_ > 786432)
			i_258_ = 786432;
		if (i_258_ < 262144)
			i_258_ = 262144;
		if (i_258_ > -171256967 * anInt8686)
			anInt8686 += 406595273 * ((i_258_ - anInt8686 * -171256967) / 24);
		else if (i_258_ < anInt8686 * -171256967)
			anInt8686 += (i_258_ - anInt8686 * -171256967) / 80 * 406595273;
	}

	public static final void method8036() {
		for (int i = 0; i < 5; i++)
			aBoolArray8842[i] = false;
		anInt8690 = 1542880195;
		anInt8711 = -527050097;
		Class643.anInt8310 = 0;
		Class347.anInt4389 = 0;
		Class18.anInt143 = -574470578;
		if (Class111.method2081((byte) -102) == 1) {
			Class497 class497 = aClass613_8605.method7280((byte) -12);
			int i = -2109597897 * class497.localX << 9;
			int i_259_ = 417324155 * class497.localY << 9;
			int i_260_ = 1000 / Class425.method5176(2036359028);
			Class133_Sub1.aClass411_Sub1_9827.method5012((float) i_260_ / 1000.0F, (aClass613_8605.method7293(-1344053399).anIntArrayArrayArray3141), aClass613_8605.method7287((byte) -88), i, i_259_, (byte) -50);
		}
		Class419.anInt4958 = 1724865785;
		Class566.anInt6375 = 2114279121;
		anInt8669 = -1410198393 * cycles;
		Class667.anInt8510 = Class36.anInt387 * 524410443;
		Class428.anInt5022 = -1652835303 * Class572_Sub13_Sub2.anInt11451;
		ItemDefinitions.anInt8194 = -1316646979 * Class49.anInt490;
		Class75.anInt943 = -698355399 * Class455.anInt5187;
		Class119.anInt1467 = Class406.anInt4765 * -610619311;
		Class179_Sub2.anInt10735 = anInt8859 * 358878937;
	}

	static final void method8037() {
		Class497 class497 = aClass613_8605.method7280((byte) -62);
		Class240 class240 = Class133_Sub1.aClass411_Sub1_9827.method4968(-123102366);
		Class36.anInt387 = 70707251 * ((int) class240.aFloat2653 - (-2109597897 * class497.localX << 9));
		Class572_Sub13_Sub2.anInt11451 = -371247041 * -(int) class240.aFloat2656;
		Class49.anInt490 = -114706035 * ((int) class240.aFloat2657 - (417324155 * class497.localY << 9));
		Class455.anInt5187 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method4999(-1636417737) * 2607.5945876176133) & 0x3fff) * 58615007;
		Class406.anInt4765 = ((int) ((double) Class133_Sub1.aClass411_Sub1_9827.method5000(69787938) * 2607.5945876176133) & 0x3fff) * 1259382101;
		Class88.anInt1225 = 0;
	}

	static final void method8038() {
		int i = Class184.anInt2163 * 1657484935;
		int[] is = Class184.anIntArray2154;
		for (int i_261_ = 0; i_261_ < i; i_261_++) {
			Player class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_261_]];
			if (class456_sub1_sub2_sub3_sub2 != null)
				Class461.method5469(class456_sub1_sub2_sub3_sub2, false, -422961781);
		}
	}

	static final void method8039() {
		int i = Class184.anInt2163 * 1657484935;
		int[] is = Class184.anIntArray2154;
		for (int i_262_ = 0; i_262_ < i; i_262_++) {
			Player class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_262_]];
			if (class456_sub1_sub2_sub3_sub2 != null)
				Class461.method5469(class456_sub1_sub2_sub3_sub2, false, 1023508989);
		}
	}

	static final void method8040() {
		for (int i = 0; i < anInt8625 * 765313669; i++) {
			int i_263_ = anIntArray8626[i];
			LinkableObject class572_sub9 = (LinkableObject) aClass676_8622.get((long) i_263_);
			if (null != class572_sub9) {
				NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
				Class461.method5469(class456_sub1_sub2_sub3_sub1, false, 2077990245);
			}
		}
	}

	static final void method8041() {
		for (Class572_Sub12_Sub6 class572_sub12_sub6 = (Class572_Sub12_Sub6) aClass675_8774.method7932((byte) 50); class572_sub12_sub6 != null; class572_sub12_sub6 = ((Class572_Sub12_Sub6) aClass675_8774.method7926(188725425))) {
			Class456_Sub1_Sub2_Sub5 class456_sub1_sub2_sub5 = (((Class572_Sub12_Sub6) class572_sub12_sub6).aClass456_Sub1_Sub2_Sub5_11367);
			if (cycles > class456_sub1_sub2_sub5.anInt11739 * 1095263993) {
				class572_sub12_sub6.method6794((byte) 47);
				class456_sub1_sub2_sub5.method10642((byte) -115);
			} else if (cycles >= class456_sub1_sub2_sub5.anInt11748 * 1176691683) {
				class456_sub1_sub2_sub5.method10637(1629093517);
				if (2125689013 * class456_sub1_sub2_sub5.anInt11759 > 0) {
					if (4 == 1797623853 * anInt8646) {
						Entity class456_sub1_sub2_sub3 = Class122.aClass130Array1483[(2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1].method2268(-1050673859);
						if (class456_sub1_sub2_sub3 != null) {
							Class240 class240 = (class456_sub1_sub2_sub3.method5394().aClass240_2647);
							if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < (aClass613_8605.method7347(-447763039) * 512)) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < (aClass613_8605.method7278(277214477) * 512)))
								class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub3.aByte9009, -2003437403)) - (class456_sub1_sub2_sub5.anInt11741 * 1284627787)), cycles, (byte) -80);
						}
					} else {
						LinkableObject class572_sub9 = ((LinkableObject) (aClass676_8622.get((long) ((2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1))));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240 = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
							if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < (aClass613_8605.method7347(1246999248) * 512)) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < (aClass613_8605.method7278(277214477) * 512)))
								class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub5.aByte9009, -2114006245)) - 1284627787 * (class456_sub1_sub2_sub5.anInt11741)), cycles, (byte) -105);
						}
					}
				}
				if (class456_sub1_sub2_sub5.anInt11759 * 2125689013 < 0) {
					int i = (-(2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1);
					Player class456_sub1_sub2_sub3_sub2;
					if (-1921142451 * anInt8728 == i)
						class456_sub1_sub2_sub3_sub2 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
					else
						class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
					if (null != class456_sub1_sub2_sub3_sub2) {
						Class240 class240 = (class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
						if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < aClass613_8605.method7347(-399708392) * 512) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < aClass613_8605.method7278(277214477) * 512))
							class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, (Class314.method4072((int) (class240.aFloat2653), (int) (class240.aFloat2657), (class456_sub1_sub2_sub5.aByte9009), -1788643860) - (class456_sub1_sub2_sub5.anInt11741 * 1284627787)), cycles, (byte) -66);
					}
				}
				class456_sub1_sub2_sub5.method10640(855188961 * anInt8674, (byte) -50);
				aClass613_8605.method7285(1249499313).method6232(class456_sub1_sub2_sub5, true, -1034712561);
			}
		}
	}

	static final void method8042() {
		Iterator iterator = aClass676_8747.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub9 class572_sub12_sub9 = (Class572_Sub12_Sub9) iterator.next();
			Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390);
			if (aClass613_8605.method7285(1348360521) != null && class456_sub1_sub2_sub4.method10599(2136722505))
				aClass613_8605.method7285(1751204330).method6232(class456_sub1_sub2_sub4, true, 1659498954);
		}
	}

	void method8043() {
		boolean bool = Class51.aClass278_491.method3747(-574613290);
		if (!bool)
			method8076(1723177524);
	}

	static final void method8044(byte i) {
		byte[][][] is = aClass613_8605.method7346((byte) 63);
		if (null == is) {
			is = (new byte[4][aClass613_8605.method7347(2062216642)][aClass613_8605.method7278(277214477)]);
			aClass613_8605.method7326(is, -733663796);
		}
		for (int i_264_ = 0; i_264_ < 4; i_264_++) {
			for (int i_265_ = 0; i_265_ < aClass613_8605.method7347(494553098); i_265_++) {
				for (int i_266_ = 0; i_266_ < aClass613_8605.method7278(277214477); i_266_++)
					is[i_264_][i_265_][i_266_] = i;
			}
		}
	}

	static final void method8045() {
		int i = 0;
		Class523 class523 = aClass613_8605.method7285(2099320009);
		for (int i_267_ = 0; i_267_ < aClass613_8605.method7347(1936103161); i_267_++) {
			for (int i_268_ = 0; i_268_ < aClass613_8605.method7278(277214477); i_268_++) {
				if (Class406.method4926(class523.aClass536ArrayArrayArray5882, i, i_267_, i_268_, true, (short) 211))
					i++;
				if (i >= 512)
					return;
			}
		}
	}

	static final void method8046() {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub1_9201.method8101(2104941975) == 2) {
			byte[][][] is = aClass613_8605.method7346((byte) 8);
			byte i = (byte) (anInt8699 * 2074321681 - 4 & 0xff);
			int i_269_ = (2074321681 * anInt8699 % aClass613_8605.method7347(815346305));
			for (int i_270_ = 0; i_270_ < 4; i_270_++) {
				for (int i_271_ = 0; i_271_ < aClass613_8605.method7278(277214477); i_271_++)
					is[i_270_][i_269_][i_271_] = i;
			}
			if (Class274.anInt2911 * -374189215 != 3) {
				for (int i_272_ = 0; i_272_ < 2; i_272_++) {
					anIntArray8701[i_272_] = -1000000;
					anIntArray8716[i_272_] = 1000000;
					anIntArray8717[i_272_] = 0;
					anIntArray8719[i_272_] = 1000000;
					anIntArray8718[i_272_] = 0;
				}
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class274 class274 = aClass613_8605.method7287((byte) -61);
				Class523 class523 = aClass613_8605.method7285(1666517654);
				if (4 == Class18.anInt143 * 625220759 || 625220759 * Class18.anInt143 == 1 || -1 != Class566.anInt6375 * -774947377) {
					Class497 class497 = aClass613_8605.method7280((byte) -23);
					int i_273_;
					int i_274_;
					if (Class18.anInt143 * 625220759 == 1) {
						Class240 class240_275_ = Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040).method7745(-1198547608);
						if (Float.isNaN(class240_275_.aFloat2653))
							return;
						i_273_ = ((int) class240_275_.aFloat2653 - (-2109597897 * class497.localX << 9));
						i_274_ = ((int) class240_275_.aFloat2657 - (417324155 * class497.localY << 9));
						if (i_273_ < 0 || i_274_ < 0 || (i_273_ >> 9 >= (class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215]).length) || (i_274_ >> 9 >= (class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_273_ >> 9]).length))
							return;
					} else if (4 == 625220759 * Class18.anInt143) {
						i_273_ = (int) class240.aFloat2653;
						i_274_ = (int) class240.aFloat2657;
					} else {
						i_273_ = Class566.anInt6375 * -774947377;
						i_274_ = -1040360777 * Class419.anInt4958;
					}
					if (((class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_273_ >> 9][i_274_ >> 9]) & 0x4) != 0)
						Class406.method4926((class523.aClass536ArrayArrayArray5882), 0, i_273_ >> 9, i_274_ >> 9, false, (short) 211);
					else {
						int i_276_;
						int i_277_;
						if (1 == 625220759 * Class18.anInt143) {
							Class240 class240_278_ = Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -4).method5159((byte) -87);
							i_276_ = (((int) class240_278_.aFloat2653 >> 9) - -2109597897 * class497.localX);
							i_277_ = (((int) class240_278_.aFloat2657 >> 9) - class497.localY * 417324155);
							if (i_276_ < 0 || i_277_ < 0 || i_276_ >= (class274.aByteArrayArrayArray2909[(Class274.anInt2911 * -374189215)]).length || i_277_ >= (class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_276_]).length)
								return;
						} else {
							i_276_ = 386814715 * Class36.anInt387 >> 9;
							i_277_ = Class49.anInt490 * -999214779 >> 9;
						}
						int i_279_ = i_273_ >> 9;
						int i_280_ = i_274_ >> 9;
						if (class274.method3682(i_276_, i_277_, (byte) -93)) {
							int i_281_ = Class314.method4072((386814715 * Class36.anInt387), (-999214779 * Class49.anInt490), 3, -2062917598);
							if (Class572_Sub13_Sub2.anInt11451 * -1094666305 >= i_281_)
								Class406.method4926(class523.aClass536ArrayArrayArray5882, 1, i_276_, i_277_, false, (short) 211);
						} else {
							while_7_: do {
								if (1406555935 * Class455.anInt5187 < 2560) {
									int i_282_;
									if (i_279_ > i_276_)
										i_282_ = i_279_ - i_276_;
									else
										i_282_ = i_276_ - i_279_;
									int i_283_;
									if (i_280_ > i_277_)
										i_283_ = i_280_ - i_277_;
									else
										i_283_ = i_277_ - i_280_;
									if (0 == i_282_ && i_283_ == 0 || (i_282_ <= -aClass613_8605.method7347(-14266318)) || (i_282_ >= aClass613_8605.method7347(-363054088)) || (i_283_ <= -aClass613_8605.method7278(277214477)) || (i_283_ >= aClass613_8605.method7278(277214477))) {
										if (1 != Class18.anInt143 * 625220759)
											Class640.method7592(new StringBuilder().append(i_276_).append(Class3.aString23).append(i_277_).append(" ").append(i_279_).append(Class3.aString23).append(i_280_).append(" ").append(class497.localX * -2109597897).append(Class3.aString23).append(class497.localY * 417324155).toString(), new RuntimeException(), 392545735);
										break;
									}
									if (i_282_ > i_283_) {
										int i_284_ = i_283_ * 65536 / i_282_;
										int i_285_ = 32768;
										while_6_: do {
											for (;;) {
												if (i_279_ == i_276_)
													break while_6_;
												if (i_276_ < i_279_)
													i_276_++;
												else if (i_276_ > i_279_)
													i_276_--;
												if (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_276_][i_277_]) & 0x4)) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_, i_277_, false, (short) 211);
													break while_6_;
												}
												if ((i_277_ + 1 < (class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_276_]).length) && (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_276_][1 + i_277_]) & 0x4))) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_, 1 + i_277_, false, (short) 211);
													break while_6_;
												}
												if (i_277_ > 0 && ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_276_][i_277_ - 1]) & 0x4) != 0) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_, i_277_ - 1, false, (short) 211);
													break while_6_;
												}
												i_285_ += i_284_;
												if (i_285_ >= 65536) {
													i_285_ -= 65536;
													if (i_277_ < i_280_) {
														if ((++i_277_ + 1 < (class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_276_]).length) && (0 != ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_276_][(i_277_ + 1)]) & 0x4))) {
															Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_, i_277_ + 1, false, (short) 211);
															break while_6_;
														}
													} else if (i_277_ > i_280_ && --i_277_ > 0 && ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_276_][(i_277_ - 1)]) & 0x4) != 0)
														break;
												}
											}
											Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_, i_277_ - 1, false, (short) 211);
										} while (false);
									} else {
										int i_286_ = i_282_ * 65536 / i_283_;
										int i_287_ = 32768;
										for (;;) {
											if (i_277_ == i_280_)
												break while_7_;
											if (i_277_ < i_280_)
												i_277_++;
											else if (i_277_ > i_280_)
												i_277_--;
											if (((class274.aByteArrayArrayArray2909[(Class274.anInt2911 * -374189215)][i_276_][i_277_]) & 0x4) != 0) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_, i_277_, false, (short) 211);
												break while_7_;
											}
											if ((i_276_ + 1 < (class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))]).length) && (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][1 + i_276_][i_277_]) & 0x4))) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_ + 1, i_277_, false, (short) 211);
												break while_7_;
											}
											if (i_276_ > 0 && ((class274.aByteArrayArrayArray2909[(-374189215 * Class274.anInt2911)][i_276_ - 1][i_277_]) & 0x4) != 0) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_ - 1, i_277_, false, (short) 211);
												break while_7_;
											}
											i_287_ += i_286_;
											if (i_287_ >= 65536) {
												i_287_ -= 65536;
												if (i_276_ < i_279_) {
													i_276_++;
													if ((1 + i_276_ < (class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)]).length) && ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_276_ + 1][i_277_]) & 0x4) != 0) {
														Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, 1 + i_276_, i_277_, false, (short) 211);
														break while_7_;
													}
												} else if (i_276_ > i_279_ && --i_276_ > 0 && ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_276_ - 1][i_277_]) & 0x4) != 0)
													break;
											}
										}
										Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_276_ - 1, i_277_, false, (short) 211);
									}
								}
							} while (false);
						}
					}
				} else {
					int i_288_ = Class314.method4072(386814715 * Class36.anInt387, Class49.anInt490 * -999214779, -374189215 * Class274.anInt2911, -1906648902);
					if ((i_288_ - -1094666305 * Class572_Sub13_Sub2.anInt11451 < 3200) && ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][386814715 * Class36.anInt387 >> 9][-999214779 * Class49.anInt490 >> 9]) & 0x4) != 0)
						Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, Class36.anInt387 * 386814715 >> 9, Class49.anInt490 * -999214779 >> 9, false, (short) 211);
				}
			}
		}
	}

	public static final void method8047() {
		if (!aBool8682) {
			aFloat8679 += (24.0F - aFloat8679) / 2.0F;
			aBool8685 = true;
			aBool8682 = true;
		}
	}

	static final void method8048() {
		anInt8836 = 0;
		for (int i = 0; i < anInt8625 * 765313669; i++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i])).anObject9081));
			if (class456_sub1_sub2_sub3_sub1.aBool11612 && class456_sub1_sub2_sub3_sub1.method10531(-60987000) != -1) {
				int i_289_ = (class456_sub1_sub2_sub3_sub1.method10556((short) -14619) - 1) * 256 + 252;
				Class240 class240 = class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647;
				int i_290_ = (int) class240.aFloat2653 - i_289_ >> 9;
				int i_291_ = (int) class240.aFloat2657 - i_289_ >> 9;
				Entity class456_sub1_sub2_sub3 = Class249.method3438((class456_sub1_sub2_sub3_sub1.aByte9009), i_290_, i_291_, (byte) 21);
				if (null != class456_sub1_sub2_sub3) {
					int i_292_ = class456_sub1_sub2_sub3.anInt11633 * -821391465;
					if (class456_sub1_sub2_sub3 instanceof NPC)
						i_292_ += 2048;
					if (0 == 598264067 * class456_sub1_sub2_sub3.anInt11613 && (class456_sub1_sub2_sub3.method10531(-60987000) != -1)) {
						anIntArray8700[anInt8836 * -643403915] = i_292_;
						anIntArray8656[-643403915 * anInt8836] = i_292_;
						anInt8836 += -925259555;
						class456_sub1_sub2_sub3.anInt11613 += -1222973013;
					}
					anIntArray8700[anInt8836 * -643403915] = i_292_;
					anIntArray8656[-643403915 * anInt8836] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633 + 2048);
					anInt8836 += -925259555;
					class456_sub1_sub2_sub3.anInt11613 += -1222973013;
				}
			}
		}
		Class530.method6335(anIntArray8656, anIntArray8700, 0, -643403915 * anInt8836 - 1, -310625179);
	}

	static final void method8049() {
		int[][] is = aClass613_8605.method7356(-691805555);
		int i = aClass613_8605.method7347(522495113);
		int i_293_ = aClass613_8605.method7278(277214477);
		for (int i_294_ = 0; i_294_ < i; i_294_++) {
			int[] is_295_ = is[i_294_];
			for (int i_296_ = 0; i_296_ < i_293_; i_296_++)
				is_295_[i_296_] = 0;
		}
	}

	static final void method8050() {
		anInt8836 = 0;
		for (int i = 0; i < anInt8625 * 765313669; i++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i])).anObject9081));
			if (class456_sub1_sub2_sub3_sub1.aBool11612 && class456_sub1_sub2_sub3_sub1.method10531(-60987000) != -1) {
				int i_297_ = ((class456_sub1_sub2_sub3_sub1.method10556((short) -1017) - 1) * 256 + 252);
				Class240 class240 = class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647;
				int i_298_ = (int) class240.aFloat2653 - i_297_ >> 9;
				int i_299_ = (int) class240.aFloat2657 - i_297_ >> 9;
				Entity class456_sub1_sub2_sub3 = Class249.method3438((class456_sub1_sub2_sub3_sub1.aByte9009), i_298_, i_299_, (byte) 27);
				if (null != class456_sub1_sub2_sub3) {
					int i_300_ = class456_sub1_sub2_sub3.anInt11633 * -821391465;
					if (class456_sub1_sub2_sub3 instanceof NPC)
						i_300_ += 2048;
					if (0 == 598264067 * class456_sub1_sub2_sub3.anInt11613 && (class456_sub1_sub2_sub3.method10531(-60987000) != -1)) {
						anIntArray8700[anInt8836 * -643403915] = i_300_;
						anIntArray8656[-643403915 * anInt8836] = i_300_;
						anInt8836 += -925259555;
						class456_sub1_sub2_sub3.anInt11613 += -1222973013;
					}
					anIntArray8700[anInt8836 * -643403915] = i_300_;
					anIntArray8656[-643403915 * anInt8836] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633 + 2048);
					anInt8836 += -925259555;
					class456_sub1_sub2_sub3.anInt11613 += -1222973013;
				}
			}
		}
		Class530.method6335(anIntArray8656, anIntArray8700, 0, -643403915 * anInt8836 - 1, -1033588234);
	}

	final void method6901() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class619.aClass73_8062 = new InterfaceDefinitions();
		Class102_Sub5.method9947(-640365045);
		Class286.method3865(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, -955267449);
		Class240.method3304(100);
		Class230.method3190(10);
		Class106.method2053(100, -1651724813);
		Class489.method5843(100, -279054808);
		if (Class434.aClass434_5044 != Class151.aClass434_1702)
			Class613.aByteArrayArray8033 = new byte[50][];
		Class213.aClass572_Sub24_2463 = Class346.method4333((byte) 83);
		if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(724185048) == 1)
			Class523.aBool5831 = false;
		switch (Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(-1655545370)) {
			case 3:
				Class200.aBool2388 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 1356727183);
				Class300.method3993(Class257.aClass257_2779, 1770597432);
				break;
			case 4:
				Class200.aBool2389 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 1337213641);
				Class300.method3993(Class257.aClass257_2778, 1913078385);
				break;
		}
		if (Class151.aClass434_1702 == Class434.aClass434_5044)
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
		else if (Class151.aClass434_1702.method5252(Class440.aClass440_5094, 1245694942)) {
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
			Class633.aClass641_8203.port = -984285601 * Class633.aClass641_8203.id + -1352120000;
			Class633.aClass641_8203.securePort = 974886224 + Class633.aClass641_8203.id * -172050845;
		} else if (Class434.aClass434_5047 == Class151.aClass434_1702) {
			Class633.aClass641_8203.address = Class3.aString27;
			Class633.aClass641_8208.address = Class3.aString27;
			Class633.aClass641_8196.address = Class3.aString27;
			Class633.aClass641_8203.port = Class633.aClass641_8203.id * -984285601 + -1352120000;
			Class633.aClass641_8203.securePort = Class633.aClass641_8203.id * -172050845 + 974886224;
		}
		MaterialInformation.method1604(-1247707285);
		Class633.aClass641_8197 = Class633.aClass641_8203;
		Class540.aClass267_6063 = new Class267();
		Class51.aClass278_491 = new Class278_Sub1();
		Class72.aClass617_721 = new Class617(Class633.aClass641_8196.address, Class633.aClass641_8196.method7600(1454461282), aClass437_8705.anInt5076 * 1002594281);
		if (aClass437_8705 == Class437.aClass437_5072)
			aBool8847 = false;
		Class565.aShortArray6361 = ObjectDefinitions.aShortArray5606 = NPCDefintion.aShortArray4796 = ItemDefinitions.aShortArray8151 = new short[256];
		try {
			Class602.aClipboard7878 = Class591_Sub5.method8786((byte) 10).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class108.aClass549_1426 = Class191.method2891(aCanvas7745, (short) -20780);
		Class26.aClass564_216 = Class494.method5903(aCanvas7745, true, 1985907000);
		if (aClass643_7752 != null)
			Class224_Sub1.aClass558_9492 = new Class558(255, aClass643_7752, aClass643_7761, 2000000);
		Class133_Sub1.aClass411_Sub1_9827 = new Class411_Sub1(aClass5_8876);
		try {
			Class133_Sub1.aClass411_Sub1_9827.method5037(Class409.aClass409_4783, 244466402);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4971(Class416.aClass416_4931, false, -1493201475);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4980(Class240.method3316(99999.0F, 99999.0F, 99999.0F), -1654629667);
			Class133_Sub1.aClass411_Sub1_9827.method4976(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (short) -14763);
			Class133_Sub1.aClass411_Sub1_9827.method4979(Class240.method3316(99999.0F, 99999.0F, 99999.0F), (byte) 53);
			Class133_Sub1.aClass411_Sub1_9827.method5024(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -362850233);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class333.method4180(VarTransmitLevel.anApplet8067, Class572_Sub12_Sub2.aString11255, -1658959500);
		if (Class434.aClass434_5044 != Class151.aClass434_1702 && Class151.aClass434_1702 != Class434.aClass434_5048)
			aBool8874 = true;
		aString7744 = Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935);
		Class204.aClass602_2411 = new Class602();
		new Thread(Class204.aClass602_2411).start();
		Class483.aClass10_5388 = new Class10();
	}

	static final void method8051() {
		for (Class572_Sub12_Sub6 class572_sub12_sub6 = (Class572_Sub12_Sub6) aClass675_8774.method7932((byte) 50); class572_sub12_sub6 != null; class572_sub12_sub6 = ((Class572_Sub12_Sub6) aClass675_8774.method7926(979724126))) {
			Class456_Sub1_Sub2_Sub5 class456_sub1_sub2_sub5 = (((Class572_Sub12_Sub6) class572_sub12_sub6).aClass456_Sub1_Sub2_Sub5_11367);
			if (cycles > class456_sub1_sub2_sub5.anInt11739 * 1095263993) {
				class572_sub12_sub6.method6794((byte) -13);
				class456_sub1_sub2_sub5.method10642((byte) -21);
			} else if (cycles >= class456_sub1_sub2_sub5.anInt11748 * 1176691683) {
				class456_sub1_sub2_sub5.method10637(1717594740);
				if (2125689013 * class456_sub1_sub2_sub5.anInt11759 > 0) {
					if (4 == 1797623853 * anInt8646) {
						Entity class456_sub1_sub2_sub3 = Class122.aClass130Array1483[(2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1].method2268(703349239);
						if (class456_sub1_sub2_sub3 != null) {
							Class240 class240 = (class456_sub1_sub2_sub3.method5394().aClass240_2647);
							if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < (aClass613_8605.method7347(1500817240) * 512)) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < (aClass613_8605.method7278(277214477) * 512)))
								class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub3.aByte9009, -1866875700)) - (class456_sub1_sub2_sub5.anInt11741 * 1284627787)), cycles, (byte) -14);
						}
					} else {
						LinkableObject class572_sub9 = ((LinkableObject) (aClass676_8622.get((long) ((2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1))));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240 = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
							if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < (aClass613_8605.method7347(1693773849) * 512)) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < (aClass613_8605.method7278(277214477) * 512)))
								class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, ((Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub5.aByte9009, -2076464074)) - 1284627787 * (class456_sub1_sub2_sub5.anInt11741)), cycles, (byte) -80);
						}
					}
				}
				if (class456_sub1_sub2_sub5.anInt11759 * 2125689013 < 0) {
					int i = (-(2125689013 * class456_sub1_sub2_sub5.anInt11759) - 1);
					Player class456_sub1_sub2_sub3_sub2;
					if (-1921142451 * anInt8728 == i)
						class456_sub1_sub2_sub3_sub2 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976;
					else
						class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i];
					if (null != class456_sub1_sub2_sub3_sub2) {
						Class240 class240 = (class456_sub1_sub2_sub3_sub2.method5394().aClass240_2647);
						if ((int) class240.aFloat2653 >= 0 && ((int) class240.aFloat2653 < aClass613_8605.method7347(444506215) * 512) && (int) class240.aFloat2657 >= 0 && ((int) class240.aFloat2657 < aClass613_8605.method7278(277214477) * 512))
							class456_sub1_sub2_sub5.method10636((int) class240.aFloat2653, (int) class240.aFloat2657, (Class314.method4072((int) (class240.aFloat2653), (int) (class240.aFloat2657), (class456_sub1_sub2_sub5.aByte9009), -2027008505) - (class456_sub1_sub2_sub5.anInt11741 * 1284627787)), cycles, (byte) -96);
					}
				}
				class456_sub1_sub2_sub5.method10640(855188961 * anInt8674, (byte) -5);
				aClass613_8605.method7285(1685056510).method6232(class456_sub1_sub2_sub5, true, 769627053);
			}
		}
	}

	static final void method8052() {
		int i = 0;
		Class523 class523 = aClass613_8605.method7285(1809597892);
		for (int i_301_ = 0; i_301_ < aClass613_8605.method7347(1560603171); i_301_++) {
			for (int i_302_ = 0; i_302_ < aClass613_8605.method7278(277214477); i_302_++) {
				if (Class406.method4926(class523.aClass536ArrayArrayArray5882, i, i_301_, i_302_, true, (short) 211))
					i++;
				if (i >= 512)
					return;
			}
		}
	}

	static final void method8053() {
		Iterator iterator = aClass676_8747.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub9 class572_sub12_sub9 = (Class572_Sub12_Sub9) iterator.next();
			Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390);
			class456_sub1_sub2_sub4.method10596(1, -699417059);
			if (class456_sub1_sub2_sub4.method10613((byte) -4)) {
				class572_sub12_sub9.method6794((byte) 91);
				class456_sub1_sub2_sub4.method10601(-1778760401);
			}
		}
	}

	static final void method8054() {
		Iterator iterator = aClass676_8747.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub9 class572_sub12_sub9 = (Class572_Sub12_Sub9) iterator.next();
			Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390);
			class456_sub1_sub2_sub4.method10596(1, -1394475805);
			if (class456_sub1_sub2_sub4.method10613((byte) 9)) {
				class572_sub12_sub9.method6794((byte) 38);
				class456_sub1_sub2_sub4.method10601(-1867078727);
			}
		}
	}

	static final void method8055() {
		Iterator iterator = aClass676_8747.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub9 class572_sub12_sub9 = (Class572_Sub12_Sub9) iterator.next();
			Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (((Class572_Sub12_Sub9) class572_sub12_sub9).aClass456_Sub1_Sub2_Sub4_11390);
			if (aClass613_8605.method7285(1575363962) != null && class456_sub1_sub2_sub4.method10599(1437902807))
				aClass613_8605.method7285(1350493924).method6232(class456_sub1_sub2_sub4, true, -2034670156);
		}
	}

	static final void method8056() {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub1_9201.method8101(-1458164656) == 2) {
			byte[][][] is = aClass613_8605.method7346((byte) 85);
			byte i = (byte) (anInt8699 * 2074321681 - 4 & 0xff);
			int i_303_ = (2074321681 * anInt8699 % aClass613_8605.method7347(1725291228));
			for (int i_304_ = 0; i_304_ < 4; i_304_++) {
				for (int i_305_ = 0; i_305_ < aClass613_8605.method7278(277214477); i_305_++)
					is[i_304_][i_303_][i_305_] = i;
			}
			if (Class274.anInt2911 * -374189215 != 3) {
				for (int i_306_ = 0; i_306_ < 2; i_306_++) {
					anIntArray8701[i_306_] = -1000000;
					anIntArray8716[i_306_] = 1000000;
					anIntArray8717[i_306_] = 0;
					anIntArray8719[i_306_] = 1000000;
					anIntArray8718[i_306_] = 0;
				}
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class274 class274 = aClass613_8605.method7287((byte) 41);
				Class523 class523 = aClass613_8605.method7285(1394018376);
				if (4 == Class18.anInt143 * 625220759 || 625220759 * Class18.anInt143 == 1 || -1 != Class566.anInt6375 * -774947377) {
					Class497 class497 = aClass613_8605.method7280((byte) -43);
					int i_307_;
					int i_308_;
					if (Class18.anInt143 * 625220759 == 1) {
						Class240 class240_309_ = Class133_Sub1.aClass411_Sub1_9827.method4991(-589573040).method7745(-484329303);
						if (Float.isNaN(class240_309_.aFloat2653))
							return;
						i_307_ = ((int) class240_309_.aFloat2653 - (-2109597897 * class497.localX << 9));
						i_308_ = ((int) class240_309_.aFloat2657 - (417324155 * class497.localY << 9));
						if (i_307_ < 0 || i_308_ < 0 || (i_307_ >> 9 >= (class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215]).length) || (i_308_ >> 9 >= (class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_307_ >> 9]).length))
							return;
					} else if (4 == 625220759 * Class18.anInt143) {
						i_307_ = (int) class240.aFloat2653;
						i_308_ = (int) class240.aFloat2657;
					} else {
						i_307_ = Class566.anInt6375 * -774947377;
						i_308_ = -1040360777 * Class419.anInt4958;
					}
					if (((class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_307_ >> 9][i_308_ >> 9]) & 0x4) != 0)
						Class406.method4926((class523.aClass536ArrayArrayArray5882), 0, i_307_ >> 9, i_308_ >> 9, false, (short) 211);
					else {
						int i_310_;
						int i_311_;
						if (1 == 625220759 * Class18.anInt143) {
							Class240 class240_312_ = Class133_Sub1.aClass411_Sub1_9827.method4990((byte) -77).method5159((byte) -128);
							i_310_ = (((int) class240_312_.aFloat2653 >> 9) - -2109597897 * class497.localX);
							i_311_ = (((int) class240_312_.aFloat2657 >> 9) - class497.localY * 417324155);
							if (i_310_ < 0 || i_311_ < 0 || i_310_ >= (class274.aByteArrayArrayArray2909[(Class274.anInt2911 * -374189215)]).length || i_311_ >= (class274.aByteArrayArrayArray2909[-374189215 * Class274.anInt2911][i_310_]).length)
								return;
						} else {
							i_310_ = 386814715 * Class36.anInt387 >> 9;
							i_311_ = Class49.anInt490 * -999214779 >> 9;
						}
						int i_313_ = i_307_ >> 9;
						int i_314_ = i_308_ >> 9;
						if (class274.method3682(i_310_, i_311_, (byte) 55)) {
							int i_315_ = Class314.method4072((386814715 * Class36.anInt387), (-999214779 * Class49.anInt490), 3, -1942555969);
							if (Class572_Sub13_Sub2.anInt11451 * -1094666305 >= i_315_)
								Class406.method4926(class523.aClass536ArrayArrayArray5882, 1, i_310_, i_311_, false, (short) 211);
						} else {
							while_9_: do {
								if (1406555935 * Class455.anInt5187 < 2560) {
									int i_316_;
									if (i_313_ > i_310_)
										i_316_ = i_313_ - i_310_;
									else
										i_316_ = i_310_ - i_313_;
									int i_317_;
									if (i_314_ > i_311_)
										i_317_ = i_314_ - i_311_;
									else
										i_317_ = i_311_ - i_314_;
									if (0 == i_316_ && i_317_ == 0 || (i_316_ <= -aClass613_8605.method7347(-1151586697)) || (i_316_ >= aClass613_8605.method7347(-1574255454)) || (i_317_ <= -aClass613_8605.method7278(277214477)) || (i_317_ >= aClass613_8605.method7278(277214477))) {
										if (1 != Class18.anInt143 * 625220759)
											Class640.method7592(new StringBuilder().append(i_310_).append(Class3.aString23).append(i_311_).append(" ").append(i_313_).append(Class3.aString23).append(i_314_).append(" ").append(class497.localX * -2109597897).append(Class3.aString23).append(class497.localY * 417324155).toString(), new RuntimeException(), 2000794842);
										break;
									}
									if (i_316_ > i_317_) {
										int i_318_ = i_317_ * 65536 / i_316_;
										int i_319_ = 32768;
										while_8_: do {
											for (;;) {
												if (i_313_ == i_310_)
													break while_8_;
												if (i_310_ < i_313_)
													i_310_++;
												else if (i_310_ > i_313_)
													i_310_--;
												if (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_310_][i_311_]) & 0x4)) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_, i_311_, false, (short) 211);
													break while_8_;
												}
												if ((i_311_ + 1 < (class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_310_]).length) && (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_310_][1 + i_311_]) & 0x4))) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_, 1 + i_311_, false, (short) 211);
													break while_8_;
												}
												if (i_311_ > 0 && ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_310_][i_311_ - 1]) & 0x4) != 0) {
													Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_, i_311_ - 1, false, (short) 211);
													break while_8_;
												}
												i_319_ += i_318_;
												if (i_319_ >= 65536) {
													i_319_ -= 65536;
													if (i_311_ < i_314_) {
														if ((++i_311_ + 1 < (class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_310_]).length) && (0 != ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_310_][(i_311_ + 1)]) & 0x4))) {
															Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_, i_311_ + 1, false, (short) 211);
															break while_8_;
														}
													} else if (i_311_ > i_314_ && --i_311_ > 0 && ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_310_][(i_311_ - 1)]) & 0x4) != 0)
														break;
												}
											}
											Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_, i_311_ - 1, false, (short) 211);
										} while (false);
									} else {
										int i_320_ = i_316_ * 65536 / i_317_;
										int i_321_ = 32768;
										for (;;) {
											if (i_311_ == i_314_)
												break while_9_;
											if (i_311_ < i_314_)
												i_311_++;
											else if (i_311_ > i_314_)
												i_311_--;
											if (((class274.aByteArrayArrayArray2909[(Class274.anInt2911 * -374189215)][i_310_][i_311_]) & 0x4) != 0) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_, i_311_, false, (short) 211);
												break while_9_;
											}
											if ((i_310_ + 1 < (class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))]).length) && (0 != ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][1 + i_310_][i_311_]) & 0x4))) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_ + 1, i_311_, false, (short) 211);
												break while_9_;
											}
											if (i_310_ > 0 && ((class274.aByteArrayArrayArray2909[(-374189215 * Class274.anInt2911)][i_310_ - 1][i_311_]) & 0x4) != 0) {
												Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_ - 1, i_311_, false, (short) 211);
												break while_9_;
											}
											i_321_ += i_320_;
											if (i_321_ >= 65536) {
												i_321_ -= 65536;
												if (i_310_ < i_313_) {
													i_310_++;
													if ((1 + i_310_ < (class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)]).length) && ((class274.aByteArrayArrayArray2909[(-374189215 * (Class274.anInt2911))][i_310_ + 1][i_311_]) & 0x4) != 0) {
														Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, 1 + i_310_, i_311_, false, (short) 211);
														break while_9_;
													}
												} else if (i_310_ > i_313_ && --i_310_ > 0 && ((class274.aByteArrayArrayArray2909[((Class274.anInt2911) * -374189215)][i_310_ - 1][i_311_]) & 0x4) != 0)
													break;
											}
										}
										Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, i_310_ - 1, i_311_, false, (short) 211);
									}
								}
							} while (false);
						}
					}
				} else {
					int i_322_ = Class314.method4072(386814715 * Class36.anInt387, Class49.anInt490 * -999214779, -374189215 * Class274.anInt2911, -2034467733);
					if ((i_322_ - -1094666305 * Class572_Sub13_Sub2.anInt11451 < 3200) && ((class274.aByteArrayArrayArray2909[Class274.anInt2911 * -374189215][386814715 * Class36.anInt387 >> 9][-999214779 * Class49.anInt490 >> 9]) & 0x4) != 0)
						Class406.method4926((class523.aClass536ArrayArrayArray5882), 1, Class36.anInt387 * 386814715 >> 9, Class49.anInt490 * -999214779 >> 9, false, (short) 211);
				}
			}
		}
	}

	static final void method8057() {
		if (-1784648141 * anInt8604 > 1) {
			anInt8604 -= -425706245;
			anInt8729 = 653930141 * anInt8839;
		}
		if (aClass195_8589.aBool2344) {
			aClass195_8589.aBool2344 = false;
			Class113.method2092(1650634977);
		} else {
			if (!Class25.aBool165)
				Class345.method4317((byte) -100);
			for (int i = 0; i < 100 && MaterialInformation.method1605(aClass195_8589, -1137362161); i++) {
				/* empty */
			}
			if (1 == 835742603 * anInt8580) {
				while (Class344.method4315((byte) 78)) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3753, aClass195_8589.aClass650_2340, 330068747);
					class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
					int i = (class572_sub25.aRsByteBuffer.o * -1585139053);
					Class190.method2889((class572_sub25.aRsByteBuffer), 48748209);
					class572_sub25.aRsByteBuffer.method8552((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i), 763223344);
					aClass195_8589.method2929(class572_sub25, (byte) -102);
				}
				if (null != Class273.aClass461_2902) {
					if (633548015 * Class273.aClass461_2902.anInt5216 != -1) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.GC_PACKET, (aClass195_8589.aClass650_2340), -1710850075);
						if (Class65.aGarbageCollectorMXBean685 == null || !Class65.aGarbageCollectorMXBean685.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class65.aGarbageCollectorMXBean685 = garbagecollectormxbean;
										aLong8875 = -6094611317542751281L;
										aLong8737 = -5272074439168099041L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class69.method1067(-1997078966);
						int i = -1;
						if (null != Class65.aGarbageCollectorMXBean685) {
							long l_323_ = Class65.aGarbageCollectorMXBean685.getCollectionTime();
							if (aLong8737 * 7147685318279086369L != -1L) {
								long l_324_ = (l_323_ - 7147685318279086369L * aLong8737);
								long l_325_ = l - 2681765377846398161L * aLong8875;
								if (0L != l_325_)
									i = (int) (l_324_ * 100L / l_325_);
							}
							aLong8737 = 5272074439168099041L * l_323_;
							aLong8875 = 6094611317542751281L * l;
						}
						class572_sub25.aRsByteBuffer.writeByteC(i, (byte) 12);
						class572_sub25.aRsByteBuffer.writeByte128(-267830063 * anInt7734, -673567872);
						class572_sub25.aRsByteBuffer.writeShort128(633548015 * Class273.aClass461_2902.anInt5216, -16711936);
						aClass195_8589.method2929(class572_sub25, (byte) -75);
						Class273.aClass461_2902 = null;
						Class324.aLong4087 = (l + 30000L) * 5143952497543217671L;
					}
				} else if (Class69.method1067(-1784492390) >= -5049570460082517065L * Class324.aLong4087)
					Class273.aClass461_2902 = aClass455_8759.method5379((Class633.aClass641_8197.address), -918474401);
				Class563.method6649((byte) 1);
				Class382.method4650(-2025616070);
				Class572_Sub13 class572_sub13 = (Class572_Sub13) aClass675_8745.method7932((byte) 50);
				if (aClass613_8605.method7285(1579667517) != null) {
					if (5 == 625220759 * Class18.anInt143)
						Class444.method5331((byte) 80);
					else if (625220759 * Class18.anInt143 == 3)
						Class540.method6417((byte) 93);
				}
				if (aBool8681)
					aBool8681 = false;
				else
					aFloat8660 /= 2.0F;
				if (aBool8682)
					aBool8682 = false;
				else
					aFloat8679 /= 2.0F;
				if (IncomingPacket.method4113((byte) -52))
					Class572_Sub36.method8756(1021239730);
				else if (Class18.anInt143 * 625220759 == 1) {
					Class497 class497 = aClass613_8605.method7280((byte) -61);
					int i = class497.localX * -2109597897 << 9;
					int i_326_ = class497.localY * 417324155 << 9;
					if (Class218.aLong2511 * -1389695526323027701L <= 0L)
						Class218.aLong2511 = (Class69.method1067(-2129405257) * 8241051270684000931L);
					float f = (float) (Class69.method1067(-1918477866) - (Class218.aLong2511 * -1389695526323027701L));
					int i_327_ = 1000 / Class425.method5176(499586779);
					i_327_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_327_) {
						float f_328_ = Math.min(f, (float) i_327_);
						Class133_Sub1.aClass411_Sub1_9827.method5012(f_328_ / 1000.0F, (aClass613_8605.method7293(807816887).anIntArrayArrayArray3141), aClass613_8605.method7287((byte) 113), i, i_326_, (byte) -26);
					}
					Class218.aLong2511 = (Class69.method1067(-1646219876) * 8241051270684000931L);
				}
				Class298.method3974(-1313538158);
				if (anInt8580 * 835742603 == 1) {
					aClass613_8605.method7306(-1042067865).method5978(aClass613_8605, 208956755);
					Class624.method7451(-1694327572);
					if (-599981499 * anInt8620 > 10)
						((Class195) aClass195_8589).anInt2335 += 707314625;
					if (((Class195) aClass195_8589).anInt2335 * 1070156865 > 2250)
						Class113.method2092(1603690908);
					else {
						if (1797623853 * anInt8646 == 0) {
							Class589.method6993((byte) 0);
							Class194.method2924((byte) -33);
						} else if (Class102_Sub2.aClass494_10268.anInterface57_5489.method320(class572_sub13, anInterface64Array8610, anInt8609 * 2134888631, Class108.aClass549_1426, -2060979366))
							Class133_Sub4.method9339(false, -1363580480);
						else {
							if (2 == anInt8646 * 1797623853 && Class255.method3522(anInt8645 * 1545763299, 1615140874)) {
								aClass613_8605.method7348(new Class598(Class569.aClass569_6394, null), -409884702);
								anInt8646 = 432127727;
							}
							if (1797623853 * anInt8646 == 3 && 18 != anInt8580 * 835742603) {
								Class122.aClass676_1485.method7964((byte) 39);
								anInt8646 = 2007826068;
								anInt8648 = cycles * -1389120501;
								anInt8649 = 0;
								aBool8647 = false;
								Class198.method2976(1770365126);
							}
							if (4 == 1797623853 * anInt8646) {
								int i = cycles - 2129803171 * anInt8648;
								if (-1287240229 * anInt8649 < Class122.aClass133Array1481.length) {
									do {
										Class133 class133 = (Class122.aClass133Array1481[anInt8649 * -1287240229]);
										if (class133.anInt1566 * -762660985 > i)
											break;
										class133.method2303(1010597026);
									} while (anInt8646 * 1797623853 == 4 && (((anInt8649 += 807284307) * -1287240229) < (Class122.aClass133Array1481).length));
								}
								if (4 == anInt8646 * 1797623853) {
									for (int i_329_ = 0; i_329_ < (Class122.aClass130Array1483).length; i_329_++) {
										Class130 class130 = (Class122.aClass130Array1483[i_329_]);
										if (class130.aBool1529) {
											Entity class456_sub1_sub2_sub3 = class130.method2268(-269859185);
											Class461.method5469(class456_sub1_sub2_sub3, true, 1156533870);
										}
									}
								}
							}
						}
						Class676.method7976(-1081473913);
						Class433.method5249(743682542);
						Class603.method7145(-1135134395);
						Class71.method1084(false, (byte) -74);
						Class572_Sub16.method8567(Class272_Sub2.aClass106_9517, (Class456_Sub1_Sub3_Sub2.aClass94_11589), 1992532294);
						anInt8674 += 237624865;
						if (0 != 1251161273 * anInt8606) {
							anInt8803 += 1970875452;
							if (-311274581 * anInt8803 >= 400)
								anInt8606 = 0;
						}
						if (Class323.aClass73_4080 != null) {
							anInt8710 += -904830707;
							if (anInt8710 * 1766020549 >= 15) {
								Class555.method6575(Class323.aClass73_4080, (short) 8335);
								Class323.aClass73_4080 = null;
							}
						}
						aClass73_8603 = null;
						aBool8780 = false;
						aBool8775 = false;
						Class383.aClass73_4610 = null;
						Class296.method3964(null, -1, -1, 669894636);
						if (!aBool8754)
							anInt8751 = 1983555971;
						Class514.method6093(2112762867);
						anInt8839 += -1210150071;
						if (aBool8786) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3710, (aClass195_8589.aClass650_2340), -859687320);
							class572_sub25.aRsByteBuffer.writeIntV2((Class612.anInt7988 * -36891819 << 28 | Class498.anInt5510 * 863160757 << 14 | Class665_Sub22.anInt9601 * -1817958735), (byte) 1);
							aClass195_8589.method2929(class572_sub25, (byte) -8);
							aBool8786 = false;
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8813.method7920(-1945803963));
							if (class572_sub20 == null)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (class73.activeComponent * -1665128073 >= 0) {
								InterfaceDefinitions class73_330_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -21899);
								if (null == class73_330_ || class73_330_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= (class73_330_.aClass73Array916).length) || ((class73_330_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2059612085);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8884.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_331_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 695);
								if (null == class73_331_ || null == class73_331_.aClass73Array916 || (class73.activeComponent * -1665128073 >= (class73_331_.aClass73Array916).length) || ((class73_331_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -1963546661);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8812.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_332_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -3131);
								if (class73_332_ == null || class73_332_.aClass73Array916 == null || (-1665128073 * class73.activeComponent >= (class73_332_.aClass73Array916).length) || (class73 != (class73_332_.aClass73Array916[-1665128073 * class73.activeComponent])))
									continue;
							}
							Class34.executeCs2(class572_sub20, -1959063341);
						}
						if (Class383.aClass73_4610 == null)
							anInt8844 = 0;
						if (aClass73_8770 != null)
							Class122.method2197(-2030861897);
						Class15.method654(-443685701);
						if (-1550439133 * rights > 0 && Class108.aClass549_1426.method6514(82, (byte) 1) && Class108.aClass549_1426.method6514(81, (byte) 1) && anInt8787 * -1840536699 != 0) {
							int i = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) - -1840536699 * anInt8787);
							if (i < 0)
								i = 0;
							else if (i > 3)
								i = 3;
							Class497 class497 = aClass613_8605.method7280((byte) -27);
							Class21.method703(i, (class497.localX * -2109597897 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0])), (417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])), -1422901640);
						}
						for (int i = 0; i < 5; i++)
							anIntArray8597[i]++;
						if (Class306.clientConfigsDomain.aBool10652 && ((Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L) < Class69.method1067(-1880156311) - 60000L))
							Class614.method7367(239906896);
						Class306.clientConfigsDomain.method9968((byte) 0);
						for (Class591_Sub1 class591_sub1 = ((Class591_Sub1) aClass652_8864.method7697(-542489430)); null != class591_sub1; class591_sub1 = ((Class591_Sub1) aClass652_8864.method7698(102898475))) {
							if ((long) (-1160847613 * (((Class591_Sub1) class591_sub1).anInt9180)) < (Class69.method1067(-1667749403) / 1000L - 5L)) {
								if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 1851884621);
								if (0 == (((Class591_Sub1) class591_sub1).aShort9181))
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 2115879455);
								class591_sub1.method7002((byte) 64);
							}
						}
						anInt8819 += 745021087;
						if (anInt8819 * -34112161 > 502) {
							anInt8819 = 0;
							int i = (int) (Math.random() * 8.0);
							if (1 == (i & 0x1))
								anInt8877 += -19134435 * anInt8662;
							if (2 == (i & 0x2))
								anInt8663 += anInt8664 * -1977461499;
							if ((i & 0x4) == 4)
								anInt8665 += -139987683 * anInt8666;
						}
						if (-1037352299 * anInt8877 < -55)
							anInt8662 = -87875006;
						if (anInt8877 * -1037352299 > 54)
							anInt8662 = 87875006;
						if (713494119 * anInt8663 < -55)
							anInt8664 = -2093052074;
						if (anInt8663 * 713494119 > 55)
							anInt8664 = 2093052074;
						if (-706438965 * anInt8665 < -42)
							anInt8666 = 1972333055;
						if (-706438965 * anInt8665 > 44)
							anInt8666 = -1972333055;
						anInt8672 += -1809977439;
						if (anInt8672 * -1605651359 > 505) {
							anInt8672 = 0;
							int i = (int) (Math.random() * 8.0);
							if ((i & 0x1) == 1)
								anInt8766 += 1104829617 * anInt8846;
							if (2 == (i & 0x2))
								anInt8670 += 151185977 * anInt8671;
						}
						if (anInt8766 * -777638353 < -61)
							anInt8846 = -410395906;
						if (anInt8766 * -777638353 > 65)
							anInt8846 = 410395906;
						if (anInt8670 * -1034566343 < -21)
							anInt8671 = 255419729;
						if (-1034566343 * anInt8670 > 12)
							anInt8671 = -255419729;
						aClass195_8589.anInt2337 += 394568993;
						if (aClass195_8589.anInt2337 * -1242489119 > 50) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, (aClass195_8589.aClass650_2340), 211708972);
							aClass195_8589.method2929(class572_sub25, (byte) -59);
						}
						if (aBool8573) {
							Class425.method5177((short) 21551);
							aBool8573 = false;
						}
						try {
							aClass195_8589.method2936((byte) -21);
						} catch (IOException ioexception) {
							Class113.method2092(1863068104);
						}
					}
				}
			}
		}
	}

	static final void method8058() {
		Class508.method6038(Class272_Sub2.aClass106_9517, (long) cycles);
		if (-1 != -507155049 * anInt8790)
			Class244.method3347(anInt8790 * -507155049, 1970456419);
		for (int i = 0; i < anInt8560 * 983810053; i++) {
			aBoolArray8820[i] = aBoolArray8784[i];
			aBoolArray8784[i] = false;
		}
		anInt8818 = -1851859609 * cycles;
		if (anInt8790 * -507155049 != -1) {
			anInt8560 = 0;
			Class126.method2220((byte) -80);
		}
		Class272_Sub2.aClass106_9517.method1714();
		Class418.method5108(Class272_Sub2.aClass106_9517, (byte) -66);
		int i = Class15.method652(-1280128442);
		if (-1 == i)
			i = -646491435 * anInt8751;
		if (-1 == i)
			i = anInt8750 * 415097709;
		GraphicsDefinition.method7772(i, -1447681941);
		anInt8674 = 0;
	}

	static final void method8059() {
		anInt8836 = 0;
		for (int i = 0; i < anInt8625 * 765313669; i++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i])).anObject9081));
			if (class456_sub1_sub2_sub3_sub1.aBool11612 && class456_sub1_sub2_sub3_sub1.method10531(-60987000) != -1) {
				int i_333_ = (class456_sub1_sub2_sub3_sub1.method10556((short) -27446) - 1) * 256 + 252;
				Class240 class240 = class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647;
				int i_334_ = (int) class240.aFloat2653 - i_333_ >> 9;
				int i_335_ = (int) class240.aFloat2657 - i_333_ >> 9;
				Entity class456_sub1_sub2_sub3 = Class249.method3438((class456_sub1_sub2_sub3_sub1.aByte9009), i_334_, i_335_, (byte) 68);
				if (null != class456_sub1_sub2_sub3) {
					int i_336_ = class456_sub1_sub2_sub3.anInt11633 * -821391465;
					if (class456_sub1_sub2_sub3 instanceof NPC)
						i_336_ += 2048;
					if (0 == 598264067 * class456_sub1_sub2_sub3.anInt11613 && (class456_sub1_sub2_sub3.method10531(-60987000) != -1)) {
						anIntArray8700[anInt8836 * -643403915] = i_336_;
						anIntArray8656[-643403915 * anInt8836] = i_336_;
						anInt8836 += -925259555;
						class456_sub1_sub2_sub3.anInt11613 += -1222973013;
					}
					anIntArray8700[anInt8836 * -643403915] = i_336_;
					anIntArray8656[-643403915 * anInt8836] = (-821391465 * class456_sub1_sub2_sub3_sub1.anInt11633 + 2048);
					anInt8836 += -925259555;
					class456_sub1_sub2_sub3.anInt11613 += -1222973013;
				}
			}
		}
		Class530.method6335(anIntArray8656, anIntArray8700, 0, -643403915 * anInt8836 - 1, 792667541);
	}

	static final void method8060() {
		Class572_Sub15_Sub2 class572_sub15_sub2 = ((Class195) aClass195_8589).aClass572_Sub15_Sub2_2330;
		class572_sub15_sub2.method10397(-860683894);
		int i = class572_sub15_sub2.readBits(8, -1809904620);
		if (i < anInt8625 * 765313669) {
			for (int i_337_ = i; i_337_ < anInt8625 * 765313669; i_337_++)
				anIntArray8832[(anInt8869 += 2143290927) * 1412759759 - 1] = anIntArray8626[i_337_];
		}
		if (i > 765313669 * anInt8625)
			throw new RuntimeException();
		anInt8625 = 0;
		for (int i_338_ = 0; i_338_ < i; i_338_++) {
			int i_339_ = anIntArray8626[i_338_];
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) i_339_)).anObject9081));
			int i_340_ = class572_sub15_sub2.readBits(1, -1809904620);
			if (i_340_ == 0) {
				anIntArray8626[(anInt8625 += 1417012813) * 765313669 - 1] = i_339_;
				class456_sub1_sub2_sub3_sub1.anInt11649 = -875697841 * anInt8629;
			} else {
				int i_341_ = class572_sub15_sub2.readBits(2, -1809904620);
				if (i_341_ == 0) {
					anIntArray8626[(anInt8625 += 1417012813) * 765313669 - 1] = i_339_;
					class456_sub1_sub2_sub3_sub1.anInt11649 = anInt8629 * -875697841;
					anIntArray8628[(anInt8627 += -720093963) * 865439581 - 1] = i_339_;
				} else if (1 == i_341_) {
					anIntArray8626[(anInt8625 += 1417012813) * 765313669 - 1] = i_339_;
					class456_sub1_sub2_sub3_sub1.anInt11649 = -875697841 * anInt8629;
					Class661 class661 = ((Class661) (Class455.method5387(Class343.method4304(1876086919), class572_sub15_sub2.readBits(3, -1809904620), -2059761640)));
					class456_sub1_sub2_sub3_sub1.method10682(class661, (Class453.aClass453_5177.aByte5183), (byte) 110);
					int i_342_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (i_342_ == 1)
						anIntArray8628[((anInt8627 += -720093963) * 865439581 - 1)] = i_339_;
				} else if (i_341_ == 2) {
					anIntArray8626[(anInt8625 += 1417012813) * 765313669 - 1] = i_339_;
					class456_sub1_sub2_sub3_sub1.anInt11649 = -875697841 * anInt8629;
					if (class572_sub15_sub2.readBits(1, -1809904620) == 1) {
						Class661 class661 = ((Class661) (Class455.method5387(Class343.method4304(930580695), class572_sub15_sub2.readBits(3, -1809904620), -2043347629)));
						class456_sub1_sub2_sub3_sub1.method10682(class661, Class453.aClass453_5179.aByte5183, (byte) 116);
						Class661 class661_343_ = ((Class661) (Class455.method5387(Class343.method4304(-13050318), class572_sub15_sub2.readBits(3, -1809904620), -2026366634)));
						class456_sub1_sub2_sub3_sub1.method10682(class661_343_, Class453.aClass453_5179.aByte5183, (byte) 50);
					} else {
						Class661 class661 = ((Class661) (Class455.method5387(Class343.method4304(196018689), class572_sub15_sub2.readBits(3, -1809904620), -2031877078)));
						class456_sub1_sub2_sub3_sub1.method10682(class661, Class453.aClass453_5182.aByte5183, (byte) 6);
					}
					int i_344_ = class572_sub15_sub2.readBits(1, -1809904620);
					if (1 == i_344_)
						anIntArray8628[((anInt8627 += -720093963) * 865439581 - 1)] = i_339_;
				} else if (i_341_ == 3)
					anIntArray8832[(anInt8869 += 2143290927) * 1412759759 - 1] = i_339_;
			}
		}
	}

	public static void method8061() {
		if (aBool8754) {
			InterfaceDefinitions class73 = Class530.method6338(Class167.interfaceHash * -806385553, 654388253 * anInt8755, 1205972489);
			if (class73 != null && null != class73.anObjectArray869) {
				Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
				class572_sub20.thizInterface = class73;
				class572_sub20.params = class73.anObjectArray869;
				Class34.executeCs2(class572_sub20, -1940621894);
			}
			anInt8751 = 1983555971;
			anInt8756 = 304478591;
			aBool8754 = false;
			if (null != class73)
				Class555.method6575(class73, (short) 26563);
		}
	}

	public static void method8062() {
		if (aBool8754) {
			InterfaceDefinitions class73 = Class530.method6338(Class167.interfaceHash * -806385553, 654388253 * anInt8755, -944534680);
			if (class73 != null && null != class73.anObjectArray869) {
				Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
				class572_sub20.thizInterface = class73;
				class572_sub20.params = class73.anObjectArray869;
				Class34.executeCs2(class572_sub20, -2018918984);
			}
			anInt8751 = 1983555971;
			anInt8756 = 304478591;
			aBool8754 = false;
			if (null != class73)
				Class555.method6575(class73, (short) 16331);
		}
	}

	static final void method8063(int i) {
		int i_345_ = Class184.anInt2163 * 1657484935;
		int[] is = Class184.anIntArray2154;
		int[][] is_346_ = aClass613_8605.method7356(-1454231783);
		int[][] is_347_ = aClass613_8605.method7290(-1392295840);
		int i_348_;
		if (4 == anInt8646 * 1797623853)
			i_348_ = Class122.aClass130Array1483.length;
		else
			i_348_ = aBool8633 ? i_345_ : i_345_ + anInt8625 * 765313669;
		for (int i_349_ = 0; i_349_ < i_348_; i_349_++) {
			Entity class456_sub1_sub2_sub3;
			if (4 == 1797623853 * anInt8646) {
				Class130 class130 = Class122.aClass130Array1483[i_349_];
				if (!class130.aBool1529)
					continue;
				class456_sub1_sub2_sub3 = class130.method2268(-1246745283);
			} else {
				if (i_349_ < i_345_)
					class456_sub1_sub2_sub3 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_349_]];
				else
					class456_sub1_sub2_sub3 = ((Entity) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[(i_349_ - i_345_)])).anObject9081));
				if (class456_sub1_sub2_sub3.aByte9009 != i)
					continue;
				if (class456_sub1_sub2_sub3.anInt11646 * 1371302107 < 0) {
					class456_sub1_sub2_sub3.aBool11612 = false;
					continue;
				}
			}
			class456_sub1_sub2_sub3.anInt11613 = 0;
			int i_350_ = class456_sub1_sub2_sub3.method10556((short) -5535);
			Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
			if ((i_350_ & 0x1) == 0) {
				if (((int) class240.aFloat2653 & 0x1ff) != 0 || ((int) class240.aFloat2657 & 0x1ff) != 0) {
					class456_sub1_sub2_sub3.aBool11612 = false;
					continue;
				}
			} else if (256 != ((int) class240.aFloat2653 & 0x1ff) || 256 != ((int) class240.aFloat2657 & 0x1ff)) {
				class456_sub1_sub2_sub3.aBool11612 = false;
				continue;
			}
			if (4 != anInt8646 * 1797623853) {
				if (i_350_ == 1) {
					int i_351_ = (int) class240.aFloat2653 >> 9;
					int i_352_ = (int) class240.aFloat2657 >> 9;
					if (1371302107 * class456_sub1_sub2_sub3.anInt11646 != is_346_[i_351_][i_352_]) {
						class456_sub1_sub2_sub3.aBool11612 = true;
						continue;
					}
					if (is_347_[i_351_][i_352_] > 1) {
						is_347_[i_351_][i_352_]--;
						class456_sub1_sub2_sub3.aBool11612 = true;
						continue;
					}
				} else {
					int i_353_ = 252 + 256 * (i_350_ - 1);
					int i_354_ = (int) class240.aFloat2653 - i_353_ >> 9;
					int i_355_ = (int) class240.aFloat2657 - i_353_ >> 9;
					int i_356_ = i_353_ + (int) class240.aFloat2653 >> 9;
					int i_357_ = (int) class240.aFloat2657 + i_353_ >> 9;
					if (!Class427.method5193(is_346_, is_347_, (1371302107 * (class456_sub1_sub2_sub3.anInt11646)), i_354_, i_355_, i_356_, i_357_, 1550695423)) {
						for (int i_358_ = i_354_; i_358_ <= i_356_; i_358_++) {
							for (int i_359_ = i_355_; i_359_ <= i_357_; i_359_++) {
								if (is_346_[i_358_][i_359_] == (class456_sub1_sub2_sub3.anInt11646 * 1371302107))
									is_347_[i_358_][i_359_]--;
							}
						}
						class456_sub1_sub2_sub3.aBool11612 = true;
						continue;
					}
				}
			}
			class456_sub1_sub2_sub3.aBool11612 = false;
			class456_sub1_sub2_sub3.method5395(class240.aFloat2653, (float) Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub3.aByte9009, -2093532389), class240.aFloat2657);
			aClass613_8605.method7285(1471354310).method6232(class456_sub1_sub2_sub3, true, 1256412808);
		}
	}

	final void method6902(int i) {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class619.aClass73_8062 = new InterfaceDefinitions();
		Class102_Sub5.method9947(-1998441258);
		Class286.method3865(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, -955267449);
		Class240.method3304(100);
		Class230.method3190(10);
		Class106.method2053(100, -1651724813);
		Class489.method5843(100, 1770849771);
		if (Class434.aClass434_5044 != Class151.aClass434_1702)
			Class613.aByteArrayArray8033 = new byte[50][];
		Class213.aClass572_Sub24_2463 = Class346.method4333((byte) 41);
		if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(1460111104) == 1)
			Class523.aBool5831 = false;
		switch (Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(-969446260)) {
			case 3:
				Class200.aBool2388 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 621993303);
				Class300.method3993(Class257.aClass257_2779, 1272837737);
				break;
			case 4:
				Class200.aBool2389 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 1210171199);
				Class300.method3993(Class257.aClass257_2778, 1402234595);
				break;
		}
		if (Class151.aClass434_1702 == Class434.aClass434_5044)
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
		else if (Class151.aClass434_1702.method5252(Class440.aClass440_5094, 1676874689)) {
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
			Class633.aClass641_8203.port = -984285601 * Class633.aClass641_8203.id + -1352120000;
			Class633.aClass641_8203.securePort = 974886224 + Class633.aClass641_8203.id * -172050845;
		} else if (Class434.aClass434_5047 == Class151.aClass434_1702) {
			Class633.aClass641_8203.address = Class3.aString27;
			Class633.aClass641_8208.address = Class3.aString27;
			Class633.aClass641_8196.address = Class3.aString27;
			Class633.aClass641_8203.port = Class633.aClass641_8203.id * -984285601 + -1352120000;
			Class633.aClass641_8203.securePort = Class633.aClass641_8203.id * -172050845 + 974886224;
		}
		MaterialInformation.method1604(-1431994595);
		Class633.aClass641_8197 = Class633.aClass641_8203;
		Class540.aClass267_6063 = new Class267();
		Class51.aClass278_491 = new Class278_Sub1();
		Class72.aClass617_721 = new Class617(Class633.aClass641_8196.address, Class633.aClass641_8196.method7600(612084788), aClass437_8705.anInt5076 * 1002594281);
		if (aClass437_8705 == Class437.aClass437_5072)
			aBool8847 = false;
		Class565.aShortArray6361 = ObjectDefinitions.aShortArray5606 = NPCDefintion.aShortArray4796 = ItemDefinitions.aShortArray8151 = new short[256];
		try {
			Class602.aClipboard7878 = Class591_Sub5.method8786((byte) 26).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class108.aClass549_1426 = Class191.method2891(aCanvas7745, (short) -27923);
		Class26.aClass564_216 = Class494.method5903(aCanvas7745, true, 346827628);
		if (aClass643_7752 != null)
			Class224_Sub1.aClass558_9492 = new Class558(255, aClass643_7752, aClass643_7761, 2000000);
		Class133_Sub1.aClass411_Sub1_9827 = new Class411_Sub1(aClass5_8876);
		try {
			Class133_Sub1.aClass411_Sub1_9827.method5037(Class409.aClass409_4783, 1434827187);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4971(Class416.aClass416_4931, false, -165255925);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4980(Class240.method3316(99999.0F, 99999.0F, 99999.0F), 1753503583);
			Class133_Sub1.aClass411_Sub1_9827.method4976(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (short) -14102);
			Class133_Sub1.aClass411_Sub1_9827.method4979(Class240.method3316(99999.0F, 99999.0F, 99999.0F), (byte) 47);
			Class133_Sub1.aClass411_Sub1_9827.method5024(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 413362927);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class333.method4180(VarTransmitLevel.anApplet8067, Class572_Sub12_Sub2.aString11255, -1658959500);
		if (Class434.aClass434_5044 != Class151.aClass434_1702 && Class151.aClass434_1702 != Class434.aClass434_5048)
			aBool8874 = true;
		aString7744 = Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935);
		Class204.aClass602_2411 = new Class602();
		new Thread(Class204.aClass602_2411).start();
		Class483.aClass10_5388 = new Class10();
	}

	static final void method8064() {
		if (-1784648141 * anInt8604 > 1) {
			anInt8604 -= -425706245;
			anInt8729 = 653930141 * anInt8839;
		}
		if (aClass195_8589.aBool2344) {
			aClass195_8589.aBool2344 = false;
			Class113.method2092(1879692902);
		} else {
			if (!Class25.aBool165)
				Class345.method4317((byte) -109);
			for (int i = 0; i < 100 && MaterialInformation.method1605(aClass195_8589, -540175617); i++) {
				/* empty */
			}
			if (1 == 835742603 * anInt8580) {
				while (Class344.method4315((byte) 27)) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3753, aClass195_8589.aClass650_2340, 481801854);
					class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
					int i = (class572_sub25.aRsByteBuffer.o * -1585139053);
					Class190.method2889((class572_sub25.aRsByteBuffer), 48748209);
					class572_sub25.aRsByteBuffer.method8552((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i), -1504153022);
					aClass195_8589.method2929(class572_sub25, (byte) -92);
				}
				if (null != Class273.aClass461_2902) {
					if (633548015 * Class273.aClass461_2902.anInt5216 != -1) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.GC_PACKET, (aClass195_8589.aClass650_2340), -595468237);
						if (Class65.aGarbageCollectorMXBean685 == null || !Class65.aGarbageCollectorMXBean685.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class65.aGarbageCollectorMXBean685 = garbagecollectormxbean;
										aLong8875 = -6094611317542751281L;
										aLong8737 = -5272074439168099041L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class69.method1067(-1738385134);
						int i = -1;
						if (null != Class65.aGarbageCollectorMXBean685) {
							long l_360_ = Class65.aGarbageCollectorMXBean685.getCollectionTime();
							if (aLong8737 * 7147685318279086369L != -1L) {
								long l_361_ = (l_360_ - 7147685318279086369L * aLong8737);
								long l_362_ = l - 2681765377846398161L * aLong8875;
								if (0L != l_362_)
									i = (int) (l_361_ * 100L / l_362_);
							}
							aLong8737 = 5272074439168099041L * l_360_;
							aLong8875 = 6094611317542751281L * l;
						}
						class572_sub25.aRsByteBuffer.writeByteC(i, (byte) -14);
						class572_sub25.aRsByteBuffer.writeByte128(-267830063 * anInt7734, -710558772);
						class572_sub25.aRsByteBuffer.writeShort128(633548015 * Class273.aClass461_2902.anInt5216, -16711936);
						aClass195_8589.method2929(class572_sub25, (byte) -85);
						Class273.aClass461_2902 = null;
						Class324.aLong4087 = (l + 30000L) * 5143952497543217671L;
					}
				} else if (Class69.method1067(-1712133802) >= -5049570460082517065L * Class324.aLong4087)
					Class273.aClass461_2902 = aClass455_8759.method5379((Class633.aClass641_8197.address), 1523865447);
				Class563.method6649((byte) 1);
				Class382.method4650(-1685243627);
				Class572_Sub13 class572_sub13 = (Class572_Sub13) aClass675_8745.method7932((byte) 50);
				if (aClass613_8605.method7285(1592000141) != null) {
					if (5 == 625220759 * Class18.anInt143)
						Class444.method5331((byte) 68);
					else if (625220759 * Class18.anInt143 == 3)
						Class540.method6417((byte) -71);
				}
				if (aBool8681)
					aBool8681 = false;
				else
					aFloat8660 /= 2.0F;
				if (aBool8682)
					aBool8682 = false;
				else
					aFloat8679 /= 2.0F;
				if (IncomingPacket.method4113((byte) -37))
					Class572_Sub36.method8756(-945756907);
				else if (Class18.anInt143 * 625220759 == 1) {
					Class497 class497 = aClass613_8605.method7280((byte) -92);
					int i = class497.localX * -2109597897 << 9;
					int i_363_ = class497.localY * 417324155 << 9;
					if (Class218.aLong2511 * -1389695526323027701L <= 0L)
						Class218.aLong2511 = (Class69.method1067(-2145052862) * 8241051270684000931L);
					float f = (float) (Class69.method1067(-1705875768) - (Class218.aLong2511 * -1389695526323027701L));
					int i_364_ = 1000 / Class425.method5176(1859463187);
					i_364_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_364_) {
						float f_365_ = Math.min(f, (float) i_364_);
						Class133_Sub1.aClass411_Sub1_9827.method5012(f_365_ / 1000.0F, (aClass613_8605.method7293(1000744339).anIntArrayArrayArray3141), aClass613_8605.method7287((byte) 30), i, i_363_, (byte) -43);
					}
					Class218.aLong2511 = (Class69.method1067(-1991671521) * 8241051270684000931L);
				}
				Class298.method3974(484398531);
				if (anInt8580 * 835742603 == 1) {
					aClass613_8605.method7306(-1042067865).method5978(aClass613_8605, 1466961834);
					Class624.method7451(-1995857551);
					if (-599981499 * anInt8620 > 10)
						((Class195) aClass195_8589).anInt2335 += 707314625;
					if (((Class195) aClass195_8589).anInt2335 * 1070156865 > 2250)
						Class113.method2092(1475800074);
					else {
						if (1797623853 * anInt8646 == 0) {
							Class589.method6993((byte) 0);
							Class194.method2924((byte) -22);
						} else if (Class102_Sub2.aClass494_10268.anInterface57_5489.method320(class572_sub13, anInterface64Array8610, anInt8609 * 2134888631, Class108.aClass549_1426, -1956744111))
							Class133_Sub4.method9339(false, 1503129669);
						else {
							if (2 == anInt8646 * 1797623853 && Class255.method3522(anInt8645 * 1545763299, 1615140874)) {
								aClass613_8605.method7348(new Class598(Class569.aClass569_6394, null), -249133683);
								anInt8646 = 432127727;
							}
							if (1797623853 * anInt8646 == 3 && 18 != anInt8580 * 835742603) {
								Class122.aClass676_1485.method7964((byte) 9);
								anInt8646 = 2007826068;
								anInt8648 = cycles * -1389120501;
								anInt8649 = 0;
								aBool8647 = false;
								Class198.method2976(952312938);
							}
							if (4 == 1797623853 * anInt8646) {
								int i = cycles - 2129803171 * anInt8648;
								if (-1287240229 * anInt8649 < Class122.aClass133Array1481.length) {
									do {
										Class133 class133 = (Class122.aClass133Array1481[anInt8649 * -1287240229]);
										if (class133.anInt1566 * -762660985 > i)
											break;
										class133.method2303(-1172628313);
									} while (anInt8646 * 1797623853 == 4 && (((anInt8649 += 807284307) * -1287240229) < (Class122.aClass133Array1481).length));
								}
								if (4 == anInt8646 * 1797623853) {
									for (int i_366_ = 0; i_366_ < (Class122.aClass130Array1483).length; i_366_++) {
										Class130 class130 = (Class122.aClass130Array1483[i_366_]);
										if (class130.aBool1529) {
											Entity class456_sub1_sub2_sub3 = class130.method2268(-1613556034);
											Class461.method5469(class456_sub1_sub2_sub3, true, -169129349);
										}
									}
								}
							}
						}
						Class676.method7976(-636944807);
						Class433.method5249(743682542);
						Class603.method7145(-1094778835);
						Class71.method1084(false, (byte) 40);
						Class572_Sub16.method8567(Class272_Sub2.aClass106_9517, (Class456_Sub1_Sub3_Sub2.aClass94_11589), 2000509215);
						anInt8674 += 237624865;
						if (0 != 1251161273 * anInt8606) {
							anInt8803 += 1970875452;
							if (-311274581 * anInt8803 >= 400)
								anInt8606 = 0;
						}
						if (Class323.aClass73_4080 != null) {
							anInt8710 += -904830707;
							if (anInt8710 * 1766020549 >= 15) {
								Class555.method6575(Class323.aClass73_4080, (short) 21208);
								Class323.aClass73_4080 = null;
							}
						}
						aClass73_8603 = null;
						aBool8780 = false;
						aBool8775 = false;
						Class383.aClass73_4610 = null;
						Class296.method3964(null, -1, -1, -877464040);
						if (!aBool8754)
							anInt8751 = 1983555971;
						Class514.method6093(1907273991);
						anInt8839 += -1210150071;
						if (aBool8786) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3710, (aClass195_8589.aClass650_2340), -1019113029);
							class572_sub25.aRsByteBuffer.writeIntV2((Class612.anInt7988 * -36891819 << 28 | Class498.anInt5510 * 863160757 << 14 | Class665_Sub22.anInt9601 * -1817958735), (byte) 1);
							aClass195_8589.method2929(class572_sub25, (byte) -27);
							aBool8786 = false;
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8813.method7920(-1945803963));
							if (class572_sub20 == null)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (class73.activeComponent * -1665128073 >= 0) {
								InterfaceDefinitions class73_367_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 10488);
								if (null == class73_367_ || class73_367_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= (class73_367_.aClass73Array916).length) || ((class73_367_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -1945497725);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8884.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_368_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 16756);
								if (null == class73_368_ || null == class73_368_.aClass73Array916 || (class73.activeComponent * -1665128073 >= (class73_368_.aClass73Array916).length) || ((class73_368_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2112086535);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8812.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_369_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -8238);
								if (class73_369_ == null || class73_369_.aClass73Array916 == null || (-1665128073 * class73.activeComponent >= (class73_369_.aClass73Array916).length) || (class73 != (class73_369_.aClass73Array916[-1665128073 * class73.activeComponent])))
									continue;
							}
							Class34.executeCs2(class572_sub20, -1966567715);
						}
						if (Class383.aClass73_4610 == null)
							anInt8844 = 0;
						if (aClass73_8770 != null)
							Class122.method2197(-1976136145);
						Class15.method654(140334334);
						if (-1550439133 * rights > 0 && Class108.aClass549_1426.method6514(82, (byte) 1) && Class108.aClass549_1426.method6514(81, (byte) 1) && anInt8787 * -1840536699 != 0) {
							int i = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) - -1840536699 * anInt8787);
							if (i < 0)
								i = 0;
							else if (i > 3)
								i = 3;
							Class497 class497 = aClass613_8605.method7280((byte) -28);
							Class21.method703(i, (class497.localX * -2109597897 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0])), (417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])), -1209000441);
						}
						for (int i = 0; i < 5; i++)
							anIntArray8597[i]++;
						if (Class306.clientConfigsDomain.aBool10652 && ((Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L) < Class69.method1067(-1829762390) - 60000L))
							Class614.method7367(239906896);
						Class306.clientConfigsDomain.method9968((byte) 0);
						for (Class591_Sub1 class591_sub1 = ((Class591_Sub1) aClass652_8864.method7697(257320166)); null != class591_sub1; class591_sub1 = ((Class591_Sub1) aClass652_8864.method7698(-1466102684))) {
							if ((long) (-1160847613 * (((Class591_Sub1) class591_sub1).anInt9180)) < (Class69.method1067(-1911912835) / 1000L - 5L)) {
								if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 2138830528);
								if (0 == (((Class591_Sub1) class591_sub1).aShort9181))
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 2086389043);
								class591_sub1.method7002((byte) 98);
							}
						}
						anInt8819 += 745021087;
						if (anInt8819 * -34112161 > 502) {
							anInt8819 = 0;
							int i = (int) (Math.random() * 8.0);
							if (1 == (i & 0x1))
								anInt8877 += -19134435 * anInt8662;
							if (2 == (i & 0x2))
								anInt8663 += anInt8664 * -1977461499;
							if ((i & 0x4) == 4)
								anInt8665 += -139987683 * anInt8666;
						}
						if (-1037352299 * anInt8877 < -55)
							anInt8662 = -87875006;
						if (anInt8877 * -1037352299 > 54)
							anInt8662 = 87875006;
						if (713494119 * anInt8663 < -55)
							anInt8664 = -2093052074;
						if (anInt8663 * 713494119 > 55)
							anInt8664 = 2093052074;
						if (-706438965 * anInt8665 < -42)
							anInt8666 = 1972333055;
						if (-706438965 * anInt8665 > 44)
							anInt8666 = -1972333055;
						anInt8672 += -1809977439;
						if (anInt8672 * -1605651359 > 505) {
							anInt8672 = 0;
							int i = (int) (Math.random() * 8.0);
							if ((i & 0x1) == 1)
								anInt8766 += 1104829617 * anInt8846;
							if (2 == (i & 0x2))
								anInt8670 += 151185977 * anInt8671;
						}
						if (anInt8766 * -777638353 < -61)
							anInt8846 = -410395906;
						if (anInt8766 * -777638353 > 65)
							anInt8846 = 410395906;
						if (anInt8670 * -1034566343 < -21)
							anInt8671 = 255419729;
						if (-1034566343 * anInt8670 > 12)
							anInt8671 = -255419729;
						aClass195_8589.anInt2337 += 394568993;
						if (aClass195_8589.anInt2337 * -1242489119 > 50) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, (aClass195_8589.aClass650_2340), 804651393);
							aClass195_8589.method2929(class572_sub25, (byte) -126);
						}
						if (aBool8573) {
							Class425.method5177((short) 5219);
							aBool8573 = false;
						}
						try {
							aClass195_8589.method2936((byte) 22);
						} catch (IOException ioexception) {
							Class113.method2092(1496950503);
						}
					}
				}
			}
		}
	}

	final void method6911() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class619.aClass73_8062 = new InterfaceDefinitions();
		Class102_Sub5.method9947(-733780024);
		Class286.method3865(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100, 1000, 250, 500, 100, 100, 10 }, -955267449);
		Class240.method3304(100);
		Class230.method3190(10);
		Class106.method2053(100, -1651724813);
		Class489.method5843(100, -27713923);
		if (Class434.aClass434_5044 != Class151.aClass434_1702)
			Class613.aByteArrayArray8033 = new byte[50][];
		Class213.aClass572_Sub24_2463 = Class346.method4333((byte) 4);
		if (Class213.aClass572_Sub24_2463.aClass665_Sub17_9241.method9008(-411568674) == 1)
			Class523.aBool5831 = false;
		switch (Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(1643826909)) {
			case 3:
				Class200.aBool2388 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 565098078);
				Class300.method3993(Class257.aClass257_2779, 863814985);
				break;
			case 4:
				Class200.aBool2389 = true;
				Class213.aClass572_Sub24_2463.method8622((Class213.aClass572_Sub24_2463.aClass665_Sub22_9207), 0, 1477719731);
				Class300.method3993(Class257.aClass257_2778, 1752463318);
				break;
		}
		if (Class151.aClass434_1702 == Class434.aClass434_5044)
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
		else if (Class151.aClass434_1702.method5252(Class440.aClass440_5094, 767011152)) {
			Class633.aClass641_8203.address = VarTransmitLevel.anApplet8067.getCodeBase().getHost();
			Class633.aClass641_8203.port = -984285601 * Class633.aClass641_8203.id + -1352120000;
			Class633.aClass641_8203.securePort = 974886224 + Class633.aClass641_8203.id * -172050845;
		} else if (Class434.aClass434_5047 == Class151.aClass434_1702) {
			Class633.aClass641_8203.address = Class3.aString27;
			Class633.aClass641_8208.address = Class3.aString27;
			Class633.aClass641_8196.address = Class3.aString27;
			Class633.aClass641_8203.port = Class633.aClass641_8203.id * -984285601 + -1352120000;
			Class633.aClass641_8203.securePort = Class633.aClass641_8203.id * -172050845 + 974886224;
		}
		MaterialInformation.method1604(199971369);
		Class633.aClass641_8197 = Class633.aClass641_8203;
		Class540.aClass267_6063 = new Class267();
		Class51.aClass278_491 = new Class278_Sub1();
		Class72.aClass617_721 = new Class617(Class633.aClass641_8196.address, Class633.aClass641_8196.method7600(1376319813), aClass437_8705.anInt5076 * 1002594281);
		if (aClass437_8705 == Class437.aClass437_5072)
			aBool8847 = false;
		Class565.aShortArray6361 = ObjectDefinitions.aShortArray5606 = NPCDefintion.aShortArray4796 = ItemDefinitions.aShortArray8151 = new short[256];
		try {
			Class602.aClipboard7878 = Class591_Sub5.method8786((byte) 16).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class108.aClass549_1426 = Class191.method2891(aCanvas7745, (short) -2082);
		Class26.aClass564_216 = Class494.method5903(aCanvas7745, true, -362995973);
		if (aClass643_7752 != null)
			Class224_Sub1.aClass558_9492 = new Class558(255, aClass643_7752, aClass643_7761, 2000000);
		Class133_Sub1.aClass411_Sub1_9827 = new Class411_Sub1(aClass5_8876);
		try {
			Class133_Sub1.aClass411_Sub1_9827.method5037(Class409.aClass409_4783, -302023723);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4971(Class416.aClass416_4931, false, 1669965258);
			Class133_Sub1.aClass411_Sub1_9827.method4972(Class413.aClass413_4910, false, (byte) 9);
			Class133_Sub1.aClass411_Sub1_9827.method4980(Class240.method3316(99999.0F, 99999.0F, 99999.0F), 1341450368);
			Class133_Sub1.aClass411_Sub1_9827.method4976(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), (short) 18839);
			Class133_Sub1.aClass411_Sub1_9827.method4979(Class240.method3316(99999.0F, 99999.0F, 99999.0F), (byte) 46);
			Class133_Sub1.aClass411_Sub1_9827.method5024(Class240.method3316(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 1643371603);
		} catch (Exception_Sub4 exception_sub4) {
			/* empty */
		}
		Class333.method4180(VarTransmitLevel.anApplet8067, Class572_Sub12_Sub2.aString11255, -1658959500);
		if (Class434.aClass434_5044 != Class151.aClass434_1702 && Class151.aClass434_1702 != Class434.aClass434_5048)
			aBool8874 = true;
		aString7744 = Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935);
		Class204.aClass602_2411 = new Class602();
		new Thread(Class204.aClass602_2411).start();
		Class483.aClass10_5388 = new Class10();
	}

	public static final void method8065() {
		aBool8783 = true;
	}

	static final void method8066() {
		Class572_Sub15_Sub2 class572_sub15_sub2 = ((Class195) aClass195_8589).aClass572_Sub15_Sub2_2330;
		for (int i = 0; i < anInt8627 * 865439581; i++) {
			int i_370_ = anIntArray8628[i];
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) i_370_)).anObject9081));
			class572_sub15_sub2.readUnsignedShort(647518597);
			int i_371_ = class572_sub15_sub2.readUnsignedByte(742559529);
			if (0 != (i_371_ & 0x80))
				i_371_ += class572_sub15_sub2.readUnsignedByte(1827443411) << 8;
			if (0 != (i_371_ & 0x8000))
				i_371_ += class572_sub15_sub2.readUnsignedByte(1831839687) << 16;
			if ((i_371_ & 0x100000) != 0)
				i_371_ += class572_sub15_sub2.readUnsignedByte(1617132347) << 24;
			if ((i_371_ & 0x100) != 0) {
				class456_sub1_sub2_sub3_sub1.anInt11804 = class572_sub15_sub2.readUnsignedShortLE128((byte) 57) * -787969919;
				if (65535 == 1235203969 * class456_sub1_sub2_sub3_sub1.anInt11804)
					class456_sub1_sub2_sub3_sub1.anInt11804 = 787969919;
			}
			if (0 != (i_371_ & 0x1000)) {
				class456_sub1_sub2_sub3_sub1.anInt11634 = class572_sub15_sub2.readByte(1150820970) * 466976275;
				class456_sub1_sub2_sub3_sub1.anInt11636 = class572_sub15_sub2.readByteC(16711935) * -866081399;
				class456_sub1_sub2_sub3_sub1.anInt11635 = class572_sub15_sub2.read128Byte(888160586) * -1178286551;
				class456_sub1_sub2_sub3_sub1.anInt11637 = class572_sub15_sub2.readByteC(16711935) * -1276586765;
				class456_sub1_sub2_sub3_sub1.anInt11638 = ((class572_sub15_sub2.readUnsignedShortLE128((byte) 74) + cycles) * 1549695573);
				class456_sub1_sub2_sub3_sub1.anInt11639 = ((class572_sub15_sub2.readUnsignedShort128((byte) 24) + cycles) * 2072899299);
				class456_sub1_sub2_sub3_sub1.anInt11624 = class572_sub15_sub2.readUnsignedShortLE((byte) 28) * 266972297;
				class456_sub1_sub2_sub3_sub1.anInt11634 += (class456_sub1_sub2_sub3_sub1.screenX[0] * 466976275);
				class456_sub1_sub2_sub3_sub1.anInt11636 += (class456_sub1_sub2_sub3_sub1.screenY[0] * -866081399);
				class456_sub1_sub2_sub3_sub1.anInt11635 += (class456_sub1_sub2_sub3_sub1.screenX[0] * -1178286551);
				class456_sub1_sub2_sub3_sub1.anInt11637 += (-1276586765 * class456_sub1_sub2_sub3_sub1.screenY[0]);
				class456_sub1_sub2_sub3_sub1.stepsCount = -298115053;
				class456_sub1_sub2_sub3_sub1.anInt11663 = 0;
			}
			if ((i_371_ & 0x800000) != 0) {
				int i_372_ = (class456_sub1_sub2_sub3_sub1.aClass410_11803.anIntArray4854).length;
				int i_373_ = 0;
				if (null != (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4798))
					i_373_ = (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4798).length;
				int i_374_ = 0;
				if ((class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4801) != null)
					i_373_ = (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4801).length;
				int i_375_ = class572_sub15_sub2.readUnsignedByte128(1589898961);
				if ((i_375_ & 0x1) != 1) {
					class572_sub15_sub2.o += 620787510;
					int[] is = null;
					if ((i_375_ & 0x2) == 2) {
						is = new int[i_372_];
						for (int i_376_ = 0; i_376_ < i_372_; i_376_++)
							is[i_376_] = class572_sub15_sub2.readBigSmart((byte) 82);
					}
					short[] is_377_ = null;
					if ((i_375_ & 0x4) == 4) {
						is_377_ = new short[i_373_];
						for (int i_378_ = 0; i_378_ < i_373_; i_378_++)
							is_377_[i_378_] = (short) class572_sub15_sub2.readUnsignedShort128((byte) 103);
					}
					short[] is_379_ = null;
					if (8 == (i_375_ & 0x8)) {
						is_379_ = new short[i_374_];
						for (int i_380_ = 0; i_380_ < i_374_; i_380_++)
							is_379_[i_380_] = (short) class572_sub15_sub2.readUnsignedShort(647518597);
					}
					long l = (long) ((NPC.anInt11812 += -1225347919) * 907025489 - 1);
					new Class399(l, is, null, null, null, is_377_, is_379_);
				}
			}
			if (0 != (i_371_ & 0x200)) {
				int i_381_ = class572_sub15_sub2.readUnsigned128Byte((byte) 58);
				int[] is = new int[i_381_];
				int[] is_382_ = new int[i_381_];
				for (int i_383_ = 0; i_383_ < i_381_; i_383_++) {
					int i_384_ = class572_sub15_sub2.readUnsignedShort128((byte) 52);
					if (49152 == (i_384_ & 0xc000)) {
						int i_385_ = class572_sub15_sub2.readUnsignedShort128((byte) 120);
						is[i_383_] = i_384_ << 16 | i_385_;
					} else
						is[i_383_] = i_384_;
					is_382_[i_383_] = class572_sub15_sub2.readUnsignedShort(647518597);
				}
				class456_sub1_sub2_sub3_sub1.method10518(is, is_382_, (byte) -113);
			}
			if (0 != (i_371_ & 0x2000000)) {
				class456_sub1_sub2_sub3_sub1.aByte11643 = class572_sub15_sub2.readByte(784383532);
				class456_sub1_sub2_sub3_sub1.aByte11644 = class572_sub15_sub2.readByte(596344789);
				class456_sub1_sub2_sub3_sub1.aByte11626 = class572_sub15_sub2.read128Byte(1976078532);
				class456_sub1_sub2_sub3_sub1.aByte11605 = (byte) class572_sub15_sub2.readUnsignedByte128(1913150660);
				class456_sub1_sub2_sub3_sub1.anInt11641 = ((cycles + class572_sub15_sub2.readUnsignedShortLE((byte) 35)) * 1008238467);
				class456_sub1_sub2_sub3_sub1.anInt11642 = ((cycles + class572_sub15_sub2.readUnsignedShortLE128((byte) 98)) * -1559016237);
			}
			if ((i_371_ & 0x400000) != 0) {
				class456_sub1_sub2_sub3_sub1.anInt11806 = class572_sub15_sub2.readUnsignedShortLE((byte) 87) * 80538835;
				if (65535 == 1667386203 * class456_sub1_sub2_sub3_sub1.anInt11806)
					class456_sub1_sub2_sub3_sub1.anInt11806 = 1325621039 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4812);
			}
			if ((i_371_ & 0x40) != 0) {
				int[] is = new int[4];
				for (int i_386_ = 0; i_386_ < 4; i_386_++)
					is[i_386_] = class572_sub15_sub2.readBigSmart((byte) 74);
				int i_387_ = class572_sub15_sub2.readUnsignedByte(1611572843);
				Class565.method6699(class456_sub1_sub2_sub3_sub1, is, i_387_, true, (short) 2576);
			}
			if ((i_371_ & 0x20000) != 0) {
				int i_388_ = ((class572_sub15_sub2.b[((class572_sub15_sub2.o += 310393755) * -1585139053) - 1]) & 0xff);
				for (int i_389_ = 0; i_389_ < i_388_; i_389_++) {
					int i_390_ = class572_sub15_sub2.readUnsignedByte(1381574308);
					int i_391_ = class572_sub15_sub2.readIntLE(2037616172);
					int i_392_ = class572_sub15_sub2.read24BitIntegerV3(-127281357);
					class456_sub1_sub2_sub3_sub1.method10691(i_390_, i_391_, i_392_, -1590126923);
				}
			}
			if ((i_371_ & 0x400) != 0) {
				int i_393_ = (class456_sub1_sub2_sub3_sub1.aClass410_11803.anIntArray4793).length;
				int i_394_ = 0;
				if (null != (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4798))
					i_394_ = (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4798).length;
				int i_395_ = 0;
				if (null != (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4801))
					i_395_ = (class456_sub1_sub2_sub3_sub1.aClass410_11803.aShortArray4801).length;
				int i_396_ = class572_sub15_sub2.readUnsignedByte(1894306669);
				if ((i_396_ & 0x1) == 1)
					class456_sub1_sub2_sub3_sub1.aClass399_11801 = null;
				else {
					class572_sub15_sub2.o += 620787510;
					int[] is = null;
					float[] fs = null;
					int[][] is_397_ = null;
					int[][] is_398_ = null;
					if ((i_396_ & 0x2) == 2) {
						is = new int[i_393_];
						if (16 == (i_396_ & 0x10)) {
							fs = new float[i_393_];
							is_397_ = new int[i_393_][3];
							is_398_ = new int[i_393_][3];
						}
						for (int i_399_ = 0; i_399_ < i_393_; i_399_++) {
							is[i_399_] = class572_sub15_sub2.readBigSmart((byte) 123);
							if ((i_396_ & 0x10) == 16 && is[i_399_] != -1) {
								fs[i_399_] = class572_sub15_sub2.method8448((byte) 2);
								for (int i_400_ = 0; i_400_ < 3; i_400_++)
									is_397_[i_399_][i_400_] = class572_sub15_sub2.method8548((byte) -73);
								for (int i_401_ = 0; i_401_ < 3; i_401_++)
									is_398_[i_399_][i_401_] = class572_sub15_sub2.method8516(1715252511);
							}
						}
					}
					short[] is_402_ = null;
					if ((i_396_ & 0x4) == 4) {
						is_402_ = new short[i_394_];
						for (int i_403_ = 0; i_403_ < i_394_; i_403_++)
							is_402_[i_403_] = (short) class572_sub15_sub2.readUnsignedShort128((byte) 75);
					}
					short[] is_404_ = null;
					if (8 == (i_396_ & 0x8)) {
						is_404_ = new short[i_395_];
						for (int i_405_ = 0; i_405_ < i_395_; i_405_++)
							is_404_[i_405_] = (short) class572_sub15_sub2.readUnsignedShortLE128((byte) 46);
					}
					long l = (long) ((NPC.anInt11811 += 845878597) * 1342584205 - 1);
					class456_sub1_sub2_sub3_sub1.aClass399_11801 = new Class399(l, is, fs, is_397_, is_398_, is_402_, is_404_);
				}
			}
			if (0 != (i_371_ & 0x4))
				class456_sub1_sub2_sub3_sub1.method10688(class572_sub15_sub2.readString(1295706626), 0, 0, 54648825);
			if ((i_371_ & 0x80000) != 0) {
				int i_406_ = class572_sub15_sub2.readUnsignedByteC(52235385);
				int[] is = new int[8];
				short[] is_407_ = new short[8];
				for (int i_408_ = 0; i_408_ < 8; i_408_++) {
					if ((i_406_ & 1 << i_408_) != 0) {
						is[i_408_] = class572_sub15_sub2.readBigSmart((byte) 36);
						is_407_[i_408_] = (short) class572_sub15_sub2.readSmart((byte) 59);
					} else {
						is[i_408_] = -1;
						is_407_[i_408_] = (short) -1;
					}
				}
				class456_sub1_sub2_sub3_sub1.aClass418_11813 = new Class418(is, is_407_);
			}
			if ((i_371_ & 0x20) != 0) {
				int i_409_ = class572_sub15_sub2.readUnsignedShort(647518597);
				int i_410_ = class572_sub15_sub2.readInt(2126790789);
				if (i_409_ == 65535)
					i_409_ = -1;
				int i_411_ = class572_sub15_sub2.readUnsignedByteC(-181479216);
				int i_412_ = i_411_ & 0x7;
				int i_413_ = i_411_ >> 3 & 0xf;
				if (i_413_ == 15)
					i_413_ = -1;
				boolean bool = 1 == (i_411_ >> 7 & 0x1);
				class456_sub1_sub2_sub3_sub1.method10520(i_409_, i_410_, i_412_, i_413_, bool, 0, 931172410);
			}
			if (0 != (i_371_ & 0x4000)) {
				int i_414_ = class572_sub15_sub2.readUnsignedByte128(1419739016);
				int[] is = new int[i_414_];
				int[] is_415_ = new int[i_414_];
				int[] is_416_ = new int[i_414_];
				for (int i_417_ = 0; i_417_ < i_414_; i_417_++) {
					int i_418_ = class572_sub15_sub2.readBigSmart((byte) 22);
					is[i_417_] = i_418_;
					is_415_[i_417_] = class572_sub15_sub2.readUnsignedByte128(-1796843012);
					is_416_[i_417_] = class572_sub15_sub2.readUnsignedShortLE128((byte) 105);
				}
				Class102_Sub3.method9564(class456_sub1_sub2_sub3_sub1, is, is_415_, is_416_, (byte) 4);
			}
			if (0 != (i_371_ & 0x10000000))
				class456_sub1_sub2_sub3_sub1.anInt11808 = class572_sub15_sub2.readUnsignedByte128(-1419016810) * -702649873;
			if (0 != (i_371_ & 0x8000000)) {
				int i_419_ = class572_sub15_sub2.readUnsignedShortLE128((byte) 16);
				int i_420_ = class572_sub15_sub2.readIntV1((byte) 0);
				if (65535 == i_419_)
					i_419_ = -1;
				int i_421_ = class572_sub15_sub2.readUnsignedByteC(-1801476852);
				int i_422_ = i_421_ & 0x7;
				int i_423_ = i_421_ >> 3 & 0xf;
				if (15 == i_423_)
					i_423_ = -1;
				boolean bool = (i_421_ >> 7 & 0x1) == 1;
				class456_sub1_sub2_sub3_sub1.method10520(i_419_, i_420_, i_422_, i_423_, bool, 3, 931172410);
			}
			if ((i_371_ & 0x4000000) != 0) {
				int i_424_ = class572_sub15_sub2.readUnsignedShortLE((byte) -29);
				int i_425_ = class572_sub15_sub2.readIntLE(2145730825);
				if (i_424_ == 65535)
					i_424_ = -1;
				int i_426_ = class572_sub15_sub2.readUnsignedByte(395976836);
				int i_427_ = i_426_ & 0x7;
				int i_428_ = i_426_ >> 3 & 0xf;
				if (i_428_ == 15)
					i_428_ = -1;
				boolean bool = (i_426_ >> 7 & 0x1) == 1;
				class456_sub1_sub2_sub3_sub1.method10520(i_424_, i_425_, i_427_, i_428_, bool, 2, 931172410);
			}
			if (0 != (i_371_ & 0x1)) {
				class456_sub1_sub2_sub3_sub1.anInt11799 = class572_sub15_sub2.readUnsignedShort128((byte) 20) * -919549415;
				class456_sub1_sub2_sub3_sub1.anInt11800 = class572_sub15_sub2.readUnsignedShortLE((byte) 3) * 564443067;
			}
			if (0 != (i_371_ & 0x10000)) {
				class572_sub15_sub2.o += 620787510;
				int i_429_ = ((class572_sub15_sub2.b[((class572_sub15_sub2.o += 310393755) * -1585139053) - 1]) & 0xff);
				for (int i_430_ = 0; i_430_ < i_429_; i_430_++) {
					int i_431_ = class572_sub15_sub2.readUnsignedByteC(379411760);
					BaseVarType class609 = ((BaseVarType) Class455.method5387(BaseVarType.method7258((byte) -59), i_431_, -1893705617));
					Class323 class323 = (Class624.aClass202_Sub1_Sub2_8080.method9205(class572_sub15_sub2, class609, -141889912));
					class456_sub1_sub2_sub3_sub1.anInterface71_11669.method443(class323.anInt4079 * 380662693, class323.anObject4078, 1534460028);
				}
			}
			if (0 != (i_371_ & 0x8)) {
				int i_432_ = class572_sub15_sub2.readUnsigned128Byte((byte) 38);
				if (i_432_ > 0) {
					for (int i_433_ = 0; i_433_ < i_432_; i_433_++) {
						int i_434_ = -1;
						int i_435_ = -1;
						int i_436_ = -1;
						int i_437_ = class572_sub15_sub2.readUnsignedSmart(2040476276);
						if (32767 == i_437_) {
							i_437_ = class572_sub15_sub2.readUnsignedSmart(-1839597248);
							i_435_ = class572_sub15_sub2.readUnsignedSmart(-938274868);
							i_434_ = class572_sub15_sub2.readUnsignedSmart(-1966275818);
							i_436_ = class572_sub15_sub2.readUnsignedSmart(-755827302);
						} else if (i_437_ != 32766)
							i_435_ = class572_sub15_sub2.readUnsignedSmart(314466300);
						else {
							i_437_ = -1;
							i_435_ = class572_sub15_sub2.readUnsignedByteC(-355776971);
						}
						int i_438_ = class572_sub15_sub2.readUnsignedSmart(-450329438);
						class456_sub1_sub2_sub3_sub1.method10522(i_437_, i_435_, i_434_, i_436_, cycles, i_438_, -1599923658);
					}
				}
				int i_439_ = class572_sub15_sub2.readUnsignedByte128(1933332684);
				if (i_439_ > 0) {
					for (int i_440_ = 0; i_440_ < i_439_; i_440_++) {
						int i_441_ = class572_sub15_sub2.readUnsignedSmart(1684043157);
						int i_442_ = class572_sub15_sub2.readUnsignedSmart(2016523669);
						if (32767 != i_442_) {
							int i_443_ = class572_sub15_sub2.readUnsignedSmart(826322348);
							int i_444_ = class572_sub15_sub2.readUnsignedByte(1811475703);
							int i_445_ = (i_442_ > 0 ? class572_sub15_sub2.readUnsignedByte(1091386837) : i_444_);
							class456_sub1_sub2_sub3_sub1.method10571(i_441_, cycles, i_442_, i_443_, i_444_, i_445_, -163408365);
						} else
							class456_sub1_sub2_sub3_sub1.method10524(i_441_, 16711935);
					}
				}
			}
			if (0 != (i_371_ & 0x10)) {
				class456_sub1_sub2_sub3_sub1.anInt11619 = class572_sub15_sub2.readUnsignedShort128((byte) 110) * 320688299;
				if (-1639699965 * class456_sub1_sub2_sub3_sub1.anInt11619 == 65535)
					class456_sub1_sub2_sub3_sub1.anInt11619 = -320688299;
			}
			if ((i_371_ & 0x40000) != 0) {
				class456_sub1_sub2_sub3_sub1.aString11807 = class572_sub15_sub2.readString(1295706626);
				if ("".equals(class456_sub1_sub2_sub3_sub1.aString11807) || (class456_sub1_sub2_sub3_sub1.aString11807.equals(class456_sub1_sub2_sub3_sub1.aClass410_11803.aString4791)))
					class456_sub1_sub2_sub3_sub1.aString11807 = (class456_sub1_sub2_sub3_sub1.aClass410_11803.aString4791);
			}
			if ((i_371_ & 0x1000000) != 0) {
				int i_446_ = class572_sub15_sub2.readUnsignedShortLE128((byte) 89);
				int i_447_ = class572_sub15_sub2.readIntV2(610611119);
				if (i_446_ == 65535)
					i_446_ = -1;
				int i_448_ = class572_sub15_sub2.readUnsignedByte128(-47826918);
				int i_449_ = i_448_ & 0x7;
				int i_450_ = i_448_ >> 3 & 0xf;
				if (i_450_ == 15)
					i_450_ = -1;
				boolean bool = 1 == (i_448_ >> 7 & 0x1);
				class456_sub1_sub2_sub3_sub1.method10520(i_446_, i_447_, i_449_, i_450_, bool, 4, 931172410);
			}
			if (0 != (i_371_ & 0x200000)) {
				class456_sub1_sub2_sub3_sub1.anInterface71_11669.method22((byte) -8);
				class572_sub15_sub2.o += 620787510;
				int i_451_ = ((class572_sub15_sub2.b[((class572_sub15_sub2.o += 310393755) * -1585139053) - 1]) & 0xff);
				for (int i_452_ = 0; i_452_ < i_451_; i_452_++) {
					int i_453_ = class572_sub15_sub2.readUnsignedByte128(-1975782314);
					BaseVarType class609 = ((BaseVarType) Class455.method5387(BaseVarType.method7258((byte) -80), i_453_, -2021620867));
					Class323 class323 = (Class624.aClass202_Sub1_Sub2_8080.method9205(class572_sub15_sub2, class609, -141889912));
					class456_sub1_sub2_sub3_sub1.anInterface71_11669.method443(class323.anInt4079 * 380662693, class323.anObject4078, -300482236);
				}
			}
			if (0 != (i_371_ & 0x2)) {
				if (class456_sub1_sub2_sub3_sub1.aClass410_11803.method4955((short) 229))
					Class259.method3561(class456_sub1_sub2_sub3_sub1, 589151406);
				class456_sub1_sub2_sub3_sub1.method10687((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(class572_sub15_sub2.readBigSmart((byte) 107), -1409496007)), 0 == (i_371_ & 0x40000), 0 == (i_371_ & 0x400000), true, (byte) 3);
				class456_sub1_sub2_sub3_sub1.method10525(358769667 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4792), (byte) -55);
				class456_sub1_sub2_sub3_sub1.anInt11653 = -631722783 * (-1233753521 * (class456_sub1_sub2_sub3_sub1.aClass410_11803.anInt4823) << 3);
				if (class456_sub1_sub2_sub3_sub1.aClass410_11803.method4955((short) 229))
					Class617.method7399(class456_sub1_sub2_sub3_sub1.aByte9009, (class456_sub1_sub2_sub3_sub1.screenX[0]), (class456_sub1_sub2_sub3_sub1.screenY[0]), 0, null, class456_sub1_sub2_sub3_sub1, null, -1700784601);
			}
			if ((i_371_ & 0x2000) != 0) {
				int i_454_ = class572_sub15_sub2.readUnsignedShortLE((byte) -14);
				int i_455_ = class572_sub15_sub2.readIntLE(2036556045);
				if (i_454_ == 65535)
					i_454_ = -1;
				int i_456_ = class572_sub15_sub2.readUnsigned128Byte((byte) 15);
				int i_457_ = i_456_ & 0x7;
				int i_458_ = i_456_ >> 3 & 0xf;
				if (i_458_ == 15)
					i_458_ = -1;
				boolean bool = (i_456_ >> 7 & 0x1) == 1;
				class456_sub1_sub2_sub3_sub1.method10520(i_454_, i_455_, i_457_, i_458_, bool, 1, 931172410);
			}
		}
	}

	static final void method8067() {
		Class555.method6575(aClass73_8770, (short) 487);
		Class568.anInt6388 += -497304101;
		if (!aBool8780 || !aBool8775) {
			if (1657009747 * Class568.anInt6388 > 1) {
				aClass73_8770 = null;
				aClass73_8771 = null;
			}
		} else {
			int i = Class26.aClass564_216.method6657((short) -22647);
			int i_459_ = Class26.aClass564_216.method6658((byte) -69);
			i -= 12052287 * anInt8772;
			i_459_ -= -1634173751 * anInt8676;
			if (i < anInt8845 * 1280237521)
				i = anInt8845 * 1280237521;
			if (aClass73_8770.anInt764 * 669238293 + i > anInt8778 * -2091143177 + 1280237521 * anInt8845)
				i = (-2091143177 * anInt8778 + anInt8845 * 1280237521 - aClass73_8770.anInt764 * 669238293);
			if (i_459_ < 1007747209 * anInt8777)
				i_459_ = anInt8777 * 1007747209;
			if (i_459_ + 1360982075 * aClass73_8770.anInt765 > anInt8779 * 250871123 + anInt8777 * 1007747209)
				i_459_ = (1007747209 * anInt8777 + 250871123 * anInt8779 - aClass73_8770.anInt765 * 1360982075);
			int i_460_;
			int i_461_;
			if (Class619.aClass73_8062 == aClass73_8771) {
				i_460_ = i;
				i_461_ = i_459_;
			} else {
				i_460_ = (aClass73_8771.anInt774 * -1883230751 + (i - 1280237521 * anInt8845));
				i_461_ = (i_459_ - 1007747209 * anInt8777 + aClass73_8771.anInt775 * -2139739529);
			}
			if (!Class26.aClass564_216.method6656(681929630)) {
				if (aBool8783) {
					Class131.method2286(-1705608345);
					if (null != aClass73_8770.anObjectArray763) {
						Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
						class572_sub20.thizInterface = aClass73_8770;
						class572_sub20.anInt9148 = i_460_ * 638530953;
						class572_sub20.anInt9150 = 2034326205 * i_461_;
						InterfaceDefinitions class73 = method7993(aClass73_8770);
						InterfaceDefinitions class73_462_ = aClass73_8603;
						boolean bool = false;
						for (/**/; (null != class73_462_ && -1 != -1604592419 * class73_462_.anInt768 && class73 != null); class73_462_ = (Class534.aClass83Array5975[class73_462_.selfId * -1718435171 >> 16].aClass73Array1081[(class73_462_.anInt768 * -1604592419 & 0xffff)])) {
							if (class73_462_.selfId * -1718435171 == class73.selfId * -1718435171) {
								bool = true;
								break;
							}
						}
						if (null != class73_462_ && class73 != null && Class619.aClass73_8062 != class73 && !bool)
							class572_sub20.targetInterface = Class619.aClass73_8062;
						else
							class572_sub20.targetInterface = aClass73_8603;
						class572_sub20.params = aClass73_8770.anObjectArray763;
						Class34.executeCs2(class572_sub20, -2123631687);
					}
					if (null != aClass73_8603 && method7993(aClass73_8770) != null)
						Class381.method4648(aClass73_8770, aClass73_8603, (byte) -76);
				} else if ((-343113449 * anInt8637 == 1 || Class461.method5470(-2101797875)) && Class25.anInt172 * 357782167 > 2)
					Class675.method7961((-27579797 * anInt8733 + anInt8772 * 12052287), (anInt8676 * -1634173751 + anInt8782 * -2142372967), (byte) 0);
				else if (Class110.method2073(-634128457))
					Class675.method7961((12052287 * anInt8772 + -27579797 * anInt8733), (anInt8676 * -1634173751 + anInt8782 * -2142372967), (byte) 0);
				aClass73_8770 = null;
				aClass73_8771 = null;
			} else {
				if (Class568.anInt6388 * 1657009747 > aClass73_8770.anInt739 * 2095229683) {
					int i_463_ = i - -27579797 * anInt8733;
					int i_464_ = i_459_ - -2142372967 * anInt8782;
					if (i_463_ > -1961812835 * aClass73_8770.anInt796 || i_463_ < -(-1961812835 * aClass73_8770.anInt796) || i_464_ > -1961812835 * aClass73_8770.anInt796 || i_464_ < -(-1961812835 * aClass73_8770.anInt796))
						aBool8783 = true;
				}
				if (null != aClass73_8770.anObjectArray866 && aBool8783) {
					Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
					class572_sub20.thizInterface = aClass73_8770;
					class572_sub20.anInt9148 = 638530953 * i_460_;
					class572_sub20.anInt9150 = 2034326205 * i_461_;
					class572_sub20.params = aClass73_8770.anObjectArray866;
					Class34.executeCs2(class572_sub20, -1965403972);
				}
			}
		}
	}

	static final void method8068() {
		int[][] is = aClass613_8605.method7356(-1025156038);
		int i = aClass613_8605.method7347(-823043460);
		int i_465_ = aClass613_8605.method7278(277214477);
		for (int i_466_ = 0; i_466_ < i; i_466_++) {
			int[] is_467_ = is[i_466_];
			for (int i_468_ = 0; i_468_ < i_465_; i_468_++)
				is_467_[i_468_] = 0;
		}
	}

	static final void method8069() {
		if (-1784648141 * anInt8604 > 1) {
			anInt8604 -= -425706245;
			anInt8729 = 653930141 * anInt8839;
		}
		if (aClass195_8589.aBool2344) {
			aClass195_8589.aBool2344 = false;
			Class113.method2092(1517097887);
		} else {
			if (!Class25.aBool165)
				Class345.method4317((byte) -115);
			for (int i = 0; i < 100 && MaterialInformation.method1605(aClass195_8589, -30954670); i++) {
				/* empty */
			}
			if (1 == 835742603 * anInt8580) {
				while (Class344.method4315((byte) 105)) {
					Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3753, aClass195_8589.aClass650_2340, -1994906132);
					class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
					int i = (class572_sub25.aRsByteBuffer.o * -1585139053);
					Class190.method2889((class572_sub25.aRsByteBuffer), 48748209);
					class572_sub25.aRsByteBuffer.method8552((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i), 1222726426);
					aClass195_8589.method2929(class572_sub25, (byte) -59);
				}
				if (null != Class273.aClass461_2902) {
					if (633548015 * Class273.aClass461_2902.anInt5216 != -1) {
						Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.GC_PACKET, (aClass195_8589.aClass650_2340), -1611076019);
						if (Class65.aGarbageCollectorMXBean685 == null || !Class65.aGarbageCollectorMXBean685.isValid()) {
							try {
								Iterator iterator = ManagementFactory.getGarbageCollectorMXBeans().iterator();
								while (iterator.hasNext()) {
									GarbageCollectorMXBean garbagecollectormxbean = ((GarbageCollectorMXBean) iterator.next());
									if (garbagecollectormxbean.isValid()) {
										Class65.aGarbageCollectorMXBean685 = garbagecollectormxbean;
										aLong8875 = -6094611317542751281L;
										aLong8737 = -5272074439168099041L;
									}
								}
							} catch (Throwable throwable) {
								/* empty */
							}
						}
						long l = Class69.method1067(-1757977694);
						int i = -1;
						if (null != Class65.aGarbageCollectorMXBean685) {
							long l_469_ = Class65.aGarbageCollectorMXBean685.getCollectionTime();
							if (aLong8737 * 7147685318279086369L != -1L) {
								long l_470_ = (l_469_ - 7147685318279086369L * aLong8737);
								long l_471_ = l - 2681765377846398161L * aLong8875;
								if (0L != l_471_)
									i = (int) (l_470_ * 100L / l_471_);
							}
							aLong8737 = 5272074439168099041L * l_469_;
							aLong8875 = 6094611317542751281L * l;
						}
						class572_sub25.aRsByteBuffer.writeByteC(i, (byte) 0);
						class572_sub25.aRsByteBuffer.writeByte128(-267830063 * anInt7734, -1116434384);
						class572_sub25.aRsByteBuffer.writeShort128(633548015 * Class273.aClass461_2902.anInt5216, -16711936);
						aClass195_8589.method2929(class572_sub25, (byte) -102);
						Class273.aClass461_2902 = null;
						Class324.aLong4087 = (l + 30000L) * 5143952497543217671L;
					}
				} else if (Class69.method1067(-2145098384) >= -5049570460082517065L * Class324.aLong4087)
					Class273.aClass461_2902 = aClass455_8759.method5379((Class633.aClass641_8197.address), 1146973985);
				Class563.method6649((byte) 1);
				Class382.method4650(-1873969875);
				Class572_Sub13 class572_sub13 = (Class572_Sub13) aClass675_8745.method7932((byte) 50);
				if (aClass613_8605.method7285(1176311855) != null) {
					if (5 == 625220759 * Class18.anInt143)
						Class444.method5331((byte) 121);
					else if (625220759 * Class18.anInt143 == 3)
						Class540.method6417((byte) -39);
				}
				if (aBool8681)
					aBool8681 = false;
				else
					aFloat8660 /= 2.0F;
				if (aBool8682)
					aBool8682 = false;
				else
					aFloat8679 /= 2.0F;
				if (IncomingPacket.method4113((byte) 30))
					Class572_Sub36.method8756(1320591941);
				else if (Class18.anInt143 * 625220759 == 1) {
					Class497 class497 = aClass613_8605.method7280((byte) -128);
					int i = class497.localX * -2109597897 << 9;
					int i_472_ = class497.localY * 417324155 << 9;
					if (Class218.aLong2511 * -1389695526323027701L <= 0L)
						Class218.aLong2511 = (Class69.method1067(-2115041907) * 8241051270684000931L);
					float f = (float) (Class69.method1067(-1664224280) - (Class218.aLong2511 * -1389695526323027701L));
					int i_473_ = 1000 / Class425.method5176(1619492871);
					i_473_ *= 1.25;
					for (/**/; f > 0.0F; f -= (float) i_473_) {
						float f_474_ = Math.min(f, (float) i_473_);
						Class133_Sub1.aClass411_Sub1_9827.method5012(f_474_ / 1000.0F, (aClass613_8605.method7293(-1594858382).anIntArrayArrayArray3141), aClass613_8605.method7287((byte) -4), i, i_472_, (byte) -34);
					}
					Class218.aLong2511 = (Class69.method1067(-1921931539) * 8241051270684000931L);
				}
				Class298.method3974(913837639);
				if (anInt8580 * 835742603 == 1) {
					aClass613_8605.method7306(-1042067865).method5978(aClass613_8605, 1669046008);
					Class624.method7451(-1243038640);
					if (-599981499 * anInt8620 > 10)
						((Class195) aClass195_8589).anInt2335 += 707314625;
					if (((Class195) aClass195_8589).anInt2335 * 1070156865 > 2250)
						Class113.method2092(1662954459);
					else {
						if (1797623853 * anInt8646 == 0) {
							Class589.method6993((byte) 0);
							Class194.method2924((byte) -37);
						} else if (Class102_Sub2.aClass494_10268.anInterface57_5489.method320(class572_sub13, anInterface64Array8610, anInt8609 * 2134888631, Class108.aClass549_1426, -1553395344))
							Class133_Sub4.method9339(false, -1082281321);
						else {
							if (2 == anInt8646 * 1797623853 && Class255.method3522(anInt8645 * 1545763299, 1615140874)) {
								aClass613_8605.method7348(new Class598(Class569.aClass569_6394, null), -332528739);
								anInt8646 = 432127727;
							}
							if (1797623853 * anInt8646 == 3 && 18 != anInt8580 * 835742603) {
								Class122.aClass676_1485.method7964((byte) 86);
								anInt8646 = 2007826068;
								anInt8648 = cycles * -1389120501;
								anInt8649 = 0;
								aBool8647 = false;
								Class198.method2976(1732593169);
							}
							if (4 == 1797623853 * anInt8646) {
								int i = cycles - 2129803171 * anInt8648;
								if (-1287240229 * anInt8649 < Class122.aClass133Array1481.length) {
									do {
										Class133 class133 = (Class122.aClass133Array1481[anInt8649 * -1287240229]);
										if (class133.anInt1566 * -762660985 > i)
											break;
										class133.method2303(838082682);
									} while (anInt8646 * 1797623853 == 4 && (((anInt8649 += 807284307) * -1287240229) < (Class122.aClass133Array1481).length));
								}
								if (4 == anInt8646 * 1797623853) {
									for (int i_475_ = 0; i_475_ < (Class122.aClass130Array1483).length; i_475_++) {
										Class130 class130 = (Class122.aClass130Array1483[i_475_]);
										if (class130.aBool1529) {
											Entity class456_sub1_sub2_sub3 = class130.method2268(-1344011142);
											Class461.method5469(class456_sub1_sub2_sub3, true, 172184093);
										}
									}
								}
							}
						}
						Class676.method7976(-1556259008);
						Class433.method5249(743682542);
						Class603.method7145(-1540170417);
						Class71.method1084(false, (byte) 43);
						Class572_Sub16.method8567(Class272_Sub2.aClass106_9517, (Class456_Sub1_Sub3_Sub2.aClass94_11589), 2006042335);
						anInt8674 += 237624865;
						if (0 != 1251161273 * anInt8606) {
							anInt8803 += 1970875452;
							if (-311274581 * anInt8803 >= 400)
								anInt8606 = 0;
						}
						if (Class323.aClass73_4080 != null) {
							anInt8710 += -904830707;
							if (anInt8710 * 1766020549 >= 15) {
								Class555.method6575(Class323.aClass73_4080, (short) 30987);
								Class323.aClass73_4080 = null;
							}
						}
						aClass73_8603 = null;
						aBool8780 = false;
						aBool8775 = false;
						Class383.aClass73_4610 = null;
						Class296.method3964(null, -1, -1, 1819772581);
						if (!aBool8754)
							anInt8751 = 1983555971;
						Class514.method6093(1620798576);
						anInt8839 += -1210150071;
						if (aBool8786) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3710, (aClass195_8589.aClass650_2340), -1631008994);
							class572_sub25.aRsByteBuffer.writeIntV2((Class612.anInt7988 * -36891819 << 28 | Class498.anInt5510 * 863160757 << 14 | Class665_Sub22.anInt9601 * -1817958735), (byte) 1);
							aClass195_8589.method2929(class572_sub25, (byte) -79);
							aBool8786 = false;
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8813.method7920(-1945803963));
							if (class572_sub20 == null)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (class73.activeComponent * -1665128073 >= 0) {
								InterfaceDefinitions class73_476_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -4799);
								if (null == class73_476_ || class73_476_.aClass73Array916 == null || (class73.activeComponent * -1665128073 >= (class73_476_.aClass73Array916).length) || ((class73_476_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2065888550);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8884.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_477_ = Class512.method6083((class73.anInt768 * -1604592419), (short) -14461);
								if (null == class73_477_ || null == class73_477_.aClass73Array916 || (class73.activeComponent * -1665128073 >= (class73_477_.aClass73Array916).length) || ((class73_477_.aClass73Array916[-1665128073 * class73.activeComponent]) != class73))
									continue;
							}
							Class34.executeCs2(class572_sub20, -2109935873);
						}
						for (;;) {
							Cs2LaunchArgs class572_sub20 = ((Cs2LaunchArgs) aClass675_8812.method7920(-1945803963));
							if (null == class572_sub20)
								break;
							InterfaceDefinitions class73 = class572_sub20.thizInterface;
							if (-1665128073 * class73.activeComponent >= 0) {
								InterfaceDefinitions class73_478_ = Class512.method6083((class73.anInt768 * -1604592419), (short) 12823);
								if (class73_478_ == null || class73_478_.aClass73Array916 == null || (-1665128073 * class73.activeComponent >= (class73_478_.aClass73Array916).length) || (class73 != (class73_478_.aClass73Array916[-1665128073 * class73.activeComponent])))
									continue;
							}
							Class34.executeCs2(class572_sub20, -1981567183);
						}
						if (Class383.aClass73_4610 == null)
							anInt8844 = 0;
						if (aClass73_8770 != null)
							Class122.method2197(-1940443173);
						Class15.method654(-1419589884);
						if (-1550439133 * rights > 0 && Class108.aClass549_1426.method6514(82, (byte) 1) && Class108.aClass549_1426.method6514(81, (byte) 1) && anInt8787 * -1840536699 != 0) {
							int i = ((Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009) - -1840536699 * anInt8787);
							if (i < 0)
								i = 0;
							else if (i > 3)
								i = 3;
							Class497 class497 = aClass613_8605.method7280((byte) -98);
							Class21.method703(i, (class497.localX * -2109597897 + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenX[0])), (417324155 * class497.localY + (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.screenY[0])), -1265704528);
						}
						for (int i = 0; i < 5; i++)
							anIntArray8597[i]++;
						if (Class306.clientConfigsDomain.aBool10652 && ((Class306.clientConfigsDomain.aLong10650 * -6175227791626202661L) < Class69.method1067(-2121952498) - 60000L))
							Class614.method7367(239906896);
						Class306.clientConfigsDomain.method9968((byte) 0);
						for (Class591_Sub1 class591_sub1 = ((Class591_Sub1) aClass652_8864.method7697(-651459713)); null != class591_sub1; class591_sub1 = ((Class591_Sub1) aClass652_8864.method7698(-273144878))) {
							if ((long) (-1160847613 * (((Class591_Sub1) class591_sub1).anInt9180)) < (Class69.method1067(-1812748051) / 1000L - 5L)) {
								if (((Class591_Sub1) class591_sub1).aShort9181 > 0)
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3075.method3758(Class594.aClass435_7823, 16711935)).toString(), 2066716806);
								if (0 == (((Class591_Sub1) class591_sub1).aShort9181))
									Class375_Sub3.method8878(5, 0, "", "", "", new StringBuilder().append(((Class591_Sub1) class591_sub1).aString9179).append(Class279.aClass279_3076.method3758(Class594.aClass435_7823, 16711935)).toString(), 1907779229);
								class591_sub1.method7002((byte) 51);
							}
						}
						anInt8819 += 745021087;
						if (anInt8819 * -34112161 > 502) {
							anInt8819 = 0;
							int i = (int) (Math.random() * 8.0);
							if (1 == (i & 0x1))
								anInt8877 += -19134435 * anInt8662;
							if (2 == (i & 0x2))
								anInt8663 += anInt8664 * -1977461499;
							if ((i & 0x4) == 4)
								anInt8665 += -139987683 * anInt8666;
						}
						if (-1037352299 * anInt8877 < -55)
							anInt8662 = -87875006;
						if (anInt8877 * -1037352299 > 54)
							anInt8662 = 87875006;
						if (713494119 * anInt8663 < -55)
							anInt8664 = -2093052074;
						if (anInt8663 * 713494119 > 55)
							anInt8664 = 2093052074;
						if (-706438965 * anInt8665 < -42)
							anInt8666 = 1972333055;
						if (-706438965 * anInt8665 > 44)
							anInt8666 = -1972333055;
						anInt8672 += -1809977439;
						if (anInt8672 * -1605651359 > 505) {
							anInt8672 = 0;
							int i = (int) (Math.random() * 8.0);
							if ((i & 0x1) == 1)
								anInt8766 += 1104829617 * anInt8846;
							if (2 == (i & 0x2))
								anInt8670 += 151185977 * anInt8671;
						}
						if (anInt8766 * -777638353 < -61)
							anInt8846 = -410395906;
						if (anInt8766 * -777638353 > 65)
							anInt8846 = 410395906;
						if (anInt8670 * -1034566343 < -21)
							anInt8671 = 255419729;
						if (-1034566343 * anInt8670 > 12)
							anInt8671 = -255419729;
						aClass195_8589.anInt2337 += 394568993;
						if (aClass195_8589.anInt2337 * -1242489119 > 50) {
							Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3770, (aClass195_8589.aClass650_2340), -1807085617);
							aClass195_8589.method2929(class572_sub25, (byte) -79);
						}
						if (aBool8573) {
							Class425.method5177((short) 14375);
							aBool8573 = false;
						}
						try {
							aClass195_8589.method2936((byte) 11);
						} catch (IOException ioexception) {
							Class113.method2092(2062610650);
						}
					}
				}
			}
		}
	}

	public static void method8070() {
		if (Class554.method6557(-976672039) != Class578.aClass578_7670) {
			try {
				String string = VarTransmitLevel.anApplet8067.getParameter(Class328.aClass328_4186.aString4200);
				int i = ((int) (Class69.method1067(-1692912392) / 86400000L) - 11745);
				String string_479_ = new StringBuilder().append("usrdob=").append(i).append("; version=1; path=/; domain=").append(string).toString();
				Class277.method3717(VarTransmitLevel.anApplet8067, new StringBuilder().append("document.cookie=\"").append(string_479_).append("\"").toString(), (byte) 44);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method8071() {
		Class131.aClass639_Sub2_1540.method7573(813375754);
		Class314.aClass639_Sub6_3814.method7573(890695296);
		Class664.aClass639_Sub22_8490.method7573(-1586767546);
		aClass613_8605.method7288(2023391809).method7573(-202129491);
		Class197.aClass639_Sub15_2360.method7573(622966638);
		Class672.aClass639_Sub5_8533.method7573(-1754223878);
		Class26.aClass639_Sub18_217.method7573(1324806061);
		Class667.aClass639_Sub10_8509.method7573(1438439810);
		Class40_Sub1.aClass639_Sub19_9950.method7573(-76254735);
		Class472.aClass202_Sub1_Sub1_5310.method10203(-920262007);
		Class624.aClass202_Sub1_Sub2_8080.method10211(-1414996179);
		Class92.aClass202_Sub1_Sub2_1240.method10211(-43233304);
		Class544.aClass202_Sub1_Sub2_6109.method10211(-1180243038);
		Class232.aClass202_Sub1_Sub2_2632.method10211(-600849896);
		Class197.aClass639_Sub11_2359.method7573(1491599499);
		Class560.aClass639_Sub1_6348.method7573(924206332);
		Class323.aClass639_Sub12_4081.method7573(1996118802);
		Class273.aClass639_Sub3_2901.method7573(-2048884117);
		Class629.aClass639_Sub20_8111.method7573(636005470);
		Class300.aClass639_Sub13_3489.method7573(-1332870192);
		Class565.aClass639_Sub7_6360.method7573(-1669604466);
		Class653.aClass639_Sub9_8398.method7573(-442314562);
		Class319.aClass639_Sub17_3889.method7573(-1590904791);
		Class506.aClass639_Sub21_5598.method7573(490560983);
		Class457.method5429(-1473238032);
		Class69.method1071((byte) 67);
		Class133_Sub20.aClass324_10261.method4140(-877580992);
		Class412.method5069(-1330030314);
		Class177.method2765(1018275558);
		aClass127_8583.method2234((byte) 72);
		aClass127_8618.method2234((byte) -19);
		Class25.aClass127_194.method2234((byte) 25);
		Class439.aClass127_5083.method2234((byte) 9);
		aClass127_8631.method2234((byte) -80);
	}

	static final void method8072() {
		int i = 1657484935 * Class184.anInt2163;
		int[] is = Class184.anIntArray2154;
		int i_480_ = Class213.aClass572_Sub24_2463.aClass665_Sub26_9240.method9090(2021452939);
		boolean bool = 1 == i_480_ && i > 200 || 0 == i_480_ && i > 50;
		for (int i_481_ = 0; i_481_ < i; i_481_++) {
			Player class456_sub1_sub2_sub3_sub2 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_481_]];
			if (!class456_sub1_sub2_sub3_sub2.method10700((byte) 38))
				class456_sub1_sub2_sub3_sub2.anInt11646 = 2010033325;
			else if (class456_sub1_sub2_sub3_sub2.visible)
				class456_sub1_sub2_sub3_sub2.anInt11646 = 2010033325;
			else {
				class456_sub1_sub2_sub3_sub2.method10469((byte) -46);
				if (class456_sub1_sub2_sub3_sub2.aShort11503 < 0 || class456_sub1_sub2_sub3_sub2.aShort11500 < 0 || (class456_sub1_sub2_sub3_sub2.aShort11499 >= aClass613_8605.method7347(1054251605)) || (class456_sub1_sub2_sub3_sub2.aShort11502 >= aClass613_8605.method7278(277214477)))
					class456_sub1_sub2_sub3_sub2.anInt11646 = 2010033325;
				else {
					class456_sub1_sub2_sub3_sub2.aBool11828 = (class456_sub1_sub2_sub3_sub2.aClass663_Sub2_11631.aBool9556) ? bool : false;
					if (class456_sub1_sub2_sub3_sub2 == Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
						class456_sub1_sub2_sub3_sub2.anInt11646 = -137450323;
					else {
						int i_482_ = 0;
						if (!class456_sub1_sub2_sub3_sub2.aBool11612)
							i_482_++;
						if (!class456_sub1_sub2_sub3_sub2.aClass652_11627.method7699(1567783957))
							i_482_ += 2;
						i_482_ += 5 - class456_sub1_sub2_sub3_sub2.method10556((short) -24057) << 2;
						if ((Class47.aClass47_467 != class456_sub1_sub2_sub3_sub2.aClass47_11837) || class456_sub1_sub2_sub3_sub2.isClanMember)
							i_482_ += 512;
						else {
							if (0 == anInt8704 * 1777342339)
								i_482_ += 32;
							else
								i_482_ += 128;
							i_482_ += 256;
						}
						class456_sub1_sub2_sub3_sub2.anInt11646 = -2010033325 * (1 + i_482_);
					}
				}
			}
		}
		for (int i_483_ = 0; i_483_ < 765313669 * anInt8625; i_483_++) {
			NPC class456_sub1_sub2_sub3_sub1 = ((NPC) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i_483_])).anObject9081));
			if (!class456_sub1_sub2_sub3_sub1.method10683((byte) -51) || !(class456_sub1_sub2_sub3_sub1.aClass410_11803.method4963(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, (byte) 2)))
				class456_sub1_sub2_sub3_sub1.anInt11646 = 2010033325;
			else {
				class456_sub1_sub2_sub3_sub1.method10469((byte) 36);
				if (class456_sub1_sub2_sub3_sub1.aShort11503 < 0 || class456_sub1_sub2_sub3_sub1.aShort11500 < 0 || (class456_sub1_sub2_sub3_sub1.aShort11499 >= aClass613_8605.method7347(-821412883)) || (class456_sub1_sub2_sub3_sub1.aShort11502 >= aClass613_8605.method7278(277214477)))
					class456_sub1_sub2_sub3_sub1.anInt11646 = 2010033325;
				else {
					int i_484_ = 0;
					if (!class456_sub1_sub2_sub3_sub1.aBool11612)
						i_484_++;
					if (!class456_sub1_sub2_sub3_sub1.aClass652_11627.method7699(1426720866))
						i_484_ += 2;
					i_484_ += 5 - class456_sub1_sub2_sub3_sub1.method10556((short) -23541) << 2;
					if (anInt8704 * 1777342339 == 0) {
						if (class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4814)
							i_484_ += 64;
						else
							i_484_ += 128;
					} else if (1 == 1777342339 * anInt8704) {
						if (class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4814)
							i_484_ += 32;
						else
							i_484_ += 64;
					}
					if (class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4815)
						i_484_ += 1024;
					else if (!class456_sub1_sub2_sub3_sub1.aClass410_11803.aBool4816)
						i_484_ += 256;
					class456_sub1_sub2_sub3_sub1.anInt11646 = (i_484_ + 1) * -2010033325;
				}
			}
		}
		for (int i_485_ = 0; i_485_ < aClass193Array8593.length; i_485_++) {
			Class193 class193 = aClass193Array8593[i_485_];
			if (class193 != null) {
				if (1 == class193.anInt2319 * -910441311) {
					LinkableObject class572_sub9 = ((LinkableObject) aClass676_8622.get((long) (105420277 * (class193.anInt2316))));
					if (null != class572_sub9) {
						NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
						if ((class456_sub1_sub2_sub3_sub1.anInt11646 * 1371302107) >= 0)
							class456_sub1_sub2_sub3_sub1.anInt11646 += -1969580032;
					}
				} else if (-910441311 * class193.anInt2319 == 10) {
					Player class456_sub1_sub2_sub3_sub2 = (aClass456_Sub1_Sub2_Sub3_Sub2Array8727[class193.anInt2316 * 105420277]);
					if (null != class456_sub1_sub2_sub3_sub2 && (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 != class456_sub1_sub2_sub3_sub2) && (1371302107 * class456_sub1_sub2_sub3_sub2.anInt11646) >= 0)
						class456_sub1_sub2_sub3_sub2.anInt11646 += -1969580032;
				}
			}
		}
	}

	public static void method8073() {
		for (int i = 0; i < 107; i++)
			aBoolArray8784[i] = true;
	}

	public static final void method8074() {
		if (!aBool8682) {
			aFloat8679 += (-24.0F - aFloat8679) / 2.0F;
			aBool8685 = true;
			aBool8682 = true;
		}
	}

	final void method6913() {
		if (anInt8580 * 835742603 != 19) {
			long l = (Class383.method4654(-464816525) / 1000000L - 8269747268912723799L * aLong8584);
			aLong8584 = (Class383.method4654(516563496) / 1000000L * -1616926548718902169L);
			if (Class288.method3883(835742603 * anInt8580, 1505762020)) {
				if (0L != -233185957257094165L * aLong8720 && (Class69.method1067(-2083997119) > aLong8720 * -233185957257094165L))
					Class572_Sub8_Sub1.method10279(Class344_Sub2.method9253(-613999667), -1, -1, false, 623786968);
				else if (!Class272_Sub2.aClass106_9517.method1672() && aBool7770)
					Class133_Sub3.method9336(1479511687);
			}
			if (Class554.aFrame6320 == null) {
				Container container = Class591_Sub5.method8786((byte) 62);
				int i = container.getSize().width;
				int i_486_ = container.getSize().height;
				if (Class18.aFrame142 == container) {
					Insets insets = Class18.aFrame142.getInsets();
					i -= insets.left + insets.right;
					i_486_ -= insets.bottom + insets.top;
				}
				if (-1987897329 * Class656.anInt8418 != i || -257945127 * Class287.anInt3421 != i_486_ || aBool8599) {
					if (Class272_Sub2.aClass106_9517 == null || Class272_Sub2.aClass106_9517.method1673())
						Class102_Sub5.method9947(-2051301214);
					else {
						Class656.anInt8418 = i * -276769041;
						Class287.anInt3421 = i_486_ * 1011048041;
					}
					aLong8720 = ((Class69.method1067(-1749055089) + 500L) * -6983079052808391485L);
					aBool8599 = false;
				}
			}
			if (Class637.aBool8266 && null != Class554.aFrame6320 && !Class408.aBool4780 && Class288.method3883(835742603 * anInt8580, 312742577))
				Class572_Sub8_Sub1.method10279(Class213.aClass572_Sub24_2463.aClass665_Sub20_9234.method9038(1656297773), -1, -1, false, 623786968);
			boolean bool = false;
			if (aBool7746) {
				aBool7746 = false;
				bool = true;
			}
			if (bool)
				Class107.method2060(-99276952);
			if ((Class272_Sub2.aClass106_9517 != null && Class272_Sub2.aClass106_9517.method1672()) || Class344_Sub2.method9253(967243937) != 1)
				Class54.method987((byte) 46);
			if (Class664.method7853(835742603 * anInt8580, (short) -1989))
				Class570_Sub1.method8798(bool, (byte) -66);
			else if (Class425.method5175(anInt8580 * 835742603, (byte) -90))
				Class501.method5995((short) -29515);
			else if (Class185.method2844(anInt8580 * 835742603, (byte) -119))
				Class501.method5995((short) -20028);
			else if (Class177.method2766(anInt8580 * 835742603, (short) 25467)) {
				if (aClass613_8605.method7339((byte) -25) == Class614.aClass614_8035) {
					int i = aClass613_8605.method7279(-1169581227) / 2;
					Class677.method7987(new StringBuilder().append(Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)).append(Class3.aString25).append("(").append(i).append("%)").toString(), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 1317040029);
				} else if (aClass613_8605.method7339((byte) -59) == Class614.aClass614_8036) {
					int i = 50 + aClass613_8605.method7282((byte) 63) / 2;
					Class677.method7987(new StringBuilder().append(Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)).append(Class3.aString25).append("(").append(i).append("%)").toString(), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 1382019072);
				} else
					Class677.method7987((Class279.aClass279_3016.method3758(Class594.aClass435_7823, 16711935)), true, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 2074655503);
			} else if (835742603 * anInt8580 == 1)
				Class503.method6018(l);
			else if (13 == 835742603 * anInt8580)
				Class677.method7987(new StringBuilder().append(Class279.aClass279_3050.method3758(Class594.aClass435_7823, 16711935)).append(Class3.aString25).append(Class279.aClass279_3051.method3758(Class594.aClass435_7823, 16711935)).toString(), false, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 69128414);
			else if (anInt8580 * 835742603 == 14)
				Class677.method7987((Class279.aClass279_3088.method3758(Class594.aClass435_7823, 16711935)), false, Class272_Sub2.aClass106_9517, Class512.aClass102_5703, Class26.aClass284_215, 1765706233);
			if (1164535207 * anInt8595 == 3) {
				for (int i = 0; i < 983810053 * anInt8560; i++) {
					Rectangle rectangle = aRectangleArray8708[i];
					if (aBoolArray8820[i])
						Class272_Sub2.aClass106_9517.method1982(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, (byte) -28);
					else
						Class272_Sub2.aClass106_9517.method1982(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, (byte) -58);
				}
			}
			if (ItemsContainer.method8674(1274679454))
				Class639.method7582(Class272_Sub2.aClass106_9517, (short) -4844);
			if (!Class664.method7853(835742603 * anInt8580, (short) -13480) && !Class177.method2766(835742603 * anInt8580, (short) 3812) && anInt8790 * -507155049 != -1) {
				try {
					Class272_Sub2.aClass106_9517.method1747();
					Class113.method2088(Class272_Sub2.aClass106_9517, Class69.method1067(-2141619913), 1960824389 * Class269.anInt2861, anInt7739 * -530390519, -35617542);
					Class272_Sub2.aClass106_9517.method1966(-359276623);
				} catch (Exception_Sub1 exception_sub1) {
					Class640.method7592(new StringBuilder().append(exception_sub1.getMessage()).append(" ").append(method6946((byte) 104)).toString(), exception_sub1, 1172934844);
					switch (Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(2040282938)) {
						default:
							BaseVarType.method7260(0, false, 1730452581);
							break;
						case 3:
							Class456_Sub1_Sub5.method10475(exception_sub1.method10175((short) -29091), (byte) 4);
							BaseVarType.method7260(1, false, 1607145277);
					}
				}
			}
			int i = Class213.aClass572_Sub24_2463.aClass665_Sub33_9238.method9169((byte) -45);
			if (i == 0)
				Class198.method2977(15L);
			else if (i == 1)
				Class198.method2977(10L);
			else if (2 == i)
				Class198.method2977(5L);
			else if (i == 3)
				Class198.method2977(2L);
			if (aBool8867)
				Class400.method4772((byte) -30);
			if (Class213.aClass572_Sub24_2463.aClass665_Sub22_9207.method9048(618602680) == 1 && 12 == 835742603 * anInt8580 && -507155049 * anInt8790 != -1) {
				Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub22_9207, 0, 1801270834);
				Class623.method7443(-1756883024);
			}
		}
	}

	public static void method8075() {
		for (int i = 0; i < 107; i++)
			aBoolArray8784[i] = true;
	}

	void method8076(int i) {
		if (53108039 * Class51.aClass278_491.anInt2942 > -7739557 * anInt8638) {
			Class633.aClass641_8197.method7596((byte) 43);
			anInt8615 = Class51.aClass278_491.anInt2942 * -1794652586 - -1804772870;
			if (anInt8615 * -936330879 > 3000)
				anInt8615 = -182437960;
			if (53108039 * Class51.aClass278_491.anInt2942 >= 2 && Class51.aClass278_491.anInt2943 * -2020283055 == 6) {
				method6906("js5connect_outofdate", 1901929937);
				anInt8580 = 871263897;
				return;
			}
			if (53108039 * Class51.aClass278_491.anInt2942 >= 1 && 48 == Class51.aClass278_491.anInt2943 * -2020283055) {
				method6906("sessionexpired", 1375096333);
				anInt8580 = 871263897;
				return;
			}
			if (Class51.aClass278_491.anInt2942 * 53108039 >= 4 && -2020283055 * Class51.aClass278_491.anInt2943 == -1) {
				method6907("js5crc", new StringBuilder().append("a=").append(1636864639 * Class51.aClass278_491.anInt2944).append("&g=").append(1917444697 * Class51.aClass278_491.anInt2945).toString(), 2128298158);
				anInt8580 = 871263897;
				return;
			}
			if (53108039 * Class51.aClass278_491.anInt2942 >= 4 && Class664.method7853(anInt8580 * 835742603, (short) -23791)) {
				if (7 == -2020283055 * Class51.aClass278_491.anInt2943 || 9 == Class51.aClass278_491.anInt2943 * -2020283055)
					method6906("js5connect_full", 1943575753);
				else if (Class51.aClass278_491.anInt2943 * -2020283055 > 0) {
					if (aString8619 == null)
						method6906("js5connect", 1613432760);
					else
						method6906(new StringBuilder().append("js5proxy_").append(aString8619.trim()).toString(), 1468703781);
				} else
					method6906("js5io", 752471783);
				anInt8580 = 871263897;
				return;
			}
		}
		anInt8638 = Class51.aClass278_491.anInt2942 * -418221691;
		if (anInt8615 * -936330879 > 0)
			anInt8615 -= 1624868481;
		else {
			try {
				if (-1396889455 * anInt8814 == 0) {
					Class436.aSocket5067 = Class633.aClass641_8197.method7594((short) 5426);
					anInt8814 += 658217073;
				}
				if (-1396889455 * anInt8814 == 1) {
					Class13.aClass555_117 = Class402_Sub1.method9215(Class436.aSocket5067, 125000, 1808985637);
					int i_487_ = 9 + aString8838.length();
					RSByteBuffer class572_sub15 = new RSByteBuffer(2 + i_487_);
					class572_sub15.writeByte((Class315.aClass315_3816.anInt3827) * -540596227, -1384395473);
					class572_sub15.writeByte(i_487_, -1384395473);
					class572_sub15.writeInt(831, -1743753997);
					class572_sub15.writeInt(RS3Applet.MINOR_VERSION, -1743753997);
					class572_sub15.writeString(aString8838, (byte) -58);
					Class13.aClass555_117.method6570((class572_sub15.b), 0, i_487_ + 2, (byte) 100);
					anInt8814 += 658217073;
					VarDomainType.aLong2897 = (Class69.method1067(-1713063102) * -3203892206491225397L);
				}
				if (-1396889455 * anInt8814 == 2) {
					if (Class13.aClass555_117.method6559(1, 821354819)) {
						byte[] is = new byte[1];
						int i_488_ = Class13.aClass555_117.method6560(is, 0, 1, 1504674589);
						if (is[0] != 0) {
							method7988(i_488_, -1403284564);
							return;
						}
						anInt8814 += 658217073;
					} else if ((Class69.method1067(-2022902108) - VarDomainType.aLong2897 * 2734004556870820579L) > 30000L) {
						method7988(1001, -1449705863);
						return;
					}
				}
				if (3 == anInt8814 * -1396889455) {
					Class249[] class249s = Class249.method3434((byte) -121);
					int i_489_ = class249s.length * 4;
					if (Class13.aClass555_117.method6559(i_489_, -37658583)) {
						RSByteBuffer class572_sub15 = new RSByteBuffer(i_489_);
						Class13.aClass555_117.method6560(class572_sub15.b, 0, class572_sub15.b.length, 2127627694);
						for (int i_490_ = 0; i_490_ < class249s.length; i_490_++)
							class249s[i_490_].method3424(class572_sub15.readInt(369275238), 1426362707);
						boolean bool = (Class664.method7853(835742603 * anInt8580, (short) -22022) || Class133_Sub12.method9368((anInt8580 * 835742603), 2134888631) || Class19.method692(835742603 * anInt8580, (byte) 4));
						Class51.aClass278_491.method3738(Class13.aClass555_117, !bool, 1054268302);
						Class436.aSocket5067 = null;
						Class13.aClass555_117 = null;
						anInt8814 = 0;
					}
				}
			} catch (IOException ioexception) {
				method7988(1002, 1843428165);
			}
		}
	}

	static boolean method8077(InterfaceDefinitions class73) {
		if (aBool8763) {
			if (method7992(class73).anInt9311 * 2066234753 != 0)
				return false;
			if (-1285279191 * class73.anInt752 == 0)
				return false;
		}
		return class73.aBool769;
	}

	static final void method8078() {
		int i = Class184.anInt2163 * 1657484935;
		int[] is = Class184.anIntArray2154;
		int i_491_;
		if (anInt8646 * 1797623853 == 4)
			i_491_ = Class122.aClass130Array1483.length;
		else
			i_491_ = aBool8633 ? i : i + anInt8625 * 765313669;
		for (int i_492_ = 0; i_492_ < i_491_; i_492_++) {
			Entity class456_sub1_sub2_sub3;
			if (1797623853 * anInt8646 == 4) {
				Class130 class130 = Class122.aClass130Array1483[i_492_];
				if (!class130.aBool1529)
					continue;
				class456_sub1_sub2_sub3 = class130.method2268(-1577503672);
			} else {
				if (i_492_ < i)
					class456_sub1_sub2_sub3 = aClass456_Sub1_Sub2_Sub3_Sub2Array8727[is[i_492_]];
				else
					class456_sub1_sub2_sub3 = ((Entity) (((LinkableObject) aClass676_8622.get((long) anIntArray8626[i_492_ - i])).anObject9081));
				if (1371302107 * class456_sub1_sub2_sub3.anInt11646 < 0)
					continue;
			}
			int i_493_ = class456_sub1_sub2_sub3.method10556((short) -17454);
			Class240 class240 = class456_sub1_sub2_sub3.method5394().aClass240_2647;
			if ((i_493_ & 0x1) == 0) {
				if (((int) class240.aFloat2653 & 0x1ff) == 0 && 0 == ((int) class240.aFloat2657 & 0x1ff))
					continue;
			} else if (((int) class240.aFloat2653 & 0x1ff) == 256 && 256 == ((int) class240.aFloat2657 & 0x1ff))
				continue;
			class456_sub1_sub2_sub3.method5395(class240.aFloat2653, (float) Class314.method4072((int) class240.aFloat2653, (int) class240.aFloat2657, class456_sub1_sub2_sub3.aByte9009, -2113304954), class240.aFloat2657);
			aClass613_8605.method7285(1855104003).method6232(class456_sub1_sub2_sub3, true, 133764585);
		}
	}

	public final void method411() {
		if (method6897(-1585612091)) {
			String string = "";
			Class328[] class328s = Class570_Sub1.method8797(1831423499);
			for (int i = 0; i < class328s.length; i++) {
				Class328 class328 = class328s[i];
				String string_494_ = VarTransmitLevel.anApplet8067.getParameter(class328.aString4200);
				if (null != string_494_) {
					switch (Integer.parseInt(class328.aString4200)) {
						case 24:
							aString8571 = string_494_;
							break;
						case 31:
							if (string_494_.equals(Class3.aString29))
								aBool8602 = true;
							else
								aBool8602 = false;
							break;
						case 28:
							Class572_Sub25.aString9256 = string_494_;
							break;
						case 21:
							break;
						case 41:
							if (string_494_.equalsIgnoreCase(Class3.aString29))
								aBool8840 = true;
							else
								aBool8840 = false;
							break;
						case 9:
							if (string_494_ != null) {
								aByteArray8565 = (Class129.method2263(Class413.method5083(string_494_, 1467216848), (byte) 26));
								if (aByteArray8565.length < 16)
									aByteArray8565 = null;
							}
							break;
						case 38:
							Class151.aClass434_1702 = ((Class434) Class455.method5387(Class434.method5251(1742895669), Integer.parseInt(string_494_), -1969989048));
							if (Class151.aClass434_1702 == Class434.aClass434_5047)
								Class151.aClass434_1702 = Class434.aClass434_5039;
							else if (!(Class151.aClass434_1702.method5252(Class440.aClass440_5094, 1747598906)) && (Class434.aClass434_5044 != Class151.aClass434_1702))
								Class151.aClass434_1702 = Class434.aClass434_5044;
							break;
						case 23:
							anInt8773 = Integer.parseInt(string_494_) * 32360817;
							break;
						case 35:
							aString8570 = string_494_;
							if (aString8570.length() > 100)
								aString8570 = null;
							break;
						case 27:
							if (Class633.aClass641_8208 == null)
								Class633.aClass641_8208 = new RSSocket(true);
							Class633.aClass641_8208.id = Integer.parseInt(string_494_) * -1002799573;
							break;
						case 14:
							anInt8808 = Integer.parseInt(string_494_) * 219718357;
							break;
						case 4:
							if (string_494_.equalsIgnoreCase(Class3.aString29))
								aBool8612 = true;
							else
								aBool8612 = false;
							break;
						case 10:
							Class133_Sub19.aString10255 = string_494_;
							break;
						case 29:
							if (string_494_.equals(Class3.aString29))
								aBool8564 = true;
							else
								aBool8564 = false;
							break;
						case 1:
							Class7.aString38 = string_494_;
							break;
						case 16:
							if (string_494_.equalsIgnoreCase(Class3.aString29)) {
								/* empty */
							}
							break;
						case 40:
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(true);
							Class633.aClass641_8196.address = string_494_;
							break;
						default:
							Class640.method7592("", new RuntimeException(), 886282480);
							break;
						case 32:
							if (string_494_.equalsIgnoreCase(Class3.aString29))
								aBool8574 = true;
							else
								aBool8574 = false;
							break;
						case 39:
							Class633.aClass641_8203 = new RSSocket(false);
							Class633.aClass641_8203.id = Integer.parseInt(string_494_) * -1002799573;
							break;
						case 34:
							break;
						case 20:
							if (Class633.aClass641_8208 == null)
								Class633.aClass641_8208 = new RSSocket(true);
							Class633.aClass641_8208.address = string_494_;
							break;
						case 5:
							anInt8566 = Integer.parseInt(string_494_) * -1373900613;
							break;
						case 12:
							if (string_494_.equalsIgnoreCase(Class3.aString29))
								aBool8659 = true;
							break;
						case 26:
							aString8561 = string_494_;
							break;
						case 25:
							Class594.aClass435_7823 = Class435.method5257(Integer.parseInt(string_494_), 16711680);
							break;
						case 6:
							if (string_494_.equalsIgnoreCase(Class3.aString29))
								aBool8621 = true;
							else
								aBool8621 = false;
							break;
						case 2:
							Class34.aClass653_383 = Class310.method4048(Integer.parseInt(string_494_), 1179466163);
							if (Class34.aClass653_383 != Class653.aClass653_8394 && Class34.aClass653_383 != Class653.aClass653_8393 && Class34.aClass653_383 != Class653.aClass653_8395 && (Class653.aClass653_8396 != Class34.aClass653_383))
								Class34.aClass653_383 = Class653.aClass653_8396;
							break;
						case 36:
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(true);
							Class633.aClass641_8196.id = Integer.parseInt(string_494_) * -1002799573;
							break;
						case 37:
							break;
						case 8:
							aString8579 = string_494_;
							break;
						case 18:
							aString8838 = string_494_;
							break;
						case 7:
							break;
						case 42:
							string = string_494_;
							break;
						case 15:
							aString8572 = string_494_;
							break;
						case 11:
							if (string_494_.equalsIgnoreCase(Class3.aString29))
								aBool8559 = true;
							else
								aBool8559 = false;
							break;
						case 43:
							anInt8567 = Integer.parseInt(string_494_) * 588589493;
							break;
						case 33:
							Class21.anInt148 = Integer.parseInt(string_494_) * 2146443313;
							break;
						case 30:
							aClass437_8705 = Class17.method676(Integer.parseInt(string_494_), 1983068885);
							if (Class437.aClass437_5072 == aClass437_8705)
								Class414.aClass207_4922 = PacketsDecoder.aClass207_2420;
							else
								Class414.aClass207_4922 = PacketsDecoder.aClass207_2426;
							break;
						case 22: {
							boolean bool = string_494_.equals(Class3.aString29);
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(bool);
							else
								Class633.aClass641_8196.aBool8289 = bool;
							break;
						}
						case 13:
							Class382.anInt4603 = Integer.parseInt(string_494_) * -501600039;
							break;
						case 3:
							anInt8617 = Integer.parseInt(string_494_) * -535793001;
							if (-826921689 * anInt8617 < 0 || (anInt8617 * -826921689 >= aColorArray8611.length))
								anInt8617 = 0;
					}
				}
			}
			if (aString8561 == null)
				aString8561 = "";
			Class579 class579 = new Class579(-507276561 * anInt8724, anInt8725 * -199235591, 1392353663 * anInt8644, anInt8723 * -217690121, aClass437_8705.aString5075);
			Class278_Sub1.aclient9503 = this;
			String string_495_ = Class34.aClass653_383.aString8391;
			int i = Class34.aClass653_383.anInt8397 * -591702641 + 32;
			if (!string.equals("")) {
				string_495_ = new StringBuilder().append(string_495_).append("_").append(string).toString();
				i = 0;
			}
			method6892(class579, aClass437_8705.aString5074, string_495_, i, Class572_Sub10.method8408(291201899), 831, 1, aBool8612, 16711680);
		}
	}

	public final void method414() {
		if (method6897(937995216)) {
			String string = "";
			Class328[] class328s = Class570_Sub1.method8797(-1638126907);
			for (int i = 0; i < class328s.length; i++) {
				Class328 class328 = class328s[i];
				String string_496_ = VarTransmitLevel.anApplet8067.getParameter(class328.aString4200);
				if (null != string_496_) {
					switch (Integer.parseInt(class328.aString4200)) {
						case 24:
							aString8571 = string_496_;
							break;
						case 31:
							if (string_496_.equals(Class3.aString29))
								aBool8602 = true;
							else
								aBool8602 = false;
							break;
						case 28:
							Class572_Sub25.aString9256 = string_496_;
							break;
						case 21:
							break;
						case 41:
							if (string_496_.equalsIgnoreCase(Class3.aString29))
								aBool8840 = true;
							else
								aBool8840 = false;
							break;
						case 9:
							if (string_496_ != null) {
								aByteArray8565 = (Class129.method2263(Class413.method5083(string_496_, 1668722425), (byte) 69));
								if (aByteArray8565.length < 16)
									aByteArray8565 = null;
							}
							break;
						case 38:
							Class151.aClass434_1702 = (Class434) (Class455.method5387(Class434.method5251(-1430433590), Integer.parseInt(string_496_), -2050743994));
							if (Class151.aClass434_1702 == Class434.aClass434_5047)
								Class151.aClass434_1702 = Class434.aClass434_5039;
							else if (!(Class151.aClass434_1702.method5252(Class440.aClass440_5094, 705204038)) && (Class434.aClass434_5044 != Class151.aClass434_1702))
								Class151.aClass434_1702 = Class434.aClass434_5044;
							break;
						case 23:
							anInt8773 = Integer.parseInt(string_496_) * 32360817;
							break;
						case 35:
							aString8570 = string_496_;
							if (aString8570.length() > 100)
								aString8570 = null;
							break;
						case 27:
							if (Class633.aClass641_8208 == null)
								Class633.aClass641_8208 = new RSSocket(true);
							Class633.aClass641_8208.id = Integer.parseInt(string_496_) * -1002799573;
							break;
						case 14:
							anInt8808 = Integer.parseInt(string_496_) * 219718357;
							break;
						case 4:
							if (string_496_.equalsIgnoreCase(Class3.aString29))
								aBool8612 = true;
							else
								aBool8612 = false;
							break;
						case 10:
							Class133_Sub19.aString10255 = string_496_;
							break;
						case 29:
							if (string_496_.equals(Class3.aString29))
								aBool8564 = true;
							else
								aBool8564 = false;
							break;
						case 1:
							Class7.aString38 = string_496_;
							break;
						case 16:
							if (string_496_.equalsIgnoreCase(Class3.aString29)) {
								/* empty */
							}
							break;
						case 40:
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(true);
							Class633.aClass641_8196.address = string_496_;
							break;
						default:
							Class640.method7592("", new RuntimeException(), 1261538061);
							break;
						case 32:
							if (string_496_.equalsIgnoreCase(Class3.aString29))
								aBool8574 = true;
							else
								aBool8574 = false;
							break;
						case 39:
							Class633.aClass641_8203 = new RSSocket(false);
							Class633.aClass641_8203.id = Integer.parseInt(string_496_) * -1002799573;
							break;
						case 34:
							break;
						case 20:
							if (Class633.aClass641_8208 == null)
								Class633.aClass641_8208 = new RSSocket(true);
							Class633.aClass641_8208.address = string_496_;
							break;
						case 5:
							anInt8566 = Integer.parseInt(string_496_) * -1373900613;
							break;
						case 12:
							if (string_496_.equalsIgnoreCase(Class3.aString29))
								aBool8659 = true;
							break;
						case 26:
							aString8561 = string_496_;
							break;
						case 25:
							Class594.aClass435_7823 = Class435.method5257(Integer.parseInt(string_496_), 16711680);
							break;
						case 6:
							if (string_496_.equalsIgnoreCase(Class3.aString29))
								aBool8621 = true;
							else
								aBool8621 = false;
							break;
						case 2:
							Class34.aClass653_383 = Class310.method4048(Integer.parseInt(string_496_), 1179466163);
							if (Class34.aClass653_383 != Class653.aClass653_8394 && Class34.aClass653_383 != Class653.aClass653_8393 && Class34.aClass653_383 != Class653.aClass653_8395 && (Class653.aClass653_8396 != Class34.aClass653_383))
								Class34.aClass653_383 = Class653.aClass653_8396;
							break;
						case 36:
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(true);
							Class633.aClass641_8196.id = Integer.parseInt(string_496_) * -1002799573;
							break;
						case 37:
							break;
						case 8:
							aString8579 = string_496_;
							break;
						case 18:
							aString8838 = string_496_;
							break;
						case 7:
							break;
						case 42:
							string = string_496_;
							break;
						case 15:
							aString8572 = string_496_;
							break;
						case 11:
							if (string_496_.equalsIgnoreCase(Class3.aString29))
								aBool8559 = true;
							else
								aBool8559 = false;
							break;
						case 43:
							anInt8567 = Integer.parseInt(string_496_) * 588589493;
							break;
						case 33:
							Class21.anInt148 = Integer.parseInt(string_496_) * 2146443313;
							break;
						case 30:
							aClass437_8705 = Class17.method676(Integer.parseInt(string_496_), 338934825);
							if (Class437.aClass437_5072 == aClass437_8705)
								Class414.aClass207_4922 = PacketsDecoder.aClass207_2420;
							else
								Class414.aClass207_4922 = PacketsDecoder.aClass207_2426;
							break;
						case 22: {
							boolean bool = string_496_.equals(Class3.aString29);
							if (Class633.aClass641_8196 == null)
								Class633.aClass641_8196 = new RSSocket(bool);
							else
								Class633.aClass641_8196.aBool8289 = bool;
							break;
						}
						case 13:
							Class382.anInt4603 = Integer.parseInt(string_496_) * -501600039;
							break;
						case 3:
							anInt8617 = Integer.parseInt(string_496_) * -535793001;
							if (-826921689 * anInt8617 < 0 || (anInt8617 * -826921689 >= aColorArray8611.length))
								anInt8617 = 0;
					}
				}
			}
			if (aString8561 == null)
				aString8561 = "";
			Class579 class579 = new Class579(-507276561 * anInt8724, anInt8725 * -199235591, 1392353663 * anInt8644, anInt8723 * -217690121, aClass437_8705.aString5075);
			Class278_Sub1.aclient9503 = this;
			String string_497_ = Class34.aClass653_383.aString8391;
			int i = Class34.aClass653_383.anInt8397 * -591702641 + 32;
			if (!string.equals("")) {
				string_497_ = new StringBuilder().append(string_497_).append("_").append(string).toString();
				i = 0;
			}
			method6892(class579, aClass437_8705.aString5074, string_497_, i, Class572_Sub10.method8408(-934826224), 831, 1, aBool8612, 16711680);
		}
	}
}

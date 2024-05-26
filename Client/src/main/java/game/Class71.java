package game;

/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class71 {
	public Class167 aClass167_709;
	public int anInt710;
	public int anInt711;
	public int[] anIntArray712;
	public int[] anIntArray713;
	int anInt714;

	public boolean method1081(int i, int i_0_, int i_1_) {
		if (i_0_ >= 0 && i_0_ < anIntArray712.length) {
			int i_2_ = anIntArray712[i_0_];
			if (i >= i_2_ && i <= i_2_ + anIntArray713[i_0_])
				return true;
		}
		return false;
	}

	Class71(int i, int i_3_, int[] is, int[] is_4_, Class167 class167, int i_5_) {
		anInt711 = 979984539 * i;
		anInt710 = i_3_ * 761373205;
		anIntArray713 = is;
		anIntArray712 = is_4_;
		aClass167_709 = class167;
		((Class71) this).anInt714 = i_5_ * -1440668655;
	}

	static final void method1082(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		class73.anInt803 = 771890247 * (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		class73.anInt794 = ((((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]) * 2093728617);
		if (1 == (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]))
			class73.anInt892 = -1472528801;
		else
			class73.anInt892 = 599959864;
		if (1 == (((Cs2Executor) class441).intStack[3 + ((Cs2Executor) class441).intStackPtr * 1369304407]))
			class73.aBool864 = true;
		else
			class73.aBool864 = false;
		if (-1665128073 * class73.activeComponent == -1 && !class83.aBool1079)
			Class309.method4043(-1718435171 * class73.selfId, 431819876);
	}

	static final void method1083(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_6_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_7_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).aClass305_5105.anIntArray3539[i_6_] = i_7_;
	}

	static void method1084(boolean bool, byte i) {
		Class497 class497 = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10530(-1486250401);
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547_Sub1.method6460(-2109597897 * class497.localX, 417324155 * class497.localY);
		if (null == class572_sub12_sub5)
			class572_sub12_sub5 = Class547_Sub1.method6461(-808595613 * (Class547_Sub1.aClass482_6181.anInt5380));
		if (Class483.aClass572_Sub12_Sub5_5389 != class572_sub12_sub5 || bool) {
			Class483.aClass572_Sub12_Sub5_5389 = class572_sub12_sub5;
			boolean bool_8_ = Class547_Sub1.method6486(class572_sub12_sub5);
			if (bool_8_) {
				Class547_Sub1.aBool6178 = true;
				Class537.method6386(-1704476069);
			}
		}
	}

	static String method1085(Throwable throwable, int i) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub5) {
			RuntimeException_Sub5 runtimeexception_sub5 = (RuntimeException_Sub5) throwable;
			string = new StringBuilder().append(((RuntimeException_Sub5) runtimeexception_sub5).aString11787).append(" | ").toString();
			throwable = (((RuntimeException_Sub5) runtimeexception_sub5).aThrowable11788);
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_9_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_9_));
		String string_10_ = bufferedreader.readLine();
		for (;;) {
			String string_11_ = bufferedreader.readLine();
			if (string_11_ == null)
				break;
			int i_12_ = string_11_.indexOf('(');
			int i_13_ = string_11_.indexOf(')', i_12_ + 1);
			String string_14_;
			if (i_12_ != -1)
				string_14_ = string_11_.substring(0, i_12_);
			else
				string_14_ = string_11_;
			string_14_ = string_14_.trim();
			string_14_ = string_14_.substring(string_14_.lastIndexOf(' ') + 1);
			string_14_ = string_14_.substring(string_14_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_14_).toString();
			if (-1 != i_12_ && i_13_ != -1) {
				int i_15_ = string_11_.indexOf(".java:", i_12_);
				if (i_15_ >= 0)
					string = new StringBuilder().append(string).append(string_11_.substring(i_15_ + 5, i_13_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_10_).toString();
		return string;
	}
}

package game;

/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Class488 {
	static boolean aBool5450 = false;
	static final int anInt5451 = 1;
	static final int anInt5452 = -1;
	static final int anInt5453 = 2;
	public static int anInt5454;
	static Class481_Sub1[] aClass481_Sub1Array5455;
	public static int anInt5456;

	static void method5804(RSByteBuffer class572_sub15) {
		for (int i = 0; i < -1261354053 * anInt5456; i++) {
			int i_0_ = class572_sub15.readUnsignedSmart(-313476302);
			int i_1_ = class572_sub15.readUnsignedShort(647518597);
			if (i_1_ == 65535)
				i_1_ = -1;
			if (null != aClass481_Sub1Array5455[i_0_])
				aClass481_Sub1Array5455[i_0_].anInt5360 = i_1_ * 1687210429;
		}
	}

	Class488() throws Throwable {
		throw new Error();
	}

	static void method5805(RSByteBuffer class572_sub15) {
		int i = class572_sub15.readUnsignedSmart(-647530612);
		Class665_Sub11.aClass490Array8930 = new Class490[i];
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			Class665_Sub11.aClass490Array8930[i_2_] = new Class490();
			((Class490) Class665_Sub11.aClass490Array8930[i_2_]).anInt5465 = class572_sub15.readUnsignedSmart(-929668044) * 1251833303;
			((Class490) Class665_Sub11.aClass490Array8930[i_2_]).aString5464 = class572_sub15.readVersionedString(-1766958719);
		}
		anInt5454 = class572_sub15.readUnsignedSmart(734056404) * -692448587;
		Class297.anInt3474 = class572_sub15.readUnsignedSmart(332454210) * 186193913;
		anInt5456 = class572_sub15.readUnsignedSmart(505440854) * 1770457459;
		aClass481_Sub1Array5455 = (new Class481_Sub1[2041051721 * Class297.anInt3474 - -302396515 * anInt5454 + 1]);
		for (int i_3_ = 0; i_3_ < anInt5456 * -1261354053; i_3_++) {
			int i_4_ = class572_sub15.readUnsignedSmart(1439872389);
			Class481_Sub1 class481_sub1 = aClass481_Sub1Array5455[i_4_] = new Class481_Sub1();
			((Class481_Sub1) class481_sub1).anInt5359 = class572_sub15.readUnsignedByte(1779922581) * 1019676757;
			class481_sub1.anInt5358 = class572_sub15.readInt(676736859) * 1196358345;
			((Class481_Sub1) class481_sub1).anInt8941 = class572_sub15.readUnsignedSmart(-316685638) * 1843114741;
			if (0 != ((Class481_Sub1) class481_sub1).anInt8941 * 11790685)
				((Class481_Sub1) class481_sub1).aString8942 = class572_sub15.readVersionedString(-1214594326);
			class481_sub1.anInt8939 = (-302396515 * anInt5454 + i_4_) * -1580049721;
			class481_sub1.aString8937 = class572_sub15.readVersionedString(-1240296913);
			class481_sub1.aString8938 = class572_sub15.readVersionedString(-1684607591);
		}
		Class133_Sub4_Sub2.anInt11203 = class572_sub15.readInt(-343930445) * -1462316861;
		aBool5450 = true;
	}

	static void method5806(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1] = ((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1]), 2137846099))).anInt4629 * -1776717747;
	}

	static final void method5807(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		Class344.audio.sendMusic((((Cs2Executor) class441).intStack[1369304407 * (((Cs2Executor) class441).intStackPtr)]), (((Cs2Executor) class441).intStack[1369304407 * (((Cs2Executor) class441).intStackPtr) + 1]));
	}

	static final void method5808(Cs2Executor class441, int i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = ((Cs2Executor) class441).current_clan.aStringArray4264[i_5_];
	}

	public static boolean method5809(int i) {
		if (Class589.aString7805.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_6_ = "msvcp110.dll";
			String[] strings = { string, string_6_ };
			String string_7_ = System.getenv("WINDIR");
			if (string_7_ == "")
				return false;
			for (int i_8_ = 0; i_8_ < strings.length; i_8_++) {
				File file = new File(new StringBuilder().append(string_7_).append("\\system32\\").append(strings[i_8_]).toString());
				if (!file.exists() || file.isDirectory())
					return false;
			}
			return true;
		}
		if (Class589.aString7805.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(process.getInputStream())));
				do {
					boolean bool_9_;
					try {
						int i_10_ = process.waitFor();
						if (i_10_ == 0)
							break;
						bool_9_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_9_;
				} while (false);
				boolean bool_11_ = false;
				while_34_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null)
							break while_34_;
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_11_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_11_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	static final void method5810(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_12_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_13_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = string.indexOf(i_12_, i_13_);
	}

	static void method5811(Class106 class106, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		class106.method1720(i, i_14_, i_15_, i_16_, i_17_, (byte) -70);
		class106.method1720(1 + i, i_14_ + 1, i_15_ - 2, 16, i_18_, (byte) -80);
		class106.method1982(1 + i, i_14_ + 18, i_15_ - 2, i_16_ - 19, i_18_, (byte) -21);
	}
}

package game;

/* Class582 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class582 {
	public static final int anInt7704 = 48;
	public static final int anInt7705 = -3;
	public static final int anInt7706 = -4;
	public static final int anInt7707 = -5;
	public static final int anInt7708 = 1;
	public static final int anInt7709 = 29;
	public static final int anInt7710 = 3;
	public static final int anInt7711 = -2;
	public static final int anInt7712 = 7;
	public static final int anInt7713 = 2;
	public static final int anInt7714 = 45;
	public static final int anInt7715 = 15;
	public static final int anInt7716 = 23;
	public static final int anInt7717 = 9;
	public static final int anInt7718 = 35;
	public static final int anInt7719 = 42;
	public static final int anInt7720 = 21;
	public static final int anInt7721 = 6;
	public static final int anInt7722 = 49;
	public static final int anInt7723 = 52;
	public static final int anInt7724 = 53;
	public static Class248 aClass248_7725;

	Class582() throws Throwable {
		throw new Error();
	}

	static final void method6872(Cs2Executor class441, int i) {
		((Cs2Executor) class441).longStackPtr -= -1758429946;
		if ((((Cs2Executor) class441).longStack[1097105451 * ((Cs2Executor) class441).longStackPtr]) >= (((Cs2Executor) class441).longStack[1 + ((Cs2Executor) class441).longStackPtr * 1097105451]))
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]));
	}

	static final void method6873(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class213.aClass572_Sub24_2463.aClass665_Sub21_9210.method9043(393889672) && Class272_Sub2.aClass106_9517.method1675()) ? 1 : 0;
	}

	public static int method6874(String string, String string_0_, int i) {
		if (!Class520.aBool5800)
			return 12;
		if (Class166.method2676((byte) 32) != client.aClass195_8589)
			return 42;
		return Class572_Sub2.aTwitchTV8969.Login(string, string_0_);
	}

	static void method6875(byte i) {
		try {
			File file = new File(Class302.aString3530, "random.dat");
			if (file.exists())
				Class584.aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			else {
				while_80_: for (int i_1_ = 0; i_1_ < Class584.aStringArray7741.length; i_1_++) {
					for (int i_2_ = 0; i_2_ < Class398.aStringArray4717.length; i_2_++) {
						File file_3_ = new File(new StringBuilder().append(Class398.aStringArray4717[i_2_]).append(Class584.aStringArray7741[i_1_]).append(File.separatorChar).append("random.dat").toString());
						if (file_3_.exists()) {
							Class584.aClass643_7759 = new Class643(new Class649(file_3_, "rw", 25L), 24, 0);
							break while_80_;
						}
					}
				}
			}
			if (Class584.aClass643_7759 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_4_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_4_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class584.aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}
}

package game;

/* Class591 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class591 {
	public Class591 aClass591_7814;
	public Class591 aClass591_7815;
	static int anInt7816;

	public void method7002(byte i) {
		if (aClass591_7814 != null) {
			aClass591_7814.aClass591_7815 = aClass591_7815;
			aClass591_7815.aClass591_7814 = aClass591_7814;
			aClass591_7815 = null;
			aClass591_7814 = null;
		}
	}

	public void method7003() {
		if (aClass591_7814 != null) {
			aClass591_7814.aClass591_7815 = aClass591_7815;
			aClass591_7815.aClass591_7814 = aClass591_7814;
			aClass591_7815 = null;
			aClass591_7814 = null;
		}
	}

	static void method7004(long[] ls, Object[] objects, int i, int i_0_, byte i_1_) {
		if (i < i_0_) {
			int i_2_ = (i + i_0_) / 2;
			int i_3_ = i;
			long l = ls[i_2_];
			ls[i_2_] = ls[i_0_];
			ls[i_0_] = l;
			Object object = objects[i_2_];
			objects[i_2_] = objects[i_0_];
			objects[i_0_] = object;
			int i_4_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_5_ = i; i_5_ < i_0_; i_5_++) {
				if (ls[i_5_] < l + (long) (i_5_ & i_4_)) {
					long l_6_ = ls[i_5_];
					ls[i_5_] = ls[i_3_];
					ls[i_3_] = l_6_;
					Object object_7_ = objects[i_5_];
					objects[i_5_] = objects[i_3_];
					objects[i_3_++] = object_7_;
				}
			}
			ls[i_0_] = ls[i_3_];
			ls[i_3_] = l;
			objects[i_0_] = objects[i_3_];
			objects[i_3_] = object;
			method7004(ls, objects, i, i_3_ - 1, (byte) 69);
			method7004(ls, objects, 1 + i_3_, i_0_, (byte) 118);
		}
	}

	static final void method7005(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -915372029;
		int i_8_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_9_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		int i_10_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_11_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 3]);
		int i_12_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 4]);
		Class344.audio.sendSoundEffect(Class124.aClass124_1503, i_8_, i_9_, i_11_, Class126.aClass126_1509.method2215(-918986361), Class93.aClass93_1246, 0.0F, 0.0F, null, 0, i_12_, i_10_);
	}
}

package game;

/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class432 {
	public static void method5244(int[] is, int i, int[] is_0_, int i_1_, int i_2_) {
		if (is == is_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 7;
				while (i >= i_2_) {
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
				}
				i_2_ -= 7;
				while (i >= i_2_)
					is_0_[i_1_--] = is[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 7;
		while (i < i_2_) {
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
		}
		i_2_ += 7;
		while (i < i_2_)
			is_0_[i_1_++] = is[i++];
	}

	public static void method5245(float[] fs, int i, float[] fs_3_, int i_4_, int i_5_) {
		if (fs == fs_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
					fs_3_[i_4_--] = fs[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					fs_3_[i_4_--] = fs[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
			fs_3_[i_4_++] = fs[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			fs_3_[i_4_++] = fs[i++];
	}

	public static void method5246(Object[] objects, int i, Object[] objects_6_, int i_7_, int i_8_) {
		if (objects == objects_6_) {
			if (i == i_7_)
				return;
			if (i_7_ > i && i_7_ < i + i_8_) {
				i_8_--;
				i += i_8_;
				i_7_ += i_8_;
				i_8_ = i - i_8_;
				i_8_ += 7;
				while (i >= i_8_) {
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
					objects_6_[i_7_--] = objects[i--];
				}
				i_8_ -= 7;
				while (i >= i_8_)
					objects_6_[i_7_--] = objects[i--];
				return;
			}
		}
		i_8_ += i;
		i_8_ -= 7;
		while (i < i_8_) {
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
			objects_6_[i_7_++] = objects[i++];
		}
		i_8_ += 7;
		while (i < i_8_)
			objects_6_[i_7_++] = objects[i++];
	}

	public static void method5247(int[] is, int i, int i_9_, int i_10_) {
		i_9_ = i + i_9_ - 7;
		while (i < i_9_) {
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
			is[i++] = i_10_;
		}
		i_9_ += 7;
		while (i < i_9_)
			is[i++] = i_10_;
	}

	Class432() throws Throwable {
		throw new Error();
	}
}

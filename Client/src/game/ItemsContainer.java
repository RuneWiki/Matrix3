package game;

/* Class572_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemsContainer extends Class572 {
	static Class127 aClass127_9313;
	static Class676 containers = new Class676(32);
	int[] itemIds = { -1 };
	int[] itemAmounts = { 0 };

	static void method8667() {
		containers.method7964((byte) 33);
	}

	long method8668(int[] is, int i, int[] is_0_, boolean bool, int i_1_) {
		long[] ls = RSByteBuffer.aLongArray9121;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
		for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_2_] >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_2_]) & 0xffL)];
		}
		if (is_0_ != null) {
			for (int i_3_ = 0; i_3_ < 5; i_3_++)
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is_0_[i_3_]) & 0xffL)];
		}
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
		return l;
	}

	static {
		aClass127_9313 = new Class127(11);
	}

	static void method8669() {
		aClass127_9313.method2231((byte) -53);
	}

	final Model method8670(Class106 class106, int i, Class663 class663, int i_4_, boolean bool, Class474 class474, int i_5_) {
		Model model = null;
		int i_6_ = i;
		Class538 class538 = null;
		if (-1 != i_4_)
			class538 = (Class538) Class197.aClass639_Sub11_2359.getDefinition(i_4_, 1033577157);
		int[] is = ((ItemsContainer) this).itemIds;
		if (class538 != null && class538.anIntArray6048 != null) {
			is = new int[class538.anIntArray6048.length];
			for (int i_7_ = 0; i_7_ < class538.anIntArray6048.length; i_7_++) {
				int i_8_ = class538.anIntArray6048[i_7_];
				if (i_8_ >= 0 && i_8_ < ((ItemsContainer) this).itemIds.length)
					is[i_7_] = ((ItemsContainer) this).itemIds[i_8_];
				else
					is[i_7_] = -1;
			}
		}
		if (class663 != null)
			i_6_ |= class663.method7794(665600428);
		long l = method8668(is, i_4_, class474 != null ? class474.anIntArray5326 : null, bool, 2081045522);
		if (null != aClass127_9313)
			model = (Model) aClass127_9313.method2246(l);
		if (model == null || class106.method1756(model.method1353(), i_6_) != 0) {
			if (null != model)
				i_6_ = class106.method1798(i_6_, model.method1353());
			int i_9_ = i_6_;
			boolean bool_10_ = false;
			for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
				if (-1 != is[i_11_] && !((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(is[i_11_], -24518180)).method7530(bool, null, 916209799))
					bool_10_ = true;
			}
			if (bool_10_)
				return null;
			Class159[] class159s = new Class159[is.length];
			for (int i_12_ = 0; i_12_ < is.length; i_12_++) {
				if (-1 != is[i_12_])
					class159s[i_12_] = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(is[i_12_], 1106672801)).method7531(bool, null, (byte) 31);
			}
			if (null != class538 && null != class538.anIntArrayArray6025) {
				for (int i_13_ = 0; i_13_ < class538.anIntArrayArray6025.length; i_13_++) {
					if (class538.anIntArrayArray6025[i_13_] != null && class159s[i_13_] != null) {
						int i_14_ = class538.anIntArrayArray6025[i_13_][0];
						int i_15_ = class538.anIntArrayArray6025[i_13_][1];
						int i_16_ = class538.anIntArrayArray6025[i_13_][2];
						int i_17_ = class538.anIntArrayArray6025[i_13_][3];
						int i_18_ = class538.anIntArrayArray6025[i_13_][4];
						int i_19_ = class538.anIntArrayArray6025[i_13_][5];
						if (0 != i_17_ || i_18_ != 0 || i_19_ != 0)
							class159s[i_13_].method2565(i_17_, i_18_, i_19_);
						if (i_14_ != 0 || 0 != i_15_ || i_16_ != 0)
							class159s[i_13_].method2564(i_14_, i_15_, i_16_);
					}
				}
			}
			Class159 class159 = new Class159(class159s, class159s.length);
			if (class474 != null)
				i_9_ |= 0x4000;
			model = class106.method1755(class159, i_9_, -1862384183 * Class407.anInt4768, 64, 853);
			if (class474 != null) {
				for (int i_20_ = 0; i_20_ < 10; i_20_++) {
					for (int i_21_ = 0; (i_21_ < Class639_Sub19.aShortArrayArray9570[i_20_].length); i_21_++) {
						if (class474.anIntArray5326[i_20_] < (Class47.aShortArrayArrayArray471[i_20_][i_21_]).length)
							model.method1393((Class639_Sub19.aShortArrayArray9570[i_20_][i_21_]), (Class47.aShortArrayArrayArray471[i_20_][i_21_][(class474.anIntArray5326[i_20_])]));
					}
				}
			}
			if (aClass127_9313 != null) {
				model.method1450(i_6_);
				aClass127_9313.method2229(model, l);
			}
		}
		if (class663 == null)
			return model;
		Model class89_22_ = model.method1351((byte) 1, i_6_, true);
		class663.method7797(class89_22_, 0, (byte) -101);
		return class89_22_;
	}

	static void method8671() {
		aClass127_9313.method2231((byte) -87);
	}

	ItemsContainer() {
		/* empty */
	}

	static void method8672() {
		containers.method7964((byte) 125);
	}

	static void method8673(int i) {
		Class407.anInt4768 = 828040313 * i;
		aClass127_9313.method2231((byte) -64);
	}

	static boolean method8674(int i) {
		return Class190.aBool2238;
	}
}

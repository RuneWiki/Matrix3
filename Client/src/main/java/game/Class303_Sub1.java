package game;

/* Class303_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class303_Sub1 extends Class303 {
	public int anInt9749;

	public Class310 method217() {
		return Class310.aClass310_3657;
	}

	public Class310 method215(byte i) {
		return Class310.aClass310_3657;
	}

	public Class310 method214() {
		return Class310.aClass310_3657;
	}

	public Class310 method216() {
		return Class310.aClass310_3657;
	}

	Class303_Sub1(int i, Class320 class320, Class300 class300, int i_0_, int i_1_, int i_2_) {
		super(i, class320, class300, i_0_, i_1_);
		anInt9749 = -773517103 * i_2_;
	}

	public Class310 method218() {
		return Class310.aClass310_3657;
	}

	static void setContainerItem(int key, int index, int itemid, int amount, boolean split, int i_6_) {
		long keyfull = (long) (key | (split ? -2147483648 : 0));
		ItemsContainer container = (ItemsContainer) ItemsContainer.containers.get(keyfull);
		if (null == container) {
			container = new ItemsContainer();
			ItemsContainer.containers.put(container, keyfull);
		}
		if (((ItemsContainer) container).itemIds.length <= index) {
			int[] is = new int[1 + index];
			int[] is_7_ = new int[1 + index];
			for (int i_8_ = 0; (i_8_ < ((ItemsContainer) container).itemIds.length); i_8_++) {
				is[i_8_] = ((ItemsContainer) container).itemIds[i_8_];
				is_7_[i_8_] = ((ItemsContainer) container).itemAmounts[i_8_];
			}
			for (int i_9_ = ((ItemsContainer) container).itemIds.length; i_9_ < index; i_9_++) {
				is[i_9_] = -1;
				is_7_[i_9_] = 0;
			}
			((ItemsContainer) container).itemIds = is;
			((ItemsContainer) container).itemAmounts = is_7_;
		}
		((ItemsContainer) container).itemIds[index] = itemid;
		((ItemsContainer) container).itemAmounts[index] = amount;
	}
}

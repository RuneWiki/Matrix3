package game;

/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.jagex.twitchtv.TwitchEventResult;

public abstract class Class167 {
	static int interfaceHash;

	Class167() {
		/* empty */
	}

	static void method2679(int i, int i_0_, int i_1_) {
		TwitchEventResult twitcheventresult = new TwitchEventResult(i, i_0_);
		Class534 class534 = twitcheventresult.method7459();
		if (null != class534)
			VarTransmitLevel.method7439(class534.getId(208135618), twitcheventresult, 1787752185);
	}

	static final void method2680(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_2_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_3_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (-1 == i_2_ && i_3_ == -1)
			class73.aClass73_852 = null;
		else
			class73.aClass73_852 = Class530.method6338(i_2_, i_3_, -83648771);
	}

	static final void method2681(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (((Cs2Executor) class441).current_clan.aBoolArray4258[i_4_] ? 1 : 0);
	}

	public static Model method2682(Class106 class106, int i, int i_5_, int i_6_, int i_7_, int i_8_, Model model, int i_9_, int i_10_, int i_11_, int i_12_, Class663 class663, short i_13_) {
		if (null == model)
			return null;
		int i_14_ = 2055;
		if (class663 != null) {
			i_14_ |= class663.method7794(-114861879);
			i_14_ &= ~0x200;
		}
		long l = (((long) i_9_ << 32) + (long) ((i_12_ << 24) + (i_8_ + (i_11_ << 16))) + ((long) i_10_ << 48));
		Model class89_15_;
		synchronized (Class19.aClass127_145) {
			class89_15_ = (Model) Class19.aClass127_145.method2246(l);
		}
		if (class89_15_ == null || class106.method1756(class89_15_.method1353(), i_14_) != 0) {
			if (class89_15_ != null)
				i_14_ = class106.method1798(i_14_, class89_15_.method1353());
			int i_16_;
			if (1 == i_8_)
				i_16_ = 9;
			else if (i_8_ == 2)
				i_16_ = 12;
			else if (i_8_ == 3)
				i_16_ = 15;
			else if (i_8_ == 4)
				i_16_ = 18;
			else
				i_16_ = 21;
			int i_17_ = 3;
			int[] is = { 64, 96, 128 };
			Class159 class159 = new Class159(1 + i_16_ * i_17_, 2 * (i_17_ * i_16_) - i_16_, 0);
			int i_18_ = class159.method2560(0, 0, 0);
			int[][] is_19_ = new int[i_17_][i_16_];
			for (int i_20_ = 0; i_20_ < i_17_; i_20_++) {
				int i_21_ = is[i_20_];
				int i_22_ = is[i_20_];
				for (int i_23_ = 0; i_23_ < i_16_; i_23_++) {
					int i_24_ = (i_23_ << 14) / i_16_;
					int i_25_ = i_21_ * Class325.anIntArray4103[i_24_] >> 14;
					int i_26_ = Class325.anIntArray4105[i_24_] * i_22_ >> 14;
					is_19_[i_20_][i_23_] = class159.method2560(i_25_, 0, i_26_);
				}
			}
			for (int i_27_ = 0; i_27_ < i_17_; i_27_++) {
				int i_28_ = (128 + 256 * i_27_) / i_17_;
				int i_29_ = 256 - i_28_;
				byte i_30_ = (byte) (i_29_ * i_11_ + i_28_ * i_12_ >> 8);
				short i_31_ = (short) (((i_28_ * (i_10_ & 0x7f) + (i_9_ & 0x7f) * i_29_ & 0x7f00) + ((((i_9_ & 0xfc00) * i_29_ + (i_10_ & 0xfc00) * i_28_) & 0xfc0000) + (((i_10_ & 0x380) * i_28_ + (i_9_ & 0x380) * i_29_) & 0x38000))) >> 8);
				for (int i_32_ = 0; i_32_ < i_16_; i_32_++) {
					if (0 == i_27_)
						class159.method2557(i_18_, is_19_[0][(i_32_ + 1) % i_16_], is_19_[0][i_32_], (byte) 1, (byte) -1, i_31_, i_30_, (short) -1);
					else {
						class159.method2557(is_19_[i_27_ - 1][i_32_], (is_19_[i_27_ - 1][(1 + i_32_) % i_16_]), is_19_[i_27_][(1 + i_32_) % i_16_], (byte) 1, (byte) -1, i_31_, i_30_, (short) -1);
						class159.method2557(is_19_[i_27_ - 1][i_32_], is_19_[i_27_][(1 + i_32_) % i_16_], is_19_[i_27_][i_32_], (byte) 1, (byte) -1, i_31_, i_30_, (short) -1);
					}
				}
			}
			class89_15_ = class106.method1755(class159, i_14_, Class19.anInt144 * 375315683, 64, 768);
			synchronized (Class19.aClass127_145) {
				Class19.aClass127_145.method2229(class89_15_, l);
			}
		}
		int i_33_ = model.method1380();
		int i_34_ = model.method1381();
		int i_35_ = model.method1384();
		int i_36_ = model.method1508();
		if (null != class663) {
			class89_15_ = class89_15_.method1351((byte) 3, i_14_, true);
			class89_15_.method1464(i_34_ - i_33_ >> 1, 128, i_36_ - i_35_ >> 1);
			class89_15_.method1358(i_34_ + i_33_ >> 1, 0, i_35_ + i_36_ >> 1);
			class663.method7828(class89_15_, (byte) -90);
		} else {
			class89_15_ = class89_15_.method1351((byte) 3, i_14_, true);
			class89_15_.method1464(i_34_ - i_33_ >> 1, 128, i_36_ - i_35_ >> 1);
			class89_15_.method1358(i_34_ + i_33_ >> 1, 0, i_36_ + i_35_ >> 1);
		}
		if (i_5_ != 0)
			class89_15_.method1368(i_5_);
		if (i_6_ != 0)
			class89_15_.method1500(i_6_);
		if (i_7_ != 0)
			class89_15_.method1358(0, i_7_, 0);
		return class89_15_;
	}

	static final void method2683(Cs2Executor class441, int i) {
		int i_37_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_37_, (short) 11295);
		Class83 class83 = Class534.aClass83Array5975[i_37_ >> 16];
		Class624.method7453(class73, class83, class441, -1671604857);
	}
}

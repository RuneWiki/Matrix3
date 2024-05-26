package game;

import java.util.Arrays;

/* Class456_Sub1_Sub2_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Player extends Entity {
	public int anInt11815;
	public String username;
	public int anInt11817;
	String suffixTitle;
	public String displayName;
	public byte aByte11820 = 0;
	public int[] anIntArray11821;
	int anInt11822;
	public int anInt11823;
	public int anInt11824;
	public int anInt11825;
	public int anInt11826;
	public int anInt11827;
	public boolean aBool11828;
	public int anInt11829;
	public int anInt11830;
	public Class474 aClass474_11831;
	public int anInt11832;
	public boolean visible;
	public int anInt11834;
	public int anInt11835;
	String prefixTitle;
	public Class47 aClass47_11837;
	public int[] anIntArray11838;
	public boolean isClanMember;

	public void decodeHeadIcons(RSByteBuffer class572_sub15, int i) {
		class572_sub15.o = 0;
		int i_0_ = class572_sub15.readUnsignedByte(-10506810);
		for (int i_1_ = 0; i_1_ < anIntArray11838.length; i_1_++) {
			if (0 != (i_0_ & 1 << i_1_)) {
				int i_2_ = class572_sub15.readUnsignedByte(65308809);
				int i_3_ = class572_sub15.readUnsignedShort(647518597);
				anIntArray11838[i_1_] = i_2_;
				anIntArray11821[i_1_] = i_3_;
			} else {
				anIntArray11838[i_1_] = -1;
				anIntArray11821[i_1_] = -1;
			}
		}
	}

	public Player(Class523 class523, int i) {
		super(class523, i, Class472.aClass202_Sub1_Sub1_5310);
		anIntArray11838 = new int[8];
		anIntArray11821 = new int[8];
		anInt11823 = 0;
		anInt11832 = 0;
		anInt11825 = 800644779;
		anInt11826 = 0;
		anInt11827 = 1381598033;
		aBool11828 = false;
		anInt11829 = 0;
		anInt11830 = -1325822733;
		anInt11824 = 1347319757;
		anInt11817 = 1925264625;
		anInt11815 = -672521427;
		anInt11834 = 0;
		anInt11835 = -999856071;
		aClass47_11837 = Class47.aClass47_467;
		visible = false;
		isClanMember = false;
		method10707(-830487355);
	}

	final boolean method8299(int i) {
		return false;
	}

	public Class401 method276() {
		return Class401.aClass401_4742;
	}

	public Class535 method8306(Class106 class106, byte i) {
		return null;
	}

	public final void decodePlayerAppearance(RSByteBuffer buff, byte i) {
		buff.o = 0;
		int flags = buff.readUnsignedByte(-68150757);
		byte isFemale = (byte) (flags & 0x1);
		boolean bool = (flags & 0x4) != 0;
		int i_6_ = super.method10556((short) -16846);
		method10525(1 + (flags >> 3 & 0x7), (byte) -37);
		boolean hasPrefixTitle = 0 != (flags & 0x40);
		boolean hasSuffixTitle = 0 != (flags & 0x80);
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		class240.aFloat2653 += (float) (method10556((short) -5454) - i_6_ << 8);
		class240.aFloat2657 += (float) (method10556((short) -8801) - i_6_ << 8);
		method5401(class240);
		class240.method3261();
		if (hasPrefixTitle)
			prefixTitle = buff.readVersionedString(-2140461457);
		else
			prefixTitle = null;
		if (hasSuffixTitle)
			suffixTitle = buff.readVersionedString(-1092329337);
		else
			suffixTitle = null;
		visible = buff.readByte(1590836407) == 1;
		if (Class434.aClass434_5044 == Class151.aClass434_1702 && -1550439133 * client.rights >= 2)
			visible = false;
		decodePlayerLook(buff, isFemale, -1448903270);
		displayName = buff.readString(1295706626);
		username = displayName;
		if (this == Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
			RuntimeException_Sub5.aString11783 = displayName;
		anInt11823 = buff.readUnsignedByte(387836581) * -1968051215;
		if (bool) {
			anInt11826 = buff.readUnsignedShort(647518597) * -358298417;
			if (-32458193 * anInt11826 == 65535)
				anInt11826 = 358298417;
			anInt11832 = 481737101 * anInt11823;
			anInt11825 = 800644779;
		} else {
			anInt11826 = 0;
			anInt11832 = buff.readUnsignedByte(733615665) * 282467517;
			anInt11825 = buff.readUnsignedByte(852918600) * -800644779;
			if (255 == 1078973437 * anInt11825)
				anInt11825 = 800644779;
		}
		int i_9_ = anInt11834 * -288578911;
		anInt11834 = buff.readUnsignedByte(1452197556) * -1963212447;
		if (anInt11834 * -288578911 != 0) {
			int i_10_ = 1637716933 * anInt11830;
			int i_11_ = 1993650939 * anInt11824;
			int i_12_ = -1492335633 * anInt11817;
			int i_13_ = anInt11815 * -2027496613;
			int i_14_ = anInt11835 * -1195769097;
			anInt11830 = buff.readUnsignedShort(647518597) * 1325822733;
			anInt11824 = buff.readUnsignedShort(647518597) * -1347319757;
			anInt11817 = buff.readUnsignedShort(647518597) * -1925264625;
			anInt11815 = buff.readUnsignedShort(647518597) * 672521427;
			anInt11835 = buff.readUnsignedByte(1699795733) * 855072455;
			if (-288578911 * anInt11834 != i_9_ || i_10_ != 1637716933 * anInt11830 || i_11_ != anInt11824 * 1993650939 || i_12_ != anInt11817 * -1492335633 || i_13_ != anInt11815 * -2027496613 || anInt11835 * -1195769097 != i_14_)
				Class14.method640(this, 1970994518);
		} else
			Class214.method3074(this, -314895778);
	}

	void method8336(Class106 class106, int i) {
		if (aClass474_11831 != null && (aBool11666 || method10696(class106, 0, (byte) -92))) {
			Class261 class261 = class106.method1753();
			class261.method3583(method5394());
			class261.method3580(0.0F, -5.0F, 0.0F);
			method10536(class106, models, class261, aBool11666, 1787228226);
			for (int i_15_ = 0; i_15_ < models.length; i_15_++)
				models[i_15_] = null;
		}
	}

	final boolean method8332() {
		return false;
	}

	boolean method10696(Class106 class106, int i, byte i_16_) {
		int i_17_ = i;
		Class538 class538 = method10554((byte) 6);
		Class663 class663 = ((aClass663_11670.method7786(630124839) && !aClass663_11670.method7793(-1995738754)) ? aClass663_11670 : null);
		Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(413101868) && !aBool11828 && (!aClass663_Sub2_11631.aBool9556 || null == class663)) ? aClass663_Sub2_11631 : null);
		int i_18_ = class538.anInt6040 * 780604479;
		int i_19_ = -844928567 * class538.anInt6041;
		if (i_18_ != 0 || i_19_ != 0 || class538.anInt6053 * 493296853 != 0 || class538.anInt6050 * -2091503247 != 0)
			i |= 0x7;
		int i_20_ = aClass15_11655.method645(547333741);
		boolean bool = (0 != aByte11605 && client.cycles >= -282982613 * anInt11641 && client.cycles < anInt11642 * -1305810085);
		if (bool)
			i |= 0x80000;
		Model model = (models[0] = aClass474_11831.method5605(class106, i, Class197.aClass639_Sub11_2359, Class664.aClass639_Sub22_8490, Class197.aClass639_Sub15_2360, Class672.aClass639_Sub5_8533, Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, class663, class663_sub2, aClass663_Sub3_Sub1Array11650, anIntArray11651, i_20_, true, Class93.aClass504_1247, -1506040790));
		int i_21_ = Class81.method1242(1433999528);
		if (Class584.anInt7769 * -456796019 < 96 && i_21_ > 50)
			Class167_Sub1.method10039(-21327269);
		if (Class434.aClass434_5044 != Class151.aClass434_1702 && i_21_ < 50) {
			int i_22_;
			for (i_22_ = 50 - i_21_; i_22_ > -262155575 * client.anInt8587; client.anInt8587 += -1636636807)
				Class613.aByteArrayArray8033[client.anInt8587 * -262155575] = new byte[102400];
			while (i_22_ < client.anInt8587 * -262155575) {
				client.anInt8587 -= -1636636807;
				Class613.aByteArrayArray8033[client.anInt8587 * -262155575] = null;
			}
		} else if (Class151.aClass434_1702 != Class434.aClass434_5044) {
			Class613.aByteArrayArray8033 = new byte[50][];
			client.anInt8587 = 0;
		}
		if (null == model)
			return false;
		anInt11610 = model.method1382() * 709047959;
		anInt11658 = model.method1386() * -998391511;
		model.method1379();
		method10527(model, (byte) 56);
		if (i_18_ != 0 || i_19_ != 0) {
			method10570(i_20_, i_18_, i_19_, 1840536857 * class538.anInt6042, class538.anInt6043 * 1172011525, -1129520800);
			if (0 != (anInt11616 * -329006609))
				model.method1368(-329006609 * anInt11616);
			if (anInt11648 * -1081740099 != 0)
				model.method1500((anInt11648) * -1081740099);
			if (0 != (-2092938715 * anInt11618))
				model.method1358(0, (-2092938715 * (anInt11618)), 0);
		} else
			method10570(i_20_, method10556((short) -165) << 9, method10556((short) -8598) << 9, 0, 0, -1129520800);
		if (bool)
			model.method1396(aByte11643, aByte11644, aByte11626, aByte11605 & 0xff);
		if (!aBool11828)
			method10528(class106, class538, i_17_, i_18_, i_19_, i_20_, -1818410924);
		return true;
	}

	public String method10697(boolean bool, int i) {
		String string = "";
		if (prefixTitle != null)
			string = prefixTitle;
		if (bool)
			string = new StringBuilder().append(string).append(displayName).toString();
		else
			string = new StringBuilder().append(string).append(username).toString();
		if (null != suffixTitle)
			string = new StringBuilder().append(string).append(suffixTitle).toString();
		return string;
	}

	public String method10698(boolean bool, byte i) {
		if (bool)
			return displayName;
		return username;
	}

	public void method10699(int i, int i_23_, byte i_24_) {
		stepsCount = 0;
		anInt11663 = 0;
		anInt11662 = 0;
		screenX[0] = i;
		screenY[0] = i_23_;
		int i_25_ = method10556((short) -23679);
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		class240.aFloat2653 = (float) (256 * i_25_ + 512 * screenX[0]);
		class240.aFloat2657 = (float) (512 * screenY[0] + 256 * i_25_);
		method5401(class240);
		class240.method3261();
		if (this == Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976)
			client.aClass613_8605.method7306(-1042067865).method5981((byte) 32);
		if (null != aClass485_11659)
			aClass485_11659.method5764();
	}

	public Player(Class523 class523) {
		super(class523, Class472.aClass202_Sub1_Sub1_5310);
		anIntArray11838 = new int[8];
		anIntArray11821 = new int[8];
		anInt11823 = 0;
		anInt11832 = 0;
		anInt11825 = 800644779;
		anInt11826 = 0;
		anInt11827 = 1381598033;
		aBool11828 = false;
		anInt11829 = 0;
		anInt11830 = -1325822733;
		anInt11824 = 1347319757;
		anInt11817 = 1925264625;
		anInt11815 = -672521427;
		anInt11834 = 0;
		anInt11835 = -999856071;
		aClass47_11837 = Class47.aClass47_467;
		visible = false;
		isClanMember = false;
		method10707(-830487355);
	}

	public final boolean method10700(byte i) {
		if (null == aClass474_11831)
			return false;
		return true;
	}

	public int method10556(short i) {
		if (aClass474_11831 != null && -1560513359 * aClass474_11831.anInt5319 != -1)
			return (((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, 241626817))).anInt4792 * 358769667);
		return super.method10556((short) -1635);
	}

	public Class240 method280(int i) {
		return Class240.method3306();
	}

	final boolean method8349() {
		return false;
	}

	boolean method8297(Class106 class106, int i, int i_26_, int i_27_) {
		if (null == aClass474_11831 || !method10696(class106, 131072, (byte) -18))
			return false;
		Class261 class261 = method5392();
		boolean bool = false;
		for (int i_28_ = 0; i_28_ < models.length; i_28_++) {
			if (models[i_28_] != null && models[i_28_].method1376(i, i_26_, class261, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_29_ = 0; i_29_ < models.length; i_29_++)
			models[i_29_] = null;
		return bool;
	}

	public boolean method10563() {
		return JS5ConfigGroup.aClass484_2593.aBool5401;
	}

	final void method8302(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_30_, int i_31_, boolean bool, int i_32_) {
		throw new IllegalStateException();
	}

	final void method8303(int i) {
		throw new IllegalStateException();
	}

	public boolean method10533(int i) {
		return JS5ConfigGroup.aClass484_2593.aBool5401;
	}

	public Class583 method10567(int i) {
		if (null != aClass583_11608) {
			if (null == ((Class583) (aClass583_11608)).aString7730)
				return null;
			if (0 == 822360513 * client.anInt8831 || 3 == 822360513 * client.anInt8831 || (client.anInt8831 * 822360513 == 1 && Class339.method4259(username, (byte) -59)))
				return aClass583_11608;
		}
		return null;
	}

	public void setNextOverhead(String string, int i, int i_33_, int i_34_) {
		method10545(string, i, i_33_, (Class425.method5176(526881727) * (JS5ConfigGroup.aClass484_2593.anInt5412 * -765815015)), -891364358);
	}

	public void decodePlayerLook(RSByteBuffer class572_sub15, byte i, int i_35_) {
		aByte11820 = i;
		int i_36_ = -1;
		anInt11829 = 0;
		int[] is = new int[Class93.aClass504_1247.anIntArray5580.length];
		Class634[] class634s = new Class634[Class93.aClass504_1247.anIntArray5580.length];
		ItemDefinitions[] class631s = new ItemDefinitions[Class93.aClass504_1247.anIntArray5580.length];
		for (int i_37_ = 0; i_37_ < Class93.aClass504_1247.anIntArray5580.length; i_37_++) {
			if (1 != Class93.aClass504_1247.anIntArray5580[i_37_]) {
				int i_38_ = class572_sub15.readUnsignedByte(1233365824);
				if (i_38_ == 0)
					is[i_37_] = 0;
				else {
					int i_39_ = class572_sub15.readUnsignedByte(1836796073);
					int i_40_ = (i_38_ << 8) + i_39_;
					if (0 == i_37_ && 65535 == i_40_) {
						i_36_ = class572_sub15.readBigSmart((byte) 78);
						anInt11829 = (class572_sub15.readUnsignedByte(1044767246) * -1796917611);

						break;
					}
					if (i_40_ >= 16384) {
						i_40_ -= 16384;
						is[i_37_] = i_40_ | 0x40000000;
						class631s[i_37_] = (ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_40_, 1692590657);
						int i_41_ = class631s[i_37_].anInt8137 * -394578883;
						if (0 != i_41_)
							anInt11829 = i_41_ * -1796917611;
					} else
						is[i_37_] = i_40_ - 256 | ~0x7fffffff;
				}
			}
		}
		if (i_36_ == -1) {
			int i_42_ = class572_sub15.readUnsignedShort(647518597);
			int i_43_ = 0; //the disabled slots are loaded from cache but ye.
			for (int i_44_ = 0; i_44_ < Class93.aClass504_1247.anIntArray5580.length; i_44_++) {
				if (0 == Class93.aClass504_1247.anIntArray5580[i_44_]) {
					if ((i_42_ & 1 << i_43_) != 0)
						class634s[i_44_] = Class386.method4683(class631s[i_44_], class572_sub15, -374189215);
					i_43_++;
				}
			}
		}
		int[] is_45_ = new int[10];
		for (int i_46_ = 0; i_46_ < 10; i_46_++) {
			int i_47_ = class572_sub15.readUnsignedByte(752018932);
			if (Class47.aShortArrayArrayArray471.length < 1 || i_47_ < 0 || i_47_ >= Class47.aShortArrayArrayArray471[i_46_][0].length)
				i_47_ = 0;
			is_45_[i_46_] = i_47_;
		}
		anInt11822 = class572_sub15.readUnsignedShort(647518597) * -1033866873;
		if (aClass474_11831 == null)
			aClass474_11831 = new Class474();
		int i_48_ = aClass474_11831.anInt5319 * -1560513359;
		int[] is_49_ = aClass474_11831.anIntArray5326;
		aClass474_11831.method5598(method10572((byte) -88), is, class634s, is_45_, 1 == aByte11820, i_36_, -1639759127);
		if (i_48_ != i_36_) {
			Class240 class240 = Class240.method3276(method5394().aClass240_2647);
			class240.aFloat2653 = (float) ((screenX[0] << 9) + (method10556((short) -14653) << 8));
			class240.aFloat2657 = (float) ((screenY[0] << 9) + (method10556((short) -9592) << 8));
			method5401(class240);
			class240.method3261();
		}
		if (anInt11633 * -821391465 == -1921142451 * client.anInt8728 && null != is_49_) {
			for (int i_50_ = 0; i_50_ < is_45_.length; i_50_++) {
				if (is_49_[i_50_] != is_45_[i_50_]) {
					Class672.aClass639_Sub5_8533.method8903(-139461998);
					break;
				}
			}
		}
		if (aClass485_11659 != null)
			aClass485_11659.method5764();
		if (aClass663_Sub2_11631.method7786(-2084317894) && aClass663_Sub2_11631.aBool9556) {
			Class538 class538 = method10554((byte) -45);
			if (!class538.method6388(aClass663_Sub2_11631.method7795(-1478180242), (byte) 115)) {
				aClass663_Sub2_11631.method7801(-1, 751680147);
				aClass663_Sub2_11631.aBool9556 = false;
			}
		}
	}

	public Class572_Sub17 method273(byte i) {
		Class497 class497 = client.aClass613_8605.method7280((byte) -8);
		return (Class663_Sub1.method8953(aByte9009, ((int) method5394().aClass240_2647.aFloat2653 + -2077331968 * class497.localX), -(int) method5394().aClass240_2647.aFloat2656, ((int) method5394().aClass240_2647.aFloat2657 + class497.localY * -1078397440), -20148382));
	}

	public Class230 method274(int i) {
		Class230 class230 = Class230.method3210();
		class230.method3173(Class325.method4146(452190977 * aClass15_11655.anInt125), 0.0F, 0.0F);
		return class230;
	}

	public boolean method10562() {
		return JS5ConfigGroup.aClass484_2593.aBool5401;
	}

	public int method10541(int i) {
		return -(-821391465 * anInt11633) - 1;
	}

	public Class401 method272() {
		return Class401.aClass401_4742;
	}

	public int method10568() {
		if (aClass474_11831 != null && -1560513359 * aClass474_11831.anInt5319 != -1)
			return (((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, 344772882))).anInt4792 * 358769667);
		return super.method10556((short) -22069);
	}

	public int method44() {
		return -821391465 * anInt11633;
	}

	public int method55() {
		return -821391465 * anInt11633;
	}

	public int method68() {
		return -821391465 * anInt11633;
	}

	public Class572_Sub17 method270() {
		Class497 class497 = client.aClass613_8605.method7280((byte) -118);
		return (Class663_Sub1.method8953(aByte9009, ((int) method5394().aClass240_2647.aFloat2653 + -2077331968 * class497.localX), -(int) method5394().aClass240_2647.aFloat2656, ((int) method5394().aClass240_2647.aFloat2657 + class497.localY * -1078397440), -20148382));
	}

	public Class572_Sub17 method277() {
		Class497 class497 = client.aClass613_8605.method7280((byte) -9);
		return (Class663_Sub1.method8953(aByte9009, ((int) method5394().aClass240_2647.aFloat2653 + -2077331968 * class497.localX), -(int) method5394().aClass240_2647.aFloat2656, ((int) method5394().aClass240_2647.aFloat2657 + class497.localY * -1078397440), -20148382));
	}

	public int method10549() {
		if (aClass474_11831 != null && -1560513359 * aClass474_11831.anInt5319 != -1)
			return (((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, 1572579645))).anInt4792 * 358769667);
		return super.method10556((short) 369);
	}

	public Class230 method279() {
		Class230 class230 = Class230.method3210();
		class230.method3173(Class325.method4146(452190977 * aClass15_11655.anInt125), 0.0F, 0.0F);
		return class230;
	}

	public Class230 method269() {
		Class230 class230 = Class230.method3210();
		class230.method3173(Class325.method4146(452190977 * aClass15_11655.anInt125), 0.0F, 0.0F);
		return class230;
	}

	public Class240 method275() {
		return Class240.method3306();
	}

	public int method10531(int i) {
		return -1;
	}

	Class531 method8327(Class106 class106) {
		if (aClass474_11831 == null || !method10696(class106, 2048, (byte) -44))
			return null;
		Class261 class261 = class106.method1753();
		Class261 class261_51_ = method5392();
		Class238 class238 = method5394();
		int i = aClass15_11655.method645(1637519976);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && class536.aClass456_Sub1_Sub1_5992 != null) {
			int i_52_ = ((-831783159 * anInt11617) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			anInt11617 = 1609121593 * (int) ((float) (anInt11617 * -831783159) - (float) i_52_ / 10.0F);
		} else
			anInt11617 = (int) ((float) ((anInt11617) * -831783159) - (float) (-831783159 * (anInt11617)) / 10.0F) * 1609121593;
		class261.method3568(class261_51_);
		class261.method3580(0.0F, (float) (-20 - (-831783159 * anInt11617)), 0.0F);
		Class531 class531 = null;
		aBool11667 = false;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(1989505548) == 1) {
			Class538 class538 = method10554((byte) 0);
			if (class538.aBool6059 && (-1 == -1560513359 * aClass474_11831.anInt5319 || ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, -314754725))).aBool4829)) {
				Class663 class663 = ((aClass663_11670.method7786(-1527964059) && aClass663_11670.method7793(-2141989616)) ? aClass663_11670 : null);
				Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(2101956539) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
				short i_53_ = JS5ConfigGroup.aClass484_2593.aShort5411;
				byte i_54_ = JS5ConfigGroup.aClass484_2593.aByte5405;
				if (-1 != -1560513359 * aClass474_11831.anInt5319) {
					i_53_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, 542655003))).aShort4848;
					i_54_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, 1165708583))).aByte4835;
				}
				Object object = null;
				Model model;
				if (i_53_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(1825148094) == 1)
					model = (Class102.method1640(class106, i, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), models[0], i_53_, i_54_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
				else
					model = (Class167.method2682(class106, i, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), 1, models[0], 0, 0, 160, 240, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) 469));
				if (null != model) {
					if (aClass90Array9007 == null || (aClass90Array9007.length < 1 + models.length))
						method8339(models.length + 1, -289310705);
					class531 = Class572_Sub16_Sub9.method10262(true, -1283066494);
					aBool11667 = true;
					class106.method1763(false);
					model.method1375(class261, (aClass90Array9007[models.length]), 0);
					class106.method1763(true);
				}
			}
		}
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this) {
			for (int i_55_ = client.aClass193Array8593.length - 1; i_55_ >= 0; i_55_--) {
				Class193 class193 = client.aClass193Array8593[i_55_];
				if (class193 != null && -1 != 1404054527 * class193.anInt2318) {
					if (class193.anInt2319 * -910441311 == 1) {
						LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) (105420277 * class193.anInt2316))));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240 = (Class240.method3277((class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647), Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_56_ = (int) class240.aFloat2653;
							int i_57_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_56_, (long) i_57_, 1404054527 * class193.anInt2318, 92160000L);
						}
					}
					if (-910441311 * class193.anInt2319 == 2) {
						Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
						long l = (long) (230762203 * class193.anInt2315 - (int) class240.aFloat2653);
						long l_58_ = (long) (class193.anInt2321 * -810969519 - (int) class240.aFloat2657);
						long l_59_ = (long) (-1965971947 * class193.anInt2311 << 9);
						l_59_ *= l_59_;
						method10706(class106, class261, models[0], l, l_58_, class193.anInt2318 * 1404054527, l_59_);
					}
					if (class193.anInt2319 * -910441311 == 10 && 105420277 * class193.anInt2316 >= 0 && (class193.anInt2316 * 105420277 < (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727).length)) {
						Player class456_sub1_sub2_sub3_sub2_60_ = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[class193.anInt2316 * 105420277]);
						if (null != class456_sub1_sub2_sub3_sub2_60_) {
							Class240 class240 = (Class240.method3277(class456_sub1_sub2_sub3_sub2_60_.method5394().aClass240_2647, Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_61_ = (int) class240.aFloat2653;
							int i_62_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_61_, (long) i_62_, class193.anInt2318 * 1404054527, 92160000L);
						}
					}
				}
			}
		}
		class261.method3568(class261_51_);
		class261.method3580(0.0F, (float) (-5 - (anInt11617) * -831783159), 0.0F);
		if (null == aClass90Array9007 || aClass90Array9007.length < models.length)
			method8339(models.length, -1524903728);
		if (null == class531)
			class531 = Class572_Sub16_Sub9.method10262(true, -1071055403);
		method10536(class106, models, class261, false, 1542148453);
		for (int i_63_ = 0; i_63_ < models.length; i_63_++) {
			if (null != models[i_63_])
				models[i_63_].method1375(class261, aClass90Array9007[i_63_], (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this ? 1 : 0));
			else
				aClass90Array9007[i_63_].aBool1232 = false;
		}
		if (aClass485_11659 != null) {
			Class105 class105 = aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_64_ = 0; i_64_ < models.length; i_64_++) {
			if (null != models[i_64_])
				aBool11667 |= models[i_64_].method1400();
			models[i_64_] = null;
		}
		anInt11609 = 1020453599 * client.anInt8699;
		return class531;
	}

	Class531 method8328(Class106 class106) {
		if (aClass474_11831 == null || !method10696(class106, 2048, (byte) -35))
			return null;
		Class261 class261 = class106.method1753();
		Class261 class261_65_ = method5392();
		Class238 class238 = method5394();
		int i = aClass15_11655.method645(-1042818802);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && class536.aClass456_Sub1_Sub1_5992 != null) {
			int i_66_ = ((-831783159 * anInt11617) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			anInt11617 = 1609121593 * (int) ((float) (anInt11617 * -831783159) - (float) i_66_ / 10.0F);
		} else
			anInt11617 = (int) ((float) ((anInt11617) * -831783159) - (float) (-831783159 * (anInt11617)) / 10.0F) * 1609121593;
		class261.method3568(class261_65_);
		class261.method3580(0.0F, (float) (-20 - (-831783159 * anInt11617)), 0.0F);
		Class531 class531 = null;
		aBool11667 = false;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(-1792739976) == 1) {
			Class538 class538 = method10554((byte) 104);
			if (class538.aBool6059 && (-1 == -1560513359 * aClass474_11831.anInt5319 || ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, -86685413))).aBool4829)) {
				Class663 class663 = ((aClass663_11670.method7786(2140999820) && aClass663_11670.method7793(-2089307524)) ? aClass663_11670 : null);
				Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(776471878) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
				short i_67_ = JS5ConfigGroup.aClass484_2593.aShort5411;
				byte i_68_ = JS5ConfigGroup.aClass484_2593.aByte5405;
				if (-1 != -1560513359 * aClass474_11831.anInt5319) {
					i_67_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, 1162483371))).aShort4848;
					i_68_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, 1579118618))).aByte4835;
				}
				Object object = null;
				Model model;
				if (i_67_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1108386065) == 1)
					model = (Class102.method1640(class106, i, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), models[0], i_67_, i_68_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
				else
					model = (Class167.method2682(class106, i, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), 1, models[0], 0, 0, 160, 240, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) -31881));
				if (null != model) {
					if (aClass90Array9007 == null || (aClass90Array9007.length < 1 + models.length))
						method8339(models.length + 1, -259494910);
					class531 = Class572_Sub16_Sub9.method10262(true, 67638879);
					aBool11667 = true;
					class106.method1763(false);
					model.method1375(class261, (aClass90Array9007[models.length]), 0);
					class106.method1763(true);
				}
			}
		}
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this) {
			for (int i_69_ = client.aClass193Array8593.length - 1; i_69_ >= 0; i_69_--) {
				Class193 class193 = client.aClass193Array8593[i_69_];
				if (class193 != null && -1 != 1404054527 * class193.anInt2318) {
					if (class193.anInt2319 * -910441311 == 1) {
						LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) (105420277 * class193.anInt2316))));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240 = (Class240.method3277((class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647), Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_70_ = (int) class240.aFloat2653;
							int i_71_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_70_, (long) i_71_, 1404054527 * class193.anInt2318, 92160000L);
						}
					}
					if (-910441311 * class193.anInt2319 == 2) {
						Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
						long l = (long) (230762203 * class193.anInt2315 - (int) class240.aFloat2653);
						long l_72_ = (long) (class193.anInt2321 * -810969519 - (int) class240.aFloat2657);
						long l_73_ = (long) (-1965971947 * class193.anInt2311 << 9);
						l_73_ *= l_73_;
						method10706(class106, class261, models[0], l, l_72_, class193.anInt2318 * 1404054527, l_73_);
					}
					if (class193.anInt2319 * -910441311 == 10 && 105420277 * class193.anInt2316 >= 0 && (class193.anInt2316 * 105420277 < (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727).length)) {
						Player class456_sub1_sub2_sub3_sub2_74_ = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[class193.anInt2316 * 105420277]);
						if (null != class456_sub1_sub2_sub3_sub2_74_) {
							Class240 class240 = (Class240.method3277(class456_sub1_sub2_sub3_sub2_74_.method5394().aClass240_2647, Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_75_ = (int) class240.aFloat2653;
							int i_76_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_75_, (long) i_76_, class193.anInt2318 * 1404054527, 92160000L);
						}
					}
				}
			}
		}
		class261.method3568(class261_65_);
		class261.method3580(0.0F, (float) (-5 - (anInt11617) * -831783159), 0.0F);
		if (null == aClass90Array9007 || aClass90Array9007.length < models.length)
			method8339(models.length, -1809207295);
		if (null == class531)
			class531 = Class572_Sub16_Sub9.method10262(true, 300030695);
		method10536(class106, models, class261, false, 1387464832);
		for (int i_77_ = 0; i_77_ < models.length; i_77_++) {
			if (null != models[i_77_])
				models[i_77_].method1375(class261, aClass90Array9007[i_77_], (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this ? 1 : 0));
			else
				aClass90Array9007[i_77_].aBool1232 = false;
		}
		if (aClass485_11659 != null) {
			Class105 class105 = aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_78_ = 0; i_78_ < models.length; i_78_++) {
			if (null != models[i_78_])
				aBool11667 |= models[i_78_].method1400();
			models[i_78_] = null;
		}
		anInt11609 = 1020453599 * client.anInt8699;
		return class531;
	}

	void method8313(Class106 class106) {
		if (aClass474_11831 != null && (aBool11666 || method10696(class106, 0, (byte) -64))) {
			Class261 class261 = class106.method1753();
			class261.method3583(method5394());
			class261.method3580(0.0F, -5.0F, 0.0F);
			method10536(class106, models, class261, aBool11666, 1651487548);
			for (int i = 0; i < models.length; i++)
				models[i] = null;
		}
	}

	void method8330(Class106 class106) {
		if (aClass474_11831 != null && (aBool11666 || method10696(class106, 0, (byte) -3))) {
			Class261 class261 = class106.method1753();
			class261.method3583(method5394());
			class261.method3580(0.0F, -5.0F, 0.0F);
			method10536(class106, models, class261, aBool11666, 1226538521);
			for (int i = 0; i < models.length; i++)
				models[i] = null;
		}
	}

	boolean method8321(Class106 class106, int i, int i_79_) {
		if (null == aClass474_11831 || !method10696(class106, 131072, (byte) -30))
			return false;
		Class261 class261 = method5392();
		boolean bool = false;
		for (int i_80_ = 0; i_80_ < models.length; i_80_++) {
			if (models[i_80_] != null && models[i_80_].method1376(i, i_79_, class261, true, 0)) {
				bool = true;
				break;
			}
		}
		for (int i_81_ = 0; i_81_ < models.length; i_81_++)
			models[i_81_] = null;
		return bool;
	}

	public Class230 method278() {
		Class230 class230 = Class230.method3210();
		class230.method3173(Class325.method4146(452190977 * aClass15_11655.anInt125), 0.0F, 0.0F);
		return class230;
	}

	final boolean method8333() {
		return false;
	}

	final boolean method8334() {
		return false;
	}

	final boolean method8347() {
		return false;
	}

	final void method8337(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_82_, int i_83_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method8338() {
		throw new IllegalStateException();
	}

	int method10572(byte i) {
		return anInt11822 * 248677431;
	}

	final void method8304() {
		throw new IllegalStateException();
	}

	int method10557() {
		return anInt11822 * 248677431;
	}

	int method10558() {
		return anInt11822 * 248677431;
	}

	public int method10559() {
		return -1;
	}

	public boolean method10561() {
		return JS5ConfigGroup.aClass484_2593.aBool5401;
	}

	final void method10703(int i, int i_84_, byte i_85_, int i_86_) {
		if (-2037536229 * stepsCount < screenX.length - 1)
			stepsCount += -298115053;
		for (int i_87_ = -2037536229 * stepsCount; i_87_ > 0; i_87_--) {
			screenX[i_87_] = screenX[i_87_ - 1];
			screenY[i_87_] = screenY[i_87_ - 1];
			aByteArray11661[i_87_] = aByteArray11661[i_87_ - 1];
		}
		screenX[0] = i;
		screenY[0] = i_84_;
		aByteArray11661[0] = i_85_;
	}

	public Class401 method281(int i) {
		return Class401.aClass401_4742;
	}

	public Class583 method10553() {
		if (null != aClass583_11608) {
			if (null == ((Class583) (aClass583_11608)).aString7730)
				return null;
			if (0 == 822360513 * client.anInt8831 || 3 == 822360513 * client.anInt8831 || (client.anInt8831 * 822360513 == 1 && Class339.method4259(username, (byte) -16)))
				return aClass583_11608;
		}
		return null;
	}

	public Class583 method10565() {
		if (null != aClass583_11608) {
			if (null == ((Class583) (aClass583_11608)).aString7730)
				return null;
			if (0 == 822360513 * client.anInt8831 || 3 == 822360513 * client.anInt8831 || (client.anInt8831 * 822360513 == 1 && Class339.method4259(username, (byte) -60)))
				return aClass583_11608;
		}
		return null;
	}

	public int method10535() {
		return -(-821391465 * anInt11633) - 1;
	}

	public Class240 method271() {
		return Class240.method3306();
	}

	public Class535 method8344(Class106 class106) {
		return null;
	}

	public Class535 method8305(Class106 class106) {
		return null;
	}

	void method10704() {
		for (int i = 0; i < anIntArray11838.length; i++)
			anIntArray11838[i] = -1;
		for (int i = 0; i < anIntArray11821.length; i++)
			anIntArray11821[i] = -1;
	}

	public int method113(byte i) {
		return -821391465 * anInt11633;
	}

	public Class535 method8341(Class106 class106) {
		return null;
	}

	Class531 method8326(Class106 class106) {
		if (aClass474_11831 == null || !method10696(class106, 2048, (byte) -111))
			return null;
		Class261 class261 = class106.method1753();
		Class261 class261_88_ = method5392();
		Class238 class238 = method5394();
		int i = aClass15_11655.method645(1016571168);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && class536.aClass456_Sub1_Sub1_5992 != null) {
			int i_89_ = ((-831783159 * anInt11617) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			anInt11617 = 1609121593 * (int) ((float) (anInt11617 * -831783159) - (float) i_89_ / 10.0F);
		} else
			anInt11617 = (int) ((float) ((anInt11617) * -831783159) - (float) (-831783159 * (anInt11617)) / 10.0F) * 1609121593;
		class261.method3568(class261_88_);
		class261.method3580(0.0F, (float) (-20 - (-831783159 * anInt11617)), 0.0F);
		Class531 class531 = null;
		aBool11667 = false;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(1326219676) == 1) {
			Class538 class538 = method10554((byte) 19);
			if (class538.aBool6059 && (-1 == -1560513359 * aClass474_11831.anInt5319 || ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, -149169915))).aBool4829)) {
				Class663 class663 = ((aClass663_11670.method7786(144533462) && aClass663_11670.method7793(-1949675974)) ? aClass663_11670 : null);
				Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(-2034734371) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
				short i_90_ = JS5ConfigGroup.aClass484_2593.aShort5411;
				byte i_91_ = JS5ConfigGroup.aClass484_2593.aByte5405;
				if (-1 != -1560513359 * aClass474_11831.anInt5319) {
					i_90_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, 77112863))).aShort4848;
					i_91_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, 156888429))).aByte4835;
				}
				Object object = null;
				Model model;
				if (i_90_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-989133244) == 1)
					model = (Class102.method1640(class106, i, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), models[0], i_90_, i_91_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
				else
					model = (Class167.method2682(class106, i, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), 1, models[0], 0, 0, 160, 240, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) -1091));
				if (null != model) {
					if (aClass90Array9007 == null || (aClass90Array9007.length < 1 + models.length))
						method8339(models.length + 1, 76015533);
					class531 = Class572_Sub16_Sub9.method10262(true, 379473053);
					aBool11667 = true;
					class106.method1763(false);
					model.method1375(class261, (aClass90Array9007[models.length]), 0);
					class106.method1763(true);
				}
			}
		}
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this) {
			for (int i_92_ = client.aClass193Array8593.length - 1; i_92_ >= 0; i_92_--) {
				Class193 class193 = client.aClass193Array8593[i_92_];
				if (class193 != null && -1 != 1404054527 * class193.anInt2318) {
					if (class193.anInt2319 * -910441311 == 1) {
						LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) (105420277 * class193.anInt2316))));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240 = (Class240.method3277((class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647), Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_93_ = (int) class240.aFloat2653;
							int i_94_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_93_, (long) i_94_, 1404054527 * class193.anInt2318, 92160000L);
						}
					}
					if (-910441311 * class193.anInt2319 == 2) {
						Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
						long l = (long) (230762203 * class193.anInt2315 - (int) class240.aFloat2653);
						long l_95_ = (long) (class193.anInt2321 * -810969519 - (int) class240.aFloat2657);
						long l_96_ = (long) (-1965971947 * class193.anInt2311 << 9);
						l_96_ *= l_96_;
						method10706(class106, class261, models[0], l, l_95_, class193.anInt2318 * 1404054527, l_96_);
					}
					if (class193.anInt2319 * -910441311 == 10 && 105420277 * class193.anInt2316 >= 0 && (class193.anInt2316 * 105420277 < (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727).length)) {
						Player class456_sub1_sub2_sub3_sub2_97_ = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[class193.anInt2316 * 105420277]);
						if (null != class456_sub1_sub2_sub3_sub2_97_) {
							Class240 class240 = (Class240.method3277(class456_sub1_sub2_sub3_sub2_97_.method5394().aClass240_2647, Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_98_ = (int) class240.aFloat2653;
							int i_99_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_98_, (long) i_99_, class193.anInt2318 * 1404054527, 92160000L);
						}
					}
				}
			}
		}
		class261.method3568(class261_88_);
		class261.method3580(0.0F, (float) (-5 - (anInt11617) * -831783159), 0.0F);
		if (null == aClass90Array9007 || aClass90Array9007.length < models.length)
			method8339(models.length, -1626957576);
		if (null == class531)
			class531 = Class572_Sub16_Sub9.method10262(true, -750583879);
		method10536(class106, models, class261, false, 1933791401);
		for (int i_100_ = 0; i_100_ < models.length; i_100_++) {
			if (null != models[i_100_])
				models[i_100_].method1375(class261, aClass90Array9007[i_100_], (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this ? 1 : 0));
			else
				aClass90Array9007[i_100_].aBool1232 = false;
		}
		if (aClass485_11659 != null) {
			Class105 class105 = aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_101_ = 0; i_101_ < models.length; i_101_++) {
			if (null != models[i_101_])
				aBool11667 |= models[i_101_].method1400();
			models[i_101_] = null;
		}
		anInt11609 = 1020453599 * client.anInt8699;
		return class531;
	}

	public final void method10705(int i, int i_102_, byte i_103_, int i_104_) {
		if (aClass663_11670.method7786(73707412) && (aClass663_11670.method7787(153948485).anInt1561 * 657197671 == 1)) {
			anIntArray11640 = null;
			aClass663_11670.method7801(-1, 751680147);
		}
		for (int i_105_ = 0; i_105_ < currentGraphics.length; i_105_++) {
			if (-1 != -1701003211 * currentGraphics[i_105_].id) {
				GraphicsDefinition class659 = ((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition(-1701003211 * currentGraphics[i_105_].id, -1031612038)));
				if (class659.aBool8427 && -1 != class659.anInt8433 * 1281094747 && (((AnimationDefinition) (Class26.aClass639_Sub18_217.getDefinition(1281094747 * class659.anInt8433, -503216535))).anInt1561 * 657197671 == 1)) {
					currentGraphics[i_105_].aClass663_7776.method7801(-1, 751680147);
					currentGraphics[i_105_].id = 803171811;
				}
			}
		}
		anInt11827 = 1381598033;
		if (i < 0 || i >= client.aClass613_8605.method7347(-520836217) || i_102_ < 0 || i_102_ >= client.aClass613_8605.method7278(277214477))
			method10699(i, i_102_, (byte) 114);
		else if (screenX[0] < 0 || (screenX[0] >= client.aClass613_8605.method7347(-86619805)) || screenY[0] < 0 || (screenY[0] >= client.aClass613_8605.method7278(277214477)))
			method10699(i, i_102_, (byte) 95);
		else
			method10703(i, i_102_, i_103_, 1698281893);
	}

	void method10706(Class106 class106, Class261 class261, Model model, long l, long l_106_, int i, long l_107_) {
		long l_108_ = l_106_ * l_106_ + l * l;
		if (l_108_ >= 262144L && l_108_ <= l_107_) {
			int i_109_ = ((int) ((Math.atan2((double) l, (double) l_106_) * 2607.5945876176133) - (double) aClass15_11655.method645(-537049642)) & 0x3fff);
			Model class89_110_ = (Class456_Sub1_Sub4_Sub2.method10499(class106, i_109_, (-329006609 * anInt11616), (-1081740099 * anInt11648), (anInt11618 * -2092938715), i, -175893671));
			if (null != class89_110_) {
				class106.method1763(false);
				class89_110_.method1375(class261, null, 0);
				class106.method1763(true);
			}
		}
	}

	Class531 method8350(Class106 class106, int i) {
		if (aClass474_11831 == null || !method10696(class106, 2048, (byte) -88))
			return null;
		Class261 class261 = class106.method1753();
		Class261 class261_111_ = method5392();
		Class238 class238 = method5394();
		int i_112_ = aClass15_11655.method645(426934527);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && class536.aClass456_Sub1_Sub1_5992 != null) {
			int i_113_ = ((-831783159 * anInt11617) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			anInt11617 = 1609121593 * (int) ((float) (anInt11617 * -831783159) - (float) i_113_ / 10.0F);
		} else
			anInt11617 = (int) ((float) ((anInt11617) * -831783159) - (float) (-831783159 * (anInt11617)) / 10.0F) * 1609121593;
		class261.method3568(class261_111_);
		class261.method3580(0.0F, (float) (-20 - (-831783159 * anInt11617)), 0.0F);
		Class531 class531 = null;
		aBool11667 = false;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(-338207114) == 1) {
			Class538 class538 = method10554((byte) -60);
			if (class538.aBool6059 && (-1 == -1560513359 * aClass474_11831.anInt5319 || ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, -1179036378))).aBool4829)) {
				Class663 class663 = ((aClass663_11670.method7786(1993673011) && aClass663_11670.method7793(-1988143771)) ? aClass663_11670 : null);
				Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(-2102691864) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
				short i_114_ = JS5ConfigGroup.aClass484_2593.aShort5411;
				byte i_115_ = JS5ConfigGroup.aClass484_2593.aByte5405;
				if (-1 != -1560513359 * aClass474_11831.anInt5319) {
					i_114_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, -1074681124))).aShort4848;
					i_115_ = ((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(aClass474_11831.anInt5319 * -1560513359, 824951715))).aByte4835;
				}
				Object object = null;
				Model model;
				if (i_114_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-2079621429) == 1)
					model = (Class102.method1640(class106, i_112_, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), models[0], i_114_, i_115_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
				else
					model = (Class167.method2682(class106, i_112_, -329006609 * (anInt11616), -1081740099 * anInt11648, (anInt11618 * -2092938715), 1, models[0], 0, 0, 160, 240, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) -23645));
				if (null != model) {
					if (aClass90Array9007 == null || (aClass90Array9007.length < 1 + models.length))
						method8339(models.length + 1, -2145651676);
					class531 = Class572_Sub16_Sub9.method10262(true, -1301389107);
					aBool11667 = true;
					class106.method1763(false);
					model.method1375(class261, (aClass90Array9007[models.length]), 0);
					class106.method1763(true);
				}
			}
		}
		if (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this) {
			for (int i_116_ = client.aClass193Array8593.length - 1; i_116_ >= 0; i_116_--) {
				Class193 class193 = client.aClass193Array8593[i_116_];
				if (class193 != null && -1 != 1404054527 * class193.anInt2318) {
					if (class193.anInt2319 * -910441311 == 1) {
						LinkableObject class572_sub9 = ((LinkableObject) (client.aClass676_8622.get((long) (105420277 * class193.anInt2316))));
						if (null != class572_sub9) {
							NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
							Class240 class240 = (Class240.method3277((class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647), Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_117_ = (int) class240.aFloat2653;
							int i_118_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_117_, (long) i_118_, 1404054527 * class193.anInt2318, 92160000L);
						}
					}
					if (-910441311 * class193.anInt2319 == 2) {
						Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
						long l = (long) (230762203 * class193.anInt2315 - (int) class240.aFloat2653);
						long l_119_ = (long) (class193.anInt2321 * -810969519 - (int) class240.aFloat2657);
						long l_120_ = (long) (-1965971947 * class193.anInt2311 << 9);
						l_120_ *= l_120_;
						method10706(class106, class261, models[0], l, l_119_, class193.anInt2318 * 1404054527, l_120_);
					}
					if (class193.anInt2319 * -910441311 == 10 && 105420277 * class193.anInt2316 >= 0 && (class193.anInt2316 * 105420277 < (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727).length)) {
						Player class456_sub1_sub2_sub3_sub2_121_ = (client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[class193.anInt2316 * 105420277]);
						if (null != class456_sub1_sub2_sub3_sub2_121_) {
							Class240 class240 = (Class240.method3277(class456_sub1_sub2_sub3_sub2_121_.method5394().aClass240_2647, Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647));
							int i_122_ = (int) class240.aFloat2653;
							int i_123_ = (int) class240.aFloat2657;
							method10706(class106, class261, models[0], (long) i_122_, (long) i_123_, class193.anInt2318 * 1404054527, 92160000L);
						}
					}
				}
			}
		}
		class261.method3568(class261_111_);
		class261.method3580(0.0F, (float) (-5 - (anInt11617) * -831783159), 0.0F);
		if (null == aClass90Array9007 || aClass90Array9007.length < models.length)
			method8339(models.length, -2105231261);
		if (null == class531)
			class531 = Class572_Sub16_Sub9.method10262(true, -30232602);
		method10536(class106, models, class261, false, 1671288189);
		for (int i_124_ = 0; i_124_ < models.length; i_124_++) {
			if (null != models[i_124_])
				models[i_124_].method1375(class261, aClass90Array9007[i_124_], (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976 == this ? 1 : 0));
			else
				aClass90Array9007[i_124_].aBool1232 = false;
		}
		if (aClass485_11659 != null) {
			Class105 class105 = aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_125_ = 0; i_125_ < models.length; i_125_++) {
			if (null != models[i_125_])
				aBool11667 |= models[i_125_].method1400();
			models[i_125_] = null;
		}
		anInt11609 = 1020453599 * client.anInt8699;
		return class531;
	}

	public Class583 method10564() {
		if (null != aClass583_11608) {
			if (null == ((Class583) (aClass583_11608)).aString7730)
				return null;
			if (0 == 822360513 * client.anInt8831 || 3 == 822360513 * client.anInt8831 || (client.anInt8831 * 822360513 == 1 && Class339.method4259(username, (byte) -71)))
				return aClass583_11608;
		}
		return null;
	}

	public Class240 method282() {
		return Class240.method3306();
	}

	public int method10514() {
		if (aClass474_11831 != null && -1560513359 * aClass474_11831.anInt5319 != -1)
			return (((NPCDefintion) (Class197.aClass639_Sub15_2360.getDefinition(-1560513359 * aClass474_11831.anInt5319, 229192064))).anInt4792 * 358769667);
		return super.method10556((short) -12304);
	}

	final void method8343() {
		throw new IllegalStateException();
	}

	void method10707(int i) {
		for (int i_126_ = 0; i_126_ < anIntArray11838.length; i_126_++)
			anIntArray11838[i_126_] = -1;
		for (int i_127_ = 0; i_127_ < anIntArray11821.length; i_127_++)
			anIntArray11821[i_127_] = -1;
	}

	static void method10708(int i, int i_128_, int i_129_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(12, (long) i);
		class572_sub12_sub11.method10338(2077871649);
		((GameTask) class572_sub12_sub11).p1 = i_128_ * 720886855;
	}

	static final String method10709(String string, String string_130_, String string_131_, byte i) {
		for (int i_132_ = string.indexOf(string_130_); -1 != i_132_; i_132_ = string.indexOf(string_130_, i_132_ + string_131_.length()))
			string = new StringBuilder().append(string.substring(0, i_132_)).append(string_131_).append(string.substring(i_132_ + string_130_.length())).toString();
		return string;
	}
}

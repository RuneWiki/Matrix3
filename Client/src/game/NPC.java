package game;

/* Class456_Sub1_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPC extends Entity {
	int anInt11798;
	public int anInt11799 = 919549415;
	public int anInt11800 = -564443067;
	public Class399 aClass399_11801;
	int[] anIntArray11802;
	public NPCDefintion aClass410_11803;
	public int anInt11804 = 787969919;
	int anInt11805;
	public int anInt11806;
	public String aString11807;
	public int anInt11808;
	int[] anIntArray11809;
	int anInt11810;
	public static int anInt11811 = 845878597;
	public static int anInt11812 = -1225347919;
	public Class418 aClass418_11813;
	int anInt11814;

	public Class572_Sub17 method273(byte i) {
		Class497 class497 = client.aClass613_8605.method7280((byte) -31);
		return (Class663_Sub1.method8953(aByte9009, ((int) method5394().aClass240_2647.aFloat2653 + -2077331968 * class497.localX), -(int) method5394().aClass240_2647.aFloat2656, ((int) method5394().aClass240_2647.aFloat2657 + -1078397440 * class497.localY), -20148382));
	}

	public Class572_Sub17 method277() {
		Class497 class497 = client.aClass613_8605.method7280((byte) -66);
		return (Class663_Sub1.method8953(aByte9009, ((int) method5394().aClass240_2647.aFloat2653 + -2077331968 * class497.localX), -(int) method5394().aClass240_2647.aFloat2656, ((int) method5394().aClass240_2647.aFloat2657 + -1078397440 * class497.localY), -20148382));
	}

	public void method10678(int i) {
		((NPC) this).anInt11647 = -1978388227;
		((NPC) this).anInt11645 = client.cycles * 207138037;
	}

	void method10679(byte i) {
		((NPC) this).anInt11810 = (32 + (int) (Math.random() * 4.0)) * -453735017;
		((NPC) this).anInt11798 = (3 + (int) (Math.random() * 2.0)) * -1576699217;
		((NPC) this).anInt11814 = (16 + (int) (Math.random() * 3.0)) * 1241606449;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-796008157) == 1)
			((NPC) this).anInt11805 = (int) (Math.random() * 6.0) * -787318469;
		else
			((NPC) this).anInt11805 = (int) (Math.random() * 12.0) * -787318469;
	}

	public void method10680(NPCDefintion class410, byte i) {
		method10687(class410, true, true, true, (byte) -22);
	}

	public Class583 method10564() {
		if (((NPC) this).aClass583_11608 != null && null == ((Class583) (((NPC) this).aClass583_11608)).aString7730)
			return null;
		return ((NPC) this).aClass583_11608;
	}

	public Class535 method8306(Class106 class106, byte i) {
		return null;
	}

	Class531 method8350(Class106 class106, int i) {
		if (aClass410_11803 == null || !method10681(class106, 526336, (byte) 1))
			return null;
		Class261 class261 = method5392();
		Class238 class238 = method5394();
		Class261 class261_0_ = class106.method1753();
		int i_1_ = aClass15_11655.method645(985758122);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && null != class536.aClass456_Sub1_Sub1_5992) {
			int i_2_ = ((((NPC) this).anInt11617 * -831783159) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			((NPC) this).anInt11617 = 1609121593 * (int) ((float) (((NPC) this).anInt11617 * -831783159) - (float) i_2_ / 10.0F);
		} else
			((NPC) this).anInt11617 = (1609121593 * (int) ((float) ((((NPC) this).anInt11617) * -831783159) - (float) (-831783159 * (((NPC) this).anInt11617)) / 10.0F));
		class261_0_.method3568(class261);
		class261_0_.method3580(0.0F, (float) (-20 - (-831783159 * ((NPC) this).anInt11617)), 0.0F);
		Class538 class538 = method10554((byte) -41);
		NPCDefintion class410 = (aClass410_11803.anIntArray4795 != null ? aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 2012030538) : aClass410_11803);
		boolean bool = class410.aClass326_4853 != null;
		((NPC) this).aBool11667 = false;
		Class531 class531 = null;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(477612274) == 1 && class410.aBool4829 && class538.aBool6059) {
			Class663 class663 = ((aClass663_11670.method7786(1236200393) && aClass663_11670.method7793(-2057494498)) ? aClass663_11670 : null);
			Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(-1143676265) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
			short i_3_ = JS5ConfigGroup.aClass484_2593.aShort5411;
			byte i_4_ = JS5ConfigGroup.aClass484_2593.aByte5405;
			if (aClass410_11803.aShort4848 > -1) {
				i_3_ = aClass410_11803.aShort4848;
				i_4_ = aClass410_11803.aByte4835;
			}
			Model model;
			if (i_3_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(2140860060) == 1)
				model = (Class102.method1640(class106, i_1_, -329006609 * (((NPC) this).anInt11616), (((NPC) this).anInt11648 * -1081740099), (((NPC) this).anInt11618 * -2092938715), models[0], i_3_, i_4_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
			else
				model = (Class167.method2682(class106, i_1_, (((NPC) this).anInt11616 * -329006609), (-1081740099 * ((NPC) this).anInt11648), (((NPC) this).anInt11618 * -2092938715), 358769667 * aClass410_11803.anInt4792, models[0], aClass410_11803.aShort4830 & 0xffff, aClass410_11803.aShort4831 & 0xffff, aClass410_11803.aByte4832 & 0xff, aClass410_11803.aByte4844 & 0xff, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) -1933));
			if (model != null) {
				class531 = Class572_Sub16_Sub9.method10262(method10685(-1573360831), 635499195);
				((NPC) this).aBool11667 = true;
				class106.method1763(false);
				if (bool)
					model.method1375(class261_0_, null, 0);
				else {
					if (null == aClass90Array9007 || (aClass90Array9007.length < 1 + models.length))
						method8339(1 + models.length, -289647813);
					model.method1375(class261_0_, (aClass90Array9007[models.length]), 0);
				}
				class106.method1763(true);
			}
		}
		if (bool) {
			if (null == aClass90Array9007 || aClass90Array9007.length > 1)
				method8339(1, -1971568747);
			class106.method1738(class261_0_, aClass90Array9007[0], class410.aClass326_4853);
		} else if (aClass90Array9007 == null || aClass90Array9007.length < models.length)
			method8339(models.length, -1750030191);
		if (class531 == null)
			class531 = Class572_Sub16_Sub9.method10262(method10685(-1401609651), -366163345);
		method10536(class106, models, class261_0_, false, 1995015700);
		for (int i_5_ = 0; i_5_ < models.length; i_5_++) {
			if (models[i_5_] != null) {
				if (aClass410_11803.aBool4857)
					models[i_5_].method1396((((NPC) this).anInt11810 * 1650377255), (((NPC) this).anInt11798 * -1336140721), (315838417 * ((NPC) this).anInt11814), (((NPC) this).anInt11805 * -1450313741));
				if (bool)
					models[i_5_].method1375(class261_0_, null, 0);
				else
					models[i_5_].method1375(class261_0_, aClass90Array9007[i_5_], 0);
			} else if (!bool)
				aClass90Array9007[i_5_].aBool1232 = false;
		}
		if (((NPC) this).aClass485_11659 != null) {
			Class105 class105 = ((NPC) this).aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_6_ = 0; i_6_ < models.length; i_6_++) {
			if (models[i_6_] != null)
				((NPC) this).aBool11667 |= models[i_6_].method1400();
			models[i_6_] = null;
		}
		anInt11609 = client.anInt8699 * 1020453599;
		return class531;
	}

	boolean method10681(Class106 class106, int i, byte i_7_) {
		int i_8_ = i;
		Class538 class538 = method10554((byte) 9);
		Class663 class663 = ((aClass663_11670.method7786(1390902129) && !aClass663_11670.method7793(-1945817297)) ? aClass663_11670 : null);
		Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(-1975098719) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
		int i_9_ = 780604479 * class538.anInt6040;
		int i_10_ = -844928567 * class538.anInt6041;
		if (i_9_ != 0 || 0 != i_10_ || 0 != class538.anInt6053 * 493296853 || class538.anInt6050 * -2091503247 != 0)
			i |= 0x7;
		boolean bool = (0 != aByte11605 && client.cycles >= -282982613 * anInt11641 && client.cycles < -1305810085 * anInt11642);
		if (bool)
			i |= 0x80000;
		boolean bool_11_ = false;
		if (0 != (-1980307285 * ((NPC) this).anInt11647)) {
			NPCDefintion class410 = (aClass410_11803.anIntArray4795 != null ? aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -378759827) : aClass410_11803);
			if (null == class410 || (client.cycles >= (class410.anInt4858 * 761960121 + -1798725795 * (((NPC) this).anInt11645))))
				((NPC) this).anInt11647 = 0;
			else {
				((NPC) this).anInt11647 = ((255 - ((client.cycles - -1798725795 * ((NPC) this).anInt11645) * 255 / (761960121 * class410.anInt4858))) * 868078083);
				bool_11_ = true;
			}
		}
		if (bool_11_)
			i |= 0x100;
		int i_12_ = aClass15_11655.method645(-691496427);
		Model model = (models[0] = aClass410_11803.method4949(class106, i, Class197.aClass639_Sub11_2359, Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, class663, class663_sub2, aClass663_Sub3_Sub1Array11650, anIntArray11651, i_12_, aClass399_11801, method10572((byte) -112), false, (byte) 101));
		if (model == null)
			return false;
		((NPC) this).anInt11610 = model.method1382() * 709047959;
		((NPC) this).anInt11658 = model.method1386() * -998391511;
		model.method1379();
		method10527(model, (byte) -36);
		if (0 != i_9_ || i_10_ != 0) {
			method10570(i_12_, i_9_, i_10_, class538.anInt6042 * 1840536857, 1172011525 * class538.anInt6043, -1129520800);
			if (-329006609 * ((NPC) this).anInt11616 != 0)
				models[0].method1368(((NPC) this).anInt11616 * -329006609);
			if (((NPC) this).anInt11648 * -1081740099 != 0)
				models[0].method1500(((NPC) this).anInt11648 * -1081740099);
			if (0 != (((NPC) this).anInt11618 * -2092938715))
				models[0].method1358(0, (((NPC) this).anInt11618 * -2092938715), 0);
		} else
			method10570(i_12_, method10556((short) -7455) << 9, method10556((short) -18757) << 9, 0, 0, -1129520800);
		if (bool)
			model.method1396(aByte11643, aByte11644, aByte11626, aByte11605 & 0xff);
		if (bool_11_)
			model.method1467((byte) ((((NPC) this).anInt11647) * -1980307285), null);
		method10528(class106, class538, i_8_, i_9_, i_10_, i_12_, -77490206);
		return true;
	}

	void method8336(Class106 class106, int i) {
		if (null != aClass410_11803 && (((NPC) this).aBool11666 || method10681(class106, 0, (byte) 1))) {
			Class261 class261 = class106.method1753();
			class261.method3568(method5392());
			class261.method3580(0.0F, -5.0F, 0.0F);
			method10536(class106, models, class261, ((NPC) this).aBool11666, 1514007224);
			for (int i_13_ = 0; i_13_ < models.length; i_13_++)
				models[i_13_] = null;
		}
	}

	public final void method10682(Class661 class661, int i, byte i_14_) {
		int i_15_ = screenX[0];
		int i_16_ = screenY[0];
		switch (class661.anInt8451 * -378624297) {
			case 1:
				i_15_--;
				i_16_++;
				break;
			case 4:
				i_15_++;
				break;
			case 3:
				i_16_--;
				break;
			case 7:
				i_15_--;
				i_16_--;
				break;
			case 2:
				i_16_++;
				break;
			case 5:
				i_15_++;
				i_16_--;
				break;
			case 0:
				i_15_++;
				i_16_++;
				break;
			case 6:
				i_15_--;
				break;
		}
		if (aClass663_11670.method7786(-1792682166) && (aClass663_11670.method7787(153948485).anInt1561 * 657197671 == 1)) {
			anIntArray11640 = null;
			aClass663_11670.method7801(-1, 751680147);
		}
		for (int i_17_ = 0; i_17_ < currentGraphics.length; i_17_++) {
			if (-1701003211 * currentGraphics[i_17_].id != -1) {
				GraphicsDefinition class659 = ((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition(currentGraphics[i_17_].id * -1701003211, 1563253746)));
				if (class659.aBool8427 && -1 != class659.anInt8433 * 1281094747 && (((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(((class659.anInt8433) * 1281094747), -1155510090)).anInt1561) * 657197671 == 1) {
					currentGraphics[i_17_].aClass663_7776.method7801(-1, 751680147);
					currentGraphics[i_17_].id = 803171811;
				}
			}
		}
		if (stepsCount * -2037536229 < screenX.length - 1)
			stepsCount += -298115053;
		for (int i_18_ = stepsCount * -2037536229; i_18_ > 0; i_18_--) {
			screenX[i_18_] = screenX[i_18_ - 1];
			screenY[i_18_] = screenY[i_18_ - 1];
			aByteArray11661[i_18_] = aByteArray11661[i_18_ - 1];
		}
		screenX[0] = i_15_;
		screenY[0] = i_16_;
		aByteArray11661[0] = (byte) i;
	}

	public Class240 method282() {
		return Class240.method3306();
	}

	public final boolean method10683(byte i) {
		if (null == aClass410_11803)
			return false;
		return true;
	}

	public int method10684(int i, int i_19_) {
		return ((NPC) this).anIntArray11802[i];
	}

	public int method10531(int i) {
		if (aClass410_11803.anIntArray4795 != null) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 1489849773);
			if (class410 != null && class410.anInt4811 * 2031141587 != -1)
				return 2031141587 * class410.anInt4811;
		}
		return 2031141587 * aClass410_11803.anInt4811;
	}

	public int method8312(int i) {
		if (null != aClass410_11803.anIntArray4795) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 1767765940);
			if (null != class410 && -1 != 909410253 * class410.anInt4833)
				return class410.anInt4833 * 909410253;
		}
		return (-1 != aClass410_11803.anInt4833 * 909410253 ? 909410253 * aClass410_11803.anInt4833 : super.method8312(1766171247));
	}

	boolean method10685(int i) {
		return aClass410_11803.aBool4827;
	}

	public Class583 method10567(int i) {
		if (((NPC) this).aClass583_11608 != null && null == ((Class583) (((NPC) this).aClass583_11608)).aString7730)
			return null;
		return ((NPC) this).aClass583_11608;
	}

	boolean method8297(Class106 class106, int i, int i_20_, int i_21_) {
		if (null == aClass410_11803)
			return false;
		if (null != aClass410_11803.aClass326_4853)
			return class106.method1736(i, i_20_, method5392(), aClass410_11803.aClass326_4853, 65280);
		if (!method10681(class106, 131072, (byte) 1))
			return false;
		Class261 class261 = method5392();
		boolean bool = false;
		for (int i_22_ = 0; i_22_ < models.length; i_22_++) {
			if (null != models[i_22_]) {
				boolean bool_23_;
				while_62_: do {
					do {
						if (aClass410_11803.anInt4856 * 1848261357 <= 0) {
							if (528602909 * aClass410_11803.anInt4852 == -1) {
								if (aClass410_11803.anInt4792 * 358769667 != 1)
									break;
							} else if (528602909 * aClass410_11803.anInt4852 != 1)
								break;
						}
						bool_23_ = true;
						break while_62_;
					} while (false);
					bool_23_ = false;
				} while (false);
				boolean bool_24_ = bool_23_;
				boolean bool_25_ = models[i_22_].method1376(i, i_20_, class261, bool_24_, (1848261357 * (aClass410_11803.anInt4856)));
				if (bool_25_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_26_ = 0; i_26_ < models.length; i_26_++)
			models[i_26_] = null;
		return bool;
	}

	public boolean method10533(int i) {
		return JS5ConfigGroup.aClass484_2593.aBool5409;
	}

	final void method8302(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_27_, int i_28_, boolean bool, int i_29_) {
		throw new IllegalStateException();
	}

	final void method8303(int i) {
		throw new IllegalStateException();
	}

	public int method44() {
		return anInt11633 * -821391465;
	}

	public Class240 method280(int i) {
		return Class240.method3306();
	}

	public void method10686(int i, int i_30_, int i_31_, boolean bool, int i_32_, int i_33_) {
		aByte9009 = aByte9008 = (byte) i;
		if (client.aClass613_8605.method7287((byte) 15).method3689(i_30_, i_31_, -2103939839))
			aByte9008++;
		if (aClass663_11670.method7786(678227316) && (aClass663_11670.method7787(153948485).anInt1561 * 657197671 == 1)) {
			anIntArray11640 = null;
			aClass663_11670.method7801(-1, 751680147);
		}
		for (int i_34_ = 0; i_34_ < currentGraphics.length; i_34_++) {
			if (-1 != -1701003211 * currentGraphics[i_34_].id) {
				GraphicsDefinition class659 = ((GraphicsDefinition) (Class667.aClass639_Sub10_8509.getDefinition(currentGraphics[i_34_].id * -1701003211, -620492450)));
				if (class659.aBool8427 && 1281094747 * class659.anInt8433 != -1 && (((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(((class659.anInt8433) * 1281094747), -983511984)).anInt1561) * 657197671 == 1) {
					currentGraphics[i_34_].aClass663_7776.method7801(-1, 751680147);
					currentGraphics[i_34_].id = 803171811;
				}
			}
		}
		if (!bool) {
			int i_35_ = i_30_ - screenX[0];
			int i_36_ = i_31_ - screenY[0];
			if (i_35_ >= -8 && i_35_ <= 8 && i_36_ >= -8 && i_36_ <= 8) {
				if (-2037536229 * stepsCount < screenX.length - 1)
					stepsCount += -298115053;
				for (int i_37_ = -2037536229 * stepsCount; i_37_ > 0; i_37_--) {
					screenX[i_37_] = screenX[i_37_ - 1];
					screenY[i_37_] = screenY[i_37_ - 1];
					aByteArray11661[i_37_] = aByteArray11661[i_37_ - 1];
				}
				screenX[0] = i_30_;
				screenY[0] = i_31_;
				aByteArray11661[0] = Class453.aClass453_5177.aByte5183;
				return;
			}
		}
		stepsCount = 0;
		anInt11663 = 0;
		anInt11662 = 0;
		screenX[0] = i_30_;
		screenY[0] = i_31_;
		Class240 class240 = Class240.method3276(method5394().aClass240_2647);
		class240.aFloat2653 = (float) ((screenX[0] << 9) + (i_32_ << 8));
		class240.aFloat2657 = (float) ((screenY[0] << 9) + (i_32_ << 8));
		method5401(class240);
		class240.method3261();
		if (((NPC) this).aClass485_11659 != null)
			((NPC) this).aClass485_11659.method5764();
	}

	public void method10687(NPCDefintion class410, boolean bool, boolean bool_38_, boolean bool_39_, byte i) {
		if (aClass410_11803 != class410 && Class25.aBool165 && Class572_Sub10.method8409(anInt11633 * -821391465, (byte) 18))
			Class35.method782((short) 582);
		aClass410_11803 = class410;
		if (null != aClass410_11803) {
			if (bool)
				aString11807 = aClass410_11803.aString4791;
			if (bool_38_)
				anInt11806 = aClass410_11803.anInt4812 * 1325621039;
			if (bool_39_)
				aClass418_11813 = null;
		}
		if (((NPC) this).aClass485_11659 != null)
			((NPC) this).aClass485_11659.method5764();
	}

	public NPC(Class523 class523) {
		super(class523, Class624.aClass202_Sub1_Sub2_8080);
		((NPC) this).anIntArray11802 = new int[6];
		((NPC) this).anIntArray11809 = new int[6];
		method10679((byte) 6);
	}

	public void method10688(String string, int i, int i_40_, int i_41_) {
		int i_42_ = (Class425.method5176(1693655200) * (711669513 * JS5ConfigGroup.aClass484_2593.anInt5406));
		method10545(string, i, i_40_, i_42_, 217639833);
	}

	public int method10541(int i) {
		return 1 + anInt11633 * -821391465;
	}

	public Class401 method281(int i) {
		return Class401.aClass401_4743;
	}

	public Class401 method272() {
		return Class401.aClass401_4743;
	}

	public boolean method10562() {
		return JS5ConfigGroup.aClass484_2593.aBool5409;
	}

	public boolean method8309(byte i) {
		if (null != aClass410_11803.anIntArray4795 && aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -274281019) == null)
			return false;
		return true;
	}

	public int method10689(int i, int i_43_) {
		return ((NPC) this).anIntArray11809[i];
	}

	public Class401 method276() {
		return Class401.aClass401_4743;
	}

	public int method10559() {
		if (aClass410_11803.anIntArray4795 != null) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -1858307704);
			if (class410 != null && class410.anInt4811 * 2031141587 != -1)
				return 2031141587 * class410.anInt4811;
		}
		return 2031141587 * aClass410_11803.anInt4811;
	}

	public int method55() {
		return anInt11633 * -821391465;
	}

	public int method68() {
		return anInt11633 * -821391465;
	}

	public Class572_Sub17 method270() {
		Class497 class497 = client.aClass613_8605.method7280((byte) -82);
		return (Class663_Sub1.method8953(aByte9009, ((int) method5394().aClass240_2647.aFloat2653 + -2077331968 * class497.localX), -(int) method5394().aClass240_2647.aFloat2656, ((int) method5394().aClass240_2647.aFloat2657 + -1078397440 * class497.localY), -20148382));
	}

	public NPC(Class523 class523, int i) {
		super(class523, i, Class624.aClass202_Sub1_Sub2_8080);
		((NPC) this).anIntArray11802 = new int[6];
		((NPC) this).anIntArray11809 = new int[6];
		method10679((byte) 6);
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

	public Class240 method271() {
		return Class240.method3306();
	}

	int method8298(int i) {
		if (aClass410_11803 == null)
			return 0;
		return aClass410_11803.anInt4856 * 1848261357;
	}

	public int method8324() {
		if (null != aClass410_11803.anIntArray4795) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -464770453);
			if (null != class410 && -1 != 909410253 * class410.anInt4833)
				return class410.anInt4833 * 909410253;
		}
		return (-1 != aClass410_11803.anInt4833 * 909410253 ? 909410253 * aClass410_11803.anInt4833 : super.method8312(-719430567));
	}

	final boolean method8299(int i) {
		return false;
	}

	Class531 method8326(Class106 class106) {
		if (aClass410_11803 == null || !method10681(class106, 526336, (byte) 1))
			return null;
		Class261 class261 = method5392();
		Class238 class238 = method5394();
		Class261 class261_44_ = class106.method1753();
		int i = aClass15_11655.method645(1767832261);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && null != class536.aClass456_Sub1_Sub1_5992) {
			int i_45_ = ((((NPC) this).anInt11617 * -831783159) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			((NPC) this).anInt11617 = 1609121593 * (int) ((float) (((NPC) this).anInt11617 * -831783159) - (float) i_45_ / 10.0F);
		} else
			((NPC) this).anInt11617 = (1609121593 * (int) ((float) ((((NPC) this).anInt11617) * -831783159) - (float) (-831783159 * (((NPC) this).anInt11617)) / 10.0F));
		class261_44_.method3568(class261);
		class261_44_.method3580(0.0F, (float) (-20 - (-831783159 * ((NPC) this).anInt11617)), 0.0F);
		Class538 class538 = method10554((byte) -6);
		NPCDefintion class410 = (aClass410_11803.anIntArray4795 != null ? aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 1366206239) : aClass410_11803);
		boolean bool = class410.aClass326_4853 != null;
		((NPC) this).aBool11667 = false;
		Class531 class531 = null;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(-61276874) == 1 && class410.aBool4829 && class538.aBool6059) {
			Class663 class663 = ((aClass663_11670.method7786(1239606196) && aClass663_11670.method7793(-1993708187)) ? aClass663_11670 : null);
			Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(286256921) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
			short i_46_ = JS5ConfigGroup.aClass484_2593.aShort5411;
			byte i_47_ = JS5ConfigGroup.aClass484_2593.aByte5405;
			if (aClass410_11803.aShort4848 > -1) {
				i_46_ = aClass410_11803.aShort4848;
				i_47_ = aClass410_11803.aByte4835;
			}
			Model model;
			if (i_46_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(1081392419) == 1)
				model = (Class102.method1640(class106, i, -329006609 * (((NPC) this).anInt11616), (((NPC) this).anInt11648 * -1081740099), (((NPC) this).anInt11618 * -2092938715), models[0], i_46_, i_47_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
			else
				model = (Class167.method2682(class106, i, (((NPC) this).anInt11616 * -329006609), (-1081740099 * ((NPC) this).anInt11648), (((NPC) this).anInt11618 * -2092938715), 358769667 * aClass410_11803.anInt4792, models[0], aClass410_11803.aShort4830 & 0xffff, aClass410_11803.aShort4831 & 0xffff, aClass410_11803.aByte4832 & 0xff, aClass410_11803.aByte4844 & 0xff, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) 319));
			if (model != null) {
				class531 = Class572_Sub16_Sub9.method10262(method10685(-1385463611), -1549284207);
				((NPC) this).aBool11667 = true;
				class106.method1763(false);
				if (bool)
					model.method1375(class261_44_, null, 0);
				else {
					if (null == aClass90Array9007 || (aClass90Array9007.length < 1 + models.length))
						method8339(1 + models.length, -1008905746);
					model.method1375(class261_44_, (aClass90Array9007[models.length]), 0);
				}
				class106.method1763(true);
			}
		}
		if (bool) {
			if (null == aClass90Array9007 || aClass90Array9007.length > 1)
				method8339(1, -261010615);
			class106.method1738(class261_44_, aClass90Array9007[0], class410.aClass326_4853);
		} else if (aClass90Array9007 == null || aClass90Array9007.length < models.length)
			method8339(models.length, -1143871150);
		if (class531 == null)
			class531 = Class572_Sub16_Sub9.method10262(method10685(-407121970), -578578369);
		method10536(class106, models, class261_44_, false, 1899782639);
		for (int i_48_ = 0; i_48_ < models.length; i_48_++) {
			if (models[i_48_] != null) {
				if (aClass410_11803.aBool4857)
					models[i_48_].method1396((((NPC) this).anInt11810 * 1650377255), (((NPC) this).anInt11798 * -1336140721), (315838417 * ((NPC) this).anInt11814), (((NPC) this).anInt11805 * -1450313741));
				if (bool)
					models[i_48_].method1375(class261_44_, null, 0);
				else
					models[i_48_].method1375(class261_44_, aClass90Array9007[i_48_], 0);
			} else if (!bool)
				aClass90Array9007[i_48_].aBool1232 = false;
		}
		if (((NPC) this).aClass485_11659 != null) {
			Class105 class105 = ((NPC) this).aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_49_ = 0; i_49_ < models.length; i_49_++) {
			if (models[i_49_] != null)
				((NPC) this).aBool11667 |= models[i_49_].method1400();
			models[i_49_] = null;
		}
		anInt11609 = client.anInt8699 * 1020453599;
		return class531;
	}

	Class531 method8327(Class106 class106) {
		if (aClass410_11803 == null || !method10681(class106, 526336, (byte) 1))
			return null;
		Class261 class261 = method5392();
		Class238 class238 = method5394();
		Class261 class261_50_ = class106.method1753();
		int i = aClass15_11655.method645(-640750868);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && null != class536.aClass456_Sub1_Sub1_5992) {
			int i_51_ = ((((NPC) this).anInt11617 * -831783159) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			((NPC) this).anInt11617 = 1609121593 * (int) ((float) (((NPC) this).anInt11617 * -831783159) - (float) i_51_ / 10.0F);
		} else
			((NPC) this).anInt11617 = (1609121593 * (int) ((float) ((((NPC) this).anInt11617) * -831783159) - (float) (-831783159 * (((NPC) this).anInt11617)) / 10.0F));
		class261_50_.method3568(class261);
		class261_50_.method3580(0.0F, (float) (-20 - (-831783159 * ((NPC) this).anInt11617)), 0.0F);
		Class538 class538 = method10554((byte) 89);
		NPCDefintion class410 = (aClass410_11803.anIntArray4795 != null ? aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -1506239466) : aClass410_11803);
		boolean bool = class410.aClass326_4853 != null;
		((NPC) this).aBool11667 = false;
		Class531 class531 = null;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(1790344126) == 1 && class410.aBool4829 && class538.aBool6059) {
			Class663 class663 = ((aClass663_11670.method7786(-1227345664) && aClass663_11670.method7793(-2139965325)) ? aClass663_11670 : null);
			Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(982827885) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
			short i_52_ = JS5ConfigGroup.aClass484_2593.aShort5411;
			byte i_53_ = JS5ConfigGroup.aClass484_2593.aByte5405;
			if (aClass410_11803.aShort4848 > -1) {
				i_52_ = aClass410_11803.aShort4848;
				i_53_ = aClass410_11803.aByte4835;
			}
			Model model;
			if (i_52_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(1888354804) == 1)
				model = (Class102.method1640(class106, i, -329006609 * (((NPC) this).anInt11616), (((NPC) this).anInt11648 * -1081740099), (((NPC) this).anInt11618 * -2092938715), models[0], i_52_, i_53_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
			else
				model = (Class167.method2682(class106, i, (((NPC) this).anInt11616 * -329006609), (-1081740099 * ((NPC) this).anInt11648), (((NPC) this).anInt11618 * -2092938715), 358769667 * aClass410_11803.anInt4792, models[0], aClass410_11803.aShort4830 & 0xffff, aClass410_11803.aShort4831 & 0xffff, aClass410_11803.aByte4832 & 0xff, aClass410_11803.aByte4844 & 0xff, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) -30257));
			if (model != null) {
				class531 = Class572_Sub16_Sub9.method10262(method10685(1275681298), -191225792);
				((NPC) this).aBool11667 = true;
				class106.method1763(false);
				if (bool)
					model.method1375(class261_50_, null, 0);
				else {
					if (null == aClass90Array9007 || (aClass90Array9007.length < 1 + models.length))
						method8339(1 + models.length, -401787362);
					model.method1375(class261_50_, (aClass90Array9007[models.length]), 0);
				}
				class106.method1763(true);
			}
		}
		if (bool) {
			if (null == aClass90Array9007 || aClass90Array9007.length > 1)
				method8339(1, -707950282);
			class106.method1738(class261_50_, aClass90Array9007[0], class410.aClass326_4853);
		} else if (aClass90Array9007 == null || aClass90Array9007.length < models.length)
			method8339(models.length, -1137179711);
		if (class531 == null)
			class531 = Class572_Sub16_Sub9.method10262(method10685(1035472275), -1981330427);
		method10536(class106, models, class261_50_, false, 1429860892);
		for (int i_54_ = 0; i_54_ < models.length; i_54_++) {
			if (models[i_54_] != null) {
				if (aClass410_11803.aBool4857)
					models[i_54_].method1396((((NPC) this).anInt11810 * 1650377255), (((NPC) this).anInt11798 * -1336140721), (315838417 * ((NPC) this).anInt11814), (((NPC) this).anInt11805 * -1450313741));
				if (bool)
					models[i_54_].method1375(class261_50_, null, 0);
				else
					models[i_54_].method1375(class261_50_, aClass90Array9007[i_54_], 0);
			} else if (!bool)
				aClass90Array9007[i_54_].aBool1232 = false;
		}
		if (((NPC) this).aClass485_11659 != null) {
			Class105 class105 = ((NPC) this).aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_55_ = 0; i_55_ < models.length; i_55_++) {
			if (models[i_55_] != null)
				((NPC) this).aBool11667 |= models[i_55_].method1400();
			models[i_55_] = null;
		}
		anInt11609 = client.anInt8699 * 1020453599;
		return class531;
	}

	Class531 method8328(Class106 class106) {
		if (aClass410_11803 == null || !method10681(class106, 526336, (byte) 1))
			return null;
		Class261 class261 = method5392();
		Class238 class238 = method5394();
		Class261 class261_56_ = class106.method1753();
		int i = aClass15_11655.method645(-1609333427);
		Class536 class536 = (aClass523_9010.aClass536ArrayArrayArray5882[aByte9009][(int) class238.aClass240_2647.aFloat2653 >> 9][(int) class238.aClass240_2647.aFloat2657 >> 9]);
		if (null != class536 && null != class536.aClass456_Sub1_Sub1_5992) {
			int i_57_ = ((((NPC) this).anInt11617 * -831783159) - class536.aClass456_Sub1_Sub1_5992.aShort11275);
			((NPC) this).anInt11617 = 1609121593 * (int) ((float) (((NPC) this).anInt11617 * -831783159) - (float) i_57_ / 10.0F);
		} else
			((NPC) this).anInt11617 = (1609121593 * (int) ((float) ((((NPC) this).anInt11617) * -831783159) - (float) (-831783159 * (((NPC) this).anInt11617)) / 10.0F));
		class261_56_.method3568(class261);
		class261_56_.method3580(0.0F, (float) (-20 - (-831783159 * ((NPC) this).anInt11617)), 0.0F);
		Class538 class538 = method10554((byte) 3);
		NPCDefintion class410 = (aClass410_11803.anIntArray4795 != null ? aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -258049007) : aClass410_11803);
		boolean bool = class410.aClass326_4853 != null;
		((NPC) this).aBool11667 = false;
		Class531 class531 = null;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub5_9248.method8148(-462515503) == 1 && class410.aBool4829 && class538.aBool6059) {
			Class663 class663 = ((aClass663_11670.method7786(-2042287743) && aClass663_11670.method7793(-2055635121)) ? aClass663_11670 : null);
			Class663_Sub2 class663_sub2 = ((aClass663_Sub2_11631.method7786(-2060764486) && (!aClass663_Sub2_11631.aBool9556 || class663 == null)) ? aClass663_Sub2_11631 : null);
			short i_58_ = JS5ConfigGroup.aClass484_2593.aShort5411;
			byte i_59_ = JS5ConfigGroup.aClass484_2593.aByte5405;
			if (aClass410_11803.aShort4848 > -1) {
				i_58_ = aClass410_11803.aShort4848;
				i_59_ = aClass410_11803.aByte4835;
			}
			Model model;
			if (i_58_ > -1 && Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(1001007641) == 1)
				model = (Class102.method1640(class106, i, -329006609 * (((NPC) this).anInt11616), (((NPC) this).anInt11648 * -1081740099), (((NPC) this).anInt11618 * -2092938715), models[0], i_58_, i_59_, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (byte) 1));
			else
				model = (Class167.method2682(class106, i, (((NPC) this).anInt11616 * -329006609), (-1081740099 * ((NPC) this).anInt11648), (((NPC) this).anInt11618 * -2092938715), 358769667 * aClass410_11803.anInt4792, models[0], aClass410_11803.aShort4830 & 0xffff, aClass410_11803.aShort4831 & 0xffff, aClass410_11803.aByte4832 & 0xff, aClass410_11803.aByte4844 & 0xff, (null != class663_sub2 ? (Class663) class663_sub2 : class663), (short) -11087));
			if (model != null) {
				class531 = Class572_Sub16_Sub9.method10262(method10685(16148302), -1287001374);
				((NPC) this).aBool11667 = true;
				class106.method1763(false);
				if (bool)
					model.method1375(class261_56_, null, 0);
				else {
					if (null == aClass90Array9007 || (aClass90Array9007.length < 1 + models.length))
						method8339(1 + models.length, -1314071579);
					model.method1375(class261_56_, (aClass90Array9007[models.length]), 0);
				}
				class106.method1763(true);
			}
		}
		if (bool) {
			if (null == aClass90Array9007 || aClass90Array9007.length > 1)
				method8339(1, -705395606);
			class106.method1738(class261_56_, aClass90Array9007[0], class410.aClass326_4853);
		} else if (aClass90Array9007 == null || aClass90Array9007.length < models.length)
			method8339(models.length, -12357352);
		if (class531 == null)
			class531 = Class572_Sub16_Sub9.method10262(method10685(225658939), 6452696);
		method10536(class106, models, class261_56_, false, 1244705725);
		for (int i_60_ = 0; i_60_ < models.length; i_60_++) {
			if (models[i_60_] != null) {
				if (aClass410_11803.aBool4857)
					models[i_60_].method1396((((NPC) this).anInt11810 * 1650377255), (((NPC) this).anInt11798 * -1336140721), (315838417 * ((NPC) this).anInt11814), (((NPC) this).anInt11805 * -1450313741));
				if (bool)
					models[i_60_].method1375(class261_56_, null, 0);
				else
					models[i_60_].method1375(class261_56_, aClass90Array9007[i_60_], 0);
			} else if (!bool)
				aClass90Array9007[i_60_].aBool1232 = false;
		}
		if (((NPC) this).aClass485_11659 != null) {
			Class105 class105 = ((NPC) this).aClass485_11659.method5767();
			class106.method1760(class105);
		}
		for (int i_61_ = 0; i_61_ < models.length; i_61_++) {
			if (models[i_61_] != null)
				((NPC) this).aBool11667 |= models[i_61_].method1400();
			models[i_61_] = null;
		}
		anInt11609 = client.anInt8699 * 1020453599;
		return class531;
	}

	final boolean method8347() {
		return false;
	}

	boolean method8321(Class106 class106, int i, int i_62_) {
		if (null == aClass410_11803)
			return false;
		if (null != aClass410_11803.aClass326_4853)
			return class106.method1736(i, i_62_, method5392(), aClass410_11803.aClass326_4853, 65280);
		if (!method10681(class106, 131072, (byte) 1))
			return false;
		Class261 class261 = method5392();
		boolean bool = false;
		for (int i_63_ = 0; i_63_ < models.length; i_63_++) {
			if (null != models[i_63_]) {
				boolean bool_64_;
				while_63_: do {
					do {
						if (aClass410_11803.anInt4856 * 1848261357 <= 0) {
							if (528602909 * aClass410_11803.anInt4852 == -1) {
								if (aClass410_11803.anInt4792 * 358769667 != 1)
									break;
							} else if (528602909 * aClass410_11803.anInt4852 != 1)
								break;
						}
						bool_64_ = true;
						break while_63_;
					} while (false);
					bool_64_ = false;
				} while (false);
				boolean bool_65_ = bool_64_;
				boolean bool_66_ = models[i_63_].method1376(i, i_62_, class261, bool_65_, (1848261357 * (aClass410_11803.anInt4856)));
				if (bool_66_) {
					bool = true;
					break;
				}
			}
		}
		for (int i_67_ = 0; i_67_ < models.length; i_67_++)
			models[i_67_] = null;
		return bool;
	}

	final boolean method8332() {
		return false;
	}

	final boolean method8333() {
		return false;
	}

	final boolean method8334() {
		return false;
	}

	final boolean method8349() {
		return false;
	}

	final void method8337(Class106 class106, Class456_Sub1 class456_sub1, int i, int i_68_, int i_69_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method8338() {
		throw new IllegalStateException();
	}

	final void method8343() {
		throw new IllegalStateException();
	}

	final void method8304() {
		throw new IllegalStateException();
	}

	int method10557() {
		if (anInt11804 * 1235203969 != -1)
			return 1235203969 * anInt11804;
		if (aClass410_11803.anIntArray4795 != null) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -1569928816);
			if (class410 != null && 1071699547 * class410.anInt4805 != -1)
				return 1071699547 * class410.anInt4805;
		}
		return aClass410_11803.anInt4805 * 1071699547;
	}

	int method10558() {
		if (anInt11804 * 1235203969 != -1)
			return 1235203969 * anInt11804;
		if (aClass410_11803.anIntArray4795 != null) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -19545504);
			if (class410 != null && 1071699547 * class410.anInt4805 != -1)
				return 1071699547 * class410.anInt4805;
		}
		return aClass410_11803.anInt4805 * 1071699547;
	}

	public int method10535() {
		return 1 + anInt11633 * -821391465;
	}

	public int method8325() {
		if (null != aClass410_11803.anIntArray4795) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -573939119);
			if (null != class410 && -1 != 909410253 * class410.anInt4833)
				return class410.anInt4833 * 909410253;
		}
		return (-1 != aClass410_11803.anInt4833 * 909410253 ? 909410253 * aClass410_11803.anInt4833 : super.method8312(620455357));
	}

	void method8330(Class106 class106) {
		if (null != aClass410_11803 && (((NPC) this).aBool11666 || method10681(class106, 0, (byte) 1))) {
			Class261 class261 = class106.method1753();
			class261.method3568(method5392());
			class261.method3580(0.0F, -5.0F, 0.0F);
			method10536(class106, models, class261, ((NPC) this).aBool11666, 2035886362);
			for (int i = 0; i < models.length; i++)
				models[i] = null;
		}
	}

	public boolean method10563() {
		return JS5ConfigGroup.aClass484_2593.aBool5409;
	}

	public Class230 method274(int i) {
		Class230 class230 = Class230.method3210();
		class230.method3173(Class325.method4146(452190977 * aClass15_11655.anInt125), 0.0F, 0.0F);
		return class230;
	}

	public Class583 method10553() {
		if (((NPC) this).aClass583_11608 != null && null == ((Class583) (((NPC) this).aClass583_11608)).aString7730)
			return null;
		return ((NPC) this).aClass583_11608;
	}

	public Class583 method10565() {
		if (((NPC) this).aClass583_11608 != null && null == ((Class583) (((NPC) this).aClass583_11608)).aString7730)
			return null;
		return ((NPC) this).aClass583_11608;
	}

	public boolean method8348() {
		if (null != aClass410_11803.anIntArray4795 && aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, 1709348507) == null)
			return false;
		return true;
	}

	public Class535 method8341(Class106 class106) {
		return null;
	}

	public Class535 method8305(Class106 class106) {
		return null;
	}

	public Class535 method8344(Class106 class106) {
		return null;
	}

	int method8296() {
		if (aClass410_11803 == null)
			return 0;
		return aClass410_11803.anInt4856 * 1848261357;
	}

	void method10690() {
		((NPC) this).anInt11810 = (32 + (int) (Math.random() * 4.0)) * -453735017;
		((NPC) this).anInt11798 = (3 + (int) (Math.random() * 2.0)) * -1576699217;
		((NPC) this).anInt11814 = (16 + (int) (Math.random() * 3.0)) * 1241606449;
		if (Class213.aClass572_Sub24_2463.aClass665_Sub12_9230.method8213(-1854663331) == 1)
			((NPC) this).anInt11805 = (int) (Math.random() * 6.0) * -787318469;
		else
			((NPC) this).anInt11805 = (int) (Math.random() * 12.0) * -787318469;
	}

	int method10572(byte i) {
		if (anInt11804 * 1235203969 != -1)
			return 1235203969 * anInt11804;
		if (aClass410_11803.anIntArray4795 != null) {
			NPCDefintion class410 = aClass410_11803.method4947(Class133_Sub23.playerVarsProvider, Class133_Sub23.playerVarsProvider, -80244850);
			if (class410 != null && 1071699547 * class410.anInt4805 != -1)
				return 1071699547 * class410.anInt4805;
		}
		return aClass410_11803.anInt4805 * 1071699547;
	}

	public boolean method10561() {
		return JS5ConfigGroup.aClass484_2593.aBool5409;
	}

	public void method10691(int i, int i_70_, int i_71_, int i_72_) {
		((NPC) this).anIntArray11802[i] = i_70_;
		((NPC) this).anIntArray11809[i] = i_71_;
	}

	public int method113(byte i) {
		return anInt11633 * -821391465;
	}

	void method8313(Class106 class106) {
		if (null != aClass410_11803 && (((NPC) this).aBool11666 || method10681(class106, 0, (byte) 1))) {
			Class261 class261 = class106.method1753();
			class261.method3568(method5392());
			class261.method3580(0.0F, -5.0F, 0.0F);
			method10536(class106, models, class261, ((NPC) this).aBool11666, 1290445047);
			for (int i = 0; i < models.length; i++)
				models[i] = null;
		}
	}

	public Class230 method278() {
		Class230 class230 = Class230.method3210();
		class230.method3173(Class325.method4146(452190977 * aClass15_11655.anInt125), 0.0F, 0.0F);
		return class230;
	}

	public static Class481_Sub1 method10692(int i) {
		Class633.anInt8205 = 0;
		return Class400.method4771(-682352911);
	}

	static final void method10693(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}
}

package game;

/* Class591_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class591_Sub2_Sub1_Sub1 extends Class591_Sub2_Sub1 {
	short aShort11675;
	Class503 aClass503_11676;
	short aShort11677;
	int anInt11678;
	short aShort11679;
	int anInt11680;
	short aShort11681;
	short aShort11682;
	short aShort11683;
	short aShort11684;

	void method10575(Class503 class503, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, boolean bool, boolean bool_12_) {
		((Class591_Sub2_Sub1_Sub1) this).aClass503_11676 = class503;
		anInt10970 = i << 12;
		anInt10973 = i_0_ << 12;
		anInt10975 = i_1_ << 12;
		anInt10974 = i_7_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11675 = ((Class591_Sub2_Sub1_Sub1) this).aShort11679 = (short) i_6_;
		anInt10976 = i_8_;
		aShort10978 = (short) i_9_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11684 = (short) i_10_;
		anInt10972 = i_11_;
		aBool10979 = bool_12_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11677 = (short) i_2_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11682 = (short) i_3_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11683 = (short) i_4_;
		((Class591_Sub2_Sub1_Sub1) this).anInt11680 = i_5_;
		method10576();
	}

	void method10576() {
		int i = (((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).anInt5423);
		if ((((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[i]) != null)
			((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[i].method10581();
		((Class485) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass485_5568)).aClass591_Sub2_Sub1_Sub1Array5422[i] = this;
		((Class591_Sub2_Sub1_Sub1) this).aShort11681 = (short) ((Class485) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass485_5568)).anInt5423;
		((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).anInt5423 = i + 1 & 0x1fff;
		((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass652_5558.method7703(this, (short) -16313);
	}

	void method10577(long l, int i) {
		((Class591_Sub2_Sub1_Sub1) this).aShort11679 -= i;
		if (((Class591_Sub2_Sub1_Sub1) this).aShort11679 <= 0)
			method10581();
		else {
			int i_13_ = anInt10970 >> 12;
			int i_14_ = anInt10973 >> 12;
			int i_15_ = anInt10975 >> 12;
			Class485 class485 = (((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568);
			Class308 class308 = (((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass308_5559);
			if (class308.anInt3570 * 423469855 != 0) {
				if ((((Class591_Sub2_Sub1_Sub1) this).aShort11675 - ((Class591_Sub2_Sub1_Sub1) this).aShort11679) <= class308.anInt3564 * -136864253) {
					int i_16_ = ((anInt10974 >> 8 & 0xff00) + (((Class591_Sub2_Sub1_Sub1) this).anInt11678 >> 16 & 0xff) + class308.anInt3618 * 1367652005 * i);
					int i_17_ = ((anInt10974 & 0xff00) + (((Class591_Sub2_Sub1_Sub1) this).anInt11678 >> 8 & 0xff) + class308.anInt3626 * -1940557749 * i);
					int i_18_ = ((anInt10974 << 8 & 0xff00) + (((Class591_Sub2_Sub1_Sub1) this).anInt11678 & 0xff) + class308.anInt3566 * 1442860773 * i);
					if (i_16_ < 0)
						i_16_ = 0;
					else if (i_16_ > 65535)
						i_16_ = 65535;
					if (i_17_ < 0)
						i_17_ = 0;
					else if (i_17_ > 65535)
						i_17_ = 65535;
					if (i_18_ < 0)
						i_18_ = 0;
					else if (i_18_ > 65535)
						i_18_ = 65535;
					anInt10974 &= ~0xffffff;
					anInt10974 |= (((i_16_ & 0xff00) << 8) + (i_17_ & 0xff00) + ((i_18_ & 0xff00) >> 8));
					((Class591_Sub2_Sub1_Sub1) this).anInt11678 &= ~0xffffff;
					((Class591_Sub2_Sub1_Sub1) this).anInt11678 |= (((i_16_ & 0xff) << 16) + ((i_17_ & 0xff) << 8) + (i_18_ & 0xff));
				}
				if ((((Class591_Sub2_Sub1_Sub1) this).aShort11675 - ((Class591_Sub2_Sub1_Sub1) this).aShort11679) <= class308.anInt3617 * -710976385) {
					int i_19_ = ((anInt10974 >> 16 & 0xff00) + (((Class591_Sub2_Sub1_Sub1) this).anInt11678 >> 24 & 0xff) + class308.anInt3589 * 1417856711 * i);
					if (i_19_ < 0)
						i_19_ = 0;
					else if (i_19_ > 65535)
						i_19_ = 65535;
					anInt10974 &= 0xffffff;
					anInt10974 |= (i_19_ & 0xff00) << 16;
					((Class591_Sub2_Sub1_Sub1) this).anInt11678 &= 0xffffff;
					((Class591_Sub2_Sub1_Sub1) this).anInt11678 |= (i_19_ & 0xff) << 24;
				}
			}
			if (class308.anInt3561 * -251905261 != -1 && ((((Class591_Sub2_Sub1_Sub1) this).aShort11675 - ((Class591_Sub2_Sub1_Sub1) this).aShort11679) <= class308.anInt3556 * -964912837))
				((Class591_Sub2_Sub1_Sub1) this).anInt11680 += class308.anInt3623 * -2016652157 * i;
			if (class308.anInt3565 * 208062825 != -1 && ((((Class591_Sub2_Sub1_Sub1) this).aShort11675 - ((Class591_Sub2_Sub1_Sub1) this).aShort11679) <= class308.anInt3624 * 1726960811))
				anInt10976 += class308.anInt3625 * -1999023941 * i;
			if (((Class591_Sub2_Sub1_Sub1) this).aShort11684 != 0)
				aShort10978 = (short) (aShort10978 + (((Class591_Sub2_Sub1_Sub1) this).aShort11684) * i & 0x3fff);
			double d = (double) ((Class591_Sub2_Sub1_Sub1) this).aShort11677;
			double d_20_ = (double) ((Class591_Sub2_Sub1_Sub1) this).aShort11682;
			double d_21_ = (double) ((Class591_Sub2_Sub1_Sub1) this).aShort11683;
			boolean bool = false;
			if (class308.anInt3559 * -1590126923 == 1) {
				int i_22_ = i_13_ - (((Class486) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass486_5566).anInt5436) * -2077558487;
				int i_23_ = i_14_ - (((Class486) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass486_5566).anInt5446) * 1224097603;
				int i_24_ = (i_15_ - ((Class486) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass486_5566)).anInt5447 * 649419189);
				int i_25_ = ((int) Math.sqrt((double) (i_22_ * i_22_ + i_23_ * i_23_ + i_24_ * i_24_)) >> 2);
				long l_26_ = (long) (class308.anInt3560 * -678657897 * i_25_ * i);
				((Class591_Sub2_Sub1_Sub1) this).anInt11680 -= ((long) ((Class591_Sub2_Sub1_Sub1) this).anInt11680 * l_26_) >> 18;
			} else if (class308.anInt3559 * -1590126923 == 2) {
				int i_27_ = i_13_ - (((Class486) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass486_5566).anInt5436) * -2077558487;
				int i_28_ = i_14_ - (((Class486) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass486_5566).anInt5446) * 1224097603;
				int i_29_ = (i_15_ - ((Class486) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass486_5566)).anInt5447 * 649419189);
				int i_30_ = i_27_ * i_27_ + i_28_ * i_28_ + i_29_ * i_29_;
				long l_31_ = (long) (class308.anInt3560 * -678657897 * i_30_ * i);
				((Class591_Sub2_Sub1_Sub1) this).anInt11680 -= ((long) ((Class591_Sub2_Sub1_Sub1) this).anInt11680 * l_31_) >> 28;
			}
			if (class308.anIntArray3578 != null) {
				Iterator iterator = ((Class485) class485).aList5428.iterator();
				while (iterator.hasNext()) {
					Class572_Sub7 class572_sub7 = (Class572_Sub7) iterator.next();
					Class309 class309 = ((Class572_Sub7) class572_sub7).aClass309_9071;
					if (class309.anInt3638 * -1090340769 != 1) {
						boolean bool_32_ = false;
						for (int i_33_ = 0; i_33_ < class308.anIntArray3578.length; i_33_++) {
							if (class308.anIntArray3578[i_33_] == class309.anInt3637 * -885121885) {
								bool_32_ = true;
								break;
							}
						}
						if (bool_32_) {
							double d_34_ = (double) (i_13_ - (((Class572_Sub7) class572_sub7).anInt9073) * -428614551);
							double d_35_ = (double) (i_14_ - (((Class572_Sub7) class572_sub7).anInt9072) * 330964273);
							double d_36_ = (double) (i_15_ - (((Class572_Sub7) class572_sub7).anInt9075) * -1483296769);
							double d_37_ = (d_34_ * d_34_ + d_35_ * d_35_ + d_36_ * d_36_);
							if (!(d_37_ > (double) (class309.aLong3649 * -7965896261850644855L))) {
								double d_38_ = Math.sqrt(d_37_);
								if (d_38_ == 0.0)
									d_38_ = 1.0;
								double d_39_ = ((d_34_ * (double) (((Class572_Sub7) class572_sub7).aFloat9076) + d_35_ * (double) (class309.anInt3635 * -2138144555) + d_36_ * (double) (((Class572_Sub7) class572_sub7).aFloat9077)) * 65535.0 / ((double) (class309.anInt3641 * 1727914027) * d_38_));
								if (!(d_39_ < (double) (class309.anInt3650 * 252754203))) {
									double d_40_ = 0.0;
									if (class309.anInt3634 * 1264374069 == 1)
										d_40_ = (d_38_ / 16.0 * (double) (class309.anInt3644 * 663564549));
									else if (class309.anInt3634 * 1264374069 == 2)
										d_40_ = (d_38_ / 16.0 * (d_38_ / 16.0) * (double) (class309.anInt3644 * 663564549));
									if (class309.anInt3646 * 298927751 == 0) {
										if (class309.anInt3645 * 1095207813 == 0) {
											d += ((double) (((Class572_Sub7) class572_sub7).aFloat9076) - d_40_) * (double) i;
											d_20_ += ((double) ((class309.anInt3635) * -2138144555) - d_40_) * (double) i;
											d_21_ += ((double) (((Class572_Sub7) class572_sub7).aFloat9077) - d_40_) * (double) i;
											bool = true;
										} else {
											anInt10970 += ((double) (((Class572_Sub7) class572_sub7).aFloat9076) - d_40_) * (double) i;
											anInt10973 += ((double) ((class309.anInt3635) * -2138144555) - d_40_) * (double) i;
											anInt10975 += ((double) (((Class572_Sub7) class572_sub7).aFloat9077) - d_40_) * (double) i;
										}
									} else {
										double d_41_ = (d_34_ / d_38_ * (double) (class309.anInt3641 * 1727914027));
										double d_42_ = (d_35_ / d_38_ * (double) (class309.anInt3641 * 1727914027));
										double d_43_ = (d_36_ / d_38_ * (double) (class309.anInt3641 * 1727914027));
										if (class309.anInt3645 * 1095207813 == 0) {
											d += d_41_ * (double) i;
											d_20_ += d_42_ * (double) i;
											d_21_ += d_43_ * (double) i;
											bool = true;
										} else {
											anInt10970 += d_41_ * (double) i;
											anInt10973 += d_42_ * (double) i;
											anInt10975 += d_43_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class308.anIntArray3590 != null) {
				for (int i_44_ = 0; i_44_ < class308.anIntArray3590.length; i_44_++) {
					Class572_Sub7 class572_sub7 = ((Class572_Sub7) (Class491.aClass676_5468.get((long) class308.anIntArray3590[i_44_])));
					while (class572_sub7 != null) {
						Class309 class309 = ((Class572_Sub7) class572_sub7).aClass309_9071;
						double d_45_ = (double) (i_13_ - (((Class572_Sub7) class572_sub7).anInt9073) * -428614551);
						double d_46_ = (double) (i_14_ - (((Class572_Sub7) class572_sub7).anInt9072) * 330964273);
						double d_47_ = (double) (i_15_ - (((Class572_Sub7) class572_sub7).anInt9075) * -1483296769);
						double d_48_ = d_45_ * d_45_ + d_46_ * d_46_ + d_47_ * d_47_;
						if (d_48_ > (double) (class309.aLong3649 * -7965896261850644855L))
							class572_sub7 = (Class572_Sub7) Class491.aClass676_5468.method7971((byte) 17);
						else {
							double d_49_ = Math.sqrt(d_48_);
							if (d_49_ == 0.0)
								d_49_ = 1.0;
							double d_50_ = ((d_45_ * (double) ((Class572_Sub7) class572_sub7).aFloat9076 + d_46_ * (double) (class309.anInt3635 * -2138144555) + d_47_ * (double) (((Class572_Sub7) class572_sub7).aFloat9077)) * 65535.0 / ((double) (class309.anInt3641 * 1727914027) * d_49_));
							if (d_50_ < (double) (class309.anInt3650 * 252754203))
								class572_sub7 = ((Class572_Sub7) Class491.aClass676_5468.method7971((byte) 25));
							else {
								double d_51_ = 0.0;
								if (class309.anInt3634 * 1264374069 == 1)
									d_51_ = (d_49_ / 16.0 * (double) (class309.anInt3644 * 663564549));
								else if (class309.anInt3634 * 1264374069 == 2)
									d_51_ = (d_49_ / 16.0 * (d_49_ / 16.0) * (double) (class309.anInt3644 * 663564549));
								if (class309.anInt3646 * 298927751 == 0) {
									if (class309.anInt3645 * 1095207813 == 0) {
										d += ((double) (((Class572_Sub7) class572_sub7).aFloat9076) - d_51_) * (double) i;
										d_20_ += ((double) (class309.anInt3635 * -2138144555) - d_51_) * (double) i;
										d_21_ += ((double) (((Class572_Sub7) class572_sub7).aFloat9077) - d_51_) * (double) i;
										bool = true;
									} else {
										anInt10970 += ((double) (((Class572_Sub7) class572_sub7).aFloat9076) - d_51_) * (double) i;
										anInt10973 += ((double) (class309.anInt3635 * -2138144555) - d_51_) * (double) i;
										anInt10975 += ((double) (((Class572_Sub7) class572_sub7).aFloat9077) - d_51_) * (double) i;
									}
								} else {
									double d_52_ = (d_45_ / d_49_ * (double) (class309.anInt3641 * 1727914027));
									double d_53_ = (d_46_ / d_49_ * (double) (class309.anInt3641 * 1727914027));
									double d_54_ = (d_47_ / d_49_ * (double) (class309.anInt3641 * 1727914027));
									if (class309.anInt3645 * 1095207813 == 0) {
										d += d_52_ * (double) i;
										d_20_ += d_53_ * (double) i;
										d_21_ += d_54_ * (double) i;
										bool = true;
									} else {
										anInt10970 += d_52_ * (double) i;
										anInt10973 += d_53_ * (double) i;
										anInt10975 += d_54_ * (double) i;
									}
								}
								class572_sub7 = ((Class572_Sub7) Class491.aClass676_5468.method7971((byte) 32));
							}
						}
					}
				}
			}
			if (class308.anIntArray3580 != null) {
				if (class308.anIntArray3558 == null) {
					class308.anIntArray3558 = new int[class308.anIntArray3580.length];
					for (int i_55_ = 0; i_55_ < class308.anIntArray3580.length; i_55_++) {
						Class491.anInterface37_5475.method212((class308.anIntArray3580[i_55_]), 727529500);
						class308.anIntArray3558[i_55_] = Class496.method5924((class308.anIntArray3580[i_55_]), (byte) -97);
					}
				}
				for (int i_56_ = 0; i_56_ < class308.anIntArray3558.length; i_56_++) {
					Class309 class309 = (Class491.aClass309Array5476[class308.anIntArray3558[i_56_]]);
					if (class309.anInt3645 * 1095207813 == 0) {
						d += (double) (class309.anInt3640 * -1627639353 * i);
						d_20_ += (double) (class309.anInt3635 * -2138144555 * i);
						d_21_ += (double) (class309.anInt3642 * -175701821 * i);
						bool = true;
					} else {
						anInt10970 += class309.anInt3640 * -1627639353 * i;
						anInt10973 += class309.anInt3635 * -2138144555 * i;
						anInt10975 += class309.anInt3642 * -175701821 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_20_ > 32767.0 || d_21_ > 32767.0 || d < -32767.0 || d_20_ < -32767.0 || d_21_ < -32767.0) {
					d /= 2.0;
					d_20_ /= 2.0;
					d_21_ /= 2.0;
					((Class591_Sub2_Sub1_Sub1) this).anInt11680 <<= 1;
				}
				((Class591_Sub2_Sub1_Sub1) this).aShort11677 = (short) (int) d;
				((Class591_Sub2_Sub1_Sub1) this).aShort11682 = (short) (int) d_20_;
				((Class591_Sub2_Sub1_Sub1) this).aShort11683 = (short) (int) d_21_;
			}
			anInt10970 += (((long) ((Class591_Sub2_Sub1_Sub1) this).aShort11677 * (long) (((Class591_Sub2_Sub1_Sub1) this).anInt11680 << 2)) >> 23) * (long) i;
			anInt10973 += (((long) ((Class591_Sub2_Sub1_Sub1) this).aShort11682 * (long) (((Class591_Sub2_Sub1_Sub1) this).anInt11680 << 2)) >> 23) * (long) i;
			anInt10975 += (((long) ((Class591_Sub2_Sub1_Sub1) this).aShort11683 * (long) (((Class591_Sub2_Sub1_Sub1) this).anInt11680 << 2)) >> 23) * (long) i;
		}
	}

	void method10578() {
		int i = (((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).anInt5423);
		if ((((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[i]) != null)
			((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[i].method10581();
		((Class485) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass485_5568)).aClass591_Sub2_Sub1_Sub1Array5422[i] = this;
		((Class591_Sub2_Sub1_Sub1) this).aShort11681 = (short) ((Class485) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass485_5568)).anInt5423;
		((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).anInt5423 = i + 1 & 0x1fff;
		((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass652_5558.method7703(this, (short) -8216);
	}

	void method10579() {
		((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[((Class591_Sub2_Sub1_Sub1) this).aShort11681] = null;
		Class491.aClass591_Sub2_Sub1_Sub1Array5473[(Class491.anInt5474 * -1725795521)] = this;
		Class491.anInt5474 = (Class491.anInt5474 * -1725795521 + 1 & 0x3ff) * 631700671;
		method7002((byte) 50);
		method8605(-1247661257);
	}

	void method10580() {
		int i = (((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).anInt5423);
		if ((((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[i]) != null)
			((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[i].method10581();
		((Class485) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass485_5568)).aClass591_Sub2_Sub1_Sub1Array5422[i] = this;
		((Class591_Sub2_Sub1_Sub1) this).aShort11681 = (short) ((Class485) (((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass485_5568)).anInt5423;
		((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).anInt5423 = i + 1 & 0x1fff;
		((Class503) ((Class591_Sub2_Sub1_Sub1) this).aClass503_11676).aClass652_5558.method7703(this, (short) -17139);
	}

	Class591_Sub2_Sub1_Sub1(Class503 class503, int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, boolean bool, boolean bool_69_) {
		((Class591_Sub2_Sub1_Sub1) this).aClass503_11676 = class503;
		anInt10970 = i << 12;
		anInt10973 = i_57_ << 12;
		anInt10975 = i_58_ << 12;
		anInt10974 = i_64_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11675 = ((Class591_Sub2_Sub1_Sub1) this).aShort11679 = (short) i_63_;
		anInt10976 = i_65_;
		aShort10978 = (short) i_66_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11684 = (short) i_67_;
		anInt10972 = i_68_;
		aBool10979 = bool_69_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11677 = (short) i_59_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11682 = (short) i_60_;
		((Class591_Sub2_Sub1_Sub1) this).aShort11683 = (short) i_61_;
		((Class591_Sub2_Sub1_Sub1) this).anInt11680 = i_62_;
		method10576();
	}

	void method10581() {
		((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[((Class591_Sub2_Sub1_Sub1) this).aShort11681] = null;
		Class491.aClass591_Sub2_Sub1_Sub1Array5473[(Class491.anInt5474 * -1725795521)] = this;
		Class491.anInt5474 = (Class491.anInt5474 * -1725795521 + 1 & 0x3ff) * 631700671;
		method7002((byte) 32);
		method8605(924708304);
	}

	void method10582(Class523 class523, Class106 class106, long l) {
		int i = anInt10970 >> 12 + class523.anInt5858 * 406704825;
		int i_70_ = anInt10975 >> 12 + class523.anInt5858 * 406704825;
		int i_71_ = anInt10973 >> 12;
		if (i_71_ > 262144 || i_71_ < -262144 || i < 0 || i >= class523.anInt5833 * -1396185127 || i_70_ < 0 || i_70_ >= class523.anInt5834 * -1519623925)
			method10581();
		else {
			Class485 class485 = (((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568);
			Class308 class308 = (((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass308_5559);
			Class174[] class174s = class523.aClass174Array5875;
			int i_72_ = ((Class485) class485).anInt5424;
			Class536 class536 = (class523.aClass536ArrayArrayArray5882[((Class485) class485).anInt5424][i][i_70_]);
			if (class536 != null)
				i_72_ = class536.aByte5991;
			int i_73_ = class174s[i_72_].method2713(i, i_70_, -1640294657);
			int i_74_;
			if (i_72_ < class523.anInt5832 * 1103813715 - 1)
				i_74_ = class174s[i_72_ + 1].method2713(i, i_70_, 1584738306);
			else
				i_74_ = i_73_ - (8 << class523.anInt5858 * 406704825);
			if (class308.aBool3602) {
				if (class308.anInt3583 * -834850639 == -1 && i_71_ > i_73_) {
					method10581();
					return;
				}
				if (class308.anInt3583 * -834850639 >= 0 && i_71_ > class174s[class308.anInt3583 * -834850639].method2713(i, i_70_, -195018115)) {
					method10581();
					return;
				}
				if (class308.anInt3621 * -1232408093 == -1 && i_71_ < i_74_) {
					method10581();
					return;
				}
				if (class308.anInt3621 * -1232408093 >= 0 && i_71_ < class174s[class308.anInt3621 * -1232408093 + 1].method2713(i, i_70_, -1941500620)) {
					method10581();
					return;
				}
			}
			int i_75_;
			for (i_75_ = class523.anInt5832 * 1103813715 - 1; i_75_ > 0 && i_71_ > class174s[i_75_].method2713(i, i_70_, 1395670473); i_75_--) {
				/* empty */
			}
			if (class308.aBool3601 && i_75_ == 0 && i_71_ > class174s[0].method2713(i, i_70_, -1788209831))
				method10581();
			else if (i_75_ == class523.anInt5832 * 1103813715 - 1 && (class174s[i_75_].method2713(i, i_70_, 1349464915) - i_71_) > 8 << class523.anInt5858 * 406704825)
				method10581();
			else {
				class536 = class523.aClass536ArrayArrayArray5882[i_75_][i][i_70_];
				if (class536 == null) {
					if (i_75_ == 0 || (class523.aClass536ArrayArrayArray5882[0][i][i_70_] == null))
						class536 = class523.aClass536ArrayArrayArray5882[0][i][i_70_] = new Class536(0);
					boolean bool = ((class523.aClass536ArrayArrayArray5882[0][i][i_70_].aClass536_5987) != null);
					if (i_75_ == 3 && bool)
						i_75_--;
					for (int i_76_ = 1; i_76_ <= i_75_; i_76_++) {
						if ((class523.aClass536ArrayArrayArray5882[i_76_][i][i_70_]) == null) {
							class536 = class523.aClass536ArrayArrayArray5882[i_76_][i][i_70_] = new Class536(i_76_);
							if (bool)
								class536.aByte5991++;
						}
					}
					if (class536 == null)
						class536 = (class523.aClass536ArrayArrayArray5882[i_75_][i][i_70_]);
				}
				if (class308.aBool3574) {
					int i_77_ = anInt10970 >> 12;
					int i_78_ = anInt10975 >> 12;
					if (class536.aClass456_Sub1_Sub4_5988 != null) {
						Class535 class535 = class536.aClass456_Sub1_Sub4_5988.method8306(class106, (byte) -83);
						if (class535 != null && class535.method6377(i_77_, i_71_, i_78_)) {
							method10581();
							return;
						}
					}
					if (class536.aClass456_Sub1_Sub4_5989 != null) {
						Class535 class535 = class536.aClass456_Sub1_Sub4_5989.method8306(class106, (byte) -36);
						if (class535 != null && class535.method6377(i_77_, i_71_, i_78_)) {
							method10581();
							return;
						}
					}
					if (class536.aClass456_Sub1_Sub1_5992 != null) {
						Class535 class535 = class536.aClass456_Sub1_Sub1_5992.method8306(class106, (byte) -57);
						if (class535 != null && class535.method6377(i_77_, i_71_, i_78_)) {
							method10581();
							return;
						}
					}
					for (Class543 class543 = class536.aClass543_5994; class543 != null; class543 = class543.aClass543_6100) {
						Class535 class535 = class543.aClass456_Sub1_Sub2_6099.method8306(class106, (byte) -108);
						if (class535 != null && class535.method6377(i_77_, i_71_, i_78_)) {
							method10581();
							return;
						}
					}
				}
				((Class485) class485).aClass105_5433.aClass657_1385.method7727(this, 648609463);
			}
		}
	}

	void method10583() {
		((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[((Class591_Sub2_Sub1_Sub1) this).aShort11681] = null;
		Class491.aClass591_Sub2_Sub1_Sub1Array5473[(Class491.anInt5474 * -1725795521)] = this;
		Class491.anInt5474 = (Class491.anInt5474 * -1725795521 + 1 & 0x3ff) * 631700671;
		method7002((byte) 121);
		method8605(-209932619);
	}

	void method10584() {
		((Class485) ((Class503) (((Class591_Sub2_Sub1_Sub1) this).aClass503_11676)).aClass485_5568).aClass591_Sub2_Sub1_Sub1Array5422[((Class591_Sub2_Sub1_Sub1) this).aShort11681] = null;
		Class491.aClass591_Sub2_Sub1_Sub1Array5473[(Class491.anInt5474 * -1725795521)] = this;
		Class491.anInt5474 = (Class491.anInt5474 * -1725795521 + 1 & 0x3ff) * 631700671;
		method7002((byte) 7);
		method8605(-91611334);
	}
}

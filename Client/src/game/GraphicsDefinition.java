package game;

/* Class659 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class GraphicsDefinition implements Interface17 {
	int anInt8423;
	Class452 aClass452_8424;
	short[] aShortArray8425;
	int anInt8426;
	public boolean aBool8427;
	short[] aShortArray8428;
	short[] aShortArray8429;
	short[] aShortArray8430;
	byte[] aByteArray8431;
	byte[] aByteArray8432;
	public int anInt8433 = 749724717;
	int anInt8434 = -90306944;
	int anInt8435 = 1836998784;
	int anInt8436 = 0;
	int anInt8437 = 0;
	int anInt8438 = 0;
	static final int anInt8439 = 8224;
	int anInt8440;
	byte aByte8441;
	public static Class248 aClass248_8442;

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(1067675274);
			if (i_0_ == 0)
				break;
			method7766(class572_sub15, i_0_, 737937135);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(-4356933);
			if (i == 0)
				break;
			method7766(class572_sub15, i, 1164751008);
		}
	}

	public final Model method7760(Class106 class106, int i, Class663 class663, byte i_1_, int i_2_) {
		return method7762(class106, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class663, i_1_, (byte) -120);
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(2144096007);
			if (i == 0)
				break;
			method7766(class572_sub15, i, 1499108801);
		}
	}

	public final Model method7761(Class106 class106, int i, int i_3_, Class174 class174, Class174 class174_4_, int i_5_, int i_6_, int i_7_, Class663 class663, byte i_8_, int i_9_) {
		return method7762(class106, i, true, class174, class174_4_, i_5_, i_6_, i_7_, i_3_, 0, 0, 0, class663, i_8_, (byte) -30);
	}

	final Model method7762(Class106 class106, int i, boolean bool, Class174 class174, Class174 class174_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, Class663 class663, byte i_18_, byte i_19_) {
		int i_20_ = i;
		bool = bool & 0 != ((GraphicsDefinition) this).aByte8441;
		if (class663 != null)
			i_20_ |= class663.method7794(-1874372494);
		if (((GraphicsDefinition) this).anInt8435 * -1425829055 != 128)
			i_20_ |= 0x2;
		if (128 != 1106735813 * ((GraphicsDefinition) this).anInt8434 || 0 != 1016883659 * ((GraphicsDefinition) this).anInt8436 || 0 != i_14_)
			i_20_ |= 0x5;
		if (bool)
			i_20_ |= 0x7;
		Model model;
		synchronized (((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass127_5174) {
			model = ((Model) (((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass127_5174.method2246((long) (-235542881 * ((GraphicsDefinition) this).anInt8440 | class106.anInt1416 * 1862175997 << 29))));
		}
		if (null == model || class106.method1756(model.method1353(), i_20_) != 0) {
			if (model != null)
				i_20_ = class106.method1798(i_20_, model.method1353());
			int i_21_ = i_20_;
			if (((GraphicsDefinition) this).aShortArray8428 != null)
				i_21_ |= 0x4000;
			if (((GraphicsDefinition) this).aShortArray8430 != null)
				i_21_ |= 0x8000;
			Class159 class159 = Class159.method2569((((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass248_5173), 1787366821 * ((GraphicsDefinition) this).anInt8426, 0);
			if (null == class159)
				return null;
			if (class159.anInt1773 < 13)
				class159.method2567(2);
			model = (class106.method1755(class159, i_21_, (((Class452) ((GraphicsDefinition) this).aClass452_8424).anInt5175 * -1608751841), 1886022903 * ((GraphicsDefinition) this).anInt8437 + 64, 850 + ((GraphicsDefinition) this).anInt8438 * 1918969149));
			if (((GraphicsDefinition) this).aShortArray8428 != null) {
				for (int i_22_ = 0; i_22_ < ((GraphicsDefinition) this).aShortArray8428.length; i_22_++)
					model.method1393((((GraphicsDefinition) this).aShortArray8428[i_22_]), (((GraphicsDefinition) this).aShortArray8429[i_22_]));
			}
			if (((GraphicsDefinition) this).aShortArray8430 != null) {
				for (int i_23_ = 0; i_23_ < ((GraphicsDefinition) this).aShortArray8430.length; i_23_++)
					model.method1494((((GraphicsDefinition) this).aShortArray8430[i_23_]), (((GraphicsDefinition) this).aShortArray8425[i_23_]));
			}
			model.method1450(i_20_);
			synchronized (((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass127_5174) {
				((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass127_5174.method2229(model, (long) (-235542881 * ((GraphicsDefinition) this).anInt8440 | class106.anInt1416 * 1862175997 << 29));
			}
		}
		Model class89_24_ = model.method1351(i_18_, i_20_, true);
		if (null != class663)
			class663.method7797(class89_24_, 0, (byte) -117);
		if (((GraphicsDefinition) this).anInt8434 * 1106735813 != 128 || ((GraphicsDefinition) this).anInt8435 * -1425829055 != 128)
			class89_24_.method1464(1106735813 * ((GraphicsDefinition) this).anInt8434, ((GraphicsDefinition) this).anInt8435 * -1425829055, 1106735813 * ((GraphicsDefinition) this).anInt8434);
		if (((GraphicsDefinition) this).anInt8436 * 1016883659 != 0) {
			if (((GraphicsDefinition) this).anInt8436 * 1016883659 == 90)
				i_14_ += 4096;
			if (1016883659 * ((GraphicsDefinition) this).anInt8436 == 180)
				i_14_ += 8192;
			if (((GraphicsDefinition) this).anInt8436 * 1016883659 == 270)
				i_14_ += 12288;
		}
		if (i_14_ != 0) {
			i_14_ &= 0x3fff;
			class89_24_.method1355(i_14_);
		}
		if (bool) {
			if (class174 != null)
				class89_24_.method1463(((GraphicsDefinition) this).aByte8441, (1934343671 * ((GraphicsDefinition) this).anInt8423), class174, class174_10_, i_11_, i_12_, i_13_);
			else {
				if (0 != i_15_)
					class89_24_.method1368(i_15_);
				if (0 != i_16_)
					class89_24_.method1500(i_16_);
				if (0 != i_17_)
					class89_24_.method1358(0, i_17_, 0);
			}
		}
		class89_24_.method1450(i);
		return class89_24_;
	}

	void method7763(RSByteBuffer class572_sub15, int i) {
		do {
			if (1 == i)
				((GraphicsDefinition) this).anInt8426 = class572_sub15.readBigSmart((byte) 11) * -1162407379;
			else if (2 == i)
				anInt8433 = class572_sub15.readBigSmart((byte) 25) * -749724717;
			else if (4 == i)
				((GraphicsDefinition) this).anInt8434 = class572_sub15.readUnsignedShort(647518597) * -1644872691;
			else if (5 == i)
				((GraphicsDefinition) this).anInt8435 = class572_sub15.readUnsignedShort(647518597) * 685440193;
			else if (6 == i)
				((GraphicsDefinition) this).anInt8436 = class572_sub15.readUnsignedShort(647518597) * -531074077;
			else if (7 == i)
				((GraphicsDefinition) this).anInt8437 = class572_sub15.readUnsignedByte(1419597805) * -758246201;
			else if (8 == i)
				((GraphicsDefinition) this).anInt8438 = class572_sub15.readUnsignedByte(911115094) * -1900357099;
			else if (10 == i)
				aBool8427 = true;
			else if (9 == i) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = -138716960;
			} else if (i == 15) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = class572_sub15.readUnsignedShort(647518597) * 2108298183;
			} else if (16 == i) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = class572_sub15.readInt(-686960603) * 2108298183;
			} else if (40 == i) {
				int i_25_ = class572_sub15.readUnsignedByte(683739175);
				((GraphicsDefinition) this).aShortArray8428 = new short[i_25_];
				((GraphicsDefinition) this).aShortArray8429 = new short[i_25_];
				for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
					((GraphicsDefinition) this).aShortArray8428[i_26_] = (short) class572_sub15.readUnsignedShort(647518597);
					((GraphicsDefinition) this).aShortArray8429[i_26_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (41 == i) {
				int i_27_ = class572_sub15.readUnsignedByte(102209121);
				((GraphicsDefinition) this).aShortArray8430 = new short[i_27_];
				((GraphicsDefinition) this).aShortArray8425 = new short[i_27_];
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
					((GraphicsDefinition) this).aShortArray8430[i_28_] = (short) class572_sub15.readUnsignedShort(647518597);
					((GraphicsDefinition) this).aShortArray8425[i_28_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (44 == i) {
				int i_29_ = class572_sub15.readUnsignedShort(647518597);
				int i_30_ = 0;
				for (int i_31_ = i_29_; i_31_ > 0; i_31_ >>= 1)
					i_30_++;
				((GraphicsDefinition) this).aByteArray8432 = new byte[i_30_];
				byte i_32_ = 0;
				for (int i_33_ = 0; i_33_ < i_30_; i_33_++) {
					if ((i_29_ & 1 << i_33_) > 0) {
						((GraphicsDefinition) this).aByteArray8432[i_33_] = i_32_;
						i_32_++;
					} else
						((GraphicsDefinition) this).aByteArray8432[i_33_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_34_ = class572_sub15.readUnsignedShort(647518597);
				int i_35_ = 0;
				for (int i_36_ = i_34_; i_36_ > 0; i_36_ >>= 1)
					i_35_++;
				((GraphicsDefinition) this).aByteArray8431 = new byte[i_35_];
				byte i_37_ = 0;
				for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
					if ((i_34_ & 1 << i_38_) > 0) {
						((GraphicsDefinition) this).aByteArray8431[i_38_] = i_37_;
						i_37_++;
					} else
						((GraphicsDefinition) this).aByteArray8431[i_38_] = (byte) -1;
				}
			} else if (i == 46)
				break;
		} while (false);
	}

	public void method104(byte i) {
		/* empty */
	}

	GraphicsDefinition(int i, Class452 class452) {
		aBool8427 = false;
		((GraphicsDefinition) this).aByte8441 = (byte) 0;
		((GraphicsDefinition) this).anInt8423 = -2108298183;
		((GraphicsDefinition) this).anInt8440 = i * 1840231775;
		((GraphicsDefinition) this).aClass452_8424 = class452;
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(460625376);
			if (i == 0)
				break;
			method7766(class572_sub15, i, 1929650626);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1330455257);
			if (i == 0)
				break;
			method7766(class572_sub15, i, 1113784684);
		}
	}

	public void method103() {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	public void method112() {
		/* empty */
	}

	public final Model method7764(Class106 class106, int i, int i_39_, int i_40_, int i_41_, int i_42_, Class663 class663, byte i_43_, int i_44_) {
		if (3 != ((GraphicsDefinition) this).aByte8441)
			return method7762(class106, i, false, null, null, 0, 0, 0, i_39_, 0, 0, 0, class663, i_43_, (byte) 8);
		return method7762(class106, i, true, null, null, 0, 0, 0, i_39_, i_40_, i_41_, i_42_, class663, i_43_, (byte) -24);
	}

	void method7765(RSByteBuffer class572_sub15, int i) {
		do {
			if (1 == i)
				((GraphicsDefinition) this).anInt8426 = class572_sub15.readBigSmart((byte) 24) * -1162407379;
			else if (2 == i)
				anInt8433 = class572_sub15.readBigSmart((byte) 57) * -749724717;
			else if (4 == i)
				((GraphicsDefinition) this).anInt8434 = class572_sub15.readUnsignedShort(647518597) * -1644872691;
			else if (5 == i)
				((GraphicsDefinition) this).anInt8435 = class572_sub15.readUnsignedShort(647518597) * 685440193;
			else if (6 == i)
				((GraphicsDefinition) this).anInt8436 = class572_sub15.readUnsignedShort(647518597) * -531074077;
			else if (7 == i)
				((GraphicsDefinition) this).anInt8437 = class572_sub15.readUnsignedByte(1816775117) * -758246201;
			else if (8 == i)
				((GraphicsDefinition) this).anInt8438 = class572_sub15.readUnsignedByte(50428440) * -1900357099;
			else if (10 == i)
				aBool8427 = true;
			else if (9 == i) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = -138716960;
			} else if (i == 15) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = class572_sub15.readUnsignedShort(647518597) * 2108298183;
			} else if (16 == i) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = class572_sub15.readInt(1558276696) * 2108298183;
			} else if (40 == i) {
				int i_45_ = class572_sub15.readUnsignedByte(2015136337);
				((GraphicsDefinition) this).aShortArray8428 = new short[i_45_];
				((GraphicsDefinition) this).aShortArray8429 = new short[i_45_];
				for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
					((GraphicsDefinition) this).aShortArray8428[i_46_] = (short) class572_sub15.readUnsignedShort(647518597);
					((GraphicsDefinition) this).aShortArray8429[i_46_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (41 == i) {
				int i_47_ = class572_sub15.readUnsignedByte(795954835);
				((GraphicsDefinition) this).aShortArray8430 = new short[i_47_];
				((GraphicsDefinition) this).aShortArray8425 = new short[i_47_];
				for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
					((GraphicsDefinition) this).aShortArray8430[i_48_] = (short) class572_sub15.readUnsignedShort(647518597);
					((GraphicsDefinition) this).aShortArray8425[i_48_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (44 == i) {
				int i_49_ = class572_sub15.readUnsignedShort(647518597);
				int i_50_ = 0;
				for (int i_51_ = i_49_; i_51_ > 0; i_51_ >>= 1)
					i_50_++;
				((GraphicsDefinition) this).aByteArray8432 = new byte[i_50_];
				byte i_52_ = 0;
				for (int i_53_ = 0; i_53_ < i_50_; i_53_++) {
					if ((i_49_ & 1 << i_53_) > 0) {
						((GraphicsDefinition) this).aByteArray8432[i_53_] = i_52_;
						i_52_++;
					} else
						((GraphicsDefinition) this).aByteArray8432[i_53_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_54_ = class572_sub15.readUnsignedShort(647518597);
				int i_55_ = 0;
				for (int i_56_ = i_54_; i_56_ > 0; i_56_ >>= 1)
					i_55_++;
				((GraphicsDefinition) this).aByteArray8431 = new byte[i_55_];
				byte i_57_ = 0;
				for (int i_58_ = 0; i_58_ < i_55_; i_58_++) {
					if ((i_54_ & 1 << i_58_) > 0) {
						((GraphicsDefinition) this).aByteArray8431[i_58_] = i_57_;
						i_57_++;
					} else
						((GraphicsDefinition) this).aByteArray8431[i_58_] = (byte) -1;
				}
			} else if (i == 46)
				break;
		} while (false);
	}

	void method7766(RSByteBuffer class572_sub15, int i, int i_59_) {
		do {
			if (1 == i)
				((GraphicsDefinition) this).anInt8426 = class572_sub15.readBigSmart((byte) 86) * -1162407379;
			else if (2 == i)
				anInt8433 = class572_sub15.readBigSmart((byte) 109) * -749724717;
			else if (4 == i)
				((GraphicsDefinition) this).anInt8434 = class572_sub15.readUnsignedShort(647518597) * -1644872691;
			else if (5 == i)
				((GraphicsDefinition) this).anInt8435 = class572_sub15.readUnsignedShort(647518597) * 685440193;
			else if (6 == i)
				((GraphicsDefinition) this).anInt8436 = class572_sub15.readUnsignedShort(647518597) * -531074077;
			else if (7 == i)
				((GraphicsDefinition) this).anInt8437 = class572_sub15.readUnsignedByte(1198740938) * -758246201;
			else if (8 == i)
				((GraphicsDefinition) this).anInt8438 = class572_sub15.readUnsignedByte(400145119) * -1900357099;
			else if (10 == i)
				aBool8427 = true;
			else if (9 == i) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = -138716960;
			} else if (i == 15) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = class572_sub15.readUnsignedShort(647518597) * 2108298183;
			} else if (16 == i) {
				((GraphicsDefinition) this).aByte8441 = (byte) 3;
				((GraphicsDefinition) this).anInt8423 = class572_sub15.readInt(-76235878) * 2108298183;
			} else if (40 == i) {
				int i_60_ = class572_sub15.readUnsignedByte(1858895394);
				((GraphicsDefinition) this).aShortArray8428 = new short[i_60_];
				((GraphicsDefinition) this).aShortArray8429 = new short[i_60_];
				for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
					((GraphicsDefinition) this).aShortArray8428[i_61_] = (short) class572_sub15.readUnsignedShort(647518597);
					((GraphicsDefinition) this).aShortArray8429[i_61_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (41 == i) {
				int i_62_ = class572_sub15.readUnsignedByte(727461926);
				((GraphicsDefinition) this).aShortArray8430 = new short[i_62_];
				((GraphicsDefinition) this).aShortArray8425 = new short[i_62_];
				for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
					((GraphicsDefinition) this).aShortArray8430[i_63_] = (short) class572_sub15.readUnsignedShort(647518597);
					((GraphicsDefinition) this).aShortArray8425[i_63_] = (short) class572_sub15.readUnsignedShort(647518597);
				}
			} else if (44 == i) {
				int i_64_ = class572_sub15.readUnsignedShort(647518597);
				int i_65_ = 0;
				for (int i_66_ = i_64_; i_66_ > 0; i_66_ >>= 1)
					i_65_++;
				((GraphicsDefinition) this).aByteArray8432 = new byte[i_65_];
				byte i_67_ = 0;
				for (int i_68_ = 0; i_68_ < i_65_; i_68_++) {
					if ((i_64_ & 1 << i_68_) > 0) {
						((GraphicsDefinition) this).aByteArray8432[i_68_] = i_67_;
						i_67_++;
					} else
						((GraphicsDefinition) this).aByteArray8432[i_68_] = (byte) -1;
				}
			} else if (i == 45) {
				int i_69_ = class572_sub15.readUnsignedShort(647518597);
				int i_70_ = 0;
				for (int i_71_ = i_69_; i_71_ > 0; i_71_ >>= 1)
					i_70_++;
				((GraphicsDefinition) this).aByteArray8431 = new byte[i_70_];
				byte i_72_ = 0;
				for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
					if ((i_69_ & 1 << i_73_) > 0) {
						((GraphicsDefinition) this).aByteArray8431[i_73_] = i_72_;
						i_72_++;
					} else
						((GraphicsDefinition) this).aByteArray8431[i_73_] = (byte) -1;
				}
			} else if (i == 46)
				break;
		} while (false);
	}

	public final boolean method7767(int i) {
		if (1787366821 * ((GraphicsDefinition) this).anInt8426 == -1)
			return true;
		return (((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass248_5173.method3369(1787366821 * ((GraphicsDefinition) this).anInt8426, 0, (byte) -108));
	}

	public void method106() {
		/* empty */
	}

	public final boolean method7768() {
		if (1787366821 * ((GraphicsDefinition) this).anInt8426 == -1)
			return true;
		return (((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass248_5173.method3369(1787366821 * ((GraphicsDefinition) this).anInt8426, 0, (byte) -27));
	}

	public final boolean method7769() {
		if (1787366821 * ((GraphicsDefinition) this).anInt8426 == -1)
			return true;
		return (((Class452) ((GraphicsDefinition) this).aClass452_8424).aClass248_5173.method3369(1787366821 * ((GraphicsDefinition) this).anInt8426, 0, (byte) -10));
	}

	public static String method7770(int i, byte i_74_) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static final void method7771(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class100.method1593(class73, class83, class441, 146337257);
	}

	static void method7772(int i, int i_75_) {
		if (Class213.aClass572_Sub24_2463.aClass665_Sub16_9236.method8983(591256242) == 0)
			i = -1;
		if (1658171305 * client.anInt8753 != i) {
			if (i != -1) {
				Class445 class445 = ((Class445) Class653.aClass639_Sub9_8398.getDefinition(i, -874929976));
				Class87 class87 = class445.method5333((byte) -11);
				if (class87 != null) {
					RSSocket.aClass577_8294.setcustomcursor(client.aCanvas7745, class87.method1285(true), class87.method1283(), class87.method1305(), new Point(class445.anInt5139 * -303528859, class445.anInt5138 * -989288847));
					client.anInt8753 = i * -2083756903;
				} else
					i = -1;
			}
			if (-1 == i && 1658171305 * client.anInt8753 != -1) {
				RSSocket.aClass577_8294.setcustomcursor(client.aCanvas7745, null, -1, -1, new Point());
				client.anInt8753 = 2083756903;
			}
		}
	}
}

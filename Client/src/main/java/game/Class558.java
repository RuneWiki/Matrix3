package game;

/* Class558 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;

public final class Class558 {
	int anInt6332;
	Class643 aClass643_6333 = null;
	static byte[] aByteArray6334 = new byte[520];
	int anInt6335;
	Class643 aClass643_6336 = null;

	public boolean method6594(int i, byte[] is, int i_0_, byte i_1_) {
		synchronized (((Class558) this).aClass643_6333) {
			if (i_0_ < 0 || i_0_ > 814366453 * ((Class558) this).anInt6332)
				throw new IllegalArgumentException(new StringBuilder().append("").append((((Class558) this).anInt6335) * 1565086879).append(',').append(i).append(',').append(i_0_).toString());
			boolean bool = method6595(i, is, i_0_, true, 970059582);
			if (!bool)
				bool = method6595(i, is, i_0_, false, 79502160);
			boolean bool_2_ = bool;
			return bool_2_;
		}
	}

	boolean method6595(int i, byte[] is, int i_3_, boolean bool, int i_4_) {
		synchronized (((Class558) this).aClass643_6333) {
			boolean bool_5_;
			try {
				int i_6_;
				if (bool) {
					if (((Class558) this).aClass643_6336.method7615(1673124799) < (long) (i * 6 + 6)) {
						boolean bool_7_ = false;
						return bool_7_;
					}
					((Class558) this).aClass643_6336.method7614((long) (i * 6));
					((Class558) this).aClass643_6336.method7623(aByteArray6334, 0, 6, (byte) 121);
					i_6_ = ((aByteArray6334[5] & 0xff) + (((aByteArray6334[4] & 0xff) << 8) + ((aByteArray6334[3] & 0xff) << 16)));
					if (i_6_ <= 0 || (long) i_6_ > ((Class558) this).aClass643_6333.method7615(1962046913) / 520L) {
						boolean bool_8_ = false;
						return bool_8_;
					}
				} else {
					i_6_ = (int) ((((Class558) this).aClass643_6333.method7615(211079933) + 519L) / 520L);
					if (i_6_ == 0)
						i_6_ = 1;
				}
				aByteArray6334[0] = (byte) (i_3_ >> 16);
				aByteArray6334[1] = (byte) (i_3_ >> 8);
				aByteArray6334[2] = (byte) i_3_;
				aByteArray6334[3] = (byte) (i_6_ >> 16);
				aByteArray6334[4] = (byte) (i_6_ >> 8);
				aByteArray6334[5] = (byte) i_6_;
				((Class558) this).aClass643_6336.method7614((long) (6 * i));
				((Class558) this).aClass643_6336.method7619(aByteArray6334, 0, 6, -319996389);
				int i_9_ = 0;
				int i_10_ = 0;
				while (i_9_ < i_3_) {
					int i_11_ = 0;
					if (bool) {
						((Class558) this).aClass643_6333.method7614(520L * (long) i_6_);
						int i_12_;
						int i_13_;
						int i_14_;
						if (i > 65535) {
							try {
								((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, 10, (byte) 19);
							} catch (EOFException eofexception) {
								break;
							}
							i_12_ = (((aByteArray6334[0] & 0xff) << 24) + ((aByteArray6334[1] & 0xff) << 16) + ((aByteArray6334[2] & 0xff) << 8) + (aByteArray6334[3] & 0xff));
							i_13_ = (((aByteArray6334[4] & 0xff) << 8) + (aByteArray6334[5] & 0xff));
							i_11_ = (((aByteArray6334[7] & 0xff) << 8) + ((aByteArray6334[6] & 0xff) << 16) + (aByteArray6334[8] & 0xff));
							i_14_ = aByteArray6334[9] & 0xff;
						} else {
							try {
								((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, 8, (byte) 68);
							} catch (EOFException eofexception) {
								break;
							}
							i_12_ = ((aByteArray6334[1] & 0xff) + ((aByteArray6334[0] & 0xff) << 8));
							i_13_ = ((aByteArray6334[3] & 0xff) + ((aByteArray6334[2] & 0xff) << 8));
							i_11_ = ((aByteArray6334[6] & 0xff) + (((aByteArray6334[5] & 0xff) << 8) + ((aByteArray6334[4] & 0xff) << 16)));
							i_14_ = aByteArray6334[7] & 0xff;
						}
						if (i != i_12_ || i_13_ != i_10_ || (i_14_ != ((Class558) this).anInt6335 * 1565086879)) {
							boolean bool_15_ = false;
							return bool_15_;
						}
						if (i_11_ < 0 || (long) i_11_ > (((Class558) this).aClass643_6333.method7615(1928175235) / 520L)) {
							boolean bool_16_ = false;
							return bool_16_;
						}
					}
					if (i_11_ == 0) {
						bool = false;
						i_11_ = (int) ((((Class558) this).aClass643_6333.method7615(2098690329) + 519L) / 520L);
						if (i_11_ == 0)
							i_11_++;
						if (i_6_ == i_11_)
							i_11_++;
					}
					if (i > 65535) {
						if (i_3_ - i_9_ <= 510)
							i_11_ = 0;
						aByteArray6334[0] = (byte) (i >> 24);
						aByteArray6334[1] = (byte) (i >> 16);
						aByteArray6334[2] = (byte) (i >> 8);
						aByteArray6334[3] = (byte) i;
						aByteArray6334[4] = (byte) (i_10_ >> 8);
						aByteArray6334[5] = (byte) i_10_;
						aByteArray6334[6] = (byte) (i_11_ >> 16);
						aByteArray6334[7] = (byte) (i_11_ >> 8);
						aByteArray6334[8] = (byte) i_11_;
						aByteArray6334[9] = (byte) (1565086879 * ((Class558) this).anInt6335);
						((Class558) this).aClass643_6333.method7614(520L * (long) i_6_);
						((Class558) this).aClass643_6333.method7619(aByteArray6334, 0, 10, -1582777336);
						int i_17_ = i_3_ - i_9_;
						if (i_17_ > 510)
							i_17_ = 510;
						((Class558) this).aClass643_6333.method7619(is, i_9_, i_17_, -902470861);
						i_9_ += i_17_;
					} else {
						if (i_3_ - i_9_ <= 512)
							i_11_ = 0;
						aByteArray6334[0] = (byte) (i >> 8);
						aByteArray6334[1] = (byte) i;
						aByteArray6334[2] = (byte) (i_10_ >> 8);
						aByteArray6334[3] = (byte) i_10_;
						aByteArray6334[4] = (byte) (i_11_ >> 16);
						aByteArray6334[5] = (byte) (i_11_ >> 8);
						aByteArray6334[6] = (byte) i_11_;
						aByteArray6334[7] = (byte) (1565086879 * ((Class558) this).anInt6335);
						((Class558) this).aClass643_6333.method7614(520L * (long) i_6_);
						((Class558) this).aClass643_6333.method7619(aByteArray6334, 0, 8, -1236196421);
						int i_18_ = i_3_ - i_9_;
						if (i_18_ > 512)
							i_18_ = 512;
						((Class558) this).aClass643_6333.method7619(is, i_9_, i_18_, -1424521349);
						i_9_ += i_18_;
					}
					i_6_ = i_11_;
					i_10_++;
				}
				bool_5_ = true;
			} catch (IOException ioexception) {
				boolean bool_19_ = false;
				return bool_19_;
			}
			return bool_5_;
		}
	}

	public String toString() {
		return new StringBuilder().append("").append(1565086879 * ((Class558) this).anInt6335).toString();
	}

	public String method6596() {
		return new StringBuilder().append("").append(1565086879 * ((Class558) this).anInt6335).toString();
	}

	public String method6597() {
		return new StringBuilder().append("").append(1565086879 * ((Class558) this).anInt6335).toString();
	}

	public Class558(int i, Class643 class643, Class643 class643_20_, int i_21_) {
		((Class558) this).anInt6332 = -1769831096;
		((Class558) this).anInt6335 = i * -1916876961;
		((Class558) this).aClass643_6333 = class643;
		((Class558) this).aClass643_6336 = class643_20_;
		((Class558) this).anInt6332 = i_21_ * 804519261;
	}

	public byte[] method6598(int i) {
		synchronized (((Class558) this).aClass643_6333) {
			byte[] is;
			try {
				if (((Class558) this).aClass643_6336.method7615(1355187046) < (long) (6 * i + 6)) {
					byte[] is_22_ = null;
					return is_22_;
				}
				((Class558) this).aClass643_6336.method7614((long) (i * 6));
				((Class558) this).aClass643_6336.method7623(aByteArray6334, 0, 6, (byte) 64);
				int i_23_ = ((aByteArray6334[2] & 0xff) + (((aByteArray6334[1] & 0xff) << 8) + ((aByteArray6334[0] & 0xff) << 16)));
				int i_24_ = ((aByteArray6334[5] & 0xff) + (((aByteArray6334[3] & 0xff) << 16) + ((aByteArray6334[4] & 0xff) << 8)));
				if (i_23_ < 0 || i_23_ > ((Class558) this).anInt6332 * 814366453) {
					byte[] is_25_ = null;
					return is_25_;
				}
				if (i_24_ <= 0 || (long) i_24_ > ((Class558) this).aClass643_6333.method7615(1146565216) / 520L) {
					byte[] is_26_ = null;
					return is_26_;
				}
				byte[] is_27_ = new byte[i_23_];
				int i_28_ = 0;
				int i_29_ = 0;
				while (i_28_ < i_23_) {
					if (i_24_ == 0) {
						byte[] is_30_ = null;
						return is_30_;
					}
					((Class558) this).aClass643_6333.method7614((long) i_24_ * 520L);
					int i_31_ = i_23_ - i_28_;
					int i_32_;
					int i_33_;
					int i_34_;
					int i_35_;
					int i_36_;
					if (i > 65535) {
						if (i_31_ > 510)
							i_31_ = 510;
						i_32_ = 10;
						((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, i_31_ + i_32_, (byte) 32);
						i_33_ = ((aByteArray6334[3] & 0xff) + (((aByteArray6334[2] & 0xff) << 8) + (((aByteArray6334[1] & 0xff) << 16) + ((aByteArray6334[0] & 0xff) << 24))));
						i_34_ = ((aByteArray6334[5] & 0xff) + ((aByteArray6334[4] & 0xff) << 8));
						i_35_ = (((aByteArray6334[6] & 0xff) << 16) + ((aByteArray6334[7] & 0xff) << 8) + (aByteArray6334[8] & 0xff));
						i_36_ = aByteArray6334[9] & 0xff;
					} else {
						if (i_31_ > 512)
							i_31_ = 512;
						i_32_ = 8;
						((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, i_32_ + i_31_, (byte) 115);
						i_33_ = (((aByteArray6334[0] & 0xff) << 8) + (aByteArray6334[1] & 0xff));
						i_34_ = ((aByteArray6334[3] & 0xff) + ((aByteArray6334[2] & 0xff) << 8));
						i_35_ = (((aByteArray6334[5] & 0xff) << 8) + ((aByteArray6334[4] & 0xff) << 16) + (aByteArray6334[6] & 0xff));
						i_36_ = aByteArray6334[7] & 0xff;
					}
					if (i != i_33_ || i_34_ != i_29_ || i_36_ != 1565086879 * ((Class558) this).anInt6335) {
						byte[] is_37_ = null;
						return is_37_;
					}
					if (i_35_ < 0 || (long) i_35_ > ((Class558) this).aClass643_6333.method7615(1376424748) / 520L) {
						byte[] is_38_ = null;
						return is_38_;
					}
					int i_39_ = i_31_ + i_32_;
					for (int i_40_ = i_32_; i_40_ < i_39_; i_40_++)
						is_27_[i_28_++] = aByteArray6334[i_40_];
					i_24_ = i_35_;
					i_29_++;
				}
				is = is_27_;
			} catch (IOException ioexception) {
				byte[] is_41_ = null;
				return is_41_;
			}
			return is;
		}
	}

	public byte[] method6599(int i) {
		synchronized (((Class558) this).aClass643_6333) {
			byte[] is;
			try {
				if (((Class558) this).aClass643_6336.method7615(1084381928) < (long) (6 * i + 6)) {
					byte[] is_42_ = null;
					return is_42_;
				}
				((Class558) this).aClass643_6336.method7614((long) (i * 6));
				((Class558) this).aClass643_6336.method7623(aByteArray6334, 0, 6, (byte) 87);
				int i_43_ = ((aByteArray6334[2] & 0xff) + (((aByteArray6334[1] & 0xff) << 8) + ((aByteArray6334[0] & 0xff) << 16)));
				int i_44_ = ((aByteArray6334[5] & 0xff) + (((aByteArray6334[3] & 0xff) << 16) + ((aByteArray6334[4] & 0xff) << 8)));
				if (i_43_ < 0 || i_43_ > ((Class558) this).anInt6332 * 814366453) {
					byte[] is_45_ = null;
					return is_45_;
				}
				if (i_44_ <= 0 || (long) i_44_ > ((Class558) this).aClass643_6333.method7615(155556117) / 520L) {
					byte[] is_46_ = null;
					return is_46_;
				}
				byte[] is_47_ = new byte[i_43_];
				int i_48_ = 0;
				int i_49_ = 0;
				while (i_48_ < i_43_) {
					if (i_44_ == 0) {
						byte[] is_50_ = null;
						return is_50_;
					}
					((Class558) this).aClass643_6333.method7614((long) i_44_ * 520L);
					int i_51_ = i_43_ - i_48_;
					int i_52_;
					int i_53_;
					int i_54_;
					int i_55_;
					int i_56_;
					if (i > 65535) {
						if (i_51_ > 510)
							i_51_ = 510;
						i_52_ = 10;
						((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, i_51_ + i_52_, (byte) 123);
						i_53_ = ((aByteArray6334[3] & 0xff) + (((aByteArray6334[2] & 0xff) << 8) + (((aByteArray6334[1] & 0xff) << 16) + ((aByteArray6334[0] & 0xff) << 24))));
						i_54_ = ((aByteArray6334[5] & 0xff) + ((aByteArray6334[4] & 0xff) << 8));
						i_55_ = (((aByteArray6334[6] & 0xff) << 16) + ((aByteArray6334[7] & 0xff) << 8) + (aByteArray6334[8] & 0xff));
						i_56_ = aByteArray6334[9] & 0xff;
					} else {
						if (i_51_ > 512)
							i_51_ = 512;
						i_52_ = 8;
						((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, i_52_ + i_51_, (byte) 81);
						i_53_ = (((aByteArray6334[0] & 0xff) << 8) + (aByteArray6334[1] & 0xff));
						i_54_ = ((aByteArray6334[3] & 0xff) + ((aByteArray6334[2] & 0xff) << 8));
						i_55_ = (((aByteArray6334[5] & 0xff) << 8) + ((aByteArray6334[4] & 0xff) << 16) + (aByteArray6334[6] & 0xff));
						i_56_ = aByteArray6334[7] & 0xff;
					}
					if (i != i_53_ || i_54_ != i_49_ || i_56_ != 1565086879 * ((Class558) this).anInt6335) {
						byte[] is_57_ = null;
						return is_57_;
					}
					if (i_55_ < 0 || (long) i_55_ > ((Class558) this).aClass643_6333.method7615(422277426) / 520L) {
						byte[] is_58_ = null;
						return is_58_;
					}
					int i_59_ = i_51_ + i_52_;
					for (int i_60_ = i_52_; i_60_ < i_59_; i_60_++)
						is_47_[i_48_++] = aByteArray6334[i_60_];
					i_44_ = i_55_;
					i_49_++;
				}
				is = is_47_;
			} catch (IOException ioexception) {
				byte[] is_61_ = null;
				return is_61_;
			}
			return is;
		}
	}

	public byte[] method6600(int i, int i_62_) {
		synchronized (((Class558) this).aClass643_6333) {
			byte[] is;
			try {
				if (((Class558) this).aClass643_6336.method7615(485081707) < (long) (6 * i + 6)) {
					byte[] is_63_ = null;
					return is_63_;
				}
				((Class558) this).aClass643_6336.method7614((long) (i * 6));
				((Class558) this).aClass643_6336.method7623(aByteArray6334, 0, 6, (byte) 61);
				int i_64_ = ((aByteArray6334[2] & 0xff) + (((aByteArray6334[1] & 0xff) << 8) + ((aByteArray6334[0] & 0xff) << 16)));
				int i_65_ = ((aByteArray6334[5] & 0xff) + (((aByteArray6334[3] & 0xff) << 16) + ((aByteArray6334[4] & 0xff) << 8)));
				if (i_64_ < 0 || i_64_ > ((Class558) this).anInt6332 * 814366453) {
					byte[] is_66_ = null;
					return is_66_;
				}
				if (i_65_ <= 0 || (long) i_65_ > ((Class558) this).aClass643_6333.method7615(890232766) / 520L) {
					byte[] is_67_ = null;
					return is_67_;
				}
				byte[] is_68_ = new byte[i_64_];
				int i_69_ = 0;
				int i_70_ = 0;
				while (i_69_ < i_64_) {
					if (i_65_ == 0) {
						byte[] is_71_ = null;
						return is_71_;
					}
					((Class558) this).aClass643_6333.method7614((long) i_65_ * 520L);
					int i_72_ = i_64_ - i_69_;
					int i_73_;
					int i_74_;
					int i_75_;
					int i_76_;
					int i_77_;
					if (i > 65535) {
						if (i_72_ > 510)
							i_72_ = 510;
						i_73_ = 10;
						((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, i_72_ + i_73_, (byte) 105);
						i_74_ = ((aByteArray6334[3] & 0xff) + (((aByteArray6334[2] & 0xff) << 8) + (((aByteArray6334[1] & 0xff) << 16) + ((aByteArray6334[0] & 0xff) << 24))));
						i_75_ = ((aByteArray6334[5] & 0xff) + ((aByteArray6334[4] & 0xff) << 8));
						i_76_ = (((aByteArray6334[6] & 0xff) << 16) + ((aByteArray6334[7] & 0xff) << 8) + (aByteArray6334[8] & 0xff));
						i_77_ = aByteArray6334[9] & 0xff;
					} else {
						if (i_72_ > 512)
							i_72_ = 512;
						i_73_ = 8;
						((Class558) this).aClass643_6333.method7623(aByteArray6334, 0, i_73_ + i_72_, (byte) 35);
						i_74_ = (((aByteArray6334[0] & 0xff) << 8) + (aByteArray6334[1] & 0xff));
						i_75_ = ((aByteArray6334[3] & 0xff) + ((aByteArray6334[2] & 0xff) << 8));
						i_76_ = (((aByteArray6334[5] & 0xff) << 8) + ((aByteArray6334[4] & 0xff) << 16) + (aByteArray6334[6] & 0xff));
						i_77_ = aByteArray6334[7] & 0xff;
					}
					if (i != i_74_ || i_75_ != i_70_ || i_77_ != 1565086879 * ((Class558) this).anInt6335) {
						byte[] is_78_ = null;
						return is_78_;
					}
					if (i_76_ < 0 || (long) i_76_ > ((Class558) this).aClass643_6333.method7615(1459904563) / 520L) {
						byte[] is_79_ = null;
						return is_79_;
					}
					int i_80_ = i_72_ + i_73_;
					for (int i_81_ = i_73_; i_81_ < i_80_; i_81_++)
						is_68_[i_69_++] = aByteArray6334[i_81_];
					i_65_ = i_76_;
					i_70_++;
				}
				is = is_68_;
			} catch (IOException ioexception) {
				byte[] is_82_ = null;
				return is_82_;
			}
			return is;
		}
	}

	public static final void method6601(int i, String string, Color color, Color color_83_, Color color_84_, byte i_85_) {
		try {
			Graphics graphics = Class584.aCanvas7745.getGraphics();
			if (null == Class584.aFont7743)
				Class584.aFont7743 = new Font("Helvetica", 1, 13);
			if (null == color)
				color = new Color(140, 17, 17);
			if (null == color_83_)
				color_83_ = new Color(140, 17, 17);
			if (color_84_ == null)
				color_84_ = new Color(255, 255, 255);
			try {
				if (null == Class52.anImage492)
					Class52.anImage492 = Class584.aCanvas7745.createImage((1960824389 * (Class269.anInt2861)), (Class584.anInt7739 * -530390519));
				Graphics graphics_86_ = Class52.anImage492.getGraphics();
				graphics_86_.setColor(Color.black);
				graphics_86_.fillRect(0, 0, Class269.anInt2861 * 1960824389, Class584.anInt7739 * -530390519);
				int i_87_ = 1960824389 * Class269.anInt2861 / 2 - 152;
				int i_88_ = -530390519 * Class584.anInt7739 / 2 - 18;
				graphics_86_.setColor(color_83_);
				graphics_86_.drawRect(i_87_, i_88_, 303, 33);
				graphics_86_.setColor(color);
				graphics_86_.fillRect(i_87_ + 2, 2 + i_88_, i * 3, 30);
				graphics_86_.setColor(Color.black);
				graphics_86_.drawRect(1 + i_87_, 1 + i_88_, 301, 31);
				graphics_86_.fillRect(i_87_ + 2 + 3 * i, i_88_ + 2, 300 - i * 3, 30);
				graphics_86_.setFont(Class584.aFont7743);
				graphics_86_.setColor(color_84_);
				graphics_86_.drawString(string, (i_87_ + (304 - string.length() * 6) / 2), 22 + i_88_);
				if (null != Class584.aString7744) {
					graphics_86_.setFont(Class584.aFont7743);
					graphics_86_.setColor(color_84_);
					graphics_86_.drawString(Class584.aString7744, (Class269.anInt2861 * 1960824389 / 2 - Class584.aString7744.length() * 6 / 2), -530390519 * Class584.anInt7739 / 2 - 26);
				}
				graphics.drawImage(Class52.anImage492, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, 1960824389 * Class269.anInt2861, -530390519 * Class584.anInt7739);
				int i_89_ = Class269.anInt2861 * 1960824389 / 2 - 152;
				int i_90_ = -530390519 * Class584.anInt7739 / 2 - 18;
				graphics.setColor(color_83_);
				graphics.drawRect(i_89_, i_90_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(2 + i_89_, 2 + i_90_, 3 * i, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(i_89_ + 1, 1 + i_90_, 301, 31);
				graphics.fillRect(i_89_ + 2 + i * 3, 2 + i_90_, 300 - i * 3, 30);
				graphics.setFont(Class584.aFont7743);
				graphics.setColor(color_84_);
				if (Class584.aString7744 != null) {
					graphics.setFont(Class584.aFont7743);
					graphics.setColor(color_84_);
					graphics.drawString(Class584.aString7744, (Class269.anInt2861 * 1960824389 / 2 - (Class584.aString7744.length() * 6 / 2)), (Class584.anInt7739 * -530390519 / 2 - 26));
				}
				graphics.drawString(string, i_89_ + (304 - string.length() * 6) / 2, 22 + i_90_);
			}
		} catch (Exception exception) {
			Class584.aCanvas7745.repaint();
		}
	}

	static final void method6602(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub30_9231.method9129(1797179187);
	}
}

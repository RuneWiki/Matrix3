package game;

/* Class605 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class605 {
	float aFloat7903;
	int anInt7904;
	float aFloat7905;
	float aFloat7906;
	float[] aFloatArray7907;
	Object anObject7908;
	int anInt7909;
	boolean aBool7910;
	float aFloat7911;
	int anInt7912;
	int anInt7913;
	int anInt7914;
	boolean aBool7915;
	int anInt7916;
	int anInt7917;
	Object anObject7918;
	int anInt7919;
	int anInt7920;
	int anInt7921;
	int anInt7922;
	int anInt7923;
	int[] anIntArray7924;
	int[] anIntArray7925;
	int[] anIntArray7926;
	Interface69 anInterface69_7927;
	boolean aBool7928;
	Class597 aClass597_7929;
	Interface32 anInterface32_7930;
	Class289 aClass289_7931;
	byte[] aByteArray7932;
	Interface70 anInterface70_7933;
	int anInt7934 = 0;
	boolean aBool7935;
	int anInt7936;
	int anInt7937;
	int anInt7938;
	int anInt7939;
	int anInt7940;
	boolean aBool7941;
	int anInt7942;
	float aFloat7943;
	int anInt7944;
	int anInt7945;
	Class596[] aClass596Array7946;
	long aLong7947;
	float aFloat7948;
	long aLong7949;
	boolean aBool7950;
	boolean aBool7951;
	boolean aBool7952;
	boolean aBool7953;

	public Class597 method7152(int i) {
		return ((Class605) this).aClass597_7929;
	}

	void method7153(Class597 class597, int i) {
		((Class605) this).aClass597_7929 = class597;
	}

	int method7154(int i) {
		if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
			Class603 class603 = (Class603) ((Class605) this).anObject7908;
			Interface58 interface58 = class603.method7103(721060846);
			return interface58.method332((byte) 101);
		}
		return 0;
	}

	void method7155(int i) {
		((Class605) this).aBool7953 = false;
	}

	public void method7156(int i) {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7841).anInt7848)
			throw new RuntimeException("");
		method7153(Class597.aClass597_7841, 1996153574);
	}

	public void method7157(byte i) {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7841).anInt7848 * 174314955)
			throw new RuntimeException("");
		((Class605) this).anObject7908 = null;
		method7153(Class597.aClass597_7847, 2003398799);
	}

	void method7158(float f, int i, int i_0_) {
		if (i <= 0) {
			((Class605) this).aFloat7905 = f;
			((Class605) this).aFloat7911 = ((Class605) this).aFloat7905;
			((Class605) this).aLong7947 = 0L;
			((Class605) this).aLong7949 = 0L;
		} else {
			((Class605) this).aFloat7948 = ((Class605) this).aFloat7905;
			((Class605) this).aFloat7911 = f;
			((Class605) this).aLong7947 = Class69.method1067(-1764287921) * -3307554587752481579L;
			((Class605) this).aLong7949 = (-3540124634799975511L * ((long) i + 6973596618006109309L * ((Class605) this).aLong7947));
		}
	}

	public void method7159() {
		synchronized (this) {
			if (((Class605) this).aBool7953) {
				/* empty */
			} else if (null == ((Class605) this).anObject7918) {
				/* empty */
			} else {
				int i = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1905749662));
				if (i <= 0) {
					/* empty */
				} else if (((Class605) this).aClass596Array7946 != null && ((((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149]) != null) && ((Class605) this).aBool7941) {
					int i_1_ = ((i + ((Class605) this).anInt7934 * 1095867907 > (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053) ? ((((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053 - 1095867907 * ((Class605) this).anInt7934) : i);
					if ((1095867907 * ((Class605) this).anInt7934 < (((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837 * 1719368991)) && (i_1_ + 1095867907 * ((Class605) this).anInt7934 > (1719368991 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7837))) && (1719368991 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7837) >= 0) {
						((Class605) this).anInt7934 += ((1194432437 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837) - 1 * ((Class605) this).anInt7934);
						i_1_ = ((1095867907 * ((Class605) this).anInt7934 + i > (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).aClass572_Sub15_7836.o))) ? ((-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(234493149 * ((Class605) this).anInt7917)])).aClass572_Sub15_7836.o)) - 1095867907 * ((Class605) this).anInt7934) : i);
					}
					if ((i_1_ + ((Class605) this).anInt7934 * 1095867907 > (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838))) && (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838)) >= 0)
						i_1_ = ((1328125509 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7838) - 1095867907 * ((Class605) this).anInt7934);
					method7208((((Class596) (((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, i_1_ + ((Class605) this).anInt7934 * 1095867907, 184276065);
					((Class605) this).aClass289_7931.method3890(((Class605) this).anObject7918, (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, i_1_, -1255157659);
					((Class605) this).anInt7934 += 547781803 * i_1_;
					i -= i_1_;
					if ((((Class605) this).anInt7934 * 1095867907 >= (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o))) || ((1095867907 * ((Class605) this).anInt7934 >= (1328125509 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7838)) && (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838) * 1328125509 >= 0)) {
						((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149].method7037(-1623221996);
						((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917] = null;
						((Class605) this).anInt7917 += 1904173941;
						((Class605) this).anInt7917 = (((Class605) this).anInt7917 * 234493149 % ((Class605) this).aClass596Array7946.length * 1904173941);
						((Class605) this).anInt7934 = 0;
					}
				}
			}
		}
	}

	public void method7160() {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7841).anInt7848)
			throw new RuntimeException("");
		method7153(Class597.aClass597_7841, 1890046917);
	}

	void method7161(int i) {
		synchronized (this) {
			method7172(44611382);
		}
	}

	void method7162(Interface70 interface70, int i) {
		((Class605) this).anInterface70_7933 = interface70;
		if (((Class605) this).anInterface70_7933 != null)
			((Class605) this).anInterface70_7933.method430((((Class605) this).anObject7908), (((Class605) this).aFloatArray7907), null, 2009258246);
	}

	boolean method7163(int i) {
		if (null == ((Class605) this).aFloatArray7907)
			return false;
		float f = 0.0F;
		float f_2_ = 0.0F;
		for (int i_3_ = 0; i_3_ < ((Class605) this).aFloatArray7907.length; i_3_++) {
			float f_4_ = ((Class605) this).aFloatArray7907[i_3_];
			if (f_4_ * ((Class605) this).aFloat7905 > f)
				f = f_4_;
			if (f_4_ > f_2_)
				f_2_ = f_4_;
		}
		if (f < 1.0E-5F) {
			if (f_2_ >= 1.0E-5F && ((Class605) this).aFloat7911 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	void method7164(byte i) {
		Class374 class374 = (((Class605) this).aClass289_7931.method3894(973930351).method3955(-452675755 * ((Class605) this).anInt7904, -2073358806));
		((Class605) this).aFloat7906 = null != class374 ? class374.method4609(383401613) : 1.0F;
		float f = null != class374 ? class374.method4617((byte) 100) : 0.1F;
		f *= ((Class605) this).aFloat7905;
		float f_5_ = ((Class605) this).aFloatArray7907.length > 0 ? 0.0F : 1.0F;
		for (int i_6_ = 0; i_6_ < ((Class605) this).aFloatArray7907.length; i_6_++) {
			if (((Class605) this).aFloatArray7907[i_6_] > f_5_)
				f_5_ = ((Class605) this).aFloatArray7907[i_6_];
		}
		f *= f_5_;
		if (!method7163(-447839000))
			f = -1.0F;
		if (method7237((byte) 80) != f) {
			method7166(f, 880838729);
			((Class605) this).aBool7910 = true;
		}
	}

	boolean method7165(byte[] is, Interface69 interface69, int i, float f, boolean bool, boolean bool_7_, int i_8_, float f_9_, Object object, byte i_10_) {
		synchronized (this) {
			if (interface69 != null) {
				((Class605) this).aByteArray7932 = null;
				((Class605) this).anInterface69_7927 = interface69;
			} else
				((Class605) this).aByteArray7932 = is;
			((Class605) this).anObject7908 = object;
			((Class605) this).anInt7904 = i * 1642696189;
			((Class605) this).aFloat7905 = f;
			((Class605) this).aBool7952 = bool_7_;
			((Class605) this).anInt7912 = i_8_ * 1129642693;
			((Class605) this).aFloat7903 = f_9_;
			byte[] is_11_ = null;
			if (((Class605) this).aByteArray7932 != null)
				is_11_ = ((Class605) this).aByteArray7932;
			else if (((Class605) this).anInterface69_7927 != null) {
				((Class605) this).anInt7916 = 0;
				is_11_ = (((Class605) this).anInterface69_7927.method429(1173051613 * ((Class605) this).anInt7916, (short) 3553));
			}
			if (is_11_ != null) {
				RSByteBuffer class572_sub15 = new RSByteBuffer(is_11_);
				if (class572_sub15.readUnsignedByte(1236823192) != 74 || class572_sub15.readUnsignedByte(23140829) != 65 || class572_sub15.readUnsignedByte(1558036963) != 71 || class572_sub15.readUnsignedByte(1842512862) != 65)
					throw new RuntimeException("");
				((Class605) this).anInt7919 = class572_sub15.readInt(-297304473) * -2072404713;
				((Class605) this).anInt7920 = class572_sub15.readInt(-1033620344) * -1680282407;
				((Class605) this).anInt7922 = class572_sub15.readInt(1390320693) * 1390638711;
				((Class605) this).anInt7921 = class572_sub15.readInt(659404713) * 873357559;
				((Class605) this).anInt7923 = class572_sub15.readInt(-397588432) * 1034473163;
				if (((Class605) this).anObject7918 == null) {
					((Class605) this).anObject7918 = (((Class605) this).aClass289_7931.method3888(((Class605) this).anInt7921 * -1749393209, ((Class605) this).anInt7922 * 295650119, ((Class605) this).anInterface32_7930.method198(), ((Class605) this).anInterface32_7930.method158(), 1987713419 * ((Class605) this).anInt7936, ((Class605) this).aFloat7903, (byte) -17));
					if (((Class605) this).anObject7918 == null) {
						method7153(Class597.aClass597_7846, 2093114162);
						boolean bool_12_ = false;
						return bool_12_;
					}
				}
				((Class605) this).anIntArray7924 = new int[529245923 * ((Class605) this).anInt7923];
				((Class605) this).anIntArray7925 = new int[529245923 * ((Class605) this).anInt7923];
				((Class605) this).anIntArray7926 = new int[529245923 * ((Class605) this).anInt7923];
				int i_13_ = (((Class605) this).anInt7923 * -60999912 + -1585139053 * class572_sub15.o);
				for (int i_14_ = 0; i_14_ < ((Class605) this).anInt7923 * 529245923; i_14_++) {
					((Class605) this).anIntArray7924[i_14_] = i_13_;
					((Class605) this).anIntArray7925[i_14_] = class572_sub15.readInt(698762182);
					((Class605) this).anIntArray7926[i_14_] = class572_sub15.readInt(1444280641);
					i_13_ += ((Class605) this).anIntArray7925[i_14_];
				}
				((Class605) this).anInt7945 = -632982901 * class572_sub15.o;
				((Class605) this).aClass596Array7946 = new Class596[583029877 * ((Class605) this).anInt7913];
				((Class605) this).aFloatArray7907 = new float[2];
				for (int i_15_ = 0; i_15_ < ((Class605) this).aFloatArray7907.length; i_15_++)
					((Class605) this).aFloatArray7907[i_15_] = 1.0F;
				if (((Class605) this).anObject7908 instanceof Class603) {
					Interface58 interface58 = ((Class603) ((Class605) this).anObject7908).method7103(-53131970);
					((Class605) this).aBool7950 = interface58.method330((byte) 94);
					((Class605) this).aBool7951 = !((Class605) this).aBool7950;
				}
				((Class605) this).anInterface32_7930.method166(((Class605) this).aBool7951, (((Class605) this).aBool7952 ? 1337357325 * ((Class605) this).anInt7912 : 0), 1824090791 * ((Class605) this).anInt7919, 1297142633 * ((Class605) this).anInt7920);
				if (null != ((Class605) this).anInterface69_7927) {
					int i_16_ = (class572_sub15.b.length - -1376458471 * ((Class605) this).anInt7945);
					byte[] is_17_ = Class448.method5350(i_16_, true, -1694856368);
					System.arraycopy(class572_sub15.b, ((Class605) this).anInt7945 * -1376458471, is_17_, 0, i_16_);
					class572_sub15.b = is_17_;
					class572_sub15.o = 310393755 * i_16_;
					((Class605) this).anInterface32_7930.method108(class572_sub15);
					((Class605) this).anInt7916 += -793100427;
				} else
					((Class605) this).aBool7915 = true;
				boolean bool_18_ = true;
				return bool_18_;
			}
			boolean bool_19_ = is_11_ != null;
			return bool_19_;
		}
	}

	void method7166(float f, int i) {
		synchronized (this) {
			((Class605) this).aFloat7943 = f;
		}
	}

	boolean method7167() {
		return ((Class605) this).aClass597_7929 == Class597.aClass597_7846;
	}

	public void method7168(int i) {
		synchronized (this) {
			method7169((byte) 46);
		}
	}

	void method7169(byte i) {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= ((Class597) Class597.aClass597_7842).anInt7848 * 174314955) {
			if (method7152(-987437988) == Class597.aClass597_7847)
				method7171(-416195169);
			else {
				method7170((short) -10139);
				if (((Class605) this).aFloat7905 != ((Class605) this).aFloat7911) {
					long l = Class69.method1067(-1701353539);
					if (l > ((Class605) this).aLong7949 * 4985271299030581401L)
						((Class605) this).aFloat7905 = ((Class605) this).aFloat7911;
					else {
						float f = (((Class605) this).aFloat7911 - ((Class605) this).aFloat7948);
						long l_20_ = ((((Class605) this).aLong7949 * 4985271299030581401L) - (((Class605) this).aLong7947 * 6973596618006109309L));
						float f_21_ = f / (float) l_20_;
						((Class605) this).aFloat7905 = (((Class605) this).aFloat7948 + f_21_ * (float) (l - (6973596618006109309L * (((Class605) this).aLong7947))));
						((Class605) this).aFloat7905 = Math.max(0.0F, Math.min(1.0F, ((Class605) this).aFloat7905));
					}
				}
				method7164((byte) -45);
				if (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (((Class597) Class597.aClass597_7839).anInt7848 * 174314955))
					method7173(-1960791772);
			}
		}
	}

	void method7170(short i) {
		synchronized (this) {
			int i_22_ = method7154(2023767550);
			if (((Class605) this).aBool7950 && i_22_ > -1710804233 * ((Class605) this).anInt7938 && ((Class605) this).anInterface32_7930.method157()) {
				/* empty */
			} else {
				Class291 class291 = ((Class605) this).anInterface32_7930.method155();
				if (((Class605) this).aBool7915 && class291 != Class291.aClass291_3444) {
					if (((Class605) this).aByteArray7932 != null) {
						if (-1922297029 * ((Class605) this).anInt7939 >= ((Class605) this).anInt7923 * 529245923) {
							((Class605) this).anInterface32_7930.method108(null);
							((Class605) this).anInt7939 = 0;
						} else {
							if (-1857406735 * ((Class605) this).anInt7914 < -1376458471 * ((Class605) this).anInt7945)
								((Class605) this).anInt7914 = ((Class605) this).anInt7945 * -801475927;
							((Class605) this).anInt7914 = (((((Class605) this).anIntArray7924[(-1922297029 * ((Class605) this).anInt7939)]) + ((Class605) this).anInt7942 * 2011461627) * -1418348527);
							int i_23_ = (((Class605) this).anIntArray7925[(-1922297029 * ((Class605) this).anInt7939)]);
							int i_24_ = i_23_;
							int i_25_ = ((((Class605) this).anInt7942 * 2011461627 + i_24_) > i_23_ ? (((Class605) this).anIntArray7924[-1922297029 * (((Class605) this).anInt7939)]) + i_23_ : (-1857406735 * ((Class605) this).anInt7914 + i_24_));
							Class605 class605_26_ = this;
							((Class605) class605_26_).anInt7942 = (((Class605) class605_26_).anInt7942 + (1329330995 * ((-1857406735 * (((Class605) this).anInt7914) + i_24_ > (((Class605) this).aByteArray7932).length) ? ((((Class605) this).aByteArray7932).length - (-1857406735 * ((Class605) this).anInt7914)) : i_24_)));
							RSByteBuffer class572_sub15 = new RSByteBuffer(i_25_ - (((Class605) this).anInt7914 * -1857406735), true);
							if (null == ((Class605) this).aByteArray7932)
								throw new RuntimeException("");
							if (null == class572_sub15.b)
								throw new RuntimeException("");
							class572_sub15.writeBytes(((Class605) this).aByteArray7932, -1857406735 * ((Class605) this).anInt7914, (i_25_ - -1857406735 * ((Class605) this).anInt7914), (byte) -46);
							((Class605) this).anInterface32_7930.method108(class572_sub15);
							method7177(false, -1503508528);
							if (((Class605) this).anInt7942 * 2011461627 >= i_23_) {
								((Class605) this).anInt7939 += -976007693;
								((Class605) this).anInt7942 = 0;
							}
						}
					} else if (((Class605) this).anInterface69_7927 != null) {
						if (1173051613 * ((Class605) this).anInt7916 >= 529245923 * ((Class605) this).anInt7923) {
							((Class605) this).anInt7916 = 0;
							((Class605) this).anInterface32_7930.method108(null);
						} else {
							byte[] is = (((Class605) this).anInterface69_7927.method429((((Class605) this).anIntArray7926[(((Class605) this).anInt7916 * 1173051613)]), (short) 3553));
							if (is != null) {
								RSByteBuffer class572_sub15 = new RSByteBuffer(is);
								class572_sub15.o = is.length * 310393755;
								((Class605) this).anInterface32_7930.method108(class572_sub15);
								method7177(false, -1898559613);
								((Class605) this).anInt7916 += -793100427;
							}
						}
					}
				}
			}
		}
	}

	void method7171(int i) {
		synchronized (this) {
			if (((Class605) this).anInterface32_7930.method155() == Class291.aClass291_3446) {
				if (((Class605) this).anObject7918 != null) {
					int i_27_ = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1836908842));
					if (i_27_ >= 1987713419 * ((Class605) this).anInt7936) {
						((Class605) this).aClass289_7931.method3899(((Class605) this).anObject7918, -497866724);
						((Class605) this).anObject7918 = null;
						method7153(Class597.aClass597_7840, 2073181457);
					}
				} else
					method7153(Class597.aClass597_7840, 1897554604);
			}
		}
		method7187(-1226956344);
	}

	void method7172(int i) {
		if (method7152(-987437988) != Class597.aClass597_7839 && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (174314955 * ((Class597) Class597.aClass597_7842).anInt7848))) {
			method7153(Class597.aClass597_7842, 2079906708);
			((Class605) this).aBool7928 = true;
			method7173(-1657294595);
			method7164((byte) -85);
		}
	}

	void method7173(int i) {
		if (true == ((Class605) this).aBool7928 && (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7842).anInt7848) && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7846).anInt7848 * 174314955) && null != ((Class605) this).anInterface70_7933 && ((Class605) this).aFloat7911 == ((Class605) this).aFloat7905)
			((Class605) this).anInterface70_7933.method430((((Class605) this).anObject7908), (((Class605) this).aFloatArray7907), null, 2131310733);
	}

	void method7174(byte i) {
		((Class605) this).aBool7953 = true;
	}

	void method7175(byte i) {
		synchronized (this) {
			if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
				Class603 class603 = (Class603) ((Class605) this).anObject7908;
				Interface58 interface58 = class603.method7103(-1018158318);
				if (interface58 != null)
					interface58.method333(true, 1859182481);
			}
		}
	}

	void method7176(short i) {
		if (((Class605) this).aClass596Array7946 != null) {
			boolean bool = true;
			Class291 class291 = ((Class605) this).anInterface32_7930.method155();
			if (((Class605) this).anInterface32_7930.method157()) {
				if (((Class605) this).aBool7950 && method7202(((Class605) this).anInt7938 * -1710804233, 1662366182)) {
					if ((((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867]) == null) {
						RSByteBuffer class572_sub15 = method7198((-1710804233 * ((Class605) this).anInt7938), 642782895);
						if (null != class572_sub15) {
							((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867] = new Class596(this, class572_sub15, false);
							int i_28_ = ((Class605) this).anInterface32_7930.method159();
							int i_29_ = (((Class605) this).anInterface32_7930.method196(-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(92327867 * ((Class605) this).anInt7940)])).aClass572_Sub15_7836.o) / i_28_));
							((Class605) this).anInt7909 += i_29_ * -485583281;
							if (false == ((Class605) this).aBool7951 && ((Class605) this).aBool7952 && (((Class605) this).anInt7944 * -1370058817 > 0)) {
								if (((Class605) this).anInt7909 * -604716881 < ((Class605) this).anInt7919 * 1824090791)
									((Class605) this).aClass596Array7946[(92327867 * ((Class605) this).anInt7940)] = null;
								else if (((((Class605) this).anInt7909 * -604716881) >= (1824090791 * ((Class605) this).anInt7919)) && ((((Class605) this).anInt7909 * -604716881) - i_29_ < 1824090791 * (((Class605) this).anInt7919)))
									((Class596) (((Class605) this).aClass596Array7946[92327867 * (((Class605) this).anInt7940)])).anInt7837 = ((((Class605) this).anInterface32_7930.method163(((((Class605) this).anInt7909 * -604716881) - (((Class605) this).anInt7919 * 1824090791)) * i_28_)) * -1454391585);
							}
							((Class605) this).anInt7938 += 301543111;
							if (!((Class605) this).aBool7951 && ((Class605) this).aBool7952 && (((Class605) this).anInt7909 * -604716881 >= (((Class605) this).anInt7920 * 1297142633)) && ((-1370058817 * ((Class605) this).anInt7944 < (1337357325 * ((Class605) this).anInt7912)) || (((Class605) this).anInt7912 * 1337357325) < 0)) {
								int i_30_ = (((Class605) this).anInt7909 * -604716881 - (((Class605) this).anInt7920 * 1297142633));
								int i_31_ = i_29_ - i_30_;
								((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7940 * 92327867)])).anInt7838 = (((Class605) this).anInterface32_7930.method163(i_28_ * i_31_) * -97973107);
								((Class605) this).anInt7938 = 0;
								((Class605) this).anInt7909 = 0;
								((Class605) this).anInt7944 += 804610111;
							}
							if ((((Class605) this).aClass596Array7946[92327867 * ((Class605) this).anInt7940]) != null) {
								((Class605) this).anInt7940 += -488137357;
								((Class605) this).anInt7940 = (((Class605) this).anInt7940 * 92327867 % (((Class605) this).aClass596Array7946).length * -488137357);
							}
						}
					}
				} else if (!method7184((byte) 4) || !((Class605) this).aBool7950) {
					int i_32_ = ((Class605) this).anInterface32_7930.method55();
					int i_33_ = (((Class605) this).anInterface32_7930.method196(((Class605) this).anInt7936 * 1987713419));
					if (false == ((Class605) this).aBool7935 && ((((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867]) == null)) {
						if (class291 != Class291.aClass291_3440 && i_32_ > 0) {
							RSByteBuffer class572_sub15 = method7228(i_33_, -1410121049);
							((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867] = (null != class572_sub15 ? new Class596(this, class572_sub15, false) : null);
							int i_34_ = (null != (((Class605) this).aClass596Array7946[(((Class605) this).anInt7940 * 92327867)]) ? (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(92327867 * ((Class605) this).anInt7940)])).aClass572_Sub15_7836.o)) : 0);
							int i_35_ = ((Class605) this).anInterface32_7930.method159();
							int i_36_ = ((Class605) this).anInterface32_7930.method196(i_34_ / i_35_);
							((Class605) this).anInt7937 += i_36_ * 657716793;
							if (((Class605) this).anInt7937 * -389081079 > ((Class605) this).anInt7909 * -604716881) {
								((Class605) this).anInt7909 += i_36_ * -485583281;
								i_32_ -= i_36_;
								if (!((Class605) this).aBool7951 && ((Class605) this).aBool7952 && (-1370058817 * ((Class605) this).anInt7944) > 0) {
									if ((-604716881 * ((Class605) this).anInt7909) < (1824090791 * ((Class605) this).anInt7919))
										((Class605) this).aClass596Array7946[(((Class605) this).anInt7940 * 92327867)] = null;
									else if (((((Class605) this).anInt7909 * -604716881) >= (((Class605) this).anInt7919 * 1824090791)) && ((((Class605) this).anInt7909 * -604716881) - i_36_ < (1824090791 * (((Class605) this).anInt7919))))
										((Class596) (((Class605) this).aClass596Array7946[92327867 * (((Class605) this).anInt7940)])).anInt7837 = ((((Class605) this).anInterface32_7930.method163(i_35_ * ((-604716881 * (((Class605) this).anInt7909)) - (1824090791 * (((Class605) this).anInt7919))))) * -1454391585);
								}
								if ((((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867]) != null) {
									if (((Class605) this).aBool7950 && !method7202(((((Class605) this).anInt7938) * -1710804233), 1662366182))
										method7181((((Class596) (((Class605) this).aClass596Array7946[(92327867 * (((Class605) this).anInt7940))])).aClass572_Sub15_7836), 1312128972);
									if (!((Class605) this).aBool7951 && ((Class605) this).aBool7952 && ((((Class605) this).anInt7909 * -604716881) >= (((Class605) this).anInt7920 * 1297142633)) && (((-1370058817 * ((Class605) this).anInt7944) <= (((Class605) this).anInt7912 * 1337357325)) || ((1337357325 * ((Class605) this).anInt7912) < 0))) {
										int i_37_ = ((-604716881 * ((Class605) this).anInt7909) - (((Class605) this).anInt7920 * 1297142633));
										int i_38_ = i_36_ - i_37_;
										((Class596) (((Class605) this).aClass596Array7946[92327867 * (((Class605) this).anInt7940)])).anInt7838 = (((Class605) this).anInterface32_7930.method163(i_35_ * i_38_) * -97973107);
										((Class605) this).anInt7938 = 0;
										((Class605) this).anInt7944 += 804610111;
										((Class605) this).anInt7909 = 0;
									} else
										((Class605) this).anInt7938 += 301543111;
									((Class605) this).anInt7940 += -488137357;
									((Class605) this).anInt7940 = (-488137357 * (92327867 * ((Class605) this).anInt7940 % (((Class605) this).aClass596Array7946).length));
								}
							} else
								((Class605) this).aClass596Array7946[92327867 * ((Class605) this).anInt7940] = null;
						} else if (class291 == Class291.aClass291_3440 && ((Class605) this).aBool7952 && false == ((Class605) this).aBool7951 && (((((Class605) this).anInt7944 * -1370058817) < (((Class605) this).anInt7912 * 1337357325)) || (((Class605) this).anInt7912 * 1337357325) < 0))
							((Class605) this).anInterface32_7930.method165(true);
					}
				}
			}
			int i_39_ = 0;
			for (int i_40_ = 0; i_40_ < ((Class605) this).aClass596Array7946.length; i_40_++) {
				if (null != ((Class605) this).aClass596Array7946[i_40_]) {
					i_39_++;
					bool = false;
				}
			}
			if (!((Class605) this).aBool7941 && method7237((byte) 90) >= 0.0F && (i_39_ >= 583029877 * ((Class605) this).anInt7913 || class291 == Class291.aClass291_3440 || Class291.aClass291_3444 == class291)) {
				((Class605) this).aBool7941 = true;
				method7153(Class597.aClass597_7844, 2094590797);
			}
			if (((Class605) this).anInterface32_7930.method157() && bool && (method7184((byte) -6) || ((Class605) this).aBool7935 || class291 == Class291.aClass291_3440) && (false == ((Class605) this).aBool7952 || (false == ((Class605) this).aBool7951 && (-1370058817 * ((Class605) this).anInt7944 >= 1337357325 * ((Class605) this).anInt7912) && 1337357325 * ((Class605) this).anInt7912 >= 0))) {
				method7153(Class597.aClass597_7846, 1897593572);
				((Class605) this).aBool7928 = false;
				if (((Class605) this).aBool7950)
					method7175((byte) 4);
			}
		}
	}

	void method7177(boolean bool, int i) {
		((Class605) this).aBool7915 = bool;
	}

	public void method7178() {
		synchronized (this) {
			if (method7152(-987437988) == Class597.aClass597_7839 || (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (((Class597) Class597.aClass597_7841).anInt7848 * 174314955))) {
				/* empty */
			} else
				method7153(Class597.aClass597_7839, 2127691535);
		}
	}

	void method7179() {
		synchronized (this) {
			if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
				Class603 class603 = (Class603) ((Class605) this).anObject7908;
				Interface58 interface58 = class603.method7103(-2089760333);
				if (interface58 != null)
					interface58.method333(true, 1859182481);
			}
		}
	}

	boolean method7180() {
		synchronized (this) {
			if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
				Class603 class603 = (Class603) ((Class605) this).anObject7908;
				Interface58 interface58 = class603.method7103(-851074977);
				if (interface58 != null) {
					boolean bool = interface58.method334((short) 8192);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method7181(RSByteBuffer class572_sub15, int i) {
		if (null != ((Class605) this).anObject7908 && ((Class605) this).anObject7908 instanceof Class603) {
			Class603 class603 = (Class603) ((Class605) this).anObject7908;
			Interface58 interface58 = class603.method7103(1080998672);
			byte[] is = new byte[class572_sub15.o * -1585139053];
			System.arraycopy(class572_sub15.b, 0, is, 0, class572_sub15.o * -1585139053);
			RSByteBuffer class572_sub15_41_ = new RSByteBuffer(is);
			class572_sub15_41_.o = 1 * class572_sub15.o;
			interface58.method350(class572_sub15_41_, -800577849);
		}
	}

	int method7182() {
		if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
			Class603 class603 = (Class603) ((Class605) this).anObject7908;
			Interface58 interface58 = class603.method7103(779208364);
			return interface58.method332((byte) 37);
		}
		return 0;
	}

	boolean method7183() {
		return Class597.aClass597_7839 == ((Class605) this).aClass597_7929;
	}

	boolean method7184(byte i) {
		synchronized (this) {
			if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
				Class603 class603 = (Class603) ((Class605) this).anObject7908;
				Interface58 interface58 = class603.method7103(1067230050);
				if (interface58 != null) {
					boolean bool = interface58.method334((short) 8192);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method7185() {
		((Class605) this).aBool7953 = true;
	}

	Object method7186(int i) {
		return ((Class605) this).anObject7908;
	}

	void method7187(int i) {
		synchronized (this) {
			((Class605) this).aByteArray7932 = null;
			((Class605) this).anInt7904 = 0;
			((Class605) this).aFloat7905 = 0.0F;
			((Class605) this).aFloat7906 = 0.0F;
			((Class605) this).aBool7952 = false;
			((Class605) this).anInt7912 = 0;
			((Class605) this).aFloat7903 = 1.0F;
			((Class605) this).anInterface69_7927 = null;
			((Class605) this).anInt7916 = 0;
			((Class605) this).anInt7914 = 0;
			if (((Class605) this).aClass596Array7946 != null) {
				for (int i_42_ = 0; i_42_ < ((Class605) this).aClass596Array7946.length; i_42_++) {
					if (((Class605) this).aClass596Array7946[i_42_] != null)
						((Class605) this).aClass596Array7946[i_42_].method7037(-550080968);
				}
			}
			((Class605) this).aClass596Array7946 = null;
			((Class605) this).aBool7950 = false;
			((Class605) this).anInt7917 = 0;
			((Class605) this).anInt7919 = 0;
			((Class605) this).anInt7920 = 0;
			((Class605) this).anInt7921 = 0;
			((Class605) this).anInt7922 = 0;
			((Class605) this).anInt7923 = 0;
			((Class605) this).anIntArray7924 = null;
			((Class605) this).anIntArray7925 = null;
			((Class605) this).anIntArray7926 = null;
			((Class605) this).anInt7945 = 0;
			((Class605) this).aBool7928 = false;
			((Class605) this).anInterface32_7930.method151();
			((Class605) this).aBool7915 = false;
			((Class605) this).anInterface70_7933 = null;
			((Class605) this).anObject7908 = null;
			((Class605) this).anInt7934 = 0;
			((Class605) this).anInt7909 = 0;
			((Class605) this).anInt7937 = 0;
			((Class605) this).aBool7935 = false;
			((Class605) this).anInt7939 = 0;
			((Class605) this).anInt7940 = 0;
			((Class605) this).aBool7941 = false;
			((Class605) this).anInt7942 = 0;
			method7166(-1.0F, -658031301);
			((Class605) this).aBool7910 = false;
			((Class605) this).aFloat7911 = 0.0F;
			((Class605) this).aLong7949 = 0L;
			((Class605) this).aLong7947 = 0L;
			((Class605) this).aFloat7948 = 0.0F;
			((Class605) this).anInt7938 = 0;
			((Class605) this).anInt7944 = 0;
		}
	}

	void method7188() {
		synchronized (this) {
			method7172(-904554146);
		}
	}

	public void method7189() {
		if ((((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7842).anInt7848) && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7839).anInt7848 * 174314955) && method7163(-2013192300)) {
			synchronized (this) {
				((Class605) this).anInterface32_7930.method103();
				method7176((short) 11848);
			}
			Thread.yield();
		}
	}

	boolean method7190() {
		return Class597.aClass597_7839 == ((Class605) this).aClass597_7929;
	}

	boolean method7191() {
		return Class597.aClass597_7839 == ((Class605) this).aClass597_7929;
	}

	boolean method7192() {
		return Class597.aClass597_7839 == ((Class605) this).aClass597_7929;
	}

	public void method7193(int i) {
		synchronized (this) {
			if (method7152(-987437988) == Class597.aClass597_7839 || (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (((Class597) Class597.aClass597_7841).anInt7848 * 174314955))) {
				/* empty */
			} else
				method7153(Class597.aClass597_7839, 2016930314);
		}
	}

	void method7194() {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= ((Class597) Class597.aClass597_7842).anInt7848 * 174314955) {
			if (method7152(-987437988) == Class597.aClass597_7847)
				method7171(-410091021);
			else {
				method7170((short) -31488);
				if (((Class605) this).aFloat7905 != ((Class605) this).aFloat7911) {
					long l = Class69.method1067(-1665353537);
					if (l > ((Class605) this).aLong7949 * 4985271299030581401L)
						((Class605) this).aFloat7905 = ((Class605) this).aFloat7911;
					else {
						float f = (((Class605) this).aFloat7911 - ((Class605) this).aFloat7948);
						long l_43_ = ((((Class605) this).aLong7949 * 4985271299030581401L) - (((Class605) this).aLong7947 * 6973596618006109309L));
						float f_44_ = f / (float) l_43_;
						((Class605) this).aFloat7905 = (((Class605) this).aFloat7948 + f_44_ * (float) (l - (6973596618006109309L * (((Class605) this).aLong7947))));
						((Class605) this).aFloat7905 = Math.max(0.0F, Math.min(1.0F, ((Class605) this).aFloat7905));
					}
				}
				method7164((byte) -79);
				if (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (((Class597) Class597.aClass597_7839).anInt7848 * 174314955))
					method7173(-812982785);
			}
		}
	}

	public void method7195() {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7841).anInt7848 * 174314955)
			throw new RuntimeException("");
		((Class605) this).anObject7908 = null;
		method7153(Class597.aClass597_7847, 2111977913);
	}

	public void method7196() {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7841).anInt7848 * 174314955)
			throw new RuntimeException("");
		((Class605) this).anObject7908 = null;
		method7153(Class597.aClass597_7847, 2004365018);
	}

	public void method7197() {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7841).anInt7848 * 174314955)
			throw new RuntimeException("");
		((Class605) this).anObject7908 = null;
		method7153(Class597.aClass597_7847, 1892637693);
	}

	RSByteBuffer method7198(int i, int i_45_) {
		if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
			Class603 class603 = (Class603) ((Class605) this).anObject7908;
			Interface58 interface58 = class603.method7103(201183836);
			RSByteBuffer class572_sub15 = interface58.method329(i, 1094901637);
			RSByteBuffer class572_sub15_46_ = new RSByteBuffer(class572_sub15.o * -1585139053, true);
			class572_sub15_46_.method8463(class572_sub15, (byte) 1);
			return class572_sub15_46_;
		}
		return null;
	}

	float method7199() {
		return ((Class605) this).aFloat7905;
	}

	boolean method7200() {
		synchronized (this) {
			if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
				Class603 class603 = (Class603) ((Class605) this).anObject7908;
				Interface58 interface58 = class603.method7103(675944911);
				if (interface58 != null) {
					boolean bool = interface58.method334((short) 8192);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	void method7201() {
		synchronized (this) {
			method7172(-176115816);
		}
	}

	public Class605(Class612 class612, int i, int i_47_, Interface32 interface32, Class289 class289) {
		((Class605) this).anInt7909 = 0;
		((Class605) this).anInt7937 = 0;
		((Class605) this).anInt7939 = 0;
		((Class605) this).anInt7940 = 0;
		((Class605) this).anInt7942 = 0;
		((Class605) this).aFloat7911 = 0.0F;
		((Class605) this).aLong7949 = 0L;
		((Class605) this).aLong7947 = 0L;
		((Class605) this).aFloat7948 = 0.0F;
		((Class605) this).anInt7938 = 0;
		((Class605) this).anInt7944 = 0;
		((Class605) this).aClass289_7931 = class289;
		method7153(Class597.aClass597_7840, 2023016789);
		((Class605) this).anInt7936 = i * -666384861;
		((Class605) this).anInt7913 = -436479011 * i_47_;
		((Class605) this).anInterface32_7930 = interface32;
		((Class605) this).anInt7917 = 0;
		((Class605) this).aBool7915 = false;
		((Class605) this).anInterface32_7930.method156(new Class600(this));
		method7187(-45448855);
	}

	boolean method7202(int i, int i_48_) {
		if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
			Class603 class603 = (Class603) ((Class605) this).anObject7908;
			Interface58 interface58 = class603.method7103(1693858940);
			return interface58.method331(i, 1369304407);
		}
		return false;
	}

	boolean method7203() {
		if (null == ((Class605) this).aFloatArray7907)
			return false;
		float f = 0.0F;
		float f_49_ = 0.0F;
		for (int i = 0; i < ((Class605) this).aFloatArray7907.length; i++) {
			float f_50_ = ((Class605) this).aFloatArray7907[i];
			if (f_50_ * ((Class605) this).aFloat7905 > f)
				f = f_50_;
			if (f_50_ > f_49_)
				f_49_ = f_50_;
		}
		if (f < 1.0E-5F) {
			if (f_49_ >= 1.0E-5F && ((Class605) this).aFloat7911 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	boolean method7204() {
		if (null == ((Class605) this).aFloatArray7907)
			return false;
		float f = 0.0F;
		float f_51_ = 0.0F;
		for (int i = 0; i < ((Class605) this).aFloatArray7907.length; i++) {
			float f_52_ = ((Class605) this).aFloatArray7907[i];
			if (f_52_ * ((Class605) this).aFloat7905 > f)
				f = f_52_;
			if (f_52_ > f_51_)
				f_51_ = f_52_;
		}
		if (f < 1.0E-5F) {
			if (f_51_ >= 1.0E-5F && ((Class605) this).aFloat7911 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	void method7205() {
		synchronized (this) {
			method7172(-1171914029);
		}
	}

	void method7206() {
		Class374 class374 = (((Class605) this).aClass289_7931.method3894(1388351751).method3955(-452675755 * ((Class605) this).anInt7904, -807918243));
		((Class605) this).aFloat7906 = null != class374 ? class374.method4609(-536313716) : 1.0F;
		float f = null != class374 ? class374.method4617((byte) 44) : 0.1F;
		f *= ((Class605) this).aFloat7905;
		float f_53_ = ((Class605) this).aFloatArray7907.length > 0 ? 0.0F : 1.0F;
		for (int i = 0; i < ((Class605) this).aFloatArray7907.length; i++) {
			if (((Class605) this).aFloatArray7907[i] > f_53_)
				f_53_ = ((Class605) this).aFloatArray7907[i];
		}
		f *= f_53_;
		if (!method7163(-793486732))
			f = -1.0F;
		if (method7237((byte) 119) != f) {
			method7166(f, 1133942965);
			((Class605) this).aBool7910 = true;
		}
	}

	public float method7207() {
		return ((Class605) this).aFloat7943;
	}

	void method7208(byte[] is, int i, int i_54_, int i_55_) {
		int i_56_ = i;
		int i_57_ = 0;
		int i_58_ = (((Class605) this).anInterface32_7930.method198().anInt3472 * -1700527127);
		while (i_56_ < is.length && i_56_ < i_54_) {
			float f = (((Class605) this).aFloat7906 * ((Class605) this).aFloat7905 * ((Class605) this).aFloatArray7907[i_57_]);
			if (i_58_ == 16) {
				int i_59_ = (is[i_56_] & 0xff) + (is[i_56_ + 1] << 8);
				i_59_ *= f * f;
				is[i_56_++] = (byte) i_59_;
				is[i_56_++] = (byte) (i_59_ >> 8);
			} else if (8 == i_58_) {
				byte i_60_ = is[i_56_];
				i_60_ *= f;
				is[i_56_++] = i_60_;
			} else
				throw new RuntimeException("");
			i_57_ = ++i_57_ % ((Class605) this).aFloatArray7907.length;
		}
	}

	void method7209(float f) {
		synchronized (this) {
			((Class605) this).aFloat7943 = f;
		}
	}

	void method7210(float f) {
		synchronized (this) {
			((Class605) this).aFloat7943 = f;
		}
	}

	public boolean method7211() {
		return ((Class605) this).aBool7910;
	}

	public boolean method7212() {
		return ((Class605) this).aBool7910;
	}

	public void method7213() {
		synchronized (this) {
			method7169((byte) -24);
		}
	}

	public void method7214() {
		synchronized (this) {
			method7169((byte) -52);
		}
	}

	public void method7215() {
		synchronized (this) {
			method7169((byte) 0);
		}
	}

	public void method7216(byte i) {
		synchronized (this) {
			if (((Class605) this).aBool7953) {
				/* empty */
			} else if (null == ((Class605) this).anObject7918) {
				/* empty */
			} else {
				int i_61_ = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1965475993));
				if (i_61_ <= 0) {
					/* empty */
				} else if (((Class605) this).aClass596Array7946 != null && ((((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149]) != null) && ((Class605) this).aBool7941) {
					int i_62_ = ((i_61_ + ((Class605) this).anInt7934 * 1095867907 > (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053) ? ((((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053 - 1095867907 * ((Class605) this).anInt7934) : i_61_);
					if ((1095867907 * ((Class605) this).anInt7934 < (((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837 * 1719368991)) && (i_62_ + 1095867907 * ((Class605) this).anInt7934 > (1719368991 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7837))) && (1719368991 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7837) >= 0) {
						((Class605) this).anInt7934 += ((1194432437 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837) - 1 * ((Class605) this).anInt7934);
						i_62_ = (((1095867907 * ((Class605) this).anInt7934 + i_61_) > (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).aClass572_Sub15_7836.o))) ? ((-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(234493149 * ((Class605) this).anInt7917)])).aClass572_Sub15_7836.o)) - 1095867907 * ((Class605) this).anInt7934) : i_61_);
					}
					if ((i_62_ + ((Class605) this).anInt7934 * 1095867907 > (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838))) && (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838)) >= 0)
						i_62_ = ((1328125509 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7838) - 1095867907 * ((Class605) this).anInt7934);
					method7208((((Class596) (((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, (i_62_ + ((Class605) this).anInt7934 * 1095867907), 874579207);
					((Class605) this).aClass289_7931.method3890(((Class605) this).anObject7918, (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, i_62_, -1255157659);
					((Class605) this).anInt7934 += 547781803 * i_62_;
					i_61_ -= i_62_;
					if ((((Class605) this).anInt7934 * 1095867907 >= (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o))) || ((1095867907 * ((Class605) this).anInt7934 >= (1328125509 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7838)) && (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838) * 1328125509 >= 0)) {
						((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149].method7037(-698765815);
						((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917] = null;
						((Class605) this).anInt7917 += 1904173941;
						((Class605) this).anInt7917 = (((Class605) this).anInt7917 * 234493149 % ((Class605) this).aClass596Array7946.length * 1904173941);
						((Class605) this).anInt7934 = 0;
					}
				}
			}
		}
	}

	int method7217() {
		if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
			Class603 class603 = (Class603) ((Class605) this).anObject7908;
			Interface58 interface58 = class603.method7103(-2024169182);
			return interface58.method332((byte) 109);
		}
		return 0;
	}

	public void method7218() {
		synchronized (this) {
			if (((Class605) this).aBool7953) {
				/* empty */
			} else if (null == ((Class605) this).anObject7918) {
				/* empty */
			} else {
				int i = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1371349501));
				if (i <= 0) {
					/* empty */
				} else if (((Class605) this).aClass596Array7946 != null && ((((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149]) != null) && ((Class605) this).aBool7941) {
					int i_63_ = ((i + ((Class605) this).anInt7934 * 1095867907 > (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053) ? ((((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053 - 1095867907 * ((Class605) this).anInt7934) : i);
					if ((1095867907 * ((Class605) this).anInt7934 < (((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837 * 1719368991)) && (i_63_ + 1095867907 * ((Class605) this).anInt7934 > (1719368991 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7837))) && (1719368991 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7837) >= 0) {
						((Class605) this).anInt7934 += ((1194432437 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837) - 1 * ((Class605) this).anInt7934);
						i_63_ = ((1095867907 * ((Class605) this).anInt7934 + i > (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).aClass572_Sub15_7836.o))) ? ((-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(234493149 * ((Class605) this).anInt7917)])).aClass572_Sub15_7836.o)) - 1095867907 * ((Class605) this).anInt7934) : i);
					}
					if ((i_63_ + ((Class605) this).anInt7934 * 1095867907 > (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838))) && (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838)) >= 0)
						i_63_ = ((1328125509 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7838) - 1095867907 * ((Class605) this).anInt7934);
					method7208((((Class596) (((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, (i_63_ + ((Class605) this).anInt7934 * 1095867907), 1290001198);
					((Class605) this).aClass289_7931.method3890(((Class605) this).anObject7918, (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, i_63_, -1255157659);
					((Class605) this).anInt7934 += 547781803 * i_63_;
					i -= i_63_;
					if ((((Class605) this).anInt7934 * 1095867907 >= (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o))) || ((1095867907 * ((Class605) this).anInt7934 >= (1328125509 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7838)) && (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838) * 1328125509 >= 0)) {
						((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149].method7037(1751020950);
						((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917] = null;
						((Class605) this).anInt7917 += 1904173941;
						((Class605) this).anInt7917 = (((Class605) this).anInt7917 * 234493149 % ((Class605) this).aClass596Array7946.length * 1904173941);
						((Class605) this).anInt7934 = 0;
					}
				}
			}
		}
	}

	void method7219() {
		synchronized (this) {
			int i = method7154(1783441478);
			if (((Class605) this).aBool7950 && i > -1710804233 * ((Class605) this).anInt7938 && ((Class605) this).anInterface32_7930.method157()) {
				/* empty */
			} else {
				Class291 class291 = ((Class605) this).anInterface32_7930.method155();
				if (((Class605) this).aBool7915 && class291 != Class291.aClass291_3444) {
					if (((Class605) this).aByteArray7932 != null) {
						if (-1922297029 * ((Class605) this).anInt7939 >= ((Class605) this).anInt7923 * 529245923) {
							((Class605) this).anInterface32_7930.method108(null);
							((Class605) this).anInt7939 = 0;
						} else {
							if (-1857406735 * ((Class605) this).anInt7914 < -1376458471 * ((Class605) this).anInt7945)
								((Class605) this).anInt7914 = ((Class605) this).anInt7945 * -801475927;
							((Class605) this).anInt7914 = (((((Class605) this).anIntArray7924[(-1922297029 * ((Class605) this).anInt7939)]) + ((Class605) this).anInt7942 * 2011461627) * -1418348527);
							int i_64_ = (((Class605) this).anIntArray7925[(-1922297029 * ((Class605) this).anInt7939)]);
							int i_65_ = i_64_;
							int i_66_ = ((((Class605) this).anInt7942 * 2011461627 + i_65_) > i_64_ ? (((Class605) this).anIntArray7924[-1922297029 * (((Class605) this).anInt7939)]) + i_64_ : (-1857406735 * ((Class605) this).anInt7914 + i_65_));
							Class605 class605_67_ = this;
							((Class605) class605_67_).anInt7942 = (((Class605) class605_67_).anInt7942 + (1329330995 * ((-1857406735 * (((Class605) this).anInt7914) + i_65_ > (((Class605) this).aByteArray7932).length) ? ((((Class605) this).aByteArray7932).length - (-1857406735 * ((Class605) this).anInt7914)) : i_65_)));
							RSByteBuffer class572_sub15 = new RSByteBuffer(i_66_ - (((Class605) this).anInt7914 * -1857406735), true);
							if (null == ((Class605) this).aByteArray7932)
								throw new RuntimeException("");
							if (null == class572_sub15.b)
								throw new RuntimeException("");
							class572_sub15.writeBytes(((Class605) this).aByteArray7932, -1857406735 * ((Class605) this).anInt7914, (i_66_ - -1857406735 * ((Class605) this).anInt7914), (byte) -101);
							((Class605) this).anInterface32_7930.method108(class572_sub15);
							method7177(false, -1363903353);
							if (((Class605) this).anInt7942 * 2011461627 >= i_64_) {
								((Class605) this).anInt7939 += -976007693;
								((Class605) this).anInt7942 = 0;
							}
						}
					} else if (((Class605) this).anInterface69_7927 != null) {
						if (1173051613 * ((Class605) this).anInt7916 >= 529245923 * ((Class605) this).anInt7923) {
							((Class605) this).anInt7916 = 0;
							((Class605) this).anInterface32_7930.method108(null);
						} else {
							byte[] is = (((Class605) this).anInterface69_7927.method429((((Class605) this).anIntArray7926[(((Class605) this).anInt7916 * 1173051613)]), (short) 3553));
							if (is != null) {
								RSByteBuffer class572_sub15 = new RSByteBuffer(is);
								class572_sub15.o = is.length * 310393755;
								((Class605) this).anInterface32_7930.method108(class572_sub15);
								method7177(false, -2085278576);
								((Class605) this).anInt7916 += -793100427;
							}
						}
					}
				}
			}
		}
	}

	void method7220() {
		synchronized (this) {
			int i = method7154(1996897234);
			if (((Class605) this).aBool7950 && i > -1710804233 * ((Class605) this).anInt7938 && ((Class605) this).anInterface32_7930.method157()) {
				/* empty */
			} else {
				Class291 class291 = ((Class605) this).anInterface32_7930.method155();
				if (((Class605) this).aBool7915 && class291 != Class291.aClass291_3444) {
					if (((Class605) this).aByteArray7932 != null) {
						if (-1922297029 * ((Class605) this).anInt7939 >= ((Class605) this).anInt7923 * 529245923) {
							((Class605) this).anInterface32_7930.method108(null);
							((Class605) this).anInt7939 = 0;
						} else {
							if (-1857406735 * ((Class605) this).anInt7914 < -1376458471 * ((Class605) this).anInt7945)
								((Class605) this).anInt7914 = ((Class605) this).anInt7945 * -801475927;
							((Class605) this).anInt7914 = (((((Class605) this).anIntArray7924[(-1922297029 * ((Class605) this).anInt7939)]) + ((Class605) this).anInt7942 * 2011461627) * -1418348527);
							int i_68_ = (((Class605) this).anIntArray7925[(-1922297029 * ((Class605) this).anInt7939)]);
							int i_69_ = i_68_;
							int i_70_ = ((((Class605) this).anInt7942 * 2011461627 + i_69_) > i_68_ ? (((Class605) this).anIntArray7924[-1922297029 * (((Class605) this).anInt7939)]) + i_68_ : (-1857406735 * ((Class605) this).anInt7914 + i_69_));
							Class605 class605_71_ = this;
							((Class605) class605_71_).anInt7942 = (((Class605) class605_71_).anInt7942 + (1329330995 * ((-1857406735 * (((Class605) this).anInt7914) + i_69_ > (((Class605) this).aByteArray7932).length) ? ((((Class605) this).aByteArray7932).length - (-1857406735 * ((Class605) this).anInt7914)) : i_69_)));
							RSByteBuffer class572_sub15 = new RSByteBuffer(i_70_ - (((Class605) this).anInt7914 * -1857406735), true);
							if (null == ((Class605) this).aByteArray7932)
								throw new RuntimeException("");
							if (null == class572_sub15.b)
								throw new RuntimeException("");
							class572_sub15.writeBytes(((Class605) this).aByteArray7932, -1857406735 * ((Class605) this).anInt7914, (i_70_ - -1857406735 * ((Class605) this).anInt7914), (byte) 27);
							((Class605) this).anInterface32_7930.method108(class572_sub15);
							method7177(false, -1448909200);
							if (((Class605) this).anInt7942 * 2011461627 >= i_68_) {
								((Class605) this).anInt7939 += -976007693;
								((Class605) this).anInt7942 = 0;
							}
						}
					} else if (((Class605) this).anInterface69_7927 != null) {
						if (1173051613 * ((Class605) this).anInt7916 >= 529245923 * ((Class605) this).anInt7923) {
							((Class605) this).anInt7916 = 0;
							((Class605) this).anInterface32_7930.method108(null);
						} else {
							byte[] is = (((Class605) this).anInterface69_7927.method429((((Class605) this).anIntArray7926[(((Class605) this).anInt7916 * 1173051613)]), (short) 3553));
							if (is != null) {
								RSByteBuffer class572_sub15 = new RSByteBuffer(is);
								class572_sub15.o = is.length * 310393755;
								((Class605) this).anInterface32_7930.method108(class572_sub15);
								method7177(false, -1771684432);
								((Class605) this).anInt7916 += -793100427;
							}
						}
					}
				}
			}
		}
	}

	void method7221() {
		synchronized (this) {
			if (((Class605) this).anInterface32_7930.method155() == Class291.aClass291_3446) {
				if (((Class605) this).anObject7918 != null) {
					int i = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1994938544));
					if (i >= 1987713419 * ((Class605) this).anInt7936) {
						((Class605) this).aClass289_7931.method3899(((Class605) this).anObject7918, -497866724);
						((Class605) this).anObject7918 = null;
						method7153(Class597.aClass597_7840, 1954195206);
					}
				} else
					method7153(Class597.aClass597_7840, 2076172611);
			}
		}
		method7187(650493536);
	}

	void method7222() {
		synchronized (this) {
			if (((Class605) this).anInterface32_7930.method155() == Class291.aClass291_3446) {
				if (((Class605) this).anObject7918 != null) {
					int i = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1656677330));
					if (i >= 1987713419 * ((Class605) this).anInt7936) {
						((Class605) this).aClass289_7931.method3899(((Class605) this).anObject7918, -497866724);
						((Class605) this).anObject7918 = null;
						method7153(Class597.aClass597_7840, 2012559431);
					}
				} else
					method7153(Class597.aClass597_7840, 2090792613);
			}
		}
		method7187(-824987476);
	}

	void method7223() {
		synchronized (this) {
			if (((Class605) this).anInterface32_7930.method155() == Class291.aClass291_3446) {
				if (((Class605) this).anObject7918 != null) {
					int i = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1589175854));
					if (i >= 1987713419 * ((Class605) this).anInt7936) {
						((Class605) this).aClass289_7931.method3899(((Class605) this).anObject7918, -497866724);
						((Class605) this).anObject7918 = null;
						method7153(Class597.aClass597_7840, 1891948919);
					}
				} else
					method7153(Class597.aClass597_7840, 2087136190);
			}
		}
		method7187(222951225);
	}

	void method7224() {
		if (method7152(-987437988) != Class597.aClass597_7839 && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (174314955 * ((Class597) Class597.aClass597_7842).anInt7848))) {
			method7153(Class597.aClass597_7842, 2025515872);
			((Class605) this).aBool7928 = true;
			method7173(-1740746631);
			method7164((byte) -44);
		}
	}

	void method7225() {
		if (method7152(-987437988) != Class597.aClass597_7839 && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (174314955 * ((Class597) Class597.aClass597_7842).anInt7848))) {
			method7153(Class597.aClass597_7842, 2034476620);
			((Class605) this).aBool7928 = true;
			method7173(-1458934564);
			method7164((byte) -31);
		}
	}

	void method7226() {
		if (true == ((Class605) this).aBool7928 && (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7842).anInt7848) && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7846).anInt7848 * 174314955) && null != ((Class605) this).anInterface70_7933 && ((Class605) this).aFloat7911 == ((Class605) this).aFloat7905)
			((Class605) this).anInterface70_7933.method430((((Class605) this).anObject7908), (((Class605) this).aFloatArray7907), null, 2004314185);
	}

	public void method7227() {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7841).anInt7848)
			throw new RuntimeException("");
		method7153(Class597.aClass597_7841, 2064540279);
	}

	RSByteBuffer method7228(int i, int i_72_) {
		return ((Class605) this).anInterface32_7930.method161(i);
	}

	void method7229() {
		if (true == ((Class605) this).aBool7928 && (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7842).anInt7848) && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7846).anInt7848 * 174314955) && null != ((Class605) this).anInterface70_7933 && ((Class605) this).aFloat7911 == ((Class605) this).aFloat7905)
			((Class605) this).anInterface70_7933.method430((((Class605) this).anObject7908), (((Class605) this).aFloatArray7907), null, 2127047502);
	}

	public void method7230(int i) {
		if ((((Class597) method7152(-987437988)).anInt7848 * 174314955 >= 174314955 * ((Class597) Class597.aClass597_7842).anInt7848) && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < ((Class597) Class597.aClass597_7839).anInt7848 * 174314955) && method7163(1503025475)) {
			synchronized (this) {
				((Class605) this).anInterface32_7930.method103();
				method7176((short) 17985);
			}
			Thread.yield();
		}
	}

	void method7231() {
		((Class605) this).aBool7953 = true;
	}

	boolean method7232(byte i) {
		return Class597.aClass597_7839 == ((Class605) this).aClass597_7929;
	}

	void method7233() {
		((Class605) this).aBool7953 = false;
	}

	void method7234() {
		if (((Class605) this).aClass596Array7946 != null) {
			boolean bool = true;
			Class291 class291 = ((Class605) this).anInterface32_7930.method155();
			if (((Class605) this).anInterface32_7930.method157()) {
				if (((Class605) this).aBool7950 && method7202(((Class605) this).anInt7938 * -1710804233, 1662366182)) {
					if ((((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867]) == null) {
						RSByteBuffer class572_sub15 = method7198((-1710804233 * ((Class605) this).anInt7938), 1237298672);
						if (null != class572_sub15) {
							((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867] = new Class596(this, class572_sub15, false);
							int i = ((Class605) this).anInterface32_7930.method159();
							int i_73_ = (((Class605) this).anInterface32_7930.method196(-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(92327867 * ((Class605) this).anInt7940)])).aClass572_Sub15_7836.o) / i));
							((Class605) this).anInt7909 += i_73_ * -485583281;
							if (false == ((Class605) this).aBool7951 && ((Class605) this).aBool7952 && (((Class605) this).anInt7944 * -1370058817 > 0)) {
								if (((Class605) this).anInt7909 * -604716881 < ((Class605) this).anInt7919 * 1824090791)
									((Class605) this).aClass596Array7946[(92327867 * ((Class605) this).anInt7940)] = null;
								else if (((((Class605) this).anInt7909 * -604716881) >= (1824090791 * ((Class605) this).anInt7919)) && ((((Class605) this).anInt7909 * -604716881) - i_73_ < 1824090791 * (((Class605) this).anInt7919)))
									((Class596) (((Class605) this).aClass596Array7946[92327867 * (((Class605) this).anInt7940)])).anInt7837 = ((((Class605) this).anInterface32_7930.method163(((((Class605) this).anInt7909 * -604716881) - (((Class605) this).anInt7919 * 1824090791)) * i)) * -1454391585);
							}
							((Class605) this).anInt7938 += 301543111;
							if (!((Class605) this).aBool7951 && ((Class605) this).aBool7952 && (((Class605) this).anInt7909 * -604716881 >= (((Class605) this).anInt7920 * 1297142633)) && ((-1370058817 * ((Class605) this).anInt7944 < (1337357325 * ((Class605) this).anInt7912)) || (((Class605) this).anInt7912 * 1337357325) < 0)) {
								int i_74_ = (((Class605) this).anInt7909 * -604716881 - (((Class605) this).anInt7920 * 1297142633));
								int i_75_ = i_73_ - i_74_;
								((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7940 * 92327867)])).anInt7838 = ((Class605) this).anInterface32_7930.method163(i * i_75_) * -97973107;
								((Class605) this).anInt7938 = 0;
								((Class605) this).anInt7909 = 0;
								((Class605) this).anInt7944 += 804610111;
							}
							if ((((Class605) this).aClass596Array7946[92327867 * ((Class605) this).anInt7940]) != null) {
								((Class605) this).anInt7940 += -488137357;
								((Class605) this).anInt7940 = (((Class605) this).anInt7940 * 92327867 % (((Class605) this).aClass596Array7946).length * -488137357);
							}
						}
					}
				} else if (!method7184((byte) -7) || !((Class605) this).aBool7950) {
					int i = ((Class605) this).anInterface32_7930.method55();
					int i_76_ = (((Class605) this).anInterface32_7930.method196(((Class605) this).anInt7936 * 1987713419));
					if (false == ((Class605) this).aBool7935 && ((((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867]) == null)) {
						if (class291 != Class291.aClass291_3440 && i > 0) {
							RSByteBuffer class572_sub15 = method7228(i_76_, -1429361831);
							((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867] = (null != class572_sub15 ? new Class596(this, class572_sub15, false) : null);
							int i_77_ = (null != (((Class605) this).aClass596Array7946[(((Class605) this).anInt7940 * 92327867)]) ? (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(92327867 * ((Class605) this).anInt7940)])).aClass572_Sub15_7836.o)) : 0);
							int i_78_ = ((Class605) this).anInterface32_7930.method159();
							int i_79_ = ((Class605) this).anInterface32_7930.method196(i_77_ / i_78_);
							((Class605) this).anInt7937 += i_79_ * 657716793;
							if (((Class605) this).anInt7937 * -389081079 > ((Class605) this).anInt7909 * -604716881) {
								((Class605) this).anInt7909 += i_79_ * -485583281;
								i -= i_79_;
								if (!((Class605) this).aBool7951 && ((Class605) this).aBool7952 && (-1370058817 * ((Class605) this).anInt7944) > 0) {
									if ((-604716881 * ((Class605) this).anInt7909) < (1824090791 * ((Class605) this).anInt7919))
										((Class605) this).aClass596Array7946[(((Class605) this).anInt7940 * 92327867)] = null;
									else if (((((Class605) this).anInt7909 * -604716881) >= (((Class605) this).anInt7919 * 1824090791)) && ((((Class605) this).anInt7909 * -604716881) - i_79_ < (1824090791 * (((Class605) this).anInt7919))))
										((Class596) (((Class605) this).aClass596Array7946[92327867 * (((Class605) this).anInt7940)])).anInt7837 = ((((Class605) this).anInterface32_7930.method163(i_78_ * ((-604716881 * (((Class605) this).anInt7909)) - (1824090791 * (((Class605) this).anInt7919))))) * -1454391585);
								}
								if ((((Class605) this).aClass596Array7946[((Class605) this).anInt7940 * 92327867]) != null) {
									if (((Class605) this).aBool7950 && !method7202(((((Class605) this).anInt7938) * -1710804233), 1662366182))
										method7181((((Class596) (((Class605) this).aClass596Array7946[(92327867 * (((Class605) this).anInt7940))])).aClass572_Sub15_7836), 2102750629);
									if (!((Class605) this).aBool7951 && ((Class605) this).aBool7952 && ((((Class605) this).anInt7909 * -604716881) >= (((Class605) this).anInt7920 * 1297142633)) && (((-1370058817 * ((Class605) this).anInt7944) <= (((Class605) this).anInt7912 * 1337357325)) || ((1337357325 * ((Class605) this).anInt7912) < 0))) {
										int i_80_ = ((-604716881 * ((Class605) this).anInt7909) - (((Class605) this).anInt7920 * 1297142633));
										int i_81_ = i_79_ - i_80_;
										((Class596) (((Class605) this).aClass596Array7946[92327867 * (((Class605) this).anInt7940)])).anInt7838 = (((Class605) this).anInterface32_7930.method163(i_78_ * i_81_) * -97973107);
										((Class605) this).anInt7938 = 0;
										((Class605) this).anInt7944 += 804610111;
										((Class605) this).anInt7909 = 0;
									} else
										((Class605) this).anInt7938 += 301543111;
									((Class605) this).anInt7940 += -488137357;
									((Class605) this).anInt7940 = (-488137357 * (92327867 * ((Class605) this).anInt7940 % (((Class605) this).aClass596Array7946).length));
								}
							} else
								((Class605) this).aClass596Array7946[92327867 * ((Class605) this).anInt7940] = null;
						} else if (class291 == Class291.aClass291_3440 && ((Class605) this).aBool7952 && false == ((Class605) this).aBool7951 && (((((Class605) this).anInt7944 * -1370058817) < (((Class605) this).anInt7912 * 1337357325)) || (((Class605) this).anInt7912 * 1337357325) < 0))
							((Class605) this).anInterface32_7930.method165(true);
					}
				}
			}
			int i = 0;
			for (int i_82_ = 0; i_82_ < ((Class605) this).aClass596Array7946.length; i_82_++) {
				if (null != ((Class605) this).aClass596Array7946[i_82_]) {
					i++;
					bool = false;
				}
			}
			if (!((Class605) this).aBool7941 && method7237((byte) 121) >= 0.0F && (i >= 583029877 * ((Class605) this).anInt7913 || class291 == Class291.aClass291_3440 || Class291.aClass291_3444 == class291)) {
				((Class605) this).aBool7941 = true;
				method7153(Class597.aClass597_7844, 2086950801);
			}
			if (((Class605) this).anInterface32_7930.method157() && bool && (method7184((byte) -34) || ((Class605) this).aBool7935 || class291 == Class291.aClass291_3440) && (false == ((Class605) this).aBool7952 || (false == ((Class605) this).aBool7951 && (-1370058817 * ((Class605) this).anInt7944 >= 1337357325 * ((Class605) this).anInt7912) && 1337357325 * ((Class605) this).anInt7912 >= 0))) {
				method7153(Class597.aClass597_7846, 2024873397);
				((Class605) this).aBool7928 = false;
				if (((Class605) this).aBool7950)
					method7175((byte) 4);
			}
		}
	}

	void method7235() {
		if (((Class597) method7152(-987437988)).anInt7848 * 174314955 >= ((Class597) Class597.aClass597_7842).anInt7848 * 174314955) {
			if (method7152(-987437988) == Class597.aClass597_7847)
				method7171(-1642113685);
			else {
				method7170((short) -8674);
				if (((Class605) this).aFloat7905 != ((Class605) this).aFloat7911) {
					long l = Class69.method1067(-1657502994);
					if (l > ((Class605) this).aLong7949 * 4985271299030581401L)
						((Class605) this).aFloat7905 = ((Class605) this).aFloat7911;
					else {
						float f = (((Class605) this).aFloat7911 - ((Class605) this).aFloat7948);
						long l_83_ = ((((Class605) this).aLong7949 * 4985271299030581401L) - (((Class605) this).aLong7947 * 6973596618006109309L));
						float f_84_ = f / (float) l_83_;
						((Class605) this).aFloat7905 = (((Class605) this).aFloat7948 + f_84_ * (float) (l - (6973596618006109309L * (((Class605) this).aLong7947))));
						((Class605) this).aFloat7905 = Math.max(0.0F, Math.min(1.0F, ((Class605) this).aFloat7905));
					}
				}
				method7164((byte) -116);
				if (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (((Class597) Class597.aClass597_7839).anInt7848 * 174314955))
					method7173(-1653055369);
			}
		}
	}

	float method7236(int i) {
		return ((Class605) this).aFloat7905;
	}

	public float method7237(byte i) {
		return ((Class605) this).aFloat7943;
	}

	void method7238() {
		if (method7152(-987437988) != Class597.aClass597_7839 && (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (174314955 * ((Class597) Class597.aClass597_7842).anInt7848))) {
			method7153(Class597.aClass597_7842, 2147204348);
			((Class605) this).aBool7928 = true;
			method7173(-1438723061);
			method7164((byte) -27);
		}
	}

	boolean method7239(int i) {
		return ((Class605) this).aClass597_7929 == Class597.aClass597_7846;
	}

	public void method7240() {
		synchronized (this) {
			if (((Class605) this).aBool7953) {
				/* empty */
			} else if (null == ((Class605) this).anObject7918) {
				/* empty */
			} else {
				int i = (((Class605) this).aClass289_7931.method3886(((Class605) this).anObject7918, 1887726652));
				if (i <= 0) {
					/* empty */
				} else if (((Class605) this).aClass596Array7946 != null && ((((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149]) != null) && ((Class605) this).aBool7941) {
					int i_85_ = ((i + ((Class605) this).anInt7934 * 1095867907 > (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053) ? ((((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o) * -1585139053 - 1095867907 * ((Class605) this).anInt7934) : i);
					if ((1095867907 * ((Class605) this).anInt7934 < (((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837 * 1719368991)) && (i_85_ + 1095867907 * ((Class605) this).anInt7934 > (1719368991 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7837))) && (1719368991 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7837) >= 0) {
						((Class605) this).anInt7934 += ((1194432437 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7837) - 1 * ((Class605) this).anInt7934);
						i_85_ = ((1095867907 * ((Class605) this).anInt7934 + i > (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).aClass572_Sub15_7836.o))) ? ((-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[(234493149 * ((Class605) this).anInt7917)])).aClass572_Sub15_7836.o)) - 1095867907 * ((Class605) this).anInt7934) : i);
					}
					if ((i_85_ + ((Class605) this).anInt7934 * 1095867907 > (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838))) && (1328125509 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838)) >= 0)
						i_85_ = ((1328125509 * ((Class596) (((Class605) this).aClass596Array7946[234493149 * (((Class605) this).anInt7917)])).anInt7838) - 1095867907 * ((Class605) this).anInt7934);
					method7208((((Class596) (((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, (i_85_ + ((Class605) this).anInt7934 * 1095867907), -1406743294);
					((Class605) this).aClass289_7931.method3890(((Class605) this).anObject7918, (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.b), ((Class605) this).anInt7934 * 1095867907, i_85_, -1255157659);
					((Class605) this).anInt7934 += 547781803 * i_85_;
					i -= i_85_;
					if ((((Class605) this).anInt7934 * 1095867907 >= (-1585139053 * (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).aClass572_Sub15_7836.o))) || ((1095867907 * ((Class605) this).anInt7934 >= (1328125509 * ((Class596) (((Class605) this).aClass596Array7946[(((Class605) this).anInt7917 * 234493149)])).anInt7838)) && (((Class596) (((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917])).anInt7838) * 1328125509 >= 0)) {
						((Class605) this).aClass596Array7946[((Class605) this).anInt7917 * 234493149].method7037(-1325026140);
						((Class605) this).aClass596Array7946[234493149 * ((Class605) this).anInt7917] = null;
						((Class605) this).anInt7917 += 1904173941;
						((Class605) this).anInt7917 = (((Class605) this).anInt7917 * 234493149 % ((Class605) this).aClass596Array7946.length * 1904173941);
						((Class605) this).anInt7934 = 0;
					}
				}
			}
		}
	}

	void method7241() {
		synchronized (this) {
			int i = method7154(1903762538);
			if (((Class605) this).aBool7950 && i > -1710804233 * ((Class605) this).anInt7938 && ((Class605) this).anInterface32_7930.method157()) {
				/* empty */
			} else {
				Class291 class291 = ((Class605) this).anInterface32_7930.method155();
				if (((Class605) this).aBool7915 && class291 != Class291.aClass291_3444) {
					if (((Class605) this).aByteArray7932 != null) {
						if (-1922297029 * ((Class605) this).anInt7939 >= ((Class605) this).anInt7923 * 529245923) {
							((Class605) this).anInterface32_7930.method108(null);
							((Class605) this).anInt7939 = 0;
						} else {
							if (-1857406735 * ((Class605) this).anInt7914 < -1376458471 * ((Class605) this).anInt7945)
								((Class605) this).anInt7914 = ((Class605) this).anInt7945 * -801475927;
							((Class605) this).anInt7914 = (((((Class605) this).anIntArray7924[(-1922297029 * ((Class605) this).anInt7939)]) + ((Class605) this).anInt7942 * 2011461627) * -1418348527);
							int i_86_ = (((Class605) this).anIntArray7925[(-1922297029 * ((Class605) this).anInt7939)]);
							int i_87_ = i_86_;
							int i_88_ = ((((Class605) this).anInt7942 * 2011461627 + i_87_) > i_86_ ? (((Class605) this).anIntArray7924[-1922297029 * (((Class605) this).anInt7939)]) + i_86_ : (-1857406735 * ((Class605) this).anInt7914 + i_87_));
							Class605 class605_89_ = this;
							((Class605) class605_89_).anInt7942 = (((Class605) class605_89_).anInt7942 + (1329330995 * ((-1857406735 * (((Class605) this).anInt7914) + i_87_ > (((Class605) this).aByteArray7932).length) ? ((((Class605) this).aByteArray7932).length - (-1857406735 * ((Class605) this).anInt7914)) : i_87_)));
							RSByteBuffer class572_sub15 = new RSByteBuffer(i_88_ - (((Class605) this).anInt7914 * -1857406735), true);
							if (null == ((Class605) this).aByteArray7932)
								throw new RuntimeException("");
							if (null == class572_sub15.b)
								throw new RuntimeException("");
							class572_sub15.writeBytes(((Class605) this).aByteArray7932, -1857406735 * ((Class605) this).anInt7914, (i_88_ - -1857406735 * ((Class605) this).anInt7914), (byte) 12);
							((Class605) this).anInterface32_7930.method108(class572_sub15);
							method7177(false, -1553052689);
							if (((Class605) this).anInt7942 * 2011461627 >= i_86_) {
								((Class605) this).anInt7939 += -976007693;
								((Class605) this).anInt7942 = 0;
							}
						}
					} else if (((Class605) this).anInterface69_7927 != null) {
						if (1173051613 * ((Class605) this).anInt7916 >= 529245923 * ((Class605) this).anInt7923) {
							((Class605) this).anInt7916 = 0;
							((Class605) this).anInterface32_7930.method108(null);
						} else {
							byte[] is = (((Class605) this).anInterface69_7927.method429((((Class605) this).anIntArray7926[(((Class605) this).anInt7916 * 1173051613)]), (short) 3553));
							if (is != null) {
								RSByteBuffer class572_sub15 = new RSByteBuffer(is);
								class572_sub15.o = is.length * 310393755;
								((Class605) this).anInterface32_7930.method108(class572_sub15);
								method7177(false, -1761564844);
								((Class605) this).anInt7916 += -793100427;
							}
						}
					}
				}
			}
		}
	}

	int method7242() {
		if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
			Class603 class603 = (Class603) ((Class605) this).anObject7908;
			Interface58 interface58 = class603.method7103(1045621756);
			return interface58.method332((byte) 68);
		}
		return 0;
	}

	boolean method7243() {
		synchronized (this) {
			if (((Class605) this).anObject7908 != null && ((Class605) this).anObject7908 instanceof Class603) {
				Class603 class603 = (Class603) ((Class605) this).anObject7908;
				Interface58 interface58 = class603.method7103(-239853294);
				if (interface58 != null) {
					boolean bool = interface58.method334((short) 8192);
					return bool;
				}
			}
			boolean bool = false;
			return bool;
		}
	}

	public boolean method7244(byte i) {
		return ((Class605) this).aBool7910;
	}

	boolean method7245() {
		if (null == ((Class605) this).aFloatArray7907)
			return false;
		float f = 0.0F;
		float f_90_ = 0.0F;
		for (int i = 0; i < ((Class605) this).aFloatArray7907.length; i++) {
			float f_91_ = ((Class605) this).aFloatArray7907[i];
			if (f_91_ * ((Class605) this).aFloat7905 > f)
				f = f_91_;
			if (f_91_ > f_90_)
				f_90_ = f_91_;
		}
		if (f < 1.0E-5F) {
			if (f_90_ >= 1.0E-5F && ((Class605) this).aFloat7911 >= 1.0E-5F)
				return true;
			return false;
		}
		return true;
	}

	public void method7246() {
		synchronized (this) {
			if (method7152(-987437988) == Class597.aClass597_7839 || (((Class597) method7152(-987437988)).anInt7848 * 174314955 < (((Class597) Class597.aClass597_7841).anInt7848 * 174314955))) {
				/* empty */
			} else
				method7153(Class597.aClass597_7839, 1983414862);
		}
	}

	void method7247() {
		((Class605) this).aBool7953 = true;
	}

	void method7248() {
		synchronized (this) {
			((Class605) this).aByteArray7932 = null;
			((Class605) this).anInt7904 = 0;
			((Class605) this).aFloat7905 = 0.0F;
			((Class605) this).aFloat7906 = 0.0F;
			((Class605) this).aBool7952 = false;
			((Class605) this).anInt7912 = 0;
			((Class605) this).aFloat7903 = 1.0F;
			((Class605) this).anInterface69_7927 = null;
			((Class605) this).anInt7916 = 0;
			((Class605) this).anInt7914 = 0;
			if (((Class605) this).aClass596Array7946 != null) {
				for (int i = 0; i < ((Class605) this).aClass596Array7946.length; i++) {
					if (((Class605) this).aClass596Array7946[i] != null)
						((Class605) this).aClass596Array7946[i].method7037(-1524269026);
				}
			}
			((Class605) this).aClass596Array7946 = null;
			((Class605) this).aBool7950 = false;
			((Class605) this).anInt7917 = 0;
			((Class605) this).anInt7919 = 0;
			((Class605) this).anInt7920 = 0;
			((Class605) this).anInt7921 = 0;
			((Class605) this).anInt7922 = 0;
			((Class605) this).anInt7923 = 0;
			((Class605) this).anIntArray7924 = null;
			((Class605) this).anIntArray7925 = null;
			((Class605) this).anIntArray7926 = null;
			((Class605) this).anInt7945 = 0;
			((Class605) this).aBool7928 = false;
			((Class605) this).anInterface32_7930.method151();
			((Class605) this).aBool7915 = false;
			((Class605) this).anInterface70_7933 = null;
			((Class605) this).anObject7908 = null;
			((Class605) this).anInt7934 = 0;
			((Class605) this).anInt7909 = 0;
			((Class605) this).anInt7937 = 0;
			((Class605) this).aBool7935 = false;
			((Class605) this).anInt7939 = 0;
			((Class605) this).anInt7940 = 0;
			((Class605) this).aBool7941 = false;
			((Class605) this).anInt7942 = 0;
			method7166(-1.0F, -485456598);
			((Class605) this).aBool7910 = false;
			((Class605) this).aFloat7911 = 0.0F;
			((Class605) this).aLong7949 = 0L;
			((Class605) this).aLong7947 = 0L;
			((Class605) this).aFloat7948 = 0.0F;
			((Class605) this).anInt7938 = 0;
			((Class605) this).anInt7944 = 0;
		}
	}
}

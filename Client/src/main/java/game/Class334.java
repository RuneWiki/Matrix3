package game;

/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class334 {
	public boolean aBool4257;
	public boolean[] aBoolArray4258;
	boolean aBool4259;
	static final int anInt4260 = 6;
	static final byte aByte4261 = 0;
	public String aString4262;
	int anInt4263;
	public String[] aStringArray4264;
	int anInt4265 = 0;
	boolean aBool4266;
	public byte aByte4267;
	long aLong4268;
	public int anInt4269;
	long[] aLongArray4270;
	public byte[] aByteArray4271;
	int[] anIntArray4272;
	int[] anIntArray4273;
	public int[] anIntArray4274;
	static final byte aByte4275 = 127;
	public byte aByte4276;
	public byte aByte4277;
	public int anInt4278;
	long[] aLongArray4279;
	public int anInt4280;
	public String[] aStringArray4281;
	Class676 aClass676_4282;
	public int anInt4283;
	static final byte aByte4284 = 126;
	static final byte aByte4285 = 125;
	public byte aByte4286;
	public static final byte aByte4287 = -1;

	void method4186(int i, int i_0_) {
		if (((Class334) this).aBool4266) {
			if (((Class334) this).aLongArray4279 != null)
				System.arraycopy(((Class334) this).aLongArray4279, 0, (((Class334) this).aLongArray4279 = new long[i]), 0, anInt4278 * -1450736271);
			else
				((Class334) this).aLongArray4279 = new long[i];
		}
		if (((Class334) this).aBool4259) {
			if (null != aStringArray4281)
				System.arraycopy(aStringArray4281, 0, aStringArray4281 = new String[i], 0, anInt4278 * -1450736271);
			else
				aStringArray4281 = new String[i];
		}
	}

	public int method4187(int i, int i_1_, int i_2_, byte i_3_) {
		int i_4_ = i_2_ == 31 ? -1 : (1 << 1 + i_2_) - 1;
		return (((Class334) this).anIntArray4273[i] & i_4_) >>> i_1_;
	}

	public Long method4188(int i, short i_5_) {
		if (null == ((Class334) this).aClass676_4282)
			return null;
		Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
		if (null == class572 || !(class572 instanceof Class572_Sub2))
			return null;
		return new Long(3148940942659989019L * ((Class572_Sub2) class572).aLong8968);
	}

	void method4189(int i, int i_6_) {
		if (((Class334) this).aBool4266) {
			if (null != ((Class334) this).aLongArray4270)
				System.arraycopy(((Class334) this).aLongArray4270, 0, (((Class334) this).aLongArray4270 = new long[i]), 0, anInt4269 * -455995945);
			else
				((Class334) this).aLongArray4270 = new long[i];
		}
		if (((Class334) this).aBool4259) {
			if (null != aStringArray4264)
				System.arraycopy(aStringArray4264, 0, aStringArray4264 = new String[i], 0, -455995945 * anInt4269);
			else
				aStringArray4264 = new String[i];
		}
		if (aByteArray4271 != null)
			System.arraycopy(aByteArray4271, 0, aByteArray4271 = new byte[i], 0, -455995945 * anInt4269);
		else
			aByteArray4271 = new byte[i];
		if (null != ((Class334) this).anIntArray4273)
			System.arraycopy(((Class334) this).anIntArray4273, 0, ((Class334) this).anIntArray4273 = new int[i], 0, anInt4269 * -455995945);
		else
			((Class334) this).anIntArray4273 = new int[i];
		if (null != anIntArray4274)
			System.arraycopy(anIntArray4274, 0, anIntArray4274 = new int[i], 0, anInt4269 * -455995945);
		else
			anIntArray4274 = new int[i];
		if (aBoolArray4258 != null)
			System.arraycopy(aBoolArray4258, 0, aBoolArray4258 = new boolean[i], 0, -455995945 * anInt4269);
		else
			aBoolArray4258 = new boolean[i];
	}

	void method4190(long l, String string, int i, int i_7_) {
		if (null != string && string.length() == 0)
			string = null;
		if (((Class334) this).aBool4266 != l > 0L)
			throw new RuntimeException("");
		if (((Class334) this).aBool4259 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (null == ((Class334) this).aLongArray4270 || (anInt4269 * -455995945 >= ((Class334) this).aLongArray4270.length)) || (null != string && (aStringArray4264 == null || anInt4269 * -455995945 >= aStringArray4264.length)))
			method4189(anInt4269 * -455995945 + 5, 64476441);
		if (((Class334) this).aLongArray4270 != null)
			((Class334) this).aLongArray4270[-455995945 * anInt4269] = l;
		if (aStringArray4264 != null)
			aStringArray4264[anInt4269 * -455995945] = string;
		if (anInt4280 * -202636503 == -1) {
			anInt4280 = -228022017 * anInt4269;
			aByteArray4271[-455995945 * anInt4269] = (byte) 126;
		} else
			aByteArray4271[anInt4269 * -455995945] = (byte) 0;
		((Class334) this).anIntArray4273[anInt4269 * -455995945] = 0;
		anIntArray4274[anInt4269 * -455995945] = i;
		aBoolArray4258[-455995945 * anInt4269] = false;
		anInt4269 += 539506151;
		((Class334) this).anIntArray4272 = null;
	}

	void method4191(int i, int i_8_) {
		if (i < 0 || i >= anInt4269 * -455995945)
			throw new RuntimeException("");
		anInt4269 -= 539506151;
		((Class334) this).anIntArray4272 = null;
		if (anInt4269 * -455995945 == 0) {
			((Class334) this).aLongArray4270 = null;
			aStringArray4264 = null;
			aByteArray4271 = null;
			((Class334) this).anIntArray4273 = null;
			anIntArray4274 = null;
			aBoolArray4258 = null;
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
		} else {
			System.arraycopy(aByteArray4271, 1 + i, aByteArray4271, i, -455995945 * anInt4269 - i);
			System.arraycopy(((Class334) this).anIntArray4273, i + 1, ((Class334) this).anIntArray4273, i, -455995945 * anInt4269 - i);
			System.arraycopy(anIntArray4274, i + 1, anIntArray4274, i, anInt4269 * -455995945 - i);
			System.arraycopy(aBoolArray4258, i + 1, aBoolArray4258, i, -455995945 * anInt4269 - i);
			if (((Class334) this).aLongArray4270 != null)
				System.arraycopy(((Class334) this).aLongArray4270, i + 1, ((Class334) this).aLongArray4270, i, anInt4269 * -455995945 - i);
			if (null != aStringArray4264)
				System.arraycopy(aStringArray4264, i + 1, aStringArray4264, i, anInt4269 * -455995945 - i);
			method4192(-921928721);
		}
	}

	void method4192(int i) {
		if (-455995945 * anInt4269 == 0) {
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
		} else {
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
			int i_9_ = 0;
			byte i_10_ = aByteArray4271[0];
			for (int i_11_ = 1; i_11_ < -455995945 * anInt4269; i_11_++) {
				if (aByteArray4271[i_11_] > i_10_) {
					if (i_10_ == 125)
						anInt4283 = -1989474943 * i_9_;
					i_9_ = i_11_;
					i_10_ = aByteArray4271[i_11_];
				} else if (961755777 * anInt4283 == -1 && 125 == aByteArray4271[i_11_])
					anInt4283 = i_11_ * -1989474943;
			}
			anInt4280 = i_9_ * -1354413799;
			if (-1 != -202636503 * anInt4280)
				aByteArray4271[anInt4280 * -202636503] = (byte) 126;
		}
	}

	void method4193(int i, byte i_12_) {
		anInt4278 -= -225272943;
		if (0 == -1450736271 * anInt4278) {
			((Class334) this).aLongArray4279 = null;
			aStringArray4281 = null;
		} else {
			if (null != ((Class334) this).aLongArray4279)
				System.arraycopy(((Class334) this).aLongArray4279, 1 + i, ((Class334) this).aLongArray4279, i, anInt4278 * -1450736271 - i);
			if (null != aStringArray4281)
				System.arraycopy(aStringArray4281, 1 + i, aStringArray4281, i, -1450736271 * anInt4278 - i);
		}
	}

	int method4194(int i, boolean bool, int i_13_) {
		if (aBoolArray4258[i] == bool)
			return -1;
		aBoolArray4258[i] = bool;
		return i;
	}

	int method4195(int i, int i_14_, int i_15_, int i_16_, int i_17_) {
		int i_18_ = (1 << i_15_) - 1;
		int i_19_ = i_16_ == 31 ? -1 : (1 << i_16_ + 1) - 1;
		int i_20_ = i_19_ ^ i_18_;
		i_14_ <<= i_15_;
		i_14_ &= i_20_;
		int i_21_ = ((Class334) this).anIntArray4273[i];
		if ((i_21_ & i_20_) == i_14_)
			return -1;
		i_21_ &= i_20_ ^ 0xffffffff;
		((Class334) this).anIntArray4273[i] = i_21_ | i_14_;
		return i;
	}

	boolean method4196(int i, int i_22_, byte i_23_) {
		if (null != ((Class334) this).aClass676_4282) {
			Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
			if (class572 != null) {
				if (class572 instanceof LinkableInt) {
					LinkableInt class572_sub26 = (LinkableInt) class572;
					if (i_22_ == -1945426987 * class572_sub26.anInt9258)
						return false;
					class572_sub26.anInt9258 = -863044227 * i_22_;
					return true;
				}
				class572.method6794((byte) 53);
			}
		} else
			((Class334) this).aClass676_4282 = new Class676(4);
		((Class334) this).aClass676_4282.put(new LinkableInt(i_22_), (long) i);
		return true;
	}

	boolean method4197(int i, int i_24_, int i_25_, int i_26_, int i_27_) {
		int i_28_ = (1 << i_25_) - 1;
		int i_29_ = i_26_ == 31 ? -1 : (1 << i_26_ + 1) - 1;
		int i_30_ = i_29_ ^ i_28_;
		i_24_ <<= i_25_;
		i_24_ &= i_30_;
		if (((Class334) this).aClass676_4282 != null) {
			Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
			if (class572 != null) {
				if (class572 instanceof LinkableInt) {
					LinkableInt class572_sub26 = (LinkableInt) class572;
					if ((-1945426987 * class572_sub26.anInt9258 & i_30_) == i_24_)
						return false;
					LinkableInt class572_sub26_31_;
					(class572_sub26_31_ = class572_sub26).anInt9258 = (class572_sub26_31_.anInt9258 * -1945426987 & (i_30_ ^ 0xffffffff)) * -863044227;
					LinkableInt class572_sub26_32_;
					(class572_sub26_32_ = class572_sub26).anInt9258 = (-863044227 * (-1945426987 * class572_sub26_32_.anInt9258 | i_24_));
					return true;
				}
				class572.method6794((byte) 18);
			}
		} else
			((Class334) this).aClass676_4282 = new Class676(4);
		((Class334) this).aClass676_4282.put(new LinkableInt(i_24_), (long) i);
		return true;
	}

	boolean method4198(int i, long l) {
		if (((Class334) this).aClass676_4282 != null) {
			Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
			if (null != class572) {
				if (class572 instanceof Class572_Sub2) {
					Class572_Sub2 class572_sub2 = (Class572_Sub2) class572;
					if (3148940942659989019L * class572_sub2.aLong8968 == l)
						return false;
					class572_sub2.aLong8968 = -3051605443725198317L * l;
					return true;
				}
				class572.method6794((byte) -7);
			}
		} else
			((Class334) this).aClass676_4282 = new Class676(4);
		((Class334) this).aClass676_4282.put(new Class572_Sub2(l), (long) i);
		return true;
	}

	boolean method4199(int i, String string, int i_33_) {
		if (null == string)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (null != ((Class334) this).aClass676_4282) {
			Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
			if (null != class572) {
				if (class572 instanceof LinkableObject) {
					LinkableObject class572_sub9 = (LinkableObject) class572;
					if (class572_sub9.anObject9081 instanceof String) {
						if (string.equals(class572_sub9.anObject9081))
							return false;
						class572_sub9.method6794((byte) -30);
						((Class334) this).aClass676_4282.put(new LinkableObject(string), 381237825124074065L * class572_sub9.hash);
						return true;
					}
				}
				class572.method6794((byte) 9);
			}
		} else
			((Class334) this).aClass676_4282 = new Class676(4);
		((Class334) this).aClass676_4282.put(new LinkableObject(string), (long) i);
		return true;
	}

	void method4200(RSByteBuffer class572_sub15, int i) {
		int i_34_ = class572_sub15.readUnsignedByte(2009278544);
		if (i_34_ < 1 || i_34_ > 6)
			throw new RuntimeException(new StringBuilder().append("").append(i_34_).toString());
		int i_35_ = class572_sub15.readUnsignedByte(72062520);
		if (0 != (i_35_ & 0x1))
			((Class334) this).aBool4266 = true;
		if ((i_35_ & 0x2) != 0)
			((Class334) this).aBool4259 = true;
		if (!((Class334) this).aBool4266) {
			((Class334) this).aLongArray4270 = null;
			((Class334) this).aLongArray4279 = null;
		}
		if (!((Class334) this).aBool4259) {
			aStringArray4264 = null;
			aStringArray4281 = null;
		}
		((Class334) this).anInt4265 = class572_sub15.readInt(1431797483) * -1030257229;
		((Class334) this).anInt4263 = class572_sub15.readInt(1251570523) * -1087360121;
		if (i_34_ <= 3 && 0 != -116710857 * ((Class334) this).anInt4263)
			((Class334) this).anInt4263 += -1617286304;
		anInt4269 = class572_sub15.readUnsignedShort(647518597) * 539506151;
		anInt4278 = class572_sub15.readUnsignedByte(1087003387) * -225272943;
		aString4262 = class572_sub15.readString(1295706626);
		if (i_34_ >= 4)
			class572_sub15.readInt(-516276609);
		aBool4257 = class572_sub15.readUnsignedByte(128203779) == 1;
		aByte4277 = class572_sub15.readByte(1627006423);
		aByte4276 = class572_sub15.readByte(1161900213);
		aByte4267 = class572_sub15.readByte(1025395860);
		aByte4286 = class572_sub15.readByte(297185855);
		if (anInt4269 * -455995945 > 0) {
			if (((Class334) this).aBool4266 && (null == ((Class334) this).aLongArray4270 || (((Class334) this).aLongArray4270.length < -455995945 * anInt4269)))
				((Class334) this).aLongArray4270 = new long[-455995945 * anInt4269];
			if (((Class334) this).aBool4259 && (aStringArray4264 == null || aStringArray4264.length < anInt4269 * -455995945))
				aStringArray4264 = new String[-455995945 * anInt4269];
			if (aByteArray4271 == null || aByteArray4271.length < -455995945 * anInt4269)
				aByteArray4271 = new byte[anInt4269 * -455995945];
			if (((Class334) this).anIntArray4273 == null || (((Class334) this).anIntArray4273.length < anInt4269 * -455995945))
				((Class334) this).anIntArray4273 = new int[-455995945 * anInt4269];
			if (anIntArray4274 == null || anIntArray4274.length < -455995945 * anInt4269)
				anIntArray4274 = new int[anInt4269 * -455995945];
			if (aBoolArray4258 == null || aBoolArray4258.length < -455995945 * anInt4269)
				aBoolArray4258 = new boolean[-455995945 * anInt4269];
			for (int i_36_ = 0; i_36_ < anInt4269 * -455995945; i_36_++) {
				if (((Class334) this).aBool4266)
					((Class334) this).aLongArray4270[i_36_] = class572_sub15.method8476((byte) 4);
				if (((Class334) this).aBool4259)
					aStringArray4264[i_36_] = class572_sub15.method8557(-1091665163);
				aByteArray4271[i_36_] = class572_sub15.readByte(1750209102);
				if (i_34_ >= 2)
					((Class334) this).anIntArray4273[i_36_] = class572_sub15.readInt(-240020732);
				if (i_34_ >= 5)
					anIntArray4274[i_36_] = class572_sub15.readUnsignedShort(647518597);
				else
					anIntArray4274[i_36_] = 0;
				if (i_34_ >= 6)
					aBoolArray4258[i_36_] = class572_sub15.readUnsignedByte(840083118) == 1;
				else
					aBoolArray4258[i_36_] = false;
			}
			method4192(149368462);
		}
		if (-1450736271 * anInt4278 > 0) {
			if (((Class334) this).aBool4266 && (null == ((Class334) this).aLongArray4279 || (((Class334) this).aLongArray4279.length < -1450736271 * anInt4278)))
				((Class334) this).aLongArray4279 = new long[anInt4278 * -1450736271];
			if (((Class334) this).aBool4259 && (null == aStringArray4281 || aStringArray4281.length < -1450736271 * anInt4278))
				aStringArray4281 = new String[-1450736271 * anInt4278];
			for (int i_37_ = 0; i_37_ < -1450736271 * anInt4278; i_37_++) {
				if (((Class334) this).aBool4266)
					((Class334) this).aLongArray4279[i_37_] = class572_sub15.method8476((byte) 4);
				if (((Class334) this).aBool4259)
					aStringArray4281[i_37_] = class572_sub15.method8557(-1577048770);
			}
		}
		if (i_34_ >= 3) {
			int i_38_ = class572_sub15.readUnsignedShort(647518597);
			if (i_38_ > 0) {
				((Class334) this).aClass676_4282 = new Class676(i_38_ < 16 ? HashTable.nextPowerOfTwo(i_38_, 1461814335) : 16);
				while (i_38_-- > 0) {
					int i_39_ = class572_sub15.readInt(1050534568);
					int i_40_ = i_39_ & 0x3fffffff;
					int i_41_ = i_39_ >>> 30;
					if (0 == i_41_) {
						int i_42_ = class572_sub15.readInt(997334764);
						((Class334) this).aClass676_4282.put(new LinkableInt(i_42_), (long) i_40_);
					} else if (1 == i_41_) {
						long l = class572_sub15.method8476((byte) 4);
						((Class334) this).aClass676_4282.put(new Class572_Sub2(l), (long) i_40_);
					} else if (2 == i_41_) {
						String string = class572_sub15.readString(1295706626);
						((Class334) this).aClass676_4282.put(new LinkableObject(string), (long) i_40_);
					}
				}
			}
		}
	}

	void method4201(int i) {
		if (((Class334) this).aBool4266) {
			if (null != ((Class334) this).aLongArray4270)
				System.arraycopy(((Class334) this).aLongArray4270, 0, (((Class334) this).aLongArray4270 = new long[i]), 0, anInt4269 * -455995945);
			else
				((Class334) this).aLongArray4270 = new long[i];
		}
		if (((Class334) this).aBool4259) {
			if (null != aStringArray4264)
				System.arraycopy(aStringArray4264, 0, aStringArray4264 = new String[i], 0, -455995945 * anInt4269);
			else
				aStringArray4264 = new String[i];
		}
		if (aByteArray4271 != null)
			System.arraycopy(aByteArray4271, 0, aByteArray4271 = new byte[i], 0, -455995945 * anInt4269);
		else
			aByteArray4271 = new byte[i];
		if (null != ((Class334) this).anIntArray4273)
			System.arraycopy(((Class334) this).anIntArray4273, 0, ((Class334) this).anIntArray4273 = new int[i], 0, anInt4269 * -455995945);
		else
			((Class334) this).anIntArray4273 = new int[i];
		if (null != anIntArray4274)
			System.arraycopy(anIntArray4274, 0, anIntArray4274 = new int[i], 0, anInt4269 * -455995945);
		else
			anIntArray4274 = new int[i];
		if (aBoolArray4258 != null)
			System.arraycopy(aBoolArray4258, 0, aBoolArray4258 = new boolean[i], 0, -455995945 * anInt4269);
		else
			aBoolArray4258 = new boolean[i];
	}

	void method4202(int i) {
		if (((Class334) this).aBool4266) {
			if (((Class334) this).aLongArray4279 != null)
				System.arraycopy(((Class334) this).aLongArray4279, 0, (((Class334) this).aLongArray4279 = new long[i]), 0, anInt4278 * -1450736271);
			else
				((Class334) this).aLongArray4279 = new long[i];
		}
		if (((Class334) this).aBool4259) {
			if (null != aStringArray4281)
				System.arraycopy(aStringArray4281, 0, aStringArray4281 = new String[i], 0, anInt4278 * -1450736271);
			else
				aStringArray4281 = new String[i];
		}
	}

	void method4203(int i) {
		if (((Class334) this).aBool4266) {
			if (null != ((Class334) this).aLongArray4270)
				System.arraycopy(((Class334) this).aLongArray4270, 0, (((Class334) this).aLongArray4270 = new long[i]), 0, anInt4269 * -455995945);
			else
				((Class334) this).aLongArray4270 = new long[i];
		}
		if (((Class334) this).aBool4259) {
			if (null != aStringArray4264)
				System.arraycopy(aStringArray4264, 0, aStringArray4264 = new String[i], 0, -455995945 * anInt4269);
			else
				aStringArray4264 = new String[i];
		}
		if (aByteArray4271 != null)
			System.arraycopy(aByteArray4271, 0, aByteArray4271 = new byte[i], 0, -455995945 * anInt4269);
		else
			aByteArray4271 = new byte[i];
		if (null != ((Class334) this).anIntArray4273)
			System.arraycopy(((Class334) this).anIntArray4273, 0, ((Class334) this).anIntArray4273 = new int[i], 0, anInt4269 * -455995945);
		else
			((Class334) this).anIntArray4273 = new int[i];
		if (null != anIntArray4274)
			System.arraycopy(anIntArray4274, 0, anIntArray4274 = new int[i], 0, anInt4269 * -455995945);
		else
			anIntArray4274 = new int[i];
		if (aBoolArray4258 != null)
			System.arraycopy(aBoolArray4258, 0, aBoolArray4258 = new boolean[i], 0, -455995945 * anInt4269);
		else
			aBoolArray4258 = new boolean[i];
	}

	int method4204(int i, byte i_43_, int i_44_) {
		if (i_43_ == 126 || 127 == i_43_)
			return -1;
		if (i == -202636503 * anInt4280 && (961755777 * anInt4283 == -1 || aByteArray4271[961755777 * anInt4283] < 125))
			return -1;
		if (aByteArray4271[i] == i_43_)
			return -1;
		aByteArray4271[i] = i_43_;
		method4192(-1692420772);
		return i;
	}

	public int method4205(String string, int i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_45_ = 0; i_45_ < anInt4269 * -455995945; i_45_++) {
			if (aStringArray4264[i_45_].equals(string))
				return i_45_;
		}
		return -1;
	}

	void method4206(int i) {
		if (i < 0 || i >= anInt4269 * -455995945)
			throw new RuntimeException("");
		anInt4269 -= 539506151;
		((Class334) this).anIntArray4272 = null;
		if (anInt4269 * -455995945 == 0) {
			((Class334) this).aLongArray4270 = null;
			aStringArray4264 = null;
			aByteArray4271 = null;
			((Class334) this).anIntArray4273 = null;
			anIntArray4274 = null;
			aBoolArray4258 = null;
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
		} else {
			System.arraycopy(aByteArray4271, 1 + i, aByteArray4271, i, -455995945 * anInt4269 - i);
			System.arraycopy(((Class334) this).anIntArray4273, i + 1, ((Class334) this).anIntArray4273, i, -455995945 * anInt4269 - i);
			System.arraycopy(anIntArray4274, i + 1, anIntArray4274, i, anInt4269 * -455995945 - i);
			System.arraycopy(aBoolArray4258, i + 1, aBoolArray4258, i, -455995945 * anInt4269 - i);
			if (((Class334) this).aLongArray4270 != null)
				System.arraycopy(((Class334) this).aLongArray4270, i + 1, ((Class334) this).aLongArray4270, i, anInt4269 * -455995945 - i);
			if (null != aStringArray4264)
				System.arraycopy(aStringArray4264, i + 1, aStringArray4264, i, anInt4269 * -455995945 - i);
			method4192(2088629849);
		}
	}

	void method4207(int i) {
		if (i < 0 || i >= anInt4269 * -455995945)
			throw new RuntimeException("");
		anInt4269 -= 539506151;
		((Class334) this).anIntArray4272 = null;
		if (anInt4269 * -455995945 == 0) {
			((Class334) this).aLongArray4270 = null;
			aStringArray4264 = null;
			aByteArray4271 = null;
			((Class334) this).anIntArray4273 = null;
			anIntArray4274 = null;
			aBoolArray4258 = null;
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
		} else {
			System.arraycopy(aByteArray4271, 1 + i, aByteArray4271, i, -455995945 * anInt4269 - i);
			System.arraycopy(((Class334) this).anIntArray4273, i + 1, ((Class334) this).anIntArray4273, i, -455995945 * anInt4269 - i);
			System.arraycopy(anIntArray4274, i + 1, anIntArray4274, i, anInt4269 * -455995945 - i);
			System.arraycopy(aBoolArray4258, i + 1, aBoolArray4258, i, -455995945 * anInt4269 - i);
			if (((Class334) this).aLongArray4270 != null)
				System.arraycopy(((Class334) this).aLongArray4270, i + 1, ((Class334) this).aLongArray4270, i, anInt4269 * -455995945 - i);
			if (null != aStringArray4264)
				System.arraycopy(aStringArray4264, i + 1, aStringArray4264, i, anInt4269 * -455995945 - i);
			method4192(-995479814);
		}
	}

	void method4208(int i) {
		if (i < 0 || i >= anInt4269 * -455995945)
			throw new RuntimeException("");
		anInt4269 -= 539506151;
		((Class334) this).anIntArray4272 = null;
		if (anInt4269 * -455995945 == 0) {
			((Class334) this).aLongArray4270 = null;
			aStringArray4264 = null;
			aByteArray4271 = null;
			((Class334) this).anIntArray4273 = null;
			anIntArray4274 = null;
			aBoolArray4258 = null;
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
		} else {
			System.arraycopy(aByteArray4271, 1 + i, aByteArray4271, i, -455995945 * anInt4269 - i);
			System.arraycopy(((Class334) this).anIntArray4273, i + 1, ((Class334) this).anIntArray4273, i, -455995945 * anInt4269 - i);
			System.arraycopy(anIntArray4274, i + 1, anIntArray4274, i, anInt4269 * -455995945 - i);
			System.arraycopy(aBoolArray4258, i + 1, aBoolArray4258, i, -455995945 * anInt4269 - i);
			if (((Class334) this).aLongArray4270 != null)
				System.arraycopy(((Class334) this).aLongArray4270, i + 1, ((Class334) this).aLongArray4270, i, anInt4269 * -455995945 - i);
			if (null != aStringArray4264)
				System.arraycopy(aStringArray4264, i + 1, aStringArray4264, i, anInt4269 * -455995945 - i);
			method4192(-1565718324);
		}
	}

	void method4209() {
		if (-455995945 * anInt4269 == 0) {
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
		} else {
			anInt4280 = 1354413799;
			anInt4283 = 1989474943;
			int i = 0;
			byte i_46_ = aByteArray4271[0];
			for (int i_47_ = 1; i_47_ < -455995945 * anInt4269; i_47_++) {
				if (aByteArray4271[i_47_] > i_46_) {
					if (i_46_ == 125)
						anInt4283 = -1989474943 * i;
					i = i_47_;
					i_46_ = aByteArray4271[i_47_];
				} else if (961755777 * anInt4283 == -1 && 125 == aByteArray4271[i_47_])
					anInt4283 = i_47_ * -1989474943;
			}
			anInt4280 = i * -1354413799;
			if (-1 != -202636503 * anInt4280)
				aByteArray4271[anInt4280 * -202636503] = (byte) 126;
		}
	}

	public int[] method4210(int i) {
		if (null == ((Class334) this).anIntArray4272) {
			String[] strings = new String[anInt4269 * -455995945];
			((Class334) this).anIntArray4272 = new int[anInt4269 * -455995945];
			for (int i_48_ = 0; i_48_ < -455995945 * anInt4269; i_48_++) {
				strings[i_48_] = aStringArray4264[i_48_];
				if (strings[i_48_] != null)
					strings[i_48_] = strings[i_48_].toLowerCase();
				((Class334) this).anIntArray4272[i_48_] = i_48_;
			}
			Class557.method6593(strings, ((Class334) this).anIntArray4272, 493419501);
		}
		return ((Class334) this).anIntArray4272;
	}

	void method4211(int i) {
		anInt4278 -= -225272943;
		if (0 == -1450736271 * anInt4278) {
			((Class334) this).aLongArray4279 = null;
			aStringArray4281 = null;
		} else {
			if (null != ((Class334) this).aLongArray4279)
				System.arraycopy(((Class334) this).aLongArray4279, 1 + i, ((Class334) this).aLongArray4279, i, anInt4278 * -1450736271 - i);
			if (null != aStringArray4281)
				System.arraycopy(aStringArray4281, 1 + i, aStringArray4281, i, -1450736271 * anInt4278 - i);
		}
	}

	void method4212(int i) {
		anInt4278 -= -225272943;
		if (0 == -1450736271 * anInt4278) {
			((Class334) this).aLongArray4279 = null;
			aStringArray4281 = null;
		} else {
			if (null != ((Class334) this).aLongArray4279)
				System.arraycopy(((Class334) this).aLongArray4279, 1 + i, ((Class334) this).aLongArray4279, i, anInt4278 * -1450736271 - i);
			if (null != aStringArray4281)
				System.arraycopy(aStringArray4281, 1 + i, aStringArray4281, i, -1450736271 * anInt4278 - i);
		}
	}

	public String method4213(int i, int i_49_) {
		if (null == ((Class334) this).aClass676_4282)
			return null;
		Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
		if (null == class572 || !(class572 instanceof LinkableObject))
			return null;
		return (String) ((LinkableObject) class572).anObject9081;
	}

	void method4214(long l, String string, byte i) {
		if (string != null && string.length() == 0)
			string = null;
		if (l > 0L != ((Class334) this).aBool4266)
			throw new RuntimeException("");
		if ((string != null) != ((Class334) this).aBool4259)
			throw new RuntimeException("");
		if (l > 0L && (((Class334) this).aLongArray4279 == null || (anInt4278 * -1450736271 >= ((Class334) this).aLongArray4279.length)) || (null != string && (null == aStringArray4281 || -1450736271 * anInt4278 >= aStringArray4281.length)))
			method4186(-1450736271 * anInt4278 + 5, -11987460);
		if (((Class334) this).aLongArray4279 != null)
			((Class334) this).aLongArray4279[anInt4278 * -1450736271] = l;
		if (aStringArray4281 != null)
			aStringArray4281[anInt4278 * -1450736271] = string;
		anInt4278 += -225272943;
	}

	public Class334(RSByteBuffer class572_sub15) {
		aString4262 = null;
		((Class334) this).anInt4263 = 0;
		anInt4280 = 1354413799;
		anInt4283 = 1989474943;
		method4200(class572_sub15, -1534799454);
	}

	public Integer method4215(int i, short i_50_) {
		if (((Class334) this).aClass676_4282 == null)
			return null;
		Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
		if (null == class572 || !(class572 instanceof LinkableInt))
			return null;
		return new Integer(((LinkableInt) class572).anInt9258 * -1945426987);
	}

	boolean method4216(int i, int i_51_) {
		if (null != ((Class334) this).aClass676_4282) {
			Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
			if (class572 != null) {
				if (class572 instanceof LinkableInt) {
					LinkableInt class572_sub26 = (LinkableInt) class572;
					if (i_51_ == -1945426987 * class572_sub26.anInt9258)
						return false;
					class572_sub26.anInt9258 = -863044227 * i_51_;
					return true;
				}
				class572.method6794((byte) -51);
			}
		} else
			((Class334) this).aClass676_4282 = new Class676(4);
		((Class334) this).aClass676_4282.put(new LinkableInt(i_51_), (long) i);
		return true;
	}

	boolean method4217(int i, int i_52_) {
		if (null != ((Class334) this).aClass676_4282) {
			Class572 class572 = ((Class334) this).aClass676_4282.get((long) i);
			if (class572 != null) {
				if (class572 instanceof LinkableInt) {
					LinkableInt class572_sub26 = (LinkableInt) class572;
					if (i_52_ == -1945426987 * class572_sub26.anInt9258)
						return false;
					class572_sub26.anInt9258 = -863044227 * i_52_;
					return true;
				}
				class572.method6794((byte) -7);
			}
		} else
			((Class334) this).aClass676_4282 = new Class676(4);
		((Class334) this).aClass676_4282.put(new LinkableInt(i_52_), (long) i);
		return true;
	}

	static boolean method4218(byte i) {
		if (Class664.method7853(835742603 * client.anInt8580, (short) -29810))
			return false;
		return true;
	}

	static final void method4219(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class527.method6314(class73, class83, class441, (short) 135);
	}

	static final void method4220(Cs2Executor class441, int i) {
		Class392.method4731((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), 686103337);
	}

	static final void method4221(Cs2Executor class441, int i) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class547.method6461(((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]);
		if (null == class572_sub12_sub5 || class572_sub12_sub5.areaName == null)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class572_sub12_sub5.areaName;
	}

	static final void method4222(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class255.method3525(string, 1700084130);
	}

	static void method4223(byte i) {
		Class537.method6386(-2140227668);
		Class547_Sub1.aClass572_Sub12_Sub5_6129 = null;
		Class483.aClass572_Sub12_Sub5_5389 = null;
		Class547_Sub1.aClass676_8991.method7964((byte) 126);
		Class547_Sub1.aClass676_8997.method7964((byte) 43);
		for (int i_53_ = 0; i_53_ < 3; i_53_++) {
			for (int i_54_ = 0; i_54_ < 5; i_54_++) {
				Class547_Sub1.aClass102ArrayArray8988[i_53_][i_54_] = null;
				Class547_Sub1.aClass284ArrayArray8992[i_53_][i_54_] = null;
			}
		}
	}

	static final void method4224(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1421244803 * client.anInt8808;
	}
}

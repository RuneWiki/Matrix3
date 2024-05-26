package game;

/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class127 {
	int anInt1520;
	int anInt1521;
	Class676 aClass676_1522;
	Interface8 anInterface8_1523;
	Class664 aClass664_1524 = new Class664();

	public int method2224() {
		return ((Class127) this).anInt1521 * -442218857;
	}

	public void method2225() {
		((Class127) this).aClass664_1524.method7841((short) -20756);
		((Class127) this).aClass676_1522.method7964((byte) 75);
		((Class127) this).anInt1521 = ((Class127) this).anInt1520 * -1968771331;
	}

	public void method2226(Interface8 interface8, int i) {
		((Class127) this).anInterface8_1523 = interface8;
	}

	public void method2227(long l) {
		Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass676_1522.get(l));
		method2228(class572_sub12_sub4, 2084958852);
	}

	void method2228(Class572_Sub12_Sub4 class572_sub12_sub4, int i) {
		if (null != class572_sub12_sub4) {
			class572_sub12_sub4.method6794((byte) 10);
			class572_sub12_sub4.method8412(724585842);
			((Class127) this).anInt1521 += (1888866461 * ((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318);
		}
	}

	public void method2229(Object object, long l) {
		method2230(object, l, 1, 361325284);
	}

	public void method2230(Object object, long l, int i, int i_0_) {
		if (i > ((Class127) this).anInt1520 * -656136901)
			throw new IllegalStateException();
		method2227(l);
		((Class127) this).anInt1521 -= -1298163417 * i;
		while (-442218857 * ((Class127) this).anInt1521 < 0) {
			Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7843(513820327));
			if (class572_sub12_sub4 == null)
				throw new RuntimeException("");
			if (class572_sub12_sub4.method10285(877397172)) {
				/* empty */
			}
			method2228(class572_sub12_sub4, 1900401847);
			if (null != ((Class127) this).anInterface8_1523)
				((Class127) this).anInterface8_1523.method46(class572_sub12_sub4.method10284(1666941720), -942402622);
		}
		Class572_Sub12_Sub4_Sub1 class572_sub12_sub4_sub1 = new Class572_Sub12_Sub4_Sub1(object, i);
		((Class127) this).aClass676_1522.put(class572_sub12_sub4_sub1, l);
		((Class127) this).aClass664_1524.method7842(class572_sub12_sub4_sub1, 853775201);
		class572_sub12_sub4_sub1.aLong9093 = 0L;
	}

	public void method2231(byte i) {
		((Class127) this).aClass664_1524.method7841((short) -32416);
		((Class127) this).aClass676_1522.method7964((byte) 98);
		((Class127) this).anInt1521 = ((Class127) this).anInt1520 * -1968771331;
	}

	public int method2232(int i) {
		return ((Class127) this).anInt1520 * -656136901;
	}

	public int method2233(int i) {
		return ((Class127) this).anInt1521 * -442218857;
	}

	public Class127(int i) {
		this(i, i);
	}

	public void method2234(byte i) {
		for (Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7848(-1042067865)); null != class572_sub12_sub4; class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7845(-1481808074)) {
			if (class572_sub12_sub4.method10285(-1511660352)) {
				class572_sub12_sub4.method6794((byte) -88);
				class572_sub12_sub4.method8412(724585842);
				((Class127) this).anInt1521 += (((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318 * 1888866461);
			}
		}
	}

	public void method2235(int i, int i_1_) {
		for (Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7848(-1042067865)); null != class572_sub12_sub4; class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7845(-2002830789)) {
			if (class572_sub12_sub4.method10285(584150278)) {
				if (class572_sub12_sub4.method10284(-881625026) == null) {
					class572_sub12_sub4.method6794((byte) 99);
					class572_sub12_sub4.method8412(724585842);
					((Class127) this).anInt1521 += 1888866461 * ((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318;
				}
			} else if ((class572_sub12_sub4.aLong9093 += -6500281269670471539L) * -1521258394346526139L > (long) i) {
				Class572_Sub12_Sub4_Sub2 class572_sub12_sub4_sub2 = (new Class572_Sub12_Sub4_Sub2(class572_sub12_sub4.method10284(-1255602384), (((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318 * 1962736283)));
				((Class127) this).aClass676_1522.put(class572_sub12_sub4_sub2, 381237825124074065L * class572_sub12_sub4.hash);
				Class551.method6539(class572_sub12_sub4_sub2, class572_sub12_sub4, 1179466163);
				class572_sub12_sub4.method6794((byte) -84);
				class572_sub12_sub4.method8412(724585842);
			}
		}
	}

	public int method2236() {
		return ((Class127) this).anInt1521 * -442218857;
	}

	public int method2237(byte i) {
		int i_2_ = 0;
		for (Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7848(-1042067865)); class572_sub12_sub4 != null; class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7845(-1676038074)) {
			if (!class572_sub12_sub4.method10285(402363252))
				i_2_++;
		}
		return i_2_;
	}

	public Class127(int i, int i_3_) {
		((Class127) this).anInt1520 = i * -107779085;
		((Class127) this).anInt1521 = i * -1298163417;
		int i_4_;
		for (i_4_ = 1; i_4_ + i_4_ < i && i_4_ < i_3_; i_4_ += i_4_) {
			/* empty */
		}
		((Class127) this).aClass676_1522 = new Class676(i_4_);
	}

	public Object method2238(int i) {
		Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass676_1522.method7969(154501090));
		while (null != class572_sub12_sub4) {
			Object object = class572_sub12_sub4.method10284(-440105483);
			if (null == object) {
				Class572_Sub12_Sub4 class572_sub12_sub4_5_ = class572_sub12_sub4;
				class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass676_1522.method7969(1713033615);
				class572_sub12_sub4_5_.method6794((byte) -95);
				class572_sub12_sub4_5_.method8412(724585842);
				((Class127) this).anInt1521 += (((Class572_Sub12_Sub4) class572_sub12_sub4_5_).anInt11318) * 1888866461;
			} else
				return object;
		}
		return null;
	}

	public void method2239(int i) {
		for (Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7848(-1042067865)); null != class572_sub12_sub4; class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7845(-1710099257)) {
			if (class572_sub12_sub4.method10285(99767230)) {
				if (class572_sub12_sub4.method10284(1733224952) == null) {
					class572_sub12_sub4.method6794((byte) -36);
					class572_sub12_sub4.method8412(724585842);
					((Class127) this).anInt1521 += 1888866461 * ((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318;
				}
			} else if ((class572_sub12_sub4.aLong9093 += -6500281269670471539L) * -1521258394346526139L > (long) i) {
				Class572_Sub12_Sub4_Sub2 class572_sub12_sub4_sub2 = (new Class572_Sub12_Sub4_Sub2(class572_sub12_sub4.method10284(1185155955), (((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318 * 1962736283)));
				((Class127) this).aClass676_1522.put(class572_sub12_sub4_sub2, 381237825124074065L * class572_sub12_sub4.hash);
				Class551.method6539(class572_sub12_sub4_sub2, class572_sub12_sub4, 1179466163);
				class572_sub12_sub4.method6794((byte) 40);
				class572_sub12_sub4.method8412(724585842);
			}
		}
	}

	public void method2240(int i) {
		for (Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7848(-1042067865)); null != class572_sub12_sub4; class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7845(-1352726593)) {
			if (class572_sub12_sub4.method10285(-1917712005)) {
				if (class572_sub12_sub4.method10284(276440997) == null) {
					class572_sub12_sub4.method6794((byte) 20);
					class572_sub12_sub4.method8412(724585842);
					((Class127) this).anInt1521 += 1888866461 * ((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318;
				}
			} else if ((class572_sub12_sub4.aLong9093 += -6500281269670471539L) * -1521258394346526139L > (long) i) {
				Class572_Sub12_Sub4_Sub2 class572_sub12_sub4_sub2 = (new Class572_Sub12_Sub4_Sub2(class572_sub12_sub4.method10284(-263333068), (((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318 * 1962736283)));
				((Class127) this).aClass676_1522.put(class572_sub12_sub4_sub2, 381237825124074065L * class572_sub12_sub4.hash);
				Class551.method6539(class572_sub12_sub4_sub2, class572_sub12_sub4, 1179466163);
				class572_sub12_sub4.method6794((byte) -1);
				class572_sub12_sub4.method8412(724585842);
			}
		}
	}

	public int method2241() {
		return ((Class127) this).anInt1521 * -442218857;
	}

	public void method2242() {
		((Class127) this).aClass664_1524.method7841((short) -24119);
		((Class127) this).aClass676_1522.method7964((byte) 19);
		((Class127) this).anInt1521 = ((Class127) this).anInt1520 * -1968771331;
	}

	public int method2243() {
		return ((Class127) this).anInt1521 * -442218857;
	}

	public int method2244() {
		return ((Class127) this).anInt1520 * -656136901;
	}

	public void method2245() {
		for (Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7848(-1042067865)); null != class572_sub12_sub4; class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7845(-994936435))) {
			if (class572_sub12_sub4.method10285(24025359)) {
				class572_sub12_sub4.method6794((byte) -2);
				class572_sub12_sub4.method8412(724585842);
				((Class127) this).anInt1521 += (((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318 * 1888866461);
			}
		}
	}

	public Object method2246(long l) {
		Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass676_1522.get(l));
		if (null == class572_sub12_sub4)
			return null;
		Object object = class572_sub12_sub4.method10284(1823500559);
		if (null == object) {
			class572_sub12_sub4.method6794((byte) 18);
			class572_sub12_sub4.method8412(724585842);
			((Class127) this).anInt1521 += (((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318 * 1888866461);
			return null;
		}
		if (class572_sub12_sub4.method10285(-546783702)) {
			Class572_Sub12_Sub4_Sub1 class572_sub12_sub4_sub1 = new Class572_Sub12_Sub4_Sub1(object, (((Class572_Sub12_Sub4) class572_sub12_sub4).anInt11318) * 1962736283);
			((Class127) this).aClass676_1522.put(class572_sub12_sub4_sub1, 381237825124074065L * class572_sub12_sub4.hash);
			((Class127) this).aClass664_1524.method7842(class572_sub12_sub4_sub1, 1120290232);
			class572_sub12_sub4_sub1.aLong9093 = 0L;
			class572_sub12_sub4.method6794((byte) 64);
			class572_sub12_sub4.method8412(724585842);
		} else {
			((Class127) this).aClass664_1524.method7842(class572_sub12_sub4, 1803905051);
			class572_sub12_sub4.aLong9093 = 0L;
		}
		return object;
	}

	public int method2247() {
		return ((Class127) this).anInt1520 * -656136901;
	}

	public int method2248() {
		int i = 0;
		for (Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7848(-1042067865)); class572_sub12_sub4 != null; class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass664_1524.method7845(-1247753905)) {
			if (!class572_sub12_sub4.method10285(454767976))
				i++;
		}
		return i;
	}

	public Object method2249(int i) {
		Class572_Sub12_Sub4 class572_sub12_sub4 = ((Class572_Sub12_Sub4) ((Class127) this).aClass676_1522.method7968((byte) -10));
		while (null != class572_sub12_sub4) {
			Object object = class572_sub12_sub4.method10284(2042438330);
			if (object == null) {
				Class572_Sub12_Sub4 class572_sub12_sub4_6_ = class572_sub12_sub4;
				class572_sub12_sub4 = (Class572_Sub12_Sub4) ((Class127) this).aClass676_1522.method7969(1913607483);
				class572_sub12_sub4_6_.method6794((byte) -32);
				class572_sub12_sub4_6_.method8412(724585842);
				((Class127) this).anInt1521 += 1888866461 * ((Class572_Sub12_Sub4) class572_sub12_sub4_6_).anInt11318;
			} else
				return object;
		}
		return null;
	}

	static final void method2250(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class481_Sub1 class481_sub1 = Class505.method6029(i_7_, (byte) -35);
		if (null != class481_sub1) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class481_sub1.anInt5358 * 39075705;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class481_sub1.aString8937;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = class481_sub1.method8229(132558129);
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class481_sub1.method8230(-1840562107);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1371162219 * class481_sub1.anInt5360;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 944028155 * class481_sub1.anInt8940;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class481_sub1.aString8938;
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		}
	}

	static final void method2251(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -586192621 * Class13.anInt118;
	}

	static void method2252(Cs2Executor class441, byte i) {
		int i_8_ = Class26.method754((short) 255);
		if (i_8_ < 0) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class520.aTwitchEventLiveStreams5810.viewerCounts[i_8_];
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = Class520.aTwitchEventLiveStreams5810.channelUrls[i_8_];
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (Class520.aTwitchEventLiveStreams5810.previewUrlTemplates[i_8_]);
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = Class520.aTwitchEventLiveStreams5810.streamTitles[i_8_];
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = (Class520.aTwitchEventLiveStreams5810.channelDisplayNames[i_8_]);
		}
	}

	static final void method2253(Cs2Executor class441, int i) {
		Class344.audio.sendMusic((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]));
	}

	static final void method2254(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string.toLowerCase();
	}
}

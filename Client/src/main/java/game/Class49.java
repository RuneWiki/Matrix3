package game;

// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) deadcode 
// Source File Name:   fh.java

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Class49 {

	public List method845(byte byte0) {
		return Collections.unmodifiableList(anArrayList488);
	}

	public List method846(byte byte0) {
		return Collections.unmodifiableList(anArrayList474);
	}

	int method847(int i) {
		return anInt489 * 0xcfa32c5d;
	}

	public boolean method848(short word0) {
		return aBool484;
	}

	public int method849(int i) {
		return 0xad399a75 * anInt482;
	}

	public long method850(byte byte0) {
		return aLong481 * 0x53f92e4b52d64b91L;
	}

	public int hashCode() {
		return (int) (0x3e7e3b7fd881b92fL * aLong479);
	}

	void method851(byte byte0) {
		int i = -1;
		int j = -1;
		for (int k = 0; k < anArrayList488.size(); k++) {
			Class115 class115 = (Class115) anArrayList488.get(k);
			int l = class115.method2099((byte) -9);
			if (l > i) {
				i = l;
				j = k;
			}
		}

		anInt486 = 0x674c204d * j;
	}

	public int method852(int i) {
		return anInt486 * 0x521c1885;
	}

	public int method853() {
		return (int) (0x3e7e3b7fd881b92fL * aLong479);
	}

	public Class115 method854(int i, int j) {
		if (i == -1)
			return null;
		else
			return (Class115) anArrayList488.get(i);
	}

	public String method855(int i) {
		return aString480;
	}

	void method856(int i, byte byte0) {
		anArrayList488.remove(i);
		method851((byte) -55);
	}

	void method857(Class115 class115, byte byte0) {
		anArrayList488.add(class115);
		method851((byte) -13);
	}

	public Class72 method858(byte byte0) {
		if (anArrayList488.isEmpty())
			return Class72.aClass72_720;
		Class72 class72 = ((Class115) anArrayList488.get(0)).method2106(0xedb7b246);
		Iterator iterator;
		switch (class72.anInt719 * 0xe3e82d41) {
			case 0: // '\0'
			case 2: // '\002'
				return class72;

			default:
				iterator = anArrayList488.iterator();
				break;
		}
		while (iterator.hasNext()) {
			Class115 class115 = (Class115) iterator.next();
			if (class115.method2106(0xedb7b246) == Class72.aClass72_720)
				return Class72.aClass72_720;
		}
		return Class72.aClass72_716;
	}

	void method859(Class116 class116, int i) {
		anArrayList474.add(class116);
	}

	public Class49(long l, RSByteBuffer class572_sub15, boolean flag, Interface1 interface1) {
		anInt486 = 0x98b3dfb3;
		aLong479 = l * 0x8272f6bc17d22dcfL;
		int i = class572_sub15.readUnsignedByte(0xfe2c4e24);
		if (i <= 0)
			;
		int j = class572_sub15.readUnsignedByte(0x4dc7d6e6);
		aBool484 = 0 != (j & 1);
		aBool485 = (j & 2) != 0;
		aBool487 = 0 != (j & 4);
		anInt489 = class572_sub15.readInt(0x10a65285) * 0xf32007f5;
		aLong481 = class572_sub15.method8476((byte) 4) * 0x675068203b79d571L;
		aString480 = class572_sub15.readString(0x4d3aea02);
		anInt482 = class572_sub15.readShort(0xd59f5c7f) * 0xb44fe5dd;
		class572_sub15.readInt(0x2c32a996);
		class572_sub15.method8476((byte) 4);
		int k = class572_sub15.readUnsignedShort(0x26985985);
		anArrayList488 = new ArrayList(k);
		for (int i1 = 0; i1 < k; i1++)
			anArrayList488.add(new Class115(class572_sub15, aBool485, aBool487, interface1));

		int j1 = class572_sub15.readUnsignedShort(0x26985985);
		anArrayList474 = new ArrayList(j1);
		for (int k1 = 0; k1 < j1; k1++)
			anArrayList474.add(new Class116(class572_sub15, aBool485, aBool487));

		aClass630_483 = new Class630(interface1.method2(0x130c18ef));
		int l1 = class572_sub15.readUnsignedShort(0x26985985);
		for (int i2 = 0; i2 < l1; i2++) {
			Class323 class323 = interface1.method2(0x9dc0b249).method9203(class572_sub15, 0xa4b04da8);
			aClass630_483.method443(class323.anInt4079 * 0x16b073a5, class323.anObject4078, 0x7fdfb3b3);
		}

		if (!flag) {
			class572_sub15.readUnsignedShort(0x26985985);
			class572_sub15.readUnsignedShort(0x26985985);
			class572_sub15.readUnsignedShort(0x26985985);
			class572_sub15.readUnsignedShort(0x26985985);
			class572_sub15.readUnsignedShort(0x26985985);
		}
		method851((byte) 5);
	}

	void method860(int i, int j, int k) {
		((Class115) anArrayList488.get(i)).method2100(j, (byte) 21);
		method851((byte) 0);
	}

	void method861(int i) {
		Class115 class115;
		for (Iterator iterator = anArrayList488.iterator(); iterator.hasNext(); class115.method2105(Class72.aClass72_717, 0x47ef3fde))
			class115 = (Class115) iterator.next();

	}

	void method862(int i, int j, int k) {
		((Class115) anArrayList488.get(i)).method2112(j, 0x4f04471e);
	}

	void method863(int i, boolean flag, byte byte0) {
		Class115 class115 = (Class115) anArrayList488.get(i);
		class115.method2105(flag ? Class72.aClass72_716 : Class72.aClass72_720, 0x5e23aff1);
	}

	public IVarDomain method864(byte byte0) {
		return new Class134(VarDomainType.aClass272_2884, aClass630_483);
	}

	void method865(byte byte0) {
		anInt489 += 0xf32007f5;
	}

	void method866(byte byte0) {
		Class115 class115;
		for (Iterator iterator = anArrayList488.iterator(); iterator.hasNext(); class115.method2105(Class72.aClass72_718, 0x503f31ba))
			class115 = (Class115) iterator.next();

	}

	public boolean method867() {
		return aBool484;
	}

	void method868() {
		anInt489 += 0xf32007f5;
	}

	void method869(int i) {
		anArrayList488.remove(i);
		method851((byte) 3);
	}

	void method870(int i) {
		anArrayList474.remove(i);
	}

	public boolean method871() {
		return aBool484;
	}

	void method872(int i) {
		Class115 class115 = (Class115) anArrayList488.get(i);
		class115.method2102(false, (byte) 1);
	}

	public int method873() {
		return (int) (0x3e7e3b7fd881b92fL * aLong479);
	}

	void method874(int i, Class115 class115, byte byte0) {
		Class115 class115_1 = (Class115) anArrayList488.get(i);
		class115_1.method2109(class115, 0x77da7a21);
	}

	public int method875() {
		return anInt486 * 0x521c1885;
	}

	void method876() {
		int i = -1;
		int j = -1;
		for (int k = 0; k < anArrayList488.size(); k++) {
			Class115 class115 = (Class115) anArrayList488.get(k);
			int l = class115.method2099((byte) 25);
			if (l > i) {
				i = l;
				j = k;
			}
		}

		anInt486 = 0x674c204d * j;
	}

	void method877(int i, int j) {
		Class115 class115 = (Class115) anArrayList488.get(i);
		class115.method2102(false, (byte) 1);
	}

	void method878() {
		int i = -1;
		int j = -1;
		for (int k = 0; k < anArrayList488.size(); k++) {
			Class115 class115 = (Class115) anArrayList488.get(k);
			int l = class115.method2099((byte) -7);
			if (l > i) {
				i = l;
				j = k;
			}
		}

		anInt486 = 0x674c204d * j;
	}

	void method879() {
		int i = -1;
		int j = -1;
		for (int k = 0; k < anArrayList488.size(); k++) {
			Class115 class115 = (Class115) anArrayList488.get(k);
			int l = class115.method2099((byte) -38);
			if (l > i) {
				i = l;
				j = k;
			}
		}

		anInt486 = 0x674c204d * j;
	}

	public int method880() {
		return anInt486 * 0x521c1885;
	}

	void method881(int i, int j) {
		anArrayList474.remove(i);
	}

	public boolean method882() {
		return aBool484;
	}

	public int method883() {
		return 0xad399a75 * anInt482;
	}

	void method884(int i) {
		Class115 class115 = (Class115) anArrayList488.get(i);
		class115.method2102(false, (byte) 1);
	}

	public String method885() {
		return aString480;
	}

	public String method886() {
		return aString480;
	}

	void method887(Class115 class115) {
		anArrayList488.add(class115);
		method851((byte) 12);
	}

	public int method888() {
		return (int) (0x3e7e3b7fd881b92fL * aLong479);
	}

	void method889() {
		Class115 class115;
		for (Iterator iterator = anArrayList488.iterator(); iterator.hasNext(); class115.method2105(Class72.aClass72_718, 0x6fab5c86))
			class115 = (Class115) iterator.next();

	}

	void method890(int i) {
		anArrayList474.remove(i);
	}

	void method891(int i, int j, int k) {
		Class115 class115 = (Class115) anArrayList488.get(i);
		class115.method2138(j, 0x4214e45f);
		class115.method2102(true, (byte) 1);
	}

	public int method892() {
		return 0xad399a75 * anInt482;
	}

	void method893() {
		Class115 class115;
		for (Iterator iterator = anArrayList488.iterator(); iterator.hasNext(); class115.method2105(Class72.aClass72_717, 0x1699d224))
			class115 = (Class115) iterator.next();

	}

	void method894() {
		Class115 class115;
		for (Iterator iterator = anArrayList488.iterator(); iterator.hasNext(); class115.method2105(Class72.aClass72_718, 0x20da62e7))
			class115 = (Class115) iterator.next();

	}

	void method895() {
		Class115 class115;
		for (Iterator iterator = anArrayList488.iterator(); iterator.hasNext(); class115.method2105(Class72.aClass72_718, 0x3b5d3c52))
			class115 = (Class115) iterator.next();

	}

	void method896() {
		int i = -1;
		int j = -1;
		for (int k = 0; k < anArrayList488.size(); k++) {
			Class115 class115 = (Class115) anArrayList488.get(k);
			int l = class115.method2099((byte) 79);
			if (l > i) {
				i = l;
				j = k;
			}
		}

		anInt486 = 0x674c204d * j;
	}

	static final void method897(Cs2Executor class441, short word0) {
		class441.intStackPtr -= 0x83c69cce;
		int i = class441.intStack[0x519ded57 * class441.intStackPtr];
		int j = class441.intStack[1 + 0x519ded57 * class441.intStackPtr];
		class441.intStack[(class441.intStackPtr += 0xc1e34e67) * 0x519ded57 - 1] = i & -1 - (1 << j);
	}

	static final void method898(Cs2Executor class441, int i) {
		class441.objectStackPtr -= 0x7996f1aa;
		String s = (String) class441.objectStack[class441.objectStackPtr * 0x610e007d];
		String s1 = (String) class441.objectStack[0x610e007d * class441.objectStackPtr + 1];
		MaterialInformation.method1606(s, s1, 0xd5a8f748);
	}

	static void method899(int i, int j) {
		Class386.anInt4642 = i * 0x5b09f7cd;
		Class547_Sub1.anInt8983 = 0x67e4953b;
		Class547_Sub1.anInt8983 = 0x67e4953b;
		Class280.method3794(0x8c40b636);
	}

	ArrayList anArrayList474;
	static final int anInt475 = 1;
	static final int anInt476 = 2;
	static final int anInt477 = 4;
	static final int anInt478 = 1;
	long aLong479;
	String aString480;
	long aLong481;
	int anInt482;
	Class630 aClass630_483;
	boolean aBool484;
	boolean aBool485;
	int anInt486;
	boolean aBool487;
	ArrayList anArrayList488;
	int anInt489;
	public static int anInt490;
}

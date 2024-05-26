package game;

/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class115 {
	boolean aBool1441;
	static final int anInt1442 = 2;
	long aLong1443;
	Class493[] aClass493Array1444;
	static final int anInt1445 = 1;
	String aString1446;
	int anInt1447;
	boolean aBool1448;
	Class630 aClass630_1449;
	int anInt1450;
	Class72 aClass72_1451;
	int anInt1452;
	Class630 aClass630_1453;

	void method2097(int i) {
		((Class115) this).anInt1447 = 1286224889 * i;
	}

	public String method2098(short i) {
		return ((Class115) this).aString1446;
	}

	public int method2099(byte i) {
		return 518819455 * ((Class115) this).anInt1450;
	}

	void method2100(int i, byte i_0_) {
		((Class115) this).anInt1450 = 2099327359 * i;
	}

	Class115(RSByteBuffer class572_sub15, boolean bool, boolean bool_1_, Interface1 interface1) {
		if (bool)
			((Class115) this).aLong1443 = class572_sub15.method8476((byte) 4) * -1015670190662719669L;
		else
			((Class115) this).aLong1443 = 1015670190662719669L;
		if (bool_1_)
			((Class115) this).aString1446 = class572_sub15.method8557(-1615314728);
		int i = class572_sub15.readUnsignedByte(1305155833);
		((Class115) this).aBool1441 = (i & 0x1) != 0;
		((Class115) this).aBool1448 = (i & 0x2) != 0;
		((Class115) this).aClass493Array1444 = (new Class493[interface1.method3((byte) -38).method5791((byte) 0)]);
		int i_2_ = class572_sub15.readUnsignedByte(812531277);
		if (i_2_ > ((Class115) this).aClass493Array1444.length)
			throw new IllegalStateException("");
		for (int i_3_ = 0; i_3_ < ((Class115) this).aClass493Array1444.length; i_3_++) {
			Class493 class493 = (((Class115) this).aClass493Array1444[i_3_] = new Class493(interface1.method3((byte) -18).method5794(i_3_, -747483085), true));
			if (i_3_ < i_2_)
				class493.method5876(class572_sub15.readInt(553183437), (byte) 108);
			else
				class493.method5876(0, (byte) 7);
			class493.method5880(class493.method5883(-710308561), 1521724126);
		}
		int i_4_ = class572_sub15.readUnsignedShort(647518597);
		((Class115) this).aClass630_1449 = new Class630(interface1.method4(-250600170));
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			Class323 class323 = interface1.method4(-250600170).method9203(class572_sub15, 1285048639);
			((Class115) this).aClass630_1449.method443((380662693 * class323.anInt4079), class323.anObject4078, 1733123066);
		}
		((Class115) this).anInt1447 = class572_sub15.readUnsignedShort(647518597) * 1286224889;
		if (65535 == ((Class115) this).anInt1447 * 286889545)
			((Class115) this).anInt1447 = -1286224889;
		((Class115) this).anInt1450 = class572_sub15.readUnsignedByte(1567368747) * 2099327359;
		((Class115) this).aClass72_1451 = ((Class72) Class455.method5387(Class72.method1086(2124295112), class572_sub15.readUnsignedByte(468972836), -2023093206));
		((Class115) this).anInt1452 = class572_sub15.readUnsignedByte(412009374) * -785153855;
	}

	void method2101(int i) {
		((Class115) this).anInt1452 = i * -785153855;
	}

	void method2102(boolean bool, byte i) {
		((Class115) this).aBool1448 = bool;
	}

	public int method2103(byte i) {
		return -459206847 * ((Class115) this).anInt1452;
	}

	public int method2104() {
		return ((Class115) this).anInt1447 * 286889545;
	}

	void method2105(Class72 class72, int i) {
		((Class115) this).aClass72_1451 = class72;
	}

	public Class72 method2106(int i) {
		return ((Class115) this).aClass72_1451;
	}

	long method2107(int i) {
		return ((Class115) this).aLong1443 * 6542363844872858211L;
	}

	public Class493 method2108(int i, int i_6_) {
		return ((Class115) this).aClass493Array1444[i];
	}

	void method2109(Class115 class115_7_, int i) {
		for (int i_8_ = 0; i_8_ < ((Class115) this).aClass493Array1444.length; i_8_++) {
			((Class115) this).aClass493Array1444[i_8_].method5876(((Class115) class115_7_).aClass493Array1444[i_8_].method5874(1442239643), (byte) 108);
			((Class115) this).aClass493Array1444[i_8_].method5880(((Class115) this).aClass493Array1444[i_8_].method5883(983179103), 1648270279);
		}
		((Class115) this).aClass630_1449.method22((byte) -3);
		Iterator iterator = ((Class115) class115_7_).aClass630_1449.iterator();
		while (iterator.hasNext()) {
			Class323 class323 = (Class323) iterator.next();
			((Class115) this).aClass630_1449.method443((380662693 * class323.anInt4079), class323.anObject4078, -887974029);
		}
		((Class115) this).aBool1441 = ((Class115) class115_7_).aBool1441;
	}

	public void method2110(Interface1 interface1, byte i) {
		if (((Class115) this).aClass630_1453 == null)
			((Class115) this).aClass630_1453 = new Class630(interface1.method4(-250600170));
		else
			((Class115) this).aClass630_1453.method22((byte) -84);
	}

	public Class630 method2111(byte i) {
		return ((Class115) this).aClass630_1453;
	}

	void method2112(int i, int i_9_) {
		((Class115) this).anInt1452 = i * -785153855;
	}

	public int method2113() {
		return 518819455 * ((Class115) this).anInt1450;
	}

	void method2114(int i) {
		((Class115) this).anInt1450 = 2099327359 * i;
	}

	public int method2115(int i) {
		return ((Class115) this).anInt1447 * 286889545;
	}

	public int method2116() {
		return 518819455 * ((Class115) this).anInt1450;
	}

	void method2117(int i) {
		((Class115) this).anInt1450 = 2099327359 * i;
	}

	void method2118(int i) {
		((Class115) this).anInt1450 = 2099327359 * i;
	}

	public int method2119() {
		return ((Class115) this).anInt1447 * 286889545;
	}

	void method2120(int i) {
		((Class115) this).anInt1447 = 1286224889 * i;
	}

	void method2121(int i) {
		((Class115) this).anInt1450 = 2099327359 * i;
	}

	void method2122(boolean bool) {
		((Class115) this).aBool1448 = bool;
	}

	void method2123(boolean bool) {
		((Class115) this).aBool1448 = bool;
	}

	void method2124(boolean bool) {
		((Class115) this).aBool1448 = bool;
	}

	void method2125(int i) {
		((Class115) this).anInt1450 = 2099327359 * i;
	}

	public int method2126() {
		return -459206847 * ((Class115) this).anInt1452;
	}

	void method2127(int i) {
		((Class115) this).anInt1452 = i * -785153855;
	}

	void method2128(int i) {
		((Class115) this).anInt1452 = i * -785153855;
	}

	void method2129(int i) {
		((Class115) this).anInt1452 = i * -785153855;
	}

	public boolean method2130(int i) {
		return ((Class115) this).aBool1448;
	}

	public boolean method2131(int i) {
		return ((Class115) this).aBool1441;
	}

	public boolean method2132() {
		return ((Class115) this).aBool1441;
	}

	public boolean method2133() {
		return ((Class115) this).aBool1441;
	}

	public boolean method2134() {
		return ((Class115) this).aBool1441;
	}

	public boolean method2135() {
		return ((Class115) this).aBool1441;
	}

	public boolean method2136() {
		return ((Class115) this).aBool1441;
	}

	void method2137(Class115 class115_10_) {
		for (int i = 0; i < ((Class115) this).aClass493Array1444.length; i++) {
			((Class115) this).aClass493Array1444[i].method5876(((Class115) class115_10_).aClass493Array1444[i].method5874(1336269648), (byte) 2);
			((Class115) this).aClass493Array1444[i].method5880(((Class115) this).aClass493Array1444[i].method5883(738517300), 1979663389);
		}
		((Class115) this).aClass630_1449.method22((byte) -13);
		Iterator iterator = ((Class115) class115_10_).aClass630_1449.iterator();
		while (iterator.hasNext()) {
			Class323 class323 = (Class323) iterator.next();
			((Class115) this).aClass630_1449.method443((380662693 * class323.anInt4079), class323.anObject4078, 1608737080);
		}
		((Class115) this).aBool1441 = ((Class115) class115_10_).aBool1441;
	}

	void method2138(int i, int i_11_) {
		((Class115) this).anInt1447 = 1286224889 * i;
	}

	public boolean method2139() {
		return ((Class115) this).aBool1448;
	}

	static final void method2140(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub19_9237.method9030(166869769);
	}

	static final void method2141(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		ScriptVarType.method3829((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]), (((Cs2Executor) class441).intStack[(1369304407 * ((Cs2Executor) class441).intStackPtr + 1)]), 0, -1076945766);
	}

	static final void method2142(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class539.method6402(class73, class83, false, 0, class441, (byte) -103);
	}
}

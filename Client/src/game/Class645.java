package game;

/* Class645 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class645 implements Interface17, Interface73 {
	int anInt8312;
	public ScriptVarType aClass283_8313;
	public ScriptVarType aClass283_8314;
	int anInt8315;
	String aString8316 = "null";
	Object[] anObjectArray8317;
	Map aMap8318;
	HashMap aHashMap8319;

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(502488485);
			if (i == 0)
				break;
			method7630(class572_sub15, i, 507988107);
		}
	}

	void method7630(RSByteBuffer class572_sub15, int i, int i_0_) {
		if (i == 1) {
			char c = Class118.method2157(class572_sub15.readByte(2090403170), 1934415565);
			aClass283_8313 = ScriptVarType.method3823(c, (byte) 122);
		} else if (2 == i) {
			char c = Class118.method2157(class572_sub15.readByte(1258405798), 1706021151);
			aClass283_8314 = ScriptVarType.method3823(c, (byte) 83);
		} else if (i == 3)
			((Class645) this).aString8316 = class572_sub15.readString(1295706626);
		else if (i == 4)
			((Class645) this).anInt8315 = class572_sub15.readInt(971075471) * -695451455;
		else if (5 == i || i == 6) {
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).aMap8318 = new HashMap(((Class645) this).anInt8312 * -1678622685);
			for (int i_1_ = 0; i_1_ < -1678622685 * ((Class645) this).anInt8312; i_1_++) {
				int i_2_ = class572_sub15.readInt(-838918912);
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class572_sub15.readString(1295706626);
				else
					serializable = new Integer(class572_sub15.readInt(1457333004));
				((Class645) this).aMap8318.put(new Integer(i_2_), serializable);
			}
		} else if (i == 7 || 8 == i) {
			int i_3_ = class572_sub15.readUnsignedShort(647518597);
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).anObjectArray8317 = new Object[i_3_];
			for (int i_4_ = 0; i_4_ < -1678622685 * ((Class645) this).anInt8312; i_4_++) {
				int i_5_ = class572_sub15.readUnsignedShort(647518597);
				if (7 == i)
					((Class645) this).anObjectArray8317[i_5_] = class572_sub15.readString(1295706626);
				else
					((Class645) this).anObjectArray8317[i_5_] = new Integer(class572_sub15.readInt(355492372));
			}
		} else if (i == 101)
			aClass283_8313 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(792599250), class572_sub15.readUnsignedSmart(-656218823), -1959558632));
		else if (102 == i)
			aClass283_8314 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(91134358), class572_sub15.readUnsignedSmart(731347235), -2099718070));
	}

	public int method7631(int i, byte i_6_) {
		Object object = method7633(i, -2144099058);
		if (null == object)
			return ((Class645) this).anInt8315 * -261599423;
		return ((Integer) object).intValue();
	}

	public String method7632(int i, int i_7_) {
		Object object = method7633(i, -2119386571);
		if (null == object)
			return ((Class645) this).aString8316;
		return (String) object;
	}

	Object method7633(int i, int i_8_) {
		if (((Class645) this).anObjectArray8317 != null) {
			if (i < 0 || i >= ((Class645) this).anObjectArray8317.length)
				return null;
			return ((Class645) this).anObjectArray8317[i];
		}
		if (((Class645) this).aMap8318 != null)
			return ((Class645) this).aMap8318.get(new Integer(i));
		return null;
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(532587660);
			if (i == 0)
				break;
			method7630(class572_sub15, i, 507988107);
		}
	}

	public int[] method7634(Object object, int i) {
		if (0 == -1678622685 * ((Class645) this).anInt8312)
			return null;
		if (((Class645) this).aHashMap8319 == null)
			method7636(-837536795);
		return (int[]) ((Class645) this).aHashMap8319.get(object);
	}

	public int method7635(int i) {
		return -1678622685 * ((Class645) this).anInt8312;
	}

	void method7636(int i) {
		HashMap hashmap = new HashMap();
		if (((Class645) this).anObjectArray8317 != null) {
			for (int i_9_ = 0; i_9_ < ((Class645) this).anObjectArray8317.length; i_9_++) {
				if (((Class645) this).anObjectArray8317[i_9_] != null) {
					Object object = ((Class645) this).anObjectArray8317[i_9_];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i_9_));
				}
			}
		} else if (((Class645) this).aMap8318 != null) {
			Iterator iterator = ((Class645) this).aMap8318.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		((Class645) this).aHashMap8319 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i_10_ = 0;
			Iterator iterator_11_ = list.iterator();
			while (iterator_11_.hasNext()) {
				Integer integer = (Integer) iterator_11_.next();
				is[i_10_++] = integer.intValue();
			}
			if (null == ((Class645) this).anObjectArray8317)
				Arrays.sort(is);
			((Class645) this).aHashMap8319.put(entry.getKey(), is);
		}
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method468(int i, int i_12_) {
		/* empty */
	}

	Class645() {
		((Class645) this).anInt8312 = 0;
	}

	void method7637() {
		HashMap hashmap = new HashMap();
		if (((Class645) this).anObjectArray8317 != null) {
			for (int i = 0; i < ((Class645) this).anObjectArray8317.length; i++) {
				if (((Class645) this).anObjectArray8317[i] != null) {
					Object object = ((Class645) this).anObjectArray8317[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (((Class645) this).aMap8318 != null) {
			Iterator iterator = ((Class645) this).aMap8318.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		((Class645) this).aHashMap8319 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_13_ = list.iterator();
			while (iterator_13_.hasNext()) {
				Integer integer = (Integer) iterator_13_.next();
				is[i++] = integer.intValue();
			}
			if (null == ((Class645) this).anObjectArray8317)
				Arrays.sort(is);
			((Class645) this).aHashMap8319.put(entry.getKey(), is);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1638437073);
			if (i == 0)
				break;
			method7630(class572_sub15, i, 507988107);
		}
	}

	public void method103() {
		/* empty */
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(706636484);
			if (i == 0)
				break;
			method7630(class572_sub15, i, 507988107);
		}
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_14_ = class572_sub15.readUnsignedByte(651232842);
			if (i_14_ == 0)
				break;
			method7630(class572_sub15, i_14_, 507988107);
		}
	}

	public void method106() {
		/* empty */
	}

	public void method469(int i) {
		/* empty */
	}

	public boolean method7638(Object object, int i) {
		if (0 == -1678622685 * ((Class645) this).anInt8312)
			return false;
		if (((Class645) this).aHashMap8319 == null)
			method7636(-626996183);
		return ((Class645) this).aHashMap8319.containsKey(object);
	}

	public void method110() {
		/* empty */
	}

	void method7639(RSByteBuffer class572_sub15, int i) {
		if (i == 1) {
			char c = Class118.method2157(class572_sub15.readByte(2064043526), 1768735511);
			aClass283_8313 = ScriptVarType.method3823(c, (byte) 37);
		} else if (2 == i) {
			char c = Class118.method2157(class572_sub15.readByte(1302310324), 1526042206);
			aClass283_8314 = ScriptVarType.method3823(c, (byte) 13);
		} else if (i == 3)
			((Class645) this).aString8316 = class572_sub15.readString(1295706626);
		else if (i == 4)
			((Class645) this).anInt8315 = class572_sub15.readInt(1438177863) * -695451455;
		else if (5 == i || i == 6) {
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).aMap8318 = new HashMap(((Class645) this).anInt8312 * -1678622685);
			for (int i_15_ = 0; i_15_ < -1678622685 * ((Class645) this).anInt8312; i_15_++) {
				int i_16_ = class572_sub15.readInt(784401413);
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class572_sub15.readString(1295706626);
				else
					serializable = new Integer(class572_sub15.readInt(669741453));
				((Class645) this).aMap8318.put(new Integer(i_16_), serializable);
			}
		} else if (i == 7 || 8 == i) {
			int i_17_ = class572_sub15.readUnsignedShort(647518597);
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).anObjectArray8317 = new Object[i_17_];
			for (int i_18_ = 0; i_18_ < -1678622685 * ((Class645) this).anInt8312; i_18_++) {
				int i_19_ = class572_sub15.readUnsignedShort(647518597);
				if (7 == i)
					((Class645) this).anObjectArray8317[i_19_] = class572_sub15.readString(1295706626);
				else
					((Class645) this).anObjectArray8317[i_19_] = new Integer(class572_sub15.readInt(756987533));
			}
		} else if (i == 101)
			aClass283_8313 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(140058040), class572_sub15.readUnsignedSmart(402463074), -2070842599));
		else if (102 == i)
			aClass283_8314 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(1170985608), class572_sub15.readUnsignedSmart(392674005), -1888722513));
	}

	public int method7640(int i) {
		Object object = method7633(i, -2094252435);
		if (null == object)
			return ((Class645) this).anInt8315 * -261599423;
		return ((Integer) object).intValue();
	}

	public int method7641(int i) {
		Object object = method7633(i, -2145054985);
		if (null == object)
			return ((Class645) this).anInt8315 * -261599423;
		return ((Integer) object).intValue();
	}

	void method7642(RSByteBuffer class572_sub15, int i) {
		if (i == 1) {
			char c = Class118.method2157(class572_sub15.readByte(560852534), 1997919364);
			aClass283_8313 = ScriptVarType.method3823(c, (byte) 62);
		} else if (2 == i) {
			char c = Class118.method2157(class572_sub15.readByte(1403593497), 2058211472);
			aClass283_8314 = ScriptVarType.method3823(c, (byte) 106);
		} else if (i == 3)
			((Class645) this).aString8316 = class572_sub15.readString(1295706626);
		else if (i == 4)
			((Class645) this).anInt8315 = class572_sub15.readInt(-850232738) * -695451455;
		else if (5 == i || i == 6) {
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).aMap8318 = new HashMap(((Class645) this).anInt8312 * -1678622685);
			for (int i_20_ = 0; i_20_ < -1678622685 * ((Class645) this).anInt8312; i_20_++) {
				int i_21_ = class572_sub15.readInt(1796251772);
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class572_sub15.readString(1295706626);
				else
					serializable = new Integer(class572_sub15.readInt(705529792));
				((Class645) this).aMap8318.put(new Integer(i_21_), serializable);
			}
		} else if (i == 7 || 8 == i) {
			int i_22_ = class572_sub15.readUnsignedShort(647518597);
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).anObjectArray8317 = new Object[i_22_];
			for (int i_23_ = 0; i_23_ < -1678622685 * ((Class645) this).anInt8312; i_23_++) {
				int i_24_ = class572_sub15.readUnsignedShort(647518597);
				if (7 == i)
					((Class645) this).anObjectArray8317[i_24_] = class572_sub15.readString(1295706626);
				else
					((Class645) this).anObjectArray8317[i_24_] = new Integer(class572_sub15.readInt(1851781428));
			}
		} else if (i == 101)
			aClass283_8313 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(-1037393294), class572_sub15.readUnsignedSmart(1960279193), -1858619043));
		else if (102 == i)
			aClass283_8314 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(304408095), class572_sub15.readUnsignedSmart(-826759476), -2147224668));
	}

	public void method112() {
		/* empty */
	}

	void method7643() {
		HashMap hashmap = new HashMap();
		if (((Class645) this).anObjectArray8317 != null) {
			for (int i = 0; i < ((Class645) this).anObjectArray8317.length; i++) {
				if (((Class645) this).anObjectArray8317[i] != null) {
					Object object = ((Class645) this).anObjectArray8317[i];
					List list = (List) hashmap.get(object);
					if (list == null) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (((Class645) this).aMap8318 != null) {
			Iterator iterator = ((Class645) this).aMap8318.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (null == list) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		((Class645) this).aHashMap8319 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_25_ = list.iterator();
			while (iterator_25_.hasNext()) {
				Integer integer = (Integer) iterator_25_.next();
				is[i++] = integer.intValue();
			}
			if (null == ((Class645) this).anObjectArray8317)
				Arrays.sort(is);
			((Class645) this).aHashMap8319.put(entry.getKey(), is);
		}
	}

	void method7644(RSByteBuffer class572_sub15, int i) {
		if (i == 1) {
			char c = Class118.method2157(class572_sub15.readByte(1078526917), 1659772368);
			aClass283_8313 = ScriptVarType.method3823(c, (byte) 93);
		} else if (2 == i) {
			char c = Class118.method2157(class572_sub15.readByte(576028276), 2105410700);
			aClass283_8314 = ScriptVarType.method3823(c, (byte) 25);
		} else if (i == 3)
			((Class645) this).aString8316 = class572_sub15.readString(1295706626);
		else if (i == 4)
			((Class645) this).anInt8315 = class572_sub15.readInt(2021100319) * -695451455;
		else if (5 == i || i == 6) {
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).aMap8318 = new HashMap(((Class645) this).anInt8312 * -1678622685);
			for (int i_26_ = 0; i_26_ < -1678622685 * ((Class645) this).anInt8312; i_26_++) {
				int i_27_ = class572_sub15.readInt(1906644640);
				java.io.Serializable serializable;
				if (i == 5)
					serializable = class572_sub15.readString(1295706626);
				else
					serializable = new Integer(class572_sub15.readInt(2038502479));
				((Class645) this).aMap8318.put(new Integer(i_27_), serializable);
			}
		} else if (i == 7 || 8 == i) {
			int i_28_ = class572_sub15.readUnsignedShort(647518597);
			((Class645) this).anInt8312 = class572_sub15.readUnsignedShort(647518597) * -700944501;
			((Class645) this).anObjectArray8317 = new Object[i_28_];
			for (int i_29_ = 0; i_29_ < -1678622685 * ((Class645) this).anInt8312; i_29_++) {
				int i_30_ = class572_sub15.readUnsignedShort(647518597);
				if (7 == i)
					((Class645) this).anObjectArray8317[i_30_] = class572_sub15.readString(1295706626);
				else
					((Class645) this).anObjectArray8317[i_30_] = new Integer(class572_sub15.readInt(1435812970));
			}
		} else if (i == 101)
			aClass283_8313 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(578431019), class572_sub15.readUnsignedSmart(1205344530), -2105400966));
		else if (102 == i)
			aClass283_8314 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(-279209155), class572_sub15.readUnsignedSmart(1474849300), -1878928633));
	}

	public static final int method7645(String string, byte i) {
		if (string == null)
			return -1;
		for (int i_31_ = 0; i_31_ < client.anInt8860 * 681720871; i_31_++) {
			if (string.equalsIgnoreCase(client.aClass26Array8863[i_31_].aString209))
				return i_31_;
		}
		return -1;
	}

	static final void method7646(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class658_Sub5.method9027(class73, class83, class441, -1414734042);
	}

	static final void method7647(InterfaceDefinitions class73, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_32_ = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]) - 1);
		int i_33_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		if (i_32_ < 0 || i_32_ > 9)
			throw new RuntimeException();
		Class249.method3433(class73, i_32_, i_33_, class441, -336913980);
	}
}

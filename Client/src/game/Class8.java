package game;

/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Class8 {
	static final int anInt39 = 10;
	static final int anInt40 = 1;
	LinkedHashMap aLinkedHashMap41 = new LinkedHashMap();
	static int[] anIntArray42;
	static int anInt43;

	void method513(int i) {
		Class649 class649 = null;
		do {
			try {
				try {
					class649 = Class504.method6027("3", (client.aClass437_8705.aString5074), true, -1254483317);
					RSByteBuffer class572_sub15 = new RSByteBuffer(5000);
					method521(class572_sub15, -2102726683);
					class649.method7674(class572_sub15.b, 0, -1585139053 * class572_sub15.o, 1021457385);
				} catch (Exception exception) {
					try {
						if (class649 != null)
							class649.method7673(946696576);
					} catch (Exception exception_0_) {
						exception = exception_0_;
					}
					break;
				}
				try {
					if (class649 != null)
						class649.method7673(1268733050);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class649 != null)
						class649.method7673(838880263);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					throw object;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	Class8() {
		this(null);
	}

	void method514(long l, int i, byte i_1_) {
		if (((Class8) this).aLinkedHashMap41.size() >= 10 && !((Class8) this).aLinkedHashMap41.containsKey(Long.valueOf(l))) {
			Iterator iterator = ((Class8) this).aLinkedHashMap41.entrySet().iterator();
			iterator.next();
			iterator.remove();
		}
		((Class8) this).aLinkedHashMap41.put(Long.valueOf(l), Integer.valueOf(i));
		method513(1823102008);
	}

	boolean method515(long l) {
		return ((Class8) this).aLinkedHashMap41.containsKey(Long.valueOf(l));
	}

	int method516(long l) {
		return ((Integer) ((Class8) this).aLinkedHashMap41.get(Long.valueOf(l))).intValue();
	}

	void method517(RSByteBuffer class572_sub15) {
		class572_sub15.writeByte(1, -1384395473);
		class572_sub15.writeByte(((Class8) this).aLinkedHashMap41.size(), -1384395473);
		Iterator iterator = ((Class8) this).aLinkedHashMap41.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class572_sub15.method8514(((Long) entry.getKey()).longValue());
			class572_sub15.writeInt(((Integer) entry.getValue()).intValue(), -1743753997);
		}
	}

	void method518(RSByteBuffer class572_sub15) {
		class572_sub15.writeByte(1, -1384395473);
		class572_sub15.writeByte(((Class8) this).aLinkedHashMap41.size(), -1384395473);
		Iterator iterator = ((Class8) this).aLinkedHashMap41.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class572_sub15.method8514(((Long) entry.getKey()).longValue());
			class572_sub15.writeInt(((Integer) entry.getValue()).intValue(), -1743753997);
		}
	}

	void method519(RSByteBuffer class572_sub15) {
		class572_sub15.writeByte(1, -1384395473);
		class572_sub15.writeByte(((Class8) this).aLinkedHashMap41.size(), -1384395473);
		Iterator iterator = ((Class8) this).aLinkedHashMap41.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class572_sub15.method8514(((Long) entry.getKey()).longValue());
			class572_sub15.writeInt(((Integer) entry.getValue()).intValue(), -1743753997);
		}
	}

	void method520(RSByteBuffer class572_sub15) {
		class572_sub15.writeByte(1, -1384395473);
		class572_sub15.writeByte(((Class8) this).aLinkedHashMap41.size(), -1384395473);
		Iterator iterator = ((Class8) this).aLinkedHashMap41.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class572_sub15.method8514(((Long) entry.getKey()).longValue());
			class572_sub15.writeInt(((Integer) entry.getValue()).intValue(), -1743753997);
		}
	}

	void method521(RSByteBuffer class572_sub15, int i) {
		class572_sub15.writeByte(1, -1384395473);
		class572_sub15.writeByte(((Class8) this).aLinkedHashMap41.size(), -1384395473);
		Iterator iterator = ((Class8) this).aLinkedHashMap41.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			class572_sub15.method8514(((Long) entry.getKey()).longValue());
			class572_sub15.writeInt(((Integer) entry.getValue()).intValue(), -1743753997);
		}
	}

	Class8(RSByteBuffer class572_sub15) {
		if (null != class572_sub15 && null != class572_sub15.b) {
			int i = class572_sub15.readUnsignedByte(1319052938);
			if (i > 0 && i <= 1) {
				int i_2_ = class572_sub15.readUnsignedByte(1067140637);
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
					long l = class572_sub15.method8476((byte) 4);
					int i_4_ = class572_sub15.readInt(1190882744);
					((Class8) this).aLinkedHashMap41.put(Long.valueOf(l), Integer.valueOf(i_4_));
				}
			}
		}
	}

	int method522(long l) {
		return ((Integer) ((Class8) this).aLinkedHashMap41.get(Long.valueOf(l))).intValue();
	}

	void method523() {
		Class649 class649 = null;
		do {
			try {
				try {
					class649 = Class504.method6027("3", (client.aClass437_8705.aString5074), true, -619445646);
					RSByteBuffer class572_sub15 = new RSByteBuffer(5000);
					method521(class572_sub15, -980741865);
					class649.method7674(class572_sub15.b, 0, -1585139053 * class572_sub15.o, -1244718838);
				} catch (Exception exception) {
					try {
						if (class649 != null)
							class649.method7673(1119193338);
					} catch (Exception exception_5_) {
						exception = exception_5_;
					}
					break;
				}
				try {
					if (class649 != null)
						class649.method7673(1146928783);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class649 != null)
						class649.method7673(1031295786);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					throw object;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	void method524() {
		Class649 class649 = null;
		do {
			try {
				try {
					class649 = Class504.method6027("3", (client.aClass437_8705.aString5074), true, -2001635147);
					RSByteBuffer class572_sub15 = new RSByteBuffer(5000);
					method521(class572_sub15, -147216904);
					class649.method7674(class572_sub15.b, 0, -1585139053 * class572_sub15.o, 1514942302);
				} catch (Exception exception) {
					try {
						if (class649 != null)
							class649.method7673(1266784975);
					} catch (Exception exception_6_) {
						exception = exception_6_;
					}
					break;
				}
				try {
					if (class649 != null)
						class649.method7673(1167470430);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					if (class649 != null)
						class649.method7673(2139319277);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					throw object;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	static final void method525(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class468.method5553(class73, class83, class441, -2019525490);
	}

	static final boolean method526(char c, short i) {
		if (Character.isISOControl(c))
			return false;
		if (Class572.method6801(c, (byte) 8))
			return true;
		char[] cs = Class233.aCharArray2636;
		for (int i_7_ = 0; i_7_ < cs.length; i_7_++) {
			char c_8_ = cs[i_7_];
			if (c_8_ == c)
				return true;
		}
		cs = Class233.aCharArray2635;
		for (int i_9_ = 0; i_9_ < cs.length; i_9_++) {
			char c_10_ = cs[i_9_];
			if (c_10_ == c)
				return true;
		}
		return false;
	}

	static final void method527(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_11_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_12_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 1]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_11_, -926932744));
		if (i_12_ >= 1 && i_12_ <= 5 && class631.aStringArray8145[i_12_ - 1] != null)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class631.aStringArray8145[i_12_ - 1];
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}
}

package game;

/* Class538 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.Iterator;

public class Class538 implements Interface73, Interface17 {
	public int anInt6016;
	public int[] anIntArray6017;
	public int[] anIntArray6018;
	public int anInt6019;
	public int anInt6020;
	public int anInt6021;
	public int anInt6022 = -19022545;
	public int anInt6023;
	public int anInt6024;
	public int[][] anIntArrayArray6025;
	public int anInt6026;
	public int anInt6027;
	public int anInt6028;
	public int[][] anIntArrayArray6029;
	public int anInt6030;
	public int anInt6031;
	public int anInt6032;
	public int anInt6033;
	public int anInt6034;
	public int anInt6035;
	public int anInt6036;
	public int anInt6037;
	public int anInt6038;
	public int anInt6039;
	public int anInt6040;
	public int anInt6041;
	public int anInt6042;
	public int anInt6043;
	public int anInt6044;
	public int[] anIntArray6045;
	Class261[] aClass261Array6046;
	public int anInt6047;
	public int[] anIntArray6048;
	public int anInt6049;
	public int anInt6050;
	public int anInt6051;
	public int anInt6052;
	public int anInt6053;
	public int anInt6054;
	int anInt6055;
	public int anInt6056;
	public int anInt6057;
	public int anInt6058;
	public boolean aBool6059;

	public void method104(byte i) {
		/* empty */
	}

	public boolean method6388(int i, byte i_10_) {
		if (i == -1)
			return false;
		if (265246257 * anInt6022 == i)
			return true;
		if (null != anIntArray6017) {
			for (int i_11_ = 0; i_11_ < anIntArray6017.length; i_11_++) {
				if (i == anIntArray6017[i_11_])
					return true;
			}
		}
		return false;
	}

	void method6389(RSByteBuffer class572_sub15, int opcode, int i_12_) {
		System.out.println(opcode);
		if (opcode == 1) {
			anInt6022 = class572_sub15.readBigSmart((byte) 81) * 19022545;
			anInt6058 = class572_sub15.readBigSmart((byte) 126) * 162484423;
		} else if (opcode == 2)
			anInt6030 = class572_sub15.readBigSmart((byte) 38) * 738130903;
		else if (opcode == 3)
			anInt6031 = class572_sub15.readBigSmart((byte) 70) * 1579021739;
		else if (4 == opcode)
			anInt6032 = class572_sub15.readBigSmart((byte) 30) * 1983097175;
		else if (opcode == 5)
			anInt6033 = class572_sub15.readBigSmart((byte) 66) * 438950095;
		else if (6 == opcode)
			anInt6026 = class572_sub15.readBigSmart((byte) 64) * 1226227937;
		else if (7 == opcode)
			anInt6027 = class572_sub15.readBigSmart((byte) 12) * -158750093;
		else if (opcode == 8)
			anInt6028 = class572_sub15.readBigSmart((byte) 72) * -397576193;
		else if (opcode == 9)
			anInt6019 = class572_sub15.readBigSmart((byte) 35) * 1001885913;
		else if (26 == opcode) {
			anInt6040 = ((short) (class572_sub15.readUnsignedByte(1003015838) * 4) * 865786815);
			anInt6041 = ((short) (class572_sub15.readUnsignedByte(315098926) * 4) * 1093337209);
		} else if (opcode == 27) {
			int i_13_ = class572_sub15.readUnsignedByte(175838814);
			if (null == anIntArrayArray6025)
				anIntArrayArray6025 = new int[i_13_ + 1][];
			else if (i_13_ >= anIntArrayArray6025.length)
				anIntArrayArray6025 = (int[][]) Arrays.copyOf(anIntArrayArray6025, 1 + i_13_);
			anIntArrayArray6025[i_13_] = new int[6];
			for (int i_14_ = 0; i_14_ < 6; i_14_++)
				anIntArrayArray6025[i_13_][i_14_] = class572_sub15.readShort(-710976385);
		} else if (28 == opcode) {
			int i_15_ = class572_sub15.readUnsignedByte(1008548364);
			anIntArray6048 = new int[i_15_];
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				anIntArray6048[i_16_] = class572_sub15.readUnsignedByte(292552986);
				if (255 == anIntArray6048[i_16_])
					anIntArray6048[i_16_] = -1;
			}
		} else if (opcode == 29)
			anInt6049 = class572_sub15.readUnsignedByte(341201561) * 231890881;
		else if (opcode == 30)
			anInt6044 = class572_sub15.readUnsignedShort(647518597) * -1228212427;
		else if (opcode == 31)
			anInt6051 = class572_sub15.readUnsignedByte(681498153) * -1869529023;
		else if (32 == opcode)
			anInt6052 = class572_sub15.readUnsignedShort(647518597) * 1026275847;
		else if (33 == opcode)
			anInt6053 = class572_sub15.readShort(-710976385) * 819018877;
		else if (34 == opcode)
			anInt6047 = class572_sub15.readUnsignedByte(1283408308) * 1008400859;
		else if (35 == opcode)
			anInt6035 = class572_sub15.readUnsignedShort(647518597) * 1179723971;
		else if (opcode == 36)
			anInt6050 = class572_sub15.readShort(-710976385) * -912363631;
		else if (opcode == 37)
			anInt6016 = class572_sub15.readUnsignedByte(913962818) * 500441989;
		else if (opcode == 38)
			anInt6020 = class572_sub15.readBigSmart((byte) 22) * -1790093695;
		else if (39 == opcode)
			anInt6037 = class572_sub15.readBigSmart((byte) 114) * -30820467;
		else if (opcode == 40)
			anInt6023 = class572_sub15.readBigSmart((byte) 42) * 627352385;
		else if (41 == opcode)
			anInt6024 = class572_sub15.readBigSmart((byte) 126) * 912312451;
		else if (opcode == 42)
			anInt6021 = class572_sub15.readBigSmart((byte) 74) * 1408462263;
		else if (43 == opcode)
			class572_sub15.readUnsignedShort(647518597);
		else if (44 == opcode)
			class572_sub15.readUnsignedShort(647518597);
		else if (opcode == 45)
			anInt6054 = class572_sub15.readUnsignedShort(647518597) * -2026138985;
		else if (opcode == 46)
			anInt6034 = class572_sub15.readBigSmart((byte) 105) * 167311821;
		else if (47 == opcode)
			anInt6057 = class572_sub15.readBigSmart((byte) 56) * -1831564459;
		else if (opcode == 48)
			anInt6036 = class572_sub15.readBigSmart((byte) 97) * 1898791563;
		else if (opcode == 49)
			anInt6056 = class572_sub15.readBigSmart((byte) 20) * 892449209;
		else if (opcode == 50)
			anInt6038 = class572_sub15.readBigSmart((byte) 84) * 123030213;
		else if (51 == opcode)
			anInt6039 = class572_sub15.readBigSmart((byte) 37) * -2023446939;
		else if (52 == opcode) {
			int i_17_ = class572_sub15.readUnsignedByte(667839694);
			anIntArray6017 = new int[i_17_];
			anIntArray6018 = new int[i_17_];
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
				anIntArray6017[i_18_] = class572_sub15.readBigSmart((byte) 101);
				int i_19_ = class572_sub15.readUnsignedByte(1418361227);
				anIntArray6018[i_18_] = i_19_;
				((Class538) this).anInt6055 += i_19_ * 1296732589;
			}
		} else if (opcode == 53)
			aBool6059 = false;
		else if (54 == opcode) {
			anInt6042 = (class572_sub15.readUnsignedByte(611807636) << 6) * 1013034793;
			anInt6043 = (class572_sub15.readUnsignedByte(606817111) << 6) * -1698544947;
		} else if (55 == opcode) {
			int i_20_ = class572_sub15.readUnsignedByte(1829704978);
			if (null == anIntArray6045)
				anIntArray6045 = new int[i_20_ + 1];
			else if (i_20_ >= anIntArray6045.length)
				anIntArray6045 = Arrays.copyOf(anIntArray6045, 1 + i_20_);
			anIntArray6045[i_20_] = class572_sub15.readUnsignedShort(647518597);
		} else if (opcode == 56) {
			int i_21_ = class572_sub15.readUnsignedByte(730119889);
			if (null == anIntArrayArray6029)
				anIntArrayArray6029 = new int[1 + i_21_][];
			else if (i_21_ >= anIntArrayArray6029.length)
				anIntArrayArray6029 = (int[][]) Arrays.copyOf(anIntArrayArray6029, 1 + i_21_);
			anIntArrayArray6029[i_21_] = new int[3];
			for (int i_22_ = 0; i_22_ < 3; i_22_++)
				anIntArrayArray6029[i_21_][i_22_] = class572_sub15.readShort(-710976385);
		}
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_23_ = class572_sub15.readUnsignedByte(296145265);
			if (i_23_ == 0)
				break;
			method6389(class572_sub15, i_23_, 2142227324);
		}
	}

	public void method469(int i) {
		/* empty */
	}

	Class538() {
		anIntArray6017 = null;
		anIntArray6018 = null;
		((Class538) this).anInt6055 = 0;
		anInt6020 = 1790093695;
		anInt6037 = 30820467;
		anInt6058 = -162484423;
		anInt6023 = -627352385;
		anInt6024 = -912312451;
		anInt6021 = -1408462263;
		anInt6026 = -1226227937;
		anInt6027 = 158750093;
		anInt6028 = 397576193;
		anInt6019 = -1001885913;
		anInt6030 = -738130903;
		anInt6031 = -1579021739;
		anInt6032 = -1983097175;
		anInt6033 = -438950095;
		anInt6034 = -167311821;
		anInt6057 = 1831564459;
		anInt6036 = -1898791563;
		anInt6056 = -892449209;
		anInt6038 = -123030213;
		anInt6039 = 2023446939;
		anInt6040 = 0;
		anInt6041 = 0;
		anInt6042 = 0;
		anInt6043 = 0;
		anInt6049 = 0;
		anInt6044 = 0;
		anInt6051 = 0;
		anInt6052 = 0;
		anInt6053 = 0;
		anInt6047 = 0;
		anInt6035 = 0;
		anInt6050 = 0;
		anInt6016 = -500441989;
		anInt6054 = 2026138985;
		aBool6059 = true;
	}

	public Class261[] method6390(int i) {
		if (((Class538) this).aClass261Array6046 != null)
			return ((Class538) this).aClass261Array6046;
		if (anIntArrayArray6025 == null)
			return null;
		((Class538) this).aClass261Array6046 = new Class261[anIntArrayArray6025.length];
		for (int i_24_ = 0; i_24_ < anIntArrayArray6025.length; i_24_++) {
			int i_25_ = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			int i_28_ = 0;
			int i_29_ = 0;
			int i_30_ = 0;
			if (anIntArrayArray6025[i_24_] != null) {
				i_25_ = anIntArrayArray6025[i_24_][0];
				i_26_ = anIntArrayArray6025[i_24_][1];
				i_27_ = anIntArrayArray6025[i_24_][2];
				i_28_ = anIntArrayArray6025[i_24_][3] << 3;
				i_29_ = anIntArrayArray6025[i_24_][4] << 3;
				i_30_ = anIntArrayArray6025[i_24_][5] << 3;
			}
			if (0 != i_25_ || 0 != i_26_ || 0 != i_27_ || i_28_ != 0 || i_29_ != 0 || 0 != i_30_) {
				Class261 class261 = (((Class538) this).aClass261Array6046[i_24_] = new Class261());
				if (0 != i_30_)
					class261.method3576(0.0F, 0.0F, 1.0F, Class325.method4146(i_30_));
				if (i_28_ != 0)
					class261.method3576(1.0F, 0.0F, 0.0F, Class325.method4146(i_28_));
				if (i_29_ != 0)
					class261.method3576(0.0F, 1.0F, 0.0F, Class325.method4146(i_29_));
				class261.method3580((float) i_25_, (float) i_26_, (float) i_27_);
			}
		}
		return ((Class538) this).aClass261Array6046;
	}

	public int[] method6391(int i) {
		Class676 class676 = new Class676(16);
		Class427.method5191(265246257 * anInt6022, class676, (byte) 58);
		if (null != anIntArray6017) {
			int[] is = anIntArray6017;
			for (int i_31_ = 0; i_31_ < is.length; i_31_++) {
				int i_32_ = is[i_31_];
				Class427.method5191(i_32_, class676, (byte) 14);
			}
		}
		Class427.method5191(anInt6020 * -1303582335, class676, (byte) 19);
		Class427.method5191(-1822530747 * anInt6037, class676, (byte) 48);
		Class427.method5191(anInt6058 * -915509001, class676, (byte) 3);
		Class427.method5191(-312349503 * anInt6023, class676, (byte) -53);
		Class427.method5191(677627435 * anInt6024, class676, (byte) 9);
		Class427.method5191(-295174137 * anInt6021, class676, (byte) -64);
		Class427.method5191(anInt6026 * -182549727, class676, (byte) -18);
		Class427.method5191(-1172829509 * anInt6027, class676, (byte) 56);
		Class427.method5191(-1351448577 * anInt6028, class676, (byte) 25);
		Class427.method5191(anInt6019 * -1871450263, class676, (byte) 56);
		Class427.method5191(anInt6030 * -1506072601, class676, (byte) -32);
		Class427.method5191(1966431491 * anInt6031, class676, (byte) -31);
		Class427.method5191(anInt6032 * -500215193, class676, (byte) 36);
		Class427.method5191(1541680687 * anInt6033, class676, (byte) -50);
		Class427.method5191(1450482437 * anInt6034, class676, (byte) 38);
		Class427.method5191(anInt6057 * 1861949949, class676, (byte) -60);
		Class427.method5191(-1461742301 * anInt6036, class676, (byte) -117);
		Class427.method5191(589890697 * anInt6056, class676, (byte) -75);
		Class427.method5191(anInt6038 * 167879693, class676, (byte) -49);
		Class427.method5191(anInt6039 * -1569809555, class676, (byte) -88);
		int[] is = new int[class676.method7962((byte) 0)];
		int i_33_ = 0;
		Iterator iterator = class676.iterator();
		while (iterator.hasNext()) {
			Class572 class572 = (Class572) iterator.next();
			is[i_33_++] = (int) (381237825124074065L * class572.hash);
		}
		return is;
	}

	public void method468(int i, int i_34_) {
		/* empty */
	}

	public boolean method6392(int i) {
		if (i == -1)
			return false;
		if (265246257 * anInt6022 == i)
			return true;
		if (null != anIntArray6017) {
			for (int i_35_ = 0; i_35_ < anIntArray6017.length; i_35_++) {
				if (i == anIntArray6017[i_35_])
					return true;
			}
		}
		return false;
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(513578819);
			if (i == 0)
				break;
			method6389(class572_sub15, i, 2142227324);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(828805365);
			if (i == 0)
				break;
			method6389(class572_sub15, i, 2142227324);
		}
	}

	public int method6393() {
		if (265246257 * anInt6022 != -1)
			return anInt6022 * 265246257;
		if (null != anIntArray6017) {
			int i = (int) (Math.random() * (double) (-2071004635 * ((Class538) this).anInt6055));
			int i_36_;
			for (i_36_ = 0; i >= anIntArray6018[i_36_]; i_36_++)
				i -= anIntArray6018[i_36_];
			return anIntArray6017[i_36_];
		}
		return -1;
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

	public void method106() {
		/* empty */
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(-6175350);
			if (i == 0)
				break;
			method6389(class572_sub15, i, 2142227324);
		}
	}

	public int method6394(int i) {
		if (265246257 * anInt6022 != -1)
			return anInt6022 * 265246257;
		if (null != anIntArray6017) {
			int i_37_ = (int) (Math.random() * (double) (-2071004635 * ((Class538) this).anInt6055));
			int i_38_;
			for (i_38_ = 0; i_37_ >= anIntArray6018[i_38_]; i_38_++)
				i_37_ -= anIntArray6018[i_38_];
			return anIntArray6017[i_38_];
		}
		return -1;
	}

	void method6395(RSByteBuffer class572_sub15, int i) {
		if (i == 1) {
			anInt6022 = class572_sub15.readBigSmart((byte) 72) * 19022545;
			anInt6058 = class572_sub15.readBigSmart((byte) 73) * 162484423;
		} else if (i == 2)
			anInt6030 = class572_sub15.readBigSmart((byte) 101) * 738130903;
		else if (i == 3)
			anInt6031 = class572_sub15.readBigSmart((byte) 36) * 1579021739;
		else if (4 == i)
			anInt6032 = class572_sub15.readBigSmart((byte) 126) * 1983097175;
		else if (i == 5)
			anInt6033 = class572_sub15.readBigSmart((byte) 100) * 438950095;
		else if (6 == i)
			anInt6026 = class572_sub15.readBigSmart((byte) 10) * 1226227937;
		else if (7 == i)
			anInt6027 = class572_sub15.readBigSmart((byte) 56) * -158750093;
		else if (i == 8)
			anInt6028 = class572_sub15.readBigSmart((byte) 69) * -397576193;
		else if (i == 9)
			anInt6019 = class572_sub15.readBigSmart((byte) 19) * 1001885913;
		else if (26 == i) {
			anInt6040 = ((short) (class572_sub15.readUnsignedByte(221490213) * 4) * 865786815);
			anInt6041 = ((short) (class572_sub15.readUnsignedByte(-69797671) * 4) * 1093337209);
		} else if (i == 27) {
			int i_39_ = class572_sub15.readUnsignedByte(1672532180);
			if (null == anIntArrayArray6025)
				anIntArrayArray6025 = new int[i_39_ + 1][];
			else if (i_39_ >= anIntArrayArray6025.length)
				anIntArrayArray6025 = (int[][]) Arrays.copyOf(anIntArrayArray6025, 1 + i_39_);
			anIntArrayArray6025[i_39_] = new int[6];
			for (int i_40_ = 0; i_40_ < 6; i_40_++)
				anIntArrayArray6025[i_39_][i_40_] = class572_sub15.readShort(-710976385);
		} else if (28 == i) {
			int i_41_ = class572_sub15.readUnsignedByte(1488739887);
			anIntArray6048 = new int[i_41_];
			for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
				anIntArray6048[i_42_] = class572_sub15.readUnsignedByte(1702677049);
				if (255 == anIntArray6048[i_42_])
					anIntArray6048[i_42_] = -1;
			}
		} else if (i == 29)
			anInt6049 = class572_sub15.readUnsignedByte(721658155) * 231890881;
		else if (i == 30)
			anInt6044 = class572_sub15.readUnsignedShort(647518597) * -1228212427;
		else if (i == 31)
			anInt6051 = class572_sub15.readUnsignedByte(1898924007) * -1869529023;
		else if (32 == i)
			anInt6052 = class572_sub15.readUnsignedShort(647518597) * 1026275847;
		else if (33 == i)
			anInt6053 = class572_sub15.readShort(-710976385) * 819018877;
		else if (34 == i)
			anInt6047 = class572_sub15.readUnsignedByte(1987286762) * 1008400859;
		else if (35 == i)
			anInt6035 = class572_sub15.readUnsignedShort(647518597) * 1179723971;
		else if (i == 36)
			anInt6050 = class572_sub15.readShort(-710976385) * -912363631;
		else if (i == 37)
			anInt6016 = class572_sub15.readUnsignedByte(1099741821) * 500441989;
		else if (i == 38)
			anInt6020 = class572_sub15.readBigSmart((byte) 42) * -1790093695;
		else if (39 == i)
			anInt6037 = class572_sub15.readBigSmart((byte) 66) * -30820467;
		else if (i == 40)
			anInt6023 = class572_sub15.readBigSmart((byte) 69) * 627352385;
		else if (41 == i)
			anInt6024 = class572_sub15.readBigSmart((byte) 16) * 912312451;
		else if (i == 42)
			anInt6021 = class572_sub15.readBigSmart((byte) 108) * 1408462263;
		else if (43 == i)
			class572_sub15.readUnsignedShort(647518597);
		else if (44 == i)
			class572_sub15.readUnsignedShort(647518597);
		else if (i == 45)
			anInt6054 = class572_sub15.readUnsignedShort(647518597) * -2026138985;
		else if (i == 46)
			anInt6034 = class572_sub15.readBigSmart((byte) 69) * 167311821;
		else if (47 == i)
			anInt6057 = class572_sub15.readBigSmart((byte) 39) * -1831564459;
		else if (i == 48)
			anInt6036 = class572_sub15.readBigSmart((byte) 57) * 1898791563;
		else if (i == 49)
			anInt6056 = class572_sub15.readBigSmart((byte) 58) * 892449209;
		else if (i == 50)
			anInt6038 = class572_sub15.readBigSmart((byte) 96) * 123030213;
		else if (51 == i)
			anInt6039 = class572_sub15.readBigSmart((byte) 113) * -2023446939;
		else if (52 == i) {
			int i_43_ = class572_sub15.readUnsignedByte(1550193568);
			anIntArray6017 = new int[i_43_];
			anIntArray6018 = new int[i_43_];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				anIntArray6017[i_44_] = class572_sub15.readBigSmart((byte) 22);
				int i_45_ = class572_sub15.readUnsignedByte(581590723);
				anIntArray6018[i_44_] = i_45_;
				((Class538) this).anInt6055 += i_45_ * 1296732589;
			}
		} else if (i == 53)
			aBool6059 = false;
		else if (54 == i) {
			anInt6042 = (class572_sub15.readUnsignedByte(164407563) << 6) * 1013034793;
			anInt6043 = (class572_sub15.readUnsignedByte(1847123641) << 6) * -1698544947;
		} else if (55 == i) {
			int i_46_ = class572_sub15.readUnsignedByte(-112106310);
			if (null == anIntArray6045)
				anIntArray6045 = new int[i_46_ + 1];
			else if (i_46_ >= anIntArray6045.length)
				anIntArray6045 = Arrays.copyOf(anIntArray6045, 1 + i_46_);
			anIntArray6045[i_46_] = class572_sub15.readUnsignedShort(647518597);
		} else if (i == 56) {
			int i_47_ = class572_sub15.readUnsignedByte(1670586399);
			if (null == anIntArrayArray6029)
				anIntArrayArray6029 = new int[1 + i_47_][];
			else if (i_47_ >= anIntArrayArray6029.length)
				anIntArrayArray6029 = (int[][]) Arrays.copyOf(anIntArrayArray6029, 1 + i_47_);
			anIntArrayArray6029[i_47_] = new int[3];
			for (int i_48_ = 0; i_48_ < 3; i_48_++)
				anIntArrayArray6029[i_47_][i_48_] = class572_sub15.readShort(-710976385);
		}
	}

	Class538(int i) {
		anIntArray6017 = null;
		anIntArray6018 = null;
		((Class538) this).anInt6055 = 0;
		anInt6020 = 1790093695;
		anInt6037 = 30820467;
		anInt6058 = -162484423;
		anInt6023 = -627352385;
		anInt6024 = -912312451;
		anInt6021 = -1408462263;
		anInt6026 = -1226227937;
		anInt6027 = 158750093;
		anInt6028 = 397576193;
		anInt6019 = -1001885913;
		anInt6030 = -738130903;
		anInt6031 = -1579021739;
		anInt6032 = -1983097175;
		anInt6033 = -438950095;
		anInt6034 = -167311821;
		anInt6057 = 1831564459;
		anInt6036 = -1898791563;
		anInt6056 = -892449209;
		anInt6038 = -123030213;
		anInt6039 = 2023446939;
		anInt6040 = 0;
		anInt6041 = 0;
		anInt6042 = 0;
		anInt6043 = 0;
		anInt6049 = 0;
		anInt6044 = 0;
		anInt6051 = 0;
		anInt6052 = 0;
		anInt6053 = 0;
		anInt6047 = 0;
		anInt6035 = 0;
		anInt6050 = 0;
		anInt6016 = -500441989;
		anInt6054 = 2026138985;
		aBool6059 = true;
	}

	public int method6396() {
		if (265246257 * anInt6022 != -1)
			return anInt6022 * 265246257;
		if (null != anIntArray6017) {
			int i = (int) (Math.random() * (double) (-2071004635 * ((Class538) this).anInt6055));
			int i_49_;
			for (i_49_ = 0; i >= anIntArray6018[i_49_]; i_49_++)
				i -= anIntArray6018[i_49_];
			return anIntArray6017[i_49_];
		}
		return -1;
	}

	public boolean method6397(int i) {
		if (i == -1)
			return false;
		if (265246257 * anInt6022 == i)
			return true;
		if (null != anIntArray6017) {
			for (int i_50_ = 0; i_50_ < anIntArray6017.length; i_50_++) {
				if (i == anIntArray6017[i_50_])
					return true;
			}
		}
		return false;
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1709438213);
			if (i == 0)
				break;
			method6389(class572_sub15, i, 2142227324);
		}
	}

	static final void method6398(Class456_Sub1 class456_sub1, int i, boolean bool, byte i_51_) {
		Class133_Sub4.method9341(class456_sub1, i, false, bool, -747337788);
	}

	static void method6399(InterfaceDefinitions class73, int i, int i_52_, byte i_53_) {
		if (class73.aByte811 == 0)
			class73.anInt762 = -486052645 * class73.anInt819;
		else if (class73.aByte811 == 1)
			class73.anInt762 = (329065219 * class73.anInt819 + (i - class73.anInt764 * 669238293) / 2) * -1222476983;
		else if (class73.aByte811 == 2)
			class73.anInt762 = (i - class73.anInt764 * 669238293 - 329065219 * class73.anInt819) * -1222476983;
		else if (class73.aByte811 == 3)
			class73.anInt762 = (class73.anInt819 * 329065219 * i >> 14) * -1222476983;
		else if (class73.aByte811 == 4)
			class73.anInt762 = ((i - 669238293 * class73.anInt764) / 2 + (329065219 * class73.anInt819 * i >> 14)) * -1222476983;
		else
			class73.anInt762 = -1222476983 * (i - class73.anInt764 * 669238293 - (class73.anInt819 * 329065219 * i >> 14));
		if (0 == class73.aByte755)
			class73.anInt842 = class73.anInt793 * -1776972733;
		else if (1 == class73.aByte755)
			class73.anInt842 = (class73.anInt793 * -885681489 + (i_52_ - class73.anInt765 * 1360982075) / 2) * -314551123;
		else if (class73.aByte755 == 2)
			class73.anInt842 = (i_52_ - class73.anInt765 * 1360982075 - class73.anInt793 * -885681489) * -314551123;
		else if (class73.aByte755 == 3)
			class73.anInt842 = -314551123 * (class73.anInt793 * -885681489 * i_52_ >> 14);
		else if (4 == class73.aByte755)
			class73.anInt842 = -314551123 * ((i_52_ - class73.anInt765 * 1360982075) / 2 + (i_52_ * (-885681489 * class73.anInt793) >> 14));
		else
			class73.anInt842 = -314551123 * (i_52_ - 1360982075 * class73.anInt765 - (i_52_ * (class73.anInt793 * -885681489) >> 14));
		if (client.aBool8763 && (client.method7992(class73).anInt9311 * 2066234753 != 0 || 0 == class73.anInt752 * -1285279191)) {
			if (278882041 * class73.anInt762 < 0)
				class73.anInt762 = 0;
			else if ((class73.anInt764 * 669238293 + class73.anInt762 * 278882041) > i)
				class73.anInt762 = (i - 669238293 * class73.anInt764) * -1222476983;
			if (-1681379547 * class73.anInt842 < 0)
				class73.anInt842 = 0;
			else if ((class73.anInt842 * -1681379547 + class73.anInt765 * 1360982075) > i_52_)
				class73.anInt842 = -314551123 * (i_52_ - class73.anInt765 * 1360982075);
		}
	}

	static void method6400(Class250 class250, int i) {
		Class25.aClass250_189.method3442(class250);
	}
}

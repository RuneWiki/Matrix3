package game;

/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class VarBitDefinition implements Interface16 {
	int baseVarId = -930304787;
	Class338 loader;
	public VarDefinition baseVar;
	int startBit;
	int endBit;
	String debugName;
	VarDomainType domain;
	public int id;
	static int[] anIntArray5031 = new int[32];

	public void method108(RSByteBuffer class572_sub15) {
		method5217(class572_sub15, false, -2089515238);
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		method5217(class572_sub15, false, -1137901843);
	}

	public void method105(RSByteBuffer class572_sub15) {
		method5217(class572_sub15, false, -2026052648);
	}

	public void method104(byte i) {
		/* empty */
	}

	void method5216(RSByteBuffer class572_sub15, int i, boolean bool, int i_0_) {
		Class422 class422 = (Class422) Class455.method5387(Class602.method7088(1722858026), i, -1885585674);
		switch (((Class422) class422).anInt4980 * -651042559) {
			case 4:
				break;
			default:
				break;
			case 10:
				((VarBitDefinition) this).startBit = class572_sub15.readUnsignedByte(1731235101) * 1958647231;
				((VarBitDefinition) this).endBit = class572_sub15.readUnsignedByte(914150984) * -358152879;
				break;
			case 12: {
				int i_1_ = class572_sub15.readUnsignedByte(877009753);
				((VarBitDefinition) this).domain = ((VarDomainType) Class455.method5387(VarDomainType.method3673((byte) 119), i_1_, -2003266424));
				if (((VarBitDefinition) this).domain == null)
					throw new IllegalStateException("");
				((VarBitDefinition) this).baseVarId = class572_sub15.readBigSmart((byte) 50) * 930304787;
				if (((VarBitDefinition) this).loader != null) {
					Interface18 interface18 = ((Interface18) ((Class338) ((VarBitDefinition) this).loader).aMap4321.get(((VarBitDefinition) this).domain));
					if (interface18 != null)
						baseVar = ((VarDefinition) interface18.getDefinition((-1676972261 * (((VarBitDefinition) this).baseVarId)), 1054284231));
					else if (!bool)
						throw new IllegalStateException("");
				}
			}
		}
	}

	void method5217(RSByteBuffer class572_sub15, boolean bool, int i) {
		for (;;) {
			int i_2_ = class572_sub15.readUnsignedByte(1422117630);
			if (i_2_ == 0)
				break;
			method5216(class572_sub15, i_2_, bool, 1863760437);
		}
	}

	public void method110() {
		/* empty */
	}

	public int method5218(int i, byte i_3_) {
		int i_4_ = anIntArray5031[(((VarBitDefinition) this).endBit * 306668465 - -1601414593 * ((VarBitDefinition) this).startBit)];
		return i >> ((VarBitDefinition) this).startBit * -1601414593 & i_4_;
	}

	public void method111(RSByteBuffer class572_sub15) {
		method5217(class572_sub15, false, 929328697);
	}

	public void method107(RSByteBuffer class572_sub15) {
		method5217(class572_sub15, false, 2043088819);
	}

	public void method103() {
		/* empty */
	}

	static {
		int i = 2;
		for (int i_5_ = 0; i_5_ < 32; i_5_++) {
			anIntArray5031[i_5_] = i - 1;
			i += i;
		}
	}

	public int method5219(int i, int i_6_) throws Exception_Sub2 {
		int i_7_ = anIntArray5031[(306668465 * ((VarBitDefinition) this).endBit - ((VarBitDefinition) this).startBit * -1601414593)];
		if (i_6_ < 0 || i_6_ > i_7_)
			throw new Exception_Sub2((((VarBitDefinition) this).debugName != null ? ((VarBitDefinition) this).debugName : Integer.toString(id * 1242136343)), i_6_, i_7_);
		i_7_ <<= ((VarBitDefinition) this).startBit * -1601414593;
		return (i & (i_7_ ^ 0xffffffff) | i_6_ << ((VarBitDefinition) this).startBit * -1601414593 & i_7_);
	}

	public void method112() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	VarBitDefinition(int i, Class338 class338) {
		id = 590456999 * i;
		((VarBitDefinition) this).loader = class338;
	}

	public int method5220(int i) {
		int i_8_ = anIntArray5031[(((VarBitDefinition) this).endBit * 306668465 - -1601414593 * ((VarBitDefinition) this).startBit)];
		return i >> ((VarBitDefinition) this).startBit * -1601414593 & i_8_;
	}

	public int method5221(int i) {
		int i_9_ = anIntArray5031[(((VarBitDefinition) this).endBit * 306668465 - -1601414593 * ((VarBitDefinition) this).startBit)];
		return i >> ((VarBitDefinition) this).startBit * -1601414593 & i_9_;
	}

	public int method5222(int i) {
		int i_10_ = anIntArray5031[(((VarBitDefinition) this).endBit * 306668465 - -1601414593 * ((VarBitDefinition) this).startBit)];
		return i >> ((VarBitDefinition) this).startBit * -1601414593 & i_10_;
	}

	public int method5223(int i, int i_11_) throws Exception_Sub2 {
		int i_12_ = anIntArray5031[(306668465 * ((VarBitDefinition) this).endBit - ((VarBitDefinition) this).startBit * -1601414593)];
		if (i_11_ < 0 || i_11_ > i_12_)
			throw new Exception_Sub2((((VarBitDefinition) this).debugName != null ? ((VarBitDefinition) this).debugName : Integer.toString(id * 1242136343)), i_11_, i_12_);
		i_12_ <<= ((VarBitDefinition) this).startBit * -1601414593;
		return (i & (i_12_ ^ 0xffffffff) | i_11_ << ((VarBitDefinition) this).startBit * -1601414593 & i_12_);
	}

	public int method5224(int i, int i_13_, byte i_14_) throws Exception_Sub2 {
		int i_15_ = anIntArray5031[(306668465 * ((VarBitDefinition) this).endBit - ((VarBitDefinition) this).startBit * -1601414593)];
		if (i_13_ < 0 || i_13_ > i_15_)
			throw new Exception_Sub2((((VarBitDefinition) this).debugName != null ? ((VarBitDefinition) this).debugName : Integer.toString(id * 1242136343)), i_13_, i_15_);
		i_15_ <<= ((VarBitDefinition) this).startBit * -1601414593;
		return (i & (i_15_ ^ 0xffffffff) | i_13_ << ((VarBitDefinition) this).startBit * -1601414593 & i_15_);
	}

	public int method5225(int i, int i_16_) throws Exception_Sub2 {
		int i_17_ = anIntArray5031[(306668465 * ((VarBitDefinition) this).endBit - ((VarBitDefinition) this).startBit * -1601414593)];
		if (i_16_ < 0 || i_16_ > i_17_)
			throw new Exception_Sub2((((VarBitDefinition) this).debugName != null ? ((VarBitDefinition) this).debugName : Integer.toString(id * 1242136343)), i_16_, i_17_);
		i_17_ <<= ((VarBitDefinition) this).startBit * -1601414593;
		return (i & (i_17_ ^ 0xffffffff) | i_16_ << ((VarBitDefinition) this).startBit * -1601414593 & i_17_);
	}

	public static void method5226(float[] fs, int[] is, int i, int i_18_, short i_19_) {
		if (i < i_18_) {
			int i_20_ = (i_18_ + i) / 2;
			int i_21_ = i;
			float f = fs[i_20_];
			fs[i_20_] = fs[i_18_];
			fs[i_18_] = f;
			int i_22_ = is[i_20_];
			is[i_20_] = is[i_18_];
			is[i_18_] = i_22_;
			for (int i_23_ = i; i_23_ < i_18_; i_23_++) {
				if (fs[i_23_] > f) {
					float f_24_ = fs[i_23_];
					fs[i_23_] = fs[i_21_];
					fs[i_21_] = f_24_;
					int i_25_ = is[i_23_];
					is[i_23_] = is[i_21_];
					is[i_21_++] = i_25_;
				}
			}
			fs[i_18_] = fs[i_21_];
			fs[i_21_] = f;
			is[i_18_] = is[i_21_];
			is[i_21_] = i_22_;
			method5226(fs, is, i, i_21_ - 1, (short) -11304);
			method5226(fs, is, 1 + i_21_, i_18_, (short) 23614);
		}
	}

	static final void method5227(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt892 = -1772508733;
		class73.anInt803 = client.anInt8728 * 903518299;
		class73.anInt794 = 0;
		if (-1 == class73.activeComponent * -1665128073 && !class83.aBool1079)
			Class309.method4043(-1718435171 * class73.selfId, 370014696);
	}

	static final void method5228(int i) {
		Class131.aClass639_Sub2_1540.method7573(403558246);
		Class314.aClass639_Sub6_3814.method7573(2095667177);
		Class664.aClass639_Sub22_8490.method7573(-1109069776);
		client.aClass613_8605.method7288(2134126795).method7573(-1832501158);
		Class197.aClass639_Sub15_2360.method7573(-2117715947);
		Class672.aClass639_Sub5_8533.method7573(-1652054083);
		Class26.aClass639_Sub18_217.method7573(-1071159161);
		Class667.aClass639_Sub10_8509.method7573(-2032249528);
		Class40_Sub1.aClass639_Sub19_9950.method7573(-1994899838);
		Class472.aClass202_Sub1_Sub1_5310.method10203(-1334321236);
		Class624.aClass202_Sub1_Sub2_8080.method10211(215301042);
		Class92.aClass202_Sub1_Sub2_1240.method10211(-1441623862);
		Class544.aClass202_Sub1_Sub2_6109.method10211(535850216);
		Class232.aClass202_Sub1_Sub2_2632.method10211(368101109);
		Class197.aClass639_Sub11_2359.method7573(-1915316900);
		Class560.aClass639_Sub1_6348.method7573(-389676521);
		Class323.aClass639_Sub12_4081.method7573(1047116708);
		Class273.aClass639_Sub3_2901.method7573(658407173);
		Class629.aClass639_Sub20_8111.method7573(-1406421486);
		Class300.aClass639_Sub13_3489.method7573(123729472);
		Class565.aClass639_Sub7_6360.method7573(2015674627);
		Class653.aClass639_Sub9_8398.method7573(1949079687);
		Class319.aClass639_Sub17_3889.method7573(1624788028);
		Class506.aClass639_Sub21_5598.method7573(-24045070);
		Class457.method5429(-1473238032);
		Class69.method1071((byte) 24);
		Class133_Sub20.aClass324_10261.method4140(-877580992);
		Class412.method5069(-1440148162);
		Class177.method2765(1018275558);
		client.aClass127_8583.method2234((byte) 15);
		client.aClass127_8618.method2234((byte) 43);
		Class25.aClass127_194.method2234((byte) 30);
		Class439.aClass127_5083.method2234((byte) 93);
		client.aClass127_8631.method2234((byte) -5);
	}

	static final void method5229(int i, int i_26_, int i_27_, int i_28_, int i_29_) {
		for (int i_30_ = 0; i_30_ < 983810053 * client.anInt8560; i_30_++) {
			Rectangle rectangle = client.aRectangleArray8708[i_30_];
			if (rectangle.width + rectangle.x > i && rectangle.x < i + i_27_ && rectangle.height + rectangle.y > i_26_ && rectangle.y < i_26_ + i_28_)
				client.aBoolArray8784[i_30_] = true;
		}
	}

	static Class284 method5230(int i) {
		Class284 class284;
		if (Class25.aBool191) {
			if (null != Class72.aClass102_722 && Class572_Sub30.aClass284_9312 != null)
				class284 = Class572_Sub30.aClass284_9312;
			else
				class284 = Class318.aClass284_3875;
		} else
			class284 = Class318.aClass284_3875;
		Class25.anInt162 = class284.anInt3413 * -29076883 + 2066950963 * class284.anInt3412;
		return class284;
	}

	static final void method5231(Cs2Executor class441, int i) {
		int i_31_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3741, client.aClass195_8589.aClass650_2340, 372393840);
		class572_sub25.aRsByteBuffer.writeShort(i_31_, -2141693926);
		client.aClass195_8589.method2929(class572_sub25, (byte) -62);
	}
}

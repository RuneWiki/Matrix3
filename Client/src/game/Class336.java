package game;

/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class336 {
	static final int anInt4290 = 14;
	int anInt4291 = 1857893229;
	Class675 aClass675_4292 = new Class675();
	long aLong4293;
	static final int anInt4294 = 12;
	static final int anInt4295 = 3;
	static final int anInt4296 = 2;
	static final int anInt4297 = 5;
	static final int anInt4298 = 6;
	static final int anInt4299 = 7;
	static final int anInt4300 = 4;
	static final int anInt4301 = 8;
	static final int anInt4302 = 1;
	static final int anInt4303 = 11;
	static final int anInt4304 = 9;
	static final int anInt4305 = 13;
	static final int anInt4306 = 10;
	public static int anInt4307;

	public void method4228(Class334 class334, byte i) {
		if ((1822129194726905075L * ((Class334) class334).aLong4268 != 6566714653987233407L * ((Class336) this).aLong4293) || (1312207227 * ((Class334) class334).anInt4265 != ((Class336) this).anInt4291 * 1422012827))
			throw new RuntimeException("");
		for (Class572_Sub16 class572_sub16 = ((Class572_Sub16) ((Class336) this).aClass675_4292.method7932((byte) 50)); class572_sub16 != null; class572_sub16 = (Class572_Sub16) ((Class336) this).aClass675_4292.method7926(202787923))
			class572_sub16.method8560(class334, (byte) -51);
		((Class334) class334).anInt4265 += -1030257229;
	}

	void method4229(RSByteBuffer class572_sub15, int i) {
		((Class336) this).aLong4293 = class572_sub15.method8476((byte) 4) * -2957385671880547969L;
		((Class336) this).anInt4291 = class572_sub15.readInt(569076815) * -1857893229;
		for (int i_0_ = class572_sub15.readUnsignedByte(1969238007); 0 != i_0_; i_0_ = class572_sub15.readUnsignedByte(803797875)) {
			Class572_Sub16 class572_sub16;
			if (i_0_ == 3)
				class572_sub16 = new Class572_Sub16_Sub8(this);
			else if (1 == i_0_)
				class572_sub16 = new Class572_Sub16_Sub3(this);
			else if (i_0_ == 13)
				class572_sub16 = new Class572_Sub16_Sub10(this);
			else if (i_0_ == 4)
				class572_sub16 = new Class572_Sub16_Sub11(this);
			else if (6 == i_0_)
				class572_sub16 = new Class572_Sub16_Sub1(this);
			else if (5 == i_0_)
				class572_sub16 = new Class572_Sub16_Sub14(this);
			else if (2 == i_0_)
				class572_sub16 = new Class572_Sub16_Sub2(this);
			else if (i_0_ == 7)
				class572_sub16 = new Class572_Sub16_Sub7(this);
			else if (14 == i_0_)
				class572_sub16 = new Class572_Sub16_Sub4(this);
			else if (i_0_ == 8)
				class572_sub16 = new Class572_Sub16_Sub13(this);
			else if (i_0_ == 9)
				class572_sub16 = new Class572_Sub16_Sub9(this);
			else if (10 == i_0_)
				class572_sub16 = new Class572_Sub16_Sub5(this);
			else if (11 == i_0_)
				class572_sub16 = new Class572_Sub16_Sub6(this);
			else if (i_0_ == 12)
				class572_sub16 = new Class572_Sub16_Sub12(this);
			else
				throw new RuntimeException("");
			class572_sub16.method8565(class572_sub15, -1751586532);
			((Class336) this).aClass675_4292.method7940(class572_sub16, -1859258650);
		}
	}

	public Class336(RSByteBuffer class572_sub15) {
		method4229(class572_sub15, -1710060633);
	}

	void method4230(RSByteBuffer class572_sub15) {
		((Class336) this).aLong4293 = class572_sub15.method8476((byte) 4) * -2957385671880547969L;
		((Class336) this).anInt4291 = class572_sub15.readInt(-542709154) * -1857893229;
		for (int i = class572_sub15.readUnsignedByte(27363911); 0 != i; i = class572_sub15.readUnsignedByte(1884742926)) {
			Class572_Sub16 class572_sub16;
			if (i == 3)
				class572_sub16 = new Class572_Sub16_Sub8(this);
			else if (1 == i)
				class572_sub16 = new Class572_Sub16_Sub3(this);
			else if (i == 13)
				class572_sub16 = new Class572_Sub16_Sub10(this);
			else if (i == 4)
				class572_sub16 = new Class572_Sub16_Sub11(this);
			else if (6 == i)
				class572_sub16 = new Class572_Sub16_Sub1(this);
			else if (5 == i)
				class572_sub16 = new Class572_Sub16_Sub14(this);
			else if (2 == i)
				class572_sub16 = new Class572_Sub16_Sub2(this);
			else if (i == 7)
				class572_sub16 = new Class572_Sub16_Sub7(this);
			else if (14 == i)
				class572_sub16 = new Class572_Sub16_Sub4(this);
			else if (i == 8)
				class572_sub16 = new Class572_Sub16_Sub13(this);
			else if (i == 9)
				class572_sub16 = new Class572_Sub16_Sub9(this);
			else if (10 == i)
				class572_sub16 = new Class572_Sub16_Sub5(this);
			else if (11 == i)
				class572_sub16 = new Class572_Sub16_Sub6(this);
			else if (i == 12)
				class572_sub16 = new Class572_Sub16_Sub12(this);
			else
				throw new RuntimeException("");
			class572_sub16.method8565(class572_sub15, -68782692);
			((Class336) this).aClass675_4292.method7940(class572_sub16, -1704742569);
		}
	}

	public void method4231(Class334 class334) {
		if ((1822129194726905075L * ((Class334) class334).aLong4268 != 6566714653987233407L * ((Class336) this).aLong4293) || (1312207227 * ((Class334) class334).anInt4265 != ((Class336) this).anInt4291 * 1422012827))
			throw new RuntimeException("");
		for (Class572_Sub16 class572_sub16 = ((Class572_Sub16) ((Class336) this).aClass675_4292.method7932((byte) 50)); class572_sub16 != null; class572_sub16 = (Class572_Sub16) ((Class336) this).aClass675_4292.method7926(395595772))
			class572_sub16.method8560(class334, (byte) 8);
		((Class334) class334).anInt4265 += -1030257229;
	}

	void method4232(RSByteBuffer class572_sub15) {
		((Class336) this).aLong4293 = class572_sub15.method8476((byte) 4) * -2957385671880547969L;
		((Class336) this).anInt4291 = class572_sub15.readInt(229030671) * -1857893229;
		for (int i = class572_sub15.readUnsignedByte(194135856); 0 != i; i = class572_sub15.readUnsignedByte(1431042176)) {
			Class572_Sub16 class572_sub16;
			if (i == 3)
				class572_sub16 = new Class572_Sub16_Sub8(this);
			else if (1 == i)
				class572_sub16 = new Class572_Sub16_Sub3(this);
			else if (i == 13)
				class572_sub16 = new Class572_Sub16_Sub10(this);
			else if (i == 4)
				class572_sub16 = new Class572_Sub16_Sub11(this);
			else if (6 == i)
				class572_sub16 = new Class572_Sub16_Sub1(this);
			else if (5 == i)
				class572_sub16 = new Class572_Sub16_Sub14(this);
			else if (2 == i)
				class572_sub16 = new Class572_Sub16_Sub2(this);
			else if (i == 7)
				class572_sub16 = new Class572_Sub16_Sub7(this);
			else if (14 == i)
				class572_sub16 = new Class572_Sub16_Sub4(this);
			else if (i == 8)
				class572_sub16 = new Class572_Sub16_Sub13(this);
			else if (i == 9)
				class572_sub16 = new Class572_Sub16_Sub9(this);
			else if (10 == i)
				class572_sub16 = new Class572_Sub16_Sub5(this);
			else if (11 == i)
				class572_sub16 = new Class572_Sub16_Sub6(this);
			else if (i == 12)
				class572_sub16 = new Class572_Sub16_Sub12(this);
			else
				throw new RuntimeException("");
			class572_sub16.method8565(class572_sub15, -71468963);
			((Class336) this).aClass675_4292.method7940(class572_sub16, -1987881067);
		}
	}

	public void method4233(Class334 class334) {
		if ((1822129194726905075L * ((Class334) class334).aLong4268 != 6566714653987233407L * ((Class336) this).aLong4293) || (1312207227 * ((Class334) class334).anInt4265 != ((Class336) this).anInt4291 * 1422012827))
			throw new RuntimeException("");
		for (Class572_Sub16 class572_sub16 = ((Class572_Sub16) ((Class336) this).aClass675_4292.method7932((byte) 50)); class572_sub16 != null; class572_sub16 = (Class572_Sub16) ((Class336) this).aClass675_4292.method7926(489845386))
			class572_sub16.method8560(class334, (byte) 23);
		((Class334) class334).anInt4265 += -1030257229;
	}

	void method4234(RSByteBuffer class572_sub15) {
		((Class336) this).aLong4293 = class572_sub15.method8476((byte) 4) * -2957385671880547969L;
		((Class336) this).anInt4291 = class572_sub15.readInt(285620189) * -1857893229;
		for (int i = class572_sub15.readUnsignedByte(660893360); 0 != i; i = class572_sub15.readUnsignedByte(1487124140)) {
			Class572_Sub16 class572_sub16;
			if (i == 3)
				class572_sub16 = new Class572_Sub16_Sub8(this);
			else if (1 == i)
				class572_sub16 = new Class572_Sub16_Sub3(this);
			else if (i == 13)
				class572_sub16 = new Class572_Sub16_Sub10(this);
			else if (i == 4)
				class572_sub16 = new Class572_Sub16_Sub11(this);
			else if (6 == i)
				class572_sub16 = new Class572_Sub16_Sub1(this);
			else if (5 == i)
				class572_sub16 = new Class572_Sub16_Sub14(this);
			else if (2 == i)
				class572_sub16 = new Class572_Sub16_Sub2(this);
			else if (i == 7)
				class572_sub16 = new Class572_Sub16_Sub7(this);
			else if (14 == i)
				class572_sub16 = new Class572_Sub16_Sub4(this);
			else if (i == 8)
				class572_sub16 = new Class572_Sub16_Sub13(this);
			else if (i == 9)
				class572_sub16 = new Class572_Sub16_Sub9(this);
			else if (10 == i)
				class572_sub16 = new Class572_Sub16_Sub5(this);
			else if (11 == i)
				class572_sub16 = new Class572_Sub16_Sub6(this);
			else if (i == 12)
				class572_sub16 = new Class572_Sub16_Sub12(this);
			else
				throw new RuntimeException("");
			class572_sub16.method8565(class572_sub15, 1058229103);
			((Class336) this).aClass675_4292.method7940(class572_sub16, -2010442166);
		}
	}

	static Class517 method4235(RSByteBuffer class572_sub15, int i) {
		int i_1_ = class572_sub15.readUnsignedByte(1887241656);
		int i_2_ = class572_sub15.readUnsignedByte(109235145);
		return new Class517(i_1_, i_2_);
	}

	static final void method4236(InterfaceDefinitions class73, Cs2Executor class441, byte i) {
		if (client.method7992(class73).method8645((byte) 5) && null == client.aClass73_8762) {
			Class200.method2993(class73.selfId * -1718435171, -1665128073 * class73.activeComponent, (byte) -2);
			client.aClass73_8762 = Class530.method6338(-1718435171 * class73.selfId, -1665128073 * class73.activeComponent, -1521116515);
			Class555.method6575(client.aClass73_8762, (short) 9752);
		}
	}

	static final void method4237(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		class73.anInt819 = 1043259307 * (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		class73.anInt793 = -1914502065 * (((Cs2Executor) class441).intStack[1 + (((Cs2Executor) class441).intStackPtr * 1369304407)]);
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 2]);
		if (i_3_ < 0)
			i_3_ = 0;
		else if (i_3_ > 5)
			i_3_ = 5;
		int i_4_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 3]);
		if (i_4_ < 0)
			i_4_ = 0;
		else if (i_4_ > 5)
			i_4_ = 5;
		class73.aByte811 = (byte) i_3_;
		class73.aByte755 = (byte) i_4_;
		Class555.method6575(class73, (short) 1463);
		Class179_Sub1.method9993(class83, class73, 1140693553);
		if (class73.anInt752 * -1285279191 == 0)
			Class496.method5923(class83, class73, false, (byte) -80);
		if (-1 == -1665128073 * class73.activeComponent && !class83.aBool1079)
			Class7.method511(class73.selfId * -1718435171, -1023755034);
	}

	static final void method4238(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class539.method6402(class73, class83, true, 1, class441, (byte) -10);
	}

	static final void method4239(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class645.method7647(class73, class441, 605933418);
	}

	static final void method4240(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class435.method5265(class73, class83, class441, -1239122302);
	}
}

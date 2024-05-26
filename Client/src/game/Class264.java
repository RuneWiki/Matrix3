package game;

/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class264 implements Interface17, Interface73 {
	ScriptVarType aClass283_2831;
	public int anInt2832;
	public String aString2833;
	public boolean aBool2834 = true;

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1939656264);
			if (0 == i)
				break;
			method3615(class572_sub15, i, 1403676310);
		}
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(246685278);
			if (0 == i_0_)
				break;
			method3615(class572_sub15, i_0_, -1946647960);
		}
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method103() {
		/* empty */
	}

	public boolean method3614(int i) {
		return ((Class264) this).aClass283_2831 == ScriptVarType.aClass283_3261;
	}

	public void method468(int i, int i_1_) {
		/* empty */
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1827682040);
			if (0 == i)
				break;
			method3615(class572_sub15, i, -1481572743);
		}
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(714641758);
			if (0 == i)
				break;
			method3615(class572_sub15, i, -280403370);
		}
	}

	void method3615(RSByteBuffer class572_sub15, int i, int i_2_) {
		if (1 == i) {
			char c = Class118.method2157(class572_sub15.readByte(1533624137), 1898805355);
			((Class264) this).aClass283_2831 = ScriptVarType.method3823(c, (byte) 42);
		} else if (2 == i)
			anInt2832 = class572_sub15.readInt(1780321253) * 1194493975;
		else if (i == 4)
			aBool2834 = false;
		else if (5 == i)
			aString2833 = class572_sub15.readString(1295706626);
		else if (i == 101)
			((Class264) this).aClass283_2831 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(241757286), class572_sub15.readUnsignedSmart(30151166), -1972603464));
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(77510662);
			if (0 == i)
				break;
			method3615(class572_sub15, i, -114543311);
		}
	}

	public void method112() {
		/* empty */
	}

	public void method110() {
		/* empty */
	}

	Class264() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	public void method469(int i) {
		/* empty */
	}

	void method3616(RSByteBuffer class572_sub15, int i) {
		if (1 == i) {
			char c = Class118.method2157(class572_sub15.readByte(2062823507), 1507990382);
			((Class264) this).aClass283_2831 = ScriptVarType.method3823(c, (byte) 19);
		} else if (2 == i)
			anInt2832 = class572_sub15.readInt(562244655) * 1194493975;
		else if (i == 4)
			aBool2834 = false;
		else if (5 == i)
			aString2833 = class572_sub15.readString(1295706626);
		else if (i == 101)
			((Class264) this).aClass283_2831 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(166421948), class572_sub15.readUnsignedSmart(261117797), -2116881597));
	}

	void method3617(RSByteBuffer class572_sub15, int i) {
		if (1 == i) {
			char c = Class118.method2157(class572_sub15.readByte(185934386), 1965139408);
			((Class264) this).aClass283_2831 = ScriptVarType.method3823(c, (byte) 70);
		} else if (2 == i)
			anInt2832 = class572_sub15.readInt(1146279121) * 1194493975;
		else if (i == 4)
			aBool2834 = false;
		else if (5 == i)
			aString2833 = class572_sub15.readString(1295706626);
		else if (i == 101)
			((Class264) this).aClass283_2831 = ((ScriptVarType) Class455.method5387(ScriptVarType.method3824(-715090705), class572_sub15.readUnsignedSmart(723712988), -1893285878));
	}

	public boolean method3618() {
		return ((Class264) this).aClass283_2831 == ScriptVarType.aClass283_3261;
	}

	static final int method3619(int i, int i_3_, int i_4_) {
		int i_5_ = (Class34.method778(i + 45365, 91923 + i_3_, 4, (byte) 0) - 128 + (Class34.method778(10294 + i, 37821 + i_3_, 2, (byte) 0) - 128 >> 1) + (Class34.method778(i, i_3_, 1, (byte) 0) - 128 >> 2));
		i_5_ = 35 + (int) ((double) i_5_ * 0.3);
		if (i_5_ < 10)
			i_5_ = 10;
		else if (i_5_ > 60)
			i_5_ = 60;
		return i_5_;
	}

	static final void method3620(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -1042067865;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1;
	}

	static final void method3621(Cs2Executor class441, short i) throws Exception_Sub4 {
		Class133_Sub1.aClass411_Sub1_9827.method4978((byte) -49);
	}

	static void method3622(InterfaceDefinitions class73, int i) {
		if (-1285279191 * class73.anInt752 == 5 && class73.nvmtheindexisotherone * 411192987 != -1)
			Class604.method7150(Class272_Sub2.aClass106_9517, class73, (byte) 125);
	}
}

package game;

/* Class202_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class202_Sub1 extends Class202 implements Interface24 {
	protected VarDomainType aClass272_9649;
	static int anInt9650;

	public int method9202(Class323 class323, byte i) {
		int i_0_ = 2;
		if (class323.anObject4078 instanceof Integer)
			i_0_ += 4;
		else if (class323.anObject4078 instanceof Long)
			i_0_ += 8;
		else if (class323.anObject4078 instanceof String)
			i_0_ += Class269.method3657((String) class323.anObject4078, 246118450);
		else if (class323.anObject4078 instanceof Interface25)
			i_0_ += ((Interface25) class323.anObject4078).method136(-2079539275);
		else
			throw new IllegalStateException();
		return i_0_;
	}

	public Class323 method9203(RSByteBuffer class572_sub15, int i) {
		int i_1_ = class572_sub15.readUnsignedShort(647518597);
		VarDefinition class179 = (VarDefinition) getDefinition(i_1_, 1868020000);
		if (!class179.method2767(-1807725997))
			throw new IllegalStateException("");
		Class323 class323 = new Class323(i_1_);
		Class var_class = class179.dataType.getBaseType(-384499629).aClass7956;
		if (java.lang.Integer.class == var_class)
			class323.anObject4078 = Integer.valueOf(class572_sub15.readInt(-51544384));
		else if (java.lang.Long.class == var_class)
			class323.anObject4078 = Long.valueOf(class572_sub15.method8476((byte) 4));
		else if (var_class == java.lang.String.class)
			class323.anObject4078 = class572_sub15.readVersionedString(-1352993119);
		else if (Interface25.class.isAssignableFrom(var_class)) {
			try {
				Interface25 interface25 = (Interface25) var_class.newInstance();
				interface25.method137(class572_sub15, -180794753);
				class323.anObject4078 = interface25;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		return class323;
	}

	Class202_Sub1(Class437 class437, VarDomainType class272, Class435 class435, int i) {
		super(class437, class435, i);
		aClass272_9649 = class272;
	}

	public void method9204(RSByteBuffer class572_sub15, Class323 class323, int i) {
		class572_sub15.writeShort(380662693 * class323.anInt4079, -1536322542);
		if (class323.anObject4078 instanceof Integer)
			class572_sub15.writeInt(((Integer) class323.anObject4078).intValue(), -1743753997);
		else if (class323.anObject4078 instanceof Long)
			class572_sub15.method8514(((Long) class323.anObject4078).longValue());
		else if (class323.anObject4078 instanceof String)
			class572_sub15.method8460((String) class323.anObject4078, (byte) 114);
		else if (class323.anObject4078 instanceof Interface25)
			((Interface25) class323.anObject4078).method138(class572_sub15, (byte) -49);
		else
			throw new IllegalStateException();
	}

	public abstract Interface17 getDefinition(int i, int i_2_);

	public Class323 method9205(RSByteBuffer class572_sub15, BaseVarType class609, int i) {
		int i_3_ = class572_sub15.readUnsignedShort(647518597);
		Class323 class323 = new Class323(i_3_);
		Class var_class = class609.aClass7956;
		if (java.lang.Integer.class == var_class)
			class323.anObject4078 = Integer.valueOf(class572_sub15.readInt(-109567525));
		else if (var_class == java.lang.Long.class)
			class323.anObject4078 = Long.valueOf(class572_sub15.method8476((byte) 4));
		else if (var_class == java.lang.String.class)
			class323.anObject4078 = class572_sub15.readVersionedString(-1556484463);
		else if (Interface25.class.isAssignableFrom(var_class)) {
			try {
				Interface25 interface25 = (Interface25) var_class.newInstance();
				interface25.method137(class572_sub15, 555989602);
				class323.anObject4078 = interface25;
			} catch (InstantiationException instantiationexception) {
				/* empty */
			} catch (IllegalAccessException illegalaccessexception) {
				/* empty */
			}
		} else
			throw new IllegalStateException();
		VarDefinition class179 = (VarDefinition) getDefinition(i_3_, -2130260116);
		if (!class179.method2767(-2007733611) || class179.dataType.getBaseType(509454601) != class609)
			return null;
		return class323;
	}

	public abstract Interface17 method114(int i);

	public int method45() {
		return -951433963 * anInt2402;
	}

	public Object method134(int i, byte i_4_) {
		VarDefinition class179 = (VarDefinition) getDefinition(i, -1396942797);
		if (class179 == null || !class179.method2767(-1281614607))
			return null;
		return class179.method2770((byte) 4);
	}

	public Object method132(int i) {
		VarDefinition class179 = (VarDefinition) getDefinition(i, -900696582);
		if (class179 == null || !class179.method2767(-2074558703))
			return null;
		return class179.method2770((byte) 4);
	}

	public int method113(byte i) {
		return -951433963 * anInt2402;
	}

	public Object method133(int i) {
		VarDefinition class179 = (VarDefinition) getDefinition(i, -683122086);
		if (class179 == null || !class179.method2767(-1952753693))
			return null;
		return class179.method2770((byte) 4);
	}

	static final void method9206(Cs2Executor class441, int i) {
		int i_5_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class315.method4079(i_5_, (byte) 7);
	}

	static final void method9207(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub29_9212.method9121(-822759004);
	}

	static final void method9208(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_6_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_7_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_6_, 134791544));
		if (i_7_ >= 1 && i_7_ <= 5 && null != class631.aStringArray8144[i_7_ - 1])
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = class631.aStringArray8144[i_7_ - 1];
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}

	static final void method9209(Cs2Executor class441, int i) {
		/* empty */
	}

	public static void method9210(int i, int i_8_, int i_9_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(20, (long) i_8_ << 32 | (long) i);
		class572_sub12_sub11.method10384(-1970252670);
	}

	public static void method9211(short i) {
		if (null != BaseVarType.aClass412_7963)
			BaseVarType.aClass412_7963.method5053(1986434082);
		if (null != Class428.aThread5015) {
			for (;;) {
				try {
					Class428.aThread5015.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}
}

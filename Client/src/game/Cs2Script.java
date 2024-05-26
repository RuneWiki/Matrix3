package game;

/* Class572_Sub12_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Cs2Script extends Class572_Sub12 {
	public Class676[] aClass676Array11377;
	public String aString11378;
	public Class574[] aClass574Array11379;
	public int[] anIntArray11380;
	public int nLongLocals;
	public int nIntLocals;
	public int nObjectLocals;
	public Object[] anObjectArray11384;
	public int anInt11385;
	public int anInt11386;
	public int anInt11387;
	public Class530 aClass530_11388;
	Interface15 anInterface15_11389;

	int method10326(RSByteBuffer class572_sub15, int i) {
		class572_sub15.o = 310393755 * (class572_sub15.b.length - 2);
		int i_0_ = class572_sub15.readUnsignedShort(647518597);
		int i_1_ = class572_sub15.b.length - 2 - i_0_ - 16;
		class572_sub15.o = i_1_ * 310393755;
		int i_2_ = class572_sub15.readInt(1649651614);
		nIntLocals = class572_sub15.readUnsignedShort(647518597) * 1103524017;
		nObjectLocals = class572_sub15.readUnsignedShort(647518597) * -1182812671;
		nLongLocals = class572_sub15.readUnsignedShort(647518597) * -1121620747;
		anInt11385 = class572_sub15.readUnsignedShort(647518597) * -1556577475;
		anInt11386 = class572_sub15.readUnsignedShort(647518597) * 416863307;
		anInt11387 = class572_sub15.readUnsignedShort(647518597) * -1045120779;
		int i_3_ = class572_sub15.readUnsignedByte(1350299145);
		if (i_3_ > 0) {
			aClass676Array11377 = new Class676[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				int i_5_ = class572_sub15.readUnsignedShort(647518597);
				Class676 class676 = new Class676(HashTable.nextPowerOfTwo(i_5_, 679976882));
				aClass676Array11377[i_4_] = class676;
				while (i_5_-- > 0) {
					int i_6_ = class572_sub15.readInt(1295737584);
					int i_7_ = class572_sub15.readInt(-1035456915);
					class676.put(new LinkableInt(i_7_), (long) i_6_);
				}
			}
		}
		class572_sub15.o = 0;
		aString11378 = class572_sub15.method8557(-1743502134);
		aClass574Array11379 = new Class574[i_2_];
		return i_1_;
	}

	void method10327(RSByteBuffer class572_sub15, int i, Class574 class574, int i_8_) {
		int i_9_ = aClass574Array11379.length;
		if (Class574.aClass574_7351 == class574 || class574 == Class574.aClass574_6447) {
			VarDomainType class272 = ((VarDomainType) Class455.method5387(VarDomainType.method3673((byte) 36), class572_sub15.readUnsignedByte(563260757), -2136674393));
			int i_10_ = class572_sub15.readUnsignedShort(647518597);
			if (anObjectArray11384 == null)
				anObjectArray11384 = new Object[i_9_];
			anObjectArray11384[i] = ((Cs2Script) this).anInterface15_11389.method94(class272, i_10_, (byte) 90);
			if (null == anIntArray11380)
				anIntArray11380 = new int[i_9_];
			anIntArray11380[i] = class572_sub15.readUnsignedByte(782763849);
		} else if (Class574.aClass574_6842 == class574) {
			BaseVarType class609 = ((BaseVarType) Class455.method5387(BaseVarType.method7258((byte) -120), class572_sub15.readUnsignedByte(-67740823), -1862742562));
			switch (class609.anInt7961 * 1433734045) {
				case 1:
					if (null == anIntArray11380)
						anIntArray11380 = new int[i_9_];
					class574 = Class574.aClass574_7658;
					anIntArray11380[i] = class572_sub15.readInt(1542577607);
					break;
				case 3:
					if (anObjectArray11384 == null)
						anObjectArray11384 = new Object[i_9_];
					anObjectArray11384[i] = class572_sub15.readString(1295706626).intern();
					break;
				case 2:
					if (anObjectArray11384 == null)
						anObjectArray11384 = new Object[i_9_];
					class574 = Class574.aClass574_6460;
					anObjectArray11384[i] = Long.valueOf(class572_sub15.method8476((byte) 4));
					break;
				default:
					throw new RuntimeException();
			}
		} else if (Class574.aClass574_6438 == class574 || Class574.aClass574_7386 == class574) {
			int i_11_ = class572_sub15.readUnsignedShort(647518597);
			if (anObjectArray11384 == null)
				anObjectArray11384 = new Object[i_9_];
			anObjectArray11384[i] = ((Cs2Script) this).anInterface15_11389.method95(i_11_, 819446449);
			if (null == anIntArray11380)
				anIntArray11380 = new int[i_9_];
			anIntArray11380[i] = class572_sub15.readUnsignedByte(1890749276);
		} else {
			if (null == anIntArray11380)
				anIntArray11380 = new int[i_9_];
			if (null != class574 && class574.aBool7613)
				anIntArray11380[i] = class572_sub15.readInt(218297889);
			else
				anIntArray11380[i] = class572_sub15.readUnsignedByte(548863907);
		}
		aClass574Array11379[i] = class574;
	}

	Class574 method10328(RSByteBuffer class572_sub15, Class574[] class574s, int i) {
		int i_12_ = class572_sub15.readUnsignedShort(647518597);
		if (i_12_ < 0 || i_12_ >= class574s.length)
			throw new RuntimeException("");
		Class574 class574 = class574s[i_12_];
		return class574;
	}

	public Cs2Script(RSByteBuffer class572_sub15, Interface15 interface15) {
		((Cs2Script) this).anInterface15_11389 = interface15;
		int i = method10326(class572_sub15, 1796205962);
		int i_13_ = 0;
		Class574[] class574s = Class324.method4143((byte) 52);
		while (class572_sub15.o * -1585139053 < i) {
			Class574 class574 = method10328(class572_sub15, class574s, -929092669);
			method10327(class572_sub15, i_13_, class574, 846510147);
			i_13_++;
		}
	}
}

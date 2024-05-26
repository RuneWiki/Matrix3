package game;

/* Class445 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class445 implements Interface17 {
	Class457 aClass457_5136;
	int anInt5137;
	public int anInt5138;
	public int anInt5139;

	public synchronized Class87 method5333(byte i) {
		Class87 class87 = (Class87) (((Class457) ((Class445) this).aClass457_5136).aClass127_5199.method2246((long) (((Class445) this).anInt5137 * 1155564223)));
		if (class87 != null)
			return class87;
		class87 = Class160.method2571((((Class457) ((Class445) this).aClass457_5136).aClass248_5200), ((Class445) this).anInt5137 * 1155564223, 0);
		if (class87 != null)
			((Class457) ((Class445) this).aClass457_5136).aClass127_5199.method2229(class87, (long) (((Class445) this).anInt5137 * 1155564223));
		return class87;
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(270396886);
			if (0 == i_0_)
				break;
			method5335(class572_sub15, i_0_, -1006127269);
		}
	}

	Class445(int i, Class457 class457) {
		((Class445) this).aClass457_5136 = class457;
	}

	void method5334(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			((Class445) this).anInt5137 = class572_sub15.readBigSmart((byte) 15) * 1250684223;
		else if (i == 2) {
			anInt5139 = class572_sub15.readUnsignedByte(543495307) * 1938066797;
			anInt5138 = class572_sub15.readUnsignedByte(614964486) * -1678353775;
		}
	}

	public void method104(byte i) {
		/* empty */
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1412346737);
			if (0 == i)
				break;
			method5335(class572_sub15, i, 1698063839);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(-27836676);
			if (0 == i)
				break;
			method5335(class572_sub15, i, -1251328705);
		}
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(263987426);
			if (0 == i)
				break;
			method5335(class572_sub15, i, 1785933087);
		}
	}

	public void method103() {
		/* empty */
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(76533953);
			if (0 == i)
				break;
			method5335(class572_sub15, i, -1783647464);
		}
	}

	public void method112() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	void method5335(RSByteBuffer class572_sub15, int i, int i_1_) {
		if (1 == i)
			((Class445) this).anInt5137 = class572_sub15.readBigSmart((byte) 70) * 1250684223;
		else if (i == 2) {
			anInt5139 = class572_sub15.readUnsignedByte(514321639) * 1938066797;
			anInt5138 = class572_sub15.readUnsignedByte(2021866557) * -1678353775;
		}
	}

	public void method110() {
		/* empty */
	}

	static final void method5336(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.anInt764 * 669238293;
	}

	static final void method5337(int i) {
		for (Class591_Sub4 class591_sub4 = ((Class591_Sub4) client.aClass652_8703.method7696(-1986499651)); class591_sub4 != null; class591_sub4 = ((Class591_Sub4) client.aClass652_8703.method7696(-1986499651)))
			Class313.method4062(class591_sub4, -2063633839);
		int i_2_ = 0;
		int i_3_ = 3;
		if (1797623853 * client.anInt8646 == 4) {
			for (int i_4_ = i_2_; i_4_ <= i_3_; i_4_++)
				client.method8063(i_4_);
			client.method7990();
		} else {
			client.method8072();
			for (int i_5_ = i_2_; i_5_ <= i_3_; i_5_++) {
				client.method8049();
				client.method7989(i_5_);
				client.method8063(i_5_);
			}
			client.method8021();
			client.method7990();
		}
	}

	public static Class572_Sub19 method5338(byte i) {
		if (null == Class547_Sub1.aClass675_6149 || Class547_Sub1.aClass656_8998 == null)
			return null;
		Class547_Sub1.aClass656_8998.method7713(Class547_Sub1.aClass675_6149, (byte) -96);
		Class572_Sub19 class572_sub19 = ((Class572_Sub19) Class547_Sub1.aClass656_8998.method7715((byte) 0));
		if (null == class572_sub19)
			return null;
		Class78 class78 = ((Class78) Class547_Sub1.aClass639_Sub12_6173.getDefinition(((class572_sub19.anInt9142) * 295399623), 743789521));
		if (class78 == null || !class78.aBool1001 || !class78.method1158(Class547_Sub1.anInterface15_6127, Class547_Sub1.anInterface13_6159, 2092216738))
			return Class411.method5046(-858992181);
		return class572_sub19;
	}

	static boolean method5339(int i) {
		return Class403.method4783(Class586.aClass502_7779.aClass499_5551, (byte) 117);
	}
}

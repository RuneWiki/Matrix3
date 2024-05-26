package game;

/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class131 {
	int anInt1534;
	Class676 aClass676_1535;
	Class572_Sub12 aClass572_Sub12_1536 = new Class572_Sub12();
	int anInt1537;
	Class664 aClass664_1538 = new Class664();
	public static Class248 aClass248_1539;
	public static Class639_Sub2 aClass639_Sub2_1540;

	public Class572_Sub12 method2283(long l) {
		Class572_Sub12 class572_sub12 = (Class572_Sub12) ((Class131) this).aClass676_1535.get(l);
		if (class572_sub12 != null)
			((Class131) this).aClass664_1538.method7842(class572_sub12, 1721365697);
		return class572_sub12;
	}

	public void method2284(Class572_Sub12 class572_sub12, long l) {
		if (1492164683 * ((Class131) this).anInt1537 == 0) {
			Class572_Sub12 class572_sub12_0_ = ((Class131) this).aClass664_1538.method7843(627252986);
			class572_sub12_0_.method6794((byte) -8);
			class572_sub12_0_.method8412(724585842);
			if (((Class131) this).aClass572_Sub12_1536 == class572_sub12_0_) {
				class572_sub12_0_ = ((Class131) this).aClass664_1538.method7843(1823866041);
				class572_sub12_0_.method6794((byte) 48);
				class572_sub12_0_.method8412(724585842);
			}
		} else
			((Class131) this).anInt1537 -= -468571805;
		((Class131) this).aClass676_1535.put(class572_sub12, l);
		((Class131) this).aClass664_1538.method7842(class572_sub12, 1095888451);
	}

	public Class131(int i) {
		((Class131) this).anInt1534 = -1087172917 * i;
		((Class131) this).anInt1537 = i * -468571805;
		int i_1_;
		for (i_1_ = 1; i_1_ + i_1_ < i; i_1_ += i_1_) {
			/* empty */
		}
		((Class131) this).aClass676_1535 = new Class676(i_1_);
	}

	public void method2285(int i) {
		((Class131) this).aClass664_1538.method7841((short) -11324);
		((Class131) this).aClass676_1535.method7964((byte) 32);
		((Class131) this).aClass572_Sub12_1536 = new Class572_Sub12();
		((Class131) this).anInt1537 = ((Class131) this).anInt1534 * -657120055;
	}

	public static void method2286(int i) {
		if (client.aBool8754) {
			InterfaceDefinitions class73 = Class530.method6338(Class167.interfaceHash * -806385553, 654388253 * client.anInt8755, -532694913);
			if (class73 != null && null != class73.anObjectArray869) {
				Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
				class572_sub20.thizInterface = class73;
				class572_sub20.params = class73.anObjectArray869;
				Class34.executeCs2(class572_sub20, -2144813601);
			}
			client.anInt8751 = 1983555971;
			client.anInt8756 = 304478591;
			client.aBool8754 = false;
			if (null != class73)
				Class555.method6575(class73, (short) 24056);
		}
	}

	static void method2287(InterfaceDefinitions class73, int i) {
		if (client.aBool8754) {
			if (class73.anObjectArray858 != null) {
				InterfaceDefinitions class73_2_ = Class530.method6338(-806385553 * Class167.interfaceHash, client.anInt8755 * 654388253, -853174133);
				if (class73_2_ != null) {
					Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
					class572_sub20.thizInterface = class73;
					class572_sub20.targetInterface = class73_2_;
					class572_sub20.params = class73.anObjectArray858;
					Class34.executeCs2(class572_sub20, -1971471127);
				}
			}
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3743, client.aClass195_8589.aClass650_2340, -90753884);
			class572_sub25.aRsByteBuffer.writeShortLE(411192987 * class73.nvmtheindexisotherone, -971252436);
			class572_sub25.aRsByteBuffer.writeInt(-806385553 * Class167.interfaceHash, -1743753997);
			class572_sub25.aRsByteBuffer.writeShort128(client.anInt8755 * 654388253, -16711936);
			class572_sub25.aRsByteBuffer.writeShortLE(client.anInt8756 * -1582286463, -971252436);
			class572_sub25.aRsByteBuffer.writeShortLE(-1665128073 * class73.activeComponent, -971252436);
			class572_sub25.aRsByteBuffer.writeInt(class73.selfId * -1718435171, -1743753997);
			client.aClass195_8589.method2929(class572_sub25, (byte) -46);
		}
	}

	static final void method2288(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= 126695836;
		int i_3_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_4_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]);
		int i_5_ = (((Cs2Executor) class441).intStack[2 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		Class240 class240 = Class240.method3316((float) i_3_, (float) i_4_, (float) i_5_);
		Class133_Sub1.aClass411_Sub1_9827.method4980(class240, 728738643);
		class240.method3261();
	}
}

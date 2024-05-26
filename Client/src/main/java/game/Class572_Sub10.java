package game;

/* Class572_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;

public class Class572_Sub10 extends Class572 {
	public int anInt9082;
	boolean aBool9083 = true;
	public Class343[] aClass343Array9084;
	public byte aByte9085;
	int[] anIntArray9086;
	long aLong9087;
	boolean aBool9088;
	public String aString9089;
	public byte aByte9090;

	void method8395(int i, short i_0_) {
		if (aClass343Array9084 != null)
			System.arraycopy(aClass343Array9084, 0, aClass343Array9084 = new Class343[i], 0, anInt9082 * -58096969);
		else
			aClass343Array9084 = new Class343[i];
	}

	public Class572_Sub10(RSByteBuffer class572_sub15) {
		anInt9082 = 0;
		aString9089 = null;
		method8399(class572_sub15, -1506643804);
	}

	public int[] method8396(short i) {
		if (null == ((Class572_Sub10) this).anIntArray9086) {
			String[] strings = new String[anInt9082 * -58096969];
			((Class572_Sub10) this).anIntArray9086 = new int[-58096969 * anInt9082];
			for (int i_1_ = 0; i_1_ < anInt9082 * -58096969; i_1_++) {
				strings[i_1_] = aClass343Array9084[i_1_].aString4361;
				((Class572_Sub10) this).anIntArray9086[i_1_] = i_1_;
			}
			Class557.method6593(strings, ((Class572_Sub10) this).anIntArray9086, 493419501);
		}
		return ((Class572_Sub10) this).anIntArray9086;
	}

	void method8397(Class343 class343, int i) {
		if (aClass343Array9084 == null || -58096969 * anInt9082 >= aClass343Array9084.length)
			method8395(5 + -58096969 * anInt9082, (short) 32271);
		aClass343Array9084[(anInt9082 += 2139945735) * -58096969 - 1] = class343;
		((Class572_Sub10) this).anIntArray9086 = null;
	}

	void method8398(int i, byte i_2_) {
		anInt9082 -= 2139945735;
		if (-58096969 * anInt9082 == 0)
			aClass343Array9084 = null;
		else
			System.arraycopy(aClass343Array9084, 1 + i, aClass343Array9084, i, -58096969 * anInt9082 - i);
		((Class572_Sub10) this).anIntArray9086 = null;
	}

	void method8399(RSByteBuffer class572_sub15, int i) {
		int i_3_ = class572_sub15.readUnsignedByte(1011352293);
		if (0 != (i_3_ & 0x1))
			((Class572_Sub10) this).aBool9088 = true;
		if ((i_3_ & 0x2) != 0)
			((Class572_Sub10) this).aBool9083 = true;
		int i_4_ = 2;
		if (0 != (i_3_ & 0x4))
			i_4_ = class572_sub15.readUnsignedByte(867560926);
		hash = class572_sub15.method8476((byte) 4) * 8535728873556543153L;
		((Class572_Sub10) this).aLong9087 = class572_sub15.method8476((byte) 4) * 4924797088330419087L;
		aString9089 = class572_sub15.readString(1295706626);
		class572_sub15.readUnsignedByte(115988856);
		aByte9090 = class572_sub15.readByte(1078846727);
		aByte9085 = class572_sub15.readByte(1311747089);
		anInt9082 = class572_sub15.readUnsignedShort(647518597) * 2139945735;
		if (anInt9082 * -58096969 > 0) {
			aClass343Array9084 = new Class343[-58096969 * anInt9082];
			for (int i_5_ = 0; i_5_ < anInt9082 * -58096969; i_5_++) {
				Class343 class343 = new Class343();
				if (((Class572_Sub10) this).aBool9088)
					class572_sub15.method8476((byte) 4);
				if (((Class572_Sub10) this).aBool9083)
					class343.aString4361 = class572_sub15.readString(1295706626);
				class343.aByte4360 = class572_sub15.readByte(1291590990);
				class343.anInt4359 = class572_sub15.readUnsignedShort(647518597) * -130606141;
				if (i_4_ >= 3)
					class572_sub15.readUnsignedByte(126266612);
				aClass343Array9084[i_5_] = class343;
			}
		}
	}

	void method8400(int i) {
		if (aClass343Array9084 != null)
			System.arraycopy(aClass343Array9084, 0, aClass343Array9084 = new Class343[i], 0, anInt9082 * -58096969);
		else
			aClass343Array9084 = new Class343[i];
	}

	void method8401(int i) {
		anInt9082 -= 2139945735;
		if (-58096969 * anInt9082 == 0)
			aClass343Array9084 = null;
		else
			System.arraycopy(aClass343Array9084, 1 + i, aClass343Array9084, i, -58096969 * anInt9082 - i);
		((Class572_Sub10) this).anIntArray9086 = null;
	}

	void method8402(int i) {
		if (aClass343Array9084 != null)
			System.arraycopy(aClass343Array9084, 0, aClass343Array9084 = new Class343[i], 0, anInt9082 * -58096969);
		else
			aClass343Array9084 = new Class343[i];
	}

	public int method8403(String string, int i) {
		for (int i_6_ = 0; i_6_ < anInt9082 * -58096969; i_6_++) {
			if (aClass343Array9084[i_6_].aString4361.equalsIgnoreCase(string))
				return i_6_;
		}
		return -1;
	}

	static {
		new BitSet(65536);
	}

	void method8404(int i) {
		anInt9082 -= 2139945735;
		if (-58096969 * anInt9082 == 0)
			aClass343Array9084 = null;
		else
			System.arraycopy(aClass343Array9084, 1 + i, aClass343Array9084, i, -58096969 * anInt9082 - i);
		((Class572_Sub10) this).anIntArray9086 = null;
	}

	void method8405(RSByteBuffer class572_sub15) {
		int i = class572_sub15.readUnsignedByte(133781528);
		if (0 != (i & 0x1))
			((Class572_Sub10) this).aBool9088 = true;
		if ((i & 0x2) != 0)
			((Class572_Sub10) this).aBool9083 = true;
		int i_7_ = 2;
		if (0 != (i & 0x4))
			i_7_ = class572_sub15.readUnsignedByte(-47445637);
		hash = class572_sub15.method8476((byte) 4) * 8535728873556543153L;
		((Class572_Sub10) this).aLong9087 = class572_sub15.method8476((byte) 4) * 4924797088330419087L;
		aString9089 = class572_sub15.readString(1295706626);
		class572_sub15.readUnsignedByte(1494025137);
		aByte9090 = class572_sub15.readByte(257270562);
		aByte9085 = class572_sub15.readByte(982139117);
		anInt9082 = class572_sub15.readUnsignedShort(647518597) * 2139945735;
		if (anInt9082 * -58096969 > 0) {
			aClass343Array9084 = new Class343[-58096969 * anInt9082];
			for (int i_8_ = 0; i_8_ < anInt9082 * -58096969; i_8_++) {
				Class343 class343 = new Class343();
				if (((Class572_Sub10) this).aBool9088)
					class572_sub15.method8476((byte) 4);
				if (((Class572_Sub10) this).aBool9083)
					class343.aString4361 = class572_sub15.readString(1295706626);
				class343.aByte4360 = class572_sub15.readByte(1597994424);
				class343.anInt4359 = class572_sub15.readUnsignedShort(647518597) * -130606141;
				if (i_7_ >= 3)
					class572_sub15.readUnsignedByte(2089699625);
				aClass343Array9084[i_8_] = class343;
			}
		}
	}

	void method8406(RSByteBuffer class572_sub15) {
		int i = class572_sub15.readUnsignedByte(1065742702);
		if (0 != (i & 0x1))
			((Class572_Sub10) this).aBool9088 = true;
		if ((i & 0x2) != 0)
			((Class572_Sub10) this).aBool9083 = true;
		int i_9_ = 2;
		if (0 != (i & 0x4))
			i_9_ = class572_sub15.readUnsignedByte(1104690945);
		hash = class572_sub15.method8476((byte) 4) * 8535728873556543153L;
		((Class572_Sub10) this).aLong9087 = class572_sub15.method8476((byte) 4) * 4924797088330419087L;
		aString9089 = class572_sub15.readString(1295706626);
		class572_sub15.readUnsignedByte(590400829);
		aByte9090 = class572_sub15.readByte(702647812);
		aByte9085 = class572_sub15.readByte(1043851037);
		anInt9082 = class572_sub15.readUnsignedShort(647518597) * 2139945735;
		if (anInt9082 * -58096969 > 0) {
			aClass343Array9084 = new Class343[-58096969 * anInt9082];
			for (int i_10_ = 0; i_10_ < anInt9082 * -58096969; i_10_++) {
				Class343 class343 = new Class343();
				if (((Class572_Sub10) this).aBool9088)
					class572_sub15.method8476((byte) 4);
				if (((Class572_Sub10) this).aBool9083)
					class343.aString4361 = class572_sub15.readString(1295706626);
				class343.aByte4360 = class572_sub15.readByte(1413961851);
				class343.anInt4359 = class572_sub15.readUnsignedShort(647518597) * -130606141;
				if (i_9_ >= 3)
					class572_sub15.readUnsignedByte(67376041);
				aClass343Array9084[i_10_] = class343;
			}
		}
	}

	static void method8407(int i, int i_11_) {
		if (29 == i)
			throw new Error();
		if (i == 19)
			throw new OutOfMemoryError();
		try {
			if (i == 1)
				Class380.method4639(-1399842852);
			else if (i == 25)
				Class118.method2154(new StringBuilder().append("").append(Class584.anInt7734 * -267830063).toString(), 1572786884);
			else if (26 == i) {
				Class533 class533 = (client.aClass613_8605.method7285(1218299228).aClass533_5828);
				class533.aBool5965 = !class533.aBool5965;
			} else if (20 == i)
				client.aBool8874 = true;
			else if (27 == i)
				client.aBool8874 = false;
			else if (21 == i)
				client.aClass652_8748.method7704(669982842);
			else if (i == 7) {
				VarBitDefinition.method5228(1773571311);
				for (int i_12_ = 0; i_12_ < 10; i_12_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_13_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_13_).toString(), 101380109);
			} else if (i == 24) {
				VarBitDefinition.method5228(915639114);
				for (int i_14_ = 0; i_14_ < 10; i_14_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_15_).toString(), -415192905);
				Class167_Sub1.method10039(-21327269);
				VarBitDefinition.method5228(1706323706);
				for (int i_16_ = 0; i_16_ < 10; i_16_++)
					System.gc();
				i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class118.method2154(new StringBuilder().append("").append(i_15_).toString(), 95572308);
			} else if (i == 15)
				Class118.method2154((Class297.aClass567_3477.method419((byte) -41) ? "Success" : "Failure"), -572193038);
			else if (4 == i)
				Class633.aClass641_8197.method7596((byte) 9);
			else if (17 == i)
				Class51.aClass278_491.method3731(660778303);
			else if (i == 13)
				Class51.aClass278_491.method3742((byte) 65);
			else if (i == 8)
				Class584.aCanvas7745.setLocation(50, 50);
			else if (2 == i)
				Class584.aCanvas7745.setLocation((954583035 * Class584.anInt7748), (2077319943 * Class584.anInt7760));
			else if (6 == i)
				Class447.method5346(-2147415009);
			else if (11 == i) {
				client.aClass613_8605.aLong8031 = Class69.method1067(-1991190987) * -4062201478757077277L;
				client.aClass613_8605.aBool7990 = true;
				Class447.method5346(-2141525220);
			} else if (i == 14) {
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class118.method2154(new StringBuilder().append((int) class240.aFloat2653 >> 9).append(" ").append((int) class240.aFloat2657 >> 9).toString(), -459444834);
			} else if (i == 10) {
				Class240 class240 = (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method5394().aClass240_2647);
				Class118.method2154(new StringBuilder().append("").append(client.aClass613_8605.method7285(2055780903).aClass174Array5875[(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009)].method2713((int) class240.aFloat2653 >> 9, (int) class240.aFloat2657 >> 9, 1701448663)).toString(), -330005544);
			} else if (i == 23) {
				Class118.method2154(new StringBuilder().append(InterfaceDefinitions.aClass127_743.method2233(685249257)).append(" ").append(InterfaceDefinitions.aClass127_743.method2232(-836258836)).toString(), -1091670717);
				Class118.method2154(new StringBuilder().append(InterfaceDefinitions.aClass127_823.method2233(1603181940)).append(" ").append(InterfaceDefinitions.aClass127_823.method2232(-1479606322)).toString(), 82306136);
			} else if (i == 9)
				Class556.method6587(false, -1630436610);
			else if (16 == i) {
				client.aBool8591 = !client.aBool8591;
				Class272_Sub2.aClass106_9517.method2037(client.aBool8591);
				Class671.method7886(-1130585963);
			} else if (i == 5) {
				client.anInt8600 = 0;
				client.aClass613_8605.method7302(-468424096);
			} else if (28 == i) {
				client.anInt8600 = 1744575599;
				client.aClass613_8605.method7302(-580720640);
			} else if (22 == i) {
				client.anInt8600 = -805816098;
				client.aClass613_8605.method7302(696103522);
			}
		} catch (Exception exception) {
			Class118.method2154(Class279.aClass279_2951.method3758(Class594.aClass435_7823, 16711935), 903129477);
		}
	}

	public static int method8408(int i) {
		if (Class648.anInt8358 * 1600071731 == -1) {
			Class648[] class648s = Class413.getIDXReferences(2090382280);
			for (int i_17_ = 0; i_17_ < class648s.length; i_17_++) {
				Class648 class648 = class648s[i_17_];
				if (-1896398317 * ((Class648) class648).anInt8362 > Class648.anInt8358 * 1600071731)
					Class648.anInt8358 = -1477239135 * ((Class648) class648).anInt8362;
			}
			Class648.anInt8358 += -1616899333;
		}
		return 1600071731 * Class648.anInt8358;
	}

	public static boolean method8409(int i, byte i_18_) {
		for (Class572_Sub12_Sub10 class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7932((byte) 50)); null != class572_sub12_sub10; class572_sub12_sub10 = ((Class572_Sub12_Sub10) Class25.aClass675_174.method7926(428436555))) {
			if (Class481.method5737(-44467871 * (((Class572_Sub12_Sub10) class572_sub12_sub10).anInt11402), 1855339393) && (long) i == (((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11395) * -6760453999157901937L)
				return true;
		}
		return false;
	}
}

package game;

/* Class572_Sub16_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub16_Sub3 extends Class572_Sub16 {
	String aString10980;
	Class336 this$0;
	long aLong10981;

	Class572_Sub16_Sub3(Class336 class336) {
		((Class572_Sub16_Sub3) this).this$0 = class336;
		((Class572_Sub16_Sub3) this).aLong10981 = -1801607328676316705L;
		((Class572_Sub16_Sub3) this).aString10980 = null;
	}

	void method8565(RSByteBuffer class572_sub15, int i) {
		if (class572_sub15.readUnsignedByte(884925750) != 255) {
			class572_sub15.o -= 310393755;
			((Class572_Sub16_Sub3) this).aLong10981 = class572_sub15.method8476((byte) 4) * 1801607328676316705L;
		}
		((Class572_Sub16_Sub3) this).aString10980 = class572_sub15.method8557(-410093840);
	}

	void method8560(Class334 class334, byte i) {
		class334.method4190((((Class572_Sub16_Sub3) this).aLong10981 * -4171405053003891231L), ((Class572_Sub16_Sub3) this).aString10980, 0, 277807503);
	}

	void method8559(Class334 class334) {
		class334.method4190((((Class572_Sub16_Sub3) this).aLong10981 * -4171405053003891231L), ((Class572_Sub16_Sub3) this).aString10980, 0, -1419121938);
	}

	void method8562(RSByteBuffer class572_sub15) {
		if (class572_sub15.readUnsignedByte(1938630905) != 255) {
			class572_sub15.o -= 310393755;
			((Class572_Sub16_Sub3) this).aLong10981 = class572_sub15.method8476((byte) 4) * 1801607328676316705L;
		}
		((Class572_Sub16_Sub3) this).aString10980 = class572_sub15.method8557(-694739851);
	}

	void method8564(Class334 class334) {
		class334.method4190((((Class572_Sub16_Sub3) this).aLong10981 * -4171405053003891231L), ((Class572_Sub16_Sub3) this).aString10980, 0, 55857067);
	}

	void method8561(RSByteBuffer class572_sub15) {
		if (class572_sub15.readUnsignedByte(1815370028) != 255) {
			class572_sub15.o -= 310393755;
			((Class572_Sub16_Sub3) this).aLong10981 = class572_sub15.method8476((byte) 4) * 1801607328676316705L;
		}
		((Class572_Sub16_Sub3) this).aString10980 = class572_sub15.method8557(-2121607275);
	}

	void method8566(Class334 class334) {
		class334.method4190((((Class572_Sub16_Sub3) this).aLong10981 * -4171405053003891231L), ((Class572_Sub16_Sub3) this).aString10980, 0, -1856114495);
	}

	void method8563(RSByteBuffer class572_sub15) {
		if (class572_sub15.readUnsignedByte(1527238875) != 255) {
			class572_sub15.o -= 310393755;
			((Class572_Sub16_Sub3) this).aLong10981 = class572_sub15.method8476((byte) 4) * 1801607328676316705L;
		}
		((Class572_Sub16_Sub3) this).aString10980 = class572_sub15.method8557(-612908655);
	}

	static void method10067(Cs2Script class572_sub12_sub8, int i, Cs2Executor class441, int i_0_) {

		try {

			((Cs2Executor) class441).intStackPtr = 0;
			((Cs2Executor) class441).objectStackPtr = 0;
			((Cs2Executor) class441).instrPtr = 1866055967;
			((Cs2Executor) class441).current = class572_sub12_sub8;
			((Cs2Executor) class441).aClass574Array5107 = (((Cs2Executor) class441).current.aClass574Array11379);
			((Cs2Executor) class441).anIntArray5124 = ((Cs2Executor) class441).current.anIntArray11380;
			Class574 class574 = null;
			((Cs2Executor) class441).callStackPtr = 0;
			((Cs2Executor) class441).main_configs_map.clear();
			((Cs2Executor) class441).main_configs_map.put(VarDomainType.PLAYER_CONFIGS, (Class133_Sub23.playerVarsProvider.domain));
			((Cs2Executor) class441).main_configs_map.put(VarDomainType.CLIENT_CONFIGS, Class306.clientConfigsDomain);
			((Cs2Executor) class441).main_configs_map.put(VarDomainType.CLAN_CONFIGS, Class2.aClass134_21);
			if (null != ((Cs2Executor) class441).current_clan)
				((Cs2Executor) class441).main_configs_map.put(VarDomainType.CLAN_SETTING_CONFIGS, Class67.method1055(((Cs2Executor) class441).current_clan, -1930326113));
			if (((Cs2Executor) class441).entity instanceof NPC)
				((Cs2Executor) class441).main_configs_map.put(VarDomainType.NPC_CONFIGS, (((Cs2Executor) class441).entity.anInterface14_11673));
			if (((Cs2Executor) class441).entity instanceof Player)
				((Cs2Executor) class441).playerentity_configs_map.put(VarDomainType.PLAYER_CONFIGS, (((Cs2Executor) class441).entity.anInterface14_11673));
			if (Class221.aClass49_2607 != null)
				((Cs2Executor) class441).main_configs_map.put(VarDomainType.aClass272_2884, Class221.aClass49_2607.method864((byte) -59));
			//try {
			//	try {
			Class439.anInt5084 = 0;
			for (;;) {
				Class439.anInt5084 += 1458641689;
				if (Class439.anInt5084 * -1643769559 > i)
					return;
				//throw new RuntimeException("");
				class574 = (((Cs2Executor) class441).aClass574Array5107[(((Cs2Executor) class441).instrPtr += -1866055967) * -1280867039]);
				if (Class439.aBool5088 && (null == Class439.aString5089 || (null != (((Cs2Executor) class441).current.aString11378) && ((Cs2Executor) class441).current.aString11378.indexOf(Class439.aString5089) != -1)))
					System.out.println(new StringBuilder().append(((Cs2Executor) class441).current.aString11378).append(": ").append(class574).toString());
				if ((((Cs2Executor) class441).anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr]) == 1)
					((Cs2Executor) class441).aBool5128 = true;
				else
					((Cs2Executor) class441).aBool5128 = false;
				if (Class574.aClass574_6743 == class574 && 0 == (((Cs2Executor) class441).callStackPtr * -1384972465)) {
					Class431.method5243(1490243704);
					break;
				}
				Class665_Sub2.method8121(class574, class441, -747168021);
			}
			/*	} catch (Exception exception) {
					Class202.method2998(class441, class574, exception, "S",
							-20872001);
					Class431.method5243(1490243704);
				}
			} catch (Exception object) {
				Class431.method5243(1490243704);
			}*/
		} catch (Throwable object) {

		}
	}
}

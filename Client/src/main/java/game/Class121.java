package game;

/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class121 {
	static Class121 aClass121_1475;
	static Class121 aClass121_1476 = new Class121();
	static Class121 aClass121_1477;
	static Class161 aClass161_1478;
	static String aString1479;
	public static int anInt1480;

	Class121() {
		/* empty */
	}

	static {
		aClass121_1475 = new Class121();
		aClass121_1477 = new Class121();
	}

	public static IncomingPacket[] method2181(int i) {
		return (new IncomingPacket[] { IncomingPacket.aClass321_4059, IncomingPacket.aClass321_3896, IncomingPacket.GRAND_EXCHANGE_PACKET, IncomingPacket.INSTANCED_MAP_SCENE,
			IncomingPacket.PLAYER_UNDER_NPC_PRIORITY_PACKET, IncomingPacket.aClass321_4054, IncomingPacket.aClass321_3990, IncomingPacket.SYSTEM_UPDATE, IncomingPacket.MUSIC_EFFECT_PACKET,
			IncomingPacket.VAR_BIG, IncomingPacket.aClass321_3997, IncomingPacket.aClass321_3906, IncomingPacket.aClass321_3989, IncomingPacket.aClass321_3908, IncomingPacket.SET_INTERFACE,
			IncomingPacket.RESET_NIS_VARS, IncomingPacket.INTERFACE_COMPONENT_TEXT, IncomingPacket.PLAYER_OPTIONS, IncomingPacket.aClass321_3913, IncomingPacket.aClass321_3914,
			IncomingPacket.aClass321_4017, IncomingPacket.PLAYER_UPDATE, IncomingPacket.PLAY_SOUND, IncomingPacket.OTHER_GAMEBAR_UPDATE, IncomingPacket.aClass321_3919,
			IncomingPacket.SEND_GROUND_ITEM, IncomingPacket.ANIMATION_ON_INTERFACE, IncomingPacket.aClass321_3922, IncomingPacket.RECIEVE_PM, IncomingPacket.aClass321_4049,
			IncomingPacket.aClass321_3925, IncomingPacket.OPEN_URL, IncomingPacket.CHUNK_SCENE, IncomingPacket.CS_VAR_BIG, IncomingPacket.CLIENT_SCRIPT, IncomingPacket.INTERFACE_SETTINGS,
			IncomingPacket.aClass321_3931, IncomingPacket.CLAN_CHANNEL_PACKET, IncomingPacket.aClass321_4067, IncomingPacket.aClass321_3934, IncomingPacket.BLACK_SCREEN, IncomingPacket.CHUNK_STREAM,
			IncomingPacket.aClass321_3937, IncomingPacket.aClass321_3897, IncomingPacket.aClass321_3982, IncomingPacket.aClass321_3940, IncomingPacket.aClass321_3941, IncomingPacket.aClass321_3942,
			IncomingPacket.REMOVE_GROUND_ITEM, IncomingPacket.ROOT_INTERFACE, IncomingPacket.aClass321_3945, IncomingPacket.aClass321_3946, IncomingPacket.aClass321_3969,
			IncomingPacket.aClass321_3923, IncomingPacket.aClass321_4004, IncomingPacket.aClass321_4040, IncomingPacket.MAP_SCENE, IncomingPacket.CLOSE_INTERFACE, IncomingPacket.aClass321_3953,
			IncomingPacket.GRAPHICS, IncomingPacket.CS_VAR_STRING_SHORT, IncomingPacket.aClass321_3959, IncomingPacket.GAME_LOGOUT, IncomingPacket.aClass321_3958, IncomingPacket.aClass321_3993,
			IncomingPacket.PUBLIC_CHAT, IncomingPacket.aClass321_3949, IncomingPacket.PLAYER_ON_ICOMPONENT, IncomingPacket.MESSAGE_STATUS_UPDATE, IncomingPacket.CLIENT_COMMAND,
			IncomingPacket.aClass321_4039, IncomingPacket.aClass321_3966, IncomingPacket.REFRESH_WORLDLIST, IncomingPacket.aClass321_3968, IncomingPacket.CS_VAR_STRING_LONG, IncomingPacket.CLAN_MSG,
			IncomingPacket.CLIENT_EDIT_CHECK, IncomingPacket.CS_VAR_SMALL, IncomingPacket.aClass321_3938, IncomingPacket.HINTICON, IncomingPacket.aClass321_3975,
			IncomingPacket.HIDE_INTERFACE_COMPONENT, IncomingPacket.aClass321_3973, IncomingPacket.SET_MOUSE_PACKET, IncomingPacket.ADD_IGNORE, IncomingPacket.NPC_UPDATE, IncomingPacket.PROJECTILE,
			IncomingPacket.aClass321_4002, IncomingPacket.aClass321_3983, IncomingPacket.aClass321_3895, IncomingPacket.ADJUSTED_PROJECTILE, IncomingPacket.aClass321_3986,
			IncomingPacket.aClass321_3987, IncomingPacket.aClass321_3988, IncomingPacket.aClass321_3948, IncomingPacket.aClass321_3915, IncomingPacket.NPC_ON_ICOMPONENT,
			IncomingPacket.MODEL_ON_ICOMPONENT, IncomingPacket.aClass321_3921, IncomingPacket.aClass321_3947, IncomingPacket.aClass321_3995, IncomingPacket.aClass321_3996, IncomingPacket.VAR_SMALL,
			IncomingPacket.ITEM_ON_ICOMPONENT, IncomingPacket.RESET_SOUNDS, IncomingPacket.OBJECT_ANIMATION, IncomingPacket.aClass321_4001, IncomingPacket.MOVE_INTERFACE, IncomingPacket.RESET_MUSIC,
			IncomingPacket.aClass321_3939, IncomingPacket.PLAYER_HEAD_ON_ICOMPONENT, IncomingPacket.aClass321_4006, IncomingPacket.MUSIC_PACKET, IncomingPacket.GAME_MESSAGE,
			IncomingPacket.SET_NPC_INTERFACE, IncomingPacket.aClass321_4010, IncomingPacket.aClass321_4033, IncomingPacket.aClass321_4012, IncomingPacket.SET_OBJECT_INTERFACE,
			IncomingPacket.aClass321_4014, IncomingPacket.OTHER_PLAYER_ON_COMPONENT, IncomingPacket.aClass321_4016, IncomingPacket.aClass321_3965, IncomingPacket.aClass321_4074,
			IncomingPacket.PLAYER_APPEARANCE, IncomingPacket.aClass321_4020, IncomingPacket.aClass321_3980, IncomingPacket.CLAN_SETTINGS_PACKET, IncomingPacket.aClass321_4023,
			IncomingPacket.SEND_QC_PRIVATE_MESSAGE, IncomingPacket.aClass321_4025, IncomingPacket.SELECTED_TARGET, IncomingPacket.UPDATE_SKILLS, IncomingPacket.SOUND_EFFECT_PACKET,
			IncomingPacket.SET_SPRITE, IncomingPacket.RUN_ENERGY, IncomingPacket.aClass321_4031, IncomingPacket.SEND_PRIVATE_MESSAGE, IncomingPacket.aClass321_4073, IncomingPacket.aClass321_3905,
			IncomingPacket.aClass321_4035, IncomingPacket.aClass321_4036, IncomingPacket.aClass321_4037, IncomingPacket.NPC_UPDATE_LARGE, IncomingPacket.aClass321_3928, IncomingPacket.CUTSCENE,
			IncomingPacket.MINIMAP_FLAG, IncomingPacket.SLOT_CONTAINER_UPDATE, IncomingPacket.aClass321_3984, IncomingPacket.aClass321_4044, IncomingPacket.aClass321_4045,
			IncomingPacket.aClass321_4046, IncomingPacket.PING_PACKET, IncomingPacket.aClass321_4048, IncomingPacket.CONTAINER_UPDATE, IncomingPacket.FRIENDS_CHAT_PACKET,
			IncomingPacket.aClass321_3957, IncomingPacket.aClass321_4052, IncomingPacket.aClass321_4068, IncomingPacket.aClass321_3994, IncomingPacket.PLAYER_WEIGHT, IncomingPacket.aClass321_4056,
			IncomingPacket.aClass321_4057, IncomingPacket.aClass321_4058, IncomingPacket.REMOVE_OBJECT, IncomingPacket.ADD_FRIEND, IncomingPacket.aClass321_4061, IncomingPacket.CHANGE_WORLD,
			IncomingPacket.LOBBY_LOGOUT, IncomingPacket.aClass321_4064, IncomingPacket.aClass321_4065, IncomingPacket.SEND_OBJECT, IncomingPacket.aClass321_4008, IncomingPacket.SET_PLAYER_INTERFACE,
			IncomingPacket.aClass321_4069, IncomingPacket.aClass321_4070, IncomingPacket.aClass321_4053, IncomingPacket.aClass321_4072, IncomingPacket.CLAN_QC_MSG,
			IncomingPacket.OTHER_PLAYER_ON_ICOMPONENT });
	}

	static final void method2182(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, short i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -720044477) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray814 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method2183(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		Class597.method7044((((Cs2Executor) class441).aClass572_Sub10_5104 == Class251.aClass572_Sub10_2731), i_0_, (short) 30602);
	}

	static void method2184(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 2] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 2]), 1694549610))).method4665(Class133_Sub23.playerVarsProvider, (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1]), 1993354941)) ? 1 : 0;
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}

	public static void method2185(String string, int i) {
		Class375_Sub3.method8878(0, 0, "", "", "", string, 1977703002);
	}

	static final void method2186(Cs2Executor class441, short i) {
		Class426_Sub1.method9241(-1714912747 * Class547_Sub1.anInt8977, 1035488115);
	}
}

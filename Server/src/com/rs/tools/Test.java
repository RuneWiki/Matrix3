package com.rs.tools;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.rs.cache.Cache;
import com.rs.cache.loaders.ClientScriptMap;
import com.rs.cache.loaders.ItemDefinitions;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.cache.loaders.ObjectDefinitions;
import com.rs.utils.Utils;

public class Test {

	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 * @throws IOException
	 * @throws NoSuchProviderException 
	 */
	

	public static void main(String[] args) throws IOException, NoSuchProviderException {
	//	Cache.init();
		

		
		//System.out.println(Cache.STORE.getIndexes()[3].getTable().isNamed());
		/*Cache.init();
		ItemDefinitions defs = ItemDefinitions.getItemDefinitions(1359);
		System.out.println(defs.clientScriptData);*/
		Cache.init();
		NPCDefinitions defs = NPCDefinitions.getNPCDefinitions(6146);
		System.out.println(defs.clientScriptData);
		
		//System.out.println(Cache.STORE.getIndexes()[40].getLastArchiveId());
		
		
	/*	int i = 0; 
		for(int archiveId : Cache.STORE.getIndexes()[40].getTable().getValidArchiveIds()) {
			if(archiveId % 5000 == 0) {
				Cache.STORE.getIndexes()[40].resetCachedFiles();
				Cache.STORE.getIndexes()[40].getMainFile().resetCachedArchives();
			}
			byte[] data = Cache.STORE.getIndexes()[40].getFile(archiveId);
			InputStream stream = new InputStream(data);
			  if (stream.readUnsignedByte() != 74
				      || stream.readUnsignedByte() != 65
				      || stream.readUnsignedByte() != 71
				      || stream.readUnsignedByte() != 65)
				  continue;
			  if(ClientScriptMap.getMap(1351).getKeyForValue(archiveId) != -1) {
				  continue;
			  }
			  System.out.println("archiveId: "+archiveId+", "+(i++));
		}
		Cache.STORE.getIndexes()[40].resetCachedFiles();
		Cache.STORE.getIndexes()[40].getMainFile().resetCachedArchives();*/
		
		/*ItemDefinitions defs = ItemDefinitions.getItemDefinitions(31268);
		System.out.println(defs.modelId);
		System.out.println(defs.maleEquip1);
		System.out.println(defs.maleEquip2);
		System.out.println(defs.maleEquipModelId3);
		System.out.println(defs.femaleEquip1);
		System.out.println(defs.femaleEquip2);
		System.out.println(defs.femaleEquipModelId3);*/

		//23659
		//System.out.println(Utils.getNPCDefinitionsSize());
		//System.out.println(ItemDefinitions.getItemDefinitions(31268).); 

		//Cache.STORE = new Store(System.getProperty("user.home") + "/812_cache/812_cache/");
		//ItemDefinitions.clearItemsDefinitions();
		//	AnimationDefinitions defs = new Animation(23941).getDefinitions();
		//Integer startGfx = (Integer) defs.clientScriptData.get(2920);
		//Integer startGfxHeight = (Integer) defs.clientScriptData.get(4339/*4090*/);
		//if (startGfx != null)
		//	System.out.println(startGfx);

		//ItemDefinitions defs = ItemDefinitions.getItemDefinitions(-1);

		//Animation attackAnim = new Animation(23941);
		//int projectileDelay = attackAnim.getDefinitions().getEmoteClientCycles();

		//System.out.println(projectileDelay);

		/*List<Integer> usedMaps = new LinkedList<Integer>();
		int mapIdx = 0;

		System.out.print("private static final int[] PRODUCTS = {");
		outerLoop : for (int item = 0; item < Utils.getItemDefinitionsSize(); item++) {
			ItemDefinitions defs = ItemDefinitions.getItemDefinitions(item);
			if (defs.getCSOpcode(2696) == 19 && !defs.isNoted()) {
				if (defs.getCSOpcode(2650) == 0 && defs.getCSOpcode(2656) == 0 && defs.getCSOpcode(2653) == 0)
					continue;
				SkillDialogue d = SkillsDialogue.findSkillDialogueByProduce(item);
				if (d == null)
					continue;
				innerLoop : for (SkillCategory c : d.getCategorys()) {
					for(int id : c.getItems())
						if(item == id) {
							if (usedMaps.contains(c.getItemsCSMapId()))
								continue outerLoop;
							else {
								usedMaps.add(c.getItemsCSMapId());
								break innerLoop;
							}
						}
				}

				ClientScriptMap map = ClientScriptMap.getMap(usedMaps.get(mapIdx));
				System.out.print(map.getIntValueAtIndex(0)+", ");
				mapIdx++;
			}
		}
		System.out.println("};");*/
		/*	
		for (int item = 0; item < Utils.getItemDefinitionsSize(); item++) {
			ItemDefinitions defs = ItemDefinitions.getItemDefinitions(item);
			if (defs.isNoted() || defs.getCSOpcode(2696) != 19)
				continue;
			if (defs.clientScriptData != null) {
				innerLoop: for (int key : defs.clientScriptData.keySet()) {
					int value = defs.getCSOpcode(key);
					if (value == 0)
						continue innerLoop;
					if (value == 1777)
						System.out.println("Key: "+item+", "+key+", "+value);
				}
			}
		}

		ItemDefinitions defs = ItemDefinitions.getItemDefinitions(50);
		System.out.println(defs.clientScriptData);*/


		//	System.out.println(Arrays.toString(Cache.STORE.getIndexes()[2].getFile(60, 0).length));
		//		System.out.println(ItemDefinitions.getItemDefinitions(11694).getCombatOpcode(4369));
		/*	System.out.println(ItemDefinitions.getItemDefinitions(861).clientScriptData); //magic shortbow
			System.out.println(ItemDefinitions.getItemDefinitions(892).clientScriptData); //rune arrow
			System.out.println(ItemDefinitions.getItemDefinitions(830).clientScriptData); //javelin
			System.out.println(ItemDefinitions.getItemDefinitions(11235).clientScriptData); //d bow
			System.out.println(ItemDefinitions.getItemDefinitions(25917).clientScriptData); //dragon crossbow
			System.out.println(ItemDefinitions.getItemDefinitions(9244).clientScriptData); //dragon bolt 
			System.out.println("whip"); //dragon bolt 
			System.out.println(ItemDefinitions.getItemDefinitions(28617).clientScriptData); //dragon bolt */

		/*		System.out.println(NPCDefinitions.getNPCDefinitions(6260).clientScriptData);
			System.out.println(NPCDefinitions.getNPCDefinitions(8133).clientScriptData);
			System.out.println(NPCDefinitions.getNPCDefinitions(50).clientScriptData);
			System.out.println(NPCDefinitions.getNPCDefinitions(6229).clientScriptData);*/

		//{3=1829, 2865=1694, 2848=8, 26=3, 29=1829, 641=12500, 14=4, 965=12500}
		//{2852=30, 3=1132, 2848=0, 2865=1132, 2864=150, 2849=50, 2850=50, 2851=40, 2890=1, 26=3, 2892=1, 965=6000, 14=8}
		//{3=1783, 4=1783, 2848=5, 2865=1694, 26=2, 29=1783, 641=5000, 965=5000, 643=5000, 14=4}


		//2892 - flag is stun imune
		/*NPCDefinitions n2 = NPCDefinitions.getNPCDefinitions(1);
		System.out.println(n2.clientScriptData);

		//2850, 2851 - data. 2890, 2892 - flags.
		for(int i = 0; i < Utils.getNPCDefinitionsSize(); i++) {
			if(i == 10000)
				break;
			NPCDefinitions n = NPCDefinitions.getNPCDefinitions(i);
			if(n.clientScriptData == null)
				continue;
			if(n.clientScriptData.containsKey(2864))
				System.out.println(i+", "+n.name+", "+n.clientScriptData);
		}*/

		//System.out.println(NPCDefinitions.getNPCDefinitions(8349).clientScriptData);
		/*System.out.println(NPCDefinitions.getNPCDefinitions(20).clientScriptData);
			System.out.println(NPCDefinitions.getNPCDefinitions(3495 ).clientScriptData);


			int i = 79560723;
			int i2 = i >> 16;
			int i3 = i - (i2 << 16);
			//9 emotes.
			System.out.println(i2+", "+i3);

			System.out.println((327 << 16 | 3));
		 */
		/*List<Integer> addedmaps = new ArrayList<Integer>();
		for(int i = 0; i < Utils.getInterfaceDefinitionsSize(); i++) {
			ItemDefinitions defs = ItemDefinitions.getItemDefinitions(i);
			if(defs.clientScriptData == null)
				continue;
			Integer scriptId = (Integer) defs.clientScriptData.get(686);
			if(scriptId != null && !addedmaps.contains(scriptId)) {
				addedmaps.add(scriptId);
				System.out.println(scriptId);
		//		cache812.getIndexes()[22].putFile(scriptId / 32, scriptId & 31, rscache.getIndexes()[22].getFile(scriptId / 32, scriptId & 31));
			}

		}*/
		//750 - tier.
		//118 - max dmg
		//staff

		//System.out.println(ItemDefinitions.getItemDefinitions(1379).clientScriptData);
		//118 - mage weapon damage

		/*	System.out.println(i2+" "+i3);
			System.out.println(1489 << 16 | 17);

			System.out.println((14 << 4 | 7));




		/*	int key = 3555  ;

			for(int i = 0; i < Utils.getInterfaceDefinitionsSize(); i++) {
				ItemDefinitions defs = ItemDefinitions.getItemDefinitions(i);

				if(defs.clientScriptData != null) {
					int data = defs.getCSOpcode(key);
					if(data != 0) {
						System.out.println(i+", "+defs.name+", "+data);
					}
				}
			}
			for(int i = 0; i < 20000; i++) {
				GeneralRequirementMap defs = GeneralRequirementMap.getMap(i);

				//if(defs.clientScriptData != null) {
					Object data = defs.getValue(key);
					if(data != null) {
						System.out.println("gr: "+i+", "+", "+data+", "+defs.getValues().toString());
					}
				//}
			}*/

	}

	public static int getArrowThrowGfxId(int arrowId) {
		if (arrowId == 11212)
			return 1116;
		if (arrowId == 882)
			return 19;
		if (arrowId == 884) {
			return 18;
		} else if (arrowId == 886) {
			return 20;
		} else if (arrowId == 888) {
			return 21;
		} else if (arrowId == 890) {
			return 22;
		} else if (arrowId == 892)
			return 24;
		else if (arrowId == 78)
			return 25;
		else if (arrowId >= 14202 && arrowId <= 14206)
			return 1872 + (arrowId - 14202);
		else if (arrowId == 19157)
			return 95;
		else if (arrowId == 19152)
			return 96;
		else if (arrowId == 19162)
			return 97;

		else if (arrowId == 15947 || arrowId == 16427)//NOVITE
			return 2466;
		else if (arrowId == 15958 || arrowId == 15969 || arrowId == 15980 || arrowId == 16482 || arrowId == 16537 || arrowId == 16592)
			return 2488;

		else if (arrowId == 15948 || arrowId == 16432)//BATHUS
			return 2468;
		else if (arrowId == 15959 || arrowId == 15970 || arrowId == 15981 || arrowId == 16487 || arrowId == 16542 || arrowId == 16597)
			return 2490;

		else if (arrowId == 15949 || arrowId == 16437)//MARMAROS
			return 2470;
		else if (arrowId == 15960 || arrowId == 15971 || arrowId == 15982 || arrowId == 16492 || arrowId == 16547 || arrowId == 16602)
			return 2492;

		else if (arrowId == 15950 || arrowId == 16442)//Kratonite
			return 2472;
		else if (arrowId == 15961 || arrowId == 15972 || arrowId == 15983 || arrowId == 16497 || arrowId == 16552 || arrowId == 16607)
			return 2494;

		else if (arrowId == 15951 || arrowId == 16447)//Fractite
			return 2474;
		else if (arrowId == 15962 || arrowId == 15973 || arrowId == 15984 || arrowId == 16502 || arrowId == 16557 || arrowId == 16612)
			return 2496;

		else if (arrowId == 15952 || arrowId == 16452)//Zephyrium
			return 2476;
		else if (arrowId == 15963 || arrowId == 15974 || arrowId == 15985 || arrowId == 16507 || arrowId == 16562 || arrowId == 16617)
			return 2498;

		else if (arrowId == 15953 || arrowId == 16457)//Argonite
			return 2478;
		else if (arrowId == 15964 || arrowId == 15975 || arrowId == 15986 || arrowId == 16512 || arrowId == 16567 || arrowId == 16622)
			return 2500;

		else if (arrowId == 15954 || arrowId == 16462)//Katagon
			return 2480;
		else if (arrowId == 15965 || arrowId == 15976 || arrowId == 15987 || arrowId == 16517 || arrowId == 16572 || arrowId == 16627)
			return 2502;

		else if (arrowId == 15955 || arrowId == 16467)//Gorgonite
			return 2482;
		else if (arrowId == 15966 || arrowId == 15977 || arrowId == 15988 || arrowId == 16522 || arrowId == 16577 || arrowId == 16632)
			return 2504;

		else if (arrowId == 15956 || arrowId == 16472)//Promethium
			return 2484;
		else if (arrowId == 15967 || arrowId == 15978 || arrowId == 15989 || arrowId == 16527 || arrowId == 16582 || arrowId == 16637)
			return 2506;

		else if (arrowId == 15957 || arrowId == 16477)//Sagittarian
			return 2486;
		else if (arrowId == 15968 || arrowId == 15979 || arrowId == 15990 || arrowId == 16532 || arrowId == 16587 || arrowId == 16642)
			return 2508;

		return -1; // bronze default
	}

	public static void mainr(String[] args) throws IOException {
		Cache.init();
		for (int i = 0; i < 9000; i++) {
			ClientScriptMap csmap = ClientScriptMap.getMap(i);
			if (csmap.valueType == 'h') {
				System.out.println(i + ", " + csmap.getValues() + ", " + csmap.keyType + ", " + csmap.valueType);
			}
		}
	}

	/*
	 * types:
	 * c - component uid
	 * I - component uid(interface)
	 * s - string
	 * S - skill
	 * i - integer
	 * o - item
	 * n - npc
	 * g - clientscriptmap
	 * m - model
	 * t - gfx
	 * J - general req map
	 * d - sprite
	 * A - animation
	 * â - stance
	 * t - gfx
	 */
	public static void mainrrrr(String[] args) throws IOException {
		Cache.init();
		int total = 0;
		List<Integer> menus = new ArrayList<Integer>();
		//contains all existing categories
		ClientScriptMap options = ClientScriptMap.getMap(6816);

		l: for (int i = 0; i < 9000; i++) {
			if (!Utils.csMapExists(i))
				continue;
			ClientScriptMap scmap = ClientScriptMap.getMap(i);
			if (scmap.getSize() == 0 || scmap.keyType != 'i' || scmap.valueType != 'g')
				continue;

			for (int i2 = 0; i2 < scmap.getSize(); i2++) {
				int map = scmap.getIntValue(i2);
				if (!options.getValues().containsKey((long) map))
					continue l;
				/*ClientScriptMap scmapitem = ClientScriptMap.getMap(map);
				if(scmapitem.getDefaultIntValue() != -1 || scmapitem.getSize() == 0) 
					continue l;
				for(int i3 = 0; i3 < scmapitem.getSize(); i3++) {
					int item = scmapitem.getIntValue(i3);
					if(item == -1)
						continue l;
				}*/
			}
			ClientScriptMap scmapnamef = null;
			int i3;
			for (i3 = 1; i3 < 3; i3++) {
				ClientScriptMap scmapname = ClientScriptMap.getMap(i3 + i);
				if (scmapname.getSize() != scmap.getSize() || scmapname.keyType != 'i' || scmapname.valueType != 's')
					continue;
				scmapnamef = scmapname;
				break;
			}
			/*if(scmapnamef == null)
				continue l;*/
			System.out.println(i + ", " + (scmapnamef == null ? null : scmapnamef.getValues()) + ", " + (++total) + ", trys: " + i3);
			menus.add(i);
		}
		//System.out.println(menus);

	}

	private static int[] SKILL_DIALOGUES = { 5773, 6675, 6780, 6784, 6794, 6803, 6809, 6821, 6823, 6832, 6838, 6848, 6852, 6853, 6861, 6869, 6877, 6879, 6894, 6896, 6919, 6939, 6941, 6943, 6945, 6981, 6987, 7004, 7006, 7008, 7010, 7012, 7042, 7051, 7057, 7059, 7061, 7079, 7081, 7094, 7113, 7551, 7800, 7812 };

	private static int[] NO_MENU_CATEGORIES = { 7050, 7048, 7049, 7046, 7047, 7070, 7069, 7065, 7064, 7063, 7077, 7078, 7103, 7102, 7096, 7093, 7092, 7106, 8076, 7104, 7105, 7556, 8002, 6921, 6934, 6935, 6938, 6936, 6937, 7512, 6972, 6973, 6974, 6975, 6969, 6970, 6971, 6979, 6977, 6976, 6980, 6986, 6990, 6989, 8858, 8856, 8857, 8854, 8855, 8853, 6808, 6840, 6830, 6831, 6829, 6868, 6898, 6674, 7278, 7277, 7276, 7275, 8697, 6770, 6771, 6768, 6769, 6774, 6775, 6772, 6773, 6778, 6779, 6776, 6777, 6762, 6761, 6767, 6766, 6765, 6764 };

	public static void mainrr(String[] args) throws IOException {
		Cache.init();
		ClientScriptMap options = ClientScriptMap.getMap(6816);

		int categoryC = 0;
		for (int d : SKILL_DIALOGUES) {
			for (Object v : ClientScriptMap.getMap(d).getValues().values()) {
				options.getValues().remove(new Long((Integer) v));
			}
		}
		System.out.println(categoryC + ", " + options.getSize());
		System.out.println(options.getValues().keySet());

	}

	/*
	public boolean packIndex(int id, Store originalStore, boolean checkCRC) {

		Index originalIndex = originalStore.getIndexes()[id];
		for (int archiveId : originalIndex.table.getValidArchiveIds()) {
			if (checkCRC
					&& archiveExists(archiveId)
					&& originalIndex.table.getArchives()[archiveId]
							.getCRC() == table.getArchives()[archiveId]
							.getCRC())
				continue;
			if (!putArchive(id, archiveId, originalStore, false, false))
				return false;
		}
		if (!rewriteTable())
			return false;
		resetCachedFiles();
		return true;
	}*/

	public static int getChanceOld(int level) {

		return (int) (0.0008d * Math.pow(level, 3) + 4 * level + 40);

	}

	public static int getChance(int level) {

		//	return (int) (0.0008d*Math.pow(level, 3) + 4*level + 40);
		//efficient
		return (int) (Math.sqrt(level * 100) * 10);

	}

	public static void main2(String args[]) throws IOException {

		Cache.init();

		for (int i = 0; i < 40; i++) {
			System.out.println("checking idx " + i);
			checkIndexKeyWords(i);
		}
	}

	public static void checkIndexKeyWords(int index) {
		if (Cache.STORE.getIndexes()[index] == null)
			return;
		for (int id = 0; id < Cache.STORE.getIndexes()[index].getLastArchiveId() + 1; id++) {
			checkArchiveKeyWords(index, id);
		}
	}

	public static void checkArchiveKeyWords(int index, int archiveId) {
		for (int id = 0; id < Cache.STORE.getIndexes()[index].getLastFileId(archiveId) + 1; id++) {
			/*if(id > 1000)
				break;*/
			byte[] data = Cache.STORE.getIndexes()[index].getFile(archiveId, id);
			if (data == null)
				continue;
			String test = new String(data).toLowerCase().trim();
			/*	String filtered = "";
				for(char c : test.toCharArray()) {
					if(!Utils.containsInvalidCharacter(c) || c == ' ') {
						filtered += c;
					}
				}
				if(filtered.length() > 2)*/
			if (test.contains("tolna"))
				System.out.println("index " + index + ", archive " + archiveId + ", file " + id + " data: " + test);
		}
	}
}

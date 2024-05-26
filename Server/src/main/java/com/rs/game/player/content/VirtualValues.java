package com.rs.game.player.content;

import com.rs.Settings;
import com.rs.game.player.content.grandExchange.GrandExchange;

public class VirtualValues {

	public static void setValues() {
		//Lucky Armadyl godsword
		GrandExchange.setPrice(23679, GrandExchange.getPrice(11694));
		//Lucky Bandos godsword
		GrandExchange.setPrice(23680, GrandExchange.getPrice(11696));
		//Lucky Saradomin godsword
		GrandExchange.setPrice(23681, GrandExchange.getPrice(11698));
		//Lucky Zamorak godsword
		GrandExchange.setPrice(23682, GrandExchange.getPrice(11700));
		
		//Lucky Zamorakian spear
		GrandExchange.setPrice(23683, GrandExchange.getPrice(11716));
		
		//Lucky Armadyl helmet
		GrandExchange.setPrice(23684, GrandExchange.getPrice(11718));
		//Lucky Armadyl chestplate
		GrandExchange.setPrice(23685, GrandExchange.getPrice(11720));
		//Lucky Armadyl chainskirt
		GrandExchange.setPrice(23686, GrandExchange.getPrice(11722));
		
		//Lucky Bandos chestplate
		GrandExchange.setPrice(23687, GrandExchange.getPrice(11724));
		//Lucky Bandos tassets
		GrandExchange.setPrice(23688, GrandExchange.getPrice(11726));
		//Lucky Bandos boots
		GrandExchange.setPrice(23689, GrandExchange.getPrice(11728));
		
		//Lucky Saradomin sword
		GrandExchange.setPrice(23690, GrandExchange.getPrice(11730));
		
		//Lucky abyssal whip
		GrandExchange.setPrice(23691, GrandExchange.getPrice(4151));
		
		
		//Lucky dragon full helm
		GrandExchange.setPrice(23692, GrandExchange.getPrice(11335));
		//Lucky dragon platebody
		GrandExchange.setPrice(23693, GrandExchange.getPrice(14479));
		//Lucky dragon chainbody
		GrandExchange.setPrice(23694, GrandExchange.getPrice(3140));
		//Lucky dragon claws
		GrandExchange.setPrice(23695, GrandExchange.getPrice(14484));
		//Lucky dragon 2h sword
		GrandExchange.setPrice(23696, GrandExchange.getPrice(7158));
		
		//Lucky arcane spirit shield
		GrandExchange.setPrice(23697, GrandExchange.getPrice(13738));
		//Lucky divine spirit shield
		GrandExchange.setPrice(23698, GrandExchange.getPrice(13740));
		//Lucky elysian spirit shield
		GrandExchange.setPrice(23699, GrandExchange.getPrice(13742));
		//Lucky spectral spirit shield
		GrandExchange.setPrice(23700, GrandExchange.getPrice(13744));
		
		//Fire cape
		GrandExchange.setPrice(6570, 3500000);
		//TokHaar-Kal
		GrandExchange.setPrice(23659, 6000000);
		//Nomad capes
		GrandExchange.setPrice(15432, 65000);
		GrandExchange.setPrice(15433, 65000);
		
		//Abyssal vine whip
		GrandExchange.setPrice(21371, GrandExchange.getPrice(4151)+GrandExchange.getPrice(21369));
		
		//korasi
		GrandExchange.setPrice(19784, 245000);
		
		//Dragon fire shield
		GrandExchange.setPrice(11283, GrandExchange.getPrice(11284));
		
		//chaotics
		for(int id = 18349; id <= 18364; id++)
			GrandExchange.setPrice(id, 20000001);
		
		//arcane stream neck
		GrandExchange.setPrice(18335, 3050000);
		
		//zanik cbow
		GrandExchange.setPrice(14684, GrandExchange.getPrice(9183));
		
		GrandExchange.setPrice(Settings.VOTE_TOKENS_ITEM_ID, 3);

	}
	
}

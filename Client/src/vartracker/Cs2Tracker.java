package vartracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Timer;
import javax.swing.UIManager;

import game.BaseVarType;
import game.Cs2Executor;
import game.ScriptVarType;
import game.VarBitDefinition;
import game.VarDefinition;
import game.VarDomainType;
import game.VarTransmitLevel;

public class Cs2Tracker {

	private static class ConfigData {
		String source;
		VarDefinition vbasic;
		VarBitDefinition vbit;
		boolean instanced;		
		
		
		Object value;
		boolean read;
		boolean write;
		long lastTrigger;
		
		
		public ConfigData(String source, VarDefinition def, boolean instanced) {
			this.source = source;
			this.vbasic = def;
			this.vbit = null;
			this.instanced = instanced;
			
			this.value = null;
			this.read = false;
			this.write = false;
			this.lastTrigger = 0;
		}

		public ConfigData(String source, VarBitDefinition def, boolean instanced) {
			this.source = source;
			this.vbasic = null;
			this.vbit = def;
			this.instanced = instanced;
			
			this.value = null;
			this.read = false;
			this.write = false;
			this.lastTrigger = 0;
		}
		
		public void update(Object value, boolean read) {
			this.value = value;
			this.lastTrigger = System.currentTimeMillis();
			if (read && !this.read)
				this.read = true;
			else if (!read && !this.write)
				this.write = true;
		}
		
		
		public boolean instanced() {
			return instanced;
		}
		
		public boolean isBit() {
			return vbit != null;
		}
		
		
		
		public String source() {
			return source;
		}
		
		
		public int id() {
			if (vbit != null)
				return vbit.id * 1242136343;
			return vbasic.id * 473591285;
		}
		
		public String name() {
			String base = "";
			VarTransmitLevel level = transmitLevel();
			if (level != VarTransmitLevel.NEVER)
				base += "T";
			base += temp() ? "TEMP_" : "";
			
			if (vbit != null) {
				if (vbit.baseVar.domain == VarDomainType.PLAYER_CONFIGS)
					return (instanced ? "BITPLAYER_" : "BITSTANDART_") + id();
				else if (vbit.baseVar.domain == VarDomainType.NPC_CONFIGS)
					return "BITNPC_" + id();
				else if (vbit.baseVar.domain == VarDomainType.CLIENT_CONFIGS)
					return "BITCS2_" + id();
				else if (vbit.baseVar.domain == VarDomainType.CLAN_CONFIGS)
					return "BITCLAN_" + id();
				else if (vbit.baseVar.domain == VarDomainType.CLAN_SETTING_CONFIGS)
					return "BITCLAN_SETTING_" + id();
				else
					return "BITUNKNOWN_" + id();
			}
			else {
				if (vbasic.domain == VarDomainType.PLAYER_CONFIGS)
					return (instanced ? "PLAYER_" : "STANDART_") + id();
				else if (vbasic.domain == VarDomainType.NPC_CONFIGS)
					return "NPC_" + id();
				else if (vbasic.domain == VarDomainType.CLIENT_CONFIGS)
					return "CS2_" + id();
				else if (vbasic.domain == VarDomainType.CLAN_CONFIGS)
					return "CLAN_" + id();
				else if (vbasic.domain == VarDomainType.CLAN_SETTING_CONFIGS)
					return "CLAN_SETTING_" + id();
				else
					return "UNKNOWN_" + id();
			}
		}
		
		
		public boolean temp() {
			if (isBit())
				return vbit.baseVar.isTemp;
			return vbasic.isTemp;
		}
		
		
		public ScriptVarType type() {
			if (isBit())
				return vbit.baseVar.dataType;
			return vbasic.dataType;
		}	
		
		public BaseVarType baseType() {
			if (isBit())
				return vbit.baseVar.dataType.getBaseType(0);
			else
				return vbasic.dataType.getBaseType(0);
		}
		
		public VarDomainType domain() {
			if (isBit())
				return vbit.baseVar.domain;
			return vbasic.domain;
		}
		
		public VarTransmitLevel transmitLevel() {
			if (isBit())
				return vbit.baseVar.transmitLevel;
			return vbasic.transmitLevel;
		}
		
		public Object value() {
			return value;
		}
		
		public boolean read() {
			return read;
		}
		
		public boolean write() {
			return write;
		}
	}
	
	
	private static Object lock;
	private static Map<String, ConfigData> all;
	private static Map<String, List<ConfigData>> byinter;
	private static Map<String, List<ConfigData>> byscript;
	private static TrackerGUI gui;
	
	
	static {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable t) {
			t.printStackTrace();
		}
		lock = new Object();
		all = new HashMap<String, ConfigData>();
		byinter = new HashMap<String, List<ConfigData>>();
		byscript = new HashMap<String, List<ConfigData>>();
		gui = new TrackerGUI();
		gui.setVisible(true);
		
		
		Timer timer = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				long time = System.currentTimeMillis();
				long max = gui.maxTime();
				int mode = gui.getMode();
				int r0 = gui.idRange0();
				int r1 = gui.idRange1();
				String filter = gui.getFilter();
				
				
				StringBuilder text = new StringBuilder();
				try {
					Map<String, List<ConfigData>> cpy = null;
					synchronized (lock) {
						cpy = new HashMap<String, List<ConfigData>>(byinter);
					}
					
					for (List<ConfigData> list : cpy.values()) {
						for (ConfigData data : list) {
							if (mode == 1 && (!data.read() || data.write()))
								continue;
							else if (mode == 2 && (data.read() || !data.write()))
								continue;
							
							if (data.id() < r0 || data.id() > r1)
								continue;
							
							if (data.domain() == VarDomainType.PLAYER_CONFIGS) {
								if (data.instanced() && !gui.trackPlayer())
									continue;
								else if (!data.instanced() && !gui.trackStd())
									continue;
							}
							else if (data.domain() == VarDomainType.NPC_CONFIGS) {
								if (!gui.trackNpc())
									continue;
							}
							else if (data.domain() == VarDomainType.CLIENT_CONFIGS) {
								if (!gui.trackCs2())
									continue;
							}
							else if (!gui.trackOthers()) {
								continue;
							}
							
							
							if ((time - data.lastTrigger) > max)
								continue;
							
							String str = data.name() + " = " + data.value() + " ('" + data.type().getTypeChar() + "') " + data.source() + "\r\n";
							if (filter == null || str.toLowerCase().contains(filter))
								text.append(str);
						}
					}
				}
				catch (Throwable t) {
					t.printStackTrace();
				}
				
				gui.getConsole().setText(text.toString());
			}
		});
		timer.setInitialDelay(0);
		timer.setRepeats(true);
		timer.start();
	}
	
	
	public static void clear() {
		synchronized (lock) {
			all.clear();
			byinter.clear();
			byscript.clear();
		}
	}
	

	
	public static void trackRead(Cs2Executor executor, VarDefinition var, Object value, boolean instanced) {
		if (var.domain == VarDomainType.CLIENT_CONFIGS && var.transmitLevel != VarTransmitLevel.NEVER)
			return; // skip transmitable vars
		
		String script = "" + (executor.current.hash * 381237825124074065L) + "";
		String inter = "", interfull = "";
		
		if (executor.custom_launchargs.thizInterface != null) {
			int id = (executor.custom_launchargs.thizInterface.selfId * -1718435171) >> 16;
			int component = (executor.custom_launchargs.thizInterface.selfId * -1718435171) & 0xFFFF;
			int dyn = (executor.custom_launchargs.thizInterface.activeComponent * -1665128073);
			inter = "" + id + "";
			interfull = "(" + id + "," + component + "," + dyn + ")";
		}
		else {
			inter = interfull = "(nointer)";
		}
		
		
		String key = (var.id * 473591285) + "$" + script + "$" + interfull;
		synchronized (lock) {
			ConfigData data = all.get(key);
			if (data == null) {
				all.put(key, data = new ConfigData(interfull + ":" + script, var, instanced));
				
				List<ConfigData> byInter = byinter.get(inter);
				List<ConfigData> byScript = byscript.get(script);
				if (byInter == null)
					byinter.put(inter, byInter = new ArrayList<ConfigData>());
				if (byScript == null)
					byscript.put(script, byScript = new ArrayList<ConfigData>());
				
				byInter.add(data);
				byScript.add(data);
			}

			data.update(value, true);
		}
	}
	
	public static void trackWrite(Cs2Executor executor, VarDefinition var, Object value, boolean instanced) {
		if (var.domain == VarDomainType.CLIENT_CONFIGS && var.transmitLevel != VarTransmitLevel.NEVER)
			return; // skip transmitable vars
		
		String script = "" + (executor.current.hash * 381237825124074065L) + "";
		String inter = "", interfull = "";
		
		if (executor.custom_launchargs.thizInterface != null) {
			int id = (executor.custom_launchargs.thizInterface.selfId * -1718435171) >> 16;
			int component = (executor.custom_launchargs.thizInterface.selfId * -1718435171) & 0xFFFF;
			int dyn = (executor.custom_launchargs.thizInterface.activeComponent * -1665128073);
			inter = "" + id + "";
			interfull = "(" + id + "," + component + "," + dyn + ")";
		}
		else {
			inter = interfull = "(nointer)";
		}
		
		String key = (var.id * 473591285) + "$" + script + "$" + interfull;
		synchronized (lock) {
			ConfigData data = all.get(key);
			if (data == null) {
				all.put(key, data = new ConfigData(interfull + ":" + script, var, instanced));
				
				List<ConfigData> byInter = byinter.get(inter);
				List<ConfigData> byScript = byscript.get(script);
				if (byInter == null)
					byinter.put(inter, byInter = new ArrayList<ConfigData>());
				if (byScript == null)
					byscript.put(script, byScript = new ArrayList<ConfigData>());
				
				byInter.add(data);
				byScript.add(data);
			}

			data.update(value, false);
		}
	}
	
	
	
	public static void trackRead(Cs2Executor executor, VarBitDefinition var, int value, boolean instanced) {
		if (var.baseVar.domain == VarDomainType.CLIENT_CONFIGS && var.baseVar.transmitLevel != VarTransmitLevel.NEVER)
			return; // skip transmitable vars
			
		String script = "" + (executor.current.hash * 381237825124074065L) + "";
		String inter = "", interfull = "";
		
		if (executor.custom_launchargs.thizInterface != null) {
			int id = (executor.custom_launchargs.thizInterface.selfId * -1718435171) >> 16;
			int component = (executor.custom_launchargs.thizInterface.selfId * -1718435171) & 0xFFFF;
			int dyn = (executor.custom_launchargs.thizInterface.activeComponent * -1665128073);
			inter = "" + id + "";
			interfull = "(" + id + "," + component + "," + dyn + ")";
		}
		else {
			inter = interfull = "(nointer)";
		}
		
		String key = (var.id * 1242136343) + "$" + script + "$" + interfull;
		synchronized (lock) {
			ConfigData data = all.get(key);
			if (data == null) {
				all.put(key, data = new ConfigData(interfull + ":" + script, var, instanced));
				
				List<ConfigData> byInter = byinter.get(inter);
				List<ConfigData> byScript = byscript.get(script);
				if (byInter == null)
					byinter.put(inter, byInter = new ArrayList<ConfigData>());
				if (byScript == null)
					byscript.put(script, byScript = new ArrayList<ConfigData>());
				
				byInter.add(data);
				byScript.add(data);
			}

			data.update(value, true);
		}
	}
	
	public static void trackWrite(Cs2Executor executor, VarBitDefinition var, int value, boolean instanced) {
		if (var.baseVar.domain == VarDomainType.CLIENT_CONFIGS && var.baseVar.transmitLevel != VarTransmitLevel.NEVER)
			return; // skip transmitable vars
		
		String script = "" + (executor.current.hash * 381237825124074065L) + "";
		String inter = "", interfull = "";
		
		if (executor.custom_launchargs.thizInterface != null) {
			int id = (executor.custom_launchargs.thizInterface.selfId * -1718435171) >> 16;
			int component = (executor.custom_launchargs.thizInterface.selfId * -1718435171) & 0xFFFF;
			int dyn = (executor.custom_launchargs.thizInterface.activeComponent * -1665128073);
			inter = "" + id + "";
			interfull = "(" + id + "," + component + "," + dyn + ")";
		}
		else {
			inter = interfull = "(nointer)";
		}
		
		String key = (var.id * 1242136343) + "$" + script + "$" + interfull;
		synchronized (lock) {
			ConfigData data = all.get(key);
			if (data == null) {
				all.put(key, data = new ConfigData(interfull + ":" + script, var, instanced));
				
				List<ConfigData> byInter = byinter.get(inter);
				List<ConfigData> byScript = byscript.get(script);
				if (byInter == null)
					byinter.put(inter, byInter = new ArrayList<ConfigData>());
				if (byScript == null)
					byscript.put(script, byScript = new ArrayList<ConfigData>());
				
				byInter.add(data);
				byScript.add(data);
			}

			data.update(value, false);
		}
	}


	

	
	
}

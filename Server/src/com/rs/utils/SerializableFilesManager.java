package com.rs.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import minifs.MiniFS;

import com.rs.Settings;
import com.rs.game.player.content.clans.Clan;
import com.rs.game.player.content.grandExchange.Offer;
import com.rs.game.player.content.grandExchange.OfferHistory;

public class SerializableFilesManager {

	private static final String CLAN_PATH = "clans/";
	private static final String GE_OFFERS = "grandExchangeOffers.ser";
	private static final String GE_OFFERS_HISTORY = "grandExchangeOffersTrack.ser";
	private static final String GE_PRICES = "grandExchangePrices.ser";

	private static MiniFS filesystem;

	private SerializableFilesManager() {
		throw new Error();
	}

	public static synchronized void init() {
		try {
			if (Settings.HOSTED)
				filesystem = MiniFS.open(Settings.DATA_PATH + Settings.WORLD_ID);
			else {
				if (new File(Settings.DATA_PATH + "_" + System.getProperty("user.name") + ".data").exists()) {
					filesystem = MiniFS.open(Settings.DATA_PATH + "_" + System.getProperty("user.name"));
				} else {
					Utils.copyFile(new File(Settings.DATA_PATH + "_Admin.data"), new File(Settings.DATA_PATH + "_" + System.getProperty("user.name") + ".data"));
					filesystem = MiniFS.open(Settings.DATA_PATH + "_" + System.getProperty("user.name"));
				}
			}
		} catch (Throwable t) {
			Logger.handle(t);
			throw new Error("Failed to load file system.");
		}
	}

	public static synchronized void flush() {
		try {
			boolean ok = filesystem.flush();
			if (!ok)
				throw new RuntimeException("Couldn't flush fs.");
		} catch (Throwable t) {
			Logger.handle(t);
		}
	}

	public synchronized static boolean containsClan(String name) {
		return filesystem.fileExists(CLAN_PATH + name + ".c");
	}

	public synchronized static Clan loadClan(String name) {
		try {
			return (Clan) loadObject(CLAN_PATH + name + ".c");
		} catch (Throwable e) {
			Logger.handle(e);
		}
		return null;
	}

	public synchronized static void saveClan(Clan clan) {
		try {
			storeObject(clan, CLAN_PATH + clan.getClanName() + ".c");
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public synchronized static void deleteClan(Clan clan) {
		try {
			filesystem.deleteFile(CLAN_PATH + clan.getClanName() + ".c");
		} catch (Throwable t) {
			Logger.handle(t);
		}
	}

	@SuppressWarnings("unchecked")
	public static synchronized HashMap<Long, Offer> loadGEOffers() {
		if (filesystem.fileExists(GE_OFFERS)) {
			try {
				return (HashMap<Long, Offer>) loadObject(GE_OFFERS);
			} catch (Throwable t) {
				Logger.handle(t);
				return null;
			}
		} else {
			return new HashMap<Long, Offer>();
		}
	}

	@SuppressWarnings("unchecked")
	public static synchronized ArrayList<OfferHistory> loadGEHistory() {
		if (filesystem.fileExists(GE_OFFERS_HISTORY)) {
			try {
				return (ArrayList<OfferHistory>) loadObject(GE_OFFERS_HISTORY);
			} catch (Throwable t) {
				Logger.handle(t);
				return null;
			}
		} else {
			return new ArrayList<OfferHistory>();
		}
	}

	@SuppressWarnings("unchecked")
	public static synchronized HashMap<Integer, Integer> loadGEPrices() {
		if (filesystem.fileExists(GE_PRICES)) {
			try {
				return (HashMap<Integer, Integer>) loadObject(GE_PRICES);
			} catch (Throwable t) {
				Logger.handle(t);
				return null;
			}
		} else {
			return new HashMap<Integer, Integer>();
		}
	}

	public static synchronized void saveGEOffers(HashMap<Long, Offer> offers) {
		try {
			SerializableFilesManager.storeObject(offers, GE_OFFERS);
		} catch (Throwable t) {
			Logger.handle(t);
		}
	}

	public static synchronized void saveGEHistory(ArrayList<OfferHistory> history) {
		try {
			SerializableFilesManager.storeObject(history, GE_OFFERS_HISTORY);
		} catch (Throwable t) {
			Logger.handle(t);
		}
	}

	public static synchronized void saveGEPrices(HashMap<Integer, Integer> prices) {
		try {
			SerializableFilesManager.storeObject(prices, GE_PRICES);
		} catch (Throwable t) {
			Logger.handle(t);
		}
	}

	private static synchronized Object loadObject(String f) throws IOException, ClassNotFoundException {
		byte[] data = filesystem.getFile(f);
		if (data == null)
			return null;
		ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data));
		Object object = in.readObject();
		in.close();
		return object;
	}

	private static synchronized void storeObject(Serializable o, String f) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(baos);
		out.writeObject(o);
		out.flush();
		boolean ok = filesystem.putFile(f, baos.toByteArray());
		if (!ok)
			throw new RuntimeException("Couldn't put file");
		out.close();
	}

}

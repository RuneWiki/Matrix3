package com.rs.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import minifs.MiniFS;

import com.rs.Settings;
import com.rs.login.DisplayNames;
import com.rs.login.Offences;
import com.rs.login.account.Account;

public class LoginFilesManager {

	/**
	 * Path of the folder where account files are stored.
	 */
	private static final String ACCOUNTS_PATH = "accounts/";
	/**
	 * Path where offences are stored.
	 */
	private static final String OFFENCES = "offences.ser";
	/**
	 * Path where display names are stored.
	 */
	private static final String DISPLAY_NAMES = "displayNames.ser";

	/**
	 * Filesystem, into which files are stored, might be null.
	 */
	private static MiniFS filesystem;

	public static synchronized void init() {
		try {
			if (Settings.HOSTED)
				filesystem = MiniFS.open(Settings.LOGIN_DATA_PATH);
			else {
				if (new File(Settings.LOGIN_DATA_PATH + "_" + System.getProperty("user.name") + ".data").exists()) {
					filesystem = MiniFS.open(Settings.LOGIN_DATA_PATH + "_" + System.getProperty("user.name"));
				} else {
					Utils.copyFile(new File(Settings.LOGIN_DATA_PATH + "_Admin.data"), new File(Settings.LOGIN_DATA_PATH + "_" + System.getProperty("user.name") + ".data"));
					filesystem = MiniFS.open(Settings.LOGIN_DATA_PATH + "_" + System.getProperty("user.name"));
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

	public synchronized static String[] getAllAccounts() {
		return filesystem.listFiles(ACCOUNTS_PATH);
	}

	public synchronized static boolean containsAccount(String username) {
		return filesystem.fileExists(ACCOUNTS_PATH + username + ".acc");
	}

	public synchronized static Account loadAccount(String username) {
		try {
			return (Account) loadObject(ACCOUNTS_PATH + username + ".acc");
		} catch (Throwable e) {
			Logger.handle(e);
		}
		return null;
	}

	public synchronized static void saveAccount(Account account) {
		try {
			/*if (account.isMasterLogin())
				return;*/
			storeObject(account, ACCOUNTS_PATH + account.getUsername() + ".acc");
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static synchronized Offences loadOffences() {
		if (filesystem.fileExists(OFFENCES)) {
			try {
				return (Offences) loadObject(OFFENCES);
			} catch (Throwable t) {
				Logger.handle(t);
				return null;
			}
		} else {
			return new Offences();
		}
	}

	public static synchronized void saveOffences(Offences offences) {
		try {
			storeObject(offences, OFFENCES);
		} catch (Throwable t) {
			Logger.handle(t);
		}
	}

	public static synchronized DisplayNames loadDisplayNames() {
		if (filesystem.fileExists(DISPLAY_NAMES)) {
			try {
				return (DisplayNames) loadObject(DISPLAY_NAMES);
			} catch (Throwable t) {
				Logger.handle(t);
				return null;
			}
		} else {
			return new DisplayNames();
		}
	}

	public static synchronized void saveDisplayNames(DisplayNames displayNames) {
		try {
			storeObject(displayNames, DISPLAY_NAMES);
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

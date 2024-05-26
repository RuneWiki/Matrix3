package com.rs.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import com.rs.Settings;

public final class Logger {

	private static BufferedWriter globallogs;

	static {
		try {
			if (!Settings.DEBUG) {
				Calendar c = Calendar.getInstance();
				globallogs = new BufferedWriter(new FileWriter("data/logs/global/log." + ((c.get(Calendar.MONTH)) + 1) + "." + c.get(Calendar.DATE) + "." + c.get(Calendar.YEAR) + "." + Settings.WORLD_ID + ".txt", true));
			}
		} catch (Throwable e) {
			Logger.handle(e);
		}
	}

	public static void globalLog(String ip, String name, Object o) {
		try {
			if (!Settings.DEBUG) {
				globallogs.write(Thread.currentThread().getName() + ", " + "[" + Utils.currentTime("hh:mm:ss z") + "]" + "" + name + " - " + ip + " [ " + o + " ]");
				globallogs.newLine();
				globallogs.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void handle(Throwable throwable) {
		System.out.println("ERROR! THREAD NAME: " + Thread.currentThread().getName());
		throwable.printStackTrace();
	}

	public static void log(Class<?> classInstance, Object message) {
		log(classInstance.getSimpleName(), message);
	}

	public static void log(Object classInstance, Object message) {
		log(classInstance.getClass().getSimpleName(), message);
	}

	public static void log(String className, Object message) {
		String text = "[" + className + "]" + " " + message.toString();
		System.out.println(text);
	}

}

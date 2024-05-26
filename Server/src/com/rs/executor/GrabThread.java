package com.rs.executor;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.rs.grab.Grab;
import com.rs.utils.Logger;
import com.rs.utils.Utils;

public class GrabThread extends Thread {

	private static final long UPLINK = 1024 * 1024 * 200; // 200 mbps
	private static final long UPLINK_MAX = 1024 * 1024 * 2000; // 2 gbps
	private static final List<Grab> sessions = Collections.synchronizedList(new CopyOnWriteArrayList<Grab>());

	protected GrabThread() {
		setPriority(Thread.MAX_PRIORITY);
		setName("Grab Thread");
	}

	public void run() {
		long limit = UPLINK;
		long last_sleep = Utils.currentTimeMillis();
		
		while (!GameExecutorManager.executorShutdown) {
			try {
				long t_start = Utils.currentTimeMillis();
				int processed = 0;
				for (Grab grab : sessions) {
					if (grab.processNext(limit) > 0)
						processed++;
				}
				
				long now = Utils.currentTimeMillis();
				if (processed < 1 || ((now - last_sleep) > 100)) {
					Thread.sleep(1);
					last_sleep = Utils.currentTimeMillis();
				}
				
				long t_took = Utils.currentTimeMillis() - t_start;
				if (t_took < 1)
					t_took = 1;
				
				if (processed < 1)
					limit = UPLINK * t_took;
				else
					limit = (UPLINK * t_took) / processed;
				
				if (limit > UPLINK_MAX)
					limit = UPLINK_MAX;
			}
			catch (Throwable t) {
				Logger.handle(t);
			}
		}
	}

	public static void add(Grab grab) {
		sessions.add(grab);
	}

	public static void remove(Grab grab) {
		sessions.remove(grab);
	}
}

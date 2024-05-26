package com.rs.game.tasks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.rs.utils.Logger;

public class WorldTasksManager {

	private static final List<WorldTaskInformation> tasks = Collections.synchronizedList(new LinkedList<WorldTaskInformation>());

	public static void processTasks() {
		for (WorldTaskInformation taskInformation : tasks.toArray(new WorldTaskInformation[tasks.size()])) {
			if (taskInformation.continueCount > 0) {
				taskInformation.continueCount--;
				continue;
			}
			try {
				taskInformation.task.run();
			} catch (Throwable e) {
				Logger.handle(e);
			}
			if (taskInformation.task.needRemove)
				tasks.remove(taskInformation);
			else
				taskInformation.continueCount = taskInformation.continueMaxCount;
		}
	}

	public static void schedule(WorldTask task, int delayCount, int periodCount) {
		if (task == null || delayCount < 0 || periodCount < 0)
			return;
		tasks.add(new WorldTaskInformation(task, delayCount, periodCount));
	}

	public static void schedule(WorldTask task, int delayCount) {
		if (task == null || delayCount < 0)
			return;
		tasks.add(new WorldTaskInformation(task, delayCount, -1));
	}

	public static void schedule(WorldTask task) {
		if (task == null)
			return;
		tasks.add(new WorldTaskInformation(task, 0, -1));
	}

	public static int getTasksCount() {
		return tasks.size();
	}

	private static final class WorldTaskInformation {

		private WorldTask task;
		private int continueMaxCount;
		private int continueCount;

		public WorldTaskInformation(WorldTask task, int continueCount, int continueMaxCount) {
			this.task = task;
			this.continueCount = continueCount;
			this.continueMaxCount = continueMaxCount;
			if (continueMaxCount == -1)
				task.needRemove = true;
		}
	}

}

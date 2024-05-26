package com.rs.game.player;

import com.rs.io.InputStream;

public class LogicPacket {

	private int id;
	InputStream stream;

	public LogicPacket(int id, InputStream stream) {
		this.id = id;
		this.stream = stream;
	}

	public int getId() {
		return id;
	}

	public InputStream getStream() {
		return stream;
	}

}

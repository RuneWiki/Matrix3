package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.grab.ArchiveRequest;
import com.rs.grab.Grab;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.utils.Logger;

public final class ClientPacketsDecoder extends Decoder {

	public ClientPacketsDecoder(Session connection) {
		super(connection);
	}

	@Override
	public final int decode(InputStream stream) {
		session.setDecoder(-1);
		int packetId = stream.readUnsignedByte();
		switch (packetId) {
			case 14:
				return decodeLogin(stream);
			case 15:
				return decodeGrab(stream);
			case 71: //byte 71 = G
				return decodeWebGrab(stream);
			default:
				if (Settings.DEBUG)
					Logger.log(this, "PacketId " + packetId);
				session.getChannel().close();
				return -1;
		}
	}

	private int decodeWebGrab(InputStream stream) {
		try {
			String htmlRequest = new String(stream.getBuffer());
			if (!htmlRequest.endsWith("\r\n\r\n")) {
				System.out.println("stop1");
				return 0;
			}
			htmlRequest = htmlRequest.substring(htmlRequest.indexOf("GET /ms?") + 8, htmlRequest.indexOf(" HTTP"));
			String[] data = htmlRequest.split("&");
			int m = Integer.parseInt(getVar(data, "m"));
			int indexId = Integer.parseInt(getVar(data, "a"));
			int archiveId = Integer.parseInt(getVar(data, "g"));
			if (m != 0 || archiveId < 0) {
				session.getChannel().close();
				return -1;
			}
					
			if (indexId != 255 && (Cache.STORE.getIndexes().length <= indexId || Cache.STORE.getIndexes()[indexId] == null || !Cache.STORE.getIndexes()[indexId].archiveExists(archiveId))) {
				session.getChannel().close();
				return -1;
			}
			//disable to see what happens
			if (indexId == 255 && archiveId == 255) {
				long cb = Long.parseLong(getVar(data, "cb"));
				if (cb == -1) {
					session.getChannel().close();
					return -1;
				}
			}
			else {
				int crc = Integer.parseInt(getVar(data, "c"));
				int revision = Integer.parseInt(getVar(data, "v"));
				if (crc != Cache.STORE.getIndexes()[indexId].getTable().getArchives()[archiveId].getCRC() || revision != Cache.STORE.getIndexes()[indexId].getTable().getArchives()[archiveId].getRevision()) {
					session.getChannel().close();
					return -1;
				}

			}
			session.setDecoder(-1);
			session.setEncoder(0);
			session.getGrabPackets().sendCacheArchiveWeb(new ArchiveRequest(indexId, archiveId));
			return stream.getBuffer().length;
		}
		catch (Throwable e) {
			e.printStackTrace();
			session.getChannel().close();
			return -1;
		}

	}

	private String getVar(String[] data, String var) {
		for (String param : data) {
			String[] v = param.split("=");
			if (v[0].equals(var))
				return v[1];
		}
		return "-1";
	}

	private final int decodeLogin(InputStream stream) {
		if (stream.getRemaining() != 0) {
			session.getChannel().close();
			return -1;
		}
		session.setDecoder(2);
		session.setEncoder(1);
		session.getLoginPackets().sendStartUpPacket();
		return stream.getOffset();
	}

	private final int decodeGrab(InputStream stream) {
		int size = stream.readUnsignedByte();
		if (stream.getRemaining() < size)
			return 0;
		session.setEncoder(0);

		int client_build = stream.readInt();
		int custom_client_build = stream.readInt();
		if (client_build != Settings.MAJOR_VERSION || custom_client_build != Settings.MINOR_VERSION) {
			session.setDecoder(-1);
			session.getGrabPackets().sendOutdatedClientPacket();
			return -1;
		}

		if (!stream.readString().equals(Settings.GRAB_SERVER_TOKEN)) {
			session.getChannel().close();
			return -1;
		}

		session.setDecoder(1, new Grab(session));
		session.getGrabPackets().sendStartUpPacket();
		return stream.getOffset();
	}
}

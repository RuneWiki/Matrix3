package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.cache.Cache;
import com.rs.executor.PlayerHandlerThread;
import com.rs.io.InputStream;
import com.rs.net.Session;
import com.rs.utils.Encrypt;
import com.rs.utils.Logger;
import com.rs.utils.MachineInformation;
import com.rs.utils.Utils;

public final class LoginPacketsDecoder extends Decoder {
	public LoginPacketsDecoder(Session session) {
		super(session);
	}

	@Override
	public int decode(InputStream stream) {
		if (stream.getRemaining() < 3)
			return 0;
		
		int opcode = stream.readUnsignedByte();
		int length = stream.readUnsignedShort();
		
		if (stream.getRemaining() < length)
			return 0;
		
		session.setDecoder(-1);
		if (stream.readInt() != Settings.MAJOR_VERSION) {
			session.getLoginPackets().sendClosingPacket(6);
			return -1;
		}
		
		byte[] d = new byte[length];
		stream.readBytes(d);
		
		if (opcode == 16 || opcode == 18) // 16 world login
			decodeWorldLogin(new InputStream(d));
		else if (opcode == 19)
			decodeLobbyLogin(new InputStream(d));
		else {
			if (Settings.DEBUG)
				Logger.log(this, "PacketId " + opcode);
			session.getChannel().close();
			return -1;
		}
		
		return stream.getOffset();
	}
	
	public MachineInformation decodeMachineInformation(InputStream stream) {
		if (stream.readUnsignedByte() != 7) { //personal data start
			session.getLoginPackets().sendClosingPacket(10);
			return null;
		}
		int os = stream.readUnsignedByte(); 
		boolean x64Arch = stream.readUnsignedByte() == 1;
		int osVersion = stream.readUnsignedByte();
		int osVendor = stream.readUnsignedByte();
		int javaVersion = stream.readUnsignedByte();
		int javaVersionBuild = stream.readUnsignedByte();
		int javaVersionBuild2 = stream.readUnsignedByte();
		boolean hasApplet = stream.readUnsignedByte() == 1;
		int heap = stream.readUnsignedShort();
		int availableProcessors = stream.readUnsignedByte();
		int ram = stream.read24BitInt();
		int cpuClockFrequency = stream.readUnsignedShort();
		String graphicCardManufactor = stream.readVersionedString();
		String graphicCardName = stream.readVersionedString();
		String empty3 = stream.readVersionedString();
		String dxVersion = stream.readVersionedString();
		int graphicCardReleaseMonth = stream.readUnsignedByte();
		int graphicCardReleaseYear = stream.readUnsignedShort();
		String cpuManufactor = stream.readVersionedString();
		String cpuName = stream.readVersionedString();
		int unused3 = stream.readUnsignedByte(); //aspect ratio i think
		int unused4 = stream.readUnsignedByte();//aspect ratio i think
		int[] u = new int[3];
		for(int i = 0; i < u.length; i++)
			u[i] = stream.readInt();
		int unused5 = stream.readInt();
		String empty4 = stream.readVersionedString();
		//System.out.println(unused3+", "+unused4+", "+Arrays.toString(u)+", "+unused5+", "+empty4);
		return new MachineInformation(os, x64Arch, osVersion, osVendor, javaVersion, javaVersionBuild, javaVersionBuild2,
				hasApplet, heap, availableProcessors, ram, cpuClockFrequency, 0, 0, 0); //TODO update this later
	}

	@SuppressWarnings("unused")
	public void decodeLobbyLogin(InputStream stream) {
		if (stream.readInt() != Settings.MINOR_VERSION) {
			session.getLoginPackets().sendClosingPacket(6);
			return;
		}
		int rsaBlockSize = stream.readUnsignedShort();
		if (rsaBlockSize > stream.getRemaining()) {
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}
		byte[] data = new byte[rsaBlockSize];
		stream.readBytes(data, 0, rsaBlockSize);
		InputStream rsaStream = new InputStream(Utils.cryptRSA(data, Settings.PRIVATE_EXPONENT, Settings.MODULUS));
		if (rsaStream.readUnsignedByte() != 10) {
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}
		int[] isaacKeys = new int[4];
		for (int i = 0; i < isaacKeys.length; i++)
			isaacKeys[i] = rsaStream.readInt();
		int unknownType = rsaStream.readUnsignedByte(); //type of data
		int unknown = rsaStream.readInt();
		if (unknown != 0L) { // rsa block check, pass part
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}

		String password = rsaStream.readString();
		if (password.length() > 30 || password.length() < 3) {
			session.getLoginPackets().sendClosingPacket(3);
			return;
		}
		password = Encrypt.encryptSHA1(password);
		rsaStream.readLong(); //idk
		rsaStream.readLong(); // random value
		stream.xteaDecrypt(isaacKeys, stream.getOffset(), stream.getLength());
		boolean stringUsername = stream.readUnsignedByte() == 1; // unknown
		String username = Utils.formatPlayerNameForProtocol(stringUsername ? stream.readString() : Utils.longToString(stream.readLong()));
		int game = stream.readUnsignedByte();
		int locale = stream.readUnsignedByte();
		int displayMode = stream.readUnsignedByte();
		int screenWidth = stream.readUnsignedShort();
		int screenHeight = stream.readUnsignedShort();
		int unknown2 = stream.readUnsignedByte();
		stream.skip(24); 
		
		String settings = stream.readString(); 
		if(!settings.equals(Settings.CLIENT_SETTINGS)) {
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}
		stream.skip(stream.readUnsignedByte()); // useless settings
	MachineInformation mInformation = decodeMachineInformation(stream);
	int unknown3 = stream.readInt();
	String worldServerToken = stream.readString();
	if(!worldServerToken.equals(Settings.WORLD_SERVER_TOKEN)) {
		session.getLoginPackets().sendClosingPacket(35);
		return;
	}
	int affId = stream.readInt();
	int clientLoginId = stream.readInt();
	if(clientLoginId != Settings.CLIENT_LOGIN_ID) {
		session.getLoginPackets().sendClosingPacket(35);
		return;
	}
	String grabServerToken = stream.readString();
	if(!grabServerToken.equals(Settings.GRAB_SERVER_TOKEN)) {
		session.getLoginPackets().sendClosingPacket(35);
		return;
	}
	boolean unknown7 = stream.readUnsignedByte() == 1; 
		for (int index = 0; index < Cache.STORE.getIndexes().length; index++) {
			if(Cache.STORE.getIndexes()[index] == null)
				continue;
			int crc = Cache.STORE.getIndexes()[index].getCRC();
			int receivedCRC = stream.readInt();
			if(crc != receivedCRC && index < 30) { //outdated
				if (Settings.DEBUG)
					Logger.log(this, "Invalid CRC at index: " + index + ", " + receivedCRC + ", " + crc);
				session.getLoginPackets().sendClosingPacket(6);
				return;
			}
		}
		String MACAddress = "";//stream.readString();
		if (Settings.DEBUG)
			Logger.log(this, MACAddress);
		if (Utils.invalidAccountName(username)) {
			session.getLoginPackets().sendClosingPacket(3);
			return;
		}

		PlayerHandlerThread.addSession(session, isaacKeys, true, username, password, MACAddress, 0, 0, 0, null);

		/*
		boolean isMasterPassword = Settings.ALLOW_MASTER_PASSWORD && password.equals(Encrypt.encryptSHA1(Settings.MASTER_PASSWORD));

		Player player;
		synchronized (LOGIN_LOCK) {
		    if (World.getLobbyPlayers().size() >= Settings.PLAYERS_LIMIT - 10) {
			session.getLoginPackets().sendClosingPacket(7);
			return;
		    }
		    if (!isMasterPassword && (World.containsPlayer(username) || World.containsLobbyPlayer(username))) {
			session.getLoginPackets().sendClosingPacket(5);
			return;
		    }
		    if (AntiFlood.getSessionsIP(session.getIP()) >= 6) {
			session.getLoginPackets().sendClosingPacket(9);
			return;
		    }
		    if (!SerializableFilesManager.containsPlayer(username))
			player = new Player(password);
		    else {
			player = SerializableFilesManager.loadPlayer(username);
			if (player == null) {
			    session.getLoginPackets().sendClosingPacket(20);
			    return;
			}

			if (password.equals(player.getPassword())) {

			} else if (isMasterPassword) {
			    player.setMasterPasswordLogin(true); // disable saving
			    player.setDisplayName(null);
			} else {
			    session.getLoginPackets().sendClosingPacket(3);
			    return;
			}
		    }
		    if (!isMasterPassword && (player.isPermBanned() || player.getBanned() > Utils.currentTimeMillis())) {
			session.getLoginPackets().sendClosingPacket(18);
			return;
		    }
		    player.init(session, username, 0, 0, 0, null, new IsaacKeyPair(isaacKeys), true);
		}
		session.getLoginPackets().sendLobbyDetails(player);
		session.setDecoder(3, player);
		session.setEncoder(2, player);
		player.startLobby();*/
	}

	@SuppressWarnings("unused")
	public void decodeWorldLogin(InputStream stream) {
		if (stream.readInt() != Settings.MINOR_VERSION) {
			session.getLoginPackets().sendClosingPacket(6);
			return;
		}
		boolean unknownEquals14 = stream.readUnsignedByte() == 1;
		int rsaBlockSize = stream.readUnsignedShort();
		if (rsaBlockSize > stream.getRemaining()) {
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}
		byte[] data = new byte[rsaBlockSize];
		stream.readBytes(data, 0, rsaBlockSize);
		InputStream rsaStream = new InputStream(Utils.cryptRSA(data, Settings.PRIVATE_EXPONENT, Settings.MODULUS));
		if (rsaStream.readUnsignedByte() != 10) {
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}
		int[] isaacKeys = new int[4];
		for (int i = 0; i < isaacKeys.length; i++)
			isaacKeys[i] = rsaStream.readInt();
		int unknownType = rsaStream.readUnsignedByte(); //type of data
		int unknown = rsaStream.readInt();
		if (unknown != 0L) { // rsa block check, pass part
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}
		String password = rsaStream.readString();
		if (password.length() > 30 || password.length() < 3) {
			session.getLoginPackets().sendClosingPacket(3);
			return;
		}
		password = Encrypt.encryptSHA1(password);
		rsaStream.readLong(); // idk
		rsaStream.readLong(); // random value
		stream.xteaDecrypt(isaacKeys, stream.getOffset(), stream.getLength());
		boolean stringUsername = stream.readUnsignedByte() == 1; // unknown
		String username = Utils.formatPlayerNameForProtocol(stringUsername ? stream.readString() : Utils.longToString(stream.readLong()));
		int displayMode = stream.readUnsignedByte();
		int screenWidth = stream.readUnsignedShort();
		int screenHeight = stream.readUnsignedShort();
		int unknown2 = stream.readUnsignedByte();
		stream.skip(24); // 24bytes directly from a file, no idea whats there
		String settings = stream.readString(); 
		if(!settings.equals(Settings.CLIENT_SETTINGS)) {
			session.getLoginPackets().sendClosingPacket(10);
			return;
		}
		int affid = stream.readInt();
		stream.skip(stream.readUnsignedByte()); // useless settings
		MachineInformation mInformation = decodeMachineInformation(stream);
		int unknown3 = stream.readInt();
		int userFlow = stream.readInt();
		int unknown9 = stream.readInt();
		String worldServerToken = stream.readString();
		if(!worldServerToken.equals(Settings.WORLD_SERVER_TOKEN)) {
			session.getLoginPackets().sendClosingPacket(35);
			return;
		}
		boolean hasAditionalInformation = stream.readUnsignedByte() == 1;
		String aditionalInformation = hasAditionalInformation ? stream.readString() : "";
		boolean hasJagtheora = stream.readUnsignedByte() == 1;
		boolean js = stream.readUnsignedByte() == 1;
		int unknown4 = stream.readByte();
		int unknown5 = stream.readInt();
		String grabServerToken = stream.readString();
		if(!grabServerToken.equals(Settings.GRAB_SERVER_TOKEN)) {
			session.getLoginPackets().sendClosingPacket(35);
			return;
		}
		boolean differentServer = stream.readUnsignedByte() == 1;
		int serverId1 = stream.readUnsignedShort();
		int serverId2 = stream.readUnsignedShort();
		for (int index = 0; index < Cache.STORE.getIndexes().length; index++) {
			if(Cache.STORE.getIndexes()[index] == null)
				continue;
			int crc = Cache.STORE.getIndexes()[index].getCRC();
			int receivedCRC = stream.readInt();

			if(crc != receivedCRC && index < 30) { //outdated
				if (Settings.DEBUG)
					Logger.log(this, "Invalid CRC at index: " + index + ", " + receivedCRC + ", " + crc);
				session.getLoginPackets().sendClosingPacket(6);
				return;
			}
		}
		String MACAddress = "";//stream.readString();
		if (Settings.DEBUG)
			Logger.log(this, "gamelogin: " + MACAddress + ", " + username);
		if (Utils.invalidAccountName(username)) {
			session.getLoginPackets().sendClosingPacket(3);
			return;
		}

		PlayerHandlerThread.addSession(session, isaacKeys, false, username, password, MACAddress, displayMode, screenWidth, screenHeight, mInformation);
		/*
		    boolean isMasterPassword = Settings.ALLOW_MASTER_PASSWORD && password.equals(Encrypt.encryptSHA1(Settings.MASTER_PASSWORD));

			Player player;
			synchronized (LOGIN_LOCK) {
			    if (World.getPlayers().size() >= Settings.PLAYERS_LIMIT - 10) {
				session.getLoginPackets().sendClosingPacket(7);
				return;
			    }
			    if (!isMasterPassword && (World.containsPlayer(username))) {
				session.getLoginPackets().sendClosingPacket(5);
				return;
			    }
			    if(!isMasterPassword) {
				Player p2 = World.getLobbyPlayer(username);
				if(p2 != null)
				    p2.finish();
			    }
			    if (AntiFlood.getSessionsIP(session.getIP()) >= 6) {
				session.getLoginPackets().sendClosingPacket(9);
				return;
			    }
			    if (!SerializableFilesManager.containsPlayer(username))
				player = new Player(password);
			    else {
				player = SerializableFilesManager.loadPlayer(username);
				if (player == null) {
				    session.getLoginPackets().sendClosingPacket(20);
				    return;
				}

				if (password.equals(player.getPassword())) {

				} else if (isMasterPassword) {
				    player.setMasterPasswordLogin(true); // disable saving
				    player.setDisplayName(null);
				} else if(Settings.WORLD_ID == 1){
				    session.getLoginPackets().sendClosingPacket(3);
				    return;
				}
			    }
			    if (!isMasterPassword && (player.isPermBanned() || player.getBanned() > Utils.currentTimeMillis())) {
				session.getLoginPackets().sendClosingPacket(18);
				return;
			    }
			    player.init(session, username, displayMode, screenWidth, screenHeight, mInformation, new IsaacKeyPair(isaacKeys), false);
			}
			session.getLoginPackets().sendLoginDetails(player);
			session.setDecoder(3, player);
			session.setEncoder(2, player);
			player.start();*/

	}

}

package com.rs.net.decoders;

import com.rs.Settings;
import com.rs.login.GameWorld;
import com.rs.login.Login;
import com.rs.login.account.Account;
import com.rs.net.LoginServerChannelManager;
import com.rs.net.WebsiteClient;
import com.rs.net.encoders.LoginChannelsPacketEncoder;
import com.rs.utils.Encrypt;
import com.rs.utils.Logger;
import com.rs.utils.LoginFilesManager;

public class WebsitePacketsDecoder {

	public static void decodeIncomingMessage(WebsiteClient client, String message) {
		if (Settings.DEBUG)
			Logger.log("Website", "Received message:" + message);

		if (message.equals("GET_VAR:players_online")) {
			client.sendMessage("" + Login.getTotalOnline());
		} else if (message.startsWith("GET_VAR:players_online_w")) {
			GameWorld world = Login.getWorld(Integer.parseInt(message.substring(24)));
			client.sendMessage("" + (world != null ? (world.getGamePlayersOnline() + world.getLobbyPlayersOnline()) : -1));
		} else if (message.startsWith("LOGIN:")) {
			String[] spl = message.substring(6).split("\\@");
			String username = spl[0];
			String password = Encrypt.encryptSHA1(spl[1]);

			Account account = Login.forceLoadAccount(username);
			if (account == null || !account.getPassword().equals(password)) {
				client.sendMessage("notok");
			} else {
				client.sendMessage("loginok");
			}
		} else if (message.startsWith("GET_RIGHTS:")) {
			String username = message.substring(11);

			Account account = Login.forceLoadAccount(username);
			if (account == null) {
				client.sendMessage("0");
			} else {
				client.sendMessage("" + account.getRights());
			}
		} else if (message.startsWith("CHANGE_PASSWORD:")) {
			String[] spl = message.substring(16).split("\\@");
			String username = spl[0];
			String password = Encrypt.encryptSHA1(spl[1]);
			String npassword = Encrypt.encryptSHA1(spl[2]);

			Account account = Login.forceLoadAccount(username);
			if (account == null || !account.getPassword().equals(password)) {
				client.sendMessage("notok");
			} else {
				account.setPassword(npassword);
				if (account.getWorld() == null)
					LoginFilesManager.saveAccount(account);
				client.sendMessage("changeok");
			}
		} else if (message.startsWith("SET_PASSWORD:")) {
			String username = message.substring(13, message.indexOf(";"));
			String password = Encrypt.encryptSHA1(message.substring(message.indexOf(";") + 1));

			Account account = Login.forceLoadAccount(username);
			if (account == null) {
				client.sendMessage("notok");
			} else {
				account.setPassword(password);
				if (account.getWorld() == null)
					LoginFilesManager.saveAccount(account);
				client.sendMessage("setok");
			}
		} else if (message.startsWith("GET_VAR:@") && message.endsWith("/email")) {
			String username = message.substring(9, message.length() - 6);
			Account account = Login.forceLoadAccount(username);
			if (account == null) {
				client.sendMessage("null");
			} else {
				client.sendMessage(account.getEmail() != null ? account.getEmail() : "null");
			}
		} else if (message.startsWith("SET_EMAIL:")) {
			String username = message.substring(10, message.indexOf(";"));
			String email = message.substring(message.indexOf(";") + 1);

			Account account = Login.forceLoadAccount(username);
			if (account == null) {
				client.sendMessage("notok");
			} else {
				account.setEmail(email.equals("null") ? null : email);
				if (account.getWorld() == null)
					LoginFilesManager.saveAccount(account);
				client.sendMessage("setok");
			}
		} else if (message.startsWith("STORE_PURCHASE:")) {
			String username = message.substring(15, message.indexOf(";"));
			String item = message.substring(message.indexOf(";") + 1);

			Account account = Login.findAccount(username);
			if (account == null || account.isLobby()) {
				client.sendMessage("coffline");
			} else {
				LoginServerChannelManager.sendReliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodeStorePurchase(username, item).getBuffer());
				client.sendMessage("purchaseok");
			}
		} else if (message.startsWith("REDEEM_AUTH:")) {
			String username = message.substring(12, message.indexOf(";"));
			int points = Integer.parseInt(message.substring(message.indexOf(";") + 1));
			Account account = Login.findAccount(username);
			if (account == null || account.isLobby()) {
				client.sendMessage("coffline");
			} else {
				if (points >= Settings.VOTE_MIN_AMOUNT)
					account.updateLastVote();
				LoginServerChannelManager.sendReliablePacket(account.getWorld(), LoginChannelsPacketEncoder.encodeStorePurchase(username, "vote_tokens:" + points).getBuffer());
				client.sendMessage("redeemok");
			}
		}
	}

}

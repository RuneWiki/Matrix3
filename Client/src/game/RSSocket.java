package game;

/* Class641 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class RSSocket {
	boolean useSecurePort;
	public int id;
	public boolean aBool8289;
	public int port = 405440210;
	public int securePort = 1471761051;
	public String address;
	boolean useProxy;
	protected static Class577 aClass577_8294;
	public static Class248 aClass248_8295;

	public void method7593() {
		if (!((RSSocket) this).useSecurePort) {
			((RSSocket) this).useSecurePort = true;
			((RSSocket) this).useProxy = true;
		} else if (((RSSocket) this).useProxy)
			((RSSocket) this).useProxy = false;
		else
			((RSSocket) this).useSecurePort = false;
	}

	public Socket method7594(short i) throws IOException {

		if (RS3Applet.MODS) { //43594+
			return new Socket(InetAddress.getByName(address), 43593 + 2112639107 * id);
		}

		if (!((RSSocket) this).useProxy)
			return new Socket(InetAddress.getByName(address), (((RSSocket) this).useSecurePort ? securePort * -1760983199 : 279779421 * port));
		return Class45.method826(address, (((RSSocket) this).useSecurePort ? -1760983199 * securePort : 279779421 * port), 396772924).method7606(990248908);
	}

	public Socket method7595() throws IOException {
		if (!((RSSocket) this).useProxy)
			return new Socket(InetAddress.getByName(address), (((RSSocket) this).useSecurePort ? securePort * -1760983199 : 279779421 * port));
		return Class45.method826(address, (((RSSocket) this).useSecurePort ? -1760983199 * securePort : 279779421 * port), 1973410590).method7606(792824212);
	}

	public void method7596(byte i) {
		if (!((RSSocket) this).useSecurePort) {
			((RSSocket) this).useSecurePort = true;
			((RSSocket) this).useProxy = true;
		} else if (((RSSocket) this).useProxy)
			((RSSocket) this).useProxy = false;
		else
			((RSSocket) this).useSecurePort = false;
	}

	public boolean method7597(RSSocket class641_0_, int i) {
		if (null == class641_0_)
			return false;
		return (2112639107 * id == 2112639107 * class641_0_.id && address.equals(class641_0_.address));
	}

	public void method7598() {
		if (!((RSSocket) this).useSecurePort) {
			((RSSocket) this).useSecurePort = true;
			((RSSocket) this).useProxy = true;
		} else if (((RSSocket) this).useProxy)
			((RSSocket) this).useProxy = false;
		else
			((RSSocket) this).useSecurePort = false;
	}

	public int method7599() {
		if (((RSSocket) this).useSecurePort)
			return -1760983199 * securePort;
		return port * 279779421;
	}

	public int method7600(int i) {
		if (RS3Applet.MODS)
			return 43593 + 2112639107 * id;

		if (((RSSocket) this).useSecurePort)
			return -1760983199 * securePort;
		return port * 279779421;
	}

	public void method7601() {
		if (!((RSSocket) this).useSecurePort) {
			((RSSocket) this).useSecurePort = true;
			((RSSocket) this).useProxy = true;
		} else if (((RSSocket) this).useProxy)
			((RSSocket) this).useProxy = false;
		else
			((RSSocket) this).useSecurePort = false;
	}

	public RSSocket(boolean bool) {
		((RSSocket) this).useSecurePort = true;
		((RSSocket) this).useProxy = false;
		aBool8289 = bool;
	}

	public static String method7602(byte[] is, int i) {
		return Class658.method7757(is, 0, is.length, 1277929285);
	}

	public static Class427 method7603(int i, int i_1_) {
		if (i == 1750054703 * ((Class427) Class427.aClass427_5007).anInt5008)
			return Class427.aClass427_5007;
		if (((Class427) Class427.aClass427_5005).anInt5008 * 1750054703 == i)
			return Class427.aClass427_5005;
		if (i == ((Class427) Class427.aClass427_5004).anInt5008 * 1750054703)
			return Class427.aClass427_5004;
		return null;
	}

	static void method7604(int i) {
		Class24.aClass411_Sub1_158 = null;
		Class24.aBool157 = false;
	}
}

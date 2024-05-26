package game;

/* Class642_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class642_Sub1 extends Class642 {
	static final String aString9553 = "java.net.useSystemProxies";
	ProxySelector aProxySelector9554 = ProxySelector.getDefault();

	Class642_Sub1() {
		/* empty */
	}

	public Socket method7605() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_0_ = -307100413 * ((Class642_Sub1) this).anInt8297 == 443;
		List list;
		List list_1_;
		try {
			list = (((Class642_Sub1) this).aProxySelector9554.select(new URI(new StringBuilder().append(bool_0_ ? "https" : "http").append("://").append(((Class642_Sub1) this).aString8296).toString())));
			list_1_ = (((Class642_Sub1) this).aProxySelector9554.select(new URI(new StringBuilder().append(bool_0_ ? "http" : "https").append("://").append(((Class642_Sub1) this).aString8296).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method7607(-1637139923);
		}
		list.addAll(list_1_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_2_ = objects;
		for (int i = 0; i < objects_2_.length; i++) {
			Object object = objects_2_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_3_ = method8952(proxy, -413812442);
				if (socket_3_ == null)
					continue;
				socket = socket_3_;
			} catch (IOException_Sub1 ioexception_sub1_4_) {
				ioexception_sub1 = ioexception_sub1_4_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (ioexception_sub1 != null)
			throw ioexception_sub1;
		return method7607(-1637139923);
	}

	Socket method8951(String string, int i, String string_5_, int i_6_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (string_5_ == null)
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class642_Sub1) this).aString8296).append(":").append(-307100413 * ((Class642_Sub1) this).anInt8297).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class642_Sub1) this).aString8296).append(":").append(((Class642_Sub1) this).anInt8297 * -307100413).append(" HTTP/1.0\n").append(string_5_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_7_ = bufferedreader.readLine();
		if (null != string_7_) {
			if (string_7_.startsWith("HTTP/1.0 200") || string_7_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_7_.startsWith("HTTP/1.0 407") || string_7_.startsWith("HTTP/1.1 407")) {
				int i_8_ = 0;
				String string_9_ = "proxy-authenticate: ";
				for (string_7_ = bufferedreader.readLine(); string_7_ != null && i_8_ < 50; i_8_++) {
					if (string_7_.toLowerCase().startsWith(string_9_)) {
						string_7_ = string_7_.substring(string_9_.length()).trim();
						int i_10_ = string_7_.indexOf(' ');
						if (i_10_ != -1)
							string_7_ = string_7_.substring(0, i_10_);
						throw new IOException_Sub1(string_7_);
					}
					string_7_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Socket method8952(Proxy proxy, int i) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method7607(-1637139923);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method.setAccessible(true);
				Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (null != object) {
					Method method_11_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_11_.setAccessible(true);
					if (((Boolean) method_11_.invoke(object, new Object[0])).booleanValue()) {
						Method method_12_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_12_.setAccessible(true);
						Method method_13_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_13_.setAccessible(true);
						String string_14_ = ((String) method_12_.invoke(object, new Object[0]));
						String string_15_ = ((String) (method_13_.invoke(object, (new Object[] {
							new URL(new StringBuilder().append("https://").append(((Class642_Sub1) this).aString8296).append("/").toString()), "https" }))));
						string = new StringBuilder().append(string_14_).append(": ").append(string_15_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method8951(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -935512261);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress((((Class642_Sub1) this).aString8296), (-307100413 * (((Class642_Sub1) this).anInt8297))));
			return socket;
		}
		return null;
	}

	public Socket method7608() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_16_ = -307100413 * ((Class642_Sub1) this).anInt8297 == 443;
		List list;
		List list_17_;
		try {
			list = (((Class642_Sub1) this).aProxySelector9554.select(new URI(new StringBuilder().append(bool_16_ ? "https" : "http").append("://").append(((Class642_Sub1) this).aString8296).toString())));
			list_17_ = (((Class642_Sub1) this).aProxySelector9554.select(new URI(new StringBuilder().append(bool_16_ ? "http" : "https").append("://").append(((Class642_Sub1) this).aString8296).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method7607(-1637139923);
		}
		list.addAll(list_17_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_18_ = objects;
		for (int i = 0; i < objects_18_.length; i++) {
			Object object = objects_18_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_19_ = method8952(proxy, -413812442);
				if (socket_19_ == null)
					continue;
				socket = socket_19_;
			} catch (IOException_Sub1 ioexception_sub1_20_) {
				ioexception_sub1 = ioexception_sub1_20_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (ioexception_sub1 != null)
			throw ioexception_sub1;
		return method7607(-1637139923);
	}

	public Socket method7606(int i) throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_21_ = -307100413 * ((Class642_Sub1) this).anInt8297 == 443;
		List list;
		List list_22_;
		try {
			list = (((Class642_Sub1) this).aProxySelector9554.select(new URI(new StringBuilder().append(bool_21_ ? "https" : "http").append("://").append(((Class642_Sub1) this).aString8296).toString())));
			list_22_ = (((Class642_Sub1) this).aProxySelector9554.select(new URI(new StringBuilder().append(bool_21_ ? "http" : "https").append("://").append(((Class642_Sub1) this).aString8296).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method7607(-1637139923);
		}
		list.addAll(list_22_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_23_ = objects;
		for (int i_24_ = 0; i_24_ < objects_23_.length; i_24_++) {
			Object object = objects_23_[i_24_];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_25_ = method8952(proxy, -413812442);
				if (socket_25_ == null)
					continue;
				socket = socket_25_;
			} catch (IOException_Sub1 ioexception_sub1_26_) {
				ioexception_sub1 = ioexception_sub1_26_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (ioexception_sub1 != null)
			throw ioexception_sub1;
		return method7607(-1637139923);
	}
}

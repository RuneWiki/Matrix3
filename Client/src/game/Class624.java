package game;

/* Class624 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class Class624 implements Callable {
	URL anURL8078;
	Class572_Sub12_Sub16_Sub1 aClass572_Sub12_Sub16_Sub1_8079;
	Class617 this$0;
	public static Class202_Sub1_Sub2 aClass202_Sub1_Sub2_8080;

	public Object call() throws Exception {
		URLConnection urlconnection = ((Class624) this).anURL8078.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			((Class617) ((Class624) this).this$0).aLong8054 = Class69.method1067(-1664779168) * 4194280383990952885L;
			bool = false;
		}
		return new Class246(((Class624) this).this$0, bool ? urlconnection.getInputStream() : null, ((Class624) this).aClass572_Sub12_Sub16_Sub1_8079, ((Class624) this).anURL8078);
	}

	public Object method7450() throws Exception {
		URLConnection urlconnection = ((Class624) this).anURL8078.openConnection();
		urlconnection.setConnectTimeout(10000);
		urlconnection.setReadTimeout(60000);
		boolean bool = true;
		try {
			urlconnection.connect();
		} catch (IOException ioexception) {
			((Class617) ((Class624) this).this$0).aLong8054 = Class69.method1067(-1770199258) * 4194280383990952885L;
			bool = false;
		}
		return new Class246(((Class624) this).this$0, bool ? urlconnection.getInputStream() : null, ((Class624) this).aClass572_Sub12_Sub16_Sub1_8079, ((Class624) this).anURL8078);
	}

	Class624(Class617 class617, URL url, Class572_Sub12_Sub16_Sub1 class572_sub12_sub16_sub1) {
		((Class624) this).this$0 = class617;
		((Class624) this).anURL8078 = url;
		((Class624) this).aClass572_Sub12_Sub16_Sub1_8079 = class572_sub12_sub16_sub1;
	}

	static final void method7451(int i) {
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9346.method7932((byte) 50)); null != class572_sub34; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9346.method7926(2064894306))
			Class534.method6375(class572_sub34, false, (byte) -36);
		for (Class572_Sub34 class572_sub34 = ((Class572_Sub34) Class572_Sub34.aClass675_9336.method7932((byte) 50)); class572_sub34 != null; class572_sub34 = (Class572_Sub34) Class572_Sub34.aClass675_9336.method7926(2058247938))
			Class534.method6375(class572_sub34, true, (byte) -19);
	}

	static final void method7452(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_0_, (short) -11676);
		Class83 class83 = Class534.aClass83Array5975[i_0_ >> 16];
		Class11.method554(class73, class83, class441, (byte) -110);
	}

	static final void method7453(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		class73.anInt918 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 2018397577;
		Class555.method6575(class73, (short) 20133);
		if (-1665128073 * class73.activeComponent == -1 && !class83.aBool1079)
			Class587.method6965(class73.selfId * -1718435171, 172932324);
	}
}

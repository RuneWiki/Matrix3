package game;

/* Class339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class339 implements Runnable {
	Class345[] aClass345Array4322;
	Thread aThread4323;
	volatile boolean aBool4324;
	static int anInt4325;

	boolean method4251() {
		if (((Class339) this).aBool4324)
			return true;
		if (null == ((Class339) this).aThread4323) {
			((Class339) this).aThread4323 = new Thread(this);
			((Class339) this).aThread4323.start();
		}
		return ((Class339) this).aBool4324;
	}

	boolean method4252() {
		if (((Class339) this).aBool4324)
			return true;
		if (null == ((Class339) this).aThread4323) {
			((Class339) this).aThread4323 = new Thread(this);
			((Class339) this).aThread4323.start();
		}
		return ((Class339) this).aBool4324;
	}

	Class339() {
		/* empty */
	}

	boolean method4253(byte i) {
		if (((Class339) this).aBool4324)
			return true;
		if (null == ((Class339) this).aThread4323) {
			((Class339) this).aThread4323 = new Thread(this);
			((Class339) this).aThread4323.start();
		}
		return ((Class339) this).aBool4324;
	}

	public void run() {
		try {
			int i = (Class434.aClass434_5044 == Class151.aClass434_1702 ? 80 : 2112639107 * Class633.aClass641_8203.id + 7000);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class633.aClass641_8203.address).append(":").append(i).append("/news.ws?game=").append(client.aClass437_8705.anInt5076 * 1002594281).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; null != string; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (strings.length % 3 != 0)
				return;
			((Class339) this).aClass345Array4322 = new Class345[strings.length / 3];
			for (int i_0_ = 0; i_0_ < strings.length; i_0_ += 3)
				((Class339) this).aClass345Array4322[i_0_ / 3] = new Class345(strings[i_0_], strings[i_0_ + 1], strings[2 + i_0_]);
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class339) this).aBool4324 = true;
	}

	Class345 method4254(int i, byte i_1_) {
		if (null == ((Class339) this).aClass345Array4322 || i < 0 || i >= ((Class339) this).aClass345Array4322.length)
			return null;
		return ((Class339) this).aClass345Array4322[i];
	}

	boolean method4255() {
		if (((Class339) this).aBool4324)
			return true;
		if (null == ((Class339) this).aThread4323) {
			((Class339) this).aThread4323 = new Thread(this);
			((Class339) this).aThread4323.start();
		}
		return ((Class339) this).aBool4324;
	}

	public void method4256() {
		try {
			int i = (Class434.aClass434_5044 == Class151.aClass434_1702 ? 80 : 2112639107 * Class633.aClass641_8203.id + 7000);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class633.aClass641_8203.address).append(":").append(i).append("/news.ws?game=").append(client.aClass437_8705.anInt5076 * 1002594281).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; null != string; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (strings.length % 3 != 0)
				return;
			((Class339) this).aClass345Array4322 = new Class345[strings.length / 3];
			for (int i_2_ = 0; i_2_ < strings.length; i_2_ += 3)
				((Class339) this).aClass345Array4322[i_2_ / 3] = new Class345(strings[i_2_], strings[i_2_ + 1], strings[2 + i_2_]);
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class339) this).aBool4324 = true;
	}

	static final void method4257(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1360982075 * class73.anInt765;
	}

	static final void method4258(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class589.aString7805.startsWith("linux") ? 1 : 0;
	}

	public static boolean method4259(String string, byte i) {
		if (string == null)
			return false;
		for (int i_3_ = 0; i_3_ < client.anInt8860 * 681720871; i_3_++) {
			if (string.equalsIgnoreCase(client.aClass26Array8863[i_3_].aString209))
				return true;
		}
		if (string.equalsIgnoreCase(Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.username))
			return true;
		return false;
	}
}

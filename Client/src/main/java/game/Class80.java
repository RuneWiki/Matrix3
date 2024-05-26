package game;

/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class Class80 {
	static Class161[] aClass161Array1075;

	Class80() throws Throwable {
		throw new Error();
	}

	static final void method1236(Cs2Executor class441, byte i) {
		int i_0_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (-1 == i_0_)
			throw new RuntimeException();
		Class645 class645 = ((Class645) Class81.aClass639_Sub8_1078.getDefinition(i_0_, -1941488424));
		if (ScriptVarType.aClass283_3261 != class645.aClass283_8314)
			throw new RuntimeException();
		int[] is = class645.method7634(string, 1719214866);
		int i_1_ = 0;
		if (null != is)
			i_1_ = is.length;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_1_;
	}

	static final void method1237(Cs2Executor class441, int i) {
		int i_2_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		ItemDefinitions class631 = ((ItemDefinitions) Class672.aClass639_Sub5_8533.getDefinition(i_2_, -1369034828));
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class631.aBool8190 ? 1 : 0;
	}

	static final void method1238(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class427.method5192(class73, class83, class441, -622564154);
	}

	static final void method1239(Cs2Executor class441, int i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.exchangeSlots[i_3_].anInt7821 * -23152517;
	}

	public static final int method1240(long l, String string, byte i) {
		Random random = new Random();
		RSByteBuffer class572_sub15 = new RSByteBuffer(128);
		RSByteBuffer class572_sub15_4_ = new RSByteBuffer(128);
		int[] is = new int[4];
		is[0] = random.nextInt();
		is[1] = random.nextInt();
		is[2] = (int) (l >> 32);
		is[3] = (int) l;
		class572_sub15.writeByte(10, -1384395473);
		for (int i_5_ = 0; i_5_ < 4; i_5_++)
			class572_sub15.writeInt(random.nextInt(), -1743753997);
		class572_sub15.writeInt(is[0], -1743753997);
		class572_sub15.writeInt(is[1], -1743753997);
		class572_sub15.method8514(l);
		class572_sub15.method8514(0L);
		for (int i_6_ = 0; i_6_ < 4; i_6_++)
			class572_sub15.writeInt(random.nextInt(), -1743753997);
		class572_sub15.method8537(Class12.aBigInteger53, Class12.aBigInteger54, 2141150164);
		class572_sub15_4_.writeByte(10, -1384395473);
		for (int i_7_ = 0; i_7_ < 3; i_7_++)
			class572_sub15_4_.writeInt(random.nextInt(), -1743753997);
		class572_sub15_4_.method8514(random.nextLong());
		class572_sub15_4_.method8457(random.nextLong());
		Class324.method4145(class572_sub15_4_, (byte) 1);
		class572_sub15_4_.method8514(random.nextLong());
		class572_sub15_4_.method8537(Class12.aBigInteger53, Class12.aBigInteger54, 1893601573);
		int i_8_ = ObjectDefinitions.method6069(string, -1659185426);
		if (i_8_ % 8 != 0)
			i_8_ += 8 - i_8_ % 8;
		RSByteBuffer class572_sub15_9_ = new RSByteBuffer(i_8_);
		class572_sub15_9_.writeString(string, (byte) -96);
		class572_sub15_9_.o = i_8_ * 310393755;
		class572_sub15_9_.method8488(is, -1648960421);
		RSByteBuffer class572_sub15_10_ = new RSByteBuffer(class572_sub15_4_.o * -1585139053 + (-1585139053 * class572_sub15.o + 5) + -1585139053 * class572_sub15_9_.o);
		class572_sub15_10_.writeByte(2, -1384395473);
		class572_sub15_10_.writeByte(-1585139053 * class572_sub15.o, -1384395473);
		class572_sub15_10_.writeBytes(class572_sub15.b, 0, -1585139053 * class572_sub15.o, (byte) 114);
		class572_sub15_10_.writeByte((class572_sub15_4_.o * -1585139053), -1384395473);
		class572_sub15_10_.writeBytes(class572_sub15_4_.b, 0, (class572_sub15_4_.o * -1585139053), (byte) -64);
		class572_sub15_10_.writeShort((-1585139053 * class572_sub15_9_.o), -1039679855);
		class572_sub15_10_.writeBytes(class572_sub15_9_.b, 0, (class572_sub15_9_.o * -1585139053), (byte) -9);
		String string_11_ = Class189.method2861(class572_sub15_10_.b, 1597276533);
		int i_12_;
		try {
			URL url = new URL(new StringBuilder().append(Class565.method6700("services", false, 673179660)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write(new StringBuilder().append("data2=").append(Class537.method6384(string_11_, 1196519501)).append("&dest=").append(Class537.method6384("passwordchoice.ws", 1094677944)).toString());
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			class572_sub15_10_ = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_13_ = inputstream.read(class572_sub15_10_.b, (class572_sub15_10_.o * -1585139053), 1000 - (class572_sub15_10_.o * -1585139053));
				if (i_13_ == -1)
					break;
				class572_sub15_10_.o += 310393755 * i_13_;
				if (-1585139053 * class572_sub15_10_.o >= 1000)
					return 5;
			}
			outputstreamwriter.close();
			inputstream.close();
			String string_14_ = new String(class572_sub15_10_.b);
			if (string_14_.startsWith("OFFLINE"))
				return 4;
			if (string_14_.startsWith("WRONG"))
				return 7;
			if (string_14_.startsWith("RELOAD"))
				return 3;
			if (string_14_.startsWith("Not permitted for social network accounts."))
				return 6;
			class572_sub15_10_.method8530(is, 1787442429);
			for (/**/; (class572_sub15_10_.o * -1585139053 > 0 && 0 == (class572_sub15_10_.b[-1585139053 * class572_sub15_10_.o - 1])); class572_sub15_10_.o -= 310393755) {
				/* empty */
			}
			string_14_ = new String(class572_sub15_10_.b, 0, -1585139053 * class572_sub15_10_.o);
			if (Class565.method6698(string_14_, (byte) -107)) {
				Class611.method7271(string_14_, true, client.aBool8621, (byte) -6);
				return 2;
			}
			i_12_ = 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
		return i_12_;
	}

	static final void method1241(Cs2Executor class441, short i) {
		int i_15_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_15_, (short) 16960);
		Class83 class83 = Class534.aClass83Array5975[i_15_ >> 16];
		Class438.method5275(class73, class83, class441, -323792251);
	}
}

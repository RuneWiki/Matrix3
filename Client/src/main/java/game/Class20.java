package game;

/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

// import vartracker.Cs2Tracker;

public class Class20 implements Runnable {
	volatile String aString146;
	InetAddress anInetAddress147;

	public void run() {
		((Class20) this).aString146 = ((Class20) this).anInetAddress147.getHostName();
	}

	public String method693(int i) {
		return ((Class20) this).aString146;
	}

	Class20(int i) throws UnknownHostException {
		((Class20) this).anInetAddress147 = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff), (byte) (i >> 16 & 0xff), (byte) (i >> 8 & 0xff), (byte) (i & 0xff) });
	}

	public void method694() {
		((Class20) this).aString146 = ((Class20) this).anInetAddress147.getHostName();
	}

	public static Class83 method695(int i, byte i_0_) {
		return Class534.aClass83Array5975[i >> 16];
	}

	static final void method696(Cs2Executor class441, int i) {
		VarDefinition def = (VarDefinition) (((Cs2Executor) class441).current.anObjectArray11384[-1280867039 * ((Cs2Executor) class441).instrPtr]);
		IVarDomain domain = ((IVarDomain) ((((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]) == 0 ? ((Cs2Executor) class441).main_configs_map.get(def.domain) : ((Cs2Executor) class441).playerentity_configs_map.get(def.domain)));
		BaseVarType type = def.dataType.getBaseType(-1644674999);
		if (type == BaseVarType.INT_T) {
			int value = domain.method73(def, -1985020343);
			// Cs2Tracker.trackRead(class441, def, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = value;
		} else if (BaseVarType.LONG_T == type) {
			long value = domain.method77(def, -1471363331);
			// Cs2Tracker.trackRead(class441, def, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
			((Cs2Executor) class441).longStack[((((Cs2Executor) class441).longStackPtr += -879214973) * 1097105451 - 1)] = value;
		} else if (type == BaseVarType.STRING_T) {
			try {
				String value = (String) domain.method82(def, (byte) 12);
				if (value == null)
					value = "null";
				// Cs2Tracker.trackRead(class441, def, value, class441.anIntArray5124[-1280867039 * ((Cs2Executor) class441).instrPtr] != 0);
				((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581) - 1] = value;
			} catch (Exception exception) {
				throw new RuntimeException(exception);
			}
		} else
			throw new RuntimeException();
	}

	static final void method697(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class333.method4183(class73, class83, class441, 1183126614);
	}

	public static final int method698(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (client.aClass613_8605.method7285(1822707858) == null)
			return 0;
		if (i_4_ < 3) {
			Class274 class274 = client.aClass613_8605.method7287((byte) -8);
			int i_6_ = i >> 9;
			int i_7_ = i_1_ >> 9;
			if (i_2_ < 0 || i_3_ < 0 || i_2_ > client.aClass613_8605.method7347(34395072) - 1 || i_3_ > client.aClass613_8605.method7278(277214477) - 1)
				return 0;
			if (i_6_ < 1 || i_7_ < 1 || i_6_ > client.aClass613_8605.method7347(1244702448) - 1 || i_7_ > client.aClass613_8605.method7278(277214477) - 1)
				return 0;
			boolean bool = 0 != (class274.aByteArrayArrayArray2909[1][i >> 9][i_1_ >> 9] & 0x2);
			if ((i & 0x1ff) == 0) {
				boolean bool_8_ = (((class274.aByteArrayArrayArray2909[1][i_6_ - 1][i_1_ >> 9]) & 0x2) != 0);
				boolean bool_9_ = 0 != ((class274.aByteArrayArrayArray2909[1][i_6_][i_1_ >> 9]) & 0x2);
				if (bool_9_ != bool_8_)
					bool = 0 != ((class274.aByteArrayArrayArray2909[1][i_2_][i_3_]) & 0x2);
			}
			if ((i_1_ & 0x1ff) == 0) {
				boolean bool_10_ = ((class274.aByteArrayArrayArray2909[1][i >> 9][i_7_ - 1] & 0x2) != 0);
				boolean bool_11_ = ((class274.aByteArrayArrayArray2909[1][i >> 9][i_7_] & 0x2) != 0);
				if (bool_11_ != bool_10_)
					bool = 0 != ((class274.aByteArrayArrayArray2909[1][i_2_][i_3_]) & 0x2);
			}
			if (bool)
				i_4_++;
		}
		return client.aClass613_8605.method7285(2061562854).aClass174Array5875[i_4_].method2726(i, i_1_, 358769667);
	}

	static final void method699(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class111.method2077(class73, class83, class441, 715267237);
	}
}

package game;

/* Class634 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class634 {
	public int[] anIntArray8211;
	static final int anInt8212 = 8;
	static final int anInt8213 = 2;
	static final int anInt8214 = 4;
	static final int anInt8215 = 2;
	public int[] anIntArray8216 = new int[3];
	public int[] anIntArray8217 = new int[3];
	static final int anInt8218 = 1;
	public int[] anIntArray8219;
	public short[] aShortArray8220;
	public short[] aShortArray8221;

	Class634(ItemDefinitions class631) {
		anIntArray8211 = new int[2];
		anIntArray8219 = new int[2];
		anIntArray8216[0] = 1363027847 * ((ItemDefinitions) class631).anInt8161;
		anIntArray8216[1] = ((ItemDefinitions) class631).anInt8132 * 1523363687;
		anIntArray8216[2] = 1059235147 * ((ItemDefinitions) class631).anInt8155;
		anIntArray8217[0] = 1779036733 * ((ItemDefinitions) class631).anInt8153;
		anIntArray8217[1] = -1581685779 * ((ItemDefinitions) class631).anInt8154;
		anIntArray8217[2] = ((ItemDefinitions) class631).anInt8156 * -2097304909;
		anIntArray8211[0] = -1940529443 * ((ItemDefinitions) class631).anInt8163;
		anIntArray8211[1] = 1748753175 * ((ItemDefinitions) class631).anInt8164;
		anIntArray8219[0] = 1851334061 * ((ItemDefinitions) class631).anInt8165;
		anIntArray8219[1] = -1329940367 * ((ItemDefinitions) class631).anInt8148;
		if (((ItemDefinitions) class631).aShortArray8140 != null) {
			aShortArray8220 = new short[((ItemDefinitions) class631).aShortArray8140.length];
			System.arraycopy(((ItemDefinitions) class631).aShortArray8140, 0, aShortArray8220, 0, aShortArray8220.length);
		}
		if (null != ((ItemDefinitions) class631).aShortArray8128) {
			aShortArray8221 = new short[((ItemDefinitions) class631).aShortArray8128.length];
			System.arraycopy(((ItemDefinitions) class631).aShortArray8128, 0, aShortArray8221, 0, aShortArray8221.length);
		}
	}
}

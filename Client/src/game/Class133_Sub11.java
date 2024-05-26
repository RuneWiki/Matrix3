package game;

/* Class133_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub11 extends Class133 {
	long aLong9862;
	int anInt9863;

	public void method2303(int i) {
		LinkableInt class572_sub26 = ((LinkableInt) Class122.aClass676_1485.get(1373532607203373663L * (((Class133_Sub11) this).aLong9862)));
		if (null != class572_sub26)
			class572_sub26.anInt9258 = -896023005 * ((Class133_Sub11) this).anInt9863;
		else
			Class122.aClass676_1485.put(new LinkableInt(-136338401 * ((Class133_Sub11) this).anInt9863), 1373532607203373663L * ((Class133_Sub11) this).aLong9862);
	}

	Class133_Sub11(RSByteBuffer class572_sub15, boolean bool) {
		super(class572_sub15);
		int i = class572_sub15.readUnsignedShort(647518597);
		if (bool)
			((Class133_Sub11) this).aLong9862 = -4178456082025616993L * (0x100000000L | (long) i);
		else
			((Class133_Sub11) this).aLong9862 = -4178456082025616993L * (long) i;
		((Class133_Sub11) this).anInt9863 = class572_sub15.readInt(1485580444) * -2090412065;
	}

	public void method2309() {
		LinkableInt class572_sub26 = ((LinkableInt) Class122.aClass676_1485.get(1373532607203373663L * (((Class133_Sub11) this).aLong9862)));
		if (null != class572_sub26)
			class572_sub26.anInt9258 = -896023005 * ((Class133_Sub11) this).anInt9863;
		else
			Class122.aClass676_1485.put(new LinkableInt(-136338401 * ((Class133_Sub11) this).anInt9863), 1373532607203373663L * ((Class133_Sub11) this).aLong9862);
	}
}

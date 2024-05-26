package game;

/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class519 implements Interface17 {
	Class540 aClass540_5755;
	int anInt5756;
	public static final int anInt5757 = -1;
	public static final int anInt5758 = 0;
	int anInt5759;
	public static final int anInt5760 = 1;
	public int anInt5761;
	static final int anInt5762 = 70;
	public int anInt5763;
	public int anInt5764;
	public int anInt5765;
	int anInt5766;
	int anInt5767;
	int anInt5768;
	Interface18 anInterface18_5769;
	public int anInt5770;
	public int anInt5771;
	public int anInt5772;
	String aString5773;
	public int anInt5774;
	public int anInt5775;
	public boolean aBool5776 = false;
	static final int anInt5777 = 16777215;
	public int[] anIntArray5778;
	int anInt5779;
	public int anInt5780;
	int anInt5781;
	int anInt5782;

	public void method110() {
		/* empty */
	}

	public void method109(RSByteBuffer class572_sub15, int i) {
		for (;;) {
			int i_0_ = class572_sub15.readUnsignedByte(280496499);
			if (i_0_ == 0)
				break;
			method6148(class572_sub15, i_0_, 1231528755);
		}
	}

	void method6148(RSByteBuffer class572_sub15, int i, int i_1_) {
		if (1 == i)
			anInt5763 = class572_sub15.readBigSmart((byte) 70) * 1293410075;
		else if (i == 2) {
			anInt5764 = class572_sub15.read24BitInt(1140925462) * 250232253;
			aBool5776 = true;
		} else if (3 == i)
			((Class519) this).anInt5766 = class572_sub15.readBigSmart((byte) 19) * -719847925;
		else if (4 == i)
			((Class519) this).anInt5768 = class572_sub15.readBigSmart((byte) 49) * 2102144161;
		else if (5 == i)
			((Class519) this).anInt5767 = class572_sub15.readBigSmart((byte) 18) * -417350067;
		else if (6 == i)
			((Class519) this).anInt5781 = class572_sub15.readBigSmart((byte) 113) * -542237507;
		else if (i == 7)
			anInt5770 = class572_sub15.readShort(-710976385) * 1633613499;
		else if (i == 8)
			((Class519) this).aString5773 = class572_sub15.readVersionedString(-719344505);
		else if (9 == i)
			anInt5765 = class572_sub15.readUnsignedShort(647518597) * -609826267;
		else if (i == 10)
			anInt5771 = class572_sub15.readShort(-710976385) * -794932083;
		else if (11 == i)
			anInt5772 = 0;
		else if (12 == i)
			anInt5774 = class572_sub15.readUnsignedByte(408861448) * 815320243;
		else if (i == 13)
			anInt5775 = class572_sub15.readShort(-710976385) * -1614329941;
		else if (14 == i)
			anInt5772 = class572_sub15.readUnsignedShort(647518597) * 2022104757;
		else if (16 == i) {
			anInt5761 = class572_sub15.readShort(-710976385) * -1779572133;
			anInt5780 = class572_sub15.readShort(-710976385) * -1421240479;
		} else if (17 == i || i == 18) {
			((Class519) this).anInt5779 = class572_sub15.readUnsignedShort(647518597) * 1425499993;
			if (50098409 * ((Class519) this).anInt5779 == 65535)
				((Class519) this).anInt5779 = -1425499993;
			((Class519) this).anInt5756 = class572_sub15.readUnsignedShort(647518597) * 1879839329;
			if (-382725727 * ((Class519) this).anInt5756 == 65535)
				((Class519) this).anInt5756 = -1879839329;
			int i_2_ = -1;
			if (18 == i) {
				i_2_ = class572_sub15.readUnsignedShort(647518597);
				if (i_2_ == 65535)
					i_2_ = -1;
			}
			int i_3_ = class572_sub15.readUnsignedByte(-89818363);
			anIntArray5778 = new int[2 + i_3_];
			for (int i_4_ = 0; i_4_ <= i_3_; i_4_++) {
				anIntArray5778[i_4_] = class572_sub15.readUnsignedShort(647518597);
				if (anIntArray5778[i_4_] == 65535)
					anIntArray5778[i_4_] = -1;
			}
			anIntArray5778[i_3_ + 1] = i_2_;
		} else if (i == 19)
			((Class519) this).anInt5759 = class572_sub15.readUnsignedShort(647518597) * 720010489;
		else if (i == 20)
			((Class519) this).anInt5782 = class572_sub15.readUnsignedShort(647518597) * -564144535;
	}

	public Class161 method6149(Class106 class106) {
		if (((Class519) this).anInt5767 * -2010142075 < 0)
			return null;
		Class161 class161 = ((Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767))));
		if (null == class161) {
			method6154(class106, (byte) 18);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767)));
		}
		return class161;
	}

	public String method6150(int i, int i_5_) {
		String string = ((Class519) this).aString5773;
		i = (i * (136152393 * ((Class519) this).anInt5759) / (-774170151 * ((Class519) this).anInt5782));
		for (;;) {
			int i_6_ = string.indexOf("%1");
			if (i_6_ < 0)
				break;
			string = new StringBuilder().append(string.substring(0, i_6_)).append(Class397.method4762(i, false, -1443765727)).append(string.substring(i_6_ + 2)).toString();
		}
		return string;
	}

	public Class161 method6151(Class106 class106, int i) {
		if (1863720355 * ((Class519) this).anInt5766 < 0)
			return null;
		Class161 class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		if (class161 == null) {
			method6154(class106, (byte) 53);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		}
		return class161;
	}

	public Class161 method6152(Class106 class106, int i) {
		if (((Class519) this).anInt5767 * -2010142075 < 0)
			return null;
		Class161 class161 = ((Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767))));
		if (null == class161) {
			method6154(class106, (byte) 40);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767)));
		}
		return class161;
	}

	public Class161 method6153(Class106 class106, int i) {
		if (-860047519 * ((Class519) this).anInt5768 < 0)
			return null;
		Class161 class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5768 * -860047519)));
		if (null == class161) {
			method6154(class106, (byte) 0);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5768 * -860047519)));
		}
		return class161;
	}

	void method6154(Class106 class106, byte i) {
		Class248 class248 = ((Class540) ((Class519) this).aClass540_5755).aClass248_6061;
		if (((Class519) this).anInt5766 * 1863720355 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355))) == null && class248.method3383(1863720355 * ((Class519) this).anInt5766, -1321203728)) {
			Class87 class87 = Class160.method2572(class248, 1863720355 * (((Class519) this).anInt5766));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (1863720355 * ((Class519) this).anInt5766));
		}
		if (((Class519) this).anInt5767 * -2010142075 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5767 * -2010142075))) == null && class248.method3383(-2010142075 * ((Class519) this).anInt5767, -1062741105)) {
			Class87 class87 = Class160.method2572(class248, (-2010142075 * ((Class519) this).anInt5767));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (-2010142075 * ((Class519) this).anInt5767));
		}
		if (-860047519 * ((Class519) this).anInt5768 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-860047519 * ((Class519) this).anInt5768))) == null && class248.method3383(((Class519) this).anInt5768 * -860047519, -924708688)) {
			Class87 class87 = Class160.method2572(class248, -860047519 * (((Class519) this).anInt5768));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (((Class519) this).anInt5768 * -860047519));
		}
		if (-1787183467 * ((Class519) this).anInt5781 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-1787183467 * ((Class519) this).anInt5781))) == null && class248.method3383(((Class519) this).anInt5781 * -1787183467, -534879788)) {
			Class87 class87 = Class160.method2572(class248, (((Class519) this).anInt5781 * -1787183467));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (((Class519) this).anInt5781 * -1787183467));
		}
	}

	void method6155(Class106 class106) {
		Class248 class248 = ((Class540) ((Class519) this).aClass540_5755).aClass248_6061;
		if (((Class519) this).anInt5766 * 1863720355 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355))) == null && class248.method3383(1863720355 * ((Class519) this).anInt5766, -1227148550)) {
			Class87 class87 = Class160.method2572(class248, 1863720355 * (((Class519) this).anInt5766));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (1863720355 * ((Class519) this).anInt5766));
		}
		if (((Class519) this).anInt5767 * -2010142075 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5767 * -2010142075))) == null && class248.method3383(-2010142075 * ((Class519) this).anInt5767, 363803910)) {
			Class87 class87 = Class160.method2572(class248, (-2010142075 * ((Class519) this).anInt5767));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (-2010142075 * ((Class519) this).anInt5767));
		}
		if (-860047519 * ((Class519) this).anInt5768 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-860047519 * ((Class519) this).anInt5768))) == null && class248.method3383(((Class519) this).anInt5768 * -860047519, 2135922031)) {
			Class87 class87 = Class160.method2572(class248, -860047519 * (((Class519) this).anInt5768));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (((Class519) this).anInt5768 * -860047519));
		}
		if (-1787183467 * ((Class519) this).anInt5781 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-1787183467 * ((Class519) this).anInt5781))) == null && class248.method3383(((Class519) this).anInt5781 * -1787183467, 1986420178)) {
			Class87 class87 = Class160.method2572(class248, (((Class519) this).anInt5781 * -1787183467));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (((Class519) this).anInt5781 * -1787183467));
		}
	}

	public void method105(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(75146026);
			if (i == 0)
				break;
			method6148(class572_sub15, i, 704628667);
		}
	}

	public void method107(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1770034414);
			if (i == 0)
				break;
			method6148(class572_sub15, i, 1791178392);
		}
	}

	public Class161 method6156(Class106 class106) {
		if (((Class519) this).anInt5767 * -2010142075 < 0)
			return null;
		Class161 class161 = ((Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767))));
		if (null == class161) {
			method6154(class106, (byte) -86);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767)));
		}
		return class161;
	}

	public void method103() {
		/* empty */
	}

	public Class161 method6157(Class106 class106) {
		if (1863720355 * ((Class519) this).anInt5766 < 0)
			return null;
		Class161 class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		if (class161 == null) {
			method6154(class106, (byte) 26);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		}
		return class161;
	}

	public void method112() {
		/* empty */
	}

	public void method106() {
		/* empty */
	}

	void method6158(RSByteBuffer class572_sub15, int i) {
		if (1 == i)
			anInt5763 = class572_sub15.readBigSmart((byte) 73) * 1293410075;
		else if (i == 2) {
			anInt5764 = class572_sub15.read24BitInt(1140925462) * 250232253;
			aBool5776 = true;
		} else if (3 == i)
			((Class519) this).anInt5766 = class572_sub15.readBigSmart((byte) 104) * -719847925;
		else if (4 == i)
			((Class519) this).anInt5768 = class572_sub15.readBigSmart((byte) 76) * 2102144161;
		else if (5 == i)
			((Class519) this).anInt5767 = class572_sub15.readBigSmart((byte) 38) * -417350067;
		else if (6 == i)
			((Class519) this).anInt5781 = class572_sub15.readBigSmart((byte) 54) * -542237507;
		else if (i == 7)
			anInt5770 = class572_sub15.readShort(-710976385) * 1633613499;
		else if (i == 8)
			((Class519) this).aString5773 = class572_sub15.readVersionedString(-1095800723);
		else if (9 == i)
			anInt5765 = class572_sub15.readUnsignedShort(647518597) * -609826267;
		else if (i == 10)
			anInt5771 = class572_sub15.readShort(-710976385) * -794932083;
		else if (11 == i)
			anInt5772 = 0;
		else if (12 == i)
			anInt5774 = class572_sub15.readUnsignedByte(1523078258) * 815320243;
		else if (i == 13)
			anInt5775 = class572_sub15.readShort(-710976385) * -1614329941;
		else if (14 == i)
			anInt5772 = class572_sub15.readUnsignedShort(647518597) * 2022104757;
		else if (16 == i) {
			anInt5761 = class572_sub15.readShort(-710976385) * -1779572133;
			anInt5780 = class572_sub15.readShort(-710976385) * -1421240479;
		} else if (17 == i || i == 18) {
			((Class519) this).anInt5779 = class572_sub15.readUnsignedShort(647518597) * 1425499993;
			if (50098409 * ((Class519) this).anInt5779 == 65535)
				((Class519) this).anInt5779 = -1425499993;
			((Class519) this).anInt5756 = class572_sub15.readUnsignedShort(647518597) * 1879839329;
			if (-382725727 * ((Class519) this).anInt5756 == 65535)
				((Class519) this).anInt5756 = -1879839329;
			int i_7_ = -1;
			if (18 == i) {
				i_7_ = class572_sub15.readUnsignedShort(647518597);
				if (i_7_ == 65535)
					i_7_ = -1;
			}
			int i_8_ = class572_sub15.readUnsignedByte(88750256);
			anIntArray5778 = new int[2 + i_8_];
			for (int i_9_ = 0; i_9_ <= i_8_; i_9_++) {
				anIntArray5778[i_9_] = class572_sub15.readUnsignedShort(647518597);
				if (anIntArray5778[i_9_] == 65535)
					anIntArray5778[i_9_] = -1;
			}
			anIntArray5778[i_8_ + 1] = i_7_;
		} else if (i == 19)
			((Class519) this).anInt5759 = class572_sub15.readUnsignedShort(647518597) * 720010489;
		else if (i == 20)
			((Class519) this).anInt5782 = class572_sub15.readUnsignedShort(647518597) * -564144535;
	}

	public Class161 method6159(Class106 class106, int i) {
		if (((Class519) this).anInt5781 * -1787183467 < 0)
			return null;
		Class161 class161 = ((Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5781 * -1787183467))));
		if (class161 == null) {
			method6154(class106, (byte) 25);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-1787183467 * ((Class519) this).anInt5781)));
		}
		return class161;
	}

	public void method104(byte i) {
		/* empty */
	}

	public Class161 method6160(Class106 class106) {
		if (1863720355 * ((Class519) this).anInt5766 < 0)
			return null;
		Class161 class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		if (class161 == null) {
			method6154(class106, (byte) 59);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		}
		return class161;
	}

	public Class161 method6161(Class106 class106) {
		if (1863720355 * ((Class519) this).anInt5766 < 0)
			return null;
		Class161 class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		if (class161 == null) {
			method6154(class106, (byte) 5);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		}
		return class161;
	}

	public void method108(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(1021332317);
			if (i == 0)
				break;
			method6148(class572_sub15, i, 816363450);
		}
	}

	public Class161 method6162(Class106 class106) {
		if (1863720355 * ((Class519) this).anInt5766 < 0)
			return null;
		Class161 class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		if (class161 == null) {
			method6154(class106, (byte) -4);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355)));
		}
		return class161;
	}

	public Class161 method6163(Class106 class106) {
		if (((Class519) this).anInt5767 * -2010142075 < 0)
			return null;
		Class161 class161 = ((Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767))));
		if (null == class161) {
			method6154(class106, (byte) 2);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-2010142075 * ((Class519) this).anInt5767)));
		}
		return class161;
	}

	Class519(int i, Class540 class540, Interface18 interface18) {
		anInt5763 = -1293410075;
		anInt5764 = -1374305725;
		anInt5765 = 261834270;
		((Class519) this).anInt5766 = 719847925;
		((Class519) this).anInt5767 = 417350067;
		((Class519) this).anInt5768 = -2102144161;
		((Class519) this).anInt5781 = 542237507;
		anInt5770 = 0;
		anInt5771 = 0;
		anInt5772 = -2022104757;
		((Class519) this).aString5773 = "";
		anInt5774 = -815320243;
		anInt5775 = 0;
		anInt5761 = 0;
		anInt5780 = 0;
		((Class519) this).anInt5779 = -1425499993;
		((Class519) this).anInt5756 = -1879839329;
		((Class519) this).anInt5759 = 720010489;
		((Class519) this).anInt5782 = -564144535;
		((Class519) this).aClass540_5755 = class540;
		((Class519) this).anInterface18_5769 = interface18;
	}

	public void method111(RSByteBuffer class572_sub15) {
		for (;;) {
			int i = class572_sub15.readUnsignedByte(540614349);
			if (i == 0)
				break;
			method6148(class572_sub15, i, 190148314);
		}
	}

	public Class161 method6164(Class106 class106) {
		if (-860047519 * ((Class519) this).anInt5768 < 0)
			return null;
		Class161 class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5768 * -860047519)));
		if (null == class161) {
			method6154(class106, (byte) 6);
			class161 = (Class161) (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5768 * -860047519)));
		}
		return class161;
	}

	public final Class519 method6165(Interface15 interface15, Interface13 interface13, byte i) {
		int i_10_ = -1;
		if (anIntArray5778 == null)
			return this;
		if (interface15 == null || interface13 == null)
			return null;
		if (-1 != ((Class519) this).anInt5779 * 50098409) {
			VarBitDefinition class429 = interface15.method95(((Class519) this).anInt5779 * 50098409, 819446449);
			if (class429 != null)
				i_10_ = interface13.method72(class429, 446470806);
		} else if (((Class519) this).anInt5756 * -382725727 != -1) {
			VarDefinition class179 = interface15.method94(VarDomainType.PLAYER_CONFIGS, (((Class519) this).anInt5756 * -382725727), (byte) 26);
			if (null != class179)
				i_10_ = interface13.method73(class179, -1481623338);
		}
		if (i_10_ < 0 || i_10_ >= anIntArray5778.length - 1) {
			int i_11_ = anIntArray5778[anIntArray5778.length - 1];
			if (i_11_ != -1)
				return (Class519) ((Class519) this).anInterface18_5769.getDefinition(i_11_, -1256330881);
			return null;
		}
		if (-1 == anIntArray5778[i_10_])
			return null;
		return (Class519) ((Class519) this).anInterface18_5769.getDefinition(anIntArray5778[i_10_], 195567447);
	}

	void method6166(Class106 class106) {
		Class248 class248 = ((Class540) ((Class519) this).aClass540_5755).aClass248_6061;
		if (((Class519) this).anInt5766 * 1863720355 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5766 * 1863720355))) == null && class248.method3383(1863720355 * ((Class519) this).anInt5766, 1529569285)) {
			Class87 class87 = Class160.method2572(class248, 1863720355 * (((Class519) this).anInt5766));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (1863720355 * ((Class519) this).anInt5766));
		}
		if (((Class519) this).anInt5767 * -2010142075 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (((Class519) this).anInt5767 * -2010142075))) == null && class248.method3383(-2010142075 * ((Class519) this).anInt5767, -1564087203)) {
			Class87 class87 = Class160.method2572(class248, (-2010142075 * ((Class519) this).anInt5767));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (-2010142075 * ((Class519) this).anInt5767));
		}
		if (-860047519 * ((Class519) this).anInt5768 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-860047519 * ((Class519) this).anInt5768))) == null && class248.method3383(((Class519) this).anInt5768 * -860047519, -680601442)) {
			Class87 class87 = Class160.method2572(class248, -860047519 * (((Class519) this).anInt5768));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (((Class519) this).anInt5768 * -860047519));
		}
		if (-1787183467 * ((Class519) this).anInt5781 >= 0 && (((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2246((long) (-1787183467 * ((Class519) this).anInt5781))) == null && class248.method3383(((Class519) this).anInt5781 * -1787183467, -1944367257)) {
			Class87 class87 = Class160.method2572(class248, (((Class519) this).anInt5781 * -1787183467));
			((Class540) ((Class519) this).aClass540_5755).aClass127_6062.method2229(class106.method1711(class87, true), (long) (((Class519) this).anInt5781 * -1787183467));
		}
	}

	static final void method6167(Cs2Executor class441, int i) {
		int i_12_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_12_, (short) 11666);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class73.aBool769 ? 1 : 0;
	}

	static final Cs2Executor getCachedExecutor(int i) {
		if (1379493169 * Class439.anInt5082 == Class439.anArrayList5090.size())
			Class439.anArrayList5090.add(new Cs2Executor());
		Cs2Executor class441 = ((Cs2Executor) Class439.anArrayList5090.get(Class439.anInt5082 * 1379493169));
		Class439.anInt5082 += -246557743;
		return class441;
	}

	static final void method6169(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1630729982) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray880 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}
}

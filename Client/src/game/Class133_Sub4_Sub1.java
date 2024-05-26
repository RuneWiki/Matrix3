package game;

/* Class133_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub4_Sub1 extends Class133_Sub4 {
	int anInt11119;
	int anInt11120;
	int anInt11121;

	public void method2309() {
		int i = 256 + ((Class133_Sub4_Sub1) this).anInt11119 * 794881536;
		int i_0_ = 256 + ((Class133_Sub4_Sub1) this).anInt11120 * 1320980992;
		int i_1_ = 1701247803 * ((Class133_Sub4_Sub1) this).anInt11121;
		if (i_1_ < 3 && (client.aClass613_8605.method7287((byte) -92).method3689(1847046263 * ((Class133_Sub4_Sub1) this).anInt11119, 1705467465 * ((Class133_Sub4_Sub1) this).anInt11120, -2067130818)))
			i_1_++;
		Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (new Class456_Sub1_Sub2_Sub4(client.aClass613_8605.method7285(1784539915), ((Class133_Sub4_Sub1) this).anInt9833 * -1825058389, 0, 1701247803 * ((Class133_Sub4_Sub1) this).anInt11121, i_1_, i, (Class314.method4072(i, i_0_, 1701247803 * (((Class133_Sub4_Sub1) this).anInt11121), -1861405172) - ((Class133_Sub4_Sub1) this).anInt9835 * 28165625), i_0_, 1847046263 * ((Class133_Sub4_Sub1) this).anInt11119, 1847046263 * ((Class133_Sub4_Sub1) this).anInt11119, ((Class133_Sub4_Sub1) this).anInt11120 * 1705467465, ((Class133_Sub4_Sub1) this).anInt11120 * 1705467465, 2076953673 * ((Class133_Sub4_Sub1) this).anInt9834, false, 0));
		client.aClass676_8747.put(new Class572_Sub12_Sub9(class456_sub1_sub2_sub4), (long) (1847046263 * ((Class133_Sub4_Sub1) this).anInt11119 << 16 | 1705467465 * ((Class133_Sub4_Sub1) this).anInt11120));
	}

	public void method2303(int i) {
		int i_2_ = 256 + ((Class133_Sub4_Sub1) this).anInt11119 * 794881536;
		int i_3_ = 256 + ((Class133_Sub4_Sub1) this).anInt11120 * 1320980992;
		int i_4_ = 1701247803 * ((Class133_Sub4_Sub1) this).anInt11121;
		if (i_4_ < 3 && (client.aClass613_8605.method7287((byte) -3).method3689(1847046263 * ((Class133_Sub4_Sub1) this).anInt11119, 1705467465 * ((Class133_Sub4_Sub1) this).anInt11120, -1925259833)))
			i_4_++;
		Class456_Sub1_Sub2_Sub4 class456_sub1_sub2_sub4 = (new Class456_Sub1_Sub2_Sub4(client.aClass613_8605.method7285(2037574818), ((Class133_Sub4_Sub1) this).anInt9833 * -1825058389, 0, 1701247803 * ((Class133_Sub4_Sub1) this).anInt11121, i_4_, i_2_, (Class314.method4072(i_2_, i_3_, 1701247803 * (((Class133_Sub4_Sub1) this).anInt11121), -2135200238) - ((Class133_Sub4_Sub1) this).anInt9835 * 28165625), i_3_, 1847046263 * ((Class133_Sub4_Sub1) this).anInt11119, 1847046263 * ((Class133_Sub4_Sub1) this).anInt11119, ((Class133_Sub4_Sub1) this).anInt11120 * 1705467465, ((Class133_Sub4_Sub1) this).anInt11120 * 1705467465, 2076953673 * ((Class133_Sub4_Sub1) this).anInt9834, false, 0));
		client.aClass676_8747.put(new Class572_Sub12_Sub9(class456_sub1_sub2_sub4), (long) (1847046263 * ((Class133_Sub4_Sub1) this).anInt11119 << 16 | 1705467465 * ((Class133_Sub4_Sub1) this).anInt11120));
	}

	Class133_Sub4_Sub1(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		int i = class572_sub15.readInt(-779722237);
		((Class133_Sub4_Sub1) this).anInt11119 = -1561515705 * (i >>> 16);
		((Class133_Sub4_Sub1) this).anInt11120 = -1408830471 * (i & 0xffff);
		((Class133_Sub4_Sub1) this).anInt11121 = class572_sub15.readUnsignedByte(1867375034) * 1741694451;
	}
}

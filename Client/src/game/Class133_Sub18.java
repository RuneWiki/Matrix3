package game;

/* Class133_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub18 extends Class133 {
	int anInt10208;
	int anInt10209;
	int anInt10210;
	int anInt10211;
	int anInt10212;

	Class133_Sub18(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub18) this).anInt10209 = class572_sub15.readUnsignedShort(647518597) * -1306788895;
		int i = class572_sub15.readUnsignedByte(1196371532);
		if ((i & 0x1) != 0) {
			((Class133_Sub18) this).anInt10210 = class572_sub15.readUnsignedShort(647518597) * -704392743;
			((Class133_Sub18) this).anInt10212 = class572_sub15.readUnsignedShort(647518597) * 118490671;
		} else {
			((Class133_Sub18) this).anInt10210 = 704392743;
			((Class133_Sub18) this).anInt10212 = -118490671;
		}
		if ((i & 0x2) != 0) {
			((Class133_Sub18) this).anInt10211 = class572_sub15.readUnsignedShort(647518597) * 1873411819;
			((Class133_Sub18) this).anInt10208 = class572_sub15.readUnsignedShort(647518597) * -1880727297;
		} else {
			((Class133_Sub18) this).anInt10211 = -1873411819;
			((Class133_Sub18) this).anInt10208 = 1880727297;
		}
		if (0 != (i & 0x4)) {
			int i_0_ = class572_sub15.readUnsignedShort(647518597);
			int i_1_ = class572_sub15.readUnsignedShort(647518597);
			int i_2_ = 255 * i_0_ / i_1_;
			if (i_0_ > 0 && i_2_ < 1) {
				boolean bool = true;
			}
		}
	}

	public void method2303(int i) {
		Entity class456_sub1_sub2_sub3 = Class122.aClass130Array1483[-415922143 * ((Class133_Sub18) this).anInt10209].method2268(1383460385);
		class456_sub1_sub2_sub3.method10522(((Class133_Sub18) this).anInt10210 * -1503420823, -555417393 * ((Class133_Sub18) this).anInt10212, -1272858173 * ((Class133_Sub18) this).anInt10211, -564617473 * ((Class133_Sub18) this).anInt10208, client.cycles, 0, -1814311960);
	}

	public void method2309() {
		Entity class456_sub1_sub2_sub3 = Class122.aClass130Array1483[-415922143 * ((Class133_Sub18) this).anInt10209].method2268(-627962575);
		class456_sub1_sub2_sub3.method10522(((Class133_Sub18) this).anInt10210 * -1503420823, -555417393 * ((Class133_Sub18) this).anInt10212, -1272858173 * ((Class133_Sub18) this).anInt10211, -564617473 * ((Class133_Sub18) this).anInt10208, client.cycles, 0, -1079063583);
	}
}

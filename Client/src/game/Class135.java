package game;

/* Class135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class135 {
	Class104_Sub1_Sub1 aClass104_Sub1_Sub1_1569;
	boolean aBool1570;
	Class104_Sub1_Sub1 aClass104_Sub1_Sub1_1571;
	boolean aBool1572;
	int anInt1573 = 0;
	int anInt1574 = 0;
	int anInt1575 = 1;
	Class88 aClass88_1576;
	boolean aBool1577;
	Class675 aClass675_1578;
	int anInt1579 = 1;
	Class106_Sub1 aClass106_Sub1_1580;
	Class104_Sub1_Sub1 aClass104_Sub1_Sub1_1581;
	boolean aBool1582;
	Class155_Sub4[] aClass155_Sub4Array1583;
	Class572_Sub12_Sub3 aClass572_Sub12_Sub3_1584;
	Class155_Sub4 aClass155_Sub4_1585;
	boolean aBool1586;
	boolean aBool1587;
	int anInt1588;
	Class572_Sub12_Sub3 aClass572_Sub12_Sub3_1589;

	void method2316() {
		((Class135) this).aClass104_Sub1_Sub1_1569 = null;
		((Class135) this).aClass104_Sub1_Sub1_1571 = null;
		((Class135) this).aClass104_Sub1_Sub1_1581 = null;
		((Class135) this).aClass572_Sub12_Sub3_1589 = null;
		((Class135) this).aClass155_Sub4_1585 = null;
		((Class135) this).aClass155_Sub4Array1583 = null;
		((Class135) this).aClass572_Sub12_Sub3_1584 = null;
		if (!((Class135) this).aClass675_1578.method7928((byte) 8)) {
			for (Class572 class572 = ((Class135) this).aClass675_1578.method7932((byte) 50); class572 != ((Class135) this).aClass675_1578.aClass572_8547; class572 = class572.aClass572_6433)
				((Class572_Sub32) class572).method8683();
		}
		((Class135) this).anInt1579 = 1;
		((Class135) this).anInt1575 = 1;
	}

	void method2317() {
		int i = 0;
		boolean bool = false;
		Class88 class88 = Class88.aClass88_1218;
		for (Class572_Sub32 class572_sub32 = ((Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50)); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(138182570)) {
			Class88 class88_0_ = class572_sub32.method8685();
			if (class88_0_.anInt1223 * -1071269501 > class88.anInt1223 * -1071269501)
				class88 = class88_0_;
			bool |= class572_sub32.method8701();
			i += class572_sub32.method8682();
		}
		if (class88 != ((Class135) this).aClass88_1576) {
			((Class135) this).aClass88_1576 = class88;
			((Class135) this).aBool1577 = true;
		}
		int i_1_ = (((Class135) this).anInt1588 > 2 ? 2 : ((Class135) this).anInt1588);
		int i_2_ = i > 2 ? 2 : i;
		if (i_1_ != i_2_) {
			((Class135) this).aBool1577 = true;
			((Class135) this).aBool1572 = true;
		}
		if (bool != ((Class135) this).aBool1587) {
			((Class135) this).aBool1587 = bool;
			((Class135) this).aBool1570 = true;
		}
		((Class135) this).anInt1588 = i;
	}

	boolean method2318() {
		return ((Class135) this).aClass104_Sub1_Sub1_1581 != null;
	}

	boolean method2319() {
		for (Class572_Sub32 class572_sub32 = ((Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50)); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1521164166)) {
			if (!class572_sub32.method8681())
				return false;
		}
		return true;
	}

	boolean method2320(int i, int i_3_, int i_4_, int i_5_) {
		if (((Class135) this).aClass104_Sub1_Sub1_1581 == null || ((Class135) this).aClass675_1578.method7928((byte) -109) || method2319())
			return false;
		if (((Class135) this).anInt1575 != i_4_ || ((Class135) this).anInt1579 != i_5_) {
			((Class135) this).anInt1575 = i_4_;
			((Class135) this).anInt1579 = i_5_;
			for (Class572 class572 = ((Class135) this).aClass675_1578.method7932((byte) 50); class572 != ((Class135) this).aClass675_1578.aClass572_8547; class572 = class572.aClass572_6433)
				((Class572_Sub32) class572).method8679((((Class135) this).anInt1575), (((Class135) this).anInt1579));
			((Class135) this).aBool1577 = true;
			((Class135) this).aBool1570 = true;
			((Class135) this).aBool1572 = true;
		}
		if (method2334()) {
			((Class135) this).anInt1573 = i;
			((Class135) this).anInt1574 = i_3_;
			((Class135) this).aBool1586 = true;
			((Class135) this).aClass106_Sub1_1580.method9392(-((Class135) this).anInt1573, (((Class135) this).anInt1579 + ((Class135) this).anInt1574 - ((Class135) this).aClass106_Sub1_1580.method1683(-471093969).method1646()));
			((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1581, -596513240);
			((Class135) this).aClass104_Sub1_Sub1_1581.method10136(0);
			((Class135) this).aClass106_Sub1_1580.method1719(3, 0);
			return true;
		}
		return false;
	}

	boolean method2321() {
		for (Class572_Sub32 class572_sub32 = ((Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50)); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1128918657)) {
			if (!class572_sub32.method8681())
				return false;
		}
		return true;
	}

	boolean method2322(Class572_Sub32 class572_sub32) {
		if (((Class135) this).aClass104_Sub1_Sub1_1581 != null) {
			if (class572_sub32.method8678() || class572_sub32.method8677()) {
				((Class135) this).aClass675_1578.method7940(class572_sub32, -2040995479);
				method2338();
				if (class572_sub32.method8687() >= 0 && method2334()) {
					if (((Class135) this).anInt1575 != -1 && ((Class135) this).anInt1579 != -1)
						class572_sub32.method8679(((Class135) this).anInt1575, ((Class135) this).anInt1579);
					((Class572_Sub32) class572_sub32).aBool9318 = true;
					return true;
				}
			}
			method2325(class572_sub32);
		}
		return false;
	}

	void method2323(int i, int i_6_) {
		if (((Class135) this).aBool1586) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null) {
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1571, 1039469894);
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, 72676438);
				((Class135) this).aClass104_Sub1_Sub1_1569.method10136(0);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9910(0, 0, ((Class135) this).anInt1575, ((Class135) this).anInt1579, 0, 0, true, ((Class135) this).aBool1587);
			}
			((Class135) this).aClass106_Sub1_1580.method9419();
			((Class135) this).aClass106_Sub1_1580.method9456(0);
			((Class135) this).aClass106_Sub1_1580.method9454(1);
			((Class135) this).aClass106_Sub1_1580.method1714();
			int i_7_ = 0;
			int i_8_ = 1;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			Object object = null;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(823298993)) {
				if (!class572_sub32.method8681())
					i_10_++;
			}
			Class572_Sub32[] class572_sub32s = new Class572_Sub32[i_10_];
			i_10_ = 0;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(2018787346)) {
				if (!class572_sub32.method8681())
					class572_sub32s[i_10_++] = class572_sub32;
			}
			while (i_9_ < i_10_) {
				for (int i_12_ = 0; i_12_ < i_10_; i_12_++) {
					Class572_Sub32 class572_sub32 = class572_sub32s[i_12_];
					if (class572_sub32.method8687() == i_11_) {
						int i_13_ = class572_sub32.method8682();
						for (int i_14_ = 0; i_14_ < i_13_; i_14_++) {
							((Class135) this).aClass106_Sub1_1580.method9392(0, 0);
							class572_sub32.method8675(i_14_, (((Class135) this).aClass155_Sub4Array1583[i_7_]), (((Class135) this).aClass155_Sub4_1585), i_6_, i);
							if (i_14_ == i_13_ - 1 && i_9_ == i_10_ - 1) {
								((Class135) this).aClass106_Sub1_1580.method1884((((Class135) this).aClass104_Sub1_Sub1_1569), 1064666194);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, ((Class135) this).anInt1574);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, (((Class135) this).anInt1574 + i_6_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) ((((Class135) this).anInt1579) - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), (((Class135) this).anInt1574 + i_6_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), ((Class135) this).anInt1574);
								OpenGL.glEnd();
							} else {
								((Class135) this).aClass104_Sub1_Sub1_1569.method10136(i_8_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_6_);
								OpenGL.glTexCoord2f((float) i, (float) ((((Class135) this).anInt1579) - i_6_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_6_);
								OpenGL.glTexCoord2f((float) i, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class572_sub32.method8697(i_14_);
							i_8_ = i_8_ + 1 & 0x1;
							i_7_ = i_7_ + 1 & 0x1;
						}
						i_9_++;
					}
				}
				i_11_++;
			}
			((Class135) this).aBool1586 = false;
			object = null;
		}
	}

	boolean method2324() {
		return ((Class135) this).aClass104_Sub1_Sub1_1581 != null;
	}

	void method2325(Class572_Sub32 class572_sub32) {
		((Class572_Sub32) class572_sub32).aBool9318 = false;
		class572_sub32.method8683();
		class572_sub32.method6794((byte) -58);
		method2338();
	}

	void method2326() {
		((Class135) this).aClass104_Sub1_Sub1_1569 = null;
		((Class135) this).aClass104_Sub1_Sub1_1571 = null;
		((Class135) this).aClass104_Sub1_Sub1_1581 = null;
		((Class135) this).aClass572_Sub12_Sub3_1589 = null;
		((Class135) this).aClass155_Sub4_1585 = null;
		((Class135) this).aClass155_Sub4Array1583 = null;
		((Class135) this).aClass572_Sub12_Sub3_1584 = null;
		if (!((Class135) this).aClass675_1578.method7928((byte) -81)) {
			for (Class572 class572 = ((Class135) this).aClass675_1578.method7932((byte) 50); class572 != ((Class135) this).aClass675_1578.aClass572_8547; class572 = class572.aClass572_6433)
				((Class572_Sub32) class572).method8683();
		}
		((Class135) this).anInt1579 = 1;
		((Class135) this).anInt1575 = 1;
	}

	void method2327() {
		((Class135) this).aClass104_Sub1_Sub1_1569 = null;
		((Class135) this).aClass104_Sub1_Sub1_1571 = null;
		((Class135) this).aClass104_Sub1_Sub1_1581 = null;
		((Class135) this).aClass572_Sub12_Sub3_1589 = null;
		((Class135) this).aClass155_Sub4_1585 = null;
		((Class135) this).aClass155_Sub4Array1583 = null;
		((Class135) this).aClass572_Sub12_Sub3_1584 = null;
		if (!((Class135) this).aClass675_1578.method7928((byte) -94)) {
			for (Class572 class572 = ((Class135) this).aClass675_1578.method7932((byte) 50); class572 != ((Class135) this).aClass675_1578.aClass572_8547; class572 = class572.aClass572_6433)
				((Class572_Sub32) class572).method8683();
		}
		((Class135) this).anInt1579 = 1;
		((Class135) this).anInt1575 = 1;
	}

	boolean method2328() {
		return ((Class135) this).aBool1586;
	}

	boolean method2329() {
		return ((Class135) this).aClass104_Sub1_Sub1_1581 != null;
	}

	boolean method2330() {
		return ((Class135) this).aBool1586;
	}

	boolean method2331() {
		return ((Class135) this).aBool1586;
	}

	Class135(Class106_Sub1 class106_sub1) {
		((Class135) this).aClass675_1578 = new Class675();
		((Class135) this).aBool1577 = true;
		((Class135) this).aBool1570 = true;
		((Class135) this).aBool1572 = true;
		((Class135) this).aBool1582 = true;
		((Class135) this).aClass155_Sub4Array1583 = new Class155_Sub4[2];
		((Class135) this).aBool1587 = false;
		((Class135) this).anInt1588 = 0;
		((Class135) this).aClass88_1576 = Class88.aClass88_1218;
		((Class135) this).aClass106_Sub1_1580 = class106_sub1;
		if (((Class106_Sub1) ((Class135) this).aClass106_Sub1_1580).aBool10124 && (((Class106_Sub1) ((Class135) this).aClass106_Sub1_1580).aBool10169)) {
			((Class135) this).aClass104_Sub1_Sub1_1581 = ((Class135) this).aClass104_Sub1_Sub1_1569 = new Class104_Sub1_Sub1(((Class135) this).aClass106_Sub1_1580);
			if ((((Class106_Sub1) ((Class135) this).aClass106_Sub1_1580).anInt10035) > 1 && (((Class106_Sub1) ((Class135) this).aClass106_Sub1_1580).aBool10159) && (((Class106_Sub1) ((Class135) this).aClass106_Sub1_1580).aBool10160))
				((Class135) this).aClass104_Sub1_Sub1_1581 = ((Class135) this).aClass104_Sub1_Sub1_1571 = new Class104_Sub1_Sub1(((Class135) this).aClass106_Sub1_1580);
		}
	}

	boolean method2332() {
		for (Class572_Sub32 class572_sub32 = ((Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50)); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1039554091)) {
			if (!class572_sub32.method8681())
				return false;
		}
		return true;
	}

	boolean method2333() {
		if (((Class135) this).aBool1570) {
			if (((Class135) this).aClass572_Sub12_Sub3_1589 != null) {
				((Class135) this).aClass572_Sub12_Sub3_1589.method39();
				((Class135) this).aClass572_Sub12_Sub3_1589 = null;
			}
			if (((Class135) this).aClass155_Sub4_1585 != null) {
				((Class135) this).aClass155_Sub4_1585.method2521();
				((Class135) this).aClass155_Sub4_1585 = null;
			}
		}
		if (((Class135) this).aBool1577) {
			if (((Class135) this).aClass572_Sub12_Sub3_1584 != null) {
				((Class135) this).aClass572_Sub12_Sub3_1584.method39();
				((Class135) this).aClass572_Sub12_Sub3_1584 = null;
			}
			if (((Class135) this).aClass155_Sub4Array1583[0] != null) {
				((Class135) this).aClass155_Sub4Array1583[0].method2521();
				((Class135) this).aClass155_Sub4Array1583[0] = null;
			}
			if (((Class135) this).aClass155_Sub4Array1583[1] != null) {
				((Class135) this).aClass155_Sub4Array1583[1].method2521();
				((Class135) this).aClass155_Sub4Array1583[1] = null;
			}
		}
		if (((Class135) this).aBool1570) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null)
				((Class135) this).aClass572_Sub12_Sub3_1589 = new Class572_Sub12_Sub3((((Class135) this).aClass106_Sub1_1580), Class171.aClass171_2066, Class88.aClass88_1216, ((Class135) this).anInt1575, ((Class135) this).anInt1579, (((Class106_Sub1) (((Class135) this).aClass106_Sub1_1580)).anInt10035));
			if (((Class135) this).aBool1587)
				((Class135) this).aClass155_Sub4_1585 = new Class155_Sub4(((Class135) this).aClass106_Sub1_1580, 34037, Class171.aClass171_2066, Class88.aClass88_1216, ((Class135) this).anInt1575, ((Class135) this).anInt1579);
			else if (((Class135) this).aClass572_Sub12_Sub3_1589 == null)
				((Class135) this).aClass572_Sub12_Sub3_1589 = new Class572_Sub12_Sub3((((Class135) this).aClass106_Sub1_1580), Class171.aClass171_2066, Class88.aClass88_1216, ((Class135) this).anInt1575, ((Class135) this).anInt1579);
			((Class135) this).aBool1570 = false;
			((Class135) this).aBool1572 = true;
			((Class135) this).aBool1582 = true;
		}
		if (((Class135) this).aBool1577) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null)
				((Class135) this).aClass572_Sub12_Sub3_1584 = new Class572_Sub12_Sub3((((Class135) this).aClass106_Sub1_1580), Class171.aClass171_2071, ((Class135) this).aClass88_1576, ((Class135) this).anInt1575, ((Class135) this).anInt1579, (((Class106_Sub1) (((Class135) this).aClass106_Sub1_1580)).anInt10035));
			((Class135) this).aClass155_Sub4Array1583[0] = new Class155_Sub4(((Class135) this).aClass106_Sub1_1580, 34037, Class171.aClass171_2071, ((Class135) this).aClass88_1576, ((Class135) this).anInt1575, ((Class135) this).anInt1579);
			((Class135) this).aClass155_Sub4Array1583[1] = (((Class135) this).anInt1588 > 1 ? new Class155_Sub4(((Class135) this).aClass106_Sub1_1580, 34037, Class171.aClass171_2071, ((Class135) this).aClass88_1576, ((Class135) this).anInt1575, ((Class135) this).anInt1579) : null);
			((Class135) this).aBool1577 = false;
			((Class135) this).aBool1572 = true;
			((Class135) this).aBool1582 = true;
		}
		if (((Class135) this).aBool1572) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null) {
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, -1272958872);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9906(null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, ((Class135) this).aClass155_Sub4Array1583[0].method9201(0));
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, (((Class135) this).anInt1588 > 1 ? ((Class135) this).aClass155_Sub4Array1583[1].method9201(0) : null));
				if (((Class135) this).aBool1587)
					((Class135) this).aClass104_Sub1_Sub1_1569.method9906(((Class135) this).aClass155_Sub4_1585.method9200(0));
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1569, 1490933029);
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1571, 117818288);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9906(null);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9908(0, null);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9908(0, ((Class135) this).aClass572_Sub12_Sub3_1584);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9906(((Class135) this).aClass572_Sub12_Sub3_1589);
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1571, 598917635);
			} else {
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, -504317117);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9906(null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, ((Class135) this).aClass155_Sub4Array1583[0].method9201(0));
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, (((Class135) this).anInt1588 > 1 ? ((Class135) this).aClass155_Sub4Array1583[1].method9201(0) : null));
				if (((Class135) this).aBool1587)
					((Class135) this).aClass104_Sub1_Sub1_1569.method9906(((Class135) this).aClass155_Sub4_1585.method9200(0));
				else
					((Class135) this).aClass104_Sub1_Sub1_1569.method9906(((Class135) this).aClass572_Sub12_Sub3_1589);
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1569, 1894747417);
			}
			((Class135) this).aBool1572 = false;
			((Class135) this).aBool1582 = true;
		}
		if (((Class135) this).aBool1582) {
			((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1581, -1330847291);
			((Class135) this).aBool1582 = !((Class135) this).aClass104_Sub1_Sub1_1581.method9909();
			((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1581, 1925387633);
		}
		return !((Class135) this).aBool1582;
	}

	boolean method2334() {
		if (((Class135) this).aBool1570) {
			if (((Class135) this).aClass572_Sub12_Sub3_1589 != null) {
				((Class135) this).aClass572_Sub12_Sub3_1589.method39();
				((Class135) this).aClass572_Sub12_Sub3_1589 = null;
			}
			if (((Class135) this).aClass155_Sub4_1585 != null) {
				((Class135) this).aClass155_Sub4_1585.method2521();
				((Class135) this).aClass155_Sub4_1585 = null;
			}
		}
		if (((Class135) this).aBool1577) {
			if (((Class135) this).aClass572_Sub12_Sub3_1584 != null) {
				((Class135) this).aClass572_Sub12_Sub3_1584.method39();
				((Class135) this).aClass572_Sub12_Sub3_1584 = null;
			}
			if (((Class135) this).aClass155_Sub4Array1583[0] != null) {
				((Class135) this).aClass155_Sub4Array1583[0].method2521();
				((Class135) this).aClass155_Sub4Array1583[0] = null;
			}
			if (((Class135) this).aClass155_Sub4Array1583[1] != null) {
				((Class135) this).aClass155_Sub4Array1583[1].method2521();
				((Class135) this).aClass155_Sub4Array1583[1] = null;
			}
		}
		if (((Class135) this).aBool1570) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null)
				((Class135) this).aClass572_Sub12_Sub3_1589 = new Class572_Sub12_Sub3((((Class135) this).aClass106_Sub1_1580), Class171.aClass171_2066, Class88.aClass88_1216, ((Class135) this).anInt1575, ((Class135) this).anInt1579, (((Class106_Sub1) (((Class135) this).aClass106_Sub1_1580)).anInt10035));
			if (((Class135) this).aBool1587)
				((Class135) this).aClass155_Sub4_1585 = new Class155_Sub4(((Class135) this).aClass106_Sub1_1580, 34037, Class171.aClass171_2066, Class88.aClass88_1216, ((Class135) this).anInt1575, ((Class135) this).anInt1579);
			else if (((Class135) this).aClass572_Sub12_Sub3_1589 == null)
				((Class135) this).aClass572_Sub12_Sub3_1589 = new Class572_Sub12_Sub3((((Class135) this).aClass106_Sub1_1580), Class171.aClass171_2066, Class88.aClass88_1216, ((Class135) this).anInt1575, ((Class135) this).anInt1579);
			((Class135) this).aBool1570 = false;
			((Class135) this).aBool1572 = true;
			((Class135) this).aBool1582 = true;
		}
		if (((Class135) this).aBool1577) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null)
				((Class135) this).aClass572_Sub12_Sub3_1584 = new Class572_Sub12_Sub3((((Class135) this).aClass106_Sub1_1580), Class171.aClass171_2071, ((Class135) this).aClass88_1576, ((Class135) this).anInt1575, ((Class135) this).anInt1579, (((Class106_Sub1) (((Class135) this).aClass106_Sub1_1580)).anInt10035));
			((Class135) this).aClass155_Sub4Array1583[0] = new Class155_Sub4(((Class135) this).aClass106_Sub1_1580, 34037, Class171.aClass171_2071, ((Class135) this).aClass88_1576, ((Class135) this).anInt1575, ((Class135) this).anInt1579);
			((Class135) this).aClass155_Sub4Array1583[1] = (((Class135) this).anInt1588 > 1 ? new Class155_Sub4(((Class135) this).aClass106_Sub1_1580, 34037, Class171.aClass171_2071, ((Class135) this).aClass88_1576, ((Class135) this).anInt1575, ((Class135) this).anInt1579) : null);
			((Class135) this).aBool1577 = false;
			((Class135) this).aBool1572 = true;
			((Class135) this).aBool1582 = true;
		}
		if (((Class135) this).aBool1572) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null) {
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, -1186483139);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9906(null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, ((Class135) this).aClass155_Sub4Array1583[0].method9201(0));
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, (((Class135) this).anInt1588 > 1 ? ((Class135) this).aClass155_Sub4Array1583[1].method9201(0) : null));
				if (((Class135) this).aBool1587)
					((Class135) this).aClass104_Sub1_Sub1_1569.method9906(((Class135) this).aClass155_Sub4_1585.method9200(0));
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1569, 1625593105);
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1571, -1961064863);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9906(null);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9908(0, null);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9908(0, ((Class135) this).aClass572_Sub12_Sub3_1584);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9906(((Class135) this).aClass572_Sub12_Sub3_1589);
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1571, 1561740515);
			} else {
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, -390886603);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9906(null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, null);
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(0, ((Class135) this).aClass155_Sub4Array1583[0].method9201(0));
				((Class135) this).aClass104_Sub1_Sub1_1569.method9908(1, (((Class135) this).anInt1588 > 1 ? ((Class135) this).aClass155_Sub4Array1583[1].method9201(0) : null));
				if (((Class135) this).aBool1587)
					((Class135) this).aClass104_Sub1_Sub1_1569.method9906(((Class135) this).aClass155_Sub4_1585.method9200(0));
				else
					((Class135) this).aClass104_Sub1_Sub1_1569.method9906(((Class135) this).aClass572_Sub12_Sub3_1589);
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1569, 631102018);
			}
			((Class135) this).aBool1572 = false;
			((Class135) this).aBool1582 = true;
		}
		if (((Class135) this).aBool1582) {
			((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1581, -881502232);
			((Class135) this).aBool1582 = !((Class135) this).aClass104_Sub1_Sub1_1581.method9909();
			((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1581, 1114017837);
		}
		return !((Class135) this).aBool1582;
	}

	void method2335(int i, int i_15_) {
		if (((Class135) this).aBool1586) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null) {
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1571, 272360073);
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, -538359097);
				((Class135) this).aClass104_Sub1_Sub1_1569.method10136(0);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9910(0, 0, ((Class135) this).anInt1575, ((Class135) this).anInt1579, 0, 0, true, ((Class135) this).aBool1587);
			}
			((Class135) this).aClass106_Sub1_1580.method9419();
			((Class135) this).aClass106_Sub1_1580.method9456(0);
			((Class135) this).aClass106_Sub1_1580.method9454(1);
			((Class135) this).aClass106_Sub1_1580.method1714();
			int i_16_ = 0;
			int i_17_ = 1;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			Object object = null;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(494398816)) {
				if (!class572_sub32.method8681())
					i_19_++;
			}
			Class572_Sub32[] class572_sub32s = new Class572_Sub32[i_19_];
			i_19_ = 0;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1920770571)) {
				if (!class572_sub32.method8681())
					class572_sub32s[i_19_++] = class572_sub32;
			}
			while (i_18_ < i_19_) {
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					Class572_Sub32 class572_sub32 = class572_sub32s[i_21_];
					if (class572_sub32.method8687() == i_20_) {
						int i_22_ = class572_sub32.method8682();
						for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
							((Class135) this).aClass106_Sub1_1580.method9392(0, 0);
							class572_sub32.method8675(i_23_, (((Class135) this).aClass155_Sub4Array1583[i_16_]), (((Class135) this).aClass155_Sub4_1585), i_15_, i);
							if (i_23_ == i_22_ - 1 && i_18_ == i_19_ - 1) {
								((Class135) this).aClass106_Sub1_1580.method1884((((Class135) this).aClass104_Sub1_Sub1_1569), 636110095);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, ((Class135) this).anInt1574);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, (((Class135) this).anInt1574 + i_15_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) ((((Class135) this).anInt1579) - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), (((Class135) this).anInt1574 + i_15_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), ((Class135) this).anInt1574);
								OpenGL.glEnd();
							} else {
								((Class135) this).aClass104_Sub1_Sub1_1569.method10136(i_17_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_15_);
								OpenGL.glTexCoord2f((float) i, (float) ((((Class135) this).anInt1579) - i_15_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_15_);
								OpenGL.glTexCoord2f((float) i, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class572_sub32.method8697(i_23_);
							i_17_ = i_17_ + 1 & 0x1;
							i_16_ = i_16_ + 1 & 0x1;
						}
						i_18_++;
					}
				}
				i_20_++;
			}
			((Class135) this).aBool1586 = false;
			object = null;
		}
	}

	void method2336(int i, int i_24_) {
		if (((Class135) this).aBool1586) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null) {
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1571, 1084578904);
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, -871674195);
				((Class135) this).aClass104_Sub1_Sub1_1569.method10136(0);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9910(0, 0, ((Class135) this).anInt1575, ((Class135) this).anInt1579, 0, 0, true, ((Class135) this).aBool1587);
			}
			((Class135) this).aClass106_Sub1_1580.method9419();
			((Class135) this).aClass106_Sub1_1580.method9456(0);
			((Class135) this).aClass106_Sub1_1580.method9454(1);
			((Class135) this).aClass106_Sub1_1580.method1714();
			int i_25_ = 0;
			int i_26_ = 1;
			int i_27_ = 0;
			int i_28_ = 0;
			int i_29_ = 0;
			Object object = null;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1339690268)) {
				if (!class572_sub32.method8681())
					i_28_++;
			}
			Class572_Sub32[] class572_sub32s = new Class572_Sub32[i_28_];
			i_28_ = 0;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(85610547)) {
				if (!class572_sub32.method8681())
					class572_sub32s[i_28_++] = class572_sub32;
			}
			while (i_27_ < i_28_) {
				for (int i_30_ = 0; i_30_ < i_28_; i_30_++) {
					Class572_Sub32 class572_sub32 = class572_sub32s[i_30_];
					if (class572_sub32.method8687() == i_29_) {
						int i_31_ = class572_sub32.method8682();
						for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
							((Class135) this).aClass106_Sub1_1580.method9392(0, 0);
							class572_sub32.method8675(i_32_, (((Class135) this).aClass155_Sub4Array1583[i_25_]), (((Class135) this).aClass155_Sub4_1585), i_24_, i);
							if (i_32_ == i_31_ - 1 && i_27_ == i_28_ - 1) {
								((Class135) this).aClass106_Sub1_1580.method1884((((Class135) this).aClass104_Sub1_Sub1_1569), 1807922945);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, ((Class135) this).anInt1574);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_24_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, (((Class135) this).anInt1574 + i_24_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) ((((Class135) this).anInt1579) - i_24_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), (((Class135) this).anInt1574 + i_24_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), ((Class135) this).anInt1574);
								OpenGL.glEnd();
							} else {
								((Class135) this).aClass104_Sub1_Sub1_1569.method10136(i_26_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_24_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_24_);
								OpenGL.glTexCoord2f((float) i, (float) ((((Class135) this).anInt1579) - i_24_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_24_);
								OpenGL.glTexCoord2f((float) i, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class572_sub32.method8697(i_32_);
							i_26_ = i_26_ + 1 & 0x1;
							i_25_ = i_25_ + 1 & 0x1;
						}
						i_27_++;
					}
				}
				i_29_++;
			}
			((Class135) this).aBool1586 = false;
			object = null;
		}
	}

	void method2337(int i, int i_33_) {
		if (((Class135) this).aBool1586) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null) {
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1571, 1173635569);
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, -1470372391);
				((Class135) this).aClass104_Sub1_Sub1_1569.method10136(0);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9910(0, 0, ((Class135) this).anInt1575, ((Class135) this).anInt1579, 0, 0, true, ((Class135) this).aBool1587);
			}
			((Class135) this).aClass106_Sub1_1580.method9419();
			((Class135) this).aClass106_Sub1_1580.method9456(0);
			((Class135) this).aClass106_Sub1_1580.method9454(1);
			((Class135) this).aClass106_Sub1_1580.method1714();
			int i_34_ = 0;
			int i_35_ = 1;
			int i_36_ = 0;
			int i_37_ = 0;
			int i_38_ = 0;
			Object object = null;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1811578216)) {
				if (!class572_sub32.method8681())
					i_37_++;
			}
			Class572_Sub32[] class572_sub32s = new Class572_Sub32[i_37_];
			i_37_ = 0;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(125397936)) {
				if (!class572_sub32.method8681())
					class572_sub32s[i_37_++] = class572_sub32;
			}
			while (i_36_ < i_37_) {
				for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
					Class572_Sub32 class572_sub32 = class572_sub32s[i_39_];
					if (class572_sub32.method8687() == i_38_) {
						int i_40_ = class572_sub32.method8682();
						for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
							((Class135) this).aClass106_Sub1_1580.method9392(0, 0);
							class572_sub32.method8675(i_41_, (((Class135) this).aClass155_Sub4Array1583[i_34_]), (((Class135) this).aClass155_Sub4_1585), i_33_, i);
							if (i_41_ == i_40_ - 1 && i_36_ == i_37_ - 1) {
								((Class135) this).aClass106_Sub1_1580.method1884((((Class135) this).aClass104_Sub1_Sub1_1569), 1642930050);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, ((Class135) this).anInt1574);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, (((Class135) this).anInt1574 + i_33_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) ((((Class135) this).anInt1579) - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), (((Class135) this).anInt1574 + i_33_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), ((Class135) this).anInt1574);
								OpenGL.glEnd();
							} else {
								((Class135) this).aClass104_Sub1_Sub1_1569.method10136(i_35_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_33_);
								OpenGL.glTexCoord2f((float) i, (float) ((((Class135) this).anInt1579) - i_33_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_33_);
								OpenGL.glTexCoord2f((float) i, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class572_sub32.method8697(i_41_);
							i_35_ = i_35_ + 1 & 0x1;
							i_34_ = i_34_ + 1 & 0x1;
						}
						i_36_++;
					}
				}
				i_38_++;
			}
			((Class135) this).aBool1586 = false;
			object = null;
		}
	}

	void method2338() {
		int i = 0;
		boolean bool = false;
		Class88 class88 = Class88.aClass88_1218;
		for (Class572_Sub32 class572_sub32 = ((Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50)); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(2130936114)) {
			Class88 class88_42_ = class572_sub32.method8685();
			if (class88_42_.anInt1223 * -1071269501 > class88.anInt1223 * -1071269501)
				class88 = class88_42_;
			bool |= class572_sub32.method8701();
			i += class572_sub32.method8682();
		}
		if (class88 != ((Class135) this).aClass88_1576) {
			((Class135) this).aClass88_1576 = class88;
			((Class135) this).aBool1577 = true;
		}
		int i_43_ = (((Class135) this).anInt1588 > 2 ? 2 : ((Class135) this).anInt1588);
		int i_44_ = i > 2 ? 2 : i;
		if (i_43_ != i_44_) {
			((Class135) this).aBool1577 = true;
			((Class135) this).aBool1572 = true;
		}
		if (bool != ((Class135) this).aBool1587) {
			((Class135) this).aBool1587 = bool;
			((Class135) this).aBool1570 = true;
		}
		((Class135) this).anInt1588 = i;
	}

	void method2339() {
		((Class135) this).aClass104_Sub1_Sub1_1569 = null;
		((Class135) this).aClass104_Sub1_Sub1_1571 = null;
		((Class135) this).aClass104_Sub1_Sub1_1581 = null;
		((Class135) this).aClass572_Sub12_Sub3_1589 = null;
		((Class135) this).aClass155_Sub4_1585 = null;
		((Class135) this).aClass155_Sub4Array1583 = null;
		((Class135) this).aClass572_Sub12_Sub3_1584 = null;
		if (!((Class135) this).aClass675_1578.method7928((byte) -48)) {
			for (Class572 class572 = ((Class135) this).aClass675_1578.method7932((byte) 50); class572 != ((Class135) this).aClass675_1578.aClass572_8547; class572 = class572.aClass572_6433)
				((Class572_Sub32) class572).method8683();
		}
		((Class135) this).anInt1579 = 1;
		((Class135) this).anInt1575 = 1;
	}

	void method2340(int i, int i_45_) {
		if (((Class135) this).aBool1586) {
			if (((Class135) this).aClass104_Sub1_Sub1_1571 != null) {
				((Class135) this).aClass106_Sub1_1580.method1884(((Class135) this).aClass104_Sub1_Sub1_1571, 1513346606);
				((Class135) this).aClass106_Sub1_1580.method1661(((Class135) this).aClass104_Sub1_Sub1_1569, 14466196);
				((Class135) this).aClass104_Sub1_Sub1_1569.method10136(0);
				((Class135) this).aClass104_Sub1_Sub1_1571.method9910(0, 0, ((Class135) this).anInt1575, ((Class135) this).anInt1579, 0, 0, true, ((Class135) this).aBool1587);
			}
			((Class135) this).aClass106_Sub1_1580.method9419();
			((Class135) this).aClass106_Sub1_1580.method9456(0);
			((Class135) this).aClass106_Sub1_1580.method9454(1);
			((Class135) this).aClass106_Sub1_1580.method1714();
			int i_46_ = 0;
			int i_47_ = 1;
			int i_48_ = 0;
			int i_49_ = 0;
			int i_50_ = 0;
			Object object = null;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1705554877)) {
				if (!class572_sub32.method8681())
					i_49_++;
			}
			Class572_Sub32[] class572_sub32s = new Class572_Sub32[i_49_];
			i_49_ = 0;
			for (Class572_Sub32 class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(1801700654)) {
				if (!class572_sub32.method8681())
					class572_sub32s[i_49_++] = class572_sub32;
			}
			while (i_48_ < i_49_) {
				for (int i_51_ = 0; i_51_ < i_49_; i_51_++) {
					Class572_Sub32 class572_sub32 = class572_sub32s[i_51_];
					if (class572_sub32.method8687() == i_50_) {
						int i_52_ = class572_sub32.method8682();
						for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
							((Class135) this).aClass106_Sub1_1580.method9392(0, 0);
							class572_sub32.method8675(i_53_, (((Class135) this).aClass155_Sub4Array1583[i_46_]), (((Class135) this).aClass155_Sub4_1585), i_45_, i);
							if (i_53_ == i_52_ - 1 && i_48_ == i_49_ - 1) {
								((Class135) this).aClass106_Sub1_1580.method1884((((Class135) this).aClass104_Sub1_Sub1_1569), 505226100);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, ((Class135) this).anInt1574);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(((Class135) this).anInt1573, (((Class135) this).anInt1574 + i_45_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) ((((Class135) this).anInt1579) - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), (((Class135) this).anInt1574 + i_45_));
								OpenGL.glTexCoord2f((float) (0 + i), (float) (0 + (((Class135) this).anInt1579)));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i((((Class135) this).anInt1573 + i), ((Class135) this).anInt1574);
								OpenGL.glEnd();
							} else {
								((Class135) this).aClass104_Sub1_Sub1_1569.method10136(i_47_);
								OpenGL.glBegin(7);
								OpenGL.glTexCoord2f(0.0F, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
								OpenGL.glVertex2i(0, 0);
								OpenGL.glTexCoord2f(0.0F, (float) ((((Class135) this).anInt1579) - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
								OpenGL.glVertex2i(0, i_45_);
								OpenGL.glTexCoord2f((float) i, (float) ((((Class135) this).anInt1579) - i_45_));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
								OpenGL.glVertex2i(i, i_45_);
								OpenGL.glTexCoord2f((float) i, (float) (((Class135) this).anInt1579));
								OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
								OpenGL.glVertex2i(i, 0);
								OpenGL.glEnd();
							}
							class572_sub32.method8697(i_53_);
							i_47_ = i_47_ + 1 & 0x1;
							i_46_ = i_46_ + 1 & 0x1;
						}
						i_48_++;
					}
				}
				i_50_++;
			}
			((Class135) this).aBool1586 = false;
			object = null;
		}
	}

	void method2341() {
		int i = 0;
		boolean bool = false;
		Class88 class88 = Class88.aClass88_1218;
		for (Class572_Sub32 class572_sub32 = ((Class572_Sub32) ((Class135) this).aClass675_1578.method7932((byte) 50)); class572_sub32 != null; class572_sub32 = (Class572_Sub32) ((Class135) this).aClass675_1578.method7926(613806075)) {
			Class88 class88_54_ = class572_sub32.method8685();
			if (class88_54_.anInt1223 * -1071269501 > class88.anInt1223 * -1071269501)
				class88 = class88_54_;
			bool |= class572_sub32.method8701();
			i += class572_sub32.method8682();
		}
		if (class88 != ((Class135) this).aClass88_1576) {
			((Class135) this).aClass88_1576 = class88;
			((Class135) this).aBool1577 = true;
		}
		int i_55_ = (((Class135) this).anInt1588 > 2 ? 2 : ((Class135) this).anInt1588);
		int i_56_ = i > 2 ? 2 : i;
		if (i_55_ != i_56_) {
			((Class135) this).aBool1577 = true;
			((Class135) this).aBool1572 = true;
		}
		if (bool != ((Class135) this).aBool1587) {
			((Class135) this).aBool1587 = bool;
			((Class135) this).aBool1570 = true;
		}
		((Class135) this).anInt1588 = i;
	}
}

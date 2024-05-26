package game;

/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class363 {
	boolean aBool4441;
	Class104_Sub1 aClass104_Sub1_4442;
	Class104_Sub1 aClass104_Sub1_4443;
	Interface45 anInterface45_4444;
	Class106_Sub3 aClass106_Sub3_4445;
	Interface45 anInterface45_4446;
	Interface6 anInterface6_4447;
	Interface11 anInterface11_4448;
	Interface6 anInterface6_4449;
	int anInt4450;
	Interface11 anInterface11_4451;
	Interface44 anInterface44_4452;
	int anInt4453;
	int anInt4454;
	Interface6 anInterface6_4455;
	int anInt4456 = 0;
	Class88 aClass88_4457;
	Class362 aClass362_4458;
	Vector aVector4459 = new Vector();
	Interface6 anInterface6_4460;
	Interface45 anInterface45_4461;
	int anInt4462 = 0;
	int anInt4463 = 0;

	void method4465() {
		((Class363) this).aClass106_Sub3_4445.method9674(0, ((Class363) this).anInterface44_4452);
		((Class363) this).aClass106_Sub3_4445.method9673(((Class363) this).aClass362_4458);
		((Class363) this).aClass106_Sub3_4445.method9660(Class379.aClass379_4588, 0, 1);
	}

	void method4466() {
		if (((Class363) this).anInterface44_4452 == null) {
			((Class363) this).anInterface44_4452 = ((Class363) this).aClass106_Sub3_4445.method9723(false);
			((Class363) this).anInterface44_4452.method259(12, 4);
			ByteBuffer bytebuffer = ((Class363) this).aClass106_Sub3_4445.aByteBuffer10378;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			((Class363) this).anInterface44_4452.method223(0, bytebuffer.position(), ((Class363) this).aClass106_Sub3_4445.aLong10444);
			((Class363) this).aClass362_4458 = (((Class363) this).aClass106_Sub3_4445.method9672(new Class354[] { new Class354(Class364.aClass364_4471) }));
		}
	}

	void method4467() {
		((Class363) this).aClass106_Sub3_4445.method9674(0, ((Class363) this).anInterface44_4452);
		((Class363) this).aClass106_Sub3_4445.method9673(((Class363) this).aClass362_4458);
		((Class363) this).aClass106_Sub3_4445.method9660(Class379.aClass379_4588, 0, 1);
	}

	void method4468() {
		method4466();
		switch (((Class363) this).anInt4462) {
			default:
				throw new RuntimeException();
			case 0:
				((Class363) this).aClass88_4457 = Class88.aClass88_1218;
				break;
			case 1:
				((Class363) this).aClass88_4457 = Class88.aClass88_1220;
				break;
			case 2:
				((Class363) this).aClass88_4457 = Class88.aClass88_1213;
		}
		((Class363) this).aClass104_Sub1_4443 = ((Class363) this).aClass106_Sub3_4445.method1693();
		if (((Class363) this).aClass106_Sub3_4445.anInt10511 > 1 && ((Class363) this).aClass106_Sub3_4445.aBool10520 && ((Class363) this).aClass106_Sub3_4445.aBool10521) {
			((Class363) this).aClass104_Sub1_4442 = ((Class363) this).aClass106_Sub3_4445.method1693();
			((Class363) this).anInterface6_4455 = (((Class363) this).aClass106_Sub3_4445.method2039(((Class363) this).anInt4453, ((Class363) this).anInt4454, Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).aClass106_Sub3_4445.anInt10511));
			((Class363) this).anInterface11_4448 = (((Class363) this).aClass106_Sub3_4445.method1781(((Class363) this).anInt4453, ((Class363) this).anInt4454, ((Class363) this).aClass106_Sub3_4445.anInt10511));
		}
		((Class363) this).anInterface45_4444 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4447 = ((Class363) this).anInterface45_4444.method260(0);
		((Class363) this).anInterface45_4461 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4460 = ((Class363) this).anInterface45_4461.method260(0);
		((Class363) this).anInterface45_4446 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4449 = ((Class363) this).anInterface45_4446.method260(0);
		((Class363) this).anInterface11_4451 = (((Class363) this).aClass106_Sub3_4445.method1694(((Class363) this).anInterface45_4446.method42(), ((Class363) this).anInterface45_4446.method41()));
		int i = ((Class363) this).aVector4459.size();
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			Class351 class351 = (Class351) ((Class363) this).aVector4459.elementAt(i_0_);
			class351.method4378(((Class363) this).anInt4453, ((Class363) this).anInt4454);
		}
	}

	boolean method4469(Class351 class351) {
		Vector vector = new Vector();
		boolean bool = false;
		for (int i = 0; i < ((Class363) this).aVector4459.size(); i++) {
			if (!bool && class351.method4382() < method4478(i).method4382()) {
				bool = true;
				if (!method4484(vector, vector.size(), class351))
					return false;
			}
			vector.addElement(method4478(i));
		}
		if (!bool && !method4484(vector, vector.size(), class351))
			return false;
		((Class363) this).aVector4459 = vector;
		return true;
	}

	Class363(Class106_Sub3 class106_sub3, int i, int i_1_) {
		((Class363) this).aClass106_Sub3_4445 = class106_sub3;
		((Class363) this).aClass88_4457 = Class88.aClass88_1218;
		((Class363) this).anInt4453 = i;
		((Class363) this).anInt4454 = i_1_;
	}

	boolean method4470(int i, int i_2_, int i_3_, int i_4_) {
		if (((Class363) this).aVector4459.isEmpty() || method4480())
			return true;
		if (((Class363) this).anInt4453 != i_3_ || ((Class363) this).anInt4454 != i_4_ || (((Class363) this).aClass106_Sub3_4445.anInt10511 != ((Class363) this).anInt4463)) {
			((Class363) this).anInt4463 = ((Class363) this).aClass106_Sub3_4445.anInt10511;
			((Class363) this).anInt4453 = i_3_;
			((Class363) this).anInt4454 = i_4_;
			method4473();
			method4468();
		}
		((Class363) this).aClass104_Sub1_4443.method9908(0, ((Class363) this).anInterface6_4449);
		if (((Class363) this).anInterface11_4451 != null)
			((Class363) this).aClass104_Sub1_4443.method9906(((Class363) this).anInterface11_4451);
		if (((Class363) this).aClass104_Sub1_4442 != null) {
			((Class363) this).aClass104_Sub1_4442.method9908(0, ((Class363) this).anInterface6_4455);
			((Class363) this).aClass104_Sub1_4442.method9906(((Class363) this).anInterface11_4448);
			((Class363) this).aClass106_Sub3_4445.method1661(((Class363) this).aClass104_Sub1_4442, -1300694483);
		} else
			((Class363) this).aClass106_Sub3_4445.method1661(((Class363) this).aClass104_Sub1_4443, -682723411);
		if (!((Class363) this).aClass104_Sub1_4443.method9909()) {
			((Class363) this).aClass106_Sub3_4445.method1884((((Class363) this).aClass104_Sub1_4442 != null ? ((Class363) this).aClass104_Sub1_4442 : ((Class363) this).aClass104_Sub1_4443), 1162533689);
			return false;
		}
		((Class363) this).anInt4450 = i;
		((Class363) this).anInt4456 = i_2_;
		((Class363) this).aClass106_Sub3_4445.method1719(3, -16777216);
		((Class363) this).aClass106_Sub3_4445.method9680(15);
		((Class363) this).aClass106_Sub3_4445.method9622(0);
		((Class363) this).aBool4441 = true;
		return true;
	}

	void method4471(int i, int i_5_) {
		if (((Class363) this).aBool4441) {
			if (((Class363) this).aClass104_Sub1_4442 != null) {
				((Class363) this).aClass106_Sub3_4445.method1884(((Class363) this).aClass104_Sub1_4442, 1607479144);
				((Class363) this).aClass106_Sub3_4445.method1661(((Class363) this).aClass104_Sub1_4443, -1547234273);
				((Class363) this).aClass104_Sub1_4442.method9910(0, 0, ((Class363) this).anInt4453, ((Class363) this).anInt4454, 0, 0, true, ((Class363) this).anInterface11_4451 != null);
			}
			method4472(i, i_5_);
			((Class363) this).aBool4441 = false;
		}
	}

	void method4472(int i, int i_6_) {
		((Class363) this).aClass106_Sub3_4445.method1717(true);
		((Class363) this).aClass106_Sub3_4445.method9684();
		((Class363) this).aClass106_Sub3_4445.method9591(0);
		((Class363) this).aClass106_Sub3_4445.method9643(1);
		((Class363) this).aClass106_Sub3_4445.method1714();
		((Class363) this).aClass104_Sub1_4443.method9906(null);
		((Class363) this).aClass106_Sub3_4445.method9602(0, 0);
		int i_7_ = ((Class363) this).aVector4459.size();
		Vector vector = ((Class363) this).aVector4459;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			if (((Class351) ((Class363) this).aVector4459.elementAt(i_8_)).method4380()) {
				vector = new Vector();
				for (int i_9_ = 0; i_9_ < i_7_; i_9_++) {
					if (!((Class351) ((Class363) this).aVector4459.elementAt(i_9_)).method4380())
						vector.addElement(((Class363) this).aVector4459.elementAt(i_9_));
				}
				i_7_ = vector.size();
				break;
			}
		}
		((Class363) this).anInterface45_4446.method237();
		for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
			Class351 class351 = (Class351) vector.elementAt(i_10_);
			int i_11_ = class351.method4372();
			boolean bool = i_10_ == i_7_ - 1;
			boolean bool_12_ = false;
			for (int i_13_ = 0; i_13_ < i_11_; i_13_++) {
				if (i_13_ == i_11_ - 1) {
					if (bool) {
						((Class363) this).aClass106_Sub3_4445.method1884(((Class363) this).aClass104_Sub1_4443, 367830083);
						((Class363) this).aClass106_Sub3_4445.method1715(((Class363) this).anInt4450, ((Class363) this).anInt4456, ((Class363) this).anInt4450 + i, ((Class363) this).anInt4456 + i_6_);
					} else {
						bool_12_ = true;
						((Class363) this).aClass104_Sub1_4443.method9908(0, ((Class363) this).anInterface6_4449);
					}
				} else
					((Class363) this).aClass104_Sub1_4443.method9908(0, ((Class363) this).anInterface6_4460);
				Interface45 interface45 = ((Class363) this).anInterface45_4444;
				if (i_13_ == 0)
					interface45 = ((Class363) this).anInterface45_4446;
				class351.method4379(i_13_, ((Class363) this).aClass104_Sub1_4443, interface45, ((Class363) this).anInterface11_4451, ((Class363) this).anInterface45_4446, bool && i_13_ == i_11_ - 1);
				method4467();
				class351.method4381(i_13_);
				if (bool_12_)
					((Class363) this).anInterface45_4446.method237();
				Interface45 interface45_14_ = ((Class363) this).anInterface45_4444;
				((Class363) this).anInterface45_4444 = ((Class363) this).anInterface45_4461;
				((Class363) this).anInterface45_4461 = interface45_14_;
				Interface6 interface6 = ((Class363) this).anInterface6_4447;
				((Class363) this).anInterface6_4447 = ((Class363) this).anInterface6_4460;
				((Class363) this).anInterface6_4460 = interface6;
			}
		}
		((Class363) this).aClass106_Sub3_4445.method9591(1);
		((Class363) this).aClass106_Sub3_4445.method9643(0);
		((Class363) this).aClass106_Sub3_4445.method1717(false);
		((Class363) this).aClass106_Sub3_4445.method1714();
		Object object = null;
	}

	void method4473() {
		if (((Class363) this).aClass104_Sub1_4442 != null) {
			((Class363) this).aClass104_Sub1_4442.method39();
			((Class363) this).aClass104_Sub1_4442 = null;
		}
		if (((Class363) this).anInterface6_4455 != null) {
			((Class363) this).anInterface6_4455.method39();
			((Class363) this).anInterface6_4455 = null;
		}
		if (((Class363) this).anInterface11_4448 != null) {
			((Class363) this).anInterface11_4448.method39();
			((Class363) this).anInterface11_4448 = null;
		}
		if (((Class363) this).aClass104_Sub1_4443 != null)
			((Class363) this).aClass104_Sub1_4443.method39();
		if (((Class363) this).anInterface6_4447 != null)
			((Class363) this).anInterface6_4447.method39();
		if (((Class363) this).anInterface6_4460 != null)
			((Class363) this).anInterface6_4460.method39();
		if (((Class363) this).anInterface6_4449 != null)
			((Class363) this).anInterface6_4449.method39();
		if (((Class363) this).anInterface45_4444 != null)
			((Class363) this).anInterface45_4444.method39();
		if (((Class363) this).anInterface45_4461 != null)
			((Class363) this).anInterface45_4461.method39();
		if (((Class363) this).anInterface45_4446 != null)
			((Class363) this).anInterface45_4446.method39();
		if (((Class363) this).anInterface11_4451 != null)
			((Class363) this).anInterface11_4451.method39();
		int i = ((Class363) this).aVector4459.size();
		for (int i_15_ = 0; i_15_ < i; i_15_++) {
			Class351 class351 = (Class351) ((Class363) this).aVector4459.elementAt(i_15_);
			class351.method4394();
		}
	}

	void method4474() {
		((Class363) this).aClass106_Sub3_4445.method9674(0, ((Class363) this).anInterface44_4452);
		((Class363) this).aClass106_Sub3_4445.method9673(((Class363) this).aClass362_4458);
		((Class363) this).aClass106_Sub3_4445.method9660(Class379.aClass379_4588, 0, 1);
	}

	void method4475() {
		if (((Class363) this).aClass104_Sub1_4442 != null) {
			((Class363) this).aClass104_Sub1_4442.method39();
			((Class363) this).aClass104_Sub1_4442 = null;
		}
		if (((Class363) this).anInterface6_4455 != null) {
			((Class363) this).anInterface6_4455.method39();
			((Class363) this).anInterface6_4455 = null;
		}
		if (((Class363) this).anInterface11_4448 != null) {
			((Class363) this).anInterface11_4448.method39();
			((Class363) this).anInterface11_4448 = null;
		}
		if (((Class363) this).aClass104_Sub1_4443 != null)
			((Class363) this).aClass104_Sub1_4443.method39();
		if (((Class363) this).anInterface6_4447 != null)
			((Class363) this).anInterface6_4447.method39();
		if (((Class363) this).anInterface6_4460 != null)
			((Class363) this).anInterface6_4460.method39();
		if (((Class363) this).anInterface6_4449 != null)
			((Class363) this).anInterface6_4449.method39();
		if (((Class363) this).anInterface45_4444 != null)
			((Class363) this).anInterface45_4444.method39();
		if (((Class363) this).anInterface45_4461 != null)
			((Class363) this).anInterface45_4461.method39();
		if (((Class363) this).anInterface45_4446 != null)
			((Class363) this).anInterface45_4446.method39();
		if (((Class363) this).anInterface11_4451 != null)
			((Class363) this).anInterface11_4451.method39();
		int i = ((Class363) this).aVector4459.size();
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			Class351 class351 = (Class351) ((Class363) this).aVector4459.elementAt(i_16_);
			class351.method4394();
		}
	}

	void method4476() {
		method4466();
		switch (((Class363) this).anInt4462) {
			default:
				throw new RuntimeException();
			case 0:
				((Class363) this).aClass88_4457 = Class88.aClass88_1218;
				break;
			case 1:
				((Class363) this).aClass88_4457 = Class88.aClass88_1220;
				break;
			case 2:
				((Class363) this).aClass88_4457 = Class88.aClass88_1213;
		}
		((Class363) this).aClass104_Sub1_4443 = ((Class363) this).aClass106_Sub3_4445.method1693();
		if (((Class363) this).aClass106_Sub3_4445.anInt10511 > 1 && ((Class363) this).aClass106_Sub3_4445.aBool10520 && ((Class363) this).aClass106_Sub3_4445.aBool10521) {
			((Class363) this).aClass104_Sub1_4442 = ((Class363) this).aClass106_Sub3_4445.method1693();
			((Class363) this).anInterface6_4455 = (((Class363) this).aClass106_Sub3_4445.method2039(((Class363) this).anInt4453, ((Class363) this).anInt4454, Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).aClass106_Sub3_4445.anInt10511));
			((Class363) this).anInterface11_4448 = (((Class363) this).aClass106_Sub3_4445.method1781(((Class363) this).anInt4453, ((Class363) this).anInt4454, ((Class363) this).aClass106_Sub3_4445.anInt10511));
		}
		((Class363) this).anInterface45_4444 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4447 = ((Class363) this).anInterface45_4444.method260(0);
		((Class363) this).anInterface45_4461 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4460 = ((Class363) this).anInterface45_4461.method260(0);
		((Class363) this).anInterface45_4446 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4449 = ((Class363) this).anInterface45_4446.method260(0);
		((Class363) this).anInterface11_4451 = (((Class363) this).aClass106_Sub3_4445.method1694(((Class363) this).anInterface45_4446.method42(), ((Class363) this).anInterface45_4446.method41()));
		int i = ((Class363) this).aVector4459.size();
		for (int i_17_ = 0; i_17_ < i; i_17_++) {
			Class351 class351 = (Class351) ((Class363) this).aVector4459.elementAt(i_17_);
			class351.method4378(((Class363) this).anInt4453, ((Class363) this).anInt4454);
		}
	}

	void method4477() {
		method4466();
		switch (((Class363) this).anInt4462) {
			default:
				throw new RuntimeException();
			case 0:
				((Class363) this).aClass88_4457 = Class88.aClass88_1218;
				break;
			case 1:
				((Class363) this).aClass88_4457 = Class88.aClass88_1220;
				break;
			case 2:
				((Class363) this).aClass88_4457 = Class88.aClass88_1213;
		}
		((Class363) this).aClass104_Sub1_4443 = ((Class363) this).aClass106_Sub3_4445.method1693();
		if (((Class363) this).aClass106_Sub3_4445.anInt10511 > 1 && ((Class363) this).aClass106_Sub3_4445.aBool10520 && ((Class363) this).aClass106_Sub3_4445.aBool10521) {
			((Class363) this).aClass104_Sub1_4442 = ((Class363) this).aClass106_Sub3_4445.method1693();
			((Class363) this).anInterface6_4455 = (((Class363) this).aClass106_Sub3_4445.method2039(((Class363) this).anInt4453, ((Class363) this).anInt4454, Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).aClass106_Sub3_4445.anInt10511));
			((Class363) this).anInterface11_4448 = (((Class363) this).aClass106_Sub3_4445.method1781(((Class363) this).anInt4453, ((Class363) this).anInt4454, ((Class363) this).aClass106_Sub3_4445.anInt10511));
		}
		((Class363) this).anInterface45_4444 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4447 = ((Class363) this).anInterface45_4444.method260(0);
		((Class363) this).anInterface45_4461 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4460 = ((Class363) this).anInterface45_4461.method260(0);
		((Class363) this).anInterface45_4446 = (((Class363) this).aClass106_Sub3_4445.method9639(Class171.aClass171_2071, ((Class363) this).aClass88_4457, ((Class363) this).anInt4453, ((Class363) this).anInt4454));
		((Class363) this).anInterface6_4449 = ((Class363) this).anInterface45_4446.method260(0);
		((Class363) this).anInterface11_4451 = (((Class363) this).aClass106_Sub3_4445.method1694(((Class363) this).anInterface45_4446.method42(), ((Class363) this).anInterface45_4446.method41()));
		int i = ((Class363) this).aVector4459.size();
		for (int i_18_ = 0; i_18_ < i; i_18_++) {
			Class351 class351 = (Class351) ((Class363) this).aVector4459.elementAt(i_18_);
			class351.method4378(((Class363) this).anInt4453, ((Class363) this).anInt4454);
		}
	}

	Class351 method4478(int i) {
		return (Class351) ((Class363) this).aVector4459.elementAt(i);
	}

	boolean method4479() {
		int i = ((Class363) this).aVector4459.size();
		for (int i_19_ = 0; i_19_ < i; i_19_++) {
			if (!((Class351) ((Class363) this).aVector4459.elementAt(i_19_)).method4380())
				return false;
		}
		return true;
	}

	boolean method4480() {
		int i = ((Class363) this).aVector4459.size();
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			if (!((Class351) ((Class363) this).aVector4459.elementAt(i_20_)).method4380())
				return false;
		}
		return true;
	}

	boolean method4481() {
		int i = ((Class363) this).aVector4459.size();
		for (int i_21_ = 0; i_21_ < i; i_21_++) {
			if (!((Class351) ((Class363) this).aVector4459.elementAt(i_21_)).method4380())
				return false;
		}
		return true;
	}

	boolean method4482() {
		int i = ((Class363) this).aVector4459.size();
		for (int i_22_ = 0; i_22_ < i; i_22_++) {
			if (!((Class351) ((Class363) this).aVector4459.elementAt(i_22_)).method4380())
				return false;
		}
		return true;
	}

	boolean method4483() {
		int i = ((Class363) this).aVector4459.size();
		for (int i_23_ = 0; i_23_ < i; i_23_++) {
			if (!((Class351) ((Class363) this).aVector4459.elementAt(i_23_)).method4380())
				return false;
		}
		return true;
	}

	boolean method4484(Vector vector, int i, Class351 class351) {
		if (class351.method4388() || class351.method4405()) {
			vector.insertElementAt(class351, i);
			class351.method4378(((Class363) this).anInt4453, ((Class363) this).anInt4454);
			int i_24_ = class351.method4383();
			if (i_24_ > ((Class363) this).anInt4462)
				((Class363) this).anInt4462 = i_24_;
			((Class351) class351).aBool4396 = true;
			return true;
		}
		return false;
	}

	void method4485(Class351 class351) {
		class351.method4394();
		((Class351) class351).aBool4396 = false;
		((Class363) this).aVector4459.removeElement(class351);
	}
}

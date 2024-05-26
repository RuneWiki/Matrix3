package game;

/* Class572_Sub12_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub12_Sub7 extends Class572_Sub12 {
	Class99[] aClass99Array11373;
	int anInt11374;
	byte[][] aByteArrayArray11375;
	static Class248 aClass248_11376;

	public boolean method10314(int i) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1279);
	}

	public boolean method10315(int i) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1280);
	}

	public boolean method10316(int i, int i_0_) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1278);
	}

	public boolean method10317(int i, int i_1_) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1279);
	}

	public boolean method10318(int i, int i_2_) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1280);
	}

	public boolean method10319() {
		if (null != ((Class572_Sub12_Sub7) this).aClass99Array11373)
			return true;
		if (((Class572_Sub12_Sub7) this).aByteArrayArray11375 == null) {
			synchronized (aClass248_11376) {
				if (!aClass248_11376.method3370((1024648081 * ((Class572_Sub12_Sub7) this).anInt11374), -1695508002)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass248_11376.method3374((((Class572_Sub12_Sub7) this).anInt11374) * 1024648081, 1363298864);
				((Class572_Sub12_Sub7) this).aByteArrayArray11375 = new byte[is.length][];
				for (int i = 0; i < is.length; i++)
					((Class572_Sub12_Sub7) this).aByteArrayArray11375[i] = aClass248_11376.getFile((1024648081 * ((Class572_Sub12_Sub7) this).anInt11374), is[i], -428460615);
			}
		}
		boolean bool = true;
		for (int i = 0; i < ((Class572_Sub12_Sub7) this).aByteArrayArray11375.length; i++) {
			byte[] is = ((Class572_Sub12_Sub7) this).aByteArrayArray11375[i];
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			class572_sub15.o = 310393755;
			int i_3_ = class572_sub15.readUnsignedShort(647518597);
			synchronized (Class320.aClass248_3894) {
				bool &= Class320.aClass248_3894.method3383(i_3_, 838820899);
			}
		}
		if (!bool)
			return false;
		Class675 class675 = new Class675();
		int[] is;
		synchronized (aClass248_11376) {
			int i = aClass248_11376.method3376((((Class572_Sub12_Sub7) this).anInt11374) * 1024648081, -719010962);
			((Class572_Sub12_Sub7) this).aClass99Array11373 = new Class99[i];
			is = aClass248_11376.method3374(1024648081 * ((Class572_Sub12_Sub7) this).anInt11374, 1176995830);
		}
		for (int i = 0; i < is.length; i++) {
			byte[] is_4_ = ((Class572_Sub12_Sub7) this).aByteArrayArray11375[i];
			RSByteBuffer class572_sub15 = new RSByteBuffer(is_4_);
			class572_sub15.o = 310393755;
			int i_5_ = class572_sub15.readUnsignedShort(647518597);
			Class572_Sub23 class572_sub23 = null;
			for (Class572_Sub23 class572_sub23_6_ = (Class572_Sub23) class675.method7932((byte) 50); null != class572_sub23_6_; class572_sub23_6_ = (Class572_Sub23) class675.method7926(1239266521)) {
				if (254746401 * ((Class572_Sub23) class572_sub23_6_).anInt9194 == i_5_) {
					class572_sub23 = class572_sub23_6_;
					break;
				}
			}
			if (class572_sub23 == null) {
				synchronized (Class320.aClass248_3894) {
					class572_sub23 = new Class572_Sub23(i_5_, (Class320.aClass248_3894.method3373(i_5_, (byte) -69)));
				}
				class675.method7940(class572_sub23, -2022512232);
			}
			((Class572_Sub12_Sub7) this).aClass99Array11373[is[i]] = new Class99(is_4_, class572_sub23);
		}
		((Class572_Sub12_Sub7) this).aByteArrayArray11375 = null;
		return true;
	}

	public boolean method10320() {
		if (null != ((Class572_Sub12_Sub7) this).aClass99Array11373)
			return true;
		if (((Class572_Sub12_Sub7) this).aByteArrayArray11375 == null) {
			synchronized (aClass248_11376) {
				if (!aClass248_11376.method3370((1024648081 * ((Class572_Sub12_Sub7) this).anInt11374), 1881227310)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass248_11376.method3374((((Class572_Sub12_Sub7) this).anInt11374) * 1024648081, 2117694286);
				((Class572_Sub12_Sub7) this).aByteArrayArray11375 = new byte[is.length][];
				for (int i = 0; i < is.length; i++)
					((Class572_Sub12_Sub7) this).aByteArrayArray11375[i] = aClass248_11376.getFile((1024648081 * ((Class572_Sub12_Sub7) this).anInt11374), is[i], -130952071);
			}
		}
		boolean bool = true;
		for (int i = 0; i < ((Class572_Sub12_Sub7) this).aByteArrayArray11375.length; i++) {
			byte[] is = ((Class572_Sub12_Sub7) this).aByteArrayArray11375[i];
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			class572_sub15.o = 310393755;
			int i_7_ = class572_sub15.readUnsignedShort(647518597);
			synchronized (Class320.aClass248_3894) {
				bool &= Class320.aClass248_3894.method3383(i_7_, -1320180268);
			}
		}
		if (!bool)
			return false;
		Class675 class675 = new Class675();
		int[] is;
		synchronized (aClass248_11376) {
			int i = aClass248_11376.method3376((((Class572_Sub12_Sub7) this).anInt11374) * 1024648081, -818268739);
			((Class572_Sub12_Sub7) this).aClass99Array11373 = new Class99[i];
			is = aClass248_11376.method3374(1024648081 * ((Class572_Sub12_Sub7) this).anInt11374, 1314420471);
		}
		for (int i = 0; i < is.length; i++) {
			byte[] is_8_ = ((Class572_Sub12_Sub7) this).aByteArrayArray11375[i];
			RSByteBuffer class572_sub15 = new RSByteBuffer(is_8_);
			class572_sub15.o = 310393755;
			int i_9_ = class572_sub15.readUnsignedShort(647518597);
			Class572_Sub23 class572_sub23 = null;
			for (Class572_Sub23 class572_sub23_10_ = (Class572_Sub23) class675.method7932((byte) 50); null != class572_sub23_10_; class572_sub23_10_ = (Class572_Sub23) class675.method7926(1786310357)) {
				if (254746401 * ((Class572_Sub23) class572_sub23_10_).anInt9194 == i_9_) {
					class572_sub23 = class572_sub23_10_;
					break;
				}
			}
			if (class572_sub23 == null) {
				synchronized (Class320.aClass248_3894) {
					class572_sub23 = new Class572_Sub23(i_9_, Class320.aClass248_3894.method3373(i_9_, (byte) 0));
				}
				class675.method7940(class572_sub23, -1827490434);
			}
			((Class572_Sub12_Sub7) this).aClass99Array11373[is[i]] = new Class99(is_8_, class572_sub23);
		}
		((Class572_Sub12_Sub7) this).aByteArrayArray11375 = null;
		return true;
	}

	public boolean method10321(int i) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1278);
	}

	public boolean method10322(int i) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1278);
	}

	public boolean method10323(int i) {
		if (null != ((Class572_Sub12_Sub7) this).aClass99Array11373)
			return true;
		if (((Class572_Sub12_Sub7) this).aByteArrayArray11375 == null) {
			synchronized (aClass248_11376) {
				if (!aClass248_11376.method3370((1024648081 * ((Class572_Sub12_Sub7) this).anInt11374), -2043167252)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass248_11376.method3374((((Class572_Sub12_Sub7) this).anInt11374) * 1024648081, 1478141552);
				((Class572_Sub12_Sub7) this).aByteArrayArray11375 = new byte[is.length][];
				for (int i_11_ = 0; i_11_ < is.length; i_11_++)
					((Class572_Sub12_Sub7) this).aByteArrayArray11375[i_11_] = aClass248_11376.getFile((1024648081 * ((Class572_Sub12_Sub7) this).anInt11374), is[i_11_], -148593130);
			}
		}
		boolean bool = true;
		for (int i_12_ = 0; i_12_ < ((Class572_Sub12_Sub7) this).aByteArrayArray11375.length; i_12_++) {
			byte[] is = ((Class572_Sub12_Sub7) this).aByteArrayArray11375[i_12_];
			RSByteBuffer class572_sub15 = new RSByteBuffer(is);
			class572_sub15.o = 310393755;
			int i_13_ = class572_sub15.readUnsignedShort(647518597);
			synchronized (Class320.aClass248_3894) {
				bool &= Class320.aClass248_3894.method3383(i_13_, 643051747);
			}
		}
		if (!bool)
			return false;
		Class675 class675 = new Class675();
		int[] is;
		synchronized (aClass248_11376) {
			int i_14_ = aClass248_11376.method3376((((Class572_Sub12_Sub7) this).anInt11374) * 1024648081, 1525767434);
			((Class572_Sub12_Sub7) this).aClass99Array11373 = new Class99[i_14_];
			is = aClass248_11376.method3374(1024648081 * ((Class572_Sub12_Sub7) this).anInt11374, 863188673);
		}
		for (int i_15_ = 0; i_15_ < is.length; i_15_++) {
			byte[] is_16_ = ((Class572_Sub12_Sub7) this).aByteArrayArray11375[i_15_];
			RSByteBuffer class572_sub15 = new RSByteBuffer(is_16_);
			class572_sub15.o = 310393755;
			int i_17_ = class572_sub15.readUnsignedShort(647518597);
			Class572_Sub23 class572_sub23 = null;
			for (Class572_Sub23 class572_sub23_18_ = (Class572_Sub23) class675.method7932((byte) 50); null != class572_sub23_18_; class572_sub23_18_ = (Class572_Sub23) class675.method7926(856470982)) {
				if (254746401 * ((Class572_Sub23) class572_sub23_18_).anInt9194 == i_17_) {
					class572_sub23 = class572_sub23_18_;
					break;
				}
			}
			if (class572_sub23 == null) {
				synchronized (Class320.aClass248_3894) {
					class572_sub23 = new Class572_Sub23(i_17_, (Class320.aClass248_3894.method3373(i_17_, (byte) -115)));
				}
				class675.method7940(class572_sub23, -1922775459);
			}
			((Class572_Sub12_Sub7) this).aClass99Array11373[is[i_15_]] = new Class99(is_16_, class572_sub23);
		}
		((Class572_Sub12_Sub7) this).aByteArrayArray11375 = null;
		return true;
	}

	public boolean method10324(int i) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1280);
	}

	public boolean method10325(int i) {
		return (((Class99) ((Class572_Sub12_Sub7) this).aClass99Array11373[i]).aBool1280);
	}

	public Class572_Sub12_Sub7(int i) {
		((Class572_Sub12_Sub7) this).anInt11374 = -881836687 * i;
	}
}

package game;

/* Class267 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class267 implements Runnable {
	Thread aThread2844;
	int anInt2845;
	Class664 aClass664_2846 = new Class664();
	boolean aBool2847;

	Class572_Sub12_Sub16_Sub3 method3634(int i, byte[] is, Class558 class558, byte i_0_) {
		Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3 = new Class572_Sub12_Sub16_Sub3();
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).anInt11770 = 737013002;
		class572_sub12_sub16_sub3.aLong9093 = -6500281269670471539L * (long) i;
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767 = is;
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aClass558_11772 = class558;
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aBool11475 = false;
		method3637(class572_sub12_sub16_sub3, 546019898);
		return class572_sub12_sub16_sub3;
	}

	Class572_Sub12_Sub16_Sub3 method3635(int i, Class558 class558, int i_1_) {
		Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3 = new Class572_Sub12_Sub16_Sub3();
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).anInt11770 = -1778977147;
		synchronized (((Class267) this).aClass664_2846) {
			for (Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3_2_ = ((Class572_Sub12_Sub16_Sub3) ((Class267) this).aClass664_2846.method7848(-1042067865)); class572_sub12_sub16_sub3_2_ != null; class572_sub12_sub16_sub3_2_ = ((Class572_Sub12_Sub16_Sub3) ((Class267) this).aClass664_2846.method7845(-886805155))) {
				if ((long) i == (-1521258394346526139L * class572_sub12_sub16_sub3_2_.aLong9093) && class558 == (((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3_2_).aClass558_11772) && 2 == -442461619 * (((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3_2_).anInt11770)) {
					((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767 = ((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3_2_).aByteArray11767;
					((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aBool11476 = false;
					Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3_3_ = class572_sub12_sub16_sub3;
					return class572_sub12_sub16_sub3_3_;
				}
			}
		}
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767 = class558.method6600(i, -1530742551);
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aBool11476 = false;
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aBool11475 = true;
		return class572_sub12_sub16_sub3;
	}

	public Class267() {
		((Class267) this).anInt2845 = 0;
		((Class267) this).aBool2847 = false;
		((Class267) this).aThread2844 = new Thread(this);
		((Class267) this).aThread2844.setDaemon(true);
		((Class267) this).aThread2844.start();
		((Class267) this).aThread2844.setPriority(1);
	}

	public void method3636() {
		((Class267) this).aBool2847 = true;
		synchronized (((Class267) this).aClass664_2846) {
			((Class267) this).aClass664_2846.notifyAll();
		}
		try {
			((Class267) this).aThread2844.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((Class267) this).aThread2844 = null;
	}

	void method3637(Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3, int i) {
		synchronized (((Class267) this).aClass664_2846) {
			((Class267) this).aClass664_2846.method7842(class572_sub12_sub16_sub3, 1418411572);
			((Class267) this).anInt2845 += -318956735;
			((Class267) this).aClass664_2846.notifyAll();
		}
	}

	public void run() {
		while (!((Class267) this).aBool2847) {
			Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3;
			synchronized (((Class267) this).aClass664_2846) {
				class572_sub12_sub16_sub3 = (Class572_Sub12_Sub16_Sub3) ((Class267) this).aClass664_2846.method7843(1199566853);
				if (null != class572_sub12_sub16_sub3)
					((Class267) this).anInt2845 -= -318956735;
				else {
					try {
						((Class267) this).aClass664_2846.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == -442461619 * ((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).anInt11770)
					((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aClass558_11772.method6594((int) (-1521258394346526139L * class572_sub12_sub16_sub3.aLong9093), ((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767, ((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767.length, (byte) 87);
				else if (3 == (((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).anInt11770 * -442461619))
					((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767 = (((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aClass558_11772.method6600((int) (-1521258394346526139L * class572_sub12_sub16_sub3.aLong9093), -1530742551));
			} catch (Exception exception) {
				Class640.method7592(null, exception, 428164583);
			}
			((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aBool11476 = false;
		}
	}

	public int method3638(int i) {
		synchronized (((Class267) this).aClass664_2846) {
			int i_4_ = -929729343 * ((Class267) this).anInt2845;
			return i_4_;
		}
	}

	public void method3639(byte i) {
		((Class267) this).aBool2847 = true;
		synchronized (((Class267) this).aClass664_2846) {
			((Class267) this).aClass664_2846.notifyAll();
		}
		try {
			((Class267) this).aThread2844.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((Class267) this).aThread2844 = null;
	}

	public void method3640() {
		while (!((Class267) this).aBool2847) {
			Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3;
			synchronized (((Class267) this).aClass664_2846) {
				class572_sub12_sub16_sub3 = ((Class572_Sub12_Sub16_Sub3) ((Class267) this).aClass664_2846.method7843(21398475));
				if (null != class572_sub12_sub16_sub3)
					((Class267) this).anInt2845 -= -318956735;
				else {
					try {
						((Class267) this).aClass664_2846.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
			}
			try {
				if (2 == -442461619 * ((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).anInt11770)
					((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aClass558_11772.method6594((int) (-1521258394346526139L * class572_sub12_sub16_sub3.aLong9093), ((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767, ((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767.length, (byte) 100);
				else if (3 == (((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).anInt11770 * -442461619))
					((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aByteArray11767 = (((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aClass558_11772.method6600((int) (-1521258394346526139L * class572_sub12_sub16_sub3.aLong9093), -1530742551));
			} catch (Exception exception) {
				Class640.method7592(null, exception, 1580571323);
			}
			((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aBool11476 = false;
		}
	}

	public void method3641() {
		((Class267) this).aBool2847 = true;
		synchronized (((Class267) this).aClass664_2846) {
			((Class267) this).aClass664_2846.notifyAll();
		}
		try {
			((Class267) this).aThread2844.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((Class267) this).aThread2844 = null;
	}

	Class572_Sub12_Sub16_Sub3 method3642(int i, Class558 class558, int i_5_) {
		Class572_Sub12_Sub16_Sub3 class572_sub12_sub16_sub3 = new Class572_Sub12_Sub16_Sub3();
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).anInt11770 = -1041964145;
		class572_sub12_sub16_sub3.aLong9093 = (long) i * -6500281269670471539L;
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aClass558_11772 = class558;
		((Class572_Sub12_Sub16_Sub3) class572_sub12_sub16_sub3).aBool11475 = false;
		method3637(class572_sub12_sub16_sub3, 546019898);
		return class572_sub12_sub16_sub3;
	}

	public void method3643() {
		((Class267) this).aBool2847 = true;
		synchronized (((Class267) this).aClass664_2846) {
			((Class267) this).aClass664_2846.notifyAll();
		}
		try {
			((Class267) this).aThread2844.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((Class267) this).aThread2844 = null;
	}

	public void method3644() {
		((Class267) this).aBool2847 = true;
		synchronized (((Class267) this).aClass664_2846) {
			((Class267) this).aClass664_2846.notifyAll();
		}
		try {
			((Class267) this).aThread2844.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		((Class267) this).aThread2844 = null;
	}

	static final void method3645(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_6_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_7_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_7_ * i_6_;
	}

	static final void method3646(Cs2Executor class441, int i) {
		Class25.anInt193 = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) * 1887619625;
	}

	static final void method3647(Cs2Executor class441, short i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class13.anInt113 * 1539080107;
	}

	static final void method3648(Cs2Executor class441, int i) {
		Class300.method3992((byte) 6);
	}

	static final void method3649(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_8_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_9_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		int i_10_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 2]);
		Class385.method4663(10, i_8_ << 16 | i_9_, i_10_, "", (byte) -104);
	}

	static void method3650(byte[] is, int i) {
		RSByteBuffer class572_sub15 = new RSByteBuffer(is);
		for (;;) {
			int i_11_ = class572_sub15.readUnsignedByte(812840201);
			if (0 == i_11_)
				break;
			if (i_11_ == 1) {
				int i_12_ = class572_sub15.readUnsignedShort(647518597);
				Class344.audio.setCurrentMusicId(i_12_, 1445669086);
			}
		}
	}

	static void method3651(Class106 class106, int i, int i_13_, InterfaceDefinitions class73, Class167 class167, int i_14_, int i_15_, int i_16_) {
		for (int i_17_ = 0; i_17_ < 765313669 * client.anInt8625; i_17_++) {
			LinkableObject class572_sub9 = ((LinkableObject) client.aClass676_8622.get((long) client.anIntArray8626[i_17_]));
			if (null != class572_sub9) {
				NPC class456_sub1_sub2_sub3_sub1 = ((NPC) class572_sub9.anObject9081);
				if (class456_sub1_sub2_sub3_sub1.method10683((byte) 16) && (class456_sub1_sub2_sub3_sub1.aByte9009 == (Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.aByte9009))) {
					NPCDefintion class410 = class456_sub1_sub2_sub3_sub1.aClass410_11803;
					if (null != class410 && class410.anIntArray4795 != null)
						class410 = class410.method4947((Class133_Sub23.playerVarsProvider), (Class133_Sub23.playerVarsProvider), 1950064700);
					if (null != class410 && class410.aBool4824 && class410.aBool4827) {
						Class240 class240 = (class456_sub1_sub2_sub3_sub1.method5394().aClass240_2647);
						int i_18_ = (int) class240.aFloat2653 / 128 - i / 128;
						int i_19_ = (int) class240.aFloat2657 / 128 - i_13_ / 128;
						if (-1 != class410.anInt4849 * -2058589363)
							Class102.method1638(class106, class167, class73, i_14_, i_15_, i_18_, i_19_, (class410.anInt4849 * -2058589363), 447670347);
						else
							Class561.method6631(class73, class167, i_14_, i_15_, i_18_, i_19_, (Class628_Sub1.aClass161Array9537[1]), -865093257);
					}
				}
			}
		}
	}

	static final void method3652(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class1.method472(class73, class83, class441, 1317465624);
	}

	static void method3653(int i, int i_20_, boolean bool, byte i_21_) {
		Class406.aBoolArrayArray4764[i][i_20_] = bool;
	}
}

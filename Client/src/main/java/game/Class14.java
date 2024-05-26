package game;

/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class14 implements Runnable {
	InetAddress anInetAddress119;
	String ip;
	volatile long aLong121 = 3136452088618277049L;
	volatile boolean aBool122 = true;
	public static Class161[] aClass161Array123;

	public void run() {
		while (((Class14) this).aBool122)
			method627(-71733538);
	}

	void method622(String string, int i) {
		((Class14) this).ip = string;
		((Class14) this).anInetAddress119 = null;
		((Class14) this).aLong121 = 3136452088618277049L;
		if (null != ((Class14) this).ip) {
			try {
				((Class14) this).anInetAddress119 = InetAddress.getByName(((Class14) this).ip);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	long method623(byte i) {
		return 4823900894485500535L * ((Class14) this).aLong121;
	}

	void method624(byte i) {
		((Class14) this).aBool122 = false;
	}

	long method625() {
		return 4823900894485500535L * ((Class14) this).aLong121;
	}

	void method626() {
		if (null != ((Class14) this).anInetAddress119) {
			try {
				byte[] is = ((Class14) this).anInetAddress119.getAddress();
				((Class14) this).aLong121 = (long) Ping.method764(is[0], is[1], is[2], is[3], 10000L) * -3136452088618277049L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class198.method2977(1000L);
	}

	void method627(int i) {
		if (null != ((Class14) this).anInetAddress119) {
			try {
				byte[] is = ((Class14) this).anInetAddress119.getAddress();
				((Class14) this).aLong121 = (long) Ping.method764(is[0], is[1], is[2], is[3], 10000L) * -3136452088618277049L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class198.method2977(1000L);
	}

	void method628(String string) {
		((Class14) this).ip = string;
		((Class14) this).anInetAddress119 = null;
		((Class14) this).aLong121 = 3136452088618277049L;
		if (null != ((Class14) this).ip) {
			try {
				((Class14) this).anInetAddress119 = InetAddress.getByName(((Class14) this).ip);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	void method629() {
		if (null != ((Class14) this).anInetAddress119) {
			try {
				byte[] is = ((Class14) this).anInetAddress119.getAddress();
				((Class14) this).aLong121 = (long) Ping.method764(is[0], is[1], is[2], is[3], 10000L) * -3136452088618277049L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class198.method2977(1000L);
	}

	void method630() {
		((Class14) this).aBool122 = false;
	}

	void method631() {
		((Class14) this).aBool122 = false;
	}

	void method632() {
		((Class14) this).aBool122 = false;
	}

	void method633() {
		((Class14) this).aBool122 = false;
	}

	void method634() {
		if (null != ((Class14) this).anInetAddress119) {
			try {
				byte[] is = ((Class14) this).anInetAddress119.getAddress();
				((Class14) this).aLong121 = (long) Ping.method764(is[0], is[1], is[2], is[3], 10000L) * -3136452088618277049L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class198.method2977(1000L);
	}

	Class14() {
		/* empty */
	}

	void method635() {
		if (null != ((Class14) this).anInetAddress119) {
			try {
				byte[] is = ((Class14) this).anInetAddress119.getAddress();
				((Class14) this).aLong121 = (long) Ping.method764(is[0], is[1], is[2], is[3], 10000L) * -3136452088618277049L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class198.method2977(1000L);
	}

	void method636(String string) {
		((Class14) this).ip = string;
		((Class14) this).anInetAddress119 = null;
		((Class14) this).aLong121 = 3136452088618277049L;
		if (null != ((Class14) this).ip) {
			try {
				((Class14) this).anInetAddress119 = InetAddress.getByName(((Class14) this).ip);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	public void method637() {
		while (((Class14) this).aBool122)
			method627(-71733538);
	}

	static boolean method638(int i, int i_0_, int i_1_, int i_2_) {
		Class523 class523 = client.aClass613_8605.method7285(1725050946);
		boolean bool = true;
		Interface65 interface65 = (Interface65) class523.method6277(i, i_0_, i_1_, -1412652462);
		if (interface65 != null)
			bool &= Class185.method2843(interface65, -2122328100);
		interface65 = (Interface65) class523.method6246(i, i_0_, i_1_, client.anInterface62_8873, (byte) 1);
		if (interface65 != null)
			bool &= Class185.method2843(interface65, -1989670189);
		interface65 = (Interface65) class523.method6254(i, i_0_, i_1_, 454415565);
		if (null != interface65)
			bool &= Class185.method2843(interface65, -2011890616);
		return bool;
	}

	static final void method639(Class572_Sub15_Sub2 class572_sub15_sub2, byte i) {
		for (int i_3_ = 0; i_3_ < -1531501593 * Class184.anInt2164; i_3_++) {
			class572_sub15_sub2.readUnsignedShort(647518597);
			int i_4_ = Class184.anIntArray2156[i_3_];
			Player class456_sub1_sub2_sub3_sub2 = client.aClass456_Sub1_Sub2_Sub3_Sub2Array8727[i_4_];
			int i_5_ = class572_sub15_sub2.readUnsignedByte(69631005);
			if ((i_5_ & 0x20) != 0)
				i_5_ += class572_sub15_sub2.readUnsignedByte(1216871642) << 8;
			if ((i_5_ & 0x4000) != 0)
				i_5_ += class572_sub15_sub2.readUnsignedByte(280111541) << 16;
			Class63.decodePlayerMask(class572_sub15_sub2, i_4_, class456_sub1_sub2_sub3_sub2, i_5_, -762168410);
		}
	}

	public static void method640(Player class456_sub1_sub2_sub3_sub2, int i) {
		Class572_Sub27 class572_sub27 = ((Class572_Sub27) (Class572_Sub27.aClass676_9262.get((long) (-821391465 * class456_sub1_sub2_sub3_sub2.anInt11633))));
		if (null == class572_sub27)
			Class617.method7399(class456_sub1_sub2_sub3_sub2.aByte9009, (class456_sub1_sub2_sub3_sub2.screenX[0]), (class456_sub1_sub2_sub3_sub2.screenY[0]), 0, null, null, class456_sub1_sub2_sub3_sub2, -1971644996);
		else
			class572_sub27.method8631((short) 9790);
	}

	static final void method641(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (((Cs2Executor) class441).current.anObjectArray11384[-1280867039 * ((Cs2Executor) class441).instrPtr]);
	}
}

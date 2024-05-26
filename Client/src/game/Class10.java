package game;

/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class Class10 implements Runnable {
	Thread aThread45;
	volatile boolean aBool46;
	Queue aQueue47 = new LinkedList();
	public static RSSocket aClass641_48;

	void method534() {
		((Class10) this).aBool46 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			((Class10) this).aThread45.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	Class10() {
		((Class10) this).aThread45 = new Thread(this);
		((Class10) this).aThread45.setPriority(1);
		((Class10) this).aThread45.start();
	}

	public void run() {
		while (!((Class10) this).aBool46) {
			try {
				Class185 class185;
				synchronized (this) {
					class185 = (Class185) ((Class10) this).aQueue47.poll();
					if (class185 == null) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = ((Class185) class185).anURL2169.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						((Class185) class185).aByteArray2170 = is;
					}
					((Class185) class185).aBool2168 = true;
				} catch (IOException ioexception) {
					((Class185) class185).aBool2168 = true;
				}
			} catch (Exception exception) {
				Class640.method7592(null, exception, 1195688825);
			}
		}
	}

	Class185 method535(URL url, int i) {
		Class185 class185 = new Class185(url);
		synchronized (this) {
			((Class10) this).aQueue47.add(class185);
			this.notify();
		}
		return class185;
	}

	public void method536() {
		while (!((Class10) this).aBool46) {
			try {
				Class185 class185;
				synchronized (this) {
					class185 = (Class185) ((Class10) this).aQueue47.poll();
					if (class185 == null) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
						continue;
					}
				}
				try {
					URLConnection urlconnection = ((Class185) class185).anURL2169.openConnection();
					urlconnection.setConnectTimeout(30000);
					int i = urlconnection.getContentLength();
					if (i >= 0) {
						byte[] is = new byte[i];
						new DataInputStream(urlconnection.getInputStream()).readFully(is);
						((Class185) class185).aByteArray2170 = is;
					}
					((Class185) class185).aBool2168 = true;
				} catch (IOException ioexception) {
					((Class185) class185).aBool2168 = true;
				}
			} catch (Exception exception) {
				Class640.method7592(null, exception, 1728221903);
			}
		}
	}

	void method537(int i) {
		((Class10) this).aBool46 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			((Class10) this).aThread45.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	static void method538(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = ((Class386) Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]), 1572740767)).aString4618;
	}

	static final void method539(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (string.startsWith(Class520.method6215(0, 2009472133)) || string.startsWith(Class520.method6215(1, 2009472133)))
			string = string.substring(7);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class534.method6374(string, -1457053895);
	}

	public static void method540(int i) {
		if (835742603 * client.anInt8580 == 12 && (!Class574.method6808(1080023683) && !Class665_Sub26.method9099(-1720150724)))
			Class463.method5478(0, 371653737);
	}

	static final void method541(Cs2Executor class441, byte i) {
		int i_0_ = client.aClass676_8760.method7962((byte) 0);
		if (-1 != -507155049 * client.anInt8790)
			i_0_++;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_0_;
	}

	static final void method542(Cs2Executor class441, short i) {
		((Cs2Executor) class441).longStack[(((Cs2Executor) class441).longStackPtr += -879214973) * 1097105451 - 1] = ((Long) (((Cs2Executor) class441).current.anObjectArray11384[-1280867039 * ((Cs2Executor) class441).instrPtr])).longValue();
	}

	static void method543(Class106 class106, int i, int i_1_, int i_2_, int i_3_, int i_4_, Class102 class102, Class284 class284, String string, int i_5_) {
		int i_6_ = (255 - Class165.anInt2049 * -17690167 - Class25.anInt192 * -1133431687);
		if (i_6_ < 0)
			i_6_ = 0;
		if (null == Class195.aClass161_2346 || Class191.aClass161_2294 == null) {
			if (Class582.aClass248_7725.method3383(Class48.anInt472 * -922999611, -1427874160) && Class582.aClass248_7725.method3383((-230978565 * Class398.anInt4718), -254222873)) {
				Class195.aClass161_2346 = (class106.method1711(Class160.method2571(Class582.aClass248_7725, Class48.anInt472 * -922999611, 0), true));
				Class87 class87 = Class160.method2571(Class582.aClass248_7725, -230978565 * Class398.anInt4718, 0);
				Class191.aClass161_2294 = class106.method1711(class87, true);
				class87.method1296();
				Class54.aClass161_523 = class106.method1711(class87, true);
			} else
				class106.method1725(i, i_1_, i_2_, i_4_, (i_6_ << 24 | Class133_Sub22.anInt10362 * 490644529), 1);
		}
		if (Class195.aClass161_2346 != null && Class191.aClass161_2294 != null) {
			int i_7_ = ((i_2_ - Class191.aClass161_2294.method2587() * 2) / Class195.aClass161_2346.method2587());
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				Class195.aClass161_2346.method2595((i + Class191.aClass161_2294.method2587() + i_8_ * Class195.aClass161_2346.method2587()), i_1_);
			Class191.aClass161_2294.method2595(i, i_1_);
			Class54.aClass161_523.method2595(i + i_2_ - Class54.aClass161_523.method2587(), i_1_);
		}
		class102.method1620(string, 3 + i, (-801958417 * class284.anInt3412 + i_1_ + (20 - -801958417 * class284.anInt3412) / 2), -1016769863 * Class390.anInt4657 | ~0xffffff, -1, 1715475186);
		class106.method1725(i, i_1_ + i_4_, i_2_, i_3_ - i_4_, i_6_ << 24 | 490644529 * Class133_Sub22.anInt10362, 1);
	}

	static void method544(byte i) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(14, 0L);
		class572_sub12_sub11.method10384(-1924013241);
	}

	static void method545(Class668 class668, int i) {
		Class448.aClass668_5165 = class668;
		Class16.aString134 = null;
	}

	public static void method546(String string, short i) {
		if (835742603 * client.anInt8580 == 6) {
			Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3758, client.aClass195_8632.aClass650_2340, 520168026);
			class572_sub25.aRsByteBuffer.writeShort(0, -1635779318);
			int i_9_ = (-1585139053 * class572_sub25.aRsByteBuffer.o);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -82);
			class572_sub25.aRsByteBuffer.o += -2122211011;
			class572_sub25.aRsByteBuffer.method8489(Class246.anIntArray2684, i_9_, (class572_sub25.aRsByteBuffer.o * -1585139053), 2096279445);
			class572_sub25.aRsByteBuffer.method8464((-1585139053 * class572_sub25.aRsByteBuffer.o) - i_9_, -1404479454);
			client.aClass195_8632.method2929(class572_sub25, (byte) -109);
			Class16.aClass667_132 = Class667.aClass667_8506;
		}
	}
}

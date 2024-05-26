package game;

/* Class602 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;
import java.util.LinkedList;

public class Class602 implements Runnable {
	Class613 aClass613_7875;
	LinkedList aLinkedList7876;
	volatile boolean aBool7877 = false;
	public static Clipboard aClipboard7878;

	public Class602() {
		((Class602) this).aLinkedList7876 = new LinkedList();
		((Class602) this).aClass613_7875 = new Class613(true);
	}

	public void method7075(Class639_Sub16 class639_sub16, byte i) {
		((Class602) this).aClass613_7875.method7294(class639_sub16, (byte) 63);
	}

	public void method7076(Class598 class598, int i) {
		synchronized (((Class602) this).aLinkedList7876) {
			((Class602) this).aLinkedList7876.add(class598);
			((Class602) this).aLinkedList7876.notify();
		}
	}

	public boolean method7077(byte i) {
		return ((Class602) this).aBool7877;
	}

	public Class613 method7078(int i) {
		return ((Class602) this).aClass613_7875;
	}

	public void run() {
		for (;;)
			method7080(2113457088);
	}

	void method7079() {
		Object object = null;
		Class598 class598;
		synchronized (((Class602) this).aLinkedList7876) {
			try {
				((Class602) this).aLinkedList7876.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class598 = (Class598) ((Class602) this).aLinkedList7876.pollFirst();
		}
		do {
			try {
				try {
					if (null != class598) {
						((Class602) this).aBool7877 = true;
						method7087(class598, -630068239);
					}
				} catch (Exception exception) {
					((Class602) this).aBool7877 = false;
					break;
				}
				((Class602) this).aBool7877 = false;
			} catch (Exception object_0_) {
				((Class602) this).aBool7877 = false;
				try {
					throw object_0_;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	void method7080(int i) {
		Object object = null;
		Class598 class598;
		synchronized (((Class602) this).aLinkedList7876) {
			try {
				((Class602) this).aLinkedList7876.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class598 = (Class598) ((Class602) this).aLinkedList7876.pollFirst();
		}
		do {
			try {
				try {
					if (null != class598) {
						((Class602) this).aBool7877 = true;
						method7087(class598, -1154687561);
					}
				} catch (Exception exception) {
					((Class602) this).aBool7877 = false;
					break;
				}
				((Class602) this).aBool7877 = false;
			} catch (Exception object_1_) {
				((Class602) this).aBool7877 = false;
				try {
					throw object_1_;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	void method7081() {
		Object object = null;
		Class598 class598;
		synchronized (((Class602) this).aLinkedList7876) {
			try {
				((Class602) this).aLinkedList7876.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class598 = (Class598) ((Class602) this).aLinkedList7876.pollFirst();
		}
		do {
			try {
				try {
					if (null != class598) {
						((Class602) this).aBool7877 = true;
						method7087(class598, -1376794572);
					}
				} catch (Exception exception) {
					((Class602) this).aBool7877 = false;
					break;
				}
				((Class602) this).aBool7877 = false;
			} catch (Exception object_2_) {
				((Class602) this).aBool7877 = false;
				try {
					throw object_2_;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	public boolean method7082() {
		return ((Class602) this).aBool7877;
	}

	public boolean method7083() {
		return ((Class602) this).aBool7877;
	}

	public void method7084() {
		for (;;)
			method7080(1668000675);
	}

	public boolean method7085() {
		return ((Class602) this).aBool7877;
	}

	void method7086(Class613 class613, int i) {
		((Class602) this).aClass613_7875 = class613;
	}

	void method7087(Class598 class598, int i) {
		if (((Class598) class598).aClass569_7849 == Class569.aClass569_6389)
			((Class602) this).aClass613_7875.method7302(180484463);
		else
			((Class602) this).aClass613_7875.method7348(class598, -951391255);
		for (boolean bool = ((Class602) this).aClass613_7875.method7311(1366002127); !bool; bool = ((Class602) this).aClass613_7875.method7311(1255942897)) {
			/* empty */
		}
		((Class602) this).aClass613_7875.method7297((byte) 0);
		client.aClass613_8605.method7297((byte) 0);
	}

	static Class422[] method7088(int i) {
		return (new Class422[] { Class422.aClass422_4982, Class422.aClass422_4985, Class422.aClass422_4983, Class422.aClass422_4979, Class422.aClass422_4984, Class422.aClass422_4974,
			Class422.aClass422_4973, Class422.aClass422_4977, Class422.aClass422_4971, Class422.aClass422_4972, Class422.aClass422_4976, Class422.aClass422_4986, Class422.aClass422_4978,
			Class422.aClass422_4981, Class422.aClass422_4975 });
	}

	static final void method7089(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1393929271 * class73.anInt804;
	}

	static final void method7090(Cs2Executor class441, byte i) {
		int i_3_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = client.exchangeSlots[i_3_].anInt7819 * 894952557;
	}

	static final void method7091(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub32_9202.method9153(-384993080);
	}

	static final void method7092(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, -1874946375) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray746 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	static final void method7093(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (null != client.aString8887 && i_4_ < Class456_Sub1_Sub1_Sub1.anInt11558 * 1174928641)
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = Class328.aClass196Array4209[i_4_].aString2352;
		else
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
	}
}

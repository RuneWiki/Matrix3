package game;

/* Class549_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class549_Sub1 extends Class549 implements KeyListener, FocusListener {
	static final int anInt8895 = 128;
	static final int anInt8896 = 112;
	Class675 aClass675_8897 = new Class675();
	Class675 aClass675_8898 = new Class675();
	boolean[] aBoolArray8899 = new boolean[112];
	Component aComponent8900;
	static int[] anIntArray8901 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0,
		0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16,
		17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0,
		0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	public synchronized void method8079(FocusEvent focusevent) {
		method8081(-1, '\0', 0, 163698746);
	}

	void method8080(Component component, byte i) {
		method8094(-1326804180);
		((Class549_Sub1) this).aComponent8900 = component;
		((Class549_Sub1) this).aComponent8900.addKeyListener(this);
		((Class549_Sub1) this).aComponent8900.addFocusListener(this);
	}

	void method8081(int i, char c, int i_0_, int i_1_) {
		Class572_Sub22 class572_sub22 = new Class572_Sub22();
		((Class572_Sub22) class572_sub22).anInt9174 = -347081003 * i;
		((Class572_Sub22) class572_sub22).aChar9173 = c;
		((Class572_Sub22) class572_sub22).anInt9177 = i_0_ * -1002795171;
		((Class572_Sub22) class572_sub22).aLong9176 = Class69.method1067(-2058930132) * -2382711386834828095L;
		((Class549_Sub1) this).aClass675_8898.method7940(class572_sub22, -1633437698);
	}

	public Interface64 method6515(byte i) {
		return ((Interface64) ((Class549_Sub1) this).aClass675_8897.method7920(-1945803963));
	}

	int method8082() {
		int i = 0;
		if (((Class549_Sub1) this).aBoolArray8899[81])
			i |= 0x1;
		if (((Class549_Sub1) this).aBoolArray8899[82])
			i |= 0x4;
		if (((Class549_Sub1) this).aBoolArray8899[86])
			i |= 0x2;
		return i;
	}

	Class549_Sub1(Component component) {
		Class563.method6650((short) 23779);
		method8080(component, (byte) 18);
	}

	int method8083(int i) {
		int i_2_ = 0;
		if (((Class549_Sub1) this).aBoolArray8899[81])
			i_2_ |= 0x1;
		if (((Class549_Sub1) this).aBoolArray8899[82])
			i_2_ |= 0x4;
		if (((Class549_Sub1) this).aBoolArray8899[86])
			i_2_ |= 0x2;
		return i_2_;
	}

	public void method6523(int i) {
		method8094(-146543084);
	}

	void method8084(KeyEvent keyevent, int i, byte i_3_) {
		int i_4_ = keyevent.getKeyCode();
		if (i_4_ != 0) {
			if (i_4_ >= 0 && i_4_ < anIntArray8901.length) {
				i_4_ = anIntArray8901[i_4_];
				if (0 == i && (i_4_ & 0x80) != 0)
					i_4_ = 0;
				else
					i_4_ &= ~0x80;
			} else
				i_4_ = 0;
		} else
			i_4_ = 0;
		if (i_4_ != 0) {
			method8081(i, '\uffff', i_4_, 402975210);
			keyevent.consume();
		}
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		method8084(keyevent, 0, (byte) -10);
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		method8084(keyevent, 1, (byte) -5);
	}

	public synchronized void keyTyped(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class461.method5468(c, (short) 616)) {
			method8081(3, c, -1, 14060024);
			keyevent.consume();
		}
	}

	public void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		method8081(-1, '\0', 0, -116056527);
	}

	public void method8085(FocusEvent focusevent) {
		/* empty */
	}

	public void method8086(FocusEvent focusevent) {
		/* empty */
	}

	void method8087() {
		if (((Class549_Sub1) this).aComponent8900 != null) {
			((Class549_Sub1) this).aComponent8900.removeKeyListener(this);
			((Class549_Sub1) this).aComponent8900.removeFocusListener(this);
			((Class549_Sub1) this).aComponent8900 = null;
			for (int i = 0; i < 112; i++)
				((Class549_Sub1) this).aBoolArray8899[i] = false;
			((Class549_Sub1) this).aClass675_8897.method7918(-1113867867);
			((Class549_Sub1) this).aClass675_8898.method7918(1650985146);
		}
	}

	void method8088() {
		if (((Class549_Sub1) this).aComponent8900 != null) {
			((Class549_Sub1) this).aComponent8900.removeKeyListener(this);
			((Class549_Sub1) this).aComponent8900.removeFocusListener(this);
			((Class549_Sub1) this).aComponent8900 = null;
			for (int i = 0; i < 112; i++)
				((Class549_Sub1) this).aBoolArray8899[i] = false;
			((Class549_Sub1) this).aClass675_8897.method7918(-1566877573);
			((Class549_Sub1) this).aClass675_8898.method7918(-825009074);
		}
	}

	public synchronized void method8089(FocusEvent focusevent) {
		method8081(-1, '\0', 0, 322533705);
	}

	static void method8090() {
		anIntArray8901[44] = 71;
		anIntArray8901[45] = 26;
		anIntArray8901[46] = 72;
		anIntArray8901[47] = 73;
		anIntArray8901[59] = 57;
		anIntArray8901[61] = 27;
		anIntArray8901[91] = 42;
		anIntArray8901[92] = 74;
		anIntArray8901[93] = 43;
		anIntArray8901[192] = 28;
		anIntArray8901[222] = 58;
		anIntArray8901[520] = 59;
	}

	static void method8091() {
		anIntArray8901[44] = 71;
		anIntArray8901[45] = 26;
		anIntArray8901[46] = 72;
		anIntArray8901[47] = 73;
		anIntArray8901[59] = 57;
		anIntArray8901[61] = 27;
		anIntArray8901[91] = 42;
		anIntArray8901[92] = 74;
		anIntArray8901[93] = 43;
		anIntArray8901[192] = 28;
		anIntArray8901[222] = 58;
		anIntArray8901[520] = 59;
	}

	public Interface64 method6517() {
		return ((Interface64) ((Class549_Sub1) this).aClass675_8897.method7920(-1945803963));
	}

	void method8092() {
		if (((Class549_Sub1) this).aComponent8900 != null) {
			((Class549_Sub1) this).aComponent8900.removeKeyListener(this);
			((Class549_Sub1) this).aComponent8900.removeFocusListener(this);
			((Class549_Sub1) this).aComponent8900 = null;
			for (int i = 0; i < 112; i++)
				((Class549_Sub1) this).aBoolArray8899[i] = false;
			((Class549_Sub1) this).aClass675_8897.method7918(969390271);
			((Class549_Sub1) this).aClass675_8898.method7918(-673208735);
		}
	}

	void method8093() {
		if (((Class549_Sub1) this).aComponent8900 != null) {
			((Class549_Sub1) this).aComponent8900.removeKeyListener(this);
			((Class549_Sub1) this).aComponent8900.removeFocusListener(this);
			((Class549_Sub1) this).aComponent8900 = null;
			for (int i = 0; i < 112; i++)
				((Class549_Sub1) this).aBoolArray8899[i] = false;
			((Class549_Sub1) this).aClass675_8897.method7918(2063093762);
			((Class549_Sub1) this).aClass675_8898.method7918(-424720083);
		}
	}

	void method8094(int i) {
		if (((Class549_Sub1) this).aComponent8900 != null) {
			((Class549_Sub1) this).aComponent8900.removeKeyListener(this);
			((Class549_Sub1) this).aComponent8900.removeFocusListener(this);
			((Class549_Sub1) this).aComponent8900 = null;
			for (int i_5_ = 0; i_5_ < 112; i_5_++)
				((Class549_Sub1) this).aBoolArray8899[i_5_] = false;
			((Class549_Sub1) this).aClass675_8897.method7918(-1786829062);
			((Class549_Sub1) this).aClass675_8898.method7918(-1487504702);
		}
	}

	public Interface64 method6516() {
		return ((Interface64) ((Class549_Sub1) this).aClass675_8897.method7920(-1945803963));
	}

	public synchronized void method6519() {
		((Class549_Sub1) this).aClass675_8897.method7918(-316360691);
		for (Class572_Sub22 class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963); class572_sub22 != null; class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963)) {
			((Class572_Sub22) class572_sub22).anInt9178 = method8083(-1708065875) * -1794774125;
			if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 0) {
				if (!((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)]) {
					Class572_Sub22 class572_sub22_6_ = new Class572_Sub22();
					((Class572_Sub22) class572_sub22_6_).anInt9174 = 0;
					((Class572_Sub22) class572_sub22_6_).aChar9173 = '\uffff';
					((Class572_Sub22) class572_sub22_6_).anInt9177 = 1 * ((Class572_Sub22) class572_sub22).anInt9177;
					((Class572_Sub22) class572_sub22_6_).aLong9176 = 1L * ((Class572_Sub22) class572_sub22).aLong9176;
					((Class572_Sub22) class572_sub22_6_).anInt9178 = ((Class572_Sub22) class572_sub22).anInt9178 * 1;
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_6_, -2039349483);
					((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)] = true;
				}
				((Class572_Sub22) class572_sub22).anInt9174 = -694162006;
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -2071150252);
			} else if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 1) {
				if (((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)]) {
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -2122927354);
					((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)] = false;
				}
			} else if (-1 == (((Class572_Sub22) class572_sub22).anInt9174 * -403467651)) {
				for (int i = 0; i < 112; i++) {
					if (((Class549_Sub1) this).aBoolArray8899[i]) {
						Class572_Sub22 class572_sub22_7_ = new Class572_Sub22();
						((Class572_Sub22) class572_sub22_7_).anInt9174 = -347081003;
						((Class572_Sub22) class572_sub22_7_).aChar9173 = '\uffff';
						((Class572_Sub22) class572_sub22_7_).anInt9177 = -1002795171 * i;
						((Class572_Sub22) class572_sub22_7_).aLong9176 = ((Class572_Sub22) class572_sub22).aLong9176 * 1L;
						((Class572_Sub22) class572_sub22_7_).anInt9178 = 1 * ((Class572_Sub22) class572_sub22).anInt9178;
						((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_7_, -1998585949);
						((Class549_Sub1) this).aBoolArray8899[i] = false;
					}
				}
			} else if (3 == (-403467651 * ((Class572_Sub22) class572_sub22).anInt9174))
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1725495115);
		}
	}

	public boolean method6518(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class549_Sub1) this).aBoolArray8899[i];
	}

	public boolean method6520(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class549_Sub1) this).aBoolArray8899[i];
	}

	public synchronized void method6513(int i) {
		((Class549_Sub1) this).aClass675_8897.method7918(-340010445);
		for (Class572_Sub22 class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963); class572_sub22 != null; class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963)) {
			((Class572_Sub22) class572_sub22).anInt9178 = method8083(-1135988573) * -1794774125;
			if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 0) {
				if (!((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)]) {
					Class572_Sub22 class572_sub22_8_ = new Class572_Sub22();
					((Class572_Sub22) class572_sub22_8_).anInt9174 = 0;
					((Class572_Sub22) class572_sub22_8_).aChar9173 = '\uffff';
					((Class572_Sub22) class572_sub22_8_).anInt9177 = 1 * ((Class572_Sub22) class572_sub22).anInt9177;
					((Class572_Sub22) class572_sub22_8_).aLong9176 = 1L * ((Class572_Sub22) class572_sub22).aLong9176;
					((Class572_Sub22) class572_sub22_8_).anInt9178 = ((Class572_Sub22) class572_sub22).anInt9178 * 1;
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_8_, -1642672558);
					((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)] = true;
				}
				((Class572_Sub22) class572_sub22).anInt9174 = -694162006;
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -2057109735);
			} else if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 1) {
				if (((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)]) {
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -2055533471);
					((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)] = false;
				}
			} else if (-1 == (((Class572_Sub22) class572_sub22).anInt9174 * -403467651)) {
				for (int i_9_ = 0; i_9_ < 112; i_9_++) {
					if (((Class549_Sub1) this).aBoolArray8899[i_9_]) {
						Class572_Sub22 class572_sub22_10_ = new Class572_Sub22();
						((Class572_Sub22) class572_sub22_10_).anInt9174 = -347081003;
						((Class572_Sub22) class572_sub22_10_).aChar9173 = '\uffff';
						((Class572_Sub22) class572_sub22_10_).anInt9177 = -1002795171 * i_9_;
						((Class572_Sub22) class572_sub22_10_).aLong9176 = ((Class572_Sub22) class572_sub22).aLong9176 * 1L;
						((Class572_Sub22) class572_sub22_10_).anInt9178 = 1 * ((Class572_Sub22) class572_sub22).anInt9178;
						((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_10_, -1928683118);
						((Class549_Sub1) this).aBoolArray8899[i_9_] = false;
					}
				}
			} else if (3 == (-403467651 * ((Class572_Sub22) class572_sub22).anInt9174))
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1769714259);
		}
	}

	public boolean method6521(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class549_Sub1) this).aBoolArray8899[i];
	}

	public synchronized void method6522() {
		((Class549_Sub1) this).aClass675_8897.method7918(1880675899);
		for (Class572_Sub22 class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963); class572_sub22 != null; class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963)) {
			((Class572_Sub22) class572_sub22).anInt9178 = method8083(-384372067) * -1794774125;
			if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 0) {
				if (!((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)]) {
					Class572_Sub22 class572_sub22_11_ = new Class572_Sub22();
					((Class572_Sub22) class572_sub22_11_).anInt9174 = 0;
					((Class572_Sub22) class572_sub22_11_).aChar9173 = '\uffff';
					((Class572_Sub22) class572_sub22_11_).anInt9177 = 1 * ((Class572_Sub22) class572_sub22).anInt9177;
					((Class572_Sub22) class572_sub22_11_).aLong9176 = 1L * ((Class572_Sub22) class572_sub22).aLong9176;
					((Class572_Sub22) class572_sub22_11_).anInt9178 = ((Class572_Sub22) class572_sub22).anInt9178 * 1;
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_11_, -1613942988);
					((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)] = true;
				}
				((Class572_Sub22) class572_sub22).anInt9174 = -694162006;
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1837621966);
			} else if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 1) {
				if (((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)]) {
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1662697719);
					((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)] = false;
				}
			} else if (-1 == (((Class572_Sub22) class572_sub22).anInt9174 * -403467651)) {
				for (int i = 0; i < 112; i++) {
					if (((Class549_Sub1) this).aBoolArray8899[i]) {
						Class572_Sub22 class572_sub22_12_ = new Class572_Sub22();
						((Class572_Sub22) class572_sub22_12_).anInt9174 = -347081003;
						((Class572_Sub22) class572_sub22_12_).aChar9173 = '\uffff';
						((Class572_Sub22) class572_sub22_12_).anInt9177 = -1002795171 * i;
						((Class572_Sub22) class572_sub22_12_).aLong9176 = ((Class572_Sub22) class572_sub22).aLong9176 * 1L;
						((Class572_Sub22) class572_sub22_12_).anInt9178 = 1 * ((Class572_Sub22) class572_sub22).anInt9178;
						((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_12_, -1536832294);
						((Class549_Sub1) this).aBoolArray8899[i] = false;
					}
				}
			} else if (3 == (-403467651 * ((Class572_Sub22) class572_sub22).anInt9174))
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1503638952);
		}
	}

	int method8095() {
		int i = 0;
		if (((Class549_Sub1) this).aBoolArray8899[81])
			i |= 0x1;
		if (((Class549_Sub1) this).aBoolArray8899[82])
			i |= 0x4;
		if (((Class549_Sub1) this).aBoolArray8899[86])
			i |= 0x2;
		return i;
	}

	public void method8096(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void method6524() {
		((Class549_Sub1) this).aClass675_8897.method7918(1922228254);
		for (Class572_Sub22 class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963); class572_sub22 != null; class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963)) {
			((Class572_Sub22) class572_sub22).anInt9178 = method8083(-679751523) * -1794774125;
			if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 0) {
				if (!((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)]) {
					Class572_Sub22 class572_sub22_13_ = new Class572_Sub22();
					((Class572_Sub22) class572_sub22_13_).anInt9174 = 0;
					((Class572_Sub22) class572_sub22_13_).aChar9173 = '\uffff';
					((Class572_Sub22) class572_sub22_13_).anInt9177 = 1 * ((Class572_Sub22) class572_sub22).anInt9177;
					((Class572_Sub22) class572_sub22_13_).aLong9176 = 1L * ((Class572_Sub22) class572_sub22).aLong9176;
					((Class572_Sub22) class572_sub22_13_).anInt9178 = ((Class572_Sub22) class572_sub22).anInt9178 * 1;
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_13_, -1595746762);
					((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)] = true;
				}
				((Class572_Sub22) class572_sub22).anInt9174 = -694162006;
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -2076632676);
			} else if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 1) {
				if (((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)]) {
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1615162043);
					((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)] = false;
				}
			} else if (-1 == (((Class572_Sub22) class572_sub22).anInt9174 * -403467651)) {
				for (int i = 0; i < 112; i++) {
					if (((Class549_Sub1) this).aBoolArray8899[i]) {
						Class572_Sub22 class572_sub22_14_ = new Class572_Sub22();
						((Class572_Sub22) class572_sub22_14_).anInt9174 = -347081003;
						((Class572_Sub22) class572_sub22_14_).aChar9173 = '\uffff';
						((Class572_Sub22) class572_sub22_14_).anInt9177 = -1002795171 * i;
						((Class572_Sub22) class572_sub22_14_).aLong9176 = ((Class572_Sub22) class572_sub22).aLong9176 * 1L;
						((Class572_Sub22) class572_sub22_14_).anInt9178 = 1 * ((Class572_Sub22) class572_sub22).anInt9178;
						((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_14_, -2052558540);
						((Class549_Sub1) this).aBoolArray8899[i] = false;
					}
				}
			} else if (3 == (-403467651 * ((Class572_Sub22) class572_sub22).anInt9174))
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1450742420);
		}
	}

	public boolean method6514(int i, byte i_15_) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class549_Sub1) this).aBoolArray8899[i];
	}

	public boolean method6526(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class549_Sub1) this).aBoolArray8899[i];
	}

	public void method6525() {
		method8094(-530816731);
	}

	public synchronized void method6512() {
		((Class549_Sub1) this).aClass675_8897.method7918(1541625440);
		for (Class572_Sub22 class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963); class572_sub22 != null; class572_sub22 = (Class572_Sub22) ((Class549_Sub1) this).aClass675_8898.method7920(-1945803963)) {
			((Class572_Sub22) class572_sub22).anInt9178 = method8083(-644982730) * -1794774125;
			if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 0) {
				if (!((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)]) {
					Class572_Sub22 class572_sub22_16_ = new Class572_Sub22();
					((Class572_Sub22) class572_sub22_16_).anInt9174 = 0;
					((Class572_Sub22) class572_sub22_16_).aChar9173 = '\uffff';
					((Class572_Sub22) class572_sub22_16_).anInt9177 = 1 * ((Class572_Sub22) class572_sub22).anInt9177;
					((Class572_Sub22) class572_sub22_16_).aLong9176 = 1L * ((Class572_Sub22) class572_sub22).aLong9176;
					((Class572_Sub22) class572_sub22_16_).anInt9178 = ((Class572_Sub22) class572_sub22).anInt9178 * 1;
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_16_, -1825207234);
					((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)] = true;
				}
				((Class572_Sub22) class572_sub22).anInt9174 = -694162006;
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -2094861473);
			} else if (((Class572_Sub22) class572_sub22).anInt9174 * -403467651 == 1) {
				if (((Class549_Sub1) this).aBoolArray8899[(1830239477 * ((Class572_Sub22) class572_sub22).anInt9177)]) {
					((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -2005847660);
					((Class549_Sub1) this).aBoolArray8899[(((Class572_Sub22) class572_sub22).anInt9177 * 1830239477)] = false;
				}
			} else if (-1 == (((Class572_Sub22) class572_sub22).anInt9174 * -403467651)) {
				for (int i = 0; i < 112; i++) {
					if (((Class549_Sub1) this).aBoolArray8899[i]) {
						Class572_Sub22 class572_sub22_17_ = new Class572_Sub22();
						((Class572_Sub22) class572_sub22_17_).anInt9174 = -347081003;
						((Class572_Sub22) class572_sub22_17_).aChar9173 = '\uffff';
						((Class572_Sub22) class572_sub22_17_).anInt9177 = -1002795171 * i;
						((Class572_Sub22) class572_sub22_17_).aLong9176 = ((Class572_Sub22) class572_sub22).aLong9176 * 1L;
						((Class572_Sub22) class572_sub22_17_).anInt9178 = 1 * ((Class572_Sub22) class572_sub22).anInt9178;
						((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22_17_, -1535576230);
						((Class549_Sub1) this).aBoolArray8899[i] = false;
					}
				}
			} else if (3 == (-403467651 * ((Class572_Sub22) class572_sub22).anInt9174))
				((Class549_Sub1) this).aClass675_8897.method7940(class572_sub22, -1985202576);
		}
	}

	public static Class284 method8097(Class248 class248, int i, int i_18_, int i_19_) {
		byte[] is = class248.getFile(i, i_18_, 1977029612);
		if (null == is)
			return null;
		return new Class284(is);
	}

	public static void method8098(Class248 class248, Class248 class248_20_, int i, byte i_21_) {
		Class572_Sub12_Sub7.aClass248_11376 = class248;
		Class320.aClass248_3894 = class248_20_;
	}
}

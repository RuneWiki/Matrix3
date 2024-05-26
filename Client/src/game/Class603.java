package game;

/* Class603 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class603 {
	int anInt7879;
	Interface58 anInterface58_7880;
	float aFloat7881;
	boolean aBool7882;
	List aList7883;
	Class595 aClass595_7884 = Class595.aClass595_7833;
	Class240 aClass240_7885;
	int anInt7886;
	boolean aBool7887;
	int anInt7888;
	float aFloat7889;
	Object anObject7890;
	float aFloat7891;
	Interface70 anInterface70_7892;
	int anInt7893;
	Class289 aClass289_7894;
	Object anObject7895;
	boolean aBool7896;
	float aFloat7897;

	public float method7094(int i) {
		return ((Class603) this).aFloat7891;
	}

	void method7095(int i) {
		((Class603) this).anInterface58_7880 = null;
		((Class603) this).aClass595_7884 = Class595.aClass595_7833;
		((Class603) this).aBool7882 = false;
		((Class603) this).aList7883.clear();
		((Class603) this).anObject7890 = null;
		((Class603) this).aClass240_7885 = null;
		((Class603) this).anInt7886 = -1256686051;
		((Class603) this).aBool7887 = false;
		((Class603) this).anInt7888 = 0;
		((Class603) this).aFloat7881 = 0.0F;
		((Class603) this).anInterface70_7892 = null;
		((Class603) this).aFloat7891 = 0.0F;
		((Class603) this).aFloat7889 = 0.0F;
		((Class603) this).anInt7893 = 0;
		((Class603) this).aBool7896 = false;
		((Class603) this).anObject7895 = null;
		((Class603) this).anInt7879 = 0;
		((Class603) this).aFloat7897 = 1.0F;
	}

	public void method7096(Interface58 interface58, byte i) {
		((Class603) this).anInterface58_7880 = interface58;
		((Class603) this).aFloat7881 = 0.0F;
		((Class603) this).aClass595_7884 = Class595.aClass595_7825;
	}

	public void method7097(int i) {
		if (Class595.aClass595_7826 == ((Class603) this).aClass595_7884) {
			Class470 class470 = ((Class603) this).anInterface58_7880.method323(2040856321);
			if (Class470.aClass470_5279 == class470)
				((Class603) this).aClass595_7884 = Class595.aClass595_7827;
		}
		if (((Class603) this).aClass595_7884 == Class595.aClass595_7827 && true == ((Class603) this).aBool7882) {
			Class605 class605 = (((Class603) this).aClass289_7894.method3892(((Class603) this).anInterface58_7880.method326((byte) 45), (byte) 24));
			if (null != class605) {
				boolean bool = ((Class603) this).anInterface58_7880.method342(-1573342134);
				Class594 class594 = new Class594(this);
				boolean bool_0_ = (class605.method7165(bool ? null : ((Class603) this).anInterface58_7880.method325(0, -1414091236), bool ? class594 : null, ((Class603) this).anInt7886 * -2022716469, (842570317 * ((Class603) this).anInt7879 > 0 ? 0.0F : ((Class603) this).aFloat7881), false, ((Class603) this).aBool7887, 2017426833 * ((Class603) this).anInt7888, ((Class603) this).aFloat7897, this, (byte) 89));
				if (bool_0_ == true) {
					((Class603) this).aClass595_7884 = Class595.aClass595_7828;
					class605.method7162(((Class603) this).anInterface70_7892, -576713620);
					class605.method7158(((Class603) this).aFloat7881, (842570317 * ((Class603) this).anInt7879), -1790386803);
					class605.method7161(1220076188);
					((Class603) this).aList7883.add(class605);
					((Class603) this).aBool7882 = false;
				} else {
					if (class605.method7152(-987437988) == Class597.aClass597_7846)
						((Class603) this).aClass595_7884 = Class595.aClass595_7831;
					class605.method7157((byte) 0);
				}
			}
		}
		Iterator iterator = ((Class603) this).aList7883.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(1524590259) != this)
				iterator.remove();
			else {
				if (((Class603) this).aClass595_7884 == Class595.aClass595_7829) {
					if (class605.method7236(-1838724407) == 0.0F)
						class605.method7193(413814375);
					else
						bool = false;
				}
				if (class605.method7239(798700797) == true || class605.method7232((byte) 47) == true) {
					class605.method7157((byte) 0);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 >= -1593940065 * Class595.aClass595_7828.anInt7834) && (((Class603) this).aClass595_7884.anInt7834 * -1593940065 < -1593940065 * Class595.aClass595_7830.anInt7834)) {
			if (((Class603) this).aClass595_7884 == Class595.aClass595_7829)
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
			else
				((Class603) this).aClass595_7884 = Class595.aClass595_7831;
		}
	}

	public void method7098(int i, int i_1_) {
		if (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 < Class595.aClass595_7830.anInt7834 * -1593940065) {
			if (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 < Class595.aClass595_7828.anInt7834 * -1593940065) {
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
				((Class603) this).aBool7882 = false;
			} else if (i <= 0) {
				Iterator iterator = ((Class603) this).aList7883.iterator();
				while (iterator.hasNext()) {
					Class605 class605 = (Class605) iterator.next();
					if (class605.method7186(621932922) != this)
						iterator.remove();
					else
						class605.method7193(413814375);
				}
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
				((Class603) this).aBool7882 = false;
			} else {
				((Class603) this).aClass595_7884 = Class595.aClass595_7829;
				Iterator iterator = ((Class603) this).aList7883.iterator();
				while (iterator.hasNext()) {
					Class605 class605 = (Class605) iterator.next();
					if (class605.method7186(516420195) != this)
						iterator.remove();
					else
						class605.method7158(0.0F, i, -592037713);
				}
			}
		}
	}

	public void method7099(int i) {
		Iterator iterator = ((Class603) this).aList7883.iterator();
		((Class603) this).aClass595_7884 = Class595.aClass595_7830;
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(510515713) == this)
				class605.method7174((byte) -125);
		}
	}

	public void method7100(Interface70 interface70, byte i) {
		((Class603) this).anInterface70_7892 = interface70;
	}

	public void method7101(int i, boolean bool, byte i_2_) {
		((Class603) this).aBool7896 = bool;
		((Class603) this).anInt7893 = 724048811 * i;
	}

	public void method7102(Object object, int i) {
		((Class603) this).anObject7890 = object;
	}

	public Interface58 method7103(int i) {
		return ((Class603) this).anInterface58_7880;
	}

	public void method7104(Object object, int i) {
		((Class603) this).anObject7895 = object;
	}

	public void method7105() {
		if (Class595.aClass595_7826 == ((Class603) this).aClass595_7884) {
			Class470 class470 = ((Class603) this).anInterface58_7880.method323(-829403886);
			if (Class470.aClass470_5279 == class470)
				((Class603) this).aClass595_7884 = Class595.aClass595_7827;
		}
		if (((Class603) this).aClass595_7884 == Class595.aClass595_7827 && true == ((Class603) this).aBool7882) {
			Class605 class605 = (((Class603) this).aClass289_7894.method3892(((Class603) this).anInterface58_7880.method326((byte) 65), (byte) 61));
			if (null != class605) {
				boolean bool = ((Class603) this).anInterface58_7880.method342(1386601082);
				Class594 class594 = new Class594(this);
				boolean bool_3_ = (class605.method7165(bool ? null : ((Class603) this).anInterface58_7880.method325(0, -303100512), bool ? class594 : null, ((Class603) this).anInt7886 * -2022716469, (842570317 * ((Class603) this).anInt7879 > 0 ? 0.0F : ((Class603) this).aFloat7881), false, ((Class603) this).aBool7887, 2017426833 * ((Class603) this).anInt7888, ((Class603) this).aFloat7897, this, (byte) 82));
				if (bool_3_ == true) {
					((Class603) this).aClass595_7884 = Class595.aClass595_7828;
					class605.method7162(((Class603) this).anInterface70_7892, -576713620);
					class605.method7158(((Class603) this).aFloat7881, (842570317 * ((Class603) this).anInt7879), 389028014);
					class605.method7161(1873726519);
					((Class603) this).aList7883.add(class605);
					((Class603) this).aBool7882 = false;
				} else {
					if (class605.method7152(-987437988) == Class597.aClass597_7846)
						((Class603) this).aClass595_7884 = Class595.aClass595_7831;
					class605.method7157((byte) 0);
				}
			}
		}
		Iterator iterator = ((Class603) this).aList7883.iterator();
		boolean bool = true;
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(2122036063) != this)
				iterator.remove();
			else {
				if (((Class603) this).aClass595_7884 == Class595.aClass595_7829) {
					if (class605.method7236(1155510400) == 0.0F)
						class605.method7193(413814375);
					else
						bool = false;
				}
				if (class605.method7239(2144728970) == true || class605.method7232((byte) 109) == true) {
					class605.method7157((byte) 0);
					iterator.remove();
				} else
					bool = false;
			}
		}
		if (bool && (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 >= -1593940065 * Class595.aClass595_7828.anInt7834) && (((Class603) this).aClass595_7884.anInt7834 * -1593940065 < -1593940065 * Class595.aClass595_7830.anInt7834)) {
			if (((Class603) this).aClass595_7884 == Class595.aClass595_7829)
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
			else
				((Class603) this).aClass595_7884 = Class595.aClass595_7831;
		}
	}

	public int method7106(int i) {
		return -2022716469 * ((Class603) this).anInt7886;
	}

	public void method7107(int i, int i_4_) {
		((Class603) this).anInt7886 = i * 1256686051;
	}

	public void method7108(boolean bool, int i) {
		/* empty */
	}

	public void method7109(Class240 class240, int i) {
		((Class603) this).aClass240_7885 = class240;
	}

	public Class240 method7110(int i) {
		return ((Class603) this).aClass240_7885;
	}

	public void method7111() {
		if (Class595.aClass595_7830 != ((Class603) this).aClass595_7884 && Class595.aClass595_7831 != ((Class603) this).aClass595_7884)
			method7098(0, -1110366939);
		Iterator iterator = ((Class603) this).aList7883.iterator();
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(1466750107) != this)
				iterator.remove();
			else
				class605.method7157((byte) 0);
		}
		method7095(2120863216);
		((Class603) this).aClass595_7884 = Class595.aClass595_7832;
	}

	public float method7112(int i) {
		return ((Class603) this).aFloat7889;
	}

	public void method7113(float f, byte i) {
		((Class603) this).aFloat7891 = f;
	}

	public void method7114(float f, int i) {
		((Class603) this).aFloat7889 = f;
	}

	public Object method7115(short i) {
		return ((Class603) this).anObject7895;
	}

	public boolean method7116(byte i) {
		((Class603) this).aBool7896 = false;
		return ((Class603) this).anInt7893 * -1689123069 != 0;
	}

	public void method7117(byte i) {
		if (((Class603) this).anInt7893 * -1689123069 > -1 && !((Class603) this).aBool7896)
			((Class603) this).anInt7893 -= 724048811;
		if (0 == ((Class603) this).anInt7893 * -1689123069)
			method7140(-714786686);
	}

	public void method7118(int i) {
		Iterator iterator = ((Class603) this).aList7883.iterator();
		((Class603) this).aClass595_7884 = Class595.aClass595_7826;
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(806869167) == this)
				class605.method7155(98416120);
		}
	}

	public Object method7119(int i) {
		return ((Class603) this).anObject7890;
	}

	public void method7120(float f, int i) {
		if (!(f < 0.0F))
			((Class603) this).aFloat7897 = f;
	}

	void method7121() {
		((Class603) this).anInterface58_7880 = null;
		((Class603) this).aClass595_7884 = Class595.aClass595_7833;
		((Class603) this).aBool7882 = false;
		((Class603) this).aList7883.clear();
		((Class603) this).anObject7890 = null;
		((Class603) this).aClass240_7885 = null;
		((Class603) this).anInt7886 = -1256686051;
		((Class603) this).aBool7887 = false;
		((Class603) this).anInt7888 = 0;
		((Class603) this).aFloat7881 = 0.0F;
		((Class603) this).anInterface70_7892 = null;
		((Class603) this).aFloat7891 = 0.0F;
		((Class603) this).aFloat7889 = 0.0F;
		((Class603) this).anInt7893 = 0;
		((Class603) this).aBool7896 = false;
		((Class603) this).anObject7895 = null;
		((Class603) this).anInt7879 = 0;
		((Class603) this).aFloat7897 = 1.0F;
	}

	public void method7122(boolean bool, int i, int i_5_) {
		((Class603) this).aBool7887 = bool;
		((Class603) this).anInt7888 = i * 478339953;
	}

	public void method7123(int i) {
		if (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 < Class595.aClass595_7830.anInt7834 * -1593940065) {
			if (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 < Class595.aClass595_7828.anInt7834 * -1593940065) {
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
				((Class603) this).aBool7882 = false;
			} else if (i <= 0) {
				Iterator iterator = ((Class603) this).aList7883.iterator();
				while (iterator.hasNext()) {
					Class605 class605 = (Class605) iterator.next();
					if (class605.method7186(-261432054) != this)
						iterator.remove();
					else
						class605.method7193(413814375);
				}
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
				((Class603) this).aBool7882 = false;
			} else {
				((Class603) this).aClass595_7884 = Class595.aClass595_7829;
				Iterator iterator = ((Class603) this).aList7883.iterator();
				while (iterator.hasNext()) {
					Class605 class605 = (Class605) iterator.next();
					if (class605.method7186(790396112) != this)
						iterator.remove();
					else
						class605.method7158(0.0F, i, 1280600309);
				}
			}
		}
	}

	public void method7124() {
		if (!((Class603) this).aBool7882 && (((Class603) this).aClass595_7884 != Class595.aClass595_7824 && Class595.aClass595_7832 != ((Class603) this).aClass595_7884 && Class595.aClass595_7833 != ((Class603) this).aClass595_7884 && ((Class603) this).aClass595_7884 != Class595.aClass595_7829) && ((-1593940065 * ((Class603) this).aClass595_7884.anInt7834 <= Class595.aClass595_7825.anInt7834 * -1593940065) || (((Class603) this).aClass595_7884.anInt7834 * -1593940065 >= -1593940065 * Class595.aClass595_7830.anInt7834)))
			((Class603) this).aClass595_7884 = Class595.aClass595_7826;
	}

	public void method7125() {
		if (!((Class603) this).aBool7882 && (((Class603) this).aClass595_7884 != Class595.aClass595_7824 && Class595.aClass595_7832 != ((Class603) this).aClass595_7884 && Class595.aClass595_7833 != ((Class603) this).aClass595_7884 && ((Class603) this).aClass595_7884 != Class595.aClass595_7829) && ((-1593940065 * ((Class603) this).aClass595_7884.anInt7834 <= Class595.aClass595_7825.anInt7834 * -1593940065) || (((Class603) this).aClass595_7884.anInt7834 * -1593940065 >= -1593940065 * Class595.aClass595_7830.anInt7834)))
			((Class603) this).aClass595_7884 = Class595.aClass595_7826;
	}

	public void method7126(int i) {
		if (!((Class603) this).aBool7882 && (((Class603) this).aClass595_7884 != Class595.aClass595_7824 && Class595.aClass595_7832 != ((Class603) this).aClass595_7884 && Class595.aClass595_7833 != ((Class603) this).aClass595_7884 && ((Class603) this).aClass595_7884 != Class595.aClass595_7829) && ((-1593940065 * ((Class603) this).aClass595_7884.anInt7834 <= Class595.aClass595_7825.anInt7834 * -1593940065) || (((Class603) this).aClass595_7884.anInt7834 * -1593940065 >= -1593940065 * Class595.aClass595_7830.anInt7834)))
			((Class603) this).aClass595_7884 = Class595.aClass595_7826;
	}

	public void method7127() {
		Iterator iterator = ((Class603) this).aList7883.iterator();
		((Class603) this).aClass595_7884 = Class595.aClass595_7830;
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(-319142933) == this)
				class605.method7174((byte) -59);
		}
	}

	public void method7128() {
		Iterator iterator = ((Class603) this).aList7883.iterator();
		((Class603) this).aClass595_7884 = Class595.aClass595_7830;
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(-407008904) == this)
				class605.method7174((byte) -73);
		}
	}

	public Class603(Class289 class289) {
		((Class603) this).aBool7882 = false;
		((Class603) this).anInt7879 = 0;
		((Class603) this).aClass289_7894 = class289;
		((Class603) this).aList7883 = new ArrayList();
	}

	public Class595 method7129(int i) {
		return ((Class603) this).aClass595_7884;
	}

	public float method7130() {
		return ((Class603) this).aFloat7891;
	}

	public void method7131(int i) {
		if (Class595.aClass595_7830 != ((Class603) this).aClass595_7884 && Class595.aClass595_7831 != ((Class603) this).aClass595_7884)
			method7098(0, -1110366939);
		Iterator iterator = ((Class603) this).aList7883.iterator();
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(1656315293) != this)
				iterator.remove();
			else
				class605.method7157((byte) 0);
		}
		method7095(988014536);
		((Class603) this).aClass595_7884 = Class595.aClass595_7832;
	}

	public void method7132(int i) {
		((Class603) this).anInt7886 = i * 1256686051;
	}

	public float method7133() {
		return ((Class603) this).aFloat7891;
	}

	public float method7134() {
		return ((Class603) this).aFloat7891;
	}

	public void method7135(float f, int i, int i_6_) {
		((Class603) this).aFloat7881 = f;
		int i_7_ = 0;
		Iterator iterator = ((Class603) this).aList7883.iterator();
		while (iterator.hasNext()) {
			Class605 class605 = (Class605) iterator.next();
			if (class605.method7186(314442822) != this)
				((Class603) this).aList7883.remove(class605);
			else {
				class605.method7158(((Class603) this).aFloat7881, i, 1508237532);
				i_7_++;
			}
		}
		if (i_7_ == 0)
			((Class603) this).anInt7879 = i * 55979653;
	}

	public float method7136() {
		return ((Class603) this).aFloat7889;
	}

	public float method7137() {
		return ((Class603) this).aFloat7889;
	}

	public void method7138() {
		if (((Class603) this).anInt7893 * -1689123069 > -1 && !((Class603) this).aBool7896)
			((Class603) this).anInt7893 -= 724048811;
		if (0 == ((Class603) this).anInt7893 * -1689123069)
			method7140(-883590039);
	}

	public boolean method7139() {
		((Class603) this).aBool7896 = false;
		return ((Class603) this).anInt7893 * -1689123069 != 0;
	}

	public void method7140(int i) {
		if (((Class603) this).aClass595_7884 != Class595.aClass595_7824 && ((Class603) this).aClass595_7884 != Class595.aClass595_7832 && Class595.aClass595_7833 != ((Class603) this).aClass595_7884 && ((Class603) this).aClass595_7884 != Class595.aClass595_7829) {
			if ((((Class603) this).aClass595_7884 == Class595.aClass595_7826 || (((Class603) this).aClass595_7884 == Class595.aClass595_7827)) && !((Class603) this).aBool7882)
				((Class603) this).aBool7882 = true;
			else if ((((Class603) this).aClass595_7884.anInt7834 * -1593940065 < Class595.aClass595_7826.anInt7834 * -1593940065) || ((-1593940065 * ((Class603) this).aClass595_7884.anInt7834) >= -1593940065 * Class595.aClass595_7830.anInt7834)) {
				((Class603) this).aClass595_7884 = Class595.aClass595_7826;
				((Class603) this).aBool7882 = true;
			}
		}
	}

	void method7141() {
		((Class603) this).anInterface58_7880 = null;
		((Class603) this).aClass595_7884 = Class595.aClass595_7833;
		((Class603) this).aBool7882 = false;
		((Class603) this).aList7883.clear();
		((Class603) this).anObject7890 = null;
		((Class603) this).aClass240_7885 = null;
		((Class603) this).anInt7886 = -1256686051;
		((Class603) this).aBool7887 = false;
		((Class603) this).anInt7888 = 0;
		((Class603) this).aFloat7881 = 0.0F;
		((Class603) this).anInterface70_7892 = null;
		((Class603) this).aFloat7891 = 0.0F;
		((Class603) this).aFloat7889 = 0.0F;
		((Class603) this).anInt7893 = 0;
		((Class603) this).aBool7896 = false;
		((Class603) this).anObject7895 = null;
		((Class603) this).anInt7879 = 0;
		((Class603) this).aFloat7897 = 1.0F;
	}

	public void method7142(int i) {
		if (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 < Class595.aClass595_7830.anInt7834 * -1593940065) {
			if (-1593940065 * ((Class603) this).aClass595_7884.anInt7834 < Class595.aClass595_7828.anInt7834 * -1593940065) {
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
				((Class603) this).aBool7882 = false;
			} else if (i <= 0) {
				Iterator iterator = ((Class603) this).aList7883.iterator();
				while (iterator.hasNext()) {
					Class605 class605 = (Class605) iterator.next();
					if (class605.method7186(2021106188) != this)
						iterator.remove();
					else
						class605.method7193(413814375);
				}
				((Class603) this).aClass595_7884 = Class595.aClass595_7830;
				((Class603) this).aBool7882 = false;
			} else {
				((Class603) this).aClass595_7884 = Class595.aClass595_7829;
				Iterator iterator = ((Class603) this).aList7883.iterator();
				while (iterator.hasNext()) {
					Class605 class605 = (Class605) iterator.next();
					if (class605.method7186(542062395) != this)
						iterator.remove();
					else
						class605.method7158(0.0F, i, -1252633774);
				}
			}
		}
	}

	static final void method7143(Cs2Executor class441, int i) throws Exception_Sub4 {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_8_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_9_ = (((Cs2Executor) class441).intStack[1 + 1369304407 * ((Cs2Executor) class441).intStackPtr]);
		Class133_Sub1.aClass411_Sub1_9827.method4983((float) i_8_, (float) i_9_, 1187769579);
	}

	static final void method7144(Cs2Executor class441, byte i) {
		int i_10_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_10_, (short) 6821);
		Class407.method4928(class73, class441, -1377011374);
	}

	//real
	static final void method7145(int i) {
		for (int i_11_ = Class133_Sub23.playerVarsProvider.domain.method6073(true, (byte) -45); i_11_ != -1; i_11_ = Class133_Sub23.playerVarsProvider.domain.method6073(false, (byte) -21)) {
			Class518.method6146(i_11_, (byte) 21);
			client.anIntArray8830[(client.anInt8791 += -742246703) * -1505762767 - 1 & 0x3f] = i_11_;
		}
		for (GameTask class572_sub12_sub11 = Class3.method483((byte) 98); class572_sub12_sub11 != null; class572_sub12_sub11 = Class3.method483((byte) 92)) {
			int i_12_ = class572_sub12_sub11.method10339((byte) 67);
			long l = class572_sub12_sub11.method10340(1054137524);
			if (i_12_ == 1) { //sets var value here
				VarDefinition class179 = (VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, -737693371);
				Class306.clientConfigsDomain.method76(class179, ((((GameTask) class572_sub12_sub11).p1) * 471797111), (short) 255);
				client.anIntArray8796[(client.anInt8797 += -579284019) * -668970747 - 1 & 0x3f] = (int) l;
			} else if (2 == i_12_) {
				VarDefinition class179 = (VarDefinition) Class389.aClass202_Sub1_Sub2_4652.getDefinition((int) l, -1420222542);
				Class306.clientConfigsDomain.method80(class179, (((GameTask) class572_sub12_sub11).aString11408), -30259456);
				client.anIntArray8798[(client.anInt8799 += -856563507) * 665914373 - 1 & 0x3f] = (int) l;
			} else if (3 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -18353);
				if (!((GameTask) class572_sub12_sub11).aString11408.equals(class73.aString829)) {
					class73.aString829 = (((GameTask) class572_sub12_sub11).aString11408);
					Class555.method6575(class73, (short) 9814);
				}
			} else if (23 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -10980);
				if ((1 == 471797111 * ((GameTask) class572_sub12_sub11).p1) != class73.aBool835) {
					class73.aBool835 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
					Class555.method6575(class73, (short) 18178);
				}
			} else if (4 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 7938);
				int i_13_ = (((GameTask) class572_sub12_sub11).p1 * 471797111);
				int i_14_ = (((GameTask) class572_sub12_sub11).p2 * 405359321);
				int i_15_ = (-1781219319 * (((GameTask) class572_sub12_sub11).p3));
				if (-22820201 * class73.anInt892 != i_13_ || i_14_ != class73.anInt803 * -1063203465 || 1779236057 * class73.anInt794 != i_15_) {
					class73.anInt892 = i_13_ * -2072488665;
					class73.anInt803 = 771890247 * i_14_;
					class73.anInt794 = 2093728617 * i_15_;
					class73.aClass399_908 = null;
					Class555.method6575(class73, (short) 21137);
				}
			} else if (5 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 9071);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != class73.anInt926 * -1286545333) {
					if (471797111 * ((GameTask) class572_sub12_sub11).p1 != -1) {
						if (null == class73.aClass663_915)
							class73.aClass663_915 = new Class663_Sub1();
						class73.aClass663_915.method7801(471797111 * ((GameTask) class572_sub12_sub11).p1, 751680147);
					} else
						class73.aClass663_915 = null;
					class73.anInt926 = (((GameTask) class572_sub12_sub11).p1) * 825000965;
					Class555.method6575(class73, (short) 14984);
				}
			} else if (i_12_ == 6) {
				int i_16_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				int i_17_ = i_16_ >> 10 & 0x1f;
				int i_18_ = i_16_ >> 5 & 0x1f;
				int i_19_ = i_16_ & 0x1f;
				int i_20_ = (i_17_ << 19) + (i_18_ << 11) + (i_19_ << 3);
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -5224);
				if (class73.anInt918 * -1311491911 != i_20_) {
					class73.anInt918 = 2018397577 * i_20_;
					Class555.method6575(class73, (short) 25193);
				}
			} else if (i_12_ == 7) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -26459);
				boolean bool = (471797111 * ((GameTask) class572_sub12_sub11).p1 == 1);
				if (class73.aBool769 != bool) {
					class73.aBool769 = bool;
					Class555.method6575(class73, (short) 15529);
				}
			} else if (i_12_ == 8) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 26523);
				if (471797111 * (((GameTask) class572_sub12_sub11).p1) != class73.anInt798 * -579902323 || ((((GameTask) class572_sub12_sub11).p2) * 405359321 != 969995095 * class73.anInt799) || (-1781219319 * ((GameTask) class572_sub12_sub11).p3 != -1393929271 * class73.anInt804)) {
					class73.anInt798 = 985445139 * ((GameTask) class572_sub12_sub11).p1;
					class73.anInt799 = (((GameTask) class572_sub12_sub11).p2) * 143557967;
					class73.anInt804 = (((GameTask) class572_sub12_sub11).p3) * 1646438977;
					if (class73.nvmtheindexisotherone * 411192987 != -1) {
						if (-96689919 * class73.anInt805 > 0)
							class73.anInt804 = (-1656063712 * class73.anInt804 / (-96689919 * class73.anInt805) * -1342032263);
						else if (class73.anInt760 * 1473094557 > 0)
							class73.anInt804 = -1342032263 * (-1656063712 * class73.anInt804 / (1473094557 * class73.anInt760));
					}
					Class555.method6575(class73, (short) 6418);
				}
			} else if (9 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -1097);
				if ((411192987 * class73.nvmtheindexisotherone != (((GameTask) class572_sub12_sub11).p1) * 471797111) || (-830487355 * class73.anInt903 != 405359321 * ((GameTask) class572_sub12_sub11).p2)) {
					class73.nvmtheindexisotherone = (((GameTask) class572_sub12_sub11).p1) * 1541807189;
					class73.anInt903 = (((GameTask) class572_sub12_sub11).p2) * 2086000389;
					Class555.method6575(class73, (short) 13367);
				}
			} else if (i_12_ == 10) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -4816);
				if ((((GameTask) class572_sub12_sub11).p1 * 471797111) != 1483996493 * class73.anInt860 || (405359321 * ((GameTask) class572_sub12_sub11).p2 != -1688915011 * class73.anInt797) || (1450945799 * class73.anInt800 != (((GameTask) class572_sub12_sub11).p3) * -1781219319)) {
					class73.anInt860 = (((GameTask) class572_sub12_sub11).p1) * -107813933;
					class73.anInt797 = 1010423629 * ((GameTask) class572_sub12_sub11).p2;
					class73.anInt800 = (((GameTask) class572_sub12_sub11).p3) * 1183905391;
					Class555.method6575(class73, (short) 21696);
				}
			} else if (11 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -4219);
				class73.aByte811 = (byte) 0;
				class73.anInt762 = (class73.anInt819 = 316319613 * (((GameTask) class572_sub12_sub11).p1)) * -486052645;
				class73.aByte755 = (byte) 0;
				class73.anInt842 = (class73.anInt793 = (((GameTask) class572_sub12_sub11).p2) * -44794633) * -1776972733;
				Class555.method6575(class73, (short) 11778);
			} else if (i_12_ == 12) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 18283);
				int i_21_ = (471797111 * (((GameTask) class572_sub12_sub11).p1));
				if (null != class73 && 0 == class73.anInt752 * -1285279191) {
					if (i_21_ > (382019713 * class73.anInt902 - class73.anInt765 * 1360982075))
						i_21_ = (class73.anInt902 * 382019713 - 1360982075 * class73.anInt765);
					if (i_21_ < 0)
						i_21_ = 0;
					if (i_21_ != class73.anInt775 * -2139739529) {
						class73.anInt775 = -650326201 * i_21_;
						Class555.method6575(class73, (short) 7775);
					}
				}
			} else if (13 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -26868);
				class73.anInt783 = (((GameTask) class572_sub12_sub11).p1 * -599008635);
			} else if (i_12_ == 14) {
				Class192.aBool2307 = true;
				Class192.anInt2310 = -1469552025 * ((GameTask) class572_sub12_sub11).p1;
				Class192.anInt2300 = 484040841 * ((GameTask) class572_sub12_sub11).p2;
			} else if (15 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -9366);
				class73.anInt906 = -257415021 * ((GameTask) class572_sub12_sub11).p1;
			} else if (i_12_ == 21) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 19432);
				class73.aBool725 = 1 == 471797111 * ((GameTask) class572_sub12_sub11).p1;
			} else if (22 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -14901);
				class73.aBool896 = 1 == (((GameTask) class572_sub12_sub11).p1) * 471797111;
			} else if (i_12_ == 17) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) -10871);
				int i_22_ = (int) (l >> 32);
				class73.method1105(i_22_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (((GameTask) class572_sub12_sub11).p2 * 405359321), 33984);
			} else if (20 == i_12_) {
				InterfaceDefinitions class73 = Class512.method6083((int) l, (short) 4493);
				int i_23_ = (int) (l >> 32);
				class73.method1106(i_23_, (short) (((GameTask) class572_sub12_sub11).p1 * 471797111), (short) (405359321 * (((GameTask) class572_sub12_sub11).p2)), (byte) -9);
			}
		}
	}

	static final void method7146(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub34_9223.method9173(1824130277);
	}
}

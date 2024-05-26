package game;

/* Class564_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class564_Sub1 extends Class564 implements MouseListener, MouseMotionListener, MouseWheelListener {
	int anInt8949;
	static final int anInt8950 = 1;
	static final int anInt8951 = 4;
	Class675 aClass675_8952 = new Class675();
	int anInt8953;
	int anInt8954;
	int anInt8955;
	int anInt8956;
	int anInt8957;
	static final int anInt8958 = 2;
	Class675 aClass675_8959 = new Class675();
	Component aComponent8960;
	boolean aBool8961;

	public Class572_Sub13 method6680() {
		return ((Class572_Sub13) ((Class564_Sub1) this).aClass675_8952.method7920(-1945803963));
	}

	void method8250(Component component, byte i) {
		method8255((short) 684);
		((Class564_Sub1) this).aComponent8960 = component;
		((Class564_Sub1) this).aComponent8960.addMouseListener(this);
		((Class564_Sub1) this).aComponent8960.addMouseMotionListener(this);
		((Class564_Sub1) this).aComponent8960.addMouseWheelListener(this);
	}

	void method8251(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		Class572_Sub13_Sub2 class572_sub13_sub2 = Class440.method5279(i, i_0_, i_1_, Class69.method1067(-1859113476), i_2_, 1513528116);
		((Class564_Sub1) this).aClass675_8959.method7940(class572_sub13_sub2, -1864778606);
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
		method8252(mouseevent.getX(), mouseevent.getY(), 1869798962);
	}

	void method8252(int i, int i_4_, int i_5_) {
		((Class564_Sub1) this).anInt8956 = -1460380477 * i;
		((Class564_Sub1) this).anInt8957 = 257273897 * i_4_;
		if (((Class564_Sub1) this).aBool8961)
			method8251(-1, i, i_4_, 0, -43743219);
	}

	public Class572_Sub13 method6659(int i) {
		return ((Class572_Sub13) ((Class564_Sub1) this).aClass675_8952.method7920(-1945803963));
	}

	public synchronized void method6652() {
		((Class564_Sub1) this).anInt8955 = ((Class564_Sub1) this).anInt8956 * 1351825773;
		((Class564_Sub1) this).anInt8953 = ((Class564_Sub1) this).anInt8957 * 542361457;
		((Class564_Sub1) this).anInt8954 = ((Class564_Sub1) this).anInt8949 * -264632365;
		Class675 class675 = ((Class564_Sub1) this).aClass675_8952;
		((Class564_Sub1) this).aClass675_8952 = ((Class564_Sub1) this).aClass675_8959;
		((Class564_Sub1) this).aClass675_8959 = class675;
		((Class564_Sub1) this).aClass675_8959.method7918(1001317939);
	}

	public boolean method6653(int i) {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x1);
	}

	Class564_Sub1(Component component, boolean bool) {
		method8250(component, (byte) -122);
		((Class564_Sub1) this).aBool8961 = bool;
	}

	public boolean method6662(int i) {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x4);
	}

	public int method6658(byte i) {
		return -502125783 * ((Class564_Sub1) this).anInt8953;
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
		method8252(mouseevent.getX(), mouseevent.getY(), 1869798962);
	}

	public synchronized void mouseClicked(MouseEvent mouseevent) {
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void method6663() {
		((Class564_Sub1) this).anInt8955 = ((Class564_Sub1) this).anInt8956 * 1351825773;
		((Class564_Sub1) this).anInt8953 = ((Class564_Sub1) this).anInt8957 * 542361457;
		((Class564_Sub1) this).anInt8954 = ((Class564_Sub1) this).anInt8949 * -264632365;
		Class675 class675 = ((Class564_Sub1) this).aClass675_8952;
		((Class564_Sub1) this).aClass675_8952 = ((Class564_Sub1) this).aClass675_8959;
		((Class564_Sub1) this).aClass675_8959 = class675;
		((Class564_Sub1) this).aClass675_8959.method7918(-1690483956);
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
		method8252(mouseevent.getX(), mouseevent.getY(), 1869798962);
	}

	int method8253(MouseEvent mouseevent, int i) {
		if (mouseevent.getButton() == 1) {
			if (mouseevent.isMetaDown())
				return 4;
			return 1;
		}
		if (mouseevent.getButton() == 2)
			return 2;
		if (mouseevent.getButton() == 3)
			return 4;
		return 0;
	}

	public int method6674() {
		return ((Class564_Sub1) this).anInt8955 * -2100468809;
	}

	public synchronized void mouseReleased(MouseEvent mouseevent) {
		int i = method8253(mouseevent, 366229007);
		if (0 == (1081768023 * ((Class564_Sub1) this).anInt8949 & i))
			i = 1081768023 * ((Class564_Sub1) this).anInt8949;
		if (0 != (i & 0x1))
			method8251(3, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -248932320);
		if ((i & 0x4) != 0)
			method8251(5, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -439327331);
		if ((i & 0x2) != 0)
			method8251(4, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -886494657);
		((Class564_Sub1) this).anInt8949 = -1575357593 * (1081768023 * ((Class564_Sub1) this).anInt8949 & (i ^ 0xffffffff));
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void method6655(short i) {
		((Class564_Sub1) this).anInt8955 = ((Class564_Sub1) this).anInt8956 * 1351825773;
		((Class564_Sub1) this).anInt8953 = ((Class564_Sub1) this).anInt8957 * 542361457;
		((Class564_Sub1) this).anInt8954 = ((Class564_Sub1) this).anInt8949 * -264632365;
		Class675 class675 = ((Class564_Sub1) this).aClass675_8952;
		((Class564_Sub1) this).aClass675_8952 = ((Class564_Sub1) this).aClass675_8959;
		((Class564_Sub1) this).aClass675_8959 = class675;
		((Class564_Sub1) this).aClass675_8959.method7918(-2074211481);
	}

	public boolean method6654(byte i) {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x2);
	}

	public void method6660(short i) {
		method8255((short) 684);
	}

	public synchronized void method6661() {
		((Class564_Sub1) this).anInt8955 = ((Class564_Sub1) this).anInt8956 * 1351825773;
		((Class564_Sub1) this).anInt8953 = ((Class564_Sub1) this).anInt8957 * 542361457;
		((Class564_Sub1) this).anInt8954 = ((Class564_Sub1) this).anInt8949 * -264632365;
		Class675 class675 = ((Class564_Sub1) this).aClass675_8952;
		((Class564_Sub1) this).aClass675_8952 = ((Class564_Sub1) this).aClass675_8959;
		((Class564_Sub1) this).aClass675_8959 = class675;
		((Class564_Sub1) this).aClass675_8959.method7918(2009212075);
	}

	void method8254() {
		if (((Class564_Sub1) this).aComponent8960 != null) {
			((Class564_Sub1) this).aComponent8960.removeMouseWheelListener(this);
			((Class564_Sub1) this).aComponent8960.removeMouseMotionListener(this);
			((Class564_Sub1) this).aComponent8960.removeMouseListener(this);
			((Class564_Sub1) this).aComponent8960 = null;
			((Class564_Sub1) this).anInt8954 = 0;
			((Class564_Sub1) this).anInt8953 = 0;
			((Class564_Sub1) this).anInt8955 = 0;
			((Class564_Sub1) this).anInt8949 = 0;
			((Class564_Sub1) this).anInt8957 = 0;
			((Class564_Sub1) this).anInt8956 = 0;
			((Class564_Sub1) this).aClass675_8952 = null;
			((Class564_Sub1) this).aClass675_8959 = null;
		}
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
		int i = method8253(mouseevent, -41838143);
		if (1 == i)
			method8251(0, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -4050575);
		else if (i == 4)
			method8251(2, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -1820978068);
		else if (2 == i)
			method8251(1, mouseevent.getX(), mouseevent.getY(), mouseevent.getClickCount(), -874176076);
		((Class564_Sub1) this).anInt8949 = ((((Class564_Sub1) this).anInt8949 * 1081768023 | i) * -1575357593);
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
		method8252(mouseevent.getX(), mouseevent.getY(), 1869798962);
	}

	public boolean method6666() {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x1);
	}

	public boolean method6665() {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x2);
	}

	public boolean method6668() {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x2);
	}

	public boolean method6667() {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x4);
	}

	public boolean method6670() {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x4);
	}

	public int method6673() {
		return ((Class564_Sub1) this).anInt8955 * -2100468809;
	}

	public boolean method6664() {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x1);
	}

	public int method6669() {
		return -502125783 * ((Class564_Sub1) this).anInt8953;
	}

	public int method6675() {
		return -502125783 * ((Class564_Sub1) this).anInt8953;
	}

	public int method6676() {
		return -502125783 * ((Class564_Sub1) this).anInt8953;
	}

	public int method6678() {
		return -502125783 * ((Class564_Sub1) this).anInt8953;
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		int i = mousewheelevent.getX();
		int i_6_ = mousewheelevent.getY();
		int i_7_ = mousewheelevent.getWheelRotation();
		method8251(6, i, i_6_, i_7_, -425351354);
		mousewheelevent.consume();
	}

	public int method6657(short i) {
		return ((Class564_Sub1) this).anInt8955 * -2100468809;
	}

	public Class572_Sub13 method6681() {
		return ((Class572_Sub13) ((Class564_Sub1) this).aClass675_8952.method7920(-1945803963));
	}

	public void method6677() {
		method8255((short) 684);
	}

	public Class572_Sub13 method6679() {
		return ((Class572_Sub13) ((Class564_Sub1) this).aClass675_8952.method7920(-1945803963));
	}

	void method8255(short i) {
		if (((Class564_Sub1) this).aComponent8960 != null) {
			((Class564_Sub1) this).aComponent8960.removeMouseWheelListener(this);
			((Class564_Sub1) this).aComponent8960.removeMouseMotionListener(this);
			((Class564_Sub1) this).aComponent8960.removeMouseListener(this);
			((Class564_Sub1) this).aComponent8960 = null;
			((Class564_Sub1) this).anInt8954 = 0;
			((Class564_Sub1) this).anInt8953 = 0;
			((Class564_Sub1) this).anInt8955 = 0;
			((Class564_Sub1) this).anInt8949 = 0;
			((Class564_Sub1) this).anInt8957 = 0;
			((Class564_Sub1) this).anInt8956 = 0;
			((Class564_Sub1) this).aClass675_8952 = null;
			((Class564_Sub1) this).aClass675_8959 = null;
		}
	}

	void method8256() {
		if (((Class564_Sub1) this).aComponent8960 != null) {
			((Class564_Sub1) this).aComponent8960.removeMouseWheelListener(this);
			((Class564_Sub1) this).aComponent8960.removeMouseMotionListener(this);
			((Class564_Sub1) this).aComponent8960.removeMouseListener(this);
			((Class564_Sub1) this).aComponent8960 = null;
			((Class564_Sub1) this).anInt8954 = 0;
			((Class564_Sub1) this).anInt8953 = 0;
			((Class564_Sub1) this).anInt8955 = 0;
			((Class564_Sub1) this).anInt8949 = 0;
			((Class564_Sub1) this).anInt8957 = 0;
			((Class564_Sub1) this).anInt8956 = 0;
			((Class564_Sub1) this).aClass675_8952 = null;
			((Class564_Sub1) this).aClass675_8959 = null;
		}
	}

	public boolean method6682() {
		return 0 != (((Class564_Sub1) this).anInt8954 * 1329569517 & 0x1);
	}

	void method8257(int i, int i_8_) {
		((Class564_Sub1) this).anInt8956 = -1460380477 * i;
		((Class564_Sub1) this).anInt8957 = 257273897 * i_8_;
		if (((Class564_Sub1) this).aBool8961)
			method8251(-1, i, i_8_, 0, 538206076);
	}

	static void method8258(int i, int i_9_, int i_10_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(5, (long) i);
		class572_sub12_sub11.method10338(1335137693);
		((GameTask) class572_sub12_sub11).p1 = i_9_ * 720886855;
	}
}

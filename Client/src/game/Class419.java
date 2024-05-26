package game;

/* Class419 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class419 implements Interface49 {
	List aList4947 = new ArrayList();
	boolean aBool4948;
	static Class248 aClass248_4949;
	boolean aBool4950;
	boolean aBool4951;
	String aString4952;
	String aString4953;
	boolean aBool4954;
	AffineTransform anAffineTransform4955 = new AffineTransform();
	public static int anInt4956;
	static InterfaceDefinitions[] aClass73Array4957;
	public static int anInt4958;

	public boolean method290(long l) {
		return true;
	}

	final int method5111(int i, int i_0_) {
		if (((Class419) this).aBool4950)
			return (Class269.anInt2861 * 1960824389 - i) / 2;
		return 0;
	}

	public int method292() {
		return 0;
	}

	public void method283(boolean bool, int i) {
		if (!((Class419) this).aBool4954 && !((Class419) this).aBool4948) {
			((Class419) this).aBool4948 = true;
			try {
				String[] strings = Class104_Sub2.method9935(client.aString8571, '|', 207597699);
				if (strings.length < 3)
					((Class419) this).aBool4954 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class584.aCanvas7745);
					int i_1_ = 0;
					for (int i_2_ = 0; i_2_ < strings.length; i_2_++) {
						String[] strings_3_ = Class104_Sub2.method9935(strings[i_2_].trim(), '=', 207597699);
						if (strings_3_[0].equals("halign"))
							((Class419) this).aBool4950 = Boolean.parseBoolean(strings_3_[1]);
						else if (strings_3_[0].equals("valign"))
							((Class419) this).aBool4951 = Boolean.parseBoolean(strings_3_[1]);
						else if (strings_3_[0].equals("image")) {
							String[] strings_4_ = Class104_Sub2.method9935(strings_3_[1], ',', 207597699);
							Image image;
							try {
								image = method5112(strings_4_[0], -1488105669);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i_1_++);
								((Class419) this).aList4947.add(new Class402_Sub1(this, image, Class97.method1565(strings_4_[1], (byte) -68), Class97.method1565(strings_4_[2], (byte) -69)));
							}
						} else if (strings_3_[0].equals("rotatingimage")) {
							String[] strings_5_ = Class104_Sub2.method9935(strings_3_[1], ',', 207597699);
							Image image;
							try {
								image = method5112(strings_5_[0], -1074186261);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i_1_++);
								((Class419) this).aList4947.add(new Class402_Sub1_Sub1(this, image, Class97.method1565(strings_5_[1], (byte) -2), Class97.method1565(strings_5_[2], (byte) 9), Float.parseFloat(strings_5_[3])));
							}
						} else if (strings_3_[0].equals("progress")) {
							String[] strings_6_ = Class104_Sub2.method9935(strings_3_[1], ',', 207597699);
							((Class419) this).aList4947.add(new Class402_Sub2(this, Boolean.parseBoolean(strings_6_[0]), strings_6_[1], Class97.method1565(strings_6_[2], (byte) -80), Integer.decode(strings_6_[3]).intValue(), Class97.method1565(strings_6_[4], (byte) -60), Class97.method1565(strings_6_[5], (byte) 4)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				((Class419) this).aBool4954 = true;
			}
		}
		if (((Class419) this).aBool4954)
			method5121((byte) 16);
		else {
			Graphics graphics = Class584.aCanvas7745.getGraphics();
			if (null != graphics) {
				try {
					((Class419) this).aString4952 = new StringBuilder().append("").append(BaseVarType.aClass412_7963.method5058(601508705)).append("%").toString();
					((Class419) this).aString4953 = BaseVarType.aClass412_7963.method5054(1490877672);
					if (Class52.anImage492 == null)
						Class52.anImage492 = (Class584.aCanvas7745.createImage(Class269.anInt2861 * 1960824389, -530390519 * Class584.anInt7739));
					Graphics graphics_7_ = Class52.anImage492.getGraphics();
					graphics_7_.setColor(Color.BLACK);
					graphics_7_.fillRect(0, 0, 1960824389 * Class269.anInt2861, Class584.anInt7739 * -530390519);
					Iterator iterator = ((Class419) this).aList4947.iterator();
					while (iterator.hasNext()) {
						Class402 class402 = (Class402) iterator.next();
						class402.method4778(graphics_7_, -1321369470);
					}
					graphics.drawImage(Class52.anImage492, 0, 0, null);
				} catch (Exception exception) {
					((Class419) this).aBool4954 = true;
				}
			} else
				Class584.aCanvas7745.repaint();
		}
	}

	Image method5112(String string, int i) throws IOException {
		InputStream inputstream = null;
		try {
			Image image;
			inputstream = VarTransmitLevel.anApplet8067.getClass().getClassLoader().getResourceAsStream(string);
			byte[] is = new byte[12000];
			int i_8_ = 0;
			int i_9_;
			while ((i_9_ = inputstream.read()) != -1)
				is[i_8_++] = (byte) i_9_;
			Image image_10_ = Toolkit.getDefaultToolkit().createImage(is);
			inputstream.close();
			image = image_10_;
			if (null != inputstream)
				inputstream.close();
			return image;
		} catch (Exception object) {
			if (null != inputstream)
				inputstream.close();
		}
		return null;
	}

	public void method288() {
		Class165.method2670(-518007210);
	}

	public void method285(short i) {
		Class165.method2670(305932337);
	}

	public int method293(byte i) {
		return 100;
	}

	public int method291() {
		return 0;
	}

	public boolean method286(long l) {
		return true;
	}

	final int method5113(int i) {
		if (((Class419) this).aBool4951)
			return (-530390519 * Class584.anInt7739 - i) / 2;
		return 0;
	}

	final int method5114(int i) {
		if (((Class419) this).aBool4950)
			return (Class269.anInt2861 * 1960824389 - i) / 2;
		return 0;
	}

	final int method5115(int i) {
		if (((Class419) this).aBool4950)
			return (Class269.anInt2861 * 1960824389 - i) / 2;
		return 0;
	}

	final int method5116(int i) {
		if (((Class419) this).aBool4950)
			return (Class269.anInt2861 * 1960824389 - i) / 2;
		return 0;
	}

	final int method5117(int i) {
		if (((Class419) this).aBool4950)
			return (Class269.anInt2861 * 1960824389 - i) / 2;
		return 0;
	}

	final int method5118(int i) {
		if (((Class419) this).aBool4951)
			return (-530390519 * Class584.anInt7739 - i) / 2;
		return 0;
	}

	public boolean method289(long l) {
		return true;
	}

	public void method22(byte i) {
		/* empty */
	}

	void method5119() {
		Class558.method6601(BaseVarType.aClass412_7963.method5058(-29093207), BaseVarType.aClass412_7963.method5054(42182442), client.aColorArray8611[-826921689 * client.anInt8617], client.aColorArray8893[-826921689 * client.anInt8617], client.aColorArray8613[client.anInt8617 * -826921689], (byte) 1);
	}

	void method5120() {
		Class558.method6601(BaseVarType.aClass412_7963.method5058(675741555), BaseVarType.aClass412_7963.method5054(1387486959), client.aColorArray8611[-826921689 * client.anInt8617], client.aColorArray8893[-826921689 * client.anInt8617], client.aColorArray8613[client.anInt8617 * -826921689], (byte) 1);
	}

	public int method287(byte i) {
		return 0;
	}

	public void method29() {
		/* empty */
	}

	public void method30() {
		/* empty */
	}

	public void method294(boolean bool) {
		if (!((Class419) this).aBool4954 && !((Class419) this).aBool4948) {
			((Class419) this).aBool4948 = true;
			try {
				String[] strings = Class104_Sub2.method9935(client.aString8571, '|', 207597699);
				if (strings.length < 3)
					((Class419) this).aBool4954 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class584.aCanvas7745);
					int i = 0;
					for (int i_11_ = 0; i_11_ < strings.length; i_11_++) {
						String[] strings_12_ = Class104_Sub2.method9935(strings[i_11_].trim(), '=', 207597699);
						if (strings_12_[0].equals("halign"))
							((Class419) this).aBool4950 = Boolean.parseBoolean(strings_12_[1]);
						else if (strings_12_[0].equals("valign"))
							((Class419) this).aBool4951 = Boolean.parseBoolean(strings_12_[1]);
						else if (strings_12_[0].equals("image")) {
							String[] strings_13_ = Class104_Sub2.method9935(strings_12_[1], ',', 207597699);
							Image image;
							try {
								image = method5112(strings_13_[0], 2093048093);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								((Class419) this).aList4947.add(new Class402_Sub1(this, image, Class97.method1565(strings_13_[1], (byte) -50), Class97.method1565(strings_13_[2], (byte) -75)));
							}
						} else if (strings_12_[0].equals("rotatingimage")) {
							String[] strings_14_ = Class104_Sub2.method9935(strings_12_[1], ',', 207597699);
							Image image;
							try {
								image = method5112(strings_14_[0], 56996598);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								((Class419) this).aList4947.add(new Class402_Sub1_Sub1(this, image, Class97.method1565(strings_14_[1], (byte) -72), Class97.method1565(strings_14_[2], (byte) -62), Float.parseFloat(strings_14_[3])));
							}
						} else if (strings_12_[0].equals("progress")) {
							String[] strings_15_ = Class104_Sub2.method9935(strings_12_[1], ',', 207597699);
							((Class419) this).aList4947.add(new Class402_Sub2(this, Boolean.parseBoolean(strings_15_[0]), strings_15_[1], Class97.method1565(strings_15_[2], (byte) -17), Integer.decode(strings_15_[3]).intValue(), Class97.method1565(strings_15_[4], (byte) -32), Class97.method1565(strings_15_[5], (byte) -17)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				((Class419) this).aBool4954 = true;
			}
		}
		if (((Class419) this).aBool4954)
			method5121((byte) 121);
		else {
			Graphics graphics = Class584.aCanvas7745.getGraphics();
			if (null != graphics) {
				try {
					((Class419) this).aString4952 = new StringBuilder().append("").append(BaseVarType.aClass412_7963.method5058(1500639632)).append("%").toString();
					((Class419) this).aString4953 = BaseVarType.aClass412_7963.method5054(1029582637);
					if (Class52.anImage492 == null)
						Class52.anImage492 = (Class584.aCanvas7745.createImage(Class269.anInt2861 * 1960824389, -530390519 * Class584.anInt7739));
					Graphics graphics_16_ = Class52.anImage492.getGraphics();
					graphics_16_.setColor(Color.BLACK);
					graphics_16_.fillRect(0, 0, 1960824389 * Class269.anInt2861, Class584.anInt7739 * -530390519);
					Iterator iterator = ((Class419) this).aList4947.iterator();
					while (iterator.hasNext()) {
						Class402 class402 = (Class402) iterator.next();
						class402.method4778(graphics_16_, -1075126786);
					}
					graphics.drawImage(Class52.anImage492, 0, 0, null);
				} catch (Exception exception) {
					((Class419) this).aBool4954 = true;
				}
			} else
				Class584.aCanvas7745.repaint();
		}
	}

	Class419() {
		/* empty */
	}

	public void method295(boolean bool) {
		if (!((Class419) this).aBool4954 && !((Class419) this).aBool4948) {
			((Class419) this).aBool4948 = true;
			try {
				String[] strings = Class104_Sub2.method9935(client.aString8571, '|', 207597699);
				if (strings.length < 3)
					((Class419) this).aBool4954 = true;
				else {
					MediaTracker mediatracker = new MediaTracker(Class584.aCanvas7745);
					int i = 0;
					for (int i_17_ = 0; i_17_ < strings.length; i_17_++) {
						String[] strings_18_ = Class104_Sub2.method9935(strings[i_17_].trim(), '=', 207597699);
						if (strings_18_[0].equals("halign"))
							((Class419) this).aBool4950 = Boolean.parseBoolean(strings_18_[1]);
						else if (strings_18_[0].equals("valign"))
							((Class419) this).aBool4951 = Boolean.parseBoolean(strings_18_[1]);
						else if (strings_18_[0].equals("image")) {
							String[] strings_19_ = Class104_Sub2.method9935(strings_18_[1], ',', 207597699);
							Image image;
							try {
								image = method5112(strings_19_[0], -1160017568);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								((Class419) this).aList4947.add(new Class402_Sub1(this, image, Class97.method1565(strings_19_[1], (byte) -54), Class97.method1565(strings_19_[2], (byte) -15)));
							}
						} else if (strings_18_[0].equals("rotatingimage")) {
							String[] strings_20_ = Class104_Sub2.method9935(strings_18_[1], ',', 207597699);
							Image image;
							try {
								image = method5112(strings_20_[0], -1683978047);
							} catch (Exception exception) {
								image = null;
							}
							if (image != null) {
								mediatracker.addImage(image, i++);
								((Class419) this).aList4947.add(new Class402_Sub1_Sub1(this, image, Class97.method1565(strings_20_[1], (byte) -50), Class97.method1565(strings_20_[2], (byte) -70), Float.parseFloat(strings_20_[3])));
							}
						} else if (strings_18_[0].equals("progress")) {
							String[] strings_21_ = Class104_Sub2.method9935(strings_18_[1], ',', 207597699);
							((Class419) this).aList4947.add(new Class402_Sub2(this, Boolean.parseBoolean(strings_21_[0]), strings_21_[1], Class97.method1565(strings_21_[2], (byte) -18), Integer.decode(strings_21_[3]).intValue(), Class97.method1565(strings_21_[4], (byte) -80), Class97.method1565(strings_21_[5], (byte) -120)));
						}
					}
					mediatracker.waitForAll();
				}
			} catch (Exception exception) {
				((Class419) this).aBool4954 = true;
			}
		}
		if (((Class419) this).aBool4954)
			method5121((byte) 127);
		else {
			Graphics graphics = Class584.aCanvas7745.getGraphics();
			if (null != graphics) {
				try {
					((Class419) this).aString4952 = new StringBuilder().append("").append(BaseVarType.aClass412_7963.method5058(1782490354)).append("%").toString();
					((Class419) this).aString4953 = BaseVarType.aClass412_7963.method5054(1874628334);
					if (Class52.anImage492 == null)
						Class52.anImage492 = (Class584.aCanvas7745.createImage(Class269.anInt2861 * 1960824389, -530390519 * Class584.anInt7739));
					Graphics graphics_22_ = Class52.anImage492.getGraphics();
					graphics_22_.setColor(Color.BLACK);
					graphics_22_.fillRect(0, 0, 1960824389 * Class269.anInt2861, Class584.anInt7739 * -530390519);
					Iterator iterator = ((Class419) this).aList4947.iterator();
					while (iterator.hasNext()) {
						Class402 class402 = (Class402) iterator.next();
						class402.method4778(graphics_22_, -1281841730);
					}
					graphics.drawImage(Class52.anImage492, 0, 0, null);
				} catch (Exception exception) {
					((Class419) this).aBool4954 = true;
				}
			} else
				Class584.aCanvas7745.repaint();
		}
	}

	public int method284() {
		return 0;
	}

	void method5121(byte i) {
		Class558.method6601(BaseVarType.aClass412_7963.method5058(837460410), BaseVarType.aClass412_7963.method5054(303183809), client.aColorArray8611[-826921689 * client.anInt8617], client.aColorArray8893[-826921689 * client.anInt8617], client.aColorArray8613[client.anInt8617 * -826921689], (byte) 1);
	}

	final int method5122(int i, int i_23_) {
		if (((Class419) this).aBool4951)
			return (-530390519 * Class584.anInt7739 - i) / 2;
		return 0;
	}

	public int method296() {
		return 100;
	}

	static void method5123(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 2] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 2]), 529829130))).anIntArrayArray4626[(((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 1])][1]);
		((Cs2Executor) class441).intStackPtr -= -1042067865;
	}

	public static void method5124(int i, int i_24_) {
		Class22 class22 = (Class22) Class547_Sub1.aHashMap8990.get(Integer.valueOf(i));
		if (class22 == null)
			class22 = new Class22();
		((Class22) class22).anInt149 = Class547_Sub1.anInt9000 * -2110469659;
		((Class22) class22).anInt150 = 545644611 * Class547_Sub1.anInt8993;
		Class547_Sub1.aHashMap8990.put(Integer.valueOf(i), class22);
	}

	static final void method5125(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class611.aClass456_Sub1_Sub2_Sub3_Sub2_7976.method10530(-1706730391).method5938(1261639274);
	}
}

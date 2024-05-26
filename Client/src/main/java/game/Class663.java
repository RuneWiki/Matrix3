package game;

/* Class663 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class663 {
	Class666 aClass666_8473;
	public static final int anInt8474 = 1;
	public static final int anInt8475 = 2;
	AnimationDefinition aClass132_8476;
	int anInt8477;
	public static final int anInt8478 = 0;
	int anInt8479;
	int anInt8480;
	boolean aBool8481;
	boolean aBool8482 = false;
	boolean aBool8483 = false;
	int anInt8484 = 0;
	int anInt8485;
	Class666 aClass666_8486;
	int anInt8487;

	public final void method7785(int i) {
		((Class663) this).anInt8485 = 39181427 * i;
	}

	public final boolean method7786(int i) {
		return null != ((Class663) this).aClass132_8476;
	}

	public final AnimationDefinition method7787(int i) {
		return ((Class663) this).aClass132_8476;
	}

	public final boolean method7788() {
		return null != ((Class663) this).aClass132_8476;
	}

	public final void method7789(int i, int i_0_, byte i_1_) {
		method7792(i, i_0_, 0, false, -1071456507);
	}

	public final void method7790(int i, boolean bool, byte i_2_) {
		method7792(i, 0, 0, bool, 1093457852);
	}

	public final void method7791(int i, boolean bool, boolean bool_3_, byte i_4_) {
		method7817(i, 0, 0, bool, bool_3_, -2146598638);
	}

	public final void method7792(int i, int i_5_, int i_6_, boolean bool, int i_7_) {
		method7817(i, i_5_, i_6_, bool, false, -1842833735);
	}

	public final boolean method7793(int i) {
		return 0 != -1403901765 * ((Class663) this).anInt8485;
	}

	public final int method7794(int i) {
		if (method7804((byte) -101)) {
			int i_8_ = 0;
			if (method7804((byte) -55)) {
				i_8_ |= -507608693 * ((Class666) (((Class663) this).aClass666_8486)).anInt8498;
				if (((Class663) this).aBool8483 && null != ((Class663) this).aClass132_8476.anIntArray1545)
					i_8_ |= (-507608693 * (((Class666) ((Class663) this).aClass666_8473).anInt8498));
			}
			return i_8_;
		}
		return 0;
	}

	public final int method7795(int i) {
		return (((Class663) this).aClass132_8476 != null ? ((Class663) this).aClass132_8476.anInt1543 * -127325325 : -1);
	}

	public final void method7796() {
		method7805(0, (short) 256);
	}

	public final void method7797(Model model, int i, byte i_9_) {
		if (((Class663) this).aClass132_8476 != null) {
			if (((Class663) this).aClass132_8476.anIntArray1544 != null && method7804((byte) -31)) {
				model.method1364((((Class666) ((Class663) this).aClass666_8486).aClass572_Sub12_Sub7_8499), (((Class666) ((Class663) this).aClass666_8486).anInt8497 * 2108276129), (((Class666) ((Class663) this).aClass666_8486).aClass572_Sub12_Sub7_8500), (((Class666) ((Class663) this).aClass666_8486).anInt8501 * -1595624283), ((Class663) this).anInt8477 * 124467093, (((Class663) this).aClass132_8476.anIntArray1546[-1346270121 * ((Class663) this).anInt8480]), i, ((Class663) this).aClass132_8476.aBool1563);
				if (((Class663) this).aBool8483 && ((Class663) this).aClass132_8476.anIntArray1545 != null && ((Class666) ((Class663) this).aClass666_8473).aBool8496)
					model.method1364((((Class666) ((Class663) this).aClass666_8473).aClass572_Sub12_Sub7_8499), (((Class666) ((Class663) this).aClass666_8473).anInt8497) * 2108276129, (((Class666) ((Class663) this).aClass666_8473).aClass572_Sub12_Sub7_8500), (((Class666) ((Class663) this).aClass666_8473).anInt8501) * -1595624283, 124467093 * ((Class663) this).anInt8477, (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121]), i, ((Class663) this).aClass132_8476.aBool1563);
			}
		}
	}

	public final void method7798(Model model, int i, int i_10_, byte i_11_) {
		if (((Class663) this).aClass132_8476.anIntArray1544 != null && method7804((byte) -101)) {
			model.method1365((((Class666) ((Class663) this).aClass666_8486).aClass572_Sub12_Sub7_8499), (2108276129 * ((Class666) ((Class663) this).aClass666_8486).anInt8497), (((Class666) ((Class663) this).aClass666_8486).aClass572_Sub12_Sub7_8500), (-1595624283 * ((Class666) ((Class663) this).aClass666_8486).anInt8501), ((Class663) this).anInt8477 * 124467093, (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121]), i, i_10_, ((Class663) this).aClass132_8476.aBool1563, null);
			if (((Class663) this).aBool8483 && null != ((Class663) this).aClass132_8476.anIntArray1545 && ((Class666) ((Class663) this).aClass666_8473).aBool8496)
				model.method1365((((Class666) ((Class663) this).aClass666_8473).aClass572_Sub12_Sub7_8499), (((Class666) ((Class663) this).aClass666_8473).anInt8497 * 2108276129), (((Class666) ((Class663) this).aClass666_8473).aClass572_Sub12_Sub7_8500), (((Class666) ((Class663) this).aClass666_8473).anInt8501 * -1595624283), 124467093 * ((Class663) this).anInt8477, (((Class663) this).aClass132_8476.anIntArray1546[-1346270121 * ((Class663) this).anInt8480]), i, i_10_, ((Class663) this).aClass132_8476.aBool1563, null);
		}
	}

	public final void method7799(int i) {
		method7805(0, (short) 256);
	}

	public final boolean method7800(int i) {
		return ((Class663) this).aBool8482;
	}

	public final void method7801(int i, int i_12_) {
		method7792(i, 0, 0, false, -2085796907);
	}

	public final boolean method7802(int i, int i_13_) {
		if (null == ((Class663) this).aClass132_8476 || i == 0)
			return false;
		if (-1403901765 * ((Class663) this).anInt8485 > 0) {
			if (((Class663) this).anInt8485 * -1403901765 > i) {
				((Class663) this).anInt8485 -= 39181427 * i;
				return false;
			}
			i -= -1403901765 * ((Class663) this).anInt8485;
			((Class663) this).anInt8485 = 0;
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -82);
		}
		i += 124467093 * ((Class663) this).anInt8477;
		boolean bool = ((Class663) this).aClass132_8476.aBool1560 | AnimationDefinition.aBool1547;
		if (i > 100 && 1363516413 * ((Class663) this).aClass132_8476.anInt1549 > 0) {
			int i_14_;
			for (i_14_ = (((Class663) this).aClass132_8476.anIntArray1544.length - (1363516413 * ((Class663) this).aClass132_8476.anInt1549)); (((Class663) this).anInt8480 * -1346270121 < i_14_ && i > (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121])); ((Class663) this).anInt8480 += 2058231655)
				i -= (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121]);
			if (((Class663) this).anInt8480 * -1346270121 >= i_14_) {
				int i_15_ = 0;
				for (int i_16_ = i_14_; i_16_ < (((Class663) this).aClass132_8476.anIntArray1544).length; i_16_++)
					i_15_ += (((Class663) this).aClass132_8476.anIntArray1546[i_16_]);
				if (-171006131 * ((Class663) this).anInt8484 == 0)
					((Class663) this).anInt8479 += i / i_15_ * -787518373;
				i %= i_15_;
			}
			((Class663) this).anInt8487 = -1342050073 * ((Class663) this).anInt8480 + -537532943;
			if (((Class663) this).anInt8487 * 579889937 >= ((Class663) this).aClass132_8476.anIntArray1544.length) {
				if ((((Class663) this).aClass132_8476.anInt1549 * 1363516413 == -1) && ((Class663) this).aBool8481)
					((Class663) this).anInt8487 = 0;
				else
					((Class663) this).anInt8487 -= (1932667437 * ((Class663) this).aClass132_8476.anInt1549);
				if (((Class663) this).anInt8487 * 579889937 < 0 || (579889937 * ((Class663) this).anInt8487 >= (((Class663) this).aClass132_8476.anIntArray1544).length))
					((Class663) this).anInt8487 = 537532943;
			}
			bool = true;
		}
		while (i > (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121])) {
			bool = true;
			i -= (((Class663) this).aClass132_8476.anIntArray1546[((((Class663) this).anInt8480 += 2058231655) * -1346270121 - 1)]);
			if (((Class663) this).anInt8480 * -1346270121 >= ((Class663) this).aClass132_8476.anIntArray1544.length) {
				if (-1 != (((Class663) this).aClass132_8476.anInt1549 * 1363516413) && 2 != ((Class663) this).anInt8484 * -171006131) {
					((Class663) this).anInt8480 -= (-1193581109 * ((Class663) this).aClass132_8476.anInt1549);
					if (0 == -171006131 * ((Class663) this).anInt8484)
						((Class663) this).anInt8479 += -787518373;
				}
				if ((((Class663) this).anInt8479 * -1548753965 >= (-730136871 * ((Class663) this).aClass132_8476.anInt1555)) || -1346270121 * ((Class663) this).anInt8480 < 0 || (((Class663) this).anInt8480 * -1346270121 >= (((Class663) this).aClass132_8476.anIntArray1544).length)) {
					((Class663) this).aBool8482 = true;
					break;
				}
			}
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -67);
			((Class663) this).anInt8487 = -537532943 + ((Class663) this).anInt8480 * -1342050073;
			if (579889937 * ((Class663) this).anInt8487 >= ((Class663) this).aClass132_8476.anIntArray1544.length) {
				if (-1 == (1363516413 * ((Class663) this).aClass132_8476.anInt1549) && ((Class663) this).aBool8481)
					((Class663) this).anInt8487 = 0;
				else
					((Class663) this).anInt8487 -= (((Class663) this).aClass132_8476.anInt1549 * 1932667437);
				if (((Class663) this).anInt8487 * 579889937 < 0 || (((Class663) this).anInt8487 * 579889937 >= (((Class663) this).aClass132_8476.anIntArray1544).length))
					((Class663) this).anInt8487 = 537532943;
			}
		}
		((Class663) this).anInt8477 = i * 1732139965;
		if (bool)
			method7836(-2108124000);
		return bool;
	}

	public final boolean method7803(int i, int i_17_) {
		if (((Class663) this).aClass132_8476 == null | (i -= ((Class663) this).anInt8485 * -1403901765) <= 0)
			return false;
		return (((Class663) this).aClass132_8476.aBool1560 | (124467093 * ((Class663) this).anInt8477 + i > (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121])));
	}

	final boolean method7804(byte i) {
		if (null != ((Class663) this).aClass132_8476) {
			boolean bool = (((Class663) this).aClass666_8486.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1544, -633062035));
			if (bool && ((Class663) this).aBool8483 && ((Class663) this).aClass132_8476.anIntArray1545 != null)
				((Class663) this).aClass666_8473.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, -1346270121 * ((Class663) this).anInt8480, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1545, 108472963);
			return bool;
		}
		return false;
	}

	public final void method7805(int i, short i_18_) {
		((Class663) this).anInt8480 = 0;
		((Class663) this).anInt8487 = (-537532943 * (((Class663) this).aClass132_8476.anIntArray1544.length > 1 ? 1 : -1));
		((Class663) this).anInt8477 = 0;
		((Class663) this).aBool8482 = false;
		((Class663) this).anInt8485 = 39181427 * i;
		((Class663) this).anInt8479 = 0;
		if (null != ((Class663) this).aClass132_8476 & ((Class663) this).aClass132_8476.anIntArray1544 != null) {
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) 29);
			method7836(-1706304041);
		}
	}

	void method7806(AnimationDefinition class132, int i) {
		/* empty */
	}

	void method7807(AnimationDefinition class132, int i) {
		/* empty */
	}

	public final int method7808(byte i) {
		return ((Class663) this).anInt8485 * -1403901765;
	}

	public final void method7809(int i) {
		((Class663) this).anInt8485 = 39181427 * i;
	}

	void method7810(AnimationDefinition class132, int i, byte i_19_) {
		/* empty */
	}

	final boolean method7811() {
		if (null != ((Class663) this).aClass132_8476) {
			boolean bool = (((Class663) this).aClass666_8486.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1544, -358814554));
			if (bool && ((Class663) this).aBool8483 && ((Class663) this).aClass132_8476.anIntArray1545 != null)
				((Class663) this).aClass666_8473.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, -1346270121 * ((Class663) this).anInt8480, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1545, 561580769);
			return bool;
		}
		return false;
	}

	public final int method7812() {
		return (((Class663) this).aClass132_8476 != null ? ((Class663) this).aClass132_8476.anInt1543 * -127325325 : -1);
	}

	public final int method7813() {
		return (((Class663) this).aClass132_8476 != null ? ((Class663) this).aClass132_8476.anInt1543 * -127325325 : -1);
	}

	public final void method7814(int i) {
		method7792(i, 0, 0, false, -505814922);
	}

	public final void method7815(int i, int i_20_) {
		method7792(i, i_20_, 0, false, 577949837);
	}

	public final void method7816() {
		((Class663) this).anInt8479 = 0;
	}

	final void method7817(int i, int i_21_, int i_22_, boolean bool, boolean bool_23_, int i_24_) {
		if (i != method7795(-1478180242)) {
			if (-1 != i) {
				if (null != ((Class663) this).aClass132_8476 && (((Class663) this).aClass132_8476.anInt1543 * -127325325 == i)) {
					if (0 == (-730435523 * ((Class663) this).aClass132_8476.anInt1558))
						return;
				} else {
					((Class663) this).aClass132_8476 = (AnimationDefinition) Class92.aClass639_Sub18_1241.getDefinition(i, -667831078);
					if (((Class663) this).aClass132_8476 == null || (((Class663) this).aClass132_8476.anIntArray1544 == null)) {
						((Class663) this).aClass132_8476 = null;
						return;
					}
				}
				((Class663) this).anInt8479 = 0;
				((Class663) this).anInt8485 = 39181427 * i_21_;
				((Class663) this).anInt8484 = 1205266821 * i_22_;
				((Class663) this).aBool8481 = bool_23_;
				if (bool) {
					((Class663) this).anInt8480 = ((int) (Math.random() * (double) (((Class663) this).aClass132_8476.anIntArray1544).length) * 2058231655);
					((Class663) this).anInt8477 = ((int) (Math.random() * (double) (((Class663) this).aClass132_8476.anIntArray1546[-1346270121 * (((Class663) this).anInt8480)])) * 1732139965);
				} else {
					((Class663) this).anInt8480 = 0;
					((Class663) this).anInt8477 = 0;
				}
				((Class663) this).anInt8487 = -537532943 + ((Class663) this).anInt8480 * -1342050073;
				if (579889937 * ((Class663) this).anInt8487 < 0 || (579889937 * ((Class663) this).anInt8487 >= (((Class663) this).aClass132_8476.anIntArray1544).length))
					((Class663) this).anInt8487 = 537532943;
				if (((Class663) this).anInt8485 * -1403901765 == 0)
					method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -85);
				((Class663) this).aBool8482 = false;
			} else
				((Class663) this).aClass132_8476 = null;
			method7836(-1812581746);
		}
	}

	public final int method7818() {
		return ((Class663) this).anInt8485 * -1403901765;
	}

	public final void method7819() {
		method7805(0, (short) 256);
	}

	public final void method7820(int i) {
		((Class663) this).anInt8485 = 39181427 * i;
	}

	public final boolean method7821(int i) {
		if (null == ((Class663) this).aClass132_8476 || i == 0)
			return false;
		if (-1403901765 * ((Class663) this).anInt8485 > 0) {
			if (((Class663) this).anInt8485 * -1403901765 > i) {
				((Class663) this).anInt8485 -= 39181427 * i;
				return false;
			}
			i -= -1403901765 * ((Class663) this).anInt8485;
			((Class663) this).anInt8485 = 0;
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -11);
		}
		i += 124467093 * ((Class663) this).anInt8477;
		boolean bool = ((Class663) this).aClass132_8476.aBool1560 | AnimationDefinition.aBool1547;
		if (i > 100 && 1363516413 * ((Class663) this).aClass132_8476.anInt1549 > 0) {
			int i_25_;
			for (i_25_ = (((Class663) this).aClass132_8476.anIntArray1544.length - (1363516413 * ((Class663) this).aClass132_8476.anInt1549)); (((Class663) this).anInt8480 * -1346270121 < i_25_ && i > (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121])); ((Class663) this).anInt8480 += 2058231655)
				i -= (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121]);
			if (((Class663) this).anInt8480 * -1346270121 >= i_25_) {
				int i_26_ = 0;
				for (int i_27_ = i_25_; i_27_ < (((Class663) this).aClass132_8476.anIntArray1544).length; i_27_++)
					i_26_ += (((Class663) this).aClass132_8476.anIntArray1546[i_27_]);
				if (-171006131 * ((Class663) this).anInt8484 == 0)
					((Class663) this).anInt8479 += i / i_26_ * -787518373;
				i %= i_26_;
			}
			((Class663) this).anInt8487 = -1342050073 * ((Class663) this).anInt8480 + -537532943;
			if (((Class663) this).anInt8487 * 579889937 >= ((Class663) this).aClass132_8476.anIntArray1544.length) {
				if ((((Class663) this).aClass132_8476.anInt1549 * 1363516413 == -1) && ((Class663) this).aBool8481)
					((Class663) this).anInt8487 = 0;
				else
					((Class663) this).anInt8487 -= (1932667437 * ((Class663) this).aClass132_8476.anInt1549);
				if (((Class663) this).anInt8487 * 579889937 < 0 || (579889937 * ((Class663) this).anInt8487 >= (((Class663) this).aClass132_8476.anIntArray1544).length))
					((Class663) this).anInt8487 = 537532943;
			}
			bool = true;
		}
		while (i > (((Class663) this).aClass132_8476.anIntArray1546[((Class663) this).anInt8480 * -1346270121])) {
			bool = true;
			i -= (((Class663) this).aClass132_8476.anIntArray1546[((((Class663) this).anInt8480 += 2058231655) * -1346270121 - 1)]);
			if (((Class663) this).anInt8480 * -1346270121 >= ((Class663) this).aClass132_8476.anIntArray1544.length) {
				if (-1 != (((Class663) this).aClass132_8476.anInt1549 * 1363516413) && 2 != ((Class663) this).anInt8484 * -171006131) {
					((Class663) this).anInt8480 -= (-1193581109 * ((Class663) this).aClass132_8476.anInt1549);
					if (0 == -171006131 * ((Class663) this).anInt8484)
						((Class663) this).anInt8479 += -787518373;
				}
				if ((((Class663) this).anInt8479 * -1548753965 >= (-730136871 * ((Class663) this).aClass132_8476.anInt1555)) || -1346270121 * ((Class663) this).anInt8480 < 0 || (((Class663) this).anInt8480 * -1346270121 >= (((Class663) this).aClass132_8476.anIntArray1544).length)) {
					((Class663) this).aBool8482 = true;
					break;
				}
			}
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -79);
			((Class663) this).anInt8487 = -537532943 + ((Class663) this).anInt8480 * -1342050073;
			if (579889937 * ((Class663) this).anInt8487 >= ((Class663) this).aClass132_8476.anIntArray1544.length) {
				if (-1 == (1363516413 * ((Class663) this).aClass132_8476.anInt1549) && ((Class663) this).aBool8481)
					((Class663) this).anInt8487 = 0;
				else
					((Class663) this).anInt8487 -= (((Class663) this).aClass132_8476.anInt1549 * 1932667437);
				if (((Class663) this).anInt8487 * 579889937 < 0 || (((Class663) this).anInt8487 * 579889937 >= (((Class663) this).aClass132_8476.anIntArray1544).length))
					((Class663) this).anInt8487 = 537532943;
			}
		}
		((Class663) this).anInt8477 = i * 1732139965;
		if (bool)
			method7836(-2020857353);
		return bool;
	}

	public final void method7822(int i) {
		((Class663) this).anInt8485 = 39181427 * i;
	}

	public final int method7823() {
		if (method7804((byte) -66)) {
			int i = 0;
			if (method7804((byte) -113)) {
				i |= -507608693 * ((Class666) ((Class663) this).aClass666_8486).anInt8498;
				if (((Class663) this).aBool8483 && null != ((Class663) this).aClass132_8476.anIntArray1545)
					i |= -507608693 * ((Class666) (((Class663) this).aClass666_8473)).anInt8498;
			}
			return i;
		}
		return 0;
	}

	public final void method7824(Class663 class663_28_, int i) {
		((Class663) this).aClass132_8476 = ((Class663) class663_28_).aClass132_8476;
		((Class663) this).aBool8482 = ((Class663) class663_28_).aBool8482;
		((Class663) this).aBool8483 = ((Class663) class663_28_).aBool8483;
		((Class663) this).anInt8485 = ((Class663) class663_28_).anInt8485 * 1;
		((Class663) this).anInt8479 = ((Class663) class663_28_).anInt8479 * 1;
		((Class663) this).anInt8480 = ((Class663) class663_28_).anInt8480 * 1;
		((Class663) this).anInt8487 = ((Class663) class663_28_).anInt8487 * 1;
		((Class663) this).anInt8477 = 1 * ((Class663) class663_28_).anInt8477;
		method7836(-1893280657);
	}

	public final boolean method7825() {
		return 0 != -1403901765 * ((Class663) this).anInt8485;
	}

	public final int method7826() {
		return ((Class663) this).anInt8485 * -1403901765;
	}

	public final void method7827(int i, int i_29_) {
		((Class663) this).anInt8485 = 39181427 * i;
	}

	public final void method7828(Model model, byte i) {
		if (((Class663) this).aClass132_8476.anIntArray1544 != null && method7804((byte) -81)) {
			model.method1367((((Class666) ((Class663) this).aClass666_8486).aClass572_Sub12_Sub7_8499), (((Class666) ((Class663) this).aClass666_8486).anInt8497) * 2108276129);
			if (((Class663) this).aBool8483 && ((Class663) this).aClass132_8476.anIntArray1545 != null && ((Class666) ((Class663) this).aClass666_8473).aBool8496)
				model.method1367((((Class666) ((Class663) this).aClass666_8473).aClass572_Sub12_Sub7_8499), (((Class666) (((Class663) this).aClass666_8473)).anInt8497 * 2108276129));
		}
	}

	public final void method7829(int i) {
		((Class663) this).anInt8480 = 0;
		((Class663) this).anInt8487 = (-537532943 * (((Class663) this).aClass132_8476.anIntArray1544.length > 1 ? 1 : -1));
		((Class663) this).anInt8477 = 0;
		((Class663) this).aBool8482 = false;
		((Class663) this).anInt8485 = 39181427 * i;
		((Class663) this).anInt8479 = 0;
		if (null != ((Class663) this).aClass132_8476 & ((Class663) this).aClass132_8476.anIntArray1544 != null) {
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -59);
			method7836(-2042248101);
		}
	}

	Class663(boolean bool) {
		((Class663) this).aBool8481 = false;
		((Class663) this).aBool8483 = bool;
		((Class663) this).aClass666_8486 = new Class666();
		if (((Class663) this).aBool8483)
			((Class663) this).aClass666_8473 = new Class666();
		else
			((Class663) this).aClass666_8473 = null;
	}

	public final void method7830() {
		method7805(0, (short) 256);
	}

	public final void method7831(int i) {
		((Class663) this).anInt8479 = 0;
	}

	public final void method7832(int i) {
		((Class663) this).anInt8480 = 0;
		((Class663) this).anInt8487 = (-537532943 * (((Class663) this).aClass132_8476.anIntArray1544.length > 1 ? 1 : -1));
		((Class663) this).anInt8477 = 0;
		((Class663) this).aBool8482 = false;
		((Class663) this).anInt8485 = 39181427 * i;
		((Class663) this).anInt8479 = 0;
		if (null != ((Class663) this).aClass132_8476 & ((Class663) this).aClass132_8476.anIntArray1544 != null) {
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -101);
			method7836(-1241765006);
		}
	}

	public final void method7833(int i) {
		((Class663) this).anInt8480 = 0;
		((Class663) this).anInt8487 = (-537532943 * (((Class663) this).aClass132_8476.anIntArray1544.length > 1 ? 1 : -1));
		((Class663) this).anInt8477 = 0;
		((Class663) this).aBool8482 = false;
		((Class663) this).anInt8485 = 39181427 * i;
		((Class663) this).anInt8479 = 0;
		if (null != ((Class663) this).aClass132_8476 & ((Class663) this).aClass132_8476.anIntArray1544 != null) {
			method7810(((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, (byte) -49);
			method7836(-1830722491);
		}
	}

	public final boolean method7834() {
		return null != ((Class663) this).aClass132_8476;
	}

	public final int method7835() {
		if (method7804((byte) -40)) {
			int i = 0;
			if (method7804((byte) -84)) {
				i |= -507608693 * ((Class666) ((Class663) this).aClass666_8486).anInt8498;
				if (((Class663) this).aBool8483 && null != ((Class663) this).aClass132_8476.anIntArray1545)
					i |= -507608693 * ((Class666) (((Class663) this).aClass666_8473)).anInt8498;
			}
			return i;
		}
		return 0;
	}

	final void method7836(int i) {
		((Class663) this).aClass666_8486.method7872(-1016419302);
		if (((Class663) this).aBool8483)
			((Class663) this).aClass666_8473.method7872(-694708054);
	}

	final boolean method7837() {
		if (null != ((Class663) this).aClass132_8476) {
			boolean bool = (((Class663) this).aClass666_8486.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1544, 591177909));
			if (bool && ((Class663) this).aBool8483 && ((Class663) this).aClass132_8476.anIntArray1545 != null)
				((Class663) this).aClass666_8473.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, -1346270121 * ((Class663) this).anInt8480, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1545, -1228691502);
			return bool;
		}
		return false;
	}

	final boolean method7838() {
		if (null != ((Class663) this).aClass132_8476) {
			boolean bool = (((Class663) this).aClass666_8486.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, ((Class663) this).anInt8480 * -1346270121, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1544, 448996676));
			if (bool && ((Class663) this).aBool8483 && ((Class663) this).aClass132_8476.anIntArray1545 != null)
				((Class663) this).aClass666_8473.method7871(Class92.aClass639_Sub18_1241, ((Class663) this).aClass132_8476, -1346270121 * ((Class663) this).anInt8480, 579889937 * ((Class663) this).anInt8487, ((Class663) this).aClass132_8476.anIntArray1545, -391842558);
			return bool;
		}
		return false;
	}

	static final void method7839(Cs2Executor class441, byte i) {
		int i_30_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		int i_31_ = client.exchangeSlots[i_30_].method7007(1838662158);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_31_ == 1 ? 1 : 0;
	}

	static final void method7840(Cs2Executor class441, byte i) {
		boolean bool = ((((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]) != 0);
		int i_32_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = Class124.method2204((long) i_32_, 0, bool, Class594.aClass435_7823, 633660252);
	}
}

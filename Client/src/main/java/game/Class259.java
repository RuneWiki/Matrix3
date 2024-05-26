package game;

/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class259 {
	Class617 aClass617_2786;
	Class224_Sub1[] aClass224_Sub1Array2787;
	Class267 aClass267_2788;
	Class278 aClass278_2789;
	boolean aBool2790 = false;
	Class572_Sub12_Sub16_Sub2 aClass572_Sub12_Sub16_Sub2_2791;
	Class572_Sub12_Sub16_Sub1 aClass572_Sub12_Sub16_Sub1_2792;
	Class286 aClass286_2793;
	Class286 aClass286_2794;
	BigInteger aBigInteger2795;
	BigInteger aBigInteger2796;

	public boolean method3546(short i) {
		if (null != ((Class259) this).aClass286_2793)
			return true;
		if (((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 == null) {
			if (((Class259) this).aClass278_2789.method3745(548776394))
				return false;
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 1502886682);
		}
		if (((Class572_Sub12_Sub16_Sub2) ((Class259) this).aClass572_Sub12_Sub16_Sub2_2791).aBool11476)
			return false;
		RSByteBuffer class572_sub15 = new RSByteBuffer(((Class259) this).aClass572_Sub12_Sub16_Sub2_2791.method10440((byte) 81));
		((Class259) this).aClass286_2793 = new Class286(class572_sub15, ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
		if (((Class259) this).aClass224_Sub1Array2787 == null)
			((Class259) this).aClass224_Sub1Array2787 = (new Class224_Sub1[(((Class286) ((Class259) this).aClass286_2793).aClass232Array3420).length]);
		else {
			for (int i_0_ = 0; i_0_ < ((Class259) this).aClass224_Sub1Array2787.length; i_0_++) {
				if (((Class259) this).aClass224_Sub1Array2787[i_0_] != null) {
					Class232 class232 = (((Class286) ((Class259) this).aClass286_2793).aClass232Array3420[i_0_]);
					((Class259) this).aClass224_Sub1Array2787[i_0_].method8827(((Class232) class232).anInt2630 * 1188608489, ((Class232) class232).aByteArray2631, ((Class232) class232).anInt2629 * 61783791, 2039135227 * ((Class232) class232).anInt2628, (byte) 96);
					if (((Class259) this).aClass224_Sub1Array2787[i_0_].method8831(-130672329))
						((Class259) this).aClass224_Sub1Array2787[i_0_].method8837(false, (byte) 115);
				}
			}
		}
		((Class259) this).aBool2790 = false;
		return true;
	}

	public void method3547(int i) {
		((Class259) this).aClass286_2793 = null;
		((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = null;
		((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = null;
		((Class259) this).aBool2790 = false;
		if (!((Class259) this).aClass278_2789.method3745(505179621))
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 1058108133);
	}

	public Class224_Sub1 method3548(int i, Class558 class558, Class558 class558_1_, boolean bool, byte i_2_) {
		return method3549(i, class558, class558_1_, true, bool, -954203422);
	}

	Class224_Sub1 method3549(int i, Class558 class558, Class558 class558_3_, boolean bool, boolean bool_4_, int i_5_) {
		if (null == ((Class259) this).aClass286_2793)
			throw new RuntimeException();
		if (i < 0 || i >= ((Class259) this).aClass224_Sub1Array2787.length)
			throw new RuntimeException();
		if (((Class259) this).aClass224_Sub1Array2787[i] != null)
			return ((Class259) this).aClass224_Sub1Array2787[i];
		Class232 class232 = (((Class286) ((Class259) this).aClass286_2793).aClass232Array3420[i]);
		Class224_Sub1 class224_sub1 = new Class224_Sub1(i, class558, class558_3_, ((Class259) this).aClass278_2789, (bool_4_ ? ((Class259) this).aClass617_2786 : null), ((Class259) this).aClass267_2788, 1188608489 * ((Class232) class232).anInt2630, ((Class232) class232).aByteArray2631, 61783791 * ((Class232) class232).anInt2629, bool, ((Class232) class232).anInt2628 * 2039135227);
		((Class259) this).aClass224_Sub1Array2787[i] = class224_sub1;
		if (null != ((Class259) this).aClass286_2794 && bool_4_) {
			Class232 class232_6_ = (((Class286) ((Class259) this).aClass286_2794).aClass232Array3420[i]);
			((Class259) this).aClass224_Sub1Array2787[i].method8837((((Class259) this).aClass224_Sub1Array2787[i].method8828(1188608489 * ((Class232) class232_6_).anInt2630, ((Class232) class232_6_).aByteArray2631, ((Class232) class232_6_).anInt2629 * 61783791, ((Class232) class232_6_).anInt2628 * 2039135227, (byte) -112)), (byte) 114);
		}
		return class224_sub1;
	}

	public void method3550(int i) {
		if (((Class259) this).aClass224_Sub1Array2787 != null) {
			for (int i_7_ = 0; i_7_ < ((Class259) this).aClass224_Sub1Array2787.length; i_7_++) {
				if (null != ((Class259) this).aClass224_Sub1Array2787[i_7_])
					((Class259) this).aClass224_Sub1Array2787[i_7_].method8858(-1718779600);
			}
			for (int i_8_ = 0; i_8_ < ((Class259) this).aClass224_Sub1Array2787.length; i_8_++) {
				if (((Class259) this).aClass224_Sub1Array2787[i_8_] != null)
					((Class259) this).aClass224_Sub1Array2787[i_8_].method8833((byte) 54);
			}
			if (((Class259) this).aClass286_2793 == null)
				method3546((short) 7072);
			else if (null != ((Class259) this).aClass617_2786 && !((Class259) this).aBool2790) {
				if (((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 == null)
					((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = ((Class259) this).aClass617_2786.method7384(1338790759);
				else if (!((Class572_Sub12_Sub16_Sub1) ((Class259) this).aClass572_Sub12_Sub16_Sub1_2792).aBool11476) {
					byte[] is = ((Class259) this).aClass572_Sub12_Sub16_Sub1_2792.method10440((byte) 75);
					try {
						((Class259) this).aClass286_2794 = new Class286(new RSByteBuffer(is), ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
						for (int i_9_ = 0; i_9_ < (((Class259) this).aClass224_Sub1Array2787).length; i_9_++) {
							if ((((Class259) this).aClass224_Sub1Array2787[i_9_]) != null && ((Class259) this).aClass224_Sub1Array2787[i_9_].method8831(1776429748)) {
								Class232 class232 = (((Class286) ((Class259) this).aClass286_2794).aClass232Array3420[i_9_]);
								((Class259) this).aClass224_Sub1Array2787[i_9_].method8837((((Class259) this).aClass224_Sub1Array2787[i_9_].method8828((((Class232) class232).anInt2630 * 1188608489), ((Class232) class232).aByteArray2631, (((Class232) class232).anInt2629 * 61783791), (((Class232) class232).anInt2628 * 2039135227), (byte) 10)), (byte) 121);
							}
						}
					} catch (Exception exception) {
						for (int i_10_ = 0; i_10_ < (((Class259) this).aClass224_Sub1Array2787).length; i_10_++) {
							if (null != (((Class259) this).aClass224_Sub1Array2787[i_10_]) && ((Class259) this).aClass224_Sub1Array2787[i_10_].method8831(1480294641))
								((Class259) this).aClass224_Sub1Array2787[i_10_].method8837(false, (byte) 126);
						}
					}
					((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = null;
					((Class259) this).aBool2790 = true;
				}
			}
		}
	}

	public boolean method3551() {
		if (null != ((Class259) this).aClass286_2793)
			return true;
		if (((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 == null) {
			if (((Class259) this).aClass278_2789.method3745(-1251063109))
				return false;
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 707929839);
		}
		if (((Class572_Sub12_Sub16_Sub2) ((Class259) this).aClass572_Sub12_Sub16_Sub2_2791).aBool11476)
			return false;
		RSByteBuffer class572_sub15 = new RSByteBuffer(((Class259) this).aClass572_Sub12_Sub16_Sub2_2791.method10440((byte) 76));
		((Class259) this).aClass286_2793 = new Class286(class572_sub15, ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
		if (((Class259) this).aClass224_Sub1Array2787 == null)
			((Class259) this).aClass224_Sub1Array2787 = (new Class224_Sub1[(((Class286) ((Class259) this).aClass286_2793).aClass232Array3420).length]);
		else {
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (((Class259) this).aClass224_Sub1Array2787[i] != null) {
					Class232 class232 = (((Class286) ((Class259) this).aClass286_2793).aClass232Array3420[i]);
					((Class259) this).aClass224_Sub1Array2787[i].method8827(((Class232) class232).anInt2630 * 1188608489, ((Class232) class232).aByteArray2631, ((Class232) class232).anInt2629 * 61783791, 2039135227 * ((Class232) class232).anInt2628, (byte) 42);
					if (((Class259) this).aClass224_Sub1Array2787[i].method8831(-1327255569))
						((Class259) this).aClass224_Sub1Array2787[i].method8837(false, (byte) 123);
				}
			}
		}
		((Class259) this).aBool2790 = false;
		return true;
	}

	public void method3552() {
		((Class259) this).aClass286_2793 = null;
		((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = null;
		((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = null;
		((Class259) this).aBool2790 = false;
		if (!((Class259) this).aClass278_2789.method3745(-58806103))
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 1684776832);
	}

	public void method3553() {
		if (((Class259) this).aClass224_Sub1Array2787 != null) {
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (null != ((Class259) this).aClass224_Sub1Array2787[i])
					((Class259) this).aClass224_Sub1Array2787[i].method8858(1494723960);
			}
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (((Class259) this).aClass224_Sub1Array2787[i] != null)
					((Class259) this).aClass224_Sub1Array2787[i].method8833((byte) 18);
			}
			if (((Class259) this).aClass286_2793 == null)
				method3546((short) 22197);
			else if (null != ((Class259) this).aClass617_2786 && !((Class259) this).aBool2790) {
				if (((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 == null)
					((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = ((Class259) this).aClass617_2786.method7384(1541093028);
				else if (!((Class572_Sub12_Sub16_Sub1) ((Class259) this).aClass572_Sub12_Sub16_Sub1_2792).aBool11476) {
					byte[] is = ((Class259) this).aClass572_Sub12_Sub16_Sub1_2792.method10440((byte) 66);
					try {
						((Class259) this).aClass286_2794 = new Class286(new RSByteBuffer(is), ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
						for (int i = 0; i < (((Class259) this).aClass224_Sub1Array2787).length; i++) {
							if ((((Class259) this).aClass224_Sub1Array2787[i] != null) && ((Class259) this).aClass224_Sub1Array2787[i].method8831(-1689945682)) {
								Class232 class232 = (((Class286) ((Class259) this).aClass286_2794).aClass232Array3420[i]);
								((Class259) this).aClass224_Sub1Array2787[i].method8837((((Class259) this).aClass224_Sub1Array2787[i].method8828((((Class232) class232).anInt2630 * 1188608489), ((Class232) class232).aByteArray2631, (((Class232) class232).anInt2629 * 61783791), (((Class232) class232).anInt2628 * 2039135227), (byte) -95)), (byte) 111);
							}
						}
					} catch (Exception exception) {
						for (int i = 0; i < (((Class259) this).aClass224_Sub1Array2787).length; i++) {
							if (null != (((Class259) this).aClass224_Sub1Array2787[i]) && ((Class259) this).aClass224_Sub1Array2787[i].method8831(866747854))
								((Class259) this).aClass224_Sub1Array2787[i].method8837(false, (byte) 124);
						}
					}
					((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = null;
					((Class259) this).aBool2790 = true;
				}
			}
		}
	}

	public boolean method3554() {
		if (null != ((Class259) this).aClass286_2793)
			return true;
		if (((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 == null) {
			if (((Class259) this).aClass278_2789.method3745(-559249484))
				return false;
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 1400519346);
		}
		if (((Class572_Sub12_Sub16_Sub2) ((Class259) this).aClass572_Sub12_Sub16_Sub2_2791).aBool11476)
			return false;
		RSByteBuffer class572_sub15 = new RSByteBuffer(((Class259) this).aClass572_Sub12_Sub16_Sub2_2791.method10440((byte) 126));
		((Class259) this).aClass286_2793 = new Class286(class572_sub15, ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
		if (((Class259) this).aClass224_Sub1Array2787 == null)
			((Class259) this).aClass224_Sub1Array2787 = (new Class224_Sub1[(((Class286) ((Class259) this).aClass286_2793).aClass232Array3420).length]);
		else {
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (((Class259) this).aClass224_Sub1Array2787[i] != null) {
					Class232 class232 = (((Class286) ((Class259) this).aClass286_2793).aClass232Array3420[i]);
					((Class259) this).aClass224_Sub1Array2787[i].method8827(((Class232) class232).anInt2630 * 1188608489, ((Class232) class232).aByteArray2631, ((Class232) class232).anInt2629 * 61783791, 2039135227 * ((Class232) class232).anInt2628, (byte) 68);
					if (((Class259) this).aClass224_Sub1Array2787[i].method8831(2033072487))
						((Class259) this).aClass224_Sub1Array2787[i].method8837(false, (byte) 114);
				}
			}
		}
		((Class259) this).aBool2790 = false;
		return true;
	}

	public Class259(Class278 class278, Class617 class617, Class267 class267, BigInteger biginteger, BigInteger biginteger_11_) {
		((Class259) this).aClass278_2789 = class278;
		((Class259) this).aClass617_2786 = class617;
		((Class259) this).aClass267_2788 = class267;
		((Class259) this).aBigInteger2795 = biginteger;
		((Class259) this).aBigInteger2796 = biginteger_11_;
		if (!((Class259) this).aClass278_2789.method3745(-266211796))
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 834750560);
		if (((Class259) this).aClass617_2786 != null)
			((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = ((Class259) this).aClass617_2786.method7384(2109186572);
	}

	public boolean method3555() {
		if (null != ((Class259) this).aClass286_2793)
			return true;
		if (((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 == null) {
			if (((Class259) this).aClass278_2789.method3745(-1341386202))
				return false;
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 1466419866);
		}
		if (((Class572_Sub12_Sub16_Sub2) ((Class259) this).aClass572_Sub12_Sub16_Sub2_2791).aBool11476)
			return false;
		RSByteBuffer class572_sub15 = new RSByteBuffer(((Class259) this).aClass572_Sub12_Sub16_Sub2_2791.method10440((byte) 86));
		((Class259) this).aClass286_2793 = new Class286(class572_sub15, ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
		if (((Class259) this).aClass224_Sub1Array2787 == null)
			((Class259) this).aClass224_Sub1Array2787 = (new Class224_Sub1[(((Class286) ((Class259) this).aClass286_2793).aClass232Array3420).length]);
		else {
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (((Class259) this).aClass224_Sub1Array2787[i] != null) {
					Class232 class232 = (((Class286) ((Class259) this).aClass286_2793).aClass232Array3420[i]);
					((Class259) this).aClass224_Sub1Array2787[i].method8827(((Class232) class232).anInt2630 * 1188608489, ((Class232) class232).aByteArray2631, ((Class232) class232).anInt2629 * 61783791, 2039135227 * ((Class232) class232).anInt2628, (byte) 119);
					if (((Class259) this).aClass224_Sub1Array2787[i].method8831(-778954109))
						((Class259) this).aClass224_Sub1Array2787[i].method8837(false, (byte) 123);
				}
			}
		}
		((Class259) this).aBool2790 = false;
		return true;
	}

	public boolean method3556() {
		if (null != ((Class259) this).aClass286_2793)
			return true;
		if (((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 == null) {
			if (((Class259) this).aClass278_2789.method3745(-857736819))
				return false;
			((Class259) this).aClass572_Sub12_Sub16_Sub2_2791 = ((Class259) this).aClass278_2789.method3722(255, 255, (byte) 0, true, 1992510129);
		}
		if (((Class572_Sub12_Sub16_Sub2) ((Class259) this).aClass572_Sub12_Sub16_Sub2_2791).aBool11476)
			return false;
		RSByteBuffer class572_sub15 = new RSByteBuffer(((Class259) this).aClass572_Sub12_Sub16_Sub2_2791.method10440((byte) 120));
		((Class259) this).aClass286_2793 = new Class286(class572_sub15, ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
		if (((Class259) this).aClass224_Sub1Array2787 == null)
			((Class259) this).aClass224_Sub1Array2787 = (new Class224_Sub1[(((Class286) ((Class259) this).aClass286_2793).aClass232Array3420).length]);
		else {
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (((Class259) this).aClass224_Sub1Array2787[i] != null) {
					Class232 class232 = (((Class286) ((Class259) this).aClass286_2793).aClass232Array3420[i]);
					((Class259) this).aClass224_Sub1Array2787[i].method8827(((Class232) class232).anInt2630 * 1188608489, ((Class232) class232).aByteArray2631, ((Class232) class232).anInt2629 * 61783791, 2039135227 * ((Class232) class232).anInt2628, (byte) 14);
					if (((Class259) this).aClass224_Sub1Array2787[i].method8831(-1048940553))
						((Class259) this).aClass224_Sub1Array2787[i].method8837(false, (byte) 113);
				}
			}
		}
		((Class259) this).aBool2790 = false;
		return true;
	}

	public void method3557() {
		if (((Class259) this).aClass224_Sub1Array2787 != null) {
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (null != ((Class259) this).aClass224_Sub1Array2787[i])
					((Class259) this).aClass224_Sub1Array2787[i].method8858(-1782517096);
			}
			for (int i = 0; i < ((Class259) this).aClass224_Sub1Array2787.length; i++) {
				if (((Class259) this).aClass224_Sub1Array2787[i] != null)
					((Class259) this).aClass224_Sub1Array2787[i].method8833((byte) 63);
			}
			if (((Class259) this).aClass286_2793 == null)
				method3546((short) 7291);
			else if (null != ((Class259) this).aClass617_2786 && !((Class259) this).aBool2790) {
				if (((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 == null)
					((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = ((Class259) this).aClass617_2786.method7384(1574176294);
				else if (!((Class572_Sub12_Sub16_Sub1) ((Class259) this).aClass572_Sub12_Sub16_Sub1_2792).aBool11476) {
					byte[] is = ((Class259) this).aClass572_Sub12_Sub16_Sub1_2792.method10440((byte) 77);
					try {
						((Class259) this).aClass286_2794 = new Class286(new RSByteBuffer(is), ((Class259) this).aBigInteger2795, ((Class259) this).aBigInteger2796);
						for (int i = 0; i < (((Class259) this).aClass224_Sub1Array2787).length; i++) {
							if ((((Class259) this).aClass224_Sub1Array2787[i] != null) && ((Class259) this).aClass224_Sub1Array2787[i].method8831(-1558870396)) {
								Class232 class232 = (((Class286) ((Class259) this).aClass286_2794).aClass232Array3420[i]);
								((Class259) this).aClass224_Sub1Array2787[i].method8837((((Class259) this).aClass224_Sub1Array2787[i].method8828((((Class232) class232).anInt2630 * 1188608489), ((Class232) class232).aByteArray2631, (((Class232) class232).anInt2629 * 61783791), (((Class232) class232).anInt2628 * 2039135227), (byte) -43)), (byte) 123);
							}
						}
					} catch (Exception exception) {
						for (int i = 0; i < (((Class259) this).aClass224_Sub1Array2787).length; i++) {
							if (null != (((Class259) this).aClass224_Sub1Array2787[i]) && ((Class259) this).aClass224_Sub1Array2787[i].method8831(-828546473))
								((Class259) this).aClass224_Sub1Array2787[i].method8837(false, (byte) 127);
						}
					}
					((Class259) this).aClass572_Sub12_Sub16_Sub1_2792 = null;
					((Class259) this).aBool2790 = true;
				}
			}
		}
	}

	static final void method3558(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class6.method498(class73, class83, class441, -1518965356);
	}

	static final void method3559(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = (Class213.aClass572_Sub24_2463.aClass665_Sub2_9247.method8109(-658584658) && Class272_Sub2.aClass106_9517.method1677()) ? 1 : 0;
	}

	public static boolean method3560(byte i, int i_12_) {
		int i_13_ = i & 0xff;
		if (0 == i_13_)
			return false;
		if (i_13_ >= 128 && i_13_ < 160 && Class436.aCharArray5066[i_13_ - 128] == 0)
			return false;
		return true;
	}

	public static void method3561(NPC class456_sub1_sub2_sub3_sub1, int i) {
		for (Class572_Sub27 class572_sub27 = ((Class572_Sub27) Class572_Sub27.aClass675_9261.method7932((byte) 50)); null != class572_sub27; class572_sub27 = (Class572_Sub27) Class572_Sub27.aClass675_9261.method7926(1232800210)) {
			if ((((Class572_Sub27) class572_sub27).aClass456_Sub1_Sub2_Sub3_Sub1_9290) == class456_sub1_sub2_sub3_sub1) {
				if (((Class572_Sub27) class572_sub27).aClass603_9285 != null) {
					((Class572_Sub27) class572_sub27).aClass603_9285.method7098(100, -1110366939);
					Class344.audio.method958((((Class572_Sub27) class572_sub27).aClass603_9285), 376980247);
					((Class572_Sub27) class572_sub27).aClass603_9285 = null;
				}
				class572_sub27.method6794((byte) 5);
				break;
			}
		}
	}

	public static void method3562(int i, int i_14_, short i_15_) {
		Class547_Sub1.anInt8982 = (i - Class547_Sub1.anInt6143) * -1904285671;
		Class547_Sub1.anInt8983 = (i_14_ - Class547_Sub1.anInt6165) * -1743033659;
	}
}

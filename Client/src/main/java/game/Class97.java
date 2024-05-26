package game;

/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class Class97 implements Interface5 {
	static int[] anIntArray1255;

	abstract byte[] method1555(int i, byte i_0_);

	public float[] method32(int i, float f, int i_1_, int i_2_, boolean bool) {
		return method1560(i, (byte) -56);
	}

	abstract byte[] method1556(int i, int i_3_);

	public abstract boolean method25(int i, Class514 class514, float f, int i_4_, int i_5_, boolean bool, int i_6_);

	int[] method1557(int i, int i_7_) {
		int[] is = method1558(i, 1581036884);
		if (is == null)
			return null;
		for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
			if (0 != (is[i_8_] & 0xffffff))
				is[i_8_] = is[i_8_] | ~0xffffff;
			else
				is[i_8_] = is[i_8_] & 0xffffff;
		}
		return is;
	}

	int[] method1558(int i, int i_9_) {
		byte[] is = method1555(i, (byte) 21);
		if (null == is)
			return null;
		int[] is_10_;
		try {
			int[] is_11_ = method1559(is, -1664055981);
			is_10_ = is_11_;
		} catch (IOException ioexception) {
			return null;
		}
		return is_10_;
	}

	public void method22(byte i) {
		/* empty */
	}

	public int[] method23(int i, float f, int i_12_, int i_13_, boolean bool, int i_14_) {
		return method1557(i, 1548229088);
	}

	public int[] method24(int i, float f, int i_15_, int i_16_, boolean bool, int i_17_) {
		return method1558(i, 1673243778);
	}

	public float[] method31(int i, float f, int i_18_, int i_19_, boolean bool, int i_20_) {
		return method1560(i, (byte) -52);
	}

	int[] method1559(byte[] is, int i) throws IOException {
		BufferedImage bufferedimage = ImageIO.read(new ByteArrayInputStream(is));
		return Class399.method4769(bufferedimage, (byte) 0);
	}

	public abstract boolean method28(int i, Class514 class514, float f, int i_21_, int i_22_, boolean bool);

	float[] method1560(int i, byte i_23_) {
		int[] is = method1558(i, 961327513);
		if (null == is)
			return null;
		int[] is_24_ = null;
		byte[] is_25_ = method1556(i, -1598312144);
		if (null != is_25_ && is_25_ != null) {
			try {
				is_24_ = method1559(is_25_, -1664055981);
				for (int i_26_ = 0; i_26_ < is_24_.length; i_26_++)
					is_24_[i_26_] = is_24_[i_26_] & 0xfff;
			} catch (IOException ioexception) {
				/* empty */
			}
		}
		if (is_24_ == null)
			is_24_ = new int[is.length];
		float[] fs = new float[is.length * 4];
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < is.length; i_28_++) {
			int i_29_ = is[i_28_];
			int i_30_ = i_29_ >>> 24;
			int i_31_ = (i_29_ & 0xff0000) >> 16;
			int i_32_ = (i_29_ & 0xff00) >> 8;
			int i_33_ = i_29_ & 0xff;
			float f = 1.0F + 31.0F * (float) is_24_[i_28_] / 4096.0F;
			fs[i_27_++] = f * (float) i_31_ / 255.0F;
			fs[i_27_++] = (float) i_32_ * f / 255.0F;
			fs[i_27_++] = f * (float) i_33_ / 255.0F;
			fs[i_27_++] = (float) i_30_ / 255.0F;
		}
		return fs;
	}

	abstract byte[] method1561(int i);

	public abstract boolean method37(int i, Class514 class514, float f, int i_34_, int i_35_, boolean bool);

	public int[] method27(int i, float f, int i_36_, int i_37_, boolean bool) {
		return method1557(i, 1548229088);
	}

	public void method29() {
		/* empty */
	}

	public void method30() {
		/* empty */
	}

	public int[] method26(int i, float f, int i_38_, int i_39_, boolean bool) {
		return method1557(i, 1548229088);
	}

	Class97() {
		/* empty */
	}

	public int[] method33(int i, float f, int i_40_, int i_41_, boolean bool) {
		return method1557(i, 1548229088);
	}

	public int[] method34(int i, float f, int i_42_, int i_43_, boolean bool) {
		return method1557(i, 1548229088);
	}

	public int[] method35(int i, float f, int i_44_, int i_45_, boolean bool) {
		return method1558(i, 1461246567);
	}

	public float[] method36(int i, float f, int i_46_, int i_47_, boolean bool) {
		return method1560(i, (byte) -118);
	}

	abstract byte[] method1562(int i);

	static final void method1563(Cs2Executor class441, int i) {
		Class245.method3351(-1367734102);
	}

	static final void method1564(Cs2Executor class441, byte i) {
		Class213.aClass572_Sub24_2463.method8622(Class213.aClass572_Sub24_2463.aClass665_Sub15_9245, (((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]), 909375588);
		Class623.method7443(-2064245085);
		client.aBool8854 = false;
	}

	public static int method1565(CharSequence charsequence, byte i) {
		return OutgoingPacket.method4059(charsequence, 10, true, (byte) 58);
	}

	static final void method1566(int i, int i_48_, int i_49_, int i_50_, byte i_51_) {
		IncomingPacket.method4115(Class272_Sub2.aClass106_9517, -524292760);
		Class403.method4787(i, i_48_, i_49_, i_50_, 256, 256, -617337781);
		Class133_Sub7.method9347(i, i_48_, i_49_, i_50_, 256, 256, 1662584626);
		Class6.method495(i, i_48_, i_49_, i_50_, 256, 256, -1185721997);
		Class44.method823(i, i_48_, i_49_, i_50_, 973586201);
	}

	static final void method1567(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		VarBitDefinition.method5227(class73, class83, class441, 2027713948);
	}

	static final void method1568(Cs2Executor class441, byte i) {
		int i_52_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_52_, (short) -4928);
		Class83 class83 = Class534.aClass83Array5975[i_52_ >> 16];
		Class317.method4085(class73, class83, class441, (byte) 29);
	}
}

package game;

/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.image.BufferedImage;

public class Class399 {
	int[][] anIntArrayArray4719;
	public int[] anIntArray4720;
	public short[] aShortArray4721;
	int[][] anIntArrayArray4722;
	public long aLong4723;
	float[] aFloatArray4724;
	public short[] aShortArray4725;

	public Class399(NPCDefintion class410, boolean bool) {
		if (bool) {
			anIntArray4720 = new int[class410.anIntArray4793.length];
			((Class399) this).aFloatArray4724 = new float[class410.anIntArray4793.length];
			((Class399) this).anIntArrayArray4722 = new int[class410.anIntArray4793.length][3];
			((Class399) this).anIntArrayArray4719 = new int[class410.anIntArray4793.length][3];
			System.arraycopy(class410.anIntArray4793, 0, anIntArray4720, 0, anIntArray4720.length);
		} else {
			anIntArray4720 = new int[class410.anIntArray4854.length];
			((Class399) this).aFloatArray4724 = new float[class410.anIntArray4854.length];
			((Class399) this).anIntArrayArray4722 = new int[class410.anIntArray4854.length][3];
			((Class399) this).anIntArrayArray4719 = new int[class410.anIntArray4854.length][3];
			System.arraycopy(class410.anIntArray4854, 0, anIntArray4720, 0, anIntArray4720.length);
		}
		if (class410.aShortArray4798 != null) {
			aShortArray4721 = new short[class410.aShortArray4798.length];
			System.arraycopy(class410.aShortArray4798, 0, aShortArray4721, 0, aShortArray4721.length);
		}
		if (class410.aShortArray4801 != null) {
			aShortArray4725 = new short[class410.aShortArray4801.length];
			System.arraycopy(class410.aShortArray4801, 0, aShortArray4725, 0, aShortArray4725.length);
		}
	}

	public Class399(long l, int[] is, float[] fs, int[][] is_0_, int[][] is_1_, short[] is_2_, short[] is_3_) {
		aLong4723 = -6756611017005174427L * l;
		anIntArray4720 = is;
		((Class399) this).aFloatArray4724 = fs;
		((Class399) this).anIntArrayArray4722 = is_0_;
		((Class399) this).anIntArrayArray4719 = is_1_;
		aShortArray4721 = is_2_;
		aShortArray4725 = is_3_;
	}

	static final void method4768(Cs2Executor class441, int i) {
		int i_4_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub4_9200.method7863(i_4_, 1657197078);
	}

	public static int[] method4769(BufferedImage bufferedimage, byte i) {
		if (bufferedimage.getType() == 10 || bufferedimage.getType() == 0) {
			int[] is = null;
			is = bufferedimage.getRaster().getPixels(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), is);
			int[] is_5_ = (new int[bufferedimage.getWidth() * bufferedimage.getHeight()]);
			if (bufferedimage.getType() == 10) {
				for (int i_6_ = 0; i_6_ < is_5_.length; i_6_++)
					is_5_[i_6_] = -16777216 + (is[i_6_] + ((is[i_6_] << 8) + (is[i_6_] << 16)));
			} else {
				for (int i_7_ = 0; i_7_ < is_5_.length; i_7_++) {
					int i_8_ = 2 * i_7_;
					is_5_[i_7_] = ((is[i_8_] << 8) + (is[i_8_] << 16) + ((is[1 + i_8_] << 24) + is[i_8_]));
				}
			}
			return is_5_;
		}
		return bufferedimage.getRGB(0, 0, bufferedimage.getWidth(), bufferedimage.getHeight(), null, 0, bufferedimage.getWidth());
	}
}

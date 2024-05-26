package game;

/* Class402_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class Class402_Sub1_Sub1 extends Class402_Sub1 {
	float aFloat11123;
	float aFloat11124;
	Class419 this$0;

	Class402_Sub1_Sub1(Class419 class419, Image image, int i, int i_0_, float f) {
		super(class419, image, i, i_0_);
		((Class402_Sub1_Sub1) this).this$0 = class419;
		((Class402_Sub1_Sub1) this).aFloat11123 = f;
		((Class402_Sub1_Sub1) this).aFloat11124 = -((Class402_Sub1_Sub1) this).aFloat11123;
	}

	void method4778(Graphics graphics, int i) {
		((Class402_Sub1_Sub1) this).aFloat11124 += ((Class402_Sub1_Sub1) this).aFloat11123;
		if (((Class402_Sub1_Sub1) this).aFloat11124 < 0.0F)
			((Class402_Sub1_Sub1) this).aFloat11124 += 360.0F;
		((Class402_Sub1_Sub1) this).aFloat11124 %= 360.0F;
		double d = Math.toRadians((double) ((Class402_Sub1_Sub1) this).aFloat11124);
		int i_1_ = ((Class402_Sub1_Sub1) this).anImage9684.getWidth(null);
		int i_2_ = ((Class402_Sub1_Sub1) this).anImage9684.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (((Class402_Sub1_Sub1) this).this$0.method5111(i_1_, -1919319205) + i_1_ / 2 + 1387147015 * (((Class402_Sub1_Sub1) this).anInt4746)), (double) (((Class402_Sub1_Sub1) this).this$0.method5122(i_2_, -1780078844) + i_2_ / 2 + (((Class402_Sub1_Sub1) this).anInt4745 * 1077507529)));
		graphics2d.translate((((Class402_Sub1_Sub1) this).this$0.method5111(i_1_, -473910697) + ((Class402_Sub1_Sub1) this).anInt4746 * 1387147015), (((Class402_Sub1_Sub1) this).this$0.method5122(i_2_, -2012476929) + ((Class402_Sub1_Sub1) this).anInt4745 * 1077507529));
		graphics2d.drawImage(((Class402_Sub1_Sub1) this).anImage9684, null, null);
		graphics2d.setTransform(((Class419) ((Class402_Sub1_Sub1) this).this$0).anAffineTransform4955);
	}

	void method4780(Graphics graphics) {
		((Class402_Sub1_Sub1) this).aFloat11124 += ((Class402_Sub1_Sub1) this).aFloat11123;
		if (((Class402_Sub1_Sub1) this).aFloat11124 < 0.0F)
			((Class402_Sub1_Sub1) this).aFloat11124 += 360.0F;
		((Class402_Sub1_Sub1) this).aFloat11124 %= 360.0F;
		double d = Math.toRadians((double) ((Class402_Sub1_Sub1) this).aFloat11124);
		int i = ((Class402_Sub1_Sub1) this).anImage9684.getWidth(null);
		int i_3_ = ((Class402_Sub1_Sub1) this).anImage9684.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (((Class402_Sub1_Sub1) this).this$0.method5111(i, 1077584314) + i / 2 + 1387147015 * (((Class402_Sub1_Sub1) this).anInt4746)), (double) (((Class402_Sub1_Sub1) this).this$0.method5122(i_3_, -1807823560) + i_3_ / 2 + (((Class402_Sub1_Sub1) this).anInt4745 * 1077507529)));
		graphics2d.translate((((Class402_Sub1_Sub1) this).this$0.method5111(i, -835804335) + ((Class402_Sub1_Sub1) this).anInt4746 * 1387147015), (((Class402_Sub1_Sub1) this).this$0.method5122(i_3_, -1993753915) + ((Class402_Sub1_Sub1) this).anInt4745 * 1077507529));
		graphics2d.drawImage(((Class402_Sub1_Sub1) this).anImage9684, null, null);
		graphics2d.setTransform(((Class419) ((Class402_Sub1_Sub1) this).this$0).anAffineTransform4955);
	}

	void method4777(Graphics graphics) {
		((Class402_Sub1_Sub1) this).aFloat11124 += ((Class402_Sub1_Sub1) this).aFloat11123;
		if (((Class402_Sub1_Sub1) this).aFloat11124 < 0.0F)
			((Class402_Sub1_Sub1) this).aFloat11124 += 360.0F;
		((Class402_Sub1_Sub1) this).aFloat11124 %= 360.0F;
		double d = Math.toRadians((double) ((Class402_Sub1_Sub1) this).aFloat11124);
		int i = ((Class402_Sub1_Sub1) this).anImage9684.getWidth(null);
		int i_4_ = ((Class402_Sub1_Sub1) this).anImage9684.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (((Class402_Sub1_Sub1) this).this$0.method5111(i, -431828698) + i / 2 + 1387147015 * (((Class402_Sub1_Sub1) this).anInt4746)), (double) (((Class402_Sub1_Sub1) this).this$0.method5122(i_4_, -1856812254) + i_4_ / 2 + (((Class402_Sub1_Sub1) this).anInt4745 * 1077507529)));
		graphics2d.translate((((Class402_Sub1_Sub1) this).this$0.method5111(i, 1506106120) + ((Class402_Sub1_Sub1) this).anInt4746 * 1387147015), (((Class402_Sub1_Sub1) this).this$0.method5122(i_4_, -1753053127) + ((Class402_Sub1_Sub1) this).anInt4745 * 1077507529));
		graphics2d.drawImage(((Class402_Sub1_Sub1) this).anImage9684, null, null);
		graphics2d.setTransform(((Class419) ((Class402_Sub1_Sub1) this).this$0).anAffineTransform4955);
	}

	void method4779(Graphics graphics) {
		((Class402_Sub1_Sub1) this).aFloat11124 += ((Class402_Sub1_Sub1) this).aFloat11123;
		if (((Class402_Sub1_Sub1) this).aFloat11124 < 0.0F)
			((Class402_Sub1_Sub1) this).aFloat11124 += 360.0F;
		((Class402_Sub1_Sub1) this).aFloat11124 %= 360.0F;
		double d = Math.toRadians((double) ((Class402_Sub1_Sub1) this).aFloat11124);
		int i = ((Class402_Sub1_Sub1) this).anImage9684.getWidth(null);
		int i_5_ = ((Class402_Sub1_Sub1) this).anImage9684.getHeight(null);
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics2d.rotate(d, (double) (((Class402_Sub1_Sub1) this).this$0.method5111(i, 473815559) + i / 2 + 1387147015 * (((Class402_Sub1_Sub1) this).anInt4746)), (double) (((Class402_Sub1_Sub1) this).this$0.method5122(i_5_, -1471430165) + i_5_ / 2 + (((Class402_Sub1_Sub1) this).anInt4745 * 1077507529)));
		graphics2d.translate((((Class402_Sub1_Sub1) this).this$0.method5111(i, -992400131) + ((Class402_Sub1_Sub1) this).anInt4746 * 1387147015), (((Class402_Sub1_Sub1) this).this$0.method5122(i_5_, -2061280125) + ((Class402_Sub1_Sub1) this).anInt4745 * 1077507529));
		graphics2d.drawImage(((Class402_Sub1_Sub1) this).anImage9684, null, null);
		graphics2d.setTransform(((Class419) ((Class402_Sub1_Sub1) this).this$0).anAffineTransform4955);
	}

	static final void method10132(Cs2Executor class441, byte i) {
		int i_6_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method854(i_6_, 1493492562).method2106(-306728378).getId(-1119524059);
	}
}

package game;

/* Class402_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Class402_Sub2 extends Class402 {
	FontMetrics aFontMetrics9864;
	Font aFont9865;
	boolean aBool9866;
	Color aColor9867;
	Class419 this$0;

	void method4777(Graphics graphics) {
		String string;
		if (((Class402_Sub2) this).aBool9866)
			string = ((Class419) ((Class402_Sub2) this).this$0).aString4952;
		else
			string = new StringBuilder().append(((Class419) ((Class402_Sub2) this).this$0).aString4953).append(" ").append(((Class419) ((Class402_Sub2) this).this$0).aString4952).toString();
		graphics.setFont(((Class402_Sub2) this).aFont9865);
		graphics.setColor(((Class402_Sub2) this).aColor9867);
		graphics.drawString(string, ((((Class402_Sub2) this).this$0.method5111(((Class402_Sub2) this).aFontMetrics9864.stringWidth(string), 1168913486)) + 1387147015 * ((Class402_Sub2) this).anInt4746), (((Class402_Sub2) this).this$0.method5122(0, -1495071967) + 1077507529 * ((Class402_Sub2) this).anInt4745));
	}

	void method4778(Graphics graphics, int i) {
		String string;
		if (((Class402_Sub2) this).aBool9866)
			string = ((Class419) ((Class402_Sub2) this).this$0).aString4952;
		else
			string = new StringBuilder().append(((Class419) ((Class402_Sub2) this).this$0).aString4953).append(" ").append(((Class419) ((Class402_Sub2) this).this$0).aString4952).toString();
		graphics.setFont(((Class402_Sub2) this).aFont9865);
		graphics.setColor(((Class402_Sub2) this).aColor9867);
		graphics.drawString(string, ((((Class402_Sub2) this).this$0.method5111(((Class402_Sub2) this).aFontMetrics9864.stringWidth(string), 1949449519)) + 1387147015 * ((Class402_Sub2) this).anInt4746), (((Class402_Sub2) this).this$0.method5122(0, -1603385727) + 1077507529 * ((Class402_Sub2) this).anInt4745));
	}

	void method4779(Graphics graphics) {
		String string;
		if (((Class402_Sub2) this).aBool9866)
			string = ((Class419) ((Class402_Sub2) this).this$0).aString4952;
		else
			string = new StringBuilder().append(((Class419) ((Class402_Sub2) this).this$0).aString4953).append(" ").append(((Class419) ((Class402_Sub2) this).this$0).aString4952).toString();
		graphics.setFont(((Class402_Sub2) this).aFont9865);
		graphics.setColor(((Class402_Sub2) this).aColor9867);
		graphics.drawString(string, ((((Class402_Sub2) this).this$0.method5111(((Class402_Sub2) this).aFontMetrics9864.stringWidth(string), 781981447)) + 1387147015 * ((Class402_Sub2) this).anInt4746), (((Class402_Sub2) this).this$0.method5122(0, -2116356476) + 1077507529 * ((Class402_Sub2) this).anInt4745));
	}

	Class402_Sub2(Class419 class419, boolean bool, String string, int i, int i_0_, int i_1_, int i_2_) {
		super(class419, i_1_, i_2_);
		((Class402_Sub2) this).this$0 = class419;
		((Class402_Sub2) this).aBool9866 = bool;
		((Class402_Sub2) this).aFont9865 = new Font(string, 0, i);
		((Class402_Sub2) this).aFontMetrics9864 = Class584.aCanvas7745.getFontMetrics(((Class402_Sub2) this).aFont9865);
		((Class402_Sub2) this).aColor9867 = new Color(i_0_);
	}

	void method4780(Graphics graphics) {
		String string;
		if (((Class402_Sub2) this).aBool9866)
			string = ((Class419) ((Class402_Sub2) this).this$0).aString4952;
		else
			string = new StringBuilder().append(((Class419) ((Class402_Sub2) this).this$0).aString4953).append(" ").append(((Class419) ((Class402_Sub2) this).this$0).aString4952).toString();
		graphics.setFont(((Class402_Sub2) this).aFont9865);
		graphics.setColor(((Class402_Sub2) this).aColor9867);
		graphics.drawString(string, ((((Class402_Sub2) this).this$0.method5111(((Class402_Sub2) this).aFontMetrics9864.stringWidth(string), -2097258167)) + 1387147015 * ((Class402_Sub2) this).anInt4746), (((Class402_Sub2) this).this$0.method5122(0, -2002239619) + 1077507529 * ((Class402_Sub2) this).anInt4745));
	}

	static final void method9353(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class593.method7021((byte) -69).getId(-1426189754);
	}

	static void method9354(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, Class572_Sub12_Sub19 class572_sub12_sub19, Class102 class102, Class284 class284, int i_9_, int i_10_, int i_11_) {
		if (i > i_4_ && i < i_6_ + i_4_ && i_3_ > i_8_ - -801958417 * class284.anInt3412 - 1 && i_3_ < class284.anInt3413 * -2086019023 + i_8_)
			i_9_ = i_10_;
		String string = Class617.method7398(class572_sub12_sub19, -1870697454);
		class102.method1626(string, i_4_ + 3, i_8_, i_9_, 0, client.aRandom8673, Class439.anInt5093, Class44.aClass161Array443, Class103.anIntArray1384, 580892434);
	}
}

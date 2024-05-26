package game;

/* Class402_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.Socket;

public class Class402_Sub1 extends Class402 {
	static int anInt9683;
	Class419 this$0;
	Image anImage9684;

	void method4780(Graphics graphics) {
		int i = (((Class402_Sub1) this).this$0.method5111(((Class402_Sub1) this).anImage9684.getWidth(null), 207561930) + ((Class402_Sub1) this).anInt4746 * 1387147015);
		int i_0_ = (((Class402_Sub1) this).this$0.method5122(((Class402_Sub1) this).anImage9684.getHeight(null), -1958576085) + ((Class402_Sub1) this).anInt4745 * 1077507529);
		graphics.drawImage(((Class402_Sub1) this).anImage9684, i, i_0_, null);
	}

	Class402_Sub1(Class419 class419, Image image, int i, int i_1_) {
		super(class419, i, i_1_);
		((Class402_Sub1) this).this$0 = class419;
		((Class402_Sub1) this).anImage9684 = image;
	}

	void method4779(Graphics graphics) {
		int i = (((Class402_Sub1) this).this$0.method5111(((Class402_Sub1) this).anImage9684.getWidth(null), 1545529229) + ((Class402_Sub1) this).anInt4746 * 1387147015);
		int i_2_ = (((Class402_Sub1) this).this$0.method5122(((Class402_Sub1) this).anImage9684.getHeight(null), -1764143948) + ((Class402_Sub1) this).anInt4745 * 1077507529);
		graphics.drawImage(((Class402_Sub1) this).anImage9684, i, i_2_, null);
	}

	void method4777(Graphics graphics) {
		int i = (((Class402_Sub1) this).this$0.method5111(((Class402_Sub1) this).anImage9684.getWidth(null), 1211278347) + ((Class402_Sub1) this).anInt4746 * 1387147015);
		int i_3_ = (((Class402_Sub1) this).this$0.method5122(((Class402_Sub1) this).anImage9684.getHeight(null), -1718649419) + ((Class402_Sub1) this).anInt4745 * 1077507529);
		graphics.drawImage(((Class402_Sub1) this).anImage9684, i, i_3_, null);
	}

	void method4778(Graphics graphics, int i) {
		int i_4_ = (((Class402_Sub1) this).this$0.method5111(((Class402_Sub1) this).anImage9684.getWidth(null), -14817703) + ((Class402_Sub1) this).anInt4746 * 1387147015);
		int i_5_ = (((Class402_Sub1) this).this$0.method5122(((Class402_Sub1) this).anImage9684.getHeight(null), -2144188773) + ((Class402_Sub1) this).anInt4745 * 1077507529);
		graphics.drawImage(((Class402_Sub1) this).anImage9684, i_4_, i_5_, null);
	}

	static final void method9214(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub23_9208.method9058((byte) 7) == 1 ? 1 : 0;
	}

	public static Class555 method9215(Socket socket, int i, int i_6_) throws IOException {
		return new Class555_Sub1(socket, i);
	}
}

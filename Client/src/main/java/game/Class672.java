package game;

/* Class672 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class672 {
	DisplayMode aDisplayMode8530;
	GraphicsDevice aGraphicsDevice8531;
	static int[] anIntArray8532;
	public static Class639_Sub5 aClass639_Sub5_8533;

	int[] method7887(byte i) {
		DisplayMode[] displaymodes = ((Class672) this).aGraphicsDevice8531.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i_0_ = 0; i_0_ < displaymodes.length; i_0_++) {
			is[i_0_ << 2] = displaymodes[i_0_].getWidth();
			is[(i_0_ << 2) + 1] = displaymodes[i_0_].getHeight();
			is[(i_0_ << 2) + 2] = displaymodes[i_0_].getBitDepth();
			is[3 + (i_0_ << 2)] = displaymodes[i_0_].getRefreshRate();
		}
		return is;
	}

	void method7888(Frame frame, int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
		((Class672) this).aDisplayMode8530 = ((Class672) this).aGraphicsDevice8531.getDisplayMode();
		if (((Class672) this).aDisplayMode8530 == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method7890(frame, 515927094);
		if (i_3_ == 0) {
			int i_5_ = ((Class672) this).aDisplayMode8530.getRefreshRate();
			DisplayMode[] displaymodes = ((Class672) this).aGraphicsDevice8531.getDisplayModes();
			boolean bool = false;
			for (int i_6_ = 0; i_6_ < displaymodes.length; i_6_++) {
				if (displaymodes[i_6_].getWidth() == i && displaymodes[i_6_].getHeight() == i_1_ && displaymodes[i_6_].getBitDepth() == i_2_) {
					int i_7_ = displaymodes[i_6_].getRefreshRate();
					if (!bool || Math.abs(i_7_ - i_5_) < Math.abs(i_3_ - i_5_)) {
						i_3_ = i_7_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_3_ = i_5_;
		}
		((Class672) this).aGraphicsDevice8531.setDisplayMode(new DisplayMode(i, i_1_, i_2_, i_3_));
	}

	void method7889(int i) {
		if (((Class672) this).aDisplayMode8530 != null) {
			DisplayMode[] displaymodes = ((Class672) this).aGraphicsDevice8531.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_8_ = displaymodes;
			for (int i_9_ = 0; i_9_ < displaymodes_8_.length; i_9_++) {
				DisplayMode displaymode = displaymodes_8_[i_9_];
				if (displaymode.equals(((Class672) this).aDisplayMode8530)) {
					((Class672) this).aGraphicsDevice8531.setDisplayMode(((Class672) this).aDisplayMode8530);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class672) this).aGraphicsDevice8531, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class672) this).aDisplayMode8530 = null;
		}
		method7890(null, 515927094);
	}

	void method7890(Frame frame, int i) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_10_ = ((Boolean) field.get(((Class672) this).aGraphicsDevice8531)).booleanValue();
			if (bool_10_) {
				field.set(((Class672) this).aGraphicsDevice8531, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			((Class672) this).aGraphicsDevice8531.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(((Class672) this).aGraphicsDevice8531, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(((Class672) this).aGraphicsDevice8531, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			try {
				throw object;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Class672() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		((Class672) this).aGraphicsDevice8531 = graphicsenvironment.getDefaultScreenDevice();
		if (!((Class672) this).aGraphicsDevice8531.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_11_ = graphicsdevices;
			for (int i = 0; i < graphicsdevices_11_.length; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_11_[i];
				if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
					((Class672) this).aGraphicsDevice8531 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	void method7891() {
		if (((Class672) this).aDisplayMode8530 != null) {
			DisplayMode[] displaymodes = ((Class672) this).aGraphicsDevice8531.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_12_ = displaymodes;
			for (int i = 0; i < displaymodes_12_.length; i++) {
				DisplayMode displaymode = displaymodes_12_[i];
				if (displaymode.equals(((Class672) this).aDisplayMode8530)) {
					((Class672) this).aGraphicsDevice8531.setDisplayMode(((Class672) this).aDisplayMode8530);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class672) this).aGraphicsDevice8531, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class672) this).aDisplayMode8530 = null;
		}
		method7890(null, 515927094);
	}

	static final void method7892(Cs2Executor class441, int i) {
		int i_13_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class221.aClass49_2607.method854(i_13_, 1493492562).method2130(-151940902) ? 1 : 0;
	}

	static void method7893(int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, Class572_Sub12_Sub10 class572_sub12_sub10, Class102 class102, Class284 class284, int i_20_, int i_21_, int i_22_) {
		if (i > i_15_ && i < i_17_ + i_15_ && i_14_ > i_19_ - class284.anInt3412 * -801958417 - 1 && i_14_ < i_19_ + -2086019023 * class284.anInt3413 && ((Class572_Sub12_Sub10) class572_sub12_sub10).aBool11398)
			i_20_ = i_21_;
		int[] is = Class298.method3975(class572_sub12_sub10, 321346768);
		String string = Class406.method4920(class572_sub12_sub10, -1620049161);
		if (null != is)
			string = new StringBuilder().append(string).append(Class191.method2895(is, 1385055718)).toString();
		class102.method1626(string, i_15_ + 3, i_19_, i_20_, 0, client.aRandom8673, Class439.anInt5093, Class44.aClass161Array443, Class103.anIntArray1384, 272293591);
		if (((Class572_Sub12_Sub10) class572_sub12_sub10).aBool11399)
			Class458.aClass161_5208.method2595(5 + i_15_ + class284.method3832(string, (byte) 100), i_19_ - class284.anInt3412 * -801958417);
	}

	public static boolean method7894(byte i) {
		return (null != Class572_Sub2.aTwitchTV8969 && Class572_Sub2.aTwitchTV8969.IsStreaming());
	}

	static final void method7895(Cs2Executor class441, int i) {
		Class212.aClass212_2450.method3057((byte) -23);
	}

	static void method7896(int i, int i_23_, int i_24_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(7, (long) i);
		class572_sub12_sub11.method10338(1472771161);
		((GameTask) class572_sub12_sub11).p1 = i_23_ * 720886855;
	}
}

package game;

/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Frame;
import java.io.File;

import javax.swing.JFileChooser;

import com.jagex.twitchtv.TwitchWebcamDevice;

public class Class189 implements Runnable {
	boolean aBool2226;
	boolean aBool2227;
	File aFile2228 = null;
	String aString2229;

	boolean method2851() {
		return ((Class189) this).aBool2227;
	}

	public void run() {
		Container container = Class591_Sub5.method8786((byte) -106);
		Frame frame = null;
		if (null != Class18.aFrame142)
			frame = Class18.aFrame142;
		else {
			for (/**/; container != null; container = container.getParent()) {
				if (container instanceof Frame) {
					frame = (Frame) container;
					break;
				}
			}
		}
		if (null == frame)
			throw new RuntimeException("");
		JFileChooser jfilechooser = new JFileChooser("");
		jfilechooser.setDialogTitle(((Class189) this).aString2229);
		jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
		jfilechooser.setFileSelectionMode(1);
		jfilechooser.setAcceptAllFileFilterUsed(false);
		int i = jfilechooser.showOpenDialog(frame);
		if (i == 0)
			((Class189) this).aFile2228 = jfilechooser.getSelectedFile();
		((Class189) this).aBool2226 = true;
	}

	public File method2852(byte i) {
		return ((Class189) this).aFile2228;
	}

	public boolean method2853(int i) {
		return ((Class189) this).aBool2226;
	}

	boolean method2854() {
		return ((Class189) this).aBool2227;
	}

	public void method2855() {
		Container container = Class591_Sub5.method8786((byte) 21);
		Frame frame = null;
		if (null != Class18.aFrame142)
			frame = Class18.aFrame142;
		else {
			for (/**/; container != null; container = container.getParent()) {
				if (container instanceof Frame) {
					frame = (Frame) container;
					break;
				}
			}
		}
		if (null == frame)
			throw new RuntimeException("");
		JFileChooser jfilechooser = new JFileChooser("");
		jfilechooser.setDialogTitle(((Class189) this).aString2229);
		jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
		jfilechooser.setFileSelectionMode(1);
		jfilechooser.setAcceptAllFileFilterUsed(false);
		int i = jfilechooser.showOpenDialog(frame);
		if (i == 0)
			((Class189) this).aFile2228 = jfilechooser.getSelectedFile();
		((Class189) this).aBool2226 = true;
	}

	public boolean method2856() {
		return ((Class189) this).aBool2226;
	}

	public boolean method2857() {
		return ((Class189) this).aBool2226;
	}

	public Class189(String string, boolean bool) {
		((Class189) this).aBool2226 = false;
		((Class189) this).aString2229 = string;
		((Class189) this).aBool2227 = bool;
		new Thread(this).start();
	}

	boolean method2858(int i) {
		return ((Class189) this).aBool2227;
	}

	static void method2859(Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		TwitchWebcamDevice twitchwebcamdevice = Class96.method1548(string, 1321602690);
		if (null == twitchwebcamdevice) {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = "";
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1183431001 * twitchwebcamdevice.anInt2058;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = twitchwebcamdevice.aString2056;
			((Cs2Executor) class441).objectStack[((((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1)] = twitchwebcamdevice.aString2057;
		}
	}

	static final void method2860(InterfaceDefinitions class73, Class83 class83, Cs2Executor class441, int i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		if (Class665_Sub11.method8207(string, class441, 875758066) != null)
			string = string.substring(0, string.length() - 1);
		class73.anObjectArray855 = Cs2CallPointer.method5626(string, class441, 915414813);
		class73.aBool857 = true;
	}

	public static String method2861(byte[] is, int i) {
		return Class307.method4020(is, 0, is.length, 1876295149);
	}

	static final void method2862(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr]);
		boolean bool = ((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr + 1]) == 1);
		if (Class547_Sub1.aClass676_8991 != null) {
			Class572 class572 = Class547_Sub1.aClass676_8991.get((long) i_0_);
			if (null != class572 && !bool)
				class572.method6794((byte) -98);
			else if (class572 == null && bool) {
				class572 = new Class572();
				Class547_Sub1.aClass676_8991.put(class572, (long) i_0_);
			}
		}
	}

	static final int method2863(PacketsDecoder class207, byte i) {
		if (null == class207)
			return 12;
		switch (((PacketsDecoder) class207).anInt2419 * -866554243) {
			default:
				return 12;
			case 1:
				return 20;
		}
	}
}

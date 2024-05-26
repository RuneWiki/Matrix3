package game;

/* Class584 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.nanotime.QueryPerformanceCounter;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public abstract class Class584 implements Interface66, Runnable, FocusListener, WindowListener {
	static final int anInt7732 = 0;
	protected static boolean aBool7733;
	public static int anInt7734;
	public static String aString7735;
	static final int anInt7736 = 32;
	static long[] aLongArray7737;
	static long[] aLongArray7738;
	public static int anInt7739;
	public static int anInt7740;
	static String[] aStringArray7741;
	public static int anInt7742;
	static Font aFont7743;
	protected static String aString7744;
	public static Canvas aCanvas7745;
	protected static volatile boolean aBool7746;
	static int anInt7747;
	public static int anInt7748;
	static int anInt7749;
	static final String aString7750 = "rw";
	static volatile boolean aBool7751;
	protected static Class643 aClass643_7752;
	static final int anInt7753 = 1048576;
	public static int anInt7754;
	static final String aString7755 = "main_file_cache.dat2";
	static final String aString7756 = "main_file_cache.idx";
	static final String aString7757 = "main_file_cache.idx255";
	static final String aString7758 = "random.dat";
	static Class643 aClass643_7759;
	public static int anInt7760;
	protected static Class643 aClass643_7761;
	static volatile long aLong7762;
	static long aLong7763 = -8681542773184511744L;
	static final int anInt7764 = 1;
	static Class578 aClass578_7765;
	static long aLong7766;
	static boolean aBool7767;
	boolean aBool7768 = false;
	public static int anInt7769;
	protected static volatile boolean aBool7770;
	boolean aBool7771 = false;
	static final long aLong7772 = 3221225472L;

	boolean method6891(File file, boolean bool, byte i) {
		boolean bool_0_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i_1_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_1_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_0_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_0_;
	}

	final void method6892(Class579 class579, String string, String string_2_, int i, int i_3_, int i_4_, int i_5_, boolean bool, int i_6_) {
		try {
			method6908(Class578.aClass578_7669, bool, (byte) -42);
			Class656.anInt8418 = ((Class269.anInt2861 = class579.method6838(157789665) * -2096753523) * -1059110805);
			Class287.anInt3421 = ((anInt7739 = class579.method6842(1242036713) * -1139192775) * -1679227983);
			anInt7748 = 0;
			anInt7760 = 0;
			if (Class554.method6557(-1353210895) == Class578.aClass578_7668) {
				Class656.anInt8418 += -553538082 * class579.method6837(-1139238214);
				Class287.anInt3421 += 2022096082 * class579.method6835((byte) 60);
				method6893(class579.method6839(-247515319), -1912499780);
			}
			Class133_Sub8.anApplet9854 = VarTransmitLevel.anApplet8067;
			method6915(string, string_2_, i, i_3_, i_4_, i_5_, -467376242);
		} catch (Throwable throwable) {
			Class640.method7592(null, throwable, 225394109);
			method6906("crash", 1042020802);
		}
	}

	synchronized void method6893(String string, int i) {
		Class18.aFrame142 = new Frame();
		Class18.aFrame142.setTitle(string);
		Class18.aFrame142.setResizable(true);
		Class18.aFrame142.addWindowListener(this);
		Class18.aFrame142.setBackground(Color.black);
		Class18.aFrame142.setVisible(true);
		Class18.aFrame142.toFront();
		Insets insets = Class18.aFrame142.getInsets();
		Class18.aFrame142.setSize(insets.left + Class656.anInt8418 * -1987897329 + insets.right, insets.bottom + (insets.top + Class287.anInt3421 * -257945127));
	}

	public abstract void method411();

	synchronized void method6894(byte i) {
		method6896(-777207593);
		Container container = Class591_Sub5.method8786((byte) 41);
		aCanvas7745 = new Canvas_Sub1(container);
		method6895(container, 1173824610);
	}

	void method6895(Container container, int i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(aCanvas7745);
		aCanvas7745.setSize(1960824389 * Class269.anInt2861, anInt7739 * -530390519);
		aCanvas7745.setVisible(true);
		if (container == Class18.aFrame142) {
			Insets insets = Class18.aFrame142.getInsets();
			aCanvas7745.setLocation(insets.left + 954583035 * anInt7748, anInt7760 * 2077319943 + insets.top);
		} else
			aCanvas7745.setLocation(anInt7748 * 954583035, anInt7760 * 2077319943);
		aCanvas7745.addFocusListener(this);
		aCanvas7745.requestFocus();
		Class408.aBool4780 = true;
		aBool7751 = true;
		aCanvas7745.setFocusTraversalKeysEnabled(false);
		aBool7746 = true;
		aBool7770 = false;
		aLong7762 = Class69.method1067(-1971177153) * -3235229818188612093L;
	}

	void method6896(int i) {
		if (null != aCanvas7745) {
			aCanvas7745.removeFocusListener(this);
			aCanvas7745.getParent().setBackground(Color.black);
			aCanvas7745.getParent().remove(aCanvas7745);
		}
	}

	final boolean method6897(int i) {
		return true;
	}

	public void run() {
		do {
			try {
				try {
					method6898(-1706958362);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class640.method7592(method6946((byte) 97), throwable, 1025421081);
					method6906("crash", 1570639422);
					method6899(true, -150753595);
					break;
				}
				method6899(true, -1826715295);
			} catch (Exception object) {
				method6899(true, 2140740894);
				try {
					throw object;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	void method6898(int i) {
		Class591_Sub5.method8786((byte) -32).setFocusCycleRoot(true);
		anInt7769 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 370911813);
		anInt7742 = Runtime.getRuntime().availableProcessors() * 2120616549;
		method6894((byte) -37);
		method6902(-674817665);
		Class380.aClass570_4594 = Class134_Sub1.method9972((byte) -46);
		while (5280647269957790405L * aLong7766 == 0L || (Class69.method1067(-1981812778) < 5280647269957790405L * aLong7766)) {
			anInt7749 = Class380.aClass570_4594.method6772(6416999803781759981L * aLong7763) * 1439532117;
			for (int i_10_ = 0; i_10_ < 600529149 * anInt7749; i_10_++)
				method6918(237359724);
			method6938(975318679);
			Class640.method7590(aCanvas7745, (byte) 16);
		}
	}

	final void method6899(boolean bool, int i) {
		synchronized (this) {
			if (aBool7767)
				return;
			aBool7767 = true;
		}
		try {
			method6905(925663759);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass643_7752.method7613(2139321656);
			for (int i_11_ = 0; i_11_ < Class297.anInt3473 * -2072086597; i_11_++)
				Class103.aClass643Array1383[i_11_].method7613(2114176472);
			aClass643_7761.method7613(2099936022);
			aClass643_7759.method7613(2129131974);
		} catch (Exception exception) {
			/* empty */
		}
		if (((Class584) this).aBool7771) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		if (Class197.method2969((byte) -50))
			Class597.method7040(-947048318).method419((byte) -17);
		if (aCanvas7745 != null) {
			try {
				aCanvas7745.removeFocusListener(this);
				aCanvas7745.getParent().remove(aCanvas7745);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (null != Class18.aFrame142) {
			Class18.aFrame142.setVisible(false);
			Class18.aFrame142.dispose();
			Class18.aFrame142 = null;
		}
	}

	public void method402() {
		if (!aBool7767)
			aLong7766 = ((Class69.method1067(-1844379440) + 4000L) * -5560073831855324147L);
	}

	public void stop() {
		if (!aBool7767)
			aLong7766 = ((Class69.method1067(-2071095154) + 4000L) * -5560073831855324147L);
	}

	void method6900(File file, File file_12_, short i) {
		try {
			Class649 class649 = new Class649(Class275.aFile2918, "rw", 10000L);
			RSByteBuffer class572_sub15 = new RSByteBuffer(500);
			class572_sub15.writeByte(3, -1384395473);
			class572_sub15.writeByte(file_12_ != null ? 1 : 0, -1384395473);
			class572_sub15.method8554(file.getPath(), (byte) -3);
			if (null != file_12_)
				class572_sub15.method8554(file_12_.getPath(), (byte) -80);
			class649.method7674(class572_sub15.b, 0, -1585139053 * class572_sub15.o, -1194284442);
			class649.method7673(1888983002);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	abstract void method6901();

	public final synchronized void paint(Graphics graphics) {
		if (!aBool7767) {
			aBool7746 = true;
			if ((Class69.method1067(-2140127293) - 1596253669902474411L * aLong7762) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= -1987897329 * Class656.anInt8418 && (rectangle.height >= -257945127 * Class287.anInt3421)))
					aBool7770 = true;
			}
		}
	}

	public void destroy() {
		if (!aBool7767) {
			aLong7766 = Class69.method1067(-1890106287) * -5560073831855324147L;
			Class198.method2977(5000L);
			method6899(false, 1696845779);
		}
	}

	public final void focusLost(FocusEvent focusevent) {
		aBool7751 = false;
	}

	public final void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowClosing(WindowEvent windowevent) {
		aBool7733 = true;
		destroy();
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	public abstract void init();

	abstract void method6902(int i);

	void method6903() {
		long l = Class69.method1067(-2134081199);
		long l_13_ = aLongArray7738[Class64.anInt677 * -174261721];
		aLongArray7738[-174261721 * Class64.anInt677] = l;
		Class64.anInt677 = (1 + Class64.anInt677 * -174261721 & 0x1f) * 1128977815;
		if (l_13_ != 0L && l <= l_13_) {
			/* empty */
		}
		synchronized (this) {
			Class408.aBool4780 = aBool7751;
		}
		method6932(1558068785);
	}

	abstract void method6904(int i);

	abstract void method6905(int i);

	void method6906(String string, int i) {
		if (!((Class584) this).aBool7768) {
			((Class584) this).aBool7768 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class277.method3718(VarTransmitLevel.anApplet8067, "loggedout", 974535694);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				VarTransmitLevel.anApplet8067.getAppletContext().showDocument(new URL(VarTransmitLevel.anApplet8067.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method6907(String string, String string_14_, int i) {
		if (!((Class584) this).aBool7768) {
			((Class584) this).aBool7768 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class277.method3718(VarTransmitLevel.anApplet8067, "loggedout", 974535694);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				VarTransmitLevel.anApplet8067.getAppletContext().showDocument(new URL(VarTransmitLevel.anApplet8067.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws?").append(string_14_).toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method6908(Class578 class578, boolean bool, byte i) {
		if (class578 == null)
			throw new NullPointerException();
		if (class578 != Class578.aClass578_7669 && class578 != Class578.aClass578_7670)
			throw new IllegalStateException();
		aClass578_7765 = class578;
		if (aClass578_7765 != Class578.aClass578_7670) {
			if (bool)
				aClass578_7765 = Class578.aClass578_7668;
		}
	}

	static {
		anInt7734 = 0;
		anInt7754 = 0;
		aLongArray7737 = new long[32];
		aLongArray7738 = new long[32];
		anInt7748 = 0;
		anInt7760 = 0;
		aString7744 = null;
		aBool7746 = true;
		anInt7747 = 454838764;
		aBool7770 = false;
		aLong7762 = 0L;
		aBool7733 = false;
		aBool7751 = true;
		aClass643_7759 = null;
		aClass643_7752 = null;
		aClass643_7761 = null;
		aClass578_7765 = null;
		aLong7766 = 0L;
		aBool7767 = false;
		anInt7769 = -370911813;
		anInt7742 = 2120616549;
	}

	public void method6909() {
		do {
			try {
				try {
					method6898(1335484471);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class640.method7592(method6946((byte) 67), throwable, 1683343815);
					method6906("crash", 590637953);
					method6899(true, 1709506505);
					break;
				}
				method6899(true, 332448580);
			} catch (Exception object) {
				method6899(true, 1934626064);
				try {
					throw object;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	abstract void method6910();

	abstract void method6911();

	abstract void method6912();

	abstract void method6913();

	abstract void method6914();

	final void method6915(String string, String string_15_, int i, int i_16_, int i_17_, int i_18_, int i_19_) throws Exception {
		Class297.anInt3473 = 1250669939 * i_16_;
		Class381.anInt4602 = -1460295481 * i;
		RuntimeException_Sub5.anInt11785 = 1989080741 * i_17_;
		RuntimeException_Sub5.anInt11786 = i_18_ * 1626623679;
		aString7735 = "Unknown";
		Class648.aString8365 = "1.1";
		try {
			aString7735 = System.getProperty("java.vendor");
			Class648.aString8365 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			Class345.aString4372 = System.getProperty("os.name");
		} catch (Exception exception) {
			Class345.aString4372 = "Unknown";
		}
		Class572_Sub12_Sub2.aString11255 = Class345.aString4372.toLowerCase();
		try {
			Class184.aString2167 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class184.aString2167 = "";
		}
		try {
			Class55.aString525 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class55.aString525 = "";
		}
		try {
			Class302.aString3530 = System.getProperty("user.home");
			if (Class302.aString3530 != null)
				Class302.aString3530 = new StringBuilder().append(Class302.aString3530).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class572_Sub12_Sub2.aString11255.startsWith("win")) {
				if (Class302.aString3530 == null)
					Class302.aString3530 = System.getenv("USERPROFILE");
			} else if (null == Class302.aString3530)
				Class302.aString3530 = System.getenv("HOME");
			if (null != Class302.aString3530)
				Class302.aString3530 = new StringBuilder().append(Class302.aString3530).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (Class302.aString3530 == null)
			Class302.aString3530 = "~/";
		try {
			Class269.anEventQueue2862 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class398.aStringArray4717 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class302.aString3530, "/tmp/", "" };
		aStringArray7741 = new String[] { new StringBuilder().append(".jagex_cache_").append(Class381.anInt4602 * 253532407).toString(),
			new StringBuilder().append(".file_store_").append(Class381.anInt4602 * 253532407).toString() };
		while_82_: for (int i_20_ = 0; i_20_ < 4; i_20_++) {
			Class622.aFile8068 = method6949(string, string_15_, i_20_, 1986510016);
			if (!Class622.aFile8068.exists())
				Class622.aFile8068.mkdirs();
			File[] files = Class622.aFile8068.listFiles();
			if (null != files) {
				File[] files_21_ = files;
				for (int i_22_ = 0; i_22_ < files_21_.length; i_22_++) {
					File file = files_21_[i_22_];
					if (!method6891(file, false, (byte) -109))
						continue while_82_;
				}
			}
			break;
		}
		Class272_Sub1.method8821(Class622.aFile8068, -1566242341);
		Class582.method6875((byte) 0);
		aClass643_7752 = new Class643(new Class649((Class343.method4305("main_file_cache.dat2", 416021079)), "rw", 3221225472L), 5200, 0);
		aClass643_7761 = new Class643(new Class649((Class343.method4305("main_file_cache.idx255", -1720439588)), "rw", 1048576L), 6000, 0);
		Class103.aClass643Array1383 = new Class643[-2072086597 * Class297.anInt3473];
		for (int i_23_ = 0; i_23_ < -2072086597 * Class297.anInt3473; i_23_++)
			Class103.aClass643Array1383[i_23_] = new Class643(new Class649((Class343.method4305(new StringBuilder().append("main_file_cache.idx").append(i_23_).toString(), 72805852)), "rw", 1048576L), 6000, 0);
		try {
			Class4.aClass672_30 = new Class672();
		} catch (Exception exception) {
			Class637.aBool8266 = false;
		}
		RSSocket.aClass577_8294 = new Class577();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_24_ = threadgroup.getParent(); threadgroup_24_ != null; threadgroup_24_ = threadgroup.getParent())
			threadgroup = threadgroup_24_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_25_ = 0; i_25_ < threads.length; i_25_++) {
			if (null != threads[i_25_] && threads[i_25_].getName().startsWith("AWT"))
				threads[i_25_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	String method6916() {
		return null;
	}

	String method6917() {
		return null;
	}

	public void method404(Applet applet) {
		VarTransmitLevel.anApplet8067 = applet;
	}

	public void method403(Applet applet) {
		VarTransmitLevel.anApplet8067 = applet;
	}

	public void method406(Applet applet) {
		VarTransmitLevel.anApplet8067 = applet;
	}

	public void method416(Applet applet) {
		VarTransmitLevel.anApplet8067 = applet;
	}

	void method6918(int i) {
		long l = Class69.method1067(-1654385290);
		long l_26_ = aLongArray7738[Class64.anInt677 * -174261721];
		aLongArray7738[-174261721 * Class64.anInt677] = l;
		Class64.anInt677 = (1 + Class64.anInt677 * -174261721 & 0x1f) * 1128977815;
		if (l_26_ != 0L && l <= l_26_) {
			/* empty */
		}
		synchronized (this) {
			Class408.aBool4780 = aBool7751;
		}
		method6932(1336845298);
	}

	abstract void method6919();

	public static final int method6920() {
		return (int) (1000000000L / (6416999803781759981L * aLong7763));
	}

	public boolean method6921(File file, byte i) {
		if (null == file)
			return false;
		if (!file.exists())
			return false;
		if (!file.isDirectory())
			return false;
		if (file.listFiles().length != 0)
			return false;
		if (!method6891(new File(file, "test.dat"), true, (byte) -121))
			return false;
		method6900(file, Class622.aFile8068, (short) 14696);
		return true;
	}

	static void method6922() {
		try {
			File file = new File(Class302.aString3530, "random.dat");
			if (file.exists())
				aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			else {
				while_83_: for (int i = 0; i < aStringArray7741.length; i++) {
					for (int i_27_ = 0; i_27_ < Class398.aStringArray4717.length; i_27_++) {
						File file_28_ = new File(new StringBuilder().append(Class398.aStringArray4717[i_27_]).append(aStringArray7741[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_28_.exists()) {
							aClass643_7759 = new Class643(new Class649(file_28_, "rw", 25L), 24, 0);
							break while_83_;
						}
					}
				}
			}
			if (aClass643_7759 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	static void method6923() {
		try {
			File file = new File(Class302.aString3530, "random.dat");
			if (file.exists())
				aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			else {
				while_84_: for (int i = 0; i < aStringArray7741.length; i++) {
					for (int i_29_ = 0; i_29_ < Class398.aStringArray4717.length; i_29_++) {
						File file_30_ = new File(new StringBuilder().append(Class398.aStringArray4717[i_29_]).append(aStringArray7741[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_30_.exists()) {
							aClass643_7759 = new Class643(new Class649(file_30_, "rw", 25L), 24, 0);
							break while_84_;
						}
					}
				}
			}
			if (aClass643_7759 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	static void method6924() {
		try {
			File file = new File(Class302.aString3530, "random.dat");
			if (file.exists())
				aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			else {
				while_85_: for (int i = 0; i < aStringArray7741.length; i++) {
					for (int i_31_ = 0; i_31_ < Class398.aStringArray4717.length; i_31_++) {
						File file_32_ = new File(new StringBuilder().append(Class398.aStringArray4717[i_31_]).append(aStringArray7741[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_32_.exists()) {
							aClass643_7759 = new Class643(new Class649(file_32_, "rw", 25L), 24, 0);
							break while_85_;
						}
					}
				}
			}
			if (aClass643_7759 == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass643_7759 = new Class643(new Class649(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	public final void focusGained(FocusEvent focusevent) {
		aBool7751 = true;
		aBool7746 = true;
	}

	synchronized void method6925() {
		method6896(351569401);
		Container container = Class591_Sub5.method8786((byte) -6);
		aCanvas7745 = new Canvas_Sub1(container);
		method6895(container, 239888101);
	}

	synchronized void method6926() {
		method6896(-589557666);
		Container container = Class591_Sub5.method8786((byte) 64);
		aCanvas7745 = new Canvas_Sub1(container);
		method6895(container, 1947599990);
	}

	void method6927() {
		if (null != aCanvas7745) {
			aCanvas7745.removeFocusListener(this);
			aCanvas7745.getParent().setBackground(Color.black);
			aCanvas7745.getParent().remove(aCanvas7745);
		}
	}

	void method6928() {
		if (null != aCanvas7745) {
			aCanvas7745.removeFocusListener(this);
			aCanvas7745.getParent().setBackground(Color.black);
			aCanvas7745.getParent().remove(aCanvas7745);
		}
	}

	void method6929() {
		if (null != aCanvas7745) {
			aCanvas7745.removeFocusListener(this);
			aCanvas7745.getParent().setBackground(Color.black);
			aCanvas7745.getParent().remove(aCanvas7745);
		}
	}

	void method6930() {
		if (null != aCanvas7745) {
			aCanvas7745.removeFocusListener(this);
			aCanvas7745.getParent().setBackground(Color.black);
			aCanvas7745.getParent().remove(aCanvas7745);
		}
	}

	final boolean method6931() {
		return true;
	}

	abstract void method6932(int i);

	void method6933() {
		Class591_Sub5.method8786((byte) -40).setFocusCycleRoot(true);
		anInt7769 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * 370911813);
		anInt7742 = Runtime.getRuntime().availableProcessors() * 2120616549;
		method6894((byte) -100);
		method6902(-674817665);
		Class380.aClass570_4594 = Class134_Sub1.method9972((byte) -94);
		while (5280647269957790405L * aLong7766 == 0L || (Class69.method1067(-1992979471) < 5280647269957790405L * aLong7766)) {
			anInt7749 = Class380.aClass570_4594.method6772(6416999803781759981L * aLong7763) * 1439532117;
			for (int i = 0; i < 600529149 * anInt7749; i++)
				method6918(679038723);
			method6938(1698440623);
			Class640.method7590(aCanvas7745, (byte) 24);
		}
	}

	void method6934() {
		long l = Class69.method1067(-2116000008);
		long l_35_ = aLongArray7737[1014912825 * Class615.anInt8040 - 1 & 0x1f];
		long l_36_ = aLongArray7737[Class615.anInt8040 * 1014912825];
		aLongArray7737[Class615.anInt8040 * 1014912825] = l;
		Class615.anInt8040 = 1060071177 * (Class615.anInt8040 * 1014912825 + 1 & 0x1f);
		if (0L != l_36_ && l > l_36_) {
			int i = (int) (l - l_36_);
			anInt7754 = -1665278321 * (int) (l - l_35_);
			anInt7734 = ((i >> 1) + 32000) / i * -1251173327;
		}
		if ((anInt7747 += 1212090455) * 1252418407 - 1 > 50) {
			anInt7747 -= 474980606;
			aBool7746 = true;
			aCanvas7745.setSize(Class269.anInt2861 * 1960824389, anInt7739 * -530390519);
			aCanvas7745.setVisible(true);
			if (Class18.aFrame142 != null && Class554.aFrame6320 == null) {
				Insets insets = Class18.aFrame142.getInsets();
				aCanvas7745.setLocation(insets.left + anInt7748 * 954583035, insets.top + 2077319943 * anInt7760);
			} else
				aCanvas7745.setLocation(954583035 * anInt7748, anInt7760 * 2077319943);
		}
		method6904(72544307);
	}

	void method6935() {
		long l = Class69.method1067(-1816642674);
		long l_37_ = aLongArray7738[Class64.anInt677 * -174261721];
		aLongArray7738[-174261721 * Class64.anInt677] = l;
		Class64.anInt677 = (1 + Class64.anInt677 * -174261721 & 0x1f) * 1128977815;
		if (l_37_ != 0L && l <= l_37_) {
			/* empty */
		}
		synchronized (this) {
			Class408.aBool4780 = aBool7751;
		}
		method6932(1832052388);
	}

	void method6936() {
		long l = Class69.method1067(-1777471756);
		long l_38_ = aLongArray7737[1014912825 * Class615.anInt8040 - 1 & 0x1f];
		long l_39_ = aLongArray7737[Class615.anInt8040 * 1014912825];
		aLongArray7737[Class615.anInt8040 * 1014912825] = l;
		Class615.anInt8040 = 1060071177 * (Class615.anInt8040 * 1014912825 + 1 & 0x1f);
		if (0L != l_39_ && l > l_39_) {
			int i = (int) (l - l_39_);
			anInt7754 = -1665278321 * (int) (l - l_38_);
			anInt7734 = ((i >> 1) + 32000) / i * -1251173327;
		}
		if ((anInt7747 += 1212090455) * 1252418407 - 1 > 50) {
			anInt7747 -= 474980606;
			aBool7746 = true;
			aCanvas7745.setSize(Class269.anInt2861 * 1960824389, anInt7739 * -530390519);
			aCanvas7745.setVisible(true);
			if (Class18.aFrame142 != null && Class554.aFrame6320 == null) {
				Insets insets = Class18.aFrame142.getInsets();
				aCanvas7745.setLocation(insets.left + anInt7748 * 954583035, insets.top + 2077319943 * anInt7760);
			} else
				aCanvas7745.setLocation(954583035 * anInt7748, anInt7760 * 2077319943);
		}
		method6904(-20953514);
	}

	public void method412() {
		if (!aBool7767) {
			aLong7766 = Class69.method1067(-2024891487) * -5560073831855324147L;
			Class198.method2977(5000L);
			method6899(false, -198238587);
		}
	}

	public static final void method6937() {
		Class380.aClass570_4594.method6765(-1042067865);
		for (int i = 0; i < 32; i++)
			aLongArray7737[i] = 0L;
		for (int i = 0; i < 32; i++)
			aLongArray7738[i] = 0L;
		anInt7749 = 0;
	}

	void method6938(int i) {
		long l = Class69.method1067(-1928765563);
		long l_40_ = aLongArray7737[1014912825 * Class615.anInt8040 - 1 & 0x1f];
		long l_41_ = aLongArray7737[Class615.anInt8040 * 1014912825];
		aLongArray7737[Class615.anInt8040 * 1014912825] = l;
		Class615.anInt8040 = 1060071177 * (Class615.anInt8040 * 1014912825 + 1 & 0x1f);
		if (0L != l_41_ && l > l_41_) {
			int i_42_ = (int) (l - l_41_);
			anInt7754 = -1665278321 * (int) (l - l_40_);
			anInt7734 = ((i_42_ >> 1) + 32000) / i_42_ * -1251173327;
		}
		if ((anInt7747 += 1212090455) * 1252418407 - 1 > 50) {
			anInt7747 -= 474980606;
			aBool7746 = true;
			aCanvas7745.setSize(Class269.anInt2861 * 1960824389, anInt7739 * -530390519);
			aCanvas7745.setVisible(true);
			if (Class18.aFrame142 != null && Class554.aFrame6320 == null) {
				Insets insets = Class18.aFrame142.getInsets();
				aCanvas7745.setLocation(insets.left + anInt7748 * 954583035, insets.top + 2077319943 * anInt7760);
			} else
				aCanvas7745.setLocation(954583035 * anInt7748, anInt7760 * 2077319943);
		}
		method6904(1891192705);
	}

	public final void method405(Graphics graphics) {
		paint(graphics);
	}

	public final void update(Graphics graphics) {
		paint(graphics);
	}

	public void method408() {
		if (!aBool7767)
			aLong7766 = 0L;
	}

	public void method409() {
		if (!aBool7767)
			aLong7766 = 0L;
	}

	public void method410() {
		if (!aBool7767)
			aLong7766 = ((Class69.method1067(-1682415415) + 4000L) * -5560073831855324147L);
	}

	public void method6939(int i) throws Exception_Sub7 {
		if (!((Class584) this).aBool7771) {
			Class597.method7040(1258980432).method421("jaclib", (byte) 18);
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class572_Sub12_Sub2.aString11255.startsWith("win"))
					throw new Exception_Sub7(128, "jaclib");
			}
			((Class584) this).aBool7771 = true;
		}
	}

	public void method413() {
		if (!aBool7767) {
			aLong7766 = Class69.method1067(-1706564399) * -5560073831855324147L;
			Class198.method2977(5000L);
			method6899(false, -2134488484);
		}
	}

	String method6940() {
		return null;
	}

	public final void method6941(FocusEvent focusevent) {
		aBool7751 = true;
		aBool7746 = true;
	}

	public final void method6942(FocusEvent focusevent) {
		aBool7751 = true;
		aBool7746 = true;
	}

	public void start() {
		if (!aBool7767)
			aLong7766 = 0L;
	}

	public final void method6943(FocusEvent focusevent) {
		aBool7751 = false;
	}

	public final void method6944(FocusEvent focusevent) {
		aBool7751 = false;
	}

	synchronized void method6945() {
		method6896(198834101);
		Container container = Class591_Sub5.method8786((byte) 3);
		aCanvas7745 = new Canvas_Sub1(container);
		method6895(container, 1238299161);
	}

	Class584() {
		/* empty */
	}

	String method6946(byte i) {
		return null;
	}

	public final synchronized void method415(Graphics graphics) {
		if (!aBool7767) {
			aBool7746 = true;
			if ((Class69.method1067(-2036249384) - 1596253669902474411L * aLong7762) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= -1987897329 * Class656.anInt8418 && (rectangle.height >= -257945127 * Class287.anInt3421)))
					aBool7770 = true;
			}
		}
	}

	public abstract void method414();

	public void supplyApplet(Applet applet) {
		VarTransmitLevel.anApplet8067 = applet;
	}

	public final void method6947(FocusEvent focusevent) {
		aBool7751 = true;
		aBool7746 = true;
	}

	public static final void method6948() {
		Class52.anImage492 = null;
		aFont7743 = null;
	}

	File method6949(String string, String string_43_, int i, int i_44_) {
		String string_45_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
		Class275.aFile2918 = new File(Class302.aString3530, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_43_).append(string_45_).append(".dat").toString());
		String string_46_ = null;
		String string_47_ = null;
		boolean bool = false;
		if (Class275.aFile2918.exists()) {
			try {
				Class649 class649 = new Class649(Class275.aFile2918, "rw", 10000L);
				int i_48_;
				RSByteBuffer class572_sub15;
				for (class572_sub15 = (new RSByteBuffer((int) class649.method7667(668769978))); (class572_sub15.o * -1585139053 < class572_sub15.b.length); class572_sub15.o += 310393755 * i_48_) {
					i_48_ = class649.method7665(class572_sub15.b, (class572_sub15.o * -1585139053), ((class572_sub15.b).length - (class572_sub15.o * -1585139053)), -1198924662);
					if (i_48_ == -1)
						throw new IOException();
				}
				class572_sub15.o = 0;
				i_48_ = class572_sub15.readUnsignedByte(850182930);
				if (i_48_ < 1 || i_48_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_48_).toString());
				int i_49_ = 0;
				if (i_48_ > 1)
					i_49_ = class572_sub15.readUnsignedByte(1400588635);
				if (i_48_ <= 2) {
					string_46_ = class572_sub15.readVersionedString(-1666480217);
					if (i_49_ == 1)
						string_47_ = class572_sub15.readVersionedString(-1224398286);
				} else {
					string_46_ = class572_sub15.method8480(-1479362548);
					if (i_49_ == 1)
						string_47_ = class572_sub15.method8480(-1479362548);
				}
				class649.method7673(1355978925);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (null != string_46_) {
				File file = new File(string_46_);
				if (!file.exists())
					string_46_ = null;
			}
			if (string_46_ != null) {
				File file = new File(string_46_, "test.dat");
				if (!method6891(file, true, (byte) -17))
					string_46_ = null;
			}
		}
		if (null == string_46_ && 0 == i) {
			while_86_: for (int i_50_ = 0; i_50_ < aStringArray7741.length; i_50_++) {
				for (int i_51_ = 0; i_51_ < Class398.aStringArray4717.length; i_51_++) {
					File file = new File(new StringBuilder().append(Class398.aStringArray4717[i_51_]).append(aStringArray7741[i_50_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method6891(new File(file, "test.dat"), true, (byte) -81)) {
						string_46_ = file.toString();
						bool = true;
						break while_86_;
					}
				}
			}
		}
		if (string_46_ == null) {
			string_46_ = new StringBuilder().append(Class302.aString3530).append(File.separatorChar).append("jagexcache").append(string_45_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_43_).append(File.separatorChar).toString();
			bool = true;
		}
		if (null != string_47_) {
			File file = new File(string_47_);
			File file_52_ = new File(string_46_);
			try {
				File[] files = file.listFiles();
				File[] files_53_ = files;
				for (int i_54_ = 0; i_54_ < files_53_.length; i_54_++) {
					File file_55_ = files_53_[i_54_];
					File file_56_ = new File(file_52_, file_55_.getName());
					boolean bool_57_ = file_55_.renameTo(file_56_);
					if (!bool_57_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method6900(new File(string_46_), null, (short) -20913);
		return new File(string_46_);
	}

	public final synchronized void method407(Graphics graphics) {
		if (!aBool7767) {
			aBool7746 = true;
			if ((Class69.method1067(-2066059543) - 1596253669902474411L * aLong7762) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= -1987897329 * Class656.anInt8418 && (rectangle.height >= -257945127 * Class287.anInt3421)))
					aBool7770 = true;
			}
		}
	}

	static final void method6950(Cs2Executor class441, byte i) {
		int i_58_ = (((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_59_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (i_59_ < 0 || i_59_ >= ((Cs2Executor) class441).globalArrayLengths[i_58_])
			throw new RuntimeException();
		((Cs2Executor) class441).globalArrays[i_58_][i_59_] = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
	}
}

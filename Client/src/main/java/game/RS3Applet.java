package game;

import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;

/**
 * An Applet used for loading the RS3 Client.
 * 
 * @author Im Frizzy <Skype:kfriz1998);
 */
public class RS3Applet extends Applet implements AppletStub {

	/**
	 * An generated serial UID.
	 */
	private static final long serialVersionUID = 1670498001014004354L;

	public static final boolean DEBUG = true;

	public static final boolean USING_ISAAC = true;
	/**
	 * The parameters of the client.
	 */
	private Properties client_parameters = new Properties();

	/**
	 * The current frame of the client application.
	 */
	public JFrame clientFrame = null;

	/**
	 * 
	 * Chooses the Host
	 */
	/**
	 * Address of lobby server.
	 */
	public static boolean MODS = USING_ISAAC;

	public static boolean HOSTED = false;

	public static String LOBBY_ADDR = "127.0.0.1";//"73.195.229.254";//"192.184.11.146"; 178.33.229.142
	/**
	 * Address of lobby server.
	 */
	public static String WEB_STREAM_ADDR = "127.0.0.1";//"192.184.11.146";
	/**
	 * Chooses the Host
	 */
	public static String WORLD_HOST = !MODS ? "http://world58a.runescape.com" : "http://127.0.0.1";
	public static final int MINOR_VERSION = 2;

	/**
	 * The main entry point of the current application.
	 * 
	 * @param args
	 *            The command line arguments.
	 */
	public static void main(String... args) {
		RS3Applet rs3applet = new RS3Applet();
		rs3applet.doFrame();
	}

	/**
	 * Performs the operations needed to show the client.
	 */
	private void doFrame() {
		readParameters();
		openFrame();
		startClient();
		clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void init() {
		readParameters();
		startClient();
	}

	/**
	 * Starts the actual client.
	 */
	private void startClient() {
		try {
			client RS3Client = new client();
			RS3Client.supplyApplet(this);
			RS3Client.init();
			RS3Client.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Opens the actual frame application.
	 */
	private void openFrame() {
		clientFrame = new JFrame("Aegis NTX");
		clientFrame.add(this);
		clientFrame.setVisible(true);
		clientFrame.setSize(800, 600);
	}

	/**
	 * Reads the parameters text file, and stores the parameters.
	 */
	private void readParameters() {
		client_parameters.put("java_arguments", "-Xmx384m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
		client_parameters.put("centerimage", "true");
		client_parameters.put("image", "http://www.runescape.com/img/game/splash6.gif");
		client_parameters.put("separate_jvm", "true");
		client_parameters.put("boxborder", "false");
		client_parameters.put("boxbgcolor", "black");
		client_parameters.put("28", "C42C1E534C0AE9F5D937FDD53A2AB061EEC84D7787AD4E2825B3AFDF3A5A919C257A6ABCB0E2CB50715B5EDE3880BB8F");
		client_parameters.put("18", "0irU8SxE4on1Tl9/y7sxdiPtbP2kt8WC");
		client_parameters.put("4", "false");
		client_parameters.put("25", "0");//Language
		client_parameters.put("41", "false");
		client_parameters.put("36", HOSTED ? "3" : "1");
		client_parameters.put("39", HOSTED ? "3" : "1");
		client_parameters.put("40", LOBBY_ADDR);
		client_parameters.put("-1", "3fOGqwfW5MMZ8acLynrCzA");
		client_parameters.put("24", "halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");//"halign=true|valign=true|image=rs_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
		client_parameters.put("23", "1237575166");
		client_parameters.put("14", "0");
		client_parameters.put("42", "CX_RS3");
		client_parameters.put("27", HOSTED ? "3" : "1");
		client_parameters.put("12", "false");
		client_parameters.put("38", "0");
		client_parameters.put("32", "true");
		client_parameters.put("7", "");
		client_parameters.put("21", ".runescape.com");
		client_parameters.put("37", "http://services.runescape.com/m=gamelogspecs/clientstats?data=");
		client_parameters.put("31", "false");
		client_parameters.put("22", "true");
		client_parameters.put("20", WEB_STREAM_ADDR);
		client_parameters.put("3", "0");
		client_parameters.put("34", WORLD_HOST);
		client_parameters.put("5", "-1082895259");
		client_parameters.put("1", "");//Display
		client_parameters.put("30", "0");
		client_parameters.put("26", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		client_parameters.put("43", "1119795612");
		client_parameters.put("29", "false");
		client_parameters.put("2", "0");
		client_parameters.put("35", "");
		client_parameters.put("33", "225");
		client_parameters.put("13", "1");
		client_parameters.put("15", WORLD_HOST);
		client_parameters.put("9", "");
		client_parameters.put("11", "false");
		client_parameters.put("16", "false");
		client_parameters.put("0", "retUtMMUGOukXomtmWaUig");
	}

	/*
	 * (non-Javadoc)
	 * @see java.applet.AppletStub#appletResize(int, int)
	 */
	@Override
	public void appletResize(int dimensionX, int dimensionY) {
		super.resize(new Dimension(dimensionX, dimensionY));
	}

	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getParameter(java.lang.String)
	 */
	@Override
	public String getParameter(String paramName) {
		return (String) client_parameters.get(paramName);
	}

	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getDocumentBase()
	 */
	@Override
	public URL getDocumentBase() {
		try {
			return new URL(WORLD_HOST);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see java.applet.Applet#getCodeBase()
	 */
	@Override
	public URL getCodeBase() {
		try {
			return new URL(WORLD_HOST);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

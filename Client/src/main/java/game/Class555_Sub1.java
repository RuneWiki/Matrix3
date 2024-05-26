package game;

/* Class555_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class555_Sub1 extends Class555 {
	Socket aSocket8902;
	Class568 aClass568_8903;
	Class561 aClass561_8904;

	public void method6570(byte[] is, int i, int i_0_, byte i_1_) throws IOException {
		((Class555_Sub1) this).aClass561_8904.method6622(is, i, i_0_, 1780500680);
	}

	public int method6560(byte[] is, int i, int i_2_, int i_3_) throws IOException {
		return ((Class555_Sub1) this).aClass568_8903.method6743(is, i, i_2_, (byte) 8);
	}

	public int method6563(byte i) throws IOException {
		return ((Class555_Sub1) this).aClass568_8903.method6727(835742603);
	}

	public void method6571() {
		((Class555_Sub1) this).aClass568_8903.method6730(-1585139053);
		((Class555_Sub1) this).aClass561_8904.method6624(-41043234);
	}

	public void method6558(int i) {
		((Class555_Sub1) this).aClass561_8904.method6623(965795486);
		try {
			((Class555_Sub1) this).aSocket8902.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class555_Sub1) this).aClass568_8903.method6729(-1906723478);
	}

	Class555_Sub1(Socket socket, int i) throws IOException {
		((Class555_Sub1) this).aSocket8902 = socket;
		((Class555_Sub1) this).aSocket8902.setSoTimeout(30000);
		((Class555_Sub1) this).aSocket8902.setTcpNoDelay(true);
		((Class555_Sub1) this).aClass568_8903 = new Class568(((Class555_Sub1) this).aSocket8902.getInputStream(), i);
		((Class555_Sub1) this).aClass561_8904 = new Class561(((Class555_Sub1) this).aSocket8902.getOutputStream(), i);
	}

	public void method6564(int i) {
		((Class555_Sub1) this).aClass568_8903.method6730(-1585139053);
		((Class555_Sub1) this).aClass561_8904.method6624(1774016811);
	}

	public void finalize() {
		method6558(703719362);
	}

	void method8099() {
		method6558(703719362);
	}

	public void method6561(byte[] is, int i, int i_4_) throws IOException {
		((Class555_Sub1) this).aClass561_8904.method6622(is, i, i_4_, 2117596308);
	}

	public int method6565(byte[] is, int i, int i_5_) throws IOException {
		return ((Class555_Sub1) this).aClass568_8903.method6743(is, i, i_5_, (byte) 8);
	}

	public int method6566(byte[] is, int i, int i_6_) throws IOException {
		return ((Class555_Sub1) this).aClass568_8903.method6743(is, i, i_6_, (byte) 8);
	}

	public int method6567(byte[] is, int i, int i_7_) throws IOException {
		return ((Class555_Sub1) this).aClass568_8903.method6743(is, i, i_7_, (byte) 8);
	}

	public void method6568(byte[] is, int i, int i_8_) throws IOException {
		((Class555_Sub1) this).aClass561_8904.method6622(is, i, i_8_, -944036782);
	}

	public void method6572() {
		((Class555_Sub1) this).aClass568_8903.method6730(-1585139053);
		((Class555_Sub1) this).aClass561_8904.method6624(339376087);
	}

	public void method6562() {
		((Class555_Sub1) this).aClass561_8904.method6623(220691317);
		try {
			((Class555_Sub1) this).aSocket8902.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class555_Sub1) this).aClass568_8903.method6729(-1041934043);
	}

	public boolean method6559(int i, int i_9_) throws IOException {
		return ((Class555_Sub1) this).aClass568_8903.method6726(i, (byte) 24);
	}

	public boolean method6569(int i) throws IOException {
		return ((Class555_Sub1) this).aClass568_8903.method6726(i, (byte) 38);
	}
}

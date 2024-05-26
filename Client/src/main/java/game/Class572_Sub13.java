package game;

/* Class572_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public abstract class Class572_Sub13 extends Class572 {
	static final int anInt9095 = 5;
	public static final int anInt9096 = 0;
	static final int anInt9097 = 1;
	public static final int anInt9098 = 2;
	static final int anInt9099 = 3;
	public static final int anInt9100 = -1;
	static final int anInt9101 = 4;
	public static final int anInt9102 = 6;

	public abstract int method8415();

	public abstract int method8416(byte i);

	public abstract int method8417(int i);

	public abstract void method8418();

	public abstract int method8419(int i);

	public abstract int method8420();

	public abstract void method8421(int i);

	public abstract int method8422();

	public abstract int method8423();

	public abstract int method8424();

	public abstract int method8425(int i);

	public abstract long method8426(int i);

	public abstract int method8427();

	public abstract long method8428();

	public abstract int method8429();

	public static boolean method8430(int i) {
		return 0 == i || i == 1 || 2 == i;
	}

	public abstract void method8431();

	Class572_Sub13() {
		/* empty */
	}

	public static long method8432(int i) {
		long l;
		try {
			URL url = new URL(new StringBuilder().append(Class565.method6700("services", false, -226669145)).append("m=accountappeal/login.ws").toString());
			URLConnection urlconnection = url.openConnection();
			urlconnection.setRequestProperty("connection", "close");
			urlconnection.setDoInput(true);
			urlconnection.setDoOutput(true);
			urlconnection.setConnectTimeout(5000);
			OutputStreamWriter outputstreamwriter = new OutputStreamWriter(urlconnection.getOutputStream());
			outputstreamwriter.write("data1=req");
			outputstreamwriter.flush();
			InputStream inputstream = urlconnection.getInputStream();
			RSByteBuffer class572_sub15 = new RSByteBuffer(new byte[1000]);
			for (;;) {
				int i_0_ = inputstream.read(class572_sub15.b, class572_sub15.o * -1585139053, 1000 - (-1585139053 * class572_sub15.o));
				if (-1 == i_0_)
					break;
				class572_sub15.o += 310393755 * i_0_;
				if (-1585139053 * class572_sub15.o >= 1000)
					return 0L;
			}
			class572_sub15.o = 0;
			long l_1_ = class572_sub15.method8476((byte) 4);
			l = l_1_;
		} catch (Exception exception) {
			return 0L;
		}
		return l;
	}
}

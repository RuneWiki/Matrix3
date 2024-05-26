package game;

/* Class627 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class627 implements Interface55 {
	int anInt8090;
	int anInt8091;
	int anInt8092;
	int anInt8093;
	int anInt8094;
	int anInt8095;
	boolean aBool8096;

	public long method314() {
		long[] ls = RSByteBuffer.aLongArray9121;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8095 * -879302479)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (1673737899 * ((Class627) this).anInt8090 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8090 * 1673737899)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8094 * -1280786189 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8093 * -1019789057)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8092 * -1527885965)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).aBool8096 ? 1 : 0)) & 0xffL)];
		return l;
	}

	public long method312() {
		long[] ls = RSByteBuffer.aLongArray9121;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8095 * -879302479)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (1673737899 * ((Class627) this).anInt8090 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8090 * 1673737899)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8094 * -1280786189 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8093 * -1019789057)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8092 * -1527885965)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).aBool8096 ? 1 : 0)) & 0xffL)];
		return l;
	}

	public boolean method313(Interface55 interface55) {
		if (!(interface55 instanceof Class627))
			return false;
		Class627 class627_0_ = (Class627) interface55;
		if (((Class627) this).anInt8095 * -879302479 != ((Class627) class627_0_).anInt8095 * -879302479)
			return false;
		if (1673737899 * ((Class627) class627_0_).anInt8090 != 1673737899 * ((Class627) this).anInt8090)
			return false;
		if (-1280786189 * ((Class627) class627_0_).anInt8094 != ((Class627) this).anInt8094 * -1280786189)
			return false;
		if (((Class627) class627_0_).anInt8093 * -1019789057 != ((Class627) this).anInt8093 * -1019789057)
			return false;
		if (((Class627) class627_0_).anInt8091 * 461047585 != 461047585 * ((Class627) this).anInt8091)
			return false;
		if (((Class627) class627_0_).anInt8092 * -1527885965 != -1527885965 * ((Class627) this).anInt8092)
			return false;
		if (((Class627) class627_0_).aBool8096 != ((Class627) this).aBool8096)
			return false;
		return true;
	}

	public long method52() {
		long[] ls = RSByteBuffer.aLongArray9121;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8095 * -879302479)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (1673737899 * ((Class627) this).anInt8090 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8090 * 1673737899)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8094 * -1280786189 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1280786189 * ((Class627) this).anInt8094)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8093 * -1019789057)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (461047585 * ((Class627) this).anInt8091)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).anInt8092 * -1527885965)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class627) this).aBool8096 ? 1 : 0)) & 0xffL)];
		return l;
	}

	Class627() {
		/* empty */
	}

	public boolean method316(Interface55 interface55) {
		if (!(interface55 instanceof Class627))
			return false;
		Class627 class627_1_ = (Class627) interface55;
		if (((Class627) this).anInt8095 * -879302479 != ((Class627) class627_1_).anInt8095 * -879302479)
			return false;
		if (1673737899 * ((Class627) class627_1_).anInt8090 != 1673737899 * ((Class627) this).anInt8090)
			return false;
		if (-1280786189 * ((Class627) class627_1_).anInt8094 != ((Class627) this).anInt8094 * -1280786189)
			return false;
		if (((Class627) class627_1_).anInt8093 * -1019789057 != ((Class627) this).anInt8093 * -1019789057)
			return false;
		if (((Class627) class627_1_).anInt8091 * 461047585 != 461047585 * ((Class627) this).anInt8091)
			return false;
		if (((Class627) class627_1_).anInt8092 * -1527885965 != -1527885965 * ((Class627) this).anInt8092)
			return false;
		if (((Class627) class627_1_).aBool8096 != ((Class627) this).aBool8096)
			return false;
		return true;
	}

	public boolean method315(Interface55 interface55) {
		if (!(interface55 instanceof Class627))
			return false;
		Class627 class627_2_ = (Class627) interface55;
		if (((Class627) this).anInt8095 * -879302479 != ((Class627) class627_2_).anInt8095 * -879302479)
			return false;
		if (1673737899 * ((Class627) class627_2_).anInt8090 != 1673737899 * ((Class627) this).anInt8090)
			return false;
		if (-1280786189 * ((Class627) class627_2_).anInt8094 != ((Class627) this).anInt8094 * -1280786189)
			return false;
		if (((Class627) class627_2_).anInt8093 * -1019789057 != ((Class627) this).anInt8093 * -1019789057)
			return false;
		if (((Class627) class627_2_).anInt8091 * 461047585 != 461047585 * ((Class627) this).anInt8091)
			return false;
		if (((Class627) class627_2_).anInt8092 * -1527885965 != -1527885965 * ((Class627) this).anInt8092)
			return false;
		if (((Class627) class627_2_).aBool8096 != ((Class627) this).aBool8096)
			return false;
		return true;
	}

	public static void method7475(int i, int[] is, int i_3_) {
		if (-1 != i && Class569.method6760(i, is, -1757942140)) {
			InterfaceDefinitions[] class73s = Class534.aClass83Array5975[i].aClass73Array1081;
			Class281.method3798(class73s, 1146327986);
		}
	}

	static void method7476(Class195 class195, byte i) {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3788, class195.aClass650_2340, -607641234);
		class572_sub25.aRsByteBuffer.writeByte(Class344_Sub2.method9253(-1302928211), -1384395473);
		class572_sub25.aRsByteBuffer.writeShort(1960824389 * Class269.anInt2861, -959295668);
		class572_sub25.aRsByteBuffer.writeShort(client.anInt7739 * -530390519, -1530120492);
		class572_sub25.aRsByteBuffer.writeByte(Class213.aClass572_Sub24_2463.aClass665_Sub2_9203.method8120(1604684486), -1384395473);
		class195.method2929(class572_sub25, (byte) -41);
	}
}

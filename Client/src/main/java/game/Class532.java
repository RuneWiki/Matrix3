package game;

/* Class532 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class532 implements Interface61 {
	String aString5933;
	String aString5934;
	int anInt5935;
	Class268 aClass268_5936;
	public static int anInt5937;

	public void method151() {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3718, client.aClass195_8589.aClass650_2340, -1516770823);
		int i = ((class572_sub25.aRsByteBuffer.o += 310393755) * -1585139053);
		class572_sub25.aRsByteBuffer.writeByte(((Class532) this).aClass268_5936.getId(802403618), -1384395473);
		class572_sub25.aRsByteBuffer.writeString(((Class532) this).aString5934, (byte) -86);
		class572_sub25.aRsByteBuffer.writeShort(((((Class532) this).anInt5935) * -1196651357), -1376097968);
		class572_sub25.aRsByteBuffer.writeString(Class589.aString7804, (byte) -84);
		if (((Class532) this).aString5933 != null) {
			class572_sub25.aRsByteBuffer.writeByte(1, -1384395473);
			String string = ((Class532) this).aString5933;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -84);
		} else
			class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
		class572_sub25.aRsByteBuffer.method8552((-1585139053 * class572_sub25.aRsByteBuffer.o - i), 1246831832);
		client.aClass195_8589.method2929(class572_sub25, (byte) -63);
	}

	public void method299(short i) {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3718, client.aClass195_8589.aClass650_2340, -1024802743);
		int i_0_ = ((class572_sub25.aRsByteBuffer.o += 310393755) * -1585139053);
		class572_sub25.aRsByteBuffer.writeByte(((Class532) this).aClass268_5936.getId(-1730104402), -1384395473);
		class572_sub25.aRsByteBuffer.writeString(((Class532) this).aString5934, (byte) -61);
		class572_sub25.aRsByteBuffer.writeShort(((((Class532) this).anInt5935) * -1196651357), -1748474223);
		class572_sub25.aRsByteBuffer.writeString(Class589.aString7804, (byte) -51);
		if (((Class532) this).aString5933 != null) {
			class572_sub25.aRsByteBuffer.writeByte(1, -1384395473);
			String string = ((Class532) this).aString5933;
			if (string.length() > 100)
				string = string.substring(0, 100);
			class572_sub25.aRsByteBuffer.writeString(string, (byte) -104);
		} else
			class572_sub25.aRsByteBuffer.writeByte(0, -1384395473);
		class572_sub25.aRsByteBuffer.method8552((-1585139053 * class572_sub25.aRsByteBuffer.o - i_0_), 1957887961);
		client.aClass195_8589.method2929(class572_sub25, (byte) -93);
	}

	Class532(Class268 class268, String string, int i, Throwable throwable) {
		((Class532) this).aClass268_5936 = class268;
		((Class532) this).aString5934 = string;
		((Class532) this).anInt5935 = -1096513781 * i;
		((Class532) this).aString5933 = throwable != null ? throwable.getMessage() : null;
	}

	static final void method6345(Cs2Executor class441, int i) {
		int i_1_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		InterfaceDefinitions class73 = Class512.method6083(i_1_, (short) 13484);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = 1554484939 * class73.anInt783;
	}

	public static int method6346(int i, int i_2_, int i_3_) {
		int i_4_ = i_2_ >>> 24;
		int i_5_ = 255 - i_4_;
		i_2_ = ((i_2_ & 0xff00ff) * i_4_ & ~0xff00ff | i_4_ * (i_2_ & 0xff00) & 0xff0000) >>> 8;
		return i_2_ + (((i & 0xff00ff) * i_5_ & ~0xff00ff | i_5_ * (i & 0xff00) & 0xff0000) >>> 8);
	}
}

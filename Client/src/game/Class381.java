package game;

/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class381 {
	Class394[] aClass394Array4595;
	static final int anInt4596 = 4;
	static final int anInt4597 = 256;
	String aString4598;
	Class394[] aClass394Array4599;
	Class385[] aClass385Array4600;
	static final int anInt4601 = 2;
	static int anInt4602;

	void method4644(byte[] is) throws Exception_Sub6 {
		Class380 class380 = new Class380(is);
		int i = class380.method4634((byte) 17);
		if (i != 4)
			throw new Exception_Sub6(this, i, 4);
		((Class381) this).aString4598 = class380.method4635((byte) -105);
		((Class381) this).aClass394Array4595 = new Class394[class380.method4634((byte) 56)];
		((Class381) this).aClass394Array4599 = new Class394[class380.method4634((byte) 102)];
		((Class381) this).aClass385Array4600 = new Class385[class380.method4634((byte) 118)];
		for (int i_0_ = 0; i_0_ < ((Class381) this).aClass394Array4595.length; i_0_++) {
			((Class381) this).aClass394Array4595[i_0_] = new Class394();
			((Class381) this).aClass394Array4595[i_0_].method4737(class380, -2094202221);
		}
		for (int i_1_ = 0; i_1_ < ((Class381) this).aClass394Array4599.length; i_1_++) {
			((Class381) this).aClass394Array4599[i_1_] = new Class394();
			((Class381) this).aClass394Array4599[i_1_].method4737(class380, -2094202221);
		}
		for (int i_2_ = 0; i_2_ < ((Class381) this).aClass385Array4600.length; i_2_++) {
			((Class381) this).aClass385Array4600[i_2_] = new Class385();
			((Class381) this).aClass385Array4600[i_2_].method4659(class380, -2104700684);
		}
	}

	void method4645(byte[] is, short i) throws Exception_Sub6 {
		Class380 class380 = new Class380(is);
		int i_3_ = class380.method4634((byte) 67);
		if (i_3_ != 4)
			throw new Exception_Sub6(this, i_3_, 4);
		((Class381) this).aString4598 = class380.method4635((byte) -90);
		((Class381) this).aClass394Array4595 = new Class394[class380.method4634((byte) 29)];
		((Class381) this).aClass394Array4599 = new Class394[class380.method4634((byte) 78)];
		((Class381) this).aClass385Array4600 = new Class385[class380.method4634((byte) 67)];
		for (int i_4_ = 0; i_4_ < ((Class381) this).aClass394Array4595.length; i_4_++) {
			((Class381) this).aClass394Array4595[i_4_] = new Class394();
			((Class381) this).aClass394Array4595[i_4_].method4737(class380, -2094202221);
		}
		for (int i_5_ = 0; i_5_ < ((Class381) this).aClass394Array4599.length; i_5_++) {
			((Class381) this).aClass394Array4599[i_5_] = new Class394();
			((Class381) this).aClass394Array4599[i_5_].method4737(class380, -2094202221);
		}
		for (int i_6_ = 0; i_6_ < ((Class381) this).aClass385Array4600.length; i_6_++) {
			((Class381) this).aClass385Array4600[i_6_] = new Class385();
			((Class381) this).aClass385Array4600[i_6_].method4659(class380, -2104700684);
		}
	}

	public Class381(byte[] is) throws Exception_Sub6 {
		method4645(is, (short) 173);
	}

	static final void method4646(Cs2Executor class441, int i) {
		int i_7_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = -1433654037 * (((Cs2Executor) class441).aClass572_Sub10_5104.aClass343Array9084[i_7_].anInt4359);
	}

	static final void method4647(Cs2Executor class441, byte i) {
		String string = null;
		if (Class420.aClass20_4967 != null)
			string = Class420.aClass20_4967.method693(-2024050584);
		if (string == null)
			string = "";
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}

	static void method4648(InterfaceDefinitions fromInter, InterfaceDefinitions toInter, byte i) {
		Class572_Sub25 buffer = Class378.sendOutPacket(OutgoingPacket.aClass312_3744, client.aClass195_8589.aClass650_2340, -420519963);
		buffer.aRsByteBuffer.writeShort128(toInter.nvmtheindexisotherone * 411192987, -16711936);
		buffer.aRsByteBuffer.writeShortLE128(411192987 * fromInter.nvmtheindexisotherone, (byte) -34);
		buffer.aRsByteBuffer.writeIntV1(-1718435171 * toInter.selfId, 65280);
		buffer.aRsByteBuffer.writeInt(-1718435171 * fromInter.selfId, -1743753997);
		buffer.aRsByteBuffer.writeShortLE128(-1665128073 * toInter.activeComponent, (byte) -49);
		buffer.aRsByteBuffer.writeShort(-1665128073 * fromInter.activeComponent, -1215304292);
		client.aClass195_8589.method2929(buffer, (byte) -127);
	}

	static void method4649(int i) {
		ItemsContainer.aClass127_9313.method2231((byte) -48);
	}
}

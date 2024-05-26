package game;

/* Class255_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class255_Sub1 extends Class255 implements Interface61 {
	public static Class161 aClass161_8947;
	static String aString8948;

	Class255_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_) {
		super(i, i_0_, i_1_ > 65535 ? 65535 : i_1_, i_2_, i_3_ > 255 ? 255 : i_3_, i_4_, bool, bool_5_, i_6_ > 255 ? 255 : i_6_);
	}

	public void method299(short i) {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3676, client.aClass195_8589.aClass650_2340, 171488063);
		class572_sub25.aRsByteBuffer.writeByte(268212687 * anInt2761, -1384395473);
		int i_7_ = (aBool2763 ? 2 : 0) | (aBool2762 ? 1 : 0);
		class572_sub25.aRsByteBuffer.writeByteC(i_7_, (byte) 4);
		class572_sub25.aRsByteBuffer.writeByte128(-24737105 * anInt2760, 120402352);
		class572_sub25.aRsByteBuffer.writeIntV2(-2044502895 * anInt2757, (byte) 1);
		class572_sub25.aRsByteBuffer.writeByteC(684418941 * anInt2756, (byte) 11);
		class572_sub25.aRsByteBuffer.writeShort(-975548185 * anInt2758, -1275254230);
		class572_sub25.aRsByteBuffer.writeIntLE(1803709391 * anInt2764, (byte) 67);
		class572_sub25.aRsByteBuffer.writeByteC(1913770201 * anInt2759, (byte) -17);
		client.aClass195_8589.method2929(class572_sub25, (byte) -12);
	}

	public void method151() {
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3676, client.aClass195_8589.aClass650_2340, 174031824);
		class572_sub25.aRsByteBuffer.writeByte(268212687 * anInt2761, -1384395473);
		int i = (aBool2763 ? 2 : 0) | (aBool2762 ? 1 : 0);
		class572_sub25.aRsByteBuffer.writeByteC(i, (byte) -4);
		class572_sub25.aRsByteBuffer.writeByte128(-24737105 * anInt2760, -941997056);
		class572_sub25.aRsByteBuffer.writeIntV2(-2044502895 * anInt2757, (byte) 1);
		class572_sub25.aRsByteBuffer.writeByteC(684418941 * anInt2756, (byte) -34);
		class572_sub25.aRsByteBuffer.writeShort(-975548185 * anInt2758, -1366877632);
		class572_sub25.aRsByteBuffer.writeIntLE(1803709391 * anInt2764, (byte) 46);
		class572_sub25.aRsByteBuffer.writeByteC(1913770201 * anInt2759, (byte) -60);
		client.aClass195_8589.method2929(class572_sub25, (byte) -58);
	}

	public static void method8247(byte i) {
		if (null == Class428.aClass398Array5010) {
			Class428.aClass398Array5010 = Class398.method4764(221608438);
			Class428.aClass398_5017 = Class428.aClass398Array5010[0];
			Class92.aLong1239 = Class69.method1067(-2092567564) * -1475677550559237569L;
		}
		if (null == BaseVarType.aClass412_7963)
			Class359.method4440(-1731692030);
		Class398 class398 = Class428.aClass398_5017;
		int i_8_ = Class192.method2911(189860457);
		if (class398 == Class428.aClass398_5017) {
			Class428.aString5016 = ((Class398) Class428.aClass398_5017).aClass279_4711.method3758(Class594.aClass435_7823, 16711935);
			Class121.aString1479 = Class428.aString5016;
			if (((Class398) Class428.aClass398_5017).aBool4704)
				Class339.anInt4325 = (((1843902247 * ((Class398) Class428.aClass398_5017).anInt4700) - (((Class398) Class428.aClass398_5017).anInt4713 * 1380520845)) * i_8_ / 100 + 1380520845 * (((Class398) Class428.aClass398_5017).anInt4713)) * 605492609;
			if (((Class398) Class428.aClass398_5017).aBool4706)
				Class121.aString1479 = new StringBuilder().append(Class121.aString1479).append(" - ").append(Class339.anInt4325 * -1202247039).append("%").toString();
		} else if (Class398.aClass398_4715 == Class428.aClass398_5017) {
			BaseVarType.aClass412_7963 = null;
			Class463.method5478(12, -613515269);
			if (Class428.aBool5019) {
				Class428.aBool5019 = false;
				Class257.method3541(aString8948, Class320.aString3893, "", false, -1816453466);
			}
		} else {
			Class428.aString5016 = ((Class398) class398).aClass279_4712.method3758(Class594.aClass435_7823, 16711935);
			Class121.aString1479 = Class428.aString5016;
			if (((Class398) Class428.aClass398_5017).aBool4706)
				Class121.aString1479 = new StringBuilder().append(Class121.aString1479).append(1843902247 * ((Class398) class398).anInt4700).append("%").toString();
			Class339.anInt4325 = ((Class398) class398).anInt4700 * 1414167975;
			if (((Class398) Class428.aClass398_5017).aBool4704 || ((Class398) class398).aBool4704)
				Class92.aLong1239 = Class69.method1067(-2063681213) * -1475677550559237569L;
		}
		if (BaseVarType.aClass412_7963 != null) {
			BaseVarType.aClass412_7963.method5051(Class92.aLong1239 * -2635844501324888641L, Class428.aString5016, Class121.aString1479, -1202247039 * Class339.anInt4325, Class428.aClass398_5017, -1671318049);
			if (null != Class111.anInterface49Array1427) {
				for (int i_9_ = 1 + -1545178635 * Class428.anInt5009; i_9_ < Class111.anInterface49Array1427.length; i_9_++) {
					if (Class111.anInterface49Array1427[i_9_].method293((byte) 1) >= 100 && i_9_ - 1 == -1545178635 * Class428.anInt5009 && 16 != 835742603 * client.anInt8580 && BaseVarType.aClass412_7963.method5049(300085072)) {
						try {
							Class111.anInterface49Array1427[i_9_].method22((byte) 68);
						} catch (Exception exception) {
							Class111.anInterface49Array1427 = null;
							break;
						}
						BaseVarType.aClass412_7963.method5068(Class111.anInterface49Array1427[i_9_], -2082359873);
						Class428.anInt5009 += 1794372189;
						if ((Class428.anInt5009 * -1545178635 >= Class111.anInterface49Array1427.length - 1) && Class111.anInterface49Array1427.length > 1)
							Class428.anInt5009 = (Class451.aClass218_5170.method3089(726051780) ? 0 : -1) * 1794372189;
					}
				}
			}
		}
	}
}

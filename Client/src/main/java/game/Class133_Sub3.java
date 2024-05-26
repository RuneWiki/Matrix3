package game;

/* Class133_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.awt.Frame;

public class Class133_Sub3 extends Class133 {
	int anInt9830;
	int anInt9831;
	static int anInt9832;

	public void method2303(int i) {
		Class344.audio.sendMusicEffect((((Class133_Sub3) this).anInt9831 * -1417120961), (((Class133_Sub3) this).anInt9830 * 1756984167));
	}

	Class133_Sub3(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub3) this).anInt9831 = class572_sub15.readUnsignedShort(647518597) * 474021055;
		((Class133_Sub3) this).anInt9830 = class572_sub15.readUnsignedByte(1172867167) * 916650071;
	}

	public void method2309() {
		Class344.audio.sendMusicEffect((((Class133_Sub3) this).anInt9831 * -1417120961), (((Class133_Sub3) this).anInt9830 * 1756984167));
	}

	static void method9336(int i) {
		if (Class272_Sub2.aClass106_9517.method1680()) {
			Class272_Sub2.aClass106_9517.method1958(client.aCanvas7745, -2054980252);
			Class490.method5849((byte) 124);
			Dimension dimension = client.aCanvas7745.getSize();
			Class272_Sub2.aClass106_9517.method1685(client.aCanvas7745, dimension.width, dimension.height, 1442497271);
			Class272_Sub2.aClass106_9517.method1688(client.aCanvas7745, (byte) 13);
		} else
			BaseVarType.method7260(Class213.aClass572_Sub24_2463.aClass665_Sub30_9205.method9129(1742326225), false, 2113664350);
		Class54.method987((byte) 14);
	}

	public static void method9337(InterfaceDefinitions[] class73s, int i, int i_0_, int i_1_, boolean bool, int i_2_) {
		for (int i_3_ = 0; i_3_ < class73s.length; i_3_++) {
			InterfaceDefinitions class73 = class73s[i_3_];
			if (class73 != null && -1604592419 * class73.anInt768 == i) {
				Class310.method4049(class73, i_0_, i_1_, bool, (byte) -8);
				Class538.method6399(class73, i_0_, i_1_, (byte) 12);
				if (-1883230751 * class73.anInt774 > (class73.anInt802 * 722211665 - 669238293 * class73.anInt764))
					class73.anInt774 = (class73.anInt802 * -392940687 - 1839584437 * class73.anInt764);
				if (-1883230751 * class73.anInt774 < 0)
					class73.anInt774 = 0;
				if (-2139739529 * class73.anInt775 > (class73.anInt902 * 382019713 - class73.anInt765 * 1360982075))
					class73.anInt775 = (-1817539897 * class73.anInt902 - -727165603 * class73.anInt765);
				if (class73.anInt775 * -2139739529 < 0)
					class73.anInt775 = 0;
				if (0 == class73.anInt752 * -1285279191)
					Class639.method7586(class73s, class73, bool, -689865792);
			}
		}
	}

	public static Frame method9338(Class672 class672, int i, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (0 == i_5_) {
			Class654[] class654s = Class385.method4662(class672, -947938910);
			if (null == class654s)
				return null;
			boolean bool = false;
			for (int i_8_ = 0; i_8_ < class654s.length; i_8_++) {
				if (2075359157 * class654s[i_8_].anInt8402 == i && class654s[i_8_].anInt8401 * 1799291061 == i_4_ && (i_6_ == 0 || i_6_ == (-1144700295 * ((Class654) class654s[i_8_]).anInt8403)) && (!bool || class654s[i_8_].anInt8400 * -813381331 > i_5_)) {
					i_5_ = -813381331 * class654s[i_8_].anInt8400;
					bool = true;
				}
			}
			if (!bool)
				return null;
		}
		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		class672.method7888(frame, i, i_4_, i_5_, i_6_, (byte) -79);
		return frame;
	}
}

package game;

/* Class134_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.EOFException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class134_Sub1 extends Class134 {
	public long aLong10650;
	Class323[] aClass323Array10651;
	public boolean aBool10652 = false;
	boolean aBool10653;
	Set aSet10654;
	long aLong10655;
	static final int anInt10656 = 1;
	int anInt10657;
	VarTransmitLevel[] aClass621Array10658;

	public void method91(VarDefinition class179, int i) {
		if (VarTransmitLevel.ALWAYS_ON_SET_TO_FILE == (((Class134_Sub1) this).aClass621Array10658[473591285 * class179.id]))
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER && method73(class179, -1868701208) != i) {
			((Class134_Sub1) this).aBool10653 = true;
			((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
		}
		super.method76(class179, i, (short) 255);
	}

	public void method9957() {
		if (null != ((Class134_Sub1) this).aClass323Array10651 && (((Class134_Sub1) this).anInt10657 * -623642091 >= ((Class134_Sub1) this).aClass323Array10651.length)) {
			((Class134_Sub1) this).aClass323Array10651 = null;
			((Class134_Sub1) this).anInt10657 = 0;
		}
	}

	public void method9958() {
		for (int i = 0; i < ((Class134_Sub1) this).aClass621Array10658.length; i++) {
			if ((((Class134_Sub1) this).aClass621Array10658[i] == VarTransmitLevel.NEVER) || (VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER == ((Class134_Sub1) this).aClass621Array10658[i]))
				anInterface71_1567.method446(i, (byte) 2);
		}
		((Class134_Sub1) this).aSet10654.clear();
		((Class134_Sub1) this).aBool10653 = false;
		((Class134_Sub1) this).aClass323Array10651 = null;
		((Class134_Sub1) this).aLong10655 = 3070652974507234929L;
	}

	public void method80(VarDefinition class179, Object object, int i) {
		if (VarTransmitLevel.ALWAYS_ON_SET_TO_FILE == (((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]))
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[473591285 * class179.id]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_0_ = method82(class179, (byte) 12);
			if (object != null && object_0_ != null && !object.equals(object_0_)) {
				((Class134_Sub1) this).aBool10653 = true;
				((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
			} else if ((object_0_ == null) != (null == object)) {
				((Class134_Sub1) this).aBool10653 = true;
				((Class134_Sub1) this).aSet10654.add(Integer.valueOf(class179.id * 473591285));
			}
		}
		super.method80(class179, object, -30259456);
	}

	public void method78(VarDefinition class179, long l) {
		if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.ALWAYS_ON_SET_TO_FILE)
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER && method77(class179, 915620986) != l) {
			((Class134_Sub1) this).aBool10653 = true;
			((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
		}
		super.method78(class179, l);
	}

	public void method9959(byte i) {
		((Class134_Sub1) this).anInt10657 = 0;
	}

	public void method9960(int i) {
		for (int i_1_ = 0; i_1_ < ((Class134_Sub1) this).aClass621Array10658.length; i_1_++) {
			if ((((Class134_Sub1) this).aClass621Array10658[i_1_] == VarTransmitLevel.NEVER) || (VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER == ((Class134_Sub1) this).aClass621Array10658[i_1_]))
				anInterface71_1567.method446(i_1_, (byte) 2);
		}
		((Class134_Sub1) this).aSet10654.clear();
		((Class134_Sub1) this).aBool10653 = false;
		((Class134_Sub1) this).aClass323Array10651 = null;
		((Class134_Sub1) this).aLong10655 = 3070652974507234929L;
	}

	public void method9961(Class649 class649, int i) {
		do {
			try {
				try {
					int i_2_ = 3;
					int i_3_ = 0;
					Iterator iterator = anInterface71_1567.iterator();
					while (iterator.hasNext()) {
						Class323 class323 = (Class323) iterator.next();
						if (VarTransmitLevel.ALWAYS_ON_SET_TO_FILE == (((Class134_Sub1) this).aClass621Array10658[class323.anInt4079 * 380662693])) {
							i_2_ += Class389.aClass202_Sub1_Sub2_4652.method9202(class323, (byte) 84);
							i_3_++;
						}
					}
					RSByteBuffer class572_sub15 = new RSByteBuffer(i_2_);
					class572_sub15.writeByte(1, -1384395473);
					class572_sub15.writeShort(i_3_, -2131436761);
					Iterator iterator_4_ = anInterface71_1567.iterator();
					while (iterator_4_.hasNext()) {
						Class323 class323 = (Class323) iterator_4_.next();
						if ((((Class134_Sub1) this).aClass621Array10658[380662693 * class323.anInt4079]) == VarTransmitLevel.ALWAYS_ON_SET_TO_FILE)
							Class389.aClass202_Sub1_Sub2_4652.method9204(class572_sub15, class323, 1242155716);
					}
					class649.method7674(class572_sub15.b, 0, class572_sub15.o * -1585139053, 891219818);
				} catch (Exception exception) {
					try {
						class649.method7673(1304753140);
					} catch (Exception exception_5_) {
						exception = exception_5_;
					}
					break;
				}
				try {
					class649.method7673(1214304288);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class649.method7673(1921557733);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					throw object;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (false);
		aLong10650 = Class69.method1067(-1992766202) * -4057916444211707309L;
		aBool10652 = false;
	}

	public void method86(VarDefinition class179, long l) {
		if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.ALWAYS_ON_SET_TO_FILE)
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER && method77(class179, -1516403030) != l) {
			((Class134_Sub1) this).aBool10653 = true;
			((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
		}
		super.method78(class179, l);
	}

	public void method76(VarDefinition class179, int i, short i_6_) {
		if (VarTransmitLevel.ALWAYS_ON_SET_TO_FILE == (((Class134_Sub1) this).aClass621Array10658[473591285 * class179.id]))
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER && method73(class179, -1964496410) != i) {
			((Class134_Sub1) this).aBool10653 = true;
			((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
		}
		super.method76(class179, i, (short) 255);
	}

	public void method92(VarDefinition class179, long l) {
		if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.ALWAYS_ON_SET_TO_FILE)
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER && method77(class179, 594268856) != l) {
			((Class134_Sub1) this).aBool10653 = true;
			((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
		}
		super.method78(class179, l);
	}

	public void method84(VarDefinition class179, int i) {
		if (VarTransmitLevel.ALWAYS_ON_SET_TO_FILE == (((Class134_Sub1) this).aClass621Array10658[473591285 * class179.id]))
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER && method73(class179, -1684898287) != i) {
			((Class134_Sub1) this).aBool10653 = true;
			((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
		}
		super.method76(class179, i, (short) 255);
	}

	public void method83(VarDefinition class179, int i) {
		if (VarTransmitLevel.ALWAYS_ON_SET_TO_FILE == (((Class134_Sub1) this).aClass621Array10658[473591285 * class179.id]))
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER && method73(class179, -1105716269) != i) {
			((Class134_Sub1) this).aBool10653 = true;
			((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
		}
		super.method76(class179, i, (short) 255);
	}

	public void method9962(Class649 class649, byte i) {
		do {
			try {
				try {
					byte[] is = new byte[(int) class649.method7667(668769978)];
					int i_7_;
					for (int i_8_ = 0; i_8_ < is.length; i_8_ += i_7_) {
						i_7_ = class649.method7665(is, i_8_, is.length - i_8_, -862936972);
						if (-1 == i_7_)
							throw new EOFException();
					}
					RSByteBuffer class572_sub15 = new RSByteBuffer(is);
					if ((class572_sub15.b.length - class572_sub15.o * -1585139053) < 1) {
						try {
							class649.method7673(1732175066);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_9_ = class572_sub15.readUnsignedByte(690927369);
					if (i_9_ < 0 || i_9_ > 1) {
						try {
							class649.method7673(1820007853);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					if ((class572_sub15.b.length - class572_sub15.o * -1585139053) < 2) {
						try {
							class649.method7673(2011853138);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					int i_10_ = class572_sub15.readUnsignedShort(647518597);
					if ((class572_sub15.b.length - class572_sub15.o * -1585139053) < i_10_ * 6) {
						try {
							class649.method7673(1466752744);
						} catch (Exception exception) {
							/* empty */
						}
						break;
					}
					for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
						Class323 class323 = Class389.aClass202_Sub1_Sub2_4652.method9203(class572_sub15, -1443793256);
						if (((((Class134_Sub1) this).aClass621Array10658[class323.anInt4079 * 380662693]) == VarTransmitLevel.ALWAYS_ON_SET_TO_FILE) && (((VarDefinition) (Class389.aClass202_Sub1_Sub2_4652.getDefinition(class323.anInt4079 * 380662693, 522984683))).dataType.getBaseType(-1709185176).aClass7956.isAssignableFrom(class323.anObject4078.getClass())))
							anInterface71_1567.method443((380662693 * (class323.anInt4079)), class323.anObject4078, -2073018219);
					}
				} catch (Exception exception) {
					try {
						class649.method7673(1840474196);
					} catch (Exception exception_12_) {
						exception = exception_12_;
					}
					break;
				}
				try {
					class649.method7673(1818602111);
				} catch (Exception exception) {
					/* empty */
				}
			} catch (Exception object) {
				try {
					class649.method7673(819420069);
				} catch (Exception exception) {
					/* empty */
				}
				try {
					throw object;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} while (false);
	}

	public void method79(VarDefinition class179, Object object) {
		if (VarTransmitLevel.ALWAYS_ON_SET_TO_FILE == (((Class134_Sub1) this).aClass621Array10658[class179.id * 473591285]))
			aBool10652 = true;
		else if ((((Class134_Sub1) this).aClass621Array10658[473591285 * class179.id]) == VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80)
					object = string.substring(0, 80);
			}
			Object object_13_ = method82(class179, (byte) 12);
			if (object != null && object_13_ != null && !object.equals(object_13_)) {
				((Class134_Sub1) this).aBool10653 = true;
				((Class134_Sub1) this).aSet10654.add(Integer.valueOf(473591285 * class179.id));
			} else if ((object_13_ == null) != (null == object)) {
				((Class134_Sub1) this).aBool10653 = true;
				((Class134_Sub1) this).aSet10654.add(Integer.valueOf(class179.id * 473591285));
			}
		}
		super.method80(class179, object, -30259456);
	}

	public void method9963() {
		for (int i = 0; i < ((Class134_Sub1) this).aClass621Array10658.length; i++) {
			if ((((Class134_Sub1) this).aClass621Array10658[i] == VarTransmitLevel.NEVER) || (VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER == ((Class134_Sub1) this).aClass621Array10658[i]))
				anInterface71_1567.method446(i, (byte) 2);
		}
		((Class134_Sub1) this).aSet10654.clear();
		((Class134_Sub1) this).aBool10653 = false;
		((Class134_Sub1) this).aClass323Array10651 = null;
		((Class134_Sub1) this).aLong10655 = 3070652974507234929L;
	}

	public void method9964() {
		((Class134_Sub1) this).anInt10657 = 0;
	}

	public void method9965() {
		for (int i = 0; i < ((Class134_Sub1) this).aClass621Array10658.length; i++) {
			if ((((Class134_Sub1) this).aClass621Array10658[i] == VarTransmitLevel.NEVER) || (VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER == ((Class134_Sub1) this).aClass621Array10658[i]))
				anInterface71_1567.method446(i, (byte) 2);
		}
		((Class134_Sub1) this).aSet10654.clear();
		((Class134_Sub1) this).aBool10653 = false;
		((Class134_Sub1) this).aClass323Array10651 = null;
		((Class134_Sub1) this).aLong10655 = 3070652974507234929L;
	}

	public void method9966() {
		for (int i = 0; i < ((Class134_Sub1) this).aClass621Array10658.length; i++) {
			if ((((Class134_Sub1) this).aClass621Array10658[i] == VarTransmitLevel.NEVER) || (VarTransmitLevel.DIFFERENT_ON_SET_TO_SERVER == ((Class134_Sub1) this).aClass621Array10658[i]))
				anInterface71_1567.method446(i, (byte) 2);
		}
		((Class134_Sub1) this).aSet10654.clear();
		((Class134_Sub1) this).aBool10653 = false;
		((Class134_Sub1) this).aClass323Array10651 = null;
		((Class134_Sub1) this).aLong10655 = 3070652974507234929L;
	}

	public Class134_Sub1(Class202_Sub1 class202_sub1) {
		super(class202_sub1);
		aLong10650 = 4057916444211707309L;
		((Class134_Sub1) this).aBool10653 = false;
		((Class134_Sub1) this).aLong10655 = 3070652974507234929L;
		((Class134_Sub1) this).anInt10657 = 0;
		((Class134_Sub1) this).aClass621Array10658 = new VarTransmitLevel[class202_sub1.method113((byte) 25)];
		for (int i = 0; i < class202_sub1.method113((byte) 72); i++)
			((Class134_Sub1) this).aClass621Array10658[i] = (((VarDefinition) class202_sub1.getDefinition(i, 2016448520)).transmitLevel);
		((Class134_Sub1) this).aSet10654 = new HashSet(class202_sub1.method113((byte) 81));
	}

	public void method9967() {
		((Class134_Sub1) this).anInt10657 = 0;
	}

	public void method9968(byte i) {
		if (Class69.method1067(-1859303815) >= -6730369919930657425L * ((Class134_Sub1) this).aLong10655) {
			if (null == ((Class134_Sub1) this).aClass323Array10651) {
				if (!((Class134_Sub1) this).aBool10653)
					return;
				((Class134_Sub1) this).aClass323Array10651 = new Class323[((Class134_Sub1) this).aSet10654.size()];
				int i_14_ = 0;
				Iterator iterator = ((Class134_Sub1) this).aSet10654.iterator();
				while (iterator.hasNext()) {
					int i_15_ = ((Integer) iterator.next()).intValue();
					((Class134_Sub1) this).aClass323Array10651[i_14_++] = new Class323(i_15_, anInterface71_1567.method134(i_15_, (byte) 0));
				}
				((Class134_Sub1) this).anInt10657 = 0;
				((Class134_Sub1) this).aBool10653 = false;
				((Class134_Sub1) this).aSet10654.clear();
			}
			if (null != ((Class134_Sub1) this).aClass323Array10651 && (-623642091 * ((Class134_Sub1) this).anInt10657 < ((Class134_Sub1) this).aClass323Array10651.length)) {
				Class195 class195 = Class166.method2676((byte) 126);
				if (class195.anInt2327 * -679741437 <= 1200) {
					Class572_Sub25 buff = Class378.sendOutPacket(OutgoingPacket.aClass312_3789, class195.aClass650_2340, -2037586637);
					buff.aRsByteBuffer.writeShort(0, -1994857828);
					int i_16_ = (buff.aRsByteBuffer.o * -1585139053);
					buff.aRsByteBuffer.o += 310393755;
					for (/**/; (-623642091 * ((Class134_Sub1) this).anInt10657 < ((Class134_Sub1) this).aClass323Array10651.length); ((Class134_Sub1) this).anInt10657 += -957414083) {
						Class323 class323 = (((Class134_Sub1) this).aClass323Array10651[(-623642091 * ((Class134_Sub1) this).anInt10657)]);
						if ((class195.anInt2327 * -679741437 + (buff.aRsByteBuffer.o) * -1585139053 + Class389.aClass202_Sub1_Sub2_4652.method9202(class323, (byte) 42)) > 1500)
							break;
						Class389.aClass202_Sub1_Sub2_4652.method9204(buff.aRsByteBuffer, class323, 1189158596);
					}
					buff.aRsByteBuffer.method8464((buff.aRsByteBuffer.o * -1585139053) - i_16_, -1404479454);
					if (-623642091 * ((Class134_Sub1) this).anInt10657 >= ((Class134_Sub1) this).aClass323Array10651.length)
						buff.aRsByteBuffer.b[i_16_] = (byte) 1;
					else
						buff.aRsByteBuffer.b[i_16_] = (byte) 0;
					class195.method2929(buff, (byte) -107);
					((Class134_Sub1) this).aLong10655 = ((Class69.method1067(-1935553956) + 1000L) * -3070652974507234929L);
				}
			}
		}
	}

	public void method9969(int i) {
		if (null != ((Class134_Sub1) this).aClass323Array10651 && (((Class134_Sub1) this).anInt10657 * -623642091 >= ((Class134_Sub1) this).aClass323Array10651.length)) {
			((Class134_Sub1) this).aClass323Array10651 = null;
			((Class134_Sub1) this).anInt10657 = 0;
		}
	}

	public void method9970() {
		if (null != ((Class134_Sub1) this).aClass323Array10651 && (((Class134_Sub1) this).anInt10657 * -623642091 >= ((Class134_Sub1) this).aClass323Array10651.length)) {
			((Class134_Sub1) this).aClass323Array10651 = null;
			((Class134_Sub1) this).anInt10657 = 0;
		}
	}

	public void method9971() {
		if (null != ((Class134_Sub1) this).aClass323Array10651 && (((Class134_Sub1) this).anInt10657 * -623642091 >= ((Class134_Sub1) this).aClass323Array10651.length)) {
			((Class134_Sub1) this).aClass323Array10651 = null;
			((Class134_Sub1) this).anInt10657 = 0;
		}
	}

	public static Class570 method9972(byte i) {
		Class570_Sub2 class570_sub2;
		try {
			class570_sub2 = new Class570_Sub2();
		} catch (Throwable throwable) {
			return new Class570_Sub1();
		}
		return class570_sub2;
	}

	static final void method9973(Cs2Executor class441, short i) {
		if (Class108.aClass549_1426.method6514(82, (byte) 1))
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 1;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	static void method9974(int i) {
		if (null != Class16.aClass17_130) {
			try {
				int i_17_;
				if (Class16.anInt127 * -1991348761 == 0)
					i_17_ = 250;
				else
					i_17_ = 2000;
				Class16.anInt128 += 1774558363;
				if (Class16.anInt128 * -455415405 > i_17_)
					Class384.method4657((byte) 83);
				if (Class16.aClass17_130 == Class17.aClass17_136) {
					client.aClass195_8632.method2931((Class402_Sub1.method9215(Class633.aClass641_8208.method7594((short) -1620), 15000, 1839449068)), Class633.aClass641_8208.address, -1657220979);
					client.aClass195_8632.method2926((byte) 60);
					Class572_Sub25 class572_sub25 = Class479.method5673((byte) 2);
					class572_sub25.aRsByteBuffer.writeByte(Class315.aClass315_3823.anInt3827 * -540596227, -1384395473);
					class572_sub25.aRsByteBuffer.writeShort(0, -1662129434);
					int i_18_ = -1585139053 * (class572_sub25.aRsByteBuffer.o);
					class572_sub25.aRsByteBuffer.writeShort(831, -1679528711);
					class572_sub25.aRsByteBuffer.writeShort(RS3Applet.MINOR_VERSION, -1096607268);
					Class246.anIntArray2684 = Class198.method2975(class572_sub25, -717078719);
					int i_19_ = -1585139053 * (class572_sub25.aRsByteBuffer.o);
					class572_sub25.aRsByteBuffer.writeString(client.aString8838, (byte) -118);
					class572_sub25.aRsByteBuffer.writeShort(client.anInt8808 * -1421244803, -936545989);
					class572_sub25.aRsByteBuffer.writeInt(413351069 * client.anInt8567, -1743753997);
					class572_sub25.aRsByteBuffer.writeInt(2093536371 * client.anInt8566, -1743753997);
					class572_sub25.aRsByteBuffer.writeString(Class572_Sub25.aString9256, (byte) -36);
					class572_sub25.aRsByteBuffer.writeByte(Class594.aClass435_7823.getId(263048773), -1384395473);
					class572_sub25.aRsByteBuffer.writeByte(client.aClass437_8705.anInt5076 * 1002594281, -1384395473);
					Class324.method4145((class572_sub25.aRsByteBuffer), (byte) 1);
					String string = client.aString8570;
					class572_sub25.aRsByteBuffer.writeByte(null == string ? 0 : 1, -1384395473);
					if (null != string)
						class572_sub25.aRsByteBuffer.writeString(string, (byte) -125);
					Class272_Sub1.aClass572_Sub5_9450.method8376(class572_sub25.aRsByteBuffer, -248085495);
					class572_sub25.aRsByteBuffer.o += -2122211011;
					class572_sub25.aRsByteBuffer.method8489(Class246.anIntArray2684, i_19_, -1585139053 * (class572_sub25.aRsByteBuffer.o), 2144882977);
					class572_sub25.aRsByteBuffer.method8464((-1585139053 * (class572_sub25.aRsByteBuffer.o) - i_18_), -1404479454);
					client.aClass195_8632.method2929(class572_sub25, (byte) -49);
					client.aClass195_8632.method2936((byte) -24);
					Class16.aClass17_130 = Class17.aClass17_135;
				}
				if (Class16.aClass17_130 == Class17.aClass17_135) {
					if (client.aClass195_8632.method2933(-2042773305) == null)
						Class384.method4657((byte) 79);
					else if (client.aClass195_8632.method2933(-1948431147).method6559(1, 853008946)) {
						client.aClass195_8632.method2933(-2107586759).method6560((((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.b), 0, 1, 1898855038);
						Class76.aClass651_945 = ((Class651) Class455.method5387(Class395.method4745(2038567342), (((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.b[0]) & 0xff, -1920346331));
						if (Class76.aClass651_945 == Class651.aClass651_8383) {
							client.aClass195_8632.aClass650_2340 = new Class650(Class246.anIntArray2684);
							int[] is = new int[4];
							for (int i_20_ = 0; i_20_ < 4; i_20_++)
								is[i_20_] = Class246.anIntArray2684[i_20_] + 50;
							((Class195) client.aClass195_8632).aClass650_2331 = new Class650(is);
							new Class650(is);
							((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.method10388((((Class195) client.aClass195_8632).aClass650_2331), (byte) -51);
							Class463.method5478(6, -344778528);
							client.aClass195_8632.method2926((byte) 34);
							((Class195) client.aClass195_8632).aClass572_Sub15_Sub2_2330.o = 0;
							((Class195) client.aClass195_8632).aClass321_2334 = null;
							((Class195) client.aClass195_8632).aClass321_2342 = null;
							((Class195) client.aClass195_8632).aClass321_2343 = null;
							((Class195) client.aClass195_8632).anInt2335 = 0;
							Class133_Sub23.playerVarsProvider.domain.method6070((byte) -68);
							Class280.method3795((byte) 52);
						} else
							client.aClass195_8632.method2943(-1670077145);
						((Class195) client.aClass195_8632).currentPacket = null;
						Class16.aClass17_130 = null;
					}
				}
			} catch (IOException ioexception) {
				Class384.method4657((byte) 120);
			}
		}
	}

	public static Class248 method9975(Class648 class648, boolean bool, int i, boolean bool_21_, boolean bool_22_, int i_23_) {
		if (null == Class303.aClass224_Sub1Array3536)
			Class303.aClass224_Sub1Array3536 = new Class224_Sub1[Class572_Sub10.method8408(-706227068)];
		Class558 class558 = null;
		int i_24_ = class648.method7662((byte) 126);
		if (null != client.aClass643_7752 && !Class133_Sub13.aBool9946)
			class558 = new Class558(i_24_, client.aClass643_7752, Class103.aClass643Array1383[i_24_], (i_24_ == Class648.aClass648_8352.method7662((byte) 108) ? 8000000 : 2000000));
		Class303.aClass224_Sub1Array3536[i_24_] = Class41.aClass259_425.method3548(i_24_, class558, Class224_Sub1.aClass558_9492, class648.method7657(-2037536229), (byte) -17);
		if (bool_22_)
			Class303.aClass224_Sub1Array3536[i_24_].method8850((byte) -21);
		return new Class248(Class303.aClass224_Sub1Array3536[i_24_], bool, i);
	}

	public static int method9976(byte i) {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Class106 class106 = Class435.method5263(0, canvas, null, null, null, null, null, null, 0, 2004093669);
		long l = Class69.method1067(-1976919219);
		for (int i_25_ = 0; i_25_ < 10000; i_25_++)
			class106.method1670(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		int i_26_ = (int) (Class69.method1067(-2107910334) - l);
		class106.method1720(0, 0, 100, 100, -16777216, (byte) -11);
		class106.method1666(-1532493602);
		return i_26_;
	}
}

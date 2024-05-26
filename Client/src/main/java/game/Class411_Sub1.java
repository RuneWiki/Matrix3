package game;

/* Class411_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class411_Sub1 extends Class411 {
	int anInt10363 = 0;

	public int method9569(int i) {
		((Class411_Sub1) this).anInt10363 += 1870139309;
		if (126 == ((Class411_Sub1) this).anInt10363 * 1396976677)
			((Class411_Sub1) this).anInt10363 = 0;
		return ((Class411_Sub1) this).anInt10363 * 1396976677;
	}

	public Class411_Sub1(Interface47 interface47) {
		super(Class407.aClass407_4766, interface47);
	}

	public void method9570(RSByteBuffer class572_sub15, int i, int i_0_) {
		int i_1_ = -1585139053 * class572_sub15.o;
		int i_2_ = class572_sub15.readUnsignedByte(1263368176);
		method5037(Class184.method2827(i_2_ & 0x1, (byte) 42), -1150861353);
		if (0 != (i_2_ & 0x8)) {
			Class416 class416 = BaseVarType.method7259(class572_sub15.readUnsignedByte(-75890765), (byte) -108);
			if (((Class411_Sub1) this).aClass416_4880 != class416) {
				try {
					method4971(class416, true, -1493646670);
				} catch (Exception_Sub4 exception_sub4) {
					exception_sub4.printStackTrace();
				}
			}
		}
		if (0 != (i_2_ & 0x10)) {
			Class413 class413 = Class402.method4782(class572_sub15.readUnsignedByte(1158183283), 194609714);
			if (((Class411_Sub1) this).aClass413_4889 != class413) {
				try {
					method4972(class413, true, (byte) 9);
				} catch (Exception_Sub4 exception_sub4) {
					exception_sub4.printStackTrace();
				}
			}
		}
		if (1 == (i_2_ >> 7 & 0x1)) {
			int i_3_ = class572_sub15.readUnsignedShort(647518597);
			if ((i_3_ >> (((Class400) Class400.aClass400_4727).anInt4738 * -1350166703) & 0x1) == 1)
				((Class411_Sub1) this).aClass240_4873.method3308(class572_sub15);
			if ((i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4735).anInt4738) & 0x1) == 1)
				((Class411_Sub1) this).aClass240_4872.method3308(class572_sub15);
			if ((i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4728).anInt4738) & 0x1) == 1)
				((Class411_Sub1) this).aClass240_4876.method3308(class572_sub15);
			if (1 == (i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4729).anInt4738) & 0x1))
				((Class411_Sub1) this).aClass240_4877.method3308(class572_sub15);
			if (1 == (i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4730).anInt4738) & 0x1)) {
				((Class411_Sub1) this).aFloat4884 = class572_sub15.method8448((byte) 2);
				((Class411_Sub1) this).aFloat4891 = class572_sub15.method8448((byte) 2);
			}
			if ((i_3_ >> (((Class400) Class400.aClass400_4731).anInt4738 * -1350166703) & 0x1) == 1) {
				((Class411_Sub1) this).aFloat4874 = class572_sub15.method8448((byte) 2);
				((Class411_Sub1) this).aFloat4893 = class572_sub15.method8448((byte) 2);
			}
			if ((i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4726).anInt4738) & 0x1) == 1)
				((Class411_Sub1) this).aClass414_4864 = Class280_Sub1.method8818(class572_sub15.readUnsignedByte(1029454038), (byte) 115);
			if ((i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4733).anInt4738) & 0x1) == 1) {
				((Class411_Sub1) this).anInt4871 = class572_sub15.read24BitInt(1140925462) * 1988122249;
				class572_sub15.readUnsignedByte(470173734);
			}
			if (1 == (i_3_ >> (((Class400) Class400.aClass400_4741).anInt4738 * -1350166703) & 0x1)) {
				int i_4_ = class572_sub15.readUnsignedByte(1203005211);
				((Class411_Sub1) this).aBool4862 = (i_4_ & 0x1) == 1;
				((Class411_Sub1) this).aBool4895 = 2 == (i_4_ & 0x2);
			}
			if ((i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4732).anInt4738) & 0x1) == 1) {
				int i_5_ = class572_sub15.readUnsignedByte(722748304);
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					int i_7_ = class572_sub15.readUnsignedByte(1505682227);
					int i_8_ = class572_sub15.readUnsignedByte(1531858705);
					if (0 == i_7_)
						method4995(i_8_, (byte) -37);
					else {
						Class395 class395 = Class117.method2152(class572_sub15.readUnsignedByte(1333860673), -1524040384);
						boolean bool = true;
						Iterator iterator = ((Class411_Sub1) this).aClass676_4898.iterator();
						while (iterator.hasNext()) {
							Class572_Sub12_Sub17 class572_sub12_sub17 = (Class572_Sub12_Sub17) iterator.next();
							if (1603351871 * class572_sub12_sub17.anInt11479 == i_8_) {
								class572_sub12_sub17.method10449(class572_sub15, (byte) -43);
								bool = false;
								break;
							}
						}
						if (bool)
							method5041(Class133_Sub20.method9538(i_8_, class395, class572_sub15, -683438946), -435326039);
					}
				}
			}
			if ((i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4736).anInt4738) & 0x1) == 1) {
				((Class411_Sub1) this).anInt4896 = class572_sub15.readUnsignedShort(647518597) * -106458721;
				((Class411_Sub1) this).aFloat4897 = class572_sub15.method8448((byte) 2);
			}
			if (1 == (i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4737).anInt4738) & 0x1))
				((Class411_Sub1) this).aClass427_4870 = RSSocket.method7603(class572_sub15.readUnsignedByte(30856356), -1580049557);
			if (1 == (i_3_ >> (((Class400) Class400.aClass400_4740).anInt4738 * -1350166703) & 0x1)) {
				((Class411_Sub1) this).aClass240_4866.method3308(class572_sub15);
				((Class411_Sub1) this).aClass240_4885.method3308(class572_sub15);
				((Class411_Sub1) this).aFloat4886 = class572_sub15.method8448((byte) 2);
				((Class411_Sub1) this).aFloat4887 = class572_sub15.method8448((byte) 2);
			}
			if ((i_3_ >> (-1350166703 * ((Class400) Class400.aClass400_4734).anInt4738) & 0x1) == 1)
				class572_sub15.method8448((byte) 2);
			if (1 == (i_3_ >> (((Class400) Class400.aClass400_4739).anInt4738 * -1350166703) & 0x1))
				((Class411_Sub1) this).aFloat4888 = class572_sub15.method8448((byte) 2);
		}
		if (((Class411_Sub1) this).aClass658_4867 != null && (i_2_ >> 5 & 0x1) == 1)
			((Class411_Sub1) this).aClass658_4867.method7737(class572_sub15, -1319914426);
		if (null != ((Class411_Sub1) this).aClass423_4868 && (i_2_ >> 6 & 0x1) == 1)
			((Class411_Sub1) this).aClass423_4868.method5162(class572_sub15, (byte) 81);
		if (i != -1585139053 * class572_sub15.o - i_1_)
			throw new RuntimeException(new StringBuilder().append(-1585139053 * (class572_sub15.o) - i_1_).append(",").append(i).toString());
	}

	static String method9571(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (0L == l % 37L)
			return null;
		int i = 0;
		for (long l_9_ = l; l_9_ != 0L; l_9_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_10_ = l;
			l /= 37L;
			char c = Class451.aCharArray5171[(int) (l_10_ - l * 37L)];
			if ('_' == c) {
				int i_11_ = stringbuilder.length() - 1;
				stringbuilder.setCharAt(i_11_, Character.toUpperCase(stringbuilder.charAt(i_11_)));
				c = '\u00a0';
			}
			stringbuilder.append(c);
		}
		stringbuilder.reverse();
		stringbuilder.setCharAt(0, Character.toUpperCase(stringbuilder.charAt(0)));
		return stringbuilder.toString();
	}

	static void method9572(Class83 class83, int i, int i_12_, int i_13_, boolean bool, Cs2Executor class441, byte i_14_) {
		if (0 == i_12_)
			throw new RuntimeException();
		InterfaceDefinitions class73 = class83.aClass73Array1081[i];
		if (null == class73.aClass73Array916) {
			class73.aClass73Array916 = new InterfaceDefinitions[i_13_ + 1];
			class73.aClass73Array917 = class73.aClass73Array916;
		}
		if (class73.aClass73Array916.length <= i_13_) {
			if (class73.aClass73Array916 == class73.aClass73Array917) {
				InterfaceDefinitions[] class73s = new InterfaceDefinitions[i_13_ + 1];
				for (int i_15_ = 0; i_15_ < class73.aClass73Array916.length; i_15_++)
					class73s[i_15_] = class73.aClass73Array916[i_15_];
				class73.aClass73Array916 = class73.aClass73Array917 = class73s;
			} else {
				InterfaceDefinitions[] class73s = new InterfaceDefinitions[1 + i_13_];
				InterfaceDefinitions[] class73s_16_ = new InterfaceDefinitions[i_13_ + 1];
				for (int i_17_ = 0; i_17_ < class73.aClass73Array916.length; i_17_++) {
					class73s[i_17_] = class73.aClass73Array916[i_17_];
					class73s_16_[i_17_] = class73.aClass73Array917[i_17_];
				}
				class73.aClass73Array916 = class73s;
				class73.aClass73Array917 = class73s_16_;
			}
		}
		if (i_13_ > 0 && null == class73.aClass73Array916[i_13_ - 1])
			throw new RuntimeException(new StringBuilder().append("").append(i_13_ - 1).toString());
		InterfaceDefinitions class73_18_ = new InterfaceDefinitions();
		class73_18_.anInt752 = i_12_ * -26899943;
		class73_18_.anInt768 = (class73_18_.selfId = 1 * class73.selfId) * -1428012863;
		class73_18_.activeComponent = 470777927 * i_13_;
		class73.aClass73Array916[i_13_] = class73_18_;
		if (class73.aClass73Array916 != class73.aClass73Array917)
			class73.aClass73Array917[i_13_] = class73_18_;
		UnderlayDefinition underlayDefinition;
		if (bool)
			underlayDefinition = ((Cs2Executor) class441).aClass443_5112;
		else
			underlayDefinition = ((Cs2Executor) class441).aClass443_5126;
		((UnderlayDefinition) underlayDefinition).aClass83_5134 = class83;
		((UnderlayDefinition) underlayDefinition).aClass73_5135 = class73_18_;
		Class555.method6575(class73, (short) 16230);
	}
}

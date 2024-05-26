package game;

/* Class340_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class340_Sub2 extends Class340 {
	static final int anInt9871 = 8;
	static final int anInt9872 = 11;
	static final int anInt9873 = 1;
	static final int anInt9874 = 6;
	static final int anInt9875 = 3;
	static final int anInt9876 = 4;
	static final int anInt9877 = 5;
	static final int anInt9878 = 14;
	static final int anInt9879 = 7;
	static final int anInt9880 = 2;
	static final int anInt9881 = 9;
	static final int anInt9882 = 10;
	static final int anInt9883 = 19;
	static final int anInt9884 = 12;
	static final int anInt9885 = 13;
	static final int anInt9886 = 18;
	static final int anInt9887 = 15;
	static final int anInt9888 = 16;
	static final int anInt9889 = 0;
	static final int anInt9890 = 17;
	static final int anInt9891 = 1;
	static final int anInt9892 = 0;
	static final int anInt9893 = 7;
	static final int anInt9894 = 12;
	static final int anInt9895 = 17;
	static final int anInt9896 = 2;
	int[] anIntArray9897;
	Class250 aClass250_9898 = new Class250();
	Class405[] aClass405Array9899 = new Class405[19];
	Class406 aClass406_9900;
	int[][] anIntArrayArray9901 = new int[19][17];

	boolean method9356() throws Exception_Sub3 {
		((Class340_Sub2) this).aClass406_9900 = aClass106_Sub3_4327.method9619("Model");
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class340_Sub2) this).aClass406_9900.method4885("DiffuseSampler", -1002270852);
		Class572_Sub8_Sub1 class572_sub8_sub1_0_ = ((Class340_Sub2) this).aClass406_9900.method4885("EnvironmentSampler", -1532224437);
		Class572_Sub8_Sub1 class572_sub8_sub1_1_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsPosAndRadiusInv", -1446555677);
		Class572_Sub8_Sub1 class572_sub8_sub1_2_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsDiffuseColour", -1839800648);
		Class572_Sub8_Sub1 class572_sub8_sub1_3_ = ((Class340_Sub2) this).aClass406_9900.method4885("WVPMatrix", -1087694431);
		Class572_Sub8_Sub1 class572_sub8_sub1_4_ = ((Class340_Sub2) this).aClass406_9900.method4885("TexCoordMatrix", -1423191173);
		Class572_Sub8_Sub1 class572_sub8_sub1_5_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogPlane", -965382801);
		Class572_Sub8_Sub1 class572_sub8_sub1_6_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogColour", -2135718433);
		Class572_Sub8_Sub1 class572_sub8_sub1_7_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogPlane", -1155907640);
		Class572_Sub8_Sub1 class572_sub8_sub1_8_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogColour", -1876749763);
		Class572_Sub8_Sub1 class572_sub8_sub1_9_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunDir", -2146034392);
		Class572_Sub8_Sub1 class572_sub8_sub1_10_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunColour", -1353984722);
		Class572_Sub8_Sub1 class572_sub8_sub1_11_ = ((Class340_Sub2) this).aClass406_9900.method4885("AntiSunColour", -821446132);
		Class572_Sub8_Sub1 class572_sub8_sub1_12_ = ((Class340_Sub2) this).aClass406_9900.method4885("AmbientColour", -950937545);
		Class572_Sub8_Sub1 class572_sub8_sub1_13_ = ((Class340_Sub2) this).aClass406_9900.method4885("EyePos", -2032345034);
		Class572_Sub8_Sub1 class572_sub8_sub1_14_ = ((Class340_Sub2) this).aClass406_9900.method4885("SpecularExponent", -2136752382);
		Class572_Sub8_Sub1 class572_sub8_sub1_15_ = ((Class340_Sub2) this).aClass406_9900.method4885("WorldMatrix", -1345565695);
		((Class340_Sub2) this).aClass405Array9899[0] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit", -620943847);
		((Class340_Sub2) this).aClass405Array9899[1] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit_IgnoreAlpha", 930157504);
		((Class340_Sub2) this).aClass405Array9899[17] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGround", -1246037637);
		((Class340_Sub2) this).aClass405Array9899[18] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGroundSpecular", -1908265223);
		for (int i = 0; i <= 4; i++) {
			((Class340_Sub2) this).aClass405Array9899[2 + i] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Standard_").append(i).append("PointLights").toString(), -1446568558));
			((Class340_Sub2) this).aClass405Array9899[i + 7] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Specular_").append(i).append("PointLights").toString(), -1518333298));
			((Class340_Sub2) this).aClass405Array9899[i + 12] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("EnvironmentalMapping_").append(i).append("PointLights").toString(), -278637939));
		}
		for (int i = 0; i < 19; i++) {
			int i_16_ = (((Class340_Sub2) this).aClass406_9900.method4866(((Class340_Sub2) this).aClass405Array9899[i], (byte) -49));
			((Class340_Sub2) this).anIntArrayArray9901[i][2] = class572_sub8_sub1.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][3] = class572_sub8_sub1_0_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][1] = class572_sub8_sub1_1_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][0] = class572_sub8_sub1_2_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][4] = class572_sub8_sub1_3_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][5] = class572_sub8_sub1_4_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][7] = class572_sub8_sub1_5_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][8] = class572_sub8_sub1_6_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][9] = class572_sub8_sub1_7_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][10] = class572_sub8_sub1_8_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][11] = class572_sub8_sub1_9_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][12] = class572_sub8_sub1_10_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][13] = class572_sub8_sub1_11_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][14] = class572_sub8_sub1_12_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][6] = class572_sub8_sub1_13_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][15] = class572_sub8_sub1_15_.method10278(i_16_);
			((Class340_Sub2) this).anIntArrayArray9901[i][16] = class572_sub8_sub1_14_.method10278(i_16_);
		}
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[2]);
		return true;
	}

	boolean method9357(int i) throws Exception_Sub3 {
		((Class340_Sub2) this).aClass406_9900 = aClass106_Sub3_4327.method9619("Model");
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class340_Sub2) this).aClass406_9900.method4885("DiffuseSampler", -1711822199);
		Class572_Sub8_Sub1 class572_sub8_sub1_17_ = ((Class340_Sub2) this).aClass406_9900.method4885("EnvironmentSampler", -849827552);
		Class572_Sub8_Sub1 class572_sub8_sub1_18_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsPosAndRadiusInv", -1622128359);
		Class572_Sub8_Sub1 class572_sub8_sub1_19_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsDiffuseColour", -1177292195);
		Class572_Sub8_Sub1 class572_sub8_sub1_20_ = ((Class340_Sub2) this).aClass406_9900.method4885("WVPMatrix", -1126080265);
		Class572_Sub8_Sub1 class572_sub8_sub1_21_ = ((Class340_Sub2) this).aClass406_9900.method4885("TexCoordMatrix", -1592250641);
		Class572_Sub8_Sub1 class572_sub8_sub1_22_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogPlane", -919690462);
		Class572_Sub8_Sub1 class572_sub8_sub1_23_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogColour", -1083948778);
		Class572_Sub8_Sub1 class572_sub8_sub1_24_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogPlane", -1809655450);
		Class572_Sub8_Sub1 class572_sub8_sub1_25_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogColour", -2095313830);
		Class572_Sub8_Sub1 class572_sub8_sub1_26_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunDir", -1049718569);
		Class572_Sub8_Sub1 class572_sub8_sub1_27_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunColour", -1485484639);
		Class572_Sub8_Sub1 class572_sub8_sub1_28_ = ((Class340_Sub2) this).aClass406_9900.method4885("AntiSunColour", -812824729);
		Class572_Sub8_Sub1 class572_sub8_sub1_29_ = ((Class340_Sub2) this).aClass406_9900.method4885("AmbientColour", -987203927);
		Class572_Sub8_Sub1 class572_sub8_sub1_30_ = ((Class340_Sub2) this).aClass406_9900.method4885("EyePos", -2138192214);
		Class572_Sub8_Sub1 class572_sub8_sub1_31_ = ((Class340_Sub2) this).aClass406_9900.method4885("SpecularExponent", -1966441215);
		Class572_Sub8_Sub1 class572_sub8_sub1_32_ = ((Class340_Sub2) this).aClass406_9900.method4885("WorldMatrix", -2071387346);
		((Class340_Sub2) this).aClass405Array9899[0] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit", -292912979);
		((Class340_Sub2) this).aClass405Array9899[1] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit_IgnoreAlpha", 218618746);
		((Class340_Sub2) this).aClass405Array9899[17] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGround", -400174865);
		((Class340_Sub2) this).aClass405Array9899[18] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGroundSpecular", 112341941);
		for (int i_33_ = 0; i_33_ <= 4; i_33_++) {
			((Class340_Sub2) this).aClass405Array9899[2 + i_33_] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Standard_").append(i_33_).append("PointLights").toString(), -567496193));
			((Class340_Sub2) this).aClass405Array9899[i_33_ + 7] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Specular_").append(i_33_).append("PointLights").toString(), -715309258));
			((Class340_Sub2) this).aClass405Array9899[i_33_ + 12] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("EnvironmentalMapping_").append(i_33_).append("PointLights").toString(), -1977744254));
		}
		for (int i_34_ = 0; i_34_ < 19; i_34_++) {
			int i_35_ = (((Class340_Sub2) this).aClass406_9900.method4866(((Class340_Sub2) this).aClass405Array9899[i_34_], (byte) -94));
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][2] = class572_sub8_sub1.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][3] = class572_sub8_sub1_17_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][1] = class572_sub8_sub1_18_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][0] = class572_sub8_sub1_19_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][4] = class572_sub8_sub1_20_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][5] = class572_sub8_sub1_21_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][7] = class572_sub8_sub1_22_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][8] = class572_sub8_sub1_23_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][9] = class572_sub8_sub1_24_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][10] = class572_sub8_sub1_25_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][11] = class572_sub8_sub1_26_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][12] = class572_sub8_sub1_27_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][13] = class572_sub8_sub1_28_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][14] = class572_sub8_sub1_29_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][6] = class572_sub8_sub1_30_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][15] = class572_sub8_sub1_32_.method10278(i_35_);
			((Class340_Sub2) this).anIntArrayArray9901[i_34_][16] = class572_sub8_sub1_31_.method10278(i_35_);
		}
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[2]);
		return true;
	}

	public void method4271(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[i + 2]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-608481876)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		method9358(i, (byte) 65);
	}

	public void method4263(boolean bool) {
		if (bool)
			((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[1]);
		else
			((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[0]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(160413736)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[2]), 0, anInterface43_4342, (short) -27437);
		((Class340_Sub2) this).aClass406_9900.method4884(((Class340_Sub2) this).anIntArray9897[4], ((Class340_Sub2) this).aClass250_9898, 1460303109);
		((Class340_Sub2) this).aClass406_9900.method4910((((Class340_Sub2) this).anIntArray9897[5]), aClass250_4332, (byte) 118);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[7], aClass209_4336.aFloat2436, aClass209_4336.aFloat2434, aClass209_4336.aFloat2433, aClass209_4336.aFloat2435, -2082972183);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[8], aClass240_4337.aFloat2653, aClass240_4337.aFloat2656, aClass240_4337.aFloat2657, -577517582);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[9], aClass209_4338.aFloat2436, aClass209_4338.aFloat2434, aClass209_4338.aFloat2433, aClass209_4338.aFloat2435, -2105299014);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[10], aClass240_4339.aFloat2653, aClass240_4339.aFloat2656, aClass240_4339.aFloat2657, 946775849);
		aClass106_Sub3_4327.method9652(Class379.aClass379_4588, anInt4330, anInt4346, anInt4347, anInt4348);
	}

	public void method4260() {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[17]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-821221816)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		method9358(0, (byte) 92);
	}

	public void method4262() {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[17]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1046084850)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		method9358(0, (byte) 111);
	}

	void method9358(int i, byte i_36_) {
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[2]), 0, anInterface43_4342, (short) -1258);
		((Class340_Sub2) this).aClass406_9900.method4884(((Class340_Sub2) this).anIntArray9897[4], ((Class340_Sub2) this).aClass250_9898, 1259412045);
		((Class340_Sub2) this).aClass406_9900.method4910((((Class340_Sub2) this).anIntArray9897[5]), aClass250_4332, (byte) 102);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[7], aClass209_4336.aFloat2436, aClass209_4336.aFloat2434, aClass209_4336.aFloat2433, aClass209_4336.aFloat2435, -2144843600);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[8], aClass240_4337.aFloat2653, aClass240_4337.aFloat2656, aClass240_4337.aFloat2657, -6114795);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[9], aClass209_4338.aFloat2436, aClass209_4338.aFloat2434, aClass209_4338.aFloat2433, aClass209_4338.aFloat2435, -2102476327);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[10], aClass240_4339.aFloat2653, aClass240_4339.aFloat2656, aClass240_4339.aFloat2657, 1590672373);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[11]), aClass240_4340, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[12]), aClass240_4341, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[13]), aClass240_4334, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[14]), aClass240_4326, (byte) 12);
		if (i > 0) {
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[1], aFloatArray4329, i * 4, -957454574);
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[0], aFloatArray4328, 4 * i, -538096087);
		}
		aClass106_Sub3_4327.method9652(Class379.aClass379_4588, anInt4330, anInt4346, anInt4347, anInt4348);
	}

	public void method4264(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[i + 2]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-874161243)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		method9358(i, (byte) 51);
	}

	public void method4265(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[7 + i]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1206063803)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, -905656388);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[16], aFloat4345, aFloat4335, 0.0F, 0.0F, -2103116064);
		method9358(i, (byte) 98);
	}

	public void method4272(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[12 + i]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-500024938)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4905((((Class340_Sub2) this).anIntArray9897[15]), aClass250_4333, (byte) 77);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, 1296908190);
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[3]), 1, anInterface33_4331, (short) -10959);
		method9358(i, (byte) 73);
	}

	public void method4279(Class250 class250) {
		((Class340_Sub2) this).aClass250_9898.method3442(class250);
		((Class340_Sub2) this).aClass250_9898.method3445(aClass106_Sub3_4327.aClass250_10414);
	}

	public void method4268(Class250 class250) {
		((Class340_Sub2) this).aClass250_9898.method3442(class250);
		((Class340_Sub2) this).aClass250_9898.method3445(aClass106_Sub3_4327.aClass250_10414);
	}

	public void method4270(boolean bool) {
		if (bool)
			((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[1]);
		else
			((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[0]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1704421686)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[2]), 0, anInterface43_4342, (short) -27493);
		((Class340_Sub2) this).aClass406_9900.method4884(((Class340_Sub2) this).anIntArray9897[4], ((Class340_Sub2) this).aClass250_9898, 1472257563);
		((Class340_Sub2) this).aClass406_9900.method4910((((Class340_Sub2) this).anIntArray9897[5]), aClass250_4332, (byte) 80);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[7], aClass209_4336.aFloat2436, aClass209_4336.aFloat2434, aClass209_4336.aFloat2433, aClass209_4336.aFloat2435, -2135318179);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[8], aClass240_4337.aFloat2653, aClass240_4337.aFloat2656, aClass240_4337.aFloat2657, -2113706532);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[9], aClass209_4338.aFloat2436, aClass209_4338.aFloat2434, aClass209_4338.aFloat2433, aClass209_4338.aFloat2435, -2088382379);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[10], aClass240_4339.aFloat2653, aClass240_4339.aFloat2656, aClass240_4339.aFloat2657, 1797180303);
		aClass106_Sub3_4327.method9652(Class379.aClass379_4588, anInt4330, anInt4346, anInt4347, anInt4348);
	}

	public void method4285(boolean bool) {
		if (bool)
			((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[1]);
		else
			((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[0]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1962226016)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[2]), 0, anInterface43_4342, (short) -2555);
		((Class340_Sub2) this).aClass406_9900.method4884(((Class340_Sub2) this).anIntArray9897[4], ((Class340_Sub2) this).aClass250_9898, 1324098826);
		((Class340_Sub2) this).aClass406_9900.method4910((((Class340_Sub2) this).anIntArray9897[5]), aClass250_4332, (byte) 96);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[7], aClass209_4336.aFloat2436, aClass209_4336.aFloat2434, aClass209_4336.aFloat2433, aClass209_4336.aFloat2435, -2118401255);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[8], aClass240_4337.aFloat2653, aClass240_4337.aFloat2656, aClass240_4337.aFloat2657, 754360169);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[9], aClass209_4338.aFloat2436, aClass209_4338.aFloat2434, aClass209_4338.aFloat2433, aClass209_4338.aFloat2435, -2132976352);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[10], aClass240_4339.aFloat2653, aClass240_4339.aFloat2656, aClass240_4339.aFloat2657, 527941153);
		aClass106_Sub3_4327.method9652(Class379.aClass379_4588, anInt4330, anInt4346, anInt4347, anInt4348);
	}

	boolean method9359() throws Exception_Sub3 {
		((Class340_Sub2) this).aClass406_9900 = aClass106_Sub3_4327.method9619("Model");
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class340_Sub2) this).aClass406_9900.method4885("DiffuseSampler", -1482129286);
		Class572_Sub8_Sub1 class572_sub8_sub1_37_ = ((Class340_Sub2) this).aClass406_9900.method4885("EnvironmentSampler", -2007687942);
		Class572_Sub8_Sub1 class572_sub8_sub1_38_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsPosAndRadiusInv", -1173628551);
		Class572_Sub8_Sub1 class572_sub8_sub1_39_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsDiffuseColour", -991777122);
		Class572_Sub8_Sub1 class572_sub8_sub1_40_ = ((Class340_Sub2) this).aClass406_9900.method4885("WVPMatrix", -1845491636);
		Class572_Sub8_Sub1 class572_sub8_sub1_41_ = ((Class340_Sub2) this).aClass406_9900.method4885("TexCoordMatrix", -1203829865);
		Class572_Sub8_Sub1 class572_sub8_sub1_42_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogPlane", -803587096);
		Class572_Sub8_Sub1 class572_sub8_sub1_43_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogColour", -1108375846);
		Class572_Sub8_Sub1 class572_sub8_sub1_44_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogPlane", -1330067982);
		Class572_Sub8_Sub1 class572_sub8_sub1_45_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogColour", -1992405801);
		Class572_Sub8_Sub1 class572_sub8_sub1_46_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunDir", -1893709806);
		Class572_Sub8_Sub1 class572_sub8_sub1_47_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunColour", -1757679024);
		Class572_Sub8_Sub1 class572_sub8_sub1_48_ = ((Class340_Sub2) this).aClass406_9900.method4885("AntiSunColour", -1773154701);
		Class572_Sub8_Sub1 class572_sub8_sub1_49_ = ((Class340_Sub2) this).aClass406_9900.method4885("AmbientColour", -1811851729);
		Class572_Sub8_Sub1 class572_sub8_sub1_50_ = ((Class340_Sub2) this).aClass406_9900.method4885("EyePos", -751959860);
		Class572_Sub8_Sub1 class572_sub8_sub1_51_ = ((Class340_Sub2) this).aClass406_9900.method4885("SpecularExponent", -999740694);
		Class572_Sub8_Sub1 class572_sub8_sub1_52_ = ((Class340_Sub2) this).aClass406_9900.method4885("WorldMatrix", -1951993064);
		((Class340_Sub2) this).aClass405Array9899[0] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit", 687821765);
		((Class340_Sub2) this).aClass405Array9899[1] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit_IgnoreAlpha", -634873528);
		((Class340_Sub2) this).aClass405Array9899[17] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGround", 417870613);
		((Class340_Sub2) this).aClass405Array9899[18] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGroundSpecular", -849054553);
		for (int i = 0; i <= 4; i++) {
			((Class340_Sub2) this).aClass405Array9899[2 + i] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Standard_").append(i).append("PointLights").toString(), 148721164));
			((Class340_Sub2) this).aClass405Array9899[i + 7] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Specular_").append(i).append("PointLights").toString(), -1912774313));
			((Class340_Sub2) this).aClass405Array9899[i + 12] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("EnvironmentalMapping_").append(i).append("PointLights").toString(), -1574395391));
		}
		for (int i = 0; i < 19; i++) {
			int i_53_ = (((Class340_Sub2) this).aClass406_9900.method4866(((Class340_Sub2) this).aClass405Array9899[i], (byte) -13));
			((Class340_Sub2) this).anIntArrayArray9901[i][2] = class572_sub8_sub1.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][3] = class572_sub8_sub1_37_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][1] = class572_sub8_sub1_38_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][0] = class572_sub8_sub1_39_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][4] = class572_sub8_sub1_40_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][5] = class572_sub8_sub1_41_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][7] = class572_sub8_sub1_42_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][8] = class572_sub8_sub1_43_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][9] = class572_sub8_sub1_44_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][10] = class572_sub8_sub1_45_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][11] = class572_sub8_sub1_46_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][12] = class572_sub8_sub1_47_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][13] = class572_sub8_sub1_48_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][14] = class572_sub8_sub1_49_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][6] = class572_sub8_sub1_50_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][15] = class572_sub8_sub1_52_.method10278(i_53_);
			((Class340_Sub2) this).anIntArrayArray9901[i][16] = class572_sub8_sub1_51_.method10278(i_53_);
		}
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[2]);
		return true;
	}

	public void method4273(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[i + 2]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-1254075209)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		method9358(i, (byte) 110);
	}

	public void method4274(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[i + 2]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1105288015)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		method9358(i, (byte) 82);
	}

	public void method4275(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[i + 2]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1579258342)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		method9358(i, (byte) 123);
	}

	public void method4277(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[7 + i]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1553484101)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, 1826985762);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[16], aFloat4345, aFloat4335, 0.0F, 0.0F, -2100529059);
		method9358(i, (byte) 125);
	}

	public void method4267(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[7 + i]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-170384977)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, 727107869);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[16], aFloat4345, aFloat4335, 0.0F, 0.0F, -2099525683);
		method9358(i, (byte) 119);
	}

	public void method4278(int i) {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[12 + i]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1665827694)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4905((((Class340_Sub2) this).anIntArray9897[15]), aClass250_4333, (byte) 108);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, 1742672670);
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[3]), 1, anInterface33_4331, (short) -8460);
		method9358(i, (byte) 112);
	}

	public void method4266() {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[18]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-276787994)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, 1802850462);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[16], aFloat4345, aFloat4335, 0.0F, 0.0F, -2097009821);
		method9358(0, (byte) 127);
	}

	boolean method9360() throws Exception_Sub3 {
		((Class340_Sub2) this).aClass406_9900 = aClass106_Sub3_4327.method9619("Model");
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class340_Sub2) this).aClass406_9900.method4885("DiffuseSampler", -1092097308);
		Class572_Sub8_Sub1 class572_sub8_sub1_54_ = ((Class340_Sub2) this).aClass406_9900.method4885("EnvironmentSampler", -2091016091);
		Class572_Sub8_Sub1 class572_sub8_sub1_55_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsPosAndRadiusInv", -1399992863);
		Class572_Sub8_Sub1 class572_sub8_sub1_56_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsDiffuseColour", -1525074580);
		Class572_Sub8_Sub1 class572_sub8_sub1_57_ = ((Class340_Sub2) this).aClass406_9900.method4885("WVPMatrix", -1743013279);
		Class572_Sub8_Sub1 class572_sub8_sub1_58_ = ((Class340_Sub2) this).aClass406_9900.method4885("TexCoordMatrix", -924969157);
		Class572_Sub8_Sub1 class572_sub8_sub1_59_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogPlane", -2001581264);
		Class572_Sub8_Sub1 class572_sub8_sub1_60_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogColour", -1344550592);
		Class572_Sub8_Sub1 class572_sub8_sub1_61_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogPlane", -1393456835);
		Class572_Sub8_Sub1 class572_sub8_sub1_62_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogColour", -790619135);
		Class572_Sub8_Sub1 class572_sub8_sub1_63_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunDir", -1635226637);
		Class572_Sub8_Sub1 class572_sub8_sub1_64_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunColour", -1063796226);
		Class572_Sub8_Sub1 class572_sub8_sub1_65_ = ((Class340_Sub2) this).aClass406_9900.method4885("AntiSunColour", -1861012072);
		Class572_Sub8_Sub1 class572_sub8_sub1_66_ = ((Class340_Sub2) this).aClass406_9900.method4885("AmbientColour", -1070318708);
		Class572_Sub8_Sub1 class572_sub8_sub1_67_ = ((Class340_Sub2) this).aClass406_9900.method4885("EyePos", -1111410758);
		Class572_Sub8_Sub1 class572_sub8_sub1_68_ = ((Class340_Sub2) this).aClass406_9900.method4885("SpecularExponent", -1835560671);
		Class572_Sub8_Sub1 class572_sub8_sub1_69_ = ((Class340_Sub2) this).aClass406_9900.method4885("WorldMatrix", -1838455277);
		((Class340_Sub2) this).aClass405Array9899[0] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit", 13356700);
		((Class340_Sub2) this).aClass405Array9899[1] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit_IgnoreAlpha", -2024394854);
		((Class340_Sub2) this).aClass405Array9899[17] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGround", -1830996001);
		((Class340_Sub2) this).aClass405Array9899[18] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGroundSpecular", -1186806305);
		for (int i = 0; i <= 4; i++) {
			((Class340_Sub2) this).aClass405Array9899[2 + i] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Standard_").append(i).append("PointLights").toString(), 417778021));
			((Class340_Sub2) this).aClass405Array9899[i + 7] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Specular_").append(i).append("PointLights").toString(), 337846583));
			((Class340_Sub2) this).aClass405Array9899[i + 12] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("EnvironmentalMapping_").append(i).append("PointLights").toString(), 584155900));
		}
		for (int i = 0; i < 19; i++) {
			int i_70_ = (((Class340_Sub2) this).aClass406_9900.method4866(((Class340_Sub2) this).aClass405Array9899[i], (byte) -88));
			((Class340_Sub2) this).anIntArrayArray9901[i][2] = class572_sub8_sub1.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][3] = class572_sub8_sub1_54_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][1] = class572_sub8_sub1_55_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][0] = class572_sub8_sub1_56_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][4] = class572_sub8_sub1_57_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][5] = class572_sub8_sub1_58_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][7] = class572_sub8_sub1_59_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][8] = class572_sub8_sub1_60_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][9] = class572_sub8_sub1_61_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][10] = class572_sub8_sub1_62_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][11] = class572_sub8_sub1_63_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][12] = class572_sub8_sub1_64_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][13] = class572_sub8_sub1_65_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][14] = class572_sub8_sub1_66_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][6] = class572_sub8_sub1_67_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][15] = class572_sub8_sub1_69_.method10278(i_70_);
			((Class340_Sub2) this).anIntArrayArray9901[i][16] = class572_sub8_sub1_68_.method10278(i_70_);
		}
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[2]);
		return true;
	}

	public void method4281() {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[18]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(1650904218)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, 1348319583);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[16], aFloat4345, aFloat4335, 0.0F, 0.0F, -2103210594);
		method9358(0, (byte) 61);
	}

	public void method4280() {
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[18]);
		((Class340_Sub2) this).anIntArray9897 = (((Class340_Sub2) this).anIntArrayArray9901[((Class340_Sub2) this).aClass406_9900.method4880(-203804775)]);
		((Class340_Sub2) this).aClass406_9900.method4858();
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[6], aClass240_4344.aFloat2653, aClass240_4344.aFloat2656, aClass240_4344.aFloat2657, -1734469684);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[16], aFloat4345, aFloat4335, 0.0F, 0.0F, -2115058529);
		method9358(0, (byte) 63);
	}

	void method9361(int i) {
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[2]), 0, anInterface43_4342, (short) -24163);
		((Class340_Sub2) this).aClass406_9900.method4884(((Class340_Sub2) this).anIntArray9897[4], ((Class340_Sub2) this).aClass250_9898, 1480426097);
		((Class340_Sub2) this).aClass406_9900.method4910((((Class340_Sub2) this).anIntArray9897[5]), aClass250_4332, (byte) 74);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[7], aClass209_4336.aFloat2436, aClass209_4336.aFloat2434, aClass209_4336.aFloat2433, aClass209_4336.aFloat2435, -2114192553);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[8], aClass240_4337.aFloat2653, aClass240_4337.aFloat2656, aClass240_4337.aFloat2657, -2066433965);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[9], aClass209_4338.aFloat2436, aClass209_4338.aFloat2434, aClass209_4338.aFloat2433, aClass209_4338.aFloat2435, -2132037882);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[10], aClass240_4339.aFloat2653, aClass240_4339.aFloat2656, aClass240_4339.aFloat2657, -89061731);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[11]), aClass240_4340, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[12]), aClass240_4341, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[13]), aClass240_4334, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[14]), aClass240_4326, (byte) 12);
		if (i > 0) {
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[1], aFloatArray4329, i * 4, 660266228);
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[0], aFloatArray4328, 4 * i, 803322625);
		}
		aClass106_Sub3_4327.method9652(Class379.aClass379_4588, anInt4330, anInt4346, anInt4347, anInt4348);
	}

	boolean method9362() throws Exception_Sub3 {
		((Class340_Sub2) this).aClass406_9900 = aClass106_Sub3_4327.method9619("Model");
		Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class340_Sub2) this).aClass406_9900.method4885("DiffuseSampler", -844152385);
		Class572_Sub8_Sub1 class572_sub8_sub1_71_ = ((Class340_Sub2) this).aClass406_9900.method4885("EnvironmentSampler", -1185177937);
		Class572_Sub8_Sub1 class572_sub8_sub1_72_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsPosAndRadiusInv", -1403815451);
		Class572_Sub8_Sub1 class572_sub8_sub1_73_ = ((Class340_Sub2) this).aClass406_9900.method4885("PointLightsDiffuseColour", -1737137693);
		Class572_Sub8_Sub1 class572_sub8_sub1_74_ = ((Class340_Sub2) this).aClass406_9900.method4885("WVPMatrix", -1694295399);
		Class572_Sub8_Sub1 class572_sub8_sub1_75_ = ((Class340_Sub2) this).aClass406_9900.method4885("TexCoordMatrix", -1701125810);
		Class572_Sub8_Sub1 class572_sub8_sub1_76_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogPlane", -2141381739);
		Class572_Sub8_Sub1 class572_sub8_sub1_77_ = ((Class340_Sub2) this).aClass406_9900.method4885("HeightFogColour", -1024425233);
		Class572_Sub8_Sub1 class572_sub8_sub1_78_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogPlane", -808635495);
		Class572_Sub8_Sub1 class572_sub8_sub1_79_ = ((Class340_Sub2) this).aClass406_9900.method4885("DistanceFogColour", -1374514194);
		Class572_Sub8_Sub1 class572_sub8_sub1_80_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunDir", -1223097475);
		Class572_Sub8_Sub1 class572_sub8_sub1_81_ = ((Class340_Sub2) this).aClass406_9900.method4885("SunColour", -1114800296);
		Class572_Sub8_Sub1 class572_sub8_sub1_82_ = ((Class340_Sub2) this).aClass406_9900.method4885("AntiSunColour", -1272868026);
		Class572_Sub8_Sub1 class572_sub8_sub1_83_ = ((Class340_Sub2) this).aClass406_9900.method4885("AmbientColour", -914631299);
		Class572_Sub8_Sub1 class572_sub8_sub1_84_ = ((Class340_Sub2) this).aClass406_9900.method4885("EyePos", -1065094706);
		Class572_Sub8_Sub1 class572_sub8_sub1_85_ = ((Class340_Sub2) this).aClass406_9900.method4885("SpecularExponent", -1160215294);
		Class572_Sub8_Sub1 class572_sub8_sub1_86_ = ((Class340_Sub2) this).aClass406_9900.method4885("WorldMatrix", -1060658451);
		((Class340_Sub2) this).aClass405Array9899[0] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit", 436376491);
		((Class340_Sub2) this).aClass405Array9899[1] = ((Class340_Sub2) this).aClass406_9900.method4863("Unlit_IgnoreAlpha", -533321273);
		((Class340_Sub2) this).aClass405Array9899[17] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGround", -1600511016);
		((Class340_Sub2) this).aClass405Array9899[18] = ((Class340_Sub2) this).aClass406_9900.method4863("UnderwaterGroundSpecular", -1390472267);
		for (int i = 0; i <= 4; i++) {
			((Class340_Sub2) this).aClass405Array9899[2 + i] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Standard_").append(i).append("PointLights").toString(), 837032789));
			((Class340_Sub2) this).aClass405Array9899[i + 7] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("Specular_").append(i).append("PointLights").toString(), -1923344347));
			((Class340_Sub2) this).aClass405Array9899[i + 12] = (((Class340_Sub2) this).aClass406_9900.method4863(new StringBuilder().append("EnvironmentalMapping_").append(i).append("PointLights").toString(), -1870428315));
		}
		for (int i = 0; i < 19; i++) {
			int i_87_ = (((Class340_Sub2) this).aClass406_9900.method4866(((Class340_Sub2) this).aClass405Array9899[i], (byte) -103));
			((Class340_Sub2) this).anIntArrayArray9901[i][2] = class572_sub8_sub1.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][3] = class572_sub8_sub1_71_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][1] = class572_sub8_sub1_72_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][0] = class572_sub8_sub1_73_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][4] = class572_sub8_sub1_74_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][5] = class572_sub8_sub1_75_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][7] = class572_sub8_sub1_76_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][8] = class572_sub8_sub1_77_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][9] = class572_sub8_sub1_78_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][10] = class572_sub8_sub1_79_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][11] = class572_sub8_sub1_80_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][12] = class572_sub8_sub1_81_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][13] = class572_sub8_sub1_82_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][14] = class572_sub8_sub1_83_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][6] = class572_sub8_sub1_84_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][15] = class572_sub8_sub1_86_.method10278(i_87_);
			((Class340_Sub2) this).anIntArrayArray9901[i][16] = class572_sub8_sub1_85_.method10278(i_87_);
		}
		((Class340_Sub2) this).aClass406_9900.method4868(((Class340_Sub2) this).aClass405Array9899[2]);
		return true;
	}

	void method9363(int i) {
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[2]), 0, anInterface43_4342, (short) -9459);
		((Class340_Sub2) this).aClass406_9900.method4884(((Class340_Sub2) this).anIntArray9897[4], ((Class340_Sub2) this).aClass250_9898, 1343500448);
		((Class340_Sub2) this).aClass406_9900.method4910((((Class340_Sub2) this).anIntArray9897[5]), aClass250_4332, (byte) 70);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[7], aClass209_4336.aFloat2436, aClass209_4336.aFloat2434, aClass209_4336.aFloat2433, aClass209_4336.aFloat2435, -2146730434);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[8], aClass240_4337.aFloat2653, aClass240_4337.aFloat2656, aClass240_4337.aFloat2657, -1751325484);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[9], aClass209_4338.aFloat2436, aClass209_4338.aFloat2434, aClass209_4338.aFloat2433, aClass209_4338.aFloat2435, -2135623294);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[10], aClass240_4339.aFloat2653, aClass240_4339.aFloat2656, aClass240_4339.aFloat2657, -1024591817);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[11]), aClass240_4340, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[12]), aClass240_4341, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[13]), aClass240_4334, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[14]), aClass240_4326, (byte) 12);
		if (i > 0) {
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[1], aFloatArray4329, i * 4, -1919598002);
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[0], aFloatArray4328, 4 * i, -2105850074);
		}
		aClass106_Sub3_4327.method9652(Class379.aClass379_4588, anInt4330, anInt4346, anInt4347, anInt4348);
	}

	void method9364(int i) {
		((Class340_Sub2) this).aClass406_9900.method4864((((Class340_Sub2) this).anIntArray9897[2]), 0, anInterface43_4342, (short) -18672);
		((Class340_Sub2) this).aClass406_9900.method4884(((Class340_Sub2) this).anIntArray9897[4], ((Class340_Sub2) this).aClass250_9898, 2049912705);
		((Class340_Sub2) this).aClass406_9900.method4910((((Class340_Sub2) this).anIntArray9897[5]), aClass250_4332, (byte) 98);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[7], aClass209_4336.aFloat2436, aClass209_4336.aFloat2434, aClass209_4336.aFloat2433, aClass209_4336.aFloat2435, -2101892534);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[8], aClass240_4337.aFloat2653, aClass240_4337.aFloat2656, aClass240_4337.aFloat2657, -1953642998);
		((Class340_Sub2) this).aClass406_9900.method4881(((Class340_Sub2) this).anIntArray9897[9], aClass209_4338.aFloat2436, aClass209_4338.aFloat2434, aClass209_4338.aFloat2433, aClass209_4338.aFloat2435, -2097429061);
		((Class340_Sub2) this).aClass406_9900.method4872(((Class340_Sub2) this).anIntArray9897[10], aClass240_4339.aFloat2653, aClass240_4339.aFloat2656, aClass240_4339.aFloat2657, -14056099);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[11]), aClass240_4340, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[12]), aClass240_4341, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[13]), aClass240_4334, (byte) 12);
		((Class340_Sub2) this).aClass406_9900.method4882((((Class340_Sub2) this).anIntArray9897[14]), aClass240_4326, (byte) 12);
		if (i > 0) {
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[1], aFloatArray4329, i * 4, -1701095618);
			((Class340_Sub2) this).aClass406_9900.method4883(((Class340_Sub2) this).anIntArray9897[0], aFloatArray4328, 4 * i, -1056628767);
		}
		aClass106_Sub3_4327.method9652(Class379.aClass379_4588, anInt4330, anInt4346, anInt4347, anInt4348);
	}

	public Class340_Sub2(Class106_Sub3 class106_sub3) throws Exception_Sub3 {
		super(class106_sub3);
		method9357(-513278142);
	}

	public void method4269(Class250 class250) {
		((Class340_Sub2) this).aClass250_9898.method3442(class250);
		((Class340_Sub2) this).aClass250_9898.method3445(aClass106_Sub3_4327.aClass250_10414);
	}

	public static int method9365(int i, boolean bool, int i_88_) {
		if (bool)
			return 0;
		ItemsContainer class572_sub31 = Class447.getContainer(i, bool, 26845088);
		if (null == class572_sub31)
			return ((((Class572_Sub12_Sub1) Class639_Sub10.aClass639_Sub4_9534.getDefinition(i, 1528214347)).anInt11247) * -2096325171);
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < ((ItemsContainer) class572_sub31).itemIds.length; i_90_++) {
			if (-1 == ((ItemsContainer) class572_sub31).itemIds[i_90_])
				i_89_++;
		}
		i_89_ += ((((Class572_Sub12_Sub1) Class639_Sub10.aClass639_Sub4_9534.getDefinition(i, 1659637234)).anInt11247) * -2096325171 - ((ItemsContainer) class572_sub31).itemIds.length);
		return i_89_;
	}
}

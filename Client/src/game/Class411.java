package game;

/* Class411 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class411 {
	boolean aBool4862;
	Class409 aClass409_4863;
	Class414 aClass414_4864;
	static final int anInt4865 = 10000;
	Class240 aClass240_4866;
	Class658 aClass658_4867;
	Class423 aClass423_4868;
	Interface47 anInterface47_4869;
	Class427 aClass427_4870;
	int anInt4871;
	Class240 aClass240_4872;
	Class240 aClass240_4873 = new Class240();
	float aFloat4874;
	public static final float aFloat4875 = Float.POSITIVE_INFINITY;
	Class240 aClass240_4876;
	Class240 aClass240_4877;
	float aFloat4878 = 5120.0F;
	float aFloat4879 = 10.0F;
	Class416 aClass416_4880;
	float aFloat4881;
	float aFloat4882;
	Class407 aClass407_4883;
	float aFloat4884;
	Class240 aClass240_4885;
	float aFloat4886;
	float aFloat4887;
	float aFloat4888;
	Class413 aClass413_4889;
	static final int anInt4890 = 50;
	float aFloat4891;
	float aFloat4892 = 1.0F;
	float aFloat4893;
	float aFloat4894;
	boolean aBool4895;
	int anInt4896;
	float aFloat4897;
	Class676 aClass676_4898;

	public boolean method4967(byte i) {
		return ((Class411) this).aBool4895;
	}

	public Class240 method4968(int i) {
		if (((Class411) this).aClass423_4868 == null || !((Class411) this).aClass423_4868.method5145(-2059209860))
			return null;
		return ((Class411) this).aClass423_4868.method5159((byte) -49);
	}

	public void method4969(Class240 class240) throws Exception_Sub4 {
		if (!method4973(1058036020) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4872.method3269(class240);
	}

	public void method4970(boolean bool, float f, Class240 class240, Class230 class230, Class240 class240_0_, Class240 class240_1_, int i) {
		if (Class427.aClass427_5007 == ((Class411) this).aClass427_4870)
			Class65.method1033(f, class240, class240_0_, class240_1_, (bool ? ((Class411) this).aClass240_4877 : ((Class411) this).aClass240_4876), (bool ? ((Class411) this).aClass240_4872 : ((Class411) this).aClass240_4873), (float) (-1800975777 * ((Class411) this).anInt4896), ((Class411) this).aFloat4897, ((Class411) this).aFloat4881, ((Class411) this).aFloat4882, -1009008191);
		else if (Class427.aClass427_5005 == ((Class411) this).aClass427_4870)
			Class280_Sub1.method8817(f, class240, class230, class240_0_, class240_1_, (bool ? ((Class411) this).aClass240_4877 : ((Class411) this).aClass240_4876), (bool ? ((Class411) this).aClass240_4872 : ((Class411) this).aClass240_4873), (float) (-1800975777 * ((Class411) this).anInt4896), ((Class411) this).aFloat4897, ((Class411) this).aFloat4881, ((Class411) this).aFloat4882, (short) 215);
		else if (Class427.aClass427_5004 == ((Class411) this).aClass427_4870)
			Class491.method5864(f, class240, class230, class240_0_, class240_1_, (bool ? ((Class411) this).aClass240_4885 : ((Class411) this).aClass240_4866), (bool ? ((Class411) this).aFloat4887 : ((Class411) this).aFloat4886), ((Class411) this).aFloat4881, ((Class411) this).aFloat4894, (byte) -5);
	}

	public Class658 method4971(Class416 class416, boolean bool, int i) throws Exception_Sub4 {
		if (Class409.aClass409_4782 == ((Class411) this).aClass409_4863 && !bool)
			throw new Exception_Sub4();
		((Class411) this).aClass416_4880 = class416;
		if (Class416.aClass416_4935 == class416)
			((Class411) this).aClass658_4867 = new Class658_Sub3(this);
		else if (Class416.aClass416_4933 == class416)
			((Class411) this).aClass658_4867 = new Class658_Sub2(this);
		else if (Class416.aClass416_4931 == class416)
			((Class411) this).aClass658_4867 = new Class658_Sub5(this);
		else if (Class416.aClass416_4932 == class416)
			((Class411) this).aClass658_4867 = new Class658_Sub4_Sub2(this);
		else if (class416 == Class416.aClass416_4930)
			((Class411) this).aClass658_4867 = new Class658_Sub4_Sub3(this);
		else if (class416 == Class416.aClass416_4938)
			((Class411) this).aClass658_4867 = new Class658_Sub1(this);
		else if (class416 == Class416.aClass416_4936)
			((Class411) this).aClass658_4867 = new Class658_Sub4_Sub1(this);
		return ((Class411) this).aClass658_4867;
	}

	public Class423 method4972(Class413 class413, boolean bool, byte i) throws Exception_Sub4 {
		if (Class409.aClass409_4782 == ((Class411) this).aClass409_4863 && !bool)
			throw new Exception_Sub4();
		((Class411) this).aClass413_4889 = class413;
		if (class413 == Class413.aClass413_4915)
			((Class411) this).aClass423_4868 = new Class423_Sub3(this);
		else if (class413 == Class413.aClass413_4910)
			((Class411) this).aClass423_4868 = new Class423_Sub2(this);
		else if (class413 == Class413.aClass413_4912)
			((Class411) this).aClass423_4868 = new Class423_Sub1_Sub3(this);
		else if (Class413.aClass413_4913 == class413)
			((Class411) this).aClass423_4868 = new Class423_Sub1_Sub1(this);
		else if (Class413.aClass413_4914 == class413)
			((Class411) this).aClass423_4868 = new Class423_Sub1_Sub2(this);
		return ((Class411) this).aClass423_4868;
	}

	boolean method4973(int i) {
		if (((Class411) this).aClass407_4883 == Class407.aClass407_4767 && Class409.aClass409_4782 == ((Class411) this).aClass409_4863)
			return true;
		if (Class407.aClass407_4766 == ((Class411) this).aClass407_4883 && ((Class411) this).aClass409_4863 == Class409.aClass409_4783)
			return true;
		return false;
	}

	public void method4974(float f, int i) throws Exception_Sub4 {
		if (!method4973(-8715139))
			throw new Exception_Sub4();
	}

	public void method4975(Class427 class427, int i) throws Exception_Sub4 {
		if (!method4973(659972312))
			throw new Exception_Sub4();
		((Class411) this).aClass427_4870 = class427;
	}

	public void method4976(Class240 class240, short i) throws Exception_Sub4 {
		if (!method4973(1148331087) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4877.method3269(class240);
	}

	public void method4977(float f, float f_2_, float f_3_, byte i) throws Exception_Sub4 {
		if (!method4973(662003793))
			throw new Exception_Sub4();
		((Class411) this).aFloat4881 = f;
		((Class411) this).aFloat4882 = f_2_;
		((Class411) this).aFloat4894 = f_3_;
	}

	public void method4978(byte i) throws Exception_Sub4 {
		if (!method4973(872169586))
			throw new Exception_Sub4();
		((Class411) this).aFloat4881 = 5120.0F;
		((Class411) this).aFloat4882 = 10.0F;
		((Class411) this).aFloat4894 = 1.0F;
	}

	public void method4979(Class240 class240, byte i) throws Exception_Sub4 {
		if (!method4973(1991240152) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4873.method3269(class240);
	}

	public void method4980(Class240 class240, int i) throws Exception_Sub4 {
		if (!method4973(1878778091) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4872.method3269(class240);
	}

	public void method4981(Class240 class240, float f, int i) throws Exception_Sub4 {
		if (!method4973(-952107971) || ((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4866.method3269(class240);
		((Class411) this).aClass240_4885.method3269(class240);
		((Class411) this).aFloat4886 = f;
		((Class411) this).aFloat4887 = f;
	}

	public void method4982(Class240 class240, float f, int i) throws Exception_Sub4 {
		if (!method4973(-1120150337) || ((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4885.method3269(class240);
		((Class411) this).aFloat4887 = f;
	}

	public void method4983(float f, float f_4_, int i) throws Exception_Sub4 {
		if (!method4973(2006813024))
			throw new Exception_Sub4();
		if (f < 1.0F)
			f = 50.0F;
		if (f_4_ < 1.0F)
			f_4_ = 10000.0F;
		if (f >= f_4_)
			throw new Exception_Sub4();
		((Class411) this).aFloat4884 = f;
		((Class411) this).aFloat4891 = f_4_;
	}

	public void method4984(float f, float f_5_, byte i) throws Exception_Sub4 {
		if (!method4973(1929017386))
			throw new Exception_Sub4();
		((Class411) this).aFloat4874 = f;
		((Class411) this).aFloat4893 = f_5_;
	}

	public void method4985(Class240 class240, float f, int i) throws Exception_Sub4 {
		if (!method4973(-370898628) || ((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4866.method3269(class240);
		((Class411) this).aFloat4886 = f;
	}

	public void method4986(Class240 class240) throws Exception_Sub4 {
		if (!method4973(-1210714297) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4873.method3269(class240);
	}

	public Class572_Sub12_Sub17 method4987(int i, int i_6_) {
		return ((Class572_Sub12_Sub17) ((Class411) this).aClass676_4898.get((long) i));
	}

	public void method4988(float f, byte i) throws Exception_Sub4 {
		if (!method4973(-1364531846))
			throw new Exception_Sub4();
		((Class411) this).aFloat4888 = f;
	}

	public Class409 method4989(int i) {
		return ((Class411) this).aClass409_4863;
	}

	public Class423 method4990(byte i) {
		return ((Class411) this).aClass423_4868;
	}

	public Class658 method4991(int i) {
		return ((Class411) this).aClass658_4867;
	}

	public Interface47 method4992(byte i) {
		return ((Class411) this).anInterface47_4869;
	}

	public Class416 method4993(byte i) {
		return ((Class411) this).aClass416_4880;
	}

	public Class413 method4994(int i) {
		return ((Class411) this).aClass413_4889;
	}

	public void method4995(int i, byte i_7_) {
		Class572_Sub12_Sub17 class572_sub12_sub17 = ((Class572_Sub12_Sub17) ((Class411) this).aClass676_4898.get((long) i));
		if (null != class572_sub12_sub17)
			class572_sub12_sub17.method6794((byte) -78);
	}

	public double[] method4996(int i) {
		if (null == ((Class411) this).aClass423_4868 || !((Class411) this).aClass423_4868.method5145(-2059209860))
			return null;
		return ((Class411) this).aClass423_4868.method5144(1447903933);
	}

	public Class240 method4997(int i) {
		if (null == ((Class411) this).aClass658_4867 || !((Class411) this).aClass658_4867.method7735((byte) -80))
			return null;
		return ((Class411) this).aClass658_4867.method7736(-1536139634);
	}

	public float method4998(byte i) {
		return ((Class411) this).aFloat4874;
	}

	public float method4999(int i) {
		Class240 class240 = method4968(-1327967846);
		Class240 class240_8_ = method4997(-2128550688);
		float f = 0.0F;
		if (null != class240 && null != class240_8_) {
			Class240 class240_9_ = Class240.method3277(class240_8_, class240);
			float f_10_ = (float) Math.sqrt((double) ((class240_9_.aFloat2657 * class240_9_.aFloat2657) + (class240_9_.aFloat2653 * class240_9_.aFloat2653)));
			f = (float) Math.atan2((double) -class240_9_.aFloat2656, (double) f_10_);
			class240.method3261();
			class240_8_.method3261();
		}
		return f;
	}

	public float method5000(int i) {
		Class240 class240 = method4968(-526964805);
		Class240 class240_11_ = method4997(185996933);
		float f = 0.0F;
		if (class240 != null && class240_11_ != null) {
			Class240 class240_12_ = Class240.method3277(class240, class240_11_);
			class240_12_.aFloat2656 = 0.0F;
			f = (float) Math.atan2((double) class240_12_.aFloat2653, (double) class240_12_.aFloat2657);
			class240.method3261();
			class240_11_.method3261();
		}
		return (float) (3.141592653589793 - (double) f);
	}

	float method5001(int i) {
		return 0.0F;
	}

	public Class230 method5002(byte i) {
		Class230 class230 = Class230.method3210();
		class230.method3173(method5000(69787938), method4999(938720040), method5001(637469353));
		return class230;
	}

	public Class240 method5003(byte i) {
		return ((Class411) this).aClass240_4876;
	}

	public void method5004() {
		((Class411) this).aClass676_4898.method7964((byte) 18);
	}

	public float method5005(byte i) {
		return ((Class411) this).aFloat4888;
	}

	public Class240 method5006(int i) {
		return ((Class411) this).aClass240_4873;
	}

	public boolean method5007() {
		if (null == ((Class411) this).aClass658_4867 || ((Class411) this).aClass423_4868 == null)
			return false;
		if (!((Class411) this).aClass658_4867.method7735((byte) -74))
			return false;
		if (!((Class411) this).aClass423_4868.method5145(-2059209860))
			return false;
		return true;
	}

	public boolean method5008(int i) {
		return ((Class411) this).aBool4862;
	}

	public Class240 method5009(int i) {
		return ((Class411) this).aClass240_4872;
	}

	public void method5010(boolean bool) {
		((Class411) this).aClass414_4864 = Class414.aClass414_4919;
		((Class411) this).aClass416_4880 = null;
		((Class411) this).aClass658_4867 = null;
		((Class411) this).aClass413_4889 = null;
		((Class411) this).aClass423_4868 = null;
		if (((Class411) this).aClass407_4883 == Class407.aClass407_4767 || !bool)
			((Class411) this).aClass409_4863 = Class409.aClass409_4782;
		else
			((Class411) this).aClass409_4863 = Class409.aClass409_4783;
		((Class411) this).aClass427_4870 = Class427.aClass427_5005;
		((Class411) this).aClass240_4873.method3268(100.0F, 100.0F, 100.0F);
		((Class411) this).aClass240_4872.method3268(100.0F, 100.0F, 100.0F);
		((Class411) this).aFloat4888 = 0.05F;
		((Class411) this).aClass240_4876.method3268(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		((Class411) this).aClass240_4877.method3268(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		((Class411) this).aClass240_4866.method3268(1.0F, 1.0F, 1.0F);
		((Class411) this).aClass240_4885.method3268(1.0F, 1.0F, 1.0F);
		((Class411) this).aFloat4886 = 1.1F;
		((Class411) this).aFloat4887 = 1.1F;
		((Class411) this).aFloat4884 = 50.0F;
		((Class411) this).aFloat4891 = 10000.0F;
		((Class411) this).aFloat4893 = 1.5707964F;
		((Class411) this).aFloat4874 = 1.5707964F;
		((Class411) this).anInt4871 = 1350676653;
		((Class411) this).aBool4862 = true;
		((Class411) this).aBool4895 = true;
		((Class411) this).anInt4896 = 0;
		((Class411) this).aFloat4897 = 1.0F;
		((Class411) this).aClass676_4898.method7964((byte) 19);
	}

	public void method5011(boolean bool) {
		((Class411) this).aClass414_4864 = Class414.aClass414_4919;
		((Class411) this).aClass416_4880 = null;
		((Class411) this).aClass658_4867 = null;
		((Class411) this).aClass413_4889 = null;
		((Class411) this).aClass423_4868 = null;
		if (((Class411) this).aClass407_4883 == Class407.aClass407_4767 || !bool)
			((Class411) this).aClass409_4863 = Class409.aClass409_4782;
		else
			((Class411) this).aClass409_4863 = Class409.aClass409_4783;
		((Class411) this).aClass427_4870 = Class427.aClass427_5005;
		((Class411) this).aClass240_4873.method3268(100.0F, 100.0F, 100.0F);
		((Class411) this).aClass240_4872.method3268(100.0F, 100.0F, 100.0F);
		((Class411) this).aFloat4888 = 0.05F;
		((Class411) this).aClass240_4876.method3268(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		((Class411) this).aClass240_4877.method3268(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		((Class411) this).aClass240_4866.method3268(1.0F, 1.0F, 1.0F);
		((Class411) this).aClass240_4885.method3268(1.0F, 1.0F, 1.0F);
		((Class411) this).aFloat4886 = 1.1F;
		((Class411) this).aFloat4887 = 1.1F;
		((Class411) this).aFloat4884 = 50.0F;
		((Class411) this).aFloat4891 = 10000.0F;
		((Class411) this).aFloat4893 = 1.5707964F;
		((Class411) this).aFloat4874 = 1.5707964F;
		((Class411) this).anInt4871 = 1350676653;
		((Class411) this).aBool4862 = true;
		((Class411) this).aBool4895 = true;
		((Class411) this).anInt4896 = 0;
		((Class411) this).aFloat4897 = 1.0F;
		((Class411) this).aClass676_4898.method7964((byte) 28);
	}

	public void method5012(float f, int[][][] is, Class274 class274, int i, int i_13_, byte i_14_) {
		if (((Class411) this).aClass658_4867 != null)
			((Class411) this).aClass658_4867.method7734(f, -714960810);
		if (((Class411) this).aClass423_4868 != null)
			((Class411) this).aClass423_4868.method5142(f, is, class274, i, i_13_, -237158571);
		Iterator iterator = ((Class411) this).aClass676_4898.iterator();
		while (iterator.hasNext()) {
			Class572_Sub12_Sub17 class572_sub12_sub17 = (Class572_Sub12_Sub17) iterator.next();
			class572_sub12_sub17.method10447(f, -1702901977);
		}
	}

	boolean method5013() {
		if (((Class411) this).aClass407_4883 == Class407.aClass407_4767 && Class409.aClass409_4782 == ((Class411) this).aClass409_4863)
			return true;
		if (Class407.aClass407_4766 == ((Class411) this).aClass407_4883 && ((Class411) this).aClass409_4863 == Class409.aClass409_4783)
			return true;
		return false;
	}

	boolean method5014() {
		if (((Class411) this).aClass407_4883 == Class407.aClass407_4767 && Class409.aClass409_4782 == ((Class411) this).aClass409_4863)
			return true;
		if (Class407.aClass407_4766 == ((Class411) this).aClass407_4883 && ((Class411) this).aClass409_4863 == Class409.aClass409_4783)
			return true;
		return false;
	}

	public void method5015(float f) throws Exception_Sub4 {
		if (!method4973(245480204))
			throw new Exception_Sub4();
	}

	public void method5016(boolean bool, boolean bool_15_, int i) throws Exception_Sub4 {
		if (!method4973(58682881))
			throw new Exception_Sub4();
		((Class411) this).aBool4862 = bool;
		((Class411) this).aBool4895 = bool_15_;
	}

	public boolean method5017() {
		return ((Class411) this).aBool4895;
	}

	public void method5018() throws Exception_Sub4 {
		if (!method4973(-83235109))
			throw new Exception_Sub4();
		((Class411) this).aFloat4881 = 5120.0F;
		((Class411) this).aFloat4882 = 10.0F;
		((Class411) this).aFloat4894 = 1.0F;
	}

	public void method5019() throws Exception_Sub4 {
		if (!method4973(-859432027))
			throw new Exception_Sub4();
		((Class411) this).aFloat4881 = 5120.0F;
		((Class411) this).aFloat4882 = 10.0F;
		((Class411) this).aFloat4894 = 1.0F;
	}

	public void method5020(Class240 class240) throws Exception_Sub4 {
		if (!method4973(1819348081) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4873.method3269(class240);
	}

	public float method5021(int i) {
		return ((Class411) this).aFloat4891;
	}

	public void method5022(byte i) {
		((Class411) this).aClass676_4898.method7964((byte) 84);
	}

	public void method5023(int i) {
		Class572_Sub12_Sub17 class572_sub12_sub17 = ((Class572_Sub12_Sub17) ((Class411) this).aClass676_4898.get((long) i));
		if (null != class572_sub12_sub17)
			class572_sub12_sub17.method6794((byte) 69);
	}

	public void method5024(Class240 class240, int i) throws Exception_Sub4 {
		if (!method4973(-1662666583) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).aClass240_4876.method3269(class240);
	}

	public void method5025(boolean bool, int i) {
		((Class411) this).aClass414_4864 = Class414.aClass414_4919;
		((Class411) this).aClass416_4880 = null;
		((Class411) this).aClass658_4867 = null;
		((Class411) this).aClass413_4889 = null;
		((Class411) this).aClass423_4868 = null;
		if (((Class411) this).aClass407_4883 == Class407.aClass407_4767 || !bool)
			((Class411) this).aClass409_4863 = Class409.aClass409_4782;
		else
			((Class411) this).aClass409_4863 = Class409.aClass409_4783;
		((Class411) this).aClass427_4870 = Class427.aClass427_5005;
		((Class411) this).aClass240_4873.method3268(100.0F, 100.0F, 100.0F);
		((Class411) this).aClass240_4872.method3268(100.0F, 100.0F, 100.0F);
		((Class411) this).aFloat4888 = 0.05F;
		((Class411) this).aClass240_4876.method3268(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		((Class411) this).aClass240_4877.method3268(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		((Class411) this).aClass240_4866.method3268(1.0F, 1.0F, 1.0F);
		((Class411) this).aClass240_4885.method3268(1.0F, 1.0F, 1.0F);
		((Class411) this).aFloat4886 = 1.1F;
		((Class411) this).aFloat4887 = 1.1F;
		((Class411) this).aFloat4884 = 50.0F;
		((Class411) this).aFloat4891 = 10000.0F;
		((Class411) this).aFloat4893 = 1.5707964F;
		((Class411) this).aFloat4874 = 1.5707964F;
		((Class411) this).anInt4871 = 1350676653;
		((Class411) this).aBool4862 = true;
		((Class411) this).aBool4895 = true;
		((Class411) this).anInt4896 = 0;
		((Class411) this).aFloat4897 = 1.0F;
		((Class411) this).aClass676_4898.method7964((byte) 101);
	}

	public boolean method5026() {
		if (null == ((Class411) this).aClass658_4867 || ((Class411) this).aClass423_4868 == null)
			return false;
		if (!((Class411) this).aClass658_4867.method7735((byte) -12))
			return false;
		if (!((Class411) this).aClass423_4868.method5145(-2059209860))
			return false;
		return true;
	}

	public void method5027(Class403 class403, Class261 class261, Class250 class250, int i, int i_16_, int i_17_) {
		if (method5034((byte) 117)) {
			((Class411) this).aClass658_4867.method7739(class403, class261, i, i_16_, ((Class411) this).aClass423_4868.method5147((byte) 55), (byte) -110);
			((Class411) this).aClass423_4868.method5148(class403, i, i_16_, -1785261826);
			if (Class414.aClass414_4919 == ((Class411) this).aClass414_4864)
				class250.method3450(((Class411) this).aFloat4884, ((Class411) this).aFloat4891, ((Class411) this).aFloat4874, ((Class411) this).aFloat4893);
			else
				class250.method3451(((Class411) this).aFloat4884, ((Class411) this).aFloat4891, (float) (((Class411) this).anInt4871 * -1965555783));
			Iterator iterator = ((Class411) this).aClass676_4898.iterator();
			while (iterator.hasNext()) {
				Class572_Sub12_Sub17 class572_sub12_sub17 = (Class572_Sub12_Sub17) iterator.next();
				class572_sub12_sub17.method10448(class403, class261, class250, (byte) 2);
			}
		}
	}

	public void method5028(float f) throws Exception_Sub4 {
		if (!method4973(372228068))
			throw new Exception_Sub4();
		((Class411) this).aFloat4888 = f;
	}

	public void method5029(int i) {
		Class572_Sub12_Sub17 class572_sub12_sub17 = ((Class572_Sub12_Sub17) ((Class411) this).aClass676_4898.get((long) i));
		if (null != class572_sub12_sub17)
			class572_sub12_sub17.method6794((byte) 85);
	}

	public boolean method5030() {
		return ((Class411) this).aBool4895;
	}

	public void method5031(int i) {
		Class572_Sub12_Sub17 class572_sub12_sub17 = ((Class572_Sub12_Sub17) ((Class411) this).aClass676_4898.get((long) i));
		if (null != class572_sub12_sub17)
			class572_sub12_sub17.method6794((byte) 57);
	}

	public void method5032(float f) throws Exception_Sub4 {
		if (!method4973(936321958))
			throw new Exception_Sub4();
	}

	public boolean method5033() {
		return ((Class411) this).aBool4895;
	}

	public boolean method5034(byte i) {
		if (null == ((Class411) this).aClass658_4867 || ((Class411) this).aClass423_4868 == null)
			return false;
		if (!((Class411) this).aClass658_4867.method7735((byte) -120))
			return false;
		if (!((Class411) this).aClass423_4868.method5145(-2059209860))
			return false;
		return true;
	}

	public Class240 method5035(int i) {
		return ((Class411) this).aClass240_4877;
	}

	Class411(Class407 class407, Interface47 interface47) {
		((Class411) this).aClass240_4872 = new Class240();
		((Class411) this).aClass240_4876 = new Class240();
		((Class411) this).aClass240_4877 = new Class240();
		((Class411) this).aFloat4878 = 5120.0F;
		((Class411) this).aFloat4879 = 10.0F;
		((Class411) this).aFloat4892 = 1.0F;
		((Class411) this).aFloat4881 = 5120.0F;
		((Class411) this).aFloat4882 = 10.0F;
		((Class411) this).aFloat4894 = 1.0F;
		((Class411) this).aClass240_4866 = new Class240();
		((Class411) this).aClass240_4885 = new Class240();
		((Class411) this).anInt4896 = 0;
		((Class411) this).aFloat4897 = 1.0F;
		((Class411) this).aClass676_4898 = new Class676(8);
		((Class411) this).aClass407_4883 = class407;
		((Class411) this).anInterface47_4869 = interface47;
		method5025(true, -2096852559);
	}

	public boolean method5036() {
		return ((Class411) this).aBool4895;
	}

	public void method5037(Class409 class409, int i) {
		((Class411) this).aClass409_4863 = class409;
	}

	public boolean method5038() {
		return ((Class411) this).aBool4862;
	}

	public float method5039(int i) {
		return ((Class411) this).aFloat4884;
	}

	public Class572_Sub17 method5040(int i) {
		if (((Class411) this).aClass423_4868 == null || !((Class411) this).aClass423_4868.method5145(-2059209860))
			return null;
		return ((Class411) this).aClass423_4868.method5146(-782693863);
	}

	public void method5041(Class572_Sub12_Sub17 class572_sub12_sub17, int i) {
		((Class411) this).aClass676_4898.put(class572_sub12_sub17, (long) (1603351871 * class572_sub12_sub17.anInt11479));
	}

	public void method5042(int i, float f, int i_18_) throws Exception_Sub4 {
		if (!method4973(172397230) || !((Class427) ((Class411) this).aClass427_4870).aBool5006)
			throw new Exception_Sub4();
		((Class411) this).anInt4896 = -106458721 * i;
		((Class411) this).aFloat4897 = f;
	}

	public boolean method5043() {
		return ((Class411) this).aBool4895;
	}

	public boolean method5044() {
		return ((Class411) this).aBool4895;
	}

	static final void method5045(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class342_Sub1.method9245(class73, class83, class441, (byte) 15);
	}

	public static Class572_Sub19 method5046(int i) {
		if (null == Class547_Sub1.aClass675_6149 || null == Class547_Sub1.aClass656_8998)
			return null;
		for (Class572_Sub19 class572_sub19 = (Class572_Sub19) Class547_Sub1.aClass656_8998.next(); class572_sub19 != null; class572_sub19 = (Class572_Sub19) Class547_Sub1.aClass656_8998.next()) {
			Class78 class78 = ((Class78) (Class547_Sub1.aClass639_Sub12_6173.getDefinition(class572_sub19.anInt9142 * 295399623, -1634737012)));
			if (class78 != null && class78.aBool1001 && class78.method1158(Class547_Sub1.anInterface15_6127, Class547_Sub1.anInterface13_6159, 1639226504))
				return class572_sub19;
		}
		return null;
	}
}

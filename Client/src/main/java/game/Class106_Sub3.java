package game;

/* Class106_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.DirectBufferHelper;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

import sun.misc.Unsafe;

public abstract class Class106_Sub3 extends Class106 {
	protected float aFloat10364;
	Class222 aClass222_10365 = new Class222();
	static final int anInt10366 = 128;
	protected int anInt10367;
	static final int anInt10368 = 2;
	protected boolean aBool10369;
	static final int anInt10370 = 8;
	static final int anInt10371 = 55;
	static final int anInt10372 = 7;
	protected static final int anInt10373 = 100663296;
	Class248 aClass248_10374;
	Class261 aClass261_10375;
	Class426 aClass426_10376;
	public Unsafe anUnsafe10377;
	public ByteBuffer aByteBuffer10378;
	Class250 aClass250_10379;
	static final int anInt10380 = 4194304;
	int anInt10381 = 0;
	Class337 aClass337_10382;
	int sunProjectionY;
	Class290 aClass290_10384;
	public int anInt10385;
	public int anInt10386;
	protected int anInt10387;
	protected int anInt10388;
	Class250 aClass250_10389;
	NativeHeap aNativeHeap10390;
	Class363 aClass363_10391;
	public Class250 aClass250_10392;
	Class250 aClass250_10393;
	Class250 aClass250_10394;
	Class86 aClass86_10395;
	Class250 aClass250_10396;
	static Class250 aClass250_10397;
	protected int anInt10398;
	protected Class250 aClass250_10399;
	Class250 aClass250_10400;
	Class240 aClass240_10401;
	float[] aFloatArray10402;
	protected Class373[] aClass373Array10403;
	Class353 aClass353_10404;
	float[][] aFloatArrayArray10405;
	Class250 aClass250_10406;
	float aFloat10407;
	boolean aBool10408;
	Class250 aClass250_10409;
	Class250 aClass250_10410;
	Class250 aClass250_10411;
	Class261 aClass261_10412;
	Interface34[] anInterface34Array10413;
	public Class250 aClass250_10414;
	protected int anInt10415;
	float aFloat10416;
	float aFloat10417;
	protected Class376 aClass376_10418;
	float aFloat10419;
	protected boolean aBool10420;
	protected float aFloat10421;
	float aFloat10422;
	float aFloat10423;
	protected int anInt10424;
	protected float aFloat10425;
	protected int anInt10426;
	protected int anInt10427;
	protected int anInt10428;
	protected int anInt10429;
	Class261 aClass261_10430;
	int anInt10431;
	Class675 aClass675_10432 = new Class675();
	int anInt10433;
	protected int anInt10434;
	protected int anInt10435;
	protected Class295[] aClass295Array10436;
	protected int anInt10437;
	protected int anInt10438;
	public float aFloat10439;
	protected float[] aFloatArray10440;
	protected boolean aBool10441;
	protected boolean aBool10442;
	Class261 aClass261_10443;
	public long aLong10444;
	Interface44 anInterface44_10445;
	public float[] aFloatArray10446;
	boolean aBool10447;
	protected int anInt10448;
	float[] aFloatArray10449;
	int anInt10450;
	public float aFloat10451;
	protected boolean aBool10452;
	public float aFloat10453;
	public int anInt10454;
	public float aFloat10455;
	protected float aFloat10456;
	protected Class572_Sub36[] aClass572_Sub36Array10457;
	protected float aFloat10458;
	protected int anInt10459;
	int anInt10460;
	float[] aFloatArray10461;
	int sunProjectionX;
	static Object anObject10463 = new Object();
	protected float aFloat10464;
	static final int anInt10465 = 1;
	int[] anIntArray10466;
	protected boolean aBool10467;
	int anInt10468;
	protected Class373[] aClass373Array10469;
	boolean aBool10470;
	protected int anInt10471;
	Class261 aClass261_10472;
	Interface43 anInterface43_10473;
	public Interface43 anInterface43_10474;
	Class161_Sub1 aClass161_Sub1_10475;
	boolean aBool10476;
	int anInt10477;
	Class349 aClass349_10478;
	Class349[] aClass349Array10479;
	Class340 aClass340_10480;
	static final int anInt10481 = 4;
	Class335 aClass335_10482;
	protected boolean aBool10483;
	Class349_Sub1_Sub1 aClass349_Sub1_Sub1_10484;
	Class349_Sub1_Sub1 aClass349_Sub1_Sub1_10485;
	protected Class250[] aClass250Array10486;
	Class360 aClass360_10487;
	protected boolean aBool10488;
	static final int anInt10489 = 2;
	static final int anInt10490 = 3;
	Class351[] aClass351Array10491;
	Class250 aClass250_10492;
	Class103_Sub1 aClass103_Sub1_10493;
	boolean aBool10494;
	Class250 aClass250_10495;
	static final int anInt10496 = 1;
	Class362 aClass362_10497;
	protected boolean aBool10498;
	protected boolean aBool10499;
	protected int anInt10500;
	static final int anInt10501 = 4;
	int shadowScale;
	protected float aFloat10503;
	protected float aFloat10504;
	int anInt10505;
	protected int anInt10506;
	int anInt10507;
	protected boolean aBool10508;
	Class342 aClass342_10509;
	protected byte aByte10510;
	public int anInt10511;
	public int anInt10512;
	boolean aBool10513;
	boolean aBool10514;
	Class366 aClass366_10515;
	Interface46 anInterface46_10516;
	Class349_Sub1_Sub2 aClass349_Sub1_Sub2_10517;
	int anInt10518;
	public boolean aBool10519;
	protected boolean aBool10520;
	protected boolean aBool10521;
	protected boolean aBool10522;
	Class261 aClass261_10523 = new Class261();
	public boolean aBool10524;
	protected boolean aBool10525;
	protected boolean aBool10526;
	Interface44 anInterface44_10527;
	public Class250 aClass250_10528;
	Interface44 anInterface44_10529;
	Class362 aClass362_10530;
	protected int anInt10531;
	Class362 aClass362_10532;
	Class362 aClass362_10533;
	Class362 aClass362_10534;
	Class362 aClass362_10535;
	protected boolean aBool10536;
	AbstractModel[] aClass89_Sub3Array10537;
	AbstractModel[] aClass89_Sub3Array10538;
	int anInt10539;
	Class161_Sub1 aClass161_Sub1_10540;
	protected boolean aBool10541;

	public final void method1789(int i, Class86 class86) {
		((Class106_Sub3) this).anInt10507 = i;
		((Class106_Sub3) this).aClass86_10395 = class86;
		((Class106_Sub3) this).aBool10494 = true;
	}

	public void method9573(Interface42 interface42) {
		((Class106_Sub3) this).aClass222_10365.method3117(interface42, -1285609622);
	}

	void method9574() {
		ArrayList arraylist = ((Class106_Sub3) this).aClass222_10365.method3115((byte) 61);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface42 interface42 = (Interface42) iterator.next();
			interface42.method39();
		}
	}

	public abstract boolean method9575();

	public void method1869(int[] is) {
		is[0] = ((Class106_Sub3) this).anInt10468;
		is[1] = ((Class106_Sub3) this).anInt10431;
		is[2] = ((Class106_Sub3) this).anInt10518;
		is[3] = ((Class106_Sub3) this).anInt10433;
	}

	public abstract boolean method9576(boolean bool);

	final Class250 method9577() {
		return aClass250_10414;
	}

	public final boolean method1691() {
		return true;
	}

	abstract void method9578();

	final void method9579() {
		((Class106_Sub3) this).aClass337_10382 = new Class337(this);
		aBool10488 = false;
		try {
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub2(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub1(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub1(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub1(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), false);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), true);
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = new Class349_Sub1_Sub2(this, (((Class106_Sub3) this).aClass337_10382));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub1(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub2(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub2(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub2(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = null;
			aBool10488 = true;
		}
		if (!aBool10488) {
			int i;
			int i_0_;
			if (aClass104_1410 != null) {
				i_0_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_0_ = 0;
			}
			((Class106_Sub3) this).aClass363_10391 = new Class363(this, i_0_, i);
			((Class106_Sub3) this).aClass351Array10491[3] = new Class351_Sub1(this);
			((Class106_Sub3) this).aClass351Array10491[1] = new Class351_Sub2(this);
			((Class106_Sub3) this).aClass351Array10491[2] = new Class351_Sub3(this);
			if (((Class106_Sub3) this).aClass351Array10491[3].method4373())
				((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]);
			method9593();
			method9595();
		}
		if (((Class106_Sub3) this).aClass349_10478 != null) {
			((Class106_Sub3) this).aClass349_10478.method4352();
			((Class106_Sub3) this).aClass349_10478 = null;
		}
		method9687();
	}

	public final void method1876(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (aBool10522 && anInt10511 != 0)
			method9670(false);
		if (aBool10536) {
			method1763(false);
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_1_, i_2_, i_3_, 0, i_4_, i_5_);
			method1763(true);
		} else
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_1_, i_2_, i_3_, 0, i_4_, i_5_);
		if (aBool10522 && anInt10511 != 0)
			method9670(true);
	}

	public Class261 method1842() {
		return ((Class106_Sub3) this).aClass261_10412;
	}

	public final boolean method1809() {
		if (((Class106_Sub3) this).aClass351Array10491[3] != null && !((Class106_Sub3) this).aClass351Array10491[3].method4384()) {
			boolean bool = (((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]));
			if (bool)
				((Class106_Sub3) this).aClass360_10487.method4447();
			return bool;
		}
		return false;
	}

	public final void method9580() {
		((Class106_Sub3) this).anInterface34Array10413 = new Interface34[anInt10454];
		aClass250Array10486 = new Class250[anInt10454];
		aClass295Array10436 = new Class295[anInt10454];
		aClass373Array10403 = new Class373[anInt10454];
		aClass373Array10469 = new Class373[anInt10454];
		for (int i = 0; i < anInt10454; i++) {
			aClass373Array10469[i] = Class373.aClass373_4541;
			aClass373Array10403[i] = Class373.aClass373_4541;
			aClass295Array10436[i] = Class295.aClass295_3462;
			aClass250Array10486[i] = new Class250();
		}
		aClass572_Sub36Array10457 = new Class572_Sub36[anInt10415 - 2];
		int[] is = { -1 };
		anInterface43_10474 = method9636(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class106_Sub3) this).anInterface43_10473 = method9636(1, 1, false, is, 0, 0);
		method1740(new Class572_Sub35_Sub1(262144));
		((Class106_Sub3) this).aClass362_10534 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482 }) });
		((Class106_Sub3) this).aClass362_10535 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4468 }) });
		((Class106_Sub3) this).aClass362_10533 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482),
			new Class354(Class364.aClass364_4464) });
		((Class106_Sub3) this).aClass362_10532 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482) });
		for (int i = 0; i < 8; i++) {
			((Class106_Sub3) this).aClass89_Sub3Array10537[i] = new AbstractModel(this, 0, 0, false, false);
			((Class106_Sub3) this).aClass89_Sub3Array10538[i] = new AbstractModel(this, 0, 0, true, true);
		}
		method9581();
		((Class106_Sub3) this).anInterface46_10516 = method9671(true);
		method9738();
		method1714();
		method2044();
		((Class106_Sub3) this).aClass161_Sub1_10540 = new Class161_Sub1(this, anInterface43_10474);
		((Class106_Sub3) this).aClass161_Sub1_10475 = new Class161_Sub1(this, ((Class106_Sub3) this).anInterface43_10473);
		method1719(3, 0);
	}

	final void method9581() {
		((Class106_Sub3) this).aClass337_10382 = new Class337(this);
		aBool10488 = false;
		try {
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub2(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub1(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub1(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub1(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), false);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), true);
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = new Class349_Sub1_Sub2(this, (((Class106_Sub3) this).aClass337_10382));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub1(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub2(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub2(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub2(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = null;
			aBool10488 = true;
		}
		if (!aBool10488) {
			int i;
			int i_6_;
			if (aClass104_1410 != null) {
				i_6_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_6_ = 0;
			}
			((Class106_Sub3) this).aClass363_10391 = new Class363(this, i_6_, i);
			((Class106_Sub3) this).aClass351Array10491[3] = new Class351_Sub1(this);
			((Class106_Sub3) this).aClass351Array10491[1] = new Class351_Sub2(this);
			((Class106_Sub3) this).aClass351Array10491[2] = new Class351_Sub3(this);
			if (((Class106_Sub3) this).aClass351Array10491[3].method4373())
				((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]);
			method9593();
			method9595();
		}
		if (((Class106_Sub3) this).aClass349_10478 != null) {
			((Class106_Sub3) this).aClass349_10478.method4352();
			((Class106_Sub3) this).aClass349_10478 = null;
		}
		method9687();
	}

	Class106_Sub3(MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, Class248 class248, int i, int i_7_) {
		super(mapSize, interface5, interface35, interface36, interface37);
		((Class106_Sub3) this).aClass250_10389 = new Class250();
		((Class106_Sub3) this).aClass261_10412 = new Class261();
		((Class106_Sub3) this).aClass261_10430 = new Class261();
		aClass250_10392 = new Class250();
		((Class106_Sub3) this).aClass250_10393 = new Class250();
		((Class106_Sub3) this).aClass250_10394 = new Class250();
		((Class106_Sub3) this).aClass261_10375 = new Class261();
		((Class106_Sub3) this).aClass250_10396 = new Class250();
		((Class106_Sub3) this).aClass261_10443 = new Class261();
		aClass250_10399 = new Class250();
		((Class106_Sub3) this).aClass250_10400 = new Class250();
		((Class106_Sub3) this).aClass240_10401 = new Class240();
		((Class106_Sub3) this).aFloatArray10402 = new float[4];
		((Class106_Sub3) this).aBool10470 = false;
		((Class106_Sub3) this).aClass353_10404 = Class353.aClass353_4401;
		((Class106_Sub3) this).aBool10447 = false;
		((Class106_Sub3) this).aClass250_10406 = new Class250();
		((Class106_Sub3) this).aClass250_10379 = new Class250();
		((Class106_Sub3) this).aBool10408 = false;
		((Class106_Sub3) this).aClass250_10409 = new Class250();
		((Class106_Sub3) this).aClass250_10410 = new Class250();
		((Class106_Sub3) this).aClass250_10411 = ((Class106_Sub3) this).aClass250_10410;
		aClass250_10528 = new Class250();
		((Class106_Sub3) this).aClass250_10495 = new Class250();
		aClass250_10414 = new Class250();
		((Class106_Sub3) this).aFloatArrayArray10405 = new float[6][4];
		aFloat10364 = 0.0F;
		aFloat10421 = 1.0F;
		((Class106_Sub3) this).aFloat10422 = 0.0F;
		((Class106_Sub3) this).aFloat10423 = 1.0F;
		aFloat10464 = 50.0F;
		aFloat10425 = 3584.0F;
		anInt10426 = 0;
		anInt10427 = 0;
		anInt10428 = 0;
		anInt10429 = 0;
		((Class106_Sub3) this).anInt10468 = 0;
		((Class106_Sub3) this).anInt10431 = 0;
		((Class106_Sub3) this).anInt10518 = 0;
		((Class106_Sub3) this).anInt10433 = 0;
		anInt10434 = 0;
		anInt10435 = 0;
		anInt10531 = 0;
		anInt10437 = 0;
		anInt10438 = 0;
		anInt10424 = 0;
		aBool10536 = true;
		aBool10441 = false;
		aBool10442 = false;
		aBool10369 = false;
		aBool10452 = true;
		aBool10420 = false;
		aFloatArray10446 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aFloatArray10440 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		((Class106_Sub3) this).aFloatArray10461 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class106_Sub3) this).aFloatArray10449 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		((Class106_Sub3) this).anInt10450 = 16777215;
		aFloat10451 = 1.0F;
		aFloat10439 = 1.0F;
		aFloat10453 = 1.0F;
		aFloat10458 = 1.0F;
		aFloat10455 = -1.0F;
		aFloat10456 = -1.0F;
		((Class106_Sub3) this).anInt10460 = 8;
		((Class106_Sub3) this).shadowScale = 3;
		anInt10367 = 0;
		((Class106_Sub3) this).aBool10476 = false;
		((Class106_Sub3) this).aClass349Array10479 = new Class349[16];
		((Class106_Sub3) this).aClass351Array10491 = new Class351[4];
		((Class106_Sub3) this).aBool10513 = false;
		aBool10499 = true;
		anInt10500 = -1;
		anInt10448 = -1;
		anInt10398 = 0;
		((Class106_Sub3) this).anInt10505 = 1;
		anInt10506 = -1;
		aClass376_10418 = Class376.aClass376_4569;
		aBool10508 = true;
		aBool10483 = true;
		aByte10510 = (byte) 0;
		((Class106_Sub3) this).aBool10514 = false;
		new Stream();
		((Class106_Sub3) this).aClass89_Sub3Array10537 = new AbstractModel[8];
		((Class106_Sub3) this).aClass89_Sub3Array10538 = new AbstractModel[8];
		((Class106_Sub3) this).aClass250_10492 = new Class250();
		((Class106_Sub3) this).aClass261_10472 = new Class261();
		try {
			((Class106_Sub3) this).aClass248_10374 = class248;
			anInt10511 = i;
			((Class106_Sub3) this).anInt10477 = i_7_;
			Class245.method3353(false, true, (byte) 122);
			if (anInterface5_1408 != null)
				((Class106_Sub3) this).aClass360_10487 = new Class360(this, anInterface5_1408);
			else
				((Class106_Sub3) this).aClass360_10487 = null;
			if (((Class106_Sub3) this).anInt10477 == 0)
				((Class106_Sub3) this).anIntArray10466 = Class460.anIntArray5213;
			else
				((Class106_Sub3) this).anIntArray10466 = Class460.anIntArray5210;
			try {
				Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				anUnsafe10377 = (Unsafe) field.get(null);
			} catch (Exception exception) {
				/* empty */
			}
			method9661(4194304);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method1666(-1359677308);
			if (throwable instanceof OutOfMemoryError)
				throw (OutOfMemoryError) throwable;
			throw new RuntimeException("");
		}
		method1740(method1739(131072));
	}

	final void method9582() {
		method9594();
		method9748();
		method9624();
		method9816();
		method9626();
		method9627();
		method9610();
		method9588();
		method9620();
		method9669();
		method9668();
		method9666();
		method9665();
		method9664();
		for (int i = anInt10454 - 1; i >= 0; i--) {
			method9641(i);
			method9691();
			method9657();
			method9653();
		}
		method9655();
		method9603();
	}

	void method9583() {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4473();
		if (((Class106_Sub3) this).anInterface44_10445 != null)
			((Class106_Sub3) this).anInterface44_10445.method39();
		if (((Class106_Sub3) this).anInterface44_10527 != null)
			((Class106_Sub3) this).anInterface44_10527.method39();
		if (((Class106_Sub3) this).anInterface44_10529 != null)
			((Class106_Sub3) this).anInterface44_10529.method39();
		for (int i = 0; i < 8; i++) {
			if (((Class106_Sub3) this).aClass89_Sub3Array10538[i] != null)
				((Class106_Sub3) this).aClass89_Sub3Array10538[i].method10024();
		}
		if (((Class106_Sub3) this).aClass366_10515 != null)
			((Class106_Sub3) this).aClass366_10515.method4491();
		if (((Class106_Sub3) this).anInterface46_10516 != null)
			((Class106_Sub3) this).anInterface46_10516.method39();
		if (((Class106_Sub3) this).aClass290_10384 != null) {
			((Class106_Sub3) this).aClass290_10384.method3923();
			((Class106_Sub3) this).aClass290_10384 = null;
		}
	}

	public final void method1775(Class103 class103) {
		((Class106_Sub3) this).aClass103_Sub1_10493 = (Class103_Sub1) class103;
	}

	final void method9584() {
		((Class106_Sub3) this).anInterface44_10445 = method9723(false);
		int i = 160;
		((Class106_Sub3) this).anInterface44_10445.method259(i, 32);
		aByteBuffer10378.clear();
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putInt(-1);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putInt(-1);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putInt(-1);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putInt(-1);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(1.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putInt(-1);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		((Class106_Sub3) this).anInterface44_10445.method223(0, aByteBuffer10378.position(), aLong10444);
		((Class106_Sub3) this).aClass362_10497 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4468, Class364.aClass364_4482,
			Class364.aClass364_4482 }) });
	}

	void method9585() {
		ArrayList arraylist = ((Class106_Sub3) this).aClass222_10365.method3115((byte) 121);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface42 interface42 = (Interface42) iterator.next();
			interface42.method39();
		}
	}

	final void method9586() {
		((Class106_Sub3) this).anInterface44_10529 = method9723(false);
		((Class106_Sub3) this).anInterface44_10529.method259(3096, 12);
		aByteBuffer10378.clear();
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		aByteBuffer10378.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = (double) (i * 2) * 3.141592653589793 / 256.0;
			float f = (float) Math.cos(d);
			float f_8_ = (float) Math.sin(d);
			aByteBuffer10378.putFloat(f_8_);
			aByteBuffer10378.putFloat(f);
			aByteBuffer10378.putFloat(0.0F);
		}
		((Class106_Sub3) this).anInterface44_10529.method223(0, aByteBuffer10378.position(), aLong10444);
	}

	boolean method9587(float f, float f_9_, float f_10_, float f_11_, float f_12_, float f_13_) {
		aByteBuffer10378.clear();
		aByteBuffer10378.putFloat(f);
		aByteBuffer10378.putFloat(f_9_);
		aByteBuffer10378.putFloat(f_10_);
		aByteBuffer10378.putFloat(f_11_);
		aByteBuffer10378.putFloat(f_12_);
		aByteBuffer10378.putFloat(f_13_);
		return ((Class106_Sub3) this).anInterface44_10527.method223(0, aByteBuffer10378.position(), aLong10444);
	}

	void method1667() {
		if (!((Class106_Sub3) this).aBool10514) {
			method9583();
			((Class106_Sub3) this).aClass360_10487.method4447();
			for (Class572 class572 = ((Class106_Sub3) this).aClass675_10432.method7932((byte) 50); class572 != null; class572 = ((Class106_Sub3) this).aClass675_10432.method7926(1021276855))
				((Class572_Sub35_Sub1) class572).method10065();
			Class472.method5585(false, true, (byte) -9);
			for (int i = 0; i < ((Class106_Sub3) this).aClass349Array10479.length; i++) {
				if (((Class106_Sub3) this).aClass349Array10479[i] != null) {
					((Class106_Sub3) this).aClass349Array10479[i].method4363();
					((Class106_Sub3) this).aClass349Array10479[i] = null;
				}
			}
			for (int i = 0; i < ((Class106_Sub3) this).aClass351Array10491.length; i++) {
				if (((Class106_Sub3) this).aClass351Array10491[i] != null) {
					((Class106_Sub3) this).aClass351Array10491[i].method4385();
					((Class106_Sub3) this).aClass351Array10491[i] = null;
				}
			}
			method9574();
			method1668(0);
			((Class106_Sub3) this).aBool10514 = true;
		}
	}

	public final boolean method1671() {
		return true;
	}

	public final boolean method1672() {
		return true;
	}

	public final boolean method1673() {
		return true;
	}

	public final boolean method1675() {
		return ((Class106_Sub3) this).aClass351Array10491[3] != null;
	}

	public final boolean method1676() {
		return true;
	}

	public boolean method1993() {
		return (((Class106_Sub3) this).aClass351Array10491[1] != null && ((Class106_Sub3) this).aClass351Array10491[1].method4384());
	}

	abstract void method9588();

	public final void method1767(int i, float f, float f_14_, float f_15_, float f_16_, float f_17_) {
		boolean bool = ((Class106_Sub3) this).anInt10450 != i;
		f *= 0.5F;
		f_14_ *= 0.5F;
		if (bool || aFloat10455 != f || aFloat10456 != f_14_) {
			((Class106_Sub3) this).anInt10450 = i;
			aFloat10455 = f;
			aFloat10456 = f_14_;
			if (bool) {
				aFloat10451 = (float) (((Class106_Sub3) this).anInt10450 & 0xff0000) / 1.671168E7F;
				aFloat10439 = (float) (((Class106_Sub3) this).anInt10450 & 0xff00) / 65280.0F;
				aFloat10453 = (float) (((Class106_Sub3) this).anInt10450 & 0xff) / 255.0F;
				method9594();
			}
			method9748();
		}
		if (((Class106_Sub3) this).aFloatArray10461[0] != f_15_ || ((Class106_Sub3) this).aFloatArray10461[1] != f_16_ || ((Class106_Sub3) this).aFloatArray10461[2] != f_17_) {
			((Class106_Sub3) this).aFloatArray10461[0] = f_15_;
			((Class106_Sub3) this).aFloatArray10461[1] = f_16_;
			((Class106_Sub3) this).aFloatArray10461[2] = f_17_;
			((Class106_Sub3) this).aFloatArray10449[0] = -f_15_;
			((Class106_Sub3) this).aFloatArray10449[1] = -f_16_;
			((Class106_Sub3) this).aFloatArray10449[2] = -f_17_;
			float f_18_ = (float) (1.0 / Math.sqrt((double) (f_15_ * f_15_ + f_16_ * f_16_ + f_17_ * f_17_)));
			aFloatArray10446[0] = f_15_ * f_18_;
			aFloatArray10446[1] = f_16_ * f_18_;
			aFloatArray10446[2] = f_17_ * f_18_;
			aFloatArray10440[0] = -aFloatArray10446[0];
			aFloatArray10440[1] = -aFloatArray10446[1];
			aFloatArray10440[2] = -aFloatArray10446[2];
			method9626();
			((Class106_Sub3) this).sunProjectionX = (int) (f_15_ * 256.0F / f_16_);
			((Class106_Sub3) this).sunProjectionY = (int) (f_17_ * 256.0F / f_16_);
		}
		method9627();
	}

	abstract void method9589(int i, Class293 class293, boolean bool);

	public final boolean method1677() {
		return aBool10522;
	}

	public abstract float method9590();

	final void method1835(float f, float f_19_, float f_20_, float f_21_, float f_22_, float f_23_) {
		Class351_Sub1.aFloat9668 = f;
		Class351_Sub1.aFloat9675 = f_19_;
		Class351_Sub1.aFloat9673 = f_20_;
		Class351_Sub1.aFloat9669 = f_23_;
	}

	final void method9591(int i) {
		if (((Class106_Sub3) this).anInt10505 != i) {
			Class376 class376;
			boolean bool;
			boolean bool_24_;
			if (i == 1) {
				class376 = Class376.aClass376_4569;
				bool = true;
				bool_24_ = true;
			} else if (i == 2) {
				class376 = Class376.aClass376_4568;
				bool = false;
				bool_24_ = true;
			} else if (i == 128) {
				class376 = Class376.aClass376_4567;
				bool = true;
				bool_24_ = true;
			} else if (i == 3) {
				class376 = Class376.aClass376_4566;
				bool = true;
				bool_24_ = false;
			} else {
				class376 = Class376.aClass376_4566;
				bool = false;
				bool_24_ = false;
			}
			if (bool != aBool10483) {
				aBool10483 = bool;
				method9664();
			}
			if (bool_24_ != aBool10508) {
				aBool10508 = bool_24_;
				method9666();
			}
			if (class376 != aClass376_10418) {
				aClass376_10418 = class376;
				method9665();
			}
			((Class106_Sub3) this).anInt10505 = i;
			((Class106_Sub3) this).anInt10539 &= ~0xc;
		}
	}

	public final boolean method1815() {
		return true;
	}

	public void method1747() {
		if (((Class106_Sub3) this).aClass290_10384 != null)
			((Class106_Sub3) this).aClass290_10384.method3925();
	}

	public void method2049() {
		if (((Class106_Sub3) this).aClass290_10384 != null)
			((Class106_Sub3) this).aClass290_10384.method3934();
	}

	public final Class161 method1912(int i, int i_25_, boolean bool, boolean bool_26_) {
		return new Class161_Sub1(this, i, i_25_, bool, bool_26_);
	}

	void method9592() {
		method9831();
	}

	public final void method2024(int i, int i_27_, int i_28_, int i_29_) {
		if (((Class106_Sub3) this).aClass363_10391 != null) {
			for (int i_30_ = 0; i_30_ < ((Class106_Sub3) this).aClass351Array10491.length; i_30_++) {
				if (((Class106_Sub3) this).aClass351Array10491[i_30_] != null && ((Class106_Sub3) this).aClass351Array10491[i_30_].method4384() && !((Class106_Sub3) this).aClass351Array10491[i_30_].method4380()) {
					if (!((Class106_Sub3) this).aClass363_10391.method4470(i, i_27_, i_28_, i_29_)) {
						((Class106_Sub3) this).aClass363_10391.method4473();
						((Class106_Sub3) this).aClass363_10391 = null;
					}
					break;
				}
			}
		}
	}

	public final boolean method1990() {
		return true;
	}

	public final boolean method1778() {
		return (((Class106_Sub3) this).aClass363_10391 != null && (((Class363) ((Class106_Sub3) this).aClass363_10391).aBool4441));
	}

	boolean method9593() {
		if (((Class106_Sub3) this).aClass351Array10491[1] != null && !((Class106_Sub3) this).aClass351Array10491[1].method4384()) {
			boolean bool = (((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]));
			if (bool)
				((Class106_Sub3) this).aClass360_10487.method4447();
			return bool;
		}
		return false;
	}

	abstract void method9594();

	public void method1702(float f, float f_31_, float f_32_, float f_33_, float f_34_) {
		Class351_Sub2.aFloat9732 = f;
		Class351_Sub2.aFloat9736 = f_31_;
		Class351_Sub2.aFloat9737 = f_32_;
		Class351_Sub2.aFloat9738 = f_33_;
		Class351_Sub2.aFloat9739 = f_34_;
	}

	public Class96 method1951(int[] is) {
		return new Class96_Sub2(this, is);
	}

	boolean method9595() {
		if (((Class106_Sub3) this).aClass351Array10491[2] != null && !((Class106_Sub3) this).aClass351Array10491[2].method4384()) {
			boolean bool = (((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]));
			if (bool)
				((Class106_Sub3) this).aClass360_10487.method4447();
			return bool;
		}
		return false;
	}

	public boolean method1782() {
		return (((Class106_Sub3) this).aClass351Array10491[2] != null && ((Class106_Sub3) this).aClass351Array10491[2].method4384());
	}

	public void method1774(Class96 class96, float f, Class96 class96_35_, float f_36_, Class96 class96_37_, float f_38_) {
		int i = 0;
		if (class96_37_ == null && f_38_ > 0.0F)
			f_38_ = 0.0F;
		if (class96_35_ == null && f_36_ > 0.0F) {
			class96_35_ = class96_37_;
			class96_37_ = null;
			f_36_ = f_38_;
			f_38_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_35_;
			class96_35_ = class96_37_;
			class96_37_ = null;
			f = f_36_;
			f_36_ = f_38_;
			f_38_ = 0.0F;
		}
		Class351_Sub3.aClass96_Sub2Array9908[0] = (Class96_Sub2) class96;
		Class351_Sub3.aFloatArray9911[0] = f;
		if (f > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[1] = (Class96_Sub2) class96_35_;
		Class351_Sub3.aFloatArray9911[1] = f_36_;
		if (f_36_ > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[2] = (Class96_Sub2) class96_37_;
		Class351_Sub3.aFloatArray9911[2] = f_38_;
		if (f_38_ > 0.0F)
			i++;
		Class351_Sub3.anInt9914 = i;
		Class351_Sub3.aFloat9907 = 1.0F - (f + f_36_ + f_38_);
	}

	final void method9596(boolean bool) {
		if (bool != aBool10369) {
			aBool10369 = bool;
			method9624();
			((Class106_Sub3) this).anInt10539 &= ~0x7;
		}
	}

	public final void method1785() {
		if (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384()) {
			((Class106_Sub3) this).aClass363_10391.method4485(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass360_10487.method4447();
		}
	}

	final void method1768(int i, int i_39_, int i_40_, int i_41_, int i_42_) {
		method1730(i, i_39_, i, i_39_ + i_40_, i_41_, i_42_);
	}

	public final Class572_Sub35 method1739(int i) {
		Class572_Sub35_Sub1 class572_sub35_sub1 = new Class572_Sub35_Sub1(i);
		((Class106_Sub3) this).aClass675_10432.method7940(class572_sub35_sub1, -2044524837);
		return class572_sub35_sub1;
	}

	public void method2004(int i, int i_43_, int i_44_, int i_45_) {
		((Class106_Sub3) this).anInt10468 = i;
		((Class106_Sub3) this).anInt10431 = i_43_;
		((Class106_Sub3) this).anInt10518 = i_44_;
		((Class106_Sub3) this).anInt10433 = i_45_;
		method9601();
	}

	public final int method1669() {
		return anInt10386 + anInt10385 + anInt10387;
	}

	final Interface46 method9597(int i) {
		if (((Class106_Sub3) this).anInterface46_10516.method45() < i * 2)
			((Class106_Sub3) this).anInterface46_10516.method265(i);
		return ((Class106_Sub3) this).anInterface46_10516;
	}

	public final Class167 method1918(int i, int i_46_, int[] is, int[] is_47_) {
		return Class167_Sub3.method10061(this, i, i_46_, is, is_47_);
	}

	public final Class161 method1864(int i, int i_48_, boolean bool, boolean bool_49_) {
		return new Class161_Sub1(this, i, i_48_, bool, bool_49_);
	}

	final void method9598() {
		((Class106_Sub3) this).aBool10447 = false;
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4402) {
			method9615();
			method9822();
		}
	}

	public final Class161 method1960(int[] is, int i, int i_50_, int i_51_, int i_52_, boolean bool) {
		return new Class161_Sub1(this, i_51_, i_52_, is, i, i_50_);
	}

	public final Class161 method1821(int i, int i_53_, int i_54_, int i_55_, boolean bool) {
		Class161_Sub1 class161_sub1 = new Class161_Sub1(this, i_54_, i_55_, bool, false);
		class161_sub1.method2607(0, 0, i_54_, i_55_, i, i_53_);
		return class161_sub1;
	}

	public final Class102 method1751(Class284 class284, Class87[] class87s, boolean bool) {
		return new Class102_Sub1(this, class284, class87s, bool);
	}

	public final void method1754(int i) {
		/* empty */
	}

	public final Model method1755(Class159 class159, int i, int i_56_, int i_57_, int i_58_) {
		return new AbstractModel(this, class159, i, i_57_, i_58_, i_56_);
	}

	public final int method1756(int i, int i_59_) {
		return i & i_59_ ^ i_59_;
	}

	public final int method1798(int i, int i_60_) {
		return i | i_60_;
	}

	public final Class174 method1909(int i, int i_61_, int[][] is, int[][] is_62_, int i_63_, int i_64_, int i_65_) {
		return new Class174_Sub1(this, i_64_, i_65_, i, i_61_, is, is_62_, i_63_);
	}

	public final boolean method1674() {
		return true;
	}

	public final Class261 method1753() {
		return ((Class106_Sub3) this).aClass261_10472;
	}

	public final Class103 method1773(int i) {
		return new Class103_Sub1_Sub1(this, i);
	}

	abstract void method9599();

	public final Interface33 method9600() {
		return (((Class106_Sub3) this).aClass103_Sub1_10493 != null ? ((Class106_Sub3) this).aClass103_Sub1_10493.method9566() : null);
	}

	public void method1975() {
		((Class106_Sub3) this).anInt10468 = 0;
		((Class106_Sub3) this).anInt10431 = 0;
		((Class106_Sub3) this).anInt10518 = aClass104_1410.method1648();
		((Class106_Sub3) this).anInt10433 = aClass104_1410.method1646();
		method9601();
	}

	public void method1712(int[] is) {
		is[0] = ((Class106_Sub3) this).anInt10468;
		is[1] = ((Class106_Sub3) this).anInt10431;
		is[2] = ((Class106_Sub3) this).anInt10518;
		is[3] = ((Class106_Sub3) this).anInt10433;
	}

	final void method9601() {
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400) {
			anInt10434 = ((Class106_Sub3) this).anInt10468;
			anInt10435 = ((Class106_Sub3) this).anInt10431;
			anInt10531 = ((Class106_Sub3) this).anInt10518;
			anInt10437 = ((Class106_Sub3) this).anInt10433;
			aFloat10364 = ((Class106_Sub3) this).aFloat10422;
			aFloat10421 = ((Class106_Sub3) this).aFloat10423;
		} else {
			anInt10434 = 0;
			anInt10435 = 0;
			anInt10531 = aClass104_1410.method1648();
			anInt10437 = aClass104_1410.method1646();
			aFloat10364 = 0.0F;
			aFloat10421 = 1.0F;
		}
		method9603();
		((Class106_Sub3) this).aFloat10417 = (float) ((Class106_Sub3) this).anInt10518 / 2.0F;
		((Class106_Sub3) this).aFloat10419 = (float) ((Class106_Sub3) this).anInt10433 / 2.0F;
		((Class106_Sub3) this).aFloat10416 = ((float) ((Class106_Sub3) this).anInt10468 + ((Class106_Sub3) this).aFloat10417);
		((Class106_Sub3) this).aFloat10407 = ((float) ((Class106_Sub3) this).anInt10431 + ((Class106_Sub3) this).aFloat10419);
	}

	public void method1713(float f, float f_66_) {
		((Class106_Sub3) this).aFloat10422 = f;
		((Class106_Sub3) this).aFloat10423 = f_66_;
		method9601();
	}

	public final void method1718(int[] is) {
		is[0] = anInt10428;
		is[1] = anInt10426;
		is[2] = anInt10429;
		is[3] = anInt10427;
	}

	public final void method1714() {
		if (aClass104_1410 != null) {
			anInt10426 = 0;
			anInt10428 = 0;
			anInt10429 = aClass104_1410.method1648();
			anInt10427 = aClass104_1410.method1646();
		} else {
			anInt10427 = 0;
			anInt10429 = 0;
			anInt10426 = 0;
			anInt10428 = 0;
		}
		if (aBool10541) {
			aBool10541 = false;
			method9694();
		}
	}

	public final void method1715(int i, int i_67_, int i_68_, int i_69_) {
		int i_70_;
		int i_71_;
		if (aClass104_1410 != null) {
			i_71_ = aClass104_1410.method1648();
			i_70_ = aClass104_1410.method1646();
		} else {
			i_70_ = 0;
			i_71_ = 0;
		}
		if (i <= 0 && i_68_ >= i_71_ - 1 && i_67_ <= 0 && i_69_ >= i_70_ - 1)
			method1714();
		else {
			anInt10428 = i >= 0 ? i : 0;
			anInt10429 = i_68_ <= i_71_ ? i_68_ : i_71_;
			anInt10426 = i_67_ >= 0 ? i_67_ : 0;
			anInt10427 = i_69_ <= i_70_ ? i_69_ : i_70_;
			if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
				aBool10541 = true;
				method9694();
			}
			if (aBool10541)
				method9675();
		}
	}

	public final void method1716(int i, int i_72_, int i_73_, int i_74_) {
		int i_75_;
		int i_76_;
		if (aClass104_1410 != null) {
			i_76_ = aClass104_1410.method1648();
			i_75_ = aClass104_1410.method1646();
		} else {
			i_75_ = 0;
			i_76_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_73_ = i_73_ <= i_76_ ? i_73_ : i_76_;
		i_72_ = i_72_ >= 0 ? i_72_ : 0;
		i_74_ = i_74_ <= i_75_ ? i_74_ : i_75_;
		boolean bool = false;
		if (anInt10428 < i) {
			anInt10428 = i;
			bool = true;
		}
		if (anInt10429 > i_73_) {
			anInt10429 = i_73_;
			bool = true;
		}
		if (anInt10426 < i_72_) {
			anInt10426 = i_72_;
			bool = true;
		}
		if (anInt10427 > i_74_) {
			anInt10427 = i_74_;
			bool = true;
		}
		if (bool) {
			if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
				aBool10541 = true;
				method9694();
			}
			if (aBool10541)
				method9675();
		}
	}

	final void method9602(int i, int i_77_) {
		anInt10438 = i;
		anInt10424 = i_77_;
		method9603();
		if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
			aBool10541 = true;
			method9694();
		}
		if (aBool10541)
			method9675();
	}

	public void method1717(boolean bool) {
		((Class106_Sub3) this).aBool10476 = bool;
	}

	abstract void method9603();

	public final Class250 method1934() {
		return ((Class106_Sub3) this).aClass250_10492;
	}

	public final int method2043() {
		return anInt10386 + anInt10385 + anInt10387;
	}

	abstract Interface43 method9604(Class171 class171, int i, int i_78_, boolean bool, byte[] is, int i_79_, int i_80_);

	public final void method1687(boolean bool) {
		aBool10536 = bool;
		method9620();
	}

	public final void method1761(Class261 class261) {
		((Class106_Sub3) this).aClass261_10412 = class261;
		aClass250_10392.method3446(((Class106_Sub3) this).aClass261_10412);
		((Class106_Sub3) this).aClass250_10394.method3442(aClass250_10392);
		((Class106_Sub3) this).aClass250_10394.method3485();
		((Class106_Sub3) this).aClass261_10430.method3568(class261);
		((Class106_Sub3) this).aClass261_10430.method3600();
		((Class106_Sub3) this).aClass250_10393.method3446(((Class106_Sub3) this).aClass261_10430);
		method9605();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9606();
	}

	public Class261 method1762() {
		return ((Class106_Sub3) this).aClass261_10412;
	}

	final void method9605() {
		((Class106_Sub3) this).aClass250_10495.method3442(aClass250_10392);
		((Class106_Sub3) this).aClass250_10495.method3445(((Class106_Sub3) this).aClass250_10409);
		((Class106_Sub3) this).aClass250_10495.method3459(((Class106_Sub3) this).aFloatArrayArray10405[0]);
		((Class106_Sub3) this).aClass250_10495.method3460(((Class106_Sub3) this).aFloatArrayArray10405[1]);
		((Class106_Sub3) this).aClass250_10495.method3455(((Class106_Sub3) this).aFloatArrayArray10405[2]);
		((Class106_Sub3) this).aClass250_10495.method3475(((Class106_Sub3) this).aFloatArrayArray10405[3]);
		((Class106_Sub3) this).aClass250_10495.method3457(((Class106_Sub3) this).aFloatArrayArray10405[4]);
		((Class106_Sub3) this).aClass250_10495.method3456(((Class106_Sub3) this).aFloatArrayArray10405[5]);
		aClass250_10414.method3442(((Class106_Sub3) this).aClass250_10495);
		method9796(aClass250_10414);
	}

	public final void method1813(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_) {
		method1950(i, i_81_, i_82_, i_83_, i_84_, 1, i_85_);
	}

	final void method9606() {
		((Class106_Sub3) this).aBool10470 = false;
	}

	Class250 method9607() {
		return ((Class106_Sub3) this).aClass250_10389;
	}

	Class261 method9608() {
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400) {
			if (!((Class106_Sub3) this).aBool10470) {
				((Class106_Sub3) this).aClass261_10375.method3568(((Class106_Sub3) this).aClass261_10523);
				((Class106_Sub3) this).aClass261_10375.method3584(((Class106_Sub3) this).aClass261_10412);
				((Class106_Sub3) this).aClass250_10396.method3446(((Class106_Sub3) this).aClass261_10375);
				((Class106_Sub3) this).aBool10470 = true;
			}
			return ((Class106_Sub3) this).aClass261_10375;
		}
		return ((Class106_Sub3) this).aClass261_10523;
	}

	Class250 method9609() {
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400) {
			if (!((Class106_Sub3) this).aBool10470)
				method9608();
			return ((Class106_Sub3) this).aClass250_10396;
		}
		return ((Class106_Sub3) this).aClass250_10389;
	}

	abstract void method9610();

	public void method2050() {
		if (((Class106_Sub3) this).aClass290_10384 != null)
			((Class106_Sub3) this).aClass290_10384.method3925();
	}

	final void method9611() {
		if (((Class106_Sub3) this).aClass353_10404 != Class353.aClass353_4401) {
			Class353 class353 = ((Class106_Sub3) this).aClass353_10404;
			((Class106_Sub3) this).aClass353_10404 = Class353.aClass353_4401;
			if (class353 == Class353.aClass353_4400)
				method9606();
			((Class106_Sub3) this).aClass250_10411 = ((Class106_Sub3) this).aClass250_10410;
			method9822();
			method9601();
			((Class106_Sub3) this).anInt10539 &= ~0xf;
		}
	}

	final void method9612() {
		if (((Class106_Sub3) this).aClass353_10404 != Class353.aClass353_4402) {
			Class353 class353 = ((Class106_Sub3) this).aClass353_10404;
			((Class106_Sub3) this).aClass353_10404 = Class353.aClass353_4402;
			if (class353 == Class353.aClass353_4400)
				method9606();
			method9615();
			((Class106_Sub3) this).aClass250_10411 = ((Class106_Sub3) this).aClass250_10406;
			method9822();
			method9601();
			((Class106_Sub3) this).anInt10539 &= ~0x8;
		}
	}

	final void method9613() {
		if (((Class106_Sub3) this).aClass353_10404 != Class353.aClass353_4400) {
			((Class106_Sub3) this).aClass353_10404 = Class353.aClass353_4400;
			method9606();
			method9616();
			((Class106_Sub3) this).aClass250_10411 = ((Class106_Sub3) this).aClass250_10409;
			method9822();
			method9601();
			((Class106_Sub3) this).anInt10539 &= ~0x7;
		}
	}

	final void method9614() {
		((Class106_Sub3) this).aBool10408 = false;
		method9616();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9822();
	}

	final void method9615() {
		if (!((Class106_Sub3) this).aBool10447) {
			int i;
			int i_86_;
			if (aClass104_1410 != null) {
				i_86_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_86_ = 0;
			}
			Class250 class250 = ((Class106_Sub3) this).aClass250_10406;
			if (i_86_ != 0 && i != 0)
				class250.method3441(0.0F, (float) i_86_, 0.0F, (float) i, -1.0F, 1.0F);
			else
				class250.method3444();
			((Class106_Sub3) this).aClass250_10379.method3442(class250);
			method9796(((Class106_Sub3) this).aClass250_10379);
			((Class106_Sub3) this).aBool10447 = true;
		}
	}

	final void method9616() {
		if (!((Class106_Sub3) this).aBool10408)
			((Class106_Sub3) this).aBool10408 = true;
	}

	public final boolean method1818() {
		return true;
	}

	public void method1998(float f, float f_87_, float f_88_, float[] fs) {
		float f_89_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * f_87_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * f_88_));
		float f_90_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * f_87_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * f_88_));
		if (f_89_ < -f_90_ || f_89_ > f_90_) {
			float[] fs_91_ = fs;
			float[] fs_92_ = fs;
			fs[2] = Float.NaN;
			fs_92_[1] = Float.NaN;
			fs_91_[0] = Float.NaN;
		} else {
			float f_93_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * f) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * f_87_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * f_88_));
			if (f_93_ < -f_90_ || f_93_ > f_90_) {
				float[] fs_94_ = fs;
				float[] fs_95_ = fs;
				fs[2] = Float.NaN;
				fs_95_[1] = Float.NaN;
				fs_94_[0] = Float.NaN;
			} else {
				float f_96_ = ((((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13]) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1]) * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5]) * f_87_ + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9]) * f_88_);
				if (f_96_ < -f_90_ || f_96_ > f_90_) {
					float[] fs_97_ = fs;
					float[] fs_98_ = fs;
					fs[2] = Float.NaN;
					fs_98_[1] = Float.NaN;
					fs_97_[0] = Float.NaN;
				} else {
					float f_99_ = (aClass250_10392.aFloatArray2728[14] + aClass250_10392.aFloatArray2728[2] * f + aClass250_10392.aFloatArray2728[6] * f_87_ + aClass250_10392.aFloatArray2728[10] * f_88_);
					fs[0] = (((Class106_Sub3) this).aFloat10416 + (((Class106_Sub3) this).aFloat10417 * f_93_ / f_90_));
					fs[1] = (((Class106_Sub3) this).aFloat10407 + (((Class106_Sub3) this).aFloat10419 * f_96_ / f_90_));
					fs[2] = f_99_;
				}
			}
		}
	}

	final void method9617(boolean bool) {
		if (bool != aBool10442) {
			aBool10442 = bool;
			method9588();
			((Class106_Sub3) this).anInt10539 &= ~0xf;
		}
	}

	final void method9618(boolean bool) {
		if (bool != aBool10441) {
			aBool10441 = bool;
			method9620();
			((Class106_Sub3) this).anInt10539 &= ~0xf;
		}
	}

	public abstract Class406 method9619(String string);

	abstract void method9620();

	public void method2035(float f, float f_100_, float f_101_, float[] fs) {
		float f_102_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * f_100_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * f_101_));
		float f_103_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * f_100_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * f_101_));
		float f_104_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * f_100_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * f_101_));
		float f_105_ = (aClass250_10392.aFloatArray2728[14] + aClass250_10392.aFloatArray2728[2] * f + aClass250_10392.aFloatArray2728[6] * f_100_ + aClass250_10392.aFloatArray2728[10] * f_101_);
		fs[0] = (((Class106_Sub3) this).aFloat10416 + ((Class106_Sub3) this).aFloat10417 * f_103_ / f_102_);
		fs[1] = (((Class106_Sub3) this).aFloat10407 + ((Class106_Sub3) this).aFloat10419 * f_104_ / f_102_);
		fs[2] = f_105_;
	}

	public void method1981(float f, float f_106_, float f_107_, float f_108_, float f_109_) {
		Class351_Sub2.aFloat9732 = f;
		Class351_Sub2.aFloat9736 = f_106_;
		Class351_Sub2.aFloat9737 = f_107_;
		Class351_Sub2.aFloat9738 = f_108_;
		Class351_Sub2.aFloat9739 = f_109_;
	}

	boolean method1737(int i, int i_110_, int i_111_, int i_112_, Class261 class261, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		return class326.method4147(i, i_110_, i_111_, i_112_, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	Class352 method9621() {
		if (((Class106_Sub3) this).aClass290_10384 == null)
			return Class352.aClass352_4397;
		return ((Class106_Sub3) this).aClass290_10384.method3932();
	}

	final void method9622(int i) {
		if (anInt10506 != i) {
			anInt10506 = i;
			method9665();
		}
	}

	final void method9623() {
		((Class106_Sub3) this).anInterface44_10527 = method9723(true);
		((Class106_Sub3) this).anInterface44_10527.method259(24, 12);
		((Class106_Sub3) this).aClass362_10530 = method9672(new Class354[] { new Class354(Class364.aClass364_4472) });
	}

	public final void method1709(float f) {
		if (aFloat10458 != f) {
			aFloat10458 = f;
			method9594();
			method9627();
		}
	}

	public void method1999(float f, float f_113_, float f_114_, float[] fs) {
		float f_115_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * f_113_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * f_114_));
		float f_116_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * f_113_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * f_114_));
		if (f_115_ < -f_116_ || f_115_ > f_116_) {
			float[] fs_117_ = fs;
			float[] fs_118_ = fs;
			fs[2] = Float.NaN;
			fs_118_[1] = Float.NaN;
			fs_117_[0] = Float.NaN;
		} else {
			float f_119_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * f) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * f_113_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * f_114_));
			if (f_119_ < -f_116_ || f_119_ > f_116_) {
				float[] fs_120_ = fs;
				float[] fs_121_ = fs;
				fs[2] = Float.NaN;
				fs_121_[1] = Float.NaN;
				fs_120_[0] = Float.NaN;
			} else {
				float f_122_ = ((((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13]) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1]) * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5]) * f_113_ + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9]) * f_114_);
				if (f_122_ < -f_116_ || f_122_ > f_116_) {
					float[] fs_123_ = fs;
					float[] fs_124_ = fs;
					fs[2] = Float.NaN;
					fs_124_[1] = Float.NaN;
					fs_123_[0] = Float.NaN;
				} else {
					float f_125_ = (aClass250_10392.aFloatArray2728[14] + aClass250_10392.aFloatArray2728[2] * f + aClass250_10392.aFloatArray2728[6] * f_113_ + aClass250_10392.aFloatArray2728[10] * f_114_);
					fs[0] = (((Class106_Sub3) this).aFloat10416 + (((Class106_Sub3) this).aFloat10417 * f_119_ / f_116_));
					fs[1] = (((Class106_Sub3) this).aFloat10407 + (((Class106_Sub3) this).aFloat10419 * f_122_ / f_116_));
					fs[2] = f_125_;
				}
			}
		}
	}

	public final void method1995(int i, int i_126_, float f, int i_127_, int i_128_, float f_129_, int i_130_, int i_131_, float f_132_, int i_133_, int i_134_, int i_135_, int i_136_) {
		/* empty */
	}

	abstract void method9624();

	abstract Interface46 method9625(boolean bool);

	public void method1885(int i) {
		if (((Class106_Sub3) this).aClass360_10487 != null)
			((Class106_Sub3) this).aClass360_10487.method4446();
		anInt10512 = i & 0x7fffffff;
	}

	abstract void method9626();

	abstract void method9627();

	public final void method1760(Class105 class105) {
		((Class106_Sub3) this).aClass366_10515.method4490(this, class105);
	}

	public final void method9628(Class295 class295) {
		aClass295Array10436[anInt10367] = class295;
		method9654();
	}

	abstract void method9629();

	abstract boolean method9630(Class171 class171, Class88 class88);

	abstract boolean method9631(Class171 class171, Class88 class88);

	boolean method1907(int i, int i_137_, int i_138_, int i_139_, Class261 class261, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		return class326.method4147(i, i_137_, i_138_, i_139_, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	public abstract Class406 method9632(String string);

	final Interface43 method9633(Class171 class171, int i, int i_140_, boolean bool, float[] fs) {
		return method9635(class171, i, i_140_, bool, fs, 0, 0);
	}

	abstract Interface43 method9634(Class171 class171, Class88 class88, int i, int i_141_);

	abstract Interface43 method9635(Class171 class171, int i, int i_142_, boolean bool, float[] fs, int i_143_, int i_144_);

	abstract Interface43 method9636(int i, int i_145_, boolean bool, int[] is, int i_146_, int i_147_);

	public abstract boolean method9637();

	abstract Interface40 method9638(Class171 class171, int i, int i_148_, int i_149_, boolean bool, byte[] is);

	abstract Interface45 method9639(Class171 class171, Class88 class88, int i, int i_150_);

	public final int method9640() {
		return anInt10367;
	}

	public final void method9641(int i) {
		if (anInt10367 != i) {
			anInt10367 = i;
			method9656();
		}
	}

	public void method1801(boolean bool) {
		((Class106_Sub3) this).aBool10476 = bool;
	}

	public abstract void method9642();

	public final void method9643(int i) {
		switch (i) {
			case 4:
				method9644(Class373.aClass373_4544, Class373.aClass373_4544);
				break;
			case 0:
				method9644(Class373.aClass373_4541, Class373.aClass373_4541);
				break;
			case 2:
				method9644(Class373.aClass373_4543, Class373.aClass373_4542);
				break;
			case 1:
				method9644(Class373.aClass373_4542, Class373.aClass373_4542);
				break;
			case 3:
				method9644(Class373.aClass373_4545, Class373.aClass373_4541);
				break;
		}
	}

	public final void method9644(Class373 class373, Class373 class373_151_) {
		boolean bool = false;
		if (aClass373Array10403[anInt10367] != class373) {
			aClass373Array10403[anInt10367] = class373;
			method9691();
			bool = true;
		}
		if (aClass373Array10469[anInt10367] != class373_151_) {
			aClass373Array10469[anInt10367] = class373_151_;
			method9657();
			bool = true;
		}
		if (bool)
			((Class106_Sub3) this).anInt10539 &= ~0xd;
	}

	public final void method9645(int i, Class293 class293) {
		method9646(i, class293, false, false);
	}

	abstract void method9646(int i, Class293 class293, boolean bool, boolean bool_152_);

	public final void method9647(int i, Class293 class293) {
		method9648(i, class293, false);
	}

	abstract void method9648(int i, Class293 class293, boolean bool);

	public void method9649(int i) {
		if (i != anInt10471) {
			anInt10471 = i;
			method9655();
		}
	}

	final Class250 method9650() {
		return aClass250Array10486[anInt10367];
	}

	public final Class250 method9651() {
		return aClass250Array10486[anInt10367];
	}

	public abstract void method9652(Class379 class379, int i, int i_153_, int i_154_, int i_155_);

	final void method9653() {
		if (aClass295Array10436[anInt10367] != Class295.aClass295_3462) {
			aClass295Array10436[anInt10367] = Class295.aClass295_3462;
			aClass250Array10486[anInt10367].method3444();
			method9654();
		}
	}

	final void method9654() {
		method9701();
	}

	abstract void method9655();

	public final Model method1695(Class159 class159, int i, int i_156_, int i_157_, int i_158_) {
		return new AbstractModel(this, class159, i, i_157_, i_158_, i_156_);
	}

	abstract void method9656();

	static {
		aClass250_10397 = new Class250();
	}

	abstract void method9657();

	Class86 method9658() {
		return ((Class106_Sub3) this).aClass86_10395;
	}

	public final void method9659(Interface34 interface34) {
		if (((Class106_Sub3) this).anInterface34Array10413[anInt10367] != interface34) {
			((Class106_Sub3) this).anInterface34Array10413[anInt10367] = interface34;
			if (interface34 != null)
				interface34.method202();
			else
				anInterface43_10474.method202();
			((Class106_Sub3) this).anInt10539 &= ~0x1;
		}
	}

	public abstract void method9660(Class379 class379, int i, int i_159_);

	public final void method1791() {
		((Class106_Sub3) this).aBool10494 = false;
	}

	public void method9661(int i) {
		if (i > ((Class106_Sub3) this).anInt10381) {
			((Class106_Sub3) this).anInt10381 = i;
			aByteBuffer10378 = ByteBuffer.allocateDirect(((Class106_Sub3) this).anInt10381);
			aByteBuffer10378.order(ByteOrder.nativeOrder());
			aLong10444 = DirectBufferHelper.getDirectBufferAddress(aByteBuffer10378);
		}
	}

	final void method9662(byte i) {
		if (aByte10510 != i) {
			aByte10510 = i;
			if (i == 0) {
				method9622(0);
				method9591(1);
			} else {
				method9622(3);
				method9591(3);
			}
			method9664();
		}
	}

	final Class250 method9663() {
		return aClass250_10528;
	}

	abstract void method9664();

	abstract void method9665();

	abstract void method9666();

	public final void method1740(Class572_Sub35 class572_sub35) {
		((Class106_Sub3) this).aNativeHeap10390 = (((Class572_Sub35_Sub1) (Class572_Sub35_Sub1) class572_sub35).aNativeHeap10966);
	}

	final void method9667() {
		if (((Class106_Sub3) this).aClass349_10478 != null)
			((Class106_Sub3) this).aClass349_10478.method4355();
		method9668();
	}

	abstract void method9668();

	abstract void method9669();

	abstract void method9670(boolean bool);

	abstract Interface46 method9671(boolean bool);

	abstract Class362 method9672(Class354[] class354s);

	public abstract void method9673(Class362 class362);

	public abstract void method9674(int i, Interface44 interface44);

	public final void method2029(int i, Class167 class167, int i_160_, int i_161_) {
		method1763(false);
		((Class106_Sub3) this).aClass161_Sub1_10475.method2610(0.0F, 0.0F, (float) method1683(304712726).method1648(), 0.0F, 0.0F, (float) method1683(-153375990).method1646(), 0, class167, i_160_, i_161_);
		method1763(true);
	}

	public final void method1725(int i, int i_162_, int i_163_, int i_164_, int i_165_, int i_166_) {
		if (aBool10522 && anInt10511 != 0)
			method9670(false);
		if (aBool10536) {
			method1763(false);
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_162_, i_163_, i_164_, 0, i_165_, i_166_);
			method1763(true);
		} else
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_162_, i_163_, i_164_, 0, i_165_, i_166_);
		if (aBool10522 && anInt10511 != 0)
			method9670(true);
	}

	public final void method1777(int i, int i_167_) {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4471(i, i_167_);
	}

	public final void method1670(int i, int i_168_, float f, int i_169_, int i_170_, float f_171_, int i_172_, int i_173_, float f_174_, int i_175_, int i_176_, int i_177_, int i_178_) {
		/* empty */
	}

	final void method1727(int i, int i_179_, int i_180_, int i_181_, int i_182_) {
		/* empty */
	}

	abstract void method9675();

	final void method1678(int i, int i_183_, int i_184_, int i_185_, int i_186_) {
		method1730(i, i_183_, i, i_183_ + i_184_, i_185_, i_186_);
	}

	public final void method1730(int i, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_) {
		method1950(i, i_187_, i_188_, i_189_, i_190_, 1, i_191_);
	}

	public void method1732(int i, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_) {
		float f = (float) i_193_ - (float) i;
		float f_200_ = (float) i_194_ - (float) i_192_;
		if (f == 0.0F && f_200_ == 0.0F)
			f = 1.0F;
		else {
			float f_201_ = (float) (1.0 / Math.sqrt((double) (f * f + f_200_ * f_200_)));
			f *= f_201_;
			f_200_ *= f_201_;
		}
		method9612();
		Class349 class349 = ((Class106_Sub3) this).aClass349Array10479[13];
		class349.method4348();
		class349.method4350(i_195_);
		method9591(i_196_);
		class349.method4354();
		method9670(false);
		i_199_ %= i_198_ + i_197_;
		float f_202_ = f * (float) i_197_;
		float f_203_ = f_200_ * (float) i_197_;
		float f_204_ = 0.0F;
		float f_205_ = 0.0F;
		float f_206_ = f_202_;
		float f_207_ = f_203_;
		if (i_199_ > i_197_) {
			f_204_ = f * (float) (i_197_ + i_198_ - i_199_);
			f_205_ = f_200_ * (float) (i_197_ + i_198_ - i_199_);
		} else {
			f_206_ = f * (float) (i_197_ - i_199_);
			f_207_ = f_200_ * (float) (i_197_ - i_199_);
		}
		float f_208_ = (float) i + f_204_;
		float f_209_ = (float) i_192_ + f_205_;
		float f_210_ = f * (float) i_198_;
		float f_211_ = f_200_ * (float) i_198_;
		for (;;) {
			if (i_193_ > i) {
				if (f_208_ > (float) i_193_)
					break;
				if (f_208_ + f_206_ > (float) i_193_)
					f_206_ = (float) i_193_ - f_208_;
			} else {
				if (f_208_ < (float) i_193_)
					break;
				if (f_208_ + f_206_ < (float) i_193_)
					f_206_ = (float) i_193_ - f_208_;
			}
			if (i_194_ > i_192_) {
				if (f_209_ > (float) i_194_)
					break;
				if (f_209_ + f_207_ > (float) i_194_)
					f_207_ = (float) i_194_ - f_209_;
			} else {
				if (f_209_ < (float) i_194_)
					break;
				if (f_209_ + f_207_ < (float) i_194_)
					f_207_ = (float) i_194_ - f_209_;
			}
			if (!method9587(f_208_, f_209_, 0.0F, f_208_ + f_206_, f_209_ + f_207_, 0.0F))
				return;
			method9678();
			f_208_ += f_210_ + f_206_;
			f_209_ += f_211_ + f_207_;
			f_206_ = f_202_;
			f_207_ = f_203_;
		}
		method9670(true);
		class349.method4352();
	}

	public void method1943(int i, int i_212_, int i_213_, int i_214_, int i_215_, int i_216_, Class167 class167, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_) {
		/* empty */
	}

	abstract void method9676();

	public final void method1950(int i, int i_222_, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_) {
		i += 1.0F;
		i_222_ += 1.0F;
		i_223_ += 1.0F;
		i_224_ += 1.0F;
		float f = (float) (i_223_ - i);
		float f_228_ = (float) (i_224_ - i_222_);
		float f_229_ = 1.0F / (float) Math.sqrt((double) (f * f + f_228_ * f_228_));
		f *= f_229_;
		f_228_ *= f_229_;
		i -= f;
		i_222_ -= f_228_;
		float f_230_ = -f_228_;
		float f_231_ = f;
		f_230_ *= 0.5F * (float) i_226_;
		f_231_ *= 0.5F * (float) i_226_;
		((Class106_Sub3) this).aClass161_Sub1_10540.method2650((float) i - f_230_, (float) i_222_ - f_231_, (float) i_223_ - f_230_, (float) i_224_ - f_231_, (float) i + f_230_, (float) i_222_ + f_231_, 0, i_225_, i_227_);
	}

	public abstract void method9677(Class379 class379, int i, int i_232_, int i_233_, int i_234_);

	final void method9678() {
		method9674(0, ((Class106_Sub3) this).anInterface44_10527);
		method9673(((Class106_Sub3) this).aClass362_10530);
		method9660(Class379.aClass379_4590, 0, 1);
	}

	public final void method9679() {
		method9712(Class379.aClass379_4589, 2);
	}

	abstract void method9680(int i);

	final void method9681() {
		((Class106_Sub3) this).aClass250_10495.method3442(aClass250_10392);
		((Class106_Sub3) this).aClass250_10495.method3445(((Class106_Sub3) this).aClass250_10409);
		((Class106_Sub3) this).aClass250_10495.method3459(((Class106_Sub3) this).aFloatArrayArray10405[0]);
		((Class106_Sub3) this).aClass250_10495.method3460(((Class106_Sub3) this).aFloatArrayArray10405[1]);
		((Class106_Sub3) this).aClass250_10495.method3455(((Class106_Sub3) this).aFloatArrayArray10405[2]);
		((Class106_Sub3) this).aClass250_10495.method3475(((Class106_Sub3) this).aFloatArrayArray10405[3]);
		((Class106_Sub3) this).aClass250_10495.method3457(((Class106_Sub3) this).aFloatArrayArray10405[4]);
		((Class106_Sub3) this).aClass250_10495.method3456(((Class106_Sub3) this).aFloatArrayArray10405[5]);
		aClass250_10414.method3442(((Class106_Sub3) this).aClass250_10495);
		method9796(aClass250_10414);
	}

	abstract void method9682(Interface46 interface46, Class379 class379, int i, int i_235_, int i_236_, int i_237_);

	abstract void method9683();

	public final void method9684() {
		if (((Class106_Sub3) this).anInt10539 != 2) {
			method9612();
			method9847(false);
			method9596(false);
			method9617(false);
			method9618(false);
			method9591(1);
			method9662((byte) 0);
			((Class106_Sub3) this).anInt10539 = 2;
		}
	}

	final void method9685() {
		if (((Class106_Sub3) this).anInt10539 != 8) {
			method9613();
			method9847(true);
			method9617(true);
			method9618(true);
			method9591(1);
			method9662((byte) 0);
			((Class106_Sub3) this).anInt10539 = 8;
		}
	}

	abstract void method9686(int i);

	public final void method1961(int i, int i_238_, int i_239_) {
		if (anInt10500 != i || anInt10448 != i_238_ || anInt10398 != i_239_) {
			anInt10500 = i;
			anInt10448 = i_238_;
			anInt10398 = i_239_;
			method9667();
			method9669();
		}
	}

	void method9687() {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4468();
		if (((Class106_Sub3) this).aClass351Array10491 != null) {
			for (int i = 0; i < ((Class106_Sub3) this).aClass351Array10491.length; i++) {
				if (((Class106_Sub3) this).aClass351Array10491[i] != null && ((Class106_Sub3) this).aClass351Array10491[i].method4384())
					((Class106_Sub3) this).aClass351Array10491[i].method4376();
			}
		}
		((Class106_Sub3) this).aClass366_10515 = new Class366(this);
		method9584();
		method9623();
		method9586();
		((Class106_Sub3) this).aClass366_10515.method4489(this);
		if (aBool10519)
			((Class106_Sub3) this).aClass290_10384 = new Class290(this, 1024);
	}

	void method1802() {
		if (!((Class106_Sub3) this).aBool10514) {
			method9583();
			((Class106_Sub3) this).aClass360_10487.method4447();
			for (Class572 class572 = ((Class106_Sub3) this).aClass675_10432.method7932((byte) 50); class572 != null; class572 = ((Class106_Sub3) this).aClass675_10432.method7926(780509103))
				((Class572_Sub35_Sub1) class572).method10065();
			Class472.method5585(false, true, (byte) -79);
			for (int i = 0; i < ((Class106_Sub3) this).aClass349Array10479.length; i++) {
				if (((Class106_Sub3) this).aClass349Array10479[i] != null) {
					((Class106_Sub3) this).aClass349Array10479[i].method4363();
					((Class106_Sub3) this).aClass349Array10479[i] = null;
				}
			}
			for (int i = 0; i < ((Class106_Sub3) this).aClass351Array10491.length; i++) {
				if (((Class106_Sub3) this).aClass351Array10491[i] != null) {
					((Class106_Sub3) this).aClass351Array10491[i].method4385();
					((Class106_Sub3) this).aClass351Array10491[i] = null;
				}
			}
			method9574();
			method1668(0);
			((Class106_Sub3) this).aBool10514 = true;
		}
	}

	void method9688() {
		method9598();
		method9614();
		method9611();
		method1975();
		method1714();
	}

	public final int method2045() {
		return anInt10386 + anInt10385 + anInt10387;
	}

	public final void method2010() {
		if (aClass104_1410 != null) {
			anInt10426 = 0;
			anInt10428 = 0;
			anInt10429 = aClass104_1410.method1648();
			anInt10427 = aClass104_1410.method1646();
		} else {
			anInt10427 = 0;
			anInt10429 = 0;
			anInt10426 = 0;
			anInt10428 = 0;
		}
		if (aBool10541) {
			aBool10541 = false;
			method9694();
		}
	}

	abstract Interface44 method9689(boolean bool);

	public final boolean method1977() {
		return true;
	}

	abstract Interface46 method9690(boolean bool);

	public final Class167 method1749(int i, int i_240_, int[] is, int[] is_241_) {
		return Class167_Sub3.method10061(this, i, i_240_, is, is_241_);
	}

	public final boolean method1769() {
		return true;
	}

	public final boolean method1814() {
		return true;
	}

	abstract void method9691();

	public final boolean method1816() {
		return ((Class106_Sub3) this).aClass351Array10491[3] != null;
	}

	public void method1890(int i, int i_242_, int i_243_, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_) {
		float f = (float) i_243_ - (float) i;
		float f_250_ = (float) i_244_ - (float) i_242_;
		if (f == 0.0F && f_250_ == 0.0F)
			f = 1.0F;
		else {
			float f_251_ = (float) (1.0 / Math.sqrt((double) (f * f + f_250_ * f_250_)));
			f *= f_251_;
			f_250_ *= f_251_;
		}
		method9612();
		Class349 class349 = ((Class106_Sub3) this).aClass349Array10479[13];
		class349.method4348();
		class349.method4350(i_245_);
		method9591(i_246_);
		class349.method4354();
		method9670(false);
		i_249_ %= i_248_ + i_247_;
		float f_252_ = f * (float) i_247_;
		float f_253_ = f_250_ * (float) i_247_;
		float f_254_ = 0.0F;
		float f_255_ = 0.0F;
		float f_256_ = f_252_;
		float f_257_ = f_253_;
		if (i_249_ > i_247_) {
			f_254_ = f * (float) (i_247_ + i_248_ - i_249_);
			f_255_ = f_250_ * (float) (i_247_ + i_248_ - i_249_);
		} else {
			f_256_ = f * (float) (i_247_ - i_249_);
			f_257_ = f_250_ * (float) (i_247_ - i_249_);
		}
		float f_258_ = (float) i + f_254_;
		float f_259_ = (float) i_242_ + f_255_;
		float f_260_ = f * (float) i_248_;
		float f_261_ = f_250_ * (float) i_248_;
		for (;;) {
			if (i_243_ > i) {
				if (f_258_ > (float) i_243_)
					break;
				if (f_258_ + f_256_ > (float) i_243_)
					f_256_ = (float) i_243_ - f_258_;
			} else {
				if (f_258_ < (float) i_243_)
					break;
				if (f_258_ + f_256_ < (float) i_243_)
					f_256_ = (float) i_243_ - f_258_;
			}
			if (i_244_ > i_242_) {
				if (f_259_ > (float) i_244_)
					break;
				if (f_259_ + f_257_ > (float) i_244_)
					f_257_ = (float) i_244_ - f_259_;
			} else {
				if (f_259_ < (float) i_244_)
					break;
				if (f_259_ + f_257_ < (float) i_244_)
					f_257_ = (float) i_244_ - f_259_;
			}
			if (!method9587(f_258_, f_259_, 0.0F, f_258_ + f_256_, f_259_ + f_257_, 0.0F))
				return;
			method9678();
			f_258_ += f_260_ + f_256_;
			f_259_ += f_261_ + f_257_;
			f_256_ = f_252_;
			f_257_ = f_253_;
		}
		method9670(true);
		class349.method4352();
	}

	public static void method9692() throws Exception_Sub7 {
		Class597.method7040(-761495061).method421("jaclib", (byte) 37);
	}

	public void method1738(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		class90.method1511(class326, ((Class106_Sub3) this).aClass250_10409, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	public final boolean method1986() {
		return (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384());
	}

	abstract void method9693(Interface46 interface46);

	public final boolean method1822() {
		return aBool10522;
	}

	public final boolean method1941() {
		return aBool10522;
	}

	public final boolean method1903() {
		return true;
	}

	public final boolean method1825() {
		return true;
	}

	abstract void method9694();

	public final boolean method1921() {
		return false;
	}

	public final boolean method1996() {
		return false;
	}

	public abstract String method1964();

	public abstract String method1829();

	void method9695() {
		method9831();
	}

	public final void method1985(boolean bool) {
		aBool10536 = bool;
		method9620();
	}

	public final boolean method1820() {
		return true;
	}

	public final void method1783(int i) {
		((Class106_Sub3) this).shadowScale = 0;
		for (/**/; i > 1; i >>= 1)
			((Class106_Sub3) this).shadowScale++;
		((Class106_Sub3) this).anInt10460 = 1 << ((Class106_Sub3) this).shadowScale;
	}

	abstract void method9696();

	final void method9697() {
		((Class106_Sub3) this).aClass337_10382 = new Class337(this);
		aBool10488 = false;
		try {
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub2(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub1(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub1(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub1(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), false);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), true);
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = new Class349_Sub1_Sub2(this, (((Class106_Sub3) this).aClass337_10382));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub1(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub2(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub2(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub2(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = null;
			aBool10488 = true;
		}
		if (!aBool10488) {
			int i;
			int i_262_;
			if (aClass104_1410 != null) {
				i_262_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_262_ = 0;
			}
			((Class106_Sub3) this).aClass363_10391 = new Class363(this, i_262_, i);
			((Class106_Sub3) this).aClass351Array10491[3] = new Class351_Sub1(this);
			((Class106_Sub3) this).aClass351Array10491[1] = new Class351_Sub2(this);
			((Class106_Sub3) this).aClass351Array10491[2] = new Class351_Sub3(this);
			if (((Class106_Sub3) this).aClass351Array10491[3].method4373())
				((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]);
			method9593();
			method9595();
		}
		if (((Class106_Sub3) this).aClass349_10478 != null) {
			((Class106_Sub3) this).aClass349_10478.method4352();
			((Class106_Sub3) this).aClass349_10478 = null;
		}
		method9687();
	}

	public void method1866() {
		((Class106_Sub3) this).anInt10468 = 0;
		((Class106_Sub3) this).anInt10431 = 0;
		((Class106_Sub3) this).anInt10518 = aClass104_1410.method1648();
		((Class106_Sub3) this).anInt10433 = aClass104_1410.method1646();
		method9601();
	}

	public void method1867() {
		((Class106_Sub3) this).anInt10468 = 0;
		((Class106_Sub3) this).anInt10431 = 0;
		((Class106_Sub3) this).anInt10518 = aClass104_1410.method1648();
		((Class106_Sub3) this).anInt10433 = aClass104_1410.method1646();
		method9601();
	}

	public void method1784(int i, int i_263_, int i_264_, int i_265_) {
		((Class106_Sub3) this).anInt10468 = i;
		((Class106_Sub3) this).anInt10431 = i_263_;
		((Class106_Sub3) this).anInt10518 = i_264_;
		((Class106_Sub3) this).anInt10433 = i_265_;
		method9601();
	}

	abstract void method9698();

	public void method1871(float f, float f_266_) {
		((Class106_Sub3) this).aFloat10422 = f;
		((Class106_Sub3) this).aFloat10423 = f_266_;
		method9601();
	}

	public final void method1735(int i, int i_267_, int i_268_, int i_269_) {
		int i_270_;
		int i_271_;
		if (aClass104_1410 != null) {
			i_271_ = aClass104_1410.method1648();
			i_270_ = aClass104_1410.method1646();
		} else {
			i_270_ = 0;
			i_271_ = 0;
		}
		if (i <= 0 && i_268_ >= i_271_ - 1 && i_267_ <= 0 && i_269_ >= i_270_ - 1)
			method1714();
		else {
			anInt10428 = i >= 0 ? i : 0;
			anInt10429 = i_268_ <= i_271_ ? i_268_ : i_271_;
			anInt10426 = i_267_ >= 0 ? i_267_ : 0;
			anInt10427 = i_269_ <= i_270_ ? i_269_ : i_270_;
			if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
				aBool10541 = true;
				method9694();
			}
			if (aBool10541)
				method9675();
		}
	}

	public void method1748() {
		if (((Class106_Sub3) this).aClass290_10384 != null)
			((Class106_Sub3) this).aClass290_10384.method3931();
	}

	public final void method1875(int i, int i_272_, int i_273_, int i_274_, int i_275_, int i_276_) {
		i_273_--;
		i_274_--;
		int i_277_ = 0;
		if (this instanceof Class106_Sub3_Sub2)
			i_277_ = -1;
		if (aBool10522 && anInt10511 != 0)
			method9670(false);
		method1730(i, i_272_ + i_277_, i + i_273_, i_272_ + i_277_, i_275_, i_276_);
		method1730(i, i_272_ + i_274_ + i_277_, i + i_273_, i_272_ + i_274_ + i_277_, i_275_, i_276_);
		method1730(i, i_272_, i, i_272_ + i_274_, i_275_, i_276_);
		method1730(i + i_273_, i_272_, i + i_273_, i_272_ + i_274_, i_275_, i_276_);
		if (aBool10522 && anInt10511 != 0)
			method9670(true);
	}

	public boolean method1779() {
		return (((Class106_Sub3) this).aClass351Array10491[1] != null && ((Class106_Sub3) this).aClass351Array10491[1].method4384());
	}

	public final void method1663(int i, int i_278_, int i_279_, int i_280_, int i_281_, int i_282_) {
		if (aBool10522 && anInt10511 != 0)
			method9670(false);
		if (aBool10536) {
			method1763(false);
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_278_, i_279_, i_280_, 0, i_281_, i_282_);
			method1763(true);
		} else
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_278_, i_279_, i_280_, 0, i_281_, i_282_);
		if (aBool10522 && anInt10511 != 0)
			method9670(true);
	}

	public final void method1878(int i, int i_283_, int i_284_, int i_285_, int i_286_, int i_287_) {
		if (aBool10522 && anInt10511 != 0)
			method9670(false);
		if (aBool10536) {
			method1763(false);
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_283_, i_284_, i_285_, 0, i_286_, i_287_);
			method1763(true);
		} else
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_283_, i_284_, i_285_, 0, i_286_, i_287_);
		if (aBool10522 && anInt10511 != 0)
			method9670(true);
	}

	final void method1721(int i, int i_288_, int i_289_, int i_290_, int i_291_) {
		/* empty */
	}

	public void method1976(float f, float f_292_, float f_293_, float f_294_, float f_295_) {
		Class351_Sub2.aFloat9732 = f;
		Class351_Sub2.aFloat9736 = f_292_;
		Class351_Sub2.aFloat9737 = f_293_;
		Class351_Sub2.aFloat9738 = f_294_;
		Class351_Sub2.aFloat9739 = f_295_;
	}

	abstract void method9699();

	abstract void method9700();

	final void method1883(int i, int i_296_, int i_297_, int i_298_, int i_299_) {
		method1730(i, i_296_, i, i_296_ + i_297_, i_298_, i_299_);
	}

	abstract void method9701();

	final void method1800(int i, int i_300_, int i_301_, int i_302_, int i_303_) {
		method1730(i, i_300_, i, i_300_ + i_301_, i_302_, i_303_);
	}

	final void method2013(int i, int i_304_, int i_305_, int i_306_, int i_307_) {
		method1730(i, i_304_, i + i_305_, i_304_, i_306_, i_307_);
	}

	public final void method1887(int i, int i_308_, int i_309_, int i_310_, int i_311_, int i_312_) {
		method1950(i, i_308_, i_309_, i_310_, i_311_, 1, i_312_);
	}

	public final void method1979(int i, int i_313_, int i_314_, int i_315_, int i_316_, int i_317_) {
		method1950(i, i_313_, i_314_, i_315_, i_316_, 1, i_317_);
	}

	public void method1889(int i, int i_318_, int i_319_, int i_320_, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_) {
		float f = (float) i_319_ - (float) i;
		float f_326_ = (float) i_320_ - (float) i_318_;
		if (f == 0.0F && f_326_ == 0.0F)
			f = 1.0F;
		else {
			float f_327_ = (float) (1.0 / Math.sqrt((double) (f * f + f_326_ * f_326_)));
			f *= f_327_;
			f_326_ *= f_327_;
		}
		method9612();
		Class349 class349 = ((Class106_Sub3) this).aClass349Array10479[13];
		class349.method4348();
		class349.method4350(i_321_);
		method9591(i_322_);
		class349.method4354();
		method9670(false);
		i_325_ %= i_324_ + i_323_;
		float f_328_ = f * (float) i_323_;
		float f_329_ = f_326_ * (float) i_323_;
		float f_330_ = 0.0F;
		float f_331_ = 0.0F;
		float f_332_ = f_328_;
		float f_333_ = f_329_;
		if (i_325_ > i_323_) {
			f_330_ = f * (float) (i_323_ + i_324_ - i_325_);
			f_331_ = f_326_ * (float) (i_323_ + i_324_ - i_325_);
		} else {
			f_332_ = f * (float) (i_323_ - i_325_);
			f_333_ = f_326_ * (float) (i_323_ - i_325_);
		}
		float f_334_ = (float) i + f_330_;
		float f_335_ = (float) i_318_ + f_331_;
		float f_336_ = f * (float) i_324_;
		float f_337_ = f_326_ * (float) i_324_;
		for (;;) {
			if (i_319_ > i) {
				if (f_334_ > (float) i_319_)
					break;
				if (f_334_ + f_332_ > (float) i_319_)
					f_332_ = (float) i_319_ - f_334_;
			} else {
				if (f_334_ < (float) i_319_)
					break;
				if (f_334_ + f_332_ < (float) i_319_)
					f_332_ = (float) i_319_ - f_334_;
			}
			if (i_320_ > i_318_) {
				if (f_335_ > (float) i_320_)
					break;
				if (f_335_ + f_333_ > (float) i_320_)
					f_333_ = (float) i_320_ - f_335_;
			} else {
				if (f_335_ < (float) i_320_)
					break;
				if (f_335_ + f_333_ < (float) i_320_)
					f_333_ = (float) i_320_ - f_335_;
			}
			if (!method9587(f_334_, f_335_, 0.0F, f_334_ + f_332_, f_335_ + f_333_, 0.0F))
				return;
			method9678();
			f_334_ += f_336_ + f_332_;
			f_335_ += f_337_ + f_333_;
			f_332_ = f_328_;
			f_333_ = f_329_;
		}
		method9670(true);
		class349.method4352();
	}

	public final void method1724(int i, int i_338_, int i_339_, int i_340_, int i_341_, int i_342_) {
		i_339_--;
		i_340_--;
		int i_343_ = 0;
		if (this instanceof Class106_Sub3_Sub2)
			i_343_ = -1;
		if (aBool10522 && anInt10511 != 0)
			method9670(false);
		method1730(i, i_338_ + i_343_, i + i_339_, i_338_ + i_343_, i_341_, i_342_);
		method1730(i, i_338_ + i_340_ + i_343_, i + i_339_, i_338_ + i_340_ + i_343_, i_341_, i_342_);
		method1730(i, i_338_, i, i_338_ + i_340_, i_341_, i_342_);
		method1730(i + i_339_, i_338_, i + i_339_, i_338_ + i_340_, i_341_, i_342_);
		if (aBool10522 && anInt10511 != 0)
			method9670(true);
	}

	public final int method1808() {
		return anInt10386 + anInt10385 + anInt10387;
	}

	public void method1892(int i, int i_344_, int i_345_, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_) {
		float f = (float) i_345_ - (float) i;
		float f_352_ = (float) i_346_ - (float) i_344_;
		if (f == 0.0F && f_352_ == 0.0F)
			f = 1.0F;
		else {
			float f_353_ = (float) (1.0 / Math.sqrt((double) (f * f + f_352_ * f_352_)));
			f *= f_353_;
			f_352_ *= f_353_;
		}
		method9612();
		Class349 class349 = ((Class106_Sub3) this).aClass349Array10479[13];
		class349.method4348();
		class349.method4350(i_347_);
		method9591(i_348_);
		class349.method4354();
		method9670(false);
		i_351_ %= i_350_ + i_349_;
		float f_354_ = f * (float) i_349_;
		float f_355_ = f_352_ * (float) i_349_;
		float f_356_ = 0.0F;
		float f_357_ = 0.0F;
		float f_358_ = f_354_;
		float f_359_ = f_355_;
		if (i_351_ > i_349_) {
			f_356_ = f * (float) (i_349_ + i_350_ - i_351_);
			f_357_ = f_352_ * (float) (i_349_ + i_350_ - i_351_);
		} else {
			f_358_ = f * (float) (i_349_ - i_351_);
			f_359_ = f_352_ * (float) (i_349_ - i_351_);
		}
		float f_360_ = (float) i + f_356_;
		float f_361_ = (float) i_344_ + f_357_;
		float f_362_ = f * (float) i_350_;
		float f_363_ = f_352_ * (float) i_350_;
		for (;;) {
			if (i_345_ > i) {
				if (f_360_ > (float) i_345_)
					break;
				if (f_360_ + f_358_ > (float) i_345_)
					f_358_ = (float) i_345_ - f_360_;
			} else {
				if (f_360_ < (float) i_345_)
					break;
				if (f_360_ + f_358_ < (float) i_345_)
					f_358_ = (float) i_345_ - f_360_;
			}
			if (i_346_ > i_344_) {
				if (f_361_ > (float) i_346_)
					break;
				if (f_361_ + f_359_ > (float) i_346_)
					f_359_ = (float) i_346_ - f_361_;
			} else {
				if (f_361_ < (float) i_346_)
					break;
				if (f_361_ + f_359_ < (float) i_346_)
					f_359_ = (float) i_346_ - f_361_;
			}
			if (!method9587(f_360_, f_361_, 0.0F, f_360_ + f_358_, f_361_ + f_359_, 0.0F))
				return;
			method9678();
			f_360_ += f_362_ + f_358_;
			f_361_ += f_363_ + f_359_;
			f_358_ = f_354_;
			f_359_ = f_355_;
		}
		method9670(true);
		class349.method4352();
	}

	public final void method1851(int i, int i_364_, int i_365_, int i_366_, int i_367_, int i_368_, Class167 class167, int i_369_, int i_370_) {
		/* empty */
	}

	public final void method1894(int i, int i_371_, int i_372_, int i_373_, int i_374_, int i_375_, Class167 class167, int i_376_, int i_377_) {
		/* empty */
	}

	public final void method1895(int i, int i_378_, int i_379_, int i_380_, int i_381_, int i_382_, Class167 class167, int i_383_, int i_384_) {
		/* empty */
	}

	public void method1896(int i, int i_385_, int i_386_, int i_387_, int i_388_, int i_389_, Class167 class167, int i_390_, int i_391_, int i_392_, int i_393_, int i_394_) {
		/* empty */
	}

	public void method1897(int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, Class167 class167, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_) {
		/* empty */
	}

	public void method1898(int i, int i_405_, int i_406_, int i_407_, int i_408_, int i_409_, Class167 class167, int i_410_, int i_411_, int i_412_, int i_413_, int i_414_) {
		/* empty */
	}

	public void method1899(int i, int i_415_, int i_416_, int i_417_, int i_418_, int i_419_, Class167 class167, int i_420_, int i_421_, int i_422_, int i_423_, int i_424_) {
		/* empty */
	}

	public final void method1726(int i, int i_425_, int i_426_, int i_427_, int i_428_, int i_429_, int i_430_) {
		i += 1.0F;
		i_425_ += 1.0F;
		i_426_ += 1.0F;
		i_427_ += 1.0F;
		float f = (float) (i_426_ - i);
		float f_431_ = (float) (i_427_ - i_425_);
		float f_432_ = 1.0F / (float) Math.sqrt((double) (f * f + f_431_ * f_431_));
		f *= f_432_;
		f_431_ *= f_432_;
		i -= f;
		i_425_ -= f_431_;
		float f_433_ = -f_431_;
		float f_434_ = f;
		f_433_ *= 0.5F * (float) i_429_;
		f_434_ *= 0.5F * (float) i_429_;
		((Class106_Sub3) this).aClass161_Sub1_10540.method2650((float) i - f_433_, (float) i_425_ - f_434_, (float) i_426_ - f_433_, (float) i_427_ - f_434_, (float) i + f_433_, (float) i_425_ + f_434_, 0, i_428_, i_430_);
	}

	public int method1902(int i, int i_435_, int i_436_, int i_437_, int i_438_, int i_439_) {
		int i_440_ = 0;
		float f = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_435_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_436_));
		float f_441_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i_437_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_438_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_439_));
		float f_442_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_435_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_436_));
		float f_443_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i_437_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_438_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_439_));
		if (f < -f_442_ && f_441_ < -f_443_)
			i_440_ |= 0x10;
		else if (f > f_442_ && f_441_ > f_443_)
			i_440_ |= 0x20;
		float f_444_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_435_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_436_));
		float f_445_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i_437_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_438_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_439_));
		if (f_444_ < -f_442_ && f_445_ < -f_443_)
			i_440_ |= 0x1;
		if (f_444_ > f_442_ && f_445_ > f_443_)
			i_440_ |= 0x2;
		float f_446_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_435_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_436_));
		float f_447_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i_437_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_438_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_439_));
		if (f_446_ < -f_442_ && f_447_ < -f_443_)
			i_440_ |= 0x4;
		if (f_446_ > f_442_ && f_447_ > f_443_)
			i_440_ |= 0x8;
		return i_440_;
	}

	public Class96 method1927(int[] is) {
		return new Class96_Sub2(this, is);
	}

	public int method1797(int i, int i_448_, int i_449_, int i_450_, int i_451_, int i_452_) {
		int i_453_ = 0;
		float f = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_448_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_449_));
		float f_454_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i_450_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_451_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_452_));
		float f_455_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_448_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_449_));
		float f_456_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i_450_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_451_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_452_));
		if (f < -f_455_ && f_454_ < -f_456_)
			i_453_ |= 0x10;
		else if (f > f_455_ && f_454_ > f_456_)
			i_453_ |= 0x20;
		float f_457_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_448_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_449_));
		float f_458_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i_450_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_451_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_452_));
		if (f_457_ < -f_455_ && f_458_ < -f_456_)
			i_453_ |= 0x1;
		if (f_457_ > f_455_ && f_458_ > f_456_)
			i_453_ |= 0x2;
		float f_459_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_448_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_449_));
		float f_460_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i_450_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_451_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_452_));
		if (f_459_ < -f_455_ && f_460_ < -f_456_)
			i_453_ |= 0x4;
		if (f_459_ > f_455_ && f_460_ > f_456_)
			i_453_ |= 0x8;
		return i_453_;
	}

	public int method1904(int i, int i_461_, int i_462_, int i_463_, int i_464_, int i_465_) {
		int i_466_ = 0;
		float f = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_461_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_462_));
		float f_467_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i_463_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_464_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_465_));
		float f_468_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_461_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_462_));
		float f_469_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i_463_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_464_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_465_));
		if (f < -f_468_ && f_467_ < -f_469_)
			i_466_ |= 0x10;
		else if (f > f_468_ && f_467_ > f_469_)
			i_466_ |= 0x20;
		float f_470_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_461_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_462_));
		float f_471_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i_463_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_464_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_465_));
		if (f_470_ < -f_468_ && f_471_ < -f_469_)
			i_466_ |= 0x1;
		if (f_470_ > f_468_ && f_471_ > f_469_)
			i_466_ |= 0x2;
		float f_472_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_461_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_462_));
		float f_473_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i_463_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_464_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_465_));
		if (f_472_ < -f_468_ && f_473_ < -f_469_)
			i_466_ |= 0x4;
		if (f_472_ > f_468_ && f_473_ > f_469_)
			i_466_ |= 0x8;
		return i_466_;
	}

	public abstract void method9702(Class250 class250, Class250 class250_474_, Class250 class250_475_);

	boolean method1906(int i, int i_476_, int i_477_, int i_478_, Class261 class261, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		return class326.method4147(i, i_476_, i_477_, i_478_, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	public abstract void method9703(Class250 class250, Class250 class250_479_, Class250 class250_480_);

	public final Class174 method1930(int i, int i_481_, int[][] is, int[][] is_482_, int i_483_, int i_484_, int i_485_) {
		return new Class174_Sub1(this, i_484_, i_485_, i, i_481_, is, is_482_, i_483_);
	}

	public void method2002(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		class90.method1511(class326, ((Class106_Sub3) this).aClass250_10409, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	public final void method1764(Class250 class250) {
		((Class106_Sub3) this).aClass250_10409.method3442(class250);
		method9605();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9822();
	}

	public final Class572_Sub35 method1952(int i) {
		Class572_Sub35_Sub1 class572_sub35_sub1 = new Class572_Sub35_Sub1(i);
		((Class106_Sub3) this).aClass675_10432.method7940(class572_sub35_sub1, -2054215789);
		return class572_sub35_sub1;
	}

	public final Class572_Sub35 method1949(int i) {
		Class572_Sub35_Sub1 class572_sub35_sub1 = new Class572_Sub35_Sub1(i);
		((Class106_Sub3) this).aClass675_10432.method7940(class572_sub35_sub1, -1584740591);
		return class572_sub35_sub1;
	}

	public final void method1911(Class572_Sub35 class572_sub35) {
		((Class106_Sub3) this).aNativeHeap10390 = (((Class572_Sub35_Sub1) (Class572_Sub35_Sub1) class572_sub35).aNativeHeap10966);
	}

	abstract void method9704();

	public final Class161 method1913(int i, int i_486_, boolean bool, boolean bool_487_) {
		return new Class161_Sub1(this, i, i_486_, bool, bool_487_);
	}

	public final Class161 method1914(Class87 class87, boolean bool) {
		Class161 class161;
		if (class87.method1329() != 0 && class87.method1330() != 0) {
			int[] is = class87.method1285(false);
			class161 = method1744(is, 0, class87.method1329(), class87.method1329(), class87.method1330(), 180665711);
		} else
			class161 = method1744(new int[] { 0 }, 0, 1, 1, 1, -533960529);
		class161.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161;
	}

	public final Class161 method1915(Class87 class87, boolean bool) {
		Class161 class161;
		if (class87.method1329() != 0 && class87.method1330() != 0) {
			int[] is = class87.method1285(false);
			class161 = method1744(is, 0, class87.method1329(), class87.method1329(), class87.method1330(), -1441862807);
		} else
			class161 = method1744(new int[] { 0 }, 0, 1, 1, 1, -1010520507);
		class161.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161;
	}

	public final Class161 method1917(int i, int i_488_, int i_489_, int i_490_, boolean bool) {
		Class161_Sub1 class161_sub1 = new Class161_Sub1(this, i_489_, i_490_, bool, false);
		class161_sub1.method2607(0, 0, i_489_, i_490_, i, i_488_);
		return class161_sub1;
	}

	public abstract void method9705();

	public final void method1804(int i, Class167 class167, int i_491_, int i_492_) {
		method1763(false);
		((Class106_Sub3) this).aClass161_Sub1_10475.method2610(0.0F, 0.0F, (float) method1683(-480215478).method1648(), 0.0F, 0.0F, (float) method1683(486147985).method1646(), 0, class167, i_491_, i_492_);
		method1763(true);
	}

	public final void method1920(int i, Class167 class167, int i_493_, int i_494_) {
		method1763(false);
		((Class106_Sub3) this).aClass161_Sub1_10475.method2610(0.0F, 0.0F, (float) method1683(703441137).method1648(), 0.0F, 0.0F, (float) method1683(345173583).method1646(), 0, class167, i_493_, i_494_);
		method1763(true);
	}

	public final void method1893(int i, Class167 class167, int i_495_, int i_496_) {
		method1763(false);
		((Class106_Sub3) this).aClass161_Sub1_10475.method2610(0.0F, 0.0F, (float) method1683(463002209).method1648(), 0.0F, 0.0F, (float) method1683(873453475).method1646(), 0, class167, i_495_, i_496_);
		method1763(true);
	}

	public final void method1886(int i, float f, float f_497_, float f_498_, float f_499_, float f_500_) {
		boolean bool = ((Class106_Sub3) this).anInt10450 != i;
		f *= 0.5F;
		f_497_ *= 0.5F;
		if (bool || aFloat10455 != f || aFloat10456 != f_497_) {
			((Class106_Sub3) this).anInt10450 = i;
			aFloat10455 = f;
			aFloat10456 = f_497_;
			if (bool) {
				aFloat10451 = (float) (((Class106_Sub3) this).anInt10450 & 0xff0000) / 1.671168E7F;
				aFloat10439 = (float) (((Class106_Sub3) this).anInt10450 & 0xff00) / 65280.0F;
				aFloat10453 = (float) (((Class106_Sub3) this).anInt10450 & 0xff) / 255.0F;
				method9594();
			}
			method9748();
		}
		if (((Class106_Sub3) this).aFloatArray10461[0] != f_498_ || ((Class106_Sub3) this).aFloatArray10461[1] != f_499_ || ((Class106_Sub3) this).aFloatArray10461[2] != f_500_) {
			((Class106_Sub3) this).aFloatArray10461[0] = f_498_;
			((Class106_Sub3) this).aFloatArray10461[1] = f_499_;
			((Class106_Sub3) this).aFloatArray10461[2] = f_500_;
			((Class106_Sub3) this).aFloatArray10449[0] = -f_498_;
			((Class106_Sub3) this).aFloatArray10449[1] = -f_499_;
			((Class106_Sub3) this).aFloatArray10449[2] = -f_500_;
			float f_501_ = (float) (1.0 / Math.sqrt((double) (f_498_ * f_498_ + f_499_ * f_499_ + f_500_ * f_500_)));
			aFloatArray10446[0] = f_498_ * f_501_;
			aFloatArray10446[1] = f_499_ * f_501_;
			aFloatArray10446[2] = f_500_ * f_501_;
			aFloatArray10440[0] = -aFloatArray10446[0];
			aFloatArray10440[1] = -aFloatArray10446[1];
			aFloatArray10440[2] = -aFloatArray10446[2];
			method9626();
			((Class106_Sub3) this).sunProjectionX = (int) (f_498_ * 256.0F / f_499_);
			((Class106_Sub3) this).sunProjectionY = (int) (f_500_ * 256.0F / f_499_);
		}
		method9627();
	}

	public final Class102 method1923(Class284 class284, Class87[] class87s, boolean bool) {
		return new Class102_Sub1(this, class284, class87s, bool);
	}

	public final void method1908(int i) {
		/* empty */
	}

	public final Model method1925(Class159 class159, int i, int i_502_, int i_503_, int i_504_) {
		return new AbstractModel(this, class159, i, i_503_, i_504_, i_502_);
	}

	public final void method1790(int i, Class86 class86) {
		if (!((Class106_Sub3) this).aBool10494)
			throw new RuntimeException("");
		((Class106_Sub3) this).anInt10507 = i;
		((Class106_Sub3) this).aClass86_10395 = class86;
		if (((Class106_Sub3) this).aBool10513) {
			((Class106_Sub3) this).aClass349Array10479[3].method4359();
			((Class106_Sub3) this).aClass349Array10479[3].method4355();
		}
	}

	public boolean method1980() {
		return (((Class106_Sub3) this).aClass351Array10491[2] != null && ((Class106_Sub3) this).aClass351Array10491[2].method4384());
	}

	public final int method1928(int i, int i_505_) {
		return i & i_505_ ^ i_505_;
	}

	public final int method1929(int i, int i_506_) {
		return i | i_506_;
	}

	boolean method1905(int i, int i_507_, int i_508_, int i_509_, Class261 class261, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		return class326.method4147(i, i_507_, i_508_, i_509_, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	public final Class261 method1937() {
		return ((Class106_Sub3) this).aClass261_10472;
	}

	public abstract void method9706(Class362 class362);

	public final Class250 method1935() {
		return ((Class106_Sub3) this).aClass250_10492;
	}

	public final Class261 method1936() {
		return ((Class106_Sub3) this).aClass261_10472;
	}

	final void method9707() {
		((Class106_Sub3) this).aClass337_10382 = new Class337(this);
		aBool10488 = false;
		try {
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub2(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub1(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub1(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub1(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), false);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), true);
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = new Class349_Sub1_Sub2(this, (((Class106_Sub3) this).aClass337_10382));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub1(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub2(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub2(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub2(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = null;
			aBool10488 = true;
		}
		if (!aBool10488) {
			int i;
			int i_510_;
			if (aClass104_1410 != null) {
				i_510_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_510_ = 0;
			}
			((Class106_Sub3) this).aClass363_10391 = new Class363(this, i_510_, i);
			((Class106_Sub3) this).aClass351Array10491[3] = new Class351_Sub1(this);
			((Class106_Sub3) this).aClass351Array10491[1] = new Class351_Sub2(this);
			((Class106_Sub3) this).aClass351Array10491[2] = new Class351_Sub3(this);
			if (((Class106_Sub3) this).aClass351Array10491[3].method4373())
				((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]);
			method9593();
			method9595();
		}
		if (((Class106_Sub3) this).aClass349_10478 != null) {
			((Class106_Sub3) this).aClass349_10478.method4352();
			((Class106_Sub3) this).aClass349_10478 = null;
		}
		method9687();
	}

	public final Class261 method2038() {
		return ((Class106_Sub3) this).aClass261_10472;
	}

	abstract Interface40 method9708(Class171 class171, int i, int i_511_, int i_512_, boolean bool, byte[] is);

	public final void method1771(int i, Class572_Sub36[] class572_sub36s) {
		for (int i_513_ = 0; i_513_ < i; i_513_++)
			aClass572_Sub36Array10457[i_513_] = class572_sub36s[i_513_];
		anInt10459 = i;
	}

	void method1803() {
		if (!((Class106_Sub3) this).aBool10514) {
			method9583();
			((Class106_Sub3) this).aClass360_10487.method4447();
			for (Class572 class572 = ((Class106_Sub3) this).aClass675_10432.method7932((byte) 50); class572 != null; class572 = ((Class106_Sub3) this).aClass675_10432.method7926(1394539306))
				((Class572_Sub35_Sub1) class572).method10065();
			Class472.method5585(false, true, (byte) -78);
			for (int i = 0; i < ((Class106_Sub3) this).aClass349Array10479.length; i++) {
				if (((Class106_Sub3) this).aClass349Array10479[i] != null) {
					((Class106_Sub3) this).aClass349Array10479[i].method4363();
					((Class106_Sub3) this).aClass349Array10479[i] = null;
				}
			}
			for (int i = 0; i < ((Class106_Sub3) this).aClass351Array10491.length; i++) {
				if (((Class106_Sub3) this).aClass351Array10491[i] != null) {
					((Class106_Sub3) this).aClass351Array10491[i].method4385();
					((Class106_Sub3) this).aClass351Array10491[i] = null;
				}
			}
			method9574();
			method1668(0);
			((Class106_Sub3) this).aBool10514 = true;
		}
	}

	public final void method1944(Class105 class105) {
		((Class106_Sub3) this).aClass366_10515.method4490(this, class105);
	}

	public final void method1945(Class105 class105) {
		((Class106_Sub3) this).aClass366_10515.method4490(this, class105);
	}

	public final void method2009(Class261 class261) {
		((Class106_Sub3) this).aClass261_10412 = class261;
		aClass250_10392.method3446(((Class106_Sub3) this).aClass261_10412);
		((Class106_Sub3) this).aClass250_10394.method3442(aClass250_10392);
		((Class106_Sub3) this).aClass250_10394.method3485();
		((Class106_Sub3) this).aClass261_10430.method3568(class261);
		((Class106_Sub3) this).aClass261_10430.method3600();
		((Class106_Sub3) this).aClass250_10393.method3446(((Class106_Sub3) this).aClass261_10430);
		method9605();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9606();
	}

	public final void method1766(Class261 class261) {
		((Class106_Sub3) this).aClass261_10412 = class261;
		aClass250_10392.method3446(((Class106_Sub3) this).aClass261_10412);
		((Class106_Sub3) this).aClass250_10394.method3442(aClass250_10392);
		((Class106_Sub3) this).aClass250_10394.method3485();
		((Class106_Sub3) this).aClass261_10430.method3568(class261);
		((Class106_Sub3) this).aClass261_10430.method3600();
		((Class106_Sub3) this).aClass250_10393.method3446(((Class106_Sub3) this).aClass261_10430);
		method9605();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9606();
	}

	public Class261 method1948() {
		return ((Class106_Sub3) this).aClass261_10412;
	}

	public Class261 method1862() {
		return ((Class106_Sub3) this).aClass261_10412;
	}

	public Class261 method1831() {
		return ((Class106_Sub3) this).aClass261_10412;
	}

	public final boolean method1680() {
		return false;
	}

	public Class261 method1770() {
		return ((Class106_Sub3) this).aClass261_10412;
	}

	public final void method1953(Class250 class250) {
		((Class106_Sub3) this).aClass250_10409.method3442(class250);
		method9605();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9822();
	}

	public final void method1954(Class250 class250) {
		((Class106_Sub3) this).aClass250_10409.method3442(class250);
		method9605();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9822();
	}

	public final void method1955(Class250 class250) {
		((Class106_Sub3) this).aClass250_10409.method3442(class250);
		method9605();
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			method9822();
	}

	public final Class250 method2007() {
		return ((Class106_Sub3) this).aClass250_10409;
	}

	public final void method1758(float f) {
		if (aFloat10458 != f) {
			aFloat10458 = f;
			method9594();
			method9627();
		}
	}

	abstract void method9709();

	public final void method1686(int i, float f, float f_514_, float f_515_, float f_516_, float f_517_) {
		boolean bool = ((Class106_Sub3) this).anInt10450 != i;
		f *= 0.5F;
		f_514_ *= 0.5F;
		if (bool || aFloat10455 != f || aFloat10456 != f_514_) {
			((Class106_Sub3) this).anInt10450 = i;
			aFloat10455 = f;
			aFloat10456 = f_514_;
			if (bool) {
				aFloat10451 = (float) (((Class106_Sub3) this).anInt10450 & 0xff0000) / 1.671168E7F;
				aFloat10439 = (float) (((Class106_Sub3) this).anInt10450 & 0xff00) / 65280.0F;
				aFloat10453 = (float) (((Class106_Sub3) this).anInt10450 & 0xff) / 255.0F;
				method9594();
			}
			method9748();
		}
		if (((Class106_Sub3) this).aFloatArray10461[0] != f_515_ || ((Class106_Sub3) this).aFloatArray10461[1] != f_516_ || ((Class106_Sub3) this).aFloatArray10461[2] != f_517_) {
			((Class106_Sub3) this).aFloatArray10461[0] = f_515_;
			((Class106_Sub3) this).aFloatArray10461[1] = f_516_;
			((Class106_Sub3) this).aFloatArray10461[2] = f_517_;
			((Class106_Sub3) this).aFloatArray10449[0] = -f_515_;
			((Class106_Sub3) this).aFloatArray10449[1] = -f_516_;
			((Class106_Sub3) this).aFloatArray10449[2] = -f_517_;
			float f_518_ = (float) (1.0 / Math.sqrt((double) (f_515_ * f_515_ + f_516_ * f_516_ + f_517_ * f_517_)));
			aFloatArray10446[0] = f_515_ * f_518_;
			aFloatArray10446[1] = f_516_ * f_518_;
			aFloatArray10446[2] = f_517_ * f_518_;
			aFloatArray10440[0] = -aFloatArray10446[0];
			aFloatArray10440[1] = -aFloatArray10446[1];
			aFloatArray10440[2] = -aFloatArray10446[2];
			method9626();
			((Class106_Sub3) this).sunProjectionX = (int) (f_515_ * 256.0F / f_516_);
			((Class106_Sub3) this).sunProjectionY = (int) (f_517_ * 256.0F / f_516_);
		}
		method9627();
	}

	public final void method1959(int i, float f, float f_519_, float f_520_, float f_521_, float f_522_) {
		boolean bool = ((Class106_Sub3) this).anInt10450 != i;
		f *= 0.5F;
		f_519_ *= 0.5F;
		if (bool || aFloat10455 != f || aFloat10456 != f_519_) {
			((Class106_Sub3) this).anInt10450 = i;
			aFloat10455 = f;
			aFloat10456 = f_519_;
			if (bool) {
				aFloat10451 = (float) (((Class106_Sub3) this).anInt10450 & 0xff0000) / 1.671168E7F;
				aFloat10439 = (float) (((Class106_Sub3) this).anInt10450 & 0xff00) / 65280.0F;
				aFloat10453 = (float) (((Class106_Sub3) this).anInt10450 & 0xff) / 255.0F;
				method9594();
			}
			method9748();
		}
		if (((Class106_Sub3) this).aFloatArray10461[0] != f_520_ || ((Class106_Sub3) this).aFloatArray10461[1] != f_521_ || ((Class106_Sub3) this).aFloatArray10461[2] != f_522_) {
			((Class106_Sub3) this).aFloatArray10461[0] = f_520_;
			((Class106_Sub3) this).aFloatArray10461[1] = f_521_;
			((Class106_Sub3) this).aFloatArray10461[2] = f_522_;
			((Class106_Sub3) this).aFloatArray10449[0] = -f_520_;
			((Class106_Sub3) this).aFloatArray10449[1] = -f_521_;
			((Class106_Sub3) this).aFloatArray10449[2] = -f_522_;
			float f_523_ = (float) (1.0 / Math.sqrt((double) (f_520_ * f_520_ + f_521_ * f_521_ + f_522_ * f_522_)));
			aFloatArray10446[0] = f_520_ * f_523_;
			aFloatArray10446[1] = f_521_ * f_523_;
			aFloatArray10446[2] = f_522_ * f_523_;
			aFloatArray10440[0] = -aFloatArray10446[0];
			aFloatArray10440[1] = -aFloatArray10446[1];
			aFloatArray10440[2] = -aFloatArray10446[2];
			method9626();
			((Class106_Sub3) this).sunProjectionX = (int) (f_520_ * 256.0F / f_521_);
			((Class106_Sub3) this).sunProjectionY = (int) (f_522_ * 256.0F / f_521_);
		}
		method9627();
	}

	abstract Interface44 method9710(boolean bool);

	public final Class103 method1963(int i) {
		return new Class103_Sub1_Sub1(this, i);
	}

	public final Class103 method2025(int i) {
		return new Class103_Sub1_Sub1(this, i);
	}

	final Interface43 method9711(int i, int i_524_, boolean bool, int[] is) {
		return method9636(i, i_524_, bool, is, 0, 0);
	}

	public final void method1968(Class103 class103) {
		((Class106_Sub3) this).aClass103_Sub1_10493 = (Class103_Sub1) class103;
	}

	public void method1997(float f, float f_525_, float f_526_, float[] fs) {
		float f_527_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * f_525_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * f_526_));
		float f_528_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * f_525_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * f_526_));
		if (f_527_ < -f_528_ || f_527_ > f_528_) {
			float[] fs_529_ = fs;
			float[] fs_530_ = fs;
			fs[2] = Float.NaN;
			fs_530_[1] = Float.NaN;
			fs_529_[0] = Float.NaN;
		} else {
			float f_531_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * f) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * f_525_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * f_526_));
			if (f_531_ < -f_528_ || f_531_ > f_528_) {
				float[] fs_532_ = fs;
				float[] fs_533_ = fs;
				fs[2] = Float.NaN;
				fs_533_[1] = Float.NaN;
				fs_532_[0] = Float.NaN;
			} else {
				float f_534_ = ((((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13]) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1]) * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5]) * f_525_ + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9]) * f_526_);
				if (f_534_ < -f_528_ || f_534_ > f_528_) {
					float[] fs_535_ = fs;
					float[] fs_536_ = fs;
					fs[2] = Float.NaN;
					fs_536_[1] = Float.NaN;
					fs_535_[0] = Float.NaN;
				} else {
					float f_537_ = (aClass250_10392.aFloatArray2728[14] + aClass250_10392.aFloatArray2728[2] * f + aClass250_10392.aFloatArray2728[6] * f_525_ + aClass250_10392.aFloatArray2728[10] * f_526_);
					fs[0] = (((Class106_Sub3) this).aFloat10416 + (((Class106_Sub3) this).aFloat10417 * f_531_ / f_528_));
					fs[1] = (((Class106_Sub3) this).aFloat10407 + (((Class106_Sub3) this).aFloat10419 * f_534_ / f_528_));
					fs[2] = f_537_;
				}
			}
		}
	}

	public final void method1970(int i, int i_538_) {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4471(i, i_538_);
	}

	public final void method1971(int i, int i_539_) {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4471(i, i_539_);
	}

	final void method9712(Class379 class379, int i) {
		method9674(0, ((Class106_Sub3) this).anInterface44_10445);
		method9673(((Class106_Sub3) this).aClass362_10497);
		method9660(class379, 0, i);
	}

	public final boolean method1973() {
		return (((Class106_Sub3) this).aClass363_10391 != null && (((Class363) ((Class106_Sub3) this).aClass363_10391).aBool4441));
	}

	public final boolean method1974() {
		return (((Class106_Sub3) this).aClass363_10391 != null && (((Class363) ((Class106_Sub3) this).aClass363_10391).aBool4441));
	}

	public final boolean method2042() {
		return (((Class106_Sub3) this).aClass363_10391 != null && (((Class363) ((Class106_Sub3) this).aClass363_10391).aBool4441));
	}

	public void method1741(float f, float f_540_) {
		((Class106_Sub3) this).aFloat10422 = f;
		((Class106_Sub3) this).aFloat10423 = f_540_;
		method9601();
	}

	final boolean method9713() {
		return aBool10488;
	}

	public void method1978(float f, float f_541_, float f_542_, float f_543_, float f_544_) {
		Class351_Sub2.aFloat9732 = f;
		Class351_Sub2.aFloat9736 = f_541_;
		Class351_Sub2.aFloat9737 = f_542_;
		Class351_Sub2.aFloat9738 = f_543_;
		Class351_Sub2.aFloat9739 = f_544_;
	}

	Class381 method9714(byte[] is) {
		if (is == null)
			return null;
		Class381 class381;
		try {
			class381 = new Class381(is);
		} catch (Exception exception) {
			return null;
		}
		return class381;
	}

	public final boolean method1811() {
		return true;
	}

	public final boolean method1807() {
		if (((Class106_Sub3) this).aClass351Array10491[3] != null && !((Class106_Sub3) this).aClass351Array10491[3].method4384()) {
			boolean bool = (((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]));
			if (bool)
				((Class106_Sub3) this).aClass360_10487.method4447();
			return bool;
		}
		return false;
	}

	public final boolean method1863() {
		if (((Class106_Sub3) this).aClass351Array10491[3] != null && !((Class106_Sub3) this).aClass351Array10491[3].method4384()) {
			boolean bool = (((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]));
			if (bool)
				((Class106_Sub3) this).aClass360_10487.method4447();
			return bool;
		}
		return false;
	}

	public final void method1793() {
		if (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384()) {
			((Class106_Sub3) this).aClass363_10391.method4485(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass360_10487.method4447();
		}
	}

	public final void method1984() {
		if (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384()) {
			((Class106_Sub3) this).aClass363_10391.method4485(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass360_10487.method4447();
		}
	}

	public final boolean method2006() {
		return (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384());
	}

	abstract void method9715();

	public final boolean method1987() {
		return (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384());
	}

	final void method1988(float f, float f_545_, float f_546_, float f_547_, float f_548_, float f_549_) {
		Class351_Sub1.aFloat9668 = f;
		Class351_Sub1.aFloat9675 = f_545_;
		Class351_Sub1.aFloat9673 = f_546_;
		Class351_Sub1.aFloat9669 = f_549_;
	}

	public final void method1989(int i, Class86 class86) {
		((Class106_Sub3) this).anInt10507 = i;
		((Class106_Sub3) this).aClass86_10395 = class86;
		((Class106_Sub3) this).aBool10494 = true;
	}

	public final void method1757(int i, Class86 class86) {
		((Class106_Sub3) this).anInt10507 = i;
		((Class106_Sub3) this).aClass86_10395 = class86;
		((Class106_Sub3) this).aBool10494 = true;
	}

	final Interface43 method9716(Class171 class171, int i, int i_550_, boolean bool, byte[] is) {
		return method9760(class171, i, i_550_, bool, is, 0, 0);
	}

	public final void method1992(int i, Class86 class86) {
		if (!((Class106_Sub3) this).aBool10494)
			throw new RuntimeException("");
		((Class106_Sub3) this).anInt10507 = i;
		((Class106_Sub3) this).aClass86_10395 = class86;
		if (((Class106_Sub3) this).aBool10513) {
			((Class106_Sub3) this).aClass349Array10479[3].method4359();
			((Class106_Sub3) this).aClass349Array10479[3].method4355();
		}
	}

	public final void method1763(boolean bool) {
		aBool10536 = bool;
		method9620();
	}

	public final void method1994(int i, int i_551_, float f, int i_552_, int i_553_, float f_554_, int i_555_, int i_556_, float f_557_, int i_558_, int i_559_, int i_560_, int i_561_) {
		/* empty */
	}

	abstract void method9717();

	public void method1877(float f, float f_562_, float f_563_, float[] fs) {
		float f_564_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * f_562_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * f_563_));
		float f_565_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * f_562_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * f_563_));
		float f_566_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * f_562_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * f_563_));
		float f_567_ = (aClass250_10392.aFloatArray2728[14] + aClass250_10392.aFloatArray2728[2] * f + aClass250_10392.aFloatArray2728[6] * f_562_ + aClass250_10392.aFloatArray2728[10] * f_563_);
		fs[0] = (((Class106_Sub3) this).aFloat10416 + ((Class106_Sub3) this).aFloat10417 * f_565_ / f_564_);
		fs[1] = (((Class106_Sub3) this).aFloat10407 + ((Class106_Sub3) this).aFloat10419 * f_566_ / f_564_);
		fs[2] = f_567_;
	}

	public final void method1910(Class105 class105) {
		((Class106_Sub3) this).aClass366_10515.method4490(this, class105);
	}

	abstract void method9718(Interface46 interface46);

	final Class250 method9719() {
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			return ((Class106_Sub3) this).aClass250_10393;
		return aClass250_10397;
	}

	public void method2046(float f, float f_568_, float f_569_, float[] fs) {
		float f_570_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * f_568_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * f_569_));
		float f_571_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * f_568_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * f_569_));
		if (f_570_ < -f_571_ || f_570_ > f_571_) {
			float[] fs_572_ = fs;
			float[] fs_573_ = fs;
			fs[2] = Float.NaN;
			fs_573_[1] = Float.NaN;
			fs_572_[0] = Float.NaN;
		} else {
			float f_574_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * f) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * f_568_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * f_569_));
			if (f_574_ < -f_571_ || f_574_ > f_571_) {
				float[] fs_575_ = fs;
				float[] fs_576_ = fs;
				fs[2] = Float.NaN;
				fs_576_[1] = Float.NaN;
				fs_575_[0] = Float.NaN;
			} else {
				float f_577_ = ((((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13]) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1]) * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5]) * f_568_ + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9]) * f_569_);
				if (f_577_ < -f_571_ || f_577_ > f_571_) {
					float[] fs_578_ = fs;
					float[] fs_579_ = fs;
					fs[2] = Float.NaN;
					fs_579_[1] = Float.NaN;
					fs_578_[0] = Float.NaN;
				} else {
					float f_580_ = (aClass250_10392.aFloatArray2728[14] + aClass250_10392.aFloatArray2728[2] * f + aClass250_10392.aFloatArray2728[6] * f_568_ + aClass250_10392.aFloatArray2728[10] * f_569_);
					fs[0] = (((Class106_Sub3) this).aFloat10416 + (((Class106_Sub3) this).aFloat10417 * f_574_ / f_571_));
					fs[1] = (((Class106_Sub3) this).aFloat10407 + (((Class106_Sub3) this).aFloat10419 * f_577_ / f_571_));
					fs[2] = f_580_;
				}
			}
		}
	}

	public final Class161 method2005(int[] is, int i, int i_581_, int i_582_, int i_583_, boolean bool) {
		return new Class161_Sub1(this, i_582_, i_583_, is, i, i_581_);
	}

	public final Class161 method1697(int[] is, int i, int i_584_, int i_585_, int i_586_, boolean bool) {
		return new Class161_Sub1(this, i_585_, i_586_, is, i, i_584_);
	}

	public final Class161 method1957(int[] is, int i, int i_587_, int i_588_, int i_589_, boolean bool) {
		return new Class161_Sub1(this, i_588_, i_589_, is, i, i_587_);
	}

	public final void method1946(int[] is) {
		is[0] = anInt10428;
		is[1] = anInt10426;
		is[2] = anInt10429;
		is[3] = anInt10427;
	}

	public final void method2008() {
		if (aClass104_1410 != null) {
			anInt10426 = 0;
			anInt10428 = 0;
			anInt10429 = aClass104_1410.method1648();
			anInt10427 = aClass104_1410.method1646();
		} else {
			anInt10427 = 0;
			anInt10429 = 0;
			anInt10426 = 0;
			anInt10428 = 0;
		}
		if (aBool10541) {
			aBool10541 = false;
			method9694();
		}
	}

	public final void method1788() {
		if (aClass104_1410 != null) {
			anInt10426 = 0;
			anInt10428 = 0;
			anInt10429 = aClass104_1410.method1648();
			anInt10427 = aClass104_1410.method1646();
		} else {
			anInt10427 = 0;
			anInt10429 = 0;
			anInt10426 = 0;
			anInt10428 = 0;
		}
		if (aBool10541) {
			aBool10541 = false;
			method9694();
		}
	}

	public final void method2003() {
		if (aClass104_1410 != null) {
			anInt10426 = 0;
			anInt10428 = 0;
			anInt10429 = aClass104_1410.method1648();
			anInt10427 = aClass104_1410.method1646();
		} else {
			anInt10427 = 0;
			anInt10429 = 0;
			anInt10426 = 0;
			anInt10428 = 0;
		}
		if (aBool10541) {
			aBool10541 = false;
			method9694();
		}
	}

	public final void method2012(int i, int i_590_, int i_591_, int i_592_) {
		int i_593_;
		int i_594_;
		if (aClass104_1410 != null) {
			i_594_ = aClass104_1410.method1648();
			i_593_ = aClass104_1410.method1646();
		} else {
			i_593_ = 0;
			i_594_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_591_ = i_591_ <= i_594_ ? i_591_ : i_594_;
		i_590_ = i_590_ >= 0 ? i_590_ : 0;
		i_592_ = i_592_ <= i_593_ ? i_592_ : i_593_;
		boolean bool = false;
		if (anInt10428 < i) {
			anInt10428 = i;
			bool = true;
		}
		if (anInt10429 > i_591_) {
			anInt10429 = i_591_;
			bool = true;
		}
		if (anInt10426 < i_590_) {
			anInt10426 = i_590_;
			bool = true;
		}
		if (anInt10427 > i_592_) {
			anInt10427 = i_592_;
			bool = true;
		}
		if (bool) {
			if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
				aBool10541 = true;
				method9694();
			}
			if (aBool10541)
				method9675();
		}
	}

	public final void method1870(int i, int i_595_, int i_596_, int i_597_) {
		int i_598_;
		int i_599_;
		if (aClass104_1410 != null) {
			i_599_ = aClass104_1410.method1648();
			i_598_ = aClass104_1410.method1646();
		} else {
			i_598_ = 0;
			i_599_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_596_ = i_596_ <= i_599_ ? i_596_ : i_599_;
		i_595_ = i_595_ >= 0 ? i_595_ : 0;
		i_597_ = i_597_ <= i_598_ ? i_597_ : i_598_;
		boolean bool = false;
		if (anInt10428 < i) {
			anInt10428 = i;
			bool = true;
		}
		if (anInt10429 > i_596_) {
			anInt10429 = i_596_;
			bool = true;
		}
		if (anInt10426 < i_595_) {
			anInt10426 = i_595_;
			bool = true;
		}
		if (anInt10427 > i_597_) {
			anInt10427 = i_597_;
			bool = true;
		}
		if (bool) {
			if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
				aBool10541 = true;
				method9694();
			}
			if (aBool10541)
				method9675();
		}
	}

	public final void method2014(int i, int i_600_, int i_601_, int i_602_) {
		int i_603_;
		int i_604_;
		if (aClass104_1410 != null) {
			i_604_ = aClass104_1410.method1648();
			i_603_ = aClass104_1410.method1646();
		} else {
			i_603_ = 0;
			i_604_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_601_ = i_601_ <= i_604_ ? i_601_ : i_604_;
		i_600_ = i_600_ >= 0 ? i_600_ : 0;
		i_602_ = i_602_ <= i_603_ ? i_602_ : i_603_;
		boolean bool = false;
		if (anInt10428 < i) {
			anInt10428 = i;
			bool = true;
		}
		if (anInt10429 > i_601_) {
			anInt10429 = i_601_;
			bool = true;
		}
		if (anInt10426 < i_600_) {
			anInt10426 = i_600_;
			bool = true;
		}
		if (anInt10427 > i_602_) {
			anInt10427 = i_602_;
			bool = true;
		}
		if (bool) {
			if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
				aBool10541 = true;
				method9694();
			}
			if (aBool10541)
				method9675();
		}
	}

	public final int method2015() {
		return anInt10415 - 2;
	}

	public boolean method1742() {
		return (((Class106_Sub3) this).aClass351Array10491[1] != null && ((Class106_Sub3) this).aClass351Array10491[1].method4384());
	}

	public boolean method1972() {
		return (((Class106_Sub3) this).aClass351Array10491[1] != null && ((Class106_Sub3) this).aClass351Array10491[1].method4384());
	}

	final void method1882(int i, int i_605_, int i_606_, int i_607_, int i_608_) {
		method1730(i, i_605_, i + i_606_, i_605_, i_607_, i_608_);
	}

	public final void method1947(int i) {
		((Class106_Sub3) this).shadowScale = 0;
		for (/**/; i > 1; i >>= 1)
			((Class106_Sub3) this).shadowScale++;
		((Class106_Sub3) this).anInt10460 = 1 << ((Class106_Sub3) this).shadowScale;
	}

	public void method1690(Class96 class96, float f, Class96 class96_609_, float f_610_, Class96 class96_611_, float f_612_) {
		int i = 0;
		if (class96_611_ == null && f_612_ > 0.0F)
			f_612_ = 0.0F;
		if (class96_609_ == null && f_610_ > 0.0F) {
			class96_609_ = class96_611_;
			class96_611_ = null;
			f_610_ = f_612_;
			f_612_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_609_;
			class96_609_ = class96_611_;
			class96_611_ = null;
			f = f_610_;
			f_610_ = f_612_;
			f_612_ = 0.0F;
		}
		Class351_Sub3.aClass96_Sub2Array9908[0] = (Class96_Sub2) class96;
		Class351_Sub3.aFloatArray9911[0] = f;
		if (f > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[1] = (Class96_Sub2) class96_609_;
		Class351_Sub3.aFloatArray9911[1] = f_610_;
		if (f_610_ > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[2] = (Class96_Sub2) class96_611_;
		Class351_Sub3.aFloatArray9911[2] = f_612_;
		if (f_612_ > 0.0F)
			i++;
		Class351_Sub3.anInt9914 = i;
		Class351_Sub3.aFloat9907 = 1.0F - (f + f_610_ + f_612_);
	}

	public void method1759(Class96 class96, float f, Class96 class96_613_, float f_614_, Class96 class96_615_, float f_616_) {
		int i = 0;
		if (class96_615_ == null && f_616_ > 0.0F)
			f_616_ = 0.0F;
		if (class96_613_ == null && f_614_ > 0.0F) {
			class96_613_ = class96_615_;
			class96_615_ = null;
			f_614_ = f_616_;
			f_616_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_613_;
			class96_613_ = class96_615_;
			class96_615_ = null;
			f = f_614_;
			f_614_ = f_616_;
			f_616_ = 0.0F;
		}
		Class351_Sub3.aClass96_Sub2Array9908[0] = (Class96_Sub2) class96;
		Class351_Sub3.aFloatArray9911[0] = f;
		if (f > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[1] = (Class96_Sub2) class96_613_;
		Class351_Sub3.aFloatArray9911[1] = f_614_;
		if (f_614_ > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[2] = (Class96_Sub2) class96_615_;
		Class351_Sub3.aFloatArray9911[2] = f_616_;
		if (f_616_ > 0.0F)
			i++;
		Class351_Sub3.anInt9914 = i;
		Class351_Sub3.aFloat9907 = 1.0F - (f + f_614_ + f_616_);
	}

	public void method2041(boolean bool) {
		((Class106_Sub3) this).aBool10476 = bool;
	}

	public final void method1991(int i, int i_617_, int i_618_) {
		if (anInt10500 != i || anInt10448 != i_617_ || anInt10398 != i_618_) {
			anInt10500 = i;
			anInt10448 = i_617_;
			anInt10398 = i_618_;
			method9667();
			method9669();
		}
	}

	abstract void method9720();

	public void method1824() {
		if (((Class106_Sub3) this).aClass290_10384 != null)
			((Class106_Sub3) this).aClass290_10384.method3934();
	}

	public abstract void method9721(Class379 class379, int i, int i_619_, int i_620_, int i_621_);

	void method9722() {
		ArrayList arraylist = ((Class106_Sub3) this).aClass222_10365.method3115((byte) 12);
		Iterator iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Interface42 interface42 = (Interface42) iterator.next();
			interface42.method39();
		}
	}

	public void method2019(Class96 class96, float f, Class96 class96_622_, float f_623_, Class96 class96_624_, float f_625_) {
		int i = 0;
		if (class96_624_ == null && f_625_ > 0.0F)
			f_625_ = 0.0F;
		if (class96_622_ == null && f_623_ > 0.0F) {
			class96_622_ = class96_624_;
			class96_624_ = null;
			f_623_ = f_625_;
			f_625_ = 0.0F;
		}
		if (class96 == null && f > 0.0F) {
			class96 = class96_622_;
			class96_622_ = class96_624_;
			class96_624_ = null;
			f = f_623_;
			f_623_ = f_625_;
			f_625_ = 0.0F;
		}
		Class351_Sub3.aClass96_Sub2Array9908[0] = (Class96_Sub2) class96;
		Class351_Sub3.aFloatArray9911[0] = f;
		if (f > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[1] = (Class96_Sub2) class96_622_;
		Class351_Sub3.aFloatArray9911[1] = f_623_;
		if (f_623_ > 0.0F)
			i++;
		Class351_Sub3.aClass96_Sub2Array9908[2] = (Class96_Sub2) class96_624_;
		Class351_Sub3.aFloatArray9911[2] = f_625_;
		if (f_625_ > 0.0F)
			i++;
		Class351_Sub3.anInt9914 = i;
		Class351_Sub3.aFloat9907 = 1.0F - (f + f_623_ + f_625_);
	}

	abstract Interface44 method9723(boolean bool);

	public final boolean method1786() {
		return (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384());
	}

	public abstract boolean method9724();

	public abstract boolean method9725();

	public abstract boolean method9726(boolean bool);

	public abstract boolean method9727(boolean bool);

	public abstract boolean method9728(boolean bool);

	public abstract Class406 method9729(String string);

	abstract void method9730();

	public final void method1942(int i, Class572_Sub36[] class572_sub36s) {
		for (int i_626_ = 0; i_626_ < i; i_626_++)
			aClass572_Sub36Array10457[i_626_] = class572_sub36s[i_626_];
		anInt10459 = i;
	}

	abstract Interface33 method9731(int i, boolean bool, int[][] is);

	public final int method1849() {
		return anInt10415 - 2;
	}

	public abstract void method9732(Class250 class250, Class250 class250_627_, Class250 class250_628_);

	abstract void method9733();

	final Class250 method9734() {
		if (((Class106_Sub3) this).aClass353_10404 == Class353.aClass353_4400)
			return aClass250_10392;
		return aClass250_10397;
	}

	public final void method9735() {
		((Class106_Sub3) this).anInterface34Array10413 = new Interface34[anInt10454];
		aClass250Array10486 = new Class250[anInt10454];
		aClass295Array10436 = new Class295[anInt10454];
		aClass373Array10403 = new Class373[anInt10454];
		aClass373Array10469 = new Class373[anInt10454];
		for (int i = 0; i < anInt10454; i++) {
			aClass373Array10469[i] = Class373.aClass373_4541;
			aClass373Array10403[i] = Class373.aClass373_4541;
			aClass295Array10436[i] = Class295.aClass295_3462;
			aClass250Array10486[i] = new Class250();
		}
		aClass572_Sub36Array10457 = new Class572_Sub36[anInt10415 - 2];
		int[] is = { -1 };
		anInterface43_10474 = method9636(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class106_Sub3) this).anInterface43_10473 = method9636(1, 1, false, is, 0, 0);
		method1740(new Class572_Sub35_Sub1(262144));
		((Class106_Sub3) this).aClass362_10534 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482 }) });
		((Class106_Sub3) this).aClass362_10535 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4468 }) });
		((Class106_Sub3) this).aClass362_10533 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482),
			new Class354(Class364.aClass364_4464) });
		((Class106_Sub3) this).aClass362_10532 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482) });
		for (int i = 0; i < 8; i++) {
			((Class106_Sub3) this).aClass89_Sub3Array10537[i] = new AbstractModel(this, 0, 0, false, false);
			((Class106_Sub3) this).aClass89_Sub3Array10538[i] = new AbstractModel(this, 0, 0, true, true);
		}
		method9581();
		((Class106_Sub3) this).anInterface46_10516 = method9671(true);
		method9738();
		method1714();
		method2044();
		((Class106_Sub3) this).aClass161_Sub1_10540 = new Class161_Sub1(this, anInterface43_10474);
		((Class106_Sub3) this).aClass161_Sub1_10475 = new Class161_Sub1(this, ((Class106_Sub3) this).anInterface43_10473);
		method1719(3, 0);
	}

	public final void method9736() {
		((Class106_Sub3) this).anInterface34Array10413 = new Interface34[anInt10454];
		aClass250Array10486 = new Class250[anInt10454];
		aClass295Array10436 = new Class295[anInt10454];
		aClass373Array10403 = new Class373[anInt10454];
		aClass373Array10469 = new Class373[anInt10454];
		for (int i = 0; i < anInt10454; i++) {
			aClass373Array10469[i] = Class373.aClass373_4541;
			aClass373Array10403[i] = Class373.aClass373_4541;
			aClass295Array10436[i] = Class295.aClass295_3462;
			aClass250Array10486[i] = new Class250();
		}
		aClass572_Sub36Array10457 = new Class572_Sub36[anInt10415 - 2];
		int[] is = { -1 };
		anInterface43_10474 = method9636(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class106_Sub3) this).anInterface43_10473 = method9636(1, 1, false, is, 0, 0);
		method1740(new Class572_Sub35_Sub1(262144));
		((Class106_Sub3) this).aClass362_10534 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482 }) });
		((Class106_Sub3) this).aClass362_10535 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4468 }) });
		((Class106_Sub3) this).aClass362_10533 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482),
			new Class354(Class364.aClass364_4464) });
		((Class106_Sub3) this).aClass362_10532 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482) });
		for (int i = 0; i < 8; i++) {
			((Class106_Sub3) this).aClass89_Sub3Array10537[i] = new AbstractModel(this, 0, 0, false, false);
			((Class106_Sub3) this).aClass89_Sub3Array10538[i] = new AbstractModel(this, 0, 0, true, true);
		}
		method9581();
		((Class106_Sub3) this).anInterface46_10516 = method9671(true);
		method9738();
		method1714();
		method2044();
		((Class106_Sub3) this).aClass161_Sub1_10540 = new Class161_Sub1(this, anInterface43_10474);
		((Class106_Sub3) this).aClass161_Sub1_10475 = new Class161_Sub1(this, ((Class106_Sub3) this).anInterface43_10473);
		method1719(3, 0);
	}

	public final Class250 method1765() {
		return ((Class106_Sub3) this).aClass250_10409;
	}

	final void method9737() {
		((Class106_Sub3) this).aClass337_10382 = new Class337(this);
		aBool10488 = false;
		try {
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub2(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub1(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub1(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub1(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), false);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), true);
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = new Class349_Sub1_Sub2(this, (((Class106_Sub3) this).aClass337_10382));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub1(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub2(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub2(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub2(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = null;
			aBool10488 = true;
		}
		if (!aBool10488) {
			int i;
			int i_629_;
			if (aClass104_1410 != null) {
				i_629_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_629_ = 0;
			}
			((Class106_Sub3) this).aClass363_10391 = new Class363(this, i_629_, i);
			((Class106_Sub3) this).aClass351Array10491[3] = new Class351_Sub1(this);
			((Class106_Sub3) this).aClass351Array10491[1] = new Class351_Sub2(this);
			((Class106_Sub3) this).aClass351Array10491[2] = new Class351_Sub3(this);
			if (((Class106_Sub3) this).aClass351Array10491[3].method4373())
				((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]);
			method9593();
			method9595();
		}
		if (((Class106_Sub3) this).aClass349_10478 != null) {
			((Class106_Sub3) this).aClass349_10478.method4352();
			((Class106_Sub3) this).aClass349_10478 = null;
		}
		method9687();
	}

	public final boolean method1812() {
		return true;
	}

	void method9738() {
		method9680(7);
		method9582();
	}

	final void method9739() {
		((Class106_Sub3) this).aClass337_10382 = new Class337(this);
		aBool10488 = false;
		try {
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub2(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub1(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub1(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub1(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), false);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), true);
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = new Class349_Sub1_Sub2(this, (((Class106_Sub3) this).aClass337_10382));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub1(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub2(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub2(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub2(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = null;
			aBool10488 = true;
		}
		if (!aBool10488) {
			int i;
			int i_630_;
			if (aClass104_1410 != null) {
				i_630_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_630_ = 0;
			}
			((Class106_Sub3) this).aClass363_10391 = new Class363(this, i_630_, i);
			((Class106_Sub3) this).aClass351Array10491[3] = new Class351_Sub1(this);
			((Class106_Sub3) this).aClass351Array10491[1] = new Class351_Sub2(this);
			((Class106_Sub3) this).aClass351Array10491[2] = new Class351_Sub3(this);
			if (((Class106_Sub3) this).aClass351Array10491[3].method4373())
				((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]);
			method9593();
			method9595();
		}
		if (((Class106_Sub3) this).aClass349_10478 != null) {
			((Class106_Sub3) this).aClass349_10478.method4352();
			((Class106_Sub3) this).aClass349_10478 = null;
		}
		method9687();
	}

	final void method1728(int i, int i_631_, int i_632_, int i_633_, int i_634_) {
		method1730(i, i_631_, i + i_632_, i_631_, i_633_, i_634_);
	}

	final void method9740() {
		((Class106_Sub3) this).aClass337_10382 = new Class337(this);
		aBool10488 = false;
		try {
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub2(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub1(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub1(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub1(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), false);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = new Class349_Sub1_Sub1(this, (((Class106_Sub3) this).aClass337_10382), true);
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = new Class349_Sub1_Sub2(this, (((Class106_Sub3) this).aClass337_10382));
		} catch (Exception exception) {
			exception.printStackTrace();
			((Class106_Sub3) this).aClass340_10480 = new Class340_Sub1(this);
			((Class106_Sub3) this).aClass426_10376 = new Class426_Sub2(this);
			((Class106_Sub3) this).aClass335_10482 = new Class335_Sub2(this);
			((Class106_Sub3) this).aClass342_10509 = new Class342_Sub2(this);
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10484 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub1_10485 = null;
			((Class106_Sub3) this).aClass349_Sub1_Sub2_10517 = null;
			aBool10488 = true;
		}
		if (!aBool10488) {
			int i;
			int i_635_;
			if (aClass104_1410 != null) {
				i_635_ = aClass104_1410.method1648();
				i = aClass104_1410.method1646();
			} else {
				i = 0;
				i_635_ = 0;
			}
			((Class106_Sub3) this).aClass363_10391 = new Class363(this, i_635_, i);
			((Class106_Sub3) this).aClass351Array10491[3] = new Class351_Sub1(this);
			((Class106_Sub3) this).aClass351Array10491[1] = new Class351_Sub2(this);
			((Class106_Sub3) this).aClass351Array10491[2] = new Class351_Sub3(this);
			if (((Class106_Sub3) this).aClass351Array10491[3].method4373())
				((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[1]);
			((Class106_Sub3) this).aClass363_10391.method4469(((Class106_Sub3) this).aClass351Array10491[2]);
			method9593();
			method9595();
		}
		if (((Class106_Sub3) this).aClass349_10478 != null) {
			((Class106_Sub3) this).aClass349_10478.method4352();
			((Class106_Sub3) this).aClass349_10478 = null;
		}
		method9687();
	}

	public final Class102 method1922(Class284 class284, Class87[] class87s, boolean bool) {
		return new Class102_Sub1(this, class284, class87s, bool);
	}

	void method9741() {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4473();
		if (((Class106_Sub3) this).anInterface44_10445 != null)
			((Class106_Sub3) this).anInterface44_10445.method39();
		if (((Class106_Sub3) this).anInterface44_10527 != null)
			((Class106_Sub3) this).anInterface44_10527.method39();
		if (((Class106_Sub3) this).anInterface44_10529 != null)
			((Class106_Sub3) this).anInterface44_10529.method39();
		for (int i = 0; i < 8; i++) {
			if (((Class106_Sub3) this).aClass89_Sub3Array10538[i] != null)
				((Class106_Sub3) this).aClass89_Sub3Array10538[i].method10024();
		}
		if (((Class106_Sub3) this).aClass366_10515 != null)
			((Class106_Sub3) this).aClass366_10515.method4491();
		if (((Class106_Sub3) this).anInterface46_10516 != null)
			((Class106_Sub3) this).anInterface46_10516.method39();
		if (((Class106_Sub3) this).aClass290_10384 != null) {
			((Class106_Sub3) this).aClass290_10384.method3923();
			((Class106_Sub3) this).aClass290_10384 = null;
		}
	}

	void method9742() {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4473();
		if (((Class106_Sub3) this).anInterface44_10445 != null)
			((Class106_Sub3) this).anInterface44_10445.method39();
		if (((Class106_Sub3) this).anInterface44_10527 != null)
			((Class106_Sub3) this).anInterface44_10527.method39();
		if (((Class106_Sub3) this).anInterface44_10529 != null)
			((Class106_Sub3) this).anInterface44_10529.method39();
		for (int i = 0; i < 8; i++) {
			if (((Class106_Sub3) this).aClass89_Sub3Array10538[i] != null)
				((Class106_Sub3) this).aClass89_Sub3Array10538[i].method10024();
		}
		if (((Class106_Sub3) this).aClass366_10515 != null)
			((Class106_Sub3) this).aClass366_10515.method4491();
		if (((Class106_Sub3) this).anInterface46_10516 != null)
			((Class106_Sub3) this).anInterface46_10516.method39();
		if (((Class106_Sub3) this).aClass290_10384 != null) {
			((Class106_Sub3) this).aClass290_10384.method3923();
			((Class106_Sub3) this).aClass290_10384 = null;
		}
	}

	void method9743() {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4468();
		if (((Class106_Sub3) this).aClass351Array10491 != null) {
			for (int i = 0; i < ((Class106_Sub3) this).aClass351Array10491.length; i++) {
				if (((Class106_Sub3) this).aClass351Array10491[i] != null && ((Class106_Sub3) this).aClass351Array10491[i].method4384())
					((Class106_Sub3) this).aClass351Array10491[i].method4376();
			}
		}
		((Class106_Sub3) this).aClass366_10515 = new Class366(this);
		method9584();
		method9623();
		method9586();
		((Class106_Sub3) this).aClass366_10515.method4489(this);
		if (aBool10519)
			((Class106_Sub3) this).aClass290_10384 = new Class290(this, 1024);
	}

	public void method1805(int i) {
		if (((Class106_Sub3) this).aClass360_10487 != null)
			((Class106_Sub3) this).aClass360_10487.method4446();
		anInt10512 = i & 0x7fffffff;
	}

	public final void method1772(int i, Class572_Sub36[] class572_sub36s) {
		for (int i_636_ = 0; i_636_ < i; i_636_++)
			aClass572_Sub36Array10457[i_636_] = class572_sub36s[i_636_];
		anInt10459 = i;
	}

	public final void method1845() {
		((Class106_Sub3) this).aBool10494 = false;
	}

	abstract void method9744();

	abstract void method9745();

	public abstract float method9746();

	public abstract float method9747();

	abstract void method9748();

	abstract Class362 method9749(Class354[] class354s);

	public final void method1731(int i, int i_637_, int i_638_, int i_639_, int i_640_, int i_641_, Class167 class167, int i_642_, int i_643_) {
		/* empty */
	}

	public final Class161 method1916(int i, int i_644_, int i_645_, int i_646_, boolean bool) {
		Class161_Sub1 class161_sub1 = new Class161_Sub1(this, i_645_, i_646_, bool, false);
		class161_sub1.method2607(0, 0, i_645_, i_646_, i, i_644_);
		return class161_sub1;
	}

	abstract boolean method9750(Class171 class171, Class88 class88);

	public void method2052(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		class90.method1511(class326, ((Class106_Sub3) this).aClass250_10409, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	public final void method1879(int i, int i_647_, int i_648_, int i_649_, int i_650_, int i_651_) {
		if (aBool10522 && anInt10511 != 0)
			method9670(false);
		if (aBool10536) {
			method1763(false);
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_647_, i_648_, i_649_, 0, i_650_, i_651_);
			method1763(true);
		} else
			((Class106_Sub3) this).aClass161_Sub1_10540.method2598(i, i_647_, i_648_, i_649_, 0, i_650_, i_651_);
		if (aBool10522 && anInt10511 != 0)
			method9670(true);
	}

	abstract void method9751();

	abstract void method9752();

	final void method9753() {
		method9594();
		method9748();
		method9624();
		method9816();
		method9626();
		method9627();
		method9610();
		method9588();
		method9620();
		method9669();
		method9668();
		method9666();
		method9665();
		method9664();
		for (int i = anInt10454 - 1; i >= 0; i--) {
			method9641(i);
			method9691();
			method9657();
			method9653();
		}
		method9655();
		method9603();
	}

	abstract void method9754();

	abstract void method9755();

	abstract void method9756();

	abstract Interface40 method9757(Class171 class171, int i, int i_652_, int i_653_, boolean bool, byte[] is);

	public final boolean method1819() {
		return true;
	}

	public void method1668(int i) {
		if (((Class106_Sub3) this).aClass360_10487 != null)
			((Class106_Sub3) this).aClass360_10487.method4446();
		anInt10512 = i & 0x7fffffff;
	}

	abstract Interface43 method9758(Class171 class171, int i, int i_654_, boolean bool, byte[] is, int i_655_, int i_656_);

	public final void method1924(boolean bool) {
		aBool10536 = bool;
		method9620();
	}

	abstract Interface33 method9759(int i, boolean bool, int[][] is);

	public final void method1745(float f) {
		if (aFloat10458 != f) {
			aFloat10458 = f;
			method9594();
			method9627();
		}
	}

	abstract Interface43 method9760(Class171 class171, int i, int i_657_, boolean bool, byte[] is, int i_658_, int i_659_);

	public abstract void method9761(Class250 class250);

	public abstract void method9762(Class250 class250);

	public final void method9763() {
		((Class106_Sub3) this).anInterface34Array10413 = new Interface34[anInt10454];
		aClass250Array10486 = new Class250[anInt10454];
		aClass295Array10436 = new Class295[anInt10454];
		aClass373Array10403 = new Class373[anInt10454];
		aClass373Array10469 = new Class373[anInt10454];
		for (int i = 0; i < anInt10454; i++) {
			aClass373Array10469[i] = Class373.aClass373_4541;
			aClass373Array10403[i] = Class373.aClass373_4541;
			aClass295Array10436[i] = Class295.aClass295_3462;
			aClass250Array10486[i] = new Class250();
		}
		aClass572_Sub36Array10457 = new Class572_Sub36[anInt10415 - 2];
		int[] is = { -1 };
		anInterface43_10474 = method9636(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		((Class106_Sub3) this).anInterface43_10473 = method9636(1, 1, false, is, 0, 0);
		method1740(new Class572_Sub35_Sub1(262144));
		((Class106_Sub3) this).aClass362_10534 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4482 }) });
		((Class106_Sub3) this).aClass362_10535 = method9672(new Class354[] { new Class354(new Class364[] { Class364.aClass364_4472, Class364.aClass364_4468 }) });
		((Class106_Sub3) this).aClass362_10533 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482),
			new Class354(Class364.aClass364_4464) });
		((Class106_Sub3) this).aClass362_10532 = method9672(new Class354[] { new Class354(Class364.aClass364_4472), new Class354(Class364.aClass364_4468), new Class354(Class364.aClass364_4482) });
		for (int i = 0; i < 8; i++) {
			((Class106_Sub3) this).aClass89_Sub3Array10537[i] = new AbstractModel(this, 0, 0, false, false);
			((Class106_Sub3) this).aClass89_Sub3Array10538[i] = new AbstractModel(this, 0, 0, true, true);
		}
		method9581();
		((Class106_Sub3) this).anInterface46_10516 = method9671(true);
		method9738();
		method1714();
		method2044();
		((Class106_Sub3) this).aClass161_Sub1_10540 = new Class161_Sub1(this, anInterface43_10474);
		((Class106_Sub3) this).aClass161_Sub1_10475 = new Class161_Sub1(this, ((Class106_Sub3) this).anInterface43_10473);
		method1719(3, 0);
	}

	public final Class103 method1962(int i) {
		return new Class103_Sub1_Sub1(this, i);
	}

	public void method1891(int i, int i_660_, int i_661_, int i_662_, int i_663_, int i_664_, int i_665_, int i_666_, int i_667_) {
		float f = (float) i_661_ - (float) i;
		float f_668_ = (float) i_662_ - (float) i_660_;
		if (f == 0.0F && f_668_ == 0.0F)
			f = 1.0F;
		else {
			float f_669_ = (float) (1.0 / Math.sqrt((double) (f * f + f_668_ * f_668_)));
			f *= f_669_;
			f_668_ *= f_669_;
		}
		method9612();
		Class349 class349 = ((Class106_Sub3) this).aClass349Array10479[13];
		class349.method4348();
		class349.method4350(i_663_);
		method9591(i_664_);
		class349.method4354();
		method9670(false);
		i_667_ %= i_666_ + i_665_;
		float f_670_ = f * (float) i_665_;
		float f_671_ = f_668_ * (float) i_665_;
		float f_672_ = 0.0F;
		float f_673_ = 0.0F;
		float f_674_ = f_670_;
		float f_675_ = f_671_;
		if (i_667_ > i_665_) {
			f_672_ = f * (float) (i_665_ + i_666_ - i_667_);
			f_673_ = f_668_ * (float) (i_665_ + i_666_ - i_667_);
		} else {
			f_674_ = f * (float) (i_665_ - i_667_);
			f_675_ = f_668_ * (float) (i_665_ - i_667_);
		}
		float f_676_ = (float) i + f_672_;
		float f_677_ = (float) i_660_ + f_673_;
		float f_678_ = f * (float) i_666_;
		float f_679_ = f_668_ * (float) i_666_;
		for (;;) {
			if (i_661_ > i) {
				if (f_676_ > (float) i_661_)
					break;
				if (f_676_ + f_674_ > (float) i_661_)
					f_674_ = (float) i_661_ - f_676_;
			} else {
				if (f_676_ < (float) i_661_)
					break;
				if (f_676_ + f_674_ < (float) i_661_)
					f_674_ = (float) i_661_ - f_676_;
			}
			if (i_662_ > i_660_) {
				if (f_677_ > (float) i_662_)
					break;
				if (f_677_ + f_675_ > (float) i_662_)
					f_675_ = (float) i_662_ - f_677_;
			} else {
				if (f_677_ < (float) i_662_)
					break;
				if (f_677_ + f_675_ < (float) i_662_)
					f_675_ = (float) i_662_ - f_677_;
			}
			if (!method9587(f_676_, f_677_, 0.0F, f_676_ + f_674_, f_677_ + f_675_, 0.0F))
				return;
			method9678();
			f_676_ += f_678_ + f_674_;
			f_677_ += f_679_ + f_675_;
			f_674_ = f_670_;
			f_675_ = f_671_;
		}
		method9670(true);
		class349.method4352();
	}

	public final boolean method1679() {
		return true;
	}

	public final Class250 method1799() {
		return ((Class106_Sub3) this).aClass250_10492;
	}

	public final Class250 method1752() {
		return ((Class106_Sub3) this).aClass250_10492;
	}

	static int method9764(char c, char c_680_, char c_681_, char c_682_) {
		return ((c & 0xff) << 0 | (c_680_ & 0xff) << 8 | (c_681_ & 0xff) << 16 | (c_682_ & 0xff) << 24);
	}

	public abstract String method1681();

	void method9765() {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4468();
		if (((Class106_Sub3) this).aClass351Array10491 != null) {
			for (int i = 0; i < ((Class106_Sub3) this).aClass351Array10491.length; i++) {
				if (((Class106_Sub3) this).aClass351Array10491[i] != null && ((Class106_Sub3) this).aClass351Array10491[i].method4384())
					((Class106_Sub3) this).aClass351Array10491[i].method4376();
			}
		}
		((Class106_Sub3) this).aClass366_10515 = new Class366(this);
		method9584();
		method9623();
		method9586();
		((Class106_Sub3) this).aClass366_10515.method4489(this);
		if (aBool10519)
			((Class106_Sub3) this).aClass290_10384 = new Class290(this, 1024);
	}

	abstract void method9766();

	abstract void method9767();

	abstract void method9768();

	public final void method1873(int i, int i_683_, int i_684_, int i_685_) {
		int i_686_;
		int i_687_;
		if (aClass104_1410 != null) {
			i_687_ = aClass104_1410.method1648();
			i_686_ = aClass104_1410.method1646();
		} else {
			i_686_ = 0;
			i_687_ = 0;
		}
		if (i <= 0 && i_684_ >= i_687_ - 1 && i_683_ <= 0 && i_685_ >= i_686_ - 1)
			method1714();
		else {
			anInt10428 = i >= 0 ? i : 0;
			anInt10429 = i_684_ <= i_687_ ? i_684_ : i_687_;
			anInt10426 = i_683_ >= 0 ? i_683_ : 0;
			anInt10427 = i_685_ <= i_686_ ? i_685_ : i_686_;
			if (!aBool10541 && (((Class106_Sub3) this).aBool10476 || method9621() == Class352.aClass352_4397)) {
				aBool10541 = true;
				method9694();
			}
			if (aBool10541)
				method9675();
		}
	}

	abstract void method9769();

	public final void method1700(int i, int i_688_) {
		if (((Class106_Sub3) this).aClass363_10391 != null)
			((Class106_Sub3) this).aClass363_10391.method4471(i, i_688_);
	}

	abstract void method9770();

	abstract void method9771();

	abstract void method9772();

	abstract void method9773();

	abstract void method9774();

	byte[] method9775(String string, String string_689_) {
		return ((Class106_Sub3) this).aClass248_10374.method3384(string, string_689_, 504618719);
	}

	abstract void method9776();

	abstract void method9777();

	abstract boolean method9778(Class171 class171, Class88 class88);

	abstract boolean method9779(Class171 class171, Class88 class88);

	abstract boolean method9780(Class171 class171, Class88 class88);

	abstract boolean method9781(Class171 class171, Class88 class88);

	public final void method1919(int i, int i_690_, int i_691_, int i_692_, int i_693_, int i_694_, int i_695_) {
		i += 1.0F;
		i_690_ += 1.0F;
		i_691_ += 1.0F;
		i_692_ += 1.0F;
		float f = (float) (i_691_ - i);
		float f_696_ = (float) (i_692_ - i_690_);
		float f_697_ = 1.0F / (float) Math.sqrt((double) (f * f + f_696_ * f_696_));
		f *= f_697_;
		f_696_ *= f_697_;
		i -= f;
		i_690_ -= f_696_;
		float f_698_ = -f_696_;
		float f_699_ = f;
		f_698_ *= 0.5F * (float) i_694_;
		f_699_ *= 0.5F * (float) i_694_;
		((Class106_Sub3) this).aClass161_Sub1_10540.method2650((float) i - f_698_, (float) i_690_ - f_699_, (float) i_691_ - f_698_, (float) i_692_ - f_699_, (float) i + f_698_, (float) i_690_ + f_699_, 0, i_693_, i_695_);
	}

	abstract boolean method9782(Class171 class171, Class88 class88);

	public final boolean method1826() {
		return true;
	}

	abstract Interface43 method9783(Class171 class171, Class88 class88, int i, int i_700_);

	abstract Interface43 method9784(Class171 class171, Class88 class88, int i, int i_701_);

	public void method1865() {
		((Class106_Sub3) this).anInt10468 = 0;
		((Class106_Sub3) this).anInt10431 = 0;
		((Class106_Sub3) this).anInt10518 = aClass104_1410.method1648();
		((Class106_Sub3) this).anInt10433 = aClass104_1410.method1646();
		method9601();
	}

	public final boolean method1734() {
		return ((Class106_Sub3) this).aClass351Array10491[3] != null;
	}

	abstract Interface43 method9785(Class171 class171, int i, int i_702_, boolean bool, float[] fs, int i_703_, int i_704_);

	abstract Interface43 method9786(Class171 class171, int i, int i_705_, boolean bool, float[] fs, int i_706_, int i_707_);

	abstract Interface43 method9787(int i, int i_708_, boolean bool, int[] is, int i_709_, int i_710_);

	abstract Interface43 method9788(int i, int i_711_, boolean bool, int[] is, int i_712_, int i_713_);

	abstract Interface43 method9789(int i, int i_714_, boolean bool, int[] is, int i_715_, int i_716_);

	abstract Interface33 method9790(int i, boolean bool, int[][] is);

	abstract Interface33 method9791(int i, boolean bool, int[][] is);

	abstract Interface33 method9792(int i, boolean bool, int[][] is);

	public abstract boolean method9793();

	abstract Interface45 method9794(Class171 class171, Class88 class88, int i, int i_717_);

	abstract Interface45 method9795(Class171 class171, Class88 class88, int i, int i_718_);

	public final Class174 method1931(int i, int i_719_, int[][] is, int[][] is_720_, int i_721_, int i_722_, int i_723_) {
		return new Class174_Sub1(this, i_722_, i_723_, i, i_719_, is, is_720_, i_721_);
	}

	public final Class250 method1932() {
		return ((Class106_Sub3) this).aClass250_10492;
	}

	public abstract void method9796(Class250 class250);

	public final void method1665(int i, Class86 class86) {
		if (!((Class106_Sub3) this).aBool10494)
			throw new RuntimeException("");
		((Class106_Sub3) this).anInt10507 = i;
		((Class106_Sub3) this).aClass86_10395 = class86;
		if (((Class106_Sub3) this).aBool10513) {
			((Class106_Sub3) this).aClass349Array10479[3].method4359();
			((Class106_Sub3) this).aClass349Array10479[3].method4355();
		}
	}

	public final boolean method1817() {
		return ((Class106_Sub3) this).aClass351Array10491[3] != null;
	}

	public void method1983(Class261 class261, Class90 class90, Class326 class326) {
		Class250 class250 = aClass250_10399;
		class250.method3446(class261);
		class250.method3445(((Class106_Sub3) this).aClass250_10495);
		class90.method1511(class326, ((Class106_Sub3) this).aClass250_10409, class250, ((Class106_Sub3) this).aFloat10416, ((Class106_Sub3) this).aFloat10407, ((Class106_Sub3) this).aFloat10417, ((Class106_Sub3) this).aFloat10419);
	}

	abstract void method9797(int i, Class293 class293, boolean bool, boolean bool_724_);

	abstract void method9798(int i, Class293 class293, boolean bool, boolean bool_725_);

	abstract void method9799();

	final void method1881(int i, int i_726_, int i_727_, int i_728_, int i_729_) {
		method1730(i, i_726_, i + i_727_, i_726_, i_728_, i_729_);
	}

	public abstract String method1830();

	public final NativeHeapBuffer method9800(int i, boolean bool) {
		return ((Class106_Sub3) this).aNativeHeap10390.method772(i, bool);
	}

	public void method1660() {
		if (((Class106_Sub3) this).aClass290_10384 != null)
			((Class106_Sub3) this).aClass290_10384.method3931();
	}

	public final void method1969(int i, int i_730_, int i_731_, int i_732_) {
		if (((Class106_Sub3) this).aClass363_10391 != null) {
			for (int i_733_ = 0; i_733_ < ((Class106_Sub3) this).aClass351Array10491.length; i_733_++) {
				if (((Class106_Sub3) this).aClass351Array10491[i_733_] != null && ((Class106_Sub3) this).aClass351Array10491[i_733_].method4384() && !((Class106_Sub3) this).aClass351Array10491[i_733_].method4380()) {
					if (!((Class106_Sub3) this).aClass363_10391.method4470(i, i_730_, i_731_, i_732_)) {
						((Class106_Sub3) this).aClass363_10391.method4473();
						((Class106_Sub3) this).aClass363_10391 = null;
					}
					break;
				}
			}
		}
	}

	public abstract Class406 method9801(String string);

	abstract void method9802();

	public void method9803(Interface42 interface42) {
		((Class106_Sub3) this).aClass222_10365.method3116(interface42, anObject10463, (byte) -26);
	}

	abstract void method9804();

	abstract void method9805();

	abstract void method9806();

	abstract void method9807();

	abstract void method9808();

	abstract void method9809();

	public void method1792(float f, float f_734_, float f_735_, float[] fs) {
		float f_736_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * f_734_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * f_735_));
		float f_737_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + ((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * f_734_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * f_735_));
		if (f_736_ < -f_737_ || f_736_ > f_737_) {
			float[] fs_738_ = fs;
			float[] fs_739_ = fs;
			fs[2] = Float.NaN;
			fs_739_[1] = Float.NaN;
			fs_738_[0] = Float.NaN;
		} else {
			float f_740_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * f) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * f_734_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * f_735_));
			if (f_740_ < -f_737_ || f_740_ > f_737_) {
				float[] fs_741_ = fs;
				float[] fs_742_ = fs;
				fs[2] = Float.NaN;
				fs_742_[1] = Float.NaN;
				fs_741_[0] = Float.NaN;
			} else {
				float f_743_ = ((((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13]) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1]) * f + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5]) * f_734_ + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9]) * f_735_);
				if (f_743_ < -f_737_ || f_743_ > f_737_) {
					float[] fs_744_ = fs;
					float[] fs_745_ = fs;
					fs[2] = Float.NaN;
					fs_745_[1] = Float.NaN;
					fs_744_[0] = Float.NaN;
				} else {
					float f_746_ = (aClass250_10392.aFloatArray2728[14] + aClass250_10392.aFloatArray2728[2] * f + aClass250_10392.aFloatArray2728[6] * f_734_ + aClass250_10392.aFloatArray2728[10] * f_735_);
					fs[0] = (((Class106_Sub3) this).aFloat10416 + (((Class106_Sub3) this).aFloat10417 * f_740_ / f_737_));
					fs[1] = (((Class106_Sub3) this).aFloat10407 + (((Class106_Sub3) this).aFloat10419 * f_743_ / f_737_));
					fs[2] = f_746_;
				}
			}
		}
	}

	public void method1806(int i) {
		if (((Class106_Sub3) this).aClass360_10487 != null)
			((Class106_Sub3) this).aClass360_10487.method4446();
		anInt10512 = i & 0x7fffffff;
	}

	abstract void method9810();

	abstract void method9811(int i);

	abstract void method9812();

	abstract void method9813();

	abstract void method9814();

	public final Class161 method1711(Class87 class87, boolean bool) {
		Class161 class161;
		if (class87.method1329() != 0 && class87.method1330() != 0) {
			int[] is = class87.method1285(false);
			class161 = method1744(is, 0, class87.method1329(), class87.method1329(), class87.method1330(), -60160320);
		} else
			class161 = method1744(new int[] { 0 }, 0, 1, 1, 1, -738315314);
		class161.method2586(class87.method1286(), class87.method1288(), class87.method1317(), class87.method1289());
		return class161;
	}

	abstract void method9815();

	final void method9816() {
		if (method9713())
			method9629();
		anInt10388 = anInt10459;
	}

	abstract void method9817(boolean bool);

	public final void method2036() {
		if (((Class106_Sub3) this).aClass351Array10491[3] != null && ((Class106_Sub3) this).aClass351Array10491[3].method4384()) {
			((Class106_Sub3) this).aClass363_10391.method4485(((Class106_Sub3) this).aClass351Array10491[3]);
			((Class106_Sub3) this).aClass360_10487.method4447();
		}
	}

	public abstract boolean method9818();

	public int method2048(int i, int i_747_, int i_748_, int i_749_, int i_750_, int i_751_) {
		int i_752_ = 0;
		float f = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_747_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_748_));
		float f_753_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[14] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[2] * (float) i_749_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[6] * (float) i_750_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[10] * (float) i_751_));
		float f_754_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_747_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_748_));
		float f_755_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[15] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[3] * (float) i_749_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[7] * (float) i_750_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[11] * (float) i_751_));
		if (f < -f_754_ && f_753_ < -f_755_)
			i_752_ |= 0x10;
		else if (f > f_754_ && f_753_ > f_755_)
			i_752_ |= 0x20;
		float f_756_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_747_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_748_));
		float f_757_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[12] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[0] * (float) i_749_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[4] * (float) i_750_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[8] * (float) i_751_));
		if (f_756_ < -f_754_ && f_757_ < -f_755_)
			i_752_ |= 0x1;
		if (f_756_ > f_754_ && f_757_ > f_755_)
			i_752_ |= 0x2;
		float f_758_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_747_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_748_));
		float f_759_ = (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[13] + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[1] * (float) i_749_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[5] * (float) i_750_) + (((Class106_Sub3) this).aClass250_10495.aFloatArray2728[9] * (float) i_751_));
		if (f_758_ < -f_754_ && f_759_ < -f_755_)
			i_752_ |= 0x4;
		if (f_758_ > f_754_ && f_759_ > f_755_)
			i_752_ |= 0x8;
		return i_752_;
	}

	abstract Interface44 method9819(boolean bool);

	public final Model method1926(Class159 class159, int i, int i_760_, int i_761_, int i_762_) {
		return new AbstractModel(this, class159, i, i_761_, i_762_, i_760_);
	}

	abstract Class362 method9820(Class354[] class354s);

	abstract Class362 method9821(Class354[] class354s);

	public final Class250 method1933() {
		return ((Class106_Sub3) this).aClass250_10492;
	}

	final void method9822() {
		aClass250_10528.method3442(((Class106_Sub3) this).aClass250_10411);
		method9796(aClass250_10528);
		aFloat10425 = ((aClass250_10528.aFloatArray2728[14] - aClass250_10528.aFloatArray2728[15]) / (aClass250_10528.aFloatArray2728[11] - aClass250_10528.aFloatArray2728[10]));
		aFloat10464 = (-aClass250_10528.aFloatArray2728[14] / aClass250_10528.aFloatArray2728[10]);
		method9667();
	}

	public abstract void method9823(int i, Interface44 interface44);

	public abstract void method9824(int i, Interface44 interface44);

	public abstract void method9825(Class379 class379, int i, int i_763_);

	abstract void method9826(Interface46 interface46, Class379 class379, int i, int i_764_, int i_765_, int i_766_);

	abstract void method9827(Interface46 interface46, Class379 class379, int i, int i_767_, int i_768_, int i_769_);

	abstract void method9828(Interface46 interface46, Class379 class379, int i, int i_770_, int i_771_, int i_772_);

	abstract Class362 method9829(Class354[] class354s);

	public abstract void method9830(Class379 class379, int i, int i_773_, int i_774_, int i_775_);

	void method9831() {
		method9598();
		method9614();
		method9611();
		method1975();
		method1714();
	}

	final void method9832() {
		((Class106_Sub3) this).aBool10470 = false;
	}

	abstract void method9833(int i);

	abstract void method9834(int i);

	public final void method1872(boolean bool) {
		aBool10536 = bool;
		method9620();
	}

	void method9835() {
		method9680(7);
		method9582();
	}

	abstract void method9836();

	abstract void method9837();

	abstract void method9838();

	public final void method1901(Class103 class103) {
		((Class106_Sub3) this).aClass103_Sub1_10493 = (Class103_Sub1) class103;
	}

	abstract void method9839();

	public boolean method2016() {
		return (((Class106_Sub3) this).aClass351Array10491[1] != null && ((Class106_Sub3) this).aClass351Array10491[1].method4384());
	}

	abstract void method9840();

	abstract void method9841();

	abstract void method9842();

	public abstract void method9843(Class362 class362);

	public abstract void method9844(Class362 class362);

	public abstract void method9845(Class362 class362);

	abstract void method9846(Interface46 interface46);

	final void method9847(boolean bool) {
		if (bool != aBool10498) {
			aBool10498 = bool;
			method9669();
			((Class106_Sub3) this).anInt10539 &= ~0xf;
		}
	}

	abstract void method9848(Interface46 interface46);

	abstract void method9849(Interface46 interface46);
}

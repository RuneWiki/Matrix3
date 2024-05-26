package game;

/* Class485 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class485 {
	long aLong5420;
	boolean aBool5421;
	Class591_Sub2_Sub1_Sub1[] aClass591_Sub2_Sub1_Sub1Array5422;
	int anInt5423;
	int anInt5424;
	long aLong5425;
	int anInt5426;
	List aList5427;
	List aList5428;
	boolean aBool5429;
	boolean aBool5430;
	int anInt5431;
	public boolean aBool5432 = false;
	Class105 aClass105_5433;
	static boolean[] aBoolArray5434 = new boolean[64];
	static boolean[] aBoolArray5435 = new boolean[16];

	void method5763() {
		((Class485) this).aBool5421 = false;
	}

	public void method5764() {
		((Class485) this).aBool5430 = true;
	}

	void method5765(int i, boolean bool) {
		Class491.aList5467.add(this);
		((Class485) this).aLong5425 = (long) i;
		((Class485) this).aLong5420 = (long) i;
		((Class485) this).aBool5430 = true;
		((Class485) this).aBool5429 = bool;
	}

	public static Class485 method5766(int i, boolean bool) {
		if (Class491.anInt5472 * -1106950525 != Class491.anInt5479 * 374447269) {
			Class485 class485 = Class491.aClass485Array5470[Class491.anInt5479 * 374447269];
			Class491.anInt5479 = (Class491.anInt5479 * 374447269 + 1 & (Class100.anIntArray1291[Class491.anInt5481 * -1664530185])) * 581757741;
			class485.method5765(i, bool);
			return class485;
		}
		return new Class485(i, bool);
	}

	public Class105 method5767() {
		return ((Class485) this).aClass105_5433;
	}

	void method5768() {
		((Class485) this).aBool5421 = false;
	}

	boolean method5769(Class106 class106, long l) {
		if (((Class485) this).aLong5425 != ((Class485) this).aLong5420)
			method5783();
		else
			method5768();
		if (l - ((Class485) this).aLong5425 > 750L) {
			method5785();
			return false;
		}
		int i = (int) (l - ((Class485) this).aLong5420);
		if (((Class485) this).aBool5430) {
			Iterator iterator = ((Class485) this).aList5427.iterator();
			while (iterator.hasNext()) {
				Class503 class503 = (Class503) iterator.next();
				for (int i_0_ = 0; i_0_ < (((Class503) class503).aClass308_5559.anInt3585 * 1252086275); i_0_++)
					class503.method6012(class106, l, 1, !((Class485) this).aBool5421, -694553972);
			}
			((Class485) this).aBool5430 = false;
		}
		Iterator iterator = ((Class485) this).aList5427.iterator();
		while (iterator.hasNext()) {
			Class503 class503 = (Class503) iterator.next();
			class503.method6012(class106, l, i, !((Class485) this).aBool5421, -694553972);
		}
		((Class485) this).aLong5420 = l;
		return true;
	}

	public void method5770(long l) {
		((Class485) this).aLong5425 = l;
	}

	public void method5771(Class106 class106, long l, Class84[] class84s, Class175[] class175s, boolean bool) {
		if (!aBool5432) {
			method5772(class106, class84s, bool);
			method5773(class175s, bool);
			((Class485) this).aLong5425 = l;
		}
	}

	void method5772(Class106 class106, Class84[] class84s, boolean bool) {
		for (int i = 0; i < 64; i++)
			aBoolArray5434[i] = false;
		Iterator iterator = ((Class485) this).aList5427.iterator();
		while_35_: while (iterator.hasNext()) {
			Class503 class503 = (Class503) iterator.next();
			if (class84s != null) {
				for (int i = 0; i < class84s.length; i++) {
					if (((Class503) class503).aClass84_5561 == class84s[i] || (((Class503) class503).aClass84_5561 == class84s[i].aClass84_1092)) {
						aBoolArray5434[i] = true;
						class503.method6008(-1585139053);
						((Class503) class503).aBool5565 = false;
						continue while_35_;
					}
				}
			}
			if (!bool) {
				if (((Class503) class503).anInt5562 * 868902845 == 0) {
					iterator.remove();
					((Class485) this).anInt5431--;
				} else
					((Class503) class503).aBool5565 = true;
			}
		}
		if (class84s != null) {
			for (int i = 0; (i < class84s.length && i != 64 && ((Class485) this).anInt5431 != 64); i++) {
				if (!aBoolArray5434[i]) {
					Class503 class503 = new Class503(class106, class84s[i], this, ((Class485) this).aLong5425);
					((Class485) this).aList5427.add(class503);
					((Class485) this).anInt5431++;
					aBoolArray5434[i] = true;
				}
			}
		}
	}

	void method5773(Class175[] class175s, boolean bool) {
		for (int i = 0; i < 16; i++)
			aBoolArray5435[i] = false;
		Iterator iterator = ((Class485) this).aList5428.iterator();
		while_36_: while (iterator.hasNext()) {
			Class572_Sub7 class572_sub7 = (Class572_Sub7) iterator.next();
			if (class175s != null) {
				for (int i = 0; i < class175s.length; i++) {
					if ((((Class572_Sub7) class572_sub7).aClass175_9074 == class175s[i]) || (((Class572_Sub7) class572_sub7).aClass175_9074 == class175s[i].aClass175_2091)) {
						aBoolArray5435[i] = true;
						class572_sub7.method8386(-575931296);
						continue while_36_;
					}
				}
			}
			if (!bool) {
				class572_sub7.method6794((byte) 0);
				((Class485) this).anInt5426--;
				if (class572_sub7.method6793((short) 150)) {
					class572_sub7.method6794((byte) 94);
					Class491.anInt5480 -= 1032778395;
				}
			}
		}
		if (class175s != null) {
			for (int i = 0; (i < class175s.length && i != 16 && ((Class485) this).anInt5426 != 16); i++) {
				if (!aBoolArray5435[i]) {
					Class572_Sub7 class572_sub7 = null;
					if (((class175s[i].method2750(Class491.anInterface37_5475, (byte) 6).anInt3638) * -1090340769) == 1 && Class491.anInt5480 * -579427437 < 32) {
						class572_sub7 = new Class572_Sub7(class175s[i], this);
						Class491.aClass676_5468.put(class572_sub7, (long) (class175s[i].anInt2094 * -1925194305));
						Class491.anInt5480 += 1032778395;
					}
					if (class572_sub7 == null)
						class572_sub7 = new Class572_Sub7(class175s[i], this);
					((Class485) this).aList5428.add(class572_sub7);
					((Class485) this).anInt5426++;
					aBoolArray5435[i] = true;
				}
			}
		}
	}

	public Class105 method5774() {
		((Class485) this).aClass105_5433.aClass657_1385.method7730(-1935292637);
		for (int i = 0; i < ((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422.length; i++) {
			if (((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] != null && (((Class591_Sub2_Sub1_Sub1) ((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i]).aClass503_11676) != null)
				((Class485) this).aClass105_5433.aClass657_1385.method7727(((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i], -1220861187);
		}
		return ((Class485) this).aClass105_5433;
	}

	public void method5775(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		((Class485) this).anInt5424 = i;
	}

	void method5776(Class523 class523, Class106 class106) {
		((Class485) this).aClass105_5433.aClass657_1385.method7730(-1935292637);
		Iterator iterator = ((Class485) this).aList5427.iterator();
		while (iterator.hasNext()) {
			Class503 class503 = (Class503) iterator.next();
			class503.method6007(class523, class106, ((Class485) this).aLong5420);
		}
	}

	Class485(int i, boolean bool) {
		((Class485) this).aBool5421 = false;
		((Class485) this).anInt5423 = 0;
		((Class485) this).aList5427 = new LinkedList();
		((Class485) this).anInt5431 = 0;
		((Class485) this).aList5428 = new LinkedList();
		((Class485) this).anInt5426 = 0;
		((Class485) this).aBool5430 = false;
		((Class485) this).aBool5429 = false;
		((Class485) this).aClass105_5433 = new Class105();
		((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422 = new Class591_Sub2_Sub1_Sub1[8192];
		method5765(i, bool);
	}

	public void method5777() {
		((Class485) this).aBool5430 = true;
	}

	public void method5778() {
		((Class485) this).aBool5430 = true;
	}

	public void method5779() {
		((Class485) this).aBool5430 = true;
	}

	void method5780() {
		aBool5432 = true;
		Iterator iterator = ((Class485) this).aList5428.iterator();
		while (iterator.hasNext()) {
			Class572_Sub7 class572_sub7 = (Class572_Sub7) iterator.next();
			if ((((Class572_Sub7) class572_sub7).aClass309_9071.anInt3638 * -1090340769) == 1)
				class572_sub7.method6794((byte) 15);
		}
		for (int i = 0; i < ((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422.length; i++) {
			if (((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] != null) {
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i].method10581();
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] = null;
			}
		}
		((Class485) this).anInt5423 = 0;
		((Class485) this).aList5427 = new LinkedList();
		((Class485) this).anInt5431 = 0;
		((Class485) this).aList5428 = new LinkedList();
		((Class485) this).anInt5426 = 0;
	}

	void method5781() {
		aBool5432 = true;
		Iterator iterator = ((Class485) this).aList5428.iterator();
		while (iterator.hasNext()) {
			Class572_Sub7 class572_sub7 = (Class572_Sub7) iterator.next();
			if ((((Class572_Sub7) class572_sub7).aClass309_9071.anInt3638 * -1090340769) == 1)
				class572_sub7.method6794((byte) 22);
		}
		for (int i = 0; i < ((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422.length; i++) {
			if (((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] != null) {
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i].method10581();
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] = null;
			}
		}
		((Class485) this).anInt5423 = 0;
		((Class485) this).aList5427 = new LinkedList();
		((Class485) this).anInt5431 = 0;
		((Class485) this).aList5428 = new LinkedList();
		((Class485) this).anInt5426 = 0;
	}

	void method5782() {
		aBool5432 = true;
		Iterator iterator = ((Class485) this).aList5428.iterator();
		while (iterator.hasNext()) {
			Class572_Sub7 class572_sub7 = (Class572_Sub7) iterator.next();
			if ((((Class572_Sub7) class572_sub7).aClass309_9071.anInt3638 * -1090340769) == 1)
				class572_sub7.method6794((byte) 32);
		}
		for (int i = 0; i < ((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422.length; i++) {
			if (((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] != null) {
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i].method10581();
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] = null;
			}
		}
		((Class485) this).anInt5423 = 0;
		((Class485) this).aList5427 = new LinkedList();
		((Class485) this).anInt5431 = 0;
		((Class485) this).aList5428 = new LinkedList();
		((Class485) this).anInt5426 = 0;
	}

	public void method5783() {
		((Class485) this).aBool5421 = true;
	}

	public void method5784() {
		((Class485) this).aBool5421 = true;
	}

	void method5785() {
		aBool5432 = true;
		Iterator iterator = ((Class485) this).aList5428.iterator();
		while (iterator.hasNext()) {
			Class572_Sub7 class572_sub7 = (Class572_Sub7) iterator.next();
			if ((((Class572_Sub7) class572_sub7).aClass309_9071.anInt3638 * -1090340769) == 1)
				class572_sub7.method6794((byte) -26);
		}
		for (int i = 0; i < ((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422.length; i++) {
			if (((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] != null) {
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i].method10581();
				((Class485) this).aClass591_Sub2_Sub1_Sub1Array5422[i] = null;
			}
		}
		((Class485) this).anInt5423 = 0;
		((Class485) this).aList5427 = new LinkedList();
		((Class485) this).anInt5431 = 0;
		((Class485) this).aList5428 = new LinkedList();
		((Class485) this).anInt5426 = 0;
	}

	public void method5786() {
		((Class485) this).aBool5421 = true;
	}
}

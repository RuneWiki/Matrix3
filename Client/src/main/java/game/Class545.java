package game;

/* Class545 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class545 {
	public List aList6110 = new LinkedList();
	boolean aBool6111 = false;
	int anInt6112 = 0;
	int anInt6113 = 0;

	void method6449(Class531 class531, int i) {
		Class456_Sub1 class456_sub1 = class531.aClass456_Sub1_5929;
		boolean bool = true;
		Class90[] class90s = class531.aClass456_Sub1_5929.aClass90Array9007;
		for (int i_0_ = 0; i_0_ < class90s.length; i_0_++) {
			if (class90s[i_0_].aBool1232) {
				bool = false;
				break;
			}
		}
		if (!bool) {
			((Class531) class531).aClass545_5928 = this;
			if (((Class545) this).aBool6111) {
				Iterator iterator = aList6110.iterator();
				while (iterator.hasNext()) {
					Class531 class531_1_ = (Class531) iterator.next();
					if (class531_1_.aClass456_Sub1_5929 == class456_sub1) {
						iterator.remove();
						Class578.method6834(class531_1_, -1238639328);
					}
				}
			}
			ListIterator listiterator = aList6110.listIterator();
			while (listiterator.hasNext()) {
				Class531 class531_2_ = (Class531) listiterator.next();
				if (((Class456_Sub1) class456_sub1).anInt9005 * -855434981 >= (((Class456_Sub1) class531_2_.aClass456_Sub1_5929).anInt9005) * -855434981) {
					listiterator.previous();
					listiterator.add(class531);
					return;
				}
			}
			aList6110.add(class531);
		}
	}

	public void method6450(int i) {
		Iterator iterator = aList6110.iterator();
		while (iterator.hasNext()) {
			Class531 class531 = (Class531) iterator.next();
			iterator.remove();
			Class578.method6834(class531, 430592362);
		}
	}

	Class545(boolean bool) {
		((Class545) this).aBool6111 = bool;
	}

	public void method6451() {
		Iterator iterator = aList6110.iterator();
		while (iterator.hasNext()) {
			Class531 class531 = (Class531) iterator.next();
			iterator.remove();
			Class578.method6834(class531, 265452740);
		}
	}

	public static void method6452(Class469 class469, int i) {
		if (Class296.aClass296_3465 == ((Class469) class469).aClass296_5275)
			Class465.aClass289_5235 = new Class289_Sub1(class469);
		else if (Class296.aClass296_3464 == ((Class469) class469).aClass296_5275)
			Class465.aClass289_5235 = new Class289_Sub2(class469);
		else
			throw new RuntimeException();
	}

	static final void method6453(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = ((Cs2Executor) class441).current_clan.aByte4267;
	}

	static void method6454(Class106 class106, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		Class523 class523 = client.aClass613_8605.method7285(1245676456);
		Interface65 interface65 = (Interface65) class523.method6277(i, i_3_, i_4_, -1272967491);
		if (null != interface65) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (client.aClass613_8605.method7288(-114632810).getDefinition(interface65.method136(-1530978271), 1811582428)));
			int i_10_ = interface65.method383(-617861401) & 0x3;
			int i_11_ = interface65.method304(1020942060);
			if (class509.anInt5623 * 337621963 != -1)
				Class78.method1175(class106, class509, i_10_, i_5_, i_6_, 889254077);
			else {
				int i_12_ = i_7_;
				if (-1262171129 * class509.anInt5627 > 0)
					i_12_ = i_8_;
				if (i_11_ == 1870735441 * Class516.aClass516_5743.anInt5742 || (Class516.aClass516_5729.anInt5742 * 1870735441 == i_11_)) {
					if (i_10_ == 0)
						class106.method1868(i_5_, i_6_, 4, i_12_, 1367906906);
					else if (1 == i_10_)
						class106.method1722(i_5_, i_6_, 4, i_12_, (byte) 121);
					else if (i_10_ == 2)
						class106.method1868(i_5_ + 3, i_6_, 4, i_12_, -2080709844);
					else if (i_10_ == 3)
						class106.method1722(i_5_, 3 + i_6_, 4, i_12_, (byte) 2);
				}
				if (Class516.aClass516_5728.anInt5742 * 1870735441 == i_11_) {
					if (i_10_ == 0)
						class106.method1720(i_5_, i_6_, 1, 1, i_12_, (byte) -20);
					else if (1 == i_10_)
						class106.method1720(i_5_ + 3, i_6_, 1, 1, i_12_, (byte) -126);
					else if (2 == i_10_)
						class106.method1720(3 + i_5_, 3 + i_6_, 1, 1, i_12_, (byte) -125);
					else if (i_10_ == 3)
						class106.method1720(i_5_, i_6_ + 3, 1, 1, i_12_, (byte) -1);
				}
				if (Class516.aClass516_5729.anInt5742 * 1870735441 == i_11_) {
					if (i_10_ == 0)
						class106.method1722(i_5_, i_6_, 4, i_12_, (byte) 7);
					else if (i_10_ == 1)
						class106.method1868(3 + i_5_, i_6_, 4, i_12_, 2006713009);
					else if (2 == i_10_)
						class106.method1722(i_5_, i_6_ + 3, 4, i_12_, (byte) 104);
					else if (3 == i_10_)
						class106.method1868(i_5_, i_6_, 4, i_12_, -1919468874);
				}
			}
		}
		interface65 = (Interface65) class523.method6246(i, i_3_, i_4_, client.anInterface62_8873, (byte) -14);
		if (interface65 != null) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (client.aClass613_8605.method7288(-394325608).getDefinition(interface65.method136(-2004434152), -1938671010)));
			int i_13_ = interface65.method383(-1309621453) & 0x3;
			int i_14_ = interface65.method304(1164747739);
			if (337621963 * class509.anInt5623 != -1)
				Class78.method1175(class106, class509, i_13_, i_5_, i_6_, 1213608809);
			else if (Class516.aClass516_5720.anInt5742 * 1870735441 == i_14_) {
				int i_15_ = -1118482;
				if (-1262171129 * class509.anInt5627 > 0)
					i_15_ = -1179648;
				if (0 == i_13_ || i_13_ == 2)
					class106.method1776(i_5_, 3 + i_6_, 3 + i_5_, i_6_, i_15_, -1583397659);
				else
					class106.method1776(i_5_, i_6_, i_5_ + 3, 3 + i_6_, i_15_, -1503550903);
			}
		}
		interface65 = (Interface65) class523.method6254(i, i_3_, i_4_, 1416217866);
		if (null != interface65) {
			ObjectDefinitions class509 = ((ObjectDefinitions) (client.aClass613_8605.method7288(-1539984619).getDefinition(interface65.method136(-1993703455), -421890676)));
			int i_16_ = interface65.method383(-344625967) & 0x3;
			if (-1 != class509.anInt5623 * 337621963)
				Class78.method1175(class106, class509, i_16_, i_5_, i_6_, 3520105);
		}
	}

	static void method6455(byte i) {
		Class276.method3713(1701483346);
	}

	static final void method6456(InterfaceDefinitions[] class73s, int i, int i_17_) {
		for (int i_18_ = 0; i_18_ < class73s.length; i_18_++) {
			InterfaceDefinitions class73 = class73s[i_18_];
			if (class73 != null) {
				if (0 == class73.anInt752 * -1285279191) {
					if (null != class73.aClass73Array917)
						method6456(class73.aClass73Array917, i, -597446749);
					Class572_Sub29 class572_sub29 = ((Class572_Sub29) (client.aClass676_8760.get((long) (class73.selfId * -1718435171))));
					if (null != class572_sub29)
						Class498.method5945((class572_sub29.anInt9301 * 493419501), i, -1127589829);
				}
				if (0 == i && class73.anObjectArray870 != null) {
					Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
					class572_sub20.thizInterface = class73;
					class572_sub20.params = class73.anObjectArray870;
					Class34.executeCs2(class572_sub20, -1985974491);
				}
				if (i == 1 && class73.anObjectArray890 != null) {
					if (-1665128073 * class73.activeComponent >= 0) {
						InterfaceDefinitions class73_19_ = Class512.method6083((class73.selfId * -1718435171), (short) 11199);
						if (class73_19_ == null || null == class73_19_.aClass73Array916 || (class73.activeComponent * -1665128073 >= class73_19_.aClass73Array916.length) || (class73_19_.aClass73Array916[class73.activeComponent * -1665128073]) != class73)
							continue;
					}
					Cs2LaunchArgs class572_sub20 = new Cs2LaunchArgs();
					class572_sub20.thizInterface = class73;
					class572_sub20.params = class73.anObjectArray890;
					Class34.executeCs2(class572_sub20, -2133637806);
				}
			}
		}
	}
}

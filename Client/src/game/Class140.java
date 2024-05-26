package game;

/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class140 {
	static final boolean method2345(int i, int i_0_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2346(int i, int i_1_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2347(int i, int i_2_) {
		return (i & 0x22) != 0;
	}

	static final boolean method2348(int i, int i_3_) {
		return (i & 0x34) != 0;
	}

	static final boolean method2349(int i, int i_4_) {
		return (i & 0x37) != 0;
	}

	static final boolean method2350(int i, int i_5_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method2351(int i, int i_6_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2352(int i, int i_7_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method2353(int i, int i_8_) {
		return false;
	}

	static final boolean method2354(int i, int i_9_) {
		return (i & 0x10) != 0;
	}

	Class140() throws Throwable {
		throw new Error();
	}

	static final boolean method2355(int i, int i_10_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method2356(int i, int i_11_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method2357(int i, int i_12_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2358(int i, int i_13_) {
		return (i & 0x800) != 0 && (i_13_ & 0x37) != 0;
	}

	static final boolean method2359(int i, int i_14_) {
		return method2353(i, i_14_) & method2363(i, i_14_);
	}

	static final boolean method2360(int i, int i_15_) {
		return (i & 0x22) != 0;
	}

	static final boolean method2361(int i, int i_16_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2362(int i, int i_17_) {
		if (!method2418(i, i_17_))
			return false;
		if ((i & 0xb000) != 0 | method2376(i, i_17_) | method2352(i, i_17_))
			return true;
		return ((i_17_ & 0x37) == 0 & (method2350(i, i_17_) | method2356(i, i_17_)));
	}

	static final boolean method2363(int i, int i_18_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2364(int i, int i_19_) {
		if (!method2418(i, i_19_))
			return false;
		if ((i & 0xb000) != 0 | method2376(i, i_19_) | method2352(i, i_19_))
			return true;
		return ((i_19_ & 0x37) == 0 & (method2350(i, i_19_) | method2356(i, i_19_)));
	}

	static final boolean method2365(int i, int i_20_) {
		return method2353(i, i_20_) & method2363(i, i_20_);
	}

	static final boolean method2366(int i, int i_21_) {
		return (((i & 0x2000) != 0 | method2350(i, i_21_) | method2356(i, i_21_)) & method2358(i, i_21_));
	}

	static final boolean method2367(int i, int i_22_) {
		return ((i & 0x70000) != 0 | method2346(i, i_22_) || method2431(i, i_22_));
	}

	static final boolean method2368(int i, int i_23_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method2369(int i, int i_24_) {
		return ((i & 0x70000) != 0 | method2348(i, i_24_) || method2431(i, i_24_));
	}

	static final boolean method2370(int i, int i_25_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2371(int i, int i_26_) {
		return method2376(i, i_26_) || method2364(i, i_26_);
	}

	static final boolean method2372(int i, int i_27_) {
		return ((i & 0x40000) != 0 | method2352(i, i_27_) || method2364(i, i_27_));
	}

	static final boolean method2373(int i, int i_28_) {
		return method2353(i, i_28_) || method2365(i, i_28_);
	}

	static final boolean method2374(int i, int i_29_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2375(int i, int i_30_) {
		return (i & 0x400) != 0;
	}

	static final boolean method2376(int i, int i_31_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method2377(int i, int i_32_) {
		return ((i & 0x60000) != 0 | method2354(i, i_32_) || method2364(i, i_32_) || method2422(i, i_32_));
	}

	static final boolean method2378(int i, int i_33_) {
		return (i & 0x800) != 0 | method2374(i, i_33_) || method2364(i, i_33_);
	}

	static final boolean method2379(int i, int i_34_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2380(int i, int i_35_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2381(int i, int i_36_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2382(int i, int i_37_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2383(int i, int i_38_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2384(int i, int i_39_) {
		return ((i & 0x60000) != 0 | method2354(i, i_39_) || method2364(i, i_39_) || method2422(i, i_39_));
	}

	static final boolean method2385(int i, int i_40_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method2386(int i, int i_41_) {
		return (i & 0x20) != 0;
	}

	static final boolean method2387(int i, int i_42_) {
		return (i & 0x37) != 0;
	}

	static final boolean method2388(int i, int i_43_) {
		return (i & 0x37) != 0;
	}

	static final boolean method2389(int i, int i_44_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method2390(int i, int i_45_) {
		if ((i & 0x10000) != 0 | method2350(i, i_45_) || method2366(i, i_45_))
			return true;
		return (i_45_ & 0x37) == 0 && method2364(i, i_45_);
	}

	static final boolean method2391(int i, int i_46_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method2392(int i, int i_47_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method2393(int i, int i_48_) {
		return (((i & 0x2000) != 0 | method2350(i, i_48_) | method2356(i, i_48_)) & method2358(i, i_48_));
	}

	static final boolean method2394(int i, int i_49_) {
		return (i & 0x10) != 0;
	}

	static final boolean method2395(int i, int i_50_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method2396(int i, int i_51_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method2397(int i, int i_52_) {
		return method2353(i, i_52_) || method2365(i, i_52_);
	}

	static final boolean method2398(int i, int i_53_) {
		return (i & 0x34) != 0;
	}

	static final boolean method2399(int i, int i_54_) {
		return (i & 0x10) != 0;
	}

	static final boolean method2400(int i, int i_55_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2401(int i, int i_56_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method2402(int i, int i_57_) {
		return method2376(i, i_57_) || method2364(i, i_57_);
	}

	static final boolean method2403(int i, int i_58_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method2404(int i, int i_59_) {
		return ((i & 0x70000) != 0 | method2347(i, i_59_) || method2431(i, i_59_));
	}

	static final boolean method2405(int i, int i_60_) {
		if ((i & 0x10000) != 0 | method2350(i, i_60_) || method2366(i, i_60_))
			return true;
		return (i_60_ & 0x37) == 0 && method2364(i, i_60_);
	}

	static final boolean method2406(int i, int i_61_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method2407(int i, int i_62_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2408(int i, int i_63_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2409(int i, int i_64_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method2410(int i, int i_65_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2411(int i, int i_66_) {
		return (i & 0x800) != 0 && (i_66_ & 0x37) != 0;
	}

	static final boolean method2412(int i, int i_67_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2413(int i, int i_68_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2414(int i, int i_69_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2415(int i, int i_70_) {
		return (i & 0x34) != 0;
	}

	static final boolean method2416(int i, int i_71_) {
		return method2353(i, i_71_) || method2365(i, i_71_);
	}

	static final boolean method2417(int i, int i_72_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2418(int i, int i_73_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2419(int i, int i_74_) {
		return ((method2346(i, i_74_) | method2347(i, i_74_) | method2348(i, i_74_)) & method2357(i, i_74_));
	}

	static final boolean method2420(int i, int i_75_) {
		return (((i & 0x2000) != 0 | method2350(i, i_75_) | method2356(i, i_75_)) & method2358(i, i_75_));
	}

	static final boolean method2421(int i, int i_76_) {
		return (i & 0x21) != 0;
	}

	static final boolean method2422(int i, int i_77_) {
		return method2354(i, i_77_) & method2361(i, i_77_);
	}

	static final boolean method2423(int i, int i_78_) {
		return method2353(i, i_78_) & method2363(i, i_78_);
	}

	static final boolean method2424(int i, int i_79_) {
		return method2353(i, i_79_) & method2363(i, i_79_);
	}

	static final boolean method2425(int i, int i_80_) {
		return (i & 0x180) != 0;
	}

	static final boolean method2426(int i, int i_81_) {
		return method2354(i, i_81_) & method2361(i, i_81_);
	}

	static final boolean method2427(int i, int i_82_) {
		return ((i & 0x70000) != 0 | method2346(i, i_82_) || method2431(i, i_82_));
	}

	static final boolean method2428(int i, int i_83_) {
		return ((i & 0x70000) != 0 | method2347(i, i_83_) || method2431(i, i_83_));
	}

	static final boolean method2429(int i, int i_84_) {
		return method2353(i, i_84_) || method2365(i, i_84_);
	}

	static final boolean method2430(int i, int i_85_) {
		return (i & 0x10) != 0;
	}

	static final boolean method2431(int i, int i_86_) {
		return ((method2346(i, i_86_) | method2347(i, i_86_) | method2348(i, i_86_)) & method2357(i, i_86_));
	}

	static final boolean method2432(int i, int i_87_) {
		return method2376(i, i_87_) || method2364(i, i_87_);
	}

	static final boolean method2433(int i, int i_88_) {
		return ((i & 0x40000) != 0 | method2352(i, i_88_) || method2364(i, i_88_));
	}

	static final boolean method2434(int i, int i_89_) {
		return ((i & 0x40000) != 0 | method2352(i, i_89_) || method2364(i, i_89_));
	}

	static final boolean method2435(int i, int i_90_) {
		return ((i & 0x40000) != 0 | method2352(i, i_90_) || method2364(i, i_90_));
	}

	static final boolean method2436(int i, int i_91_) {
		return ((i & 0x40000) != 0 | method2352(i, i_91_) || method2364(i, i_91_));
	}

	static final boolean method2437(int i, int i_92_) {
		return (i & 0x10) != 0;
	}

	static final boolean method2438(int i, int i_93_) {
		return ((i & 0x70000) != 0 | method2348(i, i_93_) || method2431(i, i_93_));
	}

	static final boolean method2439(int i, int i_94_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method2440(int i, int i_95_) {
		return (i & 0x180) != 0;
	}

	static final boolean method2441(int i, int i_96_) {
		return (i & 0x800) != 0;
	}

	static final boolean method2442(int i, int i_97_) {
		return (i & 0x800) != 0 && (i_97_ & 0x37) != 0;
	}

	static final boolean method2443(int i, int i_98_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method2444(int i, int i_99_) {
		return ((i & 0x60000) != 0 | method2354(i, i_99_) || method2364(i, i_99_) || method2422(i, i_99_));
	}

	static final boolean method2445(int i, int i_100_) {
		return (i & 0x180) != 0;
	}

	static final boolean method2446(int i, int i_101_) {
		return ((i & 0x800) != 0 | method2374(i, i_101_) || method2364(i, i_101_));
	}
}

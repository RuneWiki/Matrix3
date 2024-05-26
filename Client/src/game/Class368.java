package game;

/* Class368 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class368 {
	static final boolean method4496(int i, int i_0_) {
		return (i & 0x800) != 0 | method4505(i, i_0_) || method4515(i, i_0_);
	}

	static final boolean method4497(int i, int i_1_) {
		return (i & 0x21) != 0;
	}

	static final boolean method4498(int i, int i_2_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4499(int i, int i_3_) {
		return (i & 0x34) != 0;
	}

	Class368() throws Throwable {
		throw new Error();
	}

	static final boolean method4500(int i, int i_4_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4501(int i, int i_5_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method4502(int i, int i_6_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method4503(int i, int i_7_) {
		return false;
	}

	static final boolean method4504(int i, int i_8_) {
		return (i & 0x40000) != 0 | method4561(i, i_8_) || method4515(i, i_8_);
	}

	static final boolean method4505(int i, int i_9_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method4506(int i, int i_10_) {
		if (!method4510(i, i_10_))
			return false;
		if ((i & 0x9000) != 0 | method4501(i, i_10_) | method4561(i, i_10_))
			return true;
		return (i_10_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4519(i, i_10_) | method4586(i, i_10_));
	}

	static final boolean method4507(int i, int i_11_) {
		return method4509(i, i_11_) & ((i & 0x2000) != 0 | method4519(i, i_11_) | method4586(i, i_11_));
	}

	static final boolean method4508(int i, int i_12_) {
		return (i & 0x10) != 0;
	}

	static final boolean method4509(int i, int i_13_) {
		return (i & 0x800) != 0 && (i_13_ & 0x37) != 0;
	}

	static final boolean method4510(int i, int i_14_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4511(int i, int i_15_) {
		return (i & 0x34) != 0;
	}

	static final boolean method4512(int i, int i_16_) {
		return (i & 0x400) != 0;
	}

	static final boolean method4513(int i, int i_17_) {
		return ((method4562(i, i_17_) | method4563(i, i_17_) | method4499(i, i_17_)) & method4570(i, i_17_));
	}

	static final boolean method4514(int i, int i_18_) {
		return method4509(i, i_18_) & ((i & 0x2000) != 0 | method4519(i, i_18_) | method4586(i, i_18_));
	}

	static final boolean method4515(int i, int i_19_) {
		if (!method4510(i, i_19_))
			return false;
		if ((i & 0x9000) != 0 | method4501(i, i_19_) | method4561(i, i_19_))
			return true;
		return (i_19_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4519(i, i_19_) | method4586(i, i_19_));
	}

	static final boolean method4516(int i, int i_20_) {
		return method4503(i, i_20_) & method4498(i, i_20_);
	}

	static final boolean method4517(int i, int i_21_) {
		return method4596(i, i_21_) & method4500(i, i_21_);
	}

	static final boolean method4518(int i, int i_22_) {
		return ((i & 0x70000) != 0 || method4562(i, i_22_) || method4513(i, i_22_));
	}

	static final boolean method4519(int i, int i_23_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method4520(int i, int i_24_) {
		return ((i & 0x70000) != 0 || method4499(i, i_24_) || method4513(i, i_24_));
	}

	static final boolean method4521(int i, int i_25_) {
		boolean bool = ((i_25_ & 0x37) != 0 ? method4514(i, i_25_) : method4515(i, i_25_));
		return (i & 0x10000) != 0 | method4519(i, i_25_) | bool;
	}

	static final boolean method4522(int i, int i_26_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4523(int i, int i_27_) {
		return ((i & 0x40000) != 0 | method4561(i, i_27_) || method4515(i, i_27_));
	}

	static final boolean method4524(int i, int i_28_) {
		return method4503(i, i_28_) || method4516(i, i_28_);
	}

	static final boolean method4525(int i, int i_29_) {
		return ((i & 0x70000) != 0 || method4562(i, i_29_) || method4513(i, i_29_));
	}

	static final boolean method4526(int i, int i_30_) {
		return (i & 0x20) != 0;
	}

	static final boolean method4527(int i, int i_31_) {
		return (i & 0x400) != 0;
	}

	static final boolean method4528(int i, int i_32_) {
		return ((i & 0x60000) != 0 | method4596(i, i_32_) || method4517(i, i_32_));
	}

	static final boolean method4529(int i, int i_33_) {
		return (i & 0x180) != 0;
	}

	static final boolean method4530(int i, int i_34_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4531(int i, int i_35_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4532(int i, int i_36_) {
		if (!method4510(i, i_36_))
			return false;
		if ((i & 0x9000) != 0 | method4501(i, i_36_) | method4561(i, i_36_))
			return true;
		return (i_36_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4519(i, i_36_) | method4586(i, i_36_));
	}

	static final boolean method4533(int i, int i_37_) {
		return (i & 0x22) != 0;
	}

	static final boolean method4534(int i, int i_38_) {
		return (i & 0x37) != 0;
	}

	static final boolean method4535(int i, int i_39_) {
		return (i & 0x37) != 0;
	}

	static final boolean method4536(int i, int i_40_) {
		return ((i & 0x70000) != 0 || method4563(i, i_40_) || method4513(i, i_40_));
	}

	static final boolean method4537(int i, int i_41_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method4538(int i, int i_42_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method4539(int i, int i_43_) {
		return method4509(i, i_43_) & ((i & 0x2000) != 0 | method4519(i, i_43_) | method4586(i, i_43_));
	}

	static final boolean method4540(int i, int i_44_) {
		return (i & 0x400) != 0;
	}

	static final boolean method4541(int i, int i_45_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method4542(int i, int i_46_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4543(int i, int i_47_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4544(int i, int i_48_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4545(int i, int i_49_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4546(int i, int i_50_) {
		return (i & 0x22) != 0;
	}

	static final boolean method4547(int i, int i_51_) {
		return false;
	}

	static final boolean method4548(int i, int i_52_) {
		return false;
	}

	static final boolean method4549(int i, int i_53_) {
		return false;
	}

	static final boolean method4550(int i, int i_54_) {
		return (i & 0x10) != 0;
	}

	static final boolean method4551(int i, int i_55_) {
		return ((i & 0x70000) != 0 || method4562(i, i_55_) || method4513(i, i_55_));
	}

	static final boolean method4552(int i, int i_56_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method4553(int i, int i_57_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method4554(int i, int i_58_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method4555(int i, int i_59_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method4556(int i, int i_60_) {
		return (i & 0x37) != 0;
	}

	static final boolean method4557(int i, int i_61_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4558(int i, int i_62_) {
		return (i & 0x800) != 0 && (i_62_ & 0x37) != 0;
	}

	static final boolean method4559(int i, int i_63_) {
		return (i & 0x800) != 0 && (i_63_ & 0x37) != 0;
	}

	static final boolean method4560(int i, int i_64_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4561(int i, int i_65_) {
		return (i & 0x100) != 0;
	}

	static final boolean method4562(int i, int i_66_) {
		return (i & 0x21) != 0;
	}

	static final boolean method4563(int i, int i_67_) {
		return (i & 0x22) != 0;
	}

	static final boolean method4564(int i, int i_68_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4565(int i, int i_69_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4566(int i, int i_70_) {
		return method4503(i, i_70_) || method4516(i, i_70_);
	}

	static final boolean method4567(int i, int i_71_) {
		return ((method4562(i, i_71_) | method4563(i, i_71_) | method4499(i, i_71_)) & method4570(i, i_71_));
	}

	static final boolean method4568(int i, int i_72_) {
		return ((method4562(i, i_72_) | method4563(i, i_72_) | method4499(i, i_72_)) & method4570(i, i_72_));
	}

	static final boolean method4569(int i, int i_73_) {
		return (i & 0x22) != 0;
	}

	static final boolean method4570(int i, int i_74_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4571(int i, int i_75_) {
		return method4509(i, i_75_) & ((i & 0x2000) != 0 | method4519(i, i_75_) | method4586(i, i_75_));
	}

	static final boolean method4572(int i, int i_76_) {
		if (!method4510(i, i_76_))
			return false;
		if ((i & 0x9000) != 0 | method4501(i, i_76_) | method4561(i, i_76_))
			return true;
		return (i_76_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4519(i, i_76_) | method4586(i, i_76_));
	}

	static final boolean method4573(int i, int i_77_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method4574(int i, int i_78_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method4575(int i, int i_79_) {
		if (!method4510(i, i_79_))
			return false;
		if ((i & 0x9000) != 0 | method4501(i, i_79_) | method4561(i, i_79_))
			return true;
		return (i_79_ & 0x37) == 0 & ((i & 0x2000) != 0 | method4519(i, i_79_) | method4586(i, i_79_));
	}

	static final boolean method4576(int i, int i_80_) {
		return method4503(i, i_80_) & method4498(i, i_80_);
	}

	static final boolean method4577(int i, int i_81_) {
		return method4596(i, i_81_) & method4500(i, i_81_);
	}

	static final boolean method4578(int i, int i_82_) {
		return (i & 0x37) != 0;
	}

	static final boolean method4579(int i, int i_83_) {
		return method4501(i, i_83_) || method4515(i, i_83_);
	}

	static final boolean method4580(int i, int i_84_) {
		return ((i & 0x70000) != 0 || method4563(i, i_84_) || method4513(i, i_84_));
	}

	static final boolean method4581(int i, int i_85_) {
		return ((i & 0x70000) != 0 || method4499(i, i_85_) || method4513(i, i_85_));
	}

	static final boolean method4582(int i, int i_86_) {
		boolean bool = ((i_86_ & 0x37) != 0 ? method4514(i, i_86_) : method4515(i, i_86_));
		return (i & 0x10000) != 0 | method4519(i, i_86_) | bool;
	}

	static final boolean method4583(int i, int i_87_) {
		return method4501(i, i_87_) || method4515(i, i_87_);
	}

	static final boolean method4584(int i, int i_88_) {
		return method4501(i, i_88_) || method4515(i, i_88_);
	}

	static final boolean method4585(int i, int i_89_) {
		return ((i & 0x40000) != 0 | method4561(i, i_89_) || method4515(i, i_89_));
	}

	static final boolean method4586(int i, int i_90_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method4587(int i, int i_91_) {
		return ((i & 0x40000) != 0 | method4561(i, i_91_) || method4515(i, i_91_));
	}

	static final boolean method4588(int i, int i_92_) {
		return (i & 0x800) != 0;
	}

	static final boolean method4589(int i, int i_93_) {
		return ((i & 0x40000) != 0 | method4561(i, i_93_) || method4515(i, i_93_));
	}

	static final boolean method4590(int i, int i_94_) {
		return ((i & 0x40000) != 0 | method4561(i, i_94_) || method4515(i, i_94_));
	}

	static final boolean method4591(int i, int i_95_) {
		return method4503(i, i_95_) || method4516(i, i_95_);
	}

	static final boolean method4592(int i, int i_96_) {
		return method4503(i, i_96_) || method4516(i, i_96_);
	}

	static final boolean method4593(int i, int i_97_) {
		return (i & 0x34) != 0;
	}

	static final boolean method4594(int i, int i_98_) {
		return (i & 0x180) != 0;
	}

	static final boolean method4595(int i, int i_99_) {
		return (i & 0x20) != 0;
	}

	static final boolean method4596(int i, int i_100_) {
		return (i & 0x10) != 0;
	}

	static final boolean method4597(int i, int i_101_) {
		return ((i & 0x40000) != 0 | method4561(i, i_101_) || method4515(i, i_101_));
	}
}

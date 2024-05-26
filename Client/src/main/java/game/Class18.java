package game;

/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.math.BigInteger;

public class Class18 {
	public static BigInteger GRAB_SERVER_PUBLIC_EXPONENT;
	static BigInteger LOGIN_PUBLIC_EXPONENT = new BigInteger("10001", 16);
	static BigInteger LOGIN_MODULUS = (new BigInteger("872eb91477aae1e7a4ba7aa5b334f98228ccf42013a21420c48b9a3a720f07ed222fc330a07548fc0602837f1cbee378e09b6673c604a004ce4a1bb198366b9f2220f217a5b00af221bfe19a802b6b78a0eb868bc5027eb6d3dc71ecbdca01d1e230dd68a5549a796e0c93a3037b3e81e265b959eaaec7ce278aaffde261486d", 16));
	public static BigInteger GRAB_SERVER_MODULUS;
	public static Frame aFrame142;
	public static int anInt143;

	Class18() throws Throwable {
		throw new Error();
	}

	static {
		GRAB_SERVER_PUBLIC_EXPONENT = new BigInteger("10001", 16);
		GRAB_SERVER_MODULUS = (new BigInteger("d5a82d38a6ad583bff491480f47f5f5e9743238ab28157e4285643a5ea21404296f520334cbe9d502fe6c126de33820aa0d288b37b9177a28fde4f53f815bc8f37963a28040dfbe7f56f8ee64d7ffe7e2f3b4654a126b786dcd52ed4afdb8bc0319bc5f30bf32a560aa16b2d6e49731b589345452617795533719807fc48df5de03bd20378e053b2b7a0a39016f49c753b154698ef4f7bed1225837ecd079cca7086e335ff2264cc3ca0f87e81d87fa2fe683aa1fe23febf728dd812e445f1516ed6a943aa5dcabbac7487be0eaf8a964d2fb8d3410990353b090dc365de8d76b751dbfa852cc54837bcfc37b9219b49a6a8cbe3bfd913d634086669b99802825f4df060ccfc719903c1f1110bd256be38d2acad1fe9e9e70f125f2b8f6e3a6227408fa69dbdd62ed81e9b37346e05d74ed6fbc93a552a183a996c07cb7577e4b5ba419b10bc9d114913296db11525e470cef85180ec73351557866e2f765460cdc485c64fad6ee4b4689256bd98e794dadc6fa055dca72b2a61e83cbba07cd0afc63ed84d097e0b9a3d9a48c0547a9c19fd20f9bc927b3d78b597cce3fcbe67e6cbde545ce647b5e649c81070ebb7c3689cfc838a0e042838e2761ed72f1abe89c59744e0acc00d4db3f2f08763c869ba848f0583bc95844c5f6b1a5b928a062b725033844a57ee642bbe1724fd8629279f6239570940aaff8c0b9a1538da81", 16));
		new BigInteger("10001", 16);
		new BigInteger("89e9276bcb118875146a6e0bb384e156da667fa359779e065c720a27eec6a3bc8cffa7ee5192fd34cfaaa63c8ebbe6a68339efb17a68e5d4bd45c67d2ca6efdb", 16);
		if (RS3Applet.MODS) {
			LOGIN_MODULUS = GRAB_SERVER_MODULUS = new BigInteger("aea878beb679fd5b152998e3a10f13e3edc739b3541f837a881f5f32cbdfdb3d79b90b4ce4821e05488e26f5420b1975c0d7349244ab47e12e13d4347d205d26b620d60ba49177dd6dc4468a91f5d4137563c422756c7c31c0d8bddee5517fe7209d29158462642803e6897c49bbcc3f5cff81552c338194ce271caa901d750ec8df4490fbbb93bcc390c28f740add5025004ce19a88783c9d418ab78bc6bd90226e60edee81a5153adf03da277803a7b3790161c68cbfd4efb39a9348e289f77c39147a175ddf3f53c9225bc995bb0d675213a4a0281df3e1be4bfba4d439dcc7671abc43b7d9ed2d98d98677144a0d3492fde64cf4550a7c7040b85bde373c100e45ad20abded61d59b5ba1e3afe542a14aa922b7a576d3fcf0365ff3bcf71c299be9a81aabaa3c121c0da9d46d90ad24d74a90f63d86af1537cedfbc85b052a2623ff0f3f496b9a0fa21e752a2f76a951f6b46c6ba9a3631043ef8685f9e1507d840f661d9216f7660e7b8f44f6a93e3a0793206e99d488ba3857e5bc8b754d63e35d2129408fed915d7759968c7dc202c4472f0a2d81e90b832f7d9caa841867decd127b64f0d33247e1d2d333eb72cae6a8d497841a494ec46d43468f5f4e6d37e6db98315bf324814a8795e224863f77e951b11301501d195accb3440c580e9b81ebec96c5f1d5260892c206155708bb5acc9186027c40c1317ce242df", 16);
		}
	}

	public static int method679(int i) {
		return Class572_Sub2.aTwitchTV8969.GetWebcamState();
	}

	public static Class654[] method680(int i) {
		if (null == Class467.aClass654Array5257) {
			Class654[] class654s = Class385.method4662(Class4.aClass672_30, -965739858);
			Class654[] class654s_0_ = new Class654[class654s.length];
			int i_1_ = 0;
			int i_2_ = Class213.aClass572_Sub24_2463.aClass665_Sub7_9227.method8165(174871522);
			while_33_: for (int i_3_ = 0; i_3_ < class654s.length; i_3_++) {
				Class654 class654 = class654s[i_3_];
				if ((-813381331 * class654.anInt8400 <= 0 || -813381331 * class654.anInt8400 >= 24) && 2075359157 * class654.anInt8402 >= 800 && 1799291061 * class654.anInt8401 >= 600 && (2 != i_2_ || (class654.anInt8402 * 2075359157 <= 800 && class654.anInt8401 * 1799291061 <= 600)) && (i_2_ != 1 || (2075359157 * class654.anInt8402 <= 1024 && 1799291061 * class654.anInt8401 <= 768))) {
					for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
						Class654 class654_5_ = class654s_0_[i_4_];
						if ((class654.anInt8402 * 2075359157 == class654_5_.anInt8402 * 2075359157) && (1799291061 * class654.anInt8401 == 1799291061 * class654_5_.anInt8401)) {
							if (class654.anInt8400 * -813381331 > class654_5_.anInt8400 * -813381331)
								class654s_0_[i_4_] = class654;
							continue while_33_;
						}
					}
					class654s_0_[i_1_] = class654;
					i_1_++;
				}
			}
			Class467.aClass654Array5257 = new Class654[i_1_];
			System.arraycopy(class654s_0_, 0, Class467.aClass654Array5257, 0, i_1_);
			int[] is = new int[Class467.aClass654Array5257.length];
			for (int i_6_ = 0; i_6_ < Class467.aClass654Array5257.length; i_6_++) {
				Class654 class654 = Class467.aClass654Array5257[i_6_];
				is[i_6_] = class654.anInt8401 * 1799291061 * (class654.anInt8402 * 2075359157);
			}
			Class407.method4927(is, Class467.aClass654Array5257, (byte) 1);
		}
		return Class467.aClass654Array5257;
	}
}

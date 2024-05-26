package game;

/* Class607 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class607 implements Interface21 {
	static final void method7249(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_0_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_1_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		if (i_0_ == 0)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = (int) Math.pow((double) i_0_, (double) i_1_);
	}

	static void method7250(Class572_Sub12_Sub10 class572_sub12_sub10, int i) {
		if (!Class25.aBool165) {
			class572_sub12_sub10.method6794((byte) -74);
			Class25.anInt172 -= -1390326489;
			if (!((Class572_Sub12_Sub10) class572_sub12_sub10).aBool11401) {
				long l = (((Class572_Sub12_Sub10) class572_sub12_sub10).aLong11400 * 8440972884689828221L);
				Class572_Sub12_Sub19 class572_sub12_sub19;
				for (class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass676_175.get(l)); (class572_sub12_sub19 != null && !(((Class572_Sub12_Sub19) class572_sub12_sub19).aString11481.equals(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391))); class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass676_175.method7971((byte) 36))) {
					/* empty */
				}
				if (class572_sub12_sub19 != null && class572_sub12_sub19.method10459(class572_sub12_sub10, 815880622))
					Class266.method3631(class572_sub12_sub19, 1645607253);
			} else {
				for (Class572_Sub12_Sub19 class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7848(-1042067865)); class572_sub12_sub19 != null; class572_sub12_sub19 = ((Class572_Sub12_Sub19) Class25.aClass664_176.method7845(-1834643048))) {
					if (((Class572_Sub12_Sub19) class572_sub12_sub19).aString11481.equals(((Class572_Sub12_Sub10) class572_sub12_sub10).aString11391)) {
						boolean bool = false;
						for (Class572_Sub12_Sub10 class572_sub12_sub10_2_ = ((Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.method7848(-1042067865)); class572_sub12_sub10_2_ != null; class572_sub12_sub10_2_ = ((Class572_Sub12_Sub10) ((Class572_Sub12_Sub19) class572_sub12_sub19).aClass664_11480.method7845(-1714594631))) {
							if (class572_sub12_sub10 == class572_sub12_sub10_2_) {
								if (class572_sub12_sub19.method10459(class572_sub12_sub10, -178855624))
									Class266.method3631(class572_sub12_sub19, -2079176146);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static final void method7251(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= -2084135730;
		int i_3_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_4_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = i_3_ | i_4_;
	}

	static String method7252(InterfaceDefinitions class73, int i) {
		if (client.method7992(class73).method8647((byte) 0) == 0)
			return null;
		if (null == class73.aString856 || class73.aString856.trim().length() == 0) {
			if (client.aBool8763)
				return "Hidden-use";
			return null;
		}
		return class73.aString856;
	}
}

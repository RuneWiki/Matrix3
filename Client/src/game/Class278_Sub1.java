package game;

/* Class278_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.util.Iterator;

public class Class278_Sub1 extends Class278 {
	Class555 aClass555_9502;
	public static client aclient9503;

	public void method3742(byte i) {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(7, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(0L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	void method3726(int i, int i_0_, int i_1_) {
		try {
			((Class278_Sub1) this).aClass555_9502.method6558(703719362);
		} catch (Exception exception) {
			/* empty */
		}
		((Class278_Sub1) this).aClass555_9502 = null;
		anInt2942 += 201210999;
		anInt2943 = -1801616305;
		((Class278_Sub1) this).aByte2941 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt2944 = i * 1324952959;
		anInt2945 = i_0_ * -1193851415;
	}

	public void method3738(Object object, boolean bool, int i) {
		if (((Class278_Sub1) this).aClass555_9502 != null) {
			try {
				((Class278_Sub1) this).aClass555_9502.method6558(703719362);
			} catch (Exception exception) {
				/* empty */
			}
			((Class278_Sub1) this).aClass555_9502 = null;
		}
		((Class278_Sub1) this).aClass555_9502 = (Class555) object;
		method8867(1989218958);
		method3729(bool, 414634618);
		((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
		((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
		((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
		for (;;) {
			Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2935.method7843(2076179148));
			if (class572_sub12_sub16_sub2 == null)
				break;
			((Class572_Sub12_Sub16_Sub2) class572_sub12_sub16_sub2).aClass572_Sub15_11737 = null;
			((Class278_Sub1) this).aClass664_2934.method7842(class572_sub12_sub16_sub2, 1300550619);
		}
		for (;;) {
			Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2946.method7843(1668581003));
			if (null == class572_sub12_sub16_sub2)
				break;
			((Class572_Sub12_Sub16_Sub2) class572_sub12_sub16_sub2).aClass572_Sub15_11737 = null;
			((Class278_Sub1) this).aClass664_2948.method7842(class572_sub12_sub16_sub2, 466523744);
		}
		if (((Class278_Sub1) this).aByte2941 != 0) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(4, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(((Class278_Sub1) this).aByte2941, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeInt(0, -1743753997);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
		((Class278_Sub1) this).anInt2938 = 0;
		((Class278_Sub1) this).aLong2936 = Class69.method1067(-1793582223) * 7258904782814258195L;
	}

	public void method3725() {
		if (((Class278_Sub1) this).aClass555_9502 != null)
			((Class278_Sub1) this).aClass555_9502.method6564(2107909973);
	}

	public boolean method3748() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			long l = Class69.method1067(-1849423933);
			int i = (int) (l - (8798799888324642331L * ((Class278_Sub1) this).aLong2936));
			((Class278_Sub1) this).aLong2936 = 7258904782814258195L * l;
			if (i > 200)
				i = 200;
			((Class278_Sub1) this).anInt2938 += i * 391235499;
			if (((Class278_Sub1) this).anInt2938 * 1137900291 > 30000) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
			}
		}
		if (((Class278_Sub1) this).aClass555_9502 == null) {
			if (method3728(-216580297) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7845(-1406906196))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(1, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2935.method7842(class572_sub12_sub16_sub2, 497728133);
			}
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7845(-1284325155))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(0, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2946.method7842(class572_sub12_sub16_sub2, 1279386783);
			}
			for (int i = 0; i < 100; i++) {
				int i_2_ = ((Class278_Sub1) this).aClass555_9502.method6563((byte) -124);
				if (i_2_ < 0)
					throw new IOException();
				if (0 == i_2_)
					break;
				((Class278_Sub1) this).anInt2938 = 0;
				if (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 == null) {
					int i_3_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2940.o) * -1585139053;
					if (i_3_ > i_2_)
						i_3_ = i_2_;
					((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2940.b), (((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053), i_3_, 1790207780);
					if (0 != ((Class278_Sub1) this).aByte2941) {
						for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
							((Class278_Sub1) this).aClass572_Sub15_2940.b[i_4_ + -1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2940.o)] ^= ((Class278_Sub1) this).aByte2941;
					}
					((Class278_Sub1) this).aClass572_Sub15_2940.o += i_3_ * 310393755;
					if ((((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053) >= 5) {
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						int i_5_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readUnsignedByte(-2172153);
						int i_6_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readInt(-796742572);
						boolean bool_7_ = (i_6_ & ~0x7fffffff) != 0;
						int i_8_ = i_6_ & 0x7fffffff;
						long l = (long) i_8_ + ((long) i_5_ << 32);
						if (bool_7_) {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2946.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if (l == (class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L)) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2935.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if ((-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093) == l) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						}
						if (null == (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937))
							throw new IOException();
						((Class278_Sub1) this).anInt2939 = 1626227399;
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
					}
				} else {
					RSByteBuffer class572_sub15 = (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737);
					if (null == class572_sub15) {
						int i_9_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053;
						if (i_9_ > i_2_)
							i_9_ = i_2_;
						((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2928.b), (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053, i_9_, 1389149962);
						if (((Class278_Sub1) this).aByte2941 != 0) {
							for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
								((Class278_Sub1) this).aClass572_Sub15_2928.b[-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) + i_10_] ^= ((Class278_Sub1) this).aByte2941;
						}
						((Class278_Sub1) this).aClass572_Sub15_2928.o += i_9_ * 310393755;
						if (-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) >= 5) {
							((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
							int i_11_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readUnsignedByte(2037279843);
							int i_12_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readInt(-270040701);
							int i_13_ = 5;
							if (i_11_ != Class281.aClass281_3219.getId(579475641))
								i_13_ = 9;
							class572_sub15 = ((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737 = (new RSByteBuffer(i_13_ + i_12_ + (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736)));
							class572_sub15.writeByte(i_11_, -1384395473);
							class572_sub15.writeInt(i_12_, -1743753997);
							((Class278_Sub1) this).anInt2939 += 1626227399;
						}
					} else {
						int i_14_ = (class572_sub15.b.length - (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736));
						int i_15_ = (512 - 565402323 * ((Class278_Sub1) this).anInt2939);
						if (i_15_ > i_14_ - class572_sub15.o * -1585139053)
							i_15_ = (i_14_ - -1585139053 * class572_sub15.o);
						if (i_15_ > i_2_)
							i_15_ = i_2_;
						((Class278_Sub1) this).aClass555_9502.method6560(class572_sub15.b, class572_sub15.o * -1585139053, i_15_, 1825530039);
						if (0 != ((Class278_Sub1) this).aByte2941) {
							for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
								class572_sub15.b[i_16_ + (class572_sub15.o * -1585139053)] ^= ((Class278_Sub1) this).aByte2941;
						}
						class572_sub15.o += i_15_ * 310393755;
						((Class278_Sub1) this).anInt2939 += i_15_ * 1184238939;
						if (i_14_ == class572_sub15.o * -1585139053) {
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937.method8412(724585842);
							((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aBool11476 = false;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						} else if (512 == (((Class278_Sub1) this).anInt2939 * 565402323)) {
							((Class278_Sub1) this).anInt2939 = 0;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class278_Sub1) this).aClass555_9502.method6558(703719362);
			} catch (Exception exception) {
				/* empty */
			}
			((Class278_Sub1) this).aClass555_9502 = null;
			anInt2942 += 201210999;
			anInt2943 = 691734686;
			if (method3728(-920564517) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public boolean method3747(int i) {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			long l = Class69.method1067(-2135864890);
			int i_17_ = (int) (l - (8798799888324642331L * ((Class278_Sub1) this).aLong2936));
			((Class278_Sub1) this).aLong2936 = 7258904782814258195L * l;
			if (i_17_ > 200)
				i_17_ = 200;
			((Class278_Sub1) this).anInt2938 += i_17_ * 391235499;
			if (((Class278_Sub1) this).anInt2938 * 1137900291 > 30000) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
			}
		}
		if (((Class278_Sub1) this).aClass555_9502 == null) {
			if (method3728(681554289) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7845(-1650601981))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(1, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2935.method7842(class572_sub12_sub16_sub2, 787269649);
			}
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7845(-1228482199))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(0, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2946.method7842(class572_sub12_sub16_sub2, 977643337);
			}
			for (int i_18_ = 0; i_18_ < 100; i_18_++) {
				int i_19_ = ((Class278_Sub1) this).aClass555_9502.method6563((byte) -14);
				if (i_19_ < 0)
					throw new IOException();
				if (0 == i_19_)
					break;
				((Class278_Sub1) this).anInt2938 = 0;
				if (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 == null) {
					int i_20_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2940.o) * -1585139053;
					if (i_20_ > i_19_)
						i_20_ = i_19_;
					((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2940.b), (((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053), i_20_, 1426206133);
					if (0 != ((Class278_Sub1) this).aByte2941) {
						for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
							((Class278_Sub1) this).aClass572_Sub15_2940.b[i_21_ + -1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2940.o)] ^= ((Class278_Sub1) this).aByte2941;
					}
					((Class278_Sub1) this).aClass572_Sub15_2940.o += i_20_ * 310393755;
					if ((((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053) >= 5) {
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						int i_22_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readUnsignedByte(1656398050);
						int i_23_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readInt(270802031);
						boolean bool_24_ = (i_23_ & ~0x7fffffff) != 0;
						int i_25_ = i_23_ & 0x7fffffff;
						long l = (long) i_25_ + ((long) i_22_ << 32);
						if (bool_24_) {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2946.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if (l == (class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L)) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2935.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if ((-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093) == l) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						}
						if (null == (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937))
							throw new IOException();
						((Class278_Sub1) this).anInt2939 = 1626227399;
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
					}
				} else {
					RSByteBuffer class572_sub15 = (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737);
					if (null == class572_sub15) {
						int i_26_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053;
						if (i_26_ > i_19_)
							i_26_ = i_19_;
						((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2928.b), (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053, i_26_, 1724138710);
						if (((Class278_Sub1) this).aByte2941 != 0) {
							for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
								((Class278_Sub1) this).aClass572_Sub15_2928.b[-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) + i_27_] ^= ((Class278_Sub1) this).aByte2941;
						}
						((Class278_Sub1) this).aClass572_Sub15_2928.o += i_26_ * 310393755;
						if (-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) >= 5) {
							((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
							int i_28_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readUnsignedByte(1386562613);
							int i_29_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readInt(-195079594);
							int i_30_ = 5;
							if (i_28_ != Class281.aClass281_3219.getId(555706073))
								i_30_ = 9;
							class572_sub15 = ((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737 = (new RSByteBuffer(i_30_ + i_29_ + (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736)));
							class572_sub15.writeByte(i_28_, -1384395473);
							class572_sub15.writeInt(i_29_, -1743753997);
							((Class278_Sub1) this).anInt2939 += 1626227399;
						}
					} else {
						int i_31_ = (class572_sub15.b.length - (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736));
						int i_32_ = (512 - 565402323 * ((Class278_Sub1) this).anInt2939);
						if (i_32_ > i_31_ - class572_sub15.o * -1585139053)
							i_32_ = (i_31_ - -1585139053 * class572_sub15.o);
						if (i_32_ > i_19_)
							i_32_ = i_19_;
						((Class278_Sub1) this).aClass555_9502.method6560(class572_sub15.b, class572_sub15.o * -1585139053, i_32_, 1901788558);
						if (0 != ((Class278_Sub1) this).aByte2941) {
							for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
								class572_sub15.b[i_33_ + (class572_sub15.o * -1585139053)] ^= ((Class278_Sub1) this).aByte2941;
						}
						class572_sub15.o += i_32_ * 310393755;
						((Class278_Sub1) this).anInt2939 += i_32_ * 1184238939;
						if (i_31_ == class572_sub15.o * -1585139053) {
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937.method8412(724585842);
							((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aBool11476 = false;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						} else if (512 == (((Class278_Sub1) this).anInt2939 * 565402323)) {
							((Class278_Sub1) this).anInt2939 = 0;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class278_Sub1) this).aClass555_9502.method6558(703719362);
			} catch (Exception exception) {
				/* empty */
			}
			((Class278_Sub1) this).aClass555_9502 = null;
			anInt2942 += 201210999;
			anInt2943 = 691734686;
			if (method3728(1275599847) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public void method3731(int i) {
		if (null != ((Class278_Sub1) this).aClass555_9502)
			((Class278_Sub1) this).aClass555_9502.method6558(703719362);
	}

	public void method3732(int i) {
		if (((Class278_Sub1) this).aClass555_9502 != null)
			((Class278_Sub1) this).aClass555_9502.method6564(1319219983);
	}

	void method3739(int i, int i_34_) {
		try {
			((Class278_Sub1) this).aClass555_9502.method6558(703719362);
		} catch (Exception exception) {
			/* empty */
		}
		((Class278_Sub1) this).aClass555_9502 = null;
		anInt2942 += 201210999;
		anInt2943 = -1801616305;
		((Class278_Sub1) this).aByte2941 = (byte) (int) (Math.random() * 255.0 + 1.0);
		anInt2944 = i * 1324952959;
		anInt2945 = i_34_ * -1193851415;
	}

	public void method3740(Object object, boolean bool) {
		if (((Class278_Sub1) this).aClass555_9502 != null) {
			try {
				((Class278_Sub1) this).aClass555_9502.method6558(703719362);
			} catch (Exception exception) {
				/* empty */
			}
			((Class278_Sub1) this).aClass555_9502 = null;
		}
		((Class278_Sub1) this).aClass555_9502 = (Class555) object;
		method8867(1669980505);
		method3729(bool, 1847498099);
		((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
		((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
		((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
		for (;;) {
			Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2935.method7843(-272613152));
			if (class572_sub12_sub16_sub2 == null)
				break;
			((Class572_Sub12_Sub16_Sub2) class572_sub12_sub16_sub2).aClass572_Sub15_11737 = null;
			((Class278_Sub1) this).aClass664_2934.method7842(class572_sub12_sub16_sub2, 1674852124);
		}
		for (;;) {
			Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2946.method7843(953615587));
			if (null == class572_sub12_sub16_sub2)
				break;
			((Class572_Sub12_Sub16_Sub2) class572_sub12_sub16_sub2).aClass572_Sub15_11737 = null;
			((Class278_Sub1) this).aClass664_2948.method7842(class572_sub12_sub16_sub2, 1382992027);
		}
		if (((Class278_Sub1) this).aByte2941 != 0) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(4, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(((Class278_Sub1) this).aByte2941, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeInt(0, -1743753997);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
		((Class278_Sub1) this).anInt2938 = 0;
		((Class278_Sub1) this).aLong2936 = Class69.method1067(-1906728173) * 7258904782814258195L;
	}

	void method8867(int i) {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(6, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.write24BitInteger(3, -815475057);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeShort(0, -1873863663);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	public void method3736() {
		if (null != ((Class278_Sub1) this).aClass555_9502)
			((Class278_Sub1) this).aClass555_9502.method6558(703719362);
	}

	public void method3741() {
		if (null != ((Class278_Sub1) this).aClass555_9502)
			((Class278_Sub1) this).aClass555_9502.method6558(703719362);
	}

	public void method3744() {
		if (((Class278_Sub1) this).aClass555_9502 != null)
			((Class278_Sub1) this).aClass555_9502.method6564(1982584607);
	}

	public void method3729(boolean bool, int i) {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(bool ? 2 : 3, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(0L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	public void method3746() {
		if (((Class278_Sub1) this).aClass555_9502 != null)
			((Class278_Sub1) this).aClass555_9502.method6564(918411551);
	}

	void method8868() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(6, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.write24BitInteger(3, -765741911);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeShort(0, -1395598547);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	public void method3727() {
		if (null != ((Class278_Sub1) this).aClass555_9502)
			((Class278_Sub1) this).aClass555_9502.method6558(703719362);
	}

	public boolean method3749() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			long l = Class69.method1067(-2147242869);
			int i = (int) (l - (8798799888324642331L * ((Class278_Sub1) this).aLong2936));
			((Class278_Sub1) this).aLong2936 = 7258904782814258195L * l;
			if (i > 200)
				i = 200;
			((Class278_Sub1) this).anInt2938 += i * 391235499;
			if (((Class278_Sub1) this).anInt2938 * 1137900291 > 30000) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
			}
		}
		if (((Class278_Sub1) this).aClass555_9502 == null) {
			if (method3728(717956569) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7845(-1755655965))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(1, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2935.method7842(class572_sub12_sub16_sub2, 1744718982);
			}
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7845(-923458908))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(0, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2946.method7842(class572_sub12_sub16_sub2, 898973875);
			}
			for (int i = 0; i < 100; i++) {
				int i_35_ = ((Class278_Sub1) this).aClass555_9502.method6563((byte) -59);
				if (i_35_ < 0)
					throw new IOException();
				if (0 == i_35_)
					break;
				((Class278_Sub1) this).anInt2938 = 0;
				if (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 == null) {
					int i_36_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2940.o) * -1585139053;
					if (i_36_ > i_35_)
						i_36_ = i_35_;
					((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2940.b), (((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053), i_36_, 1398765595);
					if (0 != ((Class278_Sub1) this).aByte2941) {
						for (int i_37_ = 0; i_37_ < i_36_; i_37_++)
							((Class278_Sub1) this).aClass572_Sub15_2940.b[i_37_ + -1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2940.o)] ^= ((Class278_Sub1) this).aByte2941;
					}
					((Class278_Sub1) this).aClass572_Sub15_2940.o += i_36_ * 310393755;
					if ((((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053) >= 5) {
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						int i_38_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readUnsignedByte(487877208);
						int i_39_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readInt(1542620083);
						boolean bool_40_ = (i_39_ & ~0x7fffffff) != 0;
						int i_41_ = i_39_ & 0x7fffffff;
						long l = (long) i_41_ + ((long) i_38_ << 32);
						if (bool_40_) {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2946.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if (l == (class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L)) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2935.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if ((-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093) == l) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						}
						if (null == (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937))
							throw new IOException();
						((Class278_Sub1) this).anInt2939 = 1626227399;
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
					}
				} else {
					RSByteBuffer class572_sub15 = (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737);
					if (null == class572_sub15) {
						int i_42_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053;
						if (i_42_ > i_35_)
							i_42_ = i_35_;
						((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2928.b), (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053, i_42_, 1362473317);
						if (((Class278_Sub1) this).aByte2941 != 0) {
							for (int i_43_ = 0; i_43_ < i_42_; i_43_++)
								((Class278_Sub1) this).aClass572_Sub15_2928.b[-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) + i_43_] ^= ((Class278_Sub1) this).aByte2941;
						}
						((Class278_Sub1) this).aClass572_Sub15_2928.o += i_42_ * 310393755;
						if (-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) >= 5) {
							((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
							int i_44_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readUnsignedByte(876786763);
							int i_45_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readInt(837000069);
							int i_46_ = 5;
							if (i_44_ != Class281.aClass281_3219.getId(1961147196))
								i_46_ = 9;
							class572_sub15 = ((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737 = (new RSByteBuffer(i_46_ + i_45_ + (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736)));
							class572_sub15.writeByte(i_44_, -1384395473);
							class572_sub15.writeInt(i_45_, -1743753997);
							((Class278_Sub1) this).anInt2939 += 1626227399;
						}
					} else {
						int i_47_ = (class572_sub15.b.length - (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736));
						int i_48_ = (512 - 565402323 * ((Class278_Sub1) this).anInt2939);
						if (i_48_ > i_47_ - class572_sub15.o * -1585139053)
							i_48_ = (i_47_ - -1585139053 * class572_sub15.o);
						if (i_48_ > i_35_)
							i_48_ = i_35_;
						((Class278_Sub1) this).aClass555_9502.method6560(class572_sub15.b, class572_sub15.o * -1585139053, i_48_, 1528049496);
						if (0 != ((Class278_Sub1) this).aByte2941) {
							for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
								class572_sub15.b[i_49_ + (class572_sub15.o * -1585139053)] ^= ((Class278_Sub1) this).aByte2941;
						}
						class572_sub15.o += i_48_ * 310393755;
						((Class278_Sub1) this).anInt2939 += i_48_ * 1184238939;
						if (i_47_ == class572_sub15.o * -1585139053) {
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937.method8412(724585842);
							((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aBool11476 = false;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						} else if (512 == (((Class278_Sub1) this).anInt2939 * 565402323)) {
							((Class278_Sub1) this).anInt2939 = 0;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class278_Sub1) this).aClass555_9502.method6558(703719362);
			} catch (Exception exception) {
				/* empty */
			}
			((Class278_Sub1) this).aClass555_9502 = null;
			anInt2942 += 201210999;
			anInt2943 = 691734686;
			if (method3728(2042819950) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		return bool;
	}

	public boolean method3743() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			long l = Class69.method1067(-2128655762);
			int i = (int) (l - (8798799888324642331L * ((Class278_Sub1) this).aLong2936));
			((Class278_Sub1) this).aLong2936 = 7258904782814258195L * l;
			if (i > 200)
				i = 200;
			((Class278_Sub1) this).anInt2938 += i * 391235499;
			if (((Class278_Sub1) this).anInt2938 * 1137900291 > 30000) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
			}
		}
		if (((Class278_Sub1) this).aClass555_9502 == null) {
			if (method3728(779263301) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		boolean bool;
		try {
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2934.method7845(-2016028265))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(1, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2935.method7842(class572_sub12_sub16_sub2, 1304152968);
			}
			for (Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7848(-1042067865)); class572_sub12_sub16_sub2 != null; class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) ((Class278_Sub1) this).aClass664_2948.method7845(-2079921853))) {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(0, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
				((Class278_Sub1) this).aClass664_2946.method7842(class572_sub12_sub16_sub2, 1863130652);
			}
			for (int i = 0; i < 100; i++) {
				int i_50_ = ((Class278_Sub1) this).aClass555_9502.method6563((byte) -43);
				if (i_50_ < 0)
					throw new IOException();
				if (0 == i_50_)
					break;
				((Class278_Sub1) this).anInt2938 = 0;
				if (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 == null) {
					int i_51_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2940.o) * -1585139053;
					if (i_51_ > i_50_)
						i_51_ = i_50_;
					((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2940.b), (((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053), i_51_, 2058472673);
					if (0 != ((Class278_Sub1) this).aByte2941) {
						for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
							((Class278_Sub1) this).aClass572_Sub15_2940.b[i_52_ + -1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2940.o)] ^= ((Class278_Sub1) this).aByte2941;
					}
					((Class278_Sub1) this).aClass572_Sub15_2940.o += i_51_ * 310393755;
					if ((((Class278_Sub1) this).aClass572_Sub15_2940.o * -1585139053) >= 5) {
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						int i_53_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readUnsignedByte(-111886911);
						int i_54_ = ((Class278_Sub1) this).aClass572_Sub15_2940.readInt(72425361);
						boolean bool_55_ = (i_54_ & ~0x7fffffff) != 0;
						int i_56_ = i_54_ & 0x7fffffff;
						long l = (long) i_56_ + ((long) i_53_ << 32);
						if (bool_55_) {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2946.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if (l == (class572_sub12_sub16_sub2.aLong9093 * -1521258394346526139L)) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						} else {
							Iterator iterator = ((Class278_Sub1) this).aClass664_2935.iterator();
							while (iterator.hasNext()) {
								Class572_Sub12_Sub16_Sub2 class572_sub12_sub16_sub2 = ((Class572_Sub12_Sub16_Sub2) iterator.next());
								if ((-1521258394346526139L * class572_sub12_sub16_sub2.aLong9093) == l) {
									((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = class572_sub12_sub16_sub2;
									break;
								}
							}
						}
						if (null == (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937))
							throw new IOException();
						((Class278_Sub1) this).anInt2939 = 1626227399;
						((Class278_Sub1) this).aClass572_Sub15_2940.o = 0;
						((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
					}
				} else {
					RSByteBuffer class572_sub15 = (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737);
					if (null == class572_sub15) {
						int i_57_ = 5 - (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053;
						if (i_57_ > i_50_)
							i_57_ = i_50_;
						((Class278_Sub1) this).aClass555_9502.method6560((((Class278_Sub1) this).aClass572_Sub15_2928.b), (((Class278_Sub1) this).aClass572_Sub15_2928.o) * -1585139053, i_57_, 1284589011);
						if (((Class278_Sub1) this).aByte2941 != 0) {
							for (int i_58_ = 0; i_58_ < i_57_; i_58_++)
								((Class278_Sub1) this).aClass572_Sub15_2928.b[-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) + i_58_] ^= ((Class278_Sub1) this).aByte2941;
						}
						((Class278_Sub1) this).aClass572_Sub15_2928.o += i_57_ * 310393755;
						if (-1585139053 * (((Class278_Sub1) this).aClass572_Sub15_2928.o) >= 5) {
							((Class278_Sub1) this).aClass572_Sub15_2928.o = 0;
							int i_59_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readUnsignedByte(1830802599);
							int i_60_ = ((Class278_Sub1) this).aClass572_Sub15_2928.readInt(1080948199);
							int i_61_ = 5;
							if (i_59_ != Class281.aClass281_3219.getId(2101140875))
								i_61_ = 9;
							class572_sub15 = ((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aClass572_Sub15_11737 = (new RSByteBuffer(i_61_ + i_60_ + (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736)));
							class572_sub15.writeByte(i_59_, -1384395473);
							class572_sub15.writeInt(i_60_, -1743753997);
							((Class278_Sub1) this).anInt2939 += 1626227399;
						}
					} else {
						int i_62_ = (class572_sub15.b.length - (((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aByte11736));
						int i_63_ = (512 - 565402323 * ((Class278_Sub1) this).anInt2939);
						if (i_63_ > i_62_ - class572_sub15.o * -1585139053)
							i_63_ = (i_62_ - -1585139053 * class572_sub15.o);
						if (i_63_ > i_50_)
							i_63_ = i_50_;
						((Class278_Sub1) this).aClass555_9502.method6560(class572_sub15.b, class572_sub15.o * -1585139053, i_63_, 2032208510);
						if (0 != ((Class278_Sub1) this).aByte2941) {
							for (int i_64_ = 0; i_64_ < i_63_; i_64_++)
								class572_sub15.b[i_64_ + (class572_sub15.o * -1585139053)] ^= ((Class278_Sub1) this).aByte2941;
						}
						class572_sub15.o += i_63_ * 310393755;
						((Class278_Sub1) this).anInt2939 += i_63_ * 1184238939;
						if (i_62_ == class572_sub15.o * -1585139053) {
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937.method8412(724585842);
							((Class572_Sub12_Sub16_Sub2) (((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937)).aBool11476 = false;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						} else if (512 == (((Class278_Sub1) this).anInt2939 * 565402323)) {
							((Class278_Sub1) this).anInt2939 = 0;
							((Class278_Sub1) this).aClass572_Sub12_Sub16_Sub2_2937 = null;
						}
					}
				}
			}
			bool = true;
		} catch (IOException ioexception) {
			try {
				((Class278_Sub1) this).aClass555_9502.method6558(703719362);
			} catch (Exception exception) {
				/* empty */
			}
			((Class278_Sub1) this).aClass555_9502 = null;
			anInt2942 += 201210999;
			anInt2943 = 691734686;
			if (method3728(-120047399) == 0 && method3730(502496441) == 0)
				return true;
			return false;
		}
		return bool;
	}

	void method8869() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(6, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.write24BitInteger(3, -1780800199);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeShort(0, -1548031794);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	void method8870() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(6, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.write24BitInteger(3, -1704359719);
				((Class278_Sub1) this).aClass572_Sub15_2947.writeShort(0, -1146827005);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	public void method3753() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(7, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(0L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	public void method3751(boolean bool) {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(bool ? 2 : 3, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(0L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	public void method3752() {
		if (null != ((Class278_Sub1) this).aClass555_9502) {
			try {
				((Class278_Sub1) this).aClass572_Sub15_2947.o = 0;
				((Class278_Sub1) this).aClass572_Sub15_2947.writeByte(7, -1384395473);
				((Class278_Sub1) this).aClass572_Sub15_2947.method8456(0L);
				((Class278_Sub1) this).aClass555_9502.method6570((((Class278_Sub1) this).aClass572_Sub15_2947.b), 0, (((Class278_Sub1) this).aClass572_Sub15_2947.b).length, (byte) 100);
			} catch (IOException ioexception) {
				try {
					((Class278_Sub1) this).aClass555_9502.method6558(703719362);
				} catch (Exception exception) {
					/* empty */
				}
				((Class278_Sub1) this).aClass555_9502 = null;
				anInt2942 += 201210999;
				anInt2943 = 691734686;
			}
		}
	}

	public void method3724() {
		if (((Class278_Sub1) this).aClass555_9502 != null)
			((Class278_Sub1) this).aClass555_9502.method6564(2134812139);
	}

	public static void method8871(int i, int i_65_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(22, (long) i);
		class572_sub12_sub11.method10384(-1681407758);
	}
}

package game;

/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Class256 {
	static Class675 aClass675_2765 = new Class675();

	public static void method3527(Class572_Sub15_Sub2 class572_sub15_sub2) {
		Class572_Sub6 class572_sub6 = (Class572_Sub6) aClass675_2765.method7932((byte) 50);
		if (class572_sub6 != null) {
			int i = -1585139053 * class572_sub15_sub2.o;
			class572_sub15_sub2.writeInt((-2010197365 * (((Class572_Sub6) class572_sub6).anInt9069)), -1743753997);
			for (int i_0_ = 0; i_0_ < ((Class572_Sub6) class572_sub6).anInt9064 * -524685311; i_0_++) {
				if (((Class572_Sub6) class572_sub6).anIntArray9066[i_0_] != 0)
					class572_sub15_sub2.writeByte((((Class572_Sub6) class572_sub6).anIntArray9066[i_0_]), -1384395473);
				else {
					try {
						int i_1_ = (((Class572_Sub6) class572_sub6).anIntArray9065[i_0_]);
						if (0 == i_1_) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_0_]);
							int i_2_ = field.getInt(null);
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_2_, -1743753997);
						} else if (i_1_ == 1) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_0_]);
							field.setInt(null, (((Class572_Sub6) class572_sub6).anIntArray9068[i_0_]));
							class572_sub15_sub2.writeByte(0, -1384395473);
						} else if (i_1_ == 2) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_0_]);
							int i_3_ = field.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_3_, -1743753997);
						}
						if (3 == i_1_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_0_]);
							byte[][] is = (((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070[i_0_]);
							Object[] objects = new Object[is.length];
							for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_4_])));
								objects[i_4_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (object == null)
								class572_sub15_sub2.writeByte(0, -1384395473);
							else if (object instanceof Number) {
								class572_sub15_sub2.writeByte(1, -1384395473);
								class572_sub15_sub2.method8514(((Number) object).longValue());
							} else if (object instanceof String) {
								class572_sub15_sub2.writeByte(2, -1384395473);
								class572_sub15_sub2.writeString((String) object, (byte) -87);
							} else
								class572_sub15_sub2.writeByte(4, -1384395473);
						} else if (4 == i_1_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_0_]);
							int i_5_ = method.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_5_, -1743753997);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class572_sub15_sub2.writeByte(-10, -1384395473);
					} catch (InvalidClassException invalidclassexception) {
						class572_sub15_sub2.writeByte(-11, -1384395473);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class572_sub15_sub2.writeByte(-12, -1384395473);
					} catch (OptionalDataException optionaldataexception) {
						class572_sub15_sub2.writeByte(-13, -1384395473);
					} catch (IllegalAccessException illegalaccessexception) {
						class572_sub15_sub2.writeByte(-14, -1384395473);
					} catch (IllegalArgumentException illegalargumentexception) {
						class572_sub15_sub2.writeByte(-15, -1384395473);
					} catch (InvocationTargetException invocationtargetexception) {
						class572_sub15_sub2.writeByte(-16, -1384395473);
					} catch (SecurityException securityexception) {
						class572_sub15_sub2.writeByte(-17, -1384395473);
					} catch (IOException ioexception) {
						class572_sub15_sub2.writeByte(-18, -1384395473);
					} catch (NullPointerException nullpointerexception) {
						class572_sub15_sub2.writeByte(-19, -1384395473);
					} catch (Exception exception) {
						class572_sub15_sub2.writeByte(-20, -1384395473);
					} catch (Throwable throwable) {
						class572_sub15_sub2.writeByte(-21, -1384395473);
					}
				}
			}
			class572_sub15_sub2.method8521(i, 1800211053);
			class572_sub6.method6794((byte) 77);
		}
	}

	public static void method3528() {
		aClass675_2765 = new Class675();
	}

	public static void method3529() {
		aClass675_2765 = new Class675();
	}

	public static void method3530(RSByteBuffer class572_sub15, int i) {
		Class572_Sub6 class572_sub6 = new Class572_Sub6();
		((Class572_Sub6) class572_sub6).anInt9064 = class572_sub15.readUnsignedByte(724739840) * -532279295;
		((Class572_Sub6) class572_sub6).anInt9069 = class572_sub15.readInt(780764631) * -2071624413;
		((Class572_Sub6) class572_sub6).anIntArray9065 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).anIntArray9066 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aFieldArray9067 = (new Field[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).anIntArray9068 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aMethodArray9063 = (new Method[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070 = (new byte[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064][][]);
		for (int i_6_ = 0; i_6_ < -524685311 * ((Class572_Sub6) class572_sub6).anInt9064; i_6_++) {
			try {
				int i_7_ = class572_sub15.readUnsignedByte(689183116);
				if (0 == i_7_ || i_7_ == 1 || i_7_ == 2) {
					String string = class572_sub15.readString(1295706626);
					String string_8_ = class572_sub15.readString(1295706626);
					int i_9_ = 0;
					if (1 == i_7_)
						i_9_ = class572_sub15.readInt(-355233572);
					((Class572_Sub6) class572_sub6).anIntArray9065[i_6_] = i_7_;
					((Class572_Sub6) class572_sub6).anIntArray9068[i_6_] = i_9_;
					if (Class374.method4619(string, -509878387).getClassLoader() == null)
						throw new SecurityException();
					((Class572_Sub6) class572_sub6).aFieldArray9067[i_6_] = Class374.method4619(string, 1643176931).getDeclaredField(string_8_);
				} else if (i_7_ == 3 || 4 == i_7_) {
					String string = class572_sub15.readString(1295706626);
					String string_10_ = class572_sub15.readString(1295706626);
					int i_11_ = class572_sub15.readUnsignedByte(533787050);
					String[] strings = new String[i_11_];
					for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
						strings[i_12_] = class572_sub15.readString(1295706626);
					String string_13_ = class572_sub15.readString(1295706626);
					byte[][] is = new byte[i_11_][];
					if (i_7_ == 3) {
						for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
							int i_15_ = class572_sub15.readInt(-610675368);
							is[i_14_] = new byte[i_15_];
							class572_sub15.readBytes(is[i_14_], 0, i_15_, 1157712089);
						}
					}
					((Class572_Sub6) class572_sub6).anIntArray9065[i_6_] = i_7_;
					Class[] var_classes = new Class[i_11_];
					for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
						var_classes[i_16_] = Class374.method4619(strings[i_16_], -1171707559);
					Class var_class = Class374.method4619(string_13_, -1220632827);
					if (Class374.method4619(string, 347204057).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class374.method4619(string, 1973218221).getDeclaredMethods();
					Method[] methods_17_ = methods;
					for (int i_18_ = 0; i_18_ < methods_17_.length; i_18_++) {
						Method method = methods_17_[i_18_];
						if (method.getName().equals(string_10_)) {
							Class[] var_classes_19_ = method.getParameterTypes();
							if (var_classes_19_.length == var_classes.length) {
								boolean bool = true;
								for (int i_20_ = 0; i_20_ < var_classes.length; i_20_++) {
									if (var_classes_19_[i_20_] != var_classes[i_20_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									((Class572_Sub6) class572_sub6).aMethodArray9063[i_6_] = method;
							}
						}
					}
					((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070[i_6_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_6_] = -1;
			} catch (SecurityException securityexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_6_] = -2;
			} catch (NullPointerException nullpointerexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_6_] = -3;
			} catch (Exception exception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_6_] = -4;
			} catch (Throwable throwable) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_6_] = -5;
			}
		}
		aClass675_2765.method7940(class572_sub6, -1627170158);
	}

	public static void method3531(Class572_Sub15_Sub2 class572_sub15_sub2) {
		Class572_Sub6 class572_sub6 = (Class572_Sub6) aClass675_2765.method7932((byte) 50);
		if (class572_sub6 != null) {
			int i = -1585139053 * class572_sub15_sub2.o;
			class572_sub15_sub2.writeInt((-2010197365 * (((Class572_Sub6) class572_sub6).anInt9069)), -1743753997);
			for (int i_21_ = 0; (i_21_ < ((Class572_Sub6) class572_sub6).anInt9064 * -524685311); i_21_++) {
				if (((Class572_Sub6) class572_sub6).anIntArray9066[i_21_] != 0)
					class572_sub15_sub2.writeByte((((Class572_Sub6) class572_sub6).anIntArray9066[i_21_]), -1384395473);
				else {
					try {
						int i_22_ = (((Class572_Sub6) class572_sub6).anIntArray9065[i_21_]);
						if (0 == i_22_) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_21_]);
							int i_23_ = field.getInt(null);
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_23_, -1743753997);
						} else if (i_22_ == 1) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_21_]);
							field.setInt(null, (((Class572_Sub6) class572_sub6).anIntArray9068[i_21_]));
							class572_sub15_sub2.writeByte(0, -1384395473);
						} else if (i_22_ == 2) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_21_]);
							int i_24_ = field.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_24_, -1743753997);
						}
						if (3 == i_22_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_21_]);
							byte[][] is = (((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070[i_21_]);
							Object[] objects = new Object[is.length];
							for (int i_25_ = 0; i_25_ < is.length; i_25_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_25_])));
								objects[i_25_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (object == null)
								class572_sub15_sub2.writeByte(0, -1384395473);
							else if (object instanceof Number) {
								class572_sub15_sub2.writeByte(1, -1384395473);
								class572_sub15_sub2.method8514(((Number) object).longValue());
							} else if (object instanceof String) {
								class572_sub15_sub2.writeByte(2, -1384395473);
								class572_sub15_sub2.writeString((String) object, (byte) -109);
							} else
								class572_sub15_sub2.writeByte(4, -1384395473);
						} else if (4 == i_22_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_21_]);
							int i_26_ = method.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_26_, -1743753997);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class572_sub15_sub2.writeByte(-10, -1384395473);
					} catch (InvalidClassException invalidclassexception) {
						class572_sub15_sub2.writeByte(-11, -1384395473);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class572_sub15_sub2.writeByte(-12, -1384395473);
					} catch (OptionalDataException optionaldataexception) {
						class572_sub15_sub2.writeByte(-13, -1384395473);
					} catch (IllegalAccessException illegalaccessexception) {
						class572_sub15_sub2.writeByte(-14, -1384395473);
					} catch (IllegalArgumentException illegalargumentexception) {
						class572_sub15_sub2.writeByte(-15, -1384395473);
					} catch (InvocationTargetException invocationtargetexception) {
						class572_sub15_sub2.writeByte(-16, -1384395473);
					} catch (SecurityException securityexception) {
						class572_sub15_sub2.writeByte(-17, -1384395473);
					} catch (IOException ioexception) {
						class572_sub15_sub2.writeByte(-18, -1384395473);
					} catch (NullPointerException nullpointerexception) {
						class572_sub15_sub2.writeByte(-19, -1384395473);
					} catch (Exception exception) {
						class572_sub15_sub2.writeByte(-20, -1384395473);
					} catch (Throwable throwable) {
						class572_sub15_sub2.writeByte(-21, -1384395473);
					}
				}
			}
			class572_sub15_sub2.method8521(i, 1800211053);
			class572_sub6.method6794((byte) -22);
		}
	}

	Class256() throws Throwable {
		throw new Error();
	}

	public static void method3532(Class572_Sub15_Sub2 class572_sub15_sub2) {
		Class572_Sub6 class572_sub6 = (Class572_Sub6) aClass675_2765.method7932((byte) 50);
		if (class572_sub6 != null) {
			int i = -1585139053 * class572_sub15_sub2.o;
			class572_sub15_sub2.writeInt((-2010197365 * (((Class572_Sub6) class572_sub6).anInt9069)), -1743753997);
			for (int i_27_ = 0; (i_27_ < ((Class572_Sub6) class572_sub6).anInt9064 * -524685311); i_27_++) {
				if (((Class572_Sub6) class572_sub6).anIntArray9066[i_27_] != 0)
					class572_sub15_sub2.writeByte((((Class572_Sub6) class572_sub6).anIntArray9066[i_27_]), -1384395473);
				else {
					try {
						int i_28_ = (((Class572_Sub6) class572_sub6).anIntArray9065[i_27_]);
						if (0 == i_28_) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_27_]);
							int i_29_ = field.getInt(null);
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_29_, -1743753997);
						} else if (i_28_ == 1) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_27_]);
							field.setInt(null, (((Class572_Sub6) class572_sub6).anIntArray9068[i_27_]));
							class572_sub15_sub2.writeByte(0, -1384395473);
						} else if (i_28_ == 2) {
							Field field = (((Class572_Sub6) class572_sub6).aFieldArray9067[i_27_]);
							int i_30_ = field.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_30_, -1743753997);
						}
						if (3 == i_28_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_27_]);
							byte[][] is = (((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070[i_27_]);
							Object[] objects = new Object[is.length];
							for (int i_31_ = 0; i_31_ < is.length; i_31_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_31_])));
								objects[i_31_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (object == null)
								class572_sub15_sub2.writeByte(0, -1384395473);
							else if (object instanceof Number) {
								class572_sub15_sub2.writeByte(1, -1384395473);
								class572_sub15_sub2.method8514(((Number) object).longValue());
							} else if (object instanceof String) {
								class572_sub15_sub2.writeByte(2, -1384395473);
								class572_sub15_sub2.writeString((String) object, (byte) -103);
							} else
								class572_sub15_sub2.writeByte(4, -1384395473);
						} else if (4 == i_28_) {
							Method method = (((Class572_Sub6) class572_sub6).aMethodArray9063[i_27_]);
							int i_32_ = method.getModifiers();
							class572_sub15_sub2.writeByte(0, -1384395473);
							class572_sub15_sub2.writeInt(i_32_, -1743753997);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class572_sub15_sub2.writeByte(-10, -1384395473);
					} catch (InvalidClassException invalidclassexception) {
						class572_sub15_sub2.writeByte(-11, -1384395473);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class572_sub15_sub2.writeByte(-12, -1384395473);
					} catch (OptionalDataException optionaldataexception) {
						class572_sub15_sub2.writeByte(-13, -1384395473);
					} catch (IllegalAccessException illegalaccessexception) {
						class572_sub15_sub2.writeByte(-14, -1384395473);
					} catch (IllegalArgumentException illegalargumentexception) {
						class572_sub15_sub2.writeByte(-15, -1384395473);
					} catch (InvocationTargetException invocationtargetexception) {
						class572_sub15_sub2.writeByte(-16, -1384395473);
					} catch (SecurityException securityexception) {
						class572_sub15_sub2.writeByte(-17, -1384395473);
					} catch (IOException ioexception) {
						class572_sub15_sub2.writeByte(-18, -1384395473);
					} catch (NullPointerException nullpointerexception) {
						class572_sub15_sub2.writeByte(-19, -1384395473);
					} catch (Exception exception) {
						class572_sub15_sub2.writeByte(-20, -1384395473);
					} catch (Throwable throwable) {
						class572_sub15_sub2.writeByte(-21, -1384395473);
					}
				}
			}
			class572_sub15_sub2.method8521(i, 1800211053);
			class572_sub6.method6794((byte) -105);
		}
	}

	public static void method3533(RSByteBuffer class572_sub15, int i) {
		Class572_Sub6 class572_sub6 = new Class572_Sub6();
		((Class572_Sub6) class572_sub6).anInt9064 = class572_sub15.readUnsignedByte(1459305974) * -532279295;
		((Class572_Sub6) class572_sub6).anInt9069 = class572_sub15.readInt(-500763221) * -2071624413;
		((Class572_Sub6) class572_sub6).anIntArray9065 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).anIntArray9066 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aFieldArray9067 = (new Field[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).anIntArray9068 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aMethodArray9063 = (new Method[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070 = (new byte[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064][][]);
		for (int i_33_ = 0; i_33_ < -524685311 * ((Class572_Sub6) class572_sub6).anInt9064; i_33_++) {
			try {
				int i_34_ = class572_sub15.readUnsignedByte(2133946968);
				if (0 == i_34_ || i_34_ == 1 || i_34_ == 2) {
					String string = class572_sub15.readString(1295706626);
					String string_35_ = class572_sub15.readString(1295706626);
					int i_36_ = 0;
					if (1 == i_34_)
						i_36_ = class572_sub15.readInt(696358513);
					((Class572_Sub6) class572_sub6).anIntArray9065[i_33_] = i_34_;
					((Class572_Sub6) class572_sub6).anIntArray9068[i_33_] = i_36_;
					if (Class374.method4619(string, 2038311145).getClassLoader() == null)
						throw new SecurityException();
					((Class572_Sub6) class572_sub6).aFieldArray9067[i_33_] = Class374.method4619(string, 1686829472).getDeclaredField(string_35_);
				} else if (i_34_ == 3 || 4 == i_34_) {
					String string = class572_sub15.readString(1295706626);
					String string_37_ = class572_sub15.readString(1295706626);
					int i_38_ = class572_sub15.readUnsignedByte(1306871819);
					String[] strings = new String[i_38_];
					for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
						strings[i_39_] = class572_sub15.readString(1295706626);
					String string_40_ = class572_sub15.readString(1295706626);
					byte[][] is = new byte[i_38_][];
					if (i_34_ == 3) {
						for (int i_41_ = 0; i_41_ < i_38_; i_41_++) {
							int i_42_ = class572_sub15.readInt(1120959143);
							is[i_41_] = new byte[i_42_];
							class572_sub15.readBytes(is[i_41_], 0, i_42_, 1529872473);
						}
					}
					((Class572_Sub6) class572_sub6).anIntArray9065[i_33_] = i_34_;
					Class[] var_classes = new Class[i_38_];
					for (int i_43_ = 0; i_43_ < i_38_; i_43_++)
						var_classes[i_43_] = Class374.method4619(strings[i_43_], 1684389971);
					Class var_class = Class374.method4619(string_40_, 314934018);
					if (Class374.method4619(string, -1219079180).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class374.method4619(string, -406885601).getDeclaredMethods();
					Method[] methods_44_ = methods;
					for (int i_45_ = 0; i_45_ < methods_44_.length; i_45_++) {
						Method method = methods_44_[i_45_];
						if (method.getName().equals(string_37_)) {
							Class[] var_classes_46_ = method.getParameterTypes();
							if (var_classes_46_.length == var_classes.length) {
								boolean bool = true;
								for (int i_47_ = 0; i_47_ < var_classes.length; i_47_++) {
									if (var_classes_46_[i_47_] != var_classes[i_47_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									((Class572_Sub6) class572_sub6).aMethodArray9063[i_33_] = method;
							}
						}
					}
					((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070[i_33_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_33_] = -1;
			} catch (SecurityException securityexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_33_] = -2;
			} catch (NullPointerException nullpointerexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_33_] = -3;
			} catch (Exception exception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_33_] = -4;
			} catch (Throwable throwable) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_33_] = -5;
			}
		}
		aClass675_2765.method7940(class572_sub6, -2007691440);
	}

	public static void method3534(RSByteBuffer class572_sub15, int i) {
		Class572_Sub6 class572_sub6 = new Class572_Sub6();
		((Class572_Sub6) class572_sub6).anInt9064 = class572_sub15.readUnsignedByte(1119563098) * -532279295;
		((Class572_Sub6) class572_sub6).anInt9069 = class572_sub15.readInt(-615387216) * -2071624413;
		((Class572_Sub6) class572_sub6).anIntArray9065 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).anIntArray9066 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aFieldArray9067 = (new Field[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).anIntArray9068 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aMethodArray9063 = (new Method[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070 = (new byte[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064][][]);
		for (int i_48_ = 0; i_48_ < -524685311 * ((Class572_Sub6) class572_sub6).anInt9064; i_48_++) {
			try {
				int i_49_ = class572_sub15.readUnsignedByte(-55717390);
				if (0 == i_49_ || i_49_ == 1 || i_49_ == 2) {
					String string = class572_sub15.readString(1295706626);
					String string_50_ = class572_sub15.readString(1295706626);
					int i_51_ = 0;
					if (1 == i_49_)
						i_51_ = class572_sub15.readInt(1153489203);
					((Class572_Sub6) class572_sub6).anIntArray9065[i_48_] = i_49_;
					((Class572_Sub6) class572_sub6).anIntArray9068[i_48_] = i_51_;
					if (Class374.method4619(string, 575733868).getClassLoader() == null)
						throw new SecurityException();
					((Class572_Sub6) class572_sub6).aFieldArray9067[i_48_] = Class374.method4619(string, -1333145066).getDeclaredField(string_50_);
				} else if (i_49_ == 3 || 4 == i_49_) {
					String string = class572_sub15.readString(1295706626);
					String string_52_ = class572_sub15.readString(1295706626);
					int i_53_ = class572_sub15.readUnsignedByte(482033719);
					String[] strings = new String[i_53_];
					for (int i_54_ = 0; i_54_ < i_53_; i_54_++)
						strings[i_54_] = class572_sub15.readString(1295706626);
					String string_55_ = class572_sub15.readString(1295706626);
					byte[][] is = new byte[i_53_][];
					if (i_49_ == 3) {
						for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
							int i_57_ = class572_sub15.readInt(-594496091);
							is[i_56_] = new byte[i_57_];
							class572_sub15.readBytes(is[i_56_], 0, i_57_, 1286621048);
						}
					}
					((Class572_Sub6) class572_sub6).anIntArray9065[i_48_] = i_49_;
					Class[] var_classes = new Class[i_53_];
					for (int i_58_ = 0; i_58_ < i_53_; i_58_++)
						var_classes[i_58_] = Class374.method4619(strings[i_58_], 88803139);
					Class var_class = Class374.method4619(string_55_, -928388116);
					if (Class374.method4619(string, -746776520).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class374.method4619(string, -1401212309).getDeclaredMethods();
					Method[] methods_59_ = methods;
					for (int i_60_ = 0; i_60_ < methods_59_.length; i_60_++) {
						Method method = methods_59_[i_60_];
						if (method.getName().equals(string_52_)) {
							Class[] var_classes_61_ = method.getParameterTypes();
							if (var_classes_61_.length == var_classes.length) {
								boolean bool = true;
								for (int i_62_ = 0; i_62_ < var_classes.length; i_62_++) {
									if (var_classes_61_[i_62_] != var_classes[i_62_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									((Class572_Sub6) class572_sub6).aMethodArray9063[i_48_] = method;
							}
						}
					}
					((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070[i_48_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_48_] = -1;
			} catch (SecurityException securityexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_48_] = -2;
			} catch (NullPointerException nullpointerexception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_48_] = -3;
			} catch (Exception exception) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_48_] = -4;
			} catch (Throwable throwable) {
				((Class572_Sub6) class572_sub6).anIntArray9066[i_48_] = -5;
			}
		}
		aClass675_2765.method7940(class572_sub6, -1599241342);
	}

	public static boolean method3535() {
		Class572_Sub6 class572_sub6 = (Class572_Sub6) aClass675_2765.method7932((byte) 50);
		if (null == class572_sub6)
			return false;
		return true;
	}

	public static Map method3536(Class202_Sub1[] class202_sub1s, byte i) {
		if (class202_sub1s == null || 0 == class202_sub1s.length)
			return null;
		HashMap hashmap = new HashMap();
		Class202_Sub1[] class202_sub1s_63_ = class202_sub1s;
		for (int i_64_ = 0; i_64_ < class202_sub1s_63_.length; i_64_++) {
			Class202_Sub1 class202_sub1 = class202_sub1s_63_[i_64_];
			hashmap.put(class202_sub1.aClass272_9649, class202_sub1);
		}
		return hashmap;
	}

	static final void method3537(Cs2Executor class441, int i) {
		if ((((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407]) == 0)
			((Cs2Executor) class441).instrPtr += (-1866055967 * (((Cs2Executor) class441).anIntArray5124[((Cs2Executor) class441).instrPtr * -1280867039]));
	}

	static final void method3538(Cs2Executor class441, int i) {
		int i_65_ = (((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr -= -1042067865) * 1369304407)]);
		if (client.aString8887 != null && i_65_ < 1174928641 * Class456_Sub1_Sub1_Sub1.anInt11558)
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = Class328.aClass196Array4209[i_65_].aByte2348;
		else
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = 0;
	}

	public static void method3539(int i, byte i_66_) {
		Class22 class22 = (Class22) Class547_Sub1.aHashMap8980.get(Integer.valueOf(i));
		if (class22 == null)
			class22 = new Class22();
		((Class22) class22).anInt149 = -2110469659 * Class547_Sub1.anInt9000;
		((Class22) class22).anInt150 = Class547_Sub1.anInt8993 * 545644611;
		Class547_Sub1.aHashMap8980.put(Integer.valueOf(i), class22);
	}

	public static void method3540(int i, int i_67_) {
		GameTask class572_sub12_sub11 = Class665_Sub15.createGameTask(7, (long) i);
		class572_sub12_sub11.method10384(-1806434350);
	}
}

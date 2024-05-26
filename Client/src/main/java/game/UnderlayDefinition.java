package game;

/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UnderlayDefinition {
	Class83 aClass83_5134;
	InterfaceDefinitions aClass73_5135;

	boolean method5282(int i, int i_0_, int i_1_) {
		InterfaceDefinitions class73 = Class530.method6338(i, i_0_, 831745809);
		if (null != class73) {
			((UnderlayDefinition) this).aClass83_5134 = Class534.aClass83Array5975[i >> 16];
			((UnderlayDefinition) this).aClass73_5135 = class73;
			return true;
		}
		method5284(-215816077);
		return false;
	}

	InterfaceDefinitions method5283(int i) {
		return ((UnderlayDefinition) this).aClass83_5134.method1256((-1718435171 * (((UnderlayDefinition) this).aClass73_5135.selfId)), -177566970);
	}

	void method5284(int i) {
		((UnderlayDefinition) this).aClass83_5134 = null;
		((UnderlayDefinition) this).aClass73_5135 = null;
	}

	boolean method5285(Class83 class83, int i, int i_2_, byte i_3_) {
		if (class83 != null) {
			InterfaceDefinitions class73 = class83.method1256(i, -746804778);
			if (null != class73) {
				((UnderlayDefinition) this).aClass83_5134 = class83;
				((UnderlayDefinition) this).aClass73_5135 = class73;
				return true;
			}
		}
		method5284(-215816077);
		return false;
	}

	boolean method5286(int i, int i_4_) {
		InterfaceDefinitions class73 = Class530.method6338(i, i_4_, 1807410069);
		if (null != class73) {
			((UnderlayDefinition) this).aClass83_5134 = Class534.aClass83Array5975[i >> 16];
			((UnderlayDefinition) this).aClass73_5135 = class73;
			return true;
		}
		method5284(-215816077);
		return false;
	}

	UnderlayDefinition() {
		/* empty */
	}

	void method5287() {
		((UnderlayDefinition) this).aClass83_5134 = null;
		((UnderlayDefinition) this).aClass73_5135 = null;
	}

	public static void method5288(RSByteBuffer class572_sub15, int i, int i_5_) {
		Class572_Sub6 class572_sub6 = new Class572_Sub6();
		((Class572_Sub6) class572_sub6).anInt9064 = class572_sub15.readUnsignedByte(1365714889) * -532279295;
		((Class572_Sub6) class572_sub6).anInt9069 = class572_sub15.readInt(1815628411) * -2071624413;
		((Class572_Sub6) class572_sub6).anIntArray9065 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).anIntArray9066 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aFieldArray9067 = (new Field[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).anIntArray9068 = new int[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064];
		((Class572_Sub6) class572_sub6).aMethodArray9063 = (new Method[((Class572_Sub6) class572_sub6).anInt9064 * -524685311]);
		((Class572_Sub6) class572_sub6).aByteArrayArrayArray9070 = (new byte[-524685311 * ((Class572_Sub6) class572_sub6).anInt9064][][]);
		for (int i_6_ = 0; i_6_ < -524685311 * ((Class572_Sub6) class572_sub6).anInt9064; i_6_++) {
			try {
				int i_7_ = class572_sub15.readUnsignedByte(1140247084);
				if (0 == i_7_ || i_7_ == 1 || i_7_ == 2) {
					String string = class572_sub15.readString(1295706626);
					String string_8_ = class572_sub15.readString(1295706626);
					int i_9_ = 0;
					if (1 == i_7_)
						i_9_ = class572_sub15.readInt(177657801);
					((Class572_Sub6) class572_sub6).anIntArray9065[i_6_] = i_7_;
					((Class572_Sub6) class572_sub6).anIntArray9068[i_6_] = i_9_;
					if (Class374.method4619(string, 829202268).getClassLoader() == null)
						throw new SecurityException();
					((Class572_Sub6) class572_sub6).aFieldArray9067[i_6_] = Class374.method4619(string, 276272548).getDeclaredField(string_8_);
				} else if (i_7_ == 3 || 4 == i_7_) {
					String string = class572_sub15.readString(1295706626);
					String string_10_ = class572_sub15.readString(1295706626);
					int i_11_ = class572_sub15.readUnsignedByte(1553212671);
					String[] strings = new String[i_11_];
					for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
						strings[i_12_] = class572_sub15.readString(1295706626);
					String string_13_ = class572_sub15.readString(1295706626);
					byte[][] is = new byte[i_11_][];
					if (i_7_ == 3) {
						for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
							int i_15_ = class572_sub15.readInt(1222016947);
							is[i_14_] = new byte[i_15_];
							class572_sub15.readBytes(is[i_14_], 0, i_15_, 1784070766);
						}
					}
					((Class572_Sub6) class572_sub6).anIntArray9065[i_6_] = i_7_;
					Class[] var_classes = new Class[i_11_];
					for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
						var_classes[i_16_] = Class374.method4619(strings[i_16_], 2067914683);
					Class var_class = Class374.method4619(string_13_, 995645028);
					if (Class374.method4619(string, 1146241444).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class374.method4619(string, 549785085).getDeclaredMethods();
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
		Class256.aClass675_2765.method7940(class572_sub6, -2044275544);
	}
}

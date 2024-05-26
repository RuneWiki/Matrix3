package game;

/* Class567 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class567 implements Interface67 {
	Class248 aClass248_6376;
	String aString6377;
	Hashtable aHashtable6378 = new Hashtable();
	Hashtable aHashtable6379 = new Hashtable();
	static int anInt6380;

	public int method6718(String string, byte i) throws Exception_Sub5 {
		if (((Class567) this).aHashtable6378.containsKey(string))
			return 100;
		String string_0_ = Class305.method4013(string, (byte) 54);
		if (string_0_ == null)
			throw new Exception_Sub5(1, string);
		String string_1_ = null;
		if (string_1_ == null) {
			string_1_ = new StringBuilder().append(((Class567) this).aString6377).append(string_0_).toString();
			if (null == ((Class567) this).aClass248_6376 || !((Class567) this).aClass248_6376.method3395(string_1_, "", (byte) -74))
				throw new Exception_Sub5(2, string);
		}
		if (!((Class567) this).aClass248_6376.method3387(string_1_, (byte) -70))
			return ((Class567) this).aClass248_6376.method3386(string_1_, (byte) -22);
		byte[] is = ((Class567) this).aClass248_6376.method3384(string_1_, "", 865780305);
		if (is == null)
			throw new Exception_Sub5(3, string);
		Object object = null;
		File file;
		try {
			file = Class343.method4305(string_0_, -1813939684);
		} catch (RuntimeException runtimeexception) {
			throw new Exception_Sub5(4, string, runtimeexception);
		}
		if (null == file)
			throw new Exception_Sub5(5, string);
		boolean bool = true;
		byte[] is_2_ = Class128.method2259(file, (byte) -51);
		if (null != is_2_ && is_2_.length == is.length) {
			for (int i_3_ = 0; i_3_ < is_2_.length; i_3_++) {
				if (is_2_[i_3_] != is[i_3_]) {
					bool = false;
					break;
				}
			}
		} else
			bool = false;
		if (!bool) {
			try {
				FileOutputStream fileoutputstream = new FileOutputStream(file);
				fileoutputstream.write(is, 0, is.length);
				fileoutputstream.close();
			} catch (Throwable throwable) {
				throw new Exception_Sub5(6, string, throwable);
			}
		}
		method6720(string, file, 1378449283);
		return 100;
	}

	public void method420(String string) throws Exception_Sub7 {
		method6719(string, Class550.class, -1502914909);
	}

	public boolean method418(String string, int i) {
		return ((Class567) this).aHashtable6378.containsKey(string);
	}

	public void method421(String string, byte i) throws Exception_Sub7 {
		method6719(string, Class550.class, -1976608930);
	}

	void method6719(String string, Class var_class, int i) throws Exception_Sub7 {
		Class var_class_4_ = (Class) ((Class567) this).aHashtable6379.get(string);
		if (null != var_class_4_ && var_class_4_.getClassLoader() != var_class.getClassLoader())
			throw new Exception_Sub7(1, string);
		File file = null;
		if (null == file)
			file = (File) ((Class567) this).aHashtable6378.get(string);
		if (file != null) {
			try {
				file = new File(file.getCanonicalPath());
				Class var_class_5_ = Class.forName("java.lang.Runtime");
				Class var_class_6_ = Class.forName("java.lang.reflect.AccessibleObject");
				Method method = var_class_6_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				Method method_7_ = (var_class_5_.getDeclaredMethod("load0", new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") }));
				method.invoke(method_7_, new Object[] { Boolean.TRUE });
				method_7_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
				method.invoke(method_7_, new Object[] { Boolean.FALSE });
				((Class567) this).aHashtable6379.put(string, var_class);
			} catch (NoSuchMethodException nosuchmethodexception) {
				System.load(file.getPath());
				((Class567) this).aHashtable6379.put(string, Class550.class);
			} catch (Throwable throwable) {
				throw new Exception_Sub7(3, string, throwable);
			}
		} else
			throw new Exception_Sub7(4, string);
	}

	public boolean method419(byte i) {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class567) this).aHashtable6379.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class567) this).aHashtable6379.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_8_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_8_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class567) this).aHashtable6379.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class567) this).aHashtable6378.get(string));
						Class var_class_9_ = ((Class) ((Class567) this).aHashtable6379.get(string));
						Vector vector = ((Vector) field.get(var_class_9_.getClassLoader()));
						for (int i_10_ = 0; i_10_ < vector.size(); i_10_++) {
							try {
								Object object = vector.elementAt(i_10_);
								Field field_11_ = object.getClass().getDeclaredField("name");
								method.invoke(field_11_, new Object[] { Boolean.TRUE });
								try {
									String string_12_ = (String) field_11_.get(object);
									if (null != string_12_ && (string_12_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_13_ = object.getClass().getDeclaredField("handle");
										Method method_14_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_13_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_14_, (new Object[] { Boolean.TRUE }));
										try {
											method_14_.invoke(object, new Object[0]);
											field_13_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_14_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_13_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_11_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((Class567) this).aHashtable6379 = hashtable;
		return ((Class567) this).aHashtable6379.isEmpty();
	}

	public void method422(String string) throws Exception_Sub7 {
		method6719(string, Class550.class, -1961160316);
	}

	public void method417(String string) throws Exception_Sub7 {
		method6719(string, Class550.class, -1237521338);
	}

	public boolean method424(String string) {
		return ((Class567) this).aHashtable6378.containsKey(string);
	}

	public boolean method131() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class567) this).aHashtable6379.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class567) this).aHashtable6379.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_15_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_15_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class567) this).aHashtable6379.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class567) this).aHashtable6378.get(string));
						Class var_class_16_ = ((Class) ((Class567) this).aHashtable6379.get(string));
						Vector vector = ((Vector) field.get(var_class_16_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_17_ = object.getClass().getDeclaredField("name");
								method.invoke(field_17_, new Object[] { Boolean.TRUE });
								try {
									String string_18_ = (String) field_17_.get(object);
									if (null != string_18_ && (string_18_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_19_ = object.getClass().getDeclaredField("handle");
										Method method_20_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_19_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_20_, (new Object[] { Boolean.TRUE }));
										try {
											method_20_.invoke(object, new Object[0]);
											field_19_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_20_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_19_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_17_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((Class567) this).aHashtable6379 = hashtable;
		return ((Class567) this).aHashtable6379.isEmpty();
	}

	public boolean method423() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class567) this).aHashtable6379.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class567) this).aHashtable6379.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_21_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_21_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class567) this).aHashtable6379.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class567) this).aHashtable6378.get(string));
						Class var_class_22_ = ((Class) ((Class567) this).aHashtable6379.get(string));
						Vector vector = ((Vector) field.get(var_class_22_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_23_ = object.getClass().getDeclaredField("name");
								method.invoke(field_23_, new Object[] { Boolean.TRUE });
								try {
									String string_24_ = (String) field_23_.get(object);
									if (null != string_24_ && (string_24_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_25_ = object.getClass().getDeclaredField("handle");
										Method method_26_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_25_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_26_, (new Object[] { Boolean.TRUE }));
										try {
											method_26_.invoke(object, new Object[0]);
											field_25_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_26_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_25_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_23_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((Class567) this).aHashtable6379 = hashtable;
		return ((Class567) this).aHashtable6379.isEmpty();
	}

	public boolean method425() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class567) this).aHashtable6379.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class567) this).aHashtable6379.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_27_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_27_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class567) this).aHashtable6379.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class567) this).aHashtable6378.get(string));
						Class var_class_28_ = ((Class) ((Class567) this).aHashtable6379.get(string));
						Vector vector = ((Vector) field.get(var_class_28_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_29_ = object.getClass().getDeclaredField("name");
								method.invoke(field_29_, new Object[] { Boolean.TRUE });
								try {
									String string_30_ = (String) field_29_.get(object);
									if (null != string_30_ && (string_30_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_31_ = object.getClass().getDeclaredField("handle");
										Method method_32_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_31_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_32_, (new Object[] { Boolean.TRUE }));
										try {
											method_32_.invoke(object, new Object[0]);
											field_31_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_32_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_31_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_29_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((Class567) this).aHashtable6379 = hashtable;
		return ((Class567) this).aHashtable6379.isEmpty();
	}

	void method6720(String string, File file, int i) {
		((Class567) this).aHashtable6378.put(string, file);
	}

	public Class567(Class248 class248) {
		((Class567) this).aClass248_6376 = class248;
		String string = "";
		if (Class589.aString7805.startsWith("win") || Class589.aString7805.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/").toString();
		else if (Class589.aString7805.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/").toString();
		else if (Class589.aString7805.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/").toString();
		if (Class589.aString7806.startsWith("amd64") || Class589.aString7806.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/").toString();
		else if (Class589.aString7806.startsWith("i386") || Class589.aString7806.startsWith("i486") || Class589.aString7806.startsWith("i586") || Class589.aString7806.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/").toString();
		else if (Class589.aString7806.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/").toString();
		else
			string = new StringBuilder().append(string).append("universal/").toString();
		((Class567) this).aString6377 = string;
	}

	public boolean method301() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class567) this).aHashtable6379.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class567) this).aHashtable6379.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_33_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_33_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class567) this).aHashtable6379.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class567) this).aHashtable6378.get(string));
						Class var_class_34_ = ((Class) ((Class567) this).aHashtable6379.get(string));
						Vector vector = ((Vector) field.get(var_class_34_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_35_ = object.getClass().getDeclaredField("name");
								method.invoke(field_35_, new Object[] { Boolean.TRUE });
								try {
									String string_36_ = (String) field_35_.get(object);
									if (null != string_36_ && (string_36_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_37_ = object.getClass().getDeclaredField("handle");
										Method method_38_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_37_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_38_, (new Object[] { Boolean.TRUE }));
										try {
											method_38_.invoke(object, new Object[0]);
											field_37_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_38_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_37_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_35_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((Class567) this).aHashtable6379 = hashtable;
		return ((Class567) this).aHashtable6379.isEmpty();
	}

	public static Class528[] method6721(int i) {
		return (new Class528[] { Class528.aClass528_5900, Class528.aClass528_5901, Class528.aClass528_5897, Class528.aClass528_5902, Class528.aClass528_5898, Class528.aClass528_5899 });
	}

	static final void method6722(Cs2Executor class441, int i) {
		((Cs2Executor) class441).intStackPtr -= 1168763701;
		int i_39_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_40_ = (((Cs2Executor) class441).intStack[1 + ((Cs2Executor) class441).intStackPtr * 1369304407]);
		int i_41_ = (((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 + 2]);
		Class385.method4663(2, i_39_ << 16 | i_40_, i_41_, "", (byte) -60);
	}

	public static void method6723(Class530 class530, int i, int i_42_, short i_43_) {
		Cs2Executor class441 = Class519.getCachedExecutor(-1452806256);
		Class309.method4041(class530, i, i_42_, class441, -627862136);
	}

	static byte[] method6724(File file, int i, int i_44_) {
		byte[] is;
		try {
			byte[] is_45_ = new byte[i];
			Class380.method4643(file, is_45_, i, -185258531);
			is = is_45_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}
}

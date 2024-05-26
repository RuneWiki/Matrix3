package game;

/* Class405_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

import java.util.HashMap;
import java.util.Map;

public class Class405_Sub2 extends Class405 {
	int anInt9920 = 0;
	String aString9921;
	static final int anInt9922 = 35632;
	boolean aBool9923;
	Class406_Sub1 aClass406_Sub1_9924;
	Class106_Sub3_Sub2 aClass106_Sub3_Sub2_9925;
	int anInt9926 = 0;
	int anInt9927 = 0;
	Map aMap9928;
	int[] anIntArray9929;
	String aString9930;
	static float[] aFloatArray9931;
	Map aMap9932;
	Map aMap9933;
	Map aMap9934;
	Map aMap9935;
	static int[] anIntArray9936;
	static final int anInt9937 = 13;
	static final int anInt9938 = 35633;
	static boolean $assertionsDisabled = !Class405_Sub2.class.desiredAssertionStatus();

	void method4831(int i, Class250 class250) {
		OpenGL.glUniform3fv(i, 3, class250.method3480(aFloatArray9931), 0);
	}

	static {
		anIntArray9936 = new int[2];
		aFloatArray9931 = new float[16];
	}

	Class405_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, Class385 class385) {
		((Class405_Sub2) this).aBool9923 = false;
		((Class405_Sub2) this).anIntArray9929 = new int[13];
		((Class405_Sub2) this).aMap9932 = new HashMap();
		((Class405_Sub2) this).aMap9933 = new HashMap();
		((Class405_Sub2) this).aMap9934 = new HashMap();
		((Class405_Sub2) this).aMap9935 = new HashMap();
		((Class405_Sub2) this).aMap9928 = new HashMap();
		aString4753 = class385.aString4616;
		StringBuilder stringbuilder = new StringBuilder();
		if (class385.aString4612 != null) {
			aString4754 = class385.aString4612;
			if (class385.aClass67Array4615 != null) {
				Class67[] class67s = class385.aClass67Array4615;
				for (int i = 0; i < class67s.length; i++) {
					Class67 class67 = class67s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class67.aString690).append(" ").append(class67.aString691).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class106_sub3_sub2.method10120(aString4754)));
			((Class405_Sub2) this).aString9921 = stringbuilder.toString();
		}
		if (class385.aString4614 != null) {
			aString4755 = class385.aString4614;
			stringbuilder.setLength(0);
			if (class385.aClass67Array4613 != null) {
				Class67[] class67s = class385.aClass67Array4613;
				for (int i = 0; i < class67s.length; i++) {
					Class67 class67 = class67s[i];
					stringbuilder.append(new StringBuilder().append("#define ").append(class67.aString690).append(" ").append(class67.aString691).append('\n').toString());
				}
			}
			stringbuilder.append(new String(class106_sub3_sub2.method10120(aString4755)));
			((Class405_Sub2) this).aString9930 = stringbuilder.toString();
		}
		Class432.method5247(((Class405_Sub2) this).anIntArray9929, 0, ((Class405_Sub2) this).anIntArray9929.length, -1);
	}

	public boolean method4803() {
		if (((Class405_Sub2) this).aBool9923)
			return true;
		((Class106_Sub3_Sub2) ((Class405_Sub2) this).aClass106_Sub3_Sub2_9925).aClass405_Sub2_11093 = null;
		((Class405_Sub2) this).anInt9926 = method9367(35633, ((Class405_Sub2) this).aString9921, aString4754);
		((Class405_Sub2) this).anInt9927 = method9367(35632, ((Class405_Sub2) this).aString9930, aString4755);
		if (((Class405_Sub2) this).anInt9926 == 0 || ((Class405_Sub2) this).anInt9927 == 0) {
			if (((Class405_Sub2) this).anInt9926 != 0)
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9926);
			if (((Class405_Sub2) this).anInt9927 != 0)
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9927);
			return false;
		}
		
		
		((Class405_Sub2) this).anInt9920 = OpenGL.glCreateProgram();
		if (((Class405_Sub2) this).anInt9926 != 0)
			OpenGL.glAttachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9926);
		if (((Class405_Sub2) this).anInt9927 != 0)
			OpenGL.glAttachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9927);
		OpenGL.glLinkProgram(((Class405_Sub2) this).anInt9920);
		OpenGL.glGetProgramiv(((Class405_Sub2) this).anInt9920, 35714, anIntArray9936, 0);
		if (anIntArray9936[0] == 0) {
			if (((Class405_Sub2) this).anInt9926 != 0) {
				OpenGL.glDetachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9926);
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9926);
			}
			if (((Class405_Sub2) this).anInt9927 != 0) {
				OpenGL.glDetachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9927);
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9927);
			}
			OpenGL.glDeleteProgram(((Class405_Sub2) this).anInt9920);
			return false;
		}
		OpenGL.glUseProgram(((Class405_Sub2) this).anInt9920);
		int i = -1;
		for (int i_0_ = 0; i_0_ < ((Class405_Sub2) this).aClass406_Sub1_9924.method4909(924827081); i_0_++) {
			if (((Class405_Sub2) this).aClass406_Sub1_9924.method4865(i_0_, 995343880) == this) {
				i = i_0_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_1_ = 0; i_1_ < ((Class405_Sub2) this).aClass406_Sub1_9924.method4911(-565640032); i_1_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub2) this).aClass406_Sub1_9924.method4889(i_1_, (byte) 0);
			if (class572_sub8_sub1 != null)
				class572_sub8_sub1.method10264(i);
		}
		for (int i_2_ = 0; i_2_ < ((Class405_Sub2) this).aClass406_Sub1_9924.method4917(123908557); i_2_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub2) this).aClass406_Sub1_9924.method4887(i_2_, (byte) 12);
			if (class572_sub8_sub1 != null)
				class572_sub8_sub1.method10264(i);
		}
		((Class405_Sub2) this).aString9921 = null;
		((Class405_Sub2) this).aString9930 = null;
		((Class405_Sub2) this).aBool9923 = true;
		return true;
	}

	void method4804(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class572_sub8_sub1.method10266((byte) 102) != Class63.aClass63_571) && (class572_sub8_sub1.method10266((byte) 120) != Class63.aClass63_617))
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method4801(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_3_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_3_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_3_));
				if (class572_sub8_sub1.method10266((byte) 44) != Class63.aClass63_572)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform2f(i, f, f_3_);
			}
		}
	}

	void method4814(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class572_sub8_sub1.method10266((byte) 52) != Class63.aClass63_571) && (class572_sub8_sub1.method10266((byte) 21) != Class63.aClass63_617))
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method4807(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_4_, float f_5_, float f_6_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_4_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_5_ || ((Float) ((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i))).floatValue() != f_6_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_4_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_5_));
				((Class405_Sub2) this).aMap9935.put(Integer.valueOf(i), Float.valueOf(f_6_));
				if (class572_sub8_sub1.method10266((byte) 16) != Class63.aClass63_574)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform4f(i, f, f_4_, f_5_, f_6_);
			}
		}
	}

	void method4808(Class572_Sub8_Sub1 class572_sub8_sub1, float[] fs, int i) {
		int i_7_ = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i_7_ != -1)
			OpenGL.glUniform4fv(i_7_, i, fs, 0);
	}

	void method4809(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 87) != Class63.aClass63_613))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class250.method3471(aFloatArray9931), 0);
	}

	void method4810(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 109) != Class63.aClass63_590))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4806(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_8_, float f_9_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_8_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_9_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_8_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_9_));
				if (class572_sub8_sub1.method10266((byte) 65) != Class63.aClass63_573)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform3f(i, f, f_8_, f_9_);
			}
		}
	}

	void method4843(int i, float f, float f_10_, float f_11_) {
		OpenGL.glUniform3f(i, f, f_10_, f_11_);
	}

	void method4813(int i, float f, float f_12_, float f_13_, float f_14_) {
		OpenGL.glUniform4f(i, f, f_12_, f_13_, f_14_);
	}

	void method4802(int i, float[] fs, int i_15_) {
		OpenGL.glUniform4fv(i, i_15_, fs, 0);
	}

	void method4817(Class572_Sub8_Sub1 class572_sub8_sub1, float[] fs, int i) {
		int i_16_ = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i_16_ != -1)
			OpenGL.glUniform4fv(i_16_, i, fs, 0);
	}

	void method4828(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 113) != Class63.aClass63_590))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4850(int i, Class250 class250) {
		OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4811(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_17_, float f_18_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_17_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_18_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_17_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_18_));
				if (class572_sub8_sub1.method10266((byte) 92) != Class63.aClass63_573)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform3f(i, f, f_17_, f_18_);
			}
		}
	}

	public void method39() {
		if (((Class405_Sub2) this).anInt9920 != 0) {
			((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method10121(((Class405_Sub2) this).anInt9920);
			if (((Class405_Sub2) this).anInt9926 != 0)
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method10116((long) ((Class405_Sub2) this).anInt9926);
			if (((Class405_Sub2) this).anInt9927 != 0)
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method10116((long) ((Class405_Sub2) this).anInt9927);
			((Class405_Sub2) this).anInt9920 = 0;
			((Class405_Sub2) this).anInt9926 = 0;
			((Class405_Sub2) this).anInt9927 = 0;
		}
	}

	public void finalize() {
		method39();
	}

	public boolean method4819() {
		if (((Class405_Sub2) this).aBool9923)
			return true;
		((Class106_Sub3_Sub2) ((Class405_Sub2) this).aClass106_Sub3_Sub2_9925).aClass405_Sub2_11093 = null;
		((Class405_Sub2) this).anInt9926 = method9367(35633, ((Class405_Sub2) this).aString9921, aString4754);
		((Class405_Sub2) this).anInt9927 = method9367(35632, ((Class405_Sub2) this).aString9930, aString4755);
		if (((Class405_Sub2) this).anInt9926 == 0 || ((Class405_Sub2) this).anInt9927 == 0) {
			if (((Class405_Sub2) this).anInt9926 != 0)
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9926);
			if (((Class405_Sub2) this).anInt9927 != 0)
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9927);
			return false;
		}
		((Class405_Sub2) this).anInt9920 = OpenGL.glCreateProgram();
		if (((Class405_Sub2) this).anInt9926 != 0)
			OpenGL.glAttachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9926);
		if (((Class405_Sub2) this).anInt9927 != 0)
			OpenGL.glAttachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9927);
		OpenGL.glLinkProgram(((Class405_Sub2) this).anInt9920);
		OpenGL.glGetProgramiv(((Class405_Sub2) this).anInt9920, 35714, anIntArray9936, 0);
		if (anIntArray9936[0] == 0) {
			if (((Class405_Sub2) this).anInt9926 != 0) {
				OpenGL.glDetachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9926);
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9926);
			}
			if (((Class405_Sub2) this).anInt9927 != 0) {
				OpenGL.glDetachShader(((Class405_Sub2) this).anInt9920, ((Class405_Sub2) this).anInt9927);
				OpenGL.glDeleteShader(((Class405_Sub2) this).anInt9927);
			}
			OpenGL.glDeleteProgram(((Class405_Sub2) this).anInt9920);
			return false;
		}
		OpenGL.glUseProgram(((Class405_Sub2) this).anInt9920);
		int i = -1;
		for (int i_19_ = 0; i_19_ < ((Class405_Sub2) this).aClass406_Sub1_9924.method4909(624639273); i_19_++) {
			if (((Class405_Sub2) this).aClass406_Sub1_9924.method4865(i_19_, 2121330215) == this) {
				i = i_19_;
				break;
			}
		}
		if (i == -1)
			return false;
		for (int i_20_ = 0; i_20_ < ((Class405_Sub2) this).aClass406_Sub1_9924.method4911(-682087440); i_20_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub2) this).aClass406_Sub1_9924.method4889(i_20_, (byte) 0);
			if (class572_sub8_sub1 != null)
				class572_sub8_sub1.method10264(i);
		}
		for (int i_21_ = 0; i_21_ < ((Class405_Sub2) this).aClass406_Sub1_9924.method4917(140285583); i_21_++) {
			Class572_Sub8_Sub1 class572_sub8_sub1 = ((Class405_Sub2) this).aClass406_Sub1_9924.method4887(i_21_, (byte) 48);
			if (class572_sub8_sub1 != null)
				class572_sub8_sub1.method10264(i);
		}
		((Class405_Sub2) this).aString9921 = null;
		((Class405_Sub2) this).aString9930 = null;
		((Class405_Sub2) this).aBool9923 = true;
		return true;
	}

	void method4823(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_22_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_22_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_22_));
				if (class572_sub8_sub1.method10266((byte) 78) != Class63.aClass63_572)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform2f(i, f, f_22_);
			}
		}
	}

	void method4825(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_23_, float f_24_, float f_25_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_23_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_24_ || ((Float) ((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i))).floatValue() != f_25_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_23_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_24_));
				((Class405_Sub2) this).aMap9935.put(Integer.valueOf(i), Float.valueOf(f_25_));
				if (class572_sub8_sub1.method10266((byte) 76) != Class63.aClass63_574)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform4f(i, f, f_23_, f_24_, f_25_);
			}
		}
	}

	void method4844(int i, Class250 class250) {
		OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4820(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class572_sub8_sub1.method10266((byte) 53) != Class63.aClass63_571) && (class572_sub8_sub1.method10266((byte) 107) != Class63.aClass63_617))
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	Class405_Sub2(Class106_Sub3_Sub2 class106_sub3_sub2, Class406_Sub1 class406_sub1, Class385 class385) {
		this(class106_sub3_sub2, class385);
		((Class405_Sub2) this).aClass406_Sub1_9924 = class406_sub1;
		((Class405_Sub2) this).aClass106_Sub3_Sub2_9925 = class106_sub3_sub2;
	}

	void method4822(Class572_Sub8_Sub1 class572_sub8_sub1, float f) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				if ((class572_sub8_sub1.method10266((byte) 76) != Class63.aClass63_571) && (class572_sub8_sub1.method10266((byte) 115) != Class63.aClass63_617))
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform1f(i, f);
			}
		}
	}

	void method4812(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_26_, float f_27_, float f_28_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_26_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_27_ || ((Float) ((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i))).floatValue() != f_28_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_26_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_27_));
				((Class405_Sub2) this).aMap9935.put(Integer.valueOf(i), Float.valueOf(f_28_));
				if (class572_sub8_sub1.method10266((byte) 74) != Class63.aClass63_574)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform4f(i, f, f_26_, f_27_, f_28_);
			}
		}
	}

	void method4816(int i, Class250 class250) {
		OpenGL.glUniform2fv(i, 4, class250.method3471(aFloatArray9931), 0);
	}

	void method4830(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 66) != Class63.aClass63_590))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4818(int i, int i_29_, Interface34 interface34) {
		((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9641(i_29_);
		((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9659(interface34);
		OpenGL.glUniform1i(i, i_29_);
	}

	void method4827(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 92) != Class63.aClass63_613))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform2fv(i, 4, class250.method3471(aFloatArray9931), 0);
	}

	void method4847(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 65) != Class63.aClass63_590))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4829(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 101) != Class63.aClass63_590))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4841(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_30_, float f_31_, float f_32_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_30_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_31_ || ((Float) ((Class405_Sub2) this).aMap9935.get(Integer.valueOf(i))).floatValue() != f_32_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_30_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_31_));
				((Class405_Sub2) this).aMap9935.put(Integer.valueOf(i), Float.valueOf(f_32_));
				if (class572_sub8_sub1.method10266((byte) 110) != Class63.aClass63_574)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform4f(i, f, f_30_, f_31_, f_32_);
			}
		}
	}

	void method4846(int i, float f, float f_33_, float f_34_) {
		OpenGL.glUniform3f(i, f, f_33_, f_34_);
	}

	void method4805(Class572_Sub8_Sub1 class572_sub8_sub1, Class250 class250) {
		if (!$assertionsDisabled && (class572_sub8_sub1.method10266((byte) 72) != Class63.aClass63_590))
			throw new AssertionError();
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1)
			OpenGL.glUniform4fv(i, 4, class250.method3492(aFloatArray9931), 0);
	}

	void method4832(Class572_Sub8_Sub1 class572_sub8_sub1, int i, Interface34 interface34) {
		int i_35_ = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i_35_ != -1) {
			if (interface34 == null)
				interface34 = (((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.anInterface43_10474);
			if (i < ((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.anInt10454) {
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9641(i);
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9659(interface34);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class599) (Class599) interface34).anInt7858), (((Class599) (Class599) interface34).anInt7857));
			}
			if ((((Class405_Sub2) this).aMap9928.get(Integer.valueOf(i_35_)) == null) || ((Integer) ((Class405_Sub2) this).aMap9928.get(Integer.valueOf(i_35_))).intValue() != i) {
				((Class405_Sub2) this).aMap9928.put(Integer.valueOf(i_35_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_35_, i);
			}
		}
	}

	void method4833(int i, float f, float f_36_, float f_37_) {
		OpenGL.glUniform3f(i, f, f_36_, f_37_);
	}

	void method4834(int i, float f, float f_38_, float f_39_) {
		OpenGL.glUniform3f(i, f, f_38_, f_39_);
	}

	void method4835(int i, float f, float f_40_, float f_41_) {
		OpenGL.glUniform3f(i, f, f_40_, f_41_);
	}

	void method9366() {
		method39();
	}

	void method4837(int i, float f, float f_42_, float f_43_, float f_44_) {
		OpenGL.glUniform4f(i, f, f_42_, f_43_, f_44_);
	}

	void method4838(int i, float f, float f_45_, float f_46_, float f_47_) {
		OpenGL.glUniform4f(i, f, f_45_, f_46_, f_47_);
	}

	void method4839(int i, float f, float f_48_, float f_49_, float f_50_) {
		OpenGL.glUniform4f(i, f, f_48_, f_49_, f_50_);
	}

	void method4815(int i, float[] fs, int i_51_) {
		OpenGL.glUniform4fv(i, i_51_, fs, 0);
	}

	void method4826(int i, Class250 class250) {
		OpenGL.glUniform3fv(i, 3, class250.method3480(aFloatArray9931), 0);
	}

	void method4842(int i, Class250 class250) {
		OpenGL.glUniform2fv(i, 4, class250.method3471(aFloatArray9931), 0);
	}

	void method4836(int i, Class250 class250) {
		OpenGL.glUniform2fv(i, 4, class250.method3471(aFloatArray9931), 0);
	}

	void method4849(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_52_, float f_53_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_52_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_53_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_52_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_53_));
				if (class572_sub8_sub1.method10266((byte) 121) != Class63.aClass63_573)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform3f(i, f, f_52_, f_53_);
			}
		}
	}

	void method4845(int i, int i_54_, Interface34 interface34) {
		((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9641(i_54_);
		((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9659(interface34);
		OpenGL.glUniform1i(i, i_54_);
	}

	void method4848(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_55_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_55_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_55_));
				if (class572_sub8_sub1.method10266((byte) 71) != Class63.aClass63_572)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform2f(i, f, f_55_);
			}
		}
	}

	int method9367(int i, String string, String string_56_) {
		if (string == null)
			return 0;
		int i_57_ = OpenGL.glCreateShader(i);
		OpenGL.glShaderSource(i_57_, string);
		OpenGL.glCompileShader(i_57_);
		OpenGL.glGetShaderiv(i_57_, 35713, anIntArray9936, 0);
		if (anIntArray9936[0] == 0) {
			OpenGL.glDeleteShader(i_57_);
			i_57_ = 0;
		}
		return i_57_;
	}

	void method4840(Class572_Sub8_Sub1 class572_sub8_sub1, int i, Interface34 interface34) {
		int i_58_ = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i_58_ != -1) {
			if (interface34 == null)
				interface34 = (((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.anInterface43_10474);
			if (i < ((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.anInt10454) {
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9641(i);
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method9659(interface34);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture((((Class599) (Class599) interface34).anInt7858), (((Class599) (Class599) interface34).anInt7857));
			}
			if ((((Class405_Sub2) this).aMap9928.get(Integer.valueOf(i_58_)) == null) || ((Integer) ((Class405_Sub2) this).aMap9928.get(Integer.valueOf(i_58_))).intValue() != i) {
				((Class405_Sub2) this).aMap9928.put(Integer.valueOf(i_58_), Integer.valueOf(i));
				OpenGL.glUniform1i(i_58_, i);
			}
		}
	}

	public void method38() {
		if (((Class405_Sub2) this).anInt9920 != 0) {
			((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method10121(((Class405_Sub2) this).anInt9920);
			if (((Class405_Sub2) this).anInt9926 != 0)
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method10116((long) ((Class405_Sub2) this).anInt9926);
			if (((Class405_Sub2) this).anInt9927 != 0)
				((Class405_Sub2) this).aClass106_Sub3_Sub2_9925.method10116((long) ((Class405_Sub2) this).anInt9927);
			((Class405_Sub2) this).anInt9920 = 0;
			((Class405_Sub2) this).anInt9926 = 0;
			((Class405_Sub2) this).anInt9927 = 0;
		}
	}

	void method4824(Class572_Sub8_Sub1 class572_sub8_sub1, float f, float f_59_, float f_60_) {
		int i = ((Class572_Sub8_Sub1_Sub1) class572_sub8_sub1).method10619();
		if (i != -1) {
			if (((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i)) == null || (((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i)) == null) || (((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i)) == null) || ((Float) ((Class405_Sub2) this).aMap9932.get(Integer.valueOf(i))).floatValue() != f || ((Float) ((Class405_Sub2) this).aMap9933.get(Integer.valueOf(i))).floatValue() != f_59_ || ((Float) ((Class405_Sub2) this).aMap9934.get(Integer.valueOf(i))).floatValue() != f_60_) {
				((Class405_Sub2) this).aMap9932.put(Integer.valueOf(i), Float.valueOf(f));
				((Class405_Sub2) this).aMap9933.put(Integer.valueOf(i), Float.valueOf(f_59_));
				((Class405_Sub2) this).aMap9934.put(Integer.valueOf(i), Float.valueOf(f_60_));
				if (class572_sub8_sub1.method10266((byte) 85) != Class63.aClass63_573)
					throw new IllegalArgumentException_Sub1(class572_sub8_sub1, "");
				OpenGL.glUniform3f(i, f, f_59_, f_60_);
			}
		}
	}
}

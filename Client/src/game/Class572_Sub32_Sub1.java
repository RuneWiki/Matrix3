package game;

/* Class572_Sub32_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class572_Sub32_Sub1 extends Class572_Sub32 {
	static float aFloat10994;
	static float aFloat10995 = 1.0F;
	static float aFloat10996;
	static final String aString10997 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
	static float aFloat10998;
	static float aFloat10999;
	Class149 aClass149_11000;

	void method8695(int i, int i_0_) {
		/* empty */
	}

	boolean method10074() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048);
	}

	void method8686(int i) {
		OpenGL.glUseProgram(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9421(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9422(null);
	}

	boolean method8677() {
		if (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048) {
			((Class572_Sub32_Sub1) this).aClass149_11000 = (Class149.method2496(((Class572_Sub32_Sub1) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub1) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return ((Class572_Sub32_Sub1) this).aClass149_11000 != null;
		}
		return false;
	}

	void method8679(int i, int i_1_) {
		/* empty */
	}

	void method8683() {
		((Class572_Sub32_Sub1) this).aClass149_11000 = null;
	}

	void method8698(int i) {
		OpenGL.glUseProgram(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9421(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9422(null);
	}

	void method8697(int i) {
		OpenGL.glUseProgram(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9421(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9422(null);
	}

	Class88 method8685() {
		return Class88.aClass88_1218;
	}

	int method8687() {
		return 1;
	}

	Class88 method8676() {
		return Class88.aClass88_1218;
	}

	boolean method8681() {
		return (aFloat10995 == 1.0F && aFloat10994 == 0.0F && aFloat10996 == 1.0F && aFloat10999 == 0.0F && aFloat10998 == 1.0F);
	}

	boolean method8688() {
		return ((Class572_Sub32_Sub1) this).aClass149_11000 != null;
	}

	boolean method8689() {
		return ((Class572_Sub32_Sub1) this).aClass149_11000 != null;
	}

	boolean method8690() {
		return ((Class572_Sub32_Sub1) this).aClass149_11000 != null;
	}

	boolean method8691() {
		if (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048) {
			((Class572_Sub32_Sub1) this).aClass149_11000 = (Class149.method2496(((Class572_Sub32_Sub1) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub1) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return ((Class572_Sub32_Sub1) this).aClass149_11000 != null;
		}
		return false;
	}

	boolean method8692() {
		if (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048) {
			((Class572_Sub32_Sub1) this).aClass149_11000 = (Class149.method2496(((Class572_Sub32_Sub1) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub1) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") })));
			return ((Class572_Sub32_Sub1) this).aClass149_11000 != null;
		}
		return false;
	}

	void method8693() {
		((Class572_Sub32_Sub1) this).aClass149_11000 = null;
	}

	void method8680() {
		((Class572_Sub32_Sub1) this).aClass149_11000 = null;
	}

	boolean method8678() {
		return ((Class572_Sub32_Sub1) this).aClass149_11000 != null;
	}

	static {
		aFloat10994 = 0.0F;
		aFloat10996 = 1.0F;
		aFloat10999 = 0.0F;
		aFloat10998 = 1.0F;
	}

	void method8707(int i, Class155_Sub4 class155_sub4, Class155_Sub4 class155_sub4_2_, int i_3_, int i_4_) {
		int i_5_ = (((Class149) ((Class572_Sub32_Sub1) this).aClass149_11000).anInt1690);
		OpenGL.glUseProgram(i_5_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_5_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_5_, "paramsGamma"), aFloat10995);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_5_, "paramsRanges"), aFloat10994, aFloat10996, aFloat10999, aFloat10998);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9421(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9422(class155_sub4);
	}

	int method8703() {
		return 1;
	}

	Class572_Sub32_Sub1(Class106_Sub1 class106_sub1) {
		super(class106_sub1);
	}

	int method8702() {
		return 1;
	}

	void method8694(int i, int i_6_) {
		/* empty */
	}

	Class88 method8706() {
		return Class88.aClass88_1218;
	}

	void method8675(int i, Class155_Sub4 class155_sub4, Class155_Sub4 class155_sub4_7_, int i_8_, int i_9_) {
		int i_10_ = (((Class149) ((Class572_Sub32_Sub1) this).aClass149_11000).anInt1690);
		OpenGL.glUseProgram(i_10_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_10_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "paramsGamma"), aFloat10995);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_10_, "paramsRanges"), aFloat10994, aFloat10996, aFloat10999, aFloat10998);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9421(0);
		((Class572_Sub32_Sub1) this).aClass106_Sub1_9317.method9422(class155_sub4);
	}

	boolean method8708() {
		return (aFloat10995 == 1.0F && aFloat10994 == 0.0F && aFloat10996 == 1.0F && aFloat10999 == 0.0F && aFloat10998 == 1.0F);
	}

	boolean method10075() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048);
	}

	boolean method10076() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048);
	}

	boolean method10077() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048);
	}

	boolean method10078() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub1) this).aClass106_Sub1_9317).aBool10048);
	}
}

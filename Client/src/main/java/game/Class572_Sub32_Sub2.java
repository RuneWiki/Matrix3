package game;

/* Class572_Sub32_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class572_Sub32_Sub2 extends Class572_Sub32 {
	Class149 aClass149_11001;
	static float aFloat11002 = 0.25F;
	static float aFloat11003 = 1.0F;
	static final String aString11004 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";
	static final String aString11005 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	static float aFloat11006 = 1.0F;
	int anInt11007;
	static final String aString11008 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";
	Class104_Sub1_Sub1 aClass104_Sub1_Sub1_11009;
	Class149 aClass149_11010;
	Class155_Sub4 aClass155_Sub4_11011;
	Class155_Sub4 aClass155_Sub4_11012;
	static final String aString11013 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";
	static final int anInt11014 = 256;
	int anInt11015;
	int anInt11016;
	int anInt11017;
	Class149 aClass149_11018;
	Class149 aClass149_11019;
	Class155_Sub4[] aClass155_Sub4Array11020;
	Class104_Sub1_Sub1 aClass104_Sub1_Sub1_11021;

	void method8694(int i, int i_0_) {
		((Class572_Sub32_Sub2) this).anInt11007 = i;
		((Class572_Sub32_Sub2) this).anInt11015 = i_0_;
		int i_1_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11007, 326245663);
		int i_2_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11015, 326245663);
		if (((Class572_Sub32_Sub2) this).anInt11016 != i_1_ || ((Class572_Sub32_Sub2) this).anInt11017 != i_2_) {
			if (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 != null) {
				for (int i_3_ = 0; i_3_ < (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020).length; i_3_++)
					((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_3_].method2521();
				((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = null;
			}
			if (i_1_ > 256 || i_2_ > 256) {
				int i_4_ = i_1_;
				int i_5_ = i_2_;
				int i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
					i_6_++;
				}
				if (((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 == null)
					((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = new Class104_Sub1_Sub1(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317);
				((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = new Class155_Sub4[i_6_];
				i_4_ = i_1_;
				i_5_ = i_2_;
				i_6_ = 0;
				while (i_4_ > 256 || i_5_ > 256) {
					((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_6_++] = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), i_4_, i_5_);
					if (i_4_ > 256)
						i_4_ >>= 1;
					if (i_5_ > 256)
						i_5_ >>= 1;
				}
			} else
				((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = null;
			((Class572_Sub32_Sub2) this).anInt11016 = i_1_;
			((Class572_Sub32_Sub2) this).anInt11017 = i_2_;
		}
	}

	boolean method10079() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10124 && ((Class106_Sub1) (((Class572_Sub32_Sub2) this).aClass106_Sub1_9317)).aBool10048 && ((Class106_Sub1) (((Class572_Sub32_Sub2) this).aClass106_Sub1_9317)).aBool10175);
	}

	boolean method8678() {
		return ((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 != null;
	}

	boolean method8677() {
		if ((((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10124) && ((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10048 && ((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10175) {
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 = new Class104_Sub1_Sub1(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11011 = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), 256, 256);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11011.method9195(false, false);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11012 = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), 256, 256);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11012.method9195(false, false);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, -964877256);
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9908(0, ((Class572_Sub32_Sub2) this).aClass155_Sub4_11011.method9201(0));
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9908(1, ((Class572_Sub32_Sub2) this).aClass155_Sub4_11012.method9201(0));
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
			if (!((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9909()) {
				((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 803386902);
				return false;
			}
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 406929167);
			((Class572_Sub32_Sub2) this).aClass149_11001 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11010 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11019 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11018 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class572_Sub32_Sub2) this).aClass149_11010 != null && ((Class572_Sub32_Sub2) this).aClass149_11001 != null && ((Class572_Sub32_Sub2) this).aClass149_11019 != null && ((Class572_Sub32_Sub2) this).aClass149_11018 != null);
		}
		return false;
	}

	void method8679(int i, int i_7_) {
		((Class572_Sub32_Sub2) this).anInt11007 = i;
		((Class572_Sub32_Sub2) this).anInt11015 = i_7_;
		int i_8_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11007, 326245663);
		int i_9_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11015, 326245663);
		if (((Class572_Sub32_Sub2) this).anInt11016 != i_8_ || ((Class572_Sub32_Sub2) this).anInt11017 != i_9_) {
			if (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 != null) {
				for (int i_10_ = 0; i_10_ < (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020).length; i_10_++)
					((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_10_].method2521();
				((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = null;
			}
			if (i_8_ > 256 || i_9_ > 256) {
				int i_11_ = i_8_;
				int i_12_ = i_9_;
				int i_13_ = 0;
				while (i_11_ > 256 || i_12_ > 256) {
					if (i_11_ > 256)
						i_11_ >>= 1;
					if (i_12_ > 256)
						i_12_ >>= 1;
					i_13_++;
				}
				if (((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 == null)
					((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = new Class104_Sub1_Sub1(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317);
				((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = new Class155_Sub4[i_13_];
				i_11_ = i_8_;
				i_12_ = i_9_;
				i_13_ = 0;
				while (i_11_ > 256 || i_12_ > 256) {
					((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_13_++] = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), i_11_, i_12_);
					if (i_11_ > 256)
						i_11_ >>= 1;
					if (i_12_ > 256)
						i_12_ >>= 1;
				}
			} else
				((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = null;
			((Class572_Sub32_Sub2) this).anInt11016 = i_8_;
			((Class572_Sub32_Sub2) this).anInt11017 = i_9_;
		}
	}

	void method8683() {
		((Class572_Sub32_Sub2) this).anInt11017 = -1;
		((Class572_Sub32_Sub2) this).anInt11016 = -1;
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = null;
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4_11011 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4_11012 = null;
		((Class572_Sub32_Sub2) this).aClass149_11001 = null;
		((Class572_Sub32_Sub2) this).aClass149_11010 = null;
		((Class572_Sub32_Sub2) this).aClass149_11019 = null;
		((Class572_Sub32_Sub2) this).aClass149_11018 = null;
	}

	void method8675(int i, Class155_Sub4 class155_sub4, Class155_Sub4 class155_sub4_14_, int i_15_, int i_16_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 != null) {
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021, -1344973509);
			int i_17_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11007, 326245663);
			int i_18_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11015, 326245663);
			int i_19_ = 0;
			while (i_17_ > 256 || i_18_ > 256) {
				OpenGL.glViewport(0, 0, i_17_, i_18_);
				((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021.method9908(0, ((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_19_].method9201(0));
				if (i_19_ == 0) {
					((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(class155_sub4);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) ((((Class572_Sub32_Sub2) this).anInt11015) - i_15_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_16_), (float) ((((Class572_Sub32_Sub2) this).anInt11015) - i_15_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_16_), (float) (((Class572_Sub32_Sub2) this).anInt11015));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class572_Sub32_Sub2) this).anInt11015));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_19_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_17_ > 256)
					i_17_ >>= 1;
				if (i_18_ > 256)
					i_18_ >>= 1;
				i_19_++;
			}
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021, 870221975);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_19_ - 1]);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, -1192538910);
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_20_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11010).anInt1690);
			OpenGL.glUseProgram(i_20_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_20_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_20_, "params"), aFloat11006, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(class155_sub4);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, -398740424);
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_21_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11001).anInt1690);
			OpenGL.glUseProgram(i_21_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_21_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_21_, "params"), aFloat11006, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) (((Class572_Sub32_Sub2) this).anInt11007), 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) (((Class572_Sub32_Sub2) this).anInt11007), (float) (((Class572_Sub32_Sub2) this).anInt11015));
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) (((Class572_Sub32_Sub2) this).anInt11015));
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(1);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4_11011);
		int i_22_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11018).anInt1690);
		OpenGL.glUseProgram(i_22_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_22_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_22_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4_11012);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_22_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 1141956312);
		int i_23_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11019).anInt1690);
		OpenGL.glUseProgram(i_23_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_23_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_23_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_23_, "params"), aFloat11002, aFloat11003, 0.0F);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(1);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4_11011);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(0);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(class155_sub4);
	}

	boolean method8689() {
		return ((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 != null;
	}

	Class88 method8685() {
		return Class88.aClass88_1220;
	}

	void method8686(int i) {
		OpenGL.glUseProgram(0);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(1);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(null);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(0);
	}

	boolean method10080() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10124 && ((Class106_Sub1) (((Class572_Sub32_Sub2) this).aClass106_Sub1_9317)).aBool10048 && ((Class106_Sub1) (((Class572_Sub32_Sub2) this).aClass106_Sub1_9317)).aBool10175);
	}

	boolean method8688() {
		return ((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 != null;
	}

	int method8687() {
		return 0;
	}

	boolean method8690() {
		return ((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 != null;
	}

	boolean method8691() {
		if ((((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10124) && ((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10048 && ((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10175) {
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 = new Class104_Sub1_Sub1(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11011 = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), 256, 256);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11011.method9195(false, false);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11012 = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), 256, 256);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11012.method9195(false, false);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, -2034209488);
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9908(0, ((Class572_Sub32_Sub2) this).aClass155_Sub4_11011.method9201(0));
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9908(1, ((Class572_Sub32_Sub2) this).aClass155_Sub4_11012.method9201(0));
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
			if (!((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9909()) {
				((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 1574606340);
				return false;
			}
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 2118520998);
			((Class572_Sub32_Sub2) this).aClass149_11001 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11010 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11019 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11018 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class572_Sub32_Sub2) this).aClass149_11010 != null && ((Class572_Sub32_Sub2) this).aClass149_11001 != null && ((Class572_Sub32_Sub2) this).aClass149_11019 != null && ((Class572_Sub32_Sub2) this).aClass149_11018 != null);
		}
		return false;
	}

	boolean method8692() {
		if ((((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10124) && ((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10048 && ((Class106_Sub1) ((Class572_Sub32_Sub2) this).aClass106_Sub1_9317).aBool10175) {
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 = new Class104_Sub1_Sub1(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11011 = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), 256, 256);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11011.method9195(false, false);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11012 = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), 256, 256);
			((Class572_Sub32_Sub2) this).aClass155_Sub4_11012.method9195(false, false);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, -255911917);
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9908(0, ((Class572_Sub32_Sub2) this).aClass155_Sub4_11011.method9201(0));
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9908(1, ((Class572_Sub32_Sub2) this).aClass155_Sub4_11012.method9201(0));
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
			if (!((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method9909()) {
				((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 1921991606);
				return false;
			}
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 1494791045);
			((Class572_Sub32_Sub2) this).aClass149_11001 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11010 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11019 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") })));
			((Class572_Sub32_Sub2) this).aClass149_11018 = (Class149.method2496(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") })));
			return (((Class572_Sub32_Sub2) this).aClass149_11010 != null && ((Class572_Sub32_Sub2) this).aClass149_11001 != null && ((Class572_Sub32_Sub2) this).aClass149_11019 != null && ((Class572_Sub32_Sub2) this).aClass149_11018 != null);
		}
		return false;
	}

	boolean method8681() {
		return false;
	}

	void method8680() {
		((Class572_Sub32_Sub2) this).anInt11017 = -1;
		((Class572_Sub32_Sub2) this).anInt11016 = -1;
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = null;
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4_11011 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4_11012 = null;
		((Class572_Sub32_Sub2) this).aClass149_11001 = null;
		((Class572_Sub32_Sub2) this).aClass149_11010 = null;
		((Class572_Sub32_Sub2) this).aClass149_11019 = null;
		((Class572_Sub32_Sub2) this).aClass149_11018 = null;
	}

	void method8707(int i, Class155_Sub4 class155_sub4, Class155_Sub4 class155_sub4_24_, int i_25_, int i_26_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 != null) {
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021, -1979729567);
			int i_27_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11007, 326245663);
			int i_28_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11015, 326245663);
			int i_29_ = 0;
			while (i_27_ > 256 || i_28_ > 256) {
				OpenGL.glViewport(0, 0, i_27_, i_28_);
				((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021.method9908(0, ((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_29_].method9201(0));
				if (i_29_ == 0) {
					((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(class155_sub4);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) ((((Class572_Sub32_Sub2) this).anInt11015) - i_25_));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) (0 + i_26_), (float) ((((Class572_Sub32_Sub2) this).anInt11015) - i_25_));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) (0 + i_26_), (float) (((Class572_Sub32_Sub2) this).anInt11015));
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) (((Class572_Sub32_Sub2) this).anInt11015));
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_29_ - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (i_27_ > 256)
					i_27_ >>= 1;
				if (i_28_ > 256)
					i_28_ >>= 1;
				i_29_++;
			}
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021, 323043033);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_29_ - 1]);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, -1432201420);
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_30_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11010).anInt1690);
			OpenGL.glUseProgram(i_30_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_30_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_30_, "params"), aFloat11006, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(class155_sub4);
			((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1661(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, -1526817151);
			((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int i_31_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11001).anInt1690);
			OpenGL.glUseProgram(i_31_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_31_, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_31_, "params"), aFloat11006, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) (((Class572_Sub32_Sub2) this).anInt11007), 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) (((Class572_Sub32_Sub2) this).anInt11007), (float) (((Class572_Sub32_Sub2) this).anInt11015));
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) (((Class572_Sub32_Sub2) this).anInt11015));
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(1);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4_11011);
		int i_32_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11018).anInt1690);
		OpenGL.glUseProgram(i_32_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_32_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_32_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009.method10136(0);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4_11012);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_32_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method1884(((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009, 731444527);
		int i_33_ = (((Class149) ((Class572_Sub32_Sub2) this).aClass149_11019).anInt1690);
		OpenGL.glUseProgram(i_33_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_33_, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_33_, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_33_, "params"), aFloat11002, aFloat11003, 0.0F);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(1);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(((Class572_Sub32_Sub2) this).aClass155_Sub4_11011);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(0);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(class155_sub4);
	}

	void method8695(int i, int i_34_) {
		((Class572_Sub32_Sub2) this).anInt11007 = i;
		((Class572_Sub32_Sub2) this).anInt11015 = i_34_;
		int i_35_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11007, 326245663);
		int i_36_ = Cs2CallPointer.method5627(((Class572_Sub32_Sub2) this).anInt11015, 326245663);
		if (((Class572_Sub32_Sub2) this).anInt11016 != i_35_ || ((Class572_Sub32_Sub2) this).anInt11017 != i_36_) {
			if (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 != null) {
				for (int i_37_ = 0; i_37_ < (((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020).length; i_37_++)
					((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_37_].method2521();
				((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = null;
			}
			if (i_35_ > 256 || i_36_ > 256) {
				int i_38_ = i_35_;
				int i_39_ = i_36_;
				int i_40_ = 0;
				while (i_38_ > 256 || i_39_ > 256) {
					if (i_38_ > 256)
						i_38_ >>= 1;
					if (i_39_ > 256)
						i_39_ >>= 1;
					i_40_++;
				}
				if (((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 == null)
					((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = new Class104_Sub1_Sub1(((Class572_Sub32_Sub2) this).aClass106_Sub1_9317);
				((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = new Class155_Sub4[i_40_];
				i_38_ = i_35_;
				i_39_ = i_36_;
				i_40_ = 0;
				while (i_38_ > 256 || i_39_ > 256) {
					((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020[i_40_++] = new Class155_Sub4((((Class572_Sub32_Sub2) this).aClass106_Sub1_9317), 3553, Class171.aClass171_2071, method8685(), i_38_, i_39_);
					if (i_38_ > 256)
						i_38_ >>= 1;
					if (i_39_ > 256)
						i_39_ >>= 1;
				}
			} else
				((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = null;
			((Class572_Sub32_Sub2) this).anInt11016 = i_35_;
			((Class572_Sub32_Sub2) this).anInt11017 = i_36_;
		}
	}

	void method8693() {
		((Class572_Sub32_Sub2) this).anInt11017 = -1;
		((Class572_Sub32_Sub2) this).anInt11016 = -1;
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11021 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4Array11020 = null;
		((Class572_Sub32_Sub2) this).aClass104_Sub1_Sub1_11009 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4_11011 = null;
		((Class572_Sub32_Sub2) this).aClass155_Sub4_11012 = null;
		((Class572_Sub32_Sub2) this).aClass149_11001 = null;
		((Class572_Sub32_Sub2) this).aClass149_11010 = null;
		((Class572_Sub32_Sub2) this).aClass149_11019 = null;
		((Class572_Sub32_Sub2) this).aClass149_11018 = null;
	}

	void method8698(int i) {
		OpenGL.glUseProgram(0);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(1);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(null);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(0);
	}

	void method8697(int i) {
		OpenGL.glUseProgram(0);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(1);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9422(null);
		((Class572_Sub32_Sub2) this).aClass106_Sub1_9317.method9421(0);
	}

	int method8702() {
		return 0;
	}

	int method8703() {
		return 0;
	}

	Class88 method8706() {
		return Class88.aClass88_1220;
	}

	Class88 method8676() {
		return Class88.aClass88_1220;
	}

	boolean method8708() {
		return false;
	}

	Class572_Sub32_Sub2(Class106_Sub1 class106_sub1) {
		super(class106_sub1);
	}
}

package game;

/* Class148_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148_Sub7 extends Class148 {
	Class149 aClass149_10737;
	static final String aString10738 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBool10739 = false;
	boolean aBool10740 = false;
	static final String aString10741 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	Class137 aClass137_10742;

	void method2484(boolean bool) {
		/* empty */
	}

	boolean method2479() {
		return ((Class148_Sub7) this).aBool10740;
	}

	void method2481(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub7) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub7) this).aBool10740 && class155_sub3 != null) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub7) this).aClass137_10742).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10011), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10117), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat9992), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub7) this).aBool10739 = true;
		}
	}

	void method2492() {
		if (((Class148_Sub7) this).aBool10739) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(null);
			OpenGL.glUseProgram(0);
			((Class148_Sub7) this).aBool10739 = false;
		}
	}

	void method2486(Class155 class155, int i) {
		if (!((Class148_Sub7) this).aBool10739) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9454(i);
		}
	}

	void method2489(int i, int i_0_) {
		if (((Class148_Sub7) this).aBool10739) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			int i_4_ = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "time"), (float) (i_1_ * ((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).anInt10047 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "breakWaterOffset"), f_3_);
		}
	}

	Class148_Sub7(Class106_Sub1 class106_sub1, Class137 class137) {
		super(class106_sub1);
		((Class148_Sub7) this).aClass137_10742 = class137;
		if ((((Class137) ((Class148_Sub7) this).aClass137_10742).aClass155_Sub1_1604) != null && (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aBool10116) && (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aBool10048)) {
			Class136 class136 = (Class136.method2343(((Class148_Sub7) this).aClass106_Sub1_1689, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class136 class136_5_ = (Class136.method2343(((Class148_Sub7) this).aClass106_Sub1_1689, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class148_Sub7) this).aClass149_10737 = Class149.method2496((((Class148_Sub7) this).aClass106_Sub1_1689), new Class136[] { class136, class136_5_ });
			((Class148_Sub7) this).aBool10740 = ((Class148_Sub7) this).aClass149_10737 != null;
		}
	}

	void method2482(Class155 class155, int i) {
		if (!((Class148_Sub7) this).aBool10739) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9454(i);
		}
	}

	void method2485(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub7) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub7) this).aBool10740 && class155_sub3 != null) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub7) this).aClass137_10742).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10011), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10117), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat9992), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub7) this).aBool10739 = true;
		}
	}

	void method2487(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub7) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub7) this).aBool10740 && class155_sub3 != null) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub7) this).aClass137_10742).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10011), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10117), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat9992), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub7) this).aBool10739 = true;
		}
	}

	void method2488(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub7) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub7) this).aBool10740 && class155_sub3 != null) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub7) this).aClass137_10742).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10011), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10117), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat9992), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub7) this).aBool10739 = true;
		}
	}

	void method2494(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub7) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub7) this).aBool10740 && class155_sub3 != null) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub7) this).aClass137_10742).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10011), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10117), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat9992), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub7) this).aBool10739 = true;
		}
	}

	void method2495(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub7) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub7) this).aBool10740 && class155_sub3 != null) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub7) this).aClass137_10742).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10011), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat10117), (((Class106_Sub1) ((Class148_Sub7) this).aClass106_Sub1_1689).aFloat9992), 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 96.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub7) this).aBool10739 = true;
		}
	}

	void method2491(boolean bool) {
		/* empty */
	}

	void method2483() {
		if (((Class148_Sub7) this).aBool10739) {
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub7) this).aClass106_Sub1_1689.method9422(null);
			OpenGL.glUseProgram(0);
			((Class148_Sub7) this).aBool10739 = false;
		}
	}

	void method2493(int i, int i_6_) {
		if (((Class148_Sub7) this).aBool10739) {
			int i_7_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_8_ = i_6_ & 0xffff;
			float f_9_ = (float) (i_6_ >> 16 & 0x3) / 8.0F;
			int i_10_ = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "time"), (float) (i_7_ * ((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).anInt10047 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "breakWaterDepth"), (float) i_8_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_10_, "breakWaterOffset"), f_9_);
		}
	}

	void method2480(int i, int i_11_) {
		if (((Class148_Sub7) this).aBool10739) {
			int i_12_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_13_ = i_11_ & 0xffff;
			float f_14_ = (float) (i_11_ >> 16 & 0x3) / 8.0F;
			int i_15_ = (((Class149) ((Class148_Sub7) this).aClass149_10737).anInt1690);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "time"), (float) (i_12_ * ((Class106_Sub1) (((Class148_Sub7) this).aClass106_Sub1_1689)).anInt10047 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterDepth"), (float) i_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_15_, "breakWaterOffset"), f_14_);
		}
	}

	boolean method2490() {
		return ((Class148_Sub7) this).aBool10740;
	}
}

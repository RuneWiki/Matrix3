package game;

/* Class148_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148_Sub8 extends Class148 {
	static final String aString10917 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	Class149 aClass149_10918;
	boolean aBool10919;
	boolean aBool10920 = false;
	Class137 aClass137_10921;
	static final String aString10922 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	void method2489(int i, int i_0_) {
		if (((Class148_Sub8) this).aBool10920) {
			int i_1_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_2_ = i_0_ & 0xffff;
			float f_3_ = (float) (i_0_ >> 16 & 0x3) / 8.0F;
			float f_4_ = (float) (i_0_ >> 19 & 0xf) / 16.0F;
			float f_5_ = (float) (i_0_ >> 23 & 0xf) / 16.0F;
			int i_6_ = i_0_ >> 27 & 0xf;
			int i_7_ = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "time"), (float) (i_1_ * ((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).anInt10047 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterDepth"), (float) i_2_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "breakWaterOffset"), f_3_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_7_, "waveIntensity"), f_5_, f_4_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_7_, "waveExponent"), (float) i_6_);
		}
	}

	boolean method2479() {
		return ((Class148_Sub8) this).aBool10919;
	}

	void method2485(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub8) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub8) this).aBool10919 && class155_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1])) * 2.0F);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub8) this).aClass137_10921).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10011) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10117) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat9992) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub8) this).aBool10920 = true;
		}
	}

	void method2484(boolean bool) {
		/* empty */
	}

	void method2483() {
		if (((Class148_Sub8) this).aBool10920) {
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(null);
			OpenGL.glUseProgram(0);
			((Class148_Sub8) this).aBool10920 = false;
		}
	}

	void method2495(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub8) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub8) this).aBool10919 && class155_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1])) * 2.0F);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub8) this).aClass137_10921).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10011) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10117) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat9992) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub8) this).aBool10920 = true;
		}
	}

	void method2486(Class155 class155, int i) {
		if (!((Class148_Sub8) this).aBool10920) {
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9454(i);
		}
	}

	boolean method2490() {
		return ((Class148_Sub8) this).aBool10919;
	}

	void method2488(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub8) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub8) this).aBool10919 && class155_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1])) * 2.0F);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub8) this).aClass137_10921).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10011) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10117) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat9992) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub8) this).aBool10920 = true;
		}
	}

	void method2487(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub8) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub8) this).aBool10919 && class155_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1])) * 2.0F);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub8) this).aClass137_10921).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10011) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10117) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat9992) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub8) this).aBool10920 = true;
		}
	}

	void method2492() {
		if (((Class148_Sub8) this).aBool10920) {
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(null);
			OpenGL.glUseProgram(0);
			((Class148_Sub8) this).aBool10920 = false;
		}
	}

	void method2494(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub8) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub8) this).aBool10919 && class155_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1])) * 2.0F);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub8) this).aClass137_10921).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10011) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10117) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat9992) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub8) this).aBool10920 = true;
		}
	}

	void method2481(boolean bool) {
		Class155_Sub3 class155_sub3 = ((Class148_Sub8) this).aClass106_Sub1_1689.method9409();
		if (((Class148_Sub8) this).aBool10919 && class155_sub3 != null) {
			float f = (1.0F + (1.0F - Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1])) * 2.0F);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155_sub3);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9421(0);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub8) this).aClass137_10921).aClass155_Sub1_1604);
			int i = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUseProgram(i);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i, "sunDir"), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[0]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[1]), -(((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloatArray10113[2]));
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i, "sunColour"), (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10011) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat10117) * f, (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aFloat9992) * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i, "sunExponent"), 64.0F + (Math.abs(((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).aFloatArray10113[1]) * 928.0F));
			((Class148_Sub8) this).aBool10920 = true;
		}
	}

	void method2491(boolean bool) {
		/* empty */
	}

	Class148_Sub8(Class106_Sub1 class106_sub1, Class137 class137) {
		super(class106_sub1);
		((Class148_Sub8) this).aBool10919 = false;
		((Class148_Sub8) this).aClass137_10921 = class137;
		if ((((Class137) ((Class148_Sub8) this).aClass137_10921).aClass155_Sub1_1604) != null && (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aBool10116) && (((Class106_Sub1) ((Class148_Sub8) this).aClass106_Sub1_1689).aBool10048)) {
			Class136 class136 = (Class136.method2343(((Class148_Sub8) this).aClass106_Sub1_1689, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"));
			Class136 class136_8_ = (Class136.method2343(((Class148_Sub8) this).aClass106_Sub1_1689, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"));
			((Class148_Sub8) this).aClass149_10918 = Class149.method2496((((Class148_Sub8) this).aClass106_Sub1_1689), new Class136[] { class136, class136_8_ });
			((Class148_Sub8) this).aBool10919 = ((Class148_Sub8) this).aClass149_10918 != null;
		}
	}

	void method2493(int i, int i_9_) {
		if (((Class148_Sub8) this).aBool10920) {
			int i_10_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_11_ = i_9_ & 0xffff;
			float f_12_ = (float) (i_9_ >> 16 & 0x3) / 8.0F;
			float f_13_ = (float) (i_9_ >> 19 & 0xf) / 16.0F;
			float f_14_ = (float) (i_9_ >> 23 & 0xf) / 16.0F;
			int i_15_ = i_9_ >> 27 & 0xf;
			int i_16_ = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "time"), (float) (i_10_ * ((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).anInt10047 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterDepth"), (float) i_11_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "breakWaterOffset"), f_12_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_16_, "waveIntensity"), f_14_, f_13_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_16_, "waveExponent"), (float) i_15_);
		}
	}

	void method2480(int i, int i_17_) {
		if (((Class148_Sub8) this).aBool10920) {
			int i_18_ = 1 << (i & 0x3);
			float f = (float) (1 << (i >> 3 & 0x7)) / 32.0F;
			int i_19_ = i_17_ & 0xffff;
			float f_20_ = (float) (i_17_ >> 16 & 0x3) / 8.0F;
			float f_21_ = (float) (i_17_ >> 19 & 0xf) / 16.0F;
			float f_22_ = (float) (i_17_ >> 23 & 0xf) / 16.0F;
			int i_23_ = i_17_ >> 27 & 0xf;
			int i_24_ = (((Class149) ((Class148_Sub8) this).aClass149_10918).anInt1690);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "time"), (float) (i_18_ * ((Class106_Sub1) (((Class148_Sub8) this).aClass106_Sub1_1689)).anInt10047 % 40000) / 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "scale"), f);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterDepth"), (float) i_19_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "breakWaterOffset"), f_20_);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(i_24_, "waveIntensity"), f_22_, f_21_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_24_, "waveExponent"), (float) i_23_);
		}
	}

	void method2482(Class155 class155, int i) {
		if (!((Class148_Sub8) this).aBool10920) {
			((Class148_Sub8) this).aClass106_Sub1_1689.method9422(class155);
			((Class148_Sub8) this).aClass106_Sub1_1689.method9454(i);
		}
	}
}

package game;

/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class176 {
	Class149 aClass149_2097;
	Class106_Sub1 aClass106_Sub1_2098;
	static final String aString2099 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	boolean method2758() {
		if (((Class106_Sub1) ((Class176) this).aClass106_Sub1_2098).aBool10124 && (((Class106_Sub1) ((Class176) this).aClass106_Sub1_2098).aBool10048) && ((Class176) this).aClass149_2097 == null) {
			Class136 class136 = (Class136.method2343(((Class176) this).aClass106_Sub1_2098, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class136 != null)
				((Class176) this).aClass149_2097 = Class149.method2496((((Class176) this).aClass106_Sub1_2098), new Class136[] { class136 });
		}
		return ((Class176) this).aClass149_2097 != null;
	}

	boolean method2759(Class155_Sub1 class155_sub1, Class155_Sub1 class155_sub1_0_, float f) {
		if (!method2758())
			return false;
		Class104_Sub1_Sub1 class104_sub1_sub1 = (((Class106_Sub1) ((Class176) this).aClass106_Sub1_2098).aClass104_Sub1_Sub1_10128);
		Class572_Sub12_Sub3 class572_sub12_sub3 = new Class572_Sub12_Sub3(((Class176) this).aClass106_Sub1_2098, Class171.aClass171_2071, Class88.aClass88_1218, (((Class155_Sub1) class155_sub1).anInt9633), (((Class155_Sub1) class155_sub1).anInt9632));
		boolean bool = false;
		((Class176) this).aClass106_Sub1_2098.method1661(class104_sub1_sub1, -1671789007);
		class104_sub1_sub1.method9908(0, class572_sub12_sub3);
		if (class104_sub1_sub1.method9909()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, ((Class155_Sub1) class155_sub1).anInt9633, ((Class155_Sub1) class155_sub1).anInt9632);
			OpenGL.glUseProgram(((Class149) ((Class176) this).aClass149_2097).anInt1690);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation((((Class149) (((Class176) this).aClass149_2097)).anInt1690), "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation((((Class149) (((Class176) this).aClass149_2097)).anInt1690), "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation((((Class149) (((Class176) this).aClass149_2097)).anInt1690), "sampleSize"), 1.0F / (float) ((Class155_Sub1) class155_sub1_0_).anInt9633, 1.0F / (float) ((Class155_Sub1) class155_sub1_0_).anInt9632);
			for (int i = 0; i < ((Class155_Sub1) class155_sub1).anInt9634; i++) {
				float f_1_ = ((float) i / (float) ((Class155_Sub1) class155_sub1).anInt9634);
				((Class176) this).aClass106_Sub1_2098.method9422(class155_sub1_0_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class155_sub1.method9190(0, 0, i, ((Class155_Sub1) class155_sub1).anInt9633, ((Class155_Sub1) class155_sub1).anInt9632, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}
		class104_sub1_sub1.method9908(0, null);
		((Class176) this).aClass106_Sub1_2098.method1884(class104_sub1_sub1, 623696400);
		return bool;
	}

	boolean method2760() {
		if (((Class106_Sub1) ((Class176) this).aClass106_Sub1_2098).aBool10124 && (((Class106_Sub1) ((Class176) this).aClass106_Sub1_2098).aBool10048) && ((Class176) this).aClass149_2097 == null) {
			Class136 class136 = (Class136.method2343(((Class176) this).aClass106_Sub1_2098, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class136 != null)
				((Class176) this).aClass149_2097 = Class149.method2496((((Class176) this).aClass106_Sub1_2098), new Class136[] { class136 });
		}
		return ((Class176) this).aClass149_2097 != null;
	}

	boolean method2761() {
		if (((Class106_Sub1) ((Class176) this).aClass106_Sub1_2098).aBool10124 && (((Class106_Sub1) ((Class176) this).aClass106_Sub1_2098).aBool10048) && ((Class176) this).aClass149_2097 == null) {
			Class136 class136 = (Class136.method2343(((Class176) this).aClass106_Sub1_2098, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
			if (class136 != null)
				((Class176) this).aClass149_2097 = Class149.method2496((((Class176) this).aClass106_Sub1_2098), new Class136[] { class136 });
		}
		return ((Class176) this).aClass149_2097 != null;
	}

	Class176(Class106_Sub1 class106_sub1) {
		((Class176) this).aClass106_Sub1_2098 = class106_sub1;
	}
}

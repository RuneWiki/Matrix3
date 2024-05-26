package game;

/* Class572_Sub32_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class572_Sub32_Sub3 extends Class572_Sub32 {
	static int anInt11276;
	static float aFloat11277;
	static final String aString11278 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static Class96_Sub1[] aClass96_Sub1Array11279;
	static final String aString11280 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";
	static final String aString11281 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11282 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11283 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	static final String aString11284 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";
	static float[] aFloatArray11285 = { 0.0F, 0.0F, 0.0F };
	static final String aString11286 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";
	Class149[] aClass149Array11287 = null;
	static final String aString11288 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	boolean method10259() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10048);
	}

	boolean method8691() {
		if (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10048) {
			((Class572_Sub32_Sub3) this).aClass149Array11287 = new Class149[3];
			if (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10166) {
				((Class572_Sub32_Sub3) this).aClass149Array11287[0] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[1] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[2] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (((Class572_Sub32_Sub3) this).aClass149Array11287[i] == null)
						return false;
				}
			} else {
				((Class572_Sub32_Sub3) this).aClass149Array11287[0] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[1] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[2] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (((Class572_Sub32_Sub3) this).aClass149Array11287[i] == null)
						return false;
				}
			}
			return ((Class572_Sub32_Sub3) this).aClass149Array11287 != null;
		}
		return false;
	}

	boolean method8678() {
		return ((Class572_Sub32_Sub3) this).aClass149Array11287 != null;
	}

	boolean method8677() {
		if (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10048) {
			((Class572_Sub32_Sub3) this).aClass149Array11287 = new Class149[3];
			if (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10166) {
				((Class572_Sub32_Sub3) this).aClass149Array11287[0] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[1] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[2] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (((Class572_Sub32_Sub3) this).aClass149Array11287[i] == null)
						return false;
				}
			} else {
				((Class572_Sub32_Sub3) this).aClass149Array11287[0] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[1] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[2] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (((Class572_Sub32_Sub3) this).aClass149Array11287[i] == null)
						return false;
				}
			}
			return ((Class572_Sub32_Sub3) this).aClass149Array11287 != null;
		}
		return false;
	}

	void method8686(int i) {
		OpenGL.glUseProgram(0);
		for (int i_0_ = anInt11276; i_0_ >= 0; i_0_--) {
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9421(i_0_);
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9422(null);
		}
	}

	boolean method8692() {
		if (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10048) {
			((Class572_Sub32_Sub3) this).aClass149Array11287 = new Class149[3];
			if (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10166) {
				((Class572_Sub32_Sub3) this).aClass149Array11287[0] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[1] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[2] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (((Class572_Sub32_Sub3) this).aClass149Array11287[i] == null)
						return false;
				}
			} else {
				((Class572_Sub32_Sub3) this).aClass149Array11287[0] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[1] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				((Class572_Sub32_Sub3) this).aClass149Array11287[2] = (Class149.method2496(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, (new Class136[] { Class136.method2343(((Class572_Sub32_Sub3) this).aClass106_Sub1_9317, 35632, ("#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n"))) })));
				for (int i = 0; i < 3; i++) {
					if (((Class572_Sub32_Sub3) this).aClass149Array11287[i] == null)
						return false;
				}
			}
			return ((Class572_Sub32_Sub3) this).aClass149Array11287 != null;
		}
		return false;
	}

	void method8675(int i, Class155_Sub4 class155_sub4, Class155_Sub4 class155_sub4_1_, int i_2_, int i_3_) {
		if (anInt11276 >= 1 && anInt11276 <= 3) {
			int i_4_ = (((Class149) (((Class572_Sub32_Sub3) this).aClass149Array11287[anInt11276 - 1])).anInt1690);
			OpenGL.glUseProgram(i_4_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4_, "paramsWeightings"), aFloat11277, aFloatArray11285[0], aFloatArray11285[1], aFloatArray11285[2]);
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9421(0);
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9422(class155_sub4);
			for (int i_5_ = anInt11276 - 1; i_5_ >= 0; i_5_--) {
				if (aClass96_Sub1Array11279[i_5_] != null) {
					if (i_5_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "remap_1"), 1);
					if (i_5_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "remap_2"), 2);
					if (i_5_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "remap_3"), 3);
					((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9421(i_5_ + 1);
					Class155 class155 = aClass96_Sub1Array11279[i_5_].method9996();
					if (class155 != null)
						((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9422(class155);
				}
			}
		}
	}

	void method8697(int i) {
		OpenGL.glUseProgram(0);
		for (int i_6_ = anInt11276; i_6_ >= 0; i_6_--) {
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9421(i_6_);
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9422(null);
		}
	}

	void method8694(int i, int i_7_) {
		/* empty */
	}

	Class88 method8685() {
		return Class88.aClass88_1218;
	}

	boolean method8681() {
		return (aFloat11277 == 1.0F || (aFloatArray11285[0] + aFloatArray11285[1] + aFloatArray11285[2]) == 0.0F || (aClass96_Sub1Array11279[0] == null && aClass96_Sub1Array11279[1] == null && aClass96_Sub1Array11279[2] == null));
	}

	static {
		aFloat11277 = 1.0F;
		anInt11276 = 1;
		aClass96_Sub1Array11279 = new Class96_Sub1[] { null, null, null };
	}

	boolean method8688() {
		return ((Class572_Sub32_Sub3) this).aClass149Array11287 != null;
	}

	boolean method8689() {
		return ((Class572_Sub32_Sub3) this).aClass149Array11287 != null;
	}

	int method8687() {
		return 2;
	}

	boolean method8690() {
		return ((Class572_Sub32_Sub3) this).aClass149Array11287 != null;
	}

	int method8702() {
		return 2;
	}

	void method8693() {
		if (((Class572_Sub32_Sub3) this).aClass149Array11287 != null) {
			for (int i = 0; i < ((Class572_Sub32_Sub3) this).aClass149Array11287.length; i++)
				((Class572_Sub32_Sub3) this).aClass149Array11287[i] = null;
			((Class572_Sub32_Sub3) this).aClass149Array11287 = null;
		}
	}

	void method8680() {
		if (((Class572_Sub32_Sub3) this).aClass149Array11287 != null) {
			for (int i = 0; i < ((Class572_Sub32_Sub3) this).aClass149Array11287.length; i++)
				((Class572_Sub32_Sub3) this).aClass149Array11287[i] = null;
			((Class572_Sub32_Sub3) this).aClass149Array11287 = null;
		}
	}

	Class572_Sub32_Sub3(Class106_Sub1 class106_sub1) {
		super(class106_sub1);
	}

	void method8695(int i, int i_8_) {
		/* empty */
	}

	void method8707(int i, Class155_Sub4 class155_sub4, Class155_Sub4 class155_sub4_9_, int i_10_, int i_11_) {
		if (anInt11276 >= 1 && anInt11276 <= 3) {
			int i_12_ = (((Class149) (((Class572_Sub32_Sub3) this).aClass149Array11287[anInt11276 - 1])).anInt1690);
			OpenGL.glUseProgram(i_12_);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_12_, "sceneTex"), 0);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_12_, "paramsWeightings"), aFloat11277, aFloatArray11285[0], aFloatArray11285[1], aFloatArray11285[2]);
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9421(0);
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9422(class155_sub4);
			for (int i_13_ = anInt11276 - 1; i_13_ >= 0; i_13_--) {
				if (aClass96_Sub1Array11279[i_13_] != null) {
					if (i_13_ == 0)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_12_, "remap_1"), 1);
					if (i_13_ == 1)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_12_, "remap_2"), 2);
					if (i_13_ == 2)
						OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_12_, "remap_3"), 3);
					((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9421(i_13_ + 1);
					Class155 class155 = aClass96_Sub1Array11279[i_13_].method9996();
					if (class155 != null)
						((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9422(class155);
				}
			}
		}
	}

	void method8679(int i, int i_14_) {
		/* empty */
	}

	void method8698(int i) {
		OpenGL.glUseProgram(0);
		for (int i_15_ = anInt11276; i_15_ >= 0; i_15_--) {
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9421(i_15_);
			((Class572_Sub32_Sub3) this).aClass106_Sub1_9317.method9422(null);
		}
	}

	void method8683() {
		if (((Class572_Sub32_Sub3) this).aClass149Array11287 != null) {
			for (int i = 0; i < ((Class572_Sub32_Sub3) this).aClass149Array11287.length; i++)
				((Class572_Sub32_Sub3) this).aClass149Array11287[i] = null;
			((Class572_Sub32_Sub3) this).aClass149Array11287 = null;
		}
	}

	int method8703() {
		return 2;
	}

	Class88 method8706() {
		return Class88.aClass88_1218;
	}

	Class88 method8676() {
		return Class88.aClass88_1218;
	}

	boolean method8708() {
		return (aFloat11277 == 1.0F || (aFloatArray11285[0] + aFloatArray11285[1] + aFloatArray11285[2]) == 0.0F || (aClass96_Sub1Array11279[0] == null && aClass96_Sub1Array11279[1] == null && aClass96_Sub1Array11279[2] == null));
	}

	boolean method10260() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10048);
	}

	boolean method10261() {
		return (((Class106_Sub1) ((Class572_Sub32_Sub3) this).aClass106_Sub1_9317).aBool10048);
	}
}

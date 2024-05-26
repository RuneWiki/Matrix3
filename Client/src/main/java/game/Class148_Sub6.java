package game;

/* Class148_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148_Sub6 extends Class148 {
	static final String aString10672 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	boolean aBool10673;
	Class156 aClass156_10674;
	static final String aString10675 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	static final String aString10676 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	static final String aString10677 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	boolean aBool10678;
	boolean aBool10679 = false;
	Class155_Sub4 aClass155_Sub4_10680;
	Class156 aClass156_10681;
	Class156 aClass156_10682;
	boolean aBool10683;
	Class156 aClass156_10684;
	static float[] aFloatArray10685 = { 0.0F, -1.0F, 0.0F, 0.0F };

	void method2495(boolean bool) {
		((Class148_Sub6) this).aBool10678 = bool;
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class148_Sub6) this).aClass155_Sub4_10680);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(34165, 7681);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34166, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		method9980();
	}

	boolean method2479() {
		return ((Class148_Sub6) this).aBool10673;
	}

	void method2481(boolean bool) {
		((Class148_Sub6) this).aBool10678 = bool;
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class148_Sub6) this).aClass155_Sub4_10680);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(34165, 7681);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34166, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		method9980();
	}

	void method2483() {
		if (((Class148_Sub6) this).aBool10683) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class148_Sub6) this).aBool10683 = false;
		}
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(null);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 34166, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		if (((Class148_Sub6) this).aBool10679) {
			((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
			((Class148_Sub6) this).aBool10679 = false;
		}
	}

	void method9980() {
		Class250 class250 = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass250_10197);
		if (((Class148_Sub6) this).aBool10678)
			OpenGL.glBindProgramARB(34336, ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).anInt10137) == 2147483647 ? (((Class156) ((Class148_Sub6) this).aClass156_10674).anInt1754) : (((Class156) ((Class148_Sub6) this).aClass156_10681).anInt1754)));
		else
			OpenGL.glBindProgramARB(34336, ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).anInt10137) == 2147483647 ? (((Class156) ((Class148_Sub6) this).aClass156_10684).anInt1754) : (((Class156) ((Class148_Sub6) this).aClass156_10682).anInt1754)));
		float f = (float) ((Class106_Sub1) (((Class148_Sub6) this).aClass106_Sub1_1689)).anInt10137;
		float f_0_ = class250.aFloatArray2728[4] * f + class250.aFloatArray2728[12];
		float f_1_ = class250.aFloatArray2728[5] * f + class250.aFloatArray2728[13];
		float f_2_ = class250.aFloatArray2728[6] * f + class250.aFloatArray2728[14];
		aFloatArray10685[0] = -class250.aFloatArray2728[4];
		aFloatArray10685[1] = -class250.aFloatArray2728[5];
		aFloatArray10685[2] = -class250.aFloatArray2728[6];
		aFloatArray10685[3] = -(aFloatArray10685[0] * f_0_ + aFloatArray10685[1] * f_1_ + aFloatArray10685[2] * f_2_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray10685[0], aFloatArray10685[1], aFloatArray10685[2], aFloatArray10685[3]);
		OpenGL.glEnable(34336);
		((Class148_Sub6) this).aBool10683 = true;
		method9981();
	}

	Class148_Sub6(Class106_Sub1 class106_sub1) {
		super(class106_sub1);
		if (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aBool10172) {
			((Class148_Sub6) this).aClass156_10684 = (Class156.method2543(((Class148_Sub6) this).aClass106_Sub1_1689, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			((Class148_Sub6) this).aClass156_10674 = (Class156.method2543(((Class148_Sub6) this).aClass106_Sub1_1689, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			((Class148_Sub6) this).aClass156_10682 = (Class156.method2543(((Class148_Sub6) this).aClass106_Sub1_1689, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			((Class148_Sub6) this).aClass156_10681 = (Class156.method2543(((Class148_Sub6) this).aClass106_Sub1_1689, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			if (((Class148_Sub6) this).aClass156_10684 != null & ((Class148_Sub6) this).aClass156_10674 != null & ((Class148_Sub6) this).aClass156_10682 != null & ((Class148_Sub6) this).aClass156_10681 != null) {
				((Class148_Sub6) this).aClass155_Sub4_10680 = new Class155_Sub4(class106_sub1, 3553, Class171.aClass171_2073, Class88.aClass88_1218, 2, 1, false, new byte[] { 0, -1 }, Class171.aClass171_2073, false);
				((Class148_Sub6) this).aClass155_Sub4_10680.method9195(false, false);
				((Class148_Sub6) this).aBool10673 = true;
			} else
				((Class148_Sub6) this).aBool10673 = false;
		} else
			((Class148_Sub6) this).aBool10673 = false;
	}

	void method2486(Class155 class155, int i) {
		if (class155 == null) {
			if (!((Class148_Sub6) this).aBool10679) {
				((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass155_Sub4_10195);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9454(1);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34168, 768);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
				((Class148_Sub6) this).aBool10679 = true;
			}
		} else {
			if (((Class148_Sub6) this).aBool10679) {
				((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
				((Class148_Sub6) this).aBool10679 = false;
			}
			((Class148_Sub6) this).aClass106_Sub1_1689.method9422(class155);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9454(i);
		}
	}

	void method2493(int i, int i_3_) {
		/* empty */
	}

	void method2494(boolean bool) {
		((Class148_Sub6) this).aBool10678 = bool;
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class148_Sub6) this).aClass155_Sub4_10680);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(34165, 7681);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34166, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		method9980();
	}

	boolean method2490() {
		return ((Class148_Sub6) this).aBool10673;
	}

	void method2485(boolean bool) {
		((Class148_Sub6) this).aBool10678 = bool;
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class148_Sub6) this).aClass155_Sub4_10680);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(34165, 7681);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34166, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		method9980();
	}

	void method2487(boolean bool) {
		((Class148_Sub6) this).aBool10678 = bool;
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class148_Sub6) this).aClass155_Sub4_10680);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(34165, 7681);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34166, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		method9980();
	}

	void method2488(boolean bool) {
		((Class148_Sub6) this).aBool10678 = bool;
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class148_Sub6) this).aClass155_Sub4_10680);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(34165, 7681);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34166, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		method9980();
	}

	void method9981() {
		if (((Class148_Sub6) this).aBool10683) {
			float f = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aFloat10091);
			float f_4_ = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aFloat10090);
			float f_5_ = f - (f - f_4_) * 0.125F;
			float f_6_ = f - (f - f_4_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_6_, f_5_, 256.0F / (float) ((((Class106_Sub1) (((Class148_Sub6) this).aClass106_Sub1_1689)).aClass86_10018.anInt1190) * -1018540369), (float) ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass86_10018.anInt1191) * 1873501081) / 255.0F);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9425((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass86_10018.anInt1193) * 526464983);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2482(Class155 class155, int i) {
		if (class155 == null) {
			if (!((Class148_Sub6) this).aBool10679) {
				((Class148_Sub6) this).aClass106_Sub1_1689.method9422(((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass155_Sub4_10195);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9454(1);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 34168, 768);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 34168, 770);
				((Class148_Sub6) this).aBool10679 = true;
			}
		} else {
			if (((Class148_Sub6) this).aBool10679) {
				((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
				((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
				((Class148_Sub6) this).aBool10679 = false;
			}
			((Class148_Sub6) this).aClass106_Sub1_1689.method9422(class155);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9454(i);
		}
	}

	void method2491(boolean bool) {
		/* empty */
	}

	void method2492() {
		if (((Class148_Sub6) this).aBool10683) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class148_Sub6) this).aBool10683 = false;
		}
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9422(null);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9434(8448, 8448);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9423(2, 34166, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
		((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		if (((Class148_Sub6) this).aBool10679) {
			((Class148_Sub6) this).aClass106_Sub1_1689.method9423(0, 5890, 768);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
			((Class148_Sub6) this).aBool10679 = false;
		}
	}

	void method9982() {
		Class250 class250 = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass250_10197);
		if (((Class148_Sub6) this).aBool10678)
			OpenGL.glBindProgramARB(34336, ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).anInt10137) == 2147483647 ? (((Class156) ((Class148_Sub6) this).aClass156_10674).anInt1754) : (((Class156) ((Class148_Sub6) this).aClass156_10681).anInt1754)));
		else
			OpenGL.glBindProgramARB(34336, ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).anInt10137) == 2147483647 ? (((Class156) ((Class148_Sub6) this).aClass156_10684).anInt1754) : (((Class156) ((Class148_Sub6) this).aClass156_10682).anInt1754)));
		float f = (float) ((Class106_Sub1) (((Class148_Sub6) this).aClass106_Sub1_1689)).anInt10137;
		float f_7_ = class250.aFloatArray2728[4] * f + class250.aFloatArray2728[12];
		float f_8_ = class250.aFloatArray2728[5] * f + class250.aFloatArray2728[13];
		float f_9_ = class250.aFloatArray2728[6] * f + class250.aFloatArray2728[14];
		aFloatArray10685[0] = -class250.aFloatArray2728[4];
		aFloatArray10685[1] = -class250.aFloatArray2728[5];
		aFloatArray10685[2] = -class250.aFloatArray2728[6];
		aFloatArray10685[3] = -(aFloatArray10685[0] * f_7_ + aFloatArray10685[1] * f_8_ + aFloatArray10685[2] * f_9_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray10685[0], aFloatArray10685[1], aFloatArray10685[2], aFloatArray10685[3]);
		OpenGL.glEnable(34336);
		((Class148_Sub6) this).aBool10683 = true;
		method9981();
	}

	void method2489(int i, int i_10_) {
		/* empty */
	}

	void method2484(boolean bool) {
		/* empty */
	}

	void method9983() {
		Class250 class250 = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass250_10197);
		if (((Class148_Sub6) this).aBool10678)
			OpenGL.glBindProgramARB(34336, ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).anInt10137) == 2147483647 ? (((Class156) ((Class148_Sub6) this).aClass156_10674).anInt1754) : (((Class156) ((Class148_Sub6) this).aClass156_10681).anInt1754)));
		else
			OpenGL.glBindProgramARB(34336, ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).anInt10137) == 2147483647 ? (((Class156) ((Class148_Sub6) this).aClass156_10684).anInt1754) : (((Class156) ((Class148_Sub6) this).aClass156_10682).anInt1754)));
		float f = (float) ((Class106_Sub1) (((Class148_Sub6) this).aClass106_Sub1_1689)).anInt10137;
		float f_11_ = class250.aFloatArray2728[4] * f + class250.aFloatArray2728[12];
		float f_12_ = class250.aFloatArray2728[5] * f + class250.aFloatArray2728[13];
		float f_13_ = class250.aFloatArray2728[6] * f + class250.aFloatArray2728[14];
		aFloatArray10685[0] = -class250.aFloatArray2728[4];
		aFloatArray10685[1] = -class250.aFloatArray2728[5];
		aFloatArray10685[2] = -class250.aFloatArray2728[6];
		aFloatArray10685[3] = -(aFloatArray10685[0] * f_11_ + aFloatArray10685[1] * f_12_ + aFloatArray10685[2] * f_13_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray10685[0], aFloatArray10685[1], aFloatArray10685[2], aFloatArray10685[3]);
		OpenGL.glEnable(34336);
		((Class148_Sub6) this).aBool10683 = true;
		method9981();
	}

	void method2480(int i, int i_14_) {
		/* empty */
	}

	void method9984() {
		if (((Class148_Sub6) this).aBool10683) {
			float f = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aFloat10091);
			float f_15_ = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aFloat10090);
			float f_16_ = f - (f - f_15_) * 0.125F;
			float f_17_ = f - (f - f_15_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_17_, f_16_, 256.0F / (float) ((((Class106_Sub1) (((Class148_Sub6) this).aClass106_Sub1_1689)).aClass86_10018.anInt1190) * -1018540369), (float) ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass86_10018.anInt1191) * 1873501081) / 255.0F);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9425((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass86_10018.anInt1193) * 526464983);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method9985() {
		if (((Class148_Sub6) this).aBool10683) {
			float f = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aFloat10091);
			float f_18_ = (((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aFloat10090);
			float f_19_ = f - (f - f_18_) * 0.125F;
			float f_20_ = f - (f - f_18_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_20_, f_19_, 256.0F / (float) ((((Class106_Sub1) (((Class148_Sub6) this).aClass106_Sub1_1689)).aClass86_10018.anInt1190) * -1018540369), (float) ((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass86_10018.anInt1191) * 1873501081) / 255.0F);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9425((((Class106_Sub1) ((Class148_Sub6) this).aClass106_Sub1_1689).aClass86_10018.anInt1193) * 526464983);
			((Class148_Sub6) this).aClass106_Sub1_1689.method9421(0);
		}
	}
}

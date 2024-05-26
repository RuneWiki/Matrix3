package game;

/* Class148_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class148_Sub2 extends Class148 {
	int anInt9651;
	static final String aString9652 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	static float[] aFloatArray9653 = new float[4];
	Class141 aClass141_9654;
	static final char aChar9655 = '\001';
	float[] aFloatArray9656;
	float aFloat9657;
	Class156 aClass156_9658;
	Class137 aClass137_9659;
	static final char aChar9660 = '\0';

	Class148_Sub2(Class106_Sub1 class106_sub1, Class137 class137) {
		super(class106_sub1);
		((Class148_Sub2) this).aClass137_9659 = class137;
		if ((((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aBool10172) && (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10150) >= 2) {
			((Class148_Sub2) this).aClass156_9658 = (Class156.method2543(((Class148_Sub2) this).aClass106_Sub1_1689, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (((Class148_Sub2) this).aClass156_9658 != null) {
				int[][] is = Class274.method3694(64, 256, 0, 4, 4, 3, 0.4F, false, 1736232854);
				int[][] is_0_ = Class274.method3694(64, 256, 8, 4, 4, 3, 0.4F, false, 465324128);
				int i = 0;
				((Class148_Sub2) this).aFloatArray9656 = new float[32768];
				for (int i_1_ = 0; i_1_ < 256; i_1_++) {
					int[] is_2_ = is[i_1_];
					int[] is_3_ = is_0_[i_1_];
					for (int i_4_ = 0; i_4_ < 64; i_4_++) {
						((Class148_Sub2) this).aFloatArray9656[i++] = (float) is_2_[i_4_] / 4096.0F;
						((Class148_Sub2) this).aFloatArray9656[i++] = (float) is_3_[i_4_] / 4096.0F;
					}
				}
				method9212();
			}
		}
	}

	void method2491(boolean bool) {
		/* empty */
	}

	void method9212() {
		((Class148_Sub2) this).aClass141_9654 = new Class141(((Class148_Sub2) this).aClass106_Sub1_1689, 2);
		((Class148_Sub2) this).aClass141_9654.method2448(0);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9425(-16777216);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9434(260, 7681);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9424(0, 34166, 770);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glBindProgramARB(34336, ((Class156) (((Class148_Sub2) this).aClass156_9658)).anInt1754);
		OpenGL.glEnable(34336);
		((Class148_Sub2) this).aClass141_9654.method2447();
		((Class148_Sub2) this).aClass141_9654.method2448(1);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9454(0);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		((Class148_Sub2) this).aClass141_9654.method2447();
	}

	void method2481(boolean bool) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\0');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aClass250_10078.aFloatArray2728), 0);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if (((Class148_Sub2) this).anInt9651 != ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047) {
				int i = (((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047 % 5000 * 128 / 5000);
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_5_, (((Class148_Sub2) this).aFloatArray9656), i);
					i += 2;
				}
				if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
					((Class148_Sub2) this).aFloat9657 = (float) ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class148_Sub2) this).anInt9651 = ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047;
			}
		}
	}

	void method2484(boolean bool) {
		/* empty */
	}

	void method2483() {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\001');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2480(int i, int i_6_) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			if ((i & 0x80) == 0) {
				if ((i_6_ & 0x1) == 1) {
					if (!((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605) {
						int i_7_ = ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000 * 16 / 4000);
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub4Array1601[i_7_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub1_1599);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class148_Sub2) this).aFloat9657, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub1_1599);
					else
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub4Array1601[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class148_Sub2) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if ((i & 0x40) == 0) {
				aFloatArray9653[0] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat10011);
				aFloatArray9653[1] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat10117);
				aFloatArray9653[2] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat9992);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9653, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_8_ = i & 0x3;
			if (i_8_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_8_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2486(Class155 class155, int i) {
		((Class148_Sub2) this).aClass106_Sub1_1689.method9422(class155);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9454(i);
	}

	boolean method2479() {
		return true;
	}

	void method9213() {
		((Class148_Sub2) this).aClass141_9654 = new Class141(((Class148_Sub2) this).aClass106_Sub1_1689, 2);
		((Class148_Sub2) this).aClass141_9654.method2448(0);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9425(-16777216);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9434(260, 7681);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9424(0, 34166, 770);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glBindProgramARB(34336, ((Class156) (((Class148_Sub2) this).aClass156_9658)).anInt1754);
		OpenGL.glEnable(34336);
		((Class148_Sub2) this).aClass141_9654.method2447();
		((Class148_Sub2) this).aClass141_9654.method2448(1);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9454(0);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9424(0, 5890, 770);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		((Class148_Sub2) this).aClass141_9654.method2447();
	}

	void method2489(int i, int i_9_) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			if ((i & 0x80) == 0) {
				if ((i_9_ & 0x1) == 1) {
					if (!((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605) {
						int i_10_ = ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000 * 16 / 4000);
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub4Array1601[i_10_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub1_1599);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class148_Sub2) this).aFloat9657, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub1_1599);
					else
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub4Array1601[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class148_Sub2) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if ((i & 0x40) == 0) {
				aFloatArray9653[0] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat10011);
				aFloatArray9653[1] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat10117);
				aFloatArray9653[2] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat9992);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9653, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_11_ = i & 0x3;
			if (i_11_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_11_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2487(boolean bool) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\0');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aClass250_10078.aFloatArray2728), 0);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if (((Class148_Sub2) this).anInt9651 != ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047) {
				int i = (((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047 % 5000 * 128 / 5000);
				for (int i_12_ = 0; i_12_ < 64; i_12_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_12_, (((Class148_Sub2) this).aFloatArray9656), i);
					i += 2;
				}
				if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
					((Class148_Sub2) this).aFloat9657 = (float) ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class148_Sub2) this).anInt9651 = ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047;
			}
		}
	}

	void method2488(boolean bool) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\0');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aClass250_10078.aFloatArray2728), 0);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if (((Class148_Sub2) this).anInt9651 != ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047) {
				int i = (((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047 % 5000 * 128 / 5000);
				for (int i_13_ = 0; i_13_ < 64; i_13_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_13_, (((Class148_Sub2) this).aFloatArray9656), i);
					i += 2;
				}
				if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
					((Class148_Sub2) this).aFloat9657 = (float) ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class148_Sub2) this).anInt9651 = ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047;
			}
		}
	}

	void method2494(boolean bool) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\0');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aClass250_10078.aFloatArray2728), 0);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if (((Class148_Sub2) this).anInt9651 != ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047) {
				int i = (((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047 % 5000 * 128 / 5000);
				for (int i_14_ = 0; i_14_ < 64; i_14_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_14_, (((Class148_Sub2) this).aFloatArray9656), i);
					i += 2;
				}
				if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
					((Class148_Sub2) this).aFloat9657 = (float) ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class148_Sub2) this).anInt9651 = ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047;
			}
		}
	}

	void method2495(boolean bool) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\0');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aClass250_10078.aFloatArray2728), 0);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if (((Class148_Sub2) this).anInt9651 != ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047) {
				int i = (((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047 % 5000 * 128 / 5000);
				for (int i_15_ = 0; i_15_ < 64; i_15_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_15_, (((Class148_Sub2) this).aFloatArray9656), i);
					i += 2;
				}
				if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
					((Class148_Sub2) this).aFloat9657 = (float) ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class148_Sub2) this).anInt9651 = ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047;
			}
		}
	}

	void method2485(boolean bool) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\0');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aClass250_10078.aFloatArray2728), 0);
			OpenGL.glMatrixMode(5888);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if (((Class148_Sub2) this).anInt9651 != ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047) {
				int i = (((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047 % 5000 * 128 / 5000);
				for (int i_16_ = 0; i_16_ < 64; i_16_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_16_, (((Class148_Sub2) this).aFloatArray9656), i);
					i += 2;
				}
				if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
					((Class148_Sub2) this).aFloat9657 = (float) ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class148_Sub2) this).anInt9651 = ((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).anInt10047;
			}
		}
	}

	void method2492() {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass141_9654.method2449('\001');
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
		}
	}

	void method2493(int i, int i_17_) {
		if (((Class148_Sub2) this).aClass141_9654 != null) {
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(1);
			if ((i & 0x80) == 0) {
				if ((i_17_ & 0x1) == 1) {
					if (!((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605) {
						int i_18_ = ((((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).anInt10047) % 4000 * 16 / 4000);
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub4Array1601[i_18_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub1_1599);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class148_Sub2) this).aFloat9657, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class137) ((Class148_Sub2) this).aClass137_9659).aBool1605)
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub1_1599);
					else
						((Class148_Sub2) this).aClass106_Sub1_1689.method9422(((Class137) ((Class148_Sub2) this).aClass137_9659).aClass155_Sub4Array1601[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class148_Sub2) this).aClass106_Sub1_1689.method9422(null);
			((Class148_Sub2) this).aClass106_Sub1_1689.method9421(0);
			if ((i & 0x40) == 0) {
				aFloatArray9653[0] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat10011);
				aFloatArray9653[1] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat10117);
				aFloatArray9653[2] = (((Class106_Sub1) ((Class148_Sub2) this).aClass106_Sub1_1689).aFloat10119 * ((Class106_Sub1) (((Class148_Sub2) this).aClass106_Sub1_1689)).aFloat9992);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9653, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_19_ = i & 0x3;
			if (i_19_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_19_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	boolean method2490() {
		return true;
	}

	void method2482(Class155 class155, int i) {
		((Class148_Sub2) this).aClass106_Sub1_1689.method9422(class155);
		((Class148_Sub2) this).aClass106_Sub1_1689.method9454(i);
	}
}

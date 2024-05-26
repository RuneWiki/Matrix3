package game;

/* Class106_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;

import java.awt.Canvas;

public class Class106_Sub3_Sub1 extends Class106_Sub3 {
	boolean aBool11027;
	long[] aLongArray11028;
	long aLong11029 = 0L;
	D3DDISPLAYMODE aD3DDISPLAYMODE11030;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11031;
	int anInt11032;
	int anInt11033;
	boolean aBool11034;
	long aLong11035;
	boolean aBool11036;
	long aLong11037;
	boolean aBool11038;
	boolean[] aBoolArray11039;
	boolean[] aBoolArray11040;
	boolean[] aBoolArray11041;
	boolean[] aBoolArray11042;
	boolean aBool11043;
	int anInt11044;
	Class250 aClass250_11045;
	Class405_Sub1 aClass405_Sub1_11046;
	static final int anInt11047 = 3;
	D3DCAPS aD3DCAPS11048;
	int[] anIntArray11049;
	boolean aBool11050;
	boolean aBool11051;
	long aLong11052;
	static int[] anIntArray11053 = { 77, 80 };
	boolean aBool11054;
	boolean aBool11055;
	boolean aBool11056;
	boolean aBool11057;
	Class367[] aClass367Array11058;
	float[] aFloatArray11059;
	int anInt11060;
	int anInt11061;
	long[] aLongArray11062;
	long aLong11063;
	long aLong11064;
	long[] aLongArray11065;
	long aLong11066 = 0L;
	int[] anIntArray11067;
	int anInt11068;
	boolean aBool11069;
	Class675 aClass675_11070 = new Class675();
	static int[] anIntArray11071 = { 22, 23 };

	public final void method9825(Class379 class379, int i, int i_0_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawPrimitive(((Class106_Sub3_Sub1) this).aLong11066, method10095(class379), i, i_0_);
	}

	public boolean method9576(boolean bool) {
		if (bool)
			return ((Class106_Sub3_Sub1) this).aBool11056;
		return (((Class106_Sub3_Sub1) this).aBool11056 && ((Class106_Sub3_Sub1) this).aBool11057);
	}

	static Class106 method10081(Canvas canvas, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, Class248 class248, Integer integer) {
		Class106_Sub3_Sub1 class106_sub3_sub1 = null;
		Class106_Sub3_Sub1 class106_sub3_sub1_1_;
		try {
			int i = 0;
			int i_2_ = 1;
			long l = IDirect3D.Direct3DCreate();
			D3DCAPS d3dcaps = new D3DCAPS();
			IDirect3D.GetDeviceCaps(l, i, i_2_, d3dcaps);
			if ((d3dcaps.RasterCaps & 0x1000000) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxSimultaneousTextures < 2)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x8) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x40) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x200) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.TextureOpCaps & 0x2000000) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x10) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20) == 0)
				throw new RuntimeException("");
			if ((d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x2) == 0)
				throw new RuntimeException("");
			if (d3dcaps.MaxActiveLights > 0 && d3dcaps.MaxActiveLights < 2)
				throw new RuntimeException("");
			if (d3dcaps.MaxStreams < 5)
				throw new RuntimeException("");
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.BackBufferWidth = canvas.getWidth();
			d3dpresent_parameters.BackBufferHeight = canvas.getHeight();
			d3dpresent_parameters.BackBufferCount = 1;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if (!method10096(i, i_2_, l, integer.intValue(), d3ddisplaymode, d3dpresent_parameters))
				throw new RuntimeException("");
			int i_3_ = 0;
			if ((d3dcaps.DevCaps & 0x100000) != 0)
				i_3_ |= 0x10;
			long l_4_ = 0L;
			try {
				l_4_ = IDirect3D.CreateDeviceContext(l, i, i_2_, canvas, i_3_ | 0x40, d3dpresent_parameters);
			} catch (RuntimeException_Sub1 runtimeexception_sub1) {
				l_4_ = IDirect3D.CreateDeviceContext(l, i, i_2_, canvas, i_3_ & ~0x100000 | 0x20, d3dpresent_parameters);
			}
			class106_sub3_sub1 = new Class106_Sub3_Sub1(i, i_2_, l, l_4_, d3ddisplaymode, d3dpresent_parameters, d3dcaps, mapSize, interface5, interface35, interface36, interface37, class248, integer.intValue());
			if (!class106_sub3_sub1.aHashtable1412.containsKey(canvas)) {
				Class213.method3073(canvas, (byte) -58);
				class106_sub3_sub1.method1841(canvas, new Class104_Sub2_Sub1_Sub1(class106_sub3_sub1, canvas, canvas.getWidth(), canvas.getHeight(), true), -1829943457);
			}
			class106_sub3_sub1.method1688(canvas, (byte) 13);
			class106_sub3_sub1.method9580();
			class106_sub3_sub1_1_ = class106_sub3_sub1;
		} catch (RuntimeException runtimeexception) {
			if (class106_sub3_sub1 != null)
				class106_sub3_sub1.method1667();
			throw runtimeexception;
		}
		return class106_sub3_sub1_1_;
	}

	public boolean method1701() {
		return false;
	}

	void method9687() {
		for (LinkableObject class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7932((byte) 50); class572_sub9 != null; class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7926(1084408829)) {
			Interface22 interface22 = (Interface22) class572_sub9.anObject9081;
			interface22.method122();
			if (interface22 == aClass104_1410)
				interface22.method126();
		}
		super.method9687();
	}

	void method9583() {
		method2018();
		for (LinkableObject class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7932((byte) 50); class572_sub9 != null; class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7926(1163490856)) {
			Interface22 interface22 = (Interface22) class572_sub9.anObject9081;
			interface22.method39();
		}
		super.method9583();
	}

	public boolean method9727(boolean bool) {
		if (bool)
			return ((Class106_Sub3_Sub1) this).aBool11056;
		return (((Class106_Sub3_Sub1) this).aBool11056 && ((Class106_Sub3_Sub1) this).aBool11057);
	}

	void method9738() {
		for (int i = 0; i < anInt10454; i++) {
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 2, 1);
			((Class106_Sub3_Sub1) this).aClass367Array11058[i] = Class367.aClass367_4508;
			boolean[] bools = ((Class106_Sub3_Sub1) this).aBoolArray11039;
			int i_5_ = i;
			((Class106_Sub3_Sub1) this).aBoolArray11040[i] = true;
			bools[i_5_] = true;
			((Class106_Sub3_Sub1) this).aBoolArray11042[i] = false;
			((Class106_Sub3_Sub1) this).anIntArray11049[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 9, 2);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 23, 4);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 25, 5);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 24, 0);
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 206, aBool10526);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 181, 0);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 22, 2);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 147, 1);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 145, 1);
		IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 35, 3);
		IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 154, 1.0F);
		D3DLIGHT.SetType(((Class106_Sub3_Sub1) this).aLong11035, 3);
		D3DLIGHT.SetType(((Class106_Sub3_Sub1) this).aLong11063, 3);
		D3DLIGHT.SetType(((Class106_Sub3_Sub1) this).aLong11037, 1);
		((Class106_Sub3_Sub1) this).aBool11038 = false;
		super.method9738();
	}

	public void method1706(long l) {
		/* empty */
	}

	void method1664(int i, int i_6_) throws Exception_Sub1 {
		if (((Class106_Sub3_Sub1) this).aBool11051) {
			if (!method10100(aClass104_Sub2_1419.method1648(), aClass104_Sub2_1419.method1646()))
				return;
			((Class104_Sub2_Sub1_Sub1) aClass104_Sub2_1419).method122();
		} else
			IDirect3DDevice.EndScene(((Class106_Sub3_Sub1) this).aLong11066);
		int i_7_ = aClass104_Sub2_1419.method9924();
		if (Class32.method766(i_7_)) {
			((Class106_Sub3_Sub1) this).aBool11051 = true;
			aClass104_Sub2_1419.method39();
		} else {
			IDirect3DDevice.BeginScene(((Class106_Sub3_Sub1) this).aLong11066);
			if (anInterface5_1408 != null)
				anInterface5_1408.method22((byte) 18);
		}
	}

	void method1667() {
		super.method1667();
		if (((Class106_Sub3_Sub1) this).aLong11035 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11035);
			((Class106_Sub3_Sub1) this).aLong11035 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11063 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11063);
			((Class106_Sub3_Sub1) this).aLong11063 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11037 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11037);
			((Class106_Sub3_Sub1) this).aLong11037 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11066 != 0L) {
			IDirect3DDevice.Destroy(((Class106_Sub3_Sub1) this).aLong11066);
			((Class106_Sub3_Sub1) this).aLong11066 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11029 != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLong11029);
			((Class106_Sub3_Sub1) this).aLong11029 = 0L;
		}
	}

	public void finalize() {
		super.finalize();
	}

	public float method9590() {
		return -0.5F;
	}

	void method10082(Interface22 interface22) {
		if (method10102(interface22) == null)
			((Class106_Sub3_Sub1) this).aClass675_11070.method7940(new LinkableObject(interface22), -1837037294);
	}

	Class104_Sub2 method1692(Canvas canvas, int i, int i_8_) {
		return new Class104_Sub2_Sub1_Sub1(this, canvas, i, i_8_, false);
	}

	public Interface6 method2039(int i, int i_9_, Class171 class171, Class88 class88, int i_10_) {
		return new Class329(this, class171, class88, i, i_9_, i_10_);
	}

	public void method1858() {
		if (((Class106_Sub3_Sub1) this).aLong11064 != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLong11064);
			((Class106_Sub3_Sub1) this).aLong11064 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
			if (((Class106_Sub3_Sub1) this).aLongArray11028[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11028[i]);
				((Class106_Sub3_Sub1) this).aLongArray11028[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	public Interface11 method1781(int i, int i_11_, int i_12_) {
		return new Class211(this, Class88.aClass88_1216, i, i_11_, i_12_);
	}

	void method9730() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 7, aBool10442);
	}

	final void method9696() {
		if (aBool10488)
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 60, anInt10471);
	}

	void method9752() {
		if (aClass104_1410 != null)
			IDirect3DDevice.SetViewport(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10434, anInt10424 + anInt10435, anInt10531, anInt10437, aFloat10364, aFloat10421);
	}

	public int[] method1696(int i, int i_13_, int i_14_, int i_15_) {
		method1747();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, 0);
		long l_16_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) this).aLong11066), i_14_, i_15_, 21, 0, 0, true);
		int i_17_ = IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) this).aLong11066), l, i, i_13_, i_14_, i_15_, l_16_, 0, 0, i_14_, i_15_, 1);
		method9661(i_14_ * i_15_ * 4);
		if (Class32.method767(i_17_)) {
			is = new int[i_14_ * i_15_];
			IDirect3DSurface.Download(l_16_, 0, 0, i_14_, i_15_, i_14_ * 4, 16, aLong10444);
			aByteBuffer10378.clear();
			aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_16_);
		return is;
	}

	public void method2044() {
		/* empty */
	}

	public boolean method1698() {
		return true;
	}

	void method10083(int i, int i_18_) {
		method2018();
		method1708(i, i_18_, 1671298338);
		((Class106_Sub3_Sub1) this).aLong11064 = (IDirect3DDevice.CreateRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, i, i_18_, method10094(Class171.aClass171_2071, Class88.aClass88_1218), 0, 0, false));
		for (int i_19_ = 0; i_19_ < 3; i_19_++)
			((Class106_Sub3_Sub1) this).aLongArray11028[i_19_] = (IDirect3DDevice.CreateOffscreenPlainSurface(((Class106_Sub3_Sub1) this).aLong11066, i, i_18_, method10094(Class171.aClass171_2071, Class88.aClass88_1218), 2));
		method9661(i * i_18_ * 4);
	}

	public boolean method1699() {
		if (((Class106_Sub3_Sub1) this).aBool11051)
			return false;
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11033]) != 0L)
			return false;
		return true;
	}

	public boolean method1746() {
		return true;
	}

	final void method9828(Interface46 interface46, Class379 class379, int i, int i_20_, int i_21_, int i_22_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitiveIB((((Class106_Sub3_Sub1) this).aLong11066), ((Class215) (Class215) interface46).aLong2501, 4, 0, i, i_20_, i_21_, i_22_);
	}

	final void method10084(long l) {
		((Class106_Sub3_Sub1) this).aLong11052 = l;
		IDirect3DDevice.SetVertexShader(((Class106_Sub3_Sub1) this).aLong11066, l);
	}

	public int method1938() {
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068]) == 0L)
			return -1;
		return (Class32.method767(IDirect3DEventQuery.IsSignaled(((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068])) ? (((Class106_Sub3_Sub1) this).anIntArray11067[((Class106_Sub3_Sub1) this).anInt11068]) : -1);
	}

	public void method1703() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	public void method2020() {
		long l = IDirect3DDevice.CreateEventQuery(((Class106_Sub3_Sub1) this).aLong11066);
		if (Class32.method767(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	public void method9673(Class362 class362) {
		Class362_Sub2 class362_sub2 = (Class362_Sub2) class362;
		IDirect3DDevice.SetVertexDeclaration((((Class106_Sub3_Sub1) this).aLong11066), (((Class362_Sub2) class362_sub2).aLong9742));
	}

	long method10085(int i, int i_23_, int[] is, int[] is_24_) {
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068]) != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068]);
			((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068] = 0L;
		}
		aByteBuffer10378.clear();
		IDirect3DSurface.Download((((Class106_Sub3_Sub1) this).aLongArray11028[((Class106_Sub3_Sub1) this).anInt11068]), 0, 0, i, i_23_, i * 4, 0, aLong10444);
		if (++((Class106_Sub3_Sub1) this).anInt11068 >= 3)
			((Class106_Sub3_Sub1) this).anInt11068 = 0;
		if (is != null) {
			aByteBuffer10378.asIntBuffer().get(is);
			return 0L;
		}
		return aLong10444;
	}

	public Class406 method9619(String string) {
		byte[] is = method10093(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub2(this, class381);
	}

	public void method2018() {
		if (((Class106_Sub3_Sub1) this).aLong11064 != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLong11064);
			((Class106_Sub3_Sub1) this).aLong11064 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
			if (((Class106_Sub3_Sub1) this).aLongArray11028[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11028[i]);
				((Class106_Sub3_Sub1) this).aLongArray11028[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	public Class103 method1729(Class103 class103, Class103 class103_25_, float f, Class103 class103_26_) {
		return f < 0.5F ? class103 : class103_25_;
	}

	public void method1719(int i, int i_27_) {
		IDirect3DDevice.Clear(((Class106_Sub3_Sub1) this).aLong11066, i, i_27_, 1.0F, 0);
	}

	void method9603() {
		if (aClass104_1410 != null)
			IDirect3DDevice.SetViewport(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10434, anInt10424 + anInt10435, anInt10531, anInt10437, aFloat10364, aFloat10421);
	}

	void method9664() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 15, aBool10483);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 24, aByte10510 & 0xff);
		if ((((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.MultiSampleType) > 0) {
			if (!aBool10483 || aByte10510 == 0) {
				if (((Class106_Sub3_Sub1) this).aBool11043 || ((Class106_Sub3_Sub1) this).aBool11027)
					IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, 0);
				else if (((Class106_Sub3_Sub1) this).aBool11054)
					IDirect3DDevice.method10062((((Class106_Sub3_Sub1) this).aLong11066), 154, 1.0F);
			} else if (((Class106_Sub3_Sub1) this).aBool11043)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, method9764('S', 'S', 'A', 'A'));
			else if (((Class106_Sub3_Sub1) this).aBool11027)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, method9764('A', 'T', 'O', 'C'));
			else if (((Class106_Sub3_Sub1) this).aBool11054)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 154, method9764('A', '2', 'M', '1'));
		}
	}

	void method9694() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 174, aBool10541);
	}

	public String method1964() {
		String string = "Caps: 4:";
		String string_28_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_28_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_28_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_28_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(method9575() ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(method9637() ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11055 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11069 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11034 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11050 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11027 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11054 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11043 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11056 ? 1 : 0).append(string_28_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11057 ? 1 : 0).toString();
		return string;
	}

	final void method10086(long l) {
		IDirect3DDevice.SetPixelShader(((Class106_Sub3_Sub1) this).aLong11066, l);
	}

	public void method9703(Class250 class250, Class250 class250_29_, Class250 class250_30_) {
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 256, class250.aFloatArray2728);
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 2, class250_29_.aFloatArray2728);
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 3, class250_30_.aFloatArray2728);
	}

	static final int method10087(Class88 class88) {
		if (class88 == Class88.aClass88_1217)
			return 80;
		if (class88 == Class88.aClass88_1216)
			return 77;
		throw new IllegalArgumentException("");
	}

	public void method1857(int i, int i_31_, int[] is, int[] is_32_) {
		method10085(i, i_31_, is, is_32_);
	}

	public boolean method9637() {
		return ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.PixelShaderVersion & 0xffff) >= 257);
	}

	void method9675() {
		IDirect3DDevice.SetScissorRect(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10428, anInt10424 + anInt10426, anInt10429, anInt10427);
	}

	void method9626() {
		if (aBool10488) {
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11035, -aFloatArray10446[0], -aFloatArray10446[1], -aFloatArray10446[2]);
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11063, -aFloatArray10440[0], -aFloatArray10440[1], -aFloatArray10440[2]);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	void method1802() {
		super.method1667();
		if (((Class106_Sub3_Sub1) this).aLong11035 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11035);
			((Class106_Sub3_Sub1) this).aLong11035 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11063 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11063);
			((Class106_Sub3_Sub1) this).aLong11063 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11037 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11037);
			((Class106_Sub3_Sub1) this).aLong11037 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11066 != 0L) {
			IDirect3DDevice.Destroy(((Class106_Sub3_Sub1) this).aLong11066);
			((Class106_Sub3_Sub1) this).aLong11066 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11029 != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLong11029);
			((Class106_Sub3_Sub1) this).aLong11029 = 0L;
		}
	}

	void method9629() {
		int i;
		for (i = 0; i < anInt10459; i++) {
			Class572_Sub36 class572_sub36 = aClass572_Sub36Array10457[i];
			int i_33_ = i + 2;
			int i_34_ = class572_sub36.method8723(-1288611141);
			float f = class572_sub36.method8724((byte) 88) / 255.0F;
			D3DLIGHT.SetPosition(((Class106_Sub3_Sub1) this).aLong11037, (float) class572_sub36.method8720(-1158818316), (float) class572_sub36.method8721((byte) 10), (float) class572_sub36.method8722(838790367));
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11037, (float) (i_34_ >> 16 & 0xff) * f, (float) (i_34_ >> 8 & 0xff) * f, (float) (i_34_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class106_Sub3_Sub1) this).aLong11037, 0.0F, 0.0F, 1.0F / (float) (class572_sub36.method8752((byte) 115) * class572_sub36.method8752((byte) 14)));
			D3DLIGHT.SetRange(((Class106_Sub3_Sub1) this).aLong11037, (float) class572_sub36.method8752((byte) 8));
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, i_33_, ((Class106_Sub3_Sub1) this).aLong11037);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, i_33_, true);
		}
		for (/**/; i < anInt10388; i++)
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, i + 2, false);
	}

	final void method9589(int i, Class293 class293, boolean bool) {
		if (aBool10488) {
			int i_35_ = 0;
			int i_36_;
			switch (i) {
				default:
					i_36_ = 5;
					break;
				case 2:
					i_36_ = 27;
					break;
				case 1:
					i_36_ = 6;
			}
			if (bool)
				i_35_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, i_36_, (method10105(class293) | i_35_));
		}
	}

	public void method1855(long l) {
		/* empty */
	}

	void method9669() {
		if (aBool10488)
			IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 28, (aBool10499 && aBool10498 && anInt10448 >= 0));
	}

	void method9770() {
		if (aBool10488) {
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11035, -aFloatArray10446[0], -aFloatArray10446[1], -aFloatArray10446[2]);
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11063, -aFloatArray10440[0], -aFloatArray10440[1], -aFloatArray10440[2]);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	Interface43 method9760(Class171 class171, int i, int i_37_, boolean bool, byte[] is, int i_38_, int i_39_) {
		return new Class219_Sub2(this, class171, i, i_37_, bool, is, i_38_, i_39_);
	}

	Interface43 method9635(Class171 class171, int i, int i_40_, boolean bool, float[] fs, int i_41_, int i_42_) {
		return new Class219_Sub2(this, class171, i, i_40_, bool, fs, i_41_, i_42_);
	}

	public final void method9660(Class379 class379, int i, int i_43_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawPrimitive(((Class106_Sub3_Sub1) this).aLong11066, method10095(class379), i, i_43_);
	}

	Interface33 method9759(int i, boolean bool, int[][] is) {
		return new Class219_Sub1(this, i, bool, is);
	}

	Interface40 method9638(Class171 class171, int i, int i_44_, int i_45_, boolean bool, byte[] is) {
		return new Class219_Sub3(this, class171, i, i_44_, i_45_, bool, is);
	}

	final void method10088(Class219 class219) {
		IDirect3DDevice.SetTexture(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, class219.method3094());
		if (aBool10488 && !((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367]) {
			((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] = true;
			method9657();
			method9691();
		}
	}

	final void method10089(Class219_Sub2 class219_sub2) {
		method10088(class219_sub2);
		if (((Class106_Sub3_Sub1) this).aBoolArray11039[anInt10367] != ((Class219_Sub2) class219_sub2).aBool9754) {
			IDirect3DDevice.SetSamplerState(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 1, ((Class219_Sub2) class219_sub2).aBool9754 ? 1 : 3);
			((Class106_Sub3_Sub1) this).aBoolArray11039[anInt10367] = ((Class219_Sub2) class219_sub2).aBool9754;
		}
		if (((Class106_Sub3_Sub1) this).aBoolArray11040[anInt10367] != ((Class219_Sub2) class219_sub2).aBool9755) {
			IDirect3DDevice.SetSamplerState(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 2, ((Class219_Sub2) class219_sub2).aBool9755 ? 1 : 3);
			((Class106_Sub3_Sub1) this).aBoolArray11040[anInt10367] = ((Class219_Sub2) class219_sub2).aBool9755;
		}
	}

	final void method10090(Class219_Sub3 class219_sub3) {
		method10088(class219_sub3);
		if (!((Class106_Sub3_Sub1) this).aBoolArray11039[anInt10367]) {
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 1, 1);
			((Class106_Sub3_Sub1) this).aBoolArray11039[anInt10367] = true;
		}
		if (!((Class106_Sub3_Sub1) this).aBoolArray11040[anInt10367]) {
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 2, 1);
			((Class106_Sub3_Sub1) this).aBoolArray11040[anInt10367] = true;
		}
	}

	public void method9642() {
		if (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367]) {
			((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] = false;
			IDirect3DDevice.SetTexture(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 0L);
			method9657();
			method9691();
		}
	}

	void method9701() {
		if (((Class106_Sub3_Sub1) this).aLong11052 == 0L && aClass295Array10436[anInt10367] != Class295.aClass295_3462) {
			if (aClass295Array10436[anInt10367] == Class295.aClass295_3460)
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3465(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			else
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			int i = method10091(aClass295Array10436[anInt10367]);
			if (i != ((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367]) {
				IDirect3DDevice.SetTextureStageState(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 24, i);
				((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 24, 0);
			((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = 0;
		}
	}

	void method9691() {
		if (aBool10488) {
			int i = (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] ? method10092(aClass373Array10403[anInt10367]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 1, i);
		}
	}

	void method9657() {
		if (aBool10488) {
			int i = (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] ? method10092(aClass373Array10469[anInt10367]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 4, i);
		}
	}

	final void method9646(int i, Class293 class293, boolean bool, boolean bool_46_) {
		if (aBool10488) {
			int i_47_ = 0;
			int i_48_;
			switch (i) {
				default:
					i_48_ = 2;
					break;
				case 2:
					i_48_ = 26;
					break;
				case 1:
					i_48_ = 3;
			}
			if (bool)
				i_47_ |= 0x20;
			if (bool_46_)
				i_47_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, i_48_, (method10105(class293) | i_47_));
		}
	}

	final void method9648(int i, Class293 class293, boolean bool) {
		if (aBool10488) {
			int i_49_ = 0;
			int i_50_;
			switch (i) {
				default:
					i_50_ = 5;
					break;
				case 2:
					i_50_ = 27;
					break;
				case 1:
					i_50_ = 6;
			}
			if (bool)
				i_49_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, i_50_, (method10105(class293) | i_49_));
		}
	}

	public float method9747() {
		return -0.5F;
	}

	public Interface6 method2021(int i, int i_51_, Class171 class171, Class88 class88, int i_52_) {
		return new Class329(this, class171, class88, i, i_51_, i_52_);
	}

	static final int method10091(Class295 class295) {
		switch (class295.anInt3457) {
			case 3:
				return 2;
			case 1:
				return 256;
			case 0:
				return 1;
			case 2:
				return 4;
			case 5:
				return 3;
			default:
				return 0;
		}
	}

	void method9680(int i) {
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 168, i);
	}

	void method9665() {
		switch (aClass376_10418.anInt4565) {
			case 2:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 9);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 5);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 6);
				break;
			case 0:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 1);
				break;
		}
		switch (anInt10506) {
			case 1:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 0:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
		}
	}

	void method9666() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 27, aBool10508);
	}

	static final int method10092(Class373 class373) {
		switch (class373.anInt4546) {
			case 3:
				return 10;
			default:
				throw new IllegalArgumentException();
			case 1:
				return 2;
			case 2:
				return 4;
			case 0:
				return 26;
			case 4:
				return 7;
		}
	}

	void method9670(boolean bool) {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 161, bool);
	}

	final Interface46 method9671(boolean bool) {
		return new Class215(this, Class88.aClass88_1217, bool);
	}

	final Interface44 method9723(boolean bool) {
		return new Class205(this, bool);
	}

	Class106_Sub3_Sub1(int i, int i_53_, long l, long l_54_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, MapSize mapSize, Interface5 interface5, Interface35 interface35, Interface36 interface36, Interface37 interface37, Class248 class248, int i_55_) {
		super(mapSize, interface5, interface35, interface36, interface37, class248, i_55_, 0);
		((Class106_Sub3_Sub1) this).aBool11051 = false;
		((Class106_Sub3_Sub1) this).aLong11035 = 0L;
		((Class106_Sub3_Sub1) this).aLong11063 = 0L;
		((Class106_Sub3_Sub1) this).aLong11037 = 0L;
		((Class106_Sub3_Sub1) this).aBool11038 = false;
		((Class106_Sub3_Sub1) this).aFloatArray11059 = new float[16];
		((Class106_Sub3_Sub1) this).anInt11060 = 128;
		((Class106_Sub3_Sub1) this).anInt11061 = 0;
		((Class106_Sub3_Sub1) this).aLongArray11062 = new long[((Class106_Sub3_Sub1) this).anInt11060];
		((Class106_Sub3_Sub1) this).aLong11064 = 0L;
		((Class106_Sub3_Sub1) this).aLongArray11065 = new long[3];
		((Class106_Sub3_Sub1) this).aLongArray11028 = new long[3];
		((Class106_Sub3_Sub1) this).anIntArray11067 = new int[3];
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		try {
			((Class106_Sub3_Sub1) this).anInt11044 = i;
			((Class106_Sub3_Sub1) this).anInt11032 = i_53_;
			((Class106_Sub3_Sub1) this).aLong11029 = l;
			((Class106_Sub3_Sub1) this).aLong11066 = l_54_;
			((Class106_Sub3_Sub1) this).aD3DDISPLAYMODE11030 = d3ddisplaymode;
			((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031 = d3dpresent_parameters;
			((Class106_Sub3_Sub1) this).aD3DCAPS11048 = d3dcaps;
			((Class106_Sub3_Sub1) this).aLong11035 = D3DLIGHT.Create();
			((Class106_Sub3_Sub1) this).aLong11063 = D3DLIGHT.Create();
			((Class106_Sub3_Sub1) this).aLong11037 = D3DLIGHT.Create();
			anInt10454 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.MaxSimultaneousTextures);
			anInt10415 = ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.MaxActiveLights > 0) ? ((Class106_Sub3_Sub1) this).aD3DCAPS11048.MaxActiveLights : 8);
			((Class106_Sub3_Sub1) this).aBool11055 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.TextureCaps & 0x2) == 0;
			aBool10467 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.TextureCaps & 0x800) != 0;
			aBool10524 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.TextureCaps & 0x2000) != 0;
			((Class106_Sub3_Sub1) this).aBool11069 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.TextureCaps & 0x8000) != 0;
			((Class106_Sub3_Sub1) this).aBool11034 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.TextureCaps & 0x10000) != 0;
			((Class106_Sub3_Sub1) this).aBool11050 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.TextureCaps & 0x4000) != 0;
			aBool10519 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.NumSimultaneousRTs > 0);
			aBool10525 = aBool10519;
			aBool10520 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.NumSimultaneousRTs > 0);
			aBool10522 = anInt10511 > 0 || (IDirect3D.CheckDeviceMultiSampleType(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, (((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.BackBufferFormat), true, 2)) == 0;
			aBool10521 = ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.NumSimultaneousRTs) > 0 && anInt10511 > 0 || (IDirect3D.CheckDeviceMultiSampleType(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, 113, true, 2)) == 0);
			((Class106_Sub3_Sub1) this).aBool11027 = (IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, (((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.BackBufferFormat), 0, 1, method9764('A', 'T', 'O', 'C'))) == 0;
			((Class106_Sub3_Sub1) this).aBool11054 = (IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, (((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.BackBufferFormat), 0, 1, method9764('A', '2', 'M', '1'))) == 0;
			((Class106_Sub3_Sub1) this).aBool11043 = (IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, (((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.BackBufferFormat), 0, 1, method9764('S', 'S', 'A', 'A'))) == 0;
			aBool10526 = (((Class106_Sub3_Sub1) this).aD3DCAPS11048.PrimitiveMiscCaps & 0x20000) != 0;
			((Class106_Sub3_Sub1) this).aBool11056 = (IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, ((Class106_Sub3_Sub1) this).aD3DDISPLAYMODE11030.Format, 524288, 3, 113)) == 0;
			((Class106_Sub3_Sub1) this).aBool11057 = (IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, ((Class106_Sub3_Sub1) this).aD3DDISPLAYMODE11030.Format, 524288, 3, 116)) == 0;
			((Class106_Sub3_Sub1) this).aBoolArray11039 = new boolean[anInt10454];
			((Class106_Sub3_Sub1) this).aBoolArray11040 = new boolean[anInt10454];
			((Class106_Sub3_Sub1) this).aBoolArray11041 = new boolean[anInt10454];
			((Class106_Sub3_Sub1) this).aClass367Array11058 = new Class367[anInt10454];
			((Class106_Sub3_Sub1) this).aBoolArray11042 = new boolean[anInt10454];
			((Class106_Sub3_Sub1) this).anIntArray11049 = new int[anInt10454];
			Class261 class261 = new Class261();
			class261.method3577(1.0F, -1.0F, 0.5F);
			class261.method3580(0.0F, 0.0F, 0.5F);
			((Class106_Sub3_Sub1) this).aClass250_11045 = new Class250();
			((Class106_Sub3_Sub1) this).aClass250_11045.method3446(class261);
			IDirect3DDevice.BeginScene(((Class106_Sub3_Sub1) this).aLong11066);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method1666(-2048275466);
			throw new RuntimeException("");
		}
	}

	public String method1830() {
		String string = "Caps: 4:";
		String string_56_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_56_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_56_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_56_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(method9575() ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(method9637() ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11055 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11069 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11034 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11050 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11027 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11054 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11043 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11056 ? 1 : 0).append(string_56_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11057 ? 1 : 0).toString();
		return string;
	}

	void method9686(int i) {
		if (!((Class106_Sub3_Sub1) this).aBool11036) {
			int i_57_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 8, i_57_);
		}
	}

	public boolean method9793() {
		return ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.VertexShaderVersion & 0xffff) >= 257);
	}

	Class362 method9820(Class354[] class354s) {
		return new Class362_Sub2(this, class354s);
	}

	final void method9682(Interface46 interface46, Class379 class379, int i, int i_58_, int i_59_, int i_60_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitiveIB((((Class106_Sub3_Sub1) this).aLong11066), ((Class215) (Class215) interface46).aLong2501, 4, 0, i, i_58_, i_59_, i_60_);
	}

	public final void method9652(Class379 class379, int i, int i_61_, int i_62_, int i_63_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitive((((Class106_Sub3_Sub1) this).aLong11066), method10095(class379), 0, i, i_61_, i_62_, i_63_);
	}

	byte[] method10093(String string) {
		return method9775("dx", string);
	}

	public long method1853(int i, int i_64_) {
		return method10085(i, i_64_, null, null);
	}

	public final synchronized void method1668(int i) {
		for (int i_65_ = 0; i_65_ < ((Class106_Sub3_Sub1) this).anInt11061; i_65_++)
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11062[i_65_]);
		((Class106_Sub3_Sub1) this).anInt11061 = 0;
		super.method1668(i);
	}

	static final int method10094(Class171 class171, Class88 class88) {
		switch (class88.anInt1222 * 1800169017) {
			case 2:
				switch (class171.anInt2065 * -660609339) {
					default:
						break;
					case 3:
						return Class29.anInt363 * 1437748683;
					case 7:
						return Class29.anInt364 * -39046323;
					case 4:
						return 77;
					case 2:
						return 28;
					case 6:
						return 51;
					case 0:
						return 21;
					case 1:
						return 22;
					case 8:
						return 50;
				}
				break;
			case 8:
				if (class171 == Class171.aClass171_2071)
					return 116;
				break;
			case 5:
				if (class171 == Class171.aClass171_2071)
					return 113;
				break;
		}
		throw new IllegalArgumentException("");
	}

	public boolean method9575() {
		return ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.VertexShaderVersion & 0xffff) >= 257);
	}

	static final int method10095(Class379 class379) {
		switch (class379.anInt4591) {
			case 2:
				return 1;
			case 3:
				return 4;
			case 1:
				return 3;
			case 0:
				return 5;
			case 4:
				return 2;
			case 5:
				return 6;
			default:
				throw new IllegalArgumentException("");
		}
	}

	public void method2037(boolean bool) {
		/* empty */
	}

	static boolean method10096(int i, int i_66_, long l, int i_67_, D3DDISPLAYMODE d3ddisplaymode, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		int i_68_ = 0;
		int i_69_ = 0;
		int i_70_ = 0;
		boolean bool;
		try {
			if (Class32.method766(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode)))
				return false;
			while_57_: for (/**/; i_67_ >= 0; i_67_--) {
				if (i_67_ != 1) {
					i_70_ = 0 + i_67_;
					for (int i_71_ = 0; i_71_ < anIntArray11071.length; i_71_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_66_, d3ddisplaymode.Format, anIntArray11071[i_71_], true) == 0 && IDirect3D.CheckDeviceFormat(l, i, i_66_, (d3ddisplaymode.Format), 1, 1, (anIntArray11071[i_71_])) == 0 && (i_67_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_66_, anIntArray11071[i_71_], true, i_70_)) == 0)) {
							for (int i_72_ = 0; i_72_ < anIntArray11053.length; i_72_++) {
								if ((IDirect3D.CheckDeviceFormat(l, i, i_66_, d3ddisplaymode.Format, 2, 1, anIntArray11053[i_72_])) == 0 && (IDirect3D.CheckDepthStencilMatch(l, i, i_66_, d3ddisplaymode.Format, anIntArray11071[i_71_], anIntArray11053[i_72_])) == 0 && (i_67_ == 0 || (IDirect3D.CheckDeviceMultiSampleType(l, i, i_66_, anIntArray11053[i_71_], true, i_70_)) == 0)) {
									i_69_ = anIntArray11071[i_71_];
									i_68_ = anIntArray11053[i_72_];
									break while_57_;
								}
							}
						}
					}
				}
			}
			if (i_67_ < 0 || i_69_ == 0 || i_68_ == 0)
				return false;
			d3dpresent_parameters.BackBufferFormat = i_69_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_68_;
			d3dpresent_parameters.MultiSampleType = i_70_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	synchronized void method10097(long l) {
		if (((Class106_Sub3_Sub1) this).anInt11061 == ((Class106_Sub3_Sub1) this).anInt11060) {
			((Class106_Sub3_Sub1) this).anInt11060 *= 2;
			long[] ls = new long[((Class106_Sub3_Sub1) this).anInt11060];
			System.arraycopy(((Class106_Sub3_Sub1) this).aLongArray11062, 0, ls, 0, ((Class106_Sub3_Sub1) this).anInt11061);
			((Class106_Sub3_Sub1) this).aLongArray11062 = ls;
		}
		((Class106_Sub3_Sub1) this).aLongArray11062[((Class106_Sub3_Sub1) this).anInt11061] = l;
		((Class106_Sub3_Sub1) this).anInt11061++;
	}

	public boolean method1823() {
		if (((Class106_Sub3_Sub1) this).aBool11051)
			return false;
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11033]) != 0L)
			return false;
		return true;
	}

	public String method1681() {
		String string = "Caps: 4:";
		String string_73_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_73_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_73_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_73_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(method9575() ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(method9637() ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11055 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11069 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11034 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11050 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11027 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11054 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11043 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11056 ? 1 : 0).append(string_73_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11057 ? 1 : 0).toString();
		return string;
	}

	final void method9797(int i, Class293 class293, boolean bool, boolean bool_74_) {
		if (aBool10488) {
			int i_75_ = 0;
			int i_76_;
			switch (i) {
				default:
					i_76_ = 2;
					break;
				case 2:
					i_76_ = 26;
					break;
				case 1:
					i_76_ = 3;
			}
			if (bool)
				i_75_ |= 0x20;
			if (bool_74_)
				i_75_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, i_76_, (method10105(class293) | i_75_));
		}
	}

	void method1733(int i, int i_77_) throws Exception_Sub1 {
		if (((Class106_Sub3_Sub1) this).aBool11051) {
			if (!method10100(aClass104_Sub2_1419.method1648(), aClass104_Sub2_1419.method1646()))
				return;
			((Class104_Sub2_Sub1_Sub1) aClass104_Sub2_1419).method122();
		} else
			IDirect3DDevice.EndScene(((Class106_Sub3_Sub1) this).aLong11066);
		int i_78_ = aClass104_Sub2_1419.method9924();
		if (Class32.method766(i_78_)) {
			((Class106_Sub3_Sub1) this).aBool11051 = true;
			aClass104_Sub2_1419.method39();
		} else {
			IDirect3DDevice.BeginScene(((Class106_Sub3_Sub1) this).aLong11066);
			if (anInterface5_1408 != null)
				anInterface5_1408.method22((byte) 30);
		}
	}

	Interface45 method9639(Class171 class171, Class88 class88, int i, int i_79_) {
		return new Class219_Sub2_Sub1(this, class171, class88, i, i_79_);
	}

	void method9766() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 14, aBool10536 && aBool10441);
	}

	public final synchronized void method1805(int i) {
		for (int i_80_ = 0; i_80_ < ((Class106_Sub3_Sub1) this).anInt11061; i_80_++)
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11062[i_80_]);
		((Class106_Sub3_Sub1) this).anInt11061 = 0;
		super.method1668(i);
	}

	public final synchronized void method1806(int i) {
		for (int i_81_ = 0; i_81_ < ((Class106_Sub3_Sub1) this).anInt11061; i_81_++)
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11062[i_81_]);
		((Class106_Sub3_Sub1) this).anInt11061 = 0;
		super.method1668(i);
	}

	void method9756() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 7, aBool10442);
	}

	public Interface11 method2001(int i, int i_82_) {
		return new Class211(this, Class88.aClass88_1216, i, i_82_, 0);
	}

	void method9743() {
		for (LinkableObject class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7932((byte) 50); class572_sub9 != null; class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7926(1116251861)) {
			Interface22 interface22 = (Interface22) class572_sub9.anObject9081;
			interface22.method122();
			if (interface22 == aClass104_1410)
				interface22.method126();
		}
		super.method9687();
	}

	public Class406 method9729(String string) {
		byte[] is = method10093(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub2(this, class381);
	}

	public void method1832(boolean bool) {
		/* empty */
	}

	Class104_Sub2 method1833(Canvas canvas, int i, int i_83_) {
		return new Class104_Sub2_Sub1_Sub1(this, canvas, i, i_83_, false);
	}

	void method10098(int i, int i_84_) {
		method2018();
		method1708(i, i_84_, 2082779655);
		((Class106_Sub3_Sub1) this).aLong11064 = (IDirect3DDevice.CreateRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, i, i_84_, method10094(Class171.aClass171_2071, Class88.aClass88_1218), 0, 0, false));
		for (int i_85_ = 0; i_85_ < 3; i_85_++)
			((Class106_Sub3_Sub1) this).aLongArray11028[i_85_] = (IDirect3DDevice.CreateOffscreenPlainSurface(((Class106_Sub3_Sub1) this).aLong11066, i, i_84_, method10094(Class171.aClass171_2071, Class88.aClass88_1218), 2));
		method9661(i * i_84_ * 4);
	}

	public int[] method1780(int i, int i_86_, int i_87_, int i_88_) {
		method1747();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, 0);
		long l_89_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) this).aLong11066), i_87_, i_88_, 21, 0, 0, true);
		int i_90_ = IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) this).aLong11066), l, i, i_86_, i_87_, i_88_, l_89_, 0, 0, i_87_, i_88_, 1);
		method9661(i_87_ * i_88_ * 4);
		if (Class32.method767(i_90_)) {
			is = new int[i_87_ * i_88_];
			IDirect3DSurface.Download(l_89_, 0, 0, i_87_, i_88_, i_87_ * 4, 16, aLong10444);
			aByteBuffer10378.clear();
			aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_89_);
		return is;
	}

	public int[] method1836(int i, int i_91_, int i_92_, int i_93_) {
		method1747();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, 0);
		long l_94_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) this).aLong11066), i_92_, i_93_, 21, 0, 0, true);
		int i_95_ = IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) this).aLong11066), l, i, i_91_, i_92_, i_93_, l_94_, 0, 0, i_92_, i_93_, 1);
		method9661(i_92_ * i_93_ * 4);
		if (Class32.method767(i_95_)) {
			is = new int[i_92_ * i_93_];
			IDirect3DSurface.Download(l_94_, 0, 0, i_92_, i_93_, i_92_ * 4, 16, aLong10444);
			aByteBuffer10378.clear();
			aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_94_);
		return is;
	}

	public void method1837() {
		/* empty */
	}

	public boolean method1839() {
		return true;
	}

	public Class104_Sub1 method1693() {
		return new Class104_Sub1_Sub3_Sub2(this);
	}

	public boolean method2047() {
		if (((Class106_Sub3_Sub1) this).aBool11051)
			return false;
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11033]) != 0L)
			return false;
		return true;
	}

	void method9620() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 14, aBool10536 && aBool10441);
	}

	void method10099(int i, int i_96_) {
		method2018();
		method1708(i, i_96_, 1658731692);
		((Class106_Sub3_Sub1) this).aLong11064 = (IDirect3DDevice.CreateRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, i, i_96_, method10094(Class171.aClass171_2071, Class88.aClass88_1218), 0, 0, false));
		for (int i_97_ = 0; i_97_ < 3; i_97_++)
			((Class106_Sub3_Sub1) this).aLongArray11028[i_97_] = (IDirect3DDevice.CreateOffscreenPlainSurface(((Class106_Sub3_Sub1) this).aLong11066, i, i_96_, method10094(Class171.aClass171_2071, Class88.aClass88_1218), 2));
		method9661(i * i_96_ * 4);
	}

	void method9668() {
		aFloat10504 = aFloat10425 - (float) anInt10398;
		aFloat10503 = aFloat10504 - (float) anInt10448;
		if (aFloat10503 < aFloat10464)
			aFloat10503 = aFloat10464;
		if (aBool10488) {
			IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 36, aFloat10503);
			IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 37, aFloat10504);
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 34, anInt10500);
		}
	}

	public boolean method2022() {
		return false;
	}

	public boolean method1846() {
		return false;
	}

	void method9693(Interface46 interface46) {
		IDirect3DDevice.SetIndices(((Class106_Sub3_Sub1) this).aLong11066, (((Class215) (Class215) interface46).aLong2501));
	}

	public void method1704(int i, int i_98_, int i_99_) {
		if (((Class106_Sub3_Sub1) this).aLong11064 == 0L)
			method10083(i_98_, i_99_);
		long l = IDirect3DDevice.GetRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, 0);
		if (!Class32.method766(IDirect3DDevice.StretchRect(((Class106_Sub3_Sub1) this).aLong11066, l, 0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), ((Class106_Sub3_Sub1) this).aLong11064, anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(((Class106_Sub3_Sub1) this).aLong11066, ((Class106_Sub3_Sub1) this).aLong11064, (((Class106_Sub3_Sub1) this).aLongArray11028[((Class106_Sub3_Sub1) this).anInt11033]));
		long l_100_ = IDirect3DDevice.CreateEventQuery(((Class106_Sub3_Sub1) this).aLong11066);
		if (Class32.method767(IDirect3DEventQuery.Issue(l_100_)))
			((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11033] = l_100_;
		((Class106_Sub3_Sub1) this).anIntArray11067[((Class106_Sub3_Sub1) this).anInt11033] = i;
		if (++((Class106_Sub3_Sub1) this).anInt11033 >= 3)
			((Class106_Sub3_Sub1) this).anInt11033 = 0;
	}

	public void method1827(int i, int i_101_, int i_102_) {
		if (((Class106_Sub3_Sub1) this).aLong11064 == 0L)
			method10083(i_101_, i_102_);
		long l = IDirect3DDevice.GetRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, 0);
		if (!Class32.method766(IDirect3DDevice.StretchRect(((Class106_Sub3_Sub1) this).aLong11066, l, 0, 0, aClass104_1410.method1648(), aClass104_1410.method1646(), ((Class106_Sub3_Sub1) this).aLong11064, anInt1402 * 886687387, anInt1417 * -1832602033, anInt1411 * 826888055, anInt1387 * 46469553, 2))) {
			/* empty */
		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(((Class106_Sub3_Sub1) this).aLong11066, ((Class106_Sub3_Sub1) this).aLong11064, (((Class106_Sub3_Sub1) this).aLongArray11028[((Class106_Sub3_Sub1) this).anInt11033]));
		long l_103_ = IDirect3DDevice.CreateEventQuery(((Class106_Sub3_Sub1) this).aLong11066);
		if (Class32.method767(IDirect3DEventQuery.Issue(l_103_)))
			((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11033] = l_103_;
		((Class106_Sub3_Sub1) this).anIntArray11067[((Class106_Sub3_Sub1) this).anInt11033] = i;
		if (++((Class106_Sub3_Sub1) this).anInt11033 >= 3)
			((Class106_Sub3_Sub1) this).anInt11033 = 0;
	}

	public void method1850() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	public void method1880() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	public Interface11 method1694(int i, int i_104_) {
		return new Class211(this, Class88.aClass88_1216, i, i_104_, 0);
	}

	public void method1707(int i, int i_105_, int[] is, int[] is_106_) {
		method10085(i, i_105_, is, is_106_);
	}

	public long method1854(int i, int i_107_) {
		return method10085(i, i_107_, null, null);
	}

	Interface43 method9636(int i, int i_108_, boolean bool, int[] is, int i_109_, int i_110_) {
		return new Class219_Sub2(this, i, i_108_, bool, is, i_109_, i_110_);
	}

	public void method1856(long l) {
		/* empty */
	}

	final void method9802() {
		if (aBool10488)
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 60, anInt10471);
	}

	void method9811(int i) {
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 168, i);
	}

	public void method1859() {
		if (((Class106_Sub3_Sub1) this).aLong11064 != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLong11064);
			((Class106_Sub3_Sub1) this).aLong11064 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
			if (((Class106_Sub3_Sub1) this).aLongArray11028[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11028[i]);
				((Class106_Sub3_Sub1) this).aLongArray11028[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	public void method1860() {
		if (((Class106_Sub3_Sub1) this).aLong11064 != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLong11064);
			((Class106_Sub3_Sub1) this).aLong11064 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
			if (((Class106_Sub3_Sub1) this).aLongArray11028[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11028[i]);
				((Class106_Sub3_Sub1) this).aLongArray11028[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	public void method1874(int i, int i_111_) {
		IDirect3DDevice.Clear(((Class106_Sub3_Sub1) this).aLong11066, i, i_111_, 1.0F, 0);
	}

	public Class103 method1956(Class103 class103, Class103 class103_112_, float f, Class103 class103_113_) {
		return f < 0.5F ? class103 : class103_112_;
	}

	void method9656() {
		/* empty */
	}

	void method9817(boolean bool) {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 161, bool);
	}

	public Interface11 method1750(int i, int i_114_, int i_115_) {
		return new Class211(this, Class88.aClass88_1216, i, i_114_, i_115_);
	}

	public Class165 method2011() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, 0, d3dadapter_identifier);
		return new Class165(d3dadapter_identifier.VendorID, method9713() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method9713());
	}

	public Class103 method1900(Class103 class103, Class103 class103_116_, float f, Class103 class103_117_) {
		return f < 0.5F ? class103 : class103_116_;
	}

	void method2023() {
		super.finalize();
	}

	public Class104_Sub1 method2040() {
		return new Class104_Sub1_Sub3_Sub2(this);
	}

	boolean method9630(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 3, method10094(class171, class88))));
	}

	public boolean method9818() {
		return ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.VertexShaderVersion & 0xffff) >= 257);
	}

	public boolean method9724() {
		return ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.VertexShaderVersion & 0xffff) >= 257);
	}

	public boolean method9725() {
		return ((((Class106_Sub3_Sub1) this).aD3DCAPS11048.PixelShaderVersion & 0xffff) >= 257);
	}

	public boolean method9726(boolean bool) {
		if (bool)
			return ((Class106_Sub3_Sub1) this).aBool11056;
		return (((Class106_Sub3_Sub1) this).aBool11056 && ((Class106_Sub3_Sub1) this).aBool11057);
	}

	void method9610() {
		method9748();
		method9627();
	}

	public boolean method9728(boolean bool) {
		if (bool)
			return ((Class106_Sub3_Sub1) this).aBool11056;
		return (((Class106_Sub3_Sub1) this).aBool11056 && ((Class106_Sub3_Sub1) this).aBool11057);
	}

	public Class406 method9632(String string) {
		byte[] is = method10093(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub2(this, class381);
	}

	public int[] method1834(int i, int i_118_, int i_119_, int i_120_) {
		method1747();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(((Class106_Sub3_Sub1) this).aLong11066, 0);
		long l_121_ = IDirect3DDevice.CreateRenderTarget((((Class106_Sub3_Sub1) this).aLong11066), i_119_, i_120_, 21, 0, 0, true);
		int i_122_ = IDirect3DDevice.StretchRect((((Class106_Sub3_Sub1) this).aLong11066), l, i, i_118_, i_119_, i_120_, l_121_, 0, 0, i_119_, i_120_, 1);
		method9661(i_119_ * i_120_ * 4);
		if (Class32.method767(i_122_)) {
			is = new int[i_119_ * i_120_];
			IDirect3DSurface.Download(l_121_, 0, 0, i_119_, i_120_, i_119_ * 4, 16, aLong10444);
			aByteBuffer10378.clear();
			aByteBuffer10378.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_121_);
		return is;
	}

	public Class406 method9801(String string) {
		byte[] is = method10093(string);
		if (is == null)
			return null;
		Class381 class381 = method9714(is);
		return new Class406_Sub2(this, class381);
	}

	public void method9702(Class250 class250, Class250 class250_123_, Class250 class250_124_) {
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 256, class250.aFloatArray2728);
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 2, class250_123_.aFloatArray2728);
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 3, class250_124_.aFloatArray2728);
	}

	boolean method9781(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 3, method10094(class171, class88))));
	}

	final void method9655() {
		if (aBool10488)
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 60, anInt10471);
	}

	void method9742() {
		method2018();
		for (LinkableObject class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7932((byte) 50); class572_sub9 != null; class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7926(1742027359)) {
			Interface22 interface22 = (Interface22) class572_sub9.anObject9081;
			interface22.method39();
		}
		super.method9583();
	}

	void method9588() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 7, aBool10442);
	}

	void method9765() {
		for (LinkableObject class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7932((byte) 50); class572_sub9 != null; class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7926(1404063386)) {
			Interface22 interface22 = (Interface22) class572_sub9.anObject9081;
			interface22.method122();
			if (interface22 == aClass104_1410)
				interface22.method126();
		}
		super.method9687();
	}

	Interface43 method9785(Class171 class171, int i, int i_125_, boolean bool, float[] fs, int i_126_, int i_127_) {
		return new Class219_Sub2(this, class171, i, i_125_, bool, fs, i_126_, i_127_);
	}

	public void method1852() {
		for (int i = 0; i < 3; i++) {
			if (((Class106_Sub3_Sub1) this).aLongArray11065[i] != 0L) {
				IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11065[i]);
				((Class106_Sub3_Sub1) this).aLongArray11065[i] = 0L;
			}
		}
		((Class106_Sub3_Sub1) this).anInt11033 = 0;
		((Class106_Sub3_Sub1) this).anInt11068 = 0;
	}

	void method9700() {
		if (aClass104_1410 != null)
			IDirect3DDevice.SetViewport(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10434, anInt10424 + anInt10435, anInt10531, anInt10437, aFloat10364, aFloat10421);
	}

	void method9751() {
		if (aClass104_1410 != null)
			IDirect3DDevice.SetViewport(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10434, anInt10424 + anInt10435, anInt10531, anInt10437, aFloat10364, aFloat10421);
	}

	boolean method9631(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 4, method10094(class171, class88))));
	}

	void method9720() {
		IDirect3DDevice.SetScissorRect(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10428, anInt10424 + anInt10426, anInt10429, anInt10427);
	}

	void method9754() {
		IDirect3DDevice.SetScissorRect(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10428, anInt10424 + anInt10426, anInt10429, anInt10427);
	}

	void method9755() {
		IDirect3DDevice.SetScissorRect(((Class106_Sub3_Sub1) this).aLong11066, anInt10438 + anInt10428, anInt10424 + anInt10426, anInt10429, anInt10427);
	}

	public void method9824(int i, Interface44 interface44) {
		Class205 class205 = (Class205) interface44;
		IDirect3DDevice.SetStreamSource(((Class106_Sub3_Sub1) this).aLong11066, i, ((Class205) class205).aLong2417, 0, class205.method3017());
	}

	void method9704() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 174, aBool10541);
	}

	public void method9761(Class250 class250) {
		class250.method3445(((Class106_Sub3_Sub1) this).aClass250_11045);
	}

	public void method9762(Class250 class250) {
		class250.method3445(((Class106_Sub3_Sub1) this).aClass250_11045);
	}

	Class362 method9672(Class354[] class354s) {
		return new Class362_Sub2(this, class354s);
	}

	void method9804() {
		if (((Class106_Sub3_Sub1) this).aLong11052 == 0L && aClass295Array10436[anInt10367] != Class295.aClass295_3462) {
			if (aClass295Array10436[anInt10367] == Class295.aClass295_3460)
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3465(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			else
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			int i = method10091(aClass295Array10436[anInt10367]);
			if (i != ((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367]) {
				IDirect3DDevice.SetTextureStageState(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 24, i);
				((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 24, 0);
			((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = 0;
		}
	}

	void method9733() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 7, aBool10442);
	}

	boolean method10100(int i, int i_128_) {
		int i_129_ = IDirect3DDevice.TestCooperativeLevel(((Class106_Sub3_Sub1) this).aLong11066);
		if (i_129_ == 0 || i_129_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface((((Class106_Sub3_Sub1) this).aLong11066), 0L);
			for (int i_130_ = 1; i_130_ < 4; i_130_++)
				IDirect3DDevice.SetRenderTarget((((Class106_Sub3_Sub1) this).aLong11066), i_130_, 0L);
			for (int i_131_ = 0; i_131_ < 4; i_131_++)
				IDirect3DDevice.SetStreamSource((((Class106_Sub3_Sub1) this).aLong11066), i_131_, 0L, 0, 0);
			for (int i_132_ = 0; i_132_ < 4; i_132_++)
				IDirect3DDevice.SetTexture((((Class106_Sub3_Sub1) this).aLong11066), i_132_, 0L);
			IDirect3DDevice.SetIndices(((Class106_Sub3_Sub1) this).aLong11066, 0L);
			method9583();
			((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.BackBufferWidth = i;
			((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.BackBufferHeight = i_128_;
			((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.BackBufferCount = 1;
			if (method10096(((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, ((Class106_Sub3_Sub1) this).aLong11029, anInt10511, ((Class106_Sub3_Sub1) this).aD3DDISPLAYMODE11030, (((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031))) {
				int i_133_ = IDirect3DDevice.Reset((((Class106_Sub3_Sub1) this).aLong11066), (((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031));
				if (Class32.method767(i_133_)) {
					((Class106_Sub3_Sub1) this).aBool11051 = false;
					method9687();
					method9738();
					return true;
				}
			}
		}
		return false;
	}

	public int method1848() {
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068]) == 0L)
			return -1;
		return (Class32.method767(IDirect3DEventQuery.IsSignaled(((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068])) ? (((Class106_Sub3_Sub1) this).anIntArray11067[((Class106_Sub3_Sub1) this).anInt11068]) : -1);
	}

	void method9768() {
		if (aBool10488) {
			D3DLIGHT.SetAmbient(((Class106_Sub3_Sub1) this).aLong11035, aFloat10451 * aFloat10458, aFloat10439 * aFloat10458, aFloat10453 * aFloat10458, 0.0F);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	void method9744() {
		if (aBool10488) {
			D3DLIGHT.SetAmbient(((Class106_Sub3_Sub1) this).aLong11035, aFloat10451 * aFloat10458, aFloat10439 * aFloat10458, aFloat10453 * aFloat10458, 0.0F);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	void method9769() {
		if (aBool10488) {
			float f = aBool10452 ? aFloat10455 : 0.0F;
			float f_134_ = aBool10452 ? -aFloat10456 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11035, f * aFloat10451, f * aFloat10439, f * aFloat10453, 0.0F);
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11063, f_134_ * aFloat10451, f_134_ * aFloat10439, f_134_ * aFloat10453, 0.0F);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	void method9745() {
		if (aBool10488) {
			float f = aBool10452 ? aFloat10455 : 0.0F;
			float f_135_ = aBool10452 ? -aFloat10456 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11035, f * aFloat10451, f * aFloat10439, f * aFloat10453, 0.0F);
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11063, f_135_ * aFloat10451, f_135_ * aFloat10439, f_135_ * aFloat10453, 0.0F);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	Class362 method9821(Class354[] class354s) {
		return new Class362_Sub2(this, class354s);
	}

	void method9771() {
		if (aBool10488) {
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11035, -aFloatArray10446[0], -aFloatArray10446[1], -aFloatArray10446[2]);
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11063, -aFloatArray10440[0], -aFloatArray10440[1], -aFloatArray10440[2]);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	public int method1847() {
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068]) == 0L)
			return -1;
		return (Class32.method767(IDirect3DEventQuery.IsSignaled(((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11068])) ? (((Class106_Sub3_Sub1) this).anIntArray11067[((Class106_Sub3_Sub1) this).anInt11068]) : -1);
	}

	void method9773() {
		if (aBool10488 && !((Class106_Sub3_Sub1) this).aBool11038) {
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, false);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, false);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 0, ((Class106_Sub3_Sub1) this).aLong11035);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 1, ((Class106_Sub3_Sub1) this).aLong11063);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, true);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, true);
			((Class106_Sub3_Sub1) this).aBool11038 = true;
		}
	}

	void method9774() {
		if (aBool10488 && !((Class106_Sub3_Sub1) this).aBool11038) {
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, false);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, false);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 0, ((Class106_Sub3_Sub1) this).aLong11035);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 1, ((Class106_Sub3_Sub1) this).aLong11063);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, true);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, true);
			((Class106_Sub3_Sub1) this).aBool11038 = true;
		}
	}

	void method9717() {
		if (aBool10488 && !((Class106_Sub3_Sub1) this).aBool11038) {
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, false);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, false);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 0, ((Class106_Sub3_Sub1) this).aLong11035);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 1, ((Class106_Sub3_Sub1) this).aLong11063);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, true);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, true);
			((Class106_Sub3_Sub1) this).aBool11038 = true;
		}
	}

	void method9776() {
		int i;
		for (i = 0; i < anInt10459; i++) {
			Class572_Sub36 class572_sub36 = aClass572_Sub36Array10457[i];
			int i_136_ = i + 2;
			int i_137_ = class572_sub36.method8723(-1288611141);
			float f = class572_sub36.method8724((byte) 61) / 255.0F;
			D3DLIGHT.SetPosition(((Class106_Sub3_Sub1) this).aLong11037, (float) class572_sub36.method8720(1650585430), (float) class572_sub36.method8721((byte) 37), (float) class572_sub36.method8722(-617054431));
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11037, (float) (i_137_ >> 16 & 0xff) * f, (float) (i_137_ >> 8 & 0xff) * f, (float) (i_137_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class106_Sub3_Sub1) this).aLong11037, 0.0F, 0.0F, 1.0F / (float) (class572_sub36.method8752((byte) 91) * class572_sub36.method8752((byte) 60)));
			D3DLIGHT.SetRange(((Class106_Sub3_Sub1) this).aLong11037, (float) class572_sub36.method8752((byte) 97));
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, i_136_, ((Class106_Sub3_Sub1) this).aLong11037);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, i_136_, true);
		}
		for (/**/; i < anInt10388; i++)
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, i + 2, false);
	}

	void method9777() {
		int i;
		for (i = 0; i < anInt10459; i++) {
			Class572_Sub36 class572_sub36 = aClass572_Sub36Array10457[i];
			int i_138_ = i + 2;
			int i_139_ = class572_sub36.method8723(-1288611141);
			float f = class572_sub36.method8724((byte) 95) / 255.0F;
			D3DLIGHT.SetPosition(((Class106_Sub3_Sub1) this).aLong11037, (float) class572_sub36.method8720(-1145091166), (float) class572_sub36.method8721((byte) 25), (float) class572_sub36.method8722(1206445145));
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11037, (float) (i_139_ >> 16 & 0xff) * f, (float) (i_139_ >> 8 & 0xff) * f, (float) (i_139_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(((Class106_Sub3_Sub1) this).aLong11037, 0.0F, 0.0F, 1.0F / (float) (class572_sub36.method8752((byte) 22) * class572_sub36.method8752((byte) 109)));
			D3DLIGHT.SetRange(((Class106_Sub3_Sub1) this).aLong11037, (float) class572_sub36.method8752((byte) 110));
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, i_138_, ((Class106_Sub3_Sub1) this).aLong11037);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, i_138_, true);
		}
		for (/**/; i < anInt10388; i++)
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, i + 2, false);
	}

	boolean method9778(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 3, method10094(class171, class88))));
	}

	void method9698() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 174, aBool10541);
	}

	boolean method9780(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 3, method10094(class171, class88))));
	}

	public void method9674(int i, Interface44 interface44) {
		Class205 class205 = (Class205) interface44;
		IDirect3DDevice.SetStreamSource(((Class106_Sub3_Sub1) this).aLong11066, i, ((Class205) class205).aLong2417, 0, class205.method3017());
	}

	boolean method9750(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 4, method10094(class171, class88))));
	}

	boolean method9782(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 4, method10094(class171, class88))));
	}

	Interface43 method9783(Class171 class171, Class88 class88, int i, int i_140_) {
		return new Class219_Sub2(this, class171, class88, i, i_140_);
	}

	Interface43 method9784(Class171 class171, Class88 class88, int i, int i_141_) {
		return new Class219_Sub2(this, class171, class88, i, i_141_);
	}

	void method9837() {
		method9748();
		method9627();
	}

	Interface43 method9604(Class171 class171, int i, int i_142_, boolean bool, byte[] is, int i_143_, int i_144_) {
		return new Class219_Sub2(this, class171, i, i_142_, bool, is, i_143_, i_144_);
	}

	void method1743(int i, int i_145_) throws Exception_Sub1 {
		if (((Class106_Sub3_Sub1) this).aBool11051) {
			if (!method10100(aClass104_Sub2_1419.method1648(), aClass104_Sub2_1419.method1646()))
				return;
			((Class104_Sub2_Sub1_Sub1) aClass104_Sub2_1419).method122();
		} else
			IDirect3DDevice.EndScene(((Class106_Sub3_Sub1) this).aLong11066);
		int i_146_ = aClass104_Sub2_1419.method9924();
		if (Class32.method766(i_146_)) {
			((Class106_Sub3_Sub1) this).aBool11051 = true;
			aClass104_Sub2_1419.method39();
		} else {
			IDirect3DDevice.BeginScene(((Class106_Sub3_Sub1) this).aLong11066);
			if (anInterface5_1408 != null)
				anInterface5_1408.method22((byte) -94);
		}
	}

	final Interface44 method9819(boolean bool) {
		return new Class205(this, bool);
	}

	Interface43 method9787(int i, int i_147_, boolean bool, int[] is, int i_148_, int i_149_) {
		return new Class219_Sub2(this, i, i_147_, bool, is, i_148_, i_149_);
	}

	Interface43 method9788(int i, int i_150_, boolean bool, int[] is, int i_151_, int i_152_) {
		return new Class219_Sub2(this, i, i_150_, bool, is, i_151_, i_152_);
	}

	public void method2017() {
		long l = IDirect3DDevice.CreateEventQuery(((Class106_Sub3_Sub1) this).aLong11066);
		if (Class32.method767(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1)
					break;
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	Interface33 method9790(int i, boolean bool, int[][] is) {
		return new Class219_Sub1(this, i, bool, is);
	}

	Interface33 method9791(int i, boolean bool, int[][] is) {
		return new Class219_Sub1(this, i, bool, is);
	}

	Interface33 method9731(int i, boolean bool, int[][] is) {
		return new Class219_Sub1(this, i, bool, is);
	}

	Interface33 method9792(int i, boolean bool, int[][] is) {
		return new Class219_Sub1(this, i, bool, is);
	}

	Interface40 method9708(Class171 class171, int i, int i_153_, int i_154_, boolean bool, byte[] is) {
		return new Class219_Sub3(this, class171, i, i_153_, i_154_, bool, is);
	}

	Interface40 method9757(Class171 class171, int i, int i_155_, int i_156_, boolean bool, byte[] is) {
		return new Class219_Sub3(this, class171, i, i_155_, i_156_, bool, is);
	}

	Interface45 method9794(Class171 class171, Class88 class88, int i, int i_157_) {
		return new Class219_Sub2_Sub1(this, class171, class88, i, i_157_);
	}

	Interface45 method9795(Class171 class171, Class88 class88, int i, int i_158_) {
		return new Class219_Sub2_Sub1(this, class171, class88, i, i_158_);
	}

	void method9805() {
		if (((Class106_Sub3_Sub1) this).aLong11052 == 0L && aClass295Array10436[anInt10367] != Class295.aClass295_3462) {
			if (aClass295Array10436[anInt10367] == Class295.aClass295_3460)
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3465(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			else
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			int i = method10091(aClass295Array10436[anInt10367]);
			if (i != ((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367]) {
				IDirect3DDevice.SetTextureStageState(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 24, i);
				((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 24, 0);
			((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = 0;
		}
	}

	void method9748() {
		if (aBool10488) {
			float f = aBool10452 ? aFloat10455 : 0.0F;
			float f_159_ = aBool10452 ? -aFloat10456 : 0.0F;
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11035, f * aFloat10451, f * aFloat10439, f * aFloat10453, 0.0F);
			D3DLIGHT.SetDiffuse(((Class106_Sub3_Sub1) this).aLong11063, f_159_ * aFloat10451, f_159_ * aFloat10439, f_159_ * aFloat10453, 0.0F);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	final void method9798(int i, Class293 class293, boolean bool, boolean bool_160_) {
		if (aBool10488) {
			int i_161_ = 0;
			int i_162_;
			switch (i) {
				default:
					i_162_ = 2;
					break;
				case 2:
					i_162_ = 26;
					break;
				case 1:
					i_162_ = 3;
			}
			if (bool)
				i_161_ |= 0x20;
			if (bool_160_)
				i_161_ |= 0x10;
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, i_162_, (method10105(class293) | i_161_));
		}
	}

	public boolean method1844() {
		return true;
	}

	final void method9799() {
		if (aBool10488)
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 60, anInt10471);
	}

	public void method9796(Class250 class250) {
		class250.method3445(((Class106_Sub3_Sub1) this).aClass250_11045);
	}

	void method9741() {
		method2018();
		for (LinkableObject class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7932((byte) 50); class572_sub9 != null; class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7926(1290108914)) {
			Interface22 interface22 = (Interface22) class572_sub9.anObject9081;
			interface22.method39();
		}
		super.method9583();
	}

	void method10101(Interface22 interface22) {
		LinkableObject class572_sub9 = method10102(interface22);
		if (class572_sub9 != null)
			class572_sub9.method6794((byte) 46);
	}

	Interface43 method9786(Class171 class171, int i, int i_163_, boolean bool, float[] fs, int i_164_, int i_165_) {
		return new Class219_Sub2(this, class171, i, i_163_, bool, fs, i_164_, i_165_);
	}

	void method9806() {
		if (((Class106_Sub3_Sub1) this).aLong11052 == 0L && aClass295Array10436[anInt10367] != Class295.aClass295_3462) {
			if (aClass295Array10436[anInt10367] == Class295.aClass295_3460)
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3465(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			else
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			int i = method10091(aClass295Array10436[anInt10367]);
			if (i != ((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367]) {
				IDirect3DDevice.SetTextureStageState(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 24, i);
				((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 24, 0);
			((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = 0;
		}
	}

	void method9807() {
		if (((Class106_Sub3_Sub1) this).aLong11052 == 0L && aClass295Array10436[anInt10367] != Class295.aClass295_3462) {
			if (aClass295Array10436[anInt10367] == Class295.aClass295_3460)
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3465(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			else
				IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 16 + anInt10367, (aClass250Array10486[anInt10367].method3492(((Class106_Sub3_Sub1) this).aFloatArray11059)));
			int i = method10091(aClass295Array10436[anInt10367]);
			if (i != ((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367]) {
				IDirect3DDevice.SetTextureStageState(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 24, i);
				((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 24, 0);
			((Class106_Sub3_Sub1) this).anIntArray11049[anInt10367] = 0;
		}
	}

	void method9808() {
		if (aBool10488) {
			int i = (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] ? method10092(aClass373Array10403[anInt10367]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 1, i);
		}
	}

	void method9809() {
		if (aBool10488) {
			int i = (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] ? method10092(aClass373Array10403[anInt10367]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 1, i);
		}
	}

	void method9810() {
		if (aBool10488) {
			int i = (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] ? method10092(aClass373Array10469[anInt10367]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 4, i);
		}
	}

	void method9683() {
		if (aBool10488) {
			int i = (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] ? method10092(aClass373Array10469[anInt10367]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 4, i);
		}
	}

	void method9715() {
		if (aBool10488) {
			int i = (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] ? method10092(aClass373Array10469[anInt10367]) : 1);
			IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), anInt10367, 4, i);
		}
	}

	void method9839() {
		/* empty */
	}

	void method9676() {
		switch (aClass376_10418.anInt4565) {
			case 2:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 9);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 5);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 6);
				break;
			case 0:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 1);
				break;
		}
		switch (anInt10506) {
			case 1:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 0:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
		}
	}

	void method9812() {
		switch (aClass376_10418.anInt4565) {
			case 2:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 9);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 5);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 6);
				break;
			case 0:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 1);
				break;
		}
		switch (anInt10506) {
			case 1:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 0:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
		}
	}

	void method9813() {
		switch (aClass376_10418.anInt4565) {
			case 2:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 9);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 5);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 6);
				break;
			case 0:
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 19, 2);
				IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 20, 1);
				break;
		}
		switch (anInt10506) {
			case 1:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 0:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 1);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 207, 2);
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 208, 2);
				break;
		}
	}

	void method9814() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 27, aBool10508);
	}

	void method9815() {
		aFloat10504 = aFloat10425 - (float) anInt10398;
		aFloat10503 = aFloat10504 - (float) anInt10448;
		if (aFloat10503 < aFloat10464)
			aFloat10503 = aFloat10464;
		if (aBool10488) {
			IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 36, aFloat10503);
			IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 37, aFloat10504);
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 34, anInt10500);
		}
	}

	void method9709() {
		aFloat10504 = aFloat10425 - (float) anInt10398;
		aFloat10503 = aFloat10504 - (float) anInt10448;
		if (aFloat10503 < aFloat10464)
			aFloat10503 = aFloat10464;
		if (aBool10488) {
			IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 36, aFloat10503);
			IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 37, aFloat10504);
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 34, anInt10500);
		}
	}

	void method9578() {
		if (aBool10488)
			IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 28, (aBool10499 && aBool10498 && anInt10448 >= 0));
	}

	public long method1705(int i, int i_166_) {
		return method10085(i, i_166_, null, null);
	}

	void method9594() {
		if (aBool10488) {
			D3DLIGHT.SetAmbient(((Class106_Sub3_Sub1) this).aLong11035, aFloat10451 * aFloat10458, aFloat10439 * aFloat10458, aFloat10453 * aFloat10458, 0.0F);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	final Interface46 method9690(boolean bool) {
		return new Class215(this, Class88.aClass88_1217, bool);
	}

	final Interface44 method9689(boolean bool) {
		return new Class205(this, bool);
	}

	final Interface44 method9710(boolean bool) {
		return new Class205(this, bool);
	}

	void method9624() {
		if (aBool10488)
			IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 137, aBool10369 && !aBool10420);
	}

	Interface43 method9789(int i, int i_167_, boolean bool, int[] is, int i_168_, int i_169_) {
		return new Class219_Sub2(this, i, i_167_, bool, is, i_168_, i_169_);
	}

	Class362 method9829(Class354[] class354s) {
		return new Class362_Sub2(this, class354s);
	}

	Class362 method9749(Class354[] class354s) {
		return new Class362_Sub2(this, class354s);
	}

	void method9699() {
		method9748();
		method9627();
	}

	public Class165 method1662() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		IDirect3D.GetAdapterIdentifier(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, 0, d3dadapter_identifier);
		return new Class165(d3dadapter_identifier.VendorID, method9713() ? "Direct3D FF" : "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion, method9713());
	}

	final void method9826(Interface46 interface46, Class379 class379, int i, int i_170_, int i_171_, int i_172_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitiveIB(((Class106_Sub3_Sub1) this).aLong11066, ((Class215) (Class215) interface46).aLong2501, 4, 0, i, i_170_, i_171_, i_172_);
	}

	final void method9827(Interface46 interface46, Class379 class379, int i, int i_173_, int i_174_, int i_175_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitiveIB(((Class106_Sub3_Sub1) this).aLong11066, ((Class215) (Class215) interface46).aLong2501, 4, 0, i, i_173_, i_174_, i_175_);
	}

	public boolean method1840() {
		if (((Class106_Sub3_Sub1) this).aBool11051)
			return false;
		if ((((Class106_Sub3_Sub1) this).aLongArray11065[((Class106_Sub3_Sub1) this).anInt11033]) != 0L)
			return false;
		return true;
	}

	public final void method9721(Class379 class379, int i, int i_176_, int i_177_, int i_178_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitive((((Class106_Sub3_Sub1) this).aLong11066), method10095(class379), 0, i, i_176_, i_177_, i_178_);
	}

	public final void method9830(Class379 class379, int i, int i_179_, int i_180_, int i_181_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitive((((Class106_Sub3_Sub1) this).aLong11066), method10095(class379), 0, i, i_179_, i_180_, i_181_);
	}

	public Interface6 method2000(int i, int i_182_, Class171 class171, Class88 class88, int i_183_) {
		return new Class329(this, class171, class88, i, i_182_, i_183_);
	}

	void method9833(int i) {
		if (!((Class106_Sub3_Sub1) this).aBool11036) {
			int i_184_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 8, i_184_);
		}
	}

	void method9834(int i) {
		if (!((Class106_Sub3_Sub1) this).aBool11036) {
			int i_185_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 8, i_185_);
		}
	}

	void method9835() {
		for (int i = 0; i < anInt10454; i++) {
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 7, 2);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 6, 2);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 5, 2);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 1, 1);
			IDirect3DDevice.SetSamplerState((((Class106_Sub3_Sub1) this).aLong11066), i, 2, 1);
			((Class106_Sub3_Sub1) this).aClass367Array11058[i] = Class367.aClass367_4508;
			boolean[] bools = ((Class106_Sub3_Sub1) this).aBoolArray11039;
			int i_186_ = i;
			((Class106_Sub3_Sub1) this).aBoolArray11040[i] = true;
			bools[i_186_] = true;
			((Class106_Sub3_Sub1) this).aBoolArray11042[i] = false;
			((Class106_Sub3_Sub1) this).anIntArray11049[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState((((Class106_Sub3_Sub1) this).aLong11066), 0, 6, 1);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 9, 2);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 23, 4);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 25, 5);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 24, 0);
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 206, aBool10526);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 181, 0);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 22, 2);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 147, 1);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 145, 1);
		IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 38, 0.95F);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 35, 3);
		IDirect3DDevice.method10062(((Class106_Sub3_Sub1) this).aLong11066, 154, 1.0F);
		D3DLIGHT.SetType(((Class106_Sub3_Sub1) this).aLong11035, 3);
		D3DLIGHT.SetType(((Class106_Sub3_Sub1) this).aLong11063, 3);
		D3DLIGHT.SetType(((Class106_Sub3_Sub1) this).aLong11037, 1);
		((Class106_Sub3_Sub1) this).aBool11038 = false;
		super.method9738();
	}

	void method9848(Interface46 interface46) {
		IDirect3DDevice.SetIndices(((Class106_Sub3_Sub1) this).aLong11066, (((Class215) (Class215) interface46).aLong2501));
	}

	LinkableObject method10102(Interface22 interface22) {
		for (LinkableObject class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7932((byte) 50); class572_sub9 != null; class572_sub9 = (LinkableObject) ((Class106_Sub3_Sub1) this).aClass675_11070.method7926(127842806)) {
			if (class572_sub9.anObject9081 == interface22)
				return class572_sub9;
		}
		return null;
	}

	void method9772() {
		if (aBool10488) {
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11035, -aFloatArray10446[0], -aFloatArray10446[1], -aFloatArray10446[2]);
			D3DLIGHT.SetDirection(((Class106_Sub3_Sub1) this).aLong11063, -aFloatArray10440[0], -aFloatArray10440[1], -aFloatArray10440[2]);
			((Class106_Sub3_Sub1) this).aBool11038 = false;
		}
	}

	public final void method9677(Class379 class379, int i, int i_187_, int i_188_, int i_189_) {
		if (((Class106_Sub3_Sub1) this).aClass405_Sub1_11046 != null)
			((Class106_Sub3_Sub1) this).aClass405_Sub1_11046.method9329();
		IDirect3DDevice.DrawIndexedPrimitive((((Class106_Sub3_Sub1) this).aLong11066), method10095(class379), 0, i, i_187_, i_188_, i_189_);
	}

	void method1803() {
		super.method1667();
		if (((Class106_Sub3_Sub1) this).aLong11035 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11035);
			((Class106_Sub3_Sub1) this).aLong11035 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11063 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11063);
			((Class106_Sub3_Sub1) this).aLong11063 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11037 != 0L) {
			D3DLIGHT.Destroy(((Class106_Sub3_Sub1) this).aLong11037);
			((Class106_Sub3_Sub1) this).aLong11037 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11066 != 0L) {
			IDirect3DDevice.Destroy(((Class106_Sub3_Sub1) this).aLong11066);
			((Class106_Sub3_Sub1) this).aLong11066 = 0L;
		}
		if (((Class106_Sub3_Sub1) this).aLong11029 != 0L) {
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLong11029);
			((Class106_Sub3_Sub1) this).aLong11029 = 0L;
		}
	}

	boolean method9779(Class171 class171, Class88 class88) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		return (Class32.method767(IDirect3D.GetAdapterDisplayMode(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, d3ddisplaymode)) && Class32.method767(IDirect3D.CheckDeviceFormat(((Class106_Sub3_Sub1) this).aLong11029, ((Class106_Sub3_Sub1) this).anInt11044, ((Class106_Sub3_Sub1) this).anInt11032, d3ddisplaymode.Format, 0, 3, method10094(class171, class88))));
	}

	final void method10103(long l) {
		((Class106_Sub3_Sub1) this).aLong11052 = l;
		IDirect3DDevice.SetVertexShader(((Class106_Sub3_Sub1) this).aLong11066, l);
	}

	final void method10104(long l) {
		((Class106_Sub3_Sub1) this).aLong11052 = l;
		IDirect3DDevice.SetVertexShader(((Class106_Sub3_Sub1) this).aLong11066, l);
	}

	public void method1710(boolean bool) {
		/* empty */
	}

	void method9836() {
		if (aBool10488)
			IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 137, aBool10369 && !aBool10420);
	}

	void method9767() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 14, aBool10536 && aBool10441);
	}

	void method9838() {
		method9748();
		method9627();
	}

	public void method9732(Class250 class250, Class250 class250_190_, Class250 class250_191_) {
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 256, class250.aFloatArray2728);
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 2, class250_190_.aFloatArray2728);
		IDirect3DDevice.SetTransform(((Class106_Sub3_Sub1) this).aLong11066, 3, class250_191_.aFloatArray2728);
	}

	public final synchronized void method1885(int i) {
		for (int i_192_ = 0; i_192_ < ((Class106_Sub3_Sub1) this).anInt11061; i_192_++)
			IUnknown.Release(((Class106_Sub3_Sub1) this).aLongArray11062[i_192_]);
		((Class106_Sub3_Sub1) this).anInt11061 = 0;
		super.method1668(i);
	}

	void method9599() {
		/* empty */
	}

	void method9840() {
		/* empty */
	}

	public float method9746() {
		return -0.5F;
	}

	Interface43 method9758(Class171 class171, int i, int i_193_, boolean bool, byte[] is, int i_194_, int i_195_) {
		return new Class219_Sub2(this, class171, i, i_193_, bool, is, i_194_, i_195_);
	}

	public void method9705() {
		if (((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367]) {
			((Class106_Sub3_Sub1) this).aBoolArray11041[anInt10367] = false;
			IDirect3DDevice.SetTexture(((Class106_Sub3_Sub1) this).aLong11066, anInt10367, 0L);
			method9657();
			method9691();
		}
	}

	void method9841() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 15, aBool10483);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 24, aByte10510 & 0xff);
		if ((((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.MultiSampleType) > 0) {
			if (!aBool10483 || aByte10510 == 0) {
				if (((Class106_Sub3_Sub1) this).aBool11043 || ((Class106_Sub3_Sub1) this).aBool11027)
					IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, 0);
				else if (((Class106_Sub3_Sub1) this).aBool11054)
					IDirect3DDevice.method10062((((Class106_Sub3_Sub1) this).aLong11066), 154, 1.0F);
			} else if (((Class106_Sub3_Sub1) this).aBool11043)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, method9764('S', 'S', 'A', 'A'));
			else if (((Class106_Sub3_Sub1) this).aBool11027)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, method9764('A', 'T', 'O', 'C'));
			else if (((Class106_Sub3_Sub1) this).aBool11054)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 154, method9764('A', '2', 'M', '1'));
		}
	}

	void method9842() {
		IDirect3DDevice.method10063(((Class106_Sub3_Sub1) this).aLong11066, 15, aBool10483);
		IDirect3DDevice.SetRenderState(((Class106_Sub3_Sub1) this).aLong11066, 24, aByte10510 & 0xff);
		if ((((Class106_Sub3_Sub1) this).aD3DPRESENT_PARAMETERS11031.MultiSampleType) > 0) {
			if (!aBool10483 || aByte10510 == 0) {
				if (((Class106_Sub3_Sub1) this).aBool11043 || ((Class106_Sub3_Sub1) this).aBool11027)
					IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, 0);
				else if (((Class106_Sub3_Sub1) this).aBool11054)
					IDirect3DDevice.method10062((((Class106_Sub3_Sub1) this).aLong11066), 154, 1.0F);
			} else if (((Class106_Sub3_Sub1) this).aBool11043)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, method9764('S', 'S', 'A', 'A'));
			else if (((Class106_Sub3_Sub1) this).aBool11027)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 181, method9764('A', 'T', 'O', 'C'));
			else if (((Class106_Sub3_Sub1) this).aBool11054)
				IDirect3DDevice.SetRenderState((((Class106_Sub3_Sub1) this).aLong11066), 154, method9764('A', '2', 'M', '1'));
		}
	}

	public void method9843(Class362 class362) {
		Class362_Sub2 class362_sub2 = (Class362_Sub2) class362;
		IDirect3DDevice.SetVertexDeclaration((((Class106_Sub3_Sub1) this).aLong11066), (((Class362_Sub2) class362_sub2).aLong9742));
	}

	public void method9844(Class362 class362) {
		Class362_Sub2 class362_sub2 = (Class362_Sub2) class362;
		IDirect3DDevice.SetVertexDeclaration((((Class106_Sub3_Sub1) this).aLong11066), (((Class362_Sub2) class362_sub2).aLong9742));
	}

	public void method9706(Class362 class362) {
		Class362_Sub2 class362_sub2 = (Class362_Sub2) class362;
		IDirect3DDevice.SetVertexDeclaration((((Class106_Sub3_Sub1) this).aLong11066), (((Class362_Sub2) class362_sub2).aLong9742));
	}

	public void method9845(Class362 class362) {
		Class362_Sub2 class362_sub2 = (Class362_Sub2) class362;
		IDirect3DDevice.SetVertexDeclaration((((Class106_Sub3_Sub1) this).aLong11066), (((Class362_Sub2) class362_sub2).aLong9742));
	}

	void method9846(Interface46 interface46) {
		IDirect3DDevice.SetIndices(((Class106_Sub3_Sub1) this).aLong11066, (((Class215) (Class215) interface46).aLong2501));
	}

	void method9718(Interface46 interface46) {
		IDirect3DDevice.SetIndices(((Class106_Sub3_Sub1) this).aLong11066, (((Class215) (Class215) interface46).aLong2501));
	}

	final Interface46 method9625(boolean bool) {
		return new Class215(this, Class88.aClass88_1217, bool);
	}

	void method9849(Interface46 interface46) {
		IDirect3DDevice.SetIndices(((Class106_Sub3_Sub1) this).aLong11066, (((Class215) (Class215) interface46).aLong2501));
	}

	void method9627() {
		if (aBool10488 && !((Class106_Sub3_Sub1) this).aBool11038) {
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, false);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, false);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 0, ((Class106_Sub3_Sub1) this).aLong11035);
			IDirect3DDevice.SetLight(((Class106_Sub3_Sub1) this).aLong11066, 1, ((Class106_Sub3_Sub1) this).aLong11063);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 0, true);
			IDirect3DDevice.LightEnable(((Class106_Sub3_Sub1) this).aLong11066, 1, true);
			((Class106_Sub3_Sub1) this).aBool11038 = true;
		}
	}

	public boolean method1843() {
		return true;
	}

	public Interface11 method1810(int i, int i_196_) {
		return new Class211(this, Class88.aClass88_1216, i, i_196_, 0);
	}

	public void method9823(int i, Interface44 interface44) {
		Class205 class205 = (Class205) interface44;
		IDirect3DDevice.SetStreamSource(((Class106_Sub3_Sub1) this).aLong11066, i, ((Class205) class205).aLong2417, 0, class205.method3017());
	}

	public String method1829() {
		String string = "Caps: 4:";
		String string_197_ = ":";
		string = new StringBuilder().append(string).append(anInt10511).append(string_197_).toString();
		string = new StringBuilder().append(string).append(anInt10454).append(string_197_).toString();
		string = new StringBuilder().append(string).append(anInt10415).append(string_197_).toString();
		string = new StringBuilder().append(string).append(aBool10522 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(method9575() ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(method9637() ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(aBool10524 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(aBool10467 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11055 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11069 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11034 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11050 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(aBool10519 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(aBool10520 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(aBool10521 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11027 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11054 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11043 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(aBool10526 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11056 ? 1 : 0).append(string_197_).toString();
		string = new StringBuilder().append(string).append(((Class106_Sub3_Sub1) this).aBool11057 ? 1 : 0).toString();
		return string;
	}

	Interface43 method9634(Class171 class171, Class88 class88, int i, int i_198_) {
		return new Class219_Sub2(this, class171, class88, i, i_198_);
	}

	static final int method10105(Class293 class293) {
		switch (class293.anInt3452) {
			case 1:
				return 2;
			case 0:
				return 1;
			default:
				throw new IllegalArgumentException();
			case 3:
				return 0;
			case 2:
				return 3;
		}
	}
}

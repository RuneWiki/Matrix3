package game;

/* Class104_Sub2_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

import java.awt.Canvas;

public class Class104_Sub2_Sub1_Sub1 extends Class104_Sub2_Sub1 implements Interface22 {
	long aLong11590;
	Canvas aCanvas11591;
	D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS11592;
	long aLong11593;
	long aLong11594;
	boolean aBool11595 = false;
	int anInt11596;
	Class106_Sub3_Sub1 aClass106_Sub3_Sub1_11597;
	boolean aBool11598 = false;
	int anInt11599;

	public int method1650() {
		return ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
	}

	public void finalize() throws Throwable {
		method10510();
		super.finalize();
	}

	public int method1648() {
		return ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
	}

	public int method1646() {
		return ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
	}

	public void method125() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592 = new D3DPRESENT_PARAMETERS(((Class104_Sub2_Sub1_Sub1) this).aCanvas11591);
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.Windowed = true;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferCount = 1;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.PresentationInterval = -2147483648;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferWidth = ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferHeight = ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
			if (((Class104_Sub2_Sub1_Sub1) this).aBool11598) {
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.GetSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.GetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066));
			} else {
				if (!Class106_Sub3_Sub1.method10096((((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11044), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11032), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11029), (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.anInt10511), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aD3DDISPLAYMODE11030), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)))
					throw new RuntimeException();
				int i = (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.AutoDepthStencilFormat);
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.CreateAdditionalSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.CreateDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596, i, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleType), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleQuality), false));
			}
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10082(this);
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11595)
			method126();
	}

	boolean method1649() {
		((Class104_Sub2_Sub1_Sub1) this).aBool11595 = false;
		return Class32.method767(IDirect3DDevice.SetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0L));
	}

	public int method9924() {
		return IDirect3DSwapChain.Present(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0);
	}

	boolean method1647() {
		((Class104_Sub2_Sub1_Sub1) this).aBool11595 = false;
		return Class32.method767(IDirect3DDevice.SetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0L));
	}

	void method9925(int i, int i_0_) {
		method39();
		((Class104_Sub2_Sub1_Sub1) this).anInt11599 = i;
		((Class104_Sub2_Sub1_Sub1) this).anInt11596 = i_0_;
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11598)
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10100(((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596);
		method122();
		super.method9925(i, i_0_);
	}

	void method10509() throws Throwable {
		method10510();
		super.finalize();
	}

	void method10510() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11594 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11594);
			((Class104_Sub2_Sub1_Sub1) this).aLong11594 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11593 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11593);
			((Class104_Sub2_Sub1_Sub1) this).aLong11593 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11590);
			((Class104_Sub2_Sub1_Sub1) this).aLong11590 = 0L;
		}
		((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10101(this);
	}

	public void method124() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592 = new D3DPRESENT_PARAMETERS(((Class104_Sub2_Sub1_Sub1) this).aCanvas11591);
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.Windowed = true;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferCount = 1;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.PresentationInterval = -2147483648;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferWidth = ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferHeight = ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
			if (((Class104_Sub2_Sub1_Sub1) this).aBool11598) {
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.GetSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.GetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066));
			} else {
				if (!Class106_Sub3_Sub1.method10096((((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11044), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11032), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11029), (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.anInt10511), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aD3DDISPLAYMODE11030), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)))
					throw new RuntimeException();
				int i = (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.AutoDepthStencilFormat);
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.CreateAdditionalSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.CreateDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596, i, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleType), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleQuality), false));
			}
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10082(this);
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11595)
			method126();
	}

	public void method128() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11594 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11594);
			((Class104_Sub2_Sub1_Sub1) this).aLong11594 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11593 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11593);
			((Class104_Sub2_Sub1_Sub1) this).aLong11593 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11590);
			((Class104_Sub2_Sub1_Sub1) this).aLong11590 = 0L;
		}
		((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10101(this);
	}

	public int method1651() {
		return ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
	}

	public int method1652() {
		return ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
	}

	public void method130() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592 = new D3DPRESENT_PARAMETERS(((Class104_Sub2_Sub1_Sub1) this).aCanvas11591);
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.Windowed = true;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferCount = 1;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.PresentationInterval = -2147483648;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferWidth = ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferHeight = ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
			if (((Class104_Sub2_Sub1_Sub1) this).aBool11598) {
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.GetSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.GetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066));
			} else {
				if (!Class106_Sub3_Sub1.method10096((((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11044), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11032), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11029), (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.anInt10511), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aD3DDISPLAYMODE11030), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)))
					throw new RuntimeException();
				int i = (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.AutoDepthStencilFormat);
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.CreateAdditionalSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.CreateDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596, i, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleType), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleQuality), false));
			}
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10082(this);
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11595)
			method126();
	}

	void method10511() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11594 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11594);
			((Class104_Sub2_Sub1_Sub1) this).aLong11594 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11593 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11593);
			((Class104_Sub2_Sub1_Sub1) this).aLong11593 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11590);
			((Class104_Sub2_Sub1_Sub1) this).aLong11590 = 0L;
		}
		((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10101(this);
	}

	public void method127() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11594 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11594);
			((Class104_Sub2_Sub1_Sub1) this).aLong11594 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11593 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11593);
			((Class104_Sub2_Sub1_Sub1) this).aLong11593 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11590);
			((Class104_Sub2_Sub1_Sub1) this).aLong11590 = 0L;
		}
		((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10101(this);
	}

	public void method122() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592 = new D3DPRESENT_PARAMETERS(((Class104_Sub2_Sub1_Sub1) this).aCanvas11591);
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.Windowed = true;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferCount = 1;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.PresentationInterval = -2147483648;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferWidth = ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferHeight = ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
			if (((Class104_Sub2_Sub1_Sub1) this).aBool11598) {
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.GetSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.GetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066));
			} else {
				if (!Class106_Sub3_Sub1.method10096((((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11044), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11032), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11029), (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.anInt10511), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aD3DDISPLAYMODE11030), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)))
					throw new RuntimeException();
				int i = (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.AutoDepthStencilFormat);
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.CreateAdditionalSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.CreateDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596, i, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleType), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleQuality), false));
			}
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10082(this);
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11595)
			method126();
	}

	public void method120() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11594 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11594);
			((Class104_Sub2_Sub1_Sub1) this).aLong11594 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11593 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11593);
			((Class104_Sub2_Sub1_Sub1) this).aLong11593 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11590);
			((Class104_Sub2_Sub1_Sub1) this).aLong11590 = 0L;
		}
		((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10101(this);
	}

	void method9926(int i, int i_1_) {
		method39();
		((Class104_Sub2_Sub1_Sub1) this).anInt11599 = i;
		((Class104_Sub2_Sub1_Sub1) this).anInt11596 = i_1_;
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11598)
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10100(((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596);
		method122();
		super.method9925(i, i_1_);
	}

	void method9928(int i, int i_2_) {
		method39();
		((Class104_Sub2_Sub1_Sub1) this).anInt11599 = i;
		((Class104_Sub2_Sub1_Sub1) this).anInt11596 = i_2_;
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11598)
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10100(((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596);
		method122();
		super.method9925(i, i_2_);
	}

	public void method39() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11594 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11594);
			((Class104_Sub2_Sub1_Sub1) this).aLong11594 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11593 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11593);
			((Class104_Sub2_Sub1_Sub1) this).aLong11593 = 0L;
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 != 0L) {
			IUnknown.Release(((Class104_Sub2_Sub1_Sub1) this).aLong11590);
			((Class104_Sub2_Sub1_Sub1) this).aLong11590 = 0L;
		}
		((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10101(this);
	}

	public int method9929() {
		return IDirect3DSwapChain.Present(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0);
	}

	public int method9930(int i, int i_3_) {
		return IDirect3DSwapChain.Present(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0);
	}

	void method9927(int i, int i_4_) {
		method39();
		((Class104_Sub2_Sub1_Sub1) this).anInt11599 = i;
		((Class104_Sub2_Sub1_Sub1) this).anInt11596 = i_4_;
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11598)
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10100(((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596);
		method122();
		super.method9925(i, i_4_);
	}

	public int method9932(int i, int i_5_) {
		return IDirect3DSwapChain.Present(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0);
	}

	public int method9923(int i, int i_6_) {
		return IDirect3DSwapChain.Present(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0);
	}

	public void method121() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592 = new D3DPRESENT_PARAMETERS(((Class104_Sub2_Sub1_Sub1) this).aCanvas11591);
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.Windowed = true;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferCount = 1;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.PresentationInterval = -2147483648;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferWidth = ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferHeight = ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
			if (((Class104_Sub2_Sub1_Sub1) this).aBool11598) {
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.GetSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.GetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066));
			} else {
				if (!Class106_Sub3_Sub1.method10096((((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11044), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11032), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11029), (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.anInt10511), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aD3DDISPLAYMODE11030), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)))
					throw new RuntimeException();
				int i = (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.AutoDepthStencilFormat);
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.CreateAdditionalSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.CreateDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596, i, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleType), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleQuality), false));
			}
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10082(this);
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11595)
			method126();
	}

	public boolean method131() {
		((Class104_Sub2_Sub1_Sub1) this).aBool11595 = true;
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			if (((Class106_Sub3_Sub1) ((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597).aBool11051)
				return false;
			method122();
		}
		if (Class32.method766(IDirect3DDevice.SetRenderTarget(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0, ((Class104_Sub2_Sub1_Sub1) this).aLong11594)))
			return false;
		if (Class32.method766(IDirect3DDevice.SetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).aLong11593)))
			return false;
		return super.method126();
	}

	public int method9931(int i, int i_7_) {
		return IDirect3DSwapChain.Present(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0);
	}

	public boolean method126() {
		((Class104_Sub2_Sub1_Sub1) this).aBool11595 = true;
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			if (((Class106_Sub3_Sub1) ((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597).aBool11051)
				return false;
			method122();
		}
		if (Class32.method766(IDirect3DDevice.SetRenderTarget(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0, ((Class104_Sub2_Sub1_Sub1) this).aLong11594)))
			return false;
		if (Class32.method766(IDirect3DDevice.SetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).aLong11593)))
			return false;
		return super.method126();
	}

	public void method129() {
		if (((Class104_Sub2_Sub1_Sub1) this).aLong11590 == 0L) {
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592 = new D3DPRESENT_PARAMETERS(((Class104_Sub2_Sub1_Sub1) this).aCanvas11591);
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.Windowed = true;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferCount = 1;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.PresentationInterval = -2147483648;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferWidth = ((Class104_Sub2_Sub1_Sub1) this).anInt11599;
			((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.BackBufferHeight = ((Class104_Sub2_Sub1_Sub1) this).anInt11596;
			if (((Class104_Sub2_Sub1_Sub1) this).aBool11598) {
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.GetSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.GetDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066));
			} else {
				if (!Class106_Sub3_Sub1.method10096((((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11044), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).anInt11032), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11029), (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.anInt10511), (((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aD3DDISPLAYMODE11030), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)))
					throw new RuntimeException();
				int i = (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.AutoDepthStencilFormat);
				((Class104_Sub2_Sub1_Sub1) this).aLong11590 = (IDirect3DDevice.CreateAdditionalSwapChain(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592)));
				((Class104_Sub2_Sub1_Sub1) this).aLong11594 = (IDirect3DSwapChain.GetBackBuffer(((Class104_Sub2_Sub1_Sub1) this).aLong11590, 0, 0));
				((Class104_Sub2_Sub1_Sub1) this).aLong11593 = (IDirect3DDevice.CreateDepthStencilSurface(((Class106_Sub3_Sub1) (((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597)).aLong11066, ((Class104_Sub2_Sub1_Sub1) this).anInt11599, ((Class104_Sub2_Sub1_Sub1) this).anInt11596, i, (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleType), (((Class104_Sub2_Sub1_Sub1) this).aD3DPRESENT_PARAMETERS11592.MultiSampleQuality), false));
			}
			((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597.method10082(this);
		}
		if (((Class104_Sub2_Sub1_Sub1) this).aBool11595)
			method126();
	}

	Class104_Sub2_Sub1_Sub1(Class106_Sub3_Sub1 class106_sub3_sub1, Canvas canvas, int i, int i_8_, boolean bool) {
		super(class106_sub3_sub1);
		((Class104_Sub2_Sub1_Sub1) this).aCanvas11591 = canvas;
		((Class104_Sub2_Sub1_Sub1) this).aClass106_Sub3_Sub1_11597 = class106_sub3_sub1;
		((Class104_Sub2_Sub1_Sub1) this).anInt11599 = i;
		((Class104_Sub2_Sub1_Sub1) this).anInt11596 = i_8_;
		((Class104_Sub2_Sub1_Sub1) this).aBool11598 = bool;
		method122();
	}
}

package game;

/* Class572_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class572_Sub28 extends Class572 {
	public int anInt9291;
	public int anInt9292;
	public int anInt9293;
	public int anInt9294;
	public int anInt9295;
	public int anInt9296;
	public int anInt9297;
	public int anInt9298;
	public int anInt9299;

	Class572_Sub28(RSByteBuffer class572_sub15) {
		int i = class572_sub15.readInt(-928077209);
		anInt9295 = -1264453727 * (i >>> 28);
		anInt9298 = (i >>> 14 & 0x3fff) * 745286733;
		anInt9293 = 797168853 * (i & 0x3fff);
		anInt9297 = class572_sub15.readUnsignedByte(1663639780) * -1592962163;
		anInt9296 = class572_sub15.readUnsignedByte(844395503) * 266466003;
		anInt9294 = class572_sub15.readUnsignedByte(277250866) * 56707425;
		anInt9299 = class572_sub15.readUnsignedByte(1172562798) * -288865691;
		anInt9291 = class572_sub15.readUnsignedByte(405315550) * -780971255;
		anInt9292 = class572_sub15.readUnsignedByte(853244230) * 1469357671;
	}

	static final void method8639(Cs2Executor class441, int i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class665_Sub5.method8155(class73, class83, class441, Class68.aClass68_695, 671999214);
	}
}

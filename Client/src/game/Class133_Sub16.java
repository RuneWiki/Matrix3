package game;

/* Class133_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub16 extends Class133 {
	int anInt9975;
	int anInt9976;

	public void method2303(int i) {
		Class120 class120 = (Class442.aClass120Array5129[((Class133_Sub16) this).anInt9975 * -324915061]);
		Class665_Sub24.method9083(-1012352189 * ((Class120) class120).anInt1469, 224268371 * ((Class120) class120).anInt1471, -1075413501 * ((Class120) class120).anInt1470, ((Class120) class120).aClass516_1473.anInt5721 * 1802271777, 1870735441 * ((Class120) class120).aClass516_1473.anInt5742, 540539263 * ((Class120) class120).anInt1468, -1053683973 * ((Class133_Sub16) this).anInt9976, 0, -124613373);
	}

	boolean method2308() {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(((((Class133_Sub16) this).anInt9976) * -1053683973), 216602416));
		return class132.method2291(-264821184);
	}

	boolean method2307() {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(((((Class133_Sub16) this).anInt9976) * -1053683973), -328867171));
		return class132.method2291(817021260);
	}

	public void method2309() {
		Class120 class120 = (Class442.aClass120Array5129[((Class133_Sub16) this).anInt9975 * -324915061]);
		Class665_Sub24.method9083(-1012352189 * ((Class120) class120).anInt1469, 224268371 * ((Class120) class120).anInt1471, -1075413501 * ((Class120) class120).anInt1470, ((Class120) class120).aClass516_1473.anInt5721 * 1802271777, 1870735441 * ((Class120) class120).aClass516_1473.anInt5742, 540539263 * ((Class120) class120).anInt1468, -1053683973 * ((Class133_Sub16) this).anInt9976, 0, -124613373);
	}

	boolean method2306() {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(((((Class133_Sub16) this).anInt9976) * -1053683973), 689632589));
		return class132.method2291(734521848);
	}

	Class133_Sub16(RSByteBuffer class572_sub15) {
		super(class572_sub15);
		((Class133_Sub16) this).anInt9975 = class572_sub15.readUnsignedShort(647518597) * -1553942749;
		((Class133_Sub16) this).anInt9976 = class572_sub15.readBigSmart((byte) 25) * 93703219;
	}

	boolean method2305(int i) {
		AnimationDefinition class132 = ((AnimationDefinition) Class26.aClass639_Sub18_217.getDefinition(((((Class133_Sub16) this).anInt9976) * -1053683973), -1008341549));
		return class132.method2291(1343491975);
	}

	public static final void method9375(String string, int i, int i_0_) {
		Class195 class195 = Class166.method2676((byte) 28);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3747, class195.aClass650_2340, -1978757888);
		class572_sub25.aRsByteBuffer.writeByte(1 + ObjectDefinitions.method6069(string, -1494429218), -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -100);
		class572_sub25.aRsByteBuffer.writeByte128(i, -1953776381);
		class195.method2929(class572_sub25, (byte) -15);
	}
}

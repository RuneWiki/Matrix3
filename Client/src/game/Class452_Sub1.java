package game;

/* Class452_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class452_Sub1 extends Class452 {
	static int anInt8933;

	public Class method466() {
		return GraphicsDefinition.class;
	}

	public Interface17 method458(int i, Interface18 interface18, int i_0_) {
		return new GraphicsDefinition(i, this);
	}

	public Class method459(int i) {
		return GraphicsDefinition.class;
	}

	public Interface17 method462(int i, Interface18 interface18) {
		return new GraphicsDefinition(i, this);
	}

	public Interface17 method465(int i, Interface18 interface18) {
		return new GraphicsDefinition(i, this);
	}

	public Interface17 method460(int i, Interface18 interface18) {
		return new GraphicsDefinition(i, this);
	}

	Class452_Sub1(Class248 class248) {
		super(class248);
	}

	public Interface17 method464(int i, Interface18 interface18) {
		return new GraphicsDefinition(i, this);
	}

	public Interface17 method463(int i, Interface18 interface18) {
		return new GraphicsDefinition(i, this);
	}

	public Class method461() {
		return GraphicsDefinition.class;
	}

	public Class method467() {
		return GraphicsDefinition.class;
	}

	static final void method8210(Cs2Executor class441, byte i) {
		String string = (String) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		Class572_Sub25 class572_sub25 = Class378.sendOutPacket(OutgoingPacket.aClass312_3701, client.aClass195_8589.aClass650_2340, -1988248614);
		class572_sub25.aRsByteBuffer.writeByte(string.length() + 1, -1384395473);
		class572_sub25.aRsByteBuffer.writeString(string, (byte) -20);
		client.aClass195_8589.method2929(class572_sub25, (byte) -28);
	}
}

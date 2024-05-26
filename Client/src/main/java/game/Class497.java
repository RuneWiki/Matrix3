package game;

/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class Class497 {
	public int localX;
	public int anInt5504;
	public int localY;

	public int method5925() {
		return (anInt5504 * -1080556115 << 28 | localX * -2109597897 << 14 | 417324155 * localY);
	}

	public Class497(int i, int i_0_, int i_1_) {
		anInt5504 = -908220891 * i;
		localX = 134565511 * i_0_;
		localY = -219569485 * i_1_;
	}

	public Class497(int i) {
		if (i == -1)
			anInt5504 = 908220891;
		else {
			anInt5504 = (i >> 28 & 0x3) * -908220891;
			localX = (i >> 14 & 0x3fff) * 134565511;
			localY = -219569485 * (i & 0x3fff);
		}
	}

	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class497))
			return false;
		return method5926((Class497) object, 2062784984);
	}

	boolean method5926(Class497 class497_2_, int i) {
		if (-1080556115 * class497_2_.anInt5504 != anInt5504 * -1080556115)
			return false;
		if (class497_2_.localX * -2109597897 != localX * -2109597897)
			return false;
		if (417324155 * localY != class497_2_.localY * 417324155)
			return false;
		return true;
	}

	public String method5927() {
		return new StringBuilder().append(-1080556115 * anInt5504).append(",").append(-2109597897 * localX >> 6).append(",").append(localY * 417324155 >> 6).append(",").append(-2109597897 * localX & 0x3f).append(",").append(localY * 417324155 & 0x3f).toString();
	}

	public String toString() {
		return new StringBuilder().append(-1080556115 * anInt5504).append(",").append(-2109597897 * localX >> 6).append(",").append(localY * 417324155 >> 6).append(",").append(-2109597897 * localX & 0x3f).append(",").append(localY * 417324155 & 0x3f).toString();
	}

	public int method5928() {
		return method5938(1245910204);
	}

	public Class497() {
		anInt5504 = 908220891;
	}

	public void method5929(Class572_Sub17 class572_sub17) {
		anInt5504 = 1489924707 * class572_sub17.anInt9123;
		localX = 134565511 * (-862367545 * class572_sub17.anInt9126 >> 9);
		localY = (-1661817525 * class572_sub17.anInt9124 >> 9) * -219569485;
	}

	public String method5930() {
		return new StringBuilder().append(-1080556115 * anInt5504).append(",").append(-2109597897 * localX >> 6).append(",").append(localY * 417324155 >> 6).append(",").append(-2109597897 * localX & 0x3f).append(",").append(localY * 417324155 & 0x3f).toString();
	}

	public boolean method5931(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class497))
			return false;
		return method5926((Class497) object, 2123269171);
	}

	public int method5932() {
		return method5938(1625660716);
	}

	public boolean method5933(Object object) {
		if (this == object)
			return true;
		if (!(object instanceof Class497))
			return false;
		return method5926((Class497) object, 1479602961);
	}

	public void method5934(Class572_Sub17 class572_sub17) {
		anInt5504 = 1489924707 * class572_sub17.anInt9123;
		localX = 134565511 * (-862367545 * class572_sub17.anInt9126 >> 9);
		localY = (-1661817525 * class572_sub17.anInt9124 >> 9) * -219569485;
	}

	public void method5935(Class572_Sub17 class572_sub17, short i) {
		anInt5504 = 1489924707 * class572_sub17.anInt9123;
		localX = 134565511 * (-862367545 * class572_sub17.anInt9126 >> 9);
		localY = (-1661817525 * class572_sub17.anInt9124 >> 9) * -219569485;
	}

	public int hashCode() {
		return method5938(943033351);
	}

	public int method5936() {
		return (anInt5504 * -1080556115 << 28 | localX * -2109597897 << 14 | 417324155 * localY);
	}

	public int method5937() {
		return method5938(662643930);
	}

	public int method5938(int i) {
		return (anInt5504 * -1080556115 << 28 | localX * -2109597897 << 14 | 417324155 * localY);
	}

	static final void method5939(Cs2Executor class441, byte i) {
		UnderlayDefinition underlayDefinition = (((Cs2Executor) class441).aBool5128 ? ((Cs2Executor) class441).aClass443_5112 : ((Cs2Executor) class441).aClass443_5126);
		InterfaceDefinitions class73 = ((UnderlayDefinition) underlayDefinition).aClass73_5135;
		Class83 class83 = ((UnderlayDefinition) underlayDefinition).aClass83_5134;
		Class554.method6556(class73, class83, class441, -887382452);
	}

	static final void method5940(Cs2Executor class441, byte i) {
		String string = "";
		if (Class602.aClipboard7878 != null) {
			Transferable transferable = Class602.aClipboard7878.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null)
						string = "";
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = string;
	}

	static final void method5941(Cs2Executor class441, int i) {
		Class572_Sub17 class572_sub17 = (Class572_Sub17) (((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr -= 1019967701) * 1628307581]);
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = class572_sub17.anInt9127 * -930360273;
	}
}

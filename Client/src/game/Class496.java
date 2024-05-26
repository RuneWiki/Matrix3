package game;

/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.List;

public class Class496 implements Interface58 {
	Class248 aClass248_5493;
	Class470 aClass470_5494 = Class470.aClass470_5277;
	int anInt5495;
	Interface59 anInterface59_5496;
	Class289 aClass289_5497;
	byte[] aByteArray5498;
	boolean aBool5499;
	int anInt5500;
	Class127 aClass127_5501;
	boolean aBool5502;

	public byte[] method347(int i) {
		if (((Class496) this).anInterface59_5496 != null)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		return ((Class496) this).aByteArray5498;
	}

	public void method150(int i) {
		if (Class470.aClass470_5278 == ((Class496) this).aClass470_5494) {
			byte[] is = (((Class496) this).aClass248_5493.method3373(-1650413089 * ((Class496) this).anInt5495, (byte) -3));
			if (is != null) {
				((Class496) this).aByteArray5498 = is;
				method5917((byte) 76);
				((Class496) this).aClass470_5494 = Class470.aClass470_5279;
				if (((Class496) this).anInterface59_5496 != null)
					((Class496) this).anInterface59_5496.method371(this, is.length, -1650413089 * ((Class496) this).anInt5495, false, (byte) -64);
			}
		}
	}

	public void method350(RSByteBuffer class572_sub15, int i) {
		if (null != ((Class496) this).aClass127_5501) {
			if (null != ((Class496) this).anInterface59_5496)
				((Class496) this).anInterface59_5496.method368(this, 16711680);
			if (((Class496) this).aBool5499)
				throw new RuntimeException("");
			synchronized (((Class496) this).aClass127_5501) {
				List list = method5918(2105768503);
				if (list != null) {
					list.add(class572_sub15);
					((Class496) this).anInt5500 += -779863213 * class572_sub15.b.length;
					method5919(list, ((Class496) this).anInt5500 * -1045315365, -551265201);
				}
			}
		}
	}

	public Class470 method323(int i) {
		return ((Class496) this).aClass470_5494;
	}

	public boolean method342(int i) {
		return false;
	}

	public boolean method344() {
		return false;
	}

	public int method349() {
		if (((Class496) this).aByteArray5498 != null)
			return ((Class496) this).aByteArray5498.length;
		return 0;
	}

	public int method360(byte i) {
		if (((Class496) this).aByteArray5498 != null)
			return ((Class496) this).aByteArray5498.length;
		return 0;
	}

	public Class612 method326(byte i) {
		return Class612.aClass612_7978;
	}

	public int method335(byte i) {
		return -1650413089 * ((Class496) this).anInt5495;
	}

	public RSByteBuffer method352(int i) {
		if (((Class496) this).aClass127_5501 == null)
			return null;
		RSByteBuffer class572_sub15 = null;
		if (null != ((Class496) this).anInterface59_5496)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (list.size() > i)
				class572_sub15 = (RSByteBuffer) list.get(i);
		}
		return class572_sub15;
	}

	void method5917(byte i) {
		/* empty */
	}

	public Class496(Class248 class248, int i, Class289 class289, Interface59 interface59, Class127 class127) {
		((Class496) this).aClass248_5493 = class248;
		((Class496) this).anInt5495 = -1914680801 * i;
		((Class496) this).aClass289_5497 = class289;
		((Class496) this).anInterface59_5496 = interface59;
		((Class496) this).aClass127_5501 = class127;
		((Class496) this).aBool5502 = null != ((Class496) this).aClass127_5501;
		((Class496) this).aClass470_5494 = Class470.aClass470_5278;
	}

	public boolean method330(byte i) {
		return (((Class496) this).aClass127_5501 != null && ((Class496) this).aBool5502);
	}

	public int method332(byte i) {
		if (null == ((Class496) this).aClass127_5501)
			return 0;
		int i_0_ = 0;
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (list != null)
				i_0_ = list.size();
		}
		return i_0_;
	}

	public void method333(boolean bool, int i) {
		if (null != ((Class496) this).anInterface59_5496)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		((Class496) this).aBool5499 = bool;
	}

	public boolean method334(short i) {
		if (null == ((Class496) this).aClass127_5501)
			return false;
		List list = method5918(2105768503);
		if (null == list || list.size() <= 0)
			((Class496) this).aBool5499 = false;
		return ((Class496) this).aBool5499;
	}

	public int method364() {
		if (null == ((Class496) this).aClass127_5501)
			return 0;
		int i = 0;
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	List method5918(int i) {
		if (((Class496) this).aClass127_5501 == null || false == ((Class496) this).aBool5502)
			return null;
		Object object = null;
		List list;
		synchronized (((Class496) this).aClass127_5501) {
			list = (List) (((Class496) this).aClass127_5501.method2246((long) (((Class496) this).anInt5495 * -1650413089)));
			if (list == null && ((Class496) this).aBool5502) {
				list = new ArrayList();
				((Class496) this).aClass127_5501.method2230(list, (long) (-1650413089 * ((Class496) this).anInt5495), 0, 1892075614);
			}
		}
		return list;
	}

	public void method129() {
		if (Class470.aClass470_5278 == ((Class496) this).aClass470_5494) {
			byte[] is = (((Class496) this).aClass248_5493.method3373(-1650413089 * ((Class496) this).anInt5495, (byte) 84));
			if (is != null) {
				((Class496) this).aByteArray5498 = is;
				method5917((byte) 37);
				((Class496) this).aClass470_5494 = Class470.aClass470_5279;
				if (((Class496) this).anInterface59_5496 != null)
					((Class496) this).anInterface59_5496.method371(this, is.length, -1650413089 * ((Class496) this).anInt5495, false, (byte) -81);
			}
		}
	}

	public void method358() {
		if (Class470.aClass470_5278 == ((Class496) this).aClass470_5494) {
			byte[] is = (((Class496) this).aClass248_5493.method3373(-1650413089 * ((Class496) this).anInt5495, (byte) 69));
			if (is != null) {
				((Class496) this).aByteArray5498 = is;
				method5917((byte) -77);
				((Class496) this).aClass470_5494 = Class470.aClass470_5279;
				if (((Class496) this).anInterface59_5496 != null)
					((Class496) this).anInterface59_5496.method371(this, is.length, -1650413089 * ((Class496) this).anInt5495, false, (byte) -110);
			}
		}
	}

	public void method336() {
		if (Class470.aClass470_5278 == ((Class496) this).aClass470_5494) {
			byte[] is = (((Class496) this).aClass248_5493.method3373(-1650413089 * ((Class496) this).anInt5495, (byte) 87));
			if (is != null) {
				((Class496) this).aByteArray5498 = is;
				method5917((byte) -45);
				((Class496) this).aClass470_5494 = Class470.aClass470_5279;
				if (((Class496) this).anInterface59_5496 != null)
					((Class496) this).anInterface59_5496.method371(this, is.length, -1650413089 * ((Class496) this).anInt5495, false, (byte) -43);
			}
		}
	}

	public RSByteBuffer method329(int i, int i_1_) {
		if (((Class496) this).aClass127_5501 == null)
			return null;
		RSByteBuffer class572_sub15 = null;
		if (null != ((Class496) this).anInterface59_5496)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (list.size() > i)
				class572_sub15 = (RSByteBuffer) list.get(i);
		}
		return class572_sub15;
	}

	public void method29() {
		if (Class470.aClass470_5278 == ((Class496) this).aClass470_5494) {
			byte[] is = (((Class496) this).aClass248_5493.method3373(-1650413089 * ((Class496) this).anInt5495, (byte) -6));
			if (is != null) {
				((Class496) this).aByteArray5498 = is;
				method5917((byte) -81);
				((Class496) this).aClass470_5494 = Class470.aClass470_5279;
				if (((Class496) this).anInterface59_5496 != null)
					((Class496) this).anInterface59_5496.method371(this, is.length, -1650413089 * ((Class496) this).anInt5495, false, (byte) -79);
			}
		}
	}

	public Class603 method339() {
		Class603 class603 = new Class603(((Class496) this).aClass289_5497);
		class603.method7096(this, (byte) 101);
		return class603;
	}

	public Class603 method337() {
		Class603 class603 = new Class603(((Class496) this).aClass289_5497);
		class603.method7096(this, (byte) 14);
		return class603;
	}

	public Class470 method341() {
		return ((Class496) this).aClass470_5494;
	}

	public void method288() {
		if (Class470.aClass470_5278 == ((Class496) this).aClass470_5494) {
			byte[] is = (((Class496) this).aClass248_5493.method3373(-1650413089 * ((Class496) this).anInt5495, (byte) -73));
			if (is != null) {
				((Class496) this).aByteArray5498 = is;
				method5917((byte) 40);
				((Class496) this).aClass470_5494 = Class470.aClass470_5279;
				if (((Class496) this).anInterface59_5496 != null)
					((Class496) this).anInterface59_5496.method371(this, is.length, -1650413089 * ((Class496) this).anInt5495, false, (byte) -88);
			}
		}
	}

	public byte[] method325(int i, int i_2_) {
		if (((Class496) this).anInterface59_5496 != null)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		return ((Class496) this).aByteArray5498;
	}

	public int method348() {
		if (((Class496) this).aByteArray5498 != null)
			return ((Class496) this).aByteArray5498.length;
		return 0;
	}

	public byte[] method345(int i) {
		if (((Class496) this).anInterface59_5496 != null)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		return ((Class496) this).aByteArray5498;
	}

	public boolean method343() {
		return false;
	}

	public byte[] method338(int i) {
		if (((Class496) this).anInterface59_5496 != null)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		return ((Class496) this).aByteArray5498;
	}

	public boolean method331(int i, int i_3_) {
		if (((Class496) this).aClass127_5501 == null)
			return false;
		boolean bool = false;
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (null != list && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public void method357(RSByteBuffer class572_sub15) {
		if (null != ((Class496) this).aClass127_5501) {
			if (null != ((Class496) this).anInterface59_5496)
				((Class496) this).anInterface59_5496.method368(this, 16711680);
			if (((Class496) this).aBool5499)
				throw new RuntimeException("");
			synchronized (((Class496) this).aClass127_5501) {
				List list = method5918(2105768503);
				if (list != null) {
					list.add(class572_sub15);
					((Class496) this).anInt5500 += -779863213 * class572_sub15.b.length;
					method5919(list, ((Class496) this).anInt5500 * -1045315365, -1868890257);
				}
			}
		}
	}

	void method5919(List list, int i, int i_4_) {
		if (null != ((Class496) this).aClass127_5501 && null != list && i >= 0) {
			synchronized (((Class496) this).aClass127_5501) {
				((Class496) this).aClass127_5501.method2227((long) (-1650413089 * ((Class496) this).anInt5495));
				if (i <= ((Class496) this).aClass127_5501.method2232(-239194599))
					((Class496) this).aClass127_5501.method2230(list, (long) (((Class496) this).anInt5495 * -1650413089), i, 21894081);
				else {
					((Class496) this).aBool5502 = false;
					((Class496) this).aBool5499 = false;
					((Class496) this).anInt5500 = 0;
				}
			}
		}
	}

	public void method351(RSByteBuffer class572_sub15) {
		if (null != ((Class496) this).aClass127_5501) {
			if (null != ((Class496) this).anInterface59_5496)
				((Class496) this).anInterface59_5496.method368(this, 16711680);
			if (((Class496) this).aBool5499)
				throw new RuntimeException("");
			synchronized (((Class496) this).aClass127_5501) {
				List list = method5918(2105768503);
				if (list != null) {
					list.add(class572_sub15);
					((Class496) this).anInt5500 += -779863213 * class572_sub15.b.length;
					method5919(list, ((Class496) this).anInt5500 * -1045315365, -42479476);
				}
			}
		}
	}

	public RSByteBuffer method354(int i) {
		if (((Class496) this).aClass127_5501 == null)
			return null;
		RSByteBuffer class572_sub15 = null;
		if (null != ((Class496) this).anInterface59_5496)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (list.size() > i)
				class572_sub15 = (RSByteBuffer) list.get(i);
		}
		return class572_sub15;
	}

	public Class603 method353(int i) {
		Class603 class603 = new Class603(((Class496) this).aClass289_5497);
		class603.method7096(this, (byte) 86);
		return class603;
	}

	public boolean method340(int i) {
		if (((Class496) this).aClass127_5501 == null)
			return false;
		boolean bool = false;
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (null != list && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method355(int i) {
		if (((Class496) this).aClass127_5501 == null)
			return false;
		boolean bool = false;
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (null != list && list.size() > i)
				bool = list.get(i) != null;
		}
		return bool;
	}

	public boolean method356() {
		return (((Class496) this).aClass127_5501 != null && ((Class496) this).aBool5502);
	}

	public int method328() {
		if (null == ((Class496) this).aClass127_5501)
			return 0;
		int i = 0;
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	public Class470 method365() {
		return ((Class496) this).aClass470_5494;
	}

	public int method359() {
		if (null == ((Class496) this).aClass127_5501)
			return 0;
		int i = 0;
		synchronized (((Class496) this).aClass127_5501) {
			List list = method5918(2105768503);
			if (list != null)
				i = list.size();
		}
		return i;
	}

	public void method324(boolean bool) {
		if (null != ((Class496) this).anInterface59_5496)
			((Class496) this).anInterface59_5496.method368(this, 16711680);
		((Class496) this).aBool5499 = bool;
	}

	public Class612 method327() {
		return Class612.aClass612_7978;
	}

	public boolean method362() {
		if (null == ((Class496) this).aClass127_5501)
			return false;
		List list = method5918(2105768503);
		if (null == list || list.size() <= 0)
			((Class496) this).aBool5499 = false;
		return ((Class496) this).aBool5499;
	}

	public boolean method366() {
		if (null == ((Class496) this).aClass127_5501)
			return false;
		List list = method5918(2105768503);
		if (null == list || list.size() <= 0)
			((Class496) this).aBool5499 = false;
		return ((Class496) this).aBool5499;
	}

	public boolean method363() {
		if (null == ((Class496) this).aClass127_5501)
			return false;
		List list = method5918(2105768503);
		if (null == list || list.size() <= 0)
			((Class496) this).aBool5499 = false;
		return ((Class496) this).aBool5499;
	}

	public int method361() {
		return -1650413089 * ((Class496) this).anInt5495;
	}

	public int method346() {
		return -1650413089 * ((Class496) this).anInt5495;
	}

	static final void method5920(Cs2Executor class441, int i) {
		Class572_Sub12_Sub5 class572_sub12_sub5 = Class654.method7709(1524807139);
		if (class572_sub12_sub5 != null) {
			boolean bool = (class572_sub12_sub5.method10297(Class547.anInt6143 + Class185.anInt2172 * -586790413, Class547.anInt6165 + 1172032773 * Class386.anInt4642, Class439.anIntArray5086, (short) -31153));
			if (bool) {
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = Class439.anIntArray5086[1];
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = Class439.anIntArray5086[2];
			} else {
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = -1;
				((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407) - 1] = -1;
			}
		} else {
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
			((Cs2Executor) class441).intStack[((((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1)] = -1;
		}
	}

	static final void method5921(Cs2Executor class441, byte i) {
		((Cs2Executor) class441).intStack[(((Cs2Executor) class441).intStackPtr += -1042067865) * 1369304407 - 1] = Class213.aClass572_Sub24_2463.aClass665_Sub15_9245.method8970(660014728);
	}

	static final void method5922(int i) {
		int i_5_ = 0;
		Class523 class523 = client.aClass613_8605.method7285(1430996236);
		for (int i_6_ = 0; i_6_ < client.aClass613_8605.method7347(868308003); i_6_++) {
			for (int i_7_ = 0; i_7_ < client.aClass613_8605.method7278(277214477); i_7_++) {
				if (Class406.method4926(class523.aClass536ArrayArrayArray5882, i_5_, i_6_, i_7_, true, (short) 211))
					i_5_++;
				if (i_5_ >= 512)
					return;
			}
		}
	}

	public static void method5923(Class83 class83, InterfaceDefinitions class73, boolean bool, byte i) {
		Class639.method7586(class83.aClass73Array1081, class73, bool, -689865792);
	}

	static int method5924(int i, byte i_8_) {
		LinkableInt class572_sub26 = (LinkableInt) Class491.aClass676_5469.get((long) i);
		if (null == class572_sub26) {
			Class309 class309 = Class491.anInterface37_5475.method212(i, 1500853429);
			if (null == class309 || 2 != -1090340769 * class309.anInt3638)
				return -1;
			class572_sub26 = new LinkableInt(58165719 * Class491.anInt5477);
			Class491.aClass676_5469.put(class572_sub26, (long) i);
			Class491.aClass309Array5476[(Class491.anInt5477 += -781944345) * 58165719 - 1] = class309;
		}
		return class572_sub26.anInt9258 * -1945426987;
	}
}

package game;

/* Class572_Sub12_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Class572_Sub12_Sub16_Sub1 extends Class572_Sub12_Sub16 {
	int anInt11727;
	Future aFuture11728;

	byte[] method10445() {
		do {
			if (((Class572_Sub12_Sub16_Sub1) this).aFuture11728.isDone()) {
				byte[] is;
				try {
					is = ((Class246) ((Class572_Sub12_Sub16_Sub1) this).aFuture11728.get()).method3354((byte) 9);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	void method10621(Future future, int i) {
		((Class572_Sub12_Sub16_Sub1) this).aFuture11728 = future;
	}

	byte[] method10440(byte i) {
		do {
			if (((Class572_Sub12_Sub16_Sub1) this).aFuture11728.isDone()) {
				byte[] is;
				try {
					is = ((Class246) ((Class572_Sub12_Sub16_Sub1) this).aFuture11728.get()).method3354((byte) 9);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	byte[] method10443() {
		do {
			if (((Class572_Sub12_Sub16_Sub1) this).aFuture11728.isDone()) {
				byte[] is;
				try {
					is = ((Class246) ((Class572_Sub12_Sub16_Sub1) this).aFuture11728.get()).method3354((byte) 9);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	byte[] method10442() {
		do {
			if (((Class572_Sub12_Sub16_Sub1) this).aFuture11728.isDone()) {
				byte[] is;
				try {
					is = ((Class246) ((Class572_Sub12_Sub16_Sub1) this).aFuture11728.get()).method3354((byte) 9);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}

	int method10441(int i) {
		if (null == ((Class572_Sub12_Sub16_Sub1) this).aFuture11728)
			return 0;
		return (((Class572_Sub12_Sub16_Sub1) this).aFuture11728.isDone() ? 100 : 0);
	}

	Class572_Sub12_Sub16_Sub1(int i) {
		((Class572_Sub12_Sub16_Sub1) this).anInt11727 = i * -1749058341;
	}

	int method10446() {
		if (null == ((Class572_Sub12_Sub16_Sub1) this).aFuture11728)
			return 0;
		return (((Class572_Sub12_Sub16_Sub1) this).aFuture11728.isDone() ? 100 : 0);
	}

	byte[] method10444() {
		do {
			if (((Class572_Sub12_Sub16_Sub1) this).aFuture11728.isDone()) {
				byte[] is;
				try {
					is = ((Class246) ((Class572_Sub12_Sub16_Sub1) this).aFuture11728.get()).method3354((byte) 9);
				} catch (InterruptedException interruptedexception) {
					interruptedexception.printStackTrace();
					break;
				} catch (ExecutionException executionexception) {
					executionexception.printStackTrace();
					break;
				}
				return is;
			}
		} while (false);
		return null;
	}
}

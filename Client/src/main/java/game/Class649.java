package game;

/* Class649 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class649 {
	RandomAccessFile aRandomAccessFile8366;
	long aLong8367;
	long aLong8368;

	public final void method7664() throws IOException {
		if (((Class649) this).aRandomAccessFile8366 != null) {
			((Class649) this).aRandomAccessFile8366.close();
			((Class649) this).aRandomAccessFile8366 = null;
		}
	}

	public final int method7665(byte[] is, int i, int i_0_, int i_1_) throws IOException {
		int i_2_ = ((Class649) this).aRandomAccessFile8366.read(is, i, i_0_);
		if (i_2_ > 0)
			((Class649) this).aLong8368 += (long) i_2_ * 5130432993119581031L;
		return i_2_;
	}

	public final void method7666(byte[] is, int i, int i_3_) throws IOException {
		if ((long) i_3_ + ((Class649) this).aLong8368 * 4175943072499775575L > ((Class649) this).aLong8367 * 8133798278699948505L) {
			((Class649) this).aRandomAccessFile8366.seek(8133798278699948505L * ((Class649) this).aLong8367);
			((Class649) this).aRandomAccessFile8366.write(1);
			throw new EOFException();
		}
		((Class649) this).aRandomAccessFile8366.write(is, i, i_3_);
		((Class649) this).aLong8368 += (long) i_3_ * 5130432993119581031L;
	}

	public Class649(File file, String string, long l) throws IOException {
		if (l == -1L)
			l = 9223372036854775807L;
		if (file.length() > l)
			file.delete();
		((Class649) this).aRandomAccessFile8366 = new RandomAccessFile(file, string);
		((Class649) this).aLong8367 = l * -1710280957521373591L;
		((Class649) this).aLong8368 = 0L;
		int i = ((Class649) this).aRandomAccessFile8366.read();
		if (i != -1 && !string.equals("r")) {
			((Class649) this).aRandomAccessFile8366.seek(0L);
			((Class649) this).aRandomAccessFile8366.write(i);
		}
		((Class649) this).aRandomAccessFile8366.seek(0L);
	}

	public final long method7667(int i) throws IOException {
		return ((Class649) this).aRandomAccessFile8366.length();
	}

	final void method7668(long l) throws IOException {
		((Class649) this).aRandomAccessFile8366.seek(l);
		((Class649) this).aLong8368 = l * 5130432993119581031L;
	}

	public void finalize() throws Throwable {
		if (((Class649) this).aRandomAccessFile8366 != null) {
			// System.out.println("");
			method7673(1019351040);
		}
	}

	void method7669() throws Throwable {
		if (((Class649) this).aRandomAccessFile8366 != null) {
			// System.out.println("");
			method7673(1303747509);
		}
	}

	final void method7670(long l) throws IOException {
		((Class649) this).aRandomAccessFile8366.seek(l);
		((Class649) this).aLong8368 = l * 5130432993119581031L;
	}

	final void method7671(long l) throws IOException {
		((Class649) this).aRandomAccessFile8366.seek(l);
		((Class649) this).aLong8368 = l * 5130432993119581031L;
	}

	public final void method7672(byte[] is, int i, int i_4_) throws IOException {
		if ((long) i_4_ + ((Class649) this).aLong8368 * 4175943072499775575L > ((Class649) this).aLong8367 * 8133798278699948505L) {
			((Class649) this).aRandomAccessFile8366.seek(8133798278699948505L * ((Class649) this).aLong8367);
			((Class649) this).aRandomAccessFile8366.write(1);
			throw new EOFException();
		}
		((Class649) this).aRandomAccessFile8366.write(is, i, i_4_);
		((Class649) this).aLong8368 += (long) i_4_ * 5130432993119581031L;
	}

	public final void method7673(int i) throws IOException {
		if (((Class649) this).aRandomAccessFile8366 != null) {
			((Class649) this).aRandomAccessFile8366.close();
			((Class649) this).aRandomAccessFile8366 = null;
		}
	}

	public final void method7674(byte[] is, int i, int i_5_, int i_6_) throws IOException {
		if ((long) i_5_ + ((Class649) this).aLong8368 * 4175943072499775575L > ((Class649) this).aLong8367 * 8133798278699948505L) {
			((Class649) this).aRandomAccessFile8366.seek(8133798278699948505L * ((Class649) this).aLong8367);
			((Class649) this).aRandomAccessFile8366.write(1);
			throw new EOFException();
		}
		((Class649) this).aRandomAccessFile8366.write(is, i, i_5_);
		((Class649) this).aLong8368 += (long) i_5_ * 5130432993119581031L;
	}

	public final void method7675() throws IOException {
		if (((Class649) this).aRandomAccessFile8366 != null) {
			((Class649) this).aRandomAccessFile8366.close();
			((Class649) this).aRandomAccessFile8366 = null;
		}
	}

	public final int method7676(byte[] is, int i, int i_7_) throws IOException {
		int i_8_ = ((Class649) this).aRandomAccessFile8366.read(is, i, i_7_);
		if (i_8_ > 0)
			((Class649) this).aLong8368 += (long) i_8_ * 5130432993119581031L;
		return i_8_;
	}

	public static boolean method7677(int i, int i_9_) {
		return 1 != i && 7 != i;
	}

	public static int method7678(byte i) {
		return Class572_Sub2.aTwitchTV8969.GetChatState();
	}
}

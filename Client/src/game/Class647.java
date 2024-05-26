package game;

/* Class647 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class647 {
	public Object anObject8324;
	public Object anObject8325;

	public int method7649() {
		int i = 0;
		if (anObject8324 != null)
			i += anObject8324.hashCode();
		if (anObject8325 != null)
			i += 31 * anObject8325.hashCode();
		return i;
	}

	public Class647(Object object, Object object_0_) {
		anObject8324 = object;
		anObject8325 = object_0_;
	}

	public boolean equals(Object object) {
		if (object == null || !(object instanceof Class647))
			return false;
		Class647 class647_1_ = (Class647) object;
		if (anObject8324 == null) {
			if (class647_1_.anObject8324 != null)
				return false;
		} else if (!anObject8324.equals(class647_1_.anObject8324))
			return false;
		if (anObject8325 == null) {
			if (class647_1_.anObject8325 != null)
				return false;
		} else if (!anObject8325.equals(class647_1_.anObject8325))
			return false;
		return true;
	}

	public int hashCode() {
		int i = 0;
		if (anObject8324 != null)
			i += anObject8324.hashCode();
		if (anObject8325 != null)
			i += 31 * anObject8325.hashCode();
		return i;
	}

	public int method7650() {
		int i = 0;
		if (anObject8324 != null)
			i += anObject8324.hashCode();
		if (anObject8325 != null)
			i += 31 * anObject8325.hashCode();
		return i;
	}

	public int method7651() {
		int i = 0;
		if (anObject8324 != null)
			i += anObject8324.hashCode();
		if (anObject8325 != null)
			i += 31 * anObject8325.hashCode();
		return i;
	}

	public boolean method7652(Object object) {
		if (object == null || !(object instanceof Class647))
			return false;
		Class647 class647_2_ = (Class647) object;
		if (anObject8324 == null) {
			if (class647_2_.anObject8324 != null)
				return false;
		} else if (!anObject8324.equals(class647_2_.anObject8324))
			return false;
		if (anObject8325 == null) {
			if (class647_2_.anObject8325 != null)
				return false;
		} else if (!anObject8325.equals(class647_2_.anObject8325))
			return false;
		return true;
	}

	public String toString() {
		return new StringBuilder().append(anObject8324).append(", ").append(anObject8325).toString();
	}

	public String method7653() {
		return new StringBuilder().append(anObject8324).append(", ").append(anObject8325).toString();
	}

	public String method7654() {
		return new StringBuilder().append(anObject8324).append(", ").append(anObject8325).toString();
	}

	public boolean method7655(Object object) {
		if (object == null || !(object instanceof Class647))
			return false;
		Class647 class647_3_ = (Class647) object;
		if (anObject8324 == null) {
			if (class647_3_.anObject8324 != null)
				return false;
		} else if (!anObject8324.equals(class647_3_.anObject8324))
			return false;
		if (anObject8325 == null) {
			if (class647_3_.anObject8325 != null)
				return false;
		} else if (!anObject8325.equals(class647_3_.anObject8325))
			return false;
		return true;
	}
}

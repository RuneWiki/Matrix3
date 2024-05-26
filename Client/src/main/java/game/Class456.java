package game;

/* Class456 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class456 {
	boolean aBool5188;
	Class238 aClass238_5189 = new Class238();
	Class238 aClass238_5190;
	Class238 aClass238_5191 = new Class238();
	boolean aBool5192 = true;
	Class261 aClass261_5193;
	boolean aBool5194;
	protected boolean aBool5195;
	Class456 aClass456_5196;
	Class456 aClass456_5197;
	Class456 aClass456_5198;

	final void method5390() {
		((Class456) this).aBool5192 = true;
		((Class456) this).aBool5188 = true;
		((Class456) this).aBool5194 = true;
		aBool5195 = true;
	}

	final Class238 method5391() {
		if (((Class456) this).aBool5188) {
			((Class456) this).aBool5188 = false;
			((Class456) this).aClass238_5190.method3244(method5394());
			((Class456) this).aClass238_5190.method3245();
		}
		return ((Class456) this).aClass238_5191;
	}

	final Class261 method5392() {
		if (((Class456) this).aBool5194) {
			((Class456) this).aBool5194 = false;
			((Class456) this).aClass261_5193.method3569(method5394());
		}
		return ((Class456) this).aClass261_5193;
	}

	final void method5393(Class238 class238) {
		((Class456) this).aClass238_5189.method3244(class238);
		method5397();
		if (((Class456) this).aClass456_5197 != null)
			((Class456) this).aClass456_5197.method5398();
	}

	public final Class238 method5394() {
		if (((Class456) this).aBool5192) {
			((Class456) this).aBool5192 = false;
			((Class456) this).aClass238_5191.method3244(((Class456) this).aClass238_5189);
			if (((Class456) this).aClass456_5196 != null)
				((Class456) this).aClass238_5191.method3246(((Class456) this).aClass456_5196.method5394());
		}
		return ((Class456) this).aClass238_5191;
	}

	public final void method5395(float f, float f_0_, float f_1_) {
		((Class456) this).aClass238_5189.aClass240_2647.method3268(f, f_0_, f_1_);
		method5397();
		if (((Class456) this).aClass456_5197 != null)
			((Class456) this).aClass456_5197.method5398();
	}

	public final void method5396() {
		if (((Class456) this).aClass456_5196 != null) {
			Class456 class456_2_ = ((Class456) ((Class456) this).aClass456_5196).aClass456_5197;
			if (class456_2_ == this)
				((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5198;
			else {
				for (/**/; ((Class456) class456_2_).aClass456_5198 != this; class456_2_ = ((Class456) class456_2_).aClass456_5198) {
					/* empty */
				}
				((Class456) class456_2_).aClass456_5198 = ((Class456) this).aClass456_5198;
			}
		}
		method5397();
		if (((Class456) this).aClass456_5197 != null) {
			((Class456) this).aClass456_5197.method5398();
			Class456 class456_3_ = ((Class456) this).aClass456_5197;
			for (;;) {
				((Class456) class456_3_).aClass238_5189.method3246(((Class456) this).aClass238_5189);
				((Class456) class456_3_).aClass456_5196 = ((Class456) this).aClass456_5196;
				if (((Class456) class456_3_).aClass456_5198 == null) {
					((Class456) class456_3_).aClass456_5198 = (((Class456) ((Class456) this).aClass456_5196).aClass456_5197);
					break;
				}
				class456_3_ = ((Class456) class456_3_).aClass456_5198;
			}
			((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5197;
		}
		((Class456) this).aClass456_5196 = null;
		((Class456) this).aClass456_5198 = null;
		((Class456) this).aClass456_5197 = null;
	}

	final void method5397() {
		((Class456) this).aBool5192 = true;
		((Class456) this).aBool5188 = true;
		((Class456) this).aBool5194 = true;
		aBool5195 = true;
	}

	final void method5398() {
		method5397();
		if (((Class456) this).aClass456_5197 != null)
			((Class456) this).aClass456_5197.method5398();
		if (((Class456) this).aClass456_5198 != null)
			((Class456) this).aClass456_5198.method5398();
	}

	final void method5399() {
		((Class456) this).aBool5192 = true;
		((Class456) this).aBool5188 = true;
		((Class456) this).aBool5194 = true;
		aBool5195 = true;
	}

	public final Class238 method5400() {
		return ((Class456) this).aClass238_5189;
	}

	public final void method5401(Class240 class240) {
		((Class456) this).aClass238_5189.aClass240_2647.method3269(class240);
		method5397();
		if (((Class456) this).aClass456_5197 != null)
			((Class456) this).aClass456_5197.method5398();
	}

	final void method5402(Class238 class238) {
		if (((Class456) this).aClass456_5196 != null) {
			Class238 class238_4_ = new Class238(class238);
			class238_4_.method3246(((Class456) this).aClass456_5196.method5391());
			method5393(class238_4_);
		} else
			method5393(class238);
	}

	public final void method5403() {
		if (((Class456) this).aClass456_5196 != null) {
			Class456 class456_5_ = ((Class456) ((Class456) this).aClass456_5196).aClass456_5197;
			if (class456_5_ == this)
				((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5198;
			else {
				for (/**/; ((Class456) class456_5_).aClass456_5198 != this; class456_5_ = ((Class456) class456_5_).aClass456_5198) {
					/* empty */
				}
				((Class456) class456_5_).aClass456_5198 = ((Class456) this).aClass456_5198;
			}
		}
		method5397();
		if (((Class456) this).aClass456_5197 != null) {
			((Class456) this).aClass456_5197.method5398();
			Class456 class456_6_ = ((Class456) this).aClass456_5197;
			for (;;) {
				((Class456) class456_6_).aClass238_5189.method3246(((Class456) this).aClass238_5189);
				((Class456) class456_6_).aClass456_5196 = ((Class456) this).aClass456_5196;
				if (((Class456) class456_6_).aClass456_5198 == null) {
					((Class456) class456_6_).aClass456_5198 = (((Class456) ((Class456) this).aClass456_5196).aClass456_5197);
					break;
				}
				class456_6_ = ((Class456) class456_6_).aClass456_5198;
			}
			((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5197;
		}
		((Class456) this).aClass456_5196 = null;
		((Class456) this).aClass456_5198 = null;
		((Class456) this).aClass456_5197 = null;
	}

	Class456() {
		((Class456) this).aClass238_5190 = new Class238();
		((Class456) this).aBool5188 = true;
		new Class250();
		new Class250();
		((Class456) this).aClass261_5193 = new Class261();
		((Class456) this).aBool5194 = true;
		aBool5195 = true;
		((Class456) this).aClass456_5196 = null;
		((Class456) this).aClass456_5197 = null;
		((Class456) this).aClass456_5198 = null;
	}

	public final void method5404(Class230 class230) {
		((Class456) this).aClass238_5189.aClass230_2648.method3170(class230);
		method5397();
		if (((Class456) this).aClass456_5197 != null)
			((Class456) this).aClass456_5197.method5398();
	}

	final void method5405() {
		((Class456) this).aBool5192 = true;
		((Class456) this).aBool5188 = true;
		((Class456) this).aBool5194 = true;
		aBool5195 = true;
	}

	final void method5406() {
		((Class456) this).aBool5192 = true;
		((Class456) this).aBool5188 = true;
		((Class456) this).aBool5194 = true;
		aBool5195 = true;
	}

	final void method5407() {
		method5397();
		if (((Class456) this).aClass456_5197 != null)
			((Class456) this).aClass456_5197.method5398();
		if (((Class456) this).aClass456_5198 != null)
			((Class456) this).aClass456_5198.method5398();
	}

	public final void method5408() {
		if (((Class456) this).aClass456_5196 != null) {
			Class456 class456_7_ = ((Class456) ((Class456) this).aClass456_5196).aClass456_5197;
			if (class456_7_ == this)
				((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5198;
			else {
				for (/**/; ((Class456) class456_7_).aClass456_5198 != this; class456_7_ = ((Class456) class456_7_).aClass456_5198) {
					/* empty */
				}
				((Class456) class456_7_).aClass456_5198 = ((Class456) this).aClass456_5198;
			}
		}
		method5397();
		if (((Class456) this).aClass456_5197 != null) {
			((Class456) this).aClass456_5197.method5398();
			Class456 class456_8_ = ((Class456) this).aClass456_5197;
			for (;;) {
				((Class456) class456_8_).aClass238_5189.method3246(((Class456) this).aClass238_5189);
				((Class456) class456_8_).aClass456_5196 = ((Class456) this).aClass456_5196;
				if (((Class456) class456_8_).aClass456_5198 == null) {
					((Class456) class456_8_).aClass456_5198 = (((Class456) ((Class456) this).aClass456_5196).aClass456_5197);
					break;
				}
				class456_8_ = ((Class456) class456_8_).aClass456_5198;
			}
			((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5197;
		}
		((Class456) this).aClass456_5196 = null;
		((Class456) this).aClass456_5198 = null;
		((Class456) this).aClass456_5197 = null;
	}

	public final void method5409() {
		if (((Class456) this).aClass456_5196 != null) {
			Class456 class456_9_ = ((Class456) ((Class456) this).aClass456_5196).aClass456_5197;
			if (class456_9_ == this)
				((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5198;
			else {
				for (/**/; ((Class456) class456_9_).aClass456_5198 != this; class456_9_ = ((Class456) class456_9_).aClass456_5198) {
					/* empty */
				}
				((Class456) class456_9_).aClass456_5198 = ((Class456) this).aClass456_5198;
			}
		}
		method5397();
		if (((Class456) this).aClass456_5197 != null) {
			((Class456) this).aClass456_5197.method5398();
			Class456 class456_10_ = ((Class456) this).aClass456_5197;
			for (;;) {
				((Class456) class456_10_).aClass238_5189.method3246(((Class456) this).aClass238_5189);
				((Class456) class456_10_).aClass456_5196 = ((Class456) this).aClass456_5196;
				if (((Class456) class456_10_).aClass456_5198 == null) {
					((Class456) class456_10_).aClass456_5198 = (((Class456) ((Class456) this).aClass456_5196).aClass456_5197);
					break;
				}
				class456_10_ = ((Class456) class456_10_).aClass456_5198;
			}
			((Class456) ((Class456) this).aClass456_5196).aClass456_5197 = ((Class456) this).aClass456_5197;
		}
		((Class456) this).aClass456_5196 = null;
		((Class456) this).aClass456_5198 = null;
		((Class456) this).aClass456_5197 = null;
	}
}

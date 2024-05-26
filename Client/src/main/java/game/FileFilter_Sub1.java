package game;

/* FileFilter_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter {
	Class189 aClass189_9528;
	Class189 this$0;

	public String method8887() {
		return null;
	}

	public boolean accept(File file) {
		if (((FileFilter_Sub1) this).aClass189_9528.method2858(-215028921) && file.isDirectory())
			return true;
		if (!((FileFilter_Sub1) this).aClass189_9528.method2858(1505396882))
			return true;
		return false;
	}

	public String getDescription() {
		return null;
	}

	FileFilter_Sub1(Class189 class189, Class189 class189_0_) {
		((FileFilter_Sub1) this).this$0 = class189;
		((FileFilter_Sub1) this).aClass189_9528 = class189_0_;
	}

	static void method8888(Cs2Executor class441, int i) {
		((Cs2Executor) class441).objectStack[(((Cs2Executor) class441).objectStackPtr += 1019967701) * 1628307581 - 1] = (((Class386) (Class300.aClass635_Sub2_3488.getDefinition((((Cs2Executor) class441).intStack[1369304407 * ((Cs2Executor) class441).intStackPtr - 2]), -1699461339))).aStringArray4638[(((Cs2Executor) class441).intStack[((Cs2Executor) class441).intStackPtr * 1369304407 - 1])]);
		((Cs2Executor) class441).intStackPtr -= -2084135730;
	}
}

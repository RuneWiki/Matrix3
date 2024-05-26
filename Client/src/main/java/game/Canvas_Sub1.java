package game;

/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class Canvas_Sub1 extends Canvas {
	Component aComponent11524;

	public final void method10473(Graphics graphics) {
		((Canvas_Sub1) this).aComponent11524.update(graphics);
	}

	Canvas_Sub1(Component component) {
		((Canvas_Sub1) this).aComponent11524 = component;
	}

	public final void paint(Graphics graphics) {
		((Canvas_Sub1) this).aComponent11524.paint(graphics);
	}

	public final void update(Graphics graphics) {
		((Canvas_Sub1) this).aComponent11524.update(graphics);
	}

	public final void method10474(Graphics graphics) {
		((Canvas_Sub1) this).aComponent11524.paint(graphics);
	}
}

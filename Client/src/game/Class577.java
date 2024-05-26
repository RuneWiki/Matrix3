package game;

/* Class577 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class577 {
	Robot aRobot7667;

	public void movemouse(int i, int i_0_) {
		((Class577) this).aRobot7667.mouseMove(i, i_0_);
	}

	public Class577() throws Exception {
		((Class577) this).aRobot7667 = new Robot();
	}

	public void setcustomcursor(Component component, int[] is, int i, int i_1_, Point point) {
		if (is != null) {
			BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
			bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
			component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
		} else
			component.setCursor(null);
	}
}

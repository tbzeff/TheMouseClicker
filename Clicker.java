
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class Clicker {

	private Robot robot = null;
	
	Clicker() {
		try {
			robot = new Robot();
		} catch (AWTException ex) {
			ex.printStackTrace();
		}
	}
	
	public void click()
	{
		robot.delay(3);
		robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
	}
	
	public void moveRobot(int x, int y) {
		robot.mouseMove(x, y);
	}

	public Point getLocation() {
		return MouseInfo.getPointerInfo().getLocation();
	}
}

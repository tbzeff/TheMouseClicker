import java.awt.*;
import javax.swing.*;

public class ClickFrame extends JFrame {
    
    public ClickFrame() {
        super("TranslucentWindow");
        setLayout(new GridBagLayout());

        setSize(100, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Point getCenter() {
        
        Point screenLoc = this.getLocationOnScreen();
        int centerX = screenLoc.x + 50;
        int centerY = screenLoc.y + 50;

        return new Point(centerX, centerY);
    }
}

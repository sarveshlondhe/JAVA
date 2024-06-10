import java.awt.Graphics;
import java.applet.*;

public class ShapesPanel extends Applet {
   
   public void paint(Graphics g) {
        
        // Drawing a cone
        g.drawLine(100, 100, 120, 150); // Left side of cone
        g.drawLine(140, 100, 120, 150); // Right side of cone
        g.drawOval(100, 100, 40, 20);   // Base of cone

        // Drawing a cylinder
        g.drawOval(200, 100, 40, 20);   // Top circle of cylinder
        g.drawOval(200, 140, 40, 20);   // Bottom circle of cylinder
        g.drawLine(200, 110, 200, 150); // Left side of cylinder
        g.drawLine(240, 110, 240, 150); // Right side of cylinder
    }
}

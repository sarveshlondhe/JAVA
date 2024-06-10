import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class ShapeApplet extends Applet {

    public void paint(Graphics g) {
        // Draw a cone
        g.setColor(Color.RED);
        g.drawLine(50, 50, 75, 100); // Left side of cone
        g.drawLine(100, 50, 75, 100); // Right side of cone
        g.drawOval(50, 45, 50, 10);   // Base of cone

        // Draw a cylinder
        g.setColor(Color.BLUE);
        g.drawOval(150, 50, 50, 10);   // Top circle of cylinder
        g.drawOval(150, 90, 50, 10);   // Bottom circle of cylinder
        g.drawLine(150, 55, 150, 95); // Left side of cylinder
        g.drawLine(200, 55, 200, 95); // Right side of cylinder

        // Draw a cube
        g.setColor(Color.GREEN);
        g.drawRect(250, 50, 50, 50);    // Front face of cube
        g.drawRect(275, 75, 50, 50);    // Back face of cube
        g.drawLine(250, 50, 275, 75);  // Connecting lines
        g.drawLine(300, 50, 325, 75);
        g.drawLine(250, 100, 275, 125);
        g.drawLine(300, 100, 325, 125);
    }
}

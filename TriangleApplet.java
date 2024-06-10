import java.awt.*;
import java.applet.*;

public class TriangleApplet extends Applet {

    public void paint(Graphics g) {
        // Set color to red
        g.setColor(Color.RED);

        // Define triangle vertices
        int x1 = 100;
        int y1 = 300;
        int x2 = 300;
        int y2 = 300;
        int x3 = 200;
        int y3 = 100;

        // Draw lines connecting vertices to form triangle
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}
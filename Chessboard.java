// import java.applet.*;
// import java.awt.*;

//  public  class LoopApplet extends Applet {
    
//     public void paint(Graphics g) {
//         // Draw 10 circles with different radii
//         int x = 50;
//         int y = 50;
//         int radius = 10;
//         for (int i = 0; i < 10; i++) {
//             g.drawOval(x, y, radius, radius);
//             x += 20; // Move right for the next circle
//             radius += 5; // Increase radius for the next circle
//         }
        
        
//     }
// }
import java.applet.*;
import java.awt.*;

   public class Chessboard extends Applet {
    public void paint(Graphics g) {
        int row, col, x, y;

        // Set the size of the applet window
        setSize(400, 400);

        // Draw the chessboard
        for (row = 0; row < 8; row++) {
            for (col = 0; col < 8; col++) {
                x = col * 50;
                y = row * 50;

                // Alternate between black and white squares
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }

                // Draw the square
                g.fillRect(x, y, 50, 50);
            }
        }
    }
}

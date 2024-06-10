import java.awt.*; 
import java.applet.*; 
public class triangle extends Applet 
{ 
public void paint(Graphics g) 
{ 
g.setColor(Color.red); 
g.fillArc(10,60,60,60,180,180); 
g.setColor(Color.blue); 
g.drawString("Hello Third year Students",100,100); 
} 
}
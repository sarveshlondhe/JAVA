import java.applet.*;
import java.awt.*;

 public class new2 extends Applet
{

	public void paint(Graphics g)

	{
		//g.drawString("Hello World",50,100);
		//g.drawLine(34, 56, 89, 90);
		// g.drawRect(50,50,45,75);
		// g.setColor((Color.RED));
		// g.fillRect(60,60,89,89);
		// g.drawPolygon();
		int xPoints []  = {100,200,300,250,150};
		int yPoints []  = {100,50,100,200,200};
		g.drawString("HI SARVESH", 200, 300);
		int nPoints=5;
		g.fillPolygon(xPoints,yPoints,nPoints);
	}
}
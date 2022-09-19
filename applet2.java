import java.awt.*;
import java.applet.*;

/*<applet code="applet2.class" width=300 height=300></applet>*/
public class applet2 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(10,10,50,50);
		
		
		g.setColor(Color.green);
		g.drawOval(100,100,75,75);
		
		g.setColor(Color.BLUE);
		g.fillOval(190,10,90,30);
		g.drawOval(70,90,140,100);
		g.drawOval(150,250,100,250);
	}
}
import java.awt.*;
import java.applet.Applet;

/*<applet code="applet1.class" width=700 height=500></applet>*/
public class applet1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,100,100);
		g.drawLine(50,100,100,0);
		g.drawLine(70,25,250,180);
		g.drawLine(105,80,400,450);
	}
}
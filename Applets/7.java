//Create an applet in Java to draw a 4 concentric circles.

import java.applet.*;
import java.awt.*;
public class pro7 extends Applet
{
    //Initialize the applet
    public void init()
    {
	setBackground(Color.yellow);
    }
    //Draw cocentric circle
    public void paint(Graphics g)
    {
	g.setColor(Color.red);
	int rad=25;
	int dia=50;
	for(int i=0;i<4;i++)
	{
	    g.drawOval(250-(i*rad),250-(i*rad),(i+1)*dia,(i+1)*dia);
	}
    }
}
/*
<applet code = pro7 width=500 height=500>
</applet>
*/
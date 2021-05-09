import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "InnerClassDemo.class" width = "320" height = "120">
   </applet>
*/
public class InnerClassDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter());
	}
	class MyMouseAdapter extends MouseAdapter
	{
		public void mousePressed(MouseEvent me)
		{
			showStatus("Mouse pressed");
		}
	}
}

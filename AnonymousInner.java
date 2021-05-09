import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code = "AnonymousInner.class" width = "320" height = "120">
   </applet>
*/
public class AnonymousInner extends Applet
{
	public void init(){
		addMouseListener(new MyMouseAdapter(this));
	}
	class MyMouseAdapter extends MouseAdapter
	{
		AnonymousInner mousePressedDemo;
		public MyMouseAdapter(AnonymousInner mousePressedDemo)
		{
			this.mousePressedDemo = mousePressedDemo;
		}
		public void mousePressed(MouseEvent me)
		{
			mousePressedDemo.showStatus("Mouse Pressed");
		}
	}
}
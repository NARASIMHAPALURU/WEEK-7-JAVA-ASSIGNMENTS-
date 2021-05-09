/* Create an AWT GUI application(Called AWTCounter).Each time the count button is clicked,the counter value shall be increased by 1. */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AWTCounter1 extends JFrame implements ActionListener
{
	JLabel l;JTextField tf;JButton b;
	public AWTCounter1()
	{
		l = new JLabel("Counter");
		tf = new JTextField();
		b = new JButton("Count");
		b.addActionListener(this);
		tf.addActionListener(this);
		setLayout(new GridLayout(1,3));
		add(l);add(tf);add(b);
	}
	int count1 = 0;
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("Count"))
		{
			count1= count1+1;
			tf.setText(Integer.toString(count1));
		}
	}
	public static void main(String [] args)
	{
		AWTCounter1 ac = new AWTCounter1();
		ac.setSize(220,320);
		ac.setVisible(true);
	}
}
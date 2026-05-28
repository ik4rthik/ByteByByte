import javax.swing.*;
import java.awt.*;
import java.awt.events.*;
class test implements ActionListener
{
	JLabel u,p,l3;
	JTextField t1,t2;
	JButton b1,b2;
	test()
	{
		JFrame f = new JFrame("login");
		u = new JLabel("enter username");
		p = new JLabel("enter password");
		l3 = new JLabel("username enetered");
		t1 = new JTextField(16);
		t2 = new JTextField(16);
		b1 = new JButton("confirm");
		b2 = new JButton("cancel");
		JPanel p = new JPanel(new GridLayout(3,1));
		p.add(u);
		p.add(t1);
		p.add(p);
		p.add(t2);
		p.add(b1);
		p.add(b2);
		p.add(l3);
		b1.addActionListener(this);
		f.add(p);
		f.setSize(1280, 720);
		f.show();
	}

	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("submit"))
		{
			u.setText(t1.getText());
			t1.setText(" ");
			p.setText(t2.getText());
			t2.setText(" ");
		}
	}
	public static void main(String[] args)
	{
		test t = new test();
	}
		
}







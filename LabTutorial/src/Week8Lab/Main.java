package Week8Lab;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JFrame;

public class Main {
	public static void main (String[] args) {
		new Main();
	}
	
	private JFrame x;
	private Panel c, s;
	private Checkbox r, g, b;
	
	public Main () {
		x = new JFrame("Color");
		x.setSize(500, 300);
		x.setLocation(1000, 200);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = new Panel();
		c.setBackground(Color.black);
		x.add(c, BorderLayout.CENTER);
		
		r = new Checkbox("RED");
		g = new Checkbox("GREEN");
		b = new Checkbox("BLUE");
		
		s = new Panel();
		s.add(r);
		s.add(g);
		s.add(b);
		x.add(s, BorderLayout.SOUTH);
		
		r.addItemListener(new Sample(this));
		g.addItemListener(new Sample(this));
		b.addItemListener(new Sample(this));
				
		x.setVisible(true);
	}
	
	public Checkbox getRed() {
		return r;
	}
	
	public Checkbox getGreen() {
		return g;
	}
	
	public Checkbox getBlue() {
		return b;
	}
	
	public Panel getPanel() {
		return c;
	}
}


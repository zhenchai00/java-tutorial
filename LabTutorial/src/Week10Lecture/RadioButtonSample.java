package Week10Lecture;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonSample implements ActionListener{
	public static void main (String[] args) {
		new RadioButtonSample();
	}
	
	private JFrame x;
	private Label y;
	private JRadioButton m, f;
	private Panel z;
	private ButtonGroup w;
	
	public RadioButtonSample () {
		x = new JFrame();
		x.setSize(500, 300);
		x.setLocation(1000, 200);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		y = new Label("Select your gender", Label.CENTER);
		y.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 30));
		x.add(y, BorderLayout.CENTER);
		
		m = new JRadioButton("MALE");
		f = new JRadioButton("FEMALE");
		m.addActionListener(this);
		f.addActionListener(this);
		
		w = new ButtonGroup();
		w.add(m);
		w.add(f);
		
		z = new Panel();
		z.setBackground(Color.blue);
		z.add(m);
		z.add(f);
		x.add(z, BorderLayout.SOUTH);
		
		x.setVisible(true);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == m) {
			y.setText("You are man!");
		} else if (e.getSource() == f) {
			y.setText("You are woman!");
		}
	}
}

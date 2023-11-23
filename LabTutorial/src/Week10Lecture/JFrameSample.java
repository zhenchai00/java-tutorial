package Week10Lecture;

import javax.swing.JFrame;

public class JFrameSample extends JFrame {
	public static void main(String[] args) {
		new JFrameSample();
	}
	
	public JFrameSample() {
		setSize(500, 300);
		setLocation(1000, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

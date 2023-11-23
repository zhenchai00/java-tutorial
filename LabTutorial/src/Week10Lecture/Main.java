package Week10Lecture;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class Main implements MouseListener, MouseMotionListener{
	public static void main(String[] args) {
		new Main();
	}
	
	private JFrame x;
	
	public Main () {
		x = new JFrame();
		x.setSize(500, 300);
		x.setLocation(1000, 200);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.addMouseListener(this);
		x.addMouseMotionListener(this);
		x.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent me) {
		System.out.println("Clicked\nX: " + me.getX() + " Y: " + me.getY());
	}
	
	@Override
	public void mouseEntered(MouseEvent me) {
		System.out.println("Mouse get into the frame");
	}

	@Override
	public void mousePressed(MouseEvent me) {
		System.out.println("Mouse pressed into frame");
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		System.out.println("Mouse released from the frame");
	}

	@Override
	public void mouseExited(MouseEvent me) {
		System.out.println("Mouse exit from the frame");
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		System.out.println("Dragged\nX: " + me.getX() + " Y: " + me.getY());
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		System.out.println("Moved\nX: " + me.getX() + " Y: " + me.getY());
	}
}

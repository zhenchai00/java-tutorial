package Week8Lab;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Sample implements ItemListener {
	private Main gui;
	
	public Sample (Main x) {
		gui = x;
	}
	
	public void itemStateChanged (ItemEvent event) {
		int r = 0, g = 0, b = 0;
		
		if (gui.getRed().getState()) {
			r = 255;
		}
		
		if (gui.getGreen().getState()) {
			g = 255;
		}
		
		if (gui.getBlue().getState()) {
			b = 255;
		}
		
		gui.getPanel().setBackground(new Color(r,g,b));
	}
}

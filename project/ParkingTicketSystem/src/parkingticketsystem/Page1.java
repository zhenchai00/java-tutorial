package parkingticketsystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * The initial page
 */
public class Page1 implements ActionListener{
	private JFrame homepage;
	private Button register, login, stop;
	
	public Page1(){
		// initialize jrame for frontend
		homepage = new JFrame("HomePage");
		homepage.setSize(300, 100);
		homepage.setLocation(700, 300); // default from top left
		
		// create button
		register = new Button("Register");
		login = new Button("Login");
		stop = new Button("Stop");
		
		// create event listenenr
		stop.addActionListener(this); // "this" means current object
		
		// set layout of the jframe and add button into it
		homepage.setLayout(new FlowLayout()); // will let the component to set the width and height 
		homepage.add(register);
		homepage.add(login);
		homepage.add(stop);
		
		homepage.setVisible(true); // by default all jframe are invisible	
	}
	
	/**
	 * This method is already imported from the ActionEvent and ActionListenetr packages
	 * when clicked the button, it will call this methods
	 * @param e 
	 */
	public void actionPerformed(ActionEvent e){
		try {
			if(e.getSource() == stop){
				String input = JOptionPane.showInputDialog("Enter admin password:");
				if(!input.equals("12345")){
					throw new Exception("Input wrong admin password");
				}
				DataIO.write();
				System.exit(0);
			}else if (e.getSource() == register){
				
			}else if (e.getSource() == login){
				
			}
		}catch(Exception x){
			JOptionPane.showMessageDialog(homepage, "Invalid input! Try Again!");
		}
	}
}

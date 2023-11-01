package parkingticketsystem;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Page3 implements ActionListener {
	private JFrame paymentPage;
	private Label label;
	private TextField textField;
	
	private int charge;
	private int amount;
	
	public JFrame getPaymentPage(){
		return paymentPage;
	}

	public void setValue(int x){
		charge = x;
		amount = x;
	}
	
	public Label getLabel(){
		return label;
	}
	
	public Page3(){
		paymentPage = new JFrame("Payment Page");
		paymentPage.setSize(350, 140);
		paymentPage.setLocation(700, 100);
		paymentPage.setLayout(new FlowLayout());

		label = new Label("You need to pay RM ???", Label.CENTER);
		label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		paymentPage.add(label);
		
		textField = new TextField(40);
		textField.addActionListener(this);
		paymentPage.add(textField);
	}
	
	public void actionPerformed(ActionEvent event){
		try {
			String input = textField.getText();
			label.setText("");
			int payment = Integer.parseInt(input);
			if (payment <= 0) {
				throw new Exception();
			} else if (payment < amount) {
				amount = amount - payment; 
				label.setText("You need to pay RM " + amount + "!");
				JOptionPane.showMessageDialog(textField, "You need to make full payment!");
			} else {
				JOptionPane.showMessageDialog(textField, "Your change is RM " + (payment - amount) + "!");
				int size = ParkingTicketSystem.loginUser.getMyTickets().size();
				ParkingTicketSystem.loginUser.getMyTickets().get(size - 1).setCharge(charge);
				DataIO.write();
				ParkingTicketSystem.loginUser = null;
				paymentPage.setVisible(false);
				ParkingTicketSystem.first.getHomepage().setVisible(true);
			}
		} catch (Exception x) {
			JOptionPane.showMessageDialog(paymentPage, "Invalid Input! Try again.");
		}
	}
}

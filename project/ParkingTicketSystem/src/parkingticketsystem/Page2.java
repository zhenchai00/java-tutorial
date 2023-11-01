package parkingticketsystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Page2 implements ActionListener{
	private JFrame myPage;

	public JFrame getMyPage() {
		return myPage;
	}

	private Button enter, exit, logout;
	
	public Page2(){
		myPage = new JFrame("My Page");
		myPage.setSize(300, 100);
		myPage.setLocation(700, 500);
		myPage.setLayout(new FlowLayout());
		
		enter = new Button("Enter");
		exit = new Button("Exit");
		logout = new Button("Logout");
		
		enter.addActionListener(this);
		exit.addActionListener(this);
		logout.addActionListener(this);
		
		myPage.add(enter);
		myPage.add(exit);
		myPage.add(logout);
	}
	
	public void actionPerformed(ActionEvent e){
		try{
			if (e.getSource() == logout) {
				ParkingTicketSystem.loginUser = null;
				myPage.setVisible(false);
				ParkingTicketSystem.first.getHomepage().setVisible(true);
			}else if(e.getSource() == enter){
				int size = ParkingTicketSystem.loginUser.getMyTickets().size();
				if (size > 0
						&& ParkingTicketSystem.loginUser.getMyTickets().get(size - 1).getCharge() == 0) {
					throw new Exception();
				}
				
				int number = DataIO.allTickets.size() + 10001;
				int time = Integer.parseInt(JOptionPane.showInputDialog("Your ticket number is " + number + "!\nInput your entered time:"));
				
				if(time < 7 || time > 23){
					throw new Exception();
				}
				
				Ticket t = new Ticket(number, time, 0, ParkingTicketSystem.loginUser);
				ParkingTicketSystem.loginUser.getMyTickets().add(t);
				DataIO.allTickets.add(t);
				DataIO.write();
				
				ParkingTicketSystem.loginUser = null;
				myPage.setVisible(false);
				ParkingTicketSystem.first.getHomepage().setVisible(true);
			}else if(e.getSource() == exit){
				int size = ParkingTicketSystem.loginUser.getMyTickets().size();
				if (size > 0
						&& ParkingTicketSystem.loginUser.getMyTickets().get(size - 1).getCharge() == 0) {
					int number = ParkingTicketSystem.loginUser.getMyTickets().get(size - 1).getNumber();
					int enter = ParkingTicketSystem.loginUser.getMyTickets().get(size - 1).getTime();
					String input = JOptionPane.showInputDialog("Ticket number is " + number + ".\nEnter time is " + enter + ".\nKey in exit time:");
					int exit = Integer.parseInt(input);
					if (exit <= enter || exit > 24) {
						throw new Exception();
					}
					
					int charge = exit - enter;
					ParkingTicketSystem.third.setValue(charge);
					ParkingTicketSystem.third.getLabel().setText("You need to pay RM " + charge + "!");
					ParkingTicketSystem.third.getPaymentPage().setVisible(true);
					myPage.setVisible(false);
				} else {
					throw new Exception();
				}
			}
			
		}catch(Exception x){
			JOptionPane.showMessageDialog(myPage, "Invalid input! Try Again!");
		}
	}
}

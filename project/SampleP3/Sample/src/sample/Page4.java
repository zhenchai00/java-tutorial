package sample;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Page4 implements ActionListener {
	private JFrame adminPage;
	private Button okay;
	private Label totalTicketLabel, totalPaidTicketLabel, totalUnPaidTicketLabel, totalPaymentLabel;
	protected ArrayList<Integer> ticketId = new ArrayList<>();
	protected ArrayList<Integer> ticketEnter = new ArrayList<>();
	protected ArrayList<Integer> ticketCharge = new ArrayList<>();
	protected ArrayList<String> ticketOwner = new ArrayList<>();
	
    public JFrame getAdminPage() {
        return adminPage;
    }
	public Page4() {
		// set JFrame for admin page
		adminPage = new JFrame("Admin Page");
		adminPage.setSize(300,200);
        adminPage.setLocation(700, 300);
        adminPage.setLayout(new FlowLayout());
		
		// read the latest changes files
		this.readFile();
		
		// set the value of the tickets details
		totalTicketLabel = new Label("Total Tickets: ");
		totalPaidTicketLabel = new Label("Total Paid Tickets: ");
		totalUnPaidTicketLabel = new Label("Total Unpaid Tickets: ");
		totalPaymentLabel = new Label("Total Payment: RM ");
		
		// add label to frame 
		adminPage.add(totalTicketLabel);
		adminPage.add(totalPaidTicketLabel);
		adminPage.add(totalUnPaidTicketLabel);
		adminPage.add(totalPaymentLabel);
		
		// add ok button to return to home page
		okay = new Button("Ok");
		okay.addActionListener(this);
		adminPage.add(okay);
		
		adminPage.setVisible(false);
	}
	
	/**
	 * This method is to read the ticket files 
	 */
	public void readFile(){
		try {
			
//			Scanner textFile = new Scanner(new File("ticket.txt"));
//			while(textFile.hasNext()){
//                int id = Integer.parseInt(textFile.nextLine());
//                int enter = Integer.parseInt(textFile.nextLine());
//                int charge = Integer.parseInt(textFile.nextLine());
//                String owner = textFile.nextLine();
//				textFile.nextLine();
//				ticketId.add(id);
//				ticketEnter.add(enter);
//				ticketCharge.add(charge);
//				ticketOwner.add(owner);
//            }
//			textFile.close();
		} catch (Exception e) {
            System.out.println("Error in read ..........\n" + e);
		}
	}
	
	/**
	 * to get total of the ticket value
	 * @return total ticket
	 */
	public void getTotalTicket() {
		ArrayList<Ticket> allTicket = DataIO.getAllTickets();
		System.out.println(allTicket.size());
	}
	
	/**
	 * to get the total payment from all the tickets
	 * @return total payment of ticket
	 */
	public int getTotalPaymentTicket() {
		ArrayList<Ticket> allTicket = DataIO.getAllTickets();
		System.out.println(allTicket.size());
		int totalChargeValue = 0;
		for (Integer chargeValue: ticketCharge) {
			System.out.println(chargeValue + " ");
			if (chargeValue > 0) {
				totalChargeValue += chargeValue;
			}
		}
		return totalChargeValue;
	}
	
	/**
	 * to get total paid ticket from all the tickets
	 * @return total paid ticket
	 */
	public int getTotalPaidTicket() {
		ArrayList<Ticket> allTicket = DataIO.getAllTickets();
			System.out.println(allTicket.size());
		ArrayList<Integer> totalChargeValue = new ArrayList();
		for (Integer chargeValue: ticketCharge) {
			System.out.println(chargeValue + " ");
			if (chargeValue > 0) {
				totalChargeValue.add(chargeValue);
			}
		}
		return totalChargeValue.size();
	}
	
	/**
	 * to get total unpaid ticket from all the tickets
	 * @return total unpaid ticket
	 */
	public int getTotalUnPaidTicket() {
		ArrayList<Ticket> allTicket = DataIO.getAllTickets();
			System.out.println(allTicket.size());
		ArrayList<Integer> totalChargeValue = new ArrayList();
		for (Integer chargeValue: ticketCharge) {
			System.out.println(chargeValue + " ");
			if (chargeValue <= 0) {
				totalChargeValue.add(chargeValue);
			}
		}
		return totalChargeValue.size();
	}
	
	/**
	 * to perform action once button clicked
	 * @param event 
	 */
	public void actionPerformed(ActionEvent event){
		try{
            if (event.getSource() == okay) {
                Sample.first.getHomepage().setVisible(true);
				adminPage.setVisible(false);
			}
        }catch(Exception x){
            JOptionPane.showMessageDialog(adminPage,"Invalid input! Try Again!");
        }
	}
}

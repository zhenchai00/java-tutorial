package sample;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Page2 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == logout){
                Sample.loginUser = null;
                myPage.setVisible(false);
                Sample.first.getHomepage().setVisible(true);
            }else if(e.getSource() == enter){
                int size = Sample.loginUser.getMyTickets().size();
                if(size > 0 && Sample.loginUser.getMyTickets().get(size-1).getCharge() == 0){
                    throw new Exception();
                }
                int number = DataIO.allTickets.size()+10001;
                int time = Integer.parseInt(JOptionPane.showInputDialog("Your tocket number is "+number+
                        "!\nKey in your enter time:"));
                if(time<7 || time>23){
                    throw new Exception();
                }
                Ticket t = new Ticket(number, time, 0, Sample.loginUser);
                Sample.loginUser.getMyTickets().add(t);
                DataIO.allTickets.add(t);
                DataIO.write();
                Sample.loginUser = null;
                myPage.setVisible(false);
                Sample.first.getHomepage().setVisible(true);
            }else if(e.getSource() == exit){
                int size = Sample.loginUser.getMyTickets().size();
                if(size > 0 && Sample.loginUser.getMyTickets().get(size-1).getCharge() == 0){
                    int number = Sample.loginUser.getMyTickets().get(size-1).getNumber();
                    int enter = Sample.loginUser.getMyTickets().get(size-1).getEnter();
                    String input = JOptionPane.showInputDialog("Ticket number is "+number+".\nEnter time is "+
                            enter+".\nKey in exit time:");
                    int exit = Integer.parseInt(input);
                    if(exit<=enter || exit>24){
                        throw new Exception();
                    }
                    int charge = exit-enter;
                    Sample.third.setValue(charge);
                    Sample.third.getLabel().setText("You need to pay RM"+charge+"!");
                    Sample.third.getPaymentPage().setVisible(true);
                    myPage.setVisible(false);
                } else{
                    throw new Exception();
                }
            }
        }catch(Exception x){
            JOptionPane.showMessageDialog(myPage,"Invalid input! Try Again!");
        }
    }
    private JFrame myPage;

    public JFrame getMyPage() {
        return myPage;
    }
    
    private Button enter, exit, logout;
    public Page2(){
        myPage = new JFrame("My Page");
        myPage.setSize(300,100);
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
}

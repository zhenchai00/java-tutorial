package sample;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Page3 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        try{
            String input = y.getText();
            y.setText("");
            int payment = Integer.parseInt(input);
            if(payment<=0){
                throw new Exception();
            } else if(payment<amount){
                amount = amount-payment;
                x.setText("You need to pay RM"+amount+"!");
                JOptionPane.showMessageDialog(x,"You need to make full payment!");
            }else{
                JOptionPane.showMessageDialog(x,"Your change is RM"+(payment-amount)+"!");
                int size = Sample.loginUser.getMyTickets().size();
                Sample.loginUser.getMyTickets().get(size-1).setCharge(charge);
                DataIO.write();
                Sample.loginUser = null;
                paymentPage.setVisible(false);
                Sample.first.getHomepage().setVisible(true);
            }
        }catch(Exception x){
            JOptionPane.showMessageDialog(paymentPage,"Invalid input! Try Again!");
        }
    }
    private JFrame paymentPage;
    private Label x;
    private TextField y;
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
        return x;
    }
    public Page3(){
        paymentPage = new JFrame("Payment Page");
        paymentPage.setSize(350, 140);
        paymentPage.setLocation(700, 100);
        paymentPage.setLayout(new FlowLayout());
        x = new Label("You need to pay RM???",Label.CENTER);
        x.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        paymentPage.add(x);
        y = new TextField(40);
        y.addActionListener(this);
        paymentPage.add(y);
    }
}

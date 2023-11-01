package sample;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Page1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == stop){
                String input = JOptionPane.showInputDialog("Enter admin password:");
                if(!input.equals("12345")){
                    throw new Exception();
                }
                DataIO.write();
                System.exit(0);
            } else if(e.getSource() == register){
                String name = JOptionPane.showInputDialog("Enter username:");
                if(DataIO.checkUsername(name) != null){
                    throw new Exception();
                }
                int password = Integer.parseInt(JOptionPane.showInputDialog("Enter password:"));
                DataIO.allCustomers.add(new Customer(name,password));
                DataIO.write();
            } else if(e.getSource() == login){
                String name = JOptionPane.showInputDialog("Enter username:");
				
				Customer found = DataIO.checkUsername(name);
				if(found == null){
					throw new Exception();
				}
				int password = Integer.parseInt(JOptionPane.showInputDialog("Password:"));
				if(found.getPassword() != password){
					throw new Exception();
				}
				Sample.loginUser = found;
				homepage.setVisible(false);
				Sample.second.getMyPage().setVisible(true);
				
            } else if(e.getSource() == admin){
                String name = JOptionPane.showInputDialog("Enter username:");
				if(name == null || !name.equals("admin")){
					throw new Exception();
				}
				int password = Integer.parseInt(JOptionPane.showInputDialog("Password:"));
				if(12345 != password){
					throw new Exception();
				}
				homepage.setVisible(false);
				Sample.fourth.getAdminPage().setVisible(true);
            }
        }catch(Exception x){
            JOptionPane.showMessageDialog(homepage,"Invalid input! Try Again!");
        }
    }
    private JFrame homepage;

    public JFrame getHomepage() {
        return homepage;
    }
    
    private Button register, login, stop, admin;
    public Page1(){
        homepage = new JFrame("Homepage");
        homepage.setSize(300, 100);
        homepage.setLocation(700, 300);
        register = new Button("Register");
        login = new Button("Login");
        stop = new Button("Stop");
        admin = new Button("Admin Login");
        stop.addActionListener(this);   //current object -> first = new Page1();
        register.addActionListener(this);
        login.addActionListener(this);
		admin.addActionListener(this);
        homepage.setLayout(new FlowLayout());
        homepage.add(register);
        homepage.add(login);
        homepage.add(stop);
        homepage.add(admin);
        homepage.setVisible(true);
    }
}

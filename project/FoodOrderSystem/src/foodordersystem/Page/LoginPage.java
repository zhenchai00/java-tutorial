package foodordersystem.Page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import foodordersystem.Manager.UserManager;
import foodordersystem.Model.User;

public class LoginPage implements ActionListener {
    public JFrame loginPage;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel, passwordLabel;
    private JButton loginBtn, newUserBtn, quitBtn;
    public static User user;

    public LoginPage () {
        loginPage = new JFrame("Login Page");
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setLayout(new BoxLayout(loginPage.getContentPane(), BoxLayout.Y_AXIS));

        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        usernameField = new JTextField(30);
        passwordField = new JPasswordField(30);

        JPanel usernamePanel = new JPanel();
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        JPanel buttonPanel = new JPanel();
        loginBtn = new JButton("Login");
        newUserBtn = new JButton("New User");
        quitBtn = new JButton("Quit");
        buttonPanel.add(loginBtn);
        buttonPanel.add(newUserBtn);
        buttonPanel.add(quitBtn);
        loginBtn.addActionListener(this);
        newUserBtn.addActionListener(this);
        quitBtn.addActionListener(this);

        loginPage.add(usernamePanel);
        loginPage.add(passwordPanel);
        loginPage.add(buttonPanel);

        loginPage.pack();
        loginPage.setLocationRelativeTo(null);
        loginPage.setVisible(true);
    }

    public void actionPerformed (ActionEvent event) {
        try {
            if (event.getSource() == loginBtn) {
                String username = usernameField.getText();
                int password = Integer.parseInt(String.valueOf(passwordField.getPassword()));

                System.out.println("Login " + username + " " + password);
                user = UserManager.loginUser(username, password);

                switch (user.getRole()) {
                    case CUSTOMER:
                        System.out.println("Customer");
                        CustomerDashboardPage.getCustomerDashboardPageObj().getCustomerDashboardPage().setVisible(true);
                        loginPage.setVisible(false);
                        break;

                    case VENDOR:
                        System.out.println("Vendor");
                        VendorDashboardPage.getVendorDashboardPageObj().getVendorDashboardPage().setVisible(true);
                        loginPage.setVisible(false);
                        break;
                
                    case ADMIN:
                        System.out.println("Admin");
                        AdminDashboardPage.getAdminDashboardPageObj().getAdminDashboardPage().setVisible(true);
                        loginPage.setVisible(false);
                        break;
                
                    case RUNNER:
                        System.out.println("Runner");
                        RunnerDashboardPage.getRunnerDashboardPageObj().getRunnerDashboardPage().setVisible(true);
                        loginPage.setVisible(false);
                        break;
                
                    default:
                        System.out.println("User");
                        throw new Exception("Invalid user role");
                }

            } else if (event.getSource() == newUserBtn) {
                System.out.println("New");
                int inputAdminPass = Integer.parseInt(JOptionPane.showInputDialog(loginPage, "Enter admin pass code: "));
                if (inputAdminPass != 123456) {
                    throw new Exception("Wrong admin pass code");
                }

                // RegisterUserPage.getRegisterUserPage().setVisible(true);
                loginPage.setVisible(false);
            } else if (event.getSource() == quitBtn) {
                System.out.println("Quit");
                System.exit(0);
            }

        } catch (Exception e) {
            System.out.println("Error1 " + e);
            JOptionPane.showMessageDialog(loginPage, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JFrame getLoginPage() {
        return loginPage;
    }

    public static User getUser() {
        return user;
    }
}

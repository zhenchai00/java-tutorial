package foodordersystem.Page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import foodordersystem.Manager.UserManager;

public class LoginPage implements ActionListener {
    public static JFrame loginPage;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel, passwordLabel;
    private JButton loginBtn, newUserBtn;

    public static JFrame getLoginPage() {
        return loginPage;
    }

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
        buttonPanel.add(loginBtn);
        buttonPanel.add(newUserBtn);
        loginBtn.addActionListener(this);
        newUserBtn.addActionListener(this);

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
                UserManager.loginUser(username, password);
            } else if (event.getSource() == newUserBtn) {
                System.out.println("New");
                int inputAdminPass = Integer.parseInt(JOptionPane.showInputDialog(loginPage, "Enter admin pass code: "));
                if (inputAdminPass != 123456) {
                    throw new Exception("Wrong admin pass code");
                }

                RegisterUserPage.getRegisterUserPage().setVisible(true);
                loginPage.setVisible(false);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            UserManager.showErrorMessage(e.getMessage());
        }
    }
}

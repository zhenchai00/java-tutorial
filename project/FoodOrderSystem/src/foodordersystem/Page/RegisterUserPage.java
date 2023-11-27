package foodordersystem.Page;

import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RegisterUserPage implements ActionListener {
    private static JFrame registerUserPage;
    private JButton newCustBtn, newVendBtn, newAdminBtn, newRunnerBtn, backBtn;

    public RegisterUserPage () {
        registerUserPage = new JFrame("Register User Page");
        registerUserPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        newCustBtn = new JButton("New Customer");
        newVendBtn = new JButton("New Vendor");
        newAdminBtn = new JButton("New Admin");
        newRunnerBtn = new JButton("New Runner");
        backBtn = new JButton("Back");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(newCustBtn);
        buttonPanel.add(newVendBtn);
        buttonPanel.add(newAdminBtn);
        buttonPanel.add(newRunnerBtn);
        buttonPanel.add(backBtn);

        newAdminBtn.addActionListener(this);
        newVendBtn.addActionListener(this);
        newCustBtn.addActionListener(this);
        newRunnerBtn.addActionListener(this);
        backBtn.addActionListener(this);

        registerUserPage.add(buttonPanel);

        registerUserPage.pack();
        registerUserPage.setLocationRelativeTo(null);
        registerUserPage.setVisible(false);
    }

    public void actionPerformed (ActionEvent event) {
        try {
            if (event.getSource() == newCustBtn) {
                getUserCredentials();
            } else if (event.getSource() == newVendBtn) {
                getUserCredentials();
            } else if (event.getSource() == newAdminBtn) {
                getUserCredentials();
            } else if (event.getSource() == newRunnerBtn) {
                getUserCredentials();
            } else if (event.getSource() == backBtn) {
                LoginPage.getLoginPage().setVisible(true);
                registerUserPage.setVisible(false);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(registerUserPage, "Error" + e);
        }
    }

    public static JFrame getRegisterUserPage () {
        return registerUserPage;
    }

    public ArrayList<Object> getUserCredentials () {
        ArrayList<Object> userCredentials = new ArrayList<Object>();
        String inputUsername = JOptionPane.showInputDialog(registerUserPage, "Enter user's username: ");
        int inputUserPass = Integer.parseInt(JOptionPane.showInputDialog(registerUserPage, "Enter user's password: "));
        userCredentials.add(inputUsername);
        userCredentials.add(inputUserPass);
        return userCredentials;
    }
}
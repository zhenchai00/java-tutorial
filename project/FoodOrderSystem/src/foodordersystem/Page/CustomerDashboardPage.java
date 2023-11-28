package foodordersystem.Page;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import foodordersystem.Interface.DashboardPage;

public class CustomerDashboardPage implements DashboardPage, ActionListener {
    private JFrame customerDashboardPage;
    private JButton orderBtn, menuBtn, logoutBtn;
    private JLabel welcomeLabel;

    public CustomerDashboardPage() {
        customerDashboardPage = new JFrame("Customer Dashboard");
        customerDashboardPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customerDashboardPage.setLayout(new BoxLayout(customerDashboardPage.getContentPane(), BoxLayout.Y_AXIS));

        JPanel headerPanel = new JPanel();
        welcomeLabel = new JLabel("Welcome, " + LoginPage.getUser().getUsername().toUpperCase() + "!");
        welcomeLabel.setFont(new Font(null, Font.BOLD, 20));
        headerPanel.add(welcomeLabel);

        orderBtn = new JButton("Order");
        menuBtn = new JButton("Menu");
        logoutBtn = new JButton("Logout");

        orderBtn.addActionListener(this);
        menuBtn.addActionListener(this);
        logoutBtn.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(orderBtn);
        buttonPanel.add(menuBtn);
        buttonPanel.add(logoutBtn);

        
        customerDashboardPage.add(headerPanel);
        customerDashboardPage.add(buttonPanel);

        customerDashboardPage.pack();
        customerDashboardPage.setLocationRelativeTo(null);
        customerDashboardPage.setVisible(false);
    }

    public void actionPerformed (ActionEvent event) {
        try {
            if (event.getSource() == orderBtn) {

            } else if (event.getSource() == menuBtn) {

            } else if (event.getSource() == logoutBtn) {
                logout();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            JOptionPane.showMessageDialog(customerDashboardPage, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JFrame getCustomerDashboardPage() {
        return customerDashboardPage;
    }

    public void logout() {
        LoginPage.getLoginPage().setVisible(true);
        customerDashboardPage.setVisible(false);
    }
}

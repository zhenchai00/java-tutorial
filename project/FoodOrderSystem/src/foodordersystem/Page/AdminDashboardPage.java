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

public class AdminDashboardPage implements DashboardPage, ActionListener {
    private JFrame customerDashboardPage;
    private JButton orderBtn, menuBtn, logoutBtn;
    private JLabel welcomeLabel;

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

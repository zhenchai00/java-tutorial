package foodordersystem.Page;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import foodordersystem.FoodOrderSystem;

public class CustomerOrderPage extends OrderPage {
    public CustomerOrderPage () {
        super();
        orderPage.setTitle("Customer Order Page");
    }

    @Override
    public void actionPerformed (ActionEvent event) {
        super.actionPerformed(event);
        try {
            if (event.getSource() == backBtn) {
                FoodOrderSystem.customerDashboardPage.getCustomerDashboardPage().setVisible(true);
                orderPage.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(orderPage, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JFrame getOrderPage() {
        return orderPage;
    }
}
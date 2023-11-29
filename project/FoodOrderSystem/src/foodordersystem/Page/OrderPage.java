package foodordersystem.Page;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;

public class OrderPage implements ActionListener{
    public JFrame orderPage;
    protected JButton backBtn;

    public OrderPage () {
        orderPage = new JFrame("Order Page");
        // orderPage.setSize(500, 500);
        // orderPage.setLocation(700, 300);
        orderPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // newBtn = new Button("New");
        // viewBtn = new Button("View");
        backBtn = new JButton("Back");

        // newBtn.addActionListener(this);
        // viewBtn.addActionListener(this);
        backBtn.addActionListener(this);

        orderPage.setLayout(new GridLayout(6, 1));
        // orderPage.add(newBtn);
        // orderPage.add(viewBtn);
        orderPage.add(backBtn);

        orderPage.pack();
        orderPage.setLocationRelativeTo(null);
        orderPage.setVisible(false);
    }

    public void actionPerformed (ActionEvent event) {
        try {
            // if (event.getSource() == newBtn) {
            //     NewOrderPage.getNewOrderPage().setVisible(true);
            //     orderPage.setVisible(false);
            // } else if (event.getSource() == backBtn) {
            //     System.exit(0);
            // }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(orderPage, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JFrame getOrderPage() {
        return orderPage;
    }
}
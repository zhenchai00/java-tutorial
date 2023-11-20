package foodordersystem.Page;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import foodordersystem.FoodOrderSystem;

import java.awt.*;
import java.awt.event.*;

public class OrderPage implements ActionListener{
    public static JFrame orderPage;

    public static JFrame getOrderPage() {
        return orderPage;
    }

    private Button newBtn, viewBtn, deleteBtn, searchBtn, backBtn;

    public OrderPage () {
        orderPage = new JFrame("Order Page");
        orderPage.setSize(500, 500);
        orderPage.setLocation(700, 300);
        orderPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        newBtn = new Button("New");
        viewBtn = new Button("View");
        // deleteBtn = new Button("Delete");
        // searchBtn = new Button("Search");
        backBtn = new Button("Back");

        newBtn.addActionListener(this);
        viewBtn.addActionListener(this);
        // deleteBtn.addActionListener(this);
        // searchBtn.addActionListener(this);
        backBtn.addActionListener(this);

        orderPage.setLayout(new GridLayout(6, 1));
        orderPage.add(newBtn);
        orderPage.add(viewBtn);
        // orderPage.add(deleteBtn);
        // orderPage.add(searchBtn);
        orderPage.add(backBtn);

        orderPage.setVisible(true);
    }

    public void actionPerformed (ActionEvent event) {
        try {
            if (event.getSource() == newBtn) {
                FoodOrderSystem.newOrderPage.getNewOrderPage().setVisible(true);
                orderPage.setVisible(false);
            } else if (event.getSource() == backBtn) {
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(orderPage, "Error" + e);
        }
    }
}
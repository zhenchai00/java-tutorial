package foodordersystem.Page;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import foodordersystem.Model.TempOrder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OrderCartPage implements ActionListener{
    private static JFrame orderCartPage;
    private JButton backBtn, confirmBtn;
    private JTable orderCartTable;
    private DefaultTableModel tableModel;
    private JPanel tablePanel, headerPanel, footerPanel;

    public OrderCartPage () {
        orderCartPage = new JFrame("Order Cart Page");
        orderCartPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        orderCartPage.setLayout(new BoxLayout(orderCartPage.getContentPane(), BoxLayout.Y_AXIS));

        tableModel = new DefaultTableModel(new Object[]{"Item ID", "Item Name", "Quantity", "Price"}, 0);
        orderCartTable = new JTable(tableModel);
        JScrollPane scrollPanel = new JScrollPane(orderCartTable);


        ArrayList<TempOrder> tempOrders = NewOrderPage.getTempOrders();
        System.out.println("temporders: " + tempOrders);

        for (TempOrder tempOrder : tempOrders) {
            System.out.println("Item ID: " + tempOrder.getItemId() + ", Quantity: " + tempOrder.getQuantity());
            tableModel.addRow(new Object[]{
                tempOrder.getItemId(),
                "abc",
                tempOrder.getQuantity(),
                123
            });
        }




        backBtn = new JButton("Back");
        confirmBtn = new JButton("Confirm Payment");
        backBtn.addActionListener(this);
        confirmBtn.addActionListener(this);

        // prepare panel for form field
        headerPanel = new JPanel();
        footerPanel = new JPanel();

        headerPanel.add(scrollPanel);

        // add relevant components to panel
        footerPanel.add(backBtn);
        footerPanel.add(confirmBtn);

        orderCartPage.add(headerPanel);
        orderCartPage.add(footerPanel);

        orderCartPage.pack();
        orderCartPage.setLocationRelativeTo(null);
        orderCartPage.setVisible(false);
    }

    public static JFrame getOrderCartPage () {
        return orderCartPage;
    }

    public void actionPerformed (ActionEvent event) {
        try {
            if (event.getSource() == backBtn) {
                orderCartPage.setVisible(false);
                NewOrderPage.getNewOrderPage().setVisible(true);

            } else if (event.getSource() == confirmBtn) {

            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(orderCartPage, "Error: " + e.getMessage());
        }
    }
}

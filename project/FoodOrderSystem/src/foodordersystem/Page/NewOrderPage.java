package foodordersystem.Page;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

import foodordersystem.Model.TempOrder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;

public class NewOrderPage implements ActionListener{
    private static JFrame newOrderPage;
    private JButton addBtn, cancelBtn, cartBtn;
    private JLabel itemIdLabel, quantityLabel;
    private JTextField itemIdField;
    private JFormattedTextField quantityField;

    /**
     * Constructor of NewOrderPage by creating the frame and its content
     */
    public NewOrderPage () {
        newOrderPage = new JFrame("New Order Page");
        newOrderPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newOrderPage.setLayout(new BoxLayout(newOrderPage.getContentPane(), BoxLayout.Y_AXIS));

        // add text field for menu item id
        itemIdLabel = new JLabel("Item ID:");
        itemIdField = new JTextField(10);

        // add text field for quantity
        quantityLabel = new JLabel("Quantity:");
        NumberFormat format = NumberFormat.getNumberInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        quantityField = new JFormattedTextField(formatter);
        quantityField.setColumns(10);

        // add control button
        addBtn = new JButton("Add");
        cancelBtn = new JButton("Cancel");
        cartBtn = new JButton("Cart");
        addBtn.addActionListener(this);
        cancelBtn.addActionListener(this);
        cartBtn.addActionListener(this);

        // prepare panel for form field
        JPanel headerPanel = new JPanel();
        JPanel footerPanel = new JPanel();

        // add relevant components to panel
        headerPanel.add(itemIdLabel);
        headerPanel.add(itemIdField);
        headerPanel.add(quantityLabel);
        headerPanel.add(quantityField);
        footerPanel.add(addBtn);
        footerPanel.add(cancelBtn);
        footerPanel.add(cartBtn);

        newOrderPage.add(headerPanel);
        newOrderPage.add(footerPanel);

        newOrderPage.pack();
        newOrderPage.setLocationRelativeTo(null);
        newOrderPage.setVisible(false);
    }

    public static JFrame getNewOrderPage() {
        return newOrderPage;
    }

    public void actionPerformed (ActionEvent event) {
        try {
            if (event.getSource() == addBtn) {
                System.out.println("Add button clicked");
                String itemIdValue = itemIdField.getText();
                Integer quantityValue = (Integer) quantityField.getValue();
                if (quantityValue == null || quantityValue <= 0) {
                    throw new Exception("Quantity must be greater than 0");
                }

                OrderCartPage.addRowToTable(new TempOrder(Integer.parseInt(itemIdValue), quantityValue));
                JOptionPane.showMessageDialog(addBtn, "Item added to cart" + "\n" + "Item ID: " + itemIdValue + "\n" + "Quantity: " + quantityValue);

                itemIdField.setText("");
                quantityField.setText("");

            } else if (event.getSource() == cancelBtn) {
                newOrderPage.setVisible(false);
                OrderPage.getOrderPage().setVisible(true);

            } else if (event.getSource() == cartBtn) {
                newOrderPage.setVisible(false);
                OrderCartPage.getOrderCartPage().setVisible(true);
                System.out.println("Cart button clicked");

            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            JOptionPane.showMessageDialog(newOrderPage, "Error: " + e.getMessage());
        }
    }
}

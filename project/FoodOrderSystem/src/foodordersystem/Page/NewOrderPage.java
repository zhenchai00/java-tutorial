package foodordersystem.Page;

import javax.swing.JFrame;

public class NewOrderPage {
    private JFrame newOrderPage;

    public JFrame getNewOrderPage() {
        return newOrderPage;
    }

    public NewOrderPage () {
        newOrderPage = new JFrame("New Order Page");
        newOrderPage.setSize(500, 500);
        newOrderPage.setLocation(700, 300);

        newOrderPage.setVisible(false);
    }
}

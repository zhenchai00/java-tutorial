package foodordersystem.Model;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataIO {
    public static ArrayList<Order> allOrders = new ArrayList<Order>();

    public static void readOrder () {
        try {
            // allOrders = (ArrayList<Order>) FileIO.readObject("order.dat");
            Scanner sc = new Scanner(new File("order.txt"));
            while (sc.hasNext()) {
		        // int id = sc.nextLine();
		        int orderDetailId  = Integer.parseInt(sc.nextLine());
		        int invoiceId  = Integer.parseInt(sc.nextLine());
		        int customerId  = Integer.parseInt(sc.nextLine());
		        String address  = sc.nextLine();
		        String date  = sc.nextLine();
		        Order.Type type  = Order.Type.valueOf(sc.nextLine());
		        Order.Refund refund  = Order.Refund.valueOf(sc.nextLine());
		        Order.Status status  = Order.Status.valueOf(sc.nextLine());
                allOrders.add(new Order(
                    // id,
                    orderDetailId,
                    invoiceId,
                    customerId,
                    address,
                    date,
                    type,
                    refund,
                    status
                ));
            }
        } catch (Exception e) {
            System.out.println("Error reading order.txt ... " + e);
        }
    }

    public static void writeOrder () {
        try {
            PrintWriter pw = new PrintWriter("order.txt");
            for (Order order : allOrders) {
                pw.println(order.getOrderDetailId());
                pw.println(order.getInvoiceId());
                pw.println(order.getCustomerId());
                pw.println(order.getAddress());
                pw.println(order.getDate());
                pw.println(order.getType());
                pw.println(order.getRefund());
                pw.println(order.getStatus());
                pw.println();
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing order.txt ... " + e);
        }
    }
}

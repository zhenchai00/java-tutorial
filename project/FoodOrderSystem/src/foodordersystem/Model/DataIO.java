package foodordersystem.Model;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataIO {
    public static ArrayList<Order> allOrders = new ArrayList<Order>();
    public static ArrayList<User> allUsers = new ArrayList<User>();

    public static void readData () {
        readUser();
        readOrder();
    }

    public static void readUser () {
        try {
            Scanner sc = new Scanner(new File("user.txt"));
            while (sc.hasNext()) {
                String username  = sc.nextLine();
                int password  = Integer.parseInt(sc.nextLine());
                String role  = sc.nextLine();
                allUsers.add(new User(
                    username,
                    password,
                    role
                ));
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Error reading user.txt ... " + e);
        }
    }

    public static void writeUser () {
        try {
            PrintWriter pw = new PrintWriter("user.txt");
            for (User user : allUsers) {
                pw.println(user.getUsername());
                pw.println(user.getPassword());
                pw.println(user.getRole());
                pw.println();
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing user.txt ... " + e);
        }
    }

    public static User checkUsername (String username) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

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
		        OrderType type  = OrderType.valueOf(sc.nextLine());
		        RefundStatus refund  = RefundStatus.valueOf(sc.nextLine());
		        OrderStatus status  = OrderStatus.valueOf(sc.nextLine());
                sc.nextLine();
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
                pw.println(order.getOrderType());
                pw.println(order.getRefundStatus());
                pw.println(order.getOrderStatus());
                pw.println();
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing order.txt ... " + e);
        }
    }
}

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
            while (sc.hasNextLine()) {
                String[] order = sc.nextLine().split(",");
                allOrders.add(new Order(
                    Integer.parseInt(order[0]),
                    Integer.parseInt(order[1]),
                    Integer.parseInt(order[2]),
                    Integer.parseInt(order[3]),
                    order[4],
                    order[5],
                    Order.Type.valueOf(order[6]),
                    Order.Refund.valueOf(order[7]),
                    Order.Status.valueOf(order[8])
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
                pw.println(order.toString());
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error writing order.txt ... " + e);
        }
    }
}

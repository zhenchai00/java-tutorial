package sample;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class DataIO {
    public static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    public static ArrayList<Ticket> allTickets = new ArrayList<Ticket>();
    public static void read(){
        try{
            Scanner s1 = new Scanner(new File("customer.txt"));
            while(s1.hasNext()){
                String name = s1.nextLine();
                int password = Integer.parseInt(s1.nextLine());
                s1.nextLine();
                allCustomers.add(new Customer(name,password));
            }
            Scanner s2 = new Scanner(new File("ticket.txt"));
            while(s2.hasNext()){
                int a = Integer.parseInt(s2.nextLine());
                int b = Integer.parseInt(s2.nextLine());
                int c = Integer.parseInt(s2.nextLine());
                String name = s2.nextLine();
                s2.nextLine();
                Customer d = DataIO.checkUsername(name);
                Ticket t = new Ticket(a,b,c,d);
                d.getMyTickets().add(t);
                allTickets.add(t);
            }
        }catch(Exception x){
            System.out.println("Error in read ..........");
        }
    }
    public static void write(){
        try{
            PrintWriter p1 = new PrintWriter("customer.txt");
            for(Customer c : allCustomers){
                p1.println(c.getName());
                p1.println(c.getPassword());
                p1.println();
            }
            p1.close();
            PrintWriter p2 = new PrintWriter("ticket.txt");
            for(Ticket t : allTickets){
                p2.println(t.getNumber());
                p2.println(t.getEnter());
                p2.println(t.getCharge());
                p2.println(t.getOwner().getName());
                p2.println();
            }
            p2.close();
        }catch(Exception x){
            System.out.println("Error in write ..........");
        }
    }
    public static Customer checkUsername(String x){
        for(Customer c : allCustomers){
            if(x.equals(c.getName())){
                return c;
            }
        }
        return null;
    }
}

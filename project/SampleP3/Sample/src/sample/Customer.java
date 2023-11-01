package sample;
import java.util.ArrayList;
public class Customer {
    private String name;
    private int password;
    private ArrayList<Ticket> myTickets = new ArrayList<Ticket>();
    public Customer(String name, int password) {
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public ArrayList<Ticket> getMyTickets() {
        return myTickets;
    }
    public void setMyTickets(ArrayList<Ticket> myTickets) {
        this.myTickets = myTickets;
    }    
}

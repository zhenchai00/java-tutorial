package foodordersystem.Model;

public class Customer extends User {
    private String role = "customer";
    public Customer (String username, int password) {
        super(username, password, "customer");
        role = "customer";
    }

    public String getRole () {
        return role;
    }
}

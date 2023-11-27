package foodordersystem.Model;

public class User {
    private String username;
    private int password;
    private String role = "user";

    public User (String username, int password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername () {
        return username;
    }

    public int getPassword () {
        return password;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public void setPassword (int password) {
        this.password = password;
    }

    public String getRole () {
        return role;
    }
}
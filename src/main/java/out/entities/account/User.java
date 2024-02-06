package out.account;

public class User {
    private final String username;
    private final String password;
    private String role;
    private final Account acc;

    public User(String username, String password, Account acc) {
        this.username = username;
        this.password = password;
        this.role = "USER";
        this.acc = acc;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "ADMIN";
        this.acc = null;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Account getAcc() {
        return acc;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", acc=" + acc +
                '}';
    }
}

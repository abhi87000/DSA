import java.util.List;

public class Customer {
    private String name;
    private String email;
    List<Address> allAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getAllAddress() {
        return allAddress;
    }

    public void setAllAddress(List<Address> allAddress) {
        this.allAddress = allAddress;
    }

    public Customer(String name, String email, List<Address> allAddress) {
        this.name = name;
        this.email = email;
        this.allAddress = allAddress;
    }
}

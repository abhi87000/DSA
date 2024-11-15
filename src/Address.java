import java.util.List;

public class Address {
    private String city;
    private String pincode;

    public Address() {

    }

    public String getCity() {
        return city;
    }

    public String getPincode() {
        return pincode;
    }

    public Address(String city, String pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public Integer add(int x,int y)
    {
        return x+y;
    }
    public String add(String x,int z)
    {
        return x.concat(String.valueOf(z));
    }
}

import java.util.*;

class Address
{
    private String city, state, country; 
    private int zip;

    public Address() {}

    public Address (String city, String state, int zip, String country)
    {
        this.city= city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    
    public void setCity (String city)
    {
        this.city= city;
    }
    public String getCity()
    {   
        return city;
    }

    public void setState(String state)
    {
        this.state = state;
    }
    public String getState()
    {
        return state;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }
    public String getCountry()
    {
        return country;
    }

    public void setZip(int zip)
    {
        this.zip = zip;
    }
    public int getZip()
    {
        return zip;
    }

    @Override
    public String toString()
    {
        return "Address [city="+city+", state-"+state+", zip="+zip+", country="+country+"]";
    }
}

class Customer
{
    private int customerId;
    private String email, customerName, password;

    Address address;

    public Customer() {}

    public Customer (int customerId, String customerName, String password, String email, Address address)
    {
        this.customerId = customerId; 
        this.customerName = customerName;
        this.password = password; 
        this.email = email;
        this.address = address;
    }
    
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }
    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public String getCustomerName()
    {
        return customerName;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    public String getEmail()
    {   
        return email;
    }
        
    public void setAddress (Address address)
    {
        this.address = address;
    }
    public Address getAddress()
    {
        return address;
    }

    @Override
    public String toString()
    {
        return "Customer [customerId=" + customerId+" ,email="+email+", password="+password+", customerName="+customerName+", address"+address+"]";
    }   
}

public class Source
{
    public static void main(String[] args)
    {
        Address add  = new Address("Chennai","TamilNadu", 600075, "India");
        Customer cust = new Customer(102,"Raj Kumar","password", "raj@gmail.com",add); 
        System.out.println(cust);
    }
}


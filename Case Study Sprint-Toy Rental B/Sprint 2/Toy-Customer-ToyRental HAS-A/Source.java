import java.util.*;

class Customer {

    private int customerId;
    private String email;
    private String password;
    private String customerName;

    public Customer(){};

    public Customer (int customerId, String email, String password, String customerName)
    {
        this.customerId = customerId;
        this.email = email;
        this.password = password;
        this.customerName = customerName;
    }

    @Override
    public String toString()
    {
        String result = "Customer [customerId-" + customerId+", email=";
        result += customerName + ", password=";
        result += password + ", customerNameName=";
        result += email +"]";

        return result;
    }

    public int getCustomerId()
    {   
        return customerId;
    }
    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getcustomerName()
    {
        return customerName;
    }
    public void setcustomerName (String customerName)
    {
        this.customerName = customerName;
    }

}

class ToyRental
{
    private int rentalId;
    private int toyId;
    private String rentalDate;
    private String rentalReturnDate;
    private double totalAmount;
    private int fine;
    private String status;
    private Customer customer;

    public ToyRental(){};

    public ToyRental(int rentalId, int toyId, String rentalDate, String rentalReturnDate,double totalAmount, int fine, String status, Customer customer)
    {

        this.rentalId = rentalId;
        this.toyId= toyId;
        this.fine = fine;
        this.totalAmount =totalAmount;
        this.rentalDate= rentalDate;
        this.rentalReturnDate= rentalReturnDate;
        this.status = status;
        this.customer = customer;
    }

    @Override
    public String toString()
    {

        String result = "ToyRental [rentalid=" + rentalId+", toyid=";
        result += toyId +", rentalDate="; 
        result += rentalDate + ", rentalReturnDate=";
        result += rentalReturnDate + ", totalAmount="; 
        result += totalAmount + ", fine=";
        result += fine +", status=";
        result += status + ", customer Id=";
        result += customer +"]";

        return result;
    }

    public int getRentalId()
    {
        return rentalId;
    }
    public void setRentalId(int rentalId)
    {
        this.rentalId = rentalId;
    }

    public int getToyId()
    {
        return toyId;
    }   
    public void setToyid (int toyId)
    {   
        this.toyId= toyId;
    }

    public int getFine()
    {
        return fine;
    }
    public void setFine(int fine)
    {
        
    }

    public double getTotalAmount()
    {
        return totalAmount;
    }
    public void setTotalAmount (double totalAmount)
    {
        this. totalAmount = totalAmount;
    }


    public String getRentalDate()
    {
        return rentalDate;
    }
    public void setRentalDate(String rentalDate)
    {
        this.rentalDate= rentalDate;
    }

    public String getRentalReturnDate()
    {
        return rentalReturnDate;
    }
    public void setRentalReturnDate(String rentalReturnDate)
    {
        this.rentalReturnDate= rentalReturnDate;
    }

    public String getStatus()
    {   
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    public void setCustomer (Customer customer)
    {
        this.customer = customer;
    }
}

class Source
{
    public static void main(String[] args)
    {
        ToyRental tr = new ToyRental(); 
        Customer cs = new Customer();
    }
}




























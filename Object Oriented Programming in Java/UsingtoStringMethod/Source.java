import java.util.*;

class Employee
{
    private String firstname, lastname; 
    private int phonenumber;

    public Employee () {}

    public Employee(String firstname, String lastname, int phonenumber)
    {
        this.firstname = firstname; 
        this.lastname = lastname;
        this.phonenumber = phonenumber;

    }
 
    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhonenumber (int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    @Override
    public String toString() {
        return String.format("Employee [firstnames, lastname As, phonenumber aj", this.firstname, this. lastname, this.phonenumber);
    }
}

class Source
{
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setFirstname("Jay");
        emp.setLastname ("Kunar");
        emp.setPhonenumber(77777);
    }
}


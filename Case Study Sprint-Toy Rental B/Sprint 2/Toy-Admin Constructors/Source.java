class Toy
{
    int toyId;
    String toyName;
    String toyType;
    int minAge;
    int maxAge;
    int price, quantity, rentalAmount, refundableDeposit;

    public Toy (int toyId, String toyName, String toyType, int minAge, int maxAge, int price,int quantity, int rentalAmount, int refundableDeposit)
    {
        this.toyId= toyId; 
        this.toyName = toyName;
        this.toyType = toyType;
        this.minAge = minAge; 
        this.maxAge = maxAge;
        this.price = price; 
        this.quantity = quantity;
        this.rentalAmount = rentalAmount;
        this.refundableDeposit = refundableDeposit;
    }

    public String toString()
    {
        return ("Toy "+"[toyId="+this.toyId+", toyName="+this.toyName+", toyType="+this.toyType+", minAge="+this.minAge+", maxAge="+this.maxAge+", price="+this.price+" quantity="+this.quantity+", rentalAmount="+this.rentalAmount+", refundableDeposit="+this.refundableDeposit+"]");
    }
}
class Admin
{
    String email, password, name;

    public Admin(String email, String password, String name)
    {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String toString()
    {
        return "Admin "+"[email="+this.email+", name="+this.password+", password="+this.name+"]";
    }
}

public class Source
{
    public static void main(String [] args)
    {
        Toy t = new Toy (901, "Car", "Auto ",2,7,450,50,100,250) ;
        Admin a = new Admin ("raj@gmail.com","XXXX","Rajan");
        System.out.println(t);
        System.out.println(a) ;
    }
}
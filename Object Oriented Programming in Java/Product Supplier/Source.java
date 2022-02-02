import java.util.*; 
class Product
{
    private long id;
    private String productName, supplierName;

    Product()
    {
        id = 0;
        productName = "";
        supplierName = "";

    }

    Product(long i, String p, String s)
    {
        id = i;
        productName = p;
        supplierName = s;
    }

    public void setId(long i) {
        id = i;
    }
    public void setProductName(String p) {
        productName=p;
    }
    public void setSupplierName(String s) {
        supplierName = s;
    }
    public long getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public String getSupplier() {
        return supplierName;
    }

    public void display()
    {
        System.out.println("Product Id is "+id);
        System.out.println("Product Name is " +productName); 
        System.out.println("Supplier Name is " +supplierName);
    }
}
class Source
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt ();
        String p = sc.nextLine();

        if(sc.next().equals("yes"))
        {
            Product obj = new Product (id,p,"Nivas");
            obj.display();

        }
        else
        {
            Product obj = new Product (id,p, sc.nextLine()); obj.display();
        }
        sc.close();
    }
}
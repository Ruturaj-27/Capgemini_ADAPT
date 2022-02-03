import java.util.Scanner;

// Class name should be "Source",
// otherwise solution won't be accepted. - 
public class Source {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();       
        int num2 = sc.nextInt();
        
        if(num1 == num2)
        {
            System.out.println("0");
        }
        else if(isprime(num1) && isprime(num2))
        {
            if(num1 > num2)
            {
                System.out.println(num1);
            }
            else
            {
                System.out.println(num2);
            }
        }
        else if(num1 > num2)
        {
            System.out.println(num2);
        }
        else
        {
            System.out.println(num1);
        }
        sc.close();
    }
        
    static boolean isprime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        for (int i = 2;i<n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}


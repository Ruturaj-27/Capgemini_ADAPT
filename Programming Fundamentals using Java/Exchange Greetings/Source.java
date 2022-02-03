import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source", // otherwise solution won't be accepted

public class Source 
{
    static int h = 0;
    static int a = 1;       

    public static void main(String args[]) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int numofpeople = sc.nextInt();

        if(numofpeople >= 0)
        {
            handshake(numofpeople);
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }

    public static int handshake(int numofpeople)
    {
        if(numofpeople != 0)
        {
            System.out.println("handshake("+a+")="+h);

            h = h + a;
            a++;
            numofpeople--;
            return handshake(numofpeople);
        }
        else
        {
            return numofpeople;
        }
    }
}


        
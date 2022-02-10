import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source". // otherwise solution won't be accepted public class Source (

class Source {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String arr[]  = new String[5];

        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextLine();
        }

        getToys(arr);
        sc.close();
    }

    public static String[] getToys(String arr[]) {

        Arrays.sort (arr); 
        String revarr[] = new String[arr.length];

        int j = 0;

        for(int i= arr.length-1;i >=0;i--)
        {
            revarr[j] =  arr[i];
        }

        for (int i = 0;i<5;i++)
        {
            System.out.println(revarr[1]);
        }
        return revarr;
    }
}


    
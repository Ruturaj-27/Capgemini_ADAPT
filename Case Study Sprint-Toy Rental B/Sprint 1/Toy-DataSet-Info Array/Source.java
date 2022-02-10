import java.io.*;
import java.util.*;
import java. text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source", // otherwise solution won't be accepted

    public class Source {

    public static void main(String args[] ) throws Exception { /* Enter your code here. Read input from STDIN. Print output to */
        Scanner sc = new Scanner(System.in);

        String[][]toyArray = new String[5][3];

        for (int i = 0;i<5;i++)
        {
            for(int j = 0;j<3;j++)
            {
                toyArray[i][j] = sc.nextLine();
            }

        }
        Arrays.sort(toyArray, new Comparator<String[]>()
        {
            @Override
            public int compare (String [] first, String []Second)
            {
                if(Integer.parseInt (first [8]) > Integer.parseInt(Second[0]))
                    return 1;
                else
                    return -1;
            }
        });

        for(int i = 0; i < 5; i++)
        {
            for(int j = 0;j < 3;j++)
            {
                System.out.println(toyArray[i][j]);
            }
        }
        sc.close();
    }
}

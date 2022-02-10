import java.io.*;
import java.util.*; import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source", // otherwise solution won't be accepted - 
public class Source {

    static String toyDetails [][]=new String[5][3];

    Source()
    {
    toyDetails[0][0]="11";
    toyDetails[0][1]="Speeding Cars";
    toyDetails[0][2]="350";

    toyDetails [1][0]="31"; 
    toyDetails [1][1]="Snake And Ladder";
    toyDetails [1][0]="200";

    toyDetails [2][0]="29";
    toyDetails [2][1]="Ludo";
    toyDetails[2][2]="450";

    toyDetails[3][0]="17"; 
    toyDetails [3][1]="Donald Duck";
    toyDetails [3][2]="600";

    toyDetails[4][0]="56";
    toyDetails[4][1]="Racing Bike";
    toyDetails[4][2]="350";

    }

    public static void main(String args[]) throws Exception { /* Enter your code here. Read input from STDIN. Print or*/

        Scanner sc = new Scanner(System.in); 
        String input= sc.nextLine();
        
        int check = 1;
        Source obj= new Source();
        
        for(int i = 0; i < 5; i++)
        {
            if(obj.toyDetails[i][0].equals(input)) 
            {
                System.out.println (obj.toyDetails[i][0]); 
                System.out.println (obj.toyDetails[i][1]); 
                System.out.println (obj.toyDetails[i][2]); 
                check = 1; 
                break;
            }
            else
            {
                check = 0;
            }
        }
        if(check == 0)
        {
            System.out.println("No Record Found");
        }
        sc.close();
    }
}
        
        
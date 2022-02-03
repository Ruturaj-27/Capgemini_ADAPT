import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source", // otherwise solution won't be accepted

public class Source 
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int salary,shift;
        // Declare the variable. int salary, shift;
        
        // Read the variable from STDIN
        
        salary = in.nextInt();
        
        int newshift, newsalary = 0;
        
        if((salary < 8000))
        {
            if((salary > 0))
            {
                shift = in.nextInt();
                if(shift > 0)
                {
                    newshift = (salary*(shift*2))/100; 
                    newsalary = ((salary*50)/100)+newshift;

                    System.out.println(newsalary);
                }
                else
                {
                    System.out.println("Shifts too small");
                }
            }
            else
            {
                System.out.println("Salary too large");
            }
        }
        in.close();
    }
}


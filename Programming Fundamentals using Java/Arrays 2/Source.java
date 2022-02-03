import java.util.*;
/**
 * Main class
 */
public class Source {
    /**
    * Main method
    * @param args 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       
        if(1 < n && n < 20)
        {
             int arr[] = new int[n];
            for(int i = 0;i <n;i++)
            {
                arr[i] = sc.nextInt();
            }
            if(n%2 == 0)
            {
                Arrays.sort(arr);
                for(int i = 0;i <n;i++)
                {
                    System.out.print(arr[i] + " ");
                }
            }
            else
            {
                Arrays.sort(arr);
                for(int j = n-1 ;j >= 0;j--)
                {
                    System.out.print(arr[j] + " ");
                }
            }
        }
        else
        {
            System.out.print("INVALID_INPUT");
        }
        sc.close();
    }    
}
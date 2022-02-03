import java.util.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		if(len > 0)
    	{
    		String arr[] = new String[len];
    		
    		for(int i = 0;i <len;i++)
    		{
    		    arr[i] = sc.nextLine();
    		}
    		
    		int count = 0;
    		ArrayList<String> list = new ArrayList<>();
    		for(int i = 0;i <len;i++)
    		{
    		    if(arr[i].contains("Sales"))
    		    {
    		        count++;
    		        list.add(arr[i]);
    		    }
    		}
    		if(count != 0)
    		{
    		    System.out.println("Designations in Sales Department " + count);
    		    for(int i = 0;i<list.size();i++)
    		    {
    		        System.out.println(list.get(i));
    		    }
    		}
    		else
    		{
    		     System.out.println("No designations in Sales department");
    		}
    	}
    	else
    	{
    	    System.out.println("INVALID INPUT");
    	}
        sc.close();
	}
}
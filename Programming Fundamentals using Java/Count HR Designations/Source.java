import java.util.*;
public class Source {
    
    public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		if(len > 0)
		{
		    String arr[] = new String[len];
		    for(int i = 0;i<len;i++)
            {
                System.out.println("1");
    		    arr[i] = sc.nextLine();
    	    }
    		ArrayList<String> list = new ArrayList<>();
    		int count = 0;
    		
    		for(int i = 0;i<len;i++)
    		{
                String temp = arr[i];
    		    if(temp.contains("HR"));
    		    {
    		        count++;
    		        list.add(arr[i]);
    		    }
    		}
    		if(count != 0)
    		{
                System.out.format("Total %d designations in HR Department",count);
    		    for(int i = 0;i <list.size();i++)
    		    {
                    System.out.println(list.get(i));
    		    }  
    		}
    		else
    		{
    		    System.out.println("No designation of HR department found in given data");
    		}
		}
		else
		{
    		System.out.println("INVALID INPUT");
    	}
        sc.close();
	}
}

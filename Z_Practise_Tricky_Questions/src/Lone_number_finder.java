import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lone_number_finder {
    public static void main(String[] args) throws IOException {
    	ArrayList<Integer> a = new ArrayList<>();
    	ArrayList<Integer>b = new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter size :");
    	int size = sc.nextInt();
    	System.out.println("enter elements ");
    	sc.nextLine();
    	for(int i=0;i<size;i++) 
    	{
    		a.add(sc.nextInt());
    	}
    	int ans1 = 0;
    	for(int answer : a) 
    	{
    		ans1 ^= answer;
    	}
    	System.out.println(ans1);
    	
    	int answer = 0;
    	for(int i=0;i<a.size();i++)
    	{
    		for(int j=0;j<a.size();j++)
    		{
    			int end = (j+i)%a.size();    		
    			if(j!=end && a.get(j) == a.get(end)) 
    			{
    				b.add(a.get(j));
    			}
    		}
       	}
    	
    	for(int ans : a) 
    	{
    		if(!b.contains(ans)) 
    		{
    			answer = ans;
    		}
    	}
    	
    	
    	System.out.println(answer);
    	sc.close();
    }
}
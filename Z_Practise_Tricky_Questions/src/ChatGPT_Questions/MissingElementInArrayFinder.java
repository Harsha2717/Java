package ChatGPT_Questions;

import java.util.Scanner;

public class MissingElementInArrayFinder 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter Size of Array : ");
			int size = sc.nextInt();
			int [] arr = new int[size];
			System.out.println("Enter "+size+ " Elements");
			for(int i=0;i<size;i++) 
			{
				arr[i] = sc.nextInt();
			}
			int Missing = -1;
			
			for(int i =1;i<size;i++) 
			{
				if(arr[i] != (arr[i-1]+1))
				{
					Missing = (arr[i-1]+1);
					break;
				}
			}
			
			if(Missing == -1) 
			{
				System.out.println("No ELement Missing");
			}else 
			{
				System.out.println("Missing Element is : " + Missing);
			}			
		}
	}
}

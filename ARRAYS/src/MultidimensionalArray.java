import java.util.Scanner;

public class MultidimensionalArray {
	public static void main(String[] args) {
		
		System.out.println("==================Method - 1==================");
		int  [] [] a = new int [3][3]; 
		
		a[0][0] = 1;
		a[1][1] = 1;
		a[2][2] = 1;
		
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("==================Method - 2==================");
	
		int [] [] b = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		}; 
		
		for(int i=0;i<b.length;i++) 
		{
			for(int j=0;j<b[i].length;j++) 
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println(" ");
		}		
		
		System.out.println("==================Method - 3==================");
		//When there is Matrix of more rows and less columns then we can use row value in inner loop 
		
		int [] [] c =
			{
				{1,2,3},
				{4,5,6,7},
				{7,8,9}	
			};
		
		for(int i=0;i<c.length;i++) 
		{
			for(int j=0;j<c[i].length;j++) 
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("==================Method - 4==================");
		int [] [] d =
			{
				{1},
				{2,3},
				{4,5,6},
				{7,8,9,0}
			};
		
		for(int i=0;i<d.length;i++) 
		{
			for(int j=0;j<d[i].length;j++) 
			{
				System.out.print(d[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("==================Method - 5==================");
		//Using USer input and Output
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter Number of Colums : ");
		int col = sc.nextInt();
	
		int [] [] e = new int [rows][col];
		
		System.out.println("Enter total elements of : " + (rows*col));
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				e[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) 
		{
			for(int j=0;j<col;j++) 
			{
				System.out.print(e[i][j] + " ");
			}
			System.out.println(" ");
		}
		sc.close();
		
	}
}
/*
*/
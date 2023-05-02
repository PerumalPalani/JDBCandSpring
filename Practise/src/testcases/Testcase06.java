package testcases;
import java.util.Scanner;
public class Testcase06 {
	public static int absol(int n)
	{
		if(n<=21)
		{
			return 21-n; 
			
		}
		else
		{
			return 0;
		}	
		
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = s.nextInt();
		s.close();
		int b = absol(a);
		System.out.println("The result is: \t" +b);		
	}

}

package testcases;
import java.util.Scanner;
public class Testcase01 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Nth box:");
		int n = s.nextInt();
		s.close();
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		for(int i = 1; i<=n; i++)
		{
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println("Nth box have number of fruits are:" +f3);
		
	}

}

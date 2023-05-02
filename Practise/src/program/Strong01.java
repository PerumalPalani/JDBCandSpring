package program;
import java.util.Scanner;
public class Strong01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int a = s.nextInt();
		int copy = a;
		int rem = 0;
		int sum = 0;
		while(a != 0)
		{
			rem = a%10;
			int fact = 1;
			for(int i = 1; i<=rem; i++)
			{
				fact = fact*i;
			}
			sum+= fact;
			a = a/10;
		}
		if(copy == sum)
		{
			System.out.println("It is strong number");
		}
		else
			System.out.println("It is not strong number");
	}

}

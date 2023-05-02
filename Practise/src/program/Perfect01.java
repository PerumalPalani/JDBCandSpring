package program;
import java.util.Scanner;

public class Perfect01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int a = s.nextInt();
		int copy = a;
		int i = 1;
		int sum = 0;
		while(i <= a/2)
		{
			if(a%i == 0)
			{
				sum+=i;
			}
			i++;			
		}
		if(copy == sum)
		{
			System.out.println("It is perfect number");
		}
		else 
		System.out.println("It is not perfect number");
	}

}

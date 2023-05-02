package program;
import java.util.Scanner;

public class Arm01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int a = s.nextInt();
		int sum = 0;
		int rem = 0;
		int temp = a;
		int copy = a;
		int count=0;
		while(a !=0)
		{
			a = a/10;
			count++;
		}
		while(temp != 0)
		{
			rem = temp%10;
			sum+=(Math.pow(rem, count));
			temp = temp/10;		
		}
		if(copy == sum)
		{
			System.out.println("It is Armstrongth number");
		}
		else 
			System.out.println("It is not Armstrongth number");
		
	}
	

}

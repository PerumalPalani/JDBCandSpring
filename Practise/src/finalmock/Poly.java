package finalmock;
import java.util.Scanner;

public class Poly {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer value");
		int a = s.nextInt();
		int copy = a;
		int rev = 0;
		int rem = 0;
		while(a != 0)
		{
			rem = a%10;
			rev = (rev*10)+rem;
			a = a/10;
		}
		if(copy == rev)
		{
			System.out.println("It is palindrome number"+rev);
		}
		else
		{
			System.out.println("It is not palindrome"+rev);
		}
	}

}

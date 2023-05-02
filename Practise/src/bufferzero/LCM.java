package bufferzero;
import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer a");
		int a = s.nextInt();
		System.out.println("Enter the integer b");
		int b = s.nextInt();
		int gcd = 1;
		for(int i = 1; i <= a&& i <= b; i++){
			if(a % i == 0 && b % i == 0)
				gcd = i;			
		}
		int lcm = a*b/gcd;
		System.out.println("The LCM of value is :" +lcm);
	}

}

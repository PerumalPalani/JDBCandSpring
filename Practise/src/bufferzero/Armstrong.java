package bufferzero;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		int copy = a;
		double sum = 0;
		int t = a;
		int count = 0;
		while (t != 0)
		{
			int rem = t %10;
			count++;
			t = t/10;
		}
		while (a != 0){
			int rem = a %10;
			sum = sum + (Math.pow(rem, count));
			a = a/10;
		}
		if(copy == sum){
			System.out.println("It is a Armstrong number");
		}
		else{
			System.out.println("It is not a Armstrong number");
		}
		
	}

}

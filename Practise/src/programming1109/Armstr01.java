package programming1109;

import java.util.Scanner;

public class Armstr01{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the some value");
		int a = s.nextInt();
		int copy = a;
		int sum = 0;
		String b = ""+a;
		while(a != 0){
			int rem = a%10;
			sum+=Math.pow(rem, b.length());
			a = a/10;
		}
		if(sum == copy)
		{
			System.out.println("It is a Armstong number");
		}
		else
		{
			System.out.println("It is not  a Armstong number");
		}
		
	}
}


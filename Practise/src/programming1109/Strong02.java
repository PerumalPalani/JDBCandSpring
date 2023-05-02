package programming1109;

import java.util.Scanner;

public class Strong02 {
	static int fac(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = s.nextInt();
		int sum = 0;
		int copy = num;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + fac(rem);
			num = num / 10;
		}
		if (sum == copy)
			System.out.println("It is Strong number" + copy);
		else
			System.out.println("It is not Strong number" + copy);
	}
}

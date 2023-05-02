package prepare;

import java.util.Scanner;

public class Case1 {
	@SuppressWarnings("resource")
	static void fibb() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the numer of box");
		int n = s.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3 = 0;
		for (int i = 1; i <= n; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.println("The number of fruits in box are:" + f3);
		System.out.println("choose the choice");
		System.out.println("1. yes");
		System.out.println("2. No");
		int a = s.nextInt();
		switch (a) {
		case 1:
			fibb();
			break;
		case 2:
			break;
		default:
			break;
		}
	}

	public static void main(String args[]) {
		
		fibb();

	}

}

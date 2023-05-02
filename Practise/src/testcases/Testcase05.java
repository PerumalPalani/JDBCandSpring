package testcases;
import java.util.Scanner;
public class Testcase05 {
	public static boolean sum(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a =s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		s.close();
		boolean e = sum(a, b);
		System.out.println("Result is"+a+ " "+b+":\t "+e);
		/*System.out.println(sum(9, 10));
		System.out.println(sum(9,9));
		System.out.println(sum(1,9));
		System.out.println(sum(8, 3));
		System.out.println(sum(10, 42));*/
	}
}

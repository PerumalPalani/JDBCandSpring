package testcases;

import java.util.Scanner;

public class Testcase07 {
	public static boolean loud(boolean parrot, int hour) {
		
			if (parrot == true && ((hour < 7) || (hour > 20))) {
				return true;
			}

		return false;

	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the vale for hour");
		int a = s.nextInt();
		System.out.println("Enter the hour within the range 0- 23 is true else false:");
		boolean b = s.nextBoolean();
		s.close();
		boolean c = loud(b, a);
		System.out.println("Result is:\t" +c);
		
	}

}

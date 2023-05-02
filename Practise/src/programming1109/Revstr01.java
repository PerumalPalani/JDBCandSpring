package programming1109;

import java.util.Scanner;

public class Revstr01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String data");
		String s1 = s.next();
		String s2 = "";
		for(int i=s1.length()-1; i>=0; i--){
			char ch = s1.charAt(i);
			s2 = s2+ch;
		}
		if(s1 == s2)
		{
			System.out.println("It is palindrome");
		}
		else{
			System.out.println("It is not palindrome");
		}
	}

}

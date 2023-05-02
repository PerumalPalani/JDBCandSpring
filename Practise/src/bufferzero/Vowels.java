package bufferzero;
import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the character");
	char ch = s.next().charAt(0);
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
		System.out.println("It is small letter vowels or consonant");
	}
	else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
		System.out.println("It is capital letter vowels or consonant");
	}
	else{
		System.out.println("It is not a vowel or consonant");
	}
}
}

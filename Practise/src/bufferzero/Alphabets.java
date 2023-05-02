package bufferzero;
import java.util.Scanner;
public class Alphabets {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = s.next().charAt(0);
		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
			System.out.println("It is an Alphabet characters");
		}
		else{
			System.out.println("It is not an Alphabet character");
		}
	}

}

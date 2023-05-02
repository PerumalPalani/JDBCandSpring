package bufferzero;
import java.util.Scanner;

public class UpLowSpe {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = s.next().charAt(0);
		if(ch >= 65 && ch <= 90){
			System.out.println("It is a Capital letter");
		}
		else if(ch >= 97 && ch <= 122){
			System.out.println("It is a Small letter");
		}
		else if((ch >= 32 && ch <= 47) || (ch >=58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch>=123 && ch<=126)){
			System.out.println("It is a special character");
		}
		else {
			System.out.println("It is Number character or controll characters");
		}
		
	}

}

package bufferzero;
import java.util.Scanner;
public class PosNeg {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numeric number");
		int a = s.nextInt();
		if(a >= 0){
			System.out.println("It is positive number");
		}
		else{
			System.out.println("It is Negative number");
		}
	}

}

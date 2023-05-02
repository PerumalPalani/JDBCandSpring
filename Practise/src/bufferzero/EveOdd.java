package bufferzero;
import java.util.Scanner;
public class EveOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Integer value");
		int a = s.nextInt();
		if( a % 2 == 0){
			System.out.println("It is an Even number");
		}
		else{
			System.out.println("It is an Odd number");
		}
	}
	}

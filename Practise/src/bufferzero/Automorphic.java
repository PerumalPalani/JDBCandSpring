package bufferzero;
import java.util.Scanner;
import java.lang.Math;
public class Automorphic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		int copy = a;
		int square = a*a;
		int last_digits = 0;
		int count = 0;
		while( copy != 0){
			int rem = copy % 10;
			count ++;
			copy = copy / 10;
		}
		last_digits = (int)(square % (Math.pow(10, count)));
		if( a == last_digits){
			System.out.println("It is a automorphic number");
		}
		else{
			System.out.println("It is not automorphic number");
		}
	}

}

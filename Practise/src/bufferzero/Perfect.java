package bufferzero;
import java.util.Scanner;
public class Perfect {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= a/2){
			if(a % i == 0){
				sum = sum + i;
			}
			i++;
		}
		if (a == sum){
			System.out.println("It is a Perfect number");
		}
		else {
			System.out.println("It is not a perfect number");
		}
	}

}

package bufferzero;
import java.util.Scanner;
public class Abudant {
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
		if(a < sum){
			System.out.println("It is a abudant number");
		}
		else{
			System.out.println("It is not a abudant number");
		}
		
	}

}

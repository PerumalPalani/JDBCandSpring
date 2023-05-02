package bufferzero;
import java.util.Scanner;
public class Addtwofraction {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first numerator");
		int num1 = s.nextInt();
		System.out.println("Enter the first denominator");
		int den1 = s.nextInt();
		System.out.println("Enter the second numerator");
		int num2 = s.nextInt();
		System.out.println("Enter the second denominator");
		int den2 = s.nextInt();
		System.out.println("( "+num1+ " / "+den1+" )  + ("+num2+" / "+den2+" ) =");
		int num , den, x;
		if( den1 == den2){
			num = num1 +num2;
			den = den1;
		}
		else{
			num = num1 * den2 + num2 * den1;
			den = den1 * den2;
		}
		if(num > den){
			x = num;
		}
		else{
			x = den;
		}
		for(int i = 1; i <= x; i++){
			if(num % i == 0 && den % i == 0){
				num = num/i;
				den = den/i;
			}
			
		}
		int n = 1;
		int p = num;
		int q = den;
		if(num != den){
			while (n != 0){
				n = num % den;
				if(n != 0){
					num = den;
					den = n;
				}				
			}
		}
		System.out.print("("+p/den + " / " +q/den+" ) ");
		
	}

}

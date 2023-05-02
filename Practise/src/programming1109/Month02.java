package programming1109;
import java.util.Scanner;

public class Month02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the vlaue");
		int a = s.nextInt();
		String b[] = {"start","January","Fibuary","March","April","May","June","July","August","September","October","November","December"};
		int c[] = {1,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("The month is: "+b[a]+"\n dyas are: "+c[a]);		
		
	}

}

package bufferzero;
import java.util.Scanner;
public class AreaCir {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the circle radius value");		
		double r = s.nextDouble();
		final double pi = 3.14;
		double res;
		res = pi*r*r;
		System.out.println("The area of circle is "+res);
	}

}

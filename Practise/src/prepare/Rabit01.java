package prepare;
import java.util.Scanner;
public class Rabit01 {
	@SuppressWarnings({ "resource" })
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.nextLine();
		System.out.println(a.replaceAll("[^a-zA-Z0-9]",""));
	}
}

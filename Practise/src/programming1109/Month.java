package programming1109;
import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year");
		int b = s.nextInt();
		System.out.println("Enter the value");
		int a = s.nextInt();
		switch(a)
		{
		case 1: System.out.println("Month is \"January\"");
		System.out.println("Number of days \"31\"");
		break;
		case 2: System.out.println("Month is \"Fibruary\"");
		if(b%4==0)
		System.out.println("Number of days \"29\"");
		else
		System.out.println("Number of days \"28\"");
		break;
		case 3: System.out.println("Month is \"March\"");
		System.out.println("Number of days \"31\"");
		break;
		case 4: System.out.println("Month is \"April\"");
		System.out.println("Number of days \"30\"");
		break;
		case 5: System.out.println("Month is \"May\"");
		System.out.println("Number of days \"31\"");
		break;
		case 6: System.out.println("Month is \"June\"");
		System.out.println("Number of days \"30\"");
		break;
		case 7: System.out.println("Month is \"July\"");
		System.out.println("Number of days \"31\"");
		break;
		case 8: System.out.println("Month is \"August\"");
		System.out.println("Number of days \"31\"");
		break;
		case 9: System.out.println("Month is \"September\"");
		System.out.println("Number of days \"30\"");
		break;
		case 10: System.out.println("Month is \"October\"");		
		System.out.println("Number of days \"31\"");
		break;
		case 11: System.out.println("Month is \"November\"");
		System.out.println("Number of days \"31\"");
		break;
		case 12: System.out.println("Month is \"December\"");
		System.out.println("Number of days \"31\"");
		break;
		default : System.out.println("It is invalid number");
		break;
		}		
		
	}

}

package prepare;
import java.util.Scanner;

public class Testcase03 {	
		public boolean sleep(boolean weekday, boolean vacation)
		{
			if(weekday == true || vacation == false){
				return false;
			}
				else{
					return true;
				}
			}
		public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the weekday");
			boolean a = s.nextBoolean();
			System.out.println("Enter the Vacation");
			boolean b = s.nextBoolean();
			s.close();
			Testcase03 t = new Testcase03();
			boolean c = t.sleep(a, b);
			System.out.println(c);
			
	}

}

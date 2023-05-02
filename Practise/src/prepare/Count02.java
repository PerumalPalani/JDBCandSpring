package prepare;
import java.util.Scanner;
public class Count02 {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the some content:");
		String s1 = s.nextLine();
		s.close();
		int[] a = new int[127];
		for(int i=0; i<s1.length(); i++)
		{
			char ch =s1.charAt(i);
			a[ch]++;
		}
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != 0)
			{
				System.out.println((char)(i)+" "+a[i]);
			}
		}
		
	}

}

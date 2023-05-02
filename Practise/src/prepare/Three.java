package prepare;
import java.util.Scanner;

public class Three {
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");        
		String s1 = s.nextLine();                      
		System.out.println("Enter the array size");    
		int size = s.nextInt();                        
		int a[] = new int[size];                       
		for (int i=0; i<=s1.length()-1;i++) 
		{
			char ch = s1.charAt(i);   
			a[ch]++;
		}
		for(int i = 0; i<a.length-1; i++) 
		{
			if(a[i] != 0)
			{
				System.out.println((char)(i)+" "+a[i]);				
			}
		}		
	}
}

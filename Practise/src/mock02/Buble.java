package mock02;
import java.util.*;

public class Buble {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int a = s.nextInt();
		int b[] = new int[a];
		for(int i = 0; i<b.length; i++)
		{
			System.out.println("Enter the array values"+i);
			int c = s.nextInt();
			b[i] = c;
		}
		for(int i= 0; i<b.length; i++)
		{
			for(int j = 0; j<b.length-1; j++ )
			{
				if(b[j]>b[j+1])
				{
					int temp = b[j];
					b[j] = b[j+1];
					b[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}

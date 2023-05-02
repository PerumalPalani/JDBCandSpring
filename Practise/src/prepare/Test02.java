package prepare;
import java.util.Scanner;
public class Test02 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array size");
		int C = s.nextInt();
		int A[] = new int[C];
		for(int j=0; j<C; j++)
		{
			System.out.println("Enter the array value of"+j);
			A[j] = s.nextInt();			
		}
		int N = A.length;
		System.out.println("Enter the number of rotations");
		int K = s.nextInt();
		s.close();
		for(int i = 0; i<N; i++) 
		{			
			if(i<K)
			{
				System.out.print(A[N+i-K]+ " ");
			}
			else
			{
				System.out.print(A[i-K]+" ");
			}
	
		}
	}

}

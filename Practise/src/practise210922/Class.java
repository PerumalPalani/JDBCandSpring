package practise210922;

public class Class {
	static int fibo(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		int x = fibo(n-1); 
		int y = fibo(n-2);
		int c = x+y;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		System.out.println(fibo(5));
		
	}

}

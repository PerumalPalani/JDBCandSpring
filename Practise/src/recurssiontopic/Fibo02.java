package recurssiontopic;

public class Fibo02 {	
		int fib(int n)
		{
			if(n==0 || n==1)
			{
				return 1;
			}
			else{
				return fib(n-1)+fib(n-2);
			}
		}
		public static void main(String[] args) {
			Fibo02 a = new Fibo02();
			System.out.println(a.fib(5));
		
	}

}

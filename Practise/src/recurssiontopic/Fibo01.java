package recurssiontopic;

public class Fibo01 {
	static int f1;
	static int f2=1; 
	static int f3;
	static void fib(int n){
		if(n==0)
		{
			System.exit(0);
		}
		else {
		f3 = f1+f2;
		f1 = f2;
		f2 = f3;		
		System.out.print(f3+" ");
		fib(n-1);
		}	
	}		
	public static void main(String[] args) {
		System.out.println("it is fibonacci");
		System.out.print(f1+" "+f2+" ");
		fib(5);	
	}

}

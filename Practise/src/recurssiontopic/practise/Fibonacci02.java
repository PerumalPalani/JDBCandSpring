package recurssiontopic.practise;

public class Fibonacci02 {
	static int f1 = 0;
	static int f2 = 1;
	static int f3;			
	public void fib(int num)
	{
		if(num == 0){
			System.out.println("The fibonacci value is");
		}
		else{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			fib(num - 1);			
		}
	}
	public static void main(String[] args) {
		Fibonacci02 f = new Fibonacci02();
		f.fib(5);
		System.out.println(f3);
	}


}

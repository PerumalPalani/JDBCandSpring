package recurssiontopic.practise;

public class Fibonacci01 {
	public static int fib(int num){
		if(num == 0 || num == 1){
			return 1;
		}
		else{
			return fib(num-1)+fib(num-2);
		}
	}
	public static void main(String[] args) {
		System.out.println("The fibonacci series is:");
		System.out.println(fib(5));
	}

}

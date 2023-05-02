package recurssiontopic.practise;

public class Factorial01 {
	public static int fact(int num){
		if(num < 1){
			return 1;
		}
		else{
			return num*fact(num-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("factorial number is:");
		System.out.println(fact(5));
	}

}

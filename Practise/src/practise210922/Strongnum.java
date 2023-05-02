package practise210922;

public class Strongnum {
	public static void main(String[] args) {
		int a = 145;
		int sum = 0;
		int copy = a;
		while (a != 0){
			int rem = a%10;
			int fact = 1;
			for(int i=1; i<=rem; i++){
				fact = fact *i;
			}
			sum = sum + fact;
			a = a/10;
		}
		if(copy == sum){
			System.out.println("It is strong number"+sum);
		}
		else{
			System.out.println("It is not strong number" +sum);
		}
	}

}

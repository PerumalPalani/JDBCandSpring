package practise210922;

public class NumPal {
	public static void main(String[] args) {
		int a = 454;
		int rev = 0;
		int copy = a;
		while (a != 0){
			int rem = a%10;
			rev = (rev*10)+rem;
			a =a/10;
		}
		if( copy == rev)
		{
			System.out.println("It is palindrome"+rev);
		}
		else {
			System.out.println("It is not palindrome"+rev);
		}
	}

}

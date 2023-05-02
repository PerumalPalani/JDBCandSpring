package recurssiontopic;

public class Sumof01 {
	static int a = 246;
	static int rem;
	static int sum;
	static void add(int n)
	{
		if(n == 0)
		{
			System.out.println("Summation of given numbers");
		}
		else{
			rem = a%10;
			sum = sum+rem;
			a = a/10;			
			add(n-1);		
		}
		
	}
	public static void main(String[] args) {
		add(3);
		System.out.println(sum);
	}

}

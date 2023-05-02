package recurssiontopic;

public class Fact01 {
	static int fact(int n)
	{
		if(n>5)
		{
			return 1;
		}
		else{
			return n* fact(n+1);
			
			
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(fact(1));
	}

}

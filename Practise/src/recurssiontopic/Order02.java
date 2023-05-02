package recurssiontopic;

public class Order02 {
	static void count(int n)
	{
		if(n>10)
		{
			System.out.println("the desending orders are");
		}
		else
		{
			count(n+1);
			if(n%2==1)
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		count(1);
		
	}

}

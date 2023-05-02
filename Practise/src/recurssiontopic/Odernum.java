package recurssiontopic;

public class Odernum {
	static void count(int num)
	{
		if(num < 1)
		{
			System.out.println("The number is equal to 10");
		}
		else {
			count(num-1);
			if(num%2==1)
			{
			System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		count(13);
	}

}

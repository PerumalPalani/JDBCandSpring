package practise02;

class Fruits
{
	void count()
	{
		int apple = 1025;
		int orange = 1544;
		int cnt = apple + orange;
		System.out.println("The count fruits are:" +cnt);
	}
}

public class Comp {
	public static void main(String args[])
	{
		Fruits f = new Fruits();
		f.count();
	}

}

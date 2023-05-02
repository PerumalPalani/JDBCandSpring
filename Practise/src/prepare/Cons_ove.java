package prepare;
class Pappu
{
	Pappu(int a){
		System.out.println("hi");
	}
	Pappu(int a, String b)
	{
		this("a", 1);
		System.out.println("Hello");
	}
	Pappu(String b, int a)
	{
		this(5);
		System.out.println("Message");
	}
	Pappu(String b)
	{
		this(10, "happy");
		System.out.println("World");
	}
	Pappu()
	{
		System.out.println("Hey i am");
	}
}

public class Cons_ove {
	public static void main(String args[])
	{
	 new Pappu("hello");
		
	}

}

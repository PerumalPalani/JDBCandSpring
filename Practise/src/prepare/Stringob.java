package prepare;

public class Stringob {
	int a;
	String name;
	Stringob(int a, String name)
	{
		this.a = a;
		this.name = name;
	}
	public static void main(String arg[])
	{
		Stringob s = new Stringob(15, "Fruits");
		System.out.println(s.a);
	}

}

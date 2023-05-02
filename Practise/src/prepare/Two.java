package prepare;
class Annachi
{
	Annachi()
	{
	System.out.println("Hi");
	}
}
class Annach extends Annachi
{
	Annach(int a){
		System.out.println("hello");
	}
}
class Annac extends Annach
{
	Annac(String b)
	{
		super(2);
		System.out.println("World");
	}
}
class Anna extends Annac
{
	Anna(int a, String b)
	{
		super("c");
		System.out.println("Happy");
	}
	
}
class Ann extends Anna
{
	Ann(String b, int a)
	{
		super(1, "b");
		System.out.println("Earth");
	}
}


public class Two {
	public static void main(String args[])
	{
		new Ann("a", 5);
	}

}

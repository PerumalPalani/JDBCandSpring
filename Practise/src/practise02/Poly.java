package practise02;
class Fruit
{
	void juice()
	{
		System.out.println("It is some tasty and different colour");
	}
}
class Apple05 extends Fruit
{
	void juice()
	{
		System.out.println("It is little sweet and tast then colour for white");
	}
}
class Orange extends Fruit
{
	void juice()
	{
		System.out.println("It is sweet tart and colour orange");
	}
}
class Sapodilla extends Fruit
{
	void juice()
	{
		System.out.println("It is brown sugar, sweet potato and pear tasty then colour for brown");
	}
}
class Shop
{
	static void juicePrepare(Fruit f)
	{
		f.juice();
	}
}
public class Poly {
	public static void main(String  args[])
	{
		Apple05 a = new Apple05();
		Orange o = new Orange();
		Sapodilla s = new Sapodilla();
		Shop.juicePrepare(a);
		Shop.juicePrepare(o);
		Shop.juicePrepare(s);
		
	}

}

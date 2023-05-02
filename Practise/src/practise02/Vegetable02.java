package practise02;
interface Vegetable01
{
	void colour();
}
class Poteto01 implements Vegetable01
{
	public void colour()
	{
		System.out.println("vegetable brown colour");
	}
}
class Ladiesfinger01 implements Vegetable01
{
	public void colour()
	{
		System.out.println("Vegetable is green colour");
	}
}
class Caret01 implements Vegetable01
{
	public void colour()
	{
		System.out.println("It is Orange colour");
		
	}
}
class Shop302
{
	static void purchase(Vegetable01 v)
	{
		v.colour();
	}
}


public class Vegetable02 {
	public static void main(String args[])
	{
		Poteto01 p = new Poteto01();
		Ladiesfinger01 l = new Ladiesfinger01();
		Caret01 c = new Caret01();
		Shop302.purchase(p);
		Shop302.purchase(l);
		Shop302.purchase(c);
	}

}

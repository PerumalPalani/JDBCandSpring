package practise02;
class Vegetable
{
	void colour()
	{
		System.out.println("Vegetable have some colour");
	}
}
class Poteto extends Vegetable
{
	void colour()
	{
		System.out.println("vegetable brown colour");
	}
}
class Ladiesfinger extends Vegetable
{
	void colour()
	{
		System.out.println("Vegetable is green colour");
	}
}
class Caret extends Vegetable
{
	void coloyr()
	{
		System.out.println("It is Orange colour");
		
	}
}
class Shop3
{
	static void purchase(Vegetable v)
	{
		v.colour();
	}
}

public class Owner02 {
	public static void main(String args[])
	{
		Poteto p = new Poteto();
		Ladiesfinger l = new Ladiesfinger();
		Caret c = new Caret();
		Shop3.purchase(p);
		Shop3.purchase(l);
		Shop3.purchase(c);
	}

}

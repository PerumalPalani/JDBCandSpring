package practise02;
class Electric
{
	void device()
	{
		System.out.println("It is device description");
	}
}
class Mobile extends Electric
{
	void device()
	{
		System.out.println("It is hand mobile devices");
	}
}
class Laptop extends Electric
{
	void device()
	{
		System.out.println("It is carry bag devices");
	}
}
class Computer extends Electric
{
	void device()
	{
		System.out.println("It is table computer devices");
	}
}
class Shop1
{
	static void com(Electric e)
	{
		e.device();
	}
}

public class E_shop {
	public static void main(String args[])
	{
		Mobile m = new Mobile();
		Laptop l = new Laptop();
		Computer c = new Computer();
		Shop1.com(m);
		Shop1.com(l);
		Shop1.com(c);
	}

}

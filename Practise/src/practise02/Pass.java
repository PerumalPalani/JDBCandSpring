package practise02;
class Transport
{
	void via()
	{
		System.out.println("Passing through via");
	}
}
class Metro extends Transport
{
	void via()
	{
		System.out.println("Passing via Track");
	}
}
class Bus extends Transport
{
	void via()
	{
		System.out.println("Passing via tar road");
	}
}
class Ship extends Transport
{
	void via()
	{
		System.out.println("Passing via water");
	}
}
class Vehicle
{
	static void trans(Transport t)
	{
		t.via();
	}
}

public class Pass {
	public static void main(String args[])
	{
		Metro m = new Metro();
		Bus  b = new Bus();
		Ship s = new Ship();
		Vehicle.trans(m);
		Vehicle.trans(b);
		Vehicle.trans(s);
	}

}

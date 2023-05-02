package prepare;
class Transport
{
	void sound() {
		System.out.println("Some sound");
	}
}
class Car extends Transport
{
	void sound() {
		System.out.println("Silent sound");
	}
}
class Bus extends Transport
{
	void sound()
	{
		System.out.println("busss soud");
	}
}
class Train extends Transport
{
	void sound()
	{
		System.out.println("Zig zig zig sound");
	}
}
class Vehicle02
{
	static void feel1(Transport t)
	{
		t.sound();
		
	}
}
public class Trans {
	public static void main(String args[])
	{
		Car c = new Car();
		Bus b = new Bus();
		Train t = new Train();
		Vehicle02.feel1(c);
		Vehicle02.feel1(b);
		Vehicle02.feel1(t);
		
	}

}

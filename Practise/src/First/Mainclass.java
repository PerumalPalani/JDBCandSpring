package First;
abstract class Demo
{
	abstract void disp();
	abstract void test();
}
class Sample extends Demo
{
	void disp()
	{
		System.out.println("Hello");
	}
	void test()
	{
		System.out.println("World");
	}
}

public class Mainclass {
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.disp();
		s.test();
	}

}

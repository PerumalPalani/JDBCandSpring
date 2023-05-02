package Interfacetopic;
interface Apple
{
	void disp();
	void test();
}
abstract class Ball implements Apple
{
	@Override
	public void disp()
	{
		System.out.println("Hello");
	}
}
class Cat extends Ball
{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hey i am cool");
	}
	
}

public class Inter2 {
	public static void main(String args[])
	{
		Cat c = new Cat();
		c.disp();
		c.test();
	}

}

package Interfacetopic;

interface Demo
{
	void test();
	void disp();
}
class Sample implements Demo
{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

}
public class Inter1{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.test();
		s.disp();
	}

}

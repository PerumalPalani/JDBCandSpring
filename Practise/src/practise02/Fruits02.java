package practise02;
interface Fruit01
{
	void juice();
}
class Apple02 implements Fruit01
{
	public void juice()
	{
		System.out.println("vegetable brown colour");
	}
}
class Orange02 implements Fruit01
{
	public void juice()
	{
		System.out.println("Vegetable is green colour");
	}
}
class Sapodilla02 implements Fruit01
{
	public void juice()
	{
		System.out.println("It is Orange colour");
		
	}
}
class Shop303
{
	static void prepare(Fruit01 v)
	{
		v.juice();
	}
}

public class Fruits02 {
	public static void main(String args[])
	{
		Apple02 p = new Apple02();
		Orange02 o = new Orange02();
		Sapodilla02 s = new Sapodilla02();
		Shop303.prepare(p);
		Shop303.prepare(o);
		Shop303.prepare(s);
	}

}

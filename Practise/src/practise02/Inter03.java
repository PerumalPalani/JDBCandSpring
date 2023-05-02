package practise02;
interface Inter02
{
	int a = 12;
	int b = 15;
	void tool();
	void engine();
}
class Inter01 implements Inter02
{
	public void tool()
	{
		System.out.println("hello");
	}
	public void engine()
	{
		System.out.println("World");
	}
}

public class Inter03 {
	public static void main(String[] args) {
		Inter01 i = new Inter01();
		i.engine();
		i.tool();
		int c = i.a + i.b;
		System.out.println(c);
		
	}

}

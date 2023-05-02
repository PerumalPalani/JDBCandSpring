package encapsulation;

public class Apple {
	private int a = 20;
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public static void main(String args[]){
		Apple a1 = new Apple();
		System.out.println(a1.getA());
		a1.setA(10);
		System.out.println(a1.getA());
		
	}

}

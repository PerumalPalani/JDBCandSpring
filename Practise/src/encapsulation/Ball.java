package encapsulation;

public class Ball {
	private String s = "Hello";
	public String getA()
	{
		return s;
	}
	public void setA(String s){
		this.s = s;
	}
	
	public static void main(String args[])
	{
		Ball b = new Ball();
		System.out.println(b.getA());
		b.setA("World!");
		System.out.println(b.getA());		
	}

}

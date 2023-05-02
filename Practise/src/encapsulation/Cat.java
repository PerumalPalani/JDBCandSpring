package encapsulation;

public class Cat {
	private char ch = 'A';
	public char getA()
	{
		return ch;
	}
	public void setA(char ch){
		this.ch = ch;
	}
	public static void main(String args[]){
		Cat c = new Cat();
		System.out.println(c.getA());
		c.setA('Z');
		System.out.println(c.getA());
	}

}

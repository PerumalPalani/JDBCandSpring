package First;
class Apple {
	void disp() {
		System.out.println("hi");
	}
}
class Ball extends Apple {
	void tata() {
		System.out.println("hello");
	}
}
public class Reverse2 {
	public static void main(String args[]) {
	Apple a = new Ball();
	a.disp();
	Ball b = (Ball)a;
	b.tata();
	}
	
	

}
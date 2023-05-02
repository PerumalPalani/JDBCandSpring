package encapsulation;

public class Elephant {
private double a = 45.88;
public double getA(){
	return a;
}
public void setA(double a){
	this.a = a;
}
public static void main(String args[]){
	Elephant e = new Elephant();
	System.out.println(e.getA());
	e.setA(50.98);
	System.out.println(e.getA());
}
}

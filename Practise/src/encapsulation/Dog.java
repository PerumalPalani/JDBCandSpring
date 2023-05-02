package encapsulation;

public class Dog {
	private boolean a = true;
	public boolean getA(){
		return a;
	}
	public void setA(boolean a){
		this.a = a;
	}
	public static void main(String args[]){
		Dog d = new Dog();
		System.out.println(d.getA());
		d.setA(false);
		System.out.println(d.getA());
	}

}

package objectclasstopic;

public class Car {
	double c_cost;
	String c_name;
	String c_type;
	Car(double c_cost, String c_name, String c_type){
		this.c_cost = c_cost;
		this.c_name = c_name;
		this.c_type = c_type;
	}
	public String toString(){
		return c_cost+" "+c_name+" "+c_type;
	}
	public static void main(String args[]){
		Car c = new Car(15000, "Samsung", "Android");
		System.out.println(c);
	}

}

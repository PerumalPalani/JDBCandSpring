package objectclasstopic;

public class Laptop {
	String name;
	double cost;
	String brand;
	Laptop(String name, double cost, String brand)
	{
		this.name = name;
		this.cost = cost;
		this.brand = brand;
	}
	public String toString()
	{
		return name+" "+cost+" "+brand+" ";
	}
	public static void main(String[] args) {
		Laptop l = new Laptop("Android", 10000, "Lenovo");
		System.out.println(l);
	}

}

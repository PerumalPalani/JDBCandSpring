package objectclasstopic;

public class Bike {
	double cost;
	String brand;
	String colour;
	Bike(double cost, String brand, String colour)
	{
		this.cost = cost;
		this.brand = brand;
		this.colour = colour;
	}
	public String toString()
	{
		return cost+" "+brand+" "+colour;
	}
	public static void main(String[] args) {
		Bike b = new Bike(100000, "Honda", "Shine_black");
		System.out.println(b);
	}

}

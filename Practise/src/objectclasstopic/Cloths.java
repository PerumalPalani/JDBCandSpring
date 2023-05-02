package objectclasstopic;

public class Cloths {
	String colour;
	double cost;
	String size;
	Cloths(String colour, double cost, String size)
	{
		this.colour = colour;
		this.cost = cost;
		this.size = size;
	}
	public String toString()
	{
		return colour+" "+cost+" "+size;
	}
	public static void main(String[] args) {
		Cloths c = new Cloths("Yellow", 550, "L/M/XL");
		System.out.println(c);
	}

}

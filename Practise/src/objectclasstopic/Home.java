package objectclasstopic;

public class Home {
	String name;
	double cost;
	String colour;
	Home(String name, double cost, String colour)
	{
		this.name = name;
		this.cost = cost;
		this.colour = colour;
	}
	public String toString()
	{
		return name+" "+cost+" "+colour;
	}
	public static void main(String[] args) {
		Home h = new Home("Palani_Seenivasan", 1000000, "Biscuit");
		System.out.println(h);
	}

}

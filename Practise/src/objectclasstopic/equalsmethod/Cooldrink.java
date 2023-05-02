package objectclasstopic.equalsmethod;

public class Cooldrink {
	String name;
	double cost;
	int qty;
	String brand;
	Cooldrink(String name, double cost, int qty, String brand)
	{
		this.name = name;
		this.cost = cost;
		this.qty = qty;
		this.brand = brand;
	}
	public boolean equals(Object obj)
	{
		Cooldrink c3 = (Cooldrink)obj;
		return this.cost < c3.cost;
	}
	public static void main(String[] args) {
		Cooldrink c1 = new Cooldrink("Cola", 30, 1, "Cococola");
		Cooldrink c2 = new Cooldrink("soda", 50, 1, "7up");
		if(c1.equals(c2))
		{
			System.out.println("7up cost is high");
		}
		else
		{
			System.out.println("Cola cost is high");
		}
	}

}

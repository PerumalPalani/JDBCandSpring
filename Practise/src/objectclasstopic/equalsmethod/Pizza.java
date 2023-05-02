package objectclasstopic.equalsmethod;

public class Pizza {
	String name;
	double price;
	int qty;
	String location;
	Pizza(String name, double price, int qty, String location)
	{
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.location = location;
	}
	public boolean equals(Object obj)
	{
		Pizza p3 = (Pizza)obj;
		return this.price < p3.price;
	}
	public static void main(String[] args) {
		Pizza p1 = new Pizza("Domino", 100, 1, "Bangalore");
		Pizza p2 = new Pizza("Pizza hut", 200, 1, "Bangalore");
		System.out.println(p1.equals(p2));
	}

}

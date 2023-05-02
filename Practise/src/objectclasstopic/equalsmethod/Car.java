package objectclasstopic.equalsmethod;

public class Car {
	String colour;
	String brand;
	double price;
	Car(String colour, String brand, double price)
	{
		this.colour = colour;
		this.brand = brand;
		this.price = price;
	}
	public boolean equals(Object obj)
	{
		Car c3 = (Car)obj;
		return this.price < c3.price;
	}
	public static void main(String[] args) {
		Car c1 = new Car("Shine black", "Maruthi", 300000);
		Car c2 = new Car("Shine red", "Honda", 500000);
		if(c1.equals(c2))
		{
			System.out.println("Honda is high price");
		}
		else {
			System.out.println("Maruthi is high price");
		}
	}

}

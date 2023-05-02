package objectclasstopic;

public class Course {
	String name;
	String u_name;
	double cost;
	Course(String name, String u_name, double cost)
	{
		this.name = name;
		this.u_name = u_name;
		this.cost = cost;
	}
	public String toString()
	{
		return name+" "+u_name+" "+cost;
	}
	public static void main(String[] args) {
		Course c = new Course("CSE", "ANNA", 25000);
		System.out.println(c);
	}

}

package objectclasstopic;

public class Employee {
	int id;
	double salary;
	char grade;
	Employee(int id, double salary, char grade)
	{
		this.id = id;
		this.salary = salary;
		this.grade = grade;
	}
	public String toString()
	{
		return id+" "+salary+" "+grade;
	}
	public static void main(String[] args) {
		Employee e = new Employee(102, 50000, 'A');
		System.out.println(e);
	}

}

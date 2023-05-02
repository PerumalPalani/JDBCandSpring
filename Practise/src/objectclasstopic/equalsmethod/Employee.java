package objectclasstopic.equalsmethod;

public class Employee {
	String name;
	double sal;
	String dept;
	String c_name;
	Employee(String name, double sal, String dept, String c_name)
	{
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.c_name = c_name;
	}
	public boolean equals(Object obj)
	{
		Employee e3 = (Employee)obj;
		return this.sal < e3.sal;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Vijay", 50000, "developer", "ABC pvt.ltd");
		Employee e2 = new Employee("Thalapathy", 70000, "Tester", "DEF pvt.ltd");
		if(e1.equals(e2))
		{
			System.out.println("It is true");
		}
		else
		{
			System.out.println("It is false");
		}
	}

}

package compareandcomparator;
import java.util.*;
import java.io.*;
class Employee{
	int rollno;
	String name;
	int age;
	Employee(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
class AgeComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		if(e1.age == e2.age){
			return 0;
		}
		else if(e1.age > e2.age){
			return 1;
		}
		else{
			return -1;
		}
	}
}
class NameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.name.compareTo(e2.name);
	}
}
public class ComparatorTest {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(201, "Chitra", 45));
		al.add(new Employee(202, "Kalaiselvi", 28));
		al.add(new Employee(210, "kalaiyarasi", 24));
		
		System.out.println("Sorting by Name:");
		Collections.sort(al, new NameComparator());
		for(Employee e: al){
			System.out.println("The Employee Details are "+e.rollno+" "+e.name+" "+e.age);
		}
		System.out.println("Sorting by Age: ");
		Collections.sort(al, new AgeComparator());
		for(Employee e: al){
			System.out.println("The employee details are: "+e.rollno+" "+e.name+" "+e.age);
		}		
	}
}

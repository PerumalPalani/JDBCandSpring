package compareandcomparator;
import java.util.*;
import java.io.*;
class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(int rollno, String name,int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int compareTo(Student st){
		if(age == st.age){
			return 0;
		}
		else if(age>st.age){
			return 1;
		}
		else{
			return -1;
		}
	}
}

public class ComparableTest {
	public static void main(String args[]){
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Perumal", 26));
		al.add(new Student(106, "Kumarvel", 22));
		al.add(new Student(110, "HemKrish", 01));
		Collections.sort(al);
		for(Student st: al){
			System.out.println("The student is "+st.rollno+" "+st.name+" "+st.age);
		}
		
	}

}

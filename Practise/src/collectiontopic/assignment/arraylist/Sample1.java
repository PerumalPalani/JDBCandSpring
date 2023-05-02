package collectiontopic.assignment.arraylist;
import java.util.ArrayList;
import java.util.Vector;

public class Sample1 {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(23.90);
		l.add("hello");
		l.add('A');
		l.add(true);
		System.out.println("====>"+l);
		Vector v = new Vector(l);
		System.out.println(v);		
		
	}

}

package collectiontopic.assignment.arraylist;
import java.util.ArrayList;
import java.util.Vector;

public class Sample3 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add("happy");
		a.add(true);
		Vector v = new Vector();
		v.add(10);
		v.add(10);
		v.add(20);
		v.add("Hello");
		v.add(false);
		v.remove(false);
		System.out.println(v);		
		
	}

}

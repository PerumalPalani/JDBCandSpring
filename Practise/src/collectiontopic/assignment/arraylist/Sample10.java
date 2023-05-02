package collectiontopic.assignment.arraylist;

import java.util.ArrayList;
import java.util.Vector;

public class Sample10 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(true);
		a.add("hi");
		a.add('A');
		Vector v = new Vector();
		v.add(10);
		v.add("healthy");
		v.add('c');
		System.out.println(a);
		System.out.println(v);
		System.out.println(a.size());
		System.out.println(v.size());
		
	}

}

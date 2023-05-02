package collectiontopic.assignment.arraylist;

import java.util.ArrayList;
import java.util.Vector;

public class Sample9 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(50);
		a.add("world");
		a.add(true);
		a.add('B');
		Vector v = new Vector();
		v.add("world");
		v.add('B');
		v.add(false);
		v.add("happy");
		System.out.println(a);
		System.out.println(v);
		System.out.println("------fetch------");
		System.out.println(a.get(1));
		System.out.println(v.get(3));
		
	}

}

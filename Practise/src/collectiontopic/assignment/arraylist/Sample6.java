package collectiontopic.assignment.arraylist;

import java.util.ArrayList;
import java.util.Vector;

public class Sample6 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(123);
		a.add(12.56);
		a.add("happness");
		a.add(false);
		Vector v = new Vector();
		v.add(123);
		v.add(13.78);
		v.add("apple");
		v.add(true);
		v.addAll(2, a);
		System.out.println(v);		
	}

}

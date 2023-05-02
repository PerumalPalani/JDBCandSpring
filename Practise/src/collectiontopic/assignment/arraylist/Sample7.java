package collectiontopic.assignment.arraylist;

import java.util.ArrayList;
import java.util.Vector;

public class Sample7 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();		
		a.add(30);
		a.add(20);
		a.add(true);
		a.add("A");
		Vector v = new Vector();
		v.add(20);
		v.add(true);
		v.add("A");
		System.out.println("before==>>"+a);
		System.out.println("before==>>"+v);
		v.add(1, 129);
		a.add(2, 500);
		System.out.println(a);
		System.out.println(v);
	}

}

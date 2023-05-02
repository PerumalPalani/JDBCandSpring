package collectiontopic.assignment.arraylist;

import java.util.ArrayList;
import java.util.Vector;

public class Sample8 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(30);
		a.add(20);
		a.add(true);
		a.add('A');
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(true);
		v.add("B");
		System.out.println("Befor ==>"+a);
		System.out.println("Befor ==>"+v);
		a.removeAll(v);
		System.out.println(a);
	
	}

}

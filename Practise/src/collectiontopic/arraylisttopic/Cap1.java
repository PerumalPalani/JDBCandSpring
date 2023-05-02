package collectiontopic.arraylisttopic;

import java.util.Vector;

public class Cap1 {
	public static void main(String[] args) {
		Vector  l = new Vector(3);
		System.out.println("Initial capacity ==>"+l.capacity());
		l.add(10);
		l.add("hello");
		l.add('A');
		l.add(true);
		l.add(30.7);
		System.out.println(l);
		System.out.println("After the capacity ==>"+l.capacity());
		
	}

}

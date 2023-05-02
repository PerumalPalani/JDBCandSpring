package collectiontopic.assignment.arraylist.priority;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(50);
		a.add(70);
		PriorityQueue p = new PriorityQueue();
		p.add(20);
		p.add(90);
		p.add(70);
		System.out.println(a);
		System.out.println(p);
		System.out.println("------------Starts remove all----------------");
		p.removeAll(a);
		System.out.println(p);		
	}

}

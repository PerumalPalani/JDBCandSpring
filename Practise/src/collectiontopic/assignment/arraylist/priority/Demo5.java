package collectiontopic.assignment.arraylist.priority;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Demo5 {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(90);
		p.add(10);
		p.add(60);
		p.add(30);
		p.add(50);
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(70);
		a.add(50);
		p.retainAll(a);
		System.out.println(p);
		
	}

}

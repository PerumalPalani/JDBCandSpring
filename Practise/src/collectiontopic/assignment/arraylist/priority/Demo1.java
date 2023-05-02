package collectiontopic.assignment.arraylist.priority;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(30);
		a.add(30);
		a.add(90);
		a.add(60);
		PriorityQueue p = new PriorityQueue();
		p.add(10);
		p.add(50);
		p.add(40);
		p.add(70);
		p.addAll(a);
		System.out.println(p);
	}

}

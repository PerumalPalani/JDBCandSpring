package collectiontopic.assignment.arraylist.priority;

import java.util.PriorityQueue;

public class Demo10 {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(64);
		p.add(20);
		p.add(19);
		p.add(05);
		p.add(90);
		p.add(46);
		PriorityQueue p1 = new PriorityQueue();
		p1.add(27);
		p1.add(30);
		p1.add(20);
		p1.add(05);
		System.out.println(p);
		System.out.println(p1);
		System.out.println("-----starts----");
		p.addAll(p1);
		System.out.println(p);
	}

}

package collectiontopic.assignment.arraylist.priority;

import java.util.PriorityQueue;

public class Demo9 {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(80);
		p.add(30);
		p.add(20);
		p.add(10);
		p.add(50);
		p.add(60);
		System.out.println("Before Peeking ==>"+p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p);		
	}
}

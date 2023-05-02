package collectiontopic.assignment.arraylist.priority;

import java.util.PriorityQueue;

public class Demo4 {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(90);
		p.add(50);
		p.add(70);
		p.add(80);
		p.add(30);
		p.remove(70); //priority queue
		System.out.println(p);
	}

}

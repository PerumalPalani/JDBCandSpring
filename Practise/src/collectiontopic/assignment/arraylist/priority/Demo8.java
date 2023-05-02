package collectiontopic.assignment.arraylist.priority;

import java.util.PriorityQueue;

public class Demo8 {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add(80);
		p.add(30);
		p.add(90);
		p.add(79);
		p.add(49);
		p.add(45);
		System.out.println("Before poll: ==>" +p);		
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println(p);
	}

}

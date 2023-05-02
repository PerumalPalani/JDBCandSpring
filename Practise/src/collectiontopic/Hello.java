package collectiontopic;
import java.util.*;

public class Hello {
	@SuppressWarnings("rawtypes")
	static ArrayList al = new ArrayList();
	@SuppressWarnings("rawtypes")
	static ArrayList al2 = new ArrayList();
	public static void main(String[] args) {
		al.add(10);
		al.add("hello");
		al.add('a');
		al.add(true);
		al.add(14.25);
		System.out.println(al);
		al2.add(50);
		al2.add("hello");
		al2.add('a');
		al2.add(false);
		al2.add(16.58);
//		al.addAll(al2);
//		al.addAll(2, al2);
//		al.add(1, "happy");
//		al.remove(1);
//		al.removeAll(al2);
//		al.retainAll(al2);	
//		System.out.println(al.contains("hello"));		
//		System.out.println(al.get(1));
		System.out.println(al.size());
		
		
		
	}

}

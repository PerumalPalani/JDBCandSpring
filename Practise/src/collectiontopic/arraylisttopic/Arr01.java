package collectiontopic.arraylisttopic;

import java.util.ArrayList;

public class Arr01 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("Hello");
		a.add('a');
		a.add(20.67);
		System.out.println(a);
		ArrayList a1 = new ArrayList();
		a1.add(25);
		a1.add("hi");
		a1.add('b');
		a1.add(20.67);
		System.out.println(a1);
		a.addAll(2,a1);
		System.out.println(a);
	}

}

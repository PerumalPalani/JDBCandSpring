package collectiontopic.assignment.arraylist;
import java.util.ArrayList;
import java.util.Vector;

public class Sample2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(20);
		a.add(30);
		a.add(25.6);
		a.add(true);
		Vector v = new Vector();
		v.add(20);
		v.add(25.6);
		v.add(false);
		System.out.println("before"+a);
		System.out.println("before"+v);
		v.addAll(a);
		System.out.println(v);
	}

}

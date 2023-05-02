package collectiontopic.assignment.arraylist;
import java.util.ArrayList;
import java.util.Vector;

public class Sample4 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(25.9);
		a.add(true);
		a.add('B');
		Vector v = new Vector();
		v.add(10);
		v.add(27);
		v.add(false);
		v.add('B');
		v.retainAll(a);
		System.out.println(v);		
	}

}

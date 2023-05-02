package collectiontopic.assignment.arraylist;
import java.util.ArrayList;
import java.util.Vector;
public class Sample5 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(19);
		a.add(20.4);
		a.add(true);
		a.add('B');
		Vector v = new Vector();
		v.add(23);
		v.add(30);
		v.add(true);
		v.add('C');
		System.out.println(v.contains('C'));		
	}

}

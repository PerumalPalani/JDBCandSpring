package collectiontopic.map;


import java.util.HashMap;
import java.util.Map.Entry;

public class Demo1 {
	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<>();
		h.put("name", 10);
		h.put("number", 20);
		h.put("count", 30);
		System.out.println(h);
		 for(Entry e: h.entrySet())
		 {
			System.out.println(e.getKey()+" "+e.getValue()+" "); 
		 }
	
		
	}

}

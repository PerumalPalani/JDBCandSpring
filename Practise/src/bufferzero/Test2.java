package bufferzero;

public class Test2 {
	public static void main(String[] args) {
		String s ="Who are you";
		String[] s1 = s.split(" ");
		String s2 ="";
		for(int i = s1.length-1; i >= 0; i--){
			s2 += s1[i]+" ";
		}
		System.out.println(s2);
		
		
	}

}

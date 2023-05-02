package prepare;

public class Stringtest {
	public static void main(String[] args) {
		String s = "8088975359";
	
		int[] b = new int[123];
		for(int i = 0; i<s.length(); i++){
			char a = s.charAt(i);
			b[a]++;
		}
		for(int i = 0; i<b.length; i++){
			if(b[i] != 0){
				System.out.println((char)(i)+" "+b[i]);
			}
		}
	}

}

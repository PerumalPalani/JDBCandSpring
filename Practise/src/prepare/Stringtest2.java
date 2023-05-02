package prepare;

public class Stringtest2 {
	public static void main(String[] args) {
		String s = "hello world";
		String s1[] = s.split(" ");
		for(int i =0; i<s1.length; i++){
			char[] a = s1[i].toCharArray();
			for(int j = a.length-1; j>=0; j--){
				System.out.print(a[j]);
			}
			System.out.print(" ");
		}
	}

}

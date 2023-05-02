package stringtopic;

public class Basic {
	public static void main(String[] args) {
		
		
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("OK");
		String s4 = new String("OK");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}

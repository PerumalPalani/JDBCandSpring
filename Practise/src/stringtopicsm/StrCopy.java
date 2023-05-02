package stringtopicsm;

public class StrCopy {
	public static void main(String[] args) {
		String s = "Hello";
		String c = String.valueOf(s);
		String c1 = String.valueOf(s.toCharArray(), 0, s.length());
		String c3 = String.copyValueOf(s.toCharArray());
		String c4 = String.copyValueOf(s.toCharArray(),0, s.length());
		System.out.println(c==c1);
		System.out.println(c+" of "+c1);
		System.out.println(c3.equals(c4));
	}

}

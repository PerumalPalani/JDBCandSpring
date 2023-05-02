package prepare;

public class Reverse01 {
	public static void main(String args[])
	{
		String s1 = "Automation is machine";
		StringBuilder s2 = new StringBuilder();
		s2.append(s1);
		s2 = s2.reverse();
		System.out.println(s2);
		
	}

}

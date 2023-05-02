package program;

public class Apple01 {
	public static void main(String[] args) {
		String s1 = "Happy new year";
		String s2[] = s1.split(" ");
		String s3 ="";
		String s4 ="";
		for(int i = s2.length-1; i>=0; i--)
		{
			s4 = s2[i];
			String s5="";
			for(int j=s4.length()-1; j>=0; j--)
			{
				s5 = s5+s4.charAt(j);
			}
			s3 = s3+s5+" ";			
		}
		System.out.println(s3);
		System.out.println(s4);
	}

}

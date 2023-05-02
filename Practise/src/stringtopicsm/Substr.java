package stringtopicsm;

public class Substr {
	static String strsub(String s1, String s2, int a){
		String s3 ="";
		for(int i=0; i<s1.length();i++)
		{
			s3 += s1.charAt(i);
			if(i == a)
			{
				s3 += s2+" ";
			}
		}
		return s3;
	}
	public static void main(String[] args) {
		String s1 = "happy to all";
		String s2 = "jurney";
		int a = 5;
		System.out.println(strsub(s1,s2,a));
		}
	

}

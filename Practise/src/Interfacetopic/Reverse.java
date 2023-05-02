package Interfacetopic;

public class Reverse {
	public static void main(String args[])
	{
		String s1 = "Hoga beda hudugi nanna bittu";
		String s2[] =s1.split(" ");
		String rev ="";
		for (int i=s2.length-1; i>=0; i--)
		{
			String s3 = s2[i];
			String s4 = " ";
			for (int j= s3.length()-1; j>= 0; j--)
			{
				s4 = s4 + s3.charAt(j);
				
			}
			rev = rev + s4 +" ";
		}
		System.out.println(rev);
		
	}

}

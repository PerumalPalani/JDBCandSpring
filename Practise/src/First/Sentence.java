package First;

import java.util.Scanner;
public class Sentence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s1 = sc.nextLine(); //dynamic input of string 
		sc.close();
		String s2[] =s1.split(" "); // split the words
		String rev = "";
		for (int i = s2.length-1; i>=0; i--)
		{
			String word = s2[i];
			String rewords = " ";
			for (int j = word.length()-1; j>=0; j--)
			{
				rewords = rewords + word.charAt(j);
			}
			rev+= rewords+"";			
		}
		System.out.println(rev);
		
	}
	

}

package testcasesorowntry;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Hacker01 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the data");
		int a = s.nextInt();
		for (int i=1; i<=a; i++){
			System.out.println("Enter the number of rows");
			int b = s.nextInt();
			System.out.println("Enter the number of columns");
			int c = s.nextInt();
			String data[] = getStringArray(c);
			border(data);			
		}
	}
	public static String[] getStringArray(int n)
		{
			String data[] = new String[n];
			for(int i = 0; i<data.length; i++){
				System.out.print("Enter the data");
				data[i]=s.next();
			}
			return data;
		}
	public static void border(String d[]){
		int max = 0;
		for(int i =0; i<d.length; i++){
			String temp = d[i];
			temp =temp.replace('.',' ');
			temp =temp.trim();
			if(max <temp.length()){
				max = temp.length();
//				char[] c = s.next().toCharArray();
			}
		}
		System.out.println("Maximum length of cells :"+max);
	}
	

}

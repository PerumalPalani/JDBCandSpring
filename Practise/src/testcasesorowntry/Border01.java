package testcasesorowntry;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Border01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of records");
		int t = s.nextInt();
		for (int i = 1; i <= t; i++) {
			System.out.println("Enter the number of rows");
			int n = s.nextInt();
			System.out.println("Enter the number of columns");
			int m = s.nextInt();
			String[] name = new String[m];
			int max = 0;
			for (int j = 0; j < name.length; j++) {
				System.out.println("Enter the values");
				name[j] = s.next();
				String temp = name[j];
				temp = temp.replace('.',' ');
				temp = temp.trim();
				if(max < temp.length()){
					max = temp.length();
				}
			}
//			for (int l = 0; l < name.length; l++) {
//				
//			}
			System.out.println(max);

		}

	}

}

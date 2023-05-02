package bufferzero;

import java.util.Scanner;

public class Factorsofnum {
	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int a = s.nextInt();
			for(int i = 1; i<=a; i++){
				if(a % i == 0){
					System.out.print (i+" ");
				}
				
			}				

	}

}

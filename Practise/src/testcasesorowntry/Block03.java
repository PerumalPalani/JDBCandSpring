package testcasesorowntry;
import java.util.Scanner;

public class Block03 {
	public static void main(String[] args) {
		
	
	Scanner s = new Scanner(System.in);
    System.out.println("Enter the num of problems");
    int t = s.nextInt();
    for(int i = 1; i<=t; i++){
        System.out.println("Enter the number of rows");
        int n = s.nextInt();
        System.out.println("Enter the number of columns");
        int m = s.nextInt();
        String name[] = new String[m];
        int max = 0;
        for(int j = 0; j < name.length; j++){                
                name[j] = s.next(); 
                String temp = null;
                temp = name[j];
                temp = temp.replace('.',' ');
                temp = temp.trim();
                if(max < temp.length()){
                max = temp.length();
            }           
        }        
        
        System.out.println(max);
    }
}
}


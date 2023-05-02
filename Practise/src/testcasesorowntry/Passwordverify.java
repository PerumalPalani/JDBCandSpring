package testcasesorowntry;
import java.util.Scanner;
public class Passwordverify {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "AbCDE68@$#";
		int[] n = new int[127];
		for(int i= 0; i<str.length(); i++){
			char ch = str.charAt(i);
			n[ch]++;			
		}
		for(int i=0; i<n.length; i++){
			if(n.length >= 8 ){
			if(((n[i] >= 65)||(n[i]<=90))&&((n[i]>=97)||(n[i]<=122))&&((n[i]>=48)||(n[i]<=57))){
				if(str.endsWith("#")){
					System.out.println("It is a good password");
					
				}
				else{
					System.out.println("It is worng password");
				}
				
			}
		}
			else{
				System.out.println("It is invalid password");
			}
		}
		
		
	
	}
	
	

}

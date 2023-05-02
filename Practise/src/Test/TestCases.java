package Test;
import java.util.*;

public class TestCases {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        // Write your code here
        System.out.println("Enter the no of test cases: ");
        int T = s.nextInt();
        while(T != 0){
            System.out.println("Enter the no of string length: ");
        int N = s.nextInt();
        System.out.println("Enter the no of iteraton: ");
        int K = s.nextInt();
        System.out.println("Enter the string: ");
        String A = s.next();
        String B = A;
        System.out.println(B);
        int i = 0;
        	while( i< 100){
        		if(i > 1 && A.equals(B)){
        			System.out.println((i-1)+i);
        			break;
        		}
        			String str1 = null, str2 = null;      		
        			B = B.substring(1) + B.substring(0, 1);        		
        		i++;
            	}
        T = T-1;
        }
        }	
    }





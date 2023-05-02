package testcasesorowntry;
import java.util.*;

public class Testcases02 {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        System.out.println("Enter the array size");
        N = s.nextInt();        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
        	System.out.println("Enter the array values");
            data[i] = s.nextInt();
        }
        int num = 0;        
        for(int j = 0; j < data.length; j++){
            if(data[data.length - 1] != 0)
            num = data[data.length - 1];
            }
            String ans = null;
            if(num % 10 == 0)
            {
                ans = "Yes";
            }
            else{
                ans = "No";
            }         
        
        System.out.println(ans);
    }
}


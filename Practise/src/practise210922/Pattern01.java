package practise210922;

public class Pattern01 {
	public static void main(String[] args) {
		for(int i = 4; i>=1; i--)
		{
			for(int j = 4; j>=1; j--){
				if(i>=j){
					System.out.print("*");
				}
				else{
				System.out.print(" ");
				}				
			}
			System.out.println();
			
		}
	}

}

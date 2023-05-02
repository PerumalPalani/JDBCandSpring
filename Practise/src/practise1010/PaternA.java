package practise1010;

public class PaternA {
	public static void main(String[] args) {
		int n = 7;
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=n; j++ ){
				if((j==1 && i>=5)||(j+i== n-2)||(i==4)||j-i==n-4||(j==n && i>=5)){
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

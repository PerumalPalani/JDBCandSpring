package program.patterns;

public class Apple {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(i==1 || j==1)
				{
					System.out.print("1");
				}
				else{
					System.out.print(i);
					
				}				
			}
			System.out.println();
		}
	}

}

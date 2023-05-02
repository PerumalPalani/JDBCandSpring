package testcasesorowntry;

public class Insertionsrt {
	public static void main(String[] args) {
		int[] a = {4,3,5,1,6};
		for(int i =1; i<a.length; i++)
		{
			int temp = a[i];
			for(int j=i-1; j>=0 && temp < a[j]; j--)
			{
				a[j+1] = a[j];
				a[j] = temp;
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.print(a[k]);
		}
	}

}

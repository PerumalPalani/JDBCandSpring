package mock02;

public class Sample {
	public static void main(String[] args) {
		int a[] = {8,6,4,3,8,2};
		for(int i = 0; i<a.length; i++)
		{
			for(int j=0; j<a.length-1; j++)
			{
				if(a[j]>a[j+1])
				{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				}
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.print(a[k]);
		}
		
	}

}

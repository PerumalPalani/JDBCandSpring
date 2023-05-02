package Interfacetopic;

public class Minimum {
	public static void main(String args[])
	{
		int a[] = {9, 4, 2, 5, 1, 7, 8};
		int max = a[0];
		int min = a[0];
		for(int i=1; i<a.length-1; i++)
		{
			if(max <a[i])
			{
				max = a[i];
			}
			else if(min > a[i])
			{
				min = a[i];
			}			
			
		}
		System.out.println(max);
		System.out.println(min);
	}

}

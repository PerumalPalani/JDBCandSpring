package Interfacetopic;

public class Bubble {
	public static void main(String args[]){
		int a[] = {7, 8, 4, 9, 2, 6, 5, 1, 15};
		int temp = 0;
		for (int i = 0; i<a.length; i++)
		{
			for(int j = 0; j< a.length-1; j++){
				if (a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int k=0; k<a.length; k++)
		{
			System.out.println(a[k]);
		}
	}

}

package testcasesorowntry;

import java.util.Arrays;

public class MaxGross {
		static int count_Triplets(int[] a, int n){
			int count = 0;
			Arrays.sort(a);
			for(int i = 0; i<n; i++)
			{
				for(int j=i+1; j<n; j++)
				{
					for(int k = j+1; k<n; k++)
					{
						if(a[i]+a[j] ==a[k])
						{
							count++;
						}
					}
				}
			}
			return count;
		}
		
	public static void main(String[] args) {
		int[] a = {-5,3,9,4};
		int n = 4;
		System.out.println(count_Triplets(a,n));
	}

}



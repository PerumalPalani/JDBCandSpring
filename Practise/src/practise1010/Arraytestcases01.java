package practise1010;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraytestcases01 {
	public static void main(String[] args) {
		Object arr[] = {"abc", new Integer(1),new Integer(8),new Integer(5),'c',new Integer(10),new Integer(10)};
		int l = 0;
		int arr1[] = new int[l];
		for(int i = 0; i<arr.length; i++){
			int x = (int)Array.get(arr, 5);
			System.out.println(x);
			l++;
		}
		System.out.println(Arrays.toString(arr1));
	}

}

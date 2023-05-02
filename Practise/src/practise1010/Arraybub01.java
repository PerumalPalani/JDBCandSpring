package practise1010;

import java.util.Arrays;

public class Arraybub01 {
	public void add(int arr[]){
		int brr[] = {11, 12, 13, 14};
		int crr[] = new int[arr.length+brr.length];
		for(int i = 0; i<arr.length; i++){
			crr[i] = arr[i];
		}
		for(int i = 0; i<brr.length; i++){
			crr[i+arr.length]=brr[i];
		}
		System.out.println(Arrays.toString(crr));
	}
	public void remove(int pos, int arr[]){
		int l = 0;
		for(int i = 0; i<arr.length; i++){
			if(i == pos){
				continue;
			}
			else{
				arr[l] = arr[i];
				l++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public void add(int ele, int pos, int arr[]){
		int l = 0;
		for(int i = 0; i<arr.length; i++){
			if(i == pos){
				arr[l] = ele;
				l++;
			}
			else{
				arr[l] = arr[i];
				l++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {9,7,3,2,1,5,8,4,0,6};
		int n = arr.length;
		for(int i =0; i<n; i++){
			for(int j = 0; j< n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.print(arr[i]+" ");
		}
		Arraybub01 a = new Arraybub01();
		a.add(arr);
		a.remove(4, arr);
		a.add(10, 9, arr);
		
		
	}

}

package recurssiontopic.datastructure;

import java.util.Scanner;

class CreateArray {
	int[] arr = null;

	public CreateArray(int sizeof) {
		arr = new int[sizeof];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE; 
		}
	}

	void insert(int place, int value) {
		try{
			if(arr[place] == Integer.MIN_VALUE){
				arr[place] = value;
				System.out.println("Succesffully inserted");
			}
			else{
				System.out.println("The cell is not empty");
			}
		}
		catch(Exception e){
			System.out.println("Invalid space");
		}

	}
	public void search(int index){
		for(int i = 0; i<arr.length; i++){
			if(i == index){
				System.out.println("The value is "+arr[i]);
			}
		}
	}
	public void searchIndex(int value){
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == value){
				System.out.println("The value is "+i);
			}
		}
	}
}

public class SingleDimenson {
	public static void main(String[] args) {
		CreateArray c = new CreateArray(6);
		c.insert(0, 1);
		c.insert(1, 2);
		c.insert(2, 3);
		c.insert(3, 4);
		c.insert(4, 5);
		c.insert(5, 6);
		c.search(4);
		c.searchIndex(5);

	}

}

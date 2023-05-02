package recurssiontopic;

public class Array2d {
	int array[] = null;
	public Array2d(int sizeof){
	
			array = new int[sizeof];
			for(int i = 0; i<array.length; i++){
				array[i] = Integer.MIN_VALUE;
			}
			System.out.println("Array successfully created");
	}
	public void insertarray(int loc, int value)
	{
		try{
			if(array[loc] == Integer.MIN_VALUE){
				array[loc] = value;
				System.out.println("Successfully inserted");
			}
			else{
				System.out.println("Cell is not empty");
			}		
		}
		catch(Exception e){
			System.out.println("Invalid space");
		}
	}
	public static void main(String[] args) {
		Array2d a = new Array2d(5);
		a.insertarray(0, 29);
		a.insertarray(1, 40);
		a.insertarray(2, 50);
		a.insertarray(3, 90);
		a.insertarray(4, 100);	
	}

}

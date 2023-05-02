package exceptiohandling;

public class Demo2 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		System.out.println("***Main Starts***");
		try{
			System.out.println(a[9]);			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught...");
		}
		System.out.println("***Main Ends***");
	}

}

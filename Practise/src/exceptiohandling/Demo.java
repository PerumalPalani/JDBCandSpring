package exceptiohandling;

public class Demo {
	public static void main(String[] args) {
		System.out.println("***Main Starts****");
		try{
			int a = 1/0;
		}
		catch(ArithmeticException e){
			System.out.println("Handled..");
		}
		System.out.println("****Main Ends****");
	}

}

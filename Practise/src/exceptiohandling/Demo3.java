package exceptiohandling;

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("***Main Starts***");
		Demo3 d3= null;
		try{
			System.out.println(d3.hashCode());			
		}
		catch(NullPointerException e)
		{
			System.out.println("Take care!");
		}		
		System.out.println("***Main Ends***");
		
	}

}

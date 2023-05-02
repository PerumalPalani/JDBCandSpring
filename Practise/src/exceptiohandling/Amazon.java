package exceptiohandling;
class DeliveryException extends Exception
{
	String msg;
	DeliveryException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}
public class Amazon {
	static void choose() throws DeliveryException
	{
		int value = 10;
		if (value >= 100){
			System.out.println("It is eligiable product to deliver");
		}
		else{
			throw new DeliveryException("It is not eligiable to deliver the product");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("***Main Starts***");
		try {
			choose();
		} catch (DeliveryException e) {
			System.out.println(e.msg);
		}
		System.out.println("***Main ends***");
		
	}

}

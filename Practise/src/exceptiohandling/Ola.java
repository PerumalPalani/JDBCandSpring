package exceptiohandling;
class RiddingException extends Exception
{
	String msg;
	RiddingException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

public class Ola {
	static void book() throws RiddingException
	{
		int r_min = 12;
		if(r_min >= 25)
		{
			System.out.println("It is allowed to ride");
		}
		else{
			throw new RiddingException("It is not eligiable to ride");
		}
	}
	public static void main(String[] args) {
		System.out.println("***Main Starts***");
		try {
			book();
		} catch (RiddingException e) {
			System.out.println(e.msg);
		}
		System.out.println("***Main Ends***");
		
	}

}

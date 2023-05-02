package exceptiohandling;
class DeliverableException extends Exception
{
	String msg;
	DeliverableException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

public class Pizza {
	static void delivery() throws DeliverableException
	{
		int t_min = 50;
		if(t_min<=30)
		{
			System.out.println("On time delivered");
		}
		else
		{
			throw new DeliverableException("It is too late");
		}
	}
	public static void main(String[] args) {
		System.out.println("***Main starts***");
		try {
			delivery();
		} catch (DeliverableException e) {
			System.out.println(e.msg);
		}
		System.out.println("***Main ends***");
	}

}

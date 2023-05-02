package exceptiohandling;
class AcceptException extends Exception
{
	String msg;
	AcceptException(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

public class Delicius {
	static void order() throws AcceptException
	{
		int amt = 100;
		if(amt >= 500)
		{
			System.out.println("It is good order");
		}
		else{
			throw new AcceptException("It is less order");
		}
	}
	public static void main(String[] args) {
		System.out.println("***Main starts***");
		try {
			order();
		} catch (AcceptException e) {
			System.out.println(e.msg);
		}
		System.out.println("***Main ends***");
	}

}

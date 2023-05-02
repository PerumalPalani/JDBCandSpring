package exceptiohandling;
class VoterIndian extends Exception
{
	String msg;
	VoterIndian(String msg)
	{
		this.msg = msg;
	}
	public String getMessage()
	{
		return msg;
	}

}

public class Voter {
	static void vote() throws VoterIndian
	{
		int age = 14;
		if(age >=18)
		{
			System.out.println("Eligiable for vote");
		}
		else{
			throw new VoterIndian("Not eligiable to vote");
		}
	}
	public static void main(String[] args) {
		System.out.println("***Main Strats***");
		try {
			vote();
		} catch (VoterIndian e) {
			System.out.println(e.msg);
			
		}
		System.out.println("***Main Ends***");
	}

}

package testcases;

public class Testcase04 {
	public static boolean monkey(boolean aSmile, boolean bSmile){
		//if(aSmile == bSmile)
		if((aSmile == true && bSmile == true)|| (aSmile == false && bSmile == false))
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[])
	{
		System.out.println(monkey(true, true));
		System.out.println(monkey(false, false));
		System.out.println(monkey(true, false));
		System.out.println(monkey(false, true));
		
	}
	

}

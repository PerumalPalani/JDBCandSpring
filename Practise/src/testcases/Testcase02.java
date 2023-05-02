package testcases;

public class Testcase02 {
	public static void main(String args[]){
		System.out.println(monkey(true, true));
		System.out.println(monkey(false, false));
		System.out.println(monkey(true, false));
		System.out.println(monkey(false, true));		
	}
	public static boolean monkey(boolean aSmile, boolean bSmile){
		if((aSmile == true) ^ (bSmile == false)){
			return true;
		}
			else{
				return false;
				}
	}

}

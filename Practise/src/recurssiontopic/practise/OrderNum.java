package recurssiontopic.practise;

public class OrderNum {
	public static void order(int num){
		if(num <1){
		System.out.println("number is 1 to 10 :");	
		}
		else{
			order(num-1);
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		order(10);
		
	}

}

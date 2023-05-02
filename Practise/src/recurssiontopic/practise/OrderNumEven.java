package recurssiontopic.practise;

public class OrderNumEven {
	public void order(int num){
		if(num<1){
			System.out.println("Even number is:");
		}
		else{
			order(num-1);
			if(num % 2 == 0)
				System.out.println(num);
		}
	}
	public static void main(String[] args) {
		OrderNumEven o = new OrderNumEven();
		o.order(10);
	}

}

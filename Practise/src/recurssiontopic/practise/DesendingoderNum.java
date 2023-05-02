package recurssiontopic.practise;

public class DesendingoderNum {
	public static void dorder(int num){
		if(num > 10){
			System.out.println("Desending order number is:");
		}
		else{
			dorder(num+1);
			if(num%2 == 0)
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		dorder(1);
	}

}

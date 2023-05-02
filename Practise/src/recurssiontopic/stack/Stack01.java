package recurssiontopic.stack;

public class Stack01 {
	int arr[];
	int top;
	public Stack01(int size){
		this.arr = new int[size];
		this.top = -1;
		System.out.println("Stack is empty");
	}
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isFull(){
		if(top == arr.length -1){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		Stack01 s = new Stack01(5);
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
	}

}

package recurssiontopic;

class SingleArr {
	int[] array = null;

	public SingleArr(int n) {
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.MIN_VALUE;
		}
	}

	public void insertval(int in, int val) {
		try {
			if (array[in] == Integer.MIN_VALUE) {
				array[in] = val;
				System.out.println("the value is successfully inserted");
			} else {
				System.out.println("This cell is already occupied");
			}
		} catch (Exception e) {
			System.out.println("Insufficiant space");
		}
	}
}

public class Main05 {
	public static void main(String[] args) {
		SingleArr s = new SingleArr(10);
		s.insertval(0, 1);
		s.insertval(1, 2);
		s.insertval(2, 3);
		s.insertval(1, 4);
		s.insertval(3, 5);
		s.insertval(11, 30);
	}
}

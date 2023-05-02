package recurssiontopic.datastructure;

class Twodimen {
	int arr[][] = null;

	public Twodimen(int row, int col) {
		arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	public void insert(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Value Successfully inserted");
			} else {
				System.out.println("Already exist in index");
			}
		} catch (Exception e) {
			System.out.println("it is invalid index");

		}
	}

	public void searching(int value) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == value) {
					System.out.println("The searching array of" + i + " " + j + " " + value);
				}
			}
		}
	}
	public void deleting (int row, int col){
		try{
			System.out.println("the index of "+ arr[row][col]+" is deleted");
			arr[row][col] = Integer.MIN_VALUE;
		}
		catch(Exception e){
			System.out.println("It is out of index");
		}
	}
}

public class TwoDimension {
	public static void main(String[] args) {
		Twodimen t = new Twodimen(3, 3);
		t.insert(0, 0, 1);
		t.insert(0, 1, 2);
		t.insert(0, 2, 3);
		t.insert(1, 0, 4);
		t.insert(1, 1, 5);
		t.insert(1, 2, 6);
		t.insert(2, 0, 7);
		t.insert(2, 1, 8);
		t.insert(2, 2, 9);
		t.insert(3, 2, 40);
		t.insert(1, 1, 30);
		t.searching(8);
		t.searching(11);
		t.searching(5);
		t.deleting(1, 1);
		t.deleting(3, 3);
	}

}

package recurssiontopic.datastructure;
import java.util.Arrays;
public class TwoDimentional {
	public static void main(String[] args) {
		TwodimenCreation t = new TwodimenCreation(3,4);
		
	}

}
class TwodimenCreation{
	int arr[][] = null;
	public TwodimenCreation(int row, int col){
		arr = new int[row][col];
		for(int r = 0; r<arr.length; r++){
			for(int c = 0; c<arr.length; c++){
				arr[r][c] = Integer.MIN_VALUE;
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	
	
}

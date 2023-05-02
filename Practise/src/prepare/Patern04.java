package prepare;

public class Patern04 {
	public static void pattern(int n) {
		int i, j;
		int mid = 0;
		if (n % 2 == 1) {
			n++;
			mid = n/2;
		}
		// upper half position
		for (i = 1; i <= mid; i++) {
			for (j = 1; j <= mid - i; j++) {
				System.out.print(" ");
				if (i == 1) {
					System.out.print("-");
				} else if (j == 1) {
					System.out.print("*");
				} else {
					System.out.print("*");
				}
			}
			if (i == 1) {
				System.out.print("*");
			} else {
				System.out.print("*"); // each line start from star

				for (j = 1; j <= 2 * i - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			for (j = 1; j < mid - 1; j++) {
				if (i == 1) {
					System.out.print("-");
				} else if (j == mid - 1) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
		// lower half position
		for (i = mid + 1; i < n; i++) {
			for (j = 1; j <= i - mid; j++) {
				if (i == n - 1) {
					System.out.print("-");
				} else if (j == 1) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			if (i == n - 1) {
				System.out.print("*");
			} else {
				System.out.print("*"); // each line start from star

				for (j = 1; j <= 2 * (n - i) - 3; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			for (j = 1; j < i - mid; j++) {
				if (i == n - 1) {
					System.out.print("-");
				} else if (j == i - mid) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
	}
	//main method
	public static void main(String args[])
	{
		int n = 12;
		pattern(n);
		
		
	}
}

package Test;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestCase02 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Write your code here
		int T = br.read();
		while (T != 0) {
			int N = br.read();
			int A[] = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = br.read();
			}
			System.out.println(((A[1] & A[2]) ^ (A[1] | A[2])));
			T = T - 1;
		}

	}

}

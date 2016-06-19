package sequences;

import java.util.Arrays;

public class Fibonacci {
	
	static Integer[] fib(int n) {
		Integer[] arr = new Integer[n + 1];
		
		if (n >= 0) {
			arr[0] = 0;
		}
		if (n >= 1) {
			arr[1] = 1;
		}
		
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(fib(20)));
		System.out.println(Arrays.deepToString(fib(27)));
		System.out.println(Arrays.deepToString(fib(32)));
	}

}
